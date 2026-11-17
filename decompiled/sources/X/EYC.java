package X;

import com.google.gson.JsonElement;
import com.google.gson.JsonIOException;
import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicLongArray;

/* loaded from: classes5.dex */
public final class EYC {
    public final InterfaceC6749EYj A00;
    public final C6738EXw A01;
    public final EY0 A02;
    public final EY0 A03;
    public final EYK A04;
    public final List<EYY> A05;
    public final List<EYY> A06;
    public final List<EYY> A07;
    public final List A08;
    public final Map A09;
    public final boolean A0A;
    public final EYQ A0B;
    public final EYD A0C;
    public final ThreadLocal<Map<C6753EYn<?>, AbstractC6735EXt<?>>> A0D;
    public final ConcurrentMap<C6753EYn<?>, AbstractC6735EXt<?>> A0E;
    public static final C6738EXw A0G = C6738EXw.A03;
    public static final InterfaceC6749EYj A0F = HCC.A01;
    public static final EY0 A0I = EY7.A01;
    public static final EY0 A0H = EY7.A02;

    /* JADX WARN: Illegal instructions before constructor call */
    public EYC() {
        EYK eyk = EYK.A02;
        InterfaceC6749EYj interfaceC6749EYj = A0F;
        Map map = Collections.EMPTY_MAP;
        C6738EXw c6738EXw = A0G;
        HOE hoe = HOE.A01;
        List list = Collections.EMPTY_LIST;
        this(interfaceC6749EYj, c6738EXw, hoe, A0I, A0H, eyk, list, list, list, list, map, true);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0013  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0079 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x000c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final <T> T A02(java.lang.String r7, java.lang.Class<T> r8) {
        /*
            r6 = this;
            X.EYn r5 = new X.EYn
            r5.<init>(r8)
            if (r7 != 0) goto L4b
            r2 = 0
        L8:
            java.lang.Class r0 = java.lang.Integer.TYPE
            if (r8 != r0) goto L13
            java.lang.Class<java.lang.Integer> r8 = java.lang.Integer.class
        Le:
            java.lang.Object r0 = r8.cast(r2)
            return r0
        L13:
            java.lang.Class r0 = java.lang.Float.TYPE
            if (r8 != r0) goto L1a
            java.lang.Class<java.lang.Float> r8 = java.lang.Float.class
            goto Le
        L1a:
            java.lang.Class r0 = java.lang.Byte.TYPE
            if (r8 != r0) goto L21
            java.lang.Class<java.lang.Byte> r8 = java.lang.Byte.class
            goto Le
        L21:
            java.lang.Class r0 = java.lang.Double.TYPE
            if (r8 != r0) goto L28
            java.lang.Class<java.lang.Double> r8 = java.lang.Double.class
            goto Le
        L28:
            java.lang.Class r0 = java.lang.Long.TYPE
            if (r8 != r0) goto L2f
            java.lang.Class<java.lang.Long> r8 = java.lang.Long.class
            goto Le
        L2f:
            java.lang.Class r0 = java.lang.Character.TYPE
            if (r8 != r0) goto L36
            java.lang.Class<java.lang.Character> r8 = java.lang.Character.class
            goto Le
        L36:
            java.lang.Class r0 = java.lang.Boolean.TYPE
            if (r8 != r0) goto L3d
            java.lang.Class<java.lang.Boolean> r8 = java.lang.Boolean.class
            goto Le
        L3d:
            java.lang.Class r0 = java.lang.Short.TYPE
            if (r8 != r0) goto L44
            java.lang.Class<java.lang.Short> r8 = java.lang.Short.class
            goto Le
        L44:
            java.lang.Class r0 = java.lang.Void.TYPE
            if (r8 != r0) goto Le
            java.lang.Class<java.lang.Void> r8 = java.lang.Void.class
            goto Le
        L4b:
            java.io.StringReader r0 = new java.io.StringReader
            r0.<init>(r7)
            X.EY1 r4 = new X.EY1
            r4.<init>(r0)
            java.lang.Integer r3 = X.C79.A01
            r4.A08 = r3
            java.lang.String r2 = "AssertionError (GSON 2.12.1): "
            java.lang.Integer r0 = X.C79.A00
            r4.A08 = r0
            r4.A0R()     // Catch: java.io.EOFException -> L70 java.lang.AssertionError -> L89 java.lang.IllegalStateException -> L93 java.io.IOException -> Lae java.lang.Throwable -> Lb5
            r1 = 0
            X.EXt r0 = r6.A01(r5)     // Catch: java.io.EOFException -> L6e java.lang.AssertionError -> L89 java.lang.IllegalStateException -> L93 java.io.IOException -> Lae java.lang.Throwable -> Lb5
            java.lang.Object r2 = r0.read(r4)     // Catch: java.io.EOFException -> L6e java.lang.AssertionError -> L89 java.lang.IllegalStateException -> L93 java.io.IOException -> Lae java.lang.Throwable -> Lb5
            r4.A08 = r3
            goto L77
        L6e:
            r0 = move-exception
            goto L72
        L70:
            r0 = move-exception
            r1 = 1
        L72:
            if (r1 == 0) goto La8
            r4.A08 = r3
            r2 = 0
        L77:
            if (r2 == 0) goto L8
            java.lang.Integer r1 = r4.A0R()     // Catch: java.io.IOException -> L9a com.google.gson.stream.MalformedJsonException -> La1
            java.lang.Integer r0 = X.C79.A0c     // Catch: java.io.IOException -> L9a com.google.gson.stream.MalformedJsonException -> La1
            if (r1 == r0) goto L8
            java.lang.String r1 = "JSON document was not fully consumed."
            com.google.gson.JsonSyntaxException r0 = new com.google.gson.JsonSyntaxException     // Catch: java.io.IOException -> L9a com.google.gson.stream.MalformedJsonException -> La1
            r0.<init>(r1)     // Catch: java.io.IOException -> L9a com.google.gson.stream.MalformedJsonException -> La1
            throw r0     // Catch: java.io.IOException -> L9a com.google.gson.stream.MalformedJsonException -> La1
        L89:
            r1 = move-exception
            java.lang.String r0 = X.BV5.A0n(r2, r1)     // Catch: java.lang.Throwable -> Lb5
            java.lang.AssertionError r1 = X.Bb9.A00(r0, r1)     // Catch: java.lang.Throwable -> Lb5
            goto Lb4
        L93:
            r0 = move-exception
            com.google.gson.JsonSyntaxException r1 = new com.google.gson.JsonSyntaxException     // Catch: java.lang.Throwable -> Lb5
            r1.<init>(r0)     // Catch: java.lang.Throwable -> Lb5
            goto Lb4
        L9a:
            r0 = move-exception
            com.google.gson.JsonIOException r1 = new com.google.gson.JsonIOException
            r1.<init>(r0)
            throw r1
        La1:
            r0 = move-exception
            com.google.gson.JsonSyntaxException r1 = new com.google.gson.JsonSyntaxException
            r1.<init>(r0)
            throw r1
        La8:
            com.google.gson.JsonSyntaxException r1 = new com.google.gson.JsonSyntaxException     // Catch: java.lang.Throwable -> Lb5
            r1.<init>(r0)     // Catch: java.lang.Throwable -> Lb5
            goto Lb4
        Lae:
            r0 = move-exception
            com.google.gson.JsonSyntaxException r1 = new com.google.gson.JsonSyntaxException     // Catch: java.lang.Throwable -> Lb5
            r1.<init>(r0)     // Catch: java.lang.Throwable -> Lb5
        Lb4:
            throw r1     // Catch: java.lang.Throwable -> Lb5
        Lb5:
            r0 = move-exception
            r4.A08 = r3
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.EYC.A02(java.lang.String, java.lang.Class):java.lang.Object");
    }

    public final String A03(JsonElement jsonElement) {
        StringWriter stringWriter = new StringWriter();
        try {
            C6733EXr c6733EXr = new C6733EXr(stringWriter instanceof Writer ? stringWriter : new EYX(stringWriter));
            c6733EXr.A0E(this.A01);
            boolean z = this.A0A;
            c6733EXr.A03 = z;
            c6733EXr.A01 = C79.A01;
            c6733EXr.A04 = false;
            c6733EXr.A03 = z;
            c6733EXr.A04 = false;
            c6733EXr.A01 = C79.A00;
            try {
                EYB.A0F.write(c6733EXr, jsonElement);
                return stringWriter.toString();
            } catch (IOException e) {
                throw new JsonIOException(e);
            } catch (AssertionError e2) {
                throw Bb9.A00(BV5.A0n("AssertionError (GSON 2.12.1): ", e2), e2);
            }
        } catch (IOException e3) {
            throw new JsonIOException(e3);
        }
    }

    public final String A04(Object obj, Type type) {
        StringWriter stringWriter = new StringWriter();
        try {
            C6733EXr c6733EXr = new C6733EXr(stringWriter instanceof Writer ? stringWriter : new EYX(stringWriter));
            c6733EXr.A0E(this.A01);
            boolean z = this.A0A;
            c6733EXr.A03 = z;
            Integer num = C79.A01;
            c6733EXr.A01 = num;
            c6733EXr.A04 = false;
            AbstractC6735EXt abstractC6735EXtA00 = C6753EYn.A00(this, type);
            if (c6733EXr.A01 == num) {
                c6733EXr.A01 = C79.A00;
            }
            c6733EXr.A03 = z;
            c6733EXr.A04 = false;
            try {
                try {
                    abstractC6735EXtA00.write(c6733EXr, obj);
                    return stringWriter.toString();
                } catch (AssertionError e) {
                    throw Bb9.A00(BV5.A0n("AssertionError (GSON 2.12.1): ", e), e);
                }
            } catch (IOException e2) {
                throw new JsonIOException(e2);
            }
        } catch (IOException e3) {
            throw new JsonIOException(e3);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x004a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final <T> X.AbstractC6735EXt<T> A00(X.EYY r7, X.C6753EYn<T> r8) {
        /*
            r6 = this;
            java.lang.String r0 = "skipPast must not be null"
            X.Hqg.A00(r7, r0)
            java.lang.String r0 = "type must not be null"
            X.Hqg.A00(r8, r0)
            X.EYD r5 = r6.A0C
            X.EYY r0 = X.EYD.A02
            if (r7 == r0) goto L4a
            java.lang.Class<? super T> r4 = r8.A01
            java.util.concurrent.ConcurrentMap<java.lang.Class<?>, X.EYY> r3 = r5.A01
            java.lang.Object r1 = r3.get(r4)
            if (r1 != 0) goto L48
            java.lang.Class<com.google.gson.annotations.JsonAdapter> r0 = com.google.gson.annotations.JsonAdapter.class
            java.lang.annotation.Annotation r0 = r4.getAnnotation(r0)
            com.google.gson.annotations.JsonAdapter r0 = (com.google.gson.annotations.JsonAdapter) r0
            if (r0 == 0) goto L4b
            java.lang.Class r2 = r0.value()
            java.lang.Class<X.EYY> r0 = X.EYY.class
            boolean r0 = r0.isAssignableFrom(r2)
            if (r0 == 0) goto L4b
            X.EYQ r1 = r5.A00
            X.EYn r0 = new X.EYn
            r0.<init>(r2)
            X.EXx r0 = r1.A01(r0)
            java.lang.Object r1 = r0.A6t()
            java.lang.Object r0 = r3.putIfAbsent(r4, r1)
            if (r0 == 0) goto L48
            r1 = r0
        L48:
            if (r1 != r7) goto L4b
        L4a:
            r7 = r5
        L4b:
            java.util.List<X.EYY> r0 = r6.A07
            java.util.Iterator r2 = r0.iterator()
            r1 = 0
        L52:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L6b
            java.lang.Object r0 = r2.next()
            X.EYY r0 = (X.EYY) r0
            if (r1 != 0) goto L64
            if (r0 != r7) goto L52
            r1 = 1
            goto L52
        L64:
            X.EXt r0 = r0.create(r6, r8)
            if (r0 == 0) goto L52
            return r0
        L6b:
            if (r1 != 0) goto L72
            X.EXt r0 = r6.A01(r8)
            return r0
        L72:
            java.lang.String r0 = "GSON cannot serialize or deserialize "
            java.lang.IllegalArgumentException r0 = X.BV5.A0O(r8, r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.EYC.A00(X.EYY, X.EYn):X.EXt");
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x005e, code lost:
    
        if (r4 == false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0060, code lost:
    
        r6.remove();
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0063, code lost:
    
        if (r1 == null) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0065, code lost:
    
        if (r4 == false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0067, code lost:
    
        r7.putAll(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x006a, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0078, code lost:
    
        throw X.BV5.A0O(r9, "GSON (2.12.1) cannot handle ");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final <T> X.AbstractC6735EXt<T> A01(X.C6753EYn<T> r9) {
        /*
            r8 = this;
            java.lang.String r0 = "type must not be null"
            X.Hqg.A00(r9, r0)
            java.util.concurrent.ConcurrentMap<X.EYn<?>, X.EXt<?>> r7 = r8.A0E
            java.lang.Object r0 = r7.get(r9)
            X.EXt r0 = (X.AbstractC6735EXt) r0
            if (r0 != 0) goto L79
            java.lang.ThreadLocal<java.util.Map<X.EYn<?>, X.EXt<?>>> r6 = r8.A0D
            java.lang.Object r5 = r6.get()
            java.util.Map r5 = (java.util.Map) r5
            if (r5 != 0) goto L23
            java.util.HashMap r5 = X.BV4.A0u()
            r6.set(r5)
            r4 = 1
            goto L2c
        L23:
            java.lang.Object r0 = r5.get(r9)
            X.EXt r0 = (X.AbstractC6735EXt) r0
            if (r0 != 0) goto L79
            r4 = 0
        L2c:
            X.EYM r3 = new X.EYM     // Catch: java.lang.Throwable -> L6b
            r3.<init>()     // Catch: java.lang.Throwable -> L6b
            r5.put(r9, r3)     // Catch: java.lang.Throwable -> L6b
            java.util.List<X.EYY> r0 = r8.A07     // Catch: java.lang.Throwable -> L6b
            java.util.Iterator r2 = r0.iterator()     // Catch: java.lang.Throwable -> L6b
            r1 = 0
        L3b:
            boolean r0 = r2.hasNext()     // Catch: java.lang.Throwable -> L6b
            if (r0 == 0) goto L5e
            java.lang.Object r0 = r2.next()     // Catch: java.lang.Throwable -> L6b
            X.EYY r0 = (X.EYY) r0     // Catch: java.lang.Throwable -> L6b
            X.EXt r1 = r0.create(r8, r9)     // Catch: java.lang.Throwable -> L6b
            if (r1 == 0) goto L3b
            X.EXt<T> r0 = r3.A00     // Catch: java.lang.Throwable -> L6b
            if (r0 != 0) goto L57
            r3.A00 = r1     // Catch: java.lang.Throwable -> L6b
            r5.put(r9, r1)     // Catch: java.lang.Throwable -> L6b
            goto L5e
        L57:
            java.lang.String r0 = "Delegate is already set"
            java.lang.AssertionError r0 = X.BV4.A0N(r0)     // Catch: java.lang.Throwable -> L6b
            throw r0     // Catch: java.lang.Throwable -> L6b
        L5e:
            if (r4 == 0) goto L63
            r6.remove()
        L63:
            if (r1 == 0) goto L72
            if (r4 == 0) goto L6a
            r7.putAll(r5)
        L6a:
            return r1
        L6b:
            r0 = move-exception
            if (r4 == 0) goto L78
            r6.remove()
            throw r0
        L72:
            java.lang.String r0 = "GSON (2.12.1) cannot handle "
            java.lang.IllegalArgumentException r0 = X.BV5.A0O(r9, r0)
        L78:
            throw r0
        L79:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.EYC.A01(X.EYn):X.EXt");
    }

    public final String toString() {
        StringBuilder sbA0x = C60O.A0x("{serializeNulls:");
        sbA0x.append(false);
        sbA0x.append(",factories:");
        sbA0x.append(this.A07);
        sbA0x.append(",instanceCreators:");
        return BV8.A0v(this.A0B, sbA0x);
    }

    public EYC(InterfaceC6749EYj interfaceC6749EYj, C6738EXw c6738EXw, HOE hoe, EY0 ey0, EY0 ey02, EYK eyk, List list, List list2, List list3, List list4, Map map, boolean z) {
        EYY f4k;
        AbstractC6735EXt f4h;
        EYY f4k2;
        this.A0D = new ThreadLocal<>();
        this.A0E = C60O.A1C();
        this.A04 = eyk;
        this.A00 = interfaceC6749EYj;
        this.A09 = map;
        EYQ eyq = new EYQ(list4, map);
        this.A0B = eyq;
        this.A0A = z;
        this.A01 = c6738EXw;
        this.A05 = list;
        this.A06 = list2;
        this.A03 = ey0;
        this.A02 = ey02;
        this.A08 = list4;
        ArrayList arrayListA0h = C3cG.A0h();
        arrayListA0h.add(EYB.A0d);
        EYY eyy = C6740EXz.A02;
        if (ey0 != EY7.A01) {
            f4k = new F4K(ey0, 1);
        } else {
            f4k = C6740EXz.A02;
        }
        arrayListA0h.add(f4k);
        arrayListA0h.add(eyk);
        arrayListA0h.addAll(list3);
        arrayListA0h.add(EYB.A0i);
        arrayListA0h.add(EYB.A0c);
        arrayListA0h.add(EYB.A0U);
        arrayListA0h.add(EYB.A0V);
        arrayListA0h.add(EYB.A0f);
        if (hoe == HOE.A01) {
            f4h = EYB.A0I;
        } else {
            f4h = new F4H(0);
        }
        arrayListA0h.add(new EYI(f4h, Long.TYPE, Long.class));
        arrayListA0h.add(new EYI(new F4I(this, 0), Double.TYPE, Double.class));
        arrayListA0h.add(new EYI(new F4I(this, 1), Float.TYPE, Float.class));
        EYY eyy2 = EY3.A01;
        if (ey02 == EY7.A02) {
            f4k2 = EY3.A01;
        } else {
            f4k2 = new F4K(new EY3(ey02), 0);
        }
        arrayListA0h.add(f4k2);
        arrayListA0h.add(EYB.A0S);
        arrayListA0h.add(EYB.A0Q);
        arrayListA0h.add(new F4L(1, new F4I(f4h, 2).nullSafe(), AtomicLong.class));
        arrayListA0h.add(new F4L(1, new F4I(f4h, 3).nullSafe(), AtomicLongArray.class));
        arrayListA0h.add(EYB.A0R);
        arrayListA0h.add(EYB.A0X);
        arrayListA0h.add(EYB.A0h);
        arrayListA0h.add(EYB.A0g);
        arrayListA0h.add(new F4L(1, EYB.A03, BigDecimal.class));
        arrayListA0h.add(new F4L(1, EYB.A04, BigInteger.class));
        arrayListA0h.add(new F4L(1, EYB.A0G, C6716EWz.class));
        arrayListA0h.add(EYB.A0k);
        arrayListA0h.add(EYB.A0j);
        arrayListA0h.add(EYB.A0l);
        arrayListA0h.add(EYB.A0Z);
        arrayListA0h.add(EYB.A0e);
        arrayListA0h.add(EYB.A0b);
        arrayListA0h.add(EYB.A0T);
        arrayListA0h.add(C6742EYc.A02);
        arrayListA0h.add(EYB.A0W);
        if (EYZ.A03) {
            arrayListA0h.add(EYZ.A02);
            arrayListA0h.add(EYZ.A00);
            arrayListA0h.add(EYZ.A01);
        }
        arrayListA0h.add(EYE.A02);
        arrayListA0h.add(EYB.A0Y);
        arrayListA0h.add(new EYH(eyq));
        arrayListA0h.add(new EYG(eyq));
        EYD eyd = new EYD(eyq);
        this.A0C = eyd;
        arrayListA0h.add(eyd);
        arrayListA0h.add(EYB.A0a);
        arrayListA0h.add(new EYO(interfaceC6749EYj, eyq, eyk, eyd, list4));
        this.A07 = Collections.unmodifiableList(arrayListA0h);
    }
}
