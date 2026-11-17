package com.facebook.aura.explore.view;

import X.AbstractC07127nr;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.C20Z;
import X.C22I;
import X.C3UX;
import X.C7384Etj;
import X.EnumC10460Hji;
import X.G0U;
import X.G0V;
import X.HtJ;
import X.Hwg;
import android.content.Context;
import android.widget.Toast;
import com.facebook.aura.explore.model.HatchExploreViewModel;
import com.facebook.aura.navigation.AuraNavKey;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.navigation.LaunchFlag;
import com.facebook.aura.navigation.key.ConversationTabScreenKey;
import com.facebook.aura.navigation.key.ExploreIdeaCardDetailSheetKey;
import kotlin.KotlinNothingValueException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.explore.view.ExploreIdeaCardDetailSheetKt$ExploreIdeaCardDetailSheet$3$1", f = "ExploreIdeaCardDetailSheet.kt", l = {167}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
public final class ExploreIdeaCardDetailSheetKt$ExploreIdeaCardDetailSheet$3$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
    public final /* synthetic */ String $chatDetailDismissKey;
    public final /* synthetic */ Context $context;
    public final /* synthetic */ String $executionFailedMessage;
    public final /* synthetic */ AuraNavigator $navigator;
    public final /* synthetic */ HatchExploreViewModel $viewModel;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExploreIdeaCardDetailSheetKt$ExploreIdeaCardDetailSheet$3$1(HatchExploreViewModel hatchExploreViewModel, AuraNavigator auraNavigator, String str, Context context, String str2, HtJ<? super ExploreIdeaCardDetailSheetKt$ExploreIdeaCardDetailSheet$3$1> htJ) {
        super(2, htJ);
        this.$viewModel = hatchExploreViewModel;
        this.$navigator = auraNavigator;
        this.$chatDetailDismissKey = str;
        this.$context = context;
        this.$executionFailedMessage = str2;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new ExploreIdeaCardDetailSheetKt$ExploreIdeaCardDetailSheet$3$1(this.$viewModel, this.$navigator, this.$chatDetailDismissKey, this.$context, this.$executionFailedMessage, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            C22I<HatchExploreViewModel.IdeasEffect> c22i = this.$viewModel.ideasEffect;
            final AuraNavigator auraNavigator = this.$navigator;
            final String str = this.$chatDetailDismissKey;
            final Context context = this.$context;
            final String str2 = this.$executionFailedMessage;
            C20Z<? super HatchExploreViewModel.IdeasEffect> c20z = new C20Z() { // from class: com.facebook.aura.explore.view.ExploreIdeaCardDetailSheetKt$ExploreIdeaCardDetailSheet$3$1.1

                /* renamed from: com.facebook.aura.explore.view.ExploreIdeaCardDetailSheetKt$ExploreIdeaCardDetailSheet$3$1$1$1, reason: invalid class name and collision with other inner class name */
                public final class C01481 extends AbstractC7559F3s implements G0U<AuraNavKey, Boolean> {
                    public static final C01481 INSTANCE = new C01481();

                    public C01481() {
                        super(1);
                    }

                    @Override // X.G0U
                    public final Boolean invoke(AuraNavKey auraNavKey) {
                        C7384Etj.A0Y(auraNavKey, 0);
                        return Boolean.valueOf(auraNavKey instanceof ExploreIdeaCardDetailSheetKey);
                    }
                }

                @Override // X.C20Z
                public /* bridge */ /* synthetic */ Object emit(Object obj2, HtJ htJ) {
                    return emit((HatchExploreViewModel.IdeasEffect) obj2, (HtJ<? super Unit>) htJ);
                }

                public final Object emit(HatchExploreViewModel.IdeasEffect ideasEffect, HtJ<? super Unit> htJ) {
                    if (C7384Etj.areEqual(ideasEffect, HatchExploreViewModel.IdeasEffect.NavigateToChat.INSTANCE)) {
                        auraNavigator.popAll(C01481.INSTANCE);
                        AuraNavigator auraNavigator2 = auraNavigator;
                        ConversationTabScreenKey conversationTabScreenKey = ConversationTabScreenKey.INSTANCE;
                        auraNavigator2.popToTabRoot(conversationTabScreenKey);
                        auraNavigator.navigate(conversationTabScreenKey, LaunchFlag.BRING_TO_FRONT);
                    } else if (ideasEffect instanceof HatchExploreViewModel.IdeasEffect.DismissChatDetail) {
                        if (C7384Etj.areEqual(((HatchExploreViewModel.IdeasEffect.DismissChatDetail) ideasEffect).chatDetailDismissKey, str)) {
                            auraNavigator.back();
                        }
                    } else if (C7384Etj.areEqual(ideasEffect, HatchExploreViewModel.IdeasEffect.ExecutionFailed.INSTANCE)) {
                        Toast.makeText(context, str2, 0).show();
                    } else if (!(ideasEffect instanceof HatchExploreViewModel.IdeasEffect.FeedbackSubmitted) && !C7384Etj.areEqual(ideasEffect, HatchExploreViewModel.IdeasEffect.FeedbackFailed.INSTANCE) && !(ideasEffect instanceof HatchExploreViewModel.IdeasEffect.IdeaRejected)) {
                        throw new NoWhenBranchMatchedException();
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
        return ((ExploreIdeaCardDetailSheetKt$ExploreIdeaCardDetailSheet$3$1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
