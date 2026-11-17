package kotlinx.coroutines;

import X.HoC;
import java.util.concurrent.CancellationException;

/* loaded from: classes6.dex */
public final class TimeoutCancellationException extends CancellationException {
    public final transient HoC A00;

    public TimeoutCancellationException(String str, HoC hoC) {
        super(str);
        this.A00 = hoC;
    }
}
