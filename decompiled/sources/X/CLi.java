package X;

/* loaded from: classes5.dex */
public abstract class CLi {
    public final void A01(Throwable th) {
        if (this instanceof E9Y) {
            ((E9Y) this).A00.A00.A07(th);
            return;
        }
        CLh cLh = (CLh) this;
        try {
            cLh.A00.A01(th);
        } finally {
            cLh.A02.shutdown();
        }
    }

    public void A02(CPK cpk) {
        CLh cLh = (CLh) this;
        try {
            cLh.A00.A02(cpk);
        } finally {
            cLh.A02.shutdown();
        }
    }
}
