package X;

import android.text.TextUtils;
import java.util.Locale;

/* renamed from: X.FYv, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC8204FYv implements InterfaceC7910FKh {
    public final FZM A00;

    @Override // X.InterfaceC7910FKh
    public final boolean AOx(CharSequence charSequence, int i, int i2) {
        if (charSequence == null || i < 0 || i2 < 0 || charSequence.length() - i2 < i) {
            throw BV4.A0P();
        }
        FZM fzm = this.A00;
        if (fzm != null) {
            int iA6A = fzm.A6A(charSequence, i, i2);
            if (iA6A == 0) {
                return true;
            }
            if (iA6A == 1) {
                return false;
            }
            if (this instanceof C8203FYu) {
                return BV7.A1Q(TextUtils.getLayoutDirectionFromLocale(Locale.getDefault()));
            }
        } else if (this instanceof C8203FYu) {
            return BV7.A1Q(TextUtils.getLayoutDirectionFromLocale(Locale.getDefault()));
        }
        return ((FZE) this).A00;
    }

    public AbstractC8204FYv(FZM fzm) {
        this.A00 = fzm;
    }
}
