package com.meta.maps.core;

import X.C06H;
import com.meta.maps.NativeBase;

/* loaded from: classes4.dex */
public final class AnalyticsImpl extends NativeBase implements Analytics {
    public static final Companion Companion = new Companion();
    public DeviceInfo deviceInfo;
    public String experimentTag;
    public final String mapSessionId;
    public ProductSurface productSurface;
    public final String tempPath;
    public String version;

    public static final native void disposeNativeHandle(long j);

    @Override // com.meta.maps.core.Analytics
    public native DeviceInfo getDeviceInfo();

    @Override // com.meta.maps.core.Analytics
    public native String getExperimentTag();

    @Override // com.meta.maps.core.Analytics
    public native String getMapSessionId();

    @Override // com.meta.maps.core.Analytics
    public native ProductSurface getProductSurface();

    @Override // com.meta.maps.core.Analytics
    public native String getTempPath();

    @Override // com.meta.maps.core.Analytics
    public native String getVersion();

    @Override // com.meta.maps.core.Analytics
    public native void setDeviceInfo(DeviceInfo deviceInfo);

    @Override // com.meta.maps.core.Analytics
    public native void setExperimentTag(String str);

    @Override // com.meta.maps.core.Analytics
    public native void setProductSurface(ProductSurface productSurface);

    @Override // com.meta.maps.core.Analytics
    public native void setVersion(String str);

    public AnalyticsImpl(long j, Object obj) {
        super(j, Companion);
    }

    public final class Companion implements NativeBase.Disposer {
        public /* synthetic */ Companion(C06H c06h) {
        }

        private final void disposeNativeHandle(long j) {
            AnalyticsImpl.disposeNativeHandle(j);
        }

        @Override // com.meta.maps.NativeBase.Disposer
        public void dispose(long j) {
            AnalyticsImpl.disposeNativeHandle(j);
        }

        public Companion() {
        }
    }
}
