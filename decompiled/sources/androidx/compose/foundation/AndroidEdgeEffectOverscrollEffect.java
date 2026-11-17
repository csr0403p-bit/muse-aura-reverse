package androidx.compose.foundation;

import X.AGG;
import X.AXN;
import X.AaM;
import X.AaN;
import X.Ab3;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.BSJ;
import X.C1247Afe;
import X.C1263Ag4;
import X.C1264Ag5;
import X.C1267AgC;
import X.C1268AgD;
import X.C1Wv;
import X.C1Z3;
import X.C3TQ;
import X.C3cG;
import X.C8j3;
import X.HxS;
import X.InterfaceC1260Afz;
import android.content.Context;
import android.os.Build;
import android.widget.EdgeEffect;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNode;
import kotlin.Unit;

/* loaded from: classes4.dex */
public final class AndroidEdgeEffectOverscrollEffect implements InterfaceC1260Afz {
    public long A00;
    public long A01 = 9205357640488583168L;
    public long A02;
    public boolean A03;
    public final C1267AgC A04;
    public final MutableState<Unit> A05;
    public final C1Z3 A06;
    public final SuspendingPointerInputModifierNode A07;
    public final AXN A08;

    /* JADX WARN: Incorrect types in method signature: (JLX/G0V<-LX/Afj;-LX/HtJ<-LX/Afj;>;+Ljava/lang/Object;>;LX/HtJ<-Lkotlin/Unit;>;)Ljava/lang/Object; */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x016a  */
    @Override // X.InterfaceC1260Afz
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A4e(X.HtJ r16, X.G0V r17, long r18) {
        /*
            Method dump skipped, instructions count: 374
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.AndroidEdgeEffectOverscrollEffect.A4e(X.HtJ, X.G0V, long):java.lang.Object");
    }

    /* JADX WARN: Incorrect types in method signature: (JILX/G0U<-LX/AWx;LX/AWx;>;)J */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0224  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0248  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x012a A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x016f  */
    @Override // X.InterfaceC1260Afz
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long A4f(X.G0U r16, int r17, long r18) {
        /*
            Method dump skipped, instructions count: 620
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.AndroidEdgeEffectOverscrollEffect.A4f(X.G0U, int, long):long");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x001e  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x003e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void A04() {
        /*
            r3 = this;
            X.AgC r2 = r3.A04
            android.widget.EdgeEffect r0 = r2.A07
            if (r0 == 0) goto L48
            r0.onRelease()
            boolean r1 = X.C8j3.A1U(r0)
        Ld:
            android.widget.EdgeEffect r0 = r2.A01
            if (r0 == 0) goto L1f
            r0.onRelease()
            boolean r0 = r0.isFinished()
            if (r0 == 0) goto L1e
            r0 = r1
            r1 = 0
            if (r0 == 0) goto L1f
        L1e:
            r1 = 1
        L1f:
            android.widget.EdgeEffect r0 = r2.A03
            if (r0 == 0) goto L31
            r0.onRelease()
            boolean r0 = r0.isFinished()
            if (r0 == 0) goto L30
            r0 = r1
            r1 = 0
            if (r0 == 0) goto L31
        L30:
            r1 = 1
        L31:
            android.widget.EdgeEffect r0 = r2.A05
            if (r0 == 0) goto L3e
            r0.onRelease()
            boolean r0 = r0.isFinished()
            if (r0 == 0) goto L40
        L3e:
            if (r1 == 0) goto L47
        L40:
            androidx.compose.runtime.MutableState<kotlin.Unit> r1 = r3.A05
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            r1.Af8(r0)
        L47:
            return
        L48:
            r1 = 0
            goto Ld
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.AndroidEdgeEffectOverscrollEffect.A04():void");
    }

    public final long A05() {
        long jA01 = this.A01;
        if ((9223372034707292159L & jA01) == 9205357640488583168L) {
            jA01 = C1Wv.A01(this.A02);
        }
        float fA00 = AnonymousClass001.A00(jA01);
        long j = this.A02;
        return AnonymousClass005.A0M(fA00 / AnonymousClass001.A00(j), AnonymousClass001.A01(jA01, 4294967295L) / AnonymousClass001.A01(j, 4294967295L));
    }

    public final void A06(long j) {
        long j2 = this.A02;
        boolean zA1M = AnonymousClass002.A1M((j2 > 0L ? 1 : (j2 == 0L ? 0 : -1)));
        boolean zA1M2 = AnonymousClass002.A1M((j > j2 ? 1 : (j == j2 ? 0 : -1)));
        this.A02 = j;
        if (!zA1M2) {
            C1267AgC c1267AgC = this.A04;
            long jA0S = C8j3.A0S(Ab3.A01(AnonymousClass001.A00(j)), Ab3.A01(AnonymousClass001.A01(j, 4294967295L)));
            c1267AgC.A00 = jA0S;
            EdgeEffect edgeEffect = c1267AgC.A07;
            if (edgeEffect != null) {
                edgeEffect.setSize((int) (jA0S >> 32), (int) (jA0S & 4294967295L));
            }
            EdgeEffect edgeEffect2 = c1267AgC.A01;
            if (edgeEffect2 != null) {
                edgeEffect2.setSize((int) (jA0S >> 32), (int) (jA0S & 4294967295L));
            }
            EdgeEffect edgeEffect3 = c1267AgC.A03;
            if (edgeEffect3 != null) {
                edgeEffect3.setSize((int) (jA0S & 4294967295L), (int) (jA0S >> 32));
            }
            EdgeEffect edgeEffect4 = c1267AgC.A05;
            if (edgeEffect4 != null) {
                edgeEffect4.setSize((int) (jA0S & 4294967295L), (int) (jA0S >> 32));
            }
            EdgeEffect edgeEffect5 = c1267AgC.A08;
            if (edgeEffect5 != null) {
                edgeEffect5.setSize((int) (jA0S >> 32), (int) (jA0S & 4294967295L));
            }
            EdgeEffect edgeEffect6 = c1267AgC.A02;
            if (edgeEffect6 != null) {
                edgeEffect6.setSize((int) (jA0S >> 32), (int) (jA0S & 4294967295L));
            }
            EdgeEffect edgeEffect7 = c1267AgC.A04;
            if (edgeEffect7 != null) {
                edgeEffect7.setSize((int) (jA0S & 4294967295L), (int) (jA0S >> 32));
            }
            EdgeEffect edgeEffect8 = c1267AgC.A06;
            if (edgeEffect8 != null) {
                edgeEffect8.setSize((int) (4294967295L & jA0S), (int) (jA0S >> 32));
            }
        }
        if (zA1M || zA1M2) {
            return;
        }
        A04();
    }

    public AndroidEdgeEffectOverscrollEffect(Context context, C3TQ c3tq, AXN axn, long j) {
        this.A08 = axn;
        C1267AgC c1267AgC = new C1267AgC(context, HxS.A01(j));
        this.A04 = c1267AgC;
        this.A05 = C3cG.A08(AGG.A00, Unit.INSTANCE);
        this.A02 = 0L;
        this.A00 = -1L;
        BSJ bsj = new BSJ(this, 0);
        C1247Afe c1247Afe = AaM.A00;
        AaN aaN = new AaN(bsj, null, null, null);
        this.A07 = aaN;
        this.A06 = Build.VERSION.SDK_INT >= 31 ? new C1264Ag5(this, c1267AgC, aaN) : new C1263Ag4(this, c1267AgC, c3tq, aaN);
    }

    private final float A00(long j) {
        float fA03 = AnonymousClass003.A03(A05());
        float fA01 = AnonymousClass001.A01(j, 4294967295L);
        float fA012 = fA01 / AnonymousClass001.A01(this.A02, 4294967295L);
        EdgeEffect edgeEffectA02 = this.A04.A02();
        return C1268AgD.A00(edgeEffectA02) == 0.0f ? (-C1268AgD.A01(edgeEffectA02, -fA012, 1.0f - fA03)) * AnonymousClass001.A01(4294967295L, this.A02) : fA01;
    }

    private final float A01(long j) {
        float fA00 = AnonymousClass004.A00(A05());
        float fA002 = AnonymousClass001.A00(j);
        float fA003 = fA002 / AnonymousClass001.A00(this.A02);
        EdgeEffect edgeEffectA03 = this.A04.A03();
        return C1268AgD.A00(edgeEffectA03) == 0.0f ? C1268AgD.A01(edgeEffectA03, fA003, 1.0f - fA00) * AnonymousClass001.A00(this.A02) : fA002;
    }

    private final float A02(long j) {
        float fA00 = AnonymousClass004.A00(A05());
        float fA002 = AnonymousClass001.A00(j);
        float fA003 = fA002 / AnonymousClass001.A00(this.A02);
        EdgeEffect edgeEffectA04 = this.A04.A04();
        return C1268AgD.A00(edgeEffectA04) == 0.0f ? (-C1268AgD.A01(edgeEffectA04, -fA003, fA00)) * AnonymousClass001.A00(this.A02) : fA002;
    }

    private final float A03(long j) {
        float fA03 = AnonymousClass003.A03(A05());
        float fA01 = AnonymousClass001.A01(j, 4294967295L);
        float fA012 = fA01 / AnonymousClass001.A01(this.A02, 4294967295L);
        EdgeEffect edgeEffectA05 = this.A04.A05();
        return C1268AgD.A00(edgeEffectA05) == 0.0f ? C1268AgD.A01(edgeEffectA05, fA012, fA03) * AnonymousClass001.A01(4294967295L, this.A02) : fA01;
    }
}
