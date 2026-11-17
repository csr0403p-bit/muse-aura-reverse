package com.facebook.aura.partners.voice.ui;

import X.AWA;
import X.AXY;
import X.AYU;
import X.AZE;
import X.AaC;
import X.Ab3;
import X.AbstractC7559F3s;
import X.AnonymousClass003;
import X.AnonymousClass007;
import X.C3TG;
import X.C7384Etj;
import X.G0U;
import X.G0W;
import X.InterfaceC1134Abi;
import androidx.compose.ui.unit.Constraints;
import com.facebook.aura.partners.voice.intf.VoiceEmbodimentMedia;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final class EmbodimentReferenceFramingKt$embodimentReferenceFraming$3 extends AbstractC7559F3s implements G0W<AXY, C3TG, Constraints, InterfaceC1134Abi> {
    public final /* synthetic */ Function0<Float> $bottomAlignmentFraction;
    public final /* synthetic */ AWA $content;
    public final /* synthetic */ VoiceEmbodimentMedia.ReferenceFraming $framing;
    public final /* synthetic */ boolean $scaleToFill;

    /* renamed from: com.facebook.aura.partners.voice.ui.EmbodimentReferenceFramingKt$embodimentReferenceFraming$3$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0U<AYU, Unit> {
        public final /* synthetic */ Function0<Float> $bottomAlignmentFraction;
        public final /* synthetic */ AZE $child;
        public final /* synthetic */ AWA $content;
        public final /* synthetic */ VoiceEmbodimentMedia.ReferenceFraming $framing;
        public final /* synthetic */ boolean $scaleToFill;
        public final /* synthetic */ long $viewport;

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(AYU ayu) {
            C7384Etj.A0Y(ayu, 0);
            AaC aaCM1801embodimentReferenceBoundse4CFRc8 = EmbodimentReferenceFramingKt.m1801embodimentReferenceBoundse4CFRc8(this.$content.A00, this.$viewport, this.$framing, this.$scaleToFill, AnonymousClass003.A04(this.$bottomAlignmentFraction));
            ayu.A0A(this.$child, 0.0f, Ab3.A01(aaCM1801embodimentReferenceBoundse4CFRc8.A01), Ab3.A01(aaCM1801embodimentReferenceBoundse4CFRc8.A03));
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(AWA awa, long j, VoiceEmbodimentMedia.ReferenceFraming referenceFraming, boolean z, Function0<Float> function0, AZE aze) {
            super(1);
            this.$content = awa;
            this.$viewport = j;
            this.$framing = referenceFraming;
            this.$scaleToFill = z;
            this.$bottomAlignmentFraction = function0;
            this.$child = aze;
        }

        @Override // X.G0U
        public /* bridge */ /* synthetic */ Unit invoke(AYU ayu) {
            invoke2(ayu);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EmbodimentReferenceFramingKt$embodimentReferenceFraming$3(AWA awa, VoiceEmbodimentMedia.ReferenceFraming referenceFraming, boolean z, Function0<Float> function0) {
        super(3);
        this.$content = awa;
        this.$framing = referenceFraming;
        this.$scaleToFill = z;
        this.$bottomAlignmentFraction = function0;
    }

    @Override // X.G0W
    public /* bridge */ /* synthetic */ InterfaceC1134Abi invoke(AXY axy, C3TG c3tg, Constraints constraints) {
        return m1808invoke3p2s80s(axy, c3tg, constraints.A00);
    }

    /* renamed from: invoke-3p2s80s, reason: not valid java name */
    public final InterfaceC1134Abi m1808invoke3p2s80s(AXY axy, C3TG c3tg, long j) {
        AnonymousClass003.A0u(axy, c3tg);
        int iA01 = Constraints.A01(j);
        int iA00 = Constraints.A00(j);
        long jA0A = AnonymousClass007.A0A(iA01, iA00);
        AaC aaCM1801embodimentReferenceBoundse4CFRc8 = EmbodimentReferenceFramingKt.m1801embodimentReferenceBoundse4CFRc8(this.$content.A00, jA0A, this.$framing, this.$scaleToFill, 0.0f);
        return AXY.A01(axy, new AnonymousClass1(this.$content, jA0A, this.$framing, this.$scaleToFill, this.$bottomAlignmentFraction, c3tg.AQW(Constraints.A04(Ab3.A01(aaCM1801embodimentReferenceBoundse4CFRc8.A02 - aaCM1801embodimentReferenceBoundse4CFRc8.A01), Ab3.A01(aaCM1801embodimentReferenceBoundse4CFRc8.A00 - aaCM1801embodimentReferenceBoundse4CFRc8.A03)))), iA01, iA00);
    }
}
