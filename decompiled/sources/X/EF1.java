package X;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.RegularImmutableSet;
import com.google.common.collect.SingletonImmutableSet;

/* loaded from: classes5.dex */
public final class EF1 {
    public static final ImmutableList<EF9> A03;
    public final int A00;
    public final EEw A01;
    public final DAF A02;

    static {
        EF2 ef2 = EF2.STRONGBOX;
        EF2 ef22 = EF2.DEVICE_INFORMATION;
        EF9 ef9 = new EF9(ImmutableSet.A02(new EF2[]{ef2, ef22}), true);
        EF9 ef92 = new EF9(new SingletonImmutableSet(new EF2[]{ef2}[0]), true);
        EF9 ef93 = new EF9(new SingletonImmutableSet(new EF2[]{ef22}[0]), true);
        RegularImmutableSet<Object> regularImmutableSet = RegularImmutableSet.A05;
        A03 = ImmutableList.of(ef9, ef92, ef93, new EF9(regularImmutableSet, true), new EF9(new SingletonImmutableSet(new EF2[]{ef2}[0]), false), new EF9(regularImmutableSet, false));
    }

    public EF1(EEw eEw, DAF daf, int i) {
        this.A01 = eEw;
        this.A02 = daf;
        this.A00 = i;
    }
}
