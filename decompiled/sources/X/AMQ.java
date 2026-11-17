package X;

import java.util.List;

/* loaded from: classes4.dex */
public final class AMQ<T> {
    public final AMP<T> A00;
    public final List<BRL<T>> A01;
    public final List<BLi<T>> A02;
    public final List<AMP<T>> A03;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && getClass() == obj.getClass()) {
                AMQ amq = (AMQ) obj;
                if (!this.A01.equals(amq.A01) || !this.A02.equals(amq.A02) || !C7384Etj.areEqual(this.A00, amq.A00) || !this.A03.equals(amq.A03)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass005.A0E(this.A01) + AnonymousClass005.A0E(this.A02) + AnonymousClass005.A0E(this.A00) + AnonymousClass005.A0E(this.A03);
    }

    public final String toString() {
        StringBuilder sbA0x = C60O.A0x("SceneState(entries=");
        sbA0x.append(this.A01);
        sbA0x.append(", overlayScenes=");
        sbA0x.append(this.A02);
        sbA0x.append(", currentScene=");
        sbA0x.append(this.A00);
        sbA0x.append(", previousScenes=");
        return AnonymousClass007.A0Z(this.A03, sbA0x);
    }

    /* JADX WARN: Incorrect types in method signature: (Ljava/util/List<LX/BRL<TT;>;>;Ljava/util/List<+LX/BLi<TT;>;>;LX/AMP<TT;>;Ljava/util/List<+LX/AMP<TT;>;>;)V */
    public AMQ(AMP amp, List list, List list2, List list3) {
        this.A01 = list;
        this.A02 = list2;
        this.A00 = amp;
        this.A03 = list3;
    }
}
