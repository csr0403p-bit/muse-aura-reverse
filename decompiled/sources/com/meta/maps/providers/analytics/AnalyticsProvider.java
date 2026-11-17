package com.meta.maps.providers.analytics;

import X.C06H;
import com.meta.maps.NativeBase;
import com.meta.maps.core.Analytics;

/* loaded from: classes4.dex */
public final class AnalyticsProvider extends NativeBase {
    public static final Companion Companion = new Companion();

    public static final native Analytics create(String str);

    public static final native void disposeNativeHandle(long j);

    public final class Companion implements NativeBase.Disposer {
        public final Analytics create(String str) {
            return AnalyticsProvider.create(str);
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        private final void disposeNativeHandle(long j) {
            AnalyticsProvider.disposeNativeHandle(j);
        }

        @Override // com.meta.maps.NativeBase.Disposer
        public void dispose(long j) {
            AnalyticsProvider.disposeNativeHandle(j);
        }

        public Companion() {
        }
    }

    public AnalyticsProvider(long j, Object obj) {
        super(j, Companion);
    }
}
