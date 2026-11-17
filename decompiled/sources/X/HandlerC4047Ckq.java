package X;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.io.ByteArrayOutputStream;
import java.util.Collections;
import java.util.Iterator;

/* renamed from: X.Ckq, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class HandlerC4047Ckq extends Handler {
    public final /* synthetic */ C4048Ckr A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HandlerC4047Ckq(Looper looper, C4048Ckr c4048Ckr) {
        super(looper);
        this.A00 = c4048Ckr;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        int i = message.what;
        if (i != 1) {
            throw BV5.A0Q("Unknown what=", i);
        }
        ByteArrayOutputStream byteArrayOutputStream = (ByteArrayOutputStream) message.obj;
        C4048Ckr c4048Ckr = this.A00;
        C3332CFa c3332CFa = new C3332CFa(c4048Ckr.A03, byteArrayOutputStream);
        InterfaceC4012Cjq interfaceC4012Cjq = c4048Ckr.A05;
        Integer num = c4048Ckr.A04.A03;
        Iterator it = Collections.singletonList(c3332CFa).iterator();
        C4011Cjp c4011Cjp = new C4011Cjp(new ClA(), null, interfaceC4012Cjq, c4048Ckr.A06, c4048Ckr.A07, num, it);
        while (c4011Cjp.A00.hasNext()) {
            c4011Cjp.A00();
        }
    }
}
