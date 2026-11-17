package X;

import java.util.Arrays;

/* renamed from: X.DqB, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C5822DqB {
    public int A00;
    public final int A01;
    public final InterfaceC5441Dic[] A02;

    public final InterfaceC5441Dic[] A00() {
        return (InterfaceC5441Dic[]) this.A02.clone();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.A02, ((C5822DqB) obj).A02);
    }

    public final int hashCode() {
        int i = this.A00;
        if (i != 0) {
            return i;
        }
        int iHashCode = 527 + Arrays.hashCode(this.A02);
        this.A00 = iHashCode;
        return iHashCode;
    }

    public C5822DqB(InterfaceC5441Dic... interfaceC5441DicArr) {
        this.A02 = interfaceC5441DicArr;
        this.A01 = interfaceC5441DicArr.length;
    }
}
