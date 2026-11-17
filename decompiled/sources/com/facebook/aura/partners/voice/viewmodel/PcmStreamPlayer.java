package com.facebook.aura.partners.voice.viewmodel;

import X.AnonymousClass002;
import X.BV8;
import X.C3cG;
import X.C7384Etj;
import X.CFK;
import X.HtJ;
import X.HzP;
import android.media.AudioAttributes;
import android.media.AudioDeviceInfo;
import android.media.AudioFormat;
import android.media.AudioTrack;
import com.facebook.aura.composer.dictation.voyager.VoyagerAsrSession;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* loaded from: classes5.dex */
public final class PcmStreamPlayer {
    public static final int $stable = 8;
    public final AudioAttributes audioAttributes;
    public AudioTrack audioTrack;
    public long bytesWritten;
    public final Object lock;
    public boolean released;

    @DebugMetadata(c = "com.facebook.aura.partners.voice.viewmodel.PcmStreamPlayer", f = "PcmStreamPlayer.kt", l = {93}, m = "awaitPlaybackComplete", v = 2)
    /* renamed from: com.facebook.aura.partners.voice.viewmodel.PcmStreamPlayer$awaitPlaybackComplete$1, reason: invalid class name */
    public final class AnonymousClass1 extends HzP {
        public long J$0;
        public long J$1;
        public long J$2;
        public long J$3;
        public Object L$0;
        public int label;
        public /* synthetic */ Object result;

        public AnonymousClass1(HtJ<? super AnonymousClass1> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return PcmStreamPlayer.this.awaitPlaybackComplete(this);
        }
    }

    public PcmStreamPlayer(AudioAttributes audioAttributes) {
        C7384Etj.A0Y(audioAttributes, 0);
        this.audioAttributes = audioAttributes;
        this.lock = C3cG.A0T();
    }

    public final void writePcm(byte[] bArr) {
        C7384Etj.A0Y(bArr, 0);
        int length = bArr.length;
        if (length != 0) {
            synchronized (this.lock) {
                if (!this.released) {
                    AudioTrack audioTrackCreateTrack = this.audioTrack;
                    if (audioTrackCreateTrack == null) {
                        audioTrackCreateTrack = createTrack();
                        try {
                            audioTrackCreateTrack.play();
                            this.audioTrack = audioTrackCreateTrack;
                        } catch (IllegalStateException e) {
                            CFK.A0A(PcmStreamPlayerKt.TAG, "AudioTrack.play failed", e);
                            audioTrackCreateTrack.release();
                        }
                    }
                    try {
                        int iWrite = audioTrackCreateTrack.write(bArr, 0, length);
                        if (iWrite > 0) {
                            synchronized (this.lock) {
                                this.bytesWritten += iWrite;
                            }
                        }
                    } catch (IllegalStateException e2) {
                        CFK.A0A(PcmStreamPlayerKt.TAG, "writePcm failed", e2);
                    }
                }
            }
        }
    }

