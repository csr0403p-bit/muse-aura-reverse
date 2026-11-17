package X;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.facebook.aura.file.docx.DocxParser;
import com.facebook.aura.gateway.service.GeofenceEventWorker;
import com.facebook.maps.basemap.BaseMapSavedState;
import com.meta.maps.core.Analytics;
import com.meta.maps.core.MapsSdkProvider;
import com.meta.maps.display.MapContext;
import com.meta.maps.display.MapController;
import com.meta.maps.display.MaplibrePluginBridge;
import com.meta.maps.display.MapsSdkProviderDisplayExtKt;
import com.meta.maps.display.camera.CameraAnimationPlugin;
import com.meta.maps.display.camera.CameraPose;
import com.meta.maps.display.logging.MapEventLoggerPlugin;
import com.meta.maps.display.routeline.RouteLinePlugin;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.maplibre.android.camera.CameraPosition;
import org.maplibre.android.geometry.LatLng;
import org.maplibre.android.maps.MapLibreMap;
import org.maplibre.android.maps.MapLibreMapOptions;
import org.maplibre.android.maps.MapView;
import org.maplibre.android.maps.UiSettings;

/* loaded from: classes4.dex */
public final class AL9 extends FrameLayout {
    public View.OnLayoutChangeListener A00;
    public View.OnLayoutChangeListener A01;
    public View.OnLayoutChangeListener A02;
    public C1HY A03;
    public C1HY A04;
    public ALE A05;
    public ALL A06;
    public ALM A07;
    public C9n4 A08;
    public ALF A09;
    public ALJ A0A;
    public CameraAnimationPlugin A0B;
    public CameraPose A0C;
    public String A0D;
    public String A0E;
    public HxE<C9V6, Boolean> A0F;
    public G0U<? super C9n4, Unit> A0G;
    public G0U<? super C9n4, Unit> A0H;
    public boolean A0I;
    public boolean A0J;
    public boolean A0K;
    public boolean A0L;
    public boolean A0M;
    public F2N A0N;
    public Dg3 A0O;
    public MapContext A0P;
    public HoC A0Q;
    public MapLibreMap.OnMapClickListener A0R;
    public MapLibreMap A0S;
    public MapLibreMap A0T;
    public MapView.OnDidFailLoadingMapListener A0U;
    public MapView A0V;
    public boolean A0W;
    public final AFV A0X;
    public final List<Function0<Unit>> A0Y;
    public final BLG A0Z;
    public final C1BN A0a;
    public volatile boolean A0b;

    /* JADX INFO: Access modifiers changed from: private */
    public final void A0D(C9V6 c9v6, MapLibreMap mapLibreMap, boolean z) {
        HxE<C9V6, Boolean> hxEA0q;
        MapView mapView = this.A0V;
        if (mapView != null) {
            String str = z ? c9v6.A00 : c9v6.A01;
            if (C7384Etj.areEqual(str, this.A0E)) {
                hxEA0q = null;
            } else {
                if (this.A0E == null) {
                    if (C7384Etj.areEqual(str, this.A0D)) {
                        return;
                    }
                    this.A0E = str;
                    boolean z2 = this.A0I;
                    boolean z3 = !z2;
                    if (!z2) {
                        this.A0Z.Af8(C0979ALb.A00);
                    }
                    if (this.A0J) {
                        getMapController().onStyleReset();
                        this.A0J = false;
                    }
                    mapLibreMap.setStyle(str, new AL8(this, str, mapLibreMap, mapView, z3));
                    return;
                }
                hxEA0q = AnonymousClass002.A0q(c9v6, z);
            }
            this.A0F = hxEA0q;
        }
    }

