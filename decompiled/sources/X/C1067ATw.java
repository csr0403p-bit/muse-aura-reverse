package X;

import kotlin.Unit;

/* renamed from: X.ATw, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1067ATw implements C1DM {
    public final G0W<InterfaceC1068ATy, AWA, EnumC1820Arj, Unit> A00;

    public final boolean equals(Object obj) {
        C1067ATw c1067ATw;
        if (this == obj) {
            return true;
        }
        G0W<InterfaceC1068ATy, AWA, EnumC1820Arj, Unit> g0w = null;
        if ((obj instanceof C1067ATw) && (c1067ATw = (C1067ATw) obj) != null) {
            g0w = c1067ATw.A00;
        }
        return g0w == this.A00;
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1067ATw(G0W<? super InterfaceC1068ATy, ? super AWA, ? super EnumC1820Arj, Unit> g0w) {
        this.A00 = g0w;
    }

    @Override // X.C1DM
    /* renamed from: createOutline-Pq9zytI */
    public final AbstractC1555AlK mo2createOutlinePq9zytI(long j, EnumC1820Arj enumC1820Arj, AXN axn) {
        C1710Aot c1710AotA00 = AbstractC1561Alb.A00();
        this.A00.invoke(c1710AotA00, new AWA(j), enumC1820Arj);
        c1710AotA00.A03.close();
        return new C1069ATz(c1710AotA00);
    }
}
