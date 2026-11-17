package X;

import android.net.Uri;
import com.facebook.aura.localbrowser.core.BrowserOperationCatalogKt;
import java.util.Collections;
import java.util.Set;

/* loaded from: classes5.dex */
public final class Dt3 extends AbstractC7559F3s implements G0W {
    public final int $t;
    public final String A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Dt3(String str, int i) {
        super(3);
        this.$t = i;
        this.A00 = str;
    }

    @Override // X.G0W
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        C6662ENn c6662ENn;
        switch (this.$t) {
            case 0:
                EP0 ep0 = (EP0) obj;
                Set set = (Set) obj2;
                String str = (String) obj3;
                AnonymousClass003.A0u(ep0, set);
                Uri uriA01 = null;
                try {
                    uriA01 = C7Je.A01(this.A00);
                } catch (SecurityException | UnsupportedOperationException unused) {
                }
                if (uriA01 != null) {
                    Uri.Builder builderAppendQueryParameter = uriA01.buildUpon().appendPath("accounts").appendQueryParameter("app_source", ep0.name());
                    if (!set.isEmpty()) {
                        builderAppendQueryParameter.appendQueryParameter("credential_source", AbstractC06907md.A01(",", set, new EY5(24)));
                    }
                    if (str != null && str.length() != 0) {
                        builderAppendQueryParameter.appendQueryParameter("target_user_id", str);
                    }
                    Uri uriBuild = builderAppendQueryParameter.build();
                    C7384Etj.A0U(uriBuild);
                    c6662ENn = new C6662ENn(uriBuild, null, null, null);
                    return Collections.singletonList(c6662ENn);
                }
                return C0881AGi.A00;
            case 1:
                Set set2 = (Set) obj2;
                C7384Etj.A0Y(set2, 1);
                Uri uriA012 = null;
                try {
                    uriA012 = C7Je.A01(FGI.A0M(this.A00, "/user_values"));
                } catch (SecurityException | UnsupportedOperationException unused2) {
                }
                if (uriA012 != null) {
                    EP1 ep1 = EP1.A03;
                    if (set2.contains(ep1)) {
                        c6662ENn = new C6662ENn(uriA012, null, null, ep1);
                        return Collections.singletonList(c6662ENn);
                    }
                }
                return C0881AGi.A00;
            default:
                Set set3 = (Set) obj2;
                C7384Etj.A0Y(set3, 1);
                String str2 = this.A00;
                Uri uriA013 = null;
                try {
                    uriA013 = C7Je.A01(str2);
                } catch (SecurityException | UnsupportedOperationException unused3) {
                }
                if (uriA013 != null) {
                    EP1 ep12 = EP1.A03;
                    if (set3.contains(ep12)) {
                        return Collections.singletonList(new C6662ENn(uriA013, "name='active_session_info'", C60O.A16("name", BrowserOperationCatalogKt.VALUE), ep12));
                    }
                }
                return C0881AGi.A00;
        }
    }
}
