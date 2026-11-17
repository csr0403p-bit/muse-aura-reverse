package com.facebook.aura.vds.compose.loading;

import X.AbstractC07127nr;
import X.AbstractC0878AGe;
import X.AbstractC7559F3s;
import X.Ad0;
import X.Ae6;
import X.AnonymousClass001;
import X.C1BO;
import X.C20Z;
import X.C3UX;
import X.C6v3;
import X.C8j4;
import X.EnumC10460Hji;
import X.G0V;
import X.GDB;
import X.HtJ;
import X.Hwg;
import androidx.compose.foundation.lazy.grid.LazyGridState;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;

@DebugMetadata(c = "com.facebook.aura.vds.compose.loading.AutoLoadMoreKt$AutoLoadMore$5$1", f = "AutoLoadMore.kt", l = {98}, m = "invokeSuspend", v = 2)
/* loaded from: classes4.dex */
public final class AutoLoadMoreKt$AutoLoadMore$5$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
    public final /* synthetic */ C1BO<Function0<Unit>> $loadMore$delegate;
    public final /* synthetic */ int $loadMoreThreshold;
    public final /* synthetic */ LazyGridState $this_AutoLoadMore;
    public int label;

    /* renamed from: com.facebook.aura.vds.compose.loading.AutoLoadMoreKt$AutoLoadMore$5$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements Function0<ShouldLoadMore> {
        public final /* synthetic */ int $loadMoreThreshold;
        public final /* synthetic */ LazyGridState $this_AutoLoadMore;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(LazyGridState lazyGridState, int i) {
            super(0);
            this.$this_AutoLoadMore = lazyGridState;
            this.$loadMoreThreshold = i;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final ShouldLoadMore invoke() {
            int i;
            Ae6 ae6 = (Ae6) AbstractC0878AGe.A0I(C8j4.A0U(this.$this_AutoLoadMore.A0I).A0D);
            int i2 = C8j4.A0U(this.$this_AutoLoadMore.A0I).A06;
            if (i2 == 0 || ae6 == null || (i = ((Ad0) ae6).A08) == 0) {
                return new ShouldLoadMore(false, null, null);
            }
            return new ShouldLoadMore((i2 - i) - 1 <= this.$loadMoreThreshold, Integer.valueOf(i), null);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AutoLoadMoreKt$AutoLoadMore$5$1(LazyGridState lazyGridState, int i, C1BO<? extends Function0<Unit>> c1bo, HtJ<? super AutoLoadMoreKt$AutoLoadMore$5$1> htJ) {
        super(2, htJ);
        this.$this_AutoLoadMore = lazyGridState;
        this.$loadMoreThreshold = i;
        this.$loadMore$delegate = c1bo;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new AutoLoadMoreKt$AutoLoadMore$5$1(this.$this_AutoLoadMore, this.$loadMoreThreshold, this.$loadMore$delegate, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            AutoLoadMoreKt$AutoLoadMore$5$1$invokeSuspend$$inlined$filter$1 autoLoadMoreKt$AutoLoadMore$5$1$invokeSuspend$$inlined$filter$1 = new AutoLoadMoreKt$AutoLoadMore$5$1$invokeSuspend$$inlined$filter$1(GDB.A01(C6v3.A01(new AnonymousClass1(this.$this_AutoLoadMore, this.$loadMoreThreshold))));
            final C1BO<Function0<Unit>> c1bo = this.$loadMore$delegate;
            C20Z<? super ShouldLoadMore> c20z = new C20Z() { // from class: com.facebook.aura.vds.compose.loading.AutoLoadMoreKt$AutoLoadMore$5$1.3
                public final Object emit(ShouldLoadMore shouldLoadMore, HtJ<? super Unit> htJ) {
                    C1BO.A0D(c1bo);
                    return Unit.INSTANCE;
                }

                @Override // X.C20Z
                public /* bridge */ /* synthetic */ Object emit(Object obj2, HtJ htJ) {
                    C1BO.A0D(c1bo);
                    return Unit.INSTANCE;
                }
            };
            this.label = 1;
            if (autoLoadMoreKt$AutoLoadMore$5$1$invokeSuspend$$inlined$filter$1.collect(c20z, this) == enumC10460Hji) {
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
        return ((AutoLoadMoreKt$AutoLoadMore$5$1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
