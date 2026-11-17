package X;

import java.util.Collections;
import java.util.List;

/* renamed from: X.G7c, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9221G7c implements InterfaceC9228G7j<C9242G7x> {
    @Override // X.InterfaceC9228G7j
    public final List A7s(G7T g7t, C9242G7x c9242G7x, C9236G7r c9236G7r) {
        Integer numA02;
        G7T g7tA05;
        AnonymousClass005.A0x(g7t, c9236G7r, c9242G7x);
        if (AbstractC9223G7e.A00(g7t.A03, c9242G7x.A02) <= g7t.A02 && (numA02 = g7t.A02()) != null && (g7tA05 = g7t.A05(numA02.intValue())) != null) {
            G7Y g7y = c9242G7x.A01;
            CharSequence charSequence = g7tA05.A03;
            int iA00 = AbstractC9223G7e.A00(charSequence, g7y);
            int i = g7tA05.A02;
            if (i < iA00 + 4) {
                if (iA00 <= i) {
                    while (charSequence.charAt(iA00) != '\t') {
                        if (iA00 != i) {
                            iA00++;
                        }
                    }
                }
            }
            return Collections.singletonList(new G7N(g7t, c9236G7r, g7y));
        }
        return C0881AGi.A00;
    }

    @Override // X.InterfaceC9228G7j
    public final boolean ANs(G7T g7t, G7Y g7y) {
        return false;
    }
}
