package X;

import android.content.Context;
import android.content.Intent;
import com.facebook.common.dextricks.DexStore;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;

/* renamed from: X.7mk, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C06977mk {
    public final long A00;
    public final C7381Etf A01;
    public final ArrayList<String> A02;
    public final ArrayList<String> A03;
    public final ArrayList<String> A04;
    public final C7AW A05;

    public static final C06967mj A00(Context context, Intent intent, C06977mk c06977mk) throws NoSuchAlgorithmException {
        long j = c06977mk.A00;
        long j2 = 16 & j;
        int i = DexStore.DAYS_TO_MS_FACTOR;
        if (j2 != 0) {
            i = Integer.MAX_VALUE;
        }
        C06967mj c06967mjA01 = C7mn.A01(context, intent, i, j);
        A01(context, c06967mjA01, c06977mk);
        return c06967mjA01;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0088  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void A01(android.content.Context r13, X.C06967mj r14, X.C06977mk r15) {
        /*
            Method dump skipped, instructions count: 639
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C06977mk.A01(android.content.Context, X.7mj, X.7mk):void");
    }

    public C06977mk(C7mA c7mA) {
        C7381Etf c7381Etf = c7mA.A01;
        this.A01 = c7381Etf;
        this.A03 = c7mA.A03;
        ArrayList<String> arrayList = c7mA.A04;
        this.A04 = arrayList;
        ArrayList<String> arrayList2 = c7mA.A02;
        this.A02 = arrayList2;
        this.A00 = c7mA.A00;
        C7AW c7aw = new C7AW("-----BEGIN CERTIFICATE-----\nMIIHSjCCBTKgAwIBAgIUMqu0GPj0dxaS3wM0PbRvSju84pAwDQYJKoZIhvcNAQEL\nBQAwgYkxMjAwBgNVBAMMKU1ldGEgQW5kcm9pZCBDb2RlIFNpZ25pbmcgUm9vdCBD\nQSAyMDI0LTExMQswCQYDVQQGEwJVUzETMBEGA1UECAwKQ2FsaWZvcm5pYTETMBEG\nA1UEBwwKTWVubG8gUGFyazEcMBoGA1UECgwTTWV0YSBQbGF0Zm9ybXMgSW5jLjAg\nFw0yNDEyMDIxODAxMzNaGA8yMDY0MTIwMjE4MDEzM1owgZExOjA4BgNVBAMMMU1l\ndGEgQW5kcm9pZCBDb2RlIFNpZ25pbmcgSW50ZXJtZWRpYXRlIENBIDIwMjQtMTEx\nCzAJBgNVBAYTAlVTMRMwEQYDVQQIDApDYWxpZm9ybmlhMRMwEQYDVQQHDApNZW5s\nbyBQYXJrMRwwGgYDVQQKDBNNZXRhIFBsYXRmb3JtcyBJbmMuMIICIjANBgkqhkiG\n9w0BAQEFAAOCAg8AMIICCgKCAgEAxDUbQ06fnMfu8zdp7w9jGBVn21iJo7Ijy6IF\nfK5oW6LFcUkpDhwnXarI3aBgmGzpYHyT6EyfPJlGIP3IyHiC5jT2FdqeLobHgvM1\nirnpPZ1QtBZVqDA7kvIIaUKKZI5bjF8mmu+UNRd6Kpf80bK5b9JWo/tOaSjXcYp+\nssvW85dkJOKI3h25wv2UOP8FrjBqaa5uBWEjL4ZPGIK34DLa9wyHar8t6KJtZyyA\n5llzRHhItZtCrSzPt1oSQVyz7vJP3I6/k4h4/jHJYbNgv46X9xXnSrpS3hg6pz2u\nnE7ROHu4YlDPumN8tUANY70KH1iQAeqElMS+FAk10zozPXgWePVNaiiXMlHqtn5R\npxEjG2FKlnmk1Tts3IsOqwjSh3LDrR6UgeK+/ohrJo9syF+DtadiIw3+JitJCULU\nwpzBgvTaZhuHAJQjIHdj7suF2pJb7z+4BRHFQSe1D6V8ASsteA44yRZ7HmluyQrH\nPnFVLqpi6WrKQd0K5QBvzEXAyngK4enrrueJRLTI0iFLmpHlTzZz4PnMj97wk937\nmy9hEE1bpJ23Iq/7X0pd96a5A4ok1v6g+tIq4LOJw4vlnGkyicO0qiG9oCY73RlY\nG6Kqe7Ixrz5VyW1eqzXS+OYziM9/WrxSeX0yChg1Du6CZ7XkZ8f2z36qdyo9FJbe\nr9i/Yo8CAwEAAaOCAZwwggGYMB0GA1UdDgQWBBTXkJNftGsrt70jjbM/ncije5sq\nSTCByQYDVR0jBIHBMIG+gBS9vFtEtoGitdmo9Cr084l+As58QqGBj6SBjDCBiTEy\nMDAGA1UEAwwpTWV0YSBBbmRyb2lkIENvZGUgU2lnbmluZyBSb290IENBIDIwMjQt\nMTExCzAJBgNVBAYTAlVTMRMwEQYDVQQIDApDYWxpZm9ybmlhMRMwEQYDVQQHDApN\nZW5sbyBQYXJrMRwwGgYDVQQKDBNNZXRhIFBsYXRmb3JtcyBJbmMughQMyntiA/pg\nhnto9rUVTt9k4besvzAOBgNVHQ8BAf8EBAMCAYYwEgYDVR0TAQH/BAgwBgEB/wIB\nADBJBgNVHR8EQjBAMD6gPKA6hjhodHRwczovL21ldGEucHVibGlja2V5aW5mcmEu\nY29tL2FybC9hbmRyb2lkX2NvZGVfc2lnbmluZzAgBggrBgEFBQcBAQQUMBIwEAYI\nKwYBBQUHMAGGBE5vbmUwGgYJYIZIAYb4QgENBA0WC09uY2FsbDogcGtpMA0GCSqG\nSIb3DQEBCwUAA4ICAQAEnZoUr6uKpGcKlX+frBA53aCA+GjAEucTTSOFgicekm45\ntLRBbTPlU99zUZ7TDLuYIHv2ntZwsuWcSsYSrtlN1t77Bs5cBvjlwNoICfSC/F9S\nQzm7l7KrOvloBSnU/svT012H3Wn+fd0vVrMZD916KNnZLR0zC68L6gs6OREJdUQW\nDUgX5ZGbTkuB9thqKvC0kGjoJbimh7GE19zZq7ODjaI9bfeM3fnEZMM2fllAG0iA\nJld80Cyfkfj911d8pnxqzIVxJBuPM5jEvuC6dci8brZVhWKNvhvo3xWMyyTb2Uv/\noFbQ53VugsmMdz8i1Dn2HIspm6tQtLp2RYMWu5mdrEsevJ8NbrteCZliVo2BarTk\nn8N1kc9Ntz5J+fkQDWvpa/KQ+Z5SmbLNwIKW0KjJZQoEAwuudLQr8PLEsOw0Q6Xt\n0LDyhShpa6jqn2DaY/0vFpIovf1zmICzpWEu4bfm3IfEAk1Smjr3BAAl8t39YNSa\nN56MKmvE57JzUjvjvwzYRfJlVrRbkTJMihgTQL7yA6WiMyjWPAmf9k91pbf1lBNN\nLsWNCz36o+GHzAeZLcFUYBCx3BJ9Ip1sLLDcjs6dblT5dfAv/PDAMaWKOJv4byBU\ncuxYRJR0qEUppn7J1RU4cKvvr7Gka62yFThiPTnbesFI4LQpZjxQCn8XD0Llfg==\n-----END CERTIFICATE-----\n".getBytes());
        c7aw.A00 = null;
        this.A05 = c7aw;
        if (c7381Etf == null && arrayList.isEmpty() && arrayList2.isEmpty() && (1 & this.A00) == 0) {
            throw C60O.A0i("TrustedCaller needs to be configured with at least 1 security check");
        }
    }
}
