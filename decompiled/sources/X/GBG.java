package X;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes6.dex */
public final class GBG<T> implements HtJ<T>, GAu {
    public static final AtomicReferenceFieldUpdater<GBG<?>, Object> A01 = AtomicReferenceFieldUpdater.newUpdater(GBG.class, Object.class, "result");
    public final HtJ<T> A00;
    public volatile Object result;

    @Override // X.GAu
    public final GAu getCallerFrame() {
        HtJ<T> htJ = this.A00;
        if (htJ instanceof GAu) {
            return (GAu) htJ;
        }
        return null;
    }

    @Override // X.HtJ
    public final C78T getContext() {
        return this.A00.getContext();
    }

    @Override // X.HtJ
    public final void resumeWith(Object obj) {
        while (true) {
            Object obj2 = this.result;
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A04;
            if (obj2 != enumC10460Hji) {
                EnumC10460Hji enumC10460Hji2 = EnumC10460Hji.A02;
                if (obj2 != enumC10460Hji2) {
                    throw C3cG.A0Q("Already resumed");
                }
                if (AbstractC5217DdT.A00(this, enumC10460Hji2, EnumC10460Hji.A03, A01)) {
                    this.A00.resumeWith(obj);
                    return;
                }
            } else if (AbstractC5217DdT.A00(this, enumC10460Hji, obj, A01)) {
                return;
            }
        }
    }

    public final String toString() {
        return C8j3.A14(this.A00, C60O.A0x("SafeContinuation for "));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public GBG(HtJ<? super T> htJ, Object obj) {
        this.A00 = obj;
        this.result = htJ;
    }
}
