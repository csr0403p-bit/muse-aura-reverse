package com.facebook.aura.vds.compose.loading;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass011;
import X.BBI;
import X.BBb;
import X.BFM;
import X.C1er;
import X.C60O;
import X.C78N;
import X.G0V;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.foundation.lazy.grid.LazyGridState;
import androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState;
import androidx.compose.runtime.MutableState;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public abstract class AutoLoadMoreKt {

    /* renamed from: com.facebook.aura.vds.compose.loading.AutoLoadMoreKt$AutoLoadMore$3, reason: invalid class name */
    /* loaded from: classes.dex */
    public final class AnonymousClass3 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ Function0<Unit> $loadMore;
        public final /* synthetic */ int $loadMoreThreshold;
        public final /* synthetic */ LazyListState $this_AutoLoadMore;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(LazyListState lazyListState, int i, Function0<Unit> function0, int i2, int i3) {
            super(2);
            this.$this_AutoLoadMore = lazyListState;
            this.$loadMoreThreshold = i;
            this.$loadMore = function0;
            this.$$changed = i2;
            this.$$default = i3;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            AutoLoadMoreKt.AutoLoadMore(this.$this_AutoLoadMore, this.$loadMoreThreshold, this.$loadMore, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.vds.compose.loading.AutoLoadMoreKt$AutoLoadMore$6, reason: invalid class name */
    /* loaded from: classes.dex */
    public final class AnonymousClass6 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ Function0<Unit> $loadMore;
        public final /* synthetic */ int $loadMoreThreshold;
        public final /* synthetic */ LazyGridState $this_AutoLoadMore;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass6(LazyGridState lazyGridState, int i, Function0<Unit> function0, int i2, int i3) {
            super(2);
            this.$this_AutoLoadMore = lazyGridState;
            this.$loadMoreThreshold = i;
            this.$loadMore = function0;
            this.$$changed = i2;
            this.$$default = i3;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            AutoLoadMoreKt.AutoLoadMore(this.$this_AutoLoadMore, this.$loadMoreThreshold, this.$loadMore, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.vds.compose.loading.AutoLoadMoreKt$AutoLoadMore$9, reason: invalid class name */
    public final class AnonymousClass9 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ Function0<Unit> $loadMore;
        public final /* synthetic */ int $loadMoreThreshold;
        public final /* synthetic */ LazyStaggeredGridState $this_AutoLoadMore;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass9(LazyStaggeredGridState lazyStaggeredGridState, int i, Function0<Unit> function0, int i2, int i3) {
            super(2);
            this.$this_AutoLoadMore = lazyStaggeredGridState;
            this.$loadMoreThreshold = i;
            this.$loadMore = function0;
            this.$$changed = i2;
            this.$$default = i3;
        }

        public final void invoke(BFM bfm, int i) {
            AutoLoadMoreKt.AutoLoadMore(this.$this_AutoLoadMore, this.$loadMoreThreshold, this.$loadMore, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.vds.compose.loading.AutoLoadMoreKt$AutoLoadMorePrevious$3, reason: invalid class name and case insensitive filesystem */
    public final class C142983 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ Function0<Unit> $loadMore;
        public final /* synthetic */ int $loadMoreThreshold;
        public final /* synthetic */ LazyListState $this_AutoLoadMorePrevious;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C142983(LazyListState lazyListState, int i, Function0<Unit> function0, int i2, int i3) {
            super(2);
            this.$this_AutoLoadMorePrevious = lazyListState;
            this.$loadMoreThreshold = i;
            this.$loadMore = function0;
            this.$$changed = i2;
            this.$$default = i3;
        }

        public final void invoke(BFM bfm, int i) {
            AutoLoadMoreKt.AutoLoadMorePrevious(this.$this_AutoLoadMorePrevious, this.$loadMoreThreshold, this.$loadMore, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    public static final void AutoLoadMore(LazyListState lazyListState, int i, Function0<Unit> function0, BFM bfm, int i2, int i3) {
        int i4 = i;
        AnonymousClass003.A0v(lazyListState, function0);
        bfm.AgG(-1465909183);
        int iA0d = (i2 & 6) == 0 ? AnonymousClass004.A0d(bfm, lazyListState) | i2 : i2;
        int i5 = i3 & 1;
        if (i5 != 0) {
            iA0d |= 48;
        } else if ((i2 & 48) == 0) {
            iA0d |= AnonymousClass004.A0E(bfm, i4);
        }
        if ((i2 & 384) == 0) {
            iA0d |= AnonymousClass004.A0V(bfm, function0);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 147, 146), bfm, iA0d)) {
            if (i5 != 0) {
                i4 = 5;
            } else if (i4 < 0) {
                throw C60O.A0i("loadMoreThreshold must be positive");
            }
            MutableState mutableStateA00 = C1er.A00(bfm, function0);
            Integer numValueOf = Integer.valueOf(i4);
            boolean zA1W = AnonymousClass002.A1W(bfm, mutableStateA00, AnonymousClass003.A1B(iA0d), AnonymousClass001.A1O(iA0d));
            Object objAaT = bfm.AaT();
            if (zA1W || objAaT == C78N.A00) {
                objAaT = new AutoLoadMoreKt$AutoLoadMore$2$1(lazyListState, i4, mutableStateA00, null);
                BBI.A0T(bfm, objAaT);
            }
            AnonymousClass001.A18(bfm, objAaT, numValueOf);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass3(lazyListState, i4, function0, i2, i3);
        }
    }

    public static final void AutoLoadMorePrevious(LazyListState lazyListState, int i, Function0<Unit> function0, BFM bfm, int i2, int i3) {
        int i4 = i;
        AnonymousClass003.A0v(lazyListState, function0);
        bfm.AgG(1874737304);
        int iA0d = (i2 & 6) == 0 ? AnonymousClass004.A0d(bfm, lazyListState) | i2 : i2;
        int i5 = i3 & 1;
        if (i5 != 0) {
            iA0d |= 48;
        } else if ((i2 & 48) == 0) {
            iA0d |= AnonymousClass004.A0E(bfm, i4);
        }
        if ((i2 & 384) == 0) {
            iA0d |= AnonymousClass004.A0V(bfm, function0);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 147, 146), bfm, iA0d)) {
            if (i5 != 0) {
                i4 = 5;
            } else if (i4 < 0) {
                throw C60O.A0i("loadMoreThreshold must be positive");
            }
            MutableState mutableStateA00 = C1er.A00(bfm, function0);
            Integer numValueOf = Integer.valueOf(i4);
            boolean zA1W = AnonymousClass002.A1W(bfm, mutableStateA00, AnonymousClass003.A1B(iA0d), AnonymousClass001.A1O(iA0d));
            Object objAaT = bfm.AaT();
            if (zA1W || objAaT == C78N.A00) {
                objAaT = new AutoLoadMoreKt$AutoLoadMorePrevious$2$1(lazyListState, i4, mutableStateA00, null);
                BBI.A0T(bfm, objAaT);
            }
            AnonymousClass001.A18(bfm, objAaT, numValueOf);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C142983(lazyListState, i4, function0, i2, i3);
        }
    }

    public static final void AutoLoadMore(LazyGridState lazyGridState, int i, Function0<Unit> function0, BFM bfm, int i2, int i3) {
        int iA0E;
        int i4 = i;
        AnonymousClass003.A0v(lazyGridState, function0);
        bfm.AgG(-741185815);
        if ((i2 & 6) == 0) {
            iA0E = AnonymousClass004.A0d(bfm, lazyGridState) | i2;
        } else {
            iA0E = i2;
        }
        int i5 = i3 & 1;
        if (i5 != 0) {
            iA0E |= 48;
        } else if ((i2 & 48) == 0) {
            iA0E |= AnonymousClass004.A0E(bfm, i4);
        }
        if ((i2 & 384) == 0) {
            iA0E |= AnonymousClass004.A0V(bfm, function0);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0E & 147, 146), bfm, iA0E)) {
            if (i5 != 0) {
                i4 = 5;
            } else if (i4 < 0) {
                throw C60O.A0i("loadMoreThreshold must be positive");
            }
            MutableState mutableStateA00 = C1er.A00(bfm, function0);
            Integer numValueOf = Integer.valueOf(i4);
            boolean zA1W = AnonymousClass002.A1W(bfm, mutableStateA00, AnonymousClass003.A1B(iA0E), AnonymousClass001.A1O(iA0E));
            Object objAaT = bfm.AaT();
            if (zA1W || objAaT == C78N.A00) {
                objAaT = new AutoLoadMoreKt$AutoLoadMore$5$1(lazyGridState, i4, mutableStateA00, null);
                BBI.A0T(bfm, objAaT);
            }
            AnonymousClass001.A18(bfm, objAaT, numValueOf);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass6(lazyGridState, i4, function0, i2, i3);
        }
    }

    public static final void AutoLoadMore(LazyStaggeredGridState lazyStaggeredGridState, int i, Function0<Unit> function0, BFM bfm, int i2, int i3) {
        int i4 = i;
        AnonymousClass003.A0v(lazyStaggeredGridState, function0);
        bfm.AgG(-1969282095);
        int iA0d = (i2 & 6) == 0 ? AnonymousClass004.A0d(bfm, lazyStaggeredGridState) | i2 : i2;
        int i5 = i3 & 1;
        if (i5 != 0) {
            iA0d |= 48;
        } else if ((i2 & 48) == 0) {
            iA0d |= AnonymousClass004.A0E(bfm, i4);
        }
        if ((i2 & 384) == 0) {
            iA0d |= AnonymousClass004.A0V(bfm, function0);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 147, 146), bfm, iA0d)) {
            if (i5 != 0) {
                i4 = 5;
            } else if (i4 < 0) {
                throw C60O.A0i("loadMoreThreshold must be positive");
            }
            MutableState mutableStateA00 = C1er.A00(bfm, function0);
            Integer numValueOf = Integer.valueOf(i4);
            boolean zA1W = AnonymousClass002.A1W(bfm, mutableStateA00, AnonymousClass003.A1B(iA0d), AnonymousClass001.A1O(iA0d));
            Object objAaT = bfm.AaT();
            if (zA1W || objAaT == C78N.A00) {
                objAaT = new AutoLoadMoreKt$AutoLoadMore$8$1(lazyStaggeredGridState, i4, mutableStateA00, null);
                BBI.A0T(bfm, objAaT);
            }
            AnonymousClass001.A18(bfm, objAaT, numValueOf);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass9(lazyStaggeredGridState, i4, function0, i2, i3);
        }
    }
}
