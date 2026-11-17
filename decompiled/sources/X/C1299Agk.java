package X;

import java.util.List;

/* renamed from: X.Agk, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1299Agk {
    public long A00 = 0;
    public C1299Agk A01;
    public List<C1301Agm> A02;
    public boolean A03;
    public boolean A04;
    public final float A05;
    public final float A06;
    public final int A07;
    public final long A08;
    public final long A09;
    public final long A0A;
    public final long A0B;
    public final long A0C;
    public final long A0D;
    public final long A0E;
    public final boolean A0F;
    public final boolean A0G;

    public final void A02() {
        C1299Agk c1299Agk = this.A01;
        if (c1299Agk != null) {
            c1299Agk.A02();
        } else {
            this.A03 = true;
            this.A04 = true;
        }
    }

    public final boolean A03() {
        C1299Agk c1299Agk = this.A01;
        return c1299Agk != null ? c1299Agk.A03() : this.A03 || this.A04;
    }

    public final String toString() {
        StringBuilder sbA0x = C60O.A0x("PointerInputChange(id=");
        sbA0x.append((Object) C2Uh.A00(this.A08));
        sbA0x.append(", uptimeMillis=");
        sbA0x.append(this.A0E);
        sbA0x.append(", position=");
        AWx.A0E(this.A0A, sbA0x);
        sbA0x.append(", pressed=");
        sbA0x.append(this.A0F);
        sbA0x.append(", pressure=");
        sbA0x.append(this.A05);
        sbA0x.append(", previousUptimeMillis=");
        sbA0x.append(this.A0C);
        sbA0x.append(", previousPosition=");
        AWx.A0E(this.A0B, sbA0x);
        sbA0x.append(", previousPressed=");
        sbA0x.append(this.A0G);
        sbA0x.append(", isConsumed=");
        sbA0x.append(A03());
        sbA0x.append(", type=");
        sbA0x.append((Object) C1312Agx.A00(this.A07));
        sbA0x.append(", historical=");
        Object obj = this.A02;
        if (obj == null) {
            obj = C0881AGi.A00;
        }
        sbA0x.append(obj);
        sbA0x.append(", scrollDelta=");
        AWx.A0E(this.A0D, sbA0x);
        sbA0x.append(", scaleFactor=");
        sbA0x.append(this.A06);
        sbA0x.append(", panOffset=");
        return AnonymousClass007.A0Z(AWx.A0D(this.A09), sbA0x);
    }

    public C1299Agk(float f, float f2, int i, long j, long j2, long j3, long j4, long j5, long j6, long j7, boolean z, boolean z2, boolean z3) {
        this.A08 = j;
        this.A0E = j2;
        this.A0A = j3;
        this.A0F = z;
        this.A05 = f;
        this.A0C = j4;
        this.A0B = j5;
        this.A0G = z2;
        this.A07 = i;
        this.A0D = j6;
        this.A06 = f2;
        this.A09 = j7;
        this.A03 = z3;
        this.A04 = z3;
    }

    public static void A00(List list, int i) {
        ((C1299Agk) list.get(i)).A02();
    }

    public static boolean A01(List list, int i) {
        return ((C1299Agk) list.get(i)).A03();
    }
}
