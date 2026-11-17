package com.facebook.aura.ageverification;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass011;
import X.BFM;
import X.BRg;
import X.G0V;
import kotlin.Unit;

/* loaded from: classes2.dex */
public final class AgeStepMessageKt$AgeStepMessage$2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ int $$default;
    public final /* synthetic */ Integer $bodyRes;
    public final /* synthetic */ String $bodyText;
    public final /* synthetic */ Integer $iconRes;
    public final /* synthetic */ long $iconTint;
    public final /* synthetic */ BRg $modifier;
    public final /* synthetic */ AgeStepAction $primary;
    public final /* synthetic */ boolean $primaryLoading;
    public final /* synthetic */ AgeStepAction $secondary;
    public final /* synthetic */ boolean $showSpinner;
    public final /* synthetic */ Integer $titleRes;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AgeStepMessageKt$AgeStepMessage$2(BRg bRg, Integer num, Integer num2, boolean z, AgeStepAction ageStepAction, boolean z2, AgeStepAction ageStepAction2, Integer num3, long j, String str, int i, int i2) {
        super(2);
        this.$modifier = bRg;
        this.$titleRes = num;
        this.$bodyRes = num2;
        this.$showSpinner = z;
        this.$primary = ageStepAction;
        this.$primaryLoading = z2;
        this.$secondary = ageStepAction2;
        this.$iconRes = num3;
        this.$iconTint = j;
        this.$bodyText = str;
        this.$$changed = i;
        this.$$default = i2;
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        invoke(bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(BFM bfm, int i) {
        AgeStepMessageKt.m208AgeStepMessageFItCLgY(this.$modifier, this.$titleRes, this.$bodyRes, this.$showSpinner, this.$primary, this.$primaryLoading, this.$secondary, this.$iconRes, this.$iconTint, this.$bodyText, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
    }
}
