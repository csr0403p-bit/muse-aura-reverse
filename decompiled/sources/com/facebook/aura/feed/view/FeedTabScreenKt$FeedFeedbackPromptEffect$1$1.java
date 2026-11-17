package com.facebook.aura.feed.view;

import X.AbstractC07127nr;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.C1BO;
import X.C20Z;
import X.C22I;
import X.C3UX;
import X.EnumC10460Hji;
import X.G0U;
import X.G0V;
import X.HtJ;
import X.Hwg;
import android.content.Context;
import com.facebook.aura.R;
import com.facebook.aura.feed.model.FeedFeedbackPrompt;
import com.facebook.aura.feed.model.FeedViewModel;
import com.facebook.aura.feedback.view.FeedbackToastsKt;
import kotlin.KotlinNothingValueException;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;

@DebugMetadata(c = "com.facebook.aura.feed.view.FeedTabScreenKt$FeedFeedbackPromptEffect$1$1", f = "FeedTabScreen.kt", l = {1255}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
public final class FeedTabScreenKt$FeedFeedbackPromptEffect$1$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
    public final /* synthetic */ Context $context;
    public final /* synthetic */ C1BO<G0U<String, Unit>> $currentOnPrompt$delegate;
    public final /* synthetic */ FeedViewModel $viewModel;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public FeedTabScreenKt$FeedFeedbackPromptEffect$1$1(FeedViewModel feedViewModel, Context context, C1BO<? extends G0U<? super String, Unit>> c1bo, HtJ<? super FeedTabScreenKt$FeedFeedbackPromptEffect$1$1> htJ) {
        super(2, htJ);
        this.$viewModel = feedViewModel;
        this.$context = context;
        this.$currentOnPrompt$delegate = c1bo;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new FeedTabScreenKt$FeedFeedbackPromptEffect$1$1(this.$viewModel, this.$context, this.$currentOnPrompt$delegate, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            C22I<FeedFeedbackPrompt> c22i = this.$viewModel.feedbackPromptEvents;
            final Context context = this.$context;
            final C1BO<G0U<String, Unit>> c1bo = this.$currentOnPrompt$delegate;
            C20Z<? super FeedFeedbackPrompt> c20z = new C20Z() { // from class: com.facebook.aura.feed.view.FeedTabScreenKt$FeedFeedbackPromptEffect$1$1.1

                /* renamed from: com.facebook.aura.feed.view.FeedTabScreenKt$FeedFeedbackPromptEffect$1$1$1$1, reason: invalid class name and collision with other inner class name */
                public final class C01521 extends AbstractC7559F3s implements Function0<Unit> {
                    public final /* synthetic */ C1BO<G0U<String, Unit>> $currentOnPrompt$delegate;
                    public final /* synthetic */ FeedFeedbackPrompt $prompt;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    public C01521(FeedFeedbackPrompt feedFeedbackPrompt, C1BO<? extends G0U<? super String, Unit>> c1bo) {
                        super(0);
                        this.$prompt = feedFeedbackPrompt;
                        this.$currentOnPrompt$delegate = c1bo;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                        C1BO.A0B(this.$currentOnPrompt$delegate).invoke(this.$prompt.unitId);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public /* bridge */ /* synthetic */ Unit invoke() {
                        invoke2();
                        return Unit.INSTANCE;
                    }
                }

                @Override // X.C20Z
                public /* bridge */ /* synthetic */ Object emit(Object obj2, HtJ htJ) {
                    return emit((FeedFeedbackPrompt) obj2, (HtJ<? super Unit>) htJ);
                }

                public final Object emit(FeedFeedbackPrompt feedFeedbackPrompt, HtJ<? super Unit> htJ) {
                    FeedbackToastsKt.showFeedbackPromptToast(context.getString(R.string._name_removed__res_0x7f120273), new Integer(R.drawable.aura_thumbs_down), new C01521(feedFeedbackPrompt, c1bo));
                    return Unit.INSTANCE;
                }
            };
            this.label = 1;
            if (c22i.collect(c20z, this) == enumC10460Hji) {
                return enumC10460Hji;
            }
        } else {
            if (i != 1) {
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(obj);
        }
        throw new KotlinNothingValueException();
    }

    @Override // X.G0V
    public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
        return ((FeedTabScreenKt$FeedFeedbackPromptEffect$1$1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
