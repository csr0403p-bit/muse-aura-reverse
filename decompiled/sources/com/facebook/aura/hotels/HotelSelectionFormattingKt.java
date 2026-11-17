package com.facebook.aura.hotels;

import X.AnonymousClass003;
import X.BFM;
import X.C10571Hud;
import X.C3cG;
import X.C3cJ;
import X.C7384Etj;
import com.facebook.aura.R;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;

/* loaded from: classes2.dex */
public abstract class HotelSelectionFormattingKt {
    public static final String hotelCheckInTime(HotelDetails hotelDetails, BFM bfm, int i) {
        C7384Etj.A0Y(hotelDetails, 0);
        String str = hotelDetails.checkInStart;
        Locale locale = Locale.getDefault();
        C7384Etj.A0U(locale);
        String strHotelLocalTime = hotelLocalTime(str, locale);
        String str2 = hotelDetails.checkInEnd;
        Locale locale2 = Locale.getDefault();
        C7384Etj.A0U(locale2);
        String strHotelLocalTime2 = hotelLocalTime(str2, locale2);
        if (strHotelLocalTime == null || strHotelLocalTime2 == null) {
            AnonymousClass003.A0l(bfm, -1707599675);
            return strHotelLocalTime == null ? strHotelLocalTime2 : strHotelLocalTime;
        }
        bfm.AgE(1607481687);
        return C3cJ.A0H(bfm, strHotelLocalTime, strHotelLocalTime2, R.string._name_removed__res_0x7f120332);
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x0083 A[Catch: all -> 0x0092, PHI: r1
  0x0083: PHI (r1v6 java.time.LocalTime) = (r1v5 java.time.LocalTime), (r1v9 java.time.LocalTime) binds: [B:19:0x0041, B:34:0x0078] A[DONT_GENERATE, DONT_INLINE], TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x0092, blocks: (B:4:0x0007, B:5:0x000d, B:7:0x0013, B:9:0x001d, B:10:0x0020, B:11:0x0023, B:15:0x003a, B:18:0x003f, B:20:0x0043, B:21:0x0053, B:23:0x0059, B:27:0x006d, B:30:0x0072, B:26:0x0069, B:41:0x0083, B:14:0x0036, B:12:0x0030, B:24:0x005d), top: B:44:0x0007, inners: #1, #2 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.String hotelLocalTime(java.lang.String r5, java.util.Locale r6) {
        /*
            r0 = 1
            X.C7384Etj.A0Y(r6, r0)
            r4 = 0
            if (r5 == 0) goto L82
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L92
            r3.<init>()     // Catch: java.lang.Throwable -> L92
            r2 = 0
        Ld:
            int r0 = r5.length()     // Catch: java.lang.Throwable -> L92
            if (r2 >= r0) goto L23
            char r1 = r5.charAt(r2)     // Catch: java.lang.Throwable -> L92
            boolean r0 = X.C7LE.A00(r1)     // Catch: java.lang.Throwable -> L92
            if (r0 != 0) goto L20
            r3.append(r1)     // Catch: java.lang.Throwable -> L92
        L20:
            int r2 = r2 + 1
            goto Ld
        L23:
            java.lang.String r1 = r3.toString()     // Catch: java.lang.Throwable -> L92
            java.util.Locale r0 = java.util.Locale.ROOT     // Catch: java.lang.Throwable -> L92
            X.C7384Etj.A0V(r0)     // Catch: java.lang.Throwable -> L92
            java.lang.String r3 = r1.toUpperCase(r0)     // Catch: java.lang.Throwable -> L92
            java.time.LocalTime r1 = java.time.LocalTime.parse(r3)     // Catch: java.lang.Throwable -> L35
            goto L3a
        L35:
            r0 = move-exception
            X.Hud r1 = X.C3cG.A0s(r0)     // Catch: java.lang.Throwable -> L92
        L3a:
            boolean r0 = r1 instanceof X.C10571Hud     // Catch: java.lang.Throwable -> L92
            if (r0 == 0) goto L3f
            r1 = r4
        L3f:
            java.time.LocalTime r1 = (java.time.LocalTime) r1     // Catch: java.lang.Throwable -> L92
            if (r1 != 0) goto L83
            java.lang.String r1 = "h:mma"
            java.lang.String r0 = "ha"
            java.lang.String[] r0 = new java.lang.String[]{r1, r0}     // Catch: java.lang.Throwable -> L92
            java.util.List r0 = java.util.Arrays.asList(r0)     // Catch: java.lang.Throwable -> L92
            java.util.Iterator r2 = r0.iterator()     // Catch: java.lang.Throwable -> L92
        L53:
            boolean r0 = r2.hasNext()     // Catch: java.lang.Throwable -> L92
            if (r0 == 0) goto L77
            java.lang.String r1 = X.AnonymousClass005.A0j(r2)     // Catch: java.lang.Throwable -> L92
            java.util.Locale r0 = java.util.Locale.US     // Catch: java.lang.Throwable -> L68
            java.time.format.DateTimeFormatter r0 = java.time.format.DateTimeFormatter.ofPattern(r1, r0)     // Catch: java.lang.Throwable -> L68
            java.time.LocalTime r1 = java.time.LocalTime.parse(r3, r0)     // Catch: java.lang.Throwable -> L68
            goto L6d
        L68:
            r0 = move-exception
            X.Hud r1 = X.C3cG.A0s(r0)     // Catch: java.lang.Throwable -> L92
        L6d:
            boolean r0 = r1 instanceof X.C10571Hud     // Catch: java.lang.Throwable -> L92
            if (r0 == 0) goto L72
            r1 = r4
        L72:
            java.time.LocalTime r1 = (java.time.LocalTime) r1     // Catch: java.lang.Throwable -> L92
            if (r1 == 0) goto L53
            goto L78
        L77:
            r1 = r4
        L78:
            if (r1 != 0) goto L83
            r0 = r4
        L7b:
            boolean r1 = r0 instanceof X.C10571Hud
            if (r1 != 0) goto L80
            r4 = r0
        L80:
            java.lang.String r4 = (java.lang.String) r4
        L82:
            return r4
        L83:
            java.time.format.FormatStyle r0 = java.time.format.FormatStyle.SHORT     // Catch: java.lang.Throwable -> L92
            java.time.format.DateTimeFormatter r0 = java.time.format.DateTimeFormatter.ofLocalizedTime(r0)     // Catch: java.lang.Throwable -> L92
            java.time.format.DateTimeFormatter r0 = r0.withLocale(r6)     // Catch: java.lang.Throwable -> L92
            java.lang.String r0 = r1.format(r0)     // Catch: java.lang.Throwable -> L92
            goto L7b
        L92:
            r0 = move-exception
            X.Hud r0 = X.C3cG.A0s(r0)
            goto L7b
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.hotels.HotelSelectionFormattingKt.hotelLocalTime(java.lang.String, java.util.Locale):java.lang.String");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [X.Hud] */
    public static final String hotelCancellationDeadline(String str, Locale locale) {
        Object objA0s;
        String strA0s;
        LocalDateTime localDateTime;
        AnonymousClass003.A0u(str, locale);
        try {
            try {
                objA0s = OffsetDateTime.parse(str);
            } catch (Throwable th) {
                objA0s = C3cG.A0s(th);
            }
            if (objA0s instanceof C10571Hud) {
                objA0s = null;
            }
            OffsetDateTime offsetDateTime = (OffsetDateTime) objA0s;
            if (offsetDateTime == null || (localDateTime = offsetDateTime.toLocalDateTime()) == null) {
                localDateTime = LocalDateTime.parse(str);
            }
            strA0s = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM, FormatStyle.SHORT).withLocale(locale).format(localDateTime);
        } catch (Throwable th2) {
            strA0s = C3cG.A0s(th2);
        }
        if (!(strA0s instanceof C10571Hud)) {
            str = strA0s;
        }
        return str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [X.Hud] */
    public static final String hotelStayDate(String str, Locale locale) {
        String strA0s;
        AnonymousClass003.A0u(str, locale);
        try {
            strA0s = LocalDate.parse(str).format(DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM).withLocale(locale));
        } catch (Throwable th) {
            strA0s = C3cG.A0s(th);
        }
        if (!(strA0s instanceof C10571Hud)) {
            str = strA0s;
        }
        return str;
    }
}
