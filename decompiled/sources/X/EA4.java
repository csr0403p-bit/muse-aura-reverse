package X;

import android.media.AudioDeviceInfo;
import android.media.AudioTrack;
import androidx.media3.common.util.Util;
import androidx.media3.exoplayer.audio.AudioSink$ConfigurationException;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* loaded from: classes5.dex */
public final class EA4 implements InterfaceC6272DzP {
    public final EA1 A00;

    @Override // X.InterfaceC6172DxF
    public final void A6p(C6154Dwx c6154Dwx, int[] iArr, int i) throws AudioSink$ConfigurationException {
        this.A00.A6p(c6154Dwx, iArr, i);
    }

    @Override // X.InterfaceC6172DxF
    public final void A92() throws IllegalStateException {
        this.A00.A92();
    }

    @Override // X.InterfaceC6172DxF
    public final void AA0() throws IllegalStateException {
        this.A00.AA0();
    }

    @Override // X.InterfaceC6272DzP
    public final void ABC() throws IllegalStateException {
        EA1 ea1 = this.A00;
        ea1.A0h.A00();
        ea1.A0g.A00();
        if (ea1.A05 != null) {
            EA1.A08(ea1);
            EA6 ea6 = ea1.A0f;
            AudioTrack audioTrack = ea6.A0K;
            audioTrack.getClass();
            if (audioTrack.getPlayState() == 3) {
                ea1.A05.pause();
            }
            ea1.A05.flush();
            ea6.A0H = 0L;
            ea6.A04 = 0;
            ea6.A02 = 0;
            ea6.A09 = 0L;
            ea6.A0B = 0L;
            ea6.A0E = 0L;
            ea6.A0Q = false;
            ea6.A0K = null;
            ea6.A0M = null;
            AudioTrack audioTrack2 = ea1.A05;
            EAW eaw = ea1.A0C;
            ea6.A01(audioTrack2, eaw.A03, eaw.A05, eaw.A00);
            ea1.A0I = true;
        }
    }

    @Override // X.InterfaceC6172DxF
    public final long ACb() {
        return this.A00.ACb();
    }

    @Override // X.InterfaceC6172DxF
    public final long AEW(boolean z) {
        return this.A00.AEW(z);
    }

    @Override // X.InterfaceC6172DxF
    public final int AFr(C6154Dwx c6154Dwx) {
        return this.A00.AFr(c6154Dwx);
    }

    @Override // X.InterfaceC6172DxF
    public final C6233Dyb AIo() {
        return EA1.A02(this.A00).A02;
    }

    @Override // X.InterfaceC6172DxF
    public final boolean AN2(ByteBuffer byteBuffer, int i, long j) {
        return this.A00.AN2(byteBuffer, i, j);
    }

    @Override // X.InterfaceC6172DxF
    public final void AN3() {
        this.A00.A0J = true;
    }

    @Override // X.InterfaceC6172DxF
    public final boolean ANF() {
        return this.A00.ANF();
    }

    @Override // X.InterfaceC6172DxF
    public final void AXz() throws IllegalStateException {
        this.A00.AXz();
    }

    @Override // X.InterfaceC6172DxF
    public final void Aco(DrN drN) throws IllegalStateException {
        this.A00.Aco(drN);
    }

    @Override // X.InterfaceC6172DxF
    public final void Acq(int i) throws IllegalStateException {
        this.A00.Acq(i);
    }

    @Override // X.InterfaceC6172DxF
    public final void Acr(C6504E9t c6504E9t) {
        this.A00.Acr(c6504E9t);
    }

    @Override // X.InterfaceC6172DxF
    public final void Ade(InterfaceC6515EAr interfaceC6515EAr) {
        this.A00.A0A = interfaceC6515EAr;
    }

    @Override // X.InterfaceC6172DxF
    public final void Ae1(C6233Dyb c6233Dyb) {
        this.A00.Ae1(c6233Dyb);
    }

    @Override // X.InterfaceC6172DxF
    public final void Ae6(E6Y e6y) {
        this.A00.A09 = e6y;
    }

    @Override // X.InterfaceC6172DxF
    public final void AeB(AudioDeviceInfo audioDeviceInfo) {
        this.A00.AeB(audioDeviceInfo);
    }

    @Override // X.InterfaceC6172DxF
    public final void Aei(boolean z) {
        this.A00.Aei(z);
    }

    @Override // X.InterfaceC6172DxF
    public final void AfF(float f) {
        this.A00.AfF(f);
    }

    @Override // X.InterfaceC6172DxF
    public final boolean Agg(C6154Dwx c6154Dwx) {
        return AnonymousClass002.A1L(this.A00.AFr(c6154Dwx));
    }

    @Override // X.InterfaceC6272DzP
    public final boolean Agh(int i, int i2) {
        EA1 ea1 = this.A00;
        if (Util.A0O(i2)) {
            return true;
        }
        DMX dmx = ea1.A0e;
        if (Arrays.binarySearch(dmx.A01, i2) >= 0) {
            return i == -1 || i <= dmx.A00;
        }
        return false;
    }

    @Override // X.InterfaceC6172DxF
    public final void flush() throws IllegalStateException {
        this.A00.flush();
    }

    @Override // X.InterfaceC6172DxF
    public final boolean isEnded() {
        return this.A00.isEnded();
    }

    @Override // X.InterfaceC6172DxF
    public final void pause() throws IllegalStateException {
        this.A00.pause();
    }

    @Override // X.InterfaceC6172DxF
    public final void play() throws IllegalStateException {
        this.A00.play();
    }

    @Override // X.InterfaceC6172DxF
    public final void reset() throws IllegalStateException {
        this.A00.reset();
    }

    public EA4(EA1 ea1) {
        this.A00 = ea1;
    }
}
