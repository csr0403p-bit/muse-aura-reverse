package X;

/* renamed from: X.DnX, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C5690DnX {
    public final double A00;
    public final double A01;
    public final C6154Dwx A02;
    public final C5731DoQ A03;
    public final C5713Dnw A04;
    public final Integer A05;
    public final boolean A06;

    public final String toString() {
        String str;
        boolean zA02 = AbstractC5655Dmj.A02(this.A02);
        StringBuilder sbA0x = C60O.A0x("{");
        sbA0x.append(zA02 ? "audio, " : "video, ");
        sbA0x.append("bitrate=");
        C5713Dnw c5713Dnw = this.A04;
        sbA0x.append(c5713Dnw.A04);
        sbA0x.append(", risk=");
        sbA0x.append(c5713Dnw);
        sbA0x.append(", reward=");
        sbA0x.append(this.A03);
        sbA0x.append(", risk thr=");
        sbA0x.append(this.A01);
        sbA0x.append(" (");
        switch (this.A05.intValue()) {
            case 0:
                str = "VERY_CONSERVATIVE";
                break;
            case 1:
                str = "CONSERVATIVE";
                break;
            case 2:
                str = "NORMAL";
                break;
            case 3:
                str = "AGGRESSIVE";
                break;
            default:
                str = "VERY_AGGRESSIVE";
                break;
        }
        sbA0x.append(str);
        sbA0x.append("), ratio=");
        sbA0x.append(this.A00);
        sbA0x.append(this.A06 ? ", too risky" : "");
        return C8j3.A15(sbA0x);
    }

    public C5690DnX(C6154Dwx c6154Dwx, C5731DoQ c5731DoQ, C5713Dnw c5713Dnw, Integer num, double d, double d2, boolean z) {
        this.A02 = c6154Dwx;
        this.A04 = c5713Dnw;
        this.A03 = c5731DoQ;
        this.A00 = d;
        this.A05 = num;
        this.A01 = d2;
        this.A06 = z;
    }
}
