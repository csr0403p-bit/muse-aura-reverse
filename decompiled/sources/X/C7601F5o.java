package X;

import com.facebook.analytics2.logger.interfaces.DefaultFFDBProvider;

/* renamed from: X.F5o, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C7601F5o implements F18 {
    public final int $t;

    public C7601F5o(int i) {
        this.$t = i;
    }

    @Override // X.F18
    /* renamed from: get */
    public final Object AMN() {
        switch (this.$t) {
            case 0:
                return new DefaultFFDBProvider();
            case 1:
                return AbstractC5245DeA.A02(C5249DeE.A00(), 32768);
            case 2:
                return new EWT("MIIC/TCCAqSgAwIBAgIUNymdhTP/0YDPMJaJtQcqCahEFygwCgYIKoZIzj0EAwIwfDEiMCAGA1UEAwwZRmFjZWJvb2sgUGF5bWVudHMgUm9vdCBDQTELMAkGA1UEBhMCVVMxEzARBgNVBAgMCkNhbGlmb3JuaWExEzARBgNVBAcMCk1lbmxvIFBhcmsxHzAdBgNVBAoMFkZhY2Vib29rIFBheW1lbnRzIEluYy4wIBcNMjAwNjAzMjMwMzEyWhgPMjA3MDA2MDMyMzAzMTJaMHwxIjAgBgNVBAMMGUZhY2Vib29rIFBheW1lbnRzIFJvb3QgQ0ExCzAJBgNVBAYTAlVTMRMwEQYDVQQIDApDYWxpZm9ybmlhMRMwEQYDVQQHDApNZW5sbyBQYXJrMR8wHQYDVQQKDBZGYWNlYm9vayBQYXltZW50cyBJbmMuMFkwEwYHKoZIzj0CAQYIKoZIzj0DAQcDQgAEVgHjgdXliIzstMydc99Grq3a+XM9oNuvNMmThjmD10Mu4dyN9jDAvz7WUKEaTE20tRAJOpobf0EuRGHoOntHR6OCAQAwgf0wDwYDVR0TAQH/BAUwAwEB/zAdBgNVHQ4EFgQUy3wJDXDuhw25PFnkqA6RjH56VXowgboGA1UdIwSBsjCBr4AUy3wJDXDuhw25PFnkqA6RjH56VXqhgYCkfjB8MSIwIAYDVQQDDBlGYWNlYm9vayBQYXltZW50cyBSb290IENBMQswCQYDVQQGEwJVUzETMBEGA1UECAwKQ2FsaWZvcm5pYTETMBEGA1UEBwwKTWVubG8gUGFyazEfMB0GA1UECgwWRmFjZWJvb2sgUGF5bWVudHMgSW5jLoIUNymdhTP/0YDPMJaJtQcqCahEFygwDgYDVR0PAQH/BAQDAgGGMAoGCCqGSM49BAMCA0cAMEQCIEA9xLMNmT9uJYurGmPXbP0cs0niRW5dp1YNwEBVamZoAiB2Vjz24gYBRMp0TmgrqDRfglR3lrzkGLm6Y5EXbZP5og==");
            default:
                return null;
        }
    }
}
