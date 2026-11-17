package X;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.7mE, reason: invalid class name */
/* loaded from: classes3.dex */
public abstract class C7mE extends C7mJ {
    /* JADX WARN: Incorrect types in method signature: (Landroid/content/Intent;Landroid/content/Context;Ljava/lang/String;)Ljava/util/List<Landroid/content/Intent;>; */
    @Override // X.C7n1
    public final List AAg(Context context, Intent intent, String str) {
        throw new UnsupportedOperationException();
    }

    @Override // X.C7n1
    public final Intent AAh(BroadcastReceiver broadcastReceiver, Context context, Intent intent) {
        throw new UnsupportedOperationException();
    }

    /* JADX WARN: Incorrect types in method signature: (Landroid/content/Intent;Landroid/content/Context;Ljava/util/List<+Landroid/content/pm/ComponentInfo;>;)Landroid/content/Intent; */
    /* JADX WARN: Removed duplicated region for block: B:17:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x002e A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private android.content.Intent A00(android.content.Context r12, android.content.Intent r13, java.util.List r14) {
        /*
            Method dump skipped, instructions count: 362
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C7mE.A00(android.content.Context, android.content.Intent, java.util.List):android.content.Intent");
    }

    @Override // X.C7n1
    public final Intent AAf(Context context, Intent intent, String str) {
        Intent intentA00;
        if (C7mJ.A08(context, intent) && !A0B()) {
            return null;
        }
        ArrayList arrayListA05 = C7mJ.A05(context, intent, this, 268501056);
        return (arrayListA05.isEmpty() || (intentA00 = A00(context, intent, arrayListA05)) == null) ? A00(context, intent, C7mJ.A05(context, intent, this, 0)) : intentA00;
    }

    @Override // X.C7n1
    public final Intent AAi(Context context, Intent intent, String str) {
        if (C7mJ.A08(context, intent) && !A0B()) {
            return null;
        }
        ArrayList arrayListA06 = C7mJ.A06(context, intent, this, 268501056);
        if (arrayListA06.isEmpty()) {
            arrayListA06 = C7mJ.A06(context, intent, this, 268435456);
        }
        return A00(context, intent, arrayListA06);
    }
}
