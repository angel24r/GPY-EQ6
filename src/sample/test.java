package sample;

import weka.core.DenseInstance;
import weka.core.Instance;
import weka.core.Instances;
import weka.core.converters.ConverterUtils;

import java.io.File;

public class test extends libWeka {
    Instances data;
    libWeka objObe;


    public void cargarInstancias() throws Exception {
        File file = new File("mamografia-datos.arff");
        ConverterUtils.DataSource source = new ConverterUtils.DataSource(file.getAbsolutePath());
        data = source.getDataSet();
        data.setClassIndex(data.numAttributes() - 1);
        System.out.println(data.numInstances() + " instancias cargadas.");
        System.out.println(data.toString());
        objObe = new libWeka();
        objObe.buildClassifier(data);
        Instance instance = new DenseInstance(6);
        instance.setDataset(data);
        instance.setValue(0, 1); //Genero
        instance.setValue(1, 67);//Edad
        instance.setValue(2, 1);//Familiar con sobrepeso
        instance.setValue(3, 2);//Comidas con altas cantidad de calorias
        instance.setValue(4, 3);//Consumo de vegetales
        instance.setValue(5, "malignant");//Comidas principales
        double result = objObe.classifyInstance(instance);
        int resultFinal = (int)result;
        System.out.println("pito");
    }
}
