package com.facebook.aura.settings;

import X.A6J;
import X.AEs;
import X.AEu;
import X.AbstractC07127nr;
import X.AbstractC08429uh;
import X.AbstractC3358CGz;
import X.AnonymousClass001;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.BLG;
import X.C06H;
import X.C0881AGi;
import X.C1BN;
import X.C20Z;
import X.C3Pi;
import X.C3UX;
import X.C7384Etj;
import X.C9286GCn;
import X.C9uG;
import X.CFK;
import X.EnumC10460Hji;
import X.FGI;
import X.G0V;
import X.HtJ;
import X.Hwg;
import X.InterfaceC08439ui;
import android.app.Application;
import android.content.Context;
import com.facebook.aura.gateway.HatchGatewayConnection;
import com.facebook.aura.gateway.HatchGatewayConnectionState;
import com.facebook.aura.gateway.service.HatchGatewayServiceManager;
import com.facebook.aura.network.transport.flipper.FlipperNoiseReporter;
import com.facebook.aura.nodes.HatchNodeClient;
import com.facebook.aura.nodes.json.NodeListEntry;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* loaded from: classes.dex */
public final class HatchNodeDebugViewModel extends AEs {
    public static final int $stable = 8;
    public static final Companion Companion = new Companion();
    public static final String TAG = "HatchNodeDebugVM";
    public final BLG<HatchNodeDebugUiState> _uiState;
    public final HatchGatewayConnection gatewayConnection;
    public final HatchNodeClient nodeClient;
    public final C1BN<HatchNodeDebugUiState> uiState;
    public final AbstractC3358CGz userSession;

