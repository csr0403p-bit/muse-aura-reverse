package X;

import androidx.glance.session.SessionWorkerKt;
import com.facebook.payments.dcp.iap.internal.bloksbridge.IapBloksBridge;
import com.facebook.payments.dcp.iap.internal.mutator.IapMutator;
import com.facebook.payments.dcp.xapp.controller.prefetch.IapPrefetchDataController;
import com.facebook.payments.dcp.xapp.controller.productinfo.ProductInfoController;
import com.meta.health.healthconnect.HealthConnectPlugin;

/* loaded from: classes6.dex */
public final class FtK extends HzP {
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FtK(HtJ<? super FtK> htJ) {
        super(htJ);
        this.$t = 0;
    }

    public static void A01(FtK ftK) {
        ftK.A01 = null;
        ftK.A02 = null;
        ftK.A03 = null;
        ftK.A04 = null;
        ftK.A05 = null;
    }

    public static void A00(Object obj, FtK ftK) {
        ftK.A08 = obj;
        ftK.A00 |= Integer.MIN_VALUE;
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        switch (this.$t) {
            case 0:
                this.A09 = obj;
                this.A00 |= Integer.MIN_VALUE;
                return SessionWorkerKt.A00(null, null, null, null, this, null);
            case 1:
                A00(obj, this);
                return IapBloksBridge.A00(null, (IapBloksBridge) this.A09, null, null, null, this);
            case 2:
                A00(obj, this);
                return ((IapMutator) this.A09).A05(null, null, null, null, null, this);
            case 3:
                A00(obj, this);
                return IapPrefetchDataController.A00(null, (IapPrefetchDataController) this.A09, null, null, this);
            case 4:
                A00(obj, this);
                return ProductInfoController.A02((ProductInfoController) this.A09, null, null, null, null, null, null, this);
            case 5:
                A00(obj, this);
                return ((HealthConnectPlugin) this.A09).AB7(null, this);
            case 6:
                A00(obj, this);
                return ((HealthConnectPlugin) this.A09).ARY(null, this);
            default:
                A00(obj, this);
                return ((HealthConnectPlugin) this.A09).ARZ(null, this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public FtK(Object obj, IapBloksBridge iapBloksBridge, HtJ<? super FtK> htJ) {
        super(iapBloksBridge);
        this.$t = htJ;
        this.A09 = obj;
    }
}
