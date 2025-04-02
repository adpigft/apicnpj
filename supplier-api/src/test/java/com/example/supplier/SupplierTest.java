import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class SupplierTest {

    private Supplier createSupplier() {
        Supplier supplier = new Supplier();
        supplier.setId(1L);
        supplier.setNome("Supplier Name");
        supplier.setCnpj(12345678901234L);
        supplier.setNomeContato("Contact Name");
        supplier.setEmailContato("contact@example.com");
        supplier.setTelefoneContato("1234567890");
        return supplier;
    }

    @Test
    public void supplier_GetId_ShouldReturnId() {
        Supplier supplier = createSupplier();
        assertEquals(1L, supplier.getId(), "Supplier ID should be 1");
    }

    @Test
    public void supplier_SetId_ShouldSetId() {
        Supplier supplier = new Supplier();
        supplier.setId(2L);
        assertEquals(2L, supplier.getId(), "Supplier ID should be 2");
    }

    @Test
    public void supplier_GetNome_ShouldReturnNome() {
        Supplier supplier = createSupplier();
        assertEquals("Supplier Name", supplier.getNome(), "Supplier name should be 'Supplier Name'");
    }

    @Test
    public void supplier_SetNome_ShouldSetNome() {
        Supplier supplier = new Supplier();
        supplier.setNome("New Supplier Name");
        assertEquals("New Supplier Name", supplier.getNome(), "Supplier name should be 'New Supplier Name'");
    }

    @Test
    public void supplier_GetCnpj_ShouldReturnCnpj() {
        Supplier supplier = createSupplier();
        assertEquals(12345678901234L, supplier.getCnpj(), "Supplier CNPJ should be 12345678901234");
    }

    @Test
    public void supplier_SetCnpj_ShouldSetCnpj() {
        Supplier supplier = new Supplier();
        supplier.setCnpj(98765432109876L);
        assertEquals(98765432109876L, supplier.getCnpj(), "Supplier CNPJ should be 98765432109876");
    }

    @Test
    public void supplier_GetNomeContato_ShouldReturnNomeContato() {
        Supplier supplier = createSupplier();
        assertEquals("Contact Name", supplier.getNomeContato(), "Supplier contact name should be 'Contact Name'");
    }

    @Test
    public void supplier_SetNomeContato_ShouldSetNomeContato() {
        Supplier supplier = new Supplier();
        supplier.setNomeContato("New Contact Name");
        assertEquals("New Contact Name", supplier.getNomeContato(), "Supplier contact name should be 'New Contact Name'");
    }

    @Test
    public void supplier_GetEmailContato_ShouldReturnEmailContato() {
        Supplier supplier = createSupplier();
        assertEquals("contact@example.com", supplier.getEmailContato(), "Supplier contact email should be 'contact@example.com'");
    }

    @Test
    public void supplier_SetEmailContato_ShouldSetEmailContato() {
        Supplier supplier = new Supplier();
        supplier.setEmailContato("newcontact@example.com");
        assertEquals("newcontact@example.com", supplier.getEmailContato(), "Supplier contact email should be 'newcontact@example.com'");
    }

    @Test
    public void supplier_GetTelefoneContato_ShouldReturnTelefoneContato() {
        Supplier supplier = createSupplier();
        assertEquals("1234567890", supplier.getTelefoneContato(), "Supplier contact phone should be '1234567890'");
    }

    @Test
    public void supplier_SetTelefoneContato_ShouldSetTelefoneContato() {
        Supplier supplier = new Supplier();
        supplier.setTelefoneContato("0987654321");
        assertEquals("0987654321", supplier.getTelefoneContato(), "Supplier contact phone should be '0987654321'");
    }
}
