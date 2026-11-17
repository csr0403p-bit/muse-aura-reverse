package com.facebook.rsys.audiodevicestate.manager.gen;

import X.AnonymousClass005;
import X.BV8;
import X.C60O;
import X.C8926Fti;
import X.G50;
import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.rsys.audiodevicestate.gen.AudioDeviceContext;

/* loaded from: classes6.dex */
public class AudioDeviceRtcSessionStartParams {
    public static G50<AudioDeviceRtcSessionStartParams> CONVERTER = C8926Fti.A00(4);
    public static long sMcfTypeId;
    public final int audioDeviceModuleType;
    public final boolean enablePrebuffering;
    public final AudioDeviceContext initialAudioDeviceContext;

    public static native AudioDeviceRtcSessionStartParams createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AudioDeviceRtcSessionStartParams) {
                AudioDeviceRtcSessionStartParams audioDeviceRtcSessionStartParams = (AudioDeviceRtcSessionStartParams) obj;
                if (this.audioDeviceModuleType != audioDeviceRtcSessionStartParams.audioDeviceModuleType || this.enablePrebuffering != audioDeviceRtcSessionStartParams.enablePrebuffering || !this.initialAudioDeviceContext.equals(audioDeviceRtcSessionStartParams.initialAudioDeviceContext)) {
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass005.A0G(this.initialAudioDeviceContext, (((527 + this.audioDeviceModuleType) * 31) + (this.enablePrebuffering ? 1 : 0)) * 31);
    }

    public String toString() {
        StringBuilder sbA0x = C60O.A0x("AudioDeviceRtcSessionStartParams{audioDeviceModuleType=");
        sbA0x.append(this.audioDeviceModuleType);
        sbA0x.append(",enablePrebuffering=");
        sbA0x.append(this.enablePrebuffering);
        sbA0x.append(",initialAudioDeviceContext=");
        return BV8.A0v(this.initialAudioDeviceContext, sbA0x);
    }

    public AudioDeviceRtcSessionStartParams(int i, boolean z, AudioDeviceContext audioDeviceContext) {
        audioDeviceContext.getClass();
        this.audioDeviceModuleType = i;
        this.enablePrebuffering = z;
        this.initialAudioDeviceContext = audioDeviceContext;
    }
}
