package X;

/* loaded from: classes6.dex */
public final class Hnp extends HoL {
    public final HxG A00;
    public final Throwable A01;
    public final Hr8 A02;
    public final String A03;

    public Hnp(HxG hxG, Hr8 hr8, String str, Throwable th) {
        super(hr8, str, true);
        this.A03 = str;
        this.A01 = th;
        this.A02 = hr8;
        this.A00 = hxG;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof Hnp) {
                Hnp hnp = (Hnp) obj;
                if (!this.A03.equals(hnp.A03) || !this.A01.equals(hnp.A01) || !this.A02.equals(hnp.A02) || !C7384Etj.areEqual(this.A00, hnp.A00)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass005.A0F(this.A02, AnonymousClass005.A0F(this.A01, AnonymousClass001.A0G(this.A03))) + AnonymousClass006.A0D(this.A00);
    }

    public final String toString() {
        String str = this.A03;
        Throwable th = this.A01;
        Hr8 hr8 = this.A02;
        HxG hxG = this.A00;
        StringBuilder sbA0x = C3cI.A0x("Failure(key=", str);
        sbA0x.append(", exception=");
        sbA0x.append(th);
        sbA0x.append(", summary=");
        sbA0x.append(hr8);
        return C3cJ.A0L(hxG, ", fetchErrorInfo=", sbA0x);
    }
}
