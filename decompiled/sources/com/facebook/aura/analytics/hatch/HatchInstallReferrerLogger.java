package com.facebook.aura.analytics.hatch;

import X.AbstractC0878AGe;
import X.AbstractC0882AGj;
import X.AbstractC7559F3s;
import X.AnonymousClass000;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.BFI;
import X.BV4;
import X.BV5;
import X.BV6;
import X.BWv;
import X.BZJ;
import X.BzK;
import X.C06H;
import X.C3620CZj;
import X.C3cG;
import X.C3cH;
import X.C3cI;
import X.C4oT;
import X.C60N;
import X.C60O;
import X.C7384Etj;
import X.C7526EzK;
import X.C79;
import X.C7BY;
import X.CFK;
import X.CNH;
import X.CNL;
import X.CNO;
import X.CNT;
import X.CYx;
import X.CZ0;
import X.CZ4;
import X.CZ7;
import X.Eu1;
import X.EuG;
import X.F0C;
import X.G0U;
import X.HxE;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import com.facebook.aura.analytics.hatch.HatchInstallReferrerLogger;
import com.facebook.aura.common.identifiers.fdid.AuraFdidStorage;
import com.facebook.aura.common.prefs.AuraDevicePermanentPrefStore;
import com.facebook.aura.common.prefs.AuraDevicePermanentPrefs;
import com.facebook.aura.common.prefs.AuraDevicePrefStore;
import com.facebook.aura.common.prefs.AuraDevicePrefs;
import com.facebook.aura.executors.AuraExecutors;
import com.facebook.aura.opengraph.HatchWebPageParserKt;
import com.facebook.oxygen.sdk.app.installapi.contract.OxInstallSdkException;
import com.facebook.oxygen.sdk.app.installapi.contract.common.ErrorType;
import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import com.google.android.finsky.externalreferrer.IGetInstallReferrerService$Stub$Proxy;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;

/* loaded from: classes5.dex */
public final class HatchInstallReferrerLogger {
    public static final int $stable = 0;
    public static final String KEY_APP_MANAGER_ENTRY_CONTEXT_READ = "hatch_install_referrer_app_manager_entry_context_read";
    public static final String KEY_ERROR_COMMITTED = "hatch_install_referrer_error_committed";
    public static final String KEY_PROCESSED = "hatch_install_referrer_processed";
    public static final String PLAY_STORE_PACKAGE = "com.android.vending";
    public static final String TAG = "HatchInstallReferrerLogger";
    public static final HatchInstallReferrerLogger INSTANCE = new HatchInstallReferrerLogger();
    public static final Set<String> OXYGEN_INSTALLER_PACKAGES = BFI.A0H(new String[]{"com.facebook.appmanager", "com.facebook.appmanager.dev", "com.facebook.system", "com.facebook.system.dev"});
    public static final AtomicBoolean appManagerEntryContextReadStarted = BV4.A12(false);

    public final class PlayResult {
        public final String error;
        public final Long installBeginTimestampSeconds;
        public final String referrer;
        public final Long referrerClickTimestampSeconds;
        public final boolean retryable;

        public PlayResult() {
            this(null, null, null, null, true);
        }

        public final String getError() {
            return this.error;
        }

        public final boolean getHasAnswer() {
            String str = this.referrer;
            return !(str == null || str.length() == 0) || this.error == null;
        }

        public final Long getInstallBeginTimestampSeconds() {
            return this.installBeginTimestampSeconds;
        }

        public final String getReferrer() {
            return this.referrer;
        }

        public final Long getReferrerClickTimestampSeconds() {
            return this.referrerClickTimestampSeconds;
        }

        public final boolean getRetryable() {
            return this.retryable;
        }

