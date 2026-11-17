package X;

import java.util.List;

/* loaded from: classes6.dex */
public final class G8E implements InterfaceC9243G7y {
    /* JADX WARN: Incorrect types in method signature: (LX/G7B;Ljava/util/List<LX/ADq;>;)LX/G8M; */
    @Override // X.InterfaceC9243G7y
    public final G8K AXe(List list, G7B g7b) {
        boolean zA1b = AnonymousClass004.A1b(g7b, list);
        G8K g8k = new G8K();
        G8L g8l = new G8L();
        G75 g78 = new G78(list, g7b);
        while (true) {
            if (G75.A02(g78, zA1b ? 1 : 0) == null) {
                G8K.A00(g8l, g8k);
                return g8k;
            }
            G72 g72A02 = G75.A02(g78, zA1b ? 1 : 0);
            G72 g72 = AbstractC9205G6l.A03;
            if (C7384Etj.areEqual(g72A02, g72) || C7384Etj.areEqual(G75.A02(g78, zA1b ? 1 : 0), AbstractC9205G6l.A0F)) {
                G75 g75A07 = g78.A07();
                G72 g72A022 = G75.A02(g78, zA1b ? 1 : 0);
                G72 g722 = AbstractC9205G6l.A0F;
                int iA00 = G75.A00(g78) - (C7384Etj.areEqual(g72A022, g722) ? 2 : 0);
                while (true) {
                    if (G75.A02(g75A07, zA1b ? 1 : 0) == null) {
                        break;
                    }
                    if (G75.A04(g72, g75A07) || G75.A04(g722, g75A07)) {
                        if (G75.A00(g75A07) - (G75.A04(g722, g75A07) ? 1 : 0) == iA00) {
                            G7A.A02(G75.A01(g75A07, g78.A00), AbstractC9206G6m.A0A, g8k);
                            g78 = g75A07.A07();
                            break;
                        }
                    }
                    g75A07 = g75A07.A07();
                }
            }
            g8l.A01(g78.A00);
            g78 = g78.A07();
        }
    }
}
