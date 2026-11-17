package com.facebook.aura.partners.voice.ui;

import X.AWA;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass011;
import X.BFM;
import X.BRg;
import X.G0U;
import X.G0V;
import X.G0W;
import X.InterfaceC2178B0w;
import android.graphics.Bitmap;
import android.view.Surface;
import com.facebook.aura.model.AgentActivityStatus;
import com.facebook.aura.model.AvatarStatusVideos;
import com.facebook.aura.partners.voice.intf.VoiceEmbodimentMedia;
import com.facebook.aura.partners.voice.intf.VoiceEmbodimentPaintedMedia;
import com.facebook.aura.partners.voice.intf.VoiceEmbodimentStillHandoff;
import com.facebook.aura.partners.voice.intf.VoiceEmbodimentVisibleMedia;
import com.facebook.aura.partners.voice.intf.VoiceStillHandoffEvent;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final class HatchEmbodimentMediaKt$HatchEmbodimentMedia$40 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ int $$changed1;
    public final /* synthetic */ int $$changed2;
    public final /* synthetic */ int $$changed3;
    public final /* synthetic */ int $$changed4;
    public final /* synthetic */ int $$changed5;
    public final /* synthetic */ int $$default;
    public final /* synthetic */ int $$default1;
    public final /* synthetic */ Function0<Float> $activityBottomAlignmentFraction;
    public final /* synthetic */ BRg $activityContentModifier;
    public final /* synthetic */ AgentActivityStatus $agentActivityStatus;
    public final /* synthetic */ boolean $allowActivityVideos;
    public final /* synthetic */ long $backdropColor;
    public final /* synthetic */ long $botOutputActivityGeneration;
    public final /* synthetic */ long $botOutputInactiveAtMs;
    public final /* synthetic */ long $callGeneration;
    public final /* synthetic */ Function0<Long> $edgeSampleGeneration;
    public final /* synthetic */ boolean $edgeSamplingEnabled;
    public final /* synthetic */ boolean $fillActivityViewport;
    public final /* synthetic */ boolean $fillGeneratedIdleViewport;
    public final /* synthetic */ boolean $fillViewport;
    public final /* synthetic */ G0W<AWA, BFM, Integer, BRg> $generatedIdleContentModifier;
    public final /* synthetic */ boolean $holdPlaceholder;
    public final /* synthetic */ String $idleVideoUri;
    public final /* synthetic */ boolean $isBotOutputActive;
    public final /* synthetic */ boolean $isBotSpeaking;
    public final /* synthetic */ boolean $keepPlayingOnPause;
    public final /* synthetic */ BRg $liveRtcContentModifier;
    public final /* synthetic */ boolean $liveRtcEnabled;
    public final /* synthetic */ boolean $liveRtcHidden;
    public final /* synthetic */ boolean $liveRtcReady;
    public final /* synthetic */ boolean $matchBackdrop;
    public final /* synthetic */ VoiceEmbodimentMedia $media;
    public final /* synthetic */ BRg $modifier;
    public final /* synthetic */ G0U<Boolean, Unit> $onAvatarVideoReadyChanged;
    public final /* synthetic */ G0U<Integer, Unit> $onBackdropColorSampled;
    public final /* synthetic */ G0W<Long, EmbodimentEdge, Integer, Unit> $onEdgeColorSampled;
    public final /* synthetic */ G0U<Function0<Bitmap>, Unit> $onFrameCaptureAvailable;
    public final /* synthetic */ G0U<Boolean, Unit> $onIdlePlayerResourcesActiveChanged;
    public final /* synthetic */ G0U<Boolean, Unit> $onMediaReadyChanged;
    public final /* synthetic */ G0U<VoiceEmbodimentPaintedMedia, Unit> $onPaintedMediaChanged;
    public final /* synthetic */ G0U<InterfaceC2178B0w, Unit> $onPlaceholderReady;
    public final /* synthetic */ Function0<Unit> $onRtcFramePainted;
    public final /* synthetic */ G0U<VoiceEmbodimentMedia.StaticAvatar, Unit> $onStillAvatarRendered;
    public final /* synthetic */ G0V<InterfaceC2178B0w, VoiceEmbodimentMedia.ReferenceFraming, Unit> $onStillFrameChanged;
    public final /* synthetic */ G0U<VoiceStillHandoffEvent, Unit> $onStillHandoffEvent;
    public final /* synthetic */ G0U<Boolean, Unit> $onStillReadyChanged;
    public final /* synthetic */ G0W<Surface, Integer, Integer, Unit> $onSurfaceAvailable;
    public final /* synthetic */ G0U<Surface, Unit> $onSurfaceDestroyed;
    public final /* synthetic */ G0W<Surface, Integer, Integer, Unit> $onSurfaceResized;
    public final /* synthetic */ G0U<Boolean, Unit> $onVideoCoveringChanged;
    public final /* synthetic */ G0U<VoiceEmbodimentVisibleMedia, Unit> $onVisibleMediaChanged;
    public final /* synthetic */ boolean $playbackEnabled;
    public final /* synthetic */ boolean $retainIdlePlayer;
    public final /* synthetic */ boolean $retainOnSurfaceLoss;
    public final /* synthetic */ AWA $retainedFrameSize;
    public final /* synthetic */ VoiceEmbodimentMedia.StaticAvatar $retainedStaticAvatar;
    public final /* synthetic */ boolean $rtcEverPaintedInCall;
    public final /* synthetic */ AvatarStatusVideos $statusVideos;
    public final /* synthetic */ BRg $stillContentModifier;
    public final /* synthetic */ VoiceEmbodimentStillHandoff $stillHandoff;
    public final /* synthetic */ InterfaceC2178B0w $transitionPlaceholder;
    public final /* synthetic */ Function0<Float> $transitionPlaceholderAlpha;

    public final void invoke(BFM bfm, int i) {
        HatchEmbodimentMediaKt.m1809HatchEmbodimentMediaL7vc0rk(this.$media, this.$liveRtcReady, this.$statusVideos, this.$callGeneration, this.$agentActivityStatus, this.$rtcEverPaintedInCall, this.$onRtcFramePainted, this.$onSurfaceAvailable, this.$onSurfaceResized, this.$onSurfaceDestroyed, this.$onStillFrameChanged, this.$liveRtcHidden, this.$modifier, this.$liveRtcEnabled, this.$allowActivityVideos, this.$idleVideoUri, this.$fillViewport, this.$isBotSpeaking, this.$isBotOutputActive, this.$botOutputActivityGeneration, this.$botOutputInactiveAtMs, this.$retainedStaticAvatar, this.$stillHandoff, this.$onStillHandoffEvent, this.$matchBackdrop, this.$backdropColor, this.$playbackEnabled, this.$retainIdlePlayer, this.$keepPlayingOnPause, this.$edgeSamplingEnabled, this.$onBackdropColorSampled, this.$edgeSampleGeneration, this.$onEdgeColorSampled, this.$onAvatarVideoReadyChanged, this.$onVideoCoveringChanged, this.$onIdlePlayerResourcesActiveChanged, this.$onStillReadyChanged, this.$onVisibleMediaChanged, this.$onPaintedMediaChanged, this.$retainOnSurfaceLoss, this.$retainedFrameSize, this.$onFrameCaptureAvailable, this.$onMediaReadyChanged, this.$onPlaceholderReady, this.$holdPlaceholder, this.$transitionPlaceholder, this.$transitionPlaceholderAlpha, this.$onStillAvatarRendered, this.$liveRtcContentModifier, this.$stillContentModifier, this.$activityContentModifier, this.$generatedIdleContentModifier, this.$fillGeneratedIdleViewport, this.$fillActivityViewport, this.$activityBottomAlignmentFraction, bfm, AnonymousClass011.A00(this.$$changed), AnonymousClass011.A01(this.$$changed1), AnonymousClass011.A01(this.$$changed2), AnonymousClass011.A01(this.$$changed3), AnonymousClass011.A01(this.$$changed4), AnonymousClass011.A01(this.$$changed5), this.$$default, this.$$default1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HatchEmbodimentMediaKt$HatchEmbodimentMedia$40(VoiceEmbodimentMedia voiceEmbodimentMedia, boolean z, AvatarStatusVideos avatarStatusVideos, long j, AgentActivityStatus agentActivityStatus, boolean z2, Function0<Unit> function0, G0W<? super Surface, ? super Integer, ? super Integer, Unit> g0w, G0W<? super Surface, ? super Integer, ? super Integer, Unit> g0w2, G0U<? super Surface, Unit> g0u, G0V<? super InterfaceC2178B0w, ? super VoiceEmbodimentMedia.ReferenceFraming, Unit> g0v, boolean z3, BRg bRg, boolean z4, boolean z5, String str, boolean z6, boolean z7, boolean z8, long j2, long j3, VoiceEmbodimentMedia.StaticAvatar staticAvatar, VoiceEmbodimentStillHandoff voiceEmbodimentStillHandoff, G0U<? super VoiceStillHandoffEvent, Unit> g0u2, boolean z9, long j4, boolean z10, boolean z11, boolean z12, boolean z13, G0U<? super Integer, Unit> g0u3, Function0<Long> function02, G0W<? super Long, ? super EmbodimentEdge, ? super Integer, Unit> g0w3, G0U<? super Boolean, Unit> g0u4, G0U<? super Boolean, Unit> g0u5, G0U<? super Boolean, Unit> g0u6, G0U<? super Boolean, Unit> g0u7, G0U<? super VoiceEmbodimentVisibleMedia, Unit> g0u8, G0U<? super VoiceEmbodimentPaintedMedia, Unit> g0u9, boolean z14, AWA awa, G0U<? super Function0<Bitmap>, Unit> g0u10, G0U<? super Boolean, Unit> g0u11, G0U<? super InterfaceC2178B0w, Unit> g0u12, boolean z15, InterfaceC2178B0w interfaceC2178B0w, Function0<Float> function03, G0U<? super VoiceEmbodimentMedia.StaticAvatar, Unit> g0u13, BRg bRg2, BRg bRg3, BRg bRg4, G0W<? super AWA, ? super BFM, ? super Integer, ? extends BRg> g0w4, boolean z16, boolean z17, Function0<Float> function04, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        super(2);
        this.$media = voiceEmbodimentMedia;
        this.$liveRtcReady = z;
        this.$statusVideos = avatarStatusVideos;
        this.$callGeneration = j;
        this.$agentActivityStatus = agentActivityStatus;
        this.$rtcEverPaintedInCall = z2;
        this.$onRtcFramePainted = function0;
        this.$onSurfaceAvailable = g0w;
        this.$onSurfaceResized = g0w2;
        this.$onSurfaceDestroyed = g0u;
        this.$onStillFrameChanged = g0v;
        this.$liveRtcHidden = z3;
        this.$modifier = bRg;
        this.$liveRtcEnabled = z4;
        this.$allowActivityVideos = z5;
        this.$idleVideoUri = str;
        this.$fillViewport = z6;
        this.$isBotSpeaking = z7;
        this.$isBotOutputActive = z8;
        this.$botOutputActivityGeneration = j2;
        this.$botOutputInactiveAtMs = j3;
        this.$retainedStaticAvatar = staticAvatar;
        this.$stillHandoff = voiceEmbodimentStillHandoff;
        this.$onStillHandoffEvent = g0u2;
        this.$matchBackdrop = z9;
        this.$backdropColor = j4;
        this.$playbackEnabled = z10;
        this.$retainIdlePlayer = z11;
        this.$keepPlayingOnPause = z12;
        this.$edgeSamplingEnabled = z13;
        this.$onBackdropColorSampled = g0u3;
        this.$edgeSampleGeneration = function02;
        this.$onEdgeColorSampled = g0w3;
        this.$onAvatarVideoReadyChanged = g0u4;
        this.$onVideoCoveringChanged = g0u5;
        this.$onIdlePlayerResourcesActiveChanged = g0u6;
        this.$onStillReadyChanged = g0u7;
        this.$onVisibleMediaChanged = g0u8;
        this.$onPaintedMediaChanged = g0u9;
        this.$retainOnSurfaceLoss = z14;
        this.$retainedFrameSize = awa;
        this.$onFrameCaptureAvailable = g0u10;
        this.$onMediaReadyChanged = g0u11;
        this.$onPlaceholderReady = g0u12;
        this.$holdPlaceholder = z15;
        this.$transitionPlaceholder = interfaceC2178B0w;
        this.$transitionPlaceholderAlpha = function03;
        this.$onStillAvatarRendered = g0u13;
        this.$liveRtcContentModifier = bRg2;
        this.$stillContentModifier = bRg3;
        this.$activityContentModifier = bRg4;
        this.$generatedIdleContentModifier = g0w4;
        this.$fillGeneratedIdleViewport = z16;
        this.$fillActivityViewport = z17;
        this.$activityBottomAlignmentFraction = function04;
        this.$$changed = i;
        this.$$changed1 = i2;
        this.$$changed2 = i3;
        this.$$changed3 = i4;
        this.$$changed4 = i5;
        this.$$changed5 = i6;
        this.$$default = i7;
        this.$$default1 = i8;
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        invoke(bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }
}
