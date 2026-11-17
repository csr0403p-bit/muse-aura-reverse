package X;

/* renamed from: X.DDw, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C4903DDw implements CXN {
    public final C1J A00;

    @Override // X.CXN
    public final C1J createDataSource() {
        return this.A00;
    }

    public C4903DDw(C3159C0h c3159C0h, DEZ dez, String str, int i, boolean z) {
        DDU ddu = DDU.DEFAULT_FACTORY;
        C7384Etj.A0Y(str, 0);
        this.A00 = new C4899DDs(DDU.defaultFactory.createInstance(str, dez, null, 8000, i, c3159C0h), null, z);
    }
}
