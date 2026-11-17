package com.facebook.aura.pairs;

import X.AEs;
import X.AEu;
import X.AbstractC07127nr;
import X.AbstractC3358CGz;
import X.AnonymousClass001;
import X.AnonymousClass003;
import X.BLG;
import X.C1BN;
import X.C20Q;
import X.C20Z;
import X.C3UX;
import X.C3cG;
import X.C9286GCn;
import X.EnumC10460Hji;
import X.G0V;
import X.HtJ;
import X.Hwg;
import com.facebook.aura.common.mvvm.AuraViewModelFactory;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* loaded from: classes3.dex */
public final class ConnectionsInfoViewModel extends AEs {
    public static final int $stable = 8;
    public final BLG<ConnectionsInfo> _info;
    public final C1BN<ConnectionsInfo> info;
    public final String museId;
    public final PairsRepository repository;

    @DebugMetadata(c = "com.facebook.aura.pairs.ConnectionsInfoViewModel$1", f = "ConnectionsInfoViewModel.kt", l = {27}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.pairs.ConnectionsInfoViewModel$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public int label;

        /* renamed from: com.facebook.aura.pairs.ConnectionsInfoViewModel$1$1, reason: invalid class name and collision with other inner class name */
        public final class C02711<T> implements C20Z {
            public final /* synthetic */ ConnectionsInfoViewModel this$0;

            public C02711(ConnectionsInfoViewModel connectionsInfoViewModel) {
                this.this$0 = connectionsInfoViewModel;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:11:0x0022  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(kotlin.Unit r8, X.HtJ<? super kotlin.Unit> r9) throws java.lang.Throwable {
                /*
                    r7 = this;
                    boolean r0 = r9 instanceof com.facebook.aura.pairs.ConnectionsInfoViewModel$1$1$emit$1
                    if (r0 == 0) goto L22
                    r6 = r9
                    com.facebook.aura.pairs.ConnectionsInfoViewModel$1$1$emit$1 r6 = (com.facebook.aura.pairs.ConnectionsInfoViewModel$1$1$emit$1) r6
                    int r2 = r6.label
                    r1 = -2147483648(0xffffffff80000000, float:-0.0)
                    r0 = r2 & r1
                    if (r0 == 0) goto L22
                    int r2 = r2 - r1
                    r6.label = r2
                L12:
                    java.lang.Object r0 = r6.result
                    X.Hji r5 = X.EnumC10460Hji.A02
                    int r1 = r6.label
                    r4 = 1
                    if (r1 == 0) goto L2d
                    if (r1 != r4) goto L28
                    java.lang.Object r3 = r6.L$1
                    X.BLG r3 = (X.BLG) r3
                    goto L46
                L22:
                    com.facebook.aura.pairs.ConnectionsInfoViewModel$1$1$emit$1 r6 = new com.facebook.aura.pairs.ConnectionsInfoViewModel$1$1$emit$1
                    r6.<init>(r7, r9)
                    goto L12
                L28:
                    java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
                    throw r0
                L2d:
                    X.Hwg.A00(r0)
                    com.facebook.aura.pairs.ConnectionsInfoViewModel r0 = r7.this$0     // Catch: com.facebook.aura.pairs.PairsException -> L4d java.util.concurrent.CancellationException -> L5c
                    X.BLG<com.facebook.aura.pairs.ConnectionsInfo> r3 = r0._info     // Catch: com.facebook.aura.pairs.PairsException -> L4d java.util.concurrent.CancellationException -> L5c
                    com.facebook.aura.pairs.PairsRepository r2 = r0.repository     // Catch: com.facebook.aura.pairs.PairsException -> L4d java.util.concurrent.CancellationException -> L5c
                    java.lang.String r1 = r0.museId     // Catch: com.facebook.aura.pairs.PairsException -> L4d java.util.concurrent.CancellationException -> L5c
                    r0 = 0
                    r6.L$0 = r0     // Catch: com.facebook.aura.pairs.PairsException -> L4d java.util.concurrent.CancellationException -> L5c
                    r6.L$1 = r3     // Catch: com.facebook.aura.pairs.PairsException -> L4d java.util.concurrent.CancellationException -> L5c
                    r6.label = r4     // Catch: com.facebook.aura.pairs.PairsException -> L4d java.util.concurrent.CancellationException -> L5c
                    java.lang.Object r0 = r2.connectionInfo(r1, r6)     // Catch: com.facebook.aura.pairs.PairsException -> L4d java.util.concurrent.CancellationException -> L5c
                    if (r0 != r5) goto L49
                    return r5
                L46:
                    X.Hwg.A00(r0)     // Catch: com.facebook.aura.pairs.PairsException -> L4d java.util.concurrent.CancellationException -> L5c
                L49:
                    r3.Af8(r0)     // Catch: com.facebook.aura.pairs.PairsException -> L4d java.util.concurrent.CancellationException -> L5c
                    goto L59
                L4d:
                    r0 = move-exception
                    java.lang.Object[] r2 = X.C60Q.A1Z(r0)
                    java.lang.String r1 = "ConnectionsInfoViewModel"
                    java.lang.String r0 = "connection info unavailable: %s"
                    X.CFK.A0H(r1, r0, r2)
                L59:
                    kotlin.Unit r5 = kotlin.Unit.INSTANCE
                    return r5
                L5c:
                    r0 = move-exception
                    throw r0
                */
                throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.pairs.ConnectionsInfoViewModel.AnonymousClass1.C02711.emit(kotlin.Unit, X.HtJ):java.lang.Object");
            }

            @Override // X.C20Z
            public /* bridge */ /* synthetic */ Object emit(Object obj, HtJ htJ) {
                return emit((Unit) obj, (HtJ<? super Unit>) htJ);
            }
        }

        public AnonymousClass1(HtJ<? super AnonymousClass1> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return ConnectionsInfoViewModel.this.new AnonymousClass1(htJ);
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ConnectionsInfoViewModel.this.new AnonymousClass1(htJ).invokeSuspend(Unit.INSTANCE);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                ConnectionsInfoViewModel connectionsInfoViewModel = ConnectionsInfoViewModel.this;
                C20Q<Unit> c20q = connectionsInfoViewModel.repository.changes;
                C02711 c02711 = new C02711(connectionsInfoViewModel);
                this.label = 1;
                if (c20q.collect(c02711, this) == enumC10460Hji) {
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

    public final class Factory extends AuraViewModelFactory<ConnectionsInfoViewModel> {
        public static final int $stable = 8;
        public final String museId;
        public final AbstractC3358CGz userSession;

        @Override // com.facebook.aura.common.mvvm.AuraViewModelFactory
        public ConnectionsInfoViewModel create() {
            return new ConnectionsInfoViewModel(PairsRepository.Companion.getInstance(this.userSession), this.museId);
        }

        public Factory(AbstractC3358CGz abstractC3358CGz, String str) {
            AnonymousClass003.A0u(abstractC3358CGz, str);
            this.userSession = abstractC3358CGz;
            this.museId = str;
        }
    }

    public final C1BN<ConnectionsInfo> getInfo() {
        return this.info;
    }

    public ConnectionsInfoViewModel(PairsRepository pairsRepository, String str) {
        AnonymousClass003.A0u(pairsRepository, str);
        this.repository = pairsRepository;
        this.museId = str;
        C9286GCn c9286GCnA13 = C3cG.A13();
        this._info = c9286GCnA13;
        this.info = C3cG.A11(c9286GCnA13);
        AnonymousClass001.A1I(AnonymousClass001.A0y(), new AnonymousClass1(null), AEu.A00(this));
    }
}
