package okhttp3.internal.http2;

import X.AnonymousClass006;
import X.C60O;
import X.Ec2;
import java.io.IOException;

/* loaded from: classes5.dex */
public final class StreamResetException extends IOException {
    public final Ec2 errorCode;

    public StreamResetException(Ec2 ec2) {
        super(AnonymousClass006.A0y(ec2, "stream was reset: ", C60O.A0w()));
        this.errorCode = ec2;
    }
}
