package com.facebook.aura.feed.view;

import X.AFs;
import X.AbstractC07127nr;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.C3UX;
import X.EnumC10460Hji;
import X.G0V;
import X.HtJ;
import X.Hwg;
import androidx.compose.foundation.lazy.LazyListState;
import com.facebook.aura.feed.model.FeedViewModel;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class FeedTabScreenKt$FeedTabScreen$9$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ C3UX $coroutineScope;
    public final /* synthetic */ LazyListState $listState;
    public final /* synthetic */ FeedViewModel $viewModel;

    @DebugMetadata(c = "com.facebook.aura.feed.view.FeedTabScreenKt$FeedTabScreen$9$1$1", f = "FeedTabScreen.kt", l = {386}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.feed.view.FeedTabScreenKt$FeedTabScreen$9$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ LazyListState $listState;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(LazyListState lazyListState, HtJ<? super AnonymousClass1> htJ) {
            super(2, htJ);
            this.$listState = lazyListState;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new AnonymousClass1(this.$listState, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                LazyListState lazyListState = this.$listState;
                this.label = 1;
                AFs<LazyListState, ?> aFs = LazyListState.A0Q;
                if (lazyListState.A05(0, 0, this) == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
            }
            return Unit.INSTANCE;
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return new AnonymousClass1(this.$listState, htJ).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FeedTabScreenKt$FeedTabScreen$9$1(FeedViewModel feedViewModel, C3UX c3ux, LazyListState lazyListState) {
        super(0);
        this.$viewModel = feedViewModel;
        this.$coroutineScope = c3ux;
        this.$listState = lazyListState;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.$viewModel.returnToLiveFeed();
        AnonymousClass001.A1J(new AnonymousClass1(this.$listState, null), this.$coroutineScope);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
