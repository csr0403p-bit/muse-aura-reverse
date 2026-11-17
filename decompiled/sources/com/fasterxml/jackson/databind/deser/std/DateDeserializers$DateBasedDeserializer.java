package com.fasterxml.jackson.databind.deser.std;

import X.AbstractC9904Gkk;
import X.AbstractC9916Gl7;
import X.AnonymousClass001;
import X.BV4;
import X.C9894GkV;
import X.C9895GkY;
import X.C9898Gke;
import X.EnumC9834GiY;
import X.F60;
import X.HtX;
import X.InterfaceC10017Gnp;
import X.InterfaceC9830GiT;
import com.fasterxml.jackson.databind.JsonDeserializer;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

/* loaded from: classes6.dex */
public abstract class DateDeserializers$DateBasedDeserializer<T> extends StdScalarDeserializer<T> implements InterfaceC9830GiT {
    public final DateFormat _customFormat;
    public final String _formatString;

    @Override // com.fasterxml.jackson.databind.deser.std.StdDeserializer
    public final Date A1B(AbstractC9916Gl7 abstractC9916Gl7, AbstractC9904Gkk abstractC9904Gkk) {
        Date date;
        if (this._customFormat == null || !abstractC9916Gl7.A22(EnumC9834GiY.VALUE_STRING)) {
            return super.A1B(abstractC9916Gl7, abstractC9904Gkk);
        }
        String strTrim = abstractC9916Gl7.A1c().trim();
        if (strTrim.isEmpty()) {
            if (A0x(abstractC9904Gkk, strTrim).ordinal() != 3) {
                return null;
            }
            return new Date(0L);
        }
        synchronized (this._customFormat) {
            try {
                date = this._customFormat.parse(strTrim);
            } catch (ParseException unused) {
                abstractC9904Gkk.A0k(A0h(), strTrim, "expected format \"%s\"", this._formatString);
                throw F60.createAndThrow();
            }
        }
        return date;
    }

    public DateDeserializers$DateBasedDeserializer(Class<?> cls) {
        super(cls);
        this._customFormat = null;
        this._formatString = null;
    }

