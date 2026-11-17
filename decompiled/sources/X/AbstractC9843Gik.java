package X;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* renamed from: X.Gik, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC9843Gik {
    /* JADX WARN: Incorrect types in method signature: (LX/Gii;LX/GjI;Lcom/fasterxml/jackson/databind/JsonSerializer<Ljava/lang/Object;>;)Lcom/fasterxml/jackson/databind/JsonSerializer<Ljava/lang/Object;>; */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x014e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.fasterxml.jackson.databind.JsonSerializer A03(X.AbstractC9870GjI r11, com.fasterxml.jackson.databind.JsonSerializer r12, X.AbstractC9842Gii r13) {
        /*
            Method dump skipped, instructions count: 342
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC9843Gik.A03(X.GjI, com.fasterxml.jackson.databind.JsonSerializer, X.Gii):com.fasterxml.jackson.databind.JsonSerializer");
    }

    /* JADX WARN: Incorrect types in method signature: (LX/Gii;LX/GjI;)Lcom/fasterxml/jackson/databind/JsonSerializer<Ljava/lang/Object;>; */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0062 A[PHI: r3 r5
  0x0062: PHI (r3v2 X.Gl4) = (r3v1 X.Gl4), (r3v3 X.Gl4) binds: [B:18:0x004e, B:20:0x0060] A[DONT_GENERATE, DONT_INLINE]
  0x0062: PHI (r5v1 com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object>) = 
  (r5v0 com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object>)
  (r5v4 com.fasterxml.jackson.databind.JsonSerializer<java.lang.Object>)
 binds: [B:18:0x004e, B:20:0x0060] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.fasterxml.jackson.databind.JsonSerializer A04(X.AbstractC9870GjI r10, X.AbstractC9842Gii r11) {
        /*
            r9 = this;
            X.Gkj r9 = (X.C9903Gkj) r9
            X.Gma r6 = r11._config
            X.GkY r0 = r6._base
            X.Gq9 r0 = r0._classIntrospector
            X.Gle r0 = (X.C9935Gle) r0
            X.Gl4 r3 = r0.A04(r10, r6, r6)
            X.Gkr r1 = r3.A07
            com.fasterxml.jackson.databind.JsonSerializer r5 = r9.A07(r11, r1)
            if (r5 != 0) goto L8f
            X.Gks r0 = r6.A02()
            r4 = 0
            if (r0 != 0) goto L76
            r8 = r10
        L1e:
            r2 = 1
            if (r8 == r10) goto L32
            java.lang.Class<?> r1 = r10._class
            java.lang.Class<?> r0 = r8._class
            if (r0 == r1) goto L31
            X.GkY r0 = r6._base
            X.Gq9 r0 = r0._classIntrospector
            X.Gle r0 = (X.C9935Gle) r0
            X.Gl4 r3 = r0.A04(r8, r6, r6)
        L31:
            r4 = 1
        L32:
            X.Gks r1 = r3.A04
            if (r1 == 0) goto L7b
            X.Gkr r0 = r3.A07
            java.lang.Object r0 = r1.A0Z(r0)
            X.Giz r7 = X.C9914Gl4.A00(r3, r0)
            if (r7 == 0) goto L7b
            X.Gj8 r0 = r11.A0B()
            X.GjI r4 = r7.AIN(r0)
            java.lang.Class<?> r1 = r8._class
            java.lang.Class<?> r0 = r4._class
            if (r0 == r1) goto L62
            X.GkY r0 = r6._base
            X.Gq9 r0 = r0._classIntrospector
            X.Gle r0 = (X.C9935Gle) r0
            X.Gl4 r3 = r0.A04(r4, r6, r6)
            X.Gkr r0 = r3.A07
            com.fasterxml.jackson.databind.JsonSerializer r5 = r9.A07(r11, r0)
            if (r5 != 0) goto L70
        L62:
            java.lang.Class<?> r1 = r4._class
            java.lang.Class<java.lang.Object> r0 = java.lang.Object.class
            boolean r0 = X.AnonymousClass002.A1Z(r1, r0)
            if (r0 != 0) goto L70
            com.fasterxml.jackson.databind.JsonSerializer r5 = X.C9903Gkj.A01(r4, r11, r3, r9, r2)
        L70:
            com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer r0 = new com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer
            r0.<init>(r4, r5, r7)
            return r0
        L76:
            X.GjI r8 = r0.A0H(r10, r6, r1)     // Catch: com.fasterxml.jackson.databind.JsonMappingException -> L80
            goto L1e
        L7b:
            com.fasterxml.jackson.databind.JsonSerializer r0 = X.C9903Gkj.A01(r8, r11, r3, r9, r4)
            return r0
        L80:
            r0 = move-exception
            java.lang.String r1 = r0.getMessage()
            java.lang.Object[] r0 = new java.lang.Object[r4]
            r11.A0X(r3, r1, r0)
            X.F60 r0 = X.F60.createAndThrow()
            throw r0
        L8f:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC9843Gik.A04(X.GjI, X.Gii):com.fasterxml.jackson.databind.JsonSerializer");
    }

    public final AbstractC10028Go2 A05(AbstractC9870GjI abstractC9870GjI, C9963Gma c9963Gma) {
        C9909Gkr c9909Gkr = c9963Gma.A05(abstractC9870GjI._class).A07;
        AbstractC9910Gks abstractC9910GksA02 = c9963Gma.A02();
        InterfaceC10043GoN<?> interfaceC10043GoNA00 = abstractC9910GksA02 instanceof C9888GkO ? C9888GkO.A00(c9963Gma, c9909Gkr, (C9888GkO) abstractC9910GksA02) : null;
        ArrayList arrayListA0t = null;
        if (interfaceC10043GoNA00 == null) {
            interfaceC10043GoNA00 = c9963Gma._base._typeResolverBuilder;
            if (interfaceC10043GoNA00 == null) {
                return null;
            }
        } else {
            C9890GkR c9890GkR = (C9890GkR) c9963Gma._subtypeResolver;
            AbstractC9910Gks abstractC9910GksA022 = c9963Gma.A02();
            HashMap mapA0u = BV4.A0u();
            LinkedHashSet<HjD> linkedHashSet = c9890GkR._registeredSubtypes;
            if (linkedHashSet != null) {
                Class<?> cls = c9909Gkr.A05;
                Iterator<HjD> it = linkedHashSet.iterator();
                while (it.hasNext()) {
                    HjD next = it.next();
                    if (cls.isAssignableFrom(next._class)) {
                        C9890GkR.A01(abstractC9910GksA022, c9963Gma, C9928GlP.A01(c9963Gma, c9963Gma, next._class), next, c9890GkR, mapA0u);
                    }
                }
            }
            C9890GkR.A01(abstractC9910GksA022, c9963Gma, c9909Gkr, new HjD(c9909Gkr.A05, null), c9890GkR, mapA0u);
            arrayListA0t = BV4.A0t(mapA0u.values());
        }
        return interfaceC10043GoNA00.A5Y(abstractC9870GjI, c9963Gma, arrayListA0t);
    }
}
