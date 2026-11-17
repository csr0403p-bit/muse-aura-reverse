package X;

import android.graphics.Path;
import android.graphics.RectF;

/* renamed from: X.Et9, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C7371Et9 extends C06G implements InterfaceC7430Evn {
    public final float A00;
    public final float A01;
    public final float A02;
    public final long A03;
    public final boolean A04;

    @Override // X.InterfaceC7430Evn
    public final void A4c(Path path, C7377EtL c7377EtL) {
        C7384Etj.A0Y(path, 0);
        long j = this.A03;
        float f = this.A01;
        HxE<Float, Float> hxEA00 = AbstractC7425Evf.A00(this.A02, this.A00, this.A04);
        float fA02 = AnonymousClass001.A02(hxEA00.first);
        float fA022 = AnonymousClass001.A02(hxEA00.second);
        float fA03 = AnonymousClass003.A03(j);
        float fA00 = AnonymousClass004.A00(j);
        path.arcTo(new RectF(fA03 - f, fA00 - f, fA03 + f, fA00 + f), fA02, fA022);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C7371Et9) {
                C7371Et9 c7371Et9 = (C7371Et9) obj;
                if (this.A03 != c7371Et9.A03 || Float.compare(this.A01, c7371Et9.A01) != 0 || Float.compare(this.A02, c7371Et9.A02) != 0 || Float.compare(this.A00, c7371Et9.A00) != 0 || this.A04 != c7371Et9.A04) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return C0KA.A00(AnonymousClass005.A02(AnonymousClass005.A02(AnonymousClass005.A02(C3cI.A01(this.A03), this.A01), this.A02), this.A00), this.A04);
    }

    public C7371Et9(float f, float f2, float f3, long j, boolean z) {
        this.A03 = j;
        this.A01 = f;
        this.A02 = f2;
        this.A00 = f3;
        this.A04 = z;
    }
}
