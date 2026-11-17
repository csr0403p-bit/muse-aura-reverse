package X;

/* loaded from: classes4.dex */
public final class AMU<T> extends AMZ {
    public final AMP<T> A00;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return C7384Etj.areEqual(this.A00, ((AMU) obj).A00);
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    public final String toString() {
        return AnonymousClass007.A0Z(this.A00, C60O.A0x("SceneInfo(scene="));
    }

    public AMU(AMP<T> amp) {
        this.A00 = amp;
    }
}
