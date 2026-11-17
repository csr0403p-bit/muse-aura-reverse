package X;

import java.util.AbstractMap;

/* renamed from: X.Cf6, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3818Cf6 extends AbstractC3820Cf8 {
    public final /* synthetic */ C3819Cf7 zza;

    public C3818Cf6(C3819Cf7 c3819Cf7) {
        this.zza = c3819Cf7;
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i) {
        AbstractC3791Cea.A01(i, this.zza.A00);
        C3819Cf7 c3819Cf7 = this.zza;
        int i2 = i + i;
        return new AbstractMap.SimpleImmutableEntry(BV6.A0n(c3819Cf7.A01, i2), BV6.A0n(c3819Cf7.A01, i2 + 1));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zza.A00;
    }
}
