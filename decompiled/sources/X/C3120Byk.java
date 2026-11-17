package X;

import java.util.Arrays;

/* renamed from: X.Byk, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3120Byk implements InterfaceC5403Dhw {
    public final byte[] A00;

    public final boolean equals(Object obj) {
        return this == obj || (obj != null && getClass() == obj.getClass() && Arrays.equals(this.A00, ((C3120Byk) obj).A00));
    }

    @Override // X.InterfaceC5403Dhw
    public final /* synthetic */ byte[] AMp() {
        return null;
    }

    @Override // X.InterfaceC5403Dhw
    public final /* synthetic */ C6154Dwx AMq() {
        return null;
    }

    public final String toString() {
        return FGI.A0M("FormatSpecificTransmuxingData: boxType=", "dec3");
    }

    public C3120Byk(byte[] bArr) {
        this.A00 = (byte[]) bArr.clone();
    }

    @Override // X.InterfaceC5403Dhw
    public final /* synthetic */ void AY7(C10389Has c10389Has) {
    }

    public final int hashCode() {
        return 95457711 + Arrays.hashCode(this.A00);
    }
}
