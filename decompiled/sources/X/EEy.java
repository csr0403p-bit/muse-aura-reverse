package X;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.RegularImmutableMap;
import com.google.common.collect.RegularImmutableSet;
import java.util.Set;

/* loaded from: classes5.dex */
public final class EEy {
    public final EFB A00;
    public final ImmutableMap<String, String> A01;
    public final ImmutableSet<EF2> A02;
    public final Exception A03;
    public final Integer A04;
    public final Integer A05;

    public EEy(Integer num, Integer num2) {
        this(EFB.A02, RegularImmutableMap.A03, null, num, num2, RegularImmutableSet.A05);
    }

    public EEy(EFB efb, ImmutableMap immutableMap, Exception exc, Integer num, Integer num2, Set set) {
        this.A04 = num;
        this.A05 = num2;
        this.A02 = ImmutableSet.A01(set);
        this.A01 = immutableMap;
        this.A00 = efb;
        this.A03 = exc;
    }
}
