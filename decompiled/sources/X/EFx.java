package X;

import android.os.Bundle;
import androidx.core.graphics.drawable.IconCompat;
import com.facebook.aura.ccv.nativeflow.ui.HatchCcvLoggingKt;

/* loaded from: classes5.dex */
public final class EFx {
    public IconCompat A00;
    public CharSequence A01;
    public String A02;
    public String A03;
    public boolean A04;
    public boolean A05;

    public EFx(IconCompat iconCompat, CharSequence charSequence, String str, String str2, boolean z, boolean z2) {
        this.A01 = charSequence;
        this.A00 = iconCompat;
        this.A03 = str2;
        this.A02 = str;
        this.A04 = z;
        this.A05 = z2;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof EFx)) {
            return false;
        }
        EFx eFx = (EFx) obj;
        String str = this.A02;
        String str2 = eFx.A02;
        if (str != null || str2 != null) {
            return C6xC.A00(str, str2);
        }
        CharSequence charSequence = this.A01;
        String string = HatchCcvLoggingKt.NO_POSTAL_FIELD;
        String string2 = HatchCcvLoggingKt.NO_POSTAL_FIELD;
        if (charSequence != null) {
            string2 = charSequence.toString();
        }
        CharSequence charSequence2 = eFx.A01;
        if (charSequence2 != null) {
            string = charSequence2.toString();
        }
        return C6xC.A00(string2, string) && C6xC.A00(this.A03, eFx.A03) && C6xC.A00(Boolean.valueOf(this.A04), Boolean.valueOf(eFx.A04)) && C6xC.A00(Boolean.valueOf(this.A05), Boolean.valueOf(eFx.A05));
    }

    public static EFx A00(Bundle bundle) {
        Bundle bundle2 = bundle.getBundle("icon");
        return new EFx(bundle2 != null ? IconCompat.A01(bundle2) : null, bundle.getCharSequence("name"), bundle.getString("key"), bundle.getString("uri"), bundle.getBoolean("isBot"), bundle.getBoolean("isImportant"));
    }

    public final int hashCode() {
        String str = this.A02;
        return str != null ? str.hashCode() : BV6.A0A(this.A01, this.A03, Boolean.valueOf(this.A04), Boolean.valueOf(this.A05));
    }
}
