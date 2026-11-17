package X;

import com.facebook.video.heroplayer.service.heroexoplayer2.HeroExoPlayer2EventListener;

/* loaded from: classes5.dex */
public final /* synthetic */ class Dz6 implements Runnable {
    public static final String __redex_internal_original_name = "HeroRendererEventListener$EventDispatcher$$ExternalSyntheticLambda1";
    public final /* synthetic */ long A00;
    public final /* synthetic */ HeroExoPlayer2EventListener A01;
    public final /* synthetic */ byte[] A02;

    @Override // java.lang.Runnable
    public final void run() {
        this.A01.onNewAudioData(this.A02, this.A00);
    }

    public /* synthetic */ Dz6(HeroExoPlayer2EventListener heroExoPlayer2EventListener, byte[] bArr, long j) {
        this.A01 = heroExoPlayer2EventListener;
        this.A02 = bArr;
        this.A00 = j;
    }
}
