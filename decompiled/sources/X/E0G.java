package X;

import androidx.media3.common.Timeline;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.RegularImmutableMap;

/* loaded from: classes5.dex */
public final class E0G {
    public Dy6 A00;
    public Dy6 A01;
    public Dy6 A02;
    public ImmutableList<Dy6> A03 = ImmutableList.of();
    public ImmutableMap<Dy6, Timeline> A04 = RegularImmutableMap.A03;
    public final E6B A05;

    /* JADX WARN: Incorrect types in method signature: (LX/Dn6;Lcom/google/common/collect/ImmutableList<LX/Dy6;>;LX/Dy6;LX/E6B;)LX/Dy6; */
    /* JADX WARN: Multi-variable type inference failed */
    public static Dy6 A01(Dn6 dn6, E6B e6b, Dy6 dy6, ImmutableList immutableList) {
        C6438E5q c6438E5q = (C6438E5q) dn6;
        Timeline timelineA02 = AbstractC5797Dph.A02(c6438E5q);
        int iAEV = dn6.AEV();
        boolean zA1M = AnonymousClass002.A1M(timelineA02.A02());
        Object objA0C = zA1M ? null : timelineA02.A0C(iAEV);
        if (!AnonymousClass002.A1P(AbstractC5797Dph.A03(c6438E5q).A09.A00, -1) && !zA1M) {
            timelineA02.A0D(e6b, iAEV, false);
            dn6.getCurrentPosition();
        }
        for (int i = 0; i < immutableList.size(); i++) {
            Dy6 dy62 = (Dy6) immutableList.get(i);
            boolean zA1P = AnonymousClass002.A1P(AbstractC5797Dph.A03(c6438E5q).A09.A00, -1);
            int iAEP = dn6.AEP();
            int iAEQ = dn6.AEQ();
            if (dy62.A04.equals(objA0C)) {
                int i2 = dy62.A00;
                if (zA1P) {
                    if (i2 == iAEP && dy62.A01 == iAEQ) {
                        return dy62;
                    }
                } else if (i2 == -1 && dy62.A02 == -1) {
                    return dy62;
                }
            }
        }
        if (immutableList.isEmpty() && dy6 != null) {
            boolean zA1P2 = AnonymousClass002.A1P(AbstractC5797Dph.A03(c6438E5q).A09.A00, -1);
            int iAEP2 = dn6.AEP();
            int iAEQ2 = dn6.AEQ();
            if (dy6.A04.equals(objA0C)) {
                int i3 = dy6.A00;
                if (!zA1P2 ? !(i3 != -1 || dy6.A02 != -1) : !(i3 != iAEP2 || dy6.A01 != iAEQ2)) {
                    return dy6;
                }
            }
        }
        return null;
    }

    public static void A02(Timeline timeline, E0G e0g) {
        ImmutableList<Dy6> immutableList;
        boolean zContains;
        ImmutableMap.Builder builder = new ImmutableMap.Builder(4);
        if (e0g.A03.isEmpty()) {
            e0g.A03(timeline, e0g.A01, builder);
            if (!C6xC.A00(e0g.A02, e0g.A01)) {
                e0g.A03(timeline, e0g.A02, builder);
            }
            if (!C6xC.A00(e0g.A00, e0g.A01)) {
                zContains = C6xC.A00(e0g.A00, e0g.A02);
            }
            e0g.A04 = builder.buildOrThrow();
        }
        int i = 0;
        while (true) {
            int size = e0g.A03.size();
            immutableList = e0g.A03;
            if (i >= size) {
                break;
            }
            e0g.A03(timeline, immutableList.get(i), builder);
            i++;
        }
        zContains = immutableList.contains(e0g.A00);
        if (!zContains) {
            e0g.A03(timeline, e0g.A00, builder);
        }
        e0g.A04 = builder.buildOrThrow();
    }

    public static C6202Dxm A00(C6463E7c c6463E7c) {
        return C6463E7c.A02(c6463E7c, c6463E7c.A05.A00);
    }

    /* JADX WARN: Incorrect types in method signature: (Lcom/google/common/collect/ImmutableMap$Builder<LX/Dy6;Landroidx/media3/common/Timeline;>;LX/Dy6;Landroidx/media3/common/Timeline;)V */
    private void A03(Timeline timeline, Dy6 dy6, ImmutableMap.Builder builder) {
        if (dy6 != null) {
            if (timeline.A06(dy6.A04) == -1 && (timeline = this.A04.get(dy6)) == null) {
                return;
            }
            builder.put(dy6, timeline);
        }
    }

    public E0G(E6B e6b) {
        this.A05 = e6b;
    }
}
