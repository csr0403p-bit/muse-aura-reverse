package X;

import android.os.Build;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.inputmethod.EditorInfo;

/* loaded from: classes4.dex */
public abstract class AqT {
    public static void A00(EditorInfo editorInfo, CharSequence charSequence) {
        int i;
        if (Build.VERSION.SDK_INT >= 30) {
            AbstractC1774AqU.A00(editorInfo, charSequence);
            return;
        }
        charSequence.getClass();
        int i2 = editorInfo.initialSelStart;
        int i3 = editorInfo.initialSelEnd;
        if (i2 > i3) {
            i2 = i3;
        }
        if (i2 > i3) {
            i3 = i2;
        }
        int length = charSequence.length();
        if (i2 < 0 || i3 > length || (i = editorInfo.inputType & 4095) == 129 || i == 225 || i == 18) {
            A01(editorInfo, null, 0, 0);
            return;
        }
        if (length <= 2048) {
            A01(editorInfo, charSequence, i2, i3);
            return;
        }
        int i4 = i3 - i2;
        int i5 = i4;
        if (i4 > 1024) {
            i5 = 0;
        }
        int i6 = 2048 - i5;
        int iA0F = C8j3.A0F(i6, Math.min(i2, (int) (i6 * 0.8d)), charSequence.length() - i3);
        int iA0F2 = C8j3.A0F(i6, iA0F, i2);
        int i7 = i2 - iA0F2;
        if (Character.isLowSurrogate(charSequence.charAt(i7))) {
            i7++;
            iA0F2--;
        }
        if (Character.isHighSurrogate(charSequence.charAt((i3 + iA0F) - 1))) {
            iA0F--;
        }
        int i8 = iA0F2 + i5;
        A01(editorInfo, i5 != i4 ? TextUtils.concat(charSequence.subSequence(i7, i7 + iA0F2), charSequence.subSequence(i3, iA0F + i3)) : charSequence.subSequence(i7, i8 + iA0F + i7), iA0F2, i8);
    }

    public static void A01(EditorInfo editorInfo, CharSequence charSequence, int i, int i2) {
        if (editorInfo.extras == null) {
            editorInfo.extras = new Bundle();
        }
        editorInfo.extras.putCharSequence("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SURROUNDING_TEXT", charSequence != null ? new SpannableStringBuilder(charSequence) : null);
        editorInfo.extras.putInt("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SELECTION_HEAD", i);
        editorInfo.extras.putInt("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SELECTION_END", i2);
    }

    public static void A02(EditorInfo editorInfo, boolean z) {
        if (Build.VERSION.SDK_INT >= 35) {
            AbstractC1775AqV.A00(editorInfo, z);
        }
        Bundle bundle = editorInfo.extras;
        if (bundle == null) {
            bundle = new Bundle();
            editorInfo.extras = bundle;
        }
        bundle.putBoolean("androidx.core.view.inputmethod.EditorInfoCompat.STYLUS_HANDWRITING_ENABLED", z);
    }
}
