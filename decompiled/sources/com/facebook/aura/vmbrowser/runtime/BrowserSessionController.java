package com.facebook.aura.vmbrowser.runtime;

import X.ATD;
import X.AbstractC07127nr;
import X.AbstractC3358CGz;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.BLG;
import X.C06H;
import X.C10571Hud;
import X.C1BN;
import X.C22I;
import X.C2zT;
import X.C3Em;
import X.C3UX;
import X.C3cG;
import X.C3cH;
import X.C3cI;
import X.C3cJ;
import X.C3pd;
import X.C60N;
import X.C6ys;
import X.C7384Etj;
import X.C78W;
import X.C79;
import X.C7Bq;
import X.C8eO;
import X.C8j2;
import X.C9286GCn;
import X.C9290GCr;
import X.CFK;
import X.DCl;
import X.EnumC10460Hji;
import X.FGI;
import X.G0U;
import X.G0V;
import X.GAo;
import X.GCV;
import X.HoC;
import X.HsJ;
import X.HtJ;
import X.Hwg;
import X.HxO;
import X.Hxb;
import X.HzR;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.util.AndroidRuntimeException;
import android.util.Base64;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.webkit.JavascriptInterface;
import android.webkit.WebView;
import com.facebook.aura.browsertask.control.BrowserControlLeaseJson;
import com.facebook.aura.browsertask.control.BrowserControlResult;
import com.facebook.aura.browsertask.control.BrowserPresentResult;
import com.facebook.aura.browsertask.control.BrowserTaskControlClient;
import com.facebook.aura.browsertask.control.BrowserTaskControlTransport;
import com.facebook.aura.browsertask.control.BrowserTaskSnapshotJson;
import com.facebook.aura.browsertask.control.BrowserViewerPreference;
import com.facebook.aura.browsertask.data.BrowserTaskRepository;
import com.facebook.aura.executors.AuraDispatchers;
import com.facebook.aura.json.NetworkException;
import com.facebook.aura.model.BrowserTaskPresentation;
import com.facebook.aura.network.transport.HatchDuplexHttpStream;
import com.facebook.aura.network.transport.HatchDuplexResponseHandler;
import com.facebook.aura.network.transport.HatchHttpResponse;
import com.facebook.aura.partners.wearables.linking.MC;
import com.facebook.aura.vmbrowser.config.BrowserDeviceClipboardConfig;
import com.facebook.aura.vmbrowser.runtime.BrowserSessionController;
import com.facebook.aura.vmbrowser.runtime.BrowserViewerUpdateResult;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public final class BrowserSessionController {
    public static final int $stable = 8;
    public static final Companion Companion = new Companion();
    public static final float MAX_ZOOM_MULTIPLIER = 3.0f;
    public static final float MIN_ZOOM_MULTIPLIER = 1.0f;
    public final BLG<Boolean> _hasFirstFrame;
    public final BLG<Boolean> _isConnected;
    public final C3Em<String> _remoteClipboardText;
    public final BLG<Boolean> _streamFailed;
    public final BrowserClipboardMenu clipboardMenu;
    public final C1BN<Boolean> clipboardMenuShown;
    public final BrowserTaskControlClient controlClient;
    public final BrowserTaskControlTransport controlTransport;
    public volatile boolean coverViewportEnabled;
    public volatile HzR<byte[]> duplexOutboundFrames;
    public volatile HatchDuplexHttpStream duplexStream;
    public volatile boolean hasEverConnected;
    public final C1BN<Boolean> hasFirstFrame;
    public volatile boolean inputEnabled;
    public volatile boolean intentionallyClosing;
    public final C1BN<Boolean> isConnected;
    public final Handler mainHandler;
    public final AtomicInteger nativeSocketGeneration;
    public volatile AtomicBoolean noiseDuplexTerminal;
    public volatile boolean panModeEnabled;
    public int reloadAttempt;
    public HoC reloadJob;
    public volatile boolean reloadPending;
    public final C3UX reloadScope;
    public final C22I<String> remoteClipboardText;
    public final C3UX scope;
    public HoC socketJob;
    public final C1BN<Boolean> streamFailed;
    public final BrowserTaskRepository taskRepository;
    public volatile float unobscuredViewportAspectRatio;
    public final AbstractC3358CGz userSession;
    public volatile VncHost vncHost;
    public WebView webView;
    public volatile float zoomMultiplier;

    public final class JsBridge {
        public final int documentGeneration;
        public final VncHost host;
        public final /* synthetic */ BrowserSessionController this$0;

        public JsBridge(BrowserSessionController browserSessionController, VncHost vncHost, int i) {
            C7384Etj.A0Y(vncHost, 1);
            this.this$0 = browserSessionController;
            this.host = vncHost;
            this.documentGeneration = i;
        }

        @JavascriptInterface
        public final void onClipboard(String str) {
            Object objA0s;
            C7384Etj.A0Y(str, 0);
            try {
                byte[] bArrDecode = Base64.decode(str, 2);
                C7384Etj.A0U(bArrDecode);
                objA0s = new String(bArrDecode, DCl.A05);
            } catch (Throwable th) {
                objA0s = C3cG.A0s(th);
            }
            if (objA0s instanceof C10571Hud) {
                objA0s = null;
            }
            final String str2 = (String) objA0s;
            if (str2 == null || str2.length() == 0) {
                return;
            }
            final BrowserSessionController browserSessionController = this.this$0;
            withCurrentHost(new Function0() { // from class: com.facebook.aura.vmbrowser.runtime.BrowserSessionController$JsBridge$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return BrowserSessionController.JsBridge.onClipboard$lambda$1(this.f$0, browserSessionController, str2);
                }
            });
        }

        @JavascriptInterface
        public final void onClipboardMenu(final float f, final float f2, final int i) {
            final int i2 = this.this$0.nativeSocketGeneration.get();
            final BrowserSessionController browserSessionController = this.this$0;
            withCurrentHost(new Function0() { // from class: com.facebook.aura.vmbrowser.runtime.BrowserSessionController$JsBridge$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return BrowserSessionController.JsBridge.onClipboardMenu$lambda$0(browserSessionController, f, f2, i, this, i2);
                }
            });
        }

        @JavascriptInterface
        public final void socketSend(final String str) {
            C7384Etj.A0Y(str, 0);
            final BrowserSessionController browserSessionController = this.this$0;
            withCurrentHost(new Function0() { // from class: com.facebook.aura.vmbrowser.runtime.BrowserSessionController$JsBridge$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    browserSessionController.onJsSocketSend(str);
                    return Unit.INSTANCE;
                }
            });
        }

        private final boolean isCurrentDocument() {
            return this.this$0.isCurrentHost(this.host) && this.host.documentGeneration == this.documentGeneration;
        }

        public static final Unit onClipboard$lambda$1(JsBridge jsBridge, BrowserSessionController browserSessionController, String str) {
            if (!jsBridge.host.viewOnly && AnonymousClass003.A1Y(jsBridge.host.isActive) && browserSessionController.inputEnabled) {
                browserSessionController._remoteClipboardText.AhV(str);
            }
            return Unit.INSTANCE;
        }

        public static final Unit onClipboardMenu$lambda$0(final BrowserSessionController browserSessionController, float f, float f2, int i, final JsBridge jsBridge, final int i2) {
            WebView webView = browserSessionController.webView;
            if (webView != null) {
                browserSessionController.clipboardMenu.show(webView, f, f2, i, new Function0() { // from class: com.facebook.aura.vmbrowser.runtime.BrowserSessionController$JsBridge$$ExternalSyntheticLambda10
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return Boolean.valueOf(BrowserSessionController.JsBridge.onClipboardMenu$lambda$0$0(this.f$0, browserSessionController, i2));
                    }
                });
            }
            return Unit.INSTANCE;
        }

        public static final Unit onConnected$lambda$0(String str, BrowserSessionController browserSessionController) {
            CFK.A05(BrowserSessionControllerKt.TAG, FGI.A0M("VNC connected", str != null ? FGI.A0M(": ", str) : ""));
            browserSessionController.hasEverConnected = true;
            C3cJ.A0C(browserSessionController._isConnected, true);
            AnonymousClass003.A14(browserSessionController._streamFailed, false);
            browserSessionController.reloadAttempt = 0;
            browserSessionController.reloadPending = false;
            return Unit.INSTANCE;
        }

        public static final Unit onDisconnected$lambda$0(BrowserSessionController browserSessionController, String str, JsBridge jsBridge) {
            browserSessionController.clipboardMenu.invalidate(null);
            AnonymousClass003.A14(browserSessionController._isConnected, false);
            CFK.A05(BrowserSessionControllerKt.TAG, FGI.A0M("VNC disconnected", str != null ? FGI.A0M(": ", str) : ""));
            browserSessionController.scheduleReload(jsBridge.host, true);
            return Unit.INSTANCE;
        }

        public static final Unit onFirstFrame$lambda$0(BrowserSessionController browserSessionController) {
            if (AnonymousClass003.A1Z(browserSessionController._isConnected)) {
                AnonymousClass004.A1D(true, browserSessionController._hasFirstFrame);
            }
            return Unit.INSTANCE;
        }

        public static final Unit onSecurityFailure$lambda$0(BrowserSessionController browserSessionController, String str) {
            browserSessionController.clipboardMenu.invalidate(null);
            AnonymousClass003.A14(browserSessionController._streamFailed, true);
            browserSessionController.reloadPending = true;
            CFK.A06(BrowserSessionControllerKt.TAG, FGI.A0M("VNC security failure", str != null ? FGI.A0M(": ", str) : ""));
            return Unit.INSTANCE;
        }

        public static final Unit socketOpen$lambda$0(BrowserSessionController browserSessionController, JsBridge jsBridge) {
            browserSessionController.onJsSocketOpen(jsBridge.host);
            return Unit.INSTANCE;
        }

        private final void withCurrentHost(final Function0<Unit> function0) {
            this.this$0.mainHandler.post(new Runnable() { // from class: com.facebook.aura.vmbrowser.runtime.BrowserSessionController$JsBridge$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    BrowserSessionController.JsBridge.withCurrentHost$lambda$0(this.f$0, function0);
                }
            });
        }

        @JavascriptInterface
        public final float getUnobscuredViewportAspectRatio() {
            return this.this$0.unobscuredViewportAspectRatio;
        }

        @JavascriptInterface
        public final float getZoomMultiplier() {
            return this.this$0.zoomMultiplier;
        }

        @JavascriptInterface
        public final boolean isCoverViewportEnabled() {
            return this.this$0.coverViewportEnabled;
        }

        @JavascriptInterface
        public final boolean isPanModeEnabled() {
            return this.this$0.panModeEnabled;
        }

        @JavascriptInterface
        public final boolean isViewOnly() {
            return this.host.viewOnly;
        }

        @JavascriptInterface
        public final void onConnected(final String str) {
            final BrowserSessionController browserSessionController = this.this$0;
            withCurrentHost(new Function0() { // from class: com.facebook.aura.vmbrowser.runtime.BrowserSessionController$JsBridge$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return BrowserSessionController.JsBridge.onConnected$lambda$0(str, browserSessionController);
                }
            });
        }

        @JavascriptInterface
        public final void onDisconnected(final String str) {
            final BrowserSessionController browserSessionController = this.this$0;
            withCurrentHost(new Function0() { // from class: com.facebook.aura.vmbrowser.runtime.BrowserSessionController$JsBridge$$ExternalSyntheticLambda7
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return BrowserSessionController.JsBridge.onDisconnected$lambda$0(browserSessionController, str, this);
                }
            });
        }

        @JavascriptInterface
        public final void onFirstFrame() {
            final BrowserSessionController browserSessionController = this.this$0;
            withCurrentHost(new Function0() { // from class: com.facebook.aura.vmbrowser.runtime.BrowserSessionController$JsBridge$$ExternalSyntheticLambda8
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return BrowserSessionController.JsBridge.onFirstFrame$lambda$0(browserSessionController);
                }
            });
        }

        @JavascriptInterface
        public final void onSecurityFailure(final String str) {
            final BrowserSessionController browserSessionController = this.this$0;
            withCurrentHost(new Function0() { // from class: com.facebook.aura.vmbrowser.runtime.BrowserSessionController$JsBridge$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return BrowserSessionController.JsBridge.onSecurityFailure$lambda$0(browserSessionController, str);
                }
            });
        }

        @JavascriptInterface
        public final void socketClose() {
            final BrowserSessionController browserSessionController = this.this$0;
            withCurrentHost(new Function0() { // from class: com.facebook.aura.vmbrowser.runtime.BrowserSessionController$JsBridge$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    browserSessionController.closeNativeSocket();
                    return Unit.INSTANCE;
                }
            });
        }

        @JavascriptInterface
        public final void socketOpen() {
            final BrowserSessionController browserSessionController = this.this$0;
            withCurrentHost(new Function0() { // from class: com.facebook.aura.vmbrowser.runtime.BrowserSessionController$JsBridge$$ExternalSyntheticLambda9
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    browserSessionController.onJsSocketOpen(this.host);
                    return Unit.INSTANCE;
                }
            });
        }

        public static final boolean onClipboardMenu$lambda$0$0(JsBridge jsBridge, BrowserSessionController browserSessionController, int i) {
            return jsBridge.isCurrentDocument() && AnonymousClass003.A1Y(jsBridge.host.isActive) && !jsBridge.host.viewOnly && browserSessionController.inputEnabled && C3cH.A1R(browserSessionController.isConnected) && C3cH.A1R(browserSessionController.hasFirstFrame) && !C3cH.A1R(browserSessionController.streamFailed) && browserSessionController.nativeSocketGeneration.get() == i;
        }

        public static final Unit socketClose$lambda$0(BrowserSessionController browserSessionController) {
            browserSessionController.closeNativeSocket();
            return Unit.INSTANCE;
        }

        public static final Unit socketSend$lambda$0(BrowserSessionController browserSessionController, String str) {
            browserSessionController.onJsSocketSend(str);
            return Unit.INSTANCE;
        }

        public static final void withCurrentHost$lambda$0(JsBridge jsBridge, Function0 function0) {
            if (jsBridge.isCurrentDocument()) {
                function0.invoke();
            }
        }

        @JavascriptInterface
        public final int beginClipboardGesture() {
            if (isCurrentDocument() && AnonymousClass003.A1Y(this.host.isActive) && !this.host.viewOnly && this.this$0.inputEnabled) {
                return this.this$0.clipboardMenu.beginGesture();
            }
            return -1;
        }

        @JavascriptInterface
        public final void cancelClipboardGesture(int i) {
            if (isCurrentDocument()) {
                this.this$0.clipboardMenu.invalidate(Integer.valueOf(i));
            }
        }

        @JavascriptInterface
        public final boolean isInputEnabled() {
            return isCurrentDocument() && AnonymousClass003.A1Y(this.host.isActive) && !this.host.viewOnly && this.this$0.inputEnabled;
        }
    }

    public final class VncHost {
        public final AtomicBoolean closed;
        public volatile int documentGeneration;
        public final Function0<Boolean> isActive;
        public final G0U<HtJ<? super BrowserPresentResult>, Object> prepareStream;
        public final String taskId;
        public volatile boolean viewOnly;

        /* JADX WARN: Multi-variable type inference failed */
        public VncHost(String str, boolean z, G0U<? super HtJ<? super BrowserPresentResult>, ? extends Object> g0u, Function0<Boolean> function0) {
            AnonymousClass005.A11(str, g0u, function0, 0);
            this.taskId = str;
            this.viewOnly = z;
            this.prepareStream = g0u;
            this.isActive = function0;
            this.closed = new AtomicBoolean(false);
        }

        public final AtomicBoolean getClosed() {
            return this.closed;
        }

        public final int getDocumentGeneration() {
            return this.documentGeneration;
        }

        public final G0U<HtJ<? super BrowserPresentResult>, Object> getPrepareStream() {
            return this.prepareStream;
        }

        public final String getTaskId() {
            return this.taskId;
        }

        public final boolean getViewOnly() {
            return this.viewOnly;
        }

        public final Function0<Boolean> isActive() {
            return this.isActive;
        }

        public final void setDocumentGeneration(int i) {
            this.documentGeneration = i;
        }

        public final void setViewOnly(boolean z) {
            this.viewOnly = z;
        }
    }

    @DebugMetadata(c = "com.facebook.aura.vmbrowser.runtime.BrowserSessionController$openNoiseDuplexStream$1", f = "BrowserSessionController.kt", l = {MC.android_lobster_wearables_v2.__CONFIG__, 575, 589, 623}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.vmbrowser.runtime.BrowserSessionController$openNoiseDuplexStream$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ int $generation;
        public final /* synthetic */ VncHost $host;
        public final /* synthetic */ AtomicBoolean $opened;
        public final /* synthetic */ HzR<byte[]> $outboundFrames;
        public final /* synthetic */ BrowserSessionController$openNoiseDuplexStream$responseHandler$1 $responseHandler;
        public final /* synthetic */ String $taskId;
        public final /* synthetic */ AtomicBoolean $terminal;
        public /* synthetic */ Object L$0;
        public Object L$1;
        public Object L$2;
        public boolean Z$0;
        public int label;

        @DebugMetadata(c = "com.facebook.aura.vmbrowser.runtime.BrowserSessionController$openNoiseDuplexStream$1$1", f = "BrowserSessionController.kt", l = {610, 611}, m = "invokeSuspend", v = 2)
        /* renamed from: com.facebook.aura.vmbrowser.runtime.BrowserSessionController$openNoiseDuplexStream$1$1, reason: invalid class name and collision with other inner class name */
        public final class C04331 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
            public final /* synthetic */ int $generation;
            public final /* synthetic */ HzR<byte[]> $outboundFrames;
            public final /* synthetic */ HatchDuplexHttpStream $stream;
            public final /* synthetic */ AtomicBoolean $terminal;
            public Object L$0;
            public Object L$1;
            public int label;
            public final /* synthetic */ BrowserSessionController this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C04331(HzR<byte[]> hzR, HatchDuplexHttpStream hatchDuplexHttpStream, BrowserSessionController browserSessionController, int i, AtomicBoolean atomicBoolean, HtJ<? super C04331> htJ) {
                super(2, htJ);
                this.$outboundFrames = hzR;
                this.$stream = hatchDuplexHttpStream;
                this.this$0 = browserSessionController;
                this.$generation = i;
                this.$terminal = atomicBoolean;
            }

            @Override // X.AbstractC8884Fsp
            public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
                return new C04331(this.$outboundFrames, this.$stream, this.this$0, this.$generation, this.$terminal, htJ);
            }

            /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
            /* JADX WARN: Removed duplicated region for block: B:18:0x003b A[Catch: Exception -> 0x0069, CancellationException -> 0x0078, TryCatch #2 {CancellationException -> 0x0078, Exception -> 0x0069, blocks: (B:21:0x0051, B:22:0x0054, B:12:0x0024, B:16:0x0035, B:18:0x003b, B:24:0x005a, B:15:0x0032, B:11:0x001e), top: B:33:0x0006 }] */
            /* JADX WARN: Removed duplicated region for block: B:24:0x005a A[Catch: Exception -> 0x0069, CancellationException -> 0x0078, TryCatch #2 {CancellationException -> 0x0078, Exception -> 0x0069, blocks: (B:21:0x0051, B:22:0x0054, B:12:0x0024, B:16:0x0035, B:18:0x003b, B:24:0x005a, B:15:0x0032, B:11:0x001e), top: B:33:0x0006 }] */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x004e -> B:22:0x0054). Please report as a decompilation issue!!! */
            @Override // X.AbstractC8884Fsp
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r8) throws java.lang.Throwable {
                /*
                    r7 = this;
                    X.Hji r6 = X.EnumC10460Hji.A02
                    int r0 = r7.label
                    r5 = 2
                    r4 = 1
                    if (r0 == 0) goto L1b
                    if (r0 == r4) goto L16
                    if (r0 != r5) goto L11
                    java.lang.Object r3 = r7.L$0
                    X.GCW r3 = (X.GCW) r3
                    goto L51
                L11:
                    java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
                    throw r0
                L16:
                    java.lang.Object r3 = r7.L$0
                    X.GCW r3 = (X.GCW) r3
                    goto L32
                L1b:
                    X.Hwg.A00(r8)
                    X.HzR<byte[]> r0 = r7.$outboundFrames     // Catch: java.lang.Exception -> L69 java.util.concurrent.CancellationException -> L78
                    X.GCW r3 = r0.APO()     // Catch: java.lang.Exception -> L69 java.util.concurrent.CancellationException -> L78
                L24:
                    r7.L$0 = r3     // Catch: java.lang.Exception -> L69 java.util.concurrent.CancellationException -> L78
                    r0 = 0
                    r7.L$1 = r0     // Catch: java.lang.Exception -> L69 java.util.concurrent.CancellationException -> L78
                    r7.label = r4     // Catch: java.lang.Exception -> L69 java.util.concurrent.CancellationException -> L78
                    java.lang.Object r8 = r3.A01(r7)     // Catch: java.lang.Exception -> L69 java.util.concurrent.CancellationException -> L78
                    if (r8 != r6) goto L35
                    goto L67
                L32:
                    X.Hwg.A00(r8)     // Catch: java.lang.Exception -> L69 java.util.concurrent.CancellationException -> L78
                L35:
                    boolean r0 = X.AnonymousClass001.A1X(r8)     // Catch: java.lang.Exception -> L69 java.util.concurrent.CancellationException -> L78
                    if (r0 == 0) goto L75
                    java.lang.Object r2 = r3.A00()     // Catch: java.lang.Exception -> L69 java.util.concurrent.CancellationException -> L78
                    byte[] r2 = (byte[]) r2     // Catch: java.lang.Exception -> L69 java.util.concurrent.CancellationException -> L78
                    com.facebook.aura.network.transport.HatchDuplexHttpStream r1 = r7.$stream     // Catch: java.lang.Exception -> L69 java.util.concurrent.CancellationException -> L78
                    r7.L$0 = r3     // Catch: java.lang.Exception -> L69 java.util.concurrent.CancellationException -> L78
                    r0 = 0
                    r7.L$1 = r0     // Catch: java.lang.Exception -> L69 java.util.concurrent.CancellationException -> L78
                    r7.label = r5     // Catch: java.lang.Exception -> L69 java.util.concurrent.CancellationException -> L78
                    java.lang.Object r8 = r1.writeRequestChunk(r2, r7)     // Catch: java.lang.Exception -> L69 java.util.concurrent.CancellationException -> L78
                    if (r8 != r6) goto L54
                    goto L68
                L51:
                    X.Hwg.A00(r8)     // Catch: java.lang.Exception -> L69 java.util.concurrent.CancellationException -> L78
                L54:
                    boolean r0 = X.AnonymousClass001.A1X(r8)     // Catch: java.lang.Exception -> L69 java.util.concurrent.CancellationException -> L78
                    if (r0 != 0) goto L24
                    com.facebook.aura.vmbrowser.runtime.BrowserSessionController r4 = r7.this$0     // Catch: java.lang.Exception -> L69 java.util.concurrent.CancellationException -> L78
                    int r3 = r7.$generation     // Catch: java.lang.Exception -> L69 java.util.concurrent.CancellationException -> L78
                    java.util.concurrent.atomic.AtomicBoolean r2 = r7.$terminal     // Catch: java.lang.Exception -> L69 java.util.concurrent.CancellationException -> L78
                    java.lang.String r1 = "VNC Noise duplex write rejected"
                    r0 = 0
                    com.facebook.aura.vmbrowser.runtime.BrowserSessionController.openNoiseDuplexStream$fail(r4, r3, r2, r1, r0)     // Catch: java.lang.Exception -> L69 java.util.concurrent.CancellationException -> L78
                    goto L75
                L67:
                    return r6
                L68:
                    return r6
                L69:
                    r4 = move-exception
                    com.facebook.aura.vmbrowser.runtime.BrowserSessionController r3 = r7.this$0
                    int r2 = r7.$generation
                    java.util.concurrent.atomic.AtomicBoolean r1 = r7.$terminal
                    java.lang.String r0 = "VNC Noise duplex write failed"
                    com.facebook.aura.vmbrowser.runtime.BrowserSessionController.openNoiseDuplexStream$fail(r3, r2, r1, r0, r4)
                L75:
                    kotlin.Unit r6 = kotlin.Unit.INSTANCE
                    return r6
                L78:
                    r0 = move-exception
                    throw r0
                */
                throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.vmbrowser.runtime.BrowserSessionController.AnonymousClass1.C04331.invokeSuspend(java.lang.Object):java.lang.Object");
            }

            @Override // X.G0V
            public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
                return ((C04331) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(VncHost vncHost, int i, AtomicBoolean atomicBoolean, String str, BrowserSessionController$openNoiseDuplexStream$responseHandler$1 browserSessionController$openNoiseDuplexStream$responseHandler$1, AtomicBoolean atomicBoolean2, HzR<byte[]> hzR, HtJ<? super AnonymousClass1> htJ) {
            super(2, htJ);
            this.$host = vncHost;
            this.$generation = i;
            this.$terminal = atomicBoolean;
            this.$taskId = str;
            this.$responseHandler = browserSessionController$openNoiseDuplexStream$responseHandler$1;
            this.$opened = atomicBoolean2;
            this.$outboundFrames = hzR;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            AnonymousClass1 anonymousClass1 = BrowserSessionController.this.new AnonymousClass1(this.$host, this.$generation, this.$terminal, this.$taskId, this.$responseHandler, this.$opened, this.$outboundFrames, htJ);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:111:0x0244 A[PHI: r10
  0x0244: PHI (r10v5 X.HoC) = (r10v33 X.HoC), (r10v34 X.HoC) binds: [B:110:0x0242, B:81:0x01e5] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:125:0x012c A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:135:? A[RETURN, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:53:0x011e A[Catch: all -> 0x0233, Exception -> 0x0235, CancellationException -> 0x024a, TryCatch #12 {CancellationException -> 0x024a, blocks: (B:61:0x015c, B:63:0x0162, B:99:0x01fb, B:100:0x01fe, B:50:0x0116, B:51:0x0119, B:53:0x011e, B:23:0x005d, B:24:0x0060, B:26:0x0066, B:28:0x006e, B:30:0x0089, B:32:0x0091, B:34:0x009b, B:35:0x00a4, B:37:0x00b8, B:38:0x00bc, B:39:0x00bd, B:41:0x00c3, B:43:0x00cd, B:45:0x00d7, B:47:0x00e1, B:101:0x01ff, B:16:0x003a, B:18:0x0044, B:20:0x004e, B:103:0x0218), top: B:129:0x0016 }] */
        /* JADX WARN: Removed duplicated region for block: B:61:0x015c A[Catch: all -> 0x0233, Exception -> 0x0235, CancellationException -> 0x024a, TRY_ENTER, TryCatch #12 {CancellationException -> 0x024a, blocks: (B:61:0x015c, B:63:0x0162, B:99:0x01fb, B:100:0x01fe, B:50:0x0116, B:51:0x0119, B:53:0x011e, B:23:0x005d, B:24:0x0060, B:26:0x0066, B:28:0x006e, B:30:0x0089, B:32:0x0091, B:34:0x009b, B:35:0x00a4, B:37:0x00b8, B:38:0x00bc, B:39:0x00bd, B:41:0x00c3, B:43:0x00cd, B:45:0x00d7, B:47:0x00e1, B:101:0x01ff, B:16:0x003a, B:18:0x0044, B:20:0x004e, B:103:0x0218), top: B:129:0x0016 }] */
        /* JADX WARN: Removed duplicated region for block: B:63:0x0162 A[Catch: all -> 0x0233, Exception -> 0x0235, CancellationException -> 0x024a, TRY_LEAVE, TryCatch #12 {CancellationException -> 0x024a, blocks: (B:61:0x015c, B:63:0x0162, B:99:0x01fb, B:100:0x01fe, B:50:0x0116, B:51:0x0119, B:53:0x011e, B:23:0x005d, B:24:0x0060, B:26:0x0066, B:28:0x006e, B:30:0x0089, B:32:0x0091, B:34:0x009b, B:35:0x00a4, B:37:0x00b8, B:38:0x00bc, B:39:0x00bd, B:41:0x00c3, B:43:0x00cd, B:45:0x00d7, B:47:0x00e1, B:101:0x01ff, B:16:0x003a, B:18:0x0044, B:20:0x004e, B:103:0x0218), top: B:129:0x0016 }] */
        /* JADX WARN: Removed duplicated region for block: B:84:0x01ea  */
        /* JADX WARN: Type inference failed for: r10v0, types: [int] */
        /* JADX WARN: Type inference failed for: r10v1 */
        /* JADX WARN: Type inference failed for: r10v27, types: [X.Hqc, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r10v3, types: [X.HoC] */
        /* JADX WARN: Type inference failed for: r10v30, types: [X.HoC] */
        /* JADX WARN: Type inference failed for: r10v4 */
        @Override // X.AbstractC8884Fsp
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r23) throws java.lang.Throwable {
            /*
                Method dump skipped, instructions count: 598
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.vmbrowser.runtime.BrowserSessionController.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ((AnonymousClass1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.vmbrowser.runtime.BrowserSessionController$retryStream$1", f = "BrowserSessionController.kt", l = {}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.vmbrowser.runtime.BrowserSessionController$retryStream$1, reason: invalid class name and case insensitive filesystem */
    public final class C143141 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ VncHost $host;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C143141(VncHost vncHost, HtJ<? super C143141> htJ) {
            super(2, htJ);
            this.$host = vncHost;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return BrowserSessionController.this.new C143141(this.$host, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            if (this.label != 0) {
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(obj);
            if (BrowserSessionController.this.isCurrentHost(this.$host) && AnonymousClass003.A1Y(this.$host.isActive)) {
                HoC hoCA15 = C3cI.A15(BrowserSessionController.this.reloadJob);
                BrowserSessionController browserSessionController = BrowserSessionController.this;
                browserSessionController.reloadJob = hoCA15;
                browserSessionController.reloadAttempt = 0;
                AnonymousClass003.A14(browserSessionController._streamFailed, false);
                BrowserSessionController.this.scheduleReload(this.$host, false);
            }
            return Unit.INSTANCE;
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ((C143141) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.vmbrowser.runtime.BrowserSessionController$scheduleReload$1", f = "BrowserSessionController.kt", l = {}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.vmbrowser.runtime.BrowserSessionController$scheduleReload$1, reason: invalid class name and case insensitive filesystem */
    public final class C143151 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ VncHost $host;
        public final /* synthetic */ boolean $requireConnected;
        public int label;

        @DebugMetadata(c = "com.facebook.aura.vmbrowser.runtime.BrowserSessionController$scheduleReload$1$1", f = "BrowserSessionController.kt", l = {434}, m = "invokeSuspend", v = 2)
        /* renamed from: com.facebook.aura.vmbrowser.runtime.BrowserSessionController$scheduleReload$1$1, reason: invalid class name and collision with other inner class name */
        public final class C04341 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
            public final /* synthetic */ long $backoff;
            public final /* synthetic */ VncHost $host;
            public /* synthetic */ Object L$0;
            public int label;
            public final /* synthetic */ BrowserSessionController this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C04341(long j, BrowserSessionController browserSessionController, VncHost vncHost, HtJ<? super C04341> htJ) {
                super(2, htJ);
                this.$backoff = j;
                this.this$0 = browserSessionController;
                this.$host = vncHost;
            }

            @Override // X.AbstractC8884Fsp
            public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
                C04341 c04341 = new C04341(this.$backoff, this.this$0, this.$host, htJ);
                c04341.L$0 = obj;
                return c04341;
            }

            @Override // X.AbstractC8884Fsp
            public final Object invokeSuspend(Object obj) {
                Object obj2 = this.L$0;
                EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
                int i = this.label;
                if (i == 0) {
                    Hwg.A00(obj);
                    long j = this.$backoff;
                    this.L$0 = obj2;
                    this.label = 1;
                    if (C7Bq.A01(j, this) == enumC10460Hji) {
                        return enumC10460Hji;
                    }
                } else {
                    if (i != 1) {
                        throw AnonymousClass001.A0n();
                    }
                    Hwg.A00(obj);
                }
                if (this.this$0.isCurrentHost(this.$host) && AnonymousClass003.A1Y(this.$host.isActive)) {
                    this.this$0.reloadPending = false;
                    C3cJ.A0C(this.this$0._hasFirstFrame, false);
                    BrowserSessionController browserSessionController = this.this$0;
                    WebView webView = browserSessionController.webView;
                    if (webView != null) {
                        browserSessionController.loadVncPage(webView, this.$host);
                    } else {
                        AnonymousClass003.A14(browserSessionController._streamFailed, true);
                    }
                }
                return Unit.INSTANCE;
            }

            @Override // X.G0V
            public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
                return ((C04341) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C143151(VncHost vncHost, boolean z, HtJ<? super C143151> htJ) {
            super(2, htJ);
            this.$host = vncHost;
            this.$requireConnected = z;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return BrowserSessionController.this.new C143151(this.$host, this.$requireConnected, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            HoC hoC;
            long j;
            if (this.label != 0) {
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(obj);
            if (BrowserSessionController.this.isCurrentHost(this.$host)) {
                if (BrowserSessionController.this.isPreviewRevoked(this.$host.taskId)) {
                    CFK.A06(BrowserSessionControllerKt.TAG, "VNC reload suppressed; preview is permanently unavailable");
                } else if (!this.$requireConnected || BrowserSessionController.this.hasEverConnected) {
                    BrowserSessionController.this.reloadPending = true;
                    if (AnonymousClass003.A1Y(this.$host.isActive) && ((hoC = BrowserSessionController.this.reloadJob) == null || !hoC.isActive())) {
                        BrowserSessionController browserSessionController = BrowserSessionController.this;
                        int i = browserSessionController.reloadAttempt;
                        int i2 = i + 1;
                        long[] jArr = BrowserSessionControllerKt.RELOAD_BACKOFF_MS;
                        int length = jArr.length;
                        if (i2 > length) {
                            i2 = length;
                        }
                        browserSessionController.reloadAttempt = i2;
                        if (i >= 0 && i < length) {
                            j = jArr[i];
                        } else {
                            if (length == 0) {
                                throw new NoSuchElementException(C8j2.A00(50));
                            }
                            j = jArr[length - 1];
                        }
                        browserSessionController.reloadJob = AnonymousClass001.A11(new C04341(j, browserSessionController, this.$host, null), browserSessionController.reloadScope);
                    }
                } else {
                    CFK.A06(BrowserSessionControllerKt.TAG, "VNC dropped before first connect; not reloading");
                    AnonymousClass004.A1D(true, BrowserSessionController.this._streamFailed);
                    BrowserSessionController.this.reloadPending = true;
                }
            }
            return Unit.INSTANCE;
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ((C143151) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.vmbrowser.runtime.BrowserSessionController$updateViewer$2", f = "BrowserSessionController.kt", l = {751}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.vmbrowser.runtime.BrowserSessionController$updateViewer$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super BrowserViewerUpdateResult>, Object> {
        public final /* synthetic */ String $taskId;
        public final /* synthetic */ BrowserViewerPreference $viewer;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(String str, BrowserViewerPreference browserViewerPreference, HtJ<? super AnonymousClass2> htJ) {
            super(2, htJ);
            this.$taskId = str;
            this.$viewer = browserViewerPreference;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return BrowserSessionController.this.new AnonymousClass2(this.$taskId, this.$viewer, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            Object objM300updateViewer0E7RQCE;
            NetworkException networkException;
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                BrowserTaskControlTransport browserTaskControlTransport = BrowserSessionController.this.controlTransport;
                String str = this.$taskId;
                BrowserViewerPreference browserViewerPreference = this.$viewer;
                this.label = 1;
                objM300updateViewer0E7RQCE = browserTaskControlTransport.m300updateViewer0E7RQCE(str, browserViewerPreference, this);
                if (objM300updateViewer0E7RQCE == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                objM300updateViewer0E7RQCE = AnonymousClass001.A0q(obj);
            }
            String str2 = this.$taskId;
            Throwable thA00 = HsJ.A00(objM300updateViewer0E7RQCE);
            if (thA00 != null) {
                if ((thA00 instanceof NetworkException) && (networkException = (NetworkException) thA00) != null) {
                    int i2 = networkException.httpResponseCode;
                    if (i2 != 409 || !"invalid_state".equals(networkException.errorCode)) {
                        Boolean bool = networkException.serverRetryable;
                        if (AnonymousClass002.A1b(bool, false) || (i2 >= 0 && i2 < 500 && !AnonymousClass002.A1b(bool, true))) {
                            return BrowserViewerUpdateResult.Failed.INSTANCE;
                        }
                    }
                }
                return BrowserViewerUpdateResult.Retry.INSTANCE;
            }
            BrowserTaskSnapshotJson browserTaskSnapshotJson = (BrowserTaskSnapshotJson) objM300updateViewer0E7RQCE;
            if (C7384Etj.areEqual(browserTaskSnapshotJson.presented_task_id, str2)) {
                BrowserControlLeaseJson browserControlLeaseJson = browserTaskSnapshotJson.lease;
                return new BrowserViewerUpdateResult.Updated(browserControlLeaseJson != null ? browserControlLeaseJson.toDomain() : null);
            }
            return BrowserViewerUpdateResult.InvalidState.INSTANCE;
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super BrowserViewerUpdateResult> htJ) {
            return ((AnonymousClass2) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    public BrowserSessionController(AbstractC3358CGz abstractC3358CGz) {
        C7384Etj.A0Y(abstractC3358CGz, 0);
        this.userSession = abstractC3358CGz;
        this.controlTransport = new BrowserTaskControlTransport(abstractC3358CGz);
        this.controlClient = new BrowserTaskControlClient(abstractC3358CGz);
        this.taskRepository = BrowserTaskRepository.Companion.getInstance(abstractC3358CGz);
        BrowserClipboardMenu browserClipboardMenu = new BrowserClipboardMenu();
        this.clipboardMenu = browserClipboardMenu;
        this.clipboardMenuShown = browserClipboardMenu.shown;
        this.scope = C3cH.A0x(C3cG.A0v());
        this.nativeSocketGeneration = new AtomicInteger(0);
        this.mainHandler = new Handler(Looper.getMainLooper());
        this.reloadScope = Hxb.A02(C78W.A02(AuraDispatchers.mainImmediate, new C8eO(null)));
        this.zoomMultiplier = 1.0f;
        C9286GCn c9286GCnA14 = C3cG.A14(false);
        this._isConnected = c9286GCnA14;
        this.isConnected = C3cG.A11(c9286GCnA14);
        C9286GCn c9286GCnA142 = C3cG.A14(false);
        this._hasFirstFrame = c9286GCnA142;
        this.hasFirstFrame = C3cG.A11(c9286GCnA142);
        C9286GCn c9286GCnA143 = C3cG.A14(false);
        this._streamFailed = c9286GCnA143;
        this.streamFailed = C3cG.A11(c9286GCnA143);
        C9290GCr c9290GCrA12 = C3cG.A12(C79.A00, 0, 1);
        this._remoteClipboardText = c9290GCrA12;
        this.remoteClipboardText = C3pd.A00(c9290GCrA12);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onJsSocketSend(String str) {
        Object objA0s;
        HxO hxO;
        AtomicBoolean atomicBoolean;
        try {
            objA0s = Base64.decode(str, 2);
        } catch (Throwable th) {
            objA0s = C3cG.A0s(th);
        }
        if ((objA0s instanceof C10571Hud) || objA0s == null || (hxO = this.duplexOutboundFrames) == null || (atomicBoolean = this.noiseDuplexTerminal) == null || (!(hxO.AhZ(objA0s) instanceof C2zT))) {
            return;
        }
        terminateNoiseDuplexForGeneration(this.nativeSocketGeneration.get(), atomicBoolean, "window.__vncBridge.onError()", "VNC Noise duplex outbound queue overflow", null);
    }

    public final View createVncWebViewForTask(Context context, boolean z, String str, G0U<? super HtJ<? super BrowserPresentResult>, ? extends Object> g0u, Function0<Boolean> function0) {
        AnonymousClass005.A11(context, str, g0u, 0);
        C7384Etj.A0Y(function0, 4);
        destroyVncWebView(false);
        return createVncWebView(context, new VncHost(str, z, g0u, function0));
    }

    public final void pasteText(String str) {
        C7384Etj.A0Y(str, 0);
        if (!this.inputEnabled || str.length() == 0) {
            return;
        }
        dispatchToJs(FGI.A0U("window.__vncBridge && window.__vncBridge.pasteBase64Text && window.__vncBridge.pasteBase64Text('", Base64.encodeToString(C3cG.A1S(str), 2), "')"));
    }

    public final void publishRemoteClipboardText(String str) {
        C7384Etj.A0Y(str, 0);
        if (str.length() > 0) {
            this._remoteClipboardText.AhV(str);
        }
    }

    public final AutoCloseable registerClipboardMenu$fbandroid_express_aura_java_com_facebook_aura_vmbrowser_runtime_runtime(Function0<Unit> function0, Function0<Unit> function02, final C1BN<? extends BrowserDeviceClipboardAction> c1bn, Function0<? extends Function0<Boolean>> function03) {
        AnonymousClass005.A14(function0, function02, c1bn, function03);
        return this.clipboardMenu.register(function0, function02, new Function0() { // from class: com.facebook.aura.vmbrowser.runtime.BrowserSessionController$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Boolean.valueOf(BrowserDeviceClipboardConfig.INSTANCE.isEnabled());
            }
        }, new Function0() { // from class: com.facebook.aura.vmbrowser.runtime.BrowserSessionController$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return c1bn.getValue();
            }
        }, function03);
    }

    public final void revokePreview$fbandroid_express_aura_java_com_facebook_aura_vmbrowser_runtime_runtime(String str) {
        C7384Etj.A0Y(str, 0);
        this.taskRepository.revokePreview(str);
    }

    public final void sendSpecialKey(AgentBrowserRemoteKey agentBrowserRemoteKey) {
        C7384Etj.A0Y(agentBrowserRemoteKey, 0);
        if (this.inputEnabled) {
            dispatchToJs(FGI.A0I("window.__vncBridge && window.__vncBridge.sendSpecialKey && window.__vncBridge.sendSpecialKey(", agentBrowserRemoteKey.getKeysym(), ")"));
        }
    }

    public final void sendTextInput(String str) {
        C7384Etj.A0Y(str, 0);
        if (!this.inputEnabled || str.length() == 0) {
            return;
        }
        dispatchToJs(FGI.A0U("window.__vncBridge && window.__vncBridge.typeBase64Text && window.__vncBridge.typeBase64Text('", Base64.encodeToString(C3cG.A1S(str), 2), "')"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void closeNativeSocket() {
        this.clipboardMenu.invalidate(null);
        AnonymousClass003.A14(this._isConnected, false);
        this.nativeSocketGeneration.incrementAndGet();
        AtomicBoolean atomicBoolean = this.noiseDuplexTerminal;
        if (atomicBoolean != null) {
            atomicBoolean.set(true);
        }
        this.noiseDuplexTerminal = null;
        HzR<byte[]> hzR = this.duplexOutboundFrames;
        if (hzR != null) {
            hzR.A6R(null);
        }
        this.duplexOutboundFrames = null;
        HatchDuplexHttpStream hatchDuplexHttpStream = this.duplexStream;
        if (hatchDuplexHttpStream != null) {
            hatchDuplexHttpStream.cancel();
        }
        this.duplexStream = null;
        HoC hoC = this.socketJob;
        if (hoC != null) {
            hoC.A5w(null);
        }
        this.socketJob = null;
    }

    private final void closeNoiseDuplexForGeneration(final int i) {
        this.mainHandler.post(new Runnable() { // from class: com.facebook.aura.vmbrowser.runtime.BrowserSessionController$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                BrowserSessionController.closeNoiseDuplexForGeneration$lambda$0(this.f$0, i);
            }
        });
    }

    private final View createVncWebView(Context context, VncHost vncHost) {
        this.vncHost = vncHost;
        this.intentionallyClosing = false;
        HoC hoC = this.reloadJob;
        if (hoC != null) {
            hoC.A5w(null);
        }
        this.reloadAttempt = 0;
        this.reloadPending = false;
        this.hasEverConnected = false;
        this.inputEnabled = false;
        AnonymousClass001.A1E(this._isConnected, null, false);
        AnonymousClass001.A1E(this._hasFirstFrame, null, false);
        AnonymousClass001.A1E(this._streamFailed, null, false);
        WebView webViewCreateWebViewOrNull = createWebViewOrNull(context);
        if (webViewCreateWebViewOrNull == null) {
            View view = new View(context);
            AnonymousClass003.A14(this._streamFailed, true);
            return view;
        }
        webViewCreateWebViewOrNull.getSettings().setJavaScriptEnabled(true);
        webViewCreateWebViewOrNull.getSettings().setDomStorageEnabled(true);
        webViewCreateWebViewOrNull.getSettings().setAllowFileAccess(true);
        webViewCreateWebViewOrNull.getSettings().setMediaPlaybackRequiresUserGesture(false);
        webViewCreateWebViewOrNull.setLayerType(2, null);
        webViewCreateWebViewOrNull.setBackgroundColor(0);
        this.webView = webViewCreateWebViewOrNull;
        CFK.A05(BrowserSessionControllerKt.TAG, "Loading VNC shim page");
        loadVncPage(webViewCreateWebViewOrNull, vncHost);
        return webViewCreateWebViewOrNull;
    }

    private final WebView createWebViewOrNull(Context context) {
        try {
            return new WebView(context);
        } catch (AndroidRuntimeException e) {
            CFK.A0A(BrowserSessionControllerKt.TAG, C60N.A00(58), e);
            return null;
        }
    }

    private final void destroyVncWebView(final boolean z) {
        final VncHost vncHost = this.vncHost;
        if (vncHost != null) {
            vncHost.closed.set(true);
            if (C3cH.A1K()) {
                destroyVncWebView(vncHost, z);
            } else {
                this.mainHandler.post(new Runnable() { // from class: com.facebook.aura.vmbrowser.runtime.BrowserSessionController$$ExternalSyntheticLambda1
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f$0.destroyVncWebView(vncHost, z);
                    }
                });
            }
        }
    }

    private final void dispatchInteractionState() {
        VncHost vncHost = this.vncHost;
        if (vncHost != null) {
            dispatchToJs(FGI.A0p("window.__vncBridge && window.__vncBridge.setInteractionState && window.__vncBridge.setInteractionState(", ", ", ")", vncHost.viewOnly, this.inputEnabled));
        }
    }

    private final void dispatchToJs(final String str) {
        final VncHost vncHost = this.vncHost;
        if (vncHost != null) {
            this.mainHandler.post(new Runnable() { // from class: com.facebook.aura.vmbrowser.runtime.BrowserSessionController$$ExternalSyntheticLambda4
                @Override // java.lang.Runnable
                public final void run() {
                    BrowserSessionController.dispatchToJs$lambda$0(this.f$0, vncHost, str);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void dispatchToJsForGeneration(final int i, final String str) {
        this.mainHandler.post(new Runnable() { // from class: com.facebook.aura.vmbrowser.runtime.BrowserSessionController$$ExternalSyntheticLambda5
            @Override // java.lang.Runnable
            public final void run() {
                BrowserSessionController.dispatchToJsForGeneration$lambda$0(this.f$0, i, str);
            }
        });
    }

    private final String getCurrentTaskId() {
        BrowserTaskPresentation browserTaskPresentationA0G = C3cG.A0G(this.taskRepository.currentTask);
        if (browserTaskPresentationA0G != null) {
            return browserTaskPresentationA0G.browserTaskId;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isCurrentHost(VncHost vncHost) {
        return this.vncHost == vncHost && !vncHost.closed.get() && !this.intentionallyClosing && C7384Etj.areEqual(getCurrentTaskId(), vncHost.taskId);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isCurrentNativeSocket(int i) {
        VncHost vncHost;
        return this.nativeSocketGeneration.get() == i && (vncHost = this.vncHost) != null && isCurrentHost(vncHost);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isPreviewRevoked(String str) {
        return this.taskRepository.previewRevokedTaskIds.getValue().contains(str);
    }

    /* JADX WARN: Type inference failed for: r9v0, types: [com.facebook.aura.vmbrowser.runtime.BrowserSessionController$openNoiseDuplexStream$responseHandler$1] */
    private final void openNoiseDuplexStream(final VncHost vncHost) {
        String str = vncHost.taskId;
        if (isPreviewRevoked(str)) {
            CFK.A06(BrowserSessionControllerKt.TAG, "socketOpen: preview permanently unavailable; refusing to present");
            dispatchToJs("window.__vncBridge.onError()");
            return;
        }
        final int i = this.nativeSocketGeneration.get();
        final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        final AtomicBoolean atomicBoolean2 = new AtomicBoolean(false);
        Integer num = C79.A00;
        GCV gcv = new GCV(64, null);
        this.noiseDuplexTerminal = atomicBoolean;
        this.duplexOutboundFrames = gcv;
        ?? r9 = new HatchDuplexResponseHandler() { // from class: com.facebook.aura.vmbrowser.runtime.BrowserSessionController$openNoiseDuplexStream$responseHandler$1
            @Override // com.facebook.aura.network.transport.HatchDuplexResponseHandler
            public void onBody(byte[] bArr) {
                C7384Etj.A0Y(bArr, 0);
                if (atomicBoolean.get() || !this.isCurrentNativeSocket(i)) {
                    return;
                }
                this.dispatchToJsForGeneration(i, FGI.A0U("window.__vncBridge.onMessage('", Base64.encodeToString(bArr, 2), "')"));
            }

            @Override // com.facebook.aura.network.transport.HatchDuplexResponseHandler
            public void onComplete(HatchHttpResponse hatchHttpResponse) {
                C7384Etj.A0Y(hatchHttpResponse, 0);
                boolean z = hatchHttpResponse.isSuccessful;
                BrowserSessionController browserSessionController = this;
                if (z) {
                    browserSessionController.terminateNoiseDuplexForGeneration(i, atomicBoolean, "window.__vncBridge.onClose(1000, '')", null, null);
                } else {
                    browserSessionController.terminateNoiseDuplexForGeneration(i, atomicBoolean, "window.__vncBridge.onError()", FGI.A0I("VNC Noise duplex failed (httpCode=", hatchHttpResponse.statusCode, ")"), null);
                }
            }

            @Override // com.facebook.aura.network.transport.HatchDuplexResponseHandler
            public void onResponse(int i2, Map<String, String> map) {
                if (atomicBoolean.get() || !this.isCurrentNativeSocket(i)) {
                    return;
                }
                if (200 <= i2 && i2 < 300) {
                    if (!atomicBoolean2.compareAndSet(false, true) || atomicBoolean.get()) {
                        return;
                    }
                    this.dispatchToJsForGeneration(i, "window.__vncBridge.onOpen('')");
                    return;
                }
                BrowserSessionController browserSessionController = this;
                int i3 = i;
                AtomicBoolean atomicBoolean3 = atomicBoolean;
                if (i2 != 409) {
                    browserSessionController.terminateNoiseDuplexForGeneration(i3, atomicBoolean3, "window.__vncBridge.onError()", FGI.A0I("VNC Noise duplex failed to open (httpCode=", i2, ")"), null);
                } else {
                    BrowserSessionController.terminateNoiseDuplexForGeneration$default(browserSessionController, i3, atomicBoolean3, null, null, null, 24, null);
                    this.scheduleReload(vncHost, false);
                }
            }
        };
        C3UX c3ux = this.scope;
        this.socketJob = GAo.A02(num, C6ys.A00, new AnonymousClass1(vncHost, i, atomicBoolean, str, r9, atomicBoolean2, gcv, null), c3ux);
    }

    public static /* synthetic */ void openNoiseDuplexStream$fail$default(BrowserSessionController browserSessionController, int i, AtomicBoolean atomicBoolean, String str, Throwable th, int i2, Object obj) {
        if ((i2 & 16) != 0) {
            th = null;
        }
        browserSessionController.terminateNoiseDuplexForGeneration(i, atomicBoolean, "window.__vncBridge.onError()", str, th);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void scheduleReload(VncHost vncHost, boolean z) {
        AnonymousClass001.A1J(new C143151(vncHost, z, null), this.reloadScope);
    }

    public static /* synthetic */ void terminateNoiseDuplexForGeneration$default(BrowserSessionController browserSessionController, int i, AtomicBoolean atomicBoolean, String str, String str2, Throwable th, int i2, Object obj) {
        if ((i2 & 8) != 0) {
            str2 = null;
        }
        if ((i2 & 16) != 0) {
            th = null;
        }
        browserSessionController.terminateNoiseDuplexForGeneration(i, atomicBoolean, str, str2, th);
    }

    public final void clearStreamFailure() {
        AnonymousClass004.A1D(false, this._streamFailed);
    }

    public final void copySelection() {
        if (this.inputEnabled) {
            dispatchToJs("window.__vncBridge && window.__vncBridge.copySelection && window.__vncBridge.copySelection()");
        }
    }

    public final void dismissClipboardMenu$fbandroid_express_aura_java_com_facebook_aura_vmbrowser_runtime_runtime() {
        this.clipboardMenu.invalidate(null);
    }

    public final C1BN<Boolean> getClipboardMenuShown$fbandroid_express_aura_java_com_facebook_aura_vmbrowser_runtime_runtime() {
        return this.clipboardMenuShown;
    }

    public final C1BN<Boolean> getHasFirstFrame() {
        return this.hasFirstFrame;
    }

    public final C22I<String> getRemoteClipboardText() {
        return this.remoteClipboardText;
    }

    public final C1BN<Boolean> getStreamFailed() {
        return this.streamFailed;
    }

    public final Object heartbeat(String str, HtJ<? super BrowserControlResult> htJ) {
        return this.controlClient.heartbeat(str, htJ);
    }

    public final C1BN<Boolean> isConnected() {
        return this.isConnected;
    }

    public final Object presentTask(String str, BrowserViewerPreference browserViewerPreference, HtJ<? super BrowserPresentResult> htJ) {
        return this.controlClient.presentTask(str, browserViewerPreference, htJ);
    }

    public final void refreshClipboardMenu$fbandroid_express_aura_java_com_facebook_aura_vmbrowser_runtime_runtime() {
        this.clipboardMenu.refresh();
    }

    public final Object releaseControl(String str, HtJ<? super Boolean> htJ) {
        return this.controlClient.releaseControl(str, htJ);
    }

    public final void resumeStream() {
        VncHost vncHost = this.vncHost;
        if (vncHost == null || !this.reloadPending) {
            return;
        }
        scheduleReload(vncHost, false);
    }

    public final void retryStream() {
        VncHost vncHost = this.vncHost;
        if (vncHost != null) {
            AnonymousClass001.A1J(new C143141(vncHost, null), this.reloadScope);
        }
    }

    public final void setCoverViewportEnabled(boolean z) {
        this.coverViewportEnabled = z;
        dispatchToJs(FGI.A0q("window.__vncBridge && window.__vncBridge.setCoverViewportEnabled && window.__vncBridge.setCoverViewportEnabled(", ")", z));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x000b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void setInputEnabled(boolean r3) {
        /*
            r2 = this;
            if (r3 == 0) goto Lb
            com.facebook.aura.vmbrowser.runtime.BrowserSessionController$VncHost r0 = r2.vncHost
            if (r0 == 0) goto Lb
            boolean r1 = r0.viewOnly
            r0 = 1
            if (r1 == 0) goto Lc
        Lb:
            r0 = 0
        Lc:
            r2.inputEnabled = r0
            boolean r0 = r2.inputEnabled
            if (r0 != 0) goto L18
            com.facebook.aura.vmbrowser.runtime.BrowserClipboardMenu r1 = r2.clipboardMenu
            r0 = 0
            r1.invalidate(r0)
        L18:
            r2.dispatchInteractionState()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.vmbrowser.runtime.BrowserSessionController.setInputEnabled(boolean):void");
    }

    public final void setPanModeEnabled(boolean z) {
        this.panModeEnabled = z;
        dispatchToJs(FGI.A0q("window.__vncBridge && window.__vncBridge.setPanModeEnabled && window.__vncBridge.setPanModeEnabled(", ")", z));
    }

    public final void setViewOnly(boolean z) {
        VncHost vncHost = this.vncHost;
        if (vncHost == null || vncHost.viewOnly == z) {
            return;
        }
        this.inputEnabled = false;
        this.clipboardMenu.invalidate(null);
        vncHost.viewOnly = z;
        dispatchInteractionState();
    }

    public final void setZoomMultiplier(float f) {
        this.zoomMultiplier = ATD.A03(f, 1.0f, 3.0f);
        dispatchToJs(FGI.A0R("window.__vncBridge && window.__vncBridge.setZoomMultiplier && window.__vncBridge.setZoomMultiplier(", ")", this.zoomMultiplier));
    }

    public final Object takeControl(String str, BrowserViewerPreference browserViewerPreference, HtJ<? super BrowserControlResult> htJ) {
        return this.controlClient.takeControl(str, browserViewerPreference, htJ);
    }

    public final class Companion {
        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final void closeNoiseDuplexForGeneration$lambda$0(BrowserSessionController browserSessionController, int i) {
        if (browserSessionController.isCurrentNativeSocket(i)) {
            C9286GCn.A00(null, AnonymousClass001.A0h(), (C9286GCn) browserSessionController._isConnected);
            browserSessionController.noiseDuplexTerminal = null;
            HzR<byte[]> hzR = browserSessionController.duplexOutboundFrames;
            if (hzR != null) {
                hzR.A6R(null);
            }
            browserSessionController.duplexOutboundFrames = null;
            HatchDuplexHttpStream hatchDuplexHttpStream = browserSessionController.duplexStream;
            if (hatchDuplexHttpStream != null) {
                hatchDuplexHttpStream.cancel();
            }
            browserSessionController.duplexStream = null;
        }
    }

    public static final void dispatchToJs$lambda$0(BrowserSessionController browserSessionController, VncHost vncHost, String str) {
        WebView webView;
        if (!browserSessionController.isCurrentHost(vncHost) || (webView = browserSessionController.webView) == null) {
            return;
        }
        webView.evaluateJavascript(str, null);
    }

    public static final void dispatchToJsForGeneration$lambda$0(BrowserSessionController browserSessionController, int i, String str) {
        WebView webView;
        if (!browserSessionController.isCurrentNativeSocket(i) || (webView = browserSessionController.webView) == null) {
            return;
        }
        webView.evaluateJavascript(str, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void loadVncPage(WebView webView, VncHost vncHost) {
        closeNativeSocket();
        vncHost.documentGeneration++;
        webView.addJavascriptInterface(new JsBridge(this, vncHost, vncHost.documentGeneration), "AndroidVncBridge");
        webView.loadUrl(BrowserSessionControllerKt.VNC_PAGE_URL);
    }

    private final void onJsSocketClose() {
        closeNativeSocket();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onJsSocketOpen(VncHost vncHost) {
        if (isCurrentHost(vncHost)) {
            if (!AnonymousClass003.A1Y(vncHost.isActive)) {
                this.reloadPending = true;
                return;
            }
            closeNativeSocket();
            AnonymousClass004.A1D(false, this._hasFirstFrame);
            openNoiseDuplexStream(vncHost);
        }
    }

    public static final BrowserDeviceClipboardAction registerClipboardMenu$lambda$1(C1BN c1bn) {
        return (BrowserDeviceClipboardAction) c1bn.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void terminateNoiseDuplexForGeneration(int i, AtomicBoolean atomicBoolean, String str, String str2, Throwable th) {
        if (C3cI.A1W(atomicBoolean)) {
            if (str2 != null) {
                if (th != null) {
                    CFK.A0A(BrowserSessionControllerKt.TAG, str2, th);
                } else {
                    CFK.A06(BrowserSessionControllerKt.TAG, str2);
                }
            }
            if (str != null) {
                dispatchToJsForGeneration(i, str);
            }
            closeNoiseDuplexForGeneration(i);
        }
    }

    public final void setUnobscuredViewportAspectRatio(float f) {
        if (Math.abs(f) > Float.MAX_VALUE || f <= 0.0f || this.unobscuredViewportAspectRatio == f) {
            return;
        }
        this.unobscuredViewportAspectRatio = f;
        dispatchToJs(FGI.A0R("window.__vncBridge && window.__vncBridge.setUnobscuredViewportAspectRatio && window.__vncBridge.setUnobscuredViewportAspectRatio(", ")", f));
    }

    public final Object updateViewer(String str, BrowserViewerPreference browserViewerPreference, HtJ<? super BrowserViewerUpdateResult> htJ) {
        return GAo.A00(htJ, AnonymousClass001.A0y(), new AnonymousClass2(str, browserViewerPreference, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void destroyVncWebView(VncHost vncHost, boolean z) {
        ViewGroup viewGroup;
        if (this.vncHost == vncHost) {
            this.intentionallyClosing = true;
            this.vncHost = null;
            closeNativeSocket();
            HoC hoC = this.reloadJob;
            if (hoC != null) {
                hoC.A5w(null);
            }
            this.reloadAttempt = 0;
            this.reloadPending = false;
            if (z) {
                this.coverViewportEnabled = false;
                this.panModeEnabled = false;
                this.zoomMultiplier = 1.0f;
                this.unobscuredViewportAspectRatio = 0.0f;
                this.inputEnabled = false;
            }
            this.hasEverConnected = false;
            AnonymousClass001.A1E(this._isConnected, null, false);
            AnonymousClass001.A1E(this._hasFirstFrame, null, false);
            AnonymousClass001.A1E(this._streamFailed, null, false);
            WebView webView = this.webView;
            if (webView != null) {
                ViewParent parent = webView.getParent();
                if ((parent instanceof ViewGroup) && (viewGroup = (ViewGroup) parent) != null) {
                    viewGroup.removeView(webView);
                }
                webView.destroy();
            }
            this.webView = null;
        }
    }

    public final void destroyVncWebView() {
        destroyVncWebView(true);
    }
}
