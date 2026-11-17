package com.facebook.aura.ageverification;

import X.AHD;
import X.AT3;
import X.AaJ;
import X.AbstractC7559F3s;
import X.AnonymousClass003;
import X.C1BO;
import X.C7384Etj;
import X.G0U;
import X.HxS;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final class SelfieOverlayKt$SelfieMovementOverlay$1$1 extends AbstractC7559F3s implements G0U<AT3, Unit> {
    public final /* synthetic */ long $complete;
    public final /* synthetic */ HeadMovement $current;
    public final /* synthetic */ long $fill;
    public final /* synthetic */ AHD<CompletionFlash> $flashes;
    public final /* synthetic */ long $mask;
    public final /* synthetic */ Function0<Float> $progress;
    public final /* synthetic */ long $track;

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(AT3 at3) {
        C7384Etj.A0Y(at3, 0);
        AaJ aaJ = new AaJ(null, at3.Ah4(4.0f), 4.0f, 1, 0);
        float fM231drawSelfieFrameIbeAmgk = SelfieOverlayKt.m231drawSelfieFrameIbeAmgk(at3, this.$mask, this.$track, aaJ);
        AHD<CompletionFlash> ahd = this.$flashes;
        long j = this.$track;
        long j2 = this.$complete;
        for (CompletionFlash completionFlash : ahd) {
            float fA01 = C1BO.A01(completionFlash.strength);
            if (fA01 > 0.0f) {
                SelfieOverlayKt.m230drawRingArc3IgeMak(at3, HxS.A03(j, j2, fA01), aaJ, fM231drawSelfieFrameIbeAmgk, SelfieOverlayKt.getArcCenter(completionFlash.direction), 1.0f);
            }
        }
        HeadMovement headMovement = this.$current;
        if (headMovement != null) {
            SelfieOverlayKt.m230drawRingArc3IgeMak(at3, this.$fill, aaJ, fM231drawSelfieFrameIbeAmgk, SelfieOverlayKt.getArcCenter(headMovement), AnonymousClass003.A04(this.$progress));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SelfieOverlayKt$SelfieMovementOverlay$1$1(long j, long j2, AHD<CompletionFlash> ahd, HeadMovement headMovement, long j3, Function0<Float> function0, long j4) {
        super(1);
        this.$mask = j;
        this.$track = j2;
        this.$flashes = ahd;
        this.$current = headMovement;
        this.$fill = j3;
        this.$progress = function0;
        this.$complete = j4;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(AT3 at3) {
        invoke2(at3);
        return Unit.INSTANCE;
    }
}
