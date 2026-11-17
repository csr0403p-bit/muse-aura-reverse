package com.facebook.aura.survey;

import X.AHD;
import X.AnonymousClass001;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C7384Etj;

/* loaded from: classes4.dex */
public final class HatchSurveyPage extends C06G {
    public static final int $stable = 0;
    public final String attemptId;
    public final int index;
    public final String pageId;
    public final Integer pageOrdinal;
    public final AHD<HatchSurveyQuestion> questions;
    public final String surveyId;
    public final String title;
    public final int total;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof HatchSurveyPage) {
                HatchSurveyPage hatchSurveyPage = (HatchSurveyPage) obj;
                if (!C7384Etj.areEqual(this.pageId, hatchSurveyPage.pageId) || !C7384Etj.areEqual(this.title, hatchSurveyPage.title) || this.index != hatchSurveyPage.index || this.total != hatchSurveyPage.total || !C7384Etj.areEqual(this.surveyId, hatchSurveyPage.surveyId) || !C7384Etj.areEqual(this.attemptId, hatchSurveyPage.attemptId) || !C7384Etj.areEqual(this.pageOrdinal, hatchSurveyPage.pageOrdinal) || !C7384Etj.areEqual(this.questions, hatchSurveyPage.questions)) {
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ HatchSurveyPage copy$default(HatchSurveyPage hatchSurveyPage, String str, String str2, int i, int i2, String str3, String str4, Integer num, AHD ahd, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = hatchSurveyPage.pageId;
        }
        if ((i3 & 2) != 0) {
            str2 = hatchSurveyPage.title;
        }
        if ((i3 & 4) != 0) {
            i = hatchSurveyPage.index;
        }
        if ((i3 & 8) != 0) {
            i2 = hatchSurveyPage.total;
        }
        if ((i3 & 16) != 0) {
            str3 = hatchSurveyPage.surveyId;
        }
        if ((i3 & 32) != 0) {
            str4 = hatchSurveyPage.attemptId;
        }
        if ((i3 & 64) != 0) {
            num = hatchSurveyPage.pageOrdinal;
        }
        if ((i3 & 128) != 0) {
            ahd = hatchSurveyPage.questions;
        }
        return hatchSurveyPage.copy(str, str2, i, i2, str3, str4, num, ahd);
    }

    public final String component1() {
        return this.pageId;
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
        return this.surveyId;
    }

    public final String component6() {
        return this.attemptId;
    }

    public final Integer component7() {
        return this.pageOrdinal;
    }

    public final AHD<HatchSurveyQuestion> component8() {
        return this.questions;
    }

    public final String getAttemptId() {
        return this.attemptId;
    }

    public final int getIndex() {
        return this.index;
    }

    public final String getPageId() {
        return this.pageId;
    }

    public final Integer getPageOrdinal() {
        return this.pageOrdinal;
    }

    public final AHD<HatchSurveyQuestion> getQuestions() {
        return this.questions;
    }

    public final String getSurveyId() {
        return this.surveyId;
    }

    public final String getTitle() {
        return this.title;
    }

    public final int getTotal() {
        return this.total;
    }

    public int hashCode() {
        return AnonymousClass005.A0G(this.questions, (AnonymousClass005.A0I(this.attemptId, AnonymousClass005.A0I(this.surveyId, (((AnonymousClass005.A0I(this.title, AnonymousClass001.A0G(this.pageId)) + this.index) * 31) + this.total) * 31)) + AnonymousClass006.A0D(this.pageOrdinal)) * 31);
    }

    public HatchSurveyPage(String str, String str2, int i, int i2, String str3, String str4, Integer num, AHD<HatchSurveyQuestion> ahd) {
        AnonymousClass003.A0u(str, str2);
        AnonymousClass003.A0y(str3, str4);
        C7384Etj.A0Y(ahd, 7);
        this.pageId = str;
        this.title = str2;
        this.index = i;
        this.total = i2;
        this.surveyId = str3;
        this.attemptId = str4;
        this.pageOrdinal = num;
        this.questions = ahd;
    }

    public final HatchSurveyPage copy(String str, String str2, int i, int i2, String str3, String str4, Integer num, AHD<HatchSurveyQuestion> ahd) {
        AnonymousClass003.A0u(str, str2);
        AnonymousClass003.A0y(str3, str4);
        C7384Etj.A0Y(ahd, 7);
        return new HatchSurveyPage(str, str2, i, i2, str3, str4, num, ahd);
    }

    public String toString() {
        return super.toString();
    }
}
