package com.facebook.aura.email.repo;

import X.AnonymousClass005;
import X.C60O;
import X.C7384Etj;
import X.C9i2;
import X.C9jH;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonObject;

/* loaded from: classes4.dex */
public final class EmailSettingsDisplaySerializer extends C9i2<EmailSettingsDisplayJson> {
    public static final EmailSettingsDisplaySerializer INSTANCE = new EmailSettingsDisplaySerializer();
    public static final List<String> copySections = Arrays.asList("verified_email_row", "verified_email_page", "add_email_page", "sender_name_page", "muse_mail_page", "delete_dialog");

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.util.AbstractMap, java.util.LinkedHashMap] */
    @Override // X.C9i2
    public JsonElement transformDeserialize(JsonElement jsonElement) {
        C9jH c9jH;
        JsonObject jsonObject;
        C7384Etj.A0Y(jsonElement, 0);
        if (!(jsonElement instanceof JsonObject) || (jsonObject = (JsonObject) jsonElement) == null) {
            c9jH = C9jH.A00;
        } else {
            List<String> list = copySections;
            LinkedHashMap linkedHashMapA15 = C60O.A15(AnonymousClass005.A0C(list));
            for (String str : list) {
                Object obj = jsonObject.get(str);
                linkedHashMapA15.put(str, new JsonObject(EmailRepositoryJsonKt.stringFields(obj instanceof JsonObject ? (JsonObject) obj : null)));
            }
            ?? linkedHashMap = new LinkedHashMap(jsonObject);
            linkedHashMap.putAll(linkedHashMapA15);
            c9jH = linkedHashMap;
        }
        return new JsonObject(c9jH);
    }

    public EmailSettingsDisplaySerializer() {
        super(EmailSettingsDisplayJson$$serializer.INSTANCE);
    }
}
