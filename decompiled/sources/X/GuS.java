package X;

import java.util.Arrays;
import org.jsoup.helper.ValidationException;

/* loaded from: classes6.dex */
public abstract class GuS extends AbstractC10326Gug {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public String A05;
    public Gt7 A06;
    public C10312GuO A07;
    public boolean A08;
    public boolean A09;
    public int[] A0A;
    public String[] A0B;
    public final C10316GuW A0C;
    public final C10312GuO A0D;
    public final C10312GuO A0E;
    public final boolean A0F;

    public final void A09(String str) {
        String strReplace = str.replace((char) 0, '\ufffd');
        C10312GuO c10312GuO = this.A07;
        c10312GuO.A03(strReplace);
        this.A05 = Gu9.A00(c10312GuO.A00());
    }

    public final void A0D(int[] iArr, int i, int i2) {
        for (int i3 : iArr) {
            C10312GuO c10312GuO = this.A0E;
            StringBuilder sbA0t = c10312GuO.A01;
            if (sbA0t != null) {
                sbA0t.appendCodePoint(i3);
            } else if (c10312GuO.A00 != null) {
                sbA0t = AbstractC7609F5w.A0t();
                c10312GuO.A01 = sbA0t;
                sbA0t.append(c10312GuO.A00);
                c10312GuO.A00 = null;
                sbA0t.appendCodePoint(i3);
            } else {
                c10312GuO.A00 = String.valueOf(Character.toChars(i3));
            }
        }
        if (this.A0F) {
            int i4 = this.A04;
            if (i4 > -1) {
                i = i4;
            }
            this.A04 = i;
            this.A03 = i2;
        }
    }

    public abstract String toString();

    public static String A00(Object obj) {
        return ((GuS) obj).A04();
    }

    public static String A01(GuS guS) {
        String strA00 = guS.A07.A00();
        return strA00.isEmpty() ? "[unset]" : strA00;
    }

    private void A02() {
        this.A0D.A01();
        this.A0E.A01();
        this.A08 = false;
        if (this.A0F) {
            this.A03 = -1;
            this.A04 = -1;
            this.A00 = -1;
            this.A01 = -1;
        }
    }

    public final String A04() {
        String str = this.A05;
        if (str == null || str.isEmpty()) {
            throw new ValidationException("Must be false");
        }
        return str;
    }

    public final void A06() {
        int i;
        Gt7 gt7 = this.A06;
        if (gt7 == null) {
            gt7 = new Gt7();
            this.A06 = gt7;
        }
        C10312GuO c10312GuO = this.A0D;
        if ((c10312GuO.A01 != null || c10312GuO.A00 != null) && gt7.A05() < 512) {
            String strTrim = c10312GuO.A00().trim();
            if (!strTrim.isEmpty()) {
                C10312GuO c10312GuO2 = this.A0E;
                Gt7.A02((c10312GuO2.A01 == null && c10312GuO2.A00 == null) ? this.A08 ? "" : null : c10312GuO2.A00(), strTrim, this.A06);
                if (this.A0C.A0M && AnonymousClass002.A1Z(super.A02, C79.A01)) {
                    if (c10312GuO2.A01 == null && c10312GuO2.A00 == null) {
                        int i2 = this.A00;
                        this.A03 = i2;
                        this.A04 = i2;
                    }
                    int i3 = this.A01;
                    int i4 = this.A00;
                    int i5 = this.A04;
                    int i6 = this.A03;
                    int i7 = this.A02 + 1;
                    String[] strArr = this.A0B;
                    if (strArr != null) {
                        int length = strArr.length;
                        i = length < i7 ? length * 2 : 3;
                        String[] strArr2 = this.A0B;
                        int i8 = this.A02;
                        strArr2[i8] = strTrim;
                        int i9 = i8 * 4;
                        int[] iArr = this.A0A;
                        iArr[i9] = i3;
                        iArr[i9 + 1] = i4;
                        iArr[i9 + 2] = i5;
                        iArr[i9 + 3] = i6;
                        this.A02 = i8 + 1;
                    }
                    if (i >= i7) {
                        i7 = i;
                    }
                    this.A0B = strArr == null ? new String[i7] : (String[]) Arrays.copyOf(strArr, i7);
                    int[] iArr2 = this.A0A;
                    int i10 = i7 * 4;
                    this.A0A = iArr2 == null ? new int[i10] : Arrays.copyOf(iArr2, i10);
                    String[] strArr22 = this.A0B;
                    int i82 = this.A02;
                    strArr22[i82] = strTrim;
                    int i92 = i82 * 4;
                    int[] iArr3 = this.A0A;
                    iArr3[i92] = i3;
                    iArr3[i92 + 1] = i4;
                    iArr3[i92 + 2] = i5;
                    iArr3[i92 + 3] = i6;
                    this.A02 = i82 + 1;
                }
            }
        }
        A02();
    }

