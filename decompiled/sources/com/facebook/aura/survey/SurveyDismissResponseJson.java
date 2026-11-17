package com.facebook.aura.survey;

import X.AnonymousClass001;
import X.C06G;
import X.C06H;
import X.C2hx;
import X.C9hr;
import X.C9iZ;
import X.C9j5;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes4.dex */
public final class SurveyDismissResponseJson extends C06G {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion();
    public final boolean dismissed;

    public final class Companion {
        public final C9hr<SurveyDismissResponseJson> serializer() {
            return SurveyDismissResponseJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_survey_survey(SurveyDismissResponseJson surveyDismissResponseJson, C9j5 c9j5, C9iZ c9iZ) {
        if (c9j5.AfR() || surveyDismissResponseJson.dismissed) {
            c9j5.AA7(c9iZ, 0, surveyDismissResponseJson.dismissed);
        }
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof SurveyDismissResponseJson) && this.dismissed == ((SurveyDismissResponseJson) obj).dismissed);
    }

    public static /* synthetic */ SurveyDismissResponseJson copy$default(SurveyDismissResponseJson surveyDismissResponseJson, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = surveyDismissResponseJson.dismissed;
        }
        return new SurveyDismissResponseJson(z);
    }

    public final boolean component1() {
        return this.dismissed;
    }

    public final SurveyDismissResponseJson copy(boolean z) {
        return new SurveyDismissResponseJson(z);
    }

    public final boolean getDismissed() {
        return this.dismissed;
    }

    public int hashCode() {
        return this.dismissed ? 1231 : 1237;
    }

    public /* synthetic */ SurveyDismissResponseJson(int i, boolean z, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.dismissed = false;
        } else {
            this.dismissed = z;
        }
    }

    public String toString() {
        return super.toString();
    }

    public SurveyDismissResponseJson(boolean z) {
        this.dismissed = z;
    }

    public /* synthetic */ SurveyDismissResponseJson(boolean z, int i, C06H c06h) {
        this(AnonymousClass001.A1P(i, z));
    }

    public SurveyDismissResponseJson() {
        this(false);
    }
}
