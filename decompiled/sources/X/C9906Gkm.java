package X;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.Gkm, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9906Gkm extends AbstractC9905Gkl implements Serializable {
    public static final long serialVersionUID = 1;
    public static final Class<?>[] A01 = {Throwable.class};
    public static final C9906Gkm A00 = new C9906Gkm(new C10063Gok());

    /* JADX WARN: Code restructure failed: missing block: B:46:0x00a3, code lost:
    
        if (r0 == null) goto L47;
     */
    /* JADX WARN: Removed duplicated region for block: B:33:0x007a A[PHI: r0
  0x007a: PHI (r0v12 X.Gna) = (r0v11 X.Gna), (r0v16 X.Gna) binds: [B:28:0x0068, B:32:0x0078] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x008c A[PHI: r0
  0x008c: PHI (r0v10 X.Gna) = (r0v8 X.Gna), (r0v12 X.Gna), (r0v14 X.Gna), (r0v16 X.Gna) binds: [B:46:0x00a3, B:34:0x007c, B:37:0x0088, B:32:0x0078] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x008e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.AbstractC9915Gl5 A04(X.AbstractC9904Gkk r9, X.AbstractC9870GjI r10, X.C9906Gkm r11, X.C9914Gl4 r12, X.AbstractC9958GmS r13) {
        /*
            r6 = r13
            X.Glc r2 = r13.A0H()
            if (r2 != 0) goto L1b
            X.Glv r2 = r13.A0E()
            if (r2 != 0) goto L1b
            java.lang.Object[] r1 = X.BV4.A1W()
            java.lang.String r0 = "No non-constructor mutator available"
            r9.A0f(r12, r13, r0, r1)
            X.F60 r0 = X.F60.createAndThrow()
            throw r0
        L1b:
            X.GjI r4 = r11.A0C(r9, r10, r2)
            java.lang.Object r7 = r4._typeHandler
            X.Gn8 r7 = (X.AbstractC9986Gn8) r7
            boolean r1 = r2 instanceof X.C9934Glc
            X.Gkr r0 = r12.A07
            X.Gox r8 = r0.A04
            if (r1 == 0) goto La8
            r5 = r2
            X.Glc r5 = (X.C9934Glc) r5
            X.GmC r3 = new X.GmC
            r3.<init>(r4, r5, r6, r7, r8)
        L33:
            com.fasterxml.jackson.databind.JsonDeserializer r0 = X.AbstractC9905Gkl.A00(r9, r2)
            if (r0 != 0) goto L3f
            java.lang.Object r0 = r4._valueHandler
            com.fasterxml.jackson.databind.JsonDeserializer r0 = (com.fasterxml.jackson.databind.JsonDeserializer) r0
            if (r0 == 0) goto L47
        L3f:
            com.fasterxml.jackson.databind.JsonDeserializer r0 = r9.A0H(r3, r4, r0)
            X.Gl5 r3 = r3.A04(r0)
        L47:
            X.GqU r2 = r13.A0B()
            if (r2 == 0) goto L57
            java.lang.Integer r1 = r2.A00
            java.lang.Integer r0 = X.C79.A00
            if (r1 != r0) goto L57
            java.lang.String r0 = r2.A01
            r3._managedReferenceName = r0
        L57:
            boolean r0 = r13 instanceof X.C9908Gko
            if (r0 == 0) goto L90
            X.Gko r6 = (X.C9908Gko) r6
            X.Gks r2 = r6.A04
            r0 = 0
            if (r2 == 0) goto L90
            boolean r1 = r6.A08
            if (r1 == 0) goto L91
            X.Gml<X.Glc> r1 = r6.A02
        L68:
            if (r1 == 0) goto L7a
            T r1 = r1.A02
            X.Go7 r1 = (X.AbstractC10031Go7) r1
            X.Gna r0 = r2.A0K(r1)
            if (r0 == 0) goto L78
            X.Gna r0 = r2.A0L(r1, r0)
        L78:
            if (r0 != 0) goto L8c
        L7a:
            X.Gml<X.Glv> r1 = r6.A01
            if (r1 == 0) goto L8c
            T r1 = r1.A02
            X.Go7 r1 = (X.AbstractC10031Go7) r1
            X.Gna r0 = r2.A0K(r1)
            if (r0 == 0) goto L90
            X.Gna r0 = r2.A0L(r1, r0)
        L8c:
            if (r0 == 0) goto L90
            r3._objectIdInfo = r0
        L90:
            return r3
        L91:
            X.Gml<X.GmU> r1 = r6.A00
            if (r1 == 0) goto La5
            T r1 = r1.A02
            X.Go7 r1 = (X.AbstractC10031Go7) r1
            X.Gna r0 = r2.A0K(r1)
            if (r0 == 0) goto La3
            X.Gna r0 = r2.A0L(r1, r0)
        La3:
            if (r0 != 0) goto L8c
        La5:
            X.Gml<X.Glc> r1 = r6.A03
            goto L68
        La8:
            r5 = r2
            X.Glv r5 = (X.C9943Glv) r5
            X.Gm2 r3 = new X.Gm2
            r3.<init>(r4, r5, r6, r7, r8)
            goto L33
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C9906Gkm.A04(X.Gkk, X.GjI, X.Gkm, X.Gl4, X.GmS):X.Gl5");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0244  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0264  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0270  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x027a  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0313  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x036e  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x0405  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x0408  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x0416  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x03a8 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:280:0x03aa A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:283:0x0346 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01c0  */
    /* JADX WARN: Type inference failed for: r12v10, types: [X.Gks] */
    /* JADX WARN: Type inference failed for: r13v12, types: [X.Gks] */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v14, types: [X.Glc, X.Gnx] */
    /* JADX WARN: Type inference failed for: r1v18, types: [X.Gmj, X.Go7] */
    /* JADX WARN: Type inference failed for: r1v75, types: [X.Gmj, X.Go7, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v79, types: [X.Gmj, X.Go7] */
    /* JADX WARN: Type inference failed for: r1v81 */
    /* JADX WARN: Type inference failed for: r24v0, types: [X.Git, X.Gkk] */
    /* JADX WARN: Type inference failed for: r25v0, types: [X.Gkv] */
    /* JADX WARN: Type inference failed for: r26v0, types: [X.Gkl, X.Gkm] */
    /* JADX WARN: Type inference failed for: r2v30, types: [X.Gks] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A06(X.AbstractC9904Gkk r24, X.C9912Gkv r25, X.C9906Gkm r26, X.C9914Gl4 r27) {
        /*
            Method dump skipped, instructions count: 1251
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C9906Gkm.A06(X.Gkk, X.Gkv, X.Gkm, X.Gl4):void");
    }

    public static final void A07(AbstractC9904Gkk abstractC9904Gkk, C9912Gkv c9912Gkv, C9914Gl4 c9914Gl4) {
        AbstractC9870GjI abstractC9870GjI;
        AbstractC9848Gir abstractC9848GirA08;
        AbstractC9915Gl5 abstractC9915Gl5;
        C10003Gna c10003Gna = c9914Gl4.A00;
        if (c10003Gna != null) {
            Class<? extends AbstractC9848Gir<?>> cls = c10003Gna.A01;
            InterfaceC9851Giv interfaceC9851Giv = (InterfaceC9851Giv) AbstractC7608F5v.A0h(abstractC9904Gkk.A09(), c10003Gna.A02);
            if (cls == Gr5.class) {
                C10009Gnh c10009Gnh = c10003Gna.A00;
                abstractC9915Gl5 = c9912Gkv.A0E.get(c10009Gnh._simpleName);
                if (abstractC9915Gl5 == null) {
                    throw BV5.A0T("Invalid Object Id definition for %s: cannot find property with name %s", new Object[]{AbstractC9855Gj3.A04(c9914Gl4.A05), AbstractC9855Gj3.A09(c10009Gnh._simpleName)});
                }
                abstractC9870GjI = abstractC9915Gl5._type;
                abstractC9848GirA08 = new C10099GpN(c10003Gna.A03);
            } else {
                abstractC9870GjI = C9860Gj8.A05(cls == null ? null : AbstractC7608F5v.A0R(abstractC9904Gkk._config, cls), AbstractC9848Gir.class)[0];
                abstractC9848GirA08 = abstractC9904Gkk.A08(c10003Gna);
                abstractC9915Gl5 = null;
            }
            c9912Gkv.A03 = new C10035GoB(abstractC9848GirA08, interfaceC9851Giv, abstractC9870GjI, abstractC9904Gkk.A0J(abstractC9870GjI), c10003Gna.A00, abstractC9915Gl5);
        }
    }

    public static final void A08(C9912Gkv c9912Gkv, C9914Gl4 c9914Gl4) {
        Map map;
        C9907Gkn c9907Gkn = c9914Gl4.A08;
        if (c9907Gkn != null) {
            C9907Gkn.A03(c9907Gkn);
            map = c9907Gkn.A02;
        } else {
            map = Collections.EMPTY_MAP;
        }
        if (map != null) {
            Iterator itA0n = AnonymousClass002.A0n(map);
            while (itA0n.hasNext()) {
                Map.Entry entryA0l = C3cH.A0l(itA0n);
                AbstractC9970Gmj abstractC9970Gmj = (AbstractC9970Gmj) entryA0l.getValue();
                C10009Gnh c10009GnhA00 = C10009Gnh.A00(abstractC9970Gmj.A09());
                AbstractC9870GjI abstractC9870GjIA07 = abstractC9970Gmj.A07();
                Object key = entryA0l.getKey();
                if (c9912Gkv.A08 == null) {
                    c9912Gkv.A08 = C3cG.A0h();
                }
                C9898Gke c9898Gke = c9912Gkv.A0B;
                if (c9898Gke.A07()) {
                    try {
                        AbstractC9970Gmj.A00(c9898Gke, abstractC9970Gmj);
                    } catch (IllegalArgumentException e) {
                        C9912Gkv.A01(c9912Gkv, e);
                        throw F60.createAndThrow();
                    }
                }
                c9912Gkv.A08.add(new C10115Gpg(abstractC9870GjIA07, c10009GnhA00, abstractC9970Gmj, key));
            }
        }
    }

    public static C9977Gms A01(AbstractC9870GjI abstractC9870GjI, AbstractC9970Gmj abstractC9970Gmj) {
        return new C9977Gms(abstractC9870GjI, C10034GoA.A01, C10009Gnh.A00(abstractC9970Gmj.A09()), abstractC9970Gmj);
    }

    public static final void A05(AbstractC9904Gkk abstractC9904Gkk, C9912Gkv c9912Gkv, C9906Gkm c9906Gkm, C9914Gl4 c9914Gl4) {
        ArrayList arrayListA0h = null;
        HashSet hashSetA13 = null;
        for (AbstractC9958GmS abstractC9958GmS : C9914Gl4.A01(c9914Gl4)) {
            GqU gqUA0B = abstractC9958GmS.A0B();
            if (gqUA0B != null && gqUA0B.A00 == C79.A01) {
                String str = gqUA0B.A01;
                if (arrayListA0h == null) {
                    arrayListA0h = C3cG.A0h();
                    hashSetA13 = C60O.A13();
                    hashSetA13.add(str);
                } else if (!hashSetA13.add(str)) {
                    C10104GpS[] c10104GpSArr = AbstractC9855Gj3.A01;
                    throw C60Q.A0U("Multiple back-reference properties with name ", AbstractC7609F5w.A0s(str));
                }
                arrayListA0h.add(abstractC9958GmS);
            }
        }
        if (arrayListA0h != null) {
            Iterator it = arrayListA0h.iterator();
            while (it.hasNext()) {
                AbstractC9958GmS abstractC9958GmS2 = (AbstractC9958GmS) it.next();
                GqU gqUA0B2 = abstractC9958GmS2.A0B();
                String str2 = gqUA0B2 == null ? null : gqUA0B2.A01;
                AbstractC9915Gl5 abstractC9915Gl5A04 = A04(abstractC9904Gkk, abstractC9958GmS2.A0C(), c9906Gkm, c9914Gl4, abstractC9958GmS2);
                if (c9912Gkv.A05 == null) {
                    c9912Gkv.A05 = BV4.A0v(4);
                }
                C9898Gke c9898Gke = c9912Gkv.A0B;
                if (c9898Gke.A07()) {
                    try {
                        abstractC9915Gl5A04.A0J(c9898Gke);
                    } catch (IllegalArgumentException e) {
                        C9912Gkv.A01(c9912Gkv, e);
                        throw F60.createAndThrow();
                    }
                }
                c9912Gkv.A05.put(str2, abstractC9915Gl5A04);
            }
        }
    }
}
