package X;

import java.util.Collections;
import java.util.List;

/* renamed from: X.G7b, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9220G7b implements InterfaceC9228G7j<C9242G7x> {
    public static final boolean A00(CharSequence charSequence, int i) {
        C7384Etj.A0Y(charSequence, 0);
        int length = charSequence.length();
        Character chValueOf = null;
        int i2 = 1;
        int i3 = 0;
        while (true) {
            if (i < length) {
                char cCharAt = charSequence.charAt(i);
                if (chValueOf == null) {
                    if (cCharAt == '*' || cCharAt == '-' || cCharAt == '_') {
                        chValueOf = Character.valueOf(cCharAt);
                    } else {
                        if (i3 >= 3 || cCharAt != ' ') {
                            break;
                        }
                        i3++;
                    }
                    i++;
                } else {
                    if (cCharAt != chValueOf.charValue()) {
                        if (cCharAt != ' ' && cCharAt != '\t') {
                            break;
                        }
                    } else {
                        i2++;
                    }
                    i++;
                }
            } else if (i2 >= 3) {
                return true;
            }
        }
        return false;
    }

    @Override // X.InterfaceC9228G7j
    public final List A7s(G7T g7t, C9242G7x c9242G7x, C9236G7r c9236G7r) {
        AnonymousClass005.A0x(g7t, c9236G7r, c9242G7x);
        G7Y g7y = c9242G7x.A01;
        return (InterfaceC9228G7j.A01(g7t, g7y) && A00(g7t.A03, g7t.A02)) ? Collections.singletonList(new C9239G7u(new C9233G7o(c9236G7r), g7y)) : C0881AGi.A00;
    }

    @Override // X.InterfaceC9228G7j
    public final boolean ANs(G7T g7t, G7Y g7y) {
        AnonymousClass003.A0u(g7t, g7y);
        if (InterfaceC9228G7j.A01(g7t, g7y)) {
            return A00(g7t.A03, g7t.A02);
        }
        return false;
    }
}
