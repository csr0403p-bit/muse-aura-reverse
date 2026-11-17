package com.facebook.aura.file.view;

import X.AGI;
import X.AHD;
import X.AKH;
import X.AKQ;
import X.AVy;
import X.AbstractC0878AGe;
import X.AbstractC2271BQs;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass007;
import X.AnonymousClass011;
import X.AxM;
import X.B6A;
import X.BBI;
import X.BBb;
import X.BFM;
import X.BOf;
import X.BRg;
import X.C00x;
import X.C06G;
import X.C1515AkP;
import X.C1DG;
import X.C2FI;
import X.C7384Etj;
import X.C78N;
import X.F60;
import X.G0U;
import X.G0V;
import X.InterfaceC1380AiA;
import X.InterfaceC1516AkQ;
import android.graphics.Bitmap;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.R;
import com.facebook.aura.installsource.AuraInstallSourceDetector;
import com.facebook.aura.library.repo.FilesSortMode;
import com.facebook.aura.library.repo.WorkspaceEntry;
import com.facebook.aura.vds.compose.contextmenu.AuraContextMenuItem;
import com.facebook.aura.vds.compose.contextmenu.AuraContextMenuKt;
import com.facebook.aura.vds.compose.icons.AuraIconButtonBackground;
import com.facebook.aura.vds.compose.icons.AuraIconButtonKt;
import com.facebook.aura.vds.compose.icons.AuraIconButtonSizeV2;
import com.facebook.aura.vds.compose.icons.AuraIconButtonStyle;
import com.facebook.aura.vds.compose.swipeable.AuraSwipeableCardBackgroundProvider;
import com.facebook.aura.vds.compose.swipeable.AuraSwipeableMenuState;
import com.facebook.aura.vds.compose.theme.AuraColors;
import com.facebook.aura.vds.compose.theme.AuraColorsKt;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public abstract class InlineFilesCardKt {

    /* renamed from: com.facebook.aura.file.view.InlineFilesCardKt$FilesSortIcon$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ G0U<FilesSortMode, Unit> $onSortModeChange;
        public final /* synthetic */ FilesSortMode $sortMode;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass2(FilesSortMode filesSortMode, G0U<? super FilesSortMode, Unit> g0u, BRg bRg, int i, int i2) {
            super(2);
            this.$sortMode = filesSortMode;
            this.$onSortModeChange = g0u;
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
            InlineFilesCardKt.FilesSortIcon(this.$sortMode, this.$onSortModeChange, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.file.view.InlineFilesCardKt$InlineEntryRow$2, reason: invalid class name and case insensitive filesystem */
    public final class C119742 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$changed1;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ Integer $childCount;
        public final /* synthetic */ int $depth;
        public final /* synthetic */ WorkspaceEntry $entry;
        public final /* synthetic */ boolean $isExpanded;
        public final /* synthetic */ boolean $isLoading;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onChevronClick;
        public final /* synthetic */ Function0<Unit> $onClick;
        public final /* synthetic */ Function0<Unit> $onDeleteClick;
        public final /* synthetic */ Function0<Unit> $onDownloadClick;
        public final /* synthetic */ Function0<Unit> $onRenameClick;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C119742(WorkspaceEntry workspaceEntry, boolean z, boolean z2, Integer num, Function0<Unit> function0, Function0<Unit> function02, Function0<Unit> function03, Function0<Unit> function04, Function0<Unit> function05, BRg bRg, int i, int i2, int i3, int i4) {
            super(2);
            this.$entry = workspaceEntry;
            this.$isExpanded = z;
            this.$isLoading = z2;
            this.$childCount = num;
            this.$onClick = function0;
            this.$onChevronClick = function02;
            this.$onRenameClick = function03;
            this.$onDeleteClick = function04;
            this.$onDownloadClick = function05;
            this.$modifier = bRg;
            this.$depth = i;
            this.$$changed = i2;
            this.$$changed1 = i3;
            this.$$default = i4;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            InlineFilesCardKt.InlineEntryRow(this.$entry, this.$isExpanded, this.$isLoading, this.$childCount, this.$onClick, this.$onChevronClick, this.$onRenameClick, this.$onDeleteClick, this.$onDownloadClick, this.$modifier, this.$depth, bfm, AnonymousClass011.A00(this.$$changed), AnonymousClass011.A01(this.$$changed1), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.file.view.InlineFilesCardKt$InlineSwipeableEntryRow$3, reason: invalid class name */
    public final class AnonymousClass3 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ Integer $childCount;
        public final /* synthetic */ int $depth;
        public final /* synthetic */ WorkspaceEntry $entry;
        public final /* synthetic */ boolean $isExpanded;
        public final /* synthetic */ boolean $isLoading;
        public final /* synthetic */ Function0<Unit> $onChevronClick;
        public final /* synthetic */ Function0<Unit> $onClick;
        public final /* synthetic */ Function0<Unit> $onDeleteClick;
        public final /* synthetic */ Function0<Unit> $onDownloadClick;
        public final /* synthetic */ Function0<Unit> $onRenameClick;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(WorkspaceEntry workspaceEntry, boolean z, boolean z2, Integer num, Function0<Unit> function0, Function0<Unit> function02, Function0<Unit> function03, Function0<Unit> function04, Function0<Unit> function05, int i) {
            super(2);
            this.$entry = workspaceEntry;
            this.$isExpanded = z;
            this.$isLoading = z2;
            this.$childCount = num;
            this.$onClick = function0;
            this.$onChevronClick = function02;
            this.$onRenameClick = function03;
            this.$onDeleteClick = function04;
            this.$onDownloadClick = function05;
            this.$depth = i;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            if (AnonymousClass001.A1b(AnonymousClass004.A1E(i), bfm, i)) {
                InlineFilesCardKt.InlineEntryRow(this.$entry, this.$isExpanded, this.$isLoading, this.$childCount, this.$onClick, this.$onChevronClick, this.$onRenameClick, this.$onDeleteClick, this.$onDownloadClick, null, this.$depth, bfm, 0, 0, 512);
            } else {
                bfm.Afo();
            }
        }
    }

    /* renamed from: com.facebook.aura.file.view.InlineFilesCardKt$InlineSwipeableEntryRow$4, reason: invalid class name */
    public final class AnonymousClass4 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$changed1;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ Integer $childCount;
        public final /* synthetic */ int $depth;
        public final /* synthetic */ WorkspaceEntry $entry;
        public final /* synthetic */ boolean $isExpanded;
        public final /* synthetic */ boolean $isLoading;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onChevronClick;
        public final /* synthetic */ Function0<Unit> $onClick;
        public final /* synthetic */ Function0<Unit> $onDeleteClick;
        public final /* synthetic */ Function0<Unit> $onDownloadClick;
        public final /* synthetic */ G0V<WorkspaceEntry, Bitmap, Unit> $onNavigateToConversation;
        public final /* synthetic */ Function0<Unit> $onRenameClick;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass4(WorkspaceEntry workspaceEntry, boolean z, boolean z2, Integer num, Function0<Unit> function0, Function0<Unit> function02, Function0<Unit> function03, Function0<Unit> function04, Function0<Unit> function05, G0V<? super WorkspaceEntry, ? super Bitmap, Unit> g0v, BRg bRg, int i, int i2, int i3, int i4) {
            super(2);
            this.$entry = workspaceEntry;
            this.$isExpanded = z;
            this.$isLoading = z2;
            this.$childCount = num;
            this.$onClick = function0;
            this.$onChevronClick = function02;
            this.$onRenameClick = function03;
            this.$onDeleteClick = function04;
            this.$onDownloadClick = function05;
            this.$onNavigateToConversation = g0v;
            this.$modifier = bRg;
            this.$depth = i;
            this.$$changed = i2;
            this.$$changed1 = i3;
            this.$$default = i4;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            InlineFilesCardKt.InlineSwipeableEntryRow(this.$entry, this.$isExpanded, this.$isLoading, this.$childCount, this.$onClick, this.$onChevronClick, this.$onRenameClick, this.$onDeleteClick, this.$onDownloadClick, this.$onNavigateToConversation, this.$modifier, this.$depth, bfm, AnonymousClass011.A00(this.$$changed), AnonymousClass011.A01(this.$$changed1), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.file.view.InlineFilesCardKt$sortedByVisibleThenHidden$1, reason: invalid class name and case insensitive filesystem */
    public final class C119751 extends AbstractC7559F3s implements G0U<WorkspaceEntry, Comparable<?>> {
        public static final C119751 INSTANCE = new C119751();

        public C119751() {
            super(1);
        }

        @Override // X.G0U
        public final Comparable<?> invoke(WorkspaceEntry workspaceEntry) {
            C7384Etj.A0Y(workspaceEntry, 0);
            return Boolean.valueOf(AnonymousClass005.A1a(workspaceEntry.name, "."));
        }
    }

    /* renamed from: com.facebook.aura.file.view.InlineFilesCardKt$sortedByVisibleThenHidden$2, reason: invalid class name and case insensitive filesystem */
    public final class C119762 extends AbstractC7559F3s implements G0U<WorkspaceEntry, Comparable<?>> {
        public static final C119762 INSTANCE = new C119762();

        public C119762() {
            super(1);
        }

        @Override // X.G0U
        public final Comparable<?> invoke(WorkspaceEntry workspaceEntry) {
            C7384Etj.A0Y(workspaceEntry, 0);
            return AnonymousClass001.A0u(workspaceEntry.name);
        }
    }

    public static final AHD<WorkspaceEntry> sortEntries(AHD<WorkspaceEntry> ahd, FilesSortMode filesSortMode) {
        List<WorkspaceEntry> listSortedByVisibleThenHidden;
        List<WorkspaceEntry> listSortedByVisibleThenHidden2;
        Comparator comparator;
        Comparator comparator2;
        boolean zA1a = AnonymousClass002.A1a(ahd, filesSortMode);
        ArrayList arrayList = new ArrayList();
        for (Object obj : ahd) {
            if (((WorkspaceEntry) obj).type == WorkspaceEntry.EntryType.DIRECTORY) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : ahd) {
            if (((WorkspaceEntry) obj2).type == WorkspaceEntry.EntryType.FILE) {
                arrayList2.add(obj2);
            }
        }
        int iOrdinal = filesSortMode.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == zA1a) {
                comparator = new Comparator() { // from class: com.facebook.aura.file.view.InlineFilesCardKt$sortEntries$$inlined$sortedBy$1
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // java.util.Comparator
                    public final int compare(T t, T t2) {
                        String str = ((WorkspaceEntry) t).name;
                        Locale locale = Locale.ROOT;
                        return str.toLowerCase(locale).compareTo(((WorkspaceEntry) t2).name.toLowerCase(locale));
                    }
                };
            } else {
                if (iOrdinal != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                comparator = new Comparator() { // from class: com.facebook.aura.file.view.InlineFilesCardKt$sortEntries$$inlined$sortedByDescending$1
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // java.util.Comparator
                    public final int compare(T t, T t2) {
                        String str = ((WorkspaceEntry) t2).modifiedAt;
                        if (str == null) {
                            str = "";
                        }
                        String str2 = ((WorkspaceEntry) t).modifiedAt;
                        return str.compareTo(str2 != null ? str2 : "");
                    }
                };
            }
            listSortedByVisibleThenHidden = AbstractC0878AGe.A0c(arrayList, comparator);
            if (iOrdinal != zA1a) {
                comparator2 = new Comparator() { // from class: com.facebook.aura.file.view.InlineFilesCardKt$sortEntries$$inlined$sortedByDescending$2
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // java.util.Comparator
                    public final int compare(T t, T t2) {
                        String str = ((WorkspaceEntry) t2).modifiedAt;
                        if (str == null) {
                            str = "";
                        }
                        String str2 = ((WorkspaceEntry) t).modifiedAt;
                        return str.compareTo(str2 != null ? str2 : "");
                    }
                };
            } else {
                final Comparator comparator3 = new Comparator() { // from class: com.facebook.aura.file.view.InlineFilesCardKt$sortEntries$$inlined$compareBy$1
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // java.util.Comparator
                    public final int compare(T t, T t2) {
                        String fileExtension = ((WorkspaceEntry) t).getFileExtension();
                        String strA0u = fileExtension != null ? AnonymousClass001.A0u(fileExtension) : null;
                        if (strA0u == null) {
                            strA0u = "";
                        }
                        String fileExtension2 = ((WorkspaceEntry) t2).getFileExtension();
                        return strA0u.compareTo(fileExtension2 != null ? AnonymousClass001.A0u(fileExtension2) : "");
                    }
                };
                comparator2 = new Comparator() { // from class: com.facebook.aura.file.view.InlineFilesCardKt$sortEntries$$inlined$thenBy$1
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // java.util.Comparator
                    public final int compare(T t, T t2) {
                        int iCompare = comparator3.compare(t, t2);
                        if (iCompare != 0) {
                            return iCompare;
                        }
                        String str = ((WorkspaceEntry) t).name;
                        Locale locale = Locale.ROOT;
                        return str.toLowerCase(locale).compareTo(((WorkspaceEntry) t2).name.toLowerCase(locale));
                    }
                };
            }
            listSortedByVisibleThenHidden2 = AbstractC0878AGe.A0c(arrayList2, comparator2);
        } else {
            listSortedByVisibleThenHidden = sortedByVisibleThenHidden(arrayList);
            listSortedByVisibleThenHidden2 = sortedByVisibleThenHidden(arrayList2);
        }
        return AGI.A07(AbstractC0878AGe.A0P(listSortedByVisibleThenHidden2, listSortedByVisibleThenHidden));
    }

    /* renamed from: com.facebook.aura.file.view.InlineFilesCardKt$InlineSwipeableEntryRow$1, reason: invalid class name */
    public final class AnonymousClass1 implements AuraSwipeableCardBackgroundProvider {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        @Override // com.facebook.aura.vds.compose.swipeable.AuraSwipeableCardBackgroundProvider
        public final void SwipeToRevealBackground(BRg bRg, AuraSwipeableMenuState auraSwipeableMenuState, BFM bfm, int i) {
            AnonymousClass003.A0u(bRg, auraSwipeableMenuState);
            bfm.AgG(152715574);
            int iA0f = (i & 384) == 0 ? AnonymousClass004.A0f(bfm, this) | i : i;
            AnonymousClass007.A1D(AnonymousClass002.A1P(iA0f & AuraInstallSourceDetector.SYSTEM_IMAGE_FLAGS, 128), bfm, iA0f);
            BBb bBbAAc = bfm.AAc();
            if (bBbAAc != null) {
                bBbAAc.A06 = new InlineFilesCardKt$InlineSwipeableEntryRow$1$SwipeToRevealBackground$1(this, bRg, auraSwipeableMenuState, i);
            }
        }
    }

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

    public static final void FilesSortIcon(FilesSortMode filesSortMode, G0U<? super FilesSortMode, Unit> g0u, BRg bRg, BFM bfm, int i, int i2) {
        int i3;
        BRg bRg2 = bRg;
        boolean zA1a = AnonymousClass002.A1a(filesSortMode, g0u);
        bfm.AgG(-1738059927);
        int iA08 = (i & 6) == 0 ? AnonymousClass005.A08(bfm, filesSortMode) | i : i;
        if ((i & 48) == 0) {
            iA08 |= AnonymousClass004.A0U(bfm, g0u);
        }
        int i4 = i2 & 4;
        if (i4 != 0) {
            iA08 |= 384;
        } else if ((i & 384) == 0) {
            iA08 |= AnonymousClass004.A0f(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1J(iA08), bfm, iA08)) {
            if (i4 != 0) {
                bRg2 = BRg.A00;
            }
            Object objAaT = bfm.AaT();
            Object obj = C78N.A00;
            MutableState mutableState = (MutableState) AnonymousClass005.A0g(bfm, objAaT, obj, false);
            AVy aVyA00 = BOf.A00(bfm, R.drawable.checkmark_outline_24, 0);
            AKH<AuraColors> akh = AuraColorsKt.LocalAuraColors;
            long jA0L = C06G.A0L(bfm, akh);
            int i5 = iA08 & 14;
            boolean zA1R = AnonymousClass001.A1R(bfm, aVyA00, AnonymousClass002.A1Q(i5, 4)) | bfm.A64(jA0L);
            Object objAaT2 = bfm.AaT();
            if (zA1R || objAaT2 == obj) {
                FilesSortMode[] filesSortModeArrValues = FilesSortMode.values();
                int length = filesSortModeArrValues.length;
                ArrayList arrayList = new ArrayList(length);
                for (int i6 = 0; i6 < length; i6++) {
                    FilesSortMode filesSortMode2 = filesSortModeArrValues[i6];
                    int iOrdinal = filesSortMode2.ordinal();
                    if (iOrdinal == 0) {
                        i3 = 0;
                    } else if (iOrdinal == zA1a) {
                        i3 = 1;
                    } else {
                        if (iOrdinal != 2) {
                            throw new NoWhenBranchMatchedException();
                        }
                        i3 = 2;
                    }
                    arrayList.add(new AuraContextMenuItem(i3, filesSortMode2.getLabel(), null, aVyA00, new B6A(filesSortMode2 == filesSortMode ? jA0L : B6A.A06), null, AnonymousClass002.A1Z(filesSortMode2, filesSortMode), false, false, zA1a, false, BRg.A00, zA1a ? 1 : 0, zA1a ? 1 : 0));
                }
                objAaT2 = AnonymousClass001.A0z(bfm, arrayList);
            }
            AHD ahd = (AHD) objAaT2;
            InterfaceC1380AiA interfaceC1380AiAA0c = AnonymousClass001.A0c(false);
            BBI bbi = (BBI) bfm;
            long j = bbi.A06;
            int i7 = (int) (j ^ (j >>> 32));
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRg2);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function0);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA0c, akqA04, bRgA01, i7);
            AVy aVyA002 = BOf.A00(bfm, R.drawable.arrows_up_down_wght600_outline_24, 0);
            AuraIconButtonSizeV2 auraIconButtonSizeV2 = AuraIconButtonSizeV2.X_SMALL;
            AuraIconButtonStyle auraIconButtonStyle = AuraIconButtonStyle.SECONDARY;
            AuraIconButtonBackground auraIconButtonBackground = AuraIconButtonBackground.NO_BACKGROUND;
            long jA0I = C06G.A0I(bfm, akh);
            String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f121193);
            Object objAaT3 = bfm.AaT();
            if (objAaT3 == obj) {
                objAaT3 = new InlineFilesCardKt$FilesSortIcon$1$1$1(mutableState);
                bfm.Ai0(objAaT3);
            }
            AuraIconButtonKt.m2552AuraIconButtonV2imgtlEU(null, aVyA002, auraIconButtonSizeV2, auraIconButtonStyle, auraIconButtonBackground, null, strA01, (Function0) objAaT3, null, false, new B6A(jA0I), new C1DG(16.0f), null, null, bfm, (AVy.$stable << 3) | 12610944, 48, 13089);
            boolean zA0A = MutableState.A0A(mutableState);
            long jA0F = AnonymousClass002.A0F();
            long jA0G = AnonymousClass002.A0G(jA0F, jA0F << 32);
            boolean zA1O = AnonymousClass001.A1O(iA08) | AnonymousClass002.A1O(i5);
            Object objAaT4 = bfm.AaT();
            if (zA1O || objAaT4 == obj) {
                objAaT4 = new InlineFilesCardKt$FilesSortIcon$1$2$1(filesSortMode, g0u, mutableState);
                bfm.Ai0(objAaT4);
            }
            G0U g0u2 = (G0U) objAaT4;
            Object objAaT5 = bfm.AaT();
            if (objAaT5 == obj) {
                objAaT5 = new InlineFilesCardKt$FilesSortIcon$1$3$1(mutableState);
                bfm.Ai0(objAaT5);
            }
            AuraContextMenuKt.m2519AuraContextMenukiaLOpA(null, g0u2, (Function0) objAaT5, zA0A, null, jA0G, null, false, new InlineFilesCardKt$FilesSortIcon$1$4(ahd), false, null, null, null, false, bfm, 196992, 0, 16081);
            BBI.A0R(bbi, zA1a);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass2(filesSortMode, g0u, bRg2, i, i2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x00bb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void InlineEntryRow(com.facebook.aura.library.repo.WorkspaceEntry r81, boolean r82, boolean r83, java.lang.Integer r84, kotlin.jvm.functions.Function0<kotlin.Unit> r85, kotlin.jvm.functions.Function0<kotlin.Unit> r86, kotlin.jvm.functions.Function0<kotlin.Unit> r87, kotlin.jvm.functions.Function0<kotlin.Unit> r88, kotlin.jvm.functions.Function0<kotlin.Unit> r89, X.BRg r90, int r91, X.BFM r92, int r93, int r94, int r95) {
        /*
            Method dump skipped, instructions count: 1425
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.file.view.InlineFilesCardKt.InlineEntryRow(com.facebook.aura.library.repo.WorkspaceEntry, boolean, boolean, java.lang.Integer, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, X.BRg, int, X.BFM, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x00c0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void InlineSwipeableEntryRow(com.facebook.aura.library.repo.WorkspaceEntry r26, boolean r27, boolean r28, java.lang.Integer r29, kotlin.jvm.functions.Function0<kotlin.Unit> r30, kotlin.jvm.functions.Function0<kotlin.Unit> r31, kotlin.jvm.functions.Function0<kotlin.Unit> r32, kotlin.jvm.functions.Function0<kotlin.Unit> r33, kotlin.jvm.functions.Function0<kotlin.Unit> r34, X.G0V<? super com.facebook.aura.library.repo.WorkspaceEntry, ? super android.graphics.Bitmap, kotlin.Unit> r35, X.BRg r36, int r37, X.BFM r38, int r39, int r40, int r41) {
        /*
            Method dump skipped, instructions count: 370
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.file.view.InlineFilesCardKt.InlineSwipeableEntryRow(com.facebook.aura.library.repo.WorkspaceEntry, boolean, boolean, java.lang.Integer, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, X.G0V, X.BRg, int, X.BFM, int, int, int):void");
    }

    public static final List<WorkspaceEntry> sortedByVisibleThenHidden(List<WorkspaceEntry> list) {
        return AbstractC0878AGe.A0c(list, new C2FI(new G0U[]{C119751.INSTANCE, C119762.INSTANCE}));
    }
}
