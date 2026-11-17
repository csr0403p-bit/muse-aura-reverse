package X;

import android.text.Spanned;

/* renamed from: X.Awi, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC2029Awi {
    public static final boolean A00(Spanned spanned, Class<?> cls) {
        return spanned.nextSpanTransition(-1, spanned.length(), cls) != spanned.length();
    }
}
