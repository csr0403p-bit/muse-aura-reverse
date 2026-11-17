package X;

import com.facebook.aura.network.fresco.AuraImageNetworkFetcher;
import com.facebook.common.time.RealtimeSinceBootClock;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* renamed from: X.EUo, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C6687EUo extends AbstractC6692EUz<C6690EUx> {
    public int A00;
    public final DK9 A01;
    public final ExecutorService A02;

    public C6687EUo(int i) {
        RealtimeSinceBootClock realtimeSinceBootClock = RealtimeSinceBootClock.A00;
        this.A02 = Executors.newFixedThreadPool(3);
        this.A01 = realtimeSinceBootClock;
        this.A00 = 30000;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.net.HttpURLConnection A00(android.net.Uri r5, X.C6687EUo r6, int r7) throws java.io.IOException {
        /*
            android.net.Uri r0 = X.AbstractC7465Eww.A00
            if (r5 != 0) goto L21
            r1 = 0
        L5:
            java.net.URLConnection r2 = r1.openConnection()
            java.net.HttpURLConnection r2 = (java.net.HttpURLConnection) r2
            int r0 = r6.A00
            r2.setConnectTimeout(r0)
            int r4 = r2.getResponseCode()
            r0 = 200(0xc8, float:2.8E-43)
            if (r4 < r0) goto L1d
            r1 = 300(0x12c, float:4.2E-43)
            r0 = 1
            if (r4 < r1) goto L1e
        L1d:
            r0 = 0
        L1e:
            if (r0 == 0) goto L2b
            return r2
        L21:
            java.lang.String r0 = r5.toString()     // Catch: java.net.MalformedURLException -> L9b
            java.net.URL r1 = new java.net.URL     // Catch: java.net.MalformedURLException -> L9b
            r1.<init>(r0)     // Catch: java.net.MalformedURLException -> L9b
            goto L5
        L2b:
            r0 = 307(0x133, float:4.3E-43)
            if (r4 == r0) goto L63
            r0 = 308(0x134, float:4.32E-43)
            if (r4 == r0) goto L63
            switch(r4) {
                case 300: goto L63;
                case 301: goto L63;
                case 302: goto L63;
                case 303: goto L63;
                default: goto L36;
            }     // Catch: java.net.MalformedURLException -> L9b
        L36:
            r0 = 0
        L37:
            r3 = 1
            if (r0 == 0) goto L89
            java.lang.String r0 = "Location"
            java.lang.String r0 = r2.getHeaderField(r0)
            r2.disconnect()
            if (r0 != 0) goto L5e
            r2 = 0
        L46:
            java.lang.String r1 = r5.getScheme()
            if (r7 <= 0) goto L65
            if (r2 == 0) goto L7e
            java.lang.String r0 = r2.getScheme()
            boolean r0 = X.AbstractC7213Eib.A00(r0, r1)
            if (r0 != 0) goto L7e
            int r7 = r7 - r3
            java.net.HttpURLConnection r0 = A00(r2, r6, r7)
            return r0
        L5e:
            android.net.Uri r2 = android.net.Uri.parse(r0)
            goto L46
        L63:
            r0 = 1
            goto L37
        L65:
            if (r7 != 0) goto L7e
            java.lang.String r0 = r5.toString()
            java.lang.Object[] r2 = new java.lang.Object[]{r0}
            java.lang.String r1 = "URL %s follows too many redirects"
        L71:
            java.util.Locale r0 = java.util.Locale.getDefault()
            java.lang.String r0 = java.lang.String.format(r0, r1, r2)
            java.io.IOException r0 = X.BV4.A0K(r0)
            throw r0
        L7e:
            java.lang.String r0 = r5.toString()
            java.lang.Object[] r2 = X.BV5.A1a(r0, r4)
            java.lang.String r1 = "URL %s returned %d without a valid redirect"
            goto L71
        L89:
            r2.disconnect()
            java.lang.String r0 = r5.toString()
            java.lang.Object[] r1 = X.BV5.A1a(r0, r4)
            java.lang.String r0 = "Image URL %s returned HTTP code %d"
            java.io.IOException r0 = X.BV7.A0j(r0, r1)
            throw r0
        L9b:
            r0 = move-exception
            java.lang.RuntimeException r0 = X.BV4.A0e(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C6687EUo.A00(android.net.Uri, X.EUo, int):java.net.HttpURLConnection");
    }

    @Override // X.AbstractC6692EUz
    public final /* bridge */ /* synthetic */ EUt createFetchState(InterfaceC7028EeZ interfaceC7028EeZ, InterfaceC7029Eea interfaceC7029Eea) {
        return new C6690EUx(interfaceC7028EeZ, interfaceC7029Eea);
    }

    @Override // X.AbstractC6692EUz
    public final /* bridge */ /* synthetic */ void fetch(EUt eUt, EUm eUm) {
        C6690EUx c6690EUx = (C6690EUx) eUt;
        c6690EUx.A02 = this.A01.now();
        c6690EUx.context.A3R(new C6689EUw(this, eUm, this.A02.submit(new RunnableC6688EUq(c6690EUx, this, eUm))));
    }

    @Override // X.AbstractC6692EUz
    public final /* bridge */ /* synthetic */ Map getExtraMap(EUt eUt, int i) {
        C6690EUx c6690EUx = (C6690EUx) eUt;
        HashMap mapA0v = BV4.A0v(4);
        mapA0v.put(AuraImageNetworkFetcher.QUEUE_TIME, Long.toString(c6690EUx.A01 - c6690EUx.A02));
        mapA0v.put(AuraImageNetworkFetcher.FETCH_TIME, Long.toString(c6690EUx.A00 - c6690EUx.A01));
        mapA0v.put(AuraImageNetworkFetcher.TOTAL_TIME, Long.toString(c6690EUx.A00 - c6690EUx.A02));
        mapA0v.put(AuraImageNetworkFetcher.IMAGE_SIZE, Integer.toString(i));
        return mapA0v;
    }

    @Override // X.AbstractC6692EUz
    public final /* bridge */ /* synthetic */ void onFetchCompletion(EUt eUt, int i) {
        ((C6690EUx) eUt).A00 = this.A01.now();
    }

    public C6687EUo() {
        RealtimeSinceBootClock realtimeSinceBootClock = RealtimeSinceBootClock.A00;
        this.A02 = Executors.newFixedThreadPool(3);
        this.A01 = realtimeSinceBootClock;
    }
}
