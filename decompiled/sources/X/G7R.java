package X;

import java.util.Collections;
import java.util.List;

/* loaded from: classes6.dex */
public final class G7R implements InterfaceC9228G7j<C9242G7x> {
    public static final C06827l3 A00 = C06827l3.A02("^ {0,3}(~~~+|```+)([^`]*)$");

    @Override // X.InterfaceC9228G7j
    public final boolean ANs(G7T g7t, G7Y g7y) {
        boolean zA1a = AnonymousClass002.A1a(g7t, g7y);
        if (InterfaceC9228G7j.A01(g7t, g7y)) {
            C06847l8 c06847l8A01 = C06827l3.A01(AbstractC7608F5v.A0c(g7t.A03, g7t.A02), A00);
            if (c06847l8A01 != null) {
                C06857lE c06857lE = c06847l8A01.A02;
                C1YK c1ykA0E = c06857lE.A0E(zA1a ? 1 : 0);
                C7384Etj.A0X(c1ykA0E != null ? c1ykA0E.A00 : null);
                C1YK c1ykA0E2 = c06857lE.A0E(2);
                C7384Etj.A0X(c1ykA0E2 != null ? c1ykA0E2.A00 : null);
                return zA1a;
            }
        }
        return false;
    }

    @Override // X.InterfaceC9228G7j
    public final List A7s(G7T g7t, C9242G7x c9242G7x, C9236G7r c9236G7r) {
        boolean zA1Y = C60P.A1Y(g7t, c9236G7r);
        C7384Etj.A0Y(c9242G7x, 2);
        G7Y g7y = c9242G7x.A01;
        if (InterfaceC9228G7j.A01(g7t, g7y)) {
            C06847l8 c06847l8A01 = C06827l3.A01(AbstractC7608F5v.A0c(g7t.A03, g7t.A02), A00);
            if (c06847l8A01 != null) {
                C06857lE c06857lE = c06847l8A01.A02;
                C1YK c1ykA0E = c06857lE.A0E(zA1Y ? 1 : 0);
                String str = c1ykA0E != null ? c1ykA0E.A00 : null;
                C7384Etj.A0X(str);
                C1YK c1ykA0E2 = c06857lE.A0E(2);
                String str2 = c1ykA0E2 != null ? c1ykA0E2.A00 : null;
                C7384Etj.A0X(str2);
                int iA01 = g7t.A01();
                int length = str2.length();
                int i = iA01 - length;
                List listA00 = G7A.A00(AbstractC7607F5u.A1C(g7t.A00, i), AbstractC9205G6l.A08);
                List<G7A> list = c9236G7r.A01;
                list.addAll(listA00);
                if (length > 0) {
                    list.addAll(G7A.A00(G7T.A00(g7t, i), AbstractC9205G6l.A0H));
                }
                return Collections.singletonList(new G7M(str, c9236G7r, g7y));
            }
        }
        return C0881AGi.A00;
    }
}
