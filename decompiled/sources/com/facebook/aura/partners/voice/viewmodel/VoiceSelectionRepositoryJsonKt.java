package com.facebook.aura.partners.voice.viewmodel;

import X.AbstractC0878AGe;
import X.AbstractC0885AGm;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.C06827l3;
import X.C10571Hud;
import X.C3cG;
import X.C60P;
import X.C7384Etj;
import X.C9oY;
import X.C9sU;
import X.CFK;
import X.FGI;
import com.facebook.aura.json.HatchJsonKt;
import com.facebook.aura.partners.voice.api.SavedVoiceOption;
import com.facebook.aura.partners.voice.api.VoiceOption;
import com.facebook.aura.partners.voice.api.VoiceSelectionIdentity;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import kotlinx.serialization.json.JsonArray;
import kotlinx.serialization.json.JsonArraySerializer;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonObjectSerializer;
import kotlinx.serialization.json.JsonPrimitive;

/* loaded from: classes4.dex */
public abstract class VoiceSelectionRepositoryJsonKt {
    public static final int MAX_PREVIEW_TEXT_LENGTH = 500;
    public static final int MAX_PROFILE_ID_LENGTH = 36;
    public static final int MAX_PROFILE_LABEL_LENGTH = 80;
    public static final int MAX_SAVED_VOICES = 50;
    public static final int MAX_SAVED_VOICE_ID_LENGTH = 36;
    public static final int MAX_SAVED_VOICE_PROFILES = 3;
    public static final int MAX_VOICE_ID_LENGTH = 267;
    public static final int MAX_VOICE_NAME_LENGTH = 80;
    public static final int SAVED_VOICES_FILE_MAX_BYTES = 4194304;
    public static final String TAG = "VoiceSelectionRepositoryJson";
    public static final C06827l3 UUID_PATTERN = C06827l3.A02("^[0-9a-f]{8}-(?:[0-9a-f]{4}-){3}[0-9a-f]{12}$");
    public static final C06827l3 VOICE_ID_PATTERN = C06827l3.A02("^avocado_v2:[A-Za-z0-9_.-]{1,256}$");
    public static final char[] INVISIBLE_NAME_PADDING = {'\ufeff', '\u200b'};

