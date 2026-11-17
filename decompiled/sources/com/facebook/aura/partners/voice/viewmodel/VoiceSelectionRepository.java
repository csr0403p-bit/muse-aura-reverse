package com.facebook.aura.partners.voice.viewmodel;

import X.AIW;
import X.AbstractC07127nr;
import X.AbstractC3358CGz;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.BLG;
import X.C06G;
import X.C06H;
import X.C0924AIa;
import X.C0KA;
import X.C10543Hqv;
import X.C10550Hrx;
import X.C1BN;
import X.C27k;
import X.C3UX;
import X.C3cG;
import X.C3cH;
import X.C60N;
import X.C60Q;
import X.C7384Etj;
import X.C78W;
import X.C7BY;
import X.C9286GCn;
import X.CFK;
import X.EnumC10460Hji;
import X.Ey9;
import X.G0U;
import X.G0V;
import X.G0W;
import X.HoC;
import X.HtJ;
import X.Hwg;
import X.Hxb;
import X.HzP;
import X.InterfaceC7549F2g;
import com.facebook.aura.analytics.hatch.HatchMetadataKey;
import com.facebook.aura.gateway.HatchFileOperations;
import com.facebook.aura.gateway.store.HatchGatewayPrefsStore;
import com.facebook.aura.login.nativeflow.MC;
import com.facebook.aura.pairs.PairsRepositoryKt;
import com.facebook.aura.partners.voice.api.SavedVoiceOption;
import com.facebook.aura.partners.voice.api.VoiceCatalogRepository;
import com.facebook.aura.partners.voice.api.VoiceOption;
import com.facebook.aura.partners.voice.api.VoiceSelectionIdentity;
import com.facebook.aura.partners.voice.prefs.VoicePrefs;
import com.facebook.aura.partners.voice.viewmodel.VoiceTelemetry;
import com.facebook.aura.settings.MC;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* loaded from: classes4.dex */
public final class VoiceSelectionRepository implements InterfaceC7549F2g {
    public static final int $stable = 8;
    public static final Companion Companion = new Companion();
    public final BLG<OperationState> _operations;
    public volatile boolean isCleared;
    public HoC lastWrite;
    public final C1BN<OperationState> operations;
    public final C3UX scope;
    public final AtomicInteger selectionGeneration;
    public final Object writeQueueLock;

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

    public final class OperationState extends C06G {
        public static final int $stable = 0;
        public final String deletingSavedVoiceId;
        public final MutationFailure failure;
        public final String renamingSavedVoiceId;
        public final int revision;
        public final String savingSelectionRowId;
        public final int selectionFailureRevision;

