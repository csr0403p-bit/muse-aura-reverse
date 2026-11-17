package com.facebook.tigon.tigonhuc;

import X.AbstractC3613CXs;
import X.AnonymousClass003;
import X.C06H;
import X.C3614CXy;
import X.C60O;
import X.C6558EEu;
import X.C7384Etj;
import X.RunnableC3607CXa;
import com.facebook.aura.main.AuraDeeplinkHandlerActivity;
import java.security.cert.Certificate;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;

/* loaded from: classes5.dex */
public class HucClient {
    public static final int BODY_UPLOAD_TIMEOUT_SECONDS = 120;
    public static final int DEFAULT_CONNECT_TIMEOUT_MILLISECONDS = 10000;
    public static final int DEFAULT_READ_TIMEOUT_MILLISECONDS = 30000;
    public static final Set<String> SUPPORTED_PROTOCOLS = C60O.A19(AuraDeeplinkHandlerActivity.HTTP, "https");
    public final CertificatePinner certificatePinner;
    public final int defaultConnectTimeoutMs;
    public final ExecutorService executor;
    public final HostnameVerifier hostnameVerifier;
    public final SSLSocketFactory sslSocketFactory;

    public interface CertificatePinner {
        void checkCertificates(String str, Certificate[] certificateArr);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HucClient(ExecutorService executorService) {
        this(executorService, null, null, 10000);
        C7384Etj.A0Y(executorService, 0);
    }

    public HucRequestToken startRequest(byte[] bArr, int i, TigonHucBodyProvider tigonHucBodyProvider, TigonHucCallbackForwarder tigonHucCallbackForwarder) {
        AnonymousClass003.A0w(bArr, tigonHucCallbackForwarder);
        return new HucRequestToken(this.executor.submit(new RunnableC3607CXa(AbstractC3613CXs.A02(new C3614CXy(bArr, i)), this, tigonHucBodyProvider, tigonHucCallbackForwarder)));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HucClient(ExecutorService executorService, SSLSocketFactory sSLSocketFactory, CertificatePinner certificatePinner) {
        this(executorService, sSLSocketFactory, certificatePinner, 10000);
        C7384Etj.A0Y(executorService, 0);
    }

    public HucClient(ExecutorService executorService, SSLSocketFactory sSLSocketFactory, CertificatePinner certificatePinner, int i) {
        C7384Etj.A0Y(executorService, 0);
        this.executor = executorService;
        this.sslSocketFactory = sSLSocketFactory;
        this.certificatePinner = certificatePinner;
        this.defaultConnectTimeoutMs = i;
        this.hostnameVerifier = new C6558EEu();
    }

    public /* synthetic */ HucClient(ExecutorService executorService, SSLSocketFactory sSLSocketFactory, CertificatePinner certificatePinner, int i, int i2, C06H c06h) {
        this(executorService, (i2 & 2) != 0 ? null : sSLSocketFactory, (i2 & 4) != 0 ? null : certificatePinner, (i2 & 8) != 0 ? 10000 : i);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public HucClient(ExecutorService executorService, SSLSocketFactory sSLSocketFactory) {
        this(executorService, sSLSocketFactory, null, 10000);
        C7384Etj.A0Y(executorService, 0);
    }
}
