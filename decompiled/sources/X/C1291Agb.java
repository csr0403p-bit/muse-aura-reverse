package X;

import android.graphics.Canvas;
import android.graphics.Point;
import android.view.View;
import kotlin.Unit;

/* renamed from: X.Agb, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1291Agb extends View.DragShadowBuilder {
    public final long A00;
    public final AXN A01;
    public final G0U<AT3, Unit> A02;

    @Override // android.view.View.DragShadowBuilder
    public final void onDrawShadow(Canvas canvas) {
        C1325AhC c1325AhC = new C1325AhC();
        AXN axn = this.A01;
        long j = this.A00;
        EnumC1820Arj enumC1820Arj = EnumC1820Arj.A02;
        Canvas canvas2 = AbstractC1290Aga.A00;
        C1572Alm c1572Alm = new C1572Alm();
        c1572Alm.A00 = canvas;
        G0U<AT3, Unit> g0u = this.A02;
        AW9 aw9 = c1325AhC.A02;
        AXN axn2 = aw9.A02;
        EnumC1820Arj enumC1820Arj2 = aw9.A03;
        InterfaceC1327AhE interfaceC1327AhE = aw9.A01;
        long j2 = aw9.A00;
        aw9.A02 = axn;
        aw9.A03 = enumC1820Arj;
        aw9.A01 = c1572Alm;
        aw9.A00 = j;
        c1572Alm.Ac2();
        g0u.invoke(c1325AhC);
        c1572Alm.Abc();
        aw9.A02 = axn2;
        aw9.A03 = enumC1820Arj2;
        aw9.A01 = interfaceC1327AhE;
        aw9.A00 = j2;
    }

    @Override // android.view.View.DragShadowBuilder
    public final void onProvideShadowMetrics(Point point, Point point2) {
        AXN axn = this.A01;
        long j = this.A00;
        point.set(axn.Abr(axn.Agx(AnonymousClass003.A03(j))), axn.Abr(axn.Agx(AnonymousClass004.A00(j))));
        point2.set(point.x / 2, point.y / 2);
    }

    /* JADX WARN: Incorrect types in method signature: (LX/AXN;JLX/G0U<-LX/AT3;Lkotlin/Unit;>;)V */
    public C1291Agb(AXN axn, G0U g0u, long j) {
        this.A01 = axn;
        this.A00 = j;
        this.A02 = g0u;
    }
}
