package com.facebook.aura.gateway;

import X.C10571Hud;
import X.Hr7;
import com.facebook.aura.json.HatchJsonKt;
import com.facebook.aura.model.HatchTextEntitySegment;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlinx.serialization.json.JsonArray;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonPrimitive;

/* loaded from: classes3.dex */
public abstract class HatchTextEntitySegmentJsonKt {
    public static final String PRODUCT_ARM = "product";
    public static final String SEGMENT_FIELD = "segment";
    public static final String TEXT_ARM = "text";

    public static final JsonArray asSegmentArray(JsonElement jsonElement) {
        Object c10571Hud;
        if (jsonElement instanceof JsonArray) {
            return (JsonArray) jsonElement;
        }
        if (!(jsonElement instanceof JsonPrimitive)) {
            return null;
        }
        JsonPrimitive jsonPrimitive = (JsonPrimitive) jsonElement;
        if (!jsonPrimitive.A01()) {
            return null;
        }
        try {
            Object objA04 = HatchJsonKt.HatchJson.A04(jsonPrimitive.A00());
            c10571Hud = objA04 instanceof JsonArray ? (JsonArray) objA04 : null;
        } catch (Throwable th) {
            c10571Hud = new C10571Hud(th);
        }
        return (JsonArray) (c10571Hud instanceof C10571Hud ? null : c10571Hud);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0043, code lost:
    
        r3 = null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final com.facebook.aura.model.HatchTextEntitySegment toTextEntitySegment(kotlinx.serialization.json.JsonElement r7) {
        /*
            boolean r0 = r7 instanceof kotlinx.serialization.json.JsonObject
            r4 = 0
            if (r0 == 0) goto L3f
            kotlinx.serialization.json.JsonObject r7 = (kotlinx.serialization.json.JsonObject) r7
            if (r7 == 0) goto L3f
            java.lang.String r0 = "segment"
            kotlinx.serialization.json.JsonElement r5 = X.C60O.A1F(r0, r7)
        Lf:
            boolean r0 = r5 instanceof kotlinx.serialization.json.JsonObject
            if (r0 == 0) goto L97
            kotlinx.serialization.json.JsonObject r5 = (kotlinx.serialization.json.JsonObject) r5
            if (r5 == 0) goto L97
            java.util.Set r0 = r5.entrySet()
            java.util.Iterator r7 = r0.iterator()
            r6 = 0
            r3 = r4
        L21:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L41
            java.lang.Object r2 = r7.next()
            r0 = r2
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r1 = r0.getValue()
            kotlinx.serialization.json.JsonNull r0 = kotlinx.serialization.json.JsonNull.A00
            boolean r0 = X.C7384Etj.areEqual(r1, r0)
            if (r0 != 0) goto L21
            if (r6 != 0) goto L43
            r6 = 1
            r3 = r2
            goto L21
        L3f:
            r5 = r4
            goto Lf
        L41:
            if (r6 != 0) goto L44
        L43:
            r3 = r4
        L44:
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            if (r3 == 0) goto L97
            java.lang.Object r1 = r3.getKey()
            r3.getValue()
            java.lang.String r0 = "text"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L5f
            java.lang.String r0 = "product"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L97
        L5f:
            X.9sU r1 = com.facebook.aura.json.HatchJsonKt.HatchJson     // Catch: java.lang.Throwable -> L7c
            com.facebook.aura.gateway.TextEntitySegmentOneofJson$$serializer r0 = com.facebook.aura.gateway.TextEntitySegmentOneofJson$$serializer.INSTANCE     // Catch: java.lang.Throwable -> L7c
            java.lang.Object r0 = r1.A01(r0, r5)     // Catch: java.lang.Throwable -> L7c
            com.facebook.aura.gateway.TextEntitySegmentOneofJson r0 = (com.facebook.aura.gateway.TextEntitySegmentOneofJson) r0     // Catch: java.lang.Throwable -> L7c
            java.lang.String r3 = r0.text     // Catch: java.lang.Throwable -> L7c
            com.facebook.aura.gateway.ShoppingProductEntityJson r0 = r0.product     // Catch: java.lang.Throwable -> L7c
            if (r0 == 0) goto L7a
            com.facebook.aura.shopping.model.ShoppingResultProduct r1 = r0.toDomain()     // Catch: java.lang.Throwable -> L7c
        L73:
            r0 = 0
            com.facebook.aura.model.HatchTextEntitySegment r2 = new com.facebook.aura.model.HatchTextEntitySegment     // Catch: java.lang.Throwable -> L7c
            r2.<init>(r3, r1, r0)     // Catch: java.lang.Throwable -> L7c
            goto L81
        L7a:
            r1 = r4
            goto L73
        L7c:
            r0 = move-exception
            X.Hud r2 = X.C3cG.A0s(r0)
        L81:
            java.lang.Throwable r0 = X.HsJ.A00(r2)
            if (r0 == 0) goto L8e
            java.lang.String r1 = "HatchTextEntitySegmentJson"
            java.lang.String r0 = "Failed to decode built-in text entity segment"
            X.CFK.A06(r1, r0)
        L8e:
            boolean r0 = r2 instanceof X.C10571Hud
            if (r0 != 0) goto L93
            r4 = r2
        L93:
            com.facebook.aura.model.HatchTextEntitySegment r4 = (com.facebook.aura.model.HatchTextEntitySegment) r4
            if (r4 != 0) goto L9d
        L97:
            r0 = 0
            com.facebook.aura.model.HatchTextEntitySegment r4 = new com.facebook.aura.model.HatchTextEntitySegment
            r4.<init>(r0, r0, r0)
        L9d:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.gateway.HatchTextEntitySegmentJsonKt.toTextEntitySegment(kotlinx.serialization.json.JsonElement):com.facebook.aura.model.HatchTextEntitySegment");
    }

    public static final List<HatchTextEntitySegment> parseTextEntitySegments(JsonElement jsonElement) {
        JsonArray jsonArrayAsSegmentArray = asSegmentArray(jsonElement);
        if (jsonArrayAsSegmentArray != null) {
            ArrayList arrayList = new ArrayList(Hr7.A1D(jsonArrayAsSegmentArray, 10));
            Iterator<JsonElement> it = jsonArrayAsSegmentArray.iterator();
            while (it.hasNext()) {
                arrayList.add(toTextEntitySegment(it.next()));
            }
            if (!arrayList.isEmpty()) {
                return arrayList;
            }
        }
        return null;
    }
}
