package X;

import android.R;
import android.os.Build;
import android.view.accessibility.AccessibilityNodeInfo;

/* renamed from: X.BAi, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2203BAi {
    public static final C2203BAi A0E;
    public static final C2203BAi A0F;
    public static final C2203BAi A0G;
    public static final C2203BAi A0K;
    public static final C2203BAi A0U;
    public static final C2203BAi A0a;
    public static final C2203BAi A0g;
    public static final C2203BAi A0l;
    public final int A00;
    public final InterfaceC8055FRi A01;
    public final Class<? extends Hq1> A02;
    public final Object A03;
    public static final C2203BAi A0I = new C2203BAi(1, (CharSequence) null);
    public static final C2203BAi A06 = new C2203BAi(2, (CharSequence) null);
    public static final C2203BAi A0f = new C2203BAi(4, (CharSequence) null);
    public static final C2203BAi A07 = new C2203BAi(8, (CharSequence) null);
    public static final C2203BAi A08 = new C2203BAi(16, (CharSequence) null);
    public static final C2203BAi A0L = new C2203BAi(32, (CharSequence) null);
    public static final C2203BAi A04 = new C2203BAi(64, (CharSequence) null);
    public static final C2203BAi A05 = new C2203BAi(128, (CharSequence) null);
    public static final C2203BAi A0N = new C2203BAi(C2205BAk.class, 256);
    public static final C2203BAi A0V = new C2203BAi(C2205BAk.class, 512);
    public static final C2203BAi A0O = new C2203BAi(C2206BAl.class, 1024);
    public static final C2203BAi A0W = new C2203BAi(C2206BAl.class, 2048);
    public static final C2203BAi A0Z = new C2203BAi(4096, (CharSequence) null);
    public static final C2203BAi A0X = new C2203BAi(8192, (CharSequence) null);
    public static final C2203BAi A0B = new C2203BAi(16384, (CharSequence) null);
    public static final C2203BAi A0T = new C2203BAi(32768, (CharSequence) null);
    public static final C2203BAi A0C = new C2203BAi(65536, (CharSequence) null);
    public static final C2203BAi A0i = new C2203BAi(C2210BAp.class, 131072);
    public static final C2203BAi A0H = new C2203BAi(262144, (CharSequence) null);
    public static final C2203BAi A09 = new C2203BAi(524288, (CharSequence) null);
    public static final C2203BAi A0D = new C2203BAi(1048576, (CharSequence) null);
    public static final C2203BAi A0j = new C2203BAi(BAq.class, 2097152);
    public static final C2203BAi A0k = new C2203BAi(null, null, null, AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_ON_SCREEN, R.id.accessibilityActionShowOnScreen);
    public static final C2203BAi A0d = new C2203BAi(null, null, C2208BAn.class, AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_TO_POSITION, R.id.accessibilityActionScrollToPosition);
    public static final C2203BAi A0e = new C2203BAi(null, null, null, AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_UP, R.id.accessibilityActionScrollUp);
    public static final C2203BAi A0b = new C2203BAi(null, null, null, AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_LEFT, R.id.accessibilityActionScrollLeft);
    public static final C2203BAi A0Y = new C2203BAi(null, null, null, AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_DOWN, R.id.accessibilityActionScrollDown);
    public static final C2203BAi A0c = new C2203BAi(null, null, null, AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_RIGHT, R.id.accessibilityActionScrollRight);
    public static final C2203BAi A0S = new C2203BAi(null, null, null, AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_UP, R.id.accessibilityActionPageUp);
    public static final C2203BAi A0P = new C2203BAi(null, null, null, AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_DOWN, R.id.accessibilityActionPageDown);
    public static final C2203BAi A0Q = new C2203BAi(null, null, null, AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_LEFT, R.id.accessibilityActionPageLeft);
    public static final C2203BAi A0R = new C2203BAi(null, null, null, AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_RIGHT, R.id.accessibilityActionPageRight);
    public static final C2203BAi A0A = new C2203BAi(null, null, null, AccessibilityNodeInfo.AccessibilityAction.ACTION_CONTEXT_CLICK, R.id.accessibilityActionContextClick);
    public static final C2203BAi A0h = new C2203BAi(null, null, C2209BAo.class, AccessibilityNodeInfo.AccessibilityAction.ACTION_SET_PROGRESS, R.id.accessibilityActionSetProgress);
    public static final C2203BAi A0M = new C2203BAi(null, null, C2207BAm.class, AccessibilityNodeInfo.AccessibilityAction.ACTION_MOVE_WINDOW, R.id.accessibilityActionMoveWindow);
    public static final C2203BAi A0m = new C2203BAi(null, null, null, AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TOOLTIP, R.id.accessibilityActionShowTooltip);
    public static final C2203BAi A0J = new C2203BAi(null, null, null, AccessibilityNodeInfo.AccessibilityAction.ACTION_HIDE_TOOLTIP, R.id.accessibilityActionHideTooltip);

    static {
        int i = Build.VERSION.SDK_INT;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction = null;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction2 = null;
        A0U = new C2203BAi(null, null, null, i >= 30 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PRESS_AND_HOLD : null, R.id.accessibilityActionPressAndHold);
        if (i >= 30) {
            accessibilityAction2 = AccessibilityNodeInfo.AccessibilityAction.ACTION_IME_ENTER;
        }
        A0K = new C2203BAi(null, null, null, accessibilityAction2, R.id.accessibilityActionImeEnter);
        A0G = new C2203BAi(null, null, null, i >= 32 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_START : null, R.id.accessibilityActionDragStart);
        A0F = new C2203BAi(null, null, null, i >= 32 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_DROP : null, R.id.accessibilityActionDragDrop);
        if (i >= 32) {
            accessibilityAction = AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_CANCEL;
        }
        A0E = new C2203BAi(null, null, null, accessibilityAction, R.id.accessibilityActionDragCancel);
        int i2 = Build.VERSION.SDK_INT;
        AccessibilityNodeInfo.AccessibilityAction accessibilityActionA00 = null;
        A0l = new C2203BAi(null, null, null, i2 >= 33 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TEXT_SUGGESTIONS : null, R.id.accessibilityActionShowTextSuggestions);
        if (i2 >= 34) {
            accessibilityActionA00 = AbstractC2199BAe.A00();
        }
        A0a = new C2203BAi(null, null, null, accessibilityActionA00, R.id.accessibilityActionScrollInDirection);
        A0g = new C2203BAi(null, null, null, C5Q7.A00() ? AbstractC2204BAj.A00() : null, R.id.ALT);
    }

    public C2203BAi(int i, CharSequence charSequence) {
        this(null, charSequence, null, null, i);
    }

    public final boolean equals(Object obj) {
        return obj != null && (obj instanceof C2203BAi) && this.A03.equals(((C2203BAi) obj).A03);
    }

    public final int hashCode() {
        return this.A03.hashCode();
    }

    public final String toString() {
        String strA00 = C2197BAc.A00(this.A00);
        if (strA00.equals("ACTION_UNKNOWN")) {
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction = (AccessibilityNodeInfo.AccessibilityAction) this.A03;
            if (accessibilityAction.getLabel() != null) {
                strA00 = accessibilityAction.getLabel().toString();
            }
        }
        return FGI.A0M("AccessibilityActionCompat: ", strA00);
    }

    public C2203BAi(Class cls, int i) {
        this(null, null, cls, null, i);
    }

    /* JADX WARN: Incorrect types in method signature: (Ljava/lang/Object;ILjava/lang/CharSequence;LX/FRi;Ljava/lang/Class<+LX/Hq1;>;)V */
    public C2203BAi(InterfaceC8055FRi interfaceC8055FRi, CharSequence charSequence, Class cls, Object obj, int i) {
        this.A00 = i;
        this.A01 = interfaceC8055FRi;
        this.A03 = obj == null ? new AccessibilityNodeInfo.AccessibilityAction(i, charSequence) : obj;
        this.A02 = cls;
    }
}
