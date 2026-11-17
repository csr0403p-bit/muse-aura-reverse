package X;

import android.os.CancellationSignal;
import android.view.inputmethod.HandwritingGesture;
import android.view.inputmethod.PreviewableHandwritingGesture;
import java.util.concurrent.Executor;
import java.util.function.IntConsumer;

/* renamed from: X.Aw6, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC1997Aw6 {
    public static final void A00(HandwritingGesture handwritingGesture, InterfaceC2061AxY interfaceC2061AxY, Executor executor, final IntConsumer intConsumer) {
        final int iAXq = interfaceC2061AxY.AXq(handwritingGesture);
        if (intConsumer != null) {
            if (executor != null) {
                executor.execute(new Runnable() { // from class: X.Axx
                    public static final String __redex_internal_original_name = "Api34PerformHandwritingGestureImpl$$ExternalSyntheticLambda0";

                    @Override // java.lang.Runnable
                    public final void run() {
                        AbstractC1997Aw6.A01(intConsumer, iAXq);
                    }
                });
            } else {
                intConsumer.accept(iAXq);
            }
        }
    }

    public static final boolean A02(CancellationSignal cancellationSignal, PreviewableHandwritingGesture previewableHandwritingGesture, InterfaceC2061AxY interfaceC2061AxY) {
        return interfaceC2061AxY.previewHandwritingGesture(previewableHandwritingGesture, cancellationSignal);
    }

    public static final void A01(IntConsumer intConsumer, int i) {
        intConsumer.accept(i);
    }
}
