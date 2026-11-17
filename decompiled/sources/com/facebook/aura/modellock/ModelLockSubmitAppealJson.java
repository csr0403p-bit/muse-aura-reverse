package com.facebook.aura.modellock;

import X.AnonymousClass001;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C07779iq;
import X.C2hx;
import X.C7384Etj;
import X.C8j4;
import X.C9hr;
import X.C9iI;
import X.C9iZ;
import X.C9j5;
import X.F60;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes4.dex */
public final class ModelLockSubmitAppealJson extends C06G {
    public static final Companion Companion = new Companion();
    public final String additional_info;
    public final String sha256;

    public final class Companion {
        public final C9hr<ModelLockSubmitAppealJson> serializer() {
            return ModelLockSubmitAppealJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public ModelLockSubmitAppealJson(String str, String str2) {
        C7384Etj.A0Y(str, 0);
        this.sha256 = str;
        this.additional_info = str2;
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_modellock_modellock(ModelLockSubmitAppealJson modelLockSubmitAppealJson, C9j5 c9j5, C9iZ c9iZ) {
        c9j5.AAV(modelLockSubmitAppealJson.sha256, c9iZ, 0);
        if (c9j5.AfR() || modelLockSubmitAppealJson.additional_info != null) {
            c9j5.AAP(modelLockSubmitAppealJson.additional_info, C07779iq.A01, c9iZ, 1);
        }
    }

    public final ModelLockSubmitAppealJson copy(String str, String str2) {
        C7384Etj.A0Y(str, 0);
        return new ModelLockSubmitAppealJson(str, str2);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ModelLockSubmitAppealJson) {
                ModelLockSubmitAppealJson modelLockSubmitAppealJson = (ModelLockSubmitAppealJson) obj;
                if (!C7384Etj.areEqual(this.sha256, modelLockSubmitAppealJson.sha256) || !C7384Etj.areEqual(this.additional_info, modelLockSubmitAppealJson.additional_info)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ ModelLockSubmitAppealJson copy$default(ModelLockSubmitAppealJson modelLockSubmitAppealJson, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = modelLockSubmitAppealJson.sha256;
        }
        if ((i & 2) != 0) {
            str2 = modelLockSubmitAppealJson.additional_info;
        }
        C7384Etj.A0Y(str, 0);
        return new ModelLockSubmitAppealJson(str, str2);
    }

    public final String component1() {
        return this.sha256;
    }

    public final String component2() {
        return this.additional_info;
    }

    public final String getAdditional_info() {
        return this.additional_info;
    }

    public final String getSha256() {
        return this.sha256;
    }

    public int hashCode() {
        return AnonymousClass001.A0G(this.sha256) + AnonymousClass006.A0G(this.additional_info);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ ModelLockSubmitAppealJson(int i, String str, String str2, C2hx c2hx) {
        if (1 != (i & 1)) {
            C9iI.A00(ModelLockSubmitAppealJson$$serializer.descriptor, i, 1);
            throw F60.createAndThrow();
        }
        this.sha256 = str;
        this.additional_info = C8j4.A0t(i, str2);
    }

    public /* synthetic */ ModelLockSubmitAppealJson(String str, String str2, int i, C06H c06h) {
        this(str, AnonymousClass006.A0s(i, str2));
    }
}
