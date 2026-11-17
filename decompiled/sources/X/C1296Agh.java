package X;

import androidx.compose.foundation.gestures.DragGestureNode;
import com.facebook.aura.devices.pairing.LinkEncryptedPairingKt;
import kotlin.Unit;

/* renamed from: X.Agh, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1296Agh {
    public C1307Ags A02;
    public C1308Agt A03;
    public C1311Agw A04;
    public Ah2 A05;
    public AbstractC1318Ah4 A06;
    public C1300Agl A07;
    public C3UT A08;
    public final DragGestureNode A09;
    public long A01 = 9205357640488583168L;
    public final C1302Agn A0A = new C1302Agn();
    public final C1304Agp A0B = new C1304Agp();
    public long A00 = 0;

    public static final void A04(C1296Agh c1296Agh, C1298Agj c1298Agj, long j, long j2) {
        C1311Agw c1311Agw = c1296Agh.A04;
        if (c1311Agw == null) {
            c1311Agw = new C1311Agw();
            c1311Agw.A01 = null;
            c1311Agw.A00 = LinkEncryptedPairingKt.LINK_COUNTER_MAX;
            c1311Agw.A02 = false;
            c1296Agh.A04 = c1311Agw;
        }
        c1311Agw.A01 = c1298Agj;
        c1311Agw.A00 = j;
        C1300Agl c1300Agl = c1296Agh.A07;
        EnumC1108AYu enumC1108AYu = c1296Agh.A09.A05;
        if (c1300Agl == null) {
            c1296Agh.A07 = C1300Agl.A00(enumC1108AYu);
        } else {
            c1300Agl.A01 = enumC1108AYu;
            c1300Agl.A00 = j2;
        }
        c1311Agw.A02 = false;
        c1296Agh.A06 = c1311Agw;
    }

    public static final void A00(C1296Agh c1296Agh) {
        C1307Ags c1307Ags = c1296Agh.A02;
        if (c1307Ags == null) {
            Integer num = C79.A0C;
            c1307Ags = new C1307Ags();
            c1307Ags.A00 = num;
            c1307Ags.A01 = false;
            c1296Agh.A02 = c1307Ags;
        }
        c1307Ags.A00 = C79.A0C;
        c1307Ags.A01 = false;
        c1296Agh.A06 = c1307Ags;
    }

    public static final void A01(C1296Agh c1296Agh, C1300Agl c1300Agl, C1298Agj c1298Agj, long j) {
        C1308Agt c1308Agt = c1296Agh.A03;
        if (c1308Agt == null) {
            c1308Agt = new C1308Agt();
            c1308Agt.A02 = null;
            c1308Agt.A00 = LinkEncryptedPairingKt.LINK_COUNTER_MAX;
            c1308Agt.A01 = null;
            c1296Agh.A03 = c1308Agt;
        }
        c1308Agt.A02 = c1298Agj;
        c1308Agt.A00 = j;
        c1300Agl.A00 = 0L;
        c1308Agt.A01 = c1300Agl;
        c1296Agh.A06 = c1308Agt;
    }

    public static final void A02(C1296Agh c1296Agh, C1309Agu c1309Agu, C1298Agj c1298Agj, long j) {
        DragGestureNode dragGestureNode = c1296Agh.A09;
        long jAPq = AbstractC1414Aij.A05(dragGestureNode).APq(0L);
        long j2 = c1296Agh.A01;
        if (j2 != 9205357640488583168L && jAPq != j2) {
            c1296Agh.A00 = AWx.A05(c1296Agh.A00, AWx.A04(jAPq, j2));
        }
        c1296Agh.A01 = jAPq;
        EnumC1108AYu enumC1108AYu = dragGestureNode.A05;
        C7384Etj.A0X(enumC1108AYu);
        G0W<C3UX, AWx, HtJ<? super Unit>, Object> g0w = C3US.A00;
        if (Math.abs(C8j3.A05(C8j5.A0F(j, enumC1108AYu, EnumC1108AYu.A03))) > 2.0f) {
            C3UT c3ut = c1296Agh.A08;
            if (c3ut == null) {
                throw C60O.A0i("Velocity Tracker not initialized.");
            }
            AbstractC1297Agi.A01(c1296Agh.A0A, dragGestureNode.A05, c1309Agu, c1298Agj, c3ut, c1296Agh.A00);
            C1304Agp c1304Agp = c1296Agh.A0B;
            AI1 ai1 = c1304Agp.A01;
            int i = ai1.A00;
            if (i == 3) {
                int i2 = c1304Agp.A00;
                c1304Agp.A00 = i2 + 1;
                if (i2 < 0 || i2 >= i) {
                    throw new IndexOutOfBoundsException("Index must be between 0 and size");
                }
                ai1.A01[i2] = j;
            } else {
                ai1.A00(j);
            }
            if (c1304Agp.A00 == 3) {
                c1304Agp.A00 = 0;
            }
            long[] jArr = ai1.A01;
            int i3 = ai1.A00;
            float fA03 = 0.0f;
            for (int i4 = 0; i4 < i3; i4++) {
                fA03 += AnonymousClass003.A03(jArr[i4]);
            }
            int i5 = ai1.A00;
            float f = fA03 / i5;
            long[] jArr2 = ai1.A01;
            float fA00 = 0.0f;
            for (int i6 = 0; i6 < i5; i6++) {
                fA00 += AnonymousClass004.A00(jArr2[i6]);
            }
            dragGestureNode.A0L(new C1257Aft(AnonymousClass005.A0J(f, fA00 / ai1.A00), true));
        }
    }

    public static final void A03(C1296Agh c1296Agh, C1309Agu c1309Agu, C1298Agj c1298Agj, C1298Agj c1298Agj2, long j) {
        C3UT c3ut = c1296Agh.A08;
        if (c3ut == null) {
            c3ut = new C3UT();
            c1296Agh.A08 = c3ut;
        }
        c1296Agh.A00 = 0L;
        if (c3ut == null) {
            throw C60O.A0i("Velocity Tracker not initialized.");
        }
        DragGestureNode dragGestureNode = c1296Agh.A09;
        AbstractC1297Agi.A01(c1296Agh.A0A, dragGestureNode.A05, c1309Agu, c1298Agj, c3ut, 0L);
        long jA04 = AWx.A04(AbstractC1297Agi.A00(dragGestureNode.A05, c1309Agu, c1298Agj2), j);
        if (AnonymousClass003.A1X(new C1312Agx(1), dragGestureNode.A09)) {
            c1296Agh.A01 = AbstractC1414Aij.A05(dragGestureNode).APq(0L);
            dragGestureNode.A0L(new C1315Ah0(jA04));
        }
        C1304Agp c1304Agp = c1296Agh.A0B;
        c1304Agp.A00 = 0;
        c1304Agp.A01.A00 = 0;
    }

    public C1296Agh(DragGestureNode dragGestureNode) {
        this.A09 = dragGestureNode;
    }

    public final void A05() {
        A00(this);
        DragGestureNode dragGestureNode = this.A09;
        if (dragGestureNode.A0C) {
            dragGestureNode.A0L(C1295Agf.A00);
        }
        this.A08 = null;
        C1304Agp c1304Agp = this.A0B;
        c1304Agp.A00 = 0;
        c1304Agp.A01.A00 = 0;
    }
}
