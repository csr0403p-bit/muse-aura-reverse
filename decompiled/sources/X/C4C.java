package X;

import com.facebook.aura.ccv.nativeflow.ui.HatchCcvLoggingKt;
import java.io.IOException;
import java.nio.channels.ClosedChannelException;
import java.nio.channels.FileLock;
import java.nio.channels.OverlappingFileLockException;

/* loaded from: classes5.dex */
public abstract class C4C {
    public int A00;
    public Object A01;
    public final Object A02;
    public final /* synthetic */ C4B A03;

    public final synchronized void A02(Object obj) {
        if (this.A01 != obj) {
            throw new IllegalMonitorStateException("Lock is not held by the provided owner");
        }
    }

    public final synchronized void A03(Object obj) {
        A02(obj);
        try {
            if (!(this instanceof C49)) {
                C46 c46 = (C46) this;
                try {
                    FileLock fileLock = c46.A00;
                    if (fileLock == null) {
                        throw C3cG.A0Q(C8j3.A14(c46.A02, C60O.A0x("File lock was never held for: ")));
                    }
                    try {
                        fileLock.release();
                        c46.A00 = null;
                    } catch (ClosedChannelException e) {
                        StringBuilder sbA0x = C60O.A0x("File Channel has been closed prematurely for: ");
                    } catch (IOException e2) {
                        throw BV4.A0d("Failed to unlock the file due to an IOException!", e2);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } finally {
            this.A01 = null;
            notifyAll();
        }
    }

    public final synchronized boolean A06(Object obj) {
        if (this.A01 == obj) {
            throw C3cG.A0Q("Trying to re-enter the lock");
        }
        if (A05() || this.A01 != null) {
            return false;
        }
        boolean zA04 = A04();
        if (zA04) {
            this.A01 = obj;
        }
        return zA04;
    }

    public C4C(C4B c4b, Object obj) {
        this.A03 = c4b;
        this.A02 = obj;
    }

    private final boolean A04() {
        boolean zA1X;
        if (this instanceof C49) {
            return true;
        }
        C46 c46 = (C46) this;
        synchronized (c46) {
            try {
                if (c46.A00 == null) {
                    try {
                        c46.A00 = c46.A02.tryLock();
                    } catch (ClosedChannelException e) {
                        throw BV4.A0d(C8j3.A14(c46.A02, C60O.A0x("File channel closed prematurely for: ")), e);
                    } catch (IOException | OverlappingFileLockException e2) {
                        CFK.A0K("CrossProcessBatchLock", e2, "IOException happens when trying to lock the file.");
                    }
                }
                zA1X = AnonymousClass002.A1X(c46.A00);
            } finally {
            }
        }
        return zA1X;
    }

    public final void A00() {
        if (this instanceof C49) {
            C49 c49 = (C49) this;
            synchronized (this) {
                c49.A00 = true;
            }
        } else {
            C46 c46 = (C46) this;
            synchronized (this) {
                c46.A01.delete();
            }
        }
    }

    public final void A01() {
        C4B c4b = this.A03;
        synchronized (c4b) {
            int i = this.A00 - 1;
            this.A00 = i;
            if (i < 0) {
                throw C3cG.A0Q("Unbalance calls to acquire/release");
            }
            if (i == 0) {
                if (this instanceof C46) {
                    C46 c46 = (C46) this;
                    synchronized (c46) {
                        try {
                            try {
                                c46.A02.close();
                            } catch (IOException e) {
                                CFK.A0E("CrossProcessBatchLock", "Failed to close the file channel associated with file: %s", e, c46.A02);
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
                c4b.A00.remove(this.A02);
            }
        }
    }

    public final boolean A05() {
        boolean z;
        if (this instanceof C49) {
            C49 c49 = (C49) this;
            synchronized (this) {
                z = c49.A00;
            }
            return z;
        }
        C46 c46 = (C46) this;
        synchronized (this) {
            z = !c46.A01.exists();
        }
        return z;
    }

    public final synchronized String toString() {
        StringBuilder sbA0x;
        Object obj = this.A01;
        String string = obj != null ? obj.toString() : HatchCcvLoggingKt.NO_POSTAL_FIELD;
        sbA0x = C60O.A0x("[key=");
        sbA0x.append(this.A02);
        sbA0x.append(",refCount=");
        sbA0x.append(this.A00);
        sbA0x.append(",lockOwner=");
        sbA0x.append(string);
        sbA0x.append(",isDeleted=");
        sbA0x.append(A05());
        return AnonymousClass001.A0v("]", sbA0x);
    }
}
