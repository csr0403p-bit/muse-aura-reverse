package X;

import com.facebook.payments.dcp.xapp.controller.init.IapSyncController;
import com.facebook.payments.dcp.xapp.controller.productinfo.ProductInfoController;
import com.facebook.payments.dcp.xapp.controller.purchase.IapPrePaymentController;

/* renamed from: X.FtX, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8915FtX extends HzP {
    public final int $t;
    public int A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public Object A04;
    public Object A05;
    public Object A06;
    public Object A07;
    public Object A08;
    public Object A09;
    public final Object A0A;

    public static void A00(C8915FtX c8915FtX) {
        c8915FtX.A01 = null;
        c8915FtX.A02 = null;
        c8915FtX.A03 = null;
        c8915FtX.A04 = null;
        c8915FtX.A05 = null;
        c8915FtX.A06 = null;
        c8915FtX.A07 = null;
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        int i = this.$t;
        this.A09 = obj;
        this.A00 |= Integer.MIN_VALUE;
        switch (i) {
            case 0:
                return IapSyncController.A03((IapSyncController) this.A0A, null, null, this, null);
            case 1:
                return ProductInfoController.A01(null, (ProductInfoController) this.A0A, null, null, null, null, null, this);
            case 2:
                return ((IapPrePaymentController) this.A0A).A01(null, null, null, null, this);
            default:
                return HtY.A01(null, null, null, null, null, this, null, null, (HtY) this.A0A);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C8915FtX(Object obj, IapSyncController iapSyncController, HtJ<? super C8915FtX> htJ) {
        super(iapSyncController);
        this.$t = htJ;
        this.A0A = obj;
    }
}
