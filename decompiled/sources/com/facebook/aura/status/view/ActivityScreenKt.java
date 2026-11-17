package com.facebook.aura.status.view;

import X.AHD;
import X.AKQ;
import X.AVy;
import X.AbstractC07539Wl;
import X.AbstractC2271BQs;
import X.AbstractC7559F3s;
import X.AcQ;
import X.Am0;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.AnonymousClass011;
import X.AxM;
import X.B6A;
import X.BBI;
import X.BBb;
import X.BFM;
import X.BOf;
import X.BPg;
import X.BRg;
import X.BS0;
import X.C00x;
import X.C0dx;
import X.C0v5;
import X.C10G;
import X.C11U;
import X.C1515AkP;
import X.C1BO;
import X.C1b8;
import X.C2VU;
import X.C3U4;
import X.C3cH;
import X.C60Q;
import X.C7384Etj;
import X.C78N;
import X.C90m;
import X.F60;
import X.G0U;
import X.G0V;
import X.InterfaceC1380AiA;
import X.InterfaceC1492Ajz;
import X.InterfaceC1516AkQ;
import com.facebook.aura.R;
import com.facebook.aura.file.utils.HatchFileUIUtils;
import com.facebook.aura.status.repo.ActivityAction;
import com.facebook.aura.status.repo.ActivityDetails;
import com.facebook.aura.status.repo.ActivityGoal;
import com.facebook.aura.status.viewmodel.ActivityViewModel;
import com.facebook.aura.status.viewmodel.HatchPendingActivityItem;
import com.facebook.aura.status.viewmodel.HatchSubAgentUiModel;
import com.facebook.aura.vds.compose.base.AuraDimensKt;
import com.facebook.aura.vds.compose.divider.AuraDividerKt;
import com.facebook.aura.vds.compose.icons.AuraIconKt;
import com.facebook.aura.vds.compose.icons.AuraIconSize;
import com.facebook.aura.vds.compose.spinner.AuraSpinnerKt;
import com.facebook.aura.vds.compose.text.AuraTextKt;
import com.facebook.aura.vds.compose.theme.AuraTheme;
import com.facebook.common.dextricks.RuntimeInternals;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.Locale;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public abstract class ActivityScreenKt {
    public static final float ActivityIconCornerRadius = 12.0f;
    public static final float ActivityIconSize = 44.0f;

    /* renamed from: com.facebook.aura.status.view.ActivityScreenKt$ActivityActionRow$3, reason: invalid class name */
    public final class AnonymousClass3 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onClick;
        public final /* synthetic */ ActivityViewModel.ActionUiModel $uiModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(ActivityViewModel.ActionUiModel actionUiModel, Function0<Unit> function0, BRg bRg, int i, int i2) {
            super(2);
            this.$uiModel = actionUiModel;
            this.$onClick = function0;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            ActivityScreenKt.ActivityActionRow(this.$uiModel, this.$onClick, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.status.view.ActivityScreenKt$ActivityDayHeader$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ long $dateMillis;
        public final /* synthetic */ BRg $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(long j, BRg bRg, int i, int i2) {
            super(2);
            this.$dateMillis = j;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            ActivityScreenKt.ActivityDayHeader(this.$dateMillis, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.status.view.ActivityScreenKt$ActivityDaySection$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ ActivityViewModel.DayGroupUiModel $dayGroup;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ G0U<ActivityAction, Unit> $onActionClick;
        public final /* synthetic */ Function0<Unit> $onToggleCollapsed;
        public final /* synthetic */ AHD<HatchSubAgentUiModel> $subAgents;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass2(ActivityViewModel.DayGroupUiModel dayGroupUiModel, AHD<HatchSubAgentUiModel> ahd, G0U<? super ActivityAction, Unit> g0u, BRg bRg, Function0<Unit> function0, int i, int i2) {
            super(2);
            this.$dayGroup = dayGroupUiModel;
            this.$subAgents = ahd;
            this.$onActionClick = g0u;
            this.$modifier = bRg;
            this.$onToggleCollapsed = function0;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            ActivityScreenKt.ActivityDaySection(this.$dayGroup, this.$subAgents, this.$onActionClick, this.$modifier, this.$onToggleCollapsed, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.status.view.ActivityScreenKt$SubAgentRow$2, reason: invalid class name and case insensitive filesystem */
    public final class C140702 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ HatchSubAgentUiModel $subAgent;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C140702(HatchSubAgentUiModel hatchSubAgentUiModel, BRg bRg, int i, int i2) {
            super(2);
            this.$subAgent = hatchSubAgentUiModel;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            ActivityScreenKt.SubAgentRow(this.$subAgent, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    public static final String formatDateHeader(long j, BFM bfm, int i) {
        String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120049);
        String strA012 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f12004c);
        Calendar calendar = Calendar.getInstance();
        Calendar calendar2 = Calendar.getInstance();
        calendar.setTimeInMillis(j);
        Calendar calendar3 = Calendar.getInstance();
        calendar3.add(6, -1);
        if (calendar.get(1) == calendar2.get(1) && calendar.get(6) == calendar2.get(6)) {
            return strA01;
        }
        if (calendar.get(1) == calendar3.get(1) && calendar.get(6) == calendar3.get(6)) {
            return strA012;
        }
        String str = new SimpleDateFormat("MMM dd", Locale.US).format(new Date(j));
        C7384Etj.A0X(str);
        return str;
    }

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[ActivityAction.ActivityStatus.values().length];
            try {
                AnonymousClass005.A0v(ActivityAction.ActivityStatus.ERROR, iArr, 1);
            } catch (NoSuchFieldError unused) {
            }
            try {
                AnonymousClass005.A0v(ActivityAction.ActivityStatus.PENDING, iArr, 2);
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[ActivityAction.ActivityCategory.values().length];
            try {
                AnonymousClass005.A0v(ActivityAction.ActivityCategory.THINKING, iArr2, 1);
            } catch (NoSuchFieldError unused3) {
            }
            try {
                AnonymousClass005.A0v(ActivityAction.ActivityCategory.TOOL, iArr2, 2);
            } catch (NoSuchFieldError unused4) {
            }
            try {
                AnonymousClass002.A15(ActivityAction.ActivityCategory.MESSAGE, iArr2);
            } catch (NoSuchFieldError unused5) {
            }
            try {
                AnonymousClass002.A16(ActivityAction.ActivityCategory.LIFECYCLE, iArr2);
            } catch (NoSuchFieldError unused6) {
            }
            try {
                AnonymousClass002.A17(ActivityAction.ActivityCategory.HEARTBEAT, iArr2);
            } catch (NoSuchFieldError unused7) {
            }
            try {
                AnonymousClass002.A18(ActivityAction.ActivityCategory.TASK_RUN, iArr2);
            } catch (NoSuchFieldError unused8) {
            }
            try {
                AnonymousClass006.A1G(ActivityAction.ActivityCategory.SUB_AGENT, iArr2);
            } catch (NoSuchFieldError unused9) {
            }
            try {
                AnonymousClass006.A1H(ActivityAction.ActivityCategory.UNKNOWN, iArr2);
            } catch (NoSuchFieldError unused10) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public static final void ActivityActionRow(ActivityViewModel.ActionUiModel actionUiModel, Function0<Unit> function0, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRgA0Q = bRg;
        bfm.AgG(839232773);
        int iA0T = (i & 6) == 0 ? AnonymousClass004.A0T(bfm, actionUiModel) | i : i;
        if ((i & 48) == 0) {
            iA0T |= AnonymousClass004.A0U(bfm, function0);
        }
        int i3 = i2 & 4;
        if (i3 != 0) {
            iA0T |= 384;
        } else if ((i & 384) == 0) {
            iA0T |= AnonymousClass004.A0f(bfm, bRgA0Q);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0T & 147, 146), bfm, iA0T)) {
            if (i3 != 0) {
                bRgA0Q = BRg.A00;
            }
            AuraTheme auraTheme = AuraTheme.INSTANCE;
            C0dx c0dx = (C0dx) bfm.A6v(Am0.A08);
            HatchFileUIUtils hatchFileUIUtils = HatchFileUIUtils.INSTANCE;
            int activityActionIconRes = hatchFileUIUtils.getActivityActionIconRes(actionUiModel.action, bfm, 48);
            long jM863getActivityActionIconColorXeAY9LY = hatchFileUIUtils.m863getActivityActionIconColorXeAY9LY(actionUiModel.action, bfm, 48);
            boolean zA1Z = AnonymousClass002.A1Z(actionUiModel.status, ActivityAction.ActivityStatus.PENDING);
            BRg bRgA00 = AbstractC07539Wl.A00(AnonymousClass001.A0R(bRgA0Q), "hatch-activity-action-row");
            boolean zA1C = AnonymousClass003.A1C(iA0T) | bfm.A67(c0dx);
            Object objAaT = bfm.AaT();
            if (zA1C || objAaT == C78N.A00) {
                objAaT = new ActivityScreenKt$ActivityActionRow$1$1(c0dx, function0);
                bfm.Ai0(objAaT);
            }
            BRg bRgA0B = C3U4.A0B(C0v5.A01(null, null, bRgA00, null, null, (Function0) objAaT, true), AuraDimensKt.SpacingMedium, AuraDimensKt.SpacingXsmallPlusNano);
            InterfaceC1380AiA interfaceC1380AiAA0V = AnonymousClass006.A0V(bfm, C2VU.A05, 10.0f);
            BBI bbi = (BBI) bfm;
            int iA0D = AnonymousClass001.A0D(bbi);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA0B);
            Function0<InterfaceC1516AkQ> function02 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function02);
            G0V g0vA0v = C3cH.A0v(bfm, interfaceC1380AiAA0V);
            G0V<InterfaceC1516AkQ, InterfaceC1492Ajz, Unit> g0v = C1515AkP.A06;
            G0V g0vA19 = AnonymousClass004.A19(bfm, akqA04, g0v, iA0D);
            G0U<InterfaceC1516AkQ, Unit> g0u = C1515AkP.A02;
            G0V g0vA0u = AnonymousClass002.A0u(bfm, bRgA01, g0u);
            C90m c90m = C90m.A00;
            boolean zA1W = C60Q.A1W(HatchFileUIUtils.SELF_COLORED_ICONS, activityActionIconRes);
            BS0 bs0 = BRg.A00;
            float f = ActivityIconSize;
            BRg bRgThen = C10G.A07(bs0, f).then(zA1W ? bs0 : C1b8.A00(C11U.A01(bs0, ActivityIconCornerRadius), 0.12f, jM863getActivityActionIconColorXeAY9LY));
            InterfaceC1380AiA interfaceC1380AiAA0a = AnonymousClass001.A0a();
            int iA0D2 = AnonymousClass001.A0D(bbi);
            AKQ akqA042 = BBI.A04(bbi);
            BRg bRgA012 = AxM.A01(bfm, bRgThen);
            AnonymousClass005.A0n(bfm, bbi, function02);
            BPg.A02(bfm, interfaceC1380AiAA0a, g0vA0v);
            BPg.A02(bfm, akqA042, g0v);
            AnonymousClass003.A15(g0u, g0vA19, bfm, iA0D2);
            BPg.A02(bfm, bRgA012, g0vA0u);
            if (zA1Z) {
                bfm.AgE(1468412361);
                AuraSpinnerKt.m2611AuraSpinnerFNF3uiM(C10G.A07(bs0, 16.0f), null, 0L, bfm, 6, 6);
                BBI.A0R(bbi, false);
            } else if (zA1W) {
                bfm.AgE(1468514196);
                AuraIconKt.m2567AuraIconFHprtrg(C10G.A07(bs0, f), BOf.A00(bfm, activityActionIconRes, 0), AuraIconSize.LARGE, null, B6A.A07, null, bfm, (AVy.$stable << 3) | 28038, 32);
                BBI.A0R(bbi, false);
            } else {
                bfm.AgE(1468777293);
                AuraIconKt.m2567AuraIconFHprtrg(null, BOf.A00(bfm, activityActionIconRes, 0), AuraIconSize.SMALL_MEDIUM, null, jM863getActivityActionIconColorXeAY9LY, null, bfm, AnonymousClass001.A04(), 33);
                BBI.A0R(bbi, false);
            }
            BBI.A0R(bbi, true);
            BRg bRgA0O = AnonymousClass001.A0O(c90m, bs0, true);
            InterfaceC1380AiA interfaceC1380AiAA0X = AnonymousClass003.A0X(bfm, 4.0f, 6);
            int iA0D3 = AnonymousClass001.A0D(bbi);
            AKQ akqA043 = BBI.A04(bbi);
            BRg bRgA013 = AxM.A01(bfm, bRgA0O);
            AnonymousClass005.A0n(bfm, bbi, function02);
            BPg.A02(bfm, interfaceC1380AiAA0X, g0vA0v);
            BPg.A02(bfm, akqA043, g0v);
            AnonymousClass003.A15(g0u, g0vA19, bfm, iA0D3);
            BPg.A02(bfm, bRgA013, g0vA0u);
            String categoryTitle = "";
            if (actionUiModel.title.length() > 0) {
                bfm.AgE(2111513296);
                BBI.A0R(bbi, false);
                categoryTitle = actionUiModel.title;
            } else {
                bfm.AgE(2111560881);
                ActivityAction.ActivityCategory activityCategory = actionUiModel.fallbackCategory;
                if (activityCategory != null) {
                    bfm.AgE(2146327557);
                    categoryTitle = getCategoryTitle(activityCategory, bfm, 0);
                    BBI.A0R(bbi, false);
                } else {
                    bfm.AgE(2111675827);
                    BBI.A0R(bbi, false);
                }
                BBI.A0R(bbi, false);
            }
            AuraTextKt.m2639AuraTextUY9GdpU(categoryTitle, null, C3cH.A06(bfm, auraTheme), auraTheme.getTypography(bfm, 6).bodyEmphasized, null, null, null, false, 0, 2, 2, null, null, null, bfm, 805306368, 6, 14834);
            if (actionUiModel.subtitle.length() > 0) {
                bfm.AgE(2111974886);
                AuraTextKt.m2639AuraTextUY9GdpU(actionUiModel.subtitle, null, C3cH.A07(bfm, auraTheme), C3cH.A0B(bfm, auraTheme), null, null, null, false, 0, 3, 2, null, null, null, bfm, 805306368, 6, 14834);
                BBI.A0R(bbi, false);
            } else {
                bfm.AgE(2112214423);
                BBI.A0R(bbi, false);
            }
            AuraTextKt.m2639AuraTextUY9GdpU(actionUiModel.formattedTime, null, C3cH.A05(bfm, auraTheme), C3cH.A0B(bfm, auraTheme), null, null, null, false, 0, 0, 0, null, null, null, bfm, 0, 0, 16370);
            BBI.A0R(bbi, true);
            int iOrdinal = actionUiModel.status.ordinal();
            if (iOrdinal == 2) {
                bfm.AgE(967916053);
                C1b8.A04(bfm, C11U.A02(bs0, 6.0f), HatchFileUIUtils.StatusColors.ERROR_RED);
            } else if (iOrdinal != 3) {
                bfm.AgE(968438527);
            } else {
                bfm.AgE(968167959);
                if (zA1Z) {
                    bfm.AgE(968415649);
                } else {
                    bfm.AgE(968201346);
                    C1b8.A04(bfm, C11U.A02(bs0, 6.0f), HatchFileUIUtils.StatusColors.PARTIAL_ORANGE);
                }
                BBI.A0R(bbi, false);
            }
            bRgA0Q = AnonymousClass001.A0Q(bbi, bRgA0Q, false, true);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass3(actionUiModel, function0, bRgA0Q, i, i2);
        }
    }

    public static final void ActivityDayHeader(long j, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(-529529097);
        int iA0M = (i & 6) == 0 ? i | AnonymousClass004.A0M(bfm, j) : i;
        int i3 = i2 & 2;
        if (i3 != 0) {
            iA0M |= 48;
        } else if ((i & 48) == 0) {
            iA0M |= AnonymousClass004.A0e(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1H(iA0M), bfm, iA0M)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            String dateHeader = formatDateHeader(j, bfm, iA0M & 14);
            AuraTheme auraTheme = AuraTheme.INSTANCE;
            AuraTextKt.m2639AuraTextUY9GdpU(dateHeader, C3U4.A0B(bRg2, AuraDimensKt.SpacingMedium, AuraDimensKt.SpacingXsmallPlusNano), C3cH.A06(bfm, auraTheme), auraTheme.getTypography(bfm, 6).bodyEmphasized, null, null, null, false, 0, 0, 0, null, null, null, bfm, 0, 0, 16368);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass1(j, bRg2, i, i2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r21v2, types: [com.facebook.aura.vds.compose.divider.AuraDividerStyle] */
    public static final void ActivityDaySection(ActivityViewModel.DayGroupUiModel dayGroupUiModel, AHD<HatchSubAgentUiModel> ahd, G0U<? super ActivityAction, Unit> g0u, BRg bRg, Function0<Unit> function0, BFM bfm, int i, int i2) {
        BRg bRg2;
        Function0<Unit> function02 = function0;
        BRg bRg3 = bRg;
        bfm.AgG(1055949034);
        int iA0T = (i & 6) == 0 ? AnonymousClass004.A0T(bfm, dayGroupUiModel) | i : i;
        if ((i & 48) == 0) {
            iA0T |= AnonymousClass004.A0U(bfm, ahd);
        }
        if ((i & 384) == 0) {
            iA0T |= AnonymousClass004.A0V(bfm, g0u);
        }
        int i3 = i2 & 8;
        if (i3 != 0) {
            iA0T |= 3072;
        } else if ((i & 3072) == 0) {
            iA0T |= AnonymousClass004.A0g(bfm, bRg3);
        }
        int i4 = i2 & 16;
        if (i4 != 0) {
            iA0T |= RuntimeInternals.IOPRIO_BACKGROUND;
        } else if ((i & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA0T |= AnonymousClass004.A0X(bfm, function02);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0T & 9363, 9362), bfm, iA0T)) {
            if (i3 != 0) {
                bRg3 = BRg.A00;
            }
            if (i4 != 0) {
                function02 = null;
            }
            InterfaceC1380AiA interfaceC1380AiAA0U = AnonymousClass002.A0U(bfm);
            BBI bbi = (BBI) bfm;
            int iA0J = AnonymousClass003.A0J(bbi);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRg3);
            Function0<InterfaceC1516AkQ> function03 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function03);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA0U, akqA04, bRgA01, iA0J);
            bfm.AgE(235245249);
            if (function02 == null) {
                bfm.AgE(1808704185);
                bRg2 = null;
                ActivityDayHeader(dayGroupUiModel.headerDateMillis, null, bfm, 0, 2);
                BBI.A0R(bbi, false);
            } else {
                bRg2 = null;
                bfm.AgE(1808706716);
                ActivityScheduledTasksKt.ActivityCollapsibleHeader(formatDateHeader(dayGroupUiModel.headerDateMillis, bfm, 0), !dayGroupUiModel.isCollapsed, function02, null, bfm, (iA0T >> 6) & 896, 8);
                BBI.A0R(bbi, false);
                if (!dayGroupUiModel.isCollapsed) {
                }
                AnonymousClass003.A0q(bbi);
            }
            if (ahd.isEmpty()) {
                bfm.AgE(235771938);
            } else {
                bfm.AgE(235624905);
                Iterator itA0w = AnonymousClass001.A0w(bfm, ahd, 1808716600);
                while (itA0w.hasNext()) {
                    SubAgentRow((HatchSubAgentUiModel) itA0w.next(), bRg2, bfm, 0, 2);
                }
                BBI.A0R(bbi, false);
                if (dayGroupUiModel.actions.isEmpty()) {
                    bfm.AgE(235765986);
                } else {
                    bfm.AgE(235736195);
                    AuraDividerKt.AuraDivider(bRg2, bRg2, false, bfm, 0, 7);
                }
                BBI.A0R(bbi, false);
            }
            BBI.A0R(bbi, false);
            bfm.AgE(1808721761);
            for (ActivityViewModel.ActionUiModel actionUiModel : dayGroupUiModel.actions) {
                boolean zA1T = AnonymousClass001.A1T(bfm, actionUiModel, AnonymousClass004.A1K(iA0T));
                Object objAaT = bfm.AaT();
                if (zA1T || objAaT == C78N.A00) {
                    objAaT = new ActivityScreenKt$ActivityDaySection$1$2$1$1(g0u, actionUiModel);
                    bfm.Ai0(objAaT);
                }
                ActivityActionRow(actionUiModel, (Function0) objAaT, bRg2, bfm, 0, 4);
            }
            BBI.A0R(bbi, false);
            AnonymousClass003.A0q(bbi);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass2(dayGroupUiModel, ahd, g0u, bRg3, function02, i, i2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x01fb  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x023d  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0267  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x02de  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x02e9  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x006e  */
    /* renamed from: ActivityScreen-tw_glAc, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m2210ActivityScreentw_glAc(X.AHD<com.facebook.aura.status.viewmodel.HatchSubAgentUiModel> r37, boolean r38, float r39, float r40, X.BRg r41, X.G0V<? super X.BFM, ? super java.lang.Integer, kotlin.Unit> r42, boolean r43, com.facebook.aura.status.viewmodel.ActivityViewModel r44, X.BFM r45, int r46, int r47) {
        /*
            Method dump skipped, instructions count: 1334
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.status.view.ActivityScreenKt.m2210ActivityScreentw_glAc(X.AHD, boolean, float, float, X.BRg, X.G0V, boolean, com.facebook.aura.status.viewmodel.ActivityViewModel, X.BFM, int, int):void");
    }

    public static final void SubAgentRow(HatchSubAgentUiModel hatchSubAgentUiModel, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(808491454);
        int iA0T = (i & 6) == 0 ? AnonymousClass004.A0T(bfm, hatchSubAgentUiModel) | i : i;
        int i3 = i2 & 2;
        if (i3 != 0) {
            iA0T |= 48;
        } else if ((i & 48) == 0) {
            iA0T |= AnonymousClass004.A0e(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1H(iA0T), bfm, iA0T)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            BRg bRgA0B = C3U4.A0B(AnonymousClass001.A0R(bRg2), AuraDimensKt.SpacingMedium, 12.0f);
            InterfaceC1380AiA interfaceC1380AiAA0b = AnonymousClass001.A0b(AcQ.A00(12.0f), bfm, C2VU.A05);
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
            C90m c90m = C90m.A00;
            BS0 bs0 = BRg.A00;
            AuraSpinnerKt.m2611AuraSpinnerFNF3uiM(C3U4.A04(C10G.A07(bs0, 16.0f), 2.0f), null, 0L, bfm, 6, 6);
            String str = hatchSubAgentUiModel.name;
            AuraTheme auraTheme = AuraTheme.INSTANCE;
            AuraTextKt.m2639AuraTextUY9GdpU(str, c90m.AiP(bs0, 1.0f, true), C3cH.A06(bfm, auraTheme), C3cH.A0E(bfm, auraTheme), null, null, null, false, 0, 2, 2, null, null, null, bfm, 805306368, 6, 14832);
            BBI.A0R(bbi, true);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C140702(hatchSubAgentUiModel, bRg2, i, i2);
        }
    }

    public static final float getActivityIconCornerRadius() {
        return ActivityIconCornerRadius;
    }

    public static final float getActivityIconSize() {
        return ActivityIconSize;
    }

    public static final String getSelectedActionKey(ActivityAction activityAction) {
        ActivityDetails activityDetails;
        ActivityGoal activityGoal;
        String str;
        String strA0l;
        return (activityAction.type != ActivityAction.ActivityType.GOAL || (activityDetails = activityAction.details) == null || (activityGoal = activityDetails.goal) == null || (str = activityGoal.id) == null || (strA0l = AnonymousClass002.A0l(str)) == null || strA0l.length() <= 0) ? activityAction.id : strA0l;
    }

    public static final /* synthetic */ HatchPendingActivityItem.Event access$ActivityScreen_tw_glAc$lambda$13(C1BO c1bo) {
        return (HatchPendingActivityItem.Event) c1bo.getValue();
    }

    public static final String getCategoryTitle(ActivityAction.ActivityCategory activityCategory, BFM bfm, int i) {
        int i2;
        switch (activityCategory.ordinal()) {
            case 0:
                bfm.AgE(-356151858);
                i2 = R.string._name_removed__res_0x7f12002d;
                break;
            case 1:
                bfm.AgE(-356149014);
                i2 = R.string._name_removed__res_0x7f12002e;
                break;
            case 2:
                bfm.AgE(-356146195);
                i2 = R.string._name_removed__res_0x7f12002a;
                break;
            case 3:
                bfm.AgE(-356143217);
                i2 = R.string._name_removed__res_0x7f120029;
                break;
            case 4:
                bfm.AgE(-356140177);
                i2 = R.string._name_removed__res_0x7f120028;
                break;
            case 5:
                bfm.AgE(-356137170);
                i2 = R.string._name_removed__res_0x7f12002c;
                break;
            case 6:
                bfm.AgE(-356134161);
                i2 = R.string._name_removed__res_0x7f12002b;
                break;
            case 7:
                bfm.AgE(-356131187);
                i2 = R.string._name_removed__res_0x7f12002f;
                break;
            default:
                throw AnonymousClass005.A0k(bfm, -356153255);
        }
        return AnonymousClass003.A0e(bfm, i2);
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x00d6  */
    /* renamed from: ActivityContent-_UijJhE, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m2209ActivityContent_UijJhE(X.AHD<com.facebook.aura.status.viewmodel.ActivityViewModel.DayGroupUiModel> r28, boolean r29, java.lang.String r30, boolean r31, boolean r32, X.AHD<com.facebook.aura.status.viewmodel.HatchSubAgentUiModel> r33, kotlin.jvm.functions.Function0<kotlin.Unit> r34, kotlin.jvm.functions.Function0<kotlin.Unit> r35, X.G0U<? super com.facebook.aura.status.repo.ActivityAction, kotlin.Unit> r36, float r37, float r38, X.BRg r39, X.G0V<? super X.BFM, ? super java.lang.Integer, kotlin.Unit> r40, X.G0U<? super java.lang.String, kotlin.Unit> r41, X.BFM r42, int r43, int r44, int r45) {
        /*
            Method dump skipped, instructions count: 404
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.status.view.ActivityScreenKt.m2209ActivityContent_UijJhE(X.AHD, boolean, java.lang.String, boolean, boolean, X.AHD, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, X.G0U, float, float, X.BRg, X.G0V, X.G0U, X.BFM, int, int, int):void");
    }
}
