package X;

import androidx.datastore.core.SingleProcessDataStore;
import androidx.datastore.core.SingleProcessDataStore$readAndInit$api$1;
import com.facebook.maps.ui.places.MetaPlaceDetailsService;
import com.facebook.payments.dcp.xapp.billingclient.impl.v9.QueryDcpProductDetailsV9Kt;
import com.facebook.payments.dcp.xapp.controller.purchase.ConsumePurchaseController;
import com.facebook.payments.dcp.xapp.controller.quote.IapQuoteController;
import com.meta.health.healthconnect.HealthConnectPlugin;

/* renamed from: X.FtO, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8906FtO extends HzP {
    public final int $t;
    public int A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public Object A04;
    public Object A05;
    public Object A06;
    public Object A07;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8906FtO(HtJ<? super C8906FtO> htJ) {
        super(htJ);
        this.$t = 3;
    }

    public static void A00(Object obj, C8906FtO c8906FtO) {
        c8906FtO.A06 = obj;
        c8906FtO.A00 |= Integer.MIN_VALUE;
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        switch (this.$t) {
            case 0:
                A00(obj, this);
                return ((SingleProcessDataStore$readAndInit$api$1) this.A07).Ahr(null, this);
            case 1:
                A00(obj, this);
                return ((SingleProcessDataStore) this.A07).A07(null, this);
            case 2:
                A00(obj, this);
                return ((MetaPlaceDetailsService) this.A07).A00(null, null, this);
            case 3:
                this.A07 = obj;
                this.A00 |= Integer.MIN_VALUE;
                return QueryDcpProductDetailsV9Kt.A00(null, null, this);
            case 4:
                A00(obj, this);
                return ConsumePurchaseController.A00((ConsumePurchaseController) this.A07, null, null, null, this);
            case 5:
                A00(obj, this);
                return IapQuoteController.A01(null, (IapQuoteController) this.A07, null, null, this);
            case 6:
                A00(obj, this);
                return IapQuoteController.A03(null, (IapQuoteController) this.A07, null, this);
            case 7:
                A00(obj, this);
                return ((HealthConnectPlugin) this.A07).AB3(null, this);
            case 8:
                A00(obj, this);
                return ((HealthConnectPlugin) this.A07).AB5(null, this);
            case 9:
                A00(obj, this);
                return HealthConnectPlugin.A06(null, null, (HealthConnectPlugin) this.A07, null, null, null, this);
            case 10:
                A00(obj, this);
                return C9290GCr.A01(this, null, (C9290GCr) this.A07);
            case 11:
                A00(obj, this);
                return ((C9286GCn) this.A07).collect(null, this);
            default:
                A00(obj, this);
                return ((EOB) this.A07).A02(null, null, null, this, null);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C8906FtO(Object obj, SingleProcessDataStore$readAndInit$api$1 singleProcessDataStore$readAndInit$api$1, HtJ<? super C8906FtO> htJ) {
        super(singleProcessDataStore$readAndInit$api$1);
        this.$t = htJ;
        this.A07 = obj;
    }
}
