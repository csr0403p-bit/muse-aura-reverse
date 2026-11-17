package com.facebook.aura.agentpermission;

import X.AbstractC0878AGe;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.ApQ;
import X.C0jP;
import X.C1733ApU;
import X.C1OR;
import X.CFK;
import X.FGI;
import X.G0U;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class CheckoutRowPrimitivesKt$CheckoutLegalFooter$2$1 extends AbstractC7559F3s implements G0U<Integer, Unit> {
    public final /* synthetic */ ApQ $text;
    public final /* synthetic */ C0jP $uriHandler;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CheckoutRowPrimitivesKt$CheckoutLegalFooter$2$1(ApQ apQ, C0jP c0jP) {
        super(1);
        this.$text = apQ;
        this.$uriHandler = c0jP;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void invoke(int i) {
        C1733ApU c1733ApU = (C1733ApU) AbstractC0878AGe.A0G(this.$text.A04(i, i));
        if (c1733ApU != null) {
            C0jP c0jP = this.$uriHandler;
            String str = ((C1OR) c1733ApU.A02).A00;
            try {
                c0jP.openUri(str);
            } catch (Exception e) {
                CFK.A0A(CheckoutRowPrimitivesKt.TAG, FGI.A0M("Failed to open checkout legal URL: ", str), e);
            }
        }
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(Integer num) {
        invoke(AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }
}
