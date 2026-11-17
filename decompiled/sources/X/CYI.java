package X;

import com.facebook.tigon.TigonBodyStream;
import com.facebook.tigon.TigonXplatBodyProvider;
import java.util.concurrent.Executor;
import org.apache.http.HttpEntity;

/* loaded from: classes5.dex */
public final class CYI extends TigonXplatBodyProvider {
    public final int A00 = 4096;
    public final Executor A01;
    public final HttpEntity A02;

    public CYI(Executor executor, HttpEntity httpEntity) {
        this.A02 = httpEntity;
        this.A01 = executor;
    }

    @Override // com.facebook.tigon.TigonBodyProvider
    public final void beginStream(TigonBodyStream tigonBodyStream) {
        this.A01.execute(new CYJ(tigonBodyStream, this, this.A00));
    }

    @Override // com.facebook.tigon.TigonBodyProvider
    public final long getContentLength() {
        long contentLength = this.A02.getContentLength();
        if (contentLength > 2147483647L) {
            return 2147483647L;
        }
        return contentLength;
    }

    @Override // com.facebook.tigon.TigonBodyProvider
    public final String getName() {
        return "TigonHttpEntity";
    }
}
