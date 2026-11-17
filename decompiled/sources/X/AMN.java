package X;

/* loaded from: classes4.dex */
public final class AMN {
    public final Object A00;
    public final C9uG<?> A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AMN) {
                AMN amn = (AMN) obj;
                if (!this.A01.equals(amn.A01) || !C7384Etj.areEqual(this.A00, amn.A00)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass005.A0G(this.A00, AnonymousClass005.A0E(C9uT.A02(this.A01)));
    }

    public final String toString() {
        StringBuilder sbA0x = C60O.A0x("AnimatedSceneKey(clazz=");
        sbA0x.append(this.A01);
        sbA0x.append(", key=");
        return AnonymousClass007.A0Z(this.A00, sbA0x);
    }

    public AMN(AMP<?> amp) {
        C0861A6i c0861A6iA0x = C3cG.A0x(amp.getClass());
        Object key = amp.getKey();
        this.A01 = c0861A6iA0x;
        this.A00 = key;
    }
}
