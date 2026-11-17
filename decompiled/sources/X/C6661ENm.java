package X;

import android.net.Uri;
import com.facebook.aura.localbrowser.core.BrowserOperationCatalogKt;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/* renamed from: X.ENm, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C6661ENm extends AbstractC7559F3s implements G0W<EP0, Set<? extends EP1>, String, List<? extends C6662ENn>> {
    public final /* synthetic */ String $baseUri;
    public final /* synthetic */ String $path;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6661ENm(String str, String str2) {
        super(3);
        this.$baseUri = str;
        this.$path = str2;
    }

    @Override // X.G0W
    public final /* bridge */ /* synthetic */ List<? extends C6662ENn> invoke(EP0 ep0, Set<? extends EP1> set, String str) {
        String str2;
        Set<? extends EP1> set2 = set;
        C7384Etj.A0Y(set2, 1);
        Uri uriA01 = null;
        try {
            uriA01 = C7Je.A01(this.$baseUri);
        } catch (SecurityException | UnsupportedOperationException unused) {
        }
        if (uriA01 == null) {
            return C0881AGi.A00;
        }
        Uri.Builder builderBuildUpon = uriA01.buildUpon();
        String str3 = this.$path;
        if (str3 != null) {
            builderBuildUpon.appendPath(str3);
        }
        Uri uriBuild = builderBuildUpon.build();
        List listA16 = C60O.A16("name", BrowserOperationCatalogKt.VALUE);
        ArrayList arrayListA0h = C3cG.A0h();
        for (EP1 ep1 : set2) {
            int iOrdinal = ep1.ordinal();
            if (iOrdinal == 0) {
                str2 = "name='active_session_info'";
            } else if (iOrdinal == 2) {
                str2 = "name='saved_session_info'";
            } else {
                if (iOrdinal != 1) {
                    throw C3cG.A0q();
                }
                str2 = "name='mas_session_info'";
            }
            C7384Etj.A0X(uriBuild);
            arrayListA0h.add(new C6662ENn(uriBuild, str2, listA16, ep1));
        }
        return arrayListA0h;
    }
}
