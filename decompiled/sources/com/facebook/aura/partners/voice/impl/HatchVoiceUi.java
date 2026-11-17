package com.facebook.aura.partners.voice.impl;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass011;
import X.BBb;
import X.BFM;
import X.BRg;
import X.C7384Etj;
import X.G0V;
import X.G0W;
import X.InterfaceC05151eP;
import com.facebook.aura.partners.voice.intf.VoiceUi;
import com.facebook.aura.partners.voice.screen.ComposerVoiceCallButtonKt;
import com.facebook.aura.partners.voice.screen.HatchVoiceEmbodimentHostKt;
import com.facebook.aura.partners.voice.screen.HatchVoiceNuxSheetKt;
import com.facebook.aura.partners.voice.screen.VoiceCallCompactControlsKt;
import com.facebook.aura.partners.voice.screen.VoiceCallCurrentCaptionKt;
import com.facebook.aura.partners.voice.screen.VoiceCallSurfacesKt;
import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public final class HatchVoiceUi implements VoiceUi {
    public static final HatchVoiceUi INSTANCE = new HatchVoiceUi();

    /* renamed from: com.facebook.aura.partners.voice.impl.HatchVoiceUi$CallLifecycleEffect$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(int i) {
            super(2);
            this.$$changed = i;
        }

        public final void invoke(BFM bfm, int i) {
            HatchVoiceUi.this.CallLifecycleEffect(bfm, AnonymousClass011.A00(this.$$changed));
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.partners.voice.impl.HatchVoiceUi$CallNuxContent$1, reason: invalid class name and case insensitive filesystem */
    public final class C130921 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onContinue;
        public final /* synthetic */ Function0<Unit> $onNotNow;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C130921(Function0<Unit> function0, Function0<Unit> function02, BRg bRg, int i) {
            super(2);
            this.$onContinue = function0;
            this.$onNotNow = function02;
            this.$modifier = bRg;
            this.$$changed = i;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            HatchVoiceUi.this.CallNuxContent(this.$onContinue, this.$onNotNow, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed));
        }
    }

    /* renamed from: com.facebook.aura.partners.voice.impl.HatchVoiceUi$CompactCallCaption$1, reason: invalid class name and case insensitive filesystem */
    public final class C130931 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ BRg $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C130931(BRg bRg, int i) {
            super(2);
            this.$modifier = bRg;
            this.$$changed = i;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            HatchVoiceUi.this.CompactCallCaption(this.$modifier, bfm, AnonymousClass011.A00(this.$$changed));
        }
    }

    /* renamed from: com.facebook.aura.partners.voice.impl.HatchVoiceUi$CompactCallCaptionToggle$1, reason: invalid class name and case insensitive filesystem */
    public final class C130941 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ BRg $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C130941(BRg bRg, int i) {
            super(2);
            this.$modifier = bRg;
            this.$$changed = i;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            HatchVoiceUi.this.CompactCallCaptionToggle(this.$modifier, bfm, AnonymousClass011.A00(this.$$changed));
        }
    }

    /* renamed from: com.facebook.aura.partners.voice.impl.HatchVoiceUi$CompactCallEndButton$1, reason: invalid class name and case insensitive filesystem */
    public final class C130951 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ BRg $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C130951(BRg bRg, int i) {
            super(2);
            this.$modifier = bRg;
            this.$$changed = i;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            HatchVoiceUi.this.CompactCallEndButton(this.$modifier, bfm, AnonymousClass011.A00(this.$$changed));
        }
    }

    /* renamed from: com.facebook.aura.partners.voice.impl.HatchVoiceUi$CompactCallMuteButton$1, reason: invalid class name and case insensitive filesystem */
    public final class C130961 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ BRg $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C130961(BRg bRg, int i) {
            super(2);
            this.$modifier = bRg;
            this.$$changed = i;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            HatchVoiceUi.this.CompactCallMuteButton(this.$modifier, bfm, AnonymousClass011.A00(this.$$changed));
        }
    }

    /* renamed from: com.facebook.aura.partners.voice.impl.HatchVoiceUi$ComposerCallButton$1, reason: invalid class name and case insensitive filesystem */
    public final class C130971 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onClick;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C130971(Function0<Unit> function0, BRg bRg, int i) {
            super(2);
            this.$onClick = function0;
            this.$modifier = bRg;
            this.$$changed = i;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            HatchVoiceUi.this.ComposerCallButton(this.$onClick, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed));
        }
    }

    /* renamed from: com.facebook.aura.partners.voice.impl.HatchVoiceUi$EmbodimentHost$1, reason: invalid class name and case insensitive filesystem */
    public final class C130981 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ G0W<InterfaceC05151eP, BFM, Integer, Unit> $content;
        public final /* synthetic */ boolean $isCompactHost;
        public final /* synthetic */ BRg $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C130981(BRg bRg, boolean z, G0W<? super InterfaceC05151eP, ? super BFM, ? super Integer, Unit> g0w, int i) {
            super(2);
            this.$modifier = bRg;
            this.$isCompactHost = z;
            this.$content = g0w;
            this.$$changed = i;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            HatchVoiceUi.this.EmbodimentHost(this.$modifier, this.$isCompactHost, this.$content, bfm, AnonymousClass011.A00(this.$$changed));
        }
    }

    @Override // com.facebook.aura.partners.voice.intf.VoiceUi
    public void CallNuxContent(Function0<Unit> function0, Function0<Unit> function02, BRg bRg, BFM bfm, int i) {
        AnonymousClass005.A0x(function0, function02, bRg);
        bfm.AgG(1966239334);
        int iA0T = (i & 6) == 0 ? AnonymousClass004.A0T(bfm, function0) | i : i;
        if ((i & 48) == 0) {
            iA0T |= AnonymousClass004.A0U(bfm, function02);
        }
        if ((i & 384) == 0) {
            iA0T |= AnonymousClass004.A0f(bfm, bRg);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1J(iA0T), bfm, iA0T)) {
            int i2 = iA0T << 3;
            HatchVoiceNuxSheetKt.HatchVoiceNuxContent(null, function0, function02, bRg, null, bfm, AnonymousClass002.A08(i2, (i2 & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX) | 6), 16);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C130921(function0, function02, bRg, i);
        }
    }

    @Override // com.facebook.aura.partners.voice.intf.VoiceUi
    public void CompactCallCaption(BRg bRg, BFM bfm, int i) {
        C7384Etj.A0Y(bRg, 0);
        bfm.AgG(-833840769);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, bRg) | i : i;
        if (AnonymousClass001.A1b(AnonymousClass003.A1A(iA0d), bfm, iA0d)) {
            VoiceCallCurrentCaptionKt.VoiceCallCurrentCaption(bRg, false, null, bfm, iA0d & 14, 6);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C130931(bRg, i);
        }
    }

    @Override // com.facebook.aura.partners.voice.intf.VoiceUi
    public void CompactCallCaptionToggle(BRg bRg, BFM bfm, int i) {
        C7384Etj.A0Y(bRg, 0);
        bfm.AgG(1377324747);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, bRg) | i : i;
        if (AnonymousClass001.A1b(AnonymousClass003.A1A(iA0d), bfm, iA0d)) {
            VoiceCallCompactControlsKt.VoiceCallCompactCaptionToggle(bRg, bfm, iA0d & 14, 0);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C130941(bRg, i);
        }
    }

    @Override // com.facebook.aura.partners.voice.intf.VoiceUi
    public void CompactCallEndButton(BRg bRg, BFM bfm, int i) {
        C7384Etj.A0Y(bRg, 0);
        bfm.AgG(-1883575656);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, bRg) | i : i;
        if (AnonymousClass001.A1b(AnonymousClass003.A1A(iA0d), bfm, iA0d)) {
            VoiceCallCompactControlsKt.VoiceCallCompactEndButton(bRg, bfm, iA0d & 14, 0);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C130951(bRg, i);
        }
    }

    @Override // com.facebook.aura.partners.voice.intf.VoiceUi
    public void CompactCallMuteButton(BRg bRg, BFM bfm, int i) {
        C7384Etj.A0Y(bRg, 0);
        bfm.AgG(1032242132);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, bRg) | i : i;
        if (AnonymousClass001.A1b(AnonymousClass003.A1A(iA0d), bfm, iA0d)) {
            VoiceCallCompactControlsKt.VoiceCallCompactMuteButton(bRg, bfm, iA0d & 14, 0);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C130961(bRg, i);
        }
    }

    @Override // com.facebook.aura.partners.voice.intf.VoiceUi
    public void EmbodimentHost(BRg bRg, boolean z, G0W<? super InterfaceC05151eP, ? super BFM, ? super Integer, Unit> g0w, BFM bfm, int i) {
        AnonymousClass002.A1A(bRg, 0, g0w);
        bfm.AgG(892361952);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, bRg) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0o(bfm, z);
        }
        if ((i & 384) == 0) {
            iA0d |= AnonymousClass004.A0V(bfm, g0w);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1J(iA0d), bfm, iA0d)) {
            HatchVoiceEmbodimentHostKt.HatchVoiceEmbodimentHost(bRg, z, g0w, bfm, iA0d & 1022, 0);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C130981(bRg, z, g0w, i);
        }
    }

    @Override // com.facebook.aura.partners.voice.intf.VoiceUi
    public void CallLifecycleEffect(BFM bfm, int i) {
        bfm.AgG(-843867444);
        int i2 = i & 1;
        if (bfm.AfS(i2, AnonymousClass002.A1L(i2))) {
            VoiceCallSurfacesKt.VoiceCallLifecycleEffect(bfm, 0);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass1(i);
        }
    }

    @Override // com.facebook.aura.partners.voice.intf.VoiceUi
    public void ComposerCallButton(Function0<Unit> function0, BRg bRg, BFM bfm, int i) {
        boolean zA1b = AnonymousClass004.A1b(function0, bRg);
        bfm.AgG(-1670433944);
        int iA0T = (i & 6) == 0 ? AnonymousClass004.A0T(bfm, function0) | i : i;
        if ((i & 48) == 0) {
            iA0T |= AnonymousClass004.A0e(bfm, bRg);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1H(iA0T), bfm, iA0T)) {
            ComposerVoiceCallButtonKt.ComposerVoiceCallButton(function0, bRg, bfm, iA0T & 126, zA1b ? 1 : 0);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C130971(function0, bRg, i);
        }
    }
}
