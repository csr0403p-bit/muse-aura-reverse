package X;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.TimeZone;
import java.util.regex.Pattern;

/* loaded from: classes6.dex */
public final class HtX extends DateFormat {
    public static final HtX A03;
    public static final DateFormat A04;
    public static final Calendar A05;
    public static final Locale A06;
    public static final TimeZone A07;
    public static final Pattern A08;
    public static final Pattern A09 = Pattern.compile("\\d\\d\\d\\d[-]\\d\\d[-]\\d\\d");
    public static final String[] A0A;
    public transient DateFormat A00;
    public transient Calendar A01;
    public transient TimeZone A02;
    public Boolean _lenient;
    public final Locale _locale;
    public boolean _tzSerializedWithColon;

    public static int A00(String str) {
        return ((str.charAt(0) - '0') * 1000) + ((str.charAt(1) - '0') * 100) + ((str.charAt(2) - '0') * 10) + (str.charAt(3) - '0');
    }

    static {
        try {
            A08 = Pattern.compile("\\d\\d\\d\\d[-]\\d\\d[-]\\d\\d[T]\\d\\d[:]\\d\\d(?:[:]\\d\\d)?(\\.\\d+)?(Z|[+-]\\d\\d(?:[:]?\\d\\d)?)?");
            A0A = new String[]{"yyyy-MM-dd'T'HH:mm:ss.SSSX", "yyyy-MM-dd'T'HH:mm:ss.SSS", "EEE, dd MMM yyyy HH:mm:ss zzz", "yyyy-MM-dd"};
            TimeZone timeZone = TimeZone.getTimeZone("UTC");
            A07 = timeZone;
            Locale locale = Locale.US;
            A06 = locale;
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss zzz", locale);
            A04 = simpleDateFormat;
            simpleDateFormat.setTimeZone(timeZone);
            A03 = new HtX();
            A05 = new GregorianCalendar(timeZone, locale);
        } catch (Exception e) {
            throw BV4.A0e(e);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:107:0x0209, code lost:
    
        if (r0 != false) goto L117;
     */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01cf  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.util.Date A02(java.lang.String r17, java.text.ParsePosition r18) throws java.text.ParseException {
        /*
            Method dump skipped, instructions count: 559
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.HtX.A02(java.lang.String, java.text.ParsePosition):java.util.Date");
    }

    public static void A03(StringBuffer stringBuffer, int i) {
        int i2 = i / 10;
        if (i2 == 0) {
            stringBuffer.append('0');
        } else {
            stringBuffer.append((char) (i2 + 48));
            i -= i2 * 10;
        }
        stringBuffer.append((char) (i + 48));
    }

    @Override // java.text.DateFormat, java.text.Format
    public final /* bridge */ /* synthetic */ Object clone() {
        TimeZone timeZone = this.A02;
        return new HtX(this._lenient, this._locale, timeZone, this._tzSerializedWithColon);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0102  */
    @Override // java.text.DateFormat
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.StringBuffer format(java.util.Date r8, java.lang.StringBuffer r9, java.text.FieldPosition r10) {
        /*
            Method dump skipped, instructions count: 271
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.HtX.format(java.util.Date, java.lang.StringBuffer, java.text.FieldPosition):java.lang.StringBuffer");
    }

    @Override // java.text.DateFormat
    public final TimeZone getTimeZone() {
        return this.A02;
    }

    @Override // java.text.DateFormat
    public final boolean isLenient() {
        Boolean bool = this._lenient;
        return bool == null || bool.booleanValue();
    }

    @Override // java.text.DateFormat
    public final void setTimeZone(TimeZone timeZone) {
        if (timeZone.equals(this.A02)) {
            return;
        }
        this.A00 = null;
        this.A02 = timeZone;
    }

    public HtX() {
        this._tzSerializedWithColon = true;
        this._locale = A06;
    }

    public static int A01(String str, int i) {
        return ((str.charAt(i) - '0') * 10) + (str.charAt(i + 1) - '0');
    }

    @Override // java.text.DateFormat
    public final boolean equals(Object obj) {
        return AnonymousClass002.A1Z(obj, this);
    }

    @Override // java.text.DateFormat
    public final int hashCode() {
        return System.identityHashCode(this);
    }

    @Override // java.text.DateFormat
    public final Date parse(String str) throws ParseException {
        String strTrim = str.trim();
        ParsePosition parsePosition = new ParsePosition(0);
        Date dateA02 = A02(strTrim, parsePosition);
        if (dateA02 != null) {
            return dateA02;
        }
        StringBuilder sbA0w = C60O.A0w();
        for (String str2 : A0A) {
            if (sbA0w.length() > 0) {
                sbA0w.append("\", \"");
            } else {
                sbA0w.append('\"');
            }
            sbA0w.append(str2);
        }
        throw new ParseException(String.format("Cannot parse date \"%s\": not compatible with any of standard forms (%s)", strTrim, C8j3.A16(sbA0w, '\"')), parsePosition.getErrorIndex());
    }

    @Override // java.text.DateFormat
    public final void setLenient(boolean z) {
        Boolean boolValueOf = Boolean.valueOf(z);
        Boolean bool = this._lenient;
        if (boolValueOf == bool || boolValueOf.equals(bool)) {
            return;
        }
        this._lenient = boolValueOf;
        this.A00 = null;
    }

    public final String toString() {
        return String.format("DateFormat %s: (timezone: %s, locale: %s, lenient: %s)", C60Q.A0e(this), this.A02, this._locale, this._lenient);
    }

    public HtX(Boolean bool, Locale locale, TimeZone timeZone, boolean z) {
        this.A02 = timeZone;
        this._locale = locale;
        this._lenient = bool;
        this._tzSerializedWithColon = z;
    }

    @Override // java.text.DateFormat
    public final Date parse(String str, ParsePosition parsePosition) {
        try {
            return A02(str, parsePosition);
        } catch (ParseException unused) {
            return null;
        }
    }
}
