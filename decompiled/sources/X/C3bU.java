package X;

import androidx.compose.ui.unit.Constraints;
import java.util.ArrayList;
import kotlin.Unit;

/* renamed from: X.3bU, reason: invalid class name */
/* loaded from: classes.dex */
public final class C3bU implements Ht9, G0V {
    public final int $t;
    public final Object A00;
    public final Object A01;

    @Override // X.G0V
    public final Object invoke(Object obj, Object obj2) {
        switch (this.$t) {
            case 0:
                InterfaceC1380AiA interfaceC1380AiA = (InterfaceC1380AiA) this.A00;
                Object obj3 = this.A01;
                C3Su c3Su = (C3Su) obj;
                long j = ((Constraints) obj2).A00;
                return interfaceC1380AiA.mo7measure3p2s80s(c3Su, c3Su.AgZ(Unit.INSTANCE, B1V.A01(new C3bU(1, new C05253Tt(c3Su, j), obj3), -431986394, true)), j);
            case 1:
                G0W g0w = (G0W) this.A00;
                Object obj4 = this.A01;
                BFM bfm = (BFM) obj;
                int iA0F = AnonymousClass001.A0F(obj2);
                if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0F & 3, 2), bfm, iA0F)) {
                    AnonymousClass001.A1G(obj4, bfm, g0w, 0);
                } else {
                    bfm.Afo();
                }
                return Unit.INSTANCE;
            default:
                C0to c0to = (C0to) this.A00;
                InterfaceC04981Yd interfaceC04981Yd = (InterfaceC04981Yd) this.A01;
                AXN axn = (AXN) obj;
                int iA01 = Constraints.A01(((Constraints) obj2).A00);
                if (iA01 == Integer.MAX_VALUE) {
                    AbstractC1061ATk.A00("LazyVerticalGrid's width should be bound by parent.");
                    throw F60.createAndThrow();
                }
                int iAbr = axn.Abr(interfaceC04981Yd.AKp());
                int i = ((C1DD) c0to).A00;
                int i2 = iA01 - (iAbr * (i - 1));
                int i3 = i2 / i;
                int i4 = i2 % i;
                ArrayList arrayList = new ArrayList(i);
                for (int i5 = 0; i5 < i; i5++) {
                    int i6 = 0;
                    if (i5 < i4) {
                        i6 = 1;
                    }
                    arrayList.add(Integer.valueOf(i6 + i3));
                }
                int[] iArrA0n = AbstractC0878AGe.A0n(arrayList);
                int[] iArr = new int[iArrA0n.length];
                interfaceC04981Yd.A4l(axn, EnumC1820Arj.A02, iArrA0n, iArr, iA01);
                return new C04991Ye(iArrA0n, iArr);
        }
    }

    public C3bU(int i, Object obj, Object obj2) {
        this.$t = i;
        this.A00 = obj2;
        this.A01 = obj;
    }
}
