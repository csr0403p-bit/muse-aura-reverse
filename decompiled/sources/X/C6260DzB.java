package X;

import com.facebook.video.heroplayer.service.heroexoplayer2.HeroExoPlayer2EventListener;
import java.nio.ByteBuffer;

/* renamed from: X.DzB, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C6260DzB extends EAP {
    public final HeroExoPlayer2EventListener A00;

    public C6260DzB(HeroExoPlayer2EventListener heroExoPlayer2EventListener) {
        this.A00 = heroExoPlayer2EventListener;
    }

    @Override // X.EAX
    public final void AZ0(ByteBuffer byteBuffer) {
        int iRemaining = byteBuffer.remaining();
        if (iRemaining != 0) {
            this.A00.handleBuffer(byteBuffer.asReadOnlyBuffer().order(byteBuffer.order()));
            ByteBuffer byteBufferA03 = A03(iRemaining);
            byteBufferA03.put(byteBuffer);
            byteBufferA03.flip();
        }
    }
}
