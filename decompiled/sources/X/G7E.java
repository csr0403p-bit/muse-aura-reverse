package X;

import X.C9242G7x;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.intellij.markdown.MarkdownParsingException;

/* loaded from: classes6.dex */
public abstract class G7E<T extends C9242G7x> {
    public G7Y A01;
    public final C9236G7r A04;
    public final G7Y A05;
    public final List A02 = C0881AGi.A00;
    public final List A03 = C3cG.A0h();
    public int A00 = -1;
    public final G0V A06 = new FZJ(this, 16);

    public abstract void A03(G7T g7t, C9236G7r c9236G7r, G7Y g7y);

    public static final void A00(G7E g7e) {
        List list = g7e.A03;
        g7e.A01 = list.isEmpty() ? g7e.A05 : ((AbstractC9230G7l) AbstractC0878AGe.A0H(list)).A03;
    }

    public static final void A01(G7E g7e, EnumC9232G7n enumC9232G7n, int i) {
        EnumC9232G7n enumC9232G7n2 = EnumC9232G7n.A04;
        if (enumC9232G7n == enumC9232G7n2) {
            return;
        }
        List list = g7e.A03;
        int size = list.size();
        while (true) {
            size--;
            if (size <= i) {
                A00(g7e);
                return;
            }
            AbstractC9230G7l abstractC9230G7l = (AbstractC9230G7l) list.get(size);
            EnumC9232G7n enumC9232G7n3 = enumC9232G7n;
            if (enumC9232G7n == EnumC9232G7n.A01) {
                enumC9232G7n3 = EnumC9232G7n.A02;
            }
            C9233G7o c9233G7o = abstractC9230G7l.A02;
            G72 g72A06 = abstractC9230G7l.A06();
            if (!(enumC9232G7n3 instanceof G80) && !(enumC9232G7n3 instanceof G81)) {
                if (!(enumC9232G7n3 instanceof C9241G7w)) {
                    throw C8j3.A18("Should not be invoked");
                }
                AnonymousClass003.A0u(c9233G7o, g72A06);
                c9233G7o.A00(g72A06);
            }
            if (enumC9232G7n3 == enumC9232G7n2) {
                throw new MarkdownParsingException("If closing action is not NOTHING, marker should be gone");
            }
            list.remove(size);
        }
    }

    public G7E(C9236G7r c9236G7r, G7Y g7y) {
        this.A04 = c9236G7r;
        this.A05 = g7y;
        this.A01 = g7y;
    }

    public List A02(G7T g7t, C9236G7r c9236G7r) {
        AnonymousClass003.A0u(g7t, c9236G7r);
        G7J g7j = (G7J) this;
        if (!InterfaceC9228G7j.A01(g7t, g7j.A00.A01)) {
            throw AbstractC7608F5v.A19();
        }
        Iterator<InterfaceC9228G7j<C9242G7x>> it = (g7j instanceof G7L ? ((G7L) g7j).A00 : g7j.A01).iterator();
        while (it.hasNext()) {
            List listA7s = it.next().A7s(g7t, g7j.A00, c9236G7r);
            if (!listA7s.isEmpty()) {
                return listA7s;
            }
        }
        if (g7t.A02 < AbstractC9223G7e.A00(g7t.A03, g7j.A00.A02) || g7t.A02() == null) {
            return C0881AGi.A00;
        }
        return Collections.singletonList(new C9219G7a(this.A06, new C9233G7o(c9236G7r), g7j.A00.A01));
    }
}
