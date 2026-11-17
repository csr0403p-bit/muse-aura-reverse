package com.facebook.aura.subscription.view;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass011;
import X.BFM;
import X.BRg;
import X.G0V;
import com.facebook.aura.subscription.repo.ComplimentaryRedeemPage;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class AuraComplimentaryRedeemScreenKt$ComplimentaryRedeemFooter$2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ int $$default;
    public final /* synthetic */ float $bottomPadding;
    public final /* synthetic */ boolean $isRedeeming;
    public final /* synthetic */ BRg $modifier;
    public final /* synthetic */ Function0<Unit> $onRedeem;
    public final /* synthetic */ ComplimentaryRedeemPage $page;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AuraComplimentaryRedeemScreenKt$ComplimentaryRedeemFooter$2(ComplimentaryRedeemPage complimentaryRedeemPage, boolean z, Function0<Unit> function0, float f, BRg bRg, int i, int i2) {
        super(2);
        this.$page = complimentaryRedeemPage;
        this.$isRedeeming = z;
        this.$onRedeem = function0;
        this.$bottomPadding = f;
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
        AuraComplimentaryRedeemScreenKt.m2268ComplimentaryRedeemFooterhGBTI10(this.$page, this.$isRedeeming, this.$onRedeem, this.$bottomPadding, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
    }
}
