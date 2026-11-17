package X;

import com.facebook.aura.components.reactions.AuraReactionMotionKt;

/* loaded from: classes4.dex */
public interface AXN extends C0dm {
    float AEm();

    int Abr(float f);

    float Agx(float f);

    float Agy(int i);

    long Agz(long j);

    float Ah3(long j);

    float Ah4(float f);

    long Ah6(long j);

    long Ah8(float f);

    long Ah9(int i);

    static float A00(AXN axn) {
        return axn.Ah4(AuraReactionMotionKt.OneDp);
    }

    static float A01(AXN axn, float f) {
        return f * axn.AEm();
    }

    static long A02(AXN axn, float f) {
        return axn.Ah7(axn.Agx(f));
    }

    static long A03(AXN axn, int i) {
        return axn.Ah7(axn.Agy(i));
    }

    static void A04(C2av c2av, float f) {
        c2av.Af6(f * c2av.AEm());
    }
}
