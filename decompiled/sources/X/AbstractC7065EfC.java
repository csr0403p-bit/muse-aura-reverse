package X;

/* renamed from: X.EfC, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC7065EfC extends AbstractC7046Ees {
    public static final String TAG = "CloseableImage";

    public void finalize() {
        if (isClosed()) {
            return;
        }
        AbstractC3422CMk.A06(TAG, "finalize: %s %x still open.", BV5.A1a(C3cI.A0Y(this), System.identityHashCode(this)));
        close();
    }
}
