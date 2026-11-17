package X;

import java.util.Arrays;

/* renamed from: X.CiU, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3980CiU extends C06G implements InterfaceC3985Cia {
    public final byte[] A00;

    @Override // X.InterfaceC3985Cia
    public final void AMO() {
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof C3980CiU) && C7384Etj.areEqual(this.A00, ((C3980CiU) obj).A00));
    }

    @Override // X.InterfaceC3985Cia
    public final String AMP() {
        return BV4.A0o(this.A00);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.A00);
    }

    public final String toString() {
        return C60O.A0r("ByteArray(value=", Arrays.toString(this.A00));
    }

    public C3980CiU(byte[] bArr) {
        this.A00 = bArr;
    }
}
