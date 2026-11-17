package com.facebook.aura.accountcenter;

import X.AbstractC0875AGb;
import X.AbstractC7349EnM;
import X.AbstractC7559F3s;
import X.AbstractC8082FSn;
import X.AbstractC8276Fb0;
import X.AnonymousClass002;
import X.AnonymousClass004;
import X.BAC;
import X.BV3;
import X.C05716xA;
import X.C06H;
import X.C3cG;
import X.C60O;
import X.C60P;
import X.C60Q;
import X.C60R;
import X.C6t6;
import X.C6x7;
import X.C6xD;
import X.C6xU;
import X.C7357EnU;
import X.C7384Etj;
import X.C77m;
import X.C8345FcJ;
import X.C8497Ff4;
import X.CFK;
import X.Ck3;
import X.EnumC061973t;
import X.Ey9;
import X.F23;
import X.F2m;
import X.FGI;
import X.FPU;
import X.G0U;
import X.G0W;
import X.InterfaceC062373z;
import X.InterfaceC7359EnW;
import android.R;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.AndroidRuntimeException;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.widget.LinearLayout;
import androidx.appcompat.widget.Toolbar;
import com.facebook.aura.bloks.storage.AuraMetaFRLSecureTokenStore;
import com.facebook.aura.identity.datr.AuraDatrDeviceIdentityBridge;
import com.facebook.aura.mobileconfig.AuraMobileConfigDelegatesKt;
import com.facebook.aura.perf.HatchQplLogger;
import com.facebook.aura.toast.api.ToastApi;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import libraries.fxmetalogin.accountscenter.WebViewAccountsCenterBaseActivity;

/* loaded from: classes3.dex */
public class AuraAccountsCenterActivity extends WebViewAccountsCenterBaseActivity {
    public static final String KEY_ACCOUNT_ID = "account_id";
    public static final String KEY_MEASUREMENT_GENERATION = "hatch_ac_measurement_generation";
    public static final String KEY_PAGE = "page";
    public static final int LOAD_MARKER = 857804423;
    public static final String NATIVE_PAGE_FINISHED = "native_page_finished";
    public static final String TAG = "AuraAccountsCenterActivity";
    public final Ck3 authenticatedRequestFactory;
    public final F23 externalDomains$delegate;
    public final String initialCredentialFingerprint;
    public final boolean initialCredentialStable;
    public boolean initialLoadObservationStopped;
    public final String metaToken;
    public final G0U<String, Boolean> shouldInterceptURL;
    public Toolbar toolbar;
    public static final /* synthetic */ InterfaceC7359EnW<Object>[] $$delegatedProperties = {new C7357EnU(AbstractC7349EnM.NO_RECEIVER, AuraAccountsCenterActivity.class, "externalDomains", "getExternalDomains()Ljava/util/List;", 0)};
    public static final Companion Companion = new Companion();
    public static final AtomicLong measurementLaunchGeneration = new AtomicLong();
    public final Set<String> recordedInitialLoadPhases = C3cG.A0k();
    public final InterfaceC062373z initialLoadPhaseObserver = new InterfaceC062373z() { // from class: com.facebook.aura.accountcenter.AuraAccountsCenterActivity$initialLoadPhaseObserver$1
        @Override // X.InterfaceC062373z
        public final void onPhase(EnumC061973t enumC061973t, long j) {
            HatchQplLogger hatchQplLogger;
            String str;
            C7384Etj.A0Y(enumC061973t, 0);
            if (this.this$0.recordInitialLoadPhase(enumC061973t.pointName, j)) {
                int iOrdinal = enumC061973t.ordinal();
                if (iOrdinal == 4) {
                    HatchQplLogger.INSTANCE.markerAnnotate(857804423, "hatch_ac_cookie_received", true, 0);
                    return;
                }
                if (iOrdinal == 5) {
                    hatchQplLogger = HatchQplLogger.INSTANCE;
                    str = "hatch_ac_cookie_exchange_failed";
                } else if (iOrdinal == 6) {
                    hatchQplLogger = HatchQplLogger.INSTANCE;
                    str = "hatch_ac_cookie_exchange_empty";
                } else {
                    if (iOrdinal != 7) {
                        return;
                    }
                    hatchQplLogger = HatchQplLogger.INSTANCE;
                    str = "hatch_ac_cookie_exchange_skipped";
                }
                hatchQplLogger.markerAnnotate(857804423, str, true, 0);
                hatchQplLogger.markerAnnotate(857804423, "hatch_ac_cookie_received", false, 0);
            }
        }

        public abstract /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[EnumC061973t.values().length];
                try {
                    iArr[4] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[5] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[6] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[7] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }
    };
    public final String frlAppId = BV3.A00(6);

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public final class Page {
        public static final /* synthetic */ Ey9 $ENTRIES;
        public static final /* synthetic */ Page[] $VALUES;
        public static final Page META_ACCOUNT_SSO;
        public static final Page PROFILES;
        public final String value;

        static {
            Page page = new Page("META_ACCOUNT_SSO", 0, "meta_account_sso");
            META_ACCOUNT_SSO = page;
            Page page2 = new Page("PROFILES", 1, "profiles");
            PROFILES = page2;
            Page[] pageArr = {page, page2};
            $VALUES = pageArr;
            $ENTRIES = C3cG.A0w(pageArr);
        }

        public static Ey9<Page> getEntries() {
            return $ENTRIES;
        }

        public static Page valueOf(String str) {
            return (Page) Enum.valueOf(Page.class, str);
        }

        public static Page[] values() {
            return (Page[]) $VALUES.clone();
        }

        public final String getValue() {
            return this.value;
        }

        public Page(String str, int i, String str2) {
            this.value = str2;
        }
    }

