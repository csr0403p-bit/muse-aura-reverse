package com.meta.maps.display;

import X.C06H;
import com.meta.maps.NativeBase;

/* loaded from: classes4.dex */
public final class SelectableContentImpl extends NativeBase implements SelectableContent {
    public static final Companion Companion = new Companion();

    public static final native void disposeNativeHandle(long j);

    @Override // com.meta.maps.display.SelectableContent
    public native String getFeatureGeoJson(String str);

    @Override // com.meta.maps.display.SelectableContent
    public native String getIdentifier();

    @Override // com.meta.maps.display.SelectableContent
    public native String getLayerForFeature(String str);

    @Override // com.meta.maps.display.SelectableContent
    public native void onSelectionChanged(String str, boolean z);

    @Override // com.meta.maps.display.SelectableContent
    public native boolean ownsFeature(String str);

    @Override // com.meta.maps.display.SelectableContent
    public native boolean ownsSource(String str);

    public SelectableContentImpl(long j, Object obj) {
        super(j, Companion);
    }

    public final class Companion implements NativeBase.Disposer {
        public /* synthetic */ Companion(C06H c06h) {
        }

        private final void disposeNativeHandle(long j) {
            SelectableContentImpl.disposeNativeHandle(j);
        }

        @Override // com.meta.maps.NativeBase.Disposer
        public void dispose(long j) {
            SelectableContentImpl.disposeNativeHandle(j);
        }

        public Companion() {
        }
    }
}
