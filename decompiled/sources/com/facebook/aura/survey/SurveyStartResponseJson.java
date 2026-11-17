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
public final class SurveyStartResponseJson extends C06G {
    public static final int $stable = 8;
    public static final Companion Companion = new Companion();
    public final SurveyPageJson page;
    public final boolean show;

    public final class Companion {
        public final C9hr<SurveyStartResponseJson> serializer() {
            return SurveyStartResponseJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_survey_survey(SurveyStartResponseJson surveyStartResponseJson, C9j5 c9j5, C9iZ c9iZ) {
        boolean zAfR = c9j5.AfR();
        if (zAfR || surveyStartResponseJson.show) {
            c9j5.AA7(c9iZ, 0, surveyStartResponseJson.show);
        }
        if (zAfR || surveyStartResponseJson.page != null) {
            c9j5.AAP(surveyStartResponseJson.page, SurveyPageJson$$serializer.INSTANCE, c9iZ, 1);
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof SurveyStartResponseJson) {
                SurveyStartResponseJson surveyStartResponseJson = (SurveyStartResponseJson) obj;
                if (this.show != surveyStartResponseJson.show || !C7384Etj.areEqual(this.page, surveyStartResponseJson.page)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ SurveyStartResponseJson copy$default(SurveyStartResponseJson surveyStartResponseJson, boolean z, SurveyPageJson surveyPageJson, int i, Object obj) {
        if ((i & 1) != 0) {
            z = surveyStartResponseJson.show;
        }
        if ((i & 2) != 0) {
            surveyPageJson = surveyStartResponseJson.page;
        }
        return new SurveyStartResponseJson(z, surveyPageJson);
    }

    public final boolean component1() {
        return this.show;
    }

    public final SurveyPageJson component2() {
        return this.page;
    }

    public final SurveyStartResponseJson copy(boolean z, SurveyPageJson surveyPageJson) {
        return new SurveyStartResponseJson(z, surveyPageJson);
    }

    public final SurveyPageJson getPage() {
        return this.page;
    }

    public final boolean getShow() {
        return this.show;
    }

    public int hashCode() {
        return C0KA.A02(this.show) + AnonymousClass006.A0D(this.page);
    }

    public final HatchSurveyStartResult toDomain() {
        boolean z = this.show;
        SurveyPageJson surveyPageJson = this.page;
        return new HatchSurveyStartResult(z, surveyPageJson != null ? surveyPageJson.toDomain() : null);
    }

    public SurveyStartResponseJson(boolean z, SurveyPageJson surveyPageJson) {
        this.show = z;
        this.page = surveyPageJson;
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ SurveyStartResponseJson(int i, boolean z, SurveyPageJson surveyPageJson, C2hx c2hx) {
        this.show = (i & 1) == 0 ? false : z;
        if ((i & 2) == 0) {
            this.page = null;
        } else {
            this.page = surveyPageJson;
        }
    }

    public /* synthetic */ SurveyStartResponseJson(boolean z, SurveyPageJson surveyPageJson, int i, C06H c06h) {
        this(AnonymousClass001.A1P(i, z), (i & 2) != 0 ? null : surveyPageJson);
    }

    public SurveyStartResponseJson() {
        this(false, null);
    }
}
