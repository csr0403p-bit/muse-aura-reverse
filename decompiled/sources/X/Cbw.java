package X;

import android.content.Context;
import android.os.SystemClock;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes5.dex */
public abstract class Cbw {
    public static final AtomicReference A00 = BV4.A15();

    public static Cbx A00() {
        BXm bXm = BXm.NO_LANDMARKS;
        return new Cbx(BXk.NO_CLASSIFICATIONS, EnumC2382BXl.NO_CONTOURS, bXm, EnumC2381BXj.FAST, AnonymousClass001.A0h(), Float.valueOf(0.15f));
    }

    public static void A01(EnumC10409Hbg enumC10409Hbg, C3696Ccu c3696Ccu, boolean z) {
        EnumC10420Hbt enumC10420Hbt = EnumC10420Hbt.A2a;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (C3696Ccu.A01(enumC10420Hbt, c3696Ccu, jElapsedRealtime)) {
            BV4.A1I(enumC10420Hbt, c3696Ccu.A07, jElapsedRealtime);
            C3712CdB c3712CdB = new C3712CdB();
            c3712CdB.A01 = z ? EnumC3720CdJ.TYPE_THICK : EnumC3720CdJ.TYPE_THIN;
            c3712CdB.A04 = new Cby(enumC10409Hbg);
            RunnableC3698Ccw.A00(enumC10420Hbt, new C3717CdG(c3712CdB, 0), c3696Ccu);
        }
    }

    public static boolean A02() {
        AtomicReference atomicReference = A00;
        if (atomicReference.get() != null) {
            return AnonymousClass001.A1X(atomicReference.get());
        }
        boolean zA1N = AnonymousClass002.A1N(Cb9.A00((Context) C3555CTs.A00().A02(Context.class), "com.google.mlkit.dynamite.face"));
        atomicReference.set(Boolean.valueOf(zA1N));
        return zA1N;
    }
}
