
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;
import java.io.IOException;

public class JsonReader {
    public static void main(String[] args) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            // 读取本地JSON文件
            JsonNode rootNode = mapper.readTree(new File("data.json"));
            System.out.println("读取到的JSON内容:");
            System.out.println(rootNode.toPrettyString());
        } catch (IOException e) {
            System.err.println("读取JSON文件时发生错误: " + e.getMessage());
        }
    }
}
