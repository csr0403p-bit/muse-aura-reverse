package X;

import androidx.media3.exoplayer.ExoPlaybackException;
import androidx.media3.exoplayer.ExoTimeoutException;

/* renamed from: X.F4w, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C7583F4w implements E7R {
    public final int $t;

    public C7583F4w(int i) {
        this.$t = i;
    }

    @Override // X.E7R
    public final void ANx(Object obj) {
        if (1 - this.$t == 0) {
            C6438E5q c6438E5q = C6438E5q.$redex_init_class;
            ((E76) obj).onPlayerError(ExoPlaybackException.A01(new ExoTimeoutException(1), 1003));
        }
    }
}
