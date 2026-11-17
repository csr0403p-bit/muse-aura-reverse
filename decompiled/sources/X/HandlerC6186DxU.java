package X;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.Arrays;

/* renamed from: X.DxU, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class HandlerC6186DxU extends Handler {
    public final /* synthetic */ C6159Dx2 A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HandlerC6186DxU(Looper looper, C6159Dx2 c6159Dx2) {
        super(looper);
        this.A00 = c6159Dx2;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) throws Throwable {
        byte[] bArr = (byte[]) message.obj;
        if (bArr != null) {
            for (C6160Dx3 c6160Dx3 : this.A00.A08) {
                C6160Dx3.A00(c6160Dx3);
                if (Arrays.equals(c6160Dx3.A04, bArr)) {
                    if (message.what == 2 && c6160Dx3.A00 == 4) {
                        C6160Dx3.A03(c6160Dx3, false);
                        return;
                    }
                    return;
                }
            }
        }
    }
}
