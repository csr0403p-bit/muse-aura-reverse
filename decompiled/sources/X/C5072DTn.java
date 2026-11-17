package X;

import android.net.Uri;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: X.DTn, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C5072DTn {
    public static final AtomicLong A05 = new AtomicLong();
    public final long A00;
    public final long A01;
    public final Uri A02;
    public final C1O A03;
    public final Map<String, List<String>> A04;

    public C5072DTn(Uri uri, C1O c1o, Map map, long j, long j2) {
        this.A01 = j;
        this.A03 = c1o;
        this.A02 = uri;
        this.A04 = map;
        this.A00 = j2;
    }

    public C5072DTn(C1O c1o, long j, long j2) {
        Uri uri;
        if (c1o != null) {
            uri = c1o.A06;
        } else {
            uri = null;
        }
        Map<String, List<String>> map = Collections.EMPTY_MAP;
        this.A01 = j;
        this.A03 = c1o;
        this.A02 = uri;
        this.A04 = map;
        this.A00 = j2;
    }
}
