package X;

import com.facebook.payments.dcp.xapp.billingclient.impl.auto.AutoConnectionManager;
import com.facebook.payments.dcp.xapp.billingclient.impl.auto.DcpAutoBillingClient;
import com.facebook.payments.dcp.xapp.billingclient.impl.retriablev2.DcpRetriableBillingClient;
import java.io.File;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* renamed from: X.8io, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C07358io extends AbstractC7559F3s implements Function0 {
    public final int $t;
    public final Object A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C07358io(Object obj, int i) {
        super(0);
        this.$t = i;
        this.A00 = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v10, types: [T, java.io.File, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v12, types: [T, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v5, types: [T, kotlin.Unit] */
    @Override // kotlin.jvm.functions.Function0
    public final /* bridge */ /* synthetic */ T invoke() {
        HxE hxEA0r;
        List listA0X;
        switch (this.$t) {
            case 0:
                ?? r1 = (File) ((Function0) this.A00).invoke();
                if ("preferences_pb".equals(CEV.A01(r1))) {
                    return r1;
                }
                throw C3cG.A0Q(C60P.A1M(" does not match required extension for Preferences file: ", "preferences_pb", C3cG.A0f(r1, "File extension for file: ")));
            case 1:
            case 2:
            case 3:
            default:
                return ((Function0) this.A00).invoke();
            case 4:
                C79Y c79y = ((AutoConnectionManager) this.A00).A00;
                synchronized (c79y) {
                    if (c79y.A00) {
                        hxEA0r = null;
                    } else {
                        c79y.A00 = true;
                        hxEA0r = C3cG.A0r(c79y.A01.getAndSet(null), c79y.A03);
                    }
                }
                if (hxEA0r != null) {
                    HoC hoC = (HoC) hxEA0r.first;
                    if (hoC != null) {
                        hoC.A5w(null);
                    }
                    c79y.A02.A5w(null);
                    ((DcpRetriableBillingClient) hxEA0r.second).AAa();
                    break;
                }
                break;
            case 5:
                Set<HoC> set = ((DcpAutoBillingClient) this.A00).A02;
                synchronized (set) {
                    listA0X = AbstractC0878AGe.A0X(set);
                }
                Iterator it = listA0X.iterator();
                while (it.hasNext()) {
                    ((HoC) it.next()).A5w(null);
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
