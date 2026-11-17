package X;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import com.facebook.aura.conversation.offline.HatchPersistedMessageJson;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes6.dex */
public final class FKK {
    public final float A00;
    public final float A01;
    public final float A02;
    public final int A03;
    public final Drawable A04;
    public final FKR A05;
    public final FE6 A06;
    public final Integer A07;
    public final List<Float> A08;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof FKK) {
                FKK fkk = (FKK) obj;
                if (!C7384Etj.areEqual(this.A04, fkk.A04) || this.A03 != fkk.A03 || Float.compare(this.A01, fkk.A01) != 0 || Float.compare(this.A02, fkk.A02) != 0 || this.A07 != fkk.A07 || !C7384Etj.areEqual(this.A05, fkk.A05) || !C7384Etj.areEqual(this.A06, fkk.A06) || !C7384Etj.areEqual(this.A08, fkk.A08) || Float.compare(this.A00, fkk.A00) != 0) {
                }
            }
            return false;
        }
        return true;
    }

    public final boolean A00() {
        FE6 fe6 = this.A06;
        if (fe6 != null) {
            ADq aDqA1C = AbstractC7607F5u.A1C(0, 3);
            if (!(aDqA1C instanceof Collection) || !C3cG.A1N(aDqA1C)) {
                Iterator<Integer> it = aDqA1C.iterator();
                while (it.hasNext()) {
                    int iA00 = ((BNt) it).A00();
                    if (fe6.A00.A00[iA00] > 0.0f && Color.alpha(fe6.A01[iA00]) != 0) {
                        return true;
                    }
                }
            }
        } else if (this.A01 != 0.0f && this.A03 != 0) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        String str;
        int iA02 = AnonymousClass005.A02(AnonymousClass005.A02(((AnonymousClass006.A0D(this.A04) * 31) + this.A03) * 31, this.A01), this.A02);
        int iIntValue = this.A07.intValue();
        switch (iIntValue) {
            case 1:
                str = "SHARK_FIN";
                break;
            case 2:
                str = HatchPersistedMessageJson.UNSEND_STATUS_NONE;
                break;
            default:
                str = "DEFAULT";
                break;
        }
        return C8j4.A06((((((((iA02 + str.hashCode() + iIntValue) * 31) + AnonymousClass006.A0D(this.A05)) * 31) + AnonymousClass006.A0D(this.A06)) * 31) + C3cH.A02(this.A08)) * 31, this.A00);
    }

    public final String toString() {
        String str;
        Drawable drawable = this.A04;
        int i = this.A03;
        float f = this.A01;
        float f2 = this.A02;
        Integer num = this.A07;
        FKR fkr = this.A05;
        FE6 fe6 = this.A06;
        List<Float> list = this.A08;
        float f3 = this.A00;
        StringBuilder sbA0f = C3cG.A0f(drawable, "TooltipAttributes(backgroundDrawable=");
        sbA0f.append(", borderColor=");
        sbA0f.append(i);
        sbA0f.append(", borderWidth=");
        sbA0f.append(f);
        sbA0f.append(", cornerRadius=");
        sbA0f.append(f2);
        sbA0f.append(", arrowType=");
        switch (num.intValue()) {
            case 1:
                str = "SHARK_FIN";
                break;
            case 2:
                str = HatchPersistedMessageJson.UNSEND_STATUS_NONE;
                break;
            default:
                str = "DEFAULT";
                break;
        }
        sbA0f.append(str);
        sbA0f.append(", shadow=");
        sbA0f.append(fkr);
        sbA0f.append(", perSideBorders=");
        sbA0f.append(fe6);
        sbA0f.append(", borderDashIntervals=");
        sbA0f.append(list);
        sbA0f.append(", borderDashPhase=");
        sbA0f.append(f3);
        return BV7.A10(sbA0f);
    }

    public FKK(Drawable drawable, FKR fkr, FE6 fe6, Integer num, List list, float f, float f2, float f3, int i) {
        this.A04 = drawable;
        this.A03 = i;
        this.A01 = f;
        this.A02 = f2;
        this.A07 = num;
        this.A05 = fkr;
        this.A06 = fe6;
        this.A08 = list;
        this.A00 = f3;
    }
}
