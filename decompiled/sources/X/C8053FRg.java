package X;

import android.os.Bundle;
import android.text.Spanned;
import android.text.style.ClickableSpan;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import com.facebook.aura.R;
import java.lang.ref.Reference;
import java.util.Collections;
import java.util.List;

/* renamed from: X.FRg, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C8053FRg {
    public static final View.AccessibilityDelegate DEFAULT_DELEGATE = new View.AccessibilityDelegate();
    public final View.AccessibilityDelegate mBridge;
    public final View.AccessibilityDelegate mOriginalDelegate;

    private boolean isSpanStillValid(ClickableSpan clickableSpan, View view) {
        if (clickableSpan == null) {
            return false;
        }
        CharSequence text = view.createAccessibilityNodeInfo().getText();
        if (!(text instanceof Spanned)) {
            return false;
        }
        ClickableSpan[] clickableSpanArr = (ClickableSpan[]) ((Spanned) text).getSpans(0, text.length(), ClickableSpan.class);
        if (clickableSpanArr == null) {
            return false;
        }
        for (ClickableSpan clickableSpan2 : clickableSpanArr) {
            if (clickableSpan.equals(clickableSpan2)) {
                return true;
            }
        }
        return false;
    }

    public C8053FRg() {
        this(DEFAULT_DELEGATE);
    }

    public boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        return this.mOriginalDelegate.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    public FRa getAccessibilityNodeProvider(View view) {
        AccessibilityNodeProvider accessibilityNodeProvider = this.mOriginalDelegate.getAccessibilityNodeProvider(view);
        if (accessibilityNodeProvider != null) {
            return new FRa(accessibilityNodeProvider);
        }
        return null;
    }

    public View.AccessibilityDelegate getBridge() {
        return this.mBridge;
    }

    public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        this.mOriginalDelegate.onInitializeAccessibilityEvent(view, accessibilityEvent);
    }

    public void onInitializeAccessibilityNodeInfo(View view, C2197BAc c2197BAc) {
        this.mOriginalDelegate.onInitializeAccessibilityNodeInfo(view, c2197BAc.A02);
    }

    public void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        this.mOriginalDelegate.onPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    public boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        return this.mOriginalDelegate.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    public void sendAccessibilityEvent(View view, int i) {
        this.mOriginalDelegate.sendAccessibilityEvent(view, i);
    }

    public void sendAccessibilityEventUnchecked(View view, AccessibilityEvent accessibilityEvent) {
        this.mOriginalDelegate.sendAccessibilityEventUnchecked(view, accessibilityEvent);
    }

    public static List<C2203BAi> getActionList(View view) {
        List<C2203BAi> list = (List) view.getTag(R.id.tag_accessibility_actions);
        return list == null ? Collections.EMPTY_LIST : list;
    }

    private boolean performClickableSpanAction(int i, View view) {
        Reference reference;
        SparseArray sparseArray = (SparseArray) view.getTag(R.id.tag_accessibility_clickable_spans);
        if (sparseArray == null || (reference = (Reference) sparseArray.get(i)) == null) {
            return false;
        }
        ClickableSpan clickableSpan = (ClickableSpan) reference.get();
        if (!isSpanStillValid(clickableSpan, view)) {
            return false;
        }
        clickableSpan.onClick(view);
        return true;
    }

    public boolean performAccessibilityAction(View view, int i, Bundle bundle) {
        boolean zPerformAccessibilityAction;
        List<C2203BAi> actionList = getActionList(view);
        int i2 = 0;
        while (true) {
            if (i2 >= actionList.size()) {
                break;
            }
            C2203BAi c2203BAi = actionList.get(i2);
            if (((AccessibilityNodeInfo.AccessibilityAction) c2203BAi.A03).getId() == i) {
                InterfaceC8055FRi interfaceC8055FRi = c2203BAi.A01;
                if (interfaceC8055FRi != null) {
                    Class<? extends Hq1> cls = c2203BAi.A02;
                    if (cls != null) {
                        try {
                            cls.getDeclaredConstructor(null).newInstance(null).A00 = bundle;
                        } catch (Exception e) {
                            Log.e("A11yActionCompat", FGI.A0M("Failed to execute command with argument class ViewCommandArgument: ", cls.getName()), e);
                        }
                    }
                    zPerformAccessibilityAction = interfaceC8055FRi.AXn(view);
                    if (!zPerformAccessibilityAction) {
                        break;
                    }
                } else {
                    break;
                }
            } else {
                i2++;
            }
        }
        zPerformAccessibilityAction = this.mOriginalDelegate.performAccessibilityAction(view, i, bundle);
        if (!zPerformAccessibilityAction && i == R.id.accessibility_action_clickable_span && bundle != null) {
            return performClickableSpanAction(bundle.getInt(C8j2.A00(47), -1), view);
        }
        return zPerformAccessibilityAction;
    }

    public C8053FRg(View.AccessibilityDelegate accessibilityDelegate) {
        this.mOriginalDelegate = accessibilityDelegate;
        this.mBridge = new C8054FRh(this);
    }
}
