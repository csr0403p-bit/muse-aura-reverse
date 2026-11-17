package X;

import com.facebook.common.time.AwakeTimeSinceBootClock;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.ExQ, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC7476ExQ {
    public static final AwakeTimeSinceBootClock A00;
    public static final ConcurrentHashMap<EnumC7544F1g, ConcurrentHashMap<String, Long>> A01 = C60O.A1C();

    static {
        AwakeTimeSinceBootClock awakeTimeSinceBootClock = AwakeTimeSinceBootClock.INSTANCE;
        C7384Etj.A0U(awakeTimeSinceBootClock);
        A00 = awakeTimeSinceBootClock;
    }
}
