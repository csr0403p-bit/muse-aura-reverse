package X;

/* loaded from: classes4.dex */
public final class AOV {
    public float A00;
    public long A01;
    public long A02;
    public long A03;
    public AOW A04;
    public AOW A05 = AOW.A00(0.0f);
    public InterfaceC0999AOh<AOW> A06;
    public boolean A07;

    public final String toString() {
        StringBuilder sbA0x = C60O.A0x("progress nanos: ");
        sbA0x.append(this.A03);
        sbA0x.append(", animationSpec: ");
        sbA0x.append(this.A06);
        sbA0x.append(", isComplete: ");
        sbA0x.append(this.A07);
        sbA0x.append(", value: ");
        sbA0x.append(this.A00);
        sbA0x.append(", start: ");
        sbA0x.append(this.A05);
        sbA0x.append(", initialVelocity: ");
        sbA0x.append(this.A04);
        sbA0x.append(", durationNanos: ");
        sbA0x.append(this.A02);
        sbA0x.append(", animationSpecDuration: ");
        sbA0x.append(this.A01);
        return sbA0x.toString();
    }
}
