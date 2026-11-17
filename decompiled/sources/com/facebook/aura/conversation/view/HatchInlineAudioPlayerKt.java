package com.facebook.aura.conversation.view;

import X.AGH;
import X.AKQ;
import X.ARD;
import X.AVy;
import X.AWx;
import X.AaM;
import X.AaN;
import X.AbstractC2271BQs;
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
import X.B18;
import X.B6A;
import X.BBI;
import X.BBb;
import X.BFM;
import X.BOf;
import X.BPg;
import X.BRg;
import X.BRr;
import X.BS0;
import X.C00q;
import X.C00x;
import X.C01N;
import X.C0v5;
import X.C0zJ;
import X.C1051ASv;
import X.C10F;
import X.C10G;
import X.C11U;
import X.C1299Agk;
import X.C1515AkP;
import X.C1822Arm;
import X.C1AC;
import X.C1BO;
import X.C1D3;
import X.C1D8;
import X.C1DG;
import X.C1YD;
import X.C1YL;
import X.C1b8;
import X.C1er;
import X.C2CK;
import X.C2VU;
import X.C3O5;
import X.C3U4;
import X.C3bf;
import X.C7384Etj;
import X.C78N;
import X.C7BY;
import X.C90m;
import X.EnumC10460Hji;
import X.F60;
import X.FGI;
import X.G0U;
import X.G0V;
import X.HDi;
import X.HtJ;
import X.HxS;
import X.InterfaceC1380AiA;
import X.InterfaceC1492Ajz;
import X.InterfaceC1516AkQ;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ParcelableSnapshotMutableFloatState;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import com.facebook.aura.R;
import com.facebook.aura.analytics.hatch.HatchComponent;
import com.facebook.aura.analytics.hatch.HatchInteractionLogger;
import com.facebook.aura.analytics.hatch.HatchMetadataKey;
import com.facebook.aura.analytics.hatch.HatchScreen;
import com.facebook.aura.analytics.hatch.HatchSubsurface;
import com.facebook.aura.analytics.hatch.HatchSurface;
import com.facebook.aura.audio.HatchAudioPlayerRepository;
import com.facebook.aura.identity.provider.HatchConversationTheme;
import com.facebook.aura.model.HatchMessageRole;
import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;
import com.facebook.aura.vds.compose.icons.AuraIconButtonBackground;
import com.facebook.aura.vds.compose.icons.AuraIconButtonKt;
import com.facebook.aura.vds.compose.icons.AuraIconButtonSizeV2;
import com.facebook.aura.vds.compose.icons.AuraIconButtonStyle;
import com.facebook.aura.vds.compose.image.AuraImageKt;
import com.facebook.aura.vds.compose.text.AuraTextKt;
import com.facebook.aura.vds.compose.theme.AuraColors;
import com.facebook.aura.vds.compose.theme.AuraTypography;
import com.facebook.common.callercontext.ContextChain;
import com.facebook.common.dextricks.RuntimeInternals;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public abstract class HatchInlineAudioPlayerKt {
    public static final int ARTWORK_SIZE_DP = 44;
    public static final float NOT_SCRUBBING = -1.0f;
    public static final float SeekTrackHeight = 48.0f;
    public static final float TimerEdgeInset = 2.0f;
    public static final Function0<Float> ZeroProgress = HatchInlineAudioPlayerKt$ZeroProgress$1.INSTANCE;
    public static final List<Float> PLAYBACK_SPEEDS = Arrays.asList(Float.valueOf(1.0f), Float.valueOf(1.5f), Float.valueOf(2.0f), Float.valueOf(0.75f));
    public static final ContextChain ARTWORK_CONTEXT_CHAIN = new ContextChain(null, "pi", "HatchInlineAudioPlayer");

    /* renamed from: com.facebook.aura.conversation.view.HatchInlineAudioPlayerKt$ActiveInlineAudioSeekBar$3, reason: invalid class name */
    public final class AnonymousClass3 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ int $durationMs;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ HatchAudioPlayerRepository $service;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(HatchAudioPlayerRepository hatchAudioPlayerRepository, int i, BRg bRg, int i2, int i3) {
            super(2);
            this.$service = hatchAudioPlayerRepository;
            this.$durationMs = i;
            this.$modifier = bRg;
            this.$$changed = i2;
            this.$$default = i3;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            HatchInlineAudioPlayerKt.ActiveInlineAudioSeekBar(this.$service, this.$durationMs, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.conversation.view.HatchInlineAudioPlayerKt$InlineAudioArtwork$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ String $artworkUrl;
        public final /* synthetic */ BRg $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(String str, BRg bRg, int i, int i2) {
            super(2);
            this.$artworkUrl = str;
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
            HatchInlineAudioPlayerKt.InlineAudioArtwork(this.$artworkUrl, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.conversation.view.HatchInlineAudioPlayerKt$InlineAudioControls$2, reason: invalid class name and case insensitive filesystem */
    public final class C114772 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ boolean $isLoading;
        public final /* synthetic */ boolean $isPlaying;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onForward;
        public final /* synthetic */ Function0<Unit> $onRewind;
        public final /* synthetic */ Function0<Unit> $onSpeedChange;
        public final /* synthetic */ Function0<Unit> $onTogglePlay;
        public final /* synthetic */ float $playbackRate;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C114772(boolean z, boolean z2, float f, Function0<Unit> function0, Function0<Unit> function02, Function0<Unit> function03, Function0<Unit> function04, BRg bRg, int i, int i2) {
            super(2);
            this.$isPlaying = z;
            this.$isLoading = z2;
            this.$playbackRate = f;
            this.$onRewind = function0;
            this.$onTogglePlay = function02;
            this.$onForward = function03;
            this.$onSpeedChange = function04;
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
            HatchInlineAudioPlayerKt.InlineAudioControls(this.$isPlaying, this.$isLoading, this.$playbackRate, this.$onRewind, this.$onTogglePlay, this.$onForward, this.$onSpeedChange, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.conversation.view.HatchInlineAudioPlayerKt$InlineAudioHeader$2, reason: invalid class name and case insensitive filesystem */
    public final class C114782 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ String $artworkUrl;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ String $subtitle;
        public final /* synthetic */ String $title;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C114782(String str, String str2, String str3, BRg bRg, int i, int i2) {
            super(2);
            this.$artworkUrl = str;
            this.$title = str2;
            this.$subtitle = str3;
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
            HatchInlineAudioPlayerKt.InlineAudioHeader(this.$artworkUrl, this.$title, this.$subtitle, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.conversation.view.HatchInlineAudioPlayerKt$InlineAudioPlayPauseButton$2, reason: invalid class name and case insensitive filesystem */
    public final class C114792 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ boolean $isLoading;
        public final /* synthetic */ boolean $isPlaying;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onClick;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C114792(boolean z, boolean z2, Function0<Unit> function0, BRg bRg, int i, int i2) {
            super(2);
            this.$isPlaying = z;
            this.$isLoading = z2;
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
            HatchInlineAudioPlayerKt.InlineAudioPlayPauseButton(this.$isPlaying, this.$isLoading, this.$onClick, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.conversation.view.HatchInlineAudioPlayerKt$InlineAudioSeekBar$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ int $durationMs;
        public final /* synthetic */ boolean $isActiveItem;
        public final /* synthetic */ boolean $isPrepared;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ HatchAudioPlayerRepository $service;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(HatchAudioPlayerRepository hatchAudioPlayerRepository, boolean z, boolean z2, int i, BRg bRg, int i2, int i3) {
            super(2);
            this.$service = hatchAudioPlayerRepository;
            this.$isActiveItem = z;
            this.$isPrepared = z2;
            this.$durationMs = i;
            this.$modifier = bRg;
            this.$$changed = i2;
            this.$$default = i3;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            HatchInlineAudioPlayerKt.InlineAudioSeekBar(this.$service, this.$isActiveItem, this.$isPrepared, this.$durationMs, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.conversation.view.HatchInlineAudioPlayerKt$InlineAudioSeekBarContent$2, reason: invalid class name and case insensitive filesystem */
    public final class C114802 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ Function0<Float> $drawProgress;
        public final /* synthetic */ String $elapsedText;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ G0U<Float, Unit> $onScrub;
        public final /* synthetic */ G0U<Float, Unit> $onScrubFinished;
        public final /* synthetic */ float $semanticsProgress;
        public final /* synthetic */ String $totalText;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C114802(Function0<Float> function0, float f, String str, String str2, BRg bRg, G0U<? super Float, Unit> g0u, G0U<? super Float, Unit> g0u2, int i, int i2) {
            super(2);
            this.$drawProgress = function0;
            this.$semanticsProgress = f;
            this.$elapsedText = str;
            this.$totalText = str2;
            this.$modifier = bRg;
            this.$onScrub = g0u;
            this.$onScrubFinished = g0u2;
            this.$$changed = i;
            this.$$default = i2;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            HatchInlineAudioPlayerKt.InlineAudioSeekBarContent(this.$drawProgress, this.$semanticsProgress, this.$elapsedText, this.$totalText, this.$modifier, this.$onScrub, this.$onScrubFinished, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.conversation.view.HatchInlineAudioPlayerKt$InlineAudioSeekTrack$3, reason: invalid class name and case insensitive filesystem */
    public final class C114813 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ Function0<Float> $drawProgress;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ G0U<Float, Unit> $onScrub;
        public final /* synthetic */ G0U<Float, Unit> $onScrubFinished;
        public final /* synthetic */ String $seekLabel;
        public final /* synthetic */ String $seekState;
        public final /* synthetic */ float $semanticsProgress;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C114813(Function0<Float> function0, float f, BRg bRg, String str, String str2, G0U<? super Float, Unit> g0u, G0U<? super Float, Unit> g0u2, int i, int i2) {
            super(2);
            this.$drawProgress = function0;
            this.$semanticsProgress = f;
            this.$modifier = bRg;
            this.$seekLabel = str;
            this.$seekState = str2;
            this.$onScrub = g0u;
            this.$onScrubFinished = g0u2;
            this.$$changed = i;
            this.$$default = i2;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            HatchInlineAudioPlayerKt.InlineAudioSeekTrack(this.$drawProgress, this.$semanticsProgress, this.$modifier, this.$seekLabel, this.$seekState, this.$onScrub, this.$onScrubFinished, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.conversation.view.HatchInlineAudioPlayerKt$InlineAudioSpeedControl$1, reason: invalid class name and case insensitive filesystem */
    public final class C114821 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onClick;
        public final /* synthetic */ float $rate;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C114821(float f, Function0<Unit> function0, BRg bRg, int i, int i2) {
            super(2);
            this.$rate = f;
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
            HatchInlineAudioPlayerKt.InlineAudioSpeedControl(this.$rate, this.$onClick, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    public static final void ActiveInlineAudioSeekBar(HatchAudioPlayerRepository hatchAudioPlayerRepository, int i, BRg bRg, BFM bfm, int i2, int i3) {
        BRg bRg2 = bRg;
        bfm.AgG(-1278934045);
        int iA05 = (i2 & 6) == 0 ? AnonymousClass002.A05(AnonymousClass004.A1X(hatchAudioPlayerRepository, bfm, i2) ? 1 : 0) | i2 : i2;
        if ((i2 & 48) == 0) {
            iA05 |= AnonymousClass004.A0E(bfm, i);
        }
        int i4 = i3 & 4;
        if (i4 != 0) {
            iA05 |= 384;
        } else if ((i2 & 384) == 0) {
            iA05 |= AnonymousClass004.A0f(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1J(iA05), bfm, iA05)) {
            if (i4 != 0) {
                bRg2 = BRg.A00;
            }
            C1BO c1boA02 = C2CK.A02(bfm, hatchAudioPlayerRepository.positionMs);
            Object objAaT = bfm.AaT();
            Object obj = C78N.A00;
            if (objAaT == obj) {
                objAaT = new ParcelableSnapshotMutableFloatState(-1.0f);
                bfm.Ai0(objAaT);
            }
            C00q c00q = (C00q) objAaT;
            int i5 = iA05 & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX;
            boolean zA1Q = AnonymousClass002.A1Q(i5, 32);
            Object objAaT2 = bfm.AaT();
            if (zA1Q || objAaT2 == obj) {
                objAaT2 = new HatchInlineAudioPlayerKt$ActiveInlineAudioSeekBar$drawProgress$1$1(c00q, c1boA02, i);
                bfm.Ai0(objAaT2);
            }
            Function0 function0 = (Function0) objAaT2;
            boolean zA1Q2 = AnonymousClass002.A1Q(i5, 32);
            Object objAaT3 = bfm.AaT();
            if (zA1Q2 || objAaT3 == obj) {
                objAaT3 = AnonymousClass002.A0K(bfm, null, new HatchInlineAudioPlayerKt$ActiveInlineAudioSeekBar$displaySeconds$1$1(c00q, i, c1boA02));
            }
            C1BO c1bo = (C1BO) objAaT3;
            float fA00 = AnonymousClass003.A00((C1BO.A01(c1bo) * 1000.0f) / i);
            String strA0X = AnonymousClass007.A0X(C1BO.A02(c1bo));
            String strA0X2 = AnonymousClass007.A0X(i / 1000);
            Object objAaT4 = bfm.AaT();
            if (objAaT4 == obj) {
                objAaT4 = new HatchInlineAudioPlayerKt$ActiveInlineAudioSeekBar$1$1(c00q);
                bfm.Ai0(objAaT4);
            }
            G0U g0u = (G0U) objAaT4;
            boolean zA1Q3 = ((iA05 & 14) == 4 || ((iA05 & 8) != 0 && bfm.A67(hatchAudioPlayerRepository))) | AnonymousClass002.A1Q(i5, 32);
            Object objAaT5 = bfm.AaT();
            if (zA1Q3 || objAaT5 == obj) {
                objAaT5 = new HatchInlineAudioPlayerKt$ActiveInlineAudioSeekBar$2$1(hatchAudioPlayerRepository, i, c00q);
                bfm.Ai0(objAaT5);
            }
            InlineAudioSeekBarContent(function0, fA00, strA0X, strA0X2, bRg2, g0u, (G0U) objAaT5, bfm, ((iA05 << 6) & 57344) | 196608, 0);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass3(hatchAudioPlayerRepository, i, bRg2, i2, i3);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x021b  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0229  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0247  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0261  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x028a  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x02aa  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x02ba  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x03b6 A[PHI: r23 r32 r33 r54
  0x03b6: PHI (r23v2 boolean) = (r23v1 boolean), (r23v6 boolean) binds: [B:96:0x01f3, B:98:0x01fb] A[DONT_GENERATE, DONT_INLINE]
  0x03b6: PHI (r32v3 boolean) = (r32v2 boolean), (r32v7 boolean) binds: [B:96:0x01f3, B:98:0x01fb] A[DONT_GENERATE, DONT_INLINE]
  0x03b6: PHI (r33v1 boolean) = (r33v0 boolean), (r33v5 boolean) binds: [B:96:0x01f3, B:98:0x01fb] A[DONT_GENERATE, DONT_INLINE]
  0x03b6: PHI (r54v2 boolean) = (r54v1 boolean), (r54v6 boolean) binds: [B:96:0x01f3, B:98:0x01fb] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:160:0x03bc A[PHI: r22 r23 r32 r33 r54
  0x03bc: PHI (r22v1 int) = (r22v0 int), (r22v3 int) binds: [B:158:0x03b8, B:101:0x0207] A[DONT_GENERATE, DONT_INLINE]
  0x03bc: PHI (r23v3 boolean) = (r23v2 boolean), (r23v5 boolean) binds: [B:158:0x03b8, B:101:0x0207] A[DONT_GENERATE, DONT_INLINE]
  0x03bc: PHI (r32v4 boolean) = (r32v3 boolean), (r32v6 boolean) binds: [B:158:0x03b8, B:101:0x0207] A[DONT_GENERATE, DONT_INLINE]
  0x03bc: PHI (r33v2 boolean) = (r33v1 boolean), (r33v4 boolean) binds: [B:158:0x03b8, B:101:0x0207] A[DONT_GENERATE, DONT_INLINE]
  0x03bc: PHI (r54v3 boolean) = (r54v2 boolean), (r54v5 boolean) binds: [B:158:0x03b8, B:101:0x0207] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:161:0x03c2  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x04df  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01d9 A[PHI: r23 r32
  0x01d9: PHI (r23v0 boolean) = (r23v9 boolean), (r23v10 boolean) binds: [B:88:0x01d7, B:86:0x01d3] A[DONT_GENERATE, DONT_INLINE]
  0x01d9: PHI (r32v1 boolean) = (r32v10 boolean), (r32v11 boolean) binds: [B:88:0x01d7, B:86:0x01d3] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01e3 A[PHI: r23 r32
  0x01e3: PHI (r23v8 boolean) = (r23v0 boolean), (r23v9 boolean) binds: [B:90:0x01e1, B:88:0x01d7] A[DONT_GENERATE, DONT_INLINE]
  0x01e3: PHI (r32v9 boolean) = (r32v1 boolean), (r32v10 boolean) binds: [B:90:0x01e1, B:88:0x01d7] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01e7 A[PHI: r23 r32 r54
  0x01e7: PHI (r23v7 boolean) = (r23v0 boolean), (r23v8 boolean) binds: [B:90:0x01e1, B:92:0x01e5] A[DONT_GENERATE, DONT_INLINE]
  0x01e7: PHI (r32v8 boolean) = (r32v1 boolean), (r32v9 boolean) binds: [B:90:0x01e1, B:92:0x01e5] A[DONT_GENERATE, DONT_INLINE]
  0x01e7: PHI (r54v7 boolean) = (r54v0 boolean), (r54v8 boolean) binds: [B:90:0x01e1, B:92:0x01e5] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01f1 A[PHI: r23 r32 r54
  0x01f1: PHI (r23v1 boolean) = (r23v7 boolean), (r23v8 boolean) binds: [B:94:0x01ef, B:92:0x01e5] A[DONT_GENERATE, DONT_INLINE]
  0x01f1: PHI (r32v2 boolean) = (r32v8 boolean), (r32v9 boolean) binds: [B:94:0x01ef, B:92:0x01e5] A[DONT_GENERATE, DONT_INLINE]
  0x01f1: PHI (r54v1 boolean) = (r54v7 boolean), (r54v8 boolean) binds: [B:94:0x01ef, B:92:0x01e5] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01f5 A[PHI: r23 r32 r33 r54
  0x01f5: PHI (r23v6 boolean) = (r23v1 boolean), (r23v7 boolean) binds: [B:96:0x01f3, B:94:0x01ef] A[DONT_GENERATE, DONT_INLINE]
  0x01f5: PHI (r32v7 boolean) = (r32v2 boolean), (r32v8 boolean) binds: [B:96:0x01f3, B:94:0x01ef] A[DONT_GENERATE, DONT_INLINE]
  0x01f5: PHI (r33v5 boolean) = (r33v0 boolean), (r33v6 boolean) binds: [B:96:0x01f3, B:94:0x01ef] A[DONT_GENERATE, DONT_INLINE]
  0x01f5: PHI (r54v6 boolean) = (r54v1 boolean), (r54v7 boolean) binds: [B:96:0x01f3, B:94:0x01ef] A[DONT_GENERATE, DONT_INLINE]] */
    /* renamed from: HatchInlineAudioPlayer-FItCLgY, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m624HatchInlineAudioPlayerFItCLgY(java.lang.String r66, java.lang.String r67, java.lang.String r68, java.lang.String r69, java.lang.String r70, java.lang.String r71, java.lang.String r72, X.BRg r73, long r74, X.C1D3 r76, X.BFM r77, int r78, int r79) {
        /*
            Method dump skipped, instructions count: 1257
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.conversation.view.HatchInlineAudioPlayerKt.m624HatchInlineAudioPlayerFItCLgY(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, X.BRg, long, X.1D3, X.BFM, int, int):void");
    }

    public static final void InlineAudioArtwork(String str, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(679698441);
        int iA0d = (i & 6) == 0 ? i | AnonymousClass004.A0d(bfm, str) : i;
        int i3 = i2 & 2;
        if (i3 != 0) {
            iA0d |= 48;
        } else if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0e(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 19, 18), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            HatchConversationTheme hatchConversationTheme = (HatchConversationTheme) bfm.A6v(HatchMessageBubbleKt.LocalConversationTheme);
            C1D3 c1d3A00 = C1D8.A00(8.0f);
            if (str != null) {
                bfm.AgE(-1874321049);
                AuraImageKt.m2573AuraImageXRP3Ue8(str, C11U.A03(C10G.A07(bRg2, 44.0f), c1d3A00), B18.A00, null, ARTWORK_CONTEXT_CHAIN, false, new C1DG(44.0f), 0L, false, false, false, null, null, null, null, bfm, (iA0d & 14) | 1576320, 0, 32672);
            } else {
                bfm.AgE(-1874024968);
                BRg bRgA01 = C1b8.A01(C11U.A03(C10G.A07(bRg2, 44.0f), c1d3A00), HatchMessageBubbleKt.bubbleBackground(HatchMessageRole.USER, hatchConversationTheme, bfm, (HatchConversationTheme.$stable << 3) | 6));
                InterfaceC1380AiA interfaceC1380AiAA0a = AnonymousClass001.A0a();
                BBI bbi = (BBI) bfm;
                int iA0J = AnonymousClass003.A0J(bbi);
                AKQ akqA04 = BBI.A04(bbi);
                BRg bRgA012 = AxM.A01(bfm, bRgA01);
                Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
                if (bbi.A0V == null) {
                    C00x.A00();
                    throw F60.createAndThrow();
                }
                AnonymousClass005.A0n(bfm, bbi, function0);
                AnonymousClass005.A0p(bfm, interfaceC1380AiAA0a, akqA04, bRgA012, iA0J);
                AVy aVyA00 = BOf.A00(bfm, R.drawable.audio_outline_24_wght400, 0);
                boolean zA00 = C3O5.A00(bfm);
                C7384Etj.A0Y(hatchConversationTheme, 1);
                C10F.A00(bfm, C10G.A07(BRg.A00, 22.0f), aVyA00, null, AVy.$stable | 432, 0, hatchConversationTheme.m1138userTextColorvNxB06k(zA00));
                BBI.A0R(bbi, true);
            }
            AnonymousClass001.A1D(bfm);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass2(str, bRg2, i, i2);
        }
    }

    public static final void InlineAudioControls(boolean z, boolean z2, float f, Function0<Unit> function0, Function0<Unit> function02, Function0<Unit> function03, Function0<Unit> function04, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(580162780);
        int iA0n = (i & 6) == 0 ? AnonymousClass004.A0n(bfm, z) | i : i;
        if ((i & 48) == 0) {
            iA0n |= AnonymousClass004.A0o(bfm, z2);
        }
        if ((i & 384) == 0) {
            iA0n |= AnonymousClass004.A06(bfm, f);
        }
        if ((i & 3072) == 0) {
            iA0n |= AnonymousClass004.A0W(bfm, function0);
        }
        if ((i & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA0n |= AnonymousClass004.A0X(bfm, function02);
        }
        if ((196608 & i) == 0) {
            iA0n |= AnonymousClass004.A0Y(bfm, function03);
        }
        if ((1572864 & i) == 0) {
            iA0n |= AnonymousClass004.A0Z(bfm, function04);
        }
        int i3 = i2 & 128;
        int iA0k = 12582912;
        if (i3 != 0) {
            iA0n |= iA0k;
        } else if ((12582912 & i) == 0) {
            iA0k = AnonymousClass004.A0k(bfm, bRg2);
            iA0n |= iA0k;
        }
        if (AnonymousClass001.A1b(AnonymousClass005.A1D(iA0n), bfm, iA0n)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            AuraColors auraColorsA0c = AnonymousClass002.A0c(bfm);
            BRg bRgA0R = AnonymousClass001.A0R(bRg2);
            C1AC c1ac = C2VU.A04;
            InterfaceC1380AiA interfaceC1380AiAA0W = AnonymousClass002.A0W(bfm, c1ac);
            BBI bbi = (BBI) bfm;
            long j = bbi.A06;
            int i4 = (int) (j ^ (j >>> 32));
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA0R);
            Function0<InterfaceC1516AkQ> function05 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function05);
            G0V<InterfaceC1516AkQ, InterfaceC1380AiA, Unit> g0v = C1515AkP.A04;
            BPg.A02(bfm, interfaceC1380AiAA0W, g0v);
            G0V<InterfaceC1516AkQ, InterfaceC1492Ajz, Unit> g0v2 = C1515AkP.A06;
            G0V g0vA19 = AnonymousClass004.A19(bfm, akqA04, g0v2, i4);
            G0U<InterfaceC1516AkQ, Unit> g0u = C1515AkP.A02;
            G0V g0vA0u = AnonymousClass002.A0u(bfm, bRgA01, g0u);
            C90m c90m = C90m.A00;
            BS0 bs0 = BRg.A00;
            C01N.A07(bfm, c90m.AiP(bs0, 1.0f, true));
            InterfaceC1380AiA interfaceC1380AiAA0V = AnonymousClass006.A0V(bfm, c1ac, 24.0f);
            int iA0D = AnonymousClass001.A0D(bbi);
            AKQ akqA042 = BBI.A04(bbi);
            BRg bRgA012 = AxM.A01(bfm, bs0);
            AnonymousClass005.A0n(bfm, bbi, function05);
            BPg.A02(bfm, interfaceC1380AiAA0V, g0v);
            BPg.A02(bfm, akqA042, g0v2);
            AnonymousClass003.A15(g0u, g0vA19, bfm, iA0D);
            BPg.A02(bfm, bRgA012, g0vA0u);
            AVy aVyA00 = BOf.A00(bfm, R.drawable.ic_seek_backwards_fifteen, 0);
            AuraIconButtonSizeV2 auraIconButtonSizeV2 = AuraIconButtonSizeV2.MEDIUM;
            AuraIconButtonStyle auraIconButtonStyle = AuraIconButtonStyle.PRIMARY;
            AuraIconButtonBackground auraIconButtonBackground = AuraIconButtonBackground.NO_BACKGROUND;
            long j2 = auraColorsA0c.primaryIcon.enabled;
            String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f1201c3);
            B6A b6a = new B6A(j2);
            int i5 = AVy.$stable;
            AuraIconButtonKt.m2552AuraIconButtonV2imgtlEU(null, aVyA00, auraIconButtonSizeV2, auraIconButtonStyle, auraIconButtonBackground, null, strA01, function0, null, false, b6a, null, null, null, bfm, (i5 << 3) | 28032 | ((iA0n << 12) & 29360128), 0, 15137);
            int i6 = iA0n >> 6;
            InlineAudioPlayPauseButton(z, z2, function02, null, bfm, (iA0n & 126) | (i6 & 896), 8);
            AuraIconButtonKt.m2552AuraIconButtonV2imgtlEU(null, BOf.A00(bfm, R.drawable.ic_seek_forwards_fifteen, 0), auraIconButtonSizeV2, auraIconButtonStyle, auraIconButtonBackground, null, AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f1201c0), function03, null, false, new B6A(auraColorsA0c.primaryIcon.enabled), null, null, null, bfm, (i5 << 3) | 28032 | ((iA0n << 6) & 29360128), 0, 15137);
            BBI.A0R(bbi, true);
            InlineAudioSpeedControl(f, function04, C10G.A00(C2VU.A01, c90m.AiP(bs0, 1.0f, true), false), bfm, (i6 & 14) | ((iA0n >> 15) & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX), 0);
            BBI.A0R(bbi, true);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C114772(z, z2, f, function0, function02, function03, function04, bRg2, i, i2);
        }
    }

    public static final void InlineAudioHeader(String str, String str2, String str3, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(1555123712);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, str) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0e(bfm, str2);
        }
        if ((i & 384) == 0) {
            iA0d |= AnonymousClass004.A0f(bfm, str3);
        }
        int i3 = i2 & 8;
        if (i3 != 0) {
            iA0d |= 3072;
        } else if ((i & 3072) == 0) {
            iA0d |= AnonymousClass004.A0g(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1L(iA0d), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            AuraColors auraColorsA0c = AnonymousClass002.A0c(bfm);
            AuraTypography auraTypographyA0f = AnonymousClass002.A0f(bfm);
            InterfaceC1380AiA interfaceC1380AiAA0W = AnonymousClass003.A0W(bfm);
            BBI bbi = (BBI) bfm;
            long j = bbi.A06;
            int i4 = (int) (j ^ (j >>> 32));
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRg2);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function0);
            G0V<InterfaceC1516AkQ, InterfaceC1380AiA, Unit> g0v = C1515AkP.A04;
            BPg.A02(bfm, interfaceC1380AiAA0W, g0v);
            G0V<InterfaceC1516AkQ, InterfaceC1492Ajz, Unit> g0v2 = C1515AkP.A06;
            G0V g0vA19 = AnonymousClass004.A19(bfm, akqA04, g0v2, i4);
            G0U<InterfaceC1516AkQ, Unit> g0u = C1515AkP.A02;
            G0V g0vA0u = AnonymousClass002.A0u(bfm, bRgA01, g0u);
            C90m c90m = C90m.A00;
            InlineAudioArtwork(str, null, bfm, iA0d & 14, 2);
            BRg bRgA0C = C3U4.A0C(c90m.AiP(BRg.A00, 1.0f, true), 12.0f, 0.0f, 0.0f, 0.0f);
            InterfaceC1380AiA interfaceC1380AiAA0U = AnonymousClass002.A0U(bfm);
            int iA0D = AnonymousClass001.A0D(bbi);
            AKQ akqA042 = BBI.A04(bbi);
            BRg bRgA012 = AxM.A01(bfm, bRgA0C);
            AnonymousClass005.A0n(bfm, bbi, function0);
            BPg.A02(bfm, interfaceC1380AiAA0U, g0v);
            BPg.A02(bfm, akqA042, g0v2);
            AnonymousClass003.A15(g0u, g0vA19, bfm, iA0D);
            BPg.A02(bfm, bRgA012, g0vA0u);
            AuraTextKt.m2639AuraTextUY9GdpU(str2, null, auraColorsA0c.primaryText, auraTypographyA0f.bodyEmphasized, null, null, null, false, 0, 1, 2, null, null, null, bfm, ((iA0d >> 3) & 14) | 805306368, 6, 14834);
            AuraTextKt.m2639AuraTextUY9GdpU(str3, null, auraColorsA0c.secondaryText, auraTypographyA0f.caption1Regular, null, null, null, false, 0, 1, 2, null, null, null, bfm, ((iA0d >> 6) & 14) | 805306368, 6, 14834);
            BBI.A0R(bbi, true);
            BBI.A0R(bbi, true);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C114782(str, str2, str3, bRg2, i, i2);
        }
    }

    public static final void InlineAudioPlayPauseButton(boolean z, boolean z2, Function0<Unit> function0, BRg bRg, BFM bfm, int i, int i2) {
        int i3;
        BBI bbi;
        BRg bRg2 = bRg;
        bfm.AgG(-826884464);
        int iA0n = (i & 6) == 0 ? AnonymousClass004.A0n(bfm, z) | i : i;
        if ((i & 48) == 0) {
            iA0n |= AnonymousClass004.A0o(bfm, z2);
        }
        if ((i & 384) == 0) {
            iA0n |= AnonymousClass004.A0V(bfm, function0);
        }
        int i4 = i2 & 8;
        if (i4 != 0) {
            iA0n |= 3072;
        } else if ((i & 3072) == 0) {
            iA0n |= AnonymousClass004.A0g(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0n & 1171, 1170), bfm, iA0n)) {
            if (i4 != 0) {
                bRg2 = BRg.A00;
            }
            AuraColors auraColorsA0c = AnonymousClass002.A0c(bfm);
            if (z2) {
                bfm.AgE(-2077426155);
                BRg bRgA07 = C10G.A07(bRg2, 44.0f);
                InterfaceC1380AiA interfaceC1380AiAA0a = AnonymousClass001.A0a();
                bbi = (BBI) bfm;
                int iA0J = AnonymousClass003.A0J(bbi);
                AKQ akqA04 = BBI.A04(bbi);
                BRg bRgA01 = AxM.A01(bfm, bRgA07);
                Function0<InterfaceC1516AkQ> function02 = C1515AkP.A00;
                if (bbi.A0V == null) {
                    C00x.A00();
                    throw F60.createAndThrow();
                }
                AnonymousClass005.A0n(bfm, bbi, function02);
                AnonymousClass005.A0p(bfm, interfaceC1380AiAA0a, akqA04, bRgA01, iA0J);
                AnonymousClass007.A0s(bfm, bbi);
            } else {
                bfm.AgE(-2077212069);
                int i5 = R.drawable.ic_playback_play;
                if (z) {
                    i5 = R.drawable.ic_playback_pause;
                }
                AVy aVyA00 = BOf.A00(bfm, i5, 0);
                AuraIconButtonSizeV2 auraIconButtonSizeV2 = AuraIconButtonSizeV2.LARGE;
                AuraIconButtonStyle auraIconButtonStyle = AuraIconButtonStyle.PRIMARY;
                AuraIconButtonBackground auraIconButtonBackground = AuraIconButtonBackground.NO_BACKGROUND;
                long j = auraColorsA0c.primaryIcon.enabled;
                if (z) {
                    bfm.AgE(-66991259);
                    i3 = R.string._name_removed__res_0x7f120db0;
                } else {
                    bfm.AgE(-66988988);
                    i3 = R.string._name_removed__res_0x7f120e6c;
                }
                String strA01 = AbstractC2271BQs.A01(bfm, i3);
                bbi = (BBI) bfm;
                AuraIconButtonKt.m2552AuraIconButtonV2imgtlEU(bRg2, aVyA00, auraIconButtonSizeV2, auraIconButtonStyle, auraIconButtonBackground, null, strA01, function0, null, false, AnonymousClass006.A0P(bbi, j), new C1DG(30.0f), null, null, bfm, AnonymousClass001.A0C(iA0n << 15, ((iA0n >> 9) & 14) | 28032 | (AVy.$stable << 3)), 48, 13088);
            }
            BBI.A0R(bbi, false);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C114792(z, z2, function0, bRg2, i, i2);
        }
    }

    public static final void InlineAudioSeekBar(HatchAudioPlayerRepository hatchAudioPlayerRepository, boolean z, boolean z2, int i, BRg bRg, BFM bfm, int i2, int i3) {
        BRg bRg2 = bRg;
        bfm.AgG(-1977929723);
        int iA05 = (i2 & 6) == 0 ? AnonymousClass002.A05(AnonymousClass004.A1X(hatchAudioPlayerRepository, bfm, i2) ? 1 : 0) | i2 : i2;
        if ((i2 & 48) == 0) {
            iA05 |= AnonymousClass004.A0o(bfm, z);
        }
        if ((i2 & 384) == 0) {
            iA05 |= AnonymousClass004.A0p(bfm, z2);
        }
        if ((i2 & 3072) == 0) {
            iA05 |= AnonymousClass007.A06(bfm, i);
        }
        int i4 = i3 & 16;
        if (i4 != 0) {
            iA05 |= RuntimeInternals.IOPRIO_BACKGROUND;
        } else if ((i2 & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA05 |= AnonymousClass004.A0h(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA05 & 9363, 9362), bfm, iA05)) {
            if (i4 != 0) {
                bRg2 = BRg.A00;
            }
            if (z && z2 && i > 0) {
                bfm.AgE(-1847627334);
                int i5 = HatchAudioPlayerRepository.$stable | (iA05 & 14);
                int i6 = iA05 >> 6;
                ActiveInlineAudioSeekBar(hatchAudioPlayerRepository, i, bRg2, bfm, (i6 & 896) | i5 | (i6 & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX), 0);
            } else {
                bfm.AgE(-1847519268);
                InlineAudioSeekBarContent(ZeroProgress, 0.0f, AnonymousClass007.A0X(0), AnonymousClass007.A0X(i / 1000), bRg2, null, null, bfm, (57344 & iA05) | 54, 96);
            }
            AnonymousClass002.A19(bfm);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass1(hatchAudioPlayerRepository, z, z2, i, bRg2, i2, i3);
        }
    }

    public static final void InlineAudioSeekBarContent(Function0<Float> function0, float f, String str, String str2, BRg bRg, G0U<? super Float, Unit> g0u, G0U<? super Float, Unit> g0u2, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        G0U<? super Float, Unit> g0u3 = g0u;
        G0U<? super Float, Unit> g0u4 = g0u2;
        bfm.AgG(968619178);
        int iA0T = (i & 6) == 0 ? AnonymousClass004.A0T(bfm, function0) | i : i;
        if ((i & 48) == 0) {
            iA0T |= AnonymousClass004.A05(bfm, f);
        }
        if ((i & 384) == 0) {
            iA0T |= AnonymousClass004.A0f(bfm, str);
        }
        if ((i & 3072) == 0) {
            iA0T |= AnonymousClass004.A0g(bfm, str2);
        }
        int i3 = i2 & 16;
        if (i3 != 0) {
            iA0T |= RuntimeInternals.IOPRIO_BACKGROUND;
        } else if ((i & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA0T |= AnonymousClass004.A0h(bfm, bRg2);
        }
        int i4 = i2 & 32;
        int iA0Y = 196608;
        if (i4 != 0) {
            iA0T |= iA0Y;
        } else if ((196608 & i) == 0) {
            iA0Y = AnonymousClass004.A0Y(bfm, g0u3);
            iA0T |= iA0Y;
        }
        int i5 = i2 & 64;
        int iA0Z = 1572864;
        if (i5 != 0) {
            iA0T |= iA0Z;
        } else if ((1572864 & i) == 0) {
            iA0Z = AnonymousClass004.A0Z(bfm, g0u4);
            iA0T |= iA0Z;
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(599187 & iA0T, 599186), bfm, iA0T)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            if (i4 != 0) {
                g0u3 = null;
            }
            if (i5 != 0) {
                g0u4 = null;
            }
            AuraColors auraColorsA0c = AnonymousClass002.A0c(bfm);
            AuraTypography auraTypographyA0f = AnonymousClass002.A0f(bfm);
            String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f1201c4);
            String strA0w = AnonymousClass006.A0w(bfm, str, str2, R.string._name_removed__res_0x7f1201c5);
            InterfaceC1380AiA interfaceC1380AiAA0W = AnonymousClass003.A0W(bfm);
            BBI bbi = (BBI) bfm;
            int iA0J = AnonymousClass003.A0J(bbi);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRg2);
            Function0<InterfaceC1516AkQ> function02 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function02);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA0W, akqA04, bRgA01, iA0J);
            C90m c90m = C90m.A00;
            C1822Arm c1822Arm = auraTypographyA0f.caption1Regular;
            long j = auraColorsA0c.secondaryText;
            BS0 bs0 = BRg.A00;
            float f2 = TimerEdgeInset;
            AuraTextKt.m2639AuraTextUY9GdpU(str, C3U4.A0C(bs0, f2, 0.0f, 0.0f, 0.0f), j, c1822Arm, null, null, null, false, 0, 0, 0, null, null, null, bfm, ((iA0T >> 6) & 14) | 48, 0, 16368);
            InlineAudioSeekTrack(function0, f, C3U4.A0B(AnonymousClass001.A0O(c90m, bs0, true), 10.0f, 0.0f), strA01, strA0w, g0u3, g0u4, bfm, iA0T & 4128894, 0);
            AuraTextKt.m2639AuraTextUY9GdpU(str2, C3U4.A0C(bs0, 0.0f, 0.0f, f2, 0.0f), auraColorsA0c.secondaryText, auraTypographyA0f.caption1Regular, null, null, null, false, 0, 0, 0, null, null, null, bfm, ((iA0T >> 9) & 14) | 48, 0, 16368);
            BBI.A0R(bbi, true);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C114802(function0, f, str, str2, bRg2, g0u3, g0u4, i, i2);
        }
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6 */
    public static final void InlineAudioSeekTrack(Function0<Float> function0, float f, BRg bRg, String str, String str2, G0U<? super Float, Unit> g0u, G0U<? super Float, Unit> g0u2, BFM bfm, int i, int i2) {
        boolean z;
        BRg bRgA00;
        ?? A1V;
        String str3 = str;
        String str4 = str2;
        G0U<? super Float, Unit> g0u3 = g0u;
        G0U<? super Float, Unit> g0u4 = g0u2;
        BRg bRg2 = bRg;
        bfm.AgG(-1972133421);
        int iA0T = (i & 6) == 0 ? AnonymousClass004.A0T(bfm, function0) | i : i;
        if ((i & 48) == 0) {
            iA0T |= AnonymousClass004.A05(bfm, f);
        }
        int i3 = i2 & 4;
        if (i3 != 0) {
            iA0T |= 384;
        } else if ((i & 384) == 0) {
            iA0T |= AnonymousClass004.A0f(bfm, bRg2);
        }
        int i4 = i2 & 8;
        if (i4 != 0) {
            iA0T |= 3072;
        } else if ((i & 3072) == 0) {
            iA0T |= AnonymousClass004.A0g(bfm, str3);
        }
        int i5 = i2 & 16;
        if (i5 != 0) {
            iA0T |= RuntimeInternals.IOPRIO_BACKGROUND;
        } else if ((i & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA0T |= AnonymousClass004.A0h(bfm, str4);
        }
        int i6 = i2 & 32;
        int iA0Y = 196608;
        if (i6 != 0) {
            iA0T |= iA0Y;
        } else if ((196608 & i) == 0) {
            iA0Y = AnonymousClass004.A0Y(bfm, g0u3);
            iA0T |= iA0Y;
        }
        int i7 = i2 & 64;
        int iA0Z = 1572864;
        if (i7 != 0) {
            iA0T |= iA0Z;
        } else if ((1572864 & i) == 0) {
            iA0Z = AnonymousClass004.A0Z(bfm, g0u4);
            iA0T |= iA0Z;
        }
        if (AnonymousClass001.A1b(AnonymousClass005.A1H(iA0T), bfm, iA0T)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            if (i4 != 0) {
                str3 = "";
            }
            String str5 = i5 == 0 ? str4 : "";
            if (i6 != 0) {
                g0u3 = null;
            }
            if (i7 != 0) {
                g0u4 = null;
            }
            AuraColors auraColorsA0c = AnonymousClass002.A0c(bfm);
            final MutableState mutableStateA00 = C1er.A00(bfm, g0u3);
            final MutableState mutableStateA002 = C1er.A00(bfm, g0u4);
            if (g0u3 == null || g0u4 == null) {
                z = false;
                bfm.AgE(-966527979);
                boolean zA1W = AnonymousClass001.A1W(bfm);
                bRgA00 = BRg.A00;
                A1V = zA1W;
            } else {
                z = true;
                bfm.AgE(-968101167);
                BS0 bs0 = BRg.A00;
                Unit unit = Unit.INSTANCE;
                boolean zA65 = bfm.A65(mutableStateA002);
                Object objAaT = bfm.AaT();
                if (zA65 || objAaT == C78N.A00) {
                    objAaT = new PointerInputEventHandler() { // from class: com.facebook.aura.conversation.view.HatchInlineAudioPlayerKt$InlineAudioSeekTrack$gestureModifier$1$1

                        /* renamed from: com.facebook.aura.conversation.view.HatchInlineAudioPlayerKt$InlineAudioSeekTrack$gestureModifier$1$1$1, reason: invalid class name */
                        public final class AnonymousClass1 extends AbstractC7559F3s implements G0U<AWx, Unit> {
                            public final /* synthetic */ C1BO<G0U<Float, Unit>> $currentOnScrubFinished$delegate;
                            public final /* synthetic */ BRr $this_pointerInput;

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            public AnonymousClass1(BRr bRr, C1BO<? extends G0U<? super Float, Unit>> c1bo) {
                                super(1);
                                this.$this_pointerInput = bRr;
                                this.$currentOnScrubFinished$delegate = c1bo;
                            }

                            @Override // X.G0U
                            public /* bridge */ /* synthetic */ Unit invoke(AWx aWx) {
                                m625invokek4lQ0M(aWx.A00);
                                return Unit.INSTANCE;
                            }

                            /* renamed from: invoke-k-4lQ0M, reason: not valid java name */
                            public final void m625invokek4lQ0M(long j) {
                                float f = (int) (((AaN) this.$this_pointerInput).A00 >> 32);
                                if (f < 1.0f) {
                                    f = 1.0f;
                                }
                                C1BO<G0U<Float, Unit>> c1bo = this.$currentOnScrubFinished$delegate;
                                int i = HatchInlineAudioPlayerKt.ARTWORK_SIZE_DP;
                                G0U g0uA0B = C1BO.A0B(c1bo);
                                if (g0uA0B != null) {
                                    AnonymousClass007.A1B(g0uA0B, AnonymousClass001.A00(j), f);
                                }
                            }
                        }

                        @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
                        public final Object invoke(BRr bRr, HtJ<? super Unit> htJ) {
                            return AnonymousClass007.A0W(bRr, htJ, new AnonymousClass1(bRr, mutableStateA002));
                        }
                    };
                    bfm.Ai0(objAaT);
                }
                BRg bRgA002 = AaM.A00(bs0, (PointerInputEventHandler) objAaT, unit);
                boolean zA1K = AnonymousClass003.A1K(bfm, mutableStateA00, mutableStateA002);
                Object objAaT2 = bfm.AaT();
                if (zA1K || objAaT2 == C78N.A00) {
                    objAaT2 = new PointerInputEventHandler() { // from class: com.facebook.aura.conversation.view.HatchInlineAudioPlayerKt$InlineAudioSeekTrack$gestureModifier$2$1

                        /* renamed from: com.facebook.aura.conversation.view.HatchInlineAudioPlayerKt$InlineAudioSeekTrack$gestureModifier$2$1$1, reason: invalid class name */
                        public final class AnonymousClass1 extends AbstractC7559F3s implements G0U<AWx, Unit> {
                            public final /* synthetic */ C1BO<G0U<Float, Unit>> $currentOnScrub$delegate;
                            public final /* synthetic */ C1051ASv $dragX;
                            public final /* synthetic */ BRr $this_pointerInput;

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            public AnonymousClass1(C1051ASv c1051ASv, BRr bRr, C1BO<? extends G0U<? super Float, Unit>> c1bo) {
                                super(1);
                                this.$dragX = c1051ASv;
                                this.$this_pointerInput = bRr;
                                this.$currentOnScrub$delegate = c1bo;
                            }

                            @Override // X.G0U
                            public /* bridge */ /* synthetic */ Unit invoke(AWx aWx) {
                                m626invokek4lQ0M(aWx.A00);
                                return Unit.INSTANCE;
                            }

                            /* renamed from: invoke-k-4lQ0M, reason: not valid java name */
                            public final void m626invokek4lQ0M(long j) {
                                this.$dragX.element = AnonymousClass001.A00(j);
                                float f = (int) (((AaN) this.$this_pointerInput).A00 >> 32);
                                if (f < 1.0f) {
                                    f = 1.0f;
                                }
                                C1BO<G0U<Float, Unit>> c1bo = this.$currentOnScrub$delegate;
                                int i = HatchInlineAudioPlayerKt.ARTWORK_SIZE_DP;
                                G0U g0uA0B = C1BO.A0B(c1bo);
                                if (g0uA0B != null) {
                                    AnonymousClass007.A1B(g0uA0B, this.$dragX.element, f);
                                }
                            }
                        }

                        /* renamed from: com.facebook.aura.conversation.view.HatchInlineAudioPlayerKt$InlineAudioSeekTrack$gestureModifier$2$1$2, reason: invalid class name */
                        public final class AnonymousClass2 extends AbstractC7559F3s implements Function0<Unit> {
                            public final /* synthetic */ C1BO<G0U<Float, Unit>> $currentOnScrubFinished$delegate;
                            public final /* synthetic */ C1051ASv $dragX;
                            public final /* synthetic */ BRr $this_pointerInput;

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            public AnonymousClass2(BRr bRr, C1051ASv c1051ASv, C1BO<? extends G0U<? super Float, Unit>> c1bo) {
                                super(0);
                                this.$this_pointerInput = bRr;
                                this.$dragX = c1051ASv;
                                this.$currentOnScrubFinished$delegate = c1bo;
                            }

                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2() {
                                float fA01 = AnonymousClass007.A01(this.$this_pointerInput);
                                if (fA01 < 1.0f) {
                                    fA01 = 1.0f;
                                }
                                C1BO<G0U<Float, Unit>> c1bo = this.$currentOnScrubFinished$delegate;
                                int i = HatchInlineAudioPlayerKt.ARTWORK_SIZE_DP;
                                G0U g0uA0B = C1BO.A0B(c1bo);
                                if (g0uA0B != null) {
                                    AnonymousClass007.A1B(g0uA0B, this.$dragX.element, fA01);
                                }
                            }

                            @Override // kotlin.jvm.functions.Function0
                            public /* bridge */ /* synthetic */ Unit invoke() {
                                invoke2();
                                return Unit.INSTANCE;
                            }
                        }

                        /* renamed from: com.facebook.aura.conversation.view.HatchInlineAudioPlayerKt$InlineAudioSeekTrack$gestureModifier$2$1$3, reason: invalid class name */
                        public final class AnonymousClass3 extends AbstractC7559F3s implements Function0<Unit> {
                            public final /* synthetic */ C1BO<G0U<Float, Unit>> $currentOnScrubFinished$delegate;
                            public final /* synthetic */ C1051ASv $dragX;
                            public final /* synthetic */ BRr $this_pointerInput;

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            public AnonymousClass3(BRr bRr, C1051ASv c1051ASv, C1BO<? extends G0U<? super Float, Unit>> c1bo) {
                                super(0);
                                this.$this_pointerInput = bRr;
                                this.$dragX = c1051ASv;
                                this.$currentOnScrubFinished$delegate = c1bo;
                            }

                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2() {
                                float fA01 = AnonymousClass007.A01(this.$this_pointerInput);
                                if (fA01 < 1.0f) {
                                    fA01 = 1.0f;
                                }
                                C1BO<G0U<Float, Unit>> c1bo = this.$currentOnScrubFinished$delegate;
                                int i = HatchInlineAudioPlayerKt.ARTWORK_SIZE_DP;
                                G0U g0uA0B = C1BO.A0B(c1bo);
                                if (g0uA0B != null) {
                                    AnonymousClass007.A1B(g0uA0B, this.$dragX.element, fA01);
                                }
                            }

                            @Override // kotlin.jvm.functions.Function0
                            public /* bridge */ /* synthetic */ Unit invoke() {
                                invoke2();
                                return Unit.INSTANCE;
                            }
                        }

                        /* renamed from: com.facebook.aura.conversation.view.HatchInlineAudioPlayerKt$InlineAudioSeekTrack$gestureModifier$2$1$4, reason: invalid class name */
                        public final class AnonymousClass4 extends AbstractC7559F3s implements G0V<C1299Agk, Float, Unit> {
                            public final /* synthetic */ C1BO<G0U<Float, Unit>> $currentOnScrub$delegate;
                            public final /* synthetic */ C1051ASv $dragX;
                            public final /* synthetic */ BRr $this_pointerInput;

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            public AnonymousClass4(C1051ASv c1051ASv, BRr bRr, C1BO<? extends G0U<? super Float, Unit>> c1bo) {
                                super(2);
                                this.$dragX = c1051ASv;
                                this.$this_pointerInput = bRr;
                                this.$currentOnScrub$delegate = c1bo;
                            }

                            @Override // X.G0V
                            public /* bridge */ /* synthetic */ Unit invoke(C1299Agk c1299Agk, Float f) {
                                invoke(c1299Agk, AnonymousClass001.A02(f));
                                return Unit.INSTANCE;
                            }

                            public final void invoke(C1299Agk c1299Agk, float f) {
                                C7384Etj.A0Y(c1299Agk, 0);
                                c1299Agk.A02();
                                this.$dragX.element += f;
                                float fA01 = AnonymousClass007.A01(this.$this_pointerInput);
                                if (fA01 < 1.0f) {
                                    fA01 = 1.0f;
                                }
                                C1BO<G0U<Float, Unit>> c1bo = this.$currentOnScrub$delegate;
                                int i = HatchInlineAudioPlayerKt.ARTWORK_SIZE_DP;
                                G0U g0uA0B = C1BO.A0B(c1bo);
                                if (g0uA0B != null) {
                                    AnonymousClass007.A1B(g0uA0B, this.$dragX.element, fA01);
                                }
                            }
                        }

                        @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
                        public final Object invoke(BRr bRr, HtJ<? super Unit> htJ) {
                            C1051ASv c1051ASv = new C1051ASv();
                            C1BO<G0U<Float, Unit>> c1bo = mutableStateA00;
                            AnonymousClass1 anonymousClass1 = new AnonymousClass1(c1051ASv, bRr, c1bo);
                            C1BO<G0U<Float, Unit>> c1bo2 = mutableStateA002;
                            Object objA0l = AnonymousClass006.A0l(bRr, htJ, new C3bf(null, new AnonymousClass2(bRr, c1051ASv, c1bo2), new AnonymousClass3(bRr, c1051ASv, c1bo2), anonymousClass1, new AnonymousClass4(c1051ASv, bRr, c1bo), 0));
                            return objA0l != EnumC10460Hji.A02 ? Unit.INSTANCE : objA0l;
                        }
                    };
                    bfm.Ai0(objAaT2);
                }
                bRgA00 = AaM.A00(bRgA002, (PointerInputEventHandler) objAaT2, unit);
                A1V = AnonymousClass001.A1V(bfm);
            }
            long j = auraColorsA0c.tertiaryText;
            long jA04 = HxS.A04(HDi.A0O[(int) (j & 63)], B6A.A03(j), B6A.A02(j), B6A.A01(j), 0.3f);
            long j2 = auraColorsA0c.primaryIcon.enabled;
            BRg bRgThen = C10G.A04(bRg2, SeekTrackHeight).then(bRgA00);
            boolean zA1W2 = AnonymousClass004.A1W(bfm, mutableStateA002, z, AnonymousClass004.A1M(iA0T) | AnonymousClass005.A1L(iA0T) | AnonymousClass004.A1I(iA0T));
            Object objAaT3 = bfm.AaT();
            if (zA1W2 || objAaT3 == C78N.A00) {
                objAaT3 = new HatchInlineAudioPlayerKt$InlineAudioSeekTrack$1$1(str3, str5, f, z, mutableStateA002);
                str4 = str5;
                bfm.Ai0(objAaT3);
            } else {
                str4 = str5;
            }
            BRg bRgA01 = ARD.A01(bRgThen, (G0U) objAaT3, A1V);
            boolean zA1T = AnonymousClass002.A1T(bfm, j2, bfm.A64(jA04), (iA0T & 14) == 4);
            Object objAaT4 = bfm.AaT();
            if (zA1T || objAaT4 == C78N.A00) {
                objAaT4 = new HatchInlineAudioPlayerKt$InlineAudioSeekTrack$2$1(jA04, function0, j2);
                bfm.Ai0(objAaT4);
            }
            C0zJ.A00(bRgA01, (G0U) objAaT4, bfm, A1V);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C114813(function0, f, bRg2, str3, str4, g0u3, g0u4, i, i2);
        }
    }

    public static final void InlineAudioSpeedControl(float f, Function0<Unit> function0, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(1085241624);
        int iA04 = (i & 6) == 0 ? AnonymousClass004.A04(bfm, f) | i : i;
        if ((i & 48) == 0) {
            iA04 |= AnonymousClass004.A0U(bfm, function0);
        }
        int i3 = i2 & 4;
        if (i3 != 0) {
            iA04 |= 384;
        } else if ((i & 384) == 0) {
            iA04 |= AnonymousClass004.A0f(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA04 & 147, 146), bfm, iA04)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            AuraColors auraColorsA0c = AnonymousClass002.A0c(bfm);
            AuraTypography auraTypographyA0f = AnonymousClass002.A0f(bfm);
            AuraTextKt.m2639AuraTextUY9GdpU(formatPlaybackRate(f), C10G.A02(C2VU.A09, C0v5.A04(C11U.A01(C10G.A09(bRg2, 48.0f, 48.0f), 8.0f), new C1YD(0), AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f1201c6), function0, true), false), auraColorsA0c.secondaryText, auraTypographyA0f.caption1Emphasized, null, null, new C1YL(3), false, 0, 0, 0, null, null, null, bfm, 0, 0, 16304);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C114821(f, function0, bRg2, i, i2);
        }
    }

    public static final String formatPlaybackRate(float f) {
        return FGI.A0M(f % 1.0f == 0.0f ? String.valueOf((int) f) : C7BY.A0Z(C7BY.A0Z(String.valueOf(f), '0'), '.'), "x");
    }

    public static final String formatTimeMs(int i) {
        return AnonymousClass007.A0X(i / 1000);
    }

    public static final void logAudioControlClick(HatchComponent hatchComponent, Map<String, String> map) {
        HatchInteractionLogger.INSTANCE.logClick(HatchSurface.CHAT, HatchSubsurface.MESSAGE_LIST, HatchScreen.MAIN_CHAT, hatchComponent, null, map, null);
    }

    public static final void logAudioSpeedClick(float f, Map<String, String> map) {
        HatchInteractionLogger.INSTANCE.logClick(HatchSurface.CHAT, HatchSubsurface.MESSAGE_LIST, HatchScreen.MAIN_CHAT, HatchComponent.AUDIO_SPEED_BUTTON, null, AGH.A02(map, AnonymousClass006.A10(HatchMetadataKey.PLAYBACK_RATE.getValue(), formatPlaybackRate(f))), null);
    }

    public static final float nextPlaybackSpeed(float f) {
        List<Float> list = PLAYBACK_SPEEDS;
        Iterator<Float> it = list.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            }
            if (Math.abs(AnonymousClass001.A02(it.next()) - f) < 0.01f) {
                break;
            }
            i++;
        }
        return AnonymousClass001.A02(list.get((i + 1) % list.size()));
    }

    public static final String formatTimeSeconds(int i) {
        return AnonymousClass007.A0X(i);
    }
}
