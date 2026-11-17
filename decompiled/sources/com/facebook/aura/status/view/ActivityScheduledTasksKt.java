package com.facebook.aura.status.view;

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
import X.AnonymousClass011;
import X.AxM;
import X.BBI;
import X.BBb;
import X.BFM;
import X.BOf;
import X.BRg;
import X.C00x;
import X.C07C;
import X.C0A8;
import X.C0v5;
import X.C10G;
import X.C1515AkP;
import X.C1BO;
import X.C2VU;
import X.C3U4;
import X.C3cG;
import X.C3cH;
import X.C3cJ;
import X.C78N;
import X.C90m;
import X.F60;
import X.G0U;
import X.G0V;
import X.G0W;
import X.InterfaceC1380AiA;
import X.InterfaceC1516AkQ;
import com.facebook.aura.R;
import com.facebook.aura.analytics.hatch.HatchComponent;
import com.facebook.aura.analytics.hatch.HatchInteractionLogger;
import com.facebook.aura.analytics.hatch.HatchMetadataKey;
import com.facebook.aura.analytics.hatch.HatchScreen;
import com.facebook.aura.analytics.hatch.HatchSubsurface;
import com.facebook.aura.analytics.hatch.HatchSurface;
import com.facebook.aura.status.viewmodel.HatchPendingScheduledTask;
import com.facebook.aura.status.viewmodel.HatchTaskUiModel;
import com.facebook.aura.status.viewmodel.HatchUpcomingTaskUiModel;
import com.facebook.aura.status.viewmodel.TasksViewModel;
import com.facebook.aura.ui.adaptive.AuraLayoutSizeKt;
import com.facebook.aura.vds.compose.base.AuraDimensKt;
import com.facebook.aura.vds.compose.icons.AuraIconKt;
import com.facebook.aura.vds.compose.icons.AuraIconSize;
import com.facebook.aura.vds.compose.text.AuraTextKt;
import com.facebook.aura.vds.compose.theme.AuraTheme;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public abstract class ActivityScheduledTasksKt {
    public static final int PREVIEW_TASK_COUNT = 3;

    /* renamed from: com.facebook.aura.status.view.ActivityScheduledTasksKt$ActivityCollapsibleHeader$3, reason: invalid class name */
    public final class AnonymousClass3 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ boolean $expanded;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onToggle;
        public final /* synthetic */ String $text;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(String str, boolean z, Function0<Unit> function0, BRg bRg, int i, int i2) {
            super(2);
            this.$text = str;
            this.$expanded = z;
            this.$onToggle = function0;
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
            ActivityScheduledTasksKt.ActivityCollapsibleHeader(this.$text, this.$expanded, this.$onToggle, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.status.view.ActivityScheduledTasksKt$ActivityScheduledTasks$5, reason: invalid class name */
    public final class AnonymousClass5 extends AbstractC7559F3s implements G0W<C07C, BFM, Integer, Unit> {
        public final /* synthetic */ boolean $isConnected;
        public final /* synthetic */ G0U<String, Unit> $onRemoveUpcomingTask;
        public final /* synthetic */ TasksViewModel $tasksViewModel;
        public final /* synthetic */ AHD<HatchUpcomingTaskUiModel> $upcomingTasks;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass5(AHD<HatchUpcomingTaskUiModel> ahd, G0U<? super String, Unit> g0u, boolean z, TasksViewModel tasksViewModel) {
            super(3);
            this.$upcomingTasks = ahd;
            this.$onRemoveUpcomingTask = g0u;
            this.$isConnected = z;
            this.$tasksViewModel = tasksViewModel;
        }

        public final void invoke(C07C c07c, BFM bfm, int i) {
            if (AnonymousClass001.A1b(AnonymousClass002.A1P(i & 17, 16), bfm, i)) {
                UpcomingScreenKt.m2254UpcomingScreenYlGCr2M(this.$upcomingTasks, this.$onRemoveUpcomingTask, this.$isConnected, 0.0f, 0.0f, C10G.A04(C10G.A02, AuraLayoutSizeKt.auraLayoutHeight(bfm, 0) * 0.8f), this.$tasksViewModel, bfm, 0, 24);
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

    /* renamed from: com.facebook.aura.status.view.ActivityScheduledTasksKt$ActivityScheduledTasks$7, reason: invalid class name */
    public final class AnonymousClass7 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ boolean $isConnected;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ G0U<String, Unit> $onRemoveUpcomingTask;
        public final /* synthetic */ TasksViewModel $tasksViewModel;
        public final /* synthetic */ AHD<HatchUpcomingTaskUiModel> $upcomingTasks;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass7(AHD<HatchUpcomingTaskUiModel> ahd, G0U<? super String, Unit> g0u, boolean z, BRg bRg, TasksViewModel tasksViewModel, int i, int i2) {
            super(2);
            this.$upcomingTasks = ahd;
            this.$onRemoveUpcomingTask = g0u;
            this.$isConnected = z;
            this.$modifier = bRg;
            this.$tasksViewModel = tasksViewModel;
            this.$$changed = i;
            this.$$default = i2;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            ActivityScheduledTasksKt.ActivityScheduledTasks(this.$upcomingTasks, this.$onRemoveUpcomingTask, this.$isConnected, this.$modifier, this.$tasksViewModel, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    public static final void ActivityCollapsibleHeader(String str, boolean z, Function0<Unit> function0, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        AnonymousClass002.A1A(str, 0, function0);
        bfm.AgG(823765619);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, str) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0o(bfm, z);
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
        if (AnonymousClass001.A1b(AnonymousClass004.A1L(iA0d), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            int i4 = R.string._name_removed__res_0x7f12103a;
            if (z) {
                i4 = R.string._name_removed__res_0x7f12103b;
            }
            String strA01 = AbstractC2271BQs.A01(bfm, i4);
            BRg bRgA04 = C0v5.A04(AnonymousClass001.A0R(bRg2), C3cG.A0A(0), null, function0, true);
            boolean zA65 = bfm.A65(strA01);
            Object objAaT = bfm.AaT();
            if (zA65 || objAaT == C78N.A00) {
                objAaT = new ActivityScheduledTasksKt$ActivityCollapsibleHeader$1$1(strA01);
                bfm.Ai0(objAaT);
            }
            BRg bRgA0B = C3U4.A0B(AnonymousClass006.A0O(AnonymousClass001.A0Y(bRgA04, objAaT, false)), AuraDimensKt.SpacingMedium, AuraDimensKt.SpacingXsmallPlusNano);
            InterfaceC1380AiA interfaceC1380AiAA00 = C0A8.A00(AcQ.A01, bfm, C2VU.A04, 48);
            BBI bbi = (BBI) bfm;
            int iA0J = AnonymousClass003.A0J(bbi);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA0B);
            Function0<InterfaceC1516AkQ> function02 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function02);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA00, akqA04, bRgA01, iA0J);
            C90m c90m = C90m.A00;
            AuraTheme auraTheme = AuraTheme.INSTANCE;
            AuraTextKt.m2639AuraTextUY9GdpU(str, AnonymousClass001.A0O(c90m, BRg.A00, true), C3cH.A06(bfm, auraTheme), C3cH.A0D(bfm, auraTheme), null, null, null, false, 0, 0, 0, null, null, null, bfm, iA0d & 14, 0, 16368);
            int i5 = R.drawable.caret_up_small_outline_24;
            if (z) {
                i5 = R.drawable.caret_down_small_outline_24;
            }
            AuraIconKt.m2567AuraIconFHprtrg(null, BOf.A00(bfm, i5, 0), AuraIconSize.X_SMALL, null, C3cH.A07(bfm, auraTheme), null, bfm, AnonymousClass001.A04(), 33);
            BBI.A0R(bbi, true);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass3(str, z, function0, bRg2, i, i2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0055  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void ActivityScheduledTasks(X.AHD<com.facebook.aura.status.viewmodel.HatchUpcomingTaskUiModel> r41, X.G0U<? super java.lang.String, kotlin.Unit> r42, boolean r43, X.BRg r44, com.facebook.aura.status.viewmodel.TasksViewModel r45, X.BFM r46, int r47, int r48) {
        /*
            Method dump skipped, instructions count: 942
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.status.view.ActivityScheduledTasksKt.ActivityScheduledTasks(X.AHD, X.G0U, boolean, X.BRg, com.facebook.aura.status.viewmodel.TasksViewModel, X.BFM, int, int):void");
    }

    public static final void logScheduledTaskSheetDismiss(HatchTaskUiModel hatchTaskUiModel) {
        HatchInteractionLogger.INSTANCE.logDismiss(HatchSurface.STATUS, HatchSubsurface.BOT_SHEET_CONTENT, HatchScreen.BOT_SHEET, HatchComponent.CLOSE_BUTTON, null, C3cJ.A0R(hatchTaskUiModel.category, HatchMetadataKey.SECTION.getValue()));
    }

    public static final /* synthetic */ TasksViewModel.UiState access$ActivityScheduledTasks$lambda$0(C1BO c1bo) {
        return (TasksViewModel.UiState) c1bo.getValue();
    }

    public static final /* synthetic */ HatchPendingScheduledTask.Event access$ActivityScheduledTasks$lambda$11(C1BO c1bo) {
        return (HatchPendingScheduledTask.Event) c1bo.getValue();
    }
}
