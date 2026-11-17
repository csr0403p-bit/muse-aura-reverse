package X;

import com.facebook.aura.executors.AuraDispatchers;

/* renamed from: X.78W, reason: invalid class name */
/* loaded from: classes3.dex */
public abstract class C78W {
    /* JADX WARN: Multi-variable type inference failed */
    public static <E extends C78X> E A00(C78X c78x, C78I<E> c78i) {
        C7384Etj.A0Y(c78i, 1);
        if (C7384Etj.areEqual(c78x.getKey(), c78i)) {
            return c78x;
        }
        return null;
    }

    public static C78T A01(C78X c78x, C78I<?> c78i) {
        C7384Etj.A0Y(c78i, 1);
        boolean zAreEqual = C7384Etj.areEqual(c78x.getKey(), c78i);
        C78T c78t = c78x;
        if (zAreEqual) {
            c78t = C6ys.A00;
        }
        return c78t;
    }

    public static C78T A02(C78X c78x, C78T c78t) {
        C7384Etj.A0Y(c78t, 1);
        return c78t != C6ys.A00 ? (C78T) c78t.fold(c78x, new C8i0(33)) : c78x;
    }

    public static HzC A03() {
        return Hxb.A02(A02(new C8eO(null), AuraDispatchers.INSTANCE.io()));
    }

    public static HzC A04(C78X c78x) {
        return Hxb.A02(A02(c78x, new C8eO(null)));
    }

    public static HzC A05(C78X c78x, C78T c78t) {
        return Hxb.A02(A02(c78x, c78t));
    }
}
