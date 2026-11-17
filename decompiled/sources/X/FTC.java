package X;

/* loaded from: classes6.dex */
public final class FTC {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public FTV A04;
    public FTV A05;

    public final String toString() {
        StringBuilder sbA0x = C60O.A0x("ChangeInfo{oldHolder=");
        sbA0x.append(this.A05);
        sbA0x.append(", newHolder=");
        sbA0x.append(this.A04);
        sbA0x.append(", fromX=");
        sbA0x.append(this.A00);
        sbA0x.append(", fromY=");
        sbA0x.append(this.A01);
        sbA0x.append(", toX=");
        sbA0x.append(this.A02);
        sbA0x.append(", toY=");
        sbA0x.append(this.A03);
        return C8j3.A15(sbA0x);
    }
}
