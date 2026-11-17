package com.facebook.rsys.audio.gen;

import X.AbstractC7608F5v;
import X.AbstractC7610F5x;
import X.AnonymousClass006;
import X.C60O;
import X.C8923Ftf;
import X.G50;
import com.facebook.djinni.msys.infra.McfReference;

/* loaded from: classes6.dex */
public class EnableAudioParameters {
    public static G50<EnableAudioParameters> CONVERTER = C8923Ftf.A00(47);
    public static long sMcfTypeId;
    public final boolean enable;
    public final int streamType;
    public final String userID;

    public static native EnableAudioParameters createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof EnableAudioParameters) {
                EnableAudioParameters enableAudioParameters = (EnableAudioParameters) obj;
                String str = this.userID;
                String str2 = enableAudioParameters.userID;
                if (str != null ? str.equals(str2) : str2 == null) {
                    if (this.streamType != enableAudioParameters.streamType || this.enable != enableAudioParameters.enable) {
                    }
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((AbstractC7608F5v.A02(AnonymousClass006.A0G(this.userID)) + this.streamType) * 31) + (this.enable ? 1 : 0);
    }

    public String toString() {
        StringBuilder sbA0x = C60O.A0x("EnableAudioParameters{userID=");
        sbA0x.append(this.userID);
        sbA0x.append(",streamType=");
        sbA0x.append(this.streamType);
        sbA0x.append(",enable=");
        return AbstractC7610F5x.A0y(sbA0x, this.enable);
    }

    public EnableAudioParameters(String str, int i, boolean z) {
        this.userID = str;
        this.streamType = i;
        this.enable = z;
    }
}
