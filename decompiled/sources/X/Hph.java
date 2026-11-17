package X;

import android.text.InputFilter;
import android.text.Spanned;

/* loaded from: classes6.dex */
public final class Hph implements InputFilter {
    public final /* synthetic */ G0V<String, String, Boolean> A00;

    /* JADX WARN: Multi-variable type inference failed */
    public Hph(G0V<? super String, ? super String, Boolean> g0v) {
        this.A00 = g0v;
    }

    @Override // android.text.InputFilter
    public final CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
        String string = spanned.toString();
        StringBuilder sbA0x = C60O.A0x(string);
        sbA0x.replace(i3, i4, charSequence.toString());
        if (AnonymousClass001.A1X(this.A00.invoke(string, sbA0x.toString()))) {
            return null;
        }
        return spanned.subSequence(i3, i4);
    }
}
