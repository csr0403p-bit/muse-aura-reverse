package com.facebook.aura.settings;

import X.A6J;
import X.AEs;
import X.AEu;
import X.AbstractC07127nr;
import X.AbstractC08429uh;
import X.AbstractC0878AGe;
import X.AbstractC3358CGz;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass006;
import X.AnonymousClass441;
import X.AnonymousClass603;
import X.BGK;
import X.BLG;
import X.BLL;
import X.C06G;
import X.C06H;
import X.C0881AGi;
import X.C0KA;
import X.C1BN;
import X.C20Q;
import X.C20Z;
import X.C22I;
import X.C3Em;
import X.C3Es;
import X.C3Pi;
import X.C3UX;
import X.C3cF;
import X.C3pd;
import X.C3rb;
import X.C60I;
import X.C6ys;
import X.C7384Etj;
import X.C79;
import X.C9286GCn;
import X.C9290GCr;
import X.C9uG;
import X.CFK;
import X.EnumC10460Hji;
import X.FGI;
import X.G0U;
import X.G0V;
import X.GAo;
import X.HnJ;
import X.HoC;
import X.HtJ;
import X.Hwg;
import X.HzP;
import X.InterfaceC08439ui;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import com.facebook.aura.activation.view.InviteCodeScratcherKt;
import com.facebook.aura.common.identifiers.AuraDeviceId;
import com.facebook.aura.common.prefs.HatchDeveloperMode;
import com.facebook.aura.devices.intf.CommunityDeviceRemover;
import com.facebook.aura.devices.intf.ConnectedDeviceRow;
import com.facebook.aura.devices.intf.ConnectedDeviceRows;
import com.facebook.aura.devices.pairing.LinkEncryptedPairingKt;
import com.facebook.aura.devices.token.LinkDeviceKeyRevocationRetrier;
import com.facebook.aura.gateway.HatchGatewayConnection;
import com.facebook.aura.gateway.HatchGatewayConnectionState;
import com.facebook.aura.gateway.JarvisUtils;
import com.facebook.aura.gateway.service.HatchForegroundService;
import com.facebook.aura.gateway.service.HatchGatewayServiceManager;
import com.facebook.aura.gateway.store.HatchGatewayPrefsStore;
import com.facebook.aura.gateway.store.LocationSharingModesKt;
import com.facebook.aura.login.nativeflow.MC;
import com.facebook.aura.nodes.HatchNodeClient;
import com.facebook.aura.nodes.json.NodeListEntry;
import com.facebook.aura.nodes.json.NodePairingStatus;
import com.facebook.aura.settings.ConnectedDevicesUiState;
import com.facebook.aura.settings.ConnectedDevicesViewEffect;
import com.facebook.aura.subscription.repo.AuraSubscriptionRepository;
import com.facebook.aura.utils.HatchUtil;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import kotlin.KotlinNothingValueException;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* loaded from: classes.dex */
public final class HatchConnectedDevicesViewModel extends AEs {
    public static final int $stable = 8;
    public static final Companion Companion = new Companion();
    public static final int PAIRING_REFRESH_ATTEMPTS = 15;
    public static final long PAIRING_REFRESH_INTERVAL_MS = 2000;
    public static final long SECTION_STOP_TIMEOUT_MS = 5000;
    public static final String TAG = "HatchConnectedDevicesVM";
    public final BLG<ConnectedDevicesUiState> _uiState;
    public final C3Em<ConnectedDevicesViewEffect> _viewEffects;
    public final Application application;
    public final HatchGatewayConnection gatewayConnection;
    public final C20Q<HomeLinkOffer> homeLinkOffers;
    public final HatchNodeClient nodeClient;
    public HoC pairingRefreshJob;
    public final C1BN<ConnectedDevicesScreenState> screenState;
    public final AuraSubscriptionRepository subscriptionRepository;
    public final C1BN<ConnectedDevicesUiState> uiState;
    public final AbstractC3358CGz userSession;
    public final C22I<ConnectedDevicesViewEffect> viewEffects;

