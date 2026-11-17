package X;

import java.util.List;

/* loaded from: classes6.dex */
public final class G88 implements InterfaceC9243G7y {
    /* JADX WARN: Incorrect types in method signature: (LX/G7B;Ljava/util/List<LX/ADq;>;)LX/G8M; */
    @Override // X.InterfaceC9243G7y
    public final G8K AXe(List list, G7B g7b) {
        boolean zA1a = AnonymousClass002.A1a(g7b, list);
        G8K g8k = new G8K();
        G8L g8l = new G8L();
        G75 g78 = new G78(list, g7b);
        while (G75.A02(g78, 0) != null) {
            G72 g72A02 = G75.A02(g78, 0);
            G72 g72 = AbstractC9213G6t.A03;
            if (C7384Etj.areEqual(g72A02, g72)) {
                int iA00 = G75.A00(g78);
                for (G75 g75A07 = g78.A07(); G75.A02(g75A07, 0) != null; g75A07 = g75A07.A07()) {
                    if (G75.A04(g72, g75A07) && G75.A00(g75A07) == iA00) {
                        G7A.A02(AbstractC7607F5u.A1C(g78.A00, g75A07.A00 + 1), G75.A00(g78) == zA1a ? AbstractC9212G6s.A03 : AbstractC9212G6s.A01, g8k);
                        g78 = g75A07.A07();
                    }
                }
            }
            g8l.A01(g78.A00);
            g78 = g78.A07();
        }
        G8K.A00(g8l, g8k);
        return g8k;
    }
}
