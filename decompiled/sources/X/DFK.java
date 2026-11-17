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

/* loaded from: classes5.dex */
public final class DFK extends Handler {
    public CIA A00;
    public final Object A01;
    public final /* synthetic */ DFN A02;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DFK(Looper looper, DFN dfn) {
        super(looper);
        this.A02 = dfn;
        this.A01 = C3cG.A0T();
    }

    private DFU A00() {
        DFN dfn = this.A02;
        DFU dfu = dfn.A00;
        if (dfu != null) {
            return dfu;
        }
        DFS dfs = dfn.A06;
        Context context = dfs.A00;
        C4B<Object> c4bA01 = C4B.A01(!CHb.A00(context).A01());
        AnonymousClass003.A0u(context, DGG.A00);
        File fileA00 = AbstractC3416CMe.A00(context, 1543572765);
        fileA00.mkdirs();
        File fileA0O = C3cG.A0O(fileA00, "micro_batch");
        fileA0O.mkdirs();
        C4940DFw c4940DFw = dfs.A04;
        C3339CFj c3339CFj = dfs.A07;
        String strA00 = AbstractC3294CCd.A00();
        if (strA00 == null) {
            strA00 = "unknown";
        }
        C3377CHy c3377CHy = new C3377CHy(dfs.A03, c4940DFw, c4bA01, c3339CFj, C3cG.A0O(fileA0O, strA00), 50);
        C4061Cl4 c4061Cl4 = dfs.A06;
        DFV dfv = dfs.A05;
        C4045Cko c4045Cko = new C4045Cko(c4061Cl4, fileA0O, dfv.multiBatchPayloadSize());
        DGD dgd = dfs.A01;
        DFU dfu2 = new DFU(dgd, c3377CHy, dfv, new C4075ClN(context, dgd, c4045Cko));
        dfn.A00 = dfu2;
        return dfu2;
    }

    public static void A01(DFK dfk, C3341CFl c3341CFl, String str, String str2, String str3) {
        DGD dgd = dfk.A02.A02;
        if (dgd.isHealthCounterEnabled()) {
            dgd.get().APx(str, str2, str3, new C7589F5c(c3341CFl, 25), 1L);
        }
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        int i;
        C3341CFl c3341CFl;
        DGc dGc;
        AbstractC3136BzG.A00("handleMessage");
        try {
            i = message.what;
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
        if (i == 1) {
            int i2 = message.arg1;
            Object obj = message.obj;
            if (i2 == 2) {
                AbstractC3136BzG.A00("doWrites");
                try {
                    synchronized (this.A01) {
                        throw BV4.A0a("finished");
                    }
                } catch (Throwable unused) {
                    throw BV4.A0a("recycle");
                }
            }
            C4932DFh c4932DFh = (C4932DFh) obj;
            DFN dfn = this.A02;
            C4080ClS c4080ClSA00 = dfn.A08.A00(c4932DFh.A01);
            c4932DFh.A03 = c4080ClSA00.A01;
            c4932DFh.A02 = c4080ClSA00.A00;
            AbstractC3136BzG.A00("doWrite");
            try {
                AbstractC3136BzG.A00("writeToDisk");
                try {
                    try {
                        DFU dfuA00 = A00();
                        CI5 ci5 = dfuA00.A00;
                        ci5.A02(c4932DFh);
                        InterfaceC4935DFn interfaceC4935DFn = dfuA00.A01;
                        interfaceC4935DFn.Adb(ci5.A00());
                        interfaceC4935DFn.ARN(c4932DFh);
                        DFU.A00(dfuA00);
                        String str = c4932DFh.A09;
                        String str2 = c4932DFh.A0A;
                        c3341CFl = c4932DFh.A07;
                        A01(this, c3341CFl, "event.persisted", str, str2);
                    } finally {
                        Trace.endSection();
                    }
                } catch (CrossProcessBatchLockState$FailedFileCreationException | EventBatchFileStore$FailedFileBatchLockException | IOException unused2) {
                    String str3 = c4932DFh.A09;
                    String str4 = c4932DFh.A0A;
                    c3341CFl = c4932DFh.A07;
                    A01(this, c3341CFl, "event.not_processed.persist.failed", str3, str4);
                    try {
                        if (dfn.A01 == null) {
                            DFS dfs = dfn.A06;
                            C4940DFw c4940DFw = dfs.A04;
                            C3339CFj c3339CFj = dfs.A07;
                            C3378CHz c3378CHz = new C3378CHz(dfs.A03, c4940DFw, c3339CFj, 50);
                            Context context = dfs.A00;
                            C4061Cl4 c4061Cl4 = dfs.A06;
                            DFV dfv = dfs.A05;
                            long inMemoryUploadDelay = dfv.getInMemoryUploadDelay();
                            DGD dgd = dfs.A01;
                            DFU dfu = new DFU(dgd, c3378CHz, dfv, new C4048Ckr(context, dgd, c4061Cl4, c3339CFj, inMemoryUploadDelay));
                            dfn.A01 = dfu;
                            dfu.A00.A03(this.A00);
                        }
                        DFU dfu2 = dfn.A01;
                        CI5 ci52 = dfu2.A00;
                        ci52.A02(c4932DFh);
                        InterfaceC4935DFn interfaceC4935DFn2 = dfu2.A01;
                        interfaceC4935DFn2.Adb(ci52.A00());
                        interfaceC4935DFn2.ARN(c4932DFh);
                        DFU.A00(dfu2);
                        A01(this, c3341CFl, "event.persisted.in_memory", str3, str4);
                    } catch (IOException e) {
                        throw BV4.A0e(e);
                    }
                }
                Trace.endSection();
                long j = c4932DFh.A01;
                if (j != -2 && j != -4 && (dGc = dfn.A04) != null) {
                    AbstractC3136BzG.A00("eventListener");
                    try {
                        dGc.onEventReceived();
                        Trace.endSection();
                    } catch (Throwable th2) {
                        Trace.endSection();
                        throw th2;
                    }
                }
                c3341CFl.A03();
            } catch (Throwable th3) {
                c4932DFh.A07.A03();
                throw th3;
            }
            Trace.endSection();
            throw th;
        }
        try {
            if (i == 3) {
                CIA cia = (CIA) message.obj;
                AbstractC3136BzG.A00("doStartNewSession");
                this.A00 = cia;
                DFN dfn2 = this.A02;
                A00().A00.A03(cia);
                DFU dfu3 = dfn2.A01;
                if (dfu3 != null) {
                    dfu3.A00.A03(this.A00);
                }
            } else {
                if (i != 4) {
                    if (i == 7) {
                        ((ConditionVariable) message.obj).open();
                    } else if (i != 8) {
                        if (i != 9) {
                            throw BV5.A0Q("Unknown what=", i);
                        }
                        AbstractC3136BzG.A00("doUpload");
                        DFN dfn3 = this.A02;
                        A00().A01.AhQ();
                        DFU dfu4 = dfn3.A01;
                        if (dfu4 != null) {
                            dfu4.A01.AhQ();
                        }
                    }
                    Trace.endSection();
                }
                C4931DFd c4931DFd = (C4931DFd) message.obj;
                AbstractC3136BzG.A00("doUserLogout");
                String str5 = c4931DFd != null ? c4931DFd.userId : null;
                DFN dfn4 = this.A02;
                A00().A01.ARU(str5);
                DFU dfu5 = dfn4.A01;
                if (dfu5 != null) {
                    dfu5.A01.ARU(str5);
                }
            }
        } catch (Throwable th4) {
            Trace.endSection();
            throw th4;
        }
        Trace.endSection();
        Trace.endSection();
    }
}
