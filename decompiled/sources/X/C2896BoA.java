package X;

import android.media.MediaCodec;
import com.google.common.util.concurrent.ListenableFuture;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.BoA, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2896BoA implements InterfaceC2904BoR {
    public final int A00;
    public final MediaCodec A01;
    public final C3010Brs<Void> A02;
    public final ListenableFuture<Void> A03;
    public final ByteBuffer A04;
    public final AtomicBoolean A05 = C60O.A1E();

    public C2896BoA(MediaCodec mediaCodec, int i) {
        mediaCodec.getClass();
        this.A01 = mediaCodec;
        if (i < 0) {
            throw BV4.A0P();
        }
        this.A00 = i;
        this.A04 = mediaCodec.getInputBuffer(i);
        AtomicReference atomicReferenceA15 = BV4.A15();
        this.A03 = AbstractC2947Bpi.A01(atomicReferenceA15, 29);
        Object obj = atomicReferenceA15.get();
        obj.getClass();
        this.A02 = (C3010Brs) obj;
    }
}
