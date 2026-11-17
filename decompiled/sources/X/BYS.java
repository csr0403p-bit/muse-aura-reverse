package X;

import java.io.Serializable;
import java.util.Arrays;

/* loaded from: classes5.dex */
public final class BYS implements InterfaceC4440Cw4, Serializable {
    public final Object zza;

    @Override // X.InterfaceC4440Cw4
    public final void AjM() {
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof BYS)) {
            return false;
        }
        Object obj2 = this.zza;
        Object obj3 = ((BYS) obj).zza;
        if (obj2 != obj3) {
            return obj2 != null && obj2.equals(obj3);
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.zza});
    }

    public final String toString() {
        return C60O.A0r("Suppliers.ofInstance(", this.zza.toString());
    }

    public BYS(Object obj) {
        this.zza = obj;
    }
}
