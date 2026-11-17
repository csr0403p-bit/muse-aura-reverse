package X;

import android.os.Trace;
import androidx.media3.exoplayer.ExoPlaybackException;
import java.io.IOException;

/* loaded from: classes5.dex */
public final class Dn8 {
    public final /* synthetic */ DmR A00;
    public final /* synthetic */ Dlw A01;

    public Dn8(DmR dmR, Dlw dlw) {
        this.A00 = dmR;
        this.A01 = dlw;
    }

    public final void A00(Exception exc) {
        Dlw dlw = this.A01;
        Dlw.A0v(dlw, "prepareMediaSource onError: %s", BV7.A1b(exc));
        Trace.beginSection("HeroServicePlayer.buildRenderersFailed");
        try {
            dlw.Ab3(exc instanceof ExoPlaybackException ? (ExoPlaybackException) exc : exc instanceof IOException ? ExoPlaybackException.A00((IOException) exc, 2000) : exc instanceof RuntimeException ? ExoPlaybackException.A01((RuntimeException) exc, 1000) : null, EnumC5642DmW.A0K);
        } finally {
            Trace.endSection();
        }
    }
}
