package X;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

/* renamed from: X.Hup, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C10577Hup extends ThreadLocal<DecimalFormat> {
    public final /* synthetic */ String A00;

    public C10577Hup(String str) {
        this.A00 = str;
    }

    @Override // java.lang.ThreadLocal
    public final /* bridge */ /* synthetic */ DecimalFormat initialValue() {
        return new DecimalFormat(this.A00, DecimalFormatSymbols.getInstance(Locale.US));
    }
}
