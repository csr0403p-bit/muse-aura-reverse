package com.facebook.aura.partners.voice.viewmodel;

import X.AGH;
import X.AIW;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass006;
import X.BLG;
import X.C06H;
import X.C0924AIa;
import X.C1BN;
import X.C3cG;
import X.C3cH;
import X.C60P;
import X.C7384Etj;
import X.C9286GCn;
import X.C9jH;
import X.Ey9;
import X.F3w;
import X.HnJ;
import android.os.SystemClock;
import com.facebook.aura.analytics.hatch.HatchAppEventLogger;
import com.facebook.aura.analytics.hatch.HatchComponent;
import com.facebook.aura.analytics.hatch.HatchInteractionLogger;
import com.facebook.aura.analytics.hatch.HatchMetadataKey;
import com.facebook.aura.analytics.hatch.HatchOrigin;
import com.facebook.aura.analytics.hatch.HatchScreen;
import com.facebook.aura.analytics.hatch.HatchSubsurface;
import com.facebook.aura.analytics.hatch.HatchSurface;
import com.facebook.aura.analytics.waterfall.HatchPriceImpressionEventDataKt;
import com.facebook.aura.navigation.key.VoiceEntryPoint;
import com.facebook.aura.widgets.WidgetComponentsKt;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes4.dex */
public final class VoiceTelemetry {
    public static final int $stable = 8;
    public static final long IMPRESSION_MIN_DURATION_MS = 500;
    public final BLG<Map<Episode, Long>> _impressionEpisodes;
    public final BLG<Long> _visitSequence;
    public final VoiceEntryPoint entryPoint;
    public final C1BN<Map<Episode, Long>> impressionEpisodes;
    public final Object lock;
    public final Page page;
    public Visit visit;
    public final C1BN<Long> visitSequence;
    public static final Companion Companion = new Companion();
    public static final AtomicLong nextVisitSequence = new AtomicLong();

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public final class CatalogState {
        public static final /* synthetic */ Ey9 $ENTRIES;
        public static final /* synthetic */ CatalogState[] $VALUES;
        public static final CatalogState CATALOG_EMPTY;
        public static final CatalogState CATALOG_ERROR;
        public static final CatalogState CATALOG_LOADING;
        public static final CatalogState FILTERS_ERROR;
        public static final CatalogState FILTERS_LOADING;
        public static final CatalogState NO_RESULTS;
        public static final CatalogState PAGE_ERROR;
        public static final CatalogState PAGE_LOADING;
        public static final CatalogState SAVE_ERROR;
        public final Episode episode;
        public final String value;

        static {
            Episode episode = Episode.CATALOG;
            CatalogState catalogState = new CatalogState("CATALOG_LOADING", 0, "catalog_loading", episode);
            CATALOG_LOADING = catalogState;
            CatalogState catalogState2 = new CatalogState("CATALOG_ERROR", 1, "catalog_error", episode);
            CATALOG_ERROR = catalogState2;
            CatalogState catalogState3 = new CatalogState("CATALOG_EMPTY", 2, "catalog_empty", episode);
            CATALOG_EMPTY = catalogState3;
            CatalogState catalogState4 = new CatalogState("NO_RESULTS", 3, "no_results", episode);
            NO_RESULTS = catalogState4;
            Episode episode2 = Episode.FILTERS;
            CatalogState catalogState5 = new CatalogState("FILTERS_LOADING", 4, "filters_loading", episode2);
            FILTERS_LOADING = catalogState5;
            CatalogState catalogState6 = new CatalogState("FILTERS_ERROR", 5, "filters_error", episode2);
            FILTERS_ERROR = catalogState6;
            Episode episode3 = Episode.PAGE;
            CatalogState catalogState7 = new CatalogState("PAGE_LOADING", 6, "page_loading", episode3);
            PAGE_LOADING = catalogState7;
            CatalogState catalogState8 = new CatalogState("PAGE_ERROR", 7, "page_error", episode3);
            PAGE_ERROR = catalogState8;
            CatalogState catalogState9 = new CatalogState("SAVE_ERROR", 8, "save_error", Episode.SELECTION);
            SAVE_ERROR = catalogState9;
            CatalogState[] catalogStateArr = {catalogState, catalogState2, catalogState3, catalogState4, catalogState5, catalogState6, catalogState7, catalogState8, catalogState9};
            $VALUES = catalogStateArr;
            $ENTRIES = C3cG.A0w(catalogStateArr);
        }

        public static Ey9<CatalogState> getEntries() {
            return $ENTRIES;
        }

        public static CatalogState valueOf(String str) {
            return (CatalogState) Enum.valueOf(CatalogState.class, str);
        }

        public static CatalogState[] values() {
            return (CatalogState[]) $VALUES.clone();
        }

        public final Episode getEpisode() {
            return this.episode;
        }

        public final String getValue() {
            return this.value;
        }

        public CatalogState(String str, int i, String str2, Episode episode) {
            this.value = str2;
            this.episode = episode;
        }
    }

