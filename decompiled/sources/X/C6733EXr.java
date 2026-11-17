package X;

import com.facebook.aura.ccv.nativeflow.ui.HatchCcvLoggingKt;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;
import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
import java.io.Writer;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.regex.Pattern;

/* renamed from: X.EXr, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C6733EXr implements Closeable, Flushable {
    public static final Pattern A0B = Pattern.compile("-?(?:0|[1-9][0-9]*)(?:\\.[0-9]+)?(?:[eE][-+]?[0-9]+)?");
    public static final String[] A0C;
    public static final String[] A0D;
    public int A00;
    public Integer A01;
    public String A02;
    public boolean A03;
    public boolean A04;
    public int[] A05;
    public C6738EXw A06;
    public String A07;
    public String A08;
    public boolean A09;
    public final Writer A0A;

    static {
        String[] strArr = new String[128];
        A0D = strArr;
        int i = 0;
        do {
            strArr[i] = String.format("\\u%04x", BV5.A1Y(i));
            i++;
        } while (i <= 31);
        BV5.A1M(strArr);
        String[] strArr2 = (String[]) strArr.clone();
        A0C = strArr2;
        strArr2[60] = "\\u003c";
        strArr2[62] = "\\u003e";
        strArr2[38] = "\\u0026";
        strArr2[61] = "\\u003d";
        strArr2[39] = "\\u0027";
    }

    private void A01() throws IOException {
        if (this.A09) {
            return;
        }
        Writer writer = this.A0A;
        writer.write(this.A06.A01);
        int i = this.A00;
        for (int i2 = 1; i2 < i; i2++) {
            writer.write(this.A06.A00);
        }
    }

    private void A02(char c, int i, int i2) throws IOException {
        int i3 = this.A00;
        if (i3 == 0) {
            throw C3cG.A0Q("JsonWriter is closed.");
        }
        int i4 = i3 - 1;
        int i5 = this.A05[i4];
        if (i5 != i2 && i5 != i) {
            throw C3cG.A0Q("Nesting problem.");
        }
        String str = this.A07;
        if (str != null) {
            throw BV5.A0U("Dangling name: ", str);
        }
        this.A00 = i4;
        if (i5 == i2) {
            A01();
        }
        this.A0A.write(c);
    }

    public static void A04(C6733EXr c6733EXr) throws IOException {
        int i;
        int i2 = c6733EXr.A00;
        if (i2 == 0) {
            throw C3cG.A0Q("JsonWriter is closed.");
        }
        int[] iArr = c6733EXr.A05;
        int i3 = i2 - 1;
        int i4 = iArr[i3];
        if (i4 == 1) {
            iArr[i3] = 2;
        } else {
            if (i4 != 2) {
                if (i4 != 4) {
                    i = 7;
                    if (i4 != 6) {
                        if (i4 != 7) {
                            throw C3cG.A0Q("Nesting problem.");
                        }
                        if (c6733EXr.A01 != C79.A00) {
                            throw C3cG.A0Q("JSON must have only one top-level value.");
                        }
                    }
                } else {
                    c6733EXr.A0A.append((CharSequence) c6733EXr.A08);
                    i = 5;
                }
                c6733EXr.A05[c6733EXr.A00 - 1] = i;
                return;
            }
            c6733EXr.A0A.append((CharSequence) c6733EXr.A02);
        }
        c6733EXr.A01();
    }

    public static void A05(C6733EXr c6733EXr) throws IOException {
        if (c6733EXr.A07 != null) {
            int i = c6733EXr.A00;
            if (i == 0) {
                throw C3cG.A0Q("JsonWriter is closed.");
            }
            int i2 = c6733EXr.A05[i - 1];
            if (i2 == 5) {
                c6733EXr.A0A.write(c6733EXr.A02);
            } else if (i2 != 3) {
                throw C3cG.A0Q("Nesting problem.");
            }
            c6733EXr.A01();
            c6733EXr.A05[c6733EXr.A00 - 1] = 4;
            c6733EXr.A06(c6733EXr.A07);
            c6733EXr.A07 = null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void A06(java.lang.String r9) throws java.io.IOException {
        /*
            r8 = this;
            boolean r0 = r8.A03
            if (r0 == 0) goto L3e
            java.lang.String[] r7 = X.C6733EXr.A0C
        L6:
            java.io.Writer r6 = r8.A0A
            r5 = 34
            r6.write(r5)
            int r4 = r9.length()
            r3 = 0
            r2 = 0
        L13:
            if (r3 >= r4) goto L41
            char r1 = r9.charAt(r3)
            r0 = 128(0x80, float:1.794E-43)
            if (r1 >= r0) goto L24
            r1 = r7[r1]
            if (r1 != 0) goto L2a
        L21:
            int r3 = r3 + 1
            goto L13
        L24:
            r0 = 8232(0x2028, float:1.1535E-41)
            if (r1 != r0) goto L37
            java.lang.String r1 = "\\u2028"
        L2a:
            if (r2 >= r3) goto L31
            int r0 = r3 - r2
            r6.write(r9, r2, r0)
        L31:
            r6.write(r1)
            int r2 = r3 + 1
            goto L21
        L37:
            r0 = 8233(0x2029, float:1.1537E-41)
            if (r1 != r0) goto L21
            java.lang.String r1 = "\\u2029"
            goto L2a
        L3e:
            java.lang.String[] r7 = X.C6733EXr.A0D
            goto L6
        L41:
            if (r2 >= r4) goto L47
            int r4 = r4 - r2
            r6.write(r9, r2, r4)
        L47:
            r6.write(r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C6733EXr.A06(java.lang.String):void");
    }

    public final void A07() throws IOException {
        if (!(this instanceof EXM)) {
            A05(this);
            A03(1, '[');
        } else {
            EXM exm = (EXM) this;
            JsonArray jsonArray = new JsonArray();
            EXM.A00(jsonArray, exm);
            exm.A02.add(jsonArray);
        }
    }

    public final void A08() throws IOException {
        if (!(this instanceof EXM)) {
            A05(this);
            A03(3, '{');
        } else {
            EXM exm = (EXM) this;
            JsonObject jsonObject = new JsonObject();
            EXM.A00(jsonObject, exm);
            exm.A02.add(jsonObject);
        }
    }

    public final void A09() throws IOException {
        if (!(this instanceof EXM)) {
            A02(']', 1, 2);
            return;
        }
        EXM exm = (EXM) this;
        List<JsonElement> list = exm.A02;
        if (list.isEmpty() || exm.A01 != null) {
            throw BV4.A0T();
        }
        if (!(BV5.A0e(list) instanceof JsonArray)) {
            throw BV4.A0T();
        }
        list.remove(C60O.A00(list));
    }

    public final void A0A() throws IOException {
        if (!(this instanceof EXM)) {
            A02('}', 3, 5);
            return;
        }
        EXM exm = (EXM) this;
        List<JsonElement> list = exm.A02;
        if (list.isEmpty() || exm.A01 != null) {
            throw BV4.A0T();
        }
        if (!(BV5.A0e(list) instanceof JsonObject)) {
            throw BV4.A0T();
        }
        list.remove(C60O.A00(list));
    }

    public final void A0B() throws IOException {
        if (this instanceof EXM) {
            EXM.A00(C6714EWu.A00, (EXM) this);
            return;
        }
        if (this.A07 != null) {
            if (!this.A04) {
                this.A07 = null;
                return;
            }
            A05(this);
        }
        A04(this);
        this.A0A.write(HatchCcvLoggingKt.NO_POSTAL_FIELD);
    }

    public final void A0C(double d) throws IOException {
        if (this instanceof EXM) {
            EXM exm = (EXM) this;
            if (((C6733EXr) exm).A01 == C79.A00 || !(Double.isNaN(d) || Double.isInfinite(d))) {
                EXM.A00(new JsonPrimitive(Double.valueOf(d)), exm);
                return;
            } else {
                StringBuilder sbA0x = C60O.A0x("JSON forbids NaN and infinities: ");
                sbA0x.append(d);
                throw C60O.A0i(sbA0x.toString());
            }
        }
        A05(this);
        if (this.A01 == C79.A00 || !(Double.isNaN(d) || Double.isInfinite(d))) {
            A04(this);
            this.A0A.append((CharSequence) Double.toString(d));
        } else {
            StringBuilder sbA0x2 = C60O.A0x("Numeric values must be finite, but was ");
            sbA0x2.append(d);
            throw C60O.A0i(sbA0x2.toString());
        }
    }

    public final void A0D(long j) throws IOException {
        if (this instanceof EXM) {
            EXM.A00(new JsonPrimitive(Long.valueOf(j)), (EXM) this);
        } else {
            A05(this);
            A04(this);
            this.A0A.write(Long.toString(j));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1, types: [X.EXr] */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4 */
    public final void A0F(Number number) throws IOException {
        boolean z = this instanceof EXM;
        ?? r3 = this;
        if (z) {
            EXM exm = (EXM) this;
            r3 = exm;
            if (number != null) {
                if (((C6733EXr) exm).A01 != C79.A00) {
                    double dDoubleValue = number.doubleValue();
                    if (Double.isNaN(dDoubleValue) || Double.isInfinite(dDoubleValue)) {
                        throw BV5.A0O(number, "JSON forbids NaN and infinities: ");
                    }
                }
                EXM.A00(new JsonPrimitive(number), exm);
                return;
            }
        } else if (number != null) {
            A05(this);
            String string = number.toString();
            Class<?> cls = number.getClass();
            if (cls != Integer.class && cls != Long.class && cls != Byte.class && cls != Short.class && cls != BigDecimal.class && cls != BigInteger.class && cls != AtomicInteger.class && cls != AtomicLong.class) {
                if (string.equals("-Infinity") || string.equals("Infinity") || string.equals("NaN")) {
                    if (this.A01 != C79.A00) {
                        throw C60Q.A0U("Numeric values must be finite, but was ", string);
                    }
                } else if (cls != Float.class && cls != Double.class && !A0B.matcher(string).matches()) {
                    StringBuilder sbA0f = C3cG.A0f(cls, "String created by ");
                    sbA0f.append(" is not a valid JSON number: ");
                    throw C8j3.A0w(string, sbA0f);
                }
            }
            A04(this);
            this.A0A.append((CharSequence) string);
            return;
        }
        r3.A0B();
    }

    public final void A0G(String str) {
        if (this instanceof EXM) {
            EXM exm = (EXM) this;
            Hqg.A00(str, "name == null");
            List<JsonElement> list = exm.A02;
            if (list.isEmpty() || exm.A01 != null) {
                throw C3cG.A0Q("Did not expect a name");
            }
            if (!(BV5.A0e(list) instanceof JsonObject)) {
                throw C3cG.A0Q("Please begin an object before writing a name.");
            }
            exm.A01 = str;
            return;
        }
        Hqg.A00(str, "name == null");
        if (this.A07 != null) {
            throw C3cG.A0Q("Already wrote a name, expecting a value.");
        }
        int i = this.A00;
        if (i == 0) {
            throw C3cG.A0Q("JsonWriter is closed.");
        }
        int i2 = this.A05[i - 1];
        if (i2 != 3 && i2 != 5) {
            throw C3cG.A0Q("Please begin an object before writing a name.");
        }
        this.A07 = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [X.EXr] */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4 */
    public final void A0H(String str) throws IOException {
        boolean z = this instanceof EXM;
        ?? r1 = this;
        if (z) {
            EXM exm = (EXM) this;
            r1 = exm;
            if (str != null) {
                EXM.A00(new JsonPrimitive(str), exm);
                return;
            }
        } else if (str != null) {
            A05(this);
            A04(this);
            A06(str);
            return;
        }
        r1.A0B();
    }

    public final void A0I(boolean z) throws IOException {
        if (this instanceof EXM) {
            EXM.A00(new JsonPrimitive(Boolean.valueOf(z)), (EXM) this);
            return;
        }
        A05(this);
        A04(this);
        this.A0A.write(z ? "true" : "false");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        if (this instanceof EXM) {
            List<JsonElement> list = ((EXM) this).A02;
            if (!list.isEmpty()) {
                throw BV4.A0K("Incomplete document");
            }
            list.add(EXM.A03);
            return;
        }
        this.A0A.close();
        int i = this.A00;
        if (i > 1 || (i == 1 && this.A05[0] != 7)) {
            throw BV4.A0K("Incomplete document");
        }
        this.A00 = 0;
    }

    @Override // java.io.Flushable
    public final void flush() throws IOException {
        if (this instanceof EXM) {
            return;
        }
        if (this.A00 == 0) {
            throw C3cG.A0Q("JsonWriter is closed.");
        }
        this.A0A.flush();
    }

    public C6733EXr(Writer writer) {
        int[] iArr = new int[32];
        this.A05 = iArr;
        this.A00 = 0;
        this.A00 = 1;
        iArr[0] = 6;
        this.A01 = C79.A01;
        this.A04 = true;
        Hqg.A00(writer, "out == null");
        this.A0A = writer;
        A0E(C6738EXw.A03);
    }

    private void A03(int i, char c) throws IOException {
        A04(this);
        int i2 = this.A00;
        int[] iArrCopyOf = this.A05;
        if (i2 == iArrCopyOf.length) {
            iArrCopyOf = Arrays.copyOf(iArrCopyOf, i2 * 2);
            this.A05 = iArrCopyOf;
        }
        int i3 = this.A00;
        this.A00 = i3 + 1;
        iArrCopyOf[i3] = i;
        this.A0A.write(c);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A0E(X.C6738EXw r3) {
        /*
            r2 = this;
            r3.getClass()
            r2.A06 = r3
            java.lang.String r0 = ","
            r2.A02 = r0
            boolean r0 = r3.A02
            if (r0 == 0) goto L32
            java.lang.String r0 = ": "
            r2.A08 = r0
            java.lang.String r0 = r3.A01
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L1d
            java.lang.String r0 = ", "
            r2.A02 = r0
        L1d:
            java.lang.String r0 = r3.A01
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L2e
            java.lang.String r0 = r3.A00
            boolean r1 = r0.isEmpty()
            r0 = 1
            if (r1 != 0) goto L2f
        L2e:
            r0 = 0
        L2f:
            r2.A09 = r0
            return
        L32:
            java.lang.String r0 = ":"
            r2.A08 = r0
            goto L1d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C6733EXr.A0E(X.EXw):void");
    }
}
