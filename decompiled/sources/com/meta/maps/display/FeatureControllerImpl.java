package com.meta.maps.display;

import X.C06H;
import com.meta.maps.NativeBase;
import java.util.Map;

/* loaded from: classes4.dex */
public final class FeatureControllerImpl extends NativeBase implements FeatureController {
    public static final Companion Companion = new Companion();

    public static final native void disposeNativeHandle(long j);

    @Override // com.meta.maps.display.FeatureController
    public native Map<String, String> getFeatureProperties(String str);

    @Override // com.meta.maps.display.FeatureController
    public native String getFeatureProperty(String str, String str2);

    @Override // com.meta.maps.display.FeatureController
    public native void removeFeatureProperty(String str, String str2);

    @Override // com.meta.maps.display.FeatureController
    public native void setFeatureProperties(String str, Map<String, String> map);

    @Override // com.meta.maps.display.FeatureController
    public native void setFeatureProperty(String str, String str2, String str3);

    public FeatureControllerImpl(long j, Object obj) {
        super(j, Companion);
    }

    public final class Companion implements NativeBase.Disposer {
        public /* synthetic */ Companion(C06H c06h) {
        }

        private final void disposeNativeHandle(long j) {
            FeatureControllerImpl.disposeNativeHandle(j);
        }

        @Override // com.meta.maps.NativeBase.Disposer
        public void dispose(long j) {
            FeatureControllerImpl.disposeNativeHandle(j);
        }

        public Companion() {
        }
    }
}
