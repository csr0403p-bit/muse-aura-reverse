package X;

import android.net.Uri;
import com.facebook.acra.util.HttpConnectionProvider;
import com.facebook.acra.util.InputStreamField;
import com.facebook.aura.gateway.JarvisProtocolKt;
import com.facebook.aura.gateway.service.NodeCommandFallbackWorker;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.C7k, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3280C7k implements C4U {
    public static final List<String> A04 = Arrays.asList("log_type", "build_id", JarvisProtocolKt.APP_ID_QUERY_PARAM, NodeCommandFallbackWorker.KEY_USER_ID, "device_id", C6B.A0B.name);
    public final Uri A00;
    public final HttpConnectionProvider A01;
    public final C3278C7g A02;
    public final String A03;

    /* JADX WARN: Removed duplicated region for block: B:126:0x02cf A[Catch: all -> 0x02f1, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x02f1, blocks: (B:71:0x0189, B:126:0x02cf, B:142:0x02f0, B:141:0x02ed, B:72:0x018d, B:124:0x02ca, B:136:0x02e4, B:135:0x02e1, B:139:0x02e8), top: B:148:0x0189, inners: #3, #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:129:0x02d7 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:186:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean A00(X.C4S r17, java.util.Map<java.lang.String, com.facebook.acra.util.InputStreamField> r18, int r19) throws org.json.JSONException, java.net.ProtocolException {
        /*
            Method dump skipped, instructions count: 758
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C3280C7k.A00(X.C4S, java.util.Map, int):boolean");
    }

    public C3280C7k(Uri uri, HttpConnectionProvider httpConnectionProvider, C3278C7g c3278C7g, String str) {
        this.A03 = str;
        this.A00 = uri;
        this.A01 = httpConnectionProvider;
        this.A02 = c3278C7g;
    }

    @Override // X.C4U
    public final boolean send(String str, File file, C4S c4s, Map<String, File> map, int i, C4T c4t) throws IOException {
        HashMap mapA0u = BV4.A0u();
        try {
            Iterator itA0n = AnonymousClass002.A0n(map);
            while (itA0n.hasNext()) {
                Map.Entry entryA0l = C3cH.A0l(itA0n);
                File file2 = (File) entryA0l.getValue();
                if (file2.exists()) {
                    mapA0u.put((String) entryA0l.getKey(), new InputStreamField(BV4.A0H(file2), true, true, file2.length()));
                } else {
                    CFK.A0H(C9Y.TAG, "Attachment missing: %s %s", entryA0l.getKey(), file2.getPath());
                }
            }
            return A00(c4s, mapA0u, i);
        } finally {
            Iterator itA0x = BV5.A0x(mapA0u);
            while (itA0x.hasNext()) {
                ((InputStreamField) itA0x.next()).mInputStream.close();
            }
        }
    }
}
