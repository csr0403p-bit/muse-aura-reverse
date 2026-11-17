package com.facebook.aura.agentpermission;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass011;
import X.BFM;
import X.G0V;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class CheckoutApprovalCardKt$CheckoutReviewOrderFavicon$1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ String $faviconUri;
    public final /* synthetic */ long $tint;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CheckoutApprovalCardKt$CheckoutReviewOrderFavicon$1(String str, long j, int i) {
        super(2);
        this.$faviconUri = str;
        this.$tint = j;
        this.$$changed = i;
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        invoke(bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(BFM bfm, int i) {
        CheckoutApprovalCardKt.m183CheckoutReviewOrderFaviconRPmYEkk(this.$faviconUri, this.$tint, bfm, AnonymousClass011.A00(this.$$changed));
    }
}
