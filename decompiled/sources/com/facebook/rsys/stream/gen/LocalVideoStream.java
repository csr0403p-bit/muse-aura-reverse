package com.facebook.rsys.stream.gen;

import X.BV8;
import X.C60O;
import X.C8922Fte;
import X.G50;
import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.rsys.media.gen.StreamInfo;

/* loaded from: classes6.dex */
public class LocalVideoStream {
    public static G50<LocalVideoStream> CONVERTER = C8922Fte.A00(21);
    public static long sMcfTypeId;
    public final StreamInfo streamInfo;
    public final int streamState;

    public static native LocalVideoStream createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof LocalVideoStream) {
                LocalVideoStream localVideoStream = (LocalVideoStream) obj;
                if (!this.streamInfo.equals(localVideoStream.streamInfo) || this.streamState != localVideoStream.streamState) {
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return BV8.A09(this.streamInfo) + this.streamState;
    }

    public String toString() {
        StringBuilder sbA0x = C60O.A0x("LocalVideoStream{streamInfo=");
        sbA0x.append(this.streamInfo);
        sbA0x.append(",streamState=");
        return BV8.A0z(sbA0x, this.streamState);
    }

    public LocalVideoStream(StreamInfo streamInfo, int i) {
        streamInfo.getClass();
        this.streamInfo = streamInfo;
        this.streamState = i;
    }
}
