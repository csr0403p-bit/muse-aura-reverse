package com.facebook.aura.survey;

import X.AGH;
import X.AHD;
import X.AIW;
import X.AbstractC0878AGe;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.C0924AIa;
import X.C3cG;
import X.C60O;
import X.C7384Etj;
import com.facebook.acra.constants.ErrorReportingConstants;
import com.facebook.aura.analytics.hatch.HatchAppEventLogger;
import com.facebook.aura.analytics.hatch.HatchComponent;
import com.facebook.aura.analytics.hatch.HatchImpressionLogger;
import com.facebook.aura.analytics.hatch.HatchInteractionLogger;
import com.facebook.aura.analytics.hatch.HatchOrigin;
import com.facebook.aura.analytics.hatch.HatchScreen;
import com.facebook.aura.analytics.hatch.HatchSubsurface;
import com.facebook.aura.analytics.hatch.HatchSurface;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes4.dex */
public final class HatchSurveyLogger {
    public static final int $stable = 0;
    public static final String EVENT_COMPLETE = "survey_complete";
    public static final String EVENT_ERROR = "survey_error";
    public static final HatchSurveyLogger INSTANCE = new HatchSurveyLogger();
    public static final String SUBSURFACE = "survey";
    public static final String SURFACE = "survey";

    public final void logComplete(HatchSurveyPage hatchSurveyPage) {
        C7384Etj.A0Y(hatchSurveyPage, 0);
        HatchAppEventLogger.INSTANCE.logEvent(EVENT_COMPLETE, "survey", "survey", null, null, pageMetadata(hatchSurveyPage), null);
    }

    public final void logDismiss(HatchSurveyPage hatchSurveyPage) {
        C7384Etj.A0Y(hatchSurveyPage, 0);
        HatchInteractionLogger.INSTANCE.logDismiss(HatchSurface.SURVEY, HatchSubsurface.SURVEY, HatchScreen.SURVEY, HatchComponent.CLOSE_BUTTON, null, pageMetadata(hatchSurveyPage));
    }

    public final void logImpression(HatchSurveyPage hatchSurveyPage) {
        C7384Etj.A0Y(hatchSurveyPage, 0);
        HatchImpressionLogger.INSTANCE.logImpression(HatchOrigin.SURVEY, HatchSurface.SURVEY, HatchSubsurface.SURVEY, HatchScreen.SURVEY, HatchComponent.SURVEY_PAGE, null, questionMetadata(hatchSurveyPage), null);
    }

    public final void logOptionClick(HatchSurveyPage hatchSurveyPage) {
        C7384Etj.A0Y(hatchSurveyPage, 0);
        HatchInteractionLogger.INSTANCE.logClick(HatchSurface.SURVEY, HatchSubsurface.SURVEY, HatchScreen.SURVEY, HatchComponent.SURVEY_OPTION_ROW, null, pageMetadata(hatchSurveyPage), null);
    }

    public final void logError(String str, Integer num, String str2) {
        AnonymousClass003.A0v(str, str2);
        HatchAppEventLogger hatchAppEventLogger = HatchAppEventLogger.INSTANCE;
        C0924AIa c0924AIaA0u = C3cG.A0u();
        c0924AIaA0u.put(ErrorReportingConstants.ENDPOINT, str);
        if (num != null) {
            c0924AIaA0u.put("http_status", String.valueOf(num.intValue()));
        }
        c0924AIaA0u.put("error_code", str2);
        hatchAppEventLogger.logEvent(EVENT_ERROR, "survey", "survey", null, null, AIW.A0K(c0924AIaA0u), null);
    }

    private final Map<String, String> answerMetadata(HatchSurveyPage hatchSurveyPage, List<HatchSurveyAnswer> list) {
        C0924AIa c0924AIaA0u = C3cG.A0u();
        if (!list.isEmpty()) {
            AHD<HatchSurveyQuestion> ahd = hatchSurveyPage.questions;
            LinkedHashMap linkedHashMapA15 = C60O.A15(AnonymousClass005.A0C(ahd));
            for (HatchSurveyQuestion hatchSurveyQuestion : ahd) {
                linkedHashMapA15.put(hatchSurveyQuestion.questionId, hatchSurveyQuestion.rawKind);
            }
            c0924AIaA0u.put("question_id", AbstractC0878AGe.A0L(",", "", "", list, HatchSurveyLogger$answerMetadata$1$1.INSTANCE));
            c0924AIaA0u.put("question_kind", AbstractC0878AGe.A0L(",", "", "", list, new HatchSurveyLogger$answerMetadata$1$2(linkedHashMapA15)));
            c0924AIaA0u.put("survey_answer", AbstractC0878AGe.A0L(",", "", "", list, HatchSurveyLogger$answerMetadata$1$3.INSTANCE));
        }
        return AIW.A0K(c0924AIaA0u);
    }

    private final Map<String, String> pageMetadata(HatchSurveyPage hatchSurveyPage) {
        C0924AIa c0924AIaA0u = C3cG.A0u();
        c0924AIaA0u.put("page_id", hatchSurveyPage.pageId);
        c0924AIaA0u.put("index", String.valueOf(hatchSurveyPage.index));
        c0924AIaA0u.put("total", String.valueOf(hatchSurveyPage.total));
        String str = hatchSurveyPage.surveyId;
        if (str.length() > 0) {
            c0924AIaA0u.put("survey_id", str);
        }
        String str2 = hatchSurveyPage.attemptId;
        if (str2.length() > 0) {
            c0924AIaA0u.put("attempt_id", str2);
        }
        Integer num = hatchSurveyPage.pageOrdinal;
        if (num != null) {
            c0924AIaA0u.put("page_ordinal", String.valueOf(num.intValue()));
        }
        return AIW.A0K(c0924AIaA0u);
    }

    private final Map<String, String> questionMetadata(HatchSurveyPage hatchSurveyPage) {
        C0924AIa c0924AIaA0u = C3cG.A0u();
        c0924AIaA0u.putAll(INSTANCE.pageMetadata(hatchSurveyPage));
        AHD<HatchSurveyQuestion> ahd = hatchSurveyPage.questions;
        if (!ahd.isEmpty()) {
            c0924AIaA0u.put("question_id", AbstractC0878AGe.A0L(",", "", "", ahd, HatchSurveyLogger$questionMetadata$1$1.INSTANCE));
            c0924AIaA0u.put("question_kind", AbstractC0878AGe.A0L(",", "", "", ahd, HatchSurveyLogger$questionMetadata$1$2.INSTANCE));
        }
        return AIW.A0K(c0924AIaA0u);
    }

    public final void logSubmitClick(HatchSurveyPage hatchSurveyPage, List<HatchSurveyAnswer> list, boolean z) {
        AnonymousClass003.A0u(hatchSurveyPage, list);
        HatchInteractionLogger.INSTANCE.logClick(HatchSurface.SURVEY, HatchSubsurface.SURVEY, HatchScreen.SURVEY, z ? HatchComponent.SURVEY_SUBMIT_BUTTON : HatchComponent.SURVEY_NEXT_BUTTON, null, AGH.A02(pageMetadata(hatchSurveyPage), answerMetadata(hatchSurveyPage, list)), null);
    }
}
