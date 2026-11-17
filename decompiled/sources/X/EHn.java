package X;

import android.content.Context;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes5.dex */
public final class EHn {
    public final EHi A00;
    public final EHg A01;
    public final C6575EHt A02;
    public final C6573EHp A03;
    public final AtomicBoolean A04;
    public final Function0<String> A05;
    public final G0U<Throwable, Unit> A06;

    public EHn(Context context, EHg eHg, Function0 function0, G0U g0u) {
        C7384Etj.A0Y(function0, 2);
        this.A01 = eHg;
        this.A05 = function0;
        this.A06 = g0u;
        this.A04 = BV4.A12(false);
        boolean z = CQU.GENERATE_CANCELLATION_CAUSES;
        C6573EHp c6573EHp = new C6573EHp(this);
        this.A03 = c6573EHp;
        C6575EHt c6575EHt = new C6575EHt();
        this.A02 = c6575EHt;
        this.A00 = new EHi(context.getApplicationContext(), c6575EHt, c6573EHp, eHg);
    }
}
