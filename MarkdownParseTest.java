import static org.junit.Assert.*;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

import org.junit.*;
public class MarkdownParseTest{
    @Test
    public void checkAllLinks() throws IOException{
        /*
        Path file1 = Path.of("test-file.md");
        Path file2 = Path.of("test-file2.md");
        Path file3 = Path.of("test-file3.md");
        Path file4 = Path.of("test-file4.md");
        Path file5 = Path.of("test-file5.md");
        Path file6 = Path.of("test-file6.md");
        Path file7 = Path.of("test-file7.md");
        Path file8 = Path.of("test-file8.md");

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
        assertEquals(List.of("a link on the first line"), MarkdownParse.getLinks(Files.readString(file8)));
        */

        Path file1 = Path.of("Lab-report-test1.md");
        assertEquals(List.of("url.com", "google.com", "google.com", "ucsd.edu"), MarkdownParse.getLinks(Files.readString(file1)));

    }
    
    @Test
    public void checkLinks1() throws IOException{
        /*
        Path path = Path.of("test-file.md");
        List<String> links = MarkdownParse.getLinks(Files.readString(path));
        assertEquals(List.of("https://something.com", "some-thing.html"), links);
        */
        Path file2 = Path.of("Lab-report-test2.md");
        assertEquals(List.of("a.com", "b.com", "a.com", "example.com"), MarkdownParse.getLinks(Files.readString(file2)));
    }

    @Test
    public void checkLinks2() throws IOException{
        /*
        Path path = Path.of("parenthesis-test.md");
        assertEquals(List.of(), MarkdownParse.getLinks(Files.readString(path)));
        */
        Path file3 = Path.of("Lab-report-test3.md");
        assertEquals(List.of("https://www.twitter.com", "https://sites.google.com/eng.ucsd.edu/cse-15l-spring-2022/schedule", "github.com", 
        "https://cse.ucsd.edu/"), MarkdownParse.getLinks(Files.readString(file3)));
    }
    /*
    @Test
    public void checkLinks3() throws IOException{
        Path path = Path.of("brackets-test.md");
        assertEquals(List.of(), MarkdownParse.getLinks(Files.readString(path)));
    }
    */
    
}
