package org.intellij.markdown.parser.sequentialparsers.impl;

import X.ADq;
import X.AbstractC7607F5u;
import X.AbstractC9205G6l;
import X.AbstractC9206G6m;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass005;
import X.C7384Etj;
import X.G72;
import X.G75;
import X.G7A;
import X.G7B;
import X.G83;
import X.G86;
import X.G8K;
import X.HxE;
import java.util.List;

/* loaded from: classes6.dex */
public final class EmphStrongDelimiterParser extends G83 {
    public static final boolean A01(List<G86> list, int i, int i2) {
        G86 g86 = list.get(i);
        G86 g862 = list.get(i2);
        if (i > 0) {
            int i3 = i - 1;
            if (list.get(i3).A01 == g86.A01 + 1 && list.get(i3).A00 == g86.A00 && list.get(i3).A05 == g86.A05 - 1 && list.get(g86.A01 + 1).A05 == g862.A05 + 1) {
                return true;
            }
        }
        return false;
    }

    @Override // X.G83
    public final void process(G7B g7b, G75 g75, List<G86> list, G8K g8k) {
        ADq aDqA1C;
        G72 g72;
        AnonymousClass002.A1B(list, 2, g8k);
        int size = list.size() - 1;
        if (size < 0) {
            return;
        }
        boolean zA01 = false;
        while (true) {
            int i = size - 1;
            if (zA01) {
                zA01 = false;
            } else {
                G86 g86 = list.get(size);
                if (g86.A06.equals(AbstractC9205G6l.A0D) && g86.A01 != -1) {
                    zA01 = A01(list, size, g86.A01);
                    G86 g862 = list.get(g86.A01);
                    int i2 = g86.A05;
                    if (zA01) {
                        aDqA1C = AbstractC7607F5u.A1C(i2 - 1, g862.A05 + 2);
                        g72 = AbstractC9206G6m.A0S;
                    } else {
                        aDqA1C = AbstractC7607F5u.A1C(i2, g862.A05 + 1);
                        g72 = AbstractC9206G6m.A0B;
                    }
                    G7A.A02(aDqA1C, g72, g8k);
                }
            }
            if (i < 0) {
                return;
            } else {
                size = i;
            }
        }
    }

    @Override // X.G83
    public final int scan(G7B g7b, G75 g75, List<G86> list) {
        boolean zA1Z = AnonymousClass005.A1Z(g7b, g75, list);
        G72 g72A02 = G75.A02(g75, 0);
        G72 g72 = AbstractC9205G6l.A0D;
        if (!C7384Etj.areEqual(g72A02, g72)) {
            return 0;
        }
        char cA00 = g75.A01.A00(G75.A03(g75, 0).A03);
        G75 g75A07 = g75;
        int i = 0;
        int i2 = 1;
        while (C7384Etj.areEqual(g75A07.A06(zA1Z ? 1 : 0), g72)) {
            G75 g75A072 = g75A07.A07();
            if (g75A072.A01.A00(G75.A03(g75A072, 0).A03) != cA00) {
                break;
            }
            g75A07 = g75A07.A07();
            i2++;
            i++;
            if (i >= 50) {
                break;
            }
        }
        HxE<Boolean, Boolean> hxECanOpenClose = canOpenClose(g7b, g75, g75A07, cA00 == '*');
        boolean zA1X = AnonymousClass001.A1X(hxECanOpenClose.first);
        boolean zA1X2 = AnonymousClass001.A1X(hxECanOpenClose.second);
        for (int i3 = 0; i3 < i2; i3++) {
            list.add(new G86(g72, cA00, g75.A00 + i3, i2, zA1X, zA1X2));
        }
        return i2;
    }
}
