package X;

import com.meta.maps.fancypins.FancyPinDataController;
import com.meta.maps.fancypins.FancyPinOverlayView;
import com.meta.maps.fancypins.FancyPinViewRegistry;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* renamed from: X.Fpc, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8830Fpc implements HrT {
    public final FancyPinDataController A00;
    public final FancyPinOverlayView A01;
    public final FancyPinViewRegistry A02;
    public final Function0<Unit> A03;
    public final Function0<Double> A04;
    public final Function0<Boolean> A05;
    public final G0U<Double, Unit> A06;
    public final G0U<Boolean, Unit> A07;

    /* JADX WARN: Incorrect types in method signature: (Lcom/meta/maps/fancypins/FancyPinDataController;Lcom/meta/maps/fancypins/FancyPinViewRegistry;Lcom/meta/maps/fancypins/FancyPinOverlayView;Lkotlin/jvm/functions/Function0<Ljava/lang/Double;>;LX/G0U<-Ljava/lang/Double;Lkotlin/Unit;>;Lkotlin/jvm/functions/Function0<Lkotlin/Unit;>;Lkotlin/jvm/functions/Function0<Ljava/lang/Boolean;>;LX/G0U<-Ljava/lang/Boolean;Lkotlin/Unit;>;)V */
    public C8830Fpc(FancyPinDataController fancyPinDataController, FancyPinOverlayView fancyPinOverlayView, FancyPinViewRegistry fancyPinViewRegistry, Function0 function0, Function0 function02, Function0 function03, G0U g0u, G0U g0u2) {
        this.A00 = fancyPinDataController;
        this.A02 = fancyPinViewRegistry;
        this.A01 = fancyPinOverlayView;
        this.A04 = function0;
        this.A06 = g0u;
        this.A03 = function02;
        this.A05 = function03;
        this.A07 = g0u2;
    }
}
