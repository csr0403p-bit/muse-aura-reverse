package X;

import android.net.Uri;
import java.util.List;

/* renamed from: X.ENn, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C6662ENn {
    public final Uri A00;
    public final String A01;
    public final List<String> A02;
    public final EP1 A03;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C6662ENn) {
                C6662ENn c6662ENn = (C6662ENn) obj;
                if (!this.A00.equals(c6662ENn.A00) || !C7384Etj.areEqual(this.A02, c6662ENn.A02) || !C7384Etj.areEqual(this.A01, c6662ENn.A01) || this.A03 != c6662ENn.A03) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((((AnonymousClass005.A0E(this.A00) + AnonymousClass006.A0D(this.A02)) * 31) + AnonymousClass006.A0G(this.A01)) * 31) + C3cH.A02(this.A03);
    }

    public final String toString() {
        Uri uri = this.A00;
        List<String> list = this.A02;
        String str = this.A01;
        EP1 ep1 = this.A03;
        StringBuilder sbA0f = C3cG.A0f(uri, "ContentProviderQueryParams(queryUri=");
        sbA0f.append(", projection=");
        sbA0f.append(list);
        sbA0f.append(", selection=");
        sbA0f.append(str);
        return C3cJ.A0L(ep1, ", credentialSource=", sbA0f);
    }

    /* JADX WARN: Incorrect types in method signature: (Landroid/net/Uri;Ljava/util/List<Ljava/lang/String;>;Ljava/lang/String;LX/EP1;)V */
    public C6662ENn(Uri uri, String str, List list, EP1 ep1) {
        this.A00 = uri;
        this.A02 = list;
        this.A01 = str;
        this.A03 = ep1;
    }
}
