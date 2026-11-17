package com.meta.mfa.credentials;

import X.AnonymousClass005;
import X.C06H;
import X.C07729ii;
import X.C07779iq;
import X.C07839ix;
import X.C2hx;
import X.C7384Etj;
import X.C9hr;
import X.C9iI;
import X.C9iZ;
import X.C9j5;
import X.C9lr;
import X.C9lv;
import X.F60;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes4.dex */
public final class ClientData {
    public static final Companion Companion = new Companion();
    public final String aaguid;
    public final String challenge;
    public final String credentialId;
    public final AuthDataFlags flags;
    public final String origin;
    public final String osType;
    public final String publicKey;
    public final Integer publicKeyAlgorithm;
    public final String rawId;
    public final String type;
    public final String userPreference;
    public final Boolean uvpaa;

    public final class Companion {
        public final C9hr<ClientData> serializer() {
            return C9lr.A00;
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_java_com_meta_mfa_credentials_credentials(ClientData clientData, C9j5 c9j5, C9iZ c9iZ) {
        c9j5.AAV(clientData.type, c9iZ, 0);
        c9j5.AAV(clientData.challenge, c9iZ, 1);
        c9j5.AAV(clientData.origin, c9iZ, 2);
        boolean zAfR = c9j5.AfR();
        if (zAfR || clientData.uvpaa != null) {
            c9j5.AAP(clientData.uvpaa, C07839ix.A00, c9iZ, 3);
        }
        if (zAfR || clientData.userPreference != null) {
            c9j5.AAP(clientData.userPreference, C07779iq.A01, c9iZ, 4);
        }
        if (zAfR || clientData.aaguid != null) {
            c9j5.AAP(clientData.aaguid, C07779iq.A01, c9iZ, 5);
        }
        if (zAfR || !"Android".equals(clientData.osType)) {
            c9j5.AAV(clientData.osType, c9iZ, 6);
        }
        if (zAfR || clientData.credentialId != null) {
            c9j5.AAP(clientData.credentialId, C07779iq.A01, c9iZ, 7);
        }
        if (zAfR || clientData.publicKey != null) {
            c9j5.AAP(clientData.publicKey, C07779iq.A01, c9iZ, 8);
        }
        if (zAfR || clientData.publicKeyAlgorithm != null) {
            c9j5.AAP(clientData.publicKeyAlgorithm, C07729ii.A00, c9iZ, 9);
        }
        if (zAfR || clientData.flags != null) {
            c9j5.AAP(clientData.flags, C9lv.A00, c9iZ, 10);
        }
        if (zAfR || clientData.rawId != null) {
            c9j5.AAP(clientData.rawId, C07779iq.A01, c9iZ, 11);
        }
    }

    public static /* synthetic */ void getAaguid$annotations() {
    }

    public static /* synthetic */ void getChallenge$annotations() {
    }

    public static /* synthetic */ void getCredentialId$annotations() {
    }

    public static /* synthetic */ void getFlags$annotations() {
    }

    public static /* synthetic */ void getOrigin$annotations() {
    }

    public static /* synthetic */ void getOsType$annotations() {
    }

    public static /* synthetic */ void getPublicKey$annotations() {
    }

    public static /* synthetic */ void getPublicKeyAlgorithm$annotations() {
    }

    public static /* synthetic */ void getRawId$annotations() {
    }

    public static /* synthetic */ void getType$annotations() {
    }

    public static /* synthetic */ void getUserPreference$annotations() {
    }

    public static /* synthetic */ void getUvpaa$annotations() {
    }

    public final String getAaguid() {
        return this.aaguid;
    }

    public final String getChallenge() {
        return this.challenge;
    }

    public final String getCredentialId() {
        return this.credentialId;
    }

    public final AuthDataFlags getFlags() {
        return this.flags;
    }

    public final String getOrigin() {
        return this.origin;
    }

    public final String getOsType() {
        return this.osType;
    }

    public final String getPublicKey() {
        return this.publicKey;
    }

    public final Integer getPublicKeyAlgorithm() {
        return this.publicKeyAlgorithm;
    }

    public final String getRawId() {
        return this.rawId;
    }

    public final String getType() {
        return this.type;
    }

    public final String getUserPreference() {
        return this.userPreference;
    }

    public final Boolean getUvpaa() {
        return this.uvpaa;
    }

    public ClientData(String str, String str2, String str3, Boolean bool, String str4, String str5, String str6, String str7, String str8, Integer num, AuthDataFlags authDataFlags, String str9) {
        AnonymousClass005.A0x(str, str2, str3);
        C7384Etj.A0Y(str6, 6);
        this.type = str;
        this.challenge = str2;
        this.origin = str3;
        this.uvpaa = bool;
        this.userPreference = str4;
        this.aaguid = str5;
        this.osType = str6;
        this.credentialId = str7;
        this.publicKey = str8;
        this.publicKeyAlgorithm = num;
        this.flags = authDataFlags;
        this.rawId = str9;
    }

    public /* synthetic */ ClientData(int i, String str, String str2, String str3, Boolean bool, String str4, String str5, String str6, String str7, String str8, Integer num, AuthDataFlags authDataFlags, String str9, C2hx c2hx) {
        if (7 != (i & 7)) {
            C9iI.A00(C9lr.A01, i, 7);
            throw F60.createAndThrow();
        }
        this.type = str;
        this.challenge = str2;
        this.origin = str3;
        if ((i & 8) == 0) {
            this.uvpaa = null;
        } else {
            this.uvpaa = bool;
        }
        if ((i & 16) == 0) {
            this.userPreference = null;
        } else {
            this.userPreference = str4;
        }
        if ((i & 32) == 0) {
            this.aaguid = null;
        } else {
            this.aaguid = str5;
        }
        if ((i & 64) == 0) {
            this.osType = "Android";
        } else {
            this.osType = str6;
        }
        if ((i & 128) == 0) {
            this.credentialId = null;
        } else {
            this.credentialId = str7;
        }
        if ((i & 256) == 0) {
            this.publicKey = null;
        } else {
            this.publicKey = str8;
        }
        if ((i & 512) == 0) {
            this.publicKeyAlgorithm = null;
        } else {
            this.publicKeyAlgorithm = num;
        }
        if ((i & 1024) == 0) {
            this.flags = null;
        } else {
            this.flags = authDataFlags;
        }
        if ((i & 2048) == 0) {
            this.rawId = null;
        } else {
            this.rawId = str9;
        }
    }

    public /* synthetic */ ClientData(String str, String str2, String str3, Boolean bool, String str4, String str5, String str6, String str7, String str8, Integer num, AuthDataFlags authDataFlags, String str9, int i, C06H c06h) {
        this(str, str2, str3, (i & 8) != 0 ? null : bool, (i & 16) != 0 ? null : str4, (i & 32) != 0 ? null : str5, (i & 64) != 0 ? "Android" : str6, (i & 128) != 0 ? null : str7, (i & 256) != 0 ? null : str8, (i & 512) != 0 ? null : num, (i & 1024) != 0 ? null : authDataFlags, (i & 2048) != 0 ? null : str9);
    }
}
