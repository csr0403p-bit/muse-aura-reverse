package com.facebook.aura.json;

import X.AbstractC0885AGm;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.C60O;
import X.C60Q;
import X.F60;
import X.FGI;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlinx.serialization.json.JsonArray;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonPrimitive;

/* loaded from: classes3.dex */
public abstract class JsonObjectParamsKt {
    public static final List<JsonObject> objectListParam(JsonObject jsonObject, String str, String str2) {
        JsonArray jsonArray;
        AnonymousClass005.A0x(jsonObject, str, str2);
        JsonElement jsonElementA1F = C60O.A1F(str, jsonObject);
        ArrayList arrayListA0i = null;
        if (jsonElementA1F != null || (jsonElementA1F = (JsonElement) jsonObject.get(str2)) != null) {
            if (jsonElementA1F instanceof JsonPrimitive) {
                JsonPrimitive jsonPrimitive = (JsonPrimitive) jsonElementA1F;
                if (jsonPrimitive.A01()) {
                    jsonElementA1F = HatchJsonKt.HatchJson.A04(jsonPrimitive.A00());
                }
            }
            if (!(jsonElementA1F instanceof JsonArray) || (jsonArray = (JsonArray) jsonElementA1F) == null) {
                throw C60Q.A0U(str, " must be a JSON array");
            }
            arrayListA0i = AnonymousClass003.A0i(jsonArray);
            Iterator<JsonElement> it = jsonArray.iterator();
            int i = 0;
            while (it.hasNext()) {
                JsonElement next = it.next();
                int i2 = i + 1;
                if (i < 0) {
                    AbstractC0885AGm.A14();
                    throw F60.createAndThrow();
                }
                if (!(next instanceof JsonObject) || next == null) {
                    throw C60O.A0i(FGI.A0X(str, "[", "] must be a JSON object", i));
                }
                arrayListA0i.add(next);
                i = i2;
            }
        }
        return arrayListA0i;
    }
}
