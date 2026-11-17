package X;

/* loaded from: classes6.dex */
public abstract class GAr {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v9, types: [T, java.lang.Object] */
    public static final C78T A01(C78T c78t, C78T c78t2) {
        boolean zBooleanValue = ((Boolean) c78t.fold(false, new I16(17))).booleanValue();
        boolean zBooleanValue2 = ((Boolean) c78t2.fold(false, new I16(17))).booleanValue();
        C78T c78t3 = c78t;
        C78T c78t4 = c78t2;
        if (zBooleanValue || zBooleanValue2) {
            C10543Hqv c10543Hqv = new C10543Hqv();
            c10543Hqv.element = c78t2;
            C6ys c6ys = C6ys.A00;
            C78T c78t5 = (C78T) c78t.fold(c6ys, new C8943Ftz(c10543Hqv, 2));
            if (zBooleanValue2) {
                c10543Hqv.element = ((C78T) c10543Hqv.element).fold(c6ys, new I16(18));
            }
            c78t3 = c78t5;
            c78t4 = (C78T) c10543Hqv.element;
        }
        return c78t3.plus(c78t4);
    }

    /* JADX WARN: Incorrect types in method signature: (LX/HtJ<*>;LX/78T;Ljava/lang/Object;)LX/GAp<*>; */
    public static final GAp A03(Object obj, HtJ htJ, C78T c78t) {
        GAp gAp = null;
        if ((htJ instanceof GAu) && c78t.get(Hn9.A00) != null) {
            GAu callerFrame = (GAu) htJ;
            while (true) {
                if ((callerFrame instanceof GAs) || (callerFrame = callerFrame.getCallerFrame()) == null) {
                    break;
                }
                if (callerFrame instanceof GAp) {
                    GAp gAp2 = (GAp) callerFrame;
                    gAp = gAp2;
                    if (gAp2 != null) {
                        gAp2.threadLocalIsSet = true;
                        gAp2.A00.set(C3cG.A0r(c78t, obj));
                    }
                }
            }
        }
        return gAp;
    }

    public static final C78T A00(C78T c78t, C78T c78t2) {
        return !AnonymousClass001.A1X(c78t2.fold(AnonymousClass001.A0h(), new I16(17))) ? c78t.plus(c78t2) : A01(c78t, c78t2);
    }

    public static final C78T A02(C78T c78t, C3UX c3ux) {
        C78T c78tA01 = A01(c3ux.AEA(), c78t);
        GBK gbk = AbstractC9266GBt.A00;
        return (c78tA01 == gbk || c78tA01.get(InterfaceC10590Hxd.A00) != null) ? c78tA01 : c78tA01.plus(gbk);
    }
}
