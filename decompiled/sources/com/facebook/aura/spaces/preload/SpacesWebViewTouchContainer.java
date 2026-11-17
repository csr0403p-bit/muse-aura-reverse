package com.facebook.aura.spaces.preload;

import X.AnonymousClass002;
import X.AnonymousClass003;
import X.C06827l3;
import X.C06H;
import X.C6t6;
import X.C7384Etj;
import X.C7BY;
import X.CFK;
import X.EnumC06837l4;
import X.FGI;
import X.G0U;
import android.content.Context;
import android.webkit.JavascriptInterface;
import android.widget.FrameLayout;
import com.facebook.aura.maps.model.HatchMapSceneKt;
import kotlin.Unit;
import okhttp3.internal.publicsuffix.PublicSuffixDatabase;

/* loaded from: classes3.dex */
public final class SpacesWebViewTouchContainer extends FrameLayout {
    public static final Companion Companion = new Companion();
    public static final C06827l3 HTTP_URL_REGEX;
    public static final C06827l3 WWW_URL_REGEX;
    public volatile float cssBottom;
    public volatile float cssClientWidth;
    public volatile float cssScrollLeft;
    public volatile float cssScrollWidth;
    public volatile float cssTop;
    public boolean decided;
    public volatile G0U<? super String, Unit> plainTextUrlClickListener;
    public final boolean scrollsInFrame;
    public C6t6 secureWebView;
    public float startX;
    public float startY;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SpacesWebViewTouchContainer(Context context, boolean z) {
        super(context);
        C7384Etj.A0Y(context, 0);
        this.scrollsInFrame = z;
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00cf  */
    @Override // android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onInterceptTouchEvent(android.view.MotionEvent r8) {
        /*
            Method dump skipped, instructions count: 244
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.spaces.preload.SpacesWebViewTouchContainer.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    @JavascriptInterface
    public final void onScrollMetrics(final String str, final float f, final float f2, final float f3, final float f4, final float f5) {
        C7384Etj.A0Y(str, 0);
        post(new Runnable() { // from class: com.facebook.aura.spaces.preload.SpacesWebViewTouchContainer.onScrollMetrics.1
            @Override // java.lang.Runnable
            public final void run() {
                try {
                    C6t6 c6t6 = SpacesWebViewTouchContainer.this.secureWebView;
                    if (c6t6 != null) {
                        if (c6t6.validateJsInterfaceToken(str)) {
                            SpacesWebViewTouchContainer.this.cssScrollLeft = f;
                            SpacesWebViewTouchContainer.this.cssScrollWidth = f2;
                            SpacesWebViewTouchContainer.this.cssClientWidth = f3;
                            SpacesWebViewTouchContainer.this.cssTop = f4;
                            SpacesWebViewTouchContainer.this.cssBottom = f5;
                        }
                    }
                } catch (RuntimeException e) {
                    CFK.A08(SpacesWebViewFactoryKt.TAG, "Exception validating JS bridge token", e);
                }
            }
        });
    }

    static {
        EnumC06837l4 enumC06837l4 = EnumC06837l4.A03;
        HTTP_URL_REGEX = new C06827l3("https?://\\S+", enumC06837l4);
        WWW_URL_REGEX = new C06827l3("www\\.\\S+", enumC06837l4);
    }

    public final C6t6 getSecureWebView() {
        return this.secureWebView;
    }

    public final void setOnPlainTextUrlClick(G0U<? super String, Unit> g0u) {
        this.plainTextUrlClickListener = g0u;
    }

    public final void setSecureWebView(C6t6 c6t6) {
        this.secureWebView = c6t6;
    }

    public final class Companion {
        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    private final String normalizePlainTextUrl(String str) {
        String strA0Z = C7BY.A0Z(AnonymousClass002.A0l(str), '.', ',', ';', HatchMapSceneKt.ARTIFACT_ID_SEPARATOR, PublicSuffixDatabase.EXCEPTION_MARKER, '?', ')', ']', '}');
        if (strA0Z.length() != 0) {
            if (HTTP_URL_REGEX.A08(strA0Z)) {
                return strA0Z;
            }
            if (WWW_URL_REGEX.A08(strA0Z)) {
                return FGI.A0M("https://", strA0Z);
            }
        }
        return null;
    }

    @JavascriptInterface
    public final void onPlainTextUrlClick(final String str, String str2) {
        AnonymousClass003.A0u(str, str2);
        final String strNormalizePlainTextUrl = normalizePlainTextUrl(str2);
        if (strNormalizePlainTextUrl != null) {
            post(new Runnable() { // from class: com.facebook.aura.spaces.preload.SpacesWebViewTouchContainer$onPlainTextUrlClick$1$1
                @Override // java.lang.Runnable
                public final void run() {
                    G0U<? super String, Unit> g0u;
                    try {
                        C6t6 c6t6 = this.this$0.secureWebView;
                        if (c6t6 != null) {
                            if (!c6t6.validateJsInterfaceToken(str) || (g0u = this.this$0.plainTextUrlClickListener) == null) {
                                return;
                            }
                            g0u.invoke(strNormalizePlainTextUrl);
                        }
                    } catch (RuntimeException e) {
                        CFK.A08(SpacesWebViewFactoryKt.TAG, "Exception validating JS bridge token", e);
                    }
                }
            });
        }
    }
}
