package com.facebook.aura.partners.voice.session.impl;

import X.AbstractC0886AGn;
import X.AbstractC7607F5u;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.BV4;
import X.C06H;
import X.C3cG;
import X.C3cI;
import X.C7384Etj;
import X.C9597GRd;
import X.CFK;
import X.GR9;
import X.GTS;
import X.GTU;
import X.HtJ;
import X.HzP;
import android.os.Process;
import com.facebook.aura.analytics.waterfall.HatchPriceImpressionEventDataKt;
import com.facebook.aura.executors.AuraExecutors;
import com.facebook.aura.executors.NameAndPriorityThreadFactory;
import com.facebook.aura.partners.voice.intf.VoiceCallAccessory;
import com.facebook.rsys.audio.frame.AudioFrameData;
import com.facebook.rsys.audio.frame.gen.AudioFrame;
import com.facebook.rsys.audio.frame.gen.AudioFrameMetadata;
import com.facebook.rsys.audio.gen.AudioApi;
import java.util.Arrays;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.maplibre.android.R;

/* loaded from: classes6.dex */
public final class AccessoryCallDelegate implements GTS {
    public static final Companion Companion = new Companion();

    @Deprecated
    public static final int MAX_CARRIED_FRAMES = 10;

    @Deprecated
    public static final int POLL_AUDIO_MODE = 2;

    @Deprecated
    public static final int POLL_FRAME_SAMPLES = 960;

    @Deprecated
    public static final long POLL_INTERVAL_MS = 20;

    @Deprecated
    public static final int POLL_SAMPLE_RATE = 48000;

    @Deprecated
    public static final String POLL_THREAD_NAME = "AccessoryAudio";

    @Deprecated
    public static final String TAG = "AccessoryCallDelegate";
    public String activeCallId;
    public Binding binding;
    public final GTS delegate;
    public final Object lock;
    public volatile boolean micOpen;
    public volatile VoiceCallAccessory nextAccessory;
    public ScheduledExecutorService poller;

    public final class Binding {
        public final AudioApi api;
        public final String localCallId;
        public int micRateHz;
        public int micRejects;
        public short[] micRemainder;
        public final ScheduledFuture<?> polling;

        public Binding(String str, AudioApi audioApi, ScheduledFuture<?> scheduledFuture) {
            AnonymousClass005.A10(str, audioApi, scheduledFuture);
            this.localCallId = str;
            this.api = audioApi;
            this.polling = scheduledFuture;
            this.micRemainder = new short[0];
        }

        public final void setMicRemainder(short[] sArr) {
            C7384Etj.A0Y(sArr, 0);
            this.micRemainder = sArr;
        }

        public final AudioApi getApi() {
            return this.api;
        }

        public final String getLocalCallId() {
            return this.localCallId;
        }

        public final int getMicRateHz() {
            return this.micRateHz;
        }

        public final int getMicRejects() {
            return this.micRejects;
        }

        public final short[] getMicRemainder() {
            return this.micRemainder;
        }

        public final ScheduledFuture<?> getPolling() {
            return this.polling;
        }

        public final void setMicRateHz(int i) {
            this.micRateHz = i;
        }

        public final void setMicRejects(int i) {
            this.micRejects = i;
        }
    }

    @DebugMetadata(c = "com.facebook.aura.partners.voice.session.impl.AccessoryCallDelegate", f = "AccessoryCallDelegate.kt", l = {R.styleable.maplibre_MapView_maplibre_uiLogoMarginLeft, 53}, m = "startSession", v = 2)
    /* renamed from: com.facebook.aura.partners.voice.session.impl.AccessoryCallDelegate$startSession$1, reason: invalid class name and case insensitive filesystem */
    public final class C132271 extends HzP {
        public Object L$0;
        public Object L$1;
        public int label;
        public /* synthetic */ Object result;

