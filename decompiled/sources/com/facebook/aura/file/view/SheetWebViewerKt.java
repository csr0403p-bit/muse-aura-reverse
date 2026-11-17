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
import X.C60Q;
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
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.R;
import com.facebook.aura.file.view.SheetWebRenderState;
import com.facebook.aura.login.nativeflow.NativeLoginCheckpointContinuationKt;
import com.facebook.aura.network.transport.cache.CachingHatchHttpClientKt;
import com.facebook.aura.opengraph.HatchWebPageParserKt;
import com.facebook.aura.vds.compose.base.AuraDimensKt;
import com.facebook.aura.vds.compose.spinner.AuraSpinnerKt;
import java.io.File;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public abstract class SheetWebViewerKt {
    public static final String SHEET_TRANSFER_MIME_TYPE = "application/octet-stream";
    public static final String SHEET_VIEWER_ASSET_DOMAIN = "hatch-sheet-viewer.local";
    public static final String SHEET_VIEWER_ASSET_PATH_PREFIX = "/assets/";
    public static final String SHEET_VIEWER_BASE_URL = "https://hatch-sheet-viewer.local/assets/sheetviewer/";
    public static final String SHEET_VIEWER_DATA_FILE_NAME = "current.bin";
    public static final String SHEET_VIEWER_DATA_PATH_PREFIX = "/sheet/";
    public static final String SHEET_VIEWER_DATA_URL = "https://hatch-sheet-viewer.local/sheet/current.bin";
    public static final String SHEET_VIEWER_INDEX_URL = "https://hatch-sheet-viewer.local/assets/sheetviewer/index.html";
    public static final String TAG = "SheetWebViewer";

    /* renamed from: SheetWebContent--jt2gSs, reason: not valid java name */
    public static final void m926SheetWebContentjt2gSs(File file, String str, BRg bRg, float f, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        float f2 = f;
        boolean zA1b = AnonymousClass004.A1b(file, str);
        bfm.AgG(1880274638);
        int iA0T = (i & 6) == 0 ? AnonymousClass004.A0T(bfm, file) | i : i;
        if ((i & 48) == 0) {
            iA0T |= AnonymousClass004.A0e(bfm, str);
        }
        int i3 = i2 & 4;
        if (i3 != 0) {
            iA0T |= 384;
        } else if ((i & 384) == 0) {
            iA0T |= AnonymousClass004.A0f(bfm, bRg2);
        }
        int i4 = i2 & 8;
        if (i4 != 0) {
            iA0T |= 3072;
        } else if ((i & 3072) == 0) {
            iA0T |= AnonymousClass004.A07(bfm, f);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1L(iA0T), bfm, iA0T)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            if (i4 != 0) {
                f2 = 0.0f;
            }
            bfm.Ag8(-1237299939, file);
            m927SheetWebDocument942rkJo(file, str, f2, bRg2, bfm, (iA0T & 126) | ((iA0T >> 3) & 896) | ((iA0T << 3) & 7168), zA1b ? 1 : 0);
            AnonymousClass001.A1D(bfm);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new SheetWebViewerKt$SheetWebContent$1(file, str, bRg2, f2, i, i2);
        }
    }

    /* renamed from: SheetWebDocument-942rkJo, reason: not valid java name */
    public static final void m927SheetWebDocument942rkJo(File file, String str, float f, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(-1110674996);
        int iA0T = (i & 6) == 0 ? AnonymousClass004.A0T(bfm, file) | i : i;
        if ((i & 48) == 0) {
            iA0T |= AnonymousClass004.A0e(bfm, str);
        }
        if ((i & 384) == 0) {
            iA0T |= AnonymousClass004.A06(bfm, f);
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
            float fA00 = C60Q.A00(bfm);
            Object objAaT = bfm.AaT();
            Object obj = C78N.A00;
            MutableState mutableState = (MutableState) AnonymousClass005.A0g(bfm, objAaT, obj, false);
            Object objAaT2 = bfm.AaT();
            if (objAaT2 == obj) {
                objAaT2 = AnonymousClass004.A11(bfm, SheetWebRenderState.Loading.INSTANCE);
            }
            MutableState mutableState2 = (MutableState) objAaT2;
            C3UX c3ux = (C3UX) AnonymousClass004.A15(bfm, bfm.AaT(), obj);
            Unit unit = Unit.INSTANCE;
            boolean zA67 = bfm.A67(file);
            Object objAaT3 = bfm.AaT();
            if (zA67 || objAaT3 == obj) {
                objAaT3 = new SheetWebViewerKt$SheetWebDocument$1$1(file);
                bfm.Ai0(objAaT3);
            }
            AnonymousClass001.A17(bfm, objAaT3, unit);
            if (mutableState2.getValue() instanceof SheetWebRenderState.Error) {
                bfm.AgE(309751663);
                OpenExternallyCardKt.OpenExternallyCard(file, str, bRg2, AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f1209e0), bfm, (iA0T & 126) | ((iA0T >> 3) & 896), 0);
                AnonymousClass001.A1D(bfm);
            } else {
                bfm.AgE(310129925);
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
                    objAaT4 = new SheetWebViewerKt$SheetWebDocument$2$1$1(file, c3ux, mutableState2, mutableState);
                    bfm.Ai0(objAaT4);
                }
                G0U g0u2 = (G0U) objAaT4;
                Object objAaT5 = bfm.AaT();
                if (objAaT5 == obj) {
                    objAaT5 = SheetWebViewerKt$SheetWebDocument$2$2$1.INSTANCE;
                    bfm.Ai0(objAaT5);
                }
                G0U g0u3 = (G0U) ((InterfaceC7353EnQ) objAaT5);
                boolean zA1K = AnonymousClass004.A1K(iA0T);
                Object objAaT6 = bfm.AaT();
                if (zA1K || objAaT6 == obj) {
                    objAaT6 = new SheetWebViewerKt$SheetWebDocument$2$3$1(f, mutableState);
                    bfm.Ai0(objAaT6);
                }
                AbstractC1532Ako.A03(bfm, c1062ATq, g0u2, null, g0u3, (G0U) objAaT6, 3120, 4);
                if (mutableState2.getValue() instanceof SheetWebRenderState.Loading) {
                    bfm.AgE(373744523);
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
                    bfm.AgE(373915581);
                }
                AnonymousClass003.A0q(bbi);
                BBI.A0R(bbi, false);
            }
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new SheetWebViewerKt$SheetWebDocument$3(file, str, f, bRg2, i, i2);
        }
    }

    public static final void releaseSheetWebView(WebView webView) {
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
            CFK.A0A(TAG, "Failed to destroy spreadsheet WebView", thA00);
        }
    }

    public static final WebResourceResponse sheetEmptyResponse(int i, String str) {
        return new WebResourceResponse("text/plain", HatchWebPageParserKt.UTF_8, i, str, AnonymousClass006.A10(CachingHatchHttpClientKt.CACHE_CONTROL_HEADER, "no-store"), C60Q.A0T());
    }

    public static final boolean isSheetInlineResourceUrl(Uri uri) {
        return "data".equals(uri.getScheme()) || NativeLoginCheckpointContinuationKt.BLOB_PARAM.equals(uri.getScheme());
    }

    public static final boolean isSheetViewerUrl(Uri uri) {
        return C60Q.A1R(uri) && SHEET_VIEWER_ASSET_DOMAIN.equals(uri.getHost());
    }
}
