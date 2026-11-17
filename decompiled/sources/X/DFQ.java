package X;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* loaded from: classes5.dex */
public final class DFQ extends Handler {
    public CIA A00;
    public boolean A01;
    public final /* synthetic */ DFP A02;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DFQ(Looper looper, DFP dfp) {
        super(looper);
        this.A02 = dfp;
        this.A01 = false;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) throws Exception {
        C4932DFh c4932DFh;
        boolean z;
        int i = message.what;
        switch (i) {
            case 1:
                C1H.A01(message.obj, "Cannot process null event.");
                c4932DFh = (C4932DFh) message.obj;
                z = false;
                break;
            case 2:
                C1H.A01(message.obj, "Cannot process null event.");
                c4932DFh = (C4932DFh) message.obj;
                z = true;
                break;
            case 3:
                C1H.A01(message.obj, "Cannot start new session with null BatchSession.");
                CIA cia = (CIA) message.obj;
                this.A00 = cia;
                this.A02.A02.AgA(cia);
                return;
            case 4:
                this.A02.A02.ART((C4931DFd) message.obj);
                return;
            case 5:
                this.A02.A02.AhQ();
                return;
            case 6:
                C1H.A00(message.obj);
                throw new NullPointerException("amendUuid");
            default:
                throw new IllegalArgumentException(FGI.A0H("Unsupported handler message: msg.what = ", i));
        }
        if (!this.A01) {
            synchronized (this) {
                this.A01 = true;
            }
        }
        DFP dfp = this.A02;
        try {
            if (z) {
                dfp.A02.AYY(c4932DFh);
            } else {
                dfp.A02.AYZ(c4932DFh);
            }
        } catch (Exception e) {
            CFK.A0C("LocalDebug:EventProcessorProxy", "Unhandled exception in batchUploadEvent for event '%s'", e, c4932DFh.A09);
            throw e;
        }
    }
}
