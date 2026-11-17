package X;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes6.dex */
public final class G7K implements InterfaceC9228G7j<C9242G7x> {
    public static final List<String> A00 = Arrays.asList("[!NOTE]", "[!TIP]", "[!IMPORTANT]", "[!WARNING]", "[!CAUTION]");

    @Override // X.InterfaceC9228G7j
    public final List A7s(G7T g7t, C9242G7x c9242G7x, C9236G7r c9236G7r) {
        char[] cArr;
        int length;
        int length2;
        int i;
        AnonymousClass005.A0x(g7t, c9236G7r, c9242G7x);
        G7Y g7y = c9242G7x.A01;
        G7Y g7y2 = c9242G7x.A02;
        int i2 = g7t.A02;
        CharSequence charSequence = g7t.A03;
        if (i2 == AbstractC9223G7e.A00(charSequence, g7y) && !g7y2.equals(g7y) && (length = (cArr = g7y2.A01).length) != 0 && cArr[length - 1] == '>') {
            CharSequence charSequenceA0G = C7BY.A0G(AbstractC7608F5v.A0c(charSequence, AbstractC9223G7e.A00(charSequence, g7y2)));
            List<String> list = A00;
            if (!(list instanceof Collection) || !list.isEmpty()) {
                Iterator<String> it = list.iterator();
                while (it.hasNext()) {
                    String strA0j = AnonymousClass005.A0j(it);
                    if (strA0j == null || !(charSequenceA0G instanceof String)) {
                        if (strA0j != charSequenceA0G) {
                            if (strA0j != null && charSequenceA0G != null && (length2 = strA0j.length()) == charSequenceA0G.length()) {
                                while (i < length2) {
                                    i = HlF.A02(strA0j.charAt(i), charSequenceA0G.charAt(i), true) ? i + 1 : 0;
                                }
                            }
                        }
                        C9225G7g c9225G7g = new C9225G7g(new C9233G7o(c9236G7r), g7y2);
                        int i3 = g7t.A00 - i2;
                        int iA00 = AbstractC9223G7e.A00(charSequence, c9225G7g.A03);
                        G7A.A01(AbstractC7607F5u.A1C(i3 + iA00, i3 + C7BY.A08(charSequence, ']', iA00) + 1), AbstractC9213G6t.A00, c9236G7r);
                        return Collections.singletonList(c9225G7g);
                    }
                    if (strA0j.equalsIgnoreCase((String) charSequenceA0G)) {
                        C9225G7g c9225G7g2 = new C9225G7g(new C9233G7o(c9236G7r), g7y2);
                        int i32 = g7t.A00 - i2;
                        int iA002 = AbstractC9223G7e.A00(charSequence, c9225G7g2.A03);
                        G7A.A01(AbstractC7607F5u.A1C(i32 + iA002, i32 + C7BY.A08(charSequence, ']', iA002) + 1), AbstractC9213G6t.A00, c9236G7r);
                        return Collections.singletonList(c9225G7g2);
                    }
                }
            }
        }
        return C0881AGi.A00;
    }

    @Override // X.InterfaceC9228G7j
    public final boolean ANs(G7T g7t, G7Y g7y) {
        return false;
    }
}
