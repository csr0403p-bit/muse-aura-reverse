package X;

import com.facebook.payments.dcp.xapp.billingclient.impl.retriablev2.CoroutineConnectionManager;
import kotlin.Unit;

/* loaded from: classes6.dex */
public final class HiD extends AbstractC7559F3s implements G0U<InterfaceC10512HoG, Unit> {
    public final /* synthetic */ String $connectionProductType;
    public final /* synthetic */ long $connectionStartTime;
    public final /* synthetic */ InterfaceC10560Hsz<InterfaceC10512HoG> $deferred;
    public final /* synthetic */ CoroutineConnectionManager this$0;

    @Override // X.G0U
    public final /* bridge */ /* synthetic */ Unit invoke(InterfaceC10512HoG interfaceC10512HoG) {
        InterfaceC10560Hsz<InterfaceC10512HoG> interfaceC10560Hsz;
        InterfaceC10512HoG interfaceC10512HoG2 = interfaceC10512HoG;
        C7384Etj.A0Y(interfaceC10512HoG2, 0);
        CoroutineConnectionManager coroutineConnectionManager = this.this$0;
        InterfaceC10560Hsz<InterfaceC10512HoG> interfaceC10560Hsz2 = this.$deferred;
        long j = this.$connectionStartTime;
        String str = this.$connectionProductType;
        if (coroutineConnectionManager.A01 == interfaceC10560Hsz2) {
            EnumC9706GeK enumC9706GeKAJk = interfaceC10512HoG2.AJk();
            EnumC9706GeK enumC9706GeK = EnumC9706GeK.A0H;
            C9699Ge6 c9699Ge6 = coroutineConnectionManager.A03;
            if (enumC9706GeKAJk == enumC9706GeK) {
                interfaceC10560Hsz = null;
                c9699Ge6.A0X(Long.valueOf(j), "startConnection", str, null, null);
            } else {
                interfaceC10560Hsz = null;
                c9699Ge6.A0O(HiU.A00(interfaceC10512HoG2, "LOAD_DCPIAP"), Long.valueOf(j), "startConnection", str, null, null);
            }
            coroutineConnectionManager.A01 = interfaceC10560Hsz;
            C3cG.A1F(interfaceC10560Hsz2, interfaceC10512HoG2);
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Incorrect types in method signature: (Lcom/facebook/payments/dcp/xapp/billingclient/impl/retriablev2/CoroutineConnectionManager;LX/Hsz<LX/HoG;>;JLjava/lang/String;)V */
    public HiD(CoroutineConnectionManager coroutineConnectionManager, String str, InterfaceC10560Hsz interfaceC10560Hsz, long j) {
        super(1);
        this.this$0 = coroutineConnectionManager;
        this.$deferred = interfaceC10560Hsz;
        this.$connectionStartTime = j;
        this.$connectionProductType = str;
    }
}
