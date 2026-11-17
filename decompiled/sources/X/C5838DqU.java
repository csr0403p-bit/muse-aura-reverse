package X;

/* renamed from: X.DqU, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C5838DqU {
    public final double A00;
    public final double A01;
    public final double A02;
    public final double A03;

    public C5838DqU(double d, double d2, double d3) {
        this.A03 = d;
        this.A00 = d2;
        this.A01 = d3;
        this.A02 = d > 0.0d ? d2 / d : -1.0d;
    }

    public final String toString() {
        return FGI.A0b("{avg=", C8j2.A00(12), "%}", Math.round(this.A03), BV6.A0G(this.A02, 100.0d));
    }
}
