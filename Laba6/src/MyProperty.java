import java.io.*;
import java.util.*;

public class MyProperty  {

    private String _filepath;

    Properties props = new Properties();

    Map<String, String> propsMap ;

    public MyProperty(String filePath) throws IOException {

        _filepath = filePath;
        FileReader reader =new FileReader(_filepath);
        props.load(reader);
        reader.close();

    }

    public String SearchProperty(String keyProp)
    {
        String result = props.getProperty(keyProp);

        return result;
    }

    public void UpdateProperty(String key, String value) throws IOException {
        props.setProperty(key,value);
        File propFile = new File(_filepath);
        OutputStream outputStream = new FileOutputStream(propFile);
        props.store(outputStream,"Test");
        System.out.println("Свойство успешно добавлено!");
    }

    public void propsPrint()
    {
        System.out.println("Свойства находящаяси в файле:");
        propsMap = new HashMap(props);
        propsMap.forEach((k,v) -> System.out.println(k + " - " + v));
    }

}