        public static /* synthetic */ OperationState copy$default(OperationState operationState, String str, String str2, String str3, int i, int i2, MutationFailure mutationFailure, int i3, Object obj) {
            String str4 = str;
            String str5 = str2;
            String str6 = str3;
            int i4 = i;
            int i5 = i2;
            MutationFailure mutationFailure2 = mutationFailure;
            if ((i3 & 1) != 0) {
                str4 = operationState.renamingSavedVoiceId;
            }
            if ((i3 & 2) != 0) {
                str5 = operationState.deletingSavedVoiceId;
            }
            if ((i3 & 4) != 0) {
                str6 = operationState.savingSelectionRowId;
            }
            if ((i3 & 8) != 0) {
                i4 = operationState.revision;
            }
            if ((i3 & 16) != 0) {
                i5 = operationState.selectionFailureRevision;
            }
            if ((i3 & 32) != 0) {
                mutationFailure2 = operationState.failure;
            }
            return new OperationState(str4, str5, str6, i4, i5, mutationFailure2);
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof OperationState) {
                    OperationState operationState = (OperationState) obj;
                    if (!C7384Etj.areEqual(this.renamingSavedVoiceId, operationState.renamingSavedVoiceId) || !C7384Etj.areEqual(this.deletingSavedVoiceId, operationState.deletingSavedVoiceId) || !C7384Etj.areEqual(this.savingSelectionRowId, operationState.savingSelectionRowId) || this.revision != operationState.revision || this.selectionFailureRevision != operationState.selectionFailureRevision || this.failure != operationState.failure) {
                    }
                }
                return false;
            }
            return true;
        }

        public /* synthetic */ OperationState(String str, String str2, String str3, int i, int i2, MutationFailure mutationFailure, int i3, C06H c06h) {
            this((i3 & 1) != 0 ? null : str, (i3 & 2) != 0 ? null : str2, (i3 & 4) != 0 ? null : str3, (i3 & 8) != 0 ? 0 : i, (i3 & 16) != 0 ? 0 : i2, (i3 & 32) != 0 ? null : mutationFailure);
        }

        public final String component1() {
            return this.renamingSavedVoiceId;
        }

        public final String component2() {
            return this.deletingSavedVoiceId;
        }

        public final String component3() {
            return this.savingSelectionRowId;
        }

        public final int component4() {
            return this.revision;
        }

        public final int component5() {
            return this.selectionFailureRevision;
        }

        public final MutationFailure component6() {
            return this.failure;
        }

        public final OperationState copy(String str, String str2, String str3, int i, int i2, MutationFailure mutationFailure) {
            return new OperationState(str, str2, str3, i, i2, mutationFailure);
        }

        public final String getDeletingSavedVoiceId() {
            return this.deletingSavedVoiceId;
        }

        public final MutationFailure getFailure() {
            return this.failure;
        }

        public final String getRenamingSavedVoiceId() {
            return this.renamingSavedVoiceId;
        }

        public final int getRevision() {
            return this.revision;
        }

        public final String getSavingSelectionRowId() {
            return this.savingSelectionRowId;
        }

        public final int getSelectionFailureRevision() {
            return this.selectionFailureRevision;
        }

        public int hashCode() {
            return (((((((((AnonymousClass006.A0G(this.renamingSavedVoiceId) * 31) + AnonymousClass006.A0G(this.deletingSavedVoiceId)) * 31) + AnonymousClass006.A0G(this.savingSelectionRowId)) * 31) + this.revision) * 31) + this.selectionFailureRevision) * 31) + C3cH.A02(this.failure);
        }

        public final boolean isBusy() {
            return (this.renamingSavedVoiceId == null && this.deletingSavedVoiceId == null && this.savingSelectionRowId == null) ? false : true;
        }

        public String toString() {
            return super.toString();
        }

        public OperationState(String str, String str2, String str3, int i, int i2, MutationFailure mutationFailure) {
            this.renamingSavedVoiceId = str;
            this.deletingSavedVoiceId = str2;
            this.savingSelectionRowId = str3;
            this.revision = i;
            this.selectionFailureRevision = i2;
            this.failure = mutationFailure;
        }

        public OperationState() {
            this(null, null, null, 0, 0, null);
        }
    }

    public final class SelectionResult extends C06G {
        public static final int $stable = 0;
        public final String cacheResult;
        public final String confirmation;
        public final String disposition;
        public final String failureReason;
        public final String persistenceCertainty;
        public final String result;
        public final VoiceSelectionIdentity selectedVoice;
        public final boolean success;

        public SelectionResult(boolean z, String str, String str2, String str3, String str4, String str5, String str6, VoiceSelectionIdentity voiceSelectionIdentity) {
            C7384Etj.A0Y(str, 1);
            AnonymousClass005.A16(str2, str3, str4, str5, 2);
            this.success = z;
            this.result = str;
            this.confirmation = str2;
            this.disposition = str3;
            this.persistenceCertainty = str4;
            this.cacheResult = str5;
            this.failureReason = str6;
            this.selectedVoice = voiceSelectionIdentity;
        }

        public final SelectionResult copy(boolean z, String str, String str2, String str3, String str4, String str5, String str6, VoiceSelectionIdentity voiceSelectionIdentity) {
            C7384Etj.A0Y(str, 1);
            AnonymousClass005.A16(str2, str3, str4, str5, 2);
            return new SelectionResult(z, str, str2, str3, str4, str5, str6, voiceSelectionIdentity);
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof SelectionResult) {
                    SelectionResult selectionResult = (SelectionResult) obj;
                    if (this.success != selectionResult.success || !C7384Etj.areEqual(this.result, selectionResult.result) || !C7384Etj.areEqual(this.confirmation, selectionResult.confirmation) || !C7384Etj.areEqual(this.disposition, selectionResult.disposition) || !C7384Etj.areEqual(this.persistenceCertainty, selectionResult.persistenceCertainty) || !C7384Etj.areEqual(this.cacheResult, selectionResult.cacheResult) || !C7384Etj.areEqual(this.failureReason, selectionResult.failureReason) || !C7384Etj.areEqual(this.selectedVoice, selectionResult.selectedVoice)) {
                    }
                }
                return false;
            }
            return true;
        }

        public static /* synthetic */ SelectionResult copy$default(SelectionResult selectionResult, boolean z, String str, String str2, String str3, String str4, String str5, String str6, VoiceSelectionIdentity voiceSelectionIdentity, int i, Object obj) {
            if ((i & 1) != 0) {
                z = selectionResult.success;
            }
            if ((i & 2) != 0) {
                str = selectionResult.result;
            }
            if ((i & 4) != 0) {
                str2 = selectionResult.confirmation;
            }
            if ((i & 8) != 0) {
                str3 = selectionResult.disposition;
            }
            if ((i & 16) != 0) {
                str4 = selectionResult.persistenceCertainty;
            }
            if ((i & 32) != 0) {
                str5 = selectionResult.cacheResult;
            }
            if ((i & 64) != 0) {
                str6 = selectionResult.failureReason;
            }
            if ((i & 128) != 0) {
                voiceSelectionIdentity = selectionResult.selectedVoice;
            }
            return selectionResult.copy(z, str, str2, str3, str4, str5, str6, voiceSelectionIdentity);
        }

        public final boolean component1() {
            return this.success;
        }

        public final String component2() {
            return this.result;
        }

        public final String component3() {
            return this.confirmation;
        }

        public final String component4() {
            return this.disposition;
        }

        public final String component5() {
            return this.persistenceCertainty;
        }

        public final String component6() {
            return this.cacheResult;
        }

        public final String component7() {
            return this.failureReason;
        }

        public final VoiceSelectionIdentity component8() {
            return this.selectedVoice;
        }

        public final String getCacheResult() {
            return this.cacheResult;
        }

        public final String getConfirmation() {
            return this.confirmation;
        }

        public final String getDisposition() {
            return this.disposition;
        }

        public final String getFailureReason() {
            return this.failureReason;
        }

        public final String getPersistenceCertainty() {
            return this.persistenceCertainty;
        }

        public final String getResult() {
            return this.result;
        }

        public final VoiceSelectionIdentity getSelectedVoice() {
            return this.selectedVoice;
        }

        public final boolean getSuccess() {
            return this.success;
        }

        public int hashCode() {
            return ((AnonymousClass005.A0I(this.cacheResult, AnonymousClass005.A0I(this.persistenceCertainty, AnonymousClass005.A0I(this.disposition, AnonymousClass005.A0I(this.confirmation, AnonymousClass005.A0I(this.result, C0KA.A02(this.success)))))) + AnonymousClass006.A0G(this.failureReason)) * 31) + C3cH.A02(this.selectedVoice);
        }

        public final Map<HatchMetadataKey, String> telemetryMetadata() {
            C0924AIa c0924AIaA0u = C3cG.A0u();
            c0924AIaA0u.put(HatchMetadataKey.RESULT, this.result);
            c0924AIaA0u.put(HatchMetadataKey.CONFIRMATION, this.confirmation);
            c0924AIaA0u.put(HatchMetadataKey.DISPOSITION, this.disposition);
            c0924AIaA0u.put(HatchMetadataKey.PERSISTENCE_CERTAINTY, this.persistenceCertainty);
            c0924AIaA0u.put(HatchMetadataKey.CACHE_RESULT, this.cacheResult);
            String str = this.failureReason;
            if (str != null) {
                c0924AIaA0u.put(HatchMetadataKey.FAILURE_REASON, str);
            }
            return AIW.A0K(c0924AIaA0u);
        }

        public String toString() {
            return super.toString();
        }

        public /* synthetic */ SelectionResult(boolean z, String str, String str2, String str3, String str4, String str5, String str6, VoiceSelectionIdentity voiceSelectionIdentity, int i, C06H c06h) {
            this(z, str, (i & 4) != 0 ? "none" : str2, (i & 8) != 0 ? PairsRepositoryKt.GOAL_EDIT_APPLIED : str3, (i & 16) != 0 ? "unconfirmed" : str4, (i & 32) != 0 ? "skipped" : str5, (i & 64) != 0 ? null : str6, (i & 128) != 0 ? null : voiceSelectionIdentity);
        }
    }

    public final class SettingsSnapshot extends C06G {
        public static final int $stable = 8;
        public final List<SavedVoiceOption> savedVoices;
        public final VoiceSelectionIdentity selectedVoice;

        public SettingsSnapshot(List<SavedVoiceOption> list, VoiceSelectionIdentity voiceSelectionIdentity) {
            C7384Etj.A0Y(list, 0);
            this.savedVoices = list;
            this.selectedVoice = voiceSelectionIdentity;
        }

        public final SettingsSnapshot copy(List<SavedVoiceOption> list, VoiceSelectionIdentity voiceSelectionIdentity) {
            C7384Etj.A0Y(list, 0);
            return new SettingsSnapshot(list, voiceSelectionIdentity);
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof SettingsSnapshot) {
                    SettingsSnapshot settingsSnapshot = (SettingsSnapshot) obj;
                    if (!C7384Etj.areEqual(this.savedVoices, settingsSnapshot.savedVoices) || !C7384Etj.areEqual(this.selectedVoice, settingsSnapshot.selectedVoice)) {
                    }
                }
                return false;
            }
            return true;
        }

        public static /* synthetic */ SettingsSnapshot copy$default(SettingsSnapshot settingsSnapshot, List list, VoiceSelectionIdentity voiceSelectionIdentity, int i, Object obj) {
            if ((i & 1) != 0) {
                list = settingsSnapshot.savedVoices;
            }
            if ((i & 2) != 0) {
                voiceSelectionIdentity = settingsSnapshot.selectedVoice;
            }
            C7384Etj.A0Y(list, 0);
            return new SettingsSnapshot(list, voiceSelectionIdentity);
        }

        public final List<SavedVoiceOption> component1() {
            return this.savedVoices;
        }

        public final VoiceSelectionIdentity component2() {
            return this.selectedVoice;
        }

        public final List<SavedVoiceOption> getSavedVoices() {
            return this.savedVoices;
        }

        public final VoiceSelectionIdentity getSelectedVoice() {
            return this.selectedVoice;
        }

        public int hashCode() {
            return AnonymousClass005.A0E(this.savedVoices) + AnonymousClass006.A0D(this.selectedVoice);
        }

        public String toString() {
            return super.toString();
        }
    }

    @DebugMetadata(c = "com.facebook.aura.partners.voice.viewmodel.VoiceSelectionRepository$deleteSavedVoice$2", f = "VoiceSelectionRepository.kt", l = {438, 442, 447, 457}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.partners.voice.viewmodel.VoiceSelectionRepository$deleteSavedVoice$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC07127nr implements G0V<String, HtJ<? super Boolean>, Object> {
        public final /* synthetic */ VoiceOption $fallback;
        public final /* synthetic */ String $savedVoiceId;
        public final /* synthetic */ AbstractC3358CGz $userSession;
        public /* synthetic */ Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public Object L$4;
        public Object L$5;
        public boolean Z$0;
        public int label;

        /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r1v2 com.facebook.aura.partners.voice.api.VoiceSelectionIdentity, still in use, count: 2, list:
              (r1v2 com.facebook.aura.partners.voice.api.VoiceSelectionIdentity) from 0x005d: IF  (r1v2 com.facebook.aura.partners.voice.api.VoiceSelectionIdentity) == (null com.facebook.aura.partners.voice.api.VoiceSelectionIdentity)  -> B:47:0x00c2 A[HIDDEN] (LINE:93)
              (r1v2 com.facebook.aura.partners.voice.api.VoiceSelectionIdentity) from 0x0044: PHI (r1v3 com.facebook.aura.partners.voice.api.VoiceSelectionIdentity) = (r1v2 com.facebook.aura.partners.voice.api.VoiceSelectionIdentity) binds: [B:25:0x005d] A[DONT_GENERATE, DONT_INLINE]
            	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
            	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
            	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:125)
            	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:62)
            	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:45)
            	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:67)
            	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
            	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
            	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
            	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1093)
            	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
            	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
            	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
            	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:19)
            	at jadx.core.dex.visitors.regions.TernaryMod.process(TernaryMod.java:35)
            	at jadx.core.dex.visitors.regions.IfRegionVisitor.process(IfRegionVisitor.java:34)
            	at jadx.core.dex.visitors.regions.IfRegionVisitor.visit(IfRegionVisitor.java:30)
            */
        /* JADX WARN: Removed duplicated region for block: B:33:0x0075  */
        /* JADX WARN: Removed duplicated region for block: B:36:0x007f  */
        /* JADX WARN: Removed duplicated region for block: B:41:0x00a8  */
        /* JADX WARN: Removed duplicated region for block: B:45:0x00b8  */
        /* JADX WARN: Removed duplicated region for block: B:49:0x00c7  */
        @Override // X.AbstractC8884Fsp
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r15) {
            /*
                Method dump skipped, instructions count: 231
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.partners.voice.viewmodel.VoiceSelectionRepository.AnonymousClass2.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(AbstractC3358CGz abstractC3358CGz, String str, VoiceOption voiceOption, HtJ<? super AnonymousClass2> htJ) {
            super(2, htJ);
            this.$userSession = abstractC3358CGz;
            this.$savedVoiceId = str;
            this.$fallback = voiceOption;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            AnonymousClass2 anonymousClass2 = VoiceSelectionRepository.this.new AnonymousClass2(this.$userSession, this.$savedVoiceId, this.$fallback, htJ);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        @Override // X.G0V
        public final Object invoke(String str, HtJ<? super Boolean> htJ) {
            return ((AnonymousClass2) create(str, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.partners.voice.viewmodel.VoiceSelectionRepository", f = "VoiceSelectionRepository.kt", l = {400, 403}, m = "loadSettingsSnapshot", v = 2)
    /* renamed from: com.facebook.aura.partners.voice.viewmodel.VoiceSelectionRepository$loadSettingsSnapshot$1, reason: invalid class name */
    public final class AnonymousClass1 extends HzP {
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public int label;
        public /* synthetic */ Object result;

        public AnonymousClass1(HtJ<? super AnonymousClass1> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return VoiceSelectionRepository.this.loadSettingsSnapshot(null, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.partners.voice.viewmodel.VoiceSelectionRepository$mutate$2", f = "VoiceSelectionRepository.kt", l = {525}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.partners.voice.viewmodel.VoiceSelectionRepository$mutate$2, reason: invalid class name and case insensitive filesystem */
    public final class C133592 extends AbstractC07127nr implements G0U<HtJ<? super Boolean>, Object> {
        public final /* synthetic */ G0V<String, HtJ<? super Boolean>, Object> $action;
        public final /* synthetic */ MutationFailure $failure;
        public final /* synthetic */ String $savedVoiceId;
        public final /* synthetic */ AbstractC3358CGz $userSession;
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C133592(AbstractC3358CGz abstractC3358CGz, G0V<? super String, ? super HtJ<? super Boolean>, ? extends Object> g0v, MutationFailure mutationFailure, String str, HtJ<? super C133592> htJ) {
            super(1, htJ);
            this.$userSession = abstractC3358CGz;
            this.$action = g0v;
            this.$failure = mutationFailure;
            this.$savedVoiceId = str;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(HtJ<?> htJ) {
            return VoiceSelectionRepository.this.new C133592(this.$userSession, this.$action, this.$failure, this.$savedVoiceId, htJ);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:32:0x0098 A[PHI: r0 r1 r6
  0x0098: PHI (r0v13 boolean) = (r0v22 boolean), (r0v23 boolean), (r0v24 boolean) binds: [B:31:0x0097, B:27:0x0089, B:29:0x0093] A[DONT_GENERATE, DONT_INLINE]
  0x0098: PHI (r1v13 X.F1F) = (r1v6 X.F1F), (r1v15 X.F1F), (r1v15 X.F1F) binds: [B:31:0x0097, B:27:0x0089, B:29:0x0093] A[DONT_GENERATE, DONT_INLINE]
  0x0098: PHI (r6v4 X.F1F) = (r6v2 X.F1F), (r6v7 X.F1F), (r6v7 X.F1F) binds: [B:31:0x0097, B:27:0x0089, B:29:0x0093] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:45:0x00ce  */
        /* JADX WARN: Removed duplicated region for block: B:87:0x0154  */
        /* JADX WARN: Type inference failed for: r0v0, types: [int] */
        /* JADX WARN: Type inference failed for: r0v10 */
        /* JADX WARN: Type inference failed for: r0v12 */
        /* JADX WARN: Type inference failed for: r0v14, types: [X.F1F] */
        /* JADX WARN: Type inference failed for: r0v17, types: [X.F1F] */
        /* JADX WARN: Type inference failed for: r0v20 */
        /* JADX WARN: Type inference failed for: r0v21 */
        /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object] */
        @Override // X.AbstractC8884Fsp
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r16) throws java.lang.Throwable {
            /*
                Method dump skipped, instructions count: 343
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.partners.voice.viewmodel.VoiceSelectionRepository.C133592.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // X.G0U
        public final Object invoke(HtJ<? super Boolean> htJ) {
            return ((C133592) create(htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.partners.voice.viewmodel.VoiceSelectionRepository$persistSelection$1", f = "VoiceSelectionRepository.kt", l = {128}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.partners.voice.viewmodel.VoiceSelectionRepository$persistSelection$1, reason: invalid class name and case insensitive filesystem */
    public final class C133601 extends AbstractC07127nr implements G0W<String, Integer, HtJ<? super SelectionResult>, Object> {
        public final /* synthetic */ AbstractC3358CGz $userSession;
        public final /* synthetic */ VoiceOption $voice;
        public /* synthetic */ Object L$0;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C133601(AbstractC3358CGz abstractC3358CGz, VoiceOption voiceOption, HtJ<? super C133601> htJ) {
            super(3, htJ);
            this.$userSession = abstractC3358CGz;
            this.$voice = voiceOption;
        }

        public final Object invoke(String str, int i, HtJ<? super SelectionResult> htJ) {
            C133601 c133601 = VoiceSelectionRepository.this.new C133601(this.$userSession, this.$voice, htJ);
            c133601.L$0 = str;
            return c133601.invokeSuspend(Unit.INSTANCE);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            String str = (String) this.L$0;
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                VoiceSelectionRepository voiceSelectionRepository = VoiceSelectionRepository.this;
                AbstractC3358CGz abstractC3358CGz = this.$userSession;
                VoiceOption voiceOption = this.$voice;
                this.L$0 = null;
                this.label = 1;
                obj = voiceSelectionRepository.persistSelectionResult(abstractC3358CGz, str, voiceOption, this);
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

        @Override // X.G0W
        public /* bridge */ /* synthetic */ Object invoke(String str, Integer num, HtJ<? super SelectionResult> htJ) {
            return invoke(str, AnonymousClass001.A0F(num), htJ);
        }
    }

    /* renamed from: com.facebook.aura.partners.voice.viewmodel.VoiceSelectionRepository$persistSelection$2, reason: invalid class name and case insensitive filesystem */
    public final class C133612 extends AbstractC7559F3s implements G0U<SelectionResult, Unit> {
        public final /* synthetic */ G0U<Boolean, Unit> $onResult;

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(SelectionResult selectionResult) {
            C7384Etj.A0Y(selectionResult, 0);
            AnonymousClass001.A1K(selectionResult.success, this.$onResult);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C133612(G0U<? super Boolean, Unit> g0u) {
            super(1);
            this.$onResult = g0u;
        }

        @Override // X.G0U
        public /* bridge */ /* synthetic */ Unit invoke(SelectionResult selectionResult) {
            invoke2(selectionResult);
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.facebook.aura.partners.voice.viewmodel.VoiceSelectionRepository", f = "VoiceSelectionRepository.kt", l = {264, 266}, m = "persistSelectionResult", v = 2)
    /* renamed from: com.facebook.aura.partners.voice.viewmodel.VoiceSelectionRepository$persistSelectionResult$1, reason: invalid class name and case insensitive filesystem */
    public final class C133621 extends HzP {
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public Object L$4;
        public Object L$5;
        public int label;
        public /* synthetic */ Object result;

        public C133621(HtJ<? super C133621> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return VoiceSelectionRepository.this.persistSelectionResult(null, null, null, this);
        }
    }

    /* renamed from: com.facebook.aura.partners.voice.viewmodel.VoiceSelectionRepository$persistSelectionWithResult$1, reason: invalid class name and case insensitive filesystem */
    public final class C133631 extends AbstractC7559F3s implements G0U<Throwable, Unit> {
        public final /* synthetic */ C10543Hqv<SelectionResult> $outcome;
        public final /* synthetic */ VoiceTelemetry.SelectionCommit $telemetryOperation;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C133631(VoiceTelemetry.SelectionCommit selectionCommit, C10543Hqv<SelectionResult> c10543Hqv) {
            super(1);
            this.$telemetryOperation = selectionCommit;
            this.$outcome = c10543Hqv;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable th) {
            if (th != null && !(th instanceof CancellationException)) {
                CFK.A08(VoiceSelectionRepositoryKt.TAG, "voice selection completion failed", th);
            }
            VoiceTelemetry.SelectionCommit selectionCommit = this.$telemetryOperation;
            if (selectionCommit != null) {
                selectionCommit.finish(this.$outcome.element.telemetryMetadata());
            }
        }

        @Override // X.G0U
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.facebook.aura.partners.voice.viewmodel.VoiceSelectionRepository$persistSettingsSelection$1", f = "VoiceSelectionRepository.kt", l = {149}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.partners.voice.viewmodel.VoiceSelectionRepository$persistSettingsSelection$1, reason: invalid class name and case insensitive filesystem */
    public final class C133641 extends AbstractC07127nr implements G0W<String, Integer, HtJ<? super SelectionResult>, Object> {
        public final /* synthetic */ String $profileId;
        public final /* synthetic */ String $savedVoiceId;
        public final /* synthetic */ AbstractC3358CGz $userSession;
        public final /* synthetic */ VoiceOption $voice;
        public /* synthetic */ int I$0;
        public /* synthetic */ Object L$0;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C133641(AbstractC3358CGz abstractC3358CGz, VoiceOption voiceOption, String str, String str2, HtJ<? super C133641> htJ) {
            super(3, htJ);
            this.$userSession = abstractC3358CGz;
            this.$voice = voiceOption;
            this.$savedVoiceId = str;
            this.$profileId = str2;
        }

        public final Object invoke(String str, int i, HtJ<? super SelectionResult> htJ) {
            C133641 c133641 = VoiceSelectionRepository.this.new C133641(this.$userSession, this.$voice, this.$savedVoiceId, this.$profileId, htJ);
            c133641.L$0 = str;
            c133641.I$0 = i;
            return c133641.invokeSuspend(Unit.INSTANCE);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            String str = (String) this.L$0;
            int i = this.I$0;
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i2 = this.label;
            if (i2 == 0) {
                Hwg.A00(obj);
                VoiceSelectionRepository voiceSelectionRepository = VoiceSelectionRepository.this;
                AbstractC3358CGz abstractC3358CGz = this.$userSession;
                VoiceOption voiceOption = this.$voice;
                String str2 = this.$savedVoiceId;
                String str3 = this.$profileId;
                this.L$0 = null;
                this.I$0 = i;
                this.label = 1;
                obj = voiceSelectionRepository.saveSettingsSelectionResult(abstractC3358CGz, str, voiceOption, i, str2, str3, this);
                if (obj == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i2 != 1) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
            }
            return obj;
        }

        @Override // X.G0W
        public /* bridge */ /* synthetic */ Object invoke(String str, Integer num, HtJ<? super SelectionResult> htJ) {
            return invoke(str, AnonymousClass001.A0F(num), htJ);
        }
    }

    /* renamed from: com.facebook.aura.partners.voice.viewmodel.VoiceSelectionRepository$persistSettingsSelection$2, reason: invalid class name and case insensitive filesystem */
    public final class C133652 extends AbstractC7559F3s implements G0U<SelectionResult, Unit> {
        public final /* synthetic */ G0U<VoiceSelectionIdentity, Unit> $onResult;

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(SelectionResult selectionResult) {
            C7384Etj.A0Y(selectionResult, 0);
            G0U<VoiceSelectionIdentity, Unit> g0u = this.$onResult;
            VoiceSelectionIdentity voiceSelectionIdentity = selectionResult.selectedVoice;
            if (!selectionResult.success || !PairsRepositoryKt.GOAL_EDIT_APPLIED.equals(selectionResult.disposition)) {
                voiceSelectionIdentity = null;
            }
            g0u.invoke(voiceSelectionIdentity);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C133652(G0U<? super VoiceSelectionIdentity, Unit> g0u) {
            super(1);
            this.$onResult = g0u;
        }

        @Override // X.G0U
        public /* bridge */ /* synthetic */ Unit invoke(SelectionResult selectionResult) {
            invoke2(selectionResult);
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.facebook.aura.partners.voice.viewmodel.VoiceSelectionRepository", f = "VoiceSelectionRepository.kt", l = {420}, m = "readSettingsSelection", v = 2)
    /* renamed from: com.facebook.aura.partners.voice.viewmodel.VoiceSelectionRepository$readSettingsSelection$1, reason: invalid class name and case insensitive filesystem */
    public final class C133661 extends HzP {
        public Object L$0;
        public Object L$1;
        public int label;
        public /* synthetic */ Object result;

        public C133661(HtJ<? super C133661> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return VoiceSelectionRepository.this.readSettingsSelection(null, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.partners.voice.viewmodel.VoiceSelectionRepository$renameSavedVoice$2", f = "VoiceSelectionRepository.kt", l = {468, 472, 487, 492, 493, 496, 497, MC.c50_accounts_center_settings.__CONFIG__}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.partners.voice.viewmodel.VoiceSelectionRepository$renameSavedVoice$2, reason: invalid class name and case insensitive filesystem */
    public final class C133672 extends AbstractC07127nr implements G0V<String, HtJ<? super Boolean>, Object> {
        public final /* synthetic */ String $newName;
        public final /* synthetic */ SavedVoiceOption $savedVoice;
        public final /* synthetic */ AbstractC3358CGz $userSession;
        public int I$0;
        public /* synthetic */ Object L$0;
        public Object L$1;
        public Object L$10;
        public Object L$2;
        public Object L$3;
        public Object L$4;
        public Object L$5;
        public Object L$6;
        public Object L$7;
        public Object L$8;
        public Object L$9;
        public int label;
        public final /* synthetic */ VoiceSelectionRepository this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C133672(String str, VoiceSelectionRepository voiceSelectionRepository, AbstractC3358CGz abstractC3358CGz, SavedVoiceOption savedVoiceOption, HtJ<? super C133672> htJ) {
            super(2, htJ);
            this.$newName = str;
            this.this$0 = voiceSelectionRepository;
            this.$userSession = abstractC3358CGz;
            this.$savedVoice = savedVoiceOption;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            C133672 c133672 = new C133672(this.$newName, this.this$0, this.$userSession, this.$savedVoice, htJ);
            c133672.L$0 = obj;
            return c133672;
        }

        /* JADX WARN: Code restructure failed: missing block: B:22:0x007c, code lost:
        
            if (r8 == null) goto L91;
         */
        /* JADX WARN: Code restructure failed: missing block: B:44:0x00db, code lost:
        
            if (r1 != null) goto L45;
         */
        /* JADX WARN: Code restructure failed: missing block: B:83:0x0222, code lost:
        
            if (r7 == r5) goto L84;
         */
        /* JADX WARN: Removed duplicated region for block: B:15:0x005b  */
        /* JADX WARN: Removed duplicated region for block: B:30:0x009e  */
        /* JADX WARN: Removed duplicated region for block: B:52:0x010c  */
        /* JADX WARN: Removed duplicated region for block: B:54:0x010f  */
        /* JADX WARN: Removed duplicated region for block: B:60:0x0145  */
        /* JADX WARN: Removed duplicated region for block: B:64:0x0161  */
        /* JADX WARN: Removed duplicated region for block: B:67:0x0182  */
        /* JADX WARN: Removed duplicated region for block: B:73:0x01d4  */
        @Override // X.AbstractC8884Fsp
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r21) {
            /*
                Method dump skipped, instructions count: 594
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.partners.voice.viewmodel.VoiceSelectionRepository.C133672.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // X.G0V
        public final Object invoke(String str, HtJ<? super Boolean> htJ) {
            return ((C133672) create(str, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.partners.voice.viewmodel.VoiceSelectionRepository", f = "VoiceSelectionRepository.kt", l = {704, 373}, m = "saveSettingsSelectionResult", v = 2)
    /* renamed from: com.facebook.aura.partners.voice.viewmodel.VoiceSelectionRepository$saveSettingsSelectionResult$1, reason: invalid class name and case insensitive filesystem */
    public final class C133681 extends HzP {
        public int I$0;
        public int I$1;
        public int I$2;
        public int I$3;
        public int I$4;
        public int I$5;
        public int I$6;
        public int I$7;
        public Object L$0;
        public Object L$1;
        public Object L$10;
        public Object L$11;
        public Object L$12;
        public Object L$13;
        public Object L$14;
        public Object L$15;
        public Object L$16;
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

        public C133681(HtJ<? super C133681> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return VoiceSelectionRepository.this.saveSettingsSelectionResult(null, null, null, 0, null, null, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.partners.voice.viewmodel.VoiceSelectionRepository", f = "VoiceSelectionRepository.kt", l = {565}, m = "writeVerified", v = 2)
    /* renamed from: com.facebook.aura.partners.voice.viewmodel.VoiceSelectionRepository$writeVerified$1, reason: invalid class name and case insensitive filesystem */
    public final class C133691 extends HzP {
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public int label;
        public /* synthetic */ Object result;

        public C133691(HtJ<? super C133691> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return VoiceSelectionRepository.this.writeVerified(null, null, null, null, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.partners.voice.viewmodel.VoiceSelectionRepository", f = "VoiceSelectionRepository.kt", l = {MC.hatch_android_enable_wa_into_hatch_sso_device_id.__CONFIG__, 610}, m = "writeVerifiedResult", v = 2)
    /* renamed from: com.facebook.aura.partners.voice.viewmodel.VoiceSelectionRepository$writeVerifiedResult$1, reason: invalid class name and case insensitive filesystem */
    public final class C133701 extends HzP {
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public Object L$4;
        public int label;
        public /* synthetic */ Object result;

        public C133701(HtJ<? super C133701> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return VoiceSelectionRepository.this.writeVerifiedResult(null, null, null, null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object mutate(AbstractC3358CGz abstractC3358CGz, String str, MutationFailure mutationFailure, G0V<? super String, ? super HtJ<? super Boolean>, ? extends Object> g0v, HtJ<? super Boolean> htJ) {
        return C3cG.A0W(enqueueWrite(new C133592(abstractC3358CGz, g0v, mutationFailure, str, null)), htJ);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00b4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object persistSelectionResult(X.AbstractC3358CGz r12, java.lang.String r13, com.facebook.aura.partners.voice.api.VoiceOption r14, X.HtJ<? super com.facebook.aura.partners.voice.viewmodel.VoiceSelectionRepository.SelectionResult> r15) {
        /*
            r11 = this;
            r9 = r12
            r4 = r15
            r10 = r13
            r3 = r14
            boolean r0 = r15 instanceof com.facebook.aura.partners.voice.viewmodel.VoiceSelectionRepository.C133621
            r8 = r11
            if (r0 == 0) goto Lb4
            r13 = r4
            com.facebook.aura.partners.voice.viewmodel.VoiceSelectionRepository$persistSelectionResult$1 r13 = (com.facebook.aura.partners.voice.viewmodel.VoiceSelectionRepository.C133621) r13
            int r2 = r13.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto Lb4
            int r2 = r2 - r1
            r13.label = r2
        L17:
            java.lang.Object r7 = r13.result
            X.Hji r4 = X.EnumC10460Hji.A02
            int r0 = r13.label
            r5 = 2
            r6 = 1
            if (r0 == 0) goto L51
            if (r0 == r6) goto L88
            if (r0 != r5) goto Lbb
            java.lang.Object r1 = r13.L$5
            com.facebook.aura.partners.voice.viewmodel.VoiceSelectionRepository$SelectionResult r1 = (com.facebook.aura.partners.voice.viewmodel.VoiceSelectionRepository.SelectionResult) r1
            java.lang.Object r10 = r13.L$3
            java.lang.String r10 = (java.lang.String) r10
            java.lang.Object r0 = r13.L$0
            X.CGz r9 = X.C60O.A0D(r0, r7)
        L33:
            java.lang.String r7 = (java.lang.String) r7
            boolean r0 = r8.isCurrent(r9, r10)
            if (r0 == 0) goto L4e
            java.lang.String r5 = "applied"
        L3d:
            boolean r2 = r1.success
            java.lang.String r3 = r1.result
            java.lang.String r4 = r1.confirmation
            java.lang.String r6 = r1.persistenceCertainty
            java.lang.String r8 = r1.failureReason
            com.facebook.aura.partners.voice.api.VoiceSelectionIdentity r9 = r1.selectedVoice
            com.facebook.aura.partners.voice.viewmodel.VoiceSelectionRepository$SelectionResult r7 = r1.copy(r2, r3, r4, r5, r6, r7, r8, r9)
        L4d:
            return r7
        L4e:
            java.lang.String r5 = "stale"
            goto L3d
        L51:
            X.Hwg.A00(r7)
            if (r10 != 0) goto L6a
            r15 = 0
            java.lang.String r9 = "failure"
            java.lang.String r14 = "no_gateway"
            r8 = 0
            java.lang.String r10 = "none"
            java.lang.String r11 = "applied"
            java.lang.String r12 = "unconfirmed"
            java.lang.String r13 = "skipped"
            com.facebook.aura.partners.voice.viewmodel.VoiceSelectionRepository$SelectionResult r7 = new com.facebook.aura.partners.voice.viewmodel.VoiceSelectionRepository$SelectionResult
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15)
            return r7
        L6a:
            java.lang.String r2 = r14.id
            java.lang.String r1 = r14.name
            r0 = 0
            java.lang.String r12 = com.facebook.aura.partners.voice.viewmodel.VoiceSelectionRepositoryJsonKt.encodeSettingsVoiceSelection(r2, r1, r0, r0)
            r13.L$0 = r9
            r13.L$1 = r0
            r13.L$2 = r14
            r13.L$3 = r10
            r13.L$4 = r0
            r13.label = r6
            java.lang.String r11 = "user/voice.json"
            java.lang.Object r7 = r8.writeVerifiedResult(r9, r10, r11, r12, r13)
            if (r7 != r4) goto L96
        L87:
            return r4
        L88:
            java.lang.Object r10 = r13.L$3
            java.lang.String r10 = (java.lang.String) r10
            java.lang.Object r3 = r13.L$2
            com.facebook.aura.partners.voice.api.VoiceOption r3 = (com.facebook.aura.partners.voice.api.VoiceOption) r3
            java.lang.Object r0 = r13.L$0
            X.CGz r9 = X.C60O.A0D(r0, r7)
        L96:
            com.facebook.aura.partners.voice.viewmodel.VoiceSelectionRepository$SelectionResult r7 = (com.facebook.aura.partners.voice.viewmodel.VoiceSelectionRepository.SelectionResult) r7
            boolean r0 = r7.success
            if (r0 == 0) goto L4d
            r13.L$0 = r9
            r0 = 0
            r13.L$1 = r0
            r13.L$2 = r0
            r13.L$3 = r10
            r13.L$4 = r0
            r13.L$5 = r7
            r13.label = r5
            java.lang.Object r0 = r8.updateSelectionCaches(r9, r10, r3, r13)
            if (r0 == r4) goto L87
            r1 = r7
            r7 = r0
            goto L33
        Lb4:
            com.facebook.aura.partners.voice.viewmodel.VoiceSelectionRepository$persistSelectionResult$1 r13 = new com.facebook.aura.partners.voice.viewmodel.VoiceSelectionRepository$persistSelectionResult$1
            r13.<init>(r15)
            goto L17
        Lbb:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.partners.voice.viewmodel.VoiceSelectionRepository.persistSelectionResult(X.CGz, java.lang.String, com.facebook.aura.partners.voice.api.VoiceOption, X.HtJ):java.lang.Object");
    }

    @Override // X.InterfaceC7549F2g
    public void clearUserData() {
        this.isCleared = true;
        Hxb.A03(null, this.scope);
    }

    public final void persistSelection(AbstractC3358CGz abstractC3358CGz, VoiceOption voiceOption, G0U<? super Boolean, Unit> g0u) {
        AnonymousClass005.A10(abstractC3358CGz, voiceOption, g0u);
        persistSelectionWithResult(abstractC3358CGz, voiceOption.id, false, null, new C133601(abstractC3358CGz, voiceOption, null), new C133612(g0u));
    }

    public final void persistSettingsSelection(AbstractC3358CGz abstractC3358CGz, VoiceOption voiceOption, String str, String str2, boolean z, VoiceTelemetry.SelectionCommit selectionCommit, G0U<? super VoiceSelectionIdentity, Unit> g0u) {
        AnonymousClass003.A0u(abstractC3358CGz, voiceOption);
        C7384Etj.A0Y(g0u, 6);
        persistSelectionWithResult(abstractC3358CGz, str == null ? voiceOption.id : str, z, selectionCommit, new C133641(abstractC3358CGz, voiceOption, str, str2, null), new C133652(g0u));
    }

    public final Object renameSavedVoice(AbstractC3358CGz abstractC3358CGz, SavedVoiceOption savedVoiceOption, String str, HtJ<? super Boolean> htJ) {
        return mutate(abstractC3358CGz, savedVoiceOption.savedVoiceId, MutationFailure.RENAME, new C133672(str, this, abstractC3358CGz, savedVoiceOption, null), htJ);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String currentTarget(AbstractC3358CGz abstractC3358CGz) {
        String gatewayUrl = HatchGatewayPrefsStore.Companion.getInstance(abstractC3358CGz).getGatewayUrl();
        if (C7BY.A0j(gatewayUrl)) {
            return null;
        }
        return gatewayUrl;
    }

    private final <T> C27k<T> enqueueWrite(G0U<? super HtJ<? super T>, ? extends Object> g0u) {
        C10550Hrx c10550HrxA10;
        synchronized (this.writeQueueLock) {
            HoC hoC = this.lastWrite;
            c10550HrxA10 = AnonymousClass001.A10(new VoiceSelectionRepository$enqueueWrite$1$1(hoC, g0u, null), this.scope);
            this.lastWrite = c10550HrxA10;
        }
        return c10550HrxA10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isCurrent(AbstractC3358CGz abstractC3358CGz, String str) {
        return !this.isCleared && C7384Etj.areEqual(str, currentTarget(abstractC3358CGz));
    }

    /* JADX WARN: Type inference failed for: r11v0, types: [T, com.facebook.aura.partners.voice.viewmodel.VoiceSelectionRepository$SelectionResult] */
    private final void persistSelectionWithResult(AbstractC3358CGz abstractC3358CGz, String str, boolean z, VoiceTelemetry.SelectionCommit selectionCommit, G0W<? super String, ? super Integer, ? super HtJ<? super SelectionResult>, ? extends Object> g0w, G0U<? super SelectionResult, Unit> g0u) {
        int iIncrementAndGet = this.selectionGeneration.incrementAndGet();
        C10543Hqv c10543HqvA0z = C3cG.A0z();
        C10543Hqv c10543HqvA0z2 = C3cG.A0z();
        c10543HqvA0z2.element = new SelectionResult(false, "cancelled", "none", "cancelled", "unconfirmed", "skipped", "not_started", null);
        enqueueWrite(new VoiceSelectionRepository$persistSelectionWithResult$job$1(iIncrementAndGet, this, c10543HqvA0z2, c10543HqvA0z, abstractC3358CGz, g0w, z, str, g0u, null)).AO5(new C133631(selectionCommit, c10543HqvA0z2));
    }

    public static /* synthetic */ void persistSelectionWithResult$default(VoiceSelectionRepository voiceSelectionRepository, AbstractC3358CGz abstractC3358CGz, String str, boolean z, VoiceTelemetry.SelectionCommit selectionCommit, G0W g0w, G0U g0u, int i, Object obj) {
        boolean zA1Q = C60Q.A1Q(i & 4, z);
        if ((i & 8) != 0) {
            selectionCommit = null;
        }
        voiceSelectionRepository.persistSelectionWithResult(abstractC3358CGz, str, zA1Q, selectionCommit, g0w, g0u);
    }

    public static /* synthetic */ void persistSettingsSelection$default(VoiceSelectionRepository voiceSelectionRepository, AbstractC3358CGz abstractC3358CGz, VoiceOption voiceOption, String str, String str2, boolean z, VoiceTelemetry.SelectionCommit selectionCommit, G0U g0u, int i, Object obj) {
        if ((i & 4) != 0) {
            str = null;
        }
        if ((i & 8) != 0) {
            str2 = null;
        }
        if ((i & 16) != 0) {
            z = true;
        }
        if ((i & 32) != 0) {
            selectionCommit = null;
        }
        voiceSelectionRepository.persistSettingsSelection(abstractC3358CGz, voiceOption, str, str2, z, selectionCommit, g0u);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object readFile(AbstractC3358CGz abstractC3358CGz, String str, String str2, HtJ<? super String> htJ) {
        return HatchFileOperations.INSTANCE.readFile(str2, abstractC3358CGz, 4194304L, str, htJ);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:108:0x02c4  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00b8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object saveSettingsSelectionResult(X.AbstractC3358CGz r33, java.lang.String r34, com.facebook.aura.partners.voice.api.VoiceOption r35, int r36, java.lang.String r37, java.lang.String r38, X.HtJ<? super com.facebook.aura.partners.voice.viewmodel.VoiceSelectionRepository.SelectionResult> r39) {
        /*
            Method dump skipped, instructions count: 749
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.partners.voice.viewmodel.VoiceSelectionRepository.saveSettingsSelectionResult(X.CGz, java.lang.String, com.facebook.aura.partners.voice.api.VoiceOption, int, java.lang.String, java.lang.String, X.HtJ):java.lang.Object");
    }

    public static /* synthetic */ Object saveSettingsSelectionResult$default(VoiceSelectionRepository voiceSelectionRepository, AbstractC3358CGz abstractC3358CGz, String str, VoiceOption voiceOption, int i, String str2, String str3, HtJ htJ, int i2, Object obj) {
        if ((i2 & 16) != 0) {
            str2 = null;
        }
        if ((i2 & 32) != 0) {
            str3 = null;
        }
        return voiceSelectionRepository.saveSettingsSelectionResult(abstractC3358CGz, str, voiceOption, i, str2, str3, htJ);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0043  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object writeVerified(X.AbstractC3358CGz r10, java.lang.String r11, java.lang.String r12, java.lang.String r13, X.HtJ<? super java.lang.Boolean> r14) {
        /*
            r9 = this;
            boolean r0 = r14 instanceof com.facebook.aura.partners.voice.viewmodel.VoiceSelectionRepository.C133691
            r4 = r9
            if (r0 == 0) goto L43
            r9 = r14
            com.facebook.aura.partners.voice.viewmodel.VoiceSelectionRepository$writeVerified$1 r9 = (com.facebook.aura.partners.voice.viewmodel.VoiceSelectionRepository.C133691) r9
            int r2 = r9.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L43
            int r2 = r2 - r1
            r9.label = r2
        L13:
            java.lang.Object r3 = r9.result
            X.Hji r2 = X.EnumC10460Hji.A02
            int r0 = r9.label
            r1 = 1
            if (r0 == 0) goto L2a
            if (r0 != r1) goto L49
            X.Hwg.A00(r3)
        L21:
            com.facebook.aura.partners.voice.viewmodel.VoiceSelectionRepository$SelectionResult r3 = (com.facebook.aura.partners.voice.viewmodel.VoiceSelectionRepository.SelectionResult) r3
            boolean r0 = r3.success
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
        L2a:
            X.Hwg.A00(r3)
            r0 = 0
            r9.L$0 = r0
            r9.L$1 = r0
            r9.L$2 = r0
            r9.L$3 = r0
            r9.label = r1
            r5 = r10
            r6 = r11
            r7 = r12
            r8 = r13
            java.lang.Object r3 = r4.writeVerifiedResult(r5, r6, r7, r8, r9)
            if (r3 != r2) goto L21
            return r2
        L43:
            com.facebook.aura.partners.voice.viewmodel.VoiceSelectionRepository$writeVerified$1 r9 = new com.facebook.aura.partners.voice.viewmodel.VoiceSelectionRepository$writeVerified$1
            r9.<init>(r14)
            goto L13
        L49:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.partners.voice.viewmodel.VoiceSelectionRepository.writeVerified(X.CGz, java.lang.String, java.lang.String, java.lang.String, X.HtJ):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x011b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object writeVerifiedResult(X.AbstractC3358CGz r25, java.lang.String r26, java.lang.String r27, java.lang.String r28, X.HtJ<? super com.facebook.aura.partners.voice.viewmodel.VoiceSelectionRepository.SelectionResult> r29) {
        /*
            Method dump skipped, instructions count: 295
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.partners.voice.viewmodel.VoiceSelectionRepository.writeVerifiedResult(X.CGz, java.lang.String, java.lang.String, java.lang.String, X.HtJ):java.lang.Object");
    }

    public final void consumeMutationFailure() {
        OperationState value;
        OperationState operationState;
        BLG<OperationState> blg = this._operations;
        do {
            value = blg.getValue();
            operationState = value;
        } while (!blg.A6e(value, new OperationState(operationState.renamingSavedVoiceId, operationState.deletingSavedVoiceId, operationState.savingSelectionRowId, operationState.revision, operationState.selectionFailureRevision, null)));
    }

    public final void consumeSelectionFailure() {
        OperationState value;
        OperationState operationState;
        BLG<OperationState> blg = this._operations;
        do {
            value = blg.getValue();
            operationState = value;
            if (operationState.failure == MutationFailure.SELECT) {
                operationState = new OperationState(operationState.renamingSavedVoiceId, operationState.deletingSavedVoiceId, operationState.savingSelectionRowId, operationState.revision, operationState.selectionFailureRevision, null);
            }
        } while (!blg.A6e(value, operationState));
    }

    public final Object deleteSavedVoice(AbstractC3358CGz abstractC3358CGz, String str, VoiceOption voiceOption, HtJ<? super Boolean> htJ) {
        return mutate(abstractC3358CGz, str, MutationFailure.DELETE, new AnonymousClass2(abstractC3358CGz, str, voiceOption, null), htJ);
    }

    public final C1BN<OperationState> getOperations() {
        return this.operations;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x008c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x008d A[Catch: Exception -> 0x00ab, CancellationException -> 0x00b4, TryCatch #2 {CancellationException -> 0x00b4, Exception -> 0x00ab, blocks: (B:36:0x0085, B:37:0x0088, B:40:0x008d, B:42:0x0093, B:43:0x0095, B:50:0x00a4, B:46:0x009c, B:23:0x005b, B:24:0x005e, B:27:0x0063, B:33:0x0072, B:30:0x006b, B:17:0x0045, B:20:0x004c), top: B:58:0x001b }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object loadSettingsSnapshot(X.AbstractC3358CGz r9, X.HtJ<? super com.facebook.aura.partners.voice.viewmodel.VoiceSelectionRepository.SettingsSnapshot> r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof com.facebook.aura.partners.voice.viewmodel.VoiceSelectionRepository.AnonymousClass1
            if (r0 == 0) goto L2e
            r7 = r10
            com.facebook.aura.partners.voice.viewmodel.VoiceSelectionRepository$loadSettingsSnapshot$1 r7 = (com.facebook.aura.partners.voice.viewmodel.VoiceSelectionRepository.AnonymousClass1) r7
            int r2 = r7.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L2e
            int r2 = r2 - r1
            r7.label = r2
        L12:
            java.lang.Object r1 = r7.result
            X.Hji r6 = X.EnumC10460Hji.A02
            int r0 = r7.label
            r5 = 2
            r3 = 1
            r4 = 0
            if (r0 == 0) goto L42
            if (r0 == r3) goto L39
            if (r0 != r5) goto L34
            java.lang.Object r3 = r7.L$3
            com.facebook.aura.partners.voice.api.VoiceSelectionIdentity r3 = (com.facebook.aura.partners.voice.api.VoiceSelectionIdentity) r3
            java.lang.Object r2 = r7.L$1
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r9 = r7.L$0
            X.CGz r9 = (X.AbstractC3358CGz) r9
            goto L85
        L2e:
            com.facebook.aura.partners.voice.viewmodel.VoiceSelectionRepository$loadSettingsSnapshot$1 r7 = new com.facebook.aura.partners.voice.viewmodel.VoiceSelectionRepository$loadSettingsSnapshot$1
            r7.<init>(r10)
            goto L12
        L34:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        L39:
            java.lang.Object r2 = r7.L$1
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r9 = r7.L$0
            X.CGz r9 = (X.AbstractC3358CGz) r9
            goto L5b
        L42:
            X.Hwg.A00(r1)
            java.lang.String r2 = r8.currentTarget(r9)     // Catch: java.lang.Exception -> Lab java.util.concurrent.CancellationException -> Lb4
            if (r2 != 0) goto L4c
            return r4
        L4c:
            java.lang.String r0 = "user/voice.json"
            r7.L$0 = r9     // Catch: java.lang.Exception -> Lab java.util.concurrent.CancellationException -> Lb4
            r7.L$1 = r2     // Catch: java.lang.Exception -> Lab java.util.concurrent.CancellationException -> Lb4
            r7.label = r3     // Catch: java.lang.Exception -> Lab java.util.concurrent.CancellationException -> Lb4
            java.lang.Object r1 = r8.readFile(r9, r2, r0, r7)     // Catch: java.lang.Exception -> Lab java.util.concurrent.CancellationException -> Lb4
            if (r1 != r6) goto L5e
            return r6
        L5b:
            X.Hwg.A00(r1)     // Catch: java.lang.Exception -> Lab java.util.concurrent.CancellationException -> Lb4
        L5e:
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Exception -> Lab java.util.concurrent.CancellationException -> Lb4
            if (r1 != 0) goto L63
            return r4
        L63:
            int r0 = r1.length()     // Catch: java.lang.Exception -> Lab java.util.concurrent.CancellationException -> Lb4
            if (r0 != 0) goto L6b
            r3 = r4
            goto L72
        L6b:
            com.facebook.aura.partners.voice.api.VoiceSelectionIdentity r3 = com.facebook.aura.partners.voice.viewmodel.VoiceSelectionRepositoryJsonKt.parseSettingsVoiceSelection(r1)     // Catch: java.lang.Exception -> Lab java.util.concurrent.CancellationException -> Lb4
            if (r3 != 0) goto L72
            return r4
        L72:
            java.lang.String r0 = "user/voices.json"
            r7.L$0 = r9     // Catch: java.lang.Exception -> Lab java.util.concurrent.CancellationException -> Lb4
            r7.L$1 = r2     // Catch: java.lang.Exception -> Lab java.util.concurrent.CancellationException -> Lb4
            r7.L$2 = r4     // Catch: java.lang.Exception -> Lab java.util.concurrent.CancellationException -> Lb4
            r7.L$3 = r3     // Catch: java.lang.Exception -> Lab java.util.concurrent.CancellationException -> Lb4
            r7.label = r5     // Catch: java.lang.Exception -> Lab java.util.concurrent.CancellationException -> Lb4
            java.lang.Object r1 = r8.readFile(r9, r2, r0, r7)     // Catch: java.lang.Exception -> Lab java.util.concurrent.CancellationException -> Lb4
            if (r1 != r6) goto L88
            return r6
        L85:
            X.Hwg.A00(r1)     // Catch: java.lang.Exception -> Lab java.util.concurrent.CancellationException -> Lb4
        L88:
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Exception -> Lab java.util.concurrent.CancellationException -> Lb4
            if (r1 != 0) goto L8d
            return r4
        L8d:
            int r0 = r1.length()     // Catch: java.lang.Exception -> Lab java.util.concurrent.CancellationException -> Lb4
            if (r0 != 0) goto L9c
            X.AGi r1 = X.C0881AGi.A00     // Catch: java.lang.Exception -> Lab java.util.concurrent.CancellationException -> Lb4
        L95:
            boolean r0 = r8.isCurrent(r9, r2)     // Catch: java.lang.Exception -> Lab java.util.concurrent.CancellationException -> Lb4
            if (r0 != 0) goto La4
            goto La3
        L9c:
            java.util.List r1 = com.facebook.aura.partners.voice.viewmodel.VoiceSelectionRepositoryJsonKt.parseSavedVoiceLibrary(r1, r3)     // Catch: java.lang.Exception -> Lab java.util.concurrent.CancellationException -> Lb4
            if (r1 != 0) goto L95
            goto Laa
        La3:
            return r4
        La4:
            com.facebook.aura.partners.voice.viewmodel.VoiceSelectionRepository$SettingsSnapshot r6 = new com.facebook.aura.partners.voice.viewmodel.VoiceSelectionRepository$SettingsSnapshot     // Catch: java.lang.Exception -> Lab java.util.concurrent.CancellationException -> Lb4
            r6.<init>(r1, r3)     // Catch: java.lang.Exception -> Lab java.util.concurrent.CancellationException -> Lb4
            return r6
        Laa:
            return r4
        Lab:
            r2 = move-exception
            java.lang.String r1 = "voice settings snapshot read failed"
            java.lang.String r0 = "VoiceSelectionRepository"
            X.CFK.A0A(r0, r1, r2)
            return r4
        Lb4:
            r0 = move-exception
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.partners.voice.viewmodel.VoiceSelectionRepository.loadSettingsSnapshot(X.CGz, X.HtJ):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object readSettingsSelection(X.AbstractC3358CGz r8, X.HtJ<? super com.facebook.aura.partners.voice.api.VoiceSelectionIdentity> r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof com.facebook.aura.partners.voice.viewmodel.VoiceSelectionRepository.C133661
            if (r0 == 0) goto L27
            r6 = r9
            com.facebook.aura.partners.voice.viewmodel.VoiceSelectionRepository$readSettingsSelection$1 r6 = (com.facebook.aura.partners.voice.viewmodel.VoiceSelectionRepository.C133661) r6
            int r2 = r6.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L27
            int r2 = r2 - r1
            r6.label = r2
        L12:
            java.lang.Object r5 = r6.result
            X.Hji r4 = X.EnumC10460Hji.A02
            int r0 = r6.label
            r2 = 1
            r3 = 0
            if (r0 == 0) goto L32
            if (r0 != r2) goto L2d
            java.lang.Object r1 = r6.L$1
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r8 = r6.L$0
            X.CGz r8 = (X.AbstractC3358CGz) r8
            goto L4a
        L27:
            com.facebook.aura.partners.voice.viewmodel.VoiceSelectionRepository$readSettingsSelection$1 r6 = new com.facebook.aura.partners.voice.viewmodel.VoiceSelectionRepository$readSettingsSelection$1
            r6.<init>(r9)
            goto L12
        L2d:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        L32:
            X.Hwg.A00(r5)
            java.lang.String r1 = r7.currentTarget(r8)     // Catch: java.lang.Exception -> L5c java.util.concurrent.CancellationException -> L65
            if (r1 == 0) goto L5b
            java.lang.String r0 = "user/voice.json"
            r6.L$0 = r8     // Catch: java.lang.Exception -> L5c java.util.concurrent.CancellationException -> L65
            r6.L$1 = r1     // Catch: java.lang.Exception -> L5c java.util.concurrent.CancellationException -> L65
            r6.label = r2     // Catch: java.lang.Exception -> L5c java.util.concurrent.CancellationException -> L65
            java.lang.Object r5 = r7.readFile(r8, r1, r0, r6)     // Catch: java.lang.Exception -> L5c java.util.concurrent.CancellationException -> L65
            if (r5 != r4) goto L4d
            return r4
        L4a:
            X.Hwg.A00(r5)     // Catch: java.lang.Exception -> L5c java.util.concurrent.CancellationException -> L65
        L4d:
            java.lang.String r5 = (java.lang.String) r5     // Catch: java.lang.Exception -> L5c java.util.concurrent.CancellationException -> L65
            if (r5 == 0) goto L5b
            boolean r0 = r7.isCurrent(r8, r1)     // Catch: java.lang.Exception -> L5c java.util.concurrent.CancellationException -> L65
            if (r0 == 0) goto L5b
            com.facebook.aura.partners.voice.api.VoiceSelectionIdentity r3 = com.facebook.aura.partners.voice.viewmodel.VoiceSelectionRepositoryJsonKt.parseSettingsVoiceSelection(r5)     // Catch: java.lang.Exception -> L5c java.util.concurrent.CancellationException -> L65
        L5b:
            return r3
        L5c:
            r2 = move-exception
            java.lang.String r1 = "voice selection read failed"
            java.lang.String r0 = "VoiceSelectionRepository"
            X.CFK.A0A(r0, r1, r2)
            return r3
        L65:
            r0 = move-exception
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.partners.voice.viewmodel.VoiceSelectionRepository.readSettingsSelection(X.CGz, X.HtJ):java.lang.Object");
    }

    public final class Companion {
        public final VoiceSelectionRepository getInstance(AbstractC3358CGz abstractC3358CGz) {
            C7384Etj.A0Y(abstractC3358CGz, 0);
            return (VoiceSelectionRepository) abstractC3358CGz.A03(VoiceSelectionRepository.class, VoiceSelectionRepository$Companion$getInstance$1.INSTANCE);
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object updateSelectionCaches(AbstractC3358CGz abstractC3358CGz, String str, VoiceOption voiceOption, HtJ<? super String> htJ) {
        if (!isCurrent(abstractC3358CGz, str)) {
            return "skipped";
        }
        try {
            VoicePrefs.INSTANCE.setSelectedVoice(abstractC3358CGz, voiceOption.id, voiceOption.name, voiceOption.description);
            if (!isCurrent(abstractC3358CGz, str)) {
                return C60N.A00(27);
            }
            VoiceCatalogRepository.Companion.updateCurrentVoice(abstractC3358CGz, voiceOption.id);
            return "updated";
        } catch (CancellationException e) {
            throw e;
        } catch (Exception e2) {
            CFK.A08(VoiceSelectionRepositoryKt.TAG, "voice selection cache update failed", e2);
            return "failed";
        }
    }

    public /* synthetic */ VoiceSelectionRepository(C06H c06h) {
        this();
    }

    public VoiceSelectionRepository() {
        this.scope = C78W.A03();
        this.writeQueueLock = C3cG.A0T();
        this.selectionGeneration = new AtomicInteger(0);
        C9286GCn c9286GCnA14 = C3cG.A14(new OperationState(null, null, null, 0, 0, null));
        this._operations = c9286GCnA14;
        this.operations = C3cG.A11(c9286GCnA14);
    }
}
