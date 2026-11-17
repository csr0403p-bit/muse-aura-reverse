package X;

import java.util.Arrays;
import java.util.List;
import org.intellij.markdown.flavours.gfm.StrikeThroughDelimiterParser;
import org.intellij.markdown.parser.sequentialparsers.EmphasisLikeParser;
import org.intellij.markdown.parser.sequentialparsers.impl.EmphStrongDelimiterParser;

/* loaded from: classes6.dex */
public final class G8F extends G7Z {
    @Override // X.G7Z
    public final List<InterfaceC9243G7y> getParserSequence() {
        return Arrays.asList(new G8D(Arrays.asList(AbstractC9205G6l.A02, AbstractC9213G6t.A04)), new G8E(), new G88(), new G8C(), new G89(), new G8A(), new EmphasisLikeParser(new EmphStrongDelimiterParser(), new StrikeThroughDelimiterParser()));
    }
}
