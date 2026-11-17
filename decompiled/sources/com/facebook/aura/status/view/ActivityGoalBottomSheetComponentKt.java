package com.facebook.aura.status.view;

import X.AHD;
import X.AKQ;
import X.AVy;
import X.AYD;
import X.AbstractC07539Wl;
import X.AbstractC0878AGe;
import X.AbstractC0885AGm;
import X.AbstractC1103AYp;
import X.AbstractC1996Aw5;
import X.AbstractC2139Az7;
import X.AbstractC2159Azp;
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
import X.AnonymousClass007;
import X.AnonymousClass011;
import X.AxM;
import X.B1V;
import X.B6A;
import X.B81;
import X.BBI;
import X.BBb;
import X.BFM;
import X.BGR;
import X.BOD;
import X.BOf;
import X.BPg;
import X.BRg;
import X.BS0;
import X.C00x;
import X.C01N;
import X.C06827l3;
import X.C06I;
import X.C07C;
import X.C0881AGi;
import X.C0A8;
import X.C0Ig;
import X.C0dx;
import X.C0lh;
import X.C0v5;
import X.C0xs;
import X.C0zJ;
import X.C1062ATq;
import X.C10G;
import X.C1110AYw;
import X.C11U;
import X.C1515AkP;
import X.C1736ApY;
import X.C1804ArN;
import X.C1822Arm;
import X.C1831Arv;
import X.C19U;
import X.C1AC;
import X.C1BO;
import X.C1DM;
import X.C1OM;
import X.C1YD;
import X.C1b8;
import X.C2CK;
import X.C2VU;
import X.C3IL;
import X.C3TH;
import X.C3U4;
import X.C3UM;
import X.C3UX;
import X.C3cG;
import X.C3cH;
import X.C5wL;
import X.C60O;
import X.C60P;
import X.C60Q;
import X.C60R;
import X.C6tn;
import X.C7384Etj;
import X.C78N;
import X.C7BY;
import X.C90l;
import X.C90m;
import X.C9m9;
import X.F60;
import X.FGI;
import X.G0U;
import X.G0V;
import X.G0W;
import X.GCH;
import X.HDi;
import X.HwV;
import X.HxE;
import X.HxS;
import X.InterfaceC04981Yd;
import X.InterfaceC1185Ado;
import X.InterfaceC1380AiA;
import X.InterfaceC1492Ajz;
import X.InterfaceC1516AkQ;
import X.InterfaceC7353EnQ;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.R;
import com.facebook.aura.analytics.hatch.HatchComponent;
import com.facebook.aura.analytics.hatch.HatchInteractionLogger;
import com.facebook.aura.analytics.hatch.HatchScreen;
import com.facebook.aura.analytics.hatch.HatchSubsurface;
import com.facebook.aura.analytics.hatch.HatchSurface;
import com.facebook.aura.file.utils.HatchFileUIUtils;
import com.facebook.aura.markdown.render.BulletMarkerKt;
import com.facebook.aura.pairs.PairsDiscretionDocument;
import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;
import com.facebook.aura.status.repo.ActivityAction;
import com.facebook.aura.status.repo.ActivityDataSourceKt;
import com.facebook.aura.status.repo.ActivityDetailItem;
import com.facebook.aura.status.repo.ActivityDetailTask;
import com.facebook.aura.status.repo.ActivityDetails;
import com.facebook.aura.status.repo.ActivityFile;
import com.facebook.aura.status.repo.ActivityGoal;
import com.facebook.aura.status.repo.ActivityGoalAction;
import com.facebook.aura.status.repo.ActivityTimestampParserKt;
import com.facebook.aura.status.view.GoalBottomSheetDestination;
import com.facebook.aura.status.viewmodel.GoalStepsViewModel;
import com.facebook.aura.ui.HatchMarkdownTextKt;
import com.facebook.aura.vds.compose.base.AuraDimensKt;
import com.facebook.aura.vds.compose.bottomsheet.AuraInlineBottomSheetKt;
import com.facebook.aura.vds.compose.bottomsheet.state.AuraSheetState;
import com.facebook.aura.vds.compose.bottomsheet.state.RememberAuraBottomSheetStateKt;
import com.facebook.aura.vds.compose.icons.AuraIconButtonBackground;
import com.facebook.aura.vds.compose.icons.AuraIconButtonKt;
import com.facebook.aura.vds.compose.icons.AuraIconButtonSizeV2;
import com.facebook.aura.vds.compose.icons.AuraIconButtonStyle;
import com.facebook.aura.vds.compose.icons.AuraIconKt;
import com.facebook.aura.vds.compose.icons.AuraIconSize;
import com.facebook.aura.vds.compose.spinner.AuraSpinnerKt;
import com.facebook.aura.vds.compose.tag.AuraStatusTagKt;
import com.facebook.aura.vds.compose.text.AuraTextKt;
import com.facebook.aura.vds.compose.theme.AuraTheme;
import com.facebook.common.dextricks.RuntimeInternals;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.webrtc.HardwareVideoEncoderFactory;

/* loaded from: classes3.dex */
public abstract class ActivityGoalBottomSheetComponentKt {

    /* renamed from: com.facebook.aura.status.view.ActivityGoalBottomSheetComponentKt$ActivityGoalBottomSheetComponent$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0W<C07C, BFM, Integer, Unit> {
        public final /* synthetic */ ActivityAction $action;
        public final /* synthetic */ String $actionKey;
        public final /* synthetic */ BRg $impression;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ AuraSheetState $sheetState;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(ActivityAction activityAction, String str, AuraSheetState auraSheetState, BRg bRg, BRg bRg2) {
            super(3);
            this.$action = activityAction;
            this.$actionKey = str;
            this.$sheetState = auraSheetState;
            this.$modifier = bRg;
            this.$impression = bRg2;
        }

