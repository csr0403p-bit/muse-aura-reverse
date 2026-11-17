package com.facebook.aura.file.view;

import X.AHD;
import X.AKQ;
import X.AbstractC2271BQs;
import X.AbstractC7559F3s;
import X.AcQ;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.AnonymousClass037;
import X.AxM;
import X.B1V;
import X.BBI;
import X.BFM;
import X.BO6;
import X.BQI;
import X.BRg;
import X.BS0;
import X.C00x;
import X.C01N;
import X.C06G;
import X.C0A8;
import X.C0CD;
import X.C1062ATq;
import X.C10G;
import X.C1515AkP;
import X.C1AC;
import X.C1BO;
import X.C2VU;
import X.C3U4;
import X.C7384Etj;
import X.C78N;
import X.C90m;
import X.F60;
import X.G0U;
import X.G0V;
import X.G0W;
import X.G2j;
import X.HxE;
import X.InterfaceC1380AiA;
import X.InterfaceC1516AkQ;
import android.graphics.Bitmap;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.R;
import com.facebook.aura.file.view.DirectoryLoadingState;
import com.facebook.aura.library.repo.FilesSortMode;
import com.facebook.aura.library.repo.WorkspaceEntry;
import com.facebook.aura.vds.compose.base.AuraDimensKt;
import com.facebook.aura.vds.compose.text.AuraTextKt;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class FolderViewerScreenKt$FolderViewerScreen$5$2$1$1 extends AbstractC7559F3s implements G0U<C0CD, Unit> {
    public final /* synthetic */ float $bottomPadding;
    public final /* synthetic */ MutableState<String> $collapsingPath$delegate;
    public final /* synthetic */ MutableState<BQI<String>> $expandedFolders$delegate;
    public final /* synthetic */ List<HxE<WorkspaceEntry, Integer>> $flatEntries;
    public final /* synthetic */ MutableState<BO6<String, AHD<WorkspaceEntry>>> $folderContents$delegate;
    public final /* synthetic */ MutableState<String> $justExpandedPath$delegate;
    public final /* synthetic */ MutableState<BQI<String>> $loadingFolders$delegate;
    public final /* synthetic */ C1BO<DirectoryLoadingState> $loadingState$delegate;
    public final /* synthetic */ G0U<WorkspaceEntry, Unit> $onDeleteClick;
    public final /* synthetic */ G0U<WorkspaceEntry, Unit> $onDownloadClick;
    public final /* synthetic */ G0U<WorkspaceEntry, Unit> $onEntryClick;
    public final /* synthetic */ G0V<WorkspaceEntry, Bitmap, Unit> $onNavigateToConversation;
    public final /* synthetic */ G0U<WorkspaceEntry, Unit> $onRenameClick;
    public final /* synthetic */ G0U<WorkspaceEntry, Unit> $onToggleFolder;
    public final /* synthetic */ MutableState<FilesSortMode> $sortMode$delegate;
    public final /* synthetic */ float $topPadding;

    /* renamed from: com.facebook.aura.file.view.FolderViewerScreenKt$FolderViewerScreen$5$2$1$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0W<AnonymousClass037, BFM, Integer, Unit> {
        public final /* synthetic */ float $topPadding;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(float f) {
            super(3);
            this.$topPadding = f;
        }

        @Override // X.G0W
        public /* bridge */ /* synthetic */ Unit invoke(AnonymousClass037 anonymousClass037, BFM bfm, Integer num) {
            invoke(anonymousClass037, bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(AnonymousClass037 anonymousClass037, BFM bfm, int i) {
            if (AnonymousClass001.A1b(AnonymousClass004.A1G(i), bfm, i)) {
                C01N.A08(bfm, BRg.A00, this.$topPadding);
            } else {
                bfm.Afo();
            }
        }
    }

    /* renamed from: com.facebook.aura.file.view.FolderViewerScreenKt$FolderViewerScreen$5$2$1$1$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0W<AnonymousClass037, BFM, Integer, Unit> {
        public final /* synthetic */ MutableState<FilesSortMode> $sortMode$delegate;

        /* renamed from: com.facebook.aura.file.view.FolderViewerScreenKt$FolderViewerScreen$5$2$1$1$2$1, reason: invalid class name */
        public final class AnonymousClass1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
            public final /* synthetic */ MutableState<FilesSortMode> $sortMode$delegate;

            /* renamed from: com.facebook.aura.file.view.FolderViewerScreenKt$FolderViewerScreen$5$2$1$1$2$1$WhenMappings */
            public abstract /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[FilesSortMode.values().length];
                    try {
                        AnonymousClass002.A13(FilesSortMode.NAME, iArr);
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        AnonymousClass002.A14(FilesSortMode.TYPE, iArr);
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        AnonymousClass002.A15(FilesSortMode.DATE, iArr);
                    } catch (NoSuchFieldError unused3) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(MutableState<FilesSortMode> mutableState) {
                super(2);
                this.$sortMode$delegate = mutableState;
            }

            @Override // X.G0V
            public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
                invoke(bfm, AnonymousClass001.A0F(num));
                return Unit.INSTANCE;
            }

            public final void invoke(BFM bfm, int i) {
                int i2;
                if (AnonymousClass001.A1b(AnonymousClass002.A1P(i & 3, 2), bfm, i)) {
                    BS0 bs0 = BRg.A00;
                    C1062ATq c1062ATq = C10G.A02;
                    float f = AuraDimensKt.SpacingMedium;
                    float f2 = AuraDimensKt.SpacingXsmallPlusNano;
                    BRg bRgA0C = C3U4.A0C(c1062ATq, f, f2, AuraDimensKt.SpacingLarge, f2);
                    C1AC c1ac = C2VU.A04;
                    MutableState<FilesSortMode> mutableState = this.$sortMode$delegate;
                    InterfaceC1380AiA interfaceC1380AiAA00 = C0A8.A00(AcQ.A01, bfm, c1ac, 48);
                    BBI bbi = (BBI) bfm;
                    int iA0J = AnonymousClass003.A0J(bbi);
                    AKQ akqA04 = BBI.A04(bbi);
                    BRg bRgA01 = AxM.A01(bfm, bRgA0C);
                    Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
                    if (bbi.A0V == null) {
                        C00x.A00();
                        throw F60.createAndThrow();
                    }
                    AnonymousClass005.A0n(bfm, bbi, function0);
                    AnonymousClass005.A0p(bfm, interfaceC1380AiAA00, akqA04, bRgA01, iA0J);
                    C90m c90m = C90m.A00;
                    int iOrdinal = mutableState.getValue().ordinal();
                    if (iOrdinal != 0) {
                        if (iOrdinal != 1) {
                            if (iOrdinal == 2) {
                                i2 = R.string._name_removed__res_0x7f120c5f;
                            } else {
                                throw new NoWhenBranchMatchedException();
                            }
                        } else {
                            i2 = R.string._name_removed__res_0x7f120c62;
                        }
                    } else {
                        i2 = R.string._name_removed__res_0x7f120c60;
                    }
                    AuraTextKt.m2639AuraTextUY9GdpU(AbstractC2271BQs.A01(bfm, i2), null, C06G.A0C(bfm), C06G.A0X(bfm), null, null, null, false, 0, 0, 0, null, null, null, bfm, 0, 0, 16370);
                    C01N.A07(bfm, AnonymousClass001.A0O(c90m, bs0, true));
                    FilesSortMode value = mutableState.getValue();
                    Object objAaT = bfm.AaT();
                    if (objAaT == C78N.A00) {
                        objAaT = new FolderViewerScreenKt$FolderViewerScreen$5$2$1$1$2$1$1$1$1(mutableState);
                        bfm.Ai0(objAaT);
                    }
                    InlineFilesCardKt.FilesSortIcon(value, (G0U) objAaT, null, bfm, 48, 4);
                    BBI.A0R(bbi, true);
                    return;
                }
                bfm.Afo();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(MutableState<FilesSortMode> mutableState) {
            super(3);
            this.$sortMode$delegate = mutableState;
        }

        @Override // X.G0W
        public /* bridge */ /* synthetic */ Unit invoke(AnonymousClass037 anonymousClass037, BFM bfm, Integer num) {
            invoke(anonymousClass037, bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(AnonymousClass037 anonymousClass037, BFM bfm, int i) {
            if (AnonymousClass001.A1b(AnonymousClass002.A1P(i & 17, 16), bfm, i)) {
                FolderViewerScreenKt.FolderViewerCardItem(true, false, null, B1V.A00(bfm, new AnonymousClass1(this.$sortMode$delegate), -1218633412), bfm, 3126, 4);
            } else {
                bfm.Afo();
            }
        }
    }

    /* renamed from: com.facebook.aura.file.view.FolderViewerScreenKt$FolderViewerScreen$5$2$1$1$5, reason: invalid class name */
    public final class AnonymousClass5 extends AbstractC7559F3s implements G0W<AnonymousClass037, BFM, Integer, Unit> {
        public final /* synthetic */ float $bottomPadding;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass5(float f) {
            super(3);
            this.$bottomPadding = f;
        }

        @Override // X.G0W
        public /* bridge */ /* synthetic */ Unit invoke(AnonymousClass037 anonymousClass037, BFM bfm, Integer num) {
            invoke(anonymousClass037, bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(AnonymousClass037 anonymousClass037, BFM bfm, int i) {
            if (AnonymousClass001.A1b(AnonymousClass004.A1G(i), bfm, i)) {
                C01N.A08(bfm, BRg.A00, this.$bottomPadding + C06G.A00(bfm));
            } else {
                bfm.Afo();
            }
        }
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(C0CD c0cd) {
        C7384Etj.A0Y(c0cd, 0);
        c0cd.APJ("top_spacer", null, B1V.A01(new AnonymousClass1(this.$topPadding), -63157819, true));
        DirectoryLoadingState value = this.$loadingState$delegate.getValue();
        if (value instanceof DirectoryLoadingState.Loading) {
            c0cd.APJ("loading_state", null, ComposableSingletons$FolderViewerScreenKt.lambda$998630333);
        } else if (value instanceof DirectoryLoadingState.Error) {
            c0cd.APJ("error_state", null, ComposableSingletons$FolderViewerScreenKt.lambda$916113894);
        } else {
            if (!(value instanceof DirectoryLoadingState.Success)) {
                throw new NoWhenBranchMatchedException();
            }
            if (((DirectoryLoadingState.Success) value).entries.isEmpty()) {
                c0cd.APJ("empty_state", null, ComposableSingletons$FolderViewerScreenKt.f59lambda$2141124576);
            } else {
                c0cd.APJ("header", null, B1V.A01(new AnonymousClass2(this.$sortMode$delegate), -1208212375, true));
                final List<HxE<WorkspaceEntry, Integer>> list = this.$flatEntries;
                final AnonymousClass3 anonymousClass3 = AnonymousClass3.INSTANCE;
                final MutableState<BQI<String>> mutableState = this.$expandedFolders$delegate;
                final MutableState<BQI<String>> mutableState2 = this.$loadingFolders$delegate;
                final MutableState<BO6<String, AHD<WorkspaceEntry>>> mutableState3 = this.$folderContents$delegate;
                final MutableState<String> mutableState4 = this.$justExpandedPath$delegate;
                final MutableState<String> mutableState5 = this.$collapsingPath$delegate;
                final G0U<WorkspaceEntry, Unit> g0u = this.$onEntryClick;
                final G0U<WorkspaceEntry, Unit> g0u2 = this.$onToggleFolder;
                final G0U<WorkspaceEntry, Unit> g0u3 = this.$onRenameClick;
                final G0U<WorkspaceEntry, Unit> g0u4 = this.$onDeleteClick;
                final G0U<WorkspaceEntry, Unit> g0u5 = this.$onDownloadClick;
                final G0V<WorkspaceEntry, Bitmap, Unit> g0v = this.$onNavigateToConversation;
                c0cd.APL(anonymousClass3 != null ? new G0U<Integer, Object>() { // from class: com.facebook.aura.file.view.FolderViewerScreenKt$FolderViewerScreen$5$2$1$1$invoke$$inlined$itemsIndexed$default$1
                    public final Object invoke(int i) {
                        return AnonymousClass006.A0n(Integer.valueOf(i), list, anonymousClass3, i);
                    }

                    @Override // X.G0U
                    public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                        return invoke(AnonymousClass001.A0F(num));
                    }
                } : null, new G0U<Integer, Object>() { // from class: com.facebook.aura.file.view.FolderViewerScreenKt$FolderViewerScreen$5$2$1$1$invoke$$inlined$itemsIndexed$default$2
                    @Override // X.G0U
                    public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                        list.get(AnonymousClass001.A0F(num));
                        return null;
                    }

                    public final Object invoke(int i) {
                        list.get(i);
                        return null;
                    }
                }, B1V.A01(new G2j<AnonymousClass037, Integer, BFM, Integer, Unit>() { // from class: com.facebook.aura.file.view.FolderViewerScreenKt$FolderViewerScreen$5$2$1$1$invoke$$inlined$itemsIndexed$default$3
                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Removed duplicated region for block: B:14:0x0065  */
                    /* JADX WARN: Removed duplicated region for block: B:26:0x00b6  */
                    /* JADX WARN: Removed duplicated region for block: B:44:0x0138  */
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final void invoke(X.AnonymousClass037 r23, int r24, X.BFM r25, int r26) {
                        /*
                            Method dump skipped, instructions count: 325
                            To view this dump add '--comments-level debug' option
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.file.view.FolderViewerScreenKt$FolderViewerScreen$5$2$1$1$invoke$$inlined$itemsIndexed$default$3.invoke(X.037, int, X.BFM, int):void");
                    }

                    @Override // X.G2j
                    public /* bridge */ /* synthetic */ Unit invoke(AnonymousClass037 anonymousClass037, Integer num, BFM bfm, Integer num2) {
                        invoke(anonymousClass037, AnonymousClass001.A0F(num), bfm, AnonymousClass001.A0F(num2));
                        return Unit.INSTANCE;
                    }
                }, 2039820996, true), list.size());
            }
        }
        c0cd.APJ("bottom_spacer", null, B1V.A01(new AnonymousClass5(this.$bottomPadding), -1747999172, true));
    }

    /* renamed from: com.facebook.aura.file.view.FolderViewerScreenKt$FolderViewerScreen$5$2$1$1$3, reason: invalid class name */
    public final class AnonymousClass3 extends AbstractC7559F3s implements G0V<Integer, HxE<? extends WorkspaceEntry, ? extends Integer>, Object> {
        public static final AnonymousClass3 INSTANCE = new AnonymousClass3();

        public AnonymousClass3() {
            super(2);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Object invoke(Integer num, HxE<? extends WorkspaceEntry, ? extends Integer> hxE) {
            return invoke(AnonymousClass001.A0F(num), (HxE<WorkspaceEntry, Integer>) hxE);
        }

        public final Object invoke(int i, HxE<WorkspaceEntry, Integer> hxE) {
            C7384Etj.A0Y(hxE, 1);
            return hxE.first.relativePath;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public FolderViewerScreenKt$FolderViewerScreen$5$2$1$1(List<HxE<WorkspaceEntry, Integer>> list, float f, C1BO<? extends DirectoryLoadingState> c1bo, MutableState<FilesSortMode> mutableState, MutableState<BQI<String>> mutableState2, MutableState<BQI<String>> mutableState3, MutableState<BO6<String, AHD<WorkspaceEntry>>> mutableState4, MutableState<String> mutableState5, MutableState<String> mutableState6, G0U<? super WorkspaceEntry, Unit> g0u, G0U<? super WorkspaceEntry, Unit> g0u2, G0U<? super WorkspaceEntry, Unit> g0u3, G0U<? super WorkspaceEntry, Unit> g0u4, G0U<? super WorkspaceEntry, Unit> g0u5, G0V<? super WorkspaceEntry, ? super Bitmap, Unit> g0v, float f2) {
        super(1);
        this.$flatEntries = list;
        this.$topPadding = f;
        this.$loadingState$delegate = c1bo;
        this.$sortMode$delegate = mutableState;
        this.$expandedFolders$delegate = mutableState2;
        this.$loadingFolders$delegate = mutableState3;
        this.$folderContents$delegate = mutableState4;
        this.$justExpandedPath$delegate = mutableState5;
        this.$collapsingPath$delegate = mutableState6;
        this.$onEntryClick = g0u;
        this.$onToggleFolder = g0u2;
        this.$onRenameClick = g0u3;
        this.$onDeleteClick = g0u4;
        this.$onDownloadClick = g0u5;
        this.$onNavigateToConversation = g0v;
        this.$bottomPadding = f2;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(C0CD c0cd) {
        invoke2(c0cd);
        return Unit.INSTANCE;
    }
}
