package X;

import java.util.Arrays;

/* renamed from: X.GKz, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9483GKz extends GLK {
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final GL4 A04;
    public final C9479GKv A05;

    public final boolean equals(Object o) {
        if (!(o instanceof C9483GKz)) {
            return false;
        }
        C9483GKz c9483GKz = (C9483GKz) o;
        return c9483GKz.A00 == this.A00 && c9483GKz.A01 == this.A01 && c9483GKz.A02 == this.A02 && c9483GKz.A03 == this.A03 && c9483GKz.A05 == this.A05 && c9483GKz.A04 == this.A04;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{C9483GKz.class, Integer.valueOf(this.A00), Integer.valueOf(this.A01), Integer.valueOf(this.A02), Integer.valueOf(this.A03), this.A05, this.A04});
    }

    public final String toString() {
        StringBuilder sbA0x = C60O.A0x("AesCtrHmacAead Parameters (variant: ");
        sbA0x.append(this.A05);
        sbA0x.append(", hashType: ");
        AbstractC7608F5v.A1O(sbA0x, this.A04);
        sbA0x.append(this.A02);
        sbA0x.append("-byte IV, and ");
        sbA0x.append(this.A03);
        sbA0x.append("-byte tags, and ");
        sbA0x.append(this.A00);
        sbA0x.append("-byte AES key, and ");
        sbA0x.append(this.A01);
        return AnonymousClass001.A0v("-byte HMAC key)", sbA0x);
    }

    public C9483GKz(GL4 aesKeySizeBytes, C9479GKv hmacKeySizeBytes, int ivSizeBytes, int tagSizeBytes, int variant, int hashType) {
        this.A00 = ivSizeBytes;
        this.A01 = tagSizeBytes;
        this.A02 = variant;
        this.A03 = hashType;
        this.A05 = hmacKeySizeBytes;
        this.A04 = aesKeySizeBytes;
    }
}
