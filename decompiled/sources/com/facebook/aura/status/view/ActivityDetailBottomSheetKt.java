package com.facebook.aura.status.view;

import X.AHD;
import X.AKQ;
import X.AVy;
import X.AbstractC0885AGm;
import X.AbstractC1103AYp;
import X.AbstractC1996Aw5;
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
import X.B6A;
import X.BBI;
import X.BBb;
import X.BFM;
import X.BOf;
import X.BPg;
import X.BRg;
import X.BS0;
import X.C00x;
import X.C01N;
import X.C06I;
import X.C07C;
import X.C0A8;
import X.C0xs;
import X.C1062ATq;
import X.C10G;
import X.C11U;
import X.C1515AkP;
import X.C1822Arm;
import X.C1AC;
import X.C1D8;
import X.C1DI;
import X.C1DM;
import X.C1OM;
import X.C1b8;
import X.C2VU;
import X.C3TH;
import X.C3U4;
import X.C3cG;
import X.C3cH;
import X.C60O;
import X.C60P;
import X.C60Q;
import X.C60R;
import X.C6tn;
import X.C7384Etj;
import X.C78N;
import X.C7BY;
import X.C90m;
import X.C9m9;
import X.F60;
import X.G0U;
import X.G0V;
import X.G0W;
import X.GCH;
import X.HxE;
import X.InterfaceC04981Yd;
import X.InterfaceC1185Ado;
import X.InterfaceC1380AiA;
import X.InterfaceC1492Ajz;
import X.InterfaceC1516AkQ;
import com.facebook.aura.R;
import com.facebook.aura.file.utils.HatchFileUIUtils;
import com.facebook.aura.markdown.render.BulletMarkerKt;
import com.facebook.aura.status.repo.ActivityAction;
import com.facebook.aura.status.repo.ActivityDetailItem;
import com.facebook.aura.status.repo.ActivityDetailTask;
import com.facebook.aura.status.repo.ActivityDetails;
import com.facebook.aura.status.repo.ActivityFile;
import com.facebook.aura.vds.compose.base.AuraDimensKt;
import com.facebook.aura.vds.compose.bottomsheet.AuraInlineBottomSheetKt;
import com.facebook.aura.vds.compose.bottomsheet.state.RememberAuraBottomSheetStateKt;
import com.facebook.aura.vds.compose.icons.AuraIconKt;
import com.facebook.aura.vds.compose.icons.AuraIconSize;
import com.facebook.aura.vds.compose.spinner.AuraSpinnerKt;
import com.facebook.aura.vds.compose.tag.AuraStatusTagKt;
import com.facebook.aura.vds.compose.text.AuraTextKt;
import com.facebook.aura.vds.compose.theme.AuraTheme;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public abstract class ActivityDetailBottomSheetKt {

    /* renamed from: com.facebook.aura.status.view.ActivityDetailBottomSheetKt$ActivityDetailBottomSheet$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0W<C07C, BFM, Integer, Unit> {
        public final /* synthetic */ ActivityAction $action;
        public final /* synthetic */ BRg $impression;
        public final /* synthetic */ BRg $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(ActivityAction activityAction, BRg bRg, BRg bRg2) {
            super(3);
            this.$action = activityAction;
            this.$modifier = bRg;
            this.$impression = bRg2;
        }

        public final void invoke(C07C c07c, BFM bfm, int i) {
            if (AnonymousClass001.A1b(AnonymousClass004.A1G(i), bfm, i)) {
                ActivityDetailBottomSheetKt.ActivityDetailContent(this.$action, this.$modifier.then(this.$impression), bfm, 0, 0);
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

    /* renamed from: com.facebook.aura.status.view.ActivityDetailBottomSheetKt$ActivityDetailBottomSheet$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ ActivityAction $action;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onDismiss;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(ActivityAction activityAction, Function0<Unit> function0, BRg bRg, int i, int i2) {
            super(2);
            this.$action = activityAction;
            this.$onDismiss = function0;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            ActivityDetailBottomSheetKt.ActivityDetailBottomSheet(this.$action, this.$onDismiss, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.status.view.ActivityDetailBottomSheetKt$ActivityDetailContent$3, reason: invalid class name */
    public final class AnonymousClass3 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ ActivityAction $action;
        public final /* synthetic */ BRg $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(ActivityAction activityAction, BRg bRg, int i, int i2) {
            super(2);
            this.$action = activityAction;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            ActivityDetailBottomSheetKt.ActivityDetailContent(this.$action, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.status.view.ActivityDetailBottomSheetKt$CategoryHeader$2, reason: invalid class name and case insensitive filesystem */
    public final class C140282 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ ActivityAction $action;
        public final /* synthetic */ BRg $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C140282(ActivityAction activityAction, BRg bRg, int i, int i2) {
            super(2);
            this.$action = activityAction;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            ActivityDetailBottomSheetKt.CategoryHeader(this.$action, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.status.view.ActivityDetailBottomSheetKt$ErrorSection$2, reason: invalid class name and case insensitive filesystem */
    public final class C140292 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ String $error;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onRetry;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C140292(String str, Function0<Unit> function0, BRg bRg, int i, int i2) {
            super(2);
            this.$error = str;
            this.$onRetry = function0;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            ActivityDetailBottomSheetKt.ErrorSection(this.$error, this.$onRetry, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.status.view.ActivityDetailBottomSheetKt$FileRow$2, reason: invalid class name and case insensitive filesystem */
    public final class C140302 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ ActivityFile $file;
        public final /* synthetic */ BRg $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C140302(ActivityFile activityFile, BRg bRg, int i, int i2) {
            super(2);
            this.$file = activityFile;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            ActivityDetailBottomSheetKt.FileRow(this.$file, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.status.view.ActivityDetailBottomSheetKt$FilesSection$2, reason: invalid class name and case insensitive filesystem */
    public final class C140312 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ AHD<ActivityFile> $files;
        public final /* synthetic */ BRg $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C140312(AHD<ActivityFile> ahd, BRg bRg, int i, int i2) {
            super(2);
            this.$files = ahd;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            ActivityDetailBottomSheetKt.FilesSection(this.$files, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.status.view.ActivityDetailBottomSheetKt$InlineDetailsSection$2, reason: invalid class name and case insensitive filesystem */
    public final class C140322 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ ActivityDetails $details;
        public final /* synthetic */ BRg $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C140322(ActivityDetails activityDetails, BRg bRg, int i, int i2) {
            super(2);
            this.$details = activityDetails;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            ActivityDetailBottomSheetKt.InlineDetailsSection(this.$details, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.status.view.ActivityDetailBottomSheetKt$LoadingSection$2, reason: invalid class name and case insensitive filesystem */
    public final class C140332 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C140332(BRg bRg, int i, int i2) {
            super(2);
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            ActivityDetailBottomSheetKt.LoadingSection(this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.status.view.ActivityDetailBottomSheetKt$StatusSection$2, reason: invalid class name and case insensitive filesystem */
    public final class C140342 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ ActivityAction $action;
        public final /* synthetic */ BRg $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C140342(ActivityAction activityAction, BRg bRg, int i, int i2) {
            super(2);
            this.$action = activityAction;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            ActivityDetailBottomSheetKt.StatusSection(this.$action, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.status.view.ActivityDetailBottomSheetKt$SubtitleSection$2, reason: invalid class name and case insensitive filesystem */
    public final class C140352 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ AHD<String> $highlights;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ String $subtitle;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C140352(String str, AHD<String> ahd, BRg bRg, int i, int i2) {
            super(2);
            this.$subtitle = str;
            this.$highlights = ahd;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            ActivityDetailBottomSheetKt.SubtitleSection(this.$subtitle, this.$highlights, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.status.view.ActivityDetailBottomSheetKt$TaskRow$2, reason: invalid class name and case insensitive filesystem */
    public final class C140362 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ ActivityDetailTask $task;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C140362(ActivityDetailTask activityDetailTask, BRg bRg, int i, int i2) {
            super(2);
            this.$task = activityDetailTask;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            ActivityDetailBottomSheetKt.TaskRow(this.$task, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.status.view.ActivityDetailBottomSheetKt$TitleSection$2, reason: invalid class name and case insensitive filesystem */
    public final class C140372 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ ActivityAction $action;
        public final /* synthetic */ BRg $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C140372(ActivityAction activityAction, BRg bRg, int i, int i2) {
            super(2);
            this.$action = activityAction;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            ActivityDetailBottomSheetKt.TitleSection(this.$action, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    public static final boolean isSameDay(Calendar calendar, Calendar calendar2) {
        return calendar.get(1) == calendar2.get(1) && calendar.get(6) == calendar2.get(6);
    }

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ActivityAction.ActivityStatus.values().length];
            try {
                AnonymousClass002.A13(ActivityAction.ActivityStatus.SUCCESS, iArr);
            } catch (NoSuchFieldError unused) {
            }
            try {
                AnonymousClass002.A14(ActivityAction.ActivityStatus.ERROR, iArr);
            } catch (NoSuchFieldError unused2) {
            }
            try {
                AnonymousClass002.A15(ActivityAction.ActivityStatus.PENDING, iArr);
            } catch (NoSuchFieldError unused3) {
            }
            try {
                AnonymousClass002.A16(ActivityAction.ActivityStatus.PARTIAL, iArr);
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final void ActivityDetailBottomSheet(ActivityAction activityAction, Function0<Unit> function0, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        boolean zA1b = AnonymousClass004.A1b(activityAction, function0);
        bfm.AgG(-837317149);
        int iA0T = (i & 6) == 0 ? AnonymousClass004.A0T(bfm, activityAction) | i : i;
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
            AuraInlineBottomSheetKt.AuraInlineBottomSheet(null, null, function0, RememberAuraBottomSheetStateKt.rememberAuraBottomSheetState(zA1b, null, zA1b, bfm, zA1b ? 1 : 0, 7), null, null, null, null, null, null, zA1b, zA1b, zA1b, B1V.A00(bfm, new AnonymousClass1(activityAction, bRg2, rememberActivityItemSheetImpression(activityAction.id, bfm, zA1b ? 1 : 0)), 1502000640), bfm, (iA0T << 3) & 896, 3072, 8179);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass2(activityAction, function0, bRg2, i, i2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x0160 A[PHI: r11
  0x0160: PHI (r11v10 java.util.List<com.facebook.aura.status.repo.ActivityFile>) = 
  (r11v9 java.util.List<com.facebook.aura.status.repo.ActivityFile>)
  (r11v8 java.util.List<com.facebook.aura.status.repo.ActivityFile>)
 binds: [B:46:0x015e, B:44:0x015b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01c7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void ActivityDetailContent(com.facebook.aura.status.repo.ActivityAction r27, X.BRg r28, X.BFM r29, int r30, int r31) {
        /*
            Method dump skipped, instructions count: 513
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.status.view.ActivityDetailBottomSheetKt.ActivityDetailContent(com.facebook.aura.status.repo.ActivityAction, X.BRg, X.BFM, int, int):void");
    }

    public static final void CategoryHeader(ActivityAction activityAction, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(1412723396);
        int iA0T = (i & 6) == 0 ? AnonymousClass004.A0T(bfm, activityAction) | i : i;
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
            HatchFileUIUtils hatchFileUIUtils = HatchFileUIUtils.INSTANCE;
            int i4 = (iA0T & 14) | 48;
            long jM863getActivityActionIconColorXeAY9LY = hatchFileUIUtils.m863getActivityActionIconColorXeAY9LY(activityAction, bfm, i4);
            int activityLabelRes = hatchFileUIUtils.getActivityLabelRes(activityAction, bfm, i4);
            BRg bRgA0R = AnonymousClass001.A0R(bRg2);
            InterfaceC1380AiA interfaceC1380AiAA00 = C0A8.A00(AcQ.A01, bfm, C2VU.A05, 0);
            BBI bbi = (BBI) bfm;
            int iA02 = C3cG.A02(bbi.A06);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA0R);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function0);
            G0V g0vA0v = C3cH.A0v(bfm, interfaceC1380AiAA00);
            G0V<InterfaceC1516AkQ, InterfaceC1492Ajz, Unit> g0v = C1515AkP.A06;
            G0V g0vA19 = AnonymousClass004.A19(bfm, akqA04, g0v, iA02);
            G0U<InterfaceC1516AkQ, Unit> g0u = C1515AkP.A02;
            G0V g0vA0u = AnonymousClass002.A0u(bfm, bRgA01, g0u);
            BRg bRgA0B = C3U4.A0B(C1b8.A00(C11U.A01(BRg.A00, 4.0f), 0.1f, jM863getActivityActionIconColorXeAY9LY), 8.0f, 4.0f);
            InterfaceC1380AiA interfaceC1380AiAA0c = AnonymousClass001.A0c(false);
            int iA0D = AnonymousClass001.A0D(bbi);
            AKQ akqA042 = BBI.A04(bbi);
            BRg bRgA012 = AxM.A01(bfm, bRgA0B);
            AnonymousClass005.A0n(bfm, bbi, function0);
            BPg.A02(bfm, interfaceC1380AiAA0c, g0vA0v);
            BPg.A02(bfm, akqA042, g0v);
            AnonymousClass003.A15(g0u, g0vA19, bfm, iA0D);
            BPg.A02(bfm, bRgA012, g0vA0u);
            AuraTextKt.m2639AuraTextUY9GdpU(AbstractC2271BQs.A01(bfm, activityLabelRes), null, jM863getActivityActionIconColorXeAY9LY, C1822Arm.A00(null, C60Q.A0C(bfm, AuraTheme.INSTANCE), AbstractC1996Aw5.A01, null, null, null, null, null, null, null, 0, 0, 0, 16777183, 0L, 0L, 0L, 0L), null, null, null, false, 0, 0, 0, null, null, null, bfm, 0, 0, 16370);
            AnonymousClass002.A0y(bbi);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C140282(activityAction, bRg2, i, i2);
        }
    }

    public static final void ErrorSection(String str, Function0<Unit> function0, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(984337130);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, str) | i : i;
        int i3 = i2 & 4;
        if (i3 != 0) {
            iA0d |= 384;
        } else if ((i & 384) == 0) {
            iA0d |= AnonymousClass004.A0f(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 131, 130), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            BRg bRgA06 = C3U4.A06(AnonymousClass001.A0R(bRg2), 8.0f);
            InterfaceC1380AiA interfaceC1380AiAA0J = AnonymousClass007.A0J(bfm);
            BBI bbi = (BBI) bfm;
            int iA0J = AnonymousClass003.A0J(bbi);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA06);
            Function0<InterfaceC1516AkQ> function02 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function02);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA0J, akqA04, bRgA01, iA0J);
            AuraTheme auraTheme = AuraTheme.INSTANCE;
            AuraTextKt.m2639AuraTextUY9GdpU(str, null, HatchFileUIUtils.StatusColors.ERROR_RED, C3cH.A0E(bfm, auraTheme), null, null, null, false, 0, 0, 0, null, null, null, bfm, iA0d & 14, 0, 16370);
            C01N.A05(bfm, BRg.A00);
            AuraTextKt.m2639AuraTextUY9GdpU(AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f12092b), null, auraTheme.getColors(bfm, 6).link, C60Q.A0C(bfm, auraTheme), null, null, null, false, 0, 0, 0, null, null, null, bfm, 0, 0, 16370);
            BBI.A0R(bbi, true);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C140292(str, function0, bRg2, i, i2);
        }
    }

    public static final void FileRow(ActivityFile activityFile, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(-612494285);
        int iA0T = (i & 6) == 0 ? AnonymousClass004.A0T(bfm, activityFile) | i : i;
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
            BRg bRgA0B = C3U4.A0B(bRg2, 10.0f, 8.0f);
            InterfaceC1380AiA interfaceC1380AiAA0V = AnonymousClass006.A0V(bfm, C2VU.A05, 8.0f);
            BBI bbi = (BBI) bfm;
            int iA02 = C3cG.A02(bbi.A06);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA0B);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function0);
            G0V g0vA0v = C3cH.A0v(bfm, interfaceC1380AiAA0V);
            G0V<InterfaceC1516AkQ, InterfaceC1492Ajz, Unit> g0v = C1515AkP.A06;
            G0V g0vA19 = AnonymousClass004.A19(bfm, akqA04, g0v, iA02);
            G0U<InterfaceC1516AkQ, Unit> g0u = C1515AkP.A02;
            G0V g0vA0u = AnonymousClass002.A0u(bfm, bRgA01, g0u);
            HxE<Integer, B6A> fileStatusIconAndColor = getFileStatusIconAndColor(activityFile.status);
            int iA0F = AnonymousClass001.A0F(fileStatusIconAndColor.first);
            long j = fileStatusIconAndColor.second.A00;
            BRg bRgA08 = C10G.A08(BRg.A00, 16.0f);
            InterfaceC1380AiA interfaceC1380AiAA0a = AnonymousClass001.A0a();
            int iA0D = AnonymousClass001.A0D(bbi);
            AKQ akqA042 = BBI.A04(bbi);
            BRg bRgA012 = AxM.A01(bfm, bRgA08);
            AnonymousClass005.A0n(bfm, bbi, function0);
            BPg.A02(bfm, interfaceC1380AiAA0a, g0vA0v);
            BPg.A02(bfm, akqA042, g0v);
            AnonymousClass003.A15(g0u, g0vA19, bfm, iA0D);
            BPg.A02(bfm, bRgA012, g0vA0u);
            AuraIconKt.m2567AuraIconFHprtrg(null, BOf.A00(bfm, iA0F, 0), AuraIconSize.X_TINY, null, j, null, bfm, AnonymousClass001.A04(), 33);
            BBI.A0R(bbi, true);
            String str = activityFile.path;
            AuraTheme auraTheme = AuraTheme.INSTANCE;
            AuraTextKt.m2639AuraTextUY9GdpU(str, null, C3cH.A07(bfm, auraTheme), C1822Arm.A00(null, C3cH.A0E(bfm, auraTheme), AbstractC1996Aw5.A01, null, null, null, null, null, null, null, 0, 0, 0, 16777183, 0L, 0L, 0L, 0L), null, null, null, false, 0, 1, 0, null, null, null, bfm, 805306368, 0, 15858);
            BBI.A0R(bbi, true);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C140302(activityFile, bRg2, i, i2);
        }
    }

    public static final void FilesSection(AHD<ActivityFile> ahd, BRg bRg, BFM bfm, int i, int i2) {
        String strA0t;
        BRg bRg2 = bRg;
        bfm.AgG(1396401636);
        int iA0T = (i & 6) == 0 ? i | AnonymousClass004.A0T(bfm, ahd) : i;
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
            C1062ATq c1062ATq = C10G.A02;
            BRg bRgA01 = C11U.A01(bRg2.then(c1062ATq), 8.0f);
            AuraTheme auraTheme = AuraTheme.INSTANCE;
            long jA01 = C60O.A01(bfm, auraTheme);
            C1DM c1dm = C1OM.A00;
            BRg bRgA0H = C60R.A0H(bRgA01, c1dm, jA01);
            InterfaceC1185Ado interfaceC1185Ado = AcQ.A06;
            C3TH c3th = C2VU.A02;
            InterfaceC1380AiA interfaceC1380AiAA00 = C06I.A00(interfaceC1185Ado, bfm, c3th, 0);
            BBI bbi = (BBI) bfm;
            int iA02 = C3cG.A02(bbi.A06);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA012 = AxM.A01(bfm, bRgA0H);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
            } else {
                AnonymousClass005.A0n(bfm, bbi, function0);
                G0V g0vA0v = C3cH.A0v(bfm, interfaceC1380AiAA00);
                G0V<InterfaceC1516AkQ, InterfaceC1492Ajz, Unit> g0v = C1515AkP.A06;
                G0V g0vA19 = AnonymousClass004.A19(bfm, akqA04, g0v, iA02);
                G0U<InterfaceC1516AkQ, Unit> g0u = C1515AkP.A02;
                G0V g0vA0u = AnonymousClass002.A0u(bfm, bRgA012, g0u);
                BS0 bs0 = BRg.A00;
                C1AC c1ac = C2VU.A04;
                InterfaceC04981Yd interfaceC04981Yd = AcQ.A01;
                InterfaceC1380AiA interfaceC1380AiAA002 = C0A8.A00(interfaceC04981Yd, bfm, c1ac, 48);
                int iA0D = AnonymousClass001.A0D(bbi);
                AKQ akqA042 = BBI.A04(bbi);
                BRg bRgA013 = AxM.A01(bfm, c1062ATq);
                AnonymousClass005.A0n(bfm, bbi, function0);
                BPg.A02(bfm, interfaceC1380AiAA002, g0vA0v);
                BPg.A02(bfm, akqA042, g0v);
                AnonymousClass003.A15(g0u, g0vA19, bfm, iA0D);
                BPg.A02(bfm, bRgA013, g0vA0u);
                C90m c90m = C90m.A00;
                AuraIconKt.m2567AuraIconFHprtrg(null, BOf.A00(bfm, R.drawable.two_lines_vertical_rectangle_missing_corner_outline_24, 0), AuraIconSize.X_TINY, null, C3cH.A05(bfm, auraTheme), null, bfm, AnonymousClass001.A04(), 33);
                C01N.A09(bfm, bs0, AuraDimensKt.SpacingXsmall);
                AuraTextKt.m2639AuraTextUY9GdpU(AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120030), null, C3cH.A05(bfm, auraTheme), C60Q.A0C(bfm, auraTheme), null, null, null, false, 0, 0, 0, null, null, null, bfm, 0, 0, 16370);
                boolean zA1V = C60R.A1V(c90m, bfm, bs0);
                if (ahd.size() == zA1V) {
                    bfm.AgE(-1071210971);
                    strA0t = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120035);
                } else {
                    bfm.AgE(-1071122373);
                    strA0t = AnonymousClass001.A0t(bfm, C60Q.A0W(ahd), R.string._name_removed__res_0x7f120034);
                }
                BBI.A0R(bbi, false);
                AuraTextKt.m2639AuraTextUY9GdpU(strA0t, null, C3cH.A05(bfm, auraTheme), C60Q.A0C(bfm, auraTheme), null, null, null, false, 0, 0, 0, null, null, null, bfm, 0, 0, 16370);
                BBI.A0R(bbi, zA1V);
                C01N.A05(bfm, bs0);
                BRg bRgA014 = AbstractC1103AYp.A01(AbstractC1103AYp.A00(0, bfm, 0, zA1V ? 1 : 0), C60R.A0E(bfm, C11U.A01(c1062ATq, 8.0f), c1dm, auraTheme), zA1V);
                InterfaceC1380AiA interfaceC1380AiAA003 = C0A8.A00(interfaceC04981Yd, bfm, C2VU.A05, 0);
                int iA0D2 = AnonymousClass001.A0D(bbi);
                AKQ akqA043 = BBI.A04(bbi);
                BRg bRgA015 = AxM.A01(bfm, bRgA014);
                AnonymousClass005.A0n(bfm, bbi, function0);
                BPg.A02(bfm, interfaceC1380AiAA003, g0vA0v);
                BPg.A02(bfm, akqA043, g0v);
                AnonymousClass003.A15(g0u, g0vA19, bfm, iA0D2);
                BPg.A02(bfm, bRgA015, g0vA0u);
                InterfaceC1380AiA interfaceC1380AiAA004 = C06I.A00(interfaceC1185Ado, bfm, c3th, 0);
                int iA0D3 = AnonymousClass001.A0D(bbi);
                AKQ akqA044 = BBI.A04(bbi);
                BRg bRgA016 = AxM.A01(bfm, bs0);
                AnonymousClass005.A0n(bfm, bbi, function0);
                BPg.A02(bfm, interfaceC1380AiAA004, g0vA0v);
                BPg.A02(bfm, akqA044, g0v);
                AnonymousClass003.A15(g0u, g0vA19, bfm, iA0D3);
                BPg.A02(bfm, bRgA016, g0vA0u);
                Iterator itA0w = AnonymousClass001.A0w(bfm, ahd, 1343434071);
                int i4 = 0;
                while (itA0w.hasNext()) {
                    Object next = itA0w.next();
                    int i5 = i4 + 1;
                    if (i4 < 0) {
                        AbstractC0885AGm.A14();
                    } else {
                        FileRow((ActivityFile) next, null, bfm, 0, 2);
                        if (i4 < C60O.A00(ahd)) {
                            bfm.AgE(-1485089818);
                            C0xs.A00(0.0f, C60O.A01(bfm, auraTheme), C3U4.A0C(bs0, 34.0f, 0.0f, 0.0f, 0.0f), bfm, 6, 2);
                            BBI.A0R(bbi, false);
                        } else {
                            bfm.AgE(-1484925487);
                            BBI.A0R(bbi, false);
                        }
                        i4 = i5;
                    }
                }
                AnonymousClass002.A10(bbi, false, zA1V);
                BBI.A0R(bbi, zA1V);
            }
            throw F60.createAndThrow();
        }
        bfm.Afo();
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C140312(ahd, bRg2, i, i2);
        }
    }

    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v4, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r5v7 */
    public static final void InlineDetailsSection(ActivityDetails activityDetails, BRg bRg, BFM bfm, int i, int i2) {
        int i3;
        BRg bRg2 = bRg;
        bfm.AgG(-1043031963);
        int iA0T = (i & 6) == 0 ? i | AnonymousClass004.A0T(bfm, activityDetails) : i;
        int i4 = i2 & 2;
        if (i4 != 0) {
            iA0T |= 48;
        } else if ((i & 48) == 0) {
            iA0T |= AnonymousClass004.A0e(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1H(iA0T), bfm, iA0T)) {
            if (i4 != 0) {
                bRg2 = BRg.A00;
            }
            C1062ATq c1062ATq = C10G.A02;
            BRg bRgThen = bRg2.then(c1062ATq);
            C9m9 c9m9A00 = AcQ.A00(8.0f);
            C3TH c3th = C2VU.A02;
            InterfaceC1380AiA interfaceC1380AiAA00 = C06I.A00(c9m9A00, bfm, c3th, 6);
            BBI bbi = (BBI) bfm;
            int iA02 = C3cG.A02(bbi.A06);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgThen);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
            } else {
                AnonymousClass005.A0n(bfm, bbi, function0);
                G0V g0vA0v = C3cH.A0v(bfm, interfaceC1380AiAA00);
                G0V<InterfaceC1516AkQ, InterfaceC1492Ajz, Unit> g0v = C1515AkP.A06;
                G0V g0vA19 = AnonymousClass004.A19(bfm, akqA04, g0v, iA02);
                G0U<InterfaceC1516AkQ, Unit> g0u = C1515AkP.A02;
                BPg.A03(bfm, g0u);
                G0V<InterfaceC1516AkQ, BRg, Unit> g0v2 = C1515AkP.A05;
                BPg.A02(bfm, bRgA01, g0v2);
                List<ActivityDetailTask> list = activityDetails.tasks;
                if (list == null || list.isEmpty()) {
                    i3 = 0;
                    bfm.AgE(923305683);
                } else {
                    BS0 bs0A09 = C3cG.A09(bfm, 921503808);
                    BRg bRgA012 = C11U.A01(c1062ATq, 8.0f);
                    AuraTheme auraTheme = AuraTheme.INSTANCE;
                    long jA01 = C60O.A01(bfm, auraTheme);
                    C1DM c1dm = C1OM.A00;
                    BRg bRgA0H = C60R.A0H(bRgA012, c1dm, jA01);
                    InterfaceC1185Ado interfaceC1185Ado = AcQ.A06;
                    InterfaceC1380AiA interfaceC1380AiAA002 = C06I.A00(interfaceC1185Ado, bfm, c3th, 0);
                    int iA0D = AnonymousClass001.A0D(bbi);
                    AKQ akqA042 = BBI.A04(bbi);
                    BRg bRgA013 = AxM.A01(bfm, bRgA0H);
                    AnonymousClass005.A0n(bfm, bbi, function0);
                    BPg.A02(bfm, interfaceC1380AiAA002, g0vA0v);
                    BPg.A02(bfm, akqA042, g0v);
                    AnonymousClass003.A15(g0u, g0vA19, bfm, iA0D);
                    BPg.A02(bfm, bRgA013, g0v2);
                    InterfaceC1380AiA interfaceC1380AiAA0V = AnonymousClass006.A0V(bfm, C2VU.A04, 6.0f);
                    int iA0D2 = AnonymousClass001.A0D(bbi);
                    AKQ akqA043 = BBI.A04(bbi);
                    BRg bRgA014 = AxM.A01(bfm, c1062ATq);
                    AnonymousClass005.A0n(bfm, bbi, function0);
                    BPg.A02(bfm, interfaceC1380AiAA0V, g0vA0v);
                    BPg.A02(bfm, akqA043, g0v);
                    AnonymousClass003.A15(g0u, g0vA19, bfm, iA0D2);
                    BPg.A02(bfm, bRgA014, g0v2);
                    C90m c90m = C90m.A00;
                    AuraIconKt.m2567AuraIconFHprtrg(null, BOf.A00(bfm, R.drawable.ic_gear, 0), AuraIconSize.X_TINY, null, C3cH.A05(bfm, auraTheme), null, bfm, AnonymousClass001.A04(), 33);
                    i3 = 0;
                    AuraTextKt.m2639AuraTextUY9GdpU(AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f12003e), null, C3cH.A05(bfm, auraTheme), C60Q.A0C(bfm, auraTheme), null, null, null, false, 0, 0, 0, null, null, null, bfm, 0, 0, 16370);
                    boolean zA1V = C60R.A1V(c90m, bfm, bs0A09);
                    AuraTextKt.m2639AuraTextUY9GdpU(AnonymousClass001.A0t(bfm, C60Q.A0W(list), R.string._name_removed__res_0x7f120045), null, C3cH.A05(bfm, auraTheme), C60Q.A0C(bfm, auraTheme), null, null, null, false, 0, 0, 0, null, null, null, bfm, 0, 0, 16370);
                    BBI.A0R(bbi, zA1V);
                    C01N.A05(bfm, bs0A09);
                    BRg bRgA0E = C60R.A0E(bfm, C11U.A01(c1062ATq, 8.0f), c1dm, auraTheme);
                    InterfaceC1380AiA interfaceC1380AiAA003 = C06I.A00(interfaceC1185Ado, bfm, c3th, 0);
                    int iA0D3 = AnonymousClass001.A0D(bbi);
                    AKQ akqA044 = BBI.A04(bbi);
                    BRg bRgA015 = AxM.A01(bfm, bRgA0E);
                    AnonymousClass005.A0n(bfm, bbi, function0);
                    BPg.A02(bfm, interfaceC1380AiAA003, g0vA0v);
                    BPg.A02(bfm, akqA044, g0v);
                    AnonymousClass003.A15(g0u, g0vA19, bfm, iA0D3);
                    BPg.A02(bfm, bRgA015, g0v2);
                    Iterator itA0w = AnonymousClass001.A0w(bfm, list, 1219411378);
                    int i5 = 0;
                    while (itA0w.hasNext()) {
                        Object next = itA0w.next();
                        int i6 = i5 + 1;
                        if (i5 < 0) {
                            break;
                        }
                        TaskRow((ActivityDetailTask) next, null, bfm, 0, 2);
                        if (i5 < C60O.A00(list)) {
                            bfm.AgE(618188023);
                            C0xs.A00(0.0f, C60O.A01(bfm, auraTheme), C3U4.A0C(bs0A09, 26.0f, 0.0f, 0.0f, 0.0f), bfm, 6, 2);
                            BBI.A0R(bbi, false);
                        } else {
                            bfm.AgE(618361964);
                            BBI.A0R(bbi, false);
                        }
                        i5 = i6;
                    }
                    AnonymousClass002.A10(bbi, false, zA1V);
                }
                BBI.A0R(bbi, i3);
                List<ActivityDetailItem> list2 = activityDetails.items;
                if (list2 == null || list2.isEmpty()) {
                    bfm.AgE(925933491);
                } else {
                    BS0 bs0A092 = C3cG.A09(bfm, 923466604);
                    BRg bRgA016 = C11U.A01(c1062ATq, 8.0f);
                    AuraTheme auraTheme2 = AuraTheme.INSTANCE;
                    long jA012 = C60O.A01(bfm, auraTheme2);
                    C1DM c1dm2 = C1OM.A00;
                    BRg bRgA0H2 = C60R.A0H(bRgA016, c1dm2, jA012);
                    InterfaceC1185Ado interfaceC1185Ado2 = AcQ.A06;
                    InterfaceC1380AiA interfaceC1380AiAA004 = C06I.A00(interfaceC1185Ado2, bfm, c3th, i3);
                    int iA0D4 = AnonymousClass001.A0D(bbi);
                    AKQ akqA045 = BBI.A04(bbi);
                    BRg bRgA017 = AxM.A01(bfm, bRgA0H2);
                    AnonymousClass005.A0n(bfm, bbi, function0);
                    BPg.A02(bfm, interfaceC1380AiAA004, g0vA0v);
                    BPg.A02(bfm, akqA045, g0v);
                    AnonymousClass003.A15(g0u, g0vA19, bfm, iA0D4);
                    BPg.A02(bfm, bRgA017, g0v2);
                    InterfaceC1380AiA interfaceC1380AiAA005 = C0A8.A00(AcQ.A00(6.0f), bfm, C2VU.A04, 54);
                    int iA0D5 = AnonymousClass001.A0D(bbi);
                    AKQ akqA046 = BBI.A04(bbi);
                    BRg bRgA018 = AxM.A01(bfm, c1062ATq);
                    AnonymousClass005.A0n(bfm, bbi, function0);
                    BPg.A02(bfm, interfaceC1380AiAA005, g0vA0v);
                    BPg.A02(bfm, akqA046, g0v);
                    AnonymousClass003.A15(g0u, g0vA19, bfm, iA0D5);
                    BPg.A02(bfm, bRgA018, g0v2);
                    C90m c90m2 = C90m.A00;
                    AuraIconKt.m2567AuraIconFHprtrg(null, BOf.A00(bfm, R.drawable.ic_gear, i3), AuraIconSize.X_TINY, null, C3cH.A05(bfm, auraTheme2), null, bfm, AnonymousClass001.A04(), 33);
                    boolean z = i3;
                    int i7 = i3;
                    int i8 = i3;
                    int i9 = i3;
                    int i10 = i3;
                    int i11 = i3;
                    AuraTextKt.m2639AuraTextUY9GdpU(AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f12004a), null, C3cH.A05(bfm, auraTheme2), C60Q.A0C(bfm, auraTheme2), null, null, null, z, i7, i8, i9, null, null, null, bfm, i10, i11, 16370);
                    boolean zA1V2 = C60R.A1V(c90m2, bfm, bs0A092);
                    AuraTextKt.m2639AuraTextUY9GdpU(String.valueOf(list2.size()), null, C3cH.A05(bfm, auraTheme2), C60Q.A0C(bfm, auraTheme2), null, null, null, z, i7, i8, i9, null, null, null, bfm, i10, i11, 16370);
                    BBI.A0R(bbi, zA1V2);
                    C01N.A05(bfm, bs0A092);
                    BRg bRgA0E2 = C60R.A0E(bfm, C11U.A01(c1062ATq, 8.0f), c1dm2, auraTheme2);
                    InterfaceC1380AiA interfaceC1380AiAA006 = C06I.A00(interfaceC1185Ado2, bfm, c3th, i3);
                    int iA0D6 = AnonymousClass001.A0D(bbi);
                    AKQ akqA047 = BBI.A04(bbi);
                    BRg bRgA019 = AxM.A01(bfm, bRgA0E2);
                    AnonymousClass005.A0n(bfm, bbi, function0);
                    BPg.A02(bfm, interfaceC1380AiAA006, g0vA0v);
                    BPg.A02(bfm, akqA047, g0v);
                    AnonymousClass003.A15(g0u, g0vA19, bfm, iA0D6);
                    BPg.A02(bfm, bRgA019, g0v2);
                    Iterator itA0w2 = AnonymousClass001.A0w(bfm, list2, -499001331);
                    int i12 = 0;
                    while (itA0w2.hasNext()) {
                        Object next2 = itA0w2.next();
                        int i13 = i12 + 1;
                        if (i12 >= 0) {
                            ActivityDetailItem activityDetailItem = (ActivityDetailItem) next2;
                            BRg bRgA0B = C3U4.A0B(bs0A092, 10.0f, 6.0f);
                            InterfaceC1380AiA interfaceC1380AiAA0S = AnonymousClass006.A0S(bfm, 8.0f, 54);
                            int iA0D7 = AnonymousClass001.A0D(bbi);
                            AKQ akqA048 = BBI.A04(bbi);
                            BRg bRgA0110 = AxM.A01(bfm, bRgA0B);
                            AnonymousClass005.A0n(bfm, bbi, function0);
                            BPg.A02(bfm, interfaceC1380AiAA0S, g0vA0v);
                            BPg.A02(bfm, akqA048, g0v);
                            AnonymousClass003.A15(g0u, g0vA19, bfm, iA0D7);
                            BPg.A02(bfm, bRgA0110, g0v2);
                            String str = activityDetailItem.tool;
                            if (str == null) {
                                str = "tool";
                            }
                            boolean z2 = i3;
                            int i14 = i3;
                            int i15 = i3;
                            AuraTextKt.m2639AuraTextUY9GdpU(str, null, C3cH.A06(bfm, auraTheme2), C1822Arm.A00(null, C3cH.A0E(bfm, auraTheme2), AbstractC1996Aw5.A01, null, null, null, null, null, null, null, i9, i3, i3, 16777183, 0L, 0L, 0L, 0L), null, null, null, z2, i14, i3, i9, null, null, null, bfm, i3, i15, 16370);
                            String str2 = activityDetailItem.query;
                            if (str2 == null || C7BY.A0j(str2)) {
                                bfm.AgE(-410477863);
                                BBI.A0R(bbi, i3);
                            } else {
                                AuraTextKt.m2639AuraTextUY9GdpU(str2, null, C3cH.A07(bfm, auraTheme2), C3cH.A0X(bfm, auraTheme2, -410706116).footnoteRegular, null, null, null, z2, i14, zA1V2 ? 1 : 0, i9, null, null, null, bfm, 805306368, i15, 15858);
                                BBI.A0R(bbi, i3);
                            }
                            BBI.A0R(bbi, zA1V2);
                            if (i12 < C60O.A00(list2)) {
                                bfm.AgE(80450400);
                                C0xs.A00(0.0f, C60O.A01(bfm, auraTheme2), C3U4.A0C(bs0A092, 10.0f, 0.0f, 0.0f, 0.0f), bfm, 6, 2);
                                BBI.A0R(bbi, i3);
                            } else {
                                bfm.AgE(80624341);
                                BBI.A0R(bbi, i3);
                            }
                            i12 = i13;
                        } else {
                            AbstractC0885AGm.A14();
                        }
                    }
                    AnonymousClass002.A10(bbi, i3, zA1V2);
                }
                AnonymousClass003.A0q(bbi);
            }
            throw F60.createAndThrow();
        }
        bfm.Afo();
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C140322(activityDetails, bRg2, i, i2);
        }
    }

    public static final void LoadingSection(BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(-184634421);
        int i3 = i2 & 1;
        int iA0d = i3 != 0 ? i | 6 : (i & 6) == 0 ? AnonymousClass004.A0d(bfm, bRg2) | i : i;
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 3, 2), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            BRg bRgA06 = C3U4.A06(AnonymousClass001.A0R(bRg2), 12.0f);
            InterfaceC1380AiA interfaceC1380AiAA0b = AnonymousClass001.A0b(AcQ.A02, bfm, C2VU.A04);
            BBI bbi = (BBI) bfm;
            int iA0J = AnonymousClass003.A0J(bbi);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA06);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function0);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA0b, akqA04, bRgA01, iA0J);
            BS0 bs0 = BRg.A00;
            BRg bRgA07 = C10G.A07(bs0, 16.0f);
            AuraTheme auraTheme = AuraTheme.INSTANCE;
            AuraSpinnerKt.m2611AuraSpinnerFNF3uiM(bRgA07, null, C3cH.A05(bfm, auraTheme), bfm, 6, 2);
            C01N.A09(bfm, bs0, 8.0f);
            AuraTextKt.m2639AuraTextUY9GdpU(AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120032), null, C3cH.A05(bfm, auraTheme), C3cH.A0E(bfm, auraTheme), null, null, null, false, 0, 0, 0, null, null, null, bfm, 0, 0, 16370);
            BBI.A0R(bbi, true);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C140332(bRg2, i, i2);
        }
    }

    public static final void StatusSection(ActivityAction activityAction, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(-1819924232);
        int iA0T = (i & 6) == 0 ? AnonymousClass004.A0T(bfm, activityAction) | i : i;
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
            HxE<B6A, String> statusBadgeInfo = getStatusBadgeInfo(activityAction.status, bfm, 0);
            BRg bRgA0R = AnonymousClass001.A0R(bRg2);
            InterfaceC1380AiA interfaceC1380AiAA00 = C0A8.A00(AcQ.A00(12.0f), bfm, C2VU.A05, 6);
            BBI bbi = (BBI) bfm;
            int iA02 = C3cG.A02(bbi.A06);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA0R);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function0);
            G0V g0vA0v = C3cH.A0v(bfm, interfaceC1380AiAA00);
            G0V<InterfaceC1516AkQ, InterfaceC1492Ajz, Unit> g0v = C1515AkP.A06;
            G0V g0vA19 = AnonymousClass004.A19(bfm, akqA04, g0v, iA02);
            G0U<InterfaceC1516AkQ, Unit> g0u = C1515AkP.A02;
            G0V g0vA0u = AnonymousClass002.A0u(bfm, bRgA01, g0u);
            AuraStatusTagKt.m2637AuraStatusTagRWsq2U(statusBadgeInfo.second, statusBadgeInfo.first.A00, null, 0L, bfm, 0, 12);
            String str = activityAction.taskLabel;
            String str2 = activityAction.commitSha;
            String strA02 = str2 != null ? C6tn.A02(str2) : null;
            if (str != null && !C7BY.A0j(str)) {
                BRg bRgA012 = C11U.A01(C3cG.A09(bfm, -2146377580), 6.0f);
                AuraTheme auraTheme = AuraTheme.INSTANCE;
                BRg bRgA0B = C3U4.A0B(C1b8.A01(bRgA012, C60O.A01(bfm, auraTheme)), 10.0f, 6.0f);
                InterfaceC1380AiA interfaceC1380AiAA0c = AnonymousClass001.A0c(false);
                int iA0D = AnonymousClass001.A0D(bbi);
                AKQ akqA042 = BBI.A04(bbi);
                BRg bRgA013 = AxM.A01(bfm, bRgA0B);
                AnonymousClass005.A0n(bfm, bbi, function0);
                BPg.A02(bfm, interfaceC1380AiAA0c, g0vA0v);
                BPg.A02(bfm, akqA042, g0v);
                AnonymousClass003.A15(g0u, g0vA19, bfm, iA0D);
                BPg.A02(bfm, bRgA013, g0vA0u);
                AuraTextKt.m2639AuraTextUY9GdpU(str, null, C3cH.A05(bfm, auraTheme), C1822Arm.A00(null, C3cH.A0E(bfm, auraTheme), AbstractC1996Aw5.A01, null, null, null, null, null, null, null, 0, 0, 0, 16777183, 0L, 0L, 0L, 0L), null, null, null, false, 0, 0, 0, null, null, null, bfm, 0, 0, 16370);
            } else if (strA02 == null || C7BY.A0j(strA02)) {
                bfm.AgE(-2145476658);
                AnonymousClass003.A0q(bbi);
            } else {
                BRg bRgA014 = C11U.A01(C3cG.A09(bfm, -2145901420), 6.0f);
                AuraTheme auraTheme2 = AuraTheme.INSTANCE;
                BRg bRgA0B2 = C3U4.A0B(C1b8.A01(bRgA014, C60O.A01(bfm, auraTheme2)), 10.0f, 6.0f);
                InterfaceC1380AiA interfaceC1380AiAA0c2 = AnonymousClass001.A0c(false);
                int iA0D2 = AnonymousClass001.A0D(bbi);
                AKQ akqA043 = BBI.A04(bbi);
                BRg bRgA015 = AxM.A01(bfm, bRgA0B2);
                AnonymousClass005.A0n(bfm, bbi, function0);
                BPg.A02(bfm, interfaceC1380AiAA0c2, g0vA0v);
                BPg.A02(bfm, akqA043, g0v);
                AnonymousClass003.A15(g0u, g0vA19, bfm, iA0D2);
                BPg.A02(bfm, bRgA015, g0vA0u);
                AuraTextKt.m2639AuraTextUY9GdpU(strA02, null, C3cH.A05(bfm, auraTheme2), C1822Arm.A00(null, C3cH.A0E(bfm, auraTheme2), AbstractC1996Aw5.A01, null, null, null, null, null, null, null, 0, 0, 0, 16777183, 0L, 0L, 0L, 0L), null, null, null, false, 0, 0, 0, null, null, null, bfm, 0, 0, 16370);
            }
            BBI.A0R(bbi, true);
            AnonymousClass003.A0q(bbi);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C140342(activityAction, bRg2, i, i2);
        }
    }

    public static final void SubtitleSection(String str, AHD<String> ahd, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(696608126);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, str) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0e(bfm, ahd);
        }
        int i3 = i2 & 4;
        if (i3 != 0) {
            iA0d |= 384;
        } else if ((i & 384) == 0) {
            iA0d |= AnonymousClass004.A0f(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 147, 146), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            BRg bRgA0R = AnonymousClass001.A0R(bRg2);
            InterfaceC1380AiA interfaceC1380AiAA0U = AnonymousClass002.A0U(bfm);
            BBI bbi = (BBI) bfm;
            int iA02 = C3cG.A02(bbi.A06);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA0R);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function0);
            G0V g0vA0v = C3cH.A0v(bfm, interfaceC1380AiAA0U);
            G0V<InterfaceC1516AkQ, InterfaceC1492Ajz, Unit> g0v = C1515AkP.A06;
            G0V g0vA19 = AnonymousClass004.A19(bfm, akqA04, g0v, iA02);
            G0U<InterfaceC1516AkQ, Unit> g0u = C1515AkP.A02;
            G0V g0vA0u = AnonymousClass002.A0u(bfm, bRgA01, g0u);
            AuraTheme auraTheme = AuraTheme.INSTANCE;
            AuraTextKt.m2639AuraTextUY9GdpU(str, null, C3cH.A06(bfm, auraTheme), C3cH.A0B(bfm, auraTheme), null, null, null, false, 0, 0, 0, null, null, null, bfm, iA0d & 14, 0, 16370);
            if (ahd == null || ahd.isEmpty()) {
                bfm.AgE(-830248006);
            } else {
                BS0 bs0A09 = C3cG.A09(bfm, -830867851);
                C01N.A05(bfm, bs0A09);
                for (String str2 : ahd) {
                    BRg bRgA04 = C3U4.A04(bs0A09, 4.0f);
                    InterfaceC1380AiA interfaceC1380AiAA0W = AnonymousClass002.A0W(bfm, C2VU.A05);
                    int iA0D = AnonymousClass001.A0D(bbi);
                    AKQ akqA042 = BBI.A04(bbi);
                    BRg bRgA012 = AxM.A01(bfm, bRgA04);
                    AnonymousClass005.A0n(bfm, bbi, function0);
                    BPg.A02(bfm, interfaceC1380AiAA0W, g0vA0v);
                    BPg.A02(bfm, akqA042, g0v);
                    AnonymousClass003.A15(g0u, g0vA19, bfm, iA0D);
                    BPg.A02(bfm, bRgA012, g0vA0u);
                    AuraTextKt.m2639AuraTextUY9GdpU(BulletMarkerKt.DEFAULT_BULLET_GLYPH, null, C3cH.A05(bfm, auraTheme), C3cH.A0E(bfm, auraTheme), null, null, null, false, 0, 0, 0, null, null, null, bfm, 6, 0, 16370);
                    C01N.A09(bfm, bs0A09, 6.0f);
                    AuraTextKt.m2639AuraTextUY9GdpU(str2, null, C3cH.A07(bfm, auraTheme), C3cH.A0E(bfm, auraTheme), null, null, null, false, 0, 0, 0, null, null, null, bfm, 0, 0, 16370);
                    BBI.A0R(bbi, true);
                }
            }
            AnonymousClass003.A0q(bbi);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C140352(str, ahd, bRg2, i, i2);
        }
    }

    public static final void TaskRow(ActivityDetailTask activityDetailTask, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(1461380982);
        int iA0T = (i & 6) == 0 ? AnonymousClass004.A0T(bfm, activityDetailTask) | i : i;
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
            BRg bRgA0B = C3U4.A0B(bRg2, 10.0f, 8.0f);
            InterfaceC1380AiA interfaceC1380AiAA0b = AnonymousClass001.A0b(AcQ.A00(8.0f), bfm, C2VU.A05);
            BBI bbi = (BBI) bfm;
            int iA02 = C3cG.A02(bbi.A06);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA0B);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function0);
            G0V g0vA0v = C3cH.A0v(bfm, interfaceC1380AiAA0b);
            G0V<InterfaceC1516AkQ, InterfaceC1492Ajz, Unit> g0v = C1515AkP.A06;
            G0V g0vA19 = AnonymousClass004.A19(bfm, akqA04, g0v, iA02);
            G0U<InterfaceC1516AkQ, Unit> g0u = C1515AkP.A02;
            G0V g0vA0u = AnonymousClass002.A0u(bfm, bRgA01, g0u);
            long jTaskStatusColor = taskStatusColor(activityDetailTask.status);
            BS0 bs0 = BRg.A00;
            C1b8.A04(bfm, C11U.A02(C3U4.A04(bs0, 4.0f), 8.0f), jTaskStatusColor);
            InterfaceC1380AiA interfaceC1380AiAA0U = AnonymousClass002.A0U(bfm);
            int iA0D = AnonymousClass001.A0D(bbi);
            AKQ akqA042 = BBI.A04(bbi);
            BRg bRgA012 = AxM.A01(bfm, bs0);
            AnonymousClass005.A0n(bfm, bbi, function0);
            BPg.A02(bfm, interfaceC1380AiAA0U, g0vA0v);
            BPg.A02(bfm, akqA042, g0v);
            AnonymousClass003.A15(g0u, g0vA19, bfm, iA0D);
            BPg.A02(bfm, bRgA012, g0vA0u);
            String str = activityDetailTask.label;
            if (str == null) {
                str = GCH.__redex_internal_original_name;
            }
            AuraTheme auraTheme = AuraTheme.INSTANCE;
            AuraTextKt.m2639AuraTextUY9GdpU(str, null, C3cH.A06(bfm, auraTheme), C3cH.A0E(bfm, auraTheme), null, null, null, false, 0, 0, 0, null, null, null, bfm, 0, 0, 16370);
            String str2 = activityDetailTask.responsePreview;
            if (str2 == null || C7BY.A0j(str2)) {
                bfm.AgE(1391966150);
            } else {
                AuraTextKt.m2639AuraTextUY9GdpU(str2, null, C3cH.A07(bfm, auraTheme), C3cH.A0X(bfm, auraTheme, 1391782351).footnoteRegular, null, null, null, false, 0, 2, 0, null, null, null, bfm, 805306368, 0, 15858);
            }
            BBI.A0R(bbi, false);
            AnonymousClass002.A0y(bbi);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C140362(activityDetailTask, bRg2, i, i2);
        }
    }

    public static final void TitleSection(ActivityAction activityAction, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRgA00;
        AuraIconSize auraIconSize;
        BRg bRgA07;
        BRg bRg2 = bRg;
        bfm.AgG(-1599110334);
        int iA0T = (i & 6) == 0 ? AnonymousClass004.A0T(bfm, activityAction) | i : i;
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
            HatchFileUIUtils hatchFileUIUtils = HatchFileUIUtils.INSTANCE;
            int i4 = (iA0T & 14) | 48;
            long jM863getActivityActionIconColorXeAY9LY = hatchFileUIUtils.m863getActivityActionIconColorXeAY9LY(activityAction, bfm, i4);
            int activityActionIconRes = hatchFileUIUtils.getActivityActionIconRes(activityAction, bfm, i4);
            BRg bRgA0R = AnonymousClass001.A0R(bRg2);
            InterfaceC1380AiA interfaceC1380AiAA00 = C0A8.A00(AcQ.A01, bfm, C2VU.A05, 48);
            BBI bbi = (BBI) bfm;
            int iA02 = C3cG.A02(bbi.A06);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA0R);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function0);
            G0V g0vA0v = C3cH.A0v(bfm, interfaceC1380AiAA00);
            G0V<InterfaceC1516AkQ, InterfaceC1492Ajz, Unit> g0v = C1515AkP.A06;
            G0V g0vA19 = AnonymousClass004.A19(bfm, akqA04, g0v, iA02);
            G0U<InterfaceC1516AkQ, Unit> g0u = C1515AkP.A02;
            G0V g0vA0u = AnonymousClass002.A0u(bfm, bRgA01, g0u);
            C90m c90m = C90m.A00;
            boolean zA1W = C60Q.A1W(HatchFileUIUtils.SELF_COLORED_ICONS, activityActionIconRes);
            BS0 bs0 = BRg.A00;
            float f = ActivityScreenKt.ActivityIconSize;
            BRg bRgA072 = C10G.A07(bs0, f);
            if (zA1W) {
                bRgA00 = bs0;
            } else {
                long j = B6A.A01;
                float f2 = ActivityScreenKt.ActivityIconCornerRadius;
                bRgA00 = C1b8.A00(C11U.A01(C1DI.A02(bs0, C1D8.A00(f2), 1.0f, 218103808 << 32), f2), 0.15f, jM863getActivityActionIconColorXeAY9LY);
            }
            BRg bRgThen = bRgA072.then(bRgA00);
            InterfaceC1380AiA interfaceC1380AiAA0a = AnonymousClass001.A0a();
            int iA0D = AnonymousClass001.A0D(bbi);
            AKQ akqA042 = BBI.A04(bbi);
            BRg bRgA012 = AxM.A01(bfm, bRgThen);
            AnonymousClass005.A0n(bfm, bbi, function0);
            BPg.A02(bfm, interfaceC1380AiAA0a, g0vA0v);
            BPg.A02(bfm, akqA042, g0v);
            AnonymousClass003.A15(g0u, g0vA19, bfm, iA0D);
            BPg.A02(bfm, bRgA012, g0vA0u);
            AVy aVyA00 = BOf.A00(bfm, activityActionIconRes, 0);
            if (zA1W) {
                jM863getActivityActionIconColorXeAY9LY = B6A.A07;
                auraIconSize = AuraIconSize.LARGE;
                bRgA07 = C10G.A07(bs0, f);
            } else {
                auraIconSize = AuraIconSize.SMALL_MEDIUM;
                bRgA07 = bs0;
            }
            AuraIconKt.m2567AuraIconFHprtrg(bRgA07, aVyA00, auraIconSize, null, jM863getActivityActionIconColorXeAY9LY, null, bfm, (AVy.$stable << 3) | 3072, 32);
            BBI.A0R(bbi, true);
            C01N.A07(bfm, C10G.A08(bs0, 12.0f));
            BRg bRgA0O = AnonymousClass001.A0O(c90m, bs0, true);
            InterfaceC1380AiA interfaceC1380AiAA0U = AnonymousClass002.A0U(bfm);
            int iA0D2 = AnonymousClass001.A0D(bbi);
            AKQ akqA043 = BBI.A04(bbi);
            BRg bRgA013 = AxM.A01(bfm, bRgA0O);
            AnonymousClass005.A0n(bfm, bbi, function0);
            BPg.A02(bfm, interfaceC1380AiAA0U, g0vA0v);
            BPg.A02(bfm, akqA043, g0v);
            AnonymousClass003.A15(g0u, g0vA19, bfm, iA0D2);
            BPg.A02(bfm, bRgA013, g0vA0u);
            String actionTitle = hatchFileUIUtils.getActionTitle(activityAction);
            AuraTheme auraTheme = AuraTheme.INSTANCE;
            AuraTextKt.m2639AuraTextUY9GdpU(actionTitle, null, C3cH.A06(bfm, auraTheme), auraTheme.getTypography(bfm, 6).title3Emphasized, null, null, null, false, 0, 0, 0, null, null, null, bfm, 0, 0, 16370);
            C01N.A08(bfm, bs0, 2.0f);
            AuraTextKt.m2639AuraTextUY9GdpU(formatTimestamp(activityAction.timestamp, bfm, 0), null, C3cH.A05(bfm, auraTheme), C3cH.A0E(bfm, auraTheme), null, null, null, false, 0, 0, 0, null, null, null, bfm, 0, 0, 16370);
            BBI.A0R(bbi, true);
            BBI.A0R(bbi, true);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C140372(activityAction, bRg2, i, i2);
        }
    }

    public static final HxE<Integer, B6A> getFileStatusIconAndColor(String str) {
        Integer numValueOf;
        long j;
        int i;
        String upperCase = str.toUpperCase(Locale.ROOT);
        int iHashCode = upperCase.hashCode();
        if (iHashCode == 65) {
            if (upperCase.equals("A")) {
                numValueOf = Integer.valueOf(R.drawable.meta_ai_icons_plus_medium_cropped);
                j = 4280660313L;
                return C3cG.A0r(numValueOf, C60P.A04(j << 32));
            }
            i = R.drawable.two_lines_vertical_rectangle_missing_corner_outline_24;
        } else if (iHashCode != 68) {
            if (iHashCode != 77) {
                if (iHashCode == 82) {
                    boolean zEquals = upperCase.equals("R");
                    i = R.drawable.meta_brand_design_system_icons_vector_caret_right_outline_24;
                    if (!zEquals) {
                    }
                }
                return C3cG.A0r(numValueOf, C60P.A04(j << 32));
            }
            if (upperCase.equals("M")) {
                numValueOf = Integer.valueOf(R.drawable.two_lines_vertical_rectangle_missing_corner_outline_24);
                j = 4286276095L;
                return C3cG.A0r(numValueOf, C60P.A04(j << 32));
            }
            i = R.drawable.two_lines_vertical_rectangle_missing_corner_outline_24;
        } else {
            if (upperCase.equals("D")) {
                numValueOf = Integer.valueOf(R.drawable.trash_wght400_outline_24);
                j = 4292232517L;
                return C3cG.A0r(numValueOf, C60P.A04(j << 32));
            }
            i = R.drawable.two_lines_vertical_rectangle_missing_corner_outline_24;
        }
        numValueOf = Integer.valueOf(i);
        j = 4285164144L;
        return C3cG.A0r(numValueOf, C60P.A04(j << 32));
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x001a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.BRg rememberActivityItemSheetImpression(java.lang.String r16, X.BFM r17, int r18) {
        /*
            r1 = r18
            r4 = r16
            int r0 = X.AnonymousClass006.A0E(r4, r1)
            r0 = r0 ^ 6
            r2 = 4
            r3 = r17
            if (r0 <= r2) goto L15
            boolean r0 = r3.A65(r4)
            if (r0 != 0) goto L1a
        L15:
            r0 = r18 & 6
            r1 = 0
            if (r0 != r2) goto L1b
        L1a:
            r1 = 1
        L1b:
            java.lang.Object r0 = r3.AaT()
            if (r1 != 0) goto L25
            java.lang.Object r1 = X.C78N.A00
            if (r0 != r1) goto L4c
        L25:
            X.BS0 r4 = X.BRg.A00
            com.facebook.aura.analytics.hatch.HatchOrigin r5 = com.facebook.aura.analytics.hatch.HatchOrigin.STATUS
            com.facebook.aura.analytics.hatch.HatchSurface r6 = com.facebook.aura.analytics.hatch.HatchSurface.STATUS
            com.facebook.aura.analytics.hatch.HatchSubsurface r7 = com.facebook.aura.analytics.hatch.HatchSubsurface.BOT_SHEET_CONTENT
            com.facebook.aura.analytics.hatch.HatchScreen r8 = com.facebook.aura.analytics.hatch.HatchScreen.BOT_SHEET
            com.facebook.aura.analytics.hatch.HatchComponent r9 = com.facebook.aura.analytics.hatch.HatchComponent.ACTIVITY_ITEM
            long r0 = android.os.SystemClock.elapsedRealtimeNanos()
            java.lang.String r2 = "activity_item_sheet:"
            java.lang.String r16 = X.FGI.A0B(r0, r2)
            r10 = 0
            r13 = 500(0x1f4, double:2.47E-321)
            r15 = 0
            r11 = r10
            r12 = r10
            r17 = r10
            r18 = r10
            X.BRg r0 = com.facebook.aura.analytics.hatch.HatchImpressionModifierKt.hatchImpression(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r15, r16, r17, r18)
            r3.Ai0(r0)
        L4c:
            X.BRg r0 = (X.BRg) r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.status.view.ActivityDetailBottomSheetKt.rememberActivityItemSheetImpression(java.lang.String, X.BFM, int):X.BRg");
    }

    public static final String formatTimestamp(Date date, BFM bfm, int i) {
        int i2;
        Object[] objArr;
        Locale locale = Locale.getDefault();
        Calendar calendar = Calendar.getInstance(locale);
        TimeZone timeZone = calendar.getTimeZone();
        Object objClone = calendar.clone();
        C7384Etj.A0Z(objClone, "null cannot be cast to non-null type java.util.Calendar");
        Calendar calendar2 = (Calendar) objClone;
        calendar.setTime(date);
        boolean zA1R = AnonymousClass005.A1R(bfm, date, locale, timeZone);
        Object objAaT = bfm.AaT();
        if (zA1R || objAaT == C78N.A00) {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("h:mm a", locale);
            simpleDateFormat.setTimeZone(timeZone);
            objAaT = simpleDateFormat.format(date);
            bfm.Ai0(objAaT);
        }
        if (isSameDay(calendar, calendar2)) {
            bfm.AgE(752947290);
            i2 = R.string._name_removed__res_0x7f120047;
        } else {
            if (!isYesterday(calendar, calendar2)) {
                bfm.AgE(753159547);
                boolean zA1R2 = AnonymousClass005.A1R(bfm, date, locale, timeZone);
                Object objAaT2 = bfm.AaT();
                if (zA1R2 || objAaT2 == C78N.A00) {
                    SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("MMM d", locale);
                    simpleDateFormat2.setTimeZone(timeZone);
                    objAaT2 = simpleDateFormat2.format(date);
                    bfm.Ai0(objAaT2);
                }
                i2 = R.string._name_removed__res_0x7f120046;
                C7384Etj.A0X(objAaT2);
                C7384Etj.A0X(objAaT);
                objArr = new Object[]{objAaT2, objAaT};
                String strA02 = AbstractC2271BQs.A02(bfm, objArr, i2);
                AnonymousClass001.A1D(bfm);
                return strA02;
            }
            bfm.AgE(753060502);
            i2 = R.string._name_removed__res_0x7f120048;
        }
        C7384Etj.A0X(objAaT);
        objArr = new Object[]{objAaT};
        String strA022 = AbstractC2271BQs.A02(bfm, objArr, i2);
        AnonymousClass001.A1D(bfm);
        return strA022;
    }

    public static final HxE<B6A, String> getStatusBadgeInfo(ActivityAction.ActivityStatus activityStatus, BFM bfm, int i) {
        int i2;
        B6A b6aA04;
        int i3;
        int iOrdinal = activityStatus.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 2) {
                bfm.AgE(1910790272);
                b6aA04 = C60P.A04(HatchFileUIUtils.StatusColors.ERROR_RED);
                i3 = R.string._name_removed__res_0x7f12003c;
            } else if (iOrdinal != 3) {
                i2 = 1910800680;
                if (iOrdinal != 1) {
                    throw AnonymousClass005.A0k(bfm, 1910783355);
                }
            } else {
                bfm.AgE(1910795367);
                b6aA04 = C60P.A04(HatchFileUIUtils.StatusColors.PARTIAL_ORANGE);
                i3 = R.string._name_removed__res_0x7f12003d;
            }
            HxE<B6A, String> hxEA0r = C3cG.A0r(b6aA04, AbstractC2271BQs.A01(bfm, i3));
            AnonymousClass001.A1D(bfm);
            return hxEA0r;
        }
        i2 = 1910785000;
        bfm.AgE(i2);
        b6aA04 = C60P.A04(HatchFileUIUtils.StatusColors.SUCCESS_GREEN);
        i3 = R.string._name_removed__res_0x7f12003b;
        HxE<B6A, String> hxEA0r2 = C3cG.A0r(b6aA04, AbstractC2271BQs.A01(bfm, i3));
        AnonymousClass001.A1D(bfm);
        return hxEA0r2;
    }

    public static final boolean isYesterday(Calendar calendar, Calendar calendar2) {
        Object objClone = calendar2.clone();
        C7384Etj.A0Z(objClone, "null cannot be cast to non-null type java.util.Calendar");
        Calendar calendar3 = (Calendar) objClone;
        calendar3.add(6, -1);
        return isSameDay(calendar, calendar3);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:5:0x000b. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:12:0x001f  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0030  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final long taskStatusColor(java.lang.String r4) {
        /*
            r2 = 4280660313(0xff25b159, double:2.114927202E-314)
            if (r4 == 0) goto Le
            int r0 = r4.hashCode()
            switch(r0) {
                case -1281977283: goto L25;
                case -682587753: goto L14;
                case 96784904: goto L28;
                case 1550783935: goto L17;
                default: goto Le;
            }
        Le:
            r0 = 32
            long r2 = r2 << r0
            long r0 = X.B6A.A01
            return r2
        L14:
            java.lang.String r0 = "pending"
            goto L19
        L17:
            java.lang.String r0 = "running"
        L19:
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto Le
            r2 = 4294942474(0xffff9f0a, double:2.1219835273E-314)
            goto Le
        L25:
            java.lang.String r0 = "failed"
            goto L2a
        L28:
            java.lang.String r0 = "error"
        L2a:
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto Le
            r2 = 4292232517(0xffd64545, double:2.1206446306E-314)
            goto Le
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.status.view.ActivityDetailBottomSheetKt.taskStatusColor(java.lang.String):long");
    }
}
