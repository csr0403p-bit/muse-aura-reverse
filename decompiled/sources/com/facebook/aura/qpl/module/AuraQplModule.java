package com.facebook.aura.qpl.module;

import X.AbstractC3136BzG;
import X.C3627CaA;
import X.C60O;
import X.InterfaceC3173C1c;
import android.os.Trace;
import com.facebook.quicklog.QuickPerformanceLogger;
import com.facebook.quicklog.QuickPerformanceLoggerGKs;

/* loaded from: classes5.dex */
public final class AuraQplModule {
    public static final AuraQplModule INSTANCE = new AuraQplModule();

    /* renamed from: com.facebook.aura.qpl.module.AuraQplModule$provideQuickPerformanceLoggerGKs$1, reason: invalid class name */
    public final class AnonymousClass1 extends C3627CaA {
        @Override // X.C3627CaA, com.facebook.quicklog.QuickPerformanceLoggerGKs
        public InterfaceC3173C1c getMetadataGKs() {
            return new AuraQplModule$provideQuickPerformanceLoggerGKs$1$getMetadataGKs$1();
        }

        @Override // X.C3627CaA, com.facebook.quicklog.QuickPerformanceLoggerGKs
        public boolean isAppIdBasedConfigWithSamplingFallbackEnabled() {
            return true;
        }

        @Override // X.C3627CaA, com.facebook.quicklog.QuickPerformanceLoggerGKs
        public boolean isSamplingFallbackEnabled() {
            return true;
        }

        @Override // X.C3627CaA, com.facebook.quicklog.QuickPerformanceLoggerGKs
        public boolean shouldReportTriggerSourceAsCrucial() {
            return false;
        }
    }

    public static final QuickPerformanceLogger provideQuickPerformanceLogger() {
        AbstractC3136BzG.A00("AuraQpl");
        try {
            return C60O.A0g();
        } finally {
            Trace.endSection();
        }
    }

    public static final QuickPerformanceLoggerGKs provideQuickPerformanceLoggerGKs() {
        return new AnonymousClass1();
    }
}
