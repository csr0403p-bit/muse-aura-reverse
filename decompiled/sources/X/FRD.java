package X;

import android.R;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.Selection;
import android.text.Spannable;
import android.util.TypedValue;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.View;
import com.facebook.aura.file.utils.HatchFileUIUtils;
import com.facebook.rendercore.text.RCTextView;
import java.util.Locale;

/* loaded from: classes6.dex */
public final class FRD {
    public static final int A0J = View.generateViewId();
    public Drawable A00;
    public Drawable A01;
    public Spannable A02;
    public ActionMode A03;
    public FRF A04;
    public FRK A05;
    public Hhy A06;
    public boolean A07;
    public boolean A09;
    public boolean A0A;
    public Hhy A0C;
    public final RCTextView A0F;
    public boolean A0B = true;
    public final Runnable A0I = new Runnable() { // from class: X.FRP
        public static final String __redex_internal_original_name = "RCTextEditor$$ExternalSyntheticLambda0";

        @Override // java.lang.Runnable
        public final void run() {
            ActionMode actionMode = this.A00.A03;
            if (actionMode != null) {
                actionMode.hide(0L);
            }
        }
    };
    public final Path A0E = AbstractC7607F5u.A0V();
    public final Paint A0D = AbstractC7607F5u.A0T();
    public boolean A08 = true;
    public final FRL A0G = new FRL();
    public final FRV A0H = new FRV(this);

    private Hhy A00() {
        Hhy hhy = this.A0C;
        if (hhy == null) {
            hhy = new Hhy(Locale.getDefault());
            this.A0C = hhy;
            this.A0B = true;
        }
        if (this.A0B) {
            Spannable spannable = this.A02;
            if (spannable != null) {
                hhy.A06(spannable, 0, spannable.length());
            }
            this.A0B = false;
        }
        return this.A0C;
    }

    public static final void A01(FRD frd) {
        if (frd.A00 == null) {
            TypedValue typedValueA0Z = AbstractC7607F5u.A0Z();
            Context context = frd.A0F.getContext();
            frd.A00 = context.getTheme().resolveAttribute(R.attr.textSelectHandleLeft, typedValueA0Z, true) ? context.getDrawable(typedValueA0Z.resourceId) : null;
        }
        if (frd.A01 == null) {
            TypedValue typedValueA0Z2 = AbstractC7607F5u.A0Z();
            Context context2 = frd.A0F.getContext();
            frd.A01 = context2.getTheme().resolveAttribute(R.attr.textSelectHandleRight, typedValueA0Z2, true) ? context2.getDrawable(typedValueA0Z2.resourceId) : null;
        }
        int i = frd.A0F.A05;
        if (i != 0) {
            Drawable drawable = frd.A00;
            if (drawable != null) {
                drawable.mutate().setTint(i);
            }
            Drawable drawable2 = frd.A01;
            if (drawable2 != null) {
                drawable2.mutate().setTint(i);
            }
        }
    }

    public final int A02() {
        Spannable spannable = this.A02;
        if (spannable == null) {
            return -1;
        }
        return Selection.getSelectionEnd(spannable);
    }

    public final int A03() {
        Spannable spannable = this.A02;
        if (spannable == null) {
            return -1;
        }
        return Selection.getSelectionStart(spannable);
    }

    public final int A04(float f) {
        return this.A0F.A06.getLineForVertical((int) (Math.min(AbstractC7609F5w.A0A(r3) - 1, Math.max(0.0f, f - r3.getTotalPaddingTop())) + r3.getScrollY()));
    }

    public final int A05(float f, float f2) {
        RCTextView rCTextView = this.A0F;
        if (rCTextView.A06 == null) {
            return -1;
        }
        return rCTextView.A06.getOffsetForHorizontal(A04(f2), AbstractC7611F5y.A02(rCTextView, f));
    }

    public final int A08(int i, boolean z) {
        Layout layout = this.A0F.A06;
        return layout != null ? z == layout.isRtlCharAt(i) ? layout.getOffsetToLeftOf(i) : layout.getOffsetToRightOf(i) : i;
    }

