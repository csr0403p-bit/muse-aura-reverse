package X;

/* renamed from: X.Agj, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1298Agj {
    public boolean A00;
    public final long A01;
    public final long A02;
    public final long A03;
    public final long A04;
    public final boolean A05;
    public final boolean A06;
    public final float A07;
    public final long A08;

    public final String toString() {
        StringBuilder sbA0x = C60O.A0x("IndirectPointerInputChange(id=");
        sbA0x.append((Object) C2Uh.A00(this.A01));
        sbA0x.append(", uptimeMillis=");
        sbA0x.append(this.A04);
        sbA0x.append(", position=");
        AWx.A0E(this.A02, sbA0x);
        sbA0x.append(", pressed=");
        sbA0x.append(this.A05);
        sbA0x.append(", pressure=");
        sbA0x.append(this.A07);
        sbA0x.append(", previousUptimeMillis=");
        sbA0x.append(this.A08);
        sbA0x.append(", previousPosition=");
        AWx.A0E(this.A03, sbA0x);
        sbA0x.append(", previousPressed=");
        sbA0x.append(this.A06);
        sbA0x.append(", isConsumed=");
        sbA0x.append(this.A00);
        return AnonymousClass006.A0z(sbA0x);
    }

    public C1298Agj(float f, long j, long j2, long j3, long j4, long j5, boolean z, boolean z2) {
        this.A01 = j;
        this.A04 = j2;
        this.A02 = j3;
        this.A05 = z;
        this.A07 = f;
        this.A08 = j4;
        this.A03 = j5;
        this.A06 = z2;
    }
}
