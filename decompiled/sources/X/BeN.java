package X;

import java.util.Collections;
import java.util.List;

/* loaded from: classes5.dex */
public final class BeN {
    public final String A00;
    public final List<String> A01;
    public final boolean A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && getClass() == obj.getClass()) {
                BeN beN = (BeN) obj;
                if (this.A02 == beN.A02 && this.A01.equals(beN.A01)) {
                    String str = this.A00;
                    String str2 = beN.A00;
                    if (str != null) {
                        if (str.equals(str2)) {
                        }
                    } else if (str2 == null) {
                        return true;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public BeN() {
        this(Collections.EMPTY_LIST, null, false);
    }

    public final int hashCode() {
        return BV7.A0E(this.A01, this.A00, Boolean.valueOf(this.A02));
    }

    public final String toString() {
        StringBuilder sbA0x = C60O.A0x("CaptionsState{availableTextLanguages=");
        sbA0x.append(this.A01);
        sbA0x.append(", selectedTextLanguage='");
        sbA0x.append(this.A00);
        sbA0x.append("', isEnabled=");
        sbA0x.append(this.A02);
        return C8j3.A15(sbA0x);
    }

    public BeN(List<String> list, String str, boolean z) {
        this.A01 = BV4.A0t(list);
        this.A00 = str;
        this.A02 = z;
    }
}
