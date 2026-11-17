package X;

import android.content.ClipData;
import android.content.Context;
import android.text.Editable;
import android.text.Selection;
import android.text.Spanned;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import com.facebook.aura.pairs.PairsDiscretionDocument;

/* loaded from: classes6.dex */
public final class FRG implements FS1 {
    @Override // X.FS1
    public final C8071FRz AVC(View view, C8071FRz c8071FRz) {
        CharSequence charSequenceCoerceToStyledText;
        if (Log.isLoggable("ReceiveContent", 3)) {
            AbstractC7610F5x.A1L(c8071FRz, "onReceive: ", "ReceiveContent");
        }
        InterfaceC8065FRt interfaceC8065FRt = c8071FRz.A00;
        if (interfaceC8065FRt.AKn() == 2) {
            return c8071FRz;
        }
        ClipData clipDataADj = interfaceC8065FRt.ADj();
        int iAFl = interfaceC8065FRt.AFl();
        TextView textView = (TextView) view;
        Editable editable = (Editable) textView.getText();
        Context context = textView.getContext();
        boolean z = false;
        for (int i = 0; i < clipDataADj.getItemCount(); i++) {
            ClipData.Item itemAt = clipDataADj.getItemAt(i);
            if ((iAFl & 1) != 0) {
                charSequenceCoerceToStyledText = itemAt.coerceToText(context);
                if (charSequenceCoerceToStyledText instanceof Spanned) {
                    charSequenceCoerceToStyledText = charSequenceCoerceToStyledText.toString();
                }
            } else {
                charSequenceCoerceToStyledText = itemAt.coerceToStyledText(context);
            }
            if (charSequenceCoerceToStyledText != null) {
                if (z) {
                    editable.insert(Selection.getSelectionEnd(editable), PairsDiscretionDocument.TERMINATOR);
                    editable.insert(Selection.getSelectionEnd(editable), charSequenceCoerceToStyledText);
                } else {
                    int selectionStart = Selection.getSelectionStart(editable);
                    int selectionEnd = Selection.getSelectionEnd(editable);
                    int iMax = Math.max(0, Math.min(selectionStart, selectionEnd));
                    int iA06 = AbstractC7608F5v.A06(selectionStart, selectionEnd, 0);
                    Selection.setSelection(editable, iA06);
                    editable.replace(iMax, iA06, charSequenceCoerceToStyledText);
                    z = true;
                }
            }
        }
        return null;
    }
}
