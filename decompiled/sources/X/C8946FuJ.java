package X;

import com.facebook.rp.platform.metaai.MediaConfiguration$WithPermissionCheck$2;
import kotlin.jvm.functions.Function0;

/* renamed from: X.FuJ, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8946FuJ extends GQX {
    public final Function0<Boolean> A00;
    public final G0U<HtJ<? super Boolean>, Object> A01;
    public final boolean A02;
    public final boolean A03;
    public final boolean A04;
    public final boolean A05;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C8946FuJ) {
                C8946FuJ c8946FuJ = (C8946FuJ) obj;
                if (this.A05 != c8946FuJ.A05 || this.A02 != c8946FuJ.A02 || this.A03 != c8946FuJ.A03 || this.A04 != c8946FuJ.A04 || !this.A00.equals(c8946FuJ.A00) || !this.A01.equals(c8946FuJ.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C8946FuJ() {
        boolean z = false;
        this(4095, z, z, z, z);
    }

    public final int hashCode() {
        return ((AnonymousClass005.A0F(this.A01, AnonymousClass005.A0F(this.A00, C0KA.A01(C0KA.A01(C0KA.A01((((((((C0KA.A02(this.A05) + 1237) * 31) + 1237) * 31) + 1237) * 31) + 1231) * 31, this.A02), this.A03), this.A04))) + 1237) * 31) + 1237;
    }

    public /* synthetic */ C8946FuJ(int i, boolean z, boolean z2, boolean z3, boolean z4) {
        boolean z5 = z2;
        boolean z6 = z3;
        boolean z7 = z4;
        boolean zA1P = AnonymousClass001.A1P(i, z);
        z5 = (i & 32) != 0 ? false : z5;
        z6 = (i & 64) != 0 ? false : z6;
        z7 = (i & 128) != 0 ? false : z7;
        C8472Feb c8472FebA00 = C8472Feb.A00(36);
        MediaConfiguration$WithPermissionCheck$2 mediaConfiguration$WithPermissionCheck$2 = new MediaConfiguration$WithPermissionCheck$2(null);
        super(zA1P, z5, z6, z7, false, true, false);
        this.A05 = zA1P;
        this.A02 = z5;
        this.A03 = z6;
        this.A04 = z7;
        this.A00 = c8472FebA00;
        this.A01 = mediaConfiguration$WithPermissionCheck$2;
    }
}
