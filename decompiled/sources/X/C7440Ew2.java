package X;

import com.facebook.aura.ccv.nativeflow.ui.HatchCcvLoggingKt;

/* renamed from: X.Ew2, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C7440Ew2 extends C06G {
    public final Integer A00;

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof C7440Ew2) && this.A00 == ((C7440Ew2) obj).A00);
    }

    public final int hashCode() {
        String str;
        int iIntValue = this.A00.intValue();
        switch (iIntValue) {
            case 1:
                str = "MIDDLE_QUALITY";
                break;
            case 2:
                str = "HIGH_QUALITY";
                break;
            default:
                str = "DEFAULT_LOW";
                break;
        }
        return ((((((str.hashCode() + iIntValue) * 31) + 1237) * 31) + 1237) * 31 * 31 * 31) + 1237;
    }

    public final String toString() {
        String str;
        Integer num = this.A00;
        StringBuilder sbA0x = C60O.A0x("FOSAbrQualitySelectorConfig(selectionMode=");
        if (num != null) {
            switch (num.intValue()) {
                case 1:
                    str = "MIDDLE_QUALITY";
                    break;
                case 2:
                    str = "HIGH_QUALITY";
                    break;
                default:
                    str = "DEFAULT_LOW";
                    break;
            }
        } else {
            str = HatchCcvLoggingKt.NO_POSTAL_FIELD;
        }
        sbA0x.append(str);
        sbA0x.append(", enableAdaptiveVideoSelectorInBasicMode=");
        sbA0x.append(false);
        sbA0x.append(", getLowestQualityAboveThreshold=");
        sbA0x.append(false);
        sbA0x.append(", threshold=");
        sbA0x.append(0);
        sbA0x.append(", qpl=");
        sbA0x.append((Object) null);
        return C8j5.A0W(", enableQualityLogging=", sbA0x, false);
    }

    public C7440Ew2(Integer num) {
        this.A00 = num;
    }
}
