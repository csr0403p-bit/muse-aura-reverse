package com.facebook.aura.subscription.view;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass011;
import X.BFM;
import X.BRg;
import X.G0V;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class AuraSubscriptionUsageMetersKt$UsageProgressBar$2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ int $$default;
    public final /* synthetic */ long $fillColor;
    public final /* synthetic */ BRg $modifier;
    public final /* synthetic */ float $progress;
    public final /* synthetic */ long $trackColor;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AuraSubscriptionUsageMetersKt$UsageProgressBar$2(float f, long j, long j2, BRg bRg, int i, int i2) {
        super(2);
        this.$progress = f;
        this.$trackColor = j;
        this.$fillColor = j2;
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
        AuraSubscriptionUsageMetersKt.m2275UsageProgressBareopBjH0(this.$progress, this.$trackColor, this.$fillColor, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
    }
}
