package X;

import com.google.common.base.Function;
import com.google.common.collect.ImmutableList;
import java.util.Collection;

/* loaded from: classes5.dex */
public final class F5K implements Function {
    public final int $t;

    public F5K(int i) {
        this.$t = i;
    }

    @Override // com.google.common.base.Function
    public final Object apply(Object obj) {
        switch (this.$t) {
            case 0:
                C6219DyA c6219DyA = (C6219DyA) obj;
                C6154Dwx c6154Dwx = C6154Dwx.A0g;
                return FGI.A0U(c6219DyA.A00, ": ", c6219DyA.A01);
            case 1:
                DOM<E0J> dom = DXD.A02;
                return Integer.valueOf(((E0J) obj).A0C);
            case 2:
                return new C6463E7c((E7C) obj);
            case 3:
                return C3cI.A0Y(((InterfaceC5458Dit) obj).AMF());
            case 4:
                return ImmutableList.copyOf((Collection) DPK.A00(new F5K(5), ((InterfaceC6006Dtp) obj).ALu().A02));
            case 5:
                C5414DiA c5414DiA = C5414DiA.A03;
                return Integer.valueOf(((C5382DhZ) obj).A02);
            case 6:
                return Long.valueOf(((E00) obj).A02);
            case 7:
                return Long.valueOf(((E00) obj).A00);
            case 8:
                return obj;
            case 9:
                long j = ((E00) obj).A02;
                if (j == -9223372036854775807L) {
                    j = 0;
                }
                return Long.valueOf(j);
            case 10:
                return ImmutableList.of(Integer.valueOf(((C5422DiI) obj).A0I));
            default:
                return null;
        }
    }
}
