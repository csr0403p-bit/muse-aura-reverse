package X;

import com.facebook.aura.conversation.repo.HatchConversationRepositoryKt;
import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;

/* renamed from: X.Eb1, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C6848Eb1 {
    public static final C6848Eb1 A03 = new C6852EbA();
    public long A00;
    public long A01;
    public boolean A02;

    public final long A00() {
        if (this instanceof Eb2) {
            return ((Eb2) this).A00.A00();
        }
        if (this.A02) {
            return this.A01;
        }
        throw C3cG.A0Q("No deadline");
    }

    public final C6848Eb1 A01() {
        if (this instanceof Eb2) {
            return ((Eb2) this).A00.A01();
        }
        this.A02 = false;
        return this;
    }

    public final C6848Eb1 A02() {
        if (this instanceof Eb2) {
            return ((Eb2) this).A00.A02();
        }
        this.A00 = 0L;
        return this;
    }

    public final C6848Eb1 A03(long j) {
        if (!(this instanceof C6852EbA)) {
            if (this instanceof Eb2) {
                return ((Eb2) this).A00.A03(j);
            }
            this.A02 = true;
            this.A01 = j;
        }
        return this;
    }

    public final C6848Eb1 A04(TimeUnit timeUnit, long j) {
        if (this instanceof C6852EbA) {
            return this;
        }
        if (this instanceof Eb2) {
            return ((Eb2) this).A00.A04(timeUnit, j);
        }
        if (j < 0) {
            throw BV5.A0R("timeout < 0: ", j);
        }
        this.A00 = timeUnit.toNanos(j);
        return this;
    }

    public final boolean A06() {
        return this instanceof Eb2 ? ((Eb2) this).A00.A06() : this.A02;
    }

    public final void A05() throws InterruptedIOException {
        if (Thread.currentThread().isInterrupted()) {
            throw new InterruptedIOException(HatchConversationRepositoryKt.TERMINAL_STATUS_INTERRUPTED);
        }
        if (this.A02 && this.A01 - System.nanoTime() <= 0) {
            throw new InterruptedIOException("deadline reached");
        }
    }
}
