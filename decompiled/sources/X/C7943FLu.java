package X;

import android.content.DialogInterface;
import android.util.SparseArray;
import com.facebook.aura.subscription.repo.AuraSubscriptionRepositoryJsonKt;

/* renamed from: X.FLu, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7943FLu {
    public final DialogInterface.OnClickListener A00;
    public final SparseArray<String> A01;
    public final CharSequence A02;
    public final String A03;

    public static int A00(C7943FLu c7943FLu, int i) {
        String str = c7943FLu.A03;
        return AuraSubscriptionRepositoryJsonKt.CHANGE_ACTION_CANCEL.equals(str) ? i != 0 ? -1 : -16777216 : "destructive".equals(str) ? i != 0 ? -46782 : -50637 : i != 0 ? -12412161 : -16089857;
    }

    public C7943FLu(DialogInterface.OnClickListener onClickListener, SparseArray sparseArray, CharSequence charSequence, String str) {
        this.A02 = charSequence;
        this.A00 = onClickListener;
        this.A03 = str;
        this.A01 = sparseArray;
    }
}
