package com.facebook.aura.spaces.preload;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.C06H;
import X.C10543Hqv;
import X.C3UX;
import X.C6t6;
import X.C6ys;
import X.C78W;
import X.C79;
import X.C7BY;
import X.C8eO;
import X.CFK;
import X.FGI;
import X.G0V;
import X.G2j;
import X.GAo;
import X.HtJ;
import X.Hwg;
import X.Hxb;
import android.content.Context;
import android.net.Uri;
import android.webkit.JavascriptInterface;
import com.facebook.aura.devices.pairing.LinkEncryptedPairingKt;
import com.facebook.aura.executors.AuraDispatchers;
import com.facebook.aura.json.HatchJsonKt;
import com.facebook.aura.spaces.repo.SpacesWebViewSessionKt;
import java.io.File;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final class SpacesShareBridge {
    public static final String BRIDGE_NAME = "_fwaSpacesShare";
    public static final Companion Companion = new Companion();
    public static final int MAX_BASE64_LENGTH = 34952536;
    public static final int MAX_FILE_BYTES = 26214400;
    public static final int MAX_MESSAGE_LENGTH = 34968920;
    public static final int MAX_MIME_LENGTH = 128;
    public static final long SHARE_TIMEOUT_MS = 30000;
    public static final String TAG = "SpacesShareBridge";
    public static final String script = "(function() {\n  if (window !== window.top || !window._fwaSpacesShare || window.__hatchSpacesShareInstalled) return;\n  window.__hatchSpacesShareInstalled = true;\n  var originalShare = navigator.share ? navigator.share.bind(navigator) : null;\n  var originalCanShare = navigator.canShare ? navigator.canShare.bind(navigator) : null;\n  var pending = null;\n  function finish(request, error) {\n    if (pending !== request) return;\n    pending = null;\n    clearTimeout(request.timeout);\n    if (request.reader.readyState === FileReader.LOADING) request.reader.abort();\n    if (error) request.reject(error); else request.resolve();\n  }\n  window.__fwaSpacesResolveShare = function(json) {\n    var result;\n    try { result = JSON.parse(json); } catch (error) { return; }\n    if (!pending || result.id !== pending.id) return;\n    finish(pending, result.error ? new DOMException('Unable to share file', result.error) : null);\n  };\n  function shareableFile(data) {\n    var files = data && data.files;\n    var file = files && files.length === 1 ? files[0] : null;\n    return file instanceof File &&\n      (file.type.indexOf('image/') === 0 || file.type.indexOf('video/') === 0) &&\n      file.size > 0 && file.size <= 26214400 ? file : null;\n  }\n  navigator.canShare = function(data) {\n    if (window._fwaSpacesShare && shareableFile(data)) return true;\n    return originalCanShare ? originalCanShare(data) : false;\n  };\n  navigator.share = function(data) {\n    var file = shareableFile(data);\n    if (!file || !window._fwaSpacesShare) {\n      return originalShare ? originalShare(data) :\n        Promise.reject(new DOMException('Share is not supported', 'NotSupportedError'));\n    }\n    if (!navigator.userActivation || !navigator.userActivation.isActive) {\n      return Promise.reject(new DOMException('Sharing requires a user gesture', 'NotAllowedError'));\n    }\n    if (pending) return Promise.reject(new DOMException('A share is in progress', 'InvalidStateError'));\n    return new Promise(function(resolve, reject) {\n      var reader = new FileReader();\n      var id = Date.now().toString(36) + Math.random().toString(36).slice(2);\n      var request = {id: id, reader: reader, resolve: resolve, reject: reject};\n      pending = request;\n      function startTimeout() {\n        clearTimeout(request.timeout);\n        request.timeout = setTimeout(function() {\n          finish(request, new DOMException('Share timed out', 'AbortError'));\n        }, 35000);\n      }\n      startTimeout();\n      reader.onload = function() {\n        if (pending !== request) return;\n        try {\n          startTimeout();\n          var token = typeof __fbAndroidBridgeAuthToken !== 'undefined' ? __fbAndroidBridgeAuthToken : '';\n          var error = window._fwaSpacesShare.share(token, request.id, JSON.stringify({\n            type: file.type,\n            name: String(file.name || '').slice(0, 256),\n            title: String(data.title || document.title || '').slice(0, 256),\n            data: String(reader.result || '')\n          }));\n          if (error) finish(request, new DOMException('Unable to share file', error));\n        } catch (error) { finish(request, error); }\n      };\n      reader.onerror = reader.onabort = function() {\n        finish(request, reader.error || new DOMException('File read aborted', 'AbortError'));\n      };\n      try { reader.readAsDataURL(file); } catch (error) { finish(request, error); }\n    });\n  };\n})();";
    public final Context appContext;
    public Function0<Boolean> canShare;
    public volatile boolean closed;
    public G2j<? super Uri, ? super String, ? super String, ? super String, Unit> onShare;
    public final C3UX scope;
    public volatile C6t6 secureWebView;
    public final G0V<String, byte[], File> stageFile;
    public final AtomicBoolean staging;

    public final class Companion {
        public final String getScript$fbandroid_express_aura_java_com_facebook_aura_spaces_preload_preload() {
            return SpacesShareBridge.script;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isAvailable(C6t6 c6t6, String str) {
        Function0<Boolean> function0;
        try {
            if (!this.closed && this.secureWebView == c6t6 && c6t6.validateJsInterfaceToken(str) && SpacesWebViewSessionKt.isOnGrantedSpaceOrigin(c6t6) && (function0 = this.canShare) != null) {
                if (AnonymousClass003.A1Y(function0)) {
                    return true;
                }
            }
            return false;
        } catch (RuntimeException unused) {
            CFK.A06(TAG, "Space share failed during validation");
            return false;
        }
    }

    public final void close() {
        this.closed = true;
        Hxb.A03(null, this.scope);
        this.secureWebView = null;
        this.canShare = null;
        this.onShare = null;
    }

    @JavascriptInterface
    public final String share(final String str, final String str2, final String str3) {
        boolean zA1Z = AnonymousClass005.A1Z(str, str2, str3);
        final C6t6 c6t6 = this.secureWebView;
        if (c6t6 == null || this.closed) {
            return "NotAllowedError";
        }
        if (C7BY.A0j(str2) || str2.length() > 128 || str3.length() > 34968920) {
            return "DataError";
        }
        if (!this.staging.compareAndSet(false, zA1Z)) {
            return "InvalidStateError";
        }
        if (c6t6.post(new Runnable() { // from class: com.facebook.aura.spaces.preload.SpacesShareBridge$share$posted$1

            @DebugMetadata(c = "com.facebook.aura.spaces.preload.SpacesShareBridge$share$posted$1$1", f = "SpacesShareBridge.kt", l = {LinkEncryptedPairingKt.LINK_PUBLIC_KEY_SIZE, 123, 123, 123}, m = "invokeSuspend", v = 2)
            /* renamed from: com.facebook.aura.spaces.preload.SpacesShareBridge$share$posted$1$1, reason: invalid class name */
            public final class AnonymousClass1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
                public final /* synthetic */ String $payload;
                public final /* synthetic */ String $requestId;
                public final /* synthetic */ String $sourceUrl;
                public final /* synthetic */ String $token;
                public final /* synthetic */ C6t6 $webView;
                public Object L$0;
                public Object L$1;
                public Object L$2;
                public Object L$3;
                public Object L$4;
                public int label;
                public final /* synthetic */ SpacesShareBridge this$0;

                @DebugMetadata(c = "com.facebook.aura.spaces.preload.SpacesShareBridge$share$posted$1$1$1", f = "SpacesShareBridge.kt", l = {}, m = "invokeSuspend", v = 2)
                /* renamed from: com.facebook.aura.spaces.preload.SpacesShareBridge$share$posted$1$1$1, reason: invalid class name and collision with other inner class name */
                /* loaded from: classes.dex */
                public final class C03801 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Boolean>, Object> {
                    public final /* synthetic */ C10543Hqv<File> $stagedFile;
                    public int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public C03801(C10543Hqv<File> c10543Hqv, HtJ<? super C03801> htJ) {
                        super(2, htJ);
                        this.$stagedFile = c10543Hqv;
                    }

                    @Override // X.AbstractC8884Fsp
                    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
                        return new C03801(this.$stagedFile, htJ);
                    }

                    @Override // X.AbstractC8884Fsp
                    public final Object invokeSuspend(Object obj) {
                        if (this.label != 0) {
                            throw AnonymousClass001.A0n();
                        }
                        Hwg.A00(obj);
                        File file = this.$stagedFile.element;
                        if (file != null) {
                            return Boolean.valueOf(file.delete());
                        }
                        return null;
                    }

                    @Override // X.G0V
                    public final Object invoke(C3UX c3ux, HtJ<? super Boolean> htJ) {
                        return new C03801(this.$stagedFile, htJ).invokeSuspend(Unit.INSTANCE);
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass1(SpacesShareBridge spacesShareBridge, C6t6 c6t6, String str, String str2, String str3, String str4, HtJ<? super AnonymousClass1> htJ) {
                    super(2, htJ);
                    this.this$0 = spacesShareBridge;
                    this.$webView = c6t6;
                    this.$requestId = str;
                    this.$sourceUrl = str2;
                    this.$token = str3;
                    this.$payload = str4;
                }

                @Override // X.AbstractC8884Fsp
                public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
                    return new AnonymousClass1(this.this$0, this.$webView, this.$requestId, this.$sourceUrl, this.$token, this.$payload, htJ);
                }

                /* JADX WARN: Can't wrap try/catch for region: R(14:0|2|99|(1:(1:(1:(1:(7:8|93|9|74|(1:81)|85|86)(2:12|13))(7:14|89|15|55|(1:59)|57|58))(7:18|95|19|39|(0)|57|58))(3:22|101|23))(6:26|106|27|105|28|(1:30))|31|(1:33)|103|34|(2:36|(1:38))|39|(0)|57|58|(1:(0))) */
                /* JADX WARN: Code restructure failed: missing block: B:82:0x019f, code lost:
                
                    r1 = th;
                 */
                /* JADX WARN: Removed duplicated region for block: B:59:0x013e A[PHI: r1 r2 r4 r5
  0x013e: PHI (r1v9 java.lang.String) = (r1v11 java.lang.String), (r1v22 java.lang.String) binds: [B:56:0x0136, B:40:0x00f3] A[DONT_GENERATE, DONT_INLINE]
  0x013e: PHI (r2v3 X.6t6) = (r2v5 X.6t6), (r2v14 X.6t6) binds: [B:56:0x0136, B:40:0x00f3] A[DONT_GENERATE, DONT_INLINE]
  0x013e: PHI (r4v3 com.facebook.aura.spaces.preload.SpacesShareBridge) = (r4v5 com.facebook.aura.spaces.preload.SpacesShareBridge), (r4v13 com.facebook.aura.spaces.preload.SpacesShareBridge) binds: [B:56:0x0136, B:40:0x00f3] A[DONT_GENERATE, DONT_INLINE]
  0x013e: PHI (r5v3 java.lang.String) = (r5v4 java.lang.String), (r5v12 java.lang.String) binds: [B:56:0x0136, B:40:0x00f3] A[DONT_GENERATE, DONT_INLINE]] */
                /* JADX WARN: Removed duplicated region for block: B:71:0x015c A[Catch: all -> 0x018a, TryCatch #3 {all -> 0x018a, blocks: (B:69:0x0158, B:71:0x015c), top: B:91:0x0158 }] */
                /* JADX WARN: Removed duplicated region for block: B:81:0x019d A[PHI: r1 r2 r4 r5 r7
  0x019d: PHI (r1v14 'th' java.lang.Throwable) = 
  (r1v8 'th' java.lang.Throwable)
  (r1v12 'th' java.lang.Throwable)
  (r1v15 'th' java.lang.Throwable)
  (r1v21 'th' java.lang.Throwable)
 binds: [B:62:0x0150, B:79:0x019a, B:75:0x0187, B:84:0x01af] A[DONT_GENERATE, DONT_INLINE]
  0x019d: PHI (r2v8 java.lang.String) = (r2v2 java.lang.String), (r2v6 java.lang.String), (r2v9 java.lang.String), (r2v13 java.lang.String) binds: [B:62:0x0150, B:79:0x019a, B:75:0x0187, B:84:0x01af] A[DONT_GENERATE, DONT_INLINE]
  0x019d: PHI (r4v8 X.6t6) = (r4v2 X.6t6), (r4v6 X.6t6), (r4v9 X.6t6), (r4v12 X.6t6) binds: [B:62:0x0150, B:79:0x019a, B:75:0x0187, B:84:0x01af] A[DONT_GENERATE, DONT_INLINE]
  0x019d: PHI (r5v6 java.lang.String) = (r5v2 java.lang.String), (r5v5 java.lang.String), (r5v7 java.lang.String), (r5v11 java.lang.String) binds: [B:62:0x0150, B:79:0x019a, B:75:0x0187, B:84:0x01af] A[DONT_GENERATE, DONT_INLINE]
  0x019d: PHI (r7v4 com.facebook.aura.spaces.preload.SpacesShareBridge) = 
  (r7v1 com.facebook.aura.spaces.preload.SpacesShareBridge)
  (r7v2 com.facebook.aura.spaces.preload.SpacesShareBridge)
  (r7v5 com.facebook.aura.spaces.preload.SpacesShareBridge)
  (r7v6 com.facebook.aura.spaces.preload.SpacesShareBridge)
 binds: [B:62:0x0150, B:79:0x019a, B:75:0x0187, B:84:0x01af] A[DONT_GENERATE, DONT_INLINE]] */
                @Override // X.AbstractC8884Fsp
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object invokeSuspend(java.lang.Object r24) throws java.lang.Throwable {
                    /*
                        Method dump skipped, instructions count: 437
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.spaces.preload.SpacesShareBridge$share$posted$1.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
                }

                @Override // X.G0V
                public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
                    return ((AnonymousClass1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
                }
            }

            @Override // java.lang.Runnable
            public final void run() {
                if (!this.this$0.isAvailable(c6t6, str)) {
                    this.this$0.staging.set(false);
                    this.this$0.respond(c6t6, str2, "NotAllowedError");
                    return;
                }
                String url = c6t6.getUrl();
                SpacesShareBridge spacesShareBridge = this.this$0;
                C3UX c3ux = spacesShareBridge.scope;
                GAo.A02(C79.A0K, C6ys.A00, new AnonymousClass1(spacesShareBridge, c6t6, str2, url, str, str3, null), c3ux);
            }
        })) {
            return "";
        }
        this.staging.set(false);
        return "AbortError";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void respond(C6t6 c6t6, String str, String str2) {
        try {
            c6t6.evaluateJavascript(FGI.A0U("window.__fwaSpacesResolveShare&&window.__fwaSpacesResolveShare(", SpacesWebViewFactoryKt.toJsStringLiteral(HatchJsonKt.HatchJson.A02(new SpacesShareResultJson(str, str2), SpacesShareResultJson$$serializer.INSTANCE)), ");"), null);
        } catch (RuntimeException unused) {
            CFK.A06(TAG, "Space share failed during reply");
        }
    }

    public final Function0<Boolean> getCanShare() {
        return this.canShare;
    }

    public final G2j<Uri, String, String, String, Unit> getOnShare() {
        return this.onShare;
    }

    public final C6t6 getSecureWebView() {
        return this.secureWebView;
    }

    public final void setCanShare(Function0<Boolean> function0) {
        this.canShare = function0;
    }

    public final void setOnShare(G2j<? super Uri, ? super String, ? super String, ? super String, Unit> g2j) {
        this.onShare = g2j;
    }

    public final void setSecureWebView(C6t6 c6t6) {
        this.secureWebView = c6t6;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SpacesShareBridge(Context context, G0V<? super String, ? super byte[], ? extends File> g0v) {
        boolean zA1b = AnonymousClass004.A1b(context, g0v);
        this.stageFile = g0v;
        this.appContext = context.getApplicationContext();
        this.scope = C78W.A05(new C8eO(null), AuraDispatchers.main);
        this.staging = new AtomicBoolean(zA1b);
    }
}
