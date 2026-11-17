package X;

import android.text.Editable;
import android.text.TextWatcher;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes6.dex */
public final class FLI implements TextWatcher {
    public final /* synthetic */ Function0<Unit> A00;

    public FLI(Function0<Unit> function0) {
        this.A00 = function0;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        this.A00.invoke();
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
