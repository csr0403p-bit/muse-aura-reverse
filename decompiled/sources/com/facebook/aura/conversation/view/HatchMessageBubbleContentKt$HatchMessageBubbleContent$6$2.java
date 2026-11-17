package com.facebook.aura.conversation.view;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass004;
import X.BFM;
import X.BRg;
import X.G0W;
import X.G2j;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class HatchMessageBubbleContentKt$HatchMessageBubbleContent$6$2 extends AbstractC7559F3s implements G2j<BRg, Boolean, BFM, Integer, Unit> {
    public final /* synthetic */ G0W<BRg, BFM, Integer, Unit> $mediaGrid;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HatchMessageBubbleContentKt$HatchMessageBubbleContent$6$2(G0W<? super BRg, ? super BFM, ? super Integer, Unit> g0w) {
        super(4);
        this.$mediaGrid = g0w;
    }

    public final void invoke(BRg bRg, boolean z, BFM bfm, int i) {
        if (AnonymousClass002.A0B(bRg, i) == 0) {
            i |= AnonymousClass004.A0d(bfm, bRg);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(i & 131, 130), bfm, i)) {
            AnonymousClass001.A1G(bRg, bfm, this.$mediaGrid, (i & 14) | 48);
        } else {
            bfm.Afo();
        }
    }

    @Override // X.G2j
    public /* bridge */ /* synthetic */ Unit invoke(BRg bRg, Boolean bool, BFM bfm, Integer num) {
        invoke(bRg, AnonymousClass001.A1X(bool), bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }
}
