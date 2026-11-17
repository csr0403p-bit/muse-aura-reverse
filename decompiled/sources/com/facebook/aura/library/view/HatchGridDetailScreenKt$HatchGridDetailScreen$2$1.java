package com.facebook.aura.library.view;

import X.AHD;
import X.AbstractC7559F3s;
import X.AcQ;
import X.Ad7;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass004;
import X.BFM;
import X.BRg;
import X.C06G;
import X.C10G;
import X.C1DD;
import X.C1DG;
import X.C1DP;
import X.C1YZ;
import X.C3U4;
import X.C78N;
import X.C9m9;
import X.G0U;
import X.G2j;
import androidx.compose.foundation.lazy.grid.LazyGridState;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.library.model.RecentFile;
import com.facebook.aura.ui.adaptive.AuraGridKt;
import com.facebook.aura.vds.compose.loading.AutoLoadMoreKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchGridDetailScreenKt$HatchGridDetailScreen$2$1 extends AbstractC7559F3s implements G2j<C1DG, C1DG, BFM, Integer, Unit> {
    public final /* synthetic */ int $emptySubtitleRes;
    public final /* synthetic */ int $emptyTitleRes;
    public final /* synthetic */ AHD<T> $gridItems;
    public final /* synthetic */ G0U<T, String> $imageUri;
    public final /* synthetic */ boolean $isEmpty;
    public final /* synthetic */ boolean $isLoading;
    public final /* synthetic */ boolean $isLoadingMore;
    public final /* synthetic */ G0U<T, Object> $itemKey;
    public final /* synthetic */ int $loadingTextRes;
    public final /* synthetic */ Function0<Unit> $onLoadMore;
    public final /* synthetic */ G0U<T, AHD<String>> $previewUris;
    public final /* synthetic */ MutableState<T> $selectedItem$delegate;
    public final /* synthetic */ G0U<T, RecentFile> $toRecentFile;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HatchGridDetailScreenKt$HatchGridDetailScreen$2$1(boolean z, int i, boolean z2, int i2, int i3, AHD<? extends T> ahd, G0U<? super T, ? extends Object> g0u, G0U<? super T, RecentFile> g0u2, G0U<? super T, String> g0u3, G0U<? super T, ? extends AHD<String>> g0u4, boolean z3, Function0<Unit> function0, MutableState<T> mutableState) {
        super(4);
        this.$isLoading = z;
        this.$loadingTextRes = i;
        this.$isEmpty = z2;
        this.$emptyTitleRes = i2;
        this.$emptySubtitleRes = i3;
        this.$gridItems = ahd;
        this.$itemKey = g0u;
        this.$toRecentFile = g0u2;
        this.$imageUri = g0u3;
        this.$previewUris = g0u4;
        this.$isLoadingMore = z3;
        this.$onLoadMore = function0;
        this.$selectedItem$delegate = mutableState;
    }

    @Override // X.G2j
    public /* bridge */ /* synthetic */ Unit invoke(C1DG c1dg, C1DG c1dg2, BFM bfm, Integer num) {
        m1170invokei1RSzL4(c1dg.A00, c1dg2.A00, bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    /* renamed from: invoke-i1RSzL4, reason: not valid java name */
    public final void m1170invokei1RSzL4(float f, float f2, BFM bfm, int i) {
        int iA04 = (i & 6) == 0 ? i | AnonymousClass004.A04(bfm, f) : i;
        if ((i & 48) == 0) {
            iA04 |= AnonymousClass004.A05(bfm, f2);
        }
        if (!AnonymousClass001.A1b(AnonymousClass002.A1P(iA04 & 147, 146), bfm, iA04)) {
            bfm.Afo();
            return;
        }
        if (this.$isLoading) {
            bfm.AgE(-285502183);
            HatchGridDetailScreenKt.LobsterGridLoadingState(this.$loadingTextRes, C3U4.A0C(C10G.A01, 0.0f, f, 0.0f, 0.0f), bfm, 0, 0);
        } else if (this.$isEmpty) {
            bfm.AgE(-285302636);
            HatchGridDetailScreenKt.LobsterGridEmptyState(this.$emptyTitleRes, this.$emptySubtitleRes, C3U4.A0C(C10G.A01, 0.0f, f, 0.0f, 0.0f), bfm, 0, 0);
        } else {
            bfm.AgE(-285028069);
            LazyGridState lazyGridStateA00 = Ad7.A00(bfm, 0, 3);
            C1DD c1dd = new C1DD(AuraGridKt.m2362auraGridColumnsWMci_g0(2, HatchGridDetailScreenKt.GRID_MIN_CELL_WIDTH, 0.0f, bfm, 54, 4));
            BRg bRgA0B = C3U4.A0B(C10G.A01, C06G.A00(bfm), 0.0f);
            C1DP c1dp = new C1DP(0.0f, f, 0.0f, f2);
            float f3 = HatchGridDetailScreenKt.GRID_SPACING;
            C9m9 c9m9A00 = AcQ.A00(f3);
            C9m9 c9m9A002 = AcQ.A00(f3);
            boolean zA1U = AnonymousClass001.A1U(bfm, this.$isLoadingMore, AnonymousClass001.A1R(bfm, this.$previewUris, AnonymousClass001.A1R(bfm, this.$imageUri, AnonymousClass001.A1R(bfm, this.$toRecentFile, AnonymousClass001.A1R(bfm, this.$itemKey, bfm.A67(this.$gridItems))))));
            AHD<T> ahd = this.$gridItems;
            G0U<T, Object> g0u = this.$itemKey;
            boolean z = this.$isLoadingMore;
            G0U<T, RecentFile> g0u2 = this.$toRecentFile;
            G0U<T, String> g0u3 = this.$imageUri;
            G0U<T, AHD<String>> g0u4 = this.$previewUris;
            MutableState<T> mutableState = this.$selectedItem$delegate;
            Object objAaT = bfm.AaT();
            if (zA1U || objAaT == C78N.A00) {
                objAaT = new HatchGridDetailScreenKt$HatchGridDetailScreen$2$1$1$1(ahd, g0u, z, g0u2, g0u3, g0u4, mutableState);
                bfm.Ai0(objAaT);
            }
            C1YZ.A00(null, null, c9m9A00, c9m9A002, c1dp, c1dd, lazyGridStateA00, bfm, bRgA0B, (G0U) objAaT, 1769472, 0, 912, false, false);
            boolean zA65 = bfm.A65(this.$onLoadMore);
            Function0<Unit> function0 = this.$onLoadMore;
            Object objAaT2 = bfm.AaT();
            if (zA65 || objAaT2 == C78N.A00) {
                objAaT2 = new HatchGridDetailScreenKt$HatchGridDetailScreen$2$1$2$1(function0);
                bfm.Ai0(objAaT2);
            }
            AutoLoadMoreKt.AutoLoadMore(lazyGridStateA00, 0, (Function0<Unit>) objAaT2, bfm, 0, 1);
        }
        AnonymousClass001.A1D(bfm);
    }
}
