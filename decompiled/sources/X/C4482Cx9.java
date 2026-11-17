package X;

import com.google.firebase.encoders.EncodingException;

/* renamed from: X.Cx9, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C4482Cx9 implements CHI {
    public C2580BeF A00;
    public boolean A01 = false;
    public boolean A02 = false;
    public final C4481Cx6 A03;

    @Override // X.CHI
    public final void A3G(String str) {
        if (this.A01) {
            throw new EncodingException("Cannot encode a second value in the ValueEncoderContext");
        }
        this.A01 = true;
        this.A03.A06(this.A00, str, this.A02);
    }

    @Override // X.CHI
    public final void A3H(boolean z) {
        if (this.A01) {
            throw new EncodingException("Cannot encode a second value in the ValueEncoderContext");
        }
        this.A01 = true;
        C4481Cx6 c4481Cx6 = this.A03;
        C4481Cx6.A05(this.A00, c4481Cx6, z ? 1 : 0, this.A02);
    }

    public C4482Cx9(C4481Cx6 c4481Cx6) {
        this.A03 = c4481Cx6;
    }
}