    /* renamed from: com.facebook.aura.accountcenter.AuraAccountsCenterActivity$fetchMetaSessionCookie$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0W<Long, String, Throwable, Unit> {
        public final /* synthetic */ F2m $callback;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(F2m f2m) {
            super(3);
            this.$callback = f2m;
        }

        public final void invoke(final long j, String str, Throwable th) {
            final AuraAccountsCenterActivity auraAccountsCenterActivity = AuraAccountsCenterActivity.this;
            auraAccountsCenterActivity.runOnUiThread(new Runnable() { // from class: com.facebook.aura.accountcenter.AuraAccountsCenterActivity.fetchMetaSessionCookie.1.1
                @Override // java.lang.Runnable
                public final void run() {
                    auraAccountsCenterActivity.recordInitialLoadPhase("session_cookie_exchange_started_at_tap", j);
                }
            });
            F2m f2m = this.$callback;
            if (th != null) {
                f2m.onFail(th);
            } else {
                f2m.onSuccess(str);
            }
        }

        @Override // X.G0W
        public /* bridge */ /* synthetic */ Unit invoke(Long l, String str, Throwable th) {
            invoke(C3cG.A05(l), str, th);
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.accountcenter.AuraAccountsCenterActivity$fetchMetaSessionCookie$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements Function0<Unit> {
        public final /* synthetic */ F2m $callback;
        public final /* synthetic */ boolean $isInitialLoad;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(boolean z, F2m f2m) {
            super(0);
            this.$isInitialLoad = z;
            this.$callback = f2m;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            AuraAccountsCenterActivity.super.fetchMetaSessionCookie(this.$isInitialLoad, this.$callback);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.accountcenter.AuraAccountsCenterActivity$onCreate$1, reason: invalid class name and case insensitive filesystem */
    public final class C106591 extends AbstractC7559F3s implements G0U<Throwable, Throwable> {
        public static final C106591 INSTANCE = new C106591();

        public C106591() {
            super(1);
        }

        @Override // X.G0U
        public /* bridge */ /* synthetic */ Throwable invoke(Throwable th) {
            Throwable th2 = th;
            C7384Etj.A0Y(th2, 0);
            return th2.getCause();
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Throwable invoke2(Throwable th) {
            C7384Etj.A0Y(th, 0);
            return th.getCause();
        }
    }

    @Override // libraries.fxmetalogin.accountscenter.WebViewAccountsCenterBaseActivity
    public void additionalWebViewSetup(C6t6 c6t6) {
        C7384Etj.A0Y(c6t6, 0);
        recordInitialLoadPhase("device_cookie_prepare_start", System.nanoTime());
        try {
            AuraDatrDeviceIdentityBridge.INSTANCE.prepare();
            recordInitialLoadPhase("device_cookie_prepare_end", System.nanoTime());
            if (C6xU.A00("WEB_AUTHENTICATION")) {
                WebSettings settings = c6t6.getSettings();
                if (!C6xU.A16.A01()) {
                    throw C60Q.A0q();
                }
                C6x7 c6x7A00 = C6xD.A00(settings);
                if (c6x7A00 instanceof C05716xA) {
                    return;
                }
                c6x7A00.A00.setWebauthnSupport(1);
            }
        } catch (Throwable th) {
            recordInitialLoadPhase("device_cookie_prepare_end", System.nanoTime());
            throw th;
        }
    }

    @Override // libraries.fxmetalogin.accountscenter.WebViewAccountsCenterBaseActivity
    public void fetchMetaSessionCookie(boolean z, F2m f2m) {
        C7384Etj.A0Y(f2m, 1);
        if (z && AuraAccountsCenterCookieExchange.INSTANCE.join(getIntent().getLongExtra(KEY_MEASUREMENT_GENERATION, 0L), this.initialCredentialFingerprint, new AnonymousClass1(f2m), new AnonymousClass2(z, f2m))) {
            return;
        }
        super.fetchMetaSessionCookie(z, f2m);
    }

    @Override // libraries.fxmetalogin.accountscenter.WebViewAccountsCenterBaseActivity
    public String getUserAgent(C6t6 c6t6) {
        C7384Etj.A0Y(c6t6, 0);
        return C60R.A0d(c6t6);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStop() {
        this.initialLoadObservationStopped = true;
        super.onStop();
    }

    @Override // libraries.fxmetalogin.accountscenter.WebViewAccountsCenterBaseActivity
    public void setExternalDomains(List<String> list) {
        C7384Etj.A0Y(list, 0);
    }

    private final void endLoadMarker() {
        short s;
        HatchQplLogger hatchQplLogger = HatchQplLogger.INSTANCE;
        if (C60O.A0g().isMarkerOn(857804423, 0)) {
            String url = getWebView().getUrl();
            if (url == null) {
                url = "";
            }
            String strA0h = C60Q.A0h(url);
            if (strA0h == null || !strA0h.equals(C60Q.A0h(AuraAccountsCenterActivityKt.sandboxAccountsCenterUrl(getAccountsCenterUrl())))) {
                hatchQplLogger.markerAnnotate(857804423, "fail_reason", "redirected_off_accounts_center", 0);
                s = 3;
            } else {
                s = 2;
            }
            hatchQplLogger.markerEnd(857804423, s, 0);
        }
    }

    public static /* synthetic */ boolean recordInitialLoadPhase$default(AuraAccountsCenterActivity auraAccountsCenterActivity, String str, long j, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: recordInitialLoadPhase");
        }
        if ((i & 2) != 0) {
            j = System.nanoTime();
        }
        return auraAccountsCenterActivity.recordInitialLoadPhase(str, j);
    }

    @Override // libraries.fxmetalogin.accountscenter.WebViewAccountsCenterBaseActivity
    public Ck3 getAuthenticatedRequestFactory() {
        return this.authenticatedRequestFactory;
    }

    @Override // libraries.fxmetalogin.accountscenter.WebViewAccountsCenterBaseActivity
    public List<String> getExternalDomains() {
        return (List) ((AuraMobileConfigDelegatesKt.C127031) this.externalDomains$delegate).$compute.invoke();
    }

    @Override // libraries.fxmetalogin.accountscenter.WebViewAccountsCenterBaseActivity
    public String getFrlAppId() {
        return this.frlAppId;
    }

    @Override // libraries.fxmetalogin.accountscenter.WebViewAccountsCenterBaseActivity
    public InterfaceC062373z getInitialLoadPhaseObserver() {
        return this.initialLoadPhaseObserver;
    }

    @Override // libraries.fxmetalogin.accountscenter.WebViewAccountsCenterBaseActivity
    public String getMetaToken() {
        return this.metaToken;
    }

    @Override // libraries.fxmetalogin.accountscenter.WebViewAccountsCenterBaseActivity
    public G0U<String, Boolean> getShouldInterceptURL() {
        return this.shouldInterceptURL;
    }

    @Override // libraries.fxmetalogin.accountscenter.WebViewAccountsCenterBaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        HatchQplLogger hatchQplLogger = HatchQplLogger.INSTANCE;
        if (C60O.A0g().isMarkerOn(857804423, 0)) {
            hatchQplLogger.markerEnd(857804423, (short) 4, 0);
        }
        super.onDestroy();
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // libraries.fxmetalogin.accountscenter.WebViewAccountsCenterBaseActivity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onWebViewPageFinished() {
        /*
            r3 = this;
            java.lang.String r2 = "native_page_finished"
            long r0 = java.lang.System.nanoTime()
            r3.recordInitialLoadPhase(r2, r0)
            r3.endLoadMarker()
            androidx.appcompat.widget.Toolbar r2 = r3.toolbar
            if (r2 == 0) goto L2c
            com.facebook.aura.utils.MetaAccountEntrypoint r1 = com.facebook.aura.utils.MetaAccountEntrypoint.INSTANCE
            boolean r0 = r1.getCanSeeNewEntrypoint()
            if (r0 == 0) goto L22
            java.lang.String r1 = r1.getTitle()
            boolean r0 = X.C7BY.A0j(r1)
            if (r0 == 0) goto L29
        L22:
            r0 = 2131886469(0x7f120185, float:1.9407518E38)
            java.lang.String r1 = r3.getString(r0)
        L29:
            r2.setTitle(r1)
        L2c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.accountcenter.AuraAccountsCenterActivity.onWebViewPageFinished():void");
    }

    @Override // libraries.fxmetalogin.accountscenter.WebViewAccountsCenterBaseActivity
    public void onWebViewPageStarted() {
        recordInitialLoadPhase("navigation_committed", System.nanoTime());
    }

    public final class Companion {
        public final void launchFromSettings(Context context) {
            C7384Etj.A0Y(context, 0);
            AuraAccountsCenterLoadLogger.INSTANCE.startSettingsLoad();
            long jIncrementAndGet = AuraAccountsCenterActivity.measurementLaunchGeneration.incrementAndGet();
            AuraAccountsCenterCookieExchange.INSTANCE.start(jIncrementAndGet);
            Intent intentPutExtra = new Intent(context, (Class<?>) AuraAccountsCenterActivity.class).putExtra(AuraAccountsCenterActivity.KEY_MEASUREMENT_GENERATION, jIncrementAndGet);
            C7384Etj.A0U(intentPutExtra);
            C77m.A00(context, intentPutExtra);
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public AuraAccountsCenterActivity() {
        AuraMetaFRLSecureTokenStore auraMetaFRLSecureTokenStore = AuraMetaFRLSecureTokenStore.INSTANCE;
        String strFrlFingerprint = auraMetaFRLSecureTokenStore.frlFingerprint();
        this.initialCredentialFingerprint = strFrlFingerprint;
        this.metaToken = auraMetaFRLSecureTokenStore.getMetaAccessToken();
        this.initialCredentialStable = C7384Etj.areEqual(strFrlFingerprint, auraMetaFRLSecureTokenStore.frlFingerprint());
        this.authenticatedRequestFactory = AuraMetaCookieRequestFactory.INSTANCE.getInstance();
        this.externalDomains$delegate = AuraMobileConfigDelegatesKt.auraMobileConfigVar(AuraAccountsCenterActivity$externalDomains$2.INSTANCE);
    }

    private final void applyEdgeToEdge() {
        getWindow().setBackgroundDrawable(new ColorDrawable(C60P.A00(this) == 32 ? -16777216 : -657931));
    }

    private final String getAccountsCenterUrl() {
        String stringExtra = getIntent().getStringExtra("page");
        if (stringExtra == null) {
            stringExtra = "";
        }
        if (!stringExtra.equals(Page.META_ACCOUNT_SSO.getValue())) {
            return stringExtra.equals(Page.PROFILES.getValue()) ? AuraAccountsCenterActivityKt.getProfilesUrl() : AuraAccountsCenterActivityKt.getAccountsCenterUrl();
        }
        String stringExtra2 = getIntent().getStringExtra("account_id");
        return FGI.A0M(AuraAccountsCenterActivityKt.getSsoUrl(), stringExtra2 != null ? stringExtra2 : "");
    }

    private final boolean isCurrentMeasurementLaunch() {
        long longExtra = getIntent().getLongExtra(KEY_MEASUREMENT_GENERATION, 0L);
        return longExtra != 0 && longExtra == measurementLaunchGeneration.get();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean recordInitialLoadPhase(String str, long j) {
        if (!isFinishing() && !isDestroyed() && !this.initialLoadObservationStopped && isCurrentMeasurementLaunch() && !this.recordedInitialLoadPhases.contains(NATIVE_PAGE_FINISHED)) {
            HatchQplLogger hatchQplLogger = HatchQplLogger.INSTANCE;
            if (C60O.A0g().isMarkerOn(857804423, 0) && this.initialCredentialStable && C7384Etj.areEqual(this.initialCredentialFingerprint, AuraMetaFRLSecureTokenStore.INSTANCE.frlFingerprint()) && this.recordedInitialLoadPhases.add(str)) {
                if (C7384Etj.areEqual(str, EnumC061973t.A0B.pointName)) {
                    hatchQplLogger.markerAnnotate(857804423, "hatch_ac_measurement_version", 1, 0);
                    hatchQplLogger.markerAnnotate(857804423, "hatch_ac_phase_scope", "initial_controller_load", 0);
                }
                hatchQplLogger.markerPoint(857804423, str, 0, j);
                return true;
            }
        }
        return false;
    }

    private final void setupToolbar() {
        boolean zA1Q = AnonymousClass002.A1Q(C60P.A00(this), 32);
        int i = zA1Q ? -16777216 : -657931;
        int i2 = zA1Q ? -1 : -16777216;
        View viewFindViewById = findViewById(R.id.content);
        C7384Etj.A0U(viewFindViewById);
        ViewGroup viewGroup = (ViewGroup) viewFindViewById;
        View childAt = viewGroup.getChildAt(0);
        viewGroup.removeView(childAt);
        final Toolbar toolbar = new Toolbar(this);
        toolbar.setBackgroundColor(i);
        toolbar.setNavigationIcon(com.facebook.aura.R.drawable.aura_nav_close_20);
        toolbar.setNavigationContentDescription(getString(com.facebook.aura.R.string._name_removed__res_0x7f1206ed));
        toolbar.setNavigationOnClickListener(new View.OnClickListener() { // from class: com.facebook.aura.accountcenter.AuraAccountsCenterActivity$setupToolbar$toolbar$1$1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.this$0.onSupportNavigateUp();
            }
        });
        toolbar.setTitle(getString(com.facebook.aura.R.string._name_removed__res_0x7f120184));
        toolbar.setTitleTextColor(i2);
        Drawable navigationIcon = toolbar.getNavigationIcon();
        if (navigationIcon != null) {
            navigationIcon.setTint(i2);
        }
        this.toolbar = toolbar;
        LinearLayout linearLayout = new LinearLayout(this);
        linearLayout.setOrientation(1);
        linearLayout.addView(toolbar, new LinearLayout.LayoutParams(-1, -2));
        linearLayout.addView(childAt, new LinearLayout.LayoutParams(-1, 0, 1.0f));
        viewGroup.addView(linearLayout, new ViewGroup.LayoutParams(-1, -1));
        AbstractC8082FSn.A00(linearLayout, new FPU() { // from class: com.facebook.aura.accountcenter.AuraAccountsCenterActivity.setupToolbar.1
            @Override // X.FPU
            public final C8497Ff4 onApplyWindowInsets(View view, C8497Ff4 c8497Ff4) {
                boolean zA1b = AnonymousClass004.A1b(view, c8497Ff4);
                C8345FcJ c8345FcJA04 = c8497Ff4.A00.A04(655);
                C7384Etj.A0U(c8345FcJA04);
                Toolbar toolbar2 = toolbar;
                toolbar2.setPadding(toolbar2.getPaddingLeft(), c8345FcJA04.A03, toolbar.getPaddingRight(), toolbar.getPaddingBottom());
                view.setPadding(c8345FcJA04.A01, zA1b ? 1 : 0, c8345FcJA04.A02, c8345FcJA04.A00);
                return C8497Ff4.A01;
            }
        });
    }

    @Override // libraries.fxmetalogin.accountscenter.WebViewAccountsCenterBaseActivity
    public String getAuthUrls() {
        return FGI.A0U(AuraAccountsCenterActivityKt.getAuthUrlsBase(), ",", AuraAccountsCenterActivityKt.getExtraAuthUrls());
    }

    @Override // libraries.fxmetalogin.accountscenter.WebViewAccountsCenterBaseActivity
    public String getWebViewEndpoint() {
        return AuraAccountsCenterActivityKt.sandboxAccountsCenterUrl(getAccountsCenterUrl());
    }

    @Override // libraries.fxmetalogin.accountscenter.WebViewAccountsCenterBaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        BAC.A00(this);
        try {
            super.onCreate(bundle);
            AbstractC8276Fb0 supportActionBar = getSupportActionBar();
            if (supportActionBar != null) {
                supportActionBar.A03();
            }
            setupToolbar();
            applyEdgeToEdge();
        } catch (RuntimeException e) {
            Iterator it = AbstractC0875AGb.A0B(e, C106591.INSTANCE).iterator();
            while (it.hasNext()) {
                if (it.next() instanceof AndroidRuntimeException) {
                    CFK.A0A(TAG, "WebView provider unavailable", e);
                    ToastApi.INSTANCE.showToast(com.facebook.aura.R.string._name_removed__res_0x7f120186);
                    finish();
                    return;
                }
            }
            throw e;
        }
    }
}
