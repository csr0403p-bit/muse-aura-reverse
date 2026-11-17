package com.meta.maps.display;

import X.C06H;
import com.meta.maps.NativeBase;
import com.meta.maps.core.Analytics;
import java.util.List;

/* loaded from: classes4.dex */
public class MapController extends MaplibrePlugin {
    public static final Companion Companion = new Companion();
    public final List<MapContent> content;

    private final native void cacheThisInstance();

    public static final native long create();

    public final native void addImageProvider(ImageProvider imageProvider);

    public final native void addMapContent(MapContent mapContent);

    public final native MapContent findMapContent(String str);

    public final native List<MapContent> getContent();

    public final native GestureInteractionHandler getGestureInteractionHandler();

    public final native ImageController getImageController();

    public final native SelectionController getSelectionController();

    public final native double getTileLodZoomShift();

    public final native boolean isPanEnabled();

    public final native boolean isZoomEnabled();

    public final native void onStyleLoaded();

    public final native void onStyleReset();

    public final native void registerSelectableFeatureVisibilityController(SelectableFeatureVisibilityController selectableFeatureVisibilityController);

    public final native void removeAllContent();

    public final native void removeImageProvider(ImageProvider imageProvider);

    public final native void removeMapContent(MapContent mapContent);

    public final native void removeMapContent(String str);

    public final native void resetLayerVisibility(String str);

    public final native void setAnalytics(Analytics analytics);

    public final native void setFeatureInteractionCallback(FeatureInteractionCallback featureInteractionCallback, boolean z);

    public final native void setIncludeGeoJson(boolean z);

    public final native boolean setLayerVisibility(String str, boolean z);

    public final native void setPanEnabled(boolean z);

    public final native void setTileLodZoomShift(double d);

    public final native void setVisibilityQueryInsets(SDKInsets sDKInsets);

    public final native void setZoomEnabled(boolean z);

    public final native void unregisterSelectableFeatureVisibilityController(SelectableFeatureVisibilityController selectableFeatureVisibilityController);

    public final class Companion {
        public final long create() {
            return MapController.create();
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public MapController(long j, Object obj) {
        super(j, (NativeBase.Disposer) MaplibrePlugin.Companion);
    }

    public MapController() {
        super(create(), (NativeBase.Disposer) MaplibrePlugin.Companion);
        cacheThisInstance();
    }
}