    public static final String encodeSettingsVoiceSelection(String str, String str2, String str3, String str4) {
        boolean zA1Y = C60P.A1Y(str, str2);
        return HatchJsonKt.HatchJson.A02(new SettingsVoiceSelectionJson(str, str3, str4, str2, Boolean.valueOf(zA1Y)), SettingsVoiceSelectionJson$$serializer.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.String normalizedSavedVoiceName(java.lang.String r6) {
        /*
            r4 = 0
            int r5 = X.C8j3.A0J(r6, r4)
            r0 = 1
            int r5 = r5 - r0
            r3 = 0
            r2 = 0
        L9:
            if (r3 > r5) goto L31
            r0 = r5
            if (r2 != 0) goto Lf
            r0 = r3
        Lf:
            char r1 = r6.charAt(r0)
            boolean r0 = X.C7LE.A00(r1)
            if (r0 != 0) goto L22
            char[] r0 = com.facebook.aura.partners.voice.viewmodel.VoiceSelectionRepositoryJsonKt.INVISIBLE_NAME_PADDING
            boolean r1 = X.BFI.A0K(r0, r1)
            r0 = 0
            if (r1 == 0) goto L23
        L22:
            r0 = 1
        L23:
            if (r2 != 0) goto L2c
            if (r0 != 0) goto L29
            r2 = 1
            goto L9
        L29:
            int r3 = r3 + 1
            goto L9
        L2c:
            if (r0 == 0) goto L31
            int r5 = r5 + (-1)
            goto L9
        L31:
            int r0 = r5 + 1
            java.lang.CharSequence r0 = r6.subSequence(r3, r0)
            java.lang.String r2 = r0.toString()
            r1 = 0
            r0 = 80
            boolean r0 = isValidText(r2, r0, r4, r4, r1)
            if (r0 == 0) goto L45
            return r2
        L45:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.partners.voice.viewmodel.VoiceSelectionRepositoryJsonKt.normalizedSavedVoiceName(java.lang.String):java.lang.String");
    }

    public static final VoiceSelectionIdentity parseSettingsVoiceSelection(String str) {
        Object objA0s;
        C7384Etj.A0Y(str, 0);
        try {
            objA0s = (SettingsVoiceSelectionJson) HatchJsonKt.HatchJson.A00(str, SettingsVoiceSelectionJson$$serializer.INSTANCE);
        } catch (Throwable th) {
            objA0s = C3cG.A0s(th);
        }
        if (objA0s instanceof C10571Hud) {
            objA0s = null;
        }
        SettingsVoiceSelectionJson settingsVoiceSelectionJson = (SettingsVoiceSelectionJson) objA0s;
        if (settingsVoiceSelectionJson != null) {
            return toIdentity(settingsVoiceSelectionJson);
        }
        return null;
    }

    public static final String validPersistedProvenanceId(String str) {
        String strA0l;
        if (str == null || (strA0l = AnonymousClass002.A0l(str)) == null || !isValidText(strA0l, 36, false, false, UUID_PATTERN)) {
            return null;
        }
        return strA0l;
    }

    public static final String encodeLibrary(List<? extends JsonElement> list) {
        return HatchJsonKt.HatchJson.A02(new JsonArray(list), JsonArraySerializer.A01);
    }

    public static /* synthetic */ String encodeSettingsVoiceSelection$default(String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 4) != 0) {
            str3 = null;
        }
        if ((i & 8) != 0) {
            str4 = null;
        }
        return encodeSettingsVoiceSelection(str, str2, str3, str4);
    }

    public static final JsonArray fullyUnderstoodLibrary(String str) {
        Object objA0s;
        JsonArray jsonArray;
        List<SavedVoiceOption> savedVoiceLibrary;
        try {
            objA0s = HatchJsonKt.HatchJson.A04(str);
        } catch (Throwable th) {
            objA0s = C3cG.A0s(th);
        }
        if (objA0s instanceof C10571Hud) {
            objA0s = null;
        }
        if (!(objA0s instanceof JsonArray) || (jsonArray = (JsonArray) objA0s) == null || (savedVoiceLibrary = parseSavedVoiceLibrary(jsonArray, (VoiceSelectionIdentity) null)) == null || savedVoiceLibrary.size() != jsonArray.size()) {
            return null;
        }
        return jsonArray;
    }

    public static final boolean isValid(SavedVoiceJson savedVoiceJson) {
        int size;
        if (savedVoiceJson.version != 1 || !isValidText(savedVoiceJson.saved_voice_id, 36, false, false, UUID_PATTERN) || !isValidText(savedVoiceJson.voice_id, MAX_VOICE_ID_LENGTH, false, false, VOICE_ID_PATTERN) || !isValidText(savedVoiceJson.voice_name, 80, false, false, null) || 1 > (size = savedVoiceJson.profiles.size()) || size >= 4) {
            return false;
        }
        List<SavedVoiceProfileJson> list = savedVoiceJson.profiles;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator<SavedVoiceProfileJson> it = list.iterator();
            while (it.hasNext()) {
                if (!isValid(it.next())) {
                    return false;
                }
            }
        }
        List<SavedVoiceProfileJson> list2 = savedVoiceJson.profiles;
        ArrayList arrayListA0i = AnonymousClass003.A0i(list2);
        Iterator<SavedVoiceProfileJson> it2 = list2.iterator();
        while (it2.hasNext()) {
            arrayListA0i.add(it2.next().profile_id);
        }
        return AbstractC0878AGe.A0g(arrayListA0i).size() == savedVoiceJson.profiles.size();
    }

    public static /* synthetic */ List parseSavedVoiceLibrary$default(String str, VoiceSelectionIdentity voiceSelectionIdentity, int i, Object obj) {
        if ((i & 2) != 0) {
            voiceSelectionIdentity = null;
        }
        return parseSavedVoiceLibrary(str, voiceSelectionIdentity);
    }

    public static final String savedVoiceId(JsonElement jsonElement) {
        JsonObject jsonObject;
        if (!(jsonElement instanceof JsonObject) || (jsonObject = (JsonObject) jsonElement) == null) {
            return null;
        }
        return stringOrNull(jsonObject, "saved_voice_id");
    }

    public static final VoiceSelectionIdentity toIdentity(SettingsVoiceSelectionJson settingsVoiceSelectionJson) {
        String strA0l = AnonymousClass002.A0l(settingsVoiceSelectionJson.voice_id);
        if (!isValidText(strA0l, MAX_VOICE_ID_LENGTH, false, false, null) || strA0l.length() <= 0) {
            return null;
        }
        String strValidPersistedProvenanceId = validPersistedProvenanceId(settingsVoiceSelectionJson.saved_voice_id);
        String strValidPersistedProvenanceId2 = validPersistedProvenanceId(settingsVoiceSelectionJson.profile_id);
        if (AnonymousClass002.A1Y(strValidPersistedProvenanceId) != (strValidPersistedProvenanceId2 == null)) {
            return null;
        }
        return new VoiceSelectionIdentity(strA0l, strValidPersistedProvenanceId, strValidPersistedProvenanceId2);
    }

