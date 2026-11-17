package com.facebook.aura.subscription.view;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass011;
import X.BFM;
import X.BRg;
import X.G0V;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class AuraSubscriptionUsageMetersKt$UsageCtaRow$2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ int $$default;
    public final /* synthetic */ long $color;
    public final /* synthetic */ boolean $enabled;
    public final /* synthetic */ Integer $leadingIconRes;
    public final /* synthetic */ boolean $loading;
    public final /* synthetic */ String $loadingContentDescription;
    public final /* synthetic */ BRg $modifier;
    public final /* synthetic */ Function0<Unit> $onClick;
    public final /* synthetic */ boolean $showChevron;
    public final /* synthetic */ String $text;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AuraSubscriptionUsageMetersKt$UsageCtaRow$2(String str, Function0<Unit> function0, BRg bRg, long j, Integer num, boolean z, boolean z2, String str2, boolean z3, int i, int i2) {
        super(2);
        this.$text = str;
        this.$onClick = function0;
        this.$modifier = bRg;
        this.$color = j;
        this.$leadingIconRes = num;
        this.$showChevron = z;
        this.$loading = z2;
        this.$loadingContentDescription = str2;
        this.$enabled = z3;
        this.$$changed = i;
        this.$$default = i2;
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        invoke(bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(BFM bfm, int i) {
        AuraSubscriptionUsageMetersKt.m2274UsageCtaRowgF0flNs(this.$text, this.$onClick, this.$modifier, this.$color, this.$leadingIconRes, this.$showChevron, this.$loading, this.$loadingContentDescription, this.$enabled, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
    }
}
