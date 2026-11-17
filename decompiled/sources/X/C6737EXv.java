package X;

import java.io.IOException;

/* JADX INFO: Add missing generic type declarations: [T] */
/* renamed from: X.EXv, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C6737EXv<T> extends AbstractC6735EXt<T> {
    public final /* synthetic */ AbstractC6735EXt A00;

    public C6737EXv(AbstractC6735EXt abstractC6735EXt) {
        this.A00 = abstractC6735EXt;
    }

    public final String toString() {
        return BV8.A0u(this.A00, C60O.A0x("NullSafeTypeAdapter["));
    }

    @Override // X.AbstractC6735EXt
    public final void write(C6733EXr c6733EXr, T t) throws IOException {
        if (t == null) {
            c6733EXr.A0B();
        } else {
            this.A00.write(c6733EXr, t);
        }
    }

    @Override // X.AbstractC6735EXt
    public final T read(EY1 ey1) {
        if (ey1.A0R() != C79.A0Z) {
            return (T) this.A00.read(ey1);
        }
        ey1.A0a();
        return null;
    }
}
