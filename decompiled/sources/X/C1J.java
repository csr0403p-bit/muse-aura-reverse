package X;

import android.net.Uri;
import java.util.List;
import java.util.Map;

/* loaded from: classes5.dex */
public interface C1J extends C1L {
    void addTransferListener(CXB cxb);

    void close();

    Map<String, List<String>> getResponseHeaders();

    Uri getUri();

    long open(C1O c1o);
}
