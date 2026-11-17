package com.facebook.aura.conversation.view.richcontent;

import X.AbstractC07127nr;
import X.AbstractC0878AGe;
import X.AbstractC7611F5y;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.BFI;
import X.BV4;
import X.C06827l3;
import X.C06H;
import X.C0881AGi;
import X.C3UX;
import X.C3cG;
import X.C3cH;
import X.C3cI;
import X.C60O;
import X.C6tn;
import X.C7384Etj;
import X.C7Bm;
import X.C8j3;
import X.C9258GBl;
import X.CFK;
import X.FGI;
import X.G0U;
import X.G0V;
import X.GBL;
import X.HBA;
import X.Hm1;
import X.HtJ;
import X.HzP;
import X.InterfaceC2261BLa;
import android.content.Context;
import android.os.Handler;
import android.util.LruCache;
import android.webkit.JavascriptInterface;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.facebook.aura.conversation.view.richcontent.MermaidSvgRenderer;
import com.facebook.aura.memory.AuraMemoryPressure;
import com.facebook.aura.memory.AuraMemoryPressureLevel;
import com.facebook.aura.memory.AuraTrimmable;
import com.facebook.aura.opengraph.HatchWebPageParserKt;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* loaded from: classes6.dex */
public final class MermaidSvgRenderer {
    public static final int $stable = 0;
    public static final int BYTES_PER_CHAR = 2;
    public static final int ERROR_OVERHEAD_BYTES = 256;
    public static final long INIT_POLL_INTERVAL_MS = 50;
    public static final int MAX_CACHE_BYTES = 2097152;
    public static final int PARSED_SVG_OVERHEAD_BYTES = 4096;
    public static final long RENDER_TIMEOUT_MS = 10000;
    public static final String TAG = "MermaidSvgRenderer";
    public static volatile boolean isWebViewReady;
    public static WebView webView;
    public static final MermaidSvgRenderer INSTANCE = new MermaidSvgRenderer();
    public static final C06827l3 WORD_SPACE = C06827l3.A02("(<tspan [^>]*class=\"text-inner-tspan\"[^>]*>) ");
    public static final Handler uiHandler = C60O.A02();
    public static final InterfaceC2261BLa renderMutex = new C9258GBl();
    public static final MermaidSvgRenderer$svgCache$1 svgCache = new LruCache<String, RenderResult>() { // from class: com.facebook.aura.conversation.view.richcontent.MermaidSvgRenderer$svgCache$1
        @Override // android.util.LruCache
        public int sizeOf(String str, MermaidSvgRenderer.RenderResult renderResult) {
            C7384Etj.A0Y(renderResult, 1);
            if (renderResult instanceof MermaidSvgRenderer.RenderResult.Success) {
                return (((MermaidSvgRenderer.RenderResult.Success) renderResult).svgString.length() * 2) + 4096;
            }
            if (renderResult instanceof MermaidSvgRenderer.RenderResult.Error) {
                return (((MermaidSvgRenderer.RenderResult.Error) renderResult).message.length() * 2) + 256;
            }
            throw C3cG.A0q();
        }
    };
    public static final AtomicBoolean cacheCallbacksAttached = BV4.A12(false);
    public static final AuraTrimmable cacheCallbacks = new AuraTrimmable() { // from class: com.facebook.aura.conversation.view.richcontent.MermaidSvgRenderer$cacheCallbacks$1
        @Override // com.facebook.aura.memory.AuraTrimmable
        public final void onMemoryPressure(AuraMemoryPressureLevel auraMemoryPressureLevel) {
            MermaidSvgRenderer$svgCache$1 mermaidSvgRenderer$svgCache$1;
            int i;
            C7384Etj.A0Y(auraMemoryPressureLevel, 0);
            int iOrdinal = auraMemoryPressureLevel.ordinal();
            if (iOrdinal == 0) {
                mermaidSvgRenderer$svgCache$1 = MermaidSvgRenderer.svgCache;
                i = 1048576;
            } else {
                if (iOrdinal != 1 && iOrdinal != 2) {
                    if (iOrdinal != 3) {
                        throw C3cG.A0q();
                    }
                    MermaidSvgRenderer.svgCache.evictAll();
                    MermaidSvgRenderer.INSTANCE.destroyIdleWebView();
                    return;
                }
                mermaidSvgRenderer$svgCache$1 = MermaidSvgRenderer.svgCache;
                i = 524288;
            }
            mermaidSvgRenderer$svgCache$1.trimToSize(i);
        }

        /* loaded from: classes5.dex */
        public abstract /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[AuraMemoryPressureLevel.values().length];
                try {
                    AnonymousClass002.A13(AuraMemoryPressureLevel.MODERATE, iArr);
                } catch (NoSuchFieldError unused) {
                }
                try {
                    AnonymousClass002.A14(AuraMemoryPressureLevel.BACKGROUNDED, iArr);
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    AnonymousClass002.A15(AuraMemoryPressureLevel.LOW, iArr);
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    AnonymousClass002.A16(AuraMemoryPressureLevel.CRITICAL, iArr);
                } catch (NoSuchFieldError unused4) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }
    };
    public static final AtomicReference<G0U<RawRenderResult, Unit>> pendingCallback = BV4.A16(null);

    public final class MermaidBridge {
        @JavascriptInterface
        public final void onRenderError(String str) {
            C7384Etj.A0Y(str, 0);
            CFK.A06(MermaidSvgRenderer.TAG, FGI.A0M("Mermaid render error: ", str));
            G0U g0u = (G0U) C8j3.A10(MermaidSvgRenderer.pendingCallback);
            if (g0u != null) {
                g0u.invoke(new RawRenderResult.Error(str));
            }
        }

        @JavascriptInterface
        public final void onSvgRendered(String str) {
            C7384Etj.A0Y(str, 0);
            G0U g0u = (G0U) C8j3.A10(MermaidSvgRenderer.pendingCallback);
            if (g0u != null) {
                g0u.invoke(new RawRenderResult.Success(str));
            }
        }
    }

    @DebugMetadata(c = "com.facebook.aura.conversation.view.richcontent.MermaidSvgRenderer", f = "MermaidSvgRenderer.kt", l = {169}, m = "renderToSvg", v = 2)
    /* renamed from: com.facebook.aura.conversation.view.richcontent.MermaidSvgRenderer$renderToSvg$1, reason: invalid class name and case insensitive filesystem */
    public final class C115251 extends HzP {
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public Object L$4;
        public Object L$5;
        public Object L$6;
        public Object L$7;
        public Object L$8;
        public int label;
        public /* synthetic */ Object result;

        public C115251(HtJ<? super C115251> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return MermaidSvgRenderer.this.renderToSvg(null, null, null, null, null, null, null, null, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.conversation.view.richcontent.MermaidSvgRenderer$renderToSvg$3", f = "MermaidSvgRenderer.kt", l = {453, 176, 184, 194}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.conversation.view.richcontent.MermaidSvgRenderer$renderToSvg$3, reason: invalid class name */
    public final class AnonymousClass3 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super RenderResult>, Object> {
        public final /* synthetic */ String $bgColor;
        public final /* synthetic */ String $cacheKey;
        public final /* synthetic */ List<String> $chartColors;
        public final /* synthetic */ Context $context;
        public final /* synthetic */ String $lineColor;
        public final /* synthetic */ String $mermaidSource;
        public final /* synthetic */ String $nodeBgColor;
        public final /* synthetic */ String $nodeBorderColor;
        public final /* synthetic */ String $textColor;
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public Object L$4;
        public Object L$5;
        public Object L$6;
        public Object L$7;
        public Object L$8;
        public Object L$9;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(String str, Context context, String str2, String str3, String str4, String str5, String str6, String str7, List<String> list, HtJ<? super AnonymousClass3> htJ) {
            super(2, htJ);
            this.$cacheKey = str;
            this.$context = context;
            this.$mermaidSource = str2;
            this.$bgColor = str3;
            this.$nodeBgColor = str4;
            this.$textColor = str5;
            this.$lineColor = str6;
            this.$nodeBorderColor = str7;
            this.$chartColors = list;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new AnonymousClass3(this.$cacheKey, this.$context, this.$mermaidSource, this.$bgColor, this.$nodeBgColor, this.$textColor, this.$lineColor, this.$nodeBorderColor, this.$chartColors, htJ);
        }

        /* JADX WARN: Removed duplicated region for block: B:27:0x00ed A[Catch: all -> 0x0155, TryCatch #1 {all -> 0x0155, blocks: (B:24:0x00e4, B:25:0x00e7, B:27:0x00ed, B:28:0x00f5), top: B:46:0x00e4 }] */
        /* JADX WARN: Removed duplicated region for block: B:28:0x00f5 A[Catch: all -> 0x0155, TryCatch #1 {all -> 0x0155, blocks: (B:24:0x00e4, B:25:0x00e7, B:27:0x00ed, B:28:0x00f5), top: B:46:0x00e4 }] */
        /* JADX WARN: Removed duplicated region for block: B:34:0x0144 A[RETURN] */
        @Override // X.AbstractC8884Fsp
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r26) throws java.lang.Throwable {
            /*
                Method dump skipped, instructions count: 346
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.conversation.view.richcontent.MermaidSvgRenderer.AnonymousClass3.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super RenderResult> htJ) {
            return ((AnonymousClass3) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.conversation.view.richcontent.MermaidSvgRenderer", f = "MermaidSvgRenderer.kt", l = {273}, m = "waitForWebViewReady", v = 2)
    /* renamed from: com.facebook.aura.conversation.view.richcontent.MermaidSvgRenderer$waitForWebViewReady$1, reason: invalid class name and case insensitive filesystem */
    public final class C115261 extends HzP {
        public long J$0;
        public int label;
        public /* synthetic */ Object result;

        public C115261(HtJ<? super C115261> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return MermaidSvgRenderer.this.waitForWebViewReady(this);
        }
    }

    public abstract class RawRenderResult {

        public final class Error extends RawRenderResult {
            public static final int $stable = 0;
            public final String message;

            public Error(String str) {
                C7384Etj.A0Y(str, 0);
                this.message = str;
            }

            public final Error copy(String str) {
                C7384Etj.A0Y(str, 0);
                return new Error(str);
            }

            public boolean equals(Object obj) {
                return this == obj || ((obj instanceof Error) && C7384Etj.areEqual(this.message, ((Error) obj).message));
            }

            public static /* synthetic */ Error copy$default(Error error, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = error.message;
                }
                C7384Etj.A0Y(str, 0);
                return new Error(str);
            }

            public final String component1() {
                return this.message;
            }

            public final String getMessage() {
                return this.message;
            }

            public int hashCode() {
                return this.message.hashCode();
            }

            public String toString() {
                return super.toString();
            }
        }

        public final class Success extends RawRenderResult {
            public static final int $stable = 0;
            public final String svgString;

            public Success(String str) {
                C7384Etj.A0Y(str, 0);
                this.svgString = str;
            }

            public final Success copy(String str) {
                C7384Etj.A0Y(str, 0);
                return new Success(str);
            }

            public boolean equals(Object obj) {
                return this == obj || ((obj instanceof Success) && C7384Etj.areEqual(this.svgString, ((Success) obj).svgString));
            }

            public static /* synthetic */ Success copy$default(Success success, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = success.svgString;
                }
                C7384Etj.A0Y(str, 0);
                return new Success(str);
            }

            public final String component1() {
                return this.svgString;
            }

            public final String getSvgString() {
                return this.svgString;
            }

            public int hashCode() {
                return this.svgString.hashCode();
            }

            public String toString() {
                return super.toString();
            }
        }

        public RawRenderResult() {
        }

        public /* synthetic */ RawRenderResult(C06H c06h) {
        }
    }

    public abstract class RenderResult {
        public static final int $stable = 8;

        public final class Error extends RenderResult {
            public static final int $stable = 0;
            public final String message;

            public Error(String str) {
                C7384Etj.A0Y(str, 0);
                this.message = str;
            }

            public final Error copy(String str) {
                C7384Etj.A0Y(str, 0);
                return new Error(str);
            }

            public boolean equals(Object obj) {
                return this == obj || ((obj instanceof Error) && C7384Etj.areEqual(this.message, ((Error) obj).message));
            }

            public static /* synthetic */ Error copy$default(Error error, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = error.message;
                }
                C7384Etj.A0Y(str, 0);
                return new Error(str);
            }

            public final String component1() {
                return this.message;
            }

            public final String getMessage() {
                return this.message;
            }

            public int hashCode() {
                return this.message.hashCode();
            }

            public String toString() {
                return super.toString();
            }
        }

        public final class Success extends RenderResult {
            public static final int $stable = 8;
            public final HBA parsedSvg;
            public final String svgString;

            public final HBA getParsedSvg() {
                return this.parsedSvg;
            }

            public final String getSvgString() {
                return this.svgString;
            }

            public Success(String str, HBA hba) {
                AnonymousClass003.A0u(str, hba);
                this.svgString = str;
                this.parsedSvg = hba;
            }
        }

        public RenderResult() {
        }

        public /* synthetic */ RenderResult(C06H c06h) {
        }
    }

    private final void attachMemoryCallbacksIfNeeded() {
        if (C3cI.A1W(cacheCallbacksAttached)) {
            AuraMemoryPressure.INSTANCE.register(cacheCallbacks);
        }
    }

    private final String buildCacheKey(String... strArr) {
        return String.valueOf(BFI.A0B("|", "", "", null, strArr).hashCode());
    }

    private final String buildRendererHtml() {
        return "<!DOCTYPE html>\n<html>\n<head>\n  <meta charset=\"utf-8\">\n  <script src=\"https://cdn.jsdelivr.net/npm/mermaid@11/dist/mermaid.min.js\"></script>\n</head>\n<body>\n  <div id=\"container\" style=\"position:absolute;left:-9999px;width:2000px;\"></div>\n  <script>\n    mermaid.initialize({ startOnLoad: false, theme: 'base' });\n    var renderCount = 0;\n\n    async function renderMermaid(source, bgColor, nodeBgColor, textColor, lineColor, nodeBorderColor, chartColors) {\n      var c = chartColors && chartColors.length >= 12 ? chartColors : [\n        '#0064D4', '#25B159', '#FF9500', '#FF453A', '#FFEC80', '#E5E5E5',\n        '#7F7F7F', '#E7E7E7', '#0064D4', '#25B159', '#FF9500', '#FF453A'\n      ];\n      try {\n        mermaid.initialize({\n          startOnLoad: false,\n          theme: 'base',\n          htmlLabels: false,\n          flowchart: { htmlLabels: false },\n          gantt: { htmlLabels: false },\n          er: { htmlLabels: false },\n          class: { htmlLabels: false },\n          state: { htmlLabels: false },\n          journey: { htmlLabels: false },\n          mindmap: { htmlLabels: false },\n          timeline: { htmlLabels: false },\n          gitGraph: { htmlLabels: false },\n          xyChart: { plotColorPalette: c.join(',') },\n          themeVariables: {\n            background: bgColor,\n            primaryColor: nodeBgColor,\n            secondaryColor: c[1],\n            tertiaryColor: c[2],\n            mainBkg: nodeBgColor,\n            primaryTextColor: textColor,\n            secondaryTextColor: textColor,\n            tertiaryTextColor: textColor,\n            titleColor: textColor,\n            lineColor: lineColor,\n            primaryBorderColor: nodeBorderColor,\n            nodeBorder: nodeBorderColor,\n            fontFamily: 'sans-serif',\n            pie1: c[0], pie2: c[1], pie3: c[2], pie4: c[3],\n            pie5: c[4], pie6: c[5], pie7: c[6], pie8: c[7],\n            pie9: c[8], pie10: c[9], pie11: c[10], pie12: c[11],\n            pieTitleTextSize: '16px',\n            pieTitleTextColor: textColor,\n            pieSectionTextSize: '14px',\n            pieSectionTextColor: textColor,\n            pieLegendTextSize: '14px',\n            pieLegendTextColor: textColor,\n            pieStrokeColor: nodeBorderColor,\n            pieOuterStrokeColor: nodeBorderColor,\n            pieOpacity: '1',\n            cScale0: c[0], cScale1: c[1], cScale2: c[2], cScale3: c[3],\n            cScale4: c[4], cScale5: c[5], cScale6: c[6], cScale7: c[7],\n            cScale8: c[8], cScale9: c[9], cScale10: c[10], cScale11: c[11],\n            cScaleLabel0: textColor, cScaleLabel1: textColor,\n            cScaleLabel2: textColor, cScaleLabel3: textColor,\n            cScaleLabel4: textColor, cScaleLabel5: textColor,\n            cScaleLabel6: textColor, cScaleLabel7: textColor,\n            cScaleLabel8: textColor, cScaleLabel9: textColor,\n            cScaleLabel10: textColor, cScaleLabel11: textColor,\n            sectionBkgColor: c[0], sectionBkgColor0: c[0],\n            sectionBkgColor1: c[1], sectionBkgColor2: c[2],\n            sectionBkgColor3: c[3], sectionBkgColor4: c[4],\n            sectionBkgColor5: c[5], sectionBkgColor6: c[6],\n            sectionBkgColor7: c[7],\n            altSectionBkgColor: c[1],\n            taskBkgColor: c[0], activeTaskBkgColor: c[2],\n            doneTaskBkgColor: c[3], taskTextColor: textColor,\n            git0: c[0], git1: c[1], git2: c[2], git3: c[3],\n            git4: c[4], git5: c[5], git6: c[0], git7: c[1],\n            gitBranchLabel0: textColor, gitBranchLabel1: textColor,\n            gitBranchLabel2: textColor, gitBranchLabel3: textColor,\n            gitBranchLabel4: textColor, gitBranchLabel5: textColor,\n            gitBranchLabel6: textColor, gitBranchLabel7: textColor,\n            commitLabelColor: textColor, commitLabelBackground: bgColor\n          }\n        });\n        var id = 'mermaid-render-' + (renderCount++);\n        var container = document.getElementById('container');\n        var result = await mermaid.render(id, source, container);\n        MermaidBridge.onSvgRendered(result.svg);\n      } catch(e) {\n        MermaidBridge.onRenderError(e.message || 'Unknown error');\n      }\n    }\n  </script>\n</body>\n</html>";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void createWebView(Context context) {
        WebView webView2 = new WebView(context);
        webView2.layout(0, 0, 1080, 1920);
        webView2.getSettings().setJavaScriptEnabled(true);
        webView2.setWebViewClient(new WebViewClient() { // from class: com.facebook.aura.conversation.view.richcontent.MermaidSvgRenderer$createWebView$1$1
            @Override // android.webkit.WebViewClient
            public void onPageFinished(WebView webView3, String str) {
                MermaidSvgRenderer.isWebViewReady = true;
            }
        });
        webView2.addJavascriptInterface(new MermaidBridge(), "MermaidBridge");
        webView2.loadDataWithBaseURL(null, "<!DOCTYPE html>\n<html>\n<head>\n  <meta charset=\"utf-8\">\n  <script src=\"https://cdn.jsdelivr.net/npm/mermaid@11/dist/mermaid.min.js\"></script>\n</head>\n<body>\n  <div id=\"container\" style=\"position:absolute;left:-9999px;width:2000px;\"></div>\n  <script>\n    mermaid.initialize({ startOnLoad: false, theme: 'base' });\n    var renderCount = 0;\n\n    async function renderMermaid(source, bgColor, nodeBgColor, textColor, lineColor, nodeBorderColor, chartColors) {\n      var c = chartColors && chartColors.length >= 12 ? chartColors : [\n        '#0064D4', '#25B159', '#FF9500', '#FF453A', '#FFEC80', '#E5E5E5',\n        '#7F7F7F', '#E7E7E7', '#0064D4', '#25B159', '#FF9500', '#FF453A'\n      ];\n      try {\n        mermaid.initialize({\n          startOnLoad: false,\n          theme: 'base',\n          htmlLabels: false,\n          flowchart: { htmlLabels: false },\n          gantt: { htmlLabels: false },\n          er: { htmlLabels: false },\n          class: { htmlLabels: false },\n          state: { htmlLabels: false },\n          journey: { htmlLabels: false },\n          mindmap: { htmlLabels: false },\n          timeline: { htmlLabels: false },\n          gitGraph: { htmlLabels: false },\n          xyChart: { plotColorPalette: c.join(',') },\n          themeVariables: {\n            background: bgColor,\n            primaryColor: nodeBgColor,\n            secondaryColor: c[1],\n            tertiaryColor: c[2],\n            mainBkg: nodeBgColor,\n            primaryTextColor: textColor,\n            secondaryTextColor: textColor,\n            tertiaryTextColor: textColor,\n            titleColor: textColor,\n            lineColor: lineColor,\n            primaryBorderColor: nodeBorderColor,\n            nodeBorder: nodeBorderColor,\n            fontFamily: 'sans-serif',\n            pie1: c[0], pie2: c[1], pie3: c[2], pie4: c[3],\n            pie5: c[4], pie6: c[5], pie7: c[6], pie8: c[7],\n            pie9: c[8], pie10: c[9], pie11: c[10], pie12: c[11],\n            pieTitleTextSize: '16px',\n            pieTitleTextColor: textColor,\n            pieSectionTextSize: '14px',\n            pieSectionTextColor: textColor,\n            pieLegendTextSize: '14px',\n            pieLegendTextColor: textColor,\n            pieStrokeColor: nodeBorderColor,\n            pieOuterStrokeColor: nodeBorderColor,\n            pieOpacity: '1',\n            cScale0: c[0], cScale1: c[1], cScale2: c[2], cScale3: c[3],\n            cScale4: c[4], cScale5: c[5], cScale6: c[6], cScale7: c[7],\n            cScale8: c[8], cScale9: c[9], cScale10: c[10], cScale11: c[11],\n            cScaleLabel0: textColor, cScaleLabel1: textColor,\n            cScaleLabel2: textColor, cScaleLabel3: textColor,\n            cScaleLabel4: textColor, cScaleLabel5: textColor,\n            cScaleLabel6: textColor, cScaleLabel7: textColor,\n            cScaleLabel8: textColor, cScaleLabel9: textColor,\n            cScaleLabel10: textColor, cScaleLabel11: textColor,\n            sectionBkgColor: c[0], sectionBkgColor0: c[0],\n            sectionBkgColor1: c[1], sectionBkgColor2: c[2],\n            sectionBkgColor3: c[3], sectionBkgColor4: c[4],\n            sectionBkgColor5: c[5], sectionBkgColor6: c[6],\n            sectionBkgColor7: c[7],\n            altSectionBkgColor: c[1],\n            taskBkgColor: c[0], activeTaskBkgColor: c[2],\n            doneTaskBkgColor: c[3], taskTextColor: textColor,\n            git0: c[0], git1: c[1], git2: c[2], git3: c[3],\n            git4: c[4], git5: c[5], git6: c[0], git7: c[1],\n            gitBranchLabel0: textColor, gitBranchLabel1: textColor,\n            gitBranchLabel2: textColor, gitBranchLabel3: textColor,\n            gitBranchLabel4: textColor, gitBranchLabel5: textColor,\n            gitBranchLabel6: textColor, gitBranchLabel7: textColor,\n            commitLabelColor: textColor, commitLabelBackground: bgColor\n          }\n        });\n        var id = 'mermaid-render-' + (renderCount++);\n        var container = document.getElementById('container');\n        var result = await mermaid.render(id, source, container);\n        MermaidBridge.onSvgRendered(result.svg);\n      } catch(e) {\n        MermaidBridge.onRenderError(e.message || 'Unknown error');\n      }\n    }\n  </script>\n</body>\n</html>", "text/html", HatchWebPageParserKt.UTF_8, null);
        webView = webView2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void destroyIdleWebView() {
        uiHandler.post(new Runnable() { // from class: com.facebook.aura.conversation.view.richcontent.MermaidSvgRenderer.destroyIdleWebView.1
            @Override // java.lang.Runnable
            public final void run() {
                WebView webView2;
                if (MermaidSvgRenderer.renderMutex.AOf() || MermaidSvgRenderer.pendingCallback.get() != null || (webView2 = MermaidSvgRenderer.webView) == null) {
                    return;
                }
                MermaidSvgRenderer.webView = null;
                MermaidSvgRenderer.isWebViewReady = false;
                try {
                    webView2.stopLoading();
                } catch (Throwable th) {
                    C3cG.A0s(th);
                }
                try {
                    webView2.setWebViewClient(new WebViewClient());
                } catch (Throwable th2) {
                    C3cG.A0s(th2);
                }
                try {
                    webView2.removeAllViews();
                } catch (Throwable th3) {
                    C3cG.A0s(th3);
                }
                try {
                    webView2.destroy();
                } catch (Throwable th4) {
                    C3cG.A0s(th4);
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void ensureWebViewInitialized(final Context context) throws InterruptedException {
        if (webView == null) {
            if (C3cH.A1K()) {
                createWebView(context);
                return;
            }
            final CountDownLatch countDownLatch = new CountDownLatch(1);
            uiHandler.post(new Runnable() { // from class: com.facebook.aura.conversation.view.richcontent.MermaidSvgRenderer.ensureWebViewInitialized.1
                @Override // java.lang.Runnable
                public final void run() {
                    MermaidSvgRenderer.INSTANCE.createWebView(context);
                    countDownLatch.countDown();
                }
            });
            countDownLatch.await();
        }
    }

    public static /* synthetic */ void getUiHandler$annotations() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Object renderToSvg$default(MermaidSvgRenderer mermaidSvgRenderer, Context context, String str, String str2, String str3, String str4, String str5, String str6, List list, HtJ htJ, int i, Object obj) {
        if ((i & 128) != 0) {
            list = C0881AGi.A00;
        }
        return mermaidSvgRenderer.renderToSvg(context, str, str2, str3, str4, str5, str6, list, htJ);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0057  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object waitForWebViewReady(X.HtJ<? super java.lang.Boolean> r10) {
        /*
            r9 = this;
            boolean r0 = r10 instanceof com.facebook.aura.conversation.view.richcontent.MermaidSvgRenderer.C115261
            if (r0 == 0) goto L57
            r8 = r10
            com.facebook.aura.conversation.view.richcontent.MermaidSvgRenderer$waitForWebViewReady$1 r8 = (com.facebook.aura.conversation.view.richcontent.MermaidSvgRenderer.C115261) r8
            int r2 = r8.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L57
            int r2 = r2 - r1
            r8.label = r2
        L12:
            java.lang.Object r1 = r8.result
            X.Hji r9 = X.EnumC10460Hji.A02
            int r0 = r8.label
            r7 = 1
            if (r0 == 0) goto L4b
            if (r0 != r7) goto L5d
            long r5 = r8.J$0
            X.Hwg.A00(r1)
        L22:
            boolean r0 = com.facebook.aura.conversation.view.richcontent.MermaidSvgRenderer.isWebViewReady
            if (r0 != 0) goto L39
            long r3 = android.os.SystemClock.elapsedRealtime()
            long r3 = r3 - r5
            r1 = 10000(0x2710, double:4.9407E-320)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 <= 0) goto L3e
            java.lang.String r1 = "MermaidSvgRenderer"
            java.lang.String r0 = "WebView initialization timed out"
            X.CFK.A04(r1, r0)
            r7 = 0
        L39:
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r7)
            return r9
        L3e:
            r8.J$0 = r5
            r8.label = r7
            r0 = 50
            java.lang.Object r0 = X.C7Bq.A01(r0, r8)
            if (r0 != r9) goto L22
            return r9
        L4b:
            X.Hwg.A00(r1)
            boolean r0 = com.facebook.aura.conversation.view.richcontent.MermaidSvgRenderer.isWebViewReady
            if (r0 != 0) goto L39
            long r5 = android.os.SystemClock.elapsedRealtime()
            goto L22
        L57:
            com.facebook.aura.conversation.view.richcontent.MermaidSvgRenderer$waitForWebViewReady$1 r8 = new com.facebook.aura.conversation.view.richcontent.MermaidSvgRenderer$waitForWebViewReady$1
            r8.<init>(r10)
            goto L12
        L5d:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.conversation.view.richcontent.MermaidSvgRenderer.waitForWebViewReady(X.HtJ):java.lang.Object");
    }

    public final void clearCache() {
        svgCache.evictAll();
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0089  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object renderToSvg(android.content.Context r23, java.lang.String r24, java.lang.String r25, java.lang.String r26, java.lang.String r27, java.lang.String r28, java.lang.String r29, java.util.List<java.lang.String> r30, X.HtJ<? super com.facebook.aura.conversation.view.richcontent.MermaidSvgRenderer.RenderResult> r31) {
        /*
            r22 = this;
            r3 = r31
            boolean r0 = r3 instanceof com.facebook.aura.conversation.view.richcontent.MermaidSvgRenderer.C115251
            r5 = r22
            if (r0 == 0) goto L89
            r4 = r3
            com.facebook.aura.conversation.view.richcontent.MermaidSvgRenderer$renderToSvg$1 r4 = (com.facebook.aura.conversation.view.richcontent.MermaidSvgRenderer.C115251) r4
            int r2 = r4.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L89
            int r2 = r2 - r1
            r4.label = r2
        L16:
            java.lang.Object r1 = r4.result
            X.Hji r3 = X.EnumC10460Hji.A02
            int r0 = r4.label
            r2 = 1
            if (r0 == 0) goto L2e
            if (r0 != r2) goto L8f
            X.Hwg.A00(r1)
        L24:
            if (r1 != 0) goto L2d
            java.lang.String r0 = "Render timed out"
            com.facebook.aura.conversation.view.richcontent.MermaidSvgRenderer$RenderResult$Error r1 = new com.facebook.aura.conversation.view.richcontent.MermaidSvgRenderer$RenderResult$Error
            r1.<init>(r0)
        L2d:
            return r1
        L2e:
            X.Hwg.A00(r1)
            java.lang.String r1 = ","
            r15 = 0
            java.lang.String r0 = ""
            r14 = r30
            java.lang.String r22 = X.AbstractC0878AGe.A0L(r1, r0, r0, r14, r15)
            r8 = r24
            r9 = r25
            r10 = r26
            r11 = r27
            r12 = r28
            r13 = r29
            r16 = r8
            r17 = r9
            r18 = r10
            r19 = r11
            r20 = r12
            r21 = r13
            java.lang.String[] r0 = new java.lang.String[]{r16, r17, r18, r19, r20, r21, r22}
            java.lang.String r6 = r5.buildCacheKey(r0)
            r5.attachMemoryCallbacksIfNeeded()
            com.facebook.aura.conversation.view.richcontent.MermaidSvgRenderer$svgCache$1 r0 = com.facebook.aura.conversation.view.richcontent.MermaidSvgRenderer.svgCache
            java.lang.Object r1 = r0.get(r6)
            if (r1 != 0) goto L2d
            com.facebook.aura.conversation.view.richcontent.MermaidSvgRenderer$renderToSvg$3 r5 = new com.facebook.aura.conversation.view.richcontent.MermaidSvgRenderer$renderToSvg$3
            r7 = r23
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            r4.L$0 = r15
            r4.L$1 = r15
            r4.L$2 = r15
            r4.L$3 = r15
            r4.L$4 = r15
            r4.L$5 = r15
            r4.L$6 = r15
            r4.L$7 = r15
            r4.L$8 = r15
            r4.label = r2
            java.lang.Object r1 = X.C3cI.A0S(r5, r4)
            if (r1 != r3) goto L24
            return r3
        L89:
            com.facebook.aura.conversation.view.richcontent.MermaidSvgRenderer$renderToSvg$1 r4 = new com.facebook.aura.conversation.view.richcontent.MermaidSvgRenderer$renderToSvg$1
            r4.<init>(r3)
            goto L16
        L8f:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.conversation.view.richcontent.MermaidSvgRenderer.renderToSvg(android.content.Context, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List, X.HtJ):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object executeRender(String str, String str2, String str3, String str4, String str5, String str6, List<String> list, HtJ<? super RawRenderResult> htJ) {
        final GBL gblA03 = C7Bm.A03(htJ);
        pendingCallback.set(new MermaidSvgRenderer$executeRender$2$1(gblA03));
        String strA0Y = AbstractC7611F5y.A0Y(str);
        String strA0L = AbstractC0878AGe.A0L(",", "", "", list, MermaidSvgRenderer$executeRender$2$colorsArrayJs$1.INSTANCE);
        StringBuilder sbA0x = C3cI.A0x("\n        renderMermaid(\n            '", strA0Y);
        sbA0x.append("',\n            '");
        sbA0x.append(str2);
        sbA0x.append("', '");
        sbA0x.append(str3);
        sbA0x.append("', '");
        sbA0x.append(str4);
        sbA0x.append("',\n            '");
        sbA0x.append(str5);
        sbA0x.append("', '");
        sbA0x.append(str6);
        sbA0x.append("',\n            [");
        sbA0x.append(strA0L);
        final String strA05 = C6tn.A05(AnonymousClass001.A0v("]\n        );\n    ", sbA0x));
        Handler handler = uiHandler;
        handler.post(new Runnable() { // from class: com.facebook.aura.conversation.view.richcontent.MermaidSvgRenderer$executeRender$2$2
            @Override // java.lang.Runnable
            public final void run() {
                WebView webView2 = MermaidSvgRenderer.webView;
                if (webView2 != null) {
                    webView2.evaluateJavascript(strA05, null);
                }
            }
        });
        Runnable runnable = new Runnable() { // from class: com.facebook.aura.conversation.view.richcontent.MermaidSvgRenderer$executeRender$2$timeoutRunnable$1
            @Override // java.lang.Runnable
            public final void run() {
                if (C8j3.A10(MermaidSvgRenderer.pendingCallback) != null) {
                    Hm1<MermaidSvgRenderer.RawRenderResult> hm1 = gblA03;
                    if (hm1.isActive()) {
                        hm1.resumeWith(new MermaidSvgRenderer.RawRenderResult.Error("Render timed out"));
                    }
                }
            }
        };
        handler.postDelayed(runnable, 10000L);
        gblA03.AO2(new MermaidSvgRenderer$executeRender$2$3(runnable));
        return gblA03.A0F();
    }
}
