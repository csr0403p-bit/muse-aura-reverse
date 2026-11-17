package com.facebook.aura.survey;

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
/* loaded from: classes4.dex */
public final class SurveyAnswerJson extends C06G {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion();
    public final String question_id;
    public final String value;

    public final class Companion {
        public final C9hr<SurveyAnswerJson> serializer() {
            return SurveyAnswerJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_survey_survey(SurveyAnswerJson surveyAnswerJson, C9j5 c9j5, C9iZ c9iZ) {
        c9j5.AAV(surveyAnswerJson.question_id, c9iZ, 0);
        c9j5.AAV(surveyAnswerJson.value, c9iZ, 1);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof SurveyAnswerJson) {
                SurveyAnswerJson surveyAnswerJson = (SurveyAnswerJson) obj;
                if (!C7384Etj.areEqual(this.question_id, surveyAnswerJson.question_id) || !C7384Etj.areEqual(this.value, surveyAnswerJson.value)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ SurveyAnswerJson copy$default(SurveyAnswerJson surveyAnswerJson, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = surveyAnswerJson.question_id;
        }
        if ((i & 2) != 0) {
            str2 = surveyAnswerJson.value;
        }
        AnonymousClass003.A0u(str, str2);
        return new SurveyAnswerJson(str, str2);
    }

    public final String component1() {
        return this.question_id;
    }

    public final String component2() {
        return this.value;
    }

    public final String getQuestion_id() {
        return this.question_id;
    }

    public final String getValue() {
        return this.value;
    }

    public int hashCode() {
        return AnonymousClass001.A0H(this.value, AnonymousClass001.A0G(this.question_id));
    }

    public SurveyAnswerJson(String str, String str2) {
        AnonymousClass003.A0u(str, str2);
        this.question_id = str;
        this.value = str2;
    }

    public final SurveyAnswerJson copy(String str, String str2) {
        AnonymousClass003.A0u(str, str2);
        return new SurveyAnswerJson(str, str2);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ SurveyAnswerJson(int i, String str, String str2, C2hx c2hx) {
        if (3 != (i & 3)) {
            C9iI.A00(SurveyAnswerJson$$serializer.descriptor, i, 3);
            throw F60.createAndThrow();
        }
        this.question_id = str;
        this.value = str2;
    }
}
