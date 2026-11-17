package X;

import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.Executor;

/* renamed from: X.EeG, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC7009EeG implements InterfaceC7015EeM<C6988Edo> {
    public final C7011EeI A00;
    public final Executor A01;

    @Override // X.InterfaceC7015EeM
    public final void AYc(InterfaceC7028EeZ<C6988Edo> interfaceC7028EeZ, InterfaceC7029Eea interfaceC7029Eea) {
        C7185Ehv c7185Ehv = (C7185Ehv) interfaceC7029Eea;
        InterfaceC7027EeY interfaceC7027EeY = c7185Ehv.A05;
        C7183Eht c7183Eht = c7185Ehv.A07;
        interfaceC7029Eea.AYq("local", "fetch");
        C7010EeH c7010EeH = new C7010EeH(interfaceC7028EeZ, this, interfaceC7029Eea, interfaceC7029Eea, interfaceC7027EeY, interfaceC7027EeY, c7183Eht, A01());
        InterfaceC7029Eea.A00(interfaceC7029Eea, c7010EeH, this, 2);
        this.A01.execute(c7010EeH);
    }

    public final C6988Edo A00(InputStream inputStream, int i) throws IOException {
        C6984Edk c6984Edk;
        C7011EeI c7011EeI = this.A00;
        EfF efFA00 = null;
        try {
            try {
                if (i <= 0) {
                    C7384Etj.A0Y(inputStream, 0);
                    AbstractC6525EBz abstractC6525EBz = c7011EeI.A01;
                    c6984Edk = new C6984Edk(abstractC6525EBz, abstractC6525EBz.A00[0]);
                    c7011EeI.A00.A00(inputStream, c6984Edk);
                    C6986Edm c6986EdmA00 = c6984Edk.A00();
                    c6984Edk.close();
                    efFA00 = EfF.A00(c6986EdmA00);
                } else {
                    C7384Etj.A0Y(inputStream, 0);
                    c6984Edk = new C6984Edk(c7011EeI.A01, i);
                    c7011EeI.A00.A00(inputStream, c6984Edk);
                    C6986Edm c6986EdmA002 = c6984Edk.A00();
                    c6984Edk.close();
                    efFA00 = EfF.A00(c6986EdmA002);
                }
                C6988Edo c6988Edo = new C6988Edo(efFA00);
                CVO.A00(inputStream);
                efFA00.close();
                return c6988Edo;
            } catch (Throwable th) {
                c6984Edk.close();
                throw th;
            }
        } catch (Throwable th2) {
            CVO.A00(inputStream);
            if (efFA00 != null) {
                efFA00.close();
            }
            throw th2;
        }
    }

    public final String A01() {
        return this instanceof DVP ? "QualifiedResourceFetchProducer" : this instanceof DVN ? "LocalResourceFetchProducer" : this instanceof DVT ? "LocalFileFetchProducer" : this instanceof DVR ? "LocalContentUriThumbnailFetchProducer" : this instanceof DVM ? "LocalContentUriFetchProducer" : this instanceof DVO ? "LocalAssetFetchProducer" : "DataFetchProducer";
    }

    public AbstractC7009EeG(C7011EeI c7011EeI, Executor executor) {
        this.A01 = executor;
        this.A00 = c7011EeI;
    }
}
