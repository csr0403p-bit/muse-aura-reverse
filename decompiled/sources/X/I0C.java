package X;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import com.facebook.aura.R;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.datepicker.MaterialCalendar;
import com.google.android.material.internal.CheckableImageButton;

/* loaded from: classes6.dex */
public final class I0C extends C8053FRg {
    public final int $t;
    public final Object A00;

    public I0C(Object obj, int i) {
        this.$t = i;
        this.A00 = obj;
    }

    @Override // X.C8053FRg
    public final void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        if (6 - this.$t != 0) {
            super.onInitializeAccessibilityEvent(view, accessibilityEvent);
        } else {
            super.onInitializeAccessibilityEvent(view, accessibilityEvent);
            accessibilityEvent.setChecked(((CheckableImageButton) this.A00).isChecked());
        }
    }

    @Override // X.C8053FRg
    public final void onInitializeAccessibilityNodeInfo(View view, C2197BAc c2197BAc) {
        int i;
        boolean z;
        boolean z2;
        switch (this.$t) {
            case 0:
                super.onInitializeAccessibilityNodeInfo(view, c2197BAc);
                z = ((FOX) this.A00).A0E;
                break;
            case 1:
                super.onInitializeAccessibilityNodeInfo(view, c2197BAc);
                z = ((DialogC8130FVg) this.A00).A04;
                break;
            case 2:
                super.onInitializeAccessibilityNodeInfo(view, c2197BAc);
                ViewGroup viewGroup = (ViewGroup) this.A00;
                if (view instanceof MaterialButton) {
                    i = 0;
                    for (int i2 = 0; i2 < viewGroup.getChildCount(); i2++) {
                        if (viewGroup.getChildAt(i2) != view) {
                            if ((viewGroup.getChildAt(i2) instanceof MaterialButton) && viewGroup.getChildAt(i2).getVisibility() != 8) {
                                i++;
                            }
                        }
                    }
                    i = -1;
                } else {
                    i = -1;
                }
                c2197BAc.A02.setCollectionItemInfo(AccessibilityNodeInfo.CollectionItemInfo.obtain(0, 1, i, 1, false, ((MaterialButton) view).isChecked()));
                return;
            case 3:
                super.onInitializeAccessibilityNodeInfo(view, c2197BAc);
                c2197BAc.A02.setCollectionInfo(null);
                return;
            case 4:
                super.onInitializeAccessibilityNodeInfo(view, c2197BAc);
                MaterialCalendar materialCalendar = (MaterialCalendar) this.A00;
                int visibility = materialCalendar.A00.getVisibility();
                int i3 = R.string._name_removed__res_0x7f120d00;
                if (visibility == 0) {
                    i3 = R.string._name_removed__res_0x7f120d01;
                }
                c2197BAc.A02.setHintText(materialCalendar.getString(i3));
                return;
            case 5:
                super.onInitializeAccessibilityNodeInfo(view, c2197BAc);
                c2197BAc.A02.setCollectionInfo(null);
                return;
            case 6:
                super.onInitializeAccessibilityNodeInfo(view, c2197BAc);
                CheckableImageButton checkableImageButton = (CheckableImageButton) this.A00;
                boolean z3 = checkableImageButton.A00;
                AccessibilityNodeInfo accessibilityNodeInfo = c2197BAc.A02;
                accessibilityNodeInfo.setCheckable(z3);
                accessibilityNodeInfo.setChecked(checkableImageButton.isChecked());
                return;
            case 7:
                super.onInitializeAccessibilityNodeInfo(view, c2197BAc);
                AccessibilityNodeInfo accessibilityNodeInfo2 = c2197BAc.A02;
                accessibilityNodeInfo2.addAction(1048576);
                accessibilityNodeInfo2.setDismissable(true);
                return;
            default:
                super.onInitializeAccessibilityNodeInfo(view, c2197BAc);
                int iA0F = AnonymousClass001.A0F(view.getTag(R.id.material_value_index));
                if (iA0F > 0) {
                    throw new NullPointerException("textViewPool");
                }
                c2197BAc.A02.setCollectionItemInfo(AccessibilityNodeInfo.CollectionItemInfo.obtain(0, 1, iA0F, 1, false, view.isSelected()));
                return;
        }
        if (z) {
            c2197BAc.A02.addAction(1048576);
            z2 = true;
        } else {
            z2 = false;
        }
        c2197BAc.A02.setDismissable(z2);
    }

    @Override // X.C8053FRg
    public final boolean performAccessibilityAction(View view, int i, Bundle bundle) {
        switch (this.$t) {
            case 0:
                if (i == 1048576) {
                    FOX fox = (FOX) this.A00;
                    if (fox.A0E) {
                        fox.A04(C79.A0K);
                        return true;
                    }
                }
                return super.performAccessibilityAction(view, i, bundle);
            case 1:
                if (i == 1048576) {
                    DialogC8130FVg dialogC8130FVg = (DialogC8130FVg) this.A00;
                    if (dialogC8130FVg.A04) {
                        dialogC8130FVg.cancel();
                        return true;
                    }
                }
                return super.performAccessibilityAction(view, i, bundle);
            case 7:
                if (i != 1048576) {
                    return super.performAccessibilityAction(view, i, bundle);
                }
                ((FW1) this.A00).A04(3);
                return true;
            default:
                return super.performAccessibilityAction(view, i, bundle);
        }
    }
}
