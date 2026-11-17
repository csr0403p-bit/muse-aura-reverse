package com.facebook.aura.conversation.view.richcontent;

import X.AKQ;
import X.AVy;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.AxM;
import X.B18;
import X.B1U;
import X.B1V;
import X.B6A;
import X.BBI;
import X.BFM;
import X.BJe;
import X.BOf;
import X.BRg;
import X.C00x;
import X.C0v5;
import X.C10G;
import X.C11U;
import X.C1515AkP;
import X.C1544Al7;
import X.C1D3;
import X.C1D8;
import X.C1DM;
import X.C1SA;
import X.C1YD;
import X.C2VU;
import X.C3Ue;
import X.C7197Ei9;
import X.C78N;
import X.F60;
import X.G0U;
import X.G0V;
import X.HDi;
import X.HxS;
import X.InterfaceC1380AiA;
import X.InterfaceC1516AkQ;
import X.InterfaceC2178B0w;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.Alignment;
import com.facebook.aura.R;
import com.facebook.aura.analytics.hatch.HatchScreen;
import com.facebook.aura.vds.compose.icons.AuraIconKt;
import com.facebook.aura.vds.compose.icons.AuraIconSize;
import com.facebook.aura.vds.compose.image.AuraImageKt;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchInlineImageKt$HatchInlineVideoThumbnail$content$1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ boolean $effectiveDeleted;
    public final /* synthetic */ String $effectiveThumbnailUrl;
    public final /* synthetic */ C1DM $imageShape;
    public final /* synthetic */ boolean $isUnavailable;
    public final /* synthetic */ MutableState<InterfaceC2178B0w> $localThumbnail$delegate;
    public final /* synthetic */ BRg $modifier;
    public final /* synthetic */ Function0<Unit> $onClick;
    public final /* synthetic */ float $posterAspectRatio;
    public final /* synthetic */ String $sharedElementKey;
    public final /* synthetic */ boolean $showsPlayIcon;
    public final /* synthetic */ Map<String, String> $threadLogMetadata;
    public final /* synthetic */ MutableState<Integer> $thumbnailIndex$delegate;
    public final /* synthetic */ HatchScreen $videoScreen;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchInlineImageKt$HatchInlineVideoThumbnail$content$1(BRg bRg, boolean z, Function0<Unit> function0, HatchScreen hatchScreen, Map<String, String> map, C1DM c1dm, float f, String str, MutableState<Integer> mutableState, String str2, boolean z2, boolean z3, MutableState<InterfaceC2178B0w> mutableState2) {
        super(2);
        this.$modifier = bRg;
        this.$isUnavailable = z;
        this.$onClick = function0;
        this.$videoScreen = hatchScreen;
        this.$threadLogMetadata = map;
        this.$imageShape = c1dm;
        this.$posterAspectRatio = f;
        this.$effectiveThumbnailUrl = str;
        this.$thumbnailIndex$delegate = mutableState;
        this.$sharedElementKey = str2;
        this.$showsPlayIcon = z2;
        this.$effectiveDeleted = z3;
        this.$localThumbnail$delegate = mutableState2;
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        invoke(bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(BFM bfm, int i) {
        BBI bbiA0M;
        BRg bRgA02;
        BRg bRg;
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(i & 3, 2), bfm, i)) {
            BRg bRgA0A = C10G.A0A(C10G.A0D(this.$modifier, Float.NaN, 220.0f), Float.NaN, 220.0f);
            if (!this.$isUnavailable) {
                bfm.AgE(1303835637);
                bRgA02 = BRg.A00;
                bRg = bRgA02;
                Function0<Unit> function0 = this.$onClick;
                HatchScreen hatchScreen = this.$videoScreen;
                Map<String, String> map = this.$threadLogMetadata;
                if (function0 != null) {
                    C1YD c1yd = new C1YD(0);
                    boolean zA1O = AnonymousClass003.A1O(bfm, map, function0, AnonymousClass002.A1U(bfm, hatchScreen));
                    Object objAaT = bfm.AaT();
                    if (zA1O || objAaT == C78N.A00) {
                        objAaT = new HatchInlineImageKt$HatchInlineVideoThumbnail$content$1$1$1$1(hatchScreen, map, function0);
                        bfm.Ai0(objAaT);
                    }
                    bRgA02 = C0v5.A02(bRgA02, c1yd, objAaT, null);
                }
                bbiA0M = (BBI) bfm;
                BBI.A0R(bbiA0M, false);
            } else {
                bbiA0M = AnonymousClass002.A0M(bfm, 1304177691);
                bRgA02 = BRg.A00;
                bRg = bRgA02;
            }
            BRg bRgThen = bRgA0A.then(bRgA02);
            Alignment alignment = C2VU.A09;
            boolean z = this.$isUnavailable;
            C1DM c1dm = this.$imageShape;
            float f = this.$posterAspectRatio;
            String str = this.$effectiveThumbnailUrl;
            MutableState<Integer> mutableState = this.$thumbnailIndex$delegate;
            String str2 = this.$sharedElementKey;
            boolean z2 = this.$showsPlayIcon;
            boolean z3 = this.$effectiveDeleted;
            MutableState<InterfaceC2178B0w> mutableState2 = this.$localThumbnail$delegate;
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
            if (z) {
                bfm.AgE(488747156);
                HatchInlineImageKt.MediaNotAvailableView(C11U.A03(bRg, c1dm), f, bfm, 0, 0);
                BBI.A0R(bbiA0M, false);
            } else {
                if (str != null) {
                    bfm.AgE(488907457);
                    BRg bRgA00 = BJe.A00(C10G.A01, f, false);
                    C7197Ei9 c7197Ei9A0Z = AnonymousClass005.A0Z(C7197Ei9.A0P);
                    B1U b1uA00 = B1V.A00(bfm, new HatchInlineImageKt$HatchInlineVideoThumbnail$content$1$2$1(f), 1419149248);
                    boolean zA65 = bfm.A65(mutableState);
                    Object objAaT2 = bfm.AaT();
                    if (zA65 || objAaT2 == C78N.A00) {
                        objAaT2 = new HatchInlineImageKt$HatchInlineVideoThumbnail$content$1$2$2$1(mutableState);
                        bfm.Ai0(objAaT2);
                    }
                    Function0 function03 = (Function0) objAaT2;
                    boolean zA652 = bfm.A65(str2);
                    Object objAaT3 = bfm.AaT();
                    if (zA652 || objAaT3 == C78N.A00) {
                        objAaT3 = new HatchInlineImageKt$HatchInlineVideoThumbnail$content$1$2$3$1(str2);
                        bfm.Ai0(objAaT3);
                    }
                    z = false;
                    AuraImageKt.AuraImage(str, bRgA00, c7197Ei9A0Z, null, null, false, b1uA00, function03, true, (G0U) objAaT3, bfm, 102236160, 56);
                } else {
                    z = false;
                    bfm.AgE(489384888);
                    float f2 = HatchInlineImageKt.DefaultInlineImageSize;
                    InterfaceC2178B0w value = mutableState2.getValue();
                    if (value != null) {
                        bfm.AgE(489445927);
                        C1SA.A01(bfm, null, BJe.A00(C10G.A01, f, false), value, B18.A00, null, 24624, 232);
                    } else {
                        bfm.AgE(489684472);
                        HatchInlineImageKt.VideoPosterPlaceholder(f, null, bfm, 0, 2);
                    }
                    BBI.A0R(bbiA0M, false);
                }
                BBI.A0R(bbiA0M, false);
            }
            if (z2 && !z && !z3) {
                long j = AnonymousClass003.A0c(bfm, 489831536).shadow;
                long jA04 = HxS.A04(HDi.A0O[(int) (j & 63)], B6A.A03(j), B6A.A02(j), B6A.A01(j), 0.15f);
                C1D3 c1d3 = C1D8.A00;
                boolean zA64 = bfm.A64(jA04);
                Object objAaT4 = bfm.AaT();
                if (zA64 || objAaT4 == C78N.A00) {
                    objAaT4 = new HatchInlineImageKt$HatchInlineVideoThumbnail$content$1$2$4$1(jA04);
                    bfm.Ai0(objAaT4);
                }
                AuraIconKt.m2567AuraIconFHprtrg(new C1544Al7(c1d3, (G0U) objAaT4), BOf.A00(bfm, R.drawable.media_play_wght400_filled_24, 0), AuraIconSize.MEDIUM, null, B6A.A08, null, bfm, (AVy.$stable << 3) | 24960, 40);
            } else {
                bfm.AgE(490268791);
            }
            AnonymousClass003.A0q(bbiA0M);
            return;
        }
        bfm.Afo();
    }
}
