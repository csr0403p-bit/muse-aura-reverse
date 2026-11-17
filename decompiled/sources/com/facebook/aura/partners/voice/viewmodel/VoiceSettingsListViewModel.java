package com.facebook.aura.partners.voice.viewmodel;

import X.AEs;
import X.AEu;
import X.AGH;
import X.AGI;
import X.AHD;
import X.AHI;
import X.AbstractC07127nr;
import X.AbstractC0878AGe;
import X.AbstractC3358CGz;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.AnonymousClass007;
import X.AnonymousClass602;
import X.BLG;
import X.BLL;
import X.BO6;
import X.C06G;
import X.C06H;
import X.C0KA;
import X.C1BN;
import X.C20Z;
import X.C3UX;
import X.C3cG;
import X.C3cH;
import X.C3cI;
import X.C3cJ;
import X.C3pU;
import X.C3rb;
import X.C60I;
import X.C60Q;
import X.C7384Etj;
import X.C79;
import X.C7BY;
import X.C8j3;
import X.C8j4;
import X.C9286GCn;
import X.EnumC10460Hji;
import X.Ey9;
import X.G0U;
import X.G0V;
import X.G0W;
import X.GAo;
import X.HoC;
import X.HtJ;
import X.Hwg;
import X.HxE;
import com.facebook.aura.analytics.hatch.HatchComponent;
import com.facebook.aura.analytics.hatch.HatchMetadataKey;
import com.facebook.aura.analytics.hatch.HatchOrigin;
import com.facebook.aura.analytics.waterfall.HatchPriceImpressionEventDataKt;
import com.facebook.aura.common.mvvm.AuraViewModelFactory;
import com.facebook.aura.feed.repo.FeedInstructionsCardStoreKt;
import com.facebook.aura.lifecycle.AuraAppLifecycleManager;
import com.facebook.aura.navigation.key.VoiceCatalogFilterKind;
import com.facebook.aura.navigation.key.VoiceEntryPoint;
import com.facebook.aura.partners.voice.api.SavedVoiceOption;
import com.facebook.aura.partners.voice.api.VoiceCatalogCriteria;
import com.facebook.aura.partners.voice.api.VoiceCatalogFilterOption;
import com.facebook.aura.partners.voice.api.VoiceCatalogFilters;
import com.facebook.aura.partners.voice.api.VoiceCatalogRepository;
import com.facebook.aura.partners.voice.api.VoiceOption;
import com.facebook.aura.partners.voice.api.VoiceSelectionIdentity;
import com.facebook.aura.partners.voice.gating.VoiceGating;
import com.facebook.aura.partners.voice.viewmodel.VoiceControlsViewModel;
import com.facebook.aura.partners.voice.viewmodel.VoiceSelectionRepository;
import com.facebook.aura.partners.voice.viewmodel.VoiceTelemetry;
import com.facebook.aura.sharesheet.HatchVideoAudioStripperKt;
import com.facebook.aura.spaces.repo.PinnedItemsRepositoryJsonKt;
import com.facebook.aura.widgets.WidgetComponentsKt;
import java.text.Collator;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* loaded from: classes4.dex */
public final class VoiceSettingsListViewModel extends AEs {
    public static final int $stable = 8;
    public final BLG<UiState> _uiState;
    public final AtomicInteger catalogAttempt;
    public final AtomicInteger catalogFiltersGeneration;
    public HoC catalogFiltersJob;
    public final AtomicInteger catalogGeneration;
    public HoC catalogLoadMoreJob;
    public HoC catalogReloadJob;
    public final VoiceEntryPoint entryPoint;
    public final AtomicInteger filtersAttempt;
    public final AtomicInteger pageAttempt;
    public volatile PendingVoiceSelection pendingSelection;
    public boolean pickOutcomeLogged;
    public final BLG<Integer> refreshRequests;
    public final AtomicBoolean searchActivated;
    public int selectionFailureRevision;
    public final AtomicInteger selectionGeneration;
    public final VoiceSelectionRepository selectionRepository;
    public final VoiceTelemetry telemetry;
    public final C1BN<UiState> uiState;
    public final AbstractC3358CGz userSession;
    public final VoiceCatalogRepository voiceCatalogRepository;

    @DebugMetadata(c = "com.facebook.aura.partners.voice.viewmodel.VoiceSettingsListViewModel$1", f = "VoiceSettingsListViewModel.kt", l = {293}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.partners.voice.viewmodel.VoiceSettingsListViewModel$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public int label;

        public AnonymousClass1(HtJ<? super AnonymousClass1> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return VoiceSettingsListViewModel.this.new AnonymousClass1(htJ);
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return VoiceSettingsListViewModel.this.new AnonymousClass1(htJ).invokeSuspend(Unit.INSTANCE);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                AnonymousClass602 anonymousClass602A00 = AnonymousClass602.A00(AuraAppLifecycleManager.isAppInForegroundImmediateFlow);
                final VoiceSettingsListViewModel voiceSettingsListViewModel = VoiceSettingsListViewModel.this;
                C20Z c20z = new C20Z() { // from class: com.facebook.aura.partners.voice.viewmodel.VoiceSettingsListViewModel.1.1
                    public final Object emit(boolean z, HtJ<? super Unit> htJ) {
                        if (!z) {
                            voiceSettingsListViewModel.commitPendingSelection(false);
                        }
                        return Unit.INSTANCE;
                    }

                    @Override // X.C20Z
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, HtJ htJ) {
                        return emit(AnonymousClass001.A1X(obj2), (HtJ<? super Unit>) htJ);
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

    @DebugMetadata(c = "com.facebook.aura.partners.voice.viewmodel.VoiceSettingsListViewModel$2", f = "VoiceSettingsListViewModel.kt", l = {300}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.partners.voice.viewmodel.VoiceSettingsListViewModel$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public int label;

        @DebugMetadata(c = "com.facebook.aura.partners.voice.viewmodel.VoiceSettingsListViewModel$2$1", f = "VoiceSettingsListViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
        /* renamed from: com.facebook.aura.partners.voice.viewmodel.VoiceSettingsListViewModel$2$1, reason: invalid class name */
        public final class AnonymousClass1 extends AbstractC07127nr implements G0W<VoiceSelectionRepository.OperationState, Integer, HtJ<? super VoiceSelectionRepository.OperationState>, Object> {
            public /* synthetic */ Object L$0;
            public int label;

            public AnonymousClass1(HtJ<? super AnonymousClass1> htJ) {
                super(3, htJ);
            }

            public final Object invoke(VoiceSelectionRepository.OperationState operationState, int i, HtJ<? super VoiceSelectionRepository.OperationState> htJ) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(htJ);
                anonymousClass1.L$0 = operationState;
                return anonymousClass1.invokeSuspend(Unit.INSTANCE);
            }

            @Override // X.AbstractC8884Fsp
            public final Object invokeSuspend(Object obj) {
                Object obj2 = this.L$0;
                if (this.label != 0) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
                return obj2;
            }

            @Override // X.G0W
            public /* bridge */ /* synthetic */ Object invoke(VoiceSelectionRepository.OperationState operationState, Integer num, HtJ<? super VoiceSelectionRepository.OperationState> htJ) {
                return invoke(operationState, AnonymousClass001.A0F(num), htJ);
            }
        }

        @DebugMetadata(c = "com.facebook.aura.partners.voice.viewmodel.VoiceSettingsListViewModel$2$2", f = "VoiceSettingsListViewModel.kt", l = {324, 346, 353}, m = "invokeSuspend", v = 2)
        /* renamed from: com.facebook.aura.partners.voice.viewmodel.VoiceSettingsListViewModel$2$2, reason: invalid class name and collision with other inner class name */
        public final class C03322 extends AbstractC07127nr implements G0V<VoiceSelectionRepository.OperationState, HtJ<? super Unit>, Object> {
            public int I$0;
            public int I$1;
            public int I$2;
            public int I$3;
            public int I$4;
            public /* synthetic */ Object L$0;
            public Object L$1;
            public Object L$2;
            public Object L$3;
            public int label;
            public final /* synthetic */ VoiceSettingsListViewModel this$0;

            /* renamed from: com.facebook.aura.partners.voice.viewmodel.VoiceSettingsListViewModel$2$2$WhenMappings */
            public abstract /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[VoiceSelectionRepository.MutationFailure.values().length];
                    try {
                        AnonymousClass002.A13(VoiceSelectionRepository.MutationFailure.SELECT, iArr);
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        AnonymousClass002.A14(VoiceSelectionRepository.MutationFailure.RENAME, iArr);
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        AnonymousClass002.A15(VoiceSelectionRepository.MutationFailure.DELETE, iArr);
                    } catch (NoSuchFieldError unused3) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C03322(VoiceSettingsListViewModel voiceSettingsListViewModel, HtJ<? super C03322> htJ) {
                super(2, htJ);
                this.this$0 = voiceSettingsListViewModel;
            }

            @Override // X.AbstractC8884Fsp
            public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
                C03322 c03322 = new C03322(this.this$0, htJ);
                c03322.L$0 = obj;
                return c03322;
            }

            /* JADX WARN: Code restructure failed: missing block: B:37:0x0115, code lost:
            
                if (X.GAo.A00(r51, r1, r0) == r5) goto L38;
             */
            /* JADX WARN: Code restructure failed: missing block: B:49:0x013e, code lost:
            
                if (r12 == null) goto L52;
             */
            /* JADX WARN: Code restructure failed: missing block: B:80:0x0025, code lost:
            
                if (r13 >= 2) goto L8;
             */
            /* JADX WARN: Path cross not found for [B:17:0x0063, B:49:0x013e], limit reached: 86 */
            /* JADX WARN: Path cross not found for [B:20:0x0072, B:22:0x0076], limit reached: 86 */
            /* JADX WARN: Path cross not found for [B:49:0x013e, B:17:0x0063], limit reached: 86 */
            /* JADX WARN: Removed duplicated region for block: B:10:0x0029 A[PHI: r9 r10 r11
  0x0029: PHI (r9v4 com.facebook.aura.partners.voice.viewmodel.VoiceSettingsListViewModel) = 
  (r9v1 com.facebook.aura.partners.voice.viewmodel.VoiceSettingsListViewModel)
  (r9v5 com.facebook.aura.partners.voice.viewmodel.VoiceSettingsListViewModel)
 binds: [B:72:0x01f6, B:9:0x0027] A[DONT_GENERATE, DONT_INLINE]
  0x0029: PHI (r10v5 int) = (r10v1 int), (r10v6 int) binds: [B:72:0x01f6, B:9:0x0027] A[DONT_GENERATE, DONT_INLINE]
  0x0029: PHI (r11v5 int) = (r11v1 int), (r11v7 int) binds: [B:72:0x01f6, B:9:0x0027] A[DONT_GENERATE, DONT_INLINE]] */
            /* JADX WARN: Removed duplicated region for block: B:12:0x0037  */
            /* JADX WARN: Removed duplicated region for block: B:17:0x0063  */
            /* JADX WARN: Removed duplicated region for block: B:25:0x007e  */
            /* JADX WARN: Removed duplicated region for block: B:27:0x0082  */
            /* JADX WARN: Removed duplicated region for block: B:39:0x0118  */
            /* JADX WARN: Removed duplicated region for block: B:45:0x0128 A[PHI: r1
  0x0128: PHI (r1v7 X.AHD) = (r1v6 X.AHD), (r1v13 X.AHD) binds: [B:43:0x0122, B:26:0x0080] A[DONT_GENERATE, DONT_INLINE]] */
            /* JADX WARN: Removed duplicated region for block: B:47:0x012c  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:54:0x015b -> B:8:0x0025). Please report as a decompilation issue!!! */
            @Override // X.AbstractC8884Fsp
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r52) {
                /*
                    Method dump skipped, instructions count: 527
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.partners.voice.viewmodel.VoiceSettingsListViewModel.AnonymousClass2.C03322.invokeSuspend(java.lang.Object):java.lang.Object");
            }

            @Override // X.G0V
            public final Object invoke(VoiceSelectionRepository.OperationState operationState, HtJ<? super Unit> htJ) {
                return ((C03322) create(operationState, htJ)).invokeSuspend(Unit.INSTANCE);
            }
        }

        public AnonymousClass2(HtJ<? super AnonymousClass2> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return VoiceSettingsListViewModel.this.new AnonymousClass2(htJ);
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return VoiceSettingsListViewModel.this.new AnonymousClass2(htJ).invokeSuspend(Unit.INSTANCE);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                VoiceSettingsListViewModel voiceSettingsListViewModel = VoiceSettingsListViewModel.this;
                C60I c60iA03 = C3rb.A03(new AnonymousClass1(null), voiceSettingsListViewModel.selectionRepository.operations, voiceSettingsListViewModel.refreshRequests);
                C03322 c03322 = new C03322(VoiceSettingsListViewModel.this, null);
                this.label = 1;
                if (C3pU.A00(this, c03322, c60iA03) == enumC10460Hji) {
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

    public final class CatalogFacet extends C06G {
        public static final int $stable = 0;
        public final VoiceCatalogFilterKind kind;
        public final AHD<CatalogFilterOption> options;
        public final String selectedValue;

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof CatalogFacet) {
                    CatalogFacet catalogFacet = (CatalogFacet) obj;
                    if (this.kind != catalogFacet.kind || !C7384Etj.areEqual(this.options, catalogFacet.options) || !C7384Etj.areEqual(this.selectedValue, catalogFacet.selectedValue)) {
                    }
                }
                return false;
            }
            return true;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ CatalogFacet copy$default(CatalogFacet catalogFacet, VoiceCatalogFilterKind voiceCatalogFilterKind, AHD ahd, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                voiceCatalogFilterKind = catalogFacet.kind;
            }
            if ((i & 2) != 0) {
                ahd = catalogFacet.options;
            }
            if ((i & 4) != 0) {
                str = catalogFacet.selectedValue;
            }
            return catalogFacet.copy(voiceCatalogFilterKind, ahd, str);
        }

        public final VoiceCatalogFilterKind component1() {
            return this.kind;
        }

        public final AHD<CatalogFilterOption> component2() {
            return this.options;
        }

        public final String component3() {
            return this.selectedValue;
        }

        public final VoiceCatalogFilterKind getKind() {
            return this.kind;
        }

        public final AHD<CatalogFilterOption> getOptions() {
            return this.options;
        }

        public final String getSelectedValue() {
            return this.selectedValue;
        }

        public int hashCode() {
            return AnonymousClass005.A0F(this.options, AnonymousClass005.A0E(this.kind)) + AnonymousClass006.A0G(this.selectedValue);
        }

        public CatalogFacet(VoiceCatalogFilterKind voiceCatalogFilterKind, AHD<CatalogFilterOption> ahd, String str) {
            AnonymousClass003.A0u(voiceCatalogFilterKind, ahd);
            this.kind = voiceCatalogFilterKind;
            this.options = ahd;
            this.selectedValue = str;
        }

        public final CatalogFacet copy(VoiceCatalogFilterKind voiceCatalogFilterKind, AHD<CatalogFilterOption> ahd, String str) {
            AnonymousClass003.A0u(voiceCatalogFilterKind, ahd);
            return new CatalogFacet(voiceCatalogFilterKind, ahd, str);
        }

        public String toString() {
            return super.toString();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public final class CatalogFailure {
        public static final /* synthetic */ Ey9 $ENTRIES;
        public static final /* synthetic */ CatalogFailure[] $VALUES;
        public static final CatalogFailure INITIAL;
        public static final CatalogFailure LOAD_MORE;

        static {
            CatalogFailure catalogFailure = new CatalogFailure("INITIAL", 0);
            INITIAL = catalogFailure;
            CatalogFailure catalogFailure2 = new CatalogFailure("LOAD_MORE", 1);
            LOAD_MORE = catalogFailure2;
            CatalogFailure[] catalogFailureArr = {catalogFailure, catalogFailure2};
            $VALUES = catalogFailureArr;
            $ENTRIES = C3cG.A0w(catalogFailureArr);
        }

        public static Ey9<CatalogFailure> getEntries() {
            return $ENTRIES;
        }

        public static CatalogFailure valueOf(String str) {
            return (CatalogFailure) Enum.valueOf(CatalogFailure.class, str);
        }

        public static CatalogFailure[] values() {
            return (CatalogFailure[]) $VALUES.clone();
        }

        public CatalogFailure(String str, int i) {
        }
    }

    public final class CatalogFilterOption extends C06G {
        public static final int $stable = 0;
        public final boolean isEnabled;
        public final String label;
        public final String value;

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof CatalogFilterOption) {
                    CatalogFilterOption catalogFilterOption = (CatalogFilterOption) obj;
                    if (!C7384Etj.areEqual(this.value, catalogFilterOption.value) || !C7384Etj.areEqual(this.label, catalogFilterOption.label) || this.isEnabled != catalogFilterOption.isEnabled) {
                    }
                }
                return false;
            }
            return true;
        }

        public static /* synthetic */ CatalogFilterOption copy$default(CatalogFilterOption catalogFilterOption, String str, String str2, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                str = catalogFilterOption.value;
            }
            if ((i & 2) != 0) {
                str2 = catalogFilterOption.label;
            }
            if ((i & 4) != 0) {
                z = catalogFilterOption.isEnabled;
            }
            return catalogFilterOption.copy(str, str2, z);
        }

