package com.facebook.aura.composer.camera;

import X.AOW;
import X.AT5;
import X.AbstractC07127nr;
import X.C3UX;
import X.G0V;
import X.HtJ;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.composer.camera.HatchCameraPreviewKt$HatchCameraPreview$3$1", f = "HatchCameraPreview.kt", l = {68, 69}, m = "invokeSuspend", v = 2)
/* loaded from: classes3.dex */
public final class HatchCameraPreviewKt$HatchCameraPreview$3$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
    public final /* synthetic */ HatchCameraSession $camera;
    public final /* synthetic */ AT5<Float, AOW> $flash;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchCameraPreviewKt$HatchCameraPreview$3$1(HatchCameraSession hatchCameraSession, AT5<Float, AOW> at5, HtJ<? super HatchCameraPreviewKt$HatchCameraPreview$3$1> htJ) {
        super(2, htJ);
        this.$camera = hatchCameraSession;
        this.$flash = at5;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new HatchCameraPreviewKt$HatchCameraPreview$3$1(this.$camera, this.$flash, htJ);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0052 A[RETURN] */
    @Override // X.AbstractC8884Fsp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            X.Hji r3 = X.EnumC10460Hji.A02
            int r0 = r9.label
            r4 = 2
            r5 = 1
            if (r0 == 0) goto L12
            if (r0 == r5) goto L30
            if (r0 != r4) goto L53
            X.Hwg.A00(r10)
        Lf:
            kotlin.Unit r3 = kotlin.Unit.INSTANCE
            return r3
        L12:
            X.Hwg.A00(r10)
            com.facebook.aura.composer.camera.HatchCameraSession r0 = r9.$camera
            int r0 = r0.getShutterCount()
            if (r0 <= 0) goto Lf
            X.AT5<java.lang.Float, X.AOW> r2 = r9.$flash
            r1 = 1061997773(0x3f4ccccd, float:0.8)
            java.lang.Float r0 = new java.lang.Float
            r0.<init>(r1)
            r9.label = r5
            java.lang.Object r0 = r2.A04(r0, r9)
            if (r0 != r3) goto L33
            return r3
        L30:
            X.Hwg.A00(r10)
        L33:
            X.AT5<java.lang.Float, X.AOW> r5 = r9.$flash
            r0 = 0
            java.lang.Float r7 = new java.lang.Float
            r7.<init>(r0)
            r10 = 0
            r2 = 180(0xb4, float:2.52E-43)
            r1 = 0
            X.28s r0 = X.C2HU.A01
            X.ASj r6 = new X.ASj
            r6.<init>(r0, r2, r1)
            r9.label = r4
            java.lang.Object r8 = r5.A03()
            java.lang.Object r0 = X.AT5.A00(r5, r6, r7, r8, r9, r10)
            if (r0 != r3) goto Lf
            return r3
        L53:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.composer.camera.HatchCameraPreviewKt$HatchCameraPreview$3$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.G0V
    public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
        return ((HatchCameraPreviewKt$HatchCameraPreview$3$1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
