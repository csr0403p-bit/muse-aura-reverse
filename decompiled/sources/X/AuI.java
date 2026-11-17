package X;

import androidx.compose.ui.text.input.ImeAction;

/* loaded from: classes4.dex */
public final class AuI {
    public static final AuI A06 = new AuI(C0874AGa.A02, 0, 1, 1, false, true);
    public final int A00;
    public final int A01;
    public final int A02;
    public final C0874AGa A03;
    public final boolean A04;
    public final boolean A05;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AuI) {
                AuI auI = (AuI) obj;
                if (this.A05 != auI.A05 || this.A00 != auI.A00 || this.A04 != auI.A04 || this.A02 != auI.A02 || this.A01 != auI.A01 || !this.A03.equals(auI.A03)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass005.A0G(this.A03, (((C0KA.A01((C0KA.A02(this.A05) + this.A00) * 31, this.A04) + this.A02) * 31) + this.A01) * 31 * 31);
    }

    public final String toString() {
        StringBuilder sbA0x = C60O.A0x("ImeOptions(singleLine=");
        sbA0x.append(this.A05);
        sbA0x.append(", capitalization=");
        sbA0x.append((Object) AbstractC2123Ayo.A00(this.A00));
        sbA0x.append(", autoCorrect=");
        sbA0x.append(this.A04);
        sbA0x.append(", keyboardType=");
        sbA0x.append((Object) AbstractC2071Axm.A00(this.A02));
        sbA0x.append(", imeAction=");
        sbA0x.append((Object) ImeAction.A00(this.A01));
        C8j4.A1R(sbA0x, ", platformImeOptions=");
        sbA0x.append(", hintLocales=");
        return AnonymousClass007.A0Z(this.A03, sbA0x);
    }

    public AuI(C0874AGa c0874AGa, int i, int i2, int i3, boolean z, boolean z2) {
        this.A05 = z;
        this.A00 = i;
        this.A04 = z2;
        this.A02 = i2;
        this.A01 = i3;
        this.A03 = c0874AGa;
    }
}
