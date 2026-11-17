package com.meta.maps.display;

import X.C06H;
import X.C7384Etj;
import com.meta.maps.NativeBase;
import java.util.List;

/* loaded from: classes6.dex */
public final class SelectableFeatureVisibilityController extends NativeBase {
    public static final Companion Companion = new Companion();
    public final List<VisibleFeature> visibleFeatures;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SelectableFeatureVisibilityController(SelectableFeatureVisibilityChangedCallback selectableFeatureVisibilityChangedCallback) {
        super(create(selectableFeatureVisibilityChangedCallback), Companion);
        C7384Etj.A0Y(selectableFeatureVisibilityChangedCallback, 0);
        cacheThisInstance();
    }

    private final native void cacheThisInstance();

    public static final native long create(SelectableFeatureVisibilityChangedCallback selectableFeatureVisibilityChangedCallback);

    public static final native void disposeNativeHandle(long j);

    public final native List<VisibleFeature> getVisibleFeatures();

    public final native void setMinVisibilityDuration(long j);

    public final native void setMonitoredLayerIds(List<String> list);

    public final class Companion implements NativeBase.Disposer {
        public Companion() {
        }

        public final long create(SelectableFeatureVisibilityChangedCallback selectableFeatureVisibilityChangedCallback) {
            return SelectableFeatureVisibilityController.create(selectableFeatureVisibilityChangedCallback);
        }

        private final void disposeNativeHandle(long j) {
            SelectableFeatureVisibilityController.disposeNativeHandle(j);
        }

        @Override // com.meta.maps.NativeBase.Disposer
        public void dispose(long j) {
            SelectableFeatureVisibilityController.disposeNativeHandle(j);
        }

        public /* synthetic */ Companion(C06H c06h) {
        }
    }

    public SelectableFeatureVisibilityController(long j, Object obj) {
        super(j, Companion);
    }
}