    public final void A0M(C9V6 c9v6, boolean z) {
        C7384Etj.A0Y(c9v6, 0);
        if (this.A0b) {
            return;
        }
        MapLibreMap mapLibreMap = this.A0T;
        if (mapLibreMap == null) {
            this.A0F = AnonymousClass002.A0q(c9v6, z);
        } else {
            A0D(c9v6, mapLibreMap, z);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchRestoreInstanceState(SparseArray<Parcelable> sparseArray) {
        C7384Etj.A0Y(sparseArray, 0);
        dispatchThawSelfOnly(sparseArray);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchSaveInstanceState(SparseArray<Parcelable> sparseArray) {
        C7384Etj.A0Y(sparseArray, 0);
        dispatchFreezeSelfOnly(sparseArray);
    }

    public final void setAttribution(ALJ alj) {
        MapLibreMap mapLibreMap;
        C7384Etj.A0Y(alj, 0);
        if (this.A0b || C7384Etj.areEqual(this.A0A, alj)) {
            return;
        }
        this.A0A = alj;
        MapView mapView = this.A0V;
        if (mapView == null || (mapLibreMap = this.A0T) == null) {
            return;
        }
        ALI.A00(alj, mapLibreMap, mapView);
    }

    public final void setGestures(ALL all) {
        C7384Etj.A0Y(all, 0);
        if (this.A0b || C7384Etj.areEqual(this.A06, all)) {
            return;
        }
        this.A06 = all;
        MapLibreMap mapLibreMap = this.A0T;
        if (mapLibreMap != null) {
            A09(all, mapLibreMap);
        }
    }

    private final void A05() {
        F2N f2n;
        Dg3 dg3 = this.A0O;
        if (dg3 != null && (f2n = this.A0N) != null) {
            f2n.A05(dg3);
        }
        this.A0O = null;
        this.A0N = null;
    }

    public static final void A07(ALE ale, MapLibreMap mapLibreMap) {
        C9V4 c9v4 = ale.A03;
        mapLibreMap.setMinZoomPreference(c9v4.A01);
        mapLibreMap.setMaxZoomPreference(c9v4.A00);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:26:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A0B(X.C9n4 r11, X.AL9 r12) {
        /*
            X.ALM r3 = r12.A07     // Catch: java.lang.Throwable -> L69
            if (r3 == 0) goto L60
            com.meta.maps.display.camera.CameraPose r0 = new com.meta.maps.display.camera.CameraPose     // Catch: java.lang.Throwable -> L69
            r0.<init>()     // Catch: java.lang.Throwable -> L69
            double r5 = r3.A02     // Catch: java.lang.Throwable -> L69
            double r7 = r3.A03     // Catch: java.lang.Throwable -> L69
            double r1 = r3.A00     // Catch: java.lang.Throwable -> L69
            java.lang.Double r9 = java.lang.Double.valueOf(r1)     // Catch: java.lang.Throwable -> L69
            com.meta.maps.core.GeoCoordinates r4 = new com.meta.maps.core.GeoCoordinates     // Catch: java.lang.Throwable -> L69
            r4.<init>(r5, r7, r9)     // Catch: java.lang.Throwable -> L69
            r0.center = r4     // Catch: java.lang.Throwable -> L69
            double r1 = r3.A05     // Catch: java.lang.Throwable -> L69
            java.lang.Double r1 = java.lang.Double.valueOf(r1)     // Catch: java.lang.Throwable -> L69
            r0.zoomLevel = r1     // Catch: java.lang.Throwable -> L69
            double r1 = r3.A04     // Catch: java.lang.Throwable -> L69
            java.lang.Double r1 = java.lang.Double.valueOf(r1)     // Catch: java.lang.Throwable -> L69
            r0.pitch = r1     // Catch: java.lang.Throwable -> L69
            double r1 = r3.A01     // Catch: java.lang.Throwable -> L69
            java.lang.Double r1 = java.lang.Double.valueOf(r1)     // Catch: java.lang.Throwable -> L69
            r0.heading = r1     // Catch: java.lang.Throwable -> L69
            double[] r2 = r3.A06     // Catch: java.lang.Throwable -> L69
            if (r2 == 0) goto L49
            r1 = 0
            r3 = r2[r1]     // Catch: java.lang.Throwable -> L69
            r1 = 1
            r5 = r2[r1]     // Catch: java.lang.Throwable -> L69
            r1 = 2
            r7 = r2[r1]     // Catch: java.lang.Throwable -> L69
            r1 = 3
            r9 = r2[r1]     // Catch: java.lang.Throwable -> L69
            com.meta.maps.display.SDKInsets r2 = new com.meta.maps.display.SDKInsets     // Catch: java.lang.Throwable -> L69
            r2.<init>(r3, r5, r7, r9)     // Catch: java.lang.Throwable -> L69
            r0.padding = r2     // Catch: java.lang.Throwable -> L69
        L49:
            com.meta.maps.display.camera.CameraFraming r1 = com.meta.maps.display.camera.CameraFraming.WHOLE_MAP     // Catch: java.lang.Throwable -> L69
            r0.framing = r1     // Catch: java.lang.Throwable -> L69
        L4d:
            r1 = 0
            r12.A07 = r1     // Catch: java.lang.Throwable -> L69
            r12.A0C = r1     // Catch: java.lang.Throwable -> L69
            com.meta.maps.display.camera.CameraAnimationPlugin r1 = r12.A0B     // Catch: java.lang.Throwable -> L69
            if (r1 != 0) goto L65
            java.lang.String r0 = "cameraPlugin"
            X.C7384Etj.A0b(r0)     // Catch: java.lang.Throwable -> L69
            X.F60 r0 = X.F60.createAndThrow()     // Catch: java.lang.Throwable -> L69
            throw r0     // Catch: java.lang.Throwable -> L69
        L60:
            com.meta.maps.display.camera.CameraPose r0 = r12.A0C     // Catch: java.lang.Throwable -> L69
            if (r0 != 0) goto L4d
            goto L75
        L65:
            r1.moveCameraTo(r0)     // Catch: java.lang.Throwable -> L69
            goto L75
        L69:
            r2 = move-exception
            boolean r0 = r2 instanceof java.util.concurrent.CancellationException
            if (r0 != 0) goto L87
            java.lang.String r1 = "BaseMapView"
            java.lang.String r0 = "Initial camera application failed"
            X.CFK.A08(r1, r0, r2)
        L75:
            r0 = 1
            r12.A0W = r0
            X.BLG r1 = r12.A0Z
            X.AC5 r0 = X.AC5.A00
            r1.Af8(r0)
            X.G0U<? super X.9n4, kotlin.Unit> r0 = r12.A0H
            if (r0 == 0) goto L86
            r0.invoke(r11)
        L86:
            return
        L87:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AL9.A0B(X.9n4, X.AL9):void");
    }

    public static final void A0E(AL9 al9) {
        MapView mapView;
        if (al9.A0b || al9.A0O != null || (mapView = al9.A0V) == null) {
            return;
        }
        C1HY c1hyA00 = al9.A04;
        if (c1hyA00 == null) {
            c1hyA00 = al9.A03;
            if (c1hyA00 == null) {
                c1hyA00 = AbstractC1720Ap8.A00(al9);
            }
            if (c1hyA00 == null) {
                return;
            }
        }
        al9.A04 = c1hyA00;
        ALH alh = new ALH(al9, mapView);
        al9.A0O = alh;
        al9.A0N = c1hyA00.getLifecycle();
        c1hyA00.getLifecycle().A04(alh);
    }

    public static final void A0F(AL9 al9) {
        View.OnLayoutChangeListener onLayoutChangeListener = al9.A00;
        if (onLayoutChangeListener != null) {
            al9.removeOnLayoutChangeListener(onLayoutChangeListener);
        }
        al9.A00 = null;
        List<Function0<Unit>> list = al9.A0Y;
        List listA0X = AbstractC0878AGe.A0X(list);
        list.clear();
        if (al9.A0b) {
            return;
        }
        Iterator it = listA0X.iterator();
        while (it.hasNext()) {
            ((Function0) it.next()).invoke();
        }
    }

    public static final void A0G(AL9 al9) {
        ALE ale;
        String str;
        if (al9.A0b || al9.A0Q != null || (al9.A0Z.getValue() instanceof AL5) || (ale = al9.A05) == null) {
            return;
        }
        C1HY c1hyA00 = al9.A03;
        if (c1hyA00 == null && (c1hyA00 = AbstractC1720Ap8.A00(al9)) == null) {
            if (!al9.isAttachedToWindow()) {
                return;
            } else {
                str = "BaseMapView requires a LifecycleOwner";
            }
        } else {
            if (C8j3.A0m(c1hyA00) != EnumC10573Huf.A03) {
                al9.A04 = c1hyA00;
                C10533Hqc c10533HqcA11 = AnonymousClass001.A11(new BUC(al9, (HtJ) null, ale, (HtJ<? super BUC>) 30), F31.A00(c1hyA00));
                al9.A0Q = c10533HqcA11;
                c10533HqcA11.AO5(new C2334BUi(25, c1hyA00, al9));
                return;
            }
            str = "BaseMapView LifecycleOwner is already destroyed";
        }
        A0H(al9, str);
    }

    public static final void A0H(AL9 al9, String str) {
        if (al9.A0b) {
            return;
        }
        BLG blg = al9.A0Z;
        if (blg.getValue() instanceof AL5) {
            return;
        }
        AnonymousClass002.A1I(blg, new AL5(new AL4(C79.A00, C3cG.A0Q(str))));
    }

    private final void A0K(MapView mapView) {
        if (this.A0L) {
            this.A0L = false;
        }
        if (this.A0M) {
            mapView.onStop();
            this.A0M = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final MapController getMapController() {
        MapContext mapContext = this.A0P;
        if (mapContext != null) {
            return mapContext.getMapController();
        }
        throw C3cG.A0Q("mapController is unavailable before onMapReady");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setupFeatureTapListener(MapLibreMap mapLibreMap) {
        MapLibreMap mapLibreMap2;
        MapLibreMap.OnMapClickListener onMapClickListener = this.A0R;
        if (onMapClickListener != null && (mapLibreMap2 = this.A0S) != null) {
            mapLibreMap2.removeOnMapClickListener(onMapClickListener);
        }
        AL7 al7 = new AL7(this, mapLibreMap, C60Q.A0B(getContext()).density);
        this.A0R = al7;
        this.A0S = mapLibreMap;
        mapLibreMap.addOnMapClickListener(al7);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void A0L() {
        MapLibreMap mapLibreMap;
        if (this.A0b) {
            return;
        }
        this.A0b = true;
        this.A0Z.Af8(ALZ.A00);
        G0U<? super C9n4, Unit> g0u = this.A0G;
        this.A0G = null;
        C9n4 c9n4 = this.A08;
        if (g0u != null) {
            try {
                C9n4 c9n42 = null;
                if (this.A0W) {
                    c9n42 = c9n4;
                }
                g0u.invoke(c9n42);
            } finally {
                if (c9n4 != null) {
                    c9n4.A04 = false;
                    c9n4.A00.A03();
                }
                HoC hoC = this.A0Q;
                if (hoC != null) {
                    hoC.A5w(null);
                }
                this.A0Q = null;
                A05();
                View.OnLayoutChangeListener onLayoutChangeListener = this.A01;
                if (onLayoutChangeListener != null) {
                    removeOnLayoutChangeListener(onLayoutChangeListener);
                }
                this.A01 = null;
                View.OnLayoutChangeListener onLayoutChangeListener2 = this.A02;
                if (onLayoutChangeListener2 != null) {
                    removeOnLayoutChangeListener(onLayoutChangeListener2);
                }
                this.A02 = null;
                View.OnLayoutChangeListener onLayoutChangeListener3 = this.A00;
                if (onLayoutChangeListener3 != null) {
                    removeOnLayoutChangeListener(onLayoutChangeListener3);
                }
                this.A00 = null;
                this.A0Y.clear();
                MapLibreMap.OnMapClickListener onMapClickListener = this.A0R;
                if (onMapClickListener != null && (mapLibreMap = this.A0S) != null) {
                    mapLibreMap.removeOnMapClickListener(onMapClickListener);
                }
                this.A0R = null;
                this.A0S = null;
                ALF alf = this.A09;
                if (alf != null) {
                    try {
                        alf.close();
                    } catch (Throwable th) {
                        CFK.A08("BaseMapView", "FancyPins teardown failed", th);
                    }
                    try {
                        removeView(alf.A02);
                    } catch (Throwable th2) {
                        CFK.A08("BaseMapView", "FancyPins overlay removal failed", th2);
                    }
                }
                this.A09 = null;
                MapView mapView = this.A0V;
                if (mapView != null) {
                    A0K(mapView);
                    MapView.OnDidFailLoadingMapListener onDidFailLoadingMapListener = this.A0U;
                    if (onDidFailLoadingMapListener != null) {
                        mapView.removeOnDidFailLoadingMapListener(onDidFailLoadingMapListener);
                    }
                    removeView(mapView);
                    mapView.onDestroy();
                }
                this.A0V = null;
                this.A0U = null;
                this.A0T = null;
                this.A06 = null;
                this.A0A = null;
                this.A07 = null;
                this.A0C = null;
                this.A0W = false;
                this.A08 = null;
                this.A0H = null;
                this.A03 = null;
                this.A04 = null;
            }
        }
    }

    public final G0U<C9n4, Unit> getOnBeforeDestroy() {
        return this.A0G;
    }

    public final G0U<C9n4, Unit> getOnMapReady() {
        return this.A0H;
    }

    public final C9n4 getSession() {
        C9n4 c9n4 = this.A08;
        if (!this.A0W || this.A0b) {
            return null;
        }
        return c9n4;
    }

    public final C1BN getState() {
        return this.A0a;
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        int length;
        if (!(parcelable instanceof BaseMapSavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        BaseMapSavedState baseMapSavedState = (BaseMapSavedState) parcelable;
        super.onRestoreInstanceState(baseMapSavedState.getSuperState());
        if (this.A0W) {
            return;
        }
        Bundle bundle = baseMapSavedState.A00;
        if (bundle.getInt("version") == 1 && bundle.getBoolean("has_camera")) {
            Set<String> set = BaseMapSavedState.A01;
            if (!(set instanceof Collection) || !set.isEmpty()) {
                Iterator<String> it = set.iterator();
                while (it.hasNext()) {
                    if (!bundle.containsKey(AnonymousClass005.A0j(it))) {
                        return;
                    }
                }
            }
            double d = bundle.getDouble(GeofenceEventWorker.KEY_LATITUDE);
            double d2 = bundle.getDouble(GeofenceEventWorker.KEY_LONGITUDE);
            double d3 = bundle.getDouble("altitude");
            double d4 = bundle.getDouble("zoom");
            double d5 = bundle.getDouble("pitch");
            double d6 = bundle.getDouble(DocxParser.HEADING_STYLE_PREFIX);
            double[] doubleArray = bundle.getDoubleArray("padding");
            if (doubleArray == null || (length = doubleArray.length) != 4) {
                doubleArray = null;
                break;
            }
            int i = 0;
            do {
                double d7 = doubleArray[i];
                if (Math.abs(d7) > Double.MAX_VALUE || d7 < 0.0d) {
                    doubleArray = null;
                    break;
                }
                i++;
            } while (i < length);
            ALM alm = new ALM(doubleArray, d, d2, d3, d4, d5, d6);
            double d8 = alm.A02;
            if (Math.abs(d8) > Double.MAX_VALUE || -90.0d > d8 || d8 > 90.0d || Math.abs(alm.A03) > Double.MAX_VALUE || Math.abs(alm.A00) > Double.MAX_VALUE || Math.abs(alm.A05) > Double.MAX_VALUE || Math.abs(alm.A04) > Double.MAX_VALUE || Math.abs(alm.A01) > Double.MAX_VALUE) {
                return;
            }
            this.A07 = alm;
        }
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        ALM almA00 = this.A07;
        if (almA00 == null) {
            MapLibreMap mapLibreMap = this.A0T;
            almA00 = null;
            if (mapLibreMap != null && this.A0W) {
                almA00 = A00(mapLibreMap);
            }
        }
        return new BaseMapSavedState(super.onSaveInstanceState(), almA00);
    }

    public AL9(Context context, AFV afv) {
        super(context);
        this.A0X = afv;
        C9286GCn c9286GCnA01 = HnJ.A01(ALc.A00);
        this.A0Z = c9286GCnA01;
        this.A0a = C3Pi.A00(c9286GCnA01);
        this.A0Y = C3cG.A0h();
    }

    public static final ALM A00(MapLibreMap mapLibreMap) {
        CameraPosition cameraPosition = mapLibreMap.getCameraPosition();
        C7384Etj.A0U(cameraPosition);
        LatLng latLng = cameraPosition.target;
        double[] dArrCopyOf = null;
        if (latLng == null) {
            return null;
        }
        double latitude = latLng.getLatitude();
        double longitude = latLng.getLongitude();
        double altitude = latLng.getAltitude();
        double d = cameraPosition.zoom;
        double d2 = cameraPosition.tilt;
        double d3 = cameraPosition.bearing;
        double[] dArr = cameraPosition.padding;
        if (dArr != null) {
            dArrCopyOf = Arrays.copyOf(dArr, dArr.length);
            C7384Etj.A0U(dArrCopyOf);
        }
        return new ALM(dArrCopyOf, latitude, longitude, altitude, d, d2, d3);
    }

    public static final void A06(ALE ale, AL9 al9, MapsSdkProvider mapsSdkProvider) {
        Analytics analytics;
        Context context = al9.getContext();
        MapLibreMapOptions mapLibreMapOptionsCreateFromAttributes = MapLibreMapOptions.createFromAttributes(context);
        ALL all = ale.A01;
        mapLibreMapOptionsCreateFromAttributes.compassEnabled(false);
        mapLibreMapOptionsCreateFromAttributes.scrollGesturesEnabled(all.A03);
        mapLibreMapOptionsCreateFromAttributes.zoomGesturesEnabled(all.A05);
        mapLibreMapOptionsCreateFromAttributes.rotateGesturesEnabled(all.A02);
        mapLibreMapOptionsCreateFromAttributes.tiltGesturesEnabled(all.A04);
        mapLibreMapOptionsCreateFromAttributes.doubleTapGesturesEnabled(all.A00);
        mapLibreMapOptionsCreateFromAttributes.quickZoomGesturesEnabled(all.A01);
        mapLibreMapOptionsCreateFromAttributes.foregroundLoadColor(ale.A00);
        mapLibreMapOptionsCreateFromAttributes.textureMode(true);
        MapView mapView = new MapView(context, mapLibreMapOptionsCreateFromAttributes);
        AL6 al6 = new AL6(al9, mapView);
        al9.A0U = al6;
        mapView.addOnDidFailLoadingMapListener(al6);
        MapEventLoggerPlugin mapEventLoggerPlugin = new MapEventLoggerPlugin();
        mapEventLoggerPlugin.setRequestId(ale.A07);
        mapEventLoggerPlugin.setSurfaceId(ale.A08);
        mapEventLoggerPlugin.setSurfaceType(ale.A06);
        if (mapsSdkProvider != null && (analytics = mapsSdkProvider.getAnalytics()) != null) {
            mapEventLoggerPlugin.setAnalytics(analytics);
        }
        al9.A0B = new CameraAnimationPlugin();
        MapContext mapContextCreateMapContext = mapsSdkProvider != null ? MapsSdkProviderDisplayExtKt.createMapContext(mapsSdkProvider) : new MapContext();
        al9.A0P = mapContextCreateMapContext;
        MapController mapController = mapContextCreateMapContext.getMapController();
        RouteLinePlugin routeLinePlugin = new RouteLinePlugin(mapController);
        MapContext mapContext = al9.A0P;
        if (mapContext == null) {
            C7384Etj.A0b("mapContext");
        } else {
            mapContext.registerPlugin(mapEventLoggerPlugin);
            MapContext mapContext2 = al9.A0P;
            if (mapContext2 == null) {
                C7384Etj.A0b("mapContext");
            } else {
                CameraAnimationPlugin cameraAnimationPlugin = al9.A0B;
                if (cameraAnimationPlugin == null) {
                    C7384Etj.A0b("cameraPlugin");
                } else {
                    mapContext2.registerPlugin(cameraAnimationPlugin);
                    MapContext mapContext3 = al9.A0P;
                    if (mapContext3 == null) {
                        C7384Etj.A0b("mapContext");
                    } else {
                        mapContext3.registerPlugin(routeLinePlugin);
                        C8831Fpd c8831Fpd = al9.A0X.A00;
                        C7384Etj.A0U(context);
                        MapContext mapContext4 = al9.A0P;
                        if (mapContext4 == null) {
                            C7384Etj.A0b("mapContext");
                        } else {
                            ALF alfA02 = c8831Fpd.A02(context, mapContext4, mapView);
                            try {
                                MapContext mapContext5 = al9.A0P;
                                if (mapContext5 == null) {
                                    C7384Etj.A0b("mapContext");
                                    throw F60.createAndThrow();
                                }
                                mapView.addPluginBridge(new MaplibrePluginBridge(mapContext5));
                                al9.A09 = alfA02;
                                CameraAnimationPlugin cameraAnimationPlugin2 = al9.A0B;
                                if (cameraAnimationPlugin2 != null) {
                                    al9.A08 = new C9n4(alfA02.A03, mapController, cameraAnimationPlugin2, routeLinePlugin);
                                    al9.A0V = mapView;
                                    al9.addView((View) mapView, (ViewGroup.LayoutParams) new FrameLayout.LayoutParams(-1, -1));
                                    al9.addView(alfA02.A02, new FrameLayout.LayoutParams(-1, -1));
                                    A0E(al9);
                                    mapView.getMapAsync(new ALB(ale, al9, mapView));
                                    return;
                                }
                                C7384Etj.A0b("cameraPlugin");
                            } catch (Throwable th) {
                                try {
                                    alfA02.close();
                                    throw th;
                                } finally {
                                }
                            }
                        }
                    }
                }
            }
        }
        throw F60.createAndThrow();
    }

    public static final void A09(ALL all, MapLibreMap mapLibreMap) {
        UiSettings uiSettings = mapLibreMap.getUiSettings();
        C7384Etj.A0U(uiSettings);
        uiSettings.setScrollGesturesEnabled(all.A03);
        uiSettings.setZoomGesturesEnabled(all.A05);
        uiSettings.setRotateGesturesEnabled(all.A02);
        uiSettings.setTiltGesturesEnabled(all.A04);
        uiSettings.setDoubleTapGesturesEnabled(all.A00);
        uiSettings.setQuickZoomGesturesEnabled(all.A01);
        uiSettings.setCompassEnabled(false);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        A0G(this);
        A0E(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        A05();
        MapView mapView = this.A0V;
        if (mapView != null) {
            A0K(mapView);
        }
        super.onDetachedFromWindow();
    }

    public final void setOnBeforeDestroy(G0U<? super C9n4, Unit> g0u) {
        this.A0G = g0u;
    }

    public final void setOnMapReady(G0U<? super C9n4, Unit> g0u) {
        this.A0H = g0u;
    }
}
