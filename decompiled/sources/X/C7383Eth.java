package X;

import java.util.Collections;
import java.util.Set;

/* renamed from: X.Eth, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C7383Eth {
    public final Set<Class<? extends BX1>> A00;
    public final Set<Class<? extends BX1>> A01;
    public final boolean A02;

    public final boolean A00(Class<? extends BX1> cls, boolean z) {
        return this.A01.contains(cls) || (!this.A00.contains(cls) && this.A02 && z);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C7383Eth) {
            if (this != obj) {
                C7383Eth c7383Eth = (C7383Eth) obj;
                if (this.A02 != c7383Eth.A02 || !C6xC.A00(this.A01, c7383Eth.A01) || !C6xC.A00(this.A00, c7383Eth.A00)) {
                }
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return BV7.A0E(Boolean.valueOf(this.A02), this.A01, this.A00);
    }

    public final String toString() {
        StringBuilder sbA0x = C60O.A0x("QuirkSettings{enabledWhenDeviceHasQuirk=");
        sbA0x.append(this.A02);
        sbA0x.append(", forceEnabledQuirks=");
        sbA0x.append(this.A01);
        sbA0x.append(", forceDisabledQuirks=");
        sbA0x.append(this.A00);
        return C8j3.A15(sbA0x);
    }

    /* JADX WARN: Incorrect types in method signature: (ZLjava/util/Set<Ljava/lang/Class<+LX/BX1;>;>;Ljava/util/Set<Ljava/lang/Class<+LX/BX1;>;>;)V */
    public C7383Eth(Set set, Set set2, boolean z) {
        this.A02 = z;
        this.A01 = set == null ? Collections.EMPTY_SET : BV4.A0x(set);
        this.A00 = set2 == null ? Collections.EMPTY_SET : BV4.A0x(set2);
    }
}
