package com.facebook.aura.onboarding;

import X.AnonymousClass001;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C07779iq;
import X.C2hx;
import X.C7384Etj;
import X.C9hr;
import X.C9iZ;
import X.C9j5;
import com.facebook.aura.onboarding.OnboardingTask;
import com.facebook.aura.partners.accountlinking.nativeauthlogging.MAHatchNativeAuthAppStartLoggerKt;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes3.dex */
public final class OnboardingTaskJson extends C06G {
    public static final Companion Companion = new Companion();
    public final String connector_id;
    public final String from_card;
    public final String icon_uri;
    public final String id;
    public final String summary;
    public final String title;

    public final class Companion {
        public final C9hr<OnboardingTaskJson> serializer() {
            return OnboardingTaskJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_onboarding_onboarding(OnboardingTaskJson onboardingTaskJson, C9j5 c9j5, C9iZ c9iZ) {
        boolean zAfR = c9j5.AfR();
        if (zAfR || !"".equals(onboardingTaskJson.id)) {
            c9j5.AAV(onboardingTaskJson.id, c9iZ, 0);
        }
        if (zAfR || !"".equals(onboardingTaskJson.title)) {
            c9j5.AAV(onboardingTaskJson.title, c9iZ, 1);
        }
        if (zAfR || !"".equals(onboardingTaskJson.summary)) {
            c9j5.AAV(onboardingTaskJson.summary, c9iZ, 2);
        }
        if (zAfR || !"".equals(onboardingTaskJson.icon_uri)) {
            c9j5.AAV(onboardingTaskJson.icon_uri, c9iZ, 3);
        }
        if (zAfR || !"".equals(onboardingTaskJson.connector_id)) {
            c9j5.AAV(onboardingTaskJson.connector_id, c9iZ, 4);
        }
        if (zAfR || onboardingTaskJson.from_card != null) {
            c9j5.AAP(onboardingTaskJson.from_card, C07779iq.A01, c9iZ, 5);
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof OnboardingTaskJson) {
                OnboardingTaskJson onboardingTaskJson = (OnboardingTaskJson) obj;
                if (!C7384Etj.areEqual(this.id, onboardingTaskJson.id) || !C7384Etj.areEqual(this.title, onboardingTaskJson.title) || !C7384Etj.areEqual(this.summary, onboardingTaskJson.summary) || !C7384Etj.areEqual(this.icon_uri, onboardingTaskJson.icon_uri) || !C7384Etj.areEqual(this.connector_id, onboardingTaskJson.connector_id) || !C7384Etj.areEqual(this.from_card, onboardingTaskJson.from_card)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ OnboardingTaskJson copy$default(OnboardingTaskJson onboardingTaskJson, String str, String str2, String str3, String str4, String str5, String str6, int i, Object obj) {
        if ((i & 1) != 0) {
            str = onboardingTaskJson.id;
        }
        if ((i & 2) != 0) {
            str2 = onboardingTaskJson.title;
        }
        if ((i & 4) != 0) {
            str3 = onboardingTaskJson.summary;
        }
        if ((i & 8) != 0) {
            str4 = onboardingTaskJson.icon_uri;
        }
        if ((i & 16) != 0) {
            str5 = onboardingTaskJson.connector_id;
        }
        if ((i & 32) != 0) {
            str6 = onboardingTaskJson.from_card;
        }
        return onboardingTaskJson.copy(str, str2, str3, str4, str5, str6);
    }

    public final String component1() {
        return this.id;
    }

    public final String component2() {
        return this.title;
    }

    public final String component3() {
        return this.summary;
    }

    public final String component4() {
        return this.icon_uri;
    }

    public final String component5() {
        return this.connector_id;
    }

    public final String component6() {
        return this.from_card;
    }

    public final String getConnector_id() {
        return this.connector_id;
    }

    public final String getFrom_card() {
        return this.from_card;
    }

    public final String getIcon_uri() {
        return this.icon_uri;
    }

    public final String getId() {
        return this.id;
    }

    public final String getSummary() {
        return this.summary;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return AnonymousClass005.A0I(this.connector_id, AnonymousClass005.A0I(this.icon_uri, AnonymousClass005.A0I(this.summary, AnonymousClass005.A0I(this.title, AnonymousClass001.A0G(this.id))))) + AnonymousClass006.A0G(this.from_card);
    }

    public final OnboardingTask toDomain() {
        String str = this.id;
        OnboardingTask.CardSource cardSource = null;
        if (str.length() != 0) {
            String str2 = this.title;
            if (str2.length() != 0) {
                String str3 = this.summary;
                String str4 = this.icon_uri;
                String str5 = null;
                if (str4.length() > 0) {
                    str5 = str4;
                }
                String str6 = this.connector_id;
                String str7 = null;
                if (str6.length() > 0) {
                    str7 = str6;
                }
                String str8 = this.from_card;
                if (MAHatchNativeAuthAppStartLoggerKt.SOURCE_APP_FACEBOOK.equals(str8)) {
                    cardSource = OnboardingTask.CardSource.FACEBOOK;
                } else if (MAHatchNativeAuthAppStartLoggerKt.SOURCE_APP_INSTAGRAM.equals(str8)) {
                    cardSource = OnboardingTask.CardSource.INSTAGRAM;
                }
                return new OnboardingTask(str, str2, str3, str5, str7, cardSource);
            }
        }
        return null;
    }

    public OnboardingTaskJson(String str, String str2, String str3, String str4, String str5, String str6) {
        AnonymousClass005.A17(str, str2, str3, str4, str5);
        this.id = str;
        this.title = str2;
        this.summary = str3;
        this.icon_uri = str4;
        this.connector_id = str5;
        this.from_card = str6;
    }

    public final OnboardingTaskJson copy(String str, String str2, String str3, String str4, String str5, String str6) {
        AnonymousClass005.A17(str, str2, str3, str4, str5);
        return new OnboardingTaskJson(str, str2, str3, str4, str5, str6);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ OnboardingTaskJson(String str, String str2, String str3, String str4, String str5, String str6, int i, C06H c06h) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? null : str6);
    }

    public /* synthetic */ OnboardingTaskJson(int i, String str, String str2, String str3, String str4, String str5, String str6, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.id = "";
        } else {
            this.id = str;
        }
        if ((i & 2) == 0) {
            this.title = "";
        } else {
            this.title = str2;
        }
        if ((i & 4) == 0) {
            this.summary = "";
        } else {
            this.summary = str3;
        }
        if ((i & 8) == 0) {
            this.icon_uri = "";
        } else {
            this.icon_uri = str4;
        }
        if ((i & 16) == 0) {
            this.connector_id = "";
        } else {
            this.connector_id = str5;
        }
        if ((i & 32) == 0) {
            this.from_card = null;
        } else {
            this.from_card = str6;
        }
    }

    public OnboardingTaskJson() {
        this("", "", "", "", "", null);
    }
}
