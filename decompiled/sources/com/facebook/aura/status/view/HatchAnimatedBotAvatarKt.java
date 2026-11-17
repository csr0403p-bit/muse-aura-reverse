package com.facebook.aura.status.view;

import X.AKO;
import X.AKQ;
import X.ASj;
import X.AWA;
import X.AbstractC0878AGe;
import X.AbstractC1798ArH;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.AnonymousClass011;
import X.AxM;
import X.BBI;
import X.BBP;
import X.BBb;
import X.BFI;
import X.BFM;
import X.BRg;
import X.BS0;
import X.C00x;
import X.C10G;
import X.C11S;
import X.C1515AkP;
import X.C1BO;
import X.C1DM;
import X.C1er;
import X.C2HU;
import X.C2eL;
import X.C31t;
import X.C3cG;
import X.C60Q;
import X.C7197Ei9;
import X.C7384Etj;
import X.C78N;
import X.C8j3;
import X.F13;
import X.F60;
import X.G0U;
import X.G0V;
import X.InterfaceC1380AiA;
import X.InterfaceC1516AkQ;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.avatarsize.HatchAvatarSizeKt;
import com.facebook.aura.common.video.HatchVideoPlayer;
import com.facebook.aura.common.video.HatchVideoPlayerComposableKt;
import com.facebook.aura.common.video.RememberHatchVideoPlayerKt;
import com.facebook.aura.header.api.AvatarTakeover;
import com.facebook.aura.header.api.AvatarTakeoverIdleMedia;
import com.facebook.aura.header.api.AvatarTakeoverKt;
import com.facebook.aura.model.AiIdentity;
import com.facebook.aura.model.AvatarMedia;
import com.facebook.aura.model.AvatarMediaSelectionKt;
import com.facebook.aura.model.AvatarStatusVideos;
import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;
import com.facebook.aura.status.viewmodel.HatchPillState;
import com.facebook.aura.vds.compose.common.AuraDrawableSource;
import com.facebook.aura.vds.compose.image.AuraImageKt;
import com.facebook.common.dextricks.RuntimeInternals;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public abstract class HatchAnimatedBotAvatarKt {
    public static final float AVATAR_DECODE_SIZE = HatchAvatarSizeKt.MaxAvatarRenderSize;
    public static final float AvatarBorderWidth = 0.5f;
    public static final int CALL_IDLE_FADE_DURATION_MS = 250;
    public static final int FADE_DURATION_MS = 300;
    public static final long VIDEO_APPEAR_TIMEOUT_MS = 1500;

    /* renamed from: com.facebook.aura.status.view.HatchAnimatedBotAvatarKt$AvatarBaseImage$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ AvatarImagePresentation $image;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ G0U<Boolean, Unit> $onSettled;
        public final /* synthetic */ boolean $showShimmeringState;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass2(AvatarImagePresentation avatarImagePresentation, G0U<? super Boolean, Unit> g0u, BRg bRg, boolean z, int i, int i2) {
            super(2);
            this.$image = avatarImagePresentation;
            this.$onSettled = g0u;
            this.$modifier = bRg;
            this.$showShimmeringState = z;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            HatchAnimatedBotAvatarKt.AvatarBaseImage(this.$image, this.$onSettled, this.$modifier, this.$showShimmeringState, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.status.view.HatchAnimatedBotAvatarKt$AvatarStatusVideoCrossfade$3, reason: invalid class name */
    public final class AnonymousClass3 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$changed1;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ Float $callCropTopFraction;
        public final /* synthetic */ Function0<Boolean> $deferVideoChanges;
        public final /* synthetic */ Function0<Float> $fillFraction;
        public final /* synthetic */ boolean $holdIncomingReveal;
        public final /* synthetic */ boolean $isPlaying;
        public final /* synthetic */ boolean $keepPlayingOnPause;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onIdlePreparationFinished;
        public final /* synthetic */ AuraDrawableSource $placeholderImage;
        public final /* synthetic */ C7197Ei9 $placeholderImageOptions;
        public final /* synthetic */ boolean $playbackPaused;
        public final /* synthetic */ boolean $retainVideoUntilReady;
        public final /* synthetic */ boolean $revealIdlePoster;
        public final /* synthetic */ Uri $targetUri;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(Uri uri, AuraDrawableSource auraDrawableSource, C7197Ei9 c7197Ei9, boolean z, boolean z2, boolean z3, Function0<Float> function0, Float f, boolean z4, Function0<Boolean> function02, Function0<Unit> function03, boolean z5, boolean z6, BRg bRg, int i, int i2, int i3) {
            super(2);
            this.$targetUri = uri;
            this.$placeholderImage = auraDrawableSource;
            this.$placeholderImageOptions = c7197Ei9;
            this.$isPlaying = z;
            this.$playbackPaused = z2;
            this.$keepPlayingOnPause = z3;
            this.$fillFraction = function0;
            this.$callCropTopFraction = f;
            this.$retainVideoUntilReady = z4;
            this.$deferVideoChanges = function02;
            this.$onIdlePreparationFinished = function03;
            this.$holdIncomingReveal = z5;
            this.$revealIdlePoster = z6;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$changed1 = i2;
            this.$$default = i3;
        }

        public final void invoke(BFM bfm, int i) {
            HatchAnimatedBotAvatarKt.AvatarStatusVideoCrossfade(this.$targetUri, this.$placeholderImage, this.$placeholderImageOptions, this.$isPlaying, this.$playbackPaused, this.$keepPlayingOnPause, this.$fillFraction, this.$callCropTopFraction, this.$retainVideoUntilReady, this.$deferVideoChanges, this.$onIdlePreparationFinished, this.$holdIncomingReveal, this.$revealIdlePoster, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), AnonymousClass011.A01(this.$$changed1), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.status.view.HatchAnimatedBotAvatarKt$AvatarVideoSurface$7, reason: invalid class name */
    public final class AnonymousClass7 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$changed1;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ Float $callCropTopFraction;
        public final /* synthetic */ Function0<Float> $fillFraction;
        public final /* synthetic */ boolean $holdsLoopStart;
        public final /* synthetic */ boolean $isPlaying;
        public final /* synthetic */ boolean $keepPlayingOnPause;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onError;
        public final /* synthetic */ Function0<Unit> $onRendered;
        public final /* synthetic */ AuraDrawableSource $placeholderImage;
        public final /* synthetic */ C7197Ei9 $placeholderImageOptions;
        public final /* synthetic */ Uri $uri;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass7(Uri uri, AuraDrawableSource auraDrawableSource, C7197Ei9 c7197Ei9, boolean z, boolean z2, boolean z3, Function0<Float> function0, Float f, Function0<Unit> function02, Function0<Unit> function03, BRg bRg, int i, int i2, int i3) {
            super(2);
            this.$uri = uri;
            this.$placeholderImage = auraDrawableSource;
            this.$placeholderImageOptions = c7197Ei9;
            this.$isPlaying = z;
            this.$holdsLoopStart = z2;
            this.$keepPlayingOnPause = z3;
            this.$fillFraction = function0;
            this.$callCropTopFraction = f;
            this.$onRendered = function02;
            this.$onError = function03;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$changed1 = i2;
            this.$$default = i3;
        }

        public final void invoke(BFM bfm, int i) {
            HatchAnimatedBotAvatarKt.AvatarVideoSurface(this.$uri, this.$placeholderImage, this.$placeholderImageOptions, this.$isPlaying, this.$holdsLoopStart, this.$keepPlayingOnPause, this.$fillFraction, this.$callCropTopFraction, this.$onRendered, this.$onError, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), AnonymousClass011.A01(this.$$changed1), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.status.view.HatchAnimatedBotAvatarKt$HatchAnimatedBotAvatar$7, reason: invalid class name and case insensitive filesystem */
    /* loaded from: classes.dex */
    public final class C140757 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$changed1;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ boolean $allowStaticFallback;
        public final /* synthetic */ AvatarMedia $avatarMedia;
        public final /* synthetic */ C1DM $clipShape;
        public final /* synthetic */ boolean $dark;
        public final /* synthetic */ Function0<Boolean> $deferVideoChanges;
        public final /* synthetic */ Function0<Float> $fillFraction;
        public final /* synthetic */ boolean $holdIncomingReveal;
        public final /* synthetic */ AvatarTakeoverIdleMedia $idleMedia;
        public final /* synthetic */ boolean $isPlaying;
        public final /* synthetic */ boolean $keepPlayingOnPause;
        public final /* synthetic */ String $milestoneVideoUrl;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onIdlePreparationFinished;
        public final /* synthetic */ Function0<Unit> $onMilestoneDone;
        public final /* synthetic */ Function0<Unit> $onMilestoneStarted;
        public final /* synthetic */ boolean $pauseDuringInteraction;
        public final /* synthetic */ HatchPillState $pillState;
        public final /* synthetic */ boolean $retainVideoUntilReady;
        public final /* synthetic */ boolean $showBorder;
        public final /* synthetic */ boolean $showImageFallback;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C140757(HatchPillState hatchPillState, BRg bRg, AvatarMedia avatarMedia, AvatarTakeoverIdleMedia avatarTakeoverIdleMedia, boolean z, Function0<Boolean> function0, Function0<Unit> function02, boolean z2, String str, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, Function0<Float> function03, boolean z8, C1DM c1dm, Function0<Unit> function04, Function0<Unit> function05, boolean z9, int i, int i2, int i3) {
            super(2);
            this.$pillState = hatchPillState;
            this.$modifier = bRg;
            this.$avatarMedia = avatarMedia;
            this.$idleMedia = avatarTakeoverIdleMedia;
            this.$retainVideoUntilReady = z;
            this.$deferVideoChanges = function0;
            this.$onIdlePreparationFinished = function02;
            this.$holdIncomingReveal = z2;
            this.$milestoneVideoUrl = str;
            this.$isPlaying = z3;
            this.$pauseDuringInteraction = z4;
            this.$allowStaticFallback = z5;
            this.$keepPlayingOnPause = z6;
            this.$showImageFallback = z7;
            this.$fillFraction = function03;
            this.$showBorder = z8;
            this.$clipShape = c1dm;
            this.$onMilestoneStarted = function04;
            this.$onMilestoneDone = function05;
            this.$dark = z9;
            this.$$changed = i;
            this.$$changed1 = i2;
            this.$$default = i3;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            HatchAnimatedBotAvatarKt.HatchAnimatedBotAvatar(this.$pillState, this.$modifier, this.$avatarMedia, this.$idleMedia, this.$retainVideoUntilReady, this.$deferVideoChanges, this.$onIdlePreparationFinished, this.$holdIncomingReveal, this.$milestoneVideoUrl, this.$isPlaying, this.$pauseDuringInteraction, this.$allowStaticFallback, this.$keepPlayingOnPause, this.$showImageFallback, this.$fillFraction, this.$showBorder, this.$clipShape, this.$onMilestoneStarted, this.$onMilestoneDone, this.$dark, bfm, AnonymousClass011.A00(this.$$changed), AnonymousClass011.A01(this.$$changed1), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.status.view.HatchAnimatedBotAvatarKt$IdlePosterShownEffect$2, reason: invalid class name and case insensitive filesystem */
    public final class C140762 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ boolean $shown;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C140762(boolean z, int i) {
            super(2);
            this.$shown = z;
            this.$$changed = i;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            HatchAnimatedBotAvatarKt.IdlePosterShownEffect(this.$shown, bfm, AnonymousClass011.A00(this.$$changed));
        }
    }

    /* renamed from: com.facebook.aura.status.view.HatchAnimatedBotAvatarKt$MilestoneVideoPlayer$2, reason: invalid class name and case insensitive filesystem */
    public final class C140772 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ C7197Ei9 $avatarImageOptions;
        public final /* synthetic */ AuraDrawableSource $avatarSource;
        public final /* synthetic */ boolean $isPlaying;
        public final /* synthetic */ Function0<Unit> $onFirstPlayDone;
        public final /* synthetic */ Function0<Unit> $onStarted;
        public final /* synthetic */ Uri $uri;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C140772(Uri uri, AuraDrawableSource auraDrawableSource, C7197Ei9 c7197Ei9, boolean z, Function0<Unit> function0, Function0<Unit> function02, int i) {
            super(2);
            this.$uri = uri;
            this.$avatarSource = auraDrawableSource;
            this.$avatarImageOptions = c7197Ei9;
            this.$isPlaying = z;
            this.$onStarted = function0;
            this.$onFirstPlayDone = function02;
            this.$$changed = i;
        }

        public final void invoke(BFM bfm, int i) {
            HatchAnimatedBotAvatarKt.MilestoneVideoPlayer(this.$uri, this.$avatarSource, this.$avatarImageOptions, this.$isPlaying, this.$onStarted, this.$onFirstPlayDone, bfm, AnonymousClass011.A00(this.$$changed));
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[HatchPillState.values().length];
            try {
                AnonymousClass002.A13(HatchPillState.IDLE, iArr);
            } catch (NoSuchFieldError unused) {
            }
            try {
                AnonymousClass002.A14(HatchPillState.USING_TOOL, iArr);
            } catch (NoSuchFieldError unused2) {
            }
            try {
                AnonymousClass002.A15(HatchPillState.THINKING, iArr);
            } catch (NoSuchFieldError unused3) {
            }
            try {
                AnonymousClass002.A16(HatchPillState.TYPING, iArr);
            } catch (NoSuchFieldError unused4) {
            }
            try {
                AnonymousClass002.A17(HatchPillState.WAITING_FOR_SUBAGENTS, iArr);
            } catch (NoSuchFieldError unused5) {
            }
            try {
                AnonymousClass002.A18(HatchPillState.MAKING_SOMETHING, iArr);
            } catch (NoSuchFieldError unused6) {
            }
            try {
                AnonymousClass006.A1G(HatchPillState.WAKING_UP, iArr);
            } catch (NoSuchFieldError unused7) {
            }
            try {
                AnonymousClass006.A1H(HatchPillState.CONNECTING, iArr);
            } catch (NoSuchFieldError unused8) {
            }
            try {
                AnonymousClass006.A1I(HatchPillState.RESETTING, iArr);
            } catch (NoSuchFieldError unused9) {
            }
            try {
                AnonymousClass006.A1J(HatchPillState.DISCONNECTED, iArr);
            } catch (NoSuchFieldError unused10) {
            }
            try {
                AnonymousClass006.A1K(HatchPillState.CONNECTION_ERROR, iArr);
            } catch (NoSuchFieldError unused11) {
            }
            try {
                AnonymousClass006.A1L(HatchPillState.PAUSED, iArr);
            } catch (NoSuchFieldError unused12) {
            }
            try {
                C60Q.A1C(HatchPillState.NEEDS_APPROVAL, iArr);
            } catch (NoSuchFieldError unused13) {
            }
            try {
                C60Q.A1D(HatchPillState.OUT_OF_CREDITS, iArr);
            } catch (NoSuchFieldError unused14) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final void AvatarBaseImage(AvatarImagePresentation avatarImagePresentation, G0U<? super Boolean, Unit> g0u, BRg bRg, boolean z, BFM bfm, int i, int i2) {
        BRg bRgA0Q = bRg;
        boolean zA1Q = z;
        bfm.AgG(-504786331);
        int iA0T = (i & 6) == 0 ? AnonymousClass004.A0T(bfm, avatarImagePresentation) | i : i;
        if ((i & 48) == 0) {
            iA0T |= AnonymousClass004.A0U(bfm, g0u);
        }
        int i3 = i2 & 4;
        if (i3 != 0) {
            iA0T |= 384;
        } else if ((i & 384) == 0) {
            iA0T |= AnonymousClass004.A0f(bfm, bRgA0Q);
        }
        int i4 = i2 & 8;
        if (i4 != 0) {
            iA0T |= 3072;
        } else if ((i & 3072) == 0) {
            iA0T |= AnonymousClass004.A0q(bfm, zA1Q);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0T & 1171, 1170), bfm, iA0T)) {
            if (i3 != 0) {
                bRgA0Q = BRg.A00;
            }
            zA1Q = C60Q.A1Q(i4, zA1Q);
            Object objAaT = bfm.AaT();
            Object obj = C78N.A00;
            if (objAaT == obj) {
                objAaT = AbstractC1798ArH.A07(avatarImagePresentation, bfm);
            }
            final MutableState mutableState = (MutableState) objAaT;
            final MutableState mutableStateA00 = C1er.A00(bfm, avatarImagePresentation);
            final MutableState mutableStateA002 = C1er.A00(bfm, g0u);
            InterfaceC1380AiA interfaceC1380AiAA0c = AnonymousClass001.A0c(false);
            BBI bbi = (BBI) bfm;
            int iA0J = AnonymousClass003.A0J(bbi);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA0Q);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function0);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA0c, akqA04, bRgA01, iA0J);
            bfm.AgE(61420606);
            for (final AvatarImagePresentation avatarImagePresentation2 : BFI.A0F(new AvatarImagePresentation[]{(AvatarImagePresentation) mutableState.getValue(), MutableState.A0B(mutableState, avatarImagePresentation) ? null : avatarImagePresentation})) {
                bfm.Ag8(-2126675917, avatarImagePresentation2);
                Object objAaT2 = bfm.AaT();
                if (objAaT2 == obj) {
                    objAaT2 = new F13() { // from class: com.facebook.aura.status.view.HatchAnimatedBotAvatarKt$AvatarBaseImage$1$2$listener$1$1
                        @Override // X.F13, X.Ej6
                        public void onFailure(long j, Drawable drawable, Throwable th) {
                            settle(false);
                        }

                        @Override // X.F13, X.Ej6
                        public void onFinalImageSet(long j, int i5, C2eL c2eL, Drawable drawable) {
                            settle(true);
                        }

                        private final void settle(boolean z2) {
                            if (C7384Etj.areEqual(avatarImagePresentation2, mutableStateA00.getValue())) {
                                mutableState.Af8(avatarImagePresentation2);
                                AnonymousClass001.A1K(z2, C1BO.A0B(mutableStateA002));
                            }
                        }
                    };
                    BBI.A0O(bbi, objAaT2);
                }
                F13 f13 = (F13) objAaT2;
                AuraDrawableSource auraDrawableSource = avatarImagePresentation2.source;
                bfm.AgE(-2126649196);
                BS0 bs0 = BRg.A00;
                BRg bRgThen = C10G.A01;
                if (!avatarImagePresentation2.equals(mutableState.getValue())) {
                    bRgThen = bRgThen.then(C11S.A00(bs0, 0.0f));
                }
                Float f = avatarImagePresentation2.idleCropTopFraction;
                if (f != null) {
                    bRgThen = bRgThen.then(m2218takeoverIdleFraming5oXFXW4(bs0, avatarImagePresentation2.idleImageSize, f.floatValue(), bfm, 6));
                }
                BBI.A0R(bbi, false);
                AuraImageKt.AuraImage(auraDrawableSource, bRgThen, null, avatarImagePresentation2.options, false, zA1Q, null, false, f13, bfm, (iA0T << 6) & 458752, 212);
                BBI.A0R(bbi, false);
            }
            bRgA0Q = AnonymousClass001.A0Q(bbi, bRgA0Q, false, true);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass2(avatarImagePresentation, g0u, bRgA0Q, zA1Q, i, i2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:116:0x028e  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0298  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x02e8 A[PHI: r37
  0x02e8: PHI (r37v4 boolean) = (r37v2 boolean), (r37v2 boolean), (r37v5 boolean) binds: [B:180:0x03db, B:181:0x03dd, B:140:0x02e6] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:145:0x030b  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x033f  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x035d  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0367  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x037f  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x03a5  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x03d5  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00f0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void AvatarStatusVideoCrossfade(android.net.Uri r59, com.facebook.aura.vds.compose.common.AuraDrawableSource r60, X.C7197Ei9 r61, boolean r62, boolean r63, boolean r64, kotlin.jvm.functions.Function0<java.lang.Float> r65, java.lang.Float r66, boolean r67, kotlin.jvm.functions.Function0<java.lang.Boolean> r68, kotlin.jvm.functions.Function0<kotlin.Unit> r69, boolean r70, boolean r71, X.BRg r72, X.BFM r73, int r74, int r75, int r76) {
        /*
            Method dump skipped, instructions count: 1067
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.status.view.HatchAnimatedBotAvatarKt.AvatarStatusVideoCrossfade(android.net.Uri, com.facebook.aura.vds.compose.common.AuraDrawableSource, X.Ei9, boolean, boolean, boolean, kotlin.jvm.functions.Function0, java.lang.Float, boolean, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, boolean, boolean, X.BRg, X.BFM, int, int, int):void");
    }

    public static final C1BO<Float> animateAvatarVideoAlpha(float f, boolean z, boolean z2, Function0<Unit> function0, BFM bfm, int i) {
        C1BO<Float> c1boA01 = C31t.A01(new ASj(C2HU.A02, z ? 250 : 300, 0), bfm, f, (i & 14) | 3072, 20);
        boolean zA65 = bfm.A65(c1boA01);
        Object objAaT = bfm.AaT();
        if (zA65 || objAaT == C78N.A00) {
            objAaT = new BBP(null, new HatchAnimatedBotAvatarKt$animateAvatarVideoAlpha$fadedIn$2$1(c1boA01));
            BBI.A0T(bfm, objAaT);
        }
        C1BO c1bo = (C1BO) objAaT;
        MutableState mutableStateA00 = C1er.A00(bfm, function0);
        Boolean boolValueOf = Boolean.valueOf(C1BO.A0F(c1bo));
        Boolean boolValueOf2 = Boolean.valueOf(z2);
        boolean zA1W = AnonymousClass002.A1W(bfm, mutableStateA00, bfm.A65(c1bo), (((i & 896) ^ 384) > 256 && bfm.A66(z2)) || (i & 384) == 256);
        Object objAaT2 = bfm.AaT();
        if (zA1W || objAaT2 == C78N.A00) {
            objAaT2 = new HatchAnimatedBotAvatarKt$animateAvatarVideoAlpha$1$1(z2, c1bo, mutableStateA00);
            BBI.A0T(bfm, objAaT2);
        }
        AnonymousClass001.A19(bfm, objAaT2, boolValueOf, boolValueOf2);
        return c1boA01;
    }

    public static final String avatarKey(AiIdentity aiIdentity, boolean z) {
        List<String> list;
        String str;
        if (aiIdentity == null) {
            return null;
        }
        AvatarMedia avatarMedia = aiIdentity.avatarMedia;
        return (avatarMedia == null || (list = AvatarMediaSelectionKt.select(avatarMedia, z).stills) == null || (str = (String) AbstractC0878AGe.A0G(list)) == null) ? aiIdentity.avatarStem : str;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.C1BO<java.lang.String> rememberAvatarKey(com.facebook.aura.identity.provider.HatchIdentityProvider r8, boolean r9, X.BFM r10, int r11) {
        /*
            r0 = r11 & 14
            r0 = r0 ^ 6
            r3 = 0
            r1 = 4
            r4 = r10
            if (r0 <= r1) goto Lf
            boolean r0 = r10.A65(r8)
            if (r0 != 0) goto L14
        Lf:
            r0 = r11 & 6
            r2 = 0
            if (r0 != r1) goto L15
        L14:
            r2 = 1
        L15:
            r0 = r11 & 112(0x70, float:1.57E-43)
            r0 = r0 ^ 48
            r1 = 32
            if (r0 <= r1) goto L23
            boolean r0 = r10.A66(r9)
            if (r0 != 0) goto L27
        L23:
            r0 = r11 & 48
            if (r0 != r1) goto L28
        L27:
            r3 = 1
        L28:
            r2 = r2 | r3
            java.lang.Object r7 = r10.AaT()
            if (r2 != 0) goto L33
            java.lang.Object r0 = X.C78N.A00
            if (r7 != r0) goto L3d
        L33:
            X.1BN<com.facebook.aura.model.AiIdentity> r0 = r8.aiIdentity
            com.facebook.aura.status.view.HatchAnimatedBotAvatarKt$rememberAvatarKey$lambda$0$$inlined$map$1 r7 = new com.facebook.aura.status.view.HatchAnimatedBotAvatarKt$rememberAvatarKey$lambda$0$$inlined$map$1
            r7.<init>(r0, r9)
            X.BBI.A0T(r10, r7)
        L3d:
            X.20Q r7 = (X.C20Q) r7
            X.1BN<com.facebook.aura.model.AiIdentity> r0 = r8.aiIdentity
            java.lang.Object r0 = r0.getValue()
            com.facebook.aura.model.AiIdentity r0 = (com.facebook.aura.model.AiIdentity) r0
            java.lang.String r6 = avatarKey(r0, r9)
            r8 = 0
            r9 = 14
            r5 = 0
            X.1BO r0 = X.C2CK.A01(r4, r5, r6, r7, r8, r9)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.status.view.HatchAnimatedBotAvatarKt.rememberAvatarKey(com.facebook.aura.identity.provider.HatchIdentityProvider, boolean, X.BFM, int):X.1BO");
    }

    public static final void IdlePosterShownEffect(boolean z, BFM bfm, int i) {
        bfm.AgG(-988686115);
        int iA0n = (i & 6) == 0 ? AnonymousClass004.A0n(bfm, z) | i : i;
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0n & 3, 2), bfm, iA0n)) {
            BBI bbi = (BBI) bfm;
            AvatarTakeover avatarTakeover = (AvatarTakeover) AKO.A07(AvatarTakeoverKt.LocalAvatarTakeover, bbi);
            Boolean boolValueOf = Boolean.valueOf(z);
            boolean zA1V = C8j3.A1V(bfm, avatarTakeover, AnonymousClass001.A1M(iA0n));
            Object objAaT = bfm.AaT();
            if (zA1V || objAaT == C78N.A00) {
                objAaT = new HatchAnimatedBotAvatarKt$IdlePosterShownEffect$1$1(z, avatarTakeover);
                BBI.A0O(bbi, objAaT);
            }
            AnonymousClass001.A17(bfm, objAaT, boolValueOf);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C140762(z, i);
        }
    }

    public static final void MilestoneVideoPlayer(Uri uri, AuraDrawableSource auraDrawableSource, C7197Ei9 c7197Ei9, boolean z, Function0<Unit> function0, Function0<Unit> function02, BFM bfm, int i) {
        bfm.AgG(-1293823741);
        int iA0T = (i & 6) == 0 ? AnonymousClass004.A0T(bfm, uri) | i : i;
        if ((i & 48) == 0) {
            iA0T |= AnonymousClass002.A06(AnonymousClass004.A1Y(auraDrawableSource, bfm, i) ? 1 : 0);
        }
        if ((i & 384) == 0) {
            iA0T |= AnonymousClass004.A0V(bfm, c7197Ei9);
        }
        if ((i & 3072) == 0) {
            iA0T |= AnonymousClass004.A0q(bfm, z);
        }
        if ((i & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA0T |= AnonymousClass004.A0X(bfm, function0);
        }
        if ((196608 & i) == 0) {
            iA0T |= AnonymousClass004.A0Y(bfm, function02);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(74899 & iA0T, 74898), bfm, iA0T)) {
            HatchVideoPlayer hatchVideoPlayerRememberHatchVideoPlayer = RememberHatchVideoPlayerKt.rememberHatchVideoPlayer(HatchVideoPlayer.RepeatMode.OFF, true, z, bfm, ((iA0T >> 3) & 896) | 54, 0);
            MutableState mutableStateA00 = C1er.A00(bfm, Boolean.valueOf(z));
            boolean zA1O = AnonymousClass003.A1O(bfm, hatchVideoPlayerRememberHatchVideoPlayer, mutableStateA00, AnonymousClass003.A1F(iA0T, 57344, 16384) | ((iA0T & 458752) == 131072));
            Object objAaT = bfm.AaT();
            if (zA1O || objAaT == C78N.A00) {
                objAaT = new HatchAnimatedBotAvatarKt$MilestoneVideoPlayer$1$1(hatchVideoPlayerRememberHatchVideoPlayer, function0, function02, mutableStateA00);
                BBI.A0T(bfm, objAaT);
            }
            AnonymousClass001.A17(bfm, objAaT, uri);
            int i2 = iA0T << 9;
            HatchVideoPlayerComposableKt.HatchVideoPlayerComposable(C10G.A01, uri, hatchVideoPlayerRememberHatchVideoPlayer, null, auraDrawableSource, c7197Ei9, false, z, false, false, false, false, HatchVideoPlayer.ResizeMode.FIT, 0.0f, "lobster_milestone_avatar", null, false, false, false, null, false, null, null, null, null, null, null, bfm, AnonymousClass001.A0C(iA0T << 12, ((iA0T << 3) & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX) | 100663302 | (57344 & i2) | (i2 & 458752)), 1597878, 0, 134128200);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C140772(uri, auraDrawableSource, c7197Ei9, z, function0, function02, i);
        }
    }

    public static final /* synthetic */ AvatarImagePresentation access$AvatarBaseImage$lambda$3(C1BO c1bo) {
        return (AvatarImagePresentation) c1bo.getValue();
    }

    public static final /* synthetic */ AvatarVideoPresentation access$AvatarStatusVideoCrossfade$lambda$2(MutableState mutableState) {
        return (AvatarVideoPresentation) mutableState.getValue();
    }

    public static final /* synthetic */ AvatarVideoPresentation access$AvatarStatusVideoCrossfade$lambda$5(MutableState mutableState) {
        return (AvatarVideoPresentation) mutableState.getValue();
    }

    public static final /* synthetic */ Boolean access$HatchAnimatedBotAvatar$lambda$17$0$7(MutableState mutableState) {
        return (Boolean) mutableState.getValue();
    }

    /* renamed from: takeoverIdleFraming-5oXFXW4, reason: not valid java name */
    public static final BRg m2218takeoverIdleFraming5oXFXW4(BRg bRg, AWA awa, float f, BFM bfm, int i) {
        bfm.AgE(1455728926);
        BBI bbi = (BBI) bfm;
        AvatarTakeover avatarTakeover = (AvatarTakeover) AKO.A07(AvatarTakeoverKt.LocalAvatarTakeover, bbi);
        if (avatarTakeover != null) {
            bRg = avatarTakeover.mo975idleFraming5oXFXW4(bRg, awa, f, bfm, i & 1022);
        }
        BBI.A0R(bbi, false);
        return bRg;
    }

    public static final String toServerVideoUrl(HatchPillState hatchPillState, AvatarStatusVideos avatarStatusVideos) {
        switch (hatchPillState.ordinal()) {
            case 0:
            case 3:
            case 11:
            case 12:
            case 13:
                return null;
            case 1:
            case 4:
            case 10:
                break;
            case 2:
                String str = avatarStatusVideos.wakingVideo;
                if (str != null) {
                    return str;
                }
                break;
            case 5:
            case 6:
            case 7:
            case 9:
                return avatarStatusVideos.working;
            case 8:
                return avatarStatusVideos.makingSomething;
            default:
                throw C3cG.A0q();
        }
        return avatarStatusVideos.idle;
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00b2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void AvatarVideoSurface(android.net.Uri r57, com.facebook.aura.vds.compose.common.AuraDrawableSource r58, X.C7197Ei9 r59, boolean r60, boolean r61, boolean r62, kotlin.jvm.functions.Function0<java.lang.Float> r63, java.lang.Float r64, kotlin.jvm.functions.Function0<kotlin.Unit> r65, kotlin.jvm.functions.Function0<kotlin.Unit> r66, X.BRg r67, X.BFM r68, int r69, int r70, int r71) {
        /*
            Method dump skipped, instructions count: 716
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.status.view.HatchAnimatedBotAvatarKt.AvatarVideoSurface(android.net.Uri, com.facebook.aura.vds.compose.common.AuraDrawableSource, X.Ei9, boolean, boolean, boolean, kotlin.jvm.functions.Function0, java.lang.Float, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, X.BRg, X.BFM, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0223  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0252  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0265  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0276  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0294  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0296  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0299  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x029b  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x02a1  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x02a4  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x02bb  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x02c5  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x02ce  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x02de  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x047a  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x049b  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x049d  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x04a1  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x04a4  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x04b0  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x04cb  */
    /* JADX WARN: Removed duplicated region for block: B:283:0x04dd  */
    /* JADX WARN: Removed duplicated region for block: B:287:0x04e7  */
    /* JADX WARN: Removed duplicated region for block: B:289:0x04f1 A[PHI: r47
  0x04f1: PHI (r47v4 android.net.Uri) = (r47v3 android.net.Uri), (r47v7 android.net.Uri) binds: [B:286:0x04e5, B:288:0x04ef] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:301:0x058a  */
    /* JADX WARN: Removed duplicated region for block: B:305:0x0594  */
    /* JADX WARN: Removed duplicated region for block: B:321:0x05c8  */
    /* JADX WARN: Removed duplicated region for block: B:326:0x05f2  */
    /* JADX WARN: Removed duplicated region for block: B:337:0x0627  */
    /* JADX WARN: Removed duplicated region for block: B:339:0x062b  */
    /* JADX WARN: Removed duplicated region for block: B:342:0x063f  */
    /* JADX WARN: Removed duplicated region for block: B:350:0x0685  */
    /* JADX WARN: Removed duplicated region for block: B:363:0x06c2  */
    /* JADX WARN: Removed duplicated region for block: B:365:0x06e5  */
    /* JADX WARN: Removed duplicated region for block: B:367:0x06f3  */
    /* JADX WARN: Removed duplicated region for block: B:373:0x0703  */
    /* JADX WARN: Removed duplicated region for block: B:382:0x077f  */
    /* JADX WARN: Removed duplicated region for block: B:383:0x0787  */
    /* JADX WARN: Removed duplicated region for block: B:384:0x078b  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0136  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void HatchAnimatedBotAvatar(com.facebook.aura.status.viewmodel.HatchPillState r49, X.BRg r50, com.facebook.aura.model.AvatarMedia r51, com.facebook.aura.header.api.AvatarTakeoverIdleMedia r52, boolean r53, kotlin.jvm.functions.Function0<java.lang.Boolean> r54, kotlin.jvm.functions.Function0<kotlin.Unit> r55, boolean r56, java.lang.String r57, boolean r58, boolean r59, boolean r60, boolean r61, boolean r62, kotlin.jvm.functions.Function0<java.lang.Float> r63, boolean r64, X.C1DM r65, kotlin.jvm.functions.Function0<kotlin.Unit> r66, kotlin.jvm.functions.Function0<kotlin.Unit> r67, boolean r68, X.BFM r69, int r70, int r71, int r72) {
        /*
            Method dump skipped, instructions count: 2014
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.status.view.HatchAnimatedBotAvatarKt.HatchAnimatedBotAvatar(com.facebook.aura.status.viewmodel.HatchPillState, X.BRg, com.facebook.aura.model.AvatarMedia, com.facebook.aura.header.api.AvatarTakeoverIdleMedia, boolean, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, boolean, java.lang.String, boolean, boolean, boolean, boolean, boolean, kotlin.jvm.functions.Function0, boolean, X.1DM, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, boolean, X.BFM, int, int, int):void");
    }
}
