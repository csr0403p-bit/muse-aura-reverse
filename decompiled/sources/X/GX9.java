package X;

import android.media.AudioDeviceInfo;

/* loaded from: classes6.dex */
public abstract class GX9 {
    public static final GXX A00(AudioDeviceInfo audioDeviceInfo) {
        if (audioDeviceInfo != null) {
            int type = audioDeviceInfo.getType();
            if (type == 1) {
                return GXX.A03;
            }
            if (type == 2 || type == 27) {
                return GXX.A05;
            }
            if (type == 3 || type == 22 || type == 4) {
                return GXX.A04;
            }
            if (type == 7 || type == 26 || type == 23) {
                return GXX.A02;
            }
        }
        return null;
    }
}
