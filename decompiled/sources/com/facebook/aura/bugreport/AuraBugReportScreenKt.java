package com.facebook.aura.bugreport;

import X.AFs;
import X.AFz;
import X.AHD;
import X.AKH;
import X.AKQ;
import X.AWx;
import X.AaM;
import X.AbstractC0871AFr;
import X.AbstractC1754Apr;
import X.AbstractC1874Aso;
import X.AbstractC2271BQs;
import X.AbstractC3358CGz;
import X.AbstractC7204EiM;
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
import X.B81;
import X.BBI;
import X.BBb;
import X.BFM;
import X.BPg;
import X.BRg;
import X.BRr;
import X.BS0;
import X.C00x;
import X.C01N;
import X.C06G;
import X.C06I;
import X.C0881AGi;
import X.C0Hi;
import X.C1062ATq;
import X.C10G;
import X.C11U;
import X.C1326AhD;
import X.C1515AkP;
import X.C1822Arm;
import X.C1BO;
import X.C1D8;
import X.C1DG;
import X.C1DI;
import X.C1YY;
import X.C1b8;
import X.C1bk;
import X.C2CK;
import X.C2VU;
import X.C3TH;
import X.C3U4;
import X.C3UX;
import X.C7109EgN;
import X.C7184Ehu;
import X.C7196Ei8;
import X.C7197Ei9;
import X.C7384Etj;
import X.C78N;
import X.C7Bm;
import X.C7OQ;
import X.C7OU;
import X.C90l;
import X.C9m9;
import X.CFK;
import X.EfF;
import X.F60;
import X.G0U;
import X.G0V;
import X.G2j;
import X.GBL;
import X.HpR;
import X.HtJ;
import X.InterfaceC1185Ado;
import X.InterfaceC1380AiA;
import X.InterfaceC1492Ajz;
import X.InterfaceC1516AkQ;
import X.InterfaceC7064EfB;
import X.InterfaceC7236Ej0;
import X.InterfaceC7353EnQ;
import X.InterfaceC8647Fhz;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import androidx.activity.ComponentActivity;
import androidx.activity.result.ActivityResult;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import com.facebook.aura.R;
import com.facebook.aura.analytics.hatch.HatchComponent;
import com.facebook.aura.analytics.hatch.HatchInteractionLogger;
import com.facebook.aura.analytics.hatch.HatchScreen;
import com.facebook.aura.analytics.hatch.HatchSubsurface;
import com.facebook.aura.analytics.hatch.HatchSurface;
import com.facebook.aura.bugreport.AuraBugReportReviewViewModel;
import com.facebook.aura.devices.intf.DeviceBugReportReviewSession;
import com.facebook.aura.executors.AuraExecutors;
import com.facebook.aura.header.view.HatchPageScreenKt;
import com.facebook.aura.screenshot.HatchScreenshotModeKt;
import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;
import com.facebook.aura.ui.adaptive.AuraContentRole;
import com.facebook.aura.vds.compose.base.AuraDimensKt;
import com.facebook.aura.vds.compose.buttongroup.AuraButtonGroupsKt;
import com.facebook.aura.vds.compose.text.AuraTextKt;
import com.facebook.aura.vds.compose.theme.AuraColors;
import com.facebook.aura.vds.compose.theme.AuraColorsKt;
import com.facebook.aura.vds.compose.theme.AuraContainer;
import com.facebook.aura.vds.compose.theme.AuraDimensions;
import com.facebook.aura.vds.compose.theme.AuraDimensionsKt;
import com.facebook.common.dextricks.RuntimeInternals;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public abstract class AuraBugReportScreenKt {
    public static final String SCREENSHOT_ANNOTATION_CALLER_CONTEXT = "AuraBugReportScreenshotAnnotation";
    public static final int THUMBNAIL_HEIGHT = 120;
    public static final C7197Ei9 THUMBNAIL_IMAGE_OPTIONS;
    public static final int THUMBNAIL_WIDTH = 80;
    public static final AFs<List<Uri>, Object> AttachmentUrisSaver = AbstractC0871AFr.A00(AuraBugReportScreenKt$AttachmentUrisSaver$2.INSTANCE, AuraBugReportScreenKt$AttachmentUrisSaver$1.INSTANCE);
    public static final float CLOSE_BUTTON_SIZE = 24.0f;
    public static final float CLOSE_BUTTON_PADDING = 4.0f;

    /* renamed from: com.facebook.aura.bugreport.AuraBugReportScreenKt$AuraBugReportScreen$4, reason: invalid class name */
    public final class AnonymousClass4 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ String $endpoint;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onBack;
        public final /* synthetic */ Function0<Unit> $onViewLogs;
        public final /* synthetic */ String $screenshotUri;
        public final /* synthetic */ String $submissionId;
        public final /* synthetic */ AbstractC3358CGz $userSession;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(Function0<Unit> function0, String str, String str2, String str3, AbstractC3358CGz abstractC3358CGz, Function0<Unit> function02, BRg bRg, int i, int i2) {
            super(2);
            this.$onBack = function0;
            this.$submissionId = str;
            this.$screenshotUri = str2;
            this.$endpoint = str3;
            this.$userSession = abstractC3358CGz;
            this.$onViewLogs = function02;
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
            AuraBugReportScreenKt.AuraBugReportScreen(this.$onBack, this.$submissionId, this.$screenshotUri, this.$endpoint, this.$userSession, this.$onViewLogs, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.bugreport.AuraBugReportScreenKt$AuraBugReportScreen$5, reason: invalid class name */
    public final class AnonymousClass5 extends AbstractC7559F3s implements G2j<C1DG, C1DG, BFM, Integer, Unit> {
        public final /* synthetic */ MutableState<Uri> $annotationDecodeInFlightUri$delegate;
        public final /* synthetic */ MutableState<ScreenshotAnnotationTarget> $annotationTarget$delegate;
        public final /* synthetic */ Context $context;
        public final /* synthetic */ MutableState<String> $description$delegate;
        public final /* synthetic */ List<DeviceBugReportReviewSession> $deviceBugReportSessions;
        public final /* synthetic */ String $endpoint;
        public final /* synthetic */ C0Hi $focusManager;
        public final /* synthetic */ C7OU<Intent, ActivityResult> $galleryLauncher;
        public final /* synthetic */ MutableState<List<Uri>> $imageUris$delegate;
        public final /* synthetic */ boolean $includeLogs;
        public final /* synthetic */ Function0<Unit> $onBack;
        public final /* synthetic */ Function0<Unit> $onViewLogs;
        public final /* synthetic */ C1BO<AuraBugReportReviewUiState> $reviewState$delegate;
        public final /* synthetic */ AuraBugReportReviewViewModel $reviewViewModel;
        public final /* synthetic */ C3UX $scope;
        public final /* synthetic */ MutableState<String> $selectedCategoryId$delegate;
        public final /* synthetic */ String $submissionId;
        public final /* synthetic */ MutableState<Boolean> $submitted$delegate;
        public final /* synthetic */ AbstractC3358CGz $userSession;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass5(C0Hi c0Hi, MutableState<Boolean> mutableState, Context context, MutableState<String> mutableState2, boolean z, C1BO<AuraBugReportReviewUiState> c1bo, AuraBugReportReviewViewModel auraBugReportReviewViewModel, AbstractC3358CGz abstractC3358CGz, String str, MutableState<List<Uri>> mutableState3, String str2, List<? extends DeviceBugReportReviewSession> list, Function0<Unit> function0, Function0<Unit> function02, C7OU<Intent, ActivityResult> c7ou, C3UX c3ux, MutableState<String> mutableState4, MutableState<Uri> mutableState5, MutableState<ScreenshotAnnotationTarget> mutableState6) {
            super(4);
            this.$focusManager = c0Hi;
            this.$submitted$delegate = mutableState;
            this.$context = context;
            this.$description$delegate = mutableState2;
            this.$includeLogs = z;
            this.$reviewState$delegate = c1bo;
            this.$reviewViewModel = auraBugReportReviewViewModel;
            this.$userSession = abstractC3358CGz;
            this.$submissionId = str;
            this.$imageUris$delegate = mutableState3;
            this.$endpoint = str2;
            this.$deviceBugReportSessions = list;
            this.$onBack = function0;
            this.$onViewLogs = function02;
            this.$galleryLauncher = c7ou;
            this.$scope = c3ux;
            this.$selectedCategoryId$delegate = mutableState4;
            this.$annotationDecodeInFlightUri$delegate = mutableState5;
            this.$annotationTarget$delegate = mutableState6;
        }

        @Override // X.G2j
        public /* bridge */ /* synthetic */ Unit invoke(C1DG c1dg, C1DG c1dg2, BFM bfm, Integer num) {
            m329invokei1RSzL4(c1dg.A00, c1dg2.A00, bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        /* renamed from: invoke-i1RSzL4, reason: not valid java name */
        public final void m329invokei1RSzL4(float f, float f2, BFM bfm, int i) {
            Object next;
            int iA04 = (i & 6) == 0 ? i | AnonymousClass004.A04(bfm, f) : i;
            if ((i & 48) == 0) {
                iA04 |= AnonymousClass004.A05(bfm, f2);
            }
            if (!AnonymousClass001.A1b(AnonymousClass002.A1P(iA04 & 147, 146), bfm, iA04)) {
                bfm.Afo();
                return;
            }
            BS0 bs0 = BRg.A00;
            BRg bRgA00 = AbstractC1754Apr.A00(C10G.A01);
            Unit unit = Unit.INSTANCE;
            boolean zA67 = bfm.A67(this.$focusManager);
            final C0Hi c0Hi = this.$focusManager;
            Object objAaT = bfm.AaT();
            if (zA67 || objAaT == C78N.A00) {
                objAaT = new PointerInputEventHandler() { // from class: com.facebook.aura.bugreport.AuraBugReportScreenKt$AuraBugReportScreen$5$1$1

                    /* renamed from: com.facebook.aura.bugreport.AuraBugReportScreenKt$AuraBugReportScreen$5$1$1$1, reason: invalid class name */
                    public final class AnonymousClass1 extends AbstractC7559F3s implements G0U<AWx, Unit> {
                        public final /* synthetic */ C0Hi $focusManager;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        public AnonymousClass1(C0Hi c0Hi) {
                            super(1);
                            this.$focusManager = c0Hi;
                        }

                        @Override // X.G0U
                        public /* bridge */ /* synthetic */ Unit invoke(AWx aWx) {
                            m330invokek4lQ0M(aWx.A00);
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke-k-4lQ0M, reason: not valid java name */
                        public final void m330invokek4lQ0M(long j) {
                            this.$focusManager.A6G(false);
                        }
                    }

                    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
                    public final Object invoke(BRr bRr, HtJ<? super Unit> htJ) {
                        return AnonymousClass007.A0W(bRr, htJ, new AnonymousClass1(c0Hi));
                    }
                };
                bfm.Ai0(objAaT);
            }
            BRg bRgA002 = AaM.A00(bRgA00, (PointerInputEventHandler) objAaT, unit);
            MutableState<Boolean> mutableState = this.$submitted$delegate;
            Context context = this.$context;
            MutableState<String> mutableState2 = this.$description$delegate;
            boolean z = this.$includeLogs;
            C1BO<AuraBugReportReviewUiState> c1bo = this.$reviewState$delegate;
            AuraBugReportReviewViewModel auraBugReportReviewViewModel = this.$reviewViewModel;
            AbstractC3358CGz abstractC3358CGz = this.$userSession;
            String str = this.$submissionId;
            MutableState<List<Uri>> mutableState3 = this.$imageUris$delegate;
            String str2 = this.$endpoint;
            List<DeviceBugReportReviewSession> list = this.$deviceBugReportSessions;
            Function0<Unit> function0 = this.$onBack;
            Function0<Unit> function02 = this.$onViewLogs;
            C7OU<Intent, ActivityResult> c7ou = this.$galleryLauncher;
            C3UX c3ux = this.$scope;
            MutableState<String> mutableState4 = this.$selectedCategoryId$delegate;
            MutableState<Uri> mutableState5 = this.$annotationDecodeInFlightUri$delegate;
            MutableState<ScreenshotAnnotationTarget> mutableState6 = this.$annotationTarget$delegate;
            InterfaceC1185Ado interfaceC1185Ado = AcQ.A06;
            C3TH c3th = C2VU.A02;
            InterfaceC1380AiA interfaceC1380AiAA00 = C06I.A00(interfaceC1185Ado, bfm, c3th, 0);
            BBI bbi = (BBI) bfm;
            long j = bbi.A06;
            int i2 = (int) (j ^ (j >>> 32));
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA002);
            Function0<InterfaceC1516AkQ> function03 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function03);
            G0V<InterfaceC1516AkQ, InterfaceC1380AiA, Unit> g0v = C1515AkP.A04;
            BPg.A02(bfm, interfaceC1380AiAA00, g0v);
            G0V<InterfaceC1516AkQ, InterfaceC1492Ajz, Unit> g0v2 = C1515AkP.A06;
            G0V g0vA19 = AnonymousClass004.A19(bfm, akqA04, g0v2, i2);
            G0U<InterfaceC1516AkQ, Unit> g0u = C1515AkP.A02;
            G0V g0vA0u = AnonymousClass002.A0u(bfm, bRgA01, g0u);
            C90l c90l = C90l.A00;
            C01N.A08(bfm, bs0, f);
            BRg bRgA0T = AnonymousClass005.A0T(bfm, c90l.AiP(bs0, 1.0f, true));
            AKH<AuraDimensions> akh = AuraDimensionsKt.LocalAuraDimensions;
            BRg bRgA0C = C3U4.A0C(C3U4.A0B(bRgA0T, C06G.A01(bfm, akh), 0.0f), 0.0f, 0.0f, 0.0f, C06G.A01(bfm, akh));
            InterfaceC1380AiA interfaceC1380AiAA002 = C06I.A00(interfaceC1185Ado, bfm, c3th, 0);
            int iA0D = AnonymousClass001.A0D(bbi);
            AKQ akqA042 = BBI.A04(bbi);
            BRg bRgA012 = AxM.A01(bfm, bRgA0C);
            AnonymousClass005.A0n(bfm, bbi, function03);
            BPg.A02(bfm, interfaceC1380AiAA002, g0v);
            BPg.A02(bfm, akqA042, g0v2);
            AnonymousClass003.A15(g0u, g0vA19, bfm, iA0D);
            BPg.A02(bfm, bRgA012, g0vA0u);
            AuraTextKt.m2639AuraTextUY9GdpU(AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120205), null, C06G.A0C(bfm), AnonymousClass002.A0f(bfm).subheadlineEmphasized, null, null, null, false, 0, 0, 0, null, null, null, bfm, 0, 0, 16370);
            C01N.A08(bfm, bs0, 8.0f);
            float f3 = AuraBugReportScreenKt.CLOSE_BUTTON_PADDING;
            String strA05 = MutableState.A05(mutableState2);
            C1822Arm c1822ArmA0T = C06G.A0T(bfm);
            AKH<AuraColors> akh2 = AuraColorsKt.LocalAuraColors;
            C1822Arm c1822ArmA00 = C1822Arm.A00(null, c1822ArmA0T, null, null, null, null, null, null, null, null, 0, 0, 0, 16777214, C06G.A0L(bfm, akh2), 0L, 0L, 0L);
            C1326AhD c1326AhD = new C1326AhD(AnonymousClass001.A0f(bfm, akh2).textInput.cursorColor);
            C1062ATq c1062ATq = C10G.A02;
            BRg bRgA09 = C3U4.A09(C1b8.A01(C11U.A01(C1DI.A02(AnonymousClass001.A0U(c1062ATq, 120.0f), C1D8.A00(16.0f), 1.0f, AnonymousClass001.A0f(bfm, akh2).textInput.unfocusedBorderColor), 16.0f), C06G.A0J(bfm, akh2)), 16.0f);
            boolean zA65 = bfm.A65(mutableState2);
            Object objAaT2 = bfm.AaT();
            if (zA65 || objAaT2 == C78N.A00) {
                objAaT2 = new AuraBugReportScreenKt$AuraBugReportScreen$5$2$1$1$1(mutableState2);
                bfm.Ai0(objAaT2);
            }
            AbstractC1874Aso.A03(null, null, null, bfm, bRgA09, c1326AhD, c1822ArmA00, null, strA05, (G0U) objAaT2, null, B1V.A00(bfm, new AuraBugReportScreenKt$AuraBugReportScreen$5$2$1$2(mutableState2), -985591715), 0, 0, 0, 196608, 16344, false, false, false);
            C01N.A06(bfm, bs0);
            if (c1bo.getValue().isConfidentialOrUnclassified) {
                boolean zA1Z = AnonymousClass001.A1Z(auraBugReportReviewViewModel, bfm, -1295838486);
                Object objAaT3 = bfm.AaT();
                if (zA1Z || objAaT3 == C78N.A00) {
                    objAaT3 = new AuraBugReportScreenKt$AuraBugReportScreen$5$2$1$3$1(auraBugReportReviewViewModel);
                    bfm.Ai0(objAaT3);
                }
                AuraBugReportDiagnosticLogsKt.AuraBugReportDiagnosticLogsSection(z, (G0U) ((InterfaceC7353EnQ) objAaT3), z ? function02 : null, C3U4.A0B(c1062ATq, C1DG.A04(new C1DG(AuraDimensKt.SpacingLarge - C06G.A00(bfm)), AuraDimensKt.SpacingNone).A00, 0.0f), bfm, 0, 0);
                C01N.A04(bfm, bbi, bs0, AuraDimensKt.SpacingXlarge, false);
            } else {
                bfm.AgE(-1295231134);
                BBI.A0R(bbi, false);
            }
            Iterator itA0w = AnonymousClass001.A0w(bfm, list, 1620787557);
            while (itA0w.hasNext()) {
                ((DeviceBugReportReviewSession) itA0w.next()).getUi().Content(c1062ATq, bfm, 6);
                C01N.A06(bfm, bs0);
            }
            BBI.A0R(bbi, false);
            AuraTextKt.m2639AuraTextUY9GdpU(AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f1201ec), null, C06G.A0C(bfm), AnonymousClass002.A0f(bfm).subheadlineEmphasized, null, null, null, false, 0, 0, 0, null, null, null, bfm, 0, 0, 16370);
            C01N.A08(bfm, bs0, 8.0f);
            String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f1201eb);
            String strA012 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f1201e9);
            String strA013 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f1201ea);
            BRg bRgA04 = C10G.A04(c1062ATq, 120.0f);
            C9m9 c9m9A00 = AcQ.A00(8.0f);
            boolean zA1O = AnonymousClass003.A1O(bfm, c3ux, strA013, AnonymousClass005.A1W(bfm, context, strA01, strA012, AnonymousClass003.A1N(bfm, c7ou, mutableState3)));
            Object objAaT4 = bfm.AaT();
            if (zA1O || objAaT4 == C78N.A00) {
                objAaT4 = new AuraBugReportScreenKt$AuraBugReportScreen$5$2$1$5$1(c7ou, mutableState3, context, strA01, strA012, c3ux, strA013, mutableState5, mutableState6);
                bfm.Ai0(objAaT4);
            }
            C1YY.A00(null, null, c9m9A00, null, null, bfm, null, bRgA04, (G0U) objAaT4, 24582, 494, false, false);
            C01N.A08(bfm, bs0, 16.0f);
            AuraTextKt.m2639AuraTextUY9GdpU(AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f1201e6), null, C06G.A0C(bfm), AnonymousClass002.A0f(bfm).subheadlineEmphasized, null, null, null, false, 0, 0, 0, null, null, null, bfm, 0, 0, 16370);
            C01N.A08(bfm, bs0, 8.0f);
            AHD<AuraBugCategory> ahd = AuraBugCategories.ALL;
            String strA052 = MutableState.A05(mutableState4);
            boolean zA652 = bfm.A65(mutableState4);
            Object objAaT5 = bfm.AaT();
            if (zA652 || objAaT5 == C78N.A00) {
                objAaT5 = new AuraBugReportScreenKt$AuraBugReportScreen$5$2$1$6$1(mutableState4);
                bfm.Ai0(objAaT5);
            }
            AuraBugCategoryChipsKt.AuraBugCategoryChips(ahd, strA052, (G0U) objAaT5, c1062ATq, bfm, 3072, 0);
            BBI.A0R(bbi, true);
            Iterator it = ahd.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                } else {
                    next = it.next();
                    if (MutableState.A0B(mutableState4, ((AuraBugCategory) next).id)) {
                        break;
                    }
                }
            }
            AuraBugCategory auraBugCategory = (AuraBugCategory) next;
            if (c1bo.getValue().isConfidentialOrUnclassified) {
                bfm.AgE(2026285731);
                AuraTextKt.m2639AuraTextUY9GdpU(AnonymousClass006.A0v(bfm, R.string._name_removed__res_0x7f1201ed), C3U4.A0B(c1062ATq, AuraDimensKt.SpacingLarge, AuraDimensKt.SpacingSmall), C06G.A08(bfm), C06G.A0S(bfm), null, null, null, false, 0, 0, 0, null, null, null, bfm, 0, 0, 16368);
                BBI.A0R(bbi, false);
            } else {
                bfm.AgE(2026713624);
                BBI.A0R(bbi, false);
            }
            BRg bRgA013 = AbstractC1754Apr.A01(bs0);
            float f4 = AuraDimensKt.SpacingLarge;
            BRg bRgA0C2 = C3U4.A0C(bRgA013, f4, 0.0f, f4, AuraDimensKt.SpacingSmall);
            boolean zA1U = AnonymousClass005.A1U(bfm, auraBugCategory, list, function0, AnonymousClass005.A1T(bfm, str, mutableState3, str2, AnonymousClass005.A1Y(bfm, auraBugReportReviewViewModel, abstractC3358CGz, AnonymousClass001.A1U(bfm, z, AnonymousClass003.A1O(bfm, context, mutableState2, bfm.A65(mutableState))), bfm.A65(c1bo))));
            Object objAaT6 = bfm.AaT();
            if (zA1U || objAaT6 == C78N.A00) {
                objAaT6 = new AuraBugReportScreenKt$AuraBugReportScreen$5$2$2$1(context, z, mutableState, mutableState2, c1bo, auraBugReportReviewViewModel, abstractC3358CGz, str, str2, auraBugCategory, list, function0, mutableState3);
                bfm.Ai0(objAaT6);
            }
            AuraButtonGroupsKt.m2454AuraButtonGroupFLdL6rA(bRgA0C2, null, null, null, null, null, null, true, (G0U) objAaT6, bfm, 12582912, 126);
            C01N.A04(bfm, bbi, bs0, f2, true);
        }
    }

    /* renamed from: com.facebook.aura.bugreport.AuraBugReportScreenKt$AuraBugReportScreen$6, reason: invalid class name */
    public final class AnonymousClass6 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ String $endpoint;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onBack;
        public final /* synthetic */ Function0<Unit> $onViewLogs;
        public final /* synthetic */ String $screenshotUri;
        public final /* synthetic */ String $submissionId;
        public final /* synthetic */ AbstractC3358CGz $userSession;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass6(Function0<Unit> function0, String str, String str2, String str3, AbstractC3358CGz abstractC3358CGz, Function0<Unit> function02, BRg bRg, int i, int i2) {
            super(2);
            this.$onBack = function0;
            this.$submissionId = str;
            this.$screenshotUri = str2;
            this.$endpoint = str3;
            this.$userSession = abstractC3358CGz;
            this.$onViewLogs = function02;
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
            AuraBugReportScreenKt.AuraBugReportScreen(this.$onBack, this.$submissionId, this.$screenshotUri, this.$endpoint, this.$userSession, this.$onViewLogs, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    static {
        C7196Ei8 c7196Ei8 = new C7196Ei8(C7197Ei9.A0P);
        c7196Ei8.A0I = true;
        c7196Ei8.A00(InterfaceC8647Fhz.A01);
        c7196Ei8.A0O = true;
        THUMBNAIL_IMAGE_OPTIONS = new C7197Ei9(c7196Ei8);
    }

    public static final void AuraBugReportScreen(Function0<Unit> function0, String str, String str2, String str3, AbstractC3358CGz abstractC3358CGz, Function0<Unit> function02, BRg bRg, BFM bfm, int i, int i2) {
        BBb bBbAAc;
        G0V<? super BFM, ? super Integer, Unit> anonymousClass6;
        String str4 = str3;
        AbstractC3358CGz abstractC3358CGz2 = abstractC3358CGz;
        Function0<Unit> function03 = function02;
        BRg bRg2 = bRg;
        boolean zA1a = AnonymousClass002.A1a(function0, str);
        bfm.AgG(139825199);
        int iA0T = (i & 6) == 0 ? AnonymousClass004.A0T(bfm, function0) | i : i;
        if ((i & 48) == 0) {
            iA0T |= AnonymousClass004.A0e(bfm, str);
        }
        if ((i & 384) == 0) {
            iA0T |= AnonymousClass004.A0f(bfm, str2);
        }
        int i3 = i2 & 8;
        if (i3 != 0) {
            iA0T |= 3072;
        } else if ((i & 3072) == 0) {
            iA0T |= AnonymousClass004.A0g(bfm, str4);
        }
        int i4 = i2 & 16;
        if (i4 != 0) {
            iA0T |= RuntimeInternals.IOPRIO_BACKGROUND;
        } else if ((i & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA0T |= AnonymousClass004.A0X(bfm, abstractC3358CGz2);
        }
        int i5 = i2 & 32;
        int iA0Y = 196608;
        if (i5 != 0) {
            iA0T |= iA0Y;
        } else if ((196608 & i) == 0) {
            iA0Y = AnonymousClass004.A0Y(bfm, function03);
            iA0T |= iA0Y;
        }
        int i6 = i2 & 64;
        int iA0j = 1572864;
        if (i6 != 0) {
            iA0T |= iA0j;
        } else if ((i & 1572864) == 0) {
            iA0j = AnonymousClass004.A0j(bfm, bRg2);
            iA0T |= iA0j;
        }
        if (AnonymousClass001.A1b(AnonymousClass005.A1H(iA0T), bfm, iA0T)) {
            if (i3 != 0) {
                str4 = null;
            }
            if (i4 != 0) {
                abstractC3358CGz2 = null;
            }
            if (i5 != 0) {
                function03 = null;
            }
            if (i6 != 0) {
                bRg2 = BRg.A00;
            }
            Context contextA0O = AnonymousClass003.A0O(bfm);
            Object[] objArr = new Object[0];
            Object objAaT = bfm.AaT();
            Object obj = C78N.A00;
            if (objAaT == obj) {
                objAaT = AuraBugReportScreenKt$AuraBugReportScreen$description$2$1.INSTANCE;
                bfm.Ai0(objAaT);
            }
            MutableState mutableState = (MutableState) AFz.A03(bfm, (Function0) objAaT, objArr);
            Object[] objArr2 = new Object[0];
            Object objAaT2 = bfm.AaT();
            if (objAaT2 == obj) {
                objAaT2 = AuraBugReportScreenKt$AuraBugReportScreen$submitted$2$1.INSTANCE;
                bfm.Ai0(objAaT2);
            }
            MutableState mutableStateA0K = AnonymousClass006.A0K(bfm, objAaT2, objArr2);
            Object[] objArr3 = new Object[0];
            Object objAaT3 = bfm.AaT();
            if (objAaT3 == obj) {
                objAaT3 = AuraBugReportScreenKt$AuraBugReportScreen$selectedCategoryId$2$1.INSTANCE;
                bfm.Ai0(objAaT3);
            }
            MutableState mutableStateA0K2 = AnonymousClass006.A0K(bfm, objAaT3, objArr3);
            boolean zA65 = bfm.A65(abstractC3358CGz2);
            Object objAaT4 = bfm.AaT();
            if (zA65 || objAaT4 == obj) {
                objAaT4 = abstractC3358CGz2 != null ? new ArrayList(0) : C0881AGi.A00;
                bfm.Ai0(objAaT4);
            }
            List list = (List) objAaT4;
            AuraBugReportReviewViewModel.Factory factory = new AuraBugReportReviewViewModel.Factory(AnonymousClass001.A0I(contextA0O), abstractC3358CGz2, str, str4);
            ComponentActivity componentActivityA0y = AnonymousClass004.A0y(bfm);
            AuraBugReportReviewViewModel auraBugReportReviewViewModel = (AuraBugReportReviewViewModel) AnonymousClass003.A0Y(factory, componentActivityA0y, AnonymousClass003.A0Z(componentActivityA0y), AuraBugReportReviewViewModel.class, str);
            C1BO c1boA02 = C2CK.A02(bfm, auraBugReportReviewViewModel.uiState);
            boolean z = ((AuraBugReportReviewUiState) c1boA02.getValue()).includeLogs;
            boolean zA1D = AnonymousClass003.A1D(iA0T);
            Object objAaT5 = bfm.AaT();
            if (zA1D || objAaT5 == obj) {
                objAaT5 = str2 != null ? Collections.singletonList(Uri.parse(str2)) : C0881AGi.A00;
                bfm.Ai0(objAaT5);
            }
            List list2 = (List) objAaT5;
            Object[] objArr4 = new Object[0];
            AFs<List<Uri>, Object> aFs = AttachmentUrisSaver;
            boolean zA67 = bfm.A67(list2);
            Object objAaT6 = bfm.AaT();
            if (zA67 || objAaT6 == obj) {
                objAaT6 = new AuraBugReportScreenKt$AuraBugReportScreen$imageUris$2$1(list2);
                bfm.Ai0(objAaT6);
            }
            MutableState mutableStateA00 = AFz.A00(bfm, aFs, (Function0) objAaT6, objArr4);
            MutableState mutableState2 = (MutableState) AnonymousClass005.A0f(bfm, obj, null);
            MutableState mutableState3 = (MutableState) AnonymousClass005.A0f(bfm, obj, null);
            C3UX c3ux = (C3UX) AnonymousClass004.A15(bfm, bfm.AaT(), obj);
            HpR hpR = new HpR();
            boolean zA652 = bfm.A65(mutableStateA00);
            Object objAaT7 = bfm.AaT();
            if (zA652 || objAaT7 == obj) {
                objAaT7 = new AuraBugReportScreenKt$AuraBugReportScreen$galleryLauncher$1$1(mutableStateA00);
                bfm.Ai0(objAaT7);
            }
            C7OU c7ouA00 = C7OQ.A00(hpR, bfm, (G0U) objAaT7);
            C0Hi c0HiA0Z = AnonymousClass001.A0Z(bfm);
            ScreenshotAnnotationTarget screenshotAnnotationTarget = (ScreenshotAnnotationTarget) mutableState2.getValue();
            if (screenshotAnnotationTarget != null) {
                Object objA0p = AnonymousClass001.A0p(bfm, -582992296);
                if (objA0p == obj) {
                    objA0p = new AuraBugReportScreenKt$AuraBugReportScreen$1$1(mutableState2);
                    bfm.Ai0(objA0p);
                }
                B81.A00(false, (Function0) objA0p, bfm, 48, zA1a ? 1 : 0);
                Bitmap bitmap = screenshotAnnotationTarget.bitmap;
                boolean zA1J = AnonymousClass003.A1J(bfm, mutableStateA00, screenshotAnnotationTarget);
                Object objAaT8 = bfm.AaT();
                if (zA1J || objAaT8 == obj) {
                    objAaT8 = new AuraBugReportScreenKt$AuraBugReportScreen$2$1(mutableStateA00, screenshotAnnotationTarget, mutableState2);
                    bfm.Ai0(objAaT8);
                }
                G0U g0u = (G0U) objAaT8;
                Object objAaT9 = bfm.AaT();
                if (objAaT9 == obj) {
                    objAaT9 = new AuraBugReportScreenKt$AuraBugReportScreen$3$1(mutableState2);
                    bfm.Ai0(objAaT9);
                }
                HatchScreenshotModeKt.HatchScreenshotMode(bitmap, g0u, (Function0) objAaT9, zA1a, bRg2, bfm, (57344 & (iA0T >> 6)) | 3456, 0);
                bBbAAc = AnonymousClass002.A0Q(bfm, bfm);
                if (bBbAAc != null) {
                    anonymousClass6 = new AnonymousClass4(function0, str, str2, str4, abstractC3358CGz2, function03, bRg2, i, i2);
                    bBbAAc.A06 = anonymousClass6;
                }
                return;
            }
            AnonymousClass003.A0l(bfm, -582412813);
            boolean zA672 = bfm.A67(auraBugReportReviewViewModel) | AnonymousClass004.A1F(iA0T);
            Object objAaT10 = bfm.AaT();
            if (zA672 || objAaT10 == obj) {
                objAaT10 = new AuraBugReportScreenKt$AuraBugReportScreen$dismiss$1$1(auraBugReportReviewViewModel, function0);
                bfm.Ai0(objAaT10);
            }
            Function0 function04 = (Function0) objAaT10;
            B81.A00(false, function04, bfm, 0, zA1a ? 1 : 0);
            HatchPageScreenKt.m997HatchPageScreenZOcclw(AuraContainer.SecondaryScreen.INSTANCE, bRg2, AuraContentRole.Focused, 0L, AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120203), null, function04, null, false, false, 0, null, null, null, null, null, null, 0L, 0L, null, 0.0f, null, null, null, 0, null, null, null, false, B1V.A00(bfm, new AnonymousClass5(c0HiA0Z, mutableStateA0K, contextA0O, mutableState, z, c1boA02, auraBugReportReviewViewModel, abstractC3358CGz2, str, mutableStateA00, str4, list, function0, function03, c7ouA00, c3ux, mutableStateA0K2, mutableState3, mutableState2), 16293492), bfm, ((iA0T >> 15) & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX) | 390, 0, 905969664, 268435368);
        } else {
            bfm.Afo();
        }
        bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            anonymousClass6 = new AnonymousClass6(function0, str, str2, str4, abstractC3358CGz2, function03, bRg2, i, i2);
            bBbAAc.A06 = anonymousClass6;
        }
    }

    public static final Object decodeScreenshotBitmap(Uri uri, HtJ<? super Bitmap> htJ) throws NumberFormatException {
        String str = GBL.__redex_internal_original_name;
        final GBL gbl = new GBL(1, C7Bm.A02(htJ));
        gbl.A0I();
        C7184Ehu c7184Ehu = new C7184Ehu();
        uri.getClass();
        c7184Ehu.A02 = uri;
        c7184Ehu.A07 = C1bk.A01;
        InterfaceC7236Ej0<EfF<InterfaceC7064EfB>> interfaceC7236Ej0A03 = C7109EgN.A03().A06().A03(c7184Ehu.A01(), SCREENSHOT_ANNOTATION_CALLER_CONTEXT);
        interfaceC7236Ej0A03.Agc(new AbstractC7204EiM() { // from class: com.facebook.aura.bugreport.AuraBugReportScreenKt$decodeScreenshotBitmap$2$1
            @Override // X.AbstractC7209EiU
            public void onFailureImpl(InterfaceC7236Ej0<EfF<InterfaceC7064EfB>> interfaceC7236Ej0) {
                C7384Etj.A0Y(interfaceC7236Ej0, 0);
                CFK.A0J("AuraBugReportScreen", interfaceC7236Ej0.AFW(), "Failed to decode screenshot for annotation");
                if (gbl.isActive()) {
                    gbl.resumeWith(null);
                }
            }

            @Override // X.AbstractC7204EiM
            public void onNewResultImpl(Bitmap bitmap) {
                Bitmap bitmapCopy = null;
                if (bitmap != null) {
                    try {
                        Bitmap.Config config = bitmap.getConfig();
                        if (config == null) {
                            config = Bitmap.Config.ARGB_8888;
                        }
                        bitmapCopy = bitmap.copy(config, false);
                    } catch (RuntimeException e) {
                        CFK.A0J("AuraBugReportScreen", e, "Failed to copy screenshot for annotation");
                    }
                }
                if (gbl.isActive()) {
                    gbl.resumeWith(bitmapCopy);
                }
            }
        }, AuraExecutors.INSTANCE.getIoExecutor());
        gbl.AO2(new AuraBugReportScreenKt$decodeScreenshotBitmap$2$2(interfaceC7236Ej0A03));
        return gbl.A0F();
    }

    public static final void logAnnotationClick(HatchComponent hatchComponent) {
        HatchInteractionLogger.INSTANCE.logClick(HatchSurface.SETTINGS, HatchSubsurface.BUG_REPORT, HatchScreen.BUG_REPORT, hatchComponent, null, null, null);
    }

    public static final /* synthetic */ AuraBugReportReviewUiState access$AuraBugReportScreen$lambda$10(C1BO c1bo) {
        return (AuraBugReportReviewUiState) c1bo.getValue();
    }

    public static final /* synthetic */ List access$AuraBugReportScreen$lambda$13(MutableState mutableState) {
        return (List) mutableState.getValue();
    }

    public static final /* synthetic */ Uri access$AuraBugReportScreen$lambda$19(MutableState mutableState) {
        return (Uri) mutableState.getValue();
    }

    public static final boolean isPreviewableAttachment(Context context, Uri uri) {
        if (!"file".equals(uri.getScheme())) {
            try {
                String type = context.getContentResolver().getType(uri);
                if (type != null) {
                    if (!type.startsWith("image/")) {
                        return false;
                    }
                }
            } catch (SecurityException unused) {
                return false;
            }
        }
        return true;
    }
}
