package com.facebook.aura.pairs;

import X.AEs;
import X.AEu;
import X.AbstractC07127nr;
import X.AbstractC3358CGz;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.BLG;
import X.C1BN;
import X.C20Q;
import X.C20Z;
import X.C3UX;
import X.C3cG;
import X.C7384Etj;
import X.C7BY;
import X.C9286GCn;
import X.CFK;
import X.EnumC10460Hji;
import X.G0V;
import X.HtJ;
import X.Hwg;
import com.facebook.aura.common.mvvm.AuraViewModelFactory;
import com.facebook.aura.pairs.SharedGoalEditOutcome;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* loaded from: classes3.dex */
public final class SharedGoalViewModel extends AEs {
    public static final int $stable = 8;
    public final BLG<SharedGoalUiState> _uiState;
    public final String goalId;
    public final String hostMuse;
    public final PairsRepository repository;
    public final C1BN<SharedGoalUiState> uiState;

    @DebugMetadata(c = "com.facebook.aura.pairs.SharedGoalViewModel$1", f = "SharedGoalViewModel.kt", l = {64}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.pairs.SharedGoalViewModel$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public int label;

        public AnonymousClass1(HtJ<? super AnonymousClass1> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return SharedGoalViewModel.this.new AnonymousClass1(htJ);
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return SharedGoalViewModel.this.new AnonymousClass1(htJ).invokeSuspend(Unit.INSTANCE);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                final SharedGoalViewModel sharedGoalViewModel = SharedGoalViewModel.this;
                C20Q<Unit> c20q = sharedGoalViewModel.repository.changes;
                C20Z<? super Unit> c20z = new C20Z() { // from class: com.facebook.aura.pairs.SharedGoalViewModel.1.1
                    public final Object emit(Unit unit, HtJ<? super Unit> htJ) {
                        if (!sharedGoalViewModel._uiState.getValue().isSaving) {
                            sharedGoalViewModel.reload();
                        }
                        return Unit.INSTANCE;
                    }

                    @Override // X.C20Z
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, HtJ htJ) {
                        return emit((Unit) obj2, (HtJ<? super Unit>) htJ);
                    }
                };
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
    }

    public final class Factory extends AuraViewModelFactory<SharedGoalViewModel> {
        public static final int $stable = 8;
        public final String goalId;
        public final String hostMuse;
        public final AbstractC3358CGz userSession;

        @Override // com.facebook.aura.common.mvvm.AuraViewModelFactory
        public SharedGoalViewModel create() {
            return new SharedGoalViewModel(PairsRepository.Companion.getInstance(this.userSession), this.hostMuse, this.goalId);
        }

        public Factory(AbstractC3358CGz abstractC3358CGz, String str, String str2) {
            AnonymousClass005.A0x(abstractC3358CGz, str, str2);
            this.userSession = abstractC3358CGz;
            this.hostMuse = str;
            this.goalId = str2;
        }
    }

    @DebugMetadata(c = "com.facebook.aura.pairs.SharedGoalViewModel$reload$2", f = "SharedGoalViewModel.kt", l = {72}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.pairs.SharedGoalViewModel$reload$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public int label;

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) throws Throwable {
            SharedGoalUiState value;
            SharedGoalUiState sharedGoalUiState;
            SharedGoalUiState value2;
            SharedGoalUiState sharedGoalUiState2;
            SharedGoalProblem sharedGoalProblem;
            Object objSharedGoal = obj;
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            try {
                if (i == 0) {
                    Hwg.A00(obj);
                    SharedGoalViewModel sharedGoalViewModel = SharedGoalViewModel.this;
                    PairsRepository pairsRepository = sharedGoalViewModel.repository;
                    String str = sharedGoalViewModel.hostMuse;
                    String str2 = sharedGoalViewModel.goalId;
                    this.label = 1;
                    objSharedGoal = pairsRepository.sharedGoal(str, str2, this);
                    if (objSharedGoal == enumC10460Hji) {
                        return enumC10460Hji;
                    }
                } else {
                    if (i != 1) {
                        throw AnonymousClass001.A0n();
                    }
                    Hwg.A00(obj);
                }
                SharedGoal sharedGoal = (SharedGoal) objSharedGoal;
                BLG<SharedGoalUiState> blg = SharedGoalViewModel.this._uiState;
                do {
                    value2 = blg.getValue();
                    sharedGoalUiState2 = value2;
                    if (sharedGoal == null) {
                        sharedGoalProblem = SharedGoalProblem.LOAD_FAILED;
                    } else {
                        sharedGoalProblem = sharedGoalUiState2.problem;
                        if (sharedGoalProblem != SharedGoalProblem.CONFLICT && (sharedGoalProblem != SharedGoalProblem.SAVE_FAILED || sharedGoalUiState2.draft == null)) {
                            sharedGoalProblem = null;
                        }
                    }
                } while (!blg.A6e(value2, sharedGoalUiState2.copy(sharedGoal, false, sharedGoalProblem, sharedGoalUiState2.draft, sharedGoalUiState2.isSaving)));
            } catch (SharedGoalException e) {
                BLG<SharedGoalUiState> blg2 = SharedGoalViewModel.this._uiState;
                do {
                    value = blg2.getValue();
                    sharedGoalUiState = value;
                } while (!blg2.A6e(value, sharedGoalUiState.copy(sharedGoalUiState.goal, false, SharedGoalViewModelKt.toProblem(e, SharedGoalProblem.LOAD_FAILED), sharedGoalUiState.draft, sharedGoalUiState.isSaving)));
            } catch (CancellationException e2) {
                throw e2;
            }
            return Unit.INSTANCE;
        }

