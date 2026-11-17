package X;

import com.facebook.common.time.AwakeTimeSinceBootClock;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes6.dex */
public abstract class FP9 {
    public static final DK9 A00;
    public static final AtomicLong A01;
    public static final AtomicLong A02;
    public static volatile C8016FPn A03 = new C8016FPn();

    static {
        AwakeTimeSinceBootClock awakeTimeSinceBootClock = AwakeTimeSinceBootClock.INSTANCE;
        C7384Etj.A0U(awakeTimeSinceBootClock);
        A00 = awakeTimeSinceBootClock;
        A02 = new AtomicLong(-1L);
        A01 = new AtomicLong(-1L);
    }
}