        public /* synthetic */ PlayResult(String str, Long l, Long l2, String str2, boolean z, int i, C06H c06h) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : l, (i & 4) != 0 ? null : l2, (i & 8) != 0 ? null : str2, (i & 16) != 0 ? true : z);
        }

        public PlayResult(String str, Long l, Long l2, String str2, boolean z) {
            this.referrer = str;
            this.installBeginTimestampSeconds = l;
            this.referrerClickTimestampSeconds = l2;
            this.error = str2;
            this.retryable = z;
        }
    }

    /* renamed from: com.facebook.aura.analytics.hatch.HatchInstallReferrerLogger$log$1, reason: invalid class name */
    public final class AnonymousClass1 {
        public final /* synthetic */ CZ7 $client;
        public final /* synthetic */ Context $context;
        public final /* synthetic */ AtomicBoolean $responded;

        public void onInstallReferrerServiceDisconnected() {
        }

        public AnonymousClass1(AtomicBoolean atomicBoolean, Context context, CZ7 cz7) {
            this.$responded = atomicBoolean;
            this.$context = context;
            this.$client = cz7;
        }

        public void onInstallReferrerSetupFinished(final int i) {
            if (C3cI.A1W(this.$responded)) {
                Executor executorA06 = F0C.A06(AuraExecutors.backgroundThreadExecutor$delegate);
                final Context context = this.$context;
                final CZ7 cz7 = this.$client;
                executorA06.execute(new Runnable() { // from class: com.facebook.aura.analytics.hatch.HatchInstallReferrerLogger$log$1$onInstallReferrerSetupFinished$1
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // java.lang.Runnable
                    public final void run() throws OxInstallSdkException {
                        int i2;
                        String str;
                        String str2;
                        int i3 = i;
                        if (i3 == 0) {
                            HatchInstallReferrerLogger hatchInstallReferrerLogger = HatchInstallReferrerLogger.INSTANCE;
                            Context context2 = context;
                            CZ7 cz72 = cz7;
                            C7384Etj.A0X(cz72);
                            hatchInstallReferrerLogger.onReferrerResponseOk(context2, cz72);
                            return;
                        }
                        HatchInstallReferrerLogger hatchInstallReferrerLogger2 = HatchInstallReferrerLogger.INSTANCE;
                        CZ7 cz73 = cz7;
                        C7384Etj.A0X(cz73);
                        hatchInstallReferrerLogger2.endConnectionSafely(cz73);
                        Context context3 = context;
                        if (i3 != 2) {
                            i2 = 23;
                            str = null;
                            str2 = "SERVICE_CURRENTLY_UNAVAILABLE";
                        } else {
                            i2 = 7;
                            str = null;
                            str2 = "FEATURE_NOT_SUPPORTED";
                        }
                        hatchInstallReferrerLogger2.logResolvedInstall(context3, new HatchInstallReferrerLogger.PlayResult(str, str, str, str2, AnonymousClass002.A1L(i2 & 16)));
                    }
                });
            }
        }
    }

    /* renamed from: com.facebook.aura.analytics.hatch.HatchInstallReferrerLogger$logResolvedInstall$1, reason: invalid class name and case insensitive filesystem */
    public final class C109071 extends AbstractC7559F3s implements G0U<String, Unit> {
        public final /* synthetic */ Context $context;
        public final /* synthetic */ BWv $installer;
        public final /* synthetic */ PlayResult $play;

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(String str) throws UnsupportedEncodingException {
            String pendingReferrer;
            String str2 = null;
            if (str == null || str.length() == 0) {
                pendingReferrer = HatchDeferredUtmStore.INSTANCE.getPendingReferrer(System.currentTimeMillis());
                if (str == null && pendingReferrer == null) {
                    PlayResult playResult = this.$play;
                    boolean hasAnswer = playResult.getHasAnswer();
                    HatchInstallReferrerLogger hatchInstallReferrerLogger = HatchInstallReferrerLogger.INSTANCE;
                    Context context = this.$context;
                    if (!hasAnswer) {
                        HatchInstallReferrerLogger.logInstall$default(hatchInstallReferrerLogger, context, null, null, null, playResult.error, this.$installer, 14, null);
                        if (this.$play.retryable) {
                            return;
                        }
                        hatchInstallReferrerLogger.markProcessed(this.$context);
                        return;
                    }
                    String str3 = playResult.referrer;
                    if (str3 != null && str3.length() != 0) {
                        str2 = str3;
                    }
                    hatchInstallReferrerLogger.logInstall(context, str2, playResult.installBeginTimestampSeconds, playResult.referrerClickTimestampSeconds, playResult.error, this.$installer);
                    return;
                }
            } else {
                pendingReferrer = str;
            }
            HatchInstallReferrerLogger hatchInstallReferrerLogger2 = HatchInstallReferrerLogger.INSTANCE;
            Context context2 = this.$context;
            BWv bWv = this.$installer;
            if (bWv == null) {
                bWv = BWv.OXYGEN;
            }
            HatchInstallReferrerLogger.logInstall$default(hatchInstallReferrerLogger2, context2, pendingReferrer, null, null, null, bWv, 28, null);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C109071(Context context, BWv bWv, PlayResult playResult) {
            super(1);
            this.$context = context;
            this.$installer = bWv;
            this.$play = playResult;
        }

        @Override // X.G0U
        public /* bridge */ /* synthetic */ Unit invoke(String str) throws UnsupportedEncodingException {
            invoke2(str);
            return Unit.INSTANCE;
        }
    }

    private final String[] parseUtmParams(String str) throws UnsupportedEncodingException {
        Object objDecode;
        HxE hxE;
        if (str == null || str.length() == 0) {
            return new String[4];
        }
        List listA0e = C7BY.A0e(str, "&");
        LinkedHashMap linkedHashMap = new LinkedHashMap(AnonymousClass005.A0C(listA0e));
        Iterator it = listA0e.iterator();
        while (it.hasNext()) {
            List listA0i = C7BY.A0i((String) it.next(), new String[]{InbandTelemetryBweEstimate.KEY_VALUE_SEPARATOR}, 2);
            int size = listA0i.size();
            Object obj = listA0i.get(0);
            if (size == 2) {
                try {
                    objDecode = URLDecoder.decode((String) listA0i.get(1), HatchWebPageParserKt.UTF_8);
                } catch (IllegalArgumentException e) {
                    CFK.A0D(TAG, "Failed to URL-decode referrer param: %s", e, listA0i.get(1));
                    objDecode = listA0i.get(1);
                }
                hxE = new HxE(obj, objDecode);
            } else {
                hxE = new HxE(obj, "");
            }
            linkedHashMap.put(hxE.first, hxE.second);
        }
        return new String[]{BV4.A0h("utm_source", linkedHashMap), BV4.A0h("utm_medium", linkedHashMap), BV4.A0h("utm_campaign", linkedHashMap), BV4.A0h("utm_content", linkedHashMap)};
    }

    private final BWv resolveInstaller(Context context) {
        try {
            PackageManager packageManager = context.getPackageManager();
            String installingPackageName = Build.VERSION.SDK_INT >= 30 ? packageManager.getInstallSourceInfo(context.getPackageName()).getInstallingPackageName() : packageManager.getInstallerPackageName(context.getPackageName());
            if (PLAY_STORE_PACKAGE.equals(installingPackageName)) {
                return BWv.GOOGLE_PLAY;
            }
            if (AbstractC0878AGe.A0k(OXYGEN_INSTALLER_PACKAGES, installingPackageName)) {
                return BWv.OXYGEN;
            }
            return null;
        } catch (Exception e) {
            e.getMessage();
            return null;
        }
    }

    public final void maybeLog(final Context context) {
        C7384Etj.A0Y(context, 0);
        F0C.A06(AuraExecutors.backgroundThreadExecutor$delegate).execute(new Runnable() { // from class: com.facebook.aura.analytics.hatch.HatchInstallReferrerLogger.maybeLog.1
            @Override // java.lang.Runnable
            public final void run() throws OxInstallSdkException, PackageManager.NameNotFoundException {
                HatchDeferredInviteCodeStore.INSTANCE.restorePending(System.currentTimeMillis());
                HatchInstallReferrerLogger hatchInstallReferrerLogger = HatchInstallReferrerLogger.INSTANCE;
                hatchInstallReferrerLogger.maybeCaptureAppManagerEntryContext(context);
                if (HatchInstallReferrerLogger.access$isInstallReferrerProcessed(hatchInstallReferrerLogger, context)) {
                    HatchDeferredUtmStore.INSTANCE.clear();
                } else {
                    hatchInstallReferrerLogger.log(context);
                }
            }
        });
    }

    public static final /* synthetic */ boolean access$isInstallReferrerProcessed(HatchInstallReferrerLogger hatchInstallReferrerLogger, Context context) {
        return hatchInstallReferrerLogger.readFlag(KEY_PROCESSED);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void endConnectionSafely(CZ7 cz7) {
        try {
            CYx cYx = (CYx) cz7;
            cYx.A00 = 3;
            if (cYx.A01 != null) {
                CZ0.A00("Unbinding from service.");
                cYx.A03.unbindService(cYx.A01);
                cYx.A01 = null;
            }
            cYx.A02 = null;
        } catch (Exception e) {
            e.getMessage();
        }
    }

    private final C4oT getPrefs() {
        return AuraDevicePermanentPrefs.INSTANCE.get(AuraDevicePermanentPrefStore.INSTALL_REFERRER);
    }

    private final C4oT getSignOutClearedPrefs() {
        return AuraDevicePrefs.INSTANCE.get(AuraDevicePrefStore.INSTALL_REFERRER);
    }

    private final boolean isInstallReferrerErrorCommitted(Context context) {
        return readFlag(KEY_ERROR_COMMITTED);
    }

    private final boolean isInstallReferrerProcessed(Context context) {
        return readFlag(KEY_PROCESSED);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void log(android.content.Context r19) throws com.facebook.oxygen.sdk.app.installapi.contract.OxInstallSdkException {
        /*
            Method dump skipped, instructions count: 271
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.analytics.hatch.HatchInstallReferrerLogger.log(android.content.Context):void");
    }

    public static /* synthetic */ void logInstall$default(HatchInstallReferrerLogger hatchInstallReferrerLogger, Context context, String str, Long l, Long l2, String str2, BWv bWv, int i, Object obj) throws UnsupportedEncodingException {
        if ((i & 2) != 0) {
            str = null;
        }
        if ((i & 4) != 0) {
            l = null;
        }
        if ((i & 8) != 0) {
            l2 = null;
        }
        if ((i & 16) != 0) {
            str2 = null;
        }
        if ((i & 32) != 0) {
            bWv = null;
        }
        hatchInstallReferrerLogger.logInstall(context, str, l, l2, str2, bWv);
    }

    private final void markErrorCommitted(Context context) {
        C3cI.A1H(BzK.A02(AuraDevicePermanentPrefs.INSTANCE.get(AuraDevicePermanentPrefStore.INSTALL_REFERRER)), KEY_ERROR_COMMITTED);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void markProcessed(Context context) {
        C3cI.A1H(BzK.A02(AuraDevicePermanentPrefs.INSTANCE.get(AuraDevicePermanentPrefStore.INSTALL_REFERRER)), KEY_PROCESSED);
        HatchDeferredUtmStore.INSTANCE.clear();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void maybeCaptureAppManagerEntryContext(Context context) throws OxInstallSdkException, PackageManager.NameNotFoundException {
        if (appManagerEntryContextReadStarted.compareAndSet(false, true)) {
            AuraDevicePermanentPrefs auraDevicePermanentPrefs = AuraDevicePermanentPrefs.INSTANCE;
            AuraDevicePermanentPrefStore auraDevicePermanentPrefStore = AuraDevicePermanentPrefStore.INSTALL_REFERRER;
            if (auraDevicePermanentPrefs.get(auraDevicePermanentPrefStore).getBoolean(KEY_APP_MANAGER_ENTRY_CONTEXT_READ, false)) {
                return;
            }
            BzK bzKA02 = BzK.A02(auraDevicePermanentPrefs.get(auraDevicePermanentPrefStore));
            bzKA02.A0A(KEY_APP_MANAGER_ENTRY_CONTEXT_READ, true);
            bzKA02.A0B(0);
            try {
                Context applicationContext = context.getApplicationContext();
                CNO cno = new CNO() { // from class: com.facebook.aura.analytics.hatch.HatchInstallReferrerLogger.maybeCaptureAppManagerEntryContext.1
                    public void softReport(String str, String str2) {
                    }

                    public void softReport(String str, String str2, Throwable th) {
                    }

                    @Override // X.CNO
                    public void softReport(String str, Throwable th) {
                    }
                };
                if (applicationContext.getPackageName().isEmpty()) {
                    throw new OxInstallSdkException(ErrorType.INTERNAL_UNRECOVERABLE, "packageName cannot be empty");
                }
                CZ4 cz4 = new CZ4();
                PackageManager packageManager = applicationContext.getPackageManager();
                CNT.A00(new CNL() { // from class: com.facebook.aura.analytics.hatch.HatchInstallReferrerLogger.maybeCaptureAppManagerEntryContext.2
                    @Override // X.CNL
                    public void onError(BZJ bzj) {
                        C7384Etj.A0Y(bzj, 0);
                    }

                    @Override // X.CNL
                    public void onReferrerReceived(EuG euG) {
                        C7384Etj.A0Y(euG, 0);
                        HatchDeferredDeeplinkStore hatchDeferredDeeplinkStore = HatchDeferredDeeplinkStore.INSTANCE;
                        String str = euG.A06.A02;
                        hatchDeferredDeeplinkStore.captureFromAppManagerCustomData(str, System.currentTimeMillis());
                        HatchDeferredInviteCodeStore.INSTANCE.captureFromReferrer(str, System.currentTimeMillis());
                    }
                }, new CNH(applicationContext, cz4, cno), packageManager == null ? null : new C3620CZj(applicationContext, packageManager), C79.A01);
            } catch (RuntimeException e) {
                e.getMessage();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onReferrerResponseOk(Context context, CZ7 cz7) throws OxInstallSdkException {
        PlayResult playResult;
        CYx cYx;
        try {
            try {
                cYx = (CYx) cz7;
            } catch (Throwable th) {
                endConnectionSafely(cz7);
                throw th;
            }
        } catch (Exception e) {
            C3cH.A1B("Failed to read Google Play referrer: ", e.getMessage(), TAG, e);
            playResult = new PlayResult(null, null, null, C3cI.A0Y(e), true);
        }
        if (cYx.A00 != 2 || cYx.A02 == null || cYx.A01 == null) {
            throw C3cG.A0Q("Service not connected. Please start a connection before using the service.");
        }
        Bundle bundleA0N = BV6.A0N();
        bundleA0N.putString("package_name", cYx.A03.getPackageName());
        try {
            IGetInstallReferrerService$Stub$Proxy iGetInstallReferrerService$Stub$Proxy = (IGetInstallReferrerService$Stub$Proxy) cYx.A02;
            Parcel parcelObtain = Parcel.obtain();
            Parcel parcelObtain2 = Parcel.obtain();
            try {
                parcelObtain.writeInterfaceToken("com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
                parcelObtain.writeInt(1);
                bundleA0N.writeToParcel(parcelObtain, 0);
                iGetInstallReferrerService$Stub$Proxy.A00.transact(1, parcelObtain, parcelObtain2, 0);
                parcelObtain2.readException();
                Bundle bundle = parcelObtain2.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcelObtain2) : null;
                String string = bundle.getString("install_referrer");
                Long lValueOf = Long.valueOf(bundle.getLong("install_begin_timestamp_seconds"));
                Long lValueOf2 = Long.valueOf(bundle.getLong("referrer_click_timestamp_seconds"));
                if (string != null && string.length() != 0) {
                    HatchDeferredDeeplinkStore.INSTANCE.captureFromReferrer(string, System.currentTimeMillis());
                    HatchDeferredInviteCodeStore.INSTANCE.captureFromReferrer(string, System.currentTimeMillis());
                }
                HatchDeferredInviteCodeStore hatchDeferredInviteCodeStore = HatchDeferredInviteCodeStore.INSTANCE;
                HatchInstallReferrerParams hatchInstallReferrerParams = HatchInstallReferrerParams.INSTANCE;
                playResult = new PlayResult(hatchInstallReferrerParams.without(hatchInstallReferrerParams.without(string, C60N.A00(77)), AnonymousClass000.A00(30)), lValueOf, lValueOf2, null, false);
                endConnectionSafely(cz7);
                logResolvedInstall(context, playResult);
            } finally {
                parcelObtain2.recycle();
                parcelObtain.recycle();
            }
        } catch (RemoteException e2) {
            BV5.A1J("InstallReferrerClient", "RemoteException getting install referrer information");
            cYx.A00 = 0;
            throw e2;
        }
    }

    private final boolean readFlag(String str) {
        C4oT c4oT = AuraDevicePermanentPrefs.INSTANCE.get(AuraDevicePermanentPrefStore.INSTALL_REFERRER);
        if (!c4oT.getBoolean(str, false)) {
            if (!AuraDevicePrefs.INSTANCE.get(AuraDevicePrefStore.INSTALL_REFERRER).getBoolean(str, false)) {
                return false;
            }
            BzK bzKA02 = BzK.A02(c4oT);
            bzKA02.A0A(str, true);
            bzKA02.apply();
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String buildAppManagerReferrer(EuG euG) {
        ArrayList arrayListA0h = C3cG.A0h();
        try {
            HatchInstallReferrerParams hatchInstallReferrerParams = HatchInstallReferrerParams.INSTANCE;
            AbstractC0882AGj.A0r(hatchInstallReferrerParams.utmParams(euG.A06), arrayListA0h);
            String strEncodedParam = hatchInstallReferrerParams.encodedParam("installation_method_type", euG.A07);
            if (strEncodedParam != null) {
                arrayListA0h.add(strEncodedParam);
            }
            String strEncodedParam2 = hatchInstallReferrerParams.encodedParam("installation_uuid", euG.A01);
            if (strEncodedParam2 != null) {
                arrayListA0h.add(strEncodedParam2);
            }
        } catch (RuntimeException e) {
            e.getMessage();
        }
        return C3cH.A0e("&", arrayListA0h);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void logInstall(Context context, String str, Long l, Long l2, String str2, BWv bWv) throws UnsupportedEncodingException {
        Eu1 eu1AcquireEvent = C3cH.A0I().acquireEvent("hatch_install_events", C7526EzK.A02);
        if (!readFlag(KEY_ERROR_COMMITTED) || str2 == null) {
            if (eu1AcquireEvent.isSampled()) {
                String strA0f = BV4.A0f();
                String[] utmParams = parseUtmParams(str);
                eu1AcquireEvent.A3y("app_scoped_device_id", strA0f);
                eu1AcquireEvent.A3y(AuraFdidStorage.KEY_ID, strA0f);
                eu1AcquireEvent.A3y("referrer", str);
                eu1AcquireEvent.A3y("error", str2);
                eu1AcquireEvent.A3f("referrer_click_timestamp_seconds", l2);
                eu1AcquireEvent.A3f("install_begin_click_timestamp_seconds", l);
                eu1AcquireEvent.A3y("utm_source", utmParams[0]);
                eu1AcquireEvent.A3y("utm_medium", utmParams[1]);
                eu1AcquireEvent.A3y("utm_campaign", utmParams[2]);
                eu1AcquireEvent.A3y("utm_content", utmParams[3]);
                eu1AcquireEvent.A3V(bWv, "installer");
                eu1AcquireEvent.APu();
            }
            if (str2 == null) {
                markProcessed(context);
                return;
            }
        }
        INSTANCE.markErrorCommitted(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void logResolvedInstall(Context context, PlayResult playResult) throws OxInstallSdkException {
        queryAppManagerReferrer(context, new C109071(context, resolveInstaller(context), playResult));
    }

    private final void queryAppManagerReferrer(Context context, G0U<? super String, Unit> g0u) throws OxInstallSdkException {
        final HatchInstallReferrerLogger$queryAppManagerReferrer$deliver$1 hatchInstallReferrerLogger$queryAppManagerReferrer$deliver$1 = new HatchInstallReferrerLogger$queryAppManagerReferrer$deliver$1(C60O.A1E(), g0u);
        try {
            CNO cno = new CNO() { // from class: com.facebook.aura.analytics.hatch.HatchInstallReferrerLogger.queryAppManagerReferrer.1
                @Override // X.CNO
                public void softReport(String str, Throwable th) {
                    AnonymousClass003.A0u(str, th);
                    th.getMessage();
                }

                public void softReport(String str, String str2, Throwable th) {
                    AnonymousClass003.A0u(str, str2);
                }

                public void softReport(String str, String str2) {
                    AnonymousClass003.A0u(str, str2);
                }
            };
            if (context.getPackageName().isEmpty()) {
                throw new OxInstallSdkException(ErrorType.INTERNAL_UNRECOVERABLE, "packageName cannot be empty");
            }
            CZ4 cz4 = new CZ4();
            PackageManager packageManager = context.getPackageManager();
            CNT.A00(new CNL() { // from class: com.facebook.aura.analytics.hatch.HatchInstallReferrerLogger.queryAppManagerReferrer.2
                @Override // X.CNL
                public void onError(BZJ bzj) {
                    C7384Etj.A0Y(bzj, 0);
                    hatchInstallReferrerLogger$queryAppManagerReferrer$deliver$1.invoke(null);
                }

                @Override // X.CNL
                public void onReferrerReceived(EuG euG) {
                    C7384Etj.A0Y(euG, 0);
                    hatchInstallReferrerLogger$queryAppManagerReferrer$deliver$1.invoke(HatchInstallReferrerLogger.INSTANCE.buildAppManagerReferrer(euG));
                }
            }, new CNH(context, cz4, cno), packageManager == null ? null : new C3620CZj(context, packageManager), C79.A00);
        } catch (OxInstallSdkException | Exception e) {
            e.getMessage();
            hatchInstallReferrerLogger$queryAppManagerReferrer$deliver$1.invoke2((String) null);
        }
    }
}
