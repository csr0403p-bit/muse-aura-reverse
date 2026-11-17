package X;

import android.print.PageRange;
import android.print.PrintDocumentAdapter;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes6.dex */
public final class G3N extends PrintDocumentAdapter.WriteResultCallback {
    public final Function0<Unit> A00;
    public final G0U<Boolean, Unit> A01;

    @Override // android.print.PrintDocumentAdapter.WriteResultCallback
    public final void onWriteCancelled() {
        AnonymousClass001.A1K(true, this.A01);
    }

    @Override // android.print.PrintDocumentAdapter.WriteResultCallback
    public final void onWriteFailed(CharSequence charSequence) {
        AnonymousClass001.A1K(false, this.A01);
    }

    @Override // android.print.PrintDocumentAdapter.WriteResultCallback
    public final void onWriteFinished(PageRange[] pageRangeArr) {
        this.A00.invoke();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public G3N(Function0<Unit> function0, G0U<? super Boolean, Unit> g0u) {
        this.A00 = function0;
        this.A01 = g0u;
    }
}
