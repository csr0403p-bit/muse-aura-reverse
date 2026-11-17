package X;

import android.view.textclassifier.TextClassification;

/* renamed from: X.6Xb, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C6Xb {
    public final long A00;
    public final TextClassification A01;
    public final CharSequence A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C6Xb) {
                C6Xb c6Xb = (C6Xb) obj;
                if (!C7384Etj.areEqual(this.A02, c6Xb.A02) || this.A00 != c6Xb.A00 || !C7384Etj.areEqual(this.A01, c6Xb.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass005.A0G(this.A01, C60R.A00(this.A00, AnonymousClass005.A0E(this.A02)));
    }

    public final String toString() {
        StringBuilder sbA0x = C60O.A0x("TextClassificationResult(text=");
        sbA0x.append((Object) this.A02);
        sbA0x.append(BV3.A00(5));
        sbA0x.append((Object) Au3.A03(this.A00));
        sbA0x.append(", textClassification=");
        return AnonymousClass007.A0Z(this.A01, sbA0x);
    }

    public C6Xb(TextClassification textClassification, CharSequence charSequence, long j) {
        this.A02 = charSequence;
        this.A00 = j;
        this.A01 = textClassification;
    }
}
