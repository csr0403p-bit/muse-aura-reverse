package com.facebook.aura.partners.voice.api;

import X.AGH;
import X.AII;
import X.AIM;
import X.AbstractC07127nr;
import X.AbstractC0903AHf;
import X.AbstractC3358CGz;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.C06H;
import X.C10550Hrx;
import X.C27k;
import X.C3UX;
import X.C3cG;
import X.C3cH;
import X.C60N;
import X.C60O;
import X.C7384Etj;
import X.C8j3;
import X.C9258GBl;
import X.CFK;
import X.CH0;
import X.DCl;
import X.EnumC10460Hji;
import X.FGI;
import X.G0U;
import X.G0V;
import X.GAX;
import X.HtJ;
import X.Hwg;
import X.HxE;
import X.Hxb;
import X.HzP;
import X.InterfaceC10560Hsz;
import X.InterfaceC2261BLa;
import com.facebook.aura.commands.photos.PhotosSearchHandlerKt;
import com.facebook.aura.gateway.store.HatchGatewayPrefsStore;
import com.facebook.aura.iap.MC;
import com.facebook.aura.json.HatchJsonKt;
import com.facebook.aura.network.http.HatchHttpApi;
import com.facebook.aura.network.http.RequestType;
import com.facebook.aura.network.state.NoNetworkException;
import com.facebook.aura.network.transport.HatchAuthScheme;
import com.facebook.aura.network.transport.HatchHttpClient;
import com.facebook.aura.network.transport.HatchHttpResponse;
import com.facebook.aura.network.transport.HatchTransport;
import com.facebook.aura.partners.voice.api.VoiceJarvisPath;
import com.facebook.aura.partners.voice.gating.VoiceGating;
import com.facebook.aura.utils.MC;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Function;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final class VoiceCatalogRepository {
    public static final int $stable = 8;
    public static final long CALL_PREVIEW_TIMEOUT_SECONDS = 45;
    public static final long CATALOG_CACHE_TTL_MS = 300000;
    public static final int CATALOG_PAGE_SIZE = 20;
    public static final int DESIGNED_PREVIEW_SAMPLE_RATE_HZ = 24000;
    public static final int PREFETCH_AUDIO_MAX_BYTES = 131072;
    public static final long PREFETCH_RESPONSE_MAX_BYTES = 196608;
    public static final int PREVIEW_AUDIO_MAX_BYTES = 1048576;
    public static final long PREVIEW_DOWNLOAD_TIMEOUT_MS = 30000;
    public static final long PREVIEW_RESPONSE_MAX_BYTES = 2097152;
    public static final long TTS_FIRST_BYTE_TIMEOUT_MS = 20000;
    public static final long TTS_SECOND_REQUEST_AFTER_MS = 3000;
    public static final String TTS_STREAM_URL = "https://api.meta.ai/proton/hatch/voice/tts/stream";
    public static final long VM_FIRST_AUDIO_TIMEOUT_MS = 5000;
    public final HatchHttpClient metaHttpClient = HatchTransport.INSTANCE.httpClient(HatchAuthScheme.META_BEARER);
    public static final Companion Companion = new Companion();
    public static final ConcurrentHashMap<String, CachedCatalog> catalogCache = C60O.A1C();
    public static final ConcurrentHashMap<String, InterfaceC2261BLa> catalogFetchMutexes = C60O.A1C();
    public static final ConcurrentHashMap<String, CurrentVoiceOverride> currentVoiceOverrides = C60O.A1C();

    public final class Companion {
        /* JADX INFO: Access modifiers changed from: private */
        public final String cacheKey(AbstractC3358CGz abstractC3358CGz) {
            return FGI.A0U(((CH0) abstractC3358CGz).A01, "|", C3cH.A0a(HatchGatewayPrefsStore.Companion, abstractC3358CGz));
        }

        public final void invalidateCatalog(AbstractC3358CGz abstractC3358CGz) {
            C7384Etj.A0Y(abstractC3358CGz, 0);
            VoiceCatalogRepository.catalogCache.remove(cacheKey(abstractC3358CGz));
        }

        public final void invalidateForCurrentVm(AbstractC3358CGz abstractC3358CGz) {
            C7384Etj.A0Y(abstractC3358CGz, 0);
            String strCacheKey = cacheKey(abstractC3358CGz);
            VoiceCatalogRepository.catalogCache.remove(strCacheKey);
            VoiceCatalogRepository.currentVoiceOverrides.remove(strCacheKey);
            VoicePreviewCache.Companion.getInstance(abstractC3358CGz).invalidate();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final InterfaceC2261BLa catalogFetchMutex(String str) {
            InterfaceC2261BLa interfaceC2261BLaComputeIfAbsent = VoiceCatalogRepository.catalogFetchMutexes.computeIfAbsent(str, new Function() { // from class: com.facebook.aura.partners.voice.api.VoiceCatalogRepository$Companion$catalogFetchMutex$1
                public final InterfaceC2261BLa apply(String str2) {
                    return new C9258GBl();
                }

                @Override // java.util.function.Function
                public /* bridge */ /* synthetic */ Object apply(Object obj) {
                    return new C9258GBl();
                }
            });
            C7384Etj.A0U(interfaceC2261BLaComputeIfAbsent);
            return interfaceC2261BLaComputeIfAbsent;
        }

        public final void clearForSignOut() {
            VoiceCatalogRepository.catalogCache.clear();
            VoiceCatalogRepository.currentVoiceOverrides.clear();
        }

        public final void updateCurrentVoice(AbstractC3358CGz abstractC3358CGz, String str) {
            AnonymousClass003.A0u(abstractC3358CGz, str);
            VoiceCatalogRepository.currentVoiceOverrides.put(cacheKey(abstractC3358CGz), new CurrentVoiceOverride(str, System.currentTimeMillis()));
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    /* loaded from: classes3.dex */
    public interface PreviewLookup {

        public final class Failed implements PreviewLookup {
            public static final int $stable = 0;
            public static final Failed INSTANCE = new Failed();

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof Failed);
            }

            public String toString() {
                return "Failed";
            }

            public int hashCode() {
                return 620749699;
            }
        }

        public final class Hit implements PreviewLookup {
            public static final int $stable = 8;
            public final byte[] audio;

            public Hit(byte[] bArr) {
                C7384Etj.A0Y(bArr, 0);
                this.audio = bArr;
            }

            public final byte[] getAudio() {
                return this.audio;
            }
        }

        public final class Invalidated implements PreviewLookup {
            public static final int $stable = 0;
            public static final Invalidated INSTANCE = new Invalidated();

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof Invalidated);
            }

            public String toString() {
                return "Invalidated";
            }

            public int hashCode() {
                return 364462851;
            }
        }

        public final class Miss implements PreviewLookup {
            public static final int $stable = 0;
            public static final Miss INSTANCE = new Miss();

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof Miss);
            }

            public String toString() {
                return "Miss";
            }

            public int hashCode() {
                return -401371710;
            }
        }
    }

    @DebugMetadata(c = "com.facebook.aura.partners.voice.api.VoiceCatalogRepository", f = "VoiceCatalogRepository.kt", l = {854}, m = "fetchAndCacheAvailableVoices", v = 2)
    /* renamed from: com.facebook.aura.partners.voice.api.VoiceCatalogRepository$fetchAndCacheAvailableVoices$1, reason: invalid class name */
    public final class AnonymousClass1 extends HzP {
        public int I$0;
        public int I$1;
        public int I$2;
        public long J$0;
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public Object L$4;
        public Object L$5;
        public Object L$6;
        public Object L$7;
        public Object L$8;
        public int label;
        public /* synthetic */ Object result;

        public AnonymousClass1(HtJ<? super AnonymousClass1> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return VoiceCatalogRepository.this.fetchAndCacheAvailableVoices(null, null, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.partners.voice.api.VoiceCatalogRepository", f = "VoiceCatalogRepository.kt", l = {844, 72}, m = "fetchAvailableVoices", v = 2)
    /* renamed from: com.facebook.aura.partners.voice.api.VoiceCatalogRepository$fetchAvailableVoices$1, reason: invalid class name and case insensitive filesystem */
    public final class C130401 extends HzP {
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public int label;
        public /* synthetic */ Object result;

        public C130401(HtJ<? super C130401> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return VoiceCatalogRepository.this.fetchAvailableVoices(null, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.partners.voice.api.VoiceCatalogRepository$fetchDesignedPreviewAudio$2", f = "VoiceCatalogRepository.kt", l = {840}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.partners.voice.api.VoiceCatalogRepository$fetchDesignedPreviewAudio$2, reason: invalid class name and case insensitive filesystem */
    /* loaded from: classes2.dex */
    public final class C130412 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super byte[]>, Object> {
        public final /* synthetic */ String $text;
        public final /* synthetic */ AbstractC3358CGz $userSession;
        public final /* synthetic */ String $voiceId;
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public Object L$4;
        public Object L$5;
        public Object L$6;
        public Object L$7;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C130412(String str, String str2, AbstractC3358CGz abstractC3358CGz, HtJ<? super C130412> htJ) {
            super(2, htJ);
            this.$text = str;
            this.$voiceId = str2;
            this.$userSession = abstractC3358CGz;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new C130412(this.$text, this.$voiceId, this.$userSession, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            Pcm16WavSink pcm16WavSink;
            Object objMakeJarvisHttpRequestStreamingInternal = obj;
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            try {
                if (i == 0) {
                    Hwg.A00(objMakeJarvisHttpRequestStreamingInternal);
                    pcm16WavSink = new Pcm16WavSink(2097152L);
                    HatchHttpApi hatchHttpApi = HatchHttpApi.INSTANCE;
                    VoiceJarvisPath.VoiceSpeak voiceSpeak = VoiceJarvisPath.VoiceSpeak.INSTANCE;
                    DesignedVoiceSpeakRequestJson designedVoiceSpeakRequestJson = new DesignedVoiceSpeakRequestJson(this.$text, this.$voiceId, "pcm16", "designed");
                    RequestType requestType = RequestType.POST;
                    AbstractC3358CGz abstractC3358CGz = this.$userSession;
                    Long lA0S = C3cG.A0S(30L);
                    this.L$0 = pcm16WavSink;
                    this.L$1 = null;
                    this.L$2 = null;
                    this.L$3 = null;
                    this.L$4 = null;
                    this.L$5 = null;
                    this.L$6 = null;
                    this.L$7 = null;
                    this.label = 1;
                    objMakeJarvisHttpRequestStreamingInternal = hatchHttpApi.makeJarvisHttpRequestStreamingInternal(voiceSpeak, HatchJsonKt.HatchJson.A02(designedVoiceSpeakRequestJson, DesignedVoiceSpeakRequestJson$$serializer.INSTANCE), pcm16WavSink, requestType, abstractC3358CGz, lA0S, AGH.A0E(), new HxE[0], null, false, true, null, this);
                    if (objMakeJarvisHttpRequestStreamingInternal == enumC10460Hji) {
                        return enumC10460Hji;
                    }
                } else {
                    if (i != 1) {
                        throw AnonymousClass001.A0n();
                    }
                    pcm16WavSink = (Pcm16WavSink) this.L$0;
                    Hwg.A00(objMakeJarvisHttpRequestStreamingInternal);
                }
                HatchHttpResponse hatchHttpResponse = (HatchHttpResponse) objMakeJarvisHttpRequestStreamingInternal;
                if (hatchHttpResponse == null || !hatchHttpResponse.isSuccessful) {
                    CFK.A0H(VoiceCatalogRepositoryKt.TAG, "fetchDesignedPreviewAudio failed: code=%s", hatchHttpResponse != null ? C3cG.A0R(hatchHttpResponse.statusCode) : null);
                    return null;
                }
                byte[] wav = pcm16WavSink.toWav(24000);
                if (wav != null) {
                    return wav;
                }
                CFK.A0H(VoiceCatalogRepositoryKt.TAG, "fetchDesignedPreviewAudio: invalid PCM length=%s", C3cG.A0R(pcm16WavSink.pcmSize()));
                return wav;
            } catch (CancellationException e) {
                throw e;
            } catch (Exception e2) {
                CFK.A0A(VoiceCatalogRepositoryKt.TAG, "fetchDesignedPreviewAudio error", e2);
                return null;
            }
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super byte[]> htJ) {
            return ((C130412) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.partners.voice.api.VoiceCatalogRepository", f = "VoiceCatalogRepository.kt", l = {878}, m = "speakPreviewOnCall", v = 2)
    /* renamed from: com.facebook.aura.partners.voice.api.VoiceCatalogRepository$speakPreviewOnCall$1, reason: invalid class name and case insensitive filesystem */
    public final class C130421 extends HzP {
        public int I$0;
        public int I$1;
        public int I$2;
        public int I$3;
        public int I$4;
        public int I$5;
        public int I$6;
        public Object L$0;
        public Object L$1;
        public Object L$10;
        public Object L$11;
        public Object L$2;
        public Object L$3;
        public Object L$4;
        public Object L$5;
        public Object L$6;
        public Object L$7;
        public Object L$8;
        public Object L$9;
        public int label;
        public /* synthetic */ Object result;

        public C130421(HtJ<? super C130421> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return VoiceCatalogRepository.this.speakPreviewOnCall(null, null, null, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.partners.voice.api.VoiceCatalogRepository", f = "VoiceCatalogRepository.kt", l = {398, MC.stella_payments_in_app_purchases.__CONFIG__, 405}, m = "streamPreviewAudio", v = 2)
    /* renamed from: com.facebook.aura.partners.voice.api.VoiceCatalogRepository$streamPreviewAudio$1, reason: invalid class name and case insensitive filesystem */
    public final class C130431 extends HzP {
        public long J$0;
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public Object L$4;
        public Object L$5;
        public Object L$6;
        public Object L$7;
        public Object L$8;
        public Object L$9;
        public int label;
        public /* synthetic */ Object result;

        public C130431(HtJ<? super C130431> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return VoiceCatalogRepository.this.streamPreviewAudio(null, null, null, null, null, null, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.partners.voice.api.VoiceCatalogRepository$streamPreviewPcm$2", f = "VoiceCatalogRepository.kt", l = {557, MC.hatch_android_reactions.__CONFIG__, 583, 585}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.partners.voice.api.VoiceCatalogRepository$streamPreviewPcm$2, reason: invalid class name and case insensitive filesystem */
    /* loaded from: classes2.dex */
    public final class C130442 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Boolean>, Object> {
        public final /* synthetic */ PreviewStreamDiagnostics $diagnostics;
        public final /* synthetic */ G0U<byte[], Unit> $onPcmChunk;
        public final /* synthetic */ String $text;
        public final /* synthetic */ String $voiceId;
        public /* synthetic */ Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public Object L$4;
        public Object L$5;
        public int label;
        public final /* synthetic */ VoiceCatalogRepository this$0;

        @DebugMetadata(c = "com.facebook.aura.partners.voice.api.VoiceCatalogRepository$streamPreviewPcm$2$1", f = "VoiceCatalogRepository.kt", l = {557}, m = "invokeSuspend", v = 2)
        /* renamed from: com.facebook.aura.partners.voice.api.VoiceCatalogRepository$streamPreviewPcm$2$1, reason: invalid class name */
        public final class AnonymousClass1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
            public final /* synthetic */ InterfaceC10560Hsz<Integer> $winner;
            public int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(InterfaceC10560Hsz<Integer> interfaceC10560Hsz, HtJ<? super AnonymousClass1> htJ) {
                super(2, htJ);
                this.$winner = interfaceC10560Hsz;
            }

            @Override // X.AbstractC8884Fsp
            public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
                return new AnonymousClass1(this.$winner, htJ);
            }

            @Override // X.AbstractC8884Fsp
            public final Object invokeSuspend(Object obj) {
                EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
                int i = this.label;
                if (i == 0) {
                    Hwg.A00(obj);
                    InterfaceC10560Hsz<Integer> interfaceC10560Hsz = this.$winner;
                    this.label = 1;
                    if (interfaceC10560Hsz.APQ(this) == enumC10460Hji) {
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

            @Override // X.G0V
            public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
                return new AnonymousClass1(this.$winner, htJ).invokeSuspend(Unit.INSTANCE);
            }
        }

        @DebugMetadata(c = "com.facebook.aura.partners.voice.api.VoiceCatalogRepository$streamPreviewPcm$2$2", f = "VoiceCatalogRepository.kt", l = {MC.hatch_android_reactions.__CONFIG__}, m = "invokeSuspend", v = 2)
        /* renamed from: com.facebook.aura.partners.voice.api.VoiceCatalogRepository$streamPreviewPcm$2$2, reason: invalid class name and collision with other inner class name */
        public final class C02792 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
            public final /* synthetic */ InterfaceC10560Hsz<Integer> $winner;
            public int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C02792(InterfaceC10560Hsz<Integer> interfaceC10560Hsz, HtJ<? super C02792> htJ) {
                super(2, htJ);
                this.$winner = interfaceC10560Hsz;
            }

            @Override // X.AbstractC8884Fsp
            public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
                return new C02792(this.$winner, htJ);
            }

            @Override // X.AbstractC8884Fsp
            public final Object invokeSuspend(Object obj) {
                EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
                int i = this.label;
                if (i == 0) {
                    Hwg.A00(obj);
                    InterfaceC10560Hsz<Integer> interfaceC10560Hsz = this.$winner;
                    this.label = 1;
                    if (interfaceC10560Hsz.APQ(this) == enumC10460Hji) {
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

            @Override // X.G0V
            public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
                return new C02792(this.$winner, htJ).invokeSuspend(Unit.INSTANCE);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C130442(String str, PreviewStreamDiagnostics previewStreamDiagnostics, VoiceCatalogRepository voiceCatalogRepository, String str2, G0U<? super byte[], Unit> g0u, HtJ<? super C130442> htJ) {
            super(2, htJ);
            this.$voiceId = str;
            this.$diagnostics = previewStreamDiagnostics;
            this.this$0 = voiceCatalogRepository;
            this.$text = str2;
            this.$onPcmChunk = g0u;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            C130442 c130442 = new C130442(this.$voiceId, this.$diagnostics, this.this$0, this.$text, this.$onPcmChunk, htJ);
            c130442.L$0 = obj;
            return c130442;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:11:0x0035  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x0116  */
        /* JADX WARN: Removed duplicated region for block: B:34:0x014b A[PHI: r5
  0x014b: PHI (r5v1 java.lang.Integer) = (r5v0 java.lang.Integer), (r5v3 java.lang.Integer) binds: [B:31:0x0143, B:33:0x0149] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:36:0x0155  */
        /* JADX WARN: Removed duplicated region for block: B:43:0x017c  */
        /* JADX WARN: Removed duplicated region for block: B:54:0x019d  */
        /* JADX WARN: Removed duplicated region for block: B:57:0x01bb A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:58:0x01bc  */
        /* JADX WARN: Type inference failed for: r4v8, types: [X.Hsz] */
        @Override // X.AbstractC8884Fsp
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r35) {
            /*
                Method dump skipped, instructions count: 451
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.partners.voice.api.VoiceCatalogRepository.C130442.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        public static final C27k<PreviewStreamOutcome> invokeSuspend$send(AtomicInteger atomicInteger, C3UX c3ux, VoiceCatalogRepository voiceCatalogRepository, String str, String str2, G0U<? super byte[], Unit> g0u, InterfaceC10560Hsz<Integer> interfaceC10560Hsz, PreviewStreamDiagnostics previewStreamDiagnostics, AtomicReference<PreviewStreamOutcome> atomicReference, int i) {
            atomicInteger.incrementAndGet();
            C10550Hrx c10550HrxA10 = AnonymousClass001.A10(new VoiceCatalogRepository$streamPreviewPcm$2$send$request$1(voiceCatalogRepository, str, str2, g0u, interfaceC10560Hsz, i, previewStreamDiagnostics, atomicReference, null), c3ux);
            c10550HrxA10.AO5(new VoiceCatalogRepository$streamPreviewPcm$2$send$1(atomicInteger, interfaceC10560Hsz));
            return c10550HrxA10;
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Boolean> htJ) {
            return ((C130442) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.partners.voice.api.VoiceCatalogRepository", f = "VoiceCatalogRepository.kt", l = {609}, m = "streamPreviewPcmAttempt", v = 2)
    /* renamed from: com.facebook.aura.partners.voice.api.VoiceCatalogRepository$streamPreviewPcmAttempt$1, reason: invalid class name and case insensitive filesystem */
    public final class C130451 extends HzP {
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public Object L$4;
        public Object L$5;
        public int label;
        public /* synthetic */ Object result;

        public C130451(HtJ<? super C130451> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return VoiceCatalogRepository.this.streamPreviewPcmAttempt(null, null, null, null, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.partners.voice.api.VoiceCatalogRepository$streamVmPreviewPcm$2", f = "VoiceCatalogRepository.kt", l = {447, 449, 450}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.partners.voice.api.VoiceCatalogRepository$streamVmPreviewPcm$2, reason: invalid class name and case insensitive filesystem */
    /* loaded from: classes2.dex */
    public final class C130462 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super VmPreviewResult>, Object> {
        public final /* synthetic */ PreviewStreamDiagnostics $diagnostics;
        public final /* synthetic */ Function0<Unit> $onFirstAudio;
        public final /* synthetic */ G0U<byte[], Unit> $onPcmChunk;
        public final /* synthetic */ String $text;
        public final /* synthetic */ AbstractC3358CGz $userSession;
        public final /* synthetic */ String $voiceId;
        public /* synthetic */ Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public Object L$4;
        public boolean Z$0;
        public int label;

        /* renamed from: com.facebook.aura.partners.voice.api.VoiceCatalogRepository$streamVmPreviewPcm$2$1, reason: invalid class name */
        public final class AnonymousClass1 extends AbstractC7559F3s implements G0U<Throwable, Unit> {
            public final /* synthetic */ InterfaceC10560Hsz<Boolean> $audioStarted;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(InterfaceC10560Hsz<Boolean> interfaceC10560Hsz) {
                super(1);
                this.$audioStarted = interfaceC10560Hsz;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(Throwable th) {
                C3cG.A1F(this.$audioStarted, AnonymousClass001.A0h());
            }

            @Override // X.G0U
            public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
                invoke2(th);
                return Unit.INSTANCE;
            }
        }

        @DebugMetadata(c = "com.facebook.aura.partners.voice.api.VoiceCatalogRepository$streamVmPreviewPcm$2$2", f = "VoiceCatalogRepository.kt", l = {447}, m = "invokeSuspend", v = 2)
        /* renamed from: com.facebook.aura.partners.voice.api.VoiceCatalogRepository$streamVmPreviewPcm$2$2, reason: invalid class name and collision with other inner class name */
        public final class C02802 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Boolean>, Object> {
            public final /* synthetic */ InterfaceC10560Hsz<Boolean> $audioStarted;
            public int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C02802(InterfaceC10560Hsz<Boolean> interfaceC10560Hsz, HtJ<? super C02802> htJ) {
                super(2, htJ);
                this.$audioStarted = interfaceC10560Hsz;
            }

            @Override // X.AbstractC8884Fsp
            public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
                return new C02802(this.$audioStarted, htJ);
            }

            @Override // X.AbstractC8884Fsp
            public final Object invokeSuspend(Object obj) {
                EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
                int i = this.label;
                if (i == 0) {
                    Hwg.A00(obj);
                    InterfaceC10560Hsz<Boolean> interfaceC10560Hsz = this.$audioStarted;
                    this.label = 1;
                    obj = C3cG.A0W(interfaceC10560Hsz, this);
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
            public final Object invoke(C3UX c3ux, HtJ<? super Boolean> htJ) {
                return new C02802(this.$audioStarted, htJ).invokeSuspend(Unit.INSTANCE);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C130462(PreviewStreamDiagnostics previewStreamDiagnostics, Function0<Unit> function0, G0U<? super byte[], Unit> g0u, String str, String str2, AbstractC3358CGz abstractC3358CGz, HtJ<? super C130462> htJ) {
            super(2, htJ);
            this.$diagnostics = previewStreamDiagnostics;
            this.$onFirstAudio = function0;
            this.$onPcmChunk = g0u;
            this.$voiceId = str;
            this.$text = str2;
            this.$userSession = abstractC3358CGz;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            C130462 c130462 = VoiceCatalogRepository.this.new C130462(this.$diagnostics, this.$onFirstAudio, this.$onPcmChunk, this.$voiceId, this.$text, this.$userSession, htJ);
            c130462.L$0 = obj;
            return c130462;
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0027 A[ADDED_TO_REGION] */
        /* JADX WARN: Removed duplicated region for block: B:28:0x00c0  */
        /* JADX WARN: Removed duplicated region for block: B:33:0x00db  */
        /* JADX WARN: Removed duplicated region for block: B:36:0x00f3  */
        /* JADX WARN: Removed duplicated region for block: B:38:0x00f6  */
        /* JADX WARN: Removed duplicated region for block: B:39:0x00fd  */
        @Override // X.AbstractC8884Fsp
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r18) {
            /*
                Method dump skipped, instructions count: 261
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.partners.voice.api.VoiceCatalogRepository.C130462.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super VmPreviewResult> htJ) {
            return ((C130462) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    private final String normalizedOrNull(String str) {
        String strA0l;
        if (str == null || (strA0l = AnonymousClass002.A0l(str)) == null || strA0l.length() <= 0) {
            return null;
        }
        return strA0l;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object streamVmPreviewPcm(AbstractC3358CGz abstractC3358CGz, String str, String str2, PreviewStreamDiagnostics previewStreamDiagnostics, Function0<Unit> function0, G0U<? super byte[], Unit> g0u, HtJ<? super VmPreviewResult> htJ) {
        return Hxb.A00(new C130462(previewStreamDiagnostics, function0, g0u, str, str2, abstractC3358CGz, null), htJ);
    }

    public final Object downloadPreviewAudio$fbandroid_express_aura_java_com_facebook_aura_partners_voice_api_api(String str, String str2, boolean z, HtJ<? super byte[]> htJ) {
        return GAX.A01(htJ, new VoiceCatalogRepository$downloadPreviewAudio$2(str, str2, z, this, null), 30000L);
    }

    public final Object fetchDesignedPreviewAudio(AbstractC3358CGz abstractC3358CGz, String str, String str2, HtJ<? super byte[]> htJ) {
        return GAX.A01(htJ, new C130412(str2, str, abstractC3358CGz, null), 30000L);
    }

    public final Object streamPreviewPcm(String str, String str2, PreviewStreamDiagnostics previewStreamDiagnostics, G0U<? super byte[], Unit> g0u, HtJ<? super Boolean> htJ) {
        return Hxb.A00(new C130442(str, previewStreamDiagnostics, this, str2, g0u, null), htJ);
    }

    /* loaded from: classes2.dex */
    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[VmPreviewResult.values().length];
            try {
                AnonymousClass002.A13(VmPreviewResult.COMPLETED, iArr);
            } catch (NoSuchFieldError unused) {
            }
            try {
                AnonymousClass002.A14(VmPreviewResult.BROKE_OFF, iArr);
            } catch (NoSuchFieldError unused2) {
            }
            try {
                AnonymousClass002.A15(VmPreviewResult.NO_AUDIO, iArr);
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private final VoiceCatalog applyCurrentVoiceOverride(String str, VoiceCatalog voiceCatalog, long j) {
        ConcurrentHashMap<String, CurrentVoiceOverride> concurrentHashMap = currentVoiceOverrides;
        CurrentVoiceOverride currentVoiceOverride = concurrentHashMap.get(str);
        if (currentVoiceOverride != null) {
            if (currentVoiceOverride.updatedAtMs >= j) {
                return voiceCatalog.copy(voiceCatalog.voices, voiceCatalog.suggestedVoices, voiceCatalog.sampleLine, voiceCatalog.onboardingLine, currentVoiceOverride.voiceId);
            }
            concurrentHashMap.remove(str, currentVoiceOverride);
        }
        return voiceCatalog;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0030  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object fetchAndCacheAvailableVoices(X.AbstractC3358CGz r23, java.lang.String r24, X.HtJ<? super com.facebook.aura.partners.voice.api.VoiceCatalog> r25) {
        /*
            Method dump skipped, instructions count: 400
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.partners.voice.api.VoiceCatalogRepository.fetchAndCacheAvailableVoices(X.CGz, java.lang.String, X.HtJ):java.lang.Object");
    }

    private final VoiceCatalog freshCachedCatalog(String str) {
        ConcurrentHashMap<String, CachedCatalog> concurrentHashMap = catalogCache;
        CachedCatalog cachedCatalog = concurrentHashMap.get(str);
        if (cachedCatalog != null) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            long j = cachedCatalog.fetchedAtMs;
            if (jCurrentTimeMillis - j < 300000) {
                return applyCurrentVoiceOverride(str, cachedCatalog.catalog, j);
            }
            concurrentHashMap.remove(str, cachedCatalog);
        }
        return null;
    }

    private final PreviewStreamResult previewStreamFailure(Throwable th) {
        return th == null ? PreviewStreamResult.HTTP_STATUS : th instanceof NoNetworkException ? PreviewStreamResult.OFFLINE : th instanceof IOException ? PreviewStreamResult.TRANSPORT : PreviewStreamResult.UNEXPECTED;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0031  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object streamPreviewPcmAttempt(java.lang.String r26, java.lang.String r27, X.G0U<? super byte[], kotlin.Unit> r28, kotlin.jvm.functions.Function0<java.lang.Boolean> r29, X.HtJ<? super com.facebook.aura.partners.voice.api.PreviewStreamOutcome> r30) {
        /*
            Method dump skipped, instructions count: 311
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.partners.voice.api.VoiceCatalogRepository.streamPreviewPcmAttempt(java.lang.String, java.lang.String, X.G0U, kotlin.jvm.functions.Function0, X.HtJ):java.lang.Object");
    }

    private final VoiceCatalogFilterOption toFilterOptionOrNull(VoiceCatalogFilterOptionJson voiceCatalogFilterOptionJson) {
        int i;
        String strNormalizedOrNull = normalizedOrNull(voiceCatalogFilterOptionJson.value);
        String strNormalizedOrNull2 = normalizedOrNull(voiceCatalogFilterOptionJson.label);
        if (strNormalizedOrNull != null && strNormalizedOrNull2 != null && (i = voiceCatalogFilterOptionJson.count) >= 0) {
            return new VoiceCatalogFilterOption(strNormalizedOrNull, strNormalizedOrNull2, i);
        }
        CFK.A06(VoiceCatalogRepositoryKt.TAG, "Ignoring malformed catalog filter option");
        return null;
    }

    private final VoiceOption toVoiceOption(CatalogVoiceJson catalogVoiceJson) {
        String strNormalizedOrNull = normalizedOrNull(catalogVoiceJson.id);
        if (strNormalizedOrNull == null) {
            throw C60O.A0i("catalog voice id must not be blank");
        }
        String str = catalogVoiceJson.name;
        String str2 = catalogVoiceJson.description;
        if (str2 == null) {
            str2 = "";
        }
        String str3 = catalogVoiceJson.gender;
        if (str3 == null) {
            str3 = "";
        }
        String str4 = catalogVoiceJson.accent;
        if (str4 == null) {
            str4 = "";
        }
        String str5 = catalogVoiceJson.tone;
        if (str5 == null) {
            str5 = "";
        }
        return new VoiceOption(strNormalizedOrNull, str, str2, str3, str4, str5);
    }

    private final VoiceOption toVoiceOptionOrNull(CurrentVoiceJson currentVoiceJson) {
        String strNormalizedOrNull;
        String strNormalizedOrNull2 = normalizedOrNull(currentVoiceJson.voice_id);
        if (strNormalizedOrNull2 == null || (strNormalizedOrNull = normalizedOrNull(currentVoiceJson.voice_name)) == null) {
            return null;
        }
        return new VoiceOption(strNormalizedOrNull2, strNormalizedOrNull, "", "", "", "");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String vmPreviewFailure(HatchHttpResponse hatchHttpResponse) {
        if (hatchHttpResponse == null) {
            return C60N.A00(1);
        }
        Throwable th = hatchHttpResponse.cause;
        return th != null ? previewStreamFailure(th).getValue() : !hatchHttpResponse.isSuccessful ? FGI.A0H("status_", hatchHttpResponse.statusCode) : "empty";
    }

    private final byte[] wavFromPcm16(byte[] bArr) {
        ByteBuffer byteBufferOrder = ByteBuffer.allocate(44).order(ByteOrder.LITTLE_ENDIAN);
        Charset charset = DCl.A01;
        byteBufferOrder.put("RIFF".getBytes(charset));
        int length = bArr.length;
        byteBufferOrder.putInt(length + 36);
        byteBufferOrder.put("WAVEfmt ".getBytes(charset));
        byteBufferOrder.putInt(16);
        byteBufferOrder.putShort((short) 1);
        byteBufferOrder.putShort((short) 1);
        byteBufferOrder.putInt(24000);
        byteBufferOrder.putInt(48000);
        byteBufferOrder.putShort((short) 2);
        byteBufferOrder.putShort((short) 16);
        byteBufferOrder.put("data".getBytes(charset));
        byteBufferOrder.putInt(length);
        byte[] bArrArray = byteBufferOrder.array();
        C7384Etj.A0U(bArrArray);
        return AbstractC0903AHf.A07(bArrArray, bArr);
    }

    public final Object cachedOrAwaitInFlightPreviewAudio(AbstractC3358CGz abstractC3358CGz, String str, String str2, HtJ<? super PreviewLookup> htJ) {
        return VoicePreviewCache.Companion.getInstance(abstractC3358CGz).lookup(str, str2, htJ);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object fetchAvailableVoices(X.AbstractC3358CGz r10, X.HtJ<? super com.facebook.aura.partners.voice.api.VoiceCatalog> r11) {
        /*
            r9 = this;
            boolean r0 = r11 instanceof com.facebook.aura.partners.voice.api.VoiceCatalogRepository.C130401
            if (r0 == 0) goto L26
            r8 = r11
            com.facebook.aura.partners.voice.api.VoiceCatalogRepository$fetchAvailableVoices$1 r8 = (com.facebook.aura.partners.voice.api.VoiceCatalogRepository.C130401) r8
            int r2 = r8.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L26
            int r2 = r2 - r1
            r8.label = r2
        L12:
            java.lang.Object r0 = r8.result
            X.Hji r7 = X.EnumC10460Hji.A02
            int r1 = r8.label
            r6 = 2
            r5 = 1
            r4 = 0
            if (r1 == 0) goto L40
            if (r1 == r5) goto L31
            if (r1 != r6) goto L2c
            java.lang.Object r3 = r8.L$2
            X.BLa r3 = (X.InterfaceC2261BLa) r3
            goto L77
        L26:
            com.facebook.aura.partners.voice.api.VoiceCatalogRepository$fetchAvailableVoices$1 r8 = new com.facebook.aura.partners.voice.api.VoiceCatalogRepository$fetchAvailableVoices$1
            r8.<init>(r11)
            goto L12
        L2c:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        L31:
            java.lang.Object r3 = r8.L$2
            X.BLa r3 = (X.InterfaceC2261BLa) r3
            java.lang.Object r2 = r8.L$1
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r1 = r8.L$0
            X.CGz r10 = X.C60O.A0D(r1, r0)
            goto L62
        L40:
            X.Hwg.A00(r0)
            com.facebook.aura.partners.voice.api.VoiceCatalogRepository$Companion r1 = com.facebook.aura.partners.voice.api.VoiceCatalogRepository.Companion
            java.lang.String r2 = com.facebook.aura.partners.voice.api.VoiceCatalogRepository.Companion.access$cacheKey(r1, r10)
            com.facebook.aura.partners.voice.api.VoiceCatalog r0 = r9.freshCachedCatalog(r2)
            if (r0 != 0) goto L87
            X.BLa r3 = com.facebook.aura.partners.voice.api.VoiceCatalogRepository.Companion.access$catalogFetchMutex(r1, r2)
            r8.L$0 = r10
            r8.L$1 = r2
            r8.L$2 = r3
            r8.label = r5
            java.lang.Object r0 = r3.APs(r4, r8)
            if (r0 != r7) goto L62
            return r7
        L62:
            com.facebook.aura.partners.voice.api.VoiceCatalog r0 = r9.freshCachedCatalog(r2)     // Catch: java.lang.Throwable -> L7f
            if (r0 != 0) goto L84
            r8.L$0 = r4     // Catch: java.lang.Throwable -> L7f
            r8.L$1 = r4     // Catch: java.lang.Throwable -> L7f
            r8.L$2 = r3     // Catch: java.lang.Throwable -> L7f
            r8.label = r6     // Catch: java.lang.Throwable -> L7f
            java.lang.Object r0 = r9.fetchAndCacheAvailableVoices(r10, r2, r8)     // Catch: java.lang.Throwable -> L7f
            if (r0 != r7) goto L7a
            return r7
        L77:
            X.Hwg.A00(r0)     // Catch: java.lang.Throwable -> L7d
        L7a:
            com.facebook.aura.partners.voice.api.VoiceCatalog r0 = (com.facebook.aura.partners.voice.api.VoiceCatalog) r0     // Catch: java.lang.Throwable -> L7d
            goto L84
        L7d:
            r0 = move-exception
            goto L80
        L7f:
            r0 = move-exception
        L80:
            r3.Ahe(r4)
            throw r0
        L84:
            r3.Ahe(r4)
        L87:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.partners.voice.api.VoiceCatalogRepository.fetchAvailableVoices(X.CGz, X.HtJ):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0022  */
    /* renamed from: fetchCatalogFilters-0E7RQCE, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m1685fetchCatalogFilters0E7RQCE(X.AbstractC3358CGz r19, com.facebook.aura.partners.voice.api.VoiceCatalogCriteria r20, X.HtJ<? super X.HsJ<com.facebook.aura.partners.voice.api.VoiceCatalogFilters>> r21) {
        /*
            Method dump skipped, instructions count: 287
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.partners.voice.api.VoiceCatalogRepository.m1685fetchCatalogFilters0E7RQCE(X.CGz, com.facebook.aura.partners.voice.api.VoiceCatalogCriteria, X.HtJ):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00d0 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* renamed from: fetchCatalogPage-yxL6bBk, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m1686fetchCatalogPageyxL6bBk(X.AbstractC3358CGz r20, com.facebook.aura.partners.voice.api.VoiceCatalogCriteria r21, int r22, boolean r23, X.HtJ<? super X.HsJ<com.facebook.aura.partners.voice.api.VoiceCatalogPage>> r24) {
        /*
            Method dump skipped, instructions count: 483
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.partners.voice.api.VoiceCatalogRepository.m1686fetchCatalogPageyxL6bBk(X.CGz, com.facebook.aura.partners.voice.api.VoiceCatalogCriteria, int, boolean, X.HtJ):java.lang.Object");
    }

    public final Object fetchPreviewAudio(AbstractC3358CGz abstractC3358CGz, String str, String str2, HtJ<? super byte[]> htJ) {
        return VoicePreviewCache.Companion.getInstance(abstractC3358CGz).fetch(str, str2, false, htJ);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x00a3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object speakPreviewOnCall(X.AbstractC3358CGz r24, java.lang.String r25, java.lang.String r26, X.HtJ<? super com.facebook.aura.partners.voice.api.CallVoicePreviewResult> r27) {
        /*
            r23 = this;
            r4 = r27
            boolean r0 = r4 instanceof com.facebook.aura.partners.voice.api.VoiceCatalogRepository.C130421
            if (r0 == 0) goto La3
            r2 = r4
            com.facebook.aura.partners.voice.api.VoiceCatalogRepository$speakPreviewOnCall$1 r2 = (com.facebook.aura.partners.voice.api.VoiceCatalogRepository.C130421) r2
            int r3 = r2.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r3 & r1
            if (r0 == 0) goto La3
            int r3 = r3 - r1
            r2.label = r3
        L14:
            java.lang.Object r4 = r2.result
            X.Hji r1 = X.EnumC10460Hji.A02
            int r3 = r2.label
            r0 = 1
            r8 = 0
            if (r3 == 0) goto L39
            if (r3 != r0) goto Lc8
            java.lang.Object r2 = X.AnonymousClass001.A0q(r4)
        L24:
            java.lang.Throwable r0 = X.HsJ.A00(r2)
            if (r0 != 0) goto Lc5
            com.facebook.aura.partners.voice.api.CallVoicePreviewResponseJson r2 = (com.facebook.aura.partners.voice.api.CallVoicePreviewResponseJson) r2
            java.lang.String r1 = r2.status
            java.lang.String r0 = "spoken"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto Lac
            com.facebook.aura.partners.voice.api.CallVoicePreviewResult r1 = com.facebook.aura.partners.voice.api.CallVoicePreviewResult.SPOKEN
            return r1
        L39:
            X.Hwg.A00(r4)
            com.facebook.aura.network.http.HatchHttpApi r5 = com.facebook.aura.network.http.HatchHttpApi.INSTANCE
            com.facebook.aura.partners.voice.api.VoiceJarvisPath$VoiceCallsPreviewVoice r9 = com.facebook.aura.partners.voice.api.VoiceJarvisPath.VoiceCallsPreviewVoice.INSTANCE
            com.facebook.aura.partners.voice.api.CallVoicePreviewRequestJson r10 = new com.facebook.aura.partners.voice.api.CallVoicePreviewRequestJson
            r4 = r25
            r3 = r26
            r10.<init>(r4, r3)
            com.facebook.aura.network.http.RequestType r11 = com.facebook.aura.network.http.RequestType.POST
            r3 = 45
            java.lang.Long r13 = X.C3cG.A0S(r3)
            X.HxE[] r15 = new X.HxE[r8]
            java.util.Set r16 = X.AnonymousClass004.A18()
            X.9jH r19 = X.C9jH.A00
            com.facebook.aura.partners.voice.api.VoiceCatalogRepository$speakPreviewOnCall$$inlined$executeJarvisRequest-Z6QaZII$default$1 r6 = com.facebook.aura.partners.voice.api.VoiceCatalogRepository$speakPreviewOnCall$$inlined$executeJarvisRequestZ6QaZII$default$1.INSTANCE
            com.facebook.aura.partners.voice.api.VoiceCatalogRepository$speakPreviewOnCall$$inlined$executeJarvisRequest-Z6QaZII$default$2 r7 = com.facebook.aura.partners.voice.api.VoiceCatalogRepository$speakPreviewOnCall$$inlined$executeJarvisRequestZ6QaZII$default$2.INSTANCE
            r14 = 0
            r2.L$0 = r14
            r2.L$1 = r14
            r2.L$2 = r14
            r2.L$3 = r14
            r2.L$4 = r14
            r2.L$5 = r14
            r2.L$6 = r14
            r2.L$7 = r14
            r2.L$8 = r14
            r2.L$9 = r14
            r2.L$10 = r14
            r2.L$11 = r14
            r2.I$0 = r0
            r2.I$1 = r8
            r2.I$2 = r8
            r2.I$3 = r0
            r2.I$4 = r8
            r2.I$5 = r8
            r2.I$6 = r8
            r2.label = r0
            r12 = r24
            r18 = r8
            r20 = r14
            r21 = r8
            r22 = r0
            r23 = r8
            r24 = r8
            r25 = r14
            r26 = r8
            r27 = r2
            r17 = r0
            java.lang.Object r2 = r5.m1599executeJarvisRequestWithFof5HsY(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27)
            if (r2 != r1) goto L24
            return r1
        La3:
            com.facebook.aura.partners.voice.api.VoiceCatalogRepository$speakPreviewOnCall$1 r2 = new com.facebook.aura.partners.voice.api.VoiceCatalogRepository$speakPreviewOnCall$1
            r0 = r23
            r2.<init>(r4)
            goto L14
        Lac:
            java.lang.String r0 = "interrupted"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto Lb7
            com.facebook.aura.partners.voice.api.CallVoicePreviewResult r1 = com.facebook.aura.partners.voice.api.CallVoicePreviewResult.INTERRUPTED
            return r1
        Lb7:
            java.lang.Object[] r2 = new java.lang.Object[]{r1}
            java.lang.String r1 = "VoiceCatalogRepository"
            java.lang.String r0 = "speakPreviewOnCall status=%s"
            X.CFK.A0H(r1, r0, r2)
            com.facebook.aura.partners.voice.api.CallVoicePreviewResult r1 = com.facebook.aura.partners.voice.api.CallVoicePreviewResult.FAILED
            return r1
        Lc5:
            com.facebook.aura.partners.voice.api.CallVoicePreviewResult r1 = com.facebook.aura.partners.voice.api.CallVoicePreviewResult.FAILED
            return r1
        Lc8:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.partners.voice.api.VoiceCatalogRepository.speakPreviewOnCall(X.CGz, java.lang.String, java.lang.String, X.HtJ):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x004c A[PHI: r1 r2 r3 r6 r7 r12 r14
  0x004c: PHI (r1v6 java.io.ByteArrayOutputStream) = (r1v3 java.io.ByteArrayOutputStream), (r1v7 java.io.ByteArrayOutputStream) binds: [B:36:0x0112, B:14:0x004a] A[DONT_GENERATE, DONT_INLINE]
  0x004c: PHI (r2v10 boolean) = (r2v7 boolean), (r2v12 boolean) binds: [B:36:0x0112, B:14:0x004a] A[DONT_GENERATE, DONT_INLINE]
  0x004c: PHI (r3v4 long) = (r3v2 long), (r3v5 long) binds: [B:36:0x0112, B:14:0x004a] A[DONT_GENERATE, DONT_INLINE]
  0x004c: PHI (r6v2 java.lang.String) = (r6v1 java.lang.String), (r6v3 java.lang.String) binds: [B:36:0x0112, B:14:0x004a] A[DONT_GENERATE, DONT_INLINE]
  0x004c: PHI (r7v2 java.lang.String) = (r7v1 java.lang.String), (r7v3 java.lang.String) binds: [B:36:0x0112, B:14:0x004a] A[DONT_GENERATE, DONT_INLINE]
  0x004c: PHI (r12v2 com.facebook.aura.partners.voice.api.VoicePreviewCache) = 
  (r12v1 com.facebook.aura.partners.voice.api.VoicePreviewCache)
  (r12v3 com.facebook.aura.partners.voice.api.VoicePreviewCache)
 binds: [B:36:0x0112, B:14:0x004a] A[DONT_GENERATE, DONT_INLINE]
  0x004c: PHI (r14v2 X.F1F) = (r14v1 X.F1F), (r14v3 X.F1F) binds: [B:36:0x0112, B:14:0x004a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0139  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object streamPreviewAudio(X.AbstractC3358CGz r16, java.lang.String r17, java.lang.String r18, com.facebook.aura.partners.voice.api.PreviewStreamDiagnostics r19, kotlin.jvm.functions.Function0<kotlin.Unit> r20, X.G0U<? super byte[], kotlin.Unit> r21, X.HtJ<? super java.lang.Boolean> r22) {
        /*
            Method dump skipped, instructions count: 339
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.partners.voice.api.VoiceCatalogRepository.streamPreviewAudio(X.CGz, java.lang.String, java.lang.String, com.facebook.aura.partners.voice.api.PreviewStreamDiagnostics, kotlin.jvm.functions.Function0, X.G0U, X.HtJ):java.lang.Object");
    }

    private final List<HxE<String, Object>> catalogCriteriaQueryParams(VoiceCatalogCriteria voiceCatalogCriteria) {
        AII aiiA17 = AIM.A17();
        AnonymousClass002.A1J(PhotosSearchHandlerKt.PARAM_SOURCE, "library", aiiA17);
        String strNormalizedOrNull = normalizedOrNull(voiceCatalogCriteria.query);
        if (strNormalizedOrNull != null) {
            AnonymousClass002.A1J("query", strNormalizedOrNull, aiiA17);
        }
        String strNormalizedOrNull2 = normalizedOrNull(voiceCatalogCriteria.gender);
        if (strNormalizedOrNull2 != null) {
            AnonymousClass002.A1J("gender", strNormalizedOrNull2, aiiA17);
        }
        String strNormalizedOrNull3 = normalizedOrNull(voiceCatalogCriteria.accent);
        if (strNormalizedOrNull3 != null) {
            AnonymousClass002.A1J("accent", strNormalizedOrNull3, aiiA17);
        }
        String strNormalizedOrNull4 = normalizedOrNull(voiceCatalogCriteria.tone);
        if (strNormalizedOrNull4 != null) {
            AnonymousClass002.A1J("tone", strNormalizedOrNull4, aiiA17);
        }
        return AIM.A18(aiiA17);
    }

    public final void prefetchWidgetPreviews(AbstractC3358CGz abstractC3358CGz, String str, String str2, List<String> list, String str3) {
        AnonymousClass005.A17(abstractC3358CGz, str, str2, list, str3);
        if (VoiceGating.INSTANCE.isWidgetPreviewPrefetchEnabled()) {
            VoicePreviewCache.Companion.getInstance(abstractC3358CGz).registerWidget(C3cG.A0r(str, str2), list, str3);
        }
    }

    public final String voiceSelectionContent(String str) {
        return C8j3.A1G(str).A02(new PersistedVoiceSelectionJson(str), PersistedVoiceSelectionJson$$serializer.INSTANCE);
    }
}
