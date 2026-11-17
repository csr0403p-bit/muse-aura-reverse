package X;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.util.Pair;
import android.view.Surface;
import java.nio.ByteBuffer;

/* renamed from: X.Bqq, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2981Bqq implements InterfaceC6181DxP {
    public MediaFormat A00;
    public boolean A02;
    public boolean A03;
    public final MediaCodec A04;
    public volatile boolean A05 = false;
    public boolean A01 = true;

    @Override // X.InterfaceC6185DxT
    public final void release() {
        this.A05 = true;
        this.A04.release();
    }

    @Override // X.InterfaceC6181DxP
    public final void A6q(MediaCrypto mediaCrypto, MediaFormat mediaFormat, Surface surface, Object obj, int i) {
        this.A04.configure(mediaFormat, surface, mediaCrypto, i);
        this.A00 = mediaFormat;
    }

    @Override // X.InterfaceC6181DxP
    public final boolean A70() {
        boolean z = this.A02;
        this.A02 = false;
        return z;
    }

    @Override // X.InterfaceC6185DxT
    public final int A8r() {
        return this.A04.dequeueInputBuffer(0L);
    }

    @Override // X.InterfaceC6185DxT
    public final int A8t(MediaCodec.BufferInfo bufferInfo) {
        int iDequeueOutputBuffer;
        if (this.A05 && AbstractC5653Dmh.A03(EnumC5618Dlz.A1G)) {
            Log.w("SyncMediaCodecAdapterExt", "Skipping dequeueOutputBuffer: codec already released");
            return -1;
        }
        do {
            iDequeueOutputBuffer = this.A04.dequeueOutputBuffer(bufferInfo, 0L);
        } while (iDequeueOutputBuffer == -3);
        return iDequeueOutputBuffer;
    }

    @Override // X.InterfaceC6185DxT
    public final void A8w() {
        AbstractC2985Bqu.A00.accept(this.A04);
    }

    @Override // X.InterfaceC6181DxP
    public final MediaFormat ADu() {
        return this.A00;
    }

    @Override // X.InterfaceC6181DxP
    public final /* synthetic */ Integer AGu() {
        return C79.A00;
    }

    @Override // X.InterfaceC6181DxP
    public final int ALq() {
        return 0;
    }

    @Override // X.InterfaceC6181DxP
    public final /* synthetic */ boolean AOq() {
        return false;
    }

    @Override // X.InterfaceC6181DxP
    public final boolean AOt() {
        return this.A01;
    }

    @Override // X.InterfaceC6181DxP
    public final boolean AOw() {
        return this.A03;
    }

    @Override // X.InterfaceC6185DxT
    public final boolean AR6() {
        return false;
    }

    @Override // X.InterfaceC6185DxT
    public final void AZ3(C5473Dj9 c5473Dj9, int i, int i2, int i3, long j) throws MediaCodec.CryptoException {
        this.A04.queueSecureInputBuffer(i, i2, c5473Dj9.A04, j, i3);
    }

    @Override // X.InterfaceC6185DxT
    public final void AaH(int i, long j) {
        if (this.A05 && AbstractC5653Dmh.A03(EnumC5618Dlz.A1G)) {
            Log.w("SyncMediaCodecAdapterExt", "Skipping releaseOutputBuffer: codec already released");
        } else {
            this.A04.releaseOutputBuffer(i, j);
        }
    }

    @Override // X.InterfaceC6185DxT
    public final void Adv(Handler handler, final InterfaceC2984Bqt interfaceC2984Bqt) {
        this.A04.setOnFrameRenderedListener(new MediaCodec.OnFrameRenderedListener() { // from class: X.Bqr
            @Override // android.media.MediaCodec.OnFrameRenderedListener
            public final void onFrameRendered(MediaCodec mediaCodec, long j, long j2) {
                interfaceC2984Bqt.ATV(j);
            }
        }, handler);
    }

    @Override // X.InterfaceC6185DxT
    public final void Ady(Surface surface) {
        this.A04.setOutputSurface(surface);
    }

    @Override // X.InterfaceC6185DxT
    public final void AfE(int i) {
        this.A04.setVideoScalingMode(i);
    }

    @Override // X.InterfaceC6185DxT
    public final void flush() {
        this.A04.flush();
    }

    @Override // X.InterfaceC6185DxT
    public final ByteBuffer getInputBuffer(int i) {
        return this.A04.getInputBuffer(i);
    }

    @Override // X.InterfaceC6185DxT
    public final ByteBuffer getOutputBuffer(int i) {
        if (!this.A05 || !AbstractC5653Dmh.A03(EnumC5618Dlz.A1G)) {
            return this.A04.getOutputBuffer(i);
        }
        Log.w("SyncMediaCodecAdapterExt", "Skipping getOutputBuffer: codec already released");
        return null;
    }

    @Override // X.InterfaceC6185DxT
    public final MediaFormat getOutputFormat() {
        return this.A04.getOutputFormat();
    }

    @Override // X.InterfaceC6185DxT
    public final void queueInputBuffer(int i, int i2, int i3, long j, int i4) throws MediaCodec.CryptoException {
        this.A04.queueInputBuffer(i, i2, i3, j, i4);
    }

    @Override // X.InterfaceC6185DxT
    public final void releaseOutputBuffer(int i, boolean z) {
        if (this.A05 && AbstractC5653Dmh.A03(EnumC5618Dlz.A1G)) {
            Log.w("SyncMediaCodecAdapterExt", "Skipping releaseOutputBuffer: codec already released");
        } else {
            this.A04.releaseOutputBuffer(i, z);
        }
    }

    @Override // X.InterfaceC6181DxP
    public final void reset() {
        this.A04.reset();
        this.A01 = true;
        this.A00 = null;
        this.A02 = true;
    }

    @Override // X.InterfaceC6185DxT
    public final void setParameters(Bundle bundle) {
        this.A04.setParameters(bundle);
    }

    @Override // X.InterfaceC6181DxP
    public final void start() {
        this.A04.start();
    }

    @Override // X.InterfaceC6181DxP
    public final void stop() {
        this.A04.stop();
    }

    public C2981Bqq(MediaCodec mediaCodec) {
        this.A04 = mediaCodec;
    }

    @Override // X.InterfaceC6181DxP
    public final Pair<Long, Integer> AIg() {
        return BV5.A0E(BV7.A0o(), 0);
    }

    @Override // X.InterfaceC6181DxP
    public final /* synthetic */ boolean AOy(int i) {
        return false;
    }

    @Override // X.InterfaceC6181DxP
    public final void Ae8(boolean z) {
        this.A01 = z;
    }

    @Override // X.InterfaceC6181DxP
    public final void AeU(boolean z) {
        this.A03 = z;
    }

    @Override // X.InterfaceC6181DxP
    public final /* synthetic */ ByteBuffer AN1(int i, int i2) {
        return null;
    }
}
