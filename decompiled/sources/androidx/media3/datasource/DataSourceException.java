package androidx.media3.datasource;

import java.io.IOException;

/* loaded from: classes5.dex */
public class DataSourceException extends IOException {
    public final int reason;

    public DataSourceException() {
        this.reason = 2008;
    }

    public DataSourceException(int i, String str, Throwable th) {
        super(str, th);
        this.reason = i;
    }

    public DataSourceException(String str, int i) {
        super(str);
        this.reason = i;
    }

    public DataSourceException(Throwable th, int i) {
        super(th);
        this.reason = i;
    }
}
