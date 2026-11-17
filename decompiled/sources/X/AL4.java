package X;

/* loaded from: classes4.dex */
public final class AL4 extends C06G {
    public final Integer A00;
    public final Throwable A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AL4) {
                AL4 al4 = (AL4) obj;
                if (this.A00 != al4.A00 || !C7384Etj.areEqual(this.A01, al4.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        String str;
        int iIntValue = this.A00.intValue();
        switch (iIntValue) {
            case 1:
                str = "INITIALIZATION";
                break;
            case 2:
                str = "INITIAL_STYLE";
                break;
            default:
                str = "LIFECYCLE_OWNER";
                break;
        }
        return AnonymousClass005.A0G(this.A01, (str.hashCode() + iIntValue) * 31);
    }

    public AL4(Integer num, Throwable th) {
        this.A00 = num;
        this.A01 = th;
    }
}
