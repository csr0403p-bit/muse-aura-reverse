package com.facebook.aura.spaces.preload;

import X.AnonymousClass001;
import X.AnonymousClass002;
import X.BFI;
import X.C3cG;
import X.C60P;
import X.C60R;
import X.C6tF;
import X.C7384Etj;
import X.CFK;
import X.FGI;
import X.G0U;
import android.net.Uri;
import android.os.Message;
import android.webkit.ConsoleMessage;
import android.webkit.PermissionRequest;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.facebook.aura.spaces.repo.HtmlSpacesWebViewSession;
import com.facebook.aura.spaces.repo.SpacesFileChooserHost;
import com.facebook.aura.spaces.repo.SpacesMediaPermissionHost;
import com.facebook.aura.spaces.repo.SpacesUserError;
import com.facebook.aura.webview.diagnostics.HatchHtmlActionTrace;
import com.facebook.aura.webview.diagnostics.HatchHtmlActionType;
import com.facebook.aura.webview.diagnostics.HatchHtmlDiagnostics;
import com.facebook.aura.webview.diagnostics.HatchHtmlErrorCode;
import com.facebook.aura.webview.diagnostics.HatchHtmlRoute;
import com.facebook.aura.webview.diagnostics.HatchHtmlSurface;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;

/* loaded from: classes3.dex */
public final class SpacesWebChromeClient extends C6tF {
    public final HtmlSpacesWebViewSession session;

    public SpacesWebChromeClient(HtmlSpacesWebViewSession htmlSpacesWebViewSession) {
        C7384Etj.A0Y(htmlSpacesWebViewSession, 0);
        this.session = htmlSpacesWebViewSession;
    }

    @Override // X.C6tF
    public boolean onConsoleMessage(ConsoleMessage consoleMessage) {
        C7384Etj.A0Y(consoleMessage, 0);
        ConsoleMessage.MessageLevel messageLevel = consoleMessage.messageLevel();
        String strMessage = consoleMessage.message();
        String strSourceId = consoleMessage.sourceId();
        int iLineNumber = consoleMessage.lineNumber();
        StringBuilder sbA0f = C3cG.A0f(messageLevel, "[");
        sbA0f.append("] ");
        sbA0f.append(strMessage);
        sbA0f.append(" (");
        sbA0f.append(strSourceId);
        sbA0f.append(":");
        sbA0f.append(iLineNumber);
        String strA0v = AnonymousClass001.A0v(")", sbA0f);
        ConsoleMessage.MessageLevel messageLevel2 = consoleMessage.messageLevel();
        int i = messageLevel2 == null ? -1 : WhenMappings.$EnumSwitchMapping$0[messageLevel2.ordinal()];
        if (i != 1) {
            if (i == 2) {
                CFK.A06(SpacesWebChromeClientKt.CONSOLE_TAG, strA0v);
            }
            return true;
        }
        CFK.A04(SpacesWebChromeClientKt.CONSOLE_TAG, strA0v);
        HatchHtmlDiagnostics.INSTANCE.logError(HatchHtmlSurface.SPACE, HatchHtmlErrorCode.INTERNAL_ERROR, strA0v, null, null, null);
        return true;
    }

    @Override // X.C6tF
    public boolean onCreateWindow(final WebView webView, boolean z, final boolean z2, Message message) {
        AnonymousClass002.A1B(webView, 0, message);
        if (!z2) {
            HatchHtmlDiagnostics.INSTANCE.startAction(HatchHtmlSurface.SPACE, HatchHtmlActionType.NEW_WINDOW, null).failed(HatchHtmlErrorCode.NOT_USER_GESTURE, null, null);
            return false;
        }
        final G0U<? super String, Unit> g0u = this.session.onOpenInNewWindowUrl;
        if (g0u == null) {
            HatchHtmlDiagnostics.INSTANCE.startAction(HatchHtmlSurface.SPACE, HatchHtmlActionType.NEW_WINDOW, null).failed(HatchHtmlErrorCode.NO_HANDLER, null, null);
            return false;
        }
        WebView webView2 = new WebView(webView.getContext());
        webView2.setWebViewClient(new WebViewClient() { // from class: com.facebook.aura.spaces.preload.SpacesWebChromeClient.onCreateWindow.1
            @Override // android.webkit.WebViewClient
            public boolean shouldOverrideUrlLoading(WebView webView3, WebResourceRequest webResourceRequest) {
                boolean zA1Y = C60P.A1Y(webView3, webResourceRequest);
                String strA0c = C60R.A0c(webResourceRequest);
                SpacesWebViewFactoryKt.logSavedSpaceEvent(SpacesWebChromeClient.this.session, webView, "new_window", strA0c, FGI.A0r("gesture=", z2));
                HatchHtmlActionTrace hatchHtmlActionTraceStartAction = HatchHtmlDiagnostics.INSTANCE.startAction(HatchHtmlSurface.SPACE, HatchHtmlActionType.NEW_WINDOW, strA0c);
                if (strA0c.startsWith("blob:")) {
                    CFK.A06(SpacesWebChromeClientKt.TAG, "onCreateWindow: dropping blob: URL (handled in-page by the blob viewer)");
                    hatchHtmlActionTraceStartAction.failed(HatchHtmlErrorCode.UNSUPPORTED_SCHEME, "blob:", null);
                } else {
                    g0u.invoke(strA0c);
                    hatchHtmlActionTraceStartAction.routed(HatchHtmlRoute.EXTERNAL_BROWSER);
                }
                webView3.destroy();
                return zA1Y;
            }
        });
        Object obj = message.obj;
        C7384Etj.A0Z(obj, "null cannot be cast to non-null type android.webkit.WebView.WebViewTransport");
        ((WebView.WebViewTransport) obj).setWebView(webView2);
        message.sendToTarget();
        return true;
    }

