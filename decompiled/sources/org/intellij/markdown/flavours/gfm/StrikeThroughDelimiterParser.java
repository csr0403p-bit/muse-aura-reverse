package org.intellij.markdown.flavours.gfm;

import X.AbstractC7607F5u;
import X.AbstractC9212G6s;
import X.AbstractC9213G6t;
import X.AnonymousClass001;
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
import org.intellij.markdown.parser.sequentialparsers.impl.EmphStrongDelimiterParser;

/* loaded from: classes6.dex */
public final class StrikeThroughDelimiterParser extends G83 {
    @Override // X.G83
    public final void process(G7B g7b, G75 g75, List<G86> list, G8K g8k) {
        C7384Etj.A0Y(list, 2);
        C7384Etj.A0Y(g8k, 3);
        int size = list.size() - 1;
        while (size > 0) {
            G86 g86 = list.get(size);
            if (g86.A06.equals(AbstractC9213G6t.A06) && g86.A01 != -1) {
                int i = list.get(size).A01;
                int i2 = 1;
                while (EmphStrongDelimiterParser.A01(list, size, i)) {
                    size--;
                    i++;
                    i2++;
                }
                if (i2 < 3) {
                    G7A.A02(AbstractC7607F5u.A1C(list.get(size).A05, list.get(i).A05 + 1), AbstractC9212G6s.A05, g8k);
                }
            }
            size--;
        }
    }

    @Override // X.G83
    public final int scan(G7B g7b, G75 g75, List<G86> list) {
        boolean zA1Z = AnonymousClass005.A1Z(g7b, g75, list);
        G72 g72A02 = G75.A02(g75, 0);
        G72 g72 = AbstractC9213G6t.A06;
        if (!C7384Etj.areEqual(g72A02, g72)) {
            return 0;
        }
        G75 g75A07 = g75;
        int i = 0;
        int i2 = 1;
        while (C7384Etj.areEqual(g75A07.A06(zA1Z ? 1 : 0), g72)) {
            g75A07 = g75A07.A07();
            i2++;
            i++;
            if (i >= 50) {
                break;
            }
        }
        HxE<Boolean, Boolean> hxECanOpenClose = canOpenClose(g7b, g75, g75A07, zA1Z);
        boolean zA1X = AnonymousClass001.A1X(hxECanOpenClose.first);
        boolean zA1X2 = AnonymousClass001.A1X(hxECanOpenClose.second);
        for (int i3 = 0; i3 < i2; i3++) {
            list.add(new G86(g72, '~', g75.A00 + i3, 0, zA1X, zA1X2));
        }
        return i2;
    }
}
