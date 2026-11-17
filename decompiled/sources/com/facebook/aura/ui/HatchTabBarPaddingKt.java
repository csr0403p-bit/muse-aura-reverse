package com.facebook.aura.ui;

import X.AXN;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.BFM;
import X.BNH;
import X.BRg;
import X.C1Ny;
import X.C7384Etj;

/* loaded from: classes.dex */
public abstract class HatchTabBarPaddingKt {
    public static final BRg hatchTabBarPadding(BRg bRg, BFM bfm, int i) {
        C7384Etj.A0Y(bRg, 0);
        final float fHatchTabBarPaddingDp = hatchTabBarPaddingDp(bfm, 0);
        return BNH.A00(new C1Ny(fHatchTabBarPaddingDp) { // from class: X.1DJ
            public final float A00;

            @Override // X.C1Ny
            public final int AH1(AXN axn, EnumC1820Arj enumC1820Arj) {
                return axn.Abr(0.0f);
            }

            @Override // X.C1Ny
            public final int AJo(AXN axn, EnumC1820Arj enumC1820Arj) {
                return axn.Abr(0.0f);
            }

            @Override // X.C1Ny
            public final int ALn(AXN axn) {
                return axn.Abr(0.0f);
            }

            public final boolean equals(Object obj) {
                if (this != obj) {
                    if (obj instanceof C1DJ) {
                        C1DJ c1dj = (C1DJ) obj;
                        if (!C1DG.A08(0.0f, 0.0f) || !C1DG.A08(this.A00, c1dj.A00)) {
                        }
                    }
                    return false;
                }
                return true;
            }

            public final int hashCode() {
                int iFloatToIntBits = Float.floatToIntBits(0.0f);
                return (((((iFloatToIntBits * 31) + iFloatToIntBits) * 31) + iFloatToIntBits) * 31) + Float.floatToIntBits(this.A00);
            }

            @Override // X.C1Ny
            public final int ACy(AXN axn) {
                return axn.Abr(this.A00);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("Insets(left=");
                C1DG.A07(sb, 0.0f);
                sb.append(", top=");
                C1DG.A07(sb, 0.0f);
                sb.append(", right=");
                C1DG.A07(sb, 0.0f);
                sb.append(", bottom=");
                return AnonymousClass007.A0Z(C1DG.A05(this.A00), sb);
            }

            {
                this.A00 = fHatchTabBarPaddingDp;
            }
        }, bRg);
    }

    public static final BRg hatchTabImePadding(BRg bRg, boolean z, BFM bfm, int i) {
        float fHatchTabBarPaddingDp;
        C7384Etj.A0Y(bRg, 0);
        if (z) {
            bfm.AgE(1547251958);
            fHatchTabBarPaddingDp = hatchTabBarPaddingDp(bfm, 0);
            AnonymousClass001.A1D(bfm);
        } else {
            AnonymousClass003.A0l(bfm, 1547252898);
            fHatchTabBarPaddingDp = 0.0f;
        }
        return m2329hatchTabImePaddingziNgDLE(bRg, fHatchTabBarPaddingDp, bfm, i & 14);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* renamed from: hatchTabImePadding-ziNgDLE, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.BRg m2329hatchTabImePaddingziNgDLE(X.BRg r5, float r6, X.BFM r7, int r8) {
        /*
            r0 = 0
            X.C7384Etj.A0Y(r5, r0)
            X.Apg r0 = X.C1743Apg.A01(r7)
            X.Ape r4 = r0.A02
            boolean r3 = r7.A65(r4)
            r0 = r8 & 112(0x70, float:1.57E-43)
            r0 = r0 ^ 48
            r2 = 32
            if (r0 <= r2) goto L1c
            boolean r0 = r7.A62(r6)
            if (r0 != 0) goto L21
        L1c:
            r0 = r8 & 48
            r1 = 0
            if (r0 != r2) goto L22
        L21:
            r1 = 1
        L22:
            r1 = r1 | r3
            java.lang.Object r0 = r7.AaT()
            if (r1 != 0) goto L2d
            java.lang.Object r1 = X.C78N.A00
            if (r0 != r1) goto L35
        L2d:
            com.facebook.aura.ui.HatchTabBarPaddingKt$hatchTabImePadding$1$1 r0 = new com.facebook.aura.ui.HatchTabBarPaddingKt$hatchTabImePadding$1$1
            r0.<init>(r4, r6)
            r7.Ai0(r0)
        L35:
            X.G0W r0 = (X.G0W) r0
            X.BRg r0 = X.C3UC.A00(r5, r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.ui.HatchTabBarPaddingKt.m2329hatchTabImePaddingziNgDLE(X.BRg, float, X.BFM, int):X.BRg");
    }

    public static final float hatchTabBarPaddingDp(BFM bfm, int i) {
        AXN axnA0Y = AnonymousClass002.A0Y(bfm);
        bfm.AgE(1693245975);
        float fA00 = AnonymousClass005.A00(bfm, HatchWindowGeometryKt.LocalHatchWindowGeometry, axnA0Y);
        AnonymousClass002.A19(bfm);
        return fA00 + 60.0f;
    }
}
