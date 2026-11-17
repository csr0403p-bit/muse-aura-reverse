package androidx.media3.datasource;

import X.C1O;
import com.google.common.base.Ascii;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;

/* loaded from: classes5.dex */
public class HttpDataSource$HttpDataSourceException extends DataSourceException {
    public final C1O dataSpec;
    public final int type;

    public HttpDataSource$HttpDataSourceException(C1O c1o) {
        this.dataSpec = c1o;
        this.type = 1;
    }

    public static HttpDataSource$HttpDataSourceException A00(C1O c1o, IOException iOException, int i) {
        int i2;
        String message = iOException.getMessage();
        if (iOException instanceof SocketTimeoutException) {
            i2 = 2002;
        } else if (iOException instanceof InterruptedIOException) {
            i2 = 1004;
        } else {
            if (message != null && Ascii.toLowerCase(message).matches("cleartext.*not permitted.*")) {
                return new HttpDataSource$CleartextNotPermittedException(c1o, iOException, "Cleartext HTTP traffic not permitted. See https://developer.android.com/guide/topics/media/issues/cleartext-not-permitted", 2007);
            }
            i2 = 2001;
        }
        return new HttpDataSource$HttpDataSourceException(c1o, iOException, i2, i);
    }

    public HttpDataSource$HttpDataSourceException(C1O c1o, String str, int i) {
        super(str, i == 1 ? 2001 : 2000);
        this.dataSpec = c1o;
        this.type = i;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public HttpDataSource$HttpDataSourceException(C1O c1o, IOException iOException, int i, int i2) {
        if (i == 2000 && i2 == 1) {
            i = 2001;
        }
        super(iOException, i);
        this.dataSpec = c1o;
        this.type = i2;
    }

    public HttpDataSource$HttpDataSourceException(C1O c1o, IOException iOException, String str, int i) {
        super(i, str, iOException);
        this.dataSpec = c1o;
        this.type = 1;
    }
}
