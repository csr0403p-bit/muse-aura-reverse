package com.facebook.aura.survey;

import X.AGI;
import X.AHD;
import X.AbstractC5321DgF;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.C06G;
import X.C06H;
import X.C0881AGi;
import X.C0KA;
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
public final class SurveyQuestionJson extends C06G {
    public static final F0C<C9hr<Object>>[] $childSerializers;
    public static final int $stable = 0;
    public static final Companion Companion = new Companion();
    public final String kind;
    public final List<SurveyLinkJson> links;
    public final List<SurveyOptionJson> options;
    public final String prompt;
    public final String question_id;
    public final boolean required;

    public final class Companion {
        public final C9hr<SurveyQuestionJson> serializer() {
            return SurveyQuestionJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    static {
        Integer num = C79.A01;
        $childSerializers = new F0C[]{null, null, null, null, AbstractC5321DgF.A02(num, SurveyQuestionJson$Companion$$childSerializers$1.INSTANCE), AbstractC5321DgF.A02(num, SurveyQuestionJson$Companion$$childSerializers$2.INSTANCE)};
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof SurveyQuestionJson) {
                SurveyQuestionJson surveyQuestionJson = (SurveyQuestionJson) obj;
                if (!C7384Etj.areEqual(this.question_id, surveyQuestionJson.question_id) || !C7384Etj.areEqual(this.prompt, surveyQuestionJson.prompt) || !C7384Etj.areEqual(this.kind, surveyQuestionJson.kind) || this.required != surveyQuestionJson.required || !C7384Etj.areEqual(this.options, surveyQuestionJson.options) || !C7384Etj.areEqual(this.links, surveyQuestionJson.links)) {
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SurveyQuestionJson copy$default(SurveyQuestionJson surveyQuestionJson, String str, String str2, String str3, boolean z, List list, List list2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = surveyQuestionJson.question_id;
        }
        if ((i & 2) != 0) {
            str2 = surveyQuestionJson.prompt;
        }
        if ((i & 4) != 0) {
            str3 = surveyQuestionJson.kind;
        }
        if ((i & 8) != 0) {
            z = surveyQuestionJson.required;
        }
        if ((i & 16) != 0) {
            list = surveyQuestionJson.options;
        }
        if ((i & 32) != 0) {
            list2 = surveyQuestionJson.links;
        }
        return surveyQuestionJson.copy(str, str2, str3, z, list, list2);
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_survey_survey(SurveyQuestionJson surveyQuestionJson, C9j5 c9j5, C9iZ c9iZ) {
        F0C<C9hr<Object>>[] f0cArr = $childSerializers;
        boolean zAfR = c9j5.AfR();
        if (zAfR || !"".equals(surveyQuestionJson.question_id)) {
            c9j5.AAV(surveyQuestionJson.question_id, c9iZ, 0);
        }
        if (zAfR || !"".equals(surveyQuestionJson.prompt)) {
            c9j5.AAV(surveyQuestionJson.prompt, c9iZ, 1);
        }
        if (zAfR || !"".equals(surveyQuestionJson.kind)) {
            c9j5.AAV(surveyQuestionJson.kind, c9iZ, 2);
        }
        if (zAfR || surveyQuestionJson.required) {
            c9j5.AA7(c9iZ, 3, surveyQuestionJson.required);
        }
        if (zAfR || !C3cG.A1L(surveyQuestionJson.options)) {
            c9j5.AAQ(surveyQuestionJson.options, C3cH.A15(f0cArr, 4), c9iZ, 4);
        }
        if (zAfR || !C3cG.A1L(surveyQuestionJson.links)) {
            c9j5.AAQ(surveyQuestionJson.links, C3cH.A15(f0cArr, 5), c9iZ, 5);
        }
    }

    public final String component1() {
        return this.question_id;
    }

    public final String component2() {
        return this.prompt;
    }

    public final String component3() {
        return this.kind;
    }

    public final boolean component4() {
        return this.required;
    }

    public final List<SurveyOptionJson> component5() {
        return this.options;
    }

    public final List<SurveyLinkJson> component6() {
        return this.links;
    }

    public final String getKind() {
        return this.kind;
    }

    public final List<SurveyLinkJson> getLinks() {
        return this.links;
    }

    public final List<SurveyOptionJson> getOptions() {
        return this.options;
    }

    public final String getPrompt() {
        return this.prompt;
    }

    public final String getQuestion_id() {
        return this.question_id;
    }

    public final boolean getRequired() {
        return this.required;
    }

    public int hashCode() {
        return AnonymousClass005.A0G(this.links, AnonymousClass005.A0F(this.options, C0KA.A01(AnonymousClass005.A0I(this.kind, AnonymousClass005.A0I(this.prompt, AnonymousClass001.A0G(this.question_id))), this.required)));
    }

    public final HatchSurveyQuestion toDomain() {
        String str = this.question_id;
        String str2 = this.prompt;
        HatchSurveyKind hatchSurveyKindFromWire = HatchSurveyKind.Companion.fromWire(this.kind);
        String str3 = this.kind;
        boolean z = this.required;
        List<SurveyOptionJson> list = this.options;
        ArrayList arrayListA0m = AnonymousClass002.A0m(list);
        Iterator<SurveyOptionJson> it = list.iterator();
        while (it.hasNext()) {
            arrayListA0m.add(it.next().toDomain());
        }
        AHD ahdA07 = AGI.A07(arrayListA0m);
        List<SurveyLinkJson> list2 = this.links;
        ArrayList arrayListA0m2 = AnonymousClass002.A0m(list2);
        Iterator<SurveyLinkJson> it2 = list2.iterator();
        while (it2.hasNext()) {
            arrayListA0m2.add(it2.next().toDomain());
        }
        return new HatchSurveyQuestion(str, str2, hatchSurveyKindFromWire, str3, z, ahdA07, AGI.A07(arrayListA0m2));
    }

    public /* synthetic */ SurveyQuestionJson(int i, String str, String str2, String str3, boolean z, List list, List list2, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.question_id = "";
        } else {
            this.question_id = str;
        }
        if ((i & 2) == 0) {
            this.prompt = "";
        } else {
            this.prompt = str2;
        }
        if ((i & 4) == 0) {
            this.kind = "";
        } else {
            this.kind = str3;
        }
        if ((i & 8) == 0) {
            this.required = false;
        } else {
            this.required = z;
        }
        if ((i & 16) == 0) {
            this.options = C0881AGi.A00;
        } else {
            this.options = list;
        }
        if ((i & 32) == 0) {
            this.links = C0881AGi.A00;
        } else {
            this.links = list2;
        }
    }

    public final SurveyQuestionJson copy(String str, String str2, String str3, boolean z, List<SurveyOptionJson> list, List<SurveyLinkJson> list2) {
        AnonymousClass005.A0x(str, str2, str3);
        AnonymousClass003.A0y(list, list2);
        return new SurveyQuestionJson(str, str2, str3, z, list, list2);
    }

    public String toString() {
        return super.toString();
    }

    public SurveyQuestionJson(String str, String str2, String str3, boolean z, List<SurveyOptionJson> list, List<SurveyLinkJson> list2) {
        AnonymousClass005.A0x(str, str2, str3);
        AnonymousClass003.A0y(list, list2);
        this.question_id = str;
        this.prompt = str2;
        this.kind = str3;
        this.required = z;
        this.options = list;
        this.links = list2;
    }

    public /* synthetic */ SurveyQuestionJson(String str, String str2, String str3, boolean z, List list, List list2, int i, C06H c06h) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, AnonymousClass005.A1P(i, z), (i & 16) != 0 ? C0881AGi.A00 : list, (i & 32) != 0 ? C0881AGi.A00 : list2);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public SurveyQuestionJson() {
        C0881AGi c0881AGi = C0881AGi.A00;
        this("", "", "", false, c0881AGi, c0881AGi);
    }
}
