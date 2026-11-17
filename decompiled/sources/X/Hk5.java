package X;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import java.util.ArrayList;

/* loaded from: classes6.dex */
public final class Hk5 implements TextWatcher {
    public boolean A00;
    public boolean A01;
    public final String A02;
    public final ArrayList<Integer> A03 = C3cG.A0h();
    public final EditText A04;

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        C7384Etj.A0Y(editable, 0);
        EditText editText = this.A04;
        int selectionStart = editText.getSelectionStart();
        if (this.A01) {
            return;
        }
        this.A01 = true;
        if (this.A00 && AbstractC7608F5v.A1Y(this.A03, selectionStart)) {
            while (true) {
                if (selectionStart <= 0) {
                    break;
                }
                int i = selectionStart - 1;
                if (this.A02.charAt(i) == '#') {
                    editable.delete(i, selectionStart);
                    selectionStart = i;
                    break;
                } else {
                    editable.delete(i, selectionStart);
                    selectionStart--;
                }
            }
        }
        StringBuilder sbA0w = C60O.A0w();
        int length = editable.length();
        int i2 = 0;
        for (int i3 = 0; i3 < length; i3++) {
            if (Character.isDigit(editable.charAt(i3))) {
                sbA0w.append(editable.charAt(i3));
                if (i3 < selectionStart) {
                    i2++;
                }
            }
        }
        StringBuilder sbA0w2 = C60O.A0w();
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        while (i4 < sbA0w.length()) {
            String str = this.A02;
            if (i5 >= str.length()) {
                break;
            }
            if (str.charAt(i5) == '#') {
                sbA0w2.append(sbA0w.charAt(i4));
                if (i4 < i2) {
                    i6++;
                }
                i4++;
            } else {
                BV6.A1M(str, sbA0w2, i5);
                if (i4 <= i2) {
                    i6++;
                }
            }
            i5++;
        }
        String strSubstring = this.A02.substring(i5);
        int length2 = strSubstring.length();
        if (length2 > 0 && !C7BY.A0q(strSubstring, String.valueOf('#'), false)) {
            sbA0w2.append(strSubstring);
            if (i4 <= i2) {
                i6 += length2;
            }
        }
        editable.replace(0, editable.length(), sbA0w2);
        editText.setSelection(i6);
        this.A01 = false;
    }

    public Hk5(EditText editText, String str) {
        this.A04 = editText;
        this.A02 = str;
        int length = str.length();
        for (int i = 0; i < length; i++) {
            if (str.charAt(i) != '#') {
                C60Q.A1P(this.A03, i);
            }
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        this.A00 = C8j3.A1T(i3, i2);
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
