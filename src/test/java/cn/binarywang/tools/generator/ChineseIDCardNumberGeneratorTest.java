package cn.binarywang.tools.generator;

import static org.testng.Assert.assertNotNull;

import java.util.Date;

import cn.binarywang.tools.generator.base.GenericGenerator;
import org.testng.annotations.Test;

public class ChineseIDCardNumberGeneratorTest {

    @Test
    public void generateRandomDate() {
        Date randomDate = ChineseIDCardNumberGenerator.randomDate();
        System.err.println(randomDate);
        assertNotNull(randomDate);
    }

    @Test
    public void testGenerate() {
        ChineseNameGenerator nameGenerator = ChineseNameGenerator.getInstance();
        GenericGenerator idCardGenerator = ChineseIDCardNumberGenerator.getInstance();
        for (int i = 0; i < 100; i++) {
            String name = nameGenerator.generate();
            String idCard = idCardGenerator.generate();
            System.out.println(name + ", " + idCard);
        }
    }

    @Test
    public void testGenerateIssueOrg() {
        String issueOrg = ChineseIDCardNumberGenerator.generateIssueOrg();
        System.err.println(issueOrg);
        assertNotNull(issueOrg);
    }

    @Test
    public void testGenerateValidPeriod() {
        String result = ChineseIDCardNumberGenerator.generateValidPeriod();
        System.err.println(result);
        assertNotNull(result);
    }

}
