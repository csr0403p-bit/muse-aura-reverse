package X;

import java.util.List;

/* loaded from: classes6.dex */
public final class G8D implements InterfaceC9243G7y {
    public final List<G72> A00;

    /* JADX WARN: Incorrect types in method signature: (LX/G7B;Ljava/util/List<LX/ADq;>;)LX/G8M; */
    @Override // X.InterfaceC9243G7y
    public final G8K AXe(List list, G7B g7b) {
        G72 g72A06;
        G72 g72;
        boolean zA1a = AnonymousClass002.A1a(g7b, list);
        G8K g8k = new G8K();
        G8L g8l = new G8L();
        G78 g78 = new G78(list, g7b);
        while (G75.A02(g78, 0) != null) {
            if (C7384Etj.areEqual(G75.A02(g78, 0), AbstractC9205G6l.A0T) && (g72A06 = g78.A06(zA1a ? 1 : 0)) != null && this.A00.contains(g72A06)) {
                int i = ((G75) g78).A00;
                while (true) {
                    G72 g72A02 = G75.A02(g78, 0);
                    g72 = AbstractC9205G6l.A0I;
                    if (C7384Etj.areEqual(g72A02, g72) || G75.A02(g78, 0) == null) {
                        break;
                    }
                    g78 = g78.A08();
                }
                if (G75.A04(g72, g78)) {
                    G7A.A02(G75.A01(g78, i), AbstractC9206G6m.A06, g8k);
                }
            } else {
                g8l.A01(((G75) g78).A00);
            }
            g78 = g78.A08();
        }
        G8K.A00(g8l, g8k);
        return g8k;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public G8D(List<? extends G72> list) {
        this.A00 = list;
    }
}
