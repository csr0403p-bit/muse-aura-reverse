package X;

import android.app.Activity;
import android.content.Context;
import androidx.glance.session.Session;
import androidx.glance.session.SessionWorker;
import androidx.glance.session.SessionWorkerKt;
import com.facebook.payments.dcp.xapp.billingclient.impl.retriablev2.DcpRetriableBillingClient;
import kotlin.Unit;

/* renamed from: X.8ig, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C07278ig extends AbstractC07127nr implements G0U {
    public final int $t;
    public int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C07278ig(Object obj, DcpRetriableBillingClient dcpRetriableBillingClient, Activity activity, C79e c79e, HtJ<? super C07278ig> htJ) {
        super(1, c79e);
        this.$t = htJ;
        this.A03 = dcpRetriableBillingClient;
        this.A01 = obj;
        this.A02 = activity;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(HtJ<?> htJ) {
        Object obj;
        Object obj2;
        Object obj3;
        int i;
        if (this.$t != 0) {
            obj2 = this.A03;
            obj = this.A01;
            obj3 = this.A02;
            i = 1;
        } else {
            obj = this.A01;
            obj2 = this.A03;
            obj3 = this.A02;
            i = 0;
        }
        return new C07278ig(obj, obj2, obj3, htJ, i);
    }

    @Override // X.G0U
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return ((C07278ig) create((HtJ) obj)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        if (this.$t != 0) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            if (this.A00 != 0) {
                Hwg.A00(obj);
            } else {
                Hwg.A00(obj);
                DcpRetriableBillingClient dcpRetriableBillingClient = (DcpRetriableBillingClient) this.A03;
                C78T c78t = dcpRetriableBillingClient.A03.A03;
                C07268if c07268if = new C07268if(this.A01, dcpRetriableBillingClient, this.A02, null, 7);
                this.A00 = 1;
                obj = GAo.A00(this, c78t, c07268if);
                if (obj == enumC10460Hji) {
                    return enumC10460Hji;
                }
            }
            return obj;
        }
        EnumC10460Hji enumC10460Hji2 = EnumC10460Hji.A02;
        if (this.A00 != 0) {
            Hwg.A00(obj);
        } else {
            Hwg.A00(obj);
            C77Q c77q = (C77Q) this.A01;
            SessionWorker sessionWorker = (SessionWorker) this.A03;
            Context context = sessionWorker.mAppContext;
            Session session = (Session) this.A02;
            C066277e c066277e = sessionWorker.A02;
            C8i4 c8i4 = new C8i4(sessionWorker, 4);
            this.A00 = 1;
            if (SessionWorkerKt.A00(context, session, c066277e, c77q, this, c8i4) == enumC10460Hji2) {
                return enumC10460Hji2;
            }
        }
        return new C77i();
    }
}
