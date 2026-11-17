package X;

import android.R;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.TextUtils;
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.BAc, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2197BAc {
    public int A00 = -1;
    public int A01 = -1;
    public final AccessibilityNodeInfo A02;

    public static String A00(int i) {
        if (i == 1) {
            return "ACTION_FOCUS";
        }
        if (i == 2) {
            return "ACTION_CLEAR_FOCUS";
        }
        switch (i) {
            case 4:
                return "ACTION_SELECT";
            case 8:
                return "ACTION_CLEAR_SELECTION";
            case 16:
                return "ACTION_CLICK";
            case 32:
                return "ACTION_LONG_CLICK";
            case 64:
                return "ACTION_ACCESSIBILITY_FOCUS";
            case 128:
                return "ACTION_CLEAR_ACCESSIBILITY_FOCUS";
            case 256:
                return "ACTION_NEXT_AT_MOVEMENT_GRANULARITY";
            case 512:
                return "ACTION_PREVIOUS_AT_MOVEMENT_GRANULARITY";
            case 1024:
                return "ACTION_NEXT_HTML_ELEMENT";
            case 2048:
                return "ACTION_PREVIOUS_HTML_ELEMENT";
            case 4096:
                return "ACTION_SCROLL_FORWARD";
            case 8192:
                return "ACTION_SCROLL_BACKWARD";
            case 16384:
                return "ACTION_COPY";
            case 32768:
                return "ACTION_PASTE";
            case 65536:
                return "ACTION_CUT";
            case 131072:
                return "ACTION_SET_SELECTION";
            case 262144:
                return "ACTION_EXPAND";
            case 524288:
                return "ACTION_COLLAPSE";
            case 2097152:
                return "ACTION_SET_TEXT";
            case R.id.accessibilityActionMoveWindow:
                return "ACTION_MOVE_WINDOW";
            default:
                switch (i) {
                    case R.id.accessibilityActionShowOnScreen:
                        return "ACTION_SHOW_ON_SCREEN";
                    case R.id.accessibilityActionScrollToPosition:
                        return "ACTION_SCROLL_TO_POSITION";
                    case R.id.accessibilityActionScrollUp:
                        return "ACTION_SCROLL_UP";
                    case R.id.accessibilityActionScrollLeft:
                        return "ACTION_SCROLL_LEFT";
                    case R.id.accessibilityActionScrollDown:
                        return "ACTION_SCROLL_DOWN";
                    case R.id.accessibilityActionScrollRight:
                        return "ACTION_SCROLL_RIGHT";
                    case R.id.accessibilityActionContextClick:
                        return "ACTION_CONTEXT_CLICK";
                    case R.id.accessibilityActionSetProgress:
                        return "ACTION_SET_PROGRESS";
                    default:
                        switch (i) {
                            case R.id.accessibilityActionShowTooltip:
                                return "ACTION_SHOW_TOOLTIP";
                            case R.id.accessibilityActionHideTooltip:
                                return "ACTION_HIDE_TOOLTIP";
                            case R.id.accessibilityActionPageUp:
                                return "ACTION_PAGE_UP";
                            case R.id.accessibilityActionPageDown:
                                return "ACTION_PAGE_DOWN";
                            case R.id.accessibilityActionPageLeft:
                                return "ACTION_PAGE_LEFT";
                            case R.id.accessibilityActionPageRight:
                                return "ACTION_PAGE_RIGHT";
                            case R.id.accessibilityActionPressAndHold:
                                return "ACTION_PRESS_AND_HOLD";
                            default:
                                switch (i) {
                                    case R.id.accessibilityActionImeEnter:
                                        return "ACTION_IME_ENTER";
                                    case R.id.accessibilityActionDragStart:
                                        return "ACTION_DRAG_START";
                                    case R.id.accessibilityActionDragDrop:
                                        return "ACTION_DRAG_DROP";
                                    case R.id.accessibilityActionDragCancel:
                                        return "ACTION_DRAG_CANCEL";
                                    default:
                                        switch (i) {
                                            case R.id.accessibilityActionScrollInDirection:
                                                return "ACTION_SCROLL_IN_DIRECTION";
                                            case R.id.ALT:
                                                return "ACTION_SET_EXTENDED_SELECTION";
                                            default:
                                                return "ACTION_UNKNOWN";
                                        }
                                }
                        }
                }
        }
    }

    public final void A04() {
        if (Build.VERSION.SDK_INT >= 33) {
            AbstractC2202BAh.A01(this.A02);
        } else {
            A02(this, 8388608, true);
        }
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && (obj instanceof C2197BAc)) {
                C2197BAc c2197BAc = (C2197BAc) obj;
                AccessibilityNodeInfo accessibilityNodeInfo = this.A02;
                AccessibilityNodeInfo accessibilityNodeInfo2 = c2197BAc.A02;
                if (accessibilityNodeInfo == null) {
                    if (accessibilityNodeInfo2 == null) {
                    }
                } else if (!accessibilityNodeInfo.equals(accessibilityNodeInfo2)) {
                    return false;
                }
                if (this.A01 != c2197BAc.A01 || this.A00 != c2197BAc.A00) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    private List<Integer> A01(String str) {
        AccessibilityNodeInfo accessibilityNodeInfo = this.A02;
        ArrayList<Integer> integerArrayList = accessibilityNodeInfo.getExtras().getIntegerArrayList(str);
        if (integerArrayList != null) {
            return integerArrayList;
        }
        ArrayList<Integer> arrayListA0h = C3cG.A0h();
        accessibilityNodeInfo.getExtras().putIntegerArrayList(str, arrayListA0h);
        return arrayListA0h;
    }

    public static void A02(C2197BAc c2197BAc, int i, boolean z) {
        Bundle extras = c2197BAc.A02.getExtras();
        if (extras != null) {
            int i2 = extras.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & (i ^ (-1));
            if (!z) {
                i = 0;
            }
            extras.putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", i | i2);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r10v0, types: [java.util.AbstractCollection, java.util.AbstractList, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r7v0, types: [java.util.AbstractList, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r8v0, types: [java.util.AbstractList, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r9v0, types: [java.util.AbstractList, java.util.ArrayList] */
    public final CharSequence A03() {
        if (!(!A01("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY").isEmpty())) {
            return this.A02.getText();
        }
        ?? A01 = A01("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY");
        ?? A012 = A01("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY");
        ?? A013 = A01("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY");
        ?? A014 = A01("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY");
        AccessibilityNodeInfo accessibilityNodeInfo = this.A02;
        SpannableString spannableString = new SpannableString(TextUtils.substring(accessibilityNodeInfo.getText(), 0, accessibilityNodeInfo.getText().length()));
        for (int i = 0; i < A01.size(); i++) {
            spannableString.setSpan(new C2198BAd(this, AnonymousClass001.A0F(A014.get(i)), accessibilityNodeInfo.getExtras().getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY")), AnonymousClass001.A0F(A01.get(i)), AnonymousClass001.A0F(A012.get(i)), AnonymousClass001.A0F(A013.get(i)));
        }
        return spannableString;
    }

    public final void A05(C2203BAi c2203BAi) {
        this.A02.addAction((AccessibilityNodeInfo.AccessibilityAction) c2203BAi.A03);
    }

    public final void A06(C2203BAi c2203BAi) {
        this.A02.removeAction((AccessibilityNodeInfo.AccessibilityAction) c2203BAi.A03);
    }

    public final void A07(CharSequence charSequence) {
        int i = Build.VERSION.SDK_INT;
        AccessibilityNodeInfo accessibilityNodeInfo = this.A02;
        if (i >= 34) {
            AbstractC2199BAe.A03(accessibilityNodeInfo, charSequence);
        } else {
            accessibilityNodeInfo.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.CONTAINER_TITLE_KEY", charSequence);
        }
    }

    public final void A08(CharSequence charSequence) {
        int i = Build.VERSION.SDK_INT;
        AccessibilityNodeInfo accessibilityNodeInfo = this.A02;
        if (i >= 30) {
            AbstractC2201BAg.A01(accessibilityNodeInfo, charSequence);
        } else {
            accessibilityNodeInfo.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY", charSequence);
        }
    }

    public final void A09(boolean z) {
        if (Build.VERSION.SDK_INT >= 34) {
            AbstractC2199BAe.A04(this.A02, z);
        } else {
            A02(this, 64, z);
        }
    }

    public final int hashCode() {
        return AnonymousClass006.A0D(this.A02);
    }

    public C2197BAc(AccessibilityNodeInfo accessibilityNodeInfo) {
        this.A02 = accessibilityNodeInfo;
    }

    public final String toString() {
        boolean zA02;
        boolean zA05;
        StringBuilder sbA0w = C60O.A0w();
        sbA0w.append(super.toString());
        Rect rect = new Rect();
        AccessibilityNodeInfo accessibilityNodeInfo = this.A02;
        accessibilityNodeInfo.getBoundsInParent(rect);
        sbA0w.append(AnonymousClass007.A0a("; boundsInParent: ", rect));
        accessibilityNodeInfo.getBoundsInScreen(rect);
        sbA0w.append(AnonymousClass007.A0a("; boundsInScreen: ", rect));
        int i = Build.VERSION.SDK_INT;
        if (i >= 34) {
            AbstractC2199BAe.A02(rect, accessibilityNodeInfo);
        } else {
            Rect rect2 = (Rect) accessibilityNodeInfo.getExtras().getParcelable("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOUNDS_IN_WINDOW_KEY");
            if (rect2 != null) {
                rect.set(rect2.left, rect2.top, rect2.right, rect2.bottom);
            }
        }
        sbA0w.append(AnonymousClass007.A0a("; boundsInWindow: ", rect));
        sbA0w.append("; packageName: ");
        sbA0w.append(accessibilityNodeInfo.getPackageName());
        sbA0w.append("; className: ");
        sbA0w.append(accessibilityNodeInfo.getClassName());
        sbA0w.append("; text: ");
        sbA0w.append(A03());
        sbA0w.append("; error: ");
        sbA0w.append(accessibilityNodeInfo.getError());
        sbA0w.append("; maxTextLength: ");
        sbA0w.append(accessibilityNodeInfo.getMaxTextLength());
        sbA0w.append("; stateDescription: ");
        sbA0w.append(i >= 30 ? AbstractC2201BAg.A00(accessibilityNodeInfo) : accessibilityNodeInfo.getExtras().getCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY"));
        sbA0w.append("; contentDescription: ");
        sbA0w.append(accessibilityNodeInfo.getContentDescription());
        sbA0w.append("; supplementalDescription: ");
        sbA0w.append(i >= 36 ? AbstractC2200BAf.A02(accessibilityNodeInfo) : accessibilityNodeInfo.getExtras().getCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.SUPPLEMENTAL_DESCRIPTION_KEY"));
        sbA0w.append("; tooltipText: ");
        sbA0w.append(accessibilityNodeInfo.getTooltipText());
        sbA0w.append("; viewIdResName: ");
        sbA0w.append(accessibilityNodeInfo.getViewIdResourceName());
        sbA0w.append("; uniqueId: ");
        sbA0w.append(i >= 33 ? AbstractC2202BAh.A00(accessibilityNodeInfo) : accessibilityNodeInfo.getExtras().getString("androidx.view.accessibility.AccessibilityNodeInfoCompat.UNIQUE_ID_KEY"));
        sbA0w.append("; checkable: ");
        sbA0w.append(accessibilityNodeInfo.isCheckable());
        sbA0w.append("; checked: ");
        int checked = i >= 36 ? accessibilityNodeInfo.getChecked() : accessibilityNodeInfo.getExtras().getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.CHECKED_KEY", accessibilityNodeInfo.isChecked() ? 1 : 0);
        sbA0w.append(checked == 1 ? "TRUE" : checked == 2 ? "PARTIAL" : "FALSE");
        sbA0w.append("; fieldRequired: ");
        sbA0w.append(i >= 36 ? AbstractC2200BAf.A03(accessibilityNodeInfo) : accessibilityNodeInfo.getExtras().getBoolean("androidx.view.accessibility.AccessibilityNodeInfoCompat.IS_REQUIRED_KEY"));
        sbA0w.append("; focusable: ");
        sbA0w.append(accessibilityNodeInfo.isFocusable());
        sbA0w.append("; focused: ");
        sbA0w.append(accessibilityNodeInfo.isFocused());
        sbA0w.append("; selected: ");
        sbA0w.append(accessibilityNodeInfo.isSelected());
        sbA0w.append("; clickable: ");
        sbA0w.append(accessibilityNodeInfo.isClickable());
        sbA0w.append("; longClickable: ");
        sbA0w.append(accessibilityNodeInfo.isLongClickable());
        sbA0w.append("; contextClickable: ");
        sbA0w.append(accessibilityNodeInfo.isContextClickable());
        sbA0w.append("; expandedState: ");
        int iA00 = i >= 36 ? AbstractC2200BAf.A00(accessibilityNodeInfo) : accessibilityNodeInfo.getExtras().getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.EXPANDED_STATE_KEY", 0);
        sbA0w.append(iA00 != 0 ? iA00 != 1 ? iA00 != 2 ? iA00 != 3 ? "UNKNOWN" : "FULL" : "PARTIAL" : "COLLAPSED" : "UNDEFINED");
        sbA0w.append("; enabled: ");
        sbA0w.append(accessibilityNodeInfo.isEnabled());
        sbA0w.append("; password: ");
        sbA0w.append(accessibilityNodeInfo.isPassword());
        sbA0w.append(FGI.A0r("; scrollable: ", accessibilityNodeInfo.isScrollable()));
        sbA0w.append("; containerTitle: ");
        sbA0w.append(i >= 34 ? AbstractC2199BAe.A01(accessibilityNodeInfo) : accessibilityNodeInfo.getExtras().getCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.CONTAINER_TITLE_KEY"));
        sbA0w.append("; granularScrollingSupported: ");
        Bundle extras = accessibilityNodeInfo.getExtras();
        boolean z = false;
        if (extras != null && (extras.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & 67108864) == 67108864) {
            z = true;
        }
        sbA0w.append(z);
        sbA0w.append("; importantForAccessibility: ");
        sbA0w.append(accessibilityNodeInfo.isImportantForAccessibility());
        sbA0w.append("; visible: ");
        sbA0w.append(accessibilityNodeInfo.isVisibleToUser());
        sbA0w.append("; isTextSelectable: ");
        if (i >= 33) {
            zA02 = AbstractC2202BAh.A02(accessibilityNodeInfo);
        } else {
            Bundle extras2 = accessibilityNodeInfo.getExtras();
            zA02 = false;
            if (extras2 != null && (extras2.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & 8388608) == 8388608) {
                zA02 = true;
            }
        }
        sbA0w.append(zA02);
        sbA0w.append("; accessibilityDataSensitive: ");
        if (i >= 34) {
            zA05 = AbstractC2199BAe.A05(accessibilityNodeInfo);
        } else {
            Bundle extras3 = accessibilityNodeInfo.getExtras();
            zA05 = false;
            if (extras3 != null && (extras3.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & 64) == 64) {
                zA05 = true;
            }
        }
        sbA0w.append(zA05);
        sbA0w.append("; [");
        List<AccessibilityNodeInfo.AccessibilityAction> actionList = accessibilityNodeInfo.getActionList();
        ArrayList arrayListA0h = C3cG.A0h();
        int size = actionList.size();
        for (int i2 = 0; i2 < size; i2++) {
            arrayListA0h.add(new C2203BAi(null, null, null, actionList.get(i2), 0));
        }
        for (int i3 = 0; i3 < arrayListA0h.size(); i3++) {
            C2203BAi c2203BAi = (C2203BAi) arrayListA0h.get(i3);
            String strA00 = A00(((AccessibilityNodeInfo.AccessibilityAction) c2203BAi.A03).getId());
            if (strA00.equals("ACTION_UNKNOWN") && ((AccessibilityNodeInfo.AccessibilityAction) c2203BAi.A03).getLabel() != null) {
                strA00 = ((AccessibilityNodeInfo.AccessibilityAction) c2203BAi.A03).getLabel().toString();
            }
            sbA0w.append(strA00);
            if (i3 != C8j3.A0K(arrayListA0h)) {
                C8j3.A1K(sbA0w);
            }
        }
        return AnonymousClass001.A0v("]", sbA0w);
    }
}
