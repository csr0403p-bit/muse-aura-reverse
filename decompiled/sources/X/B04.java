package X;

import com.facebook.aura.bloks.fonts.AuraTypefaceCreatorKt;

/* loaded from: classes4.dex */
public final class B04 implements B0G {
    public final int A00;

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof B04) && this.A00 == ((B04) obj).A00);
    }

    @Override // X.B0G
    public final String ACh() {
        return AuraTypefaceCreatorKt.WEIGHT_AXIS;
    }

    @Override // X.B0G
    public final boolean AHw() {
        return false;
    }

    @Override // X.B0G
    public final float AhA(AXN axn) {
        return this.A00;
    }

    public final String toString() {
        StringBuilder sbA0x = C60O.A0x("FontVariation.Setting(axisName='");
        sbA0x.append(AuraTypefaceCreatorKt.WEIGHT_AXIS);
        sbA0x.append("', value=");
        return C8j5.A0X(sbA0x, this.A00);
    }

    public B04(int i) {
        this.A00 = i;
    }

    public final int hashCode() {
        return 113071012 + this.A00;
    }
}
