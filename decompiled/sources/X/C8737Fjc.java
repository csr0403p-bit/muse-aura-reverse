package X;

import android.graphics.PointF;
import java.util.List;

/* renamed from: X.Fjc, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8737Fjc implements InterfaceC8761Fk0<PointF, PointF> {
    public final List<C8725FjQ<PointF>> A00;

    @Override // X.InterfaceC8761Fk0
    public final AbstractC8724FjP<PointF, PointF> A7a() {
        List<C8725FjQ<PointF>> list = this.A00;
        return ((C8725FjQ) C8j4.A0p(list)).A02() ? new C8716FjH(list) : new C8714FjF(list);
    }

    @Override // X.InterfaceC8761Fk0
    public final List<C8725FjQ<PointF>> AGq() {
        return this.A00;
    }

    @Override // X.InterfaceC8761Fk0
    public final boolean AP6() {
        List<C8725FjQ<PointF>> list = this.A00;
        return list.size() == 1 && list.get(0).A02();
    }

    public C8737Fjc(List<C8725FjQ<PointF>> list) {
        this.A00 = list;
    }
}
