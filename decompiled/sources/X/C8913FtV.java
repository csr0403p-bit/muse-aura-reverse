package X;

import androidx.datastore.core.SingleProcessDataStore;
import androidx.health.connect.client.impl.HealthConnectClientUpsideDownImpl;
import com.facebook.payments.dcp.xapp.controller.IapSessionContextController;
import com.facebook.payments.dcp.xapp.controller.init.IapSyncController;
import com.facebook.payments.dcp.xapp.controller.prefetch.IapPrefetchDataController;
import com.facebook.payments.dcp.xapp.controller.quote.IapQuoteController;

/* renamed from: X.FtV, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8913FtV extends HzP {
    public final int $t;
    public int A00;
    public Object A01;
    public Object A02;
    public final Object A03;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C8913FtV(Object obj, SingleProcessDataStore<T> singleProcessDataStore, HtJ<? super C8913FtV> htJ) {
        super(singleProcessDataStore);
        this.$t = htJ;
        this.A03 = obj;
    }

    public static void A00(Object obj, C8913FtV c8913FtV) {
        c8913FtV.A02 = obj;
        c8913FtV.A00 |= Integer.MIN_VALUE;
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        int i = this.$t;
        A00(obj, this);
        switch (i) {
            case 0:
                return ((C10646I0q) this.A03).emit(null, this);
            case 1:
                return SingleProcessDataStore.A02((SingleProcessDataStore) this.A03, this);
            case 2:
                return SingleProcessDataStore.A03((SingleProcessDataStore) this.A03, this);
            case 3:
                return ((HealthConnectClientUpsideDownImpl) this.A03).ADV(null, this);
            case 4:
                return ((IapSessionContextController) this.A03).A04(null, this);
            case 5:
                return IapSessionContextController.A00(null, (IapSessionContextController) this.A03, this);
            case 6:
                return IapSyncController.A01(null, (IapSyncController) this.A03, this);
            case 7:
                return IapPrefetchDataController.A02(null, (IapPrefetchDataController) this.A03, this);
            case 8:
                return IapQuoteController.A00(null, (IapQuoteController) this.A03, this);
            case 9:
                return ((C10647I0r) this.A03).emit(null, this);
            default:
                return ((C10648I0s) this.A03).emit(null, this);
        }
    }
}
