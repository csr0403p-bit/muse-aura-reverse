package com.facebook.aura.partners.accountlinking.nativeauthlogging;

import X.AbstractC0878AGe;
import X.AbstractC3358CGz;
import X.AbstractC7559F3s;
import X.AnonymousClass003;
import X.BV5;
import X.BzK;
import X.C0881AGi;
import X.C4JM;
import X.C4oT;
import X.C7384Etj;
import X.C79;
import X.C7yC;
import X.CFK;
import X.EPC;
import X.EPL;
import X.EPM;
import X.EPP;
import X.EPY;
import X.F1d;
import X.F1w;
import X.F3R;
import X.FGI;
import X.HtJ;
import X.HzP;
import android.content.Context;
import com.facebook.aura.analytics.accesslibrary.AuraAccessLibraryLogger;
import com.facebook.aura.auth.store.AuraUserSessionStore;
import com.facebook.aura.common.prefs.AuraDevicePrefStore;
import com.facebook.aura.common.prefs.AuraDevicePrefs;
import com.facebook.aura.confidentialvm.session.ConfidentialSessionGate;
import com.facebook.aura.executors.AuraExecutors;
import com.facebook.aura.lifecycle.AppBackgroundedListener;
import com.facebook.aura.network.stefi.AuraStefiClient;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;

/* loaded from: classes5.dex */
public final class MAHatchNativeAuthAppStartLogger implements AppBackgroundedListener {
    public static final MAHatchNativeAuthAppStartLogger INSTANCE = new MAHatchNativeAuthAppStartLogger();

    @DebugMetadata(c = "com.facebook.aura.partners.accountlinking.nativeauthlogging.MAHatchNativeAuthAppStartLogger", f = "MAHatchNativeAuthAppStartLogger.kt", l = {201}, m = "fetchAccounts", v = 2)
    /* renamed from: com.facebook.aura.partners.accountlinking.nativeauthlogging.MAHatchNativeAuthAppStartLogger$fetchAccounts$1, reason: invalid class name */
    public final class AnonymousClass1 extends HzP {
        public Object L$0;
        public int label;
        public /* synthetic */ Object result;

        public AnonymousClass1(HtJ<? super AnonymousClass1> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return MAHatchNativeAuthAppStartLogger.this.fetchAccounts(null, this);
        }
    }

    /* renamed from: com.facebook.aura.partners.accountlinking.nativeauthlogging.MAHatchNativeAuthAppStartLogger$fetchLegacyThreadsItems$1, reason: invalid class name and case insensitive filesystem */
    public final class C130371 extends AbstractC7559F3s implements Function0<List<? extends EPY>> {
        public final /* synthetic */ Context $context;
        public final /* synthetic */ EPC $repository;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C130371(EPC epc, Context context) {
            super(0);
            this.$repository = epc;
            this.$context = context;
        }

        @Override // kotlin.jvm.functions.Function0
        public final List<? extends EPY> invoke() {
            EPC epc = this.$repository;
            Context context = this.$context;
            EPL epl = EPL.A0M;
            return epc.A09(context, C7384Etj.A0H(context), MAHatchNativeAuthAppStartLoggerKt.LOG_LOCATION, EPM.A0M, epl);
        }
    }

    /* renamed from: com.facebook.aura.partners.accountlinking.nativeauthlogging.MAHatchNativeAuthAppStartLogger$fetchLegacyThreadsItems$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements Function0<List<? extends EPY>> {
        public final /* synthetic */ Context $context;
        public final /* synthetic */ EPC $repository;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(EPC epc, Context context) {
            super(0);
            this.$repository = epc;
            this.$context = context;
        }

