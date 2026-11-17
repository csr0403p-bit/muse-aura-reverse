package X;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import java.text.NumberFormat;

/* renamed from: X.F8q, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7649F8q implements TextWatcher {
    public int A00;
    public String A01 = "";
    public boolean A02;
    public boolean A03;
    public boolean A04;
    public final C7650F8r A05;

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        int i;
        EditText editText;
        C7384Etj.A0Y(editable, 0);
        if (this.A04) {
            return;
        }
        this.A04 = true;
        if (this.A03 && (editText = this.A05.A03) != null) {
            int selectionStart = editText.getSelectionStart();
            while (true) {
                if (selectionStart <= 0) {
                    break;
                }
                int i2 = selectionStart - 1;
                if (Character.isDigit(editable.charAt(i2))) {
                    editable.delete(i2, selectionStart);
                    break;
                } else {
                    editable.delete(i2, selectionStart);
                    selectionStart = i2;
                }
            }
        }
        String str = "";
        String strA03 = C06827l3.A02("\\D").A03(editable.toString(), "");
        Number numberValueOf = strA03.length() > 0 ? Double.valueOf(Double.parseDouble(strA03)) : 0;
        Number number = numberValueOf;
        if (number.doubleValue() >= 1.0E17d) {
            C7650F8r c7650F8r = this.A05;
            EditText editText2 = c7650F8r.A03;
            if (editText2 != null) {
                editText2.setText(this.A01);
            }
            EditText editText3 = c7650F8r.A03;
            if (editText3 != null) {
                editText3.setSelection(this.A01.length() - this.A00);
            }
        } else if (number.doubleValue() > 0.0d) {
            C7650F8r c7650F8r2 = this.A05;
            NumberFormat numberFormat = c7650F8r2.A04;
            if (numberFormat != null) {
                str = numberFormat.format(numberValueOf);
                C7384Etj.A0U(str);
                EditText editText4 = c7650F8r2.A03;
                if (editText4 != null) {
                    editText4.setText(str);
                } else {
                    FFI.A01(null, "EditText is null", null);
                }
            }
            boolean z = this.A02;
            int length = str.length();
            if (z) {
                while (true) {
                    length--;
                    if (-1 >= length) {
                        i = 0;
                        break;
                    } else if (Character.isDigit(str.charAt(length))) {
                        i = length + 1;
                        break;
                    }
                }
            } else {
                i = length - this.A00;
            }
            EditText editText5 = c7650F8r2.A03;
            if (editText5 != null) {
                if (i < 0) {
                    i = 0;
                }
                editText5.setSelection(i);
                c7650F8r2.A01 = editText5.getSelectionStart();
                c7650F8r2.A00 = editText5.getSelectionEnd();
            }
        } else {
            editable.clear();
            C7650F8r c7650F8r3 = this.A05;
            c7650F8r3.A01 = 0;
            c7650F8r3.A00 = 0;
        }
        this.A04 = false;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0028  */
    @Override // android.text.TextWatcher
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void beforeTextChanged(java.lang.CharSequence r4, int r5, int r6, int r7) {
        /*
            r3 = this;
            r0 = 0
            X.C7384Etj.A0Y(r4, r0)
            boolean r0 = r3.A04
            if (r0 != 0) goto L34
            java.lang.String r0 = r4.toString()
            r3.A01 = r0
            int r1 = r4.length()
            int r1 = r1 - r5
            r2 = 0
            r0 = 0
            if (r7 != 0) goto L18
            r0 = r6
        L18:
            int r1 = r1 - r0
            r3.A00 = r1
            if (r7 >= r6) goto L28
            char r0 = r4.charAt(r5)
            boolean r1 = java.lang.Character.isDigit(r0)
            r0 = 1
            if (r1 == 0) goto L29
        L28:
            r0 = 0
        L29:
            r3.A03 = r0
            int r0 = r4.length()
            if (r0 != 0) goto L32
            r2 = 1
        L32:
            r3.A02 = r2
        L34:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C7649F8q.beforeTextChanged(java.lang.CharSequence, int, int, int):void");
    }

    public C7649F8q(FBB fbb, FDW fdw) {
        this.A05 = (C7650F8r) AbstractC7608F5v.A0i(fbb, fdw);
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
