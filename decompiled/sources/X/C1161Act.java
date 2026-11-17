package X;

import java.util.List;
import java.util.Map;
import kotlin.Unit;

/* renamed from: X.Act, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1161Act implements InterfaceC1134Abi, C2A9 {
    public final float A00;
    public final float A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final int A05;
    public final int A06;
    public final int A07;
    public final long A08;
    public final EnumC1108AYu A09;
    public final C1160Acs A0A;
    public final InterfaceC1134Abi A0B;
    public final AXN A0C;
    public final List<C1160Acs> A0D;
    public final C3UX A0E;
    public final boolean A0F;
    public final boolean A0G;
    public final boolean A0H;

    /* JADX WARN: Removed duplicated region for block: B:30:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00e3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C1161Act A00(int r37, boolean r38) {
        /*
            Method dump skipped, instructions count: 288
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1161Act.A00(int, boolean):X.Act");
    }

    @Override // X.InterfaceC1134Abi
    public final Map<AbstractC1493Ak0, Integer> ACJ() {
        return this.A0B.ACJ();
    }

    @Override // X.InterfaceC1134Abi
    public final G0U<InterfaceC1620Amr, Unit> AJs() {
        return this.A0B.AJs();
    }

    @Override // X.C2A9
    public final long AMh() {
        InterfaceC1134Abi interfaceC1134Abi = this.A0B;
        return C8j3.A0T(interfaceC1134Abi.getWidth(), interfaceC1134Abi.getHeight());
    }

    @Override // X.InterfaceC1134Abi
    public final void AXv() {
        this.A0B.AXv();
    }

    @Override // X.InterfaceC1134Abi
    public final int getHeight() {
        return this.A0B.getHeight();
    }

    @Override // X.InterfaceC1134Abi
    public final int getWidth() {
        return this.A0B.getWidth();
    }

    /* JADX WARN: Incorrect types in method signature: (LX/Acs;IZFLX/Abi;FZLX/3UX;LX/AXN;JLjava/util/List<LX/Acs;>;IIIZLX/AYu;II)V */
    public C1161Act(EnumC1108AYu enumC1108AYu, C1160Acs c1160Acs, InterfaceC1134Abi interfaceC1134Abi, AXN axn, List list, C3UX c3ux, float f, float f2, int i, int i2, int i3, int i4, int i5, int i6, long j, boolean z, boolean z2, boolean z3) {
        this.A0A = c1160Acs;
        this.A03 = i;
        this.A0F = z;
        this.A00 = f;
        this.A0B = interfaceC1134Abi;
        this.A01 = f2;
        this.A0H = z2;
        this.A0E = c3ux;
        this.A0C = axn;
        this.A08 = j;
        this.A0D = list;
        this.A07 = i2;
        this.A06 = i3;
        this.A05 = i4;
        this.A0G = z3;
        this.A09 = enumC1108AYu;
        this.A02 = i5;
        this.A04 = i6;
    }
}
