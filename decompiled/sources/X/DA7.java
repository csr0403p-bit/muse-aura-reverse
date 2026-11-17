package X;

import java.util.Iterator;

/* loaded from: classes5.dex */
public final class DA7 implements Iterator {
    public int A00;
    public final int A01;
    public final /* synthetic */ DA8 A02;

    public DA7(DA8 da8) {
        this.A02 = da8;
        this.A00 = 0;
        this.A01 = da8.A03();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return C8j3.A1T(this.A00, this.A01);
    }

    @Override // java.util.Iterator
    public final /* synthetic */ Object next() {
        byte b;
        int i = this.A00;
        if (i >= this.A01) {
            throw C8j3.A1D();
        }
        this.A00 = i + 1;
        DA9 da9 = (DA9) this.A02;
        if (da9 instanceof DAA) {
            DAA daa = (DAA) da9;
            b = daa.zza[daa.zzc + i];
        } else {
            b = da9.zza[i];
        }
        return Byte.valueOf(b);
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw C8j3.A17();
    }

    public DA7() {
    }
}
