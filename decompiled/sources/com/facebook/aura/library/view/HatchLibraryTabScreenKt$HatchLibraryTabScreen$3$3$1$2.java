package com.facebook.aura.library.view;

import X.AbstractC3358CGz;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass005;
import X.BFM;
import X.C1BO;
import X.C78N;
import X.G0U;
import X.G0W;
import X.InterfaceC05151eP;
import X.InterfaceC7353EnQ;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.library.model.ArtifactFile;
import com.facebook.aura.library.model.HatchLibraryViewModel;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.vds.compose.base.AuraDimensKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchLibraryTabScreenKt$HatchLibraryTabScreen$3$3$1$2 extends AbstractC7559F3s implements G0W<InterfaceC05151eP, BFM, Integer, Unit> {
    public final /* synthetic */ float $halfTabBarDp;
    public final /* synthetic */ C1BO<HatchLibraryViewModel.UiState> $libraryUiState$delegate;
    public final /* synthetic */ LazyListState $listState;
    public final /* synthetic */ AuraNavigator $navigator;
    public final /* synthetic */ Function0<Unit> $onViewFinished;
    public final /* synthetic */ MutableState<ArtifactFile> $selectedArtifactFile$delegate;
    public final /* synthetic */ MutableState<Integer> $selectedTab$delegate;
    public final /* synthetic */ AbstractC3358CGz $userSession;
    public final /* synthetic */ MutableState<LibraryViewMode> $viewMode$delegate;
    public final /* synthetic */ HatchLibraryViewModel $viewModel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchLibraryTabScreenKt$HatchLibraryTabScreen$3$3$1$2(HatchLibraryViewModel hatchLibraryViewModel, float f, AuraNavigator auraNavigator, AbstractC3358CGz abstractC3358CGz, LazyListState lazyListState, Function0<Unit> function0, C1BO<HatchLibraryViewModel.UiState> c1bo, MutableState<Integer> mutableState, MutableState<LibraryViewMode> mutableState2, MutableState<ArtifactFile> mutableState3) {
        super(3);
        this.$viewModel = hatchLibraryViewModel;
        this.$halfTabBarDp = f;
        this.$navigator = auraNavigator;
        this.$userSession = abstractC3358CGz;
        this.$listState = lazyListState;
        this.$onViewFinished = function0;
        this.$libraryUiState$delegate = c1bo;
        this.$selectedTab$delegate = mutableState;
        this.$viewMode$delegate = mutableState2;
        this.$selectedArtifactFile$delegate = mutableState3;
    }

    @Override // X.G0W
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC05151eP interfaceC05151eP, BFM bfm, Integer num) {
        invoke(interfaceC05151eP, bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(InterfaceC05151eP interfaceC05151eP, BFM bfm, int i) {
        if (AnonymousClass001.A1b(AnonymousClass005.A1N(i, interfaceC05151eP), bfm, i)) {
            C1BO<HatchLibraryViewModel.UiState> c1bo = this.$libraryUiState$delegate;
            int i2 = HatchLibraryTabScreenKt.ARTIFACTS_TAB_INDEX;
            HatchLibraryViewModel.UiState value = c1bo.getValue();
            int iA02 = MutableState.A02((MutableState) this.$selectedTab$delegate);
            LibraryViewMode value2 = this.$viewMode$delegate.getValue();
            HatchLibraryViewModel hatchLibraryViewModel = this.$viewModel;
            boolean zA67 = bfm.A67(hatchLibraryViewModel);
            Object objAaT = bfm.AaT();
            if (zA67 || objAaT == C78N.A00) {
                objAaT = new HatchLibraryTabScreenKt$HatchLibraryTabScreen$3$3$1$2$1$1(hatchLibraryViewModel);
                bfm.Ai0(objAaT);
            }
            InterfaceC7353EnQ interfaceC7353EnQ = (InterfaceC7353EnQ) objAaT;
            HatchLibraryViewModel hatchLibraryViewModel2 = this.$viewModel;
            boolean zA672 = bfm.A67(hatchLibraryViewModel2);
            Object objAaT2 = bfm.AaT();
            if (zA672 || objAaT2 == C78N.A00) {
                objAaT2 = new HatchLibraryTabScreenKt$HatchLibraryTabScreen$3$3$1$2$2$1(hatchLibraryViewModel2);
                bfm.Ai0(objAaT2);
            }
            InterfaceC7353EnQ interfaceC7353EnQ2 = (InterfaceC7353EnQ) objAaT2;
            HatchLibraryViewModel hatchLibraryViewModel3 = this.$viewModel;
            boolean zA673 = bfm.A67(hatchLibraryViewModel3);
            Object objAaT3 = bfm.AaT();
            if (zA673 || objAaT3 == C78N.A00) {
                objAaT3 = new HatchLibraryTabScreenKt$HatchLibraryTabScreen$3$3$1$2$3$1(hatchLibraryViewModel3);
                bfm.Ai0(objAaT3);
            }
            InterfaceC7353EnQ interfaceC7353EnQ3 = (InterfaceC7353EnQ) objAaT3;
            HatchLibraryViewModel hatchLibraryViewModel4 = this.$viewModel;
            boolean zA674 = bfm.A67(hatchLibraryViewModel4);
            Object objAaT4 = bfm.AaT();
            if (zA674 || objAaT4 == C78N.A00) {
                objAaT4 = new HatchLibraryTabScreenKt$HatchLibraryTabScreen$3$3$1$2$4$1(hatchLibraryViewModel4);
                bfm.Ai0(objAaT4);
            }
            InterfaceC7353EnQ interfaceC7353EnQ4 = (InterfaceC7353EnQ) objAaT4;
            HatchLibraryViewModel hatchLibraryViewModel5 = this.$viewModel;
            boolean zA675 = bfm.A67(hatchLibraryViewModel5);
            Object objAaT5 = bfm.AaT();
            if (zA675 || objAaT5 == C78N.A00) {
                objAaT5 = new HatchLibraryTabScreenKt$HatchLibraryTabScreen$3$3$1$2$5$1(hatchLibraryViewModel5);
                bfm.Ai0(objAaT5);
            }
            InterfaceC7353EnQ interfaceC7353EnQ5 = (InterfaceC7353EnQ) objAaT5;
            float f = this.$halfTabBarDp + AuraDimensKt.SpacingXsmallPlusNano;
            boolean zA1T = AnonymousClass001.A1T(bfm, this.$userSession, bfm.A67(this.$navigator));
            AuraNavigator auraNavigator = this.$navigator;
            AbstractC3358CGz abstractC3358CGz = this.$userSession;
            MutableState<ArtifactFile> mutableState = this.$selectedArtifactFile$delegate;
            Object objAaT6 = bfm.AaT();
            if (zA1T || objAaT6 == C78N.A00) {
                objAaT6 = new HatchLibraryTabScreenKt$HatchLibraryTabScreen$3$3$1$2$6$1(auraNavigator, abstractC3358CGz, mutableState);
                bfm.Ai0(objAaT6);
            }
            HatchLibraryTabScreenKt.m1173LibraryTabContentULtc_mU(value, iA02, value2, (G0U) objAaT6, (Function0) interfaceC7353EnQ, (G0U) interfaceC7353EnQ2, (Function0) interfaceC7353EnQ3, (Function0) interfaceC7353EnQ4, (Function0) interfaceC7353EnQ5, f, this.$listState, null, this.$onViewFinished, bfm, HatchLibraryViewModel.UiState.$stable, 0, 2048);
            return;
        }
        bfm.Afo();
    }
}
