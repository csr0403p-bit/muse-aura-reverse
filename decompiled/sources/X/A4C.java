package X;

import java.util.Comparator;
import java.util.List;

/* loaded from: classes4.dex */
public final class A4C implements Comparator<HxE<? extends AaC, ? extends List<C1562Alc>>> {
    public static final A4C A00 = new A4C();

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(HxE<? extends AaC, ? extends List<C1562Alc>> hxE, HxE<? extends AaC, ? extends List<C1562Alc>> hxE2) {
        AaC aaC = (AaC) hxE.first;
        float f = aaC.A03;
        AaC aaC2 = (AaC) hxE2.first;
        int iCompare = Float.compare(f, aaC2.A03);
        return iCompare == 0 ? Float.compare(aaC.A00, aaC2.A00) : iCompare;
    }
}
