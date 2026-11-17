package com.facebook.aura.nodes.datasource;

import X.AnonymousClass003;
import X.C2nw;
import X.C7384Etj;
import X.C7qW;
import X.FGI;
import java.time.Instant;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.TextStyle;
import java.util.Locale;

/* loaded from: classes3.dex */
public final class NodeSyncTimestamps {
    public static final NodeSyncTimestamps INSTANCE = new NodeSyncTimestamps();
    public static final DateTimeFormatter ISO_SECONDS_UTC;
    public static final DateTimeFormatter LOCAL_DATE;
    public static final DateTimeFormatter LOCAL_DATE_TIME;

    static {
        DateTimeFormatter dateTimeFormatterWithZone = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss'Z'").withZone(ZoneOffset.UTC);
        C7384Etj.A0U(dateTimeFormatterWithZone);
        ISO_SECONDS_UTC = dateTimeFormatterWithZone;
        DateTimeFormatter dateTimeFormatterOfPattern = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss");
        C7384Etj.A0U(dateTimeFormatterOfPattern);
        LOCAL_DATE_TIME = dateTimeFormatterOfPattern;
        DateTimeFormatter dateTimeFormatterOfPattern2 = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        C7384Etj.A0U(dateTimeFormatterOfPattern2);
        LOCAL_DATE = dateTimeFormatterOfPattern2;
    }

    public final String iso8601Utc(long j) {
        String str = ISO_SECONDS_UTC.format(Instant.ofEpochMilli(j));
        C7384Etj.A0U(str);
        return str;
    }

    public final void putLocalTimeFields(C2nw c2nw, long j, String str) {
        AnonymousClass003.A0v(c2nw, str);
        ZonedDateTime zonedDateTimeAtZone = Instant.ofEpochMilli(j).atZone(ZoneId.systemDefault());
        C7qW.A06(FGI.A0M(str, "_local"), LOCAL_DATE_TIME.format(zonedDateTimeAtZone), c2nw);
        C7qW.A06(FGI.A0M(str, "_local_date"), LOCAL_DATE.format(zonedDateTimeAtZone), c2nw);
        C7qW.A06(FGI.A0M(str, "_weekday"), zonedDateTimeAtZone.getDayOfWeek().getDisplayName(TextStyle.FULL, Locale.US), c2nw);
        C7qW.A06("time_zone", zonedDateTimeAtZone.getZone().getId(), c2nw);
    }
}
