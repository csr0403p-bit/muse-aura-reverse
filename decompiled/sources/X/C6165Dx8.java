package X;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.util.Pair;
import android.view.Surface;
import java.nio.ByteBuffer;

/* renamed from: X.Dx8, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C6165Dx8 implements InterfaceC6181DxP {
    public String A00;
    public InterfaceC6181DxP A01;
    public BWK A02;

    @Override // X.InterfaceC6181DxP
    public final void A6q(MediaCrypto mediaCrypto, MediaFormat mediaFormat, Surface surface, Object obj, int i) {
        this.A01.A6q(mediaCrypto, mediaFormat, surface, obj, i);
    }

    @Override // X.InterfaceC6181DxP
    public final /* synthetic */ boolean A70() {
        return false;
    }

    @Override // X.InterfaceC6185DxT
    public final int A8r() {
        return this.A01.A8r();
    }

    @Override // X.InterfaceC6185DxT
    public final int A8t(MediaCodec.BufferInfo bufferInfo) {
        return this.A01.A8t(bufferInfo);
    }

    @Override // X.InterfaceC6185DxT
    public final void A8w() {
        this.A01.A8w();
    }

    @Override // X.InterfaceC6181DxP
    public final /* synthetic */ MediaFormat ADu() {
        return null;
    }

    @Override // X.InterfaceC6181DxP
    public final Integer AGu() {
        return this.A01.AGu();
    }

    @Override // X.InterfaceC6181DxP
    public final Pair<Long, Integer> AIg() {
        return this.A01.AIg();
    }

    @Override // X.InterfaceC6181DxP
    public final int ALq() {
        return this.A01.ALq();
    }

    @Override // X.InterfaceC6181DxP
    public final ByteBuffer AN1(int i, int i2) {
        return this.A01.AN1(i, i2);
    }

    @Override // X.InterfaceC6181DxP
    public final boolean AOq() {
        return this.A01.AOq();
    }

    @Override // X.InterfaceC6181DxP
    public final /* synthetic */ boolean AOt() {
        return true;
    }

    @Override // X.InterfaceC6181DxP
    public final /* synthetic */ boolean AOw() {
        return false;
    }

    @Override // X.InterfaceC6181DxP
    public final boolean AOy(int i) {
        return this.A01.AOy(i);
    }

    @Override // X.InterfaceC6185DxT
    public final boolean AR6() {
        return this.A01.AR6();
    }

    @Override // X.InterfaceC6185DxT
    public final void AZ3(C5473Dj9 c5473Dj9, int i, int i2, int i3, long j) {
        this.A01.AZ3(c5473Dj9, i, i2, i3, j);
    }

    @Override // X.InterfaceC6185DxT
    public final void AaH(int i, long j) {
        this.A01.AaH(i, j);
    }

    @Override // X.InterfaceC6185DxT
    public final void Adv(Handler handler, InterfaceC2984Bqt interfaceC2984Bqt) {
        this.A01.Adv(handler, interfaceC2984Bqt);
    }

    @Override // X.InterfaceC6185DxT
    public final void Ady(Surface surface) {
        this.A01.Ady(surface);
    }

    @Override // X.InterfaceC6185DxT
    public final void AfE(int i) {
        this.A01.AfE(i);
    }

    @Override // X.InterfaceC6185DxT
    public final void flush() {
        this.A01.flush();
    }

    @Override // X.InterfaceC6185DxT
    public final ByteBuffer getInputBuffer(int i) {
        return this.A01.getInputBuffer(i);
    }

    @Override // X.InterfaceC6185DxT
    public final ByteBuffer getOutputBuffer(int i) {
        return this.A01.getOutputBuffer(i);
    }

    @Override // X.InterfaceC6185DxT
    public final MediaFormat getOutputFormat() {
        return this.A01.getOutputFormat();
    }

    @Override // X.InterfaceC6185DxT
    public final void queueInputBuffer(int i, int i2, int i3, long j, int i4) {
        this.A01.queueInputBuffer(i, i2, i3, j, i4);
    }

    @Override // X.InterfaceC6185DxT
    public final void release() {
        BWK bwk = this.A02;
        InterfaceC6181DxP interfaceC6181DxP = this.A01;
        String str = this.A00;
        C6204Dxo c6204Dxo = C6204Dxo.A00;
        boolean z = bwk.A03;
        c6204Dxo.AaD(bwk.A00.A00, bwk.A01, C79.A01, str, interfaceC6181DxP, z);
    }

    @Override // X.InterfaceC6185DxT
    public final void releaseOutputBuffer(int i, boolean z) {
        this.A01.releaseOutputBuffer(i, z);
    }

    @Override // X.InterfaceC6181DxP
    public final void reset() {
        this.A01.reset();
    }

    @Override // X.InterfaceC6185DxT
    public final void setParameters(Bundle bundle) {
        this.A01.setParameters(bundle);
    }

    @Override // X.InterfaceC6181DxP
    public final void start() {
        this.A01.start();
    }

    @Override // X.InterfaceC6181DxP
    public final void stop() {
        this.A01.stop();
    }

    @Override // X.InterfaceC6181DxP
    public final /* synthetic */ void Ae8(boolean z) {
    }

    @Override // X.InterfaceC6181DxP
    public final /* synthetic */ void AeU(boolean z) {
    }
}