        public AnonymousClass2(HtJ<? super AnonymousClass2> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return SharedGoalViewModel.this.new AnonymousClass2(htJ);
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return SharedGoalViewModel.this.new AnonymousClass2(htJ).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.pairs.SharedGoalViewModel$submit$2", f = "SharedGoalViewModel.kt", l = {142}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.pairs.SharedGoalViewModel$submit$2, reason: invalid class name and case insensitive filesystem */
    public final class C130082 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ SharedGoalChange $change;
        public final /* synthetic */ String $revision;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C130082(SharedGoalChange sharedGoalChange, String str, HtJ<? super C130082> htJ) {
            super(2, htJ);
            this.$change = sharedGoalChange;
            this.$revision = str;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return SharedGoalViewModel.this.new C130082(this.$change, this.$revision, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            SharedGoalUiState value;
            SharedGoalUiState sharedGoalUiState;
            SharedGoalUiState value2;
            SharedGoalUiState sharedGoalUiState2;
            SharedGoalUiState value3;
            SharedGoalUiState sharedGoalUiState3;
            SharedGoalUiState value4;
            SharedGoalUiState sharedGoalUiStateCopy;
            SharedGoalUiState value5;
            SharedGoalUiState sharedGoalUiState4;
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            try {
                try {
                    if (i == 0) {
                        Hwg.A00(obj);
                        SharedGoalViewModel sharedGoalViewModel = SharedGoalViewModel.this;
                        PairsRepository pairsRepository = sharedGoalViewModel.repository;
                        String str = sharedGoalViewModel.hostMuse;
                        String str2 = sharedGoalViewModel.goalId;
                        SharedGoalEditJson json = SharedGoalViewModelKt.toJson(this.$change, this.$revision);
                        this.label = 1;
                        obj = pairsRepository.editSharedGoal(str, str2, json, this);
                        if (obj == enumC10460Hji) {
                            return enumC10460Hji;
                        }
                    } else {
                        if (i != 1) {
                            throw AnonymousClass001.A0n();
                        }
                        Hwg.A00(obj);
                    }
                    SharedGoalEditOutcome sharedGoalEditOutcome = (SharedGoalEditOutcome) obj;
                    BLG<SharedGoalUiState> blg = SharedGoalViewModel.this._uiState;
                    do {
                        value4 = blg.getValue();
                        SharedGoalUiState sharedGoalUiState5 = value4;
                        if (sharedGoalEditOutcome instanceof SharedGoalEditOutcome.Applied) {
                            sharedGoalUiStateCopy = sharedGoalUiState5.copy(((SharedGoalEditOutcome.Applied) sharedGoalEditOutcome).goal, sharedGoalUiState5.isLoading, sharedGoalUiState5.problem, null, sharedGoalUiState5.isSaving);
                        } else {
                            if (!(sharedGoalEditOutcome instanceof SharedGoalEditOutcome.Conflict)) {
                                throw C3cG.A0q();
                            }
                            SharedGoal sharedGoal = ((SharedGoalEditOutcome.Conflict) sharedGoalEditOutcome).goal;
                            if (sharedGoal == null) {
                                sharedGoal = sharedGoalUiState5.goal;
                            }
                            sharedGoalUiStateCopy = sharedGoalUiState5.copy(sharedGoal, sharedGoalUiState5.isLoading, SharedGoalProblem.CONFLICT, sharedGoalUiState5.draft, sharedGoalUiState5.isSaving);
                        }
                    } while (!blg.A6e(value4, sharedGoalUiStateCopy));
                    BLG<SharedGoalUiState> blg2 = SharedGoalViewModel.this._uiState;
                    do {
                        value5 = blg2.getValue();
                        sharedGoalUiState4 = value5;
                    } while (!blg2.A6e(value5, sharedGoalUiState4.copy(sharedGoalUiState4.goal, sharedGoalUiState4.isLoading, sharedGoalUiState4.problem, sharedGoalUiState4.draft, false)));
                } catch (SharedGoalException e) {
                    CFK.A0H(SharedGoalViewModelKt.TAG, "shared goal edit failed: %s", e.httpCode);
                    BLG<SharedGoalUiState> blg3 = SharedGoalViewModel.this._uiState;
                    do {
                        value = blg3.getValue();
                        sharedGoalUiState = value;
                    } while (!blg3.A6e(value, sharedGoalUiState.copy(sharedGoalUiState.goal, sharedGoalUiState.isLoading, SharedGoalViewModelKt.toProblem(e, SharedGoalProblem.SAVE_FAILED), sharedGoalUiState.draft, sharedGoalUiState.isSaving)));
                    BLG<SharedGoalUiState> blg4 = SharedGoalViewModel.this._uiState;
                    do {
                        value2 = blg4.getValue();
                        sharedGoalUiState2 = value2;
                    } while (!blg4.A6e(value2, sharedGoalUiState2.copy(sharedGoalUiState2.goal, sharedGoalUiState2.isLoading, sharedGoalUiState2.problem, sharedGoalUiState2.draft, false)));
                } catch (CancellationException e2) {
                    throw e2;
                }
                return Unit.INSTANCE;
            } catch (Throwable th) {
                BLG<SharedGoalUiState> blg5 = SharedGoalViewModel.this._uiState;
                do {
                    value3 = blg5.getValue();
                    sharedGoalUiState3 = value3;
                } while (!blg5.A6e(value3, sharedGoalUiState3.copy(sharedGoalUiState3.goal, sharedGoalUiState3.isLoading, sharedGoalUiState3.problem, sharedGoalUiState3.draft, false)));
                throw th;
            }
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ((C130082) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    public SharedGoalViewModel(PairsRepository pairsRepository, String str, String str2) {
        boolean zA1Z = AnonymousClass005.A1Z(pairsRepository, str, str2);
        this.repository = pairsRepository;
        this.hostMuse = str;
        this.goalId = str2;
        C9286GCn c9286GCnA14 = C3cG.A14(new SharedGoalUiState(null, zA1Z, null, null, false));
        this._uiState = c9286GCnA14;
        this.uiState = C3cG.A11(c9286GCnA14);
        AnonymousClass001.A1I(AnonymousClass001.A0y(), new AnonymousClass1(null), AEu.A00(this));
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean editGoal(java.lang.String r14, java.lang.String r15, com.facebook.aura.pairs.SharedGoalStatus r16, java.lang.String r17) {
        /*
            r13 = this;
            r3 = 0
            r9 = r14
            X.C7384Etj.A0Y(r14, r3)
            r2 = 1
            r6 = r17
            X.AnonymousClass002.A1B(r15, r2, r6)
            r4 = r13
            X.BLG<com.facebook.aura.pairs.SharedGoalUiState> r0 = r13._uiState
            java.lang.Object r0 = r0.getValue()
            com.facebook.aura.pairs.SharedGoalUiState r0 = (com.facebook.aura.pairs.SharedGoalUiState) r0
            com.facebook.aura.pairs.SharedGoal r5 = r0.goal
            if (r5 == 0) goto L30
            r8 = r16
            if (r16 == 0) goto L21
            com.facebook.aura.pairs.SharedGoalStatus r0 = r5.status
            r1 = 1
            if (r8 != r0) goto L22
        L21:
            r1 = 0
        L22:
            boolean r0 = X.C7BY.A0j(r14)
            if (r0 != 0) goto L30
            if (r1 == 0) goto L31
            boolean r0 = X.C7BY.A0j(r6)
            if (r0 == 0) goto L31
        L30:
            return r3
        L31:
            java.lang.String r0 = r5.title
            boolean r0 = r14.equals(r0)
            r14 = 0
            r10 = r14
            if (r0 != 0) goto L3c
            r10 = r9
        L3c:
            java.lang.String r0 = r5.summary
            boolean r0 = r15.equals(r0)
            r11 = r14
            if (r0 != 0) goto L46
            r11 = r15
        L46:
            r12 = r14
            r13 = r14
            if (r1 == 0) goto L4c
            r12 = r8
            r13 = r6
        L4c:
            java.lang.String r9 = X.AnonymousClass002.A0k()
            com.facebook.aura.pairs.SharedGoalChange r8 = new com.facebook.aura.pairs.SharedGoalChange
            r15 = r14
            r16 = r14
            r17 = r14
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16, r17)
            java.lang.String r0 = r8.title
            if (r0 != 0) goto L67
            java.lang.String r0 = r8.summary
            if (r0 != 0) goto L67
            com.facebook.aura.pairs.SharedGoalStatus r0 = r8.status
            if (r0 != 0) goto L67
            return r3
        L67:
            r4.submit(r8)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.pairs.SharedGoalViewModel.editGoal(java.lang.String, java.lang.String, com.facebook.aura.pairs.SharedGoalStatus, java.lang.String):boolean");
    }

    public final void removeTask(String str) {
        C7384Etj.A0Y(str, 0);
        submit(new SharedGoalChange(AnonymousClass002.A0k(), null, null, null, null, str, null, null, AnonymousClass001.A0i()));
    }

    public final void renameTask(String str, String str2) {
        AnonymousClass003.A0u(str, str2);
        if (C7BY.A0j(str2)) {
            return;
        }
        submit(new SharedGoalChange(AnonymousClass002.A0k(), null, null, null, null, str, str2, null, null));
    }

    public final void setTaskCompleted(String str, boolean z) {
        C7384Etj.A0Y(str, 0);
        submit(new SharedGoalChange(AnonymousClass002.A0k(), null, null, null, null, str, null, Boolean.valueOf(z), null));
    }

    private final void submit(SharedGoalChange sharedGoalChange) {
        SharedGoal sharedGoal;
        String str;
        SharedGoalUiState value;
        SharedGoalUiState sharedGoalUiState;
        SharedGoalUiState value2 = this._uiState.getValue();
        if (value2.isSaving || (sharedGoal = value2.goal) == null || (str = sharedGoal.revision) == null) {
            return;
        }
        BLG<SharedGoalUiState> blg = this._uiState;
        do {
            value = blg.getValue();
            sharedGoalUiState = value;
        } while (!blg.A6e(value, sharedGoalUiState.copy(sharedGoalUiState.goal, sharedGoalUiState.isLoading, null, sharedGoalChange, true)));
        AnonymousClass001.A1I(AnonymousClass001.A0y(), new C130082(sharedGoalChange, str, null), AEu.A00(this));
    }

    public final void discardDraft() {
        SharedGoalUiState value;
        SharedGoalUiState sharedGoalUiState;
        BLG<SharedGoalUiState> blg = this._uiState;
        do {
            value = blg.getValue();
            sharedGoalUiState = value;
        } while (!blg.A6e(value, sharedGoalUiState.copy(sharedGoalUiState.goal, sharedGoalUiState.isLoading, null, null, sharedGoalUiState.isSaving)));
    }

    public final C1BN<SharedGoalUiState> getUiState() {
        return this.uiState;
    }

    public final void reload() {
        SharedGoalUiState value;
        SharedGoalUiState sharedGoalUiState;
        BLG<SharedGoalUiState> blg = this._uiState;
        do {
            value = blg.getValue();
            sharedGoalUiState = value;
        } while (!blg.A6e(value, sharedGoalUiState.copy(sharedGoalUiState.goal, true, sharedGoalUiState.problem, sharedGoalUiState.draft, sharedGoalUiState.isSaving)));
        AnonymousClass001.A1I(AnonymousClass001.A0y(), new AnonymousClass2(null), AEu.A00(this));
    }

    public final void retryDraft() {
        SharedGoalUiState value = this._uiState.getValue();
        SharedGoalChange sharedGoalChangeCopy$default = value.draft;
        if (sharedGoalChangeCopy$default != null) {
            if (value.problem == SharedGoalProblem.CONFLICT) {
                sharedGoalChangeCopy$default = SharedGoalChange.copy$default(sharedGoalChangeCopy$default, AnonymousClass002.A0k(), null, null, null, null, null, null, null, null, 510, null);
            }
            submit(sharedGoalChangeCopy$default);
        }
    }
}
