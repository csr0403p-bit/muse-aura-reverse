package X;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageItemInfo;
import android.content.pm.ResolveInfo;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.os.Bundle;
import android.text.Selection;
import android.text.Spannable;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.util.SparseArray;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import com.facebook.rendercore.text.RCTextView;
import java.util.List;

/* loaded from: classes6.dex */
public final class FRT extends BAV {
    public C8053FRg A00;
    public FRa A01;
    public final /* synthetic */ RCTextView A02;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FRT(RCTextView rCTextView) {
        super(rCTextView);
        this.A02 = rCTextView;
        rCTextView.setFocusable(false);
        rCTextView.setImportantForAccessibility(1);
    }

    private void A05(Rect rect, int i) {
        RCTextView rCTextView = this.A02;
        Spanned spanned = (Spanned) rCTextView.A0B;
        ClickableSpan clickableSpan = rCTextView.A0H[i];
        int spanStart = spanned.getSpanStart(clickableSpan);
        int spanEnd = spanned.getSpanEnd(clickableSpan);
        int lineForOffset = rCTextView.A06.getLineForOffset(spanStart);
        if (lineForOffset != rCTextView.A06.getLineForOffset(spanEnd)) {
            spanEnd = rCTextView.A06.getLineVisibleEnd(lineForOffset);
        }
        Path pathA0V = AbstractC7607F5u.A0V();
        RectF rectFA0Y = AbstractC7607F5u.A0Y();
        rCTextView.A06.getSelectionPath(spanStart, spanEnd, pathA0V);
        pathA0V.computeBounds(rectFA0Y, true);
        rectFA0Y.offset(rCTextView.A00, rCTextView.A01);
        rectFA0Y.round(rect);
    }

    public static boolean A06(FRT frt, int i) {
        ClickableSpan[] clickableSpanArr;
        RCTextView rCTextView = frt.A02;
        if (!rCTextView.A0D || !(rCTextView.A0B instanceof Spanned) || (clickableSpanArr = rCTextView.A0H) == null || i < 0 || i >= clickableSpanArr.length || rCTextView.A06 == null) {
            return false;
        }
        frt.A05(AbstractC7607F5u.A0X(), i);
        return !r0.isEmpty();
    }

    @Override // X.BAV, X.C8053FRg
    public final FRa getAccessibilityNodeProvider(View view) {
        FRa fRa = this.A01;
        if (fRa != null) {
            return fRa;
        }
        FRa accessibilityNodeProvider = super.getAccessibilityNodeProvider(view);
        if (accessibilityNodeProvider == null) {
            return null;
        }
        FRY fry = new FRY(accessibilityNodeProvider, this);
        this.A01 = fry;
        return fry;
    }

    @Override // X.BAV
    public final int getVirtualViewAt(float f, float f2) {
        RCTextView rCTextView = this.A02;
        if (rCTextView.A0D) {
            CharSequence charSequence = rCTextView.A0B;
            if ((charSequence instanceof Spanned) && rCTextView.A0H != null) {
                Spanned spanned = (Spanned) charSequence;
                int i = 0;
                while (true) {
                    ClickableSpan[] clickableSpanArr = rCTextView.A0H;
                    if (i >= clickableSpanArr.length) {
                        break;
                    }
                    ClickableSpan clickableSpan = clickableSpanArr[i];
                    int spanStart = spanned.getSpanStart(clickableSpan);
                    int spanEnd = spanned.getSpanEnd(clickableSpan);
                    int iA00 = RCTextView.A00(rCTextView, (int) f, (int) f2);
                    if (iA00 >= spanStart && iA00 <= spanEnd && A06(this, i)) {
                        return i;
                    }
                    i++;
                }
            }
        }
        return Integer.MIN_VALUE;
    }

