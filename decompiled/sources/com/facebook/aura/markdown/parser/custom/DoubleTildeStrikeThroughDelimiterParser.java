package com.facebook.aura.markdown.parser.custom;

import X.AbstractC0878AGe;
import X.AnonymousClass005;
import X.G75;
import X.G7B;
import X.G83;
import X.G86;
import X.G8K;
import java.util.List;
import org.intellij.markdown.flavours.gfm.StrikeThroughDelimiterParser;

/* loaded from: classes6.dex */
public final class DoubleTildeStrikeThroughDelimiterParser extends G83 {
    public final StrikeThroughDelimiterParser gfmParser = new StrikeThroughDelimiterParser();

    @Override // X.G83
    public int scan(G7B g7b, G75 g75, List<G86> list) {
        boolean zA1Z = AnonymousClass005.A1Z(g7b, g75, list);
        int iScan = this.gfmParser.scan(g7b, g75, list);
        if (iScan == zA1Z) {
            G86 g86 = (G86) AbstractC0878AGe.A0H(list);
            g86.A03 = false;
            g86.A02 = false;
        }
        return iScan;
    }

    @Override // X.G83
    public void process(G7B g7b, G75 g75, List<G86> list, G8K g8k) {
        AnonymousClass005.A14(g7b, g75, list, g8k);
        this.gfmParser.process(g7b, g75, list, g8k);
    }
}
