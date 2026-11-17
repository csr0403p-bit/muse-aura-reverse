package X;

import com.google.android.gms.tasks.DuplicateTaskCompletionException;

/* loaded from: classes5.dex */
public final class CSC<TResult> extends CSA<TResult> {
    public Exception A00;
    public Object A01;
    public boolean A02;
    public volatile boolean A05;
    public final Object A04 = C3cG.A0T();
    public final CSF A03 = new CSF();

    public static CSC A01(Exception exc) {
        CSC csc = new CSC();
        csc.A0F(exc);
        return csc;
    }

    public static CSC A02(Object obj) {
        CSC csc = new CSC();
        csc.A0G(obj);
        return csc;
    }

    private final void A03() {
        if (this.A02) {
            if (!A0B()) {
                throw C3cG.A0Q("DuplicateTaskCompletionException can only be created from completed Task.");
            }
            Exception excA07 = A07();
            throw new DuplicateTaskCompletionException("Complete with: ".concat(excA07 != null ? "failure" : A0C() ? "result ".concat(BV7.A0w(A08())) : this.A05 ? C3cF.A00(28) : "unknown issue"), excA07);
        }
    }

    public final void A0D() {
        synchronized (this.A04) {
            if (this.A02) {
                return;
            }
            this.A02 = true;
            this.A05 = true;
            this.A03.A00(this);
        }
    }

    /* JADX WARN: Incorrect return type in method signature: (LX/CSP;)LX/CSA<TTResult;>; */
    public final void A0E(CSP csp) {
        A0A(csp, AbstractC3097ByB.A00);
    }

    public final void A0F(Exception exc) {
        CRy.A04(exc, "Exception must not be null");
        synchronized (this.A04) {
            A03();
            this.A02 = true;
            this.A00 = exc;
        }
        this.A03.A00(this);
    }

    public final void A0G(Object obj) {
        synchronized (this.A04) {
            A03();
            this.A02 = true;
            this.A01 = obj;
        }
        this.A03.A00(this);
    }

    public final void A0H(Object obj) {
        synchronized (this.A04) {
            if (this.A02) {
                return;
            }
            this.A02 = true;
            this.A01 = obj;
            this.A03.A00(this);
        }
    }
}
