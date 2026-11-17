package X;

import android.media.AudioTrack;

/* renamed from: X.EAa, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C6511EAa extends AudioTrack.StreamEventCallback {
    public final /* synthetic */ C6512EAb A00;

    public C6511EAa(C6512EAb c6512EAb) {
        this.A00 = c6512EAb;
    }

    @Override // android.media.AudioTrack.StreamEventCallback
    public final void onDataRequest(AudioTrack audioTrack, int i) {
        InterfaceC6515EAr interfaceC6515EAr;
        EA1 ea1 = this.A00.A02;
        if (audioTrack.equals(ea1.A05) && (interfaceC6515EAr = ea1.A0A) != null && ea1.A0H) {
            interfaceC6515EAr.AUP();
        }
    }

    @Override // android.media.AudioTrack.StreamEventCallback
    public final void onTearDown(AudioTrack audioTrack) {
        InterfaceC6515EAr interfaceC6515EAr;
        EA1 ea1 = this.A00.A02;
        if (audioTrack.equals(ea1.A05) && (interfaceC6515EAr = ea1.A0A) != null && ea1.A0H) {
            interfaceC6515EAr.AUP();
        }
    }
}
