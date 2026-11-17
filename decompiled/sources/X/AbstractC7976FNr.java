package X;

/* renamed from: X.FNr, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC7976FNr<Response, Config> {
    public static final int DATA_INVALID = 3;
    public static final int DATA_VALID = 1;
    public static final int DATA_VALID_NO_LONGER_FRESH = 2;
    public volatile C7974FNp<Response, Config> mEmitter;

    public abstract void onFetch(int i);

    public abstract void onStop();

    public final void emitResult(Response response) {
        C7974FNp<Response, Config> c7974FNp = this.mEmitter;
        FOM.A00();
        try {
            FO9 fo9 = c7974FNp.A02;
            if (fo9.AOp()) {
                C7974FNp.A03(c7974FNp, response);
            } else {
                fo9.AYE(new FO1(c7974FNp, response));
            }
        } finally {
            FOM.A00();
        }
    }

    public int getDataValidity() {
        return 1;
    }

    public void onAttach(boolean z) {
    }

    public void onDetach() {
    }

    public void onStart() {
    }

    public void onUpdateConfiguration(Config config) {
    }

    public void setEmitter(C7974FNp<Response, Config> c7974FNp) {
        this.mEmitter = c7974FNp;
    }
}
