package X;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* loaded from: classes6.dex */
public final class G7V implements InterfaceC9228G7j<C9242G7x> {
    @Override // X.InterfaceC9228G7j
    public final List A7s(G7T g7t, C9242G7x c9242G7x, C9236G7r c9236G7r) {
        AnonymousClass005.A0x(g7t, c9236G7r, c9242G7x);
        ADq aDqA00 = A00(g7t);
        if (aDqA00 == null) {
            return C0881AGi.A00;
        }
        G7Y g7y = c9242G7x.A01;
        int i = aDqA00.A01;
        CharSequence charSequenceA0c = AbstractC7608F5v.A0c(g7t.A03, g7t.A02);
        int length = charSequenceA0c.length();
        do {
            length--;
            if (length <= i) {
                break;
            }
        } while (C7LE.A00(charSequenceA0c.charAt(length)));
        while (length > i && charSequenceA0c.charAt(length) == '#') {
            int i2 = length - 1;
            if (charSequenceA0c.charAt(i2) == '\\') {
                break;
            }
            length = i2;
        }
        int i3 = length + 1;
        return Collections.singletonList(new G7O(aDqA00, c9236G7r, g7y, (i3 < charSequenceA0c.length() && C7LE.A00(charSequenceA0c.charAt(length)) && charSequenceA0c.charAt(i3) == '#') ? g7t.A00 + length + 1 : g7t.A00 + charSequenceA0c.length(), g7t.A01()));
    }

    @Override // X.InterfaceC9228G7j
    public final boolean ANs(G7T g7t, G7Y g7y) {
        C7384Etj.A0Y(g7t, 0);
        return A00(g7t) != null;
    }

    public static final ADq A00(G7T g7t) {
        CharSequence charSequenceA0c;
        int iA00;
        int i = g7t.A02;
        if (i != -1 && (iA00 = InterfaceC9228G7j.A00((charSequenceA0c = AbstractC7608F5v.A0c(g7t.A03, i)), 0)) < charSequenceA0c.length() && charSequenceA0c.charAt(iA00) == '#') {
            int i2 = iA00;
            int i3 = 0;
            do {
                if (i2 < charSequenceA0c.length() && charSequenceA0c.charAt(i2) == '#') {
                    i2++;
                }
                i3++;
            } while (i3 < 6);
            if (i2 >= charSequenceA0c.length() || Arrays.asList(' ', '\t').contains(Character.valueOf(charSequenceA0c.charAt(i2)))) {
                return AbstractC7607F5u.A1C(iA00, i2 - 1);
            }
        }
        return null;
    }
}
