package X;

import android.os.SystemClock;
import com.facebook.exoplayer.formatevaluator.configuration.AbrContextAwareConfiguration;

/* renamed from: X.Dni, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C5701Dni {
    public static synchronized Integer A00(AbrContextAwareConfiguration abrContextAwareConfiguration) {
        Integer num;
        boolean z;
        long j;
        Dn9 dn9 = Dn9.A02;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        num = C79.A0C;
        C5686DnS c5686DnS = abrContextAwareConfiguration.abrSetting;
        long j2 = c5686DnS.personalizedAggressiveStallDuration;
        long j3 = c5686DnS.personalizedVeryAggressiveStallDuration;
        long j4 = c5686DnS.personalizedConservativeStallDuration;
        synchronized (dn9) {
            try {
                z = Dn9.A00;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z) {
            long jA02 = dn9.A02();
            synchronized (C5898Drf.class) {
                try {
                    j = C5898Drf.A00;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            if (j >= j2 && jA02 < jElapsedRealtime - j2) {
                num = C79.A0K;
                if (j >= j3 && jA02 < jElapsedRealtime - j3) {
                    num = C79.A0P;
                }
            } else if (jA02 >= jElapsedRealtime - j4) {
                num = C79.A01;
                if (dn9.A01((int) j4) > 1) {
                    num = C79.A00;
                }
            }
        }
        return num;
    }
}
