package X;

import android.widget.EditText;

/* loaded from: classes5.dex */
public final class EBc {
    public final EditText A00;
    public final EBe A01;

    public EBc(EditText editText) {
        this.A00 = editText;
        EBe eBe = new EBe(editText);
        this.A01 = eBe;
        editText.addTextChangedListener(eBe);
        if (C6502E9j.A02 == null) {
            synchronized (C6502E9j.A01) {
                if (C6502E9j.A02 == null) {
                    C6502E9j.A02 = new C6502E9j();
                }
            }
        }
        editText.setEditableFactory(C6502E9j.A02);
    }
}
