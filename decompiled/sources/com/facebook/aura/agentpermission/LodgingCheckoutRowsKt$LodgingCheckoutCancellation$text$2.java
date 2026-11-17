package com.facebook.aura.agentpermission;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass011;
import X.BFM;
import X.BRg;
import X.G0V;
import com.facebook.aura.gateway.CheckoutLodgingCancellation;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public final class LodgingCheckoutRowsKt$LodgingCheckoutCancellation$text$2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ int $$default;
    public final /* synthetic */ CheckoutLodgingCancellation $cancellation;
    public final /* synthetic */ BRg $modifier;
    public final /* synthetic */ Function0<Unit> $onShowPolicy;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LodgingCheckoutRowsKt$LodgingCheckoutCancellation$text$2(CheckoutLodgingCancellation checkoutLodgingCancellation, Function0<Unit> function0, BRg bRg, int i, int i2) {
        super(2);
        this.$cancellation = checkoutLodgingCancellation;
        this.$onShowPolicy = function0;
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
        LodgingCheckoutRowsKt.LodgingCheckoutCancellation(this.$cancellation, this.$onShowPolicy, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
    }
}
