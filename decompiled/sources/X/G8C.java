package X;

import java.util.List;

/* loaded from: classes6.dex */
public final class G8C implements InterfaceC9243G7y {
    /* JADX WARN: Incorrect types in method signature: (LX/G7B;Ljava/util/List<LX/ADq;>;)LX/G8M; */
    @Override // X.InterfaceC9243G7y
    public final G8K AXe(List list, G7B g7b) {
        G8I g8iA00;
        boolean zA1a = AnonymousClass002.A1a(g7b, list);
        G8K g8k = new G8K();
        G8L g8l = new G8L();
        G75 g78 = new G78(list, g7b);
        while (G75.A02(g78, 0) != null) {
            if (C7384Etj.areEqual(G75.A02(g78, 0), AbstractC9205G6l.A0G) && C7384Etj.areEqual(g78.A06(zA1a ? 1 : 0), AbstractC9205G6l.A0N) && ((g8iA00 = G89.A00(null, g78.A07())) != null || (g8iA00 = G8A.A01(g78.A07())) != null)) {
                int i = g78.A00;
                g78 = g8iA00.A02;
                G7A.A02(G75.A01(g78, i), AbstractC9206G6m.A0E, g8k);
                g8k.A01(g8iA00);
            } else {
                g8l.A01(g78.A00);
            }
            g78 = g78.A07();
        }
        G8K.A00(g8l, g8k);
        return g8k;
    }
}
