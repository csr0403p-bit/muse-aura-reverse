package X;

/* loaded from: classes6.dex */
public final class G4j {
    public final Integer A00;
    public final boolean A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof G4j) {
                G4j g4j = (G4j) obj;
                if (this.A01 != g4j.A01 || !C7384Etj.areEqual(this.A00, g4j.A00)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return C0KA.A02(this.A01) + AnonymousClass006.A0D(this.A00);
    }

    public final String toString() {
        return C3cJ.A0L(this.A00, ", protocolVersion=", C60O.A10("NetworkHandlerFinishRegisterResponse(registrationSuccessValue=", this.A01));
    }

    public G4j(boolean z, Integer num) {
        this.A01 = z;
        this.A00 = num;
    }
}
