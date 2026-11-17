package X;

import java.io.Serializable;
import java.util.Locale;
import java.util.TimeZone;

/* renamed from: X.GkV, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9894GkV implements Serializable {
    public static final C9894GkV A01 = new C9894GkV();
    public static final long serialVersionUID = 1;
    public transient TimeZone A00;
    public final C10101GpP _features;
    public final Boolean _lenient;
    public final Locale _locale;
    public final String _pattern;
    public final EnumC10046GoQ _shape;
    public final String _timezoneStr;

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj != null && obj.getClass() == getClass()) {
                C9894GkV c9894GkV = (C9894GkV) obj;
                if (this._shape == c9894GkV._shape && this._features.equals(c9894GkV._features)) {
                    Boolean bool = this._lenient;
                    Boolean bool2 = c9894GkV._lenient;
                    if (bool != null ? !(bool2 == null || !bool.equals(bool2)) : bool2 == null) {
                        String str = this._timezoneStr;
                        String str2 = c9894GkV._timezoneStr;
                        if (str != null ? !(str2 == null || !str.equals(str2)) : str2 == null) {
                            String str3 = this._pattern;
                            String str4 = c9894GkV._pattern;
                            if (str3 != null ? !(str4 == null || !str3.equals(str4)) : str4 == null) {
                                TimeZone timeZone = this.A00;
                                TimeZone timeZone2 = c9894GkV.A00;
                                if (timeZone != null ? !(timeZone2 == null || !timeZone.equals(timeZone2)) : timeZone2 == null) {
                                    Locale locale = this._locale;
                                    Locale locale2 = c9894GkV._locale;
                                    if (locale == null) {
                                        if (locale2 == null) {
                                        }
                                    } else if (locale2 != null && locale.equals(locale2)) {
                                        return true;
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public C9894GkV() {
        Locale locale;
        String str;
        EnumC10046GoQ enumC10046GoQ = EnumC10046GoQ.ANY;
        C10101GpP c10101GpP = C10101GpP.A02;
        if ("".length() != 0) {
            locale = new Locale("");
            str = "";
        } else {
            locale = null;
            str = null;
        }
        this(c10101GpP, enumC10046GoQ, null, "", str, locale, null);
    }

    public final C9894GkV A00(C9894GkV c9894GkV) {
        C9894GkV c9894GkV2;
        TimeZone timeZone;
        if (c9894GkV == null || c9894GkV == (c9894GkV2 = A01) || c9894GkV == this) {
            return this;
        }
        if (this == c9894GkV2) {
            return c9894GkV;
        }
        String str = c9894GkV._pattern;
        if (str == null || str.isEmpty()) {
            str = this._pattern;
        }
        EnumC10046GoQ enumC10046GoQ = c9894GkV._shape;
        if (enumC10046GoQ == EnumC10046GoQ.ANY) {
            enumC10046GoQ = this._shape;
        }
        Locale locale = c9894GkV._locale;
        if (locale == null) {
            locale = this._locale;
        }
        C10101GpP c10101GpP = this._features;
        if (c10101GpP == null) {
            c10101GpP = c9894GkV._features;
        } else {
            C10101GpP c10101GpP2 = c9894GkV._features;
            if (c10101GpP2 != null) {
                int i = c10101GpP2.A00;
                int i2 = c10101GpP2.A01;
                if (i != 0 || i2 != 0) {
                    int i3 = c10101GpP.A01;
                    if (i3 == 0 && c10101GpP.A00 == 0) {
                        c10101GpP = c10101GpP2;
                    } else {
                        int i4 = ((i ^ (-1)) & i3) | i2;
                        int i5 = c10101GpP.A00;
                        int i6 = i | ((i2 ^ (-1)) & i5);
                        if (i4 != i3 || i6 != i5) {
                            c10101GpP2 = new C10101GpP(i4, i6);
                            c10101GpP = c10101GpP2;
                        }
                    }
                }
            }
        }
        Boolean bool = c9894GkV._lenient;
        if (bool == null) {
            bool = this._lenient;
        }
        String str2 = c9894GkV._timezoneStr;
        if (str2 == null || str2.isEmpty()) {
            str2 = this._timezoneStr;
            timeZone = this.A00;
        } else {
            timeZone = c9894GkV.A00;
        }
        return new C9894GkV(c10101GpP, enumC10046GoQ, bool, str, str2, locale, timeZone);
    }

    public final Boolean A01(EnumC10062Goj enumC10062Goj) {
        C10101GpP c10101GpP = this._features;
        int iA0F = AbstractC7609F5w.A0F(enumC10062Goj);
        if ((c10101GpP.A00 & iA0F) != 0) {
            return Boolean.FALSE;
        }
        if ((iA0F & c10101GpP.A01) != 0) {
            return Boolean.TRUE;
        }
        return null;
    }

    public final TimeZone A02() {
        TimeZone timeZone = this.A00;
        if (timeZone != null) {
            return timeZone;
        }
        String str = this._timezoneStr;
        if (str == null) {
            return null;
        }
        TimeZone timeZone2 = TimeZone.getTimeZone(str);
        this.A00 = timeZone2;
        return timeZone2;
    }

    public final int hashCode() {
        String str = this._timezoneStr;
        int iHashCode = str == null ? 1 : str.hashCode();
        String str2 = this._pattern;
        if (str2 != null) {
            iHashCode ^= str2.hashCode();
        }
        int iA0G = AnonymousClass005.A0G(this._shape, iHashCode);
        Boolean bool = this._lenient;
        if (bool != null) {
            iA0G ^= bool.hashCode();
        }
        Locale locale = this._locale;
        if (locale != null) {
            iA0G = AnonymousClass005.A0G(locale, iA0G);
        }
        return iA0G ^ this._features.hashCode();
    }

    public final String toString() {
        return String.format("JsonFormat.Value(pattern=%s,shape=%s,lenient=%s,locale=%s,timezone=%s,features=%s)", this._pattern, this._shape, this._lenient, this._locale, this._timezoneStr, this._features);
    }

    public C9894GkV(C10101GpP c10101GpP, EnumC10046GoQ enumC10046GoQ, Boolean bool, String str, String str2, Locale locale, TimeZone timeZone) {
        this._pattern = str == null ? "" : str;
        this._shape = enumC10046GoQ == null ? EnumC10046GoQ.ANY : enumC10046GoQ;
        this._locale = locale;
        this.A00 = timeZone;
        this._timezoneStr = str2;
        this._features = c10101GpP == null ? C10101GpP.A02 : c10101GpP;
        this._lenient = bool;
    }
}
