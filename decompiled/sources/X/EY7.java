package X;

import com.google.gson.JsonParseException;
import com.google.gson.stream.MalformedJsonException;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'A01' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* loaded from: classes5.dex */
public abstract class EY7 implements EY0 {
    public static final /* synthetic */ EY7[] A00;
    public static final EY7 A01;
    public static final EY7 A02;

    static {
        final int i = 0;
        EY7 ey7 = new EY7(i) { // from class: X.F4G
            public final int $t;

            /* JADX WARN: Illegal instructions before constructor call */
            {
                String str;
                int i2;
                this.$t = i;
                switch (i) {
                    case 0:
                        str = "DOUBLE";
                        i2 = 0;
                        break;
                    case 1:
                        str = "LAZILY_PARSED_NUMBER";
                        i2 = 1;
                        break;
                    case 2:
                        str = "LONG_OR_DOUBLE";
                        i2 = 2;
                        break;
                    default:
                        str = "BIG_DECIMAL";
                        i2 = 3;
                        break;
                }
                super(str, i2);
            }

            public static Double A00(EY1 ey1, String str) throws MalformedJsonException, NumberFormatException {
                try {
                    Double dValueOf = Double.valueOf(str);
                    if ((!dValueOf.isInfinite() && !dValueOf.isNaN()) || AnonymousClass002.A1Z(ey1.A08, C79.A00)) {
                        return dValueOf;
                    }
                    StringBuilder sbA0f = C3cG.A0f(dValueOf, "JSON forbids NaN and infinities: ");
                    sbA0f.append("; at path ");
                    throw new MalformedJsonException(AnonymousClass001.A0v(ey1.A0T(), sbA0f));
                } catch (NumberFormatException e) {
                    throw new JsonParseException(FGI.A0d("Cannot parse ", str, "; at path ", ey1.A0T()), e);
                }
            }

            @Override // X.EY0
            public final /* bridge */ /* synthetic */ Number AZR(EY1 ey1) throws MalformedJsonException {
                switch (this.$t) {
                    case 0:
                        return Double.valueOf(ey1.A0N());
                    case 1:
                        return new C6716EWz(ey1.A0V());
                    case 2:
                        String strA0V = ey1.A0V();
                        if (strA0V.indexOf(46) >= 0) {
                            return A00(ey1, strA0V);
                        }
                        try {
                            return Long.valueOf(Long.parseLong(strA0V));
                        } catch (NumberFormatException unused) {
                            return A00(ey1, strA0V);
                        }
                    default:
                        String strA0V2 = ey1.A0V();
                        try {
                            return EX0.A00(strA0V2);
                        } catch (NumberFormatException e) {
                            throw new JsonParseException(FGI.A0d("Cannot parse ", strA0V2, "; at path ", ey1.A0T()), e);
                        }
                }
            }
        };
        A01 = ey7;
        final int i2 = 1;
        EY7 ey72 = new EY7(i2) { // from class: X.F4G
            public final int $t;

            /* JADX WARN: Illegal instructions before constructor call */
            {
                String str;
                int i22;
                this.$t = i2;
                switch (i2) {
                    case 0:
                        str = "DOUBLE";
                        i22 = 0;
                        break;
                    case 1:
                        str = "LAZILY_PARSED_NUMBER";
                        i22 = 1;
                        break;
                    case 2:
                        str = "LONG_OR_DOUBLE";
                        i22 = 2;
                        break;
                    default:
                        str = "BIG_DECIMAL";
                        i22 = 3;
                        break;
                }
                super(str, i22);
            }

            public static Double A00(EY1 ey1, String str) throws MalformedJsonException, NumberFormatException {
                try {
                    Double dValueOf = Double.valueOf(str);
                    if ((!dValueOf.isInfinite() && !dValueOf.isNaN()) || AnonymousClass002.A1Z(ey1.A08, C79.A00)) {
                        return dValueOf;
                    }
                    StringBuilder sbA0f = C3cG.A0f(dValueOf, "JSON forbids NaN and infinities: ");
                    sbA0f.append("; at path ");
                    throw new MalformedJsonException(AnonymousClass001.A0v(ey1.A0T(), sbA0f));
                } catch (NumberFormatException e) {
                    throw new JsonParseException(FGI.A0d("Cannot parse ", str, "; at path ", ey1.A0T()), e);
                }
            }

            @Override // X.EY0
            public final /* bridge */ /* synthetic */ Number AZR(EY1 ey1) throws MalformedJsonException {
                switch (this.$t) {
                    case 0:
                        return Double.valueOf(ey1.A0N());
                    case 1:
                        return new C6716EWz(ey1.A0V());
                    case 2:
                        String strA0V = ey1.A0V();
                        if (strA0V.indexOf(46) >= 0) {
                            return A00(ey1, strA0V);
                        }
                        try {
                            return Long.valueOf(Long.parseLong(strA0V));
                        } catch (NumberFormatException unused) {
                            return A00(ey1, strA0V);
                        }
                    default:
                        String strA0V2 = ey1.A0V();
                        try {
                            return EX0.A00(strA0V2);
                        } catch (NumberFormatException e) {
                            throw new JsonParseException(FGI.A0d("Cannot parse ", strA0V2, "; at path ", ey1.A0T()), e);
                        }
                }
            }
        };
        A02 = ey72;
        final int i3 = 2;
        final int i4 = 3;
        A00 = new EY7[]{ey7, ey72, new EY7(i3) { // from class: X.F4G
            public final int $t;

            /* JADX WARN: Illegal instructions before constructor call */
            {
                String str;
                int i22;
                this.$t = i3;
                switch (i3) {
                    case 0:
                        str = "DOUBLE";
                        i22 = 0;
                        break;
                    case 1:
                        str = "LAZILY_PARSED_NUMBER";
                        i22 = 1;
                        break;
                    case 2:
                        str = "LONG_OR_DOUBLE";
                        i22 = 2;
                        break;
                    default:
                        str = "BIG_DECIMAL";
                        i22 = 3;
                        break;
                }
                super(str, i22);
            }

            public static Double A00(EY1 ey1, String str) throws MalformedJsonException, NumberFormatException {
                try {
                    Double dValueOf = Double.valueOf(str);
                    if ((!dValueOf.isInfinite() && !dValueOf.isNaN()) || AnonymousClass002.A1Z(ey1.A08, C79.A00)) {
                        return dValueOf;
                    }
                    StringBuilder sbA0f = C3cG.A0f(dValueOf, "JSON forbids NaN and infinities: ");
                    sbA0f.append("; at path ");
                    throw new MalformedJsonException(AnonymousClass001.A0v(ey1.A0T(), sbA0f));
                } catch (NumberFormatException e) {
                    throw new JsonParseException(FGI.A0d("Cannot parse ", str, "; at path ", ey1.A0T()), e);
                }
            }

            @Override // X.EY0
            public final /* bridge */ /* synthetic */ Number AZR(EY1 ey1) throws MalformedJsonException {
                switch (this.$t) {
                    case 0:
                        return Double.valueOf(ey1.A0N());
                    case 1:
                        return new C6716EWz(ey1.A0V());
                    case 2:
                        String strA0V = ey1.A0V();
                        if (strA0V.indexOf(46) >= 0) {
                            return A00(ey1, strA0V);
                        }
                        try {
                            return Long.valueOf(Long.parseLong(strA0V));
                        } catch (NumberFormatException unused) {
                            return A00(ey1, strA0V);
                        }
                    default:
                        String strA0V2 = ey1.A0V();
                        try {
                            return EX0.A00(strA0V2);
                        } catch (NumberFormatException e) {
                            throw new JsonParseException(FGI.A0d("Cannot parse ", strA0V2, "; at path ", ey1.A0T()), e);
                        }
                }
            }
        }, new EY7(i4) { // from class: X.F4G
            public final int $t;

            /* JADX WARN: Illegal instructions before constructor call */
            {
                String str;
                int i22;
                this.$t = i4;
                switch (i4) {
                    case 0:
                        str = "DOUBLE";
                        i22 = 0;
                        break;
                    case 1:
                        str = "LAZILY_PARSED_NUMBER";
                        i22 = 1;
                        break;
                    case 2:
                        str = "LONG_OR_DOUBLE";
                        i22 = 2;
                        break;
                    default:
                        str = "BIG_DECIMAL";
                        i22 = 3;
                        break;
                }
                super(str, i22);
            }

            public static Double A00(EY1 ey1, String str) throws MalformedJsonException, NumberFormatException {
                try {
                    Double dValueOf = Double.valueOf(str);
                    if ((!dValueOf.isInfinite() && !dValueOf.isNaN()) || AnonymousClass002.A1Z(ey1.A08, C79.A00)) {
                        return dValueOf;
                    }
                    StringBuilder sbA0f = C3cG.A0f(dValueOf, "JSON forbids NaN and infinities: ");
                    sbA0f.append("; at path ");
                    throw new MalformedJsonException(AnonymousClass001.A0v(ey1.A0T(), sbA0f));
                } catch (NumberFormatException e) {
                    throw new JsonParseException(FGI.A0d("Cannot parse ", str, "; at path ", ey1.A0T()), e);
                }
            }

            @Override // X.EY0
            public final /* bridge */ /* synthetic */ Number AZR(EY1 ey1) throws MalformedJsonException {
                switch (this.$t) {
                    case 0:
                        return Double.valueOf(ey1.A0N());
                    case 1:
                        return new C6716EWz(ey1.A0V());
                    case 2:
                        String strA0V = ey1.A0V();
                        if (strA0V.indexOf(46) >= 0) {
                            return A00(ey1, strA0V);
                        }
                        try {
                            return Long.valueOf(Long.parseLong(strA0V));
                        } catch (NumberFormatException unused) {
                            return A00(ey1, strA0V);
                        }
                    default:
                        String strA0V2 = ey1.A0V();
                        try {
                            return EX0.A00(strA0V2);
                        } catch (NumberFormatException e) {
                            throw new JsonParseException(FGI.A0d("Cannot parse ", strA0V2, "; at path ", ey1.A0T()), e);
                        }
                }
            }
        }};
    }

    public static EY7 valueOf(String str) {
        return (EY7) Enum.valueOf(EY7.class, str);
    }

    public static EY7[] values() {
        return (EY7[]) A00.clone();
    }

    public EY7(String str, int i) {
    }
}
