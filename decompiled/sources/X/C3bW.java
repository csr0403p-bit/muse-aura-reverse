package X;

import androidx.compose.material3.internal.AnchoredDraggableState;
import androidx.compose.runtime.MutableState;
import kotlin.Unit;

/* renamed from: X.3bW, reason: invalid class name */
/* loaded from: classes.dex */
public final class C3bW implements Ht9, G0U {
    public final int $t;
    public final Object A00;
    public final Object A01;

    public C3bW(int i, Object obj, Object obj2) {
        this.$t = i;
        this.A00 = obj;
        this.A01 = obj2;
    }

    @Override // X.G0U
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                C3TM c3tm = (C3TM) this.A00;
                C3TI c3ti = (C3TI) this.A01;
                long jA02 = AWx.A02(((C1257Aft) obj).A00, 1.0f);
                EnumC1108AYu enumC1108AYu = c3ti.A01;
                G0W<C3UX, AWx, HtJ<? super Unit>, Object> g0w = C3US.A00;
                float fIntBitsToFloat = Float.intBitsToFloat((int) (enumC1108AYu == EnumC1108AYu.A03 ? jA02 & 4294967295L : jA02 >> 32));
                AnchoredDraggableState<T> anchoredDraggableState = ((C3T9) c3tm).A00;
                C3TN c3tn = anchoredDraggableState.A02;
                float fA03 = anchoredDraggableState.A03(fIntBitsToFloat);
                AnchoredDraggableState<T> anchoredDraggableState2 = ((C3T6) c3tn).A00;
                anchoredDraggableState2.A05.AdS(fA03);
                anchoredDraggableState2.A04.AdS(0.0f);
                break;
            case 1:
                C3UL c3ul = (C3UL) this.A00;
                AZE aze = (AZE) this.A01;
                AYU ayu = (AYU) obj;
                boolean z = c3ul.A04;
                int iA01 = ASU.A01(ayu, c3ul.A02);
                int iA012 = ASU.A01(ayu, c3ul.A03);
                if (!z) {
                    ayu.A0A(aze, 0.0f, iA01, iA012);
                    break;
                } else {
                    AYU.A04(ayu, aze, iA01, iA012);
                    break;
                }
            default:
                final MutableState mutableState = (MutableState) this.A00;
                final InterfaceC1072AWd interfaceC1072AWd = (InterfaceC1072AWd) this.A01;
                return new C78g() { // from class: X.1YT
                    @Override // X.C78g
                    public final void dispose() {
                        MutableState mutableState2 = mutableState;
                        AWp aWp = (AWp) mutableState2.getValue();
                        if (aWp != null) {
                            AWl aWl = new AWl(aWp);
                            InterfaceC1072AWd interfaceC1072AWd2 = interfaceC1072AWd;
                            if (interfaceC1072AWd2 != null) {
                                ((C1qN) interfaceC1072AWd2).A00.AhV(aWl);
                            }
                            mutableState2.Af8(null);
                        }
                    }
                };
        }
        return Unit.INSTANCE;
    }
}
