package com.facebook.aura.conversation.view;

import X.AGH;
import X.AKQ;
import X.ARD;
import X.AVy;
import X.AWx;
import X.AaM;
import X.AaN;
import X.AbstractC0885AGm;
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
import X.B6A;
import X.BBI;
import X.BBb;
import X.BFM;
import X.BOf;
import X.BRg;
import X.BRr;
import X.BS0;
import X.C00q;
import X.C00x;
import X.C0zJ;
import X.C1051ASv;
import X.C10G;
import X.C1299Agk;
import X.C1515AkP;
import X.C1822Arm;
import X.C1BO;
import X.C1DG;
import X.C1er;
import X.C2CK;
import X.C3U4;
import X.C3bf;
import X.C7384Etj;
import X.C78N;
import X.C90m;
import X.EnumC10460Hji;
import X.F60;
import X.G0U;
import X.G0V;
import X.HDi;
import X.HtJ;
import X.HxS;
import X.InterfaceC1380AiA;
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
import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;
import com.facebook.aura.vds.compose.icons.AuraIconButtonBackground;
import com.facebook.aura.vds.compose.icons.AuraIconButtonKt;
import com.facebook.aura.vds.compose.icons.AuraIconButtonSizeV2;
import com.facebook.aura.vds.compose.icons.AuraIconButtonStyle;
import com.facebook.aura.vds.compose.text.AuraTextKt;
import com.facebook.aura.vds.compose.theme.AuraColors;
import com.facebook.aura.vds.compose.theme.AuraTypography;
import com.facebook.common.dextricks.RuntimeInternals;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public abstract class HatchCompactAudioPlayerKt {
    public static final float NOT_SCRUBBING = -1.0f;
    public static final float SeekTrackHeight = 48.0f;
    public static final int WAVEFORM_LEVEL_COUNT = 160;
    public static final float WAVEFORM_MIN_LEVEL = 0.14f;
    public static final float WaveformBarGap = 2.0f;
    public static final float WaveformBarWidth = 3.0f;
    public static final float WaveformHeight = 32.0f;
    public static final Function0<Float> ZeroProgress = HatchCompactAudioPlayerKt$ZeroProgress$1.INSTANCE;

    /* renamed from: com.facebook.aura.conversation.view.HatchCompactAudioPlayerKt$ActiveCompactAudioWaveform$3, reason: invalid class name */
    public final class AnonymousClass3 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ int $durationMs;
        public final /* synthetic */ WaveformLevels $levels;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ HatchAudioPlayerRepository $service;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(HatchAudioPlayerRepository hatchAudioPlayerRepository, WaveformLevels waveformLevels, int i, BRg bRg, int i2, int i3) {
            super(2);
            this.$service = hatchAudioPlayerRepository;
            this.$levels = waveformLevels;
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
            HatchCompactAudioPlayerKt.ActiveCompactAudioWaveform(this.$service, this.$levels, this.$durationMs, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.conversation.view.HatchCompactAudioPlayerKt$CompactAudioPlayPauseButton$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ boolean $isLoading;
        public final /* synthetic */ boolean $isPlaying;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onClick;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(boolean z, boolean z2, Function0<Unit> function0, BRg bRg, int i, int i2) {
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
            HatchCompactAudioPlayerKt.CompactAudioPlayPauseButton(this.$isPlaying, this.$isLoading, this.$onClick, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.conversation.view.HatchCompactAudioPlayerKt$CompactAudioWaveform$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ int $durationMs;
        public final /* synthetic */ boolean $isActiveItem;
        public final /* synthetic */ boolean $isPrepared;
        public final /* synthetic */ WaveformLevels $levels;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ HatchAudioPlayerRepository $service;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(HatchAudioPlayerRepository hatchAudioPlayerRepository, WaveformLevels waveformLevels, boolean z, boolean z2, int i, BRg bRg, int i2, int i3) {
            super(2);
            this.$service = hatchAudioPlayerRepository;
            this.$levels = waveformLevels;
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
            HatchCompactAudioPlayerKt.CompactAudioWaveform(this.$service, this.$levels, this.$isActiveItem, this.$isPrepared, this.$durationMs, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.conversation.view.HatchCompactAudioPlayerKt$CompactAudioWaveformContent$2, reason: invalid class name and case insensitive filesystem */
    public final class C114082 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ Function0<Float> $drawProgress;
        public final /* synthetic */ WaveformLevels $levels;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ G0U<Float, Unit> $onScrub;
        public final /* synthetic */ G0U<Float, Unit> $onScrubFinished;
        public final /* synthetic */ String $seekState;
        public final /* synthetic */ float $semanticsProgress;
        public final /* synthetic */ String $timeText;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C114082(WaveformLevels waveformLevels, Function0<Float> function0, float f, String str, String str2, BRg bRg, G0U<? super Float, Unit> g0u, G0U<? super Float, Unit> g0u2, int i, int i2) {
            super(2);
            this.$levels = waveformLevels;
            this.$drawProgress = function0;
            this.$semanticsProgress = f;
            this.$timeText = str;
            this.$seekState = str2;
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
            HatchCompactAudioPlayerKt.CompactAudioWaveformContent(this.$levels, this.$drawProgress, this.$semanticsProgress, this.$timeText, this.$seekState, this.$modifier, this.$onScrub, this.$onScrubFinished, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    public static final void logAudioPlayPauseClick(boolean z, String str, Map<String, String> map) {
        C7384Etj.A0Y(map, 2);
        HatchInteractionLogger.INSTANCE.logClick(HatchSurface.CHAT, HatchSubsurface.MESSAGE_LIST, HatchScreen.MAIN_CHAT, z ? HatchComponent.AUDIO_PAUSE_BUTTON : HatchComponent.AUDIO_PLAY_BUTTON, null, AGH.A08(AbstractC0885AGm.A0z(str != null ? AnonymousClass006.A12(HatchMetadataKey.AUDIO_TYPE, str) : null), map), null);
    }

    /* JADX WARN: Failed to analyze thrown exceptions
    java.util.ConcurrentModificationException
    	at java.base/java.util.ArrayList$Itr.checkForComodification(ArrayList.java:1013)
    	at java.base/java.util.ArrayList$Itr.next(ArrayList.java:967)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.processInstructions(MethodThrowsVisitor.java:131)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.visit(MethodThrowsVisitor.java:69)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.checkInsn(MethodThrowsVisitor.java:179)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.processInstructions(MethodThrowsVisitor.java:132)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.visit(MethodThrowsVisitor.java:69)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.checkInsn(MethodThrowsVisitor.java:179)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.processInstructions(MethodThrowsVisitor.java:132)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.visit(MethodThrowsVisitor.java:69)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.checkInsn(MethodThrowsVisitor.java:179)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.processInstructions(MethodThrowsVisitor.java:132)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.visit(MethodThrowsVisitor.java:69)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.checkInsn(MethodThrowsVisitor.java:179)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.processInstructions(MethodThrowsVisitor.java:132)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.visit(MethodThrowsVisitor.java:69)
     */
    public static final void ActiveCompactAudioWaveform(HatchAudioPlayerRepository hatchAudioPlayerRepository, WaveformLevels waveformLevels, int i, BRg bRg, BFM bfm, int i2, int i3) {
        BRg bRg2 = bRg;
        bfm.AgG(711651637);
        int iA05 = (i2 & 6) == 0 ? AnonymousClass002.A05(AnonymousClass004.A1X(hatchAudioPlayerRepository, bfm, i2) ? 1 : 0) | i2 : i2;
        if ((i2 & 48) == 0) {
            iA05 |= AnonymousClass004.A0e(bfm, waveformLevels);
        }
        if ((i2 & 384) == 0) {
            iA05 |= AnonymousClass004.A0F(bfm, i);
        }
        int i4 = i3 & 8;
        if (i4 != 0) {
            iA05 |= 3072;
        } else if ((i2 & 3072) == 0) {
            iA05 |= AnonymousClass004.A0g(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA05 & 1171, 1170), bfm, iA05)) {
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
            int i5 = iA05 & 896;
            boolean z = i5 == 256;
            Object objAaT2 = bfm.AaT();
            if (z || objAaT2 == obj) {
                objAaT2 = new HatchCompactAudioPlayerKt$ActiveCompactAudioWaveform$drawProgress$1$1(c00q, c1boA02, i);
                bfm.Ai0(objAaT2);
            }
            Function0 function0 = (Function0) objAaT2;
            boolean zA1Q = AnonymousClass002.A1Q(i5, 256);
            Object objAaT3 = bfm.AaT();
            if (zA1Q || objAaT3 == obj) {
                objAaT3 = AnonymousClass002.A0K(bfm, null, new HatchCompactAudioPlayerKt$ActiveCompactAudioWaveform$displaySeconds$1$1(c00q, i, c1boA02));
            }
            C1BO c1bo = (C1BO) objAaT3;
            int iA02 = C1BO.A02(c1bo);
            int i6 = HatchInlineAudioPlayerKt.ARTWORK_SIZE_DP;
            String strA0X = AnonymousClass007.A0X(iA02);
            float fA00 = AnonymousClass003.A00((C1BO.A01(c1bo) * 1000.0f) / i);
            String strA0w = AnonymousClass006.A0w(bfm, strA0X, AnonymousClass007.A0X(i / 1000), R.string._name_removed__res_0x7f1201c5);
            Object objAaT4 = bfm.AaT();
            if (objAaT4 == obj) {
                objAaT4 = new HatchCompactAudioPlayerKt$ActiveCompactAudioWaveform$1$1(c00q);
                bfm.Ai0(objAaT4);
            }
            G0U g0u = (G0U) objAaT4;
            boolean z2 = ((iA05 & 14) == 4 || ((iA05 & 8) != 0 && bfm.A67(hatchAudioPlayerRepository))) | (i5 == 256);
            Object objAaT5 = bfm.AaT();
            if (z2 || objAaT5 == obj) {
                objAaT5 = new HatchCompactAudioPlayerKt$ActiveCompactAudioWaveform$2$1(hatchAudioPlayerRepository, i, c00q);
                bfm.Ai0(objAaT5);
            }
            CompactAudioWaveformContent(waveformLevels, function0, fA00, strA0X, strA0w, bRg2, g0u, (G0U) objAaT5, bfm, ((iA05 >> 3) & 14) | 1572864 | ((iA05 << 6) & 458752), 0);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass3(hatchAudioPlayerRepository, waveformLevels, i, bRg2, i2, i3);
        }
    }

    public static final void CompactAudioPlayPauseButton(boolean z, boolean z2, Function0<Unit> function0, BRg bRg, BFM bfm, int i, int i2) {
        int i3;
        BBI bbi;
        BRg bRg2 = bRg;
        bfm.AgG(1655266554);
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
                bfm.AgE(1526581411);
                BRg bRgA07 = C10G.A07(bRg2, 36.0f);
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
                bfm.AgE(1526710960);
                int i5 = R.drawable.ic_playback_play;
                if (z) {
                    i5 = R.drawable.ic_playback_pause;
                }
                AVy aVyA00 = BOf.A00(bfm, i5, 0);
                AuraIconButtonSizeV2 auraIconButtonSizeV2 = AuraIconButtonSizeV2.MEDIUM;
                AuraIconButtonStyle auraIconButtonStyle = AuraIconButtonStyle.PRIMARY;
                AuraIconButtonBackground auraIconButtonBackground = AuraIconButtonBackground.NO_BACKGROUND;
                long j = auraColorsA0c.primaryIcon.enabled;
                if (z) {
                    bfm.AgE(1573285007);
                    i3 = R.string._name_removed__res_0x7f120db0;
                } else {
                    bfm.AgE(1573287278);
                    i3 = R.string._name_removed__res_0x7f120e6c;
                }
                String strA01 = AbstractC2271BQs.A01(bfm, i3);
                bbi = (BBI) bfm;
                AuraIconButtonKt.m2552AuraIconButtonV2imgtlEU(bRg2, aVyA00, auraIconButtonSizeV2, auraIconButtonStyle, auraIconButtonBackground, null, strA01, function0, null, false, AnonymousClass006.A0P(bbi, j), new C1DG(26.0f), null, null, bfm, AnonymousClass001.A0C(iA0n << 15, ((iA0n >> 9) & 14) | 28032 | (AVy.$stable << 3)), 48, 13088);
            }
            BBI.A0R(bbi, false);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass2(z, z2, function0, bRg2, i, i2);
        }
    }

    public static final void CompactAudioWaveform(HatchAudioPlayerRepository hatchAudioPlayerRepository, WaveformLevels waveformLevels, boolean z, boolean z2, int i, BRg bRg, BFM bfm, int i2, int i3) {
        BRg bRg2 = bRg;
        bfm.AgG(-1413643449);
        int iA05 = (i2 & 6) == 0 ? AnonymousClass002.A05(AnonymousClass004.A1X(hatchAudioPlayerRepository, bfm, i2) ? 1 : 0) | i2 : i2;
        if ((i2 & 48) == 0) {
            iA05 |= AnonymousClass004.A0e(bfm, waveformLevels);
        }
        if ((i2 & 384) == 0) {
            iA05 |= AnonymousClass004.A0p(bfm, z);
        }
        if ((i2 & 3072) == 0) {
            iA05 |= AnonymousClass004.A0q(bfm, z2);
        }
        if ((i2 & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA05 |= AnonymousClass004.A0G(bfm, i);
        }
        int i4 = i3 & 32;
        int iA0i = 196608;
        if (i4 != 0) {
            iA05 |= iA0i;
        } else if ((196608 & i2) == 0) {
            iA0i = AnonymousClass004.A0i(bfm, bRg2);
            iA05 |= iA0i;
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(74899 & iA05, 74898), bfm, iA05)) {
            if (i4 != 0) {
                bRg2 = BRg.A00;
            }
            if (z && z2 && i > 0) {
                bfm.AgE(-1697390082);
                ActiveCompactAudioWaveform(hatchAudioPlayerRepository, waveformLevels, i, bRg2, bfm, AnonymousClass002.A08(iA05 >> 6, HatchAudioPlayerRepository.$stable | (iA05 & 14) | (iA05 & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX)), 0);
            } else {
                bfm.AgE(-1697222186);
                int i5 = HatchInlineAudioPlayerKt.ARTWORK_SIZE_DP;
                String strA0X = AnonymousClass007.A0X(i / 1000);
                CompactAudioWaveformContent(waveformLevels, ZeroProgress, 0.0f, strA0X, AnonymousClass006.A0w(bfm, AnonymousClass007.A0X(0), strA0X, R.string._name_removed__res_0x7f1201c5), bRg2, null, null, bfm, AnonymousClass001.A07(iA05, ((iA05 >> 3) & 14) | 432), 192);
            }
            AnonymousClass001.A1D(bfm);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass1(hatchAudioPlayerRepository, waveformLevels, z, z2, i, bRg2, i2, i3);
        }
    }

    /* JADX WARN: Type inference failed for: r12v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r12v4 */
    /* JADX WARN: Type inference failed for: r12v5 */
    /* renamed from: CompactAudioWaveformBars-0quPzfM, reason: not valid java name */
    public static final void m537CompactAudioWaveformBars0quPzfM(WaveformLevels waveformLevels, Function0<Float> function0, float f, long j, long j2, String str, String str2, G0U<? super Float, Unit> g0u, G0U<? super Float, Unit> g0u2, BRg bRg, BFM bfm, int i, int i2) {
        boolean z;
        BRg bRgA00;
        ?? A1V;
        BRg bRg2 = bRg;
        bfm.AgG(-147232871);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, waveformLevels) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0U(bfm, function0);
        }
        if ((i & 384) == 0) {
            iA0d |= AnonymousClass004.A06(bfm, f);
        }
        if ((i & 3072) == 0) {
            iA0d |= AnonymousClass004.A0P(bfm, j);
        }
        if ((i & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA0d |= AnonymousClass004.A0Q(bfm, j2);
        }
        if ((i & 196608) == 0) {
            iA0d |= AnonymousClass004.A0i(bfm, str);
        }
        if ((i & 1572864) == 0) {
            iA0d |= AnonymousClass004.A0j(bfm, str2);
        }
        if ((i & 12582912) == 0) {
            iA0d |= AnonymousClass004.A0a(bfm, g0u);
        }
        if ((i & 100663296) == 0) {
            iA0d |= AnonymousClass004.A0b(bfm, g0u2);
        }
        int i3 = i2 & 512;
        int iA0m = 805306368;
        if (i3 != 0) {
            iA0d |= iA0m;
        } else if ((i & 805306368) == 0) {
            iA0m = AnonymousClass004.A0m(bfm, bRg2);
            iA0d |= iA0m;
        }
        if (AnonymousClass001.A1b(AnonymousClass005.A1I(iA0d), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            final MutableState mutableStateA00 = C1er.A00(bfm, g0u);
            final MutableState mutableStateA002 = C1er.A00(bfm, g0u2);
            if (g0u == null || g0u2 == null) {
                z = false;
                bfm.AgE(-1050908593);
                boolean zA1W = AnonymousClass001.A1W(bfm);
                bRgA00 = BRg.A00;
                A1V = zA1W;
            } else {
                z = true;
                bfm.AgE(-1052248258);
                BS0 bs0 = BRg.A00;
                Unit unit = Unit.INSTANCE;
                boolean zA65 = bfm.A65(mutableStateA002);
                Object objAaT = bfm.AaT();
                if (zA65 || objAaT == C78N.A00) {
                    objAaT = new PointerInputEventHandler() { // from class: com.facebook.aura.conversation.view.HatchCompactAudioPlayerKt$CompactAudioWaveformBars$gestureModifier$1$1

                        /* renamed from: com.facebook.aura.conversation.view.HatchCompactAudioPlayerKt$CompactAudioWaveformBars$gestureModifier$1$1$1, reason: invalid class name */
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
                                m540invokek4lQ0M(aWx.A00);
                                return Unit.INSTANCE;
                            }

                            /* renamed from: invoke-k-4lQ0M, reason: not valid java name */
                            public final void m540invokek4lQ0M(long j) {
                                float f = (int) (((AaN) this.$this_pointerInput).A00 >> 32);
                                if (f < 1.0f) {
                                    f = 1.0f;
                                }
                                G0U g0uA0B = C1BO.A0B(this.$currentOnScrubFinished$delegate);
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
                    objAaT2 = new PointerInputEventHandler() { // from class: com.facebook.aura.conversation.view.HatchCompactAudioPlayerKt$CompactAudioWaveformBars$gestureModifier$2$1

                        /* renamed from: com.facebook.aura.conversation.view.HatchCompactAudioPlayerKt$CompactAudioWaveformBars$gestureModifier$2$1$1, reason: invalid class name */
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
                                m541invokek4lQ0M(aWx.A00);
                                return Unit.INSTANCE;
                            }

                            /* renamed from: invoke-k-4lQ0M, reason: not valid java name */
                            public final void m541invokek4lQ0M(long j) {
                                this.$dragX.element = AnonymousClass001.A00(j);
                                float f = (int) (((AaN) this.$this_pointerInput).A00 >> 32);
                                if (f < 1.0f) {
                                    f = 1.0f;
                                }
                                G0U g0uA0B = C1BO.A0B(this.$currentOnScrub$delegate);
                                if (g0uA0B != null) {
                                    AnonymousClass007.A1B(g0uA0B, this.$dragX.element, f);
                                }
                            }
                        }

                        /* renamed from: com.facebook.aura.conversation.view.HatchCompactAudioPlayerKt$CompactAudioWaveformBars$gestureModifier$2$1$2, reason: invalid class name */
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
                                G0U g0uA0B = C1BO.A0B(this.$currentOnScrubFinished$delegate);
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

                        /* renamed from: com.facebook.aura.conversation.view.HatchCompactAudioPlayerKt$CompactAudioWaveformBars$gestureModifier$2$1$3, reason: invalid class name */
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
                                G0U g0uA0B = C1BO.A0B(this.$currentOnScrubFinished$delegate);
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

                        /* renamed from: com.facebook.aura.conversation.view.HatchCompactAudioPlayerKt$CompactAudioWaveformBars$gestureModifier$2$1$4, reason: invalid class name */
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
                                G0U g0uA0B = C1BO.A0B(this.$currentOnScrub$delegate);
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
            BRg bRgThen = C10G.A04(bRg2, SeekTrackHeight).then(bRgA00);
            boolean zA1W2 = AnonymousClass004.A1W(bfm, mutableStateA002, z, AnonymousClass007.A1H(iA0d) | AnonymousClass005.A1B(iA0d) | AnonymousClass004.A1K(iA0d));
            Object objAaT3 = bfm.AaT();
            if (zA1W2 || objAaT3 == C78N.A00) {
                objAaT3 = new HatchCompactAudioPlayerKt$CompactAudioWaveformBars$1$1(str, str2, f, z, mutableStateA002);
                bfm.Ai0(objAaT3);
            }
            BRg bRgA01 = ARD.A01(bRgThen, (G0U) objAaT3, A1V);
            boolean zA1F = AnonymousClass004.A1F(iA0d) | AnonymousClass006.A1V(iA0d) | AnonymousClass004.A1M(iA0d) | ((57344 & iA0d) == 16384);
            Object objAaT4 = bfm.AaT();
            if (zA1F || objAaT4 == C78N.A00) {
                objAaT4 = new HatchCompactAudioPlayerKt$CompactAudioWaveformBars$2$1(function0, waveformLevels, j, j2);
                bfm.Ai0(objAaT4);
            }
            C0zJ.A00(bRgA01, (G0U) objAaT4, bfm, A1V);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new HatchCompactAudioPlayerKt$CompactAudioWaveformBars$3(waveformLevels, function0, f, j, j2, str, str2, g0u, g0u2, bRg2, i, i2);
        }
    }

    public static final void CompactAudioWaveformContent(WaveformLevels waveformLevels, Function0<Float> function0, float f, String str, String str2, BRg bRg, G0U<? super Float, Unit> g0u, G0U<? super Float, Unit> g0u2, BFM bfm, int i, int i2) {
        G0U<? super Float, Unit> g0u3;
        BRg bRg2 = bRg;
        G0U<? super Float, Unit> g0u4 = g0u;
        bfm.AgG(2115909082);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, waveformLevels) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0U(bfm, function0);
        }
        if ((i & 384) == 0) {
            iA0d |= AnonymousClass004.A06(bfm, f);
        }
        if ((i & 3072) == 0) {
            iA0d |= AnonymousClass004.A0g(bfm, str);
        }
        if ((i & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA0d |= AnonymousClass004.A0h(bfm, str2);
        }
        int i3 = i2 & 32;
        int iA0i = 196608;
        if (i3 != 0) {
            iA0d |= iA0i;
        } else if ((196608 & i) == 0) {
            iA0i = AnonymousClass004.A0i(bfm, bRg2);
            iA0d |= iA0i;
        }
        int i4 = i2 & 64;
        int iA0Z = 1572864;
        if (i4 != 0) {
            iA0d |= iA0Z;
        } else if ((1572864 & i) == 0) {
            iA0Z = AnonymousClass004.A0Z(bfm, g0u4);
            iA0d |= iA0Z;
        }
        int i5 = i2 & 128;
        int iA0a = 12582912;
        if (i5 != 0) {
            iA0d |= iA0a;
        } else if ((i & 12582912) == 0) {
            iA0a = AnonymousClass004.A0a(bfm, g0u2);
            iA0d |= iA0a;
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 4793491, 4793490), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            if (i4 != 0) {
                g0u4 = null;
            }
            g0u3 = i5 == 0 ? g0u2 : null;
            AuraColors auraColorsA0c = AnonymousClass002.A0c(bfm);
            AuraTypography auraTypographyA0f = AnonymousClass002.A0f(bfm);
            long j = auraColorsA0c.primaryIcon.enabled;
            long j2 = auraColorsA0c.tertiaryText;
            long jA04 = HxS.A04(HDi.A0O[(int) (j2 & 63)], B6A.A03(j2), B6A.A02(j2), B6A.A01(j2), 0.3f);
            String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f1201c4);
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
            BS0 bs0 = BRg.A00;
            m537CompactAudioWaveformBars0quPzfM(waveformLevels, function0, f, j, jA04, strA01, str2, g0u4, g0u3, c90m.AiP(bs0, 1.0f, true), bfm, AnonymousClass005.A03(iA0d << 3, AnonymousClass001.A05(iA0d << 6, iA0d & 1022)), 0);
            AuraTextKt.m2639AuraTextUY9GdpU(str, C3U4.A0C(bs0, 10.0f, 0.0f, 2.0f, 0.0f), auraColorsA0c.secondaryText, C1822Arm.A00(null, auraTypographyA0f.caption1Regular, null, null, null, null, null, null, null, "tnum", 0, 0, 0, 16777151, 0L, 0L, 0L, 0L), null, null, null, false, 0, 0, 0, null, null, null, bfm, ((iA0d >> 9) & 14) | 48, 0, 16368);
            BBI.A0R(bbi, true);
        } else {
            bfm.Afo();
            g0u3 = g0u2;
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C114082(waveformLevels, function0, f, str, str2, bRg2, g0u4, g0u3, i, i2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:126:0x02aa A[PHI: r20 r41 r42 r44
  0x02aa: PHI (r20v2 boolean) = (r20v1 boolean), (r20v4 boolean) binds: [B:85:0x016a, B:87:0x0172] A[DONT_GENERATE, DONT_INLINE]
  0x02aa: PHI (r41v3 boolean) = (r41v2 boolean), (r41v5 boolean) binds: [B:85:0x016a, B:87:0x0172] A[DONT_GENERATE, DONT_INLINE]
  0x02aa: PHI (r42v1 boolean) = (r42v0 boolean), (r42v3 boolean) binds: [B:85:0x016a, B:87:0x0172] A[DONT_GENERATE, DONT_INLINE]
  0x02aa: PHI (r44v2 boolean) = (r44v1 boolean), (r44v5 boolean) binds: [B:85:0x016a, B:87:0x0172] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0150 A[PHI: r20 r41
  0x0150: PHI (r20v0 boolean) = (r20v7 boolean), (r20v8 boolean) binds: [B:77:0x014e, B:75:0x014a] A[DONT_GENERATE, DONT_INLINE]
  0x0150: PHI (r41v1 boolean) = (r41v8 boolean), (r41v9 boolean) binds: [B:77:0x014e, B:75:0x014a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x015a A[PHI: r20 r41
  0x015a: PHI (r20v6 boolean) = (r20v0 boolean), (r20v7 boolean) binds: [B:79:0x0158, B:77:0x014e] A[DONT_GENERATE, DONT_INLINE]
  0x015a: PHI (r41v7 boolean) = (r41v1 boolean), (r41v8 boolean) binds: [B:79:0x0158, B:77:0x014e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x015e A[PHI: r20 r41 r44
  0x015e: PHI (r20v5 boolean) = (r20v0 boolean), (r20v6 boolean) binds: [B:79:0x0158, B:81:0x015c] A[DONT_GENERATE, DONT_INLINE]
  0x015e: PHI (r41v6 boolean) = (r41v1 boolean), (r41v7 boolean) binds: [B:79:0x0158, B:81:0x015c] A[DONT_GENERATE, DONT_INLINE]
  0x015e: PHI (r44v6 boolean) = (r44v0 boolean), (r44v7 boolean) binds: [B:79:0x0158, B:81:0x015c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0168 A[PHI: r20 r41 r44
  0x0168: PHI (r20v1 boolean) = (r20v5 boolean), (r20v6 boolean) binds: [B:83:0x0166, B:81:0x015c] A[DONT_GENERATE, DONT_INLINE]
  0x0168: PHI (r41v2 boolean) = (r41v6 boolean), (r41v7 boolean) binds: [B:83:0x0166, B:81:0x015c] A[DONT_GENERATE, DONT_INLINE]
  0x0168: PHI (r44v1 boolean) = (r44v6 boolean), (r44v7 boolean) binds: [B:83:0x0166, B:81:0x015c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x016c A[PHI: r20 r41 r42 r44
  0x016c: PHI (r20v4 boolean) = (r20v1 boolean), (r20v5 boolean) binds: [B:85:0x016a, B:83:0x0166] A[DONT_GENERATE, DONT_INLINE]
  0x016c: PHI (r41v5 boolean) = (r41v2 boolean), (r41v6 boolean) binds: [B:85:0x016a, B:83:0x0166] A[DONT_GENERATE, DONT_INLINE]
  0x016c: PHI (r42v3 boolean) = (r42v0 boolean), (r42v4 boolean) binds: [B:85:0x016a, B:83:0x0166] A[DONT_GENERATE, DONT_INLINE]
  0x016c: PHI (r44v5 boolean) = (r44v1 boolean), (r44v6 boolean) binds: [B:85:0x016a, B:83:0x0166] A[DONT_GENERATE, DONT_INLINE]] */
    /* renamed from: HatchCompactAudioPlayer-FItCLgY, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m538HatchCompactAudioPlayerFItCLgY(java.lang.String r47, java.lang.String r48, X.BRg r49, java.lang.String r50, java.lang.String r51, java.lang.String r52, java.lang.String r53, java.lang.String r54, long r55, X.C1D3 r57, X.BFM r58, int r59, int r60) {
        /*
            Method dump skipped, instructions count: 883
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.conversation.view.HatchCompactAudioPlayerKt.m538HatchCompactAudioPlayerFItCLgY(java.lang.String, java.lang.String, X.BRg, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, long, X.1D3, X.BFM, int, int):void");
    }
}
