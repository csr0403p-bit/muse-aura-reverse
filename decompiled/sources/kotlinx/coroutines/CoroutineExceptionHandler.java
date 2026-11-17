package kotlinx.coroutines;

import X.C78T;
import X.C78X;
import X.C78p;

/* loaded from: classes3.dex */
public interface CoroutineExceptionHandler extends C78X {
    public static final C78p Key = C78p.A00;

    void handleException(C78T c78t, Throwable th);
}
