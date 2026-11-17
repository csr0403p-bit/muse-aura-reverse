package X;

import android.text.InputFilter;
import android.text.Selection;
import android.text.Spannable;
import android.widget.TextView;
import java.lang.ref.Reference;

/* loaded from: classes5.dex */
public final class EBh extends AbstractC6499E9g implements Runnable {
    public static final String __redex_internal_original_name = "EmojiInputFilter$InitCallbackImpl";
    public final Reference<TextView> A00;
    public final Reference<EBg> A01;

    @Override // java.lang.Runnable
    public final void run() {
        InputFilter[] filters;
        TextView textView = this.A00.get();
        EBg eBg = this.A01.get();
        if (eBg == null || textView == null || (filters = textView.getFilters()) == null) {
            return;
        }
        for (InputFilter inputFilter : filters) {
            if (inputFilter == eBg) {
                if (textView.isAttachedToWindow()) {
                    CharSequence text = textView.getText();
                    CharSequence charSequenceA03 = E9X.A00().A03(text, 0, text == null ? 0 : text.length(), 0);
                    if (text != charSequenceA03) {
                        int selectionStart = Selection.getSelectionStart(charSequenceA03);
                        int selectionEnd = Selection.getSelectionEnd(charSequenceA03);
                        textView.setText(charSequenceA03);
                        if (charSequenceA03 instanceof Spannable) {
                            Spannable spannable = (Spannable) charSequenceA03;
                            if (selectionStart < 0) {
                                if (selectionEnd >= 0) {
                                    Selection.setSelection(spannable, selectionEnd);
                                    return;
                                }
                                return;
                            } else if (selectionEnd >= 0) {
                                Selection.setSelection(spannable, selectionStart, selectionEnd);
                                return;
                            } else {
                                Selection.setSelection(spannable, selectionStart);
                                return;
                            }
                        }
                        return;
                    }
                    return;
                }
                return;
            }
        }
    }

    public EBh(TextView textView, EBg eBg) {
        this.A00 = BV4.A0q(textView);
        this.A01 = BV4.A0q(eBg);
    }
}
