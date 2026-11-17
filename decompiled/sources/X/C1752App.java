package X;

import kotlin.Unit;

/* renamed from: X.App, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1752App extends Ab8<C1747Apk> {
    public final C1Ny A00;
    public final G0U<ASF, Unit> A01;

    @Override // X.Ab8
    public final /* bridge */ /* synthetic */ AbstractC1439Aj8 create() {
        C1Ny c1Ny = this.A00;
        C1747Apk c1747Apk = new C1747Apk();
        c1747Apk.A00 = c1Ny;
        return c1747Apk;
    }

    @Override // X.Ab8
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C1752App) {
            return C7384Etj.areEqual(((C1752App) obj).A00, this.A00);
        }
        return false;
    }

    @Override // X.Ab8
    public final int hashCode() {
        return this.A00.hashCode();
    }

    @Override // X.Ab8
    public final void inspectableProperties(ASF asf) {
        this.A01.invoke(asf);
    }

    @Override // X.Ab8
    public final /* bridge */ /* synthetic */ void update(AbstractC1439Aj8 abstractC1439Aj8) {
        C1747Apk c1747Apk = (C1747Apk) abstractC1439Aj8;
        C1Ny c1Ny = this.A00;
        if (C7384Etj.areEqual(c1Ny, c1747Apk.A00)) {
            return;
        }
        c1747Apk.A00 = c1Ny;
        c1747Apk.A01();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1752App(C1Ny c1Ny, G0U<? super ASF, Unit> g0u) {
        this.A00 = c1Ny;
        this.A01 = g0u;
    }
}
