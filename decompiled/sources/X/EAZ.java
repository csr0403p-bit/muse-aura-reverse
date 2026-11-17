package X;

import android.media.AudioTrack;

/* loaded from: classes5.dex */
public final class EAZ extends AudioTrack.StreamEventCallback {
    public final /* synthetic */ EAY A00;

    public EAZ(EAY eay) {
        this.A00 = eay;
    }

    @Override // android.media.AudioTrack.StreamEventCallback
    public final void onDataRequest(AudioTrack audioTrack, int i) {
        InterfaceC6515EAr interfaceC6515EAr;
        EA2 ea2 = this.A00.A02;
        if (audioTrack.equals(ea2.A0C) && (interfaceC6515EAr = ea2.A0I) != null && ea2.A0T) {
            interfaceC6515EAr.AUP();
        }
    }

    @Override // android.media.AudioTrack.StreamEventCallback
    public final void onPresentationEnded(AudioTrack audioTrack) {
        EA2 ea2 = this.A00.A02;
        if (audioTrack.equals(ea2.A0C)) {
            ea2.A0Q = true;
        }
    }

    @Override // android.media.AudioTrack.StreamEventCallback
    public final void onTearDown(AudioTrack audioTrack) {
        InterfaceC6515EAr interfaceC6515EAr;
        EA2 ea2 = this.A00.A02;
        if (audioTrack.equals(ea2.A0C) && (interfaceC6515EAr = ea2.A0I) != null && ea2.A0T) {
            interfaceC6515EAr.AUP();
        }
    }
}
