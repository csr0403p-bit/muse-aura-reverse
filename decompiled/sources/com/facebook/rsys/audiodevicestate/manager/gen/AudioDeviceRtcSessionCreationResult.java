package com.facebook.rsys.audiodevicestate.manager.gen;

import X.AbstractC7610F5x;
import X.AnonymousClass001;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C60O;
import X.C8926Fti;
import X.G50;
import com.facebook.djinni.msys.infra.McfReference;

/* loaded from: classes6.dex */
public class AudioDeviceRtcSessionCreationResult {
    public static G50<AudioDeviceRtcSessionCreationResult> CONVERTER = C8926Fti.A00(3);
    public static long sMcfTypeId;
    public final AudioDeviceRtcSession audioDeviceRtcSession;
    public final int code;
    public final String failedCreationSessionId;
    public final String message;

    public static native AudioDeviceRtcSessionCreationResult createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AudioDeviceRtcSessionCreationResult) {
                AudioDeviceRtcSessionCreationResult audioDeviceRtcSessionCreationResult = (AudioDeviceRtcSessionCreationResult) obj;
                if (this.code == audioDeviceRtcSessionCreationResult.code) {
                    AudioDeviceRtcSession audioDeviceRtcSession = this.audioDeviceRtcSession;
                    AudioDeviceRtcSession audioDeviceRtcSession2 = audioDeviceRtcSessionCreationResult.audioDeviceRtcSession;
                    if (audioDeviceRtcSession != null ? audioDeviceRtcSession.equals(audioDeviceRtcSession2) : audioDeviceRtcSession2 == null) {
                        String str = this.failedCreationSessionId;
                        String str2 = audioDeviceRtcSessionCreationResult.failedCreationSessionId;
                        if (str == null) {
                            if (str2 != null) {
                                return false;
                            }
                        } else if (str.equals(str2)) {
                        }
                        if (this.message.equals(audioDeviceRtcSessionCreationResult.message)) {
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass001.A0H(this.message, (((((527 + this.code) * 31) + AnonymousClass006.A0D(this.audioDeviceRtcSession)) * 31) + AnonymousClass005.A0H(this.failedCreationSessionId)) * 31);
    }

    public String toString() {
        StringBuilder sbA0x = C60O.A0x("AudioDeviceRtcSessionCreationResult{code=");
        sbA0x.append(this.code);
        sbA0x.append(",audioDeviceRtcSession=");
        sbA0x.append(this.audioDeviceRtcSession);
        sbA0x.append(",failedCreationSessionId=");
        sbA0x.append(this.failedCreationSessionId);
        sbA0x.append(",message=");
        return AbstractC7610F5x.A0w(this.message, sbA0x);
    }

    public AudioDeviceRtcSessionCreationResult(int i, AudioDeviceRtcSession audioDeviceRtcSession, String str, String str2) {
        str2.getClass();
        this.code = i;
        this.audioDeviceRtcSession = audioDeviceRtcSession;
        this.failedCreationSessionId = str;
        this.message = str2;
    }
}
