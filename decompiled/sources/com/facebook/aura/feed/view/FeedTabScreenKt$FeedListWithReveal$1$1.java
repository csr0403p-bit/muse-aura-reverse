package com.facebook.aura.feed.view;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.BFM;
import X.BRg;
import X.C06G;
import X.C3Ue;
import X.G0V;
import X.InterfaceC05151eP;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class FeedTabScreenKt$FeedListWithReveal$1$1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ InterfaceC05151eP $this_Box;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FeedTabScreenKt$FeedListWithReveal$1$1(InterfaceC05151eP interfaceC05151eP) {
        super(2);
        this.$this_Box = interfaceC05151eP;
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        invoke(bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(BFM bfm, int i) {
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(i & 3, 2), bfm, i)) {
            C3Ue.A04(C06G.A0N(bfm, this.$this_Box.AQJ(BRg.A00)), bfm, 0);
        } else {
            bfm.Afo();
        }
    }
}
