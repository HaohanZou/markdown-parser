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
    public void checkAllLinks() throws IOException{
        Path file1 = Path.of("C:/Users/Elvis Joa/OneDrive/Documents/GitHub/markdown-parser/test-file.md");
        Path file2 = Path.of("C:/Users/Elvis Joa/OneDrive/Documents/GitHub/markdown-parser/test-file2.md");
        Path file3 = Path.of("C:/Users/Elvis Joa/OneDrive/Documents/GitHub/markdown-parser/test-file3.md");
        Path file4 = Path.of("C:/Users/Elvis Joa/OneDrive/Documents/GitHub/markdown-parser/test-file4.md");
        Path file5 = Path.of("C:/Users/Elvis Joa/OneDrive/Documents/GitHub/markdown-parser/test-file5.md");
        Path file6 = Path.of("C:/Users/Elvis Joa/OneDrive/Documents/GitHub/markdown-parser/test-file6.md");
        Path file7 = Path.of("C:/Users/Elvis Joa/OneDrive/Documents/GitHub/markdown-parser/test-file7.md");
        Path file8 = Path.of("C:/Users/Elvis Joa/OneDrive/Documents/GitHub/markdown-parser/test-file8.md");

        System.out.println("test-file.md: " + MarkdownParse.getLinks(Files.readString(file1)));
        System.out.println("test-file2.md: " + MarkdownParse.getLinks(Files.readString(file2)));
        System.out.println("test-file3.md: " + MarkdownParse.getLinks(Files.readString(file3)));
        System.out.println("test-file4.md: " + MarkdownParse.getLinks(Files.readString(file4)));
        System.out.println("test-file5.md: " + MarkdownParse.getLinks(Files.readString(file5)));
        System.out.println("test-file6.md: " + MarkdownParse.getLinks(Files.readString(file6)));
        System.out.println("test-file7.md: " + MarkdownParse.getLinks(Files.readString(file7)));
        System.out.println("test-file8.md: " + MarkdownParse.getLinks(Files.readString(file8)));

        assertEquals(List.of("https://something.com", "some-thing.html"), MarkdownParse.getLinks(Files.readString(file1)));
        assertEquals(List.of("https://something.com", "some-page.html"), MarkdownParse.getLinks(Files.readString(file2)));
        assertEquals(List.of(), MarkdownParse.getLinks(Files.readString(file3)));
        assertEquals(List.of(), MarkdownParse.getLinks(Files.readString(file4)));
        assertEquals(List.of(), MarkdownParse.getLinks(Files.readString(file5)));
        assertEquals(List.of(), MarkdownParse.getLinks(Files.readString(file6)));
        assertEquals(List.of(), MarkdownParse.getLinks(Files.readString(file7)));
        assertEquals(List.of("a link of the first line"), MarkdownParse.getLinks(Files.readString(file8)));

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
