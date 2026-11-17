package X;

/* renamed from: X.Dpm, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC5802Dpm {
    public final long A00;
    public final long A01;
    public final boolean A02;
    public final boolean A03;
    public final boolean A04;
    public final boolean A05;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AbstractC5802Dpm) {
                AbstractC5802Dpm abstractC5802Dpm = (AbstractC5802Dpm) obj;
                if (this.A01 != abstractC5802Dpm.A01 || this.A00 != abstractC5802Dpm.A00 || this.A04 != abstractC5802Dpm.A04 || this.A03 != abstractC5802Dpm.A03 || this.A05 != abstractC5802Dpm.A05 || this.A02 != abstractC5802Dpm.A02) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((((((AnonymousClass006.A06(this.A00, AnonymousClass005.A07(this.A01)) + (this.A04 ? 1 : 0)) * 31) + (this.A03 ? 1 : 0)) * 31) + (this.A05 ? 1 : 0)) * 31) + (this.A02 ? 1 : 0);
    }

    public AbstractC5802Dpm(C5881DrH c5881DrH) {
        long j = c5881DrH.A01;
        long j2 = c5881DrH.A00;
        this.A01 = j;
        this.A00 = j2;
        this.A04 = c5881DrH.A04;
        this.A03 = c5881DrH.A03;
        this.A05 = c5881DrH.A05;
        this.A02 = c5881DrH.A02;
    }
}
