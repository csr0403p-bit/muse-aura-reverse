package X;

/* renamed from: X.CfJ, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC3830CfJ {
    public static void A00(int value, String name) {
        if (value < 0) {
            throw C60O.A0i(FGI.A0S(name, " cannot be negative but was: ", value));
        }
    }

    public static void A01(Object key, Object value) {
        if (key == null) {
            throw BV4.A0a(AnonymousClass007.A0a("null key in entry: null=", value));
        }
        if (value == null) {
            throw BV4.A0a(AnonymousClass001.A0v("=null", C3cG.A0f(key, "null value in entry: ")));
        }
    }
}
