package X;

import android.os.ConditionVariable;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.ExV, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C7479ExV {
    public static C7479ExV A05;
    public CTK A00;
    public String A01;
    public String A02;
    public final AtomicBoolean A04 = C60O.A1E();
    public final ConditionVariable A03 = new ConditionVariable();

    public static synchronized C7479ExV A00() {
        C7479ExV c7479ExV;
        c7479ExV = A05;
        if (c7479ExV == null) {
            c7479ExV = new C7479ExV();
            A05 = c7479ExV;
        }
        return c7479ExV;
    }
}
