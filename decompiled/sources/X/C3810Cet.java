package X;

import java.util.AbstractMap;

/* renamed from: X.Cet, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3810Cet extends AbstractC3804Cen {
    public final /* synthetic */ C3807Ceq zza;

    public C3810Cet(C3807Ceq c3807Ceq) {
        this.zza = c3807Ceq;
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i) {
        AbstractC3792Ceb.A01(i, this.zza.A00);
        C3807Ceq c3807Ceq = this.zza;
        int i2 = i + i;
        return new AbstractMap.SimpleImmutableEntry(BV6.A0n(c3807Ceq.A01, i2), BV6.A0n(c3807Ceq.A01, i2 + 1));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zza.A00;
    }
}
