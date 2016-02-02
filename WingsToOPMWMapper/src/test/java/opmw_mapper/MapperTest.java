/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package opmw_mapper;

import java.io.File;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Daniel Garijo
 */
public class MapperTest {
    
    /**
     * Test of transformWINGSElaboratedTemplateToOPM method, of class Mapper.
     */
    @Test
    public void testTransformWINGSElaboratedTemplateToOPM() {
        System.out.println("Transform a template to OPMW and PROV ");
        String template = "src\\main\\java\\sample_data\\new\\abs_words\\template.owl";
        String mode = "RDF/XML";
        String outFile = "testTemplate";
        Mapper instance = new Mapper();
        //template with abstract nodes: abstractWords
        System.out.println("Transforming an abstract template...");
        assertNotSame("",instance.transformWINGSElaboratedTemplateToOPMW(template, mode, outFile));
        //template with collections
        System.out.println("Transforming a template with collections");
        template = "src\\main\\java\\sample_data\\new\\aquaflow_ntm\\Template.owl";
        assertNotSame("",instance.transformWINGSElaboratedTemplateToOPMW(template, mode, outFile));
        //delete output files.
        File f = new File(outFile);
        f.delete();
    }
    
//    @Test
    public void testtransformWINGSResultsToOPMW(){
        System.out.println("Transform an execution to OPMW and PROV ");
        Mapper instance = new Mapper();
        String lib = "src\\main\\java\\sample_data\\new\\abs_words\\Library.owl";
        String execution = "src\\main\\java\\sample_data\\new\\abs_words\\Execution.owl";
        String mode = "RDF/XML";
        String outFileOPMW = "testResult";
        String outFilePROV = "testResult2";        
        //template with abstract nodes:
        System.out.println("Transforming an execution of an abstract template...");
        assertNotSame("",instance.transformWINGSResultsToOPMW(execution, lib, mode, outFileOPMW, outFilePROV));
        //template with collections
        System.out.println("Transforming an execution of a template with collections...");
        lib="src\\main\\java\\sample_data\\new\\aquaflow_ntm\\Library.owl";
        execution="src\\main\\java\\sample_data\\new\\aquaflow_ntm\\Execution.owl";
        assertNotSame("",instance.transformWINGSResultsToOPMW(execution, lib, mode, outFileOPMW, outFilePROV));
        //delete output files
        File f = new File(outFileOPMW);
        File f2 = new File(outFilePROV);
        f.delete();
        f2.delete();
    }
    
}
