package com.facebook.aura.localbrowser;

import X.AbstractC0878AGe;
import X.AbstractC7608F5v;
import X.AbstractC7610F5x;
import X.AbstractC7611F5y;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.BFI;
import X.BHL;
import X.BLG;
import X.C06H;
import X.C0893AGu;
import X.C1BN;
import X.C3cG;
import X.C3cH;
import X.C60O;
import X.C60P;
import X.C60R;
import X.C6xj;
import X.C7384Etj;
import X.C7438Evz;
import X.C9286GCn;
import X.G0U;
import X.G0W;
import X.HwN;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.MutableContextWrapper;
import android.net.Uri;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.autofill.AutofillId;
import android.view.autofill.AutofillManager;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.facebook.aura.localbrowser.LocalBrowserWindows;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes6.dex */
public final class LocalBrowserWindows {
    public static final int $stable = 8;

    @Deprecated
    public static final int MAX_WINDOWS = 4;

    @Deprecated
    public static final long POPUP_PROBE_TIMEOUT_MS = 5000;
    public final Function0<Boolean> acceptsAutofill;
    public final Function0<Boolean> acceptsUserInput;
    public final Function0<Unit> cancelFileChooser;
    public boolean cleanupSucceeded;
    public boolean closed;
    public final Function0<LocalBrowserDialogs> dialogs;
    public final Handler handler;
    public Window heldPopup;
    public boolean heldPopupShown;
    public final Function0<Boolean> isBrowsingEnabled;
    public final BLG<LocalBrowserPageState> mutablePage;
    public final Function0<Unit> onChanged;
    public final G0W<WebView, ValueCallback<Uri[]>, WebChromeClient.FileChooserParams, Boolean> onFileChooser;
    public final G0W<LocalBrowserPopupAction, Boolean, Boolean, Unit> onPopupEvent;
    public final Function0<Unit> onRendererGone;
    public final C1BN<LocalBrowserPageState> page;
    public WebView popupProbe;
    public final LocalBrowserWebView root;
    public final LocalBrowserPage rootPage;
    public final G0U<String, WebResourceResponse> screenPopup;
    public int shownPopups;
    public final Function0<LocalBrowserTakeoverSink> takeover;
    public final List<Window> windows;
    public static final Companion Companion = new Companion();
    public static final Set<LocalBrowserPopupAction> OPENED = BFI.A0H(new LocalBrowserPopupAction[]{LocalBrowserPopupAction.HELD, LocalBrowserPopupAction.REDIRECTED_SAME_TAB, LocalBrowserPopupAction.SHOWN});

    public final class Companion {
        public final Set<LocalBrowserPopupAction> getOPENED() {
            return LocalBrowserWindows.OPENED;
        }

        public Companion() {
        }

        public /* synthetic */ Companion(C06H c06h) {
        }
    }

    public final class ThumbnailFrame {
        public final String document;
        public final int height;
        public boolean ready;
        public final int width;
        public final IBinder window;

        public final boolean matches(LocalBrowserWebView localBrowserWebView, String str) {
            boolean zA1a = AnonymousClass002.A1a(localBrowserWebView, str);
            if (str.equals(this.document) && this.window == localBrowserWebView.getWindowToken() && this.width == localBrowserWebView.getWidth() && this.height == localBrowserWebView.getHeight()) {
                return zA1a;
            }
            return false;
        }

        public final boolean getReady() {
            return this.ready;
        }

        public final void setReady(boolean z) {
            this.ready = z;
        }

        public ThumbnailFrame(LocalBrowserWebView localBrowserWebView, String str) {
            AnonymousClass003.A0u(localBrowserWebView, str);
            this.document = str;
            this.window = localBrowserWebView.getWindowToken();
            this.width = localBrowserWebView.getWidth();
            this.height = localBrowserWebView.getHeight();
        }
    }

    public final class Window {
        public final LocalBrowserActivityBridge activityBridge;
        public String firstHost;
        public final LocalBrowserNativeRequests nativeRequests;
        public String openedUrl;
        public final LocalBrowserPage page;
        public Integer tabIndex;
        public final /* synthetic */ LocalBrowserWindows this$0;
        public ThumbnailFrame thumbnailFrame;
        public final LocalBrowserWebView view;

        /* renamed from: com.facebook.aura.localbrowser.LocalBrowserWindows$Window$1, reason: invalid class name */
        public final /* synthetic */ class AnonymousClass1 extends C7438Evz implements G0U<String, Boolean> {
            public AnonymousClass1(Object obj) {
                super(1, obj, LocalBrowserPage.class, "allowsNavigation", "allowsNavigation(Ljava/lang/String;)Z", 0);
            }

            @Override // X.G0U
            public final Boolean invoke(String str) {
                return Boolean.valueOf(((LocalBrowserPage) AnonymousClass006.A0o(str, this)).allowsNavigation(str));
            }
        }