        public C132271(HtJ<? super C132271> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AccessoryCallDelegate.this.startSession(null, this);
        }
    }

    public AccessoryCallDelegate(GTS gts) {
        C7384Etj.A0Y(gts, 0);
        this.delegate = gts;
        this.micOpen = true;
        this.lock = C3cG.A0T();
    }

    private final void keepUndelivered(Binding binding, short[] sArr, int i, int i2) {
        int length = sArr.length;
        int iA0D = AbstractC7607F5u.A0D(length, i2 * 10, i);
        synchronized (this.lock) {
            if (this.binding == binding) {
                AbstractC0886AGn.A01(length, length);
                short[] sArrCopyOfRange = Arrays.copyOfRange(sArr, iA0D, length);
                C7384Etj.A0U(sArrCopyOfRange);
                binding.micRemainder = sArrCopyOfRange;
            }
        }
    }

    public final void close() {
        ScheduledExecutorService scheduledExecutorService;
        unbind(null);
        synchronized (this.lock) {
            scheduledExecutorService = this.poller;
            this.poller = null;
        }
        if (scheduledExecutorService != null) {
            scheduledExecutorService.shutdownNow();
        }
    }

    public final boolean pushMicrophone(short[] sArr, int i) {
        boolean zA1Z;
        C7384Etj.A0Y(sArr, 0);
        int i2 = i / 100;
        if (i2 > 0) {
            boolean z = this.micOpen;
            synchronized (this.lock) {
                if (!z) {
                    Binding binding = this.binding;
                    if (binding != null) {
                        binding.micRemainder = new short[0];
                    }
                    return true;
                }
                Binding binding2 = this.binding;
                if (binding2 == null) {
                    return false;
                }
                short[] sArr2 = binding2.micRateHz == i ? binding2.micRemainder : new short[0];
                C7384Etj.A0Y(sArr2, 0);
                int length = sArr2.length;
                int length2 = sArr.length;
                short[] sArrCopyOf = Arrays.copyOf(sArr2, length + length2);
                System.arraycopy(sArr, 0, sArrCopyOf, length, length2);
                C7384Etj.A0X(sArrCopyOf);
                int length3 = sArrCopyOf.length;
                int i3 = length3 - (length3 % i2);
                AbstractC0886AGn.A01(length3, length3);
                short[] sArrCopyOfRange = Arrays.copyOfRange(sArrCopyOf, i3, length3);
                C7384Etj.A0U(sArrCopyOfRange);
                binding2.micRemainder = sArrCopyOfRange;
                binding2.micRateHz = i;
                int i4 = 0;
                while (i4 < i3) {
                    synchronized (this.lock) {
                        zA1Z = AnonymousClass006.A1Z(this.binding, binding2);
                    }
                    if (!zA1Z) {
                        AudioFrameData audioFrameData = AudioFrameData.$redex_init_class;
                        int i5 = i4 + i2;
                        AbstractC0886AGn.A01(i5, length3);
                        short[] sArrCopyOfRange2 = Arrays.copyOfRange(sArrCopyOf, i4, i5);
                        C7384Etj.A0U(sArrCopyOfRange2);
                        AudioFrameData audioFrameData2 = new AudioFrameData(sArrCopyOfRange2);
                        try {
                            try {
                                binding2.api.handleFrame(AudioFrame.CProxy.createFrame(audioFrameData2, new AudioFrameMetadata(i, 1, i2, false, null)));
                                audioFrameData2.releaseAndSyncFromNative();
                                i4 = i5;
                            } catch (RuntimeException e) {
                                int i6 = binding2.micRejects;
                                binding2.micRejects = i6 + 1;
                                if (i6 == 0) {
                                    CFK.A0A(TAG, "Accessory microphone frame rejected", e);
                                }
                                keepUndelivered(binding2, sArrCopyOf, i4, i2);
                                audioFrameData2.releaseAndSyncFromNative();
                                return false;
                            }
                        } catch (Throwable th) {
                            audioFrameData2.releaseAndSyncFromNative();
                            throw th;
                        }
                    }
                }
                binding2.micRejects = 0;
                return true;
            }
        }
        return false;
    }

