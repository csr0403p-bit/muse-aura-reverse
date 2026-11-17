package X;

/* renamed from: X.3MX, reason: invalid class name */
/* loaded from: classes.dex */
public final class C3MX {
    public static final /* synthetic */ C3MX A02 = new C3MX();
    public static final AOc<Float> A00 = AnonymousClass003.A0Q(null);
    public static final C3MW A01 = new C3MW() { // from class: X.3MY
        @Override // X.C3MW
        public final /* synthetic */ float calculateScrollDistance(float f, float f2, float f3) {
            float f4 = f2 + f;
            if (f >= 0.0f && f4 <= f3) {
                return 0.0f;
            }
            if (f < 0.0f && f4 > f3) {
                return 0.0f;
            }
            float f5 = f4 - f3;
            return Math.abs(f) >= Math.abs(f5) ? f5 : f;
        }
    };
}
