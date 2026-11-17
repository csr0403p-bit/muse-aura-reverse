package X;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes6.dex */
public final class G7F extends AbstractC9230G7l {
    public int A00;
    public final C9236G7r A01;
    public final int A02;

    public static final List<String> A00(CharSequence charSequence) {
        C7384Etj.A0Y(charSequence, 0);
        ArrayList arrayListA0h = C3cG.A0h();
        int length = charSequence.length();
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            if (charSequence.charAt(i2) == '|') {
                int i3 = i2 - 1;
                if (i3 < 0) {
                    i3 = 0;
                }
                if (charSequence.charAt(i3) != '\\') {
                    arrayListA0h.add(charSequence.subSequence(i, i2).toString());
                    i = i2 + 1;
                }
            }
        }
        arrayListA0h.add(AbstractC7608F5v.A0c(charSequence, i).toString());
        return arrayListA0h;
    }

    public G7F(G7T g7t, C9236G7r c9236G7r, G7Y g7y, int i) {
        super(new C9233G7o(c9236G7r), g7y);
        this.A01 = c9236G7r;
        this.A02 = i;
        List listA00 = G7A.A00(G7T.A00(g7t, g7t.A00), AbstractC9212G6s.A02);
        List<G7A> list = c9236G7r.A01;
        list.addAll(listA00);
        list.addAll(A01(this, g7t));
    }

    /* JADX WARN: Type inference failed for: r7v0, types: [java.util.AbstractCollection, java.util.AbstractList, java.util.ArrayList] */
    public static final ArrayList A01(G7F g7f, G7T g7t) {
        ArrayList arrayListA0h = C3cG.A0h();
        int iA00 = g7t.A00;
        if (g7t.A02 == -1) {
            iA00 += AbstractC9223G7e.A00(g7t.A03, g7f.A03) + 1;
        }
        ?? A00 = A00(AbstractC9223G7e.A01(g7t.A03, g7f.A03));
        int size = A00.size();
        int i = 0;
        int i2 = 0;
        while (true) {
            if (i >= size) {
                break;
            }
            String str = (String) A00.get(i);
            if (!C7BY.A0j(str) || (1 <= i && i <= C8j3.A0K(A00) - 1)) {
                arrayListA0h.add(new G7A(AbstractC7607F5u.A1C(iA00, str.length() + iA00), AbstractC9213G6t.A01));
                i2++;
            }
            int length = iA00 + str.length();
            if (i < C8j3.A0K(A00)) {
                arrayListA0h.add(new G7A(AbstractC7607F5u.A1C(length, length + 1), AbstractC9213G6t.A05));
            }
            iA00 = length + 1;
            if (i2 < g7f.A02) {
                i++;
            } else if (iA00 < g7t.A01()) {
                arrayListA0h.add(new G7A(G7T.A00(g7t, iA00), AbstractC9213G6t.A05));
            }
        }
        return arrayListA0h;
    }
}
