package com.facebook.aura.pause;

import X.AnonymousClass001;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.C06G;
import X.C06H;
import X.C0KA;
import X.C2hx;
import X.C7384Etj;
import X.C9hr;
import X.C9iI;
import X.C9iZ;
import X.C9j5;
import X.F60;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes3.dex */
public final class EnrollmentDataJson extends C06G {
    public static final Companion Companion = new Companion();
    public final String encryptedPassphrase;
    public final String keyId;
    public final boolean requiresBiometric;

    public final class Companion {
        public final C9hr<EnrollmentDataJson> serializer() {
            return EnrollmentDataJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_pause_pause(EnrollmentDataJson enrollmentDataJson, C9j5 c9j5, C9iZ c9iZ) {
        c9j5.AAV(enrollmentDataJson.keyId, c9iZ, 0);
        c9j5.AAV(enrollmentDataJson.encryptedPassphrase, c9iZ, 1);
        if (c9j5.AfR() || enrollmentDataJson.requiresBiometric) {
            c9j5.AA7(c9iZ, 2, enrollmentDataJson.requiresBiometric);
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof EnrollmentDataJson) {
                EnrollmentDataJson enrollmentDataJson = (EnrollmentDataJson) obj;
                if (!C7384Etj.areEqual(this.keyId, enrollmentDataJson.keyId) || !C7384Etj.areEqual(this.encryptedPassphrase, enrollmentDataJson.encryptedPassphrase) || this.requiresBiometric != enrollmentDataJson.requiresBiometric) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ EnrollmentDataJson copy$default(EnrollmentDataJson enrollmentDataJson, String str, String str2, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = enrollmentDataJson.keyId;
        }
        if ((i & 2) != 0) {
            str2 = enrollmentDataJson.encryptedPassphrase;
        }
        if ((i & 4) != 0) {
            z = enrollmentDataJson.requiresBiometric;
        }
        return enrollmentDataJson.copy(str, str2, z);
    }

    public final String component1() {
        return this.keyId;
    }

    public final String component2() {
        return this.encryptedPassphrase;
    }

    public final boolean component3() {
        return this.requiresBiometric;
    }

    public final String getEncryptedPassphrase() {
        return this.encryptedPassphrase;
    }

    public final String getKeyId() {
        return this.keyId;
    }

    public final boolean getRequiresBiometric() {
        return this.requiresBiometric;
    }

    public int hashCode() {
        return C0KA.A00(AnonymousClass005.A0I(this.encryptedPassphrase, AnonymousClass001.A0G(this.keyId)), this.requiresBiometric);
    }

    public EnrollmentDataJson(String str, String str2, boolean z) {
        AnonymousClass003.A0u(str, str2);
        this.keyId = str;
        this.encryptedPassphrase = str2;
        this.requiresBiometric = z;
    }

    public final EnrollmentDataJson copy(String str, String str2, boolean z) {
        AnonymousClass003.A0u(str, str2);
        return new EnrollmentDataJson(str, str2, z);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ EnrollmentDataJson(int i, String str, String str2, boolean z, C2hx c2hx) {
        if (3 != (i & 3)) {
            C9iI.A00(EnrollmentDataJson$$serializer.descriptor, i, 3);
            throw F60.createAndThrow();
        }
        this.keyId = str;
        this.encryptedPassphrase = str2;
        this.requiresBiometric = (i & 4) == 0 ? false : z;
    }

    public /* synthetic */ EnrollmentDataJson(String str, String str2, boolean z, int i, C06H c06h) {
        this(str, str2, AnonymousClass005.A1O(i, z));
    }
}
