package com.facebook.aura.onboarding;

import X.AbstractC5321DgF;
import X.AnonymousClass001;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C07779iq;
import X.C2hx;
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
/* loaded from: classes3.dex */
public final class OnboardingCompleteRequestJson extends C06G {
    public final String assistant_name;
    public final String avatar_id;
    public final List<OnboardingTaskSelectionJson> task_selections;
    public final String timezone;
    public final String variant;
    public final String vibe;
    public static final Companion Companion = new Companion();
    public static final F0C<C9hr<Object>>[] $childSerializers = {null, AbstractC5321DgF.A02(C79.A01, OnboardingCompleteRequestJson$Companion$$childSerializers$1.INSTANCE), null, null, null, null};

    public final class Companion {
        public final C9hr<OnboardingCompleteRequestJson> serializer() {
            return OnboardingCompleteRequestJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static /* synthetic */ OnboardingCompleteRequestJson copy$default(OnboardingCompleteRequestJson onboardingCompleteRequestJson, String str, List list, String str2, String str3, String str4, String str5, int i, Object obj) {
        String str6 = str;
        List list2 = list;
        String str7 = str2;
        String str8 = str3;
        String str9 = str4;
        String str10 = str5;
        if ((i & 1) != 0) {
            str6 = onboardingCompleteRequestJson.variant;
        }
        if ((i & 2) != 0) {
            list2 = onboardingCompleteRequestJson.task_selections;
        }
        if ((i & 4) != 0) {
            str7 = onboardingCompleteRequestJson.timezone;
        }
        if ((i & 8) != 0) {
            str8 = onboardingCompleteRequestJson.assistant_name;
        }
        if ((i & 16) != 0) {
            str9 = onboardingCompleteRequestJson.vibe;
        }
        if ((i & 32) != 0) {
            str10 = onboardingCompleteRequestJson.avatar_id;
        }
        AnonymousClass005.A0x(str6, list2, str7);
        return new OnboardingCompleteRequestJson(str6, list2, str7, str8, str9, str10);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof OnboardingCompleteRequestJson) {
                OnboardingCompleteRequestJson onboardingCompleteRequestJson = (OnboardingCompleteRequestJson) obj;
                if (!C7384Etj.areEqual(this.variant, onboardingCompleteRequestJson.variant) || !C7384Etj.areEqual(this.task_selections, onboardingCompleteRequestJson.task_selections) || !C7384Etj.areEqual(this.timezone, onboardingCompleteRequestJson.timezone) || !C7384Etj.areEqual(this.assistant_name, onboardingCompleteRequestJson.assistant_name) || !C7384Etj.areEqual(this.vibe, onboardingCompleteRequestJson.vibe) || !C7384Etj.areEqual(this.avatar_id, onboardingCompleteRequestJson.avatar_id)) {
                }
            }
            return false;
        }
        return true;
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_onboarding_onboarding(OnboardingCompleteRequestJson onboardingCompleteRequestJson, C9j5 c9j5, C9iZ c9iZ) {
        F0C<C9hr<Object>>[] f0cArr = $childSerializers;
        c9j5.AAV(onboardingCompleteRequestJson.variant, c9iZ, 0);
        c9j5.AAQ(onboardingCompleteRequestJson.task_selections, C3cH.A15(f0cArr, 1), c9iZ, 1);
        c9j5.AAV(onboardingCompleteRequestJson.timezone, c9iZ, 2);
        boolean zAfR = c9j5.AfR();
        if (zAfR || onboardingCompleteRequestJson.assistant_name != null) {
            c9j5.AAP(onboardingCompleteRequestJson.assistant_name, C07779iq.A01, c9iZ, 3);
        }
        if (zAfR || onboardingCompleteRequestJson.vibe != null) {
            c9j5.AAP(onboardingCompleteRequestJson.vibe, C07779iq.A01, c9iZ, 4);
        }
        if (zAfR || onboardingCompleteRequestJson.avatar_id != null) {
            c9j5.AAP(onboardingCompleteRequestJson.avatar_id, C07779iq.A01, c9iZ, 5);
        }
    }

    public final String component1() {
        return this.variant;
    }

    public final List<OnboardingTaskSelectionJson> component2() {
        return this.task_selections;
    }

    public final String component3() {
        return this.timezone;
    }

    public final String component4() {
        return this.assistant_name;
    }

    public final String component5() {
        return this.vibe;
    }

    public final String component6() {
        return this.avatar_id;
    }

    public final String getAssistant_name() {
        return this.assistant_name;
    }

    public final String getAvatar_id() {
        return this.avatar_id;
    }

    public final List<OnboardingTaskSelectionJson> getTask_selections() {
        return this.task_selections;
    }

    public final String getTimezone() {
        return this.timezone;
    }

    public final String getVariant() {
        return this.variant;
    }

    public final String getVibe() {
        return this.vibe;
    }

    public int hashCode() {
        return ((((AnonymousClass005.A0I(this.timezone, AnonymousClass005.A0F(this.task_selections, AnonymousClass001.A0G(this.variant))) + AnonymousClass006.A0G(this.assistant_name)) * 31) + AnonymousClass006.A0G(this.vibe)) * 31) + AnonymousClass005.A0H(this.avatar_id);
    }

    public OnboardingCompleteRequestJson(String str, List<OnboardingTaskSelectionJson> list, String str2, String str3, String str4, String str5) {
        AnonymousClass005.A0x(str, list, str2);
        this.variant = str;
        this.task_selections = list;
        this.timezone = str2;
        this.assistant_name = str3;
        this.vibe = str4;
        this.avatar_id = str5;
    }

    public final OnboardingCompleteRequestJson copy(String str, List<OnboardingTaskSelectionJson> list, String str2, String str3, String str4, String str5) {
        AnonymousClass005.A0x(str, list, str2);
        return new OnboardingCompleteRequestJson(str, list, str2, str3, str4, str5);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ OnboardingCompleteRequestJson(String str, List list, String str2, String str3, String str4, String str5, int i, C06H c06h) {
        this(str, list, str2, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : str4, (i & 32) != 0 ? null : str5);
    }

    public /* synthetic */ OnboardingCompleteRequestJson(int i, String str, List list, String str2, String str3, String str4, String str5, C2hx c2hx) {
        if (7 != (i & 7)) {
            C9iI.A00(OnboardingCompleteRequestJson$$serializer.descriptor, i, 7);
            throw F60.createAndThrow();
        }
        this.variant = str;
        this.task_selections = list;
        this.timezone = str2;
        if ((i & 8) == 0) {
            this.assistant_name = null;
        } else {
            this.assistant_name = str3;
        }
        if ((i & 16) == 0) {
            this.vibe = null;
        } else {
            this.vibe = str4;
        }
        if ((i & 32) == 0) {
            this.avatar_id = null;
        } else {
            this.avatar_id = str5;
        }
    }
}
