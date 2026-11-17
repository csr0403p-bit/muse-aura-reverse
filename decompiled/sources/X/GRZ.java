package X;

import android.os.Looper;
import com.facebook.common.time.AwakeTimeSinceBootClock;
import com.facebook.debug.tracer.Tracer;
import java.util.concurrent.Executor;
import kotlin.jvm.functions.Function0;

/* loaded from: classes6.dex */
public final class GRZ extends C9658Gci<GRH> {
    public final GRX A00;
    public final F0C A01;
    public final F0C A02;
    public final InterfaceC7542F0w A03;
    public final String A04;
    public final boolean A05;

    /* JADX WARN: Incorrect types in method signature: (ZLX/G0U<-LX/GRe;Lkotlin/Unit;>;)Lkotlin/jvm/functions/Function0<Lkotlin/Unit;>; */
    public final Function0 A00(G0U g0u, boolean z) {
        Function0 c8197FYo;
        Tracer.A01("RpStore.subscribe");
        try {
            if (equals(GRK.A01)) {
                AbstractC7608F5v.A1L("subscribe called on finalized RpStore. No updates will be provided.");
                c8197FYo = GSJ.A00;
            } else {
                if (this.A05) {
                    C7384Etj.areEqual(Looper.myLooper(), Looper.getMainLooper());
                }
                C9598GRe c9598GRe = new C9598GRe();
                g0u.invoke(c9598GRe);
                if (z) {
                    ((Executor) this.A01.getValue()).execute(new RunnableC9595GRb(this, c9598GRe));
                }
                ((C9658Gci) this).A00.invoke(new GSD(c9598GRe));
                c8197FYo = new C8197FYo(29, this, c9598GRe);
            }
            return c8197FYo;
        } finally {
            Tracer.A00();
        }
    }

    public final String toString() {
        return FGI.A0M("RpStore-", this.A04);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GRZ(InterfaceC7542F0w interfaceC7542F0w, String str, Function0 function0, GRU gru, boolean z) {
        super(function0, gru);
        AnonymousClass003.A0u(str, gru);
        this.A04 = str;
        this.A03 = interfaceC7542F0w;
        this.A05 = z;
        this.A02 = AbstractC7607F5u.A1A(null, new C6724EXi(27));
        C5322DgG c5322DgGA1A = AbstractC7607F5u.A1A(null, new C6724EXi(26));
        this.A01 = c5322DgGA1A;
        this.A00 = new GRX((Executor) c5322DgGA1A.getValue());
        AwakeTimeSinceBootClock.INSTANCE.now();
    }
}
