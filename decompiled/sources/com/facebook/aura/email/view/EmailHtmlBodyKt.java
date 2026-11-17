package com.facebook.aura.email.view;

import X.AXN;
import X.AbstractC1532Ako;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass011;
import X.BBb;
import X.BFM;
import X.BRg;
import X.C00r;
import X.C10G;
import X.C6tn;
import X.C78N;
import X.FGI;
import X.G0U;
import X.G0V;
import X.HxS;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.ui.HatchMarkdownTextKt;
import com.facebook.aura.vds.compose.theme.AuraColors;
import kotlin.Unit;

/* loaded from: classes.dex */
public abstract class EmailHtmlBodyKt {
    public static final String EMAIL_VIEWPORT = "<meta name=\"viewport\" content=\"width=device-width, minimum-scale=0.5\">";

    /* renamed from: com.facebook.aura.email.view.EmailHtmlBodyKt$EmailHtmlBody$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ String $fallback;
        public final /* synthetic */ String $html;
        public final /* synthetic */ BRg $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(String str, String str2, BRg bRg, int i, int i2) {
            super(2);
            this.$html = str;
            this.$fallback = str2;
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
            EmailHtmlBodyKt.EmailHtmlBody(this.$html, this.$fallback, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.email.view.EmailHtmlBodyKt$EmailHtmlBody$6, reason: invalid class name */
    public final class AnonymousClass6 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ String $fallback;
        public final /* synthetic */ String $html;
        public final /* synthetic */ BRg $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass6(String str, String str2, BRg bRg, int i, int i2) {
            super(2);
            this.$html = str;
            this.$fallback = str2;
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
            EmailHtmlBodyKt.EmailHtmlBody(this.$html, this.$fallback, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    public static final void EmailHtmlBody(String str, String str2, BRg bRg, BFM bfm, int i, int i2) {
        BBb bBbAAc;
        G0V<? super BFM, ? super Integer, Unit> anonymousClass6;
        BRg bRg2 = bRg;
        boolean zA1a = AnonymousClass002.A1a(str, str2);
        bfm.AgG(343681822);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, str) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0e(bfm, str2);
        }
        int i3 = i2 & 4;
        if (i3 != 0) {
            iA0d |= 384;
        } else if ((i & 384) == 0) {
            iA0d |= AnonymousClass004.A0f(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1J(iA0d), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            int i4 = iA0d & 14;
            boolean zA1Q = AnonymousClass002.A1Q(i4, 4);
            Object objAaT = bfm.AaT();
            if (zA1Q || objAaT == C78N.A00) {
                objAaT = AnonymousClass005.A0S(bfm, false);
            }
            MutableState mutableState = (MutableState) objAaT;
            boolean zA1Q2 = AnonymousClass002.A1Q(i4, 4);
            Object objAaT2 = bfm.AaT();
            if (zA1Q2 || objAaT2 == C78N.A00) {
                objAaT2 = AnonymousClass002.A0O(bfm, zA1a ? 1 : 0);
            }
            C00r c00r = (C00r) objAaT2;
            AXN axnA0Y = AnonymousClass002.A0Y(bfm);
            AuraColors auraColorsA0c = AnonymousClass002.A0c(bfm);
            int iA01 = HxS.A01(auraColorsA0c.background);
            boolean zA1R = AnonymousClass001.A1R(bfm, auraColorsA0c, AnonymousClass002.A1Q(i4, 4));
            Object objAaT3 = bfm.AaT();
            if (zA1R || objAaT3 == C78N.A00) {
                objAaT3 = emailHtmlDocument(str, auraColorsA0c);
                bfm.Ai0(objAaT3);
            }
            String str3 = (String) objAaT3;
            if (MutableState.A0A(mutableState)) {
                bfm.AgE(-576467120);
                HatchMarkdownTextKt.m2319HatchMarkdownTextT042LqI(str2, AnonymousClass001.A0R(bRg2), 0L, null, null, bfm, (iA0d >> 3) & 14, 28);
                bBbAAc = AnonymousClass002.A0Q(bfm, bfm);
                if (bBbAAc != null) {
                    anonymousClass6 = new AnonymousClass1(str, str2, bRg2, i, i2);
                    bBbAAc.A06 = anonymousClass6;
                }
                return;
            }
            AnonymousClass003.A0l(bfm, -576386396);
            BRg bRgA04 = C10G.A04(AnonymousClass001.A0R(bRg2), axnA0Y.Agy(c00r.AGd()));
            boolean zA65 = bfm.A65(mutableState);
            Object objAaT4 = bfm.AaT();
            if (zA65 || objAaT4 == C78N.A00) {
                objAaT4 = new EmailHtmlBodyKt$EmailHtmlBody$3$1(mutableState);
                bfm.Ai0(objAaT4);
            }
            G0U g0u = (G0U) objAaT4;
            Object objAaT5 = bfm.AaT();
            Object obj = C78N.A00;
            if (objAaT5 == obj) {
                objAaT5 = EmailHtmlBodyKt$EmailHtmlBody$4$1.INSTANCE;
                bfm.Ai0(objAaT5);
            }
            G0U g0u2 = (G0U) objAaT5;
            boolean zA1a2 = AnonymousClass001.A1a(AnonymousClass005.A1T(bfm, mutableState, str3, axnA0Y, bfm.A65(c00r)), bfm, iA01);
            Object objAaT6 = bfm.AaT();
            if (zA1a2 || objAaT6 == obj) {
                objAaT6 = new EmailHtmlBodyKt$EmailHtmlBody$5$1(str3, axnA0Y, iA01, c00r, mutableState);
                bfm.Ai0(objAaT6);
            }
            AbstractC1532Ako.A03(bfm, bRgA04, g0u, null, g0u2, (G0U) objAaT6, 3072, 4);
        } else {
            bfm.Afo();
        }
        bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            anonymousClass6 = new AnonymousClass6(str, str2, bRg2, i, i2);
            bBbAAc.A06 = anonymousClass6;
        }
    }

    public static final String emailHtmlDocument(String str, AuraColors auraColors) {
        String strM751cssColor8_81llA = m751cssColor8_81llA(auraColors.primaryText);
        return C6tn.A05(FGI.A0k("\n      <!doctype html><html><head>\n      <meta http-equiv=\"Content-Security-Policy\" content=\"default-src 'none'; img-src https://*.fbcdn.net data:; style-src 'unsafe-inline'; form-action 'none'; base-uri 'none'\">\n      <meta name=\"referrer\" content=\"no-referrer\">\n      <meta name=\"viewport\" content=\"width=device-width, minimum-scale=0.5\">\n      <base target=\"_blank\">\n      <style>@layer hch{html,body{margin:0;padding:0;background:transparent;color:", strM751cssColor8_81llA, ";font-family:sans-serif;overflow-wrap:break-word}body{display:flow-root;box-sizing:border-box;padding:0 2px}img{max-width:100%;height:auto;box-sizing:border-box}table{max-width:100%}", auraColors.isLight ? "" : FGI.A0k("html,body,body *,body *::before,body *::after{color:", strM751cssColor8_81llA, "!important;background-color:transparent!important;background-image:none!important;border-color:", m751cssColor8_81llA(auraColors.fillDivider), "!important}a,a *{color:", m751cssColor8_81llA(auraColors.link), "!important}"), "}</style>\n      </head><body><div id=\"hch-email-root\">", str, "</div><meta name=\"viewport\" content=\"width=device-width, minimum-scale=0.5\"></body></html>\n      "));
    }

    /* renamed from: cssColor-8_81llA, reason: not valid java name */
    public static final String m751cssColor8_81llA(long j) {
        int iA01 = HxS.A01(j);
        int i = (iA01 >> 16) & 255;
        int i2 = (iA01 >> 8) & 255;
        int i3 = iA01 & 255;
        float f = (iA01 >>> 24) / 255.0f;
        StringBuilder sb = new StringBuilder("rgba(");
        sb.append(i);
        sb.append(",");
        sb.append(i2);
        sb.append(",");
        sb.append(i3);
        sb.append(",");
        sb.append(f);
        return AnonymousClass001.A0v(")", sb);
    }
}
