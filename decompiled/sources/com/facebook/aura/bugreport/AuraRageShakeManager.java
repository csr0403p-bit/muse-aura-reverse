package com.facebook.aura.bugreport;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.BV5;
import X.BXJ;
import X.BY5;
import X.BZ3;
import X.C06827l3;
import X.C06H;
import X.C3UX;
import X.C3cG;
import X.C5322DgG;
import X.C60O;
import X.C6545EEa;
import X.C6546EEe;
import X.C6547EEf;
import X.C7384Etj;
import X.C79;
import X.C7BY;
import X.CFK;
import X.EEX;
import X.F0C;
import X.FGI;
import X.G0V;
import X.HoC;
import X.HtJ;
import android.content.SharedPreferences;
import android.hardware.SensorManager;
import android.os.Build;
import androidx.fragment.app.FragmentActivity;
import com.facebook.aura.navigation.AuraNavKey;
import com.facebook.aura.navigation.AuraNavigator;
import java.io.File;
import java.util.Locale;
import java.util.Set;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;

/* loaded from: classes5.dex */
public final class AuraRageShakeManager {
    public static final int $stable = 8;
    public static final String ATTACHMENTS_DIR = "bug_report_attachments";
    public static final Companion Companion = new Companion();
    public static final String PREFS_NAME = "aura_rageshake";
    public static final String PREF_KEY_ENABLED = "shake_to_report_enabled";
    public static final float SHAKE_FORCE_THRESHOLD = 18.042845f;
    public final FragmentActivity activity;
    public G0V<? super String, ? super String, Unit> fallbackHandler;
    public AuraNavigator navigator;
    public final SharedPreferences.OnSharedPreferenceChangeListener prefListener;
    public final F0C prefs$delegate;
    public HoC screenshotJob;
    public EEX shakeDispatcher;

