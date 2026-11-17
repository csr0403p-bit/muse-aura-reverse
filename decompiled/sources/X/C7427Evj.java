package X;

/* renamed from: X.Evj, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C7427Evj {
    public final long A00;
    public final long A01;
    public final long A02;
    public final long A03;
    public final Integer A04;

    public final String toString() {
        String str;
        StringBuilder sbA0x = C60O.A0x("reason:");
        switch (this.A04.intValue()) {
            case 0:
                str = "unknown";
                break;
            case 1:
                str = "paused";
                break;
            case 2:
                str = "buffer_draining_above_low_watermark";
                break;
            case 3:
                str = "above_high_watermark";
                break;
            default:
                str = "target_buffer_size_reached";
                break;
        }
        sbA0x.append(str);
        sbA0x.append(", targetBufferSize:");
        sbA0x.append(this.A02);
        sbA0x.append(", totalBytesAllocated:");
        sbA0x.append(this.A03);
        sbA0x.append(", lowWatermarkUs:");
        sbA0x.append(this.A01);
        sbA0x.append(", highWatermarkUs:");
        return BV4.A0m(sbA0x, this.A00);
    }

    public C7427Evj(Integer num, long j, long j2, long j3, long j4) {
        this.A04 = num;
        this.A02 = j;
        this.A03 = j2;
        this.A01 = j3;
        this.A00 = j4;
    }
}