    @Override // X.C6tF
    public void onPermissionRequest(PermissionRequest permissionRequest) {
        String str;
        C7384Etj.A0Y(permissionRequest, 0);
        String[] resources = permissionRequest.getResources();
        C7384Etj.A0U(resources);
        List listA0G = BFI.A0G(resources);
        permissionRequest.getOrigin();
        ArrayList arrayListA0h = C3cG.A0h();
        for (Object obj : listA0G) {
            if ("android.webkit.resource.VIDEO_CAPTURE".equals(obj) || "android.webkit.resource.AUDIO_CAPTURE".equals(obj)) {
                arrayListA0h.add(obj);
            }
        }
        if (arrayListA0h.isEmpty()) {
            str = "onPermissionRequest: no supported resources \u2014 denying";
        } else {
            SpacesMediaPermissionHost spacesMediaPermissionHost = this.session.mediaPermissionHost;
            if (spacesMediaPermissionHost != null) {
                spacesMediaPermissionHost.resolve(permissionRequest);
                return;
            }
            str = "onPermissionRequest: no host installed \u2014 denying";
        }
        CFK.A06(SpacesWebChromeClientKt.TAG, str);
        permissionRequest.deny();
    }

    @Override // X.C6tF
    public void onPermissionRequestCanceled(PermissionRequest permissionRequest) {
        C7384Etj.A0Y(permissionRequest, 0);
        String[] resources = permissionRequest.getResources();
        C7384Etj.A0U(resources);
        BFI.A0G(resources);
    }

    @Override // X.C6tF
    public boolean onShowFileChooser(WebView webView, final ValueCallback<Uri[]> valueCallback, WebChromeClient.FileChooserParams fileChooserParams) {
        AnonymousClass002.A1A(valueCallback, 1, fileChooserParams);
        String[] acceptTypes = fileChooserParams.getAcceptTypes();
        if (acceptTypes == null) {
            acceptTypes = new String[0];
        }
        boolean zA1Q = AnonymousClass002.A1Q(fileChooserParams.getMode(), 1);
        boolean zIsCaptureEnabled = fileChooserParams.isCaptureEnabled();
        SpacesFileChooserHost spacesFileChooserHost = this.session.fileChooserHost;
        BFI.A0B(",", "", "", null, acceptTypes);
        if (spacesFileChooserHost != null) {
            final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            spacesFileChooserHost.launch(acceptTypes, zA1Q, zIsCaptureEnabled, new ValueCallback() { // from class: com.facebook.aura.spaces.preload.SpacesWebChromeClient$onShowFileChooser$oneShot$1
                @Override // android.webkit.ValueCallback
                public final void onReceiveValue(Uri[] uriArr) {
                    if (!atomicBoolean.compareAndSet(false, true)) {
                        CFK.A06(SpacesWebChromeClientKt.TAG, "onShowFileChooser: duplicate callback \u2014 dropping");
                        return;
                    }
                    if (uriArr == null) {
                        uriArr = new Uri[0];
                    }
                    valueCallback.onReceiveValue(uriArr);
                }
            });
            return true;
        }
        CFK.A06(SpacesWebChromeClientKt.TAG, "onShowFileChooser: no host installed \u2014 cancelling");
        this.session.emitUserError(SpacesUserError.PICKER_FAILED);
        valueCallback.onReceiveValue(new Uri[0]);
        return false;
    }

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ConsoleMessage.MessageLevel.values().length];
            try {
                AnonymousClass002.A13(ConsoleMessage.MessageLevel.ERROR, iArr);
            } catch (NoSuchFieldError unused) {
            }
            try {
                AnonymousClass002.A14(ConsoleMessage.MessageLevel.WARNING, iArr);
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
