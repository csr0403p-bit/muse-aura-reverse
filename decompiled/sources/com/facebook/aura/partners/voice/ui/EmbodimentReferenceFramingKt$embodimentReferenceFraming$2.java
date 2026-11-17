package com.facebook.aura.partners.voice.ui;

import X.ATD;
import X.AW9;
import X.AWA;
import X.AaC;
import X.AaI;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass003;
import X.C16Z;
import X.C7384Etj;
import X.G0U;
import X.InterfaceC1279AgP;
import com.facebook.aura.partners.voice.intf.VoiceEmbodimentMedia;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final class EmbodimentReferenceFramingKt$embodimentReferenceFraming$2 extends AbstractC7559F3s implements G0U<C16Z, Unit> {
    public final /* synthetic */ Function0<Float> $bottomAlignmentFraction;
    public final /* synthetic */ AWA $content;
    public final /* synthetic */ VoiceEmbodimentMedia.ReferenceFraming $framing;
    public final /* synthetic */ boolean $scaleToFill;

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(C16Z c16z) {
        C7384Etj.A0Y(c16z, 0);
        AaC aaCM1801embodimentReferenceBoundse4CFRc8 = EmbodimentReferenceFramingKt.m1801embodimentReferenceBoundse4CFRc8(this.$content.A00, c16z.AKb(), this.$framing, this.$scaleToFill, AnonymousClass003.A04(this.$bottomAlignmentFraction));
        float f = aaCM1801embodimentReferenceBoundse4CFRc8.A01;
        float f2 = aaCM1801embodimentReferenceBoundse4CFRc8.A03;
        VoiceEmbodimentMedia.ReferenceFraming referenceFraming = this.$framing;
        float f3 = referenceFraming != null ? referenceFraming.cropTopFraction : 0.0f;
        float f4 = aaCM1801embodimentReferenceBoundse4CFRc8.A00;
        float f5 = f4 - f2;
        float fA03 = ATD.A03(f2 + (f3 * f5), 0.0f, AnonymousClass001.A01(c16z.AKb(), 4294967295L));
        float f6 = aaCM1801embodimentReferenceBoundse4CFRc8.A02;
        VoiceEmbodimentMedia.ReferenceFraming referenceFraming2 = this.$framing;
        float fA032 = ATD.A03(f4 - ((referenceFraming2 != null ? referenceFraming2.cropBottomFraction : 0.0f) * f5), 0.0f, AnonymousClass001.A01(4294967295L, c16z.AKb()));
        InterfaceC1279AgP interfaceC1279AgPAEq = c16z.AEq();
        AaI aaI = (AaI) interfaceC1279AgPAEq;
        AW9 aw9 = aaI.A02.A02;
        long jA00 = AW9.A00(aw9);
        try {
            aaI.A01.A6N(f, fA03, f6, fA032, 1);
            c16z.A9O();
        } finally {
            AW9.A02(aw9, interfaceC1279AgPAEq, jA00);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EmbodimentReferenceFramingKt$embodimentReferenceFraming$2(AWA awa, VoiceEmbodimentMedia.ReferenceFraming referenceFraming, boolean z, Function0<Float> function0) {
        super(1);
        this.$content = awa;
        this.$framing = referenceFraming;
        this.$scaleToFill = z;
        this.$bottomAlignmentFraction = function0;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(C16Z c16z) {
        invoke2(c16z);
        return Unit.INSTANCE;
    }
}
