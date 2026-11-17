package X;

import java.util.ArrayList;
import java.util.List;
import org.intellij.markdown.MarkdownParsingException;

/* loaded from: classes6.dex */
public final class G74 extends G7B {
    public final CharSequence A00;
    public final List<G79> A01;
    public final List<G79> A02;
    public final ADq A03;

    public G74(C9207G6n c9207G6n) {
        ArrayList arrayListA0h = C3cG.A0h();
        ArrayList arrayListA0h2 = C3cG.A0h();
        while (true) {
            G72 g72 = c9207G6n.A06;
            if (g72 == null) {
                break;
            }
            boolean zEquals = g72.equals(AbstractC9205G6l.A0c);
            G79 g79 = new G79(c9207G6n.A06, c9207G6n.A03, c9207G6n.A02, arrayListA0h.size(), zEquals ? -1 : arrayListA0h2.size());
            arrayListA0h.add(g79);
            if (!zEquals) {
                arrayListA0h2.add(g79);
            }
            G72 g722 = c9207G6n.A05;
            c9207G6n.A06 = g722;
            c9207G6n.A03 = c9207G6n.A02;
            if (g722 != null) {
                C9207G6n.A00(c9207G6n);
            }
        }
        this.A01 = arrayListA0h;
        this.A02 = arrayListA0h2;
        this.A00 = c9207G6n.A04;
        this.A03 = ATD.A0C(c9207G6n.A01, c9207G6n.A00);
        int size = arrayListA0h.size();
        for (int i = 0; i < size; i++) {
            if (((G79) arrayListA0h.get(i)).A01 != i) {
                throw new MarkdownParsingException("");
            }
        }
        List<G79> list = this.A02;
        int size2 = list.size();
        for (int i2 = 0; i2 < size2; i2++) {
            if (list.get(i2).A00 != i2) {
                throw new MarkdownParsingException("");
            }
        }
    }
}
