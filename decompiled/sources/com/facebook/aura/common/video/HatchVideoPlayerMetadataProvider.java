package com.facebook.aura.common.video;

import X.AbstractC8150FWo;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.BV4;
import X.BV6;
import X.BWC;
import X.BXX;
import X.C06H;
import X.C4904DDx;
import X.C5877DrD;
import X.C5962Dsy;
import X.C5963Dsz;
import X.C7384Etj;
import X.C7BY;
import X.C9tI;
import X.DmR;
import X.Dt1;
import X.Dw4;
import X.EnumC2374BWi;
import X.EnumC7503EyM;
import X.EnumC7533Ezy;
import X.Eu6;
import java.lang.ref.WeakReference;
import java.util.Map;
import kotlin.Unit;

/* loaded from: classes5.dex */
public final class HatchVideoPlayerMetadataProvider {
    public static final int $stable = 8;
    public static final Companion Companion = new Companion();
    public final boolean autoPlay;
    public final C5962Dsy backgroundFetchedTagMetadata;
    public final Dw4 loggerTokenProvider;
    public final Long loggingMediaId;
    public WeakReference metadataProviderPlayer;
    public final BWC metadataProviderType;
    public final EnumC2374BWi renderMode;
    public final C5962Dsy tagMetadata;
    public final C5877DrD tagMetadataProvider;
    public final DmR videoPlayRequest;

    public final class Companion {
        public final long videoIdToMediaId(String str) {
            String strA0W;
            Long lA0s;
            if (str == null || (strA0W = C7BY.A0W(str, "_", str)) == null || (lA0s = C9tI.A0s(strA0W)) == null) {
                return 0L;
            }
            return lA0s.longValue();
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public /* bridge */ Dt1 getARVRMetadata(EnumC7503EyM enumC7503EyM, long j) {
        C7384Etj.A0Y(enumC7503EyM, 1);
        Dt1 dt1 = new Dt1();
        dt1.A03(enumC7503EyM, "universe");
        AbstractC8150FWo.A02(dt1, "id", Long.valueOf(j));
        return dt1;
    }

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[BXX.values().length];
            try {
                BV6.A1T(iArr);
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public /* synthetic */ HatchVideoPlayerMetadataProvider(DmR dmR, boolean z, WeakReference weakReference, Dw4 dw4, EnumC2374BWi enumC2374BWi, Long l, int i, C06H c06h) {
        this(dmR, z, weakReference, dw4, enumC2374BWi, (i & 32) != 0 ? null : l);
    }

    private final String convertPlaybackFormat(BXX bxx) {
        if (bxx == null) {
            return null;
        }
        int iOrdinal = bxx.ordinal();
        if (iOrdinal == 0 || iOrdinal == 1) {
            return "dash";
        }
        if (iOrdinal == 2) {
            return "progressive";
        }
        return null;
    }

    public C5962Dsy getBackgroundFetchedTagMetadata() {
        return this.backgroundFetchedTagMetadata;
    }

    public /* bridge */ boolean getDisableMediaEnhancementDecisionTags() {
        return false;
    }

    public C5962Dsy getInitialTagMetadata(String str) {
        WeakReference weakReference = this.metadataProviderPlayer;
        if (weakReference != null) {
            weakReference.get();
        }
        C5962Dsy c5962Dsy = new C5962Dsy();
        C4904DDx c4904DDx = this.videoPlayRequest.A03;
        String strConvertPlaybackFormat = convertPlaybackFormat(c4904DDx != null ? c4904DDx.A0A : null);
        AbstractC8150FWo.A02(c5962Dsy, "video_format", strConvertPlaybackFormat);
        if (strConvertPlaybackFormat != null) {
            AbstractC8150FWo.A02(c5962Dsy, "streaming_format", strConvertPlaybackFormat);
        }
        return c5962Dsy;
    }

    public Dw4 getLoggerTokenProvider() {
        return this.loggerTokenProvider;
    }

    public WeakReference getMetadataProviderPlayer() {
        return this.metadataProviderPlayer;
    }

    public BWC getMetadataProviderType() {
        return this.metadataProviderType;
    }

    public C5963Dsz getRequiredMetadata() {
        C5963Dsz c5963Dsz = new C5963Dsz();
        AbstractC8150FWo.A02(c5963Dsz, "current_watching_module", "video");
        Long l = this.loggingMediaId;
        AbstractC8150FWo.A02(c5963Dsz, "media_id", Long.valueOf(l != null ? l.longValue() : Companion.videoIdToMediaId(this.videoPlayRequest.A03.A0Q)));
        c5963Dsz.A03(EnumC7533Ezy.ORGANIC, "tracking_type");
        AbstractC8150FWo.A02(c5963Dsz, "player_suborigin", this.videoPlayRequest.A03.A0G);
        AbstractC8150FWo.A02(c5963Dsz, "player_origin", this.videoPlayRequest.A03.A0F);
        Boolean boolValueOf = Boolean.valueOf(AnonymousClass002.A1Z(this.renderMode, EnumC2374BWi.AUDIO_ONLY));
        Map<String, Object> map = c5963Dsz.A00;
        map.put("is_audio_only", boolValueOf);
        Long l2 = this.loggingMediaId;
        AbstractC8150FWo.A02(c5963Dsz, "media_id_string", l2 != null ? String.valueOf(l2.longValue()) : this.videoPlayRequest.A03.A0Q);
        BV4.A1H("video_play_reason", map, AnonymousClass002.A1L(this.autoPlay ? 1 : 0) ? 1 : 0);
        return c5963Dsz;
    }

    public /* bridge */ boolean getShouldTrackTagMetadataPublication() {
        return false;
    }

    public C5962Dsy getTagMetadata() {
        return this.tagMetadata;
    }

    public /* bridge */ String getVideoResource(String str) {
        return null;
    }

    public /* bridge */ Unit mergeInitialTagMetadata(String str, C5962Dsy c5962Dsy) {
        AnonymousClass003.A0x(str, c5962Dsy);
        m371setInitialTagMetadata(str, c5962Dsy);
        return Unit.INSTANCE;
    }

    /* renamed from: setInitialTagMetadata, reason: collision with other method in class */
    public void m371setInitialTagMetadata(String str, C5962Dsy c5962Dsy) {
        AnonymousClass003.A0u(str, c5962Dsy);
        this.tagMetadataProvider.A00.put(str, c5962Dsy);
    }

    public void setMetadataProviderPlayer(WeakReference weakReference) {
        this.metadataProviderPlayer = weakReference;
    }

    public /* bridge */ int getVideoPlayReason(Eu6 eu6, Eu6 eu62) {
        return Integer.MIN_VALUE;
    }

    public /* bridge */ void onTagMetadataPublished(String str, C5962Dsy c5962Dsy) {
    }

    public HatchVideoPlayerMetadataProvider(DmR dmR, boolean z, WeakReference weakReference, Dw4 dw4, EnumC2374BWi enumC2374BWi, Long l) {
        AnonymousClass005.A12(dmR, dw4, enumC2374BWi, 0);
        this.videoPlayRequest = dmR;
        this.autoPlay = z;
        this.metadataProviderPlayer = weakReference;
        this.loggerTokenProvider = dw4;
        this.renderMode = enumC2374BWi;
        this.loggingMediaId = l;
        this.tagMetadataProvider = new C5877DrD();
        this.metadataProviderType = BWC.A04;
    }

    public /* bridge */ /* synthetic */ Unit setInitialTagMetadata(String str, C5962Dsy c5962Dsy) {
        m371setInitialTagMetadata(str, c5962Dsy);
        return Unit.INSTANCE;
    }
}
