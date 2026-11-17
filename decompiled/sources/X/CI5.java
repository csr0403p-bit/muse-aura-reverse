package X;

import android.os.Build;
import android.os.SystemClock;
import android.os.Trace;
import com.facebook.acra.constants.ErrorReportingConstants;
import com.facebook.analytics2.logger.legacy.eventprocessor.EventBatchFileStore$FailedFileBatchLockException;
import com.facebook.aura.ageverification.intf.AgeCheckFunnelLogging;
import com.facebook.aura.ccv.nativeflow.ui.HatchCcvLoggingKt;
import com.facebook.aura.gateway.JarvisProtocolKt;
import com.facebook.common.build.BuildConstants;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.Writer;
import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.Queue;
import java.util.Set;

/* loaded from: classes5.dex */
public abstract class CI5<T> {
    public CIA A00;
    public CI6 A01;

    /* JADX WARN: Incorrect inner types in field signature: LX/CI5<TT;>.Batch; */
    public CI1 A02;
    public final int A03;
    public final C4940DFw A04;
    public final C3339CFj A09;
    public final Set A07 = C60O.A13();
    public final Queue<C4932DFh> A06 = BV4.A0y();
    public final char[] A08 = new char[1024];
    public final ByteBuffer A05 = ByteBuffer.allocate(2048);

    public CI5(CI8 ci8, C4940DFw c4940DFw, C3339CFj c3339CFj, int i) {
        this.A03 = i;
        this.A04 = c4940DFw;
        this.A09 = c3339CFj;
        this.A01 = new CI6(new CIA(null, ci8.provideSessionId()), c3339CFj);
    }

    public final T A00() {
        if (this instanceof C3378CHz) {
            CI1 ci1 = this.A02;
            if (ci1 != null) {
                return (T) ((CI2) ci1).A00;
            }
            return null;
        }
        CI1 ci12 = this.A02;
        if (ci12 != null) {
            return (T) ((CI0) ci12).A00;
        }
        return null;
    }

    public final void A01() throws IOException {
        CI1 ci1 = this.A02;
        if (ci1 != null) {
            try {
                ci1.A03.close();
                ci1.A01.A01();
            } catch (IOException unused) {
            }
            this.A02 = null;
        }
    }

