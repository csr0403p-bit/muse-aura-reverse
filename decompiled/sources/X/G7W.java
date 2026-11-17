package X;

import java.util.Collections;
import java.util.List;

/* loaded from: classes6.dex */
public final class G7W implements InterfaceC9228G7j<C9242G7x> {
    @Override // X.InterfaceC9228G7j
    public final List A7s(G7T g7t, C9242G7x c9242G7x, C9236G7r c9236G7r) {
        char[] cArr;
        int length;
        AnonymousClass005.A0x(g7t, c9236G7r, c9242G7x);
        G7Y g7y = c9242G7x.A01;
        G7Y g7y2 = c9242G7x.A02;
        return (g7t.A02 != AbstractC9223G7e.A00(g7t.A03, g7y) || g7y2.equals(g7y) || (length = (cArr = g7y2.A01).length) == 0 || cArr[length + (-1)] != '>') ? C0881AGi.A00 : Collections.singletonList(new C9226G7h(new C9233G7o(c9236G7r), g7y2));
    }

    @Override // X.InterfaceC9228G7j
    public final boolean ANs(G7T g7t, G7Y g7y) {
        return false;
    }
}
