package X;

import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* renamed from: X.BrL, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC2993BrL {
    public static String A00(long j) {
        long j2 = j / 1000;
        long j3 = j2 / 3600000;
        TimeUnit timeUnit = TimeUnit.HOURS;
        long millis = (j2 - timeUnit.toMillis(j3)) / 60000;
        long millis2 = ((j2 - timeUnit.toMillis(j3)) - TimeUnit.MINUTES.toMillis(millis)) / 1000;
        return String.format(Locale.US, "%02d:%02d:%02d.%03d", Long.valueOf(j3), Long.valueOf(millis), Long.valueOf(millis2), Long.valueOf(((j2 - TimeUnit.HOURS.toMillis(j3)) - TimeUnit.MINUTES.toMillis(millis)) - TimeUnit.SECONDS.toMillis(millis2)));
    }
}