    public final void A02(C4932DFh c4932DFh) throws Throwable {
        long jElapsedRealtime;
        CI1 ci0;
        File parentFile;
        CI6 ci6;
        Writer writer;
        C3339CFj c3339CFj;
        C3341CFl c3341CFlA03;
        int iIncrementAndGet;
        C4931DFd c4931DFd;
        CI1 ci1 = this.A02;
        if (ci1 == null || !ci1.A01.A06(this)) {
            A01();
            CIA cia = this.A00;
            String str = (cia == null || (c4931DFd = cia.A01) == null) ? null : c4931DFd.userId;
            CI1 ci12 = this.A02;
            if (!(this instanceof C3378CHz)) {
                C3377CHy c3377CHy = (C3377CHy) this;
                int i = 0;
                do {
                    File file = c3377CHy.A01;
                    String str2 = str;
                    if (str == null) {
                        str2 = HatchCcvLoggingKt.NO_POSTAL_FIELD;
                    }
                    File fileA0O = C3cG.A0O(file, str2);
                    String str3 = c3377CHy.A02;
                    File fileA0O2 = C3cG.A0O(C3cG.A0O(fileA0O, String.valueOf(C3364CHi.A00())), String.valueOf(C3364CHi.A01()));
                    synchronized (C3364CHi.class) {
                        jElapsedRealtime = SystemClock.elapsedRealtime();
                    }
                    File fileA0O3 = C3cG.A0O(fileA0O2, FGI.A0k("batch-", String.valueOf(jElapsedRealtime), "-", str3, "-", Integer.toString(C3364CHi.A00.getAndIncrement()), ".json"));
                    if (ci12 != null && fileA0O3.getCanonicalPath().equals(((CI0) ci12).A00.getCanonicalPath())) {
                        fileA0O3 = BV5.A0K(BV4.A0j(fileA0O3.getCanonicalPath(), r4.length() - 5), "-1.json");
                    }
                    C4C c4cA02 = c3377CHy.A00.A02(fileA0O3);
                    try {
                        try {
                            if (c4cA02.A06(c3377CHy)) {
                                try {
                                    parentFile = fileA0O3.getParentFile();
                                } catch (FileNotFoundException unused) {
                                    File parentFile2 = fileA0O3.getParentFile();
                                    if (parentFile2 != null && !parentFile2.isDirectory() && !parentFile2.mkdirs()) {
                                        throw BV8.A0j(fileA0O3, "Unable to create parent directories for: ");
                                    }
                                    ci0 = new CI0(c4cA02, c3377CHy, fileA0O3);
                                }
                                if (parentFile != null && !parentFile.isDirectory() && !parentFile.mkdirs()) {
                                    throw BV8.A0j(fileA0O3, "Unable to create parent directories for: ");
                                }
                                ci0 = new CI0(c4cA02, c3377CHy, fileA0O3);
                                CI1 ci13 = ci0;
                                Iterator it = c3377CHy.A07.iterator();
                                if (it.hasNext()) {
                                    it.next();
                                    throw BV4.A0a("onBatchCreated");
                                }
                            } else {
                                c4cA02.A01();
                                i++;
                            }
                        } catch (Throwable th) {
                            c4cA02.A03(c3377CHy);
                            throw th;
                        }
                    } finally {
                    }
                } while (i < 3);
                throw new EventBatchFileStore$FailedFileBatchLockException(FGI.A0I("Failed to lock batch file after ", i, " attempts"));
            }
            C3378CHz c3378CHz = (C3378CHz) this;
            ByteArrayOutputStream byteArrayOutputStreamA0F = BV4.A0F();
            C4C c4cA022 = C4A.A00().A02(byteArrayOutputStreamA0F);
            if (!c4cA022.A06(c3378CHz)) {
                throw C3cG.A0Q("Couldn't lock newly created batch");
            }
            Iterator it2 = c3378CHz.A07.iterator();
            if (it2.hasNext()) {
                it2.next();
                throw BV4.A0a("onBatchCreated");
            }
            ci0 = new CI2(c4cA022, c3378CHz, byteArrayOutputStreamA0F);
            this.A02 = ci0;
            try {
                CI3 ci3 = ci0.A02;
                C4940DFw c4940DFw = this.A04;
                CI3.A00(ci3);
                Writer writer2 = ci3.A02;
                C3341CFl c3341CFlA032 = c4940DFw.A02.A03();
                AbstractC3136BzG.A00("writeFixedData");
                try {
                    C3341CFl.A00(c3341CFlA032, C60O.A0k(), "time");
                    C3341CFl.A00(c3341CFlA032, "4331325740476680", JarvisProtocolKt.APP_ID_QUERY_PARAM);
                    C3341CFl.A00(c3341CFlA032, "16.0.0.11.159", "app_ver");
                    C3341CFl.A00(c3341CFlA032, Integer.valueOf(BuildConstants.A01()), "build_num");
                    C3341CFl.A00(c3341CFlA032, Long.valueOf(c4940DFw.A00.getUserConsentState().A00), "consent_state");
                    C3341CFl.A00(c3341CFlA032, Build.MODEL, "device");
                    C3341CFl.A00(c3341CFlA032, Build.VERSION.RELEASE, "os_ver");
                    C3341CFl.A00(c3341CFlA032, BV4.A0f(), "device_id");
                    C3343CFo.A00().A05(c3341CFlA032, writer2);
                    c3341CFlA032.A03();
                    Trace.endSection();
                    CI3 ci32 = this.A02.A02;
                    ci6 = this.A01;
                    CI3.A00(ci32);
                    writer = ci32.A02;
                    c3339CFj = ci6.A01;
                    c3341CFlA03 = c3339CFj.A03();
                    AbstractC3136BzG.A00("writeNewSessionData");
                } catch (Throwable th2) {
                    th = th2;
                    c3341CFlA032.A03();
                }
                try {
                    CIA cia2 = ci6.A00;
                    C3341CFl.A00(c3341CFlA03, cia2.A02, "session_id");
                    synchronized (cia2) {
                        iIncrementAndGet = CIA.A03.incrementAndGet();
                    }
                    C3341CFl.A00(c3341CFlA03, Integer.valueOf(iIncrementAndGet), AgeCheckFunnelLogging.KEY_SEQ);
                    C4931DFd c4931DFd2 = cia2.A01;
                    if (c4931DFd2 == null) {
                        C3341CFl.A00(c3341CFlA03, null, ErrorReportingConstants.USER_ID_KEY);
                    } else {
                        c4931DFd2.attachBatchLevelFields(c3341CFlA03, c3339CFj);
                    }
                    C3343CFo.A00().A05(c3341CFlA03, writer);
                    c3341CFlA03.A03();
                    Trace.endSection();
                } catch (Throwable th3) {
                    th = th3;
                    c3341CFlA03.A03();
                    Trace.endSection();
                    throw th;
                }
            } catch (IOException e) {
                this.A02.A01.A03(this);
                A01();
                throw e;
            }
        }
        CI1 ci14 = this.A02;
        if (ci14 == null) {
            this.A06.add(c4932DFh);
            return;
        }
        while (true) {
            try {
                Queue<C4932DFh> queue = this.A06;
                if (queue.isEmpty()) {
                    ci14.A02.A01(c4932DFh.A07);
                    ci14.A03.flush();
                    ci14.A00++;
                    return;
                }
                ci14.A02.A01(queue.poll().A07);
                ci14.A00++;
            } finally {
                ci14.A01.A03(this);
            }
        }
    }

    public final void A03(CIA cia) throws IOException {
        this.A00 = cia;
        this.A01 = new CI6(cia, this.A09);
        CI1 ci1 = this.A02;
        if (ci1 != null) {
            try {
                ci1.A03.close();
                ci1.A01.A01();
            } catch (IOException unused) {
            }
            this.A02 = null;
        }
    }
}
