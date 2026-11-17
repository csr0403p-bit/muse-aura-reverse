package com.meta.maps.display;

import X.AnonymousClass005;
import X.C06H;
import com.meta.maps.NativeBase;

/* loaded from: classes4.dex */
public final class GeoJsonMapContent extends MapContent {
    public static final Companion Companion = new Companion();

    private final native void cacheThisInstance();

    public static final native long create(String str, GeoJsonObject geoJsonObject, String str2);

    public static final native long create(String str, GeoJsonObject geoJsonObject, String str2, GeoJsonClusterOptions geoJsonClusterOptions);

    public static final native long create(String str, String str2, String str3);

    public static final native long create(String str, String str2, String str3, GeoJsonClusterOptions geoJsonClusterOptions);

    public final native int getClusterExpansionZoom(int i);

    public final native boolean updateGeoJson(GeoJsonObject geoJsonObject);

    public final native boolean updateGeoJson(String str);

    public final native boolean updateLayerDefinitions(String str);

    public final class Companion {
        public final long create(String str, GeoJsonObject geoJsonObject, String str2) {
            return GeoJsonMapContent.create(str, geoJsonObject, str2);
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }

        public final long create(String str, GeoJsonObject geoJsonObject, String str2, GeoJsonClusterOptions geoJsonClusterOptions) {
            return GeoJsonMapContent.create(str, geoJsonObject, str2, geoJsonClusterOptions);
        }

        public final long create(String str, String str2, String str3, GeoJsonClusterOptions geoJsonClusterOptions) {
            return GeoJsonMapContent.create(str, str2, str3, geoJsonClusterOptions);
        }

        public final long create(String str, String str2, String str3) {
            return GeoJsonMapContent.create(str, str2, str3);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GeoJsonMapContent(String str, GeoJsonObject geoJsonObject, String str2) {
        super(create(str, geoJsonObject, str2), (NativeBase.Disposer) MapContent.Companion);
        AnonymousClass005.A0x(str, geoJsonObject, str2);
        cacheThisInstance();
    }

    public GeoJsonMapContent(long j, Object obj) {
        super(j, (NativeBase.Disposer) MapContent.Companion);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GeoJsonMapContent(String str, GeoJsonObject geoJsonObject, String str2, GeoJsonClusterOptions geoJsonClusterOptions) {
        super(create(str, geoJsonObject, str2, geoJsonClusterOptions), (NativeBase.Disposer) MapContent.Companion);
        AnonymousClass005.A14(str, geoJsonObject, str2, geoJsonClusterOptions);
        cacheThisInstance();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GeoJsonMapContent(String str, String str2, String str3, GeoJsonClusterOptions geoJsonClusterOptions) {
        super(create(str, str2, str3, geoJsonClusterOptions), (NativeBase.Disposer) MapContent.Companion);
        AnonymousClass005.A14(str, str2, str3, geoJsonClusterOptions);
        cacheThisInstance();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GeoJsonMapContent(String str, String str2, String str3) {
        super(create(str, str2, str3), (NativeBase.Disposer) MapContent.Companion);
        AnonymousClass005.A0x(str, str2, str3);
        cacheThisInstance();
    }
}
