package X;

import androidx.compose.runtime.PausableMonotonicFrameClock;
import androidx.glance.appwidget.AppWidgetSession;
import androidx.glance.appwidget.GlanceAppWidgetManager;
import androidx.glance.session.SessionManagerImpl$scope$1;
import androidx.glance.state.GlanceState;
import androidx.room.TriggerBasedInvalidationTracker$createFlow$1$2;
import com.facebook.payments.dcp.xapp.billingclient.impl.retriablev2.DcpRetriableBillingClient;

/* renamed from: X.8iP, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C8iP extends HzP {
    public final int $t;
    public int A00;
    public Object A01;
    public Object A02;
    public final Object A03;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C8iP(Object obj, PausableMonotonicFrameClock pausableMonotonicFrameClock, HtJ<? super C8iP> htJ) {
        super(pausableMonotonicFrameClock);
        this.$t = htJ;
        this.A03 = obj;
    }

    public static void A00(Object obj, C8iP c8iP) {
        c8iP.A02 = obj;
        c8iP.A00 |= Integer.MIN_VALUE;
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        int i = this.$t;
        A00(obj, this);
        switch (i) {
            case 0:
                return ((PausableMonotonicFrameClock) this.A03).AiS(null, this);
            case 1:
                return AppWidgetSession.A01(null, (AppWidgetSession) this.A03, null, this);
            case 2:
                return ((AppWidgetSession) this.A03).A06(this);
            case 3:
                return ((GlanceAppWidgetManager) this.A03).A01(null, this);
            case 4:
                return GlanceAppWidgetManager.A00((GlanceAppWidgetManager) this.A03, this);
            case 5:
                return ((SessionManagerImpl$scope$1) this.A03).AP0(null, null, this);
            case 6:
                return ((SessionManagerImpl$scope$1) this.A03).AgK(null, null, this);
            case 7:
                return ((GlanceState) this.A03).A02(null, null, null, this, null);
            case 8:
                return ((TriggerBasedInvalidationTracker$createFlow$1$2) this.A03).emit(this, null);
            case 9:
                return ((DcpRetriableBillingClient) this.A03).A2s(null, this);
            default:
                return ((DcpRetriableBillingClient) this.A03).A6z(null, this);
        }
    }
}
