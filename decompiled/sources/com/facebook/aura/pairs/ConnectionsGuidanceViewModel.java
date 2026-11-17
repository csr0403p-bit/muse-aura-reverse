package com.facebook.aura.pairs;

import X.A3q;
import X.AEs;
import X.AEu;
import X.AGI;
import X.AHD;
import X.AHI;
import X.AbstractC07127nr;
import X.AbstractC3358CGz;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass006;
import X.BGK;
import X.BLG;
import X.BQI;
import X.C0943AIw;
import X.C1BN;
import X.C20Q;
import X.C20Z;
import X.C3UX;
import X.C3cG;
import X.C7384Etj;
import X.C9286GCn;
import X.EnumC10460Hji;
import X.G0V;
import X.HnJ;
import X.HtJ;
import X.Hwg;
import X.HzP;
import com.facebook.acra.util.minidump.MinidumpReader;
import com.facebook.aura.R;
import com.facebook.aura.common.mvvm.AuraViewModelFactory;
import com.facebook.aura.toast.api.ToastApi;
import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* loaded from: classes3.dex */
public final class ConnectionsGuidanceViewModel extends AEs {
    public static final int $stable = 8;
    public final BLG<ConnectionsGuidanceUiState> _uiState;
    public final String groupConnectionId;
    public final String museId;
    public final BLG<Set<String>> removedIds;
    public final PairsRepository repository;
    public final ConnectionsTabStore tabStore;
    public final C1BN<ConnectionsGuidanceUiState> uiState;

