package com.facebook.aura.survey;

import X.AnonymousClass001;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.C06G;
import X.C06H;
import X.C2hx;
import X.C3cG;
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
/* loaded from: classes4.dex */
public final class SurveyNextRequestJson extends C06G {
    public static final int $stable = 8;
    public final List<SurveyAnswerJson> answers;
    public final String page_id;
    public static final Companion Companion = new Companion();
    public static final F0C<C9hr<Object>>[] $childSerializers = C3cG.A1W(C79.A01, null, SurveyNextRequestJson$Companion$$childSerializers$1.INSTANCE);

    public final class Companion {
        public final C9hr<SurveyNextRequestJson> serializer() {
            return SurveyNextRequestJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof SurveyNextRequestJson) {
                SurveyNextRequestJson surveyNextRequestJson = (SurveyNextRequestJson) obj;
                if (!C7384Etj.areEqual(this.page_id, surveyNextRequestJson.page_id) || !C7384Etj.areEqual(this.answers, surveyNextRequestJson.answers)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ SurveyNextRequestJson copy$default(SurveyNextRequestJson surveyNextRequestJson, String str, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = surveyNextRequestJson.page_id;
        }
        if ((i & 2) != 0) {
            list = surveyNextRequestJson.answers;
        }
        AnonymousClass003.A0u(str, list);
        return new SurveyNextRequestJson(str, list);
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_survey_survey(SurveyNextRequestJson surveyNextRequestJson, C9j5 c9j5, C9iZ c9iZ) {
        F0C<C9hr<Object>>[] f0cArr = $childSerializers;
        c9j5.AAV(surveyNextRequestJson.page_id, c9iZ, 0);
        c9j5.AAQ(surveyNextRequestJson.answers, C3cH.A15(f0cArr, 1), c9iZ, 1);
    }

    public final String component1() {
        return this.page_id;
    }

    public final List<SurveyAnswerJson> component2() {
        return this.answers;
    }

    public final List<SurveyAnswerJson> getAnswers() {
        return this.answers;
    }

    public final String getPage_id() {
        return this.page_id;
    }

    public int hashCode() {
        return AnonymousClass005.A0G(this.answers, AnonymousClass001.A0G(this.page_id));
    }

    public SurveyNextRequestJson(String str, List<SurveyAnswerJson> list) {
        AnonymousClass003.A0u(str, list);
        this.page_id = str;
        this.answers = list;
    }

    public final SurveyNextRequestJson copy(String str, List<SurveyAnswerJson> list) {
        AnonymousClass003.A0u(str, list);
        return new SurveyNextRequestJson(str, list);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ SurveyNextRequestJson(int i, String str, List list, C2hx c2hx) {
        if (3 != (i & 3)) {
            C9iI.A00(SurveyNextRequestJson$$serializer.descriptor, i, 3);
            throw F60.createAndThrow();
        }
        this.page_id = str;
        this.answers = list;
    }
}
