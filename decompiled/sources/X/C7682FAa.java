package X;

import com.instagram.common.bloks.payload.BloksComponentQueryResources;

/* renamed from: X.FAa, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7682FAa extends FAY {
    public final BloksComponentQueryResources A00;
    public final boolean A01;
    public final Hr8 A02;
    public final String A03;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C7682FAa) {
                C7682FAa c7682FAa = (C7682FAa) obj;
                if (!this.A03.equals(c7682FAa.A03) || !C7384Etj.areEqual(this.A00, c7682FAa.A00) || !this.A02.equals(c7682FAa.A02) || this.A01 != c7682FAa.A01) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return C0KA.A00(AnonymousClass005.A0F(this.A02, (AnonymousClass001.A0G(this.A03) + AnonymousClass006.A0D(this.A00)) * 31), this.A01);
    }

    public final String toString() {
        String str = this.A03;
        BloksComponentQueryResources bloksComponentQueryResources = this.A00;
        Hr8 hr8 = this.A02;
        boolean z = this.A01;
        StringBuilder sbA0x = C3cI.A0x("Resource(key=", str);
        sbA0x.append(", resources=");
        sbA0x.append(bloksComponentQueryResources);
        sbA0x.append(", summary=");
        sbA0x.append(hr8);
        return C8j5.A0W(", isCompleteResponse=", sbA0x, z);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7682FAa(Hr8 hr8, BloksComponentQueryResources bloksComponentQueryResources, String str, boolean z) {
        super(hr8, str, z);
        AnonymousClass003.A0v(str, hr8);
        this.A03 = str;
        this.A00 = bloksComponentQueryResources;
        this.A02 = hr8;
        this.A01 = z;
    }
}
