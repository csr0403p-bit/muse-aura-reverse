package X;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes6.dex */
public final class G7U implements InterfaceC9228G7j<C9242G7x> {
    @Override // X.InterfaceC9228G7j
    public final List A7s(G7T g7t, C9242G7x c9242G7x, C9236G7r c9236G7r) {
        char[] cArr;
        int length;
        boolean zA1Z = AnonymousClass005.A1Z(g7t, c9236G7r, c9242G7x);
        G7Y g7y = c9242G7x.A01;
        G7Y g7y2 = c9242G7x.A02;
        if (InterfaceC9228G7j.A01(g7t, g7y) && !g7y2.equals(g7y) && ((length = (cArr = g7y2.A01).length) == 0 || cArr[length - 1] != '>')) {
            boolean[] zArr = g7y2.A03;
            int length2 = zArr.length;
            if (AnonymousClass002.A1b(length2 == 0 ? null : Boolean.valueOf(zArr[length2 - 1]), zA1Z)) {
                ArrayList arrayListA0h = C3cG.A0h();
                if (!(AbstractC0878AGe.A0I(c9242G7x.A00) instanceof G7X)) {
                    C9233G7o c9233G7o = new C9233G7o(c9236G7r);
                    Character chValueOf = length == 0 ? null : Character.valueOf(cArr[length - 1]);
                    C7384Etj.A0X(chValueOf);
                    arrayListA0h.add(new G7X(c9233G7o, g7y2, chValueOf.charValue()));
                }
                arrayListA0h.add(new C9224G7f(new C9233G7o(c9236G7r), g7y2));
                return arrayListA0h;
            }
        }
        return C0881AGi.A00;
    }

    @Override // X.InterfaceC9228G7j
    public final boolean ANs(G7T g7t, G7Y g7y) {
        return false;
    }
}
