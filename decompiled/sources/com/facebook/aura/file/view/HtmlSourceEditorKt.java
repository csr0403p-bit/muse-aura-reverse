package com.facebook.aura.file.view;

import X.AKQ;
import X.AbstractC1754Apr;
import X.AbstractC2159Azp;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AxM;
import X.BBI;
import X.BBb;
import X.BFM;
import X.BRg;
import X.C00x;
import X.C1062ATq;
import X.C10G;
import X.C11U;
import X.C1515AkP;
import X.C1er;
import X.C3U4;
import X.C3UX;
import X.C3cH;
import X.C60O;
import X.C60Q;
import X.C6tn;
import X.C78N;
import X.F60;
import X.FGI;
import X.G0U;
import X.HxS;
import X.InterfaceC1380AiA;
import X.InterfaceC1516AkQ;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.vds.compose.base.AuraDimensKt;
import com.facebook.aura.vds.compose.theme.AuraTheme;
import com.facebook.aura.webview.HatchWebViewKt;
import com.facebook.aura.webview.WebContent;
import com.facebook.aura.webview.WebViewState;
import java.util.Arrays;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public abstract class HtmlSourceEditorKt {
    public static final String JS_INTERFACE_NAME = "AndroidBridge";

    /* renamed from: HtmlSourceEditor--jt2gSs, reason: not valid java name */
    public static final void m901HtmlSourceEditorjt2gSs(String str, G0U<? super String, Unit> g0u, BRg bRg, float f, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        float f2 = f;
        boolean zA1a = AnonymousClass002.A1a(str, g0u);
        bfm.AgG(75478264);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, str) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0U(bfm, g0u);
        }
        int i3 = i2 & 4;
        if (i3 != 0) {
            iA0d |= 384;
        } else if ((i & 384) == 0) {
            iA0d |= AnonymousClass004.A0f(bfm, bRg2);
        }
        int i4 = i2 & 8;
        if (i4 != 0) {
            iA0d |= 3072;
        } else if ((i & 3072) == 0) {
            iA0d |= AnonymousClass004.A07(bfm, f2);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1L(iA0d), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            if (i4 != 0) {
                f2 = 0.0f;
            }
            float fA00 = C60Q.A00(bfm);
            AuraTheme auraTheme = AuraTheme.INSTANCE;
            String strM902toCssHex8_81llA = m902toCssHex8_81llA(C60O.A01(bfm, auraTheme));
            String strM902toCssHex8_81llA2 = m902toCssHex8_81llA(C3cH.A06(bfm, auraTheme));
            Object objAaT = bfm.AaT();
            Object obj = C78N.A00;
            if (objAaT == obj) {
                objAaT = buildShellHtml(str, strM902toCssHex8_81llA, strM902toCssHex8_81llA2);
                bfm.Ai0(objAaT);
            }
            String str2 = (String) objAaT;
            MutableState mutableStateA00 = C1er.A00(bfm, g0u);
            C3UX c3ux = (C3UX) AnonymousClass004.A15(bfm, bfm.AaT(), obj);
            Object objAaT2 = bfm.AaT();
            if (objAaT2 == obj) {
                objAaT2 = new HtmlSourceBridge(new HtmlSourceEditorKt$HtmlSourceEditor$bridge$1$1(c3ux, mutableStateA00));
                bfm.Ai0(objAaT2);
            }
            HtmlSourceBridge htmlSourceBridge = (HtmlSourceBridge) objAaT2;
            Object objAaT3 = bfm.AaT();
            if (objAaT3 == obj) {
                objAaT3 = new WebViewState(new WebContent.Data(str2, null, "utf-8", "text/html", null));
                bfm.Ai0(objAaT3);
            }
            WebViewState webViewState = (WebViewState) objAaT3;
            BRg bRgA00 = AbstractC1754Apr.A00(C10G.A04(AnonymousClass001.A0R(bRg2), fA00));
            float f3 = AuraDimensKt.SpacingMedium;
            BRg bRgA01 = C11U.A01(C3U4.A0B(bRgA00, f3, f3), 12.0f);
            InterfaceC1380AiA interfaceC1380AiAA0c = AnonymousClass001.A0c(false);
            BBI bbi = (BBI) bfm;
            int iA0J = AnonymousClass003.A0J(bbi);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA012 = AxM.A01(bfm, bRgA01);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function0);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA0c, akqA04, bRgA012, iA0J);
            C1062ATq c1062ATq = C10G.A01;
            Object objAaT4 = bfm.AaT();
            if (objAaT4 == obj) {
                objAaT4 = new HtmlSourceEditorKt$HtmlSourceEditor$1$1$1(htmlSourceBridge);
                bfm.Ai0(objAaT4);
            }
            G0U g0u2 = (G0U) objAaT4;
            Object objAaT5 = bfm.AaT();
            if (objAaT5 == obj) {
                objAaT5 = HtmlSourceEditorKt$HtmlSourceEditor$1$2$1.INSTANCE;
                bfm.Ai0(objAaT5);
            }
            HatchWebViewKt.WebView(webViewState, c1062ATq, false, zA1a, false, null, g0u2, (G0U) objAaT5, false, null, null, null, bfm, 14158902, 0, 3892);
            BBI.A0R(bbi, zA1a);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new HtmlSourceEditorKt$HtmlSourceEditor$2(str, g0u, bRg2, f2, i, i2);
        }
    }

    public static final String escapeForPreElement(String str) {
        return AbstractC2159Azp.A0z(AbstractC2159Azp.A0z(AbstractC2159Azp.A0z(str, "&", "&amp;"), "<", "&lt;"), ">", "&gt;");
    }

    public static final String buildShellHtml(String str, String str2, String str3) {
        return C6tn.A05(FGI.A0m("\n<!doctype html>\n<html>\n<head>\n  <meta charset=\"utf-8\">\n  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, user-scalable=no\">\n  <style>\n    html, body { margin: 0; padding: 0; background: ", str2, "; color: ", str3, "; }\n    body { padding: 12px; }\n    #editor {\n      margin: 0;\n      font-family: monospace;\n      font-size: 14px;\n      line-height: 1.4;\n      white-space: pre;\n      word-break: normal;\n      outline: none;\n      caret-color: ", str3, ";\n      -webkit-user-select: text;\n    }\n  </style>\n</head>\n<body>\n  <pre id=\"editor\" contenteditable=\"true\" spellcheck=\"false\"\n       autocorrect=\"off\" autocapitalize=\"off\">", escapeForPreElement(str), "</pre>\n  <script>\n    (function() {\n      var ed = document.getElementById('editor');\n      var t = null;\n      ed.addEventListener('input', function() {\n        if (t) clearTimeout(t);\n        t = setTimeout(function() {\n          if (window.AndroidBridge && window.AndroidBridge.onChange) {\n            window.AndroidBridge.onChange(ed.innerText);\n          }\n        }, 250);\n      });\n    })();\n  </script>\n</body>\n</html>\n"));
    }

    /* renamed from: toCssHex-8_81llA, reason: not valid java name */
    public static final String m902toCssHex8_81llA(long j) {
        int iA01 = HxS.A01(j);
        return String.format("#%02x%02x%02x", Arrays.copyOf(new Object[]{Integer.valueOf((iA01 >> 16) & 255), Integer.valueOf((iA01 >> 8) & 255), Integer.valueOf(iA01 & 255)}, 3));
    }
}
