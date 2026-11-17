package com.facebook.aura.model;

import X.AbstractC0878AGe;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.BHQ;
import X.C10571Hud;
import X.C3cG;
import X.C7384Etj;
import X.C9iZ;
import X.C9sU;
import X.CFK;
import X.HsJ;
import com.facebook.aura.json.HatchJsonKt;
import java.util.Set;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonObject;

/* loaded from: classes2.dex */
public abstract class GenericListPresentationJsonKt {
    public static final String GENERIC_LIST_TAG = "GenericListPresentationJson";
    public static final Set<String> PARSED_ROW_DATA_KEYS;

    static {
        C9iZ c9iZ = GenericListRowDataJson$$serializer.descriptor;
        C7384Etj.A0Y(c9iZ, 0);
        PARSED_ROW_DATA_KEYS = AbstractC0878AGe.A0g(new BHQ(c9iZ));
    }

    public static final GenericListRowDataJson decodeRowData(JsonObject jsonObject) {
        Object objA0s;
        try {
            objA0s = (GenericListRowDataJson) HatchJsonKt.HatchJson.A01(GenericListRowDataJson$$serializer.INSTANCE, jsonObject);
        } catch (Throwable th) {
            objA0s = C3cG.A0s(th);
        }
        if (HsJ.A00(objA0s) != null) {
            CFK.A06(GENERIC_LIST_TAG, "Ignoring malformed generic_list row data");
        }
        if (objA0s instanceof C10571Hud) {
            objA0s = null;
        }
        return (GenericListRowDataJson) objA0s;
    }

    public static final FareCondition fareConditionFromWire(String str) {
        String strA0l;
        String strA0u = (str == null || (strA0l = AnonymousClass002.A0l(str)) == null) ? null : AnonymousClass001.A0u(strA0l);
        return "yes".equals(strA0u) ? FareCondition.YES : "no".equals(strA0u) ? FareCondition.NO : FareCondition.NOT_STATED;
    }

    public static final GenericListPresentation parseGenericListPresentation(JsonElement jsonElement) {
        Object objA0s;
        if (!(jsonElement instanceof JsonObject)) {
            return null;
        }
        try {
            C9sU c9sU = HatchJsonKt.HatchJson;
            int i = GenericListPresentationJson.$stable;
            objA0s = (GenericListPresentationJson) c9sU.A01(GenericListPresentationJson$$serializer.INSTANCE, jsonElement);
        } catch (Throwable th) {
            objA0s = C3cG.A0s(th);
        }
        if (objA0s instanceof C10571Hud) {
            objA0s = null;
        }
        GenericListPresentationJson genericListPresentationJson = (GenericListPresentationJson) objA0s;
        if (genericListPresentationJson != null) {
            return genericListPresentationJson.toDomain();
        }
        return null;
    }
}
