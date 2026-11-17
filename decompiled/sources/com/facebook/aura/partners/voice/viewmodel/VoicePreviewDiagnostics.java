package com.facebook.aura.partners.voice.viewmodel;

import X.AGH;
import X.AIW;
import X.AbstractC3358CGz;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass006;
import X.BV3;
import X.C0924AIa;
import X.C3UX;
import X.C3cG;
import X.C3cH;
import X.C3cI;
import X.C7384Etj;
import X.CFK;
import X.HoC;
import com.facebook.aura.analytics.hatch.HatchAppEventLogger;
import com.facebook.aura.analytics.hatch.HatchSurface;
import com.facebook.aura.commands.photos.PhotosSearchHandlerKt;
import com.facebook.aura.executors.AuraExecutors;
import com.facebook.aura.partners.voice.api.PreviewStreamDiagnostics;
import com.facebook.aura.partners.voice.intf.VoiceBugReportInfo;
import com.facebook.aura.partners.voice.intf.VoiceBugReportRepository;
import com.facebook.aura.partners.voice.intf.VoiceCallStateHolder;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public final class VoicePreviewDiagnostics {
    public static final int $stable = 8;
    public final VoiceBugReportRepository bugReportRepository;
    public final VoiceCallStateHolder callStateHolder;
    public final Executor logExecutor;
    public final String playerId;
    public final AtomicInteger previewCount;

    public final class Attempt {
        public final Map<String, String> base;
        public final Object emitLock;
        public volatile boolean ended;
        public volatile PcmLoudness loudness;
        public volatile VoicePreviewPlaybackPath playbackPath;
        public volatile Function0<VoicePreviewPlayerState> playerState;
        public volatile HoC snapshotJob;
        public volatile VoicePreviewSource source;
        public volatile PreviewStreamDiagnostics stream;
        public final /* synthetic */ VoicePreviewDiagnostics this$0;

        public Attempt(VoicePreviewDiagnostics voicePreviewDiagnostics, Map<String, String> map) {
            C7384Etj.A0Y(map, 1);
            this.this$0 = voicePreviewDiagnostics;
            this.base = map;
            this.emitLock = C3cG.A0T();
            log("requested");
        }

        private final void enqueue(final Map<String, String> map) {
            this.this$0.logExecutor.execute(new Runnable() { // from class: com.facebook.aura.partners.voice.viewmodel.VoicePreviewDiagnostics$Attempt$enqueue$1
                @Override // java.lang.Runnable
                public final void run() {
                    LinkedHashMap linkedHashMapA02 = AGH.A02(map, VoicePreviewDiagnosticsKt.audioSystemFields());
                    HatchAppEventLogger.INSTANCE.logEvent(VoicePreviewDiagnosticsKt.EVENT_NAME, HatchSurface.VOICE_MODE.getValue(), null, VoicePreviewDiagnosticsKt.EVENT_TYPE, null, linkedHashMapA02, null);
                    CFK.A03(linkedHashMapA02, VoicePreviewDiagnosticsKt.TAG, "%s");
                }
            });
        }

        private final Map<String, String> fields(String str, Map<String, String> map) {
            VoicePreviewDiagnostics voicePreviewDiagnostics = this.this$0;
            C0924AIa c0924AIaA0u = C3cG.A0u();
            c0924AIaA0u.putAll(this.base);
            c0924AIaA0u.put("phase", str);
            c0924AIaA0u.put(BV3.A00(83), String.valueOf(System.currentTimeMillis()));
            c0924AIaA0u.put("call_active", String.valueOf(C3cH.A1P(voicePreviewDiagnostics.callStateHolder)));
            c0924AIaA0u.put("duck_requested", String.valueOf(C3cH.A1R(voicePreviewDiagnostics.callStateHolder.isPreviewActive)));
            VoicePreviewSource voicePreviewSource = this.source;
            if (voicePreviewSource != null) {
                c0924AIaA0u.put(PhotosSearchHandlerKt.PARAM_SOURCE, voicePreviewSource.getValue());
            }
            VoicePreviewPlaybackPath voicePreviewPlaybackPath = this.playbackPath;
            if (voicePreviewPlaybackPath != null) {
                c0924AIaA0u.put("playback_path", voicePreviewPlaybackPath.getValue());
            }
            Function0<VoicePreviewPlayerState> function0 = this.playerState;
            if (function0 != null) {
                c0924AIaA0u.putAll(VoicePreviewDiagnosticsKt.toFields(function0.invoke()));
            }
            PcmLoudness pcmLoudness = this.loudness;
            if (pcmLoudness != null) {
                c0924AIaA0u.putAll(pcmLoudness.toFields());
            }
            PreviewStreamDiagnostics previewStreamDiagnostics = this.stream;
            if (previewStreamDiagnostics != null) {
                c0924AIaA0u.putAll(previewStreamDiagnostics.toFields());
            }
            c0924AIaA0u.putAll(map);
            return AIW.A0K(c0924AIaA0u);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void log(String str) {
            if (this.ended) {
                return;
            }
            Map<String, String> mapFields = fields(str, AGH.A0E());
            synchronized (this.emitLock) {
                if (!this.ended) {
                    enqueue(mapFields);
                }
            }
        }

        public static /* synthetic */ void sourceResolved$default(Attempt attempt, VoicePreviewSource voicePreviewSource, VoicePreviewPlaybackPath voicePreviewPlaybackPath, PcmLoudness pcmLoudness, PreviewStreamDiagnostics previewStreamDiagnostics, int i, Object obj) {
            if ((i & 4) != 0) {
                pcmLoudness = null;
            }
            if ((i & 8) != 0) {
                previewStreamDiagnostics = null;
            }
            attempt.sourceResolved(voicePreviewSource, voicePreviewPlaybackPath, pcmLoudness, previewStreamDiagnostics);
        }

        public final void end(String str, Map<String, String> map) {
            boolean zA1a = AnonymousClass002.A1a(str, map);
            if (this.ended) {
                return;
            }
            Map<String, String> mapFields = fields("ended", AnonymousClass006.A11("reason", str, map));
            synchronized (this.emitLock) {
                if (this.ended) {
                    return;
                }
                this.ended = zA1a;
                enqueue(mapFields);
                HoC hoC = this.snapshotJob;
                if (hoC != null) {
                    hoC.A5w(null);
                }
                this.playerState = null;
            }
        }

        public final void sourceResolved(VoicePreviewSource voicePreviewSource, VoicePreviewPlaybackPath voicePreviewPlaybackPath, PcmLoudness pcmLoudness, PreviewStreamDiagnostics previewStreamDiagnostics) {
            AnonymousClass003.A0u(voicePreviewSource, voicePreviewPlaybackPath);
            if (this.ended) {
                return;
            }
            this.source = voicePreviewSource;
            this.playbackPath = voicePreviewPlaybackPath;
            this.loudness = pcmLoudness;
            this.stream = previewStreamDiagnostics;
        }

        public final void started(C3UX c3ux, Function0<VoicePreviewPlayerState> function0) {
            AnonymousClass003.A0u(c3ux, function0);
            if (this.ended) {
                return;
            }
            this.playerState = function0;
            log("started");
            this.snapshotJob = AnonymousClass001.A11(new VoicePreviewDiagnostics$Attempt$started$1(this, AnonymousClass006.A13(this.snapshotJob)), c3ux);
        }
    }

    public VoicePreviewDiagnostics(AbstractC3358CGz abstractC3358CGz) {
        C7384Etj.A0Y(abstractC3358CGz, 0);
        this.playerId = AnonymousClass002.A0k();
        this.logExecutor = AuraExecutors.INSTANCE.createSerialIOExecutor();
        this.previewCount = new AtomicInteger();
        this.callStateHolder = C3cG.A0K(abstractC3358CGz);
        this.bugReportRepository = VoiceBugReportRepository.Companion.getInstance(abstractC3358CGz);
    }

    public final Attempt requested(boolean z) {
        VoiceBugReportInfo latestCallInfo = this.bugReportRepository.getLatestCallInfo();
        if (latestCallInfo == null || !latestCallInfo.isActive) {
            latestCallInfo = null;
        }
        C0924AIa c0924AIaA0u = C3cG.A0u();
        c0924AIaA0u.put("preview_id", AnonymousClass002.A0k());
        c0924AIaA0u.put("preview_player_id", this.playerId);
        c0924AIaA0u.put("player_preview_index", String.valueOf(this.previewCount.incrementAndGet()));
        C3cI.A1K("designed", c0924AIaA0u, z);
        if (latestCallInfo != null) {
            String str = latestCallInfo.sharedCallId;
            if (str != null) {
                c0924AIaA0u.put("shared_call_id", str);
            }
            c0924AIaA0u.put("call_age_seconds", String.valueOf((System.currentTimeMillis() - latestCallInfo.startedAtMillis) / 1000.0d));
        }
        return new Attempt(this, AIW.A0K(c0924AIaA0u));
    }
}
