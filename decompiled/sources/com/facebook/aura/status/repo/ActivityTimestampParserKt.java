package com.facebook.aura.status.repo;

import X.C10571Hud;
import X.C7BY;
import java.text.SimpleDateFormat;
import java.time.OffsetDateTime;
import java.time.format.DateTimeParseException;
import java.util.Arrays;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;

/* loaded from: classes3.dex */
public abstract class ActivityTimestampParserKt {
    public static final List<SimpleDateFormat> isoTimestampFallbackFormats;

    public static final Long parseIsoTimestampToMillis(String str) {
        Object c10571Hud;
        Long lValueOf = null;
        if (str != null && !C7BY.A0j(str)) {
            try {
                lValueOf = Long.valueOf(OffsetDateTime.parse(str).toInstant().toEpochMilli());
                return lValueOf;
            } catch (DateTimeParseException unused) {
                Iterator<SimpleDateFormat> it = isoTimestampFallbackFormats.iterator();
                while (it.hasNext()) {
                    try {
                        Date date = it.next().parse(str);
                        c10571Hud = date != null ? Long.valueOf(date.getTime()) : lValueOf;
                    } catch (Throwable th) {
                        c10571Hud = new C10571Hud(th);
                    }
                    if (c10571Hud instanceof C10571Hud) {
                        c10571Hud = lValueOf;
                    }
                    Long l = (Long) c10571Hud;
                    if (l != null) {
                        return l;
                    }
                }
            }
        }
        return lValueOf;
    }

    static {
        Locale locale = Locale.US;
        List<SimpleDateFormat> listAsList = Arrays.asList(new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", locale), new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'", locale), new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS", locale), new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss", locale));
        Iterator<SimpleDateFormat> it = listAsList.iterator();
        while (it.hasNext()) {
            it.next().setTimeZone(TimeZone.getTimeZone("UTC"));
        }
        isoTimestampFallbackFormats = listAsList;
    }

    public static final Date parseIsoTimestampToDate(String str) {
        Long isoTimestampToMillis = parseIsoTimestampToMillis(str);
        if (isoTimestampToMillis != null) {
            return new Date(isoTimestampToMillis.longValue());
        }
        return null;
    }
}
