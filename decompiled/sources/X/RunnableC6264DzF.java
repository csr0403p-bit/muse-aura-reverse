package X;

import com.facebook.video.heroplayer.service.heroexoplayer2.HeroExoPlayer2EventListener;

/* renamed from: X.DzF, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final /* synthetic */ class RunnableC6264DzF implements Runnable {
    public static final String __redex_internal_original_name = "HeroRendererEventListener$EventDispatcher$$ExternalSyntheticLambda4";
    public final /* synthetic */ int A00;
    public final /* synthetic */ long A01;
    public final /* synthetic */ HeroExoPlayer2EventListener A02;

    @Override // java.lang.Runnable
    public final void run() {
        this.A02.onConsecutiveDroppedFrames(this.A00, this.A01);
    }

    public /* synthetic */ RunnableC6264DzF(HeroExoPlayer2EventListener heroExoPlayer2EventListener, int i, long j) {
        this.A02 = heroExoPlayer2EventListener;
        this.A00 = i;
        this.A01 = j;
    }
}
