package com.facebook.aura.pairs;

import X.AEs;
import X.AEu;
import X.AbstractC07127nr;
import X.AbstractC3358CGz;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.BLG;
import X.C1BN;
import X.C3UX;
import X.C3cG;
import X.C60R;
import X.C7384Etj;
import X.C9286GCn;
import X.EnumC10460Hji;
import X.G0V;
import X.HtJ;
import X.Hwg;
import X.HzP;
import com.facebook.aura.R;
import com.facebook.aura.common.mvvm.AuraViewModelFactory;
import com.facebook.aura.toast.api.ToastApi;
import java.util.Iterator;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* loaded from: classes3.dex */
public final class ConnectionsRuleEditorViewModel extends AEs {
    public static final int $stable = 8;
    public final BLG<ConnectionsRuleEditorUiState> _uiState;
    public final String connectionId;
    public final String id;
    public final PairsRepository repository;
    public volatile Long revision;
    public final String ruleId;
    public final C1BN<ConnectionsRuleEditorUiState> uiState;

    public final class Factory extends AuraViewModelFactory<ConnectionsRuleEditorViewModel> {
        public static final int $stable = 8;
        public final String connectionId;
        public final String ruleId;
        public final AbstractC3358CGz userSession;

        @Override // com.facebook.aura.common.mvvm.AuraViewModelFactory
        public ConnectionsRuleEditorViewModel create() {
            return new ConnectionsRuleEditorViewModel(PairsRepository.Companion.getInstance(this.userSession), this.connectionId, this.ruleId);
        }

        public Factory(AbstractC3358CGz abstractC3358CGz, String str, String str2) {
            AnonymousClass003.A0u(abstractC3358CGz, str);
            this.userSession = abstractC3358CGz;
            this.connectionId = str;
            this.ruleId = str2;
        }
    }

    @DebugMetadata(c = "com.facebook.aura.pairs.ConnectionsRuleEditorViewModel$delete$2", f = "ConnectionsRuleEditorViewModel.kt", l = {117}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.pairs.ConnectionsRuleEditorViewModel$delete$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public int label;

        public AnonymousClass2(HtJ<? super AnonymousClass2> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return ConnectionsRuleEditorViewModel.this.new AnonymousClass2(htJ);
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ConnectionsRuleEditorViewModel.this.new AnonymousClass2(htJ).invokeSuspend(Unit.INSTANCE);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            ConnectionsRuleEditorUiState value;
            ConnectionsRuleEditorUiState value2;
            ConnectionsRuleEditorUiState value3;
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            try {
                try {
                    if (i == 0) {
                        Hwg.A00(obj);
                        ConnectionsRuleEditorViewModel connectionsRuleEditorViewModel = ConnectionsRuleEditorViewModel.this;
                        PairsRepository pairsRepository = connectionsRuleEditorViewModel.repository;
                        String str = connectionsRuleEditorViewModel.connectionId;
                        String str2 = connectionsRuleEditorViewModel.ruleId;
                        this.label = 1;
                        if (pairsRepository.removeSharingRule(str, str2, this) == enumC10460Hji) {
                            return enumC10460Hji;
                        }
                    } else {
                        if (i != 1) {
                            throw AnonymousClass001.A0n();
                        }
                        Hwg.A00(obj);
                    }
                    BLG<ConnectionsRuleEditorUiState> blg = ConnectionsRuleEditorViewModel.this._uiState;
                    do {
                        value2 = blg.getValue();
                    } while (!blg.A6e(value2, ConnectionsRuleEditorUiState.copy$default(value2, ConnectionsRuleEditorPhase.DONE, false, null, null, null, null, false, false, false, null, 1022, null)));
                    BLG<ConnectionsRuleEditorUiState> blg2 = ConnectionsRuleEditorViewModel.this._uiState;
                    do {
                        value3 = blg2.getValue();
                    } while (!blg2.A6e(value3, ConnectionsRuleEditorUiState.copy$default(value3, null, false, null, null, null, null, false, false, false, null, 895, null)));
                } catch (PairsException e) {
                    if (e.error == PairsError.NOT_FOUND) {
                        BLG<ConnectionsRuleEditorUiState> blg3 = ConnectionsRuleEditorViewModel.this._uiState;
                        do {
                            value = blg3.getValue();
                        } while (!C60R.A1W(ConnectionsRuleEditorPhase.DONE, value, value, blg3));
                    } else {
                        ToastApi.INSTANCE.showToast(R.string._name_removed__res_0x7f120814);
                    }
                    while (!AbstractC07127nr.A0K(ConnectionsRuleEditorViewModel.this._uiState)) {
                    }
                } catch (CancellationException e2) {
                    throw e2;
                }
                return Unit.INSTANCE;
            } catch (Throwable th) {
                while (!AbstractC07127nr.A0K(ConnectionsRuleEditorViewModel.this._uiState)) {
                }
                throw th;
            }
        }
    }

