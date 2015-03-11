
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import com.blogspot.na5cent.resourcelocal.model.Employee;
import com.blogspot.na5cent.resourcelocal.repo.EmployeeRepo;
import java.util.Date;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import static org.testng.Assert.*;
import org.testng.annotations.Test;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author GAME
 */
@ContextConfiguration(locations = {
    "/spring/applicationContext.xml",
    "/spring/applicationContext-eclipseLink.xml"
})
public class LocationT extends AbstractTestNGSpringContentextTests {
    @Autowired
    private LocationRepo repo;
    
    @Test
    public void findById() {
        Locations location = repo.findOne(1000);
        Assert.assertEquals(location.getPostalcode(), "00989");
    }
}
