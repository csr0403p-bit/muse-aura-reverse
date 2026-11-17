package com.facebook.aura.commands.contacts;

import X.AbstractC0885AGm;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.C60O;
import X.C60Q;
import X.C7384Etj;
import X.C7BY;
import X.C9oY;
import X.C9sU;
import X.F60;
import X.FGI;
import X.HxE;
import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.provider.ContactsContract;
import com.facebook.aura.commands.sms.DeviceSmsReaderKt;
import com.facebook.aura.deeplink.AuraDeeplinkRouteMapper;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlinx.serialization.json.JsonArray;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonPrimitive;

/* loaded from: classes3.dex */
public abstract class ContactsWriteSupportKt {
    public static final String CONTACT_PARAM_PLATFORM_ID = "platform_id";
    public static final String CONTACT_PARAM_RAW_CONTACT_ID = "raw_contact_id";

    /* JADX WARN: Code restructure failed: missing block: B:19:0x003c, code lost:
    
        if (r3.equals("") == false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0049, code lost:
    
        if (r3.equals(com.facebook.aura.deeplink.AuraDeeplinkRouteMapper.HOME_ROUTE) != false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x004b, code lost:
    
        r0 = 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.HxE<java.lang.Integer, java.lang.String> emailTypeAndLabel(java.lang.String r5) {
        /*
            r4 = 0
            X.C7384Etj.A0Y(r5, r4)
            java.lang.String r3 = X.AnonymousClass001.A0u(r5)
            int r2 = r3.hashCode()
            r1 = 0
            if (r2 == 0) goto L36
            r0 = 3208415(0x30f4df, float:4.495947E-39)
            if (r2 == r0) goto L43
            r0 = 3655441(0x37c711, float:5.122364E-39)
            if (r2 == r0) goto L2c
            r0 = 106069776(0x6527f10, float:3.958996E-35)
            if (r2 != r0) goto L3e
            java.lang.String r0 = "other"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L3e
            r0 = 3
        L27:
            X.HxE r0 = X.C60Q.A0y(r1, r0)
            return r0
        L2c:
            java.lang.String r0 = "work"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L3e
            r0 = 2
            goto L27
        L36:
            java.lang.String r0 = ""
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L4b
        L3e:
            X.HxE r0 = X.C60Q.A0y(r5, r4)
            return r0
        L43:
            java.lang.String r0 = "home"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L3e
        L4b:
            r0 = 1
            goto L27
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.commands.contacts.ContactsWriteSupportKt.emailTypeAndLabel(java.lang.String):X.HxE");
    }

    public static final HxE<Integer, String> phoneTypeAndLabel(String str) {
        String str2;
        int i;
        C7384Etj.A0Y(str, 0);
        String strA0u = AnonymousClass001.A0u(str);
        int iHashCode = strA0u.hashCode();
        if (iHashCode == -1068855134) {
            str2 = "mobile";
        } else {
            if (iHashCode != 0) {
                if (iHashCode == 3208415) {
                    if (strA0u.equals(AuraDeeplinkRouteMapper.HOME_ROUTE)) {
                        i = 1;
                        return C60Q.A0y(null, i);
                    }
                    return C60Q.A0y(str, 0);
                }
                if (iHashCode == 3343801) {
                    if (strA0u.equals("main")) {
                        i = 12;
                        return C60Q.A0y(null, i);
                    }
                    return C60Q.A0y(str, 0);
                }
                if (iHashCode == 3655441) {
                    if (strA0u.equals("work")) {
                        i = 3;
                        return C60Q.A0y(null, i);
                    }
                    return C60Q.A0y(str, 0);
                }
                if (iHashCode == 106069776 && strA0u.equals(DeviceSmsReaderKt.ATTACHMENT_OTHER)) {
                    i = 7;
                    return C60Q.A0y(null, i);
                }
                return C60Q.A0y(str, 0);
            }
            str2 = "";
        }
        if (strA0u.equals(str2)) {
            i = 2;
            return C60Q.A0y(null, i);
        }
        return C60Q.A0y(str, 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0037  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final com.facebook.aura.commands.contacts.ContactCardInfo readContactCardInfo(android.content.Context r8, long r9) {
        /*
            r1 = 0
            X.C7384Etj.A0Y(r8, r1)
            r7 = 0
            android.content.ContentResolver r2 = r8.getContentResolver()
            android.net.Uri r3 = android.provider.ContactsContract.Contacts.CONTENT_URI
            java.lang.String r0 = "display_name"
            java.lang.String[] r4 = new java.lang.String[]{r0}
            java.lang.String[] r6 = X.C60Q.A1a(r9)
            java.lang.String r5 = "_id = ?"
            android.database.Cursor r2 = r2.query(r3, r4, r5, r6, r7)
            if (r2 == 0) goto L3c
            boolean r0 = r2.moveToFirst()     // Catch: java.lang.Throwable -> L30
            if (r0 == 0) goto L39
            java.lang.String r1 = r2.getString(r1)     // Catch: java.lang.Throwable -> L30
            if (r1 == 0) goto L37
            boolean r0 = X.C7BY.A0j(r1)     // Catch: java.lang.Throwable -> L30
            if (r0 != 0) goto L37
            goto L38
        L30:
            r1 = move-exception
            throw r1     // Catch: java.lang.Throwable -> L32
        L32:
            r0 = move-exception
            X.AbstractC7531Ezs.A00(r2, r1)
            throw r0
        L37:
            r1 = r7
        L38:
            r7 = r1
        L39:
            r2.close()
        L3c:
            java.lang.String r1 = readContactPrimaryNumber(r8, r9)
            com.facebook.aura.commands.contacts.ContactCardInfo r0 = new com.facebook.aura.commands.contacts.ContactCardInfo
            r0.<init>(r7, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.commands.contacts.ContactsWriteSupportKt.readContactCardInfo(android.content.Context, long):com.facebook.aura.commands.contacts.ContactCardInfo");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0032  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.String readContactPrimaryNumber(android.content.Context r5, long r6) {
        /*
            r1 = 0
            X.C7384Etj.A0Y(r5, r1)
            android.content.ContentResolver r2 = r5.getContentResolver()
            android.net.Uri r3 = android.provider.ContactsContract.CommonDataKinds.Phone.CONTENT_URI
            java.lang.String r0 = "data1"
            java.lang.String[] r4 = new java.lang.String[]{r0}
            java.lang.String[] r6 = X.C60Q.A1a(r6)
            java.lang.String r7 = "is_super_primary DESC, is_primary DESC"
            java.lang.String r5 = "contact_id = ?"
            android.database.Cursor r3 = r2.query(r3, r4, r5, r6, r7)
            r2 = 0
            if (r3 == 0) goto L3e
            boolean r0 = r3.moveToFirst()     // Catch: java.lang.Throwable -> L37
            if (r0 == 0) goto L32
            java.lang.String r1 = r3.getString(r1)     // Catch: java.lang.Throwable -> L37
            if (r1 == 0) goto L32
            boolean r0 = X.C7BY.A0j(r1)     // Catch: java.lang.Throwable -> L37
            if (r0 != 0) goto L32
            goto L33
        L32:
            r1 = r2
        L33:
            r3.close()
            return r1
        L37:
            r1 = move-exception
            throw r1     // Catch: java.lang.Throwable -> L39
        L39:
            r0 = move-exception
            X.AbstractC7531Ezs.A00(r3, r1)
            throw r0
        L3e:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.commands.contacts.ContactsWriteSupportKt.readContactPrimaryNumber(android.content.Context, long):java.lang.String");
    }

    public static final ContactWriteTarget resolveContactWriteTarget(Context context, String str, Long l) {
        C7384Etj.A0Y(context, 0);
        if (str != null) {
            ContentResolver contentResolver = context.getContentResolver();
            C7384Etj.A0U(contentResolver);
            return resolveContactWriteTargetByPlatformId(contentResolver, str);
        }
        if (l == null) {
            return null;
        }
        ContentResolver contentResolver2 = context.getContentResolver();
        C7384Etj.A0U(contentResolver2);
        return resolveContactWriteTargetByRawContactId(contentResolver2, l.longValue());
    }

    public static final ContactWriteTarget resolveContactWriteTargetByPlatformId(ContentResolver contentResolver, String str) {
        boolean z;
        Long lFirstRawContactIdForContact;
        Long lValueOf = null;
        String string = null;
        Cursor cursorQuery = contentResolver.query(ContactsContract.Contacts.CONTENT_URI, new String[]{"_id", "lookup"}, "lookup = ?", new String[]{str}, null);
        if (cursorQuery != null) {
            try {
                if (cursorQuery.moveToFirst()) {
                    int columnIndexOrThrow = cursorQuery.getColumnIndexOrThrow("_id");
                    int columnIndexOrThrow2 = cursorQuery.getColumnIndexOrThrow("lookup");
                    lValueOf = Long.valueOf(cursorQuery.getLong(columnIndexOrThrow));
                    string = cursorQuery.getString(columnIndexOrThrow2);
                    z = true;
                } else {
                    z = false;
                }
                cursorQuery.close();
                if (z && (lFirstRawContactIdForContact = firstRawContactIdForContact(contentResolver, lValueOf.longValue())) != null) {
                    return new ContactWriteTarget(lValueOf.longValue(), lFirstRawContactIdForContact.longValue(), string);
                }
            } finally {
            }
        }
        return null;
    }

    public static final Long firstRawContactIdForContact(ContentResolver contentResolver, long j) {
        Cursor cursorQuery = contentResolver.query(ContactsContract.RawContacts.CONTENT_URI, new String[]{"_id"}, "contact_id = ? AND deleted = 0", C60Q.A1a(j), null);
        if (cursorQuery != null) {
            try {
                lValueOf = cursorQuery.moveToFirst() ? Long.valueOf(cursorQuery.getLong(cursorQuery.getColumnIndexOrThrow("_id"))) : null;
                cursorQuery.close();
            } finally {
            }
        }
        return lValueOf;
    }

    public static final String lookupKeyForContact(ContentResolver contentResolver, long j) {
        Cursor cursorQuery = contentResolver.query(ContactsContract.Contacts.CONTENT_URI, new String[]{"lookup"}, "_id = ?", C60Q.A1a(j), null);
        if (cursorQuery != null) {
            try {
                strA0c = cursorQuery.moveToFirst() ? C60Q.A0c(cursorQuery, "lookup") : null;
                cursorQuery.close();
            } finally {
            }
        }
        return strA0c;
    }

    public static final JsonObject parseContactsParams(String str) {
        try {
            return str != null ? C9oY.A05(C9sU.A03.A04(str)) : C60O.A1G();
        } catch (Exception unused) {
            return null;
        }
    }

    public static final ContactWriteTarget resolveContactWriteTargetByRawContactId(ContentResolver contentResolver, long j) {
        Cursor cursorQuery = contentResolver.query(ContactsContract.RawContacts.CONTENT_URI, new String[]{"contact_id"}, "_id = ? AND deleted = 0", C60Q.A1a(j), null);
        if (cursorQuery != null) {
            try {
                Long lValueOf = !cursorQuery.moveToFirst() ? null : Long.valueOf(cursorQuery.getLong(cursorQuery.getColumnIndexOrThrow("contact_id")));
                cursorQuery.close();
                if (lValueOf != null) {
                    long jLongValue = lValueOf.longValue();
                    return new ContactWriteTarget(jLongValue, j, lookupKeyForContact(contentResolver, jLongValue));
                }
            } finally {
            }
        }
        return null;
    }

    public static final Long longParam(JsonObject jsonObject, String str) {
        JsonPrimitive jsonPrimitive;
        AnonymousClass003.A0u(jsonObject, str);
        Object obj = jsonObject.get(str);
        if (!(obj instanceof JsonPrimitive) || (jsonPrimitive = (JsonPrimitive) obj) == null) {
            return null;
        }
        return C9oY.A03(jsonPrimitive);
    }

    public static final List<JsonObject> objectListParam(JsonObject jsonObject, String str, String str2) {
        JsonArray jsonArray;
        AnonymousClass005.A0x(jsonObject, str, str2);
        JsonElement jsonElementA1F = C60O.A1F(str, jsonObject);
        ArrayList arrayListA0i = null;
        if (jsonElementA1F != null || (jsonElementA1F = (JsonElement) jsonObject.get(str2)) != null) {
            if (jsonElementA1F instanceof JsonPrimitive) {
                JsonPrimitive jsonPrimitive = (JsonPrimitive) jsonElementA1F;
                if (jsonPrimitive.A01()) {
                    jsonElementA1F = C9sU.A03.A04(jsonPrimitive.A00());
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

    public static final String optionalStringParam(JsonObject jsonObject, String str) {
        AnonymousClass003.A0u(jsonObject, str);
        String strStringParam = stringParam(jsonObject, str);
        if (C7BY.A0j(strStringParam)) {
            return null;
        }
        return strStringParam;
    }

    public static final String stringParam(JsonObject jsonObject, String str) {
        JsonPrimitive jsonPrimitive;
        String strA04;
        String strA0l;
        AnonymousClass003.A0u(jsonObject, str);
        Object obj = jsonObject.get(str);
        return (!(obj instanceof JsonPrimitive) || (jsonPrimitive = (JsonPrimitive) obj) == null || (strA04 = C9oY.A04(jsonPrimitive)) == null || (strA0l = AnonymousClass002.A0l(strA04)) == null) ? "" : strA0l;
    }
}
