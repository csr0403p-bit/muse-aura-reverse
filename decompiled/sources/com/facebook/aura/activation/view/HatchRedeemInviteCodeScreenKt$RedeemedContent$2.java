package com.facebook.aura.activation.view;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass011;
import X.BFM;
import X.G0V;
import com.facebook.aura.activation.data.HatchRedeemInviteCodeSuccessCopy;
import kotlin.Unit;

/* loaded from: classes4.dex */
public final class HatchRedeemInviteCodeScreenKt$RedeemedContent$2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ float $bottomPadding;
    public final /* synthetic */ HatchRedeemInviteCodeSuccessCopy $copy;
    public final /* synthetic */ float $topPadding;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchRedeemInviteCodeScreenKt$RedeemedContent$2(HatchRedeemInviteCodeSuccessCopy hatchRedeemInviteCodeSuccessCopy, float f, float f2, int i) {
        super(2);
        this.$copy = hatchRedeemInviteCodeSuccessCopy;
        this.$topPadding = f;
        this.$bottomPadding = f2;
        this.$$changed = i;
    }

    public final void invoke(BFM bfm, int i) {
        HatchRedeemInviteCodeScreenKt.m140RedeemedContent73KfpEQ(this.$copy, this.$topPadding, this.$bottomPadding, bfm, AnonymousClass011.A00(this.$$changed));
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        invoke(bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }
}
