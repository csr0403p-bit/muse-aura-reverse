package X;

import kotlin.Unit;

/* renamed from: X.Apj, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1746Apj extends Ab8<C1745Api> {
    public final G0U<C1743Apg, C1Ny> A00;
    public final G0U<ASF, Unit> A01;

    @Override // X.Ab8
    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof C1746Apj) && this.A00 == ((C1746Apj) obj).A00);
    }

    @Override // X.Ab8
    public final /* bridge */ /* synthetic */ AbstractC1439Aj8 create() {
        G0U<C1743Apg, C1Ny> g0u = this.A00;
        C1DK c1dk = C8lv.A00;
        C1745Api c1745Api = new C1745Api();
        ((C1747Apk) c1745Api).A00 = c1dk;
        c1745Api.A01 = g0u;
        return c1745Api;
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
        C1745Api c1745Api = (C1745Api) abstractC1439Aj8;
        G0U<C1743Apg, C1Ny> g0u = this.A00;
        if (c1745Api.A01 != g0u) {
            c1745Api.A01 = g0u;
            C1743Apg c1743Apg = c1745Api.A00;
            if (c1743Apg != null) {
                C1Ny c1NyInvoke = g0u.invoke(c1743Apg);
                if (C7384Etj.areEqual(c1NyInvoke, ((C1747Apk) c1745Api).A00)) {
                    return;
                }
                ((C1747Apk) c1745Api).A00 = c1NyInvoke;
                c1745Api.A01();
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1746Apj(G0U<? super ASF, Unit> g0u, G0U<? super C1743Apg, ? extends C1Ny> g0u2) {
        this.A01 = g0u;
        this.A00 = g0u2;
    }
}
