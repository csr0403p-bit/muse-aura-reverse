package com.facebook.aura.survey;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.AnonymousClass003;
import X.C3UX;
import X.C3cI;
import X.C60O;
import X.C9jH;
import X.CFK;
import X.EnumC10460Hji;
import X.FGI;
import X.G0V;
import X.GAo;
import X.HsJ;
import X.HtJ;
import X.Hwg;
import com.facebook.aura.json.ClockCardWireActionsKt;
import com.facebook.aura.json.NetworkException;
import com.facebook.aura.network.http.HatchHttpApi;
import com.facebook.aura.network.http.RequestType;
import com.facebook.aura.network.stefi.AuraStefiClient;
import com.facebook.aura.survey.SurveyStefiPath;
import com.facebook.aura.widgets.WidgetComponentsKt;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* loaded from: classes4.dex */
public final class HatchSurveyApi {
    public static final int $stable = 0;
    public static final HatchSurveyApi INSTANCE = new HatchSurveyApi();
    public static final String TAG = "HatchSurveyApi";

    @DebugMetadata(c = "com.facebook.aura.survey.HatchSurveyApi$dismiss$2", f = "HatchSurveyApi.kt", l = {100}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.survey.HatchSurveyApi$dismiss$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Boolean>, Object> {
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public Object L$4;
        public int label;

        public AnonymousClass2(HtJ<? super AnonymousClass2> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new AnonymousClass2(htJ);
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Boolean> htJ) {
            return new AnonymousClass2(htJ).invokeSuspend(Unit.INSTANCE);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            Object objM1596executeBodylessStefiRequestWithtZkwj4A;
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                HatchHttpApi hatchHttpApiA06 = C60O.A06(obj);
                SurveyStefiPath.SurveyDismiss surveyDismiss = SurveyStefiPath.SurveyDismiss.INSTANCE;
                RequestType requestType = RequestType.POST;
                C9jH c9jH = C9jH.A00;
                HatchSurveyApi$dismiss$2$invokeSuspend$$inlined$executeStefiRequestbMdYcbs$default$1 hatchSurveyApi$dismiss$2$invokeSuspend$$inlined$executeStefiRequestbMdYcbs$default$1 = HatchSurveyApi$dismiss$2$invokeSuspend$$inlined$executeStefiRequestbMdYcbs$default$1.INSTANCE;
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = null;
                this.L$3 = null;
                this.L$4 = null;
                this.label = 1;
                objM1596executeBodylessStefiRequestWithtZkwj4A = hatchHttpApiA06.m1596executeBodylessStefiRequestWithtZkwj4A(hatchSurveyApi$dismiss$2$invokeSuspend$$inlined$executeStefiRequestbMdYcbs$default$1, false, surveyDismiss, requestType, null, null, c9jH, c9jH, this);
                if (objM1596executeBodylessStefiRequestWithtZkwj4A == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                objM1596executeBodylessStefiRequestWithtZkwj4A = AnonymousClass001.A0q(obj);
            }
            Throwable thA00 = HsJ.A00(objM1596executeBodylessStefiRequestWithtZkwj4A);
            if (thA00 == null) {
                return Boolean.valueOf(((SurveyDismissResponseJson) objM1596executeBodylessStefiRequestWithtZkwj4A).dismissed);
            }
            HatchSurveyApi.INSTANCE.logRequestFailure(ClockCardWireActionsKt.CLOCK_ACTION_DISMISS, thA00);
            return false;
        }
    }

    @DebugMetadata(c = "com.facebook.aura.survey.HatchSurveyApi$next$2", f = "HatchSurveyApi.kt", l = {107}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.survey.HatchSurveyApi$next$2, reason: invalid class name and case insensitive filesystem */
    public final class C142232 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super HatchSurveyNextResult>, Object> {
        public final /* synthetic */ List<HatchSurveyAnswer> $answers;
        public final /* synthetic */ String $pageId;
        public int I$0;
        public int I$1;
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public Object L$4;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C142232(String str, List<HatchSurveyAnswer> list, HtJ<? super C142232> htJ) {
            super(2, htJ);
            this.$pageId = str;
            this.$answers = list;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new C142232(this.$pageId, this.$answers, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            Object objM1604executeStefiRequestWithjLovISM;
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                HatchHttpApi hatchHttpApiA06 = C60O.A06(obj);
                SurveyStefiPath.SurveyNext surveyNext = SurveyStefiPath.SurveyNext.INSTANCE;
                String str = this.$pageId;
                List<HatchSurveyAnswer> list = this.$answers;
                ArrayList arrayListA0i = AnonymousClass003.A0i(list);
                for (HatchSurveyAnswer hatchSurveyAnswer : list) {
                    arrayListA0i.add(new SurveyAnswerJson(hatchSurveyAnswer.questionId, hatchSurveyAnswer.value));
                }
                SurveyNextRequestJson surveyNextRequestJson = new SurveyNextRequestJson(str, arrayListA0i);
                RequestType requestType = RequestType.POST;
                C9jH c9jH = C9jH.A00;
                HatchSurveyApi$next$2$invokeSuspend$$inlined$executeStefiRequesttZkwj4A$default$1 hatchSurveyApi$next$2$invokeSuspend$$inlined$executeStefiRequesttZkwj4A$default$1 = HatchSurveyApi$next$2$invokeSuspend$$inlined$executeStefiRequesttZkwj4A$default$1.INSTANCE;
                HatchSurveyApi$next$2$invokeSuspend$$inlined$executeStefiRequesttZkwj4A$default$2 hatchSurveyApi$next$2$invokeSuspend$$inlined$executeStefiRequesttZkwj4A$default$2 = HatchSurveyApi$next$2$invokeSuspend$$inlined$executeStefiRequesttZkwj4A$default$2.INSTANCE;
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = null;
                this.L$3 = null;
                this.L$4 = null;
                this.I$0 = 1;
                this.I$1 = 0;
                this.label = 1;
                objM1604executeStefiRequestWithjLovISM = hatchHttpApiA06.m1604executeStefiRequestWithjLovISM(hatchSurveyApi$next$2$invokeSuspend$$inlined$executeStefiRequesttZkwj4A$default$1, hatchSurveyApi$next$2$invokeSuspend$$inlined$executeStefiRequesttZkwj4A$default$2, false, surveyNext, surveyNextRequestJson, requestType, c9jH, true, null, false, null, this);
                if (objM1604executeStefiRequestWithjLovISM == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                objM1604executeStefiRequestWithjLovISM = AnonymousClass001.A0q(obj);
            }
            Throwable thA00 = HsJ.A00(objM1604executeStefiRequestWithjLovISM);
            if (thA00 == null) {
                return ((SurveyNextResponseJson) objM1604executeStefiRequestWithjLovISM).toDomain();
            }
            HatchSurveyApi.INSTANCE.logRequestFailure("next", thA00);
            return null;
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super HatchSurveyNextResult> htJ) {
            return ((C142232) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.survey.HatchSurveyApi$start$2", f = "HatchSurveyApi.kt", l = {100}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.survey.HatchSurveyApi$start$2, reason: invalid class name and case insensitive filesystem */
    public final class C142242 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super HatchSurveyStartResult>, Object> {
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public Object L$4;
        public int label;

        public C142242(HtJ<? super C142242> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new C142242(htJ);
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super HatchSurveyStartResult> htJ) {
            return new C142242(htJ).invokeSuspend(Unit.INSTANCE);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            Object objM1596executeBodylessStefiRequestWithtZkwj4A;
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                if (!AuraStefiClient.INSTANCE.hasAuth()) {
                    CFK.A04(HatchSurveyApi.TAG, "start failed: missing access token");
                    return null;
                }
                HatchHttpApi hatchHttpApi = HatchHttpApi.INSTANCE;
                SurveyStefiPath.SurveyStart surveyStart = SurveyStefiPath.SurveyStart.INSTANCE;
                RequestType requestType = RequestType.POST;
                C9jH c9jH = C9jH.A00;
                HatchSurveyApi$start$2$invokeSuspend$$inlined$executeStefiRequestbMdYcbs$default$1 hatchSurveyApi$start$2$invokeSuspend$$inlined$executeStefiRequestbMdYcbs$default$1 = HatchSurveyApi$start$2$invokeSuspend$$inlined$executeStefiRequestbMdYcbs$default$1.INSTANCE;
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = null;
                this.L$3 = null;
                this.L$4 = null;
                this.label = 1;
                objM1596executeBodylessStefiRequestWithtZkwj4A = hatchHttpApi.m1596executeBodylessStefiRequestWithtZkwj4A(hatchSurveyApi$start$2$invokeSuspend$$inlined$executeStefiRequestbMdYcbs$default$1, false, surveyStart, requestType, null, null, c9jH, c9jH, this);
                if (objM1596executeBodylessStefiRequestWithtZkwj4A == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                objM1596executeBodylessStefiRequestWithtZkwj4A = AnonymousClass001.A0q(obj);
            }
            Throwable thA00 = HsJ.A00(objM1596executeBodylessStefiRequestWithtZkwj4A);
            if (thA00 == null) {
                return ((SurveyStartResponseJson) objM1596executeBodylessStefiRequestWithtZkwj4A).toDomain();
            }
            HatchSurveyApi.INSTANCE.logRequestFailure(WidgetComponentsKt.START_PATH, thA00);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void logRequestFailure(String str, Throwable th) {
        NetworkException networkException;
        Integer numValueOf = null;
        if ((th instanceof NetworkException) && (networkException = (NetworkException) th) != null) {
            numValueOf = Integer.valueOf(networkException.httpResponseCode);
        }
        HatchSurveyLogger.INSTANCE.logError(str, numValueOf, numValueOf != null ? FGI.A0H("http_", numValueOf.intValue()) : C3cI.A0Y(th));
    }

    public final Object dismiss(HtJ<? super Boolean> htJ) {
        return GAo.A00(htJ, AnonymousClass001.A0y(), new AnonymousClass2(null));
    }

    public final Object next(String str, List<HatchSurveyAnswer> list, HtJ<? super HatchSurveyNextResult> htJ) {
        return GAo.A00(htJ, AnonymousClass001.A0y(), new C142232(str, list, null));
    }

    public final Object start(HtJ<? super HatchSurveyStartResult> htJ) {
        return GAo.A00(htJ, AnonymousClass001.A0y(), new C142242(null));
    }
}
