package com.facebook.aura.sharesheet;

import X.AHD;
import X.AbstractC05081Yo;
import X.AbstractC0878AGe;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.B1V;
import X.BFM;
import X.BRg;
import X.C01r;
import X.C0Ig;
import X.C1062ATq;
import X.C10G;
import X.C1AC;
import X.C1DG;
import X.C1DP;
import X.C1Pk;
import X.C2VU;
import X.C3U4;
import X.C7384Etj;
import X.C78N;
import X.G0U;
import X.G0W;
import X.G2j;
import android.net.Uri;
import androidx.compose.foundation.pager.PagerState;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.partners.voice.background.VoiceCallForegroundService;
import com.facebook.aura.sharesheet.AvatarSharePage;
import com.facebook.aura.vds.compose.common.AuraDrawableSource;
import com.facebook.common.dextricks.RuntimeInternals;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class HatchAvatarShareSheetKt$AvatarCarousel$1$1 extends AbstractC7559F3s implements G0W<C0Ig, BFM, Integer, Unit> {
    public final /* synthetic */ AuraDrawableSource $avatarSource;
    public final /* synthetic */ String $bubbleText;
    public final /* synthetic */ MutableState<Boolean> $isMuted$delegate;
    public final /* synthetic */ Float $pageAspectRatio;
    public final /* synthetic */ PagerState $pagerState;
    public final /* synthetic */ AHD<AvatarSharePage> $pages;
    public final /* synthetic */ String $previewDescription;

    /* renamed from: com.facebook.aura.sharesheet.HatchAvatarShareSheetKt$AvatarCarousel$1$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G2j<C01r, Integer, BFM, Integer, Unit> {
        public final /* synthetic */ AuraDrawableSource $avatarSource;
        public final /* synthetic */ String $bubbleText;
        public final /* synthetic */ MutableState<Boolean> $isMuted$delegate;
        public final /* synthetic */ PagerState $pagerState;
        public final /* synthetic */ AHD<AvatarSharePage> $pages;
        public final /* synthetic */ String $previewDescription;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(PagerState pagerState, AHD<? extends AvatarSharePage> ahd, AuraDrawableSource auraDrawableSource, MutableState<Boolean> mutableState, String str, String str2) {
            super(4);
            this.$pagerState = pagerState;
            this.$pages = ahd;
            this.$avatarSource = auraDrawableSource;
            this.$isMuted$delegate = mutableState;
            this.$previewDescription = str;
            this.$bubbleText = str2;
        }

        public final void invoke(C01r c01r, int i, BFM bfm, int i2) {
            AuraDrawableSource auraDrawableSource;
            HatchAvatarStoryPalette hatchAvatarStoryPalettePaletteAt;
            String str;
            String str2;
            BRg bRgA06;
            int i3;
            Uri mediaUri;
            int iA0E = i2;
            if ((i2 & 48) == 0) {
                iA0E = i2 | AnonymousClass004.A0E(bfm, i);
            }
            if (!AnonymousClass001.A1b(AnonymousClass002.A1P(iA0E & 145, VoiceCallForegroundService.AVATAR_TARGET_PX), bfm, iA0E)) {
                bfm.Afo();
                return;
            }
            boolean zA1Q = AnonymousClass002.A1Q(i, this.$pagerState.A07());
            AvatarSharePage avatarSharePage = (AvatarSharePage) AbstractC0878AGe.A0A(i, this.$pages);
            if (avatarSharePage instanceof AvatarSharePage.Dance) {
                bfm.AgE(1927438413);
                AvatarSharePage.Dance dance = (AvatarSharePage.Dance) avatarSharePage;
                AuraDrawableSource auraDrawableSource2 = this.$avatarSource;
                boolean zA0A = MutableState.A0A((MutableState) this.$isMuted$delegate);
                boolean zA65 = bfm.A65(this.$isMuted$delegate);
                MutableState<Boolean> mutableState = this.$isMuted$delegate;
                Object objAaT = bfm.AaT();
                if (zA65 || objAaT == C78N.A00) {
                    objAaT = new HatchAvatarShareSheetKt$AvatarCarousel$1$1$1$1$1(mutableState);
                    bfm.Ai0(objAaT);
                }
                HatchAvatarShareSheetKt.DanceCard(dance, auraDrawableSource2, zA1Q, zA0A, (G0U) objAaT, this.$previewDescription, C3U4.A06(C10G.A01, HatchAvatarShareSheetKt.CardVerticalPadding), bfm, 1572864, 0);
            } else {
                if (avatarSharePage instanceof AvatarSharePage.Intro) {
                    bfm.AgE(1927452762);
                    AvatarSharePage.Intro intro = (AvatarSharePage.Intro) avatarSharePage;
                    mediaUri = intro.getMediaUri();
                    auraDrawableSource = this.$avatarSource;
                    hatchAvatarStoryPalettePaletteAt = intro.palette;
                    str = this.$previewDescription;
                    str2 = this.$bubbleText;
                    bRgA06 = C3U4.A06(C10G.A01, HatchAvatarShareSheetKt.CardVerticalPadding);
                    i3 = 1572864;
                } else {
                    if (avatarSharePage != null) {
                        throw AnonymousClass005.A0k(bfm, 1927436237);
                    }
                    bfm.AgE(1927466855);
                    auraDrawableSource = this.$avatarSource;
                    hatchAvatarStoryPalettePaletteAt = HatchAvatarSharePagesKt.paletteAt(0);
                    str = this.$previewDescription;
                    str2 = this.$bubbleText;
                    bRgA06 = C3U4.A06(C10G.A01, HatchAvatarShareSheetKt.CardVerticalPadding);
                    i3 = 1572870;
                    mediaUri = null;
                }
                HatchAvatarShareSheetKt.AvatarCard(mediaUri, auraDrawableSource, zA1Q, hatchAvatarStoryPalettePaletteAt, str, str2, bRgA06, bfm, i3, 0);
            }
            AnonymousClass001.A1D(bfm);
        }

        @Override // X.G2j
        public /* bridge */ /* synthetic */ Unit invoke(C01r c01r, Integer num, BFM bfm, Integer num2) {
            invoke(c01r, AnonymousClass001.A0F(num), bfm, AnonymousClass001.A0F(num2));
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HatchAvatarShareSheetKt$AvatarCarousel$1$1(Float f, PagerState pagerState, AHD<? extends AvatarSharePage> ahd, AuraDrawableSource auraDrawableSource, MutableState<Boolean> mutableState, String str, String str2) {
        super(3);
        this.$pageAspectRatio = f;
        this.$pagerState = pagerState;
        this.$pages = ahd;
        this.$avatarSource = auraDrawableSource;
        this.$isMuted$delegate = mutableState;
        this.$previewDescription = str;
        this.$bubbleText = str2;
    }

    @Override // X.G0W
    public /* bridge */ /* synthetic */ Unit invoke(C0Ig c0Ig, BFM bfm, Integer num) {
        invoke(c0Ig, bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(C0Ig c0Ig, BFM bfm, int i) {
        int iA0d = i;
        C7384Etj.A0Y(c0Ig, 0);
        if ((i & 6) == 0) {
            iA0d = i | AnonymousClass004.A0d(bfm, c0Ig);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 19, 18), bfm, iA0d)) {
            float fAHT = c0Ig.AHT() * 0.78f;
            Float f = this.$pageAspectRatio;
            if (f != null) {
                float fFloatValue = f.floatValue();
                C1DG c1dg = new C1DG(fAHT);
                C1DG c1dg2 = new C1DG((c0Ig.AHP() - (HatchAvatarShareSheetKt.CardVerticalPadding * 2.0f)) * fFloatValue);
                if (c1dg.compareTo(c1dg2) <= 0) {
                    c1dg2 = c1dg;
                }
                fAHT = c1dg2.A00;
            }
            C1062ATq c1062ATq = C10G.A01;
            float fAHT2 = (c0Ig.AHT() - fAHT) / 2.0f;
            C1DP c1dp = new C1DP(fAHT2, 0.0f, fAHT2, 0.0f);
            C1Pk c1Pk = new C1Pk(fAHT);
            C1AC c1ac = C2VU.A04;
            PagerState pagerState = this.$pagerState;
            AbstractC05081Yo.A00(null, null, null, c1dp, c1Pk, pagerState, bfm, c1ac, c1062ATq, null, null, B1V.A00(bfm, new AnonymousClass1(pagerState, this.$pages, this.$avatarSource, this.$isMuted$delegate, this.$previewDescription, this.$bubbleText), 1271277986), 16.0f, 1, 1794096, RuntimeInternals.IOPRIO_BACKGROUND, 16256, false, false);
            return;
        }
        bfm.Afo();
    }
}
