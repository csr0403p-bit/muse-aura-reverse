package X;

import com.facebook.tigon.TigonBodyStream;
import com.facebook.tigon.TigonError;
import com.facebook.tigon.TigonXplatBodyProvider;
import com.facebook.tigon.iface.TigonErrorCode;
import java.io.InputStream;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* loaded from: classes5.dex */
public final class CYT extends TigonXplatBodyProvider {
    public final long A00;
    public final InputStream A01;
    public final Executor A02;

    @Override // com.facebook.tigon.TigonBodyProvider
    public final void beginStream(TigonBodyStream tigonBodyStream) {
        C7384Etj.A0Y(tigonBodyStream, 0);
        try {
            this.A02.execute(new CYS(this, tigonBodyStream, this.A01, this.A00));
        } catch (RejectedExecutionException e) {
            tigonBodyStream.reportError(new TigonError(TigonErrorCode.A05, "TigonChunkedBodyProvider", FGI.A0M(C3cI.A0Y(e), " while providing the request body"), 3));
        }
    }

    @Override // com.facebook.tigon.TigonBodyProvider
    public final long getContentLength() {
        return Math.min(this.A00, 2147483647L);
    }

    @Override // com.facebook.tigon.TigonBodyProvider
    public final String getName() {
        return "TigonChunkedBodyProvider";
    }

    public CYT(InputStream inputStream, Executor executor, long j) {
        AnonymousClass003.A0v(inputStream, executor);
        this.A01 = inputStream;
        this.A00 = j;
        this.A02 = executor;
    }
}
