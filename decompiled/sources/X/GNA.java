package X;

import java.util.AbstractMap;

/* loaded from: classes6.dex */
public final class GNA extends GNE {
    public final /* synthetic */ GN9 c;

    public GNA(GN9 gn9) {
        this.c = gn9;
    }

    @Override // java.util.List
    public final Object get(int i) {
        GN9 gn9 = this.c;
        int i2 = gn9.A00;
        if (i < 0 || i >= i2) {
            throw BV6.A0g(AbstractC3790CeZ.A00(i, i2));
        }
        int i3 = i * 2;
        return new AbstractMap.SimpleImmutableEntry(BV6.A0n(gn9.A02, i3), BV6.A0n(this.c.A02, i3 + 1));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.c.A00;
    }
}
