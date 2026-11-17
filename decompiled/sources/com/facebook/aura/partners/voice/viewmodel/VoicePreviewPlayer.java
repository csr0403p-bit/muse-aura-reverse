package com.facebook.aura.partners.voice.viewmodel;

import X.AGH;
import X.AbstractC07127nr;
import X.AbstractC3358CGz;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.AnonymousClass602;
import X.BLG;
import X.C06H;
import X.C10533Hqc;
import X.C10543Hqv;
import X.C1BN;
import X.C20Z;
import X.C3UX;
import X.C3cG;
import X.C3cH;
import X.C60O;
import X.C60Q;
import X.C6ys;
import X.C7384Etj;
import X.C78W;
import X.C79;
import X.C8eO;
import X.C9286GCn;
import X.C9jH;
import X.CFK;
import X.EnumC10460Hji;
import X.G0U;
import X.G0V;
import X.GAo;
import X.GAt;
import X.HnJ;
import X.HoC;
import X.HtJ;
import X.Hwg;
import X.Hxb;
import X.HzC;
import X.HzP;
import X.InterfaceC10560Hsz;
import X.InterfaceC7549F2g;
import android.media.AudioAttributes;
import android.media.MediaPlayer;
import com.facebook.aura.common.video.HatchTransportHttpDataSourceKt;
import com.facebook.aura.executors.AuraDispatchers;
import com.facebook.aura.lifecycle.AuraAppLifecycleManager;
import com.facebook.aura.partners.voice.api.CallVoicePreviewResult;
import com.facebook.aura.partners.voice.api.PlayoutInjection;
import com.facebook.aura.partners.voice.api.VoiceCatalogRepository;
import com.facebook.aura.partners.voice.gating.VoiceGating;
import com.facebook.aura.partners.voice.intf.VoiceCallStateHolder;
import com.facebook.aura.partners.voice.runtime.VoiceCallRuntime;
import com.facebook.aura.partners.voice.viewmodel.VoicePreviewDiagnostics;
import java.util.Map;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final class VoicePreviewPlayer implements InterfaceC7549F2g {
    public static final int $stable = 8;
    public static final Companion Companion = new Companion();
    public final BLG<VoicePreviewPlayback> _playback;
    public ActivePreview active;
    public boolean closed;
    public final VoicePreviewDiagnostics diagnostics;
    public final Object duckingOwner;
    public final Object lock;
    public final C1BN<VoicePreviewPlayback> playback;
    public final VoiceCatalogRepository repository;
    public final C3UX scope;
    public final AbstractC3358CGz userSession;
    public final VoiceCallStateHolder voiceCallStateHolder;

    @DebugMetadata(c = "com.facebook.aura.partners.voice.viewmodel.VoicePreviewPlayer$1", f = "VoicePreviewPlayer.kt", l = {105}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.partners.voice.viewmodel.VoicePreviewPlayer$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public int label;

        public AnonymousClass1(HtJ<? super AnonymousClass1> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return VoicePreviewPlayer.this.new AnonymousClass1(htJ);
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return VoicePreviewPlayer.this.new AnonymousClass1(htJ).invokeSuspend(Unit.INSTANCE);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                VoicePreviewPlayer$1$invokeSuspend$$inlined$filter$1 voicePreviewPlayer$1$invokeSuspend$$inlined$filter$1 = new VoicePreviewPlayer$1$invokeSuspend$$inlined$filter$1(AnonymousClass602.A00(AuraAppLifecycleManager.isAppInForegroundImmediateFlow));
                final VoicePreviewPlayer voicePreviewPlayer = VoicePreviewPlayer.this;
                C20Z<? super Boolean> c20z = new C20Z() { // from class: com.facebook.aura.partners.voice.viewmodel.VoicePreviewPlayer.1.2
                    @Override // X.C20Z
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, HtJ htJ) {
                        voicePreviewPlayer.stop();
                        return Unit.INSTANCE;
                    }

                    public final Object emit(boolean z, HtJ<? super Unit> htJ) {
                        voicePreviewPlayer.stop();
                        return Unit.INSTANCE;
                    }
                };
                this.label = 1;
                if (voicePreviewPlayer$1$invokeSuspend$$inlined$filter$1.collect(c20z, this) == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
            }
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.facebook.aura.partners.voice.viewmodel.VoicePreviewPlayer$2", f = "VoicePreviewPlayer.kt", l = {107}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.partners.voice.viewmodel.VoicePreviewPlayer$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public int label;

        public AnonymousClass2(HtJ<? super AnonymousClass2> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return VoicePreviewPlayer.this.new AnonymousClass2(htJ);
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return VoicePreviewPlayer.this.new AnonymousClass2(htJ).invokeSuspend(Unit.INSTANCE);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                final VoicePreviewPlayer voicePreviewPlayer = VoicePreviewPlayer.this;
                AnonymousClass602 anonymousClass602A00 = AnonymousClass602.A00(voicePreviewPlayer.voiceCallStateHolder.isCallActive);
                C20Z c20z = new C20Z() { // from class: com.facebook.aura.partners.voice.viewmodel.VoicePreviewPlayer.2.1
                    @Override // X.C20Z
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, HtJ htJ) {
                        voicePreviewPlayer.stop();
                        return Unit.INSTANCE;
                    }

                    public final Object emit(boolean z, HtJ<? super Unit> htJ) {
                        voicePreviewPlayer.stop();
                        return Unit.INSTANCE;
                    }
                };
                this.label = 1;
                if (anonymousClass602A00.collect(c20z, this) == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
            }
            return Unit.INSTANCE;
        }
    }

    public final class ActivePreview {
        public final VoicePreviewDiagnostics.Attempt diagnostics;
        public volatile HoC job;
        public volatile MediaPlayer mediaPlayer;
        public final InterfaceC10560Hsz<VoicePreviewOutcome> outcome;
        public final VoicePreviewRequest request;
        public final Long rtcCallGeneration;
        public final boolean speakOnCall;
        public volatile PcmStreamPlayer streamPlayer;

        public ActivePreview(VoicePreviewRequest voicePreviewRequest, VoicePreviewDiagnostics.Attempt attempt, boolean z, Long l) {
            C7384Etj.A0Y(voicePreviewRequest, 0);
            this.request = voicePreviewRequest;
            this.diagnostics = attempt;
            this.speakOnCall = z;
            this.rtcCallGeneration = l;
            this.outcome = new GAt(null);
        }

        public final VoicePreviewDiagnostics.Attempt getDiagnostics() {
            return this.diagnostics;
        }

        public final HoC getJob() {
            return this.job;
        }

        public final MediaPlayer getMediaPlayer() {
            return this.mediaPlayer;
        }

        public final InterfaceC10560Hsz<VoicePreviewOutcome> getOutcome() {
            return this.outcome;
        }

        public final VoicePreviewRequest getRequest() {
            return this.request;
        }

        public final Long getRtcCallGeneration() {
            return this.rtcCallGeneration;
        }

        public final boolean getSpeakOnCall() {
            return this.speakOnCall;
        }

        public final PcmStreamPlayer getStreamPlayer() {
            return this.streamPlayer;
        }

        public final void setJob(HoC hoC) {
            this.job = hoC;
        }

        public final void setMediaPlayer(MediaPlayer mediaPlayer) {
            this.mediaPlayer = mediaPlayer;
        }

        public final void setStreamPlayer(PcmStreamPlayer pcmStreamPlayer) {
            this.streamPlayer = pcmStreamPlayer;
        }

        public /* synthetic */ ActivePreview(VoicePreviewRequest voicePreviewRequest, VoicePreviewDiagnostics.Attempt attempt, boolean z, Long l, int i, C06H c06h) {
            this(voicePreviewRequest, attempt, AnonymousClass005.A1O(i, z), (i & 8) != 0 ? null : l);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.partners.voice.viewmodel.VoicePreviewPlayer", f = "VoicePreviewPlayer.kt", l = {194, 200, HatchTransportHttpDataSourceKt.HTTP_PARTIAL_CONTENT, 212, 218, 227, 230, 232, 234}, m = "load", v = 2)
    /* renamed from: com.facebook.aura.partners.voice.viewmodel.VoicePreviewPlayer$load$1, reason: invalid class name and case insensitive filesystem */
    public final class C133491 extends HzP {
        public long J$0;
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public Object L$4;
        public int label;
        public /* synthetic */ Object result;

        public C133491(HtJ<? super C133491> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return VoicePreviewPlayer.this.load(null, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.partners.voice.viewmodel.VoicePreviewPlayer", f = "VoicePreviewPlayer.kt", l = {116}, m = "play", v = 2)
    /* renamed from: com.facebook.aura.partners.voice.viewmodel.VoicePreviewPlayer$play$1, reason: invalid class name and case insensitive filesystem */
    public final class C133501 extends HzP {
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public int label;
        public /* synthetic */ Object result;

        public C133501(HtJ<? super C133501> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return VoicePreviewPlayer.this.play(null, null, null, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.partners.voice.viewmodel.VoicePreviewPlayer", f = "VoicePreviewPlayer.kt", l = {258, 272}, m = "playAudio", v = 2)
    /* renamed from: com.facebook.aura.partners.voice.viewmodel.VoicePreviewPlayer$playAudio$1, reason: invalid class name and case insensitive filesystem */
    public final class C133511 extends HzP {
        public long J$0;
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public Object L$4;
        public Object L$5;
        public Object L$6;
        public Object L$7;
        public int label;
        public /* synthetic */ Object result;

        public C133511(HtJ<? super C133511> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return VoicePreviewPlayer.this.playAudio(null, null, null, null, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.partners.voice.viewmodel.VoicePreviewPlayer$playAudio$2", f = "VoicePreviewPlayer.kt", l = {272}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.partners.voice.viewmodel.VoicePreviewPlayer$playAudio$2, reason: invalid class name and case insensitive filesystem */
    public final class C133522 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super RtcPlayoutResult>, Object> {
        public final /* synthetic */ RtcPreviewFramer $framer;
        public final /* synthetic */ ActivePreview $preview;
        public int label;
        public final /* synthetic */ VoicePreviewPlayer this$0;

        /* renamed from: com.facebook.aura.partners.voice.viewmodel.VoicePreviewPlayer$playAudio$2$1, reason: invalid class name */
        public final class AnonymousClass1 extends AbstractC7559F3s implements Function0<Unit> {
            public final /* synthetic */ ActivePreview $preview;
            public final /* synthetic */ VoicePreviewPlayer this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(VoicePreviewPlayer voicePreviewPlayer, ActivePreview activePreview) {
                super(0);
                this.this$0 = voicePreviewPlayer;
                this.$preview = activePreview;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                this.this$0.markPlaying(this.$preview);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C133522(RtcPreviewFramer rtcPreviewFramer, VoicePreviewPlayer voicePreviewPlayer, ActivePreview activePreview, HtJ<? super C133522> htJ) {
            super(2, htJ);
            this.$framer = rtcPreviewFramer;
            this.this$0 = voicePreviewPlayer;
            this.$preview = activePreview;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new C133522(this.$framer, this.this$0, this.$preview, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                RtcPreviewFramer rtcPreviewFramer = this.$framer;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$preview);
                this.label = 1;
                obj = rtcPreviewFramer.run(anonymousClass1, this);
                if (obj == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
            }
            return obj;
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super RtcPlayoutResult> htJ) {
            return ((C133522) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.partners.voice.viewmodel.VoicePreviewPlayer", f = "VoicePreviewPlayer.kt", l = {370}, m = "playOnCall", v = 2)
    /* renamed from: com.facebook.aura.partners.voice.viewmodel.VoicePreviewPlayer$playOnCall$1, reason: invalid class name and case insensitive filesystem */
    public final class C133531 extends HzP {
        public Object L$0;
        public int label;
        public /* synthetic */ Object result;

        public C133531(HtJ<? super C133531> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return VoicePreviewPlayer.this.playOnCall(null, this);
        }
    }

    /* renamed from: com.facebook.aura.partners.voice.viewmodel.VoicePreviewPlayer$stop$2, reason: invalid class name and case insensitive filesystem */
    public final class C133562 extends AbstractC7559F3s implements G0U<VoicePreviewRequest, Boolean> {
        public final /* synthetic */ String $ownerId;

        @Override // X.G0U
        public final Boolean invoke(VoicePreviewRequest voicePreviewRequest) {
            C7384Etj.A0Y(voicePreviewRequest, 0);
            return C60O.A0h(voicePreviewRequest.key.ownerId, this.$ownerId);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C133562(String str) {
            super(1);
            this.$ownerId = str;
        }
    }

    @DebugMetadata(c = "com.facebook.aura.partners.voice.viewmodel.VoicePreviewPlayer$streamPreview$2", f = "VoicePreviewPlayer.kt", l = {429, 431, 443, 450, 458}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.partners.voice.viewmodel.VoicePreviewPlayer$streamPreview$2, reason: invalid class name and case insensitive filesystem */
    public final class C133572 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ ActivePreview $preview;
        public final /* synthetic */ String $text;
        public /* synthetic */ Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public Object L$4;
        public Object L$5;
        public Object L$6;
        public Object L$7;
        public int label;

        /* renamed from: com.facebook.aura.partners.voice.viewmodel.VoicePreviewPlayer$streamPreview$2$1, reason: invalid class name */
        public final class AnonymousClass1 extends AbstractC7559F3s implements Function0<VoicePreviewPlayerState> {
            public final /* synthetic */ PcmStreamPlayer $player;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(PcmStreamPlayer pcmStreamPlayer) {
                super(0);
                this.$player = pcmStreamPlayer;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final VoicePreviewPlayerState invoke() {
                return this.$player.diagnosticState$fbandroid_express_aura_java_com_facebook_aura_partners_voice_viewmodel_viewmodel();
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ VoicePreviewPlayerState invoke() {
                return this.$player.diagnosticState$fbandroid_express_aura_java_com_facebook_aura_partners_voice_viewmodel_viewmodel();
            }
        }

        @DebugMetadata(c = "com.facebook.aura.partners.voice.viewmodel.VoicePreviewPlayer$streamPreview$2$2", f = "VoicePreviewPlayer.kt", l = {446}, m = "invokeSuspend", v = 2)
        /* renamed from: com.facebook.aura.partners.voice.viewmodel.VoicePreviewPlayer$streamPreview$2$2, reason: invalid class name and collision with other inner class name */
        public final class C03302 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
            public final /* synthetic */ PcmChunkHandoff $chunks;
            public final /* synthetic */ byte[] $firstChunk;
            public final /* synthetic */ PcmStreamPlayer $player;
            public int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C03302(PcmStreamPlayer pcmStreamPlayer, byte[] bArr, PcmChunkHandoff pcmChunkHandoff, HtJ<? super C03302> htJ) {
                super(2, htJ);
                this.$player = pcmStreamPlayer;
                this.$firstChunk = bArr;
                this.$chunks = pcmChunkHandoff;
            }

            @Override // X.AbstractC8884Fsp
            public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
                return new C03302(this.$player, this.$firstChunk, this.$chunks, htJ);
            }

            /* JADX WARN: Removed duplicated region for block: B:10:0x0013  */
            /* JADX WARN: Removed duplicated region for block: B:14:0x002d A[RETURN] */
            /* JADX WARN: Removed duplicated region for block: B:8:0x0010  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x002b -> B:6:0x000c). Please report as a decompilation issue!!! */
            @Override // X.AbstractC8884Fsp
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r5) {
                /*
                    r4 = this;
                    X.Hji r3 = X.EnumC10460Hji.A02
                    int r0 = r4.label
                    r2 = 1
                    if (r0 == 0) goto L19
                    if (r0 != r2) goto L2e
                    X.Hwg.A00(r5)
                Lc:
                    byte[] r5 = (byte[]) r5
                    if (r5 != 0) goto L13
                    kotlin.Unit r3 = kotlin.Unit.INSTANCE
                    return r3
                L13:
                    com.facebook.aura.partners.voice.viewmodel.PcmStreamPlayer r0 = r4.$player
                    r0.writePcm(r5)
                    goto L23
                L19:
                    X.Hwg.A00(r5)
                    com.facebook.aura.partners.voice.viewmodel.PcmStreamPlayer r1 = r4.$player
                    byte[] r0 = r4.$firstChunk
                    r1.writePcm(r0)
                L23:
                    com.facebook.aura.partners.voice.viewmodel.PcmChunkHandoff r0 = r4.$chunks
                    r4.label = r2
                    java.lang.Object r5 = r0.receive(r4)
                    if (r5 != r3) goto Lc
                    return r3
                L2e:
                    java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
                    throw r0
                */
                throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.partners.voice.viewmodel.VoicePreviewPlayer.C133572.C03302.invokeSuspend(java.lang.Object):java.lang.Object");
            }

            @Override // X.G0V
            public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
                return ((C03302) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C133572(ActivePreview activePreview, String str, HtJ<? super C133572> htJ) {
            super(2, htJ);
            this.$preview = activePreview;
            this.$text = str;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            C133572 c133572 = VoicePreviewPlayer.this.new C133572(this.$preview, this.$text, htJ);
            c133572.L$0 = obj;
            return c133572;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:30:0x00ef A[Catch: all -> 0x01b2, TryCatch #2 {all -> 0x01b2, blocks: (B:33:0x00fd, B:35:0x010b, B:36:0x010d, B:37:0x0117, B:28:0x00eb, B:30:0x00ef, B:38:0x011e, B:40:0x012b, B:41:0x0137, B:25:0x00d4), top: B:73:0x00d4 }] */
        /* JADX WARN: Removed duplicated region for block: B:35:0x010b A[Catch: all -> 0x01b2, TryCatch #2 {all -> 0x01b2, blocks: (B:33:0x00fd, B:35:0x010b, B:36:0x010d, B:37:0x0117, B:28:0x00eb, B:30:0x00ef, B:38:0x011e, B:40:0x012b, B:41:0x0137, B:25:0x00d4), top: B:73:0x00d4 }] */
        /* JADX WARN: Removed duplicated region for block: B:37:0x0117 A[Catch: all -> 0x01b2, TryCatch #2 {all -> 0x01b2, blocks: (B:33:0x00fd, B:35:0x010b, B:36:0x010d, B:37:0x0117, B:28:0x00eb, B:30:0x00ef, B:38:0x011e, B:40:0x012b, B:41:0x0137, B:25:0x00d4), top: B:73:0x00d4 }] */
        /* JADX WARN: Removed duplicated region for block: B:38:0x011e A[Catch: all -> 0x01b2, TryCatch #2 {all -> 0x01b2, blocks: (B:33:0x00fd, B:35:0x010b, B:36:0x010d, B:37:0x0117, B:28:0x00eb, B:30:0x00ef, B:38:0x011e, B:40:0x012b, B:41:0x0137, B:25:0x00d4), top: B:73:0x00d4 }] */
        /* JADX WARN: Removed duplicated region for block: B:46:0x015b A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:49:0x0162 A[Catch: all -> 0x01b0, TRY_LEAVE, TryCatch #0 {all -> 0x01b0, blocks: (B:47:0x015c, B:49:0x0162, B:54:0x018d, B:44:0x014e), top: B:71:0x014e }] */
        /* JADX WARN: Removed duplicated region for block: B:54:0x018d A[Catch: all -> 0x01b0, TRY_ENTER, TryCatch #0 {all -> 0x01b0, blocks: (B:47:0x015c, B:49:0x0162, B:54:0x018d, B:44:0x014e), top: B:71:0x014e }] */
        /* JADX WARN: Type inference failed for: r1v0, types: [int] */
        /* JADX WARN: Type inference failed for: r1v1, types: [X.HoC] */
        /* JADX WARN: Type inference failed for: r1v15, types: [X.Hrx, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r1v17, types: [java.lang.Object] */
        /* JADX WARN: Type inference failed for: r1v24, types: [X.27k] */
        /* JADX WARN: Type inference failed for: r1v39 */
        /* JADX WARN: Type inference failed for: r1v40 */
        @Override // X.AbstractC8884Fsp
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r24) throws java.lang.Throwable {
            /*
                Method dump skipped, instructions count: 467
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.partners.voice.viewmodel.VoicePreviewPlayer.C133572.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ((C133572) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.partners.voice.viewmodel.VoicePreviewPlayer$streamPreviewToRtc$2", f = "VoicePreviewPlayer.kt", l = {317, 321}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.partners.voice.viewmodel.VoicePreviewPlayer$streamPreviewToRtc$2, reason: invalid class name and case insensitive filesystem */
    public final class C133582 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ long $callGeneration;
        public final /* synthetic */ ActivePreview $preview;
        public final /* synthetic */ String $text;
        public /* synthetic */ Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public Object L$4;
        public Object L$5;
        public Object L$6;
        public Object L$7;
        public int label;

        /* renamed from: com.facebook.aura.partners.voice.viewmodel.VoicePreviewPlayer$streamPreviewToRtc$2$WhenMappings */
        public abstract /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[RtcPlayoutResult.values().length];
                try {
                    AnonymousClass002.A13(RtcPlayoutResult.PLAYED, iArr);
                } catch (NoSuchFieldError unused) {
                }
                try {
                    AnonymousClass002.A14(RtcPlayoutResult.EMPTY, iArr);
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    AnonymousClass002.A15(RtcPlayoutResult.REJECTED, iArr);
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    AnonymousClass002.A16(RtcPlayoutResult.STALLED, iArr);
                } catch (NoSuchFieldError unused4) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C133582(ActivePreview activePreview, long j, String str, HtJ<? super C133582> htJ) {
            super(2, htJ);
            this.$preview = activePreview;
            this.$callGeneration = j;
            this.$text = str;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            C133582 c133582 = VoicePreviewPlayer.this.new C133582(this.$preview, this.$callGeneration, this.$text, htJ);
            c133582.L$0 = obj;
            return c133582;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:33:0x00ea A[Catch: all -> 0x0130, TRY_ENTER, TryCatch #0 {all -> 0x0130, blocks: (B:29:0x00e0, B:30:0x00e4, B:33:0x00ea, B:35:0x00f4, B:36:0x00f6, B:37:0x00fe, B:38:0x0105, B:41:0x010b, B:42:0x0121, B:17:0x00ae, B:18:0x00b1, B:23:0x00c0, B:24:0x00c4, B:26:0x00c7, B:14:0x008a), top: B:48:0x0011 }] */
        /* JADX WARN: Removed duplicated region for block: B:38:0x0105 A[Catch: all -> 0x0130, TryCatch #0 {all -> 0x0130, blocks: (B:29:0x00e0, B:30:0x00e4, B:33:0x00ea, B:35:0x00f4, B:36:0x00f6, B:37:0x00fe, B:38:0x0105, B:41:0x010b, B:42:0x0121, B:17:0x00ae, B:18:0x00b1, B:23:0x00c0, B:24:0x00c4, B:26:0x00c7, B:14:0x008a), top: B:48:0x0011 }] */
        /* JADX WARN: Type inference failed for: r0v0, types: [int] */
        /* JADX WARN: Type inference failed for: r0v1, types: [X.HoC] */
        /* JADX WARN: Type inference failed for: r0v15, types: [X.HoC] */
        @Override // X.AbstractC8884Fsp
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r26) throws java.lang.Throwable {
            /*
                Method dump skipped, instructions count: 309
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.partners.voice.viewmodel.VoicePreviewPlayer.C133582.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ((C133582) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:6:0x001a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void finishRtc(com.facebook.aura.partners.voice.viewmodel.VoicePreviewPlayer.ActivePreview r5, long r6, com.facebook.aura.partners.voice.viewmodel.RtcPlayoutResult r8) {
        /*
            r4 = this;
            r3 = r4
            com.facebook.aura.partners.voice.intf.VoiceCallStateHolder r0 = r4.voiceCallStateHolder
            boolean r0 = X.C3cH.A1P(r0)
            if (r0 == 0) goto L1a
            com.facebook.aura.partners.voice.intf.VoiceCallStateHolder r0 = r4.voiceCallStateHolder
            X.1BN<java.lang.Long> r0 = r0.callGeneration
            java.lang.Object r0 = r0.getValue()
            long r1 = X.C3cG.A05(r0)
            int r0 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            r1 = 0
            if (r0 == 0) goto L1b
        L1a:
            r1 = 1
        L1b:
            com.facebook.aura.partners.voice.viewmodel.RtcPlayoutResult r0 = com.facebook.aura.partners.voice.viewmodel.RtcPlayoutResult.PLAYED
            r4 = r5
            if (r8 != r0) goto L2a
            com.facebook.aura.partners.voice.viewmodel.VoicePreviewOutcome r5 = com.facebook.aura.partners.voice.viewmodel.VoicePreviewOutcome.PLAYED
        L22:
            r6 = 1
            r7 = 0
            X.9jH r8 = X.C9jH.A00
        L26:
            r3.finish(r4, r5, r6, r7, r8)
            return
        L2a:
            if (r1 == 0) goto L2f
            com.facebook.aura.partners.voice.viewmodel.VoicePreviewOutcome r5 = com.facebook.aura.partners.voice.viewmodel.VoicePreviewOutcome.INTERRUPTED
            goto L22
        L2f:
            com.facebook.aura.partners.voice.viewmodel.VoicePreviewOutcome r5 = com.facebook.aura.partners.voice.viewmodel.VoicePreviewOutcome.FAILED
            java.lang.String r1 = X.AnonymousClass006.A0x(r8)
            java.lang.String r0 = "rtc_"
            java.lang.String r1 = X.FGI.A0M(r0, r1)
            java.lang.String r0 = "failure_stage"
            java.util.Map r8 = X.AnonymousClass006.A10(r0, r1)
            r6 = 1
            r7 = 0
            goto L26
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.partners.voice.viewmodel.VoicePreviewPlayer.finishRtc(com.facebook.aura.partners.voice.viewmodel.VoicePreviewPlayer$ActivePreview, long, com.facebook.aura.partners.voice.viewmodel.RtcPlayoutResult):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:28:0x007b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object playOnCall(com.facebook.aura.partners.voice.viewmodel.VoicePreviewPlayer.ActivePreview r14, X.HtJ<? super kotlin.Unit> r15) {
        /*
            r13 = this;
            r3 = r15
            r7 = r14
            boolean r0 = r15 instanceof com.facebook.aura.partners.voice.viewmodel.VoicePreviewPlayer.C133531
            r6 = r13
            if (r0 == 0) goto L7b
            r5 = r3
            com.facebook.aura.partners.voice.viewmodel.VoicePreviewPlayer$playOnCall$1 r5 = (com.facebook.aura.partners.voice.viewmodel.VoicePreviewPlayer.C133531) r5
            int r2 = r5.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L7b
            int r2 = r2 - r1
            r5.label = r2
        L15:
            java.lang.Object r1 = r5.result
            X.Hji r4 = X.EnumC10460Hji.A02
            int r0 = r5.label
            r13 = 1
            r9 = 0
            if (r0 == 0) goto L54
            if (r0 != r13) goto L86
            java.lang.Object r7 = r5.L$0
            com.facebook.aura.partners.voice.viewmodel.VoicePreviewPlayer$ActivePreview r7 = (com.facebook.aura.partners.voice.viewmodel.VoicePreviewPlayer.ActivePreview) r7
            X.Hwg.A00(r1)
        L28:
            com.facebook.aura.partners.voice.api.CallVoicePreviewResult r1 = (com.facebook.aura.partners.voice.api.CallVoicePreviewResult) r1
            int r1 = r1.ordinal()
            if (r1 == r9) goto L46
            if (r1 == r13) goto L49
            r0 = 2
            if (r1 != r0) goto L81
            com.facebook.aura.partners.voice.viewmodel.VoicePreviewOutcome r8 = com.facebook.aura.partners.voice.viewmodel.VoicePreviewOutcome.FAILED
            java.lang.String r1 = "failure_stage"
            java.lang.String r0 = "call_response"
            java.util.Map r11 = X.AnonymousClass006.A10(r1, r0)
            r10 = r9
            r6.finish(r7, r8, r9, r10, r11)
        L43:
            kotlin.Unit r4 = kotlin.Unit.INSTANCE
            return r4
        L46:
            com.facebook.aura.partners.voice.viewmodel.VoicePreviewOutcome r12 = com.facebook.aura.partners.voice.viewmodel.VoicePreviewOutcome.PLAYED
            goto L4b
        L49:
            com.facebook.aura.partners.voice.viewmodel.VoicePreviewOutcome r12 = com.facebook.aura.partners.voice.viewmodel.VoicePreviewOutcome.INTERRUPTED
        L4b:
            X.9jH r15 = X.C9jH.A00
            r10 = r6
            r11 = r7
            r14 = r9
            r10.finish(r11, r12, r13, r14, r15)
            goto L43
        L54:
            X.Hwg.A00(r1)
            com.facebook.aura.partners.voice.viewmodel.VoicePreviewDiagnostics$Attempt r3 = r14.diagnostics
            if (r3 == 0) goto L63
            com.facebook.aura.partners.voice.viewmodel.VoicePreviewSource r2 = com.facebook.aura.partners.voice.viewmodel.VoicePreviewSource.CALL
            com.facebook.aura.partners.voice.viewmodel.VoicePreviewPlaybackPath r1 = com.facebook.aura.partners.voice.viewmodel.VoicePreviewPlaybackPath.CALL_AUDIO
            r0 = 0
            r3.sourceResolved(r2, r1, r0, r0)
        L63:
            r6.markPlaying(r14)
            X.78T r2 = X.AnonymousClass001.A0y()
            r1 = 0
            com.facebook.aura.partners.voice.viewmodel.VoicePreviewPlayer$playOnCall$result$1 r0 = new com.facebook.aura.partners.voice.viewmodel.VoicePreviewPlayer$playOnCall$result$1
            r0.<init>(r6, r14, r1)
            r5.L$0 = r14
            r5.label = r13
            java.lang.Object r1 = X.GAo.A00(r5, r2, r0)
            if (r1 != r4) goto L28
            return r4
        L7b:
            com.facebook.aura.partners.voice.viewmodel.VoicePreviewPlayer$playOnCall$1 r5 = new com.facebook.aura.partners.voice.viewmodel.VoicePreviewPlayer$playOnCall$1
            r5.<init>(r15)
            goto L15
        L81:
            kotlin.NoWhenBranchMatchedException r0 = X.C3cG.A0q()
            throw r0
        L86:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.partners.voice.viewmodel.VoicePreviewPlayer.playOnCall(com.facebook.aura.partners.voice.viewmodel.VoicePreviewPlayer$ActivePreview, X.HtJ):java.lang.Object");
    }

    private final void startPlayback(final ActivePreview activePreview, byte[] bArr) throws IllegalStateException, IllegalArgumentException {
        if (isActive(activePreview)) {
            try {
                MediaPlayer mediaPlayer = new MediaPlayer();
                synchronized (this.lock) {
                    activePreview.mediaPlayer = mediaPlayer;
                }
                final AudioAttributes audioAttributesPreviewAudioAttributes = previewAudioAttributes();
                mediaPlayer.setAudioAttributes(audioAttributesPreviewAudioAttributes);
                mediaPlayer.setDataSource(new ByteArrayMediaDataSource(bArr));
                mediaPlayer.setOnPreparedListener(new MediaPlayer.OnPreparedListener() { // from class: com.facebook.aura.partners.voice.viewmodel.VoicePreviewPlayer.startPlayback.2

                    /* renamed from: com.facebook.aura.partners.voice.viewmodel.VoicePreviewPlayer$startPlayback$2$1, reason: invalid class name */
                    public final class AnonymousClass1 extends AbstractC7559F3s implements Function0<VoicePreviewPlayerState> {
                        public final /* synthetic */ AudioAttributes $audioAttributes;
                        public final /* synthetic */ MediaPlayer $preparedPlayer;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        public AnonymousClass1(MediaPlayer mediaPlayer, AudioAttributes audioAttributes) {
                            super(0);
                            this.$preparedPlayer = mediaPlayer;
                            this.$audioAttributes = audioAttributes;
                        }

                        /* JADX WARN: Can't rename method to resolve collision */
                        @Override // kotlin.jvm.functions.Function0
                        public final VoicePreviewPlayerState invoke() {
                            MediaPlayer mediaPlayer = this.$preparedPlayer;
                            C7384Etj.A0X(mediaPlayer);
                            return VoicePreviewPlayerKt.diagnosticState(mediaPlayer, this.$audioAttributes.getUsage());
                        }
                    }

                    @Override // android.media.MediaPlayer.OnPreparedListener
                    public final void onPrepared(MediaPlayer mediaPlayer2) throws IllegalStateException {
                        if (!VoicePreviewPlayer.this.isActive(activePreview)) {
                            VoicePreviewPlayer.this.releaseMediaPlayer(activePreview);
                            return;
                        }
                        try {
                            mediaPlayer2.start();
                            VoicePreviewPlayer.this.markPlaying(activePreview);
                            VoicePreviewDiagnostics.Attempt attempt = activePreview.diagnostics;
                            if (attempt != null) {
                                attempt.started(VoicePreviewPlayer.this.scope, new AnonymousClass1(mediaPlayer2, audioAttributesPreviewAudioAttributes));
                            }
                        } catch (IllegalStateException e) {
                            CFK.A0A(VoicePreviewPlayerKt.TAG, "preview start failed", e);
                            VoicePreviewPlayer.finish$default(VoicePreviewPlayer.this, activePreview, VoicePreviewOutcome.FAILED, false, false, AnonymousClass006.A10("failure_stage", "player_start"), 12, null);
                        }
                    }
                });
                mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() { // from class: com.facebook.aura.partners.voice.viewmodel.VoicePreviewPlayer.startPlayback.3
                    @Override // android.media.MediaPlayer.OnCompletionListener
                    public final void onCompletion(MediaPlayer mediaPlayer2) {
                        VoicePreviewPlayer.finish$default(VoicePreviewPlayer.this, activePreview, VoicePreviewOutcome.PLAYED, false, false, null, 28, null);
                    }
                });
                mediaPlayer.setOnErrorListener(new MediaPlayer.OnErrorListener() { // from class: com.facebook.aura.partners.voice.viewmodel.VoicePreviewPlayer.startPlayback.4
                    @Override // android.media.MediaPlayer.OnErrorListener
                    public final boolean onError(MediaPlayer mediaPlayer2, int i, int i2) {
                        VoicePreviewPlayer.finish$default(VoicePreviewPlayer.this, activePreview, VoicePreviewOutcome.FAILED, false, false, AGH.A0D(C3cG.A0r("error_what", String.valueOf(i)), C3cG.A0r("error_extra", String.valueOf(i2))), 12, null);
                        return true;
                    }
                });
                mediaPlayer.prepareAsync();
                if (isActive(activePreview)) {
                    return;
                }
                releaseMediaPlayer(activePreview);
            } catch (RuntimeException e) {
                CFK.A0A(VoicePreviewPlayerKt.TAG, "startPlayback failed", e);
                finish(activePreview, VoicePreviewOutcome.FAILED, true, false, AnonymousClass006.A10("failure_stage", "player_setup"));
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0011  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void stopIf(X.G0U<? super com.facebook.aura.partners.voice.viewmodel.VoicePreviewRequest, java.lang.Boolean> r8) {
        /*
            r7 = this;
            r3 = r7
            java.lang.Object r2 = r7.lock
            monitor-enter(r2)
            com.facebook.aura.partners.voice.viewmodel.VoicePreviewPlayer$ActivePreview r4 = r7.active     // Catch: java.lang.Throwable -> L1f
            r1 = 0
            if (r4 == 0) goto L11
            com.facebook.aura.partners.voice.viewmodel.VoicePreviewRequest r0 = r4.request     // Catch: java.lang.Throwable -> L1f
            boolean r0 = X.AnonymousClass003.A1X(r0, r8)     // Catch: java.lang.Throwable -> L1f
            if (r0 != 0) goto L12
        L11:
            r4 = r1
        L12:
            monitor-exit(r2)
            if (r4 == 0) goto L1e
            com.facebook.aura.partners.voice.viewmodel.VoicePreviewOutcome r5 = com.facebook.aura.partners.voice.viewmodel.VoicePreviewOutcome.INTERRUPTED
            r6 = 1
            r7 = 0
            X.9jH r8 = X.C9jH.A00
            r3.finish(r4, r5, r6, r7, r8)
        L1e:
            return
        L1f:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.partners.voice.viewmodel.VoicePreviewPlayer.stopIf(X.G0U):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object streamPreview(ActivePreview activePreview, String str, HtJ<? super Unit> htJ) {
        return C3cG.A0U(Hxb.A00(new C133572(activePreview, str, null), htJ));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object streamPreviewToRtc(ActivePreview activePreview, String str, long j, HtJ<? super Unit> htJ) {
        return C3cG.A0U(Hxb.A00(new C133582(activePreview, j, str, null), htJ));
    }

    public final void stop(String str) {
        C7384Etj.A0Y(str, 0);
        stopIf(new C133562(str));
    }

    public final void toggle(VoicePreviewRequest voicePreviewRequest) {
        C7384Etj.A0Y(voicePreviewRequest, 0);
        VoicePreviewPlayback value = this._playback.getValue();
        if (C7384Etj.areEqual(value != null ? value.key : null, voicePreviewRequest.key)) {
            stop();
        } else {
            start(voicePreviewRequest, shouldSpeakOnCall(voicePreviewRequest));
        }
    }

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[CallVoicePreviewResult.values().length];
            try {
                AnonymousClass005.A0v(CallVoicePreviewResult.SPOKEN, iArr, 1);
            } catch (NoSuchFieldError unused) {
            }
            try {
                AnonymousClass005.A0v(CallVoicePreviewResult.INTERRUPTED, iArr, 2);
            } catch (NoSuchFieldError unused2) {
            }
            try {
                AnonymousClass005.A0v(CallVoicePreviewResult.FAILED, iArr, 3);
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[VoicePreviewOutcome.values().length];
            try {
                AnonymousClass005.A0v(VoicePreviewOutcome.PLAYED, iArr2, 1);
            } catch (NoSuchFieldError unused4) {
            }
            try {
                AnonymousClass005.A0v(VoicePreviewOutcome.INTERRUPTED, iArr2, 2);
            } catch (NoSuchFieldError unused5) {
            }
            try {
                AnonymousClass005.A0v(VoicePreviewOutcome.FAILED, iArr2, 3);
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    /* renamed from: com.facebook.aura.partners.voice.viewmodel.VoicePreviewPlayer$stop$1, reason: invalid class name and case insensitive filesystem */
    public final class C133551 extends AbstractC7559F3s implements G0U<VoicePreviewRequest, Boolean> {
        public static final C133551 INSTANCE = new C133551();

        public C133551() {
            super(1);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Boolean invoke2(VoicePreviewRequest voicePreviewRequest) {
            return AnonymousClass001.A0i();
        }

        @Override // X.G0U
        public /* bridge */ /* synthetic */ Boolean invoke(VoicePreviewRequest voicePreviewRequest) {
            return AnonymousClass001.A0i();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void finish$default(VoicePreviewPlayer voicePreviewPlayer, ActivePreview activePreview, VoicePreviewOutcome voicePreviewOutcome, boolean z, boolean z2, Map map, int i, Object obj) {
        boolean zA1Q = C60Q.A1Q(i & 4, z);
        boolean zA1K = C3cG.A1K(i & 8, z2);
        if ((i & 16) != 0) {
            map = C9jH.A00;
        }
        voicePreviewPlayer.finish(activePreview, voicePreviewOutcome, zA1Q, zA1K, map);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final PlayoutInjection injectRtc(long j, short[] sArr) {
        return VoiceCallRuntime.INSTANCE.injectPlayoutPcm48k(this.userSession, j, sArr);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isActive(ActivePreview activePreview) {
        boolean zA1Z;
        synchronized (this.lock) {
            zA1Z = AnonymousClass002.A1Z(this.active, activePreview);
        }
        return zA1Z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00be A[Catch: Exception -> 0x01af, CancellationException -> 0x01c9, TryCatch #2 {CancellationException -> 0x01c9, Exception -> 0x01af, blocks: (B:13:0x0031, B:55:0x011d, B:56:0x0120, B:58:0x0126, B:61:0x0140, B:64:0x014a, B:67:0x0166, B:70:0x017b, B:72:0x0183, B:75:0x0198, B:77:0x01a0, B:78:0x01aa, B:79:0x01ae, B:16:0x0048, B:47:0x00e9, B:43:0x00d9, B:44:0x00dc, B:46:0x00e0, B:49:0x00ec, B:35:0x00b3, B:36:0x00b6, B:38:0x00ba, B:40:0x00be, B:52:0x0102, B:26:0x0084, B:27:0x0087, B:21:0x0072, B:23:0x0076, B:29:0x008a, B:31:0x0090), top: B:87:0x001f }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00e0 A[Catch: Exception -> 0x01af, CancellationException -> 0x01c9, TryCatch #2 {CancellationException -> 0x01c9, Exception -> 0x01af, blocks: (B:13:0x0031, B:55:0x011d, B:56:0x0120, B:58:0x0126, B:61:0x0140, B:64:0x014a, B:67:0x0166, B:70:0x017b, B:72:0x0183, B:75:0x0198, B:77:0x01a0, B:78:0x01aa, B:79:0x01ae, B:16:0x0048, B:47:0x00e9, B:43:0x00d9, B:44:0x00dc, B:46:0x00e0, B:49:0x00ec, B:35:0x00b3, B:36:0x00b6, B:38:0x00ba, B:40:0x00be, B:52:0x0102, B:26:0x0084, B:27:0x0087, B:21:0x0072, B:23:0x0076, B:29:0x008a, B:31:0x0090), top: B:87:0x001f }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00ec A[Catch: Exception -> 0x01af, CancellationException -> 0x01c9, TryCatch #2 {CancellationException -> 0x01c9, Exception -> 0x01af, blocks: (B:13:0x0031, B:55:0x011d, B:56:0x0120, B:58:0x0126, B:61:0x0140, B:64:0x014a, B:67:0x0166, B:70:0x017b, B:72:0x0183, B:75:0x0198, B:77:0x01a0, B:78:0x01aa, B:79:0x01ae, B:16:0x0048, B:47:0x00e9, B:43:0x00d9, B:44:0x00dc, B:46:0x00e0, B:49:0x00ec, B:35:0x00b3, B:36:0x00b6, B:38:0x00ba, B:40:0x00be, B:52:0x0102, B:26:0x0084, B:27:0x0087, B:21:0x0072, B:23:0x0076, B:29:0x008a, B:31:0x0090), top: B:87:0x001f }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0102 A[Catch: Exception -> 0x01af, CancellationException -> 0x01c9, TryCatch #2 {CancellationException -> 0x01c9, Exception -> 0x01af, blocks: (B:13:0x0031, B:55:0x011d, B:56:0x0120, B:58:0x0126, B:61:0x0140, B:64:0x014a, B:67:0x0166, B:70:0x017b, B:72:0x0183, B:75:0x0198, B:77:0x01a0, B:78:0x01aa, B:79:0x01ae, B:16:0x0048, B:47:0x00e9, B:43:0x00d9, B:44:0x00dc, B:46:0x00e0, B:49:0x00ec, B:35:0x00b3, B:36:0x00b6, B:38:0x00ba, B:40:0x00be, B:52:0x0102, B:26:0x0084, B:27:0x0087, B:21:0x0072, B:23:0x0076, B:29:0x008a, B:31:0x0090), top: B:87:0x001f }] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0126 A[Catch: Exception -> 0x01af, CancellationException -> 0x01c9, TryCatch #2 {CancellationException -> 0x01c9, Exception -> 0x01af, blocks: (B:13:0x0031, B:55:0x011d, B:56:0x0120, B:58:0x0126, B:61:0x0140, B:64:0x014a, B:67:0x0166, B:70:0x017b, B:72:0x0183, B:75:0x0198, B:77:0x01a0, B:78:0x01aa, B:79:0x01ae, B:16:0x0048, B:47:0x00e9, B:43:0x00d9, B:44:0x00dc, B:46:0x00e0, B:49:0x00ec, B:35:0x00b3, B:36:0x00b6, B:38:0x00ba, B:40:0x00be, B:52:0x0102, B:26:0x0084, B:27:0x0087, B:21:0x0072, B:23:0x0076, B:29:0x008a, B:31:0x0090), top: B:87:0x001f }] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0140 A[Catch: Exception -> 0x01af, CancellationException -> 0x01c9, TryCatch #2 {CancellationException -> 0x01c9, Exception -> 0x01af, blocks: (B:13:0x0031, B:55:0x011d, B:56:0x0120, B:58:0x0126, B:61:0x0140, B:64:0x014a, B:67:0x0166, B:70:0x017b, B:72:0x0183, B:75:0x0198, B:77:0x01a0, B:78:0x01aa, B:79:0x01ae, B:16:0x0048, B:47:0x00e9, B:43:0x00d9, B:44:0x00dc, B:46:0x00e0, B:49:0x00ec, B:35:0x00b3, B:36:0x00b6, B:38:0x00ba, B:40:0x00be, B:52:0x0102, B:26:0x0084, B:27:0x0087, B:21:0x0072, B:23:0x0076, B:29:0x008a, B:31:0x0090), top: B:87:0x001f }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object load(com.facebook.aura.partners.voice.viewmodel.VoicePreviewPlayer.ActivePreview r17, X.HtJ<? super kotlin.Unit> r18) {
        /*
            Method dump skipped, instructions count: 492
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.partners.voice.viewmodel.VoicePreviewPlayer.load(com.facebook.aura.partners.voice.viewmodel.VoicePreviewPlayer$ActivePreview, X.HtJ):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void markPlaying(ActivePreview activePreview) {
        synchronized (this.lock) {
            if (this.active == activePreview) {
                AnonymousClass002.A1I(this._playback, new VoicePreviewPlayback(activePreview.request.key, VoicePreviewPhase.PLAYING));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00c5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object playAudio(com.facebook.aura.partners.voice.viewmodel.VoicePreviewPlayer.ActivePreview r11, java.lang.Long r12, com.facebook.aura.partners.voice.viewmodel.VoicePreviewSource r13, byte[] r14, X.HtJ<? super kotlin.Unit> r15) throws java.lang.IllegalStateException, java.lang.IllegalArgumentException {
        /*
            r10 = this;
            boolean r0 = r15 instanceof com.facebook.aura.partners.voice.viewmodel.VoicePreviewPlayer.C133511
            if (r0 == 0) goto Lc5
            r7 = r15
            com.facebook.aura.partners.voice.viewmodel.VoicePreviewPlayer$playAudio$1 r7 = (com.facebook.aura.partners.voice.viewmodel.VoicePreviewPlayer.C133511) r7
            int r2 = r7.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto Lc5
            int r2 = r2 - r1
            r7.label = r2
        L12:
            java.lang.Object r9 = r7.result
            X.Hji r8 = X.EnumC10460Hji.A02
            int r0 = r7.label
            r6 = 2
            r4 = 1
            r5 = 0
            if (r0 == 0) goto L36
            if (r0 == r4) goto L5b
            if (r0 != r6) goto Lcc
            long r2 = r7.J$0
            java.lang.Object r11 = r7.L$7
            com.facebook.aura.partners.voice.viewmodel.VoicePreviewPlayer$ActivePreview r11 = (com.facebook.aura.partners.voice.viewmodel.VoicePreviewPlayer.ActivePreview) r11
            java.lang.Object r10 = r7.L$6
            com.facebook.aura.partners.voice.viewmodel.VoicePreviewPlayer r10 = (com.facebook.aura.partners.voice.viewmodel.VoicePreviewPlayer) r10
            X.Hwg.A00(r9)
        L2e:
            com.facebook.aura.partners.voice.viewmodel.RtcPlayoutResult r9 = (com.facebook.aura.partners.voice.viewmodel.RtcPlayoutResult) r9
            r10.finishRtc(r11, r2, r9)
        L33:
            kotlin.Unit r8 = kotlin.Unit.INSTANCE
            return r8
        L36:
            X.Hwg.A00(r9)
            if (r12 == 0) goto L71
            long r0 = r12.longValue()
            X.78T r3 = X.C3cG.A0v()
            com.facebook.aura.partners.voice.viewmodel.VoicePreviewPlayer$playAudio$pcm$1$1 r2 = new com.facebook.aura.partners.voice.viewmodel.VoicePreviewPlayer$playAudio$pcm$1$1
            r2.<init>(r14, r5)
            r7.L$0 = r11
            r7.L$1 = r12
            r7.L$2 = r13
            r7.L$3 = r14
            r7.J$0 = r0
            r7.label = r4
            java.lang.Object r9 = X.GAo.A00(r7, r3, r2)
            if (r9 != r8) goto L6e
            return r8
        L5b:
            java.lang.Object r14 = r7.L$3
            byte[] r14 = (byte[]) r14
            java.lang.Object r13 = r7.L$2
            com.facebook.aura.partners.voice.viewmodel.VoicePreviewSource r13 = (com.facebook.aura.partners.voice.viewmodel.VoicePreviewSource) r13
            java.lang.Object r12 = r7.L$1
            java.lang.Long r12 = (java.lang.Long) r12
            java.lang.Object r11 = r7.L$0
            com.facebook.aura.partners.voice.viewmodel.VoicePreviewPlayer$ActivePreview r11 = (com.facebook.aura.partners.voice.viewmodel.VoicePreviewPlayer.ActivePreview) r11
            X.Hwg.A00(r9)
        L6e:
            short[] r9 = (short[]) r9
            goto L72
        L71:
            r9 = r5
        L72:
            if (r12 == 0) goto Lb7
            if (r9 == 0) goto Lb7
            com.facebook.aura.partners.voice.viewmodel.VoicePreviewDiagnostics$Attempt r1 = r11.diagnostics
            if (r1 == 0) goto L7f
            com.facebook.aura.partners.voice.viewmodel.VoicePreviewPlaybackPath r0 = com.facebook.aura.partners.voice.viewmodel.VoicePreviewPlaybackPath.RTC_PLAYOUT
            r1.sourceResolved(r13, r0, r5, r5)
        L7f:
            com.facebook.aura.partners.voice.viewmodel.VoicePreviewPlayer$playAudio$framer$1 r0 = new com.facebook.aura.partners.voice.viewmodel.VoicePreviewPlayer$playAudio$framer$1
            r0.<init>(r10, r12)
            com.facebook.aura.partners.voice.viewmodel.RtcPreviewFramer r4 = new com.facebook.aura.partners.voice.viewmodel.RtcPreviewFramer
            r4.<init>(r0)
            r4.append(r9)
            r4.finish()
            long r2 = r12.longValue()
            X.78T r1 = X.AnonymousClass001.A0y()
            com.facebook.aura.partners.voice.viewmodel.VoicePreviewPlayer$playAudio$2 r0 = new com.facebook.aura.partners.voice.viewmodel.VoicePreviewPlayer$playAudio$2
            r0.<init>(r4, r10, r11, r5)
            r7.L$0 = r5
            r7.L$1 = r5
            r7.L$2 = r5
            r7.L$3 = r5
            r7.L$4 = r5
            r7.L$5 = r5
            r7.L$6 = r10
            r7.L$7 = r11
            r7.J$0 = r2
            r7.label = r6
            java.lang.Object r9 = X.GAo.A00(r7, r1, r0)
            if (r9 != r8) goto L2e
            return r8
        Lb7:
            com.facebook.aura.partners.voice.viewmodel.VoicePreviewDiagnostics$Attempt r1 = r11.diagnostics
            if (r1 == 0) goto Lc0
            com.facebook.aura.partners.voice.viewmodel.VoicePreviewPlaybackPath r0 = com.facebook.aura.partners.voice.viewmodel.VoicePreviewPlaybackPath.MEDIA_PLAYER
            r1.sourceResolved(r13, r0, r5, r5)
        Lc0:
            r10.startPlayback(r11, r14)
            goto L33
        Lc5:
            com.facebook.aura.partners.voice.viewmodel.VoicePreviewPlayer$playAudio$1 r7 = new com.facebook.aura.partners.voice.viewmodel.VoicePreviewPlayer$playAudio$1
            r7.<init>(r15)
            goto L12
        Lcc:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.partners.voice.viewmodel.VoicePreviewPlayer.playAudio(com.facebook.aura.partners.voice.viewmodel.VoicePreviewPlayer$ActivePreview, java.lang.Long, com.facebook.aura.partners.voice.viewmodel.VoicePreviewSource, byte[], X.HtJ):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final AudioAttributes previewAudioAttributes() {
        AudioAttributes audioAttributesBuild = new AudioAttributes.Builder().setUsage(C3cH.A1P(this.voiceCallStateHolder) ? VoiceGating.INSTANCE.getCallAudioStream().getUsage() : 1).setContentType(1).build();
        C7384Etj.A0U(audioAttributesBuild);
        return audioAttributesBuild;
    }

    private final void release(ActivePreview activePreview) {
        AnonymousClass002.A1K(activePreview.job);
        releaseStreamPlayer(activePreview);
        releaseMediaPlayer(activePreview);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void releaseMediaPlayer(ActivePreview activePreview) {
        MediaPlayer mediaPlayer;
        synchronized (this.lock) {
            mediaPlayer = activePreview.mediaPlayer;
            activePreview.mediaPlayer = null;
        }
        if (mediaPlayer != null) {
            mediaPlayer.release();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void releaseStreamPlayer(ActivePreview activePreview) {
        PcmStreamPlayer pcmStreamPlayer;
        synchronized (this.lock) {
            pcmStreamPlayer = activePreview.streamPlayer;
            activePreview.streamPlayer = null;
        }
        if (pcmStreamPlayer != null) {
            pcmStreamPlayer.stop();
        }
    }

    private final Long rtcCallGeneration() {
        Long value = this.voiceCallStateHolder.callGeneration.getValue();
        value.longValue();
        if (!C3cH.A1P(this.voiceCallStateHolder)) {
            value = null;
        }
        return value;
    }

    private final boolean shouldSpeakOnCall(VoicePreviewRequest voicePreviewRequest) {
        return !voicePreviewRequest.designed && C3cH.A1P(this.voiceCallStateHolder) && VoiceGating.INSTANCE.isServerVoicePreviewEnabled();
    }

    @Override // X.InterfaceC7549F2g
    public void clearUserData() {
        synchronized (this.lock) {
            this.closed = true;
        }
        stop();
        Hxb.A03(null, this.scope);
    }

    public final C1BN<VoicePreviewPlayback> getPlayback() {
        return this.playback;
    }

    /* JADX WARN: Not initialized variable reg: 7, insn: 0x005f: INVOKE 
  (r6v0 ?? I:com.facebook.aura.partners.voice.viewmodel.VoicePreviewPlayer)
  (r7 I:com.facebook.aura.partners.voice.viewmodel.VoicePreviewPlayer$ActivePreview)
  (r8 I:com.facebook.aura.partners.voice.viewmodel.VoicePreviewOutcome)
  (r9 I:boolean)
  (r10 I:boolean)
  (r11 I:java.util.Map)
 DIRECT call: com.facebook.aura.partners.voice.viewmodel.VoicePreviewPlayer.finish(com.facebook.aura.partners.voice.viewmodel.VoicePreviewPlayer$ActivePreview, com.facebook.aura.partners.voice.viewmodel.VoicePreviewOutcome, boolean, boolean, java.util.Map):void A[MD:(com.facebook.aura.partners.voice.viewmodel.VoicePreviewPlayer$ActivePreview, com.facebook.aura.partners.voice.viewmodel.VoicePreviewOutcome, boolean, boolean, java.util.Map<java.lang.String, java.lang.String>):void (m)] (LINE:95), block:B:22:0x005a */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object play(java.lang.String r10, java.lang.String r11, java.lang.String r12, X.HtJ<? super com.facebook.aura.partners.voice.viewmodel.VoicePreviewOutcome> r13) {
        /*
            r9 = this;
            boolean r0 = r13 instanceof com.facebook.aura.partners.voice.viewmodel.VoicePreviewPlayer.C133501
            r6 = r9
            if (r0 == 0) goto L23
            r5 = r13
            com.facebook.aura.partners.voice.viewmodel.VoicePreviewPlayer$play$1 r5 = (com.facebook.aura.partners.voice.viewmodel.VoicePreviewPlayer.C133501) r5
            int r2 = r5.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L23
            int r2 = r2 - r1
            r5.label = r2
        L13:
            java.lang.Object r0 = r5.result
            X.Hji r4 = X.EnumC10460Hji.A02
            int r1 = r5.label
            r9 = 1
            if (r1 == 0) goto L32
            if (r1 != r9) goto L2d
            java.lang.Object r7 = r5.L$3
            com.facebook.aura.partners.voice.viewmodel.VoicePreviewPlayer$ActivePreview r7 = (com.facebook.aura.partners.voice.viewmodel.VoicePreviewPlayer.ActivePreview) r7
            goto L29
        L23:
            com.facebook.aura.partners.voice.viewmodel.VoicePreviewPlayer$play$1 r5 = new com.facebook.aura.partners.voice.viewmodel.VoicePreviewPlayer$play$1
            r5.<init>(r13)
            goto L13
        L29:
            X.Hwg.A00(r0)     // Catch: java.util.concurrent.CancellationException -> L59
            return r0
        L2d:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        L32:
            X.Hwg.A00(r0)
            com.facebook.aura.partners.voice.viewmodel.VoicePreviewKey r3 = new com.facebook.aura.partners.voice.viewmodel.VoicePreviewKey
            r3.<init>(r10, r11, r11)
            r2 = 0
            r1 = 0
            com.facebook.aura.partners.voice.viewmodel.VoicePreviewRequest r0 = new com.facebook.aura.partners.voice.viewmodel.VoicePreviewRequest
            r0.<init>(r3, r12, r1)
            com.facebook.aura.partners.voice.viewmodel.VoicePreviewPlayer$ActivePreview r7 = r6.start(r0, r1)
            X.Hsz<com.facebook.aura.partners.voice.viewmodel.VoicePreviewOutcome> r0 = r7.outcome     // Catch: java.util.concurrent.CancellationException -> L59
            r5.L$0 = r2     // Catch: java.util.concurrent.CancellationException -> L59
            r5.L$1 = r2     // Catch: java.util.concurrent.CancellationException -> L59
            r5.L$2 = r2     // Catch: java.util.concurrent.CancellationException -> L59
            r5.L$3 = r7     // Catch: java.util.concurrent.CancellationException -> L59
            r5.label = r9     // Catch: java.util.concurrent.CancellationException -> L59
            java.lang.Object r0 = X.C3cG.A0W(r0, r5)     // Catch: java.util.concurrent.CancellationException -> L59
            if (r0 != r4) goto L58
            return r4
        L58:
            return r0
        L59:
            r0 = move-exception
            com.facebook.aura.partners.voice.viewmodel.VoicePreviewOutcome r8 = com.facebook.aura.partners.voice.viewmodel.VoicePreviewOutcome.INTERRUPTED
            X.9jH r11 = X.C9jH.A00
            r10 = r9
            r6.finish(r7, r8, r9, r10, r11)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.partners.voice.viewmodel.VoicePreviewPlayer.play(java.lang.String, java.lang.String, java.lang.String, X.HtJ):java.lang.Object");
    }

    /* loaded from: classes2.dex */
    public final class Companion {
        public final VoicePreviewPlayer getInstance(AbstractC3358CGz abstractC3358CGz) {
            C7384Etj.A0Y(abstractC3358CGz, 0);
            return (VoicePreviewPlayer) abstractC3358CGz.A03(VoicePreviewPlayer.class, new VoicePreviewPlayer$Companion$getInstance$1(abstractC3358CGz));
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public VoicePreviewPlayer(AbstractC3358CGz abstractC3358CGz) {
        this.userSession = abstractC3358CGz;
        this.lock = C3cG.A0T();
        HzC hzCA05 = C78W.A05(new C8eO(null), AuraDispatchers.main);
        this.scope = hzCA05;
        this.repository = new VoiceCatalogRepository();
        this.voiceCallStateHolder = VoiceCallStateHolder.Companion.getInstance(abstractC3358CGz);
        this.duckingOwner = C3cG.A0T();
        this.diagnostics = new VoicePreviewDiagnostics(abstractC3358CGz);
        C9286GCn c9286GCnA01 = HnJ.A01(null);
        this._playback = c9286GCnA01;
        this.playback = C3cG.A11(c9286GCnA01);
        AnonymousClass1 anonymousClass1 = new AnonymousClass1(null);
        C6ys c6ys = C6ys.A00;
        Integer num = C79.A00;
        GAo.A02(num, c6ys, anonymousClass1, hzCA05);
        GAo.A02(num, c6ys, new AnonymousClass2(null), hzCA05);
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x007b, code lost:
    
        if ((r0 != null ? r0.phase : null) != com.facebook.aura.partners.voice.viewmodel.VoicePreviewPhase.LOADING) goto L45;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void finish(com.facebook.aura.partners.voice.viewmodel.VoicePreviewPlayer.ActivePreview r8, com.facebook.aura.partners.voice.viewmodel.VoicePreviewOutcome r9, boolean r10, boolean r11, java.util.Map<java.lang.String, java.lang.String> r12) {
        /*
            r7 = this;
            int r1 = r9.ordinal()
            r3 = 1
            r6 = 0
            if (r1 == r6) goto L1e
            if (r1 == r3) goto L1b
            r0 = 2
            if (r1 != r0) goto L82
            if (r10 == 0) goto L18
            java.lang.String r5 = "failed"
        L11:
            java.lang.Object r4 = r7.lock
            monitor-enter(r4)
            r1 = 0
            if (r11 == 0) goto L36
            goto L21
        L18:
            java.lang.String r5 = "cleared"
            goto L11
        L1b:
            java.lang.String r5 = "stopped"
            goto L11
        L1e:
            java.lang.String r5 = "finished"
            goto L11
        L21:
            com.facebook.aura.partners.voice.viewmodel.VoicePreviewPlayer$ActivePreview r0 = r7.active     // Catch: java.lang.Throwable -> L7f
            if (r0 != r8) goto L7d
            X.BLG<com.facebook.aura.partners.voice.viewmodel.VoicePreviewPlayback> r0 = r7._playback     // Catch: java.lang.Throwable -> L7f
            java.lang.Object r0 = r0.getValue()     // Catch: java.lang.Throwable -> L7f
            com.facebook.aura.partners.voice.viewmodel.VoicePreviewPlayback r0 = (com.facebook.aura.partners.voice.viewmodel.VoicePreviewPlayback) r0     // Catch: java.lang.Throwable -> L7f
            if (r0 == 0) goto L34
            com.facebook.aura.partners.voice.viewmodel.VoicePreviewPhase r2 = r0.phase     // Catch: java.lang.Throwable -> L7f
        L31:
            com.facebook.aura.partners.voice.viewmodel.VoicePreviewPhase r0 = com.facebook.aura.partners.voice.viewmodel.VoicePreviewPhase.LOADING     // Catch: java.lang.Throwable -> L7f
            goto L7b
        L34:
            r2 = r1
            goto L31
        L36:
            boolean r2 = r7.closed     // Catch: java.lang.Throwable -> L7f
            com.facebook.aura.partners.voice.viewmodel.VoicePreviewPlayer$ActivePreview r0 = r7.active     // Catch: java.lang.Throwable -> L7f
            if (r0 != r8) goto L52
            com.facebook.aura.partners.voice.viewmodel.VoicePreviewDiagnostics$Attempt r0 = r8.diagnostics     // Catch: java.lang.Throwable -> L7f
            if (r0 == 0) goto L43
            r0.end(r5, r12)     // Catch: java.lang.Throwable -> L7f
        L43:
            r7.active = r1     // Catch: java.lang.Throwable -> L7f
            X.BLG<com.facebook.aura.partners.voice.viewmodel.VoicePreviewPlayback> r0 = r7._playback     // Catch: java.lang.Throwable -> L7f
            r0.Af8(r1)     // Catch: java.lang.Throwable -> L7f
            com.facebook.aura.partners.voice.intf.VoiceCallStateHolder r1 = r7.voiceCallStateHolder     // Catch: java.lang.Throwable -> L7f
            java.lang.Object r0 = r7.duckingOwner     // Catch: java.lang.Throwable -> L7f
            r1.setPreviewActive(r0, r6)     // Catch: java.lang.Throwable -> L7f
            goto L53
        L52:
            r3 = 0
        L53:
            monitor-exit(r4)
            com.facebook.aura.partners.voice.viewmodel.VoicePreviewDiagnostics$Attempt r0 = r8.diagnostics
            if (r0 == 0) goto L5b
            r0.end(r5, r12)
        L5b:
            r7.release(r8)
            X.Hsz<com.facebook.aura.partners.voice.viewmodel.VoicePreviewOutcome> r0 = r8.outcome
            X.GBM r0 = (X.GBM) r0
            boolean r0 = r0.A0R(r9)
            if (r0 == 0) goto L7e
            if (r3 == 0) goto L7e
            com.facebook.aura.partners.voice.viewmodel.VoicePreviewOutcome r0 = com.facebook.aura.partners.voice.viewmodel.VoicePreviewOutcome.FAILED
            if (r9 != r0) goto L7e
            if (r10 == 0) goto L7e
            if (r2 != 0) goto L7e
            com.facebook.aura.toast.api.ToastApi r1 = com.facebook.aura.toast.api.ToastApi.INSTANCE
            r0 = 2131887771(0x7f12069b, float:1.9410158E38)
            r1.showToast(r0)
            return
        L7b:
            if (r2 == r0) goto L36
        L7d:
            monitor-exit(r4)
        L7e:
            return
        L7f:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        L82:
            kotlin.NoWhenBranchMatchedException r0 = X.C3cG.A0q()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.partners.voice.viewmodel.VoicePreviewPlayer.finish(com.facebook.aura.partners.voice.viewmodel.VoicePreviewPlayer$ActivePreview, com.facebook.aura.partners.voice.viewmodel.VoicePreviewOutcome, boolean, boolean, java.util.Map):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [T, com.facebook.aura.partners.voice.viewmodel.VoicePreviewPlayer$ActivePreview] */
    private final ActivePreview start(VoicePreviewRequest voicePreviewRequest, boolean z) {
        VoicePreviewDiagnostics.Attempt attempt;
        C10543Hqv c10543HqvA0z = C3cG.A0z();
        synchronized (this.lock) {
            if (this.closed) {
                ActivePreview activePreview = new ActivePreview(voicePreviewRequest, null, false, null);
                ((GAt) activePreview.outcome).A0R(VoicePreviewOutcome.INTERRUPTED);
                return activePreview;
            }
            ActivePreview activePreview2 = this.active;
            if (activePreview2 != null && (attempt = activePreview2.diagnostics) != null) {
                attempt.end("stopped", C9jH.A00);
            }
            this.voiceCallStateHolder.setPreviewActive(this.duckingOwner, !z);
            ?? activePreview3 = new ActivePreview(voicePreviewRequest, this.diagnostics.requested(voicePreviewRequest.designed), z, z ? null : rtcCallGeneration());
            c10543HqvA0z.element = activePreview3;
            this.active = activePreview3;
            AnonymousClass001.A1E(this._playback, null, new VoicePreviewPlayback(voicePreviewRequest.key, VoicePreviewPhase.LOADING));
            if (activePreview2 != null) {
                release(activePreview2);
                C3cG.A1F(activePreview2.outcome, VoicePreviewOutcome.INTERRUPTED);
            }
            C10533Hqc c10533HqcA02 = GAo.A02(C79.A01, C6ys.A00, new VoicePreviewPlayer$start$job$1(this, c10543HqvA0z, null), this.scope);
            ((ActivePreview) c10543HqvA0z.element).job = c10533HqcA02;
            if (isActive((ActivePreview) c10543HqvA0z.element)) {
                c10533HqcA02.Afv();
            } else {
                c10533HqcA02.A5w(null);
            }
            return (ActivePreview) c10543HqvA0z.element;
        }
    }

    public /* synthetic */ VoicePreviewPlayer(AbstractC3358CGz abstractC3358CGz, C06H c06h) {
        this(abstractC3358CGz);
    }

    public final void stop() {
        stopIf(C133551.INSTANCE);
    }
}
