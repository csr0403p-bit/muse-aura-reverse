package X;

import com.google.android.play.core.install.InstallState;

/* loaded from: classes5.dex */
public final class CK6 extends InstallState {
    public final int A00;
    public final int A01;
    public final long A02;
    public final long A03;
    public final String A04;

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof InstallState) {
                CK6 ck6 = (CK6) ((InstallState) obj);
                if (this.A00 != ck6.A00 || this.A02 != ck6.A02 || this.A03 != ck6.A03 || this.A01 != ck6.A01 || !this.A04.equals(ck6.A04)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i = this.A00 ^ 1000003;
        long j = this.A02;
        long j2 = this.A03;
        return (((((((i * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ this.A01) * 1000003) ^ this.A04.hashCode();
    }

    public final String toString() {
        int i = this.A00;
        long j = this.A02;
        long j2 = this.A03;
        int i2 = this.A01;
        String str = this.A04;
        StringBuilder sbA0y = C60O.A0y("InstallState{installStatus=", i);
        sbA0y.append(", bytesDownloaded=");
        sbA0y.append(j);
        sbA0y.append(", totalBytesToDownload=");
        sbA0y.append(j2);
        sbA0y.append(", installErrorCode=");
        sbA0y.append(i2);
        sbA0y.append(", packageName=");
        sbA0y.append(str);
        return BV7.A11(sbA0y);
    }

    public CK6(String str, int i, int i2, long j, long j2) {
        this.A00 = i;
        this.A02 = j;
        this.A03 = j2;
        this.A01 = i2;
        if (str == null) {
            throw BV4.A0a("Null packageName");
        }
        this.A04 = str;
    }
}