    public final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(C06H c06h) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void bind(String str, GR9 gr9, final VoiceCallAccessory voiceCallAccessory) {
        ScheduledFuture<?> scheduledFuture;
        synchronized (this.lock) {
            if (C7384Etj.areEqual(this.activeCallId, str)) {
                Binding bindingReleaseBindingLocked = releaseBindingLocked(null);
                if (bindingReleaseBindingLocked != null && (scheduledFuture = bindingReleaseBindingLocked.polling) != null) {
                    scheduledFuture.cancel(false);
                }
                if (((C9597GRd) gr9).A01) {
                    return;
                }
                final AudioApi audioApi = (AudioApi) gr9.ACQ(AudioApi.CONVERTER);
                if (audioApi == null) {
                    CFK.A06(TAG, "No audio API for the accessory call");
                    return;
                }
                final AtomicBoolean atomicBooleanA12 = BV4.A12(false);
                synchronized (this.lock) {
                    if (!C7384Etj.areEqual(this.activeCallId, str)) {
                        CFK.A0H(TAG, "Accessory call %s ended before it was ready", str);
                        return;
                    }
                    ScheduledFuture<?> scheduledFutureScheduleAtFixedRate = pollerLocked().scheduleAtFixedRate(new Runnable() { // from class: com.facebook.aura.partners.voice.session.impl.AccessoryCallDelegate$bind$2$polling$1
                        @Override // java.lang.Runnable
                        public final void run() {
                            if (this.this$0.isBound(audioApi)) {
                                this.this$0.pollAssistant(audioApi, voiceCallAccessory, atomicBooleanA12);
                            }
                        }
                    }, 0L, 20L, TimeUnit.MILLISECONDS);
                    C7384Etj.A0X(scheduledFutureScheduleAtFixedRate);
                    this.binding = new Binding(str, audioApi, scheduledFutureScheduleAtFixedRate);
                    CFK.A03(str, TAG, "Accessory audio bound for call %s");
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isBound(AudioApi audioApi) {
        boolean zA1Z;
        synchronized (this.lock) {
            Binding binding = this.binding;
            zA1Z = AnonymousClass002.A1Z(binding != null ? binding.api : null, audioApi);
        }
        return zA1Z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void pollAssistant(AudioApi audioApi, VoiceCallAccessory voiceCallAccessory, AtomicBoolean atomicBoolean) {
        try {
            AudioFrame audioFrame = audioApi.getAudioFrame(HatchPriceImpressionEventDataKt.NO_DISCOUNT, 9, 48000, 960);
            if (audioFrame != null) {
                deliver(audioFrame, voiceCallAccessory);
            }
        } catch (RuntimeException e) {
            if (C3cI.A1W(atomicBoolean)) {
                CFK.A0K(TAG, e, "Polling the assistant audio failed");
            }
        }
    }

    private final ScheduledExecutorService pollerLocked() {
        ScheduledExecutorService scheduledExecutorService = this.poller;
        if (scheduledExecutorService != null) {
            return scheduledExecutorService;
        }
        ScheduledExecutorService scheduledExecutorServiceNewSingleThreadScheduledExecutor = AuraExecutors.INSTANCE.newSingleThreadScheduledExecutor(POLL_THREAD_NAME, new NameAndPriorityThreadFactory.ThreadInstanceCreator() { // from class: com.facebook.aura.partners.voice.session.impl.AccessoryCallDelegate.pollerLocked.1
            @Override // com.facebook.aura.executors.NameAndPriorityThreadFactory.ThreadInstanceCreator
            public final Thread createThreadInstance(final Runnable runnable, String str) {
                AnonymousClass003.A0u(runnable, str);
                return new Thread(new Runnable() { // from class: com.facebook.aura.partners.voice.session.impl.AccessoryCallDelegate.pollerLocked.1.1
                    @Override // java.lang.Runnable
                    public final void run() throws SecurityException, IllegalArgumentException {
                        Process.setThreadPriority(-19);
                        runnable.run();
                    }
                }, str);
            }
        });
        this.poller = scheduledExecutorServiceNewSingleThreadScheduledExecutor;
        return scheduledExecutorServiceNewSingleThreadScheduledExecutor;
    }

    private final Binding releaseBindingLocked(String str) {
        Binding binding = this.binding;
        if (binding == null || !(str == null || str.equals(binding.localCallId))) {
            return null;
        }
        this.binding = null;
        return binding;
    }

    public static /* synthetic */ Binding releaseBindingLocked$default(AccessoryCallDelegate accessoryCallDelegate, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        return accessoryCallDelegate.releaseBindingLocked(str);
    }

    public static /* synthetic */ void unbind$default(AccessoryCallDelegate accessoryCallDelegate, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        accessoryCallDelegate.unbind(str);
    }

    @Override // X.GTS
    public GTU getAppConfig() {
        return this.delegate.getAppConfig();
    }

    public final boolean getMicOpen() {
        return this.micOpen;
    }

    public final VoiceCallAccessory getNextAccessory() {
        return this.nextAccessory;
    }

    public final void setMicOpen(boolean z) {
        this.micOpen = z;
    }

    public final void setNextAccessory(VoiceCallAccessory voiceCallAccessory) {
        this.nextAccessory = voiceCallAccessory;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x00fe, code lost:
    
        if (r1 == r12) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x002c  */
    @Override // X.GTS
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object startSession(X.GTH r40, X.HtJ<? super X.GR9> r41) {
        /*
            Method dump skipped, instructions count: 280
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.partners.voice.session.impl.AccessoryCallDelegate.startSession(X.GTH, X.HtJ):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x000d A[Catch: all -> 0x0020, TryCatch #0 {, blocks: (B:5:0x0005, B:8:0x0010, B:7:0x000d), top: B:18:0x0005 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void unbind(java.lang.String r3) {
        /*
            r2 = this;
            java.lang.Object r1 = r2.lock
            monitor-enter(r1)
            if (r3 == 0) goto Ld
            java.lang.String r0 = r2.activeCallId     // Catch: java.lang.Throwable -> L20
            boolean r0 = r3.equals(r0)     // Catch: java.lang.Throwable -> L20
            if (r0 == 0) goto L10
        Ld:
            r0 = 0
            r2.activeCallId = r0     // Catch: java.lang.Throwable -> L20
        L10:
            com.facebook.aura.partners.voice.session.impl.AccessoryCallDelegate$Binding r0 = r2.releaseBindingLocked(r3)     // Catch: java.lang.Throwable -> L20
            monitor-exit(r1)
            if (r0 == 0) goto L1f
            java.util.concurrent.ScheduledFuture<?> r1 = r0.polling
            if (r1 == 0) goto L1f
            r0 = 0
            r1.cancel(r0)
        L1f:
            return
        L20:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.partners.voice.session.impl.AccessoryCallDelegate.unbind(java.lang.String):void");
    }

    private final void deliver(AudioFrame audioFrame, VoiceCallAccessory voiceCallAccessory) {
        AudioFrameMetadata metadata = audioFrame.getMetadata();
        C7384Etj.A0U(metadata);
        int numberOfSamples = metadata.getNumberOfSamples() * metadata.getNumberOfChannels();
        if (numberOfSamples > 0) {
            short[] audioData = audioFrame.getAudioData().getAudioData(numberOfSamples);
            C7384Etj.A0U(audioData);
            voiceCallAccessory.onAssistantAudio(audioData, metadata.getSampleRate(), metadata.getNumberOfChannels());
        }
    }
}
