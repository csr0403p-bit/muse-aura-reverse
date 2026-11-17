package com.facebook.aura.partners.voice.ui;

import X.AWA;
import X.AbstractC1396AiR;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass003;
import X.AnonymousClass011;
import X.BFM;
import X.BRg;
import X.C1BO;
import X.C1b8;
import X.C3cG;
import X.C7384Etj;
import X.CFK;
import X.G0U;
import X.G0V;
import X.G0W;
import X.InterfaceC2178B0w;
import android.graphics.Bitmap;
import android.view.Surface;
import android.view.View;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.model.AgentActivityStatus;
import com.facebook.aura.model.AvatarStatusVideos;
import com.facebook.aura.partners.voice.intf.VoiceEmbodimentMedia;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public abstract class HatchEmbodimentMediaKt {
    public static final int AVATAR_CROSSFADE_MS = 200;
    public static final int LEGACY_MEDIA_CROSSFADE_MS = 450;
    public static final int LEGACY_SPEECH_CROSSFADE_MS = 180;
    public static final long OUTPUT_TAIL_HOLD_MS = 250;
    public static final long WORKING_ENTRY_DWELL_MS = 1500;

    /* renamed from: com.facebook.aura.partners.voice.ui.HatchEmbodimentMediaKt$EmbodimentActivityVideo$8, reason: invalid class name */
    public final class AnonymousClass8 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$changed1;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ Function0<Float> $bottomAlignmentFraction;
        public final /* synthetic */ EmbodimentClip $clip;
        public final /* synthetic */ G0W<AWA, BFM, Integer, BRg> $contentModifier;
        public final /* synthetic */ boolean $covered;
        public final /* synthetic */ boolean $fillViewport;
        public final /* synthetic */ boolean $keepPlayingOnPause;
        public final /* synthetic */ int $mediaGeneration;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onError;
        public final /* synthetic */ G0U<Function0<Bitmap>, Unit> $onFrameCaptureAvailable;
        public final /* synthetic */ G0U<Boolean, Unit> $onPlayerResourcesActiveChanged;
        public final /* synthetic */ Function0<Unit> $onRendered;
        public final /* synthetic */ G0U<View, Unit> $onSamplingViewChanged;
        public final /* synthetic */ G0U<AWA, Unit> $onViewportChanged;
        public final /* synthetic */ boolean $playbackEnabled;
        public final /* synthetic */ boolean $prewarmWhileCovered;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass8(EmbodimentClip embodimentClip, boolean z, G0W<? super AWA, ? super BFM, ? super Integer, ? extends BRg> g0w, Function0<Float> function0, int i, boolean z2, boolean z3, boolean z4, boolean z5, G0U<? super Boolean, Unit> g0u, Function0<Unit> function02, Function0<Unit> function03, G0U<? super Function0<Bitmap>, Unit> g0u2, G0U<? super View, Unit> g0u3, G0U<? super AWA, Unit> g0u4, BRg bRg, int i2, int i3, int i4) {
            super(2);
            this.$clip = embodimentClip;
            this.$fillViewport = z;
            this.$contentModifier = g0w;
            this.$bottomAlignmentFraction = function0;
            this.$mediaGeneration = i;
            this.$covered = z2;
            this.$prewarmWhileCovered = z3;
            this.$playbackEnabled = z4;
            this.$keepPlayingOnPause = z5;
            this.$onPlayerResourcesActiveChanged = g0u;
            this.$onRendered = function02;
            this.$onError = function03;
            this.$onFrameCaptureAvailable = g0u2;
            this.$onSamplingViewChanged = g0u3;
            this.$onViewportChanged = g0u4;
            this.$modifier = bRg;
            this.$$changed = i2;
            this.$$changed1 = i3;
            this.$$default = i4;
        }

        public final void invoke(BFM bfm, int i) {
            HatchEmbodimentMediaKt.EmbodimentActivityVideo(this.$clip, this.$fillViewport, this.$contentModifier, this.$bottomAlignmentFraction, this.$mediaGeneration, this.$covered, this.$prewarmWhileCovered, this.$playbackEnabled, this.$keepPlayingOnPause, this.$onPlayerResourcesActiveChanged, this.$onRendered, this.$onError, this.$onFrameCaptureAvailable, this.$onSamplingViewChanged, this.$onViewportChanged, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), AnonymousClass011.A01(this.$$changed1), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.partners.voice.ui.HatchEmbodimentMediaKt$EmbodimentMediaControllerInputEffect$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$changed1;
        public final /* synthetic */ EmbodimentClip $activityClip;
        public final /* synthetic */ boolean $activityCoverReady;
        public final /* synthetic */ AgentActivityStatus $agentActivityStatus;
        public final /* synthetic */ long $botOutputActivityGeneration;
        public final /* synthetic */ long $botOutputInactiveAtMs;
        public final /* synthetic */ VoiceEmbodimentMediaController $controller;
        public final /* synthetic */ EmbodimentClip $generatedIdleClip;
        public final /* synthetic */ boolean $hasLiveRtc;
        public final /* synthetic */ boolean $isBotOutputActive;
        public final /* synthetic */ boolean $isBotSpeaking;
        public final /* synthetic */ boolean $liveRtcEnabled;
        public final /* synthetic */ boolean $liveRtcReady;
        public final /* synthetic */ long $outputTailHoldMs;
        public final /* synthetic */ boolean $rtcCovering;
        public final /* synthetic */ boolean $rtcEverPaintedInCall;
        public final /* synthetic */ boolean $stillCovering;
        public final /* synthetic */ String $stillKey;
        public final /* synthetic */ boolean $videoStateSwapEnabled;
        public final /* synthetic */ long $workingEntryDwellMs;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(VoiceEmbodimentMediaController voiceEmbodimentMediaController, boolean z, boolean z2, AgentActivityStatus agentActivityStatus, EmbodimentClip embodimentClip, EmbodimentClip embodimentClip2, boolean z3, boolean z4, String str, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, long j, long j2, long j3, long j4, int i, int i2) {
            super(2);
            this.$controller = voiceEmbodimentMediaController;
            this.$hasLiveRtc = z;
            this.$liveRtcEnabled = z2;
            this.$agentActivityStatus = agentActivityStatus;
            this.$activityClip = embodimentClip;
            this.$generatedIdleClip = embodimentClip2;
            this.$liveRtcReady = z3;
            this.$rtcEverPaintedInCall = z4;
            this.$stillKey = str;
            this.$rtcCovering = z5;
            this.$stillCovering = z6;
            this.$activityCoverReady = z7;
            this.$videoStateSwapEnabled = z8;
            this.$isBotSpeaking = z9;
            this.$isBotOutputActive = z10;
            this.$botOutputActivityGeneration = j;
            this.$botOutputInactiveAtMs = j2;
            this.$workingEntryDwellMs = j3;
            this.$outputTailHoldMs = j4;
            this.$$changed = i;
            this.$$changed1 = i2;
        }

        public final void invoke(BFM bfm, int i) {
            HatchEmbodimentMediaKt.EmbodimentMediaControllerInputEffect(this.$controller, this.$hasLiveRtc, this.$liveRtcEnabled, this.$agentActivityStatus, this.$activityClip, this.$generatedIdleClip, this.$liveRtcReady, this.$rtcEverPaintedInCall, this.$stillKey, this.$rtcCovering, this.$stillCovering, this.$activityCoverReady, this.$videoStateSwapEnabled, this.$isBotSpeaking, this.$isBotOutputActive, this.$botOutputActivityGeneration, this.$botOutputInactiveAtMs, this.$workingEntryDwellMs, this.$outputTailHoldMs, bfm, AnonymousClass011.A00(this.$$changed), AnonymousClass011.A01(this.$$changed1));
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    public static final <Frame> Frame captureEmbodimentFrame(Function0<? extends Frame> function0) {
        C7384Etj.A0Y(function0, 0);
        try {
            return function0.invoke();
        } catch (Throwable th) {
            if (!(th instanceof RuntimeException) && !(th instanceof OutOfMemoryError)) {
                throw th;
            }
            CFK.A0K("HatchEmbodimentMedia", th, "Retained frame capture failed");
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:60:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01ed  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void EmbodimentActivityVideo(com.facebook.aura.partners.voice.ui.EmbodimentClip r63, boolean r64, X.G0W<? super X.AWA, ? super X.BFM, ? super java.lang.Integer, ? extends X.BRg> r65, kotlin.jvm.functions.Function0<java.lang.Float> r66, int r67, boolean r68, boolean r69, boolean r70, boolean r71, X.G0U<? super java.lang.Boolean, kotlin.Unit> r72, kotlin.jvm.functions.Function0<kotlin.Unit> r73, kotlin.jvm.functions.Function0<kotlin.Unit> r74, X.G0U<? super kotlin.jvm.functions.Function0<android.graphics.Bitmap>, kotlin.Unit> r75, X.G0U<? super android.view.View, kotlin.Unit> r76, X.G0U<? super X.AWA, kotlin.Unit> r77, X.BRg r78, X.BFM r79, int r80, int r81, int r82) {
        /*
            Method dump skipped, instructions count: 875
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.partners.voice.ui.HatchEmbodimentMediaKt.EmbodimentActivityVideo(com.facebook.aura.partners.voice.ui.EmbodimentClip, boolean, X.G0W, kotlin.jvm.functions.Function0, int, boolean, boolean, boolean, boolean, X.G0U, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, X.G0U, X.G0U, X.G0U, X.BRg, X.BFM, int, int, int):void");
    }

    public static final void clearSampledEdges(long j, G0W<? super Long, ? super EmbodimentEdge, ? super Integer, Unit> g0w) {
        if (g0w != null) {
            Long lValueOf = Long.valueOf(j);
            g0w.invoke(lValueOf, EmbodimentEdge.TOP, null);
            g0w.invoke(lValueOf, EmbodimentEdge.BOTTOM, null);
        }
    }

    /* renamed from: embodimentMediaLayer-bw27NRU, reason: not valid java name */
    public static final BRg m1810embodimentMediaLayerbw27NRU(BRg bRg, long j, Function0<Float> function0) {
        return C1b8.A01(AbstractC1396AiR.A00(bRg, new HatchEmbodimentMediaKt$embodimentMediaLayer$1(function0)), j);
    }

    public static final G0W<Long, EmbodimentEdge, Integer, Unit> HatchEmbodimentMedia_L7vc0rk$lambda$24(C1BO<? extends G0W<? super Long, ? super EmbodimentEdge, ? super Integer, Unit>> c1bo) {
        return (G0W) c1bo.getValue();
    }

    public static final G0V<InterfaceC2178B0w, VoiceEmbodimentMedia.ReferenceFraming, Unit> HatchEmbodimentMedia_L7vc0rk$lambda$62(C1BO<? extends G0V<? super InterfaceC2178B0w, ? super VoiceEmbodimentMedia.ReferenceFraming, Unit>> c1bo) {
        return (G0V) c1bo.getValue();
    }

    public static final /* synthetic */ G0W access$HatchEmbodimentMedia_L7vc0rk$lambda$24(C1BO c1bo) {
        return (G0W) c1bo.getValue();
    }

    public static final /* synthetic */ Function0 access$HatchEmbodimentMedia_L7vc0rk$lambda$27(MutableState mutableState) {
        return (Function0) mutableState.getValue();
    }

    public static final /* synthetic */ Function0 access$HatchEmbodimentMedia_L7vc0rk$lambda$30(MutableState mutableState) {
        return (Function0) mutableState.getValue();
    }

    public static final /* synthetic */ Surface access$HatchEmbodimentMedia_L7vc0rk$lambda$45(MutableState mutableState) {
        return (Surface) mutableState.getValue();
    }

    public static final /* synthetic */ Map access$HatchEmbodimentMedia_L7vc0rk$lambda$60(MutableState mutableState) {
        return (Map) mutableState.getValue();
    }

    public static final /* synthetic */ G0V access$HatchEmbodimentMedia_L7vc0rk$lambda$62(C1BO c1bo) {
        return (G0V) c1bo.getValue();
    }

    public static final EmbodimentClip resolveActivityClip(VoiceEmbodimentMedia voiceEmbodimentMedia, AgentActivityStatus agentActivityStatus, AvatarStatusVideos avatarStatusVideos, boolean z) {
        AnonymousClass003.A0u(voiceEmbodimentMedia, agentActivityStatus);
        if (!z) {
            return null;
        }
        if ((voiceEmbodimentMedia instanceof VoiceEmbodimentMedia.LiveRtc) || (voiceEmbodimentMedia instanceof VoiceEmbodimentMedia.StaticAvatar)) {
            return VoiceEmbodimentMediaReducerKt.clipFor(agentActivityStatus, avatarStatusVideos);
        }
        throw C3cG.A0q();
    }

    /* JADX WARN: Removed duplicated region for block: B:69:0x013c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void EmbodimentMediaControllerInputEffect(com.facebook.aura.partners.voice.ui.VoiceEmbodimentMediaController r47, boolean r48, boolean r49, com.facebook.aura.model.AgentActivityStatus r50, com.facebook.aura.partners.voice.ui.EmbodimentClip r51, com.facebook.aura.partners.voice.ui.EmbodimentClip r52, boolean r53, boolean r54, java.lang.String r55, boolean r56, boolean r57, boolean r58, boolean r59, boolean r60, boolean r61, long r62, long r64, long r66, long r68, X.BFM r70, int r71, int r72) {
        /*
            Method dump skipped, instructions count: 614
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.partners.voice.ui.HatchEmbodimentMediaKt.EmbodimentMediaControllerInputEffect(com.facebook.aura.partners.voice.ui.VoiceEmbodimentMediaController, boolean, boolean, com.facebook.aura.model.AgentActivityStatus, com.facebook.aura.partners.voice.ui.EmbodimentClip, com.facebook.aura.partners.voice.ui.EmbodimentClip, boolean, boolean, java.lang.String, boolean, boolean, boolean, boolean, boolean, boolean, long, long, long, long, X.BFM, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:1000:0x1377  */
    /* JADX WARN: Removed duplicated region for block: B:1003:0x138b  */
    /* JADX WARN: Removed duplicated region for block: B:1005:0x1391  */
    /* JADX WARN: Removed duplicated region for block: B:1008:0x13a4  */
    /* JADX WARN: Removed duplicated region for block: B:1012:0x13ec  */
    /* JADX WARN: Removed duplicated region for block: B:1016:0x142f  */
    /* JADX WARN: Removed duplicated region for block: B:1018:0x1477  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x022e  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x02e2  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x0301  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x031a  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x0331  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x0361  */
    /* JADX WARN: Removed duplicated region for block: B:300:0x04f7  */
    /* JADX WARN: Removed duplicated region for block: B:330:0x0591  */
    /* JADX WARN: Removed duplicated region for block: B:337:0x05ac  */
    /* JADX WARN: Removed duplicated region for block: B:340:0x05b6  */
    /* JADX WARN: Removed duplicated region for block: B:343:0x05cc  */
    /* JADX WARN: Removed duplicated region for block: B:347:0x05e2  */
    /* JADX WARN: Removed duplicated region for block: B:352:0x060a  */
    /* JADX WARN: Removed duplicated region for block: B:357:0x063c  */
    /* JADX WARN: Removed duplicated region for block: B:361:0x0645  */
    /* JADX WARN: Removed duplicated region for block: B:362:0x0647  */
    /* JADX WARN: Removed duplicated region for block: B:363:0x064b  */
    /* JADX WARN: Removed duplicated region for block: B:364:0x064f A[PHI: r40
  0x064f: PHI (r40v3 com.facebook.aura.partners.voice.intf.VoiceEmbodimentStillHandoff) = 
  (r40v2 com.facebook.aura.partners.voice.intf.VoiceEmbodimentStillHandoff)
  (r40v6 com.facebook.aura.partners.voice.intf.VoiceEmbodimentStillHandoff)
 binds: [B:321:0x0573, B:323:0x057b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:367:0x0657 A[PHI: r28
  0x0657: PHI (r28v2 com.facebook.aura.partners.voice.intf.VoiceEmbodimentMedia$StaticAvatar) = 
  (r28v1 com.facebook.aura.partners.voice.intf.VoiceEmbodimentMedia$StaticAvatar)
  (r28v11 com.facebook.aura.partners.voice.intf.VoiceEmbodimentMedia$StaticAvatar)
 binds: [B:304:0x0503, B:306:0x0507] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:371:0x0669  */
    /* JADX WARN: Removed duplicated region for block: B:602:0x0a92 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:605:0x0a98  */
    /* JADX WARN: Removed duplicated region for block: B:608:0x0abc  */
    /* JADX WARN: Removed duplicated region for block: B:610:0x0ac0  */
    /* JADX WARN: Removed duplicated region for block: B:615:0x0af5  */
    /* JADX WARN: Removed duplicated region for block: B:616:0x0af7  */
    /* JADX WARN: Removed duplicated region for block: B:621:0x0b03  */
    /* JADX WARN: Removed duplicated region for block: B:626:0x0b48  */
    /* JADX WARN: Removed duplicated region for block: B:630:0x0b68  */
    /* JADX WARN: Removed duplicated region for block: B:634:0x0b97  */
    /* JADX WARN: Removed duplicated region for block: B:639:0x0bd1  */
    /* JADX WARN: Removed duplicated region for block: B:646:0x0bea  */
    /* JADX WARN: Removed duplicated region for block: B:648:0x0bee  */
    /* JADX WARN: Removed duplicated region for block: B:650:0x0bf1  */
    /* JADX WARN: Removed duplicated region for block: B:656:0x0c00  */
    /* JADX WARN: Removed duplicated region for block: B:663:0x0c10  */
    /* JADX WARN: Removed duplicated region for block: B:665:0x0c14  */
    /* JADX WARN: Removed duplicated region for block: B:669:0x0c1c  */
    /* JADX WARN: Removed duplicated region for block: B:671:0x0c20 A[PHI: r20
  0x0c20: PHI (r20v10 boolean) = (r20v5 boolean), (r20v11 boolean) binds: [B:670:0x0c1e, B:668:0x0c1a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:689:0x0c48  */
    /* JADX WARN: Removed duplicated region for block: B:696:0x0c58  */
    /* JADX WARN: Removed duplicated region for block: B:711:0x0c92  */
    /* JADX WARN: Removed duplicated region for block: B:722:0x0cd1  */
    /* JADX WARN: Removed duplicated region for block: B:727:0x0cdd  */
    /* JADX WARN: Removed duplicated region for block: B:729:0x0ce1  */
    /* JADX WARN: Removed duplicated region for block: B:731:0x0ce5  */
    /* JADX WARN: Removed duplicated region for block: B:746:0x0d39  */
    /* JADX WARN: Removed duplicated region for block: B:750:0x0d85  */
    /* JADX WARN: Removed duplicated region for block: B:757:0x0db6  */
    /* JADX WARN: Removed duplicated region for block: B:762:0x0dc0  */
    /* JADX WARN: Removed duplicated region for block: B:765:0x0dd4 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:766:0x0dd6  */
    /* JADX WARN: Removed duplicated region for block: B:775:0x0dfd  */
    /* JADX WARN: Removed duplicated region for block: B:777:0x0e01  */
    /* JADX WARN: Removed duplicated region for block: B:781:0x0e09  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:814:0x0ee5  */
    /* JADX WARN: Removed duplicated region for block: B:818:0x0ef9  */
    /* JADX WARN: Removed duplicated region for block: B:822:0x0f16  */
    /* JADX WARN: Removed duplicated region for block: B:825:0x0f25  */
    /* JADX WARN: Removed duplicated region for block: B:831:0x0f35  */
    /* JADX WARN: Removed duplicated region for block: B:834:0x0f3d  */
    /* JADX WARN: Removed duplicated region for block: B:836:0x0f41  */
    /* JADX WARN: Removed duplicated region for block: B:908:0x119e  */
    /* JADX WARN: Removed duplicated region for block: B:928:0x1257  */
    /* JADX WARN: Removed duplicated region for block: B:931:0x125f  */
    /* JADX WARN: Removed duplicated region for block: B:945:0x1281  */
    /* JADX WARN: Removed duplicated region for block: B:951:0x1293  */
    /* JADX WARN: Removed duplicated region for block: B:952:0x1296 A[PHI: r154
  0x1296: PHI (r154v6 boolean) = (r154v5 boolean), (r154v11 boolean), (r154v11 boolean) binds: [B:795:0x0e8b, B:797:0x0e8f, B:798:0x0e91] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:953:0x129a  */
    /* JADX WARN: Removed duplicated region for block: B:959:0x12ae  */
    /* JADX WARN: Removed duplicated region for block: B:960:0x12b0  */
    /* JADX WARN: Removed duplicated region for block: B:967:0x12c0  */
    /* JADX WARN: Removed duplicated region for block: B:968:0x12c4 A[PHI: r20
  0x12c4: PHI (r20v6 boolean) = (r20v5 boolean), (r20v10 boolean), (r20v10 boolean) binds: [B:670:0x0c1e, B:671:0x0c20, B:674:0x0c26] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:969:0x12c8  */
    /* JADX WARN: Removed duplicated region for block: B:970:0x12ce  */
    /* JADX WARN: Removed duplicated region for block: B:973:0x12d5  */
    /* renamed from: HatchEmbodimentMedia-L7vc0rk, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m1809HatchEmbodimentMediaL7vc0rk(com.facebook.aura.partners.voice.intf.VoiceEmbodimentMedia r141, boolean r142, com.facebook.aura.model.AvatarStatusVideos r143, long r144, com.facebook.aura.model.AgentActivityStatus r146, boolean r147, kotlin.jvm.functions.Function0<kotlin.Unit> r148, X.G0W<? super android.view.Surface, ? super java.lang.Integer, ? super java.lang.Integer, kotlin.Unit> r149, X.G0W<? super android.view.Surface, ? super java.lang.Integer, ? super java.lang.Integer, kotlin.Unit> r150, X.G0U<? super android.view.Surface, kotlin.Unit> r151, X.G0V<? super X.InterfaceC2178B0w, ? super com.facebook.aura.partners.voice.intf.VoiceEmbodimentMedia.ReferenceFraming, kotlin.Unit> r152, boolean r153, X.BRg r154, boolean r155, boolean r156, java.lang.String r157, boolean r158, boolean r159, boolean r160, long r161, long r163, com.facebook.aura.partners.voice.intf.VoiceEmbodimentMedia.StaticAvatar r165, com.facebook.aura.partners.voice.intf.VoiceEmbodimentStillHandoff r166, X.G0U<? super com.facebook.aura.partners.voice.intf.VoiceStillHandoffEvent, kotlin.Unit> r167, boolean r168, long r169, boolean r171, boolean r172, boolean r173, boolean r174, X.G0U<? super java.lang.Integer, kotlin.Unit> r175, kotlin.jvm.functions.Function0<java.lang.Long> r176, X.G0W<? super java.lang.Long, ? super com.facebook.aura.partners.voice.ui.EmbodimentEdge, ? super java.lang.Integer, kotlin.Unit> r177, X.G0U<? super java.lang.Boolean, kotlin.Unit> r178, X.G0U<? super java.lang.Boolean, kotlin.Unit> r179, X.G0U<? super java.lang.Boolean, kotlin.Unit> r180, X.G0U<? super java.lang.Boolean, kotlin.Unit> r181, X.G0U<? super com.facebook.aura.partners.voice.intf.VoiceEmbodimentVisibleMedia, kotlin.Unit> r182, X.G0U<? super com.facebook.aura.partners.voice.intf.VoiceEmbodimentPaintedMedia, kotlin.Unit> r183, boolean r184, X.AWA r185, X.G0U<? super kotlin.jvm.functions.Function0<android.graphics.Bitmap>, kotlin.Unit> r186, X.G0U<? super java.lang.Boolean, kotlin.Unit> r187, X.G0U<? super X.InterfaceC2178B0w, kotlin.Unit> r188, boolean r189, X.InterfaceC2178B0w r190, kotlin.jvm.functions.Function0<java.lang.Float> r191, X.G0U<? super com.facebook.aura.partners.voice.intf.VoiceEmbodimentMedia.StaticAvatar, kotlin.Unit> r192, X.BRg r193, X.BRg r194, X.BRg r195, X.G0W<? super X.AWA, ? super X.BFM, ? super java.lang.Integer, ? extends X.BRg> r196, boolean r197, boolean r198, kotlin.jvm.functions.Function0<java.lang.Float> r199, X.BFM r200, int r201, int r202, int r203, int r204, int r205, int r206, int r207, int r208) {
        /*
            Method dump skipped, instructions count: 6558
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.partners.voice.ui.HatchEmbodimentMediaKt.m1809HatchEmbodimentMediaL7vc0rk(com.facebook.aura.partners.voice.intf.VoiceEmbodimentMedia, boolean, com.facebook.aura.model.AvatarStatusVideos, long, com.facebook.aura.model.AgentActivityStatus, boolean, kotlin.jvm.functions.Function0, X.G0W, X.G0W, X.G0U, X.G0V, boolean, X.BRg, boolean, boolean, java.lang.String, boolean, boolean, boolean, long, long, com.facebook.aura.partners.voice.intf.VoiceEmbodimentMedia$StaticAvatar, com.facebook.aura.partners.voice.intf.VoiceEmbodimentStillHandoff, X.G0U, boolean, long, boolean, boolean, boolean, boolean, X.G0U, kotlin.jvm.functions.Function0, X.G0W, X.G0U, X.G0U, X.G0U, X.G0U, X.G0U, X.G0U, boolean, X.AWA, X.G0U, X.G0U, X.G0U, boolean, X.B0w, kotlin.jvm.functions.Function0, X.G0U, X.BRg, X.BRg, X.BRg, X.G0W, boolean, boolean, kotlin.jvm.functions.Function0, X.BFM, int, int, int, int, int, int, int, int):void");
    }
}
