package X;

import java.util.Arrays;

/* renamed from: X.2eD, reason: invalid class name */
/* loaded from: classes.dex */
public final class C2eD implements Ejq {
    public final Ejq[] A00;

    @Override // X.Ejq
    public final String ADg() {
        return "FirstAvailableImageSource";
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!getClass().equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        Ejq[] ejqArr = this.A00;
        C7384Etj.A0Z(obj, "null cannot be cast to non-null type com.facebook.fresco.vito.source.FirstAvailableImageSource");
        return Arrays.equals(ejqArr, ((C2eD) obj).A00);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.A00);
    }

    public final String toString() {
        return FGI.A0U("FirstAvailableImageSource(imageSources=", Arrays.toString(this.A00), ")");
    }

    public C2eD(Ejq[] ejqArr) {
        this.A00 = ejqArr;
    }
}
