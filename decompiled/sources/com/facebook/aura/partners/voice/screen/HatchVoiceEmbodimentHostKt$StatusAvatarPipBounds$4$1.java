package com.facebook.aura.partners.voice.screen;

import X.ATD;
import X.AaC;
import X.Ab3;
import X.AbstractC7559F3s;
import X.AnonymousClass002;
import X.BLU;
import X.G0U;
import com.facebook.aura.partners.voice.intf.VoiceEmbodimentMedia;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public final class HatchVoiceEmbodimentHostKt$StatusAvatarPipBounds$4$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ AaC $bounds;
    public final /* synthetic */ float $density;
    public final /* synthetic */ boolean $fullScreen;
    public final /* synthetic */ boolean $gestureNavigation;
    public final /* synthetic */ VoiceEmbodimentMedia $media;
    public final /* synthetic */ boolean $panelClosed;
    public final /* synthetic */ HatchSystemPipState $systemPip;
    public final /* synthetic */ long $windowSize;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchVoiceEmbodimentHostKt$StatusAvatarPipBounds$4$1(AaC aaC, long j, boolean z, VoiceEmbodimentMedia voiceEmbodimentMedia, boolean z2, float f, HatchSystemPipState hatchSystemPipState, boolean z3) {
        super(0);
        this.$bounds = aaC;
        this.$windowSize = j;
        this.$fullScreen = z;
        this.$media = voiceEmbodimentMedia;
        this.$panelClosed = z2;
        this.$density = f;
        this.$systemPip = hatchSystemPipState;
        this.$gestureNavigation = z3;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        AaC aaC = this.$bounds;
        int iA01 = Ab3.A01(aaC.A01);
        long j = this.$windowSize;
        int i = (int) (j >> 32);
        int iA04 = ATD.A04(iA01, 0, i);
        int iA012 = Ab3.A01(aaC.A03);
        int iA09 = AnonymousClass002.A09(j);
        int iA042 = ATD.A04(iA012, 0, iA09);
        int iA043 = ATD.A04(Ab3.A01(aaC.A02), iA04, i);
        int iA044 = ATD.A04(Ab3.A01(aaC.A00), iA042, iA09);
        if (iA043 <= iA04 || iA044 <= iA042) {
            return;
        }
        BLU blu = new BLU(iA04, iA042, iA043, iA044);
        BLU bluCallAvatarPipRegion = this.$fullScreen ? VoiceEmbodimentAvatarOverlayKt.callAvatarPipRegion(blu, this.$media) : this.$panelClosed ? HatchSystemPipGeometryKt.m1737pogPipSourceSquareHDNwks(blu, j, this.$density, this.$systemPip.m1739pipWindowSideForozmzZPI(j), !this.$gestureNavigation) : HatchSystemPipGeometryKt.m1736pipSourceSquareJVtK1S4(blu, j, this.$density);
        G0U<HatchSystemPipGeometry, Unit> g0u = this.$systemPip.onSourceChanged;
        if (g0u != null) {
            long j2 = this.$windowSize;
            BLU blu2 = bluCallAvatarPipRegion;
            if (this.$fullScreen) {
                blu2 = blu;
            }
            g0u.invoke(new HatchSystemPipGeometry(j2, blu2, bluCallAvatarPipRegion, true));
        }
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
