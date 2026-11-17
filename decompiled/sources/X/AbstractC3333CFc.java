package X;

import java.io.File;
import java.io.IOException;
import java.io.Writer;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.channels.ClosedChannelException;
import java.nio.channels.FileLockInterruptionException;
import java.nio.channels.NonWritableChannelException;
import java.util.regex.Matcher;

/* renamed from: X.CFc, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC3333CFc implements InterfaceC3367CHl {
    public static final ThreadLocal<byte[]> A03 = new C3102ByP();
    public static final ThreadLocal<char[]> A04 = new C3337CFg();
    public final C3336CFf A00;
    public final Object A01;
    public volatile C4C A02;

    public final void A00() {
        C4B<Object> c4bA00;
        Object obj;
        if (this instanceof C3332CFa) {
            c4bA00 = C4A.A00();
            obj = ((C3332CFa) this).A00;
        } else {
            CFZ cfz = (CFZ) this;
            c4bA00 = cfz.A00;
            obj = cfz.A01;
        }
        this.A02 = c4bA00.A02(obj);
        C4C c4c = this.A02;
        synchronized (c4c) {
            if (c4c.A05()) {
                CFK.A0H("BatchLockState", "Attempting to lock a deleted entry: %s (owned by %s)", c4c.A02, c4c.A01);
            }
            if (c4c.A01 == this) {
                throw C3cG.A0Q("Trying to re-enter the lock");
            }
            while (c4c.A01 != null) {
                try {
                    c4c.wait();
                } catch (InterruptedException unused) {
                }
            }
            if (!(c4c instanceof C49)) {
                C46 c46 = (C46) c4c;
                while (c46.A00 == null) {
                    try {
                        try {
                            c46.A00 = c46.A02.lock();
                        } catch (ClosedChannelException e) {
                            StringBuilder sbA0w = C60O.A0w();
                            sbA0w.append("File channel is closed prematurely or opened non-writable for: ");
                            throw BV4.A0d(C8j3.A14(c46.A02, sbA0w), e);
                        } catch (FileLockInterruptionException e2) {
                            CFK.A0D("CrossProcessBatchLock", "Interrupted while waiting to lock the file: %s", e2, c46.A02);
                        } catch (IOException | NonWritableChannelException e3) {
                            throw BV4.A0d("Failed to lock the file due to an IOException!", e3);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            c4c.A01 = this;
        }
    }

    public final void A01(Writer writer) throws IOException {
        if (this instanceof C3332CFa) {
            writer.write(((C3332CFa) this).A00.toString());
            return;
        }
        CFZ cfz = (CFZ) this;
        CFY cfy = new CFY(BV4.A0H(cfz.A01), ByteBuffer.wrap(A03.get()));
        try {
            char[] cArr = A04.get();
            boolean z = false;
            while (true) {
                int i = cfy.read(cArr);
                if (i == -1) {
                    return;
                }
                if (z) {
                    writer.write(cArr, 0, i);
                } else {
                    Matcher matcher = cfz.A03.matcher(CharBuffer.wrap(cArr));
                    int iEnd = 0;
                    while (matcher.find()) {
                        int iStart = matcher.start();
                        iEnd = matcher.end();
                        writer.write(cArr, 0, iStart);
                    }
                    writer.write(cArr, iEnd, i - iEnd);
                    z = true;
                }
            }
        } finally {
            cfy.close();
        }
    }

    @Override // X.InterfaceC3363CHh
    public final int AFK() {
        return (this instanceof C3332CFa ? ((C3332CFa) this).A00.size() : Math.round(((CFZ) this).A01.length())) + 256;
    }

    @Override // X.InterfaceC3367CHl
    public final boolean ANC() {
        boolean zA1Z;
        C4C c4c = this.A02;
        if (c4c != null) {
            synchronized (c4c) {
                zA1Z = AnonymousClass002.A1Z(c4c.A01, this);
            }
            if (zA1Z) {
                return true;
            }
        }
        return false;
    }

    @Override // X.InterfaceC3363CHh
    public final boolean AOm() {
        return false;
    }

    @Override // X.InterfaceC3363CHh
    public final void AQ9() {
        if (this.A02 == null) {
            throw C3cG.A0Q("mBatchLock is null, and it should be locked");
        }
        this.A02.A02(this);
        if (!(this instanceof C3332CFa)) {
            File file = ((CFZ) this).A01;
            if (!file.delete()) {
                CFK.A0H("FileBatchPayloadIterator", "Failed to remove %s", file);
            }
        }
        C4C c4c = this.A02;
        c4c.getClass();
        c4c.A02(this);
        c4c.A00();
    }

    @Override // X.InterfaceC3367CHl
    public final void unlock() {
        if (this.A02 == null) {
            throw C3cG.A0Q("mBatchLock is null, and it should be locked");
        }
        this.A02.A02(this);
        C4C c4c = this.A02;
        c4c.getClass();
        c4c.A03(this);
        if (this instanceof C3332CFa) {
            ((C3332CFa) this).A00.reset();
        }
        this.A02.A01();
        this.A02 = null;
    }

    public AbstractC3333CFc(C3336CFf c3336CFf, Object obj) {
        this.A00 = c3336CFf;
        this.A01 = obj;
    }

    @Override // X.InterfaceC3363CHh
    public final void Ais(Writer writer) throws IOException {
        if (!ANC()) {
            A00();
        }
        A01(writer);
        C3336CFf c3336CFf = this.A00;
        writer.write(93);
        writer.write(44);
        C3341CFl c3341CFlA03 = c3336CFf.A02.A03();
        try {
            c3336CFf.A01.A00(c3341CFlA03);
            C3338CFi c3338CFi = c3336CFf.A00;
            if (c3338CFi != null) {
                c3338CFi.A00.provideBaseSamplingConfigParams(c3341CFlA03);
            }
            C3343CFo.A00().A05(c3341CFlA03, writer);
            c3341CFlA03.A03();
            writer.write(125);
            writer.flush();
        } catch (Throwable th) {
            c3341CFlA03.A03();
            throw th;
        }
    }

    public final String toString() {
        StringBuilder sbA0w = C60O.A0w();
        sbA0w.append(C3cI.A0Y(this));
        sbA0w.append("{lockKey=");
        sbA0w.append(this.A01);
        sbA0w.append(";hasLock=");
        sbA0w.append(ANC());
        return BV7.A11(sbA0w);
    }
}
