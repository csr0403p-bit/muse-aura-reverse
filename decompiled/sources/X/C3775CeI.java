package X;

import java.util.AbstractMap;

/* renamed from: X.CeI, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3775CeI extends AbstractC3777CeK {
    public final /* synthetic */ C3773CeG zza;

    public C3775CeI(C3773CeG c3773CeG) {
        this.zza = c3773CeG;
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i) {
        AbstractC3788CeW.A01(i, this.zza.A00);
        int i2 = i + i;
        return new AbstractMap.SimpleImmutableEntry(BV6.A0n(this.zza.A01, i2), BV6.A0n(this.zza.A01, i2 + 1));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zza.A00;
    }
}
