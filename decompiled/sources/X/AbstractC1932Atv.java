package X;

import android.os.CancellationSignal;
import android.view.inputmethod.HandwritingGesture;
import android.view.inputmethod.PreviewableHandwritingGesture;
import androidx.compose.foundation.text.selection.TextFieldSelectionManager;
import java.util.concurrent.Executor;
import java.util.function.IntConsumer;

/* renamed from: X.Atv, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC1932Atv {
    /* JADX WARN: Incorrect types in method signature: (LX/AtH;Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;Landroid/view/inputmethod/HandwritingGesture;LX/AXi;Ljava/util/concurrent/Executor;Ljava/util/function/IntConsumer;LX/G0U<-LX/AzK;Lkotlin/Unit;>;)V */
    public static final void A00(HandwritingGesture handwritingGesture, C1897AtH c1897AtH, TextFieldSelectionManager textFieldSelectionManager, InterfaceC1079AXi interfaceC1079AXi, Executor executor, final IntConsumer intConsumer, G0U g0u) {
        final int iA0H = c1897AtH != null ? AtM.A00.A0H(handwritingGesture, c1897AtH, textFieldSelectionManager, interfaceC1079AXi, g0u) : 3;
        if (intConsumer != null) {
            if (executor != null) {
                executor.execute(new Runnable() { // from class: X.Axy
                    public static final String __redex_internal_original_name = "Api34LegacyPerformHandwritingGestureImpl$$ExternalSyntheticLambda0";

                    @Override // java.lang.Runnable
                    public final void run() {
                        AbstractC1932Atv.A01(intConsumer, iA0H);
                    }
                });
            } else {
                intConsumer.accept(iA0H);
            }
        }
    }

    public static final boolean A02(CancellationSignal cancellationSignal, PreviewableHandwritingGesture previewableHandwritingGesture, C1897AtH c1897AtH, TextFieldSelectionManager textFieldSelectionManager) {
        if (c1897AtH != null) {
            return AtM.A00.A0J(cancellationSignal, previewableHandwritingGesture, c1897AtH, textFieldSelectionManager);
        }
        return false;
    }

    public static final void A01(IntConsumer intConsumer, int i) {
        intConsumer.accept(i);
    }
}
