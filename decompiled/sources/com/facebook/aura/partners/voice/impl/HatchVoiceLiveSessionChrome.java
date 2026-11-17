package com.facebook.aura.partners.voice.impl;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass011;
import X.B1V;
import X.BBb;
import X.BFM;
import X.BRg;
import X.C7384Etj;
import X.G0V;
import X.G0W;
import X.InterfaceC05151eP;
import com.facebook.aura.livesession.api.LiveSessionChrome;
import com.facebook.aura.partners.voice.chrome.VoiceCallChromeKt;
import com.facebook.aura.partners.voice.chrome.VoiceFloatingCallControlsKt;
import com.facebook.aura.partners.voice.screen.HatchVoiceEmbodimentHostKt;
import com.facebook.aura.partners.voice.screen.VoiceCallCaptionOverlayKt;
import com.facebook.aura.partners.voice.screen.VoiceCallSurfacesKt;
import com.facebook.aura.partners.voice.screen.VoiceEmbodimentDragHandleKt;
import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public final class HatchVoiceLiveSessionChrome implements LiveSessionChrome {
    public static final HatchVoiceLiveSessionChrome INSTANCE = new HatchVoiceLiveSessionChrome();

    /* renamed from: com.facebook.aura.partners.voice.impl.HatchVoiceLiveSessionChrome$ContentEffects$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(int i) {
            super(2);
            this.$$changed = i;
        }

        public final void invoke(BFM bfm, int i) {
            HatchVoiceLiveSessionChrome.this.ContentEffects(bfm, AnonymousClass011.A00(this.$$changed));
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.partners.voice.impl.HatchVoiceLiveSessionChrome$FloatingLayer$1, reason: invalid class name and case insensitive filesystem */
    public final class C130901 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ boolean $visible;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C130901(boolean z, BRg bRg, int i) {
            super(2);
            this.$visible = z;
            this.$modifier = bRg;
            this.$$changed = i;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            HatchVoiceLiveSessionChrome.this.FloatingLayer(this.$visible, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed));
        }
    }

    /* renamed from: com.facebook.aura.partners.voice.impl.HatchVoiceLiveSessionChrome$Host$1, reason: invalid class name and case insensitive filesystem */
    public final class C130911 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ G0W<InterfaceC05151eP, BFM, Integer, Unit> $content;
        public final /* synthetic */ BRg $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C130911(BRg bRg, G0W<? super InterfaceC05151eP, ? super BFM, ? super Integer, Unit> g0w) {
            super(2);
            this.$modifier = bRg;
            this.$content = g0w;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            if (AnonymousClass001.A1b(AnonymousClass002.A1P(i & 3, 2), bfm, i)) {
                HatchVoiceEmbodimentHostKt.HatchVoiceEmbodimentHost(this.$modifier, false, this.$content, bfm, 0, 2);
            } else {
                bfm.Afo();
            }
        }
    }

    /* renamed from: com.facebook.aura.partners.voice.impl.HatchVoiceLiveSessionChrome$Host$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ G0W<InterfaceC05151eP, BFM, Integer, Unit> $content;
        public final /* synthetic */ BRg $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass2(BRg bRg, G0W<? super InterfaceC05151eP, ? super BFM, ? super Integer, Unit> g0w, int i) {
            super(2);
            this.$modifier = bRg;
            this.$content = g0w;
            this.$$changed = i;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            HatchVoiceLiveSessionChrome.this.Host(this.$modifier, this.$content, bfm, AnonymousClass011.A00(this.$$changed));
        }
    }

    @Override // com.facebook.aura.livesession.api.LiveSessionChrome
    public void FloatingLayer(boolean z, BRg bRg, BFM bfm, int i) {
        C7384Etj.A0Y(bRg, 1);
        bfm.AgG(1200584091);
        int iA0n = (i & 6) == 0 ? AnonymousClass004.A0n(bfm, z) | i : i;
        if ((i & 48) == 0) {
            iA0n |= AnonymousClass004.A0e(bfm, bRg);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0n & 19, 18), bfm, iA0n)) {
            Function0<Boolean> function0RememberVoiceCallCaptionSurface = VoiceCallCaptionOverlayKt.rememberVoiceCallCaptionSurface(bfm, 0);
            VoiceCallCaptionOverlayKt.VoiceCallCaptionOverlay(z, function0RememberVoiceCallCaptionSurface, bRg, bfm, (iA0n & 14) | ((iA0n << 3) & 896), 0);
            int i2 = iA0n & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX;
            VoiceEmbodimentDragHandleKt.VoiceEmbodimentDragHandle(z, bRg, bfm, iA0n & 126, 0);
            VoiceFloatingCallControlsKt.VoiceFloatingCallControls(function0RememberVoiceCallCaptionSurface, bRg, z, null, bfm, i2 | ((iA0n << 6) & 896), 8);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C130901(z, bRg, i);
        }
    }

    @Override // com.facebook.aura.livesession.api.LiveSessionChrome
    public void ContentEffects(BFM bfm, int i) {
        bfm.AgG(921991376);
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

    @Override // com.facebook.aura.livesession.api.LiveSessionChrome
    public void Host(BRg bRg, G0W<? super InterfaceC05151eP, ? super BFM, ? super Integer, Unit> g0w, BFM bfm, int i) {
        AnonymousClass003.A0u(bRg, g0w);
        bfm.AgG(1396250968);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, bRg) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0U(bfm, g0w);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1H(iA0d), bfm, iA0d)) {
            VoiceCallChromeKt.ProvideVoiceCallChrome(B1V.A00(bfm, new C130911(bRg, g0w), -985644894), bfm, 6);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass2(bRg, g0w, i);
        }
    }
}
