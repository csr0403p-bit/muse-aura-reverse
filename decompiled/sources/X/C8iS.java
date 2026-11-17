package X;

import androidx.datastore.core.DataMigrationInitializer$Companion;
import androidx.glance.appwidget.GlanceAppWidgetKt;
import androidx.glance.appwidget.GlanceRemoteViews;
import com.facebook.payments.dcp.xapp.billingclient.impl.retriablev2.DcpRetriableBillingClient;

/* renamed from: X.8iS, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C8iS extends HzP {
    public final int $t;
    public int A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public Object A04;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C8iS(Object obj, DataMigrationInitializer$Companion dataMigrationInitializer$Companion, HtJ<? super C8iS> htJ) {
        super(dataMigrationInitializer$Companion);
        this.$t = htJ;
        this.A04 = obj;
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        switch (this.$t) {
            case 0:
                this.A03 = obj;
                this.A00 |= Integer.MIN_VALUE;
                return DataMigrationInitializer$Companion.A00((DataMigrationInitializer$Companion) this.A04, null, null, this);
            case 1:
                this.A04 = obj;
                this.A00 |= Integer.MIN_VALUE;
                return GlanceAppWidgetKt.A00(null, null, this);
            case 2:
                this.A03 = obj;
                this.A00 |= Integer.MIN_VALUE;
                return GlanceRemoteViews.A00(null, (GlanceRemoteViews) this.A04, this);
            default:
                this.A03 = obj;
                this.A00 |= Integer.MIN_VALUE;
                return ((DcpRetriableBillingClient) this.A04).APU(null, null, this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8iS(HtJ<? super C8iS> htJ) {
        super(htJ);
        this.$t = 1;
    }
}
