package com.facebook.aura.file.view;

import X.AGI;
import X.AHD;
import X.AKQ;
import X.AbstractC3358CGz;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass007;
import X.AnonymousClass011;
import X.AxM;
import X.B1V;
import X.BBI;
import X.BBb;
import X.BFM;
import X.BGK;
import X.BO6;
import X.BQI;
import X.BRg;
import X.C00x;
import X.C06G;
import X.C0881AGi;
import X.C0943AIw;
import X.C0953AJg;
import X.C1062ATq;
import X.C10G;
import X.C11U;
import X.C1515AkP;
import X.C1BO;
import X.C1D3;
import X.C1D8;
import X.C1DG;
import X.C1YY;
import X.C2CK;
import X.C3UX;
import X.C78N;
import X.C7BY;
import X.F60;
import X.G0U;
import X.G0V;
import X.G2j;
import X.G2k;
import X.HxE;
import X.InterfaceC1380AiA;
import X.InterfaceC1516AkQ;
import android.graphics.Bitmap;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.R;
import com.facebook.aura.analytics.hatch.HatchComponent;
import com.facebook.aura.analytics.hatch.HatchInteractionLogger;
import com.facebook.aura.analytics.hatch.HatchMetadataKey;
import com.facebook.aura.analytics.hatch.HatchScreen;
import com.facebook.aura.analytics.hatch.HatchSurface;
import com.facebook.aura.file.view.DirectoryLoadingState;
import com.facebook.aura.header.view.HatchPageScreenKt;
import com.facebook.aura.library.repo.FilesSortMode;
import com.facebook.aura.library.repo.WorkspaceEntry;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;
import com.facebook.aura.vds.compose.theme.AuraContainer;
import com.facebook.common.dextricks.RuntimeInternals;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public abstract class FolderViewerScreenKt {
    public static final float CardCornerRadius = 22.0f;
    public static final long FOLDER_EXPAND_ANIM_MS = 400;
    public static final C1D3 TopRoundedCardShape = C1D8.A01(22.0f, 22.0f, 0.0f, 0.0f);
    public static final C1D3 BottomRoundedCardShape = C1D8.A01(0.0f, 0.0f, 22.0f, 22.0f);
    public static final C1D3 FullyRoundedCardShape = C1D8.A00(22.0f);

    /* renamed from: com.facebook.aura.file.view.FolderViewerScreenKt$FolderViewerCardItem$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ G0V<BFM, Integer, Unit> $content;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ boolean $roundedBottom;
        public final /* synthetic */ boolean $roundedTop;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass2(boolean z, boolean z2, BRg bRg, G0V<? super BFM, ? super Integer, Unit> g0v, int i, int i2) {
            super(2);
            this.$roundedTop = z;
            this.$roundedBottom = z2;
            this.$modifier = bRg;
            this.$content = g0v;
            this.$$changed = i;
            this.$$default = i2;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            FolderViewerScreenKt.FolderViewerCardItem(this.$roundedTop, this.$roundedBottom, this.$modifier, this.$content, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.file.view.FolderViewerScreenKt$FolderViewerScreen$4, reason: invalid class name */
    public final class AnonymousClass4 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ String $relativePath;
        public final /* synthetic */ FolderViewerViewModel $viewModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(String str, FolderViewerViewModel folderViewerViewModel) {
            super(2);
            this.$relativePath = str;
            this.$viewModel = folderViewerViewModel;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            if (AnonymousClass001.A1b(AnonymousClass004.A1E(i), bfm, i)) {
                String str = this.$relativePath;
                boolean zA67 = bfm.A67(this.$viewModel);
                FolderViewerViewModel folderViewerViewModel = this.$viewModel;
                Object objAaT = bfm.AaT();
                if (zA67 || objAaT == C78N.A00) {
                    objAaT = new FolderViewerScreenKt$FolderViewerScreen$4$1$1(folderViewerViewModel);
                    bfm.Ai0(objAaT);
                }
                LibraryUploadMenuKt.LibraryUploadMenu(str, (Function0) objAaT, null, bfm, 0, 4);
                return;
            }
            bfm.Afo();
        }
    }

    /* renamed from: com.facebook.aura.file.view.FolderViewerScreenKt$FolderViewerScreen$5, reason: invalid class name */
    public final class AnonymousClass5 extends AbstractC7559F3s implements G2j<C1DG, C1DG, BFM, Integer, Unit> {
        public final /* synthetic */ MutableState<String> $collapsingPath$delegate;
        public final /* synthetic */ C3UX $coroutineScope;
        public final /* synthetic */ MutableState<BQI<String>> $expandedFolders$delegate;
        public final /* synthetic */ MutableState<BO6<String, AHD<WorkspaceEntry>>> $folderContents$delegate;
        public final /* synthetic */ MutableState<String> $justExpandedPath$delegate;
        public final /* synthetic */ MutableState<BQI<String>> $loadingFolders$delegate;
        public final /* synthetic */ C1BO<DirectoryLoadingState> $loadingState$delegate;
        public final /* synthetic */ AuraNavigator $navigator;
        public final /* synthetic */ G0V<WorkspaceEntry, Bitmap, Unit> $onNavigateToConversation;
        public final /* synthetic */ MutableState<FilesSortMode> $sortMode$delegate;
        public final /* synthetic */ AbstractC3358CGz $userSession;
        public final /* synthetic */ FolderViewerViewModel $viewModel;

        /* renamed from: com.facebook.aura.file.view.FolderViewerScreenKt$FolderViewerScreen$5$2, reason: invalid class name */
        public final class AnonymousClass2 extends AbstractC7559F3s implements G2k<G0U<? super WorkspaceEntry, ? extends Unit>, G0U<? super WorkspaceEntry, ? extends Unit>, G0U<? super WorkspaceEntry, ? extends Unit>, BFM, Integer, Unit> {
            public final /* synthetic */ float $bottomPadding;
            public final /* synthetic */ MutableState<String> $collapsingPath$delegate;
            public final /* synthetic */ MutableState<BQI<String>> $expandedFolders$delegate;
            public final /* synthetic */ MutableState<BO6<String, AHD<WorkspaceEntry>>> $folderContents$delegate;
            public final /* synthetic */ MutableState<String> $justExpandedPath$delegate;
            public final /* synthetic */ MutableState<BQI<String>> $loadingFolders$delegate;
            public final /* synthetic */ C1BO<DirectoryLoadingState> $loadingState$delegate;
            public final /* synthetic */ G0U<WorkspaceEntry, Unit> $onEntryClick;
            public final /* synthetic */ G0V<WorkspaceEntry, Bitmap, Unit> $onNavigateToConversation;
            public final /* synthetic */ G0U<WorkspaceEntry, Unit> $onToggleFolder;
            public final /* synthetic */ MutableState<FilesSortMode> $sortMode$delegate;
            public final /* synthetic */ float $topPadding;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public AnonymousClass2(G0V<? super WorkspaceEntry, ? super Bitmap, Unit> g0v, float f, C1BO<? extends DirectoryLoadingState> c1bo, G0U<? super WorkspaceEntry, Unit> g0u, G0U<? super WorkspaceEntry, Unit> g0u2, float f2, MutableState<FilesSortMode> mutableState, MutableState<BQI<String>> mutableState2, MutableState<BO6<String, AHD<WorkspaceEntry>>> mutableState3, MutableState<String> mutableState4, MutableState<BQI<String>> mutableState5, MutableState<String> mutableState6) {
                super(5);
                this.$onNavigateToConversation = g0v;
                this.$topPadding = f;
                this.$loadingState$delegate = c1bo;
                this.$onEntryClick = g0u;
                this.$onToggleFolder = g0u2;
                this.$bottomPadding = f2;
                this.$sortMode$delegate = mutableState;
                this.$expandedFolders$delegate = mutableState2;
                this.$folderContents$delegate = mutableState3;
                this.$collapsingPath$delegate = mutableState4;
                this.$loadingFolders$delegate = mutableState5;
                this.$justExpandedPath$delegate = mutableState6;
            }

            public final void invoke(G0U<? super WorkspaceEntry, Unit> g0u, G0U<? super WorkspaceEntry, Unit> g0u2, G0U<? super WorkspaceEntry, Unit> g0u3, BFM bfm, int i) {
                BQI<String> value;
                DirectoryLoadingState.Success success;
                AnonymousClass005.A10(g0u, g0u2, g0u3);
                int iA0T = (i & 6) == 0 ? AnonymousClass004.A0T(bfm, g0u) | i : i;
                if ((i & 48) == 0) {
                    iA0T |= AnonymousClass004.A0U(bfm, g0u2);
                }
                if ((i & 384) == 0) {
                    iA0T |= AnonymousClass004.A0V(bfm, g0u3);
                }
                if (!AnonymousClass001.A1b(AnonymousClass004.A1L(iA0T), bfm, iA0T)) {
                    bfm.Afo();
                    return;
                }
                DirectoryLoadingState value2 = this.$loadingState$delegate.getValue();
                AHD<WorkspaceEntry> ahd = (!(value2 instanceof DirectoryLoadingState.Success) || (success = (DirectoryLoadingState.Success) value2) == null) ? null : success.entries;
                boolean zA1T = AnonymousClass005.A1T(bfm, this.$expandedFolders$delegate.getValue(), this.$folderContents$delegate.getValue(), this.$collapsingPath$delegate.getValue(), AnonymousClass003.A1H(bfm, this.$sortMode$delegate.getValue(), bfm.A65(ahd)));
                MutableState<String> mutableState = this.$collapsingPath$delegate;
                MutableState<BQI<String>> mutableState2 = this.$expandedFolders$delegate;
                MutableState<FilesSortMode> mutableState3 = this.$sortMode$delegate;
                MutableState<BO6<String, AHD<WorkspaceEntry>>> mutableState4 = this.$folderContents$delegate;
                Object objAaT = bfm.AaT();
                if (zA1T || objAaT == C78N.A00) {
                    String value3 = mutableState.getValue();
                    if (value3 == null || (value = AGI.A09(BGK.A02(value3, mutableState2.getValue()))) == null) {
                        value = mutableState2.getValue();
                    }
                    objAaT = ahd != null ? FolderViewerScreenKt.flattenVisibleEntries(InlineFilesCardKt.sortEntries(ahd, mutableState3.getValue()), value, mutableState4.getValue()) : C0881AGi.A00;
                    bfm.Ai0(objAaT);
                }
                List list = (List) objAaT;
                C1062ATq c1062ATq = C10G.A01;
                boolean zA1W = AnonymousClass002.A1W(bfm, this.$onNavigateToConversation, AnonymousClass001.A1R(bfm, this.$onToggleFolder, AnonymousClass001.A1R(bfm, this.$onEntryClick, AnonymousClass004.A1S(bfm, this.$loadingState$delegate, list, bfm.A62(this.$topPadding)))) | AnonymousClass004.A1F(iA0T) | AnonymousClass004.A1I(iA0T), AnonymousClass004.A1K(iA0T)) | bfm.A62(this.$bottomPadding);
                float f = this.$topPadding;
                C1BO<DirectoryLoadingState> c1bo = this.$loadingState$delegate;
                MutableState<FilesSortMode> mutableState5 = this.$sortMode$delegate;
                MutableState<BQI<String>> mutableState6 = this.$expandedFolders$delegate;
                MutableState<BQI<String>> mutableState7 = this.$loadingFolders$delegate;
                MutableState<BO6<String, AHD<WorkspaceEntry>>> mutableState8 = this.$folderContents$delegate;
                MutableState<String> mutableState9 = this.$justExpandedPath$delegate;
                MutableState<String> mutableState10 = this.$collapsingPath$delegate;
                G0U<WorkspaceEntry, Unit> g0u4 = this.$onEntryClick;
                G0U<WorkspaceEntry, Unit> g0u5 = this.$onToggleFolder;
                G0V<WorkspaceEntry, Bitmap, Unit> g0v = this.$onNavigateToConversation;
                float f2 = this.$bottomPadding;
                Object objAaT2 = bfm.AaT();
                if (zA1W || objAaT2 == C78N.A00) {
                    objAaT2 = new FolderViewerScreenKt$FolderViewerScreen$5$2$1$1(list, f, c1bo, mutableState5, mutableState6, mutableState7, mutableState8, mutableState9, mutableState10, g0u4, g0u5, g0u, g0u2, g0u3, g0v, f2);
                    bfm.Ai0(objAaT2);
                }
                C1YY.A01(null, null, null, null, null, bfm, null, c1062ATq, (G0U) objAaT2, 6, 510, false, false);
            }

            @Override // X.G2k
            public /* bridge */ /* synthetic */ Unit invoke(G0U<? super WorkspaceEntry, ? extends Unit> g0u, G0U<? super WorkspaceEntry, ? extends Unit> g0u2, G0U<? super WorkspaceEntry, ? extends Unit> g0u3, BFM bfm, Integer num) {
                invoke((G0U<? super WorkspaceEntry, Unit>) g0u, (G0U<? super WorkspaceEntry, Unit>) g0u2, (G0U<? super WorkspaceEntry, Unit>) g0u3, bfm, AnonymousClass001.A0F(num));
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass5(AuraNavigator auraNavigator, AbstractC3358CGz abstractC3358CGz, C3UX c3ux, FolderViewerViewModel folderViewerViewModel, MutableState<BQI<String>> mutableState, MutableState<String> mutableState2, MutableState<String> mutableState3, MutableState<BO6<String, AHD<WorkspaceEntry>>> mutableState4, MutableState<BQI<String>> mutableState5, G0V<? super WorkspaceEntry, ? super Bitmap, Unit> g0v, C1BO<? extends DirectoryLoadingState> c1bo, MutableState<FilesSortMode> mutableState6) {
            super(4);
            this.$navigator = auraNavigator;
            this.$userSession = abstractC3358CGz;
            this.$coroutineScope = c3ux;
            this.$viewModel = folderViewerViewModel;
            this.$expandedFolders$delegate = mutableState;
            this.$justExpandedPath$delegate = mutableState2;
            this.$collapsingPath$delegate = mutableState3;
            this.$folderContents$delegate = mutableState4;
            this.$loadingFolders$delegate = mutableState5;
            this.$onNavigateToConversation = g0v;
            this.$loadingState$delegate = c1bo;
            this.$sortMode$delegate = mutableState6;
        }

        @Override // X.G2j
        public /* bridge */ /* synthetic */ Unit invoke(C1DG c1dg, C1DG c1dg2, BFM bfm, Integer num) {
            m900invokei1RSzL4(c1dg.A00, c1dg2.A00, bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        /* renamed from: invoke-i1RSzL4, reason: not valid java name */
        public final void m900invokei1RSzL4(float f, float f2, BFM bfm, int i) {
            int iA04 = (i & 6) == 0 ? i | AnonymousClass004.A04(bfm, f) : i;
            if ((i & 48) == 0) {
                iA04 |= AnonymousClass004.A05(bfm, f2);
            }
            if (!AnonymousClass001.A1b(AnonymousClass004.A1J(iA04), bfm, iA04)) {
                bfm.Afo();
                return;
            }
            boolean zA1T = AnonymousClass001.A1T(bfm, this.$userSession, bfm.A67(this.$navigator));
            AuraNavigator auraNavigator = this.$navigator;
            AbstractC3358CGz abstractC3358CGz = this.$userSession;
            Object objAaT = bfm.AaT();
            if (zA1T || objAaT == C78N.A00) {
                objAaT = new FolderViewerScreenKt$FolderViewerScreen$5$onEntryClick$1$1(auraNavigator, abstractC3358CGz);
                bfm.Ai0(objAaT);
            }
            G0U g0u = (G0U) objAaT;
            boolean zA1T2 = AnonymousClass001.A1T(bfm, this.$userSession, bfm.A67(this.$coroutineScope));
            C3UX c3ux = this.$coroutineScope;
            MutableState<BQI<String>> mutableState = this.$expandedFolders$delegate;
            MutableState<String> mutableState2 = this.$justExpandedPath$delegate;
            MutableState<String> mutableState3 = this.$collapsingPath$delegate;
            MutableState<BO6<String, AHD<WorkspaceEntry>>> mutableState4 = this.$folderContents$delegate;
            MutableState<BQI<String>> mutableState5 = this.$loadingFolders$delegate;
            AbstractC3358CGz abstractC3358CGz2 = this.$userSession;
            Object objAaT2 = bfm.AaT();
            if (zA1T2 || objAaT2 == C78N.A00) {
                objAaT2 = new FolderViewerScreenKt$FolderViewerScreen$5$onToggleFolder$1$1(c3ux, mutableState, mutableState2, mutableState3, mutableState4, mutableState5, abstractC3358CGz2);
                bfm.Ai0(objAaT2);
            }
            G0U g0u2 = (G0U) objAaT2;
            boolean zA67 = bfm.A67(this.$viewModel);
            FolderViewerViewModel folderViewerViewModel = this.$viewModel;
            Object objAaT3 = bfm.AaT();
            if (zA67 || objAaT3 == C78N.A00) {
                objAaT3 = new FolderViewerScreenKt$FolderViewerScreen$5$1$1(folderViewerViewModel);
                bfm.Ai0(objAaT3);
            }
            WorkspaceEntryActionsHostKt.WorkspaceEntryActionsHost((Function0) objAaT3, "folder_viewer", B1V.A00(bfm, new AnonymousClass2(this.$onNavigateToConversation, f, this.$loadingState$delegate, g0u, g0u2, f2, this.$sortMode$delegate, this.$expandedFolders$delegate, this.$folderContents$delegate, this.$collapsingPath$delegate, this.$loadingFolders$delegate, this.$justExpandedPath$delegate), -1090329040), bfm, 432);
        }
    }

    /* renamed from: com.facebook.aura.file.view.FolderViewerScreenKt$FolderViewerScreen$6, reason: invalid class name */
    public final class AnonymousClass6 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onBack;
        public final /* synthetic */ G0V<WorkspaceEntry, Bitmap, Unit> $onNavigateToConversation;
        public final /* synthetic */ String $relativePath;
        public final /* synthetic */ FolderViewerViewModel $viewModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass6(String str, FolderViewerViewModel folderViewerViewModel, Function0<Unit> function0, BRg bRg, G0V<? super WorkspaceEntry, ? super Bitmap, Unit> g0v, int i, int i2) {
            super(2);
            this.$relativePath = str;
            this.$viewModel = folderViewerViewModel;
            this.$onBack = function0;
            this.$modifier = bRg;
            this.$onNavigateToConversation = g0v;
            this.$$changed = i;
            this.$$default = i2;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            FolderViewerScreenKt.FolderViewerScreen(this.$relativePath, this.$viewModel, this.$onBack, this.$modifier, this.$onNavigateToConversation, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    public static final void FolderViewerScreen(String str, FolderViewerViewModel folderViewerViewModel, Function0<Unit> function0, BRg bRg, G0V<? super WorkspaceEntry, ? super Bitmap, Unit> g0v, BFM bfm, int i, int i2) {
        String strA0R;
        BRg bRg2 = bRg;
        G0V<? super WorkspaceEntry, ? super Bitmap, Unit> g0v2 = g0v;
        AnonymousClass005.A10(str, folderViewerViewModel, function0);
        bfm.AgG(793858931);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, str) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass002.A06(AnonymousClass004.A1Y(folderViewerViewModel, bfm, i) ? 1 : 0);
        }
        if ((i & 384) == 0) {
            iA0d |= AnonymousClass004.A0V(bfm, function0);
        }
        int i3 = i2 & 8;
        if (i3 != 0) {
            iA0d |= 3072;
        } else if ((i & 3072) == 0) {
            iA0d |= AnonymousClass004.A0g(bfm, bRg2);
        }
        int i4 = i2 & 16;
        if (i4 != 0) {
            iA0d |= RuntimeInternals.IOPRIO_BACKGROUND;
        } else if ((i & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA0d |= AnonymousClass004.A0X(bfm, g0v2);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1N(iA0d), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            if (i4 != 0) {
                Object objAaT = bfm.AaT();
                if (objAaT == C78N.A00) {
                    objAaT = FolderViewerScreenKt$FolderViewerScreen$1$1.INSTANCE;
                    bfm.Ai0(objAaT);
                }
                g0v2 = (G0V) objAaT;
            }
            if (AnonymousClass002.A1M(str.length())) {
                bfm.AgE(-1605736342);
                strA0R = AnonymousClass003.A0e(bfm, R.string._name_removed__res_0x7f120c61);
            } else {
                AnonymousClass003.A0l(bfm, -1605733814);
                strA0R = C7BY.A0R(str, str, '/');
            }
            AuraNavigator auraNavigatorA0b = AnonymousClass002.A0b(bfm);
            AbstractC3358CGz abstractC3358CGzA0g = AnonymousClass002.A0g(bfm);
            Object objAaT2 = bfm.AaT();
            Object obj = C78N.A00;
            C3UX c3ux = (C3UX) AnonymousClass004.A15(bfm, objAaT2, obj);
            C1BO c1boA02 = C2CK.A02(bfm, folderViewerViewModel.loadingState);
            Object objAaT3 = bfm.AaT();
            if (objAaT3 == obj) {
                objAaT3 = AnonymousClass004.A11(bfm, FilesSortMode.NAME);
            }
            MutableState mutableState = (MutableState) objAaT3;
            Object objAaT4 = bfm.AaT();
            if (objAaT4 == obj) {
                objAaT4 = AnonymousClass004.A11(bfm, C0943AIw.A03);
            }
            MutableState mutableState2 = (MutableState) objAaT4;
            Object objAaT5 = bfm.AaT();
            if (objAaT5 == obj) {
                objAaT5 = AnonymousClass004.A11(bfm, C0953AJg.A00());
            }
            MutableState mutableState3 = (MutableState) objAaT5;
            Object objAaT6 = bfm.AaT();
            if (objAaT6 == obj) {
                objAaT6 = AnonymousClass004.A11(bfm, C0943AIw.A03);
            }
            MutableState mutableState4 = (MutableState) objAaT6;
            MutableState mutableState5 = (MutableState) AnonymousClass005.A0f(bfm, obj, null);
            MutableState mutableState6 = (MutableState) AnonymousClass005.A0f(bfm, obj, null);
            Object value = mutableState5.getValue();
            Object objAaT7 = bfm.AaT();
            if (objAaT7 == obj) {
                objAaT7 = new FolderViewerScreenKt$FolderViewerScreen$2$1(mutableState5, null);
                bfm.Ai0(objAaT7);
            }
            AnonymousClass001.A18(bfm, objAaT7, value);
            Object value2 = mutableState6.getValue();
            Object objAaT8 = bfm.AaT();
            if (objAaT8 == obj) {
                objAaT8 = new FolderViewerScreenKt$FolderViewerScreen$3$1(mutableState6, null);
                bfm.Ai0(objAaT8);
            }
            AnonymousClass001.A18(bfm, objAaT8, value2);
            HatchPageScreenKt.m997HatchPageScreenZOcclw(AuraContainer.PrimaryScreen.INSTANCE, bRg2, null, C06G.A0B(bfm), strA0R, null, function0, null, false, false, 0, null, null, null, null, null, B1V.A00(bfm, new AnonymousClass4(str, folderViewerViewModel), 1150338816), 0L, 0L, null, 0.0f, null, null, null, 0, null, null, null, false, B1V.A00(bfm, new AnonymousClass5(auraNavigatorA0b, abstractC3358CGzA0g, c3ux, folderViewerViewModel, mutableState2, mutableState5, mutableState6, mutableState3, mutableState4, g0v2, c1boA02, mutableState), 1775876472), bfm, AnonymousClass001.A05(iA0d << 12, ((iA0d >> 6) & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX) | 6), 1572864, 805306368, 536805284);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass6(str, folderViewerViewModel, function0, bRg2, g0v2, i, i2);
        }
    }

    public static final List<HxE<WorkspaceEntry, Integer>> flattenVisibleEntries(AHD<WorkspaceEntry> ahd, BQI<String> bqi, BO6<String, ? extends AHD<WorkspaceEntry>> bo6) {
        ArrayList arrayList = new ArrayList();
        flattenVisibleEntries$visit(arrayList, bqi, bo6, ahd, 0);
        return arrayList;
    }

    public static final void logWorkspaceEntryClick(HatchComponent hatchComponent, WorkspaceEntry workspaceEntry) {
        String strA0u = AnonymousClass001.A0u(C7BY.A0R(workspaceEntry.name, "", '.'));
        HatchInteractionLogger.INSTANCE.logClick(HatchSurface.LIBRARY, null, HatchScreen.LIBRARY_HOME, hatchComponent, null, (workspaceEntry.type == WorkspaceEntry.EntryType.DIRECTORY || strA0u.length() == 0) ? null : AnonymousClass007.A0c(HatchMetadataKey.FILE_TYPE, strA0u), null);
    }

    public static final void FolderViewerCardItem(boolean z, boolean z2, BRg bRg, G0V<? super BFM, ? super Integer, Unit> g0v, BFM bfm, int i, int i2) {
        bfm.AgG(-307165958);
        int iA0n = (i & 6) == 0 ? AnonymousClass004.A0n(bfm, z) | i : i;
        if ((i & 48) == 0) {
            iA0n |= AnonymousClass004.A0o(bfm, z2);
        }
        int i3 = i2 & 4;
        if (i3 != 0) {
            iA0n |= 384;
        } else if ((i & 384) == 0) {
            iA0n |= AnonymousClass004.A0f(bfm, bRg);
        }
        if ((i & 3072) == 0) {
            iA0n |= AnonymousClass004.A0W(bfm, g0v);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0n & 1171, 1170), bfm, iA0n)) {
            if (i3 != 0) {
                bRg = BRg.A00;
            }
            BRg bRgA03 = C11U.A03(AnonymousClass001.A0R(bRg), z ? z2 ? FullyRoundedCardShape : TopRoundedCardShape : z2 ? BottomRoundedCardShape : C1D8.A00(0.0f));
            InterfaceC1380AiA interfaceC1380AiAA0c = AnonymousClass001.A0c(false);
            BBI bbi = (BBI) bfm;
            int iA0J = AnonymousClass003.A0J(bbi);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA03);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function0);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA0c, akqA04, bRgA01, iA0J);
            AnonymousClass005.A0q(bbi, bfm, g0v, iA0n >> 9);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass2(z, z2, bRg, g0v, i, i2);
        }
    }

    public static final /* synthetic */ DirectoryLoadingState access$FolderViewerScreen$lambda$1(C1BO c1bo) {
        return (DirectoryLoadingState) c1bo.getValue();
    }

    public static final /* synthetic */ BQI access$FolderViewerScreen$lambda$12(MutableState mutableState) {
        return (BQI) mutableState.getValue();
    }

    public static final /* synthetic */ FilesSortMode access$FolderViewerScreen$lambda$3(MutableState mutableState) {
        return (FilesSortMode) mutableState.getValue();
    }

    public static final /* synthetic */ BQI access$FolderViewerScreen$lambda$6(MutableState mutableState) {
        return (BQI) mutableState.getValue();
    }

    public static final /* synthetic */ BO6 access$FolderViewerScreen$lambda$9(MutableState mutableState) {
        return (BO6) mutableState.getValue();
    }

    public static final void flattenVisibleEntries$visit(List<HxE<WorkspaceEntry, Integer>> list, BQI<String> bqi, BO6<String, ? extends AHD<WorkspaceEntry>> bo6, AHD<WorkspaceEntry> ahd, int i) {
        AHD<WorkspaceEntry> ahd2;
        for (WorkspaceEntry workspaceEntry : ahd) {
            list.add(AnonymousClass002.A0p(workspaceEntry, i));
            if (workspaceEntry.type == WorkspaceEntry.EntryType.DIRECTORY && bqi.contains(workspaceEntry.relativePath) && (ahd2 = bo6.get(workspaceEntry.relativePath)) != null) {
                flattenVisibleEntries$visit(list, bqi, bo6, ahd2, i + 1);
            }
        }
    }
}
