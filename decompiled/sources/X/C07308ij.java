package X;

import androidx.room.TriggerBasedInvalidationTracker;
import com.facebook.payments.dcp.xapp.billingclient.impl.retriablev2.DcpRetriableBillingClient;
import kotlin.Unit;

/* renamed from: X.8ij, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C07308ij extends AbstractC07127nr implements G0V {
    public final int $t = 1;
    public int A00;
    public Object A01;
    public Object A02;
    public final Object A03;
    public final Object A04;
    public final boolean A05;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Incorrect types in method signature: (LX/Hsz<LX/HoG;>;Lcom/facebook/payments/dcp/xapp/billingclient/impl/retriablev2/DcpRetriableBillingClient;ZLX/79Y;LX/HtJ<-LX/8ij;>;)V */
    public C07308ij(C79Y c79y, DcpRetriableBillingClient dcpRetriableBillingClient, HtJ htJ, InterfaceC10560Hsz interfaceC10560Hsz, boolean z) {
        super(2, htJ);
        this.A04 = interfaceC10560Hsz;
        this.A03 = dcpRetriableBillingClient;
        this.A05 = z;
        this.A01 = c79y;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        if (this.$t != 0) {
            InterfaceC10560Hsz interfaceC10560Hsz = (InterfaceC10560Hsz) this.A04;
            return new C07308ij((C79Y) this.A01, (DcpRetriableBillingClient) this.A03, htJ, interfaceC10560Hsz, this.A05);
        }
        C07308ij c07308ij = new C07308ij((TriggerBasedInvalidationTracker) this.A02, htJ, (int[]) this.A04, (String[]) this.A03, this.A05);
        c07308ij.A01 = obj;
        return c07308ij;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x009f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00c3 A[RETURN] */
    @Override // X.AbstractC8884Fsp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 219
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C07308ij.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.G0V
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((C07308ij) AbstractC07127nr.A09(obj2, obj, this)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Incorrect types in method signature: (Landroidx/room/TriggerBasedInvalidationTracker;[IZ[Ljava/lang/String;LX/HtJ<-LX/8ij;>;)V */
    public C07308ij(TriggerBasedInvalidationTracker triggerBasedInvalidationTracker, HtJ htJ, int[] iArr, String[] strArr, boolean z) {
        super(2, htJ);
        this.A02 = triggerBasedInvalidationTracker;
        this.A04 = iArr;
        this.A05 = z;
        this.A03 = strArr;
    }
}