    @DebugMetadata(c = "com.facebook.aura.pairs.ConnectionsRuleEditorViewModel$load$1", f = "ConnectionsRuleEditorViewModel.kt", l = {135}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.pairs.ConnectionsRuleEditorViewModel$load$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public int label;

        public AnonymousClass1(HtJ<? super AnonymousClass1> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return ConnectionsRuleEditorViewModel.this.new AnonymousClass1(htJ);
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ConnectionsRuleEditorViewModel.this.new AnonymousClass1(htJ).invokeSuspend(Unit.INSTANCE);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            ConnectionsSharingRule next;
            ConnectionsRuleEditorUiState value;
            ConnectionsRuleEditorUiState connectionsRuleEditorUiStateCopy;
            ConnectionsRuleEditorUiState value2;
            ConnectionsRuleEditorUiState value3;
            Object rules = obj;
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(rules);
                ConnectionsRuleEditorViewModel connectionsRuleEditorViewModel = ConnectionsRuleEditorViewModel.this;
                this.label = 1;
                rules = connectionsRuleEditorViewModel.readRules(this);
                if (rules == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(rules);
            }
            ConnectionsCanonicalRules connectionsCanonicalRules = (ConnectionsCanonicalRules) rules;
            ConnectionsRuleEditorViewModel connectionsRuleEditorViewModel2 = ConnectionsRuleEditorViewModel.this;
            if (connectionsCanonicalRules == null) {
                BLG<ConnectionsRuleEditorUiState> blg = connectionsRuleEditorViewModel2._uiState;
                do {
                    value3 = blg.getValue();
                } while (!C60R.A1W(ConnectionsRuleEditorPhase.FAILED, value3, value3, blg));
            } else {
                connectionsRuleEditorViewModel2.revision = C3cG.A0S(connectionsCanonicalRules.revision);
                ConnectionsRuleEditorViewModel connectionsRuleEditorViewModel3 = ConnectionsRuleEditorViewModel.this;
                if (connectionsRuleEditorViewModel3.ruleId == null) {
                    BLG<ConnectionsRuleEditorUiState> blg2 = connectionsRuleEditorViewModel3._uiState;
                    do {
                        value2 = blg2.getValue();
                    } while (!C60R.A1W(ConnectionsRuleEditorPhase.READY, value2, value2, blg2));
                } else {
                    Iterator<ConnectionsSharingRule> it = connectionsCanonicalRules.rules.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it.next();
                        if (C7384Etj.areEqual(next.id, connectionsRuleEditorViewModel3.ruleId)) {
                            break;
                        }
                    }
                    ConnectionsSharingRule connectionsSharingRule = next;
                    BLG<ConnectionsRuleEditorUiState> blg3 = ConnectionsRuleEditorViewModel.this._uiState;
                    do {
                        value = blg3.getValue();
                        ConnectionsRuleEditorUiState connectionsRuleEditorUiState = value;
                        if (connectionsSharingRule == null) {
                            connectionsRuleEditorUiStateCopy = ConnectionsRuleEditorUiState.copy$default(connectionsRuleEditorUiState, ConnectionsRuleEditorPhase.MISSING, false, null, null, null, null, false, false, false, null, 1022, null);
                        } else {
                            ConnectionsRuleEditorPhase connectionsRuleEditorPhase = ConnectionsRuleEditorPhase.READY;
                            String str = connectionsSharingRule.title;
                            String str2 = connectionsSharingRule.summary;
                            String str3 = connectionsSharingRule.description;
                            connectionsRuleEditorUiStateCopy = connectionsRuleEditorUiState.copy(connectionsRuleEditorPhase, connectionsRuleEditorUiState.isNew, str, str2, str3, str3, connectionsCanonicalRules.unconfirmedRuleIds.contains(connectionsSharingRule.id), connectionsRuleEditorUiState.isBusy, connectionsRuleEditorUiState.hasConflict, connectionsRuleEditorUiState.savedVersion);
                        }
                    } while (!blg3.A6e(value, connectionsRuleEditorUiStateCopy));
                }
            }
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.facebook.aura.pairs.ConnectionsRuleEditorViewModel", f = "ConnectionsRuleEditorViewModel.kt", l = {184}, m = "readRules", v = 2)
    /* renamed from: com.facebook.aura.pairs.ConnectionsRuleEditorViewModel$readRules$1, reason: invalid class name and case insensitive filesystem */
    public final class C128321 extends HzP {
        public int label;
        public /* synthetic */ Object result;

        public C128321(HtJ<? super C128321> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ConnectionsRuleEditorViewModel.this.readRules(this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.pairs.ConnectionsRuleEditorViewModel", f = "ConnectionsRuleEditorViewModel.kt", l = {165}, m = "reconcile", v = 2)
    /* renamed from: com.facebook.aura.pairs.ConnectionsRuleEditorViewModel$reconcile$1, reason: invalid class name and case insensitive filesystem */
    public final class C128331 extends HzP {
        public int label;
        public /* synthetic */ Object result;

        public C128331(HtJ<? super C128331> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ConnectionsRuleEditorViewModel.this.reconcile(this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.pairs.ConnectionsRuleEditorViewModel$save$2", f = "ConnectionsRuleEditorViewModel.kt", l = {96, 102}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.pairs.ConnectionsRuleEditorViewModel$save$2, reason: invalid class name and case insensitive filesystem */
    public final class C128342 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ Long $expectedRevision;
        public final /* synthetic */ boolean $keepPreviews;
        public final /* synthetic */ ConnectionsSharingRule $rule;
        public Object L$0;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C128342(ConnectionsSharingRule connectionsSharingRule, Long l, boolean z, HtJ<? super C128342> htJ) {
            super(2, htJ);
            this.$rule = connectionsSharingRule;
            this.$expectedRevision = l;
            this.$keepPreviews = z;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return ConnectionsRuleEditorViewModel.this.new C128342(this.$rule, this.$expectedRevision, this.$keepPreviews, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            ConnectionsRuleEditorUiState value;
            ConnectionsRuleEditorUiState value2;
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            try {
                try {
                } catch (PairsException e) {
                    if (e.error == PairsError.CONFLICT) {
                        ConnectionsRuleEditorViewModel connectionsRuleEditorViewModel = ConnectionsRuleEditorViewModel.this;
                        this.L$0 = null;
                        this.label = 2;
                        if (connectionsRuleEditorViewModel.reconcile(this) == enumC10460Hji) {
                            return enumC10460Hji;
                        }
                    } else {
                        ToastApi.INSTANCE.showToast(R.string._name_removed__res_0x7f120816);
                    }
                } catch (CancellationException e2) {
                    throw e2;
                }
                if (i == 0) {
                    Hwg.A00(obj);
                    ConnectionsRuleEditorViewModel connectionsRuleEditorViewModel2 = ConnectionsRuleEditorViewModel.this;
                    PairsRepository pairsRepository = connectionsRuleEditorViewModel2.repository;
                    String str = connectionsRuleEditorViewModel2.connectionId;
                    ConnectionsSharingRule connectionsSharingRule = this.$rule;
                    long jLongValue = this.$expectedRevision.longValue();
                    boolean z = this.$keepPreviews;
                    this.label = 1;
                    if (pairsRepository.saveCanonicalRule(str, connectionsSharingRule, jLongValue, z, this) == enumC10460Hji) {
                        return enumC10460Hji;
                    }
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw AnonymousClass001.A0n();
                        }
                        Hwg.A00(obj);
                        while (!AbstractC07127nr.A0K(ConnectionsRuleEditorViewModel.this._uiState)) {
                        }
                        return Unit.INSTANCE;
                    }
                    Hwg.A00(obj);
                }
                BLG<ConnectionsRuleEditorUiState> blg = ConnectionsRuleEditorViewModel.this._uiState;
                do {
                    value = blg.getValue();
                } while (!blg.A6e(value, ConnectionsRuleEditorUiState.copy$default(value, ConnectionsRuleEditorPhase.DONE, false, null, null, null, null, false, false, false, null, 1022, null)));
                BLG<ConnectionsRuleEditorUiState> blg2 = ConnectionsRuleEditorViewModel.this._uiState;
                do {
                    value2 = blg2.getValue();
                } while (!blg2.A6e(value2, ConnectionsRuleEditorUiState.copy$default(value2, null, false, null, null, null, null, false, false, false, null, 895, null)));
                return Unit.INSTANCE;
            } catch (Throwable th) {
                while (!AbstractC07127nr.A0K(ConnectionsRuleEditorViewModel.this._uiState)) {
                }
                throw th;
            }
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ((C128342) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    public final void setDescription(String str) {
        ConnectionsRuleEditorUiState value;
        C7384Etj.A0Y(str, 0);
        BLG<ConnectionsRuleEditorUiState> blg = this._uiState;
        do {
            value = blg.getValue();
        } while (!blg.A6e(value, ConnectionsRuleEditorUiState.copy$default(value, null, false, null, null, str, null, false, false, false, null, 1007, null)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:11:0x001e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object readRules(X.HtJ<? super com.facebook.aura.pairs.ConnectionsCanonicalRules> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof com.facebook.aura.pairs.ConnectionsRuleEditorViewModel.C128321
            if (r0 == 0) goto L1e
            r4 = r6
            com.facebook.aura.pairs.ConnectionsRuleEditorViewModel$readRules$1 r4 = (com.facebook.aura.pairs.ConnectionsRuleEditorViewModel.C128321) r4
            int r2 = r4.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L1e
            int r2 = r2 - r1
            r4.label = r2
        L12:
            java.lang.Object r1 = r4.result
            X.Hji r3 = X.EnumC10460Hji.A02
            int r0 = r4.label
            r2 = 1
            if (r0 == 0) goto L2d
            if (r0 != r2) goto L28
            goto L24
        L1e:
            com.facebook.aura.pairs.ConnectionsRuleEditorViewModel$readRules$1 r4 = new com.facebook.aura.pairs.ConnectionsRuleEditorViewModel$readRules$1
            r4.<init>(r6)
            goto L12
        L24:
            X.Hwg.A00(r1)     // Catch: com.facebook.aura.pairs.PairsException -> L3e java.util.concurrent.CancellationException -> L4c
            return r1
        L28:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        L2d:
            X.Hwg.A00(r1)
            com.facebook.aura.pairs.PairsRepository r1 = r5.repository     // Catch: com.facebook.aura.pairs.PairsException -> L3e java.util.concurrent.CancellationException -> L4c
            java.lang.String r0 = r5.connectionId     // Catch: com.facebook.aura.pairs.PairsException -> L3e java.util.concurrent.CancellationException -> L4c
            r4.label = r2     // Catch: com.facebook.aura.pairs.PairsException -> L3e java.util.concurrent.CancellationException -> L4c
            java.lang.Object r1 = r1.canonicalRulesFor(r0, r4)     // Catch: com.facebook.aura.pairs.PairsException -> L3e java.util.concurrent.CancellationException -> L4c
            if (r1 != r3) goto L3d
            return r3
        L3d:
            return r1
        L3e:
            r0 = move-exception
            java.lang.Object[] r2 = X.C60Q.A1Z(r0)
            java.lang.String r1 = "ConnectionsRuleEditorViewModel"
            java.lang.String r0 = "rule editor load failed: %s"
            X.CFK.A0H(r1, r0, r2)
            r0 = 0
            return r0
        L4c:
            r0 = move-exception
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.pairs.ConnectionsRuleEditorViewModel.readRules(X.HtJ):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:34:0x009e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object reconcile(X.HtJ<? super kotlin.Unit> r18) {
        /*
            r17 = this;
            r3 = r18
            boolean r0 = r3 instanceof com.facebook.aura.pairs.ConnectionsRuleEditorViewModel.C128331
            r5 = r17
            if (r0 == 0) goto L9e
            r6 = r3
            com.facebook.aura.pairs.ConnectionsRuleEditorViewModel$reconcile$1 r6 = (com.facebook.aura.pairs.ConnectionsRuleEditorViewModel.C128331) r6
            int r2 = r6.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L9e
            int r2 = r2 - r1
            r6.label = r2
        L16:
            java.lang.Object r4 = r6.result
            X.Hji r1 = X.EnumC10460Hji.A02
            int r0 = r6.label
            r3 = 1
            if (r0 == 0) goto L92
            if (r0 != r3) goto La5
            X.Hwg.A00(r4)
        L24:
            com.facebook.aura.pairs.ConnectionsCanonicalRules r4 = (com.facebook.aura.pairs.ConnectionsCanonicalRules) r4
            if (r4 != 0) goto L33
            com.facebook.aura.toast.api.ToastApi r1 = com.facebook.aura.toast.api.ToastApi.INSTANCE
            r0 = 2131888150(0x7f120816, float:1.9410927E38)
            r1.showToast(r0)
        L30:
            kotlin.Unit r1 = kotlin.Unit.INSTANCE
            return r1
        L33:
            long r0 = r4.revision
            java.lang.Long r0 = X.C3cG.A0S(r0)
            r5.revision = r0
            java.util.List<com.facebook.aura.pairs.ConnectionsSharingRule> r0 = r4.rules
            java.util.Iterator r6 = r0.iterator()
        L41:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L90
            java.lang.Object r2 = r6.next()
            r0 = r2
            com.facebook.aura.pairs.ConnectionsSharingRule r0 = (com.facebook.aura.pairs.ConnectionsSharingRule) r0
            java.lang.String r1 = r0.id
            java.lang.String r0 = r5.id
            boolean r0 = X.C7384Etj.areEqual(r1, r0)
            if (r0 == 0) goto L41
        L58:
            com.facebook.aura.pairs.ConnectionsSharingRule r2 = (com.facebook.aura.pairs.ConnectionsSharingRule) r2
            X.BLG<com.facebook.aura.pairs.ConnectionsRuleEditorUiState> r1 = r5._uiState
        L5c:
            java.lang.Object r6 = r1.getValue()
            r8 = r6
            com.facebook.aura.pairs.ConnectionsRuleEditorUiState r8 = (com.facebook.aura.pairs.ConnectionsRuleEditorUiState) r8
            if (r2 == 0) goto L69
            java.lang.String r14 = r2.description
            if (r14 != 0) goto L6b
        L69:
            java.lang.String r14 = r8.savedDescription
        L6b:
            java.util.Set<java.lang.String> r7 = r4.unconfirmedRuleIds
            java.lang.String r0 = r5.id
            boolean r15 = r7.contains(r0)
            com.facebook.aura.pairs.ConnectionsRuleEditorPhase r9 = r8.phase
            boolean r10 = r8.isNew
            java.lang.String r11 = r8.title
            java.lang.String r12 = r8.summary
            java.lang.String r13 = r8.description
            boolean r0 = r8.isBusy
            r18 = r2
            r17 = r3
            r16 = r0
            com.facebook.aura.pairs.ConnectionsRuleEditorUiState r0 = r8.copy(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            boolean r0 = r1.A6e(r6, r0)
            if (r0 == 0) goto L5c
            goto L30
        L90:
            r2 = 0
            goto L58
        L92:
            X.Hwg.A00(r4)
            r6.label = r3
            java.lang.Object r4 = r5.readRules(r6)
            if (r4 != r1) goto L24
            return r1
        L9e:
            com.facebook.aura.pairs.ConnectionsRuleEditorViewModel$reconcile$1 r6 = new com.facebook.aura.pairs.ConnectionsRuleEditorViewModel$reconcile$1
            r6.<init>(r3)
            goto L16
        La5:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.pairs.ConnectionsRuleEditorViewModel.reconcile(X.HtJ):java.lang.Object");
    }

    public final void delete() {
        ConnectionsRuleEditorUiState value;
        if (this.ruleId == null || this._uiState.getValue().isBusy) {
            return;
        }
        BLG<ConnectionsRuleEditorUiState> blg = this._uiState;
        do {
            value = blg.getValue();
        } while (!blg.A6e(value, ConnectionsRuleEditorUiState.copy$default(value, null, false, null, null, null, null, false, true, false, null, 895, null)));
        AnonymousClass001.A1I(AnonymousClass001.A0y(), new AnonymousClass2(null), AEu.A00(this));
    }

    public final C1BN<ConnectionsRuleEditorUiState> getUiState() {
        return this.uiState;
    }

    public final void retry() {
        ConnectionsRuleEditorUiState value;
        BLG<ConnectionsRuleEditorUiState> blg = this._uiState;
        do {
            value = blg.getValue();
        } while (!C60R.A1W(ConnectionsRuleEditorPhase.LOADING, value, value, blg));
        load();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0054  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void save() {
        /*
            r20 = this;
            r5 = r20
            X.BLG<com.facebook.aura.pairs.ConnectionsRuleEditorUiState> r0 = r5._uiState
            java.lang.Object r7 = r0.getValue()
            com.facebook.aura.pairs.ConnectionsRuleEditorUiState r7 = (com.facebook.aura.pairs.ConnectionsRuleEditorUiState) r7
            java.lang.Long r4 = r5.revision
            boolean r0 = r7.getCanSave()
            if (r0 == 0) goto L69
            if (r4 == 0) goto L69
            X.BLG<com.facebook.aura.pairs.ConnectionsRuleEditorUiState> r2 = r5._uiState
        L16:
            java.lang.Object r1 = r2.getValue()
            r8 = r1
            com.facebook.aura.pairs.ConnectionsRuleEditorUiState r8 = (com.facebook.aura.pairs.ConnectionsRuleEditorUiState) r8
            r19 = 895(0x37f, float:1.254E-42)
            r9 = 0
            r10 = 0
            r16 = 1
            r11 = r9
            r12 = r9
            r13 = r9
            r14 = r9
            r15 = r10
            r17 = r10
            r18 = r9
            r20 = r9
            com.facebook.aura.pairs.ConnectionsRuleEditorUiState r0 = com.facebook.aura.pairs.ConnectionsRuleEditorUiState.copy$default(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            boolean r0 = r2.A6e(r1, r0)
            if (r0 == 0) goto L16
            java.lang.String r6 = r5.id
            java.lang.String r2 = r7.title
            java.lang.String r1 = r7.summary
            java.lang.String r0 = r7.description
            com.facebook.aura.pairs.ConnectionsSharingRule r3 = new com.facebook.aura.pairs.ConnectionsSharingRule
            r3.<init>(r6, r2, r1, r0)
            boolean r0 = r7.isNew
            if (r0 != 0) goto L54
            java.lang.String r1 = r7.description
            java.lang.String r0 = r7.savedDescription
            boolean r0 = X.C7384Etj.areEqual(r1, r0)
            r10 = 1
            if (r0 != 0) goto L55
        L54:
            r10 = 0
        L55:
            X.BLL r2 = X.AEu.A00(r5)
            X.78T r1 = X.AnonymousClass001.A0y()
            com.facebook.aura.pairs.ConnectionsRuleEditorViewModel$save$2 r0 = new com.facebook.aura.pairs.ConnectionsRuleEditorViewModel$save$2
            r6 = r0
            r7 = r5
            r8 = r3
            r9 = r4
            r6.<init>(r8, r9, r10, r11)
            X.AnonymousClass001.A1I(r1, r0, r2)
        L69:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.pairs.ConnectionsRuleEditorViewModel.save():void");
    }

    public final void useSavedVersion() {
        ConnectionsRuleEditorUiState value;
        ConnectionsRuleEditorUiState connectionsRuleEditorUiStateCopy;
        BLG<ConnectionsRuleEditorUiState> blg = this._uiState;
        do {
            value = blg.getValue();
            connectionsRuleEditorUiStateCopy = value;
            ConnectionsSharingRule connectionsSharingRule = connectionsRuleEditorUiStateCopy.savedVersion;
            if (connectionsSharingRule != null) {
                String str = connectionsSharingRule.title;
                String str2 = connectionsSharingRule.summary;
                String str3 = connectionsSharingRule.description;
                connectionsRuleEditorUiStateCopy = connectionsRuleEditorUiStateCopy.copy(connectionsRuleEditorUiStateCopy.phase, connectionsRuleEditorUiStateCopy.isNew, str, str2, str3, str3, connectionsRuleEditorUiStateCopy.needsConfirmation, connectionsRuleEditorUiStateCopy.isBusy, false, null);
            }
        } while (!blg.A6e(value, connectionsRuleEditorUiStateCopy));
    }

    public ConnectionsRuleEditorViewModel(PairsRepository pairsRepository, String str, String str2) {
        boolean zA1b = AnonymousClass004.A1b(pairsRepository, str);
        this.repository = pairsRepository;
        this.connectionId = str;
        this.ruleId = str2;
        this.id = str2 == null ? AnonymousClass002.A0k() : str2;
        C9286GCn c9286GCnA14 = C3cG.A14(new ConnectionsRuleEditorUiState(ConnectionsRuleEditorPhase.LOADING, AnonymousClass002.A1Y(str2), "", "", "", "", zA1b, zA1b, zA1b, null));
        this._uiState = c9286GCnA14;
        this.uiState = C3cG.A11(c9286GCnA14);
        load();
    }

    private final void load() {
        AnonymousClass001.A1I(AnonymousClass001.A0y(), new AnonymousClass1(null), AEu.A00(this));
    }
}
