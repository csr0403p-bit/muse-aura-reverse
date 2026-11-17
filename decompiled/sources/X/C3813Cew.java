package X;

import java.util.AbstractMap;

/* renamed from: X.Cew, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3813Cew extends AbstractC3815Cey {
    public final /* synthetic */ C3814Cex zza;

    public C3813Cew(C3814Cex c3814Cex) {
        this.zza = c3814Cex;
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i) {
        AbstractC3793Cec.A01(i, this.zza.A00);
        C3814Cex c3814Cex = this.zza;
        int i2 = i + i;
        return new AbstractMap.SimpleImmutableEntry(BV6.A0n(c3814Cex.A01, i2), BV6.A0n(c3814Cex.A01, i2 + 1));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zza.A00;
    }
}
