package com.facebook.aura.checkpoint.view;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass004;
import X.AnonymousClass011;
import X.B1V;
import X.B81;
import X.BBb;
import X.BFM;
import X.BRg;
import X.C1DG;
import X.C6t6;
import X.C78N;
import X.G0U;
import X.G0V;
import X.G2j;
import android.webkit.WebView;
import com.facebook.aura.header.view.HatchHeaderTitleAlignment;
import com.facebook.aura.header.view.HatchPageScreenKt;
import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;
import com.facebook.aura.vds.compose.theme.AuraContainer;
import com.facebook.common.dextricks.RuntimeInternals;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public abstract class HatchCheckpointWebPageKt {

    /* renamed from: com.facebook.aura.checkpoint.view.HatchCheckpointWebPageKt$HatchCheckpointWebPage$3, reason: invalid class name */
    public final class AnonymousClass3 extends AbstractC7559F3s implements G2j<C1DG, C1DG, BFM, Integer, Unit> {
        public final /* synthetic */ boolean $isLoading;
        public final /* synthetic */ G0U<WebView, Unit> $onRelease;
        public final /* synthetic */ C6t6 $webView;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass3(C6t6 c6t6, boolean z, G0U<? super WebView, Unit> g0u) {
            super(4);
            this.$webView = c6t6;
            this.$isLoading = z;
            this.$onRelease = g0u;
        }

        @Override // X.G2j
        public /* bridge */ /* synthetic */ Unit invoke(C1DG c1dg, C1DG c1dg2, BFM bfm, Integer num) {
            m350invokei1RSzL4(c1dg.A00, c1dg2.A00, bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        /* renamed from: invoke-i1RSzL4, reason: not valid java name */
        public final void m350invokei1RSzL4(float f, float f2, BFM bfm, int i) {
            int iA04 = (i & 6) == 0 ? AnonymousClass004.A04(bfm, f) | i : i;
            if ((i & 48) == 0) {
                iA04 |= AnonymousClass004.A05(bfm, f2);
            }
            if (AnonymousClass001.A1b(AnonymousClass004.A1J(iA04), bfm, iA04)) {
                HatchCheckpointWebContentKt.m349HatchCheckpointWebContent1yyLQnY(this.$webView, this.$isLoading, f, f2, this.$onRelease, null, bfm, (iA04 << 6) & 8064, 32);
            } else {
                bfm.Afo();
            }
        }
    }

    /* renamed from: com.facebook.aura.checkpoint.view.HatchCheckpointWebPageKt$HatchCheckpointWebPage$4, reason: invalid class name */
    public final class AnonymousClass4 extends AbstractC7559F3s implements G2j<C1DG, C1DG, BFM, Integer, Unit> {
        public final /* synthetic */ boolean $isLoading;
        public final /* synthetic */ G0U<WebView, Unit> $onRelease;
        public final /* synthetic */ C6t6 $webView;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass4(C6t6 c6t6, boolean z, G0U<? super WebView, Unit> g0u) {
            super(4);
            this.$webView = c6t6;
            this.$isLoading = z;
            this.$onRelease = g0u;
        }

        @Override // X.G2j
        public /* bridge */ /* synthetic */ Unit invoke(C1DG c1dg, C1DG c1dg2, BFM bfm, Integer num) {
            m351invokei1RSzL4(c1dg.A00, c1dg2.A00, bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        /* renamed from: invoke-i1RSzL4, reason: not valid java name */
        public final void m351invokei1RSzL4(float f, float f2, BFM bfm, int i) {
            int iA04 = (i & 6) == 0 ? AnonymousClass004.A04(bfm, f) | i : i;
            if ((i & 48) == 0) {
                iA04 |= AnonymousClass004.A05(bfm, f2);
            }
            if (AnonymousClass001.A1b(AnonymousClass004.A1J(iA04), bfm, iA04)) {
                HatchCheckpointWebContentKt.m349HatchCheckpointWebContent1yyLQnY(this.$webView, this.$isLoading, f, f2, this.$onRelease, null, bfm, (iA04 << 6) & 8064, 32);
            } else {
                bfm.Afo();
            }
        }
    }

    /* renamed from: com.facebook.aura.checkpoint.view.HatchCheckpointWebPageKt$HatchCheckpointWebPage$5, reason: invalid class name */
    public final class AnonymousClass5 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ boolean $isLoading;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onBack;
        public final /* synthetic */ G0U<WebView, Unit> $onRelease;
        public final /* synthetic */ String $title;
        public final /* synthetic */ C6t6 $webView;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass5(C6t6 c6t6, boolean z, Function0<Unit> function0, BRg bRg, String str, G0U<? super WebView, Unit> g0u, int i, int i2) {
            super(2);
            this.$webView = c6t6;
            this.$isLoading = z;
            this.$onBack = function0;
            this.$modifier = bRg;
            this.$title = str;
            this.$onRelease = g0u;
            this.$$changed = i;
            this.$$default = i2;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            HatchCheckpointWebPageKt.HatchCheckpointWebPage(this.$webView, this.$isLoading, this.$onBack, this.$modifier, this.$title, this.$onRelease, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    public static final void HatchCheckpointWebPage(C6t6 c6t6, boolean z, Function0<Unit> function0, BRg bRg, String str, G0U<? super WebView, Unit> g0u, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        String str2 = str;
        G0U<? super WebView, Unit> g0u2 = g0u;
        AnonymousClass002.A1A(c6t6, 0, function0);
        bfm.AgG(-905487532);
        int iA0T = (i & 6) == 0 ? AnonymousClass004.A0T(bfm, c6t6) | i : i;
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
        int i4 = i2 & 16;
        if (i4 != 0) {
            iA0T |= RuntimeInternals.IOPRIO_BACKGROUND;
        } else if ((i & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA0T |= AnonymousClass004.A0h(bfm, str2);
        }
        int i5 = i2 & 32;
        int iA0Y = 196608;
        if (i5 != 0) {
            iA0T |= iA0Y;
        } else if ((196608 & i) == 0) {
            iA0Y = AnonymousClass004.A0Y(bfm, g0u2);
            iA0T |= iA0Y;
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(74899 & iA0T, 74898), bfm, iA0T)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            if (i4 != 0) {
                str2 = null;
            }
            if (i5 != 0) {
                Object objAaT = bfm.AaT();
                if (objAaT == C78N.A00) {
                    objAaT = HatchCheckpointWebPageKt$HatchCheckpointWebPage$1$1.INSTANCE;
                    bfm.Ai0(objAaT);
                }
                g0u2 = (G0U) objAaT;
            }
            HatchCheckpointFileChooserKt.HatchCheckpointFileChooser(c6t6, bfm, iA0T & 14);
            boolean zA67 = bfm.A67(c6t6) | AnonymousClass004.A1K(iA0T);
            Object objAaT2 = bfm.AaT();
            if (zA67 || objAaT2 == C78N.A00) {
                objAaT2 = new HatchCheckpointWebPageKt$HatchCheckpointWebPage$2$1(c6t6, function0);
                bfm.Ai0(objAaT2);
            }
            B81.A00(true, (Function0) objAaT2, bfm, 6, 0);
            if (str2 == null) {
                bfm.AgE(1310893761);
                HatchPageScreenKt.m997HatchPageScreenZOcclw(AuraContainer.PrimaryScreen.INSTANCE, bRg2, null, 0L, null, null, function0, HatchHeaderTitleAlignment.HIDDEN, false, false, 0, null, null, null, null, null, null, 0L, 0L, null, 0.0f, null, null, null, 0, null, null, null, false, B1V.A00(bfm, new AnonymousClass3(c6t6, z, g0u2), -1830779810), bfm, ((iA0T >> 6) & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX) | 12582918 | ((iA0T << 12) & 3670016), 0, 805306422, 533724988);
            } else {
                bfm.AgE(1311268675);
                HatchPageScreenKt.m997HatchPageScreenZOcclw(AuraContainer.PrimaryScreen.INSTANCE, bRg2, null, 0L, str2, null, function0, null, false, false, 0, null, null, null, null, null, null, 0L, 0L, null, 0.0f, null, null, null, 0, null, null, null, false, B1V.A00(bfm, new AnonymousClass4(c6t6, z, g0u2), -787229835), bfm, AnonymousClass001.A0A(iA0T, ((iA0T >> 6) & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX) | 6) | ((iA0T << 12) & 3670016), 0, 805306368, 536870828);
            }
            AnonymousClass001.A1D(bfm);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass5(c6t6, z, function0, bRg2, str2, g0u2, i, i2);
        }
    }
}
