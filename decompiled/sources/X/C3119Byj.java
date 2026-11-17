package X;

import java.util.Arrays;

/* renamed from: X.Byj, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3119Byj implements InterfaceC5403Dhw {
    public final String A00;
    public final String A01;
    public final byte[] A02;

    @Override // X.InterfaceC5403Dhw
    public final /* synthetic */ byte[] AMp() {
        return null;
    }

    @Override // X.InterfaceC5403Dhw
    public final /* synthetic */ C6154Dwx AMq() {
        return null;
    }

    @Override // X.InterfaceC5403Dhw
    public final void AY7(C10389Has c10389Has) {
        String str = this.A00;
        if (str != null) {
            c10389Has.A0G = str;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.A02, ((C3119Byj) obj).A02);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.A02);
    }

    public final String toString() {
        return String.format("ICY: title=\"%s\", url=\"%s\", rawMetadata.length=\"%s\"", this.A00, this.A01, Integer.valueOf(this.A02.length));
    }

    public C3119Byj(byte[] bArr, String str, String str2) {
        this.A02 = bArr;
        this.A00 = str;
        this.A01 = str2;
    }
}
