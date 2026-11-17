package X;

import android.media.AudioDeviceInfo;
import android.media.AudioManager;

/* loaded from: classes6.dex */
public final class GXJ implements AudioManager.OnCommunicationDeviceChangedListener {
    public final /* synthetic */ AudioManager A00;
    public final /* synthetic */ GXD A01;
    public final /* synthetic */ InterfaceC9648GXn A02;

    public GXJ(AudioManager audioManager, GXD gxd, InterfaceC9648GXn interfaceC9648GXn) {
        this.A02 = interfaceC9648GXn;
        this.A01 = gxd;
        this.A00 = audioManager;
    }

    @Override // android.media.AudioManager.OnCommunicationDeviceChangedListener
    public final void onCommunicationDeviceChanged(AudioDeviceInfo audioDeviceInfo) {
        InterfaceC9648GXn interfaceC9648GXn = this.A02;
        GXD gxd = this.A01;
        InterfaceC9648GXn.A00(interfaceC9648GXn, AnonymousClass006.A0y(audioDeviceInfo != null ? Integer.valueOf(audioDeviceInfo.getType()) : null, ": ", C3cG.A0f(gxd.A02(audioDeviceInfo), "deviceChangedListener: changed to device ")));
        gxd.A00 = audioDeviceInfo;
        if (gxd.A04 && gxd.A0Q() == GXX.A05) {
            InterfaceC9648GXn.A00(interfaceC9648GXn, FGI.A0r("deviceChangedListener: speakerphone finished turning on for video call | AudioManager: ", this.A00.isSpeakerphoneOn()));
            gxd.A04 = false;
        }
        if (gxd.aomCurrentAudioOutput != gxd.A0Q()) {
            InterfaceC9648GXn.A00(interfaceC9648GXn, AnonymousClass006.A0y(gxd.A02(audioDeviceInfo), " to ", C3cG.A0f(gxd.aomCurrentAudioOutput, "deviceChangedListener: aomCurrentAudioOutput updated from ")));
            GXX gxxA0Q = gxd.A0Q();
            C7384Etj.A0Y(gxxA0Q, 0);
            gxd.aomCurrentAudioOutput = gxxA0Q;
            gxd.A0A.post(new RunnableC9650GXt(gxd));
        }
        gxd.A0d();
    }
}
