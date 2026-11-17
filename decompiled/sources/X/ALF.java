package X;

import android.view.View;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final class ALF implements AutoCloseable {
    public boolean A00;
    public boolean A01;
    public final View A02;
    public final C8832Fpe A03;
    public final Function0<Unit> A04;
    public final Function0<Unit> A05;
    public final Function0<Unit> A06;
    public final Function0<Unit> A07;
    public final Function0<Unit> A08;
    public final Function0<Unit> A09;
    public final Function0<Unit> A0A;
    public final G0U<Throwable, Unit> A0B;
    public final G0V<Float, Float, String> A0C;

    public /* synthetic */ ALF(View view, C8832Fpe c8832Fpe, Function0 function0, Function0 function02, Function0 function03, Function0 function04, Function0 function05, Function0 function06, Function0 function07, G0V g0v) {
        BUU buu = new BUU(21);
        this.A03 = c8832Fpe;
        this.A02 = view;
        this.A04 = function0;
        this.A09 = function02;
        this.A05 = function03;
        this.A0C = g0v;
        this.A07 = function04;
        this.A06 = function05;
        this.A0A = function06;
        this.A08 = function07;
        this.A0B = buu;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void A00(C10543Hqv<Throwable> c10543Hqv, Throwable th) {
        Throwable th2 = c10543Hqv.element;
        if (th2 == null) {
            c10543Hqv.element = th;
        } else if (th2 != th) {
            CU7.A01(th2, th);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.AutoCloseable
    public final void close() {
        if (this.A00) {
            return;
        }
        this.A00 = true;
        C10543Hqv c10543HqvA0z = C3cG.A0z();
        try {
            this.A03.A03();
        } catch (Throwable th) {
            A00(c10543HqvA0z, th);
        }
        try {
            this.A04.invoke();
        } catch (Throwable th2) {
            A00(c10543HqvA0z, th2);
        }
        try {
            this.A09.invoke();
        } catch (Throwable th3) {
            A00(c10543HqvA0z, th3);
        }
        try {
            this.A05.invoke();
        } catch (Throwable th4) {
            A00(c10543HqvA0z, th4);
        }
        if (this.A01) {
            try {
                this.A06.invoke();
            } catch (Throwable th5) {
                A00(c10543HqvA0z, th5);
            }
            this.A01 = false;
        }
        try {
            this.A0A.invoke();
        } catch (Throwable th6) {
            A00(c10543HqvA0z, th6);
        }
        try {
            this.A08.invoke();
        } catch (Throwable th7) {
            A00(c10543HqvA0z, th7);
        }
        T t = c10543HqvA0z.element;
        if (t != 0) {
            this.A0B.invoke(t);
        }
    }
}
