package X;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.animation.ValueAnimator;
import android.os.Handler;
import android.os.Message;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.snackbar.BaseTransientBottomBar$Behavior;
import java.util.List;

/* renamed from: X.FVy, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8135FVy implements Handler.Callback {
    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int height;
        ValueAnimator valueAnimator;
        List<AccessibilityServiceInfo> enabledAccessibilityServiceList;
        int i = message.what;
        if (i != 0) {
            if (i != 1) {
                return false;
            }
            FW1 fw1 = (FW1) message.obj;
            int i2 = message.arg1;
            AccessibilityManager accessibilityManager = fw1.A0D;
            if (accessibilityManager == null || ((enabledAccessibilityServiceList = accessibilityManager.getEnabledAccessibilityServiceList(1)) != null && enabledAccessibilityServiceList.isEmpty())) {
                FW2 fw2 = fw1.A0E;
                if (fw2.getVisibility() == 0) {
                    if (fw2.A00 == 1) {
                        valueAnimator = ValueAnimator.ofFloat(1.0f, 0.0f);
                        valueAnimator.setInterpolator(AbstractC8136FVz.A03);
                        valueAnimator.addUpdateListener(new C8919Ftb(fw1, 7));
                        valueAnimator.setDuration(75L);
                        valueAnimator.addListener(new I06(fw1, i2, 0));
                    } else {
                        valueAnimator = new ValueAnimator();
                        int height2 = fw2.getHeight();
                        ViewGroup.LayoutParams layoutParams = fw2.getLayoutParams();
                        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                            height2 += ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
                        }
                        valueAnimator.setIntValues(0, height2);
                        valueAnimator.setInterpolator(AbstractC8136FVz.A02);
                        valueAnimator.setDuration(250L);
                        valueAnimator.addListener(new I06(fw1, i2, 1));
                        valueAnimator.addUpdateListener(new C8919Ftb(fw1, 10));
                    }
                    valueAnimator.start();
                    return true;
                }
            }
            fw1.A02();
            return true;
        }
        FW1 fw12 = (FW1) message.obj;
        FW2 fw22 = fw12.A0E;
        fw22.A02 = new FWD(fw12);
        if (fw22.getParent() == null) {
            ViewGroup.LayoutParams layoutParams2 = fw22.getLayoutParams();
            if (layoutParams2 instanceof C8128FUx) {
                C8128FUx c8128FUx = (C8128FUx) layoutParams2;
                BaseTransientBottomBar$Behavior baseTransientBottomBar$Behavior = new BaseTransientBottomBar$Behavior();
                baseTransientBottomBar$Behavior.A00.A00 = fw12.A07;
                baseTransientBottomBar$Behavior.A04 = new FVb(fw12);
                CoordinatorLayout.Behavior behavior = c8128FUx.A0A;
                if (behavior != baseTransientBottomBar$Behavior) {
                    if (behavior != null) {
                        behavior.onDetachedFromLayoutParams();
                    }
                    c8128FUx.A0A = baseTransientBottomBar$Behavior;
                    c8128FUx.A0B = null;
                    c8128FUx.A0C = true;
                    baseTransientBottomBar$Behavior.onAttachedToLayoutParams(c8128FUx);
                }
                if (fw12.A06 == null) {
                    c8128FUx.A03 = 80;
                }
            }
            View view = fw12.A06;
            if (view == null) {
                height = 0;
            } else {
                int[] iArr = new int[2];
                view.getLocationOnScreen(iArr);
                int i3 = iArr[1];
                int[] iArr2 = new int[2];
                ViewGroup viewGroup = fw12.A0B;
                viewGroup.getLocationOnScreen(iArr2);
                height = (iArr2[1] + viewGroup.getHeight()) - i3;
            }
            fw12.A01 = height;
            FW1.A01(fw12);
            fw22.setVisibility(4);
            fw12.A0B.addView(fw22);
        }
        if (fw22.isLaidOut()) {
            FW1.A00(fw12);
            return true;
        }
        fw22.A03 = new FWE(fw12);
        return true;
    }
}
