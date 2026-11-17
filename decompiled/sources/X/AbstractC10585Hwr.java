package X;

import android.content.Context;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import com.facebook.aura.R;

/* renamed from: X.Hwr, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC10585Hwr {
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static void A00(Context context, View view, C2197BAc c2197BAc, String str) {
        if (str != null) {
            char c = '\uffff';
            switch (str.hashCode()) {
                case -2137403731:
                    if (str.equals("Header")) {
                        c = 0;
                        break;
                    }
                    break;
                case -565577257:
                    if (str.equals("Image Button")) {
                        c = 1;
                        break;
                    }
                    break;
                case 2368538:
                    if (str.equals("Link")) {
                        c = 2;
                        break;
                    }
                    break;
                case 70760763:
                    if (str.equals("Image")) {
                        c = 3;
                        break;
                    }
                    break;
                case 109450440:
                    if (str.equals("Tab Bar")) {
                        c = 4;
                        break;
                    }
                    break;
                case 1404906583:
                    if (str.equals("Selected Button")) {
                        c = 5;
                        break;
                    }
                    break;
                case 2001146706:
                    if (str.equals("Button")) {
                        c = 6;
                        break;
                    }
                    break;
            }
            String str2 = "android.widget.Button";
            switch (c) {
                case 0:
                    c2197BAc.A02.setHeading(true);
                    if (view != null) {
                        AbstractC8060FRo.A0B(view, true);
                        return;
                    }
                    return;
                case 1:
                case 6:
                    break;
                case 2:
                    AccessibilityNodeInfo accessibilityNodeInfo = c2197BAc.A02;
                    accessibilityNodeInfo.setClassName("android.widget.Button");
                    accessibilityNodeInfo.getExtras().putCharSequence("AccessibilityNodeInfo.roleDescription", context.getString(R.string._name_removed__res_0x7f120026));
                    return;
                case 3:
                    c2197BAc.A02.setClassName("android.widget.ImageView");
                    c2197BAc.A06(C2203BAi.A0f);
                    return;
                case 4:
                    str2 = "android.widget.TabWidget";
                    break;
                case 5:
                    AccessibilityNodeInfo accessibilityNodeInfo2 = c2197BAc.A02;
                    accessibilityNodeInfo2.setClassName("android.widget.Button");
                    accessibilityNodeInfo2.setSelected(true);
                    return;
                default:
                    return;
            }
            c2197BAc.A02.setClassName(str2);
        }
    }
}
