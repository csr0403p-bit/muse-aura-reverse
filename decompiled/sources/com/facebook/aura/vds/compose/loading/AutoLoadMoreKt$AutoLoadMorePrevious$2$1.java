package com.facebook.aura.vds.compose.loading;

import X.AbstractC07127nr;
import X.AbstractC0878AGe;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass003;
import X.C1160Acs;
import X.C1161Act;
import X.C16C;
import X.C1BO;
import X.C20Z;
import X.C3UX;
import X.C6v3;
import X.EnumC10460Hji;
import X.G0V;
import X.GDB;
import X.HtJ;
import X.Hwg;
import androidx.compose.foundation.lazy.LazyListState;
import com.facebook.aura.sharesheet.HatchIdeaShareImageRenderer;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;

@DebugMetadata(c = "com.facebook.aura.vds.compose.loading.AutoLoadMoreKt$AutoLoadMorePrevious$2$1", f = "AutoLoadMore.kt", l = {HatchIdeaShareImageRenderer.TEXT_LEFT}, m = "invokeSuspend", v = 2)
/* loaded from: classes4.dex */
public final class AutoLoadMoreKt$AutoLoadMorePrevious$2$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
    public final /* synthetic */ C1BO<Function0<Unit>> $loadMore$delegate;
    public final /* synthetic */ int $loadMoreThreshold;
    public final /* synthetic */ LazyListState $this_AutoLoadMorePrevious;
    public int label;

    /* renamed from: com.facebook.aura.vds.compose.loading.AutoLoadMoreKt$AutoLoadMorePrevious$2$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements Function0<ShouldLoadMore> {
        public final /* synthetic */ int $loadMoreThreshold;
        public final /* synthetic */ LazyListState $this_AutoLoadMorePrevious;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(LazyListState lazyListState, int i) {
            super(0);
            this.$this_AutoLoadMorePrevious = lazyListState;
            this.$loadMoreThreshold = i;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final ShouldLoadMore invoke() {
            C16C c16c = (C16C) AbstractC0878AGe.A0G(AnonymousClass003.A0j(this.$this_AutoLoadMorePrevious));
            int i = ((C1161Act) this.$this_AutoLoadMorePrevious.A04()).A05;
            if (i == 0 || c16c == null) {
                return new ShouldLoadMore(false, null, null);
            }
            int i2 = ((C1160Acs) c16c).A07;
            return new ShouldLoadMore(i2 <= this.$loadMoreThreshold, Integer.valueOf(i2), Integer.valueOf(i));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AutoLoadMoreKt$AutoLoadMorePrevious$2$1(LazyListState lazyListState, int i, C1BO<? extends Function0<Unit>> c1bo, HtJ<? super AutoLoadMoreKt$AutoLoadMorePrevious$2$1> htJ) {
        super(2, htJ);
        this.$this_AutoLoadMorePrevious = lazyListState;
        this.$loadMoreThreshold = i;
        this.$loadMore$delegate = c1bo;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new AutoLoadMoreKt$AutoLoadMorePrevious$2$1(this.$this_AutoLoadMorePrevious, this.$loadMoreThreshold, this.$loadMore$delegate, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            AutoLoadMoreKt$AutoLoadMorePrevious$2$1$invokeSuspend$$inlined$filter$1 autoLoadMoreKt$AutoLoadMorePrevious$2$1$invokeSuspend$$inlined$filter$1 = new AutoLoadMoreKt$AutoLoadMorePrevious$2$1$invokeSuspend$$inlined$filter$1(GDB.A01(C6v3.A01(new AnonymousClass1(this.$this_AutoLoadMorePrevious, this.$loadMoreThreshold))));
            final C1BO<Function0<Unit>> c1bo = this.$loadMore$delegate;
            C20Z<? super ShouldLoadMore> c20z = new C20Z() { // from class: com.facebook.aura.vds.compose.loading.AutoLoadMoreKt$AutoLoadMorePrevious$2$1.3
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
            if (autoLoadMoreKt$AutoLoadMorePrevious$2$1$invokeSuspend$$inlined$filter$1.collect(c20z, this) == enumC10460Hji) {
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
        return ((AutoLoadMoreKt$AutoLoadMorePrevious$2$1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
