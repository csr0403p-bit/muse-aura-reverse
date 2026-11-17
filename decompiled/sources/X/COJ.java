package X;

import java.io.Serializable;

/* loaded from: classes5.dex */
public final class COJ extends COI implements Serializable {
    public final COI zza;

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof COJ) {
            return this.zza.equals(((COJ) obj).zza);
        }
        return false;
    }

    public final int hashCode() {
        return -this.zza.hashCode();
    }

    public final String toString() {
        return this.zza.toString().concat(".reverse()");
    }

    public COJ(COI coi) {
        this.zza = coi;
    }
}
