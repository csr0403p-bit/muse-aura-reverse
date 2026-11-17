package X;

/* loaded from: classes5.dex */
public final class CE2 implements Runnable {
    public static final String __redex_internal_original_name = "OnCompletedListenerSender$onCompleted$2";
    public final /* synthetic */ AbstractC7391EuP<TResult> A00;
    public final /* synthetic */ C10543Hqv<CEB<TResult>> A01;

    /* JADX WARN: Incorrect types in method signature: (LX/Hqv<LX/CEB<TTResult;>;>;LX/EuP<TTResult;>;)V */
    public CE2(AbstractC7391EuP abstractC7391EuP, C10543Hqv c10543Hqv) {
        this.A01 = c10543Hqv;
        this.A00 = abstractC7391EuP;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        ((CEB) this.A01.element).onCompleted(this.A00);
    }
}
