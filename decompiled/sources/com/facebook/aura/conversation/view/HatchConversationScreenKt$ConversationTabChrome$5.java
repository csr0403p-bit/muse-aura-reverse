package com.facebook.aura.conversation.view;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass004;
import X.BFM;
import X.C1DG;
import X.G0W;
import X.G2j;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class HatchConversationScreenKt$ConversationTabChrome$5 extends AbstractC7559F3s implements G0W<C1DG, BFM, Integer, Unit> {
    public final /* synthetic */ G2j<C1DG, C1DG, BFM, Integer, Unit> $content;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HatchConversationScreenKt$ConversationTabChrome$5(G2j<? super C1DG, ? super C1DG, ? super BFM, ? super Integer, Unit> g2j) {
        super(3);
        this.$content = g2j;
    }

    @Override // X.G0W
    public /* bridge */ /* synthetic */ Unit invoke(C1DG c1dg, BFM bfm, Integer num) {
        m571invoke8Feqmps(c1dg.A00, bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    /* renamed from: invoke-8Feqmps, reason: not valid java name */
    public final void m571invoke8Feqmps(float f, BFM bfm, int i) {
        if ((i & 6) == 0) {
            i |= AnonymousClass004.A04(bfm, f);
        }
        if (!AnonymousClass001.A1b(AnonymousClass004.A1H(i), bfm, i)) {
            bfm.Afo();
        } else {
            AnonymousClass001.A1F(new C1DG(f), C1DG.A03(), bfm, this.$content, (i & 14) | 48);
        }
    }
}
