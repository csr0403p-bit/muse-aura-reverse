package com.facebook.aura.partners.voice.viewmodel;

import X.AEs;
import X.AEu;
import X.AHD;
import X.AbstractC07127nr;
import X.AbstractC0878AGe;
import X.AbstractC3358CGz;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.AnonymousClass441;
import X.BLG;
import X.C06G;
import X.C06H;
import X.C0KA;
import X.C1BN;
import X.C20Q;
import X.C20Z;
import X.C3Es;
import X.C3Pi;
import X.C3UX;
import X.C3cG;
import X.C3cH;
import X.C3cI;
import X.C3rb;
import X.C60O;
import X.C7384Etj;
import X.C7BY;
import X.C8j4;
import X.C9286GCn;
import X.EnumC10460Hji;
import X.FGI;
import X.G0U;
import X.G0V;
import X.GDB;
import X.HnJ;
import X.HtJ;
import X.Hwg;
import com.facebook.aura.analytics.hatch.HatchComponent;
import com.facebook.aura.analytics.hatch.HatchInteractionLogger;
import com.facebook.aura.analytics.hatch.HatchScreen;
import com.facebook.aura.analytics.hatch.HatchSubsurface;
import com.facebook.aura.analytics.hatch.HatchSurface;
import com.facebook.aura.common.mvvm.AuraViewModelFactory;
import com.facebook.aura.devices.pairing.LinkEncryptedPairingKt;
import com.facebook.aura.installsource.AuraInstallSourceDetector;
import com.facebook.aura.model.VoiceOptionData;
import com.facebook.aura.model.VoiceOptionsWidgetData;
import com.facebook.aura.model.WidgetStateMutationHost;
import com.facebook.aura.partners.voice.api.VoiceCatalogRepository;
import com.facebook.aura.partners.voice.api.VoiceOption;
import com.facebook.aura.partners.voice.api.VoiceSelectionIdentity;
import com.facebook.aura.partners.voice.intf.VoiceCallStateHolder;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final class VoiceControlsViewModel extends AEs {
    public static final int $stable = 8;
    public static final Companion Companion = new Companion();
    public static final AtomicLong nextPreviewOwnerId = new AtomicLong();
    public final BLG<UiState> catalogState;
    public final BLG<VoiceOptionData> pendingWidgetVoice;
    public final String previewOwnerId;
    public final VoicePreviewPlayer previewPlayer;
    public final boolean restartCallOnSwitch;
    public String sampleLine;
    public final List<String> suggestedVoiceIds;
    public final C1BN<UiState> uiState;
    public final AbstractC3358CGz userSession;
    public final VoiceCallStateHolder voiceCallStateHolder;
    public final VoiceCatalogRepository voiceCatalogRepository;
    public final C1BN<WidgetUiState> widgetUiState;

    public final class Companion {
        public final AtomicLong getNextPreviewOwnerId() {
            return VoiceControlsViewModel.nextPreviewOwnerId;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public final class Factory extends AuraViewModelFactory<VoiceControlsViewModel> {
        public static final int $stable = 8;
        public final boolean loadCatalog;
        public final boolean restartCallOnSwitch;
        public final List<String> suggestedVoiceIds;
        public final AbstractC3358CGz userSession;
        public final VoiceOptionsWidgetData widgetData;
        public final String widgetId;

        public /* synthetic */ Factory(AbstractC3358CGz abstractC3358CGz, List list, boolean z, boolean z2, String str, VoiceOptionsWidgetData voiceOptionsWidgetData, int i, C06H c06h) {
            this(abstractC3358CGz, list, (i & 4) != 0 ? true : z, (i & 8) != 0 ? true : z2, (i & 16) != 0 ? null : str, (i & 32) != 0 ? null : voiceOptionsWidgetData);
        }

        @Override // com.facebook.aura.common.mvvm.AuraViewModelFactory
        public VoiceControlsViewModel create() {
            return new VoiceControlsViewModel(this.userSession, this.suggestedVoiceIds, this.restartCallOnSwitch, this.loadCatalog, this.widgetId, this.widgetData);
        }

        public Factory(AbstractC3358CGz abstractC3358CGz, List<String> list, boolean z, boolean z2, String str, VoiceOptionsWidgetData voiceOptionsWidgetData) {
            AnonymousClass003.A0u(abstractC3358CGz, list);
            this.userSession = abstractC3358CGz;
            this.suggestedVoiceIds = list;
            this.restartCallOnSwitch = z;
            this.loadCatalog = z2;
            this.widgetId = str;
            this.widgetData = voiceOptionsWidgetData;
        }
    }

    /* loaded from: classes.dex */
    public interface UiState {

        /* loaded from: classes4.dex */
        public final class Error implements UiState {
            public static final int $stable = 0;
            public static final Error INSTANCE = new Error();

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof Error);
            }

            public String toString() {
                return "Error";
            }

            public int hashCode() {
                return -1977507682;
            }
        }

        /* loaded from: classes4.dex */
        public final class Loaded extends C06G implements PreviewState {
            public static final int $stable = 0;
            public final String onboardingLine;
            public final String previewLoadingVoiceId;
            public final String previewPlayingVoiceId;
            public final String selectedVoiceId;
            public final AHD<VoiceOption> voices;

            public final Loaded copy(AHD<VoiceOption> ahd, String str, String str2, String str3, String str4) {
                C7384Etj.A0Y(ahd, 0);
                return new Loaded(ahd, str, str2, str3, str4);
            }

            public boolean equals(Object obj) {
                if (this != obj) {
                    if (obj instanceof Loaded) {
                        Loaded loaded = (Loaded) obj;
                        if (!C7384Etj.areEqual(this.voices, loaded.voices) || !C7384Etj.areEqual(this.selectedVoiceId, loaded.selectedVoiceId) || !C7384Etj.areEqual(this.previewLoadingVoiceId, loaded.previewLoadingVoiceId) || !C7384Etj.areEqual(this.previewPlayingVoiceId, loaded.previewPlayingVoiceId) || !C7384Etj.areEqual(this.onboardingLine, loaded.onboardingLine)) {
                        }
                    }
                    return false;
                }
                return true;
            }

            public /* synthetic */ Loaded(AHD ahd, String str, String str2, String str3, String str4, int i, C06H c06h) {
                this(ahd, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : str4);
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ Loaded copy$default(Loaded loaded, AHD ahd, String str, String str2, String str3, String str4, int i, Object obj) {
                if ((i & 1) != 0) {
                    ahd = loaded.voices;
                }
                if ((i & 2) != 0) {
                    str = loaded.selectedVoiceId;
                }
                if ((i & 4) != 0) {
                    str2 = loaded.previewLoadingVoiceId;
                }
                if ((i & 8) != 0) {
                    str3 = loaded.previewPlayingVoiceId;
                }
                if ((i & 16) != 0) {
                    str4 = loaded.onboardingLine;
                }
                return loaded.copy(ahd, str, str2, str3, str4);
            }

            public final AHD<VoiceOption> component1() {
                return this.voices;
            }

            public final String component2() {
                return this.selectedVoiceId;
            }

            public final String component3() {
                return this.previewLoadingVoiceId;
            }

            public final String component4() {
                return this.previewPlayingVoiceId;
            }

            public final String component5() {
                return this.onboardingLine;
            }

            public final String getOnboardingLine() {
                return this.onboardingLine;
            }

            @Override // com.facebook.aura.partners.voice.viewmodel.VoiceControlsViewModel.UiState.PreviewState
            public String getPreviewLoadingVoiceId() {
                return this.previewLoadingVoiceId;
            }

            @Override // com.facebook.aura.partners.voice.viewmodel.VoiceControlsViewModel.UiState.PreviewState
            public String getPreviewPlayingVoiceId() {
                return this.previewPlayingVoiceId;
            }

            public final String getSelectedVoiceId() {
                return this.selectedVoiceId;
            }

            public final AHD<VoiceOption> getVoices() {
                return this.voices;
            }

            public int hashCode() {
                return ((((((AnonymousClass005.A0E(this.voices) + AnonymousClass006.A0G(this.selectedVoiceId)) * 31) + AnonymousClass006.A0G(this.previewLoadingVoiceId)) * 31) + AnonymousClass006.A0G(this.previewPlayingVoiceId)) * 31) + AnonymousClass005.A0H(this.onboardingLine);
            }

            public String toString() {
                return super.toString();
            }

            public Loaded(AHD<VoiceOption> ahd, String str, String str2, String str3, String str4) {
                C7384Etj.A0Y(ahd, 0);
                this.voices = ahd;
                this.selectedVoiceId = str;
                this.previewLoadingVoiceId = str2;
                this.previewPlayingVoiceId = str3;
                this.onboardingLine = str4;
            }
        }

        /* loaded from: classes4.dex */
        public final class Loading implements UiState {
            public static final int $stable = 0;
            public static final Loading INSTANCE = new Loading();

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof Loading);
            }

            public String toString() {
                return "Loading";
            }

            public int hashCode() {
                return -193699246;
            }
        }

        /* loaded from: classes4.dex */
        public final class PreviewOnly extends C06G implements PreviewState {
            public static final int $stable = 0;
            public final String previewLoadingVoiceId;
            public final String previewPlayingVoiceId;

            public boolean equals(Object obj) {
                if (this != obj) {
                    if (obj instanceof PreviewOnly) {
                        PreviewOnly previewOnly = (PreviewOnly) obj;
                        if (!C7384Etj.areEqual(this.previewLoadingVoiceId, previewOnly.previewLoadingVoiceId) || !C7384Etj.areEqual(this.previewPlayingVoiceId, previewOnly.previewPlayingVoiceId)) {
                        }
                    }
                    return false;
                }
                return true;
            }

            public static /* synthetic */ PreviewOnly copy$default(PreviewOnly previewOnly, String str, String str2, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = previewOnly.previewLoadingVoiceId;
                }
                if ((i & 2) != 0) {
                    str2 = previewOnly.previewPlayingVoiceId;
                }
                return new PreviewOnly(str, str2);
            }

            public final String component1() {
                return this.previewLoadingVoiceId;
            }

            public final String component2() {
                return this.previewPlayingVoiceId;
            }

            public final PreviewOnly copy(String str, String str2) {
                return new PreviewOnly(str, str2);
            }

            @Override // com.facebook.aura.partners.voice.viewmodel.VoiceControlsViewModel.UiState.PreviewState
            public String getPreviewLoadingVoiceId() {
                return this.previewLoadingVoiceId;
            }

            @Override // com.facebook.aura.partners.voice.viewmodel.VoiceControlsViewModel.UiState.PreviewState
            public String getPreviewPlayingVoiceId() {
                return this.previewPlayingVoiceId;
            }

            public int hashCode() {
                return (AnonymousClass006.A0G(this.previewLoadingVoiceId) * 31) + AnonymousClass005.A0H(this.previewPlayingVoiceId);
            }

            public PreviewOnly(String str, String str2) {
                this.previewLoadingVoiceId = str;
                this.previewPlayingVoiceId = str2;
            }

            public String toString() {
                return super.toString();
            }

            public /* synthetic */ PreviewOnly(String str, String str2, int i, C06H c06h) {
                this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2);
            }

            public PreviewOnly() {
                this(null, null);
            }
        }

        public interface PreviewState extends UiState {
            String getPreviewLoadingVoiceId();

            String getPreviewPlayingVoiceId();
        }
    }

    public final class WidgetUiState extends C06G {
        public static final int $stable = VoiceOptionData.$stable;
        public final boolean canChooseVoice;
        public final UiState.Loaded loaded;
        public final VoiceOptionData pendingVoice;

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof WidgetUiState) {
                    WidgetUiState widgetUiState = (WidgetUiState) obj;
                    if (!C7384Etj.areEqual(this.loaded, widgetUiState.loaded) || !C7384Etj.areEqual(this.pendingVoice, widgetUiState.pendingVoice) || this.canChooseVoice != widgetUiState.canChooseVoice) {
                    }
                }
                return false;
            }
            return true;
        }

        public static /* synthetic */ WidgetUiState copy$default(WidgetUiState widgetUiState, UiState.Loaded loaded, VoiceOptionData voiceOptionData, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                loaded = widgetUiState.loaded;
            }
            if ((i & 2) != 0) {
                voiceOptionData = widgetUiState.pendingVoice;
            }
            if ((i & 4) != 0) {
                z = widgetUiState.canChooseVoice;
            }
            return new WidgetUiState(loaded, voiceOptionData, z);
        }

        public final UiState.Loaded component1() {
            return this.loaded;
        }

        public final VoiceOptionData component2() {
            return this.pendingVoice;
        }

        public final boolean component3() {
            return this.canChooseVoice;
        }

        public final WidgetUiState copy(UiState.Loaded loaded, VoiceOptionData voiceOptionData, boolean z) {
            return new WidgetUiState(loaded, voiceOptionData, z);
        }

        public final boolean getCanChooseVoice() {
            return this.canChooseVoice;
        }

        public final UiState.Loaded getLoaded() {
            return this.loaded;
        }

        public final VoiceOptionData getPendingVoice() {
            return this.pendingVoice;
        }

        public int hashCode() {
            return C0KA.A00(((AnonymousClass006.A0D(this.loaded) * 31) + C3cH.A02(this.pendingVoice)) * 31, this.canChooseVoice);
        }

        public WidgetUiState(UiState.Loaded loaded, VoiceOptionData voiceOptionData, boolean z) {
            this.loaded = loaded;
            this.pendingVoice = voiceOptionData;
            this.canChooseVoice = z;
        }

        public String toString() {
            return super.toString();
        }

        public /* synthetic */ WidgetUiState(UiState.Loaded loaded, VoiceOptionData voiceOptionData, boolean z, int i, C06H c06h) {
            this((i & 1) != 0 ? null : loaded, (i & 2) != 0 ? null : voiceOptionData, AnonymousClass005.A1O(i, z));
        }

        public WidgetUiState() {
            this(null, null, false);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.partners.voice.viewmodel.VoiceControlsViewModel$loadVoices$1", f = "VoiceControlsViewModel.kt", l = {150}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.partners.voice.viewmodel.VoiceControlsViewModel$loadVoices$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ Locale $locale;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(Locale locale, HtJ<? super AnonymousClass1> htJ) {
            super(2, htJ);
            this.$locale = locale;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return VoiceControlsViewModel.this.new AnonymousClass1(this.$locale, htJ);
        }

        /* JADX WARN: Removed duplicated region for block: B:20:0x003b  */
        /* JADX WARN: Removed duplicated region for block: B:23:0x0040  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x0063  */
        @Override // X.AbstractC8884Fsp
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r8) {
            /*
                r7 = this;
                X.Hji r4 = X.EnumC10460Hji.A02
                int r0 = r7.label
                r3 = 1
                if (r0 == 0) goto L9c
                if (r0 != r3) goto Lb0
                X.Hwg.A00(r8)
            Lc:
                com.facebook.aura.partners.voice.api.VoiceCatalog r8 = (com.facebook.aura.partners.voice.api.VoiceCatalog) r8
                com.facebook.aura.partners.voice.viewmodel.VoiceControlsViewModel r3 = com.facebook.aura.partners.voice.viewmodel.VoiceControlsViewModel.this
                r5 = 0
                if (r8 == 0) goto L99
                java.lang.String r1 = r8.sampleLine
            L15:
                int r0 = com.facebook.aura.partners.voice.viewmodel.VoiceControlsViewModel.$stable
                r3.sampleLine = r1
                X.BLG<com.facebook.aura.partners.voice.viewmodel.VoiceControlsViewModel$UiState> r2 = r3.catalogState
                if (r8 != 0) goto L25
                com.facebook.aura.partners.voice.viewmodel.VoiceControlsViewModel$UiState$Error r3 = com.facebook.aura.partners.voice.viewmodel.VoiceControlsViewModel.UiState.Error.INSTANCE
            L1f:
                r2.Af8(r3)
                kotlin.Unit r0 = kotlin.Unit.INSTANCE
                return r0
            L25:
                com.facebook.aura.partners.voice.prefs.VoicePrefs r1 = com.facebook.aura.partners.voice.prefs.VoicePrefs.INSTANCE
                X.CGz r0 = r3.userSession
                java.lang.String r3 = r1.selectedVoiceId(r0)
                if (r3 == 0) goto L3b
                java.util.List<com.facebook.aura.partners.voice.api.VoiceOption> r1 = r8.voices
                boolean r0 = r1 instanceof java.util.Collection
                if (r0 == 0) goto L84
                boolean r0 = r1.isEmpty()
                if (r0 == 0) goto L84
            L3b:
                r3 = r5
            L3c:
                java.lang.String r4 = r8.currentVoiceId
                if (r4 == 0) goto L4c
                java.util.List<com.facebook.aura.partners.voice.api.VoiceOption> r1 = r8.voices
                boolean r0 = r1 instanceof java.util.Collection
                if (r0 == 0) goto L6e
                boolean r0 = r1.isEmpty()
                if (r0 == 0) goto L6e
            L4c:
                com.facebook.aura.partners.voice.viewmodel.VoiceControlsViewModel r4 = com.facebook.aura.partners.voice.viewmodel.VoiceControlsViewModel.this
                java.util.List<com.facebook.aura.partners.voice.api.VoiceOption> r1 = r8.voices
                java.util.Locale r0 = r7.$locale
                X.C7384Etj.A0X(r0)
                java.util.List r0 = com.facebook.aura.partners.voice.viewmodel.VoiceOptionOrderingKt.sortedForVoiceSelection(r1, r0)
                java.util.List r0 = com.facebook.aura.partners.voice.viewmodel.VoiceControlsViewModel.access$applySuggestedOrdering(r4, r0)
                X.AHD r4 = X.AGI.A07(r0)
                if (r5 != 0) goto L64
                r5 = r3
            L64:
                java.lang.String r8 = r8.onboardingLine
                r6 = 0
                com.facebook.aura.partners.voice.viewmodel.VoiceControlsViewModel$UiState$Loaded r3 = new com.facebook.aura.partners.voice.viewmodel.VoiceControlsViewModel$UiState$Loaded
                r7 = r6
                r3.<init>(r4, r5, r6, r7, r8)
                goto L1f
            L6e:
                java.util.Iterator r1 = r1.iterator()
            L72:
                boolean r0 = r1.hasNext()
                if (r0 == 0) goto L4c
                java.lang.String r0 = X.C8j4.A0z(r1)
                boolean r0 = r4.equals(r0)
                if (r0 == 0) goto L72
                r5 = r4
                goto L4c
            L84:
                java.util.Iterator r1 = r1.iterator()
            L88:
                boolean r0 = r1.hasNext()
                if (r0 == 0) goto L3b
                java.lang.String r0 = X.C8j4.A0z(r1)
                boolean r0 = r3.equals(r0)
                if (r0 == 0) goto L88
                goto L3c
            L99:
                r1 = r5
                goto L15
            L9c:
                X.Hwg.A00(r8)
                com.facebook.aura.partners.voice.viewmodel.VoiceControlsViewModel r2 = com.facebook.aura.partners.voice.viewmodel.VoiceControlsViewModel.this
                int r0 = com.facebook.aura.partners.voice.viewmodel.VoiceControlsViewModel.$stable
                com.facebook.aura.partners.voice.api.VoiceCatalogRepository r1 = r2.voiceCatalogRepository
                X.CGz r0 = r2.userSession
                r7.label = r3
                java.lang.Object r8 = r1.fetchAvailableVoices(r0, r7)
                if (r8 != r4) goto Lc
                return r4
            Lb0:
                java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.partners.voice.viewmodel.VoiceControlsViewModel.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ((AnonymousClass1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.partners.voice.viewmodel.VoiceControlsViewModel$onWidgetVoiceChosen$1", f = "VoiceControlsViewModel.kt", l = {237}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.partners.voice.viewmodel.VoiceControlsViewModel$onWidgetVoiceChosen$1, reason: invalid class name and case insensitive filesystem */
    public final class C133461 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ WidgetStateMutationHost $host;
        public final /* synthetic */ String $hostMessageId;
        public final /* synthetic */ Function0<Unit> $onConfirmed;
        public final /* synthetic */ String $selectedText;
        public final /* synthetic */ String $voiceId;
        public final /* synthetic */ String $widgetId;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C133461(WidgetStateMutationHost widgetStateMutationHost, String str, String str2, String str3, String str4, Function0<Unit> function0, HtJ<? super C133461> htJ) {
            super(2, htJ);
            this.$host = widgetStateMutationHost;
            this.$hostMessageId = str;
            this.$widgetId = str2;
            this.$voiceId = str3;
            this.$selectedText = str4;
            this.$onConfirmed = function0;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return VoiceControlsViewModel.this.new C133461(this.$host, this.$hostMessageId, this.$widgetId, this.$voiceId, this.$selectedText, this.$onConfirmed, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                VoiceControlsViewModel voiceControlsViewModel = VoiceControlsViewModel.this;
                WidgetStateMutationHost widgetStateMutationHost = this.$host;
                String str = this.$hostMessageId;
                String str2 = this.$widgetId;
                String str3 = this.$voiceId;
                String str4 = this.$selectedText;
                this.label = 1;
                obj = voiceControlsViewModel.confirmWidgetVoiceChoice(widgetStateMutationHost, str, str2, str3, str4, this);
                if (obj == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
            }
            if (AnonymousClass001.A1X(obj)) {
                this.$onConfirmed.invoke();
            }
            return Unit.INSTANCE;
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ((C133461) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.partners.voice.viewmodel.VoiceControlsViewModel$selectPlayingWidgetVoice$1", f = "VoiceControlsViewModel.kt", l = {AuraInstallSourceDetector.SYSTEM_IMAGE_FLAGS}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.partners.voice.viewmodel.VoiceControlsViewModel$selectPlayingWidgetVoice$1, reason: invalid class name and case insensitive filesystem */
    public final class C133471 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ List<VoiceOptionData> $options;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C133471(List<VoiceOptionData> list, HtJ<? super C133471> htJ) {
            super(2, htJ);
            this.$options = list;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return VoiceControlsViewModel.this.new C133471(this.$options, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                final VoiceControlsViewModel voiceControlsViewModel = VoiceControlsViewModel.this;
                int i2 = VoiceControlsViewModel.$stable;
                C20Q c20qA01 = GDB.A01(new VoiceControlsViewModel$selectPlayingWidgetVoice$1$invokeSuspend$$inlined$map$1(voiceControlsViewModel.previewPlayer.playback, this.$options, voiceControlsViewModel));
                C20Z c20z = new C20Z() { // from class: com.facebook.aura.partners.voice.viewmodel.VoiceControlsViewModel.selectPlayingWidgetVoice.1.2
                    public final Object emit(VoiceOptionData voiceOptionData, HtJ<? super Unit> htJ) {
                        if (voiceOptionData != null) {
                            VoiceControlsViewModel voiceControlsViewModel2 = voiceControlsViewModel;
                            int i3 = VoiceControlsViewModel.$stable;
                            AnonymousClass002.A1I(voiceControlsViewModel2.pendingWidgetVoice, voiceOptionData);
                        }
                        return Unit.INSTANCE;
                    }

                    @Override // X.C20Z
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, HtJ htJ) {
                        return emit((VoiceOptionData) obj2, (HtJ<? super Unit>) htJ);
                    }
                };
                this.label = 1;
                if (c20qA01.collect(c20z, this) == enumC10460Hji) {
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
            return ((C133471) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* renamed from: com.facebook.aura.partners.voice.viewmodel.VoiceControlsViewModel$selectVoice$1, reason: invalid class name and case insensitive filesystem */
    public final class C133481 extends AbstractC7559F3s implements G0U<UiState.Loaded, UiState.Loaded> {
        public final /* synthetic */ VoiceOption $resolvedVoice;

        @Override // X.G0U
        public final UiState.Loaded invoke(UiState.Loaded loaded) {
            C7384Etj.A0Y(loaded, 0);
            return loaded.copy(loaded.voices, this.$resolvedVoice.id, loaded.previewLoadingVoiceId, loaded.previewPlayingVoiceId, loaded.onboardingLine);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C133481(VoiceOption voiceOption) {
            super(1);
            this.$resolvedVoice = voiceOption;
        }
    }

    /* renamed from: com.facebook.aura.partners.voice.viewmodel.VoiceControlsViewModel$selectVoice$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0U<Boolean, Unit> {
        public final /* synthetic */ String $previousVoiceId;
        public final /* synthetic */ VoiceOption $resolvedVoice;

        /* renamed from: com.facebook.aura.partners.voice.viewmodel.VoiceControlsViewModel$selectVoice$2$1, reason: invalid class name */
        public final class AnonymousClass1 extends AbstractC7559F3s implements G0U<UiState.Loaded, UiState.Loaded> {
            public final /* synthetic */ String $previousVoiceId;

            @Override // X.G0U
            public final UiState.Loaded invoke(UiState.Loaded loaded) {
                C7384Etj.A0Y(loaded, 0);
                return loaded.copy(loaded.voices, this.$previousVoiceId, loaded.previewLoadingVoiceId, loaded.previewPlayingVoiceId, loaded.onboardingLine);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(String str) {
                super(1);
                this.$previousVoiceId = str;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(VoiceOption voiceOption, String str) {
            super(1);
            this.$resolvedVoice = voiceOption;
            this.$previousVoiceId = str;
        }

        public final void invoke(boolean z) {
            VoiceControlsViewModel voiceControlsViewModel = VoiceControlsViewModel.this;
            if (!z) {
                UiState.Loaded loaded = voiceControlsViewModel.loaded();
                if (C7384Etj.areEqual(loaded != null ? loaded.selectedVoiceId : null, this.$resolvedVoice.id)) {
                    VoiceControlsViewModel.this.updateLoaded(new AnonymousClass1(this.$previousVoiceId));
                    return;
                }
                return;
            }
            int i = VoiceControlsViewModel.$stable;
            if (voiceControlsViewModel.restartCallOnSwitch && C3cH.A1P(voiceControlsViewModel.voiceCallStateHolder)) {
                VoiceControlsViewModel.this.voiceCallStateHolder.requestRestart(null);
            }
        }

        @Override // X.G0U
        public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
            invoke(AnonymousClass001.A1X(bool));
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:18:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x003b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.facebook.aura.partners.voice.viewmodel.VoiceControlsViewModel.UiState withPreview(com.facebook.aura.partners.voice.viewmodel.VoiceControlsViewModel.UiState r6, com.facebook.aura.partners.voice.viewmodel.VoicePreviewPlayback r7) {
        /*
            r5 = this;
            r2 = r6
            r6 = 0
            if (r7 == 0) goto L45
            com.facebook.aura.partners.voice.viewmodel.VoicePreviewKey r0 = r7.key
            java.lang.String r1 = r0.ownerId
            java.lang.String r0 = r5.previewOwnerId
            boolean r0 = X.C7384Etj.areEqual(r1, r0)
            if (r0 == 0) goto L45
            com.facebook.aura.partners.voice.viewmodel.VoicePreviewPhase r1 = r7.phase
            com.facebook.aura.partners.voice.viewmodel.VoicePreviewPhase r0 = com.facebook.aura.partners.voice.viewmodel.VoicePreviewPhase.LOADING
            if (r1 != r0) goto L46
            com.facebook.aura.partners.voice.viewmodel.VoicePreviewKey r0 = r7.key
            if (r0 == 0) goto L46
            java.lang.String r5 = r0.rowId
        L1c:
            com.facebook.aura.partners.voice.viewmodel.VoicePreviewPhase r1 = r7.phase
            com.facebook.aura.partners.voice.viewmodel.VoicePreviewPhase r0 = com.facebook.aura.partners.voice.viewmodel.VoicePreviewPhase.PLAYING
            if (r1 != r0) goto L28
            com.facebook.aura.partners.voice.viewmodel.VoicePreviewKey r0 = r7.key
            if (r0 == 0) goto L28
            java.lang.String r6 = r0.rowId
        L28:
            boolean r0 = r2 instanceof com.facebook.aura.partners.voice.viewmodel.VoiceControlsViewModel.UiState.Loaded
            if (r0 == 0) goto L3b
            com.facebook.aura.partners.voice.viewmodel.VoiceControlsViewModel$UiState$Loaded r2 = (com.facebook.aura.partners.voice.viewmodel.VoiceControlsViewModel.UiState.Loaded) r2
            X.AHD<com.facebook.aura.partners.voice.api.VoiceOption> r3 = r2.voices
            java.lang.String r4 = r2.selectedVoiceId
            java.lang.String r7 = r2.onboardingLine
            com.facebook.aura.partners.voice.viewmodel.VoiceControlsViewModel$UiState$Loaded r2 = r2.copy(r3, r4, r5, r6, r7)
        L38:
            com.facebook.aura.partners.voice.viewmodel.VoiceControlsViewModel$UiState r2 = (com.facebook.aura.partners.voice.viewmodel.VoiceControlsViewModel.UiState) r2
        L3a:
            return r2
        L3b:
            boolean r0 = r2 instanceof com.facebook.aura.partners.voice.viewmodel.VoiceControlsViewModel.UiState.PreviewOnly
            if (r0 == 0) goto L3a
            com.facebook.aura.partners.voice.viewmodel.VoiceControlsViewModel$UiState$PreviewOnly r2 = new com.facebook.aura.partners.voice.viewmodel.VoiceControlsViewModel$UiState$PreviewOnly
            r2.<init>(r5, r6)
            goto L38
        L45:
            r7 = r6
        L46:
            r5 = r6
            if (r7 == 0) goto L28
            goto L1c
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.partners.voice.viewmodel.VoiceControlsViewModel.withPreview(com.facebook.aura.partners.voice.viewmodel.VoiceControlsViewModel$UiState, com.facebook.aura.partners.voice.viewmodel.VoicePreviewPlayback):com.facebook.aura.partners.voice.viewmodel.VoiceControlsViewModel$UiState");
    }

    public final void onChatVoiceChosen(String str, String str2, String str3, VoiceSelectionIdentity voiceSelectionIdentity, String str4, String str5, String str6, String str7) {
        AnonymousClass005.A0x(str, str2, str3);
        C7384Etj.A0Y(str4, 4);
        if (C7BY.A0j(str)) {
            return;
        }
        stopPreview();
        VoiceWidgetSelectionCoordinator.Companion.getInstance(this.userSession).sendVoiceChoice(str, str2, str3, voiceSelectionIdentity, str4, str7, str5, str6);
    }

    public final void onWidgetVoiceChoice(String str, HatchScreen hatchScreen) {
        AnonymousClass003.A0u(str, hatchScreen);
        stopPreview();
        HatchInteractionLogger.INSTANCE.logClick(HatchSurface.VOICE_MODE, HatchSubsurface.COMPOSER, hatchScreen, HatchComponent.VOICE_OPTIONS_SWITCH_VOICE, str, null, null);
    }

    public final void onWidgetVoiceChosen(WidgetStateMutationHost widgetStateMutationHost, String str, String str2, String str3, String str4, HatchScreen hatchScreen, Function0<Unit> function0) {
        C7384Etj.A0Y(str, 1);
        AnonymousClass005.A16(str2, str3, str4, hatchScreen, 2);
        C7384Etj.A0Y(function0, 6);
        if (widgetStateMutationHost != null) {
            onWidgetVoiceChoice(str3, hatchScreen);
            AnonymousClass001.A1J(new C133461(widgetStateMutationHost, str, str2, str3, str4, function0, null), AEu.A00(this));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x004b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onWidgetVoicePreview(com.facebook.aura.model.VoiceOptionData r14, boolean r15, java.lang.String r16, com.facebook.aura.analytics.hatch.HatchScreen r17) {
        /*
            r13 = this;
            r2 = 0
            r3 = r14
            r14 = r16
            r7 = r17
            X.AnonymousClass005.A11(r3, r14, r7, r2)
            r12 = r13
            if (r15 == 0) goto L4b
            X.BLG<com.facebook.aura.model.VoiceOptionData> r0 = r13.pendingWidgetVoice
            java.lang.Object r0 = r0.getValue()
            com.facebook.aura.model.VoiceOptionData r0 = (com.facebook.aura.model.VoiceOptionData) r0
            if (r0 == 0) goto L49
            java.lang.String r1 = r0.voiceId
        L18:
            java.lang.String r0 = r3.voiceId
            boolean r0 = X.C7384Etj.areEqual(r1, r0)
            if (r0 != 0) goto L4b
            r1 = 1
            X.BLG<com.facebook.aura.model.VoiceOptionData> r0 = r13.pendingWidgetVoice
            X.AnonymousClass002.A1I(r0, r3)
        L26:
            com.facebook.aura.analytics.hatch.HatchInteractionLogger r4 = com.facebook.aura.analytics.hatch.HatchInteractionLogger.INSTANCE
            com.facebook.aura.analytics.hatch.HatchSurface r5 = com.facebook.aura.analytics.hatch.HatchSurface.VOICE_MODE
            com.facebook.aura.analytics.hatch.HatchSubsurface r6 = com.facebook.aura.analytics.hatch.HatchSubsurface.COMPOSER
            if (r1 == 0) goto L46
            com.facebook.aura.analytics.hatch.HatchComponent r8 = com.facebook.aura.analytics.hatch.HatchComponent.VOICE_OPTIONS_SELECT_VOICE
        L30:
            java.lang.String r9 = r3.voiceId
            r10 = 0
            r11 = r10
            r4.logClick(r5, r6, r7, r8, r9, r10, r11)
            com.facebook.aura.partners.voice.api.VoiceOption r13 = com.facebook.aura.partners.voice.viewmodel.VoiceControlsViewModelKt.toVoiceOption(r3)
            java.lang.String r0 = r13.id
            r15 = r10
            r17 = r2
            r16 = r0
            r12.togglePreview(r13, r14, r15, r16, r17)
            return
        L46:
            com.facebook.aura.analytics.hatch.HatchComponent r8 = com.facebook.aura.analytics.hatch.HatchComponent.VOICE_OPTIONS_PLAY_SAMPLE
            goto L30
        L49:
            r1 = 0
            goto L18
        L4b:
            r1 = 0
            goto L26
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.partners.voice.viewmodel.VoiceControlsViewModel.onWidgetVoicePreview(com.facebook.aura.model.VoiceOptionData, boolean, java.lang.String, com.facebook.aura.analytics.hatch.HatchScreen):void");
    }

    public final void prefetchWidgetPreviews(String str, String str2, List<String> list, String str3) {
        AnonymousClass005.A14(str, str2, list, str3);
        VoiceCatalogRepository voiceCatalogRepository = this.voiceCatalogRepository;
        AbstractC3358CGz abstractC3358CGz = this.userSession;
        String str4 = this.sampleLine;
        if (str4 == null) {
            str4 = str3;
        }
        voiceCatalogRepository.prefetchWidgetPreviews(abstractC3358CGz, str, str2, list, str4);
    }

    public final boolean prepareWidgetVoiceSelection(WidgetStateMutationHost widgetStateMutationHost, String str, String str2, HatchScreen hatchScreen) {
        AnonymousClass005.A11(str, str2, hatchScreen, 1);
        if (widgetStateMutationHost == null || !VoiceWidgetSelectionCoordinator.Companion.getInstance(this.userSession).prepare(widgetStateMutationHost, str, str2)) {
            return false;
        }
        stopPreview();
        HatchInteractionLogger.INSTANCE.logClick(HatchSurface.VOICE_MODE, HatchSubsurface.COMPOSER, hatchScreen, HatchComponent.VOICE_OPTIONS_BROWSE_ALL, null, null, null);
        return true;
    }

    public final void selectVoice(VoiceOption voiceOption) {
        AHD<VoiceOption> ahd;
        C7384Etj.A0Y(voiceOption, 0);
        UiState.Loaded loaded = loaded();
        Object obj = null;
        String str = loaded != null ? loaded.selectedVoiceId : null;
        if (C7384Etj.areEqual(str, voiceOption.id)) {
            return;
        }
        UiState.Loaded loaded2 = loaded();
        if (loaded2 != null && (ahd = loaded2.voices) != null) {
            Iterator it = ahd.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                if (C7384Etj.areEqual(((VoiceOption) next).id, voiceOption.id)) {
                    obj = next;
                    break;
                }
            }
            VoiceOption voiceOption2 = (VoiceOption) obj;
            if (voiceOption2 != null) {
                voiceOption = voiceOption2;
            }
        }
        updateLoaded(new C133481(voiceOption));
        VoiceSelectionRepository.Companion.getInstance(this.userSession).persistSelection(this.userSession, voiceOption, new AnonymousClass2(voiceOption, str));
    }

    public /* synthetic */ VoiceControlsViewModel(AbstractC3358CGz abstractC3358CGz, List list, boolean z, boolean z2, String str, VoiceOptionsWidgetData voiceOptionsWidgetData, int i, C06H c06h) {
        this(abstractC3358CGz, list, (i & 4) != 0 ? true : z, (i & 8) != 0 ? true : z2, (i & 16) != 0 ? null : str, (i & 32) != 0 ? null : voiceOptionsWidgetData);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<VoiceOption> applySuggestedOrdering(List<VoiceOption> list) {
        if (this.suggestedVoiceIds.isEmpty()) {
            return list;
        }
        LinkedHashMap linkedHashMapA15 = C60O.A15(AnonymousClass005.A0C(list));
        for (VoiceOption voiceOption : list) {
            linkedHashMapA15.put(voiceOption.id, voiceOption);
        }
        List listA0T = AbstractC0878AGe.A0T(this.suggestedVoiceIds);
        ArrayList arrayListA0h = C3cG.A0h();
        Iterator it = listA0T.iterator();
        while (it.hasNext()) {
            Object obj = linkedHashMapA15.get(it.next());
            if (obj != null) {
                arrayListA0h.add(obj);
            }
        }
        if (arrayListA0h.isEmpty() || arrayListA0h.size() == linkedHashMapA15.size()) {
            return list;
        }
        LinkedHashSet linkedHashSetA0k = C3cG.A0k();
        Iterator it2 = arrayListA0h.iterator();
        while (it2.hasNext()) {
            linkedHashSetA0k.add(C8j4.A0z(it2));
        }
        ArrayList arrayListA0h2 = C3cG.A0h();
        for (VoiceOption voiceOption2 : list) {
            if (!linkedHashSetA0k.contains(voiceOption2.id)) {
                arrayListA0h2.add(voiceOption2);
            }
        }
        return AbstractC0878AGe.A0P(arrayListA0h2, arrayListA0h);
    }

    private final void loadVoices() {
        this.catalogState.Af8(UiState.Loading.INSTANCE);
        Locale locale = Locale.getDefault();
        AnonymousClass001.A1I(AnonymousClass001.A0y(), new AnonymousClass1(locale, null), AEu.A00(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final UiState.Loaded loaded() {
        UiState value = this.catalogState.getValue();
        if (value instanceof UiState.Loaded) {
            return (UiState.Loaded) value;
        }
        return null;
    }

    public static /* synthetic */ void onChatVoiceChosen$default(VoiceControlsViewModel voiceControlsViewModel, String str, String str2, String str3, VoiceSelectionIdentity voiceSelectionIdentity, String str4, String str5, String str6, String str7, int i, Object obj) {
        if ((i & 128) != 0) {
            str7 = null;
        }
        voiceControlsViewModel.onChatVoiceChosen(str, str2, str3, voiceSelectionIdentity, str4, str5, str6, str7);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object] */
    public final void updateLoaded(G0U<? super UiState.Loaded, UiState.Loaded> g0u) {
        ?? value;
        UiState.Loaded loadedInvoke;
        BLG blg = this.catalogState;
        do {
            value = blg.getValue();
            loadedInvoke = value;
            if (value instanceof UiState.Loaded) {
                loadedInvoke = g0u.invoke(value);
            }
        } while (!blg.A6e(value, loadedInvoke));
    }

    public final Object confirmWidgetVoiceChoice(WidgetStateMutationHost widgetStateMutationHost, String str, String str2, String str3, String str4, HtJ<? super Boolean> htJ) {
        return VoiceWidgetSelectionCoordinator.Companion.getInstance(this.userSession).confirmSelection(widgetStateMutationHost, str, str2, str3, str4, null, htJ);
    }

    public final C1BN<UiState> getUiState() {
        return this.uiState;
    }

    public final C1BN<WidgetUiState> getWidgetUiState() {
        return this.widgetUiState;
    }

    public final void stopPreview() {
        this.previewPlayer.stop(this.previewOwnerId);
    }

    private final void selectPlayingWidgetVoice(List<VoiceOptionData> list) {
        AnonymousClass001.A1J(new C133471(list, null), AEu.A00(this));
    }

    public static /* synthetic */ void togglePreview$default(VoiceControlsViewModel voiceControlsViewModel, VoiceOption voiceOption, String str, String str2, String str3, boolean z, int i, Object obj) {
        String strA0t = AnonymousClass006.A0t(i, str2);
        if ((i & 8) != 0) {
            str3 = voiceOption.id;
        }
        voiceControlsViewModel.togglePreview(voiceOption, str, strA0t, str3, C3cI.A1S(i, z));
    }

    @Override // X.AEs
    public void onCleared() {
        stopPreview();
    }

    public final void togglePreview(VoiceOption voiceOption, String str, String str2, String str3, boolean z) {
        AnonymousClass005.A0y(voiceOption, str, str3);
        if (this.catalogState.getValue() instanceof UiState.PreviewState) {
            VoicePreviewPlayer voicePreviewPlayer = this.previewPlayer;
            VoicePreviewKey voicePreviewKey = new VoicePreviewKey(this.previewOwnerId, str3, voiceOption.id);
            if ((str2 != null && !C7BY.A0j(str2)) || (str2 = this.sampleLine) != null) {
                str = str2;
            }
            voicePreviewPlayer.toggle(new VoicePreviewRequest(voicePreviewKey, str, z));
        }
    }

    public VoiceControlsViewModel(AbstractC3358CGz abstractC3358CGz, List<String> list, boolean z, boolean z2, String str, VoiceOptionsWidgetData voiceOptionsWidgetData) {
        Object previewOnly;
        String str2 = str;
        boolean zA1a = AnonymousClass002.A1a(abstractC3358CGz, list);
        this.userSession = abstractC3358CGz;
        this.suggestedVoiceIds = list;
        this.restartCallOnSwitch = z;
        this.voiceCatalogRepository = new VoiceCatalogRepository();
        this.voiceCallStateHolder = VoiceCallStateHolder.Companion.getInstance(abstractC3358CGz);
        VoicePreviewPlayer companion = VoicePreviewPlayer.Companion.getInstance(abstractC3358CGz);
        this.previewPlayer = companion;
        this.previewOwnerId = str == null ? FGI.A0B(nextPreviewOwnerId.incrementAndGet(), "voice_controls:") : str2;
        if (z2) {
            previewOnly = UiState.Loading.INSTANCE;
        } else {
            previewOnly = new UiState.PreviewOnly(null, null);
        }
        C9286GCn c9286GCnA01 = HnJ.A01(previewOnly);
        this.catalogState = c9286GCnA01;
        C3Pi c3PiA00 = AnonymousClass441.A00(withPreview((UiState) c9286GCnA01.getValue(), companion.playback.getValue()), AEu.A00(this), C3rb.A03(new VoiceControlsViewModel$uiState$1(this, null), c9286GCnA01, companion.playback), new C3Es(5000L, LinkEncryptedPairingKt.LINK_COUNTER_MAX));
        this.uiState = c3PiA00;
        C9286GCn c9286GCnA012 = HnJ.A01(null);
        this.pendingWidgetVoice = c9286GCnA012;
        this.widgetUiState = AnonymousClass441.A00(new WidgetUiState(null, null, false), AEu.A00(this), C3rb.A03(new VoiceControlsViewModel$widgetUiState$1(null), c3PiA00, c9286GCnA012), new C3Es(5000L, LinkEncryptedPairingKt.LINK_COUNTER_MAX));
        if (z2) {
            loadVoices();
        }
        if (voiceOptionsWidgetData != null && voiceOptionsWidgetData.switchVoice == zA1a) {
            selectPlayingWidgetVoice(voiceOptionsWidgetData.options);
        }
    }
}