    private final AudioTrack createTrack() throws UnsupportedOperationException {
        int minBufferSize = AudioTrack.getMinBufferSize(24000, 4, 2);
        AudioTrack audioTrackBuild = new AudioTrack.Builder().setAudioAttributes(this.audioAttributes).setAudioFormat(BV8.A0S(new AudioFormat.Builder(), 24000, 4)).setBufferSizeInBytes(minBufferSize > 0 ? minBufferSize * 4 : 8192).setTransferMode(1).build();
        C7384Etj.A0U(audioTrackBuild);
        return audioTrackBuild;
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x0094  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object awaitPlaybackComplete(X.HtJ<? super kotlin.Unit> r18) {
        /*
            r17 = this;
            r3 = r18
            boolean r0 = r3 instanceof com.facebook.aura.partners.voice.viewmodel.PcmStreamPlayer.AnonymousClass1
            r13 = r17
            if (r0 == 0) goto L94
            r12 = r3
            com.facebook.aura.partners.voice.viewmodel.PcmStreamPlayer$awaitPlaybackComplete$1 r12 = (com.facebook.aura.partners.voice.viewmodel.PcmStreamPlayer.AnonymousClass1) r12
            int r2 = r12.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L94
            int r2 = r2 - r1
            r12.label = r2
        L16:
            java.lang.Object r1 = r12.result
            X.Hji r11 = X.EnumC10460Hji.A02
            int r0 = r12.label
            r10 = 1
            r17 = 0
            if (r0 == 0) goto L8c
            if (r0 != r10) goto La3
            long r8 = r12.J$1
            long r6 = r12.J$0
            X.Hwg.A00(r1)
        L2a:
            java.lang.Object r3 = r13.lock
            monitor-enter(r3)
            boolean r0 = r13.released     // Catch: java.lang.Throwable -> La0
            if (r0 == 0) goto L34
            kotlin.Unit r11 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> La0
            goto L9b
        L34:
            android.media.AudioTrack r2 = r13.audioTrack     // Catch: java.lang.Throwable -> La0
            monitor-exit(r3)
            if (r2 == 0) goto L68
            java.lang.Object r3 = r13.lock
            monitor-enter(r3)
            long r0 = r13.bytesWritten     // Catch: java.lang.Throwable -> La0
            monitor-exit(r3)
            long r4 = X.BV6.A0I(r0)
            int r0 = r2.getPlaybackHeadPosition()     // Catch: java.lang.IllegalStateException -> L9d
            long r2 = (long) r0     // Catch: java.lang.IllegalStateException -> L9d
            int r0 = (r4 > r17 ? 1 : (r4 == r17 ? 0 : -1))
            if (r0 == 0) goto L68
            goto L6b
        L4d:
            long r8 = r8 + r0
            r15 = 1000(0x3e8, double:4.94E-321)
            int r14 = (r8 > r15 ? 1 : (r8 == r15 ? 0 : -1))
            if (r14 < 0) goto L78
            java.lang.String r6 = "PcmStreamPlayer"
            java.lang.String r0 = "awaitPlaybackComplete: playback stalled at head="
            java.lang.String r1 = " target="
            java.lang.StringBuilder r0 = X.C3cG.A0g(r0)
            r0.append(r2)
            java.lang.String r0 = X.BV7.A0z(r1, r0, r4)
            X.CFK.A06(r6, r0)
        L68:
            kotlin.Unit r11 = kotlin.Unit.INSTANCE
            return r11
        L6b:
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 >= 0) goto L68
            r0 = 50
            int r14 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r14 <= 0) goto L4d
            r6 = r2
            r8 = 0
        L78:
            r14 = 0
            r12.L$0 = r14
            r12.J$0 = r6
            r12.J$1 = r8
            r12.J$2 = r4
            r12.J$3 = r2
            r12.label = r10
            java.lang.Object r0 = X.C7Bq.A01(r0, r12)
            if (r0 != r11) goto L2a
            return r11
        L8c:
            X.Hwg.A00(r1)
            r6 = -1
            r8 = 0
            goto L2a
        L94:
            com.facebook.aura.partners.voice.viewmodel.PcmStreamPlayer$awaitPlaybackComplete$1 r12 = new com.facebook.aura.partners.voice.viewmodel.PcmStreamPlayer$awaitPlaybackComplete$1
            r12.<init>(r3)
            goto L16
        L9b:
            monitor-exit(r3)
            return r11
        L9d:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        La0:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        La3:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.partners.voice.viewmodel.PcmStreamPlayer.awaitPlaybackComplete(X.HtJ):java.lang.Object");
    }

    public final VoicePreviewPlayerState diagnosticState$fbandroid_express_aura_java_com_facebook_aura_partners_voice_viewmodel_viewmodel() {
        AudioTrack audioTrack;
        Long lValueOf;
        Integer numValueOf;
        Boolean boolValueOf;
        AudioDeviceInfo routedDevice;
        synchronized (this.lock) {
            audioTrack = this.audioTrack;
            lValueOf = Long.valueOf(this.bytesWritten);
        }
        long jLongValue = (lValueOf.longValue() * 1000) / 48000;
        try {
            int usage = this.audioAttributes.getUsage();
            Long lValueOf2 = null;
            if (audioTrack == null || (routedDevice = audioTrack.getRoutedDevice()) == null) {
                numValueOf = null;
                if (audioTrack == null) {
                    boolValueOf = null;
                }
                return new VoicePreviewPlayerState(usage, numValueOf, boolValueOf, lValueOf2, Long.valueOf(jLongValue));
            }
            numValueOf = Integer.valueOf(routedDevice.getType());
            boolValueOf = Boolean.valueOf(AnonymousClass002.A1Q(audioTrack.getPlayState(), 3));
            lValueOf2 = Long.valueOf((audioTrack.getPlaybackHeadPosition() * 1000) / VoyagerAsrSession.OPUS_RELEASE_SLICE_BYTES);
            return new VoicePreviewPlayerState(usage, numValueOf, boolValueOf, lValueOf2, Long.valueOf(jLongValue));
        } catch (IllegalStateException unused) {
            return new VoicePreviewPlayerState(this.audioAttributes.getUsage(), null, null, null, Long.valueOf(jLongValue));
        }
    }

    public final void stop() {
        synchronized (this.lock) {
            if (this.released) {
                return;
            }
            this.released = true;
            AudioTrack audioTrack = this.audioTrack;
            this.audioTrack = null;
            if (audioTrack != null) {
                try {
                    audioTrack.pause();
                    audioTrack.flush();
                    audioTrack.stop();
                } catch (IllegalStateException e) {
                    CFK.A0A(PcmStreamPlayerKt.TAG, "stop failed", e);
                }
                audioTrack.release();
            }
        }
    }
}
