package com.facebook.aura.subscription.view;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass011;
import X.BFM;
import X.BO4;
import X.BRg;
import X.C1822Arm;
import X.G0V;
import kotlin.Unit;

/* loaded from: classes4.dex */
public final class AuraSubscriptionPaywallBottomSheetKt$TextLineShimmer$3 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ int $$default;
    public final /* synthetic */ float $blockHeight;
    public final /* synthetic */ float $blockWidth;
    public final /* synthetic */ BRg $modifier;
    public final /* synthetic */ BO4 $shimmerState;
    public final /* synthetic */ C1822Arm $style;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AuraSubscriptionPaywallBottomSheetKt$TextLineShimmer$3(C1822Arm c1822Arm, float f, float f2, BO4 bo4, BRg bRg, int i, int i2) {
        super(2);
        this.$style = c1822Arm;
        this.$blockWidth = f;
        this.$blockHeight = f2;
        this.$shimmerState = bo4;
        this.$modifier = bRg;
        this.$$changed = i;
        this.$$default = i2;
    }

    public final void invoke(BFM bfm, int i) {
        AuraSubscriptionPaywallBottomSheetKt.m2272TextLineShimmero3XDK20(this.$style, this.$blockWidth, this.$blockHeight, this.$shimmerState, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        invoke(bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }
}
