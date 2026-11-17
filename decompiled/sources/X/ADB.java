package X;

/* loaded from: classes4.dex */
public final class ADB extends Hrl {
    public final EnumC10364HCl A00;
    public final Integer A01;
    public final Integer A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ADB) {
                ADB adb = (ADB) obj;
                if (this.A00 != adb.A00 || !C7384Etj.areEqual(this.A01, adb.A01) || !C7384Etj.areEqual(this.A02, adb.A02)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((AnonymousClass005.A0E(this.A00) + AnonymousClass006.A0D(this.A01)) * 31) + C3cH.A02(this.A02);
    }

    public final String toString() {
        EnumC10364HCl enumC10364HCl = this.A00;
        Integer num = this.A01;
        Integer num2 = this.A02;
        StringBuilder sbA0f = C3cG.A0f(enumC10364HCl, "Error(errorCode=");
        sbA0f.append(", attemptsRemaining=");
        sbA0f.append(num);
        return C3cJ.A0L(num2, ", backoffInSeconds=", sbA0f);
    }

    public ADB(EnumC10364HCl enumC10364HCl, Integer num, Integer num2) {
        this.A00 = enumC10364HCl;
        this.A01 = num;
        this.A02 = num2;
    }
}
