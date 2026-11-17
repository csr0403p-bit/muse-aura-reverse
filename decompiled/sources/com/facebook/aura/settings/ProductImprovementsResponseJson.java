package com.facebook.aura.settings;

import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C0KA;
import X.C2hx;
import X.C7384Etj;
import X.C9hr;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes.dex */
public final class ProductImprovementsResponseJson extends C06G {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion();
    public final boolean training_enabled;
    public final TrainingObjectionJson training_objection;

    public final class Companion {
        public final C9hr<ProductImprovementsResponseJson> serializer() {
            return ProductImprovementsResponseJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_settings_settings(com.facebook.aura.settings.ProductImprovementsResponseJson r4, X.C9j5 r5, X.C9iZ r6) {
        /*
            r3 = 0
            boolean r1 = r5.AfR()
            r2 = 1
            if (r1 != 0) goto Lc
            boolean r0 = r4.training_enabled
            if (r0 == r2) goto L1b
        Lc:
            boolean r0 = r4.training_enabled
            r5.AA7(r6, r3, r0)
            if (r1 == 0) goto L1b
        L13:
            com.facebook.aura.settings.TrainingObjectionJson$$serializer r1 = com.facebook.aura.settings.TrainingObjectionJson$$serializer.INSTANCE
            com.facebook.aura.settings.TrainingObjectionJson r0 = r4.training_objection
            r5.AAP(r0, r1, r6, r2)
        L1a:
            return
        L1b:
            com.facebook.aura.settings.TrainingObjectionJson r0 = r4.training_objection
            if (r0 == 0) goto L1a
            goto L13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.settings.ProductImprovementsResponseJson.write$Self$fbandroid_express_aura_java_com_facebook_aura_settings_settings(com.facebook.aura.settings.ProductImprovementsResponseJson, X.9j5, X.9iZ):void");
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ProductImprovementsResponseJson) {
                ProductImprovementsResponseJson productImprovementsResponseJson = (ProductImprovementsResponseJson) obj;
                if (this.training_enabled != productImprovementsResponseJson.training_enabled || !C7384Etj.areEqual(this.training_objection, productImprovementsResponseJson.training_objection)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ ProductImprovementsResponseJson copy$default(ProductImprovementsResponseJson productImprovementsResponseJson, boolean z, TrainingObjectionJson trainingObjectionJson, int i, Object obj) {
        if ((i & 1) != 0) {
            z = productImprovementsResponseJson.training_enabled;
        }
        if ((i & 2) != 0) {
            trainingObjectionJson = productImprovementsResponseJson.training_objection;
        }
        return new ProductImprovementsResponseJson(z, trainingObjectionJson);
    }

    public final boolean component1() {
        return this.training_enabled;
    }

    public final TrainingObjectionJson component2() {
        return this.training_objection;
    }

    public final ProductImprovementsResponseJson copy(boolean z, TrainingObjectionJson trainingObjectionJson) {
        return new ProductImprovementsResponseJson(z, trainingObjectionJson);
    }

    public final boolean getTraining_enabled() {
        return this.training_enabled;
    }

    public final TrainingObjectionJson getTraining_objection() {
        return this.training_objection;
    }

    public int hashCode() {
        return C0KA.A02(this.training_enabled) + AnonymousClass006.A0D(this.training_objection);
    }

    public final HatchAiTrainingSetting toDomain() {
        boolean z = this.training_enabled;
        TrainingObjectionJson trainingObjectionJson = this.training_objection;
        return new HatchAiTrainingSetting(z, HatchAiTrainingApiJsonKt.OBJECTION_FILED_STATUS.equals(trainingObjectionJson != null ? trainingObjectionJson.status : null));
    }

    public ProductImprovementsResponseJson(boolean z, TrainingObjectionJson trainingObjectionJson) {
        this.training_enabled = z;
        this.training_objection = trainingObjectionJson;
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ ProductImprovementsResponseJson(boolean z, TrainingObjectionJson trainingObjectionJson, int i, C06H c06h) {
        this((i & 1) != 0 ? true : z, (i & 2) != 0 ? null : trainingObjectionJson);
    }

    public /* synthetic */ ProductImprovementsResponseJson(int i, boolean z, TrainingObjectionJson trainingObjectionJson, C2hx c2hx) {
        this.training_enabled = (i & 1) == 0 ? true : z;
        if ((i & 2) == 0) {
            this.training_objection = null;
        } else {
            this.training_objection = trainingObjectionJson;
        }
    }

    public ProductImprovementsResponseJson() {
        this(true, null);
    }
}
