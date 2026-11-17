package X;

import java.util.List;

/* loaded from: classes6.dex */
public abstract class G83 {
    public static final int maxAdvance = 50;

    public boolean isLeftFlankingRun(G75 g75, G75 g752) {
        boolean zA1a = AnonymousClass002.A1a(g75, g752);
        if (G82.A00(g752, zA1a ? 1 : 0) || !(!A00(g752, zA1a ? 1 : 0) || G82.A00(g75, -1) || A00(g75, -1))) {
            return false;
        }
        return zA1a;
    }

    public boolean isPunctuation(G75 g75, int i) {
        C7384Etj.A0Y(g75, 0);
        return A00(g75, i);
    }

    public boolean isRightFlankingRun(G7B g7b, G75 g75, G75 g752) {
        AnonymousClass002.A1A(g75, 1, g752);
        if (g75.A05(-1) == g75.A01.A00(G75.A03(g75, 0).A03) || G82.A00(g75, -1)) {
            return false;
        }
        return !A00(g75, -1) || G82.A00(g752, 1) || A00(g752, 1);
    }

    public boolean isWhitespace(G75 g75, int i) {
        C7384Etj.A0Y(g75, 0);
        return G82.A00(g75, i);
    }

    public abstract void process(G7B g7b, G75 g75, List<G86> list, G8K g8k);

    public abstract int scan(G7B g7b, G75 g75, List<G86> list);

    public static final boolean A00(G75 g75, int i) {
        char cA05 = g75.A05(i);
        return C7BY.A0k("$^`", cA05) || ((1676673024 >> Character.getType(cA05)) & 1) != 0;
    }

    public HxE<Boolean, Boolean> canOpenClose(G7B g7b, G75 g75, G75 g752, boolean z) {
        boolean z2;
        boolean zA1Z = AnonymousClass005.A1Z(g7b, g75, g752);
        boolean zIsLeftFlankingRun = isLeftFlankingRun(g75, g752);
        boolean zIsRightFlankingRun = isRightFlankingRun(g7b, g75, g752);
        if (z) {
            z2 = zIsLeftFlankingRun;
        } else {
            z2 = zIsLeftFlankingRun && (!zIsRightFlankingRun || A00(g75, -1));
            zIsRightFlankingRun = zIsRightFlankingRun && (!zIsLeftFlankingRun || A00(g752, zA1Z ? 1 : 0));
        }
        return AnonymousClass002.A0q(Boolean.valueOf(z2), zIsRightFlankingRun);
    }
}
