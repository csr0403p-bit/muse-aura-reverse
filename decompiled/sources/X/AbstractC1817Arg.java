package X;

import android.text.Spannable;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.LocaleSpan;
import android.text.style.RelativeSizeSpan;
import com.facebook.aura.localbrowser.LocalBrowserCapacityKt;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.Arg, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC1817Arg {
    public static final void A00(Spannable spannable, int i, int i2, long j) {
        if (j != 16) {
            spannable.setSpan(new ForegroundColorSpan(HxS.A01(j)), i, i2, 33);
        }
    }

    public static final void A01(Spannable spannable, C0874AGa c0874AGa, int i, int i2) {
        if (c0874AGa != null) {
            ArrayList arrayListA0i = AnonymousClass003.A0i(c0874AGa);
            Iterator<BN1> it = c0874AGa.iterator();
            while (it.hasNext()) {
                arrayListA0i.add(it.next().A00);
            }
            spannable.setSpan(new LocaleSpan(C8j3.A0a(arrayListA0i)), i, i2, 33);
        }
    }

    public static final void A02(Spannable spannable, AXN axn, int i, int i2, long j) {
        Object relativeSizeSpan;
        long jA01 = C1809ArT.A01(j);
        if (jA01 == LocalBrowserCapacityKt.BACKGROUND_WAKE_MIN_RAM_BYTES) {
            relativeSizeSpan = new AbsoluteSizeSpan(Ab3.A01(axn.Ah3(j)), false);
        } else if (jA01 != 8589934592L) {
            return;
        } else {
            relativeSizeSpan = new RelativeSizeSpan(C1809ArT.A00(j));
        }
        spannable.setSpan(relativeSizeSpan, i, i2, 33);
    }
}
