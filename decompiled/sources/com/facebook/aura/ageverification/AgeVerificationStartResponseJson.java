package com.facebook.aura.ageverification;

import X.AnonymousClass001;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.C06G;
import X.C06H;
import X.C0881AGi;
import X.C2hx;
import X.C3cG;
import X.C3cH;
import X.C3cI;
import X.C7384Etj;
import X.C79;
import X.C9hr;
import X.C9iZ;
import X.C9j5;
import X.F0C;
import java.util.List;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes2.dex */
public final class AgeVerificationStartResponseJson extends C06G {
    public static final int $stable = 8;
    public final String attempt_id;
    public final List<AgeVerificationUploadJson> uploads;
    public static final Companion Companion = new Companion();
    public static final F0C<C9hr<Object>>[] $childSerializers = C3cG.A1W(C79.A01, null, AgeVerificationStartResponseJson$Companion$$childSerializers$1.INSTANCE);

    public final class Companion {
        public final C9hr<AgeVerificationStartResponseJson> serializer() {
            return AgeVerificationStartResponseJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AgeVerificationStartResponseJson) {
                AgeVerificationStartResponseJson ageVerificationStartResponseJson = (AgeVerificationStartResponseJson) obj;
                if (!C7384Etj.areEqual(this.attempt_id, ageVerificationStartResponseJson.attempt_id) || !C7384Etj.areEqual(this.uploads, ageVerificationStartResponseJson.uploads)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ AgeVerificationStartResponseJson copy$default(AgeVerificationStartResponseJson ageVerificationStartResponseJson, String str, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = ageVerificationStartResponseJson.attempt_id;
        }
        if ((i & 2) != 0) {
            list = ageVerificationStartResponseJson.uploads;
        }
        AnonymousClass003.A0u(str, list);
        return new AgeVerificationStartResponseJson(str, list);
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_ageverification_impl_impl(AgeVerificationStartResponseJson ageVerificationStartResponseJson, C9j5 c9j5, C9iZ c9iZ) {
        F0C<C9hr<Object>>[] f0cArr = $childSerializers;
        boolean zAfR = c9j5.AfR();
        if (zAfR || !C3cH.A1Q(ageVerificationStartResponseJson.attempt_id)) {
            c9j5.AAV(ageVerificationStartResponseJson.attempt_id, c9iZ, 0);
        }
        if (zAfR || !C3cG.A1L(ageVerificationStartResponseJson.uploads)) {
            c9j5.AAQ(ageVerificationStartResponseJson.uploads, C3cH.A15(f0cArr, 1), c9iZ, 1);
        }
    }

    public final String component1() {
        return this.attempt_id;
    }

    public final List<AgeVerificationUploadJson> component2() {
        return this.uploads;
    }

    public final String getAttempt_id() {
        return this.attempt_id;
    }

    public final List<AgeVerificationUploadJson> getUploads() {
        return this.uploads;
    }

    public int hashCode() {
        return AnonymousClass005.A0G(this.uploads, AnonymousClass001.A0G(this.attempt_id));
    }

    public AgeVerificationStartResponseJson(String str, List<AgeVerificationUploadJson> list) {
        AnonymousClass003.A0u(str, list);
        this.attempt_id = str;
        this.uploads = list;
    }

    public final AgeVerificationStartResponseJson copy(String str, List<AgeVerificationUploadJson> list) {
        AnonymousClass003.A0u(str, list);
        return new AgeVerificationStartResponseJson(str, list);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ AgeVerificationStartResponseJson(int i, String str, List list, C2hx c2hx) {
        this.attempt_id = C3cG.A0Z(i, str);
        if ((i & 2) == 0) {
            this.uploads = C0881AGi.A00;
        } else {
            this.uploads = list;
        }
    }

    public /* synthetic */ AgeVerificationStartResponseJson(String str, List list, int i, C06H c06h) {
        this(C3cH.A0Z(i, str), C3cI.A11(list, i));
    }

    public AgeVerificationStartResponseJson() {
        this("", C0881AGi.A00);
    }
}
