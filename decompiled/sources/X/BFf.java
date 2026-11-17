package X;

import java.util.List;

/* loaded from: classes4.dex */
public final class BFf {
    public final int A00;
    public final List<AMZ> A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && getClass() == obj.getClass()) {
                BFf bFf = (BFf) obj;
                if (this.A00 != bFf.A00 || !this.A01.equals(bFf.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass005.A0G(this.A01, this.A00 * 31);
    }

    public final String toString() {
        StringBuilder sbA0x = C60O.A0x("NavigationEventHistory(currentIndex=");
        sbA0x.append(this.A00);
        sbA0x.append(", mergedHistory=");
        return AnonymousClass007.A0Z(this.A01, sbA0x);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public BFf(List<? extends AMZ> list, int i) {
        this.A01 = list;
        this.A00 = i;
        if (list.isEmpty() && i == -1) {
            return;
        }
        if (!list.isEmpty()) {
            int size = list.size();
            if (i >= 0 && i < size) {
                return;
            }
        }
        StringBuilder sbA0y = C60O.A0y("Invalid 'NavigationEventHistory' state:  'currentIndex' must be within the bounds of 'mergedHistory' (or -1 if empty). Received: currentIndex = '", i);
        sbA0y.append("', bounds = '");
        sbA0y.append(AbstractC0885AGm.A12(list));
        throw C8j3.A0w("'.", sbA0y);
    }

    public BFf() {
        this(C0881AGi.A00, -1);
    }
}
