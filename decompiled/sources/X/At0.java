package X;

import androidx.compose.foundation.text.input.internal.TransformedTextFieldState;
import java.util.List;

/* loaded from: classes4.dex */
public final class At0 implements CharSequence {
    public final long A00;
    public final Au3 A01;
    public final CharSequence A02;
    public final List<C1733ApU<C1OS>> A03;
    public final HxE<C1867Ash, Au3> A04;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && getClass() == obj.getClass()) {
                At0 at0 = (At0) obj;
                if (this.A00 == at0.A00 && C7384Etj.areEqual(this.A01, at0.A01) && C7384Etj.areEqual(this.A04, at0.A04) && C7384Etj.areEqual(this.A03, at0.A03)) {
                    if (!AbstractC2159Azp.A11(this.A02, at0.A02)) {
                    }
                }
            }
            return false;
        }
        return true;
    }

    @Override // java.lang.CharSequence
    public final /* bridge */ char charAt(int i) {
        return this.A02.charAt(i);
    }

    public final int hashCode() {
        int iA06 = AnonymousClass006.A06(this.A00, AnonymousClass005.A0E(this.A02));
        Au3 au3 = this.A01;
        return ((((iA06 + (au3 != null ? C3cG.A02(au3.A00) : 0)) * 31) + C60R.A01(this.A04)) * 31) + C8j4.A0E(this.A03, 0);
    }

    @Override // java.lang.CharSequence
    public final /* bridge */ int length() {
        return this.A02.length();
    }

    @Override // java.lang.CharSequence
    public final CharSequence subSequence(int i, int i2) {
        return this.A02.subSequence(i, i2);
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        return this.A02.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public At0(Au3 au3, CharSequence charSequence, List list, HxE hxE, long j) {
        this.A03 = list;
        CharSequence charSequence2 = charSequence;
        this.A02 = charSequence instanceof At0 ? ((At0) charSequence2).A02 : charSequence2;
        this.A00 = AbstractC1815ArZ.A01(j, charSequence.length());
        this.A01 = au3 != null ? C8j3.A0j(AbstractC1815ArZ.A01(au3.A00, charSequence.length())) : null;
        this.A04 = hxE != null ? C3cG.A0r(hxE.first, C8j3.A0j(AbstractC1815ArZ.A01(((Au3) hxE.second).A00, charSequence.length()))) : null;
    }

    public static int A00(TransformedTextFieldState transformedTextFieldState) {
        return transformedTextFieldState.A07().length();
    }

    public static long A01(TransformedTextFieldState transformedTextFieldState) {
        return transformedTextFieldState.A07().A00;
    }

    public static String A02(At0 at0, long j) {
        return at0.subSequence(Au3.A02(j), Au3.A01(j)).toString();
    }

    public static boolean A03(TransformedTextFieldState transformedTextFieldState) {
        return Au3.A04(transformedTextFieldState.A07().A00);
    }
}
