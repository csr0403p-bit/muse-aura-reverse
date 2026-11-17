package com.facebook.aura.localbrowser;

import X.AbstractC3358CGz;
import X.BXe;
import X.C06H;
import X.C3cI;
import X.C4JM;
import X.C60O;
import X.C6537EDs;
import X.C7384Etj;
import X.CFK;
import X.CH0;
import X.EDP;
import X.EDa;
import X.F0C;
import X.InterfaceC7549F2g;
import com.facebook.aura.auth.AuraSessionManager;
import com.facebook.aura.localbrowser.LocalBrowserTransferFiles;
import com.hatch.browser.core.NativeException;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.functions.Function0;

/* loaded from: classes5.dex */
public final class LocalBrowserTransferFiles implements InterfaceC7549F2g {
    public static final int $stable = 8;
    public static final Companion Companion = new Companion();
    public final AtomicBoolean closed;
    public final ConcurrentHashMap.KeySetView<Lease, Boolean> owned;
    public final AbstractC3358CGz session;

    public final class Companion {
        public final LocalBrowserTransferFiles getInstance(final AbstractC3358CGz abstractC3358CGz) {
            C7384Etj.A0Y(abstractC3358CGz, 0);
            return (LocalBrowserTransferFiles) abstractC3358CGz.A03(LocalBrowserTransferFiles.class, new Function0() { // from class: com.facebook.aura.localbrowser.LocalBrowserTransferFiles$Companion$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return new LocalBrowserTransferFiles(abstractC3358CGz);
                }
            });
        }

        public static final LocalBrowserTransferFiles getInstance$lambda$0(AbstractC3358CGz abstractC3358CGz) {
            return new LocalBrowserTransferFiles(abstractC3358CGz);
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public final class Lease implements AutoCloseable {
        public final File file;
        public final AtomicBoolean released;
        public final /* synthetic */ LocalBrowserTransferFiles this$0;

        public Lease(LocalBrowserTransferFiles localBrowserTransferFiles, File file) {
            C7384Etj.A0Y(file, 1);
            this.this$0 = localBrowserTransferFiles;
            this.file = file;
            this.released = C60O.A1E();
        }

        public static final void close$lambda$0(Lease lease, LocalBrowserTransferFiles localBrowserTransferFiles) {
            try {
                try {
                    if (lease.file.exists() && !lease.file.delete()) {
                        CFK.A06("LocalBrowserTransferFiles", "Could not delete transfer file");
                    }
                } catch (Exception unused) {
                    CFK.A06("LocalBrowserTransferFiles", "Transfer cleanup failed");
                }
            } finally {
                localBrowserTransferFiles.owned.remove(lease);
            }
        }

        public final void checkLive() throws NativeException.Unauthorized, NativeException.Unavailable {
            this.this$0.checkCurrent();
            if (this.released.get()) {
                throw new NativeException.Unavailable();
            }
        }

        @Override // java.lang.AutoCloseable
        public void close() {
            if (C3cI.A1W(this.released)) {
                Executor executorA05 = F0C.A05();
                final LocalBrowserTransferFiles localBrowserTransferFiles = this.this$0;
                executorA05.execute(new Runnable() { // from class: com.facebook.aura.localbrowser.LocalBrowserTransferFiles$Lease$$ExternalSyntheticLambda0
                    @Override // java.lang.Runnable
                    public final void run() {
                        LocalBrowserTransferFiles.Lease.close$lambda$0(this.f$0, localBrowserTransferFiles);
                    }
                });
            }
        }

        public final File getFile() {
            return this.file;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void checkCurrent() throws NativeException.Unauthorized {
        if (this.closed.get() || !AuraSessionManager.INSTANCE.isCurrentSession(this.session)) {
            throw new NativeException.Unauthorized();
        }
    }

    @Override // X.InterfaceC7549F2g
    public void clearUserData() {
        this.closed.set(true);
        ConcurrentHashMap.KeySetView<Lease, Boolean> keySetView = this.owned;
        C7384Etj.A0T(keySetView);
        Iterator<Lease> it = keySetView.iterator();
        while (it.hasNext()) {
            it.next().close();
        }
    }

    public LocalBrowserTransferFiles(AbstractC3358CGz abstractC3358CGz) {
        this.session = abstractC3358CGz;
        this.closed = C60O.A1E();
        this.owned = ConcurrentHashMap.newKeySet();
    }

    public final Lease create() throws NativeException.Unauthorized, IOException {
        checkCurrent();
        EDa eDa = new EDa(C4JM.A00());
        EDP edp = SC.temp_file_scoped;
        C7384Etj.A0V(edp);
        File file = eDa.get(edp, new BXe(((CH0) this.session).A01), (C6537EDs) null);
        long jCurrentTimeMillis = System.currentTimeMillis() - 86400000;
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles != null) {
            for (File file2 : fileArrListFiles) {
                String name = file2.getName();
                C7384Etj.A0U(name);
                if (name.startsWith("browser-transfer-") && file2.lastModified() < jCurrentTimeMillis) {
                    file2.delete();
                }
            }
        }
        File fileCreateTempFile = File.createTempFile("browser-transfer-", ".part", file);
        C7384Etj.A0U(fileCreateTempFile);
        Lease lease = new Lease(this, fileCreateTempFile);
        this.owned.add(lease);
        try {
            lease.checkLive();
            return lease;
        } catch (Throwable th) {
            lease.close();
            throw th;
        }
    }

    public /* synthetic */ LocalBrowserTransferFiles(AbstractC3358CGz abstractC3358CGz, C06H c06h) {
        this(abstractC3358CGz);
    }
}
