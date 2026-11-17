package com.facebook.aura.commands.alarm;

import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.C0881AGi;
import X.C10571Hud;
import X.C3cG;
import X.C60Q;
import X.C7384Etj;
import X.C9oY;
import com.facebook.aura.bloks.storage.AuraMetaFRLSecureTokenStore;
import com.facebook.aura.feed.repo.FeedRepositoryKt;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Locale;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonPrimitive;

/* loaded from: classes3.dex */
public abstract class RecurrenceKt {
    public static final DateTimeFormatter RRULE_UNTIL_FORMAT;
    public static final String[] RRULE_WEEKDAYS = {"", "SU", "MO", "TU", "WE", "TH", "FR", "SA"};

    static {
        DateTimeFormatter dateTimeFormatterWithZone = DateTimeFormatter.ofPattern("yyyyMMdd'T'HHmmss'Z'").withZone(ZoneOffset.UTC);
        C7384Etj.A0U(dateTimeFormatterWithZone);
        RRULE_UNTIL_FORMAT = dateTimeFormatterWithZone;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Type inference failed for: r2v0, types: [boolean] */
    public static final Recurrence parseRecurrence(String str, JsonObject jsonObject, String str2) {
        String strA0l;
        RecurrenceFrequency recurrenceFrequency;
        int iIntValue;
        Integer numA02;
        String strA0l2;
        JsonPrimitive jsonPrimitive;
        String strA04;
        JsonPrimitive jsonPrimitive2;
        JsonPrimitive jsonPrimitive3;
        Integer numA022;
        String strA042;
        ?? A1Z = AnonymousClass005.A1Z(str, jsonObject, str2);
        List days = AlarmHandlersKt.parseDays(str2);
        Object obj = jsonObject.get("frequency");
        Long untilMs = null;
        JsonPrimitive jsonPrimitive4 = obj instanceof JsonPrimitive ? (JsonPrimitive) obj : null;
        if (jsonPrimitive4 == null || (strA042 = C9oY.A04(jsonPrimitive4)) == null || (strA0l = AnonymousClass002.A0l(strA042)) == null || strA0l.length() == 0) {
            if (days.isEmpty()) {
                return null;
            }
            strA0l = "WEEKLY";
        }
        String upperCase = strA0l.toUpperCase(Locale.ROOT);
        switch (upperCase.hashCode()) {
            case -1738378111:
                if (upperCase.equals("WEEKLY")) {
                    recurrenceFrequency = RecurrenceFrequency.WEEKLY;
                    break;
                }
                throw C60Q.A0U(str, ".frequency must be one of DAILY, WEEKLY, MONTHLY, YEARLY");
            case -1681232246:
                if (upperCase.equals("YEARLY")) {
                    recurrenceFrequency = RecurrenceFrequency.YEARLY;
                    break;
                }
                throw C60Q.A0U(str, ".frequency must be one of DAILY, WEEKLY, MONTHLY, YEARLY");
            case 64808441:
                if (upperCase.equals("DAILY")) {
                    recurrenceFrequency = RecurrenceFrequency.DAILY;
                    break;
                }
                throw C60Q.A0U(str, ".frequency must be one of DAILY, WEEKLY, MONTHLY, YEARLY");
            case 1954618349:
                if (upperCase.equals("MONTHLY")) {
                    recurrenceFrequency = RecurrenceFrequency.MONTHLY;
                    break;
                }
                throw C60Q.A0U(str, ".frequency must be one of DAILY, WEEKLY, MONTHLY, YEARLY");
            default:
                throw C60Q.A0U(str, ".frequency must be one of DAILY, WEEKLY, MONTHLY, YEARLY");
        }
        RecurrenceFrequency recurrenceFrequency2 = RecurrenceFrequency.WEEKLY;
        if (recurrenceFrequency != recurrenceFrequency2 && !days.isEmpty()) {
            throw C60Q.A0U(str, ".days only applies to a WEEKLY frequency");
        }
        Object obj2 = jsonObject.get("interval");
        if (!(obj2 instanceof JsonPrimitive) || (jsonPrimitive3 = (JsonPrimitive) obj2) == null || (numA022 = C9oY.A02(jsonPrimitive3)) == null) {
            iIntValue = 1;
        } else {
            iIntValue = numA022.intValue();
            if (iIntValue < A1Z) {
                throw C60Q.A0U(str, ".interval must be a positive integer");
            }
        }
        Object obj3 = jsonObject.get(AuraMetaFRLSecureTokenStore.JSON_KEY_COUNT);
        if (!(obj3 instanceof JsonPrimitive) || (jsonPrimitive2 = (JsonPrimitive) obj3) == null) {
            numA02 = null;
        } else {
            numA02 = C9oY.A02(jsonPrimitive2);
            if (numA02 != null && numA02.intValue() < A1Z) {
                throw C60Q.A0U(str, ".count must be a positive integer");
            }
        }
        Object obj4 = jsonObject.get("until");
        if (!(obj4 instanceof JsonPrimitive) || (jsonPrimitive = (JsonPrimitive) obj4) == null || (strA04 = C9oY.A04(jsonPrimitive)) == null || (strA0l2 = AnonymousClass002.A0l(strA04)) == null) {
            strA0l2 = "";
        }
        if (strA0l2.length() != 0 && (untilMs = AlarmTimeUtil.INSTANCE.parseUntilMs(strA0l2, C60Q.A0r())) == null) {
            throw C60Q.A0U(str, ".until must be an ISO-8601 date (e.g. '2026-12-31') or date-time");
        }
        if (recurrenceFrequency != recurrenceFrequency2) {
            days = C0881AGi.A00;
        }
        return new Recurrence(recurrenceFrequency, iIntValue, days, numA02, untilMs);
    }

    public static final String parseTimeZone(String str, JsonObject jsonObject) {
        String strA04;
        String strA0l;
        Object objA0s;
        AnonymousClass003.A0u(str, jsonObject);
        Object obj = jsonObject.get(FeedRepositoryKt.TIMEZONE_PARAM);
        JsonPrimitive jsonPrimitive = obj instanceof JsonPrimitive ? (JsonPrimitive) obj : null;
        if (jsonPrimitive != null && (strA04 = C9oY.A04(jsonPrimitive)) != null && (strA0l = AnonymousClass002.A0l(strA04)) != null) {
            if (strA0l.length() == 0) {
                strA0l = null;
            }
            if (strA0l != null) {
                try {
                    objA0s = ZoneId.of(strA0l);
                } catch (Throwable th) {
                    objA0s = C3cG.A0s(th);
                }
                if (objA0s instanceof C10571Hud) {
                    throw C60Q.A0U(str, ".timezone is not a valid IANA time zone id");
                }
                return strA0l;
            }
        }
        return null;
    }
}
