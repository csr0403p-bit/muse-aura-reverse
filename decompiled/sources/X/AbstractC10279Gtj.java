package X;

/* renamed from: X.Gtj, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC10279Gtj extends AbstractC10245Gsg {
    public final int A00;
    public final int A01;

    public String toString() {
        int i = this.A00;
        return String.format(i == 0 ? ":%s(%3$d)" : this.A01 == 0 ? ":%s(%2$dn)" : ":%s(%2$dn%3$+d)", this instanceof GtQ ? "nth-of-type" : this instanceof C10284Gto ? "nth-last-of-type" : this instanceof C10266GtU ? "nth-last-child" : "nth-child", Integer.valueOf(i), Integer.valueOf(this.A01));
    }

    public AbstractC10279Gtj(int i, int i2) {
        this.A00 = i;
        this.A01 = i2;
    }
}
