package X;

import com.meta.maps.display.camera.CameraPose;
import com.meta.maps.display.logging.SurfaceType;

/* loaded from: classes4.dex */
public final class ALE extends C06G {
    public final int A00;
    public final ALL A01;
    public final C9V6 A02;
    public final C9V4 A03;
    public final ALJ A04;
    public final CameraPose A05;
    public final SurfaceType A06;
    public final String A07;
    public final String A08;
    public final boolean A09;

    public ALE(ALL all, C9V6 c9v6, C9V4 c9v4, ALJ alj, CameraPose cameraPose, SurfaceType surfaceType, String str, String str2, int i, boolean z) {
        C7384Etj.A0Y(alj, 5);
        this.A02 = c9v6;
        this.A05 = cameraPose;
        this.A03 = c9v4;
        this.A01 = all;
        this.A09 = z;
        this.A04 = alj;
        this.A00 = i;
        this.A07 = str;
        this.A08 = str2;
        this.A06 = surfaceType;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ALE) {
                ALE ale = (ALE) obj;
                if (!C7384Etj.areEqual(this.A02, ale.A02) || !C7384Etj.areEqual(this.A05, ale.A05) || !C7384Etj.areEqual(this.A03, ale.A03) || !C7384Etj.areEqual(this.A01, ale.A01) || this.A09 != ale.A09 || !C7384Etj.areEqual(this.A04, ale.A04) || this.A00 != ale.A00 || !C7384Etj.areEqual(this.A07, ale.A07) || !C7384Etj.areEqual(this.A08, ale.A08) || this.A06 != ale.A06) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass005.A0G(this.A06, (((((AnonymousClass005.A0F(this.A04, C0KA.A01(AnonymousClass005.A0F(this.A01, AnonymousClass005.A0F(this.A03, (AnonymousClass005.A0E(this.A02) + AnonymousClass006.A0D(this.A05)) * 31)), this.A09)) + this.A00) * 31) + AnonymousClass006.A0G(this.A07)) * 31) + AnonymousClass005.A0H(this.A08)) * 31);
    }
}
