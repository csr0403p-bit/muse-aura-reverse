package X;

import androidx.compose.ui.unit.Constraints;
import java.util.List;

/* renamed from: X.Ahk, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1359Ahk extends AYK {
    public final /* synthetic */ C1369Ahv A00;
    public final /* synthetic */ G0V<C3Su, Constraints, InterfaceC1134Abi> A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1359Ahk(C1369Ahv c1369Ahv, G0V g0v) {
        super("Asking for intrinsic measurements of SubcomposeLayout layouts is not supported. This includes components that are built on top of SubcomposeLayout, such as lazy lists, BoxWithConstraints, TabRow, etc. To mitigate this:\n- if intrinsic measurements are used to achieve 'match parent' sizing, consider replacing the parent of the component with a custom layout which controls the order in which children are measured, making intrinsic measurement not needed\n- adding a size modifier to the component, in order to fast return the queried intrinsic measurement.");
        this.A00 = c1369Ahv;
        this.A01 = g0v;
    }

    @Override // X.InterfaceC1380AiA
    /* renamed from: measure-3p2s80s */
    public final InterfaceC1134Abi mo7measure3p2s80s(AXY axy, List<? extends C3TG> list, long j) {
        InterfaceC1134Abi interfaceC1134AbiInvoke;
        int i;
        int i2;
        C1369Ahv c1369Ahv = this.A00;
        C1364Ahq c1364Ahq = c1369Ahv.A0C;
        c1364Ahq.A02 = axy.getLayoutDirection();
        c1364Ahq.A00 = axy.AEm();
        c1364Ahq.A01 = axy.AFo();
        if (axy.AOh() || c1369Ahv.A0D.A0B == null) {
            c1369Ahv.A01 = 0;
            interfaceC1134AbiInvoke = this.A01.invoke(c1364Ahq, new Constraints(j));
            i = c1369Ahv.A01;
            i2 = 1;
        } else {
            i2 = 0;
            c1369Ahv.A00 = 0;
            interfaceC1134AbiInvoke = this.A01.invoke(c1369Ahv.A0B, new Constraints(j));
            i = c1369Ahv.A00;
        }
        return new BSZ(c1369Ahv, interfaceC1134AbiInvoke, interfaceC1134AbiInvoke, i, i2);
    }
}
