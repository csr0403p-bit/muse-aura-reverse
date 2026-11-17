package com.facebook.rsys.audiodevicestate.gen;

import X.AnonymousClass005;
import X.BV8;
import X.C60O;
import X.C8923Ftf;
import X.G50;
import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.rsys.audio.gen.AudioInputRoute;
import com.facebook.rsys.audio.gen.AudioOutputRoute;

/* loaded from: classes6.dex */
public class AudioDeviceContext {
    public static G50<AudioDeviceContext> CONVERTER = C8923Ftf.A00(49);
    public static long sMcfTypeId;
    public final int currentDeviceMode;
    public final AudioInputRoute currentInputRoute;
    public final AudioOutputRoute currentOutputRoute;
    public final boolean isDeviceActive;

    public static native AudioDeviceContext createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AudioDeviceContext) {
                AudioDeviceContext audioDeviceContext = (AudioDeviceContext) obj;
                if (this.isDeviceActive != audioDeviceContext.isDeviceActive || this.currentDeviceMode != audioDeviceContext.currentDeviceMode || !this.currentOutputRoute.equals(audioDeviceContext.currentOutputRoute) || !this.currentInputRoute.equals(audioDeviceContext.currentInputRoute)) {
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass005.A0G(this.currentInputRoute, AnonymousClass005.A0F(this.currentOutputRoute, (((527 + (this.isDeviceActive ? 1 : 0)) * 31) + this.currentDeviceMode) * 31));
    }

    public String toString() {
        StringBuilder sbA0x = C60O.A0x("AudioDeviceContext{isDeviceActive=");
        sbA0x.append(this.isDeviceActive);
        sbA0x.append(",currentDeviceMode=");
        sbA0x.append(this.currentDeviceMode);
        sbA0x.append(",currentOutputRoute=");
        sbA0x.append(this.currentOutputRoute);
        sbA0x.append(",currentInputRoute=");
        return BV8.A0v(this.currentInputRoute, sbA0x);
    }

    public AudioDeviceContext(boolean z, int i, AudioOutputRoute audioOutputRoute, AudioInputRoute audioInputRoute) {
        audioOutputRoute.getClass();
        audioInputRoute.getClass();
        this.isDeviceActive = z;
        this.currentDeviceMode = i;
        this.currentOutputRoute = audioOutputRoute;
        this.currentInputRoute = audioInputRoute;
    }
}
