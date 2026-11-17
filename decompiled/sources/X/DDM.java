package X;

/* loaded from: classes5.dex */
public final class DDM extends C06G {
    public final String A00;
    public final String A01;
    public final String A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof DDM) {
                DDM ddm = (DDM) obj;
                if (!C7384Etj.areEqual(this.A02, ddm.A02) || !C7384Etj.areEqual(this.A00, ddm.A00) || !C7384Etj.areEqual(this.A01, ddm.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass001.A0H(this.A01, AnonymousClass005.A0I(this.A00, AnonymousClass001.A0G(this.A02)));
    }

    public final String toString() {
        return FGI.A0k("VideoCacheEntity(videoId=", this.A02, ", cacheKey=", this.A00, ", filePath=", this.A01, ")");
    }

    public DDM(String str, String str2, String str3) {
        AnonymousClass003.A0u(str, str2);
        this.A02 = str;
        this.A00 = str2;
        this.A01 = str3;
    }
}
