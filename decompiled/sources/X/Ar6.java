package X;

import android.view.ActionMode;
import android.view.View;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final class Ar6 implements InterfaceC1084AXr {
    public ActionMode A00;
    public Runnable A01;
    public Runnable A02;
    public final View A03;
    public final Function0<InterfaceC1497Ak4> A05;
    public final G0U<BNM, BNM> A06;
    public final C5WW A09 = new C5WW();
    public final BBO A04 = new BBO(C2294BSu.A00(this, 15));
    public final G0U<Object, Unit> A07 = C2294BSu.A00(this, 16);
    public final G0U<Object, Unit> A08 = C2294BSu.A00(this, 17);

    @Override // X.InterfaceC1084AXr
    public final Object Afg(InterfaceC1740Apd interfaceC1740Apd, HtJ<? super Unit> htJ) {
        Object objA01 = this.A09.A01(C3UY.A02, htJ, new BU7(this, interfaceC1740Apd, null, 2));
        return objA01 != EnumC10460Hji.A02 ? Unit.INSTANCE : objA01;
    }

    /* JADX WARN: Incorrect types in method signature: (Landroid/view/View;LX/G0U<-LX/BNM;+LX/BNM;>;Lkotlin/jvm/functions/Function0<+LX/Ak4;>;)V */
    public Ar6(View view, Function0 function0, G0U g0u) {
        this.A03 = view;
        this.A06 = g0u;
        this.A05 = function0;
    }
}
