package com.facebook.aura.ageverification;

import X.AnonymousClass001;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.C06G;
import X.C06H;
import X.C2hx;
import X.C3cG;
import X.C3cH;
import X.C7384Etj;
import X.C79;
import X.C9hr;
import X.C9iI;
import X.C9iZ;
import X.C9j5;
import X.F0C;
import X.F60;
import java.util.List;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes2.dex */
public final class AgeVerificationSubmitRequestJson extends C06G {
    public static final int $stable = 8;
    public final String attempt_id;
    public final List<String> file_handles;
    public static final Companion Companion = new Companion();
    public static final F0C<C9hr<Object>>[] $childSerializers = C3cG.A1W(C79.A01, null, AgeVerificationSubmitRequestJson$Companion$$childSerializers$1.INSTANCE);

    public final class Companion {
        public final C9hr<AgeVerificationSubmitRequestJson> serializer() {
            return AgeVerificationSubmitRequestJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AgeVerificationSubmitRequestJson) {
                AgeVerificationSubmitRequestJson ageVerificationSubmitRequestJson = (AgeVerificationSubmitRequestJson) obj;
                if (!C7384Etj.areEqual(this.attempt_id, ageVerificationSubmitRequestJson.attempt_id) || !C7384Etj.areEqual(this.file_handles, ageVerificationSubmitRequestJson.file_handles)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ AgeVerificationSubmitRequestJson copy$default(AgeVerificationSubmitRequestJson ageVerificationSubmitRequestJson, String str, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = ageVerificationSubmitRequestJson.attempt_id;
        }
        if ((i & 2) != 0) {
            list = ageVerificationSubmitRequestJson.file_handles;
        }
        AnonymousClass003.A0u(str, list);
        return new AgeVerificationSubmitRequestJson(str, list);
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_ageverification_impl_impl(AgeVerificationSubmitRequestJson ageVerificationSubmitRequestJson, C9j5 c9j5, C9iZ c9iZ) {
        F0C<C9hr<Object>>[] f0cArr = $childSerializers;
        c9j5.AAV(ageVerificationSubmitRequestJson.attempt_id, c9iZ, 0);
        c9j5.AAQ(ageVerificationSubmitRequestJson.file_handles, C3cH.A15(f0cArr, 1), c9iZ, 1);
    }

    public final String component1() {
        return this.attempt_id;
    }

    public final List<String> component2() {
        return this.file_handles;
    }

    public final String getAttempt_id() {
        return this.attempt_id;
    }

    public final List<String> getFile_handles() {
        return this.file_handles;
    }

    public int hashCode() {
        return AnonymousClass005.A0G(this.file_handles, AnonymousClass001.A0G(this.attempt_id));
    }

    public AgeVerificationSubmitRequestJson(String str, List<String> list) {
        AnonymousClass003.A0u(str, list);
        this.attempt_id = str;
        this.file_handles = list;
    }

    public final AgeVerificationSubmitRequestJson copy(String str, List<String> list) {
        AnonymousClass003.A0u(str, list);
        return new AgeVerificationSubmitRequestJson(str, list);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ AgeVerificationSubmitRequestJson(int i, String str, List list, C2hx c2hx) {
        if (3 != (i & 3)) {
            C9iI.A00(AgeVerificationSubmitRequestJson$$serializer.descriptor, i, 3);
            throw F60.createAndThrow();
        }
        this.attempt_id = str;
        this.file_handles = list;
    }
}
