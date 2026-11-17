package com.facebook.aura.file.view;

import X.AKQ;
import X.AbstractC1532Ako;
import X.AbstractC2271BQs;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.AxM;
import X.BBI;
import X.BBb;
import X.BFM;
import X.BPg;
import X.BRg;
import X.C00x;
import X.C1062ATq;
import X.C10G;
import X.C11U;
import X.C1515AkP;
import X.C3U4;
import X.C3UX;
import X.C3cG;
import X.C3cH;
import X.C3cI;
import X.C60P;
import X.C60Q;
import X.C7384Etj;
import X.C78N;
import X.CFK;
import X.F60;
import X.G0U;
import X.G0V;
import X.HsJ;
import X.InterfaceC1380AiA;
import X.InterfaceC1492Ajz;
import X.InterfaceC1516AkQ;
import X.InterfaceC7353EnQ;
import android.net.Uri;
import android.webkit.ValueCallback;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.R;
import com.facebook.aura.file.view.PptxRenderState;
import com.facebook.aura.login.nativeflow.NativeLoginCheckpointContinuationKt;
import com.facebook.aura.network.transport.cache.CachingHatchHttpClientKt;
import com.facebook.aura.opengraph.HatchWebPageParserKt;
import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;
import com.facebook.aura.vds.compose.base.AuraDimensKt;
import com.facebook.aura.vds.compose.spinner.AuraSpinnerKt;
import java.io.File;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public abstract class PptxViewerKt {
    public static final String PPTX_MIME_TYPE = "application/vnd.openxmlformats-officedocument.presentationml.presentation";
    public static final String PPTX_VIEWER_ASSET_DOMAIN = "hatch-pptx-viewer.local";
    public static final String PPTX_VIEWER_ASSET_PATH_PREFIX = "/assets/";
    public static final String PPTX_VIEWER_BASE_URL = "https://hatch-pptx-viewer.local/assets/pptxviewer/";
    public static final String PPTX_VIEWER_DATA_FILE_NAME = "current.pptx";
    public static final String PPTX_VIEWER_DATA_PATH_PREFIX = "/pptx/";
    public static final String PPTX_VIEWER_DATA_URL = "https://hatch-pptx-viewer.local/pptx/current.pptx";
    public static final String PPTX_VIEWER_INDEX_URL = "https://hatch-pptx-viewer.local/assets/pptxviewer/index.html";
    public static final String TAG = "PptxViewer";

    /* renamed from: PptxContent-6a0pyJM, reason: not valid java name */
    public static final void m923PptxContent6a0pyJM(File file, BRg bRg, float f, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        float f2 = f;
        C7384Etj.A0Y(file, 0);
        bfm.AgG(-360545811);
        int iA0T = (i & 6) == 0 ? AnonymousClass004.A0T(bfm, file) | i : i;
        int i3 = i2 & 2;
        if (i3 != 0) {
            iA0T |= 48;
        } else if ((i & 48) == 0) {
            iA0T |= AnonymousClass004.A0e(bfm, bRg);
        }
        int i4 = i2 & 4;
        if (i4 != 0) {
            iA0T |= 384;
        } else if ((i & 384) == 0) {
            iA0T |= AnonymousClass004.A06(bfm, f2);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1J(iA0T), bfm, iA0T)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            if (i4 != 0) {
                f2 = 0.0f;
            }
            bfm.Ag8(1407830272, file);
            m924PptxPresentationuFdPcIQ(file, f2, bRg2, bfm, (iA0T & 14) | ((iA0T >> 3) & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX) | ((iA0T << 3) & 896), 0);
            AnonymousClass001.A1D(bfm);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new PptxViewerKt$PptxContent$1(file, bRg2, f2, i, i2);
        }
    }

    /* renamed from: PptxPresentation-uFdPcIQ, reason: not valid java name */
    public static final void m924PptxPresentationuFdPcIQ(File file, float f, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(23902590);
        int iA0T = (i & 6) == 0 ? AnonymousClass004.A0T(bfm, file) | i : i;
        if ((i & 48) == 0) {
            iA0T |= AnonymousClass004.A05(bfm, f);
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
            float fA00 = C60Q.A00(bfm);
            Object objAaT = bfm.AaT();
            Object obj = C78N.A00;
            MutableState mutableState = (MutableState) AnonymousClass005.A0g(bfm, objAaT, obj, false);
            Object objAaT2 = bfm.AaT();
            if (objAaT2 == obj) {
                objAaT2 = AnonymousClass004.A11(bfm, PptxRenderState.Loading.INSTANCE);
            }
            MutableState mutableState2 = (MutableState) objAaT2;
            C3UX c3ux = (C3UX) AnonymousClass004.A15(bfm, bfm.AaT(), obj);
            Unit unit = Unit.INSTANCE;
            boolean zA67 = bfm.A67(file);
            Object objAaT3 = bfm.AaT();
            if (zA67 || objAaT3 == obj) {
                objAaT3 = new PptxViewerKt$PptxPresentation$1$1(file);
                bfm.Ai0(objAaT3);
            }
            AnonymousClass001.A17(bfm, objAaT3, unit);
            if (mutableState2.getValue() instanceof PptxRenderState.Error) {
                bfm.AgE(-882036873);
                OpenExternallyCardKt.OpenExternallyCard(file, PPTX_MIME_TYPE, bRg2, AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f1209e0), bfm, (iA0T & 14) | 48 | (iA0T & 896), 0);
            } else {
                bfm.AgE(-881642181);
                BRg bRgA01 = C11U.A01(C3U4.A07(C10G.A04(AnonymousClass001.A0R(bRg2), fA00), AuraDimensKt.SpacingMedium), 12.0f);
                InterfaceC1380AiA interfaceC1380AiAA0c = AnonymousClass001.A0c(false);
                BBI bbi = (BBI) bfm;
                int iA02 = C3cG.A02(bbi.A06);
                AKQ akqA04 = BBI.A04(bbi);
                BRg bRgA012 = AxM.A01(bfm, bRgA01);
                Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
                if (bbi.A0V == null) {
                    C00x.A00();
                    throw F60.createAndThrow();
                }
                AnonymousClass005.A0n(bfm, bbi, function0);
                G0V g0vA0v = C3cH.A0v(bfm, interfaceC1380AiAA0c);
                G0V<InterfaceC1516AkQ, InterfaceC1492Ajz, Unit> g0v = C1515AkP.A06;
                G0V g0vA19 = AnonymousClass004.A19(bfm, akqA04, g0v, iA02);
                G0U<InterfaceC1516AkQ, Unit> g0u = C1515AkP.A02;
                G0V g0vA0u = AnonymousClass002.A0u(bfm, bRgA012, g0u);
                C1062ATq c1062ATq = C10G.A01;
                boolean zA1M = AnonymousClass003.A1M(bfm, file, c3ux);
                Object objAaT4 = bfm.AaT();
                if (zA1M || objAaT4 == obj) {
                    objAaT4 = new PptxViewerKt$PptxPresentation$2$1$1(file, c3ux, mutableState2, mutableState);
                    bfm.Ai0(objAaT4);
                }
                G0U g0u2 = (G0U) objAaT4;
                Object objAaT5 = bfm.AaT();
                if (objAaT5 == obj) {
                    objAaT5 = PptxViewerKt$PptxPresentation$2$2$1.INSTANCE;
                    bfm.Ai0(objAaT5);
                }
                G0U g0u3 = (G0U) ((InterfaceC7353EnQ) objAaT5);
                boolean zA1C = AnonymousClass003.A1C(iA0T);
                Object objAaT6 = bfm.AaT();
                if (zA1C || objAaT6 == obj) {
                    objAaT6 = new PptxViewerKt$PptxPresentation$2$3$1(f, mutableState);
                    bfm.Ai0(objAaT6);
                }
                AbstractC1532Ako.A03(bfm, c1062ATq, g0u2, null, g0u3, (G0U) objAaT6, 3120, 4);
                if (mutableState2.getValue() instanceof PptxRenderState.Loading) {
                    bfm.AgE(-1860641685);
                    InterfaceC1380AiA interfaceC1380AiAA0a = AnonymousClass001.A0a();
                    int iA0D = AnonymousClass001.A0D(bbi);
                    AKQ akqA042 = BBI.A04(bbi);
                    BRg bRgA013 = AxM.A01(bfm, c1062ATq);
                    AnonymousClass005.A0n(bfm, bbi, function0);
                    BPg.A02(bfm, interfaceC1380AiAA0a, g0vA0v);
                    BPg.A02(bfm, akqA042, g0v);
                    AnonymousClass003.A15(g0u, g0vA19, bfm, iA0D);
                    BPg.A02(bfm, bRgA013, g0vA0u);
                    AuraSpinnerKt.m2611AuraSpinnerFNF3uiM(null, null, 0L, bfm, 0, 7);
                    BBI.A0R(bbi, true);
                } else {
                    bfm.AgE(-1860470627);
                }
                AnonymousClass003.A0q(bbi);
            }
            AnonymousClass001.A1D(bfm);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new PptxViewerKt$PptxPresentation$3(file, f, bRg2, i, i2);
        }
    }

    public static final WebResourceResponse emptyResponse(int i, String str) {
        return new WebResourceResponse("text/plain", HatchWebPageParserKt.UTF_8, i, str, AnonymousClass006.A10(CachingHatchHttpClientKt.CACHE_CONTROL_HEADER, "no-store"), C60Q.A0T());
    }

    public static final void fitPptxToViewport(final WebView webView, final Function0<Unit> function0) {
        webView.evaluateJavascript("(function() {\n  var container = document.querySelector('#document-container');\n  var slide = document.querySelector('.slide');\n  if (!container || !slide) {\n    return null;\n  }\n  var containerWidth = container.clientWidth;\n  var slideWidth = slide.getBoundingClientRect().width;\n  if (containerWidth <= 0 || !Number.isFinite(slideWidth) || slideWidth <= 0) {\n    return null;\n  }\n  return Math.max(0.01, Math.min(containerWidth * 0.95 / slideWidth, 1));\n})();", new ValueCallback() { // from class: com.facebook.aura.file.view.PptxViewerKt.fitPptxToViewport.1
            /* JADX WARN: Removed duplicated region for block: B:16:0x0058 A[PHI: r4
  0x0058: PHI (r4v1 java.lang.Float) = (r4v0 java.lang.Float), (r4v0 java.lang.Float), (r4v0 java.lang.Float), (r4v3 java.lang.Float) binds: [B:3:0x0008, B:5:0x0017, B:7:0x001c, B:12:0x0032] A[DONT_GENERATE, DONT_INLINE]] */
            @Override // android.webkit.ValueCallback
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void onReceiveValue(java.lang.String r6) {
                /*
                    r5 = this;
                    X.C7384Etj.A0X(r6)
                    java.lang.Float r0 = X.C9tJ.A0w(r6)
                    r4 = 0
                    if (r0 == 0) goto L58
                    float r3 = r0.floatValue()
                    float r1 = java.lang.Math.abs(r3)
                    r0 = 2139095039(0x7f7fffff, float:3.4028235E38)
                    int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
                    if (r0 > 0) goto L58
                    r0 = 0
                    int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
                    if (r0 <= 0) goto L58
                    r0 = 1008981770(0x3c23d70a, float:0.01)
                    float r1 = java.lang.Math.nextUp(r0)
                    int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
                    if (r0 >= 0) goto L2a
                    r3 = r1
                L2a:
                    java.lang.Float r4 = java.lang.Float.valueOf(r3)
                    r0 = 1065353216(0x3f800000, float:1.0)
                    int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
                    if (r0 >= 0) goto L58
                    r2 = 1
                    android.webkit.WebView r0 = r1
                    r0.zoomBy(r3)
                L3a:
                    java.lang.String r0 = "PPTX native fit zoomFactor="
                    java.lang.StringBuilder r1 = X.C3cG.A0f(r4, r0)
                    java.lang.String r0 = " applied="
                    java.lang.String r1 = X.C60P.A1P(r0, r1, r2)
                    java.lang.String r0 = "PptxViewer"
                    X.CFK.A05(r0, r1)
                    android.webkit.WebView r2 = r1
                    kotlin.jvm.functions.Function0<kotlin.Unit> r1 = r2
                    com.facebook.aura.file.view.PptxViewerKt$sam$java_lang_Runnable$0 r0 = new com.facebook.aura.file.view.PptxViewerKt$sam$java_lang_Runnable$0
                    r0.<init>(r1)
                    r2.postOnAnimation(r0)
                    return
                L58:
                    r2 = 0
                    goto L3a
                */
                throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.file.view.PptxViewerKt.AnonymousClass1.onReceiveValue(java.lang.String):void");
            }
        });
    }

    public static final void logPptxLayout(final WebView webView, final String str) {
        webView.evaluateJavascript("(function() {\n  var container = document.querySelector('#document-container');\n  var slide = document.querySelector('.slide');\n  var visualViewport = window.visualViewport;\n  var slideRect = slide ? slide.getBoundingClientRect() : null;\n  return JSON.stringify({\n    innerWidth: window.innerWidth,\n    outerWidth: window.outerWidth,\n    documentClientWidth: document.documentElement.clientWidth,\n    bodyClientWidth: document.body.clientWidth,\n    containerClientWidth: container ? container.clientWidth : null,\n    visualViewportWidth: visualViewport ? visualViewport.width : null,\n    visualViewportScale: visualViewport ? visualViewport.scale : null,\n    bodyZoom: document.body.style.zoom,\n    slideStyle: slide ? slide.getAttribute('style') : null,\n    slideRectWidth: slideRect ? slideRect.width : null,\n    slideRectHeight: slideRect ? slideRect.height : null,\n    slideScrollWidth: slide ? slide.scrollWidth : null,\n    slideScrollHeight: slide ? slide.scrollHeight : null\n  });\n})();", new ValueCallback() { // from class: com.facebook.aura.file.view.PptxViewerKt.logPptxLayout.1
            @Override // android.webkit.ValueCallback
            public final void onReceiveValue(String str2) {
                String str3 = str;
                int width = webView.getWidth();
                int height = webView.getHeight();
                float f = webView.getResources().getDisplayMetrics().density;
                boolean useWideViewPort = webView.getSettings().getUseWideViewPort();
                boolean loadWithOverviewMode = webView.getSettings().getLoadWithOverviewMode();
                StringBuilder sbA0x = C3cI.A0x("PPTX layout stage=", str3);
                sbA0x.append(" view=");
                sbA0x.append(width);
                sbA0x.append("x");
                sbA0x.append(height);
                sbA0x.append(" density=");
                sbA0x.append(f);
                sbA0x.append(" wideViewport=");
                sbA0x.append(useWideViewPort);
                sbA0x.append(" overview=");
                sbA0x.append(loadWithOverviewMode);
                CFK.A05(PptxViewerKt.TAG, C60P.A1M(" details=", str2, sbA0x));
            }
        });
    }

    public static final void releasePptxWebView(WebView webView) {
        Object objA0s;
        try {
            webView.removeJavascriptInterface(HtmlSourceEditorKt.JS_INTERFACE_NAME);
        } catch (Throwable th) {
            C3cG.A0s(th);
        }
        try {
            webView.stopLoading();
        } catch (Throwable th2) {
            C3cG.A0s(th2);
        }
        try {
            webView.clearHistory();
        } catch (Throwable th3) {
            C3cG.A0s(th3);
        }
        try {
            webView.removeAllViews();
        } catch (Throwable th4) {
            C3cG.A0s(th4);
        }
        try {
            webView.destroy();
            objA0s = Unit.INSTANCE;
        } catch (Throwable th5) {
            objA0s = C3cG.A0s(th5);
        }
        Throwable thA00 = HsJ.A00(objA0s);
        if (thA00 != null) {
            CFK.A0A(TAG, "Failed to destroy PPTX WebView", thA00);
        }
    }

    public static final boolean isInlineResourceUrl(Uri uri) {
        return "data".equals(uri.getScheme()) || NativeLoginCheckpointContinuationKt.BLOB_PARAM.equals(uri.getScheme());
    }

    public static final boolean isPptxViewerUrl(Uri uri) {
        return C60Q.A1R(uri) && PPTX_VIEWER_ASSET_DOMAIN.equals(uri.getHost());
    }
}
