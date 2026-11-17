package com.facebook.aura.onboarding;

import X.AbstractC0878AGe;
import X.AbstractC5321DgF;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.AnonymousClass007;
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
import java.util.Iterator;
import java.util.List;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes3.dex */
public final class OnboardingIdentityPayloadJson extends C06G {
    public static final F0C<C9hr<Object>>[] $childSerializers;
    public static final Companion Companion = new Companion();
    public final List<String> assistant_names;
    public final List<OnboardingAvatarOptionJson> avatars;
    public final List<String> vibes;

    public final class Companion {
        public final C9hr<OnboardingIdentityPayloadJson> serializer() {
            return OnboardingIdentityPayloadJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof OnboardingIdentityPayloadJson) {
                OnboardingIdentityPayloadJson onboardingIdentityPayloadJson = (OnboardingIdentityPayloadJson) obj;
                if (!C7384Etj.areEqual(this.assistant_names, onboardingIdentityPayloadJson.assistant_names) || !C7384Etj.areEqual(this.vibes, onboardingIdentityPayloadJson.vibes) || !C7384Etj.areEqual(this.avatars, onboardingIdentityPayloadJson.avatars)) {
                }
            }
            return false;
        }
        return true;
    }

    static {
        Integer num = C79.A01;
        $childSerializers = C3cG.A1V(num, AbstractC5321DgF.A02(num, OnboardingIdentityPayloadJson$Companion$$childSerializers$1.INSTANCE), AbstractC5321DgF.A02(num, OnboardingIdentityPayloadJson$Companion$$childSerializers$2.INSTANCE), OnboardingIdentityPayloadJson$Companion$$childSerializers$3.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ OnboardingIdentityPayloadJson copy$default(OnboardingIdentityPayloadJson onboardingIdentityPayloadJson, List list, List list2, List list3, int i, Object obj) {
        if ((i & 1) != 0) {
            list = onboardingIdentityPayloadJson.assistant_names;
        }
        if ((i & 2) != 0) {
            list2 = onboardingIdentityPayloadJson.vibes;
        }
        if ((i & 4) != 0) {
            list3 = onboardingIdentityPayloadJson.avatars;
        }
        return onboardingIdentityPayloadJson.copy(list, list2, list3);
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_onboarding_onboarding(OnboardingIdentityPayloadJson onboardingIdentityPayloadJson, C9j5 c9j5, C9iZ c9iZ) {
        F0C<C9hr<Object>>[] f0cArr = $childSerializers;
        boolean zAfR = c9j5.AfR();
        if (zAfR || !C3cG.A1L(onboardingIdentityPayloadJson.assistant_names)) {
            c9j5.AAQ(onboardingIdentityPayloadJson.assistant_names, C3cH.A15(f0cArr, 0), c9iZ, 0);
        }
        if (zAfR || !C3cG.A1L(onboardingIdentityPayloadJson.vibes)) {
            c9j5.AAQ(onboardingIdentityPayloadJson.vibes, C3cH.A15(f0cArr, 1), c9iZ, 1);
        }
        if (zAfR || !C3cG.A1L(onboardingIdentityPayloadJson.avatars)) {
            c9j5.AAQ(onboardingIdentityPayloadJson.avatars, C3cH.A15(f0cArr, 2), c9iZ, 2);
        }
    }

    public final List<String> component1() {
        return this.assistant_names;
    }

    public final List<String> component2() {
        return this.vibes;
    }

    public final List<OnboardingAvatarOptionJson> component3() {
        return this.avatars;
    }

    public final List<String> getAssistant_names() {
        return this.assistant_names;
    }

    public final List<OnboardingAvatarOptionJson> getAvatars() {
        return this.avatars;
    }

    public final List<String> getVibes() {
        return this.vibes;
    }

    public int hashCode() {
        return AnonymousClass005.A0G(this.avatars, AnonymousClass005.A0F(this.vibes, AnonymousClass005.A0E(this.assistant_names)));
    }

    public final OnboardingIdentity toDomain() {
        String str;
        List<String> list = this.assistant_names;
        ArrayList arrayListA0h = C3cG.A0h();
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            AnonymousClass007.A19(arrayListA0h, it);
        }
        List<String> list2 = this.vibes;
        ArrayList<String> arrayListA0h2 = C3cG.A0h();
        Iterator<String> it2 = list2.iterator();
        while (it2.hasNext()) {
            AnonymousClass007.A19(arrayListA0h2, it2);
        }
        ArrayList arrayListA0i = AnonymousClass003.A0i(arrayListA0h2);
        for (String str2 : arrayListA0h2) {
            arrayListA0i.add(new OnboardingPersonality(str2, str2, false));
        }
        List<OnboardingAvatarOptionJson> list3 = this.avatars;
        ArrayList arrayListA0h3 = C3cG.A0h();
        Iterator<OnboardingAvatarOptionJson> it3 = list3.iterator();
        while (it3.hasNext()) {
            OnboardingAvatarOption domain = it3.next().toDomain();
            if (domain != null) {
                arrayListA0h3.add(domain);
            }
        }
        if (arrayListA0i.isEmpty() && arrayListA0h.isEmpty() && arrayListA0h3.isEmpty()) {
            return null;
        }
        String str3 = (String) AbstractC0878AGe.A0G(arrayListA0h);
        if (str3 == null) {
            str3 = "";
        }
        OnboardingPersonality onboardingPersonality = (OnboardingPersonality) AbstractC0878AGe.A0G(arrayListA0i);
        if (onboardingPersonality == null || (str = onboardingPersonality.id) == null) {
            str = "";
        }
        return new OnboardingIdentity(str3, arrayListA0h, arrayListA0i, str, arrayListA0h3);
    }

    public OnboardingIdentityPayloadJson(List<String> list, List<String> list2, List<OnboardingAvatarOptionJson> list3) {
        AnonymousClass005.A0x(list, list2, list3);
        this.assistant_names = list;
        this.vibes = list2;
        this.avatars = list3;
    }

    public final OnboardingIdentityPayloadJson copy(List<String> list, List<String> list2, List<OnboardingAvatarOptionJson> list3) {
        AnonymousClass005.A0x(list, list2, list3);
        return new OnboardingIdentityPayloadJson(list, list2, list3);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ OnboardingIdentityPayloadJson(int i, List list, List list2, List list3, C2hx c2hx) {
        this.assistant_names = (i & 1) == 0 ? C0881AGi.A00 : list;
        if ((i & 2) == 0) {
            this.vibes = C0881AGi.A00;
        } else {
            this.vibes = list2;
        }
        if ((i & 4) == 0) {
            this.avatars = C0881AGi.A00;
        } else {
            this.avatars = list3;
        }
    }

    public /* synthetic */ OnboardingIdentityPayloadJson(List list, List list2, List list3, int i, C06H c06h) {
        this(C3cI.A10(list, i), C3cI.A11(list2, i), C3cI.A12(list3, i));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public OnboardingIdentityPayloadJson() {
        C0881AGi c0881AGi = C0881AGi.A00;
        this(c0881AGi, c0881AGi, c0881AGi);
    }
}