    @DebugMetadata(c = "com.facebook.aura.settings.HatchConnectedDevicesViewModel$1", f = "HatchConnectedDevicesViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.settings.HatchConnectedDevicesViewModel$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public int label;

        public AnonymousClass1(HtJ<? super AnonymousClass1> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return HatchConnectedDevicesViewModel.this.new AnonymousClass1(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            if (this.label != 0) {
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(obj);
            LinkDeviceKeyRevocationRetrier.Companion.start(HatchConnectedDevicesViewModel.this.userSession);
            return Unit.INSTANCE;
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return HatchConnectedDevicesViewModel.this.new AnonymousClass1(htJ).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.settings.HatchConnectedDevicesViewModel$2", f = "HatchConnectedDevicesViewModel.kt", l = {240}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.settings.HatchConnectedDevicesViewModel$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public int label;

        public AnonymousClass2(HtJ<? super AnonymousClass2> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return HatchConnectedDevicesViewModel.this.new AnonymousClass2(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                C1BN<Integer> c1bn = HatchDeveloperMode.changeCount;
                final HatchConnectedDevicesViewModel hatchConnectedDevicesViewModel = HatchConnectedDevicesViewModel.this;
                C20Z<? super Integer> c20z = new C20Z() { // from class: com.facebook.aura.settings.HatchConnectedDevicesViewModel.2.1
                    @Override // X.C20Z
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, HtJ htJ) {
                        return emit(AnonymousClass001.A0F(obj2), (HtJ<? super Unit>) htJ);
                    }

                    public final Object emit(int i2, HtJ<? super Unit> htJ) {
                        ConnectedDevicesUiState value;
                        ConnectedDevicesUiState connectedDevicesUiStateCopy$default;
                        boolean zIsEnabled = HatchDeveloperMode.INSTANCE.isEnabled(hatchConnectedDevicesViewModel.userSession);
                        BLG<ConnectedDevicesUiState> blg = hatchConnectedDevicesViewModel._uiState;
                        do {
                            value = blg.getValue();
                            connectedDevicesUiStateCopy$default = value;
                            if (connectedDevicesUiStateCopy$default instanceof ConnectedDevicesUiState.Loaded) {
                                connectedDevicesUiStateCopy$default = ConnectedDevicesUiState.Loaded.copy$default((ConnectedDevicesUiState.Loaded) connectedDevicesUiStateCopy$default, null, null, null, null, null, false, false, zIsEnabled, null, 383, null);
                            }
                        } while (!blg.A6e(value, connectedDevicesUiStateCopy$default));
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
            return HatchConnectedDevicesViewModel.this.new AnonymousClass2(htJ).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.settings.HatchConnectedDevicesViewModel$3", f = "HatchConnectedDevicesViewModel.kt", l = {250}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.settings.HatchConnectedDevicesViewModel$3, reason: invalid class name */
    public final class AnonymousClass3 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public int label;

        public AnonymousClass3(HtJ<? super AnonymousClass3> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return HatchConnectedDevicesViewModel.this.new AnonymousClass3(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            try {
                if (i == 0) {
                    Hwg.A00(obj);
                    final HatchConnectedDevicesViewModel hatchConnectedDevicesViewModel = HatchConnectedDevicesViewModel.this;
                    C1BN<HatchGatewayConnectionState> c1bn = hatchConnectedDevicesViewModel.gatewayConnection.connectionState;
                    C20Z<? super HatchGatewayConnectionState> c20z = new C20Z() { // from class: com.facebook.aura.settings.HatchConnectedDevicesViewModel.3.1
                        @Override // X.C20Z
                        public /* bridge */ /* synthetic */ Object emit(Object obj2, HtJ htJ) {
                            return emit((HatchGatewayConnectionState) obj2, (HtJ<? super Unit>) htJ);
                        }

                        public final Object emit(HatchGatewayConnectionState hatchGatewayConnectionState, HtJ<? super Unit> htJ) {
                            if (hatchGatewayConnectionState instanceof HatchGatewayConnectionState.Connected) {
                                hatchConnectedDevicesViewModel.fetchDevices();
                            }
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
            } catch (Exception e) {
                CFK.A04(HatchConnectedDevicesViewModel.TAG, FGI.A0M("Connection state collection failed: ", e.getMessage()));
                return Unit.INSTANCE;
            }
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return HatchConnectedDevicesViewModel.this.new AnonymousClass3(htJ).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* loaded from: classes4.dex */
    public final class Factory implements InterfaceC08439ui {
        public static final int $stable = 8;
        public final Context context;
        public final AbstractC3358CGz userSession;

        @Override // X.InterfaceC08439ui
        public <T extends AEs> T create(Class<T> cls) {
            Context applicationContext = this.context.getApplicationContext();
            C7384Etj.A0Z(applicationContext, C3cF.A00(44));
            return new HatchConnectedDevicesViewModel((Application) applicationContext, this.userSession);
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
            return (T) InterfaceC08439ui.A00(this, cls);
        }
    }

    public final class UnpairResult extends C06G {
        public final boolean isDeviceKeyRevoked;
        public final boolean isUnpaired;

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof UnpairResult) {
                    UnpairResult unpairResult = (UnpairResult) obj;
                    if (this.isUnpaired != unpairResult.isUnpaired || this.isDeviceKeyRevoked != unpairResult.isDeviceKeyRevoked) {
                    }
                }
                return false;
            }
            return true;
        }

        public static /* synthetic */ UnpairResult copy$default(UnpairResult unpairResult, boolean z, boolean z2, int i, Object obj) {
            if ((i & 1) != 0) {
                z = unpairResult.isUnpaired;
            }
            if ((i & 2) != 0) {
                z2 = unpairResult.isDeviceKeyRevoked;
            }
            return new UnpairResult(z, z2);
        }

        public final boolean component1() {
            return this.isUnpaired;
        }

        public final boolean component2() {
            return this.isDeviceKeyRevoked;
        }

        public final UnpairResult copy(boolean z, boolean z2) {
            return new UnpairResult(z, z2);
        }

        public int hashCode() {
            return C0KA.A00(C0KA.A02(this.isUnpaired), this.isDeviceKeyRevoked);
        }

        public final boolean isComplete() {
            return this.isUnpaired && this.isDeviceKeyRevoked;
        }

        public final boolean isDeviceKeyRevoked() {
            return this.isDeviceKeyRevoked;
        }

        public final boolean isUnpaired() {
            return this.isUnpaired;
        }

        public UnpairResult(boolean z, boolean z2) {
            this.isUnpaired = z;
            this.isDeviceKeyRevoked = z2;
        }

        public String toString() {
            return super.toString();
        }
    }

    @DebugMetadata(c = "com.facebook.aura.settings.HatchConnectedDevicesViewModel$dismissDevice$1", f = "HatchConnectedDevicesViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.settings.HatchConnectedDevicesViewModel$dismissDevice$1, reason: invalid class name and case insensitive filesystem */
    public final class C134841 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ NodeListEntry $device;
        public int label;
        public final /* synthetic */ HatchConnectedDevicesViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C134841(NodeListEntry nodeListEntry, HatchConnectedDevicesViewModel hatchConnectedDevicesViewModel, HtJ<? super C134841> htJ) {
            super(2, htJ);
            this.$device = nodeListEntry;
            this.this$0 = hatchConnectedDevicesViewModel;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new C134841(this.$device, this.this$0, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            ConnectedDevicesUiState value;
            ConnectedDevicesUiState connectedDevicesUiStateCopy;
            if (this.label != 0) {
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(obj);
            CFK.A05(HatchConnectedDevicesViewModel.TAG, FGI.A0M("dismissDevice nodeId=", this.$device.nodeId));
            try {
                HatchDismissedDevicesStore.INSTANCE.dismiss(this.this$0.userSession, this.$device.nodeId);
                String strNormalizeNodeId = HatchConnectedDevicesViewModelKt.normalizeNodeId(this.$device.nodeId);
                BLG<ConnectedDevicesUiState> blg = this.this$0._uiState;
                do {
                    value = blg.getValue();
                    connectedDevicesUiStateCopy = value;
                    if (connectedDevicesUiStateCopy instanceof ConnectedDevicesUiState.Loaded) {
                        ConnectedDevicesUiState.Loaded loaded = (ConnectedDevicesUiState.Loaded) connectedDevicesUiStateCopy;
                        List<NodeListEntry> list = loaded.devices;
                        ArrayList arrayList = new ArrayList();
                        for (NodeListEntry nodeListEntry : list) {
                            AnonymousClass006.A1O(HatchConnectedDevicesViewModelKt.normalizeNodeId(nodeListEntry.nodeId), strNormalizeNodeId, nodeListEntry, arrayList);
                        }
                        connectedDevicesUiStateCopy = loaded.copy(arrayList, HatchConnectedDevicesViewModelKt.wearableCommsNodeIds(arrayList), loaded.localNodeId, loaded.permissionStates, loaded.locationMode, loaded.hasServerDevices, loaded.isDeveloperModeAvailable, loaded.isDeveloperModeEnabled, loaded.developerModeTurnOff);
                    }
                } while (!blg.A6e(value, connectedDevicesUiStateCopy));
            } catch (CancellationException e) {
                throw e;
            } catch (Exception e2) {
                CFK.A0A(HatchConnectedDevicesViewModel.TAG, FGI.A0M("dismissDevice failed for nodeId=", this.$device.nodeId), e2);
            }
            return Unit.INSTANCE;
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ((C134841) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.settings.HatchConnectedDevicesViewModel$fetchDevices$1", f = "HatchConnectedDevicesViewModel.kt", l = {262}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.settings.HatchConnectedDevicesViewModel$fetchDevices$1, reason: invalid class name and case insensitive filesystem */
    public final class C134851 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public int label;

        public C134851(HtJ<? super C134851> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return HatchConnectedDevicesViewModel.this.new C134851(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                HatchConnectedDevicesViewModel hatchConnectedDevicesViewModel = HatchConnectedDevicesViewModel.this;
                this.label = 1;
                if (hatchConnectedDevicesViewModel.loadDevices(this) == enumC10460Hji) {
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
            return HatchConnectedDevicesViewModel.this.new C134851(htJ).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.settings.HatchConnectedDevicesViewModel$initiateUnpair$1", f = "HatchConnectedDevicesViewModel.kt", l = {409}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.settings.HatchConnectedDevicesViewModel$initiateUnpair$1, reason: invalid class name and case insensitive filesystem */
    public final class C134861 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ NodeListEntry $device;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C134861(NodeListEntry nodeListEntry, HtJ<? super C134861> htJ) {
            super(2, htJ);
            this.$device = nodeListEntry;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return HatchConnectedDevicesViewModel.this.new C134861(this.$device, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                HatchConnectedDevicesViewModel hatchConnectedDevicesViewModel = HatchConnectedDevicesViewModel.this;
                NodeListEntry nodeListEntry = this.$device;
                this.label = 1;
                obj = hatchConnectedDevicesViewModel.unpairDevice(nodeListEntry, this);
                if (obj == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
            }
            UnpairResult unpairResult = (UnpairResult) obj;
            if (unpairResult.isUnpaired) {
                HatchConnectedDevicesViewModel.this.fetchDevices();
            }
            HatchConnectedDevicesViewModel.this._viewEffects.AhV(unpairResult.isComplete() ? ConnectedDevicesViewEffect.UnpairSucceeded.INSTANCE : unpairResult.isUnpaired ? ConnectedDevicesViewEffect.UnpairKeyRevokePending.INSTANCE : ConnectedDevicesViewEffect.UnpairFailed.INSTANCE);
            return Unit.INSTANCE;
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ((C134861) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.settings.HatchConnectedDevicesViewModel", f = "HatchConnectedDevicesViewModel.kt", l = {300}, m = "loadDevices", v = 2)
    /* renamed from: com.facebook.aura.settings.HatchConnectedDevicesViewModel$loadDevices$1, reason: invalid class name and case insensitive filesystem */
    public final class C134871 extends HzP {
        public Object L$0;
        public Object L$1;
        public int label;
        public /* synthetic */ Object result;

        public C134871(HtJ<? super C134871> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HatchConnectedDevicesViewModel.this.loadDevices(this);
        }
    }

    /* renamed from: com.facebook.aura.settings.HatchConnectedDevicesViewModel$loadDevices$3, reason: invalid class name and case insensitive filesystem */
    public final class C134883 extends AbstractC7559F3s implements G0U<NodeListEntry, CharSequence> {
        public static final C134883 INSTANCE = new C134883();

        public C134883() {
            super(1);
        }

        @Override // X.G0U
        public /* bridge */ /* synthetic */ CharSequence invoke(NodeListEntry nodeListEntry) {
            NodeListEntry nodeListEntry2 = nodeListEntry;
            C7384Etj.A0Y(nodeListEntry2, 0);
            return nodeListEntry2.nodeId;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final CharSequence invoke2(NodeListEntry nodeListEntry) {
            C7384Etj.A0Y(nodeListEntry, 0);
            return nodeListEntry.nodeId;
        }
    }

    @DebugMetadata(c = "com.facebook.aura.settings.HatchConnectedDevicesViewModel$markSelfRevoked$1", f = "HatchConnectedDevicesViewModel.kt", l = {556}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.settings.HatchConnectedDevicesViewModel$markSelfRevoked$1, reason: invalid class name and case insensitive filesystem */
    public final class C134891 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ NodeListEntry $device;
        public int label;
        public final /* synthetic */ HatchConnectedDevicesViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C134891(NodeListEntry nodeListEntry, HatchConnectedDevicesViewModel hatchConnectedDevicesViewModel, HtJ<? super C134891> htJ) {
            super(2, htJ);
            this.$device = nodeListEntry;
            this.this$0 = hatchConnectedDevicesViewModel;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new C134891(this.$device, this.this$0, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            try {
                if (i == 0) {
                    Hwg.A00(obj);
                    CFK.A05(HatchConnectedDevicesViewModel.TAG, FGI.A0M("markSelfRevoked nodeId=", this.$device.nodeId));
                    HatchNodeClient hatchNodeClient = this.this$0.nodeClient;
                    String str = this.$device.nodeId;
                    NodePairingStatus nodePairingStatus = NodePairingStatus.SELF_REVOKED;
                    this.label = 1;
                    if (hatchNodeClient.unpairNode(str, nodePairingStatus, this) == enumC10460Hji) {
                        return enumC10460Hji;
                    }
                } else {
                    if (i != 1) {
                        throw AnonymousClass001.A0n();
                    }
                    Hwg.A00(obj);
                }
                this.this$0.fetchDevices();
            } catch (CancellationException e) {
                throw e;
            } catch (Exception e2) {
                CFK.A0A(HatchConnectedDevicesViewModel.TAG, FGI.A0M("node.unpair self_revoked failed for nodeId=", this.$device.nodeId), e2);
            }
            return Unit.INSTANCE;
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ((C134891) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.settings.HatchConnectedDevicesViewModel$refreshDevicesAfterPairing$1", f = "HatchConnectedDevicesViewModel.kt", l = {274, 276, 277}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.settings.HatchConnectedDevicesViewModel$refreshDevicesAfterPairing$1, reason: invalid class name and case insensitive filesystem */
    public final class C134901 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public int I$0;
        public int I$1;
        public int I$2;
        public Object L$0;
        public Object L$1;
        public int label;

        public C134901(HtJ<? super C134901> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return HatchConnectedDevicesViewModel.this.new C134901(htJ);
        }

        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
        /* JADX WARN: Removed duplicated region for block: B:13:0x002c  */
        /* JADX WARN: Removed duplicated region for block: B:15:0x0030  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x009a  */
        /* JADX WARN: Removed duplicated region for block: B:32:0x00ad A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:36:? A[RETURN, SYNTHETIC] */
        /* JADX WARN: Type inference failed for: r11v5, types: [T, java.util.Set] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x00ab -> B:8:0x0020). Please report as a decompilation issue!!! */
        @Override // X.AbstractC8884Fsp
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r11) {
            /*
                r10 = this;
                X.Hji r9 = X.EnumC10460Hji.A02
                int r0 = r10.label
                r8 = 3
                r7 = 2
                java.lang.String r6 = "HatchConnectedDevicesVM"
                r2 = 1
                if (r0 == 0) goto L63
                if (r0 == r2) goto L57
                if (r0 == r7) goto L45
                if (r0 != r8) goto Lae
                int r5 = r10.I$1
                int r2 = r10.I$0
                java.lang.Object r0 = r10.L$1
                com.facebook.aura.settings.HatchConnectedDevicesViewModel r0 = (com.facebook.aura.settings.HatchConnectedDevicesViewModel) r0
                java.lang.Object r1 = r10.L$0
                X.Hqv r1 = (X.C10543Hqv) r1
                X.Hwg.A00(r11)
            L20:
                java.util.Set r11 = (java.util.Set) r11
                if (r11 == 0) goto L2c
                T r3 = r1.element
                java.lang.Iterable r3 = (java.lang.Iterable) r3
                if (r3 != 0) goto L38
                r1.element = r11
            L2c:
                int r5 = r5 + 1
                if (r5 < r2) goto L86
                java.lang.String r0 = "refreshDevicesAfterPairing poll exhausted, no new device"
            L32:
                X.CFK.A05(r6, r0)
                kotlin.Unit r9 = kotlin.Unit.INSTANCE
            L37:
                return r9
            L38:
                java.util.Set r3 = X.BGK.A03(r3, r11)
                boolean r3 = r3.isEmpty()
                if (r3 != 0) goto L2c
                java.lang.String r0 = "refreshDevicesAfterPairing new device appeared, stopping poll"
                goto L32
            L45:
                int r3 = r10.I$2
                int r5 = r10.I$1
                int r2 = r10.I$0
                java.lang.Object r0 = r10.L$1
                com.facebook.aura.settings.HatchConnectedDevicesViewModel r0 = (com.facebook.aura.settings.HatchConnectedDevicesViewModel) r0
                java.lang.Object r1 = r10.L$0
                X.Hqv r1 = (X.C10543Hqv) r1
                X.Hwg.A00(r11)
                goto L9b
            L57:
                java.lang.Object r0 = r10.L$1
                X.Hqv r0 = (X.C10543Hqv) r0
                java.lang.Object r1 = r10.L$0
                X.Hqv r1 = (X.C10543Hqv) r1
                X.Hwg.A00(r11)
                goto L7f
            L63:
                X.Hwg.A00(r11)
                java.lang.String r0 = "refreshDevicesAfterPairing start poll"
                X.CFK.A05(r6, r0)
                X.Hqv r0 = new X.Hqv
                r0.<init>()
                com.facebook.aura.settings.HatchConnectedDevicesViewModel r1 = com.facebook.aura.settings.HatchConnectedDevicesViewModel.this
                r10.L$0 = r0
                r10.L$1 = r0
                r10.label = r2
                java.lang.Object r11 = com.facebook.aura.settings.HatchConnectedDevicesViewModel.access$loadDevices(r1, r10)
                if (r11 == r9) goto L37
                r1 = r0
            L7f:
                r0.element = r11
                com.facebook.aura.settings.HatchConnectedDevicesViewModel r0 = com.facebook.aura.settings.HatchConnectedDevicesViewModel.this
                r5 = 0
                r2 = 15
            L86:
                r10.L$0 = r1
                r10.L$1 = r0
                r10.I$0 = r2
                r10.I$1 = r5
                r10.I$2 = r5
                r10.label = r7
                r3 = 2000(0x7d0, double:9.88E-321)
                java.lang.Object r3 = X.C7Bq.A01(r3, r10)
                if (r3 == r9) goto L37
                r3 = r5
            L9b:
                r10.L$0 = r1
                r10.L$1 = r0
                r10.I$0 = r2
                r10.I$1 = r5
                r10.I$2 = r3
                r10.label = r8
                java.lang.Object r11 = com.facebook.aura.settings.HatchConnectedDevicesViewModel.access$loadDevices(r0, r10)
                if (r11 != r9) goto L20
                return r9
            Lae:
                java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.settings.HatchConnectedDevicesViewModel.C134901.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return HatchConnectedDevicesViewModel.this.new C134901(htJ).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.settings.HatchConnectedDevicesViewModel$refreshPermissionStates$1", f = "HatchConnectedDevicesViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.settings.HatchConnectedDevicesViewModel$refreshPermissionStates$1, reason: invalid class name and case insensitive filesystem */
    public final class C134911 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public int label;

        public C134911(HtJ<? super C134911> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return HatchConnectedDevicesViewModel.this.new C134911(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            ConnectedDevicesUiState value;
            ConnectedDevicesUiState connectedDevicesUiStateCopy;
            if (this.label != 0) {
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(obj);
            HatchConnectedDevicesViewModel hatchConnectedDevicesViewModel = HatchConnectedDevicesViewModel.this;
            Application application = hatchConnectedDevicesViewModel.application;
            HatchGatewayPrefsStore companion = HatchGatewayPrefsStore.Companion.getInstance(hatchConnectedDevicesViewModel.userSession);
            HatchConnectedDevicesViewModel hatchConnectedDevicesViewModel2 = HatchConnectedDevicesViewModel.this;
            BLG<ConnectedDevicesUiState> blg = hatchConnectedDevicesViewModel2._uiState;
            do {
                value = blg.getValue();
                connectedDevicesUiStateCopy = value;
                if (connectedDevicesUiStateCopy instanceof ConnectedDevicesUiState.Loaded) {
                    ConnectedDevicesUiState.Loaded loaded = (ConnectedDevicesUiState.Loaded) connectedDevicesUiStateCopy;
                    connectedDevicesUiStateCopy = loaded.copy(loaded.devices, loaded.wearableCommsNodeIds, loaded.localNodeId, hatchConnectedDevicesViewModel2.getPermissionStates(application, companion), LocationSharingModesKt.deriveLocationMode(application), loaded.hasServerDevices, loaded.isDeveloperModeAvailable, loaded.isDeveloperModeEnabled, loaded.developerModeTurnOff);
                }
            } while (!blg.A6e(value, connectedDevicesUiStateCopy));
            return Unit.INSTANCE;
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return HatchConnectedDevicesViewModel.this.new C134911(htJ).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.settings.HatchConnectedDevicesViewModel$removeCommunityDevices$1", f = "HatchConnectedDevicesViewModel.kt", l = {472, 478, 482}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.settings.HatchConnectedDevicesViewModel$removeCommunityDevices$1, reason: invalid class name and case insensitive filesystem */
    public final class C134921 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ List<NodeListEntry> $devices;
        public int I$0;
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public int label;
        public final /* synthetic */ HatchConnectedDevicesViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C134921(List<NodeListEntry> list, HatchConnectedDevicesViewModel hatchConnectedDevicesViewModel, HtJ<? super C134921> htJ) {
            super(2, htJ);
            this.$devices = list;
            this.this$0 = hatchConnectedDevicesViewModel;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new C134921(this.$devices, this.this$0, htJ);
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x001f  */
        /* JADX WARN: Removed duplicated region for block: B:13:0x0026  */
        /* JADX WARN: Removed duplicated region for block: B:19:0x0056  */
        /* JADX WARN: Removed duplicated region for block: B:25:0x007f  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x0081  */
        /* JADX WARN: Removed duplicated region for block: B:38:0x00d3  */
        /* JADX WARN: Removed duplicated region for block: B:40:0x00df  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x0043 -> B:8:0x0019). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x006b -> B:23:0x0077). Please report as a decompilation issue!!! */
        @Override // X.AbstractC8884Fsp
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r11) {
            /*
                Method dump skipped, instructions count: 257
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.settings.HatchConnectedDevicesViewModel.C134921.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ((C134921) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.settings.HatchConnectedDevicesViewModel", f = "HatchConnectedDevicesViewModel.kt", l = {588}, m = "revokeDeviceKey", v = 2)
    /* renamed from: com.facebook.aura.settings.HatchConnectedDevicesViewModel$revokeDeviceKey$1, reason: invalid class name and case insensitive filesystem */
    public final class C134931 extends HzP {
        public Object L$0;
        public int label;
        public /* synthetic */ Object result;

        public C134931(HtJ<? super C134931> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HatchConnectedDevicesViewModel.this.revokeDeviceKey(null, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.settings.HatchConnectedDevicesViewModel", f = "HatchConnectedDevicesViewModel.kt", l = {MC.hatch_android_login.__CONFIG__}, m = "revokeDeviceTokens", v = 2)
    /* renamed from: com.facebook.aura.settings.HatchConnectedDevicesViewModel$revokeDeviceTokens$1, reason: invalid class name and case insensitive filesystem */
    public final class C134941 extends HzP {
        public Object L$0;
        public int label;
        public /* synthetic */ Object result;

        public C134941(HtJ<? super C134941> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HatchConnectedDevicesViewModel.this.revokeDeviceTokens(null, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.settings.HatchConnectedDevicesViewModel", f = "HatchConnectedDevicesViewModel.kt", l = {498}, m = "revokeUnlistedCommunityDevices", v = 2)
    /* renamed from: com.facebook.aura.settings.HatchConnectedDevicesViewModel$revokeUnlistedCommunityDevices$1, reason: invalid class name and case insensitive filesystem */
    public final class C134951 extends HzP {
        public Object L$0;
        public int label;
        public /* synthetic */ Object result;

        public C134951(HtJ<? super C134951> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HatchConnectedDevicesViewModel.this.revokeUnlistedCommunityDevices(null, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.settings.HatchConnectedDevicesViewModel", f = "HatchConnectedDevicesViewModel.kt", l = {514, 517, 537}, m = "unpairDevice", v = 2)
    /* renamed from: com.facebook.aura.settings.HatchConnectedDevicesViewModel$unpairDevice$1, reason: invalid class name and case insensitive filesystem */
    public final class C134961 extends HzP {
        public int I$0;
        public int I$1;
        public Object L$0;
        public Object L$1;
        public int label;
        public /* synthetic */ Object result;

        public C134961(HtJ<? super C134961> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HatchConnectedDevicesViewModel.this.unpairDevice(null, this);
        }
    }

    public HatchConnectedDevicesViewModel(Application application, AbstractC3358CGz abstractC3358CGz) {
        boolean zA1a = AnonymousClass002.A1a(application, abstractC3358CGz);
        this.application = application;
        this.userSession = abstractC3358CGz;
        HatchGatewayServiceManager hatchGatewayServiceManager = HatchGatewayServiceManager.INSTANCE;
        this.gatewayConnection = HatchGatewayConnection.Companion.getInstance(abstractC3358CGz);
        this.nodeClient = HatchNodeClient.Companion.getInstance(abstractC3358CGz, application);
        AuraSubscriptionRepository companion = AuraSubscriptionRepository.Companion.getInstance(abstractC3358CGz);
        this.subscriptionRepository = companion;
        C60I c60iA03 = C3rb.A03(new HatchConnectedDevicesViewModel$homeLinkOffers$1(null), companion.subscriptionDetailsState, companion.isSettlingPurchase);
        this.homeLinkOffers = c60iA03;
        C9286GCn c9286GCnA01 = HnJ.A01(buildLocalOnlyState());
        this._uiState = c9286GCnA01;
        C3Pi c3Pi = new C3Pi(null, c9286GCnA01);
        this.uiState = c3Pi;
        AnonymousClass603 anonymousClass603A01 = C3rb.A01(new HatchConnectedDevicesViewModel$screenState$1(this, null), c3Pi, ConnectedDeviceRows.INSTANCE.rows(application, abstractC3358CGz), HatchDeveloperMode.changeCount, c60iA03);
        this.screenState = AnonymousClass441.A00(screenStateOf((ConnectedDevicesUiState) c9286GCnA01.getValue(), C0881AGi.A00, null), AEu.A00(this), anonymousClass603A01, new C3Es(5000L, LinkEncryptedPairingKt.LINK_COUNTER_MAX));
        Integer num = C79.A00;
        C9290GCr c9290GCr = new C9290GCr(num, 0, zA1a ? 1 : 0);
        this._viewEffects = c9290GCr;
        this.viewEffects = new C3pd(c9290GCr);
        BLL bllA0e = AnonymousClass001.A0e(this, num, AnonymousClass001.A0y(), new AnonymousClass1(null), AEu.A00(this));
        AnonymousClass2 anonymousClass2 = new AnonymousClass2(null);
        C6ys c6ys = C6ys.A00;
        GAo.A02(num, c6ys, new AnonymousClass3(null), AnonymousClass001.A0e(this, num, c6ys, anonymousClass2, bllA0e));
    }

    public final void dismissDevice(NodeListEntry nodeListEntry) {
        C7384Etj.A0Y(nodeListEntry, 0);
        AnonymousClass001.A1I(AnonymousClass001.A0y(), new C134841(nodeListEntry, this, null), AEu.A00(this));
    }

    public final void initiateUnpair(NodeListEntry nodeListEntry) {
        C7384Etj.A0Y(nodeListEntry, 0);
        AnonymousClass001.A1I(AnonymousClass001.A0y(), new C134861(nodeListEntry, null), AEu.A00(this));
    }

    public final void markSelfRevoked(NodeListEntry nodeListEntry) {
        C7384Etj.A0Y(nodeListEntry, 0);
        AnonymousClass001.A1I(AnonymousClass001.A0y(), new C134891(nodeListEntry, this, null), AEu.A00(this));
    }

    public final ConnectedDeviceNavigation resolveDeviceNavigation$fbandroid_express_aura_java_com_facebook_aura_settings_settings(NodeListEntry nodeListEntry) {
        C7384Etj.A0Y(nodeListEntry, 0);
        return HatchDeviceRowPartsKt.opensInMetaAi(nodeListEntry) ? ConnectedDeviceNavigation.META_AI : ConnectedDeviceNavigation.DETAILS;
    }

    private final ConnectedDevicesUiState.Loaded buildLocalOnlyState() {
        String nodeId = AuraDeviceId.INSTANCE.getNodeId();
        HatchGatewayPrefsStore companion = HatchGatewayPrefsStore.Companion.getInstance(this.userSession);
        List<NodeListEntry> listWithLocalDevice = withLocalDevice(C0881AGi.A00, nodeId);
        return new ConnectedDevicesUiState.Loaded(listWithLocalDevice, HatchConnectedDevicesViewModelKt.wearableCommsNodeIds(listWithLocalDevice), nodeId, getPermissionStates(this.application, companion), LocationSharingModesKt.deriveLocationMode(this.application), false, HatchUtil.INSTANCE.isLinkCommunityDevicesEnabled(), HatchDeveloperMode.INSTANCE.isEnabled(this.userSession), null);
    }

    private final List<NodeListEntry> filterDismissed(List<NodeListEntry> list, String str) {
        HatchDismissedDevicesStore hatchDismissedDevicesStore = HatchDismissedDevicesStore.INSTANCE;
        Set<String> dismissedNodeIds = hatchDismissedDevicesStore.getDismissedNodeIds(this.userSession);
        if (!dismissedNodeIds.isEmpty()) {
            String strNormalizeNodeId = HatchConnectedDevicesViewModelKt.normalizeNodeId(str);
            ArrayList arrayList = new ArrayList();
            for (NodeListEntry nodeListEntry : list) {
                NodeListEntry nodeListEntry2 = nodeListEntry;
                if (nodeListEntry2.isOnline() && AbstractC0878AGe.A0k(dismissedNodeIds, HatchConnectedDevicesViewModelKt.normalizeNodeId(nodeListEntry2.nodeId))) {
                    arrayList.add(nodeListEntry);
                }
            }
            if (!arrayList.isEmpty()) {
                AbstractC3358CGz abstractC3358CGz = this.userSession;
                ArrayList arrayListA0i = AnonymousClass003.A0i(arrayList);
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    arrayListA0i.add(((NodeListEntry) it.next()).nodeId);
                }
                hatchDismissedDevicesStore.undismiss(abstractC3358CGz, arrayListA0i);
            }
            ArrayList arrayList2 = new ArrayList();
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                String strNormalizeNodeId2 = HatchConnectedDevicesViewModelKt.normalizeNodeId(((NodeListEntry) it2.next()).nodeId);
                if (strNormalizeNodeId2 != null) {
                    arrayList2.add(strNormalizeNodeId2);
                }
            }
            Set setA03 = BGK.A03(AbstractC0878AGe.A0g(arrayList2), dismissedNodeIds);
            if (!setA03.isEmpty()) {
                ArrayList arrayList3 = new ArrayList();
                for (NodeListEntry nodeListEntry3 : list) {
                    String strNormalizeNodeId3 = HatchConnectedDevicesViewModelKt.normalizeNodeId(nodeListEntry3.nodeId);
                    if (strNormalizeNodeId3 == null || strNormalizeNodeId3.equals(strNormalizeNodeId) || !setA03.contains(strNormalizeNodeId3)) {
                        arrayList3.add(nodeListEntry3);
                    }
                }
                return arrayList3;
            }
        }
        return list;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:11:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.BO6<com.facebook.aura.navigation.key.PermissionDestination, java.lang.Boolean> getPermissionStates(android.content.Context r11, com.facebook.aura.gateway.store.HatchGatewayPrefsStore r12) {
        /*
            r10 = this;
            com.facebook.aura.navigation.key.PermissionDestination r2 = com.facebook.aura.navigation.key.PermissionDestination.CONTACTS
            com.facebook.aura.utils.HatchPermissionUtils r1 = com.facebook.aura.utils.HatchPermissionUtils.INSTANCE
            java.lang.String r0 = "android.permission.READ_CONTACTS"
            boolean r0 = r1.hasPermission(r11, r0)
            r3 = 1
            if (r0 != 0) goto L16
            java.lang.String r0 = "android.permission.WRITE_CONTACTS"
            boolean r1 = r1.hasPermission(r11, r0)
            r0 = 0
            if (r1 == 0) goto L17
        L16:
            r0 = 1
        L17:
            X.HxE r4 = X.AnonymousClass002.A0q(r2, r0)
            com.facebook.aura.navigation.key.PermissionDestination r2 = com.facebook.aura.navigation.key.PermissionDestination.CALENDAR
            java.lang.String r0 = "android.permission.READ_CALENDAR"
            int r0 = X.AbstractC4103Cmd.A02(r11, r0)
            if (r0 == 0) goto L2e
            java.lang.String r0 = "android.permission.WRITE_CALENDAR"
            int r1 = X.AbstractC4103Cmd.A02(r11, r0)
            r0 = 0
            if (r1 != 0) goto L2f
        L2e:
            r0 = 1
        L2f:
            X.HxE r5 = X.AnonymousClass002.A0q(r2, r0)
            com.facebook.aura.navigation.key.PermissionDestination r1 = com.facebook.aura.navigation.key.PermissionDestination.MESSAGES
            java.lang.String r0 = "android.permission.READ_SMS"
            int r0 = X.AbstractC4103Cmd.A02(r11, r0)
            boolean r0 = X.AnonymousClass002.A1M(r0)
            X.HxE r6 = X.AnonymousClass002.A0q(r1, r0)
            com.facebook.aura.navigation.key.PermissionDestination r1 = com.facebook.aura.navigation.key.PermissionDestination.CALL_LOG
            java.lang.String r0 = "android.permission.READ_CALL_LOG"
            int r0 = X.AbstractC4103Cmd.A02(r11, r0)
            boolean r0 = X.AnonymousClass002.A1M(r0)
            X.HxE r7 = X.AnonymousClass002.A0q(r1, r0)
            com.facebook.aura.navigation.key.PermissionDestination r1 = com.facebook.aura.navigation.key.PermissionDestination.PHONE
            java.lang.String r0 = "android.permission.CALL_PHONE"
            int r0 = X.AbstractC4103Cmd.A02(r11, r0)
            boolean r0 = X.AnonymousClass002.A1M(r0)
            X.HxE r8 = X.AnonymousClass002.A0q(r1, r0)
            com.facebook.aura.navigation.key.PermissionDestination r1 = com.facebook.aura.navigation.key.PermissionDestination.PHONE_NOTIFICATIONS
            com.facebook.aura.commands.core.NotificationAccessUtils r0 = com.facebook.aura.commands.core.NotificationAccessUtils.INSTANCE
            boolean r0 = r0.isNotificationAccessGranted(r11)
            X.HxE r9 = X.AnonymousClass002.A0q(r1, r0)
            com.facebook.aura.navigation.key.PermissionDestination r1 = com.facebook.aura.navigation.key.PermissionDestination.MICROPHONE
            java.lang.String r0 = "android.permission.RECORD_AUDIO"
            int r0 = X.AbstractC4103Cmd.A02(r11, r0)
            boolean r0 = X.AnonymousClass002.A1M(r0)
            X.HxE r10 = X.AnonymousClass002.A0q(r1, r0)
            com.facebook.aura.navigation.key.PermissionDestination r2 = com.facebook.aura.navigation.key.PermissionDestination.BLUETOOTH
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 31
            if (r1 < r0) goto L97
            java.lang.String r0 = "android.permission.BLUETOOTH_CONNECT"
            int r0 = X.AbstractC4103Cmd.A02(r11, r0)
            if (r0 != 0) goto Lae
            java.lang.String r0 = "android.permission.BLUETOOTH_SCAN"
            int r0 = X.AbstractC4103Cmd.A02(r11, r0)
            if (r0 != 0) goto Lae
        L97:
            X.HxE r11 = X.AnonymousClass002.A0q(r2, r3)
            com.facebook.aura.navigation.key.PermissionDestination r1 = com.facebook.aura.navigation.key.PermissionDestination.RUN_IN_BACKGROUND
            boolean r0 = r12.getRunInBackgroundEnabled()
            X.HxE r12 = X.AnonymousClass002.A0q(r1, r0)
            X.HxE[] r0 = new X.HxE[]{r4, r5, r6, r7, r8, r9, r10, r11, r12}
            X.AJp r0 = X.AGI.A0G(r0)
            return r0
        Lae:
            r3 = 0
            goto L97
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.settings.HatchConnectedDevicesViewModel.getPermissionStates(android.content.Context, com.facebook.aura.gateway.store.HatchGatewayPrefsStore):X.BO6");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:11:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object loadDevices(X.HtJ<? super java.util.Set<java.lang.String>> r23) {
        /*
            Method dump skipped, instructions count: 319
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.settings.HatchConnectedDevicesViewModel.loadDevices(X.HtJ):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object revokeDeviceKey(java.lang.String r6, X.HtJ<? super java.lang.Boolean> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof com.facebook.aura.settings.HatchConnectedDevicesViewModel.C134931
            if (r0 == 0) goto L22
            r4 = r7
            com.facebook.aura.settings.HatchConnectedDevicesViewModel$revokeDeviceKey$1 r4 = (com.facebook.aura.settings.HatchConnectedDevicesViewModel.C134931) r4
            int r2 = r4.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L22
            int r2 = r2 - r1
            r4.label = r2
        L12:
            java.lang.Object r1 = r4.result
            X.Hji r3 = X.EnumC10460Hji.A02
            int r0 = r4.label
            r2 = 1
            if (r0 == 0) goto L2d
            if (r0 != r2) goto L28
            java.lang.Object r6 = r4.L$0
            java.lang.String r6 = (java.lang.String) r6
            goto L43
        L22:
            com.facebook.aura.settings.HatchConnectedDevicesViewModel$revokeDeviceKey$1 r4 = new com.facebook.aura.settings.HatchConnectedDevicesViewModel$revokeDeviceKey$1
            r4.<init>(r7)
            goto L12
        L28:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        L2d:
            X.Hwg.A00(r1)
            com.facebook.aura.devices.token.LinkDeviceKeys$Companion r1 = com.facebook.aura.devices.token.LinkDeviceKeys.Companion     // Catch: java.lang.Exception -> L4b java.util.concurrent.CancellationException -> L5d
            X.CGz r0 = r5.userSession     // Catch: java.lang.Exception -> L4b java.util.concurrent.CancellationException -> L5d
            com.facebook.aura.devices.token.LinkDeviceKeys r0 = r1.forSession(r0)     // Catch: java.lang.Exception -> L4b java.util.concurrent.CancellationException -> L5d
            r4.L$0 = r6     // Catch: java.lang.Exception -> L4b java.util.concurrent.CancellationException -> L5d
            r4.label = r2     // Catch: java.lang.Exception -> L4b java.util.concurrent.CancellationException -> L5d
            java.lang.Object r1 = r0.revokeNode(r6, r4)     // Catch: java.lang.Exception -> L4b java.util.concurrent.CancellationException -> L5d
            if (r1 != r3) goto L46
            return r3
        L43:
            X.Hwg.A00(r1)     // Catch: java.lang.Exception -> L4b java.util.concurrent.CancellationException -> L5d
        L46:
            boolean r0 = X.AnonymousClass001.A1X(r1)     // Catch: java.lang.Exception -> L4b java.util.concurrent.CancellationException -> L5d
            goto L58
        L4b:
            r2 = move-exception
            java.lang.String r0 = "device key revoke failed for nodeId="
            java.lang.String r1 = X.FGI.A0M(r0, r6)
            java.lang.String r0 = "HatchConnectedDevicesVM"
            X.CFK.A0A(r0, r1, r2)
            r0 = 0
        L58:
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r0)
            return r3
        L5d:
            r0 = move-exception
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.settings.HatchConnectedDevicesViewModel.revokeDeviceKey(java.lang.String, X.HtJ):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object revokeDeviceTokens(java.lang.String r9, X.HtJ<? super com.facebook.aura.devices.intf.LinkDeviceTokenRevokeOutcome> r10) {
        /*
            r8 = this;
            java.lang.String r6 = "device token revoked for nodeId="
            java.lang.String r5 = "device token revoke not confirmed for nodeId="
            boolean r0 = r10 instanceof com.facebook.aura.settings.HatchConnectedDevicesViewModel.C134941
            if (r0 == 0) goto L28
            r7 = r10
            com.facebook.aura.settings.HatchConnectedDevicesViewModel$revokeDeviceTokens$1 r7 = (com.facebook.aura.settings.HatchConnectedDevicesViewModel.C134941) r7
            int r2 = r7.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L28
            int r2 = r2 - r1
            r7.label = r2
        L16:
            java.lang.Object r1 = r7.result
            X.Hji r4 = X.EnumC10460Hji.A02
            int r0 = r7.label
            java.lang.String r3 = "HatchConnectedDevicesVM"
            r2 = 1
            if (r0 == 0) goto L33
            if (r0 != r2) goto L2e
            java.lang.Object r9 = r7.L$0
            java.lang.String r9 = (java.lang.String) r9
            goto L4d
        L28:
            com.facebook.aura.settings.HatchConnectedDevicesViewModel$revokeDeviceTokens$1 r7 = new com.facebook.aura.settings.HatchConnectedDevicesViewModel$revokeDeviceTokens$1
            r7.<init>(r10)
            goto L16
        L2e:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        L33:
            X.Hwg.A00(r1)
            com.facebook.aura.devices.token.LinkDeviceTokenMinter r1 = com.facebook.aura.devices.token.LinkDeviceTokenMinter.INSTANCE     // Catch: java.lang.Exception -> L66 java.util.concurrent.CancellationException -> L73
            com.facebook.aura.devices.intf.LinkTokenOnlySetups r0 = com.facebook.aura.devices.intf.LinkTokenOnlySetups.INSTANCE     // Catch: java.lang.Exception -> L66 java.util.concurrent.CancellationException -> L73
            com.facebook.aura.devices.intf.LinkTokenOnlySetup r0 = r0.resolve()     // Catch: java.lang.Exception -> L66 java.util.concurrent.CancellationException -> L73
            boolean r0 = X.AnonymousClass002.A1X(r0)
            r7.L$0 = r9     // Catch: java.lang.Exception -> L66 java.util.concurrent.CancellationException -> L73
            r7.label = r2     // Catch: java.lang.Exception -> L66 java.util.concurrent.CancellationException -> L73
            java.lang.Object r1 = r1.revokeDeviceTokensWithOutcome(r9, r0, r7)     // Catch: java.lang.Exception -> L66 java.util.concurrent.CancellationException -> L73
            if (r1 != r4) goto L50
            return r4
        L4d:
            X.Hwg.A00(r1)     // Catch: java.lang.Exception -> L66 java.util.concurrent.CancellationException -> L73
        L50:
            com.facebook.aura.devices.intf.LinkDeviceTokenRevokeOutcome r1 = (com.facebook.aura.devices.intf.LinkDeviceTokenRevokeOutcome) r1     // Catch: java.lang.Exception -> L66 java.util.concurrent.CancellationException -> L73
            com.facebook.aura.devices.intf.LinkDeviceTokenRevokeOutcome r0 = com.facebook.aura.devices.intf.LinkDeviceTokenRevokeOutcome.REVOKED     // Catch: java.lang.Exception -> L66 java.util.concurrent.CancellationException -> L73
            if (r1 != r0) goto L5e
            java.lang.String r0 = X.FGI.A0M(r6, r9)     // Catch: java.lang.Exception -> L66 java.util.concurrent.CancellationException -> L73
            X.CFK.A05(r3, r0)     // Catch: java.lang.Exception -> L66 java.util.concurrent.CancellationException -> L73
            return r1
        L5e:
            java.lang.String r0 = X.FGI.A0M(r5, r9)     // Catch: java.lang.Exception -> L66 java.util.concurrent.CancellationException -> L73
            X.CFK.A06(r3, r0)     // Catch: java.lang.Exception -> L66 java.util.concurrent.CancellationException -> L73
            return r1
        L66:
            r1 = move-exception
            java.lang.String r0 = "device token revoke failed for nodeId="
            java.lang.String r0 = X.FGI.A0M(r0, r9)
            X.CFK.A0A(r3, r0, r1)
            com.facebook.aura.devices.intf.LinkDeviceTokenRevokeOutcome r0 = com.facebook.aura.devices.intf.LinkDeviceTokenRevokeOutcome.UNKNOWN
            return r0
        L73:
            r0 = move-exception
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.settings.HatchConnectedDevicesViewModel.revokeDeviceTokens(java.lang.String, X.HtJ):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object revokeUnlistedCommunityDevices(java.util.Set<java.lang.String> r8, X.HtJ<? super java.lang.Boolean> r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof com.facebook.aura.settings.HatchConnectedDevicesViewModel.C134951
            if (r0 == 0) goto L22
            r6 = r9
            com.facebook.aura.settings.HatchConnectedDevicesViewModel$revokeUnlistedCommunityDevices$1 r6 = (com.facebook.aura.settings.HatchConnectedDevicesViewModel.C134951) r6
            int r2 = r6.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L22
            int r2 = r2 - r1
            r6.label = r2
        L12:
            java.lang.Object r3 = r6.result
            X.Hji r5 = X.EnumC10460Hji.A02
            int r0 = r6.label
            r4 = 1
            if (r0 == 0) goto L2d
            if (r0 != r4) goto L28
            java.lang.Object r8 = r6.L$0
            java.util.Set r8 = (java.util.Set) r8
            goto L45
        L22:
            com.facebook.aura.settings.HatchConnectedDevicesViewModel$revokeUnlistedCommunityDevices$1 r6 = new com.facebook.aura.settings.HatchConnectedDevicesViewModel$revokeUnlistedCommunityDevices$1
            r6.<init>(r9)
            goto L12
        L28:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        L2d:
            X.Hwg.A00(r3)
            com.facebook.aura.devices.token.LinkDeviceKeys$Companion r1 = com.facebook.aura.devices.token.LinkDeviceKeys.Companion     // Catch: java.lang.Exception -> L95 java.util.concurrent.CancellationException -> La2
            X.CGz r0 = r7.userSession     // Catch: java.lang.Exception -> L95 java.util.concurrent.CancellationException -> La2
            com.facebook.aura.devices.token.LinkDeviceKeys r2 = r1.forSession(r0)     // Catch: java.lang.Exception -> L95 java.util.concurrent.CancellationException -> La2
            r6.L$0 = r8     // Catch: java.lang.Exception -> L95 java.util.concurrent.CancellationException -> La2
            r6.label = r4     // Catch: java.lang.Exception -> L95 java.util.concurrent.CancellationException -> La2
            r0 = 5000(0x1388, double:2.4703E-320)
            java.lang.Object r3 = r2.retryPendingRevocations(r8, r0, r6)     // Catch: java.lang.Exception -> L95 java.util.concurrent.CancellationException -> La2
            if (r3 != r5) goto L48
            return r5
        L45:
            X.Hwg.A00(r3)     // Catch: java.lang.Exception -> L95 java.util.concurrent.CancellationException -> La2
        L48:
            java.util.Set r3 = (java.util.Set) r3     // Catch: java.lang.Exception -> L95 java.util.concurrent.CancellationException -> La2
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.Iterator r2 = r8.iterator()
        L53:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L6e
            java.lang.Object r1 = r2.next()
            r0 = r1
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r0 = com.facebook.aura.settings.HatchConnectedDevicesViewModelKt.normalizeNodeId(r0)
            boolean r0 = X.AbstractC0878AGe.A0k(r3, r0)
            if (r0 == 0) goto L53
            r4.add(r1)
            goto L53
        L6e:
            java.util.Set r0 = X.AbstractC0878AGe.A0g(r4)
            java.util.Set r0 = X.BGK.A03(r0, r8)
            java.util.Iterator r3 = r0.iterator()
        L7a:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L8c
            java.lang.String r2 = X.AnonymousClass005.A0j(r3)
            com.facebook.aura.common.prefs.HatchDeveloperMode r1 = com.facebook.aura.common.prefs.HatchDeveloperMode.INSTANCE
            X.CGz r0 = r7.userSession
            r1.unmarkCommunityDevice(r0, r2)
            goto L7a
        L8c:
            boolean r0 = r4.isEmpty()
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r0)
            return r5
        L95:
            r2 = move-exception
            java.lang.String r1 = "revoking keys of unlisted community devices failed"
            java.lang.String r0 = "HatchConnectedDevicesVM"
            X.CFK.A0A(r0, r1, r2)
            java.lang.Boolean r0 = X.AnonymousClass001.A0h()
            return r0
        La2:
            r0 = move-exception
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.settings.HatchConnectedDevicesViewModel.revokeUnlistedCommunityDevices(java.util.Set, X.HtJ):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0012 A[PHI: r1 r2
  0x0012: PHI (r1v7 com.facebook.aura.settings.ConnectedDevicesUiState$Loaded) = 
  (r1v2 com.facebook.aura.settings.ConnectedDevicesUiState$Loaded)
  (r1v9 com.facebook.aura.settings.ConnectedDevicesUiState$Loaded)
 binds: [B:9:0x0010, B:7:0x000c] A[DONT_GENERATE, DONT_INLINE]
  0x0012: PHI (r2v4 java.util.List) = (r2v0 java.util.List), (r2v5 java.util.List) binds: [B:9:0x0010, B:7:0x000c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x001a  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0069 A[LOOP:1: B:24:0x0063->B:26:0x0069, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.facebook.aura.settings.ConnectedDevicesScreenState screenStateOf(com.facebook.aura.settings.ConnectedDevicesUiState r8, java.util.List<com.facebook.aura.devices.intf.ConnectedDeviceRow> r9, com.facebook.aura.settings.HomeLinkOffer r10) {
        /*
            r7 = this;
            boolean r1 = r8 instanceof com.facebook.aura.settings.ConnectedDevicesUiState.Loaded
            r0 = 0
            if (r1 == 0) goto L59
            r1 = r8
            com.facebook.aura.settings.ConnectedDevicesUiState$Loaded r1 = (com.facebook.aura.settings.ConnectedDevicesUiState.Loaded) r1
            if (r1 == 0) goto Le
            java.util.List<com.facebook.aura.nodes.json.NodeListEntry> r2 = r1.devices
            if (r2 != 0) goto L12
        Le:
            X.AGi r2 = X.C0881AGi.A00
            if (r1 == 0) goto L14
        L12:
            java.lang.String r0 = r1.localNodeId
        L14:
            java.lang.String r3 = com.facebook.aura.settings.HatchConnectedDevicesViewModelKt.normalizeNodeId(r0)
            if (r3 != 0) goto L24
            com.facebook.aura.common.identifiers.AuraDeviceId r0 = com.facebook.aura.common.identifiers.AuraDeviceId.INSTANCE
            java.lang.String r0 = r0.getNodeId()
            java.lang.String r3 = com.facebook.aura.settings.HatchConnectedDevicesViewModelKt.normalizeNodeId(r0)
        L24:
            boolean r4 = com.facebook.aura.settings.HatchLinkAvailabilityKt.isHatchLinkAvailable()
            long r6 = java.lang.System.currentTimeMillis()
            r5 = r9
            com.facebook.aura.settings.ConnectedDeviceSections r4 = com.facebook.aura.settings.HatchConnectedDeviceSectionsKt.connectedDeviceSectionsOf(r2, r3, r4, r5, r6)
            X.AHD<com.facebook.aura.nodes.json.NodeListEntry> r0 = r4.glasses
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.Iterator r3 = r0.iterator()
        L3c:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L5b
            java.lang.Object r2 = r3.next()
            r1 = r2
            com.facebook.aura.nodes.json.NodeListEntry r1 = (com.facebook.aura.nodes.json.NodeListEntry) r1
            boolean r0 = r1.isWearable()
            if (r0 == 0) goto L3c
            boolean r0 = com.facebook.aura.settings.HatchConnectedDeviceClassificationKt.isMuseCharm(r1)
            if (r0 != 0) goto L3c
            r5.add(r2)
            goto L3c
        L59:
            r1 = r0
            goto Le
        L5b:
            java.util.ArrayList r2 = X.AnonymousClass003.A0i(r5)
            java.util.Iterator r1 = r5.iterator()
        L63:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L75
            java.lang.Object r0 = r1.next()
            com.facebook.aura.nodes.json.NodeListEntry r0 = (com.facebook.aura.nodes.json.NodeListEntry) r0
            java.lang.String r0 = r0.nodeId
            r2.add(r0)
            goto L63
        L75:
            X.AHG r1 = X.AGI.A0H(r2)
            com.facebook.aura.settings.ConnectedDevicesScreenState r0 = new com.facebook.aura.settings.ConnectedDevicesScreenState
            r0.<init>(r8, r4, r1, r10)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.settings.HatchConnectedDevicesViewModel.screenStateOf(com.facebook.aura.settings.ConnectedDevicesUiState, java.util.List, com.facebook.aura.settings.HomeLinkOffer):com.facebook.aura.settings.ConnectedDevicesScreenState");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00bc  */
    /* JADX WARN: Type inference failed for: r2v8, types: [boolean, int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object unpairDevice(com.facebook.aura.nodes.json.NodeListEntry r10, X.HtJ<? super com.facebook.aura.settings.HatchConnectedDevicesViewModel.UnpairResult> r11) {
        /*
            Method dump skipped, instructions count: 236
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.settings.HatchConnectedDevicesViewModel.unpairDevice(com.facebook.aura.nodes.json.NodeListEntry, X.HtJ):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<ConnectedDeviceRow> visibleConnectedDeviceRows(List<ConnectedDeviceRow> list) {
        if (HatchDeveloperMode.INSTANCE.isEnabled(this.userSession)) {
            return list;
        }
        ArrayList arrayList = new ArrayList();
        for (ConnectedDeviceRow connectedDeviceRow : list) {
            if (!connectedDeviceRow.isCommunityDevice) {
                arrayList.add(connectedDeviceRow);
            }
        }
        return arrayList;
    }

    private final List<NodeListEntry> withLocalDevice(List<NodeListEntry> list, String str) {
        String strNormalizeNodeId = HatchConnectedDevicesViewModelKt.normalizeNodeId(str);
        if (strNormalizeNodeId != null) {
            if (!(list instanceof Collection) || !list.isEmpty()) {
                Iterator<NodeListEntry> it = list.iterator();
                while (it.hasNext()) {
                    if (strNormalizeNodeId.equals(HatchConnectedDevicesViewModelKt.normalizeNodeId(it.next().nodeId))) {
                    }
                }
            }
            C7384Etj.A0X(str);
            String strA0U = FGI.A0U(Build.MANUFACTURER, InviteCodeScratcherKt.CODE_SEPARATOR, Build.MODEL);
            String str2 = Build.VERSION.RELEASE;
            if (str2 == null) {
                str2 = "";
            }
            return AbstractC0878AGe.A0P(list, Collections.singletonList(new NodeListEntry(str, strA0U, "android", str2, null, null, AnonymousClass001.A0i(), null, null, null, null, null)));
        }
        return list;
    }

    public final void confirmDeveloperModeTurnOff() {
        ConnectedDevicesUiState.Loaded loaded;
        ConnectedDevicesUiState.DeveloperModeTurnOff developerModeTurnOff;
        ConnectedDevicesUiState value = this._uiState.getValue();
        if (!(value instanceof ConnectedDevicesUiState.Loaded) || (loaded = (ConnectedDevicesUiState.Loaded) value) == null || (developerModeTurnOff = loaded.developerModeTurnOff) == null) {
            return;
        }
        dismissDeveloperModeTurnOff();
        removeCommunityDevices(developerModeTurnOff.devices);
    }

    public final void dismissDeveloperModeTurnOff() {
        ConnectedDevicesUiState value;
        ConnectedDevicesUiState connectedDevicesUiStateCopy$default;
        BLG<ConnectedDevicesUiState> blg = this._uiState;
        do {
            value = blg.getValue();
            connectedDevicesUiStateCopy$default = value;
            if (connectedDevicesUiStateCopy$default instanceof ConnectedDevicesUiState.Loaded) {
                connectedDevicesUiStateCopy$default = ConnectedDevicesUiState.Loaded.copy$default((ConnectedDevicesUiState.Loaded) connectedDevicesUiStateCopy$default, null, null, null, null, null, false, false, false, null, 255, null);
            }
        } while (!blg.A6e(value, connectedDevicesUiStateCopy$default));
    }

    public final C1BN<ConnectedDevicesScreenState> getScreenState() {
        return this.screenState;
    }

    public final C1BN<ConnectedDevicesUiState> getUiState() {
        return this.uiState;
    }

    public final C22I<ConnectedDevicesViewEffect> getViewEffects() {
        return this.viewEffects;
    }

    public final void refreshDevicesAfterPairing() {
        HtJ htJA13 = AnonymousClass006.A13(this.pairingRefreshJob);
        BLL bllA00 = AEu.A00(this);
        this.pairingRefreshJob = GAo.A02(C79.A00, AnonymousClass001.A0y(), new C134901(htJA13), bllA00);
    }

    public final void refreshSubscription() {
        this.subscriptionRepository.refresh();
    }

    public final void setDeveloperModeEnabled(boolean z) {
        ConnectedDevicesUiState.Loaded loaded;
        ConnectedDevicesUiState value = this._uiState.getValue();
        if (!(value instanceof ConnectedDevicesUiState.Loaded) || (loaded = (ConnectedDevicesUiState.Loaded) value) == null) {
            return;
        }
        boolean z2 = true;
        if (z) {
            HatchDeveloperMode.INSTANCE.setEnabled(this.userSession, true);
            return;
        }
        if (loaded.hasServerDevices) {
            List<NodeListEntry> list = loaded.devices;
            ArrayList arrayList = new ArrayList();
            for (NodeListEntry nodeListEntry : list) {
                if (HatchDeveloperMode.INSTANCE.isCommunityDevice(this.userSession, nodeListEntry.nodeId)) {
                    arrayList.add(nodeListEntry);
                }
            }
            ArrayList arrayList2 = new ArrayList(0);
            if ((arrayList2 instanceof Collection) && arrayList2.isEmpty()) {
                z2 = false;
            } else {
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    if (((CommunityDeviceRemover) it.next()).hasCommunityDevices(this.application)) {
                        break;
                    }
                }
                z2 = false;
            }
            if (arrayList.isEmpty() && !z2) {
                removeCommunityDevices(C0881AGi.A00);
            } else {
                BLG<ConnectedDevicesUiState> blg = this._uiState;
                while (!blg.A6e(blg.getValue(), ConnectedDevicesUiState.Loaded.copy$default(loaded, null, null, null, null, null, false, false, false, new ConnectedDevicesUiState.DeveloperModeTurnOff(arrayList, JarvisUtils.INSTANCE.getSelectedAssistantNameOrNull(this.userSession)), 255, null))) {
                }
            }
        }
    }

    public final void setRunInBackground(boolean z) {
        HatchGatewayPrefsStore.Companion.getInstance(this.userSession).setRunInBackgroundEnabled(z);
        HatchForegroundService.Companion companion = HatchForegroundService.Companion;
        Application application = this.application;
        if (z) {
            companion.startPersistent(application);
        } else {
            companion.disableBackground(application);
        }
        refreshPermissionStates();
    }

    public final class Companion {
        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    private final void removeCommunityDevices(List<NodeListEntry> list) {
        AnonymousClass001.A1I(AnonymousClass001.A0y(), new C134921(list, this, null), AEu.A00(this));
    }

    public final void fetchDevices() {
        AnonymousClass001.A1I(AnonymousClass001.A0y(), new C134851(null), AEu.A00(this));
    }

    public final void refreshPermissionStates() {
        AnonymousClass001.A1I(AnonymousClass001.A0y(), new C134911(null), AEu.A00(this));
    }
}
