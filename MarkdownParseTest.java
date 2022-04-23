import static org.junit.Assert.*;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

import org.junit.*;
public class MarkdownParseTest {
    @Test
    public void addition() {
        assertEquals(2, 1 + 1);
    }

    @Test
    public void checkLinks() throws IOException{
        assertEquals(List.of("https://something.com", "some-thing.html"), MarkdownParse.getLinks(Files.readString(Path.of("test-file.md"))));
        assertEquals(List.of(), MarkdownParse.getLinks(Files.readString(Path.of("parenthesis-test.md"))));
        assertEquals(List.of(), MarkdownParse.getLinks(Files.readString(Path.of("brackets-test.md"))));
        assertEquals(List.of("https://sites.google.com/eng.ucsd.edu/cse-15l-spring-2022/syllabus","canvas.ucsd.edu"), MarkdownParse.getLinks(Files.readString(Path.of("another-test.md"))));
    }
}
