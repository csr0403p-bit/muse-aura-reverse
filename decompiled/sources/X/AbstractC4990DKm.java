package X;

import com.facebook.aura.commands.photos.PhotosSearchHandlerKt;
import com.facebook.aura.localbrowser.core.BrowserOperationCatalogKt;
import com.facebook.mobileconfig.factory.MobileConfigValueSource;
import java.io.StringWriter;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.DKm, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC4990DKm {
    public static final C3339CFj A00 = new C3339CFj();

    /* JADX WARN: Removed duplicated region for block: B:23:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x017e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String A01(X.DSU r14, java.util.List<X.CA3> r15, boolean r16) {
        /*
            Method dump skipped, instructions count: 536
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC4990DKm.A01(X.DSU, java.util.List, boolean):java.lang.String");
    }

    public static String A00(C3341CFl c3341CFl) {
        StringWriter stringWriter = new StringWriter();
        C3343CFo c3343CFoA00 = C3343CFo.A00();
        C1H.A01(c3343CFoA00, "encoder cannot be null!");
        c3341CFl.A02 = c3343CFoA00;
        c3341CFl.A0B(stringWriter);
        c3341CFl.A03();
        return stringWriter.toString();
    }

    public static Map<String, String> A02(DSU dsu, long j) {
        HashMap mapA0u = BV4.A0u();
        int iA04 = BV8.A04(j);
        C4992DKo c4992DKo = C4992DKo.A06;
        C4992DKo c4992DKoA00 = C4992DKo.A00(c4992DKo);
        c4992DKoA00.A02 = true;
        mapA0u.put(BrowserOperationCatalogKt.VALUE, iA04 != 1 ? iA04 != 2 ? iA04 != 3 ? iA04 != 4 ? "UNSUPPORTED TYPE" : String.valueOf(dsu.getDoubleWithOptions(j, c4992DKoA00)) : ((j >>> 60) & 1) == 1 ? dsu.getStringWithOptions(j, "__fbt_null__", c4992DKo) : dsu.getStringWithOptions(j, c4992DKo) : String.valueOf(dsu.getLongWithOptions(j, c4992DKoA00)) : String.valueOf(dsu.getBooleanWithOptions(j, c4992DKoA00)));
        MobileConfigValueSource mobileConfigValueSource = c4992DKoA00.A00.A01;
        int iOrdinal = mobileConfigValueSource.ordinal();
        if (iOrdinal != 1 && iOrdinal != 0) {
            mapA0u.put(PhotosSearchHandlerKt.PARAM_SOURCE, iOrdinal != 2 ? FGI.A0I("default[", mobileConfigValueSource.getSource(), "]") : "override");
        }
        mapA0u.put("sourceEnum", mobileConfigValueSource.getSourceAsString());
        return mapA0u;
    }
}
