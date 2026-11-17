package X;

import java.util.AbstractMap;
import java.util.Comparator;

/* loaded from: classes5.dex */
public final class CO9 extends COO {
    public final /* synthetic */ CO6 zza;

    public CO9(CO6 co6) {
        this.zza = co6;
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i) {
        COB cob = this.zza.zza;
        Comparator comparator = COB.A03;
        return new AbstractMap.SimpleImmutableEntry(cob.A01.A01.get(i), this.zza.zza.A00.get(i));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zza.zza.size();
    }
}
