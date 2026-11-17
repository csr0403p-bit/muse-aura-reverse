package com.facebook.aura.survey;

import X.AnonymousClass001;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C0KA;
import X.C2hx;
import X.C7384Etj;
import X.C9hr;
import X.C9iZ;
import X.C9j5;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes4.dex */
public final class SurveyNextResponseJson extends C06G {
    public static final int $stable = 8;
    public static final Companion Companion = new Companion();
    public final boolean done;
    public final SurveyPageJson page;

    public final class Companion {
        public final C9hr<SurveyNextResponseJson> serializer() {
            return SurveyNextResponseJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_survey_survey(SurveyNextResponseJson surveyNextResponseJson, C9j5 c9j5, C9iZ c9iZ) {
        boolean zAfR = c9j5.AfR();
        if (zAfR || surveyNextResponseJson.done) {
            c9j5.AA7(c9iZ, 0, surveyNextResponseJson.done);
        }
        if (zAfR || surveyNextResponseJson.page != null) {
            c9j5.AAP(surveyNextResponseJson.page, SurveyPageJson$$serializer.INSTANCE, c9iZ, 1);
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof SurveyNextResponseJson) {
                SurveyNextResponseJson surveyNextResponseJson = (SurveyNextResponseJson) obj;
                if (this.done != surveyNextResponseJson.done || !C7384Etj.areEqual(this.page, surveyNextResponseJson.page)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ SurveyNextResponseJson copy$default(SurveyNextResponseJson surveyNextResponseJson, boolean z, SurveyPageJson surveyPageJson, int i, Object obj) {
        if ((i & 1) != 0) {
            z = surveyNextResponseJson.done;
        }
        if ((i & 2) != 0) {
            surveyPageJson = surveyNextResponseJson.page;
        }
        return new SurveyNextResponseJson(z, surveyPageJson);
    }

    public final boolean component1() {
        return this.done;
    }

    public final SurveyPageJson component2() {
        return this.page;
    }

    public final SurveyNextResponseJson copy(boolean z, SurveyPageJson surveyPageJson) {
        return new SurveyNextResponseJson(z, surveyPageJson);
    }

    public final boolean getDone() {
        return this.done;
    }

    public final SurveyPageJson getPage() {
        return this.page;
    }

    public int hashCode() {
        return C0KA.A02(this.done) + AnonymousClass006.A0D(this.page);
    }

    public final HatchSurveyNextResult toDomain() {
        boolean z = this.done;
        SurveyPageJson surveyPageJson = this.page;
        return new HatchSurveyNextResult(z, surveyPageJson != null ? surveyPageJson.toDomain() : null);
    }

    public SurveyNextResponseJson(boolean z, SurveyPageJson surveyPageJson) {
        this.done = z;
        this.page = surveyPageJson;
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ SurveyNextResponseJson(int i, boolean z, SurveyPageJson surveyPageJson, C2hx c2hx) {
        this.done = (i & 1) == 0 ? false : z;
        if ((i & 2) == 0) {
            this.page = null;
        } else {
            this.page = surveyPageJson;
        }
    }

    public /* synthetic */ SurveyNextResponseJson(boolean z, SurveyPageJson surveyPageJson, int i, C06H c06h) {
        this(AnonymousClass001.A1P(i, z), (i & 2) != 0 ? null : surveyPageJson);
    }

    public SurveyNextResponseJson() {
        this(false, null);
    }
}
