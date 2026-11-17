package com.facebook.aura.commands.calendar;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.BFI;
import X.C06G;
import X.C06H;
import X.C0KA;
import X.C10571Hud;
import X.C2nw;
import X.C3UX;
import X.C3cG;
import X.C3cH;
import X.C3cI;
import X.C60O;
import X.C60P;
import X.C60Q;
import X.C7384Etj;
import X.C7qW;
import X.C9tI;
import X.CFK;
import X.FGI;
import X.G0V;
import X.GAo;
import X.HtJ;
import X.Hwg;
import X.HzP;
import android.content.ContentUris;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.provider.CalendarContract;
import com.facebook.aura.ageverification.intf.AgeCheckFunnelLogging;
import com.facebook.aura.commands.calendar.CalendarRepository;
import com.facebook.aura.devices.pairing.LinkEncryptedPairingKt;
import com.facebook.aura.feed.repo.FeedRepositoryKt;
import com.facebook.aura.login.nativeflow.NativeLoginViewModel;
import com.facebook.aura.opengraph.HatchWebPageParserKt;
import com.facebook.aura.shopping.repo.MarketplaceDetailsNormalizationKt;
import java.time.DayOfWeek;
import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.time.format.TextStyle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TimeZone;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlinx.serialization.json.JsonObject;

/* loaded from: classes3.dex */
public final class CalendarRepository {
    public static final DateTimeFormatter LOCAL_DATE_TIME;
    public static final DateTimeFormatter LOCAL_DATE_UTC;
    public static final String[] SEARCH_EVENT_PROJECTION;
    public static final String[] SYNC_EVENT_PROJECTION;
    public static volatile CalendarRepository instance;
    public final Context context;
    public static final Companion Companion = new Companion();
    public static final String[] CALENDAR_PROJECTION = {"_id", "calendar_displayName", "account_name", "ownerAccount", "account_type", "isPrimary", "calendar_color"};

    public final class CalendarInfo extends C06G {
        public final String accountName;
        public final String accountType;
        public final int color;
        public final String displayName;
        public final long id;
        public final boolean isPrimary;
        public final String ownerAccount;

        public CalendarInfo(long j, String str, String str2, String str3, String str4, boolean z, int i) {
            AnonymousClass005.A11(str, str2, str3, 1);
            C7384Etj.A0Y(str4, 4);
            this.id = j;
            this.displayName = str;
            this.accountName = str2;
            this.ownerAccount = str3;
            this.accountType = str4;
            this.isPrimary = z;
            this.color = i;
        }

