package com.facebook.aura.explore.view;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.C20Z;
import X.C22I;
import X.C3UX;
import X.C7384Etj;
import X.EnumC10460Hji;
import X.G0V;
import X.HtJ;
import X.Hwg;
import android.view.View;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.R;
import com.facebook.aura.explore.model.HatchExploreViewModel;
import com.facebook.aura.explore.repo.IdeaFeedback;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.navigation.LaunchFlag;
import com.facebook.aura.navigation.key.ConversationTabScreenKey;
import com.facebook.aura.toast.api.ToastApi;
import com.facebook.aura.vds.compose.icons.AuraIconSize;
import com.facebook.aura.vds.compose.theme.root.mode.AuraThemeMode;
import com.facebook.aura.vds.compose.toast.AuraToastOption;
import com.facebook.aura.vds.toast.AuraToast;
import kotlin.KotlinNothingValueException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.explore.view.HatchIdeasTabScreenKt$HatchIdeasTabScreen$3$1", f = "HatchIdeasTabScreen.kt", l = {198}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
public final class HatchIdeasTabScreenKt$HatchIdeasTabScreen$3$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
    public final /* synthetic */ MutableState<String> $dismissedIdeaCardId;
    public final /* synthetic */ String $executionFailedMessage;
    public final /* synthetic */ String $feedbackFailedMessage;
    public final /* synthetic */ String $feedbackSubmittedMessage;
    public final /* synthetic */ String $feedbackUpSubtitle;
    public final /* synthetic */ String $feedbackUpTitle;
    public final /* synthetic */ String $giveFeedbackLabel;
    public final /* synthetic */ String $ideaDismissedMessage;
    public final /* synthetic */ AuraNavigator $navigator;
    public final /* synthetic */ MutableState<String> $reasonPromptCardId$delegate;
    public final /* synthetic */ HatchExploreViewModel $viewModel;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchIdeasTabScreenKt$HatchIdeasTabScreen$3$1(HatchExploreViewModel hatchExploreViewModel, AuraNavigator auraNavigator, MutableState<String> mutableState, String str, String str2, String str3, String str4, String str5, String str6, String str7, MutableState<String> mutableState2, HtJ<? super HatchIdeasTabScreenKt$HatchIdeasTabScreen$3$1> htJ) {
        super(2, htJ);
        this.$viewModel = hatchExploreViewModel;
        this.$navigator = auraNavigator;
        this.$dismissedIdeaCardId = mutableState;
        this.$giveFeedbackLabel = str;
        this.$ideaDismissedMessage = str2;
        this.$executionFailedMessage = str3;
        this.$feedbackUpTitle = str4;
        this.$feedbackSubmittedMessage = str5;
        this.$feedbackUpSubtitle = str6;
        this.$feedbackFailedMessage = str7;
        this.$reasonPromptCardId$delegate = mutableState2;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new HatchIdeasTabScreenKt$HatchIdeasTabScreen$3$1(this.$viewModel, this.$navigator, this.$dismissedIdeaCardId, this.$giveFeedbackLabel, this.$ideaDismissedMessage, this.$executionFailedMessage, this.$feedbackUpTitle, this.$feedbackSubmittedMessage, this.$feedbackUpSubtitle, this.$feedbackFailedMessage, this.$reasonPromptCardId$delegate, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            C22I<HatchExploreViewModel.IdeasEffect> c22i = this.$viewModel.ideasEffect;
            final AuraNavigator auraNavigator = this.$navigator;
            final MutableState<String> mutableState = this.$dismissedIdeaCardId;
            final String str = this.$giveFeedbackLabel;
            final String str2 = this.$ideaDismissedMessage;
            final String str3 = this.$executionFailedMessage;
            final String str4 = this.$feedbackUpTitle;
            final String str5 = this.$feedbackSubmittedMessage;
            final String str6 = this.$feedbackUpSubtitle;
            final String str7 = this.$feedbackFailedMessage;
            final MutableState<String> mutableState2 = this.$reasonPromptCardId$delegate;
            C20Z<? super HatchExploreViewModel.IdeasEffect> c20z = new C20Z() { // from class: com.facebook.aura.explore.view.HatchIdeasTabScreenKt$HatchIdeasTabScreen$3$1.1
                @Override // X.C20Z
                public /* bridge */ /* synthetic */ Object emit(Object obj2, HtJ htJ) {
                    return emit((HatchExploreViewModel.IdeasEffect) obj2, (HtJ<? super Unit>) htJ);
                }

                public final Object emit(HatchExploreViewModel.IdeasEffect ideasEffect, HtJ<? super Unit> htJ) {
                    ToastApi toastApi;
                    String str8;
                    String str9;
                    String str10;
                    int i2;
                    AuraToast.ToastArgs toastArgs;
                    if (C7384Etj.areEqual(ideasEffect, HatchExploreViewModel.IdeasEffect.NavigateToChat.INSTANCE)) {
                        AuraNavigator auraNavigator2 = auraNavigator;
                        ConversationTabScreenKey conversationTabScreenKey = ConversationTabScreenKey.INSTANCE;
                        auraNavigator2.popToTabRoot(conversationTabScreenKey);
                        auraNavigator.navigate(conversationTabScreenKey, LaunchFlag.BRING_TO_FRONT);
                    } else if (!(ideasEffect instanceof HatchExploreViewModel.IdeasEffect.DismissChatDetail)) {
                        if (ideasEffect instanceof HatchExploreViewModel.IdeasEffect.IdeaRejected) {
                            final String str11 = ((HatchExploreViewModel.IdeasEffect.IdeaRejected) ideasEffect).ideaCardId;
                            mutableState.Af8(str11);
                            AuraIconSize auraIconSize = AuraIconSize.SMALL;
                            AuraToast.Duration duration = AuraToast.Duration.LONG;
                            AuraToastOption.Button button = new AuraToastOption.Button(str, null, false, true);
                            final AuraNavigator auraNavigator3 = auraNavigator;
                            final MutableState<String> mutableState3 = mutableState2;
                            toastArgs = new AuraToast.ToastArgs(str2, null, duration, new Integer(R.drawable.aura_thumbs_down), button, new View.OnClickListener() { // from class: com.facebook.aura.explore.view.HatchIdeasTabScreenKt.HatchIdeasTabScreen.3.1.1.1
                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view) {
                                    HatchIdeasTabScreenKt.logIdeaDismissedGiveFeedbackClick(str11);
                                    auraNavigator3.dismissBottomSheetStack(Integer.MAX_VALUE);
                                    mutableState3.Af8(str11);
                                }
                            }, true, null, AuraThemeMode.DEFAULT, null, null, false, false, null, null, null, auraIconSize, null);
                        } else {
                            if (C7384Etj.areEqual(ideasEffect, HatchExploreViewModel.IdeasEffect.ExecutionFailed.INSTANCE)) {
                                toastApi = ToastApi.INSTANCE;
                                str8 = str3;
                            } else if (ideasEffect instanceof HatchExploreViewModel.IdeasEffect.FeedbackSubmitted) {
                                if (AnonymousClass002.A1Z(((HatchExploreViewModel.IdeasEffect.FeedbackSubmitted) ideasEffect).feedback, IdeaFeedback.UP)) {
                                    str9 = str4;
                                    str10 = str6;
                                    i2 = R.drawable.aura_thumbs_up;
                                } else {
                                    str9 = str5;
                                    str10 = null;
                                    i2 = R.drawable.aura_thumbs_down;
                                }
                                toastArgs = new AuraToast.ToastArgs(str9, str10, AuraToast.Duration.SHORT, new Integer(i2), AuraToastOption.None.INSTANCE, null, false, null, AuraThemeMode.DEFAULT, null, null, false, false, null, null, null, AuraIconSize.SMALL, null);
                            } else if (C7384Etj.areEqual(ideasEffect, HatchExploreViewModel.IdeasEffect.FeedbackFailed.INSTANCE)) {
                                toastApi = ToastApi.INSTANCE;
                                str8 = str7;
                            } else {
                                throw new NoWhenBranchMatchedException();
                            }
                            toastApi.showToast(str8);
                        }
                        ToastApi._toasts.AhV(toastArgs);
                    }
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
        return ((HatchIdeasTabScreenKt$HatchIdeasTabScreen$3$1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
