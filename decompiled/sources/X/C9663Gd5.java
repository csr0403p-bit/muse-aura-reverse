package X;

/* renamed from: X.Gd5, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9663Gd5 extends C06G implements InterfaceC9665Gd7 {
    public final String A00;
    public final String A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C9663Gd5) {
                C9663Gd5 c9663Gd5 = (C9663Gd5) obj;
                if (!C7384Etj.areEqual(this.A01, c9663Gd5.A01) || !C7384Etj.areEqual(this.A00, c9663Gd5.A00)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC9725Ged
    public final Integer AFu() {
        return C79.A01;
    }

    @Override // X.InterfaceC9725Ged
    public final String AJA() {
        return this.A01;
    }

    @Override // X.InterfaceC9725Ged
    public final C9698Ge3 AJG() {
        return null;
    }

    @Override // X.InterfaceC9725Ged
    public final /* synthetic */ C9661Gd3 AJL() {
        return null;
    }

    @Override // X.InterfaceC9725Ged
    public final String AMI() {
        return this.A00;
    }

    public final int hashCode() {
        return AnonymousClass001.A0H(this.A00, AnonymousClass001.A0G(this.A01));
    }

    public final String toString() {
        return FGI.A0c("AsyncRedeliver(productType=", this.A01, ", uplSessionId=", this.A00);
    }

    public C9663Gd5(String str, String str2) {
        AnonymousClass003.A0u(str, str2);
        this.A01 = str;
        this.A00 = str2;
    }
}
