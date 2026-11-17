package com.facebook.aura.explore.view;

import X.AbstractC7559F3s;
import X.AnonymousClass006;
import X.C9hr;
import X.F0C;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.explore.repo.IdeaCardsModelsKt;
import com.facebook.aura.feedback.FeedbackEntityType;
import com.facebook.aura.feedback.FeedbackVerdict;
import com.facebook.aura.feedback.view.IdeaFeedbackAnalytics;
import com.facebook.aura.navigation.AuraNavKey;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.navigation.key.FeedbackWriteSheetKey;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchIdeasTabScreenKt$HatchIdeasTabScreen$7$3$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ String $ideaCardId;
    public final /* synthetic */ AuraNavigator $navigator;
    public final /* synthetic */ MutableState<String> $reasonPromptCardId$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchIdeasTabScreenKt$HatchIdeasTabScreen$7$3$1(String str, AuraNavigator auraNavigator, MutableState<String> mutableState) {
        super(0);
        this.$ideaCardId = str;
        this.$navigator = auraNavigator;
        this.$reasonPromptCardId$delegate = mutableState;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        IdeaFeedbackAnalytics.INSTANCE.logWriteSomethingClick(this.$ideaCardId);
        this.$reasonPromptCardId$delegate.Af8(null);
        AuraNavigator auraNavigator = this.$navigator;
        F0C<C9hr<Object>>[] f0cArr = FeedbackWriteSheetKey.$childSerializers;
        auraNavigator.navigate((AuraNavKey) new FeedbackWriteSheetKey(FeedbackEntityType.IDEA, this.$ideaCardId, FeedbackVerdict.DOWN.getWireValue(), IdeaCardsModelsKt.IDEA_FEEDBACK_SURFACE, AnonymousClass006.A10(IdeaCardsModelsKt.IDEA_FEEDBACK_LANE_KEY, "explore")), false);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
