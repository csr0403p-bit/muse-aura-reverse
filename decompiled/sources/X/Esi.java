package X;

import android.util.Pair;
import com.facebook.msys.mci.Execution;

/* loaded from: classes5.dex */
public final class Esi extends ThreadLocal<Pair<Integer, Long>> {
    @Override // java.lang.ThreadLocal
    public final /* bridge */ /* synthetic */ Pair<Integer, Long> initialValue() {
        return Pair.create(Integer.valueOf(Execution.nativeGetExecutionContext()), Execution.nativeGetSessionedExecutionKey());
    }
}
