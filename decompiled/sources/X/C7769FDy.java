package X;

import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.functions.Function0;

/* renamed from: X.FDy, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7769FDy<T> {
    public FE0<T> A00;
    public final F0C A01;
    public final Function0<T> A02;

    public C7769FDy() {
        this(AbstractC7770FDz.A01);
    }

    private final FE0<T> A00() {
        Object objPutIfAbsent;
        long id = Thread.currentThread().getId();
        if (id == AbstractC7770FDz.A00) {
            FE0<T> fe0 = this.A00;
            if (fe0 != null) {
                return fe0;
            }
            FE0<T> fe02 = new FE0<>();
            this.A00 = fe02;
            return fe02;
        }
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) this.A01.getValue();
        Long lValueOf = Long.valueOf(id);
        Object fe03 = concurrentHashMap.get(lValueOf);
        if (fe03 == null && (objPutIfAbsent = concurrentHashMap.putIfAbsent(lValueOf, (fe03 = new FE0()))) != null) {
            fe03 = objPutIfAbsent;
        }
        return (FE0) fe03;
    }

    public final T A01() {
        FE0<T> fe0A00 = A00();
        if (!fe0A00.A01) {
            fe0A00.A00 = this.A02.invoke();
            fe0A00.A01 = true;
        }
        return fe0A00.A00;
    }

    public final void A02(T t) {
        FE0<T> fe0A00 = A00();
        fe0A00.A00 = t;
        fe0A00.A01 = true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C7769FDy(Function0<? extends T> function0) {
        this.A02 = function0;
        this.A01 = C5322DgG.A01((Function0) C8472Feb.A00(49));
    }
}
