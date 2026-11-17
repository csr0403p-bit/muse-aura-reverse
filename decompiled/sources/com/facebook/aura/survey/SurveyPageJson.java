package com.facebook.aura.survey;

import X.AGI;
import X.AbstractC5321DgF;
import X.AnonymousClass001;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C07729ii;
import X.C0881AGi;
import X.C2hx;
import X.C3cG;
import X.C3cH;
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
/* loaded from: classes4.dex */
public final class SurveyPageJson extends C06G {
    public static final int $stable = 8;
    public final String attempt_id;
    public final int index;
    public final String page_id;
    public final Integer page_ordinal;
    public final List<SurveyQuestionJson> questions;
    public final String survey_id;
    public final String title;
    public final int total;
    public static final Companion Companion = new Companion();
    public static final F0C<C9hr<Object>>[] $childSerializers = {null, null, null, null, null, null, null, AbstractC5321DgF.A02(C79.A01, SurveyPageJson$Companion$$childSerializers$1.INSTANCE)};

    public final class Companion {
        public final C9hr<SurveyPageJson> serializer() {
            return SurveyPageJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof SurveyPageJson) {
                SurveyPageJson surveyPageJson = (SurveyPageJson) obj;
                if (!C7384Etj.areEqual(this.page_id, surveyPageJson.page_id) || !C7384Etj.areEqual(this.title, surveyPageJson.title) || this.index != surveyPageJson.index || this.total != surveyPageJson.total || !C7384Etj.areEqual(this.survey_id, surveyPageJson.survey_id) || !C7384Etj.areEqual(this.attempt_id, surveyPageJson.attempt_id) || !C7384Etj.areEqual(this.page_ordinal, surveyPageJson.page_ordinal) || !C7384Etj.areEqual(this.questions, surveyPageJson.questions)) {
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SurveyPageJson copy$default(SurveyPageJson surveyPageJson, String str, String str2, int i, int i2, String str3, String str4, Integer num, List list, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = surveyPageJson.page_id;
        }
        if ((i3 & 2) != 0) {
            str2 = surveyPageJson.title;
        }
        if ((i3 & 4) != 0) {
            i = surveyPageJson.index;
        }
        if ((i3 & 8) != 0) {
            i2 = surveyPageJson.total;
        }
        if ((i3 & 16) != 0) {
            str3 = surveyPageJson.survey_id;
        }
        if ((i3 & 32) != 0) {
            str4 = surveyPageJson.attempt_id;
        }
        if ((i3 & 64) != 0) {
            num = surveyPageJson.page_ordinal;
        }
        if ((i3 & 128) != 0) {
            list = surveyPageJson.questions;
        }
        return surveyPageJson.copy(str, str2, i, i2, str3, str4, num, list);
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_survey_survey(SurveyPageJson surveyPageJson, C9j5 c9j5, C9iZ c9iZ) {
        F0C<C9hr<Object>>[] f0cArr = $childSerializers;
        boolean zAfR = c9j5.AfR();
        if (zAfR || !"".equals(surveyPageJson.page_id)) {
            c9j5.AAV(surveyPageJson.page_id, c9iZ, 0);
        }
        if (zAfR || !"".equals(surveyPageJson.title)) {
            c9j5.AAV(surveyPageJson.title, c9iZ, 1);
        }
        if (zAfR || surveyPageJson.index != 0) {
            c9j5.AAK(c9iZ, 2, surveyPageJson.index);
        }
        if (zAfR || surveyPageJson.total != 0) {
            c9j5.AAK(c9iZ, 3, surveyPageJson.total);
        }
        if (zAfR || !"".equals(surveyPageJson.survey_id)) {
            c9j5.AAV(surveyPageJson.survey_id, c9iZ, 4);
        }
        if (zAfR || !"".equals(surveyPageJson.attempt_id)) {
            c9j5.AAV(surveyPageJson.attempt_id, c9iZ, 5);
        }
        if (zAfR || surveyPageJson.page_ordinal != null) {
            c9j5.AAP(surveyPageJson.page_ordinal, C07729ii.A00, c9iZ, 6);
        }
        if (zAfR || !C3cG.A1L(surveyPageJson.questions)) {
            c9j5.AAQ(surveyPageJson.questions, C3cH.A15(f0cArr, 7), c9iZ, 7);
        }
    }

    public final String component1() {
        return this.page_id;
    }

    public final String component2() {
        return this.title;
    }

    public final int component3() {
        return this.index;
    }

    public final int component4() {
        return this.total;
    }

    public final String component5() {
        return this.survey_id;
    }

    public final String component6() {
        return this.attempt_id;
    }

    public final Integer component7() {
        return this.page_ordinal;
    }

    public final List<SurveyQuestionJson> component8() {
        return this.questions;
    }

    public final String getAttempt_id() {
        return this.attempt_id;
    }

    public final int getIndex() {
        return this.index;
    }

    public final String getPage_id() {
        return this.page_id;
    }

    public final Integer getPage_ordinal() {
        return this.page_ordinal;
    }

    public final List<SurveyQuestionJson> getQuestions() {
        return this.questions;
    }

    public final String getSurvey_id() {
        return this.survey_id;
    }

    public final String getTitle() {
        return this.title;
    }

    public final int getTotal() {
        return this.total;
    }

    public int hashCode() {
        return AnonymousClass005.A0G(this.questions, (AnonymousClass005.A0I(this.attempt_id, AnonymousClass005.A0I(this.survey_id, (((AnonymousClass005.A0I(this.title, AnonymousClass001.A0G(this.page_id)) + this.index) * 31) + this.total) * 31)) + AnonymousClass006.A0D(this.page_ordinal)) * 31);
    }

    public final HatchSurveyPage toDomain() {
        String str = this.page_id;
        String str2 = this.title;
        int i = this.index;
        int i2 = this.total;
        String str3 = this.survey_id;
        String str4 = this.attempt_id;
        Integer num = this.page_ordinal;
        List<SurveyQuestionJson> list = this.questions;
        ArrayList arrayListA0i = AnonymousClass003.A0i(list);
        Iterator<SurveyQuestionJson> it = list.iterator();
        while (it.hasNext()) {
            arrayListA0i.add(it.next().toDomain());
        }
        return new HatchSurveyPage(str, str2, i, i2, str3, str4, num, AGI.A07(arrayListA0i));
    }

    public SurveyPageJson(String str, String str2, int i, int i2, String str3, String str4, Integer num, List<SurveyQuestionJson> list) {
        AnonymousClass003.A0u(str, str2);
        AnonymousClass003.A0y(str3, str4);
        C7384Etj.A0Y(list, 7);
        this.page_id = str;
        this.title = str2;
        this.index = i;
        this.total = i2;
        this.survey_id = str3;
        this.attempt_id = str4;
        this.page_ordinal = num;
        this.questions = list;
    }

    public final SurveyPageJson copy(String str, String str2, int i, int i2, String str3, String str4, Integer num, List<SurveyQuestionJson> list) {
        AnonymousClass003.A0u(str, str2);
        AnonymousClass003.A0y(str3, str4);
        C7384Etj.A0Y(list, 7);
        return new SurveyPageJson(str, str2, i, i2, str3, str4, num, list);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ SurveyPageJson(String str, String str2, int i, int i2, String str3, String str4, Integer num, List list, int i3, C06H c06h) {
        this((i3 & 1) != 0 ? "" : str, (i3 & 2) != 0 ? "" : str2, (i3 & 4) != 0 ? 0 : i, (i3 & 8) != 0 ? 0 : i2, (i3 & 16) != 0 ? "" : str3, (i3 & 32) != 0 ? "" : str4, (i3 & 64) != 0 ? null : num, (i3 & 128) != 0 ? C0881AGi.A00 : list);
    }

    public /* synthetic */ SurveyPageJson(int i, String str, String str2, int i2, int i3, String str3, String str4, Integer num, List list, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.page_id = "";
        } else {
            this.page_id = str;
        }
        if ((i & 2) == 0) {
            this.title = "";
        } else {
            this.title = str2;
        }
        if ((i & 4) == 0) {
            this.index = 0;
        } else {
            this.index = i2;
        }
        if ((i & 8) == 0) {
            this.total = 0;
        } else {
            this.total = i3;
        }
        if ((i & 16) == 0) {
            this.survey_id = "";
        } else {
            this.survey_id = str3;
        }
        if ((i & 32) == 0) {
            this.attempt_id = "";
        } else {
            this.attempt_id = str4;
        }
        if ((i & 64) == 0) {
            this.page_ordinal = null;
        } else {
            this.page_ordinal = num;
        }
        if ((i & 128) == 0) {
            this.questions = C0881AGi.A00;
        } else {
            this.questions = list;
        }
    }

    public SurveyPageJson() {
        this("", "", 0, 0, "", "", null, C0881AGi.A00);
    }
}
