package X;

import java.util.Comparator;
import java.util.Map;

/* loaded from: classes4.dex */
public final class BSG implements Comparator {
    public final int $t;
    public final Object A00;

    public BSG(Object obj, int i) {
        this.$t = i;
        this.A00 = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Comparator
    public final int compare(T t, T t2) {
        Integer numValueOf;
        int iAGP;
        InterfaceC1174Add interfaceC1174Add;
        InterfaceC1174Add interfaceC1174Add2;
        switch (this.$t) {
            case 0:
            case 1:
                interfaceC1174Add = t;
                interfaceC1174Add2 = t2;
                Ae1 ae1 = (Ae1) this.A00;
                numValueOf = Integer.valueOf(ae1.AGP(interfaceC1174Add.getKey()));
                iAGP = ae1.AGP(interfaceC1174Add2.getKey());
                return numValueOf.compareTo(Integer.valueOf(iAGP));
            case 2:
            case 3:
                interfaceC1174Add = t2;
                interfaceC1174Add2 = t;
                Ae1 ae12 = (Ae1) this.A00;
                numValueOf = Integer.valueOf(ae12.AGP(interfaceC1174Add.getKey()));
                iAGP = ae12.AGP(interfaceC1174Add2.getKey());
                return numValueOf.compareTo(Integer.valueOf(iAGP));
            case 4:
            case 6:
            default:
                return AnonymousClass001.A0F(((G0V) this.A00).invoke(t, t2));
            case 5:
                G0U g0u = (G0U) this.A00;
                return AbstractC7536F0j.A00((Comparable) g0u.invoke(t), (Comparable) g0u.invoke(t2));
            case 7:
                int iCompare = ((Comparator) this.A00).compare(t, t2);
                if (iCompare != 0) {
                    return iCompare;
                }
                numValueOf = Integer.valueOf(((C1562Alc) t).A01);
                iAGP = ((C1562Alc) t2).A01;
                return numValueOf.compareTo(Integer.valueOf(iAGP));
            case 8:
                AMT amt = (AMT) this.A00;
                return Float.valueOf(amt.A02(((Map.Entry) t2).getKey())).compareTo(Float.valueOf(amt.A02(((Map.Entry) t).getKey())));
        }
    }
}
