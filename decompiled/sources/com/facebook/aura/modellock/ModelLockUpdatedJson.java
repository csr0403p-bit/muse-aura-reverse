package com.facebook.aura.modellock;

import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C07779iq;
import X.C0KA;
import X.C2hx;
import X.C7384Etj;
import X.C9hr;
import X.C9iI;
import X.C9iZ;
import X.C9j1;
import X.C9j5;
import X.F60;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes3.dex */
public final class ModelLockUpdatedJson extends C06G {
    public static final Companion Companion = new Companion();
    public final String appeal_status;
    public final boolean locked;
    public final Long locked_at_ms;

    public final class Companion {
        public final C9hr<ModelLockUpdatedJson> serializer() {
            return ModelLockUpdatedJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_modellock_modellock(ModelLockUpdatedJson modelLockUpdatedJson, C9j5 c9j5, C9iZ c9iZ) {
        c9j5.AA7(c9iZ, 0, modelLockUpdatedJson.locked);
        boolean zAfR = c9j5.AfR();
        if (zAfR || modelLockUpdatedJson.locked_at_ms != null) {
            c9j5.AAP(modelLockUpdatedJson.locked_at_ms, C9j1.A00, c9iZ, 1);
        }
        if (zAfR || modelLockUpdatedJson.appeal_status != null) {
            c9j5.AAP(modelLockUpdatedJson.appeal_status, C07779iq.A01, c9iZ, 2);
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ModelLockUpdatedJson) {
                ModelLockUpdatedJson modelLockUpdatedJson = (ModelLockUpdatedJson) obj;
                if (this.locked != modelLockUpdatedJson.locked || !C7384Etj.areEqual(this.locked_at_ms, modelLockUpdatedJson.locked_at_ms) || !C7384Etj.areEqual(this.appeal_status, modelLockUpdatedJson.appeal_status)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ ModelLockUpdatedJson copy$default(ModelLockUpdatedJson modelLockUpdatedJson, boolean z, Long l, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            z = modelLockUpdatedJson.locked;
        }
        if ((i & 2) != 0) {
            l = modelLockUpdatedJson.locked_at_ms;
        }
        if ((i & 4) != 0) {
            str = modelLockUpdatedJson.appeal_status;
        }
        return new ModelLockUpdatedJson(z, l, str);
    }

    public final boolean component1() {
        return this.locked;
    }

    public final Long component2() {
        return this.locked_at_ms;
    }

    public final String component3() {
        return this.appeal_status;
    }

    public final ModelLockUpdatedJson copy(boolean z, Long l, String str) {
        return new ModelLockUpdatedJson(z, l, str);
    }

    public final String getAppeal_status() {
        return this.appeal_status;
    }

    public final boolean getLocked() {
        return this.locked;
    }

    public final Long getLocked_at_ms() {
        return this.locked_at_ms;
    }

    public int hashCode() {
        return ((C0KA.A02(this.locked) + AnonymousClass006.A0D(this.locked_at_ms)) * 31) + AnonymousClass005.A0H(this.appeal_status);
    }

    public final ModelLockAppealStage polledAppealStage() {
        String str = this.appeal_status;
        return "under_review".equals(str) ? ModelLockAppealStage.IN_REVIEW : "denied".equals(str) ? ModelLockAppealStage.DENIED : ModelLockAppealStage.NOT_SUBMITTED;
    }

    public final boolean restoresAccess() {
        return !this.locked && "granted".equals(this.appeal_status);
    }

    public ModelLockUpdatedJson(boolean z, Long l, String str) {
        this.locked = z;
        this.locked_at_ms = l;
        this.appeal_status = str;
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ ModelLockUpdatedJson(int i, boolean z, Long l, String str, C2hx c2hx) {
        if (1 != (i & 1)) {
            C9iI.A00(ModelLockUpdatedJson$$serializer.descriptor, i, 1);
            throw F60.createAndThrow();
        }
        this.locked = z;
        if ((i & 2) == 0) {
            this.locked_at_ms = null;
        } else {
            this.locked_at_ms = l;
        }
        if ((i & 4) == 0) {
            this.appeal_status = null;
        } else {
            this.appeal_status = str;
        }
    }

    public /* synthetic */ ModelLockUpdatedJson(boolean z, Long l, String str, int i, C06H c06h) {
        this(z, (i & 2) != 0 ? null : l, (i & 4) != 0 ? null : str);
    }
}
