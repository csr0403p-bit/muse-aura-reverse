package com.facebook.aura.activation.view;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.BFM;
import X.G0V;
import X.InterfaceC7353EnQ;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchInviteButtonTooltipKt$HatchInviteButtonTooltip$2$2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ InterfaceC7353EnQ<Unit> $dismiss;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchInviteButtonTooltipKt$HatchInviteButtonTooltip$2$2(InterfaceC7353EnQ<Unit> interfaceC7353EnQ) {
        super(2);
        this.$dismiss = interfaceC7353EnQ;
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        invoke(bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(BFM bfm, int i) {
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(i & 3, 2), bfm, i)) {
            HatchInviteButtonTooltipKt.InviteTooltipBubble((Function0) this.$dismiss, null, bfm, 0, 2);
        } else {
            bfm.Afo();
        }
    }
}