        /* renamed from: com.facebook.aura.localbrowser.LocalBrowserWindows$Window$2, reason: invalid class name */
        /* loaded from: classes3.dex */
        public final /* synthetic */ class AnonymousClass2 extends C7438Evz implements G0U<LocalBrowserBlockSignal, Unit> {
            public AnonymousClass2(Object obj) {
                super(1, obj, LocalBrowserPage.class, "reportBlockSignal", "reportBlockSignal(Lcom/facebook/aura/localbrowser/LocalBrowserBlockSignal;)V", 0);
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(LocalBrowserBlockSignal localBrowserBlockSignal) {
                ((LocalBrowserPage) AnonymousClass006.A0o(localBrowserBlockSignal, this)).reportBlockSignal(localBrowserBlockSignal);
            }

            @Override // X.G0U
            public /* bridge */ /* synthetic */ Unit invoke(LocalBrowserBlockSignal localBrowserBlockSignal) {
                invoke2(localBrowserBlockSignal);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Window(final LocalBrowserWindows localBrowserWindows, LocalBrowserWebView localBrowserWebView, Function0<Unit> function0) {
            AnonymousClass002.A1A(localBrowserWebView, 1, function0);
            this.this$0 = localBrowserWindows;
            this.view = localBrowserWebView;
            LocalBrowserActivityBridge localBrowserActivityBridge = new LocalBrowserActivityBridge(localBrowserWebView);
            localBrowserActivityBridge.sink = new LocalBrowserTakeoverActivitySink(localBrowserWindows.takeover, new Function0() { // from class: com.facebook.aura.localbrowser.LocalBrowserWindows$Window$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return this.f$0.tabIndex;
                }
            });
            this.activityBridge = localBrowserActivityBridge;
            LocalBrowserPage localBrowserPage = new LocalBrowserPage(localBrowserWebView, function0, new Function0() { // from class: com.facebook.aura.localbrowser.LocalBrowserWindows$Window$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return LocalBrowserWindows.Window.page$lambda$0(localBrowserWindows, this);
                }
            }, new Function0() { // from class: com.facebook.aura.localbrowser.LocalBrowserWindows$Window$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return LocalBrowserWindows.Window.page$lambda$1(this.f$0, localBrowserWindows);
                }
            });
            this.page = localBrowserPage;
            LocalBrowserNativeRequests localBrowserNativeRequests = new LocalBrowserNativeRequests(new LocalBrowserWindows$Window$nativeRequests$1(localBrowserWindows), new LocalBrowserWindows$Window$nativeRequests$2(localBrowserWindows), new Function0() { // from class: com.facebook.aura.localbrowser.LocalBrowserWindows$Window$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return LocalBrowserWindows.Window.nativeRequests$lambda$0(this.f$0);
                }
            }, null, localBrowserWindows.onFileChooser, 8, 0 == true ? 1 : 0);
            this.nativeRequests = localBrowserNativeRequests;
            localBrowserPage.bindNavigationPolicy(new AnonymousClass1(localBrowserWindows.rootPage));
            localBrowserPage.bindBlocklistScreen(localBrowserWindows.screenPopup);
            localBrowserPage.blockSignal = new AnonymousClass2(localBrowserWindows.rootPage);
            localBrowserWebView.setWebViewClient(localBrowserPage.client);
            localBrowserWebView.setWebChromeClient(localBrowserNativeRequests);
            localBrowserNativeRequests.dialogs = localBrowserWindows.dialogs.invoke();
            localBrowserWebView.acceptsUserInput = new Function0() { // from class: com.facebook.aura.localbrowser.LocalBrowserWindows$Window$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Boolean.valueOf(LocalBrowserWindows.Window._init_$lambda$0(this.f$0, localBrowserWindows));
                }
            };
            localBrowserWebView.acceptsAutofill = new Function0() { // from class: com.facebook.aura.localbrowser.LocalBrowserWindows$Window$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Boolean.valueOf(LocalBrowserWindows.Window._init_$lambda$1(this.f$0, localBrowserWindows));
                }
            };
            WebSettings settings = localBrowserWebView.getSettings();
            settings.setJavaScriptEnabled(true);
            settings.setDomStorageEnabled(true);
            settings.setBlockNetworkLoads(!AnonymousClass003.A1Y(localBrowserWindows.isBrowsingEnabled));
            localBrowserWebView.setFocusableInTouchMode(true);
        }

        public final void destroy() {
            this.thumbnailFrame = null;
            destroy$release(this.this$0, new Function0() { // from class: com.facebook.aura.localbrowser.LocalBrowserWindows$Window$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    this.f$0.activityBridge.close();
                    return Unit.INSTANCE;
                }
            });
            this.page.close();
            this.nativeRequests.dialogs = null;
            LocalBrowserWebView localBrowserWebView = this.view;
            localBrowserWebView.acceptsUserInput = null;
            localBrowserWebView.acceptsAutofill = null;
            destroy$release(this.this$0, new Function0() { // from class: com.facebook.aura.localbrowser.LocalBrowserWindows$Window$$ExternalSyntheticLambda7
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    this.f$0.view.stopLoading();
                    return Unit.INSTANCE;
                }
            });
            destroy$release(this.this$0, new Function0() { // from class: com.facebook.aura.localbrowser.LocalBrowserWindows$Window$$ExternalSyntheticLambda8
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return LocalBrowserWindows.Window.destroy$lambda$2(this.f$0);
                }
            });
            destroy$release(this.this$0, new Function0() { // from class: com.facebook.aura.localbrowser.LocalBrowserWindows$Window$$ExternalSyntheticLambda9
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return LocalBrowserWindows.Window.destroy$lambda$3(this.f$0);
                }
            });
            destroy$release(this.this$0, new Function0() { // from class: com.facebook.aura.localbrowser.LocalBrowserWindows$Window$$ExternalSyntheticLambda10
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return LocalBrowserWindows.Window.destroy$lambda$4(this.f$0);
                }
            });
            destroy$release(this.this$0, new Function0() { // from class: com.facebook.aura.localbrowser.LocalBrowserWindows$Window$$ExternalSyntheticLambda11
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    AbstractC7611F5y.A0g(this.f$0.view);
                    return Unit.INSTANCE;
                }
            });
            destroy$release(this.this$0, new Function0() { // from class: com.facebook.aura.localbrowser.LocalBrowserWindows$Window$$ExternalSyntheticLambda12
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    this.f$0.view.removeAllViews();
                    return Unit.INSTANCE;
                }
            });
            destroy$release(this.this$0, new Function0() { // from class: com.facebook.aura.localbrowser.LocalBrowserWindows$Window$$ExternalSyntheticLambda13
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    this.f$0.view.destroy();
                    return Unit.INSTANCE;
                }
            });
        }

        public final void invalidateThumbnail() {
            this.thumbnailFrame = null;
        }

        public static final boolean _init_$lambda$0(Window window, LocalBrowserWindows localBrowserWindows) {
            return window.view == localBrowserWindows.getVisibleWebView() && AnonymousClass003.A1Y(localBrowserWindows.acceptsUserInput);
        }

        public static final boolean _init_$lambda$1(Window window, LocalBrowserWindows localBrowserWindows) {
            return window.view == localBrowserWindows.getVisibleWebView() && AnonymousClass003.A1Y(localBrowserWindows.acceptsAutofill);
        }

        public static final Unit destroy$lambda$0(Window window) {
            window.activityBridge.close();
            return Unit.INSTANCE;
        }

        public static final Unit destroy$lambda$1(Window window) {
            window.view.stopLoading();
            return Unit.INSTANCE;
        }

        public static final Unit destroy$lambda$2(Window window) {
            window.view.setWebChromeClient(null);
            return Unit.INSTANCE;
        }

        public static final Unit destroy$lambda$3(Window window) {
            window.view.setWebViewClient(new WebViewClient());
            return Unit.INSTANCE;
        }

        public static final Unit destroy$lambda$4(Window window) {
            ViewGroup viewGroup;
            ViewParent parent = window.view.getParent();
            if ((parent instanceof ViewGroup) && (viewGroup = (ViewGroup) parent) != null) {
                viewGroup.removeView(window.view);
            }
            return Unit.INSTANCE;
        }

        public static final Unit destroy$lambda$5(Window window) {
            AbstractC7611F5y.A0g(window.view);
            return Unit.INSTANCE;
        }

        public static final Unit destroy$lambda$6(Window window) {
            window.view.removeAllViews();
            return Unit.INSTANCE;
        }

        public static final Unit destroy$lambda$7(Window window) {
            window.view.destroy();
            return Unit.INSTANCE;
        }

        public static final Unit nativeRequests$lambda$0(Window window) {
            window.page.fail(LocalBrowserPageFailure.UNSUPPORTED_NATIVE_INTERACTION, null);
            return Unit.INSTANCE;
        }

        public static final Unit page$lambda$0(LocalBrowserWindows localBrowserWindows, Window window) {
            localBrowserWindows.cancelFileChooser.invoke();
            window.thumbnailFrame = null;
            AbstractC7610F5x.A1A(localBrowserWindows);
            return Unit.INSTANCE;
        }

        private final void recordHost() {
            if (this.firstHost == null) {
                this.firstHost = LocalBrowserUrlPolicy.INSTANCE.host(this.page.state.getValue().url);
            }
        }

        private final void reportOpened() {
            LocalBrowserTakeoverSink localBrowserTakeoverSinkInvoke;
            Integer num = this.tabIndex;
            if (num != null && this.openedUrl == null && this.this$0.windows.contains(this)) {
                LocalBrowserPageState value = this.page.state.getValue();
                if (value.phase == LocalBrowserPagePhase.READY && LocalBrowserTakeoverJournalKt.isTakeoverJournalUrl(value.url) && (localBrowserTakeoverSinkInvoke = this.this$0.takeover.invoke()) != null && localBrowserTakeoverSinkInvoke.isRecording()) {
                    String str = value.url;
                    this.openedUrl = str;
                    localBrowserTakeoverSinkInvoke.record(num, LocalBrowserTakeoverJournalJsonKt.takeoverActivityTab(true, str));
                }
            }
        }

        public final LocalBrowserActivityBridge getActivityBridge() {
            return this.activityBridge;
        }

        public final String getFirstHost() {
            return this.firstHost;
        }

        public final LocalBrowserPage getPage() {
            return this.page;
        }

        public final LocalBrowserWebView getView() {
            return this.view;
        }

        public final void reportClosed() {
            String str;
            Integer num = this.tabIndex;
            if (num == null || (str = this.openedUrl) == null) {
                return;
            }
            this.openedUrl = null;
            String str2 = this.page.state.getValue().url;
            if (LocalBrowserTakeoverJournalKt.isTakeoverJournalUrl(str2) && str2 != null) {
                str = str2;
            }
            LocalBrowserTakeoverSink localBrowserTakeoverSinkInvoke = this.this$0.takeover.invoke();
            if (localBrowserTakeoverSinkInvoke != null) {
                localBrowserTakeoverSinkInvoke.record(num, LocalBrowserTakeoverJournalJsonKt.takeoverActivityTab(false, str));
            }
        }

        public final void showToUser() {
            if (this.tabIndex == null) {
                LocalBrowserWindows localBrowserWindows = this.this$0;
                int i = localBrowserWindows.shownPopups + 1;
                localBrowserWindows.shownPopups = i;
                this.tabIndex = Integer.valueOf(i);
            }
            reportOpened();
            LocalBrowserActivityBridge localBrowserActivityBridge = this.activityBridge;
            LocalBrowserTakeoverSink localBrowserTakeoverSinkInvoke = this.this$0.takeover.invoke();
            localBrowserActivityBridge.broadcast(localBrowserTakeoverSinkInvoke != null && localBrowserTakeoverSinkInvoke.isRecording());
        }

        public final LocalBrowserWebView thumbnailWebView() {
            if (this.page.state.getValue().phase == LocalBrowserPagePhase.READY && this.view.isAttachedToWindow() && this.view.isShown() && this.view.getWindowVisibility() == 0 && !this.view.isLayoutRequested() && this.view.getWidth() > 0 && this.view.getHeight() > 0) {
                String str = this.page.state.getValue().document;
                ThumbnailFrame thumbnailFrame = this.thumbnailFrame;
                if (thumbnailFrame == null || !thumbnailFrame.matches(this.view, str)) {
                    final ThumbnailFrame thumbnailFrame2 = new ThumbnailFrame(this.view, str);
                    this.thumbnailFrame = thumbnailFrame2;
                    try {
                        this.view.postVisualStateCallback(0L, new WebView.VisualStateCallback() { // from class: com.facebook.aura.localbrowser.LocalBrowserWindows$Window$thumbnailWebView$2
                            @Override // android.webkit.WebView.VisualStateCallback
                            public void onComplete(long j) {
                                LocalBrowserWindows.ThumbnailFrame thumbnailFrame3 = this.this$0.thumbnailFrame;
                                LocalBrowserWindows.ThumbnailFrame thumbnailFrame4 = thumbnailFrame2;
                                if (thumbnailFrame3 == thumbnailFrame4) {
                                    thumbnailFrame4.ready = true;
                                }
                            }
                        });
                        this.view.invalidate();
                        return null;
                    } catch (RuntimeException unused) {
                        this.thumbnailFrame = null;
                        return null;
                    }
                }
                LocalBrowserWebView localBrowserWebView = this.view;
                if (thumbnailFrame.ready) {
                    return localBrowserWebView;
                }
            } else {
                this.thumbnailFrame = null;
            }
            return null;
        }

        public static final void destroy$release(LocalBrowserWindows localBrowserWindows, Function0<Unit> function0) {
            try {
                function0.invoke();
            } catch (RuntimeException unused) {
                localBrowserWindows.cleanupSucceeded = false;
            }
        }

        public static final Unit page$lambda$1(Window window, LocalBrowserWindows localBrowserWindows) {
            window.recordHost();
            window.reportOpened();
            if (window.view == localBrowserWindows.getVisibleWebView()) {
                localBrowserWindows.changed();
            }
            return Unit.INSTANCE;
        }
    }

    private final Window createWindow(Function0<Unit> function0) {
        try {
            LocalBrowserWebViewFactory localBrowserWebViewFactory = LocalBrowserWebViewFactory.INSTANCE;
            Context contextA0E = AbstractC7608F5v.A0E(this.root);
            String name = C6xj.A00(this.root).getName();
            C7384Etj.A0U(name);
            LocalBrowserWebView localBrowserWebViewCreate = localBrowserWebViewFactory.create(contextA0E, name);
            try {
                try {
                    return new Window(this, localBrowserWebViewCreate, function0);
                } catch (RuntimeException unused) {
                    this.cleanupSucceeded = false;
                    changed();
                    return null;
                }
            } catch (RuntimeException unused2) {
                localBrowserWebViewCreate.destroy();
                changed();
                return null;
            }
        } catch (RuntimeException unused3) {
        }
    }

    public final void attach(ViewGroup viewGroup) {
        C7384Etj.A0Y(viewGroup, 0);
        Iterator<Window> it = this.windows.iterator();
        while (it.hasNext()) {
            attach(it.next(), viewGroup);
        }
    }

    public final void close(WebView webView) {
        C7384Etj.A0Y(webView, 0);
        close(webView, LocalBrowserPopupAction.CLOSED_BY_PAGE);
    }

    public final boolean open(WebView webView, boolean z, boolean z2, Message message) {
        AnonymousClass003.A0w(webView, message);
        Boolean boolInvoke = this.acceptsUserInput.invoke();
        LocalBrowserPopupAction localBrowserPopupActionOpenWindow = openWindow(webView, z, z2, boolInvoke.booleanValue(), message);
        this.onPopupEvent.invoke(localBrowserPopupActionOpenWindow, Boolean.valueOf(z), boolInvoke);
        return OPENED.contains(localBrowserPopupActionOpenWindow);
    }

    public final boolean retire() {
        this.closed = true;
        WebView webView = this.popupProbe;
        if (webView != null) {
            releaseProbe(webView);
        }
        LocalBrowserPopupAction localBrowserPopupAction = LocalBrowserPopupAction.CLOSED_TASK_END;
        closeHeldPopup(localBrowserPopupAction);
        removeFrom(0, localBrowserPopupAction);
        return this.cleanupSucceeded;
    }

    private final List<Window> allWindows() {
        Window window = this.heldPopup;
        return (window == null || this.windows.contains(window)) ? this.windows : AbstractC0878AGe.A0Q(window, this.windows);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void changed() {
        LocalBrowserPage localBrowserPage;
        C1BN<LocalBrowserPageState> c1bn;
        Iterator<Window> it = this.windows.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            LocalBrowserWebView localBrowserWebView = it.next().view;
            if (localBrowserWebView != getVisibleWebView()) {
                i = 4;
            }
            localBrowserWebView.setImportantForAccessibility(i);
        }
        this.root.setImportantForAccessibility(this.windows.isEmpty() ? 0 : 4);
        BLG<LocalBrowserPageState> blg = this.mutablePage;
        Window window = (Window) AbstractC0878AGe.A0I(this.windows);
        blg.Af8((window == null || (localBrowserPage = window.page) == null || (c1bn = localBrowserPage.state) == null) ? null : c1bn.getValue());
        this.onChanged.invoke();
    }

    private final void closeHeldPopup(LocalBrowserPopupAction localBrowserPopupAction) {
        Window window = this.heldPopup;
        if (window != null) {
            this.heldPopup = null;
            int iIndexOf = this.windows.indexOf(window);
            if (iIndexOf >= 0) {
                removeFrom(iIndexOf, localBrowserPopupAction);
            } else {
                window.destroy();
            }
            this.onPopupEvent.invoke(localBrowserPopupAction, AnonymousClass001.A0i(), this.acceptsUserInput.invoke());
        }
    }

    private final boolean hold(Message message) {
        Window windowCreateWindow;
        Object obj = message.obj;
        WebView.WebViewTransport webViewTransport = obj instanceof WebView.WebViewTransport ? (WebView.WebViewTransport) obj : null;
        boolean z = false;
        if (webViewTransport == null || message.getTarget() == null || (windowCreateWindow = createWindow(new Function0() { // from class: com.facebook.aura.localbrowser.LocalBrowserWindows$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return LocalBrowserWindows.hold$lambda$0(this.f$0);
            }
        })) == null) {
            return false;
        }
        AbstractC7611F5y.A0g(windowCreateWindow.view);
        this.heldPopup = windowCreateWindow;
        this.heldPopupShown = false;
        try {
            webViewTransport.setWebView(windowCreateWindow.view);
            message.sendToTarget();
            z = true;
            return true;
        } catch (RuntimeException unused) {
            this.heldPopup = null;
            windowCreateWindow.destroy();
            return z;
        }
    }

    public static final Unit hold$lambda$0(final LocalBrowserWindows localBrowserWindows) {
        localBrowserWindows.handler.post(new Runnable() { // from class: com.facebook.aura.localbrowser.LocalBrowserWindows$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                LocalBrowserWindows.hold$lambda$0$0(this.f$0);
            }
        });
        return Unit.INSTANCE;
    }

    public static final void hold$lambda$0$0(LocalBrowserWindows localBrowserWindows) {
        localBrowserWindows.closeHeldPopup(LocalBrowserPopupAction.RENDERER_GONE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void loadInRoot(WebView webView, String str) {
        String strNavigationUrl;
        if (this.popupProbe == webView) {
            releaseProbe(webView);
            if (!this.closed && this.cleanupSucceeded && AnonymousClass003.A1Y(this.isBrowsingEnabled) && !AnonymousClass003.A1Y(this.acceptsUserInput) && this.windows.isEmpty() && (strNavigationUrl = LocalBrowserUrlPolicy.INSTANCE.navigationUrl(str)) != null && this.rootPage.allowsNavigation(strNavigationUrl)) {
                this.root.loadUrl(strNavigationUrl);
            }
        }
    }

    private final boolean openInRoot(Message message) {
        WebView.WebViewTransport webViewTransport;
        final LocalBrowserWebView localBrowserWebViewCreate;
        if (this.popupProbe == null) {
            Object obj = message.obj;
            if ((obj instanceof WebView.WebViewTransport) && (webViewTransport = (WebView.WebViewTransport) obj) != null && message.getTarget() != null) {
                try {
                    LocalBrowserWebViewFactory localBrowserWebViewFactory = LocalBrowserWebViewFactory.INSTANCE;
                    Context contextA0E = AbstractC7608F5v.A0E(this.root);
                    String name = C6xj.A00(this.root).getName();
                    C7384Etj.A0U(name);
                    localBrowserWebViewCreate = localBrowserWebViewFactory.create(contextA0E, name);
                    this.popupProbe = localBrowserWebViewCreate;
                } catch (RuntimeException unused) {
                }
                try {
                    localBrowserWebViewCreate.setWebViewClient(new WebViewClient() { // from class: com.facebook.aura.localbrowser.LocalBrowserWindows.openInRoot.1
                        @Override // android.webkit.WebViewClient
                        public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
                            C7384Etj.A0Y(webResourceRequest, 1);
                            final String strA0c = C60R.A0c(webResourceRequest);
                            final LocalBrowserWindows localBrowserWindows = LocalBrowserWindows.this;
                            Handler handler = localBrowserWindows.handler;
                            final LocalBrowserWebView localBrowserWebView = localBrowserWebViewCreate;
                            handler.post(new Runnable() { // from class: com.facebook.aura.localbrowser.LocalBrowserWindows$openInRoot$1$$ExternalSyntheticLambda0
                                @Override // java.lang.Runnable
                                public final void run() {
                                    localBrowserWindows.loadInRoot(localBrowserWebView, strA0c);
                                }
                            });
                            return true;
                        }

                        @Override // android.webkit.WebViewClient
                        public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
                            LocalBrowserWindows.this.releaseProbe(localBrowserWebViewCreate);
                            return true;
                        }
                    });
                    webViewTransport.setWebView(localBrowserWebViewCreate);
                    message.sendToTarget();
                    this.handler.postDelayed(new Runnable() { // from class: com.facebook.aura.localbrowser.LocalBrowserWindows$$ExternalSyntheticLambda1
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f$0.releaseProbe(localBrowserWebViewCreate);
                        }
                    }, 5000L);
                    return true;
                } catch (RuntimeException unused2) {
                    releaseProbe(localBrowserWebViewCreate);
                    return false;
                }
            }
        }
        return false;
    }

    private final LocalBrowserPopupAction openWindow(WebView webView, boolean z, boolean z2, boolean z3, Message message) {
        ViewGroup viewGroup;
        WebView.WebViewTransport webViewTransport;
        Window windowCreateWindow;
        LocalBrowserWebView localBrowserWebView;
        if (!this.closed && this.cleanupSucceeded && AnonymousClass003.A1Y(this.isBrowsingEnabled) && z2) {
            if (this.windows.size() < 4) {
                if (z3) {
                    if (webView == getVisibleWebView()) {
                        ViewParent parent = this.root.getParent();
                        if ((parent instanceof ViewGroup) && (viewGroup = (ViewGroup) parent) != null) {
                            Object obj = message.obj;
                            if ((obj instanceof WebView.WebViewTransport) && (webViewTransport = (WebView.WebViewTransport) obj) != null && message.getTarget() != null && (windowCreateWindow = createWindow(this.onRendererGone)) != null) {
                                try {
                                    this.cancelFileChooser.invoke();
                                    AbstractC7610F5x.A1A(this);
                                    this.root.clearFocus();
                                    Window window = (Window) AbstractC0878AGe.A0I(this.windows);
                                    if (window != null && (localBrowserWebView = window.view) != null) {
                                        localBrowserWebView.clearFocus();
                                    }
                                    this.windows.add(windowCreateWindow);
                                    attach(windowCreateWindow, viewGroup);
                                    windowCreateWindow.showToUser();
                                    changed();
                                    webViewTransport.setWebView(windowCreateWindow.view);
                                    message.sendToTarget();
                                    return LocalBrowserPopupAction.SHOWN;
                                } catch (RuntimeException unused) {
                                    this.windows.remove(windowCreateWindow);
                                    windowCreateWindow.destroy();
                                    changed();
                                    return LocalBrowserPopupAction.REFUSED_OTHER;
                                }
                            }
                        }
                    }
                } else if (webView == this.root && this.windows.isEmpty()) {
                    if (z) {
                        if (this.heldPopup == null) {
                            if (hold(message)) {
                                return LocalBrowserPopupAction.HELD;
                            }
                        }
                    } else if (openInRoot(message)) {
                        return LocalBrowserPopupAction.REDIRECTED_SAME_TAB;
                    }
                }
            }
            return LocalBrowserPopupAction.REFUSED_LIMIT;
        }
        return LocalBrowserPopupAction.REFUSED_OTHER;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void releaseProbe(WebView webView) {
        if (this.popupProbe == webView) {
            this.popupProbe = null;
            try {
                webView.destroy();
            } catch (RuntimeException unused) {
                this.cleanupSucceeded = false;
            }
        }
    }

    private final void removeFrom(int i, LocalBrowserPopupAction localBrowserPopupAction) {
        if (i < this.windows.size()) {
            this.cancelFileChooser.invoke();
            AbstractC7610F5x.A1A(this);
            List<Window> list = this.windows;
            C0893AGu c0893AGuA1B = BHL.A1B(AbstractC0878AGe.A0X(list.subList(i, list.size())));
            List<Window> list2 = this.windows;
            list2.subList(i, list2.size()).clear();
            Iterator<T> it = c0893AGuA1B.iterator();
            while (it.hasNext()) {
                Window window = (Window) it.next();
                window.reportClosed();
                window.destroy();
            }
            if (AbstractC0878AGe.A0k(c0893AGuA1B, this.heldPopup)) {
                this.heldPopup = null;
                this.onPopupEvent.invoke(localBrowserPopupAction, AnonymousClass001.A0i(), this.acceptsUserInput.invoke());
            }
            changed();
        }
    }

    public final void closeUserWindows() {
        ViewGroup viewGroup;
        Window window = this.heldPopup;
        if (window == null || !this.windows.contains(window)) {
            window = null;
        } else {
            this.windows.remove(window);
            window.reportClosed();
            window.thumbnailFrame = null;
            window.view.clearFocus();
            ViewParent parent = window.view.getParent();
            if ((parent instanceof ViewGroup) && (viewGroup = (ViewGroup) parent) != null) {
                viewGroup.removeView(window.view);
            }
            AbstractC7611F5y.A0g(window.view);
        }
        removeFrom(0, LocalBrowserPopupAction.CLOSED_BY_USER);
        if (window != null) {
            changed();
        }
    }

    public final void detach() {
        for (Window window : this.windows) {
            window.thumbnailFrame = null;
            LocalBrowserWebView localBrowserWebView = window.view;
            localBrowserWebView.clearFocus();
            localBrowserWebView.onPause();
            AbstractC7611F5y.A0h(localBrowserWebView);
            AbstractC7611F5y.A0g(localBrowserWebView);
        }
    }

    public final boolean getBlocksAutomation() {
        return (this.windows.isEmpty() && this.cleanupSucceeded) ? false : true;
    }

    public final C1BN<LocalBrowserPageState> getPage() {
        return this.page;
    }

    public final LocalBrowserPage getVisiblePage() {
        LocalBrowserPage localBrowserPage;
        Window window = (Window) AbstractC0878AGe.A0I(this.windows);
        return (window == null || (localBrowserPage = window.page) == null) ? this.rootPage : localBrowserPage;
    }

    public final LocalBrowserWebView getVisibleWebView() {
        LocalBrowserWebView localBrowserWebView;
        Window window = (Window) AbstractC0878AGe.A0I(this.windows);
        return (window == null || (localBrowserWebView = window.view) == null) ? this.root : localBrowserWebView;
    }

    public final void goBack() {
        Window window = (Window) AbstractC0878AGe.A0I(this.windows);
        if (window == null || !AnonymousClass003.A1Y(this.acceptsUserInput)) {
            return;
        }
        boolean zCanGoBack = window.view.canGoBack();
        LocalBrowserWebView localBrowserWebView = window.view;
        if (zCanGoBack) {
            localBrowserWebView.goBack();
        } else {
            close(localBrowserWebView, LocalBrowserPopupAction.CLOSED_BY_USER);
        }
    }

    public final LocalBrowserPopupFact heldPopupFact() {
        String str;
        Window window = this.heldPopup;
        if (window == null || (str = window.firstHost) == null) {
            return null;
        }
        return new LocalBrowserPopupFact(this.heldPopupShown, str);
    }

    public final void releaseHeldPopup() {
        if (this.heldPopup == null || !(!this.windows.contains(r1))) {
            return;
        }
        closeHeldPopup(LocalBrowserPopupAction.CLOSED_TASK_END);
    }

    public final void releaseUserInput() {
        for (Window window : this.windows) {
            AutofillManager autofillManager = (AutofillManager) window.view.getContext().getSystemService(AutofillManager.class);
            if (autofillManager != null) {
                autofillManager.cancel();
            }
            window.view.clearFocus();
        }
    }

    public final void showHeldPopup(ViewGroup viewGroup) {
        LocalBrowserWebView localBrowserWebView;
        Window window = this.heldPopup;
        if (window == null || this.closed || this.windows.contains(window) || this.windows.size() >= 4) {
            return;
        }
        this.cancelFileChooser.invoke();
        AbstractC7610F5x.A1A(this);
        this.root.clearFocus();
        Window window2 = (Window) AbstractC0878AGe.A0I(this.windows);
        if (window2 != null && (localBrowserWebView = window2.view) != null) {
            localBrowserWebView.clearFocus();
        }
        this.windows.add(window);
        if (viewGroup != null) {
            attach(window, viewGroup);
        }
        window.showToUser();
        if (!this.heldPopupShown) {
            this.heldPopupShown = true;
            this.onPopupEvent.invoke(LocalBrowserPopupAction.SHOWN, true, true);
        }
        changed();
    }

    public final LocalBrowserWebView thumbnailWebView() {
        Window window = (Window) AbstractC0878AGe.A0I(this.windows);
        return window == null ? this.root : window.thumbnailWebView();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public LocalBrowserWindows(LocalBrowserWebView localBrowserWebView, LocalBrowserPage localBrowserPage, Function0<LocalBrowserDialogs> function0, G0W<? super WebView, ? super ValueCallback<Uri[]>, ? super WebChromeClient.FileChooserParams, Boolean> g0w, Function0<Unit> function02, Function0<Boolean> function03, Function0<Boolean> function04, Function0<Unit> function05, Function0<Unit> function06, G0U<? super String, ? extends WebResourceResponse> g0u, Function0<Boolean> function07, G0W<? super LocalBrowserPopupAction, ? super Boolean, ? super Boolean, Unit> g0w2, Function0<? extends LocalBrowserTakeoverSink> function08) {
        boolean zA1Y = C60P.A1Y(localBrowserWebView, localBrowserPage);
        AnonymousClass005.A16(function0, g0w, function02, function03, 2);
        AnonymousClass005.A13(function04, function05, function06, 6);
        C3cH.A18(g0u, function07);
        C7384Etj.A0Y(g0w2, 11);
        C7384Etj.A0Y(function08, 12);
        this.root = localBrowserWebView;
        this.rootPage = localBrowserPage;
        this.dialogs = function0;
        this.onFileChooser = g0w;
        this.cancelFileChooser = function02;
        this.acceptsUserInput = function03;
        this.acceptsAutofill = function04;
        this.onRendererGone = function05;
        this.onChanged = function06;
        this.screenPopup = g0u;
        this.isBrowsingEnabled = function07;
        this.onPopupEvent = g0w2;
        this.takeover = function08;
        this.windows = C3cG.A0h();
        this.handler = C60O.A02();
        C9286GCn c9286GCnA14 = C3cG.A14(HwN.A01);
        this.mutablePage = c9286GCnA14;
        this.page = C3cG.A11(c9286GCnA14);
        this.cleanupSucceeded = zA1Y;
    }

    public final void broadcastTakeover(boolean z) {
        Iterator<Window> it = allWindows().iterator();
        while (it.hasNext()) {
            it.next().activityBridge.broadcast(z);
        }
    }

    public final void setBrowsingEnabled(boolean z) {
        Iterator<Window> it = allWindows().iterator();
        while (it.hasNext()) {
            it.next().view.getSettings().setBlockNetworkLoads(!z);
        }
    }

    public final void setResumed(boolean z) {
        for (Window window : allWindows()) {
            window.view.setSuppressScreenWakeLock(!z);
            LocalBrowserWebView localBrowserWebView = window.view;
            if (z) {
                localBrowserWebView.onResume();
            } else {
                localBrowserWebView.onPause();
            }
        }
    }

    private final void attach(Window window, ViewGroup viewGroup) {
        AutofillId nextAutofillId;
        LocalBrowserWebView localBrowserWebView = window.view;
        Context context = localBrowserWebView.getContext();
        C7384Etj.A0Z(context, "null cannot be cast to non-null type android.content.MutableContextWrapper");
        Context context2 = this.root.getContext();
        C7384Etj.A0Z(context2, "null cannot be cast to non-null type android.content.MutableContextWrapper");
        ((MutableContextWrapper) context).setBaseContext(((ContextWrapper) context2).getBaseContext());
        AutofillManager autofillManager = (AutofillManager) context.getSystemService(AutofillManager.class);
        if (autofillManager != null && (nextAutofillId = autofillManager.getNextAutofillId()) != null) {
            localBrowserWebView.setAutofillId(nextAutofillId);
        }
        viewGroup.addView(localBrowserWebView, new ViewGroup.LayoutParams(-1, -1));
        localBrowserWebView.onResume();
    }

    private final void close(WebView webView, LocalBrowserPopupAction localBrowserPopupAction) {
        LocalBrowserWebView localBrowserWebView;
        Window window = this.heldPopup;
        if (window != null) {
            localBrowserWebView = window.view;
        } else {
            localBrowserWebView = null;
        }
        if (localBrowserWebView == webView) {
            closeHeldPopup(localBrowserPopupAction);
            return;
        }
        Iterator<Window> it = this.windows.iterator();
        int i = 0;
        while (it.hasNext()) {
            if (it.next().view == webView) {
                if (i < 0) {
                    return;
                }
                removeFrom(i, localBrowserPopupAction);
                return;
            }
            i++;
        }
    }
}
