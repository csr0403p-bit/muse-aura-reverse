package X;

import com.google.gson.stream.MalformedJsonException;
import java.io.IOException;

/* JADX INFO: Add missing generic type declarations: [T] */
/* loaded from: classes5.dex */
public final class EYJ<T> extends AbstractC6735EXt<T> {
    public volatile AbstractC6735EXt<T> A00;
    public final /* synthetic */ EYC A01;
    public final /* synthetic */ EYK A02;
    public final /* synthetic */ C6753EYn A03;
    public final /* synthetic */ boolean A04;
    public final /* synthetic */ boolean A05;

    public EYJ(EYC eyc, EYK eyk, C6753EYn c6753EYn, boolean z, boolean z2) {
        this.A02 = eyk;
        this.A04 = z;
        this.A05 = z2;
        this.A01 = eyc;
        this.A03 = c6753EYn;
    }

    @Override // X.AbstractC6735EXt
    public final T read(EY1 ey1) throws MalformedJsonException {
        if (this.A04) {
            ey1.A0b();
            return null;
        }
        AbstractC6735EXt<T> abstractC6735EXtA00 = this.A00;
        if (abstractC6735EXtA00 == null) {
            abstractC6735EXtA00 = this.A01.A00(this.A02, this.A03);
            this.A00 = abstractC6735EXtA00;
        }
        return abstractC6735EXtA00.read(ey1);
    }

    @Override // X.AbstractC6735EXt
    public final void write(C6733EXr c6733EXr, T t) throws IOException {
        if (this.A05) {
            c6733EXr.A0B();
            return;
        }
        AbstractC6735EXt<T> abstractC6735EXtA00 = this.A00;
        if (abstractC6735EXtA00 == null) {
            abstractC6735EXtA00 = this.A01.A00(this.A02, this.A03);
            this.A00 = abstractC6735EXtA00;
        }
        abstractC6735EXtA00.write(c6733EXr, t);
    }
}
