package X;

import com.facebook.common.time.AwakeTimeSinceBootClock;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes6.dex */
public final class Hmm {
    public static final Hmm A03 = new Hmm();
    public final DK9 A00;
    public final AtomicLong A02 = new AtomicLong(-1);
    public final AtomicLong A01 = new AtomicLong(-1);

    public Hmm() {
        AwakeTimeSinceBootClock awakeTimeSinceBootClock = AwakeTimeSinceBootClock.INSTANCE;
        C7384Etj.A0U(awakeTimeSinceBootClock);
        this.A00 = awakeTimeSinceBootClock;
    }
}
