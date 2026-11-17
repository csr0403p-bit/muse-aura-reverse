package com.facebook.aura.storagerecovery.content;

import X.AKQ;
import X.AVy;
import X.AbstractC2271BQs;
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
import X.AxM;
import X.B1V;
import X.BBI;
import X.BBb;
import X.BFM;
import X.BOf;
import X.BRg;
import X.BS0;
import X.C00x;
import X.C01N;
import X.C0v5;
import X.C0z7;
import X.C1062ATq;
import X.C10G;
import X.C1515AkP;
import X.C1YY;
import X.C2VU;
import X.C3U4;
import X.C3cG;
import X.C3cH;
import X.C60P;
import X.C60Q;
import X.C7384Etj;
import X.C78N;
import X.C7BY;
import X.C90l;
import X.F60;
import X.G0U;
import X.G0V;
import X.InterfaceC1380AiA;
import X.InterfaceC1516AkQ;
import android.text.BidiFormatter;
import com.facebook.aura.R;
import com.facebook.aura.file.row.HatchFileEntryRowKt;
import com.facebook.aura.file.utils.HatchFileUIUtils;
import com.facebook.aura.library.repo.WorkspaceEntry;
import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;
import com.facebook.aura.storagerecovery.StorageRecoveryPhase;
import com.facebook.aura.storagerecovery.StorageRecoveryUiState;
import com.facebook.aura.storagerecovery.data.HatchStorageRecoveryEntry;
import com.facebook.aura.storagerecovery.data.HatchStorageRecoveryEntryKind;
import com.facebook.aura.vds.compose.base.AuraDimensKt;
import com.facebook.aura.vds.compose.button.AuraButtonKt;
import com.facebook.aura.vds.compose.button.AuraButtonSize;
import com.facebook.aura.vds.compose.button.AuraButtonStyles;
import com.facebook.aura.vds.compose.button.AuraElevatedButtonKt;
import com.facebook.aura.vds.compose.icons.AuraIconKt;
import com.facebook.aura.vds.compose.icons.AuraIconSize;
import com.facebook.aura.vds.compose.text.AuraTextKt;
import com.facebook.aura.vds.compose.theme.AuraTheme;
import com.facebook.common.dextricks.RuntimeInternals;
import java.util.Locale;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public abstract class StorageRecoveryFileListKt {

    /* renamed from: com.facebook.aura.storagerecovery.content.StorageRecoveryFileListKt$StorageRecoveryDirectoryHeader$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onNavigateBack;
        public final /* synthetic */ StorageRecoveryUiState $uiState;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(StorageRecoveryUiState storageRecoveryUiState, Function0<Unit> function0, BRg bRg, int i, int i2) {
            super(2);
            this.$uiState = storageRecoveryUiState;
            this.$onNavigateBack = function0;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            StorageRecoveryFileListKt.StorageRecoveryDirectoryHeader(this.$uiState, this.$onNavigateBack, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.storagerecovery.content.StorageRecoveryFileListKt$StorageRecoveryEmptyFolder$2, reason: invalid class name and case insensitive filesystem */
    public final class C141222 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C141222(BRg bRg, int i, int i2) {
            super(2);
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            StorageRecoveryFileListKt.StorageRecoveryEmptyFolder(this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.storagerecovery.content.StorageRecoveryFileListKt$StorageRecoveryEntries$2, reason: invalid class name and case insensitive filesystem */
    public final class C141232 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ G0U<String, Unit> $onEntryTap;
        public final /* synthetic */ StorageRecoveryUiState $uiState;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C141232(StorageRecoveryUiState storageRecoveryUiState, G0U<? super String, Unit> g0u, BRg bRg, int i, int i2) {
            super(2);
            this.$uiState = storageRecoveryUiState;
            this.$onEntryTap = g0u;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            StorageRecoveryFileListKt.StorageRecoveryEntries(this.$uiState, this.$onEntryTap, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.storagerecovery.content.StorageRecoveryFileListKt$StorageRecoveryEntryRow$2, reason: invalid class name and case insensitive filesystem */
    public final class C141242 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ HatchStorageRecoveryEntry $entry;
        public final /* synthetic */ boolean $isSelected;
        public final /* synthetic */ boolean $isSelecting;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C141242(HatchStorageRecoveryEntry hatchStorageRecoveryEntry, boolean z, boolean z2) {
            super(2);
            this.$entry = hatchStorageRecoveryEntry;
            this.$isSelecting = z;
            this.$isSelected = z2;
        }

        public final void invoke(BFM bfm, int i) {
            if (AnonymousClass001.A1b(AnonymousClass002.A1P(i & 3, 2), bfm, i)) {
                AuraIconKt.m2567AuraIconFHprtrg(null, BOf.A00(bfm, StorageRecoveryFileListKt.trailingIcon(this.$entry, this.$isSelecting, this.$isSelected), 0), AuraIconSize.SMALL, null, StorageRecoveryFileListKt.trailingIconTint(this.$entry, this.$isSelecting, this.$isSelected, bfm, 0), null, bfm, AnonymousClass001.A03(), 41);
            } else {
                bfm.Afo();
            }
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.storagerecovery.content.StorageRecoveryFileListKt$StorageRecoveryEntryRow$3, reason: invalid class name */
    public final class AnonymousClass3 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ HatchStorageRecoveryEntry $entry;
        public final /* synthetic */ boolean $isEnabled;
        public final /* synthetic */ boolean $isSelected;
        public final /* synthetic */ boolean $isSelecting;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onTap;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(HatchStorageRecoveryEntry hatchStorageRecoveryEntry, boolean z, boolean z2, boolean z3, Function0<Unit> function0, BRg bRg, int i, int i2) {
            super(2);
            this.$entry = hatchStorageRecoveryEntry;
            this.$isSelecting = z;
            this.$isSelected = z2;
            this.$isEnabled = z3;
            this.$onTap = function0;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            StorageRecoveryFileListKt.StorageRecoveryEntryRow(this.$entry, this.$isSelecting, this.$isSelected, this.$isEnabled, this.$onTap, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.storagerecovery.content.StorageRecoveryFileListKt$StorageRecoveryFileList$2, reason: invalid class name and case insensitive filesystem */
    public final class C141252 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onDeleteSelected;
        public final /* synthetic */ G0U<String, Unit> $onEntryTap;
        public final /* synthetic */ Function0<Unit> $onNavigateBack;
        public final /* synthetic */ Function0<Unit> $onToggleSelectionMode;
        public final /* synthetic */ StorageRecoveryUiState $uiState;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C141252(StorageRecoveryUiState storageRecoveryUiState, Function0<Unit> function0, Function0<Unit> function02, G0U<? super String, Unit> g0u, Function0<Unit> function03, BRg bRg, int i, int i2) {
            super(2);
            this.$uiState = storageRecoveryUiState;
            this.$onNavigateBack = function0;
            this.$onToggleSelectionMode = function02;
            this.$onEntryTap = g0u;
            this.$onDeleteSelected = function03;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            StorageRecoveryFileListKt.StorageRecoveryFileList(this.$uiState, this.$onNavigateBack, this.$onToggleSelectionMode, this.$onEntryTap, this.$onDeleteSelected, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.storagerecovery.content.StorageRecoveryFileListKt$StorageRecoveryListHeader$2, reason: invalid class name and case insensitive filesystem */
    public final class C141262 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onToggleSelectionMode;
        public final /* synthetic */ StorageRecoveryUiState $uiState;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C141262(StorageRecoveryUiState storageRecoveryUiState, Function0<Unit> function0, BRg bRg, int i, int i2) {
            super(2);
            this.$uiState = storageRecoveryUiState;
            this.$onToggleSelectionMode = function0;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            StorageRecoveryFileListKt.StorageRecoveryListHeader(this.$uiState, this.$onToggleSelectionMode, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.storagerecovery.content.StorageRecoveryFileListKt$StorageRecoveryLoading$3, reason: invalid class name and case insensitive filesystem */
    public final class C141273 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C141273(BRg bRg, int i, int i2) {
            super(2);
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            StorageRecoveryFileListKt.StorageRecoveryLoading(this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    public static final void StorageRecoveryEntries(StorageRecoveryUiState storageRecoveryUiState, G0U<? super String, Unit> g0u, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(-1821667128);
        int iA0T = (i & 6) == 0 ? AnonymousClass004.A0T(bfm, storageRecoveryUiState) | i : i;
        if ((i & 48) == 0) {
            iA0T |= AnonymousClass004.A0U(bfm, g0u);
        }
        int i3 = i2 & 4;
        if (i3 != 0) {
            iA0T |= 384;
        } else if ((i & 384) == 0) {
            iA0T |= AnonymousClass004.A0f(bfm, bRg);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0T & 147, 146), bfm, iA0T)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            if (storageRecoveryUiState.phase == StorageRecoveryPhase.LOADING) {
                bfm.AgE(1724553203);
                StorageRecoveryLoading(bRg2, bfm, (iA0T >> 6) & 14, 0);
            } else if (!storageRecoveryUiState.entries.isEmpty() || storageRecoveryUiState.currentDirectoryName == null) {
                boolean zA1Z = AnonymousClass001.A1Z(storageRecoveryUiState, bfm, 1724560951) | AnonymousClass001.A1N(iA0T);
                Object objAaT = bfm.AaT();
                if (zA1Z || objAaT == C78N.A00) {
                    objAaT = new StorageRecoveryFileListKt$StorageRecoveryEntries$1$1(storageRecoveryUiState, g0u);
                    bfm.Ai0(objAaT);
                }
                C1YY.A01(null, null, null, null, null, bfm, null, bRg2, (G0U) objAaT, (iA0T >> 6) & 14, 510, false, false);
            } else {
                bfm.AgE(1724557243);
                StorageRecoveryEmptyFolder(C3U4.A07(bRg2, AuraDimensKt.SpacingMedium), bfm, 0, 0);
            }
            AnonymousClass001.A1D(bfm);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C141232(storageRecoveryUiState, g0u, bRg2, i, i2);
        }
    }

    public static final void StorageRecoveryDirectoryHeader(StorageRecoveryUiState storageRecoveryUiState, Function0<Unit> function0, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(-1315589187);
        int iA0T = (i & 6) == 0 ? AnonymousClass004.A0T(bfm, storageRecoveryUiState) | i : i;
        if ((i & 48) == 0) {
            iA0T |= AnonymousClass004.A0U(bfm, function0);
        }
        int i3 = i2 & 4;
        if (i3 != 0) {
            iA0T |= 384;
        } else if ((i & 384) == 0) {
            iA0T |= AnonymousClass004.A0f(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0T & 147, 146), bfm, iA0T)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f121079);
            BRg bRgA0R = AnonymousClass001.A0R(bRg2);
            InterfaceC1380AiA interfaceC1380AiAA0a = AnonymousClass001.A0a();
            BBI bbi = (BBI) bfm;
            int iA0J = AnonymousClass003.A0J(bbi);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA0R);
            Function0<InterfaceC1516AkQ> function02 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function02);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA0a, akqA04, bRgA01, iA0J);
            C0z7 c0z7 = C0z7.A00;
            String strA012 = storageRecoveryUiState.currentDirectoryName;
            if (strA012 == null) {
                bfm.AgE(-1050105057);
                strA012 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f121093);
            } else {
                bfm.AgE(-1050106545);
            }
            BBI.A0R(bbi, false);
            AuraTheme auraTheme = AuraTheme.INSTANCE;
            AuraTextKt.m2639AuraTextUY9GdpU(strA012, null, C3cH.A06(bfm, auraTheme), auraTheme.getTypography(bfm, 6).bodyEmphasized, null, null, C3cH.A0F(3), false, 0, 0, 0, null, null, null, bfm, 0, 0, 16306);
            if (storageRecoveryUiState.currentDirectoryName != null) {
                AuraElevatedButtonKt.m2417AuraElevatedIconButtonXjqr6CI(BOf.A00(bfm, R.drawable.caret_left, 0), strA01, function0, c0z7.A4C(C2VU.A0B, C3cG.A09(bfm, 1806746994)), storageRecoveryUiState.getCanNavigateBack(), 0.0f, null, C60P.A04(C3cH.A06(bfm, auraTheme)), null, false, false, bfm, AVy.$stable | ((iA0T << 3) & 896), 0, 1888);
            } else {
                bfm.AgE(1807072959);
            }
            AnonymousClass003.A0q(bbi);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass2(storageRecoveryUiState, function0, bRg2, i, i2);
        }
    }

    public static final void StorageRecoveryEmptyFolder(BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(-782617135);
        int i3 = i2 & 1;
        int iA0d = i3 != 0 ? i | 6 : (i & 6) == 0 ? AnonymousClass004.A0d(bfm, bRg2) | i : i;
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 3, 2), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            BRg bRgA0T = AnonymousClass001.A0T(bRg2);
            InterfaceC1380AiA interfaceC1380AiAA0R = AnonymousClass006.A0R(bfm);
            BBI bbi = (BBI) bfm;
            int iA0J = AnonymousClass003.A0J(bbi);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA0T);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function0);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA0R, akqA04, bRgA01, iA0J);
            AVy aVyA00 = BOf.A00(bfm, R.drawable.hatch_file_types_folder_40, 0);
            AuraIconSize auraIconSize = AuraIconSize.MEDIUM;
            AuraTheme auraTheme = AuraTheme.INSTANCE;
            AuraIconKt.m2567AuraIconFHprtrg(null, aVyA00, auraIconSize, null, C3cH.A07(bfm, auraTheme), null, bfm, AnonymousClass001.A03(), 41);
            BS0 bs0 = BRg.A00;
            C01N.A08(bfm, bs0, AuraDimensKt.SpacingXsmall);
            AuraTextKt.m2639AuraTextUY9GdpU(AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f121080), null, C3cH.A06(bfm, auraTheme), C3cH.A0C(bfm, auraTheme), null, null, C3cH.A0F(3), false, 0, 0, 0, null, null, null, bfm, 0, 0, 16306);
            AuraTextKt.m2639AuraTextUY9GdpU(AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f12107f), null, C3cH.A07(bfm, auraTheme), C3cH.A0B(bfm, auraTheme), null, null, C3cH.A0F(3), false, 0, 0, 0, null, null, null, bfm, 0, 0, 16306);
            C01N.A08(bfm, bs0, AuraDimensKt.SpacingXlarge);
            BBI.A0R(bbi, true);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C141222(bRg2, i, i2);
        }
    }

    public static final void StorageRecoveryEntryRow(HatchStorageRecoveryEntry hatchStorageRecoveryEntry, boolean z, boolean z2, boolean z3, Function0<Unit> function0, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(1797048088);
        int iA0T = (i & 6) == 0 ? AnonymousClass004.A0T(bfm, hatchStorageRecoveryEntry) | i : i;
        if ((i & 48) == 0) {
            iA0T |= AnonymousClass004.A0o(bfm, z);
        }
        if ((i & 384) == 0) {
            iA0T |= AnonymousClass004.A0p(bfm, z2);
        }
        if ((i & 3072) == 0) {
            iA0T |= AnonymousClass004.A0q(bfm, z3);
        }
        if ((i & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA0T |= AnonymousClass004.A0X(bfm, function0);
        }
        int i3 = i2 & 32;
        int iA0i = 196608;
        if (i3 != 0) {
            iA0T |= iA0i;
        } else if ((196608 & i) == 0) {
            iA0i = AnonymousClass004.A0i(bfm, bRg2);
            iA0T |= iA0i;
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(74899 & iA0T, 74898), bfm, iA0T)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            int i4 = iA0T & 14;
            String strEntrySubtitle = entrySubtitle(hatchStorageRecoveryEntry, bfm, i4);
            String strEntryAccessibilityLabel = entryAccessibilityLabel(hatchStorageRecoveryEntry, strEntrySubtitle, z, z2, bfm, AnonymousClass002.A08(iA0T << 3, i4));
            int workspaceEntryIconRes = HatchFileUIUtils.INSTANCE.getWorkspaceEntryIconRes(workspaceType(hatchStorageRecoveryEntry), fileExtension(hatchStorageRecoveryEntry), bfm, 384);
            String str = hatchStorageRecoveryEntry.displayName;
            boolean zA65 = bfm.A65(strEntryAccessibilityLabel);
            Object objAaT = bfm.AaT();
            if (zA65 || objAaT == C78N.A00) {
                objAaT = new StorageRecoveryFileListKt$StorageRecoveryEntryRow$1$1(strEntryAccessibilityLabel);
                bfm.Ai0(objAaT);
            }
            HatchFileEntryRowKt.HatchFileEntryRow(workspaceEntryIconRes, str, strEntrySubtitle, C0v5.A04(AnonymousClass001.A0Y(bRg2, objAaT, true), C3cG.A0A(0), null, function0, z3), 0, null, B1V.A00(bfm, new C141242(hatchStorageRecoveryEntry, z, z2), -2006503765), bfm, 1572864, 48);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass3(hatchStorageRecoveryEntry, z, z2, z3, function0, bRg2, i, i2);
        }
    }

    public static final void StorageRecoveryFileList(StorageRecoveryUiState storageRecoveryUiState, Function0<Unit> function0, Function0<Unit> function02, G0U<? super String, Unit> g0u, Function0<Unit> function03, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        C7384Etj.A0Y(storageRecoveryUiState, 0);
        AnonymousClass005.A11(function0, function02, g0u, 1);
        C7384Etj.A0Y(function03, 4);
        bfm.AgG(863388798);
        int iA0T = (i & 6) == 0 ? AnonymousClass004.A0T(bfm, storageRecoveryUiState) | i : i;
        if ((i & 48) == 0) {
            iA0T |= AnonymousClass004.A0U(bfm, function0);
        }
        if ((i & 384) == 0) {
            iA0T |= AnonymousClass004.A0V(bfm, function02);
        }
        if ((i & 3072) == 0) {
            iA0T |= AnonymousClass004.A0W(bfm, g0u);
        }
        if ((i & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA0T |= AnonymousClass004.A0X(bfm, function03);
        }
        int i3 = i2 & 32;
        int iA0i = 196608;
        if (i3 != 0) {
            iA0T |= iA0i;
        } else if ((196608 & i) == 0) {
            iA0i = AnonymousClass004.A0i(bfm, bRg2);
            iA0T |= iA0i;
        }
        if (AnonymousClass001.A1b(AnonymousClass005.A1A(iA0T), bfm, iA0T)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            InterfaceC1380AiA interfaceC1380AiAA0U = AnonymousClass002.A0U(bfm);
            BBI bbi = (BBI) bfm;
            int iA0J = AnonymousClass003.A0J(bbi);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRg2);
            Function0<InterfaceC1516AkQ> function04 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function04);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA0U, akqA04, bRgA01, iA0J);
            C90l c90l = C90l.A00;
            BS0 bs0 = BRg.A00;
            float f = AuraDimensKt.SpacingMedium;
            int i4 = iA0T & 14;
            StorageRecoveryDirectoryHeader(storageRecoveryUiState, function0, C3U4.A0B(bs0, f, 0.0f), bfm, iA0T & 126, 0);
            StorageRecoveryListHeader(storageRecoveryUiState, function02, C3U4.A0B(bs0, f, 0.0f), bfm, i4 | ((iA0T >> 3) & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX), 0);
            C1062ATq c1062ATq = C10G.A02;
            StorageRecoveryEntries(storageRecoveryUiState, g0u, c90l.AiP(c1062ATq, 1.0f, true), bfm, i4 | ((iA0T >> 6) & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX), 0);
            if (!storageRecoveryUiState.isSelecting || storageRecoveryUiState.selectedTokens.size() <= 0 || storageRecoveryUiState.phase == StorageRecoveryPhase.AVAILABLE) {
                bfm.AgE(607381498);
            } else {
                bfm.AgE(606757623);
                AuraButtonKt.m2408AuraButtonnL3aKkM(null, AbstractC2271BQs.A00(R.plurals._name_removed__res_0x7f100040, new Object[]{Integer.valueOf(storageRecoveryUiState.selectedTokens.size())}, bfm, storageRecoveryUiState.selectedTokens.size()), null, C3U4.A0C(C3U4.A0B(c1062ATq, f, 0.0f), 0.0f, AuraDimensKt.SpacingXsmall, 0.0f, 0.0f), AuraButtonStyles.INSTANCE.destructive(null, bfm, 48, 1), AuraButtonSize.MEDIUM, null, false, false, storageRecoveryUiState.isMutationEnabled(), AnonymousClass002.A1Z(storageRecoveryUiState.phase, StorageRecoveryPhase.DELETING), false, null, null, function03, null, null, null, null, null, null, null, null, false, 0, false, 0, bfm, 196608, iA0T & 57344, 0, 134199749);
            }
            BBI.A0R(bbi, false);
            BBI.A0R(bbi, true);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C141252(storageRecoveryUiState, function0, function02, g0u, function03, bRg2, i, i2);
        }
    }

    public static final void StorageRecoveryListHeader(StorageRecoveryUiState storageRecoveryUiState, Function0<Unit> function0, BRg bRg, BFM bfm, int i, int i2) {
        StorageRecoveryPhase storageRecoveryPhase;
        BRg bRg2 = bRg;
        bfm.AgG(-716584216);
        int iA0T = (i & 6) == 0 ? AnonymousClass004.A0T(bfm, storageRecoveryUiState) | i : i;
        if ((i & 48) == 0) {
            iA0T |= AnonymousClass004.A0U(bfm, function0);
        }
        int i3 = i2 & 4;
        if (i3 != 0) {
            iA0T |= 384;
        } else if ((i & 384) == 0) {
            iA0T |= AnonymousClass004.A0f(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0T & 147, 146), bfm, iA0T)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            BRg bRgA0R = AnonymousClass001.A0R(bRg2);
            InterfaceC1380AiA interfaceC1380AiAA0b = AnonymousClass001.A0b(AcQ.A03, bfm, C2VU.A04);
            BBI bbi = (BBI) bfm;
            int iA0J = AnonymousClass003.A0J(bbi);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA0R);
            Function0<InterfaceC1516AkQ> function02 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function02);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA0b, akqA04, bRgA01, iA0J);
            String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f121087);
            AuraTheme auraTheme = AuraTheme.INSTANCE;
            AuraTextKt.m2639AuraTextUY9GdpU(strA01, null, C3cH.A06(bfm, auraTheme), auraTheme.getTypography(bfm, 6).subheadlineEmphasized, null, null, null, false, 0, 0, 0, null, null, null, bfm, 0, 0, 16370);
            if (storageRecoveryUiState.entries.isEmpty() || (storageRecoveryPhase = storageRecoveryUiState.phase) == StorageRecoveryPhase.AVAILABLE || storageRecoveryPhase == StorageRecoveryPhase.RECONNECTING) {
                bfm.AgE(-653165666);
            } else {
                bfm.AgE(-653557754);
                boolean z = storageRecoveryUiState.isSelecting;
                int i4 = R.string._name_removed__res_0x7f121094;
                if (z) {
                    i4 = R.string._name_removed__res_0x7f12107e;
                }
                AuraButtonKt.m2408AuraButtonnL3aKkM(null, AbstractC2271BQs.A01(bfm, i4), null, null, AuraButtonStyles.INSTANCE.elevated(null, bfm, 48, 1), AuraButtonSize.SMALL, null, false, false, storageRecoveryUiState.isMutationEnabled(), false, false, null, null, function0, null, null, null, null, null, null, null, null, false, 0, false, 0, bfm, 196608, (iA0T << 9) & 57344, 0, 134200781);
            }
            AnonymousClass003.A0q(bbi);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C141262(storageRecoveryUiState, function0, bRg2, i, i2);
        }
    }

    public static final String fileExtension(HatchStorageRecoveryEntry hatchStorageRecoveryEntry) {
        if (hatchStorageRecoveryEntry.kind == HatchStorageRecoveryEntryKind.DIRECTORY) {
            return null;
        }
        String strA0R = C7BY.A0R(hatchStorageRecoveryEntry.displayName, "", '.');
        if (strA0R.length() > 0) {
            return C60Q.A0j(strA0R);
        }
        return null;
    }

    public static final int trailingIcon(HatchStorageRecoveryEntry hatchStorageRecoveryEntry, boolean z, boolean z2) {
        return z ? z2 ? R.drawable.circle_check_wght400_filled_24 : R.drawable.ic_circle_outline_24 : hatchStorageRecoveryEntry.kind == HatchStorageRecoveryEntryKind.DIRECTORY ? R.drawable.caret_right_small : R.drawable.trash_wght400_outline_24;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0027 A[PHI: r2
  0x0027: PHI (r2v2 int) = (r2v1 int), (r2v3 int) binds: [B:9:0x001b, B:4:0x0005] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final long trailingIconTint(com.facebook.aura.storagerecovery.data.HatchStorageRecoveryEntry r1, boolean r2, boolean r3, X.BFM r4, int r5) {
        /*
            if (r2 == 0) goto L14
            r2 = 1843513505(0x6de1c8a1, float:8.734584E27)
            if (r3 == 0) goto L27
            r0 = 1843512058(0x6de1c2fa, float:8.73373E27)
            com.facebook.aura.vds.compose.theme.AuraColors r0 = X.C3cI.A0K(r4, r0)
            long r0 = r0.accent
        L10:
            X.AnonymousClass002.A19(r4)
            return r0
        L14:
            com.facebook.aura.storagerecovery.data.HatchStorageRecoveryEntryKind r1 = r1.kind
            com.facebook.aura.storagerecovery.data.HatchStorageRecoveryEntryKind r0 = com.facebook.aura.storagerecovery.data.HatchStorageRecoveryEntryKind.DIRECTORY
            r2 = 1843516513(0x6de1d461, float:8.7363597E27)
            if (r1 == r0) goto L27
            r0 = 1843517955(0x6de1da03, float:8.737211E27)
            com.facebook.aura.vds.compose.theme.AuraColors r0 = X.C3cI.A0K(r4, r0)
            long r0 = r0.destructiveText
            goto L10
        L27:
            com.facebook.aura.vds.compose.theme.AuraColors r0 = X.C3cI.A0K(r4, r2)
            long r0 = r0.secondaryText
            goto L10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.storagerecovery.content.StorageRecoveryFileListKt.trailingIconTint(com.facebook.aura.storagerecovery.data.HatchStorageRecoveryEntry, boolean, boolean, X.BFM, int):long");
    }

    public static final WorkspaceEntry.EntryType workspaceType(HatchStorageRecoveryEntry hatchStorageRecoveryEntry) {
        return hatchStorageRecoveryEntry.kind == HatchStorageRecoveryEntryKind.DIRECTORY ? WorkspaceEntry.EntryType.DIRECTORY : WorkspaceEntry.EntryType.FILE;
    }

    public static final void StorageRecoveryLoading(BRg bRg, BFM bfm, int i, int i2) {
        bfm.AgG(1079509618);
        int i3 = i2 & 1;
        int iA0d = i3 != 0 ? i | 6 : (i & 6) == 0 ? AnonymousClass004.A0d(bfm, bRg) | i : i;
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 3, 2), bfm, iA0d)) {
            if (i3 != 0) {
                bRg = BRg.A00;
            }
            String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f121086);
            BRg bRgA0T = AnonymousClass001.A0T(bRg);
            boolean zA65 = bfm.A65(strA01);
            Object objAaT = bfm.AaT();
            if (zA65 || objAaT == C78N.A00) {
                objAaT = new StorageRecoveryFileListKt$StorageRecoveryLoading$1$1(strA01);
                bfm.Ai0(objAaT);
            }
            BRg bRgA0Y = AnonymousClass001.A0Y(bRgA0T, objAaT, false);
            InterfaceC1380AiA interfaceC1380AiAA0a = AnonymousClass001.A0a();
            BBI bbi = (BBI) bfm;
            int iA0J = AnonymousClass003.A0J(bbi);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA0Y);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function0);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA0a, akqA04, bRgA01, iA0J);
            AnonymousClass007.A0s(bfm, bbi);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C141273(bRg, i, i2);
        }
    }

    public static final String entryAccessibilityLabel(HatchStorageRecoveryEntry hatchStorageRecoveryEntry, String str, boolean z, boolean z2, BFM bfm, int i) {
        int i2;
        Object[] objArr;
        bfm.AgE(1926499566);
        BidiFormatter bidiFormatter = BidiFormatter.getInstance();
        String strUnicodeWrap = bidiFormatter.unicodeWrap(hatchStorageRecoveryEntry.displayName);
        String strUnicodeWrap2 = bidiFormatter.unicodeWrap(str);
        if (z) {
            bfm.AgE(875066462);
            i2 = R.string._name_removed__res_0x7f121095;
            C7384Etj.A0X(strUnicodeWrap);
            C7384Etj.A0X(strUnicodeWrap2);
            int i3 = R.string._name_removed__res_0x7f121088;
            if (z2) {
                i3 = R.string._name_removed__res_0x7f121096;
            }
            objArr = new Object[]{strUnicodeWrap, strUnicodeWrap2, AbstractC2271BQs.A01(bfm, i3)};
        } else if (hatchStorageRecoveryEntry.kind == HatchStorageRecoveryEntryKind.DIRECTORY) {
            bfm.AgE(875079945);
            i2 = R.string._name_removed__res_0x7f12108b;
            C7384Etj.A0X(strUnicodeWrap);
            objArr = new Object[]{strUnicodeWrap};
        } else {
            bfm.AgE(875083345);
            i2 = R.string._name_removed__res_0x7f12107d;
            C7384Etj.A0X(strUnicodeWrap);
            C7384Etj.A0X(strUnicodeWrap2);
            objArr = new Object[]{strUnicodeWrap, strUnicodeWrap2};
        }
        String strA02 = AbstractC2271BQs.A02(bfm, objArr, i2);
        BBI.A0R(C3cG.A07(bfm), false);
        return strA02;
    }

    public static final String entrySubtitle(HatchStorageRecoveryEntry hatchStorageRecoveryEntry, BFM bfm, int i) {
        BBI bbiA0M;
        String strA01;
        String strA0w;
        bfm.AgE(188548622);
        if (hatchStorageRecoveryEntry.kind == HatchStorageRecoveryEntryKind.DIRECTORY) {
            bfm.AgE(-765100854);
            strA0w = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f121085);
            bbiA0M = C3cG.A07(bfm);
        } else {
            bbiA0M = AnonymousClass002.A0M(bfm, -765029740);
            String strFileExtension = fileExtension(hatchStorageRecoveryEntry);
            if (strFileExtension != null) {
                strA01 = strFileExtension.toUpperCase(Locale.ROOT);
                bfm.AgE(806609259);
            } else {
                bfm.AgE(806610437);
                strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f121083);
            }
            BBI.A0R(bbiA0M, false);
            Long l = hatchStorageRecoveryEntry.estimatedBytes;
            if (l == null) {
                BBI.A0R(bbiA0M, false);
                return strA01;
            }
            strA0w = AnonymousClass006.A0w(bfm, strA01, HatchFileUIUtils.INSTANCE.formatFileSize(l), R.string._name_removed__res_0x7f121084);
        }
        BBI.A0R(bbiA0M, false);
        return strA0w;
    }
}
