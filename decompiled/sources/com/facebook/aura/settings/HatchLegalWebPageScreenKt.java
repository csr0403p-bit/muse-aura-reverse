package com.facebook.aura.settings;

import X.AKQ;
import X.AT5;
import X.AbstractC1532Ako;
import X.AbstractC2271BQs;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass011;
import X.AxM;
import X.B1V;
import X.B81;
import X.BA2;
import X.BBI;
import X.BBb;
import X.BFM;
import X.BRg;
import X.BS0;
import X.C00x;
import X.C06G;
import X.C0n6;
import X.C0z7;
import X.C1062ATq;
import X.C10G;
import X.C13s;
import X.C1515AkP;
import X.C1DG;
import X.C2VU;
import X.C3U4;
import X.C6t6;
import X.C6tA;
import X.C78N;
import X.C79;
import X.F60;
import X.G0U;
import X.G0V;
import X.G2j;
import X.InterfaceC1380AiA;
import X.InterfaceC1516AkQ;
import android.content.Context;
import android.graphics.Bitmap;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.webkit.WebView;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.R;
import com.facebook.aura.header.view.HatchPageScreenKt;
import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;
import com.facebook.aura.ui.adaptive.AuraContentRole;
import com.facebook.aura.vds.compose.spinner.AuraSpinnerKt;
import com.facebook.aura.vds.compose.spinner.AuraSpinnerStyle;
import com.facebook.aura.vds.compose.theme.AuraContainer;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public abstract class HatchLegalWebPageScreenKt {

    /* renamed from: com.facebook.aura.settings.HatchLegalWebPageScreenKt$HatchLegalWebPageOverlay$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onClose;
        public final /* synthetic */ String $title;
        public final /* synthetic */ String $url;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(String str, String str2, Function0<Unit> function0, BRg bRg) {
            super(2);
            this.$url = str;
            this.$title = str2;
            this.$onClose = function0;
            this.$modifier = bRg;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            Window windowAMm;
            C13s c13s;
            if (AnonymousClass001.A1b(AnonymousClass003.A16(i & 3), bfm, i)) {
                ViewParent parent = AnonymousClass001.A0J(bfm).getParent();
                if ((parent instanceof C13s) && (c13s = (C13s) parent) != null) {
                    windowAMm = c13s.AMm();
                } else {
                    windowAMm = null;
                }
                boolean zA67 = bfm.A67(windowAMm);
                Object objAaT = bfm.AaT();
                if (zA67 || objAaT == C78N.A00) {
                    objAaT = new HatchLegalWebPageScreenKt$HatchLegalWebPageOverlay$1$1$1(windowAMm);
                    bfm.Ai0(objAaT);
                }
                AnonymousClass001.A17(bfm, objAaT, windowAMm);
                Object objAaT2 = bfm.AaT();
                Object obj = C78N.A00;
                if (objAaT2 == obj) {
                    objAaT2 = AnonymousClass002.A0I(bfm, 1.0f);
                }
                AT5 at5 = (AT5) objAaT2;
                Unit unit = Unit.INSTANCE;
                boolean zA672 = bfm.A67(at5);
                Object objAaT3 = bfm.AaT();
                if (zA672 || objAaT3 == obj) {
                    objAaT3 = new HatchLegalWebPageScreenKt$HatchLegalWebPageOverlay$1$2$1(at5, null);
                    bfm.Ai0(objAaT3);
                }
                AnonymousClass001.A18(bfm, objAaT3, unit);
                String str = this.$url;
                String str2 = this.$title;
                Function0<Unit> function0 = this.$onClose;
                BRg bRgA0T = AnonymousClass001.A0T(this.$modifier);
                boolean zA673 = bfm.A67(at5);
                Object objAaT4 = bfm.AaT();
                if (zA673 || objAaT4 == obj) {
                    objAaT4 = new HatchLegalWebPageScreenKt$HatchLegalWebPageOverlay$1$3$1(at5);
                    bfm.Ai0(objAaT4);
                }
                HatchLegalWebPageScreenKt.HatchLegalWebPageScreen(str, str2, function0, C06G.A0N(bfm, AnonymousClass001.A0W(bRgA0T, objAaT4)), bfm, 0, 0);
                return;
            }
            bfm.Afo();
        }
    }

    /* renamed from: com.facebook.aura.settings.HatchLegalWebPageScreenKt$HatchLegalWebPageOverlay$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onClose;
        public final /* synthetic */ String $title;
        public final /* synthetic */ String $url;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(String str, String str2, Function0<Unit> function0, BRg bRg, int i, int i2) {
            super(2);
            this.$url = str;
            this.$title = str2;
            this.$onClose = function0;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            HatchLegalWebPageScreenKt.HatchLegalWebPageOverlay(this.$url, this.$title, this.$onClose, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.settings.HatchLegalWebPageScreenKt$HatchLegalWebPageScreen$4, reason: invalid class name */
    /* loaded from: classes.dex */
    public final class AnonymousClass4 extends AbstractC7559F3s implements G2j<C1DG, C1DG, BFM, Integer, Unit> {
        public final /* synthetic */ MutableState<Boolean> $isLoading$delegate;
        public final /* synthetic */ String $loadingDescription;
        public final /* synthetic */ C6t6 $webView;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(C6t6 c6t6, String str, MutableState<Boolean> mutableState) {
            super(4);
            this.$webView = c6t6;
            this.$loadingDescription = str;
            this.$isLoading$delegate = mutableState;
        }

        @Override // X.G2j
        public /* bridge */ /* synthetic */ Unit invoke(C1DG c1dg, C1DG c1dg2, BFM bfm, Integer num) {
            m1954invokei1RSzL4(c1dg.A00, c1dg2.A00, bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        /* renamed from: invoke-i1RSzL4, reason: not valid java name */
        public final void m1954invokei1RSzL4(float f, float f2, BFM bfm, int i) {
            int iA04 = (i & 6) == 0 ? i | AnonymousClass004.A04(bfm, f) : i;
            if ((i & 48) == 0) {
                iA04 |= AnonymousClass004.A05(bfm, f2);
            }
            if (!AnonymousClass001.A1b(AnonymousClass002.A1P(iA04 & 147, 146), bfm, iA04)) {
                bfm.Afo();
                return;
            }
            BS0 bs0 = BRg.A00;
            C1062ATq c1062ATq = C10G.A01;
            C6t6 c6t6 = this.$webView;
            String str = this.$loadingDescription;
            MutableState<Boolean> mutableState = this.$isLoading$delegate;
            InterfaceC1380AiA interfaceC1380AiAA0c = AnonymousClass001.A0c(false);
            BBI bbi = (BBI) bfm;
            int iA0J = AnonymousClass003.A0J(bbi);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, c1062ATq);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function0);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA0c, akqA04, bRgA01, iA0J);
            C0z7 c0z7 = C0z7.A00;
            boolean zA67 = bfm.A67(c6t6);
            Object objAaT = bfm.AaT();
            if (zA67 || objAaT == C78N.A00) {
                objAaT = new HatchLegalWebPageScreenKt$HatchLegalWebPageScreen$4$1$1$1(c6t6);
                bfm.Ai0(objAaT);
            }
            AbstractC1532Ako.A02(bfm, C3U4.A0A(c1062ATq, f, f2), (G0U) objAaT, null, 0, 4);
            if (MutableState.A0A((MutableState) mutableState)) {
                bfm.AgE(-1874488761);
                BRg bRgA4C = c0z7.A4C(C2VU.A09, bs0);
                boolean zA65 = bfm.A65(str);
                Object objAaT2 = bfm.AaT();
                if (zA65 || objAaT2 == C78N.A00) {
                    objAaT2 = new HatchLegalWebPageScreenKt$HatchLegalWebPageScreen$4$1$2$1(str);
                    bfm.Ai0(objAaT2);
                }
                AuraSpinnerKt.m2611AuraSpinnerFNF3uiM(AnonymousClass001.A0Y(bRgA4C, objAaT2, false), AuraSpinnerStyle.Companion.large(bfm, 6), 0L, bfm, AuraSpinnerStyle.$stable << 3, 4);
            } else {
                bfm.AgE(-1874200461);
            }
            AnonymousClass003.A0q(bbi);
        }
    }

    /* renamed from: com.facebook.aura.settings.HatchLegalWebPageScreenKt$HatchLegalWebPageScreen$5, reason: invalid class name */
    /* loaded from: classes.dex */
    public final class AnonymousClass5 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onBack;
        public final /* synthetic */ String $title;
        public final /* synthetic */ String $url;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass5(String str, String str2, Function0<Unit> function0, BRg bRg, int i, int i2) {
            super(2);
            this.$url = str;
            this.$title = str2;
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
            HatchLegalWebPageScreenKt.HatchLegalWebPageScreen(this.$url, this.$title, this.$onBack, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    public static final void HatchLegalWebPageOverlay(String str, String str2, Function0<Unit> function0, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        AnonymousClass005.A10(str, str2, function0);
        bfm.AgG(-884254152);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, str) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0e(bfm, str2);
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
            C0n6.A00(bfm, new BA2(C79.A00, false, false, false, false), function0, B1V.A00(bfm, new AnonymousClass1(str, str2, function0, bRg2), 894684495), ((iA0d >> 6) & 14) | 432, 0);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass2(str, str2, function0, bRg2, i, i2);
        }
    }

    public static final void HatchLegalWebPageScreen(String str, String str2, Function0<Unit> function0, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        boolean zA1Z = AnonymousClass005.A1Z(str, str2, function0);
        bfm.AgG(804440804);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, str) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0e(bfm, str2);
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
            Context contextA0H = AnonymousClass002.A0H(bfm);
            String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120c58);
            Object objAaT = bfm.AaT();
            Object obj = C78N.A00;
            final MutableState mutableState = (MutableState) AnonymousClass005.A0g(bfm, objAaT, obj, zA1Z);
            boolean zA65 = bfm.A65(contextA0H);
            Object objAaT2 = bfm.AaT();
            Object obj2 = objAaT2;
            if (zA65 || objAaT2 == obj) {
                C6t6 c6t6 = new C6t6(contextA0H);
                c6t6.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
                c6t6.getSettings().setJavaScriptEnabled(zA1Z);
                c6t6.getSettings().setDomStorageEnabled(zA1Z);
                c6t6.setWebViewClient(new C6tA() { // from class: com.facebook.aura.settings.HatchLegalWebPageScreenKt$HatchLegalWebPageScreen$webView$1$1$1
                    @Override // X.C6tA
                    public void onPageFinished(WebView webView, String str3) {
                        MutableState.A09(false, mutableState);
                    }

                    @Override // X.C6tA
                    public void onPageStarted(WebView webView, String str3, Bitmap bitmap) {
                        MutableState.A09(true, mutableState);
                    }
                });
                bfm.Ai0(c6t6);
                obj2 = c6t6;
            }
            C6t6 c6t62 = (C6t6) obj2;
            boolean zA67 = bfm.A67(c6t62) | AnonymousClass004.A1F(iA0d);
            Object objAaT3 = bfm.AaT();
            if (zA67 || objAaT3 == obj) {
                objAaT3 = new HatchLegalWebPageScreenKt$HatchLegalWebPageScreen$1$1(c6t62, str, null);
                bfm.Ai0(objAaT3);
            }
            AnonymousClass001.A1A(bfm, objAaT3, c6t62, str);
            boolean zA672 = bfm.A67(c6t62);
            Object objAaT4 = bfm.AaT();
            if (zA672 || objAaT4 == obj) {
                objAaT4 = new HatchLegalWebPageScreenKt$HatchLegalWebPageScreen$2$1(c6t62);
                bfm.Ai0(objAaT4);
            }
            AnonymousClass001.A17(bfm, objAaT4, c6t62);
            boolean zA673 = bfm.A67(c6t62) | AnonymousClass004.A1K(iA0d);
            Object objAaT5 = bfm.AaT();
            if (zA673 || objAaT5 == obj) {
                objAaT5 = new HatchLegalWebPageScreenKt$HatchLegalWebPageScreen$3$1(c6t62, function0);
                bfm.Ai0(objAaT5);
            }
            B81.A00(zA1Z, (Function0) objAaT5, bfm, 6, 0);
            HatchPageScreenKt.m997HatchPageScreenZOcclw(AuraContainer.SecondaryScreen.INSTANCE, bRg2, AuraContentRole.Immersive, 0L, str2, null, function0, null, false, false, 0, null, null, null, null, null, null, 0L, 0L, null, 0.0f, null, null, null, 0, null, null, null, false, B1V.A00(bfm, new AnonymousClass4(c6t62, strA01, mutableState), -951461143), bfm, AnonymousClass001.A05(iA0d << 12, AnonymousClass001.A0B(iA0d << 9, ((iA0d >> 6) & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX) | 390)), 0, 805306368, 536870824);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass5(str, str2, function0, bRg2, i, i2);
        }
    }
}