    public AuraRageShakeManager(FragmentActivity fragmentActivity) {
        C7384Etj.A0Y(fragmentActivity, 0);
        this.activity = fragmentActivity;
        this.prefs$delegate = C5322DgG.A01((Function0) new AuraRageShakeManager$prefs$2(this));
        this.prefListener = new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: com.facebook.aura.bugreport.AuraRageShakeManager$prefListener$1
            @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
            public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
                if (str != null && str.hashCode() == 451022977 && str.equals(AuraRageShakeManager.PREF_KEY_ENABLED)) {
                    boolean zIsEnabled = this.this$0.isEnabled();
                    AuraRageShakeManager auraRageShakeManager = this.this$0;
                    if (zIsEnabled) {
                        auraRageShakeManager.startListening();
                    } else {
                        auraRageShakeManager.stopListening();
                    }
                }
            }
        };
    }

    public final void clearFallbackHandler(G0V<? super String, ? super String, Unit> g0v) {
        C7384Etj.A0Y(g0v, 0);
        if (this.fallbackHandler == g0v) {
            this.fallbackHandler = null;
        }
    }

    public final void clearNavigator(AuraNavigator auraNavigator) {
        C7384Etj.A0Y(auraNavigator, 0);
        if (this.navigator == auraNavigator) {
            this.navigator = null;
        }
    }

    public final void setFallbackHandler(G0V<? super String, ? super String, Unit> g0v) {
        C7384Etj.A0Y(g0v, 0);
        this.fallbackHandler = g0v;
    }

    public final void setNavigator(AuraNavigator auraNavigator) {
        C7384Etj.A0Y(auraNavigator, 0);
        this.navigator = auraNavigator;
    }

    public final class Companion {
        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void ensureAttachmentDirInitialized() {
        File fileA0O = C3cG.A0O(this.activity.getCacheDir(), "bug_report_attachments");
        BV5.A1H(fileA0O);
        BZ3.A00 = fileA0O;
    }

    private final SharedPreferences getPrefs() {
        return (SharedPreferences) this.prefs$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void startListening() {
        Integer num;
        SensorManager sensorManager;
        if (this.shakeDispatcher == null) {
            String str = Build.MODEL;
            C7384Etj.A0V(str);
            String str2 = Build.MANUFACTURER;
            C7384Etj.A0V(str2);
            BXJ bxj = BY5.A00;
            if (bxj.A00.contains(str2) || bxj.A02.contains(str)) {
                num = C79.A01;
            } else {
                Set<String> set = bxj.A01;
                Locale locale = Locale.ROOT;
                C7384Etj.A0V(locale);
                num = (set.contains(str2.toLowerCase(locale)) || bxj.A03.contains(str.toLowerCase(locale))) ? C79.A0C : C79.A00;
            }
            if (num == C79.A00) {
                Object systemService = this.activity.getSystemService("sensor");
                if (!(systemService instanceof SensorManager) || (sensorManager = (SensorManager) systemService) == null) {
                    return;
                }
                EEX eex = new EEX(sensorManager);
                C6546EEe c6546EEe = new C6546EEe(new AuraRageShakeManager$startListening$1$1(this), new C6547EEf(new C6545EEa()));
                synchronized (eex) {
                    CFK.A05("RageShakeSensorEventDispatcher", "[registerListener]");
                    eex.A03.add(c6546EEe);
                }
                eex.A00();
                this.shakeDispatcher = eex;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void stopListening() {
        EEX eex = this.shakeDispatcher;
        if (eex != null) {
            synchronized (eex) {
                CFK.A05("RageShakeSensorEventDispatcher", FGI.A0r("[stop] isListenerRegistered: ", eex.A00));
                if (eex.A00) {
                    eex.A01.unregisterListener(eex.A02);
                    eex.A00 = false;
                    CFK.A05("RageShakeSensorEventDispatcher", "[stop] stopped");
                }
            }
        }
        this.shakeDispatcher = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void trigger() {
        this.activity.runOnUiThread(new Runnable() { // from class: com.facebook.aura.bugreport.AuraRageShakeManager.trigger.1

            @DebugMetadata(c = "com.facebook.aura.bugreport.AuraRageShakeManager$trigger$1$1", f = "AuraRageShakeManager.kt", l = {138}, m = "invokeSuspend", v = 2)
            /* renamed from: com.facebook.aura.bugreport.AuraRageShakeManager$trigger$1$1, reason: invalid class name and collision with other inner class name */
            public final class C00561 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
                public final /* synthetic */ String $endpoint;
                public final /* synthetic */ boolean $showsAgentBrowser;
                public final /* synthetic */ String $submissionId;
                public int label;
                public final /* synthetic */ AuraRageShakeManager this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C00561(boolean z, AuraRageShakeManager auraRageShakeManager, String str, String str2, HtJ<? super C00561> htJ) {
                    super(2, htJ);
                    this.$showsAgentBrowser = z;
                    this.this$0 = auraRageShakeManager;
                    this.$submissionId = str;
                    this.$endpoint = str2;
                }

                @Override // X.AbstractC8884Fsp
                public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
                    return new C00561(this.$showsAgentBrowser, this.this$0, this.$submissionId, this.$endpoint, htJ);
                }

                /* JADX WARN: Removed duplicated region for block: B:13:0x0021  */
                /* JADX WARN: Removed duplicated region for block: B:16:0x0031  */
                @Override // X.AbstractC8884Fsp
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object invokeSuspend(java.lang.Object r7) {
                    /*
                        r6 = this;
                        X.Hji r5 = X.EnumC10460Hji.A02
                        int r0 = r6.label
                        r3 = 1
                        r4 = 0
                        if (r0 == 0) goto L3b
                        if (r0 != r3) goto L53
                        X.Hwg.A00(r7)
                    Ld:
                        java.io.File r7 = (java.io.File) r7
                        if (r7 == 0) goto L1b
                        android.net.Uri r0 = android.net.Uri.fromFile(r7)
                        if (r0 == 0) goto L1b
                        java.lang.String r4 = r0.toString()
                    L1b:
                        com.facebook.aura.bugreport.AuraRageShakeManager r0 = r6.this$0
                        com.facebook.aura.navigation.AuraNavigator r3 = r0.navigator
                        if (r3 == 0) goto L31
                        java.lang.String r2 = r6.$submissionId
                        java.lang.String r0 = r6.$endpoint
                        com.facebook.aura.navigation.key.ShakeToReportBottomSheetKey r1 = new com.facebook.aura.navigation.key.ShakeToReportBottomSheetKey
                        r1.<init>(r2, r4, r0)
                        r0 = 0
                        r3.navigate(r1, r0)
                    L2e:
                        kotlin.Unit r5 = kotlin.Unit.INSTANCE
                        return r5
                    L31:
                        X.G0V<? super java.lang.String, ? super java.lang.String, kotlin.Unit> r1 = r0.fallbackHandler
                        if (r1 == 0) goto L2e
                        java.lang.String r0 = r6.$submissionId
                        r1.invoke(r0, r4)
                        goto L2e
                    L3b:
                        X.Hwg.A00(r7)
                        boolean r0 = r6.$showsAgentBrowser
                        if (r0 != 0) goto L1b
                        com.facebook.aura.bugreport.screenshot.AuraBugReportScreenshotUtil r2 = com.facebook.aura.bugreport.screenshot.AuraBugReportScreenshotUtil.INSTANCE
                        com.facebook.aura.bugreport.AuraRageShakeManager r0 = r6.this$0
                        androidx.fragment.app.FragmentActivity r1 = r0.activity
                        java.lang.String r0 = r6.$submissionId
                        r6.label = r3
                        java.lang.Object r7 = r2.createScreenshotFile(r1, r0, r6)
                        if (r7 != r5) goto Ld
                        return r5
                    L53:
                        java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
                        throw r0
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.bugreport.AuraRageShakeManager.AnonymousClass1.C00561.invokeSuspend(java.lang.Object):java.lang.Object");
                }

                @Override // X.G0V
                public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
                    return ((C00561) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
                }
            }

            /* JADX WARN: Removed duplicated region for block: B:28:0x004a  */
            @Override // java.lang.Runnable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void run() {
                /*
                    r7 = this;
                    com.facebook.aura.bugreport.AuraRageShakeManager r0 = com.facebook.aura.bugreport.AuraRageShakeManager.this
                    com.facebook.aura.navigation.AuraNavigator r4 = r0.navigator
                    if (r4 != 0) goto Lb
                    X.G0V<? super java.lang.String, ? super java.lang.String, kotlin.Unit> r0 = r0.fallbackHandler
                    if (r0 != 0) goto Lb
                La:
                    return
                Lb:
                    r1 = 1
                    r3 = 0
                    r2 = 0
                    if (r4 == 0) goto L25
                    com.facebook.aura.navigation.AuraNavKey r0 = r4.currentKey(r1)
                L14:
                    boolean r0 = r0 instanceof com.facebook.aura.navigation.key.ShakeToReportBottomSheetKey
                    if (r0 != 0) goto La
                    com.facebook.aura.bugreport.AuraRageShakeManager r0 = com.facebook.aura.bugreport.AuraRageShakeManager.this
                    X.HoC r0 = r0.screenshotJob
                    if (r0 == 0) goto L27
                    boolean r0 = r0.isActive()
                    if (r0 != r1) goto L27
                    return
                L25:
                    r0 = r2
                    goto L14
                L27:
                    com.facebook.aura.bugreport.AuraRageShakeManager r0 = com.facebook.aura.bugreport.AuraRageShakeManager.this
                    com.facebook.aura.bugreport.AuraRageShakeManager.access$ensureAttachmentDirInitialized(r0)
                    java.lang.String r5 = X.AnonymousClass002.A0k()
                    if (r4 == 0) goto L62
                    com.facebook.aura.navigation.AuraNavKey r1 = r4.currentKey(r1)
                    if (r1 == 0) goto L62
                    com.facebook.aura.bugreport.AuraRageShakeManager r0 = com.facebook.aura.bugreport.AuraRageShakeManager.this
                    java.lang.String r6 = com.facebook.aura.bugreport.AuraRageShakeManager.access$toEndpointName(r0, r1)
                L3e:
                    com.facebook.aura.navigation.AuraNavKey r2 = r4.currentKey(r3)
                L42:
                    boolean r0 = r2 instanceof com.facebook.aura.navigation.key.AgentComputerScreenKey
                    if (r0 != 0) goto L4a
                    boolean r0 = r2 instanceof com.facebook.aura.navigation.key.AgentComputerTakeOverScreenKey
                    if (r0 == 0) goto L4b
                L4a:
                    r3 = 1
                L4b:
                    com.facebook.aura.bugreport.AuraRageShakeManager r1 = com.facebook.aura.bugreport.AuraRageShakeManager.this
                    androidx.fragment.app.FragmentActivity r0 = r1.activity
                    X.Akn r0 = X.F31.A00(r0)
                    com.facebook.aura.bugreport.AuraRageShakeManager r4 = com.facebook.aura.bugreport.AuraRageShakeManager.this
                    r7 = 0
                    com.facebook.aura.bugreport.AuraRageShakeManager$trigger$1$1 r2 = new com.facebook.aura.bugreport.AuraRageShakeManager$trigger$1$1
                    r2.<init>(r3, r4, r5, r6, r7)
                    X.Hqc r0 = X.AnonymousClass001.A11(r2, r0)
                    r1.screenshotJob = r0
                    return
                L62:
                    r6 = r2
                    if (r4 == 0) goto L42
                    goto L3e
                */
                throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.bugreport.AuraRageShakeManager.AnonymousClass1.run():void");
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String toEndpointName(AuraNavKey auraNavKey) {
        String strA0L;
        String strA0L2;
        String strA0n = C60O.A0n(auraNavKey);
        return (strA0n == null || (strA0L = C7BY.A0L("ScreenKey", strA0n)) == null || (strA0L2 = C7BY.A0L("Key", strA0L)) == null) ? "unknown" : AnonymousClass001.A0u(C06827l3.A02("([a-z])([A-Z])").A03(strA0L2, "$1_$2"));
    }

    public final boolean isEnabled() {
        return getPrefs().getBoolean(PREF_KEY_ENABLED, true);
    }

    public final void onPause() {
        getPrefs().unregisterOnSharedPreferenceChangeListener(this.prefListener);
        stopListening();
    }

    public final void onResume() {
        getPrefs().registerOnSharedPreferenceChangeListener(this.prefListener);
        if (isEnabled()) {
            startListening();
        } else {
            stopListening();
        }
    }
}
