package com.facebook.aura.pairs;

import X.AEs;
import X.AEu;
import X.AbstractC07127nr;
import X.AbstractC3358CGz;
import X.AnonymousClass001;
import X.AnonymousClass003;
import X.BLG;
import X.C1BN;
import X.C3UX;
import X.C3cG;
import X.C60Q;
import X.C9286GCn;
import X.CFK;
import X.EnumC10460Hji;
import X.G0V;
import X.HnJ;
import X.HtJ;
import X.Hwg;
import com.facebook.aura.common.mvvm.AuraViewModelFactory;
import com.facebook.aura.pairs.ConnectionsReceivedItemUiState;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.maplibre.android.R;

/* loaded from: classes3.dex */
public final class ConnectionsReceivedItemViewModel extends AEs {
    public static final int $stable = 8;
    public final BLG<ConnectionsReceivedItemUiState> _uiState;
    public final PairsRepository repository;
    public final String shareId;
    public final C1BN<ConnectionsReceivedItemUiState> uiState;

    @DebugMetadata(c = "com.facebook.aura.pairs.ConnectionsReceivedItemViewModel$1", f = "ConnectionsReceivedItemViewModel.kt", l = {R.styleable.maplibre_MapView_maplibre_uiCompassMarginRight}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.pairs.ConnectionsReceivedItemViewModel$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public Object L$0;
        public Object L$1;
        public int label;

        public AnonymousClass1(HtJ<? super AnonymousClass1> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return ConnectionsReceivedItemViewModel.this.new AnonymousClass1(htJ);
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ConnectionsReceivedItemViewModel.this.new AnonymousClass1(htJ).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Not initialized variable reg: 3, insn: 0x004e: MOVE (r1 I:??[OBJECT, ARRAY]) = (r3 I:??[OBJECT, ARRAY]) (LINE:78), block:B:18:0x0041 */
        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            ConnectionsReceivedItemUiState loaded;
            BLG<ConnectionsReceivedItemUiState> blg;
            BLG<ConnectionsReceivedItemUiState> blg2;
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            try {
                if (i == 0) {
                    Hwg.A00(obj);
                    ConnectionsReceivedItemViewModel connectionsReceivedItemViewModel = ConnectionsReceivedItemViewModel.this;
                    BLG<ConnectionsReceivedItemUiState> blg3 = connectionsReceivedItemViewModel._uiState;
                    PairsRepository pairsRepository = connectionsReceivedItemViewModel.repository;
                    String str = connectionsReceivedItemViewModel.shareId;
                    this.L$0 = blg3;
                    this.L$1 = blg3;
                    this.label = 1;
                    obj = pairsRepository.receivedItem(str, this);
                    if (obj == enumC10460Hji) {
                        return enumC10460Hji;
                    }
                    blg2 = blg3;
                } else {
                    if (i != 1) {
                        throw AnonymousClass001.A0n();
                    }
                    blg2 = (BLG) this.L$1;
                    Hwg.A00(obj);
                }
                ConnectionsReceivedItem connectionsReceivedItem = (ConnectionsReceivedItem) obj;
                loaded = connectionsReceivedItem != null ? new ConnectionsReceivedItemUiState.Loaded(connectionsReceivedItem) : ConnectionsReceivedItemUiState.Failed.INSTANCE;
            } catch (PairsException e) {
                CFK.A0H(ConnectionsReceivedItemViewModelKt.TAG, "received item read failed: %s", C60Q.A1Z(e));
                loaded = ConnectionsReceivedItemUiState.Failed.INSTANCE;
                blg2 = blg;
            } catch (CancellationException e2) {
                throw e2;
            }
            blg2.Af8(loaded);
            return Unit.INSTANCE;
        }
    }

    public final class Factory extends AuraViewModelFactory<ConnectionsReceivedItemViewModel> {
        public static final int $stable = 8;
        public final String shareId;
        public final AbstractC3358CGz userSession;

        @Override // com.facebook.aura.common.mvvm.AuraViewModelFactory
        public ConnectionsReceivedItemViewModel create() {
            return new ConnectionsReceivedItemViewModel(PairsRepository.Companion.getInstance(this.userSession), this.shareId);
        }

        public Factory(AbstractC3358CGz abstractC3358CGz, String str) {
            AnonymousClass003.A0u(abstractC3358CGz, str);
            this.userSession = abstractC3358CGz;
            this.shareId = str;
        }
    }

    public final C1BN<ConnectionsReceivedItemUiState> getUiState() {
        return this.uiState;
    }

    public ConnectionsReceivedItemViewModel(PairsRepository pairsRepository, String str) {
        AnonymousClass003.A0u(pairsRepository, str);
        this.repository = pairsRepository;
        this.shareId = str;
        C9286GCn c9286GCnA01 = HnJ.A01(ConnectionsReceivedItemUiState.Loading.INSTANCE);
        this._uiState = c9286GCnA01;
        this.uiState = C3cG.A11(c9286GCnA01);
        AnonymousClass001.A1I(AnonymousClass001.A0y(), new AnonymousClass1(null), AEu.A00(this));
    }
}
