package X;

import java.io.Serializable;
import java.util.Comparator;

/* loaded from: classes5.dex */
public final class COE extends COI implements Serializable {
    public final Comparator zza;

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof COE) {
            return this.zza.equals(((COE) obj).zza);
        }
        return false;
    }

    public final int hashCode() {
        return this.zza.hashCode();
    }

    public final String toString() {
        return this.zza.toString();
    }

    public COE(Comparator comparator) {
        comparator.getClass();
        this.zza = comparator;
    }
}
