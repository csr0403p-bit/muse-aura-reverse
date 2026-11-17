package X;

import java.util.List;

/* renamed from: X.3Pi, reason: invalid class name */
/* loaded from: classes.dex */
public final class C3Pi implements C1BN, C20Q, C3pV {
    public final HoC A00;
    public final /* synthetic */ C1BN<T> A01;

    public static C3Pi A00(C1BN c1bn) {
        return new C3Pi(null, c1bn);
    }

    @Override // X.C22I, X.C20Q
    public final Object collect(C20Z<? super T> c20z, HtJ<?> htJ) {
        return this.A01.collect(c20z, htJ);
    }

    @Override // X.C22I
    public final List<T> getReplayCache() {
        return this.A01.getReplayCache();
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [T, java.lang.Object] */
    @Override // X.C1BN
    public final T getValue() {
        return this.A01.getValue();
    }

    /* JADX WARN: Incorrect types in method signature: (LX/1BN<+TT;>;LX/HoC;)V */
    public C3Pi(HoC hoC, C1BN c1bn) {
        this.A01 = c1bn;
        this.A00 = hoC;
    }

    @Override // X.C3pV
    public final C20Q ABr(Integer num, C78T c78t, int i) {
        return HnJ.A00(num, c78t, this, i);
    }
}
