package X;

/* loaded from: classes5.dex */
public final class EcO {
    public final int A00;
    public final int A01;
    public final EcO[] A02;

    public EcO() {
        this.A02 = new EcO[256];
        this.A00 = 0;
        this.A01 = 0;
    }

    public EcO(int i, int i2) {
        this.A02 = null;
        this.A00 = i;
        int i3 = i2 & 7;
        this.A01 = i3 == 0 ? 8 : i3;
    }
}
