package X;

/* loaded from: classes4.dex */
public final class AW6 extends AbstractC1555AlK {
    public final AW7 A00;
    public final InterfaceC1068ATy A01;

    public AW6(AW7 aw7) {
        C1710Aot c1710AotA00 = null;
        this.A00 = aw7;
        if (!AW2.A01(aw7)) {
            c1710AotA00 = AbstractC1561Alb.A00();
            c1710AotA00.A3t(aw7);
        }
        this.A01 = c1710AotA00;
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof AW6) && C7384Etj.areEqual(this.A00, ((AW6) obj).A00));
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }
}
