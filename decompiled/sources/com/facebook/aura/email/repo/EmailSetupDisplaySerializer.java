package com.facebook.aura.email.repo;

import X.AnonymousClass002;
import X.AnonymousClass006;
import X.C3cG;
import X.C3cH;
import X.C7384Etj;
import X.C9i2;
import X.HxE;
import com.facebook.aura.library.repo.UnifiedArtifactKt;
import com.facebook.aura.opengraph.HatchWebPageParserKt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlinx.serialization.json.JsonArray;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonObject;

/* loaded from: classes4.dex */
public final class EmailSetupDisplaySerializer extends C9i2<EmailSetupDisplayJson> {
    public static final EmailSetupDisplaySerializer INSTANCE = new EmailSetupDisplaySerializer();

    @Override // X.C9i2
    public JsonElement transformDeserialize(JsonElement jsonElement) {
        JsonArray jsonArray;
        C7384Etj.A0Y(jsonElement, 0);
        JsonObject jsonObject = jsonElement instanceof JsonObject ? (JsonObject) jsonElement : null;
        JsonElement jsonElement2 = jsonObject != null ? (JsonElement) jsonObject.get("intro") : null;
        JsonObject jsonObject2 = jsonElement2 instanceof JsonObject ? (JsonObject) jsonElement2 : null;
        Map<String, JsonElement> mapStringFields = EmailRepositoryJsonKt.stringFields(jsonObject2);
        LinkedHashMap linkedHashMapA0j = C3cG.A0j();
        Iterator itA0n = AnonymousClass002.A0n(mapStringFields);
        while (itA0n.hasNext()) {
            Map.Entry entryA0l = C3cH.A0l(itA0n);
            Object key = entryA0l.getKey();
            if ("title".equals(key) || "footer".equals(key)) {
                AnonymousClass006.A1R(linkedHashMapA0j, entryA0l);
            }
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(linkedHashMapA0j);
        JsonElement jsonElement3 = jsonObject2 != null ? (JsonElement) jsonObject2.get("points") : null;
        if ((jsonElement3 instanceof JsonArray) && (jsonArray = (JsonArray) jsonElement3) != null) {
            ArrayList arrayListA0h = C3cG.A0h();
            Iterator<JsonElement> it = jsonArray.iterator();
            while (it.hasNext()) {
                JsonElement next = it.next();
                Map<String, JsonElement> mapStringFields2 = EmailRepositoryJsonKt.stringFields(next instanceof JsonObject ? (JsonObject) next : null);
                if (mapStringFields2.get("title") != null && mapStringFields2.get(HatchWebPageParserKt.DESCRIPTION) != null) {
                    arrayListA0h.add(new JsonObject(mapStringFields2));
                }
            }
            linkedHashMap.put("points", new JsonArray(arrayListA0h));
        }
        HxE hxEA0r = C3cG.A0r("intro", new JsonObject(linkedHashMap));
        JsonElement jsonElement4 = jsonObject != null ? (JsonElement) jsonObject.get("address") : null;
        HxE hxEA0r2 = C3cG.A0r("address", new JsonObject(EmailRepositoryJsonKt.stringFields(jsonElement4 instanceof JsonObject ? (JsonObject) jsonElement4 : null)));
        Object obj = jsonObject != null ? (JsonElement) jsonObject.get(UnifiedArtifactKt.OWNER_PRINCIPAL) : null;
        return new JsonObject(C3cH.A0m(UnifiedArtifactKt.OWNER_PRINCIPAL, new JsonObject(EmailRepositoryJsonKt.stringFields(obj instanceof JsonObject ? (JsonObject) obj : null)), hxEA0r, hxEA0r2));
    }

    public EmailSetupDisplaySerializer() {
        super(EmailSetupDisplayJson$$serializer.INSTANCE);
    }
}