        public final String component1() {
            return this.value;
        }

        public final String component2() {
            return this.label;
        }

        public final boolean component3() {
            return this.isEnabled;
        }

        public final String getLabel() {
            return this.label;
        }

        public final String getValue() {
            return this.value;
        }

        public int hashCode() {
            return C0KA.A00(AnonymousClass005.A0I(this.label, AnonymousClass001.A0G(this.value)), this.isEnabled);
        }

        public final boolean isEnabled() {
            return this.isEnabled;
        }

        public CatalogFilterOption(String str, String str2, boolean z) {
            AnonymousClass003.A0u(str, str2);
            this.value = str;
            this.label = str2;
            this.isEnabled = z;
        }

        public final CatalogFilterOption copy(String str, String str2, boolean z) {
            AnonymousClass003.A0u(str, str2);
            return new CatalogFilterOption(str, str2, z);
        }

        public String toString() {
            return super.toString();
        }
    }

    public final class Factory extends AuraViewModelFactory<VoiceSettingsListViewModel> {
        public static final int $stable = 8;
        public final boolean commitPendingSelectionOnBackground;
        public final VoiceEntryPoint entryPoint;
        public final AbstractC3358CGz userSession;

        @Override // com.facebook.aura.common.mvvm.AuraViewModelFactory
        public VoiceSettingsListViewModel create() {
            return new VoiceSettingsListViewModel(this.userSession, this.entryPoint, this.commitPendingSelectionOnBackground);
        }

        public Factory(AbstractC3358CGz abstractC3358CGz, VoiceEntryPoint voiceEntryPoint, boolean z) {
            AnonymousClass003.A0u(abstractC3358CGz, voiceEntryPoint);
            this.userSession = abstractC3358CGz;
            this.entryPoint = voiceEntryPoint;
            this.commitPendingSelectionOnBackground = z;
        }

        public /* synthetic */ Factory(AbstractC3358CGz abstractC3358CGz, VoiceEntryPoint voiceEntryPoint, boolean z, int i, C06H c06h) {
            this(abstractC3358CGz, voiceEntryPoint, AnonymousClass005.A1O(i, z));
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public final class MutationFailure {
        public static final /* synthetic */ Ey9 $ENTRIES;
        public static final /* synthetic */ MutationFailure[] $VALUES;
        public static final MutationFailure DELETE;
        public static final MutationFailure RENAME;
        public static final MutationFailure SELECT;

        static {
            MutationFailure mutationFailure = new MutationFailure("SELECT", 0);
            SELECT = mutationFailure;
            MutationFailure mutationFailure2 = new MutationFailure("RENAME", 1);
            RENAME = mutationFailure2;
            MutationFailure mutationFailure3 = new MutationFailure("DELETE", 2);
            DELETE = mutationFailure3;
            MutationFailure[] mutationFailureArr = {mutationFailure, mutationFailure2, mutationFailure3};
            $VALUES = mutationFailureArr;
            $ENTRIES = C3cG.A0w(mutationFailureArr);
        }

        public static Ey9<MutationFailure> getEntries() {
            return $ENTRIES;
        }

        public static MutationFailure valueOf(String str) {
            return (MutationFailure) Enum.valueOf(MutationFailure.class, str);
        }

        public static MutationFailure[] values() {
            return (MutationFailure[]) $VALUES.clone();
        }

        public MutationFailure(String str, int i) {
        }
    }

    public final class PendingVoiceSelection {
        public final VoiceSelectionIdentity identity;
        public final VoiceOption voice;

        public final VoiceSelectionIdentity getIdentity() {
            return this.identity;
        }

        public final VoiceOption getVoice() {
            return this.voice;
        }

        public PendingVoiceSelection(VoiceSelectionIdentity voiceSelectionIdentity, VoiceOption voiceOption) {
            AnonymousClass003.A0u(voiceSelectionIdentity, voiceOption);
            this.identity = voiceSelectionIdentity;
            this.voice = voiceOption;
        }
    }

    /* loaded from: classes.dex */
    public final class SavedVoiceDeletionState extends C06G {
        public static final int $stable = 0;
        public final boolean canDelete;
        public final VoiceOption fallbackVoice;

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof SavedVoiceDeletionState) {
                    SavedVoiceDeletionState savedVoiceDeletionState = (SavedVoiceDeletionState) obj;
                    if (this.canDelete != savedVoiceDeletionState.canDelete || !C7384Etj.areEqual(this.fallbackVoice, savedVoiceDeletionState.fallbackVoice)) {
                    }
                }
                return false;
            }
            return true;
        }

        public static /* synthetic */ SavedVoiceDeletionState copy$default(SavedVoiceDeletionState savedVoiceDeletionState, boolean z, VoiceOption voiceOption, int i, Object obj) {
            if ((i & 1) != 0) {
                z = savedVoiceDeletionState.canDelete;
            }
            if ((i & 2) != 0) {
                voiceOption = savedVoiceDeletionState.fallbackVoice;
            }
            return new SavedVoiceDeletionState(z, voiceOption);
        }

        public final boolean component1() {
            return this.canDelete;
        }

        public final VoiceOption component2() {
            return this.fallbackVoice;
        }

        public final SavedVoiceDeletionState copy(boolean z, VoiceOption voiceOption) {
            return new SavedVoiceDeletionState(z, voiceOption);
        }

        public final boolean getCanDelete() {
            return this.canDelete;
        }

        public final VoiceOption getFallbackVoice() {
            return this.fallbackVoice;
        }

        public int hashCode() {
            return C0KA.A02(this.canDelete) + AnonymousClass006.A0D(this.fallbackVoice);
        }

        public SavedVoiceDeletionState(boolean z, VoiceOption voiceOption) {
            this.canDelete = z;
            this.fallbackVoice = voiceOption;
        }

        public String toString() {
            return super.toString();
        }
    }

    public final class UiState extends C06G {
        public static final int $stable = 0;
        public final boolean areCatalogFiltersLoading;
        public final AHD<CatalogFacet> availableCatalogFacets;
        public final boolean canDisplayLoadedCatalog;
        public final boolean canLoadMoreCatalog;
        public final VoiceCatalogCriteria catalogCriteria;
        public final VoiceOption catalogCurrentVoice;
        public final VoiceOption catalogDefaultVoice;
        public final CatalogFailure catalogFailure;
        public final VoiceCatalogFilters catalogFilters;
        public final boolean catalogFiltersFailed;
        public final String catalogLocaleTags;
        public final int catalogNextOffset;
        public final boolean catalogPinSelected;
        public final VoiceOption catalogPinnedVoice;
        public final String catalogRetainedPendingVoiceId;
        public final String catalogSelectedLibraryVoiceId;
        public final int catalogTotal;
        public final AHD<VoiceOption> catalogVoices;
        public final HxE<VoiceCatalogCriteria, String> currentCatalogResultsKey;
        public final String deletingSavedVoiceId;
        public final AHD<VoiceOption> displayedCatalogVoices;
        public final String displayedLibraryVoiceId;
        public final AHD<SavedVoiceOption> displayedSavedVoices;
        public final VoiceSelectionIdentity displayedSelection;
        public final boolean hasSelectedSavedVoice;
        public final boolean isCatalogLoading;
        public final boolean isCatalogLoadingMore;
        public final boolean isCatalogPinnedVoiceInitialized;
        public final boolean isCatalogReloadPending;
        public final boolean isLoaded;
        public final boolean isSavingSelection;
        public final VoiceCatalogCriteria loadedCatalogCriteria;
        public final String loadedCatalogLocaleTags;
        public final MutationFailure mutationFailure;
        public final VoiceSelectionIdentity pendingSelectedVoice;
        public final VoiceOption pendingSelectedVoiceOption;
        public final String renamingSavedVoiceId;
        public final BO6<String, SavedVoiceDeletionState> savedVoiceDeletionStates;
        public final AHD<SavedVoiceOption> savedVoices;
        public final String savingSelectionRowId;
        public final VoiceSelectionIdentity selectedVoice;
        public final boolean showCatalogEmptyMessage;
        public final VoiceOption visibleCatalogCurrentVoice;
        public final VoiceOption visibleCatalogPinnedVoice;
        public final VoiceOption voiceToChoose;

        public final UiState copy(AHD<SavedVoiceOption> ahd, VoiceSelectionIdentity voiceSelectionIdentity, VoiceSelectionIdentity voiceSelectionIdentity2, VoiceOption voiceOption, boolean z, boolean z2, String str, String str2, String str3, MutationFailure mutationFailure, VoiceCatalogCriteria voiceCatalogCriteria, String str4, VoiceCatalogCriteria voiceCatalogCriteria2, String str5, AHD<VoiceOption> ahd2, VoiceCatalogFilters voiceCatalogFilters, int i, int i2, String str6, VoiceOption voiceOption2, VoiceOption voiceOption3, VoiceOption voiceOption4, boolean z3, String str7, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, CatalogFailure catalogFailure, boolean z9, boolean z10) {
            C7384Etj.A0Y(ahd, 0);
            AnonymousClass002.A1H(voiceCatalogCriteria, 10, ahd2);
            C7384Etj.A0Y(voiceCatalogFilters, 15);
            return new UiState(ahd, voiceSelectionIdentity, voiceSelectionIdentity2, voiceOption, z, z2, str, str2, str3, mutationFailure, voiceCatalogCriteria, str4, voiceCatalogCriteria2, str5, ahd2, voiceCatalogFilters, i, i2, str6, voiceOption2, voiceOption3, voiceOption4, z3, str7, z4, z5, z6, z7, z8, catalogFailure, z9, z10);
        }

        public final VoiceSelectionIdentity currentVoiceSelection(VoiceOption voiceOption) {
            C7384Etj.A0Y(voiceOption, 0);
            VoiceSelectionIdentity voiceSelectionIdentity = this.selectedVoice;
            if (voiceSelectionIdentity != null) {
                String str = voiceOption.id;
                VoiceOption voiceOption2 = this.visibleCatalogCurrentVoice;
                if (C7384Etj.areEqual(str, voiceOption2 != null ? voiceOption2.id : null)) {
                    return voiceSelectionIdentity;
                }
            }
            return null;
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof UiState) {
                    UiState uiState = (UiState) obj;
                    if (!C7384Etj.areEqual(this.savedVoices, uiState.savedVoices) || !C7384Etj.areEqual(this.selectedVoice, uiState.selectedVoice) || !C7384Etj.areEqual(this.pendingSelectedVoice, uiState.pendingSelectedVoice) || !C7384Etj.areEqual(this.pendingSelectedVoiceOption, uiState.pendingSelectedVoiceOption) || this.isLoaded != uiState.isLoaded || this.isSavingSelection != uiState.isSavingSelection || !C7384Etj.areEqual(this.savingSelectionRowId, uiState.savingSelectionRowId) || !C7384Etj.areEqual(this.renamingSavedVoiceId, uiState.renamingSavedVoiceId) || !C7384Etj.areEqual(this.deletingSavedVoiceId, uiState.deletingSavedVoiceId) || this.mutationFailure != uiState.mutationFailure || !C7384Etj.areEqual(this.catalogCriteria, uiState.catalogCriteria) || !C7384Etj.areEqual(this.catalogLocaleTags, uiState.catalogLocaleTags) || !C7384Etj.areEqual(this.loadedCatalogCriteria, uiState.loadedCatalogCriteria) || !C7384Etj.areEqual(this.loadedCatalogLocaleTags, uiState.loadedCatalogLocaleTags) || !C7384Etj.areEqual(this.catalogVoices, uiState.catalogVoices) || !C7384Etj.areEqual(this.catalogFilters, uiState.catalogFilters) || this.catalogTotal != uiState.catalogTotal || this.catalogNextOffset != uiState.catalogNextOffset || !C7384Etj.areEqual(this.catalogSelectedLibraryVoiceId, uiState.catalogSelectedLibraryVoiceId) || !C7384Etj.areEqual(this.catalogPinnedVoice, uiState.catalogPinnedVoice) || !C7384Etj.areEqual(this.catalogCurrentVoice, uiState.catalogCurrentVoice) || !C7384Etj.areEqual(this.catalogDefaultVoice, uiState.catalogDefaultVoice) || this.isCatalogPinnedVoiceInitialized != uiState.isCatalogPinnedVoiceInitialized || !C7384Etj.areEqual(this.catalogRetainedPendingVoiceId, uiState.catalogRetainedPendingVoiceId) || this.catalogPinSelected != uiState.catalogPinSelected || this.canLoadMoreCatalog != uiState.canLoadMoreCatalog || this.isCatalogLoading != uiState.isCatalogLoading || this.isCatalogReloadPending != uiState.isCatalogReloadPending || this.isCatalogLoadingMore != uiState.isCatalogLoadingMore || this.catalogFailure != uiState.catalogFailure || this.areCatalogFiltersLoading != uiState.areCatalogFiltersLoading || this.catalogFiltersFailed != uiState.catalogFiltersFailed) {
                    }
                }
                return false;
            }
            return true;
        }

        public final boolean isCurrentSavedVoice(VoiceOption voiceOption) {
            C7384Etj.A0Y(voiceOption, 0);
            VoiceSelectionIdentity voiceSelectionIdentityCurrentVoiceSelection = currentVoiceSelection(voiceOption);
            return (voiceSelectionIdentityCurrentVoiceSelection == null || voiceSelectionIdentityCurrentVoiceSelection.savedVoiceId == null) ? false : true;
        }

        public final boolean isSavedVoiceSelected(SavedVoiceOption savedVoiceOption) {
            C7384Etj.A0Y(savedVoiceOption, 0);
            VoiceSelectionIdentity voiceSelectionIdentity = this.displayedSelection;
            if (C7384Etj.areEqual(voiceSelectionIdentity != null ? voiceSelectionIdentity.savedVoiceId : null, savedVoiceOption.savedVoiceId)) {
                return C8j3.A1W(this.displayedSelection.profileId, savedVoiceOption.profileId, false);
            }
            return false;
        }

        private final boolean isListedSavedVoice(VoiceSelectionIdentity voiceSelectionIdentity) {
            if (voiceSelectionIdentity == null || voiceSelectionIdentity.savedVoiceId == null) {
                return false;
            }
            AHD<SavedVoiceOption> ahd = this.savedVoices;
            if ((ahd instanceof Collection) && ahd.isEmpty()) {
                return false;
            }
            for (SavedVoiceOption savedVoiceOption : ahd) {
                if (C7384Etj.areEqual(savedVoiceOption.savedVoiceId, voiceSelectionIdentity.savedVoiceId) && C7384Etj.areEqual(savedVoiceOption.profileId, voiceSelectionIdentity.profileId)) {
                    return true;
                }
            }
            return false;
        }

        public final AHD<SavedVoiceOption> component1() {
            return this.savedVoices;
        }

        public final MutationFailure component10() {
            return this.mutationFailure;
        }

        public final VoiceCatalogCriteria component11() {
            return this.catalogCriteria;
        }

        public final String component12() {
            return this.catalogLocaleTags;
        }

        public final VoiceCatalogCriteria component13() {
            return this.loadedCatalogCriteria;
        }

        public final String component14() {
            return this.loadedCatalogLocaleTags;
        }

        public final AHD<VoiceOption> component15() {
            return this.catalogVoices;
        }

        public final VoiceCatalogFilters component16() {
            return this.catalogFilters;
        }

        public final int component17() {
            return this.catalogTotal;
        }

        public final int component18() {
            return this.catalogNextOffset;
        }

        public final String component19() {
            return this.catalogSelectedLibraryVoiceId;
        }

        public final VoiceSelectionIdentity component2() {
            return this.selectedVoice;
        }

        public final VoiceOption component20() {
            return this.catalogPinnedVoice;
        }

        public final VoiceOption component21() {
            return this.catalogCurrentVoice;
        }

        public final VoiceOption component22() {
            return this.catalogDefaultVoice;
        }

        public final boolean component23() {
            return this.isCatalogPinnedVoiceInitialized;
        }

        public final String component24() {
            return this.catalogRetainedPendingVoiceId;
        }

        public final boolean component25() {
            return this.catalogPinSelected;
        }

        public final boolean component26() {
            return this.canLoadMoreCatalog;
        }

        public final boolean component27() {
            return this.isCatalogLoading;
        }

        public final boolean component28() {
            return this.isCatalogReloadPending;
        }

        public final boolean component29() {
            return this.isCatalogLoadingMore;
        }

        public final VoiceSelectionIdentity component3() {
            return this.pendingSelectedVoice;
        }

        public final CatalogFailure component30() {
            return this.catalogFailure;
        }

        public final boolean component31() {
            return this.areCatalogFiltersLoading;
        }

        public final boolean component32() {
            return this.catalogFiltersFailed;
        }

        public final VoiceOption component4() {
            return this.pendingSelectedVoiceOption;
        }

        public final boolean component5() {
            return this.isLoaded;
        }

        public final boolean component6() {
            return this.isSavingSelection;
        }

        public final String component7() {
            return this.savingSelectionRowId;
        }

        public final String component8() {
            return this.renamingSavedVoiceId;
        }

        public final String component9() {
            return this.deletingSavedVoiceId;
        }

        public final boolean getAreCatalogFiltersLoading() {
            return this.areCatalogFiltersLoading;
        }

        public final AHD<CatalogFacet> getAvailableCatalogFacets() {
            return this.availableCatalogFacets;
        }

        public final boolean getCanDisplayLoadedCatalog() {
            return this.canDisplayLoadedCatalog;
        }

        public final boolean getCanLoadMoreCatalog() {
            return this.canLoadMoreCatalog;
        }

        public final VoiceCatalogCriteria getCatalogCriteria() {
            return this.catalogCriteria;
        }

        public final VoiceOption getCatalogCurrentVoice() {
            return this.catalogCurrentVoice;
        }

        public final VoiceOption getCatalogDefaultVoice() {
            return this.catalogDefaultVoice;
        }

        public final CatalogFailure getCatalogFailure() {
            return this.catalogFailure;
        }

        public final VoiceCatalogFilters getCatalogFilters() {
            return this.catalogFilters;
        }

        public final boolean getCatalogFiltersFailed() {
            return this.catalogFiltersFailed;
        }

        public final String getCatalogLocaleTags() {
            return this.catalogLocaleTags;
        }

        public final int getCatalogNextOffset() {
            return this.catalogNextOffset;
        }

        public final boolean getCatalogPinSelected() {
            return this.catalogPinSelected;
        }

        public final VoiceOption getCatalogPinnedVoice() {
            return this.catalogPinnedVoice;
        }

        public final String getCatalogRetainedPendingVoiceId() {
            return this.catalogRetainedPendingVoiceId;
        }

        public final String getCatalogSelectedLibraryVoiceId() {
            return this.catalogSelectedLibraryVoiceId;
        }

        public final int getCatalogTotal() {
            return this.catalogTotal;
        }

        public final AHD<VoiceOption> getCatalogVoices() {
            return this.catalogVoices;
        }

        public final HxE<VoiceCatalogCriteria, String> getCurrentCatalogResultsKey() {
            return this.currentCatalogResultsKey;
        }

        public final String getDeletingSavedVoiceId() {
            return this.deletingSavedVoiceId;
        }

        public final AHD<VoiceOption> getDisplayedCatalogVoices() {
            return this.displayedCatalogVoices;
        }

        public final String getDisplayedLibraryVoiceId() {
            return this.displayedLibraryVoiceId;
        }

        public final AHD<SavedVoiceOption> getDisplayedSavedVoices() {
            return this.displayedSavedVoices;
        }

        public final boolean getHasSelectedSavedVoice() {
            return this.hasSelectedSavedVoice;
        }

        public final VoiceCatalogCriteria getLoadedCatalogCriteria() {
            return this.loadedCatalogCriteria;
        }

        public final String getLoadedCatalogLocaleTags() {
            return this.loadedCatalogLocaleTags;
        }

        public final MutationFailure getMutationFailure() {
            return this.mutationFailure;
        }

        public final VoiceSelectionIdentity getPendingSelectedVoice() {
            return this.pendingSelectedVoice;
        }

        public final VoiceOption getPendingSelectedVoiceOption() {
            return this.pendingSelectedVoiceOption;
        }

        public final String getRenamingSavedVoiceId() {
            return this.renamingSavedVoiceId;
        }

        public final BO6<String, SavedVoiceDeletionState> getSavedVoiceDeletionStates() {
            return this.savedVoiceDeletionStates;
        }

        public final AHD<SavedVoiceOption> getSavedVoices() {
            return this.savedVoices;
        }

        public final String getSavingSelectionRowId() {
            return this.savingSelectionRowId;
        }

        public final VoiceSelectionIdentity getSelectedVoice() {
            return this.selectedVoice;
        }

        public final boolean getShowCatalogEmptyMessage() {
            return this.showCatalogEmptyMessage;
        }

        public final VoiceOption getVisibleCatalogCurrentVoice() {
            return this.visibleCatalogCurrentVoice;
        }

        public final VoiceOption getVisibleCatalogPinnedVoice() {
            return this.visibleCatalogPinnedVoice;
        }

        public final VoiceOption getVoiceToChoose() {
            return this.voiceToChoose;
        }

        public int hashCode() {
            return C0KA.A00(C0KA.A01((C0KA.A01(C0KA.A01(C0KA.A01(C0KA.A01(C0KA.A01((C0KA.A01((((((((((((AnonymousClass005.A0F(this.catalogFilters, AnonymousClass005.A0F(this.catalogVoices, (((((AnonymousClass005.A0F(this.catalogCriteria, (((((((C0KA.A01(C0KA.A01((((((AnonymousClass005.A0E(this.savedVoices) + AnonymousClass006.A0D(this.selectedVoice)) * 31) + AnonymousClass006.A0D(this.pendingSelectedVoice)) * 31) + AnonymousClass006.A0D(this.pendingSelectedVoiceOption)) * 31, this.isLoaded), this.isSavingSelection) + AnonymousClass006.A0G(this.savingSelectionRowId)) * 31) + AnonymousClass006.A0G(this.renamingSavedVoiceId)) * 31) + AnonymousClass006.A0G(this.deletingSavedVoiceId)) * 31) + AnonymousClass006.A0D(this.mutationFailure)) * 31) + AnonymousClass006.A0G(this.catalogLocaleTags)) * 31) + AnonymousClass006.A0D(this.loadedCatalogCriteria)) * 31) + AnonymousClass006.A0G(this.loadedCatalogLocaleTags)) * 31)) + this.catalogTotal) * 31) + this.catalogNextOffset) * 31) + AnonymousClass006.A0G(this.catalogSelectedLibraryVoiceId)) * 31) + AnonymousClass006.A0D(this.catalogPinnedVoice)) * 31) + AnonymousClass006.A0D(this.catalogCurrentVoice)) * 31) + AnonymousClass006.A0D(this.catalogDefaultVoice)) * 31, this.isCatalogPinnedVoiceInitialized) + AnonymousClass006.A0G(this.catalogRetainedPendingVoiceId)) * 31, this.catalogPinSelected), this.canLoadMoreCatalog), this.isCatalogLoading), this.isCatalogReloadPending), this.isCatalogLoadingMore) + C3cH.A02(this.catalogFailure)) * 31, this.areCatalogFiltersLoading), this.catalogFiltersFailed);
        }

        public final boolean isCatalogLoading() {
            return this.isCatalogLoading;
        }

        public final boolean isCatalogLoadingMore() {
            return this.isCatalogLoadingMore;
        }

        public final boolean isCatalogPinnedVoiceInitialized() {
            return this.isCatalogPinnedVoiceInitialized;
        }

        public final boolean isCatalogReloadPending() {
            return this.isCatalogReloadPending;
        }

        public final boolean isLibraryMutating() {
            return (this.renamingSavedVoiceId == null && this.deletingSavedVoiceId == null) ? false : true;
        }

        public final boolean isLoaded() {
            return this.isLoaded;
        }

        public final boolean isMutating() {
            return (!this.isSavingSelection && this.renamingSavedVoiceId == null && this.deletingSavedVoiceId == null) ? false : true;
        }

        public final boolean isSavingSelection() {
            return this.isSavingSelection;
        }

        /* JADX WARN: Removed duplicated region for block: B:11:0x0025  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private final X.AHD<com.facebook.aura.partners.voice.viewmodel.VoiceSettingsListViewModel.CatalogFilterOption> catalogFilterOptions(X.AHD<com.facebook.aura.partners.voice.api.VoiceCatalogFilterOption> r7) {
            /*
                r6 = this;
                java.util.ArrayList r5 = X.AnonymousClass003.A0i(r7)
                java.util.Iterator r4 = r7.iterator()
            L8:
                boolean r0 = r4.hasNext()
                if (r0 == 0) goto L2f
                java.lang.Object r1 = r4.next()
                com.facebook.aura.partners.voice.api.VoiceCatalogFilterOption r1 = (com.facebook.aura.partners.voice.api.VoiceCatalogFilterOption) r1
                java.lang.String r3 = r1.value
                java.lang.String r2 = r1.label
                boolean r0 = r6.areCatalogFiltersLoading
                if (r0 != 0) goto L25
                boolean r0 = r6.catalogFiltersFailed
                if (r0 != 0) goto L25
                int r0 = r1.count
                r1 = 1
                if (r0 > 0) goto L26
            L25:
                r1 = 0
            L26:
                com.facebook.aura.partners.voice.viewmodel.VoiceSettingsListViewModel$CatalogFilterOption r0 = new com.facebook.aura.partners.voice.viewmodel.VoiceSettingsListViewModel$CatalogFilterOption
                r0.<init>(r3, r2, r1)
                r5.add(r0)
                goto L8
            L2f:
                X.AHD r0 = X.AGI.A07(r5)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.partners.voice.viewmodel.VoiceSettingsListViewModel.UiState.catalogFilterOptions(X.AHD):X.AHD");
        }

        public String toString() {
            return super.toString();
        }

        /* JADX WARN: Removed duplicated region for block: B:129:0x02ad  */
        /* JADX WARN: Removed duplicated region for block: B:130:0x02b1  */
        /* JADX WARN: Removed duplicated region for block: B:132:0x02b7  */
        /* JADX WARN: Removed duplicated region for block: B:37:0x0162  */
        /* JADX WARN: Removed duplicated region for block: B:94:0x0226  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public UiState(X.AHD<com.facebook.aura.partners.voice.api.SavedVoiceOption> r9, com.facebook.aura.partners.voice.api.VoiceSelectionIdentity r10, com.facebook.aura.partners.voice.api.VoiceSelectionIdentity r11, com.facebook.aura.partners.voice.api.VoiceOption r12, boolean r13, boolean r14, java.lang.String r15, java.lang.String r16, java.lang.String r17, com.facebook.aura.partners.voice.viewmodel.VoiceSettingsListViewModel.MutationFailure r18, com.facebook.aura.partners.voice.api.VoiceCatalogCriteria r19, java.lang.String r20, com.facebook.aura.partners.voice.api.VoiceCatalogCriteria r21, java.lang.String r22, X.AHD<com.facebook.aura.partners.voice.api.VoiceOption> r23, com.facebook.aura.partners.voice.api.VoiceCatalogFilters r24, int r25, int r26, java.lang.String r27, com.facebook.aura.partners.voice.api.VoiceOption r28, com.facebook.aura.partners.voice.api.VoiceOption r29, com.facebook.aura.partners.voice.api.VoiceOption r30, boolean r31, java.lang.String r32, boolean r33, boolean r34, boolean r35, boolean r36, boolean r37, com.facebook.aura.partners.voice.viewmodel.VoiceSettingsListViewModel.CatalogFailure r38, boolean r39, boolean r40) {
            /*
                Method dump skipped, instructions count: 704
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.partners.voice.viewmodel.VoiceSettingsListViewModel.UiState.<init>(X.AHD, com.facebook.aura.partners.voice.api.VoiceSelectionIdentity, com.facebook.aura.partners.voice.api.VoiceSelectionIdentity, com.facebook.aura.partners.voice.api.VoiceOption, boolean, boolean, java.lang.String, java.lang.String, java.lang.String, com.facebook.aura.partners.voice.viewmodel.VoiceSettingsListViewModel$MutationFailure, com.facebook.aura.partners.voice.api.VoiceCatalogCriteria, java.lang.String, com.facebook.aura.partners.voice.api.VoiceCatalogCriteria, java.lang.String, X.AHD, com.facebook.aura.partners.voice.api.VoiceCatalogFilters, int, int, java.lang.String, com.facebook.aura.partners.voice.api.VoiceOption, com.facebook.aura.partners.voice.api.VoiceOption, com.facebook.aura.partners.voice.api.VoiceOption, boolean, java.lang.String, boolean, boolean, boolean, boolean, boolean, com.facebook.aura.partners.voice.viewmodel.VoiceSettingsListViewModel$CatalogFailure, boolean, boolean):void");
        }

        public static /* synthetic */ UiState copy$default(UiState uiState, AHD ahd, VoiceSelectionIdentity voiceSelectionIdentity, VoiceSelectionIdentity voiceSelectionIdentity2, VoiceOption voiceOption, boolean z, boolean z2, String str, String str2, String str3, MutationFailure mutationFailure, VoiceCatalogCriteria voiceCatalogCriteria, String str4, VoiceCatalogCriteria voiceCatalogCriteria2, String str5, AHD ahd2, VoiceCatalogFilters voiceCatalogFilters, int i, int i2, String str6, VoiceOption voiceOption2, VoiceOption voiceOption3, VoiceOption voiceOption4, boolean z3, String str7, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, CatalogFailure catalogFailure, boolean z9, boolean z10, int i3, Object obj) {
            AHD ahd3 = ahd;
            VoiceSelectionIdentity voiceSelectionIdentity3 = voiceSelectionIdentity;
            VoiceSelectionIdentity voiceSelectionIdentity4 = voiceSelectionIdentity2;
            VoiceOption voiceOption5 = voiceOption;
            boolean z11 = z;
            boolean z12 = z2;
            String str8 = str;
            String str9 = str2;
            String str10 = str3;
            MutationFailure mutationFailure2 = mutationFailure;
            VoiceCatalogCriteria voiceCatalogCriteria3 = voiceCatalogCriteria;
            String str11 = str4;
            VoiceCatalogCriteria voiceCatalogCriteria4 = voiceCatalogCriteria2;
            String str12 = str5;
            AHD ahd4 = ahd2;
            VoiceCatalogFilters voiceCatalogFilters2 = voiceCatalogFilters;
            VoiceOption voiceOption6 = voiceOption3;
            VoiceOption voiceOption7 = voiceOption4;
            String str13 = str7;
            boolean z13 = z6;
            boolean z14 = z7;
            boolean z15 = z8;
            CatalogFailure catalogFailure2 = catalogFailure;
            boolean z16 = z9;
            int i4 = i;
            int i5 = i2;
            String str14 = str6;
            VoiceOption voiceOption8 = voiceOption2;
            boolean z17 = z3;
            boolean z18 = z4;
            boolean z19 = z5;
            boolean z20 = z10;
            if ((i3 & 1) != 0) {
                ahd3 = uiState.savedVoices;
            }
            if ((i3 & 2) != 0) {
                voiceSelectionIdentity3 = uiState.selectedVoice;
            }
            if ((i3 & 4) != 0) {
                voiceSelectionIdentity4 = uiState.pendingSelectedVoice;
            }
            if ((i3 & 8) != 0) {
                voiceOption5 = uiState.pendingSelectedVoiceOption;
            }
            if ((i3 & 16) != 0) {
                z11 = uiState.isLoaded;
            }
            if ((i3 & 32) != 0) {
                z12 = uiState.isSavingSelection;
            }
            if ((i3 & 64) != 0) {
                str8 = uiState.savingSelectionRowId;
            }
            if ((i3 & 128) != 0) {
                str9 = uiState.renamingSavedVoiceId;
            }
            if ((i3 & 256) != 0) {
                str10 = uiState.deletingSavedVoiceId;
            }
            if ((i3 & 512) != 0) {
                mutationFailure2 = uiState.mutationFailure;
            }
            if ((i3 & 1024) != 0) {
                voiceCatalogCriteria3 = uiState.catalogCriteria;
            }
            if ((i3 & 2048) != 0) {
                str11 = uiState.catalogLocaleTags;
            }
            if ((i3 & 4096) != 0) {
                voiceCatalogCriteria4 = uiState.loadedCatalogCriteria;
            }
            if ((i3 & 8192) != 0) {
                str12 = uiState.loadedCatalogLocaleTags;
            }
            if ((i3 & 16384) != 0) {
                ahd4 = uiState.catalogVoices;
            }
            if ((i3 & 32768) != 0) {
                voiceCatalogFilters2 = uiState.catalogFilters;
            }
            if ((i3 & 65536) != 0) {
                i4 = uiState.catalogTotal;
            }
            if ((i3 & 131072) != 0) {
                i5 = uiState.catalogNextOffset;
            }
            if ((i3 & 262144) != 0) {
                str14 = uiState.catalogSelectedLibraryVoiceId;
            }
            if ((i3 & 524288) != 0) {
                voiceOption8 = uiState.catalogPinnedVoice;
            }
            if ((i3 & 1048576) != 0) {
                voiceOption6 = uiState.catalogCurrentVoice;
            }
            if ((i3 & 2097152) != 0) {
                voiceOption7 = uiState.catalogDefaultVoice;
            }
            if ((i3 & 4194304) != 0) {
                z17 = uiState.isCatalogPinnedVoiceInitialized;
            }
            if ((i3 & 8388608) != 0) {
                str13 = uiState.catalogRetainedPendingVoiceId;
            }
            if ((i3 & HatchVideoAudioStripperKt.MAX_SAMPLE_BYTES) != 0) {
                z18 = uiState.catalogPinSelected;
            }
            if ((i3 & 33554432) != 0) {
                z19 = uiState.canLoadMoreCatalog;
            }
            if ((i3 & 67108864) != 0) {
                z13 = uiState.isCatalogLoading;
            }
            if ((i3 & 134217728) != 0) {
                z14 = uiState.isCatalogReloadPending;
            }
            if ((i3 & 268435456) != 0) {
                z15 = uiState.isCatalogLoadingMore;
            }
            if ((i3 & 536870912) != 0) {
                catalogFailure2 = uiState.catalogFailure;
            }
            if ((i3 & 1073741824) != 0) {
                z16 = uiState.areCatalogFiltersLoading;
            }
            if ((i3 & Integer.MIN_VALUE) != 0) {
                z20 = uiState.catalogFiltersFailed;
            }
            return uiState.copy(ahd3, voiceSelectionIdentity3, voiceSelectionIdentity4, voiceOption5, z11, z12, str8, str9, str10, mutationFailure2, voiceCatalogCriteria3, str11, voiceCatalogCriteria4, str12, ahd4, voiceCatalogFilters2, i4, i5, str14, voiceOption8, voiceOption6, voiceOption7, z17, str13, z18, z19, z13, z14, z15, catalogFailure2, z16, z20);
        }

        public /* synthetic */ UiState(AHD ahd, VoiceSelectionIdentity voiceSelectionIdentity, VoiceSelectionIdentity voiceSelectionIdentity2, VoiceOption voiceOption, boolean z, boolean z2, String str, String str2, String str3, MutationFailure mutationFailure, VoiceCatalogCriteria voiceCatalogCriteria, String str4, VoiceCatalogCriteria voiceCatalogCriteria2, String str5, AHD ahd2, VoiceCatalogFilters voiceCatalogFilters, int i, int i2, String str6, VoiceOption voiceOption2, VoiceOption voiceOption3, VoiceOption voiceOption4, boolean z3, String str7, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, CatalogFailure catalogFailure, boolean z9, boolean z10, int i3, C06H c06h) {
            VoiceSelectionIdentity voiceSelectionIdentity3 = voiceSelectionIdentity;
            VoiceSelectionIdentity voiceSelectionIdentity4 = voiceSelectionIdentity2;
            VoiceOption voiceOption5 = voiceOption;
            MutationFailure mutationFailure2 = mutationFailure;
            VoiceCatalogCriteria voiceCatalogCriteria3 = voiceCatalogCriteria;
            VoiceCatalogCriteria voiceCatalogCriteria4 = voiceCatalogCriteria2;
            VoiceCatalogFilters voiceCatalogFilters2 = voiceCatalogFilters;
            int i4 = i;
            int i5 = i2;
            VoiceOption voiceOption6 = voiceOption2;
            VoiceOption voiceOption7 = voiceOption3;
            VoiceOption voiceOption8 = voiceOption4;
            CatalogFailure catalogFailure2 = catalogFailure;
            AHD ahd3 = ahd2;
            AHD ahd4 = (i3 & 1) != 0 ? AHI.A01 : ahd;
            voiceSelectionIdentity3 = (i3 & 2) != 0 ? null : voiceSelectionIdentity3;
            voiceSelectionIdentity4 = (i3 & 4) != 0 ? null : voiceSelectionIdentity4;
            voiceOption5 = (i3 & 8) != 0 ? null : voiceOption5;
            boolean zA1S = C3cI.A1S(i3, z);
            boolean zA1R = AnonymousClass002.A1R(i3, z2);
            String strA0e = C3cG.A0e(str, i3 & 64);
            String strA0e2 = C3cG.A0e(str2, i3 & 128);
            String strA0e3 = C3cG.A0e(str3, i3 & 256);
            mutationFailure2 = (i3 & 512) != 0 ? null : mutationFailure2;
            voiceCatalogCriteria3 = (i3 & 1024) != 0 ? new VoiceCatalogCriteria("", null, null, null) : voiceCatalogCriteria3;
            String strA0e4 = C3cG.A0e(str4, i3 & 2048);
            voiceCatalogCriteria4 = (i3 & 4096) != 0 ? null : voiceCatalogCriteria4;
            String strA0e5 = C3cG.A0e(str5, i3 & 8192);
            ahd3 = (i3 & 16384) != 0 ? AHI.A01 : ahd3;
            if ((i3 & 32768) != 0) {
                AHI ahi = AHI.A01;
                voiceCatalogFilters2 = new VoiceCatalogFilters(ahi, ahi, ahi);
            }
            this(ahd4, voiceSelectionIdentity3, voiceSelectionIdentity4, voiceOption5, zA1S, zA1R, strA0e, strA0e2, strA0e3, mutationFailure2, voiceCatalogCriteria3, strA0e4, voiceCatalogCriteria4, strA0e5, ahd3, voiceCatalogFilters2, (i3 & 65536) != 0 ? 0 : i4, (i3 & 131072) != 0 ? 0 : i5, C3cG.A0e(str6, i3 & 262144), (i3 & 524288) != 0 ? null : voiceOption6, (i3 & 1048576) != 0 ? null : voiceOption7, (i3 & 2097152) != 0 ? null : voiceOption8, C3cH.A1L(i3, 4194304, z3), C3cG.A0e(str7, i3 & 8388608), C60Q.A1Q(i3 & HatchVideoAudioStripperKt.MAX_SAMPLE_BYTES, z4), C3cH.A1L(i3, 33554432, z5), C60Q.A1Q(i3 & 67108864, z6), C3cH.A1L(i3, 134217728, z7), C3cH.A1L(i3, 268435456, z8), (i3 & 536870912) != 0 ? null : catalogFailure2, (i3 & 1073741824) == 0 ? z9 : true, C3cH.A1L(i3, Integer.MIN_VALUE, z10));
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /* JADX WARN: Multi-variable type inference failed */
        public UiState() {
            Object[] objArr = 0 == true ? 1 : 0;
            Object[] objArr2 = 0 == true ? 1 : 0;
            Object[] objArr3 = 0 == true ? 1 : 0;
            Object[] objArr4 = 0 == true ? 1 : 0;
            Object[] objArr5 = 0 == true ? 1 : 0;
            Object[] objArr6 = 0 == true ? 1 : 0;
            Object[] objArr7 = 0 == true ? 1 : 0;
            Object[] objArr8 = 0 == true ? 1 : 0;
            Object[] objArr9 = 0 == true ? 1 : 0;
            Object[] objArr10 = 0 == true ? 1 : 0;
            Object[] objArr11 = 0 == true ? 1 : 0;
            Object[] objArr12 = 0 == true ? 1 : 0;
            Object[] objArr13 = 0 == true ? 1 : 0;
            Object[] objArr14 = 0 == true ? 1 : 0;
            Object[] objArr15 = 0 == true ? 1 : 0;
            Object[] objArr16 = 0 == true ? 1 : 0;
            Object[] objArr17 = 0 == true ? 1 : 0;
            Object[] objArr18 = 0 == true ? 1 : 0;
            Object[] objArr19 = 0 == true ? 1 : 0;
            Object[] objArr20 = 0 == true ? 1 : 0;
            this(null, objArr, objArr2, objArr3, false, 0 == true ? 1 : 0, objArr4, objArr5, objArr6, objArr7, objArr8, objArr9, objArr10, objArr11, objArr12, objArr13, 0 == true ? 1 : 0, 0 == true ? 1 : 0, objArr14, objArr15, objArr16, objArr17, 0 == true ? 1 : 0, objArr18, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, objArr19, 0 == true ? 1 : 0, 0 == true ? 1 : 0, -1, objArr20);
        }
    }

    /* renamed from: com.facebook.aura.partners.voice.viewmodel.VoiceSettingsListViewModel$commitPendingSelection$1, reason: invalid class name and case insensitive filesystem */
    public final class C133711 extends AbstractC7559F3s implements G0U<VoiceSelectionIdentity, Unit> {
        public final /* synthetic */ int $generation;
        public final /* synthetic */ VoiceSelectionIdentity $selection;
        public final /* synthetic */ VoiceSettingsListViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C133711(int i, VoiceSettingsListViewModel voiceSettingsListViewModel, VoiceSelectionIdentity voiceSelectionIdentity) {
            super(1);
            this.$generation = i;
            this.this$0 = voiceSettingsListViewModel;
            this.$selection = voiceSelectionIdentity;
        }

        /* JADX WARN: Removed duplicated region for block: B:9:0x0028  */
        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void invoke2(com.facebook.aura.partners.voice.api.VoiceSelectionIdentity r42) {
            /*
                r41 = this;
                r4 = r41
                int r1 = r4.$generation
                com.facebook.aura.partners.voice.viewmodel.VoiceSettingsListViewModel r0 = r4.this$0
                java.util.concurrent.atomic.AtomicInteger r0 = r0.selectionGeneration
                int r0 = r0.get()
                if (r1 != r0) goto L84
                com.facebook.aura.partners.voice.viewmodel.VoiceSettingsListViewModel r5 = r4.this$0
                X.BLG<com.facebook.aura.partners.voice.viewmodel.VoiceSettingsListViewModel$UiState> r3 = r5._uiState
                com.facebook.aura.partners.voice.api.VoiceSelectionIdentity r2 = r4.$selection
            L14:
                java.lang.Object r6 = r3.getValue()
                r7 = r6
                com.facebook.aura.partners.voice.viewmodel.VoiceSettingsListViewModel$UiState r7 = (com.facebook.aura.partners.voice.viewmodel.VoiceSettingsListViewModel.UiState) r7
                com.facebook.aura.partners.voice.api.VoiceSelectionIdentity r0 = r7.pendingSelectedVoice
                boolean r0 = X.C7384Etj.areEqual(r0, r2)
                if (r0 == 0) goto L28
                com.facebook.aura.partners.voice.viewmodel.VoiceSettingsListViewModel$PendingVoiceSelection r0 = r5.pendingSelection
                r1 = 1
                if (r0 == 0) goto L29
            L28:
                r1 = 0
            L29:
                if (r42 != 0) goto L85
                com.facebook.aura.partners.voice.api.VoiceSelectionIdentity r9 = r7.selectedVoice
            L2d:
                com.facebook.aura.partners.voice.api.VoiceSelectionIdentity r10 = r7.pendingSelectedVoice
                r11 = 0
                if (r1 == 0) goto L33
                r10 = r11
            L33:
                com.facebook.aura.partners.voice.api.VoiceOption r0 = r7.pendingSelectedVoiceOption
                if (r1 != 0) goto L38
                r11 = r0
            L38:
                r40 = -15
                r8 = 0
                r12 = 0
                r13 = r12
                r14 = r8
                r15 = r8
                r16 = r8
                r17 = r8
                r18 = r8
                r19 = r8
                r20 = r8
                r21 = r8
                r22 = r8
                r23 = r8
                r24 = r12
                r25 = r12
                r26 = r8
                r27 = r8
                r28 = r8
                r29 = r8
                r30 = r12
                r31 = r8
                r32 = r12
                r33 = r12
                r34 = r12
                r35 = r12
                r36 = r12
                r37 = r8
                r38 = r12
                r39 = r12
                r41 = r8
                com.facebook.aura.partners.voice.viewmodel.VoiceSettingsListViewModel$UiState r0 = com.facebook.aura.partners.voice.viewmodel.VoiceSettingsListViewModel.UiState.copy$default(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41)
                boolean r0 = r3.A6e(r6, r0)
                if (r0 == 0) goto L14
                if (r42 != 0) goto L84
                com.facebook.aura.partners.voice.viewmodel.VoiceSettingsListViewModel r1 = r4.this$0
                int r0 = r4.$generation
                com.facebook.aura.partners.voice.viewmodel.VoiceSettingsListViewModel.access$refreshSelectedVoice(r1, r0)
            L84:
                return
            L85:
                r9 = r42
                goto L2d
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.partners.voice.viewmodel.VoiceSettingsListViewModel.C133711.invoke2(com.facebook.aura.partners.voice.api.VoiceSelectionIdentity):void");
        }

        @Override // X.G0U
        public /* bridge */ /* synthetic */ Unit invoke(VoiceSelectionIdentity voiceSelectionIdentity) {
            invoke2(voiceSelectionIdentity);
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.facebook.aura.partners.voice.viewmodel.VoiceSettingsListViewModel$deleteSavedVoice$1", f = "VoiceSettingsListViewModel.kt", l = {989}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.partners.voice.viewmodel.VoiceSettingsListViewModel$deleteSavedVoice$1, reason: invalid class name and case insensitive filesystem */
    public final class C133721 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ SavedVoiceDeletionState $deletionState;
        public final /* synthetic */ SavedVoiceOption $savedVoice;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C133721(SavedVoiceOption savedVoiceOption, SavedVoiceDeletionState savedVoiceDeletionState, HtJ<? super C133721> htJ) {
            super(2, htJ);
            this.$savedVoice = savedVoiceOption;
            this.$deletionState = savedVoiceDeletionState;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return VoiceSettingsListViewModel.this.new C133721(this.$savedVoice, this.$deletionState, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                if (VoiceSettingsListViewModel.this.getCanManageSavedVoices()) {
                    VoiceSettingsListViewModel voiceSettingsListViewModel = VoiceSettingsListViewModel.this;
                    VoiceSelectionRepository voiceSelectionRepository = voiceSettingsListViewModel.selectionRepository;
                    AbstractC3358CGz abstractC3358CGz = voiceSettingsListViewModel.userSession;
                    String str = this.$savedVoice.savedVoiceId;
                    VoiceOption voiceOption = this.$deletionState.fallbackVoice;
                    this.label = 1;
                    if (voiceSelectionRepository.deleteSavedVoice(abstractC3358CGz, str, voiceOption, this) == enumC10460Hji) {
                        return enumC10460Hji;
                    }
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
            return ((C133721) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.partners.voice.viewmodel.VoiceSettingsListViewModel$loadCatalogFilters$2", f = "VoiceSettingsListViewModel.kt", l = {859, 861}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.partners.voice.viewmodel.VoiceSettingsListViewModel$loadCatalogFilters$2, reason: invalid class name and case insensitive filesystem */
    public final class C133732 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ VoiceCatalogCriteria $criteria;
        public final /* synthetic */ boolean $debounceSearch;
        public final /* synthetic */ int $generation;
        public int label;
        public final /* synthetic */ VoiceSettingsListViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C133732(boolean z, VoiceSettingsListViewModel voiceSettingsListViewModel, VoiceCatalogCriteria voiceCatalogCriteria, int i, HtJ<? super C133732> htJ) {
            super(2, htJ);
            this.$debounceSearch = z;
            this.this$0 = voiceSettingsListViewModel;
            this.$criteria = voiceCatalogCriteria;
            this.$generation = i;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new C133732(this.$debounceSearch, this.this$0, this.$criteria, this.$generation, htJ);
        }

        /* JADX WARN: Removed duplicated region for block: B:19:0x0087  */
        /* JADX WARN: Removed duplicated region for block: B:9:0x001e  */
        @Override // X.AbstractC8884Fsp
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r41) {
            /*
                Method dump skipped, instructions count: 275
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.partners.voice.viewmodel.VoiceSettingsListViewModel.C133732.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ((C133732) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.partners.voice.viewmodel.VoiceSettingsListViewModel$loadMoreCatalog$2", f = "VoiceSettingsListViewModel.kt", l = {588}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.partners.voice.viewmodel.VoiceSettingsListViewModel$loadMoreCatalog$2, reason: invalid class name and case insensitive filesystem */
    public final class C133742 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ VoiceCatalogCriteria $criteria;
        public final /* synthetic */ int $generation;
        public final /* synthetic */ int $requestedOffset;
        public final /* synthetic */ UiState $state;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C133742(VoiceCatalogCriteria voiceCatalogCriteria, int i, UiState uiState, int i2, HtJ<? super C133742> htJ) {
            super(2, htJ);
            this.$criteria = voiceCatalogCriteria;
            this.$requestedOffset = i;
            this.$state = uiState;
            this.$generation = i2;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return VoiceSettingsListViewModel.this.new C133742(this.$criteria, this.$requestedOffset, this.$state, this.$generation, htJ);
        }

        /* JADX WARN: Removed duplicated region for block: B:26:0x006d  */
        /* JADX WARN: Removed duplicated region for block: B:28:0x0073  */
        @Override // X.AbstractC8884Fsp
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r47) {
            /*
                Method dump skipped, instructions count: 479
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.partners.voice.viewmodel.VoiceSettingsListViewModel.C133742.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ((C133742) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.partners.voice.viewmodel.VoiceSettingsListViewModel$refreshSelectedVoice$1", f = "VoiceSettingsListViewModel.kt", l = {1102}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.partners.voice.viewmodel.VoiceSettingsListViewModel$refreshSelectedVoice$1, reason: invalid class name and case insensitive filesystem */
    public final class C133751 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ int $generation;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C133751(int i, HtJ<? super C133751> htJ) {
            super(2, htJ);
            this.$generation = i;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return VoiceSettingsListViewModel.this.new C133751(this.$generation, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            UiState value;
            Object settingsSelection = obj;
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(settingsSelection);
                VoiceSettingsListViewModel voiceSettingsListViewModel = VoiceSettingsListViewModel.this;
                VoiceSelectionRepository voiceSelectionRepository = voiceSettingsListViewModel.selectionRepository;
                AbstractC3358CGz abstractC3358CGz = voiceSettingsListViewModel.userSession;
                this.label = 1;
                settingsSelection = voiceSelectionRepository.readSettingsSelection(abstractC3358CGz, this);
                if (settingsSelection == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(settingsSelection);
            }
            VoiceSelectionIdentity voiceSelectionIdentity = (VoiceSelectionIdentity) settingsSelection;
            if (this.$generation == VoiceSettingsListViewModel.this.selectionGeneration.get()) {
                BLG<UiState> blg = VoiceSettingsListViewModel.this._uiState;
                do {
                    value = blg.getValue();
                } while (!blg.A6e(value, UiState.copy$default(value, null, voiceSelectionIdentity, null, null, false, false, null, null, null, null, null, null, null, null, null, null, 0, 0, null, null, null, null, false, null, false, false, false, false, false, null, false, false, -3, null)));
            }
            return Unit.INSTANCE;
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ((C133751) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.partners.voice.viewmodel.VoiceSettingsListViewModel$reloadCatalog$2", f = "VoiceSettingsListViewModel.kt", l = {727, 740}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.partners.voice.viewmodel.VoiceSettingsListViewModel$reloadCatalog$2, reason: invalid class name and case insensitive filesystem */
    public final class C133762 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ VoiceCatalogCriteria $criteria;
        public final /* synthetic */ boolean $debounceSearch;
        public final /* synthetic */ int $generation;
        public final /* synthetic */ String $localeTags;
        public final /* synthetic */ boolean $pinSelected;
        public final /* synthetic */ VoiceSelectionIdentity $selectedVoice;
        public int label;
        public final /* synthetic */ VoiceSettingsListViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C133762(boolean z, VoiceSettingsListViewModel voiceSettingsListViewModel, VoiceCatalogCriteria voiceCatalogCriteria, boolean z2, int i, String str, VoiceSelectionIdentity voiceSelectionIdentity, HtJ<? super C133762> htJ) {
            super(2, htJ);
            this.$debounceSearch = z;
            this.this$0 = voiceSettingsListViewModel;
            this.$criteria = voiceCatalogCriteria;
            this.$pinSelected = z2;
            this.$generation = i;
            this.$localeTags = str;
            this.$selectedVoice = voiceSelectionIdentity;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new C133762(this.$debounceSearch, this.this$0, this.$criteria, this.$pinSelected, this.$generation, this.$localeTags, this.$selectedVoice, htJ);
        }

        /* JADX WARN: Removed duplicated region for block: B:107:0x0237 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:108:0x0238  */
        /* JADX WARN: Removed duplicated region for block: B:28:0x0078 A[LOOP:1: B:26:0x0072->B:28:0x0078, LOOP_END] */
        /* JADX WARN: Removed duplicated region for block: B:34:0x008e  */
        /* JADX WARN: Removed duplicated region for block: B:48:0x00d4 A[LOOP:3: B:46:0x00ce->B:48:0x00d4, LOOP_END] */
        /* JADX WARN: Removed duplicated region for block: B:49:0x00e1  */
        /* JADX WARN: Removed duplicated region for block: B:51:0x00e6  */
        /* JADX WARN: Removed duplicated region for block: B:52:0x00e8  */
        /* JADX WARN: Removed duplicated region for block: B:53:0x00ea  */
        /* JADX WARN: Removed duplicated region for block: B:56:0x00f1  */
        /* JADX WARN: Removed duplicated region for block: B:63:0x0115  */
        /* JADX WARN: Removed duplicated region for block: B:66:0x011b  */
        /* JADX WARN: Removed duplicated region for block: B:68:0x011f  */
        /* JADX WARN: Removed duplicated region for block: B:83:0x014b  */
        /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
        @Override // X.AbstractC8884Fsp
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r53) {
            /*
                Method dump skipped, instructions count: 684
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.partners.voice.viewmodel.VoiceSettingsListViewModel.C133762.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ((C133762) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.partners.voice.viewmodel.VoiceSettingsListViewModel$renameSavedVoice$1", f = "VoiceSettingsListViewModel.kt", l = {969}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.partners.voice.viewmodel.VoiceSettingsListViewModel$renameSavedVoice$1, reason: invalid class name and case insensitive filesystem */
    public final class C133771 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ SavedVoiceOption $savedVoice;
        public final /* synthetic */ String $voiceName;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C133771(SavedVoiceOption savedVoiceOption, String str, HtJ<? super C133771> htJ) {
            super(2, htJ);
            this.$savedVoice = savedVoiceOption;
            this.$voiceName = str;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return VoiceSettingsListViewModel.this.new C133771(this.$savedVoice, this.$voiceName, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                if (VoiceSettingsListViewModel.this.getCanManageSavedVoices()) {
                    VoiceSettingsListViewModel voiceSettingsListViewModel = VoiceSettingsListViewModel.this;
                    VoiceSelectionRepository voiceSelectionRepository = voiceSettingsListViewModel.selectionRepository;
                    AbstractC3358CGz abstractC3358CGz = voiceSettingsListViewModel.userSession;
                    SavedVoiceOption savedVoiceOption = this.$savedVoice;
                    String str = this.$voiceName;
                    this.label = 1;
                    if (voiceSelectionRepository.renameSavedVoice(abstractC3358CGz, savedVoiceOption, str, this) == enumC10460Hji) {
                        return enumC10460Hji;
                    }
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
            return ((C133771) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void reloadCatalogAfterSelection(VoiceSelectionIdentity voiceSelectionIdentity) {
        reloadCatalog(false, false, voiceSelectionIdentity);
    }

    public final boolean canRenameSavedVoice(SavedVoiceOption savedVoiceOption, String str) {
        boolean zA1a = AnonymousClass002.A1a(savedVoiceOption, str);
        String strNormalizedSavedVoiceName = VoiceSelectionRepositoryJsonKt.normalizedSavedVoiceName(str);
        if (strNormalizedSavedVoiceName == null || strNormalizedSavedVoiceName.equals(savedVoiceOption.voice.name) || !getCanManageSavedVoices()) {
            return false;
        }
        return zA1a;
    }

    public final void deleteSavedVoice(SavedVoiceOption savedVoiceOption) {
        SavedVoiceDeletionState savedVoiceDeletionState;
        VoiceSelectionIdentity voiceSelectionIdentity;
        C7384Etj.A0Y(savedVoiceOption, 0);
        UiState uiStateA00 = AEs.A00(this);
        if (uiStateA00.isLoaded && !uiStateA00.isMutating() && getCanManageSavedVoices() && (savedVoiceDeletionState = uiStateA00.savedVoiceDeletionStates.get(savedVoiceOption.getRowId())) != null && savedVoiceDeletionState.canDelete) {
            consumeMutationFailure();
            VoiceTelemetry voiceTelemetry = this.telemetry;
            VoiceTelemetry.Interaction interaction = VoiceTelemetry.Interaction.CLICK;
            HatchComponent hatchComponent = HatchComponent.VOICE_DELETE_VOICE;
            Map<HatchMetadataKey, String> mapTelemetryMetadata = telemetryMetadata();
            int i = VoiceTelemetry.$stable;
            voiceTelemetry.interaction(interaction, hatchComponent, mapTelemetryMetadata, null);
            PendingVoiceSelection pendingVoiceSelection = this.pendingSelection;
            if (C7384Etj.areEqual((pendingVoiceSelection == null || (voiceSelectionIdentity = pendingVoiceSelection.identity) == null) ? null : voiceSelectionIdentity.savedVoiceId, savedVoiceOption.savedVoiceId)) {
                discardPendingSelection();
            }
            AnonymousClass001.A1I(AnonymousClass001.A0y(), new C133721(savedVoiceOption, savedVoiceDeletionState, null), AEu.A00(this));
        }
    }

    public final void onOpenFilter(VoiceCatalogFilterKind voiceCatalogFilterKind) {
        Object next;
        C7384Etj.A0Y(voiceCatalogFilterKind, 0);
        UiState uiStateA00 = AEs.A00(this);
        Iterator it = uiStateA00.availableCatalogFacets.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (((CatalogFacet) next).kind == voiceCatalogFilterKind) {
                    break;
                }
            }
        }
        CatalogFacet catalogFacet = (CatalogFacet) next;
        if (catalogFacet != null) {
            this.telemetry.interaction(VoiceTelemetry.Interaction.CLICK, HatchComponent.VOICE_SELECTION_OPEN_FILTER, C3cH.A0n(HatchMetadataKey.OPTION_COUNT_BUCKET, VoiceTelemetry.Companion.countBucket(catalogFacet.options.size()), C3cG.A0r(HatchMetadataKey.FACET_KIND, VoiceSettingsListViewModelKt.telemetryValue(voiceCatalogFilterKind)), C3cH.A0r(HatchMetadataKey.IS_RESELECT, catalogFacet.selectedValue != null), C3cG.A0r(HatchMetadataKey.ACTIVE_FILTER_COUNT, String.valueOf(VoiceSettingsListViewModelKt.activeFilterCount(uiStateA00.catalogCriteria)))), VoiceSettingsListViewModelKt.telemetryValue(voiceCatalogFilterKind));
        }
    }

    public final void onSwitchVoice(String str) {
        C7384Etj.A0Y(str, 0);
        this.pickOutcomeLogged = true;
        this.telemetry.interaction(VoiceTelemetry.Interaction.CLICK, HatchComponent.VOICE_SELECTION_SWITCH_VOICE, telemetryMetadata(), str);
    }

    public final void refreshCatalogForLocale(String str) {
        UiState value;
        UiState uiState;
        C7384Etj.A0Y(str, 0);
        UiState uiStateA00 = AEs.A00(this);
        if (str.equals(uiStateA00.catalogLocaleTags)) {
            HoC hoC = this.catalogReloadJob;
            if (hoC != null && hoC.isActive()) {
                return;
            }
            if (str.equals(uiStateA00.loadedCatalogLocaleTags) && uiStateA00.catalogFailure == null) {
                return;
            }
        }
        BLG<UiState> blg = this._uiState;
        do {
            value = blg.getValue();
            uiState = value;
        } while (!blg.A6e(value, UiState.copy$default(uiState, null, null, null, null, false, false, null, null, null, null, null, str, null, null, null, sortedCatalogFilters(uiState.catalogFilters, str), 0, 0, null, null, null, null, false, null, false, false, false, false, false, null, false, false, -34817, null)));
        reloadCatalog$default(this, false, false, null, 6, null);
    }

    public final void retryCatalog() {
        UiState uiStateA00 = AEs.A00(this);
        if (!uiStateA00.isLoaded) {
            while (!C3cJ.A11(this.refreshRequests)) {
            }
        }
        CatalogFailure catalogFailure = uiStateA00.catalogFailure;
        if (catalogFailure != null) {
            int[] iArr = WhenMappings.$EnumSwitchMapping$0;
            int iOrdinal = catalogFailure.ordinal();
            if (iOrdinal != -1) {
                if (iOrdinal == 0) {
                    logRetry("catalog", this.catalogAttempt.get() + 1);
                    reloadCatalog$default(this, false, true, null, 4, null);
                } else {
                    if (iOrdinal != 1) {
                        throw C3cG.A0q();
                    }
                    logRetry("page", this.pageAttempt.get() + 1);
                    loadMoreCatalog();
                }
            }
        }
    }

    public final void selectVoice(SavedVoiceOption savedVoiceOption) {
        C7384Etj.A0Y(savedVoiceOption, 0);
        if (AEs.A00(this).isLoaded && !AEs.A00(this).isMutating() && getCanManageSavedVoices()) {
            select(savedVoiceOption.voice, savedVoiceOption.savedVoiceId, savedVoiceOption.profileId);
        }
    }

    public final void updateCatalogQuery(String str) {
        C7384Etj.A0Y(str, 0);
        VoiceCatalogCriteria voiceCatalogCriteria = AEs.A00(this).catalogCriteria;
        updateCatalogCriteria(new VoiceCatalogCriteria(str, voiceCatalogCriteria.gender, voiceCatalogCriteria.accent, voiceCatalogCriteria.tone), true);
    }

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[VoiceCatalogFilterKind.values().length];
            try {
                AnonymousClass005.A0v(VoiceCatalogFilterKind.GENDER, iArr, 1);
            } catch (NoSuchFieldError unused) {
            }
            try {
                AnonymousClass005.A0v(VoiceCatalogFilterKind.ACCENT, iArr, 2);
            } catch (NoSuchFieldError unused2) {
            }
            try {
                AnonymousClass002.A15(VoiceCatalogFilterKind.TONE, iArr);
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[CatalogFailure.values().length];
            try {
                AnonymousClass005.A0v(CatalogFailure.INITIAL, iArr2, 1);
            } catch (NoSuchFieldError unused4) {
            }
            try {
                AnonymousClass005.A0v(CatalogFailure.LOAD_MORE, iArr2, 2);
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public VoiceSettingsListViewModel(AbstractC3358CGz abstractC3358CGz, VoiceEntryPoint voiceEntryPoint, boolean z) {
        boolean zA1b = AnonymousClass004.A1b(abstractC3358CGz, voiceEntryPoint);
        this.userSession = abstractC3358CGz;
        this.entryPoint = voiceEntryPoint;
        this.telemetry = new VoiceTelemetry(voiceEntryPoint, VoiceTelemetry.Page.SELECTION);
        this.searchActivated = new AtomicBoolean(zA1b);
        this.catalogAttempt = new AtomicInteger();
        this.filtersAttempt = new AtomicInteger();
        this.pageAttempt = new AtomicInteger();
        this.selectionRepository = VoiceSelectionRepository.Companion.getInstance(abstractC3358CGz);
        this.voiceCatalogRepository = new VoiceCatalogRepository();
        this.selectionGeneration = new AtomicInteger(zA1b ? 1 : 0);
        this.catalogGeneration = new AtomicInteger(zA1b ? 1 : 0);
        this.catalogFiltersGeneration = new AtomicInteger(zA1b ? 1 : 0);
        int i = zA1b ? 1 : 0;
        int i2 = zA1b ? 1 : 0;
        C9286GCn c9286GCnA14 = C3cG.A14(new UiState(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, zA1b, zA1b, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, i, i2, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, zA1b, 0 == true ? 1 : 0, zA1b, zA1b, zA1b, zA1b, zA1b, 0 == true ? 1 : 0, zA1b, zA1b, -1, 0 == true ? 1 : 0));
        this._uiState = c9286GCnA14;
        this.refreshRequests = C3cG.A14(Integer.valueOf(zA1b ? 1 : 0));
        this.uiState = C3cG.A11(c9286GCnA14);
        if (z) {
            AnonymousClass001.A1J(new AnonymousClass1(null), AEu.A00(this));
        }
        AnonymousClass001.A1I(AnonymousClass001.A0y(), new AnonymousClass2(null), AEu.A00(this));
    }

    private final Locale catalogLocale(String str) {
        String strA0S;
        Locale localeForLanguageTag;
        return (str == null || (strA0S = C7BY.A0S(str, str, ',')) == null || C7BY.A0j(strA0S) || (localeForLanguageTag = Locale.forLanguageTag(strA0S)) == null) ? C60Q.A0w() : localeForLanguageTag;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void loadCatalogFilters(VoiceCatalogCriteria voiceCatalogCriteria, int i, boolean z, boolean z2) {
        UiState value;
        AnonymousClass002.A1K(this.catalogFiltersJob);
        this.telemetry.beginEpisode(VoiceTelemetry.Episode.FILTERS);
        AtomicInteger atomicInteger = this.filtersAttempt;
        if (z2) {
            atomicInteger.incrementAndGet();
        } else {
            atomicInteger.set(1);
        }
        BLG<UiState> blg = this._uiState;
        do {
            value = blg.getValue();
        } while (!blg.A6e(value, UiState.copy$default(value, null, null, null, null, false, false, null, null, null, null, null, null, null, null, null, null, 0, 0, null, null, null, null, false, null, false, false, false, false, false, null, true, false, 1073741823, null)));
        BLL bllA00 = AEu.A00(this);
        this.catalogFiltersJob = GAo.A02(C79.A00, AnonymousClass001.A0y(), new C133732(z, this, voiceCatalogCriteria, i, null), bllA00);
    }

    private final void logBackConfirmation(String str) {
        this.telemetry.interaction(VoiceTelemetry.Interaction.CLICK, HatchComponent.VOICE_SELECTION_BACK_BUTTON, telemetryMetadata(), str);
    }

    private final void logRetry(String str, int i) {
        VoiceTelemetry voiceTelemetry = this.telemetry;
        VoiceTelemetry.Interaction interaction = VoiceTelemetry.Interaction.CLICK;
        HatchComponent hatchComponent = HatchComponent.RETRY_BUTTON;
        LinkedHashMap linkedHashMapA02 = AGH.A02(telemetryMetadata(), AnonymousClass007.A0d(HatchMetadataKey.ATTEMPT_NUMBER, String.valueOf(i), C3cG.A0r(HatchMetadataKey.RETRY_TARGET, str)));
        int i2 = VoiceTelemetry.$stable;
        voiceTelemetry.interaction(interaction, hatchComponent, linkedHashMapA02, null);
    }

    private final void reloadCatalog(boolean z, boolean z2, VoiceSelectionIdentity voiceSelectionIdentity) {
        UiState value;
        UiState uiStateA00 = AEs.A00(this);
        VoiceCatalogCriteria voiceCatalogCriteria = uiStateA00.catalogCriteria;
        String str = uiStateA00.catalogLocaleTags;
        boolean zShouldPinSelectedVoice = shouldPinSelectedVoice(voiceCatalogCriteria, voiceSelectionIdentity);
        int iIncrementAndGet = this.catalogGeneration.incrementAndGet();
        int iIncrementAndGet2 = this.catalogFiltersGeneration.incrementAndGet();
        HoC hoC = this.catalogReloadJob;
        if (hoC != null) {
            hoC.A5w(null);
        }
        HoC hoC2 = this.catalogFiltersJob;
        if (hoC2 != null) {
            hoC2.A5w(null);
        }
        HoC hoC3 = this.catalogLoadMoreJob;
        if (hoC3 != null) {
            hoC3.A5w(null);
        }
        this.telemetry.beginEpisode(VoiceTelemetry.Episode.CATALOG);
        AtomicInteger atomicInteger = this.catalogAttempt;
        if (z2) {
            atomicInteger.incrementAndGet();
        } else {
            atomicInteger.set(1);
        }
        BLG<UiState> blg = this._uiState;
        do {
            value = blg.getValue();
        } while (!blg.A6e(value, UiState.copy$default(value, null, null, null, null, false, false, null, null, null, null, null, null, null, null, null, null, 0, 0, null, null, null, null, false, null, zShouldPinSelectedVoice, false, !z, z, false, null, true, false, 16646143, null)));
        this.catalogReloadJob = GAo.A02(C79.A00, AnonymousClass001.A0y(), new C133762(z, this, voiceCatalogCriteria, zShouldPinSelectedVoice, iIncrementAndGet, str, voiceSelectionIdentity, null), AEu.A00(this));
        loadCatalogFilters(voiceCatalogCriteria, iIncrementAndGet2, z, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x0101  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void select(com.facebook.aura.partners.voice.api.VoiceOption r47, java.lang.String r48, java.lang.String r49) {
        /*
            Method dump skipped, instructions count: 422
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.partners.voice.viewmodel.VoiceSettingsListViewModel.select(com.facebook.aura.partners.voice.api.VoiceOption, java.lang.String, java.lang.String):void");
    }

    private final void updateCatalogCriteria(VoiceCatalogCriteria voiceCatalogCriteria, boolean z) {
        UiState value;
        if (C7384Etj.areEqual(AEs.A00(this).catalogCriteria, voiceCatalogCriteria)) {
            return;
        }
        BLG<UiState> blg = this._uiState;
        do {
            value = blg.getValue();
        } while (!blg.A6e(value, UiState.copy$default(value, null, null, null, null, false, false, null, null, null, null, voiceCatalogCriteria, null, null, null, null, null, 0, 0, null, null, null, null, false, null, false, false, false, false, false, null, false, false, -1025, null)));
        reloadCatalog$default(this, z, false, null, 6, null);
    }

    public final void commitPendingSelection(boolean z) {
        PendingVoiceSelection pendingVoiceSelection = this.pendingSelection;
        if (pendingVoiceSelection != null) {
            if (pendingVoiceSelection.identity.savedVoiceId != null && !getCanManageSavedVoices()) {
                discardPendingSelection();
                return;
            }
            this.pendingSelection = null;
            VoiceSelectionIdentity voiceSelectionIdentity = pendingVoiceSelection.identity;
            VoiceOption voiceOption = pendingVoiceSelection.voice;
            if (z) {
                logBackConfirmation(voiceOption.id);
            }
            this.selectionRepository.persistSettingsSelection(this.userSession, voiceOption, voiceSelectionIdentity.savedVoiceId, voiceSelectionIdentity.profileId, true, this.telemetry.selectionCommit(voiceOption.id), new C133711(this.selectionGeneration.incrementAndGet(), this, voiceSelectionIdentity));
        }
    }

    public final void consumeMutationFailure() {
        this.selectionRepository.consumeMutationFailure();
    }

    public final void discardPendingSelection() {
        UiState value;
        if (this.pendingSelection == null && AEs.A00(this).pendingSelectedVoice == null) {
            return;
        }
        this.pendingSelection = null;
        BLG<UiState> blg = this._uiState;
        do {
            value = blg.getValue();
        } while (!blg.A6e(value, UiState.copy$default(value, null, null, null, null, false, false, null, null, null, null, null, null, null, null, null, null, 0, 0, null, null, null, null, false, null, false, false, false, false, false, null, false, false, -13, null)));
    }

    public final boolean getCanManageSavedVoices() {
        return this.entryPoint == VoiceEntryPoint.SETTINGS && VoiceGating.INSTANCE.isVoiceDesignEnabled();
    }

    public final VoiceTelemetry getTelemetry() {
        return this.telemetry;
    }

    public final C1BN<UiState> getUiState() {
        return this.uiState;
    }

    public final void loadMoreCatalog() {
        UiState value;
        UiState value2 = this._uiState.getValue();
        if (value2.isCatalogLoading || value2.isCatalogLoadingMore || !value2.canLoadMoreCatalog || value2.catalogFailure == CatalogFailure.INITIAL) {
            return;
        }
        int i = this.catalogGeneration.get();
        VoiceCatalogCriteria voiceCatalogCriteria = value2.catalogCriteria;
        int i2 = value2.catalogNextOffset;
        this.telemetry.beginEpisode(VoiceTelemetry.Episode.PAGE);
        CatalogFailure catalogFailure = value2.catalogFailure;
        CatalogFailure catalogFailure2 = CatalogFailure.LOAD_MORE;
        AtomicInteger atomicInteger = this.pageAttempt;
        if (catalogFailure == catalogFailure2) {
            atomicInteger.incrementAndGet();
        } else {
            atomicInteger.set(1);
        }
        BLG<UiState> blg = this._uiState;
        do {
            value = blg.getValue();
        } while (!blg.A6e(value, UiState.copy$default(value, null, null, null, null, false, false, null, null, null, null, null, null, null, null, null, null, 0, 0, null, null, null, null, false, null, false, false, false, false, true, null, false, false, -805306369, null)));
        HoC hoC = this.catalogLoadMoreJob;
        if (hoC != null) {
            hoC.A5w(null);
        }
        BLL bllA00 = AEu.A00(this);
        this.catalogLoadMoreJob = GAo.A02(C79.A00, AnonymousClass001.A0y(), new C133742(voiceCatalogCriteria, i2, value2, i, null), bllA00);
    }

    public final void logDiscardedPick() {
        VoiceOption voiceOption;
        if (this.pickOutcomeLogged || (voiceOption = AEs.A00(this).voiceToChoose) == null) {
            return;
        }
        this.pickOutcomeLogged = true;
        this.telemetry.interaction(VoiceTelemetry.Interaction.DISMISS, HatchComponent.CLOSE_BUTTON, telemetryMetadata(), voiceOption.id);
    }

    @Override // X.AEs
    public void onCleared() {
        if (this.telemetry.getOrigin() == HatchOrigin.CHAT) {
            logDiscardedPick();
        }
        this.telemetry.endVisit(FeedInstructionsCardStoreKt.KEY_DISMISSED);
    }

    public final void onSearchActivated() {
        if (C3cI.A1W(this.searchActivated)) {
            VoiceCatalogCriteria voiceCatalogCriteria = AEs.A00(this).catalogCriteria;
            VoiceTelemetry voiceTelemetry = this.telemetry;
            VoiceTelemetry.Interaction interaction = VoiceTelemetry.Interaction.CLICK;
            HatchComponent hatchComponent = HatchComponent.SEARCH_BAR;
            LinkedHashMap linkedHashMapA02 = AGH.A02(telemetryMetadata(), AnonymousClass007.A0d(HatchMetadataKey.QUERY_PRESENT, String.valueOf(!C7BY.A0j(voiceCatalogCriteria.query)), C3cG.A0r(HatchMetadataKey.ACTION, "activate")));
            int i = VoiceTelemetry.$stable;
            voiceTelemetry.interaction(interaction, hatchComponent, linkedHashMapA02, null);
        }
    }

    public final void refresh() {
        if (!this.telemetry.getHasActiveVisit()) {
            this.searchActivated.set(false);
        }
        this.telemetry.beginVisit();
        while (!C3cJ.A11(this.refreshRequests)) {
        }
    }

    public final void selectCatalogAccent(String str) {
        selectCatalogFilter(VoiceCatalogFilterKind.ACCENT, str);
    }

    public final void selectCatalogGender(String str) {
        selectCatalogFilter(VoiceCatalogFilterKind.GENDER, str);
    }

    public final void selectCatalogTone(String str) {
        selectCatalogFilter(VoiceCatalogFilterKind.TONE, str);
    }

    public final Map<HatchMetadataKey, String> telemetryMetadata() {
        return AnonymousClass006.A10(HatchMetadataKey.CRITERIA_KIND, VoiceSettingsListViewModelKt.telemetryKind(AEs.A00(this).catalogCriteria));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final AHD<VoiceOption> mergeCatalogVoices(AHD<VoiceOption> ahd, AHD<VoiceOption> ahd2) {
        LinkedHashSet linkedHashSetA0k = C3cG.A0k();
        Iterator it = ahd.iterator();
        while (it.hasNext()) {
            linkedHashSetA0k.add(C8j4.A0z(it));
        }
        ArrayList arrayListA0h = C3cG.A0h();
        for (Object obj : ahd2) {
            if (linkedHashSetA0k.add(((VoiceOption) obj).id)) {
                arrayListA0h.add(obj);
            }
        }
        return AGI.A07(AbstractC0878AGe.A0P(arrayListA0h, ahd));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void refreshSelectedVoice(int i) {
        AnonymousClass001.A1I(AnonymousClass001.A0y(), new C133751(i, null), AEu.A00(this));
    }

    public static /* synthetic */ void reloadCatalog$default(VoiceSettingsListViewModel voiceSettingsListViewModel, boolean z, boolean z2, VoiceSelectionIdentity voiceSelectionIdentity, int i, Object obj) {
        boolean zA1Q = AnonymousClass001.A1Q(i, z2);
        if ((i & 4) != 0) {
            voiceSelectionIdentity = AEs.A00(voiceSettingsListViewModel).selectedVoice;
        }
        voiceSettingsListViewModel.reloadCatalog(z, zA1Q, voiceSelectionIdentity);
    }

    private final void selectCatalogFilter(VoiceCatalogFilterKind voiceCatalogFilterKind, String str) {
        VoiceCatalogCriteria voiceCatalogCriteria;
        VoiceCatalogCriteria voiceCatalogCriteria2 = AEs.A00(this).catalogCriteria;
        int[] iArr = WhenMappings.$EnumSwitchMapping$0;
        int iOrdinal = voiceCatalogFilterKind.ordinal();
        if (iOrdinal == 0) {
            String str2 = voiceCatalogCriteria2.query;
            String str3 = voiceCatalogCriteria2.accent;
            String str4 = voiceCatalogCriteria2.tone;
            C7384Etj.A0Y(str2, 0);
            voiceCatalogCriteria = new VoiceCatalogCriteria(str2, str, str3, str4);
        } else if (iOrdinal == 1) {
            String str5 = voiceCatalogCriteria2.query;
            String str6 = voiceCatalogCriteria2.gender;
            String str7 = voiceCatalogCriteria2.tone;
            C7384Etj.A0Y(str5, 0);
            voiceCatalogCriteria = new VoiceCatalogCriteria(str5, str6, str, str7);
        } else {
            if (iOrdinal != 2) {
                throw C3cG.A0q();
            }
            String str8 = voiceCatalogCriteria2.query;
            String str9 = voiceCatalogCriteria2.gender;
            String str10 = voiceCatalogCriteria2.accent;
            C7384Etj.A0Y(str8, 0);
            voiceCatalogCriteria = new VoiceCatalogCriteria(str8, str9, str10, str);
        }
        this.telemetry.interaction(VoiceTelemetry.Interaction.CLICK, HatchComponent.VOICE_SELECTION_FILTER_OPTION, AGH.A0D(C3cG.A0r(HatchMetadataKey.FACET_KIND, VoiceSettingsListViewModelKt.telemetryValue(voiceCatalogFilterKind)), C3cG.A0r(HatchMetadataKey.ACTION, str == null ? "clear_one" : "select"), C3cH.A0r(HatchMetadataKey.IS_RESELECT, voiceCatalogCriteria2.equals(voiceCatalogCriteria)), C3cH.A0r(HatchMetadataKey.CRITERIA_CHANGED, !voiceCatalogCriteria2.equals(voiceCatalogCriteria)), C3cG.A0r(HatchMetadataKey.ACTIVE_FILTER_COUNT_BEFORE, String.valueOf(VoiceSettingsListViewModelKt.activeFilterCount(voiceCatalogCriteria2))), C3cG.A0r(HatchMetadataKey.ACTIVE_FILTER_COUNT_AFTER, String.valueOf(VoiceSettingsListViewModelKt.activeFilterCount(voiceCatalogCriteria)))), VoiceSettingsListViewModelKt.telemetryValue(voiceCatalogFilterKind));
        updateCatalogCriteria(voiceCatalogCriteria, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean shouldPinSelectedVoice(VoiceCatalogCriteria voiceCatalogCriteria, VoiceSelectionIdentity voiceSelectionIdentity) {
        if (voiceCatalogCriteria.isEmpty()) {
            return voiceSelectionIdentity == null || voiceSelectionIdentity.savedVoiceId == null;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final VoiceCatalogFilters sortedCatalogFilters(VoiceCatalogFilters voiceCatalogFilters, String str) {
        final Collator collator = Collator.getInstance(catalogLocale(str));
        collator.setStrength(1);
        collator.setDecomposition(1);
        final Comparator comparator = new Comparator() { // from class: com.facebook.aura.partners.voice.viewmodel.VoiceSettingsListViewModel$sortedCatalogFilters$$inlined$compareBy$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                return Boolean.valueOf(AnonymousClass002.A1M(((VoiceCatalogFilterOption) t).count)).compareTo(Boolean.valueOf(((VoiceCatalogFilterOption) t2).count == 0));
            }
        };
        Comparator comparator2 = new Comparator() { // from class: com.facebook.aura.partners.voice.viewmodel.VoiceSettingsListViewModel$sortedCatalogFilters$$inlined$thenComparator$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                int iCompare = comparator.compare(t, t2);
                return iCompare == 0 ? collator.compare(((VoiceCatalogFilterOption) t).label, ((VoiceCatalogFilterOption) t2).label) : iCompare;
            }
        };
        return voiceCatalogFilters.copy(AGI.A07(AbstractC0878AGe.A0c(voiceCatalogFilters.gender, comparator2)), AGI.A07(AbstractC0878AGe.A0c(voiceCatalogFilters.accent, comparator2)), AGI.A07(AbstractC0878AGe.A0c(voiceCatalogFilters.tone, comparator2)));
    }

    public final void clearCatalogFilters() {
        VoiceCatalogCriteria voiceCatalogCriteria = AEs.A00(this).catalogCriteria;
        VoiceTelemetry voiceTelemetry = this.telemetry;
        VoiceTelemetry.Interaction interaction = VoiceTelemetry.Interaction.CLICK;
        HatchComponent hatchComponent = HatchComponent.VOICE_SELECTION_FILTER_OPTION;
        Map<HatchMetadataKey, String> mapA0n = C3cH.A0n(HatchMetadataKey.QUERY_PRESENT, String.valueOf(!C7BY.A0j(voiceCatalogCriteria.query)), C3cG.A0r(HatchMetadataKey.ACTION, "clear_all"), C3cG.A0r(HatchMetadataKey.ACTIVE_FILTER_COUNT_BEFORE, String.valueOf(VoiceSettingsListViewModelKt.activeFilterCount(voiceCatalogCriteria))), C3cG.A0r(HatchMetadataKey.ACTIVE_FILTER_COUNT_AFTER, HatchPriceImpressionEventDataKt.NO_DISCOUNT));
        int i = VoiceTelemetry.$stable;
        voiceTelemetry.interaction(interaction, hatchComponent, mapA0n, null);
        String str = voiceCatalogCriteria.query;
        C7384Etj.A0Y(str, 0);
        updateCatalogCriteria(new VoiceCatalogCriteria(str, null, null, null), false);
    }

    public final void clearCatalogQuery() {
        VoiceCatalogCriteria voiceCatalogCriteria = AEs.A00(this).catalogCriteria;
        if (voiceCatalogCriteria.query.length() > 0) {
            VoiceTelemetry voiceTelemetry = this.telemetry;
            VoiceTelemetry.Interaction interaction = VoiceTelemetry.Interaction.CLICK;
            HatchComponent hatchComponent = HatchComponent.SEARCH_BAR;
            Map<HatchMetadataKey, String> mapA0d = AnonymousClass007.A0d(HatchMetadataKey.ACTIVE_FILTER_COUNT, String.valueOf(VoiceSettingsListViewModelKt.activeFilterCount(voiceCatalogCriteria)), C3cG.A0r(HatchMetadataKey.ACTION, "clear"));
            int i = VoiceTelemetry.$stable;
            voiceTelemetry.interaction(interaction, hatchComponent, mapA0d, null);
        }
        updateCatalogQuery("");
    }

    public final void onPreviewVoice(SavedVoiceOption savedVoiceOption, VoiceControlsViewModel.UiState.PreviewState previewState) {
        AnonymousClass003.A0u(savedVoiceOption, previewState);
        if (AEs.A00(this).isLoaded && !AEs.A00(this).isLibraryMutating() && getCanManageSavedVoices()) {
            onPreviewVoice(savedVoiceOption.voice, previewState, savedVoiceOption.getRowId(), "saved");
        }
    }

    public final void renameSavedVoice(SavedVoiceOption savedVoiceOption, String str) {
        String strNormalizedSavedVoiceName;
        AnonymousClass003.A0u(savedVoiceOption, str);
        if (!AEs.A00(this).isLoaded || AEs.A00(this).isMutating() || (strNormalizedSavedVoiceName = VoiceSelectionRepositoryJsonKt.normalizedSavedVoiceName(str)) == null || strNormalizedSavedVoiceName.equals(savedVoiceOption.voice.name) || !getCanManageSavedVoices()) {
            return;
        }
        consumeMutationFailure();
        VoiceTelemetry voiceTelemetry = this.telemetry;
        VoiceTelemetry.Interaction interaction = VoiceTelemetry.Interaction.CLICK;
        HatchComponent hatchComponent = HatchComponent.VOICE_RENAME_VOICE;
        Map<HatchMetadataKey, String> mapTelemetryMetadata = telemetryMetadata();
        int i = VoiceTelemetry.$stable;
        voiceTelemetry.interaction(interaction, hatchComponent, mapTelemetryMetadata, null);
        AnonymousClass001.A1I(AnonymousClass001.A0y(), new C133771(savedVoiceOption, strNormalizedSavedVoiceName, null), AEu.A00(this));
    }

    public final void retryCatalogFilters() {
        UiState uiStateA00 = AEs.A00(this);
        if (uiStateA00.areCatalogFiltersLoading || !uiStateA00.catalogFiltersFailed) {
            return;
        }
        logRetry("filters", this.filtersAttempt.get() + 1);
        loadCatalogFilters(uiStateA00.catalogCriteria, this.catalogFiltersGeneration.incrementAndGet(), false, true);
    }

    public /* synthetic */ VoiceSettingsListViewModel(AbstractC3358CGz abstractC3358CGz, VoiceEntryPoint voiceEntryPoint, boolean z, int i, C06H c06h) {
        this(abstractC3358CGz, voiceEntryPoint, AnonymousClass005.A1O(i, z));
    }

    public final void onPreviewVoice(VoiceOption voiceOption, VoiceControlsViewModel.UiState.PreviewState previewState) {
        String str;
        AnonymousClass003.A0u(voiceOption, previewState);
        String str2 = voiceOption.id;
        if (AEs.A00(this).isCurrentSavedVoice(voiceOption)) {
            str = "saved";
        } else {
            str = PinnedItemsRepositoryJsonKt.NAVIGATION_SOURCE_SYSTEM;
        }
        onPreviewVoice(voiceOption, previewState, str2, str);
    }

    public final void selectVoice(VoiceOption voiceOption) {
        String str;
        C7384Etj.A0Y(voiceOption, 0);
        VoiceSelectionIdentity voiceSelectionIdentityCurrentVoiceSelection = AEs.A00(this).currentVoiceSelection(voiceOption);
        String str2 = null;
        if (voiceSelectionIdentityCurrentVoiceSelection != null) {
            str = voiceSelectionIdentityCurrentVoiceSelection.savedVoiceId;
            str2 = voiceSelectionIdentityCurrentVoiceSelection.profileId;
        } else {
            str = null;
        }
        select(voiceOption, str, str2);
    }

    private final void onPreviewVoice(VoiceOption voiceOption, VoiceControlsViewModel.UiState.PreviewState previewState, String str, String str2) {
        String str3;
        if (C7384Etj.areEqual(str, previewState.getPreviewPlayingVoiceId())) {
            str3 = "stop";
        } else {
            str3 = C7384Etj.areEqual(str, previewState.getPreviewLoadingVoiceId()) ? "cancel_loading" : WidgetComponentsKt.START_PATH;
        }
        String previewPlayingVoiceId = previewState.getPreviewPlayingVoiceId();
        if (previewPlayingVoiceId == null) {
            previewPlayingVoiceId = previewState.getPreviewLoadingVoiceId();
        }
        VoiceTelemetry voiceTelemetry = this.telemetry;
        VoiceTelemetry.Interaction interaction = VoiceTelemetry.Interaction.CLICK;
        HatchComponent hatchComponent = HatchComponent.VOICE_SELECTION_PLAY_SAMPLE;
        Map<HatchMetadataKey, String> mapTelemetryMetadata = telemetryMetadata();
        HxE hxEA0r = C3cG.A0r(HatchMetadataKey.ACTION, str3);
        boolean z = false;
        HxE hxEA0r2 = C3cG.A0r(HatchMetadataKey.VOICE_SOURCE, str2);
        HatchMetadataKey hatchMetadataKey = HatchMetadataKey.SUPERSEDES_ACTIVE_PREVIEW;
        boolean zEquals = str3.equals(WidgetComponentsKt.START_PATH);
        if (zEquals && previewPlayingVoiceId != null && !previewPlayingVoiceId.equals(str)) {
            z = true;
        }
        voiceTelemetry.interaction(interaction, hatchComponent, AGH.A02(mapTelemetryMetadata, C3cH.A0m(hatchMetadataKey, String.valueOf(z), hxEA0r, hxEA0r2)), voiceOption.id);
        if (zEquals) {
            this.telemetry.markPreview();
        }
    }
}
