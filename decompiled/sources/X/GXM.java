package X;

import android.media.AudioDeviceCallback;
import android.media.AudioDeviceInfo;

/* loaded from: classes6.dex */
public final class GXM extends AudioDeviceCallback {
    public final /* synthetic */ GXD A00;
    public final /* synthetic */ InterfaceC9648GXn A01;

    @Override // android.media.AudioDeviceCallback
    public final void onAudioDevicesAdded(AudioDeviceInfo[] audioDeviceInfoArr) {
        C7384Etj.A0Y(audioDeviceInfoArr, 0);
        for (AudioDeviceInfo audioDeviceInfo : audioDeviceInfoArr) {
            GXD gxd = this.A00;
            if (GXD.A0G(audioDeviceInfo)) {
                gxd.A02.add(audioDeviceInfo);
                GXX gxxA02 = gxd.A02(audioDeviceInfo);
                GXX gxx = GXX.A02;
                if (gxxA02 == gxx) {
                    InterfaceC9648GXn.A00(this.A01, "onAudioDevicesAdded: bluetooth device added, changing to bluetooth");
                } else {
                    GXX gxxA022 = gxd.A02(audioDeviceInfo);
                    gxx = GXX.A04;
                    if (gxxA022 == gxx) {
                        InterfaceC9648GXn.A00(this.A01, "onAudioDevicesAdded: headset device added, changing to headset");
                        gxd.aomShouldSpeakerOnHeadsetUnplug = gxd.A0b();
                    }
                }
                gxd.A0c(gxx);
            } else if (audioDeviceInfo.isSink()) {
                InterfaceC9648GXn.A00(this.A01, FGI.A0H("onAudioDevicesAdded: skipped unsupported sink device with type ", audioDeviceInfo.getType()));
            }
        }
    }

    @Override // android.media.AudioDeviceCallback
    public final void onAudioDevicesRemoved(AudioDeviceInfo[] audioDeviceInfoArr) {
        C7384Etj.A0Y(audioDeviceInfoArr, 0);
        for (AudioDeviceInfo audioDeviceInfo : audioDeviceInfoArr) {
            GXD gxd = this.A00;
            if (GXD.A0G(audioDeviceInfo)) {
                gxd.A02.remove(audioDeviceInfo);
                GXX gxxA02 = gxd.A02(audioDeviceInfo);
                GXX gxx = GXX.A04;
                if (gxxA02 == gxx && gxd.A0Q() == gxx) {
                    InterfaceC9648GXn.A00(this.A01, "onAudioDevicesRemoved: active headset device removed");
                    gxd.A0c(gxd.A0Y() ? GXX.A02 : (gxd.aomShouldSpeakerOnHeadsetUnplug || gxd.aomDisableEarpieceMode || gxd.aomForceSpeakerOverEarpiece) ? GXX.A05 : GXX.A03);
                }
            }
        }
    }

    public GXM(GXD gxd, InterfaceC9648GXn interfaceC9648GXn) {
        this.A00 = gxd;
        this.A01 = interfaceC9648GXn;
    }
}
