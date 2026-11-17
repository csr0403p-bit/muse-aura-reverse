package X;

import android.print.PrintDocumentAdapter;
import android.print.PrintDocumentInfo;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes6.dex */
public final class G3O extends PrintDocumentAdapter.LayoutResultCallback {
    public final Function0<Unit> A00;
    public final G0U<Boolean, Unit> A01;

    @Override // android.print.PrintDocumentAdapter.LayoutResultCallback
    public final void onLayoutCancelled() {
        AnonymousClass001.A1K(true, this.A01);
    }

    @Override // android.print.PrintDocumentAdapter.LayoutResultCallback
    public final void onLayoutFailed(CharSequence charSequence) {
        AnonymousClass001.A1K(false, this.A01);
    }

    @Override // android.print.PrintDocumentAdapter.LayoutResultCallback
    public final void onLayoutFinished(PrintDocumentInfo printDocumentInfo, boolean z) {
        this.A00.invoke();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public G3O(Function0<Unit> function0, G0U<? super Boolean, Unit> g0u) {
        this.A00 = function0;
        this.A01 = g0u;
    }
}
