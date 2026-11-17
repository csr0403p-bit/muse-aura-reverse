package com.facebook.rsys.crypto.gen;

import X.AbstractC7610F5x;
import X.BV8;
import X.C60O;
import X.C8926Fti;
import X.G50;
import com.facebook.djinni.msys.infra.McfReference;
import java.util.Arrays;

/* loaded from: classes6.dex */
public class CryptoParticipantIdentity {
    public static G50<CryptoParticipantIdentity> CONVERTER = C8926Fti.A00(45);
    public static long sMcfTypeId;
    public final boolean isNewIdentityKey;
    public final String participantId;
    public final byte[] publicIdentityKey;

    public static native CryptoParticipantIdentity createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof CryptoParticipantIdentity) {
                CryptoParticipantIdentity cryptoParticipantIdentity = (CryptoParticipantIdentity) obj;
                if (!this.participantId.equals(cryptoParticipantIdentity.participantId) || !Arrays.equals(this.publicIdentityKey, cryptoParticipantIdentity.publicIdentityKey) || this.isNewIdentityKey != cryptoParticipantIdentity.isNewIdentityKey) {
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((BV8.A0B(this.participantId) + Arrays.hashCode(this.publicIdentityKey)) * 31) + (this.isNewIdentityKey ? 1 : 0);
    }

    public String toString() {
        StringBuilder sbA0x = C60O.A0x("CryptoParticipantIdentity{participantId=");
        sbA0x.append(this.participantId);
        sbA0x.append(",publicIdentityKey=");
        sbA0x.append(this.publicIdentityKey);
        sbA0x.append(",isNewIdentityKey=");
        return AbstractC7610F5x.A0y(sbA0x, this.isNewIdentityKey);
    }

    public CryptoParticipantIdentity(String str, byte[] bArr, boolean z) {
        str.getClass();
        bArr.getClass();
        this.participantId = str;
        this.publicIdentityKey = bArr;
        this.isNewIdentityKey = z;
    }
}
