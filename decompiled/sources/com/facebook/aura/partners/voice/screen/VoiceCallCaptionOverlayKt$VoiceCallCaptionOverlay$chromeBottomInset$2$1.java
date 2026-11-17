package com.facebook.aura.partners.voice.screen;

import X.AXN;
import X.AbstractC7559F3s;
import X.C00r;
import com.facebook.aura.ui.HatchComposerGeometry;
import com.facebook.aura.ui.HatchFloatingChromeGeometry;
import com.facebook.aura.ui.HatchWindowGeometry;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public final class VoiceCallCaptionOverlayKt$VoiceCallCaptionOverlay$chromeBottomInset$2$1 extends AbstractC7559F3s implements Function0<Integer> {
    public final /* synthetic */ HatchComposerGeometry $composerGeometry;
    public final /* synthetic */ AXN $density;
    public final /* synthetic */ VoiceAvatarFullScreenState $fullScreen;
    public final /* synthetic */ int $fullScreenInset;
    public final /* synthetic */ HatchFloatingChromeGeometry $geometry;
    public final /* synthetic */ C00r $measuredHeight$delegate;
    public final /* synthetic */ HatchWindowGeometry $windowGeometry;
    public final /* synthetic */ int $windowHeight;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VoiceCallCaptionOverlayKt$VoiceCallCaptionOverlay$chromeBottomInset$2$1(VoiceAvatarFullScreenState voiceAvatarFullScreenState, int i, int i2, HatchFloatingChromeGeometry hatchFloatingChromeGeometry, AXN axn, HatchWindowGeometry hatchWindowGeometry, C00r c00r, HatchComposerGeometry hatchComposerGeometry) {
        super(0);
        this.$fullScreen = voiceAvatarFullScreenState;
        this.$fullScreenInset = i;
        this.$windowHeight = i2;
        this.$geometry = hatchFloatingChromeGeometry;
        this.$density = axn;
        this.$windowGeometry = hatchWindowGeometry;
        this.$measuredHeight$delegate = c00r;
        this.$composerGeometry = hatchComposerGeometry;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    /* JADX WARN: Removed duplicated region for block: B:33:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00ad  */
    @Override // kotlin.jvm.functions.Function0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Integer invoke() {
        /*
            r7 = this;
            com.facebook.aura.partners.voice.screen.VoiceAvatarFullScreenState r0 = r7.$fullScreen
            boolean r0 = r0.getExpanded()
            if (r0 == 0) goto Lf
            int r0 = r7.$fullScreenInset
        La:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            return r0
        Lf:
            X.00r r0 = r7.$measuredHeight$delegate
            int r0 = r0.AGd()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            int r3 = r0.intValue()
            if (r3 > 0) goto L21
            int r3 = r7.$windowHeight
        L21:
            com.facebook.aura.ui.HatchFloatingChromeGeometry r0 = r7.$geometry
            if (r0 == 0) goto L8b
            X.AMm<java.lang.Object, X.BLU> r0 = r0.bottomBars
            if (r0 == 0) goto L8b
            java.util.Collection r0 = r0.values()
            if (r0 == 0) goto L8b
            java.util.ArrayList r6 = X.C3cG.A0h()
            java.util.Iterator r5 = r0.iterator()
        L37:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L56
            java.lang.Object r4 = r5.next()
            r2 = r4
            X.BLU r2 = (X.BLU) r2
            int r1 = r2.A02
            int r0 = r2.A01
            int r1 = r1 - r0
            if (r1 <= 0) goto L37
            int r1 = r2.A00
            int r0 = r2.A03
            int r1 = r1 - r0
            if (r1 <= 0) goto L37
            r6.add(r4)
            goto L37
        L56:
            java.util.Iterator r4 = r6.iterator()
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L8b
            java.lang.Object r0 = r4.next()
            X.BLU r0 = (X.BLU) r0
            int r0 = r0.A03
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
        L6c:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L86
            java.lang.Object r0 = r4.next()
            X.BLU r0 = (X.BLU) r0
            int r0 = r0.A03
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            int r0 = r2.compareTo(r1)
            if (r0 <= 0) goto L6c
            r2 = r1
            goto L6c
        L86:
            int r2 = r2.intValue()
            goto L8c
        L8b:
            r2 = r3
        L8c:
            X.AXN r1 = r7.$density
            com.facebook.aura.ui.HatchComposerGeometry r0 = r7.$composerGeometry
            X.1DG r0 = r0.m2313getBottomClearancelTKBWiU()
            if (r0 == 0) goto Lad
            float r0 = r0.A00
            int r1 = r1.Abr(r0)
        L9c:
            int r3 = r3 - r2
            com.facebook.aura.ui.HatchWindowGeometry r0 = r7.$windowGeometry
            int r0 = r0.getNavigationBarBottomPx()
            int r0 = java.lang.Math.max(r0, r1)
            int r0 = java.lang.Math.max(r3, r0)
            goto La
        Lad:
            r1 = 0
            goto L9c
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.partners.voice.screen.VoiceCallCaptionOverlayKt$VoiceCallCaptionOverlay$chromeBottomInset$2$1.invoke():java.lang.Integer");
    }
}
