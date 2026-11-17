package X;

import com.google.firebase.encoders.EncodingException;

/* renamed from: X.Cxf, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C4506Cxf implements CHI {
    public C2580BeF A00;
    public boolean A01 = false;
    public boolean A02 = false;
    public final C4504Cxd A03;

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
        this.A03.A05(this.A00, z ? 1 : 0, this.A02);
    }

    public C4506Cxf(C4504Cxd c4504Cxd) {
        this.A03 = c4504Cxd;
    }
}
