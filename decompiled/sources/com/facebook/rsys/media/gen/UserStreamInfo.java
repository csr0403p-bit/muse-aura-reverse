package com.facebook.rsys.media.gen;

import X.AnonymousClass005;
import X.BV8;
import X.C60O;
import X.C8925Fth;
import X.G50;
import com.facebook.djinni.msys.infra.McfReference;

/* loaded from: classes6.dex */
public class UserStreamInfo {
    public static G50<UserStreamInfo> CONVERTER = C8925Fth.A00(45);
    public static long sMcfTypeId;
    public final StreamInfo streamInfo;
    public final String userId;

    public static native UserStreamInfo createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof UserStreamInfo) {
                UserStreamInfo userStreamInfo = (UserStreamInfo) obj;
                if (!this.userId.equals(userStreamInfo.userId) || !this.streamInfo.equals(userStreamInfo.streamInfo)) {
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass005.A0G(this.streamInfo, BV8.A0B(this.userId));
    }

    public String toString() {
        StringBuilder sbA0x = C60O.A0x("UserStreamInfo{userId=");
        sbA0x.append(this.userId);
        sbA0x.append(",streamInfo=");
        return BV8.A0v(this.streamInfo, sbA0x);
    }

    public UserStreamInfo(String str, StreamInfo streamInfo) {
        str.getClass();
        streamInfo.getClass();
        this.userId = str;
        this.streamInfo = streamInfo;
    }
}
