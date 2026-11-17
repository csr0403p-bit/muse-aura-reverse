package com.facebook.aura.subscription.view;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass011;
import X.BFM;
import X.BRg;
import X.G0V;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class AuraSubscriptionUsageMetersKt$MeterSkeletonBar$1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ int $$default;
    public final /* synthetic */ BRg $modifier;
    public final /* synthetic */ float $width;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AuraSubscriptionUsageMetersKt$MeterSkeletonBar$1(float f, BRg bRg, int i, int i2) {
        super(2);
        this.$width = f;
        this.$modifier = bRg;
        this.$$changed = i;
        this.$$default = i2;
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        invoke(bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(BFM bfm, int i) {
        AuraSubscriptionUsageMetersKt.m2273MeterSkeletonBarorJrPs(this.$width, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
    }
}
