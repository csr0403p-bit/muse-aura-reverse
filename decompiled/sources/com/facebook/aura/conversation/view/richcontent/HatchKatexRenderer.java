package com.facebook.aura.conversation.view.richcontent;

import X.AbstractC5321DgF;
import X.AbstractC7608F5v;
import X.AbstractC7611F5y;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.BFI;
import X.BV4;
import X.C06H;
import X.C10571Hud;
import X.C27i;
import X.C2zT;
import X.C3cF;
import X.C3cG;
import X.C3cH;
import X.C3cI;
import X.C60O;
import X.C60Q;
import X.C7384Etj;
import X.C7Bm;
import X.C8eM;
import X.C8j3;
import X.CFK;
import X.F0C;
import X.F60;
import X.FGI;
import X.G0U;
import X.GBL;
import X.GCQ;
import X.GCV;
import X.Hm1;
import X.HtJ;
import X.HzP;
import X.HzR;
import X.InterfaceC10560Hsz;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.os.Handler;
import android.util.LruCache;
import android.view.View;
import android.webkit.JavascriptInterface;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.facebook.aura.analytics.timespent.config.MC;
import com.facebook.aura.conversation.view.richcontent.HatchKatexRenderer;
import com.facebook.aura.conversation.view.richcontent.HatchKatexRenderer$bitmapCacheDelegate$1;
import com.facebook.aura.memory.AuraMemoryPressure;
import com.facebook.aura.memory.AuraMemoryPressureLevel;
import com.facebook.aura.memory.AuraTrimmable;
import com.facebook.aura.opengraph.HatchWebPageParserKt;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* loaded from: classes6.dex */
public final class HatchKatexRenderer {
    public static final int $stable = 0;
    public static final long BYTES_PER_CHAR = 2;
    public static final int DEFAULT_CACHE_BYTES = 8388608;
    public static final int DEFAULT_FONT_SIZE_SP = 16;
    public static final long INIT_POLL_INTERVAL_MS = 50;
    public static final int LOW_RAM_CACHE_BYTES = 4194304;
    public static final int MAX_BITMAP_HEIGHT = 2048;
    public static final long MAX_BITMAP_PIXELS = 1500000;
    public static final int MAX_BITMAP_WIDTH = 4096;
    public static final int MAX_EXPRESSION_CHARS = 65536;
    public static final int POOL_SIZE = 1;
    public static final long RENDER_TIMEOUT_MS = 10000;
    public static final String TAG = "HatchKatexRenderer";
    public static final int WEBVIEW_HEIGHT = 2048;
    public static final int WEBVIEW_WIDTH = 4096;
    public static final C8eM capacity;
    public static int nextRendererId;
    public static final Object poolStateLock;
    public static final HatchKatexRenderer INSTANCE = new HatchKatexRenderer();
    public static final Handler uiHandler = C60O.A02();
    public static final F0C bitmapCacheMaxBytes$delegate = AbstractC5321DgF.A03(HatchKatexRenderer$bitmapCacheMaxBytes$2.INSTANCE);
    public static final F0C<HatchKatexRenderer$bitmapCacheDelegate$1.AnonymousClass1> bitmapCacheDelegate = AbstractC5321DgF.A03(HatchKatexRenderer$bitmapCacheDelegate$1.INSTANCE);
    public static final AtomicBoolean memoryCallbacksAttached = C60O.A1E();
    public static final AuraTrimmable memoryCallbacks = new AuraTrimmable() { // from class: com.facebook.aura.conversation.view.richcontent.HatchKatexRenderer$memoryCallbacks$1
        @Override // com.facebook.aura.memory.AuraTrimmable
        public final void onMemoryPressure(AuraMemoryPressureLevel auraMemoryPressureLevel) {
            HatchKatexRenderer hatchKatexRenderer;
            C7384Etj.A0Y(auraMemoryPressureLevel, 0);
            int iOrdinal = auraMemoryPressureLevel.ordinal();
            if (iOrdinal == 0) {
                F0C<HatchKatexRenderer$bitmapCacheDelegate$1.AnonymousClass1> f0c = HatchKatexRenderer.bitmapCacheDelegate;
                if (f0c.AOX()) {
                    f0c.getValue().trimToSize(HatchKatexRenderer.INSTANCE.getBitmapCacheMaxBytes() / 2);
                    return;
                }
                return;
            }
            if (iOrdinal == 1 || iOrdinal == 2) {
                F0C<HatchKatexRenderer$bitmapCacheDelegate$1.AnonymousClass1> f0c2 = HatchKatexRenderer.bitmapCacheDelegate;
                if (f0c2.AOX()) {
                    f0c2.getValue().trimToSize(HatchKatexRenderer.INSTANCE.getBitmapCacheMaxBytes() / 2);
                }
                hatchKatexRenderer = HatchKatexRenderer.INSTANCE;
            } else {
                if (iOrdinal != 3) {
                    throw C3cG.A0q();
                }
                hatchKatexRenderer = HatchKatexRenderer.INSTANCE;
                hatchKatexRenderer.clearCache();
            }
            hatchKatexRenderer.destroyIdleWebViews();
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
    public static final Object inFlightLock = C3cG.A0T();
    public static final Map<String, InterfaceC10560Hsz<RenderResult>> inFlightRenders = C3cG.A0j();
    public static final HzR<PooledWebView> available = new GCV(1, null);

    public final class PooledWebView {
        public final Context appContext;
        public final int id;
        public volatile boolean isReady;
        public final AtomicReference<G0U<RenderResult, Unit>> pendingCallback;
        public volatile boolean timedOut;
        public WebView webView;

        public final class Bridge {
            @JavascriptInterface
            public final void onRenderError(String str) {
                C7384Etj.A0Y(str, 0);
                CFK.A06(HatchKatexRenderer.TAG, FGI.A0W("KaTeX render error on pooled WebView ", ": ", str, PooledWebView.this.id));
                G0U g0u = (G0U) C8j3.A10(PooledWebView.this.pendingCallback);
                if (g0u != null) {
                    g0u.invoke(new RenderResult.Error(str));
                }
            }

            public Bridge() {
            }

            @JavascriptInterface
            public final void onMeasured(final int i, final int i2, final int i3, final int i4) {
                Handler handler = HatchKatexRenderer.uiHandler;
                final PooledWebView pooledWebView = PooledWebView.this;
                handler.post(new Runnable() { // from class: com.facebook.aura.conversation.view.richcontent.HatchKatexRenderer$PooledWebView$Bridge$onMeasured$1
                    @Override // java.lang.Runnable
                    public final void run() {
                        HatchKatexRenderer hatchKatexRenderer = HatchKatexRenderer.INSTANCE;
                        int i5 = i3;
                        int i6 = i4;
                        if (!hatchKatexRenderer.isBitmapSizeAllowed(i5, i6)) {
                            CFK.A06(HatchKatexRenderer.TAG, FGI.A0Z("Rejected oversized KaTeX bitmap ", "x", " on renderer ", i5, i6, pooledWebView.id));
                            G0U<HatchKatexRenderer.RenderResult, Unit> andSet = pooledWebView.pendingCallback.getAndSet(null);
                            if (andSet != null) {
                                andSet.invoke(new HatchKatexRenderer.RenderResult.Error("Rendered math is too large to display"));
                                return;
                            }
                            return;
                        }
                        Bitmap bitmapCaptureBitmap = pooledWebView.captureBitmap(i, i2, i5, i6);
                        HatchKatexRenderer.RenderResult success = bitmapCaptureBitmap != null ? new HatchKatexRenderer.RenderResult.Success(bitmapCaptureBitmap) : new HatchKatexRenderer.RenderResult.Error(FGI.A0Y("Failed to capture WebView as bitmap (", "x", ")", i3, i4));
                        G0U<HatchKatexRenderer.RenderResult, Unit> andSet2 = pooledWebView.pendingCallback.getAndSet(null);
                        if (andSet2 != null) {
                            andSet2.invoke(success);
                        }
                    }
                });
            }
        }

        public PooledWebView(int i, Context context) {
            C7384Etj.A0Y(context, 1);
            this.id = i;
            this.appContext = context;
            this.pendingCallback = BV4.A16(null);
        }

        public final void setWebView(WebView webView) {
            C7384Etj.A0Y(webView, 0);
            this.webView = webView;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final Bitmap captureBitmap(int i, int i2, int i3, int i4) {
            if (!HatchKatexRenderer.INSTANCE.isBitmapSizeAllowed(i3, i4)) {
                return null;
            }
            try {
                AbstractC7608F5v.A1E(getWebView(), 2048, 1073741824, View.MeasureSpec.makeMeasureSpec(4096, 1073741824));
                getWebView().layout(0, 0, 4096, 2048);
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i3, i4, Bitmap.Config.ARGB_8888);
                C7384Etj.A0U(bitmapCreateBitmap);
                Canvas canvas = new Canvas(bitmapCreateBitmap);
                canvas.translate(-i, -i2);
                getWebView().draw(canvas);
                return bitmapCreateBitmap;
            } catch (Throwable th) {
                CFK.A0A(HatchKatexRenderer.TAG, FGI.A0H("Failed to capture KaTeX bitmap from pooled WebView ", this.id), th);
                return null;
            }
        }

        public final void destroy() {
            Runnable runnable = new Runnable() { // from class: com.facebook.aura.conversation.view.richcontent.HatchKatexRenderer$PooledWebView$destroy$destroyAction$1
                @Override // java.lang.Runnable
                public final void run() {
                    this.this$0.isReady = false;
                    G0U g0u = (G0U) C8j3.A10(this.this$0.pendingCallback);
                    if (g0u != null) {
                        g0u.invoke(new HatchKatexRenderer.RenderResult.Error("Renderer released"));
                    }
                    HatchKatexRenderer.PooledWebView pooledWebView = this.this$0;
                    if (pooledWebView.webView != null) {
                        try {
                            pooledWebView.getWebView().removeJavascriptInterface("KatexBridge");
                        } catch (Throwable th) {
                            C3cG.A0s(th);
                        }
                        try {
                            this.this$0.getWebView().stopLoading();
                        } catch (Throwable th2) {
                            C3cG.A0s(th2);
                        }
                        try {
                            this.this$0.getWebView().loadUrl(C3cF.A00(1));
                        } catch (Throwable th3) {
                            C3cG.A0s(th3);
                        }
                        try {
                            this.this$0.getWebView().clearHistory();
                        } catch (Throwable th4) {
                            C3cG.A0s(th4);
                        }
                        try {
                            this.this$0.getWebView().removeAllViews();
                        } catch (Throwable th5) {
                            C3cG.A0s(th5);
                        }
                        try {
                            this.this$0.getWebView().destroy();
                        } catch (Throwable th6) {
                            C3cG.A0s(th6);
                        }
                    }
                }
            };
            if (C3cH.A1K()) {
                runnable.run();
            } else {
                HatchKatexRenderer.uiHandler.post(runnable);
            }
        }

        public final Context getAppContext() {
            return this.appContext;
        }

        public final int getId() {
            return this.id;
        }

        public final AtomicReference<G0U<RenderResult, Unit>> getPendingCallback() {
            return this.pendingCallback;
        }

        public final boolean getTimedOut() {
            return this.timedOut;
        }

        public final WebView getWebView() {
            WebView webView = this.webView;
            if (webView != null) {
                return webView;
            }
            C7384Etj.A0b("webView");
            throw F60.createAndThrow();
        }

        public final void initOnUiThread() {
            WebView webView = new WebView(this.appContext);
            webView.setLayerType(1, null);
            webView.setBackgroundColor(0);
            webView.layout(0, 0, 4096, 2048);
            webView.getSettings().setJavaScriptEnabled(true);
            webView.setWebViewClient(new WebViewClient() { // from class: com.facebook.aura.conversation.view.richcontent.HatchKatexRenderer$PooledWebView$initOnUiThread$1$1
                @Override // android.webkit.WebViewClient
                public void onPageFinished(WebView webView2, String str) {
                    this.this$0.isReady = true;
                }
            });
            webView.addJavascriptInterface(new Bridge(), "KatexBridge");
            int i = HatchKatexRenderer.$stable;
            webView.loadDataWithBaseURL(null, "<!DOCTYPE html>\n<html>\n<head>\n  <meta charset=\"utf-8\">\n  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0, user-scalable=no\">\n  <link rel=\"stylesheet\"\n        href=\"https://cdn.jsdelivr.net/npm/katex@0.16.11/dist/katex.min.css\">\n  <script defer\n          src=\"https://cdn.jsdelivr.net/npm/katex@0.16.11/dist/katex.min.js\"></script>\n  <style>\n    html, body { margin: 0; padding: 0; background: transparent; }\n    /* Inline-block so the container shrinks to the rendered KaTeX content's natural width,\n       not the body's width. Generous padding gives descenders / italic overhang and\n       KaTeX's negative-margin tricks (limits, accents) room before the captured bounds. */\n    #container { display: inline-block; padding: 6px 12px; white-space: nowrap; }\n    /* KaTeX block math defaults to display:block, which expands to parent width and centers\n       \u2014 we want the actual content width, so override. */\n    #container .katex-display { display: inline-block; margin: 0; }\n  </style>\n</head>\n<body>\n  <div id=\"container\"></div>\n  <script>\n    function renderKatex(expression, displayMode, textColor, density, fontSizeSp) {\n      try {\n        if (typeof katex === 'undefined') {\n          KatexBridge.onRenderError('katex not loaded');\n          return;\n        }\n        var container = document.getElementById('container');\n        container.innerHTML = '';\n        container.style.color = textColor;\n        // Set the CSS font-size for the math container. KaTeX's stylesheet sets\n        // `.katex { font-size: 1.21em }`, which scales the rendered glyphs to ~1.21x\n        // the input \u2014 so passing the surrounding text's size as-is would yield math\n        // glyphs visibly larger than the body text. Divide by 1.21 here so the\n        // rendered glyph cap height matches the body text's; callers can keep passing\n        // the surrounding font size directly without being aware of KaTeX's internal\n        // scaling. Also: the WebView's CSS-to-device-px mapping is 1 CSS px = density\n        // device px (so 16 CSS px = 48 device px on xxhdpi); we compensate for that\n        // by multiplying the measured CSS-px dimensions by `density` below when\n        // bridging back to Android.\n        var KATEX_INTRINSIC_SCALE = 1.21;\n        var effectiveFontPx = (fontSizeSp || 16) / KATEX_INTRINSIC_SCALE;\n        container.style.fontSize = effectiveFontPx + 'px';\n        katex.render(expression, container, {\n          displayMode: displayMode,\n          output: 'html',\n          throwOnError: false,\n          strict: 'ignore',\n        });\n        // KaTeX loads its math fonts (KaTeX_*.woff2) asynchronously. If we measure\n        // immediately, the layout is computed with fallback metrics \u2192 reported size is\n        // wrong \u2192 the bitmap captures a smaller region than the final rendered content.\n        // document.fonts.ready resolves once all @font-face fonts referenced by the\n        // current DOM have downloaded; one rAF after that ensures the post-load layout\n        // has been committed before we measure.\n        var fontsReady = (document.fonts && document.fonts.ready)\n          ? document.fonts.ready\n          : Promise.resolve();\n        fontsReady.then(function() {\n          requestAnimationFrame(function() {\n            // Measure the `.katex` (inline) or `.katex-display` (block) root element\n            // directly, then add fixed overhang padding to capture KaTeX's negative-\n            // margin glyphs (limits above big operators, accents, sqrt extenders).\n            //\n            // Why not union descendant bounds? KaTeX's HTML output contains `.vlist` and\n            // `.strut` elements whose `getBoundingClientRect` reports widths far beyond\n            // the actual painted content (vertical-layout helpers with absolute children\n            // that float to extreme positions). Unioning them inflated bitmaps to\n            // thousands of pixels of empty whitespace flanking a tiny strip of math.\n            // The .katex root's own bounds are tight to the visible glyph stack; the\n            // overhang padding is a small constant that handles the negative-margin\n            // ascenders/descenders without picking up off-flow helpers.\n            var katexRoot =\n                container.querySelector('.katex-display') ||\n                container.querySelector('.katex');\n            if (!katexRoot) {\n              KatexBridge.onRenderError('katex root element not found after render');\n              return;\n            }\n            var rect = katexRoot.getBoundingClientRect();\n            var OVERHANG_TOP = 8;\n            var OVERHANG_BOTTOM = 4;\n            var OVERHANG_X = 4;\n            // Multiply CSS-px values by density to convert to device px. The WebView\n            // paints content at density-scaled positions on its drawing surface, so the\n            // captured Bitmap (allocated in device px and filled by wv.draw(canvas))\n            // must use device-px dimensions to encompass the full painted area.\n            var d = density || 1;\n            var offsetX = Math.floor((rect.left - OVERHANG_X) * d);\n            var offsetY = Math.floor((rect.top - OVERHANG_TOP) * d);\n            var width = Math.ceil((rect.width + OVERHANG_X * 2) * d);\n            var height = Math.ceil((rect.height + OVERHANG_TOP + OVERHANG_BOTTOM) * d);\n            KatexBridge.onMeasured(offsetX, offsetY, width, height);\n          });\n        });\n      } catch(e) {\n        KatexBridge.onRenderError(e.message || 'Unknown error');\n      }\n    }\n  </script>\n</body>\n</html>", "text/html", HatchWebPageParserKt.UTF_8, null);
            this.webView = webView;
        }

        public final boolean isReady() {
            return this.isReady;
        }

        public final void setReady(boolean z) {
            this.isReady = z;
        }

        public final void setTimedOut(boolean z) {
            this.timedOut = z;
        }
    }

    @DebugMetadata(c = "com.facebook.aura.conversation.view.richcontent.HatchKatexRenderer", f = "HatchKatexRenderer.kt", l = {MC.mwa_time_spent_killswitch.__CONFIG__}, m = "acquireWebView", v = 2)
    /* renamed from: com.facebook.aura.conversation.view.richcontent.HatchKatexRenderer$acquireWebView$1, reason: invalid class name */
    public final class AnonymousClass1 extends HzP {
        public Object L$0;
        public int label;
        public /* synthetic */ Object result;

        public AnonymousClass1(HtJ<? super AnonymousClass1> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HatchKatexRenderer.this.acquireWebView(null, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.conversation.view.richcontent.HatchKatexRenderer", f = "HatchKatexRenderer.kt", l = {171, 178, 181}, m = "renderToBitmap", v = 2)
    /* renamed from: com.facebook.aura.conversation.view.richcontent.HatchKatexRenderer$renderToBitmap$1, reason: invalid class name and case insensitive filesystem */
    public final class C115201 extends HzP {
        public int I$0;
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public Object L$4;
        public Object L$5;
        public Object L$6;
        public boolean Z$0;
        public int label;
        public /* synthetic */ Object result;

        public C115201(HtJ<? super C115201> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HatchKatexRenderer.this.renderToBitmap(null, null, false, null, 0, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.conversation.view.richcontent.HatchKatexRenderer", f = "HatchKatexRenderer.kt", l = {364}, m = "waitForReady", v = 2)
    /* renamed from: com.facebook.aura.conversation.view.richcontent.HatchKatexRenderer$waitForReady$1, reason: invalid class name and case insensitive filesystem */
    public final class C115211 extends HzP {
        public long J$0;
        public Object L$0;
        public int label;
        public /* synthetic */ Object result;

        public C115211(HtJ<? super C115211> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HatchKatexRenderer.this.waitForReady(null, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.conversation.view.richcontent.HatchKatexRenderer", f = "HatchKatexRenderer.kt", l = {241, 243}, m = "warmUp", v = 2)
    /* renamed from: com.facebook.aura.conversation.view.richcontent.HatchKatexRenderer$warmUp$1, reason: invalid class name and case insensitive filesystem */
    public final class C115221 extends HzP {
        public Object L$0;
        public Object L$1;
        public int label;
        public /* synthetic */ Object result;

        public C115221(HtJ<? super C115221> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HatchKatexRenderer.this.warmUp(null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isBitmapSizeAllowed(int i, int i2) {
        return 1 <= i && i < 4097 && 1 <= i2 && i2 < 2049 && ((long) i) * ((long) i2) <= MAX_BITMAP_PIXELS;
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
            public final Bitmap bitmap;

            public Success(Bitmap bitmap) {
                C7384Etj.A0Y(bitmap, 0);
                this.bitmap = bitmap;
            }

            public final Success copy(Bitmap bitmap) {
                C7384Etj.A0Y(bitmap, 0);
                return new Success(bitmap);
            }

            public boolean equals(Object obj) {
                return this == obj || ((obj instanceof Success) && C7384Etj.areEqual(this.bitmap, ((Success) obj).bitmap));
            }

            public static /* synthetic */ Success copy$default(Success success, Bitmap bitmap, int i, Object obj) {
                if ((i & 1) != 0) {
                    bitmap = success.bitmap;
                }
                C7384Etj.A0Y(bitmap, 0);
                return new Success(bitmap);
            }

            public final Bitmap component1() {
                return this.bitmap;
            }

            public final Bitmap getBitmap() {
                return this.bitmap;
            }

            public int hashCode() {
                return this.bitmap.hashCode();
            }

            public String toString() {
                return super.toString();
            }
        }

        public RenderResult() {
        }

        public /* synthetic */ RenderResult(C06H c06h) {
        }
    }

    static {
        int i = GCQ.A00;
        capacity = new C27i(1);
        poolStateLock = C3cG.A0T();
    }

    public static final /* synthetic */ String access$buildRendererHtml(HatchKatexRenderer hatchKatexRenderer) {
        return "<!DOCTYPE html>\n<html>\n<head>\n  <meta charset=\"utf-8\">\n  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0, user-scalable=no\">\n  <link rel=\"stylesheet\"\n        href=\"https://cdn.jsdelivr.net/npm/katex@0.16.11/dist/katex.min.css\">\n  <script defer\n          src=\"https://cdn.jsdelivr.net/npm/katex@0.16.11/dist/katex.min.js\"></script>\n  <style>\n    html, body { margin: 0; padding: 0; background: transparent; }\n    /* Inline-block so the container shrinks to the rendered KaTeX content's natural width,\n       not the body's width. Generous padding gives descenders / italic overhang and\n       KaTeX's negative-margin tricks (limits, accents) room before the captured bounds. */\n    #container { display: inline-block; padding: 6px 12px; white-space: nowrap; }\n    /* KaTeX block math defaults to display:block, which expands to parent width and centers\n       \u2014 we want the actual content width, so override. */\n    #container .katex-display { display: inline-block; margin: 0; }\n  </style>\n</head>\n<body>\n  <div id=\"container\"></div>\n  <script>\n    function renderKatex(expression, displayMode, textColor, density, fontSizeSp) {\n      try {\n        if (typeof katex === 'undefined') {\n          KatexBridge.onRenderError('katex not loaded');\n          return;\n        }\n        var container = document.getElementById('container');\n        container.innerHTML = '';\n        container.style.color = textColor;\n        // Set the CSS font-size for the math container. KaTeX's stylesheet sets\n        // `.katex { font-size: 1.21em }`, which scales the rendered glyphs to ~1.21x\n        // the input \u2014 so passing the surrounding text's size as-is would yield math\n        // glyphs visibly larger than the body text. Divide by 1.21 here so the\n        // rendered glyph cap height matches the body text's; callers can keep passing\n        // the surrounding font size directly without being aware of KaTeX's internal\n        // scaling. Also: the WebView's CSS-to-device-px mapping is 1 CSS px = density\n        // device px (so 16 CSS px = 48 device px on xxhdpi); we compensate for that\n        // by multiplying the measured CSS-px dimensions by `density` below when\n        // bridging back to Android.\n        var KATEX_INTRINSIC_SCALE = 1.21;\n        var effectiveFontPx = (fontSizeSp || 16) / KATEX_INTRINSIC_SCALE;\n        container.style.fontSize = effectiveFontPx + 'px';\n        katex.render(expression, container, {\n          displayMode: displayMode,\n          output: 'html',\n          throwOnError: false,\n          strict: 'ignore',\n        });\n        // KaTeX loads its math fonts (KaTeX_*.woff2) asynchronously. If we measure\n        // immediately, the layout is computed with fallback metrics \u2192 reported size is\n        // wrong \u2192 the bitmap captures a smaller region than the final rendered content.\n        // document.fonts.ready resolves once all @font-face fonts referenced by the\n        // current DOM have downloaded; one rAF after that ensures the post-load layout\n        // has been committed before we measure.\n        var fontsReady = (document.fonts && document.fonts.ready)\n          ? document.fonts.ready\n          : Promise.resolve();\n        fontsReady.then(function() {\n          requestAnimationFrame(function() {\n            // Measure the `.katex` (inline) or `.katex-display` (block) root element\n            // directly, then add fixed overhang padding to capture KaTeX's negative-\n            // margin glyphs (limits above big operators, accents, sqrt extenders).\n            //\n            // Why not union descendant bounds? KaTeX's HTML output contains `.vlist` and\n            // `.strut` elements whose `getBoundingClientRect` reports widths far beyond\n            // the actual painted content (vertical-layout helpers with absolute children\n            // that float to extreme positions). Unioning them inflated bitmaps to\n            // thousands of pixels of empty whitespace flanking a tiny strip of math.\n            // The .katex root's own bounds are tight to the visible glyph stack; the\n            // overhang padding is a small constant that handles the negative-margin\n            // ascenders/descenders without picking up off-flow helpers.\n            var katexRoot =\n                container.querySelector('.katex-display') ||\n                container.querySelector('.katex');\n            if (!katexRoot) {\n              KatexBridge.onRenderError('katex root element not found after render');\n              return;\n            }\n            var rect = katexRoot.getBoundingClientRect();\n            var OVERHANG_TOP = 8;\n            var OVERHANG_BOTTOM = 4;\n            var OVERHANG_X = 4;\n            // Multiply CSS-px values by density to convert to device px. The WebView\n            // paints content at density-scaled positions on its drawing surface, so the\n            // captured Bitmap (allocated in device px and filled by wv.draw(canvas))\n            // must use device-px dimensions to encompass the full painted area.\n            var d = density || 1;\n            var offsetX = Math.floor((rect.left - OVERHANG_X) * d);\n            var offsetY = Math.floor((rect.top - OVERHANG_TOP) * d);\n            var width = Math.ceil((rect.width + OVERHANG_X * 2) * d);\n            var height = Math.ceil((rect.height + OVERHANG_TOP + OVERHANG_BOTTOM) * d);\n            KatexBridge.onMeasured(offsetX, offsetY, width, height);\n          });\n        });\n      } catch(e) {\n        KatexBridge.onRenderError(e.message || 'Unknown error');\n      }\n    }\n  </script>\n</body>\n</html>";
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0045  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object acquireWebView(android.content.Context r6, X.HtJ<? super com.facebook.aura.conversation.view.richcontent.HatchKatexRenderer.PooledWebView> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof com.facebook.aura.conversation.view.richcontent.HatchKatexRenderer.AnonymousClass1
            if (r0 == 0) goto L45
            r4 = r7
            com.facebook.aura.conversation.view.richcontent.HatchKatexRenderer$acquireWebView$1 r4 = (com.facebook.aura.conversation.view.richcontent.HatchKatexRenderer.AnonymousClass1) r4
            int r2 = r4.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L45
            int r2 = r2 - r1
            r4.label = r2
        L12:
            java.lang.Object r3 = r4.result
            X.Hji r1 = X.EnumC10460Hji.A02
            int r0 = r4.label
            r2 = 1
            if (r0 == 0) goto L35
            if (r0 != r2) goto L62
            java.lang.Object r6 = r4.L$0
            android.content.Context r6 = (android.content.Context) r6
            X.Hwg.A00(r3)
        L24:
            X.HzR<com.facebook.aura.conversation.view.richcontent.HatchKatexRenderer$PooledWebView> r0 = com.facebook.aura.conversation.view.richcontent.HatchKatexRenderer.available
            java.lang.Object r1 = r0.AhX()
            boolean r0 = r1 instanceof X.C2zT
            if (r0 == 0) goto L2f
            r1 = 0
        L2f:
            if (r1 != 0) goto L61
            java.lang.Object r2 = com.facebook.aura.conversation.view.richcontent.HatchKatexRenderer.poolStateLock
            monitor-enter(r2)
            goto L4b
        L35:
            X.Hwg.A00(r3)
            X.8eM r0 = com.facebook.aura.conversation.view.richcontent.HatchKatexRenderer.capacity
            r4.L$0 = r6
            r4.label = r2
            java.lang.Object r0 = r0.A2u(r4)
            if (r0 != r1) goto L24
            return r1
        L45:
            com.facebook.aura.conversation.view.richcontent.HatchKatexRenderer$acquireWebView$1 r4 = new com.facebook.aura.conversation.view.richcontent.HatchKatexRenderer$acquireWebView$1
            r4.<init>(r7)
            goto L12
        L4b:
            int r1 = com.facebook.aura.conversation.view.richcontent.HatchKatexRenderer.nextRendererId     // Catch: java.lang.Throwable -> L5e
            int r0 = r1 + 1
            com.facebook.aura.conversation.view.richcontent.HatchKatexRenderer.nextRendererId = r0     // Catch: java.lang.Throwable -> L5e
            monitor-exit(r2)
            com.facebook.aura.conversation.view.richcontent.HatchKatexRenderer$PooledWebView r1 = r5.createPooledWebView(r6, r1)     // Catch: java.lang.Throwable -> L57
            return r1
        L57:
            r1 = move-exception
            X.8eM r0 = com.facebook.aura.conversation.view.richcontent.HatchKatexRenderer.capacity
            r0.release()
            throw r1
        L5e:
            r1 = move-exception
            monitor-exit(r2)
            throw r1
        L61:
            return r1
        L62:
            java.lang.IllegalStateException r1 = X.AnonymousClass001.A0n()
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.conversation.view.richcontent.HatchKatexRenderer.acquireWebView(android.content.Context, X.HtJ):java.lang.Object");
    }

    private final void attachMemoryCallbacksIfNeeded() {
        if (C3cI.A1W(memoryCallbacksAttached)) {
            AuraMemoryPressure.INSTANCE.register(memoryCallbacks);
        }
    }

    private final String buildCacheKey(String... strArr) {
        return BFI.A0B("|", "", "", null, strArr);
    }

    private final String buildRendererHtml() {
        return "<!DOCTYPE html>\n<html>\n<head>\n  <meta charset=\"utf-8\">\n  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0, user-scalable=no\">\n  <link rel=\"stylesheet\"\n        href=\"https://cdn.jsdelivr.net/npm/katex@0.16.11/dist/katex.min.css\">\n  <script defer\n          src=\"https://cdn.jsdelivr.net/npm/katex@0.16.11/dist/katex.min.js\"></script>\n  <style>\n    html, body { margin: 0; padding: 0; background: transparent; }\n    /* Inline-block so the container shrinks to the rendered KaTeX content's natural width,\n       not the body's width. Generous padding gives descenders / italic overhang and\n       KaTeX's negative-margin tricks (limits, accents) room before the captured bounds. */\n    #container { display: inline-block; padding: 6px 12px; white-space: nowrap; }\n    /* KaTeX block math defaults to display:block, which expands to parent width and centers\n       \u2014 we want the actual content width, so override. */\n    #container .katex-display { display: inline-block; margin: 0; }\n  </style>\n</head>\n<body>\n  <div id=\"container\"></div>\n  <script>\n    function renderKatex(expression, displayMode, textColor, density, fontSizeSp) {\n      try {\n        if (typeof katex === 'undefined') {\n          KatexBridge.onRenderError('katex not loaded');\n          return;\n        }\n        var container = document.getElementById('container');\n        container.innerHTML = '';\n        container.style.color = textColor;\n        // Set the CSS font-size for the math container. KaTeX's stylesheet sets\n        // `.katex { font-size: 1.21em }`, which scales the rendered glyphs to ~1.21x\n        // the input \u2014 so passing the surrounding text's size as-is would yield math\n        // glyphs visibly larger than the body text. Divide by 1.21 here so the\n        // rendered glyph cap height matches the body text's; callers can keep passing\n        // the surrounding font size directly without being aware of KaTeX's internal\n        // scaling. Also: the WebView's CSS-to-device-px mapping is 1 CSS px = density\n        // device px (so 16 CSS px = 48 device px on xxhdpi); we compensate for that\n        // by multiplying the measured CSS-px dimensions by `density` below when\n        // bridging back to Android.\n        var KATEX_INTRINSIC_SCALE = 1.21;\n        var effectiveFontPx = (fontSizeSp || 16) / KATEX_INTRINSIC_SCALE;\n        container.style.fontSize = effectiveFontPx + 'px';\n        katex.render(expression, container, {\n          displayMode: displayMode,\n          output: 'html',\n          throwOnError: false,\n          strict: 'ignore',\n        });\n        // KaTeX loads its math fonts (KaTeX_*.woff2) asynchronously. If we measure\n        // immediately, the layout is computed with fallback metrics \u2192 reported size is\n        // wrong \u2192 the bitmap captures a smaller region than the final rendered content.\n        // document.fonts.ready resolves once all @font-face fonts referenced by the\n        // current DOM have downloaded; one rAF after that ensures the post-load layout\n        // has been committed before we measure.\n        var fontsReady = (document.fonts && document.fonts.ready)\n          ? document.fonts.ready\n          : Promise.resolve();\n        fontsReady.then(function() {\n          requestAnimationFrame(function() {\n            // Measure the `.katex` (inline) or `.katex-display` (block) root element\n            // directly, then add fixed overhang padding to capture KaTeX's negative-\n            // margin glyphs (limits above big operators, accents, sqrt extenders).\n            //\n            // Why not union descendant bounds? KaTeX's HTML output contains `.vlist` and\n            // `.strut` elements whose `getBoundingClientRect` reports widths far beyond\n            // the actual painted content (vertical-layout helpers with absolute children\n            // that float to extreme positions). Unioning them inflated bitmaps to\n            // thousands of pixels of empty whitespace flanking a tiny strip of math.\n            // The .katex root's own bounds are tight to the visible glyph stack; the\n            // overhang padding is a small constant that handles the negative-margin\n            // ascenders/descenders without picking up off-flow helpers.\n            var katexRoot =\n                container.querySelector('.katex-display') ||\n                container.querySelector('.katex');\n            if (!katexRoot) {\n              KatexBridge.onRenderError('katex root element not found after render');\n              return;\n            }\n            var rect = katexRoot.getBoundingClientRect();\n            var OVERHANG_TOP = 8;\n            var OVERHANG_BOTTOM = 4;\n            var OVERHANG_X = 4;\n            // Multiply CSS-px values by density to convert to device px. The WebView\n            // paints content at density-scaled positions on its drawing surface, so the\n            // captured Bitmap (allocated in device px and filled by wv.draw(canvas))\n            // must use device-px dimensions to encompass the full painted area.\n            var d = density || 1;\n            var offsetX = Math.floor((rect.left - OVERHANG_X) * d);\n            var offsetY = Math.floor((rect.top - OVERHANG_TOP) * d);\n            var width = Math.ceil((rect.width + OVERHANG_X * 2) * d);\n            var height = Math.ceil((rect.height + OVERHANG_TOP + OVERHANG_BOTTOM) * d);\n            KatexBridge.onMeasured(offsetX, offsetY, width, height);\n          });\n        });\n      } catch(e) {\n        KatexBridge.onRenderError(e.message || 'Unknown error');\n      }\n    }\n  </script>\n</body>\n</html>";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Bitmap cachedBitmap(String str) {
        F0C<HatchKatexRenderer$bitmapCacheDelegate$1.AnonymousClass1> f0c = bitmapCacheDelegate;
        Bitmap bitmap = f0c.getValue().get(str);
        if (bitmap != null) {
            if (!bitmap.isRecycled()) {
                return bitmap;
            }
            f0c.getValue().remove(str);
        }
        return null;
    }

    private final PooledWebView createPooledWebView(Context context, int i) throws Throwable {
        final PooledWebView pooledWebView = new PooledWebView(i, context);
        if (C3cH.A1K()) {
            pooledWebView.initOnUiThread();
        } else {
            final CountDownLatch countDownLatch = new CountDownLatch(1);
            final AtomicReference atomicReferenceA16 = BV4.A16(null);
            uiHandler.post(new Runnable() { // from class: com.facebook.aura.conversation.view.richcontent.HatchKatexRenderer.createPooledWebView.1
                @Override // java.lang.Runnable
                public final void run() {
                    try {
                        pooledWebView.initOnUiThread();
                    } finally {
                        try {
                        } finally {
                        }
                    }
                }
            });
            countDownLatch.await();
            Throwable th = (Throwable) atomicReferenceA16.get();
            if (th != null) {
                throw th;
            }
        }
        return pooledWebView;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void destroyIdleWebViews() {
        while (true) {
            Object objAhX = available.AhX();
            if (objAhX instanceof C2zT) {
                objAhX = null;
            }
            PooledWebView pooledWebView = (PooledWebView) objAhX;
            if (pooledWebView == null) {
                return;
            } else {
                pooledWebView.destroy();
            }
        }
    }

    private final LruCache<String, Bitmap> getBitmapCache() {
        return bitmapCacheDelegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int getBitmapCacheMaxBytes() {
        return AnonymousClass001.A0F(bitmapCacheMaxBytes$delegate.getValue());
    }

    public static /* synthetic */ void getUiHandler$annotations() {
    }

    public static /* synthetic */ Bitmap peekCachedBitmap$default(HatchKatexRenderer hatchKatexRenderer, String str, boolean z, String str2, int i, int i2, Object obj) {
        if ((i2 & 8) != 0) {
            i = 16;
        }
        return hatchKatexRenderer.peekCachedBitmap(str, z, str2, i);
    }

    private final void releaseWebView(PooledWebView pooledWebView) {
        if (pooledWebView.timedOut || (available.AhZ(pooledWebView) instanceof C2zT)) {
            pooledWebView.destroy();
        }
        capacity.release();
    }

    public static /* synthetic */ Object renderToBitmap$default(HatchKatexRenderer hatchKatexRenderer, Context context, String str, boolean z, String str2, int i, HtJ htJ, int i2, Object obj) {
        if ((i2 & 16) != 0) {
            i = 16;
        }
        return hatchKatexRenderer.renderToBitmap(context, str, z, str2, i, htJ);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0064  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object waitForReady(com.facebook.aura.conversation.view.richcontent.HatchKatexRenderer.PooledWebView r10, X.HtJ<? super java.lang.Boolean> r11) {
        /*
            r9 = this;
            boolean r0 = r11 instanceof com.facebook.aura.conversation.view.richcontent.HatchKatexRenderer.C115211
            if (r0 == 0) goto L64
            r7 = r11
            com.facebook.aura.conversation.view.richcontent.HatchKatexRenderer$waitForReady$1 r7 = (com.facebook.aura.conversation.view.richcontent.HatchKatexRenderer.C115211) r7
            int r2 = r7.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L64
            int r2 = r2 - r1
            r7.label = r2
        L12:
            java.lang.Object r1 = r7.result
            X.Hji r9 = X.EnumC10460Hji.A02
            int r0 = r7.label
            r8 = 1
            if (r0 == 0) goto L58
            if (r0 != r8) goto L6a
            long r3 = r7.J$0
            java.lang.Object r10 = r7.L$0
            com.facebook.aura.conversation.view.richcontent.HatchKatexRenderer$PooledWebView r10 = (com.facebook.aura.conversation.view.richcontent.HatchKatexRenderer.PooledWebView) r10
            X.Hwg.A00(r1)
        L26:
            boolean r0 = r10.isReady
            if (r0 != 0) goto L6f
            long r5 = android.os.SystemClock.elapsedRealtime()
            long r5 = r5 - r3
            r1 = 10000(0x2710, double:4.9407E-320)
            int r0 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r0 <= 0) goto L49
            int r2 = r10.id
            java.lang.String r1 = "WebView "
            java.lang.String r0 = " initialization timed out"
            java.lang.String r1 = X.FGI.A0I(r1, r2, r0)
            java.lang.String r0 = "HatchKatexRenderer"
            X.CFK.A04(r0, r1)
            java.lang.Boolean r9 = X.AnonymousClass001.A0h()
            return r9
        L49:
            r7.L$0 = r10
            r7.J$0 = r3
            r7.label = r8
            r0 = 50
            java.lang.Object r0 = X.C7Bq.A01(r0, r7)
            if (r0 != r9) goto L26
            return r9
        L58:
            X.Hwg.A00(r1)
            boolean r0 = r10.isReady
            if (r0 != 0) goto L6f
            long r3 = android.os.SystemClock.elapsedRealtime()
            goto L26
        L64:
            com.facebook.aura.conversation.view.richcontent.HatchKatexRenderer$waitForReady$1 r7 = new com.facebook.aura.conversation.view.richcontent.HatchKatexRenderer$waitForReady$1
            r7.<init>(r11)
            goto L12
        L6a:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        L6f:
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r8)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.conversation.view.richcontent.HatchKatexRenderer.waitForReady(com.facebook.aura.conversation.view.richcontent.HatchKatexRenderer$PooledWebView, X.HtJ):java.lang.Object");
    }

    public final void clearCache() {
        F0C<HatchKatexRenderer$bitmapCacheDelegate$1.AnonymousClass1> f0c = bitmapCacheDelegate;
        if (f0c.AOX()) {
            f0c.getValue().evictAll();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0130 A[Catch: all -> 0x0162, TRY_LEAVE, TryCatch #0 {all -> 0x0162, blocks: (B:50:0x0129, B:51:0x012c, B:53:0x0130, B:47:0x00fc), top: B:95:0x0026 }] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x013e A[Catch: Exception -> 0x0167, CancellationException -> 0x0199, all -> 0x01a8, TryCatch #5 {CancellationException -> 0x0199, blocks: (B:54:0x0137, B:56:0x013e, B:57:0x0146, B:45:0x00f6, B:46:0x00f9, B:64:0x0163, B:65:0x0166, B:42:0x00d8), top: B:95:0x0026, outer: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0159 A[Catch: all -> 0x01c3, TRY_ENTER, TryCatch #1 {, blocks: (B:60:0x0159, B:75:0x0194, B:73:0x018c, B:84:0x01b6, B:86:0x01be, B:54:0x0137, B:56:0x013e, B:57:0x0146, B:45:0x00f6, B:46:0x00f9, B:64:0x0163, B:65:0x0166, B:42:0x00d8, B:67:0x0168, B:70:0x0176, B:79:0x019a, B:80:0x01a7), top: B:95:0x0026, inners: #3, #4 }] */
    /* JADX WARN: Type inference failed for: r15v11 */
    /* JADX WARN: Type inference failed for: r1v17, types: [com.facebook.aura.conversation.view.richcontent.HatchKatexRenderer$PooledWebView] */
    /* JADX WARN: Type inference failed for: r1v22 */
    /* JADX WARN: Type inference failed for: r1v23 */
    /* JADX WARN: Type inference failed for: r1v24 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object renderToBitmap(android.content.Context r16, java.lang.String r17, boolean r18, java.lang.String r19, int r20, X.HtJ<? super com.facebook.aura.conversation.view.richcontent.HatchKatexRenderer.RenderResult> r21) {
        /*
            Method dump skipped, instructions count: 457
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.conversation.view.richcontent.HatchKatexRenderer.renderToBitmap(android.content.Context, java.lang.String, boolean, java.lang.String, int, X.HtJ):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object warmUp(android.content.Context r8, X.HtJ<? super kotlin.Unit> r9) throws java.lang.Throwable {
        /*
            r7 = this;
            boolean r0 = r9 instanceof com.facebook.aura.conversation.view.richcontent.HatchKatexRenderer.C115221
            if (r0 == 0) goto L25
            r6 = r9
            com.facebook.aura.conversation.view.richcontent.HatchKatexRenderer$warmUp$1 r6 = (com.facebook.aura.conversation.view.richcontent.HatchKatexRenderer.C115221) r6
            int r2 = r6.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L25
            int r2 = r2 - r1
            r6.label = r2
        L12:
            java.lang.Object r5 = r6.result
            X.Hji r4 = X.EnumC10460Hji.A02
            int r0 = r6.label
            r3 = 2
            r2 = 1
            if (r0 == 0) goto L34
            if (r0 == r2) goto L4a
            if (r0 != r3) goto L2f
            java.lang.Object r1 = r6.L$1
            com.facebook.aura.conversation.view.richcontent.HatchKatexRenderer$PooledWebView r1 = (com.facebook.aura.conversation.view.richcontent.HatchKatexRenderer.PooledWebView) r1
            goto L2b
        L25:
            com.facebook.aura.conversation.view.richcontent.HatchKatexRenderer$warmUp$1 r6 = new com.facebook.aura.conversation.view.richcontent.HatchKatexRenderer$warmUp$1
            r6.<init>(r9)
            goto L12
        L2b:
            X.Hwg.A00(r5)     // Catch: java.lang.Throwable -> L66
            goto L5d
        L2f:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        L34:
            X.Hwg.A00(r5)
            r7.attachMemoryCallbacksIfNeeded()
            android.content.Context r1 = X.AnonymousClass001.A0I(r8)
            r0 = 0
            r6.L$0 = r0
            r6.label = r2
            java.lang.Object r5 = r7.acquireWebView(r1, r6)
            if (r5 != r4) goto L4d
        L49:
            return r4
        L4a:
            X.Hwg.A00(r5)
        L4d:
            com.facebook.aura.conversation.view.richcontent.HatchKatexRenderer$PooledWebView r5 = (com.facebook.aura.conversation.view.richcontent.HatchKatexRenderer.PooledWebView) r5
            r0 = 0
            r6.L$0 = r0     // Catch: java.lang.Throwable -> L63
            r6.L$1 = r5     // Catch: java.lang.Throwable -> L63
            r6.label = r3     // Catch: java.lang.Throwable -> L63
            java.lang.Object r0 = r7.waitForReady(r5, r6)     // Catch: java.lang.Throwable -> L63
            if (r0 == r4) goto L49
            r1 = r5
        L5d:
            r7.releaseWebView(r1)
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L63:
            r0 = move-exception
            r1 = r5
            goto L67
        L66:
            r0 = move-exception
        L67:
            r7.releaseWebView(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.conversation.view.richcontent.HatchKatexRenderer.warmUp(android.content.Context, X.HtJ):java.lang.Object");
    }

    private final long bitmapWeightBytes(String str, Bitmap bitmap) {
        Object objA0s;
        try {
            objA0s = Integer.valueOf(bitmap.getAllocationByteCount());
        } catch (Throwable th) {
            objA0s = C3cG.A0s(th);
        }
        Integer numValueOf = Integer.valueOf(bitmap.getByteCount());
        if (objA0s instanceof C10571Hud) {
            objA0s = numValueOf;
        }
        return AnonymousClass001.A0F(objA0s) + (str.length() * 2);
    }

    private final void cacheBitmap(String str, Bitmap bitmap) {
        if (bitmap.isRecycled() || bitmapWeightBytes(str, bitmap) > getBitmapCacheMaxBytes()) {
            return;
        }
        bitmapCacheDelegate.getValue().put(str, bitmap);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object executeRenderOn(final PooledWebView pooledWebView, String str, boolean z, String str2, int i, HtJ<? super RenderResult> htJ) {
        final GBL gblA03 = C7Bm.A03(htJ);
        String strA0Y = AbstractC7611F5y.A0Y(str);
        float f = C60Q.A0B(pooledWebView.appContext).density;
        StringBuilder sbA0x = C3cI.A0x("renderKatex('", strA0Y);
        sbA0x.append("', ");
        sbA0x.append(z);
        sbA0x.append(", '");
        sbA0x.append(str2);
        sbA0x.append("', ");
        sbA0x.append(f);
        C8j3.A1K(sbA0x);
        sbA0x.append(i);
        final String strA0v = AnonymousClass001.A0v(");", sbA0x);
        Runnable runnable = new Runnable() { // from class: com.facebook.aura.conversation.view.richcontent.HatchKatexRenderer$executeRenderOn$2$timeoutRunnable$1
            @Override // java.lang.Runnable
            public final void run() {
                if (C8j3.A10(pooledWebView.pendingCallback) != null) {
                    HatchKatexRenderer.PooledWebView pooledWebView2 = pooledWebView;
                    Hm1<HatchKatexRenderer.RenderResult> hm1 = gblA03;
                    pooledWebView2.timedOut = true;
                    if (hm1.isActive()) {
                        hm1.resumeWith(new HatchKatexRenderer.RenderResult.Error("Render timed out"));
                    }
                }
            }
        };
        pooledWebView.pendingCallback.set(new HatchKatexRenderer$executeRenderOn$2$1(runnable, gblA03));
        Handler handler = uiHandler;
        handler.postDelayed(runnable, 10000L);
        handler.post(new Runnable() { // from class: com.facebook.aura.conversation.view.richcontent.HatchKatexRenderer$executeRenderOn$2$2
            @Override // java.lang.Runnable
            public final void run() {
                pooledWebView.getWebView().evaluateJavascript(strA0v, null);
            }
        });
        gblA03.AO2(new HatchKatexRenderer$executeRenderOn$2$3(pooledWebView, runnable));
        return gblA03.A0F();
    }

    public final Bitmap peekCachedBitmap(String str, boolean z, String str2, int i) {
        AnonymousClass003.A0v(str, str2);
        attachMemoryCallbacksIfNeeded();
        if (str.length() > 65536) {
            return null;
        }
        return cachedBitmap(buildCacheKey(str, String.valueOf(z), str2, String.valueOf(i)));
    }
}
