package X;

import android.graphics.PointF;
import java.util.List;

/* renamed from: X.Fji, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8743Fji implements InterfaceC8761Fk0<PointF, PointF> {
    public final C8689Fip A00;
    public final C8689Fip A01;

    @Override // X.InterfaceC8761Fk0
    public final AbstractC8724FjP<PointF, PointF> A7a() {
        return new C8713FjE(C8720FjL.A01(this.A00), C8720FjL.A01(this.A01));
    }

    @Override // X.InterfaceC8761Fk0
    public final List<C8725FjQ<PointF>> AGq() {
        throw C8j3.A18("Cannot call getKeyframes on AnimatableSplitDimensionPathValue.");
    }

    @Override // X.InterfaceC8761Fk0
    public final boolean AP6() {
        return this.A00.AP6() && this.A01.AP6();
    }

    public C8743Fji(C8689Fip c8689Fip, C8689Fip c8689Fip2) {
        this.A00 = c8689Fip;
        this.A01 = c8689Fip2;
    }
}