    public final long A0A(int i, int i2) {
        long lineStart;
        long jA03;
        Layout layout = this.A0F.A06;
        if (layout == null) {
            lineStart = (-1) << 32;
            jA03 = 4294967295L;
        } else {
            CharSequence text = layout.getText();
            int lineForOffset = layout.getLineForOffset(i);
            while (lineForOffset > 0 && text.charAt(layout.getLineEnd(lineForOffset - 1) - 1) != '\n') {
                lineForOffset--;
            }
            int lineForOffset2 = layout.getLineForOffset(i2);
            while (lineForOffset2 < layout.getLineCount() - 1 && text.charAt(layout.getLineEnd(lineForOffset2) - 1) != '\n') {
                lineForOffset2++;
            }
            lineStart = layout.getLineStart(lineForOffset) << 32;
            jA03 = BV4.A03(layout.getLineEnd(lineForOffset2));
        }
        return jA03 | lineStart;
    }

    public final void A0B() {
        if (this.A02 != null) {
            int iA03 = A03();
            int iA02 = A02();
            if (iA03 > iA02) {
                iA02 = iA03;
                iA03 = iA02;
            }
            if (iA03 < 0 || iA02 < 0 || iA03 == iA02) {
                return;
            }
            CharSequence charSequenceSubSequence = this.A02.subSequence(iA03, iA02);
            ClipboardManager clipboardManager = (ClipboardManager) this.A0F.getContext().getSystemService(HatchFileUIUtils.CLIPBOARD_STAGING_DIR);
            if (clipboardManager != null) {
                clipboardManager.setPrimaryClip(ClipData.newPlainText(null, charSequenceSubSequence));
            }
            Selection.setSelection(this.A02, iA02);
            ActionMode actionMode = this.A03;
            if (actionMode != null) {
                actionMode.finish();
            }
        }
    }

    public final void A0C() {
        ActionMode actionMode = this.A03;
        if (actionMode != null) {
            actionMode.finish();
        }
        RCTextView rCTextView = this.A0F;
        rCTextView.removeCallbacks(this.A0I);
        FRF frf = this.A04;
        if (frf != null) {
            frf.A04();
            FRF frf2 = this.A04;
            frf2.A0A.getViewTreeObserver().removeOnTouchModeChangeListener(frf2);
            FRJ frj = frf2.A06;
            if (frj != null) {
                frj.A01();
            }
            FRJ frj2 = frf2.A05;
            if (frj2 != null) {
                frj2.A01();
            }
        }
        Spannable spannable = this.A02;
        if (spannable != null) {
            Selection.removeSelection(spannable);
        }
        this.A02 = null;
        rCTextView.setHasTransientState(false);
    }

    public final void A0D() {
        ActionMode actionMode = this.A03;
        if (actionMode != null) {
            actionMode.invalidate();
            return;
        }
        if (A0G()) {
            FRU fru = new FRU(this);
            RCTextView rCTextView = this.A0F;
            this.A03 = rCTextView.startActionMode(fru, 1);
            FRF frf = this.A04;
            if (frf == null) {
                frf = new FRF(rCTextView, this);
                this.A04 = frf;
            }
            if (A0G()) {
                frf.A05();
            }
        }
    }

    public final void A0E() {
        ActionMode actionMode = this.A03;
        if (actionMode != null) {
            this.A0A = true;
        }
        this.A09 = true;
        if (actionMode != null) {
            actionMode.finish();
        }
        this.A09 = false;
    }

    public final void A0F(MotionEvent motionEvent) {
        if (this.A07) {
            this.A07 = false;
            return;
        }
        if (A0G()) {
            FRF frf = this.A04;
            if (frf != null) {
                if (frf.A00 != 0) {
                    return;
                }
                FRJ frj = frf.A06;
                if (frj != null && frj.A0C) {
                    return;
                }
                FRJ frj2 = frf.A05;
                if (frj2 != null && frj2.A0C) {
                    return;
                }
            }
            Selection.setSelection(this.A02, A05(motionEvent.getX(), motionEvent.getY()));
            ActionMode actionMode = this.A03;
            if (actionMode != null) {
                actionMode.finish();
            }
        }
    }

