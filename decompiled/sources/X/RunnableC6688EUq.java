package X;

import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;

/* renamed from: X.EUq, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class RunnableC6688EUq implements Runnable {
    public static final String __redex_internal_original_name = "HttpUrlConnectionNetworkFetcher$1";
    public final /* synthetic */ C6690EUx A00;
    public final /* synthetic */ C6687EUo A01;
    public final /* synthetic */ EUm A02;

    public RunnableC6688EUq(C6690EUx c6690EUx, C6687EUo c6687EUo, EUm eUm) {
        this.A00 = c6690EUx;
        this.A02 = eUm;
        this.A01 = c6687EUo;
    }

    @Override // java.lang.Runnable
    public final void run() throws IOException {
        HttpURLConnection httpURLConnectionA00;
        C6687EUo c6687EUo = this.A01;
        C6690EUx c6690EUx = this.A00;
        EUm eUm = this.A02;
        InputStream inputStream = null;
        try {
            try {
                httpURLConnectionA00 = C6687EUo.A00(c6690EUx.getUri(), c6687EUo, 5);
                try {
                    c6690EUx.A01 = c6687EUo.A01.now();
                } catch (IOException e) {
                    e = e;
                    eUm.onFailure(e);
                    if (inputStream != null) {
                        try {
                            inputStream.close();
                        } catch (IOException unused) {
                        }
                    }
                    if (httpURLConnectionA00 == null) {
                        return;
                    }
                    httpURLConnectionA00.disconnect();
                }
            } finally {
            }
        } catch (IOException e2) {
            e = e2;
            httpURLConnectionA00 = null;
        } catch (Throwable th) {
            throw th;
        }
        if (httpURLConnectionA00 != null) {
            inputStream = httpURLConnectionA00.getInputStream();
            eUm.AVW(inputStream, -1);
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException unused2) {
                }
            }
            httpURLConnectionA00.disconnect();
        }
    }
}
