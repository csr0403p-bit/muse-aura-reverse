package com.facebook.aura.survey;

import X.AbstractC07127nr;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.C0981AMm;
import X.C3UX;
import X.EnumC10460Hji;
import X.G0V;
import X.HtJ;
import X.Hwg;
import android.content.Context;
import android.view.View;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.R;
import com.facebook.aura.navigation.AuraNavigator;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchSurveySheetKt$HatchSurveySheet$4$1$1$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ boolean $canAdvance;
    public final /* synthetic */ MutableState<Boolean> $completed$delegate;
    public final /* synthetic */ Context $context;
    public final /* synthetic */ MutableState<HatchSurveyPage> $currentPage$delegate;
    public final /* synthetic */ C0981AMm<String, String> $freeTextByQuestion;
    public final /* synthetic */ boolean $isSubmitLabel;
    public final /* synthetic */ MutableState<Boolean> $isSubmitting$delegate;
    public final /* synthetic */ AuraNavigator $navigator;
    public final /* synthetic */ C0981AMm<String, String> $numericByQuestion;
    public final /* synthetic */ HatchSurveyPage $page;
    public final /* synthetic */ C3UX $scope;
    public final /* synthetic */ C0981AMm<String, Integer> $selectedByQuestion;
    public final /* synthetic */ View $toastParentView;

    @DebugMetadata(c = "com.facebook.aura.survey.HatchSurveySheetKt$HatchSurveySheet$4$1$1$1$1", f = "HatchSurveySheet.kt", l = {156}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.survey.HatchSurveySheetKt$HatchSurveySheet$4$1$1$1$1, reason: invalid class name */
    /* loaded from: classes4.dex */
    public final class AnonymousClass1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ List<HatchSurveyAnswer> $answers;
        public final /* synthetic */ MutableState<Boolean> $completed$delegate;
        public final /* synthetic */ Context $context;
        public final /* synthetic */ MutableState<HatchSurveyPage> $currentPage$delegate;
        public final /* synthetic */ MutableState<Boolean> $isSubmitting$delegate;
        public final /* synthetic */ AuraNavigator $navigator;
        public final /* synthetic */ HatchSurveyPage $page;
        public final /* synthetic */ View $toastParentView;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(HatchSurveyPage hatchSurveyPage, List<HatchSurveyAnswer> list, View view, Context context, AuraNavigator auraNavigator, MutableState<Boolean> mutableState, MutableState<Boolean> mutableState2, MutableState<HatchSurveyPage> mutableState3, HtJ<? super AnonymousClass1> htJ) {
            super(2, htJ);
            this.$page = hatchSurveyPage;
            this.$answers = list;
            this.$toastParentView = view;
            this.$context = context;
            this.$navigator = auraNavigator;
            this.$isSubmitting$delegate = mutableState;
            this.$completed$delegate = mutableState2;
            this.$currentPage$delegate = mutableState3;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new AnonymousClass1(this.$page, this.$answers, this.$toastParentView, this.$context, this.$navigator, this.$isSubmitting$delegate, this.$completed$delegate, this.$currentPage$delegate, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            HatchSurveyPage hatchSurveyPage;
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                HatchSurveyApi hatchSurveyApi = HatchSurveyApi.INSTANCE;
                String str = this.$page.pageId;
                List<HatchSurveyAnswer> list = this.$answers;
                this.label = 1;
                obj = hatchSurveyApi.next(str, list, this);
                if (obj == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
            }
            HatchSurveyNextResult hatchSurveyNextResult = (HatchSurveyNextResult) obj;
            if (hatchSurveyNextResult == null) {
                MutableState.A09(false, this.$isSubmitting$delegate);
                HatchSurveySheetKt.showToast(this.$toastParentView, this.$context.getString(R.string._name_removed__res_0x7f1210cf));
            } else if (hatchSurveyNextResult.done || (hatchSurveyPage = hatchSurveyNextResult.page) == null) {
                MutableState.A09(true, this.$completed$delegate);
                HatchSurveyLogger.INSTANCE.logComplete(this.$page);
                HatchSurveySheetKt.showToast(this.$toastParentView, this.$context.getString(R.string._name_removed__res_0x7f1210ce));
                this.$navigator.back();
            } else {
                this.$currentPage$delegate.Af8(hatchSurveyPage);
                MutableState.A09(false, this.$isSubmitting$delegate);
            }
            return Unit.INSTANCE;
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ((AnonymousClass1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchSurveySheetKt$HatchSurveySheet$4$1$1$1(boolean z, HatchSurveyPage hatchSurveyPage, C0981AMm<String, Integer> c0981AMm, C0981AMm<String, String> c0981AMm2, C0981AMm<String, String> c0981AMm3, boolean z2, C3UX c3ux, MutableState<Boolean> mutableState, View view, Context context, AuraNavigator auraNavigator, MutableState<Boolean> mutableState2, MutableState<HatchSurveyPage> mutableState3) {
        super(0);
        this.$canAdvance = z;
        this.$page = hatchSurveyPage;
        this.$selectedByQuestion = c0981AMm;
        this.$numericByQuestion = c0981AMm2;
        this.$freeTextByQuestion = c0981AMm3;
        this.$isSubmitLabel = z2;
        this.$scope = c3ux;
        this.$isSubmitting$delegate = mutableState;
        this.$toastParentView = view;
        this.$context = context;
        this.$navigator = auraNavigator;
        this.$completed$delegate = mutableState2;
        this.$currentPage$delegate = mutableState3;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        if (MutableState.A0A((MutableState) this.$isSubmitting$delegate) || !this.$canAdvance) {
            return;
        }
        List<HatchSurveyAnswer> listCollectAnswers = HatchSurveySheetKt.collectAnswers(this.$page.questions, this.$selectedByQuestion, this.$numericByQuestion, this.$freeTextByQuestion);
        HatchSurveyLogger.INSTANCE.logSubmitClick(this.$page, listCollectAnswers, this.$isSubmitLabel);
        MutableState.A09(true, this.$isSubmitting$delegate);
        AnonymousClass001.A1J(new AnonymousClass1(this.$page, listCollectAnswers, this.$toastParentView, this.$context, this.$navigator, this.$isSubmitting$delegate, this.$completed$delegate, this.$currentPage$delegate, null), this.$scope);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
