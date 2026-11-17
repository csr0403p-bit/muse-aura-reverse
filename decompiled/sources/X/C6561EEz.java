package X;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import java.util.Collection;
import java.util.List;
import java.util.Set;

/* renamed from: X.EEz, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C6561EEz {
    public final DAG A00;
    public final ImmutableList<EEy> A01;
    public final ImmutableSet<EF2> A02;
    public final Integer A03;
    public final String A04;

    public C6561EEz(DAG dag, Integer num, String str, List list, Set set) {
        this.A03 = num;
        this.A00 = dag;
        this.A04 = str;
        this.A02 = ImmutableSet.A01(set);
        this.A01 = ImmutableList.copyOf((Collection) list);
    }
}
