package com.facebook.aura.conversation.view;

import X.AFs;
import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.C3UX;
import X.EnumC10460Hji;
import X.G0V;
import X.HtJ;
import X.Hwg;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.runtime.MutableState;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.conversation.view.HatchConversationHistorySidePanelKt$HatchConversationHistorySidePanelContent$7$1", f = "HatchConversationHistorySidePanel.kt", l = {317, 318}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
public final class HatchConversationHistorySidePanelKt$HatchConversationHistorySidePanelContent$7$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
    public final /* synthetic */ LazyListState $activeListState;
    public final /* synthetic */ LazyListState $archivedListState;
    public final /* synthetic */ MutableState<Boolean> $hasHandledInitialMode$delegate;
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
    public HatchConversationHistorySidePanelKt$HatchConversationHistorySidePanelContent$7$1(LazyListState lazyListState, LazyListState lazyListState2, MutableState<SidePanelMode> mutableState, MutableState<Boolean> mutableState2, HtJ<? super HatchConversationHistorySidePanelKt$HatchConversationHistorySidePanelContent$7$1> htJ) {
        super(2, htJ);
        this.$activeListState = lazyListState;
        this.$archivedListState = lazyListState2;
        this.$mode$delegate = mutableState;
        this.$hasHandledInitialMode$delegate = mutableState2;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new HatchConversationHistorySidePanelKt$HatchConversationHistorySidePanelContent$7$1(this.$activeListState, this.$archivedListState, this.$mode$delegate, this.$hasHandledInitialMode$delegate, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        LazyListState lazyListState;
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            MutableState<SidePanelMode> mutableState = this.$mode$delegate;
            float f = HatchConversationHistorySidePanelKt.SidePanelBottomActionSize;
            mutableState.getValue();
            if (MutableState.A0A((MutableState) this.$hasHandledInitialMode$delegate)) {
                int iOrdinal = this.$mode$delegate.getValue().ordinal();
                if (iOrdinal == 0) {
                    lazyListState = this.$activeListState;
                    this.label = 1;
                } else if (iOrdinal == 1) {
                    lazyListState = this.$archivedListState;
                    this.label = 2;
                } else if (iOrdinal != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                AFs<LazyListState, ?> aFs = LazyListState.A0Q;
                if (lazyListState.A06(0, 0, this) == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                MutableState.A09(true, this.$hasHandledInitialMode$delegate);
            }
        } else {
            if (i != 1 && i != 2) {
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(obj);
        }
        return Unit.INSTANCE;
    }

    @Override // X.G0V
    public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
        return ((HatchConversationHistorySidePanelKt$HatchConversationHistorySidePanelContent$7$1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
