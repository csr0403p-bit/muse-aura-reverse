package X;

import com.facebook.video.heroplayer.service.heroexoplayer2.HeroExoPlayer2EventListener;
import java.io.IOException;

/* renamed from: X.Doi, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C5747Doi implements Du7 {
    public final /* synthetic */ long A00;
    public final /* synthetic */ HeroExoPlayer2EventListener A01;

    public C5747Doi(HeroExoPlayer2EventListener heroExoPlayer2EventListener, long j) {
        this.A00 = j;
        this.A01 = heroExoPlayer2EventListener;
    }

    @Override // X.Du7
    public final void onLoadCanceled(int i, Dy6 dy6, C5072DTn c5072DTn, C5893Dra c5893Dra) {
        HeroExoPlayer2EventListener heroExoPlayer2EventListener = this.A01;
        if (heroExoPlayer2EventListener.shouldTrackLoadDiagnostics()) {
            heroExoPlayer2EventListener.trackLoadFinished(this.A00, c5072DTn);
        }
    }

    @Override // X.Du7
    public final void onLoadCompleted(int i, Dy6 dy6, C5072DTn c5072DTn, C5893Dra c5893Dra) {
        HeroExoPlayer2EventListener heroExoPlayer2EventListener = this.A01;
        if (heroExoPlayer2EventListener.shouldTrackLoadDiagnostics()) {
            heroExoPlayer2EventListener.trackLoadCompleted(this.A00, c5072DTn, c5893Dra);
        }
    }

    @Override // X.Du7
    public final void onLoadError(int i, Dy6 dy6, C5072DTn c5072DTn, C5893Dra c5893Dra, IOException iOException, boolean z) {
        HeroExoPlayer2EventListener heroExoPlayer2EventListener = this.A01;
        if (heroExoPlayer2EventListener.shouldTrackLoadDiagnostics()) {
            heroExoPlayer2EventListener.trackLoadError(this.A00, c5072DTn, c5893Dra, iOException);
        }
    }

    @Override // X.Du7
    public final void onLoadStarted(int i, Dy6 dy6, C5072DTn c5072DTn, C5893Dra c5893Dra, int i2) {
        HeroExoPlayer2EventListener heroExoPlayer2EventListener = this.A01;
        if (heroExoPlayer2EventListener.shouldTrackLoadDiagnostics()) {
            heroExoPlayer2EventListener.trackLoadStarted(this.A00, c5072DTn, c5893Dra);
        }
    }

    @Override // X.Du7
    public final /* synthetic */ void onDownstreamFormatChanged(int i, Dy6 dy6, C5893Dra c5893Dra) {
    }

    @Override // X.Du7
    public final /* synthetic */ void onUpstreamDiscarded(int i, Dy6 dy6, C5893Dra c5893Dra) {
    }
}
