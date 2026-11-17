package X;

import X.C9242G7x;
import java.util.List;

/* renamed from: X.G7j, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public interface InterfaceC9228G7j<T extends C9242G7x> {
    static int A00(CharSequence charSequence, int i) {
        C7384Etj.A0Y(charSequence, 0);
        int i2 = 0;
        do {
            if (i < charSequence.length() && charSequence.charAt(i) == ' ') {
                i++;
            }
            i2++;
        } while (i2 < 3);
        return i;
    }

    static boolean A01(G7T g7t, G7Y g7y) {
        return g7t.A02 == AbstractC9223G7e.A00(g7t.A03, g7y);
    }

    List A7s(G7T g7t, C9242G7x c9242G7x, C9236G7r c9236G7r);

    boolean ANs(G7T g7t, G7Y g7y);
}
