package X;

import com.facebook.aura.ccv.nativeflow.ui.HatchCcvLoggingKt;
import java.util.Collection;
import java.util.Map;
import kotlin.jvm.functions.Function0;

/* renamed from: X.A6j, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C0862A6j {
    public static Collection A00(Object obj) {
        if ((obj instanceof BOA) && !(obj instanceof InterfaceC0884AGl)) {
            A03(obj, "kotlin.collections.MutableCollection");
            throw F60.createAndThrow();
        }
        try {
            return (Collection) obj;
        } catch (ClassCastException e) {
            C7384Etj.A0c(e, C0862A6j.class.getName());
            throw e;
        }
    }

    public static Map A01(Object obj) {
        if ((obj instanceof BOA) && !(obj instanceof InterfaceC0863A6k)) {
            A03(obj, "kotlin.collections.MutableMap");
            throw F60.createAndThrow();
        }
        try {
            return (Map) obj;
        } catch (ClassCastException e) {
            C7384Etj.A0c(e, C0862A6j.class.getName());
            throw e;
        }
    }

    public static void A02(Object obj, int i) {
        if (obj == null || A04(i, obj)) {
            return;
        }
        A03(obj, FGI.A0H("kotlin.jvm.functions.Function", i));
        throw F60.createAndThrow();
    }

    public static void A03(Object obj, String str) {
        ClassCastException classCastException = new ClassCastException(FGI.A0U(obj == null ? HatchCcvLoggingKt.NO_POSTAL_FIELD : obj.getClass().getName(), " cannot be cast to ", str));
        C7384Etj.A0c(classCastException, C0862A6j.class.getName());
        throw classCastException;
    }

    public static boolean A04(int i, Object obj) {
        int arity;
        if (obj instanceof Ht9) {
            if (obj instanceof BM4) {
                arity = ((BM4) obj).getArity();
            } else if (obj instanceof Function0) {
                arity = 0;
            } else if (obj instanceof G0U) {
                arity = 1;
            } else if (obj instanceof G0V) {
                arity = 2;
            } else if (obj instanceof G0W) {
                arity = 3;
            } else if (obj instanceof G2j) {
                arity = 4;
            } else if (obj instanceof G2k) {
                arity = 5;
            } else if (obj instanceof G2l) {
                arity = 6;
            } else if (obj instanceof G2m) {
                arity = 7;
            } else if (obj instanceof G2n) {
                arity = 8;
            } else if (obj instanceof G2o) {
                arity = 9;
            } else if (obj instanceof G2p) {
                arity = 10;
            } else if (obj instanceof G2q) {
                arity = 11;
            } else if (obj instanceof G2s) {
                arity = 13;
            } else if (obj instanceof G2t) {
                arity = 14;
            } else if (obj instanceof G2u) {
                arity = 15;
            } else if (obj instanceof G2v) {
                arity = 16;
            } else if (obj instanceof G31) {
                arity = 17;
            } else if (obj instanceof G30) {
                arity = 18;
            } else if (obj instanceof G2w) {
                arity = 19;
            } else if (obj instanceof G2z) {
                arity = 20;
            } else {
                arity = -1;
                if (obj instanceof G2y) {
                    arity = 21;
                }
            }
            if (arity == i) {
                return true;
            }
        }
        return false;
    }
}
