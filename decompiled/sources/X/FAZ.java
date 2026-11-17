package X;

/* loaded from: classes6.dex */
public final class FAZ extends FAY {
    public final C7631F7o A00;
    public final boolean A01;
    public final Hr8 A02;
    public final String A03;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof FAZ) {
                FAZ faz = (FAZ) obj;
                if (!this.A03.equals(faz.A03) || !this.A00.equals(faz.A00) || !this.A02.equals(faz.A02) || this.A01 != faz.A01) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return C0KA.A00(AnonymousClass005.A0F(this.A02, AnonymousClass005.A0F(this.A00, AnonymousClass001.A0G(this.A03))), this.A01);
    }

    public final String toString() {
        String str = this.A03;
        C7631F7o c7631F7o = this.A00;
        Hr8 hr8 = this.A02;
        boolean z = this.A01;
        StringBuilder sbA0x = C3cI.A0x("ParseResult(key=", str);
        sbA0x.append(", result=");
        sbA0x.append(c7631F7o);
        sbA0x.append(", summary=");
        sbA0x.append(hr8);
        return C8j5.A0W(", isCompleteResponse=", sbA0x, z);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FAZ(C7631F7o c7631F7o, Hr8 hr8, String str, boolean z) {
        super(hr8, str, z);
        AnonymousClass003.A0v(str, hr8);
        this.A03 = str;
        this.A00 = c7631F7o;
        this.A02 = hr8;
        this.A01 = z;
    }
}
