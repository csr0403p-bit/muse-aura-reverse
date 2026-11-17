package com.facebook.aura.conversation.view;

import X.AKQ;
import X.AbstractC0878AGe;
import X.AbstractC3358CGz;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.AnonymousClass007;
import X.AnonymousClass011;
import X.AxM;
import X.BBI;
import X.BBb;
import X.BFM;
import X.BJe;
import X.BPg;
import X.BRg;
import X.BS0;
import X.C00x;
import X.C06G;
import X.C0v5;
import X.C1062ATq;
import X.C10G;
import X.C11U;
import X.C1515AkP;
import X.C1BO;
import X.C1D3;
import X.C1D8;
import X.C1YD;
import X.C1b8;
import X.C2CK;
import X.C2VU;
import X.C3TH;
import X.C3U4;
import X.C7384Etj;
import X.C78N;
import X.C7Je;
import X.F60;
import X.G0U;
import X.G0V;
import X.InterfaceC1380AiA;
import X.InterfaceC1492Ajz;
import X.InterfaceC1516AkQ;
import android.net.Uri;
import com.facebook.aura.analytics.hatch.HatchComponent;
import com.facebook.aura.analytics.hatch.HatchInteractionLogger;
import com.facebook.aura.analytics.hatch.HatchScreen;
import com.facebook.aura.analytics.hatch.HatchSubsurface;
import com.facebook.aura.analytics.hatch.HatchSurface;
import com.facebook.aura.avatarassets.appearance.HatchAvatarAppearanceKt;
import com.facebook.aura.common.video.HatchVideoPlayer;
import com.facebook.aura.common.video.HatchVideoPlayerComposableKt;
import com.facebook.aura.common.video.RememberHatchVideoPlayerKt;
import com.facebook.aura.conversation.view.richcontent.CurrentChatThreadLogMetadataKt;
import com.facebook.aura.gateway.AvatarMediaUrlsKt;
import com.facebook.aura.identity.provider.HatchIdentityProvider;
import com.facebook.aura.model.AiIdentity;
import com.facebook.aura.model.AvatarMedia;
import com.facebook.aura.model.AvatarMediaSelectionKt;
import com.facebook.aura.model.AvatarSharePresentationData;
import com.facebook.aura.model.AvatarVideoVariant;
import com.facebook.aura.model.SelectedAvatarMedia;
import com.facebook.aura.vds.compose.base.AuraDimensKt;
import com.facebook.aura.vds.compose.button.AuraButtonKt;
import com.facebook.aura.vds.compose.button.AuraButtonSize;
import com.facebook.aura.vds.compose.common.AuraDrawableSource;
import com.facebook.aura.vds.compose.image.AuraImageKt;
import com.facebook.aura.vds.compose.text.AuraTextKt;
import com.facebook.common.dextricks.RuntimeInternals;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public abstract class HatchAvatarShareWidgetKt {

    /* renamed from: com.facebook.aura.conversation.view.HatchAvatarShareWidgetKt$AvatarShareAnimation$3, reason: invalid class name */
    public final class AnonymousClass3 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ AvatarSharePresentationData $data;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onClick;
        public final /* synthetic */ C1D3 $shape;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(AvatarSharePresentationData avatarSharePresentationData, C1D3 c1d3, Function0<Unit> function0, BRg bRg, int i, int i2) {
            super(2);
            this.$data = avatarSharePresentationData;
            this.$shape = c1d3;
            this.$onClick = function0;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            HatchAvatarShareWidgetKt.AvatarShareAnimation(this.$data, this.$shape, this.$onClick, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    public static final void AvatarShareAnimation(AvatarSharePresentationData avatarSharePresentationData, C1D3 c1d3, Function0<Unit> function0, BRg bRg, BFM bfm, int i, int i2) {
        AvatarMedia avatarMedia;
        String str;
        String strVideoUrl;
        BRg bRgA0Q = bRg;
        bfm.AgG(158493992);
        int iA05 = (i & 6) == 0 ? AnonymousClass002.A05(AnonymousClass004.A1X(avatarSharePresentationData, bfm, i) ? 1 : 0) | i : i;
        if ((i & 48) == 0) {
            iA05 |= AnonymousClass004.A0e(bfm, c1d3);
        }
        if ((i & 384) == 0) {
            iA05 |= AnonymousClass004.A0V(bfm, function0);
        }
        int i3 = i2 & 8;
        if (i3 != 0) {
            iA05 |= 3072;
        } else if ((i & 3072) == 0) {
            iA05 |= AnonymousClass004.A0g(bfm, bRgA0Q);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1L(iA05), bfm, iA05)) {
            if (i3 != 0) {
                bRgA0Q = BRg.A00;
            }
            AbstractC3358CGz abstractC3358CGzA0h = AnonymousClass002.A0h(bfm);
            boolean zA65 = bfm.A65(abstractC3358CGzA0h);
            Object objAaT = bfm.AaT();
            if (zA65 || objAaT == C78N.A00) {
                objAaT = HatchIdentityProvider.Companion.getInstance(abstractC3358CGzA0h);
                bfm.Ai0(objAaT);
            }
            HatchIdentityProvider hatchIdentityProvider = (HatchIdentityProvider) objAaT;
            C1BO c1boA02 = C2CK.A02(bfm, hatchIdentityProvider.aiIdentity);
            boolean zIsAvatarDark = HatchAvatarAppearanceKt.isAvatarDark(bfm, 0);
            AiIdentity aiIdentity = (AiIdentity) c1boA02.getValue();
            Object objA01 = null;
            boolean zA1T = AnonymousClass003.A1T(bfm, aiIdentity != null ? aiIdentity.avatarMedia : null, zIsAvatarDark);
            Object objAaT2 = bfm.AaT();
            if (zA1T || objAaT2 == C78N.A00) {
                AiIdentity aiIdentity2 = (AiIdentity) c1boA02.getValue();
                objAaT2 = (aiIdentity2 == null || (avatarMedia = aiIdentity2.avatarMedia) == null) ? null : AvatarMediaSelectionKt.select(avatarMedia, zIsAvatarDark);
                bfm.Ai0(objAaT2);
            }
            SelectedAvatarMedia selectedAvatarMedia = (SelectedAvatarMedia) objAaT2;
            boolean zA1K = AnonymousClass003.A1K(bfm, selectedAvatarMedia, abstractC3358CGzA0h);
            Object objAaT3 = bfm.AaT();
            if (zA1K || objAaT3 == C78N.A00) {
                if (selectedAvatarMedia == null || (str = (String) AbstractC0878AGe.A0G(AvatarMediaUrlsKt.stillUrls(selectedAvatarMedia, abstractC3358CGzA0h))) == null) {
                    objAaT3 = null;
                } else {
                    objAaT3 = null;
                    try {
                        objAaT3 = C7Je.A01(str);
                    } catch (SecurityException | UnsupportedOperationException unused) {
                    }
                }
                bfm.Ai0(objAaT3);
            }
            AuraDrawableSource auraDrawableSourceRememberDefaultAvatarSource = hatchIdentityProvider.rememberDefaultAvatarSource((Uri) objAaT3, bfm, HatchIdentityProvider.$stable << 3, 0);
            if (selectedAvatarMedia != null) {
                strVideoUrl = AvatarMediaUrlsKt.videoUrl(selectedAvatarMedia, avatarSharePresentationData.videoVariant, abstractC3358CGzA0h);
                if (strVideoUrl == null) {
                    strVideoUrl = AvatarMediaUrlsKt.videoUrl(selectedAvatarMedia, AvatarVideoVariant.IDLE, abstractC3358CGzA0h);
                }
            } else {
                strVideoUrl = null;
            }
            boolean zA652 = bfm.A65(strVideoUrl);
            Object objAaT4 = bfm.AaT();
            if (zA652 || objAaT4 == C78N.A00) {
                if (strVideoUrl != null) {
                    objA01 = null;
                    try {
                        objA01 = C7Je.A01(strVideoUrl);
                    } catch (SecurityException | UnsupportedOperationException unused2) {
                    }
                    objAaT4 = objA01;
                } else {
                    objAaT4 = null;
                }
                bfm.Ai0(objA01);
            }
            Uri uri = (Uri) objAaT4;
            boolean z = false;
            BRg bRgA04 = C0v5.A04(C1b8.A01(C11U.A03(BJe.A00(AnonymousClass001.A0R(C10G.A0D(bRgA0Q, Float.NaN, 220.0f)), 1.0f, false), c1d3), AnonymousClass002.A0c(bfm).border), new C1YD(0), avatarSharePresentationData.buttonText, function0, true);
            if ((iA05 & 14) == 4 || ((iA05 & 8) != 0 && bfm.A67(avatarSharePresentationData))) {
                z = true;
            }
            Object objAaT5 = bfm.AaT();
            if (z || objAaT5 == C78N.A00) {
                objAaT5 = new HatchAvatarShareWidgetKt$AvatarShareAnimation$1$1(avatarSharePresentationData);
                bfm.Ai0(objAaT5);
            }
            BRg bRgA0Y = AnonymousClass001.A0Y(bRgA04, objAaT5, false);
            InterfaceC1380AiA interfaceC1380AiAA0c = AnonymousClass001.A0c(false);
            BBI bbi = (BBI) bfm;
            int iA0J = AnonymousClass003.A0J(bbi);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA0Y);
            Function0<InterfaceC1516AkQ> function02 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function02);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA0c, akqA04, bRgA01, iA0J);
            if (uri != null) {
                bfm.AgE(1126294223);
                HatchVideoPlayerComposableKt.HatchVideoPlayerComposable(C10G.A01, uri, RememberHatchVideoPlayerKt.rememberHatchVideoPlayer(HatchVideoPlayer.RepeatMode.ALL, true, true, bfm, 438, 0), strVideoUrl, auraDrawableSourceRememberDefaultAvatarSource, null, false, true, false, false, false, false, HatchVideoPlayer.ResizeMode.ZOOM, 0.0f, "hatch_avatar_share_widget", null, false, false, false, null, false, null, null, null, null, null, null, bfm, 113246214, 1597878, 0, 134128224);
            } else {
                bfm.AgE(1126967977);
                AuraImageKt.AuraImage(auraDrawableSourceRememberDefaultAvatarSource, C10G.A01, null, null, false, false, null, false, null, bfm, 12583344, 376);
            }
            bRgA0Q = AnonymousClass001.A0Q(bbi, bRgA0Q, false, true);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass3(avatarSharePresentationData, c1d3, function0, bRgA0Q, i, i2);
        }
    }

    /* renamed from: HatchAvatarShareWidget-T042LqI, reason: not valid java name */
    public static final void m536HatchAvatarShareWidgetT042LqI(AvatarSharePresentationData avatarSharePresentationData, C1D3 c1d3, long j, Function0<Unit> function0, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        C7384Etj.A0Y(avatarSharePresentationData, 0);
        AnonymousClass002.A1B(c1d3, 1, function0);
        bfm.AgG(-1533218979);
        int iA05 = (i & 6) == 0 ? AnonymousClass002.A05(AnonymousClass004.A1X(avatarSharePresentationData, bfm, i) ? 1 : 0) | i : i;
        if ((i & 48) == 0) {
            iA05 |= AnonymousClass004.A0e(bfm, c1d3);
        }
        if ((i & 384) == 0) {
            iA05 |= AnonymousClass004.A0O(bfm, j);
        }
        if ((i & 3072) == 0) {
            iA05 |= AnonymousClass004.A0W(bfm, function0);
        }
        int i3 = i2 & 16;
        if (i3 != 0) {
            iA05 |= RuntimeInternals.IOPRIO_BACKGROUND;
        } else if ((i & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA05 |= AnonymousClass004.A0h(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1N(iA05), bfm, iA05)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            float f = AnonymousClass002.A0d(bfm).bubbleCornerRadius;
            float f2 = HatchMessageBubbleKt.SmallCornerRadius;
            C1D3 c1d3A01 = C1D8.A01(f, f, f, f2);
            C1D3 c1d3A012 = avatarSharePresentationData.showsAnimation ? C1D8.A01(f2, f, f, f) : c1d3;
            HatchScreen hatchScreenA0M = AnonymousClass007.A0M(bfm);
            Map<String, String> mapCurrentChatThreadLogMetadata = CurrentChatThreadLogMetadataKt.currentChatThreadLogMetadata(bfm, 0);
            boolean zA1R = AnonymousClass001.A1R(bfm, mapCurrentChatThreadLogMetadata, AnonymousClass003.A1H(bfm, hatchScreenA0M, AnonymousClass003.A1E(iA05)));
            Object objAaT = bfm.AaT();
            if (zA1R || objAaT == C78N.A00) {
                objAaT = new HatchAvatarShareWidgetKt$HatchAvatarShareWidget$onShareClick$1$1(hatchScreenA0M, mapCurrentChatThreadLogMetadata, function0);
                bfm.Ai0(objAaT);
            }
            Function0 function02 = (Function0) objAaT;
            C1062ATq c1062ATq = C10G.A02;
            BRg bRgThen = bRg2.then(c1062ATq);
            C3TH c3th = C2VU.A02;
            InterfaceC1380AiA interfaceC1380AiAA0T = AnonymousClass006.A0T(bfm, c3th, 4.0f);
            BBI bbi = (BBI) bfm;
            long j2 = bbi.A06;
            int i4 = (int) (j2 ^ (j2 >>> 32));
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgThen);
            Function0<InterfaceC1516AkQ> function03 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function03);
            G0V<InterfaceC1516AkQ, InterfaceC1380AiA, Unit> g0v = C1515AkP.A04;
            BPg.A02(bfm, interfaceC1380AiAA0T, g0v);
            G0V<InterfaceC1516AkQ, InterfaceC1492Ajz, Unit> g0v2 = C1515AkP.A06;
            G0V g0vA19 = AnonymousClass004.A19(bfm, akqA04, g0v2, i4);
            G0U<InterfaceC1516AkQ, Unit> g0u = C1515AkP.A02;
            BPg.A03(bfm, g0u);
            G0V<InterfaceC1516AkQ, BRg, Unit> g0v3 = C1515AkP.A05;
            BPg.A02(bfm, bRgA01, g0v3);
            if (avatarSharePresentationData.showsAnimation) {
                bfm.AgE(1822609983);
                AvatarShareAnimation(avatarSharePresentationData, c1d3A01, function02, null, bfm, AvatarSharePresentationData.$stable | (iA05 & 14), 8);
                BBI.A0R(bbi, false);
            } else {
                bfm.AgE(1822698395);
                BBI.A0R(bbi, false);
            }
            BS0 bs0 = BRg.A00;
            BRg bRgA09 = C3U4.A09(C11U.A04(C3U4.A0C(c1062ATq, 0.0f, 0.0f, 32.0f, 0.0f), c1d3A012, j), AuraDimensKt.SpacingMedium);
            InterfaceC1380AiA interfaceC1380AiAA0U = AnonymousClass006.A0U(bfm, c3th, AuraDimensKt.SpacingSmall, 0);
            int iA0D = AnonymousClass001.A0D(bbi);
            AKQ akqA042 = BBI.A04(bbi);
            BRg bRgA012 = AxM.A01(bfm, bRgA09);
            AnonymousClass005.A0n(bfm, bbi, function03);
            BPg.A02(bfm, interfaceC1380AiAA0U, g0v);
            BPg.A02(bfm, akqA042, g0v2);
            AnonymousClass003.A15(g0u, g0vA19, bfm, iA0D);
            BPg.A02(bfm, bRgA012, g0v3);
            InterfaceC1380AiA interfaceC1380AiAA0U2 = AnonymousClass006.A0U(bfm, c3th, 4.0f, 6);
            int iA0D2 = AnonymousClass001.A0D(bbi);
            AKQ akqA043 = BBI.A04(bbi);
            BRg bRgA013 = AxM.A01(bfm, bs0);
            AnonymousClass005.A0n(bfm, bbi, function03);
            BPg.A02(bfm, interfaceC1380AiAA0U2, g0v);
            BPg.A02(bfm, akqA043, g0v2);
            AnonymousClass003.A15(g0u, g0vA19, bfm, iA0D2);
            BPg.A02(bfm, bRgA013, g0v3);
            String str = avatarSharePresentationData.title;
            if (str == null) {
                bfm.AgE(139189575);
                BBI.A0R(bbi, false);
            } else {
                AuraTextKt.m2639AuraTextUY9GdpU(str, null, C06G.A0C(bfm), AnonymousClass006.A0k(bfm, 139189576).bodyMedium, null, null, null, false, 0, 0, 0, null, null, null, bfm, 0, 0, 16370);
                BBI.A0R(bbi, false);
            }
            AuraTextKt.m2639AuraTextUY9GdpU(avatarSharePresentationData.subtitle, null, C06G.A0C(bfm), C06G.A0T(bfm), null, null, null, false, 0, 0, 0, null, null, null, bfm, 0, 0, 16370);
            BBI.A0R(bbi, true);
            AuraButtonKt.m2408AuraButtonnL3aKkM(null, avatarSharePresentationData.buttonText, null, c1062ATq, AnonymousClass006.A0g(bfm), AuraButtonSize.SMALL, null, false, false, false, false, false, null, null, function02, null, null, null, null, null, null, null, null, false, 0, false, 0, bfm, 199680, 0, 0, 134201285);
            BBI.A0R(bbi, true);
            BBI.A0R(bbi, true);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new HatchAvatarShareWidgetKt$HatchAvatarShareWidget$2(avatarSharePresentationData, c1d3, j, function0, bRg2, i, i2);
        }
    }

    public static final void logAvatarShareClick(HatchScreen hatchScreen, Map<String, String> map) {
        HatchInteractionLogger.INSTANCE.logClick(HatchSurface.CHAT, HatchSubsurface.MESSAGE_LIST, hatchScreen, HatchComponent.AVATAR_SHARE_CARD, null, map, null);
    }
}
