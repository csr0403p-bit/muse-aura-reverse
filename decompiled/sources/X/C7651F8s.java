package X;

import android.text.Editable;
import android.text.InputFilter;
import android.text.TextWatcher;
import android.widget.EditText;

/* renamed from: X.F8s, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7651F8s implements TextWatcher {
    public EditText A00;
    public FBB A01;
    public FDW A02;
    public HsM A03;
    public boolean A04;

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        C7384Etj.A0Y(editable, 0);
        if (this.A04) {
            return;
        }
        this.A04 = true;
        if (this.A02 != null && this.A00 != null && this.A03 != null && this.A01 != null) {
            String string = editable.toString();
            FDW fdw = this.A02;
            HsM hsM = this.A03;
            String str = (String) F6D.A03(this.A01, fdw, C9115Fyg.A04(string), hsM);
            if (str == null) {
                FFI.A01(this.A01, "Format expression returned null. Ignoring.", null);
            } else if (!str.equals(string)) {
                InputFilter[] filters = editable.getFilters();
                editable.setFilters(new InputFilter[0]);
                editable.replace(0, editable.length(), str);
                editable.setFilters(filters);
                EditText editText = this.A00;
                C7384Etj.A0X(editText);
                editText.setSelection(editable.length());
            }
        }
        this.A04 = false;
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
