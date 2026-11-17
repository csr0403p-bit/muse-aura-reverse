package com.facebook.aura.pause;

import X.AKQ;
import X.AYW;
import X.AbstractC1754Apr;
import X.AbstractC2271BQs;
import X.AbstractC7559F3s;
import X.AcQ;
import X.AeE;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass011;
import X.AxM;
import X.B1V;
import X.BBI;
import X.BBb;
import X.BFM;
import X.BLU;
import X.BOf;
import X.BRg;
import X.BS0;
import X.C00x;
import X.C01N;
import X.C06G;
import X.C07C;
import X.C11U;
import X.C1515AkP;
import X.C1BO;
import X.C1b8;
import X.C2VU;
import X.C3U4;
import X.C3UX;
import X.C3cG;
import X.C7384Etj;
import X.C78N;
import X.EnumC1820Arj;
import X.F60;
import X.G0U;
import X.G0V;
import X.G0W;
import X.InterfaceC1380AiA;
import X.InterfaceC1516AkQ;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.R;
import com.facebook.aura.pause.HatchPauseEnrollmentDestination;
import com.facebook.aura.pause.HatchPauseEnrollmentViewModel;
import com.facebook.aura.pause.HatchPauseViewModel;
import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;
import com.facebook.aura.vds.compose.base.AuraDimensKt;
import com.facebook.aura.vds.compose.bottomsheet.state.AuraSheetState;
import com.facebook.aura.vds.compose.icons.AuraIconKt;
import com.facebook.aura.vds.compose.icons.AuraIconSize;
import com.facebook.aura.vds.compose.text.AuraTextKt;
import com.facebook.aura.vds.compose.theme.AuraTheme;
import com.facebook.common.dextricks.RuntimeInternals;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public abstract class HatchPauseBottomSheetComponentKt {

    /* renamed from: com.facebook.aura.pause.HatchPauseBottomSheetComponentKt$HatchPauseBottomSheetComponent$6, reason: invalid class name */
    public final class AnonymousClass6 extends AbstractC7559F3s implements G0W<C07C, BFM, Integer, Unit> {
        public final /* synthetic */ C3UX $coroutineScope;
        public final /* synthetic */ C1BO<HatchPauseEnrollmentDestination> $currentDestination$delegate;
        public final /* synthetic */ HatchPauseEnrollmentViewModel $enrollmentViewModel;
        public final /* synthetic */ Function0<Unit> $onDismiss;
        public final /* synthetic */ C1BO<String> $passphrase$delegate;
        public final /* synthetic */ AuraSheetState $sheetState;
        public final /* synthetic */ MutableState<Boolean> $showCopiedNotification$delegate;

        /* renamed from: com.facebook.aura.pause.HatchPauseBottomSheetComponentKt$HatchPauseBottomSheetComponent$6$1, reason: invalid class name */
        /* loaded from: classes.dex */
        public final class AnonymousClass1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
            public final /* synthetic */ float $cornerRadius;
            public final /* synthetic */ long $notificationBackground;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(float f, long j) {
                super(2);
                this.$cornerRadius = f;
                this.$notificationBackground = j;
            }

            @Override // X.G0V
            public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
                invoke(bfm, AnonymousClass001.A0F(num));
                return Unit.INSTANCE;
            }

            public final void invoke(BFM bfm, int i) {
                if (AnonymousClass001.A1b(AnonymousClass003.A16(i & 3), bfm, i)) {
                    BS0 bs0 = BRg.A00;
                    BRg bRgA02 = AbstractC1754Apr.A02(bs0);
                    float f = AuraDimensKt.SpacingSmall;
                    BRg bRgA0B = C3U4.A0B(C1b8.A01(C11U.A01(AnonymousClass001.A0R(C3U4.A0C(bRgA02, f, f, f, 0.0f)), this.$cornerRadius), this.$notificationBackground), C06G.A00(bfm), AuraDimensKt.SpacingMedium);
                    InterfaceC1380AiA interfaceC1380AiAA0b = AnonymousClass001.A0b(AcQ.A02, bfm, C2VU.A04);
                    BBI bbi = (BBI) bfm;
                    int iA0J = AnonymousClass003.A0J(bbi);
                    AKQ akqA04 = BBI.A04(bbi);
                    BRg bRgA01 = AxM.A01(bfm, bRgA0B);
                    Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
                    if (bbi.A0V == null) {
                        C00x.A00();
                        throw F60.createAndThrow();
                    }
                    AnonymousClass005.A0n(bfm, bbi, function0);
                    AnonymousClass005.A0p(bfm, interfaceC1380AiAA0b, akqA04, bRgA01, iA0J);
                    AuraIconKt.m2567AuraIconFHprtrg(null, BOf.A00(bfm, R.drawable.ic_checkmark_default, 0), AuraIconSize.X_SMALL, null, AnonymousClass002.A0c(bfm).success, null, bfm, AnonymousClass001.A04(), 33);
                    C01N.A09(bfm, bs0, 8.0f);
                    AuraTextKt.m2639AuraTextUY9GdpU(AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120f2d), null, C06G.A0C(bfm), C06G.A0V(bfm), null, null, null, false, 0, 0, 0, null, null, null, bfm, 0, 0, 16370);
                    BBI.A0R(bbi, true);
                    return;
                }
                bfm.Afo();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass6(AuraSheetState auraSheetState, HatchPauseEnrollmentViewModel hatchPauseEnrollmentViewModel, C1BO<String> c1bo, C3UX c3ux, Function0<Unit> function0, MutableState<Boolean> mutableState, C1BO<? extends HatchPauseEnrollmentDestination> c1bo2) {
            super(3);
            this.$sheetState = auraSheetState;
            this.$enrollmentViewModel = hatchPauseEnrollmentViewModel;
            this.$passphrase$delegate = c1bo;
            this.$coroutineScope = c3ux;
            this.$onDismiss = function0;
            this.$showCopiedNotification$delegate = mutableState;
            this.$currentDestination$delegate = c1bo2;
        }

        public final void invoke(C07C c07c, BFM bfm, int i) {
            if (!AnonymousClass001.A1b(AnonymousClass004.A1G(i), bfm, i)) {
                bfm.Afo();
                return;
            }
            if (MutableState.A0A((MutableState) this.$showCopiedNotification$delegate)) {
                bfm.AgE(-1252231792);
                AuraTheme auraTheme = AuraTheme.INSTANCE;
                AYW.A01(bfm, new AeE() { // from class: com.facebook.aura.pause.HatchPauseBottomSheetComponentKt$HatchPauseBottomSheetComponent$6$topCenterPositionProvider$1
                    @Override // X.AeE
                    /* renamed from: calculatePosition-llwVHH4 */
                    public long mo11calculatePositionllwVHH4(BLU blu, long j, EnumC1820Arj enumC1820Arj, long j2) {
                        return ((((int) (j >> 32)) - ((int) (j2 >> 32))) / 2) << 32;
                    }
                }, null, null, B1V.A00(bfm, new AnonymousClass1(auraTheme.getDimensions(bfm, 6).bottomsheetRoundedCorner, auraTheme.getColors(bfm, 6).modal), 409749136), 3072, 6);
            } else {
                bfm.AgE(-1250360725);
            }
            AnonymousClass002.A19(bfm);
            HatchPauseEnrollmentDestination value = this.$currentDestination$delegate.getValue();
            String strA08 = C1BO.A08(this.$passphrase$delegate);
            AuraSheetState auraSheetState = this.$sheetState;
            MutableState<Boolean> mutableState = this.$showCopiedNotification$delegate;
            Object objAaT = bfm.AaT();
            Object obj = C78N.A00;
            if (objAaT == obj) {
                objAaT = new HatchPauseBottomSheetComponentKt$HatchPauseBottomSheetComponent$6$2$1(mutableState);
                bfm.Ai0(objAaT);
            }
            Function0 function0 = (Function0) objAaT;
            boolean zA67 = bfm.A67(this.$enrollmentViewModel);
            HatchPauseEnrollmentViewModel hatchPauseEnrollmentViewModel = this.$enrollmentViewModel;
            Object objAaT2 = bfm.AaT();
            if (zA67 || objAaT2 == obj) {
                objAaT2 = new HatchPauseBottomSheetComponentKt$HatchPauseBottomSheetComponent$6$3$1(hatchPauseEnrollmentViewModel);
                bfm.Ai0(objAaT2);
            }
            G0U g0u = (G0U) objAaT2;
            boolean zA1R = AnonymousClass001.A1R(bfm, this.$passphrase$delegate, bfm.A67(this.$enrollmentViewModel));
            HatchPauseEnrollmentViewModel hatchPauseEnrollmentViewModel2 = this.$enrollmentViewModel;
            C1BO<String> c1bo = this.$passphrase$delegate;
            Object objAaT3 = bfm.AaT();
            if (zA1R || objAaT3 == obj) {
                objAaT3 = new HatchPauseBottomSheetComponentKt$HatchPauseBottomSheetComponent$6$4$1(hatchPauseEnrollmentViewModel2, c1bo);
                bfm.Ai0(objAaT3);
            }
            Function0 function02 = (Function0) objAaT3;
            boolean zA1R2 = AnonymousClass001.A1R(bfm, this.$passphrase$delegate, bfm.A67(this.$enrollmentViewModel));
            HatchPauseEnrollmentViewModel hatchPauseEnrollmentViewModel3 = this.$enrollmentViewModel;
            C1BO<String> c1bo2 = this.$passphrase$delegate;
            Object objAaT4 = bfm.AaT();
            if (zA1R2 || objAaT4 == obj) {
                objAaT4 = new HatchPauseBottomSheetComponentKt$HatchPauseBottomSheetComponent$6$5$1(hatchPauseEnrollmentViewModel3, c1bo2);
                bfm.Ai0(objAaT4);
            }
            Function0 function03 = (Function0) objAaT4;
            boolean zA1S = AnonymousClass004.A1S(bfm, this.$sheetState, this.$enrollmentViewModel, bfm.A67(this.$coroutineScope));
            C3UX c3ux = this.$coroutineScope;
            HatchPauseEnrollmentViewModel hatchPauseEnrollmentViewModel4 = this.$enrollmentViewModel;
            AuraSheetState auraSheetState2 = this.$sheetState;
            Object objAaT5 = bfm.AaT();
            if (zA1S || objAaT5 == obj) {
                objAaT5 = new HatchPauseBottomSheetComponentKt$HatchPauseBottomSheetComponent$6$6$1(c3ux, hatchPauseEnrollmentViewModel4, auraSheetState2);
                bfm.Ai0(objAaT5);
            }
            HatchPauseBottomSheetComponentKt.HatchPauseBottomSheetContent(auraSheetState, value, strA08, function0, g0u, function02, function03, (Function0) objAaT5, this.$onDismiss, null, bfm, 3072, 512);
        }

        @Override // X.G0W
        public /* bridge */ /* synthetic */ Unit invoke(C07C c07c, BFM bfm, Integer num) {
            invoke(c07c, bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.pause.HatchPauseBottomSheetComponentKt$HatchPauseBottomSheetComponent$9, reason: invalid class name */
    public final class AnonymousClass9 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ HatchPauseEnrollmentViewModel $enrollmentViewModel;
        public final /* synthetic */ Function0<Unit> $onDismiss;
        public final /* synthetic */ HatchPauseViewModel $pauseViewModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass9(Function0<Unit> function0, HatchPauseEnrollmentViewModel hatchPauseEnrollmentViewModel, HatchPauseViewModel hatchPauseViewModel, int i, int i2) {
            super(2);
            this.$onDismiss = function0;
            this.$enrollmentViewModel = hatchPauseEnrollmentViewModel;
            this.$pauseViewModel = hatchPauseViewModel;
            this.$$changed = i;
            this.$$default = i2;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            HatchPauseBottomSheetComponentKt.HatchPauseBottomSheetComponent(this.$onDismiss, this.$enrollmentViewModel, this.$pauseViewModel, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.pause.HatchPauseBottomSheetComponentKt$HatchPauseBottomSheetContent$4, reason: invalid class name */
    public final class AnonymousClass4 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ HatchPauseEnrollmentDestination $currentDestination;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onCancel;
        public final /* synthetic */ Function0<Unit> $onCopyKey;
        public final /* synthetic */ Function0<Unit> $onEnrollWithBiometric;
        public final /* synthetic */ Function0<Unit> $onEnrollWithoutBiometric;
        public final /* synthetic */ G0U<HatchPauseEnrollmentDestination, Unit> $onNavigateTo;
        public final /* synthetic */ Function0<Unit> $onShowLockConfirmDialog;
        public final /* synthetic */ String $recoveryKey;
        public final /* synthetic */ AuraSheetState $sheetState;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass4(AuraSheetState auraSheetState, HatchPauseEnrollmentDestination hatchPauseEnrollmentDestination, String str, Function0<Unit> function0, G0U<? super HatchPauseEnrollmentDestination, Unit> g0u, Function0<Unit> function02, Function0<Unit> function03, Function0<Unit> function04, Function0<Unit> function05, BRg bRg, int i, int i2) {
            super(2);
            this.$sheetState = auraSheetState;
            this.$currentDestination = hatchPauseEnrollmentDestination;
            this.$recoveryKey = str;
            this.$onCopyKey = function0;
            this.$onNavigateTo = g0u;
            this.$onEnrollWithBiometric = function02;
            this.$onEnrollWithoutBiometric = function03;
            this.$onShowLockConfirmDialog = function04;
            this.$onCancel = function05;
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
            HatchPauseBottomSheetComponentKt.HatchPauseBottomSheetContent(this.$sheetState, this.$currentDestination, this.$recoveryKey, this.$onCopyKey, this.$onNavigateTo, this.$onEnrollWithBiometric, this.$onEnrollWithoutBiometric, this.$onShowLockConfirmDialog, this.$onCancel, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x026e  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x02d9  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x02f2  */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0319  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x035a  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0361  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0369  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0223  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0228  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0232  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0255  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x025a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void HatchPauseBottomSheetComponent(kotlin.jvm.functions.Function0<kotlin.Unit> r39, com.facebook.aura.pause.HatchPauseEnrollmentViewModel r40, com.facebook.aura.pause.HatchPauseViewModel r41, X.BFM r42, int r43, int r44) {
        /*
            Method dump skipped, instructions count: 954
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.pause.HatchPauseBottomSheetComponentKt.HatchPauseBottomSheetComponent(kotlin.jvm.functions.Function0, com.facebook.aura.pause.HatchPauseEnrollmentViewModel, com.facebook.aura.pause.HatchPauseViewModel, X.BFM, int, int):void");
    }

    public static final /* synthetic */ HatchPauseViewModel.PauseUiState access$HatchPauseBottomSheetComponent$lambda$0(C1BO c1bo) {
        return (HatchPauseViewModel.PauseUiState) c1bo.getValue();
    }

    public static final /* synthetic */ HatchPauseEnrollmentDestination access$HatchPauseBottomSheetComponent$lambda$1(C1BO c1bo) {
        return (HatchPauseEnrollmentDestination) c1bo.getValue();
    }

    public static final /* synthetic */ HatchPauseEnrollmentViewModel.EnrollmentState access$HatchPauseBottomSheetComponent$lambda$3(C1BO c1bo) {
        return (HatchPauseEnrollmentViewModel.EnrollmentState) c1bo.getValue();
    }

    public static final /* synthetic */ HatchPauseEnrollmentViewModel.DecryptionState access$HatchPauseBottomSheetComponent$lambda$4(C1BO c1bo) {
        return (HatchPauseEnrollmentViewModel.DecryptionState) c1bo.getValue();
    }

    public static final void HatchPauseBottomSheetContent(AuraSheetState auraSheetState, HatchPauseEnrollmentDestination hatchPauseEnrollmentDestination, String str, Function0<Unit> function0, G0U<? super HatchPauseEnrollmentDestination, Unit> g0u, Function0<Unit> function02, Function0<Unit> function03, Function0<Unit> function04, Function0<Unit> function05, BRg bRg, BFM bfm, int i, int i2) {
        int iA0b;
        String str2;
        BRg bRg2 = bRg;
        bfm.AgG(1597405132);
        if ((i & 6) == 0) {
            iA0b = AnonymousClass004.A0d(bfm, auraSheetState) | i;
        } else {
            iA0b = i;
        }
        if ((i & 48) == 0) {
            iA0b |= AnonymousClass002.A06(AnonymousClass004.A1Y(hatchPauseEnrollmentDestination, bfm, i) ? 1 : 0);
        }
        if ((i & 384) == 0) {
            iA0b |= AnonymousClass004.A0f(bfm, str);
        }
        if ((i & 3072) == 0) {
            iA0b |= AnonymousClass004.A0W(bfm, function0);
        }
        if ((i & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA0b |= AnonymousClass004.A0X(bfm, g0u);
        }
        if ((196608 & i) == 0) {
            iA0b |= AnonymousClass004.A0Y(bfm, function02);
        }
        if ((1572864 & i) == 0) {
            iA0b |= AnonymousClass004.A0Z(bfm, function03);
        }
        if ((100663296 & i) == 0) {
            iA0b |= AnonymousClass004.A0b(bfm, function05);
        }
        int i3 = i2 & 512;
        int iA0m = 805306368;
        if (i3 != 0) {
            iA0b |= iA0m;
        } else if ((805306368 & i) == 0) {
            iA0m = AnonymousClass004.A0m(bfm, bRg2);
            iA0b |= iA0m;
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0b & 302589075, 302589074), bfm, iA0b)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            Object objAaT = bfm.AaT();
            Object obj = C78N.A00;
            MutableState mutableState = (MutableState) AnonymousClass005.A0g(bfm, objAaT, obj, false);
            C3UX c3ux = (C3UX) AnonymousClass004.A15(bfm, bfm.AaT(), obj);
            if (C7384Etj.areEqual(hatchPauseEnrollmentDestination, HatchPauseEnrollmentDestination.Overview.INSTANCE)) {
                bfm.AgE(1803027454);
                boolean zA1T = AnonymousClass001.A1T(bfm, c3ux, AnonymousClass002.A1Q(57344 & iA0b, 16384)) | ((iA0b & 14) == 4);
                Object objAaT2 = bfm.AaT();
                if (zA1T || objAaT2 == obj) {
                    objAaT2 = new HatchPauseBottomSheetComponentKt$HatchPauseBottomSheetContent$1$1(g0u, c3ux, mutableState, auraSheetState);
                    bfm.Ai0(objAaT2);
                }
                HatchPauseBottomSheetContentKt.PauseHatchOverviewPage((Function0) objAaT2, function05, bRg2, bfm, (iA0b >> 21) & 1008, 0);
            } else if (C7384Etj.areEqual(hatchPauseEnrollmentDestination, HatchPauseEnrollmentDestination.SaveRecoveryKey.INSTANCE)) {
                bfm.AgE(1803044653);
                if (str == null) {
                    str2 = "";
                } else {
                    str2 = str;
                }
                boolean zA1V = AnonymousClass002.A1V(bfm, c3ux, AnonymousClass005.A1B(iA0b), AnonymousClass002.A1Q(57344 & iA0b, 16384)) | ((iA0b & 14) == 4);
                Object objAaT3 = bfm.AaT();
                if (zA1V || objAaT3 == obj) {
                    objAaT3 = new HatchPauseBottomSheetComponentKt$HatchPauseBottomSheetContent$2$1(function03, g0u, c3ux, mutableState, auraSheetState);
                    bfm.Ai0(objAaT3);
                }
                HatchPauseBottomSheetContentKt.PauseHatchSaveRecoveryKeyPage(str2, function0, (Function0) objAaT3, bRg2, bfm, ((iA0b >> 6) & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX) | ((iA0b >> 18) & 7168), 0);
            } else if (C7384Etj.areEqual(hatchPauseEnrollmentDestination, HatchPauseEnrollmentDestination.SetupRecoveryKeyBiometrics.INSTANCE)) {
                bfm.AgE(1803069083);
                HatchPauseBottomSheetContentKt.PauseHatchSetupRecoveryKeyBiometricsPage(function02, function03, bRg2, bfm, ((iA0b >> 15) & 126) | ((iA0b >> 21) & 896), 0);
            } else if (C7384Etj.areEqual(hatchPauseEnrollmentDestination, HatchPauseEnrollmentDestination.EnrollmentComplete.INSTANCE)) {
                BS0 bs0A09 = C3cG.A09(bfm, 1803076402);
                InterfaceC1380AiA interfaceC1380AiAA0c = AnonymousClass001.A0c(false);
                BBI bbi = (BBI) bfm;
                int iA0J = AnonymousClass003.A0J(bbi);
                AKQ akqA04 = BBI.A04(bbi);
                BRg bRgA01 = AxM.A01(bfm, bs0A09);
                Function0<InterfaceC1516AkQ> function06 = C1515AkP.A00;
                if (bbi.A0V == null) {
                    C00x.A00();
                    throw F60.createAndThrow();
                }
                AnonymousClass005.A0n(bfm, bbi, function06);
                AnonymousClass005.A0p(bfm, interfaceC1380AiAA0c, akqA04, bRgA01, iA0J);
                BBI.A0R(bbi, true);
            } else {
                throw AnonymousClass005.A0k(bfm, 1803025938);
            }
            AnonymousClass001.A1D(bfm);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass4(auraSheetState, hatchPauseEnrollmentDestination, str, function0, g0u, function02, function03, function04, function05, bRg2, i, i2);
        }
    }
}
