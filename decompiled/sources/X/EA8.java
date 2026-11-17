package X;

import android.media.AudioDeviceInfo;
import androidx.media3.common.audio.AudioProcessor$UnhandledAudioFormatException;
import androidx.media3.common.util.Util;
import androidx.media3.exoplayer.audio.AudioSink$ConfigurationException;
import java.nio.ByteBuffer;

/* loaded from: classes5.dex */
public final class EA8 implements InterfaceC6272DzP {
    public final DMY A00;
    public final EA2 A01;

    @Override // X.InterfaceC6272DzP
    public final void ABC() {
    }

    @Override // X.InterfaceC6172DxF
    public final void A6p(C6154Dwx c6154Dwx, int[] iArr, int i) throws AudioProcessor$UnhandledAudioFormatException, AudioSink$ConfigurationException {
        this.A01.A6p(c6154Dwx, iArr, i);
    }

    @Override // X.InterfaceC6172DxF
    public final void A92() throws IllegalStateException {
        this.A01.A92();
    }

    @Override // X.InterfaceC6172DxF
    public final void AA0() throws IllegalStateException {
        this.A01.AA0();
    }

    @Override // X.InterfaceC6172DxF
    public final long ACb() {
        return this.A01.ACb();
    }

    @Override // X.InterfaceC6172DxF
    public final long AEW(boolean z) {
        return this.A01.AEW(z);
    }

    @Override // X.InterfaceC6172DxF
    public final int AFr(C6154Dwx c6154Dwx) {
        return this.A01.AFr(c6154Dwx);
    }

    @Override // X.InterfaceC6172DxF
    public final C6233Dyb AIo() {
        return this.A01.A0F;
    }

    @Override // X.InterfaceC6172DxF
    public final boolean AN2(ByteBuffer byteBuffer, int i, long j) {
        return this.A01.AN2(byteBuffer, i, j);
    }

    @Override // X.InterfaceC6172DxF
    public final void AN3() {
        this.A01.A0V = true;
    }

    @Override // X.InterfaceC6172DxF
    public final boolean ANF() {
        return this.A01.ANF();
    }

    @Override // X.InterfaceC6172DxF
    public final void AXz() throws IllegalStateException {
        this.A01.AXz();
    }

    @Override // X.InterfaceC6172DxF
    public final void Aco(DrN drN) throws IllegalStateException {
        this.A01.Aco(drN);
    }

    @Override // X.InterfaceC6172DxF
    public final void Acq(int i) throws IllegalStateException {
        this.A01.Acq(i);
    }

    @Override // X.InterfaceC6172DxF
    public final void Acr(C6504E9t c6504E9t) {
        this.A01.Acr(c6504E9t);
    }

    @Override // X.InterfaceC6172DxF
    public final void Ade(InterfaceC6515EAr interfaceC6515EAr) {
        this.A01.A0I = interfaceC6515EAr;
    }

    @Override // X.InterfaceC6172DxF
    public final void Ae1(C6233Dyb c6233Dyb) {
        this.A01.Ae1(c6233Dyb);
    }

    @Override // X.InterfaceC6172DxF
    public final void Ae6(E6Y e6y) {
        this.A01.A0G = e6y;
    }

    @Override // X.InterfaceC6172DxF
    public final void AeB(AudioDeviceInfo audioDeviceInfo) {
        this.A01.AeB(audioDeviceInfo);
    }

    @Override // X.InterfaceC6172DxF
    public final void Aei(boolean z) {
        this.A01.Aei(z);
    }

    @Override // X.InterfaceC6172DxF
    public final void AfF(float f) {
        this.A01.AfF(f);
    }

    @Override // X.InterfaceC6172DxF
    public final boolean Agg(C6154Dwx c6154Dwx) {
        return AnonymousClass002.A1L(this.A01.AFr(c6154Dwx));
    }

    @Override // X.InterfaceC6172DxF
    public final void flush() throws IllegalStateException {
        this.A01.flush();
    }

    @Override // X.InterfaceC6172DxF
    public final boolean isEnded() {
        return this.A01.isEnded();
    }

    @Override // X.InterfaceC6172DxF
    public final void pause() throws IllegalStateException {
        this.A01.pause();
    }

    @Override // X.InterfaceC6172DxF
    public final void play() throws IllegalStateException {
        this.A01.play();
    }

    @Override // X.InterfaceC6172DxF
    public final void reset() throws IllegalStateException {
        this.A01.reset();
    }

    public EA8(DMY dmy, EA2 ea2) {
        this.A01 = ea2;
        this.A00 = dmy;
    }

    @Override // X.InterfaceC6272DzP
    public final boolean Agh(int i, int i2) {
        if (!Util.A0O(i2)) {
            DMY dmy = this.A00;
            if (dmy.A01.indexOfKey(i2) < 0 || (i != -1 && i > dmy.A00)) {
                return false;
            }
        }
        return true;
    }
}
