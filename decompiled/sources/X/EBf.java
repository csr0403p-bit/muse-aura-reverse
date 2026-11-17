package X;

import android.widget.EditText;
import java.lang.ref.Reference;

/* loaded from: classes5.dex */
public final class EBf extends AbstractC6499E9g implements Runnable {
    public static final String __redex_internal_original_name = "EmojiTextWatcher$InitCallbackImpl";
    public final Reference<EditText> A00;

    @Override // java.lang.Runnable
    public final void run() {
        EBe.A00(this.A00.get(), 1);
    }

    public EBf(EditText editText) {
        this.A00 = BV4.A0q(editText);
    }
}