    @Override // X.BAV
    public final void getVisibleVirtualViews(List<Integer> list) {
        RCTextView rCTextView = this.A02;
        if (rCTextView.A0D) {
            ClickableSpan[] clickableSpanArr = rCTextView.A0H;
            if (clickableSpanArr != null) {
                int length = clickableSpanArr.length;
                for (int i = 0; i < length; i++) {
                    if (A06(this, i)) {
                        AbstractC7608F5v.A1A(i, list);
                    }
                }
            }
        }
    }

    @Override // X.BAV
    public final boolean onPerformActionForVirtualView(int i, int i2, Bundle bundle) {
        if (i2 != 16 || !A06(this, i)) {
            return false;
        }
        RCTextView rCTextView = this.A02;
        rCTextView.A0H[i].onClick(rCTextView);
        return true;
    }

    @Override // X.BAV
    public final void onVirtualViewKeyboardFocusChanged(int i, boolean z) {
        RCTextView rCTextView = this.A02;
        ClickableSpan[] clickableSpanArr = rCTextView.A0H;
        if (clickableSpanArr == null || i >= clickableSpanArr.length || !(clickableSpanArr[i] instanceof AbstractC7887FJf)) {
            return;
        }
        rCTextView.invalidate();
    }

    @Override // X.C8053FRg
    public final boolean performAccessibilityAction(View view, int i, Bundle bundle) {
        if (i == 131072) {
            RCTextView rCTextView = this.A02;
            if (rCTextView.A0A != null && rCTextView.A0G) {
                if (bundle != null) {
                    int i2 = bundle.getInt(C8j2.A00(49), -1);
                    int i3 = bundle.getInt(C8j2.A00(48), -1);
                    Spannable spannable = rCTextView.A0A.A02;
                    if (spannable != null) {
                        if (i2 == i3 && i2 == -1) {
                            Selection.removeSelection(spannable);
                        } else if (i2 >= 0 && i2 <= i3 && i3 <= spannable.length()) {
                            Selection.setSelection(spannable, i2, i3);
                            if (i2 != i3) {
                                rCTextView.A0A.A0D();
                                return true;
                            }
                        }
                        return true;
                    }
                }
            }
            return super.performAccessibilityAction(view, i, bundle);
        }
        if (i == 16384) {
            RCTextView rCTextView2 = this.A02;
            if (rCTextView2.A0A != null && rCTextView2.A0G) {
                if (!rCTextView2.isFocused() || !rCTextView2.A0A.A0G()) {
                    return false;
                }
                rCTextView2.A0A.A0B();
                return true;
            }
        }
        RCTextView rCTextView3 = this.A02;
        FRD frd = rCTextView3.A0A;
        if (frd != null && rCTextView3.A0G) {
            FRV frv = frd.A0H;
            if (FRV.A01(frv.A03.get(i), frv)) {
                return true;
            }
        }
        return super.performAccessibilityAction(view, i, bundle);
    }

