package X;

import java.util.concurrent.ThreadFactory;

/* renamed from: X.Bcg, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class ThreadFactoryC2510Bcg implements ThreadFactory {
    public final int $t;

    public ThreadFactoryC2510Bcg(int i) {
        this.$t = i;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        if (this.$t == 0) {
            return new Thread(runnable, "ExoPlayer:AudioTrackReleaseThread");
        }
        Thread thread = new Thread(runnable, "MediaCodecPoolV2-ttl");
        thread.setDaemon(true);
        return thread;
    }
}
