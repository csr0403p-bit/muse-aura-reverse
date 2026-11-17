package X;

import com.facebook.aura.confidentialvm.vmswitch.CvmMigrationStatusJson;

/* loaded from: classes5.dex */
public final class C1R extends C06G {
    public final int A00;
    public final long A01;
    public final long A02;
    public final long A03;
    public final Integer A04;
    public final Integer A05;
    public final String A06;
    public final boolean A07;

    public C1R(Integer num, Integer num2, String str, int i, long j, long j2, long j3) {
        C7384Etj.A0Y(str, 0);
        this.A06 = str;
        this.A05 = num;
        this.A03 = j;
        this.A02 = j2;
        this.A01 = j3;
        this.A00 = i;
        this.A04 = num2;
        this.A07 = true;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C1R) {
                C1R c1r = (C1R) obj;
                if (!C7384Etj.areEqual(this.A06, c1r.A06) || this.A05 != c1r.A05 || this.A03 != c1r.A03 || this.A02 != c1r.A02 || this.A01 != c1r.A01 || this.A00 != c1r.A00 || this.A04 != c1r.A04 || this.A07 != c1r.A07) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        String str;
        String str2;
        int iA0G = AnonymousClass001.A0G(this.A06);
        int iIntValue = this.A05.intValue();
        switch (iIntValue) {
            case 1:
                str = "TTL_EVICTION";
                break;
            case 2:
                str = "API_EVICTION";
                break;
            case 3:
                str = "USER_DELETED";
                break;
            case 4:
                str = "CONTENT_EXPIRED";
                break;
            case 5:
                str = "CONTENT_INVALIDATED";
                break;
            case 6:
                str = "FEED_CACHE_PURGE";
                break;
            case 7:
                str = "STALE_CLEANUP";
                break;
            case 8:
                str = "SEEN";
                break;
            case 9:
                str = "DOWNLOAD_FAILED";
                break;
            case 10:
                str = "OTHER";
                break;
            default:
                str = "LRU_EVICTION";
                break;
        }
        int iA06 = (AnonymousClass006.A06(this.A01, AnonymousClass006.A06(this.A02, AnonymousClass006.A06(this.A03, (iA0G + str.hashCode() + iIntValue) * 31))) + this.A00) * 31;
        int iIntValue2 = this.A04.intValue();
        switch (iIntValue2) {
            case 1:
                str2 = "QUEUED";
                break;
            case 2:
                str2 = "PREPARING";
                break;
            case 3:
                str2 = "DOWNLOADING";
                break;
            case 4:
                str2 = "PAUSED";
                break;
            case 5:
                str2 = "COMPLETED";
                break;
            case 6:
                str2 = CvmMigrationStatusJson.STAGE_FAILED;
                break;
            case 7:
                str2 = "EVICTED";
                break;
            case 8:
                str2 = "CANCELLED";
                break;
            default:
                str2 = "UNKNOWN";
                break;
        }
        return C0KA.A01((iA06 + str2.hashCode() + iIntValue2) * 31, this.A07);
    }
}
