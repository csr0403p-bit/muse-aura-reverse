package X;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ShortcutInfo;
import android.os.Build;
import android.text.TextUtils;
import androidx.core.graphics.drawable.IconCompat;

/* renamed from: X.EFu, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C6566EFu {
    public Context A00;
    public IconCompat A01;
    public CharSequence A02;
    public CharSequence A03;
    public String A04;
    public Intent[] A05;

    public final ShortcutInfo A00() {
        ShortcutInfo.Builder intents = new ShortcutInfo.Builder(this.A00, this.A04).setShortLabel(this.A02).setIntents(this.A05);
        IconCompat iconCompat = this.A01;
        if (iconCompat != null) {
            intents.setIcon(EFo.A00(this.A00, iconCompat));
        }
        if (!TextUtils.isEmpty(this.A03)) {
            intents.setLongLabel(this.A03);
        }
        if (!TextUtils.isEmpty(null)) {
            intents.setDisabledMessage(null);
        }
        intents.setRank(0);
        intents.setLongLived(false);
        if (Build.VERSION.SDK_INT >= 33) {
            EG0.A00(intents);
        }
        return intents.build();
    }
}
