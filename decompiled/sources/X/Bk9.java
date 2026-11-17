package X;

import android.hardware.camera2.params.InputConfiguration;

/* loaded from: classes5.dex */
public class Bk9 implements InterfaceC2809Blm {
    public final InputConfiguration A00;

    public final boolean equals(Object obj) {
        if (obj instanceof InterfaceC2809Blm) {
            return C6xC.A00(this.A00, ((Bk9) ((InterfaceC2809Blm) obj)).A00);
        }
        return false;
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    public final String toString() {
        return this.A00.toString();
    }

    public Bk9(Object obj) {
        this.A00 = (InputConfiguration) obj;
    }
}
