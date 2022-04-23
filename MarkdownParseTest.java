import static org.junit.Assert.*;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

import org.junit.*;
public class MarkdownParseTest{
    @Test
    public void addition() {
        assertEquals(2, 1 + 1);
    }

    @Test
    public void checkLinks1() throws IOException{
        Path path = Path.of("C:/Users/Elvis Joa/OneDrive/Documents/GitHub/markdown-parser/test-file.md");
        List<String> links = MarkdownParse.getLinks(Files.readString(path));
        assertEquals(List.of("https://something.com", "some-thing.html"), links);
    }

    @Test
    public void checkLinks2() throws IOException{
        Path path = Path.of("C:/Users/Elvis Joa/OneDrive/Documents/GitHub/markdown-parser/parenthesis-test.md");
        assertEquals(List.of(), MarkdownParse.getLinks(Files.readString(path)));
    }
    @Test
    public void checkLinks3() throws IOException{
        Path path = Path.of("C:/Users/Elvis Joa/OneDrive/Documents/GitHub/markdown-parser/brackets-test.md");
        assertEquals(List.of(), MarkdownParse.getLinks(Files.readString(path)));
    }
    @Test
    public void checkLinks4() throws IOException{
        Path path = Path.of("C:/Users/Elvis Joa/OneDrive/Documents/GitHub/markdown-parser/brackets-test.md");
        assertEquals(List.of(), MarkdownParse.getLinks(Files.readString(path)));
    }
}