    @DebugMetadata(c = "com.facebook.aura.pairs.ConnectionsGuidanceViewModel$1", f = "ConnectionsGuidanceViewModel.kt", l = {48}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.pairs.ConnectionsGuidanceViewModel$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public int label;

        public AnonymousClass1(HtJ<? super AnonymousClass1> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return ConnectionsGuidanceViewModel.this.new AnonymousClass1(htJ);
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ConnectionsGuidanceViewModel.this.new AnonymousClass1(htJ).invokeSuspend(Unit.INSTANCE);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                final ConnectionsGuidanceViewModel connectionsGuidanceViewModel = ConnectionsGuidanceViewModel.this;
                C20Q<Unit> c20q = connectionsGuidanceViewModel.repository.changes;
                C20Z<? super Unit> c20z = new C20Z() { // from class: com.facebook.aura.pairs.ConnectionsGuidanceViewModel.1.1
                    public final Object emit(Unit unit, HtJ<? super Unit> htJ) {
                        return C3cG.A0U(connectionsGuidanceViewModel.load(htJ));
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

    public final class Factory extends AuraViewModelFactory<ConnectionsGuidanceViewModel> {
        public static final int $stable = 8;
        public final String groupConnectionId;
        public final String museId;
        public final AbstractC3358CGz userSession;

        public Factory(AbstractC3358CGz abstractC3358CGz, String str, String str2) {
            C7384Etj.A0Y(abstractC3358CGz, 0);
            this.userSession = abstractC3358CGz;
            this.museId = str;
            this.groupConnectionId = str2;
        }

        @Override // com.facebook.aura.common.mvvm.AuraViewModelFactory
        public ConnectionsGuidanceViewModel create() {
            return new ConnectionsGuidanceViewModel(PairsRepository.Companion.getInstance(this.userSession), ConnectionsTabStore.Companion.getInstance(this.userSession), this.museId, this.groupConnectionId);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.pairs.ConnectionsGuidanceViewModel", f = "ConnectionsGuidanceViewModel.kt", l = {80, 81, 96, MinidumpReader.MODULE_FULL_SIZE}, m = "load", v = 2)
    /* renamed from: com.facebook.aura.pairs.ConnectionsGuidanceViewModel$load$1, reason: invalid class name and case insensitive filesystem */
    public final class C128271 extends HzP {
        public Object L$0;
        public int label;
        public /* synthetic */ Object result;

        public C128271(HtJ<? super C128271> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ConnectionsGuidanceViewModel.this.load(this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.pairs.ConnectionsGuidanceViewModel$remove$1", f = "ConnectionsGuidanceViewModel.kt", l = {57}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.pairs.ConnectionsGuidanceViewModel$remove$1, reason: invalid class name and case insensitive filesystem */
    public final class C128281 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ ConnectionsSharingRule $rule;
        public Object L$0;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C128281(ConnectionsSharingRule connectionsSharingRule, HtJ<? super C128281> htJ) {
            super(2, htJ);
            this.$rule = connectionsSharingRule;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return ConnectionsGuidanceViewModel.this.new C128281(this.$rule, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            ConnectionsGuidanceViewModel connectionsGuidanceViewModel;
            Set<String> value;
            ConnectionsGuidanceUiState value2;
            ConnectionsGuidanceUiState connectionsGuidanceUiState;
            ArrayList arrayListA0h;
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            try {
                try {
                    if (i == 0) {
                        Hwg.A00(obj);
                        String str = ConnectionsGuidanceViewModel.this._uiState.getValue().connectionId;
                        if (str == null && (str = (connectionsGuidanceViewModel = ConnectionsGuidanceViewModel.this).groupConnectionId) == null && (str = connectionsGuidanceViewModel.museId) == null) {
                            Unit unit = Unit.INSTANCE;
                            connectionsGuidanceViewModel.setBusy(this.$rule.id, false);
                            return unit;
                        }
                        PairsRepository pairsRepository = ConnectionsGuidanceViewModel.this.repository;
                        String str2 = this.$rule.id;
                        this.L$0 = null;
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
                    BLG<Set<String>> blg = ConnectionsGuidanceViewModel.this.removedIds;
                    ConnectionsSharingRule connectionsSharingRule = this.$rule;
                    do {
                        value = blg.getValue();
                    } while (!blg.A6e(value, BGK.A02(connectionsSharingRule.id, value)));
                    BLG<ConnectionsGuidanceUiState> blg2 = ConnectionsGuidanceViewModel.this._uiState;
                    ConnectionsSharingRule connectionsSharingRule2 = this.$rule;
                    do {
                        value2 = blg2.getValue();
                        connectionsGuidanceUiState = value2;
                        AHD<ConnectionsSharingRule> ahd = connectionsGuidanceUiState.rules;
                        arrayListA0h = C3cG.A0h();
                        for (Object obj2 : ahd) {
                            AnonymousClass006.A1O(((ConnectionsSharingRule) obj2).id, connectionsSharingRule2.id, obj2, arrayListA0h);
                        }
                    } while (!blg2.A6e(value2, new ConnectionsGuidanceUiState(AGI.A07(arrayListA0h), connectionsGuidanceUiState.busyIds, connectionsGuidanceUiState.connectionId, connectionsGuidanceUiState.canEdit, false)));
                } catch (PairsException unused) {
                    ToastApi.INSTANCE.showToast(R.string._name_removed__res_0x7f120814);
                } catch (CancellationException e) {
                    throw e;
                }
                ConnectionsGuidanceViewModel.this.setBusy(this.$rule.id, false);
                return Unit.INSTANCE;
            } catch (Throwable th) {
                ConnectionsGuidanceViewModel.this.setBusy(this.$rule.id, false);
                throw th;
            }
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ((C128281) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    public ConnectionsGuidanceViewModel(PairsRepository pairsRepository, ConnectionsTabStore connectionsTabStore, String str, String str2) {
        boolean zA1a = AnonymousClass002.A1a(pairsRepository, connectionsTabStore);
        this.repository = pairsRepository;
        this.tabStore = connectionsTabStore;
        this.museId = str;
        this.groupConnectionId = str2;
        C9286GCn c9286GCnA14 = C3cG.A14(new ConnectionsGuidanceUiState(AHI.A01, C0943AIw.A03, null, zA1a, false));
        this._uiState = c9286GCnA14;
        this.uiState = C3cG.A11(c9286GCnA14);
        this.removedIds = HnJ.A01(A3q.A00);
        AnonymousClass001.A1I(AnonymousClass001.A0y(), new AnonymousClass1(null), AEu.A00(this));
    }

    public final void remove(ConnectionsSharingRule connectionsSharingRule) {
        C7384Etj.A0Y(connectionsSharingRule, 0);
        if (this._uiState.getValue().busyIds.contains(connectionsSharingRule.id)) {
            return;
        }
        setBusy(connectionsSharingRule.id, true);
        AnonymousClass001.A1I(AnonymousClass001.A0y(), new C128281(connectionsSharingRule, null), AEu.A00(this));
    }

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[PairsError.values().length];
            try {
                AnonymousClass002.A13(PairsError.UNAVAILABLE, iArr);
            } catch (NoSuchFieldError unused) {
            }
            try {
                AnonymousClass002.A14(PairsError.NOT_FOUND, iArr);
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x009a A[LOOP:0: B:41:0x0094->B:43:0x009a, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0155 A[LOOP:4: B:72:0x014f->B:74:0x0155, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0179  */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v19 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v20 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object load(X.HtJ<? super kotlin.Unit> r16) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 393
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.pairs.ConnectionsGuidanceViewModel.load(X.HtJ):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setBusy(String str, boolean z) {
        ConnectionsGuidanceUiState value;
        ConnectionsGuidanceUiState connectionsGuidanceUiState;
        BQI<String> bqi;
        BLG<ConnectionsGuidanceUiState> blg = this._uiState;
        do {
            value = blg.getValue();
            connectionsGuidanceUiState = value;
            bqi = connectionsGuidanceUiState.busyIds;
        } while (!blg.A6e(value, new ConnectionsGuidanceUiState(connectionsGuidanceUiState.rules, AGI.A09(z ? BGK.A02(str, bqi) : BGK.A04(str, bqi)), connectionsGuidanceUiState.connectionId, connectionsGuidanceUiState.canEdit, false)));
    }

    public final C1BN<ConnectionsGuidanceUiState> getUiState() {
        return this.uiState;
    }
}
