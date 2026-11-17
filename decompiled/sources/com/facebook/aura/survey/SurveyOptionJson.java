package com.facebook.aura.survey;

import X.AnonymousClass001;
import X.C06G;
import X.C06H;
import X.C2hx;
import X.C3cH;
import X.C3cI;
import X.C7384Etj;
import X.C9hr;
import X.C9iZ;
import X.C9j5;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes4.dex */
public final class SurveyOptionJson extends C06G {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion();
    public final String label;
    public final int value;

    public final class Companion {
        public final C9hr<SurveyOptionJson> serializer() {
            return SurveyOptionJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public SurveyOptionJson(int i, String str) {
        C7384Etj.A0Y(str, 1);
        this.value = i;
        this.label = str;
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_survey_survey(SurveyOptionJson surveyOptionJson, C9j5 c9j5, C9iZ c9iZ) {
        boolean zAfR = c9j5.AfR();
        if (zAfR || surveyOptionJson.value != 0) {
            c9j5.AAK(c9iZ, 0, surveyOptionJson.value);
        }
        if (zAfR || !C3cH.A1Q(surveyOptionJson.label)) {
            c9j5.AAV(surveyOptionJson.label, c9iZ, 1);
        }
    }

    public final SurveyOptionJson copy(int i, String str) {
        C7384Etj.A0Y(str, 1);
        return new SurveyOptionJson(i, str);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof SurveyOptionJson) {
                SurveyOptionJson surveyOptionJson = (SurveyOptionJson) obj;
                if (this.value != surveyOptionJson.value || !C7384Etj.areEqual(this.label, surveyOptionJson.label)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ SurveyOptionJson copy$default(SurveyOptionJson surveyOptionJson, int i, String str, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = surveyOptionJson.value;
        }
        if ((i2 & 2) != 0) {
            str = surveyOptionJson.label;
        }
        C7384Etj.A0Y(str, 1);
        return new SurveyOptionJson(i, str);
    }

    public final int component1() {
        return this.value;
    }

    public final String component2() {
        return this.label;
    }

    public final String getLabel() {
        return this.label;
    }

    public final int getValue() {
        return this.value;
    }

    public int hashCode() {
        return AnonymousClass001.A0H(this.label, this.value * 31);
    }

    public final HatchSurveyOption toDomain() {
        return new HatchSurveyOption(this.value, this.label);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ SurveyOptionJson(int i, int i2, String str, C2hx c2hx) {
        this.value = (i & 1) == 0 ? 0 : i2;
        if ((i & 2) == 0) {
            this.label = "";
        } else {
            this.label = str;
        }
    }

    public /* synthetic */ SurveyOptionJson(int i, String str, int i2, C06H c06h) {
        this(C3cI.A00(i2, i), (i2 & 2) != 0 ? "" : str);
    }

    public SurveyOptionJson() {
        this(0, "");
    }
}
