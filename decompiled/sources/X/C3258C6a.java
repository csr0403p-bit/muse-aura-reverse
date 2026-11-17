package X;

/* renamed from: X.C6a, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3258C6a implements C7U {
    public final /* synthetic */ C66 A00;

    public C3258C6a(C66 c66) {
        this.A00 = c66;
    }

    @Override // X.C7U
    public final void AN5(Thread thread, Throwable th) throws Throwable {
        C66 c66 = this.A00;
        if (c66.A01.accept(thread, th)) {
            c66.A00(thread, th);
        }
    }
}
