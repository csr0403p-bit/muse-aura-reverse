package X;

import com.google.common.collect.ImmutableList;
import java.util.Collection;
import java.util.List;

/* renamed from: X.DoU, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C5735DoU {
    public static final C5735DoU A01 = new C5735DoU(ImmutableList.of());
    public final ImmutableList<C5734DoT> A00;

    public final boolean A00(int i) {
        int i2 = 0;
        while (true) {
            ImmutableList<C5734DoT> immutableList = this.A00;
            if (i2 >= immutableList.size()) {
                return false;
            }
            C5734DoT c5734DoT = immutableList.get(i2);
            boolean[] zArr = c5734DoT.A03;
            int length = zArr.length;
            int i3 = 0;
            while (true) {
                if (i3 >= length) {
                    break;
                }
                if (!zArr[i3]) {
                    i3++;
                } else if (c5734DoT.A01.A02 == i) {
                    return true;
                }
            }
            i2++;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.A00.equals(((C5735DoU) obj).A00);
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    public C5735DoU(List<C5734DoT> list) {
        this.A00 = ImmutableList.copyOf((Collection) list);
    }
}
