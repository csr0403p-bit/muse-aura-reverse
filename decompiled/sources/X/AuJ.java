package X;

import androidx.compose.ui.text.input.ImeAction;

/* loaded from: classes4.dex */
public final class AuJ {
    public static final AuJ A04 = new AuJ(null, -1, 0, -1);
    public final int A00;
    public final int A01;
    public final int A02;
    public final Boolean A03;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AuJ) {
                AuJ auJ = (AuJ) obj;
                if (this.A00 != auJ.A00 || !C7384Etj.areEqual(this.A03, auJ.A03) || this.A02 != auJ.A02 || this.A01 != auJ.A01) {
                }
            }
            return false;
        }
        return true;
    }

    public final AuI A00(boolean z) {
        AuI auI = AuI.A06;
        int i = this.A00;
        if (i == -1) {
            i = 0;
        }
        Boolean bool = this.A03;
        boolean zBooleanValue = bool != null ? bool.booleanValue() : true;
        int i2 = this.A02;
        if (i2 == 0) {
            i2 = 1;
        }
        int i3 = this.A01;
        if (i3 == -1) {
            i3 = 1;
        }
        return new AuI(C0874AGa.A02, i, i2, i3, z, zBooleanValue);
    }

    public final int hashCode() {
        return ((((((this.A00 * 31) + C60R.A01(this.A03)) * 31) + this.A02) * 31) + this.A01) * 31 * 31 * 31;
    }

    public final String toString() {
        StringBuilder sbA0x = C60O.A0x("KeyboardOptions(capitalization=");
        sbA0x.append((Object) AbstractC2123Ayo.A00(this.A00));
        sbA0x.append(", autoCorrectEnabled=");
        sbA0x.append(this.A03);
        sbA0x.append(", keyboardType=");
        sbA0x.append((Object) AbstractC2071Axm.A00(this.A02));
        sbA0x.append(", imeAction=");
        sbA0x.append((Object) ImeAction.A00(this.A01));
        sbA0x.append(", platformImeOptions=");
        sbA0x.append((Object) null);
        sbA0x.append("showKeyboardOnFocus=");
        sbA0x.append((Object) null);
        sbA0x.append(", hintLocales=");
        return AnonymousClass007.A0Z(null, sbA0x);
    }

    public AuJ(Boolean bool, int i, int i2, int i3) {
        this.A00 = i;
        this.A03 = bool;
        this.A02 = i2;
        this.A01 = i3;
    }
}
