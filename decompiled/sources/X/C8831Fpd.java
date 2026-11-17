package X;

import android.content.Context;
import com.meta.maps.display.MapContext;
import com.meta.maps.display.fancypins.FancyPinsMapFrameSyncExecutor;
import com.meta.maps.display.fancypins.FancyPinsPlugin;
import com.meta.maps.fancypins.FancyPinDataController;
import com.meta.maps.fancypins.FancyPinEngine;
import com.meta.maps.fancypins.FancyPinOverlayView;
import com.meta.maps.fancypins.FancyPinViewRegistry;
import com.meta.maps.fancypins.LayoutEngine;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kotlin.Unit;
import org.maplibre.android.maps.MapView;

/* renamed from: X.Fpd, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final /* synthetic */ class C8831Fpd implements InterfaceC2349BUy {
    public static final C8831Fpd A00 = new C8831Fpd();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1, types: [T, android.view.View, com.meta.maps.fancypins.FancyPinOverlayView, java.lang.Object] */
    public static final ALF A00(Context context, MapContext mapContext, MapView mapView) throws Throwable {
        ExecutorService executorServiceNewSingleThreadExecutor;
        FancyPinsMapFrameSyncExecutor fancyPinsMapFrameSyncExecutor;
        Object objA0s;
        Object objA0s2;
        Object objA0s3;
        Object objA0s4;
        FancyPinDataController fancyPinDataController;
        FancyPinsPlugin fancyPinsPlugin = new FancyPinsPlugin();
        mapContext.registerPlugin(fancyPinsPlugin);
        C10543Hqv c10543HqvA0z = C3cG.A0z();
        Object objA0s5 = null;
        boolean z = false;
        try {
            FancyPinEngine engine = fancyPinsPlugin.getEngine();
            FancyPinViewRegistry fancyPinViewRegistry = new FancyPinViewRegistry();
            fancyPinsMapFrameSyncExecutor = new FancyPinsMapFrameSyncExecutor(mapView, FZS.A02(fancyPinsPlugin, 26), FZS.A02(c10543HqvA0z, 27));
            try {
                float f = FancyPinOverlayView.DEFAULT_BROADPHASE_EXTENT;
                ?? fancyPinOverlayView = new FancyPinOverlayView(context, fancyPinViewRegistry, mapView.getPixelRatio(), fancyPinsMapFrameSyncExecutor, true);
                c10543HqvA0z.element = fancyPinOverlayView;
                executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor(ThreadFactoryC8835Fpk.A00);
                try {
                    LayoutEngine layoutEngine = new LayoutEngine();
                    C7384Etj.A0X(executorServiceNewSingleThreadExecutor);
                    fancyPinDataController = new FancyPinDataController(engine, layoutEngine, fancyPinViewRegistry, executorServiceNewSingleThreadExecutor, new C8826Fle(fancyPinsPlugin, 5));
                } catch (Throwable th) {
                    th = th;
                    fancyPinDataController = null;
                }
                try {
                    C8832Fpe c8832Fpe = new C8832Fpe(new C8830Fpc(fancyPinDataController, fancyPinOverlayView, fancyPinViewRegistry, FZO.A02(engine, 15), new C8197FYo(11, fancyPinsPlugin, engine), FZO.A02(fancyPinsPlugin, 16), new FZG(5, engine, fancyPinsPlugin), FZS.A02(fancyPinsPlugin, 25)));
                    z = true;
                    fancyPinOverlayView.bindEngine(engine, fancyPinDataController);
                    return new ALF(fancyPinOverlayView, c8832Fpe, new C8826Fle(fancyPinDataController, 1), new C8826Fle(fancyPinOverlayView, 2), new C8826Fle(fancyPinsMapFrameSyncExecutor, 3), new C8197FYo(mapContext, fancyPinsPlugin, 9), new C8826Fle(fancyPinsPlugin, 4), new C8197FYo(mapContext, fancyPinsPlugin, 10), FZO.A02(executorServiceNewSingleThreadExecutor, 14), new C8889Ft6(fancyPinOverlayView, 1));
                } catch (Throwable th2) {
                    th = th2;
                    if (fancyPinDataController != null) {
                        try {
                            fancyPinDataController.close();
                            objA0s = Unit.INSTANCE;
                        } catch (Throwable th3) {
                            objA0s = C3cG.A0s(th3);
                        }
                    } else {
                        objA0s = null;
                    }
                    A01(objA0s, th);
                    if (z) {
                        try {
                            FancyPinOverlayView fancyPinOverlayView2 = (FancyPinOverlayView) c10543HqvA0z.element;
                            if (fancyPinOverlayView2 != null) {
                                fancyPinOverlayView2.unbindEngine();
                                objA0s2 = Unit.INSTANCE;
                            } else {
                                objA0s2 = null;
                            }
                        } catch (Throwable th4) {
                            objA0s2 = C3cG.A0s(th4);
                        }
                        A01(objA0s2, th);
                    }
                    if (fancyPinsMapFrameSyncExecutor != null) {
                        try {
                            fancyPinsMapFrameSyncExecutor.close();
                            objA0s3 = Unit.INSTANCE;
                        } catch (Throwable th5) {
                            objA0s3 = C3cG.A0s(th5);
                        }
                    } else {
                        objA0s3 = null;
                    }
                    A01(objA0s3, th);
                    try {
                    } catch (Throwable th6) {
                        objA0s4 = C3cG.A0s(th6);
                    }
                    if (!mapContext.unregisterPlugin(fancyPinsPlugin)) {
                        throw BV4.A0S();
                    }
                    objA0s4 = Unit.INSTANCE;
                    A01(objA0s4, th);
                    if (executorServiceNewSingleThreadExecutor != null) {
                        try {
                            objA0s5 = executorServiceNewSingleThreadExecutor.shutdownNow();
                        } catch (Throwable th7) {
                            objA0s5 = C3cG.A0s(th7);
                        }
                    }
                    A01(objA0s5, th);
                    throw th;
                }
            } catch (Throwable th8) {
                th = th8;
                executorServiceNewSingleThreadExecutor = null;
            }
        } catch (Throwable th9) {
            th = th9;
            executorServiceNewSingleThreadExecutor = null;
            fancyPinsMapFrameSyncExecutor = null;
        }
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof C8831Fpd) && (obj instanceof InterfaceC2349BUy)) {
            return C3cI.A1V(obj, getFunctionDelegate());
        }
        return false;
    }

    @Override // X.InterfaceC2349BUy
    public final Ht9<?> getFunctionDelegate() {
        return new C7438Evz(3, AbstractC8836Fq3.class, "createBaseMapFancyPinsRuntime", "createBaseMapFancyPinsRuntime(Landroid/content/Context;Lcom/meta/maps/display/MapContext;Lorg/maplibre/android/maps/MapView;)Lcom/facebook/maps/basemap/BaseMapFancyPinsRuntime;", 1);
    }

    public static void A01(Object obj, Throwable th) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        Throwable thA00 = HsJ.A00(obj);
        if (thA00 == null || thA00 == th) {
            return;
        }
        Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, thA00);
    }

    public final ALF A02(Context context, MapContext mapContext, MapView mapView) {
        return A00(context, mapContext, mapView);
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }
}