    @DebugMetadata(c = "com.facebook.aura.settings.HatchNodeDebugViewModel$1", f = "HatchNodeDebugViewModel.kt", l = {63}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.settings.HatchNodeDebugViewModel$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public int label;

        public AnonymousClass1(HtJ<? super AnonymousClass1> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return HatchNodeDebugViewModel.this.new AnonymousClass1(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                final HatchNodeDebugViewModel hatchNodeDebugViewModel = HatchNodeDebugViewModel.this;
                C1BN<HatchGatewayConnectionState> c1bn = hatchNodeDebugViewModel.gatewayConnection.connectionState;
                C20Z<? super HatchGatewayConnectionState> c20z = new C20Z() { // from class: com.facebook.aura.settings.HatchNodeDebugViewModel.1.1
                    @Override // X.C20Z
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, HtJ htJ) {
                        return emit((HatchGatewayConnectionState) obj2, (HtJ<? super Unit>) htJ);
                    }

                    public final Object emit(HatchGatewayConnectionState hatchGatewayConnectionState, HtJ<? super Unit> htJ) {
                        HatchNodeDebugUiState value;
                        HatchNodeDebugUiState hatchNodeDebugUiState;
                        HatchNodeDebugViewModel hatchNodeDebugViewModel2 = hatchNodeDebugViewModel;
                        BLG<HatchNodeDebugUiState> blg = hatchNodeDebugViewModel2._uiState;
                        do {
                            value = blg.getValue();
                            hatchNodeDebugUiState = value;
                        } while (!blg.A6e(value, hatchNodeDebugUiState.copy(hatchNodeDebugViewModel2.nodeClient.isRegistered(), hatchGatewayConnectionState, hatchNodeDebugUiState.registrationInfo, hatchNodeDebugUiState.allCommandSpecs, hatchNodeDebugUiState.remoteNodes, hatchNodeDebugUiState.isLoadingRemoteNodes)));
                        return Unit.INSTANCE;
                    }
                };
                this.label = 1;
                if (c1bn.collect(c20z, this) == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
            }
            throw new KotlinNothingValueException();
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return HatchNodeDebugViewModel.this.new AnonymousClass1(htJ).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* loaded from: classes2.dex */
    public final class Factory implements InterfaceC08439ui {
        public static final int $stable = 8;
        public final Context context;
        public final AbstractC3358CGz userSession;

        @Override // X.InterfaceC08439ui
        public <T extends AEs> T create(Class<T> cls) {
            Context applicationContext = this.context.getApplicationContext();
            C7384Etj.A0Z(applicationContext, "null cannot be cast to non-null type android.app.Application");
            return new HatchNodeDebugViewModel((Application) applicationContext, this.userSession);
        }

        public Factory(Context context, AbstractC3358CGz abstractC3358CGz) {
            AnonymousClass003.A0u(context, abstractC3358CGz);
            this.context = context;
            this.userSession = abstractC3358CGz;
        }

        @Override // X.InterfaceC08439ui
        public /* bridge */ <T extends AEs> T create(C9uG<T> c9uG, A6J a6j) {
            return (T) AbstractC08429uh.A00(this, a6j, c9uG);
        }

        @Override // X.InterfaceC08439ui
        public /* bridge */ <T extends AEs> T create(Class<T> cls, A6J a6j) {
            return (T) AbstractC08429uh.A01(this, cls);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.settings.HatchNodeDebugViewModel$fetchRemoteNodes$1", f = "HatchNodeDebugViewModel.kt", l = {89}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.settings.HatchNodeDebugViewModel$fetchRemoteNodes$1, reason: invalid class name and case insensitive filesystem */
    public final class C135581 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public int label;

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            HatchNodeDebugUiState value;
            HatchNodeDebugUiState hatchNodeDebugUiState;
            HatchNodeDebugUiState value2;
            HatchNodeDebugUiState hatchNodeDebugUiState2;
            HatchNodeDebugUiState value3;
            HatchNodeDebugUiState hatchNodeDebugUiState3;
            Object objListNodes = obj;
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            try {
                if (i == 0) {
                    Hwg.A00(obj);
                    BLG<HatchNodeDebugUiState> blg = HatchNodeDebugViewModel.this._uiState;
                    do {
                        value2 = blg.getValue();
                        hatchNodeDebugUiState2 = value2;
                    } while (!blg.A6e(value2, hatchNodeDebugUiState2.copy(hatchNodeDebugUiState2.isRegistered, hatchNodeDebugUiState2.connectionState, hatchNodeDebugUiState2.registrationInfo, hatchNodeDebugUiState2.allCommandSpecs, hatchNodeDebugUiState2.remoteNodes, true)));
                    HatchNodeClient hatchNodeClient = HatchNodeDebugViewModel.this.nodeClient;
                    this.label = 1;
                    objListNodes = hatchNodeClient.listNodes(this);
                    if (objListNodes == enumC10460Hji) {
                        return enumC10460Hji;
                    }
                } else {
                    if (i != 1) {
                        throw AnonymousClass001.A0n();
                    }
                    Hwg.A00(obj);
                }
                List<NodeListEntry> list = (List) objListNodes;
                BLG<HatchNodeDebugUiState> blg2 = HatchNodeDebugViewModel.this._uiState;
                do {
                    value3 = blg2.getValue();
                    hatchNodeDebugUiState3 = value3;
                } while (!blg2.A6e(value3, hatchNodeDebugUiState3.copy(hatchNodeDebugUiState3.isRegistered, hatchNodeDebugUiState3.connectionState, hatchNodeDebugUiState3.registrationInfo, hatchNodeDebugUiState3.allCommandSpecs, list, false)));
            } catch (Exception e) {
                CFK.A04(HatchNodeDebugViewModel.TAG, FGI.A0M("Failed to fetch remote nodes: ", e.getMessage()));
                BLG<HatchNodeDebugUiState> blg3 = HatchNodeDebugViewModel.this._uiState;
                do {
                    value = blg3.getValue();
                    hatchNodeDebugUiState = value;
                } while (!blg3.A6e(value, hatchNodeDebugUiState.copy(hatchNodeDebugUiState.isRegistered, hatchNodeDebugUiState.connectionState, hatchNodeDebugUiState.registrationInfo, hatchNodeDebugUiState.allCommandSpecs, hatchNodeDebugUiState.remoteNodes, false)));
            }
            return Unit.INSTANCE;
        }

        public C135581(HtJ<? super C135581> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return HatchNodeDebugViewModel.this.new C135581(htJ);
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return HatchNodeDebugViewModel.this.new C135581(htJ).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.settings.HatchNodeDebugViewModel$unpairNode$1", f = "HatchNodeDebugViewModel.kt", l = {FlipperNoiseReporter.SWITCHING_PROTOCOLS_STATUS_CODE}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.settings.HatchNodeDebugViewModel$unpairNode$1, reason: invalid class name and case insensitive filesystem */
    public final class C135591 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public int label;

        public C135591(HtJ<? super C135591> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return HatchNodeDebugViewModel.this.new C135591(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            HatchNodeDebugUiState value;
            HatchNodeDebugUiState hatchNodeDebugUiState;
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                HatchNodeClient hatchNodeClient = HatchNodeDebugViewModel.this.nodeClient;
                this.label = 1;
                obj = hatchNodeClient.unpair(this);
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
                HatchNodeDebugViewModel hatchNodeDebugViewModel = HatchNodeDebugViewModel.this;
                BLG<HatchNodeDebugUiState> blg = hatchNodeDebugViewModel._uiState;
                do {
                    value = blg.getValue();
                    hatchNodeDebugUiState = value;
                } while (!blg.A6e(value, hatchNodeDebugUiState.copy(false, hatchNodeDebugUiState.connectionState, hatchNodeDebugViewModel.nodeClient.getRegistrationInfo(), hatchNodeDebugUiState.allCommandSpecs, hatchNodeDebugUiState.remoteNodes, hatchNodeDebugUiState.isLoadingRemoteNodes)));
            }
            return Unit.INSTANCE;
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return HatchNodeDebugViewModel.this.new C135591(htJ).invokeSuspend(Unit.INSTANCE);
        }
    }

    public final C1BN<HatchNodeDebugUiState> getUiState() {
        return this.uiState;
    }

    public final void refreshRegistrationInfo() {
        HatchNodeDebugUiState value;
        HatchNodeDebugUiState hatchNodeDebugUiState;
        BLG<HatchNodeDebugUiState> blg = this._uiState;
        do {
            value = blg.getValue();
            hatchNodeDebugUiState = value;
        } while (!blg.A6e(value, hatchNodeDebugUiState.copy(this.nodeClient.isRegistered(), hatchNodeDebugUiState.connectionState, this.nodeClient.getRegistrationInfo(), hatchNodeDebugUiState.allCommandSpecs, hatchNodeDebugUiState.remoteNodes, hatchNodeDebugUiState.isLoadingRemoteNodes)));
    }

    public final class Companion {
        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public HatchNodeDebugViewModel(Application application, AbstractC3358CGz abstractC3358CGz) {
        boolean zA1b = AnonymousClass004.A1b(application, abstractC3358CGz);
        this.userSession = abstractC3358CGz;
        HatchGatewayServiceManager hatchGatewayServiceManager = HatchGatewayServiceManager.INSTANCE;
        HatchGatewayConnection companion = HatchGatewayConnection.Companion.getInstance(abstractC3358CGz);
        this.gatewayConnection = companion;
        HatchNodeClient companion2 = HatchNodeClient.Companion.getInstance(abstractC3358CGz, application);
        this.nodeClient = companion2;
        C9286GCn c9286GCn = new C9286GCn(new HatchNodeDebugUiState(companion2.isRegistered(), companion.connectionState.getValue(), companion2.getRegistrationInfo(), companion2.getAllCommandSpecs(), C0881AGi.A00, zA1b));
        this._uiState = c9286GCn;
        this.uiState = new C3Pi(null, c9286GCn);
        AnonymousClass001.A1J(new AnonymousClass1(null), AEu.A00(this));
    }

    public final void fetchRemoteNodes() {
        AnonymousClass001.A1J(new C135581(null), AEu.A00(this));
    }

    public final void unpairNode() {
        AnonymousClass001.A1J(new C135591(null), AEu.A00(this));
    }
}
