package com.facebook.aura.conversation.view;

import X.AbstractC07127nr;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AvW;
import X.C1BO;
import X.C3UX;
import X.EnumC10460Hji;
import X.G0U;
import X.G0V;
import X.HtJ;
import X.Hwg;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.conversation.viewmodel.HatchConversationUiState;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;

@DebugMetadata(c = "com.facebook.aura.conversation.view.HatchConversationScrollingKt$ConversationHistoryLoader$1$1", f = "HatchConversationScrolling.kt", l = {557}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
public final class HatchConversationScrollingKt$ConversationHistoryLoader$1$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
    public final /* synthetic */ boolean $canLoadMore;
    public final /* synthetic */ boolean $didInitialScroll;
    public final /* synthetic */ MutableState<Long> $firedAtSeq$delegate;
    public final /* synthetic */ C1BO<Boolean> $isAtTop$delegate;
    public final /* synthetic */ LazyListState $listState;
    public final /* synthetic */ Function0<Unit> $onLoadHistory;
    public final /* synthetic */ HatchConversationUiState $uiState;
    public Object L$0;
    public int label;

    /* renamed from: com.facebook.aura.conversation.view.HatchConversationScrollingKt$ConversationHistoryLoader$1$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0U<Long, Unit> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        public AnonymousClass1() {
            super(1);
        }

        @Override // X.G0U
        public /* bridge */ /* synthetic */ Unit invoke(Long l) {
            return AnonymousClass001.A0x(l);
        }

        public final void invoke(long j) {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchConversationScrollingKt$ConversationHistoryLoader$1$1(HatchConversationUiState hatchConversationUiState, LazyListState lazyListState, boolean z, boolean z2, Function0<Unit> function0, C1BO<Boolean> c1bo, MutableState<Long> mutableState, HtJ<? super HatchConversationScrollingKt$ConversationHistoryLoader$1$1> htJ) {
        super(2, htJ);
        this.$uiState = hatchConversationUiState;
        this.$listState = lazyListState;
        this.$didInitialScroll = z;
        this.$canLoadMore = z2;
        this.$onLoadHistory = function0;
        this.$isAtTop$delegate = c1bo;
        this.$firedAtSeq$delegate = mutableState;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new HatchConversationScrollingKt$ConversationHistoryLoader$1$1(this.$uiState, this.$listState, this.$didInitialScroll, this.$canLoadMore, this.$onLoadHistory, this.$isAtTop$delegate, this.$firedAtSeq$delegate, htJ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            if (!C1BO.A0F(this.$isAtTop$delegate)) {
                this.$firedAtSeq$delegate.Af8(null);
                return Unit.INSTANCE;
            }
            obj2 = this.$uiState.oldestHistorySeq;
            if (this.$firedAtSeq$delegate.getValue() != null && !MutableState.A0B(this.$firedAtSeq$delegate, obj2)) {
                AnonymousClass1 anonymousClass1 = AnonymousClass1.INSTANCE;
                this.L$0 = obj2;
                this.label = 1;
                if (AvW.A01(anonymousClass1, this) == enumC10460Hji) {
                    return enumC10460Hji;
                }
            }
            if (this.$didInitialScroll && this.$firedAtSeq$delegate.getValue() == null && this.$canLoadMore && obj2 != null) {
                this.$firedAtSeq$delegate.Af8(obj2);
                this.$onLoadHistory.invoke();
            }
            return Unit.INSTANCE;
        }
        if (i != 1) {
            throw AnonymousClass001.A0n();
        }
        obj2 = this.L$0;
        Hwg.A00(obj);
        if (HatchConversationScrollingKt.isFirstItemVisible(this.$listState)) {
            this.$firedAtSeq$delegate.Af8(null);
            if (this.$didInitialScroll) {
                this.$firedAtSeq$delegate.Af8(obj2);
                this.$onLoadHistory.invoke();
            }
        }
        return Unit.INSTANCE;
    }

    @Override // X.G0V
    public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
        return ((HatchConversationScrollingKt$ConversationHistoryLoader$1$1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