        public final void invoke(C07C c07c, BFM bfm, int i) {
            if (AnonymousClass001.A1b(AnonymousClass004.A1G(i), bfm, i)) {
                ActivityGoalBottomSheetComponentKt.ActivityGoalBottomSheetContent(this.$action, this.$actionKey, this.$sheetState, AbstractC07539Wl.A00(this.$modifier, "hatch-goal-bottom-sheet").then(this.$impression), bfm, 0, 0);
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

    /* renamed from: com.facebook.aura.status.view.ActivityGoalBottomSheetComponentKt$ActivityGoalBottomSheetComponent$2, reason: invalid class name */
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
            ActivityGoalBottomSheetComponentKt.ActivityGoalBottomSheetComponent(this.$action, this.$onDismiss, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.status.view.ActivityGoalBottomSheetComponentKt$ActivityGoalBottomSheetContent$3, reason: invalid class name */
    public final class AnonymousClass3 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ ActivityAction $action;
        public final /* synthetic */ String $actionKey;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ AuraSheetState $sheetState;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(ActivityAction activityAction, String str, AuraSheetState auraSheetState, BRg bRg, int i, int i2) {
            super(2);
            this.$action = activityAction;
            this.$actionKey = str;
            this.$sheetState = auraSheetState;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            ActivityGoalBottomSheetComponentKt.ActivityGoalBottomSheetContent(this.$action, this.$actionKey, this.$sheetState, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.status.view.ActivityGoalBottomSheetComponentKt$ErrorSection$2, reason: invalid class name and case insensitive filesystem */
    public final class C140382 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ String $error;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onRetry;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C140382(String str, Function0<Unit> function0, BRg bRg, int i, int i2) {
            super(2);
            this.$error = str;
            this.$onRetry = function0;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            ActivityGoalBottomSheetComponentKt.ErrorSection(this.$error, this.$onRetry, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.status.view.ActivityGoalBottomSheetComponentKt$FileRow$2, reason: invalid class name and case insensitive filesystem */
    public final class C140392 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ ActivityFile $file;
        public final /* synthetic */ BRg $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C140392(ActivityFile activityFile, BRg bRg, int i, int i2) {
            super(2);
            this.$file = activityFile;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            ActivityGoalBottomSheetComponentKt.FileRow(this.$file, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.status.view.ActivityGoalBottomSheetComponentKt$FilesSection$2, reason: invalid class name and case insensitive filesystem */
    public final class C140402 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ AHD<ActivityFile> $files;
        public final /* synthetic */ BRg $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C140402(AHD<ActivityFile> ahd, BRg bRg, int i, int i2) {
            super(2);
            this.$files = ahd;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            ActivityGoalBottomSheetComponentKt.FilesSection(this.$files, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.status.view.ActivityGoalBottomSheetComponentKt$FollowGoalStepUpdates$2, reason: invalid class name and case insensitive filesystem */
    public final class C140412 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ String $goalId;
        public final /* synthetic */ List<ActivityGoalAction> $previewSteps;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C140412(String str, List<ActivityGoalAction> list, int i) {
            super(2);
            this.$goalId = str;
            this.$previewSteps = list;
            this.$$changed = i;
        }

        public final void invoke(BFM bfm, int i) {
            ActivityGoalBottomSheetComponentKt.FollowGoalStepUpdates(this.$goalId, this.$previewSteps, bfm, AnonymousClass011.A00(this.$$changed));
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.status.view.ActivityGoalBottomSheetComponentKt$GoalActionConnectorLine$2, reason: invalid class name and case insensitive filesystem */
    public final class C140422 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C140422(BRg bRg, int i, int i2) {
            super(2);
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            ActivityGoalBottomSheetComponentKt.GoalActionConnectorLine(this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.status.view.ActivityGoalBottomSheetComponentKt$GoalActionIconColumn$2, reason: invalid class name and case insensitive filesystem */
    public final class C140432 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ boolean $showConnector;
        public final /* synthetic */ String $status;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C140432(String str, boolean z, BRg bRg, int i, int i2) {
            super(2);
            this.$status = str;
            this.$showConnector = z;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            ActivityGoalBottomSheetComponentKt.GoalActionIconColumn(this.$status, this.$showConnector, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.status.view.ActivityGoalBottomSheetComponentKt$GoalActionReportHeader$2, reason: invalid class name and case insensitive filesystem */
    public final class C140442 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onBack;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C140442(Function0<Unit> function0, BRg bRg, int i, int i2) {
            super(2);
            this.$onBack = function0;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            ActivityGoalBottomSheetComponentKt.GoalActionReportHeader(this.$onBack, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.status.view.ActivityGoalBottomSheetComponentKt$GoalActionReportMarkdown$1, reason: invalid class name and case insensitive filesystem */
    public final class C140451 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ String $report;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C140451(String str, BRg bRg, int i, int i2) {
            super(2);
            this.$report = str;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            ActivityGoalBottomSheetComponentKt.GoalActionReportMarkdown(this.$report, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.status.view.ActivityGoalBottomSheetComponentKt$GoalActionReportMarkdown$3, reason: invalid class name and case insensitive filesystem */
    public final class C140463 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ String $report;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C140463(String str, BRg bRg, int i, int i2) {
            super(2);
            this.$report = str;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            ActivityGoalBottomSheetComponentKt.GoalActionReportMarkdown(this.$report, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.status.view.ActivityGoalBottomSheetComponentKt$GoalActionReportPage$2, reason: invalid class name and case insensitive filesystem */
    public final class C140472 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ ActivityGoalAction $goalAction;
        public final /* synthetic */ String $lazyGoalId;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onBack;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C140472(ActivityGoalAction activityGoalAction, String str, Function0<Unit> function0, BRg bRg, int i, int i2) {
            super(2);
            this.$goalAction = activityGoalAction;
            this.$lazyGoalId = str;
            this.$onBack = function0;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            ActivityGoalBottomSheetComponentKt.GoalActionReportPage(this.$goalAction, this.$lazyGoalId, this.$onBack, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.status.view.ActivityGoalBottomSheetComponentKt$GoalActionRow$3, reason: invalid class name and case insensitive filesystem */
    public final class C140483 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ ActivityGoalAction $goalAction;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onClick;
        public final /* synthetic */ boolean $showConnector;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C140483(ActivityGoalAction activityGoalAction, boolean z, Function0<Unit> function0, BRg bRg, int i, int i2) {
            super(2);
            this.$goalAction = activityGoalAction;
            this.$showConnector = z;
            this.$onClick = function0;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            ActivityGoalBottomSheetComponentKt.GoalActionRow(this.$goalAction, this.$showConnector, this.$onClick, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.status.view.ActivityGoalBottomSheetComponentKt$GoalActionSectionHeader$1, reason: invalid class name and case insensitive filesystem */
    public final class C140491 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ String $label;
        public final /* synthetic */ BRg $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C140491(String str, BRg bRg, int i, int i2) {
            super(2);
            this.$label = str;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            ActivityGoalBottomSheetComponentKt.GoalActionSectionHeader(this.$label, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.status.view.ActivityGoalBottomSheetComponentKt$GoalActionSectionsSection$2, reason: invalid class name and case insensitive filesystem */
    public final class C140502 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ G0U<ActivityGoalAction, Unit> $onGoalActionClick;
        public final /* synthetic */ AHD<GoalActionSectionModel> $sections;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C140502(AHD<GoalActionSectionModel> ahd, G0U<? super ActivityGoalAction, Unit> g0u, BRg bRg, int i, int i2) {
            super(2);
            this.$sections = ahd;
            this.$onGoalActionClick = g0u;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            ActivityGoalBottomSheetComponentKt.GoalActionSectionsSection(this.$sections, this.$onGoalActionClick, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.status.view.ActivityGoalBottomSheetComponentKt$GoalActionTextColumn$2, reason: invalid class name and case insensitive filesystem */
    public final class C140512 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ ActivityGoalAction $goalAction;
        public final /* synthetic */ BRg $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C140512(ActivityGoalAction activityGoalAction, BRg bRg, int i, int i2) {
            super(2);
            this.$goalAction = activityGoalAction;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            ActivityGoalBottomSheetComponentKt.GoalActionTextColumn(this.$goalAction, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.status.view.ActivityGoalBottomSheetComponentKt$GoalFinalSummarySection$2, reason: invalid class name and case insensitive filesystem */
    public final class C140522 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ String $summary;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C140522(String str, BRg bRg, int i, int i2) {
            super(2);
            this.$summary = str;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            ActivityGoalBottomSheetComponentKt.GoalFinalSummarySection(this.$summary, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.status.view.ActivityGoalBottomSheetComponentKt$GoalFullBleedDivider$1, reason: invalid class name and case insensitive filesystem */
    /* loaded from: classes.dex */
    public final class C140531 extends AbstractC7559F3s implements G0W<C0Ig, BFM, Integer, Unit> {
        public final /* synthetic */ float $gutterWidth;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C140531(float f) {
            super(3);
            this.$gutterWidth = f;
        }

        @Override // X.G0W
        public /* bridge */ /* synthetic */ Unit invoke(C0Ig c0Ig, BFM bfm, Integer num) {
            invoke(c0Ig, bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(C0Ig c0Ig, BFM bfm, int i) {
            int iA0d = i;
            C7384Etj.A0Y(c0Ig, 0);
            if ((i & 6) == 0) {
                iA0d = i | AnonymousClass004.A0d(bfm, c0Ig);
            }
            if (AnonymousClass001.A1b(AnonymousClass004.A1H(iA0d), bfm, iA0d)) {
                BRg bRgA01 = AYD.A01(BRg.A00, -this.$gutterWidth, 0.0f);
                float fAHT = c0Ig.AHT() + (this.$gutterWidth * 2.0f);
                C0xs.A00(0.0f, AnonymousClass002.A0c(bfm).border, bRgA01.then(new C3UM(AbstractC2139Az7.A00, fAHT, Float.NaN, fAHT, Float.NaN, false)), bfm, 0, 2);
                return;
            }
            bfm.Afo();
        }
    }

    /* renamed from: com.facebook.aura.status.view.ActivityGoalBottomSheetComponentKt$GoalFullBleedDivider$2, reason: invalid class name and case insensitive filesystem */
    public final class C140542 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C140542(BRg bRg, int i, int i2) {
            super(2);
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            ActivityGoalBottomSheetComponentKt.GoalFullBleedDivider(this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.status.view.ActivityGoalBottomSheetComponentKt$GoalHeaderRow$2, reason: invalid class name and case insensitive filesystem */
    public final class C140552 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ ActivityAction $action;
        public final /* synthetic */ BRg $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C140552(ActivityAction activityAction, BRg bRg, int i, int i2) {
            super(2);
            this.$action = activityAction;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            ActivityGoalBottomSheetComponentKt.GoalHeaderRow(this.$action, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.status.view.ActivityGoalBottomSheetComponentKt$GoalHeaderTimeText$1, reason: invalid class name and case insensitive filesystem */
    public final class C140561 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ ActivityAction $action;
        public final /* synthetic */ BRg $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C140561(ActivityAction activityAction, BRg bRg, int i, int i2) {
            super(2);
            this.$action = activityAction;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            ActivityGoalBottomSheetComponentKt.GoalHeaderTimeText(this.$action, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.status.view.ActivityGoalBottomSheetComponentKt$GoalOverviewPage$3, reason: invalid class name and case insensitive filesystem */
    public final class C140573 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ ActivityAction $action;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ G0U<ActivityGoalAction, Unit> $onGoalActionClick;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C140573(ActivityAction activityAction, G0U<? super ActivityGoalAction, Unit> g0u, BRg bRg, int i, int i2) {
            super(2);
            this.$action = activityAction;
            this.$onGoalActionClick = g0u;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            ActivityGoalBottomSheetComponentKt.GoalOverviewPage(this.$action, this.$onGoalActionClick, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.status.view.ActivityGoalBottomSheetComponentKt$GoalSheetShowMoreRow$1, reason: invalid class name and case insensitive filesystem */
    public final class C140581 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ boolean $isLoading;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onClick;
        public final /* synthetic */ String $text;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C140581(String str, boolean z, Function0<Unit> function0, BRg bRg, int i, int i2) {
            super(2);
            this.$text = str;
            this.$isLoading = z;
            this.$onClick = function0;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            ActivityGoalBottomSheetComponentKt.GoalSheetShowMoreRow(this.$text, this.$isLoading, this.$onClick, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.status.view.ActivityGoalBottomSheetComponentKt$GoalSheetShowMoreRow$3, reason: invalid class name and case insensitive filesystem */
    public final class C140593 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ boolean $isLoading;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onClick;
        public final /* synthetic */ String $text;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C140593(String str, boolean z, Function0<Unit> function0, BRg bRg, int i, int i2) {
            super(2);
            this.$text = str;
            this.$isLoading = z;
            this.$onClick = function0;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            ActivityGoalBottomSheetComponentKt.GoalSheetShowMoreRow(this.$text, this.$isLoading, this.$onClick, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.status.view.ActivityGoalBottomSheetComponentKt$GoalStatusChip$1, reason: invalid class name and case insensitive filesystem */
    public final class C140601 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ ActivityAction.ActivityStatus $status;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C140601(ActivityAction.ActivityStatus activityStatus, BRg bRg, int i, int i2) {
            super(2);
            this.$status = activityStatus;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            ActivityGoalBottomSheetComponentKt.GoalStatusChip(this.$status, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.status.view.ActivityGoalBottomSheetComponentKt$GoalTitleSection$1, reason: invalid class name and case insensitive filesystem */
    public final class C140611 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ ActivityAction $action;
        public final /* synthetic */ BRg $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C140611(ActivityAction activityAction, BRg bRg, int i, int i2) {
            super(2);
            this.$action = activityAction;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            ActivityGoalBottomSheetComponentKt.GoalTitleSection(this.$action, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.status.view.ActivityGoalBottomSheetComponentKt$InlineDetailsSection$2, reason: invalid class name and case insensitive filesystem */
    public final class C140622 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ ActivityDetails $details;
        public final /* synthetic */ BRg $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C140622(ActivityDetails activityDetails, BRg bRg, int i, int i2) {
            super(2);
            this.$details = activityDetails;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            ActivityGoalBottomSheetComponentKt.InlineDetailsSection(this.$details, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.status.view.ActivityGoalBottomSheetComponentKt$LazyGoalActionReport$3, reason: invalid class name and case insensitive filesystem */
    public final class C140633 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ String $actionId;
        public final /* synthetic */ String $goalId;
        public final /* synthetic */ BRg $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C140633(String str, String str2, BRg bRg, int i, int i2) {
            super(2);
            this.$goalId = str;
            this.$actionId = str2;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            ActivityGoalBottomSheetComponentKt.LazyGoalActionReport(this.$goalId, this.$actionId, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.status.view.ActivityGoalBottomSheetComponentKt$LazyGoalActionSectionsSection$2, reason: invalid class name and case insensitive filesystem */
    public final class C140642 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ String $goalId;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ G0U<ActivityGoalAction, Unit> $onGoalActionClick;
        public final /* synthetic */ List<ActivityGoalAction> $previewSteps;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C140642(String str, List<ActivityGoalAction> list, G0U<? super ActivityGoalAction, Unit> g0u, BRg bRg, int i, int i2) {
            super(2);
            this.$goalId = str;
            this.$previewSteps = list;
            this.$onGoalActionClick = g0u;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            ActivityGoalBottomSheetComponentKt.LazyGoalActionSectionsSection(this.$goalId, this.$previewSteps, this.$onGoalActionClick, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.status.view.ActivityGoalBottomSheetComponentKt$LoadingSection$2, reason: invalid class name and case insensitive filesystem */
    public final class C140652 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C140652(BRg bRg, int i, int i2) {
            super(2);
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            ActivityGoalBottomSheetComponentKt.LoadingSection(this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.status.view.ActivityGoalBottomSheetComponentKt$StatusSection$2, reason: invalid class name and case insensitive filesystem */
    public final class C140662 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ ActivityAction $action;
        public final /* synthetic */ BRg $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C140662(ActivityAction activityAction, BRg bRg, int i, int i2) {
            super(2);
            this.$action = activityAction;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            ActivityGoalBottomSheetComponentKt.StatusSection(this.$action, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.status.view.ActivityGoalBottomSheetComponentKt$SubtitleSection$2, reason: invalid class name and case insensitive filesystem */
    public final class C140672 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ AHD<String> $highlights;
        public final /* synthetic */ boolean $isGoal;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ String $subtitle;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C140672(String str, AHD<String> ahd, BRg bRg, boolean z, int i, int i2) {
            super(2);
            this.$subtitle = str;
            this.$highlights = ahd;
            this.$modifier = bRg;
            this.$isGoal = z;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            ActivityGoalBottomSheetComponentKt.SubtitleSection(this.$subtitle, this.$highlights, this.$modifier, this.$isGoal, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.status.view.ActivityGoalBottomSheetComponentKt$TaskRow$2, reason: invalid class name and case insensitive filesystem */
    public final class C140682 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ ActivityDetailTask $task;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C140682(ActivityDetailTask activityDetailTask, BRg bRg, int i, int i2) {
            super(2);
            this.$task = activityDetailTask;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            ActivityGoalBottomSheetComponentKt.TaskRow(this.$task, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    public static final void GoalStatusChip(ActivityAction.ActivityStatus activityStatus, BRg bRg, BFM bfm, int i, int i2) {
        int i3;
        long jA04;
        BRg bRg2 = bRg;
        bfm.AgG(-1569196427);
        int iA08 = (i & 6) == 0 ? AnonymousClass005.A08(bfm, activityStatus) | i : i;
        int i4 = i2 & 2;
        if (i4 != 0) {
            iA08 |= 48;
        } else if ((i & 48) == 0) {
            iA08 |= AnonymousClass004.A0e(bfm, bRg);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1H(iA08), bfm, iA08)) {
            if (i4 != 0) {
                bRg2 = BRg.A00;
            }
            HxE<B6A, String> statusBadgeInfo = getStatusBadgeInfo(activityStatus, bfm, iA08 & 14);
            long j = statusBadgeInfo.first.A00;
            String str = statusBadgeInfo.second;
            if (activityStatus == ActivityAction.ActivityStatus.PENDING) {
                bfm.AgE(-464232822);
                AuraTheme auraTheme = AuraTheme.INSTANCE;
                j = auraTheme.getColors(bfm, 6).invertedButtonContent;
                BBI bbi = (BBI) bfm;
                i3 = 0;
                BBI.A0R(bbi, false);
                bfm.AgE(-464228563);
                jA04 = auraTheme.getColors(bfm, 6).invertedButtonBackground;
                BBI.A0R(bbi, false);
            } else {
                bfm.AgE(-464231968);
                BBI bbi2 = (BBI) bfm;
                i3 = 0;
                BBI.A0R(bbi2, false);
                bfm.AgE(-464226905);
                BBI.A0R(bbi2, false);
                jA04 = HxS.A04(HDi.A0O[(int) (j & 63)], B6A.A03(j), B6A.A02(j), B6A.A01(j), 0.1f);
            }
            AuraStatusTagKt.m2637AuraStatusTagRWsq2U(str, j, bRg2, jA04, bfm, (iA08 << 3) & 896, i3);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C140601(activityStatus, bRg2, i, i2);
        }
    }

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[GoalActionStatusKind.values().length];
            try {
                AnonymousClass005.A0v(GoalActionStatusKind.FINISHED, iArr, 1);
            } catch (NoSuchFieldError unused) {
            }
            try {
                AnonymousClass005.A0v(GoalActionStatusKind.FAILED, iArr, 2);
            } catch (NoSuchFieldError unused2) {
            }
            try {
                AnonymousClass005.A0v(GoalActionStatusKind.IN_PROGRESS, iArr, 3);
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[ActivityAction.ActivityStatus.values().length];
            try {
                AnonymousClass005.A0v(ActivityAction.ActivityStatus.SUCCESS, iArr2, 1);
            } catch (NoSuchFieldError unused4) {
            }
            try {
                AnonymousClass005.A0v(ActivityAction.ActivityStatus.ERROR, iArr2, 2);
            } catch (NoSuchFieldError unused5) {
            }
            try {
                AnonymousClass005.A0v(ActivityAction.ActivityStatus.PENDING, iArr2, 3);
            } catch (NoSuchFieldError unused6) {
            }
            try {
                AnonymousClass002.A16(ActivityAction.ActivityStatus.PARTIAL, iArr2);
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public static final void ActivityGoalBottomSheetComponent(ActivityAction activityAction, Function0<Unit> function0, BRg bRg, BFM bfm, int i, int i2) {
        String strA0l;
        ActivityGoal activityGoal;
        String str;
        BRg bRg2 = bRg;
        boolean zA1b = AnonymousClass004.A1b(activityAction, function0);
        bfm.AgG(1584857503);
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
            ActivityDetails activityDetails = activityAction.details;
            if (activityDetails == null || (activityGoal = activityDetails.goal) == null || (str = activityGoal.id) == null || (strA0l = AnonymousClass002.A0l(str)) == null || strA0l.length() <= 0) {
                strA0l = activityAction.id;
            }
            AuraSheetState auraSheetStateRememberAuraBottomSheetState = RememberAuraBottomSheetStateKt.rememberAuraBottomSheetState(zA1b, null, zA1b, bfm, 6, 6);
            AuraInlineBottomSheetKt.AuraInlineBottomSheet(null, null, function0, auraSheetStateRememberAuraBottomSheetState, null, null, null, null, null, null, zA1b, zA1b, zA1b, B1V.A00(bfm, new AnonymousClass1(activityAction, strA0l, auraSheetStateRememberAuraBottomSheetState, bRg2, ActivityDetailBottomSheetKt.rememberActivityItemSheetImpression(strA0l, bfm, zA1b ? 1 : 0)), 840643324), bfm, ((iA0T << 3) & 896) | RuntimeInternals.IOPRIO_BACKGROUND, 3072, 8163);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass2(activityAction, function0, bRg2, i, i2);
        }
    }

    public static final void ActivityGoalBottomSheetContent(ActivityAction activityAction, String str, AuraSheetState auraSheetState, BRg bRg, BFM bfm, int i, int i2) {
        List list;
        BRg bRg2 = bRg;
        bfm.AgG(688624163);
        int iA0T = (i & 6) == 0 ? AnonymousClass004.A0T(bfm, activityAction) | i : i;
        if ((i & 48) == 0) {
            iA0T |= AnonymousClass004.A0e(bfm, str);
        }
        if ((i & 384) == 0) {
            iA0T |= AnonymousClass004.A0f(bfm, auraSheetState);
        }
        int i3 = i2 & 8;
        if (i3 != 0) {
            iA0T |= 3072;
        } else if ((i & 3072) == 0) {
            iA0T |= AnonymousClass004.A0g(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1L(iA0T), bfm, iA0T)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            int i4 = iA0T & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX;
            boolean zA1Q = AnonymousClass002.A1Q(i4, 32);
            Object objAaT = bfm.AaT();
            if (zA1Q || objAaT == C78N.A00) {
                objAaT = AnonymousClass004.A11(bfm, GoalBottomSheetDestination.Overview.INSTANCE);
            }
            MutableState mutableState = (MutableState) objAaT;
            Object objAaT2 = bfm.AaT();
            Object obj = C78N.A00;
            C3UX c3ux = (C3UX) AnonymousClass004.A15(bfm, objAaT2, obj);
            boolean zA1Q2 = AnonymousClass002.A1Q(i4, 32);
            Object objAaT3 = bfm.AaT();
            if (zA1Q2 || objAaT3 == obj) {
                objAaT3 = AnonymousClass005.A0S(bfm, false);
            }
            MutableState mutableState2 = (MutableState) objAaT3;
            boolean zA1Q3 = AnonymousClass002.A1Q(i4, 32);
            Object objAaT4 = bfm.AaT();
            if (zA1Q3 || objAaT4 == obj) {
                objAaT4 = AnonymousClass005.A0S(bfm, false);
            }
            MutableState mutableState3 = (MutableState) objAaT4;
            int i5 = iA0T & 896;
            boolean zA1W = AnonymousClass002.A1W(bfm, mutableState3, bfm.A65(mutableState2), AnonymousClass002.A1Q(i5, 256));
            Object objAaT5 = bfm.AaT();
            if (zA1W || objAaT5 == obj) {
                objAaT5 = new ActivityGoalBottomSheetComponentKt$ActivityGoalBottomSheetContent$1$1(auraSheetState, mutableState2, mutableState3, null);
                bfm.Ai0(objAaT5);
            }
            AnonymousClass001.A18(bfm, objAaT5, str);
            boolean zA1S = AnonymousClass004.A1S(bfm, mutableState, c3ux, bfm.A65(mutableState3)) | AnonymousClass002.A1Q(i5, 256);
            Object objAaT6 = bfm.AaT();
            if (zA1S || objAaT6 == obj) {
                objAaT6 = new ActivityGoalBottomSheetComponentKt$ActivityGoalBottomSheetContent$onGoalActionClick$1$1(c3ux, mutableState3, mutableState, auraSheetState);
                bfm.Ai0(objAaT6);
            }
            G0U g0u = (G0U) objAaT6;
            boolean zA1S2 = AnonymousClass004.A1S(bfm, mutableState3, c3ux, bfm.A65(mutableState)) | AnonymousClass002.A1Q(i5, 256);
            Object objAaT7 = bfm.AaT();
            if (zA1S2 || objAaT7 == obj) {
                objAaT7 = new ActivityGoalBottomSheetComponentKt$ActivityGoalBottomSheetContent$closeReport$1$1(c3ux, mutableState, mutableState3, auraSheetState);
                bfm.Ai0(objAaT7);
            }
            Function0 function0 = (Function0) objAaT7;
            boolean z = mutableState.getValue() instanceof GoalBottomSheetDestination.Report;
            boolean zA65 = bfm.A65(function0);
            Object objAaT8 = bfm.AaT();
            if (zA65 || objAaT8 == obj) {
                objAaT8 = new ActivityGoalBottomSheetComponentKt$ActivityGoalBottomSheetContent$2$1(function0);
                bfm.Ai0(objAaT8);
            }
            B81.A00(z, (Function0) objAaT8, bfm, 0, 0);
            String strLazyGoalId = ActivityDataSourceKt.lazyGoalId(activityAction);
            if (strLazyGoalId != null) {
                bfm.AgE(2040942654);
                ActivityDetails activityDetails = activityAction.details;
                if (activityDetails == null || (list = activityDetails.goalActions) == null) {
                    list = C0881AGi.A00;
                }
                FollowGoalStepUpdates(strLazyGoalId, list, bfm, 0);
            } else {
                bfm.AgE(2041066623);
            }
            BBI bbiA07 = C3cG.A07(bfm);
            GoalBottomSheetDestination goalBottomSheetDestination = (GoalBottomSheetDestination) mutableState.getValue();
            if (C7384Etj.areEqual(goalBottomSheetDestination, GoalBottomSheetDestination.Overview.INSTANCE)) {
                bfm.AgE(342938910);
                GoalOverviewPage(activityAction, g0u, AnonymousClass001.A0R(bRg2), bfm, iA0T & 14, 0);
            } else {
                if (!(goalBottomSheetDestination instanceof GoalBottomSheetDestination.Report)) {
                    throw AnonymousClass003.A0k(bfm, bbiA07, 342936159);
                }
                bfm.AgE(342945610);
                GoalActionReportPage(((GoalBottomSheetDestination.Report) goalBottomSheetDestination).goalAction, strLazyGoalId, function0, AnonymousClass001.A0R(bRg2), bfm, 0, 0);
            }
            BBI.A0R(bbiA07, false);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass3(activityAction, str, auraSheetState, bRg2, i, i2);
        }
    }

    public static final void ErrorSection(String str, Function0<Unit> function0, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(-1486306779);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, str) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0U(bfm, function0);
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
            BRg bRgA06 = C3U4.A06(AnonymousClass001.A0R(bRg2), 8.0f);
            InterfaceC1380AiA interfaceC1380AiAA0J = AnonymousClass007.A0J(bfm);
            BBI bbi = (BBI) bfm;
            int iA02 = C3cG.A02(bbi.A06);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA06);
            Function0<InterfaceC1516AkQ> function02 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function02);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA0J, akqA04, bRgA01, iA02);
            AuraTheme auraTheme = AuraTheme.INSTANCE;
            C1822Arm c1822ArmA0E = C3cH.A0E(bfm, auraTheme);
            long j = HatchFileUIUtils.StatusColors.ERROR_RED;
            BS0 bs0 = BRg.A00;
            Object objAaT = bfm.AaT();
            Object obj = C78N.A00;
            if (objAaT == obj) {
                objAaT = ActivityGoalBottomSheetComponentKt$ErrorSection$1$1$1.INSTANCE;
                bfm.Ai0(objAaT);
            }
            AuraTextKt.m2639AuraTextUY9GdpU(str, AnonymousClass001.A0Y(bs0, objAaT, false), j, c1822ArmA0E, null, null, null, false, 0, 0, 0, null, null, null, bfm, iA0d & 14, 0, 16368);
            C01N.A05(bfm, bs0);
            String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f12092b);
            C1822Arm c1822ArmA0C = C60Q.A0C(bfm, auraTheme);
            long j2 = auraTheme.getColors(bfm, 6).link;
            BRg bRgA09 = C10G.A09(bs0, 48.0f, 48.0f);
            C1YD c1ydA0A = C3cG.A0A(0);
            boolean zA1C = AnonymousClass003.A1C(iA0d);
            Object objAaT2 = bfm.AaT();
            if (zA1C || objAaT2 == obj) {
                objAaT2 = new ActivityGoalBottomSheetComponentKt$ErrorSection$1$2$1(function0);
                bfm.Ai0(objAaT2);
            }
            AuraTextKt.m2639AuraTextUY9GdpU(strA01, C10G.A02(C2VU.A09, C0v5.A04(bRgA09, c1ydA0A, null, (Function0) objAaT2, true), false), j2, c1822ArmA0C, null, null, null, false, 0, 0, 0, null, null, null, bfm, 0, 0, 16368);
            BBI.A0R(bbi, true);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C140382(str, function0, bRg2, i, i2);
        }
    }

    public static final void FileRow(ActivityFile activityFile, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(-1420286788);
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
            bBbAAc.A06 = new C140392(activityFile, bRg2, i, i2);
        }
    }

    public static final void FilesSection(AHD<ActivityFile> ahd, BRg bRg, BFM bfm, int i, int i2) {
        String strA0t;
        BRg bRg2 = bRg;
        bfm.AgG(-2032289301);
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
                    bfm.AgE(1171622090);
                    strA0t = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120035);
                } else {
                    bfm.AgE(1171710688);
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
                Iterator itA0w = AnonymousClass001.A0w(bfm, ahd, 1387870924);
                int i4 = 0;
                while (itA0w.hasNext()) {
                    Object next = itA0w.next();
                    int i5 = i4 + 1;
                    if (i4 < 0) {
                        AbstractC0885AGm.A14();
                    } else {
                        FileRow((ActivityFile) next, null, bfm, 0, 2);
                        if (i4 < C60O.A00(ahd)) {
                            bfm.AgE(-1917495687);
                            C0xs.A00(0.0f, C60O.A01(bfm, auraTheme), C3U4.A0C(bs0, 34.0f, 0.0f, 0.0f, 0.0f), bfm, 6, 2);
                            BBI.A0R(bbi, false);
                        } else {
                            bfm.AgE(-1917331356);
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
            bBbAAc.A06 = new C140402(ahd, bRg2, i, i2);
        }
    }

    public static final void GoalActionIconColumn(String str, boolean z, BRg bRg, BFM bfm, int i, int i2) {
        Integer numValueOf;
        B6A b6aA04;
        int i3;
        BRg bRgA0Q = bRg;
        bfm.AgG(1244393296);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, str) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0o(bfm, z);
        }
        int i4 = i2 & 4;
        if (i4 != 0) {
            iA0d |= 384;
        } else if ((i & 384) == 0) {
            iA0d |= AnonymousClass004.A0f(bfm, bRgA0Q);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 147, 146), bfm, iA0d)) {
            if (i4 != 0) {
                bRgA0Q = BRg.A00;
            }
            BRg bRgA03 = C3U4.A03(C10G.A08(bRgA0Q, 20.0f).then(C10G.A00), 4.0f);
            InterfaceC1380AiA interfaceC1380AiAA0T = AnonymousClass006.A0T(bfm, C2VU.A00, 4.0f);
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
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA0T, akqA04, bRgA01, iA0J);
            C90l c90l = C90l.A00;
            int iOrdinal = GoalActionStatusKind.Companion.from(str).ordinal();
            if (iOrdinal == 0) {
                bfm.AgE(-1464565010);
                numValueOf = Integer.valueOf(HatchFileUIUtils.Icons.CHECKMARK);
                b6aA04 = C60P.A04(HatchFileUIUtils.StatusColors.SUCCESS_GREEN);
                i3 = R.string._name_removed__res_0x7f12003b;
            } else if (iOrdinal == 1) {
                bfm.AgE(-1464556443);
                numValueOf = Integer.valueOf(R.drawable.x_wght400_outline_24);
                b6aA04 = C60P.A04(HatchFileUIUtils.StatusColors.ERROR_RED);
                i3 = R.string._name_removed__res_0x7f12003c;
            } else {
                if (iOrdinal != 2) {
                    throw AnonymousClass003.A0k(bfm, bbi, -1464567563);
                }
                bfm.AgE(-1464547981);
                numValueOf = Integer.valueOf(R.drawable.ellipsis_wght400_outline_24);
                b6aA04 = C60P.A04(HatchFileUIUtils.StatusColors.PARTIAL_ORANGE);
                i3 = R.string._name_removed__res_0x7f12003d;
            }
            AuraIconKt.m2567AuraIconFHprtrg(null, BOf.A00(bfm, numValueOf.intValue(), 0), AuraIconSize.X_SMALL, AnonymousClass001.A0s(bfm, bbi, i3), b6aA04.A00, null, bfm, AnonymousClass001.A03(), 33);
            if (z) {
                GoalActionConnectorLine(c90l.AiP(C10G.A08(C3cG.A09(bfm, 1844073207), 1.0f), 1.0f, true), bfm, 0, 0);
            } else {
                bfm.AgE(1844151048);
            }
            bRgA0Q = AnonymousClass001.A0Q(bbi, bRgA0Q, false, true);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C140432(str, z, bRgA0Q, i, i2);
        }
    }

    public static final void GoalActionReportHeader(Function0<Unit> function0, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(2002716311);
        int iA0T = (i & 6) == 0 ? AnonymousClass004.A0T(bfm, function0) | i : i;
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
            BRg bRgA0C = C3U4.A0C(C3U4.A0B(AnonymousClass001.A0R(bRg2), C3cG.A00(bfm, AuraTheme.INSTANCE), 0.0f), 0.0f, 8.0f, 0.0f, 16.0f);
            InterfaceC1380AiA interfaceC1380AiAA0b = AnonymousClass001.A0b(AcQ.A03, bfm, C2VU.A04);
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
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA0b, akqA04, bRgA01, iA0J);
            AVy aVyA00 = BOf.A00(bfm, R.drawable.arrow_left_wght400_outline_24, 0);
            AuraIconButtonSizeV2 auraIconButtonSizeV2 = AuraIconButtonSizeV2.LARGE;
            AuraIconButtonStyle auraIconButtonStyle = AuraIconButtonStyle.PRIMARY;
            AuraIconButtonBackground auraIconButtonBackground = AuraIconButtonBackground.WITH_CIRCLE_BACKGROUND;
            String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f12118e);
            boolean zA1B = AnonymousClass003.A1B(iA0T);
            Object objAaT = bfm.AaT();
            if (zA1B || objAaT == C78N.A00) {
                objAaT = new ActivityGoalBottomSheetComponentKt$GoalActionReportHeader$1$1$1(function0);
                bfm.Ai0(objAaT);
            }
            AuraIconButtonKt.m2552AuraIconButtonV2imgtlEU(null, aVyA00, auraIconButtonSizeV2, auraIconButtonStyle, auraIconButtonBackground, null, strA01, (Function0) objAaT, null, false, null, null, null, null, bfm, (AVy.$stable << 3) | 28032, 0, 16161);
            C01N.A07(bfm, C10G.A07(BRg.A00, 44.0f));
            BBI.A0R(bbi, true);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C140442(function0, bRg2, i, i2);
        }
    }

    public static final void GoalActionReportMarkdown(String str, BRg bRg, BFM bfm, int i, int i2) {
        BBb bBbAAc;
        Object c140463;
        BRg bRg2 = bRg;
        bfm.AgG(-1606661952);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, str) | i : i;
        int i3 = i2 & 2;
        if (i3 != 0) {
            iA0d |= 48;
        } else if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0e(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 19, 18), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            boolean zA1B = AnonymousClass003.A1B(iA0d);
            Object objAaT = bfm.AaT();
            if (zA1B || objAaT == C78N.A00) {
                objAaT = normalizeGoalActionReport(str);
                bfm.Ai0(objAaT);
            }
            String str2 = (String) objAaT;
            if (C7BY.A0j(str2)) {
                bBbAAc = bfm.AAc();
                if (bBbAAc != null) {
                    c140463 = new C140451(str, bRg2, i, i2);
                    C3cG.A1D(bBbAAc, c140463);
                }
                return;
            }
            C1062ATq c1062ATq = C10G.A02;
            BRg bRgThen = bRg2.then(c1062ATq);
            InterfaceC1380AiA interfaceC1380AiAA0U = AnonymousClass002.A0U(bfm);
            BBI bbi = (BBI) bfm;
            int iA0J = AnonymousClass003.A0J(bbi);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgThen);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function0);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA0U, akqA04, bRgA01, iA0J);
            C01N.A00(bfm, BRg.A00, 24.0f);
            AuraTheme auraTheme = AuraTheme.INSTANCE;
            HatchMarkdownTextKt.m2319HatchMarkdownTextT042LqI(str2, c1062ATq, C3cH.A06(bfm, auraTheme), C1822Arm.A00(null, C3cH.A0B(bfm, auraTheme), null, null, null, null, null, null, null, null, 0, 0, 0, 16646015, 0L, 0L, C19U.A03(0), C19U.A03(21)), null, bfm, 48, 16);
            BBI.A0R(bbi, true);
        } else {
            bfm.Afo();
        }
        bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            c140463 = new C140463(str, bRg2, i, i2);
            C3cG.A1D(bBbAAc, c140463);
        }
    }

    public static final void GoalActionReportPage(ActivityGoalAction activityGoalAction, String str, Function0<Unit> function0, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(-669835908);
        int iA0T = (i & 6) == 0 ? AnonymousClass004.A0T(bfm, activityGoalAction) | i : i;
        if ((i & 48) == 0) {
            iA0T |= AnonymousClass004.A0e(bfm, str);
        }
        if ((i & 384) == 0) {
            iA0T |= AnonymousClass004.A0V(bfm, function0);
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
            C1110AYw c1110AYwA00 = AbstractC1103AYp.A00(0, bfm, 0, 1);
            String str2 = activityGoalAction.subtitle;
            String strA0l = str2 != null ? AnonymousClass002.A0l(str2) : null;
            if (strA0l == null) {
                strA0l = "";
            }
            boolean zA0j = C7BY.A0j(strA0l);
            String str3 = activityGoalAction.id;
            C1062ATq c1062ATq = C10G.A02;
            BRg bRgThen = bRg2.then(c1062ATq).then(C10G.A00);
            InterfaceC1185Ado interfaceC1185Ado = AcQ.A06;
            C3TH c3th = C2VU.A02;
            InterfaceC1380AiA interfaceC1380AiAA00 = C06I.A00(interfaceC1185Ado, bfm, c3th, 0);
            BBI bbi = (BBI) bfm;
            int iA02 = C3cG.A02(bbi.A06);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgThen);
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
            C90l c90l = C90l.A00;
            GoalActionReportHeader(function0, null, bfm, (iA0T >> 6) & 14, 2);
            BS0 bs0 = BRg.A00;
            BRg bRgA0C = C3U4.A0C(AbstractC1103AYp.A02(c1110AYwA00, c90l.AiP(c1062ATq, 1.0f, true), true), 0.0f, 0.0f, 0.0f, AuraDimensKt.SpacingMedium);
            InterfaceC1380AiA interfaceC1380AiAA002 = C06I.A00(interfaceC1185Ado, bfm, c3th, 0);
            int iA0D = AnonymousClass001.A0D(bbi);
            AKQ akqA042 = BBI.A04(bbi);
            BRg bRgA012 = AxM.A01(bfm, bRgA0C);
            AnonymousClass005.A0n(bfm, bbi, function02);
            BPg.A02(bfm, interfaceC1380AiAA002, g0vA0v);
            BPg.A02(bfm, akqA042, g0v);
            AnonymousClass003.A15(g0u, g0vA19, bfm, iA0D);
            BPg.A02(bfm, bRgA012, g0vA0u);
            AuraTheme auraTheme = AuraTheme.INSTANCE;
            BRg bRgA0B = C3U4.A0B(c1062ATq, C3cG.A00(bfm, auraTheme), 0.0f);
            InterfaceC1380AiA interfaceC1380AiAA003 = C06I.A00(interfaceC1185Ado, bfm, c3th, 0);
            int iA0D2 = AnonymousClass001.A0D(bbi);
            AKQ akqA043 = BBI.A04(bbi);
            BRg bRgA013 = AxM.A01(bfm, bRgA0B);
            AnonymousClass005.A0n(bfm, bbi, function02);
            BPg.A02(bfm, interfaceC1380AiAA003, g0vA0v);
            BPg.A02(bfm, akqA043, g0v);
            AnonymousClass003.A15(g0u, g0vA19, bfm, iA0D2);
            BPg.A02(bfm, bRgA013, g0vA0u);
            String str4 = activityGoalAction.title;
            if (str4 == null) {
                str4 = "";
            }
            AuraTextKt.m2639AuraTextUY9GdpU(str4, c1062ATq, C3cH.A06(bfm, auraTheme), auraTheme.getTypography(bfm, 6).title3Emphasized, null, null, null, false, 0, 0, 0, null, null, null, bfm, 48, 0, 16368);
            if (zA0j) {
                bfm.AgE(1850211396);
                BBI.A0R(bbi, false);
            } else {
                bfm.AgE(1849806815);
                C01N.A08(bfm, bs0, 12.0f);
                AuraTextKt.m2639AuraTextUY9GdpU(strA0l, c1062ATq, C3cH.A06(bfm, auraTheme), C1822Arm.A00(null, C3cH.A0B(bfm, auraTheme), null, null, null, null, null, null, null, null, 0, 0, 0, 16646015, 0L, 0L, C19U.A03(0), C19U.A03(21)), null, null, null, false, 0, 0, 0, null, null, null, bfm, 48, 0, 16368);
                BBI.A0R(bbi, false);
            }
            if (str == null || str3 == null || !activityGoalAction.hasReport) {
                bfm.AgE(1850380656);
                String str5 = activityGoalAction.report;
                if (str5 == null) {
                    str5 = "";
                }
                GoalActionReportMarkdown(str5, null, bfm, 0, 2);
            } else {
                bfm.AgE(1850291376);
                LazyGoalActionReport(str, str3, null, bfm, (iA0T >> 3) & 14, 4);
            }
            AnonymousClass002.A10(bbi, false, true);
            BBI.A0R(bbi, true);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C140472(activityGoalAction, str, function0, bRg2, i, i2);
        }
    }

    public static final void GoalActionRow(ActivityGoalAction activityGoalAction, boolean z, Function0<Unit> function0, BRg bRg, BFM bfm, int i, int i2) {
        BBI bbiA0M;
        BRg bRgA04;
        BRg bRgA09;
        BRg bRg2 = bRg;
        bfm.AgG(-566775686);
        int iA0T = (i & 6) == 0 ? AnonymousClass004.A0T(bfm, activityGoalAction) | i : i;
        if ((i & 48) == 0) {
            iA0T |= AnonymousClass004.A0o(bfm, z);
        }
        if ((i & 384) == 0) {
            iA0T |= AnonymousClass004.A0V(bfm, function0);
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
            C0dx c0dx = (C0dx) bfm.A6v(Am0.A08);
            BRg bRgA00 = BGR.A00(C0lh.A03, AnonymousClass001.A0R(bRg2));
            if (function0 != null) {
                bRgA09 = C3cG.A09(bfm, -1297659340);
                C1YD c1ydA0A = C3cG.A0A(0);
                boolean zA67 = bfm.A67(c0dx) | ((iA0T & 896) == 256);
                Object objAaT = bfm.AaT();
                if (zA67 || objAaT == C78N.A00) {
                    objAaT = new ActivityGoalBottomSheetComponentKt$GoalActionRow$1$1(c0dx, function0);
                    bfm.Ai0(objAaT);
                }
                bRgA04 = C0v5.A04(bRgA09, c1ydA0A, null, (Function0) objAaT, true);
                bbiA0M = C3cG.A07(bfm);
            } else {
                bbiA0M = AnonymousClass002.A0M(bfm, -1297448106);
                bRgA04 = BRg.A00;
                bRgA09 = bRgA04;
            }
            BRg bRgThen = bRgA00.then(bRgA04);
            InterfaceC1380AiA interfaceC1380AiAA0b = AnonymousClass001.A0b(AcQ.A00(8.0f), bfm, C2VU.A05);
            int iA0J = AnonymousClass003.A0J(bbiA0M);
            AKQ akqA04 = BBI.A04(bbiA0M);
            BRg bRgA01 = AxM.A01(bfm, bRgThen);
            Function0<InterfaceC1516AkQ> function02 = C1515AkP.A00;
            if (bbiA0M.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbiA0M, function02);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA0b, akqA04, bRgA01, iA0J);
            C90m c90m = C90m.A00;
            GoalActionIconColumn(activityGoalAction.status, z, null, bfm, iA0T & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX, 4);
            GoalActionTextColumn(activityGoalAction, c90m.AiP(bRgA09, 1.0f, true), bfm, iA0T & 14, 0);
            BBI.A0R(bbiA0M, true);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C140483(activityGoalAction, z, function0, bRg2, i, i2);
        }
    }

    public static final void GoalActionSectionHeader(String str, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(2047274241);
        int iA0d = (i & 6) == 0 ? i | AnonymousClass004.A0d(bfm, str) : i;
        int i3 = i2 & 2;
        if (i3 != 0) {
            iA0d |= 48;
        } else if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0e(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 19, 18), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            BRg bRgA06 = C3U4.A06(AnonymousClass001.A0R(bRg2), 16.0f);
            AuraTheme auraTheme = AuraTheme.INSTANCE;
            AuraTextKt.m2639AuraTextUY9GdpU(str, bRgA06, C3cH.A06(bfm, auraTheme), C1822Arm.A00(new C1831Arv(), C60Q.A0C(bfm, auraTheme), AbstractC1996Aw5.A01, null, C1736ApY.A05, null, null, null, null, null, 0, 0, 0, 16121689, 0L, C19U.A03(13), C19U.A03(0), C19U.A03(12)), null, null, null, false, 0, 0, 0, null, null, null, bfm, iA0d & 14, 0, 16368);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C140491(str, bRg2, i, i2);
        }
    }

    public static final void GoalActionSectionsSection(AHD<GoalActionSectionModel> ahd, G0U<? super ActivityGoalAction, Unit> g0u, BRg bRg, BFM bfm, int i, int i2) {
        Function0 function0;
        BRg bRg2 = bRg;
        bfm.AgG(-1124682214);
        int iA0T = (i & 6) == 0 ? AnonymousClass004.A0T(bfm, ahd) | i : i;
        if ((i & 48) == 0) {
            iA0T |= AnonymousClass004.A0U(bfm, g0u);
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
            InterfaceC1380AiA interfaceC1380AiAA0U = AnonymousClass002.A0U(bfm);
            BBI bbi = (BBI) bfm;
            int iA02 = C3cG.A02(bbi.A06);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA0R);
            Function0<InterfaceC1516AkQ> function02 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
            } else {
                AnonymousClass005.A0n(bfm, bbi, function02);
                AnonymousClass005.A0p(bfm, interfaceC1380AiAA0U, akqA04, bRgA01, iA02);
                Iterator itA0w = AnonymousClass001.A0w(bfm, ahd, -1376246492);
                while (itA0w.hasNext()) {
                    GoalActionSectionModel goalActionSectionModel = (GoalActionSectionModel) itA0w.next();
                    GoalActionSectionHeader(goalActionSectionModel.label, null, bfm, 0, 2);
                    bfm.AgE(-1376243522);
                    int i4 = 0;
                    for (Object obj : goalActionSectionModel.actions) {
                        int i5 = i4 + 1;
                        if (i4 < 0) {
                            AbstractC0885AGm.A14();
                        } else {
                            ActivityGoalAction activityGoalAction = (ActivityGoalAction) obj;
                            boolean z = i4 < AnonymousClass002.A0E(goalActionSectionModel.actions);
                            if (canOpenGoalActionDetail(activityGoalAction)) {
                                bfm.AgE(-1584018236);
                                boolean zA1T = AnonymousClass001.A1T(bfm, activityGoalAction, AnonymousClass003.A1C(iA0T));
                                Object objAaT = bfm.AaT();
                                if (zA1T || objAaT == C78N.A00) {
                                    objAaT = new ActivityGoalBottomSheetComponentKt$GoalActionSectionsSection$1$1$1$1$1(g0u, activityGoalAction);
                                    bfm.Ai0(objAaT);
                                }
                                function0 = (Function0) objAaT;
                                BBI.A0R(bbi, false);
                            } else {
                                bfm.AgE(-1583942751);
                                BBI.A0R(bbi, false);
                                function0 = null;
                            }
                            GoalActionRow(activityGoalAction, z, function0, null, bfm, 0, 8);
                            i4 = i5;
                        }
                    }
                    BBI.A0R(bbi, false);
                }
                AnonymousClass003.A0q(bbi);
            }
            throw F60.createAndThrow();
        }
        bfm.Afo();
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C140502(ahd, g0u, bRg2, i, i2);
        }
    }

    public static final void GoalActionTextColumn(ActivityGoalAction activityGoalAction, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(-1331645383);
        int iA0T = (i & 6) == 0 ? i | AnonymousClass004.A0T(bfm, activityGoalAction) : i;
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
            BRg bRgA03 = C3U4.A03(bRg2, 12.0f);
            InterfaceC1380AiA interfaceC1380AiAA00 = C06I.A00(AcQ.A00(2.0f), bfm, C2VU.A02, 6);
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
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA00, akqA04, bRgA01, iA0J);
            String str = activityGoalAction.title;
            if (str == null) {
                str = "";
            }
            AuraTheme auraTheme = AuraTheme.INSTANCE;
            C1822Arm c1822ArmA00 = C1822Arm.A00(null, C60Q.A0C(bfm, auraTheme), null, null, null, null, null, null, null, null, 0, 0, 0, 16646015, 0L, 0L, C19U.A03(0), C19U.A03(18));
            long jA07 = C3cH.A07(bfm, auraTheme);
            C1062ATq c1062ATq = C10G.A02;
            AuraTextKt.m2639AuraTextUY9GdpU(str, c1062ATq, jA07, c1822ArmA00, null, null, null, false, 0, 0, 0, null, null, null, bfm, 48, 0, 16368);
            String str2 = activityGoalAction.subtitle;
            if (str2 == null || C7BY.A0j(str2)) {
                bfm.AgE(306593182);
            } else {
                AuraTextKt.m2639AuraTextUY9GdpU(str2, c1062ATq, C3cH.A07(bfm, auraTheme), C1822Arm.A00(null, C3cH.A0X(bfm, auraTheme, 306593183).footnoteRegular, null, null, null, null, null, null, null, null, 0, 0, 0, 16646015, 0L, 0L, C19U.A03(0), C60Q.A04()), null, null, null, false, 0, 0, 0, null, null, null, bfm, 48, 0, 16368);
            }
            AnonymousClass003.A0q(bbi);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C140512(activityGoalAction, bRg2, i, i2);
        }
    }

    public static final void GoalFinalSummarySection(String str, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(133441850);
        int iA0d = (i & 6) == 0 ? i | AnonymousClass004.A0d(bfm, str) : i;
        int i3 = i2 & 2;
        if (i3 != 0) {
            iA0d |= 48;
        } else if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0e(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 19, 18), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            C1062ATq c1062ATq = C10G.A02;
            BRg bRgThen = bRg2.then(c1062ATq);
            InterfaceC1380AiA interfaceC1380AiAA0U = AnonymousClass002.A0U(bfm);
            BBI bbi = (BBI) bfm;
            int iA0J = AnonymousClass003.A0J(bbi);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgThen);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function0);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA0U, akqA04, bRgA01, iA0J);
            AuraTheme auraTheme = AuraTheme.INSTANCE;
            AuraTextKt.m2639AuraTextUY9GdpU(str, C3U4.A06(c1062ATq, 12.0f), C3cH.A07(bfm, auraTheme), C1822Arm.A00(null, C3cH.A0B(bfm, auraTheme), null, null, null, null, null, null, null, null, 0, 0, 0, 16646015, 0L, 0L, C19U.A03(0), C19U.A03(21)), null, null, null, false, 0, 0, 0, null, null, null, bfm, (iA0d & 14) | 48, 0, 16368);
            GoalFullBleedDivider(null, bfm, 0, 1);
            BBI.A0R(bbi, true);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C140522(str, bRg2, i, i2);
        }
    }

    public static final void GoalHeaderTimeText(ActivityAction activityAction, BRg bRg, BFM bfm, int i, int i2) {
        AuraTheme auraTheme;
        long jA05;
        BRg bRg2 = bRg;
        bfm.AgG(1061230362);
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
            ActivityAction.ActivityStatus activityStatus = activityAction.status;
            ActivityAction.ActivityStatus activityStatus2 = ActivityAction.ActivityStatus.PENDING;
            long jRememberGoalHeaderCurrentTimeMillis = rememberGoalHeaderCurrentTimeMillis(activityStatus == activityStatus2, bfm, 0);
            ActivityAction.ActivityStatus activityStatus3 = activityAction.status;
            Date date = activityAction.timestamp;
            String goalRunningDuration = activityStatus3 == activityStatus2 ? formatGoalRunningDuration(jRememberGoalHeaderCurrentTimeMillis - date.getTime()) : formatGoalCompletedTime(date);
            if (activityAction.status == activityStatus2) {
                bfm.AgE(-140007462);
                auraTheme = AuraTheme.INSTANCE;
                jA05 = C3cH.A06(bfm, auraTheme);
            } else {
                bfm.AgE(-139955847);
                auraTheme = AuraTheme.INSTANCE;
                jA05 = C3cH.A05(bfm, auraTheme);
            }
            AnonymousClass001.A1D(bfm);
            BRg bRg3 = bRg2;
            AuraTextKt.m2639AuraTextUY9GdpU(goalRunningDuration, bRg3, jA05, C1822Arm.A00(new C1831Arv(), C3cH.A0E(bfm, auraTheme), null, null, null, new C1804ArN(0, 0.5f, 0), null, null, null, null, 0, 0, 0, 15073151, 0L, 0L, C19U.A03(0), C60Q.A04()), null, null, C3cH.A0F(6), false, 0, 0, 0, null, null, null, bfm, iA0T & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX, 0, 16304);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C140561(activityAction, bRg2, i, i2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0269 A[PHI: r10
  0x0269: PHI (r10v15 java.util.List<com.facebook.aura.status.repo.ActivityFile>) = 
  (r10v13 java.util.List<com.facebook.aura.status.repo.ActivityFile>)
  (r10v12 java.util.List<com.facebook.aura.status.repo.ActivityFile>)
 binds: [B:117:0x0267, B:115:0x0264] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:133:0x02d5  */
    /* JADX WARN: Type inference failed for: r12v2 */
    /* JADX WARN: Type inference failed for: r12v3, types: [java.lang.CharSequence, java.lang.String] */
    /* JADX WARN: Type inference failed for: r12v6 */
    /* JADX WARN: Type inference failed for: r31v1, types: [X.AHD] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void GoalOverviewPage(com.facebook.aura.status.repo.ActivityAction r41, X.G0U<? super com.facebook.aura.status.repo.ActivityGoalAction, kotlin.Unit> r42, X.BRg r43, X.BFM r44, int r45, int r46) {
        /*
            Method dump skipped, instructions count: 885
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.status.view.ActivityGoalBottomSheetComponentKt.GoalOverviewPage(com.facebook.aura.status.repo.ActivityAction, X.G0U, X.BRg, X.BFM, int, int):void");
    }

    public static final void GoalSheetShowMoreRow(String str, boolean z, Function0<Unit> function0, BRg bRg, BFM bfm, int i, int i2) {
        BBb bBbAAc;
        Object c140593;
        BRg bRg2 = bRg;
        bfm.AgG(-2041682008);
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
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 1171, 1170), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            if (z) {
                bfm.AgE(1578295170);
                LoadingSection(bRg2, bfm, (iA0d >> 9) & 14, 0);
                bBbAAc = AnonymousClass002.A0Q(bfm, bfm);
                if (bBbAAc != null) {
                    c140593 = new C140581(str, z, function0, bRg2, i, i2);
                    C3cG.A1D(bBbAAc, c140593);
                }
                return;
            }
            AnonymousClass003.A0l(bfm, 1578348986);
            AuraTheme auraTheme = AuraTheme.INSTANCE;
            C1822Arm c1822ArmA0C = C60Q.A0C(bfm, auraTheme);
            long j = auraTheme.getColors(bfm, 6).link;
            BRg bRgA0V = AnonymousClass001.A0V(AnonymousClass001.A0R(bRg2), 48.0f);
            C1YD c1ydA0A = C3cG.A0A(0);
            boolean z2 = (iA0d & 896) == 256;
            Object objAaT = bfm.AaT();
            if (z2 || objAaT == C78N.A00) {
                objAaT = new ActivityGoalBottomSheetComponentKt$GoalSheetShowMoreRow$2$1(function0);
                bfm.Ai0(objAaT);
            }
            AuraTextKt.m2639AuraTextUY9GdpU(str, C10G.A02(C2VU.A0B, C0v5.A04(bRgA0V, c1ydA0A, null, (Function0) objAaT, true), false), j, c1822ArmA0C, null, null, null, false, 0, 0, 0, null, null, null, bfm, iA0d & 14, 0, 16368);
        } else {
            bfm.Afo();
        }
        bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            c140593 = new C140593(str, z, function0, bRg2, i, i2);
            C3cG.A1D(bBbAAc, c140593);
        }
    }

    public static final void GoalTitleSection(ActivityAction activityAction, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(-573851776);
        int iA0T = (i & 6) == 0 ? AnonymousClass004.A0T(bfm, activityAction) | i : i;
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
            String actionTitle = HatchFileUIUtils.INSTANCE.getActionTitle(activityAction);
            BRg bRgA0R = AnonymousClass001.A0R(bRg2);
            AuraTheme auraTheme = AuraTheme.INSTANCE;
            AuraTextKt.m2639AuraTextUY9GdpU(actionTitle, bRgA0R, C3cH.A06(bfm, auraTheme), auraTheme.getTypography(bfm, 6).title3Emphasized, null, null, null, false, 0, 0, 0, null, null, null, bfm, 0, 0, 16368);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C140611(activityAction, bRg2, i, i2);
        }
    }

    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v4, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r5v7 */
    public static final void InlineDetailsSection(ActivityDetails activityDetails, BRg bRg, BFM bfm, int i, int i2) {
        int i3;
        BRg bRg2 = bRg;
        bfm.AgG(2103436362);
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
                    bfm.AgE(-562800862);
                } else {
                    BS0 bs0A09 = C3cG.A09(bfm, -564602737);
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
                    Iterator itA0w = AnonymousClass001.A0w(bfm, list, -1515677519);
                    int i5 = 0;
                    while (itA0w.hasNext()) {
                        Object next = itA0w.next();
                        int i6 = i5 + 1;
                        if (i5 < 0) {
                            break;
                        }
                        TaskRow((ActivityDetailTask) next, null, bfm, 0, 2);
                        if (i5 < C60O.A00(list)) {
                            bfm.AgE(620622452);
                            C0xs.A00(0.0f, C60O.A01(bfm, auraTheme), C3U4.A0C(bs0A09, 26.0f, 0.0f, 0.0f, 0.0f), bfm, 6, 2);
                            BBI.A0R(bbi, false);
                        } else {
                            bfm.AgE(620796393);
                            BBI.A0R(bbi, false);
                        }
                        i5 = i6;
                    }
                    AnonymousClass002.A10(bbi, false, zA1V);
                }
                BBI.A0R(bbi, i3);
                List<ActivityDetailItem> list2 = activityDetails.items;
                if (list2 == null || list2.isEmpty()) {
                    bfm.AgE(-560173054);
                } else {
                    BS0 bs0A092 = C3cG.A09(bfm, -562639941);
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
                    Iterator itA0w2 = AnonymousClass001.A0w(bfm, list2, -1899113318);
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
                                bfm.AgE(2092257180);
                                BBI.A0R(bbi, i3);
                            } else {
                                AuraTextKt.m2639AuraTextUY9GdpU(str2, null, C3cH.A07(bfm, auraTheme2), C3cH.A0X(bfm, auraTheme2, 2092028927).footnoteRegular, null, null, null, z2, i14, zA1V2 ? 1 : 0, i9, null, null, null, bfm, 805306368, i15, 15858);
                                BBI.A0R(bbi, i3);
                            }
                            BBI.A0R(bbi, zA1V2);
                            if (i12 < C60O.A00(list2)) {
                                bfm.AgE(1066536811);
                                C0xs.A00(0.0f, C60O.A01(bfm, auraTheme2), C3U4.A0C(bs0A092, 10.0f, 0.0f, 0.0f, 0.0f), bfm, 6, 2);
                                BBI.A0R(bbi, i3);
                            } else {
                                bfm.AgE(1066710752);
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
            bBbAAc.A06 = new C140622(activityDetails, bRg2, i, i2);
        }
    }

    public static final void LazyGoalActionReport(String str, String str2, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRgA0Q = bRg;
        bfm.AgG(1914128956);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, str) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0e(bfm, str2);
        }
        int i3 = i2 & 4;
        if (i3 != 0) {
            iA0d |= 384;
        } else if ((i & 384) == 0) {
            iA0d |= AnonymousClass004.A0f(bfm, bRgA0Q);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 147, 146), bfm, iA0d)) {
            if (i3 != 0) {
                bRgA0Q = BRg.A00;
            }
            GoalStepsViewModel goalStepsViewModel = goalStepsViewModel(str, C0881AGi.A00, bfm, (iA0d & 14) | 48);
            C1BO c1boA02 = C2CK.A02(bfm, goalStepsViewModel.report);
            boolean zA67 = bfm.A67(goalStepsViewModel) | AnonymousClass003.A1C(iA0d);
            Object objAaT = bfm.AaT();
            if (zA67 || objAaT == C78N.A00) {
                objAaT = new ActivityGoalBottomSheetComponentKt$LazyGoalActionReport$1$1(goalStepsViewModel, str2);
                bfm.Ai0(objAaT);
            }
            AnonymousClass001.A19(bfm, objAaT, goalStepsViewModel, str2);
            BRg bRgA0R = AnonymousClass001.A0R(bRgA0Q);
            InterfaceC1380AiA interfaceC1380AiAA0U = AnonymousClass002.A0U(bfm);
            BBI bbi = (BBI) bfm;
            int iA0D = AnonymousClass001.A0D(bbi);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA0R);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function0);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA0U, akqA04, bRgA01, iA0D);
            String str3 = ((GoalStepsViewModel.ReportUiState) c1boA02.getValue()).text;
            if (!C7384Etj.areEqual(((GoalStepsViewModel.ReportUiState) c1boA02.getValue()).actionId, str2) || str3 == null) {
                str3 = "";
            }
            GoalActionReportMarkdown(str3, null, bfm, 0, 2);
            if (((GoalStepsViewModel.ReportUiState) c1boA02.getValue()).loadFailed) {
                bfm.AgE(-399368757);
                String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120031);
                boolean zA672 = bfm.A67(goalStepsViewModel);
                Object objAaT2 = bfm.AaT();
                if (zA672 || objAaT2 == C78N.A00) {
                    objAaT2 = new ActivityGoalBottomSheetComponentKt$LazyGoalActionReport$2$2$1(goalStepsViewModel);
                    bfm.Ai0(objAaT2);
                }
                ErrorSection(strA01, (Function0) ((InterfaceC7353EnQ) objAaT2), null, bfm, 0, 4);
            } else if (((GoalStepsViewModel.ReportUiState) c1boA02.getValue()).isLoading) {
                bfm.AgE(-399362974);
                LoadingSection(null, bfm, 0, 1);
            } else if (((GoalStepsViewModel.ReportUiState) c1boA02.getValue()).hasMore) {
                bfm.AgE(-399360999);
                String strA012 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120036);
                boolean zA673 = bfm.A67(goalStepsViewModel);
                Object objAaT3 = bfm.AaT();
                if (zA673 || objAaT3 == C78N.A00) {
                    objAaT3 = new ActivityGoalBottomSheetComponentKt$LazyGoalActionReport$2$3$1(goalStepsViewModel);
                    bfm.Ai0(objAaT3);
                }
                GoalSheetShowMoreRow(strA012, false, (Function0) ((InterfaceC7353EnQ) objAaT3), null, bfm, 48, 8);
            } else {
                bfm.AgE(504908112);
            }
            bRgA0Q = AnonymousClass001.A0Q(bbi, bRgA0Q, false, true);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C140633(str, str2, bRgA0Q, i, i2);
        }
    }

    public static final void LazyGoalActionSectionsSection(String str, List<ActivityGoalAction> list, G0U<? super ActivityGoalAction, Unit> g0u, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(-2099112491);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, str) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass002.A06(AnonymousClass004.A1Y(list, bfm, i) ? 1 : 0);
        }
        if ((i & 384) == 0) {
            iA0d |= AnonymousClass004.A0V(bfm, g0u);
        }
        int i3 = i2 & 8;
        if (i3 != 0) {
            iA0d |= 3072;
        } else if ((i & 3072) == 0) {
            iA0d |= AnonymousClass004.A0g(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 1171, 1170), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            GoalStepsViewModel goalStepsViewModel = goalStepsViewModel(str, list, bfm, iA0d & 126);
            C1BO c1boA02 = C2CK.A02(bfm, goalStepsViewModel.steps);
            boolean zA65 = bfm.A65(((GoalStepsViewModel.StepsUiState) c1boA02.getValue()).steps);
            Object objAaT = bfm.AaT();
            if (zA65 || objAaT == C78N.A00) {
                objAaT = buildGoalActionSections(((GoalStepsViewModel.StepsUiState) c1boA02.getValue()).steps);
                bfm.Ai0(objAaT);
            }
            AHD ahd = (AHD) objAaT;
            BRg bRgA0R = AnonymousClass001.A0R(bRg2);
            InterfaceC1380AiA interfaceC1380AiAA0U = AnonymousClass002.A0U(bfm);
            BBI bbi = (BBI) bfm;
            int iA0J = AnonymousClass003.A0J(bbi);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA0R);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function0);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA0U, akqA04, bRgA01, iA0J);
            if (!((GoalStepsViewModel.StepsUiState) c1boA02.getValue()).hasEarlierSteps) {
                bfm.AgE(1456998913);
                BBI.A0R(bbi, false);
            } else if (((GoalStepsViewModel.StepsUiState) c1boA02.getValue()).loadEarlierFailed) {
                bfm.AgE(185549085);
                String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120031);
                boolean zA67 = bfm.A67(goalStepsViewModel);
                Object objAaT2 = bfm.AaT();
                if (zA67 || objAaT2 == C78N.A00) {
                    objAaT2 = new ActivityGoalBottomSheetComponentKt$LazyGoalActionSectionsSection$1$1$1(goalStepsViewModel);
                    bfm.Ai0(objAaT2);
                }
                ErrorSection(strA01, (Function0) ((InterfaceC7353EnQ) objAaT2), null, bfm, 0, 4);
                BBI.A0R(bbi, false);
            } else {
                bfm.AgE(185555008);
                String strA012 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120037);
                boolean z = ((GoalStepsViewModel.StepsUiState) c1boA02.getValue()).isLoadingEarlier;
                boolean zA672 = bfm.A67(goalStepsViewModel);
                Object objAaT3 = bfm.AaT();
                if (zA672 || objAaT3 == C78N.A00) {
                    objAaT3 = new ActivityGoalBottomSheetComponentKt$LazyGoalActionSectionsSection$1$2$1(goalStepsViewModel);
                    bfm.Ai0(objAaT3);
                }
                GoalSheetShowMoreRow(strA012, z, (Function0) ((InterfaceC7353EnQ) objAaT3), null, bfm, 0, 8);
                BBI.A0R(bbi, false);
            }
            GoalActionSectionsSection(ahd, g0u, null, bfm, (iA0d >> 3) & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX, 4);
            if (((GoalStepsViewModel.StepsUiState) c1boA02.getValue()).loadFailed) {
                bfm.AgE(185566900);
                String strA013 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120031);
                boolean zA673 = bfm.A67(goalStepsViewModel);
                Object objAaT4 = bfm.AaT();
                if (zA673 || objAaT4 == C78N.A00) {
                    objAaT4 = new ActivityGoalBottomSheetComponentKt$LazyGoalActionSectionsSection$1$3$1(goalStepsViewModel);
                    bfm.Ai0(objAaT4);
                }
                ErrorSection(strA013, (Function0) ((InterfaceC7353EnQ) objAaT4), null, bfm, 0, 4);
            } else if (((GoalStepsViewModel.StepsUiState) c1boA02.getValue()).isLoading && ahd.isEmpty()) {
                bfm.AgE(185573231);
                LoadingSection(null, bfm, 0, 1);
            } else {
                bfm.AgE(1457824195);
            }
            AnonymousClass003.A0q(bbi);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C140642(str, list, g0u, bRg2, i, i2);
        }
    }

    public static final void LoadingSection(BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(1785285156);
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
            bBbAAc.A06 = new C140652(bRg2, i, i2);
        }
    }

    public static final void StatusSection(ActivityAction activityAction, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(-501671849);
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
            boolean zA1Z = AnonymousClass006.A1Z(activityAction.type, ActivityAction.ActivityType.GOAL);
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
            if (zA1Z) {
                bfm.AgE(-1691163504);
                AuraStatusTagKt.m2637AuraStatusTagRWsq2U(statusBadgeInfo.second, statusBadgeInfo.first.A00, null, 0L, bfm, 0, 12);
            } else {
                bfm.AgE(-1691079897);
            }
            BBI.A0R(bbi, false);
            String str = activityAction.taskLabel;
            String str2 = activityAction.commitSha;
            String strA02 = str2 != null ? C6tn.A02(str2) : null;
            if (str != null && !C7BY.A0j(str)) {
                BRg bRgA012 = C11U.A01(C3cG.A09(bfm, -1690895571), 6.0f);
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
                bfm.AgE(-1689994649);
                AnonymousClass003.A0q(bbi);
            } else {
                BRg bRgA014 = C11U.A01(C3cG.A09(bfm, -1690419411), 6.0f);
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
            bBbAAc.A06 = new C140662(activityAction, bRg2, i, i2);
        }
    }

    public static final void SubtitleSection(String str, AHD<String> ahd, BRg bRg, boolean z, BFM bfm, int i, int i2) {
        AuraTheme auraTheme;
        C1822Arm c1822ArmA0B;
        int i3;
        BRg bRg2 = bRg;
        boolean zA1K = z;
        bfm.AgG(-1722157459);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, str) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0e(bfm, ahd);
        }
        int i4 = i2 & 4;
        if (i4 != 0) {
            iA0d |= 384;
        } else if ((i & 384) == 0) {
            iA0d |= AnonymousClass004.A0f(bfm, bRg2);
        }
        int i5 = i2 & 8;
        if (i5 != 0) {
            iA0d |= 3072;
        } else if ((i & 3072) == 0) {
            iA0d |= AnonymousClass004.A0q(bfm, zA1K);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 1171, 1170), bfm, iA0d)) {
            if (i4 != 0) {
                bRg2 = BRg.A00;
            }
            zA1K = C3cG.A1K(i5, zA1K);
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
            if (zA1K) {
                bfm.AgE(-1670056932);
                auraTheme = AuraTheme.INSTANCE;
                c1822ArmA0B = C1822Arm.A00(null, C3cH.A0B(bfm, auraTheme), null, null, null, null, null, null, null, null, 0, 0, 0, 16646015, 0L, 0L, C19U.A03(0), C19U.A03(21));
                BBI.A0R(bbi, false);
                i3 = -1669830043;
            } else {
                bfm.AgE(-1669939814);
                auraTheme = AuraTheme.INSTANCE;
                c1822ArmA0B = C3cH.A0B(bfm, auraTheme);
                BBI.A0R(bbi, false);
                i3 = -1669766555;
            }
            bfm.AgE(i3);
            long jA06 = C3cH.A06(bfm, auraTheme);
            BBI.A0R(bbi, false);
            AuraTextKt.m2639AuraTextUY9GdpU(str, null, jA06, c1822ArmA0B, null, null, null, false, 0, 0, 0, null, null, null, bfm, iA0d & 14, 0, 16370);
            if (ahd == null || ahd.isEmpty()) {
                bfm.AgE(-1668990625);
            } else {
                BS0 bs0A09 = C3cG.A09(bfm, -1669610470);
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
            bBbAAc.A06 = new C140672(str, ahd, bRg2, zA1K, i, i2);
        }
    }

    public static final void TaskRow(ActivityDetailTask activityDetailTask, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(-265900007);
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
                bfm.AgE(-1312468657);
            } else {
                AuraTextKt.m2639AuraTextUY9GdpU(str2, null, C3cH.A07(bfm, auraTheme), C3cH.A0X(bfm, auraTheme, -1312652456).footnoteRegular, null, null, null, false, 0, 2, 0, null, null, null, bfm, 805306368, 0, 15858);
            }
            BBI.A0R(bbi, false);
            AnonymousClass002.A0y(bbi);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C140682(activityDetailTask, bRg2, i, i2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0034 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.AHD<com.facebook.aura.status.view.GoalActionSectionModel> buildGoalActionSections(java.util.List<com.facebook.aura.status.repo.ActivityGoalAction> r7) {
        /*
            if (r7 == 0) goto Lf1
            boolean r0 = r7.isEmpty()
            if (r0 != 0) goto Lf1
            java.util.List r3 = sortGoalActionsChronologically(r7)
            boolean r0 = r3 instanceof java.util.Collection
            r7 = 1
            r6 = 0
            if (r0 == 0) goto L3c
            boolean r0 = r3.isEmpty()
            if (r0 == 0) goto L3c
        L18:
            java.util.Iterator r2 = r3.iterator()
        L1c:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L34
            java.lang.Object r1 = r2.next()
            r0 = r1
            com.facebook.aura.status.repo.ActivityGoalAction r0 = (com.facebook.aura.status.repo.ActivityGoalAction) r0
            java.lang.String r0 = r0.agentId
            if (r0 == 0) goto L1c
            boolean r0 = X.C7BY.A0j(r0)
            if (r0 == 0) goto L35
            goto L1c
        L34:
            r1 = r6
        L35:
            com.facebook.aura.status.repo.ActivityGoalAction r1 = (com.facebook.aura.status.repo.ActivityGoalAction) r1
            if (r1 == 0) goto L56
            java.lang.String r6 = r1.agentId
            goto L56
        L3c:
            java.util.Iterator r1 = r3.iterator()
        L40:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L18
            java.lang.Object r0 = r1.next()
            com.facebook.aura.status.repo.ActivityGoalAction r0 = (com.facebook.aura.status.repo.ActivityGoalAction) r0
            java.lang.String r0 = r0.agentId
            if (r0 == 0) goto L56
            boolean r0 = X.C7BY.A0j(r0)
            if (r0 == 0) goto L40
        L56:
            java.util.ArrayList r5 = X.C3cG.A0h()
            java.util.LinkedHashMap r4 = X.C3cG.A0j()
            java.util.Iterator r3 = r3.iterator()
        L62:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L8e
            java.lang.Object r2 = r3.next()
            com.facebook.aura.status.repo.ActivityGoalAction r2 = (com.facebook.aura.status.repo.ActivityGoalAction) r2
            java.lang.String r1 = r2.agentId
            if (r1 == 0) goto L80
            boolean r0 = X.C7BY.A0j(r1)
            if (r0 != 0) goto L80
            if (r6 == 0) goto L84
            boolean r0 = r1.equals(r6)
            if (r0 == 0) goto L84
        L80:
            r5.add(r2)
            goto L62
        L84:
            java.lang.Object r0 = X.C60R.A0Z(r1, r4)
            java.util.List r0 = (java.util.List) r0
            r0.add(r2)
            goto L62
        L8e:
            X.AII r6 = X.AIM.A17()
            boolean r0 = r5.isEmpty()
            if (r0 != 0) goto La6
            X.AHD r2 = X.AGI.A07(r5)
            java.lang.String r1 = "MAIN"
            com.facebook.aura.status.view.GoalActionSectionModel r0 = new com.facebook.aura.status.view.GoalActionSectionModel
            r0.<init>(r1, r2)
            r6.add(r0)
        La6:
            java.util.Iterator r5 = X.C60P.A1R(r4)
            r1 = 0
        Lab:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto Le8
            java.lang.Object r4 = r5.next()
            int r3 = r1 + 1
            if (r1 >= 0) goto Lc1
            X.AbstractC0885AGm.A14()
            X.F60 r0 = X.F60.createAndThrow()
            throw r0
        Lc1:
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            java.util.Locale r2 = java.util.Locale.US
            java.lang.Integer r0 = java.lang.Integer.valueOf(r3)
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            java.lang.Object[] r1 = java.util.Arrays.copyOf(r0, r7)
            java.lang.String r0 = "SUBAGENT %02d"
            java.lang.String r2 = java.lang.String.format(r2, r0, r1)
            X.C7384Etj.A0X(r4)
            X.AHD r1 = X.AGI.A07(r4)
            com.facebook.aura.status.view.GoalActionSectionModel r0 = new com.facebook.aura.status.view.GoalActionSectionModel
            r0.<init>(r2, r1)
            r6.add(r0)
            r1 = r3
            goto Lab
        Le8:
            X.AII r0 = X.AIM.A18(r6)
            X.AHD r0 = X.AGI.A07(r0)
            return r0
        Lf1:
            X.AHI r0 = X.AHI.A01
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.status.view.ActivityGoalBottomSheetComponentKt.buildGoalActionSections(java.util.List):X.AHD");
    }

    public static final boolean canOpenGoalActionDetail(ActivityGoalAction activityGoalAction) {
        if (activityGoalAction.hasReport) {
            return true;
        }
        String str = activityGoalAction.report;
        if (str != null && !C7BY.A0j(str)) {
            return true;
        }
        String str2 = activityGoalAction.subtitle;
        return (str2 == null || C7BY.A0j(str2)) ? false : true;
    }

    public static final String formatGoalCompletedTime(Date date) {
        Locale locale = Locale.US;
        String str = new SimpleDateFormat("h:mma", locale).format(date);
        C7384Etj.A0U(str);
        C7384Etj.A0V(locale);
        return str.toLowerCase(locale);
    }

    public static final String formatGoalRunningDuration(long j) {
        Object[] objArrCopyOf;
        String str;
        if (j < 0) {
            j = 0;
        }
        int i = (int) (j / 1000);
        int i2 = i / HardwareVideoEncoderFactory.PERIODIC_KEY_FRAME_INTERVAL_S;
        int i3 = (i % HardwareVideoEncoderFactory.PERIODIC_KEY_FRAME_INTERVAL_S) / 60;
        int i4 = i % 60;
        Locale locale = Locale.US;
        if (i2 > 0) {
            objArrCopyOf = Arrays.copyOf(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)}, 3);
            str = "%d:%02d:%02d";
        } else {
            objArrCopyOf = Arrays.copyOf(new Object[]{Integer.valueOf(i3), Integer.valueOf(i4)}, 2);
            str = "%02d:%02d";
        }
        return String.format(locale, str, objArrCopyOf);
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
                j = HatchFileUIUtils.StatusColors.SUCCESS_GREEN;
                return C3cG.A0r(numValueOf, C60P.A04(j));
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
                return C3cG.A0r(numValueOf, C60P.A04(j));
            }
            if (upperCase.equals("M")) {
                numValueOf = Integer.valueOf(R.drawable.two_lines_vertical_rectangle_missing_corner_outline_24);
                j = HatchFileUIUtils.ActivityIconColors.FILE_PURPLE;
                return C3cG.A0r(numValueOf, C60P.A04(j));
            }
            i = R.drawable.two_lines_vertical_rectangle_missing_corner_outline_24;
        } else {
            if (upperCase.equals("D")) {
                numValueOf = Integer.valueOf(R.drawable.trash_wght400_outline_24);
                j = HatchFileUIUtils.StatusColors.ERROR_RED;
                return C3cG.A0r(numValueOf, C60P.A04(j));
            }
            i = R.drawable.two_lines_vertical_rectangle_missing_corner_outline_24;
        }
        numValueOf = Integer.valueOf(i);
        j = HatchFileUIUtils.ActivityIconColors.SEARCH_GRAY;
        return C3cG.A0r(numValueOf, C60P.A04(j));
    }

    public static final GoalStepsViewModel goalStepsViewModel(String str, List<ActivityGoalAction> list, BFM bfm, int i) {
        String strA0M = FGI.A0M("goal_steps_", str);
        GoalStepsViewModel.Factory factory = new GoalStepsViewModel.Factory(AnonymousClass002.A0h(bfm), str, list);
        BOD bodA00 = C5wL.A00(bfm);
        if (bodA00 != null) {
            return (GoalStepsViewModel) AnonymousClass003.A0Y(factory, bodA00, AnonymousClass005.A0Y(bodA00), GoalStepsViewModel.class, strA0M);
        }
        throw AnonymousClass001.A0o();
    }

    public static final void logGoalSheetClick(HatchSubsurface hatchSubsurface, HatchComponent hatchComponent) {
        HatchInteractionLogger.INSTANCE.logClick(HatchSurface.STATUS, hatchSubsurface, HatchScreen.BOT_SHEET, hatchComponent, HatchComponent.ACTIVITY_ITEM.getValue(), null, null);
    }

    public static final boolean looksLikeEscapedMarkdown(String str) {
        Iterator<T> it = C06827l3.A00(str, C06827l3.A02("\\n")).iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                Iterator<T> it2 = C06827l3.A00(str, C06827l3.A02("\\r\\n")).iterator();
                int i2 = 0;
                while (it2.hasNext()) {
                    it2.next();
                    i2++;
                    if (i2 < 0) {
                    }
                }
                return i + i2 >= 2 || C7BY.A0q(str, "\\n- ", false) || C7BY.A0q(str, "\\n* ", false) || C7BY.A0q(str, "\\n#", false) || C7BY.A0q(str, "\\n> ", false) || C7BY.A0q(str, "\\n|", false) || C7BY.A0q(str, "\\n1. ", false) || C7BY.A0q(str, "\\n2. ", false) || C7BY.A0q(str, "\\n3. ", false) || C7BY.A0q(str, ".\\n", false);
            }
            it.next();
            i++;
            if (i < 0) {
                break;
            }
        }
        AbstractC0885AGm.A13();
        throw F60.createAndThrow();
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final long rememberGoalHeaderCurrentTimeMillis(boolean r12, X.BFM r13, int r14) {
        /*
            r0 = r14 & 14
            r4 = r0 ^ 6
            r5 = 0
            r3 = 4
            r6 = r12
            if (r4 <= r3) goto Lf
            boolean r0 = r13.A66(r12)
            if (r0 != 0) goto L14
        Lf:
            r1 = r14 & 6
            r0 = 0
            if (r1 != r3) goto L15
        L14:
            r0 = 1
        L15:
            java.lang.Object r1 = r13.AaT()
            if (r0 != 0) goto L1f
            java.lang.Object r0 = X.C78N.A00
            if (r1 != r0) goto L26
        L1f:
            java.lang.Long r1 = X.C60O.A0k()
            r13.Ai0(r1)
        L26:
            long r7 = X.C3cG.A05(r1)
            if (r4 <= r3) goto L32
            boolean r0 = r13.A66(r12)
            if (r0 != 0) goto L37
        L32:
            r1 = r14 & 6
            r0 = 0
            if (r1 != r3) goto L38
        L37:
            r0 = 1
        L38:
            java.lang.Object r1 = r13.AaT()
            if (r0 != 0) goto L42
            java.lang.Object r0 = X.C78N.A00
            if (r1 != r0) goto L49
        L42:
            java.lang.Long r1 = X.C3cI.A0O()
            r13.Ai0(r1)
        L49:
            long r9 = X.C3cG.A05(r1)
            if (r4 <= r3) goto L55
            boolean r0 = r13.A66(r12)
            if (r0 != 0) goto L5a
        L55:
            r1 = r14 & 6
            r0 = 0
            if (r1 != r3) goto L5b
        L5a:
            r0 = 1
        L5b:
            java.lang.Object r11 = r13.AaT()
            if (r0 != 0) goto L65
            java.lang.Object r0 = X.C78N.A00
            if (r11 != r0) goto L6d
        L65:
            androidx.compose.runtime.ParcelableSnapshotMutableLongState r11 = new androidx.compose.runtime.ParcelableSnapshotMutableLongState
            r11.<init>(r9)
            r13.Ai0(r11)
        L6d:
            X.00s r11 = (X.C00s) r11
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r12)
            boolean r2 = r13.A65(r11)
            if (r4 <= r3) goto L7f
            boolean r0 = r13.A66(r12)
            if (r0 != 0) goto L83
        L7f:
            r0 = r14 & 6
            if (r0 != r3) goto L84
        L83:
            r5 = 1
        L84:
            r2 = r2 | r5
            boolean r0 = r13.A64(r7)
            r2 = r2 | r0
            boolean r0 = r13.A64(r9)
            r2 = r2 | r0
            java.lang.Object r5 = r13.AaT()
            if (r2 != 0) goto L99
            java.lang.Object r0 = X.C78N.A00
            if (r5 != r0) goto La2
        L99:
            r12 = 0
            com.facebook.aura.status.view.ActivityGoalBottomSheetComponentKt$rememberGoalHeaderCurrentTimeMillis$1$1 r5 = new com.facebook.aura.status.view.ActivityGoalBottomSheetComponentKt$rememberGoalHeaderCurrentTimeMillis$1$1
            r5.<init>(r6, r7, r9, r11, r12)
            r13.Ai0(r5)
        La2:
            X.AnonymousClass001.A18(r13, r5, r1)
            long r0 = r11.AHH()
            long r0 = r0 - r9
            long r7 = r7 + r0
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.status.view.ActivityGoalBottomSheetComponentKt.rememberGoalHeaderCurrentTimeMillis(boolean, X.BFM, int):long");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0017  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final long taskStatusColor(java.lang.String r1) {
        /*
            if (r1 == 0) goto L9
            int r0 = r1.hashCode()
            switch(r0) {
                case -1281977283: goto L1a;
                case -682587753: goto Lc;
                case 96784904: goto L1d;
                case 1550783935: goto Lf;
                default: goto L9;
            }
        L9:
            long r0 = com.facebook.aura.file.utils.HatchFileUIUtils.StatusColors.SUCCESS_GREEN
            return r0
        Lc:
            java.lang.String r0 = "pending"
            goto L11
        Lf:
            java.lang.String r0 = "running"
        L11:
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L9
            long r0 = com.facebook.aura.file.utils.HatchFileUIUtils.StatusColors.PARTIAL_ORANGE
            return r0
        L1a:
            java.lang.String r0 = "failed"
            goto L1f
        L1d:
            java.lang.String r0 = "error"
        L1f:
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L9
            long r0 = com.facebook.aura.file.utils.HatchFileUIUtils.StatusColors.ERROR_RED
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.status.view.ActivityGoalBottomSheetComponentKt.taskStatusColor(java.lang.String):long");
    }

    public static final void FollowGoalStepUpdates(String str, List<ActivityGoalAction> list, BFM bfm, int i) {
        bfm.AgG(2077797113);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, str) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass002.A06(AnonymousClass004.A1Y(list, bfm, i) ? 1 : 0);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1H(iA0d), bfm, iA0d)) {
            GoalStepsViewModel goalStepsViewModel = goalStepsViewModel(str, list, bfm, iA0d & 126);
            boolean zA67 = bfm.A67(goalStepsViewModel);
            Object objAaT = bfm.AaT();
            if (zA67 || objAaT == C78N.A00) {
                objAaT = new ActivityGoalBottomSheetComponentKt$FollowGoalStepUpdates$1$1(goalStepsViewModel, null);
                bfm.Ai0(objAaT);
            }
            AnonymousClass001.A18(bfm, objAaT, goalStepsViewModel);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C140412(str, list, i);
        }
    }

    public static final void GoalActionConnectorLine(BRg bRg, BFM bfm, int i, int i2) {
        bfm.AgG(1736485617);
        int i3 = i2 & 1;
        int iA0d = i3 != 0 ? i | 6 : (i & 6) == 0 ? AnonymousClass004.A0d(bfm, bRg) | i : i;
        if (AnonymousClass001.A1b(AnonymousClass003.A1A(iA0d), bfm, iA0d)) {
            if (i3 != 0) {
                bRg = BRg.A00;
            }
            long j = C3cH.A0W(bfm).border;
            boolean zA64 = bfm.A64(j);
            Object objAaT = bfm.AaT();
            if (zA64 || objAaT == C78N.A00) {
                objAaT = new ActivityGoalBottomSheetComponentKt$GoalActionConnectorLine$1$1(j);
                bfm.Ai0(objAaT);
            }
            C0zJ.A00(bRg, (G0U) objAaT, bfm, iA0d & 14);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C140422(bRg, i, i2);
        }
    }

    public static final void GoalFullBleedDivider(BRg bRg, BFM bfm, int i, int i2) {
        bfm.AgG(-1335147060);
        int i3 = i2 & 1;
        int iA0d = i3 != 0 ? i | 6 : (i & 6) == 0 ? AnonymousClass004.A0d(bfm, bRg) | i : i;
        if (AnonymousClass001.A1b(AnonymousClass003.A1A(iA0d), bfm, iA0d)) {
            if (i3 != 0) {
                bRg = BRg.A00;
            }
            C3IL.A00(bfm, null, AnonymousClass001.A0R(bRg), B1V.A00(bfm, new C140531(C3cG.A00(bfm, AuraTheme.INSTANCE)), 2143449890), 3072, 6, false);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C140542(bRg, i, i2);
        }
    }

    public static final void GoalHeaderRow(ActivityAction activityAction, BRg bRg, BFM bfm, int i, int i2) {
        bfm.AgG(1897052414);
        int iA0T = (i & 6) == 0 ? AnonymousClass004.A0T(bfm, activityAction) | i : i;
        int i3 = i2 & 2;
        if (i3 != 0) {
            iA0T |= 48;
        } else if ((i & 48) == 0) {
            iA0T |= AnonymousClass004.A0e(bfm, bRg);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0T & 19, 18), bfm, iA0T)) {
            if (i3 != 0) {
                bRg = BRg.A00;
            }
            BRg bRgA0R = AnonymousClass001.A0R(bRg);
            InterfaceC1380AiA interfaceC1380AiAA0L = AnonymousClass007.A0L(bfm, 12.0f);
            BBI bbi = (BBI) bfm;
            int iA0J = AnonymousClass003.A0J(bbi);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA0R);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function0);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA0L, akqA04, bRgA01, iA0J);
            C90m c90m = C90m.A00;
            GoalStatusChip(activityAction.status, null, bfm, 0, 2);
            boolean zA1V = C60R.A1V(c90m, bfm, BRg.A00);
            GoalHeaderTimeText(activityAction, null, bfm, iA0T & 14, 2);
            BBI.A0R(bbi, zA1V);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C140552(activityAction, bRg, i, i2);
        }
    }

    public static final /* synthetic */ GoalBottomSheetDestination access$ActivityGoalBottomSheetContent$lambda$1(MutableState mutableState) {
        return (GoalBottomSheetDestination) mutableState.getValue();
    }

    public static final HxE<B6A, String> getStatusBadgeInfo(ActivityAction.ActivityStatus activityStatus, BFM bfm, int i) {
        int i2;
        B6A b6aA04;
        int i3;
        int iOrdinal = activityStatus.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 2) {
                bfm.AgE(-1371794687);
                b6aA04 = C60P.A04(HatchFileUIUtils.StatusColors.ERROR_RED);
                i3 = R.string._name_removed__res_0x7f12003c;
            } else if (iOrdinal != 3) {
                i2 = -1371784279;
                if (iOrdinal != 1) {
                    throw AnonymousClass005.A0k(bfm, -1371801604);
                }
            } else {
                bfm.AgE(-1371789592);
                b6aA04 = C60P.A04(HatchFileUIUtils.StatusColors.PARTIAL_ORANGE);
                i3 = R.string._name_removed__res_0x7f12003d;
            }
            HxE<B6A, String> hxEA0r = C3cG.A0r(b6aA04, AbstractC2271BQs.A01(bfm, i3));
            AnonymousClass001.A1D(bfm);
            return hxEA0r;
        }
        i2 = -1371799959;
        bfm.AgE(i2);
        b6aA04 = C60P.A04(HatchFileUIUtils.StatusColors.SUCCESS_GREEN);
        i3 = R.string._name_removed__res_0x7f12003b;
        HxE<B6A, String> hxEA0r2 = C3cG.A0r(b6aA04, AbstractC2271BQs.A01(bfm, i3));
        AnonymousClass001.A1D(bfm);
        return hxEA0r2;
    }

    public static final String normalizeGoalActionReport(String str) {
        return looksLikeEscapedMarkdown(str) ? AbstractC2159Azp.A0z(AbstractC2159Azp.A0z(AbstractC2159Azp.A0z(str, "\\r\\n", PairsDiscretionDocument.TERMINATOR), "\\n", PairsDiscretionDocument.TERMINATOR), "\\t", "\t") : str;
    }

    public static final Long parseGoalActionCreatedAtMillis(String str) {
        return ActivityTimestampParserKt.parseIsoTimestampToMillis(str);
    }

    public static final List<ActivityGoalAction> sortGoalActionsChronologically(List<ActivityGoalAction> list) {
        ArrayList arrayListA0m = AnonymousClass002.A0m(list);
        int i = 0;
        for (ActivityGoalAction activityGoalAction : list) {
            int i2 = i + 1;
            if (i < 0) {
                AbstractC0885AGm.A14();
                throw F60.createAndThrow();
            }
            ActivityGoalAction activityGoalAction2 = activityGoalAction;
            Integer numValueOf = Integer.valueOf(i);
            String str = activityGoalAction2.createdAt;
            arrayListA0m.add(new HwV(numValueOf, activityGoalAction2, str != null ? ActivityTimestampParserKt.parseIsoTimestampToMillis(str) : null));
            i = i2;
        }
        List listA0c = AbstractC0878AGe.A0c(arrayListA0m, new Comparator() { // from class: com.facebook.aura.status.view.ActivityGoalBottomSheetComponentKt.sortGoalActionsChronologically.2
            @Override // java.util.Comparator
            public final int compare(HwV<Integer, ActivityGoalAction, Long> hwV, HwV<Integer, ActivityGoalAction, Long> hwV2) {
                Long l = hwV.third;
                Long l2 = hwV2.third;
                if (l != null) {
                    if (l2 == null) {
                        return -1;
                    }
                    if (!l.equals(l2)) {
                        return C7384Etj.A01(l.longValue(), l2.longValue());
                    }
                } else if (l2 != null) {
                    return 1;
                }
                return C7384Etj.A00(AnonymousClass001.A0F(hwV.first), AnonymousClass001.A0F(hwV2.first));
            }
        });
        ArrayList arrayListA0m2 = AnonymousClass002.A0m(listA0c);
        Iterator it = listA0c.iterator();
        while (it.hasNext()) {
            arrayListA0m2.add(((HwV) it.next()).second);
        }
        return arrayListA0m2;
    }
}
