package com.facebook.aura.conversation.view;

import X.AHD;
import X.AbstractC07127nr;
import X.AbstractC0878AGe;
import X.AbstractC3358CGz;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass003;
import X.AnonymousClass007;
import X.C3UX;
import X.EnumC10460Hji;
import X.G0V;
import X.HtJ;
import X.Hwg;
import X.HxE;
import android.content.Context;
import android.view.View;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.R;
import com.facebook.aura.analytics.hatch.HatchComponent;
import com.facebook.aura.analytics.hatch.HatchInteractionLogger;
import com.facebook.aura.analytics.hatch.HatchScreen;
import com.facebook.aura.analytics.hatch.HatchSubsurface;
import com.facebook.aura.analytics.hatch.HatchSurface;
import com.facebook.aura.conversation.repo.HatchFeedbackApi;
import com.facebook.aura.gateway.store.HatchGatewayPrefsStore;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.vds.compose.icons.AuraIconSize;
import com.facebook.aura.vds.compose.theme.root.mode.AuraThemeMode;
import com.facebook.aura.vds.compose.toast.AuraToastOption;
import com.facebook.aura.vds.toast.AuraToast;
import com.facebook.aura.vmbrowser.runtime.BrowserSessionControllerKt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchFeedbackSheetKt$HatchFeedbackSheet$2$1$1$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ MutableState<String> $comment$delegate;
    public final /* synthetic */ Context $context;
    public final /* synthetic */ MutableState<Boolean> $didSubmitSucceed$delegate;
    public final /* synthetic */ AHD<String> $feedbackOptions;
    public final /* synthetic */ MutableState<Boolean> $isSubmitting$delegate;
    public final /* synthetic */ String $messageId;
    public final /* synthetic */ FeedbackMode $mode;
    public final /* synthetic */ AuraNavigator $navigator;
    public final /* synthetic */ C3UX $scope;
    public final /* synthetic */ MutableState<Set<Integer>> $selectedIndices$delegate;
    public final /* synthetic */ View $toastParentView;
    public final /* synthetic */ AbstractC3358CGz $userSession;

    @DebugMetadata(c = "com.facebook.aura.conversation.view.HatchFeedbackSheetKt$HatchFeedbackSheet$2$1$1$1$1", f = "HatchFeedbackSheet.kt", l = {166}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.conversation.view.HatchFeedbackSheetKt$HatchFeedbackSheet$2$1$1$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ MutableState<String> $comment$delegate;
        public final /* synthetic */ Context $context;
        public final /* synthetic */ MutableState<Boolean> $didSubmitSucceed$delegate;
        public final /* synthetic */ MutableState<Boolean> $isSubmitting$delegate;
        public final /* synthetic */ String $messageId;
        public final /* synthetic */ FeedbackMode $mode;
        public final /* synthetic */ AuraNavigator $navigator;
        public final /* synthetic */ List<String> $selectedOptions;
        public final /* synthetic */ View $toastParentView;
        public final /* synthetic */ AbstractC3358CGz $userSession;
        public Object L$0;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(AbstractC3358CGz abstractC3358CGz, String str, FeedbackMode feedbackMode, List<String> list, View view, Context context, AuraNavigator auraNavigator, MutableState<String> mutableState, MutableState<Boolean> mutableState2, MutableState<Boolean> mutableState3, HtJ<? super AnonymousClass1> htJ) {
            super(2, htJ);
            this.$userSession = abstractC3358CGz;
            this.$messageId = str;
            this.$mode = feedbackMode;
            this.$selectedOptions = list;
            this.$toastParentView = view;
            this.$context = context;
            this.$navigator = auraNavigator;
            this.$comment$delegate = mutableState;
            this.$didSubmitSucceed$delegate = mutableState2;
            this.$isSubmitting$delegate = mutableState3;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new AnonymousClass1(this.$userSession, this.$messageId, this.$mode, this.$selectedOptions, this.$toastParentView, this.$context, this.$navigator, this.$comment$delegate, this.$didSubmitSucceed$delegate, this.$isSubmitting$delegate, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            Object objSubmitFeedback = obj;
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(objSubmitFeedback);
                String hatcheryVMId = HatchGatewayPrefsStore.Companion.getInstance(this.$userSession).getHatcheryVMId();
                HatchFeedbackApi hatchFeedbackApi = HatchFeedbackApi.INSTANCE;
                String str = this.$messageId;
                int i2 = this.$mode == FeedbackMode.GOOD ? 1 : -1;
                String strA0L = AbstractC0878AGe.A0L(",", "", "", this.$selectedOptions, null);
                if (strA0L.length() == 0) {
                    strA0L = null;
                }
                String strA06 = MutableState.A06((MutableState) this.$comment$delegate);
                String str2 = strA06.length() != 0 ? strA06 : null;
                this.L$0 = null;
                this.label = 1;
                objSubmitFeedback = hatchFeedbackApi.submitFeedback(str, i2, strA0L, str2, hatcheryVMId, this);
                if (objSubmitFeedback == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(objSubmitFeedback);
            }
            if (AnonymousClass001.A1X(objSubmitFeedback)) {
                MutableState.A09(true, this.$didSubmitSucceed$delegate);
                AuraToast auraToastM3114makeKDArT4I = AuraToast.Companion.m3114makeKDArT4I(this.$toastParentView, this.$context.getString(R.string._name_removed__res_0x7f1209dc), null, AuraToast.Duration.SHORT, new Integer(R.drawable.meta_brand_design_system_icons_vector_checkmark_circle_outline_24), AuraToastOption.None.INSTANCE, null, false, null, AuraThemeMode.DEFAULT, null, null, false, false, null, null, null, AuraIconSize.MEDIUM, null);
                if (auraToastM3114makeKDArT4I != null) {
                    auraToastM3114makeKDArT4I.show();
                }
                this.$navigator.back();
            } else {
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
    public HatchFeedbackSheetKt$HatchFeedbackSheet$2$1$1$1(FeedbackMode feedbackMode, C3UX c3ux, MutableState<Boolean> mutableState, MutableState<Set<Integer>> mutableState2, AHD<String> ahd, AbstractC3358CGz abstractC3358CGz, String str, View view, Context context, AuraNavigator auraNavigator, MutableState<String> mutableState3, MutableState<Boolean> mutableState4) {
        super(0);
        this.$mode = feedbackMode;
        this.$scope = c3ux;
        this.$isSubmitting$delegate = mutableState;
        this.$selectedIndices$delegate = mutableState2;
        this.$feedbackOptions = ahd;
        this.$userSession = abstractC3358CGz;
        this.$messageId = str;
        this.$toastParentView = view;
        this.$context = context;
        this.$navigator = auraNavigator;
        this.$comment$delegate = mutableState3;
        this.$didSubmitSucceed$delegate = mutableState4;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        if (MutableState.A0A((MutableState) this.$isSubmitting$delegate)) {
            return;
        }
        MutableState.A09(true, this.$isSubmitting$delegate);
        List listA0W = AbstractC0878AGe.A0W(this.$selectedIndices$delegate.getValue());
        AHD<String> ahd = this.$feedbackOptions;
        ArrayList arrayListA0i = AnonymousClass003.A0i(listA0W);
        Iterator it = listA0W.iterator();
        while (it.hasNext()) {
            arrayListA0i.add(ahd.get(AnonymousClass001.A0F(it.next())));
        }
        HatchInteractionLogger.INSTANCE.logClick(HatchSurface.CHAT, HatchSubsurface.RESPONSE_TOOLBAR, HatchScreen.MAIN_CHAT, HatchComponent.FEEDBACK_FORM, null, AnonymousClass007.A0d("reasons", AbstractC0878AGe.A0L(",", "", "", arrayListA0i, null), new HxE(BrowserSessionControllerKt.WEBSOCKIFY_MODE_PARAM, this.$mode == FeedbackMode.GOOD ? "good" : "bad")), null);
        AnonymousClass001.A1J(new AnonymousClass1(this.$userSession, this.$messageId, this.$mode, arrayListA0i, this.$toastParentView, this.$context, this.$navigator, this.$comment$delegate, this.$didSubmitSucceed$delegate, this.$isSubmitting$delegate, null), this.$scope);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
