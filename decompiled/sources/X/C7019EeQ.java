package X;

import android.os.SystemClock;
import java.io.IOException;
import java.io.InputStream;
import java.util.Map;

/* renamed from: X.EeQ, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C7019EeQ implements EUm {
    public final /* synthetic */ EUt A00;
    public final /* synthetic */ C7018EeP A01;

    public C7019EeQ(EUt eUt, C7018EeP c7018EeP) {
        this.A00 = eUt;
        this.A01 = c7018EeP;
    }

    @Override // X.EUm
    public final void AS7() {
        EUt eUt = this.A00;
        InterfaceC7029Eea interfaceC7029Eea = eUt.context;
        ((C7185Ehv) interfaceC7029Eea).A05.AV0(interfaceC7029Eea, "NetworkFetchProducer", null);
        eUt.consumer.AS7();
    }

    @Override // X.EUm
    public final void onFailure(Throwable th) {
        EUt eUt = this.A00;
        InterfaceC7029Eea interfaceC7029Eea = eUt.context;
        ((C7185Ehv) interfaceC7029Eea).A05.AV2(interfaceC7029Eea, "NetworkFetchProducer", th, null);
        InterfaceC7029Eea interfaceC7029Eea2 = eUt.context;
        ((C7185Ehv) interfaceC7029Eea2).A05.AWt(interfaceC7029Eea2, "NetworkFetchProducer", false);
        ((C7185Ehv) eUt.context).AYq("network", "default");
        eUt.consumer.onFailure(th);
    }

    @Override // X.EUm
    public final void AVW(InputStream inputStream, int i) throws IOException {
        C6984Edk c6984Edk;
        C7267Ejs.A00();
        C7018EeP c7018EeP = this.A01;
        EUt eUt = this.A00;
        C7011EeI c7011EeI = c7018EeP.A01;
        if (i > 0) {
            c6984Edk = new C6984Edk(c7011EeI.A01, i);
        } else {
            AbstractC6525EBz abstractC6525EBz = c7011EeI.A01;
            c6984Edk = new C6984Edk(abstractC6525EBz, abstractC6525EBz.A00[0]);
        }
        C6524EBy c6524EBy = c7018EeP.A00;
        byte[] bArr = (byte[]) c6524EBy.get(16384);
        while (true) {
            try {
                int i2 = inputStream.read(bArr);
                if (i2 < 0) {
                    break;
                }
                if (i2 > 0) {
                    c6984Edk.write(bArr, 0, i2);
                    InterfaceC7029Eea interfaceC7029Eea = eUt.context;
                    if (interfaceC7029Eea.AGL().A0H != null && interfaceC7029Eea.AOc()) {
                        long jUptimeMillis = SystemClock.uptimeMillis();
                        long j = jUptimeMillis - eUt.lastIntermediateResultTimeMs;
                        InterfaceC7029Eea interfaceC7029Eea2 = eUt.context;
                        interfaceC7029Eea2.AGL();
                        if (j >= 100) {
                            eUt.lastIntermediateResultTimeMs = jUptimeMillis;
                            ((C7185Ehv) interfaceC7029Eea2).AYq("network", "default");
                            InterfaceC7029Eea interfaceC7029Eea3 = eUt.context;
                            ((C7185Ehv) interfaceC7029Eea3).A05.AUy(interfaceC7029Eea3, "NetworkFetchProducer", "intermediate_result");
                            C7018EeP.A00(eUt.responseBytesRange, c6984Edk, eUt.consumer, eUt.context, eUt.getUri().getQuery(), eUt.onNewResultStatusFlags);
                        }
                    }
                    eUt.consumer.AV9(i > 0 ? c6984Edk.A00 / i : 1.0f - ((float) Math.exp((-r0) / 50000.0d)));
                }
            } catch (Throwable th) {
                c6524EBy.Aa9(bArr);
                c6984Edk.close();
                throw th;
            }
        }
        AbstractC6692EUz abstractC6692EUz = c7018EeP.A02;
        abstractC6692EUz.onFetchCompletion(eUt, c6984Edk.A00);
        int i3 = c6984Edk.A00;
        InterfaceC7029Eea interfaceC7029Eea4 = eUt.context;
        Map<String, String> extraMap = !((C7185Ehv) interfaceC7029Eea4).A05.AbE(interfaceC7029Eea4, "NetworkFetchProducer") ? null : abstractC6692EUz.getExtraMap(eUt, i3);
        InterfaceC7029Eea interfaceC7029Eea5 = eUt.context;
        InterfaceC7027EeY interfaceC7027EeY = ((C7185Ehv) interfaceC7029Eea5).A05;
        interfaceC7027EeY.AV4(interfaceC7029Eea5, "NetworkFetchProducer", extraMap);
        interfaceC7027EeY.AWt(eUt.context, "NetworkFetchProducer", true);
        ((C7185Ehv) eUt.context).AYq("network", "default");
        C7018EeP.A00(eUt.responseBytesRange, c6984Edk, eUt.consumer, eUt.context, eUt.getUri().getQuery(), eUt.onNewResultStatusFlags | 1);
        c6524EBy.Aa9(bArr);
        c6984Edk.close();
        C7267Ejs.A00();
    }
}
