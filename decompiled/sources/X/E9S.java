package X;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'A03' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* loaded from: classes5.dex */
public abstract class E9S {
    public static final /* synthetic */ E9S[] A00;
    public static final E9S A01;
    public static final E9S A02;
    public static final E9S A03;
    public static final E9S A04;
    public static final E9S A05;

    static {
        final int i = 0;
        E9S e9s = new E9S(i) { // from class: X.F4D
            public final int $t;

            /* JADX WARN: Illegal instructions before constructor call */
            {
                String str;
                int i2;
                this.$t = i;
                switch (i) {
                    case 0:
                        str = "EXPLICIT";
                        i2 = 0;
                        break;
                    case 1:
                        str = "REPLACED";
                        i2 = 1;
                        break;
                    case 2:
                        str = "COLLECTED";
                        i2 = 2;
                        break;
                    case 3:
                        str = "EXPIRED";
                        i2 = 3;
                        break;
                    default:
                        str = "SIZE";
                        i2 = 4;
                        break;
                }
                super(str, i2);
            }
        };
        A03 = e9s;
        final int i2 = 1;
        E9S e9s2 = new E9S(i2) { // from class: X.F4D
            public final int $t;

            /* JADX WARN: Illegal instructions before constructor call */
            {
                String str;
                int i22;
                this.$t = i2;
                switch (i2) {
                    case 0:
                        str = "EXPLICIT";
                        i22 = 0;
                        break;
                    case 1:
                        str = "REPLACED";
                        i22 = 1;
                        break;
                    case 2:
                        str = "COLLECTED";
                        i22 = 2;
                        break;
                    case 3:
                        str = "EXPIRED";
                        i22 = 3;
                        break;
                    default:
                        str = "SIZE";
                        i22 = 4;
                        break;
                }
                super(str, i22);
            }
        };
        A04 = e9s2;
        final int i3 = 2;
        E9S e9s3 = new E9S(i3) { // from class: X.F4D
            public final int $t;

            /* JADX WARN: Illegal instructions before constructor call */
            {
                String str;
                int i22;
                this.$t = i3;
                switch (i3) {
                    case 0:
                        str = "EXPLICIT";
                        i22 = 0;
                        break;
                    case 1:
                        str = "REPLACED";
                        i22 = 1;
                        break;
                    case 2:
                        str = "COLLECTED";
                        i22 = 2;
                        break;
                    case 3:
                        str = "EXPIRED";
                        i22 = 3;
                        break;
                    default:
                        str = "SIZE";
                        i22 = 4;
                        break;
                }
                super(str, i22);
            }
        };
        A01 = e9s3;
        final int i4 = 3;
        E9S e9s4 = new E9S(i4) { // from class: X.F4D
            public final int $t;

            /* JADX WARN: Illegal instructions before constructor call */
            {
                String str;
                int i22;
                this.$t = i4;
                switch (i4) {
                    case 0:
                        str = "EXPLICIT";
                        i22 = 0;
                        break;
                    case 1:
                        str = "REPLACED";
                        i22 = 1;
                        break;
                    case 2:
                        str = "COLLECTED";
                        i22 = 2;
                        break;
                    case 3:
                        str = "EXPIRED";
                        i22 = 3;
                        break;
                    default:
                        str = "SIZE";
                        i22 = 4;
                        break;
                }
                super(str, i22);
            }
        };
        A02 = e9s4;
        final int i5 = 4;
        E9S e9s5 = new E9S(i5) { // from class: X.F4D
            public final int $t;

            /* JADX WARN: Illegal instructions before constructor call */
            {
                String str;
                int i22;
                this.$t = i5;
                switch (i5) {
                    case 0:
                        str = "EXPLICIT";
                        i22 = 0;
                        break;
                    case 1:
                        str = "REPLACED";
                        i22 = 1;
                        break;
                    case 2:
                        str = "COLLECTED";
                        i22 = 2;
                        break;
                    case 3:
                        str = "EXPIRED";
                        i22 = 3;
                        break;
                    default:
                        str = "SIZE";
                        i22 = 4;
                        break;
                }
                super(str, i22);
            }
        };
        A05 = e9s5;
        A00 = new E9S[]{e9s, e9s2, e9s3, e9s4, e9s5};
    }

    public static E9S valueOf(String name) {
        return (E9S) Enum.valueOf(E9S.class, name);
    }

    public static E9S[] values() {
        return (E9S[]) A00.clone();
    }

    public E9S(String $enum$name, int $enum$ordinal) {
    }
}
