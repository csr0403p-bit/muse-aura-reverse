package com.facebook.aura.conversation.view;

import X.AbstractC07127nr;
import X.AnonymousClass002;
import X.C1BO;
import X.C3UX;
import X.G0V;
import X.HtJ;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.conversation.repo.LoadingState;
import com.facebook.aura.conversation.viewmodel.HatchThreadsViewModel;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.conversation.view.HatchConversationHistorySidePanelKt$HatchConversationHistorySidePanelContent$6$1", f = "HatchConversationHistorySidePanel.kt", l = {295, 303}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
public final class HatchConversationHistorySidePanelKt$HatchConversationHistorySidePanelContent$6$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
    public final /* synthetic */ LazyListState $activeListState;
    public final /* synthetic */ C1BO<LoadingState> $activeLoadingState$delegate;
    public final /* synthetic */ HatchThreadsViewModel $activeViewModel;
    public final /* synthetic */ LazyListState $archivedListState;
    public final /* synthetic */ C1BO<LoadingState> $archivedLoadingState$delegate;
    public final /* synthetic */ HatchThreadsViewModel $archivedViewModel;
    public final /* synthetic */ MutableState<SidePanelMode> $mode$delegate;
    public int label;

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[SidePanelMode.values().length];
            try {
                AnonymousClass002.A13(SidePanelMode.DEFAULT, iArr);
            } catch (NoSuchFieldError unused) {
            }
            try {
                AnonymousClass002.A14(SidePanelMode.ARCHIVED, iArr);
            } catch (NoSuchFieldError unused2) {
            }
            try {
                AnonymousClass002.A15(SidePanelMode.SEARCH, iArr);
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HatchConversationHistorySidePanelKt$HatchConversationHistorySidePanelContent$6$1(HatchThreadsViewModel hatchThreadsViewModel, LazyListState lazyListState, HatchThreadsViewModel hatchThreadsViewModel2, LazyListState lazyListState2, MutableState<SidePanelMode> mutableState, C1BO<? extends LoadingState> c1bo, C1BO<? extends LoadingState> c1bo2, HtJ<? super HatchConversationHistorySidePanelKt$HatchConversationHistorySidePanelContent$6$1> htJ) {
        super(2, htJ);
        this.$activeViewModel = hatchThreadsViewModel;
        this.$activeListState = lazyListState;
        this.$archivedViewModel = hatchThreadsViewModel2;
        this.$archivedListState = lazyListState2;
        this.$mode$delegate = mutableState;
        this.$activeLoadingState$delegate = c1bo;
        this.$archivedLoadingState$delegate = c1bo2;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new HatchConversationHistorySidePanelKt$HatchConversationHistorySidePanelContent$6$1(this.$activeViewModel, this.$activeListState, this.$archivedViewModel, this.$archivedListState, this.$mode$delegate, this.$activeLoadingState$delegate, this.$archivedLoadingState$delegate, htJ);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x006c A[RETURN] */
    @Override // X.AbstractC8884Fsp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            X.Hji r2 = X.EnumC10460Hji.A02
            int r0 = r6.label
            r5 = 2
            r4 = 1
            r3 = 0
            if (r0 == 0) goto L12
            if (r0 == r4) goto L6d
            if (r0 == r5) goto L6d
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        L12:
            X.Hwg.A00(r7)
            androidx.compose.runtime.MutableState<com.facebook.aura.conversation.view.SidePanelMode> r1 = r6.$mode$delegate
            float r0 = com.facebook.aura.conversation.view.HatchConversationHistorySidePanelKt.SidePanelBottomActionSize
            java.lang.Object r0 = r1.getValue()
            com.facebook.aura.conversation.view.SidePanelMode r0 = (com.facebook.aura.conversation.view.SidePanelMode) r0
            int r0 = r0.ordinal()
            if (r0 == r3) goto L4a
            if (r0 == r4) goto L2f
            if (r0 == r5) goto L70
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L2f:
            X.1BO<com.facebook.aura.conversation.repo.LoadingState> r0 = r6.$archivedLoadingState$delegate
            java.lang.Object r0 = r0.getValue()
            com.facebook.aura.conversation.repo.LoadingState r0 = (com.facebook.aura.conversation.repo.LoadingState) r0
            boolean r0 = com.facebook.aura.conversation.view.HatchConversationHistorySidePanelKt.isRefreshComplete(r0)
            if (r0 == 0) goto L70
            com.facebook.aura.conversation.viewmodel.HatchThreadsViewModel r0 = r6.$archivedViewModel
            boolean r0 = r0.consumeInitialScrollReset()
            if (r0 == 0) goto L70
            androidx.compose.foundation.lazy.LazyListState r1 = r6.$archivedListState
            r6.label = r5
            goto L64
        L4a:
            X.1BO<com.facebook.aura.conversation.repo.LoadingState> r0 = r6.$activeLoadingState$delegate
            java.lang.Object r0 = r0.getValue()
            com.facebook.aura.conversation.repo.LoadingState r0 = (com.facebook.aura.conversation.repo.LoadingState) r0
            boolean r0 = com.facebook.aura.conversation.view.HatchConversationHistorySidePanelKt.isRefreshComplete(r0)
            if (r0 == 0) goto L70
            com.facebook.aura.conversation.viewmodel.HatchThreadsViewModel r0 = r6.$activeViewModel
            boolean r0 = r0.consumeInitialScrollReset()
            if (r0 == 0) goto L70
            androidx.compose.foundation.lazy.LazyListState r1 = r6.$activeListState
            r6.label = r4
        L64:
            X.AFs<androidx.compose.foundation.lazy.LazyListState, ?> r0 = androidx.compose.foundation.lazy.LazyListState.A0Q
            java.lang.Object r0 = r1.A06(r3, r3, r6)
            if (r0 != r2) goto L70
            return r2
        L6d:
            X.Hwg.A00(r7)
        L70:
            kotlin.Unit r2 = kotlin.Unit.INSTANCE
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.conversation.view.HatchConversationHistorySidePanelKt$HatchConversationHistorySidePanelContent$6$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.G0V
    public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
        return ((HatchConversationHistorySidePanelKt$HatchConversationHistorySidePanelContent$6$1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
