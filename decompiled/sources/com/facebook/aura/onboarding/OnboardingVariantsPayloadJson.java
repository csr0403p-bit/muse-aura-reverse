package com.facebook.aura.onboarding;

import X.AnonymousClass006;
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
import java.util.ArrayList;
import java.util.List;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes2.dex */
public final class OnboardingVariantsPayloadJson extends C06G {
    public final List<String> variants;
    public static final Companion Companion = new Companion();
    public static final F0C<C9hr<Object>>[] $childSerializers = C06G.A0x(C79.A01, OnboardingVariantsPayloadJson$Companion$$childSerializers$1.INSTANCE);

    public final class Companion {
        public final C9hr<OnboardingVariantsPayloadJson> serializer() {
            return OnboardingVariantsPayloadJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public final OnboardingVariantsPayloadJson copy(List<String> list) {
        C7384Etj.A0Y(list, 0);
        return new OnboardingVariantsPayloadJson(list);
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof OnboardingVariantsPayloadJson) && C7384Etj.areEqual(this.variants, ((OnboardingVariantsPayloadJson) obj).variants));
    }

    public static /* synthetic */ OnboardingVariantsPayloadJson copy$default(OnboardingVariantsPayloadJson onboardingVariantsPayloadJson, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = onboardingVariantsPayloadJson.variants;
        }
        C7384Etj.A0Y(list, 0);
        return new OnboardingVariantsPayloadJson(list);
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_onboarding_onboarding(OnboardingVariantsPayloadJson onboardingVariantsPayloadJson, C9j5 c9j5, C9iZ c9iZ) {
        F0C<C9hr<Object>>[] f0cArr = $childSerializers;
        if (c9j5.AfR() || !C3cG.A1L(onboardingVariantsPayloadJson.variants)) {
            c9j5.AAQ(onboardingVariantsPayloadJson.variants, C3cH.A15(f0cArr, 0), c9iZ, 0);
        }
    }

    public final List<String> component1() {
        return this.variants;
    }

    public final List<String> getVariants() {
        return this.variants;
    }

    public int hashCode() {
        return this.variants.hashCode();
    }

    public final List<String> toDomain() {
        List<String> list = this.variants;
        ArrayList arrayListA0h = C3cG.A0h();
        for (String str : list) {
            AnonymousClass006.A1F(str, str, arrayListA0h);
        }
        return arrayListA0h;
    }

    public /* synthetic */ OnboardingVariantsPayloadJson(int i, List list, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.variants = C0881AGi.A00;
        } else {
            this.variants = list;
        }
    }

    public String toString() {
        return super.toString();
    }

    public OnboardingVariantsPayloadJson(List<String> list) {
        C7384Etj.A0Y(list, 0);
        this.variants = list;
    }

    public /* synthetic */ OnboardingVariantsPayloadJson(List list, int i, C06H c06h) {
        this(C3cI.A10(list, i));
    }

    public OnboardingVariantsPayloadJson() {
        this(C0881AGi.A00);
    }
}
