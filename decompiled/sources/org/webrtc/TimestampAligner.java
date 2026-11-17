package org.webrtc;

import X.C3cG;

/* loaded from: classes5.dex */
public class TimestampAligner {
    public volatile long nativeTimestampAligner;

    public interface Natives {
        long createTimestampAligner(long j);

        void releaseTimestampAligner(long j);

        long translateTimestamp(long j, long j2);
    }

    @Deprecated
    public static long getRtcTimeNanos() {
        return new Environment(null).getCurrentTimeNanos();
    }

    private void checkNativeAlignerExists() {
        if (this.nativeTimestampAligner == 0) {
            throw C3cG.A0Q("TimestampAligner has been disposed.");
        }
    }

    public TimestampAligner(Environment environment) {
        this.nativeTimestampAligner = TimestampAlignerJni.get().createTimestampAligner(environment.webrtcEnv);
    }

    public void dispose() {
        checkNativeAlignerExists();
        TimestampAlignerJni.get().releaseTimestampAligner(this.nativeTimestampAligner);
        this.nativeTimestampAligner = 0L;
    }

    public long translateTimestamp(long j) {
        checkNativeAlignerExists();
        return TimestampAlignerJni.get().translateTimestamp(this.nativeTimestampAligner, j);
    }

    @Deprecated
    public TimestampAligner() {
        this(new Environment(null));
    }
}
