package com.facebook.aura.explore.view;

import X.AbstractC7559F3s;
import X.C7384Etj;
import X.G0U;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.explore.model.HatchExploreViewModel;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class HatchIdeasTabScreenKt$HatchIdeasTabScreen$finishDismissal$1$1 extends AbstractC7559F3s implements G0U<String, Unit> {
    public final /* synthetic */ MutableState<String> $dismissedIdeaCardId;
    public final /* synthetic */ MutableState<String> $swipingIdeaCardId;
    public final /* synthetic */ HatchExploreViewModel $viewModel;

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(String str) {
        C7384Etj.A0Y(str, 0);
        this.$viewModel.removeIdea(str);
        if (C7384Etj.areEqual(this.$swipingIdeaCardId.getValue(), str)) {
            this.$swipingIdeaCardId.Af8(null);
        }
        if (C7384Etj.areEqual(this.$dismissedIdeaCardId.getValue(), str)) {
            this.$dismissedIdeaCardId.Af8(null);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchIdeasTabScreenKt$HatchIdeasTabScreen$finishDismissal$1$1(HatchExploreViewModel hatchExploreViewModel, MutableState<String> mutableState, MutableState<String> mutableState2) {
        super(1);
        this.$viewModel = hatchExploreViewModel;
        this.$swipingIdeaCardId = mutableState;
        this.$dismissedIdeaCardId = mutableState2;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(String str) {
        invoke2(str);
        return Unit.INSTANCE;
    }
}
