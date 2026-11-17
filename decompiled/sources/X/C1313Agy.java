package X;

import java.util.List;

/* renamed from: X.Agy, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1313Agy {
    public final float A00;
    public final float A01;
    public final int A02;
    public final long A03;
    public final long A04;
    public final long A05;
    public final long A06;
    public final long A07;
    public final long A08;
    public final long A09;
    public final List<C1301Agm> A0A;
    public final boolean A0B;
    public final boolean A0C;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C1313Agy) {
                C1313Agy c1313Agy = (C1313Agy) obj;
                if (this.A03 != c1313Agy.A03 || this.A09 != c1313Agy.A09 || this.A07 != c1313Agy.A07 || this.A06 != c1313Agy.A06 || this.A0C != c1313Agy.A0C || Float.compare(this.A00, c1313Agy.A00) != 0 || this.A02 != c1313Agy.A02 || this.A0B != c1313Agy.A0B || !this.A0A.equals(c1313Agy.A0A) || this.A08 != c1313Agy.A08 || Float.compare(this.A01, c1313Agy.A01) != 0 || this.A05 != c1313Agy.A05 || this.A04 != c1313Agy.A04) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return C8j4.A0B(this.A04, AnonymousClass006.A06(this.A05, AnonymousClass005.A02(AnonymousClass006.A06(this.A08, AnonymousClass005.A0F(this.A0A, C0KA.A01((AnonymousClass005.A02(C0KA.A01(AnonymousClass006.A06(this.A06, AnonymousClass006.A06(this.A07, AnonymousClass006.A06(this.A09, AnonymousClass005.A07(this.A03)))), this.A0C), this.A00) + this.A02) * 31, this.A0B))), this.A01)));
    }

    public final String toString() {
        StringBuilder sbA0x = C60O.A0x("PointerInputEventData(id=");
        sbA0x.append((Object) C2Uh.A00(this.A03));
        sbA0x.append(", uptime=");
        sbA0x.append(this.A09);
        sbA0x.append(", positionOnScreen=");
        AWx.A0E(this.A07, sbA0x);
        sbA0x.append(", position=");
        AWx.A0E(this.A06, sbA0x);
        sbA0x.append(", down=");
        sbA0x.append(this.A0C);
        sbA0x.append(", pressure=");
        sbA0x.append(this.A00);
        sbA0x.append(", type=");
        sbA0x.append((Object) C1312Agx.A00(this.A02));
        sbA0x.append(", activeHover=");
        sbA0x.append(this.A0B);
        sbA0x.append(", historical=");
        sbA0x.append(this.A0A);
        sbA0x.append(", scrollDelta=");
        AWx.A0E(this.A08, sbA0x);
        sbA0x.append(", scaleGestureFactor=");
        sbA0x.append(this.A01);
        sbA0x.append(", panGestureOffset=");
        AWx.A0E(this.A05, sbA0x);
        sbA0x.append(", originalEventPosition=");
        return AnonymousClass007.A0Z(AWx.A0D(this.A04), sbA0x);
    }

    /* JADX WARN: Incorrect types in method signature: (JJJJZFIZLjava/util/List<LX/Agm;>;JFJJ)V */
    public C1313Agy(List list, float f, float f2, int i, long j, long j2, long j3, long j4, long j5, long j6, long j7, boolean z, boolean z2) {
        this.A03 = j;
        this.A09 = j2;
        this.A07 = j3;
        this.A06 = j4;
        this.A0C = z;
        this.A00 = f;
        this.A02 = i;
        this.A0B = z2;
        this.A0A = list;
        this.A08 = j5;
        this.A01 = f2;
        this.A05 = j6;
        this.A04 = j7;
    }
}
