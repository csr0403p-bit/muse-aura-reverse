package X;

import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;

/* renamed from: X.Ayi, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC2117Ayi {
    public static final ThreadLocal<BE7> A01 = new ThreadLocal<>();
    public static final long A00 = C8j3.A0M();

    public static final TextDirectionHeuristic A00(int i) {
        return i != 0 ? i != 1 ? i != 2 ? TextDirectionHeuristics.FIRSTSTRONG_RTL : TextDirectionHeuristics.FIRSTSTRONG_LTR : TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR;
    }
}
