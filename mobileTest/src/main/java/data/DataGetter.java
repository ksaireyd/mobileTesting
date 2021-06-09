package data;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;

public class DataGetter {
    private NodeList nList;

    public DataGetter(String file) {
        try {
            File fXmlFile = new File(file);
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(fXmlFile);

            this.nList = doc.getElementsByTagName("letter");}
        catch (Exception e  ){
            e.printStackTrace();
        }

    }
    public Element getLetter(int num){
        return (Element) this.nList.item(num);
    }
    public String getAttr(Element letter,String attr){
        return letter.getElementsByTagName(attr).item(0).getTextContent();
    }
}