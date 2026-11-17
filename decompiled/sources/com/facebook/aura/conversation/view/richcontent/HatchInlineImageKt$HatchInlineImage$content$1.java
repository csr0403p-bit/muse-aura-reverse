package com.facebook.aura.conversation.view.richcontent;

import X.AKQ;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.AxM;
import X.BBI;
import X.BFM;
import X.BRg;
import X.C00x;
import X.C0v5;
import X.C10G;
import X.C1515AkP;
import X.C1YD;
import X.C2VU;
import X.C3Ue;
import X.C7197Ei9;
import X.C78N;
import X.F60;
import X.G0U;
import X.G0V;
import X.InterfaceC1380AiA;
import X.InterfaceC1516AkQ;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.Alignment;
import com.facebook.aura.analytics.hatch.HatchComponent;
import com.facebook.aura.analytics.hatch.HatchImpressionModifierKt;
import com.facebook.aura.analytics.hatch.HatchOrigin;
import com.facebook.aura.analytics.hatch.HatchScreen;
import com.facebook.aura.analytics.hatch.HatchSubsurface;
import com.facebook.aura.analytics.hatch.HatchSurface;
import com.facebook.aura.vds.compose.image.AuraImageKt;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchInlineImageKt$HatchInlineImage$content$1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ String $alt;
    public final /* synthetic */ MutableState<Boolean> $hasError$delegate;
    public final /* synthetic */ C7197Ei9 $imageOptions;
    public final /* synthetic */ HatchScreen $inlineImageScreen;
    public final /* synthetic */ boolean $isSvg;
    public final /* synthetic */ BRg $modifier;
    public final /* synthetic */ Function0<Unit> $onClick;
    public final /* synthetic */ G0U<String, Unit> $onImageError;
    public final /* synthetic */ String $sharedElementKey;
    public final /* synthetic */ float $size;
    public final /* synthetic */ Map<String, String> $threadLogMetadata;
    public final /* synthetic */ String $url;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HatchInlineImageKt$HatchInlineImage$content$1(String str, BRg bRg, boolean z, float f, Function0<Unit> function0, MutableState<Boolean> mutableState, HatchScreen hatchScreen, Map<String, String> map, String str2, C7197Ei9 c7197Ei9, G0U<? super String, Unit> g0u, String str3) {
        super(2);
        this.$alt = str;
        this.$modifier = bRg;
        this.$isSvg = z;
        this.$size = f;
        this.$onClick = function0;
        this.$hasError$delegate = mutableState;
        this.$inlineImageScreen = hatchScreen;
        this.$threadLogMetadata = map;
        this.$url = str2;
        this.$imageOptions = c7197Ei9;
        this.$onImageError = g0u;
        this.$sharedElementKey = str3;
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        invoke(bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(BFM bfm, int i) {
        BRg bRgA0F;
        BBI bbiA0M;
        BRg bRgA02;
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(i & 3, 2), bfm, i)) {
            String str = this.$alt;
            MutableState<Boolean> mutableState = this.$hasError$delegate;
            float f = HatchInlineImageKt.DefaultInlineImageSize;
            String strInlineImageDescription = HatchInlineImageKt.inlineImageDescription(str, MutableState.A0A((MutableState) mutableState), bfm, 0);
            BRg bRg = this.$modifier;
            boolean z = this.$isSvg;
            BRg bRg2 = BRg.A00;
            if (z) {
                bRgA0F = C10G.A07(bRg2, this.$size);
            } else {
                float f2 = this.$size;
                bRgA0F = C10G.A0F(bRg2, Float.NaN, Float.NaN, f2, f2);
            }
            BRg bRgHatchImpression = HatchImpressionModifierKt.hatchImpression(bRg.then(bRgA0F), HatchOrigin.CHAT, HatchSurface.CHAT, HatchSubsurface.MESSAGE_LIST, HatchScreen.MAIN_CHAT, HatchComponent.INLINE_IMAGE, null, null, null, 500L, 0.0f, null, null, null);
            boolean zA65 = bfm.A65(strInlineImageDescription);
            Object objAaT = bfm.AaT();
            if (zA65 || objAaT == C78N.A00) {
                objAaT = new HatchInlineImageKt$HatchInlineImage$content$1$1$1(strInlineImageDescription);
                bfm.Ai0(objAaT);
            }
            BRg bRgA0Y = AnonymousClass001.A0Y(bRgHatchImpression, objAaT, false);
            if (!MutableState.A0A((MutableState) this.$hasError$delegate)) {
                bfm.AgE(-2977035);
                bRgA02 = bRg2;
                Function0<Unit> function0 = this.$onClick;
                HatchScreen hatchScreen = this.$inlineImageScreen;
                Map<String, String> map = this.$threadLogMetadata;
                if (function0 != null) {
                    C1YD c1yd = new C1YD(0);
                    boolean zA1O = AnonymousClass003.A1O(bfm, map, function0, AnonymousClass002.A1U(bfm, hatchScreen));
                    Object objAaT2 = bfm.AaT();
                    if (zA1O || objAaT2 == C78N.A00) {
                        objAaT2 = new HatchInlineImageKt$HatchInlineImage$content$1$2$1$1(hatchScreen, map, function0);
                        bfm.Ai0(objAaT2);
                    }
                    bRgA02 = C0v5.A02(bRg2, c1yd, objAaT2, null);
                }
                bbiA0M = (BBI) bfm;
                BBI.A0R(bbiA0M, false);
            } else {
                bbiA0M = AnonymousClass002.A0M(bfm, -2643630);
                bRgA02 = bRg2;
            }
            BRg bRgThen = bRgA0Y.then(bRgA02);
            Alignment alignment = C2VU.A09;
            boolean z2 = this.$isSvg;
            String str2 = this.$url;
            C7197Ei9 c7197Ei9 = this.$imageOptions;
            MutableState<Boolean> mutableState2 = this.$hasError$delegate;
            G0U<String, Unit> g0u = this.$onImageError;
            String str3 = this.$sharedElementKey;
            InterfaceC1380AiA interfaceC1380AiAA01 = C3Ue.A01(alignment, false);
            int iA0J = AnonymousClass003.A0J(bbiA0M);
            AKQ akqA04 = BBI.A04(bbiA0M);
            BRg bRgA01 = AxM.A01(bfm, bRgThen);
            Function0<InterfaceC1516AkQ> function02 = C1515AkP.A00;
            if (bbiA0M.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbiA0M, function02);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA01, akqA04, bRgA01, iA0J);
            if (!MutableState.A0A((MutableState) mutableState2)) {
                bfm.AgE(238542056);
                if (z2) {
                    bRg2 = C10G.A01;
                }
                boolean z3 = !z2;
                boolean zA1R = AnonymousClass005.A1R(bfm, mutableState2, g0u, str2);
                Object objAaT3 = bfm.AaT();
                if (zA1R || objAaT3 == C78N.A00) {
                    objAaT3 = new HatchInlineImageKt$HatchInlineImage$content$1$3$1$1(g0u, str2, mutableState2);
                    bfm.Ai0(objAaT3);
                }
                Function0 function03 = (Function0) objAaT3;
                boolean zA1T = AnonymousClass003.A1T(bfm, str3, z2);
                Object objAaT4 = bfm.AaT();
                if (zA1T || objAaT4 == C78N.A00) {
                    objAaT4 = new HatchInlineImageKt$HatchInlineImage$content$1$3$2$1(str3, z2);
                    bfm.Ai0(objAaT4);
                }
                AuraImageKt.AuraImage(str2, bRg2, c7197Ei9, null, null, z3, null, function03, true, (G0U) objAaT4, bfm, 100663296, 88);
            } else {
                bfm.AgE(239012729);
                HatchInlineImageKt.MediaNotAvailableView(null, 0.0f, bfm, 0, 3);
            }
            AnonymousClass003.A0q(bbiA0M);
            return;
        }
        bfm.Afo();
    }
}
