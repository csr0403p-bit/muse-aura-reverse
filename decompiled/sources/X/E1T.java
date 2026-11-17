package X;

/* loaded from: classes5.dex */
public final class E1T extends AbstractC3113Byd {
    public final long A00;
    public final long A01;
    public final byte[] A02;

    @Override // X.AbstractC3113Byd
    public final String toString() {
        return FGI.A0b("SCTE-35 PrivateCommand { ptsAdjustment=", ", identifier= ", " }", this.A01, this.A00);
    }

    public E1T(byte[] bArr, long j, long j2) {
        this.A01 = j2;
        this.A00 = j;
        this.A02 = bArr;
    }
}
