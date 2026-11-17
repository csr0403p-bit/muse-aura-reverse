package com.facebook.video.heroplayer.service.heroexoplayer2;

import X.AbstractC3426CMt;
import X.AbstractC5553DkW;
import X.AbstractC5718DoA;
import X.AbstractC7385Etm;
import X.BV4;
import X.BV5;
import X.BV6;
import X.BVj;
import X.BeN;
import X.Bs8;
import X.C1O;
import X.C1b6;
import X.C2358BVi;
import X.C2461Bbo;
import X.C3cG;
import X.C4904DDx;
import X.C5072DTn;
import X.C5580Dky;
import X.C5594DlX;
import X.C5622Dm5;
import X.C5723DoI;
import X.C5747Doi;
import X.C5778DpK;
import X.C5785DpT;
import X.C5790DpZ;
import X.C5792Dpb;
import X.C5893Dra;
import X.C5994Dtb;
import X.C60O;
import X.C6154Dwx;
import X.C6173DxG;
import X.C6232Dya;
import X.C6518EAw;
import X.C7384Etj;
import X.C8j4;
import X.CNC;
import X.DED;
import X.DEG;
import X.DEL;
import X.DEM;
import X.DEW;
import X.DEZ;
import X.Dl2;
import X.Dl5;
import X.Dlv;
import X.Dlw;
import X.DmR;
import X.Du7;
import X.Dy6;
import X.EnumC2352BVb;
import X.EnumC5624Dm7;
import X.EnumC5642DmW;
import X.EnumC7436Evw;
import X.FGI;
import X.InterfaceC2361BVo;
import X.InterfaceC5369DhL;
import X.InterfaceC5564Dkh;
import X.InterfaceC5860Dqu;
import X.InterfaceC6239Dyh;
import X.InterfaceC6243Dym;
import android.net.Uri;
import android.os.Handler;
import android.os.Trace;
import android.text.TextUtils;
import androidx.media3.common.util.Util;
import androidx.media3.datasource.HttpDataSource$HttpDataSourceException;
import androidx.media3.datasource.HttpDataSource$InvalidResponseCodeException;
import androidx.media3.exoplayer.ExoPlaybackException;
import com.facebook.aura.ccv.nativeflow.ui.HatchCcvLoggingKt;
import com.facebook.common.stringformat.StringFormatUtil;
import com.facebook.exoplayer.monitor.Dav1dDecoderEventListener;
import com.facebook.video.heroplayer.exocustom.FailoverStreamDryException;
import com.facebook.video.heroplayer.setting.HeroPlayerSetting;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONArray;
import org.json.JSONException;

/* loaded from: classes5.dex */
public class HeroExoPlayer2EventListener implements InterfaceC6239Dyh, InterfaceC6243Dym, Dav1dDecoderEventListener, InterfaceC5369DhL, InterfaceC5564Dkh {
    public static final AtomicInteger AUDIO_TRACKS_ALLOCATED = BV5.A17();
    public static final C5778DpK AUDIO_TRACK_RELEASED = new C5778DpK();
    public static final int DEFAULT_ERA_REPEAT_COUNT_FLUSH_THRESHOLD = 5;
    public static final String MOQ_URI_SCHEME = "moq";
    public static final String TAG = "Hero2EventListener";
    public int mAudioChunkLoadFailureCount;
    public int mAudioInitLoadFailureCount;
    public C6173DxG mDecoderCounters;
    public final boolean mDisableTextRendererOn404InitSegmentLoadError;
    public final boolean mDisableTextRendererOn404LoadError;
    public final boolean mDisableTextRendererOn500InitSegmentLoadError;
    public final boolean mDisableTextRendererOn500LoadError;
    public final boolean mDisableTextTrackOnMissingTextAdaptationSet;
    public int mEraCurrentEventRepeatCount;
    public int mEraLoaderEventSequenceNumber;
    public int mEraRepeatCountFlushThreshold;
    public String mFailedRequestType;
    public final HeroPlayerSetting mHeroPlayerSetting;
    public final InterfaceC5860Dqu mHeroServicePlayer;
    public Integer mLastHttpStatus;
    public IOException mLastLoadException;
    public IOException mLastManifestLoadException;
    public EnumC5624Dm7 mLastRetryErrorCode;
    public final InterfaceC2361BVo mLiveTraceFrameTracker;
    public final DEL mLiveTraceLogger;
    public long mLoadDiagnosticsGeneration;
    public int mManifestLoadFailureCount;
    public DEZ mManifestTransferEventTracker;
    public final boolean mSurfaceMPDFailoverImmediately;
    public int mVideoChunkLoadFailureCount;
    public int mVideoInitLoadFailureCount;
    public DmR mVideoPlayRequest;
    public String mVideoCodec = "";
    public boolean mIsExpiredCdnUrlErrorReported = false;
    public boolean mIsImmediate403IssueReported = false;
    public final HashMap<Long, Long> mRelevantLoads = BV4.A0u();
    public long mLastLoadErrorTimeMs = -9223372036854775807L;
    public long mLastManifestLoadSuccessTimeMs = -9223372036854775807L;
    public long mLastMediaLoadSuccessTimeMs = -9223372036854775807L;
    public long mLoadDiagnosticsResetTimeMs = -9223372036854775807L;

    private synchronized long getLoadDiagnosticsGeneration() {
        return this.mLoadDiagnosticsGeneration;
    }

