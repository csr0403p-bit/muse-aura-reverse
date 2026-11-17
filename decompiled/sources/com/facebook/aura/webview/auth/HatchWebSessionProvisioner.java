package com.facebook.aura.webview.auth;

import X.AbstractC07127nr;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass003;
import X.C0881AGi;
import X.C3UX;
import X.C3cG;
import X.C4020Ck2;
import X.C60O;
import X.C60Q;
import X.C60R;
import X.C6t6;
import X.C7384Etj;
import X.C7BY;
import X.C7Bm;
import X.C8hx;
import X.CFK;
import X.EnumC10460Hji;
import X.F2m;
import X.FGI;
import X.G0V;
import X.GBL;
import X.HtJ;
import X.Hwg;
import X.Hxb;
import X.HzP;
import android.content.Context;
import android.webkit.CookieManager;
import com.facebook.aura.accountcenter.AuraMetaCookieRequestFactory;
import com.facebook.aura.bloks.storage.AuraMetaFRLSecureTokenStore;
import com.facebook.aura.identity.datr.AuraDatrDeviceIdentityBridge;
import com.facebook.aura.network.transport.flipper.FlipperNoiseReporter;
import com.facebook.aura.opengraph.HatchWebPageParserKt;
import com.facebook.aura.partners.voice.screen.HatchVoiceAnnouncementSheetKt;
import com.facebook.aura.utils.navigation.MetaWebUrlLocalizerKt;
import java.net.URLEncoder;
import java.util.Collections;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final class HatchWebSessionProvisioner {
    public static final String ABRA_CSRF_COOKIE = "abra_csrf";
    public static final String ABRA_SESSION_COOKIE = "abra_sess";
    public static final String AUTH_META_COOKIE_URL = "https://auth.meta.com";
    public static final long HEADLESS_TIMEOUT_MS = 30000;
    public static final String META_AI_COOKIE_URL = "https://www.meta.ai";
    public static final long META_AI_OIDC_APP_ID = 391894423991568L;
    public static final String META_AI_OIDC_CALLBACK_URI = "https://www.meta.ai/oidc/callback/";
    public static final String META_AI_OIDC_POST_URL = "https://meta.graph.meta.com/oidc_callback_uri/";
    public static final String META_WWW_LOGIN_URL = "https://www.meta.com/login/";
    public static final String TAG = "HatchWebSessionProvisioner";
    public static final HatchWebSessionProvisioner INSTANCE = new HatchWebSessionProvisioner();
    public static final C3UX scope = Hxb.A02(AnonymousClass001.A0y());

    @DebugMetadata(c = "com.facebook.aura.webview.auth.HatchWebSessionProvisioner$loadMetaAiAuthenticated$1", f = "HatchWebSessionProvisioner.kt", l = {100, FlipperNoiseReporter.SWITCHING_PROTOCOLS_STATUS_CODE}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.webview.auth.HatchWebSessionProvisioner$loadMetaAiAuthenticated$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ CookieManager $cookieManager;
        public final /* synthetic */ String $token;
        public final /* synthetic */ String $url;
        public final /* synthetic */ String $userAgent;
        public final /* synthetic */ C6t6 $webView;
        public Object L$0;
        public int label;

        /* renamed from: com.facebook.aura.webview.auth.HatchWebSessionProvisioner$loadMetaAiAuthenticated$1$1, reason: invalid class name and collision with other inner class name */
        public final class C04421 extends AbstractC7559F3s implements Function0<Unit> {
            public final /* synthetic */ String $abraSessionCookie;
            public final /* synthetic */ CookieManager $cookieManager;
            public final /* synthetic */ String $fsCookie;
            public final /* synthetic */ String $url;
            public final /* synthetic */ C6t6 $webView;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C04421(String str, String str2, CookieManager cookieManager, C6t6 c6t6, String str3) {
                super(0);
                this.$abraSessionCookie = str;
                this.$fsCookie = str2;
                this.$cookieManager = cookieManager;
                this.$webView = c6t6;
                this.$url = str3;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                String str = this.$abraSessionCookie;
                if (str != null) {
                    this.$cookieManager.setCookie(HatchWebSessionProvisioner.META_AI_COOKIE_URL, str);
                }
                String str2 = this.$fsCookie;
                if (str2 != null) {
                    this.$cookieManager.setCookie(HatchWebSessionProvisioner.AUTH_META_COOKIE_URL, str2);
                }
                if (this.$abraSessionCookie != null || this.$fsCookie != null) {
                    this.$cookieManager.flush();
                }
                this.$webView.loadUrl(this.$url);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            String strA0d;
            String str;
            Object objProvisionAbraSessionCookie = obj;
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                HatchWebSessionProvisioner hatchWebSessionProvisioner = HatchWebSessionProvisioner.INSTANCE;
                String str2 = this.$url;
                String str3 = this.$token;
                String str4 = this.$userAgent;
                this.label = 1;
                objProvisionAbraSessionCookie = hatchWebSessionProvisioner.provisionAbraSessionCookie(str2, str3, str4, this);
                if (objProvisionAbraSessionCookie != enumC10460Hji) {
                }
                return enumC10460Hji;
            }
            if (i != 1) {
                if (i != 2) {
                    throw AnonymousClass001.A0n();
                }
                strA0d = C3cG.A0d(this.L$0, obj);
                str = (String) objProvisionAbraSessionCookie;
                HatchWebSessionProvisioner.INSTANCE.runOnMain(new C04421(strA0d, str, this.$cookieManager, this.$webView, this.$url));
                return Unit.INSTANCE;
            }
            Hwg.A00(obj);
            String str5 = (String) objProvisionAbraSessionCookie;
            if (str5 != null) {
                strA0d = str5;
                str = null;
                HatchWebSessionProvisioner.INSTANCE.runOnMain(new C04421(strA0d, str, this.$cookieManager, this.$webView, this.$url));
                return Unit.INSTANCE;
            }
            HatchWebSessionProvisioner hatchWebSessionProvisioner2 = HatchWebSessionProvisioner.INSTANCE;
            this.L$0 = str5;
            this.label = 2;
            Object objFetchAccountsCenterFsCookie = hatchWebSessionProvisioner2.fetchAccountsCenterFsCookie(this);
            if (objFetchAccountsCenterFsCookie != enumC10460Hji) {
                strA0d = str5;
                objProvisionAbraSessionCookie = objFetchAccountsCenterFsCookie;
                str = (String) objProvisionAbraSessionCookie;
                HatchWebSessionProvisioner.INSTANCE.runOnMain(new C04421(strA0d, str, this.$cookieManager, this.$webView, this.$url));
                return Unit.INSTANCE;
            }
            return enumC10460Hji;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(String str, String str2, String str3, CookieManager cookieManager, C6t6 c6t6, HtJ<? super AnonymousClass1> htJ) {
            super(2, htJ);
            this.$url = str;
            this.$token = str2;
            this.$userAgent = str3;
            this.$cookieManager = cookieManager;
            this.$webView = c6t6;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new AnonymousClass1(this.$url, this.$token, this.$userAgent, this.$cookieManager, this.$webView, htJ);
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ((AnonymousClass1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.webview.auth.HatchWebSessionProvisioner$loadMetaComAuthenticated$1", f = "HatchWebSessionProvisioner.kt", l = {HatchVoiceAnnouncementSheetKt.NUX_FADE_IN_DELAY_MS}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.webview.auth.HatchWebSessionProvisioner$loadMetaComAuthenticated$1, reason: invalid class name and case insensitive filesystem */
    public final class C143621 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ String $url;
        public final /* synthetic */ C6t6 $webView;
        public int label;

        /* renamed from: com.facebook.aura.webview.auth.HatchWebSessionProvisioner$loadMetaComAuthenticated$1$1, reason: invalid class name and collision with other inner class name */
        public final class C04431 extends AbstractC7559F3s implements Function0<Unit> {
            public final /* synthetic */ String $fsCookie;
            public final /* synthetic */ String $url;
            public final /* synthetic */ C6t6 $webView;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C04431(String str, C6t6 c6t6, String str2) {
                super(0);
                this.$url = str;
                this.$webView = c6t6;
                this.$fsCookie = str2;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                String strA0h = C60Q.A0h(this.$url);
                if (strA0h == null) {
                    strA0h = "";
                }
                String strA0g = C60Q.A0g(strA0h);
                String strA0M = (strA0g.equals("meta.com") || strA0g.equals("www.meta.com")) ? FGI.A0M("https://www.meta.com/login/?next=", URLEncoder.encode(this.$url, HatchWebPageParserKt.UTF_8)) : this.$url;
                C6t6 c6t6 = this.$webView;
                C8hx c8hx = new C8hx(2);
                String str = this.$fsCookie;
                c6t6.loadUrlWithCookiesSecure(strA0M, c8hx, str != null ? Collections.singletonList(str) : C0881AGi.A00);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C143621(String str, C6t6 c6t6, HtJ<? super C143621> htJ) {
            super(2, htJ);
            this.$url = str;
            this.$webView = c6t6;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new C143621(this.$url, this.$webView, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                HatchWebSessionProvisioner hatchWebSessionProvisioner = HatchWebSessionProvisioner.INSTANCE;
                this.label = 1;
                obj = hatchWebSessionProvisioner.fetchAccountsCenterFsCookie(this);
                if (obj == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
            }
            HatchWebSessionProvisioner.INSTANCE.runOnMain(new C04431(this.$url, this.$webView, (String) obj));
            return Unit.INSTANCE;
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ((C143621) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.webview.auth.HatchWebSessionProvisioner", f = "HatchWebSessionProvisioner.kt", l = {126, 149}, m = "provisionAbraSessionCookie", v = 2)
    /* renamed from: com.facebook.aura.webview.auth.HatchWebSessionProvisioner$provisionAbraSessionCookie$1, reason: invalid class name and case insensitive filesystem */
    public final class C143631 extends HzP {
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
        public /* synthetic */ Object result;

        public C143631(HtJ<? super C143631> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HatchWebSessionProvisioner.this.provisionAbraSessionCookie(null, null, null, this);
        }
    }

    private final boolean isMetaAiHost(String str) {
        if (!"meta.ai".equals(str)) {
            C7384Etj.A0Y(str, 0);
            if (!str.endsWith(".meta.ai")) {
                return false;
            }
        }
        return true;
    }

    private final boolean isMetaHost(String str) {
        if (!"meta.com".equals(str)) {
            C7384Etj.A0Y(str, 0);
            if (!str.endsWith(".meta.com")) {
                return false;
            }
        }
        return true;
    }

    private final void loadMetaComAuthenticated(C6t6 c6t6, String str) {
        AnonymousClass001.A1J(new C143621(str, c6t6, null), scope);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't wrap try/catch for region: R(21:0|2|(2:4|(1:6)(1:12))(0)|7|(1:70)|(1:(1:(5:68|13|54|(2:58|59)|67)(2:14|15))(2:16|21))(3:17|18|(1:20))|22|71|23|(1:25)|26|29|(1:31)|32|(1:37)(1:36)|(1:39)|(1:44)(1:43)|(1:46)|47|(2:60|61)(6:51|(1:53)|54|(1:56)|58|59)|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00dc, code lost:
    
        r7 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00dd, code lost:
    
        r10 = X.C3cG.A0s(r7);
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0031  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object provisionAbraSessionCookie(java.lang.String r29, java.lang.String r30, java.lang.String r31, X.HtJ<? super java.lang.String> r32) {
        /*
            Method dump skipped, instructions count: 433
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.webview.auth.HatchWebSessionProvisioner.provisionAbraSessionCookie(java.lang.String, java.lang.String, java.lang.String, X.HtJ):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object fetchAccountsCenterFsCookie(HtJ<? super String> htJ) {
        final GBL gblA03 = C7Bm.A03(htJ);
        new C4020Ck2(AuraMetaCookieRequestFactory.INSTANCE.getInstance()).A00(new F2m() { // from class: com.facebook.aura.webview.auth.HatchWebSessionProvisioner$fetchAccountsCenterFsCookie$2$1
            @Override // X.F2m
            public void onFail(Throwable th) {
                CFK.A0K(HatchWebSessionProvisioner.TAG, th, "AccountsCenter fs cookie fetch failed");
                gblA03.resumeWith(null);
            }

            @Override // X.F2m
            public void onSuccess(String str) {
                gblA03.resumeWith(str);
            }
        });
        return gblA03.A0F();
    }

    private final void loadMetaAiAuthenticated(C6t6 c6t6, String str) {
        String metaAccessToken;
        CookieManager cookieManager = CookieManager.getInstance();
        String cookie = cookieManager.getCookie(str);
        if ((cookie != null && C7BY.A0q(cookie, ABRA_SESSION_COOKIE, false)) || (metaAccessToken = AuraMetaFRLSecureTokenStore.INSTANCE.getMetaAccessToken()) == null) {
            c6t6.loadUrl(str);
        } else {
            AnonymousClass001.A1J(new AnonymousClass1(str, metaAccessToken, C60R.A0d(c6t6), cookieManager, c6t6, null), scope);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void runOnMain(final Function0<Unit> function0) {
        C60O.A02().post(new Runnable() { // from class: com.facebook.aura.webview.auth.HatchWebSessionProvisioner.runOnMain.1
            @Override // java.lang.Runnable
            public final void run() {
                function0.invoke();
            }
        });
    }

    public final void load(C6t6 c6t6, String str) {
        AnonymousClass003.A0u(c6t6, str);
        Context context = c6t6.getContext();
        C7384Etj.A0U(context);
        String strLocalizedForDevice = MetaWebUrlLocalizerKt.localizedForDevice(str, context);
        String strA0h = C60Q.A0h(strLocalizedForDevice);
        if (strA0h == null) {
            strA0h = "";
        }
        String strA0g = C60Q.A0g(strA0h);
        AuraDatrDeviceIdentityBridge.INSTANCE.prepare();
        if (AuraMetaFRLSecureTokenStore.INSTANCE.getMetaAccessToken() != null) {
            if (isMetaAiHost(strA0g)) {
                loadMetaAiAuthenticated(c6t6, strLocalizedForDevice);
                return;
            } else if (isMetaHost(strA0g)) {
                loadMetaComAuthenticated(c6t6, strLocalizedForDevice);
                return;
            }
        }
        c6t6.loadUrl(strLocalizedForDevice);
    }
}
