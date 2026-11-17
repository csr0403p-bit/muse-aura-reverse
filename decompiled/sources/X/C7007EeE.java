package X;

/* renamed from: X.EeE, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C7007EeE {
    public static boolean A00;

    public static final synchronized void A00() {
        if (!A00) {
            C3463COl.loadLibrary("native-imagetranscoder");
            A00 = true;
        }
    }
}
