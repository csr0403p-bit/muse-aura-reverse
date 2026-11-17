package X;

/* loaded from: classes4.dex */
public final class AcI implements AcJ {
    public int A00;
    public C1YC<Float> A01;
    public final ATK A02;

    /* JADX WARN: Incorrect types in method signature: (LX/3Q0;FLX/HtJ<-Ljava/lang/Float;>;)Ljava/lang/Object; */
    @Override // X.BLD
    public final Object AXo(C3Q0 c3q0, HtJ htJ, float f) {
        this.A00 = 0;
        return GAo.A00(htJ, this.A02, new BUG(this, c3q0, null, f));
    }

    public AcI(C1YC<Float> c1yc, ATK atk) {
        this.A01 = c1yc;
        this.A02 = atk;
    }
}