        @Override // kotlin.jvm.functions.Function0
        public final List<? extends EPY> invoke() {
            EPC epc = this.$repository;
            Context context = this.$context;
            EPL epl = EPL.A0M;
            return epc.A0B(context, C7384Etj.A0H(context), MAHatchNativeAuthAppStartLoggerKt.LOG_LOCATION, EPM.A0M, epl);
        }
    }

    /* renamed from: com.facebook.aura.partners.accountlinking.nativeauthlogging.MAHatchNativeAuthAppStartLogger$fetchLegacyThreadsItems$3, reason: invalid class name */
    public final class AnonymousClass3 extends AbstractC7559F3s implements Function0<List<? extends EPY>> {
        public final /* synthetic */ Context $context;
        public final /* synthetic */ EPC $repository;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(EPC epc, Context context) {
            super(0);
            this.$repository = epc;
            this.$context = context;
        }

        @Override // kotlin.jvm.functions.Function0
        public final List<? extends EPY> invoke() {
            EPC epc = this.$repository;
            Context context = this.$context;
            EPL epl = EPL.A0M;
            return epc.A0C(context, C7384Etj.A0H(context), MAHatchNativeAuthAppStartLoggerKt.LOG_LOCATION, EPM.A0M, epl);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.partners.accountlinking.nativeauthlogging.MAHatchNativeAuthAppStartLogger", f = "MAHatchNativeAuthAppStartLogger.kt", l = {214}, m = "fetchV2Items", v = 2)
    /* renamed from: com.facebook.aura.partners.accountlinking.nativeauthlogging.MAHatchNativeAuthAppStartLogger$fetchV2Items$1, reason: invalid class name and case insensitive filesystem */
    public final class C130381 extends HzP {
        public Object L$0;
        public int label;
        public /* synthetic */ Object result;

        public C130381(HtJ<? super C130381> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return MAHatchNativeAuthAppStartLogger.this.fetchV2Items(null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0052, code lost:
    
        if (r3 == r2) goto L21;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00c3 A[LOOP:2: B:35:0x00bd->B:37:0x00c3, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00cd  */
    /* JADX WARN: Type inference failed for: r2v0, types: [X.Hji] */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object fetchAccounts(android.content.Context r6, X.HtJ<? super java.util.List<com.facebook.aura.partners.accountlinking.nativeauthlogging.NativeAuthAccountJson>> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof com.facebook.aura.partners.accountlinking.nativeauthlogging.MAHatchNativeAuthAppStartLogger.AnonymousClass1
            if (r0 == 0) goto Lcd
            r4 = r7
            com.facebook.aura.partners.accountlinking.nativeauthlogging.MAHatchNativeAuthAppStartLogger$fetchAccounts$1 r4 = (com.facebook.aura.partners.accountlinking.nativeauthlogging.MAHatchNativeAuthAppStartLogger.AnonymousClass1) r4
            int r2 = r4.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto Lcd
            int r2 = r2 - r1
            r4.label = r2
        L12:
            java.lang.Object r3 = r4.result
            X.Hji r2 = X.EnumC10460Hji.A02
            int r0 = r4.label
            r1 = 1
            if (r0 == 0) goto L40
            if (r0 != r1) goto Ld4
            X.Hwg.A00(r3)
        L20:
            java.lang.Iterable r3 = (java.lang.Iterable) r3
            java.util.ArrayList r2 = X.C3cG.A0h()
            java.util.Iterator r1 = r3.iterator()
        L2a:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L77
            java.lang.Object r0 = r1.next()
            X.ENw r0 = (X.ENw) r0
            X.HxE r0 = com.facebook.aura.partners.accountlinking.nativeauthlogging.MAHatchNativeAuthAppStartLoggerKt.toAccountJson(r0)
            if (r0 == 0) goto L2a
            r2.add(r0)
            goto L2a
        L40:
            X.Hwg.A00(r3)
            boolean r0 = X.AbstractC6666EOb.A00()
            if (r0 == 0) goto L55
            r0 = 0
            r4.L$0 = r0
            r4.label = r1
            java.lang.Object r3 = r5.fetchV2Items(r6, r4)
            if (r3 != r2) goto L20
        L54:
            return r2
        L55:
            java.util.List r0 = r5.fetchLegacyItems(r6)
            java.util.ArrayList r2 = X.C3cG.A0h()
            java.util.Iterator r1 = r0.iterator()
        L61:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L77
            java.lang.Object r0 = r1.next()
            X.EPY r0 = (X.EPY) r0
            X.HxE r0 = com.facebook.aura.partners.accountlinking.nativeauthlogging.MAHatchNativeAuthAppStartLoggerKt.toAccountJson(r0)
            if (r0 == 0) goto L61
            r2.add(r0)
            goto L61
        L77:
            com.facebook.aura.partners.accountlinking.nativeauthlogging.MAHatchNativeAuthAppStartLogger$fetchAccounts$$inlined$sortedBy$1 r0 = new com.facebook.aura.partners.accountlinking.nativeauthlogging.MAHatchNativeAuthAppStartLogger$fetchAccounts$$inlined$sortedBy$1
            r0.<init>()
            java.util.List r0 = X.AbstractC0878AGe.A0c(r2, r0)
            java.util.HashSet r5 = X.C60O.A13()
            java.util.ArrayList r4 = X.C3cG.A0h()
            java.util.Iterator r3 = r0.iterator()
        L8c:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto Laf
            java.lang.Object r2 = r3.next()
            r0 = r2
            X.HxE r0 = (X.HxE) r0
            A r1 = r0.first
            B r0 = r0.second
            com.facebook.aura.partners.accountlinking.nativeauthlogging.NativeAuthAccountJson r0 = (com.facebook.aura.partners.accountlinking.nativeauthlogging.NativeAuthAccountJson) r0
            java.lang.String r0 = r0.source_app
            X.HxE r0 = X.C3cG.A0r(r0, r1)
            boolean r0 = r5.add(r0)
            if (r0 == 0) goto L8c
            r4.add(r2)
            goto L8c
        Laf:
            r0 = 50
            java.util.List r0 = X.AbstractC0878AGe.A0a(r4, r0)
            java.util.ArrayList r2 = X.AnonymousClass003.A0i(r0)
            java.util.Iterator r1 = r0.iterator()
        Lbd:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L54
            X.HxE r0 = X.C60Q.A10(r1)
            B r0 = r0.second
            r2.add(r0)
            goto Lbd
        Lcd:
            com.facebook.aura.partners.accountlinking.nativeauthlogging.MAHatchNativeAuthAppStartLogger$fetchAccounts$1 r4 = new com.facebook.aura.partners.accountlinking.nativeauthlogging.MAHatchNativeAuthAppStartLogger$fetchAccounts$1
            r4.<init>(r7)
            goto L12
        Ld4:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.partners.accountlinking.nativeauthlogging.MAHatchNativeAuthAppStartLogger.fetchAccounts(android.content.Context, X.HtJ):java.lang.Object");
    }

    private final List<EPY> fetchLegacyItems(Context context) {
        Collection collectionA0P;
        EPC epcProviderRepository = providerRepository();
        try {
            List<EPL> list = MAHatchNativeAuthAppStartLoggerKt.LEGACY_SSO_SOURCES;
            ArrayList arrayListA0E = epcProviderRepository.A0E(context, MAHatchNativeAuthAppStartLoggerKt.LOG_LOCATION, AbstractC0878AGe.A0g(list));
            AnonymousClass003.A0u(context, list);
            collectionA0P = AbstractC0878AGe.A0P(epcProviderRepository.A07(context, BV5.A0j(), MAHatchNativeAuthAppStartLoggerKt.LOG_LOCATION, list), arrayListA0E);
        } catch (Exception e) {
            logClientError(MAHatchNativeAuthAppStartLoggerKt.STAGE_V1_FETCH, e);
            collectionA0P = C0881AGi.A00;
        }
        return AbstractC0878AGe.A0P(fetchLegacyThreadsItems(context, epcProviderRepository), collectionA0P);
    }

    private final List<EPY> fetchLegacyThreadsItems(Context context, EPC epc) {
        return AbstractC0878AGe.A0P(readThreadsLite(new AnonymousClass3(epc, context)), AbstractC0878AGe.A0P(readThreadsLite(new AnonymousClass2(epc, context)), readThreadsLite(new C130371(epc, context))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:11:0x001e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object fetchV2Items(android.content.Context r11, X.HtJ<? super java.util.List<X.ENw>> r12) {
        /*
            r10 = this;
            boolean r0 = r12 instanceof com.facebook.aura.partners.accountlinking.nativeauthlogging.MAHatchNativeAuthAppStartLogger.C130381
            if (r0 == 0) goto L1e
            r8 = r12
            com.facebook.aura.partners.accountlinking.nativeauthlogging.MAHatchNativeAuthAppStartLogger$fetchV2Items$1 r8 = (com.facebook.aura.partners.accountlinking.nativeauthlogging.MAHatchNativeAuthAppStartLogger.C130381) r8
            int r2 = r8.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L1e
            int r2 = r2 - r1
            r8.label = r2
        L12:
            java.lang.Object r1 = r8.result
            X.Hji r3 = X.EnumC10460Hji.A02
            int r0 = r8.label
            r2 = 1
            if (r0 == 0) goto L29
            if (r0 != r2) goto L24
            goto L56
        L1e:
            com.facebook.aura.partners.accountlinking.nativeauthlogging.MAHatchNativeAuthAppStartLogger$fetchV2Items$1 r8 = new com.facebook.aura.partners.accountlinking.nativeauthlogging.MAHatchNativeAuthAppStartLogger$fetchV2Items$1
            r8.<init>(r12)
            goto L12
        L24:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        L29:
            X.Hwg.A00(r1)
            X.EOB r4 = X.EOB.A05     // Catch: java.lang.Exception -> L5e java.util.concurrent.CancellationException -> L68
            java.util.Set<X.EP0> r1 = X.EP0.A01     // Catch: java.lang.Exception -> L5e java.util.concurrent.CancellationException -> L68
            java.util.Set<X.EP0> r0 = X.EP0.A03     // Catch: java.lang.Exception -> L5e java.util.concurrent.CancellationException -> L68
            java.util.LinkedHashSet r1 = X.BGK.A01(r0, r1)     // Catch: java.lang.Exception -> L5e java.util.concurrent.CancellationException -> L68
            java.util.Set<X.EP0> r0 = X.EP0.A04     // Catch: java.lang.Exception -> L5e java.util.concurrent.CancellationException -> L68
            java.util.LinkedHashSet r7 = X.BGK.A01(r0, r1)     // Catch: java.lang.Exception -> L5e java.util.concurrent.CancellationException -> L68
            X.Ey9 r0 = X.EP1.A01     // Catch: java.lang.Exception -> L5e java.util.concurrent.CancellationException -> L68
            java.util.Set r1 = X.AbstractC0878AGe.A0g(r0)     // Catch: java.lang.Exception -> L5e java.util.concurrent.CancellationException -> L68
            r0 = 0
            X.EOH r9 = new X.EOH     // Catch: java.lang.Exception -> L5e java.util.concurrent.CancellationException -> L68
            r9.<init>(r1, r0)     // Catch: java.lang.Exception -> L5e java.util.concurrent.CancellationException -> L68
            java.lang.String r6 = "hatch_android_native_auth_app_start_logging"
            r8.L$0 = r0     // Catch: java.lang.Exception -> L5e java.util.concurrent.CancellationException -> L68
            r8.label = r2     // Catch: java.lang.Exception -> L5e java.util.concurrent.CancellationException -> L68
            r5 = r11
            java.lang.Object r1 = r4.A02(r5, r6, r7, r8, r9)     // Catch: java.lang.Exception -> L5e java.util.concurrent.CancellationException -> L68
            if (r1 != r3) goto L59
            return r3
        L56:
            X.Hwg.A00(r1)     // Catch: java.lang.Exception -> L5e java.util.concurrent.CancellationException -> L68
        L59:
            X.EOM r1 = (X.EOM) r1     // Catch: java.lang.Exception -> L5e java.util.concurrent.CancellationException -> L68
            java.util.List<X.ENw> r3 = r1.A01     // Catch: java.lang.Exception -> L5e java.util.concurrent.CancellationException -> L68
            return r3
        L5e:
            r1 = move-exception
            java.lang.String r0 = "v2_fetch"
            r10.logClientError(r0, r1)
            X.AGi r0 = X.C0881AGi.A00
            return r0
        L68:
            r0 = move-exception
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.partners.accountlinking.nativeauthlogging.MAHatchNativeAuthAppStartLogger.fetchV2Items(android.content.Context, X.HtJ):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void logClientError(String str, Throwable th) {
        CFK.A0K(MAHatchNativeAuthAppStartLoggerKt.TAG, th, FGI.A0M("Native auth app start logging failed at ", str));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void maybeScheduleLogging() {
        C4oT c4oT = AuraDevicePrefs.INSTANCE.get(AuraDevicePrefStore.MA_HATCH_NATIVE_AUTH_LOGGING);
        long jCurrentTimeMillis = System.currentTimeMillis();
        long j = c4oT.getLong(MAHatchNativeAuthAppStartLoggerKt.LAST_LOGGED_AT_MS_KEY, 0L);
        if (j > 0) {
            long millis = TimeUnit.DAYS.toMillis(MAHatchNativeAuthAppStartLoggerKt.getCooldownDays());
            long j2 = jCurrentTimeMillis - j;
            if (0 <= j2 && j2 < millis) {
                return;
            }
        }
        BzK bzKA02 = BzK.A02(c4oT);
        bzKA02.AYp(MAHatchNativeAuthAppStartLoggerKt.LAST_LOGGED_AT_MS_KEY, jCurrentTimeMillis);
        bzKA02.apply();
        F1d f1d = new F1d(MAHatchNativeAuthAppStartLoggingWorker.class);
        F1w f1w = new F1w();
        f1w.A01(C79.A01);
        f1d.A00.A0B = f1w.A00();
        F3R.A02(C4JM.A00()).A04(C7yC.A04, f1d.A01(), MAHatchNativeAuthAppStartLoggerKt.WORK_NAME);
    }

    private final EPC providerRepository() {
        EPP epp = new EPP();
        epp.A03 = new AuraAccessLibraryLogger();
        return new EPC(epp);
    }

    public final boolean isExposureEligible$fbandroid_express_aura_java_com_facebook_aura_partners_accountlinking_nativeauthlogging_nativeauthlogging() {
        AbstractC3358CGz currentUserSession;
        if (!AuraStefiClient.INSTANCE.hasAuth() || (currentUserSession = AuraUserSessionStore.INSTANCE.getCurrentUserSession()) == null) {
            return false;
        }
        return ConfidentialSessionGate.Companion.getInstance(currentUserSession).isStandardVm();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00cc A[Catch: Exception -> 0x00d4, CancellationException -> 0x00de, TRY_LEAVE, TryCatch #2 {CancellationException -> 0x00de, Exception -> 0x00d4, blocks: (B:39:0x00c2, B:40:0x00c6, B:42:0x00cc, B:35:0x007b, B:36:0x007e, B:16:0x0034, B:18:0x003c, B:20:0x003f, B:22:0x0047, B:24:0x004a, B:26:0x0056, B:28:0x0059, B:30:0x005f, B:32:0x0062), top: B:49:0x001e }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object logAppStartData$fbandroid_express_aura_java_com_facebook_aura_partners_accountlinking_nativeauthlogging_nativeauthlogging(android.content.Context r17, X.HtJ<? super kotlin.Unit> r18) {
        /*
            Method dump skipped, instructions count: 224
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.partners.accountlinking.nativeauthlogging.MAHatchNativeAuthAppStartLogger.logAppStartData$fbandroid_express_aura_java_com_facebook_aura_partners_accountlinking_nativeauthlogging_nativeauthlogging(android.content.Context, X.HtJ):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Not initialized variable reg: 10, insn: 0x01b5: INVOKE 
  (r10 I:com.facebook.aura.partners.accountlinking.nativeauthlogging.MAHatchNativeAuthAppStartLogger)
  (r0 I:java.lang.String)
  (r1 I:java.lang.Throwable)
 DIRECT call: com.facebook.aura.partners.accountlinking.nativeauthlogging.MAHatchNativeAuthAppStartLogger.logClientError(java.lang.String, java.lang.Throwable):void A[MD:(java.lang.String, java.lang.Throwable):void (m)] (LINE:437), block:B:71:0x01b2 */
    /* JADX WARN: Removed duplicated region for block: B:89:0x018c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x003b A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.facebook.aura.partners.accountlinking.nativeauthlogging.NativeAuthWaEligibilityFlagsJson fetchWaEligibilityFlags(android.content.Context r44) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 442
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.partners.accountlinking.nativeauthlogging.MAHatchNativeAuthAppStartLogger.fetchWaEligibilityFlags(android.content.Context):com.facebook.aura.partners.accountlinking.nativeauthlogging.NativeAuthWaEligibilityFlagsJson");
    }

    private final List<EPY> readThreadsLite(Function0<? extends List<EPY>> function0) {
        try {
            return function0.invoke();
        } catch (Exception e) {
            logClientError(MAHatchNativeAuthAppStartLoggerKt.STAGE_V1_THREADS_FETCH, e);
            return C0881AGi.A00;
        }
    }

    @Override // com.facebook.aura.lifecycle.AppBackgroundedListener
    public void onAppBackgrounded() {
        try {
            if (isExposureEligible$fbandroid_express_aura_java_com_facebook_aura_partners_accountlinking_nativeauthlogging_nativeauthlogging() && MAHatchNativeAuthAppStartLoggerKt.isLoggingEnabled()) {
                ((ExecutorService) AuraExecutors.ioExecutor$delegate.getValue()).execute(new Runnable() { // from class: com.facebook.aura.partners.accountlinking.nativeauthlogging.MAHatchNativeAuthAppStartLogger.onAppBackgrounded.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        try {
                            MAHatchNativeAuthAppStartLogger.INSTANCE.maybeScheduleLogging();
                        } catch (Exception e) {
                            MAHatchNativeAuthAppStartLogger.INSTANCE.logClientError(MAHatchNativeAuthAppStartLoggerKt.STAGE_LAUNCH, e);
                        }
                    }
                });
            }
        } catch (Exception e) {
            logClientError(MAHatchNativeAuthAppStartLoggerKt.STAGE_LAUNCH, e);
        }
    }
}
