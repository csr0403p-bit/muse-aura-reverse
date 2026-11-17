package com.facebook.aura.header.view;

import X.AKH;
import X.ATD;
import X.AWA;
import X.AaC;
import X.AbstractC1462AjV;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.BRg;
import X.C2J7;
import X.C2LD;
import X.C2Un;
import X.C3UC;
import X.C7384Etj;
import X.G0U;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public abstract class HatchStatusPillMetricsKt {
    public static final float AVATAR_SETTLE_STIFFNESS = 322.0f;
    public static final AKH<HatchStatusPillMetrics> LocalHatchStatusPillMetrics = AnonymousClass002.A0L(HatchStatusPillMetricsKt$LocalHatchStatusPillMetrics$1.INSTANCE);

    /* renamed from: com.facebook.aura.header.view.HatchStatusPillMetricsKt$onBoundsInWindowChanged$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0U<C2LD, Unit> {
        public final /* synthetic */ G0U<AaC, Unit> $onChanged;

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(C2LD c2ld) {
            C7384Etj.A0Y(c2ld, 0);
            this.$onChanged.invoke(C2Un.A00(c2ld.A03()));
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(G0U<? super AaC, Unit> g0u) {
            super(1);
            this.$onChanged = g0u;
        }

        @Override // X.G0U
        public /* bridge */ /* synthetic */ Unit invoke(C2LD c2ld) {
            invoke2(c2ld);
            return Unit.INSTANCE;
        }
    }

    public static final BRg onBoundsInWindowChanged(BRg bRg, G0U<? super AaC, Unit> g0u) {
        AnonymousClass003.A0u(bRg, g0u);
        return AbstractC1462AjV.A00(bRg, new AnonymousClass1(g0u), 0L, 0L);
    }

    public static final AKH<HatchStatusPillMetrics> getLocalHatchStatusPillMetrics() {
        return LocalHatchStatusPillMetrics;
    }

    /* renamed from: hatchAvatarFraming-KUbW9oc$default, reason: not valid java name */
    public static /* synthetic */ BRg m1015hatchAvatarFramingKUbW9oc$default(BRg bRg, AWA awa, Function0 function0, int i, Object obj) {
        if ((i & 2) != 0) {
            function0 = HatchStatusPillMetricsKt$hatchAvatarFraming$1.INSTANCE;
        }
        return m1014hatchAvatarFramingKUbW9oc(bRg, awa, function0);
    }

    /* renamed from: avatarContentBounds-VgWVRYQ, reason: not valid java name */
    public static final AaC m1013avatarContentBoundsVgWVRYQ(long j, long j2, float f) {
        if (AWA.A06(j)) {
            return C2J7.A00(0L, j2);
        }
        float fA03 = ATD.A03(f, 0.0f, 1.0f);
        float fA00 = AnonymousClass001.A00(j2);
        float fA002 = fA00 / AnonymousClass001.A00(j);
        float fA01 = AnonymousClass001.A01(j2, 4294967295L);
        float fA012 = AnonymousClass001.A01(j, 4294967295L);
        float f2 = fA01 / fA012;
        float fMin = Math.min(fA002, f2);
        float f3 = 1.0f - fA03;
        long jA02 = AWA.A02(j, (f3 * fMin) + (Math.max(fA002, f2) * fA03));
        return C2J7.A00(AnonymousClass005.A0M((fA00 - AnonymousClass001.A00(jA02)) / 2.0f, (f3 * ((fA01 - (fA012 * fMin)) / 2.0f)) + (fA03 * 0.0f)), jA02);
    }

    /* renamed from: hatchAvatarFraming-KUbW9oc, reason: not valid java name */
    public static final BRg m1014hatchAvatarFramingKUbW9oc(BRg bRg, AWA awa, Function0<Float> function0) {
        AnonymousClass003.A0v(bRg, function0);
        return C3UC.A00(bRg, new HatchStatusPillMetricsKt$hatchAvatarFraming$2(awa, function0));
    }

    /* renamed from: hatchStatusPillEnvelope-lG28NQ4, reason: not valid java name */
    public static final BRg m1016hatchStatusPillEnvelopelG28NQ4(BRg bRg, float f, Function0<Float> function0) {
        AnonymousClass003.A0v(bRg, function0);
        return C3UC.A00(bRg, new HatchStatusPillMetricsKt$hatchStatusPillEnvelope$1(f, function0));
    }
}
