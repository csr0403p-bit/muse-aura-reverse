package X;

import android.content.Context;
import android.os.Bundle;
import androidx.glance.appwidget.GlanceAppWidget;
import com.facebook.payments.dcp.xapp.billingclient.impl.auto.DcpAutoBillingClient;
import kotlin.Unit;

/* renamed from: X.8il, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C07328il extends AbstractC07127nr implements G0V {
    public final int $t = 0;
    public int A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public boolean A04;
    public final Object A05;
    public final Object A06;
    public final Object A07;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Incorrect types in method signature: (Landroid/content/Context;LX/6vW;Landroidx/glance/appwidget/GlanceAppWidget;Landroid/os/Bundle;LX/G2j<-LX/76p;-Landroidx/glance/appwidget/AppWidgetSession;-Ljava/lang/Boolean;-LX/HtJ<-TT;>;+Ljava/lang/Object;>;LX/HtJ<-LX/8il;>;)V */
    public C07328il(Context context, Bundle bundle, C6vW c6vW, GlanceAppWidget glanceAppWidget, HtJ htJ, G2j g2j) {
        super(2, htJ);
        this.A06 = context;
        this.A01 = c6vW;
        this.A07 = glanceAppWidget;
        this.A02 = bundle;
        this.A05 = g2j;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        if (this.$t != 0) {
            return new C07328il((DcpAutoBillingClient) this.A07, htJ, (G0U) this.A05, (G0V) this.A06, this.A04);
        }
        C07328il c07328il = new C07328il((Context) this.A06, (Bundle) this.A02, (C6vW) this.A01, (GlanceAppWidget) this.A07, htJ, (G2j) this.A05);
        c07328il.A03 = obj;
        return c07328il;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0088 A[Catch: all -> 0x00b8, TRY_LEAVE, TryCatch #2 {all -> 0x00b8, blocks: (B:26:0x0077, B:27:0x007a, B:29:0x0088, B:33:0x009a), top: B:74:0x0077 }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x009a A[Catch: all -> 0x00b8, TRY_ENTER, TryCatch #2 {all -> 0x00b8, blocks: (B:26:0x0077, B:27:0x007a, B:29:0x0088, B:33:0x009a), top: B:74:0x0077 }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00b1 A[Catch: all -> 0x00c5, TRY_ENTER, TRY_LEAVE, TryCatch #0 {, blocks: (B:38:0x00b1, B:44:0x00c0, B:32:0x0095, B:17:0x0035), top: B:71:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00d8 A[PHI: r12
  0x00d8: PHI (r12v4 java.lang.Object) = (r12v3 java.lang.Object), (r12v0 java.lang.Object) binds: [B:67:0x015e, B:54:0x00d5] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0160 A[RETURN] */
    @Override // X.AbstractC8884Fsp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 355
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C07328il.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.G0V
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((C07328il) AbstractC07127nr.A09(obj2, obj, this)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Incorrect types in method signature: (Lcom/facebook/payments/dcp/xapp/billingclient/impl/auto/DcpAutoBillingClient;ZLX/G0U<-LX/HoG;+TT;>;LX/G0V<-Lcom/facebook/payments/dcp/xapp/billingclient/impl/retriablev2/DcpRetriableBillingClient;-LX/HtJ<-TT;>;+Ljava/lang/Object;>;LX/HtJ<-LX/8il;>;)V */
    public C07328il(DcpAutoBillingClient dcpAutoBillingClient, HtJ htJ, G0U g0u, G0V g0v, boolean z) {
        super(2, htJ);
        this.A07 = dcpAutoBillingClient;
        this.A04 = z;
        this.A05 = g0u;
        this.A06 = g0v;
    }
}
