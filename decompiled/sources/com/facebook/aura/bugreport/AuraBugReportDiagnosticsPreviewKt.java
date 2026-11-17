package com.facebook.aura.bugreport;

import X.AKH;
import X.AbstractC1996Aw5;
import X.AbstractC2271BQs;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass007;
import X.AnonymousClass011;
import X.B1V;
import X.B6A;
import X.BBb;
import X.BFM;
import X.BRg;
import X.C06G;
import X.C1809ArT;
import X.C1822Arm;
import X.C1847AsK;
import X.C19U;
import X.C1DG;
import X.C1YY;
import X.C3U4;
import X.C78N;
import X.G0U;
import X.G0V;
import X.G2j;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import com.facebook.aura.R;
import com.facebook.aura.bugreport.AuraBugReportCollector;
import com.facebook.aura.header.view.HatchPageScreenKt;
import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;
import com.facebook.aura.ui.HatchFilePreviewUnavailableCardKt;
import com.facebook.aura.vds.compose.text.AuraTextKt;
import com.facebook.aura.vds.compose.theme.AuraContainer;
import com.facebook.aura.vds.compose.theme.AuraDimensions;
import com.facebook.aura.vds.compose.theme.AuraDimensionsKt;
import com.facebook.common.dextricks.RuntimeInternals;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public abstract class AuraBugReportDiagnosticsPreviewKt {
    public static final float LOG_LINE_SPACING = 1.0f;

    /* renamed from: com.facebook.aura.bugreport.AuraBugReportDiagnosticsPreviewKt$AuraBugReportDiagnosticsPreview$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G2j<C1DG, C1DG, BFM, Integer, Unit> {
        public final /* synthetic */ boolean $isLoading;
        public final /* synthetic */ SnapshotStateList<LogLine> $lines;
        public final /* synthetic */ G0U<AuraBugReportCollector.CollectedItem, Unit> $onDownload;
        public final /* synthetic */ AuraBugReportCollector.CollectedItem $tooLargeItem;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(AuraBugReportCollector.CollectedItem collectedItem, G0U<? super AuraBugReportCollector.CollectedItem, Unit> g0u, boolean z, SnapshotStateList<LogLine> snapshotStateList) {
            super(4);
            this.$tooLargeItem = collectedItem;
            this.$onDownload = g0u;
            this.$isLoading = z;
            this.$lines = snapshotStateList;
        }

        @Override // X.G2j
        public /* bridge */ /* synthetic */ Unit invoke(C1DG c1dg, C1DG c1dg2, BFM bfm, Integer num) {
            m328invokei1RSzL4(c1dg.A00, c1dg2.A00, bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        /* renamed from: invoke-i1RSzL4, reason: not valid java name */
        public final void m328invokei1RSzL4(float f, float f2, BFM bfm, int i) {
            int iA04 = (i & 6) == 0 ? AnonymousClass004.A04(bfm, f) | i : i;
            if ((i & 48) == 0) {
                iA04 |= AnonymousClass004.A05(bfm, f2);
            }
            if (!AnonymousClass001.A1b(AnonymousClass002.A1P(iA04 & 147, 146), bfm, iA04)) {
                bfm.Afo();
                return;
            }
            if (this.$tooLargeItem != null) {
                bfm.AgE(1023166328);
                String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f1209ee);
                String strA012 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120230);
                boolean zA1T = AnonymousClass001.A1T(bfm, this.$tooLargeItem, bfm.A65(this.$onDownload));
                G0U<AuraBugReportCollector.CollectedItem, Unit> g0u = this.$onDownload;
                AuraBugReportCollector.CollectedItem collectedItem = this.$tooLargeItem;
                Object objAaT = bfm.AaT();
                if (zA1T || objAaT == C78N.A00) {
                    objAaT = new AuraBugReportDiagnosticsPreviewKt$AuraBugReportDiagnosticsPreview$1$1$1(g0u, collectedItem);
                    bfm.Ai0(objAaT);
                }
                HatchFilePreviewUnavailableCardKt.HatchFilePreviewUnavailableCard(strA01, strA012, (Function0) objAaT, C3U4.A04(BRg.A00, f), false, bfm, 0, 16);
            } else if (this.$isLoading) {
                bfm.AgE(1023176900);
                AuraBugReportDiagnosticsPreviewKt.m324LoadingPlaceholderorJrPs(f, null, bfm, iA04 & 14, 2);
            } else {
                bfm.AgE(1023178795);
                AuraBugReportDiagnosticsPreviewKt.m325LogLineListdjqsMU(this.$lines, f, f2, null, bfm, (iA04 << 3) & 1008, 8);
            }
            AnonymousClass001.A1D(bfm);
        }
    }

    /* renamed from: com.facebook.aura.bugreport.AuraBugReportDiagnosticsPreviewKt$AuraBugReportDiagnosticsPreview$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ boolean $isLoading;
        public final /* synthetic */ SnapshotStateList<LogLine> $lines;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onBack;
        public final /* synthetic */ G0U<AuraBugReportCollector.CollectedItem, Unit> $onDownload;
        public final /* synthetic */ String $title;
        public final /* synthetic */ AuraBugReportCollector.CollectedItem $tooLargeItem;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass2(String str, SnapshotStateList<LogLine> snapshotStateList, boolean z, AuraBugReportCollector.CollectedItem collectedItem, G0U<? super AuraBugReportCollector.CollectedItem, Unit> g0u, Function0<Unit> function0, BRg bRg, int i, int i2) {
            super(2);
            this.$title = str;
            this.$lines = snapshotStateList;
            this.$isLoading = z;
            this.$tooLargeItem = collectedItem;
            this.$onDownload = g0u;
            this.$onBack = function0;
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
            AuraBugReportDiagnosticsPreviewKt.AuraBugReportDiagnosticsPreview(this.$title, this.$lines, this.$isLoading, this.$tooLargeItem, this.$onDownload, this.$onBack, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    public static final void AuraBugReportDiagnosticsPreview(String str, SnapshotStateList<LogLine> snapshotStateList, boolean z, AuraBugReportCollector.CollectedItem collectedItem, G0U<? super AuraBugReportCollector.CollectedItem, Unit> g0u, Function0<Unit> function0, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        boolean zA1b = AnonymousClass004.A1b(str, snapshotStateList);
        AnonymousClass003.A0y(g0u, function0);
        bfm.AgG(1332851636);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, str) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0e(bfm, snapshotStateList);
        }
        if ((i & 384) == 0) {
            iA0d |= AnonymousClass004.A0p(bfm, z);
        }
        if ((i & 3072) == 0) {
            iA0d |= AnonymousClass002.A00(AnonymousClass004.A1a(collectedItem, bfm, i) ? 1 : 0);
        }
        if ((i & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA0d |= AnonymousClass004.A0X(bfm, g0u);
        }
        if ((196608 & i) == 0) {
            iA0d |= AnonymousClass004.A0Y(bfm, function0);
        }
        int i3 = i2 & 64;
        int iA0j = 1572864;
        if (i3 != 0) {
            iA0d |= iA0j;
        } else if ((1572864 & i) == 0) {
            iA0j = AnonymousClass004.A0j(bfm, bRg2);
            iA0d |= iA0j;
        }
        if (AnonymousClass001.A1b(AnonymousClass007.A1J(iA0d), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            HatchPageScreenKt.m997HatchPageScreenZOcclw(AuraContainer.SecondaryScreen.INSTANCE, bRg2, null, 0L, str, null, function0, null, zA1b, zA1b, zA1b ? 1 : 0, null, null, null, null, null, null, 0L, 0L, null, 0.0f, null, null, null, zA1b ? 1 : 0, null, null, null, zA1b, B1V.A00(bfm, new AnonymousClass1(collectedItem, g0u, z, snapshotStateList), -258152903), bfm, AnonymousClass001.A05(iA0d << 3, AnonymousClass001.A0B(iA0d << 12, ((iA0d >> 15) & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX) | 6)), zA1b ? 1 : 0, 805306368, 536870828);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass2(str, snapshotStateList, z, collectedItem, g0u, function0, bRg2, i, i2);
        }
    }

    /* renamed from: LoadingPlaceholder--orJrPs, reason: not valid java name */
    public static final void m324LoadingPlaceholderorJrPs(float f, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(213410617);
        int iA04 = (i & 6) == 0 ? AnonymousClass004.A04(bfm, f) | i : i;
        int i3 = i2 & 2;
        if (i3 != 0) {
            iA04 |= 48;
        } else if ((i & 48) == 0) {
            iA04 |= AnonymousClass004.A0e(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA04 & 19, 18), bfm, iA04)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f1201ee);
            C1822Arm c1822ArmA0Z = C06G.A0Z(bfm);
            long jA08 = C06G.A08(bfm);
            AKH<AuraDimensions> akh = AuraDimensionsKt.LocalAuraDimensions;
            AuraTextKt.m2639AuraTextUY9GdpU(strA01, C3U4.A0C(bRg2, C06G.A01(bfm, akh), f, C06G.A01(bfm, akh), 0.0f), jA08, c1822ArmA0Z, null, null, null, false, 0, 0, 0, null, null, null, bfm, 0, 0, 16368);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AuraBugReportDiagnosticsPreviewKt$LoadingPlaceholder$1(f, bRg2, i, i2);
        }
    }

    /* renamed from: LogLineList-djqs-MU, reason: not valid java name */
    public static final void m325LogLineListdjqsMU(SnapshotStateList<LogLine> snapshotStateList, float f, float f2, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(-725769003);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, snapshotStateList) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A05(bfm, f);
        }
        if ((i & 384) == 0) {
            iA0d |= AnonymousClass004.A06(bfm, f2);
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
            long jA0C = C06G.A0C(bfm);
            boolean zA64 = bfm.A64(jA0C);
            Object objAaT = bfm.AaT();
            if (zA64 || objAaT == C78N.A00) {
                long jA03 = C19U.A03(12);
                long jA032 = C19U.A03(17);
                C1847AsK c1847AsK = AbstractC1996Aw5.A01;
                C1822Arm c1822Arm = C1822Arm.A03;
                objAaT = new C1822Arm(null, c1847AsK, null, 0, 0, jA0C, jA03, C1809ArT.A01, B6A.A07, jA032);
                bfm.Ai0(objAaT);
            }
            C1822Arm c1822Arm2 = (C1822Arm) objAaT;
            float fA00 = C06G.A00(bfm);
            BRg bRgA0R = AnonymousClass001.A0R(bRg2);
            boolean zA1W = AnonymousClass002.A1W(bfm, c1822Arm2, AnonymousClass003.A1B(iA0d) | AnonymousClass003.A1C(iA0d), bfm.A62(fA00)) | AnonymousClass004.A1K(iA0d);
            Object objAaT2 = bfm.AaT();
            if (zA1W || objAaT2 == C78N.A00) {
                objAaT2 = new AuraBugReportDiagnosticsPreviewKt$LogLineList$1$1(snapshotStateList, f, fA00, c1822Arm2, f2);
                bfm.Ai0(objAaT2);
            }
            C1YY.A01(null, null, null, null, null, bfm, null, bRgA0R, (G0U) objAaT2, 0, 510, false, false);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AuraBugReportDiagnosticsPreviewKt$LogLineList$2(snapshotStateList, f, f2, bRg2, i, i2);
        }
    }
}
