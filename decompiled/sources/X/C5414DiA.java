package X;

import com.google.common.collect.ImmutableList;

/* renamed from: X.DiA, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C5414DiA {
    public static final C5414DiA A03 = new C5414DiA(new C5382DhZ[0]);
    public int A00;
    public final int A01;
    public final ImmutableList<C5382DhZ> A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && getClass() == obj.getClass()) {
                C5414DiA c5414DiA = (C5414DiA) obj;
                if (this.A01 != c5414DiA.A01 || !this.A02.equals(c5414DiA.A02)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i = this.A00;
        if (i != 0) {
            return i;
        }
        int iHashCode = this.A02.hashCode();
        this.A00 = iHashCode;
        return iHashCode;
    }

    public final String toString() {
        return this.A02.toString();
    }

    public C5414DiA(C5382DhZ... c5382DhZArr) {
        this.A02 = ImmutableList.copyOf(c5382DhZArr);
        this.A01 = c5382DhZArr.length;
        int i = 0;
        while (true) {
            ImmutableList<C5382DhZ> immutableList = this.A02;
            if (i >= immutableList.size()) {
                return;
            }
            int i2 = i + 1;
            for (int i3 = i2; i3 < immutableList.size(); i3++) {
                if (BV7.A1Y(immutableList.get(i), immutableList, i3)) {
                    CNC.A05("TrackGroupArray", "", C60O.A0i("Multiple identical TrackGroups added to one TrackGroupArray."));
                }
            }
            i = i2;
        }
    }
}