        public final CalendarInfo copy(long j, String str, String str2, String str3, String str4, boolean z, int i) {
            AnonymousClass005.A11(str, str2, str3, 1);
            C7384Etj.A0Y(str4, 4);
            return new CalendarInfo(j, str, str2, str3, str4, z, i);
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof CalendarInfo) {
                    CalendarInfo calendarInfo = (CalendarInfo) obj;
                    if (this.id != calendarInfo.id || !C7384Etj.areEqual(this.displayName, calendarInfo.displayName) || !C7384Etj.areEqual(this.accountName, calendarInfo.accountName) || !C7384Etj.areEqual(this.ownerAccount, calendarInfo.ownerAccount) || !C7384Etj.areEqual(this.accountType, calendarInfo.accountType) || this.isPrimary != calendarInfo.isPrimary || this.color != calendarInfo.color) {
                    }
                }
                return false;
            }
            return true;
        }

        public static /* synthetic */ CalendarInfo copy$default(CalendarInfo calendarInfo, long j, String str, String str2, String str3, String str4, boolean z, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                j = calendarInfo.id;
            }
            if ((i2 & 2) != 0) {
                str = calendarInfo.displayName;
            }
            if ((i2 & 4) != 0) {
                str2 = calendarInfo.accountName;
            }
            if ((i2 & 8) != 0) {
                str3 = calendarInfo.ownerAccount;
            }
            if ((i2 & 16) != 0) {
                str4 = calendarInfo.accountType;
            }
            if ((i2 & 32) != 0) {
                z = calendarInfo.isPrimary;
            }
            if ((i2 & 64) != 0) {
                i = calendarInfo.color;
            }
            return calendarInfo.copy(j, str, str2, str3, str4, z, i);
        }

        public final long component1() {
            return this.id;
        }

        public final String component2() {
            return this.displayName;
        }

        public final String component3() {
            return this.accountName;
        }

        public final String component4() {
            return this.ownerAccount;
        }

        public final String component5() {
            return this.accountType;
        }

        public final boolean component6() {
            return this.isPrimary;
        }

        public final int component7() {
            return this.color;
        }

        public final String getAccountName() {
            return this.accountName;
        }

        public final String getAccountType() {
            return this.accountType;
        }

        public final int getColor() {
            return this.color;
        }

        public final String getDisplayName() {
            return this.displayName;
        }

        public final long getId() {
            return this.id;
        }

        public final String getOwnerAccount() {
            return this.ownerAccount;
        }

        public int hashCode() {
            return C0KA.A01(AnonymousClass005.A0I(this.accountType, AnonymousClass005.A0I(this.ownerAccount, AnonymousClass005.A0I(this.accountName, AnonymousClass005.A0I(this.displayName, AnonymousClass002.A0A(this.id) * 31)))), this.isPrimary) + this.color;
        }

        public final boolean isPrimary() {
            return this.isPrimary;
        }

        /* JADX WARN: Removed duplicated region for block: B:6:0x0048  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final kotlinx.serialization.json.JsonObject toJson() {
            /*
                r4 = this;
                X.2nw r2 = X.C60O.A1K()
                long r0 = r4.id
                java.lang.Long r1 = java.lang.Long.valueOf(r0)
                java.lang.String r0 = "id"
                X.C7qW.A05(r1, r0, r2)
                java.lang.String r1 = "display_name"
                java.lang.String r0 = r4.displayName
                X.C7qW.A06(r1, r0, r2)
                java.lang.String r1 = "account_name"
                java.lang.String r0 = r4.accountName
                X.C7qW.A06(r1, r0, r2)
                java.lang.String r1 = "owner_account"
                java.lang.String r0 = r4.ownerAccount
                X.C7qW.A06(r1, r0, r2)
                java.lang.String r1 = "account_type"
                java.lang.String r0 = r4.accountType
                X.C7qW.A06(r1, r0, r2)
                java.lang.String r0 = r4.accountType
                java.lang.String r1 = com.facebook.aura.commands.calendar.CalendarRepositoryKt.providerOf(r0)
                java.lang.String r0 = "provider"
                X.C7qW.A06(r0, r1, r2)
                java.lang.String r1 = r4.accountName
                int r0 = r1.length()
                r3 = 1
                if (r0 <= 0) goto L48
                java.lang.String r0 = r4.ownerAccount
                boolean r1 = r1.equals(r0)
                r0 = 1
                if (r1 != 0) goto L49
            L48:
                r0 = 0
            L49:
                java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
                java.lang.String r0 = "is_owner_account"
                X.C7qW.A04(r1, r0, r2)
                boolean r0 = r4.isPrimary
                java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
                java.lang.String r0 = "is_primary"
                X.C7qW.A04(r1, r0, r2)
                r1 = 16777215(0xffffff, float:2.3509886E-38)
                int r0 = r4.color
                r1 = r1 & r0
                java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
                java.lang.Object[] r0 = new java.lang.Object[]{r0}
                java.lang.Object[] r1 = java.util.Arrays.copyOf(r0, r3)
                java.lang.String r0 = "#%06X"
                java.lang.String r1 = java.lang.String.format(r0, r1)
                java.lang.String r0 = "color"
                kotlinx.serialization.json.JsonObject r0 = X.C7qW.A01(r0, r1, r2)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.commands.calendar.CalendarRepository.CalendarInfo.toJson():kotlinx.serialization.json.JsonObject");
        }

        public String toString() {
            return super.toString();
        }
    }

    public final class Companion {
        private final String weekdayOf(String str) {
            Object objA0s;
            if (str == null) {
                return null;
            }
            Companion companion = CalendarRepository.Companion;
            try {
                DayOfWeek dayOfWeek = LocalDate.parse(str).getDayOfWeek();
                C7384Etj.A0U(dayOfWeek);
                objA0s = companion.weekdayName(dayOfWeek);
            } catch (Throwable th) {
                objA0s = C3cG.A0s(th);
            }
            return (String) (objA0s instanceof C10571Hud ? null : objA0s);
        }

        public final CalendarRepository getInstance(Context context) {
            C7384Etj.A0Y(context, 0);
            CalendarRepository calendarRepository = CalendarRepository.instance;
            if (calendarRepository == null) {
                synchronized (this) {
                    calendarRepository = CalendarRepository.instance;
                    if (calendarRepository == null) {
                        calendarRepository = new CalendarRepository(AnonymousClass001.A0I(context));
                        CalendarRepository.instance = calendarRepository;
                    }
                }
            }
            return calendarRepository;
        }

        private final long allDayInclusiveEndMs(long j, Long l) {
            long jLongValue = l != null ? l.longValue() : j;
            return jLongValue > j ? jLongValue - 1 : j;
        }

        private final ZoneId eventZone(String str) {
            Object objA0s;
            if (str != null) {
                if (str.length() <= 0) {
                    str = null;
                }
                if (str != null) {
                    String[] strArr = CalendarRepository.CALENDAR_PROJECTION;
                    try {
                        objA0s = ZoneId.of(str);
                    } catch (Throwable th) {
                        objA0s = C3cG.A0s(th);
                    }
                    ZoneId zoneId = (ZoneId) (objA0s instanceof C10571Hud ? null : objA0s);
                    if (zoneId != null) {
                        return zoneId;
                    }
                }
            }
            return C60Q.A0r();
        }

        private final String weekdayName(DayOfWeek dayOfWeek) {
            String displayName = dayOfWeek.getDisplayName(TextStyle.FULL, Locale.US);
            C7384Etj.A0U(displayName);
            return displayName;
        }

        public final ContentValues buildEventValues$fbandroid_express_aura_java_com_facebook_aura_commands_calendar_calendar(long j, String str, long j2, Long l, boolean z, String str2, String str3, String str4, String str5, String str6) {
            C7384Etj.A0Y(str, 1);
            ContentValues contentValues = new ContentValues();
            contentValues.put("calendar_id", Long.valueOf(j));
            contentValues.put("title", str);
            contentValues.put("dtstart", Long.valueOf(j2));
            if (str5 != null) {
                contentValues.put("rrule", str5);
                if (str6 == null) {
                    str6 = "PT1H";
                }
                contentValues.put("duration", str6);
            } else {
                if (l == null) {
                    l = Long.valueOf(j2 + 3600000);
                }
                contentValues.put("dtend", l);
            }
            contentValues.put("allDay", Integer.valueOf(z ? 1 : 0));
            if (str2 != null) {
                contentValues.put(HatchWebPageParserKt.DESCRIPTION, str2);
            }
            if (str3 != null) {
                contentValues.put("eventLocation", str3);
            }
            if (str4 == null) {
                str4 = TimeZone.getDefault().getID();
            }
            contentValues.put("eventTimezone", str4);
            return contentValues;
        }

        public final String localDateUtc$fbandroid_express_aura_java_com_facebook_aura_commands_calendar_calendar(long j) {
            String str = CalendarRepository.LOCAL_DATE_UTC.format(Instant.ofEpochMilli(j));
            C7384Etj.A0U(str);
            return str;
        }

        public final String mapAvailability$fbandroid_express_aura_java_com_facebook_aura_commands_calendar_calendar(Integer num) {
            if (num == null) {
                return "unknown";
            }
            int iIntValue = num.intValue();
            return iIntValue == 0 ? "busy" : iIntValue == 1 ? "free" : iIntValue == 2 ? "tentative" : "unknown";
        }

        public final String mapStatus$fbandroid_express_aura_java_com_facebook_aura_commands_calendar_calendar(Integer num) {
            if (num == null) {
                return "none";
            }
            int iIntValue = num.intValue();
            return iIntValue == 1 ? NativeLoginViewModel.REGISTRATION_STATE_CONFIRMED : iIntValue == 0 ? "tentative" : iIntValue == 2 ? "canceled" : "none";
        }

        private final String colorHex(int i) {
            return String.format("#%06X", Arrays.copyOf(new Object[]{Integer.valueOf(i & 16777215)}, 1));
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        /* JADX WARN: Removed duplicated region for block: B:6:0x0017  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final com.facebook.aura.commands.calendar.CalendarEventPayloadJson buildSyncEventPayload$fbandroid_express_aura_java_com_facebook_aura_commands_calendar_calendar(long r26, java.lang.String r28, java.lang.String r29, long r30, java.lang.Long r32, boolean r33, java.lang.String r34, long r35, java.lang.String r37, java.lang.String r38, java.lang.String r39, java.lang.Integer r40, java.lang.Integer r41, java.lang.Integer r42) {
            /*
                r25 = this;
                r21 = r29
                r20 = r34
                r6 = r38
                r0 = 1
                r13 = r28
                r10 = r37
                X.C60O.A1N(r13, r0, r10)
                if (r39 == 0) goto L17
                int r0 = r39.length()
                r11 = 0
                if (r0 != 0) goto L18
            L17:
                r11 = 1
            L18:
                r29 = r11 ^ 1
                com.facebook.aura.nodes.datasource.NodeSyncTimestamps r0 = com.facebook.aura.nodes.datasource.NodeSyncTimestamps.INSTANCE
                r1 = r30
                java.lang.String r14 = r0.iso8601Utc(r1)
                r5 = r32
                if (r32 == 0) goto Lf9
                long r3 = r5.longValue()
            L2a:
                java.lang.String r15 = r0.iso8601Utc(r3)
                r0 = r25
                java.time.ZoneId r7 = r0.eventZone(r6)
                java.time.Instant r3 = java.time.Instant.ofEpochMilli(r1)
                java.time.ZonedDateTime r3 = r3.atZone(r7)
                if (r32 == 0) goto Lf6
                long r8 = r5.longValue()
            L42:
                java.time.Instant r4 = java.time.Instant.ofEpochMilli(r8)
                java.time.ZonedDateTime r7 = r4.atZone(r7)
                r16 = r33
                if (r33 == 0) goto Lf2
                java.lang.String r4 = r0.localDateUtc$fbandroid_express_aura_java_com_facebook_aura_commands_calendar_calendar(r1)
                long r1 = r0.allDayInclusiveEndMs(r1, r5)
                java.lang.String r1 = r0.localDateUtc$fbandroid_express_aura_java_com_facebook_aura_commands_calendar_calendar(r1)
            L5a:
                r8 = r26
                if (r11 != 0) goto Lec
                java.lang.StringBuilder r2 = X.C60O.A0w()
                r2.append(r8)
                java.lang.String r5 = "#"
                java.lang.String r12 = X.C60P.A1M(r5, r14, r2)
            L6b:
                java.lang.String r18 = java.lang.String.valueOf(r35)
                r2 = r40
                java.lang.String r19 = r0.mapAvailability$fbandroid_express_aura_java_com_facebook_aura_commands_calendar_calendar(r2)
                if (r34 == 0) goto L7d
                int r2 = r20.length()
                if (r2 > 0) goto L7f
            L7d:
                r20 = 0
            L7f:
                if (r21 == 0) goto L87
                int r2 = r21.length()
                if (r2 > 0) goto L89
            L87:
                r21 = 0
            L89:
                if (r38 == 0) goto L91
                int r2 = r6.length()
                if (r2 > 0) goto L92
            L91:
                r6 = 0
            L92:
                if (r33 == 0) goto Lcb
                r25 = 0
                r26 = 0
                java.lang.String r27 = r0.weekdayOf(r4)
                java.lang.String r28 = r0.weekdayOf(r1)
            La0:
                r30 = 0
                if (r11 != 0) goto La6
                r30 = r14
            La6:
                r2 = r41
                java.lang.String r32 = r0.mapStatus$fbandroid_express_aura_java_com_facebook_aura_commands_calendar_calendar(r2)
                if (r42 == 0) goto Lc8
                int r2 = r42.intValue()
                com.facebook.aura.commands.calendar.CalendarRepository$Companion r0 = com.facebook.aura.commands.calendar.CalendarRepository.Companion
                java.lang.String r33 = r0.colorHex(r2)
            Lb8:
                r31 = 0
                com.facebook.aura.commands.calendar.CalendarEventPayloadJson r11 = new com.facebook.aura.commands.calendar.CalendarEventPayloadJson
                r23 = r4
                r24 = r1
                r22 = r6
                r17 = r10
                r11.<init>(r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33)
                return r11
            Lc8:
                r33 = 0
                goto Lb8
            Lcb:
                java.time.format.DateTimeFormatter r2 = com.facebook.aura.commands.calendar.CalendarRepository.LOCAL_DATE_TIME
                java.lang.String r25 = r2.format(r3)
                java.lang.String r26 = r2.format(r7)
                java.time.DayOfWeek r2 = r3.getDayOfWeek()
                X.C7384Etj.A0U(r2)
                java.lang.String r27 = r0.weekdayName(r2)
                java.time.DayOfWeek r2 = r7.getDayOfWeek()
                X.C7384Etj.A0U(r2)
                java.lang.String r28 = r0.weekdayName(r2)
                goto La0
            Lec:
                java.lang.String r12 = java.lang.String.valueOf(r8)
                goto L6b
            Lf2:
                r4 = 0
                r1 = 0
                goto L5a
            Lf6:
                r8 = r1
                goto L42
            Lf9:
                r3 = r1
                goto L2a
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.commands.calendar.CalendarRepository.Companion.buildSyncEventPayload$fbandroid_express_aura_java_com_facebook_aura_commands_calendar_calendar(long, java.lang.String, java.lang.String, long, java.lang.Long, boolean, java.lang.String, long, java.lang.String, java.lang.String, java.lang.String, java.lang.Integer, java.lang.Integer, java.lang.Integer):com.facebook.aura.commands.calendar.CalendarEventPayloadJson");
        }

        public Companion() {
        }
    }

    public final class EventInfo extends C06G {
        public final boolean allDay;
        public final String calendarDisplayName;
        public final long calendarId;
        public final String description;
        public final Long dtEnd;
        public final long dtStart;
        public final long id;
        public final String location;
        public final String timezone;
        public final String title;

        public EventInfo(long j, String str, String str2, long j2, Long l, boolean z, String str3, long j3, String str4, String str5) {
            C60O.A1N(str, 1, str4);
            this.id = j;
            this.title = str;
            this.description = str2;
            this.dtStart = j2;
            this.dtEnd = l;
            this.allDay = z;
            this.location = str3;
            this.calendarId = j3;
            this.calendarDisplayName = str4;
            this.timezone = str5;
        }

        public final EventInfo copy(long j, String str, String str2, long j2, Long l, boolean z, String str3, long j3, String str4, String str5) {
            C60O.A1N(str, 1, str4);
            return new EventInfo(j, str, str2, j2, l, z, str3, j3, str4, str5);
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof EventInfo) {
                    EventInfo eventInfo = (EventInfo) obj;
                    if (this.id != eventInfo.id || !C7384Etj.areEqual(this.title, eventInfo.title) || !C7384Etj.areEqual(this.description, eventInfo.description) || this.dtStart != eventInfo.dtStart || !C7384Etj.areEqual(this.dtEnd, eventInfo.dtEnd) || this.allDay != eventInfo.allDay || !C7384Etj.areEqual(this.location, eventInfo.location) || this.calendarId != eventInfo.calendarId || !C7384Etj.areEqual(this.calendarDisplayName, eventInfo.calendarDisplayName) || !C7384Etj.areEqual(this.timezone, eventInfo.timezone)) {
                    }
                }
                return false;
            }
            return true;
        }

        public static /* synthetic */ EventInfo copy$default(EventInfo eventInfo, long j, String str, String str2, long j2, Long l, boolean z, String str3, long j3, String str4, String str5, int i, Object obj) {
            if ((i & 1) != 0) {
                j = eventInfo.id;
            }
            if ((i & 2) != 0) {
                str = eventInfo.title;
            }
            if ((i & 4) != 0) {
                str2 = eventInfo.description;
            }
            if ((i & 8) != 0) {
                j2 = eventInfo.dtStart;
            }
            if ((i & 16) != 0) {
                l = eventInfo.dtEnd;
            }
            if ((i & 32) != 0) {
                z = eventInfo.allDay;
            }
            if ((i & 64) != 0) {
                str3 = eventInfo.location;
            }
            if ((i & 128) != 0) {
                j3 = eventInfo.calendarId;
            }
            if ((i & 256) != 0) {
                str4 = eventInfo.calendarDisplayName;
            }
            if ((i & 512) != 0) {
                str5 = eventInfo.timezone;
            }
            return eventInfo.copy(j, str, str2, j2, l, z, str3, j3, str4, str5);
        }

        public final long component1() {
            return this.id;
        }

        public final String component10() {
            return this.timezone;
        }

        public final String component2() {
            return this.title;
        }

        public final String component3() {
            return this.description;
        }

        public final long component4() {
            return this.dtStart;
        }

        public final Long component5() {
            return this.dtEnd;
        }

        public final boolean component6() {
            return this.allDay;
        }

        public final String component7() {
            return this.location;
        }

        public final long component8() {
            return this.calendarId;
        }

        public final String component9() {
            return this.calendarDisplayName;
        }

        public final boolean getAllDay() {
            return this.allDay;
        }

        public final String getCalendarDisplayName() {
            return this.calendarDisplayName;
        }

        public final long getCalendarId() {
            return this.calendarId;
        }

        public final String getDescription() {
            return this.description;
        }

        public final Long getDtEnd() {
            return this.dtEnd;
        }

        public final long getDtStart() {
            return this.dtStart;
        }

        public final long getId() {
            return this.id;
        }

        public final String getLocation() {
            return this.location;
        }

        public final String getTimezone() {
            return this.timezone;
        }

        public final String getTitle() {
            return this.title;
        }

        public int hashCode() {
            return AnonymousClass005.A0I(this.calendarDisplayName, AnonymousClass006.A06(this.calendarId, (C0KA.A01((AnonymousClass006.A06(this.dtStart, (AnonymousClass005.A0I(this.title, AnonymousClass005.A07(this.id)) + AnonymousClass006.A0G(this.description)) * 31) + AnonymousClass006.A0D(this.dtEnd)) * 31, this.allDay) + AnonymousClass006.A0G(this.location)) * 31)) + AnonymousClass005.A0H(this.timezone);
        }

        public final JsonObject toJson() {
            C2nw c2nwA1K = C60O.A1K();
            C7qW.A05(Long.valueOf(this.id), "id", c2nwA1K);
            C7qW.A06("title", this.title, c2nwA1K);
            String str = this.description;
            if (str != null) {
                C7qW.A06(HatchWebPageParserKt.DESCRIPTION, str, c2nwA1K);
            }
            C7qW.A05(Long.valueOf(this.dtStart), "start_time", c2nwA1K);
            Long l = this.dtEnd;
            if (l != null) {
                C7qW.A05(l, "end_time", c2nwA1K);
            }
            C7qW.A04(Boolean.valueOf(this.allDay), "all_day", c2nwA1K);
            String str2 = this.location;
            if (str2 != null) {
                C7qW.A06(MarketplaceDetailsNormalizationKt.LOCATION_VARIANT_LABEL, str2, c2nwA1K);
            }
            C7qW.A05(Long.valueOf(this.calendarId), "calendar_id", c2nwA1K);
            C7qW.A06("calendar_name", this.calendarDisplayName, c2nwA1K);
            String str3 = this.timezone;
            if (str3 != null) {
                C7qW.A06(FeedRepositoryKt.TIMEZONE_PARAM, str3, c2nwA1K);
            }
            return c2nwA1K.A00();
        }

        public String toString() {
            return super.toString();
        }
    }

    public final class EventState {
        public final boolean allDay;
        public final Long dtEnd;
        public final Long dtStart;
        public final String rrule;

        public final boolean getAllDay() {
            return this.allDay;
        }

        public final Long getDtEnd() {
            return this.dtEnd;
        }

        public final Long getDtStart() {
            return this.dtStart;
        }

        public final String getRrule() {
            return this.rrule;
        }

        public EventState(String str, Long l, Long l2, boolean z) {
            this.rrule = str;
            this.dtStart = l;
            this.dtEnd = l2;
            this.allDay = z;
        }
    }

    public final class ReminderInfo extends C06G {
        public final long eventId;
        public final long id;
        public final int method;
        public final int minutesBefore;

        public static /* synthetic */ ReminderInfo copy$default(ReminderInfo reminderInfo, long j, long j2, int i, int i2, int i3, Object obj) {
            long j3 = j;
            long j4 = j2;
            int i4 = i;
            int i5 = i2;
            if ((i3 & 1) != 0) {
                j3 = reminderInfo.id;
            }
            if ((i3 & 2) != 0) {
                j4 = reminderInfo.eventId;
            }
            if ((i3 & 4) != 0) {
                i4 = reminderInfo.minutesBefore;
            }
            if ((i3 & 8) != 0) {
                i5 = reminderInfo.method;
            }
            return new ReminderInfo(j3, j4, i4, i5);
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof ReminderInfo) {
                    ReminderInfo reminderInfo = (ReminderInfo) obj;
                    if (this.id != reminderInfo.id || this.eventId != reminderInfo.eventId || this.minutesBefore != reminderInfo.minutesBefore || this.method != reminderInfo.method) {
                    }
                }
                return false;
            }
            return true;
        }

        public final long component1() {
            return this.id;
        }

        public final long component2() {
            return this.eventId;
        }

        public final int component3() {
            return this.minutesBefore;
        }

        public final int component4() {
            return this.method;
        }

        public final ReminderInfo copy(long j, long j2, int i, int i2) {
            return new ReminderInfo(j, j2, i, i2);
        }

        public final long getEventId() {
            return this.eventId;
        }

        public final long getId() {
            return this.id;
        }

        public final int getMethod() {
            return this.method;
        }

        public final int getMinutesBefore() {
            return this.minutesBefore;
        }

        public int hashCode() {
            return ((AnonymousClass006.A06(this.eventId, AnonymousClass005.A07(this.id)) + this.minutesBefore) * 31) + this.method;
        }

        public ReminderInfo(long j, long j2, int i, int i2) {
            this.id = j;
            this.eventId = j2;
            this.minutesBefore = i;
            this.method = i2;
        }

        public final JsonObject toJson() {
            C2nw c2nwA1K = C60O.A1K();
            C7qW.A05(Long.valueOf(this.id), "id", c2nwA1K);
            C7qW.A05(Long.valueOf(this.eventId), "event_id", c2nwA1K);
            C7qW.A05(Integer.valueOf(this.minutesBefore), "minutes_before", c2nwA1K);
            C7qW.A05(Integer.valueOf(this.method), AgeCheckFunnelLogging.KEY_METHOD, c2nwA1K);
            return c2nwA1K.A00();
        }

        public String toString() {
            return super.toString();
        }
    }

    public final class SearchRow extends C06G {
        public final long eventId;
        public final String organizer;
        public final CalendarEventPayloadJson payload;

        public SearchRow(CalendarEventPayloadJson calendarEventPayloadJson, long j, String str) {
            C7384Etj.A0Y(calendarEventPayloadJson, 0);
            this.payload = calendarEventPayloadJson;
            this.eventId = j;
            this.organizer = str;
        }

        public final SearchRow copy(CalendarEventPayloadJson calendarEventPayloadJson, long j, String str) {
            C7384Etj.A0Y(calendarEventPayloadJson, 0);
            return new SearchRow(calendarEventPayloadJson, j, str);
        }

        public static /* synthetic */ SearchRow copy$default(SearchRow searchRow, CalendarEventPayloadJson calendarEventPayloadJson, long j, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                calendarEventPayloadJson = searchRow.payload;
            }
            if ((i & 2) != 0) {
                j = searchRow.eventId;
            }
            if ((i & 4) != 0) {
                str = searchRow.organizer;
            }
            return searchRow.copy(calendarEventPayloadJson, j, str);
        }

        public final CalendarEventPayloadJson component1() {
            return this.payload;
        }

        public final long component2() {
            return this.eventId;
        }

        public final String component3() {
            return this.organizer;
        }

        public final long getEventId() {
            return this.eventId;
        }

        public final String getOrganizer() {
            return this.organizer;
        }

        public final CalendarEventPayloadJson getPayload() {
            return this.payload;
        }

        public boolean equals(Object obj) {
            return super.equals(obj);
        }

        public int hashCode() {
            return super.hashCode();
        }

        public String toString() {
            return super.toString();
        }
    }

    @DebugMetadata(c = "com.facebook.aura.commands.calendar.CalendarRepository$createEvent$2", f = "CalendarRepository.kt", l = {}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.commands.calendar.CalendarRepository$createEvent$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Long>, Object> {
        public final /* synthetic */ boolean $allDay;
        public final /* synthetic */ long $calendarId;
        public final /* synthetic */ String $description;
        public final /* synthetic */ Long $dtEnd;
        public final /* synthetic */ long $dtStart;
        public final /* synthetic */ String $duration;
        public final /* synthetic */ String $location;
        public final /* synthetic */ String $rrule;
        public final /* synthetic */ String $timezone;
        public final /* synthetic */ String $title;
        public int label;
        public final /* synthetic */ CalendarRepository this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(long j, String str, long j2, Long l, boolean z, String str2, String str3, String str4, String str5, String str6, CalendarRepository calendarRepository, HtJ<? super AnonymousClass2> htJ) {
            super(2, htJ);
            this.$calendarId = j;
            this.$title = str;
            this.$dtStart = j2;
            this.$dtEnd = l;
            this.$allDay = z;
            this.$description = str2;
            this.$location = str3;
            this.$timezone = str4;
            this.$rrule = str5;
            this.$duration = str6;
            this.this$0 = calendarRepository;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new AnonymousClass2(this.$calendarId, this.$title, this.$dtStart, this.$dtEnd, this.$allDay, this.$description, this.$location, this.$timezone, this.$rrule, this.$duration, this.this$0, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            String lastPathSegment;
            Long lA0s;
            if (this.label != 0) {
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(obj);
            long jLongValue = -1;
            try {
                Uri uriInsert = this.this$0.context.getContentResolver().insert(CalendarContract.Events.CONTENT_URI, CalendarRepository.Companion.buildEventValues$fbandroid_express_aura_java_com_facebook_aura_commands_calendar_calendar(this.$calendarId, this.$title, this.$dtStart, this.$dtEnd, this.$allDay, this.$description, this.$location, this.$timezone, this.$rrule, this.$duration));
                if (uriInsert != null && (lastPathSegment = uriInsert.getLastPathSegment()) != null && (lA0s = C9tI.A0s(lastPathSegment)) != null) {
                    jLongValue = lA0s.longValue();
                }
            } catch (Exception e) {
                AbstractC07127nr.A0H("Failed to create event: ", e.getMessage());
            }
            return C3cG.A0S(jLongValue);
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Long> htJ) {
            return ((AnonymousClass2) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.commands.calendar.CalendarRepository$deleteEvent$2", f = "CalendarRepository.kt", l = {}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.commands.calendar.CalendarRepository$deleteEvent$2, reason: invalid class name and case insensitive filesystem */
    public final class C110972 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Boolean>, Object> {
        public final /* synthetic */ long $eventId;
        public int label;
        public final /* synthetic */ CalendarRepository this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C110972(long j, CalendarRepository calendarRepository, HtJ<? super C110972> htJ) {
            super(2, htJ);
            this.$eventId = j;
            this.this$0 = calendarRepository;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new C110972(this.$eventId, this.this$0, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            if (this.label != 0) {
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(obj);
            boolean z = false;
            try {
                Uri uriWithAppendedId = ContentUris.withAppendedId(CalendarContract.Events.CONTENT_URI, this.$eventId);
                C7384Etj.A0U(uriWithAppendedId);
                if (AbstractC07127nr.A00(this.this$0).delete(uriWithAppendedId, null, null) > 0) {
                    z = true;
                }
            } catch (Exception e) {
                CFK.A04(CalendarRepositoryKt.TAG, FGI.A0L("Failed to delete event ", this.$eventId, ": ", e.getMessage()));
            }
            return Boolean.valueOf(z);
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Boolean> htJ) {
            return ((C110972) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.commands.calendar.CalendarRepository$deleteOccurrence$2", f = "CalendarRepository.kt", l = {}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.commands.calendar.CalendarRepository$deleteOccurrence$2, reason: invalid class name and case insensitive filesystem */
    public final class C110982 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Boolean>, Object> {
        public final /* synthetic */ long $eventId;
        public final /* synthetic */ long $occurrenceStartMs;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C110982(long j, long j2, HtJ<? super C110982> htJ) {
            super(2, htJ);
            this.$eventId = j;
            this.$occurrenceStartMs = j2;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return CalendarRepository.this.new C110982(this.$eventId, this.$occurrenceStartMs, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            if (this.label != 0) {
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(obj);
            ContentValues contentValues = new ContentValues();
            contentValues.put("originalInstanceTime", C3cG.A0S(this.$occurrenceStartMs));
            contentValues.put("eventStatus", C3cG.A0R(2));
            boolean z = false;
            try {
                if (AbstractC07127nr.A00(CalendarRepository.this).insert(ContentUris.withAppendedId(CalendarContract.Events.CONTENT_EXCEPTION_URI, this.$eventId), contentValues) != null) {
                    z = true;
                }
            } catch (Exception e) {
                long j = this.$eventId;
                long j2 = this.$occurrenceStartMs;
                String message = e.getMessage();
                StringBuilder sbA0z = C60O.A0z("Failed to delete occurrence of event ", j);
                sbA0z.append(" at ");
                sbA0z.append(j2);
                CFK.A04(CalendarRepositoryKt.TAG, C60P.A1M(": ", message, sbA0z));
            }
            return Boolean.valueOf(z);
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Boolean> htJ) {
            return ((C110982) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.commands.calendar.CalendarRepository", f = "CalendarRepository.kt", l = {176}, m = "getDefaultWritableCalendar", v = 2)
    /* renamed from: com.facebook.aura.commands.calendar.CalendarRepository$getDefaultWritableCalendar$1, reason: invalid class name */
    public final class AnonymousClass1 extends HzP {
        public Object L$0;
        public int label;
        public /* synthetic */ Object result;

        public AnonymousClass1(HtJ<? super AnonymousClass1> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return CalendarRepository.this.getDefaultWritableCalendar(this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.commands.calendar.CalendarRepository$getEventById$2", f = "CalendarRepository.kt", l = {}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.commands.calendar.CalendarRepository$getEventById$2, reason: invalid class name and case insensitive filesystem */
    public final class C110992 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super EventInfo>, Object> {
        public final /* synthetic */ long $eventId;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C110992(long j, HtJ<? super C110992> htJ) {
            super(2, htJ);
            this.$eventId = j;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return CalendarRepository.this.new C110992(this.$eventId, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EventInfo eventInfo;
            if (this.label != 0) {
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(obj);
            try {
                Cursor cursorQuery = AbstractC07127nr.A00(CalendarRepository.this).query(ContentUris.withAppendedId(CalendarContract.Events.CONTENT_URI, this.$eventId), new String[]{"title", HatchWebPageParserKt.DESCRIPTION, "dtstart", "dtend", "allDay", "eventLocation", "calendar_id", "calendar_displayName", "eventTimezone"}, null, null, null);
                if (cursorQuery == null) {
                    return null;
                }
                long j = this.$eventId;
                try {
                    if (cursorQuery.moveToFirst()) {
                        int columnIndexOrThrow = cursorQuery.getColumnIndexOrThrow("dtend");
                        String strA0c = C60Q.A0c(cursorQuery, "title");
                        if (strA0c == null) {
                            strA0c = "";
                        }
                        String strA0c2 = C60Q.A0c(cursorQuery, HatchWebPageParserKt.DESCRIPTION);
                        long j2 = cursorQuery.getLong(cursorQuery.getColumnIndexOrThrow("dtstart"));
                        Long lA0S = C3cG.A0S(cursorQuery.getLong(columnIndexOrThrow));
                        Long l = null;
                        if (!cursorQuery.isNull(columnIndexOrThrow)) {
                            l = lA0S;
                        }
                        boolean zA1Q = AnonymousClass002.A1Q(cursorQuery.getInt(cursorQuery.getColumnIndexOrThrow("allDay")), 1);
                        String strA0c3 = C60Q.A0c(cursorQuery, "eventLocation");
                        long j3 = cursorQuery.getLong(cursorQuery.getColumnIndexOrThrow("calendar_id"));
                        String strA0c4 = C60Q.A0c(cursorQuery, "calendar_displayName");
                        if (strA0c4 == null) {
                            strA0c4 = "";
                        }
                        eventInfo = new EventInfo(j, strA0c, strA0c2, j2, l, zA1Q, strA0c3, j3, strA0c4, C60Q.A0c(cursorQuery, "eventTimezone"));
                    } else {
                        eventInfo = null;
                    }
                    cursorQuery.close();
                    return eventInfo;
                } finally {
                }
            } catch (Exception e) {
                CFK.A04(CalendarRepositoryKt.TAG, FGI.A0L("Failed to get event ", this.$eventId, ": ", e.getMessage()));
                return null;
            }
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super EventInfo> htJ) {
            return ((C110992) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.commands.calendar.CalendarRepository$getReminders$2", f = "CalendarRepository.kt", l = {}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.commands.calendar.CalendarRepository$getReminders$2, reason: invalid class name and case insensitive filesystem */
    public final class C111002 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super List<ReminderInfo>>, Object> {
        public final /* synthetic */ long $eventId;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C111002(long j, HtJ<? super C111002> htJ) {
            super(2, htJ);
            this.$eventId = j;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return CalendarRepository.this.new C111002(this.$eventId, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            if (this.label != 0) {
                throw AnonymousClass001.A0n();
            }
            ArrayList arrayListA12 = C60O.A12(obj);
            try {
                Cursor cursorQuery = AbstractC07127nr.A00(CalendarRepository.this).query(CalendarContract.Reminders.CONTENT_URI, new String[]{"_id", "event_id", "minutes", AgeCheckFunnelLogging.KEY_METHOD}, "event_id = ?", new String[]{String.valueOf(this.$eventId)}, null);
                if (cursorQuery == null) {
                    return arrayListA12;
                }
                try {
                    int columnIndexOrThrow = cursorQuery.getColumnIndexOrThrow("_id");
                    int columnIndexOrThrow2 = cursorQuery.getColumnIndexOrThrow("event_id");
                    int columnIndexOrThrow3 = cursorQuery.getColumnIndexOrThrow("minutes");
                    int columnIndexOrThrow4 = cursorQuery.getColumnIndexOrThrow(AgeCheckFunnelLogging.KEY_METHOD);
                    while (cursorQuery.moveToNext()) {
                        arrayListA12.add(new ReminderInfo(cursorQuery.getLong(columnIndexOrThrow), cursorQuery.getLong(columnIndexOrThrow2), cursorQuery.getInt(columnIndexOrThrow3), cursorQuery.getInt(columnIndexOrThrow4)));
                    }
                    cursorQuery.close();
                    return arrayListA12;
                } finally {
                }
            } catch (Exception e) {
                CFK.A04(CalendarRepositoryKt.TAG, FGI.A0L("Failed to get reminders for event ", this.$eventId, ": ", e.getMessage()));
                return arrayListA12;
            }
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super List<ReminderInfo>> htJ) {
            return ((C111002) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.commands.calendar.CalendarRepository", f = "CalendarRepository.kt", l = {169}, m = "getWritableCalendar", v = 2)
    /* renamed from: com.facebook.aura.commands.calendar.CalendarRepository$getWritableCalendar$1, reason: invalid class name and case insensitive filesystem */
    public final class C111011 extends HzP {
        public long J$0;
        public int label;
        public /* synthetic */ Object result;

        public C111011(HtJ<? super C111011> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return CalendarRepository.this.getWritableCalendar(0L, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.commands.calendar.CalendarRepository$listEvents$2", f = "CalendarRepository.kt", l = {}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.commands.calendar.CalendarRepository$listEvents$2, reason: invalid class name and case insensitive filesystem */
    public final class C111022 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super List<EventInfo>>, Object> {
        public final /* synthetic */ Long $calendarId;
        public final /* synthetic */ long $endTime;
        public final /* synthetic */ int $maxResults;
        public final /* synthetic */ long $startTime;
        public int label;
        public final /* synthetic */ CalendarRepository this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C111022(Long l, CalendarRepository calendarRepository, long j, long j2, int i, HtJ<? super C111022> htJ) {
            super(2, htJ);
            this.$calendarId = l;
            this.this$0 = calendarRepository;
            this.$startTime = j;
            this.$endTime = j2;
            this.$maxResults = i;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new C111022(this.$calendarId, this.this$0, this.$startTime, this.$endTime, this.$maxResults, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            if (this.label != 0) {
                throw AnonymousClass001.A0n();
            }
            ArrayList arrayListA12 = C60O.A12(obj);
            Uri.Builder builderBuildUpon = CalendarContract.Instances.CONTENT_URI.buildUpon();
            long j = this.$startTime;
            long j2 = this.$endTime;
            ContentUris.appendId(builderBuildUpon, j);
            ContentUris.appendId(builderBuildUpon, j2);
            String[] strArr = {"event_id", "title", HatchWebPageParserKt.DESCRIPTION, "begin", "end", "allDay", "eventLocation", "calendar_id", "calendar_displayName", "eventTimezone"};
            Long l = this.$calendarId;
            try {
                Cursor cursorQuery = AbstractC07127nr.A00(this.this$0).query(builderBuildUpon.build(), strArr, l != null ? "calendar_id = ?" : null, l != null ? C60Q.A1a(l.longValue()) : null, "begin ASC");
                if (cursorQuery != null) {
                    int i = this.$maxResults;
                    try {
                        int columnIndexOrThrow = cursorQuery.getColumnIndexOrThrow("event_id");
                        int columnIndexOrThrow2 = cursorQuery.getColumnIndexOrThrow("title");
                        int columnIndexOrThrow3 = cursorQuery.getColumnIndexOrThrow(HatchWebPageParserKt.DESCRIPTION);
                        int columnIndexOrThrow4 = cursorQuery.getColumnIndexOrThrow("begin");
                        int columnIndexOrThrow5 = cursorQuery.getColumnIndexOrThrow("end");
                        int columnIndexOrThrow6 = cursorQuery.getColumnIndexOrThrow("allDay");
                        int columnIndexOrThrow7 = cursorQuery.getColumnIndexOrThrow("eventLocation");
                        int columnIndexOrThrow8 = cursorQuery.getColumnIndexOrThrow("calendar_id");
                        int columnIndexOrThrow9 = cursorQuery.getColumnIndexOrThrow("calendar_displayName");
                        int columnIndexOrThrow10 = cursorQuery.getColumnIndexOrThrow("eventTimezone");
                        for (int i2 = 0; cursorQuery.moveToNext() && i2 < i; i2++) {
                            long j3 = cursorQuery.getLong(columnIndexOrThrow);
                            String string = cursorQuery.getString(columnIndexOrThrow2);
                            if (string == null) {
                                string = "";
                            }
                            String string2 = cursorQuery.getString(columnIndexOrThrow3);
                            long j4 = cursorQuery.getLong(columnIndexOrThrow4);
                            Long lA0S = cursorQuery.isNull(columnIndexOrThrow5) ? null : C3cG.A0S(cursorQuery.getLong(columnIndexOrThrow5));
                            boolean zA1Q = AnonymousClass002.A1Q(cursorQuery.getInt(columnIndexOrThrow6), 1);
                            String string3 = cursorQuery.getString(columnIndexOrThrow7);
                            long j5 = cursorQuery.getLong(columnIndexOrThrow8);
                            String string4 = cursorQuery.getString(columnIndexOrThrow9);
                            if (string4 == null) {
                                string4 = "";
                            }
                            arrayListA12.add(new EventInfo(j3, string, string2, j4, lA0S, zA1Q, string3, j5, string4, cursorQuery.getString(columnIndexOrThrow10)));
                        }
                        cursorQuery.close();
                        return arrayListA12;
                    } finally {
                    }
                }
            } catch (Exception e) {
                AbstractC07127nr.A0H("Failed to list events: ", e.getMessage());
            }
            return arrayListA12;
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super List<EventInfo>> htJ) {
            return ((C111022) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.commands.calendar.CalendarRepository$queryCalendars$2", f = "CalendarRepository.kt", l = {}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.commands.calendar.CalendarRepository$queryCalendars$2, reason: invalid class name and case insensitive filesystem */
    public final class C111032 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super List<CalendarInfo>>, Object> {
        public final /* synthetic */ String $selection;
        public final /* synthetic */ String[] $selectionArgs;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C111032(String str, String[] strArr, HtJ<? super C111032> htJ) {
            super(2, htJ);
            this.$selection = str;
            this.$selectionArgs = strArr;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return CalendarRepository.this.new C111032(this.$selection, this.$selectionArgs, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            if (this.label != 0) {
                throw AnonymousClass001.A0n();
            }
            ArrayList arrayListA12 = C60O.A12(obj);
            try {
                Cursor cursorQuery = AbstractC07127nr.A00(CalendarRepository.this).query(CalendarContract.Calendars.CONTENT_URI, CalendarRepository.CALENDAR_PROJECTION, this.$selection, this.$selectionArgs, null);
                if (cursorQuery == null) {
                    return arrayListA12;
                }
                CalendarRepository calendarRepository = CalendarRepository.this;
                while (cursorQuery.moveToNext()) {
                    try {
                        arrayListA12.add(calendarRepository.toCalendarInfo(cursorQuery));
                    } finally {
                    }
                }
                cursorQuery.close();
                return arrayListA12;
            } catch (Exception e) {
                AbstractC07127nr.A0H("Failed to query calendars: ", e.getMessage());
                return arrayListA12;
            }
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super List<CalendarInfo>> htJ) {
            return ((C111032) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.commands.calendar.CalendarRepository$removeReminder$2", f = "CalendarRepository.kt", l = {}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.commands.calendar.CalendarRepository$removeReminder$2, reason: invalid class name and case insensitive filesystem */
    public final class C111042 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Integer>, Object> {
        public final /* synthetic */ long $eventId;
        public final /* synthetic */ Integer $minutesBefore;
        public int label;
        public final /* synthetic */ CalendarRepository this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C111042(Integer num, long j, CalendarRepository calendarRepository, HtJ<? super C111042> htJ) {
            super(2, htJ);
            this.$minutesBefore = num;
            this.$eventId = j;
            this.this$0 = calendarRepository;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new C111042(this.$minutesBefore, this.$eventId, this.this$0, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            if (this.label != 0) {
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(obj);
            Integer num = this.$minutesBefore;
            String str = num == null ? "event_id = ?" : "event_id = ? AND minutes = ?";
            long j = this.$eventId;
            int iDelete = 0;
            try {
                iDelete = AbstractC07127nr.A00(this.this$0).delete(CalendarContract.Reminders.CONTENT_URI, str, num == null ? C60Q.A1a(j) : new String[]{String.valueOf(j), String.valueOf(num.intValue())});
            } catch (Exception e) {
                CFK.A04(CalendarRepositoryKt.TAG, FGI.A0L("Failed to remove reminders for event ", this.$eventId, ": ", e.getMessage()));
            }
            return C3cG.A0R(iDelete);
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Integer> htJ) {
            return ((C111042) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.commands.calendar.CalendarRepository$setReminder$2", f = "CalendarRepository.kt", l = {}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.commands.calendar.CalendarRepository$setReminder$2, reason: invalid class name and case insensitive filesystem */
    public final class C111052 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Long>, Object> {
        public final /* synthetic */ long $eventId;
        public final /* synthetic */ int $method;
        public final /* synthetic */ int $minutesBefore;
        public final /* synthetic */ boolean $replace;
        public int label;
        public final /* synthetic */ CalendarRepository this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C111052(boolean z, CalendarRepository calendarRepository, long j, int i, int i2, HtJ<? super C111052> htJ) {
            super(2, htJ);
            this.$replace = z;
            this.this$0 = calendarRepository;
            this.$eventId = j;
            this.$minutesBefore = i;
            this.$method = i2;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new C111052(this.$replace, this.this$0, this.$eventId, this.$minutesBefore, this.$method, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            String lastPathSegment;
            if (this.label != 0) {
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(obj);
            if (this.$replace) {
                try {
                    AbstractC07127nr.A00(this.this$0).delete(CalendarContract.Reminders.CONTENT_URI, "event_id = ?", new String[]{String.valueOf(this.$eventId)});
                } catch (Exception e) {
                    CFK.A06(CalendarRepositoryKt.TAG, FGI.A0L("Failed to clear existing reminders for event ", this.$eventId, ": ", e.getMessage()));
                }
            }
            ContentValues contentValues = new ContentValues();
            long j = this.$eventId;
            int i = this.$minutesBefore;
            int i2 = this.$method;
            contentValues.put("event_id", C3cG.A0S(j));
            AbstractC07127nr.A0A(contentValues, "minutes", i);
            AbstractC07127nr.A0A(contentValues, AgeCheckFunnelLogging.KEY_METHOD, i2);
            Long lA0s = null;
            try {
                Uri uriInsert = AbstractC07127nr.A00(this.this$0).insert(CalendarContract.Reminders.CONTENT_URI, contentValues);
                if (uriInsert != null && (lastPathSegment = uriInsert.getLastPathSegment()) != null) {
                    lA0s = C9tI.A0s(lastPathSegment);
                    return lA0s;
                }
            } catch (Exception e2) {
                CFK.A04(CalendarRepositoryKt.TAG, FGI.A0L("Failed to set reminder for event ", this.$eventId, ": ", e2.getMessage()));
            }
            return lA0s;
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Long> htJ) {
            return ((C111052) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.commands.calendar.CalendarRepository$updateEvent$2", f = "CalendarRepository.kt", l = {}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.commands.calendar.CalendarRepository$updateEvent$2, reason: invalid class name and case insensitive filesystem */
    public final class C111062 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Boolean>, Object> {
        public final /* synthetic */ Boolean $allDay;
        public final /* synthetic */ Long $calendarId;
        public final /* synthetic */ String $description;
        public final /* synthetic */ Long $dtEnd;
        public final /* synthetic */ Long $dtStart;
        public final /* synthetic */ String $duration;
        public final /* synthetic */ long $eventId;
        public final /* synthetic */ String $location;
        public final /* synthetic */ String $rrule;
        public final /* synthetic */ String $timezone;
        public final /* synthetic */ String $title;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C111062(long j, Boolean bool, String str, String str2, Long l, String str3, Long l2, String str4, String str5, String str6, Long l3, HtJ<? super C111062> htJ) {
            super(2, htJ);
            this.$eventId = j;
            this.$allDay = bool;
            this.$rrule = str;
            this.$title = str2;
            this.$dtStart = l;
            this.$duration = str3;
            this.$dtEnd = l2;
            this.$description = str4;
            this.$location = str5;
            this.$timezone = str6;
            this.$calendarId = l3;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return CalendarRepository.this.new C111062(this.$eventId, this.$allDay, this.$rrule, this.$title, this.$dtStart, this.$duration, this.$dtEnd, this.$description, this.$location, this.$timezone, this.$calendarId, htJ);
        }

        /* JADX WARN: Removed duplicated region for block: B:71:0x00e9 A[PHI: r0
  0x00e9: PHI (r0v8 java.lang.Boolean) = (r0v7 java.lang.Boolean), (r0v45 java.lang.Boolean) binds: [B:7:0x0015, B:10:0x001f] A[DONT_GENERATE, DONT_INLINE]] */
        @Override // X.AbstractC8884Fsp
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r12) {
            /*
                Method dump skipped, instructions count: 318
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.commands.calendar.CalendarRepository.C111062.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Boolean> htJ) {
            return ((C111062) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.commands.calendar.CalendarRepository$updateOccurrence$2", f = "CalendarRepository.kt", l = {850}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.commands.calendar.CalendarRepository$updateOccurrence$2, reason: invalid class name and case insensitive filesystem */
    public final class C111072 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Long>, Object> {
        public final /* synthetic */ Boolean $allDay;
        public final /* synthetic */ String $description;
        public final /* synthetic */ Long $dtEnd;
        public final /* synthetic */ Long $dtStart;
        public final /* synthetic */ long $eventId;
        public final /* synthetic */ String $location;
        public final /* synthetic */ long $occurrenceStartMs;
        public final /* synthetic */ String $title;
        public long J$0;
        public int label;
        public final /* synthetic */ CalendarRepository this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C111072(Long l, long j, CalendarRepository calendarRepository, long j2, Boolean bool, Long l2, String str, String str2, String str3, HtJ<? super C111072> htJ) {
            super(2, htJ);
            this.$dtStart = l;
            this.$occurrenceStartMs = j;
            this.this$0 = calendarRepository;
            this.$eventId = j2;
            this.$allDay = bool;
            this.$dtEnd = l2;
            this.$title = str;
            this.$description = str2;
            this.$location = str3;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new C111072(this.$dtStart, this.$occurrenceStartMs, this.this$0, this.$eventId, this.$allDay, this.$dtEnd, this.$title, this.$description, this.$location, htJ);
        }

        /* JADX WARN: Removed duplicated region for block: B:18:0x003a A[PHI: r8
  0x003a: PHI (r8v2 java.lang.Long) = (r8v0 java.lang.Long), (r8v4 java.lang.Long) binds: [B:36:0x00be, B:17:0x0038] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:35:0x00b4  */
        /* JADX WARN: Removed duplicated region for block: B:46:0x00e3 A[PHI: r0
  0x00e3: PHI (r0v4 java.lang.Boolean) = (r0v3 java.lang.Boolean), (r0v42 java.lang.Boolean) binds: [B:7:0x0013, B:10:0x001d] A[DONT_GENERATE, DONT_INLINE]] */
        @Override // X.AbstractC8884Fsp
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r15) {
            /*
                Method dump skipped, instructions count: 328
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.commands.calendar.CalendarRepository.C111072.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Long> htJ) {
            return ((C111072) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    public final Object listCalendars(HtJ<? super List<CalendarInfo>> htJ) {
        return queryCalendars(visibleSyncingWritableSelection(null), new String[]{"LOCAL"}, htJ);
    }

    static {
        String[] strArr = {"event_id", "title", HatchWebPageParserKt.DESCRIPTION, "begin", "end", "allDay", "eventLocation", "calendar_id", "calendar_displayName", "eventTimezone", "rrule", "availability", "eventStatus", "calendar_color"};
        SYNC_EVENT_PROJECTION = strArr;
        Object[] objArrCopyOf = Arrays.copyOf(strArr, 15);
        objArrCopyOf[14] = "organizer";
        SEARCH_EVENT_PROJECTION = (String[]) objArrCopyOf;
        DateTimeFormatter dateTimeFormatterWithZone = DateTimeFormatter.ofPattern("yyyy-MM-dd").withZone(ZoneOffset.UTC);
        C7384Etj.A0U(dateTimeFormatterWithZone);
        LOCAL_DATE_UTC = dateTimeFormatterWithZone;
        DateTimeFormatter dateTimeFormatterOfPattern = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss");
        C7384Etj.A0U(dateTimeFormatterOfPattern);
        LOCAL_DATE_TIME = dateTimeFormatterOfPattern;
    }

    public static final /* synthetic */ String access$defaultRecurringDuration(CalendarRepository calendarRepository, boolean z) {
        return z ? "P1D" : "PT1H";
    }

    public static /* synthetic */ Object createEvent$default(CalendarRepository calendarRepository, long j, String str, long j2, Long l, boolean z, String str2, String str3, String str4, String str5, String str6, HtJ htJ, int i, Object obj) {
        boolean zA1S = C3cI.A1S(i, z);
        if ((i & 32) != 0) {
            str2 = null;
        }
        if ((i & 64) != 0) {
            str3 = null;
        }
        if ((i & 128) != 0) {
            str4 = null;
        }
        if ((i & 256) != 0) {
            str5 = null;
        }
        if ((i & 512) != 0) {
            str6 = null;
        }
        return calendarRepository.createEvent(j, str, j2, l, zA1S, str2, str3, str4, str5, str6, htJ);
    }

    private final String defaultRecurringDuration(boolean z) {
        return z ? "P1D" : "PT1H";
    }

    private final CalendarInfo defaultWritableCalendar(List<CalendarInfo> list) {
        CalendarInfo next;
        final Comparator comparator = new Comparator() { // from class: com.facebook.aura.commands.calendar.CalendarRepository$defaultWritableCalendar$$inlined$compareByDescending$1
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:6:0x0014  */
            @Override // java.util.Comparator
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final int compare(T r4, T r5) {
                /*
                    r3 = this;
                    com.facebook.aura.commands.calendar.CalendarRepository$CalendarInfo r5 = (com.facebook.aura.commands.calendar.CalendarRepository.CalendarInfo) r5
                    java.lang.String r1 = r5.accountName
                    int r0 = r1.length()
                    r3 = 1
                    if (r0 <= 0) goto L14
                    java.lang.String r0 = r5.ownerAccount
                    boolean r1 = r1.equals(r0)
                    r0 = 1
                    if (r1 != 0) goto L15
                L14:
                    r0 = 0
                L15:
                    java.lang.Boolean r2 = java.lang.Boolean.valueOf(r0)
                    com.facebook.aura.commands.calendar.CalendarRepository$CalendarInfo r4 = (com.facebook.aura.commands.calendar.CalendarRepository.CalendarInfo) r4
                    java.lang.String r1 = r4.accountName
                    int r0 = r1.length()
                    if (r0 <= 0) goto L34
                    java.lang.String r0 = r4.ownerAccount
                    boolean r0 = r1.equals(r0)
                    if (r0 == 0) goto L34
                L2b:
                    java.lang.Boolean r0 = java.lang.Boolean.valueOf(r3)
                    int r0 = r2.compareTo(r0)
                    return r0
                L34:
                    r3 = 0
                    goto L2b
                */
                throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.commands.calendar.CalendarRepository$defaultWritableCalendar$$inlined$compareByDescending$1.compare(java.lang.Object, java.lang.Object):int");
            }
        };
        final Comparator comparator2 = new Comparator() { // from class: com.facebook.aura.commands.calendar.CalendarRepository$defaultWritableCalendar$$inlined$thenByDescending$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                int iCompare = comparator.compare(t, t2);
                return iCompare == 0 ? Boolean.valueOf(((CalendarRepository.CalendarInfo) t2).isPrimary).compareTo(Boolean.valueOf(((CalendarRepository.CalendarInfo) t).isPrimary)) : iCompare;
            }
        };
        final Comparator comparator3 = new Comparator() { // from class: com.facebook.aura.commands.calendar.CalendarRepository$defaultWritableCalendar$$inlined$thenBy$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                int iCompare = comparator2.compare(t, t2);
                return iCompare == 0 ? Integer.valueOf(this.providerRank(((CalendarRepository.CalendarInfo) t).accountType)).compareTo(Integer.valueOf(this.providerRank(((CalendarRepository.CalendarInfo) t2).accountType))) : iCompare;
            }
        };
        final Comparator comparator4 = new Comparator() { // from class: com.facebook.aura.commands.calendar.CalendarRepository$defaultWritableCalendar$$inlined$thenBy$2
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                int iCompare = comparator3.compare(t, t2);
                if (iCompare != 0) {
                    return iCompare;
                }
                String str = ((CalendarRepository.CalendarInfo) t).displayName;
                Locale locale = Locale.ROOT;
                return str.toLowerCase(locale).compareTo(((CalendarRepository.CalendarInfo) t2).displayName.toLowerCase(locale));
            }
        };
        Comparator comparator5 = new Comparator() { // from class: com.facebook.aura.commands.calendar.CalendarRepository$defaultWritableCalendar$$inlined$thenBy$3
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                int iCompare = comparator4.compare(t, t2);
                return iCompare == 0 ? C60Q.A01(Long.valueOf(((CalendarRepository.CalendarInfo) t).id), ((CalendarRepository.CalendarInfo) t2).id) : iCompare;
            }
        };
        C7384Etj.A0Y(list, 0);
        Iterator<CalendarInfo> it = list.iterator();
        if (it.hasNext()) {
            next = it.next();
            while (it.hasNext()) {
                CalendarInfo next2 = it.next();
                if (comparator5.compare(next, next2) > 0) {
                    next = next2;
                }
            }
        } else {
            next = null;
        }
        return next;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Long instanceDurationMs(long j, long j2) {
        Uri.Builder builderBuildUpon = CalendarContract.Instances.CONTENT_URI.buildUpon();
        long j3 = j2 - 86400000;
        ContentUris.appendId(builderBuildUpon, j3);
        ContentUris.appendId(builderBuildUpon, 86400000 + j2);
        try {
            j3 = j;
            Cursor cursorQuery = this.context.getContentResolver().query(builderBuildUpon.build(), new String[]{"begin", "end"}, "event_id = ?", new String[]{String.valueOf(j3)}, null);
            if (cursorQuery == null) {
                return null;
            }
            try {
                int columnIndexOrThrow = cursorQuery.getColumnIndexOrThrow("begin");
                int columnIndexOrThrow2 = cursorQuery.getColumnIndexOrThrow("end");
                long j4 = LinkEncryptedPairingKt.LINK_COUNTER_MAX;
                Long lValueOf = null;
                while (cursorQuery.moveToNext()) {
                    long j5 = cursorQuery.getLong(columnIndexOrThrow);
                    long jAbs = Math.abs(j5 - j2);
                    if (jAbs < j4) {
                        lValueOf = Long.valueOf(cursorQuery.getLong(columnIndexOrThrow2) - j5);
                        j4 = jAbs;
                    }
                }
                cursorQuery.close();
                return lValueOf;
            } finally {
            }
        } catch (Exception e) {
            String message = e.getMessage();
            StringBuilder sbA0z = C60O.A0z("Failed to read instance length for event ", j3);
            sbA0z.append(" at ");
            sbA0z.append(j2);
            CFK.A06(CalendarRepositoryKt.TAG, C60P.A1M(": ", message, sbA0z));
            return null;
        }
    }

    public static /* synthetic */ Object listEvents$default(CalendarRepository calendarRepository, Long l, long j, long j2, int i, HtJ htJ, int i2, Object obj) {
        if ((i2 & 8) != 0) {
            i = 50;
        }
        return calendarRepository.listEvents(l, j, j2, i, htJ);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final EventState readEventState(long j) {
        EventState eventState = null;
        Cursor cursorQuery = this.context.getContentResolver().query(ContentUris.withAppendedId(CalendarContract.Events.CONTENT_URI, j), new String[]{"rrule", "dtstart", "dtend", "allDay"}, null, null, null);
        if (cursorQuery == null) {
            return null;
        }
        try {
            if (cursorQuery.moveToFirst()) {
                int columnIndexOrThrow = cursorQuery.getColumnIndexOrThrow("dtstart");
                int columnIndexOrThrow2 = cursorQuery.getColumnIndexOrThrow("dtend");
                eventState = new EventState(C60Q.A0c(cursorQuery, "rrule"), cursorQuery.isNull(columnIndexOrThrow) ? null : Long.valueOf(cursorQuery.getLong(columnIndexOrThrow)), cursorQuery.isNull(columnIndexOrThrow2) ? null : Long.valueOf(cursorQuery.getLong(columnIndexOrThrow2)), cursorQuery.getInt(cursorQuery.getColumnIndexOrThrow("allDay")) == 1);
            }
            cursorQuery.close();
            return eventState;
        } finally {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String recurringDurationFor(Long l, Long l2, boolean z) {
        if (l == null || l2 == null) {
            return null;
        }
        long jLongValue = l2.longValue();
        long jLongValue2 = l.longValue();
        if (jLongValue <= jLongValue2) {
            return null;
        }
        long j = jLongValue - jLongValue2;
        return z ? FGI.A0J("P", Math.max(1L, Math.round(j / 8.64E7d)), "D") : Duration.ofMillis(j).toString();
    }

    public static /* synthetic */ Object removeReminder$default(CalendarRepository calendarRepository, long j, Integer num, HtJ htJ, int i, Object obj) {
        if ((i & 2) != 0) {
            num = null;
        }
        return calendarRepository.removeReminder(j, num, htJ);
    }

    public static /* synthetic */ Object setReminder$default(CalendarRepository calendarRepository, long j, int i, int i2, boolean z, HtJ htJ, int i3, Object obj) {
        if ((i3 & 4) != 0) {
            i2 = 1;
        }
        if ((i3 & 8) != 0) {
            z = true;
        }
        return calendarRepository.setReminder(j, i, i2, z, htJ);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final CalendarInfo toCalendarInfo(Cursor cursor) {
        long j = cursor.getLong(cursor.getColumnIndexOrThrow("_id"));
        String strA0c = C60Q.A0c(cursor, "calendar_displayName");
        if (strA0c == null) {
            strA0c = "";
        }
        String strA0c2 = C60Q.A0c(cursor, "account_name");
        if (strA0c2 == null) {
            strA0c2 = "";
        }
        String strA0c3 = C60Q.A0c(cursor, "ownerAccount");
        if (strA0c3 == null) {
            strA0c3 = "";
        }
        String strA0c4 = C60Q.A0c(cursor, "account_type");
        return new CalendarInfo(j, strA0c, strA0c2, strA0c3, strA0c4 != null ? strA0c4 : "", AnonymousClass002.A1Q(cursor.getInt(cursor.getColumnIndexOrThrow("isPrimary")), 1), cursor.getInt(cursor.getColumnIndexOrThrow("calendar_color")));
    }

    public static /* synthetic */ Object updateEvent$default(CalendarRepository calendarRepository, long j, String str, Long l, Long l2, Boolean bool, String str2, String str3, String str4, String str5, String str6, Long l3, HtJ htJ, int i, Object obj) {
        if ((i & 2) != 0) {
            str = null;
        }
        if ((i & 4) != 0) {
            l = null;
        }
        if ((i & 8) != 0) {
            l2 = null;
        }
        if ((i & 16) != 0) {
            bool = null;
        }
        if ((i & 32) != 0) {
            str2 = null;
        }
        if ((i & 64) != 0) {
            str3 = null;
        }
        if ((i & 128) != 0) {
            str4 = null;
        }
        if ((i & 256) != 0) {
            str5 = null;
        }
        if ((i & 512) != 0) {
            str6 = null;
        }
        if ((i & 1024) != 0) {
            l3 = null;
        }
        return calendarRepository.updateEvent(j, str, l, l2, bool, str2, str3, str4, str5, str6, l3, htJ);
    }

    public static /* synthetic */ Object updateOccurrence$default(CalendarRepository calendarRepository, long j, long j2, String str, Long l, Long l2, Boolean bool, String str2, String str3, HtJ htJ, int i, Object obj) {
        if ((i & 4) != 0) {
            str = null;
        }
        if ((i & 8) != 0) {
            l = null;
        }
        if ((i & 16) != 0) {
            l2 = null;
        }
        if ((i & 32) != 0) {
            bool = null;
        }
        if ((i & 64) != 0) {
            str2 = null;
        }
        if ((i & 128) != 0) {
            str3 = null;
        }
        return calendarRepository.updateOccurrence(j, j2, str, l, l2, bool, str2, str3, htJ);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String visibleSyncingWritableSelection(String str) {
        return C3cH.A0e(" AND ", BFI.A0F(new String[]{str, "visible = 1", "sync_events = 1", "calendar_access_level >= 500", "account_type != ?"}));
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0039  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object getDefaultWritableCalendar(X.HtJ<? super com.facebook.aura.commands.calendar.CalendarRepository.CalendarInfo> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof com.facebook.aura.commands.calendar.CalendarRepository.AnonymousClass1
            if (r0 == 0) goto L39
            r4 = r6
            com.facebook.aura.commands.calendar.CalendarRepository$getDefaultWritableCalendar$1 r4 = (com.facebook.aura.commands.calendar.CalendarRepository.AnonymousClass1) r4
            int r2 = r4.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L39
            int r2 = r2 - r1
            r4.label = r2
        L12:
            java.lang.Object r3 = r4.result
            X.Hji r2 = X.EnumC10460Hji.A02
            int r1 = r4.label
            r0 = 1
            if (r1 == 0) goto L2b
            if (r1 != r0) goto L3f
            java.lang.Object r5 = r4.L$0
            com.facebook.aura.commands.calendar.CalendarRepository r5 = (com.facebook.aura.commands.calendar.CalendarRepository) r5
            X.Hwg.A00(r3)
        L24:
            java.util.List r3 = (java.util.List) r3
            com.facebook.aura.commands.calendar.CalendarRepository$CalendarInfo r0 = r5.defaultWritableCalendar(r3)
            return r0
        L2b:
            X.Hwg.A00(r3)
            r4.L$0 = r5
            r4.label = r0
            java.lang.Object r3 = r5.listCalendars(r4)
            if (r3 != r2) goto L24
            return r2
        L39:
            com.facebook.aura.commands.calendar.CalendarRepository$getDefaultWritableCalendar$1 r4 = new com.facebook.aura.commands.calendar.CalendarRepository$getDefaultWritableCalendar$1
            r4.<init>(r6)
            goto L12
        L3f:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.commands.calendar.CalendarRepository.getDefaultWritableCalendar(X.HtJ):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0045  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object getWritableCalendar(long r7, X.HtJ<? super com.facebook.aura.commands.calendar.CalendarRepository.CalendarInfo> r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof com.facebook.aura.commands.calendar.CalendarRepository.C111011
            if (r0 == 0) goto L45
            r5 = r9
            com.facebook.aura.commands.calendar.CalendarRepository$getWritableCalendar$1 r5 = (com.facebook.aura.commands.calendar.CalendarRepository.C111011) r5
            int r2 = r5.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L45
            int r2 = r2 - r1
            r5.label = r2
        L12:
            java.lang.Object r1 = r5.result
            X.Hji r4 = X.EnumC10460Hji.A02
            int r0 = r5.label
            r3 = 1
            if (r0 == 0) goto L27
            if (r0 != r3) goto L4b
            X.Hwg.A00(r1)
        L20:
            java.util.List r1 = (java.util.List) r1
            java.lang.Object r0 = X.AbstractC0878AGe.A0G(r1)
            return r0
        L27:
            X.Hwg.A00(r1)
            java.lang.String r0 = "_id = ?"
            java.lang.String r2 = r6.visibleSyncingWritableSelection(r0)
            java.lang.String r1 = java.lang.String.valueOf(r7)
            java.lang.String r0 = "LOCAL"
            java.lang.String[] r0 = new java.lang.String[]{r1, r0}
            r5.J$0 = r7
            r5.label = r3
            java.lang.Object r1 = r6.queryCalendars(r2, r0, r5)
            if (r1 != r4) goto L20
            return r4
        L45:
            com.facebook.aura.commands.calendar.CalendarRepository$getWritableCalendar$1 r5 = new com.facebook.aura.commands.calendar.CalendarRepository$getWritableCalendar$1
            r5.<init>(r9)
            goto L12
        L4b:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.commands.calendar.CalendarRepository.getWritableCalendar(long, X.HtJ):java.lang.Object");
    }

    public CalendarRepository(Context context) {
        this.context = context;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:4:0x000b A[ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int providerRank(java.lang.String r1) {
        /*
            r0 = this;
            java.lang.String r1 = com.facebook.aura.commands.calendar.CalendarRepositoryKt.providerOf(r1)
            int r0 = r1.hashCode()
            switch(r0) {
                case -1223702708: goto L35;
                case -765372454: goto L2d;
                case 85186592: goto L25;
                case 558413517: goto L1d;
                case 2054419011: goto L15;
                case 2138589785: goto Ld;
                default: goto Lb;
            }
        Lb:
            r1 = 6
        Lc:
            return r1
        Ld:
            java.lang.String r0 = "Google"
            boolean r0 = r1.equals(r0)
            r1 = 0
            goto L3c
        L15:
            java.lang.String r0 = "Exchange"
            boolean r0 = r1.equals(r0)
            r1 = 2
            goto L3c
        L1d:
            java.lang.String r0 = "Outlook"
            boolean r0 = r1.equals(r0)
            r1 = 1
            goto L3c
        L25:
            java.lang.String r0 = "Yahoo"
            boolean r0 = r1.equals(r0)
            r1 = 4
            goto L3c
        L2d:
            java.lang.String r0 = "Samsung"
            boolean r0 = r1.equals(r0)
            r1 = 5
            goto L3c
        L35:
            java.lang.String r0 = "iCloud"
            boolean r0 = r1.equals(r0)
            r1 = 3
        L3c:
            if (r0 != 0) goto Lc
            goto Lb
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.commands.calendar.CalendarRepository.providerRank(java.lang.String):int");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object queryCalendars(String str, String[] strArr, HtJ<? super List<CalendarInfo>> htJ) {
        return GAo.A00(htJ, AnonymousClass001.A0y(), new C111032(str, strArr, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long utcMidnightOfUtcDate(long j) {
        Instant instantOfEpochMilli = Instant.ofEpochMilli(j);
        ZoneOffset zoneOffset = ZoneOffset.UTC;
        return C60Q.A06(instantOfEpochMilli.atZone(zoneOffset).toLocalDate().atStartOfDay(zoneOffset));
    }

    public final Object createEvent(long j, String str, long j2, Long l, boolean z, String str2, String str3, String str4, String str5, String str6, HtJ<? super Long> htJ) {
        return GAo.A00(htJ, AnonymousClass001.A0y(), new AnonymousClass2(j, str, j2, l, z, str2, str3, str4, str5, str6, this, null));
    }

    public final Object deleteEvent(long j, HtJ<? super Boolean> htJ) {
        return GAo.A00(htJ, AnonymousClass001.A0y(), new C110972(j, this, null));
    }

    public final Object deleteOccurrence(long j, long j2, HtJ<? super Boolean> htJ) {
        return GAo.A00(htJ, AnonymousClass001.A0y(), new C110982(j, j2, null));
    }

    public final Object getAttendeeTextForEvents$fbandroid_express_aura_java_com_facebook_aura_commands_calendar_calendar(Set<Long> set, HtJ<? super Map<Long, String>> htJ) {
        return GAo.A00(htJ, AnonymousClass001.A0y(), new CalendarRepository$getAttendeeTextForEvents$2(set, this, null));
    }

    public final Object getEventById(long j, HtJ<? super EventInfo> htJ) {
        return GAo.A00(htJ, AnonymousClass001.A0y(), new C110992(j, null));
    }

    public final Object getReminders(long j, HtJ<? super List<ReminderInfo>> htJ) {
        return GAo.A00(htJ, AnonymousClass001.A0y(), new C111002(j, null));
    }

    public final Object listEvents(Long l, long j, long j2, int i, HtJ<? super List<EventInfo>> htJ) {
        return GAo.A00(htJ, AnonymousClass001.A0y(), new C111022(l, this, j, j2, i, null));
    }

    public final Object listEventsForSearch$fbandroid_express_aura_java_com_facebook_aura_commands_calendar_calendar(long j, long j2, HtJ<? super List<SearchRow>> htJ) {
        return GAo.A00(htJ, AnonymousClass001.A0y(), new CalendarRepository$listEventsForSearch$2(this, j, j2, null));
    }

    public final Object listEventsForSync$fbandroid_express_aura_java_com_facebook_aura_commands_calendar_calendar(long j, long j2, HtJ<? super List<CalendarEventPayloadJson>> htJ) {
        return GAo.A00(htJ, AnonymousClass001.A0y(), new CalendarRepository$listEventsForSync$2(this, j, j2, null));
    }

    public final Object removeReminder(long j, Integer num, HtJ<? super Integer> htJ) {
        return GAo.A00(htJ, AnonymousClass001.A0y(), new C111042(num, j, this, null));
    }

    public final Object setReminder(long j, int i, int i2, boolean z, HtJ<? super Long> htJ) {
        return GAo.A00(htJ, AnonymousClass001.A0y(), new C111052(z, this, j, i, i2, null));
    }

    public final Object updateEvent(long j, String str, Long l, Long l2, Boolean bool, String str2, String str3, String str4, String str5, String str6, Long l3, HtJ<? super Boolean> htJ) {
        return GAo.A00(htJ, AnonymousClass001.A0y(), new C111062(j, bool, str4, str, l, str5, l2, str2, str3, str6, l3, null));
    }

    public final Object updateOccurrence(long j, long j2, String str, Long l, Long l2, Boolean bool, String str2, String str3, HtJ<? super Long> htJ) {
        return GAo.A00(htJ, AnonymousClass001.A0y(), new C111072(l, j2, this, j, bool, l2, str, str2, str3, null));
    }

    public /* synthetic */ CalendarRepository(Context context, C06H c06h) {
        this(context);
    }
}
