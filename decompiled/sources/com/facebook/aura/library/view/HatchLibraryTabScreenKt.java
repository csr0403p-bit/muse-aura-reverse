package com.facebook.aura.library.view;

import X.AFz;
import X.AGI;
import X.AHH;
import X.AIW;
import X.AKQ;
import X.AbstractC0878AGe;
import X.AbstractC2271BQs;
import X.AbstractC3358CGz;
import X.AbstractC7559F3s;
import X.AcQ;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.AnonymousClass007;
import X.AnonymousClass011;
import X.AnonymousClass037;
import X.AxM;
import X.B1V;
import X.BBI;
import X.BBb;
import X.BFM;
import X.BOf;
import X.BRg;
import X.BS0;
import X.BzK;
import X.C00x;
import X.C06G;
import X.C06I;
import X.C0924AIa;
import X.C0CD;
import X.C0t8;
import X.C0z7;
import X.C10G;
import X.C1515AkP;
import X.C1BO;
import X.C1YL;
import X.C2CK;
import X.C2VU;
import X.C3U4;
import X.C3UX;
import X.C4oT;
import X.C7384Etj;
import X.C78N;
import X.F60;
import X.FGI;
import X.G0U;
import X.G0V;
import X.G2j;
import X.HxE;
import X.InterfaceC1380AiA;
import X.InterfaceC1516AkQ;
import android.view.View;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.R;
import com.facebook.aura.analytics.hatch.HatchComponent;
import com.facebook.aura.analytics.hatch.HatchImpressionModifierKt;
import com.facebook.aura.analytics.hatch.HatchInteractionLogger;
import com.facebook.aura.analytics.hatch.HatchMetadataKey;
import com.facebook.aura.analytics.hatch.HatchOrigin;
import com.facebook.aura.analytics.hatch.HatchScreen;
import com.facebook.aura.analytics.hatch.HatchSubsurface;
import com.facebook.aura.analytics.hatch.HatchSurface;
import com.facebook.aura.common.prefs.HatchPrefsStore;
import com.facebook.aura.file.view.ArtifactFileActionMenuKt;
import com.facebook.aura.header.view.HatchTabScreenKt;
import com.facebook.aura.header.view.HeaderButton;
import com.facebook.aura.header.view.HeaderLeadingButton;
import com.facebook.aura.header.view.ScrimScrollConnectionKt;
import com.facebook.aura.library.model.ArtifactFile;
import com.facebook.aura.library.model.HatchLibraryViewModel;
import com.facebook.aura.library.model.HatchPendingLibrarySegment;
import com.facebook.aura.library.model.LibrarySegment;
import com.facebook.aura.library.repo.ArtifactItem;
import com.facebook.aura.library.repo.ArtifactPlacement;
import com.facebook.aura.library.repo.ArtifactPlacementRequest;
import com.facebook.aura.library.repo.ArtifactSortMode;
import com.facebook.aura.library.repo.ArtifactSource;
import com.facebook.aura.library.repo.ArtifactsDataSource;
import com.facebook.aura.library.repo.LoadingState;
import com.facebook.aura.library.repo.UnifiedArtifactsRepository;
import com.facebook.aura.model.SpaceConstructionStatus;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.navigation.key.LibraryScreenKey;
import com.facebook.aura.perf.HatchNavTTRCCoordinator;
import com.facebook.aura.spaces.menu.SpaceContextMenuKt;
import com.facebook.aura.spaces.menu.SpaceMenuLogOrigin;
import com.facebook.aura.spaces.menu.SpaceRenameDialogKt;
import com.facebook.aura.spaces.repo.PinnedItemsRepository;
import com.facebook.aura.utils.HatchUtils;
import com.facebook.aura.vds.compose.base.AuraDimensKt;
import com.facebook.aura.vds.compose.icons.AuraIconKt;
import com.facebook.aura.vds.compose.icons.AuraIconSize;
import com.facebook.aura.vds.compose.segmentedtabs.TextTab;
import com.facebook.aura.vds.compose.text.AuraTextKt;
import com.facebook.common.dextricks.RuntimeInternals;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public abstract class HatchLibraryTabScreenKt {
    public static final int ARTIFACTS_TAB_INDEX = 0;
    public static final String ARTIFACT_TYPE_FILE = "file";
    public static final int GRID_COLUMNS = 2;
    public static final String LIBRARY_VIEW_MODE_PREF_KEY = "library_view_mode";
    public static final int MEDIA_GRID_COLUMNS = 3;
    public static final int MEDIA_TAB_INDEX = 1;
    public static final float TAB_SHADOW_MAX_ALPHA = 0.08f;
    public static final String TAG = "HatchLibraryTabScreen";
    public static final AHH<TextTab> librarySubTabs = AGI.A0E(new TextTab(R.string._name_removed__res_0x7f120c79, null), new TextTab(R.string._name_removed__res_0x7f120c64, null));
    public static final float GRID_SPACING = 10.0f;
    public static final float GRID_MIN_CELL_WIDTH = 190.0f;
    public static final float MEDIA_GRID_MIN_CELL_WIDTH = 140.0f;
    public static final float MEDIA_GRID_SPACING = 2.0f;
    public static final float MEDIA_GRID_CORNER_RADIUS = 20.0f;
    public static final float TAB_SHADOW_BLUR = 16.0f;
    public static final float TAB_HORIZONTAL_PADDING = 16.0f;
    public static final float TAB_VERTICAL_PADDING = 12.0f;
    public static final float TAB_CONTAINER_PADDING = 6.0f;

    /* renamed from: com.facebook.aura.library.view.HatchLibraryTabScreenKt$ArtifactGridCell$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ ArtifactFile $artifact;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ G0U<ArtifactFile, Unit> $onArtifactClick;
        public final /* synthetic */ Function0<Unit> $onArtifactDeleted;
        public final /* synthetic */ G0U<ArtifactFile, Unit> $onTogglePin;
        public final /* synthetic */ boolean $showPinAction;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass2(ArtifactFile artifactFile, G0U<? super ArtifactFile, Unit> g0u, Function0<Unit> function0, G0U<? super ArtifactFile, Unit> g0u2, boolean z, BRg bRg, int i, int i2) {
            super(2);
            this.$artifact = artifactFile;
            this.$onArtifactClick = g0u;
            this.$onArtifactDeleted = function0;
            this.$onTogglePin = g0u2;
            this.$showPinAction = z;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            HatchLibraryTabScreenKt.ArtifactGridCell(this.$artifact, this.$onArtifactClick, this.$onArtifactDeleted, this.$onTogglePin, this.$showPinAction, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.library.view.HatchLibraryTabScreenKt$ArtifactListItem$2, reason: invalid class name and case insensitive filesystem */
    public final class C123932 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ ArtifactFile $artifact;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ G0U<ArtifactFile, Unit> $onArtifactClick;
        public final /* synthetic */ Function0<Unit> $onArtifactDeleted;
        public final /* synthetic */ G0U<ArtifactFile, Unit> $onTogglePin;
        public final /* synthetic */ boolean $showPinAction;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C123932(ArtifactFile artifactFile, G0U<? super ArtifactFile, Unit> g0u, Function0<Unit> function0, G0U<? super ArtifactFile, Unit> g0u2, boolean z, BRg bRg, int i, int i2) {
            super(2);
            this.$artifact = artifactFile;
            this.$onArtifactClick = g0u;
            this.$onArtifactDeleted = function0;
            this.$onTogglePin = g0u2;
            this.$showPinAction = z;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            HatchLibraryTabScreenKt.ArtifactListItem(this.$artifact, this.$onArtifactClick, this.$onArtifactDeleted, this.$onTogglePin, this.$showPinAction, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.library.view.HatchLibraryTabScreenKt$HatchLibraryTabScreen$5, reason: invalid class name */
    public final class AnonymousClass5 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ HatchLibraryViewModel $viewModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass5(HatchLibraryViewModel hatchLibraryViewModel, BRg bRg, int i, int i2) {
            super(2);
            this.$viewModel = hatchLibraryViewModel;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            HatchLibraryTabScreenKt.HatchLibraryTabScreen(this.$viewModel, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.library.view.HatchLibraryTabScreenKt$LibraryItemContextMenu$2, reason: invalid class name and case insensitive filesystem */
    public final class C123942 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ ArtifactFile $artifact;
        public final /* synthetic */ boolean $expanded;
        public final /* synthetic */ Function0<Unit> $onArtifactDeleted;
        public final /* synthetic */ Function0<Unit> $onDismiss;
        public final /* synthetic */ Function0<Unit> $onTogglePin;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C123942(ArtifactFile artifactFile, boolean z, Function0<Unit> function0, Function0<Unit> function02, Function0<Unit> function03, int i, int i2) {
            super(2);
            this.$artifact = artifactFile;
            this.$expanded = z;
            this.$onDismiss = function0;
            this.$onArtifactDeleted = function02;
            this.$onTogglePin = function03;
            this.$$changed = i;
            this.$$default = i2;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            HatchLibraryTabScreenKt.LibraryItemContextMenu(this.$artifact, this.$expanded, this.$onDismiss, this.$onArtifactDeleted, this.$onTogglePin, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.library.view.HatchLibraryTabScreenKt$LibraryItemContextMenu$9, reason: invalid class name */
    public final class AnonymousClass9 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ ArtifactFile $artifact;
        public final /* synthetic */ boolean $expanded;
        public final /* synthetic */ Function0<Unit> $onArtifactDeleted;
        public final /* synthetic */ Function0<Unit> $onDismiss;
        public final /* synthetic */ Function0<Unit> $onTogglePin;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass9(ArtifactFile artifactFile, boolean z, Function0<Unit> function0, Function0<Unit> function02, Function0<Unit> function03, int i, int i2) {
            super(2);
            this.$artifact = artifactFile;
            this.$expanded = z;
            this.$onDismiss = function0;
            this.$onArtifactDeleted = function02;
            this.$onTogglePin = function03;
            this.$$changed = i;
            this.$$default = i2;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            HatchLibraryTabScreenKt.LibraryItemContextMenu(this.$artifact, this.$expanded, this.$onDismiss, this.$onArtifactDeleted, this.$onTogglePin, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.library.view.HatchLibraryTabScreenKt$LibraryTabEmptyState$2, reason: invalid class name and case insensitive filesystem */
    public final class C123952 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ int $subtitleRes;
        public final /* synthetic */ int $titleRes;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C123952(int i, int i2, BRg bRg, int i3, int i4) {
            super(2);
            this.$titleRes = i;
            this.$subtitleRes = i2;
            this.$modifier = bRg;
            this.$$changed = i3;
            this.$$default = i4;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            HatchLibraryTabScreenKt.LibraryTabEmptyState(this.$titleRes, this.$subtitleRes, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00d8 A[PHI: r32
  0x00d8: PHI (r32v2 boolean) = (r32v0 boolean), (r32v3 boolean) binds: [B:32:0x009c, B:30:0x0098] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0244 A[PHI: r10
  0x0244: PHI (r10v13 java.lang.String) = (r10v7 java.lang.String), (r10v14 java.lang.String) binds: [B:70:0x0162, B:66:0x015a] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void ArtifactGridCell(com.facebook.aura.library.model.ArtifactFile r38, X.G0U<? super com.facebook.aura.library.model.ArtifactFile, kotlin.Unit> r39, kotlin.jvm.functions.Function0<kotlin.Unit> r40, X.G0U<? super com.facebook.aura.library.model.ArtifactFile, kotlin.Unit> r41, boolean r42, X.BRg r43, X.BFM r44, int r45, int r46) {
        /*
            Method dump skipped, instructions count: 590
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.library.view.HatchLibraryTabScreenKt.ArtifactGridCell(com.facebook.aura.library.model.ArtifactFile, X.G0U, kotlin.jvm.functions.Function0, X.G0U, boolean, X.BRg, X.BFM, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00dc A[PHI: r37
  0x00dc: PHI (r37v2 boolean) = (r37v0 boolean), (r37v3 boolean) binds: [B:32:0x00a0, B:30:0x009c] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void ArtifactListItem(com.facebook.aura.library.model.ArtifactFile r43, X.G0U<? super com.facebook.aura.library.model.ArtifactFile, kotlin.Unit> r44, kotlin.jvm.functions.Function0<kotlin.Unit> r45, X.G0U<? super com.facebook.aura.library.model.ArtifactFile, kotlin.Unit> r46, boolean r47, X.BRg r48, X.BFM r49, int r50, int r51) {
        /*
            Method dump skipped, instructions count: 665
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.library.view.HatchLibraryTabScreenKt.ArtifactListItem(com.facebook.aura.library.model.ArtifactFile, X.G0U, kotlin.jvm.functions.Function0, X.G0U, boolean, X.BRg, X.BFM, int, int):void");
    }

    /* renamed from: ArtifactSectionHeader-uFdPcIQ, reason: not valid java name */
    public static final void m1172ArtifactSectionHeaderuFdPcIQ(String str, float f, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(2131141552);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, str) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A05(bfm, f);
        }
        int i3 = i2 & 4;
        if (i3 != 0) {
            iA0d |= 384;
        } else if ((i & 384) == 0) {
            iA0d |= AnonymousClass004.A0f(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1J(iA0d), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            AuraTextKt.m2639AuraTextUY9GdpU(str, C3U4.A0C(C3U4.A0B(AnonymousClass001.A0R(bRg2), f, 0.0f), 0.0f, AuraDimensKt.SpacingSmall, 0.0f, AuraDimensKt.SpacingXsmall), C06G.A0C(bfm), C06G.A0X(bfm), null, null, null, false, 0, 0, 0, null, null, null, bfm, iA0d & 14, 0, 16368);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new HatchLibraryTabScreenKt$ArtifactSectionHeader$1(str, f, bRg2, i, i2);
        }
    }

    public static final void HatchLibraryTabScreen(HatchLibraryViewModel hatchLibraryViewModel, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        C7384Etj.A0Y(hatchLibraryViewModel, 0);
        bfm.AgG(1990043592);
        int iA05 = (i & 6) == 0 ? AnonymousClass002.A05(AnonymousClass004.A1X(hatchLibraryViewModel, bfm, i) ? 1 : 0) | i : i;
        int i3 = i2 & 2;
        if (i3 != 0) {
            iA05 |= 48;
        } else if ((i & 48) == 0) {
            iA05 |= AnonymousClass004.A0e(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1H(iA05), bfm, iA05)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            C1BO c1boA02 = C2CK.A02(bfm, hatchLibraryViewModel.uiState);
            Object objAaT = bfm.AaT();
            Object obj = C78N.A00;
            if (objAaT == obj) {
                objAaT = AnonymousClass004.A11(bfm, null);
            }
            MutableState mutableState = (MutableState) objAaT;
            Object[] objArr = new Object[0];
            Object objAaT2 = bfm.AaT();
            if (objAaT2 == obj) {
                objAaT2 = HatchLibraryTabScreenKt$HatchLibraryTabScreen$selectedTab$2$1.INSTANCE;
                bfm.Ai0(objAaT2);
            }
            MutableState mutableStateA0N = AnonymousClass002.A0N(bfm, objAaT2, objArr);
            MutableState mutableState2 = (MutableState) AnonymousClass005.A0h(bfm, obj, false);
            C1BO c1boA022 = C2CK.A02(bfm, HatchPendingLibrarySegment.segment);
            Object value = c1boA022.getValue();
            boolean zA1K = AnonymousClass003.A1K(bfm, c1boA022, mutableStateA0N);
            Object objAaT3 = bfm.AaT();
            if (zA1K || objAaT3 == obj) {
                objAaT3 = new HatchLibraryTabScreenKt$HatchLibraryTabScreen$1$1(c1boA022, mutableStateA0N);
                bfm.Ai0(objAaT3);
            }
            AnonymousClass001.A17(bfm, objAaT3, value);
            AbstractC3358CGz abstractC3358CGzA0h = AnonymousClass002.A0h(bfm);
            boolean zA65 = bfm.A65(abstractC3358CGzA0h);
            Object objAaT4 = bfm.AaT();
            if (zA65 || objAaT4 == obj) {
                objAaT4 = HatchPrefsStore.INSTANCE.userPrefs(abstractC3358CGzA0h);
                bfm.Ai0(objAaT4);
            }
            C4oT c4oT = (C4oT) objAaT4;
            boolean zA652 = bfm.A65(c4oT);
            Object objAaT5 = bfm.AaT();
            if (zA652 || objAaT5 == obj) {
                objAaT5 = AnonymousClass004.A11(bfm, readLibraryViewMode(c4oT));
            }
            MutableState mutableState3 = (MutableState) objAaT5;
            Function0<Unit> function0RememberLibraryTabTtrc = rememberLibraryTabTtrc(bfm, 0);
            AuraNavigator auraNavigatorA0b = AnonymousClass002.A0b(bfm);
            LazyListState lazyListStateRememberScrimBoundLazyListState = ScrimScrollConnectionKt.rememberScrimBoundLazyListState(0, 0, bfm, 0, 3);
            C3UX c3ux = (C3UX) AnonymousClass004.A15(bfm, bfm.AaT(), obj);
            ArtifactSortMode artifactSortMode = ((HatchLibraryViewModel.UiState) c1boA02.getValue()).sortMode;
            int iA02 = MutableState.A02(mutableStateA0N);
            StringBuilder sb = new StringBuilder();
            sb.append(artifactSortMode);
            sb.append("_");
            sb.append(iA02);
            String string = sb.toString();
            Object[] objArr2 = new Object[0];
            boolean zA653 = bfm.A65(string);
            Object objAaT6 = bfm.AaT();
            if (zA653 || objAaT6 == obj) {
                objAaT6 = new HatchLibraryTabScreenKt$HatchLibraryTabScreen$lastSortTabKey$2$1(string);
                bfm.Ai0(objAaT6);
            }
            MutableState mutableStateA0N2 = AnonymousClass002.A0N(bfm, objAaT6, objArr2);
            boolean zA1R = AnonymousClass005.A1R(bfm, string, mutableStateA0N2, lazyListStateRememberScrimBoundLazyListState);
            Object objAaT7 = bfm.AaT();
            if (zA1R || objAaT7 == obj) {
                objAaT7 = new HatchLibraryTabScreenKt$HatchLibraryTabScreen$2$1(string, lazyListStateRememberScrimBoundLazyListState, mutableStateA0N2, null);
                bfm.Ai0(objAaT7);
            }
            AnonymousClass001.A18(bfm, objAaT7, string);
            float fA00 = C06G.A00(bfm);
            Object[] objArr3 = new Object[0];
            Object objAaT8 = bfm.AaT();
            if (objAaT8 == obj) {
                objAaT8 = HatchLibraryTabScreenKt$HatchLibraryTabScreen$impressionKey$1$1.INSTANCE;
                bfm.Ai0(objAaT8);
            }
            long jLongValue = ((Number) AFz.A03(bfm, (Function0) objAaT8, objArr3)).longValue();
            Object objAaT9 = bfm.AaT();
            if (objAaT9 == obj) {
                objAaT9 = HatchImpressionModifierKt.hatchImpression(BRg.A00, HatchOrigin.LIBRARY, HatchSurface.LIBRARY, null, HatchScreen.LIBRARY_HOME, null, null, null, null, 500L, 0.0f, FGI.A0B(jLongValue, "library_home:"), null, null);
                bfm.Ai0(objAaT9);
            }
            BRg bRg3 = (BRg) objAaT9;
            boolean zA654 = bfm.A65(mutableStateA0N);
            Object objAaT10 = bfm.AaT();
            if (zA654 || objAaT10 == obj) {
                objAaT10 = new HatchLibraryTabScreenKt$HatchLibraryTabScreen$onTabSelected$1$1(mutableStateA0N);
                bfm.Ai0(objAaT10);
            }
            G0U g0u = (G0U) objAaT10;
            BS0 bs0 = BRg.A00;
            InterfaceC1380AiA interfaceC1380AiAA0c = AnonymousClass001.A0c(false);
            BBI bbi = (BBI) bfm;
            int iA0J = AnonymousClass003.A0J(bbi);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bs0);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function0);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA0c, akqA04, bRgA01, iA0J);
            C0z7 c0z7 = C0z7.A00;
            LibraryScreenKey libraryScreenKey = LibraryScreenKey.INSTANCE;
            BRg bRgThen = bRg2.then(bRg3);
            HeaderLeadingButton headerLeadingButton = HeaderLeadingButton.SidePanel;
            long jA0B = C06G.A0B(bfm);
            AHH ahhA0E = AGI.A0E(HeaderButton.MoreOptions);
            Object objAaT11 = bfm.AaT();
            if (objAaT11 == obj) {
                objAaT11 = new HatchLibraryTabScreenKt$HatchLibraryTabScreen$3$1$1(mutableState2);
                bfm.Ai0(objAaT11);
            }
            G0U g0u2 = (G0U) objAaT11;
            boolean zA1N = AnonymousClass003.A1N(bfm, c3ux, lazyListStateRememberScrimBoundLazyListState);
            Object objAaT12 = bfm.AaT();
            if (zA1N || objAaT12 == obj) {
                objAaT12 = new HatchLibraryTabScreenKt$HatchLibraryTabScreen$3$2$1(c3ux, lazyListStateRememberScrimBoundLazyListState);
                bfm.Ai0(objAaT12);
            }
            HatchTabScreenKt.m1022HatchTabScreenTsp2nRQ(libraryScreenKey, bRgThen, null, null, jA0B, null, null, 0.0f, false, null, null, ahhA0E, g0u2, null, null, headerLeadingButton, false, false, null, (Function0) objAaT12, null, null, false, false, false, false, 0.0f, null, B1V.A00(bfm, new HatchLibraryTabScreenKt$HatchLibraryTabScreen$3$3(hatchLibraryViewModel, c1boA02, auraNavigatorA0b, abstractC3358CGzA0h, lazyListStateRememberScrimBoundLazyListState, function0RememberLibraryTabTtrc, mutableStateA0N, mutableState3, mutableState, fA00, g0u), 1651037066), bfm, 6, 197040, 100663296, 267872236);
            BRg bRgA4C = c0z7.A4C(C2VU.A0D, bs0);
            boolean zA0A = MutableState.A0A(mutableState2);
            boolean zA1M = AnonymousClass002.A1M(MutableState.A02(mutableStateA0N));
            LibraryViewMode libraryViewMode = (LibraryViewMode) mutableState3.getValue();
            ArtifactSortMode artifactSortMode2 = ((HatchLibraryViewModel.UiState) c1boA02.getValue()).sortMode;
            Object objAaT13 = bfm.AaT();
            if (objAaT13 == obj) {
                objAaT13 = new HatchLibraryTabScreenKt$HatchLibraryTabScreen$3$4$1(mutableState2);
                bfm.Ai0(objAaT13);
            }
            Function0 function02 = (Function0) objAaT13;
            Object objAaT14 = bfm.AaT();
            if (objAaT14 == obj) {
                objAaT14 = new HatchLibraryTabScreenKt$HatchLibraryTabScreen$3$5$1(mutableState2);
                bfm.Ai0(objAaT14);
            }
            Function0 function03 = (Function0) objAaT14;
            boolean zA1J = AnonymousClass003.A1J(bfm, mutableState3, c4oT);
            Object objAaT15 = bfm.AaT();
            if (zA1J || objAaT15 == obj) {
                objAaT15 = new HatchLibraryTabScreenKt$HatchLibraryTabScreen$3$6$1(c4oT, mutableState3);
                bfm.Ai0(objAaT15);
            }
            G0U g0u3 = (G0U) objAaT15;
            boolean z = (iA05 & 14) == 4 || ((iA05 & 8) != 0 && bfm.A67(hatchLibraryViewModel));
            Object objAaT16 = bfm.AaT();
            if (z || objAaT16 == obj) {
                objAaT16 = new HatchLibraryTabScreenKt$HatchLibraryTabScreen$3$7$1(hatchLibraryViewModel);
                bfm.Ai0(objAaT16);
            }
            G0U g0u4 = (G0U) objAaT16;
            boolean zA67 = bfm.A67(auraNavigatorA0b);
            Object objAaT17 = bfm.AaT();
            if (zA67 || objAaT17 == obj) {
                objAaT17 = new HatchLibraryTabScreenKt$HatchLibraryTabScreen$3$8$1(auraNavigatorA0b);
                bfm.Ai0(objAaT17);
            }
            LibraryOverflowMenuKt.LibraryOverflowMenu(zA0A, zA1M, true, libraryViewMode, artifactSortMode2, function02, function03, g0u3, g0u4, (Function0) objAaT17, bRgA4C, bfm, 1769856, 0, 0);
            BBI.A0R(bbi, true);
            ArtifactFile artifactFile = (ArtifactFile) mutableState.getValue();
            if (artifactFile == null) {
                bfm.AgE(1965623200);
            } else {
                Object objA0p = AnonymousClass001.A0p(bfm, 1965623201);
                if (objA0p == obj) {
                    objA0p = new HatchLibraryTabScreenKt$HatchLibraryTabScreen$4$1$1(mutableState);
                    bfm.Ai0(objA0p);
                }
                ArtifactsSectionKt.ArtifactFileViewer(artifactFile, (Function0) objA0p, bfm, ArtifactFile.$stable | 48);
            }
            BBI.A0R(bbi, false);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass5(hatchLibraryViewModel, bRg2, i, i2);
        }
    }

    public static final void LibraryItemContextMenu(ArtifactFile artifactFile, boolean z, Function0<Unit> function0, Function0<Unit> function02, Function0<Unit> function03, BFM bfm, int i, int i2) {
        BBb bBbAAc;
        G0V<? super BFM, ? super Integer, Unit> anonymousClass9;
        String strA0f;
        Function0 function04;
        Function0 function05;
        SpaceConstructionStatus spaceConstructionStatus;
        Function0 function06;
        Function0<Unit> function07 = function03;
        bfm.AgG(1544474470);
        int iA05 = (i & 6) == 0 ? AnonymousClass002.A05(AnonymousClass004.A1X(artifactFile, bfm, i) ? 1 : 0) | i : i;
        if ((i & 48) == 0) {
            iA05 |= AnonymousClass004.A0o(bfm, z);
        }
        if ((i & 384) == 0) {
            iA05 |= AnonymousClass004.A0V(bfm, function0);
        }
        if ((i & 3072) == 0) {
            iA05 |= AnonymousClass004.A0W(bfm, function02);
        }
        int i3 = i2 & 16;
        if (i3 != 0) {
            iA05 |= RuntimeInternals.IOPRIO_BACKGROUND;
        } else if ((i & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA05 |= AnonymousClass004.A0X(bfm, function07);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA05 & 9363, 9362), bfm, iA05)) {
            if (i3 != 0) {
                function07 = null;
            }
            if (artifactFile.source == ArtifactSource.PEER_SPACE) {
                bfm.AgE(-545466522);
                PeerSpaceLibraryItemsKt.PeerSpaceItemContextMenu(artifactFile, z, function0, function02, artifactFile.canPin ? function07 : null, bfm, AnonymousClass003.A06(iA05, ArtifactFile.$stable | (iA05 & 14)));
                bBbAAc = AnonymousClass002.A0Q(bfm, bfm);
                if (bBbAAc != null) {
                    anonymousClass9 = new C123942(artifactFile, z, function0, function02, function07, i, i2);
                    bBbAAc.A06 = anonymousClass9;
                }
                return;
            }
            BBI bbiA0M = AnonymousClass002.A0M(bfm, -545291620);
            String str = artifactFile.spaceSlug;
            AbstractC3358CGz abstractC3358CGzA0h = AnonymousClass002.A0h(bfm);
            AuraNavigator auraNavigatorA0b = AnonymousClass002.A0b(bfm);
            boolean zA65 = bfm.A65(abstractC3358CGzA0h);
            Object objAaT = bfm.AaT();
            if (zA65 || objAaT == C78N.A00) {
                objAaT = UnifiedArtifactsRepository.Companion.getInstance(abstractC3358CGzA0h);
                bfm.Ai0(objAaT);
            }
            UnifiedArtifactsRepository unifiedArtifactsRepository = (UnifiedArtifactsRepository) objAaT;
            boolean zA652 = bfm.A65(abstractC3358CGzA0h);
            Object objAaT2 = bfm.AaT();
            if (zA652 || objAaT2 == C78N.A00) {
                objAaT2 = AnonymousClass003.A0a(bfm, abstractC3358CGzA0h);
            }
            ArtifactsDataSource artifactsDataSource = (ArtifactsDataSource) objAaT2;
            boolean zA653 = bfm.A65(abstractC3358CGzA0h);
            Object objAaT3 = bfm.AaT();
            if (zA653 || objAaT3 == C78N.A00) {
                objAaT3 = PinnedItemsRepository.Companion.getInstance(abstractC3358CGzA0h);
                bfm.Ai0(objAaT3);
            }
            PinnedItemsRepository pinnedItemsRepository = (PinnedItemsRepository) objAaT3;
            Object objAaT4 = bfm.AaT();
            Object obj = C78N.A00;
            C3UX c3ux = (C3UX) AnonymousClass004.A15(bfm, objAaT4, obj);
            View viewA0J = AnonymousClass001.A0J(bfm);
            String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120487);
            String strA012 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120486);
            String strA013 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f12060b);
            String strA014 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f12060d);
            Object objAaT5 = bfm.AaT();
            if (objAaT5 == obj) {
                objAaT5 = AnonymousClass005.A0R(bfm, false);
            }
            MutableState mutableState = (MutableState) objAaT5;
            Object objAaT6 = bfm.AaT();
            if (objAaT6 == obj) {
                objAaT6 = AnonymousClass004.A11(bfm, "");
            }
            MutableState mutableState2 = (MutableState) objAaT6;
            int i4 = iA05 & 14;
            boolean z2 = i4 == 4 || ((iA05 & 8) != 0 && bfm.A65(artifactFile));
            Object objAaT7 = bfm.AaT();
            if (z2 || objAaT7 == obj) {
                objAaT7 = artifactFile.placementRequest(ArtifactPlacement.SPACES);
                bfm.Ai0(objAaT7);
            }
            ArtifactPlacementRequest artifactPlacementRequest = (ArtifactPlacementRequest) objAaT7;
            if (str == null || !artifactFile.isOwnedSpace) {
                bfm.AgE(-544077722);
                BBI.A0R(bbiA0M, false);
                strA0f = null;
            } else {
                bfm.AgE(-544171807);
                strA0f = AnonymousClass003.A0f(bfm, bbiA0M, artifactFile.name, R.string._name_removed__res_0x7f120226);
            }
            if (artifactPlacementRequest == null || !HatchUtils.INSTANCE.isSidePanelSpacesEnabled()) {
                bfm.AgE(-543879974);
                BBI.A0R(bbiA0M, false);
                function04 = null;
            } else {
                boolean zA1W = AnonymousClass005.A1W(bfm, viewA0J, strA01, strA012, AnonymousClass004.A1M(iA05) | AnonymousClass005.A1V(bfm, c3ux, unifiedArtifactsRepository, pinnedItemsRepository, AnonymousClass001.A1Z(artifactPlacementRequest, bfm, -543879973)));
                Object objAaT8 = bfm.AaT();
                if (zA1W || objAaT8 == obj) {
                    objAaT8 = new HatchLibraryTabScreenKt$LibraryItemContextMenu$onMoveToSpaces$2$1$1(artifactPlacementRequest, c3ux, unifiedArtifactsRepository, pinnedItemsRepository, function02, viewA0J, strA01, strA012);
                    bfm.Ai0(objAaT8);
                }
                function04 = (Function0) objAaT8;
                BBI.A0R(bbiA0M, false);
            }
            long jA0B = AnonymousClass007.A0B(C06G.A00(bfm), AuraDimensKt.SpacingSmall);
            if (str != null) {
                bfm.AgE(-542326408);
                ArtifactItem artifactItemRememberSpaceNavItem = SpaceContextMenuKt.rememberSpaceNavItem(str, bfm, 0);
                String str2 = artifactFile.name;
                boolean z3 = artifactFile.isPinned;
                Function0 function08 = null;
                boolean z4 = artifactFile.canShare;
                boolean z5 = artifactFile.canDownloadHtml;
                boolean z6 = artifactFile.isOwnedSpace;
                if (artifactItemRememberSpaceNavItem != null) {
                    spaceConstructionStatus = artifactItemRememberSpaceNavItem.constructionStatus;
                    function06 = null;
                } else {
                    spaceConstructionStatus = null;
                    function06 = null;
                }
                String str3 = artifactFile.spaceIcon;
                if (z6) {
                    bfm.AgE(-541826502);
                    boolean z7 = i4 == 4 || ((iA05 & 8) != 0 && bfm.A67(artifactFile));
                    Object objAaT9 = bfm.AaT();
                    if (z7 || objAaT9 == obj) {
                        objAaT9 = new HatchLibraryTabScreenKt$LibraryItemContextMenu$3$1(artifactFile, mutableState2, mutableState);
                        bfm.Ai0(objAaT9);
                    }
                    function08 = (Function0) objAaT9;
                    BBI.A0R(bbiA0M, false);
                } else {
                    bfm.AgE(-541694566);
                    BBI.A0R(bbiA0M, false);
                }
                if (strA0f == null) {
                    bfm.AgE(-541598746);
                } else {
                    bfm.AgE(-541598745);
                    boolean zA1J = AnonymousClass003.A1J(bfm, strA0f, auraNavigatorA0b);
                    Object objAaT10 = bfm.AaT();
                    if (zA1J || objAaT10 == obj) {
                        objAaT10 = new HatchLibraryTabScreenKt$LibraryItemContextMenu$4$1$1(strA0f, auraNavigatorA0b);
                        bfm.Ai0(objAaT10);
                    }
                    function06 = (Function0) objAaT10;
                }
                BBI.A0R(bbiA0M, false);
                SpaceMenuLogOrigin.LibraryRow libraryRow = SpaceMenuLogOrigin.LibraryRow.INSTANCE;
                SpaceContextMenuKt.m2179SpaceContextMenuxDtEYtk(str, str2, z, function0, function02, null, false, z3, function07, z4, z5, z6, false, null, spaceConstructionStatus, str3, false, function08, function06, null, function04, null, jA0B, libraryRow, bfm, ((iA05 << 3) & 65408) | (234881024 & (iA05 << 12)), 0, 3072, 2699360);
                if (MutableState.A0A(mutableState)) {
                    bfm.AgE(-541133931);
                    String strA05 = MutableState.A05(mutableState2);
                    Object objAaT11 = bfm.AaT();
                    if (objAaT11 == obj) {
                        objAaT11 = new HatchLibraryTabScreenKt$LibraryItemContextMenu$5$1(mutableState2);
                        bfm.Ai0(objAaT11);
                    }
                    G0U g0u = (G0U) objAaT11;
                    boolean zA1W2 = AnonymousClass005.A1W(bfm, viewA0J, strA013, strA014, AnonymousClass005.A1X(bfm, str, artifactsDataSource, bfm.A67(c3ux), bfm.A67(unifiedArtifactsRepository)));
                    Object objAaT12 = bfm.AaT();
                    if (zA1W2 || objAaT12 == obj) {
                        objAaT12 = new HatchLibraryTabScreenKt$LibraryItemContextMenu$6$1(c3ux, mutableState2, unifiedArtifactsRepository, str, artifactsDataSource, viewA0J, strA013, strA014, mutableState);
                        bfm.Ai0(objAaT12);
                    }
                    Function0 function09 = (Function0) objAaT12;
                    Object objAaT13 = bfm.AaT();
                    if (objAaT13 == obj) {
                        objAaT13 = new HatchLibraryTabScreenKt$LibraryItemContextMenu$7$1(mutableState);
                        bfm.Ai0(objAaT13);
                    }
                    SpaceRenameDialogKt.SpaceRenameDialog(strA05, g0u, function09, (Function0) objAaT13, null, libraryRow, bfm, 199728, 16);
                } else {
                    bfm.AgE(-539743364);
                }
                BBI.A0R(bbiA0M, false);
            } else {
                bfm.AgE(-539711992);
                String str4 = artifactFile.displayPath;
                String str5 = artifactFile.name;
                String str6 = artifactFile.imageUri;
                String fileExtension = artifactFile.getFileExtension();
                boolean z8 = artifactFile.canShare;
                boolean z9 = artifactFile.isPinned;
                if (function07 == null) {
                    bfm.AgE(-539315410);
                    BBI.A0R(bbiA0M, false);
                    function05 = null;
                } else {
                    bfm.AgE(-539315409);
                    boolean zA1R = AnonymousClass001.A1R(bfm, function07, i4 == 4 || ((iA05 & 8) != 0 && bfm.A67(artifactFile)));
                    Object objAaT14 = bfm.AaT();
                    if (zA1R || objAaT14 == obj) {
                        objAaT14 = new HatchLibraryTabScreenKt$LibraryItemContextMenu$8$1$1(artifactFile, function07);
                        bfm.Ai0(objAaT14);
                    }
                    function05 = (Function0) objAaT14;
                    BBI.A0R(bbiA0M, false);
                }
                ArtifactFileActionMenuKt.m883ArtifactFileActionMenunEJ3PNA(str4, str5, str6, fileExtension, z8, z, function0, function02, null, z9, function05, HatchScreen.LIBRARY_HOME, "library_artifacts", jA0B, false, bfm, (iA05 << 12) & android.R.attr.shouldUseDefaultUnfoldTransition, 432, 16640);
            }
            BBI.A0R(bbiA0M, false);
        } else {
            bfm.Afo();
        }
        bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            anonymousClass9 = new AnonymousClass9(artifactFile, z, function0, function02, function07, i, i2);
            bBbAAc.A06 = anonymousClass9;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x00cd  */
    /* renamed from: LibraryTabContent-ULtc_mU, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m1173LibraryTabContentULtc_mU(com.facebook.aura.library.model.HatchLibraryViewModel.UiState r50, int r51, com.facebook.aura.library.view.LibraryViewMode r52, X.G0U<? super com.facebook.aura.library.model.ArtifactFile, kotlin.Unit> r53, kotlin.jvm.functions.Function0<kotlin.Unit> r54, X.G0U<? super com.facebook.aura.library.model.ArtifactFile, kotlin.Unit> r55, kotlin.jvm.functions.Function0<kotlin.Unit> r56, kotlin.jvm.functions.Function0<kotlin.Unit> r57, kotlin.jvm.functions.Function0<kotlin.Unit> r58, float r59, androidx.compose.foundation.lazy.LazyListState r60, X.BRg r61, kotlin.jvm.functions.Function0<kotlin.Unit> r62, X.BFM r63, int r64, int r65, int r66) {
        /*
            Method dump skipped, instructions count: 803
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.library.view.HatchLibraryTabScreenKt.m1173LibraryTabContentULtc_mU(com.facebook.aura.library.model.HatchLibraryViewModel$UiState, int, com.facebook.aura.library.view.LibraryViewMode, X.G0U, kotlin.jvm.functions.Function0, X.G0U, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, float, androidx.compose.foundation.lazy.LazyListState, X.BRg, kotlin.jvm.functions.Function0, X.BFM, int, int, int):void");
    }

    public static final void LibraryTabEmptyState(int i, int i2, BRg bRg, BFM bfm, int i3, int i4) {
        BRg bRgA0P = bRg;
        bfm.AgG(1698611179);
        int iA0D = (i3 & 6) == 0 ? AnonymousClass004.A0D(bfm, i) | i3 : i3;
        if ((i3 & 48) == 0) {
            iA0D |= AnonymousClass004.A0E(bfm, i2);
        }
        int i5 = i4 & 4;
        if (i5 != 0) {
            iA0D |= 384;
        } else if ((i3 & 384) == 0) {
            iA0D |= AnonymousClass004.A0f(bfm, bRgA0P);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0D & 147, 146), bfm, iA0D)) {
            if (i5 != 0) {
                bRgA0P = BRg.A00;
            }
            InterfaceC1380AiA interfaceC1380AiAA00 = C06I.A00(AcQ.A00(AuraDimensKt.SpacingXsmall), bfm, C2VU.A00, 48);
            BBI bbi = (BBI) bfm;
            int iA0J = AnonymousClass003.A0J(bbi);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA0P);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function0);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA00, akqA04, bRgA01, iA0J);
            AuraIconKt.m2567AuraIconFHprtrg(null, BOf.A00(bfm, R.drawable.cms_outline_24_svg, 0), AuraIconSize.LARGE, null, C06G.A08(bfm), null, bfm, AnonymousClass001.A04(), 33);
            AuraTextKt.m2639AuraTextUY9GdpU(AbstractC2271BQs.A01(bfm, i), null, C06G.A08(bfm), C06G.A0X(bfm), null, null, new C1YL(3), false, 0, 0, 0, null, null, null, bfm, 0, 0, 16306);
            AuraTextKt.m2639AuraTextUY9GdpU(AbstractC2271BQs.A01(bfm, i2), null, C06G.A08(bfm), C06G.A0Y(bfm), null, null, new C1YL(3), false, 0, 0, 0, null, null, null, bfm, 0, 0, 16306);
            bRgA0P = AnonymousClass001.A0P(bbi, bRgA0P);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C123952(i, i2, bRgA0P, i3, i4);
        }
    }

    /* renamed from: artifactItems-PfoAEA0, reason: not valid java name */
    public static final void m1179artifactItemsPfoAEA0(C0CD c0cd, final List<ArtifactFile> list, LibraryViewMode libraryViewMode, int i, String str, float f, final boolean z, final G0U<? super ArtifactFile, Unit> g0u, final Function0<Unit> function0, final G0U<? super ArtifactFile, Unit> g0u2) {
        if (libraryViewMode == LibraryViewMode.LIST) {
            final HatchLibraryTabScreenKt$artifactItems$1 hatchLibraryTabScreenKt$artifactItems$1 = new HatchLibraryTabScreenKt$artifactItems$1(str);
            final HatchLibraryTabScreenKt$artifactItemsPfoAEA0$$inlined$items$default$1 hatchLibraryTabScreenKt$artifactItemsPfoAEA0$$inlined$items$default$1 = new G0U() { // from class: com.facebook.aura.library.view.HatchLibraryTabScreenKt$artifactItems-PfoAEA0$$inlined$items$default$1
                @Override // X.G0U
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    return null;
                }

                @Override // X.G0U
                public final Void invoke(ArtifactFile artifactFile) {
                    return null;
                }
            };
            c0cd.APL(new G0U<Integer, Object>() { // from class: com.facebook.aura.library.view.HatchLibraryTabScreenKt$artifactItems-PfoAEA0$$inlined$items$default$2
                public final Object invoke(int i2) {
                    return AnonymousClass006.A0p(list, hatchLibraryTabScreenKt$artifactItems$1, i2);
                }

                @Override // X.G0U
                public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                    return invoke(AnonymousClass001.A0F(num));
                }
            }, new G0U<Integer, Object>() { // from class: com.facebook.aura.library.view.HatchLibraryTabScreenKt$artifactItems-PfoAEA0$$inlined$items$default$3
                public final Object invoke(int i2) {
                    return AnonymousClass006.A0p(list, hatchLibraryTabScreenKt$artifactItemsPfoAEA0$$inlined$items$default$1, i2);
                }

                @Override // X.G0U
                public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                    return invoke(AnonymousClass001.A0F(num));
                }
            }, B1V.A01(new G2j<AnonymousClass037, Integer, BFM, Integer, Unit>() { // from class: com.facebook.aura.library.view.HatchLibraryTabScreenKt$artifactItems-PfoAEA0$$inlined$items$default$4
                public final void invoke(AnonymousClass037 anonymousClass037, int i2, BFM bfm, int i3) {
                    int iA0d = (i3 & 6) == 0 ? AnonymousClass004.A0d(bfm, anonymousClass037) | i3 : i3;
                    if ((i3 & 48) == 0) {
                        iA0d |= AnonymousClass004.A0E(bfm, i2);
                    }
                    if (!AnonymousClass001.A1b(AnonymousClass004.A1J(iA0d), bfm, iA0d)) {
                        bfm.Afo();
                        return;
                    }
                    ArtifactFile artifactFile = (ArtifactFile) list.get(i2);
                    bfm.AgE(-59927194);
                    HatchLibraryTabScreenKt.ArtifactListItem(artifactFile, g0u, function0, g0u2, z, C10G.A02, bfm, ArtifactFile.$stable | 196608, 0);
                    AnonymousClass001.A1D(bfm);
                }

                @Override // X.G2j
                public /* bridge */ /* synthetic */ Unit invoke(AnonymousClass037 anonymousClass037, Integer num, BFM bfm, Integer num2) {
                    invoke(anonymousClass037, AnonymousClass001.A0F(num), bfm, AnonymousClass001.A0F(num2));
                    return Unit.INSTANCE;
                }
            }, 802480018, true), list.size());
            return;
        }
        ArrayList arrayListA0N = AbstractC0878AGe.A0N(list, i);
        int size = arrayListA0N.size();
        c0cd.APL(new HatchLibraryTabScreenKt$artifactItems$3(str), C0t8.A00, B1V.A01(new HatchLibraryTabScreenKt$artifactItems$4(arrayListA0N, f, i, g0u, function0, g0u2, z), 688930585, true), size);
    }

    /* renamed from: libraryEmptyStateItem-6AXeQGM, reason: not valid java name */
    public static final void m1180libraryEmptyStateItem6AXeQGM(C0CD c0cd, String str, LoadingState loadingState, int i, int i2, float f, String str2) {
        c0cd.APJ(str, null, AnonymousClass001.A0M(new HatchLibraryTabScreenKt$libraryEmptyStateItem$1(loadingState, i, i2, str2, f), 1471296106));
    }

    /* renamed from: libraryErrorStateItem-Z4HSEVQ, reason: not valid java name */
    public static final void m1181libraryErrorStateItemZ4HSEVQ(C0CD c0cd, String str, int i, Function0<Unit> function0, float f, String str2) {
        c0cd.APJ(str, null, AnonymousClass001.A0M(new HatchLibraryTabScreenKt$libraryErrorStateItem$1(i, function0, str2, f), 1970516813));
    }

    public static final void logArtifactLongPress(ArtifactFile artifactFile) {
        boolean zA1X = AnonymousClass002.A1X(artifactFile.spaceSlug);
        C0924AIa c0924AIa = new C0924AIa();
        c0924AIa.put(HatchMetadataKey.ARTIFACT_TYPE.getValue(), zA1X ? "space" : "file");
        if (!zA1X) {
            String value = HatchMetadataKey.FILE_TYPE.getValue();
            String fileExtension = artifactFile.getFileExtension();
            if (fileExtension.length() == 0) {
                fileExtension = "html";
            }
            c0924AIa.put(value, fileExtension);
        }
        HatchInteractionLogger.INSTANCE.logLongPress(HatchSurface.LIBRARY, null, HatchScreen.LIBRARY_HOME, HatchComponent.ARTIFACT_OVERFLOW_MENU, null, AIW.A0K(c0924AIa));
    }

    public static final void logLibraryFilePinClick(ArtifactFile artifactFile) {
        HatchInteractionLogger hatchInteractionLogger = HatchInteractionLogger.INSTANCE;
        HatchSurface hatchSurface = HatchSurface.LIBRARY;
        HatchScreen hatchScreen = HatchScreen.LIBRARY_HOME;
        HatchComponent hatchComponent = artifactFile.isPinned ? HatchComponent.UNPIN_BUTTON : HatchComponent.PIN_BUTTON;
        HxE hxE = new HxE(HatchMetadataKey.ARTIFACT_TYPE.getValue(), "file");
        String value = HatchMetadataKey.FILE_TYPE.getValue();
        String fileExtension = artifactFile.getFileExtension();
        if (fileExtension.length() == 0) {
            fileExtension = "html";
        }
        hatchInteractionLogger.logClick(hatchSurface, null, hatchScreen, hatchComponent, null, AnonymousClass007.A0d(value, fileExtension, hxE), null);
    }

    public static final void logLibraryMenuOption(HatchComponent hatchComponent, HatchMetadataKey hatchMetadataKey, String str) {
        HatchInteractionLogger.INSTANCE.logClick(HatchSurface.LIBRARY, HatchSubsurface.DOT_MENU, HatchScreen.LIBRARY_HOME, hatchComponent, null, AnonymousClass007.A0c(hatchMetadataKey, str), null);
    }

    public static final void logLibraryOverflowMenuDismiss() {
        HatchInteractionLogger.INSTANCE.logDismiss(HatchSurface.LIBRARY, HatchSubsurface.DOT_MENU, HatchScreen.LIBRARY_HOME, HatchComponent.THREE_DOTS_MENU, null, null);
    }

    public static final LibraryViewMode readLibraryViewMode(C4oT c4oT) {
        return "GRID".equals(c4oT.getString(LIBRARY_VIEW_MODE_PREF_KEY, null)) ? LibraryViewMode.GRID : LibraryViewMode.LIST;
    }

    public static final /* synthetic */ HatchLibraryViewModel.UiState access$HatchLibraryTabScreen$lambda$0(C1BO c1bo) {
        return (HatchLibraryViewModel.UiState) c1bo.getValue();
    }

    public static final /* synthetic */ LibrarySegment access$HatchLibraryTabScreen$lambda$10(C1BO c1bo) {
        return (LibrarySegment) c1bo.getValue();
    }

    public static final /* synthetic */ LibraryViewMode access$HatchLibraryTabScreen$lambda$14(MutableState mutableState) {
        return (LibraryViewMode) mutableState.getValue();
    }

    public static final Function0<Unit> rememberLibraryTabTtrc(BFM bfm, int i) {
        AbstractC3358CGz abstractC3358CGzA0h = AnonymousClass002.A0h(bfm);
        boolean zA65 = bfm.A65(abstractC3358CGzA0h);
        Object objAaT = bfm.AaT();
        if (zA65 || objAaT == C78N.A00) {
            objAaT = HatchNavTTRCCoordinator.Companion.getInstance(abstractC3358CGzA0h);
            bfm.Ai0(objAaT);
        }
        HatchNavTTRCCoordinator hatchNavTTRCCoordinator = (HatchNavTTRCCoordinator) objAaT;
        boolean zA67 = bfm.A67(hatchNavTTRCCoordinator);
        Object objAaT2 = bfm.AaT();
        if (zA67 || objAaT2 == C78N.A00) {
            objAaT2 = new HatchLibraryTabScreenKt$rememberLibraryTabTtrc$1$1(hatchNavTTRCCoordinator);
            bfm.Ai0(objAaT2);
        }
        AnonymousClass001.A17(bfm, objAaT2, abstractC3358CGzA0h);
        boolean zA652 = bfm.A65(hatchNavTTRCCoordinator);
        Object objAaT3 = bfm.AaT();
        if (zA652 || objAaT3 == C78N.A00) {
            objAaT3 = new HatchLibraryTabScreenKt$rememberLibraryTabTtrc$2$1(hatchNavTTRCCoordinator);
            bfm.Ai0(objAaT3);
        }
        return (Function0) objAaT3;
    }

    public static final void writeLibraryViewMode(C4oT c4oT, LibraryViewMode libraryViewMode) {
        BzK bzKA9q = c4oT.A9q();
        bzKA9q.AYr(LIBRARY_VIEW_MODE_PREF_KEY, libraryViewMode.name());
        bzKA9q.apply();
    }
}
