package com.facebook.aura.spaces.repo;

import X.BLG;
import X.C3Em;
import X.C3cG;
import X.C7384Etj;
import X.C79;
import X.G0U;
import X.G0W;
import android.content.Intent;
import android.net.Uri;
import android.webkit.ValueCallback;
import com.facebook.aura.spaces.cache.SpacesDiskCache;
import com.facebook.aura.webview.diagnostics.HatchHtmlDiagnostics;
import com.facebook.aura.webview.diagnostics.HatchHtmlRenderTrace;
import com.facebook.aura.webview.diagnostics.HatchHtmlSurface;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final class HtmlSpacesWebViewSession {
    public volatile String authToken;
    public volatile SpacesDiskCache diskCache;
    public volatile SpacesFileChooserHost fileChooserHost;
    public volatile String gatewayBaseUrl;
    public boolean isSavedSpace;
    public volatile long lastLoadCompletedAtMs;
    public volatile Integer lastTopColor;
    public String loadCompletedContent;
    public volatile String loadedContent;
    public Long loadedUpdatedAtMs;
    public volatile SpacesMediaPermissionHost mediaPermissionHost;
    public final Set<String> networkFirstUrls;
    public volatile G0U<? super String, Unit> onOpenInNewWindowUrl;
    public volatile G0U<? super String, Unit> onOpenUrl;
    public volatile Function0<Unit> onPeerAccessEnded;
    public volatile G0U<? super Integer, Unit> onTopColorDetected;
    public volatile Function0<Unit> onTrackedNavWebViewLoaded;
    public volatile Intent pendingCameraIntent;
    public volatile Uri pendingCaptureUri;
    public volatile ValueCallback<Uri[]> pendingFileCallback;
    public volatile HatchHtmlRenderTrace renderTrace;
    public volatile float safeAreaInsetAppBottomDp;
    public volatile float safeAreaInsetBottomDp;
    public volatile float safeAreaInsetTopDp;
    public String satisfiedTrackedNavWebViewLoadRequestKey;
    public boolean savedSpaceAdmissionPending;
    public long savedSpaceLastTapUptimeMs;
    public boolean savedSpaceProfileReady;
    public volatile G0W<? super String, ? super String, ? super String, String> shareHost;
    public volatile String sourceUrl;
    public volatile boolean trackNavWebViewLoad;
    public Function0<Unit> trackedNavWebViewLoadCallback;
    public volatile String trackedNavWebViewLoadRequestKey;
    public final BLG<Boolean> showError = C3cG.A14(false);
    public final BLG<Boolean> rendererGone = C3cG.A14(false);
    public final C3Em<SpacesUserError> userErrors = C3cG.A12(C79.A01, 0, 8);
    public final BLG<Boolean> isLoading = C3cG.A14(false);
    public final BLG<Boolean> canGoBack = C3cG.A14(false);
    public volatile String envCss = "";

    public final void clearHostReferences() {
        this.onOpenUrl = null;
        this.onOpenInNewWindowUrl = null;
        this.onTopColorDetected = null;
        this.trackedNavWebViewLoadCallback = null;
        this.trackNavWebViewLoad = false;
        this.trackedNavWebViewLoadRequestKey = null;
        this.onTrackedNavWebViewLoaded = null;
        this.fileChooserHost = null;
        this.mediaPermissionHost = null;
    }

    public final void emitUserError(SpacesUserError spacesUserError) {
        C7384Etj.A0Y(spacesUserError, 0);
        this.userErrors.AhV(spacesUserError);
    }

    public final void setEnvCss(String str) {
        C7384Etj.A0Y(str, 0);
        this.envCss = str;
    }

    public final void beginRender(String str) {
        HatchHtmlRenderTrace hatchHtmlRenderTrace = this.renderTrace;
        if (hatchHtmlRenderTrace != null) {
            hatchHtmlRenderTrace.cancelled();
        }
        this.renderTrace = HatchHtmlDiagnostics.INSTANCE.startRender(HatchHtmlSurface.SPACE, null, str);
    }

    public final void cancelPendingFileRequest() {
        ValueCallback<Uri[]> valueCallback = this.pendingFileCallback;
        this.pendingFileCallback = null;
        this.pendingCaptureUri = null;
        this.pendingCameraIntent = null;
        if (valueCallback != null) {
            valueCallback.onReceiveValue(new Uri[0]);
        }
    }

    public final String getAuthToken() {
        return this.authToken;
    }

    public final BLG<Boolean> getCanGoBack() {
        return this.canGoBack;
    }

    public final SpacesDiskCache getDiskCache() {
        return this.diskCache;
    }

    public final String getEnvCss() {
        return this.envCss;
    }

    public final SpacesFileChooserHost getFileChooserHost() {
        return this.fileChooserHost;
    }

    public final String getGatewayBaseUrl() {
        return this.gatewayBaseUrl;
    }

    public final long getLastLoadCompletedAtMs() {
        return this.lastLoadCompletedAtMs;
    }

    public final Integer getLastTopColor() {
        return this.lastTopColor;
    }

    public final String getLoadCompletedContent() {
        return this.loadCompletedContent;
    }

    public final String getLoadedContent() {
        return this.loadedContent;
    }

    public final Long getLoadedUpdatedAtMs() {
        return this.loadedUpdatedAtMs;
    }

    public final SpacesMediaPermissionHost getMediaPermissionHost() {
        return this.mediaPermissionHost;
    }

    public final Set<String> getNetworkFirstUrls() {
        return this.networkFirstUrls;
    }

    public final G0U<String, Unit> getOnOpenInNewWindowUrl() {
        return this.onOpenInNewWindowUrl;
    }

    public final G0U<String, Unit> getOnOpenUrl() {
        return this.onOpenUrl;
    }

    public final Function0<Unit> getOnPeerAccessEnded() {
        return this.onPeerAccessEnded;
    }

    public final G0U<Integer, Unit> getOnTopColorDetected() {
        return this.onTopColorDetected;
    }

    public final Function0<Unit> getOnTrackedNavWebViewLoaded() {
        return this.onTrackedNavWebViewLoaded;
    }

    public final Intent getPendingCameraIntent() {
        return this.pendingCameraIntent;
    }

    public final Uri getPendingCaptureUri() {
        return this.pendingCaptureUri;
    }

    public final ValueCallback<Uri[]> getPendingFileCallback() {
        return this.pendingFileCallback;
    }

    public final HatchHtmlRenderTrace getRenderTrace() {
        return this.renderTrace;
    }

    public final BLG<Boolean> getRendererGone() {
        return this.rendererGone;
    }

    public final float getSafeAreaInsetAppBottomDp() {
        return this.safeAreaInsetAppBottomDp;
    }

    public final float getSafeAreaInsetBottomDp() {
        return this.safeAreaInsetBottomDp;
    }

    public final float getSafeAreaInsetTopDp() {
        return this.safeAreaInsetTopDp;
    }

    public final String getSatisfiedTrackedNavWebViewLoadRequestKey() {
        return this.satisfiedTrackedNavWebViewLoadRequestKey;
    }

    public final boolean getSavedSpaceAdmissionPending() {
        return this.savedSpaceAdmissionPending;
    }

    public final long getSavedSpaceLastTapUptimeMs() {
        return this.savedSpaceLastTapUptimeMs;
    }

    public final boolean getSavedSpaceProfileReady() {
        return this.savedSpaceProfileReady;
    }

    public final G0W<String, String, String, String> getShareHost() {
        return this.shareHost;
    }

    public final BLG<Boolean> getShowError() {
        return this.showError;
    }

    public final String getSourceUrl() {
        return this.sourceUrl;
    }

    public final boolean getTrackNavWebViewLoad() {
        return this.trackNavWebViewLoad;
    }

    public final Function0<Unit> getTrackedNavWebViewLoadCallback() {
        return this.trackedNavWebViewLoadCallback;
    }

    public final String getTrackedNavWebViewLoadRequestKey() {
        return this.trackedNavWebViewLoadRequestKey;
    }

    public final C3Em<SpacesUserError> getUserErrors() {
        return this.userErrors;
    }

    public final BLG<Boolean> isLoading() {
        return this.isLoading;
    }

    public final boolean isSavedSpace() {
        return this.isSavedSpace;
    }

    public final void setAuthToken(String str) {
        this.authToken = str;
    }

    public final void setDiskCache(SpacesDiskCache spacesDiskCache) {
        this.diskCache = spacesDiskCache;
    }

    public final void setFileChooserHost(SpacesFileChooserHost spacesFileChooserHost) {
        this.fileChooserHost = spacesFileChooserHost;
    }

    public final void setGatewayBaseUrl(String str) {
        this.gatewayBaseUrl = str;
    }

    public final void setLastLoadCompletedAtMs(long j) {
        this.lastLoadCompletedAtMs = j;
    }

    public final void setLastTopColor(Integer num) {
        this.lastTopColor = num;
    }

    public final void setLoadCompletedContent(String str) {
        this.loadCompletedContent = str;
    }

    public final void setLoadedContent(String str) {
        this.loadedContent = str;
    }

    public final void setLoadedUpdatedAtMs(Long l) {
        this.loadedUpdatedAtMs = l;
    }

    public final void setMediaPermissionHost(SpacesMediaPermissionHost spacesMediaPermissionHost) {
        this.mediaPermissionHost = spacesMediaPermissionHost;
    }

    public final void setOnOpenInNewWindowUrl(G0U<? super String, Unit> g0u) {
        this.onOpenInNewWindowUrl = g0u;
    }

    public final void setOnOpenUrl(G0U<? super String, Unit> g0u) {
        this.onOpenUrl = g0u;
    }

    public final void setOnPeerAccessEnded(Function0<Unit> function0) {
        this.onPeerAccessEnded = function0;
    }

    public final void setOnTopColorDetected(G0U<? super Integer, Unit> g0u) {
        this.onTopColorDetected = g0u;
    }

    public final void setOnTrackedNavWebViewLoaded(Function0<Unit> function0) {
        this.onTrackedNavWebViewLoaded = function0;
    }

    public final void setPendingCameraIntent(Intent intent) {
        this.pendingCameraIntent = intent;
    }

    public final void setPendingCaptureUri(Uri uri) {
        this.pendingCaptureUri = uri;
    }

    public final void setPendingFileCallback(ValueCallback<Uri[]> valueCallback) {
        this.pendingFileCallback = valueCallback;
    }

    public final void setRenderTrace(HatchHtmlRenderTrace hatchHtmlRenderTrace) {
        this.renderTrace = hatchHtmlRenderTrace;
    }

    public final void setSafeAreaInsetAppBottomDp(float f) {
        this.safeAreaInsetAppBottomDp = f;
    }

    public final void setSafeAreaInsetBottomDp(float f) {
        this.safeAreaInsetBottomDp = f;
    }

    public final void setSafeAreaInsetTopDp(float f) {
        this.safeAreaInsetTopDp = f;
    }

    public final void setSatisfiedTrackedNavWebViewLoadRequestKey(String str) {
        this.satisfiedTrackedNavWebViewLoadRequestKey = str;
    }

    public final void setSavedSpace(boolean z) {
        this.isSavedSpace = z;
    }

    public final void setSavedSpaceAdmissionPending(boolean z) {
        this.savedSpaceAdmissionPending = z;
    }

    public final void setSavedSpaceLastTapUptimeMs(long j) {
        this.savedSpaceLastTapUptimeMs = j;
    }

    public final void setSavedSpaceProfileReady(boolean z) {
        this.savedSpaceProfileReady = z;
    }

    public final void setShareHost(G0W<? super String, ? super String, ? super String, String> g0w) {
        this.shareHost = g0w;
    }

    public final void setSourceUrl(String str) {
        this.sourceUrl = str;
    }

    public final void setTrackNavWebViewLoad(boolean z) {
        this.trackNavWebViewLoad = z;
    }

    public final void setTrackedNavWebViewLoadCallback(Function0<Unit> function0) {
        this.trackedNavWebViewLoadCallback = function0;
    }

    public final void setTrackedNavWebViewLoadRequestKey(String str) {
        this.trackedNavWebViewLoadRequestKey = str;
    }

    public HtmlSpacesWebViewSession() {
        ConcurrentHashMap.KeySetView keySetViewNewKeySet = ConcurrentHashMap.newKeySet();
        C7384Etj.A0U(keySetViewNewKeySet);
        this.networkFirstUrls = keySetViewNewKeySet;
    }
}
