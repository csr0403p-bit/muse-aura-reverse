package X;

import androidx.datastore.core.SingleProcessDataStore;
import androidx.health.connect.client.impl.HealthConnectClientUpsideDownImpl;
import androidx.health.connect.client.impl.platform.aggregate.HealthConnectClientAggregationExtensionsKt;
import com.facebook.payments.dcp.iap.internal.mutator.IapMutator;
import com.facebook.payments.dcp.xapp.cache.prefetch.IapPrefetchCache;
import com.facebook.payments.dcp.xapp.controller.IapSessionContextController;
import com.facebook.payments.dcp.xapp.controller.productinfo.DcpProductDetailsLoader;
import com.facebook.payments.dcp.xapp.controller.purchase.ConsumePurchaseController;
import com.facebook.rp.platform.calling.CallControllerImpl;
import com.meta.health.core.MetaHealthQuery;
import com.meta.health.core.ObserverAnchorManager;
import java.util.List;

/* renamed from: X.FtU, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8912FtU extends HzP {
    public final int $t;
    public int A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public Object A04;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8912FtU(int i, HtJ<? super C8912FtU> htJ) {
        super(htJ);
        this.$t = i;
    }

    public static void A00(Object obj, Object obj2, C8912FtU c8912FtU, int i) {
        c8912FtU.A01 = obj;
        c8912FtU.A02 = obj2;
        c8912FtU.A00 = i;
    }

    public static void A01(Object obj, C8912FtU c8912FtU) {
        c8912FtU.A03 = obj;
        c8912FtU.A00 |= Integer.MIN_VALUE;
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) throws Throwable {
        switch (this.$t) {
            case 0:
                A01(obj, this);
                return SingleProcessDataStore.A05((SingleProcessDataStore) this.A04, this);
            case 1:
                A01(obj, this);
                return ((HealthConnectClientUpsideDownImpl) this.A04).A48(null, this);
            case 2:
                A01(obj, this);
                return ((HealthConnectClientUpsideDownImpl) this.A04).A49(null, this);
            case 3:
                this.A04 = obj;
                this.A00 |= Integer.MIN_VALUE;
                return HealthConnectClientAggregationExtensionsKt.A02(null, null, this);
            case 4:
                this.A03 = obj;
                int i = this.A00 | Integer.MIN_VALUE;
                this.A00 = i;
                int i2 = i - Integer.MIN_VALUE;
                this.A00 = i2;
                if (i2 == 0) {
                    Hwg.A00(obj);
                    throw BV4.A0a("getPayload");
                }
                if (i2 != 1) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
                List listA03 = IapMutator.A03((F1G) obj);
                if (listA03.isEmpty()) {
                    throw new Throwable("Empty GraphQL results");
                }
                return listA03;
            case 5:
                A01(obj, this);
                return ((IapPrefetchCache.Companion) this.A04).A00(null, null, this);
            case 6:
                A01(obj, this);
                return ((IapPrefetchCache) this.A04).A00(null, this);
            case 7:
                A01(obj, this);
                return ((IapSessionContextController) this.A04).A05(null, this);
            case 8:
                A01(obj, this);
                return ((DcpProductDetailsLoader) this.A04).A04(null, this);
            case 9:
                A01(obj, this);
                return ((ConsumePurchaseController) this.A04).A02(null, null, this);
            case 10:
                A01(obj, this);
                return ((CallControllerImpl) this.A04).Ahl(null, this);
            case 11:
                A01(obj, this);
                return ((MetaHealthQuery) this.A04).A03(null, null, this);
            case 12:
                A01(obj, this);
                return ((MetaHealthQuery) this.A04).A04(null, null, this);
            case 13:
                A01(obj, this);
                return ((ObserverAnchorManager) this.A04).A02(null, this);
            case 14:
                A01(obj, this);
                return ((ObserverAnchorManager) this.A04).A01(null, this);
            case 15:
                A01(obj, this);
                return ((C10648I0s) this.A04).emit(null, this);
            case 16:
                this.A04 = obj;
                this.A00 |= Integer.MIN_VALUE;
                return HyW.A00(null, this, null, null);
            case 17:
                this.A04 = obj;
                this.A00 |= Integer.MIN_VALUE;
                return G62.A00(this, null, null);
            default:
                this.A04 = obj;
                this.A00 |= Integer.MIN_VALUE;
                AbstractC9768Gfn.A00(null, null, this, null);
                throw F60.createAndThrow();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C8912FtU(Object obj, SingleProcessDataStore<T> singleProcessDataStore, HtJ<? super C8912FtU> htJ) {
        super(singleProcessDataStore);
        this.$t = htJ;
        this.A04 = obj;
    }
}