    @Override // X.BAV, X.C8053FRg
    public final void onInitializeAccessibilityNodeInfo(View view, C2197BAc c2197BAc) {
        super.onInitializeAccessibilityNodeInfo(view, c2197BAc);
        CharSequence textForAccessibility = ((RCTextView) view).getTextForAccessibility();
        if (!TextUtils.isEmpty(textForAccessibility)) {
            AccessibilityNodeInfo accessibilityNodeInfo = c2197BAc.A02;
            accessibilityNodeInfo.setText(textForAccessibility);
            accessibilityNodeInfo.addAction(256);
            accessibilityNodeInfo.addAction(512);
            accessibilityNodeInfo.setMovementGranularities(31);
            accessibilityNodeInfo.addAction(131072);
            RCTextView rCTextView = this.A02;
            if (rCTextView.A0G) {
                accessibilityNodeInfo.addAction(16384);
                if (Build.VERSION.SDK_INT >= 33) {
                    c2197BAc.A04();
                }
                FRD frd = rCTextView.A0A;
                if (frd != null) {
                    FRV frv = frd.A0H;
                    SparseArray<Intent> sparseArray = frv.A03;
                    sparseArray.clear();
                    SparseArray<AccessibilityNodeInfo.AccessibilityAction> sparseArray2 = frv.A02;
                    sparseArray2.clear();
                    FRV.A00(frv);
                    int i = 0;
                    for (ResolveInfo resolveInfo : frv.A04) {
                        int i2 = i + 1;
                        int i3 = i + 268435712;
                        sparseArray2.put(i3, new AccessibilityNodeInfo.AccessibilityAction(i3, resolveInfo.loadLabel(frv.A01)));
                        Intent intentPutExtra = new Intent().setAction("android.intent.action.PROCESS_TEXT").setType("text/plain").putExtra("android.intent.extra.PROCESS_TEXT_READONLY", true);
                        ActivityInfo activityInfo = resolveInfo.activityInfo;
                        sparseArray.put(i3, intentPutExtra.setClassName(((PackageItemInfo) activityInfo).packageName, ((PackageItemInfo) activityInfo).name));
                        i = i2;
                    }
                    for (int i4 = 0; i4 < sparseArray2.size(); i4++) {
                        accessibilityNodeInfo.addAction(sparseArray2.valueAt(i4));
                    }
                }
            }
        }
        C8053FRg c8053FRg = this.A00;
        if (c8053FRg != null) {
            c8053FRg.onInitializeAccessibilityNodeInfo(view, c2197BAc);
        }
    }

    @Override // X.C8053FRg
    public final void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        super.onPopulateAccessibilityEvent(view, accessibilityEvent);
        RCTextView rCTextView = this.A02;
        if (TextUtils.isEmpty(rCTextView.A0B)) {
            return;
        }
        accessibilityEvent.getText().add(rCTextView.getTextForAccessibility());
    }

    @Override // X.BAV
    public final void onPopulateNodeForVirtualView(int i, C2197BAc c2197BAc) {
        if (!A06(this, i)) {
            AccessibilityNodeInfo accessibilityNodeInfo = c2197BAc.A02;
            accessibilityNodeInfo.setText("");
            accessibilityNodeInfo.setBoundsInParent(AbstractC7607F5u.A0X());
            accessibilityNodeInfo.setClickable(false);
            accessibilityNodeInfo.setFocusable(false);
            return;
        }
        RCTextView rCTextView = this.A02;
        Spanned spanned = (Spanned) rCTextView.A0B;
        ClickableSpan clickableSpan = rCTextView.A0H[i];
        int spanStart = spanned.getSpanStart(clickableSpan);
        int spanEnd = spanned.getSpanEnd(clickableSpan);
        Rect rectA0X = AbstractC7607F5u.A0X();
        A05(rectA0X, i);
        AccessibilityNodeInfo accessibilityNodeInfo2 = c2197BAc.A02;
        accessibilityNodeInfo2.setBoundsInParent(rectA0X);
        accessibilityNodeInfo2.setClickable(true);
        accessibilityNodeInfo2.setFocusable(true);
        accessibilityNodeInfo2.setEnabled(true);
        accessibilityNodeInfo2.setVisibleToUser(true);
        accessibilityNodeInfo2.setText(spanned.subSequence(spanStart, spanEnd));
        accessibilityNodeInfo2.setClassName("android.widget.Button");
        if (clickableSpan instanceof AbstractC7887FJf) {
            AbstractC7887FJf abstractC7887FJf = (AbstractC7887FJf) clickableSpan;
            String str = abstractC7887FJf.A00;
            String str2 = abstractC7887FJf.A01;
            if (str2 == null) {
                str2 = "Link";
            }
            if (str != null) {
                accessibilityNodeInfo2.setContentDescription(str);
            }
            AbstractC10585Hwr.A00(rCTextView.getContext(), null, c2197BAc, str2);
        }
    }
}
