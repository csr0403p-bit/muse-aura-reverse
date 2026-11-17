package X;

import java.io.Serializable;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* renamed from: X.Gle, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C9935Gle extends AbstractC10142Gq9 implements Serializable {
    public static final C9914Gl4 A00;
    public static final C9914Gl4 A01;
    public static final C9914Gl4 A02;
    public static final C9914Gl4 A03;
    public static final C9914Gl4 A04;
    public static final long serialVersionUID = 2;

    /* JADX WARN: Incorrect types in method signature: (LX/Gkh<*>;LX/GjI;LX/GqS;Z)LX/Gkn; */
    public static final C9907Gkn A02(AbstractC9870GjI abstractC9870GjI, AbstractC9901Gkh abstractC9901Gkh, InterfaceC10159GqS interfaceC10159GqS, boolean z) {
        AbstractC10164GqZ c9950Gm8;
        C9909Gkr c9909GkrA00 = C9928GlP.A00(abstractC9870GjI, abstractC9901Gkh, interfaceC10159GqS);
        boolean zA0T = abstractC9870GjI.A0T();
        AbstractC10189Gr6 abstractC10189Gr6 = abstractC9901Gkh._base._accessorNaming;
        if (zA0T) {
            c9950Gm8 = new C9953GmD(abstractC9901Gkh, c9909GkrA00);
        } else {
            GpV gpV = (GpV) abstractC10189Gr6;
            c9950Gm8 = new C9950Gm8(abstractC9901Gkh, c9909GkrA00, gpV._setterPrefix, gpV._getterPrefix, gpV._isGetterPrefix);
        }
        return new C9907Gkn(abstractC9870GjI, abstractC9901Gkh, c9950Gm8, c9909GkrA00, z);
    }

    static {
        C9866GjE c9866GjEA00 = C9866GjE.A00(String.class);
        C9909Gkr c9909Gkr = new C9909Gkr(String.class);
        List list = Collections.EMPTY_LIST;
        A04 = new C9914Gl4(c9866GjEA00, null, c9909Gkr, list);
        Class cls = Boolean.TYPE;
        A00 = new C9914Gl4(C9866GjE.A00(cls), null, new C9909Gkr(cls), list);
        Class cls2 = Integer.TYPE;
        A01 = new C9914Gl4(C9866GjE.A00(cls2), null, new C9909Gkr(cls2), list);
        Class cls3 = Long.TYPE;
        A02 = new C9914Gl4(C9866GjE.A00(cls3), null, new C9909Gkr(cls3), list);
        A03 = new C9914Gl4(C9866GjE.A00(Object.class), null, new C9909Gkr(Object.class), list);
    }

    /* JADX WARN: Incorrect types in method signature: (LX/Gkh<*>;LX/GjI;)LX/Gl4; */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0014  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0051 A[ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.C9914Gl4 A01(X.AbstractC9870GjI r3, X.AbstractC9901Gkh r4) {
        /*
            java.lang.Class<?> r1 = r3._class
            boolean r0 = r1.isPrimitive()
            if (r0 == 0) goto L17
            java.lang.Class r0 = java.lang.Integer.TYPE
            if (r1 == r0) goto L39
            java.lang.Class r0 = java.lang.Long.TYPE
            if (r1 == r0) goto L36
            java.lang.Class r0 = java.lang.Boolean.TYPE
        L12:
            if (r1 != r0) goto L51
            X.Gl4 r0 = X.C9935Gle.A00
            return r0
        L17:
            boolean r0 = X.AbstractC9855Gj3.A0J(r1)
            if (r0 == 0) goto L3c
            java.lang.Class<java.lang.Object> r0 = java.lang.Object.class
            if (r1 != r0) goto L24
            X.Gl4 r0 = X.C9935Gle.A03
            return r0
        L24:
            java.lang.Class<java.lang.String> r0 = java.lang.String.class
            if (r1 != r0) goto L2b
            X.Gl4 r0 = X.C9935Gle.A04
            return r0
        L2b:
            java.lang.Class<java.lang.Integer> r0 = java.lang.Integer.class
            if (r1 == r0) goto L39
            java.lang.Class<java.lang.Long> r0 = java.lang.Long.class
            if (r1 == r0) goto L36
            java.lang.Class<java.lang.Boolean> r0 = java.lang.Boolean.class
            goto L12
        L36:
            X.Gl4 r0 = X.C9935Gle.A02
            return r0
        L39:
            X.Gl4 r0 = X.C9935Gle.A01
            return r0
        L3c:
            java.lang.Class<X.GhQ> r0 = X.AbstractC9804GhQ.class
            boolean r0 = r0.isAssignableFrom(r1)
            if (r0 == 0) goto L51
            X.Gkr r2 = new X.Gkr
            r2.<init>(r1)
            java.util.List r1 = java.util.Collections.EMPTY_LIST
            X.Gl4 r0 = new X.Gl4
            r0.<init>(r3, r4, r2, r1)
            return r0
        L51:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C9935Gle.A01(X.GjI, X.Gkh):X.Gl4");
    }

    /* JADX WARN: Incorrect types in method signature: (LX/Gkh<*>;LX/GjI;)LX/Gl4; */
    public static final C9914Gl4 A00(AbstractC9870GjI abstractC9870GjI, AbstractC9901Gkh abstractC9901Gkh) {
        if (!abstractC9870GjI.A0R() || (abstractC9870GjI instanceof C9872GjK)) {
            return null;
        }
        Class<?> cls = abstractC9870GjI._class;
        if (!AbstractC9855Gj3.A0J(cls)) {
            return null;
        }
        if ((Collection.class.isAssignableFrom(cls) || Map.class.isAssignableFrom(cls)) && cls.toString().indexOf(36) <= 0) {
            return new C9914Gl4(abstractC9870GjI, abstractC9901Gkh, C9928GlP.A00(abstractC9870GjI, abstractC9901Gkh, abstractC9901Gkh), Collections.EMPTY_LIST);
        }
        return null;
    }

    public C9914Gl4 A03(C9898Gke c9898Gke, AbstractC9870GjI abstractC9870GjI, InterfaceC10159GqS interfaceC10159GqS) {
        C9914Gl4 c9914Gl4A01 = A01(abstractC9870GjI, c9898Gke);
        if (c9914Gl4A01 != null) {
            return c9914Gl4A01;
        }
        C9914Gl4 c9914Gl4A00 = A00(abstractC9870GjI, c9898Gke);
        return c9914Gl4A00 == null ? new C9914Gl4(A02(abstractC9870GjI, c9898Gke, interfaceC10159GqS, false)) : c9914Gl4A00;
    }

    public C9914Gl4 A04(AbstractC9870GjI abstractC9870GjI, C9963Gma c9963Gma, InterfaceC10159GqS interfaceC10159GqS) {
        C9914Gl4 c9914Gl4A01 = A01(abstractC9870GjI, c9963Gma);
        if (c9914Gl4A01 != null) {
            return c9914Gl4A01;
        }
        C9914Gl4 c9914Gl4A00 = A00(abstractC9870GjI, c9963Gma);
        return c9914Gl4A00 == null ? new C9914Gl4(A02(abstractC9870GjI, c9963Gma, interfaceC10159GqS, true)) : c9914Gl4A00;
    }

    /* JADX WARN: Incorrect types in method signature: (LX/Gkh<*>;LX/GjI;LX/GqS;)LX/Gl4; */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C9914Gl4 A05(X.AbstractC9870GjI r3, X.AbstractC9901Gkh r4, X.InterfaceC10159GqS r5) {
        /*
            r2 = this;
            X.Gl4 r0 = A01(r3, r4)
            if (r0 != 0) goto L22
            boolean r0 = r3 instanceof X.C9872GjK
            if (r0 == 0) goto L23
            java.lang.Class<?> r0 = r3._class
            if (r4 == 0) goto L14
            java.lang.Class r0 = r4.ABU(r0)
            if (r0 != 0) goto L23
        L14:
            java.lang.Class<?> r0 = r3._class
            X.Gkr r2 = new X.Gkr
            r2.<init>(r0)
        L1b:
            java.util.List r1 = java.util.Collections.EMPTY_LIST
            X.Gl4 r0 = new X.Gl4
            r0.<init>(r3, r4, r2, r1)
        L22:
            return r0
        L23:
            X.GlP r0 = new X.GlP
            r0.<init>(r3, r4, r5)
            X.Gkr r2 = X.C9928GlP.A02(r0)
            goto L1b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C9935Gle.A05(X.GjI, X.Gkh, X.GqS):X.Gl4");
    }
}
