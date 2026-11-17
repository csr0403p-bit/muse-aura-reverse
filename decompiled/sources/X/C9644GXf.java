package X;

import android.media.AudioDeviceCallback;
import android.media.AudioDeviceInfo;

/* renamed from: X.GXf, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9644GXf extends AudioDeviceCallback {
    public String A00;
    public boolean A01;
    public final /* synthetic */ GXF A02;

    @Override // android.media.AudioDeviceCallback
    public final void onAudioDevicesAdded(AudioDeviceInfo[] audioDeviceInfoArr) {
        C7384Etj.A0Y(audioDeviceInfoArr, 0);
        super.onAudioDevicesAdded(audioDeviceInfoArr);
        GXF gxf = this.A02;
        gxf.A08.A01(audioDeviceInfoArr, new AudioDeviceInfo[0]);
        if (this.A01) {
            return;
        }
        for (AudioDeviceInfo audioDeviceInfo : audioDeviceInfoArr) {
            if (audioDeviceInfo.getType() == 7 || audioDeviceInfo.getType() == 26) {
                this.A01 = true;
                this.A00 = audioDeviceInfo.getAddress();
                GXT gxt = gxf.A0G;
                if (gxt != null) {
                    gxt.A00(2);
                    return;
                }
                return;
            }
        }
    }

    @Override // android.media.AudioDeviceCallback
    public final void onAudioDevicesRemoved(AudioDeviceInfo[] audioDeviceInfoArr) {
        C7384Etj.A0Y(audioDeviceInfoArr, 0);
        super.onAudioDevicesRemoved(audioDeviceInfoArr);
        GXF gxf = this.A02;
        gxf.A08.A01(new AudioDeviceInfo[0], audioDeviceInfoArr);
        if (this.A01) {
            for (AudioDeviceInfo audioDeviceInfo : audioDeviceInfoArr) {
                if (C7384Etj.areEqual(audioDeviceInfo.getAddress(), this.A00)) {
                    GXT gxt = gxf.A0G;
                    if (gxt != null) {
                        gxt.A00(0);
                    }
                    this.A01 = false;
                    this.A00 = null;
                    return;
                }
            }
        }
    }

    public C9644GXf(GXF gxf) {
        this.A02 = gxf;
    }
}
