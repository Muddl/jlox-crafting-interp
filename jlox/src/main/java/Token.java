import lombok.AllArgsConstructor;
import lombok.ToString;

@ToString
@AllArgsConstructor
public class Token {
    final TokenType type;
    final String lexeme;
    final Object literal;
    final int line;
}
