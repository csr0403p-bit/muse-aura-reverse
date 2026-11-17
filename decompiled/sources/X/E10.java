package X;

import android.os.Handler;

/* loaded from: classes5.dex */
public final class E10 implements InterfaceC6515EAr {
    public final /* synthetic */ C6157Dx0 A00;

    public E10(C6157Dx0 c6157Dx0) {
        this.A00 = c6157Dx0;
    }

    @Override // X.InterfaceC6515EAr
    public final void AUP() {
        E17 e17 = this.A00.A08;
        if (e17 != null) {
            e17.AXN();
        }
    }

    @Override // X.InterfaceC6515EAr
    public final void AUl(long j) {
        Dy9 dy9 = this.A00.A0H;
        Handler handler = dy9.A00;
        if (handler != null) {
            handler.post(new E15(dy9, j));
        }
    }

    @Override // X.InterfaceC6515EAr
    public final void AUn() {
        this.A00.A09 = true;
    }

    @Override // X.InterfaceC6515EAr
    public final void AWv(int i, long j, long j2) {
        Dy9 dy9 = this.A00.A0H;
        Handler handler = dy9.A00;
        if (handler != null) {
            handler.post(new E14(dy9, i, j, j2));
        }
    }

    @Override // X.InterfaceC6515EAr
    public final void onAudioSinkError(Exception exc) {
        CNC.A05("MediaCodecAudioRenderer", "Audio sink error", exc);
        Dy9 dy9 = this.A00.A0H;
        Handler handler = dy9.A00;
        if (handler != null) {
            handler.post(new E13(dy9, exc));
        }
    }

    @Override // X.InterfaceC6515EAr
    public final void onAudioTrackInitialized(C6518EAw c6518EAw) {
        Dy9 dy9 = this.A00.A0H;
        Handler handler = dy9.A00;
        if (handler != null) {
            handler.post(new E12(dy9, c6518EAw));
        }
    }

    @Override // X.InterfaceC6515EAr
    public final void onAudioTrackReleased(C6518EAw c6518EAw) {
        Dy9 dy9 = this.A00.A0H;
        Handler handler = dy9.A00;
        if (handler != null) {
            handler.post(new RunnableC6324E0z(dy9, c6518EAw));
        }
    }

    @Override // X.InterfaceC6515EAr
    public final void onSkipSilenceEnabledChanged(boolean z) {
        Dy9 dy9 = this.A00.A0H;
        Handler handler = dy9.A00;
        if (handler != null) {
            handler.post(new E16(dy9, z));
        }
    }
}
