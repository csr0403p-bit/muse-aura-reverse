package X;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* loaded from: classes6.dex */
public final class G89 implements InterfaceC9243G7y {
    /* JADX WARN: Incorrect types in method signature: (LX/G75;Ljava/util/Set<Ljava/lang/Integer;>;)LX/G8I; */
    public static final G8I A00(Set set, G75 g75) {
        G72 g72A02;
        if (set == null || C60Q.A1W(set, g75.A00)) {
            int i = g75.A00;
            G8I g8iA01 = G8B.A01(g75);
            if (g8iA01 != null) {
                G75 g752 = g8iA01.A02;
                G72 g72A06 = g752.A06(1);
                G72 g72 = AbstractC9205G6l.A0S;
                if (C7384Etj.areEqual(g72A06, g72)) {
                    G75 g75A07 = g752.A07().A07();
                    G72 g72A022 = G75.A02(g75A07, 0);
                    G72 g722 = AbstractC9205G6l.A0E;
                    if (C7384Etj.areEqual(g72A022, g722)) {
                        g75A07 = g75A07.A07();
                    }
                    G75 g75A072 = g75A07;
                    G8I g8i = null;
                    if (!G75.A04(g722, g75A07)) {
                        G72 g72A023 = G75.A02(g75A07, 0);
                        G72 g723 = AbstractC9205G6l.A0V;
                        if (!C7384Etj.areEqual(g72A023, g723)) {
                            int i2 = g75A07.A00;
                            boolean zAreEqual = C7384Etj.areEqual(G75.A02(g75A07, 0), AbstractC9205G6l.A0T);
                            if (zAreEqual) {
                                g75A072 = g75A07.A07();
                            }
                            int i3 = 0;
                            while (G75.A02(g75A072, 0) != null) {
                                G72 g72A024 = G75.A02(g75A072, 0);
                                if (!zAreEqual) {
                                    if (C7384Etj.areEqual(g72A024, g72)) {
                                        i3++;
                                    }
                                    G72 g72A062 = g75A072.A06(1);
                                    if (G82.A00(g75A072, 1) || g72A062 == null) {
                                        break;
                                    }
                                    if (!g72A062.equals(g723)) {
                                        continue;
                                    } else {
                                        if (i3 == 0) {
                                            break;
                                        }
                                        i3--;
                                    }
                                    g75A072 = g75A072.A07();
                                } else {
                                    if (C7384Etj.areEqual(g72A024, AbstractC9205G6l.A0I)) {
                                        break;
                                    }
                                    g75A072 = g75A072.A07();
                                }
                            }
                            if (G75.A02(g75A072, 0) != null && i3 == 0) {
                                g8i = new G8I(G7A.A00(G75.A01(g75A072, i2), AbstractC9206G6m.A0H), C0881AGi.A00, g75A072);
                                g75A07 = g8i.A02.A07();
                                if (G75.A04(g722, g75A07)) {
                                    g75A07 = g75A07.A07();
                                }
                            }
                        }
                    }
                    G75 g75A073 = g75A07;
                    G8I g8i2 = null;
                    if (!G75.A04(g722, g75A07)) {
                        int i4 = g75A07.A00;
                        if (C7384Etj.areEqual(G75.A02(g75A07, 0), AbstractC9205G6l.A0Z) || C7384Etj.areEqual(G75.A02(g75A07, 0), AbstractC9205G6l.A0B)) {
                            g72A02 = G75.A02(g75A07, 0);
                        } else if (G75.A04(g72, g75A07)) {
                            g72A02 = AbstractC9205G6l.A0V;
                        }
                        do {
                            g75A073 = g75A073.A07();
                            if (G75.A02(g75A073, 0) == null) {
                                break;
                            }
                        } while (!G75.A04(g72A02, g75A073));
                        if (G75.A02(g75A073, 0) != null) {
                            g8i2 = new G8I(G7A.A00(G75.A01(g75A073, i4), AbstractC9206G6m.A0K), C0881AGi.A00, g75A073);
                            g75A07 = g8i2.A02.A07();
                            if (G75.A04(g722, g75A07)) {
                                g75A07 = g75A07.A07();
                            }
                        }
                    }
                    if (C7384Etj.areEqual(G75.A02(g75A07, 0), AbstractC9205G6l.A0V)) {
                        return new G8I(AbstractC0878AGe.A0Q(new G7A(G75.A01(g75A07, i), AbstractC9206G6m.A0F), AbstractC0878AGe.A0P(g8i2 != null ? g8i2.A00 : C0881AGi.A00, AbstractC0878AGe.A0P(g8i != null ? g8i.A00 : C0881AGi.A00, g8iA01.A00))), g8iA01.A01, g75A07);
                    }
                }
            }
        }
        return null;
    }

    /* JADX WARN: Incorrect types in method signature: (LX/G7B;Ljava/util/List<LX/ADq;>;)LX/G8M; */
    @Override // X.InterfaceC9243G7y
    public final G8K AXe(List list, G7B g7b) {
        G8I g8iA00;
        AnonymousClass003.A0u(g7b, list);
        G8K g8k = new G8K();
        G8L g8l = new G8L();
        G75 g78 = new G78(list, g7b);
        HashSet hashSetA00 = G8B.A00(list, C8631Fhi.A00(37), g7b);
        while (G75.A02(g78, 0) != null) {
            if (!C7384Etj.areEqual(G75.A02(g78, 0), AbstractC9205G6l.A0N) || (g8iA00 = A00(hashSetA00, g78)) == null) {
                g8l.A01(g78.A00);
                g78 = g78.A07();
            } else {
                g78 = g8iA00.A02.A07();
                g8k.A01(g8iA00);
            }
        }
        G8K.A00(g8l, g8k);
        return g8k;
    }
}
