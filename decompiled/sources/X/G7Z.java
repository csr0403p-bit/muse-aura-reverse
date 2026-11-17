package X;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Deprecated;
import kotlin.ReplaceWith;
import org.intellij.markdown.parser.CancellationToken;

/* loaded from: classes6.dex */
public abstract class G7Z {
    public abstract List<InterfaceC9243G7y> getParserSequence();

    @Deprecated(message = "Use runParsingSequence with CancellationToken", replaceWith = @ReplaceWith(expression = "runParsingSequence(tokensCache, rangesToParse, CancellationToken.NonCancellable)", imports = {"org.intellij.markdown.parser.CancellationToken"}))
    public final Collection<G7A> runParsingSequence(G7B g7b, List<ADq> list) {
        AnonymousClass003.A0u(g7b, list);
        return runParsingSequence(g7b, list, C10558Hst.A00);
    }

    public final Collection<G7A> runParsingSequence(G7B g7b, List<ADq> list, CancellationToken cancellationToken) {
        AnonymousClass005.A0x(g7b, list, cancellationToken);
        ArrayList arrayListA0h = C3cG.A0h();
        ArrayList arrayListA0u = BV5.A0u(list);
        for (InterfaceC9243G7y interfaceC9243G7y : getParserSequence()) {
            ArrayList arrayListA0h2 = C3cG.A0h();
            Iterator it = arrayListA0u.iterator();
            while (it.hasNext()) {
                List list2 = (List) it.next();
                C7384Etj.A0S(list2);
                G8K g8kAXe = interfaceC9243G7y.AXe(list2, g7b);
                arrayListA0h.addAll(g8kAXe.A00);
                arrayListA0h2.addAll(g8kAXe.A01);
            }
            arrayListA0u = arrayListA0h2;
        }
        return arrayListA0h;
    }
}
