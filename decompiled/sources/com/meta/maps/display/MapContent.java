package com.meta.maps.display;

import X.AnonymousClass003;
import X.C06H;
import X.C7384Etj;
import com.meta.maps.NativeBase;
import java.util.List;

/* loaded from: classes4.dex */
public class MapContent extends NativeBase implements ComponentBase {
    public static final Companion Companion = new Companion();
    public final String identifier;
    public String insertBeforeIdentifier;
    public final boolean isAttached;
    public final List<LayerComponent> layers;
    public final List<SourceComponent> sources;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MapContent(String str) {
        super(create(str), Companion);
        C7384Etj.A0Y(str, 0);
        cacheThisInstance();
    }

    private final native void cacheThisInstance();

    public static final native long create(String str);

    public static final native long create(String str, String str2);

    public static final native void disposeNativeHandle(long j);

    public final native FeatureController getFeatureController();

    @Override // com.meta.maps.display.ComponentBase
    public native String getIdentifier();

    public final native String getInsertBeforeIdentifier();

    public final native List<LayerComponent> getLayers();

    public final native List<SourceComponent> getSources();

    @Override // com.meta.maps.display.ComponentBase
    public native boolean isAttached();

    public final native void setFeatureInteractionCallback(FeatureInteractionCallback featureInteractionCallback, boolean z);

    public final native void setInsertBeforeIdentifier(String str);

    public final class Companion implements NativeBase.Disposer {
        public final long create(String str) {
            return MapContent.create(str);
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        private final void disposeNativeHandle(long j) {
            MapContent.disposeNativeHandle(j);
        }

        @Override // com.meta.maps.NativeBase.Disposer
        public void dispose(long j) {
            MapContent.disposeNativeHandle(j);
        }

        public Companion() {
        }

        public final long create(String str, String str2) {
            return MapContent.create(str, str2);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MapContent(String str, String str2) {
        super(create(str, str2), Companion);
        AnonymousClass003.A0u(str, str2);
        cacheThisInstance();
    }

    public MapContent(long j, Object obj) {
        super(j, Companion);
    }
}
