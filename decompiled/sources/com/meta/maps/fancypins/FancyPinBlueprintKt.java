package com.meta.maps.fancypins;

import X.AbstractC0878AGe;
import X.AbstractC7608F5v;
import X.AnonymousClass001;
import X.AnonymousClass005;
import X.BV4;
import X.BV5;
import X.BV6;
import X.C0881AGi;
import X.C3cG;
import X.C60O;
import X.C60Q;
import X.C7384Etj;
import X.C9jH;
import X.DCl;
import X.FGI;
import X.G0U;
import android.util.JsonReader;
import android.util.JsonToken;
import com.facebook.aura.bloks.extensions.visibility.AuraImpressionTimeTracker;
import com.facebook.aura.localbrowser.LocalBrowserCapacityKt;
import com.facebook.aura.opengraph.HatchWebPageParserKt;
import com.facebook.aura.pairs.PairsAnalyticsKt;
import java.io.IOException;
import java.io.StringReader;
import java.nio.ByteBuffer;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CodingErrorAction;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public abstract class FancyPinBlueprintKt {
    public static final int BLUEPRINT_SCHEMA_VERSION = 0;
    public static final long MAX_CLUSTER_MEMBER_COUNT = 4294967295L;

    public static final int optionalUInt16(JSONObject jSONObject, String str) {
        if (!jSONObject.has(str) || jSONObject.isNull(str)) {
            return 0;
        }
        return (int) requiredInteger(jSONObject, str, 0L, 65535L);
    }

    public static final void validateJsonStringSyntax(String str) {
        int i = 0;
        boolean z = false;
        while (true) {
            int length = str.length();
            if (i >= length) {
                if (z) {
                    throw C60O.A0i("Invalid FancyPin blueprint unterminated JSON string");
                }
                return;
            }
            char cCharAt = str.charAt(i);
            if (z) {
                if (cCharAt == '\"') {
                    z = false;
                } else if (cCharAt == '\\') {
                    int i2 = i + 1;
                    if (i2 >= length) {
                        throw C60O.A0i("Invalid FancyPin blueprint JSON escape");
                    }
                    char cCharAt2 = str.charAt(i2);
                    if (cCharAt2 != '\"' && cCharAt2 != '/' && cCharAt2 != '\\' && cCharAt2 != 'b' && cCharAt2 != 'f' && cCharAt2 != 'n' && cCharAt2 != 'r' && cCharAt2 != 't') {
                        if (cCharAt2 != 'u') {
                            throw C60O.A0i("Invalid FancyPin blueprint JSON escape");
                        }
                        i += 5;
                        if (i >= length) {
                            throw C60O.A0i("Invalid FancyPin blueprint Unicode escape");
                        }
                        int i3 = 0;
                        while (isJsonHexDigit(str.charAt(i2 + i3 + 1))) {
                            i3++;
                            if (i3 < 4) {
                            }
                        }
                        throw C60O.A0i("Invalid FancyPin blueprint Unicode escape");
                    }
                    i = i2;
                } else if (cCharAt < ' ') {
                    throw C60O.A0i("Invalid FancyPin blueprint JSON control character");
                }
            } else if (cCharAt == '\"') {
                z = true;
            }
            i++;
        }
    }

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[AnchorReference.values().length];
            try {
                AnonymousClass005.A0v(AnchorReference.PART, iArr, 1);
            } catch (NoSuchFieldError unused) {
            }
            try {
                AnonymousClass005.A0v(AnchorReference.PIN_CENTER, iArr, 2);
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[SizeConstraint.values().length];
            try {
                AnonymousClass005.A0v(SizeConstraint.FIXED, iArr2, 1);
            } catch (NoSuchFieldError unused3) {
            }
            try {
                AnonymousClass005.A0v(SizeConstraint.AUTO, iArr2, 2);
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public static final boolean isFinite(RectInsets rectInsets) {
        return Math.abs(rectInsets.top) <= Double.MAX_VALUE && Math.abs(rectInsets.left) <= Double.MAX_VALUE && Math.abs(rectInsets.bottom) <= Double.MAX_VALUE && Math.abs(rectInsets.right) <= Double.MAX_VALUE;
    }

    public static final boolean isJsonHexDigit(char c) {
        if ('0' > c) {
            return false;
        }
        if (c < ':') {
            return true;
        }
        if ('A' > c) {
            return false;
        }
        if (c >= 'G') {
            return 'a' <= c && c < 'g';
        }
        return true;
    }

    public static final JSONObject parseBlueprintJsonObject(byte[] bArr) throws IOException {
        try {
            CharsetDecoder charsetDecoderNewDecoder = DCl.A05.newDecoder();
            CodingErrorAction codingErrorAction = CodingErrorAction.REPORT;
            String strA0o = C60O.A0o(charsetDecoderNewDecoder.onMalformedInput(codingErrorAction).onUnmappableCharacter(codingErrorAction).decode(ByteBuffer.wrap(bArr)));
            validateJsonStringSyntax(strA0o);
            JsonReader jsonReader = new JsonReader(new StringReader(strA0o));
            try {
                jsonReader.setLenient(false);
                jsonReader.skipValue();
                if (jsonReader.peek() != JsonToken.END_DOCUMENT) {
                    throw C60O.A0i("Invalid FancyPin blueprint JSON: trailing input");
                }
                jsonReader.close();
                return new JSONObject(strA0o);
            } finally {
            }
        } catch (Exception e) {
            throw BV4.A0Q("Invalid FancyPin blueprint JSON object", e);
        }
    }

    public static final LayoutAnchor parseLayoutAnchor(JSONObject jSONObject) throws JSONException {
        LayoutGridPoint layoutGridPoint;
        AnchorReference next;
        LayoutGridPoint next2;
        String strRequiredString = requiredString(jSONObject, "reference");
        Iterator<AnchorReference> it = AnchorReference.getEntries().iterator();
        while (true) {
            layoutGridPoint = null;
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (C7384Etj.areEqual(next.getJsonValue$xplat_maps_sdk_packages_fancypins_fancypins_kotlin(), strRequiredString)) {
                break;
            }
        }
        AnchorReference anchorReference = next;
        if (anchorReference == null) {
            throw C60O.A0i("Invalid FancyPin JSON field 'reference': expected pinCenter or part");
        }
        String strRequiredString2 = requiredString(jSONObject, "attachTo");
        String strRequiredString3 = requiredString(jSONObject, "attachFrom");
        Iterator<LayoutGridPoint> it2 = LayoutGridPoint.getEntries().iterator();
        while (true) {
            if (!it2.hasNext()) {
                next2 = null;
                break;
            }
            next2 = it2.next();
            if (C7384Etj.areEqual(next2.getJsonValue$xplat_maps_sdk_packages_fancypins_fancypins_kotlin(), strRequiredString2)) {
                break;
            }
        }
        LayoutGridPoint layoutGridPoint2 = next2;
        if (layoutGridPoint2 == null) {
            layoutGridPoint2 = LayoutGridPoint.CENTER;
        }
        Iterator<LayoutGridPoint> it3 = LayoutGridPoint.getEntries().iterator();
        while (true) {
            if (!it3.hasNext()) {
                break;
            }
            LayoutGridPoint next3 = it3.next();
            if (C7384Etj.areEqual(next3.getJsonValue$xplat_maps_sdk_packages_fancypins_fancypins_kotlin(), strRequiredString3)) {
                layoutGridPoint = next3;
                break;
            }
        }
        LayoutGridPoint layoutGridPoint3 = layoutGridPoint;
        if (layoutGridPoint3 == null) {
            layoutGridPoint3 = LayoutGridPoint.CENTER;
        }
        return new LayoutAnchor(anchorReference, requiredNumber(jSONObject, "xOffset"), requiredNumber(jSONObject, "yOffset"), optionalString(jSONObject, "targetPartId"), layoutGridPoint2, layoutGridPoint3);
    }

    public static final LayoutSize parseLayoutSize(JSONObject jSONObject) throws JSONException {
        SizeConstraint next;
        String strRequiredString = requiredString(jSONObject, "constraint");
        Iterator<SizeConstraint> it = SizeConstraint.getEntries().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (C7384Etj.areEqual(next.getJsonValue$xplat_maps_sdk_packages_fancypins_fancypins_kotlin(), strRequiredString)) {
                break;
            }
        }
        SizeConstraint sizeConstraint = next;
        if (sizeConstraint != null) {
            return new LayoutSize(sizeConstraint, requiredSizeValue(jSONObject, HatchWebPageParserKt.WIDTH_ATTR), requiredSizeValue(jSONObject, HatchWebPageParserKt.HEIGHT_ATTR));
        }
        throw C60O.A0i("Invalid FancyPin JSON field 'constraint': expected fixed or auto");
    }

    public static final FancyPinPart parsePart(JSONObject jSONObject) throws JSONException {
        FancyPinClusteringPolicy fancyPinClusteringPolicy;
        String strRequiredString = requiredString(jSONObject, "id");
        LayoutSize layoutSize = parseLayoutSize(requiredObject(jSONObject, "size"));
        JSONArray jSONArrayRequiredArray = requiredArray(jSONObject, "placements");
        int length = jSONArrayRequiredArray.length();
        ArrayList arrayListA11 = C60O.A11(length);
        for (int i = 0; i < length; i++) {
            Object obj = jSONArrayRequiredArray.get(i);
            if (!(obj instanceof JSONObject)) {
                throw BV5.A0S("Invalid FancyPin JSON field 'placements[", "]': expected object", i);
            }
            JSONObject jSONObject2 = (JSONObject) obj;
            arrayListA11.add(new FancyPinPlacement(parseLayoutAnchor(requiredObject(jSONObject2, "anchor")), (int) requiredInteger(jSONObject2, "cost", AuraImpressionTimeTracker.UNKNOWN_TIME, 2147483647L), optionalString(jSONObject2, "key")));
        }
        Map<String, String> mapOptionalStringMap = optionalStringMap(jSONObject, "style");
        int iOptionalUInt16 = optionalUInt16(jSONObject, "rank");
        String strOptionalString = optionalString(jSONObject, "dependsOn");
        JSONObject jSONObjectOptionalObject = optionalObject(jSONObject, "collisionInsets");
        RectInsets rectInsets = jSONObjectOptionalObject != null ? parseRectInsets(jSONObjectOptionalObject) : RectInsets.ZERO;
        JSONObject jSONObjectOptionalObject2 = optionalObject(jSONObject, "overlapInsets");
        RectInsets rectInsets2 = jSONObjectOptionalObject2 != null ? parseRectInsets(jSONObjectOptionalObject2) : null;
        boolean zOptionalBoolean = optionalBoolean(jSONObject, "alwaysVisible", false);
        boolean zOptionalBoolean2 = optionalBoolean(jSONObject, "occupiesSpace", true);
        JSONObject jSONObjectOptionalObject3 = optionalObject(jSONObject, "clustering");
        if (jSONObjectOptionalObject3 != null) {
            String strRequiredString2 = requiredString(jSONObjectOptionalObject3, PairsAnalyticsKt.CONNECTION_TYPE_GROUP);
            String strRequiredString3 = requiredString(jSONObjectOptionalObject3, "clusterBlueprintId");
            JSONObject jSONObjectOptionalObject4 = optionalObject(jSONObjectOptionalObject3, "joinInsets");
            fancyPinClusteringPolicy = new FancyPinClusteringPolicy(strRequiredString2, strRequiredString3, jSONObjectOptionalObject4 != null ? parseRectInsets(jSONObjectOptionalObject4) : null);
        } else {
            fancyPinClusteringPolicy = null;
        }
        return new FancyPinPart(strRequiredString, layoutSize, arrayListA11, mapOptionalStringMap, iOptionalUInt16, strOptionalString, rectInsets, rectInsets2, zOptionalBoolean, zOptionalBoolean2, fancyPinClusteringPolicy, null);
    }

    public static final RectInsets parseRectInsets(JSONObject jSONObject) {
        return new RectInsets(requiredNumber(jSONObject, "top"), requiredNumber(jSONObject, "left"), requiredNumber(jSONObject, "bottom"), requiredNumber(jSONObject, "right"));
    }

    public static final long requiredUInt32(JSONObject jSONObject, String str) {
        return requiredInteger(jSONObject, str, 0L, 4294967295L);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001e A[PHI: r3 r5
  0x001e: PHI (r3v2 double) = (r3v0 double), (r3v3 double) binds: [B:18:0x0040, B:9:0x001c] A[DONT_GENERATE, DONT_INLINE]
  0x001e: PHI (r5v2 double) = (r5v1 double), (r5v3 double) binds: [B:18:0x0040, B:9:0x001c] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void validateSize(com.meta.maps.fancypins.FancyPinPart r9, java.lang.String r10) {
        /*
            com.meta.maps.fancypins.LayoutSize r5 = r9.size
            com.meta.maps.fancypins.SizeConstraint r0 = r5.constraint
            int r1 = r0.ordinal()
            r0 = 0
            if (r1 == r0) goto L29
            r0 = 1
            if (r1 != r0) goto L43
            double r3 = r5.width
            boolean r0 = java.lang.Double.isNaN(r3)
            if (r0 != 0) goto L48
            double r5 = r5.height
            boolean r0 = java.lang.Double.isNaN(r5)
            if (r0 != 0) goto L48
        L1e:
            r1 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 < 0) goto L48
            int r0 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r0 < 0) goto L48
            return
        L29:
            double r3 = r5.width
            double r1 = java.lang.Math.abs(r3)
            r7 = 9218868437227405311(0x7fefffffffffffff, double:1.7976931348623157E308)
            int r0 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r0 > 0) goto L48
            double r5 = r5.height
            double r1 = java.lang.Math.abs(r5)
            int r0 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r0 > 0) goto L48
            goto L1e
        L43:
            kotlin.NoWhenBranchMatchedException r0 = X.C3cG.A0q()
            throw r0
        L48:
            java.lang.String r3 = r9.id
            java.lang.String r2 = "Part '"
            java.lang.String r1 = "' in variant '"
            java.lang.String r0 = "' has an invalid size"
            java.lang.IllegalArgumentException r0 = X.FGI.A01(r2, r3, r1, r10, r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meta.maps.fancypins.FancyPinBlueprintKt.validateSize(com.meta.maps.fancypins.FancyPinPart, java.lang.String):void");
    }

    public static final void validateVariant(FancyPinVariant fancyPinVariant) {
        List<FancyPinPart> list = fancyPinVariant.parts;
        HashSet hashSetA13 = C60O.A13();
        Iterator<FancyPinPart> it = list.iterator();
        while (it.hasNext()) {
            hashSetA13.add(it.next().id);
        }
        if (hashSetA13.size() != fancyPinVariant.parts.size()) {
            throw C60Q.A0V("Duplicate part id in variant '", fancyPinVariant.id, "'");
        }
        for (FancyPinPart fancyPinPart : fancyPinVariant.parts) {
            int i = fancyPinPart.rank;
            if (i < 0 || i >= 65536) {
                throw C60Q.A0V("Part '", fancyPinPart.id, "' rank is out of range");
            }
            validateSize(fancyPinPart, fancyPinVariant.id);
            if (fancyPinPart.placements.isEmpty()) {
                throw FGI.A01("Part '", fancyPinPart.id, "' in variant '", fancyPinVariant.id, "' must declare at least one placement");
            }
            String str = fancyPinPart.dependsOn;
            if (str != null && (str.equals(fancyPinPart.id) || !hashSetA13.contains(str))) {
                throw C60O.A0i(FGI.A0k("Part '", fancyPinPart.id, "' in variant '", fancyPinVariant.id, "' has invalid dependency '", str, "'"));
            }
            Iterator<FancyPinPlacement> it2 = fancyPinPart.placements.iterator();
            while (it2.hasNext()) {
                LayoutAnchor layoutAnchor = it2.next().anchor;
                String str2 = layoutAnchor.targetPartId;
                int iOrdinal = layoutAnchor.reference.ordinal();
                if (iOrdinal != 1) {
                    if (iOrdinal != 0) {
                        throw C3cG.A0q();
                    }
                    if (str2 != null) {
                        throw FGI.A01("Part '", fancyPinPart.id, "' in variant '", fancyPinVariant.id, "' has a pin anchor with targetPartId");
                    }
                } else if (str2 == null || str2.equals(fancyPinPart.id) || !hashSetA13.contains(str2)) {
                    throw FGI.A01("Part '", fancyPinPart.id, "' in variant '", fancyPinVariant.id, "' has an invalid part anchor");
                }
            }
            if (!isFinite(fancyPinPart.collisionInsets)) {
                throw FGI.A01("Part '", fancyPinPart.id, "' in variant '", fancyPinVariant.id, "' must have finite collisionInsets");
            }
            FancyPinClusteringPolicy fancyPinClusteringPolicy = fancyPinPart.clustering;
            if (fancyPinClusteringPolicy != null) {
                if (!fancyPinPart.occupiesSpace) {
                    throw C60Q.A0V("Part '", fancyPinPart.id, "' cannot cluster without occupying space");
                }
                if (fancyPinClusteringPolicy.group.length() <= 0) {
                    throw C60Q.A0V("Part '", fancyPinPart.id, "' has an empty clustering group");
                }
                if (fancyPinClusteringPolicy.clusterBlueprintId.length() <= 0) {
                    throw C60Q.A0V("Part '", fancyPinPart.id, "' has an empty clusterBlueprintId");
                }
                RectInsets rectInsets = fancyPinClusteringPolicy.joinInsets;
                if (rectInsets != null && !isFinite(rectInsets)) {
                    throw C60Q.A0V("Part '", fancyPinPart.id, "' must have finite clustering joinInsets");
                }
            }
        }
    }

    public static final JSONObject blueprintToJsonObject(String str, List<FancyPinVariant> list, List<FancyPinFallbackPolicy> list2, String str2) throws JSONException {
        JSONObject jSONObjectPut = BV4.A18().put("schemaVersion", 0).put("id", str).put("defaultVariantId", str2);
        JSONArray jSONArray = new JSONArray();
        Iterator<FancyPinVariant> it = list.iterator();
        while (it.hasNext()) {
            jSONArray.put(toJsonObject(it.next()));
        }
        JSONObject jSONObjectPut2 = jSONObjectPut.put("variants", jSONArray);
        JSONArray jSONArray2 = new JSONArray();
        Iterator<FancyPinFallbackPolicy> it2 = list2.iterator();
        while (it2.hasNext()) {
            jSONArray2.put(toJsonObject(it2.next()));
        }
        JSONObject jSONObjectPut3 = jSONObjectPut2.put("fallbackPolicies", jSONArray2);
        C7384Etj.A0U(jSONObjectPut3);
        return jSONObjectPut3;
    }

    public static final FancyPinClusterBlueprint decodeClusterBlueprint(byte[] bArr) throws JSONException, IOException {
        JSONObject blueprintJsonObject = parseBlueprintJsonObject(bArr);
        ParsedBlueprintFields blueprintFields = parseBlueprintFields(blueprintJsonObject);
        JSONArray jSONArrayOptionalArray = optionalArray(blueprintJsonObject, "variantSelectionRules");
        int length = jSONArrayOptionalArray.length();
        ArrayList arrayListA11 = C60O.A11(length);
        for (int i = 0; i < length; i++) {
            Object obj = jSONArrayOptionalArray.get(i);
            if (!(obj instanceof JSONObject)) {
                throw BV5.A0S("Invalid FancyPin JSON field 'variantSelectionRules[", "]': expected object", i);
            }
            JSONObject jSONObject = (JSONObject) obj;
            arrayListA11.add(new FancyPinClusterVariantSelectionRule(requiredString(jSONObject, "variantId"), requiredUInt32(jSONObject, "minMemberCount"), optionalUInt32(jSONObject, "maxMemberCount")));
        }
        JSONArray jSONArrayOptionalArray2 = optionalArray(blueprintJsonObject, "variantRetentionPolicies");
        int length2 = jSONArrayOptionalArray2.length();
        ArrayList arrayListA112 = C60O.A11(length2);
        for (int i2 = 0; i2 < length2; i2++) {
            Object obj2 = jSONArrayOptionalArray2.get(i2);
            if (!(obj2 instanceof JSONObject)) {
                throw BV5.A0S("Invalid FancyPin JSON field 'variantRetentionPolicies[", "]': expected object", i2);
            }
            JSONObject jSONObject2 = (JSONObject) obj2;
            String strRequiredString = requiredString(jSONObject2, "scope");
            FancyPinClusterRetentionScope fancyPinClusterRetentionScope = FancyPinClusterRetentionScope.PRESENTATION;
            if (!C7384Etj.areEqual(strRequiredString, fancyPinClusterRetentionScope.getJsonValue$xplat_maps_sdk_packages_fancypins_fancypins_kotlin())) {
                throw C60Q.A0V("Invalid FancyPin JSON field 'scope': unknown retention scope '", strRequiredString, "'");
            }
            arrayListA112.add(new FancyPinClusterVariantRetentionPolicy(requiredString(jSONObject2, "variantId"), fancyPinClusterRetentionScope));
        }
        validateBlueprintStructure(blueprintFields.id, blueprintFields.variants, blueprintFields.fallbackPolicies, blueprintFields.defaultVariantId);
        List<FancyPinVariant> list = blueprintFields.variants;
        HashSet hashSetA13 = C60O.A13();
        Iterator<FancyPinVariant> it = list.iterator();
        while (it.hasNext()) {
            hashSetA13.add(it.next().id);
        }
        validateClusterVariantSelectionRules(arrayListA11, hashSetA13);
        validateClusterVariantRetentionPolicies(arrayListA112, hashSetA13);
        return new FancyPinClusterBlueprint(blueprintFields.id, blueprintFields.variants, blueprintFields.fallbackPolicies, blueprintFields.defaultVariantId, arrayListA11, arrayListA112);
    }

    public static final FancyPinBlueprint decodeSourceBlueprint(byte[] bArr) throws JSONException {
        ParsedBlueprintFields blueprintFields = parseBlueprintFields(parseBlueprintJsonObject(bArr));
        validateBlueprintStructure(blueprintFields.id, blueprintFields.variants, blueprintFields.fallbackPolicies, blueprintFields.defaultVariantId);
        return new FancyPinBlueprint(blueprintFields.id, blueprintFields.variants, blueprintFields.fallbackPolicies, blueprintFields.defaultVariantId);
    }

    public static final Object jsonValue(double d) {
        return Double.isInfinite(d) ? "Infinity" : Double.valueOf(d);
    }

    public static final <Value> List<Value> mapObjects(JSONArray jSONArray, String str, G0U<? super JSONObject, ? extends Value> g0u) throws JSONException {
        int length = jSONArray.length();
        ArrayList arrayListA11 = C60O.A11(length);
        for (int i = 0; i < length; i++) {
            Object obj = jSONArray.get(i);
            if (!(obj instanceof JSONObject)) {
                throw C60O.A0i(FGI.A0A(i, "Invalid FancyPin JSON field '", str, "[", "]': expected object"));
            }
            arrayListA11.add(g0u.invoke(obj));
        }
        return arrayListA11;
    }

    public static final List<String> mapStrings(JSONArray jSONArray, String str) throws JSONException {
        int length = jSONArray.length();
        ArrayList arrayListA11 = C60O.A11(length);
        for (int i = 0; i < length; i++) {
            Object obj = jSONArray.get(i);
            if (!(obj instanceof String)) {
                throw C60O.A0i(FGI.A0A(i, "Invalid FancyPin JSON field '", str, "[", "]': expected string"));
            }
            arrayListA11.add(obj);
        }
        return arrayListA11;
    }

    public static final JSONArray optionalArray(JSONObject jSONObject, String str) throws JSONException {
        if (!jSONObject.has(str) || jSONObject.isNull(str)) {
            return new JSONArray();
        }
        Object obj = jSONObject.get(str);
        if (obj instanceof JSONArray) {
            return (JSONArray) obj;
        }
        throw C60Q.A0V("Invalid FancyPin JSON field '", str, "': expected array");
    }

    public static final boolean optionalBoolean(JSONObject jSONObject, String str, boolean z) throws JSONException {
        if (!jSONObject.has(str) || jSONObject.isNull(str)) {
            return z;
        }
        Object obj = jSONObject.get(str);
        if (obj instanceof Boolean) {
            return AnonymousClass001.A1X(obj);
        }
        throw C60Q.A0V("Invalid FancyPin JSON field '", str, "': expected boolean");
    }

    public static final JSONObject optionalObject(JSONObject jSONObject, String str) throws JSONException {
        if (!jSONObject.has(str) || jSONObject.isNull(str)) {
            return null;
        }
        Object obj = jSONObject.get(str);
        if (obj instanceof JSONObject) {
            return (JSONObject) obj;
        }
        throw C60Q.A0V("Invalid FancyPin JSON field '", str, "': expected object");
    }

    public static final String optionalString(JSONObject jSONObject, String str) throws JSONException {
        if (!jSONObject.has(str) || jSONObject.isNull(str)) {
            return null;
        }
        Object obj = jSONObject.get(str);
        if (obj instanceof String) {
            return (String) obj;
        }
        throw C60Q.A0V("Invalid FancyPin JSON field '", str, "': expected string");
    }

    public static final Map<String, String> optionalStringMap(JSONObject jSONObject, String str) throws JSONException {
        if (!jSONObject.has(str) || jSONObject.isNull(str)) {
            return C9jH.A00;
        }
        Object obj = jSONObject.get(str);
        if (!(obj instanceof JSONObject)) {
            throw C60Q.A0V("Invalid FancyPin JSON field '", str, "': expected object");
        }
        LinkedHashMap linkedHashMapA0j = C3cG.A0j();
        JSONObject jSONObject2 = (JSONObject) obj;
        Iterator<String> itKeys = jSONObject2.keys();
        while (itKeys.hasNext()) {
            String strA0j = AnonymousClass005.A0j(itKeys);
            Object obj2 = jSONObject2.get(strA0j);
            if (!(obj2 instanceof String)) {
                throw C60Q.A0V("Invalid FancyPin JSON field 'style.", strA0j, "': expected string");
            }
            linkedHashMapA0j.put(strA0j, obj2);
        }
        return linkedHashMapA0j;
    }

    public static final Long optionalUInt32(JSONObject jSONObject, String str) {
        if (!jSONObject.has(str) || jSONObject.isNull(str)) {
            return null;
        }
        return Long.valueOf(requiredUInt32(jSONObject, str));
    }

    public static final ParsedBlueprintFields parseBlueprintFields(JSONObject jSONObject) throws JSONException {
        long jRequiredInteger = requiredInteger(jSONObject, "schemaVersion", AuraImpressionTimeTracker.UNKNOWN_TIME, 2147483647L);
        if (jRequiredInteger != 0) {
            throw BV5.A0R("Unsupported FancyPin blueprint schema version ", jRequiredInteger);
        }
        String strRequiredString = requiredString(jSONObject, "id");
        JSONArray jSONArrayRequiredArray = requiredArray(jSONObject, "variants");
        int length = jSONArrayRequiredArray.length();
        ArrayList arrayListA11 = C60O.A11(length);
        for (int i = 0; i < length; i++) {
            Object obj = jSONArrayRequiredArray.get(i);
            if (!(obj instanceof JSONObject)) {
                throw BV5.A0S("Invalid FancyPin JSON field 'variants[", "]': expected object", i);
            }
            JSONObject jSONObject2 = (JSONObject) obj;
            String strRequiredString2 = requiredString(jSONObject2, "id");
            JSONArray jSONArrayRequiredArray2 = requiredArray(jSONObject2, "parts");
            int length2 = jSONArrayRequiredArray2.length();
            ArrayList arrayListA112 = C60O.A11(length2);
            for (int i2 = 0; i2 < length2; i2++) {
                Object obj2 = jSONArrayRequiredArray2.get(i2);
                if (!(obj2 instanceof JSONObject)) {
                    throw BV5.A0S("Invalid FancyPin JSON field 'parts[", "]': expected object", i2);
                }
                arrayListA112.add(parsePart((JSONObject) obj2));
            }
            arrayListA11.add(new FancyPinVariant(strRequiredString2, arrayListA112));
        }
        JSONArray jSONArrayOptionalArray = optionalArray(jSONObject, "fallbackPolicies");
        int length3 = jSONArrayOptionalArray.length();
        ArrayList arrayListA113 = C60O.A11(length3);
        for (int i3 = 0; i3 < length3; i3++) {
            Object obj3 = jSONArrayOptionalArray.get(i3);
            if (!(obj3 instanceof JSONObject)) {
                throw BV5.A0S("Invalid FancyPin JSON field 'fallbackPolicies[", "]': expected object", i3);
            }
            JSONObject jSONObject3 = (JSONObject) obj3;
            arrayListA113.add(new FancyPinFallbackPolicy(requiredString(jSONObject3, "targetVariantId"), mapStrings(requiredArray(jSONObject3, "fallbacks"), "fallbacks")));
        }
        return new ParsedBlueprintFields(strRequiredString, arrayListA11, arrayListA113, requiredString(jSONObject, "defaultVariantId"));
    }

    public static final JSONArray requiredArray(JSONObject jSONObject, String str) throws JSONException {
        Object objRequiredValue = requiredValue(jSONObject, str);
        if (objRequiredValue instanceof JSONArray) {
            return (JSONArray) objRequiredValue;
        }
        throw C60Q.A0V("Invalid FancyPin JSON field '", str, "': expected array");
    }

    public static final long requiredInteger(JSONObject jSONObject, String str, long j, long j2) throws JSONException {
        Object objRequiredValue = requiredValue(jSONObject, str);
        if (!(objRequiredValue instanceof Byte) && !(objRequiredValue instanceof Short) && !(objRequiredValue instanceof Integer) && !(objRequiredValue instanceof Long)) {
            throw C60Q.A0V("Invalid FancyPin JSON field '", str, "': expected integer");
        }
        long jA05 = C3cG.A05(objRequiredValue);
        if (j > jA05 || jA05 > j2) {
            throw C60Q.A0V("Invalid FancyPin JSON field '", str, "': integer is out of range");
        }
        return jA05;
    }

    public static final double requiredNumber(JSONObject jSONObject, String str) throws JSONException {
        Object objRequiredValue = requiredValue(jSONObject, str);
        if (objRequiredValue instanceof Number) {
            return BV6.A00(objRequiredValue);
        }
        throw C60Q.A0V("Invalid FancyPin JSON field '", str, "': expected number");
    }

    public static final JSONObject requiredObject(JSONObject jSONObject, String str) throws JSONException {
        Object objRequiredValue = requiredValue(jSONObject, str);
        if (objRequiredValue instanceof JSONObject) {
            return (JSONObject) objRequiredValue;
        }
        throw C60Q.A0V("Invalid FancyPin JSON field '", str, "': expected object");
    }

    public static final double requiredSizeValue(JSONObject jSONObject, String str) throws JSONException {
        Object objRequiredValue = requiredValue(jSONObject, str);
        if (objRequiredValue.equals("Infinity")) {
            return Double.POSITIVE_INFINITY;
        }
        if (objRequiredValue instanceof Number) {
            return BV6.A00(objRequiredValue);
        }
        throw C60Q.A0V("Invalid FancyPin JSON field '", str, "': expected number or Infinity");
    }

    public static final String requiredString(JSONObject jSONObject, String str) throws JSONException {
        Object objRequiredValue = requiredValue(jSONObject, str);
        if (objRequiredValue instanceof String) {
            return (String) objRequiredValue;
        }
        throw C60Q.A0V("Invalid FancyPin JSON field '", str, "': expected string");
    }

    public static final Object requiredValue(JSONObject jSONObject, String str) throws JSONException {
        if (!jSONObject.has(str) || jSONObject.isNull(str)) {
            throw C60Q.A0V("Missing FancyPin JSON field '", str, "'");
        }
        Object obj = jSONObject.get(str);
        C7384Etj.A0U(obj);
        return obj;
    }

    public static final void validateBlueprintStructure(String str, List<FancyPinVariant> list, List<FancyPinFallbackPolicy> list2, String str2) {
        HashSet hashSetA13 = C60O.A13();
        Iterator<FancyPinVariant> it = list.iterator();
        while (it.hasNext()) {
            hashSetA13.add(it.next().id);
        }
        if (hashSetA13.size() != list.size()) {
            throw C60Q.A0V("Duplicate variant id in blueprint '", str, "'");
        }
        if (!hashSetA13.contains(str2)) {
            throw FGI.A01("Unknown defaultVariantId '", str2, "' in blueprint '", str, "'");
        }
        Iterator<FancyPinVariant> it2 = list.iterator();
        while (it2.hasNext()) {
            validateVariant(it2.next());
        }
        validateFallbackPolicies(list2, hashSetA13);
    }

    public static final void validateClusterVariantRetentionPolicies(List<FancyPinClusterVariantRetentionPolicy> list, Set<String> set) {
        HashSet hashSetA13 = C60O.A13();
        for (FancyPinClusterVariantRetentionPolicy fancyPinClusterVariantRetentionPolicy : list) {
            if (!set.contains(fancyPinClusterVariantRetentionPolicy.variantId)) {
                throw C60Q.A0V("Cluster variant retention policy references unknown variant '", fancyPinClusterVariantRetentionPolicy.variantId, "'");
            }
            if (!hashSetA13.add(fancyPinClusterVariantRetentionPolicy.variantId)) {
                throw C60Q.A0V("Cluster variant retention policy repeats variant '", fancyPinClusterVariantRetentionPolicy.variantId, "'");
            }
        }
    }

    public static final void validateClusterVariantSelectionRules(List<FancyPinClusterVariantSelectionRule> list, Set<String> set) {
        for (FancyPinClusterVariantSelectionRule fancyPinClusterVariantSelectionRule : list) {
            if (!set.contains(fancyPinClusterVariantSelectionRule.variantId)) {
                throw C60Q.A0V("Cluster variant selection rule references unknown variant '", fancyPinClusterVariantSelectionRule.variantId, "'");
            }
            long j = fancyPinClusterVariantSelectionRule.minMemberCount;
            if (1 > j || j >= LocalBrowserCapacityKt.BACKGROUND_WAKE_MIN_RAM_BYTES) {
                throw C60Q.A0V("Cluster variant selection rule for '", fancyPinClusterVariantSelectionRule.variantId, "' has invalid minMemberCount");
            }
            Long l = fancyPinClusterVariantSelectionRule.maxMemberCount;
            if (l != null) {
                long jLongValue = l.longValue();
                if (j > jLongValue || jLongValue >= LocalBrowserCapacityKt.BACKGROUND_WAKE_MIN_RAM_BYTES) {
                    throw C60Q.A0V("Cluster variant selection rule for '", fancyPinClusterVariantSelectionRule.variantId, "' has invalid maxMemberCount");
                }
            }
        }
        int size = list.size();
        int i = 0;
        while (i < size) {
            int i2 = i + 1;
            int size2 = list.size();
            for (int i3 = i2; i3 < size2; i3++) {
                FancyPinClusterVariantSelectionRule fancyPinClusterVariantSelectionRule2 = list.get(i);
                FancyPinClusterVariantSelectionRule fancyPinClusterVariantSelectionRule3 = list.get(i3);
                Long l2 = fancyPinClusterVariantSelectionRule2.maxMemberCount;
                long jLongValue2 = l2 != null ? l2.longValue() : 4294967295L;
                Long l3 = fancyPinClusterVariantSelectionRule3.maxMemberCount;
                if (fancyPinClusterVariantSelectionRule2.minMemberCount <= (l3 != null ? l3.longValue() : 4294967295L) && fancyPinClusterVariantSelectionRule3.minMemberCount <= jLongValue2) {
                    throw C60O.A0i("Cluster variant selection rules must not overlap");
                }
            }
            i = i2;
        }
    }

    public static final void validateFallbackPolicies(List<FancyPinFallbackPolicy> list, Set<String> set) {
        HashMap mapA0u = BV4.A0u();
        for (FancyPinFallbackPolicy fancyPinFallbackPolicy : list) {
            boolean zContains = set.contains(fancyPinFallbackPolicy.targetVariantId);
            String str = fancyPinFallbackPolicy.targetVariantId;
            if (!zContains) {
                throw C60Q.A0V("Fallback policy targets unknown variant '", str, "'");
            }
            if (mapA0u.put(str, fancyPinFallbackPolicy.fallbacks) != null) {
                throw C60Q.A0V("Duplicate fallback policy for variant '", fancyPinFallbackPolicy.targetVariantId, "'");
            }
            if (AbstractC0878AGe.A0g(fancyPinFallbackPolicy.fallbacks).size() != fancyPinFallbackPolicy.fallbacks.size()) {
                throw C60Q.A0V("Fallback policy for '", fancyPinFallbackPolicy.targetVariantId, "' contains duplicates");
            }
            Iterator<String> it = fancyPinFallbackPolicy.fallbacks.iterator();
            while (it.hasNext()) {
                String strA0j = AnonymousClass005.A0j(it);
                if (!set.contains(strA0j) || C7384Etj.areEqual(strA0j, fancyPinFallbackPolicy.targetVariantId)) {
                    throw FGI.A01("Fallback policy for '", fancyPinFallbackPolicy.targetVariantId, "' references invalid variant '", strA0j, "'");
                }
            }
        }
        HashSet hashSetA13 = C60O.A13();
        HashSet hashSetA132 = C60O.A13();
        Iterator it2 = AbstractC7608F5v.A17(mapA0u).iterator();
        while (it2.hasNext()) {
            validateFallbackPolicies$visit(hashSetA132, hashSetA13, mapA0u, AnonymousClass005.A0j(it2));
        }
    }

    public static final void validateFallbackPolicies$visit(HashSet<String> hashSet, HashSet<String> hashSet2, HashMap<String, List<String>> map, String str) {
        if (hashSet.contains(str)) {
            return;
        }
        if (!hashSet2.add(str)) {
            throw C60Q.A0V("Fallback graph contains a cycle involving '", str, "'");
        }
        List<String> list = map.get(str);
        if (list == null) {
            list = C0881AGi.A00;
        }
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            validateFallbackPolicies$visit(hashSet, hashSet2, map, AnonymousClass005.A0j(it));
        }
        hashSet2.remove(str);
        hashSet.add(str);
    }

    public static final JSONObject toJsonObject(FancyPinVariant fancyPinVariant) throws JSONException {
        JSONObject jSONObjectPut = BV4.A18().put("id", fancyPinVariant.id);
        JSONArray jSONArray = new JSONArray();
        Iterator<FancyPinPart> it = fancyPinVariant.parts.iterator();
        while (it.hasNext()) {
            jSONArray.put(toJsonObject(it.next()));
        }
        JSONObject jSONObjectPut2 = jSONObjectPut.put("parts", jSONArray);
        C7384Etj.A0U(jSONObjectPut2);
        return jSONObjectPut2;
    }

    public static final JSONObject toJsonObject(FancyPinFallbackPolicy fancyPinFallbackPolicy) throws JSONException {
        JSONObject jSONObjectPut = BV4.A18().put("targetVariantId", fancyPinFallbackPolicy.targetVariantId);
        JSONArray jSONArray = new JSONArray();
        Iterator<String> it = fancyPinFallbackPolicy.fallbacks.iterator();
        while (it.hasNext()) {
            jSONArray.put(it.next());
        }
        JSONObject jSONObjectPut2 = jSONObjectPut.put("fallbacks", jSONArray);
        C7384Etj.A0U(jSONObjectPut2);
        return jSONObjectPut2;
    }

    public static final JSONObject toJsonObject(FancyPinPart fancyPinPart) throws JSONException {
        JSONObject jSONObjectPut = BV4.A18().put("id", fancyPinPart.id).put("size", toJsonObject(fancyPinPart.size));
        JSONArray jSONArray = new JSONArray();
        Iterator<FancyPinPlacement> it = fancyPinPart.placements.iterator();
        while (it.hasNext()) {
            jSONArray.put(toJsonObject(it.next()));
        }
        JSONObject jSONObjectPut2 = jSONObjectPut.put("placements", jSONArray).put("style", new JSONObject(fancyPinPart.style)).put("rank", fancyPinPart.rank);
        String str = fancyPinPart.dependsOn;
        if (str != null) {
            jSONObjectPut2.put("dependsOn", str);
        }
        if (!C7384Etj.areEqual(fancyPinPart.collisionInsets, RectInsets.ZERO)) {
            jSONObjectPut2.put("collisionInsets", toJsonObject(fancyPinPart.collisionInsets));
        }
        RectInsets rectInsets = fancyPinPart.overlapInsets;
        if (rectInsets != null) {
            jSONObjectPut2.put("overlapInsets", toJsonObject(rectInsets));
        }
        jSONObjectPut2.put("alwaysVisible", fancyPinPart.alwaysVisible);
        jSONObjectPut2.put("occupiesSpace", fancyPinPart.occupiesSpace);
        FancyPinClusteringPolicy fancyPinClusteringPolicy = fancyPinPart.clustering;
        if (fancyPinClusteringPolicy != null) {
            jSONObjectPut2.put("clustering", toJsonObject(fancyPinClusteringPolicy));
        }
        return jSONObjectPut2;
    }

    public static final JSONObject toJsonObject(FancyPinClusterVariantRetentionPolicy fancyPinClusterVariantRetentionPolicy) throws JSONException {
        JSONObject jSONObjectPut = BV4.A18().put("variantId", fancyPinClusterVariantRetentionPolicy.variantId).put("scope", fancyPinClusterVariantRetentionPolicy.scope.getJsonValue$xplat_maps_sdk_packages_fancypins_fancypins_kotlin());
        C7384Etj.A0U(jSONObjectPut);
        return jSONObjectPut;
    }

    public static final JSONObject toJsonObject(LayoutSize layoutSize) throws JSONException {
        JSONObject jSONObjectPut = BV4.A18().put("constraint", layoutSize.constraint.getJsonValue$xplat_maps_sdk_packages_fancypins_fancypins_kotlin()).put(HatchWebPageParserKt.WIDTH_ATTR, jsonValue(layoutSize.width)).put(HatchWebPageParserKt.HEIGHT_ATTR, jsonValue(layoutSize.height));
        C7384Etj.A0U(jSONObjectPut);
        return jSONObjectPut;
    }

    public static final JSONObject toJsonObject(FancyPinClusterVariantSelectionRule fancyPinClusterVariantSelectionRule) throws JSONException {
        JSONObject jSONObjectPut = BV4.A18().put("variantId", fancyPinClusterVariantSelectionRule.variantId).put("minMemberCount", fancyPinClusterVariantSelectionRule.minMemberCount);
        Long l = fancyPinClusterVariantSelectionRule.maxMemberCount;
        if (l != null) {
            jSONObjectPut.put("maxMemberCount", l.longValue());
        }
        C7384Etj.A0U(jSONObjectPut);
        return jSONObjectPut;
    }

    public static final JSONObject toJsonObject(FancyPinClusteringPolicy fancyPinClusteringPolicy) throws JSONException {
        JSONObject jSONObjectPut = BV4.A18().put(PairsAnalyticsKt.CONNECTION_TYPE_GROUP, fancyPinClusteringPolicy.group).put("clusterBlueprintId", fancyPinClusteringPolicy.clusterBlueprintId);
        RectInsets rectInsets = fancyPinClusteringPolicy.joinInsets;
        if (rectInsets != null) {
            jSONObjectPut.put("joinInsets", toJsonObject(rectInsets));
        }
        C7384Etj.A0U(jSONObjectPut);
        return jSONObjectPut;
    }

    public static final JSONObject toJsonObject(FancyPinPlacement fancyPinPlacement) throws JSONException {
        JSONObject jSONObjectPut = BV4.A18().put("anchor", toJsonObject(fancyPinPlacement.anchor)).put("cost", fancyPinPlacement.cost);
        String str = fancyPinPlacement.key;
        if (str != null) {
            jSONObjectPut.put("key", str);
        }
        C7384Etj.A0U(jSONObjectPut);
        return jSONObjectPut;
    }

    public static final JSONObject toJsonObject(LayoutAnchor layoutAnchor) throws JSONException {
        JSONObject jSONObjectPut = BV4.A18().put("reference", layoutAnchor.reference.getJsonValue$xplat_maps_sdk_packages_fancypins_fancypins_kotlin()).put("xOffset", layoutAnchor.xOffset).put("yOffset", layoutAnchor.yOffset);
        Object obj = layoutAnchor.targetPartId;
        if (obj == null) {
            obj = JSONObject.NULL;
        }
        JSONObject jSONObjectPut2 = jSONObjectPut.put("targetPartId", obj).put("attachTo", layoutAnchor.attachTo.getJsonValue$xplat_maps_sdk_packages_fancypins_fancypins_kotlin()).put("attachFrom", layoutAnchor.attachFrom.getJsonValue$xplat_maps_sdk_packages_fancypins_fancypins_kotlin());
        C7384Etj.A0U(jSONObjectPut2);
        return jSONObjectPut2;
    }

    public static final JSONObject toJsonObject(RectInsets rectInsets) throws JSONException {
        JSONObject jSONObjectPut = BV4.A18().put("top", rectInsets.top).put("left", rectInsets.left).put("bottom", rectInsets.bottom).put("right", rectInsets.right);
        C7384Etj.A0U(jSONObjectPut);
        return jSONObjectPut;
    }
}
