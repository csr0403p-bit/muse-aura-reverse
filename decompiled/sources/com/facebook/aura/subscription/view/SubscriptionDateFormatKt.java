package com.facebook.aura.subscription.view;

import X.C7384Etj;
import android.icu.text.DateFormat;
import java.time.Instant;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.util.Locale;

/* loaded from: classes2.dex */
public abstract class SubscriptionDateFormatKt {
    public static final Integer daysUntil(Long l, Instant instant) {
        C7384Etj.A0Y(instant, 1);
        if (l != null) {
            long jLongValue = l.longValue();
            if (jLongValue > 0) {
                ZoneId zoneIdSystemDefault = ZoneId.systemDefault();
                int iBetween = (int) ChronoUnit.DAYS.between(instant.atZone(zoneIdSystemDefault).toLocalDate(), Instant.ofEpochSecond(jLongValue).atZone(zoneIdSystemDefault).toLocalDate());
                Integer numValueOf = Integer.valueOf(iBetween);
                if (iBetween >= 0) {
                    return numValueOf;
                }
            }
        }
        return null;
    }

    public static /* synthetic */ Integer daysUntil$default(Long l, Instant instant, int i, Object obj) {
        if ((i & 2) != 0) {
            instant = Instant.now();
            C7384Etj.A0U(instant);
        }
        return daysUntil(l, instant);
    }

    public static final Long epochSecondsToMillis(Long l) {
        if (l == null) {
            return null;
        }
        long jLongValue = l.longValue();
        if (jLongValue > 0) {
            return Long.valueOf(jLongValue * 1000);
        }
        return null;
    }

    public static final String formatShortDate(long j) {
        String str = DateFormat.getInstanceForSkeleton("MMMd", Locale.getDefault()).format(new Date(j));
        C7384Etj.A0U(str);
        return str;
    }
}