    public FRD(RCTextView rCTextView) {
        this.A0F = rCTextView;
    }

    public final int A06(int i) {
        int iA01;
        int iFollowing;
        int iFollowing2;
        Hhy hhyA00 = A00();
        int i2 = hhyA00.A01;
        int i3 = i - i2;
        int i4 = -1;
        if (i3 >= 0 && i3 < hhyA00.A00 - i2 && (iFollowing2 = hhyA00.A03.following(i3)) != -1) {
            i4 = iFollowing2 + hhyA00.A01;
        }
        boolean zA07 = A00().A07(i4);
        Hhy hhyA002 = A00();
        if (zA07) {
            iA01 = i;
            Hhy.A02(hhyA002, i - hhyA002.A01);
            while (iA01 != -1) {
                if (hhyA002.A08(iA01) || !hhyA002.A07(iA01)) {
                    int i5 = hhyA002.A01;
                    int i6 = iA01 - i5;
                    if (i6 < 0 || i6 >= hhyA002.A00 - i5 || (iFollowing = hhyA002.A03.following(i6)) == -1) {
                        break;
                    }
                    iA01 = iFollowing + hhyA002.A01;
                }
            }
        }
        iA01 = Hhy.A01(hhyA002, i, true);
        return iA01 != -1 ? iA01 : i;
    }

    public final int A07(int i) {
        int iA00;
        int iPreceding;
        int iPreceding2;
        Hhy hhyA00 = A00();
        int i2 = hhyA00.A01;
        int i3 = i - i2;
        int i4 = -1;
        if (i3 > 0 && i3 <= hhyA00.A00 - i2 && (iPreceding2 = hhyA00.A03.preceding(i3)) != -1) {
            i4 = iPreceding2 + hhyA00.A01;
        }
        boolean zA08 = A00().A08(i4);
        Hhy hhyA002 = A00();
        if (zA08) {
            iA00 = i;
            Hhy.A02(hhyA002, i - hhyA002.A01);
            while (iA00 != -1) {
                if (!hhyA002.A08(iA00) || hhyA002.A07(iA00)) {
                    int i5 = hhyA002.A01;
                    int i6 = iA00 - i5;
                    if (i6 <= 0 || i6 > hhyA002.A00 - i5 || (iPreceding = hhyA002.A03.preceding(i6)) == -1) {
                        break;
                    }
                    iA00 = iPreceding + hhyA002.A01;
                }
            }
        }
        iA00 = Hhy.A00(hhyA002, i, true);
        return iA00 != -1 ? iA00 : i;
    }

    public final int A09(Layout layout, float f, int i) {
        int iA04 = A04(f);
        if (layout != null && i < layout.getLineCount() && layout.getLineCount() > 0 && i >= 0 && AbstractC7607F5u.A0B(iA04, i) < 2) {
            RCTextView rCTextView = this.A0F;
            float lineHeight = rCTextView.getLineHeight();
            float f2 = AbstractC7609F5w.A0S(rCTextView).density;
            int i2 = (int) lineHeight;
            int iMax = Math.max(0, BV5.A02((int) (f2 * 45.0f), ((int) (0.5f * lineHeight)) + i2, (int) (8.0f * f2)) - i2);
            float totalPaddingTop = rCTextView.getTotalPaddingTop() - rCTextView.getScrollY();
            if (iA04 <= i || f < layout.getLineBottom(i) + iMax + totalPaddingTop) {
                return (iA04 >= i || f > ((float) (layout.getLineTop(i) - iMax)) + totalPaddingTop) ? i : iA04;
            }
        }
        return iA04;
    }

    public final boolean A0G() {
        int iA03 = A03();
        int iA02 = A02();
        return iA03 >= 0 && iA02 >= 0 && iA03 != iA02;
    }
}
