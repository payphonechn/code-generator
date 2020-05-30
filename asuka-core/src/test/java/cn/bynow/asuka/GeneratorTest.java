//package cn.bynow.asuka;
//
//import cn.org.rapid_framework.generator.GeneratorFacade;
//import cn.org.rapid_framework.generator.GeneratorProperties;
//import org.junit.After;
//import org.junit.Assert;
//import org.junit.Before;
//import org.junit.Test;
//
//import java.io.File;
//
//public class GeneratorTest {
//
//    private GeneratorFacade generator;
//
//    /**
//     * 模板路径
//     */
//    private static final String TEMPLATE = "src/main/resources/template";
//
//    @Before
//    public void setUp() throws Exception {
//        generator = new GeneratorFacade();
//        generator.getGenerator().setTemplateRootDir(TEMPLATE);
//        generator.deleteOutRootDir();
//
//        File file = new File(TEMPLATE);
//        if (!file.exists() || !file.isDirectory()) {
//            Assert.fail("模板文件夹不存在");
//        }
//    }
//
//    @After
//    public void tearDown() throws Exception {
//        generator = null;
//        String outRoot = GeneratorProperties.getRequiredProperty("outRoot");
//        outRoot += "/java_src/";
//        String basePackage = GeneratorProperties.getRequiredProperty("basepackage").replace(".", "/");
//        Runtime.getRuntime().exec("cmd.exe /c start " + outRoot + basePackage);
//    }
//
//    /**
//     * 生成单表, 参数为表名
//     *
//     * @throws Exception 异常
//     */
//    @Test
//    public void testSingleTableGenerator() throws Exception {
//        generator.generateByTable("sys_user");
//    }
//
//}
