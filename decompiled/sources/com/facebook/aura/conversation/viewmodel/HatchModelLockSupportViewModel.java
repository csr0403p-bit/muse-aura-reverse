package com.facebook.aura.conversation.viewmodel;

import X.AEs;
import X.AEu;
import X.AbstractC07127nr;
import X.AbstractC3358CGz;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.BLG;
import X.C06G;
import X.C06H;
import X.C10543Hqv;
import X.C10571Hud;
import X.C1BN;
import X.C20Q;
import X.C20Z;
import X.C3Pi;
import X.C3UX;
import X.C7384Etj;
import X.C9286GCn;
import X.EnumC10460Hji;
import X.G0V;
import X.HnJ;
import X.HsJ;
import X.HtJ;
import X.Hwg;
import X.HzP;
import com.facebook.aura.common.mvvm.AuraViewModelFactory;
import com.facebook.aura.modellock.ModelLockAppealError;
import com.facebook.aura.modellock.ModelLockAppealErrorKt;
import com.facebook.aura.modellock.ModelLockAppealFile;
import com.facebook.aura.modellock.ModelLockOwner;
import com.facebook.aura.modellock.ModelLockRepository;
import com.facebook.aura.toast.api.ToastApi;
import java.io.File;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.maplibre.android.R;

/* loaded from: classes.dex */
public final class HatchModelLockSupportViewModel extends AEs {
    public static final int $stable = 8;
    public static final Companion Companion = new Companion();
    public static final int MAX_ADDITIONAL_INFO_CODE_POINTS = 600;
    public static final String SHARED_DATA_MIME_TYPE = "text/plain";
    public final BLG<Phase> _phase;
    public final C1BN<Phase> phase;
    public final ModelLockRepository repository;

    @DebugMetadata(c = "com.facebook.aura.conversation.viewmodel.HatchModelLockSupportViewModel$1", f = "HatchModelLockSupportViewModel.kt", l = {R.styleable.maplibre_MapView_maplibre_uiRotateGestures}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.conversation.viewmodel.HatchModelLockSupportViewModel$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public Object L$0;
        public int label;

        public AnonymousClass1(HtJ<? super AnonymousClass1> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return HatchModelLockSupportViewModel.this.new AnonymousClass1(htJ);
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [T, com.facebook.aura.modellock.ModelLockOwner] */
        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                final C10543Hqv c10543Hqv = new C10543Hqv();
                c10543Hqv.element = HatchModelLockSupportViewModel.this.repository.currentOwner();
                final HatchModelLockSupportViewModel hatchModelLockSupportViewModel = HatchModelLockSupportViewModel.this;
                C20Q<ModelLockOwner> c20q = hatchModelLockSupportViewModel.repository.lockOwner;
                C20Z<? super ModelLockOwner> c20z = new C20Z() { // from class: com.facebook.aura.conversation.viewmodel.HatchModelLockSupportViewModel.1.1
                    @Override // X.C20Z
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, HtJ htJ) {
                        return emit((ModelLockOwner) obj2, (HtJ<? super Unit>) htJ);
                    }

                    /* JADX WARN: Multi-variable type inference failed */
                    public final Object emit(ModelLockOwner modelLockOwner, HtJ<? super Unit> htJ) {
                        if (!C7384Etj.areEqual(modelLockOwner, c10543Hqv.element)) {
                            c10543Hqv.element = modelLockOwner;
                            BLG<Phase> blg = hatchModelLockSupportViewModel._phase;
                            if (modelLockOwner == 0) {
                                blg.Af8(Phase.Unavailable.INSTANCE);
                            } else {
                                Phase value = blg.getValue();
                                if ((value instanceof Phase.Ready) || C7384Etj.areEqual(value, Phase.Loading.INSTANCE) || C7384Etj.areEqual(value, Phase.LoadFailed.INSTANCE)) {
                                    hatchModelLockSupportViewModel.onAppealFileStale();
                                }
                            }
                        }
                        return Unit.INSTANCE;
                    }
                };
                this.L$0 = null;
                this.label = 1;
                if (c20q.collect(c20z, this) == enumC10460Hji) {
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
            return HatchModelLockSupportViewModel.this.new AnonymousClass1(htJ).invokeSuspend(Unit.INSTANCE);
        }
    }

