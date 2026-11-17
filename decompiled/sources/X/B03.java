package X;

import com.facebook.aura.bloks.fonts.AuraTypefaceCreatorKt;

/* loaded from: classes4.dex */
public final class B03 implements B0G {
    public final long A00;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof B03) {
                long j = this.A00;
                long j2 = ((B03) obj).A00;
                C1813ArX[] c1813ArXArr = C1809ArT.A02;
                if (j == j2) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.B0G
    public final String ACh() {
        return AuraTypefaceCreatorKt.OPTICAL_SIZE_AXIS;
    }

    @Override // X.B0G
    public final boolean AHw() {
        return true;
    }

    @Override // X.B0G
    public final float AhA(AXN axn) {
        if (axn != null) {
            return C1809ArT.A00(this.A00) * axn.AFo();
        }
        throw C60O.A0i("density must not be null");
    }

    public final String toString() {
        StringBuilder sbA0x = C60O.A0x("FontVariation.Setting(axisName='");
        sbA0x.append(AuraTypefaceCreatorKt.OPTICAL_SIZE_AXIS);
        sbA0x.append("', value=");
        return AnonymousClass007.A0Z(C1809ArT.A02(this.A00), sbA0x);
    }

    public B03(long j) {
        this.A00 = j;
    }

    public final int hashCode() {
        long j = this.A00;
        C1813ArX[] c1813ArXArr = C1809ArT.A02;
        return 105961720 + ((int) (j ^ (j >>> 32)));
    }
}
