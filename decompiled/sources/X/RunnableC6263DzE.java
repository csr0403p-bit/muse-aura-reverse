package X;

import com.facebook.video.heroplayer.service.heroexoplayer2.HeroExoPlayer2EventListener;

/* renamed from: X.DzE, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final /* synthetic */ class RunnableC6263DzE implements Runnable {
    public static final String __redex_internal_original_name = "HeroRendererEventListener$EventDispatcher$$ExternalSyntheticLambda0";
    public final /* synthetic */ int A00;
    public final /* synthetic */ HeroExoPlayer2EventListener A01;

    @Override // java.lang.Runnable
    public final void run() {
        this.A01.onAudioDataSummaryUpdated(this.A00);
    }

    public /* synthetic */ RunnableC6263DzE(HeroExoPlayer2EventListener heroExoPlayer2EventListener, int i) {
        this.A01 = heroExoPlayer2EventListener;
        this.A00 = i;
    }
}
