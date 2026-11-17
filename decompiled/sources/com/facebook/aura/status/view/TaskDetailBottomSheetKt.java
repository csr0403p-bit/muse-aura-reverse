package com.facebook.aura.status.view;

import X.AFz;
import X.AHD;
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
import X.BBI;
import X.BBb;
import X.BFM;
import X.BOf;
import X.BPg;
import X.BRg;
import X.BS0;
import X.C00x;
import X.C01N;
import X.C07C;
import X.C0A8;
import X.C0xs;
import X.C10G;
import X.C11S;
import X.C11U;
import X.C1515AkP;
import X.C1822Arm;
import X.C1AC;
import X.C1D8;
import X.C1DP;
import X.C1YY;
import X.C1b8;
import X.C2VU;
import X.C3U4;
import X.C3cG;
import X.C3cH;
import X.C3cI;
import X.C3cJ;
import X.C7384Etj;
import X.C78N;
import X.C90l;
import X.C90m;
import X.F60;
import X.G0U;
import X.G0V;
import X.G0W;
import X.InterfaceC1380AiA;
import X.InterfaceC1492Ajz;
import X.InterfaceC1516AkQ;
import android.text.BidiFormatter;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.R;
import com.facebook.aura.analytics.hatch.HatchComponent;
import com.facebook.aura.analytics.hatch.HatchInteractionLogger;
import com.facebook.aura.analytics.hatch.HatchMetadataKey;
import com.facebook.aura.analytics.hatch.HatchScreen;
import com.facebook.aura.analytics.hatch.HatchSubsurface;
import com.facebook.aura.analytics.hatch.HatchSurface;
import com.facebook.aura.file.utils.HatchFileUIUtils;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;
import com.facebook.aura.status.viewmodel.HatchTaskRunTone;
import com.facebook.aura.status.viewmodel.HatchTaskRunUiModel;
import com.facebook.aura.status.viewmodel.HatchTaskUiModel;
import com.facebook.aura.status.viewmodel.TaskCategory;
import com.facebook.aura.ui.TaskDeleteConfirmationDialogKt;
import com.facebook.aura.vds.compose.base.AuraDimensKt;
import com.facebook.aura.vds.compose.button.AuraButtonKt;
import com.facebook.aura.vds.compose.button.AuraButtonSize;
import com.facebook.aura.vds.compose.button.AuraButtonStyles;
import com.facebook.aura.vds.compose.button.AuraLabelButtonStyle;
import com.facebook.aura.vds.compose.icons.AuraIconButtonBackground;
import com.facebook.aura.vds.compose.icons.AuraIconButtonKt;
import com.facebook.aura.vds.compose.icons.AuraIconButtonSizeV2;
import com.facebook.aura.vds.compose.icons.AuraIconButtonStyle;
import com.facebook.aura.vds.compose.spinner.AuraSpinnerKt;
import com.facebook.aura.vds.compose.text.AuraTextKt;
import com.facebook.aura.vds.compose.theme.AuraAdaptiveColorsKt;
import com.facebook.aura.vds.compose.theme.AuraColors;
import com.facebook.aura.vds.compose.theme.AuraTheme;
import com.facebook.common.dextricks.RuntimeInternals;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public abstract class TaskDetailBottomSheetKt {
    public static final int COLLAPSED_RUN_COUNT = 3;

    /* renamed from: com.facebook.aura.status.view.TaskDetailBottomSheetKt$TaskDetailActions$5, reason: invalid class name */
    public final class AnonymousClass5 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ TaskCategory $category;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onDeleteTask;
        public final /* synthetic */ Function0<Unit> $onPermissionsClick;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass5(TaskCategory taskCategory, Function0<Unit> function0, Function0<Unit> function02, BRg bRg, int i, int i2) {
            super(2);
            this.$category = taskCategory;
            this.$onDeleteTask = function0;
            this.$onPermissionsClick = function02;
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
            TaskDetailBottomSheetKt.TaskDetailActions(this.$category, this.$onDeleteTask, this.$onPermissionsClick, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.status.view.TaskDetailBottomSheetKt$TaskDetailBottomSheet$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ AuraNavigator $navigator;
        public final /* synthetic */ Function0<Unit> $onDeleteTask;
        public final /* synthetic */ Function0<Unit> $onDismiss;
        public final /* synthetic */ HatchTaskUiModel $task;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(HatchTaskUiModel hatchTaskUiModel, Function0<Unit> function0, Function0<Unit> function02, AuraNavigator auraNavigator) {
            super(2);
            this.$task = hatchTaskUiModel;
            this.$onDeleteTask = function0;
            this.$onDismiss = function02;
            this.$navigator = auraNavigator;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            if (AnonymousClass001.A1b(AnonymousClass004.A1E(i), bfm, i)) {
                bfm.Ag8(295038598, this.$task.id);
                HatchTaskUiModel hatchTaskUiModel = this.$task;
                TaskCategory taskCategory = hatchTaskUiModel.category;
                Function0<Unit> function0 = this.$onDeleteTask;
                boolean zA1T = AnonymousClass001.A1T(bfm, this.$navigator, AnonymousClass001.A1R(bfm, this.$onDismiss, bfm.A67(hatchTaskUiModel)));
                HatchTaskUiModel hatchTaskUiModel2 = this.$task;
                Function0<Unit> function02 = this.$onDismiss;
                AuraNavigator auraNavigator = this.$navigator;
                Object objAaT = bfm.AaT();
                if (zA1T || objAaT == C78N.A00) {
                    objAaT = new TaskDetailBottomSheetKt$TaskDetailBottomSheet$1$1$1(hatchTaskUiModel2, function02, auraNavigator);
                    bfm.Ai0(objAaT);
                }
                TaskDetailBottomSheetKt.TaskDetailActions(taskCategory, function0, (Function0) objAaT, C3U4.A0C(C3U4.A0B(BRg.A00, C3cG.A00(bfm, AuraTheme.INSTANCE), 0.0f), 0.0f, 0.0f, 0.0f, AuraDimensKt.SpacingMedium), bfm, 0, 0);
                AnonymousClass001.A1D(bfm);
                return;
            }
            bfm.Afo();
        }
    }

    /* renamed from: com.facebook.aura.status.view.TaskDetailBottomSheetKt$TaskDetailBottomSheet$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0W<C07C, BFM, Integer, Unit> {
        public final /* synthetic */ BRg $impression;
        public final /* synthetic */ boolean $isLoadingRuns;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onDismiss;
        public final /* synthetic */ AHD<HatchTaskRunUiModel> $runs;
        public final /* synthetic */ HatchTaskUiModel $task;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(HatchTaskUiModel hatchTaskUiModel, AHD<HatchTaskRunUiModel> ahd, boolean z, Function0<Unit> function0, BRg bRg, BRg bRg2) {
            super(3);
            this.$task = hatchTaskUiModel;
            this.$runs = ahd;
            this.$isLoadingRuns = z;
            this.$onDismiss = function0;
            this.$modifier = bRg;
            this.$impression = bRg2;
        }

        public final void invoke(C07C c07c, BFM bfm, int i) {
            if (AnonymousClass001.A1b(AnonymousClass004.A1G(i), bfm, i)) {
                TaskDetailBottomSheetKt.TaskDetailContent(this.$task, this.$runs, this.$isLoadingRuns, this.$onDismiss, this.$modifier.then(this.$impression), bfm, 0, 0);
            } else {
                bfm.Afo();
            }
        }

        @Override // X.G0W
        public /* bridge */ /* synthetic */ Unit invoke(C07C c07c, BFM bfm, Integer num) {
            invoke(c07c, bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.status.view.TaskDetailBottomSheetKt$TaskDetailBottomSheet$3, reason: invalid class name */
    public final class AnonymousClass3 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ boolean $isLoadingRuns;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onDeleteTask;
        public final /* synthetic */ Function0<Unit> $onDismiss;
        public final /* synthetic */ Function0<Unit> $onDismissRequest;
        public final /* synthetic */ AHD<HatchTaskRunUiModel> $runs;
        public final /* synthetic */ HatchTaskUiModel $task;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(HatchTaskUiModel hatchTaskUiModel, AHD<HatchTaskRunUiModel> ahd, boolean z, Function0<Unit> function0, Function0<Unit> function02, BRg bRg, Function0<Unit> function03, int i, int i2) {
            super(2);
            this.$task = hatchTaskUiModel;
            this.$runs = ahd;
            this.$isLoadingRuns = z;
            this.$onDismiss = function0;
            this.$onDeleteTask = function02;
            this.$modifier = bRg;
            this.$onDismissRequest = function03;
            this.$$changed = i;
            this.$$default = i2;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            TaskDetailBottomSheetKt.TaskDetailBottomSheet(this.$task, this.$runs, this.$isLoadingRuns, this.$onDismiss, this.$onDeleteTask, this.$modifier, this.$onDismissRequest, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.status.view.TaskDetailBottomSheetKt$TaskDetailContent$2, reason: invalid class name and case insensitive filesystem */
    public final class C140842 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ boolean $isLoadingRuns;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onDismiss;
        public final /* synthetic */ AHD<HatchTaskRunUiModel> $runs;
        public final /* synthetic */ HatchTaskUiModel $task;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C140842(HatchTaskUiModel hatchTaskUiModel, AHD<HatchTaskRunUiModel> ahd, boolean z, Function0<Unit> function0, BRg bRg, int i, int i2) {
            super(2);
            this.$task = hatchTaskUiModel;
            this.$runs = ahd;
            this.$isLoadingRuns = z;
            this.$onDismiss = function0;
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
            TaskDetailBottomSheetKt.TaskDetailContent(this.$task, this.$runs, this.$isLoadingRuns, this.$onDismiss, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.status.view.TaskDetailBottomSheetKt$TaskDetailHeader$2, reason: invalid class name and case insensitive filesystem */
    public final class C140852 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onDismiss;
        public final /* synthetic */ HatchTaskUiModel $task;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C140852(HatchTaskUiModel hatchTaskUiModel, Function0<Unit> function0, BRg bRg, int i, int i2) {
            super(2);
            this.$task = hatchTaskUiModel;
            this.$onDismiss = function0;
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
            TaskDetailBottomSheetKt.TaskDetailHeader(this.$task, this.$onDismiss, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.status.view.TaskDetailBottomSheetKt$TaskRunRow$3, reason: invalid class name and case insensitive filesystem */
    public final class C140863 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ HatchTaskRunUiModel $run;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C140863(HatchTaskRunUiModel hatchTaskRunUiModel, BRg bRg, int i, int i2) {
            super(2);
            this.$run = hatchTaskRunUiModel;
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
            TaskDetailBottomSheetKt.TaskRunRow(this.$run, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.status.view.TaskDetailBottomSheetKt$TaskRunsList$2, reason: invalid class name and case insensitive filesystem */
    public final class C140872 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ AHD<HatchTaskRunUiModel> $runs;
        public final /* synthetic */ String $section;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C140872(AHD<HatchTaskRunUiModel> ahd, String str, BRg bRg, int i, int i2) {
            super(2);
            this.$runs = ahd;
            this.$section = str;
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
            TaskDetailBottomSheetKt.TaskRunsList(this.$runs, this.$section, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.status.view.TaskDetailBottomSheetKt$TaskRunsSection$2, reason: invalid class name and case insensitive filesystem */
    public final class C140882 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ boolean $isLoading;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ AHD<HatchTaskRunUiModel> $runs;
        public final /* synthetic */ String $section;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C140882(AHD<HatchTaskRunUiModel> ahd, boolean z, String str, BRg bRg, int i, int i2) {
            super(2);
            this.$runs = ahd;
            this.$isLoading = z;
            this.$section = str;
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
            TaskDetailBottomSheetKt.TaskRunsSection(this.$runs, this.$isLoading, this.$section, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[TaskCategory.values().length];
            try {
                AnonymousClass005.A0v(TaskCategory.INTERVAL, iArr, 1);
            } catch (NoSuchFieldError unused) {
            }
            try {
                AnonymousClass005.A0v(TaskCategory.DAILY, iArr, 2);
            } catch (NoSuchFieldError unused2) {
            }
            try {
                AnonymousClass005.A0v(TaskCategory.WEEKLY, iArr, 3);
            } catch (NoSuchFieldError unused3) {
            }
            try {
                AnonymousClass005.A0v(TaskCategory.MONTHLY, iArr, 4);
            } catch (NoSuchFieldError unused4) {
            }
            try {
                AnonymousClass002.A17(TaskCategory.YEARLY, iArr);
            } catch (NoSuchFieldError unused5) {
            }
            try {
                AnonymousClass002.A18(TaskCategory.REMINDERS, iArr);
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[HatchTaskRunTone.values().length];
            try {
                AnonymousClass005.A0v(HatchTaskRunTone.SUCCESS, iArr2, 1);
            } catch (NoSuchFieldError unused7) {
            }
            try {
                AnonymousClass005.A0v(HatchTaskRunTone.WARNING, iArr2, 2);
            } catch (NoSuchFieldError unused8) {
            }
            try {
                AnonymousClass005.A0v(HatchTaskRunTone.ERROR, iArr2, 3);
            } catch (NoSuchFieldError unused9) {
            }
            try {
                AnonymousClass005.A0v(HatchTaskRunTone.NEUTRAL, iArr2, 4);
            } catch (NoSuchFieldError unused10) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public static final void TaskDetailActions(TaskCategory taskCategory, Function0<Unit> function0, Function0<Unit> function02, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(1802698480);
        int iA08 = (i & 6) == 0 ? AnonymousClass005.A08(bfm, taskCategory) | i : i;
        if ((i & 48) == 0) {
            iA08 |= AnonymousClass004.A0U(bfm, function0);
        }
        if ((i & 384) == 0) {
            iA08 |= AnonymousClass004.A0V(bfm, function02);
        }
        int i3 = i2 & 8;
        if (i3 != 0) {
            iA08 |= 3072;
        } else if ((i & 3072) == 0) {
            iA08 |= AnonymousClass004.A0g(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA08 & 1171, 1170), bfm, iA08)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            Object[] objArr = new Object[0];
            Object objAaT = bfm.AaT();
            Object obj = C78N.A00;
            if (objAaT == obj) {
                objAaT = TaskDetailBottomSheetKt$TaskDetailActions$showDeleteConfirmation$2$1.INSTANCE;
                bfm.Ai0(objAaT);
            }
            MutableState mutableState = (MutableState) AFz.A03(bfm, (Function0) objAaT, objArr);
            BRg bRgA0R = AnonymousClass001.A0R(bRg2);
            InterfaceC1380AiA interfaceC1380AiAA00 = C0A8.A00(AcQ.A00(AuraDimensKt.SpacingMedium), bfm, C2VU.A04, 48);
            BBI bbi = (BBI) bfm;
            int iA02 = C3cG.A02(bbi.A06);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA0R);
            Function0<InterfaceC1516AkQ> function03 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function03);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA00, akqA04, bRgA01, iA02);
            C90m c90m = C90m.A00;
            String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f12105a);
            AuraButtonStyles auraButtonStyles = AuraButtonStyles.INSTANCE;
            AuraLabelButtonStyle auraLabelButtonStyleSecondary = auraButtonStyles.secondary(null, bfm, 48, 1);
            AuraButtonSize auraButtonSize = AuraButtonSize.LARGE;
            BS0 bs0 = BRg.A00;
            AuraButtonKt.m2408AuraButtonnL3aKkM(null, strA01, null, c90m.AiP(bs0, 1.0f, true), auraLabelButtonStyleSecondary, auraButtonSize, null, false, false, false, false, false, null, null, function02, null, null, null, null, null, null, null, null, false, 0, false, 0, bfm, 196608, (iA08 << 6) & 57344, 0, 134201285);
            String strA012 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f12054f);
            AuraLabelButtonStyle auraLabelButtonStyleDestructive = auraButtonStyles.destructive(null, bfm, 48, 1);
            BRg bRgAiP = c90m.AiP(bs0, 1.0f, true);
            int i4 = iA08 & 14;
            boolean zA65 = bfm.A65(mutableState) | (i4 == 4);
            Object objAaT2 = bfm.AaT();
            if (zA65 || objAaT2 == obj) {
                objAaT2 = new TaskDetailBottomSheetKt$TaskDetailActions$1$1$1(taskCategory, mutableState);
                bfm.Ai0(objAaT2);
            }
            AuraButtonKt.m2408AuraButtonnL3aKkM(null, strA012, null, bRgAiP, auraLabelButtonStyleDestructive, auraButtonSize, null, false, false, false, false, false, null, null, (Function0) objAaT2, null, null, null, null, null, null, null, null, false, 0, false, 0, bfm, 196608, 0, 0, 134201285);
            BBI.A0R(bbi, true);
            if (MutableState.A0A(mutableState)) {
                bfm.AgE(-79294074);
                boolean zA652 = bfm.A65(mutableState) | (i4 == 4) | AnonymousClass003.A1C(iA08);
                Object objAaT3 = bfm.AaT();
                if (zA652 || objAaT3 == obj) {
                    objAaT3 = new TaskDetailBottomSheetKt$TaskDetailActions$2$1(taskCategory, function0, mutableState);
                    bfm.Ai0(objAaT3);
                }
                Function0 function04 = (Function0) objAaT3;
                boolean zA653 = bfm.A65(mutableState) | AnonymousClass002.A1Q(i4, 4);
                Object objAaT4 = bfm.AaT();
                if (zA653 || objAaT4 == obj) {
                    objAaT4 = new TaskDetailBottomSheetKt$TaskDetailActions$3$1(taskCategory, mutableState);
                    bfm.Ai0(objAaT4);
                }
                Function0 function05 = (Function0) objAaT4;
                boolean zA654 = bfm.A65(mutableState) | AnonymousClass002.A1Q(i4, 4);
                Object objAaT5 = bfm.AaT();
                if (zA654 || objAaT5 == obj) {
                    objAaT5 = new TaskDetailBottomSheetKt$TaskDetailActions$4$1(taskCategory, mutableState);
                    bfm.Ai0(objAaT5);
                }
                TaskDeleteConfirmationDialogKt.TaskDeleteConfirmationDialog(function04, function05, null, (Function0) objAaT5, bfm, 0, 4);
            } else {
                bfm.AgE(-78575246);
            }
            BBI.A0R(bbi, false);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass5(taskCategory, function0, function02, bRg2, i, i2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x006f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void TaskDetailBottomSheet(com.facebook.aura.status.viewmodel.HatchTaskUiModel r26, X.AHD<com.facebook.aura.status.viewmodel.HatchTaskRunUiModel> r27, boolean r28, kotlin.jvm.functions.Function0<kotlin.Unit> r29, kotlin.jvm.functions.Function0<kotlin.Unit> r30, X.BRg r31, kotlin.jvm.functions.Function0<kotlin.Unit> r32, X.BFM r33, int r34, int r35) {
        /*
            Method dump skipped, instructions count: 403
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.status.view.TaskDetailBottomSheetKt.TaskDetailBottomSheet(com.facebook.aura.status.viewmodel.HatchTaskUiModel, X.AHD, boolean, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, X.BRg, kotlin.jvm.functions.Function0, X.BFM, int, int):void");
    }

    public static final void TaskDetailContent(HatchTaskUiModel hatchTaskUiModel, AHD<HatchTaskRunUiModel> ahd, boolean z, Function0<Unit> function0, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(2047907493);
        int iA0T = (i & 6) == 0 ? AnonymousClass004.A0T(bfm, hatchTaskUiModel) | i : i;
        if ((i & 48) == 0) {
            iA0T |= AnonymousClass004.A0U(bfm, ahd);
        }
        if ((i & 384) == 0) {
            iA0T |= AnonymousClass004.A0p(bfm, z);
        }
        if ((i & 3072) == 0) {
            iA0T |= AnonymousClass004.A0W(bfm, function0);
        }
        int i3 = i2 & 16;
        if (i3 != 0) {
            iA0T |= RuntimeInternals.IOPRIO_BACKGROUND;
        } else if ((i & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA0T |= AnonymousClass004.A0h(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0T & 9363, 9362), bfm, iA0T)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            boolean z2 = hatchTaskUiModel.enabled;
            BS0 bs0 = BRg.A00;
            AuraTheme auraTheme = AuraTheme.INSTANCE;
            BRg bRgA0B = C3U4.A0B(bs0, C3cG.A00(bfm, auraTheme), 0.0f);
            BRg bRgA0R = AnonymousClass001.A0R(bRg2);
            float f = AuraDimensKt.SpacingMedium;
            BRg bRgA0C = C3U4.A0C(bRgA0R, 0.0f, 0.0f, 0.0f, f);
            InterfaceC1380AiA interfaceC1380AiAA0U = AnonymousClass002.A0U(bfm);
            BBI bbi = (BBI) bfm;
            int iA0J = AnonymousClass003.A0J(bbi);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA0C);
            Function0<InterfaceC1516AkQ> function02 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function02);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA0U, akqA04, bRgA01, iA0J);
            C90l c90l = C90l.A00;
            int i4 = iA0T & 14;
            TaskDetailHeader(hatchTaskUiModel, function0, bRgA0B, bfm, ((iA0T >> 6) & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX) | i4, 0);
            float f2 = AuraDimensKt.SpacingSmall;
            C01N.A08(bfm, bs0, f2);
            C0xs.A00(0.0f, auraTheme.getColors(bfm, 6).border, null, bfm, 0, 3);
            C01N.A08(bfm, bs0, f2);
            AuraTextKt.m2639AuraTextUY9GdpU(hatchTaskUiModel.title, bRgA0B, C3cH.A06(bfm, auraTheme), auraTheme.getTypography(bfm, 6).title3Emphasized, null, null, null, false, 0, 3, 2, null, null, null, bfm, 805306368, 6, 14832);
            String scheduleText = formatScheduleText(hatchTaskUiModel, bfm, i4);
            if (scheduleText != null) {
                bfm.AgE(412019294);
                C01N.A08(bfm, bs0, 2.0f);
                C1822Arm c1822ArmA0E = C3cH.A0E(bfm, auraTheme);
                long jA05 = C3cH.A05(bfm, auraTheme);
                BRg bRgA00 = bs0;
                if (!z2) {
                    bRgA00 = C11S.A00(bs0, 0.5f);
                }
                AuraTextKt.m2639AuraTextUY9GdpU(scheduleText, bRgA0B.then(bRgA00), jA05, c1822ArmA0E, null, null, null, false, 0, 2, 2, null, null, null, bfm, 805306368, 6, 14832);
            } else {
                bfm.AgE(412377747);
            }
            BBI.A0R(bbi, false);
            C01N.A08(bfm, bs0, f);
            bfm.Ag8(-956526673, hatchTaskUiModel.id);
            TaskRunsSection(ahd, z, AnonymousClass006.A0x(hatchTaskUiModel.category), c90l.AiP(bRgA0B, 1.0f, false), bfm, (iA0T >> 3) & 126, 0);
            AnonymousClass003.A0q(bbi);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C140842(hatchTaskUiModel, ahd, z, function0, bRg2, i, i2);
        }
    }

    public static final void TaskDetailHeader(HatchTaskUiModel hatchTaskUiModel, Function0<Unit> function0, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(437563641);
        int iA0T = (i & 6) == 0 ? AnonymousClass004.A0T(bfm, hatchTaskUiModel) | i : i;
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
            AuraNavigator auraNavigatorA0b = AnonymousClass002.A0b(bfm);
            String strA0x = AnonymousClass006.A0x(hatchTaskUiModel.category);
            String strUnicodeWrap = BidiFormatter.getInstance().unicodeWrap(hatchTaskUiModel.title);
            C7384Etj.A0U(strUnicodeWrap);
            String strA0t = AnonymousClass001.A0t(bfm, strUnicodeWrap, R.string._name_removed__res_0x7f121060);
            BRg bRgA0R = AnonymousClass001.A0R(bRg2);
            InterfaceC1380AiA interfaceC1380AiAA0W = AnonymousClass003.A0W(bfm);
            BBI bbi = (BBI) bfm;
            int iA02 = C3cG.A02(bbi.A06);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA0R);
            Function0<InterfaceC1516AkQ> function02 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function02);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA0W, akqA04, bRgA01, iA02);
            C90m c90m = C90m.A00;
            String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f121061);
            AuraTheme auraTheme = AuraTheme.INSTANCE;
            C1822Arm c1822Arm = auraTheme.getTypography(bfm, 6).footnoteEmphasized;
            long jA05 = C3cH.A05(bfm, auraTheme);
            BS0 bs0 = BRg.A00;
            AuraTextKt.m2639AuraTextUY9GdpU(strA01, C3U4.A0B(C1b8.A00(C11U.A01(bs0, 4.0f), 0.1f, C3cH.A05(bfm, auraTheme)), 8.0f, 4.0f), jA05, c1822Arm, null, null, null, false, 0, 0, 0, null, null, null, bfm, 0, 0, 16368);
            C01N.A07(bfm, AnonymousClass001.A0O(c90m, bs0, true));
            AVy aVyA00 = BOf.A00(bfm, R.drawable.pencil_wght400_outline_24, 0);
            AuraIconButtonSizeV2 auraIconButtonSizeV2 = AuraIconButtonSizeV2.XM_LARGE;
            AuraIconButtonStyle auraIconButtonStyle = AuraIconButtonStyle.PRIMARY;
            AuraIconButtonBackground auraIconButtonBackground = AuraIconButtonBackground.NO_BACKGROUND;
            String strA012 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120625);
            BRg bRgA06 = C10G.A06(C10G.A02(C2VU.A09, C10G.A07(bs0, 24.0f), true), 48.0f);
            boolean zA1O = AnonymousClass003.A1O(bfm, auraNavigatorA0b, strA0t, bfm.A65(strA0x) | ((iA0T & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX) == 32));
            Object objAaT = bfm.AaT();
            if (zA1O || objAaT == C78N.A00) {
                objAaT = new TaskDetailBottomSheetKt$TaskDetailHeader$1$1$1(strA0x, function0, auraNavigatorA0b, strA0t);
                bfm.Ai0(objAaT);
            }
            AuraIconButtonKt.m2552AuraIconButtonV2imgtlEU(bRgA06, aVyA00, auraIconButtonSizeV2, auraIconButtonStyle, auraIconButtonBackground, null, strA012, (Function0) objAaT, null, false, null, null, null, null, bfm, (AVy.$stable << 3) | 28038, 0, 16160);
            BBI.A0R(bbi, true);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C140852(hatchTaskUiModel, function0, bRg2, i, i2);
        }
    }

    public static final void TaskRunRow(HatchTaskRunUiModel hatchTaskRunUiModel, BRg bRg, BFM bfm, int i, int i2) {
        BBI bbiA0M;
        long j;
        BRg bRg2 = bRg;
        bfm.AgG(1856652751);
        int iA0T = (i & 6) == 0 ? i | AnonymousClass004.A0T(bfm, hatchTaskRunUiModel) : i;
        int i3 = i2 & 2;
        if (i3 != 0) {
            iA0T |= 48;
        } else if ((i & 48) == 0) {
            iA0T |= AnonymousClass004.A0e(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0T & 19, 18), bfm, iA0T)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            int iOrdinal = hatchTaskRunUiModel.tone.ordinal();
            if (iOrdinal == 0) {
                bbiA0M = AnonymousClass002.A0M(bfm, 1831872060);
                j = HatchFileUIUtils.StatusColors.SUCCESS_GREEN;
            } else if (iOrdinal == 1) {
                bbiA0M = AnonymousClass002.A0M(bfm, 1831874621);
                j = HatchFileUIUtils.StatusColors.PARTIAL_ORANGE;
            } else if (iOrdinal == 2) {
                bbiA0M = AnonymousClass002.A0M(bfm, 1831877144);
                j = HatchFileUIUtils.StatusColors.ERROR_RED;
            } else {
                if (iOrdinal != 3) {
                    throw AnonymousClass005.A0k(bfm, 1831869685);
                }
                j = C3cI.A0K(bfm, 1831879163).tertiaryText;
                bbiA0M = C3cG.A07(bfm);
            }
            BRg bRgA0B = C3U4.A0B(AnonymousClass001.A0U(AnonymousClass001.A0R(bRg2), 48.0f), AuraDimensKt.SpacingMedium, 14.0f);
            Object objAaT = bfm.AaT();
            if (objAaT == C78N.A00) {
                objAaT = TaskDetailBottomSheetKt$TaskRunRow$1$1.INSTANCE;
                bfm.Ai0(objAaT);
            }
            BRg bRgA0Y = AnonymousClass001.A0Y(bRgA0B, objAaT, true);
            C1AC c1ac = C2VU.A04;
            InterfaceC1380AiA interfaceC1380AiAA00 = C0A8.A00(AcQ.A01, bfm, c1ac, 48);
            int iA02 = C3cG.A02(bbiA0M.A06);
            AKQ akqA04 = BBI.A04(bbiA0M);
            BRg bRgA01 = AxM.A01(bfm, bRgA0Y);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbiA0M.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbiA0M, function0);
            G0V g0vA0v = C3cH.A0v(bfm, interfaceC1380AiAA00);
            G0V<InterfaceC1516AkQ, InterfaceC1492Ajz, Unit> g0v = C1515AkP.A06;
            G0V g0vA19 = AnonymousClass004.A19(bfm, akqA04, g0v, iA02);
            G0U<InterfaceC1516AkQ, Unit> g0u = C1515AkP.A02;
            BPg.A03(bfm, g0u);
            G0V<InterfaceC1516AkQ, BRg, Unit> g0v2 = C1515AkP.A05;
            BPg.A02(bfm, bRgA01, g0v2);
            C90m c90m = C90m.A00;
            BS0 bs0 = BRg.A00;
            BRg bRgAiP = c90m.AiP(bs0, 1.0f, true);
            InterfaceC1380AiA interfaceC1380AiAA0X = AnonymousClass003.A0X(bfm, 2.0f, 6);
            int iA0D = AnonymousClass001.A0D(bbiA0M);
            AKQ akqA042 = BBI.A04(bbiA0M);
            BRg bRgA012 = AxM.A01(bfm, bRgAiP);
            AnonymousClass005.A0n(bfm, bbiA0M, function0);
            BPg.A02(bfm, interfaceC1380AiAA0X, g0vA0v);
            BPg.A02(bfm, akqA042, g0v);
            AnonymousClass003.A15(g0u, g0vA19, bfm, iA0D);
            BPg.A02(bfm, bRgA012, g0v2);
            String str = hatchTaskRunUiModel.scheduledDateText;
            AuraTheme auraTheme = AuraTheme.INSTANCE;
            AuraTextKt.m2639AuraTextUY9GdpU(str, null, C3cH.A06(bfm, auraTheme), C3cH.A0B(bfm, auraTheme), null, null, null, false, 0, 0, 0, null, null, null, bfm, 0, 0, 16370);
            AuraTextKt.m2639AuraTextUY9GdpU(hatchTaskRunUiModel.scheduledTimeText, null, C3cH.A07(bfm, auraTheme), C3cH.A0E(bfm, auraTheme), null, null, null, false, 0, 0, 0, null, null, null, bfm, 0, 0, 16370);
            BBI.A0R(bbiA0M, true);
            C01N.A07(bfm, C10G.A07(bs0, 12.0f));
            BRg bRgAiP2 = c90m.AiP(bs0, 1.0f, true);
            InterfaceC1380AiA interfaceC1380AiAA002 = C0A8.A00(AcQ.A00, bfm, c1ac, 54);
            int iA0D2 = AnonymousClass001.A0D(bbiA0M);
            AKQ akqA043 = BBI.A04(bbiA0M);
            BRg bRgA013 = AxM.A01(bfm, bRgAiP2);
            AnonymousClass005.A0n(bfm, bbiA0M, function0);
            BPg.A02(bfm, interfaceC1380AiAA002, g0vA0v);
            BPg.A02(bfm, akqA043, g0v);
            AnonymousClass003.A15(g0u, g0vA19, bfm, iA0D2);
            BPg.A02(bfm, bRgA013, g0v2);
            AuraTextKt.m2639AuraTextUY9GdpU(hatchTaskRunUiModel.statusLabel, c90m.AiP(bs0, 1.0f, false), C3cH.A07(bfm, auraTheme), C3cH.A0B(bfm, auraTheme), null, null, null, false, 0, 0, 0, null, null, null, bfm, 0, 0, 16368);
            C01N.A07(bfm, C10G.A07(bs0, 8.0f));
            C1b8.A04(bfm, C11U.A03(C10G.A07(bs0, 6.0f), C1D8.A02(50)), j);
            BBI.A0R(bbiA0M, true);
            BBI.A0R(bbiA0M, true);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C140863(hatchTaskRunUiModel, bRg2, i, i2);
        }
    }

    public static final void TaskRunsList(AHD<HatchTaskRunUiModel> ahd, String str, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(-865230222);
        int iA0T = (i & 6) == 0 ? AnonymousClass004.A0T(bfm, ahd) | i : i;
        if ((i & 48) == 0) {
            iA0T |= AnonymousClass004.A0e(bfm, str);
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
            Object[] objArr = new Object[0];
            Object objAaT = bfm.AaT();
            Object obj = C78N.A00;
            if (objAaT == obj) {
                objAaT = TaskDetailBottomSheetKt$TaskRunsList$expanded$2$1.INSTANCE;
                bfm.Ai0(objAaT);
            }
            MutableState mutableStateA0N = AnonymousClass002.A0N(bfm, objAaT, objArr);
            BRg bRgA0A = C10G.A0A(AnonymousClass001.A0R(bRg2), Float.NaN, 320.0f);
            C1DP c1dp = new C1DP(0.0f, 4.0f, 0.0f, 4.0f);
            boolean zA1J = AnonymousClass003.A1J(bfm, mutableStateA0N, ahd) | ((iA0T & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX) == 32);
            Object objAaT2 = bfm.AaT();
            if (zA1J || objAaT2 == obj) {
                objAaT2 = new TaskDetailBottomSheetKt$TaskRunsList$1$1(ahd, mutableStateA0N, str);
                bfm.Ai0(objAaT2);
            }
            C1YY.A01(null, null, null, c1dp, null, bfm, null, bRgA0A, (G0U) objAaT2, 384, 506, false, false);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C140872(ahd, str, bRg2, i, i2);
        }
    }

    public static final void TaskRunsSection(AHD<HatchTaskRunUiModel> ahd, boolean z, String str, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(732864773);
        int iA0T = (i & 6) == 0 ? AnonymousClass004.A0T(bfm, ahd) | i : i;
        if ((i & 48) == 0) {
            iA0T |= AnonymousClass004.A0o(bfm, z);
        }
        if ((i & 384) == 0) {
            iA0T |= AnonymousClass004.A0f(bfm, str);
        }
        int i3 = i2 & 8;
        if (i3 != 0) {
            iA0T |= 3072;
        } else if ((i & 3072) == 0) {
            iA0T |= AnonymousClass004.A0g(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0T & 1171, 1170), bfm, iA0T)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            BRg bRgA0R = AnonymousClass001.A0R(bRg2);
            AuraTheme auraTheme = AuraTheme.INSTANCE;
            BRg bRgA01 = C1b8.A01(C11U.A01(bRgA0R, auraTheme.getDimensions(bfm, 6).sectionCornerRadius), AuraAdaptiveColorsKt.adaptiveFill(auraTheme.getColors(bfm, 6), bfm, AuraColors.$stable));
            Object objAaT = bfm.AaT();
            if (objAaT == C78N.A00) {
                objAaT = TaskDetailBottomSheetKt$TaskRunsSection$sectionModifier$1$1.INSTANCE;
                bfm.Ai0(objAaT);
            }
            BRg bRgA0Y = AnonymousClass001.A0Y(bRgA01, objAaT, false);
            if (z) {
                bfm.AgE(1456123543);
                BRg bRgA09 = C3U4.A09(bRgA0Y, AuraDimensKt.SpacingMedium);
                InterfaceC1380AiA interfaceC1380AiAA0a = AnonymousClass001.A0a();
                BBI bbi = (BBI) bfm;
                int iA0J = AnonymousClass003.A0J(bbi);
                AKQ akqA04 = BBI.A04(bbi);
                BRg bRgA012 = AxM.A01(bfm, bRgA09);
                Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
                if (bbi.A0V == null) {
                    C00x.A00();
                    throw F60.createAndThrow();
                }
                AnonymousClass005.A0n(bfm, bbi, function0);
                AnonymousClass005.A0p(bfm, interfaceC1380AiAA0a, akqA04, bRgA012, iA0J);
                AuraSpinnerKt.m2611AuraSpinnerFNF3uiM(null, null, 0L, bfm, 0, 7);
                BBI.A0R(bbi, true);
            } else if (ahd.isEmpty()) {
                bfm.AgE(1456321788);
                AuraTextKt.m2639AuraTextUY9GdpU(AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f121069), C3U4.A09(bRgA0Y, AuraDimensKt.SpacingMedium), C3cH.A07(bfm, auraTheme), C3cH.A0B(bfm, auraTheme), null, null, null, false, 0, 0, 0, null, null, null, bfm, 0, 0, 16368);
            } else {
                bfm.AgE(-91560563);
                TaskRunsList(ahd, str, bRgA0Y, bfm, ((iA0T >> 3) & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX) | (iA0T & 14), 0);
            }
            AnonymousClass001.A1D(bfm);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C140882(ahd, z, str, bRg2, i, i2);
        }
    }

    public static final void logTaskDeleteCancelClick(TaskCategory taskCategory) {
        HatchInteractionLogger.INSTANCE.logClick(HatchSurface.STATUS, HatchSubsurface.BOT_SHEET_CONTENT, HatchScreen.BOT_SHEET, HatchComponent.DELETE_CANCEL_BUTTON, null, C3cJ.A0R(taskCategory, HatchMetadataKey.SECTION.getValue()), null);
    }

    public static final void logTaskDeleteCancelDismiss(TaskCategory taskCategory) {
        HatchInteractionLogger.INSTANCE.logDismiss(HatchSurface.STATUS, HatchSubsurface.BOT_SHEET_CONTENT, HatchScreen.BOT_SHEET, HatchComponent.DELETE_CANCEL_BUTTON, null, C3cJ.A0R(taskCategory, HatchMetadataKey.SECTION.getValue()));
    }

    public static final void logTaskPermissionsClick(String str) {
        HatchInteractionLogger.INSTANCE.logClick(HatchSurface.STATUS, HatchSubsurface.BOT_SHEET_CONTENT, HatchScreen.BOT_SHEET, HatchComponent.PERMISSION_ROW, null, AnonymousClass007.A0d(HatchMetadataKey.PERMISSION_KEY.getValue(), "scheduled_tasks", C3cG.A0r(HatchMetadataKey.SECTION.getValue(), str)), null);
    }

    public static final void logTaskRunsSeeMoreClick(String str) {
        HatchInteractionLogger.INSTANCE.logClick(HatchSurface.STATUS, HatchSubsurface.BOT_SHEET_CONTENT, HatchScreen.BOT_SHEET, HatchComponent.SEE_MORE_BUTTON, null, AnonymousClass007.A0c(HatchMetadataKey.SECTION, str), null);
    }

    public static final String formatScheduleText(HatchTaskUiModel hatchTaskUiModel, BFM bfm, int i) {
        int i2;
        String str;
        Object[] objArr;
        bfm.AgE(-1043130681);
        String strA02 = hatchTaskUiModel.timeText;
        if (strA02 == null) {
            strA02 = hatchTaskUiModel.subtitle;
        } else {
            switch (hatchTaskUiModel.category.ordinal()) {
                case 0:
                    bfm.AgE(-1817086247);
                    str = hatchTaskUiModel.subtitle;
                    if (str != null) {
                        i2 = R.string._name_removed__res_0x7f12106e;
                        objArr = new Object[]{str, strA02};
                        strA02 = AbstractC2271BQs.A02(bfm, objArr, i2);
                    }
                    AnonymousClass001.A1D(bfm);
                    break;
                case 1:
                    AnonymousClass003.A0l(bfm, -1817561818);
                    String str2 = hatchTaskUiModel.subtitle;
                    if (str2 != null) {
                        strA02 = str2;
                        break;
                    }
                    break;
                case 2:
                    bfm.AgE(-1721197436);
                    i2 = R.string._name_removed__res_0x7f12106b;
                    objArr = new Object[]{strA02};
                    strA02 = AbstractC2271BQs.A02(bfm, objArr, i2);
                    AnonymousClass001.A1D(bfm);
                    break;
                case 3:
                    bfm.AgE(-1817422659);
                    str = hatchTaskUiModel.subtitle;
                    if (str != null) {
                        i2 = R.string._name_removed__res_0x7f12106f;
                        objArr = new Object[]{str, strA02};
                        strA02 = AbstractC2271BQs.A02(bfm, objArr, i2);
                    }
                    AnonymousClass001.A1D(bfm);
                    break;
                case 4:
                    bfm.AgE(-1721189626);
                    i2 = R.string._name_removed__res_0x7f12106d;
                    objArr = new Object[]{strA02};
                    strA02 = AbstractC2271BQs.A02(bfm, objArr, i2);
                    AnonymousClass001.A1D(bfm);
                    break;
                case 5:
                    bfm.AgE(-1721186715);
                    i2 = R.string._name_removed__res_0x7f121070;
                    objArr = new Object[]{strA02};
                    strA02 = AbstractC2271BQs.A02(bfm, objArr, i2);
                    AnonymousClass001.A1D(bfm);
                    break;
                default:
                    throw AnonymousClass005.A0k(bfm, -1721200035);
            }
        }
        AnonymousClass002.A19(bfm);
        return strA02;
    }
}
