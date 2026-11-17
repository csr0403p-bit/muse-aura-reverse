package X;

import com.facebook.tigon.TigonCallbacks;
import com.facebook.tigon.TigonError;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Map;
import java.util.concurrent.CountDownLatch;

/* loaded from: classes5.dex */
public final class CYC extends TigonCallbacks {
    public final /* synthetic */ CYA A00;
    public final /* synthetic */ ByteArrayOutputStream A01;
    public final /* synthetic */ CountDownLatch A02;
    public final /* synthetic */ F1E A03;
    public final /* synthetic */ C10543Hqv<Map<String, String>> A04;

    @Override // com.facebook.tigon.TigonCallbacks
    public final void onBody(ByteBuffer byteBuffer) throws IOException {
        byte[] bArrA1X;
        C7384Etj.A0Y(byteBuffer, 0);
        ByteArrayOutputStream byteArrayOutputStream = this.A01;
        if (byteBuffer.hasArray() && byteBuffer.arrayOffset() == 0 && byteBuffer.position() == 0 && byteBuffer.remaining() == byteBuffer.array().length) {
            byteBuffer.position(byteBuffer.limit());
            bArrA1X = byteBuffer.array();
            C7384Etj.A0U(bArrA1X);
        } else {
            bArrA1X = BV5.A1X(byteBuffer);
        }
        byteArrayOutputStream.write(bArrA1X);
    }

    @Override // com.facebook.tigon.TigonCallbacks
    public final void onError(TigonError tigonError, CY1 cy1) {
        C7384Etj.A0Y(tigonError, 0);
        this.A03.element = tigonError.A00;
        this.A02.countDown();
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [T, java.util.Map<java.lang.String, java.lang.String>] */
    @Override // com.facebook.tigon.TigonCallbacks
    public final void onResponse(CYF cyf) {
        C7384Etj.A0Y(cyf, 0);
        this.A03.element = cyf.A00;
        this.A04.element = cyf.A01;
    }

    /* JADX WARN: Incorrect types in method signature: (LX/F1E;LX/Hqv<Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;>;Ljava/io/ByteArrayOutputStream;LX/CYA;Ljava/util/concurrent/CountDownLatch;)V */
    public CYC(CYA cya, ByteArrayOutputStream byteArrayOutputStream, CountDownLatch countDownLatch, F1E f1e, C10543Hqv c10543Hqv) {
        this.A03 = f1e;
        this.A04 = c10543Hqv;
        this.A01 = byteArrayOutputStream;
        this.A00 = cya;
        this.A02 = countDownLatch;
    }

    @Override // com.facebook.tigon.TigonCallbacks
    public final void onEOM(CY1 cy1) {
        this.A02.countDown();
    }
}
