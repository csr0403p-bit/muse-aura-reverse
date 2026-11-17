package com.facebook.aura.status.view;

import X.AGI;
import X.AHD;
import X.AKQ;
import X.AVy;
import X.AbstractC0878AGe;
import X.AbstractC2271BQs;
import X.AbstractC7559F3s;
import X.AcQ;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
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
import X.C0A8;
import X.C0v5;
import X.C10G;
import X.C1515AkP;
import X.C1BO;
import X.C2VU;
import X.C3U4;
import X.C3cG;
import X.C3cH;
import X.C3cI;
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
import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;
import com.facebook.aura.status.viewmodel.HatchPendingScheduledTask;
import com.facebook.aura.status.viewmodel.HatchTaskUiModel;
import com.facebook.aura.status.viewmodel.HatchUpcomingTaskUiModel;
import com.facebook.aura.status.viewmodel.TaskCategory;
import com.facebook.aura.vds.compose.base.AuraDimensKt;
import com.facebook.aura.vds.compose.icons.AuraIconKt;
import com.facebook.aura.vds.compose.icons.AuraIconSize;
import com.facebook.aura.vds.compose.text.AuraTextKt;
import com.facebook.aura.vds.compose.theme.AuraColors;
import com.facebook.aura.vds.compose.theme.AuraTheme;
import com.facebook.aura.vds.compose.theme.AuraTypography;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public abstract class UpcomingScreenKt {
    public static final List<TaskCategory> UPCOMING_CATEGORY_ORDER = Arrays.asList(TaskCategory.REMINDERS, TaskCategory.DAILY, TaskCategory.INTERVAL, TaskCategory.WEEKLY, TaskCategory.MONTHLY, TaskCategory.YEARLY);

    /* renamed from: com.facebook.aura.status.view.UpcomingScreenKt$CategoryTaskRow$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ TaskCategory $category;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onClick;
        public final /* synthetic */ HatchTaskUiModel $task;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(HatchTaskUiModel hatchTaskUiModel, TaskCategory taskCategory, Function0<Unit> function0, BRg bRg, int i, int i2) {
            super(2);
            this.$task = hatchTaskUiModel;
            this.$category = taskCategory;
            this.$onClick = function0;
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
            UpcomingScreenKt.CategoryTaskRow(this.$task, this.$category, this.$onClick, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.status.view.UpcomingScreenKt$SectionHeader$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ String $text;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(String str, BRg bRg, int i, int i2) {
            super(2);
            this.$text = str;
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
            UpcomingScreenKt.SectionHeader(this.$text, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.status.view.UpcomingScreenKt$TaskCategoryCard$2, reason: invalid class name and case insensitive filesystem */
    public final class C140892 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ TaskCategory $category;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ G0U<HatchTaskUiModel, Unit> $onTaskClick;
        public final /* synthetic */ AHD<HatchTaskUiModel> $tasks;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C140892(TaskCategory taskCategory, AHD<HatchTaskUiModel> ahd, G0U<? super HatchTaskUiModel, Unit> g0u, BRg bRg, int i, int i2) {
            super(2);
            this.$category = taskCategory;
            this.$tasks = ahd;
            this.$onTaskClick = g0u;
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
            UpcomingScreenKt.TaskCategoryCard(this.$category, this.$tasks, this.$onTaskClick, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.status.view.UpcomingScreenKt$UpcomingCard$2, reason: invalid class name and case insensitive filesystem */
    public final class C140902 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ G0U<String, Unit> $onRemoveTask;
        public final /* synthetic */ AHD<HatchUpcomingTaskUiModel> $tasks;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C140902(AHD<HatchUpcomingTaskUiModel> ahd, G0U<? super String, Unit> g0u, BRg bRg, int i, int i2) {
            super(2);
            this.$tasks = ahd;
            this.$onRemoveTask = g0u;
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
            UpcomingScreenKt.UpcomingCard(this.$tasks, this.$onRemoveTask, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.status.view.UpcomingScreenKt$UpcomingTaskRow$2, reason: invalid class name and case insensitive filesystem */
    public final class C140912 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onRemove;
        public final /* synthetic */ HatchUpcomingTaskUiModel $task;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C140912(HatchUpcomingTaskUiModel hatchUpcomingTaskUiModel, Function0<Unit> function0, BRg bRg, int i, int i2) {
            super(2);
            this.$task = hatchUpcomingTaskUiModel;
            this.$onRemove = function0;
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
            UpcomingScreenKt.UpcomingTaskRow(this.$task, this.$onRemove, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[TaskCategory.values().length];
            try {
                AnonymousClass002.A13(TaskCategory.REMINDERS, iArr);
            } catch (NoSuchFieldError unused) {
            }
            try {
                AnonymousClass002.A14(TaskCategory.INTERVAL, iArr);
            } catch (NoSuchFieldError unused2) {
            }
            try {
                AnonymousClass002.A15(TaskCategory.DAILY, iArr);
            } catch (NoSuchFieldError unused3) {
            }
            try {
                AnonymousClass002.A16(TaskCategory.WEEKLY, iArr);
            } catch (NoSuchFieldError unused4) {
            }
            try {
                AnonymousClass002.A17(TaskCategory.MONTHLY, iArr);
            } catch (NoSuchFieldError unused5) {
            }
            try {
                AnonymousClass002.A18(TaskCategory.YEARLY, iArr);
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final void CategoryTaskRow(HatchTaskUiModel hatchTaskUiModel, TaskCategory taskCategory, Function0<Unit> function0, BRg bRg, BFM bfm, int i, int i2) {
        int i3;
        BRg bRg2 = bRg;
        boolean zA1a = AnonymousClass002.A1a(hatchTaskUiModel, taskCategory);
        C7384Etj.A0Y(function0, 2);
        bfm.AgG(1094471766);
        int iA0T = (i & 6) == 0 ? AnonymousClass004.A0T(bfm, hatchTaskUiModel) | i : i;
        if ((i & 48) == 0) {
            iA0T |= AnonymousClass005.A09(bfm, taskCategory);
        }
        if ((i & 384) == 0) {
            iA0T |= AnonymousClass004.A0V(bfm, function0);
        }
        int i4 = i2 & 8;
        if (i4 != 0) {
            iA0T |= 3072;
        } else if ((i & 3072) == 0) {
            iA0T |= AnonymousClass004.A0g(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1L(iA0T), bfm, iA0T)) {
            if (i4 != 0) {
                bRg2 = BRg.A00;
            }
            AuraTheme auraTheme = AuraTheme.INSTANCE;
            AuraColors colors = auraTheme.getColors(bfm, 6);
            AuraTypography typography = auraTheme.getTypography(bfm, 6);
            switch (taskCategory.ordinal()) {
                case 0:
                    i3 = R.drawable.hatch_file_types_reminder_40;
                    break;
                case 1:
                    i3 = R.drawable.hatch_file_types_clock_40;
                    break;
                case 2:
                case 3:
                case 4:
                case 5:
                    i3 = R.drawable.hatch_file_types_calendar_40;
                    break;
                default:
                    throw C3cG.A0q();
            }
            BRg bRgA0B = C3U4.A0B(C0v5.A04(AnonymousClass001.A0R(bRg2), C3cG.A0A(0), null, function0, zA1a), AuraDimensKt.SpacingMedium, AuraDimensKt.SpacingXsmallPlusNano);
            InterfaceC1380AiA interfaceC1380AiAA00 = C0A8.A00(AcQ.A00(10.0f), bfm, C2VU.A05, 54);
            BBI bbi = (BBI) bfm;
            int iA02 = C3cG.A02(bbi.A06);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA0B);
            Function0<InterfaceC1516AkQ> function02 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function02);
            G0V g0vA0v = C3cH.A0v(bfm, interfaceC1380AiAA00);
            G0V<InterfaceC1516AkQ, InterfaceC1492Ajz, Unit> g0v = C1515AkP.A06;
            G0V g0vA19 = AnonymousClass004.A19(bfm, akqA04, g0v, iA02);
            G0U<InterfaceC1516AkQ, Unit> g0u = C1515AkP.A02;
            G0V g0vA0u = AnonymousClass002.A0u(bfm, bRgA01, g0u);
            C90m c90m = C90m.A00;
            BS0 bs0 = BRg.A00;
            BRg bRgA07 = C10G.A07(bs0, 44.0f);
            InterfaceC1380AiA interfaceC1380AiAA0a = AnonymousClass001.A0a();
            int iA0D = AnonymousClass001.A0D(bbi);
            AKQ akqA042 = BBI.A04(bbi);
            BRg bRgA012 = AxM.A01(bfm, bRgA07);
            AnonymousClass005.A0n(bfm, bbi, function02);
            BPg.A02(bfm, interfaceC1380AiAA0a, g0vA0v);
            BPg.A02(bfm, akqA042, g0v);
            AnonymousClass003.A15(g0u, g0vA19, bfm, iA0D);
            BPg.A02(bfm, bRgA012, g0vA0u);
            AVy aVyA00 = BOf.A00(bfm, i3, 0);
            long j = B6A.A07;
            AuraIconSize auraIconSize = AuraIconSize.LARGE;
            BRg bRgA072 = C10G.A07(bs0, 44.0f);
            int i5 = AVy.$stable;
            AuraIconKt.m2567AuraIconFHprtrg(bRgA072, aVyA00, auraIconSize, null, j, null, bfm, (i5 << 3) | 28038, 32);
            BBI.A0R(bbi, zA1a);
            BRg bRgA0O = AnonymousClass001.A0O(c90m, bs0, zA1a);
            InterfaceC1380AiA interfaceC1380AiAA0X = AnonymousClass003.A0X(bfm, 4.0f, 6);
            int iA0D2 = AnonymousClass001.A0D(bbi);
            AKQ akqA043 = BBI.A04(bbi);
            BRg bRgA013 = AxM.A01(bfm, bRgA0O);
            AnonymousClass005.A0n(bfm, bbi, function02);
            BPg.A02(bfm, interfaceC1380AiAA0X, g0vA0v);
            BPg.A02(bfm, akqA043, g0v);
            AnonymousClass003.A15(g0u, g0vA19, bfm, iA0D2);
            BPg.A02(bfm, bRgA013, g0vA0u);
            AuraTextKt.m2639AuraTextUY9GdpU(hatchTaskUiModel.title, null, colors.primaryText, typography.bodyEmphasized, null, null, null, false, 0, 2, 2, null, null, null, bfm, 805306368, 6, 14834);
            String str = hatchTaskUiModel.subtitle;
            if (str == null) {
                bfm.AgE(-763515474);
                BBI.A0R(bbi, false);
            } else {
                bfm.AgE(-763515473);
                AuraTextKt.m2639AuraTextUY9GdpU(str, null, colors.secondaryText, typography.subheadlineRegular, null, null, null, false, 0, 3, 2, null, null, null, bfm, 805306368, 6, 14834);
                BBI.A0R(bbi, false);
            }
            String str2 = hatchTaskUiModel.timeText;
            if (str2 == null) {
                bfm.AgE(-763247665);
                BBI.A0R(bbi, false);
            } else {
                bfm.AgE(-763247664);
                AuraTextKt.m2639AuraTextUY9GdpU(str2, null, colors.tertiaryText, typography.subheadlineRegular, null, null, null, false, 0, zA1a ? 1 : 0, 2, null, null, null, bfm, 805306368, 6, 14834);
                BBI.A0R(bbi, false);
            }
            BBI.A0R(bbi, zA1a);
            AuraIconKt.m2567AuraIconFHprtrg(null, BOf.A00(bfm, R.drawable.meta_brand_design_system_icons_vector_caret_right_outline_24, 0), AuraIconSize.TINY, null, colors.tertiaryText, null, bfm, (i5 << 3) | 3456, 33);
            BBI.A0R(bbi, zA1a);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass2(hatchTaskUiModel, taskCategory, function0, bRg2, i, i2);
        }
    }

    public static final void SectionHeader(String str, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(1173966125);
        int iA0d = (i & 6) == 0 ? i | AnonymousClass004.A0d(bfm, str) : i;
        int i3 = i2 & 2;
        if (i3 != 0) {
            iA0d |= 48;
        } else if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0e(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1H(iA0d), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            AuraTheme auraTheme = AuraTheme.INSTANCE;
            AuraTextKt.m2639AuraTextUY9GdpU(str, C3U4.A0B(bRg2, AuraDimensKt.SpacingMedium, AuraDimensKt.SpacingXsmallPlusNano), C3cH.A06(bfm, auraTheme), C3cH.A0D(bfm, auraTheme), null, null, null, false, 0, 0, 0, null, null, null, bfm, iA0d & 14, 0, 16368);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass1(str, bRg2, i, i2);
        }
    }

    public static final void TaskCategoryCard(TaskCategory taskCategory, AHD<HatchTaskUiModel> ahd, G0U<? super HatchTaskUiModel, Unit> g0u, BRg bRg, BFM bfm, int i, int i2) {
        int i3;
        BRg bRg2 = bRg;
        bfm.AgG(194333911);
        int iA08 = (i & 6) == 0 ? AnonymousClass005.A08(bfm, taskCategory) | i : i;
        if ((i & 48) == 0) {
            iA08 |= AnonymousClass004.A0U(bfm, ahd);
        }
        if ((i & 384) == 0) {
            iA08 |= AnonymousClass004.A0V(bfm, g0u);
        }
        int i4 = i2 & 8;
        if (i4 != 0) {
            iA08 |= 3072;
        } else if ((i & 3072) == 0) {
            iA08 |= AnonymousClass004.A0g(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA08 & 1171, 1170), bfm, iA08)) {
            if (i4 != 0) {
                bRg2 = BRg.A00;
            }
            switch (taskCategory.ordinal()) {
                case 0:
                    bfm.AgE(2071302948);
                    i3 = R.string._name_removed__res_0x7f121038;
                    break;
                case 1:
                    bfm.AgE(2071305475);
                    i3 = R.string._name_removed__res_0x7f121030;
                    break;
                case 2:
                    bfm.AgE(2071307872);
                    i3 = R.string._name_removed__res_0x7f12101e;
                    break;
                case 3:
                    bfm.AgE(2071310209);
                    i3 = R.string._name_removed__res_0x7f121074;
                    break;
                case 4:
                    bfm.AgE(2071312610);
                    i3 = R.string._name_removed__res_0x7f121032;
                    break;
                case 5:
                    bfm.AgE(2071315009);
                    i3 = R.string._name_removed__res_0x7f121076;
                    break;
                default:
                    throw AnonymousClass005.A0k(bfm, 2071301718);
            }
            String strA01 = AbstractC2271BQs.A01(bfm, i3);
            BBI bbiA07 = C3cG.A07(bfm);
            InterfaceC1380AiA interfaceC1380AiAA0U = AnonymousClass002.A0U(bfm);
            int iA0J = AnonymousClass003.A0J(bbiA07);
            AKQ akqA04 = BBI.A04(bbiA07);
            BRg bRgA01 = AxM.A01(bfm, bRg2);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbiA07.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbiA07, function0);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA0U, akqA04, bRgA01, iA0J);
            SectionHeader(strA01, null, bfm, 0, 2);
            Iterator itA0w = AnonymousClass001.A0w(bfm, ahd, -1254322531);
            while (itA0w.hasNext()) {
                HatchTaskUiModel hatchTaskUiModel = (HatchTaskUiModel) itA0w.next();
                boolean zA1V = AnonymousClass002.A1V(bfm, hatchTaskUiModel, AnonymousClass004.A1F(iA08), AnonymousClass004.A1K(iA08));
                Object objAaT = bfm.AaT();
                if (zA1V || objAaT == C78N.A00) {
                    objAaT = new UpcomingScreenKt$TaskCategoryCard$1$1$1$1(taskCategory, g0u, hatchTaskUiModel);
                    bfm.Ai0(objAaT);
                }
                CategoryTaskRow(hatchTaskUiModel, taskCategory, (Function0) objAaT, null, bfm, (iA08 << 3) & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX, 8);
            }
            AnonymousClass003.A0q(bbiA07);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C140892(taskCategory, ahd, g0u, bRg2, i, i2);
        }
    }

    public static final void UpcomingTaskRow(HatchUpcomingTaskUiModel hatchUpcomingTaskUiModel, Function0<Unit> function0, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(853390981);
        int iA0T = (i & 6) == 0 ? AnonymousClass004.A0T(bfm, hatchUpcomingTaskUiModel) | i : i;
        if ((i & 48) == 0) {
            iA0T |= AnonymousClass004.A0U(bfm, function0);
        }
        int i3 = i2 & 4;
        if (i3 != 0) {
            iA0T |= 384;
        } else if ((i & 384) == 0) {
            iA0T |= AnonymousClass004.A0f(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1J(iA0T), bfm, iA0T)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            AuraTheme auraTheme = AuraTheme.INSTANCE;
            AuraColors colors = auraTheme.getColors(bfm, 6);
            AuraTypography typography = auraTheme.getTypography(bfm, 6);
            BRg bRgA0B = C3U4.A0B(C0v5.A04(AnonymousClass001.A0R(bRg2), C3cG.A0A(0), null, function0, true), AuraDimensKt.SpacingMedium, AuraDimensKt.SpacingXsmallPlusNano);
            InterfaceC1380AiA interfaceC1380AiAA0X = AnonymousClass003.A0X(bfm, 4.0f, 6);
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
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA0X, akqA04, bRgA01, iA0J);
            AuraTextKt.m2639AuraTextUY9GdpU(hatchUpcomingTaskUiModel.title, null, colors.primaryText, typography.bodyEmphasized, null, null, null, false, 0, 2, 2, null, null, null, bfm, 805306368, 6, 14834);
            AuraTextKt.m2639AuraTextUY9GdpU(hatchUpcomingTaskUiModel.scheduledTime, null, colors.tertiaryText, typography.subheadlineRegular, null, null, null, false, 0, 1, 2, null, null, null, bfm, 805306368, 6, 14834);
            BBI.A0R(bbi, true);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C140912(hatchUpcomingTaskUiModel, function0, bRg2, i, i2);
        }
    }

    public static final void UpcomingCard(AHD<HatchUpcomingTaskUiModel> ahd, G0U<? super String, Unit> g0u, BRg bRg, BFM bfm, int i, int i2) {
        bfm.AgG(-1932962973);
        int iA0T = (i & 6) == 0 ? AnonymousClass004.A0T(bfm, ahd) | i : i;
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
                bRg = BRg.A00;
            }
            InterfaceC1380AiA interfaceC1380AiAA0U = AnonymousClass002.A0U(bfm);
            BBI bbi = (BBI) bfm;
            int iA0D = AnonymousClass001.A0D(bbi);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRg);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function0);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA0U, akqA04, bRgA01, iA0D);
            SectionHeader(AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f121072), null, bfm, 0, 2);
            Iterator itA0w = AnonymousClass001.A0w(bfm, ahd, -685237726);
            while (itA0w.hasNext()) {
                HatchUpcomingTaskUiModel hatchUpcomingTaskUiModel = (HatchUpcomingTaskUiModel) itA0w.next();
                boolean zA1T = AnonymousClass001.A1T(bfm, hatchUpcomingTaskUiModel, AnonymousClass003.A1C(iA0T));
                Object objAaT = bfm.AaT();
                if (zA1T || objAaT == C78N.A00) {
                    objAaT = new UpcomingScreenKt$UpcomingCard$1$1$1$1(g0u, hatchUpcomingTaskUiModel);
                    bfm.Ai0(objAaT);
                }
                UpcomingTaskRow(hatchUpcomingTaskUiModel, (Function0) objAaT, null, bfm, 0, 4);
            }
            AnonymousClass003.A0q(bbi);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C140902(ahd, g0u, bRg, i, i2);
        }
    }

    public static final /* synthetic */ HatchPendingScheduledTask.Event access$UpcomingScreen_YlGCr2M$lambda$4(C1BO c1bo) {
        return (HatchPendingScheduledTask.Event) c1bo.getValue();
    }

    public static final AHD<HatchTaskUiModel> scheduledTasksInUpcomingOrder(List<HatchTaskUiModel> list) {
        ArrayList arrayListA0y = C3cI.A0y(list);
        for (HatchTaskUiModel hatchTaskUiModel : list) {
            if (hatchTaskUiModel.enabled) {
                arrayListA0y.add(hatchTaskUiModel);
            }
        }
        return AGI.A07(AbstractC0878AGe.A0c(arrayListA0y, new Comparator() { // from class: com.facebook.aura.status.view.UpcomingScreenKt$scheduledTasksInUpcomingOrder$$inlined$sortedBy$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                List<TaskCategory> list2 = UpcomingScreenKt.UPCOMING_CATEGORY_ORDER;
                return Integer.valueOf(list2.indexOf(((HatchTaskUiModel) t).category)).compareTo(Integer.valueOf(list2.indexOf(((HatchTaskUiModel) t2).category)));
            }
        }));
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x01f6  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0227  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0235  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0258  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0266  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0289  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0297  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x039a  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x039d A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0403  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0441  */
    /* JADX WARN: Removed duplicated region for block: B:256:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01c5  */
    /* renamed from: UpcomingScreen-YlGCr2M, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m2254UpcomingScreenYlGCr2M(X.AHD<com.facebook.aura.status.viewmodel.HatchUpcomingTaskUiModel> r42, X.G0U<? super java.lang.String, kotlin.Unit> r43, boolean r44, float r45, float r46, X.BRg r47, com.facebook.aura.status.viewmodel.TasksViewModel r48, X.BFM r49, int r50, int r51) {
        /*
            Method dump skipped, instructions count: 1410
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.status.view.UpcomingScreenKt.m2254UpcomingScreenYlGCr2M(X.AHD, X.G0U, boolean, float, float, X.BRg, com.facebook.aura.status.viewmodel.TasksViewModel, X.BFM, int, int):void");
    }
}
