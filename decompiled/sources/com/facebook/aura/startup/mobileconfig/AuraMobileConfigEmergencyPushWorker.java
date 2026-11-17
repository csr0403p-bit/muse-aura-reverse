package com.facebook.aura.startup.mobileconfig;

import X.AnonymousClass003;
import X.C31u;
import X.HtJ;
import X.HzP;
import X.InterfaceC7359EnW;
import android.content.Context;
import androidx.work.WorkerParameters;
import com.facebook.aura.mobileconfig.AuraMobileConfigDelegatesKt;
import com.facebook.aura.startup.mobileconfig.MC;
import com.facebook.aura.startup.worker.AuraBackgroundCoroutineWorker;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.maplibre.android.R;

/* loaded from: classes3.dex */
public final class AuraMobileConfigEmergencyPushWorker extends AuraBackgroundCoroutineWorker {
    public static final /* synthetic */ InterfaceC7359EnW<Object>[] $$delegatedProperties = AnonymousClass003.A1b(AuraMobileConfigEmergencyPushWorker.class, "emergencyPushEnabled", "getEmergencyPushEnabled()Z");
    public final C31u emergencyPushEnabled$delegate;

    @DebugMetadata(c = "com.facebook.aura.startup.mobileconfig.AuraMobileConfigEmergencyPushWorker", f = "AuraMobileConfigEmergencyPushWorker.kt", l = {R.styleable.maplibre_MapView_maplibre_uiLogoMarginLeft}, m = "doBackgroundWork", v = 2)
    /* renamed from: com.facebook.aura.startup.mobileconfig.AuraMobileConfigEmergencyPushWorker$doBackgroundWork$1, reason: invalid class name */
    public final class AnonymousClass1 extends HzP {
        public int label;
        public /* synthetic */ Object result;

        public AnonymousClass1(HtJ<? super AnonymousClass1> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AuraMobileConfigEmergencyPushWorker.this.doBackgroundWork(this);
        }
    }

    private final boolean getEmergencyPushEnabled() {
        return C31u.A01(this, this.emergencyPushEnabled$delegate, $$delegatedProperties, 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x001e  */
    @Override // com.facebook.aura.startup.worker.AuraBackgroundCoroutineWorker
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object doBackgroundWork(X.HtJ<? super X.C77S> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof com.facebook.aura.startup.mobileconfig.AuraMobileConfigEmergencyPushWorker.AnonymousClass1
            if (r0 == 0) goto L1e
            r4 = r6
            com.facebook.aura.startup.mobileconfig.AuraMobileConfigEmergencyPushWorker$doBackgroundWork$1 r4 = (com.facebook.aura.startup.mobileconfig.AuraMobileConfigEmergencyPushWorker.AnonymousClass1) r4
            int r2 = r4.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L1e
            int r2 = r2 - r1
            r4.label = r2
        L12:
            java.lang.Object r1 = r4.result
            X.Hji r3 = X.EnumC10460Hji.A02
            int r0 = r4.label
            r2 = 1
            if (r0 == 0) goto L29
            if (r0 != r2) goto L24
            goto L4a
        L1e:
            com.facebook.aura.startup.mobileconfig.AuraMobileConfigEmergencyPushWorker$doBackgroundWork$1 r4 = new com.facebook.aura.startup.mobileconfig.AuraMobileConfigEmergencyPushWorker$doBackgroundWork$1
            r4.<init>(r6)
            goto L12
        L24:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        L29:
            X.Hwg.A00(r1)
            com.facebook.aura.mobileconfig.AuraMobileConfig r1 = com.facebook.aura.mobileconfig.AuraMobileConfig.INSTANCE     // Catch: java.lang.Exception -> L53
            r1.ensureInitialized()     // Catch: java.lang.Exception -> L53
            boolean r0 = r5.getEmergencyPushEnabled()     // Catch: java.lang.Exception -> L53
            if (r0 != 0) goto L3d
            X.77i r3 = new X.77i     // Catch: java.lang.Exception -> L53
            r3.<init>()     // Catch: java.lang.Exception -> L53
            return r3
        L3d:
            com.facebook.aura.mobileconfig.session.AuraMobileConfigProvider r0 = r1.getSessionedMC()     // Catch: java.lang.Exception -> L53
            r4.label = r2     // Catch: java.lang.Exception -> L53
            java.lang.Object r0 = r0.forceEmergencyPushFetch(r4)     // Catch: java.lang.Exception -> L53
            if (r0 != r3) goto L4d
            return r3
        L4a:
            X.Hwg.A00(r1)     // Catch: java.lang.Exception -> L53
        L4d:
            X.77i r3 = new X.77i     // Catch: java.lang.Exception -> L53
            r3.<init>()     // Catch: java.lang.Exception -> L53
            return r3
        L53:
            r2 = move-exception
            java.lang.String r1 = "Emergency push fetch failed"
            java.lang.String r0 = "AuraMCEmergencyPushWorker"
            X.CFK.A08(r0, r1, r2)
            X.77k r0 = new X.77k
            r0.<init>()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.startup.mobileconfig.AuraMobileConfigEmergencyPushWorker.doBackgroundWork(X.HtJ):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AuraMobileConfigEmergencyPushWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        AnonymousClass003.A0u(context, workerParameters);
        this.emergencyPushEnabled$delegate = AuraMobileConfigDelegatesKt.auraMobileConfigBoolean(MC.hatch_android.enable_emergency_push);
    }
}
