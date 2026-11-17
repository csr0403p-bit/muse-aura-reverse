package com.facebook.aura.status.view;

import X.AbstractC7559F3s;
import X.C1DG;
import X.C2av;
import X.G0U;
import com.facebook.aura.header.api.AvatarFullScreen;
import com.facebook.aura.header.view.HatchStatusPillMetrics;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchAvatarPanelViewportKt$avatarPanelViewport$2$1 extends AbstractC7559F3s implements G0U<C2av, Unit> {
    public final /* synthetic */ float $avatarWidth;
    public final /* synthetic */ AvatarFullScreen $fullScreen;
    public final /* synthetic */ Function0<C1DG> $mediaOffset;
    public final /* synthetic */ HatchStatusPillMetrics $metrics;
    public final /* synthetic */ float $panelBottom;
    public final /* synthetic */ int $panelWidth;
    public final /* synthetic */ float $radius;
    public final /* synthetic */ long $window;

    /* JADX WARN: Removed duplicated region for block: B:27:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void invoke2(X.C2av r15) {
        /*
            r14 = this;
            r0 = 0
            X.C7384Etj.A0Y(r15, r0)
            com.facebook.aura.header.api.AvatarFullScreen r0 = r14.$fullScreen
            r3 = 0
            if (r0 == 0) goto Lb2
            float r4 = r0.getProgress()
        Ld:
            com.facebook.aura.header.view.HatchStatusPillMetrics r0 = r14.$metrics
            X.00q r0 = r0.avatarPanelProgress$delegate
            float r13 = r0.AFn()
            com.facebook.aura.header.api.AvatarFullScreen r1 = r14.$fullScreen
            r12 = 0
            r6 = 1
            if (r1 == 0) goto L24
            com.facebook.aura.header.view.HatchStatusPillMetrics r0 = r14.$metrics
            boolean r0 = com.facebook.aura.status.view.HatchAvatarPanelViewportKt.isFromBubble(r1, r0)
            r11 = 1
            if (r0 == r6) goto L25
        L24:
            r11 = 0
        L25:
            r10 = 1065353216(0x3f800000, float:1.0)
            if (r11 != 0) goto L32
            int r0 = (r4 > r3 ? 1 : (r4 == r3 ? 0 : -1))
            if (r0 != 0) goto Lae
            int r0 = (r13 > r10 ? 1 : (r13 == r10 ? 0 : -1))
            if (r0 >= 0) goto Lae
            r12 = 1
        L32:
            float r2 = r14.$avatarWidth
        L34:
            r0 = r15
            X.AiL r0 = (X.C1390AiL) r0
            long r0 = r0.A0D
            float r7 = X.AnonymousClass003.A03(r0)
            float r7 = r7 - r2
            int r0 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r0 >= 0) goto L43
            r7 = 0
        L43:
            r9 = 1073741824(0x40000000, float:2.0)
            float r7 = r7 / r9
            float r5 = r10 - r4
            float r7 = r7 * r5
            if (r11 == 0) goto L9e
            float r4 = r14.$radius
            float r2 = r14.$avatarWidth
            float r2 = r2 / r9
            float r0 = r10 - r13
            float r1 = r10 - r0
            float r1 = r1 * r4
            float r0 = r0 * r2
            float r1 = r1 + r0
        L57:
            float r1 = r1 * r5
        L58:
            float r8 = r14.$panelBottom
            kotlin.jvm.functions.Function0<X.1DG> r0 = r14.$mediaOffset
            java.lang.Object r0 = r0.invoke()
            X.1DG r0 = (X.C1DG) r0
            float r0 = r0.A00
            float r0 = r15.Ah4(r0)
            float r8 = r8 - r0
            long r4 = r14.$window
            int r0 = X.AnonymousClass002.A09(r4)
            float r4 = (float) r0
            com.facebook.aura.header.api.AvatarFullScreen r0 = r14.$fullScreen
            if (r0 == 0) goto L9c
            float r0 = r0.getEdgeProgress()
        L78:
            float r2 = r10 - r0
            float r2 = r2 * r8
            float r0 = r0 * r4
            float r2 = r2 + r0
            if (r12 == 0) goto L85
            float r0 = r14.$avatarWidth
            float r2 = java.lang.Math.min(r2, r0)
        L85:
            if (r11 == 0) goto L94
            r3 = r1
        L88:
            com.facebook.aura.status.view.AvatarViewportShape r0 = new com.facebook.aura.status.view.AvatarViewportShape
            r0.<init>(r2, r1, r3, r7)
            r15.Aeg(r0)
            r15.Ad2(r6)
            return
        L94:
            if (r12 == 0) goto L88
            float r3 = r14.$avatarWidth
            float r3 = r3 / r9
            float r10 = r10 - r13
            float r3 = r3 * r10
            goto L88
        L9c:
            r0 = 0
            goto L78
        L9e:
            if (r12 == 0) goto Lab
            float r2 = r14.$avatarWidth
            float r2 = r2 / r9
            float r0 = r14.$radius
            float r1 = r10 - r13
            float r1 = r1 * r2
            float r0 = r0 * r13
            float r1 = r1 + r0
            goto L58
        Lab:
            float r1 = r14.$radius
            goto L57
        Lae:
            int r0 = r14.$panelWidth
            float r2 = (float) r0
            goto L34
        Lb2:
            r4 = 0
            goto Ld
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.status.view.HatchAvatarPanelViewportKt$avatarPanelViewport$2$1.invoke2(X.2av):void");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchAvatarPanelViewportKt$avatarPanelViewport$2$1(AvatarFullScreen avatarFullScreen, HatchStatusPillMetrics hatchStatusPillMetrics, float f, int i, float f2, float f3, Function0<C1DG> function0, long j) {
        super(1);
        this.$fullScreen = avatarFullScreen;
        this.$metrics = hatchStatusPillMetrics;
        this.$avatarWidth = f;
        this.$panelWidth = i;
        this.$radius = f2;
        this.$panelBottom = f3;
        this.$mediaOffset = function0;
        this.$window = j;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(C2av c2av) {
        invoke2(c2av);
        return Unit.INSTANCE;
    }
}
