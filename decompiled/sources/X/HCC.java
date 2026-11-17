package X;

import java.lang.reflect.Field;
import java.util.Locale;

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
/* loaded from: classes6.dex */
public abstract class HCC implements InterfaceC6749EYj {
    public static final /* synthetic */ HCC[] A00;
    public static final HCC A01;

    static {
        final int i = 0;
        HCC hcc = new HCC(i) { // from class: X.I0L
            public final int $t;

            /* JADX WARN: Illegal instructions before constructor call */
            {
                String str;
                int i2;
                this.$t = i;
                switch (i) {
                    case 0:
                        str = "IDENTITY";
                        i2 = 0;
                        break;
                    case 1:
                        str = "UPPER_CAMEL_CASE";
                        i2 = 1;
                        break;
                    case 2:
                        str = "UPPER_CAMEL_CASE_WITH_SPACES";
                        i2 = 2;
                        break;
                    case 3:
                        str = "UPPER_CASE_WITH_UNDERSCORES";
                        i2 = 3;
                        break;
                    case 4:
                        str = "LOWER_CASE_WITH_UNDERSCORES";
                        i2 = 4;
                        break;
                    case 5:
                        str = "LOWER_CASE_WITH_DASHES";
                        i2 = 5;
                        break;
                    default:
                        str = "LOWER_CASE_WITH_DOTS";
                        i2 = 6;
                        break;
                }
                super(str, i2);
            }

            @Override // X.InterfaceC6749EYj
            public final String AhN(Field field) {
                String name;
                char c;
                switch (this.$t) {
                    case 0:
                        return field.getName();
                    case 1:
                        return HCC.A00(field.getName());
                    case 2:
                        return HCC.A00(HCC.A01(field.getName(), ' '));
                    case 3:
                        return HCC.A01(field.getName(), '_').toUpperCase(Locale.ENGLISH);
                    case 4:
                        name = field.getName();
                        c = '_';
                        break;
                    case 5:
                        name = field.getName();
                        c = '-';
                        break;
                    default:
                        name = field.getName();
                        c = '.';
                        break;
                }
                return HCC.A01(name, c).toLowerCase(Locale.ENGLISH);
            }
        };
        A01 = hcc;
        final int i2 = 1;
        HCC hcc2 = new HCC(i2) { // from class: X.I0L
            public final int $t;

            /* JADX WARN: Illegal instructions before constructor call */
            {
                String str;
                int i22;
                this.$t = i2;
                switch (i2) {
                    case 0:
                        str = "IDENTITY";
                        i22 = 0;
                        break;
                    case 1:
                        str = "UPPER_CAMEL_CASE";
                        i22 = 1;
                        break;
                    case 2:
                        str = "UPPER_CAMEL_CASE_WITH_SPACES";
                        i22 = 2;
                        break;
                    case 3:
                        str = "UPPER_CASE_WITH_UNDERSCORES";
                        i22 = 3;
                        break;
                    case 4:
                        str = "LOWER_CASE_WITH_UNDERSCORES";
                        i22 = 4;
                        break;
                    case 5:
                        str = "LOWER_CASE_WITH_DASHES";
                        i22 = 5;
                        break;
                    default:
                        str = "LOWER_CASE_WITH_DOTS";
                        i22 = 6;
                        break;
                }
                super(str, i22);
            }

            @Override // X.InterfaceC6749EYj
            public final String AhN(Field field) {
                String name;
                char c;
                switch (this.$t) {
                    case 0:
                        return field.getName();
                    case 1:
                        return HCC.A00(field.getName());
                    case 2:
                        return HCC.A00(HCC.A01(field.getName(), ' '));
                    case 3:
                        return HCC.A01(field.getName(), '_').toUpperCase(Locale.ENGLISH);
                    case 4:
                        name = field.getName();
                        c = '_';
                        break;
                    case 5:
                        name = field.getName();
                        c = '-';
                        break;
                    default:
                        name = field.getName();
                        c = '.';
                        break;
                }
                return HCC.A01(name, c).toLowerCase(Locale.ENGLISH);
            }
        };
        final int i3 = 2;
        HCC hcc3 = new HCC(i3) { // from class: X.I0L
            public final int $t;

            /* JADX WARN: Illegal instructions before constructor call */
            {
                String str;
                int i22;
                this.$t = i3;
                switch (i3) {
                    case 0:
                        str = "IDENTITY";
                        i22 = 0;
                        break;
                    case 1:
                        str = "UPPER_CAMEL_CASE";
                        i22 = 1;
                        break;
                    case 2:
                        str = "UPPER_CAMEL_CASE_WITH_SPACES";
                        i22 = 2;
                        break;
                    case 3:
                        str = "UPPER_CASE_WITH_UNDERSCORES";
                        i22 = 3;
                        break;
                    case 4:
                        str = "LOWER_CASE_WITH_UNDERSCORES";
                        i22 = 4;
                        break;
                    case 5:
                        str = "LOWER_CASE_WITH_DASHES";
                        i22 = 5;
                        break;
                    default:
                        str = "LOWER_CASE_WITH_DOTS";
                        i22 = 6;
                        break;
                }
                super(str, i22);
            }

            @Override // X.InterfaceC6749EYj
            public final String AhN(Field field) {
                String name;
                char c;
                switch (this.$t) {
                    case 0:
                        return field.getName();
                    case 1:
                        return HCC.A00(field.getName());
                    case 2:
                        return HCC.A00(HCC.A01(field.getName(), ' '));
                    case 3:
                        return HCC.A01(field.getName(), '_').toUpperCase(Locale.ENGLISH);
                    case 4:
                        name = field.getName();
                        c = '_';
                        break;
                    case 5:
                        name = field.getName();
                        c = '-';
                        break;
                    default:
                        name = field.getName();
                        c = '.';
                        break;
                }
                return HCC.A01(name, c).toLowerCase(Locale.ENGLISH);
            }
        };
        final int i4 = 3;
        HCC hcc4 = new HCC(i4) { // from class: X.I0L
            public final int $t;

            /* JADX WARN: Illegal instructions before constructor call */
            {
                String str;
                int i22;
                this.$t = i4;
                switch (i4) {
                    case 0:
                        str = "IDENTITY";
                        i22 = 0;
                        break;
                    case 1:
                        str = "UPPER_CAMEL_CASE";
                        i22 = 1;
                        break;
                    case 2:
                        str = "UPPER_CAMEL_CASE_WITH_SPACES";
                        i22 = 2;
                        break;
                    case 3:
                        str = "UPPER_CASE_WITH_UNDERSCORES";
                        i22 = 3;
                        break;
                    case 4:
                        str = "LOWER_CASE_WITH_UNDERSCORES";
                        i22 = 4;
                        break;
                    case 5:
                        str = "LOWER_CASE_WITH_DASHES";
                        i22 = 5;
                        break;
                    default:
                        str = "LOWER_CASE_WITH_DOTS";
                        i22 = 6;
                        break;
                }
                super(str, i22);
            }

            @Override // X.InterfaceC6749EYj
            public final String AhN(Field field) {
                String name;
                char c;
                switch (this.$t) {
                    case 0:
                        return field.getName();
                    case 1:
                        return HCC.A00(field.getName());
                    case 2:
                        return HCC.A00(HCC.A01(field.getName(), ' '));
                    case 3:
                        return HCC.A01(field.getName(), '_').toUpperCase(Locale.ENGLISH);
                    case 4:
                        name = field.getName();
                        c = '_';
                        break;
                    case 5:
                        name = field.getName();
                        c = '-';
                        break;
                    default:
                        name = field.getName();
                        c = '.';
                        break;
                }
                return HCC.A01(name, c).toLowerCase(Locale.ENGLISH);
            }
        };
        final int i5 = 4;
        HCC hcc5 = new HCC(i5) { // from class: X.I0L
            public final int $t;

            /* JADX WARN: Illegal instructions before constructor call */
            {
                String str;
                int i22;
                this.$t = i5;
                switch (i5) {
                    case 0:
                        str = "IDENTITY";
                        i22 = 0;
                        break;
                    case 1:
                        str = "UPPER_CAMEL_CASE";
                        i22 = 1;
                        break;
                    case 2:
                        str = "UPPER_CAMEL_CASE_WITH_SPACES";
                        i22 = 2;
                        break;
                    case 3:
                        str = "UPPER_CASE_WITH_UNDERSCORES";
                        i22 = 3;
                        break;
                    case 4:
                        str = "LOWER_CASE_WITH_UNDERSCORES";
                        i22 = 4;
                        break;
                    case 5:
                        str = "LOWER_CASE_WITH_DASHES";
                        i22 = 5;
                        break;
                    default:
                        str = "LOWER_CASE_WITH_DOTS";
                        i22 = 6;
                        break;
                }
                super(str, i22);
            }

            @Override // X.InterfaceC6749EYj
            public final String AhN(Field field) {
                String name;
                char c;
                switch (this.$t) {
                    case 0:
                        return field.getName();
                    case 1:
                        return HCC.A00(field.getName());
                    case 2:
                        return HCC.A00(HCC.A01(field.getName(), ' '));
                    case 3:
                        return HCC.A01(field.getName(), '_').toUpperCase(Locale.ENGLISH);
                    case 4:
                        name = field.getName();
                        c = '_';
                        break;
                    case 5:
                        name = field.getName();
                        c = '-';
                        break;
                    default:
                        name = field.getName();
                        c = '.';
                        break;
                }
                return HCC.A01(name, c).toLowerCase(Locale.ENGLISH);
            }
        };
        final int i6 = 5;
        HCC hcc6 = new HCC(i6) { // from class: X.I0L
            public final int $t;

            /* JADX WARN: Illegal instructions before constructor call */
            {
                String str;
                int i22;
                this.$t = i6;
                switch (i6) {
                    case 0:
                        str = "IDENTITY";
                        i22 = 0;
                        break;
                    case 1:
                        str = "UPPER_CAMEL_CASE";
                        i22 = 1;
                        break;
                    case 2:
                        str = "UPPER_CAMEL_CASE_WITH_SPACES";
                        i22 = 2;
                        break;
                    case 3:
                        str = "UPPER_CASE_WITH_UNDERSCORES";
                        i22 = 3;
                        break;
                    case 4:
                        str = "LOWER_CASE_WITH_UNDERSCORES";
                        i22 = 4;
                        break;
                    case 5:
                        str = "LOWER_CASE_WITH_DASHES";
                        i22 = 5;
                        break;
                    default:
                        str = "LOWER_CASE_WITH_DOTS";
                        i22 = 6;
                        break;
                }
                super(str, i22);
            }

            @Override // X.InterfaceC6749EYj
            public final String AhN(Field field) {
                String name;
                char c;
                switch (this.$t) {
                    case 0:
                        return field.getName();
                    case 1:
                        return HCC.A00(field.getName());
                    case 2:
                        return HCC.A00(HCC.A01(field.getName(), ' '));
                    case 3:
                        return HCC.A01(field.getName(), '_').toUpperCase(Locale.ENGLISH);
                    case 4:
                        name = field.getName();
                        c = '_';
                        break;
                    case 5:
                        name = field.getName();
                        c = '-';
                        break;
                    default:
                        name = field.getName();
                        c = '.';
                        break;
                }
                return HCC.A01(name, c).toLowerCase(Locale.ENGLISH);
            }
        };
        final int i7 = 6;
        A00 = new HCC[]{hcc, hcc2, hcc3, hcc4, hcc5, hcc6, new HCC(i7) { // from class: X.I0L
            public final int $t;

            /* JADX WARN: Illegal instructions before constructor call */
            {
                String str;
                int i22;
                this.$t = i7;
                switch (i7) {
                    case 0:
                        str = "IDENTITY";
                        i22 = 0;
                        break;
                    case 1:
                        str = "UPPER_CAMEL_CASE";
                        i22 = 1;
                        break;
                    case 2:
                        str = "UPPER_CAMEL_CASE_WITH_SPACES";
                        i22 = 2;
                        break;
                    case 3:
                        str = "UPPER_CASE_WITH_UNDERSCORES";
                        i22 = 3;
                        break;
                    case 4:
                        str = "LOWER_CASE_WITH_UNDERSCORES";
                        i22 = 4;
                        break;
                    case 5:
                        str = "LOWER_CASE_WITH_DASHES";
                        i22 = 5;
                        break;
                    default:
                        str = "LOWER_CASE_WITH_DOTS";
                        i22 = 6;
                        break;
                }
                super(str, i22);
            }

            @Override // X.InterfaceC6749EYj
            public final String AhN(Field field) {
                String name;
                char c;
                switch (this.$t) {
                    case 0:
                        return field.getName();
                    case 1:
                        return HCC.A00(field.getName());
                    case 2:
                        return HCC.A00(HCC.A01(field.getName(), ' '));
                    case 3:
                        return HCC.A01(field.getName(), '_').toUpperCase(Locale.ENGLISH);
                    case 4:
                        name = field.getName();
                        c = '_';
                        break;
                    case 5:
                        name = field.getName();
                        c = '-';
                        break;
                    default:
                        name = field.getName();
                        c = '.';
                        break;
                }
                return HCC.A01(name, c).toLowerCase(Locale.ENGLISH);
            }
        }};
    }

    public static HCC valueOf(String str) {
        return (HCC) Enum.valueOf(HCC.class, str);
    }

    public static HCC[] values() {
        return (HCC[]) A00.clone();
    }

    public static String A00(String str) {
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char cCharAt = str.charAt(i);
            if (Character.isLetter(cCharAt)) {
                if (Character.isUpperCase(cCharAt)) {
                    return str;
                }
                char upperCase = Character.toUpperCase(cCharAt);
                int i2 = 1;
                StringBuilder sbA0w = C60O.A0w();
                if (i == 0) {
                    sbA0w.append(upperCase);
                } else {
                    sbA0w.append(str.substring(0, i));
                    sbA0w.append(upperCase);
                    i2 = i + 1;
                }
                return AnonymousClass001.A0v(str.substring(i2), sbA0w);
            }
        }
        return str;
    }

    public static String A01(String str, char c) {
        StringBuilder sbA0w = C60O.A0w();
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char cCharAt = str.charAt(i);
            if (Character.isUpperCase(cCharAt) && sbA0w.length() != 0) {
                sbA0w.append(c);
            }
            sbA0w.append(cCharAt);
        }
        return sbA0w.toString();
    }

    public HCC(String str, int i) {
    }
}
