package androidx.media3.datasource;

import X.C1O;
import X.FGI;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/* loaded from: classes5.dex */
public final class HttpDataSource$InvalidResponseCodeException extends HttpDataSource$HttpDataSourceException {
    public final Map<String, List<String>> headerFields;
    public final byte[] responseBody;
    public final int responseCode;
    public final String responseMessage;

    /* JADX WARN: Incorrect types in method signature: (ILjava/lang/String;Ljava/io/IOException;Ljava/util/Map<Ljava/lang/String;Ljava/util/List<Ljava/lang/String;>;>;LX/C1O;[B)V */
    public HttpDataSource$InvalidResponseCodeException(C1O c1o, IOException iOException, String str, Map map, byte[] bArr, int i) {
        super(c1o, iOException, FGI.A0H("Response code: ", i), 2004);
        this.responseCode = i;
        this.responseMessage = str;
        this.headerFields = map;
        this.responseBody = bArr;
    }
}
