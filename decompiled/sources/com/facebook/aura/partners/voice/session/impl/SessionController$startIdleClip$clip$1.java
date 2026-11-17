package com.facebook.aura.partners.voice.session.impl;

import X.AbstractC07127nr;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass006;
import X.C3UX;
import X.C7384Etj;
import X.C7438Evz;
import X.G0U;
import X.G0V;
import X.HtJ;
import X.Hwg;
import com.facebook.aura.partners.voice.session.impl.SessionController;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.webrtc.VideoFrame;

@DebugMetadata(c = "com.facebook.aura.partners.voice.session.impl.SessionController$startIdleClip$clip$1", f = "SessionController.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes2.dex */
public final class SessionController$startIdleClip$clip$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super AccessoryIdleClip>, Object> {
    public final /* synthetic */ boolean $isLast;
    public final /* synthetic */ String $path;
    public final /* synthetic */ EmbodimentVideoRenderer $renderer;
    public final /* synthetic */ SessionController.AccessoryVideo $video;
    public int label;
    public final /* synthetic */ SessionController this$0;

    /* renamed from: com.facebook.aura.partners.voice.session.impl.SessionController$startIdleClip$clip$1$1, reason: invalid class name */
    /* loaded from: classes5.dex */
    public final /* synthetic */ class AnonymousClass1 extends C7438Evz implements G0U<VideoFrame, Unit> {
        public AnonymousClass1(Object obj) {
            super(1, obj, EmbodimentVideoRenderer.class, "renderIdle", "renderIdle(Lorg/webrtc/VideoFrame;)V", 0);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(VideoFrame videoFrame) {
            ((EmbodimentVideoRenderer) AnonymousClass006.A0o(videoFrame, this)).renderIdle(videoFrame);
        }

        @Override // X.G0U
        public /* bridge */ /* synthetic */ Unit invoke(VideoFrame videoFrame) {
            invoke2(videoFrame);
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.partners.voice.session.impl.SessionController$startIdleClip$clip$1$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0U<AccessoryIdleClip, Unit> {
        public final /* synthetic */ boolean $isLast;
        public final /* synthetic */ SessionController.AccessoryVideo $video;
        public final /* synthetic */ SessionController this$0;

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(AccessoryIdleClip accessoryIdleClip) {
            C7384Etj.A0Y(accessoryIdleClip, 0);
            this.this$0.onAccessoryIdleFailed(this.$video, accessoryIdleClip, this.$isLast);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(SessionController sessionController, SessionController.AccessoryVideo accessoryVideo, boolean z) {
            super(1);
            this.this$0 = sessionController;
            this.$video = accessoryVideo;
            this.$isLast = z;
        }

        @Override // X.G0U
        public /* bridge */ /* synthetic */ Unit invoke(AccessoryIdleClip accessoryIdleClip) {
            invoke2(accessoryIdleClip);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SessionController$startIdleClip$clip$1(String str, EmbodimentVideoRenderer embodimentVideoRenderer, SessionController sessionController, SessionController.AccessoryVideo accessoryVideo, boolean z, HtJ<? super SessionController$startIdleClip$clip$1> htJ) {
        super(2, htJ);
        this.$path = str;
        this.$renderer = embodimentVideoRenderer;
        this.this$0 = sessionController;
        this.$video = accessoryVideo;
        this.$isLast = z;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new SessionController$startIdleClip$clip$1(this.$path, this.$renderer, this.this$0, this.$video, this.$isLast, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        if (this.label != 0) {
            throw AnonymousClass001.A0n();
        }
        Hwg.A00(obj);
        return AccessoryIdleClip.Companion.start(this.$path, this.$renderer.getEglContext(), new AnonymousClass1(this.$renderer), new AnonymousClass2(this.this$0, this.$video, this.$isLast));
    }

    @Override // X.G0V
    public final Object invoke(C3UX c3ux, HtJ<? super AccessoryIdleClip> htJ) {
        return ((SessionController$startIdleClip$clip$1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
