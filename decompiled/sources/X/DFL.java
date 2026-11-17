package X;

import android.content.Context;
import android.os.ConditionVariable;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Trace;
import com.facebook.analytics2.logger.legacy.batchsupport.CrossProcessBatchLockState$FailedFileCreationException;
import com.facebook.analytics2.logger.legacy.eventprocessor.EventBatchFileStore$FailedFileBatchLockException;
import java.io.File;
import java.io.IOException;
import java.util.LinkedList;
import java.util.Queue;

/* loaded from: classes5.dex */
public final class DFL extends Handler {
    public CIA A00;
    public Queue<Message> A01;
    public final Object A02;
    public final Object A03;
    public final /* synthetic */ DFO A04;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DFL(Looper looper, DFO dfo) {
        super(looper);
        this.A04 = dfo;
        this.A02 = C3cG.A0T();
        this.A03 = C3cG.A0T();
    }

    private DFT A00() {
        DFO dfo = this.A04;
        DFT dft = dfo.A00;
        if (dft != null) {
            return dft;
        }
        DFR dfr = dfo.A05;
        Context context = dfr.A01;
        C4B<Object> c4bA01 = C4B.A01(!CHb.A00(context).A01());
        String str = dfr.A0A;
        AnonymousClass003.A0u(context, DGG.A00);
        File fileA00 = AbstractC3416CMe.A00(context, 1543572765);
        fileA00.mkdirs();
        File fileA0O = C3cG.A0O(fileA00, str);
        fileA0O.mkdirs();
        int i = dfr.A03.A00;
        C4940DFw c4940DFw = dfr.A06;
        C3339CFj c3339CFj = dfr.A09;
        String strA00 = AbstractC3294CCd.A00();
        if (strA00 == null) {
            strA00 = "unknown";
        }
        C3377CHy c3377CHy = new C3377CHy(dfr.A04, c4940DFw, c4bA01, c3339CFj, C3cG.A0O(fileA0O, strA00), i);
        int i2 = dfr.A00;
        C4045Cko c4045Cko = new C4045Cko(dfr.A07, fileA0O, 20000);
        InterfaceC4081ClT interfaceC4081ClT = dfr.A05;
        InterfaceC4083Clb interfaceC4083Clb = dfr.A08;
        C4079ClR foregroundParams = interfaceC4083Clb.getForegroundParams();
        C4079ClR backgroundParams = interfaceC4083Clb.getBackgroundParams();
        DGD dgd = dfr.A02;
        DFT dft2 = new DFT(dgd, c3377CHy, new C4076ClO(context, dgd, interfaceC4081ClT, c4045Cko, foregroundParams, backgroundParams, i2));
        dfo.A00 = dft2;
        return dft2;
    }

