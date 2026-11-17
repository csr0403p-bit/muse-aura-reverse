package X;

import java.util.concurrent.RejectedExecutionException;

/* loaded from: classes5.dex */
public final class CPn<V> extends CPg<Object, V> {

    /* JADX WARN: Incorrect inner types in field signature: LX/CPn<TV;>.CombinedFutureInterruptibleTask<*>; */
    public AbstractC3480CPo A00;

    @Override // X.CPg
    public final void A03() {
        AbstractC3480CPo abstractC3480CPo = this.A00;
        if (abstractC3480CPo != null) {
            try {
                abstractC3480CPo.listenerExecutor.execute(abstractC3480CPo);
            } catch (RejectedExecutionException e) {
                abstractC3480CPo.this$0.setException(e);
            }
        }
    }

    @Override // X.CQU
    public final void interruptTask() {
        AbstractC3480CPo abstractC3480CPo = this.A00;
        if (abstractC3480CPo != null) {
            abstractC3480CPo.A02();
        }
    }

    @Override // X.CPg
    public final void A05(Integer reason) {
        super.A05(reason);
        if (reason == C79.A00) {
            this.A00 = null;
        }
    }
}
