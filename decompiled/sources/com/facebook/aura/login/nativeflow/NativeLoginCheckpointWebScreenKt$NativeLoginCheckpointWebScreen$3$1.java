package com.facebook.aura.login.nativeflow;

import X.AbstractC7559F3s;
import X.C7384Etj;
import X.G0U;
import android.webkit.WebView;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;

/* loaded from: classes3.dex */
public final class NativeLoginCheckpointWebScreenKt$NativeLoginCheckpointWebScreen$3$1 extends AbstractC7559F3s implements G0U<WebView, Unit> {
    public final /* synthetic */ AtomicBoolean $webViewReleased;

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(WebView webView) {
        C7384Etj.A0Y(webView, 0);
        NativeLoginCheckpointWebScreenKt.releaseCheckpointWebView(webView, this.$webViewReleased);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NativeLoginCheckpointWebScreenKt$NativeLoginCheckpointWebScreen$3$1(AtomicBoolean atomicBoolean) {
        super(1);
        this.$webViewReleased = atomicBoolean;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(WebView webView) {
        invoke2(webView);
        return Unit.INSTANCE;
    }
}
