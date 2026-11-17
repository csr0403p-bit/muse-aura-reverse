package com.meta.maps.display;

import X.C06H;
import com.meta.maps.NativeBase;
import com.meta.maps.core.GeoCoordinates;

/* loaded from: classes4.dex */
public final class SelectionControllerImpl extends NativeBase implements SelectionController {
    public static final Companion Companion = new Companion();
    public final SelectedFeature selectedFeature;

    public static final native void disposeNativeHandle(long j);

    @Override // com.meta.maps.display.SelectionController
    public native void addSelectionChangedCallback(SelectionChangedCallback selectionChangedCallback);

    @Override // com.meta.maps.display.SelectionController
    public native void clearSelection();

    @Override // com.meta.maps.display.SelectionController
    public native SelectedFeature getSelectedFeature();

    @Override // com.meta.maps.display.SelectionController
    public native void registerSelectableContent(SelectableContent selectableContent);

    @Override // com.meta.maps.display.SelectionController
    public native void removeSelectionChangedCallback(SelectionChangedCallback selectionChangedCallback);

    @Override // com.meta.maps.display.SelectionController
    public native void select(FeatureInteractionData featureInteractionData, String str, GeoCoordinates geoCoordinates);

    @Override // com.meta.maps.display.SelectionController
    public native boolean selectById(String str);

    @Override // com.meta.maps.display.SelectionController
    public native void toggleSelection(FeatureInteractionData featureInteractionData, String str, GeoCoordinates geoCoordinates);

    @Override // com.meta.maps.display.SelectionController
    public native void unregisterSelectableContent(SelectableContent selectableContent);

    public SelectionControllerImpl(long j, Object obj) {
        super(j, Companion);
    }

    public final class Companion implements NativeBase.Disposer {
        public /* synthetic */ Companion(C06H c06h) {
        }

        private final void disposeNativeHandle(long j) {
            SelectionControllerImpl.disposeNativeHandle(j);
        }

        @Override // com.meta.maps.NativeBase.Disposer
        public void dispose(long j) {
            SelectionControllerImpl.disposeNativeHandle(j);
        }

        public Companion() {
        }
    }
}
