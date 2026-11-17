package X;

/* renamed from: X.Byc, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3112Byc implements InterfaceC5403Dhw {
    public final float A00;
    public final int A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && getClass() == obj.getClass()) {
                C3112Byc c3112Byc = (C3112Byc) obj;
                if (this.A00 != c3112Byc.A00 || this.A01 != c3112Byc.A01) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC5403Dhw
    public final /* synthetic */ byte[] AMp() {
        return null;
    }

    @Override // X.InterfaceC5403Dhw
    public final /* synthetic */ C6154Dwx AMq() {
        return null;
    }

    public final int hashCode() {
        return BV8.A09(Float.valueOf(this.A00)) + this.A01;
    }

    public C3112Byc(float f, int i) {
        this.A00 = f;
        this.A01 = i;
    }

    @Override // X.InterfaceC5403Dhw
    public final /* synthetic */ void AY7(C10389Has c10389Has) {
    }

    public final String toString() {
        StringBuilder sbA0x = C60O.A0x("smta: captureFrameRate=");
        sbA0x.append(this.A00);
        sbA0x.append(", svcTemporalLayerCount=");
        return BV4.A0l(sbA0x, this.A01);
    }
}
