package com.facebook.rsys.crypto.gen;

import X.BV8;
import X.C60O;
import X.C8926Fti;
import X.G50;
import com.facebook.djinni.msys.infra.McfReference;
import java.util.Arrays;

/* loaded from: classes6.dex */
public class ParticipantIdentityInfo {
    public static G50<ParticipantIdentityInfo> CONVERTER = C8926Fti.A00(46);
    public static long sMcfTypeId;
    public final String participantId;
    public final byte[] publicIdentityKey;

    public static native ParticipantIdentityInfo createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ParticipantIdentityInfo) {
                ParticipantIdentityInfo participantIdentityInfo = (ParticipantIdentityInfo) obj;
                if (!this.participantId.equals(participantIdentityInfo.participantId) || !Arrays.equals(this.publicIdentityKey, participantIdentityInfo.publicIdentityKey)) {
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return BV8.A0B(this.participantId) + Arrays.hashCode(this.publicIdentityKey);
    }

    public String toString() {
        StringBuilder sbA0x = C60O.A0x("ParticipantIdentityInfo{participantId=");
        sbA0x.append(this.participantId);
        sbA0x.append(",publicIdentityKey=");
        return BV8.A0v(this.publicIdentityKey, sbA0x);
    }

    public ParticipantIdentityInfo(String str, byte[] bArr) {
        str.getClass();
        bArr.getClass();
        this.participantId = str;
        this.publicIdentityKey = bArr;
    }
}
