package com.facebook.aura.spaces.repo;

import X.AbstractC2159Azp;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.C10571Hud;
import X.C3cG;
import X.C60O;
import X.C60P;
import X.C7384Etj;
import X.CFK;
import X.HsJ;
import com.facebook.aura.activation.view.InviteCodeScratcherKt;
import com.facebook.aura.ccv.nativeflow.ui.HatchCcvLoggingKt;
import com.facebook.aura.json.HatchJsonKt;

/* loaded from: classes3.dex */
public abstract class HatchSpacesDataSourceJsonKt {
    public static final String TAG = "HatchSpacesDataSource";

    public static final String nonBlank(String str) {
        String strA0l;
        if (str == null || (strA0l = AnonymousClass002.A0l(str)) == null || strA0l.length() <= 0 || strA0l.equals(HatchCcvLoggingKt.NO_POSTAL_FIELD)) {
            return null;
        }
        return strA0l;
    }

    public static final SpaceEntryJson parseSingleSpaceResponse(String str) {
        Object objA0s;
        C7384Etj.A0Y(str, 0);
        try {
            objA0s = (SpaceEntryJson) HatchJsonKt.HatchJson.A00(str, SpaceEntryJson$$serializer.INSTANCE);
        } catch (Throwable th) {
            objA0s = C3cG.A0s(th);
        }
        Throwable thA00 = HsJ.A00(objA0s);
        if (thA00 != null) {
            CFK.A0A("HatchSpacesDataSource", "GET /spaces/{slug} response parse failed", thA00);
        }
        if (objA0s instanceof C10571Hud) {
            objA0s = null;
        }
        SpaceEntryJson spaceEntryJson = (SpaceEntryJson) objA0s;
        if (spaceEntryJson == null || spaceEntryJson.resolvedSlug() == null) {
            return null;
        }
        return spaceEntryJson;
    }

    public static final String defaultTitleForSlug(String str) {
        String strA0l = AnonymousClass002.A0l(AbstractC2159Azp.A0z(AbstractC2159Azp.A0z(str, "_", InviteCodeScratcherKt.CODE_SEPARATOR), "-", InviteCodeScratcherKt.CODE_SEPARATOR));
        int length = strA0l.length();
        if (length == 0) {
            return "Space";
        }
        if (length <= 0) {
            return strA0l;
        }
        StringBuilder sbA0w = C60O.A0w();
        return AnonymousClass001.A0v(C60P.A1N(strA0l, sbA0w), sbA0w);
    }
}
