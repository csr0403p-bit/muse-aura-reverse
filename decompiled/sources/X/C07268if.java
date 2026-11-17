package X;

import android.app.Activity;
import com.facebook.payments.dcp.xapp.billingclient.impl.retriablev2.DcpRetriableBillingClient;
import kotlin.Unit;

/* renamed from: X.8if, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C07268if extends AbstractC07127nr implements G0V {
    public final int $t;
    public int A00;
    public Object A01;
    public Object A02;
    public final Object A03;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C07268if(Object obj, C6XV c6xv, G0V<? super C3Q0, ? super HtJ<? super Unit>, ? extends Object> g0v, HtJ<? super C07268if> htJ) {
        super(2, c6xv);
        this.$t = htJ;
        this.A02 = obj;
        this.A03 = g0v;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        Object obj2;
        Object obj3;
        int i;
        Object obj4;
        Object obj5;
        int i2;
        Object obj6;
        Object obj7;
        Object obj8;
        int i3;
        switch (this.$t) {
            case 0:
                obj4 = this.A02;
                obj5 = this.A03;
                i2 = 0;
                C07268if c07268if = new C07268if(obj4, (C6XV) htJ, (G0V<? super C3Q0, ? super HtJ<? super Unit>, ? extends Object>) obj5, (HtJ<? super C07268if>) i2);
                c07268if.A01 = obj;
                return c07268if;
            case 1:
                obj7 = this.A02;
                obj6 = this.A01;
                obj8 = this.A03;
                i3 = 1;
                return new C07268if(obj8, obj7, obj6, htJ, i3);
            case 2:
                obj2 = this.A03;
                obj3 = this.A01;
                i = 2;
                C07268if c07268if2 = new C07268if(obj2, (Activity) obj3, (C79e) htJ, (HtJ<? super C07268if>) i);
                c07268if2.A02 = obj;
                return c07268if2;
            case 3:
                obj7 = this.A02;
                obj8 = this.A03;
                obj6 = this.A01;
                i3 = 3;
                return new C07268if(obj8, obj7, obj6, htJ, i3);
            case 4:
                obj6 = this.A01;
                obj7 = this.A02;
                obj8 = this.A03;
                i3 = 4;
                return new C07268if(obj8, obj7, obj6, htJ, i3);
            case 5:
                obj4 = this.A02;
                obj5 = this.A03;
                i2 = 5;
                C07268if c07268if3 = new C07268if(obj4, (C6XV) htJ, (G0V<? super C3Q0, ? super HtJ<? super Unit>, ? extends Object>) obj5, (HtJ<? super C07268if>) i2);
                c07268if3.A01 = obj;
                return c07268if3;
            case 6:
                obj2 = this.A03;
                obj3 = this.A01;
                i = 6;
                C07268if c07268if22 = new C07268if(obj2, (Activity) obj3, (C79e) htJ, (HtJ<? super C07268if>) i);
                c07268if22.A02 = obj;
                return c07268if22;
            default:
                obj7 = this.A02;
                obj8 = this.A03;
                obj6 = this.A01;
                i3 = 7;
                return new C07268if(obj8, obj7, obj6, htJ, i3);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:114:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0097 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x017a A[RETURN] */
    @Override // X.AbstractC8884Fsp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 514
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C07268if.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.G0V
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((C07268if) AbstractC07127nr.A09(obj2, obj, this)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C07268if(Object obj, Activity activity, C79e c79e, HtJ<? super C07268if> htJ) {
        super(2, c79e);
        this.$t = htJ;
        this.A03 = obj;
        this.A01 = activity;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C07268if(Object obj, DcpRetriableBillingClient dcpRetriableBillingClient, Activity activity, C79e c79e, HtJ<? super C07268if> htJ) {
        super(2, c79e);
        this.$t = htJ;
        this.A02 = dcpRetriableBillingClient;
        this.A03 = obj;
        this.A01 = activity;
    }
}