    public static Integer responseCodeOf(IOException iOException) {
        int i = 0;
        while (iOException != null) {
            if (iOException instanceof HttpDataSource$InvalidResponseCodeException) {
                return Integer.valueOf(((HttpDataSource$InvalidResponseCodeException) iOException).responseCode);
            }
            Throwable cause = iOException.getCause();
            if (cause == iOException) {
                return null;
            }
            i++;
            iOException = cause;
            if (i >= 10) {
                return null;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void trackLoadCompleted(long j, C5072DTn c5072DTn, C5893Dra c5893Dra) {
        int i;
        if (j == this.mLoadDiagnosticsGeneration && this.mRelevantLoads.remove(Long.valueOf(c5072DTn.A01)) != null && !isFromBeforeLoadDiagnosticsReset(c5072DTn)) {
            int i2 = c5893Dra.A00;
            if (i2 == 4) {
                this.mLastManifestLoadSuccessTimeMs = c5072DTn.A00;
            } else if (i2 == 1 && ((i = c5893Dra.A02) == 2 || i == 1)) {
                this.mLastMediaLoadSuccessTimeMs = c5072DTn.A00;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    public synchronized void trackLoadError(long j, C5072DTn c5072DTn, C5893Dra c5893Dra, IOException iOException) {
        String relevantRequestType;
        if (j == this.mLoadDiagnosticsGeneration && this.mRelevantLoads.remove(Long.valueOf(c5072DTn.A01)) != null && !isFromBeforeLoadDiagnosticsReset(c5072DTn) && (relevantRequestType = getRelevantRequestType(c5893Dra)) != null) {
            this.mFailedRequestType = relevantRequestType;
            this.mLastHttpStatus = responseCodeOf(iOException);
            this.mLastLoadErrorTimeMs = c5072DTn.A00;
            switch (relevantRequestType.hashCode()) {
                case -63710332:
                    if (relevantRequestType.equals("chunk_audio")) {
                        this.mAudioChunkLoadFailureCount++;
                        break;
                    }
                    break;
                case -44674007:
                    if (relevantRequestType.equals("chunk_video")) {
                        this.mVideoChunkLoadFailureCount++;
                        break;
                    }
                    break;
                case 130625071:
                    if (relevantRequestType.equals("manifest")) {
                        this.mManifestLoadFailureCount++;
                        break;
                    }
                    break;
                case 585062375:
                    if (relevantRequestType.equals("init_audio")) {
                        this.mAudioInitLoadFailureCount++;
                        break;
                    }
                    break;
                case 604098700:
                    if (relevantRequestType.equals("init_video")) {
                        this.mVideoInitLoadFailureCount++;
                        break;
                    }
                    break;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void trackLoadFinished(long j, C5072DTn c5072DTn) {
        if (j == this.mLoadDiagnosticsGeneration) {
            this.mRelevantLoads.remove(Long.valueOf(c5072DTn.A01));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void trackLoadStarted(long j, C5072DTn c5072DTn, C5893Dra c5893Dra) {
        if (j == this.mLoadDiagnosticsGeneration && getRelevantRequestType(c5893Dra) != null) {
            BV4.A1F(Long.valueOf(c5072DTn.A01), this.mRelevantLoads, c5072DTn.A00);
        }
    }

    @Override // X.InterfaceC5369DhL
    public void onErrorRecoveryAttempt(IOException iOException, String str, String str2) {
        try {
            C5790DpZ c5790DpZA7G = this.mHeroServicePlayer.A7G(ExoPlaybackException.A00(iOException, 2000), EnumC5642DmW.A08);
            Dlw.A05(this).AT6(c5790DpZA7G.A03.value, c5790DpZA7G.A02.name(), c5790DpZA7G.A04, c5790DpZA7G.A05, str, str2, "");
        } catch (Exception e) {
            AbstractC5718DoA.A00(this.mHeroServicePlayer, "onErrorRecoveryAttempt: caught exception, reason=%s, errorMsg=%s, url=%s", e, str2, iOException != null ? iOException.getMessage() : "null IOException", str);
        }
    }

    @Override // X.InterfaceC5369DhL
    public void onLiveTraceEventMessage(Uri uri, String str) throws JSONException {
        onLiveTraceEventMessage(uri, str, null);
    }

    @Override // X.Du7
    public void onLoadCanceled(int i, Dy6 dy6, C5072DTn c5072DTn, C5893Dra c5893Dra) {
    }

    @Override // X.Du7
    public void onLoadCompleted(int i, Dy6 dy6, C5072DTn c5072DTn, C5893Dra c5893Dra) {
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x002d A[PHI: r1
  0x002d: PHI (r1v3 boolean) = (r1v0 boolean), (r1v4 boolean) binds: [B:14:0x002b, B:12:0x0028] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0054 A[PHI: r1
  0x0054: PHI (r1v1 boolean) = (r1v0 boolean), (r1v3 boolean) binds: [B:14:0x002b, B:16:0x0031] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // X.Du7
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onLoadStarted(int r13, X.Dy6 r14, X.C5072DTn r15, X.C5893Dra r16, int r17) {
        /*
            r12 = this;
            r4 = 4
            r5 = r12
            r8 = r15
            r9 = r16
            r11 = r17
            if (r17 != 0) goto L1a
            int r0 = r9.A00
            if (r0 != r4) goto L1a
            X.DEZ r0 = r12.mManifestTransferEventTracker
            if (r0 == 0) goto L1a
            X.C1O r2 = r15.A03
            X.DEW r1 = r0.A01
            X.DEK r0 = X.DEK.NOT_CACHED
            r1.AWl(r2, r0)
        L1a:
            X.DmR r0 = r12.mVideoPlayRequest
            boolean r3 = X.C4904DDx.A00(r0)
            r2 = 1
            if (r3 == 0) goto L2a
            com.facebook.video.heroplayer.setting.HeroPlayerSetting r0 = r12.mHeroPlayerSetting
            boolean r0 = r0.enableLoaderRetryLoggingForManifest
            r1 = 1
            if (r0 != 0) goto L2d
        L2a:
            r1 = 0
            if (r3 == 0) goto L54
        L2d:
            com.facebook.video.heroplayer.setting.HeroPlayerSetting r0 = r12.mHeroPlayerSetting
            boolean r0 = r0.enableLoaderRetryLoggingForMedia
            if (r0 == 0) goto L54
        L33:
            int r0 = r9.A00
            if (r0 != r4) goto L3a
            if (r1 != 0) goto L3a
        L39:
            return
        L3a:
            if (r2 == 0) goto L39
            if (r17 <= 0) goto L39
            if (r0 != r4) goto L51
            java.io.IOException r10 = r12.mLastManifestLoadException
        L42:
            if (r10 != 0) goto L4a
            java.lang.String r0 = "Unspecific playback error that happened prior to retry"
            java.io.IOException r10 = X.BV4.A0K(r0)
        L4a:
            r12 = 1
            r6 = r13
            r7 = r14
            r5.onLoadRetry(r6, r7, r8, r9, r10, r11, r12)
            return
        L51:
            java.io.IOException r10 = r12.mLastLoadException
            goto L42
        L54:
            r2 = 0
            goto L33
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.video.heroplayer.service.heroexoplayer2.HeroExoPlayer2EventListener.onLoadStarted(int, X.Dy6, X.DTn, X.Dra, int):void");
    }

    public synchronized void resetLoadDiagnostics(boolean z, long j) {
        if (z) {
            this.mLoadDiagnosticsGeneration++;
            this.mLoadDiagnosticsResetTimeMs = -9223372036854775807L;
            this.mRelevantLoads.clear();
        } else {
            this.mLoadDiagnosticsResetTimeMs = Math.max(this.mLoadDiagnosticsResetTimeMs, j);
        }
        this.mFailedRequestType = null;
        this.mLastHttpStatus = null;
        this.mLastLoadErrorTimeMs = -9223372036854775807L;
        this.mLastManifestLoadSuccessTimeMs = -9223372036854775807L;
        this.mLastMediaLoadSuccessTimeMs = -9223372036854775807L;
        this.mManifestLoadFailureCount = 0;
        this.mVideoChunkLoadFailureCount = 0;
        this.mAudioChunkLoadFailureCount = 0;
        this.mVideoInitLoadFailureCount = 0;
        this.mAudioInitLoadFailureCount = 0;
    }

    public static C5723DoI getParcelableFromFormat(C6154Dwx c6154Dwx) {
        Dl5 dl5A00 = Dl5.A00(c6154Dwx);
        if (c6154Dwx == null) {
            return null;
        }
        String str = c6154Dwx.A0Y;
        String str2 = c6154Dwx.A0b;
        int i = c6154Dwx.A0Q;
        int i2 = c6154Dwx.A0D;
        float f = c6154Dwx.A01;
        int i3 = c6154Dwx.A06;
        int i4 = c6154Dwx.A0L;
        int i5 = c6154Dwx.A05;
        String str3 = c6154Dwx.A0a;
        String str4 = c6154Dwx.A0W;
        String str5 = dl5A00.A0A;
        String str6 = dl5A00.A08;
        String str7 = dl5A00.A09;
        String str8 = dl5A00.A07;
        String str9 = dl5A00.A0B;
        String str10 = dl5A00.A05;
        boolean z = dl5A00.A0M;
        boolean z2 = dl5A00.A0N;
        boolean z3 = dl5A00.A0J;
        boolean z4 = dl5A00.A0I;
        boolean z5 = dl5A00.A0H;
        boolean z6 = dl5A00.A0G;
        boolean z7 = dl5A00.A0F;
        boolean z8 = dl5A00.A0E;
        boolean z9 = dl5A00.A0O;
        boolean z10 = dl5A00.A0L;
        int i6 = dl5A00.A02;
        return new C5723DoI(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, c6154Dwx.A0X, dl5A00.A0C, f, i, i2, i3, i4, i5, i6, c6154Dwx.A0J, z, z2, z3, z4, z5, z6, z7, z8, z9, z10);
    }

    public static String getRelevantRequestType(C5893Dra c5893Dra) {
        int i = c5893Dra.A00;
        if (i == 4) {
            return "manifest";
        }
        if (i == 1) {
            int i2 = c5893Dra.A02;
            if (i2 == 2) {
                return "chunk_video";
            }
            if (i2 == 1) {
                return "chunk_audio";
            }
            return null;
        }
        if (i != 2) {
            return null;
        }
        int i3 = c5893Dra.A02;
        if (i3 == 2) {
            return "init_video";
        }
        if (i3 == 1) {
            return "init_audio";
        }
        return null;
    }

    private void handleWebvttCaptionsOnManifestCompleted(C5580Dky c5580Dky, C5580Dky c5580Dky2) {
        if (C4904DDx.A00(this.mVideoPlayRequest)) {
            String webvttTextRepresentationLanguage = getWebvttTextRepresentationLanguage(c5580Dky2);
            if (!c5580Dky2.A0Y || webvttTextRepresentationLanguage == null) {
                return;
            }
            String webvttTextRepresentationLanguage2 = getWebvttTextRepresentationLanguage(c5580Dky);
            if (shouldDisableCaptioning(webvttTextRepresentationLanguage2, c5580Dky)) {
                this.mHeroServicePlayer.A9z(false);
                return;
            }
            if (shouldEnableCaptioning(webvttTextRepresentationLanguage, webvttTextRepresentationLanguage2)) {
                Dlw dlw = (Dlw) this.mHeroServicePlayer;
                Trace.beginSection("HeroServicePlayer.setSubtitleLanguage");
                try {
                    Dlw.A0U(dlw.A0f, dlw, new BeN(Collections.EMPTY_LIST, webvttTextRepresentationLanguage2, true), 33);
                } finally {
                    Trace.endSection();
                }
            }
        }
    }

    private boolean isFromBeforeLoadDiagnosticsReset(C5072DTn c5072DTn) {
        long j = this.mLoadDiagnosticsResetTimeMs;
        return j != -9223372036854775807L && c5072DTn.A00 <= j;
    }

    private boolean isStartedBufferingDiagnosticsEnabled() {
        return this.mHeroPlayerSetting.loggerSDKConfig.mEnableDashLiveStartedBufferingDiagnostics;
    }

    public static boolean shouldDisableCaptioning(String str, C5580Dky c5580Dky) {
        if (c5580Dky.A0Y) {
            if (str != null) {
                return false;
            }
            AbstractC3426CMt.A04("HeroService", TAG, "Encountered Manifest with usingASRCaptions=true but without a text adaptationSet");
        }
        return true;
    }

    private boolean shouldEnableCaptioning(String str, String str2) {
        return this.mHeroPlayerSetting.enableTextTrackWithKnownLanguage && "default".equals(str) && !"default".equals(str2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean shouldTrackLoadDiagnostics() {
        DmR dmR;
        return this.mHeroPlayerSetting.loggerSDKConfig.mEnableDashLiveStartedBufferingDiagnostics && (dmR = this.mVideoPlayRequest) != null && C4904DDx.A00(dmR);
    }

    public void dispose(boolean z) {
        this.mHeroServicePlayer.AaA(z);
    }

    public synchronized C5792Dpb getLoadDiagnosticsSnapshot(long j) {
        long j2;
        boolean z;
        long j3;
        Integer num;
        String str;
        Iterator itA0x = BV5.A0x(this.mRelevantLoads);
        j2 = -9223372036854775807L;
        z = false;
        while (itA0x.hasNext()) {
            long jA06 = BV4.A06(itA0x.next());
            if (jA06 != -9223372036854775807L && jA06 <= j) {
                if (j2 == -9223372036854775807L || jA06 < j2) {
                    j2 = jA06;
                }
                z = true;
            }
        }
        j3 = this.mLastLoadErrorTimeMs;
        if (j3 == -9223372036854775807L || j3 > j) {
            num = null;
            str = null;
        } else {
            str = this.mFailedRequestType;
            num = this.mLastHttpStatus;
        }
        return new C5792Dpb(num, ageMs(j, j3), ageMs(j, this.mLastManifestLoadSuccessTimeMs), ageMs(j, this.mLastMediaLoadSuccessTimeMs), ageMs(j, j2), str, this.mManifestLoadFailureCount, this.mVideoChunkLoadFailureCount, this.mAudioChunkLoadFailureCount, this.mVideoInitLoadFailureCount, this.mAudioInitLoadFailureCount, z);
    }

    @Override // X.InterfaceC6239Dyh
    public void onAudioTrackInitialized(C6518EAw c6518EAw) {
        AUDIO_TRACKS_ALLOCATED.incrementAndGet();
    }

    @Override // X.InterfaceC6239Dyh
    public void onAudioTrackReleased(C6518EAw c6518EAw) {
        if (this.mHeroPlayerSetting.gen.audio_track_retry_by_player_eviction_retry_count > 0) {
            AUDIO_TRACK_RELEASED.A02();
        }
        AUDIO_TRACKS_ALLOCATED.decrementAndGet();
    }

    public void onConsecutiveDroppedFrames(int i, long j) {
        if (this.mHeroPlayerSetting.gen.min_consecutive_dropped_frames_notification_threshold > 0) {
            AbstractC5718DoA.A01(this.mHeroServicePlayer, "onConsecutiveDroppedFrames count:%d, elapsedMs:%d", BV4.A1Y(Integer.valueOf(i), j));
            Dlw dlw = (Dlw) Dlw.A05(this).A02;
            if (i >= 4) {
                dlw.A2R++;
                if (i >= 12) {
                    dlw.A2U++;
                }
            }
        }
    }

    @Override // X.Du7
    public void onDownstreamFormatChanged(int i, Dy6 dy6, C5893Dra c5893Dra) {
        String str;
        C4904DDx c4904DDx;
        Uri uri;
        C6154Dwx c6154Dwx = c5893Dra.A05;
        C5723DoI parcelableFromFormat = getParcelableFromFormat(c6154Dwx);
        DmR dmR = this.mVideoPlayRequest;
        String strA00 = (dmR == null || (c4904DDx = dmR.A03) == null || (uri = c4904DDx.A08) == null) ? "" : AbstractC7385Etm.A00(uri, false);
        C5594DlX c5594DlXAEZ = ((Dlw) this.mHeroServicePlayer).A2j.A0H.AEZ();
        List<String> listA02 = c5594DlXAEZ != null ? c5594DlXAEZ.A02() : C3cG.A0h();
        if (c6154Dwx != null && (str = c6154Dwx.A0b) != null && str.contains("video/")) {
            if (!TextUtils.isEmpty(this.mVideoCodec) && !this.mVideoCodec.equals(str)) {
                ((Dlw) this.mHeroServicePlayer).A2z = true;
                if (this.mHeroPlayerSetting.enableMixeCodecManifestVideoCodecSwitchedLogging) {
                    Dlw.A05(this).AXQ("MIXED_CODEC_MANIFEST", "MIXED_CODEC_MANIFEST", FGI.A0d("Video codec switched from ", this.mVideoCodec, " to ", str));
                }
            }
            this.mVideoCodec = str;
        }
        Dlw dlw = (Dlw) this.mHeroServicePlayer;
        Trace.beginSection("HeroServicePlayer.onDownstreamFormatChange");
        try {
            Dlw.A0v(dlw, "onDownstreamFormatChange format=%s", c6154Dwx);
            Dlw.A0U(dlw.A0f, dlw, c6154Dwx, 39);
            Trace.endSection();
            Dlw dlw2 = (Dlw) this.mHeroServicePlayer;
            dlw2.A2A.ASd(parcelableFromFormat, strA00, listA02, dlw2.A2z);
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    @Override // X.InterfaceC6243Dym
    public void onDroppedFrames(int i, long j) {
        if (this.mHeroPlayerSetting.gen.dropped_frames_notification_threshold > 0) {
            AbstractC5718DoA.A01(this.mHeroServicePlayer, "onDroppedFrames count:%d, elapsedMs:%d", BV4.A1Y(Integer.valueOf(i), j));
        }
        Dlw dlw = (Dlw) Dlw.A05(this).A02;
        if (dlw.A0N > 0) {
            Dlw.A0U(dlw.A0f, dlw, BV4.A1Y(Integer.valueOf(i), j), 57);
        }
    }

    @Override // com.facebook.exoplayer.monitor.Dav1dDecoderEventListener
    public void onHdrFrameRendered() {
        Dlw dlw = (Dlw) this.mHeroServicePlayer;
        C5785DpT c5785DpT = dlw.A2C.loggerSDKConfig.gen;
        if (c5785DpT.enable_dropped_frames_metadata && c5785DpT.enable_hdr_frame_count_metadata) {
            dlw.A2H.incrementAndGet();
        }
    }

    public void onLiveTraceStreamInfo(String str, int i) {
        DEL del = this.mLiveTraceLogger;
        if (del != null) {
            if (str != null) {
                del.A05(this.mVideoPlayRequest.A03.A0Q, str, i);
            } else {
                del.A01 = null;
                del.A00 = 0;
            }
        }
    }

    @Override // X.Du7
    public void onLoadError(int i, Dy6 dy6, C5072DTn c5072DTn, C5893Dra c5893Dra, IOException iOException, boolean z) {
        int i2;
        C5622Dm5 c5622Dm5;
        int i3 = c5893Dra.A00;
        if (i3 == 4) {
            this.mLastManifestLoadException = iOException;
            DEZ dez = this.mManifestTransferEventTracker;
            if (dez != null) {
                dez.A01.AWi(iOException);
            }
            if (FailoverStreamDryException.A00(iOException) && this.mSurfaceMPDFailoverImmediately) {
                this.mHeroServicePlayer.Ab3(ExoPlaybackException.A00(iOException, 2000), EnumC5642DmW.A08);
            }
        } else {
            this.mLastLoadException = iOException;
        }
        if (!this.mIsImmediate403IssueReported && (iOException instanceof HttpDataSource$InvalidResponseCodeException) && ((HttpDataSource$InvalidResponseCodeException) iOException).responseCode == 403 && (i2 = c5893Dra.A02) != 3 && ((i3 == 1 || i3 == 2 || i3 == 4) && this.mHeroPlayerSetting.enableImmediate403UrlRefresh)) {
            this.mIsImmediate403IssueReported = true;
            InterfaceC5860Dqu interfaceC5860Dqu = this.mHeroServicePlayer;
            String strA0T = FGI.A0T("loadError 403 dataType=", " trackType=", i3, i2);
            Dlw dlw = (Dlw) interfaceC5860Dqu;
            if (!dlw.A2w && (c5622Dm5 = dlw.A2A) != null) {
                c5622Dm5.AXC(EnumC5642DmW.A0F.toString(), "RESPONSE_CODE_403", strA0T, null);
            }
        }
        if (this.mDisableTextRendererOn404LoadError && c5893Dra.A02 == 3 && i3 == 1 && (iOException instanceof HttpDataSource$InvalidResponseCodeException) && ((HttpDataSource$InvalidResponseCodeException) iOException).responseCode == 404) {
            this.mHeroServicePlayer.A9z(false);
        }
        if (this.mDisableTextRendererOn500LoadError && c5893Dra.A02 == 3 && i3 == 1 && (iOException instanceof HttpDataSource$InvalidResponseCodeException) && ((HttpDataSource$InvalidResponseCodeException) iOException).responseCode >= 500) {
            this.mHeroServicePlayer.A9z(false);
        }
        if (this.mDisableTextRendererOn404InitSegmentLoadError && c5893Dra.A02 == 3 && i3 == 2 && (iOException instanceof HttpDataSource$InvalidResponseCodeException) && ((HttpDataSource$InvalidResponseCodeException) iOException).responseCode == 404) {
            this.mHeroServicePlayer.A9z(false);
        }
        if (this.mDisableTextRendererOn500InitSegmentLoadError && c5893Dra.A02 == 3 && i3 == 2 && (iOException instanceof HttpDataSource$InvalidResponseCodeException) && ((HttpDataSource$InvalidResponseCodeException) iOException).responseCode >= 500) {
            this.mHeroServicePlayer.A9z(false);
        }
        if (!(iOException instanceof HttpDataSource$HttpDataSourceException) || iOException.getMessage() == null) {
            return;
        }
        String message = iOException.getMessage();
        EnumC5642DmW enumC5642DmW = EnumC5642DmW.A0B;
        if (!message.equals(enumC5642DmW.value) || this.mIsExpiredCdnUrlErrorReported) {
            return;
        }
        this.mIsExpiredCdnUrlErrorReported = true;
        this.mHeroServicePlayer.Ab3(ExoPlaybackException.A00(iOException, -2), enumC5642DmW);
    }

    public void onLoadRetry(int i, Dy6 dy6, C5072DTn c5072DTn, C5893Dra c5893Dra, IOException iOException, int i2, boolean z) {
        Object obj;
        Object obj2;
        Object obj3;
        C6154Dwx c6154Dwx;
        C1O c1o;
        String message = HatchCcvLoggingKt.NO_POSTAL_FIELD;
        if (this.mHeroPlayerSetting.disableTextEraLoggingOnLoadRetry && c5893Dra.A02 == 3) {
            return;
        }
        C5790DpZ c5790DpZ = new C5790DpZ();
        String str = "";
        try {
            c5790DpZ = this.mHeroServicePlayer.A7G(ExoPlaybackException.A00(iOException, 2000), EnumC5642DmW.A08);
            EnumC5624Dm7 enumC5624Dm7 = c5790DpZ.A02;
            if (enumC5624Dm7 != this.mLastRetryErrorCode) {
                this.mLastRetryErrorCode = enumC5624Dm7;
                this.mEraCurrentEventRepeatCount = 0;
            }
            if (this.mEraCurrentEventRepeatCount % this.mEraRepeatCountFlushThreshold == 0) {
                String string = (c5072DTn == null || (c1o = c5072DTn.A03) == null) ? HatchCcvLoggingKt.NO_POSTAL_FIELD : c1o.A06.toString();
                String strLocaleSafe = StringFormatUtil.formatStrLocaleSafe("%s:[%d;%d;%d][%d;%d;%s]", z ? "LoaderRetry" : "ContinueLoading", Integer.valueOf(this.mEraCurrentEventRepeatCount), Integer.valueOf(this.mEraLoaderEventSequenceNumber), Integer.valueOf(this.mEraRepeatCountFlushThreshold), Integer.valueOf(c5893Dra != null ? c5893Dra.A00 : 0), Integer.valueOf(c5893Dra != null ? c5893Dra.A02 : -1), (c5893Dra == null || (c6154Dwx = c5893Dra.A05) == null) ? HatchCcvLoggingKt.NO_POSTAL_FIELD : BV6.A0o(c6154Dwx));
                try {
                    Dlw.A05(this).AT6(c5790DpZ.A03.value, enumC5624Dm7.name(), c5790DpZ.A04, c5790DpZ.A05, string, strLocaleSafe, "");
                    str = strLocaleSafe;
                } catch (Exception e) {
                    e = e;
                    str = strLocaleSafe;
                    String strValueOf = String.valueOf(c5072DTn);
                    String strValueOf2 = String.valueOf(c5893Dra);
                    String strValueOf3 = c5893Dra != null ? String.valueOf(c5893Dra.A05) : HatchCcvLoggingKt.NO_POSTAL_FIELD;
                    if (c5790DpZ != null) {
                        obj = c5790DpZ.A02;
                        obj2 = c5790DpZ.A03;
                        obj3 = c5790DpZ.A04;
                    } else {
                        obj = HatchCcvLoggingKt.NO_POSTAL_FIELD;
                        obj2 = obj;
                        obj3 = obj;
                    }
                    if (iOException != null) {
                        message = iOException.getMessage();
                    }
                    AbstractC5718DoA.A00(this.mHeroServicePlayer, StringFormatUtil.formatStrLocaleSafe("onLoadRetry: caught exception, reason=%s, loadEventInfo=%s, mediaLoadData=%s, trackFormat=%s, errorCode=%s, errorDomain=%s, errorMsg=%s, IOException=%s", str, strValueOf, strValueOf2, strValueOf3, obj, obj2, obj3, message), e, new Object[0]);
                    return;
                }
            }
            this.mEraCurrentEventRepeatCount++;
            this.mEraLoaderEventSequenceNumber++;
        } catch (Exception e2) {
            e = e2;
        }
    }

    @Override // X.InterfaceC5369DhL
    public void onManifestLoadCompleted(C5893Dra c5893Dra, Object obj, Object obj2) {
        DEZ dez;
        String str;
        int i = c5893Dra.A00;
        if (i == 4 && (dez = this.mManifestTransferEventTracker) != null) {
            if (obj instanceof C5580Dky) {
                C5580Dky c5580Dky = (C5580Dky) obj;
                long[] jArrA03 = Dl2.A03(c5580Dky);
                DEZ dez2 = this.mManifestTransferEventTracker;
                long j = jArrA03[0];
                long j2 = jArrA03[1];
                long j3 = jArrA03[2];
                boolean z = c5580Dky.A0W;
                boolean z2 = c5580Dky.A0S;
                boolean z3 = c5580Dky.A0V;
                boolean z4 = c5580Dky.A0X;
                DEW dew = dez2.A01;
                dew.A0I = j;
                dew.A0J = j2;
                dew.A0K = j3;
                dew.A0r = z;
                dew.A0u = z2;
                dew.A0z = z3;
                dew.A0s = z4;
                dew.A03(dez2.A00);
                DEL del = this.mLiveTraceLogger;
                if (del != null && (str = c5580Dky.A0Q) != null) {
                    del.A05(this.mVideoPlayRequest.A03.A0Q, str, c5580Dky.A03);
                }
            } else {
                dez.A01.A03(dez.A00);
            }
        }
        if (this.mDisableTextTrackOnMissingTextAdaptationSet && i == 4 && (obj instanceof C5580Dky) && (obj2 instanceof C5580Dky)) {
            handleWebvttCaptionsOnManifestCompleted((C5580Dky) obj, (C5580Dky) obj2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0061  */
    @Override // X.InterfaceC6243Dym
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onRenderedFirstFrame(java.lang.Object r12, long r13) {
        /*
            r11 = this;
            boolean r0 = r12 instanceof android.view.Surface
            if (r0 == 0) goto L42
            android.view.Surface r12 = (android.view.Surface) r12
        L6:
            X.Dqu r10 = r11.mHeroServicePlayer
            X.Dlw r10 = (X.Dlw) r10
            X.DEK r0 = r10.A0n
            X.DtY r3 = new X.DtY
            r3.<init>(r0)
            X.DxG r2 = r11.mDecoderCounters
            r1 = 0
            if (r2 == 0) goto L40
            int r0 = r2.A07
            int r1 = r2.A08
        L1a:
            X.Ds4 r9 = new X.Ds4
            r9.<init>(r3, r0, r1)
            com.facebook.video.heroplayer.setting.HeroPlayerSetting r0 = r11.mHeroPlayerSetting
            boolean r0 = r0.enableVideoEffectsGrootSurfaceViewSupport
            if (r0 == 0) goto L27
            if (r12 == 0) goto L93
        L27:
            java.lang.String r4 = "HeroPlayer.videoFirstFrame"
            java.lang.String r1 = X.Dlw.A09(r10)
            if (r1 != 0) goto L32
            java.lang.String r1 = "unknown"
        L32:
            r3 = 2
            java.lang.String r0 = "videoId"
            java.lang.String[] r0 = new java.lang.String[]{r0, r1}
            r1 = 1
            com.facebook.systrace.Systrace.A08(r4, r0, r3, r1)
            goto L44
        L40:
            r0 = 0
            goto L1a
        L42:
            r12 = 0
            goto L6
        L44:
            r10.A0j = r12     // Catch: java.lang.Throwable -> L84
            com.facebook.video.heroplayer.setting.HeroPlayerSetting r0 = r10.A2C     // Catch: java.lang.Throwable -> L84
            X.Dlv r0 = r0.gen     // Catch: java.lang.Throwable -> L84
            boolean r0 = r0.resync_on_surface_restore_decoder_reinit     // Catch: java.lang.Throwable -> L84
            if (r0 == 0) goto L58
            android.os.Handler r3 = r10.A0f     // Catch: java.lang.Throwable -> L84
            X.Dsm r0 = new X.Dsm     // Catch: java.lang.Throwable -> L84
            r0.<init>()     // Catch: java.lang.Throwable -> L84
            r3.post(r0)     // Catch: java.lang.Throwable -> L84
        L58:
            if (r12 == 0) goto L61
            boolean r0 = r12.isValid()     // Catch: java.lang.Throwable -> L84
            r7 = 1
            if (r0 != 0) goto L62
        L61:
            r7 = 0
        L62:
            long r3 = r10.A0a     // Catch: java.lang.Throwable -> L84
            r5 = -1
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 == 0) goto L80
            if (r7 == 0) goto L80
            long r7 = X.Dlw.A01(r10)     // Catch: java.lang.Throwable -> L84
            long r3 = r10.A0a     // Catch: java.lang.Throwable -> L84
            long r7 = r7 - r3
            r10.A0J = r7     // Catch: java.lang.Throwable -> L84
            java.lang.Object[] r3 = X.BV4.A1X(r7)     // Catch: java.lang.Throwable -> L84
            java.lang.String r0 = "blackscreen detected for %d ms"
            X.AbstractC5718DoA.A01(r10, r0, r3)     // Catch: java.lang.Throwable -> L84
            r10.A0a = r5     // Catch: java.lang.Throwable -> L84
        L80:
            X.Dlw.A0i(r10)     // Catch: java.lang.Throwable -> L84
            goto L89
        L84:
            r0 = move-exception
            com.facebook.systrace.Systrace.A03(r1)
            throw r0
        L89:
            com.facebook.systrace.Systrace.A03(r1)
            X.Dm5 r0 = X.Dlw.A05(r11)
            r0.ASi(r9)
        L93:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.video.heroplayer.service.heroexoplayer2.HeroExoPlayer2EventListener.onRenderedFirstFrame(java.lang.Object, long):void");
    }

    @Override // com.facebook.exoplayer.monitor.Dav1dDecoderEventListener
    public void onRendererTypeChanged(C1b6 c1b6, EnumC2352BVb enumC2352BVb) {
        AtomicReference<C5994Dtb> atomicReference;
        C5994Dtb c5994Dtb;
        InterfaceC5860Dqu interfaceC5860Dqu = this.mHeroServicePlayer;
        C7384Etj.A0Y(enumC2352BVb, 0);
        ((Dlw) interfaceC5860Dqu).A2l = FGI.A0M(c1b6.logValue, enumC2352BVb.suffix);
        Dlw dlw = (Dlw) this.mHeroServicePlayer;
        do {
            atomicReference = dlw.A2I;
            C5994Dtb c5994Dtb2 = atomicReference.get();
            c5994Dtb2.getClass();
            c5994Dtb = c5994Dtb2;
        } while (!Bs8.A00(c5994Dtb, new C5994Dtb(c5994Dtb.A00), atomicReference));
    }

    public void onVideoCodecInitStart(String str) {
        Dlw dlw = (Dlw) this.mHeroServicePlayer;
        long jA02 = Dlw.A02(dlw, str);
        if (jA02 > 0) {
            dlw.A2o = str;
            Handler handler = dlw.A0f;
            Runnable runnable = dlw.A2D;
            handler.removeCallbacks(runnable);
            handler.postDelayed(runnable, jA02);
        }
        Dlw.A05(this).ASF(str, true);
    }

    @Override // X.InterfaceC6243Dym
    public void onVideoDecoderInitialized(String str, long j, long j2) {
        final Dlw dlw = (Dlw) this.mHeroServicePlayer;
        Dlw.A0j(dlw);
        if (dlw.A2C.gen.resync_on_surface_restore_decoder_reinit) {
            dlw.A0f.post(new Runnable() { // from class: X.Dpn
                public static final String __redex_internal_original_name = "HeroServicePlayer$$ExternalSyntheticLambda18";

                @Override // java.lang.Runnable
                public final void run() {
                    Dlw dlw2 = dlw;
                    if (dlw2.A1l) {
                        dlw2.A1l = false;
                        AbstractC5718DoA.A01(dlw2, "Resync seek after video decoder re-init on surface restore", new Object[0]);
                        Dlw.A04(dlw2).A00(dlw2.A1O() + 1);
                    }
                }
            });
        }
        Dlw.A05(this).ASV(str, true, j2);
        final Dlw dlw2 = (Dlw) this.mHeroServicePlayer;
        dlw2.A2p = str;
        dlw2.A2I.set(new C5994Dtb(str));
        if (Dlw.A1J(dlw2)) {
            Dlv dlv = dlw2.A2C.gen;
            if (dlv.dav1d_fallback_ready_stall_timeout_ms > 0 || dlv.dav1d_fallback_stuck_buffering_timeout_ms > 0) {
                dlw2.A0f.post(new Runnable() { // from class: X.DsE
                    public static final String __redex_internal_original_name = "HeroServicePlayer$$ExternalSyntheticLambda9";

                    @Override // java.lang.Runnable
                    public final void run() {
                        Dlw.A0m(dlw2);
                    }
                });
            }
        }
    }

    @Override // X.InterfaceC6243Dym
    public void onVideoDisabled(C6173DxG c6173DxG) {
        HeroPlayerSetting heroPlayerSetting = this.mHeroPlayerSetting;
        if (heroPlayerSetting == null || !heroPlayerSetting.gen.enable_ai_frc) {
            return;
        }
        int i = c6173DxG.A0C;
        int i2 = c6173DxG.A0B;
        int i3 = i - i2;
        AbstractC5718DoA.A01(this.mHeroServicePlayer, "AI FRC %s: renderedFrames=%d, inputFrames=%d, interpolatedFrames=%d", i3 > 0 ? "activated" : "not activated", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3));
    }

    @Override // X.InterfaceC6243Dym
    public void onVideoEnabled(C6173DxG c6173DxG) {
        this.mDecoderCounters = c6173DxG;
        Dlw dlw = (Dlw) this.mHeroServicePlayer;
        dlw.A2b = c6173DxG;
        C5594DlX c5594DlXAEZ = dlw.A2j.A0H.AEZ();
        if (c5594DlXAEZ != null) {
            c5594DlXAEZ.A00 = c6173DxG;
        }
    }

    public HeroExoPlayer2EventListener(InterfaceC5860Dqu interfaceC5860Dqu, DEL del, InterfaceC2361BVo interfaceC2361BVo, int i, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, HeroPlayerSetting heroPlayerSetting) {
        this.mHeroServicePlayer = interfaceC5860Dqu;
        this.mLiveTraceLogger = del;
        this.mLiveTraceFrameTracker = interfaceC2361BVo;
        this.mEraRepeatCountFlushThreshold = i <= 0 ? 5 : i;
        this.mDisableTextRendererOn404LoadError = z;
        this.mDisableTextRendererOn404InitSegmentLoadError = z2;
        this.mDisableTextRendererOn500InitSegmentLoadError = z4;
        this.mDisableTextRendererOn500LoadError = z3;
        this.mSurfaceMPDFailoverImmediately = z5;
        this.mDisableTextTrackOnMissingTextAdaptationSet = z6;
        this.mHeroPlayerSetting = heroPlayerSetting;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.AbstractCollection, java.util.ArrayList, java.util.List] */
    public static String getWebvttTextRepresentationLanguage(C5580Dky c5580Dky) {
        String str;
        ?? A01 = Dl2.A01(c5580Dky);
        if (A01 == 0 || A01.isEmpty() || (str = ((AbstractC5553DkW) C8j4.A0p(A01)).A03.A0a) == null) {
            return null;
        }
        return str;
    }

    public Du7 createLoadDiagnosticsEventListenerForCurrentGeneration() {
        return new C5747Doi(this, getLoadDiagnosticsGeneration());
    }

    public void handleBuffer(ByteBuffer byteBuffer) {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(byteBuffer.limit() - byteBuffer.position());
        byteBufferAllocate.put(byteBuffer);
        byteBufferAllocate.flip();
        Dlw.A05(this).AUK(byteBufferAllocate.array());
    }

    @Override // X.InterfaceC6239Dyh
    public /* synthetic */ void onAudioCodecError(Exception exc) {
    }

    public void onAudioCodecInitStart(String str) {
        Dlw.A05(this).ASF(str, false);
    }

    public void onAudioDataSummaryUpdated(int i) {
        Dlw.A05(this).ARl(i);
    }

    @Override // X.InterfaceC6239Dyh
    public void onAudioDecoderInitialized(String str, long j, long j2) {
        Dlw.A05(this).ASV(str, false, j2);
    }

    @Override // X.InterfaceC6239Dyh
    public /* synthetic */ void onAudioDecoderReleased(String str) {
    }

    @Override // X.InterfaceC6239Dyh
    public void onAudioDisabled(C6173DxG c6173DxG) {
    }

    @Override // X.InterfaceC6239Dyh
    public void onAudioEnabled(C6173DxG c6173DxG) {
    }

    @Override // X.InterfaceC6239Dyh
    public void onAudioInputFormatChanged(C6154Dwx c6154Dwx, C2461Bbo c2461Bbo) {
        Dlw.A05(this).ARq(getParcelableFromFormat(c6154Dwx));
    }

    @Override // X.InterfaceC6239Dyh
    public /* synthetic */ void onAudioPositionAdvancing(long j) {
    }

    public /* synthetic */ void onAudioSessionIdChanged(int i) {
    }

    @Override // X.InterfaceC6239Dyh
    public /* synthetic */ void onAudioSinkError(Exception exc) {
    }

    @Override // X.InterfaceC5369DhL
    public void onImfEventEmsgReceived(byte[] bArr, String str, long j) {
        Dlw.A05(this).onImfEventEmsgReceived(bArr, str, j);
    }

    public void onLiveEmsg(byte[] bArr, String str, long j, long j2) {
        Dlw.A05(this).ATq(bArr, str, j, j2);
    }

    public void onNewAudioData(byte[] bArr, long j) {
        Dlw.A05(this).AUI(bArr, j);
    }

    public void onProgressiveExtractorInitialized(EnumC7436Evw enumC7436Evw) {
    }

    @Override // X.InterfaceC6239Dyh
    public /* synthetic */ void onSkipSilenceEnabledChanged(boolean z) {
    }

    @Override // X.InterfaceC5564Dkh
    public void onTrackDurationUs(int i, int i2, long j) {
        long jA0B = Util.A0B(j);
        if (2 == i2) {
            Dlw dlw = (Dlw) this.mHeroServicePlayer;
            if (dlw.A2Z == -9223372036854775807L) {
                dlw.A2Z = jA0B;
                return;
            }
            return;
        }
        if (1 == i2) {
            Dlw dlw2 = (Dlw) this.mHeroServicePlayer;
            if (dlw2.A2V == -9223372036854775807L) {
                dlw2.A2V = jA0B;
            }
        }
    }

    @Override // X.InterfaceC5369DhL
    public void onTrackSelectionFallback(C6154Dwx c6154Dwx, C6154Dwx c6154Dwx2, String str, String str2, IOException iOException) {
        C5723DoI parcelableFromFormat = getParcelableFromFormat(c6154Dwx);
        C5723DoI parcelableFromFormat2 = getParcelableFromFormat(c6154Dwx2);
        C5594DlX c5594DlXAEZ = ((Dlw) this.mHeroServicePlayer).A2j.A0H.AEZ();
        List<String> listA02 = c5594DlXAEZ != null ? c5594DlXAEZ.A02() : C3cG.A0h();
        C5790DpZ c5790DpZA7G = this.mHeroServicePlayer.A7G(ExoPlaybackException.A00(iOException, 2000), EnumC5642DmW.A08);
        Dlw.A05(this).AWd(parcelableFromFormat, parcelableFromFormat2, str, str2, c5790DpZA7G.A03.value, c5790DpZA7G.A02.name(), c5790DpZA7G.A04, c5790DpZA7G.A05, listA02);
    }

    @Override // X.InterfaceC6243Dym
    public /* synthetic */ void onVideoCodecError(Exception exc) {
    }

    @Override // X.InterfaceC6243Dym
    public void onVideoDecoderReleased(String str) {
        Dlw.A05(this).ASG(str, true);
    }

    @Override // X.InterfaceC6243Dym
    public void onVideoSizeChanged(C6232Dya c6232Dya) {
        Dlw.A05(this).AXG(c6232Dya.A02, c6232Dya.A01, c6232Dya.A00);
    }

    public void setManifestTransferEventTracker(DEZ dez) {
        this.mManifestTransferEventTracker = dez;
    }

    public void setVideoPlayRequest(DmR dmR) {
        this.mVideoPlayRequest = dmR;
    }

    public /* synthetic */ void onLiveAvailableRangeChanged(long j, long j2) {
    }

    @Override // X.InterfaceC6243Dym
    public /* synthetic */ void onVideoFrameProcessingOffset(long j, int i) {
    }

    @Override // X.InterfaceC6243Dym
    public /* synthetic */ void onVideoInputFormatChanged(C6154Dwx c6154Dwx, C2461Bbo c2461Bbo) {
    }

    public static Long ageMs(long j, long j2) {
        if (j2 == -9223372036854775807L || j2 > j) {
            return null;
        }
        return Long.valueOf(j - j2);
    }

    public void flush(int i, int i2, int i3) {
    }

    @Override // X.InterfaceC6239Dyh
    public void onAudioUnderrun(int i, long j, long j2) {
    }

    @Override // X.Du7
    public void onUpstreamDiscarded(int i, Dy6 dy6, C5893Dra c5893Dra) {
    }

    public void onLiveTraceEventMessage(Uri uri, String str, Map<String, Object> map) throws JSONException {
        DEG deg;
        if (this.mLiveTraceLogger != null && this.mLiveTraceFrameTracker != null && uri != null) {
            if (MOQ_URI_SCHEME.equals(uri.getScheme())) {
                DEL del = this.mLiveTraceLogger;
                new C1O(uri, null, 0L, -1L);
                ((DEM) del).A01 = System.currentTimeMillis();
            }
            String string = uri.toString();
            String str2 = this.mVideoPlayRequest.A03.A0Q;
            InterfaceC2361BVo interfaceC2361BVo = this.mLiveTraceFrameTracker;
            String str3 = DEG.A0A;
            try {
                JSONArray jSONArray = new JSONArray(str);
                ArrayList arrayListA11 = C60O.A11(jSONArray.length());
                for (int i = 0; i < jSONArray.length(); i++) {
                    try {
                        JSONArray jSONArray2 = jSONArray.getJSONArray(i);
                        arrayListA11.add(new DED(jSONArray2.getLong(0), jSONArray2.getLong(1) * 1000));
                    } catch (NumberFormatException e) {
                        CNC.A06("LiveTrace", "Malformed live trace id/pts pair in JSON", e);
                    }
                }
                DED[] dedArr = (DED[]) arrayListA11.toArray(new DED[arrayListA11.size()]);
                String str4 = null;
                if (dedArr != null && dedArr.length != 0) {
                    long j = dedArr[0].A01;
                    BVj bVj = (BVj) interfaceC2361BVo;
                    synchronized (interfaceC2361BVo) {
                        PriorityQueue<C2358BVi> priorityQueue = bVj.A00;
                        Iterator<C2358BVi> it = priorityQueue.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                C2358BVi next = it.next();
                                deg = next.A02;
                                if (deg.A07[next.A00].A01 == j) {
                                    break;
                                }
                            } else {
                                synchronized (interfaceC2361BVo) {
                                    Iterator<C2358BVi> it2 = priorityQueue.iterator();
                                    while (it2.hasNext()) {
                                        deg = it2.next().A02;
                                        if (deg.A04 == null || !deg.equals(string)) {
                                        }
                                    }
                                }
                                deg = null;
                            }
                        }
                    }
                    String str5 = DEG.A08.get(string);
                    if (str5 == null) {
                        if (deg != null) {
                            str5 = deg.A02;
                            str4 = deg.A01;
                        } else {
                            str5 = null;
                        }
                    } else if (deg != null) {
                        str4 = deg.A01;
                    }
                    DEG deg2 = new DEG(string, str2, str5, str4, "SUCCESS", null, dedArr, System.currentTimeMillis());
                    DEL del2 = this.mLiveTraceLogger;
                    if (map == null) {
                        del2.A04(deg2, null);
                    } else {
                        del2.A04(deg2, map);
                    }
                }
            } catch (JSONException unused) {
            }
        }
    }
}
