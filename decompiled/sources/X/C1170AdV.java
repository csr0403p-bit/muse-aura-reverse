package X;

/* renamed from: X.AdV, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1170AdV<T> implements InterfaceC1183Adm<T> {
    public int A00;
    public C1181Adk<? extends T> A01;
    public final C0910AHm<C1181Adk<T>> A02 = C0910AHm.A01(new C1181Adk[16]);

    public final void A00(int i, T t) {
        if (i < 0) {
            AbstractC1061ATk.A00("size should be >=0");
            throw F60.createAndThrow();
        }
        if (i != 0) {
            int i2 = this.A00;
            C1181Adk<T> c1181Adk = new C1181Adk<>(t, i2, i);
            this.A00 = i2 + i;
            this.A02.A0G(c1181Adk);
        }
    }

    @Override // X.InterfaceC1183Adm
    public final C1181Adk<T> ABv(int i) {
        if (i < 0 || i >= this.A00) {
            throw C8j3.A0y("Index ", ", size ", i, this.A00);
        }
        C1181Adk<? extends T> c1181Adk = this.A01;
        if (c1181Adk != null) {
            int i2 = c1181Adk.A01;
            if (i < c1181Adk.A00 + i2 && i2 <= i) {
                return c1181Adk;
            }
        }
        C0910AHm<C1181Adk<T>> c0910AHm = this.A02;
        C1181Adk c1181Adk2 = (C1181Adk<? extends T>) c0910AHm.A01[AbstractC1177Adg.A00(c0910AHm, i)];
        this.A01 = c1181Adk2;
        return c1181Adk2;
    }
}
