package X;

import android.content.Context;

/* renamed from: X.F5p, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C7602F5p implements CUK {
    public final int $t;
    public final Object A00;

    public C7602F5p(Object obj, int i) {
        this.$t = i;
        this.A00 = obj;
    }

    @Override // X.CUK
    public final Object get() {
        C3563CUg c3563CUg;
        if (this.$t == 0) {
            return this.A00;
        }
        Context context = (Context) this.A00;
        synchronized (C3563CUg.class) {
            c3563CUg = C3563CUg.A02;
            if (c3563CUg == null) {
                c3563CUg = new C3563CUg(context);
                C3563CUg.A02 = c3563CUg;
            }
        }
        return c3563CUg;
    }
}
