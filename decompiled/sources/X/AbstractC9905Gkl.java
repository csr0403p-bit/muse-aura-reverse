package X;

import com.fasterxml.jackson.databind.JsonDeserializer;
import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.HashMap;

/* renamed from: X.Gkl, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC9905Gkl extends AbstractC10056God implements Serializable {
    public static final AbstractC9905Gkl $redex_init_class = null;
    public final C10063Gok _factoryConfig;

    public static boolean A04(C9929GlQ c9929GlQ, AbstractC10024Gnx abstractC10024Gnx, boolean z, boolean z2) {
        int i;
        Class<?> clsA0J = abstractC10024Gnx.A0J(0);
        if (clsA0J == String.class || clsA0J == CharSequence.class) {
            if (z || z2) {
                C9929GlQ.A01(c9929GlQ, abstractC10024Gnx, 1, z);
                return true;
            }
        } else if (clsA0J == Integer.TYPE || clsA0J == Integer.class) {
            if (z || z2) {
                i = 2;
                C9929GlQ.A01(c9929GlQ, abstractC10024Gnx, i, z);
                return true;
            }
        } else if (clsA0J == Long.TYPE || clsA0J == Long.class) {
            if (z || z2) {
                i = 3;
                C9929GlQ.A01(c9929GlQ, abstractC10024Gnx, i, z);
                return true;
            }
        } else if (clsA0J == Double.TYPE || clsA0J == Double.class) {
            if (z || z2) {
                i = 5;
                C9929GlQ.A01(c9929GlQ, abstractC10024Gnx, i, z);
                return true;
            }
        } else {
            if (clsA0J != Boolean.TYPE && clsA0J != Boolean.class) {
                if (clsA0J == BigInteger.class && (z || z2)) {
                    C9929GlQ.A01(c9929GlQ, abstractC10024Gnx, 4, z);
                }
                if (clsA0J == BigDecimal.class) {
                    if (z || z2) {
                        C9929GlQ.A01(c9929GlQ, abstractC10024Gnx, 6, z);
                    }
                    return false;
                }
                if (z) {
                    c9929GlQ.A03(abstractC10024Gnx, null, 0, z);
                }
                return false;
            }
            if (z || z2) {
                i = 7;
                C9929GlQ.A01(c9929GlQ, abstractC10024Gnx, i, z);
                return true;
            }
        }
        return true;
    }

    static {
        C10009Gnh c10009Gnh = C10009Gnh.A00;
        C10104GpS[] c10104GpSArr = AbstractC9855Gj3.A01;
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x00da  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final X.AbstractC9915Gl5 A01(X.C10085Gp8 r13, X.AbstractC9904Gkk r14, X.C10009Gnh r15, X.C9959GmU r16, X.C9914Gl4 r17, int r18) throws com.fasterxml.jackson.databind.exc.InvalidDefinitionException {
        /*
            Method dump skipped, instructions count: 242
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC9905Gkl.A01(X.Gp8, X.Gkk, X.Gnh, X.GmU, X.Gl4, int):X.Gl5");
    }

    /* JADX WARN: Removed duplicated region for block: B:147:0x0084 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0060  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.C9921GlI A02(X.AbstractC9904Gkk r24, X.AbstractC9905Gkl r25, X.C9914Gl4 r26) {
        /*
            Method dump skipped, instructions count: 775
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC9905Gkl.A02(X.Gkk, X.Gkl, X.Gl4):X.GlI");
    }

    public static final C9933GlW A03(C9898Gke c9898Gke, C9914Gl4 c9914Gl4) {
        boolean zA09;
        Class<?> cls;
        Enum<?>[] enumArrA02;
        HashMap mapA0u;
        Enum<?> enumA0Q;
        AbstractC9970Gmj abstractC9970GmjA03 = c9914Gl4.A03();
        if (abstractC9970GmjA03 != null) {
            if (c9898Gke.A07()) {
                AbstractC7609F5w.A1B(c9898Gke, abstractC9970GmjA03.A0F());
            }
            C9909Gkr c9909Gkr = c9914Gl4.A07;
            AbstractC9910Gks abstractC9910GksA02 = c9898Gke.A02();
            zA09 = c9898Gke.A09(EnumC9951GmA.A01);
            cls = c9909Gkr.A05;
            enumArrA02 = C9933GlW.A02(cls);
            mapA0u = BV4.A0u();
            int length = enumArrA02.length;
            while (true) {
                length--;
                if (length < 0) {
                    break;
                }
                Enum<?> r1 = enumArrA02[length];
                try {
                    Object objA0D = abstractC9970GmjA03.A0D(r1);
                    if (objA0D != null) {
                        mapA0u.put(objA0D.toString(), r1);
                    }
                } catch (Exception e) {
                    StringBuilder sbA0f = C3cG.A0f(r1, "Failed to access @JsonValue of Enum value ");
                    sbA0f.append(": ");
                    throw C8j3.A0w(e.getMessage(), sbA0f);
                }
            }
            enumA0Q = abstractC9910GksA02 != null ? abstractC9910GksA02.A0Q(c9909Gkr, enumArrA02) : null;
            Class<?> clsA08 = abstractC9970GmjA03.A08();
            if (clsA08.isPrimitive()) {
                clsA08 = AbstractC9855Gj3.A02(clsA08);
            }
            boolean z = clsA08 == Long.class || clsA08 == Integer.class || clsA08 == Short.class || clsA08 == Byte.class;
            return new C9933GlW(cls, enumA0Q, mapA0u, enumArrA02, zA09, z);
        }
        C9909Gkr c9909Gkr2 = c9914Gl4.A07;
        AbstractC9910Gks abstractC9910GksA022 = c9898Gke.A02();
        zA09 = c9898Gke.A09(EnumC9951GmA.A01);
        cls = c9909Gkr2.A05;
        enumArrA02 = C9933GlW.A02(cls);
        int length2 = enumArrA02.length;
        String[] strArr = new String[length2];
        abstractC9910GksA022.A0d(c9909Gkr2, enumArrA02, strArr);
        String[][] strArr2 = new String[length2][];
        abstractC9910GksA022.A0e(c9909Gkr2, enumArrA02, strArr2);
        mapA0u = BV4.A0u();
        for (int i = 0; i < length2; i++) {
            Enum<?> r4 = enumArrA02[i];
            String strName = strArr[i];
            if (strName == null) {
                strName = r4.name();
            }
            mapA0u.put(strName, r4);
            String[] strArr3 = strArr2[i];
            if (strArr3 != null) {
                for (String str : strArr3) {
                    mapA0u.putIfAbsent(str, r4);
                }
            }
        }
        enumA0Q = abstractC9910GksA022.A0Q(c9909Gkr2, enumArrA02);
        return new C9933GlW(cls, enumA0Q, mapA0u, enumArrA02, zA09, z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0040  */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Class] */
    /* JADX WARN: Type inference failed for: r1v8, types: [java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.AbstractC9944Glx A0D(X.AbstractC9904Gkk r4, X.C9914Gl4 r5) {
        /*
            r3 = this;
            X.Gke r2 = r4._config
            X.Gkr r1 = r5.A07
            X.Gks r0 = r2.A02()
            boolean r0 = r0 instanceof X.C9888GkO
            if (r0 == 0) goto L36
            java.lang.Class<com.fasterxml.jackson.databind.annotation.JsonValueInstantiator> r0 = com.fasterxml.jackson.databind.annotation.JsonValueInstantiator.class
            java.lang.annotation.Annotation r0 = r1.A0A(r0)
            com.fasterxml.jackson.databind.annotation.JsonValueInstantiator r0 = (com.fasterxml.jackson.databind.annotation.JsonValueInstantiator) r0
            if (r0 == 0) goto L36
            java.lang.Class r1 = r0.value()
            if (r1 == 0) goto L36
            boolean r0 = r1 instanceof X.AbstractC9944Glx
            if (r0 != 0) goto L32
            boolean r0 = X.AbstractC9855Gj3.A0I(r1)
            if (r0 != 0) goto L36
            java.lang.Class<X.Glx> r0 = X.AbstractC9944Glx.class
            boolean r0 = r0.isAssignableFrom(r1)
            if (r0 == 0) goto L60
            java.lang.Object r1 = X.AbstractC7608F5v.A0h(r2, r1)
        L32:
            X.Glx r1 = (X.AbstractC9944Glx) r1
            if (r1 != 0) goto L44
        L36:
            X.GjI r0 = r5.A05
            java.lang.Class<?> r0 = r0._class
            X.Gpv r1 = X.AbstractC10016Gno.A00(r0)
            if (r1 != 0) goto L44
            X.GlI r1 = A02(r4, r3, r5)
        L44:
            X.Gok r0 = r3._factoryConfig
            X.Hga[] r2 = r0._valueInstantiators
            int r0 = r2.length
            if (r0 <= 0) goto L5f
            X.GQ2 r2 = X.GQ2.A01(r2)
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L5f
            r2.next()
            java.lang.String r0 = "findValueInstantiator"
            java.lang.NullPointerException r0 = X.BV4.A0a(r0)
            throw r0
        L5f:
            return r1
        L60:
            java.lang.String r2 = "AnnotationIntrospector returned Class "
            java.lang.String r1 = r1.getName()
            java.lang.String r0 = "; expected Class<ValueInstantiator>"
            java.lang.IllegalStateException r0 = X.BV5.A0V(r2, r1, r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC9905Gkl.A0D(X.Gkk, X.Gl4):X.Glx");
    }

    public AbstractC9905Gkl(C10063Gok c10063Gok) {
        this._factoryConfig = c10063Gok;
    }

    public static final JsonDeserializer<Object> A00(AbstractC9904Gkk abstractC9904Gkk, AbstractC10031Go7 abstractC10031Go7) {
        Object objA0V;
        AbstractC9910Gks abstractC9910GksA02 = AbstractC9849Git.A02(abstractC9904Gkk);
        if (abstractC9910GksA02 == null || (objA0V = abstractC9910GksA02.A0V(abstractC10031Go7)) == null) {
            return null;
        }
        return abstractC9904Gkk.A0K(objA0V);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00aa  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.AbstractC9870GjI A0C(X.AbstractC9904Gkk r6, X.AbstractC9870GjI r7, X.AbstractC9970Gmj r8) throws com.fasterxml.jackson.databind.exc.InvalidDefinitionException {
        /*
            r5 = this;
            X.Gks r2 = X.AbstractC9849Git.A02(r6)
            if (r2 != 0) goto L7
            return r7
        L7:
            boolean r0 = r7 instanceof X.C9868GjG
            if (r0 == 0) goto L21
            X.GjI r0 = r7.A08()
            if (r0 == 0) goto L21
            java.lang.Object r0 = r2.A0X(r8)
            X.Gjl r0 = r6.A0M(r0)
            if (r0 == 0) goto L21
            X.GjG r7 = (X.C9868GjG) r7
            X.GjG r7 = r7.A0X(r0)
        L21:
            boolean r0 = r7 instanceof X.C9866GjE
            if (r0 == 0) goto L30
            r1 = r7
            X.GjE r1 = (X.C9866GjE) r1
            boolean r0 = r1 instanceof X.C9871GjJ
            if (r0 != 0) goto L30
            boolean r0 = r1 instanceof X.C9867GjF
            if (r0 == 0) goto L64
        L30:
            java.lang.Object r0 = r2.A0S(r8)
            com.fasterxml.jackson.databind.JsonDeserializer r0 = r6.A0K(r0)
            if (r0 == 0) goto L3e
            X.GjI r7 = r7.A0H(r0)
        L3e:
            X.Gke r4 = r6._config
            X.Gks r1 = r4.A02()
            boolean r0 = r1 instanceof X.C9888GkO
            if (r0 == 0) goto L94
            X.GkO r1 = (X.C9888GkO) r1
            X.GjI r0 = r7.A07()
            if (r0 == 0) goto Lbb
            X.GoN r3 = X.C9888GkO.A00(r4, r8, r1)
        L54:
            X.GjI r1 = r7.A07()
            if (r3 != 0) goto L89
            X.Giw r0 = r5.A0B(r4, r1)
        L5e:
            if (r0 == 0) goto L64
            X.GjI r7 = r7.A0G(r0)
        L64:
            X.Gke r3 = r6._config
            X.Gks r1 = r3.A02()
            boolean r0 = r1 instanceof X.C9888GkO
            if (r0 == 0) goto Laa
            X.GkO r1 = (X.C9888GkO) r1
            boolean r0 = r7.A0R()
            if (r0 != 0) goto Laa
            boolean r0 = r7.A06()
            if (r0 != 0) goto Laa
            X.GoN r1 = X.C9888GkO.A00(r3, r8, r1)
            if (r1 == 0) goto Laa
            X.Gof r0 = r3._subtypeResolver
            java.util.ArrayList r0 = r0.A04(r7, r3, r8)
            goto L96
        L89:
            X.Gof r0 = r4._subtypeResolver
            java.util.ArrayList r0 = r0.A04(r1, r4, r8)
            X.Giw r0 = r3.A5X(r4, r1, r0)
            goto L5e
        L94:
            r3 = 0
            goto L54
        L96:
            X.Giw r0 = r1.A5X(r3, r7, r0)     // Catch: java.lang.Throwable -> L9b
            goto Lae
        L9b:
            r3 = move-exception
            r2 = 0
            java.lang.String r1 = X.AbstractC9855Gj3.A0A(r3)
            com.fasterxml.jackson.databind.exc.InvalidDefinitionException r0 = new com.fasterxml.jackson.databind.exc.InvalidDefinitionException
            r0.<init>(r2, r7, r1)
            r0.initCause(r3)
            throw r0
        Laa:
            X.Giw r0 = r5.A0B(r3, r7)
        Lae:
            if (r0 == 0) goto Lb4
            X.GjI r7 = r7.A0I(r0)
        Lb4:
            X.Gke r0 = r6._config
            X.GjI r0 = r2.A0G(r7, r0, r8)
            return r0
        Lbb:
            java.lang.String r0 = "Must call method with a container or reference type (got "
            java.lang.String r0 = X.C3cJ.A0M(r0, r7)
            java.lang.IllegalArgumentException r0 = X.C60O.A0i(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC9905Gkl.A0C(X.Gkk, X.GjI, X.Gmj):X.GjI");
    }
}