    public final void A07(char c, int i, int i2) {
        this.A0D.A02(c);
        if (this.A0F) {
            int i3 = this.A01;
            if (i3 > -1) {
                i = i3;
            }
            this.A01 = i;
            this.A00 = i2;
        }
    }

    public final void A08(char c, int i, int i2) {
        this.A0E.A02(c);
        if (this.A0F) {
            int i3 = this.A04;
            if (i3 > -1) {
                i = i3;
            }
            this.A04 = i;
            this.A03 = i2;
        }
    }

    public final void A0A(String str) {
        C10312GuO c10312GuO = this.A07;
        c10312GuO.A01();
        c10312GuO.A00 = str;
        this.A05 = Gu9.A00(c10312GuO.A00());
    }

    public final void A0B(String str, int i, int i2) {
        this.A0E.A03(str);
        if (this.A0F) {
            int i3 = this.A04;
            if (i3 > -1) {
                i = i3;
            }
            this.A04 = i;
            this.A03 = i2;
        }
    }

    public final void A0C(C10308GuJ c10308GuJ) {
        int i;
        C10316GuW c10316GuW = this.A0C;
        if (!c10316GuW.A0M || (i = this.A02) == 0 || this.A06 == null) {
            return;
        }
        this.A02 = 0;
        for (int i2 = 0; i2 < i; i2++) {
            String str = this.A0B[i2];
            str.getClass();
            String strTrim = str.trim();
            if (!c10308GuJ.A00) {
                strTrim = AnonymousClass001.A0u(strTrim);
            }
            if (this.A06.A0C(strTrim).A01 == -1) {
                int i3 = i2 * 4;
                Gt7 gt7 = this.A06;
                C10307GuI c10307GuI = c10316GuW.A03;
                int[] iArr = this.A0A;
                int i4 = iArr[i3];
                int i5 = iArr[i3 + 1];
                int i6 = iArr[i3 + 2];
                int i7 = iArr[i3 + 3];
                C10293Gtx.A00(gt7);
                int iA07 = gt7.A07(strTrim);
                if (iA07 != -1) {
                    Gt7.A01(gt7).A02(c10307GuI, iA07, i4, i5, i6, i7);
                }
            }
            this.A0B[i2] = null;
        }
    }

    public GuS(Integer num, C10316GuW c10316GuW) {
        super(num);
        this.A07 = new C10312GuO();
        this.A09 = false;
        this.A0D = new C10312GuO();
        this.A0E = new C10312GuO();
        this.A08 = false;
        this.A0C = c10316GuW;
        this.A0F = c10316GuW.A0M;
    }

    @Override // X.AbstractC10326Gug
    /* renamed from: A05, reason: merged with bridge method [inline-methods] */
    public void A03() {
        super.A03();
        this.A07.A01();
        this.A05 = null;
        this.A09 = false;
        this.A06 = null;
        String[] strArr = this.A0B;
        if (strArr != null) {
            Arrays.fill(strArr, 0, this.A02, (Object) null);
        }
        this.A02 = 0;
        A02();
    }
}