    public final class Companion {
        /* JADX INFO: Access modifiers changed from: private */
        public final String durationBucket(long j) {
            return j < 100 ? "lt_100ms" : j < 300 ? "100_300ms" : j < 1000 ? "300ms_1s" : j < 3000 ? "1_3s" : j < 10000 ? "3_10s" : j < 30000 ? "10_30s" : "30s_plus";
        }

        public final String countBucket(int i) {
            return i <= 0 ? HatchPriceImpressionEventDataKt.NO_DISCOUNT : i == 1 ? "1" : i <= 5 ? "2_5" : i <= 10 ? "6_10" : i <= 25 ? "11_25" : i <= 50 ? "26_50" : "51_plus";
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public final class Episode {
        public static final /* synthetic */ Ey9 $ENTRIES;
        public static final /* synthetic */ Episode[] $VALUES;
        public static final Episode CATALOG;
        public static final Episode FILTERS;
        public static final Episode PAGE;
        public static final Episode SELECTION;

        static {
            Episode episode = new Episode("CATALOG", 0);
            CATALOG = episode;
            Episode episode2 = new Episode("FILTERS", 1);
            FILTERS = episode2;
            Episode episode3 = new Episode("PAGE", 2);
            PAGE = episode3;
            Episode episode4 = new Episode("SELECTION", 3);
            SELECTION = episode4;
            Episode[] episodeArr = {episode, episode2, episode3, episode4};
            $VALUES = episodeArr;
            $ENTRIES = C3cG.A0w(episodeArr);
        }

        public static Ey9<Episode> getEntries() {
            return $ENTRIES;
        }

        public static Episode valueOf(String str) {
            return (Episode) Enum.valueOf(Episode.class, str);
        }

        public static Episode[] values() {
            return (Episode[]) $VALUES.clone();
        }

        public Episode(String str, int i) {
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes2.dex */
    public final class Interaction {
        public static final /* synthetic */ Ey9 $ENTRIES;
        public static final /* synthetic */ Interaction[] $VALUES;
        public static final Interaction CLICK;
        public static final Interaction DISMISS;
        public static final Interaction TOGGLE_OFF;
        public static final Interaction TOGGLE_ON;

        static {
            Interaction interaction = new Interaction("CLICK", 0);
            CLICK = interaction;
            Interaction interaction2 = new Interaction("TOGGLE_ON", 1);
            TOGGLE_ON = interaction2;
            Interaction interaction3 = new Interaction("TOGGLE_OFF", 2);
            TOGGLE_OFF = interaction3;
            Interaction interaction4 = new Interaction("DISMISS", 3);
            DISMISS = interaction4;
            Interaction[] interactionArr = {interaction, interaction2, interaction3, interaction4};
            $VALUES = interactionArr;
            $ENTRIES = C3cG.A0w(interactionArr);
        }

        public static Ey9<Interaction> getEntries() {
            return $ENTRIES;
        }

        public static Interaction valueOf(String str) {
            return (Interaction) Enum.valueOf(Interaction.class, str);
        }

        public static Interaction[] values() {
            return (Interaction[]) $VALUES.clone();
        }

        public Interaction(String str, int i) {
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes.dex */
    public final class Page {
        public static final /* synthetic */ Ey9 $ENTRIES;
        public static final /* synthetic */ Page[] $VALUES;
        public static final Page SELECTION;
        public static final Page SETTINGS;
        public final HatchScreen screen;
        public final HatchSubsurface subsurface;
        public final String value;

        static {
            Page page = new Page("SETTINGS", 0, "voice_settings", HatchSubsurface.VOICE_SETTINGS, HatchScreen.VOICE_SETTINGS);
            SETTINGS = page;
            Page page2 = new Page("SELECTION", 1, "voice_selection", HatchSubsurface.VOICE_SELECTION, HatchScreen.VOICE_SELECTION);
            SELECTION = page2;
            Page[] pageArr = {page, page2};
            $VALUES = pageArr;
            $ENTRIES = new F3w(pageArr);
        }

        public static Ey9<Page> getEntries() {
            return $ENTRIES;
        }

        public static Page valueOf(String str) {
            return (Page) Enum.valueOf(Page.class, str);
        }

        public static Page[] values() {
            return (Page[]) $VALUES.clone();
        }

        public final HatchScreen getScreen() {
            return this.screen;
        }

        public final HatchSubsurface getSubsurface() {
            return this.subsurface;
        }

        public final String getValue() {
            return this.value;
        }

        public Page(String str, int i, String str2, HatchSubsurface hatchSubsurface, HatchScreen hatchScreen) {
            this.value = str2;
            this.subsurface = hatchSubsurface;
            this.screen = hatchScreen;
        }
    }

    public final class SelectionCommit {
        public static final int $stable = 8;
        public boolean finished;
        public final Object lock;
        public final Map<String, String> metadata;
        public final Page page;
        public final long startedAt;

        public final void finish(Map<HatchMetadataKey, String> map) {
            C7384Etj.A0Y(map, 0);
            synchronized (this.lock) {
                if (!this.finished) {
                    this.finished = true;
                    HatchAppEventLogger hatchAppEventLogger = HatchAppEventLogger.INSTANCE;
                    String value = HatchSurface.VOICE_MODE.getValue();
                    String value2 = this.page.getSubsurface().getValue();
                    Map<String, String> map2 = this.metadata;
                    LinkedHashMap linkedHashMapA0I = AIW.A0I(map);
                    Iterator itA0n = AnonymousClass002.A0n(map);
                    while (itA0n.hasNext()) {
                        Map.Entry entry = (Map.Entry) itA0n.next();
                        linkedHashMapA0I.put(((HatchMetadataKey) entry.getKey()).getValue(), entry.getValue());
                    }
                    hatchAppEventLogger.logEvent("voice_selection_commit", value, value2, "outcome", null, AnonymousClass006.A11(HatchMetadataKey.LATENCY_BUCKET.getValue(), VoiceTelemetry.Companion.durationBucket(SystemClock.elapsedRealtime() - this.startedAt), AGH.A02(map2, linkedHashMapA0I)), null);
                }
            }
        }

        public SelectionCommit(Page page, Map<String, String> map, long j) {
            AnonymousClass003.A0u(page, map);
            this.page = page;
            this.metadata = map;
            this.startedAt = j;
            this.lock = C3cG.A0T();
        }
    }

    public final class Visit {
        public boolean hadPreview;
        public boolean hasPendingSelection;
        public final long sequence;

        public final boolean getHadPreview() {
            return this.hadPreview;
        }

        public final boolean getHasPendingSelection() {
            return this.hasPendingSelection;
        }

        public final long getSequence() {
            return this.sequence;
        }

        public Visit(long j) {
            this.sequence = j;
        }

        public final void setHadPreview(boolean z) {
            this.hadPreview = z;
        }

        public final void setHasPendingSelection(boolean z) {
            this.hasPendingSelection = z;
        }
    }

    public final void beginEpisode(Episode episode) {
        Map<Episode, Long> value;
        Map<Episode, Long> map;
        C7384Etj.A0Y(episode, 0);
        BLG<Map<Episode, Long>> blg = this._impressionEpisodes;
        do {
            value = blg.getValue();
            map = value;
        } while (!blg.A6e(value, AnonymousClass006.A11(episode, Long.valueOf(C60P.A01(map.get(episode)) + 1), map)));
    }

    public final void endVisit(String str) {
        C7384Etj.A0Y(str, 0);
        synchronized (this.lock) {
            Visit visit = this.visit;
            if (visit != null) {
                logVisit("outcome", AGH.A0D(C3cG.A0r(HatchMetadataKey.VOICE_PAGE, this.page.getValue()), C3cG.A0r(HatchMetadataKey.EXIT_TRIGGER, str), C3cG.A0r(HatchMetadataKey.RESULT, "completed"), C3cH.A0r(HatchMetadataKey.HAD_PENDING_SELECTION, visit.hasPendingSelection), C3cH.A0r(HatchMetadataKey.HAD_PREVIEW, visit.hadPreview)));
                this.visit = null;
                this._visitSequence.Af8(null);
            }
        }
    }

    public final Map<String, String> impressionMetadata(long j, Map<HatchMetadataKey, String> map) {
        Map<String, String> mapWireMetadata;
        C7384Etj.A0Y(map, 1);
        synchronized (this.lock) {
            Visit visit = this.visit;
            mapWireMetadata = (visit == null || visit.sequence != j) ? null : wireMetadata(map);
        }
        return mapWireMetadata;
    }

    public final void interaction(Interaction interaction, HatchComponent hatchComponent, Map<HatchMetadataKey, String> map, String str) {
        boolean zA1a = AnonymousClass002.A1a(interaction, hatchComponent);
        C7384Etj.A0Y(map, 2);
        synchronized (this.lock) {
            if (this.visit != null) {
                Map<String, String> mapWireMetadata = wireMetadata(map);
                int iOrdinal = interaction.ordinal();
                if (iOrdinal == 0) {
                    HatchInteractionLogger hatchInteractionLogger = HatchInteractionLogger.INSTANCE;
                    HatchSurface hatchSurface = HatchSurface.VOICE_MODE;
                    Page page = this.page;
                    hatchInteractionLogger.logClick(hatchSurface, page.getSubsurface(), page.getScreen(), hatchComponent, str, mapWireMetadata, null);
                } else if (iOrdinal == zA1a || iOrdinal == 2) {
                    HatchInteractionLogger hatchInteractionLogger2 = HatchInteractionLogger.INSTANCE;
                    boolean zA1Z = AnonymousClass002.A1Z(interaction, Interaction.TOGGLE_ON);
                    HatchSurface hatchSurface2 = HatchSurface.VOICE_MODE;
                    Page page2 = this.page;
                    hatchInteractionLogger2.logToggle(zA1Z, hatchSurface2, page2.getSubsurface(), page2.getScreen(), hatchComponent, str, mapWireMetadata);
                } else {
                    if (iOrdinal != 3) {
                        throw C3cG.A0q();
                    }
                    HatchInteractionLogger hatchInteractionLogger3 = HatchInteractionLogger.INSTANCE;
                    HatchSurface hatchSurface3 = HatchSurface.VOICE_MODE;
                    Page page3 = this.page;
                    hatchInteractionLogger3.logDismiss(hatchSurface3, page3.getSubsurface(), page3.getScreen(), hatchComponent, str, mapWireMetadata);
                }
            }
        }
    }

    public final SelectionCommit selectionCommit(String str) {
        SelectionCommit selectionCommit;
        C7384Etj.A0Y(str, 0);
        synchronized (this.lock) {
            selectionCommit = new SelectionCommit(this.page, wireMetadata(AnonymousClass006.A10(HatchMetadataKey.VOICE_ID, str)), SystemClock.elapsedRealtime());
        }
        return selectionCommit;
    }

    /* loaded from: classes2.dex */
    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Interaction.values().length];
            try {
                AnonymousClass002.A13(Interaction.CLICK, iArr);
            } catch (NoSuchFieldError unused) {
            }
            try {
                AnonymousClass002.A14(Interaction.TOGGLE_ON, iArr);
            } catch (NoSuchFieldError unused2) {
            }
            try {
                AnonymousClass002.A15(Interaction.TOGGLE_OFF, iArr);
            } catch (NoSuchFieldError unused3) {
            }
            try {
                AnonymousClass002.A16(Interaction.DISMISS, iArr);
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void interaction$default(VoiceTelemetry voiceTelemetry, Interaction interaction, HatchComponent hatchComponent, Map map, String str, int i, Object obj) {
        if ((i & 4) != 0) {
            map = C9jH.A00;
        }
        voiceTelemetry.interaction(interaction, hatchComponent, map, AnonymousClass006.A0u(i, str));
    }

    private final void logVisit(String str, Map<HatchMetadataKey, String> map) {
        HatchAppEventLogger.INSTANCE.logEvent("voice_settings_visit", HatchSurface.VOICE_MODE.getValue(), this.page.getSubsurface().getValue(), str, null, wireMetadata(map), null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Map wireMetadata$default(VoiceTelemetry voiceTelemetry, Map map, int i, Object obj) {
        if ((i & 1) != 0) {
            map = C9jH.A00;
        }
        return voiceTelemetry.wireMetadata(map);
    }

    public final void beginVisit() {
        synchronized (this.lock) {
            if (this.visit == null) {
                Visit visit = new Visit(nextVisitSequence.incrementAndGet());
                this.visit = visit;
                AnonymousClass002.A1I(this._visitSequence, Long.valueOf(visit.sequence));
                logVisit(WidgetComponentsKt.START_PATH, AnonymousClass006.A10(HatchMetadataKey.VOICE_PAGE, this.page.getValue()));
            }
        }
    }

    public final VoiceEntryPoint getEntryPoint() {
        return this.entryPoint;
    }

    public final boolean getHasActiveVisit() {
        boolean zA1X;
        synchronized (this.lock) {
            zA1X = AnonymousClass002.A1X(this.visit);
        }
        return zA1X;
    }

    public final C1BN<Map<Episode, Long>> getImpressionEpisodes() {
        return this.impressionEpisodes;
    }

    public final HatchOrigin getOrigin() {
        return this.entryPoint == VoiceEntryPoint.SETTINGS ? HatchOrigin.SETTINGS : HatchOrigin.CHAT;
    }

    public final Page getPage() {
        return this.page;
    }

    public final C1BN<Long> getVisitSequence() {
        return this.visitSequence;
    }

    public final void markPreview() {
        synchronized (this.lock) {
            Visit visit = this.visit;
            if (visit != null) {
                visit.hadPreview = true;
            }
        }
    }

    public final void setPendingSelection(boolean z) {
        synchronized (this.lock) {
            Visit visit = this.visit;
            if (visit != null) {
                visit.hasPendingSelection = z;
            }
        }
    }

    public VoiceTelemetry(VoiceEntryPoint voiceEntryPoint, Page page) {
        AnonymousClass003.A0u(voiceEntryPoint, page);
        this.entryPoint = voiceEntryPoint;
        this.page = page;
        this.lock = C3cG.A0T();
        C9286GCn c9286GCnA01 = HnJ.A01(null);
        this._visitSequence = c9286GCnA01;
        this.visitSequence = C3cG.A11(c9286GCnA01);
        C9286GCn c9286GCnA012 = HnJ.A01(C9jH.A00);
        this._impressionEpisodes = c9286GCnA012;
        this.impressionEpisodes = C3cG.A11(c9286GCnA012);
    }

    private final Map<String, String> wireMetadata(Map<HatchMetadataKey, String> map) {
        C0924AIa c0924AIaA0u = C3cG.A0u();
        LinkedHashMap linkedHashMapA0I = AIW.A0I(map);
        Iterator itA0n = AnonymousClass002.A0n(map);
        while (itA0n.hasNext()) {
            Map.Entry entryA0l = C3cH.A0l(itA0n);
            linkedHashMapA0I.put(((HatchMetadataKey) entryA0l.getKey()).getValue(), entryA0l.getValue());
        }
        c0924AIaA0u.putAll(linkedHashMapA0I);
        c0924AIaA0u.put(HatchMetadataKey.ENTRY_POINT.getValue(), this.entryPoint.getValue());
        c0924AIaA0u.put(HatchMetadataKey.VOICE_LOGGING_VERSION.getValue(), "1");
        Visit visit = this.visit;
        if (visit != null) {
            c0924AIaA0u.put(HatchMetadataKey.VOICE_VISIT_SEQ.getValue(), String.valueOf(visit.sequence));
        }
        return AIW.A0K(c0924AIaA0u);
    }
}
