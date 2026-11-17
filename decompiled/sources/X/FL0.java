package X;

import android.text.Editable;
import android.text.TextWatcher;
import kotlin.Unit;

/* loaded from: classes6.dex */
public final class FL0 implements TextWatcher {
    public float A00;
    public int A01;
    public final FL4 A02;
    public final G0V<Integer, Integer, Unit> A03;

    public static final void A00(FL0 fl0) {
        FL4 fl4 = fl0.A02;
        if (fl4.getLineCount() == fl0.A01 && fl4.getTextSize() == fl0.A00) {
            return;
        }
        fl0.A03.invoke(Integer.valueOf(fl0.A01), Integer.valueOf(fl4.getLineCount()));
        fl0.A01 = fl4.getLineCount();
        fl0.A00 = fl4.getTextSize();
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        FL4 fl4 = this.A02;
        if (fl4.getLayout() == null) {
            fl4.addOnLayoutChangeListener(new I0V(this, 2));
        } else {
            A00(this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public FL0(FL4 fl4, G0V<? super Integer, ? super Integer, Unit> g0v) {
        this.A02 = fl4;
        this.A03 = g0v;
        this.A01 = fl4.getLineCount();
        this.A00 = fl4.getTextSize();
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
