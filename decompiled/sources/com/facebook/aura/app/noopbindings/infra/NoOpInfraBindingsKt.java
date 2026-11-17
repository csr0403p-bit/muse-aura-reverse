package com.facebook.aura.app.noopbindings.infra;

import X.AEm;
import X.C4JM;
import X.C8ee;
import X.C8j3;
import X.DFX;
import X.DFY;
import X.DGY;
import X.Eu1;
import X.InterfaceC10378HOe;
import X.InterfaceC10379HOf;
import X.InterfaceC3472COx;
import com.facebook.aura.qpl.AuraQplNameProvider;
import com.facebook.prefs.shared.FbSharedPreferences;
import com.facebook.quicklog.LightweightQuickPerformanceLogger;

/* loaded from: classes6.dex */
public abstract class NoOpInfraBindingsKt {

    /* renamed from: com.facebook.aura.app.noopbindings.infra.NoOpInfraBindingsKt$provideLogger$1, reason: invalid class name */
    /* loaded from: classes4.dex */
    public final class AnonymousClass1 implements C8ee<Void> {
        @Override // X.C8ee
        public Eu1<Void> acquireEvent(String str) {
            return new AEm();
        }

        @Override // X.C8ee
        public /* bridge */ /* synthetic */ Eu1 acquireEvent(String str, Void r2) {
            return new AEm();
        }

        /* renamed from: acquireEvent, reason: avoid collision after fix types in other method */
        public Eu1<Void> acquireEvent2(String str, Void r2) {
            return new AEm();
        }
    }

    /* renamed from: com.facebook.aura.app.noopbindings.infra.NoOpInfraBindingsKt$provideSessionScopedLogger$1, reason: invalid class name and case insensitive filesystem */
    /* loaded from: classes4.dex */
    public final class C109231 implements C8ee<Void> {
        @Override // X.C8ee
        public Eu1<Void> acquireEvent(String str) {
            return new AEm();
        }

        @Override // X.C8ee
        public /* bridge */ /* synthetic */ Eu1 acquireEvent(String str, Void r2) {
            return new AEm();
        }

        /* renamed from: acquireEvent, reason: avoid collision after fix types in other method */
        public Eu1<Void> acquireEvent2(String str, Void r2) {
            return new AEm();
        }
    }

    public static final InterfaceC10379HOf provideAnalyticsConfig() {
        throw C8j3.A18("AnalyticsConfig not available in Aura");
    }

    public static final InterfaceC10378HOe provideAnalyticsLogger() {
        throw C8j3.A18("AnalyticsLogger not available in Aura");
    }

    public static final DGY provideBackgroundExecution() {
        throw C8j3.A18("BackgroundExecution not available in Aura");
    }

    public static final InterfaceC3472COx provideDebugAndTestConfig() {
        throw C8j3.A18("DebugAndTestConfig not available in Aura");
    }

    public static final FbSharedPreferences provideFbSharedPreferences() {
        throw C8j3.A18("FbSharedPreferences not available in Aura");
    }

    public static final LightweightQuickPerformanceLogger provideLightweightQuickPerformanceLogger() {
        throw C8j3.A18("LightweightQuickPerformanceLogger not available in Aura");
    }

    public static final C8ee<?> provideLogger() {
        return new AnonymousClass1();
    }

    public static final C109221 provideMobileConfigErrorReporter() {
        return new C109221();
    }

    public static final AuraQplNameProvider provideQuicklogNameProvider() {
        throw C8j3.A18("QuicklogNameProvider not available in Aura");
    }

    public static final C8ee<?> provideSessionScopedLogger() {
        return new C109231();
    }

    public static final DFX provideAnalytics2Logger() {
        return new DFX(new DFY(C4JM.A00()));
    }

    public static final DFX provideSessionScopedAnalytics2Logger() {
        return new DFX(new DFY(C4JM.A00()));
    }

    /* renamed from: com.facebook.aura.app.noopbindings.infra.NoOpInfraBindingsKt$provideMobileConfigErrorReporter$1, reason: invalid class name and case insensitive filesystem */
    public final class C109221 {
        public void logError(int i, String str, String str2, String str3) {
        }

        public void logError(int i, String str, String str2, String str3, Throwable th) {
        }

        public void logError(int i, String str, String str2, Throwable th) {
        }
    }
}
