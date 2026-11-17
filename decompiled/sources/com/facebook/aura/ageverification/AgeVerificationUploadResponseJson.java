package com.facebook.aura.ageverification;

import X.C06G;
import X.C06H;
import X.C2hx;
import X.C3cH;
import X.C7384Etj;
import X.C9hr;
import X.C9iZ;
import X.C9j5;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes4.dex */
public final class AgeVerificationUploadResponseJson extends C06G {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion();
    public final String file_handle;

    public final class Companion {
        public final C9hr<AgeVerificationUploadResponseJson> serializer() {
            return AgeVerificationUploadResponseJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_ageverification_impl_impl(AgeVerificationUploadResponseJson ageVerificationUploadResponseJson, C9j5 c9j5, C9iZ c9iZ) {
        if (c9j5.AfR() || !C3cH.A1Q(ageVerificationUploadResponseJson.file_handle)) {
            c9j5.AAV(ageVerificationUploadResponseJson.file_handle, c9iZ, 0);
        }
    }

    public final AgeVerificationUploadResponseJson copy(String str) {
        C7384Etj.A0Y(str, 0);
        return new AgeVerificationUploadResponseJson(str);
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof AgeVerificationUploadResponseJson) && C7384Etj.areEqual(this.file_handle, ((AgeVerificationUploadResponseJson) obj).file_handle));
    }

    public static /* synthetic */ AgeVerificationUploadResponseJson copy$default(AgeVerificationUploadResponseJson ageVerificationUploadResponseJson, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = ageVerificationUploadResponseJson.file_handle;
        }
        C7384Etj.A0Y(str, 0);
        return new AgeVerificationUploadResponseJson(str);
    }

    public final String component1() {
        return this.file_handle;
    }

    public final String getFile_handle() {
        return this.file_handle;
    }

    public int hashCode() {
        return this.file_handle.hashCode();
    }

    public /* synthetic */ AgeVerificationUploadResponseJson(int i, String str, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.file_handle = "";
        } else {
            this.file_handle = str;
        }
    }

    public String toString() {
        return super.toString();
    }

    public AgeVerificationUploadResponseJson(String str) {
        C7384Etj.A0Y(str, 0);
        this.file_handle = str;
    }

    public /* synthetic */ AgeVerificationUploadResponseJson(String str, int i, C06H c06h) {
        this(C3cH.A0Z(i, str));
    }

    public AgeVerificationUploadResponseJson() {
        this("");
    }
}
