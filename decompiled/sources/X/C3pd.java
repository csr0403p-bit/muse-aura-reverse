package X;

import java.util.List;

/* renamed from: X.3pd, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3pd implements C20Q, C22I, C3pV {
    public final /* synthetic */ C22I<T> A00;

    public static C3pd A00(C22I c22i) {
        return new C3pd(c22i);
    }

    @Override // X.C3pV
    public final C20Q ABr(Integer num, C78T c78t, int i) {
        return ((i == 0 || i == -3) && num == C79.A00) ? this : new C3pT(num, c78t, this, i);
    }

    @Override // X.C20Q
    public final Object collect(C20Z<? super T> c20z, HtJ<?> htJ) {
        return this.A00.collect(c20z, htJ);
    }

    @Override // X.C22I
    public final List<T> getReplayCache() {
        return this.A00.getReplayCache();
    }

    public C3pd(C22I c22i) {
        this.A00 = c22i;
    }
}
