package androidx.media3.exoplayer.upstream;

import X.BV5;
import X.C3cI;
import X.FGI;
import java.io.IOException;

/* loaded from: classes5.dex */
public final class Loader$UnexpectedLoaderException extends IOException {
    public Loader$UnexpectedLoaderException(Throwable th) {
        super(FGI.A0U("Unexpected ", C3cI.A0Y(th), th.getMessage() != null ? BV5.A0n(": ", th) : ""), th);
    }
}
