package X;

/* loaded from: classes5.dex */
public abstract class DJV {
    public static String A00(int i, boolean z, boolean z2) {
        return z ? "missing_config" : z2 ? "always_on" : i != 1 ? i != 2 ? i != 3 ? "unknown" : "per_user" : "per_session" : "random_sampling";
    }
}