    public final class Factory extends AuraViewModelFactory<HatchModelLockSupportViewModel> {
        public static final int $stable = 8;
        public final AbstractC3358CGz userSession;

        public Factory(AbstractC3358CGz abstractC3358CGz) {
            C7384Etj.A0Y(abstractC3358CGz, 0);
            this.userSession = abstractC3358CGz;
        }

        @Override // com.facebook.aura.common.mvvm.AuraViewModelFactory
        public HatchModelLockSupportViewModel create() {
            return new HatchModelLockSupportViewModel(ModelLockRepository.Companion.getInstance(this.userSession));
        }
    }

    public interface Phase {

        public final class LoadFailed implements Phase {
            public static final int $stable = 0;
            public static final LoadFailed INSTANCE = new LoadFailed();

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof LoadFailed);
            }

            public String toString() {
                return "LoadFailed";
            }

            public int hashCode() {
                return -380213130;
            }
        }

        public final class Loading implements Phase {
            public static final int $stable = 0;
            public static final Loading INSTANCE = new Loading();

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof Loading);
            }

            public String toString() {
                return "Loading";
            }

            public int hashCode() {
                return 836783721;
            }
        }

        public final class Ready extends C06G implements Phase {
            public static final int $stable = 8;
            public final ModelLockAppealFile appealFile;

            public Ready(ModelLockAppealFile modelLockAppealFile) {
                C7384Etj.A0Y(modelLockAppealFile, 0);
                this.appealFile = modelLockAppealFile;
            }

            public final Ready copy(ModelLockAppealFile modelLockAppealFile) {
                C7384Etj.A0Y(modelLockAppealFile, 0);
                return new Ready(modelLockAppealFile);
            }

            public boolean equals(Object obj) {
                return this == obj || ((obj instanceof Ready) && C7384Etj.areEqual(this.appealFile, ((Ready) obj).appealFile));
            }

            public static /* synthetic */ Ready copy$default(Ready ready, ModelLockAppealFile modelLockAppealFile, int i, Object obj) {
                if ((i & 1) != 0) {
                    modelLockAppealFile = ready.appealFile;
                }
                C7384Etj.A0Y(modelLockAppealFile, 0);
                return new Ready(modelLockAppealFile);
            }

            public final ModelLockAppealFile component1() {
                return this.appealFile;
            }

            public final ModelLockAppealFile getAppealFile() {
                return this.appealFile;
            }

            public int hashCode() {
                return this.appealFile.hashCode();
            }

            public String toString() {
                return super.toString();
            }
        }

        public final class Submitted implements Phase {
            public static final int $stable = 0;
            public static final Submitted INSTANCE = new Submitted();

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof Submitted);
            }

            public String toString() {
                return "Submitted";
            }

            public int hashCode() {
                return -59687192;
            }
        }

        public final class Submitting implements Phase {
            public static final int $stable = 0;
            public static final Submitting INSTANCE = new Submitting();

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof Submitting);
            }

            public String toString() {
                return "Submitting";
            }

            public int hashCode() {
                return -1850298695;
            }
        }

        public final class Unavailable implements Phase {
            public static final int $stable = 0;
            public static final Unavailable INSTANCE = new Unavailable();

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof Unavailable);
            }

            public String toString() {
                return "Unavailable";
            }

            public int hashCode() {
                return 2032199421;
            }
        }
    }

    public final class SharedDataFile extends C06G {
        public static final int $stable = 8;
        public final File file;
        public final String mimeType;

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof SharedDataFile) {
                    SharedDataFile sharedDataFile = (SharedDataFile) obj;
                    if (!C7384Etj.areEqual(this.file, sharedDataFile.file) || !C7384Etj.areEqual(this.mimeType, sharedDataFile.mimeType)) {
                    }
                }
                return false;
            }
            return true;
        }

        public static /* synthetic */ SharedDataFile copy$default(SharedDataFile sharedDataFile, File file, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                file = sharedDataFile.file;
            }
            if ((i & 2) != 0) {
                str = sharedDataFile.mimeType;
            }
            AnonymousClass003.A0u(file, str);
            return new SharedDataFile(file, str);
        }

        public final File component1() {
            return this.file;
        }

        public final String component2() {
            return this.mimeType;
        }

        public final File getFile() {
            return this.file;
        }

        public final String getMimeType() {
            return this.mimeType;
        }

        public int hashCode() {
            return AnonymousClass001.A0H(this.mimeType, AnonymousClass005.A0E(this.file));
        }

        public SharedDataFile(File file, String str) {
            AnonymousClass003.A0u(file, str);
            this.file = file;
            this.mimeType = str;
        }

        public final SharedDataFile copy(File file, String str) {
            AnonymousClass003.A0u(file, str);
            return new SharedDataFile(file, str);
        }

        public String toString() {
            return super.toString();
        }
    }

    @DebugMetadata(c = "com.facebook.aura.conversation.viewmodel.HatchModelLockSupportViewModel$loadAppealFile$1", f = "HatchModelLockSupportViewModel.kt", l = {121}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.conversation.viewmodel.HatchModelLockSupportViewModel$loadAppealFile$1, reason: invalid class name and case insensitive filesystem */
    public final class C115701 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ ModelLockOwner $owner;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C115701(ModelLockOwner modelLockOwner, HtJ<? super C115701> htJ) {
            super(2, htJ);
            this.$owner = modelLockOwner;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return HatchModelLockSupportViewModel.this.new C115701(this.$owner, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            Object objM1445fetchAppealFileIoAF18A;
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                ModelLockRepository modelLockRepository = HatchModelLockSupportViewModel.this.repository;
                this.label = 1;
                objM1445fetchAppealFileIoAF18A = modelLockRepository.m1445fetchAppealFileIoAF18A(this);
                if (objM1445fetchAppealFileIoAF18A == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                objM1445fetchAppealFileIoAF18A = AnonymousClass001.A0q(obj);
            }
            if (C7384Etj.areEqual(HatchModelLockSupportViewModel.this.repository.currentOwner(), this.$owner)) {
                HatchModelLockSupportViewModel hatchModelLockSupportViewModel = HatchModelLockSupportViewModel.this;
                if (!(objM1445fetchAppealFileIoAF18A instanceof C10571Hud)) {
                    hatchModelLockSupportViewModel.setPhase(new Phase.Ready((ModelLockAppealFile) objM1445fetchAppealFileIoAF18A));
                }
                HatchModelLockSupportViewModel hatchModelLockSupportViewModel2 = HatchModelLockSupportViewModel.this;
                Throwable thA00 = HsJ.A00(objM1445fetchAppealFileIoAF18A);
                if (thA00 != null) {
                    hatchModelLockSupportViewModel2.onLoadFailed(ModelLockAppealErrorKt.toModelLockAppealError(thA00));
                }
            }
            return Unit.INSTANCE;
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ((C115701) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.conversation.viewmodel.HatchModelLockSupportViewModel", f = "HatchModelLockSupportViewModel.kt", l = {82}, m = "stageSharedData", v = 2)
    /* renamed from: com.facebook.aura.conversation.viewmodel.HatchModelLockSupportViewModel$stageSharedData$1, reason: invalid class name and case insensitive filesystem */
    public final class C115711 extends HzP {
        public Object L$0;
        public Object L$1;
        public int label;
        public /* synthetic */ Object result;

        public C115711(HtJ<? super C115711> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HatchModelLockSupportViewModel.this.stageSharedData(this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.conversation.viewmodel.HatchModelLockSupportViewModel$submit$1", f = "HatchModelLockSupportViewModel.kt", l = {150}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.conversation.viewmodel.HatchModelLockSupportViewModel$submit$1, reason: invalid class name and case insensitive filesystem */
    public final class C115721 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ String $additionalInfo;
        public final /* synthetic */ ModelLockAppealFile $appealFile;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C115721(ModelLockAppealFile modelLockAppealFile, String str, HtJ<? super C115721> htJ) {
            super(2, htJ);
            this.$appealFile = modelLockAppealFile;
            this.$additionalInfo = str;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return HatchModelLockSupportViewModel.this.new C115721(this.$appealFile, this.$additionalInfo, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            Object objM1446submitAppeal0E7RQCE;
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                ModelLockRepository modelLockRepository = HatchModelLockSupportViewModel.this.repository;
                ModelLockAppealFile modelLockAppealFile = this.$appealFile;
                String str = this.$additionalInfo;
                this.label = 1;
                objM1446submitAppeal0E7RQCE = modelLockRepository.m1446submitAppeal0E7RQCE(modelLockAppealFile, str, this);
                if (objM1446submitAppeal0E7RQCE == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                objM1446submitAppeal0E7RQCE = AnonymousClass001.A0q(obj);
            }
            HatchModelLockSupportViewModel hatchModelLockSupportViewModel = HatchModelLockSupportViewModel.this;
            if (!(objM1446submitAppeal0E7RQCE instanceof C10571Hud)) {
                hatchModelLockSupportViewModel.setPhase(Phase.Submitted.INSTANCE);
            }
            HatchModelLockSupportViewModel hatchModelLockSupportViewModel2 = HatchModelLockSupportViewModel.this;
            ModelLockAppealFile modelLockAppealFile2 = this.$appealFile;
            Throwable thA00 = HsJ.A00(objM1446submitAppeal0E7RQCE);
            if (thA00 != null) {
                if (hatchModelLockSupportViewModel2.repository.isCurrent(modelLockAppealFile2)) {
                    hatchModelLockSupportViewModel2.onSubmitFailed(ModelLockAppealErrorKt.toModelLockAppealError(thA00), modelLockAppealFile2);
                } else {
                    hatchModelLockSupportViewModel2.onAppealFileStale();
                }
            }
            return Unit.INSTANCE;
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ((C115721) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    public HatchModelLockSupportViewModel(ModelLockRepository modelLockRepository) {
        C7384Etj.A0Y(modelLockRepository, 0);
        this.repository = modelLockRepository;
        C9286GCn c9286GCnA01 = HnJ.A01(Phase.Loading.INSTANCE);
        this._phase = c9286GCnA01;
        this.phase = new C3Pi(null, c9286GCnA01);
        loadAppealFile();
        AnonymousClass001.A1J(new AnonymousClass1(null), AEu.A00(this));
    }

    public final String capAdditionalInfo(String str) {
        C7384Etj.A0Y(str, 0);
        return str.substring(0, str.offsetByCodePoints(0, Math.min(str.codePointCount(0, str.length()), 600)));
    }

    public final void onPrimaryAction(String str) {
        C7384Etj.A0Y(str, 0);
        Phase value = this._phase.getValue();
        if (value instanceof Phase.Ready) {
            Phase.Ready ready = (Phase.Ready) value;
            if (this.repository.isCurrent(ready.appealFile)) {
                submit(ready.appealFile, str);
                return;
            } else {
                onAppealFileStale();
                return;
            }
        }
        if (C7384Etj.areEqual(value, Phase.LoadFailed.INSTANCE)) {
            loadAppealFile();
        } else if (!C7384Etj.areEqual(value, Phase.Loading.INSTANCE) && !C7384Etj.areEqual(value, Phase.Submitting.INSTANCE) && !C7384Etj.areEqual(value, Phase.Submitted.INSTANCE) && !C7384Etj.areEqual(value, Phase.Unavailable.INSTANCE)) {
            throw new NoWhenBranchMatchedException();
        }
    }

    /* loaded from: classes5.dex */
    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ModelLockAppealError.values().length];
            try {
                AnonymousClass002.A13(ModelLockAppealError.UNAVAILABLE, iArr);
            } catch (NoSuchFieldError unused) {
            }
            try {
                AnonymousClass002.A14(ModelLockAppealError.NOTHING_TO_APPEAL, iArr);
            } catch (NoSuchFieldError unused2) {
            }
            try {
                AnonymousClass002.A15(ModelLockAppealError.CHANGED, iArr);
            } catch (NoSuchFieldError unused3) {
            }
            try {
                AnonymousClass002.A16(ModelLockAppealError.PENDING, iArr);
            } catch (NoSuchFieldError unused4) {
            }
            try {
                AnonymousClass002.A17(ModelLockAppealError.SEND_FAILED, iArr);
            } catch (NoSuchFieldError unused5) {
            }
            try {
                AnonymousClass002.A18(ModelLockAppealError.FAILED, iArr);
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private final void loadAppealFile() {
        if (!this.repository.isLocked()) {
            this._phase.Af8(Phase.Unavailable.INSTANCE);
            return;
        }
        setPhase(Phase.Loading.INSTANCE);
        ModelLockOwner modelLockOwnerCurrentOwner = this.repository.currentOwner();
        AnonymousClass001.A1J(new C115701(modelLockOwnerCurrentOwner, null), AEu.A00(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onAppealFileStale() {
        if (!this.repository.isLocked()) {
            this._phase.Af8(Phase.Unavailable.INSTANCE);
        } else {
            ToastApi.INSTANCE.showToast(com.facebook.aura.R.string._name_removed__res_0x7f12047d);
            loadAppealFile();
        }
    }

    private final void onUnavailable() {
        this._phase.Af8(Phase.Unavailable.INSTANCE);
        ToastApi.INSTANCE.showToast(com.facebook.aura.R.string._name_removed__res_0x7f120481);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setPhase(Phase phase) {
        Phase value;
        Phase phase2;
        BLG<Phase> blg = this._phase;
        do {
            value = blg.getValue();
            phase2 = value;
            if (!C7384Etj.areEqual(value, Phase.Unavailable.INSTANCE)) {
                phase2 = phase;
            }
        } while (!blg.A6e(value, phase2));
    }

    private final void showSubmitError(ModelLockAppealFile modelLockAppealFile, int i) {
        setPhase(new Phase.Ready(modelLockAppealFile));
        ToastApi.INSTANCE.showToast(i);
    }

    private final void submit(ModelLockAppealFile modelLockAppealFile, String str) {
        setPhase(Phase.Submitting.INSTANCE);
        AnonymousClass001.A1J(new C115721(modelLockAppealFile, str, null), AEu.A00(this));
    }

    public final C1BN<Phase> getPhase() {
        return this.phase;
    }

    @Override // X.AEs
    public void onCleared() {
        this.repository.deleteStagedAppealFile();
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0065  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object stageSharedData(X.HtJ<? super com.facebook.aura.conversation.viewmodel.HatchModelLockSupportViewModel.SharedDataFile> r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof com.facebook.aura.conversation.viewmodel.HatchModelLockSupportViewModel.C115711
            if (r0 == 0) goto L65
            r7 = r9
            com.facebook.aura.conversation.viewmodel.HatchModelLockSupportViewModel$stageSharedData$1 r7 = (com.facebook.aura.conversation.viewmodel.HatchModelLockSupportViewModel.C115711) r7
            int r2 = r7.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L65
            int r2 = r2 - r1
            r7.label = r2
        L12:
            java.lang.Object r6 = r7.result
            X.Hji r5 = X.EnumC10460Hji.A02
            int r0 = r7.label
            r4 = 1
            r3 = 0
            if (r0 == 0) goto L43
            if (r0 != r4) goto L80
            java.lang.Object r2 = r7.L$1
            com.facebook.aura.modellock.ModelLockAppealFile r2 = (com.facebook.aura.modellock.ModelLockAppealFile) r2
            java.lang.Object r1 = r7.L$0
            X.Hwg.A00(r6)
        L27:
            java.io.File r6 = (java.io.File) r6
            X.BLG<com.facebook.aura.conversation.viewmodel.HatchModelLockSupportViewModel$Phase> r0 = r8._phase
            java.lang.Object r0 = r0.getValue()
            if (r0 != r1) goto L85
            if (r6 == 0) goto L6b
            com.facebook.aura.modellock.ModelLockRepository r0 = r8.repository
            boolean r0 = r0.isCurrent(r2)
            if (r0 == 0) goto L6b
            java.lang.String r0 = "text/plain"
            com.facebook.aura.conversation.viewmodel.HatchModelLockSupportViewModel$SharedDataFile r5 = new com.facebook.aura.conversation.viewmodel.HatchModelLockSupportViewModel$SharedDataFile
            r5.<init>(r6, r0)
            return r5
        L43:
            X.Hwg.A00(r6)
            X.BLG<com.facebook.aura.conversation.viewmodel.HatchModelLockSupportViewModel$Phase> r0 = r8._phase
            java.lang.Object r1 = r0.getValue()
            boolean r0 = r1 instanceof com.facebook.aura.conversation.viewmodel.HatchModelLockSupportViewModel.Phase.Ready
            if (r0 == 0) goto L85
            com.facebook.aura.conversation.viewmodel.HatchModelLockSupportViewModel$Phase$Ready r1 = (com.facebook.aura.conversation.viewmodel.HatchModelLockSupportViewModel.Phase.Ready) r1
            if (r1 == 0) goto L85
            com.facebook.aura.modellock.ModelLockAppealFile r2 = r1.appealFile
            com.facebook.aura.modellock.ModelLockRepository r0 = r8.repository
            r7.L$0 = r1
            r7.L$1 = r2
            r7.label = r4
            java.lang.Object r6 = r0.stageAppealFile(r2, r7)
            if (r6 != r5) goto L27
            return r5
        L65:
            com.facebook.aura.conversation.viewmodel.HatchModelLockSupportViewModel$stageSharedData$1 r7 = new com.facebook.aura.conversation.viewmodel.HatchModelLockSupportViewModel$stageSharedData$1
            r7.<init>(r9)
            goto L12
        L6b:
            com.facebook.aura.modellock.ModelLockRepository r0 = r8.repository
            boolean r0 = r0.isCurrent(r2)
            if (r0 == 0) goto L7c
            com.facebook.aura.toast.api.ToastApi r1 = com.facebook.aura.toast.api.ToastApi.INSTANCE
            r0 = 2131888921(0x7f120b19, float:1.941249E38)
            r1.showToast(r0)
            return r3
        L7c:
            r8.onAppealFileStale()
            return r3
        L80:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        L85:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.conversation.viewmodel.HatchModelLockSupportViewModel.stageSharedData(X.HtJ):java.lang.Object");
    }

    public final class Companion {
        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onLoadFailed(ModelLockAppealError modelLockAppealError) {
        ToastApi toastApi;
        int i;
        switch (modelLockAppealError.ordinal()) {
            case 0:
                onUnavailable();
                return;
            case 1:
            case 3:
            case 4:
            case 5:
                setPhase(Phase.LoadFailed.INSTANCE);
                toastApi = ToastApi.INSTANCE;
                i = com.facebook.aura.R.string._name_removed__res_0x7f120478;
                break;
            case 2:
                setPhase(Phase.LoadFailed.INSTANCE);
                toastApi = ToastApi.INSTANCE;
                i = com.facebook.aura.R.string._name_removed__res_0x7f120479;
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        toastApi.showToast(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onSubmitFailed(ModelLockAppealError modelLockAppealError, ModelLockAppealFile modelLockAppealFile) {
        int i;
        switch (modelLockAppealError.ordinal()) {
            case 0:
                onUnavailable();
                return;
            case 1:
                ToastApi.INSTANCE.showToast(com.facebook.aura.R.string._name_removed__res_0x7f12047d);
                loadAppealFile();
                return;
            case 2:
                i = com.facebook.aura.R.string._name_removed__res_0x7f120479;
                break;
            case 3:
                ToastApi.INSTANCE.showToast(com.facebook.aura.R.string._name_removed__res_0x7f120475);
                setPhase(Phase.Submitted.INSTANCE);
                return;
            case 4:
                i = com.facebook.aura.R.string._name_removed__res_0x7f12047c;
                break;
            case 5:
                i = com.facebook.aura.R.string._name_removed__res_0x7f120b19;
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        showSubmitError(modelLockAppealFile, i);
    }
}