    private void A01(Message message) throws Throwable {
        int i = message.what;
        if (i != 1) {
            if (i == 3) {
                A02((CIA) message.obj);
                return;
            }
            try {
                if (i == 4) {
                    String str = (String) message.obj;
                    AbstractC3136BzG.A00("doUserLogout");
                    A00().A01.ARU(str);
                    DFT dft = this.A04.A01;
                    if (dft != null) {
                        dft.A01.ARU(str);
                    }
                } else {
                    if (i == 7) {
                        ((ConditionVariable) message.obj).open();
                        return;
                    }
                    if (i == 8) {
                        return;
                    }
                    if (i != 9) {
                        throw BV5.A0Q("Unknown what=", i);
                    }
                    AbstractC3136BzG.A00("doUpload");
                    A00().A01.AhQ();
                    DFT dft2 = this.A04.A01;
                    if (dft2 != null) {
                        dft2.A01.AhQ();
                    }
                }
                Trace.endSection();
            } catch (Throwable th) {
                th = th;
                Trace.endSection();
                throw th;
            }
        }
        int i2 = message.arg1;
        Object obj = message.obj;
        if (i2 == 2) {
            AbstractC3136BzG.A00("doWrites");
            synchronized (this.A02) {
                throw BV4.A0a("finished");
            }
        }
        C4932DFh c4932DFh = (C4932DFh) obj;
        AbstractC3136BzG.A00("doWrite");
        try {
            AbstractC3136BzG.A00("writeToDisk");
            try {
                try {
                    DFT dftA00 = A00();
                    dftA00.A00.A02(c4932DFh);
                    DFT.A00(dftA00);
                    A03(this, c4932DFh.A07, "event.persisted", c4932DFh.A09, c4932DFh.A0A);
                } catch (Throwable th2) {
                    Trace.endSection();
                    throw th2;
                }
            } catch (CrossProcessBatchLockState$FailedFileCreationException | EventBatchFileStore$FailedFileBatchLockException | IOException unused) {
                String str2 = c4932DFh.A09;
                String str3 = c4932DFh.A0A;
                C3341CFl c3341CFl = c4932DFh.A07;
                A03(this, c3341CFl, "event.not_processed.persist.failed", str2, str3);
                try {
                    DFO dfo = this.A04;
                    if (dfo.A01 == null) {
                        DFR dfr = dfo.A05;
                        int i3 = dfr.A03.A00;
                        C4940DFw c4940DFw = dfr.A06;
                        C3339CFj c3339CFj = dfr.A09;
                        C3378CHz c3378CHz = new C3378CHz(dfr.A04, c4940DFw, c3339CFj, i3);
                        Context context = dfr.A01;
                        C4061Cl4 c4061Cl4 = dfr.A07;
                        DGD dgd = dfr.A02;
                        DFT dft3 = new DFT(dgd, c3378CHz, new C4049Cks(context, dgd, c4061Cl4, c3339CFj));
                        dfo.A01 = dft3;
                        dft3.A00.A03(this.A00);
                    }
                    DFT dft4 = dfo.A01;
                    dft4.A00.A02(c4932DFh);
                    DFT.A00(dft4);
                    A03(this, c3341CFl, "event.persisted.in_memory", str2, str3);
                } catch (IOException e) {
                    throw BV4.A0e(e);
                }
            }
            Trace.endSection();
            DGc dGc = this.A04.A04;
            if (dGc != null) {
                AbstractC3136BzG.A00("eventListener");
                try {
                    dGc.onEventReceived();
                    Trace.endSection();
                } catch (Throwable th3) {
                    Trace.endSection();
                    throw th3;
                }
            }
            c4932DFh.A07.A03();
            Trace.endSection();
        } catch (Throwable th4) {
            th = th4;
            c4932DFh.A07.A03();
            Trace.endSection();
            throw th;
        }
    }

    private void A02(CIA cia) {
        AbstractC3136BzG.A00("doStartNewSession");
        try {
            C1H.A01(cia, "A new batch session should never be null");
            this.A00 = cia;
            DFT dftA00 = A00();
            dftA00.A00.A03(this.A00);
            DFT dft = this.A04.A01;
            if (dft != null) {
                dft.A00.A03(this.A00);
            }
            LinkedList linkedListA0y = BV4.A0y();
            synchronized (this.A03) {
                Queue<Message> queue = this.A01;
                if (queue != null) {
                    linkedListA0y.addAll(queue);
                    this.A01.clear();
                    this.A01 = null;
                }
            }
            while (!linkedListA0y.isEmpty()) {
                Message message = (Message) linkedListA0y.poll();
                if (message != null) {
                    A01(message);
                    message.recycle();
                }
            }
        } finally {
            Trace.endSection();
        }
    }

    public static void A03(DFL dfl, C3341CFl c3341CFl, String str, String str2, String str3) {
        DGD dgd = dfl.A04.A02;
        if (dgd.isHealthCounterEnabled()) {
            dgd.get().APx(str, str2, str3, new C7589F5c(c3341CFl, 24), 1L);
        }
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        if (this.A00 != null || message.what == 3) {
            AbstractC3136BzG.A00("handleMessage");
            try {
                A01(message);
                return;
            } finally {
                Trace.endSection();
            }
        }
        synchronized (this.A03) {
            Queue queueA0y = this.A01;
            if (queueA0y == null) {
                queueA0y = BV4.A0y();
                this.A01 = queueA0y;
            }
            queueA0y.add(Message.obtain(message));
        }
    }
}