    /* JADX WARN: Incorrect types in method signature: (LX/Gkk;LX/Gnp;)Lcom/fasterxml/jackson/databind/JsonDeserializer<*>; */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v12, types: [X.HtX] */
    /* JADX WARN: Type inference failed for: r3v13, types: [X.HtX] */
    /* JADX WARN: Type inference failed for: r3v16, types: [java.text.DateFormat] */
    /* JADX WARN: Type inference failed for: r3v17, types: [java.text.DateFormat, java.text.SimpleDateFormat] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.text.DateFormat] */
    /* JADX WARN: Type inference failed for: r3v21 */
    /* JADX WARN: Type inference failed for: r3v22 */
    /* JADX WARN: Type inference failed for: r3v23 */
    /* JADX WARN: Type inference failed for: r3v24 */
    /* JADX WARN: Type inference failed for: r3v25 */
    /* JADX WARN: Type inference failed for: r3v4, types: [X.HtX] */
    /* JADX WARN: Type inference failed for: r3v8, types: [java.text.DateFormat] */
    /* JADX WARN: Type inference failed for: r3v9 */
    @Override // X.InterfaceC9830GiT
    public final JsonDeserializer A7e(InterfaceC10017Gnp interfaceC10017Gnp, AbstractC9904Gkk abstractC9904Gkk) {
        ?? htX;
        Boolean bool;
        Class<?> clsA0h = A0h();
        C9898Gke c9898Gke = abstractC9904Gkk._config;
        C9894GkV c9894GkVABX = interfaceC10017Gnp != null ? interfaceC10017Gnp.ABX(c9898Gke, clsA0h) : c9898Gke.A00(clsA0h);
        if (c9894GkVABX != null) {
            TimeZone timeZoneA02 = c9894GkVABX.A02();
            Boolean bool2 = c9894GkVABX._lenient;
            String strA0v = c9894GkVABX._pattern;
            if (strA0v != null && strA0v.length() > 0) {
                Locale locale = c9894GkVABX._locale;
                if (locale == null) {
                    locale = abstractC9904Gkk._config._base._locale;
                }
                htX = new SimpleDateFormat(strA0v, locale);
                if (timeZoneA02 == null && (timeZoneA02 = abstractC9904Gkk._config._base._timeZone) == null) {
                    timeZoneA02 = C9895GkY.A00;
                }
                htX.setTimeZone(timeZoneA02);
                if (bool2 != null) {
                    htX.setLenient(bool2.booleanValue());
                }
            } else if (timeZoneA02 != null) {
                C9895GkY c9895GkY = abstractC9904Gkk._config._base;
                DateFormat dateFormat = c9895GkY._dateFormat;
                if (dateFormat.getClass() == HtX.class) {
                    Locale locale2 = c9894GkVABX._locale;
                    if (locale2 == null) {
                        locale2 = c9895GkY._locale;
                    }
                    HtX htX2 = (HtX) dateFormat;
                    TimeZone timeZone = htX2.A02;
                    HtX htX3 = htX2;
                    if (timeZoneA02 != timeZone) {
                        htX3 = htX2;
                        if (!timeZoneA02.equals(timeZone)) {
                            htX3 = new HtX(htX2._lenient, htX2._locale, timeZoneA02, htX2._tzSerializedWithColon);
                        }
                    }
                    boolean zEquals = locale2.equals(htX3._locale);
                    htX = htX3;
                    if (!zEquals) {
                        htX = new HtX(htX3._lenient, locale2, htX3.A02, htX3._tzSerializedWithColon);
                    }
                    if (bool2 != null && bool2 != (bool = htX._lenient) && !bool2.equals(bool)) {
                        htX = new HtX(bool2, htX._locale, htX.A02, htX._tzSerializedWithColon);
                    }
                } else {
                    htX = (DateFormat) dateFormat.clone();
                    htX.setTimeZone(timeZoneA02);
                    if (bool2 != null) {
                        htX.setLenient(bool2.booleanValue());
                    }
                }
                strA0v = this._formatString;
            } else if (bool2 != null) {
                DateFormat dateFormat2 = abstractC9904Gkk._config._base._dateFormat;
                strA0v = this._formatString;
                if (dateFormat2.getClass() == HtX.class) {
                    HtX htX4 = (HtX) dateFormat2;
                    Boolean bool3 = htX4._lenient;
                    htX = htX4;
                    if (bool2 != bool3) {
                        htX = htX4;
                        if (!bool2.equals(bool3)) {
                            htX = new HtX(bool2, htX4._locale, htX4.A02, htX4._tzSerializedWithColon);
                        }
                    }
                    StringBuilder sbA0p = BV4.A0p(100);
                    sbA0p.append("[one of: 'yyyy-MM-dd'T'HH:mm:ss.SSSX', 'EEE, dd MMM yyyy HH:mm:ss zzz' (");
                    sbA0p.append(Boolean.FALSE.equals(htX._lenient) ? "strict" : "lenient");
                    strA0v = AnonymousClass001.A0v(")]", sbA0p);
                } else {
                    htX = (DateFormat) dateFormat2.clone();
                    htX.setLenient(bool2.booleanValue());
                    if (htX instanceof SimpleDateFormat) {
                        ((SimpleDateFormat) htX).toPattern();
                    }
                    if (strA0v == null) {
                        strA0v = "[unknown]";
                    }
                }
            }
            return this instanceof DateDeserializers$TimestampDeserializer ? new DateDeserializers$TimestampDeserializer(this, strA0v, htX) : this instanceof DateDeserializers$SqlDateDeserializer ? new DateDeserializers$SqlDateDeserializer(this, strA0v, htX) : this instanceof DateDeserializers$DateDeserializer ? new DateDeserializers$DateDeserializer(this, strA0v, htX) : new DateDeserializers$CalendarDeserializer((DateDeserializers$CalendarDeserializer) this, strA0v, htX);
        }
        return this;
    }

    /* JADX WARN: Incorrect types in method signature: (Lcom/fasterxml/jackson/databind/deser/std/DateDeserializers$DateBasedDeserializer<TT;>;Ljava/text/DateFormat;Ljava/lang/String;)V */
    public DateDeserializers$DateBasedDeserializer(DateDeserializers$DateBasedDeserializer dateDeserializers$DateBasedDeserializer, String str, DateFormat dateFormat) {
        super(dateDeserializers$DateBasedDeserializer._valueClass);
        this._customFormat = dateFormat;
        this._formatString = str;
    }
}
