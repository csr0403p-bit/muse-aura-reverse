package X;

import android.media.AudioDeviceCallback;
import android.media.AudioDeviceInfo;

/* renamed from: X.GXm, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9647GXm extends AudioDeviceCallback {
    public final /* synthetic */ GXH A00;

    @Override // android.media.AudioDeviceCallback
    public final void onAudioDevicesAdded(AudioDeviceInfo[] audioDeviceInfoArr) {
        C7384Etj.A0Y(audioDeviceInfoArr, 0);
        super.onAudioDevicesAdded(audioDeviceInfoArr);
        this.A00.A01(audioDeviceInfoArr, new AudioDeviceInfo[0]);
    }

    @Override // android.media.AudioDeviceCallback
    public final void onAudioDevicesRemoved(AudioDeviceInfo[] audioDeviceInfoArr) {
        C7384Etj.A0Y(audioDeviceInfoArr, 0);
        super.onAudioDevicesRemoved(audioDeviceInfoArr);
        this.A00.A01(new AudioDeviceInfo[0], audioDeviceInfoArr);
    }

    public C9647GXm(GXH gxh) {
        this.A00 = gxh;
    }
}
