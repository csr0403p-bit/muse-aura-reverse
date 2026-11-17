package com.facebook.aura.subscription.view;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass011;
import X.BFM;
import X.BRg;
import X.G0V;
import com.facebook.aura.subscription.repo.ComplimentaryRedeemPage;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class AuraComplimentaryRedeemScreenKt$ComplimentaryRedeemBody$2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ int $$default;
    public final /* synthetic */ BRg $modifier;
    public final /* synthetic */ ComplimentaryRedeemPage $page;
    public final /* synthetic */ float $topPadding;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AuraComplimentaryRedeemScreenKt$ComplimentaryRedeemBody$2(ComplimentaryRedeemPage complimentaryRedeemPage, float f, BRg bRg, int i, int i2) {
        super(2);
        this.$page = complimentaryRedeemPage;
        this.$topPadding = f;
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
        AuraComplimentaryRedeemScreenKt.m2267ComplimentaryRedeemBodyuFdPcIQ(this.$page, this.$topPadding, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
    }
}
