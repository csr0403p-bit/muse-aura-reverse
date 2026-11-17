package com.facebook.aura.feed.view;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.C1BO;
import X.C3UX;
import X.G0V;
import X.HtJ;
import X.Hwg;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.feed.model.FeedViewModel;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.feed.view.FeedTabScreenKt$FeedNavigationEffects$5$1", f = "FeedTabScreen.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
public final class FeedTabScreenKt$FeedNavigationEffects$5$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
    public final /* synthetic */ MutableState<Boolean> $anchoredUnitHasBeenSeen$delegate;
    public final /* synthetic */ String $anchoredUnitId;
    public final /* synthetic */ C1BO<Boolean> $isAnchoredUnitVisible$delegate;
    public final /* synthetic */ FeedViewModel $viewModel;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FeedTabScreenKt$FeedNavigationEffects$5$1(String str, FeedViewModel feedViewModel, C1BO<Boolean> c1bo, MutableState<Boolean> mutableState, HtJ<? super FeedTabScreenKt$FeedNavigationEffects$5$1> htJ) {
        super(2, htJ);
        this.$anchoredUnitId = str;
        this.$viewModel = feedViewModel;
        this.$isAnchoredUnitVisible$delegate = c1bo;
        this.$anchoredUnitHasBeenSeen$delegate = mutableState;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new FeedTabScreenKt$FeedNavigationEffects$5$1(this.$anchoredUnitId, this.$viewModel, this.$isAnchoredUnitVisible$delegate, this.$anchoredUnitHasBeenSeen$delegate, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        if (this.label != 0) {
            throw AnonymousClass001.A0n();
        }
        Hwg.A00(obj);
        if (this.$anchoredUnitId != null) {
            boolean zA0F = C1BO.A0F(this.$isAnchoredUnitVisible$delegate);
            MutableState<Boolean> mutableState = this.$anchoredUnitHasBeenSeen$delegate;
            if (zA0F) {
                MutableState.A09(true, mutableState);
            } else if (MutableState.A0A((MutableState) mutableState)) {
                this.$viewModel.onAnchoredUnitScrolledAway();
            }
        }
        return Unit.INSTANCE;
    }

    @Override // X.G0V
    public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
        return ((FeedTabScreenKt$FeedNavigationEffects$5$1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
