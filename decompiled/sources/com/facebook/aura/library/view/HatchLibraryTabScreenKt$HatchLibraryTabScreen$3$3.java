package com.facebook.aura.library.view;

import X.AEk;
import X.AHH;
import X.AKH;
import X.AKQ;
import X.AXN;
import X.AbstractC3358CGz;
import X.AbstractC7559F3s;
import X.Am0;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AxM;
import X.B1V;
import X.BBI;
import X.BFM;
import X.BIj;
import X.BPg;
import X.BRg;
import X.BS0;
import X.C00x;
import X.C01N;
import X.C06G;
import X.C0z7;
import X.C1062ATq;
import X.C10G;
import X.C11U;
import X.C1515AkP;
import X.C1BO;
import X.C1DG;
import X.C1DI;
import X.C2VU;
import X.C3U4;
import X.C78N;
import X.F60;
import X.G0U;
import X.G0V;
import X.G0W;
import X.InterfaceC1380AiA;
import X.InterfaceC1492Ajz;
import X.InterfaceC1516AkQ;
import android.graphics.Paint;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.header.view.ScrimScrollConnectionKt;
import com.facebook.aura.header.view.ScrimScrollState;
import com.facebook.aura.library.model.ArtifactFile;
import com.facebook.aura.library.model.HatchLibraryViewModel;
import com.facebook.aura.library.repo.LoadingState;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.ui.HatchPullToRefreshKt;
import com.facebook.aura.vds.compose.segmentedtabs.AuraSegmentedTabsKt;
import com.facebook.aura.vds.compose.segmentedtabs.TextTab;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchLibraryTabScreenKt$HatchLibraryTabScreen$3$3 extends AbstractC7559F3s implements G0W<C1DG, BFM, Integer, Unit> {
    public final /* synthetic */ float $gutterWidth;
    public final /* synthetic */ C1BO<HatchLibraryViewModel.UiState> $libraryUiState$delegate;
    public final /* synthetic */ LazyListState $listState;
    public final /* synthetic */ AuraNavigator $navigator;
    public final /* synthetic */ G0U<Integer, Unit> $onTabSelected;
    public final /* synthetic */ Function0<Unit> $onViewFinished;
    public final /* synthetic */ MutableState<ArtifactFile> $selectedArtifactFile$delegate;
    public final /* synthetic */ MutableState<Integer> $selectedTab$delegate;
    public final /* synthetic */ AbstractC3358CGz $userSession;
    public final /* synthetic */ MutableState<LibraryViewMode> $viewMode$delegate;
    public final /* synthetic */ HatchLibraryViewModel $viewModel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HatchLibraryTabScreenKt$HatchLibraryTabScreen$3$3(HatchLibraryViewModel hatchLibraryViewModel, C1BO<HatchLibraryViewModel.UiState> c1bo, AuraNavigator auraNavigator, AbstractC3358CGz abstractC3358CGz, LazyListState lazyListState, Function0<Unit> function0, MutableState<Integer> mutableState, MutableState<LibraryViewMode> mutableState2, MutableState<ArtifactFile> mutableState3, float f, G0U<? super Integer, Unit> g0u) {
        super(3);
        this.$viewModel = hatchLibraryViewModel;
        this.$libraryUiState$delegate = c1bo;
        this.$navigator = auraNavigator;
        this.$userSession = abstractC3358CGz;
        this.$listState = lazyListState;
        this.$onViewFinished = function0;
        this.$selectedTab$delegate = mutableState;
        this.$viewMode$delegate = mutableState2;
        this.$selectedArtifactFile$delegate = mutableState3;
        this.$gutterWidth = f;
        this.$onTabSelected = g0u;
    }

    @Override // X.G0W
    public /* bridge */ /* synthetic */ Unit invoke(C1DG c1dg, BFM bfm, Integer num) {
        m1182invoke8Feqmps(c1dg.A00, bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    /* renamed from: invoke-8Feqmps, reason: not valid java name */
    public final void m1182invoke8Feqmps(float f, BFM bfm, int i) {
        int iA04 = i;
        if ((i & 6) == 0) {
            iA04 = i | AnonymousClass004.A04(bfm, f);
        }
        if (!AnonymousClass001.A1b(AnonymousClass002.A1P(iA04 & 19, 18), bfm, iA04)) {
            bfm.Afo();
            return;
        }
        BS0 bs0 = BRg.A00;
        C1062ATq c1062ATq = C10G.A01;
        HatchLibraryViewModel hatchLibraryViewModel = this.$viewModel;
        C1BO<HatchLibraryViewModel.UiState> c1bo = this.$libraryUiState$delegate;
        AuraNavigator auraNavigator = this.$navigator;
        AbstractC3358CGz abstractC3358CGz = this.$userSession;
        LazyListState lazyListState = this.$listState;
        Function0<Unit> function0 = this.$onViewFinished;
        MutableState<Integer> mutableState = this.$selectedTab$delegate;
        MutableState<LibraryViewMode> mutableState2 = this.$viewMode$delegate;
        MutableState<ArtifactFile> mutableState3 = this.$selectedArtifactFile$delegate;
        float f2 = this.$gutterWidth;
        G0U<Integer, Unit> g0u = this.$onTabSelected;
        InterfaceC1380AiA interfaceC1380AiAA0c = AnonymousClass001.A0c(false);
        BBI bbi = (BBI) bfm;
        long j = bbi.A06;
        int i2 = (int) (j ^ (j >>> 32));
        AKQ akqA04 = BBI.A04(bbi);
        BRg bRgA01 = AxM.A01(bfm, c1062ATq);
        Function0<InterfaceC1516AkQ> function02 = C1515AkP.A00;
        if (bbi.A0V == null) {
            C00x.A00();
            throw F60.createAndThrow();
        }
        AnonymousClass005.A0n(bfm, bbi, function02);
        G0V<InterfaceC1516AkQ, InterfaceC1380AiA, Unit> g0v = C1515AkP.A04;
        BPg.A02(bfm, interfaceC1380AiAA0c, g0v);
        G0V<InterfaceC1516AkQ, InterfaceC1492Ajz, Unit> g0v2 = C1515AkP.A06;
        G0V g0vA19 = AnonymousClass004.A19(bfm, akqA04, g0v2, i2);
        G0U<InterfaceC1516AkQ, Unit> g0u2 = C1515AkP.A02;
        G0V g0vA0u = AnonymousClass002.A0u(bfm, bRgA01, g0u2);
        C0z7 c0z7 = C0z7.A00;
        bfm.AgE(-1581787451);
        AKH<AXN> akh = Am0.A04;
        AXN axn = (AXN) bfm.A6v(akh);
        float fAgw = axn.Agw(C06G.A0V(bfm).A00.A04);
        float f3 = HatchLibraryTabScreenKt.TAB_VERTICAL_PADDING;
        float f4 = HatchLibraryTabScreenKt.TAB_CONTAINER_PADDING;
        int iAbr = axn.Abr(fAgw + (f3 * 2.0f) + (f4 * 2.0f));
        BBI.A0R(bbi, false);
        boolean zA63 = bfm.A63(iAbr);
        Object objAaT = bfm.AaT();
        if (zA63 || objAaT == C78N.A00) {
            objAaT = AnonymousClass004.A12(bfm, Integer.valueOf(iAbr));
        }
        MutableState mutableState4 = (MutableState) objAaT;
        float fAgy = ((AXN) bfm.A6v(akh)).Agy(MutableState.A02(mutableState4) / 2);
        ScrimScrollState scrimScrollState = (ScrimScrollState) bfm.A6v(ScrimScrollConnectionKt.LocalScrimScrollState);
        Object objAaT2 = bfm.AaT();
        Object obj = C78N.A00;
        Object obj2 = objAaT2;
        if (objAaT2 == obj) {
            Paint paint = new Paint();
            paint.setAntiAlias(true);
            bfm.Ai0(paint);
            obj2 = paint;
        }
        Paint paint2 = (Paint) obj2;
        boolean zA1Z = AnonymousClass002.A1Z(c1bo.getValue().loadingState, LoadingState.REFRESH_LOADING);
        boolean zA67 = bfm.A67(hatchLibraryViewModel);
        Object objAaT3 = bfm.AaT();
        if (zA67 || objAaT3 == obj) {
            objAaT3 = new HatchLibraryTabScreenKt$HatchLibraryTabScreen$3$3$1$1$1(hatchLibraryViewModel);
            bfm.Ai0(objAaT3);
        }
        HatchPullToRefreshKt.m2322HatchPullToRefreshjIwJxvA(zA1Z, (Function0) objAaT3, C11U.A00(C3U4.A0C(c1062ATq, 0.0f, f + fAgy, 0.0f, 0.0f)), fAgy, null, B1V.A00(bfm, new HatchLibraryTabScreenKt$HatchLibraryTabScreen$3$3$1$2(hatchLibraryViewModel, fAgy, auraNavigator, abstractC3358CGz, lazyListState, function0, c1bo, mutableState, mutableState2, mutableState3), 2125771188), bfm, 196608, 16);
        BRg bRgA4C = c0z7.A4C(C2VU.A0C, bs0);
        C1062ATq c1062ATq2 = C10G.A02;
        BRg bRgThen = bRgA4C.then(c1062ATq2);
        InterfaceC1380AiA interfaceC1380AiAA0U = AnonymousClass002.A0U(bfm);
        int iA0D = AnonymousClass001.A0D(bbi);
        AKQ akqA042 = BBI.A04(bbi);
        BRg bRgA012 = AxM.A01(bfm, bRgThen);
        AnonymousClass005.A0n(bfm, bbi, function02);
        BPg.A02(bfm, interfaceC1380AiAA0U, g0v);
        BPg.A02(bfm, akqA042, g0v2);
        AnonymousClass003.A15(g0u2, g0vA19, bfm, iA0D);
        C01N.A0B(bfm, bs0, bRgA012, g0vA0u, f);
        AHH<TextTab> ahh = HatchLibraryTabScreenKt.librarySubTabs;
        int iA02 = MutableState.A02((MutableState) mutableState);
        float f5 = HatchLibraryTabScreenKt.TAB_HORIZONTAL_PADDING;
        boolean zA65 = bfm.A65(mutableState4);
        Object objAaT4 = bfm.AaT();
        if (zA65 || objAaT4 == obj) {
            objAaT4 = new HatchLibraryTabScreenKt$HatchLibraryTabScreen$3$3$1$3$1$1(mutableState4);
            bfm.Ai0(objAaT4);
        }
        BRg bRgA0B = C3U4.A0B(BIj.A00(c1062ATq2, (G0U) objAaT4), f2, 0.0f);
        boolean zA1J = AnonymousClass003.A1J(bfm, scrimScrollState, paint2);
        Object objAaT5 = bfm.AaT();
        if (zA1J || objAaT5 == obj) {
            objAaT5 = new HatchLibraryTabScreenKt$HatchLibraryTabScreen$3$3$1$3$2$1(scrimScrollState, paint2);
            bfm.Ai0(objAaT5);
        }
        BRg bRgA02 = C1DI.A02(AEk.A01(bRgA0B, (G0U) objAaT5), AnonymousClass002.A0e(bfm).pill, 1.0f, AnonymousClass002.A0c(bfm).border);
        boolean zA652 = bfm.A65(g0u);
        Object objAaT6 = bfm.AaT();
        if (zA652 || objAaT6 == obj) {
            objAaT6 = new HatchLibraryTabScreenKt$HatchLibraryTabScreen$3$3$1$3$3$1(g0u);
            bfm.Ai0(objAaT6);
        }
        AuraSegmentedTabsKt.m2609AuraToggleSegmentedTabswDTT_x8((G0V) objAaT6, ahh, iA02, bRgA02, 0L, 0L, f5, f3, f4, null, null, bfm, (TextTab.$stable << 3) | 114819072, 0, 1584);
        AnonymousClass002.A0y(bbi);
    }
}
