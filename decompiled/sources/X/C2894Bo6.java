package X;

import android.media.MediaCodec;
import com.google.common.util.concurrent.ListenableFuture;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.Bo6, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2894Bo6 implements BmS {
    public final MediaCodec.BufferInfo A00;
    public final ListenableFuture<Void> A01;
    public final ByteBuffer A02;
    public final AtomicBoolean A03 = C60O.A1E();
    public final int A04;
    public final MediaCodec A05;
    public final C3010Brs<Void> A06;

    @Override // X.BmS, java.lang.AutoCloseable
    public final void close() {
        if (this.A03.getAndSet(true)) {
            return;
        }
        try {
            this.A05.releaseOutputBuffer(this.A04, false);
            this.A06.A03(null);
        } catch (IllegalStateException e) {
            this.A06.A04(e);
        }
    }

    public C2894Bo6(MediaCodec mediaCodec, int i, MediaCodec.BufferInfo bufferInfo) {
        mediaCodec.getClass();
        this.A05 = mediaCodec;
        this.A04 = i;
        this.A02 = mediaCodec.getOutputBuffer(i);
        this.A00 = bufferInfo;
        AtomicReference atomicReferenceA15 = BV4.A15();
        this.A01 = AbstractC2947Bpi.A01(atomicReferenceA15, 27);
        Object obj = atomicReferenceA15.get();
        obj.getClass();
        this.A06 = (C3010Brs) obj;
    }
}
