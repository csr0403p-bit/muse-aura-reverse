package com.facebook.rsys.media.gen;

import X.AnonymousClass006;
import X.C8925Fth;
import X.FGI;
import X.G50;
import com.facebook.djinni.msys.infra.McfReference;

/* loaded from: classes6.dex */
public class StreamInfo {
    public static G50<StreamInfo> CONVERTER = C8925Fth.A00(44);
    public static long sMcfTypeId;
    public final String streamName;
    public final int streamType;

    public static native StreamInfo createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof StreamInfo) {
                StreamInfo streamInfo = (StreamInfo) obj;
                if (this.streamType == streamInfo.streamType) {
                    String str = this.streamName;
                    String str2 = streamInfo.streamName;
                    if (str != null ? !str.equals(str2) : str2 != null) {
                    }
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((527 + this.streamType) * 31) + AnonymousClass006.A0G(this.streamName);
    }

    public String toString() {
        return FGI.A09(this.streamType, "StreamInfo{streamType=", ",streamName=", this.streamName, "}");
    }

    public StreamInfo(int i, String str) {
        this.streamType = i;
        this.streamName = str;
    }
}
