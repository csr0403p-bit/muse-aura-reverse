package X;

import java.util.List;

/* renamed from: X.1yS, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC05181yS {
    public static final float A01(C1247Afe c1247Afe) {
        List<C1299Agk> list = c1247Afe.A05;
        int size = list.size();
        int i = 0;
        int i2 = 0;
        while (true) {
            int i3 = 1;
            if (i >= size) {
                break;
            }
            C1299Agk c1299Agk = list.get(i);
            if (!c1299Agk.A0G || !c1299Agk.A0F) {
                i3 = 0;
            }
            i2 += i3;
            i++;
        }
        if (i2 >= 2) {
            long jA05 = A05(c1247Afe, new C3bM(3), true);
            long jA052 = A05(c1247Afe, new C3bM(3), false);
            int size2 = list.size();
            float f = 0.0f;
            float f2 = 0.0f;
            for (int i4 = 0; i4 < size2; i4++) {
                C1299Agk c1299Agk2 = list.get(i4);
                if (c1299Agk2.A0F && c1299Agk2.A0G) {
                    long j = c1299Agk2.A0A;
                    long jA04 = AWx.A04(c1299Agk2.A0B, jA052);
                    long jA042 = AWx.A04(j, jA05);
                    float fA00 = A00(jA042) - A00(jA04);
                    float fA002 = AWx.A00(AWx.A05(jA042, jA04)) / 2.0f;
                    if (fA00 > 180.0f) {
                        fA00 -= 360.0f;
                    } else if (fA00 < -180.0f) {
                        fA00 += 360.0f;
                    }
                    f2 += fA00 * fA002;
                    f += fA002;
                }
            }
            if (f != 0.0f) {
                return f2 / f;
            }
        }
        return 0.0f;
    }

    public static final float A02(C1247Afe c1247Afe) {
        float fA03 = A03(c1247Afe, true);
        float fA032 = A03(c1247Afe, false);
        if (fA03 == 0.0f || fA032 == 0.0f) {
            return 1.0f;
        }
        return fA03 / fA032;
    }

    public static final float A03(C1247Afe c1247Afe, boolean z) {
        long jA05 = A05(c1247Afe, new C3bM(3), z);
        float fA00 = 0.0f;
        if (AnonymousClass002.A1M((jA05 > 9205357640488583168L ? 1 : (jA05 == 9205357640488583168L ? 0 : -1)))) {
            return 0.0f;
        }
        List<C1299Agk> list = c1247Afe.A05;
        int size = list.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            C1299Agk c1299Agk = list.get(i2);
            if (c1299Agk.A0F && c1299Agk.A0G) {
                fA00 += AWx.A00(AWx.A04(z ? c1299Agk.A0A : c1299Agk.A0B, jA05));
                i++;
            }
        }
        return fA00 / i;
    }

    public static final long A04(C1247Afe c1247Afe) {
        long jA05 = A05(c1247Afe, new C3bM(3), true);
        if (jA05 == 9205357640488583168L) {
            return 0L;
        }
        return AWx.A04(jA05, A05(c1247Afe, new C3bM(3), false));
    }

    /* JADX WARN: Incorrect types in method signature: (LX/Afe;ZLX/G0U<-LX/Agk;Ljava/lang/Boolean;>;)J */
    public static final long A05(C1247Afe c1247Afe, G0U g0u, boolean z) {
        long jA05 = 0;
        List<C1299Agk> list = c1247Afe.A05;
        int size = list.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            C1299Agk c1299Agk = list.get(i2);
            if (AnonymousClass003.A1X(c1299Agk, g0u)) {
                jA05 = AWx.A05(jA05, z ? c1299Agk.A0A : c1299Agk.A0B);
                i++;
            }
        }
        if (i == 0) {
            return 9205357640488583168L;
        }
        float f = i;
        return AnonymousClass005.A0L(AnonymousClass001.A00(jA05) / f, AnonymousClass001.A01(jA05, 4294967295L) / f);
    }

    public static final float A00(long j) {
        float fA03 = AnonymousClass003.A03(j);
        if (fA03 == 0.0f && AnonymousClass001.A01(j, 4294967295L) == 0.0f) {
            return 0.0f;
        }
        return ((-((float) Math.atan2(fA03, AnonymousClass001.A01(j, 4294967295L)))) * 180.0f) / 3.1415927f;
    }
}
