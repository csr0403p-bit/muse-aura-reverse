package X;

/* renamed from: X.Gm8, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C9950Gm8 extends AbstractC10164GqZ {
    public final String A00;
    public final String A01;
    public final boolean A02;
    public final boolean A03;
    public final AbstractC9901Gkh<?> A04;
    public final C9909Gkr A05;
    public final String A06;

    public static String A00(C9950Gm8 c9950Gm8, String str, String str2) {
        boolean z = c9950Gm8.A03;
        int length = str.length();
        return z ? A02(str2, length) : A01(str2, length);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0045, code lost:
    
        if (r2.startsWith(r0) == false) goto L23;
     */
    @Override // X.AbstractC10164GqZ
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String A04(X.C9934Glc r5, java.lang.String r6) {
        /*
            r4 = this;
            java.lang.String r1 = r4.A06
            r3 = 0
            if (r1 == 0) goto L47
            boolean r0 = r6.startsWith(r1)
            if (r0 == 0) goto L47
            java.lang.String r0 = "getCallbacks"
            boolean r0 = r0.equals(r6)
            if (r0 == 0) goto L48
            java.lang.reflect.Method r0 = r5.A00
            java.lang.Class r2 = r0.getReturnType()
            boolean r0 = r2.isArray()
            if (r0 == 0) goto L5d
            java.lang.Class r0 = r2.getComponentType()
            java.lang.String r2 = r0.getName()
            java.lang.String r0 = ".cglib"
            boolean r0 = r2.contains(r0)
            if (r0 == 0) goto L5d
            java.lang.String r0 = "net.sf.cglib"
            boolean r0 = r2.startsWith(r0)
            if (r0 != 0) goto L47
            java.lang.String r0 = "org.hibernate.repackage.cglib"
            boolean r0 = r2.startsWith(r0)
            if (r0 != 0) goto L47
            java.lang.String r0 = "org.springframework.cglib"
        L41:
            boolean r0 = r2.startsWith(r0)
            if (r0 == 0) goto L5d
        L47:
            return r3
        L48:
            java.lang.String r0 = "getMetaClass"
            boolean r0 = r0.equals(r6)
            if (r0 == 0) goto L5d
            java.lang.reflect.Method r0 = r5.A00
            java.lang.Class r0 = r0.getReturnType()
            java.lang.String r2 = r0.getName()
            java.lang.String r0 = "groovy.lang"
            goto L41
        L5d:
            java.lang.String r3 = A00(r4, r1, r6)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C9950Gm8.A04(X.Glc, java.lang.String):java.lang.String");
    }

    public C9950Gm8(AbstractC9901Gkh abstractC9901Gkh, C9909Gkr c9909Gkr, String str, String str2, String str3) {
        this.A04 = abstractC9901Gkh;
        this.A05 = c9909Gkr;
        this.A03 = abstractC9901Gkh.A09(EnumC9951GmA.A0W);
        this.A02 = abstractC9901Gkh.A09(EnumC9951GmA.A07);
        this.A01 = str;
        this.A06 = str2;
        this.A00 = str3;
    }

    public static final String A01(String str, int i) {
        int length = str.length();
        if (length == i) {
            return null;
        }
        char cCharAt = str.charAt(i);
        char lowerCase = Character.toLowerCase(cCharAt);
        if (cCharAt == lowerCase) {
            return str.substring(i);
        }
        StringBuilder sbA0p = BV4.A0p(length - i);
        while (true) {
            sbA0p.append(lowerCase);
            i++;
            if (i >= length) {
                break;
            }
            char cCharAt2 = str.charAt(i);
            lowerCase = Character.toLowerCase(cCharAt2);
            if (cCharAt2 == lowerCase) {
                sbA0p.append((CharSequence) str, i, length);
                break;
            }
        }
        return sbA0p.toString();
    }

    public static final String A02(String str, int i) {
        int i2;
        int length = str.length();
        if (length == i) {
            return null;
        }
        char cCharAt = str.charAt(i);
        char lowerCase = Character.toLowerCase(cCharAt);
        if (cCharAt == lowerCase || ((i2 = i + 1) < length && Character.isUpperCase(str.charAt(i2)))) {
            return str.substring(i);
        }
        StringBuilder sbA0p = BV4.A0p(length - i);
        sbA0p.append(lowerCase);
        sbA0p.append((CharSequence) str, i2, length);
        return sbA0p.toString();
    }
}