    public static final boolean isValidText(String str, int i, boolean z, boolean z2, C06827l3 c06827l3) {
        if (AnonymousClass002.A0l(str).length() != 0 || z2) {
            int length = str.length();
            if (str.codePointCount(0, length) > i || !(c06827l3 == null || c06827l3.A08(str))) {
                return false;
            }
            for (int i2 = 0; i2 < length; i2++) {
                char cCharAt = str.charAt(i2);
                if (Character.getType(cCharAt) == 15) {
                    if (z) {
                        if (cCharAt != '\n' && cCharAt != '\r' && cCharAt != '\t') {
                            return false;
                        }
                    }
                }
            }
            return true;
        }
        return false;
    }

    public static /* synthetic */ boolean isValidText$default(String str, int i, boolean z, boolean z2, C06827l3 c06827l3, int i2, Object obj) {
        boolean zA1Q = AnonymousClass001.A1Q(i2, z);
        boolean zA1O = AnonymousClass005.A1O(i2, z2);
        if ((i2 & 8) != 0) {
            c06827l3 = null;
        }
        return isValidText(str, i, zA1Q, zA1O, c06827l3);
    }

    public static final List<SavedVoiceOption> parseSavedVoiceLibrary(JsonArray jsonArray, VoiceSelectionIdentity voiceSelectionIdentity) {
        Object objA0s;
        SavedVoiceOption savedVoiceOption;
        SavedVoiceProfileJson next;
        if (jsonArray.size() > 50) {
            return null;
        }
        LinkedHashSet linkedHashSetA0k = C3cG.A0k();
        ArrayList arrayListA0h = C3cG.A0h();
        Iterator<JsonElement> it = jsonArray.iterator();
        while (it.hasNext()) {
            JsonElement next2 = it.next();
            try {
                C9sU c9sU = HatchJsonKt.HatchJson;
                int i = SavedVoiceJson.$stable;
                objA0s = (SavedVoiceJson) c9sU.A01(SavedVoiceJson$$serializer.INSTANCE, next2);
            } catch (Throwable th) {
                objA0s = C3cG.A0s(th);
            }
            if (objA0s instanceof C10571Hud) {
                objA0s = null;
            }
            SavedVoiceJson savedVoiceJson = (SavedVoiceJson) objA0s;
            if (savedVoiceJson != null && isValid(savedVoiceJson) && linkedHashSetA0k.add(savedVoiceJson.saved_voice_id)) {
                Iterator<SavedVoiceProfileJson> it2 = savedVoiceJson.profiles.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it2.next();
                    SavedVoiceProfileJson savedVoiceProfileJson = next;
                    if (C7384Etj.areEqual(savedVoiceJson.saved_voice_id, voiceSelectionIdentity != null ? voiceSelectionIdentity.savedVoiceId : null) && C7384Etj.areEqual(savedVoiceProfileJson.profile_id, voiceSelectionIdentity.profileId)) {
                        break;
                    }
                }
                SavedVoiceProfileJson savedVoiceProfileJson2 = next;
                if (savedVoiceProfileJson2 == null) {
                    savedVoiceProfileJson2 = (SavedVoiceProfileJson) AbstractC0878AGe.A0F(savedVoiceJson.profiles);
                }
                savedVoiceOption = new SavedVoiceOption(savedVoiceJson.saved_voice_id, savedVoiceProfileJson2.profile_id, new VoiceOption(savedVoiceJson.voice_id, savedVoiceJson.voice_name, savedVoiceProfileJson2.label, "", "", ""), savedVoiceProfileJson2.preview_text);
            } else {
                savedVoiceOption = null;
            }
            if (savedVoiceOption != null) {
                arrayListA0h.add(savedVoiceOption);
            }
        }
        if (arrayListA0h.size() != jsonArray.size()) {
            CFK.A06(TAG, FGI.A0H("saved voice library entries rejected: count=", jsonArray.size() - arrayListA0h.size()));
        }
        return arrayListA0h;
    }

    public static final String removeSavedVoiceEntry(String str, String str2) {
        AnonymousClass003.A0u(str, str2);
        JsonArray jsonArrayFullyUnderstoodLibrary = fullyUnderstoodLibrary(str);
        if (jsonArrayFullyUnderstoodLibrary == null) {
            return null;
        }
        ArrayList arrayListA0h = C3cG.A0h();
        Iterator<JsonElement> it = jsonArrayFullyUnderstoodLibrary.iterator();
        while (it.hasNext()) {
            JsonElement next = it.next();
            if (!str2.equals(savedVoiceId(next))) {
                arrayListA0h.add(next);
            }
        }
        if (arrayListA0h.size() == jsonArrayFullyUnderstoodLibrary.size() - 1) {
            return encodeLibrary(arrayListA0h);
        }
        return null;
    }

    public static final String renameSavedVoiceEntry(String str, String str2, String str3) {
        JsonObject jsonObject;
        AnonymousClass005.A0x(str, str2, str3);
        JsonArray jsonArrayFullyUnderstoodLibrary = fullyUnderstoodLibrary(str);
        if (jsonArrayFullyUnderstoodLibrary == null) {
            return null;
        }
        Iterator<Integer> it = AbstractC0885AGm.A12(jsonArrayFullyUnderstoodLibrary).iterator();
        boolean z = false;
        Integer num = null;
        while (true) {
            if (!it.hasNext()) {
                if (!z) {
                    break;
                }
            } else {
                Integer next = it.next();
                if (str2.equals(savedVoiceId(jsonArrayFullyUnderstoodLibrary.A00.get(AnonymousClass001.A0F(next))))) {
                    if (z) {
                        break;
                    }
                    z = true;
                    num = next;
                }
            }
        }
        num = null;
        Integer num2 = num;
        if (num2 == null) {
            return null;
        }
        int iIntValue = num2.intValue();
        JsonElement jsonElement = jsonArrayFullyUnderstoodLibrary.A00.get(iIntValue);
        if (!(jsonElement instanceof JsonObject) || (jsonObject = (JsonObject) jsonElement) == null) {
            return null;
        }
        if (str3.equals(stringOrNull(jsonObject, "voice_name"))) {
            return str;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(jsonObject);
        linkedHashMap.put("voice_name", C9oY.A07(str3));
        JsonObject jsonObject2 = new JsonObject(linkedHashMap);
        ArrayList arrayList = new ArrayList(jsonArrayFullyUnderstoodLibrary);
        arrayList.set(iIntValue, jsonObject2);
        return encodeLibrary(arrayList);
    }

    public static final String renameSettingsVoiceSelection(String str, String str2) {
        Object objA0s;
        AnonymousClass003.A0u(str, str2);
        if (parseSettingsVoiceSelection(str) == null) {
            return null;
        }
        try {
            objA0s = HatchJsonKt.HatchJson.A04(str);
        } catch (Throwable th) {
            objA0s = C3cG.A0s(th);
        }
        if (objA0s instanceof C10571Hud) {
            objA0s = null;
        }
        JsonObject jsonObject = objA0s instanceof JsonObject ? (JsonObject) objA0s : null;
        if (jsonObject == null) {
            return null;
        }
        C9sU c9sU = HatchJsonKt.HatchJson;
        JsonObjectSerializer jsonObjectSerializer = JsonObjectSerializer.A01;
        LinkedHashMap linkedHashMap = new LinkedHashMap(jsonObject);
        linkedHashMap.put("voice_name", C9oY.A07(str2));
        return c9sU.A02(new JsonObject(linkedHashMap), jsonObjectSerializer);
    }

    public static final String stringOrNull(JsonObject jsonObject, String str) {
        JsonPrimitive jsonPrimitive;
        Object obj = jsonObject.get(str);
        if (!(obj instanceof JsonPrimitive) || (jsonPrimitive = (JsonPrimitive) obj) == null) {
            return null;
        }
        return C9oY.A04(jsonPrimitive);
    }

    public static final boolean isValid(SavedVoiceProfileJson savedVoiceProfileJson) {
        if (isValidText(savedVoiceProfileJson.profile_id, 36, false, false, UUID_PATTERN) && isValidText(savedVoiceProfileJson.label, 80, false, false, null) && isValidText(savedVoiceProfileJson.preview_text, 500, true, true, null)) {
            return true;
        }
        return false;
    }

    public static final List<SavedVoiceOption> parseSavedVoiceLibrary(String str, VoiceSelectionIdentity voiceSelectionIdentity) {
        Object objA0s;
        JsonArray jsonArray;
        C7384Etj.A0Y(str, 0);
        try {
            objA0s = HatchJsonKt.HatchJson.A04(str);
        } catch (Throwable th) {
            objA0s = C3cG.A0s(th);
        }
        if (objA0s instanceof C10571Hud) {
            objA0s = null;
        }
        if (objA0s instanceof JsonArray) {
            jsonArray = (JsonArray) objA0s;
        } else {
            jsonArray = null;
        }
        if (jsonArray == null) {
            return null;
        }
        return parseSavedVoiceLibrary(jsonArray, voiceSelectionIdentity);
    }

    public static /* synthetic */ List parseSavedVoiceLibrary$default(JsonArray jsonArray, VoiceSelectionIdentity voiceSelectionIdentity, int i, Object obj) {
        if ((i & 2) != 0) {
            voiceSelectionIdentity = null;
        }
        return parseSavedVoiceLibrary(jsonArray, voiceSelectionIdentity);
    }
}
