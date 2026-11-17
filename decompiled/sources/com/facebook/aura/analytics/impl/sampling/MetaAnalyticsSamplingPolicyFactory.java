package com.facebook.aura.analytics.impl.sampling;

import X.C4933DFj;
import X.C4934DFk;
import X.C4oT;
import X.DGI;
import com.facebook.aura.common.prefs.AuraDevicePrefStore;
import com.facebook.aura.common.prefs.AuraDevicePrefs;

/* loaded from: classes5.dex */
public final class MetaAnalyticsSamplingPolicyFactory {

    /* renamed from: com.facebook.aura.analytics.impl.sampling.MetaAnalyticsSamplingPolicyFactory$createE2ESamplingPolicy$1, reason: invalid class name */
    public final class AnonymousClass1 implements DGI {
        public boolean hasSamplingConfig() {
            return true;
        }

        public int getEventSampleRate(String str) {
            return 1;
        }

        @Override // X.DGI
        public C4934DFk shouldLog(String str) {
            return C4934DFk.A00();
        }
    }

    public final DGI createE2ESamplingPolicy() {
        return new AnonymousClass1();
    }

    public final C4933DFj createPrimaryPigeonSamplingPolicy() {
        return new C4933DFj(AuraDevicePrefs.INSTANCE.get(AuraDevicePrefStore.ANALYTICS_SAMPLING_POLICY));
    }

    public final C4oT getSamplingPolicyPrefs() {
        return AuraDevicePrefs.INSTANCE.get(AuraDevicePrefStore.ANALYTICS_SAMPLING_POLICY);
    }
}
