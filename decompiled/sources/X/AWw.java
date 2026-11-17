package X;

/* loaded from: classes4.dex */
public final class AWw {
    public final long A00;
    public final AWv A01;
    public final Integer A02;
    public final boolean A03;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AWw) {
                AWw aWw = (AWw) obj;
                if (this.A01 != aWw.A01 || this.A00 != aWw.A00 || this.A02 != aWw.A02 || this.A03 != aWw.A03) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        String str;
        int iA00 = C60R.A00(this.A00, AnonymousClass005.A0E(this.A01));
        int iIntValue = this.A02.intValue();
        switch (iIntValue) {
            case 0:
                str = "Left";
                break;
            case 1:
                str = "Middle";
                break;
            default:
                str = "Right";
                break;
        }
        return C0KA.A00((iA00 + str.hashCode() + iIntValue) * 31, this.A03);
    }

    public final String toString() {
        String str;
        StringBuilder sbA0x = C60O.A0x("SelectionHandleInfo(handle=");
        sbA0x.append(this.A01);
        sbA0x.append(", position=");
        AWx.A0E(this.A00, sbA0x);
        sbA0x.append(", anchor=");
        switch (this.A02.intValue()) {
            case 0:
                str = "Left";
                break;
            case 1:
                str = "Middle";
                break;
            default:
                str = "Right";
                break;
        }
        sbA0x.append(str);
        sbA0x.append(", visible=");
        sbA0x.append(this.A03);
        return AnonymousClass006.A0z(sbA0x);
    }

    public AWw(AWv aWv, Integer num, long j, boolean z) {
        this.A01 = aWv;
        this.A00 = j;
        this.A02 = num;
        this.A03 = z;
    }
}
