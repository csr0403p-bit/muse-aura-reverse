package X;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.view.Surface;
import java.nio.ByteBuffer;

/* renamed from: X.DxT, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public interface InterfaceC6185DxT {
    int A8r();

    int A8t(MediaCodec.BufferInfo bufferInfo);

    void A8w();

    boolean AR6();

    void AZ3(C5473Dj9 c5473Dj9, int i, int i2, int i3, long j);

    void AaH(int i, long j);

    void Adv(Handler handler, InterfaceC2984Bqt interfaceC2984Bqt);

    void Ady(Surface surface);

    void AfE(int i);

    void flush();

    ByteBuffer getInputBuffer(int i);

    ByteBuffer getOutputBuffer(int i);

    MediaFormat getOutputFormat();

    void queueInputBuffer(int i, int i2, int i3, long j, int i4);

    void release();

    void releaseOutputBuffer(int i, boolean z);

    void setParameters(Bundle bundle);

    static AbstractC6211Dxx A00(AbstractC6211Dxx abstractC6211Dxx, InterfaceC6185DxT interfaceC6185DxT, DxJ dxJ) {
        abstractC6211Dxx.A02(interfaceC6185DxT.hashCode());
        interfaceC6185DxT.release();
        AbstractC6211Dxx abstractC6211Dxx2 = dxJ.A01;
        return abstractC6211Dxx2 == null ? C6266DzJ.A00 : abstractC6211Dxx2;
    }
}
