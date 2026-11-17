package X;

/* loaded from: classes5.dex */
public final class C3D {
    public final int A00;
    public final C3B A01;
    public final C2W A02;

    public C3D(C3B c3b, int i) {
        this.A00 = i;
        this.A01 = c3b;
        C2W c2w = new C2W();
        this.A02 = c2w;
        c2w.A01(c3b.A00.getApplicationInfo().sourceDir);
    }
}
