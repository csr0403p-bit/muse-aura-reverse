package com.facebook.aura.pause;

import X.AnonymousClass001;
import X.AnonymousClass003;
import X.C06G;
import X.C0KA;
import X.C7384Etj;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class EnrollmentData extends C06G {
    public static final int $stable = 8;
    public final byte[] encryptedPassphrase;
    public final String keyId;
    public final boolean requiresBiometric;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof EnrollmentData) {
                EnrollmentData enrollmentData = (EnrollmentData) obj;
                if (!C7384Etj.areEqual(this.keyId, enrollmentData.keyId) || !Arrays.equals(this.encryptedPassphrase, enrollmentData.encryptedPassphrase) || this.requiresBiometric != enrollmentData.requiresBiometric) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ EnrollmentData copy$default(EnrollmentData enrollmentData, String str, byte[] bArr, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = enrollmentData.keyId;
        }
        if ((i & 2) != 0) {
            bArr = enrollmentData.encryptedPassphrase;
        }
        if ((i & 4) != 0) {
            z = enrollmentData.requiresBiometric;
        }
        return enrollmentData.copy(str, bArr, z);
    }

    public final String component1() {
        return this.keyId;
    }

    public final byte[] component2() {
        return this.encryptedPassphrase;
    }

    public final boolean component3() {
        return this.requiresBiometric;
    }

    public final byte[] getEncryptedPassphrase() {
        return this.encryptedPassphrase;
    }

    public final String getKeyId() {
        return this.keyId;
    }

    public final boolean getRequiresBiometric() {
        return this.requiresBiometric;
    }

    public int hashCode() {
        return C0KA.A00((AnonymousClass001.A0G(this.keyId) + Arrays.hashCode(this.encryptedPassphrase)) * 31, this.requiresBiometric);
    }

    public EnrollmentData(String str, byte[] bArr, boolean z) {
        AnonymousClass003.A0u(str, bArr);
        this.keyId = str;
        this.encryptedPassphrase = bArr;
        this.requiresBiometric = z;
    }

    public final EnrollmentData copy(String str, byte[] bArr, boolean z) {
        AnonymousClass003.A0u(str, bArr);
        return new EnrollmentData(str, bArr, z);
    }

    public String toString() {
        return super.toString();
    }
}
