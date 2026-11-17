package com.facebook.aura.survey;

import X.AHD;
import X.AHI;
import X.AnonymousClass001;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.C06G;
import X.C06H;
import X.C0KA;
import X.C7384Etj;

/* loaded from: classes4.dex */
public final class HatchSurveyQuestion extends C06G {
    public static final int $stable = 0;
    public final HatchSurveyKind kind;
    public final AHD<HatchSurveyLink> links;
    public final AHD<HatchSurveyOption> options;
    public final String prompt;
    public final String questionId;
    public final String rawKind;
    public final boolean required;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof HatchSurveyQuestion) {
                HatchSurveyQuestion hatchSurveyQuestion = (HatchSurveyQuestion) obj;
                if (!C7384Etj.areEqual(this.questionId, hatchSurveyQuestion.questionId) || !C7384Etj.areEqual(this.prompt, hatchSurveyQuestion.prompt) || this.kind != hatchSurveyQuestion.kind || !C7384Etj.areEqual(this.rawKind, hatchSurveyQuestion.rawKind) || this.required != hatchSurveyQuestion.required || !C7384Etj.areEqual(this.options, hatchSurveyQuestion.options) || !C7384Etj.areEqual(this.links, hatchSurveyQuestion.links)) {
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ HatchSurveyQuestion copy$default(HatchSurveyQuestion hatchSurveyQuestion, String str, String str2, HatchSurveyKind hatchSurveyKind, String str3, boolean z, AHD ahd, AHD ahd2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = hatchSurveyQuestion.questionId;
        }
        if ((i & 2) != 0) {
            str2 = hatchSurveyQuestion.prompt;
        }
        if ((i & 4) != 0) {
            hatchSurveyKind = hatchSurveyQuestion.kind;
        }
        if ((i & 8) != 0) {
            str3 = hatchSurveyQuestion.rawKind;
        }
        if ((i & 16) != 0) {
            z = hatchSurveyQuestion.required;
        }
        if ((i & 32) != 0) {
            ahd = hatchSurveyQuestion.options;
        }
        if ((i & 64) != 0) {
            ahd2 = hatchSurveyQuestion.links;
        }
        return hatchSurveyQuestion.copy(str, str2, hatchSurveyKind, str3, z, ahd, ahd2);
    }

    public final String component1() {
        return this.questionId;
    }

    public final String component2() {
        return this.prompt;
    }

    public final HatchSurveyKind component3() {
        return this.kind;
    }

    public final String component4() {
        return this.rawKind;
    }

    public final boolean component5() {
        return this.required;
    }

    public final AHD<HatchSurveyOption> component6() {
        return this.options;
    }

    public final AHD<HatchSurveyLink> component7() {
        return this.links;
    }

    public final HatchSurveyKind getKind() {
        return this.kind;
    }

    public final AHD<HatchSurveyLink> getLinks() {
        return this.links;
    }

    public final boolean getMustAnswer() {
        return this.required && getPresentation().getRequiresAnswer();
    }

    public final AHD<HatchSurveyOption> getOptions() {
        return this.options;
    }

    public final HatchSurveyPresentation getPresentation() {
        if (!this.options.isEmpty()) {
            return HatchSurveyPresentation.SINGLE_SELECT;
        }
        HatchSurveyKind hatchSurveyKind = this.kind;
        return hatchSurveyKind == HatchSurveyKind.NUMERIC_FIELD ? HatchSurveyPresentation.NUMERIC : hatchSurveyKind == HatchSurveyKind.TEXT ? HatchSurveyPresentation.FREE_TEXT : hatchSurveyKind == HatchSurveyKind.MESSAGE ? HatchSurveyPresentation.DISPLAY_ONLY : HatchSurveyPresentation.UNSUPPORTED;
    }

    public final String getPrompt() {
        return this.prompt;
    }

    public final String getQuestionId() {
        return this.questionId;
    }

    public final String getRawKind() {
        return this.rawKind;
    }

    public final boolean getRequired() {
        return this.required;
    }

    public int hashCode() {
        return AnonymousClass005.A0G(this.links, AnonymousClass005.A0F(this.options, C0KA.A01(AnonymousClass005.A0I(this.rawKind, AnonymousClass005.A0F(this.kind, AnonymousClass005.A0I(this.prompt, AnonymousClass001.A0G(this.questionId)))), this.required)));
    }

    public HatchSurveyQuestion(String str, String str2, HatchSurveyKind hatchSurveyKind, String str3, boolean z, AHD<HatchSurveyOption> ahd, AHD<HatchSurveyLink> ahd2) {
        AnonymousClass005.A14(str, str2, hatchSurveyKind, str3);
        AnonymousClass003.A0z(ahd, ahd2);
        this.questionId = str;
        this.prompt = str2;
        this.kind = hatchSurveyKind;
        this.rawKind = str3;
        this.required = z;
        this.options = ahd;
        this.links = ahd2;
    }

    public final HatchSurveyQuestion copy(String str, String str2, HatchSurveyKind hatchSurveyKind, String str3, boolean z, AHD<HatchSurveyOption> ahd, AHD<HatchSurveyLink> ahd2) {
        AnonymousClass005.A14(str, str2, hatchSurveyKind, str3);
        AnonymousClass003.A0z(ahd, ahd2);
        return new HatchSurveyQuestion(str, str2, hatchSurveyKind, str3, z, ahd, ahd2);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ HatchSurveyQuestion(String str, String str2, HatchSurveyKind hatchSurveyKind, String str3, boolean z, AHD ahd, AHD ahd2, int i, C06H c06h) {
        this(str, str2, hatchSurveyKind, str3, z, ahd, (i & 64) != 0 ? AHI.A01 : ahd2);
    }
}
