package X;

import androidx.datastore.core.SingleProcessDataStore;
import androidx.health.connect.client.impl.platform.aggregate.HealthConnectClientAggregationExtensionsKt;
import androidx.room.coroutines.PooledConnectionImpl;
import com.facebook.payments.dcp.xapp.controller.IapController;
import com.facebook.payments.dcp.xapp.controller.IapSessionContextController;
import com.facebook.payments.dcp.xapp.controller.init.IapSyncController;
import com.facebook.payments.dcp.xapp.controller.prefetch.IapPrefetchDataController;
import com.facebook.payments.dcp.xapp.controller.purchase.IapPaymentController;
import com.facebook.payments.dcp.xapp.controller.purchase.IapPurchaseController;
import com.facebook.payments.dcp.xapp.controller.purchase.IapVerifyPurchaseController;
import com.facebook.payments.dcp.xapp.controller.quote.IapQuoteController;
import com.facebook.rsys.sdk.RsysSdkImpl;
import com.meta.health.core.ObserverAnchorManager;

/* renamed from: X.FtT, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8911FtT extends HzP {
    public final int $t;
    public int A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public Object A04;
    public Object A05;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8911FtT(HtJ<? super C8911FtT> htJ) {
        super(htJ);
        this.$t = 3;
    }

    public static void A00(Object obj, Object obj2, Object obj3, C8911FtT c8911FtT, int i) {
        c8911FtT.A01 = obj;
        c8911FtT.A02 = obj2;
        c8911FtT.A03 = obj3;
        c8911FtT.A00 = i;
    }

    public static void A01(Object obj, C8911FtT c8911FtT) {
        c8911FtT.A04 = obj;
        c8911FtT.A00 |= Integer.MIN_VALUE;
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        HsD<String> hsD;
        switch (this.$t) {
            case 0:
                A01(obj, this);
                return SingleProcessDataStore.A00((C9772Gfs) null, (SingleProcessDataStore) this.A05, this);
            case 1:
                A01(obj, this);
                return SingleProcessDataStore.A04((SingleProcessDataStore) this.A05, this);
            case 2:
                A01(obj, this);
                return SingleProcessDataStore.A06((SingleProcessDataStore) this.A05, this, null, null);
            case 3:
                this.A05 = obj;
                this.A00 |= Integer.MIN_VALUE;
                return HealthConnectClientAggregationExtensionsKt.A03(null, null, this);
            case 4:
                A01(obj, this);
                return ((PooledConnectionImpl) this.A05).AiF(null, null, this);
            case 5:
                A01(obj, this);
                return IapController.A00((IapController) this.A05, null, this);
            case 6:
                this.A04 = obj;
                int i = this.A00 | Integer.MIN_VALUE;
                this.A00 = i;
                IapSessionContextController iapSessionContextController = (IapSessionContextController) this.A05;
                int i2 = i - Integer.MIN_VALUE;
                this.A00 = i2;
                if (i2 == 0) {
                    Hwg.A00(obj);
                    HuV<String> huV = iapSessionContextController.A00.A01;
                    synchronized (huV.A02) {
                        hsD = huV.A00;
                    }
                } else {
                    if (i2 != 1) {
                        throw AnonymousClass001.A0n();
                    }
                    Hwg.A00(obj);
                    Hsa hsa = (Hsa) obj;
                    if (hsa == null || !(hsa instanceof HsD)) {
                        return null;
                    }
                    hsD = (HsD) hsa;
                }
                if (hsD != null) {
                    return hsD.A00;
                }
                return null;
            case 7:
                A01(obj, this);
                return ((IapSyncController) this.A05).A06(null, this, null);
            case 8:
                A01(obj, this);
                return IapPrefetchDataController.A03((IapPrefetchDataController) this.A05, null, null, null, this);
            case 9:
                A01(obj, this);
                return ((IapPaymentController) this.A05).A03(null, null, null, this);
            case 10:
                A01(obj, this);
                return ((IapPurchaseController) this.A05).A01(null, null, this);
            case 11:
                A01(obj, this);
                return ((IapVerifyPurchaseController) this.A05).A01(null, null, null, this);
            case 12:
                A01(obj, this);
                return IapQuoteController.A04(null, (IapQuoteController) this.A05, null, this);
            case 13:
                A01(obj, this);
                return IapQuoteController.A05((IapQuoteController) this.A05, null, this);
            case 14:
                A01(obj, this);
                return ((RsysSdkImpl) this.A05).Ahm(null, null, this);
            default:
                A01(obj, this);
                return ((ObserverAnchorManager) this.A05).A00(null, null, this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C8911FtT(Object obj, SingleProcessDataStore<T> singleProcessDataStore, HtJ<? super C8911FtT> htJ) {
        super(singleProcessDataStore);
        this.$t = htJ;
        this.A05 = obj;
    }
}
