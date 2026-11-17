package com.facebook.aura.graduation.repo;

import X.AnonymousClass001;
import X.AnonymousClass003;
import X.C06G;
import X.C06H;
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
public final class GraduationStoreRequestJson extends C06G {
    public static final Companion Companion = new Companion();
    public final String experience_id;
    public final String vm_id;

    public final class Companion {
        public final C9hr<GraduationStoreRequestJson> serializer() {
            return GraduationStoreRequestJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_graduation_repo_repo(GraduationStoreRequestJson graduationStoreRequestJson, C9j5 c9j5, C9iZ c9iZ) {
        c9j5.AAV(graduationStoreRequestJson.vm_id, c9iZ, 0);
        c9j5.AAV(graduationStoreRequestJson.experience_id, c9iZ, 1);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof GraduationStoreRequestJson) {
                GraduationStoreRequestJson graduationStoreRequestJson = (GraduationStoreRequestJson) obj;
                if (!C7384Etj.areEqual(this.vm_id, graduationStoreRequestJson.vm_id) || !C7384Etj.areEqual(this.experience_id, graduationStoreRequestJson.experience_id)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ GraduationStoreRequestJson copy$default(GraduationStoreRequestJson graduationStoreRequestJson, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = graduationStoreRequestJson.vm_id;
        }
        if ((i & 2) != 0) {
            str2 = graduationStoreRequestJson.experience_id;
        }
        AnonymousClass003.A0u(str, str2);
        return new GraduationStoreRequestJson(str, str2);
    }

    public final String component1() {
        return this.vm_id;
    }

    public final String component2() {
        return this.experience_id;
    }

    public final String getExperience_id() {
        return this.experience_id;
    }

    public final String getVm_id() {
        return this.vm_id;
    }

    public int hashCode() {
        return AnonymousClass001.A0H(this.experience_id, AnonymousClass001.A0G(this.vm_id));
    }

    public GraduationStoreRequestJson(String str, String str2) {
        AnonymousClass003.A0u(str, str2);
        this.vm_id = str;
        this.experience_id = str2;
    }

    public final GraduationStoreRequestJson copy(String str, String str2) {
        AnonymousClass003.A0u(str, str2);
        return new GraduationStoreRequestJson(str, str2);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ GraduationStoreRequestJson(int i, String str, String str2, C2hx c2hx) {
        if (3 != (i & 3)) {
            C9iI.A00(GraduationStoreRequestJson$$serializer.descriptor, i, 3);
            throw F60.createAndThrow();
        }
        this.vm_id = str;
        this.experience_id = str2;
    }
}
