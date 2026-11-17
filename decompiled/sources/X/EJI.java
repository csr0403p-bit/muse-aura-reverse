package X;

import androidx.room.TriggerBasedInvalidationTracker;
import androidx.room.coroutines.PassthroughConnection;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes5.dex */
public final class EJI implements EIZ {
    public final InterfaceC6586EIe A00;
    public final String A01;
    public final F0C<EJV> A02 = C5322DgG.A01((Function0) new C7589F5c(this, 8));
    public final G0V<G0U<? super HtJ<Object>, ? extends Object>, HtJ<Object>, Object> A03;

    @Override // X.EIZ, java.lang.AutoCloseable
    public final void close() {
        F0C<EJV> f0c = this.A02;
        if (f0c.AOX()) {
            f0c.getValue().close();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public EJI(InterfaceC6586EIe interfaceC6586EIe, String str, G0V<? super G0U<? super HtJ<Object>, ? extends Object>, ? super HtJ<Object>, ? extends Object> g0v) {
        this.A00 = interfaceC6586EIe;
        this.A01 = str;
        this.A03 = g0v;
    }

    @Override // X.EIZ
    public final <R> Object AiC(boolean z, G0V<? super EJA, ? super HtJ<? super R>, ? extends Object> g0v, HtJ<? super R> htJ) {
        C6601EJd c6601EJd = (C6601EJd) htJ.getContext().get(C6601EJd.A01);
        if (c6601EJd != null) {
            return g0v.invoke(c6601EJd.A00, htJ);
        }
        PassthroughConnection passthroughConnection = new PassthroughConnection(this.A02.getValue(), this.A03);
        return GAo.A00(htJ, new C6601EJd(passthroughConnection), new EZD((Object) passthroughConnection, (TriggerBasedInvalidationTracker) g0v, (Function0<Unit>) null, (HtJ<? super EZD>) 5));
    }
}
