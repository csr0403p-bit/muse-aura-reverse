package X;

/* renamed from: X.7Bn, reason: invalid class name */
/* loaded from: classes3.dex */
public abstract class C7Bn extends AbstractC8884Fsp {
    @Override // X.HtJ
    public C78T getContext() {
        return C6ys.A00;
    }

    public C7Bn(HtJ<Object> htJ) {
        super(htJ);
        if (htJ != null && htJ.getContext() != C6ys.A00) {
            throw C60O.A0i("Coroutines with restricted suspension must have EmptyCoroutineContext");
        }
    }
}
