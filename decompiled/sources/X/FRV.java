package X;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ComponentInfo;
import android.content.pm.PackageItemInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.text.Spannable;
import android.util.SparseArray;
import android.view.accessibility.AccessibilityNodeInfo;
import com.facebook.rendercore.text.RCTextView;
import java.util.List;

/* loaded from: classes6.dex */
public final class FRV {
    public final Context A00;
    public final PackageManager A01;
    public final RCTextView A05;
    public final FRD A06;
    public final List<ResolveInfo> A04 = C3cG.A0h();
    public final SparseArray<Intent> A03 = BV4.A0B();
    public final SparseArray<AccessibilityNodeInfo.AccessibilityAction> A02 = BV4.A0B();

    public static boolean A01(Intent intent, FRV frv) {
        if (intent != null && BV5.A1Q(intent, "android.intent.action.PROCESS_TEXT")) {
            FRD frd = frv.A06;
            if (frd.A0G() && frd.A02 != null) {
                int iA03 = frd.A03();
                int iA02 = frd.A02();
                Spannable spannable = frd.A02;
                String strValueOf = String.valueOf(iA03 > iA02 ? spannable.subSequence(iA02, iA03) : spannable.subSequence(iA03, iA02));
                if (strValueOf.length() > 260000) {
                    strValueOf = strValueOf.substring(0, 260000);
                }
                intent.putExtra(C60N.A00(61), strValueOf);
                Context context = frv.A00;
                if (context instanceof Activity) {
                    ((Activity) context).startActivityForResult(intent, 100);
                    return true;
                }
                context.startActivity(intent);
                return true;
            }
        }
        return false;
    }

    public static void A00(FRV frv) {
        String str;
        List<ResolveInfo> list = frv.A04;
        list.clear();
        Context context = frv.A00;
        if (context instanceof Activity) {
            for (ResolveInfo resolveInfo : frv.A01.queryIntentActivities(new Intent().setAction("android.intent.action.PROCESS_TEXT").setType("text/plain"), 0)) {
                ActivityInfo activityInfo = resolveInfo.activityInfo;
                if ("com.facebook.aura".equals(((PackageItemInfo) activityInfo).packageName) || (((ComponentInfo) activityInfo).exported && ((str = activityInfo.permission) == null || context.checkSelfPermission(str) == 0))) {
                    list.add(resolveInfo);
                }
            }
        }
    }

    public FRV(FRD frd) {
        this.A06 = frd;
        int i = FRD.A0J;
        RCTextView rCTextView = frd.A0F;
        rCTextView.getClass();
        this.A05 = rCTextView;
        Context context = rCTextView.getContext();
        context.getClass();
        this.A00 = context;
        PackageManager packageManager = context.getPackageManager();
        packageManager.getClass();
        this.A01 = packageManager;
        context.getPackageName();
    }
}
