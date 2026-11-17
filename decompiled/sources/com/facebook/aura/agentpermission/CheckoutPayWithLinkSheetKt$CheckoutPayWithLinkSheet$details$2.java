package com.facebook.aura.agentpermission;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass011;
import X.BFM;
import X.G0V;
import kotlin.Unit;

/* loaded from: classes2.dex */
public final class CheckoutPayWithLinkSheetKt$CheckoutPayWithLinkSheet$details$2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ String $approvalId;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CheckoutPayWithLinkSheetKt$CheckoutPayWithLinkSheet$details$2(String str, int i) {
        super(2);
        this.$approvalId = str;
        this.$$changed = i;
    }

    public final void invoke(BFM bfm, int i) {
        CheckoutPayWithLinkSheetKt.CheckoutPayWithLinkSheet(this.$approvalId, bfm, AnonymousClass011.A00(this.$$changed));
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        invoke(bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }
}
