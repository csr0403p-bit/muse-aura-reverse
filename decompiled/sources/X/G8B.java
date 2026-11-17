package X;

import java.util.Collections;
import java.util.HashSet;
import java.util.List;

/* loaded from: classes6.dex */
public abstract class G8B {
    public static final G8I A01(G75 g75) {
        G72 g72A02 = G75.A02(g75, 0);
        G72 g72 = AbstractC9205G6l.A0N;
        if (!C7384Etj.areEqual(g72A02, g72)) {
            return null;
        }
        int i = g75.A00;
        G8L g8l = new G8L();
        G75 g75A07 = g75.A07();
        int i2 = 1;
        while (G75.A02(g75A07, 0) != null && (!C7384Etj.areEqual(G75.A02(g75A07, 0), AbstractC9205G6l.A0U) || i2 - 1 != 0)) {
            g8l.A01(g75A07.A00);
            if (G75.A04(g72, g75A07)) {
                i2++;
            }
            g75A07 = g75A07.A07();
        }
        if (C7384Etj.areEqual(G75.A02(g75A07, 0), AbstractC9205G6l.A0U)) {
            return new G8I(G7A.A00(G75.A01(g75A07, i), AbstractC9206G6m.A0J), Collections.singletonList(g8l.A00()), g75A07);
        }
        return null;
    }

    /* JADX WARN: Incorrect types in method signature: (LX/G7B;Ljava/util/List<LX/ADq;>;LX/G0U<-LX/G75;Ljava/lang/Boolean;>;)Ljava/util/Set<Ljava/lang/Integer;>; */
    public static final HashSet A00(List list, G0U g0u, G7B g7b) {
        HashSet hashSetA13 = C60O.A13();
        AIG aig = new AIG();
        for (G78 g78 = new G78(list, g7b); G75.A02(g78, 0) != null; g78 = g78.A08()) {
            G72 g72A02 = G75.A02(g78, 0);
            if (C7384Etj.areEqual(g72A02, AbstractC9205G6l.A0N)) {
                aig.addLast(Integer.valueOf(((G75) g78).A00));
            } else if (C7384Etj.areEqual(g72A02, AbstractC9205G6l.A0U) && !aig.isEmpty()) {
                int iA0F = AnonymousClass001.A0F(aig.removeLast());
                if (AnonymousClass003.A1X(g78, g0u)) {
                    C60Q.A1P(hashSetA13, iA0F);
                }
            }
        }
        return hashSetA13;
    }
}
