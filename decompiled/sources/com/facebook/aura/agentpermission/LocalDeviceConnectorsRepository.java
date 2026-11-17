package com.facebook.aura.agentpermission;

import X.AGI;
import X.AHD;
import X.AHI;
import X.AbstractC07127nr;
import X.AbstractC10623Hzj;
import X.AbstractC3358CGz;
import X.AnonymousClass001;
import X.BLG;
import X.C06H;
import X.C1BN;
import X.C20Z;
import X.C22I;
import X.C3Pi;
import X.C3UX;
import X.C6ys;
import X.C7384Etj;
import X.C79;
import X.C8eO;
import X.C9286GCn;
import X.EnumC10460Hji;
import X.G0V;
import X.GAo;
import X.GCV;
import X.HnJ;
import X.HtJ;
import X.Hwg;
import X.Hxb;
import X.HzC;
import X.HzR;
import X.InterfaceC7549F2g;
import android.content.Context;
import com.facebook.aura.commands.core.PermissionChangeNotifier;
import com.facebook.aura.common.appcontext.AuraAppContext;
import com.facebook.aura.executors.AuraDispatchers;
import kotlin.KotlinNothingValueException;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlinx.coroutines.DispatchException;
import org.maplibre.android.R;

/* loaded from: classes.dex */
public final class LocalDeviceConnectorsRepository implements InterfaceC7549F2g {
    public static final int $stable = 8;
    public static final Companion Companion = new Companion();
    public static final String TAG = "LocalDeviceConnectorsRepository";
    public final BLG<AHD<LocalDeviceConnector>> _connectors;
    public boolean cleared;
    public final C1BN<AHD<LocalDeviceConnector>> connectors;
    public final Context context;
    public final HzR<Unit> healthRefreshRequests;
    public final Object lock;
    public final C3UX scope;
    public final AbstractC3358CGz userSession;

    @DebugMetadata(c = "com.facebook.aura.agentpermission.LocalDeviceConnectorsRepository$1", f = "LocalDeviceConnectorsRepository.kt", l = {R.styleable.maplibre_MapView_maplibre_uiLogoMarginRight}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.agentpermission.LocalDeviceConnectorsRepository$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public int label;

        public AnonymousClass1(HtJ<? super AnonymousClass1> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return LocalDeviceConnectorsRepository.this.new AnonymousClass1(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                C22I<Unit> c22i = PermissionChangeNotifier.events;
                final LocalDeviceConnectorsRepository localDeviceConnectorsRepository = LocalDeviceConnectorsRepository.this;
                C20Z<? super Unit> c20z = new C20Z() { // from class: com.facebook.aura.agentpermission.LocalDeviceConnectorsRepository.1.1
                    public final Object emit(Unit unit, HtJ<? super Unit> htJ) {
                        localDeviceConnectorsRepository.refresh();
                        return Unit.INSTANCE;
                    }

                    @Override // X.C20Z
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, HtJ htJ) {
                        localDeviceConnectorsRepository.refresh();
                        return Unit.INSTANCE;
                    }
                };
                this.label = 1;
                if (c22i.collect(c20z, this) == enumC10460Hji) {
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
            return LocalDeviceConnectorsRepository.this.new AnonymousClass1(htJ).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.agentpermission.LocalDeviceConnectorsRepository$2", f = "LocalDeviceConnectorsRepository.kt", l = {R.styleable.maplibre_MapView_maplibre_uiRotateGestures, 58}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.agentpermission.LocalDeviceConnectorsRepository$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public int label;

        public AnonymousClass2(HtJ<? super AnonymousClass2> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return LocalDeviceConnectorsRepository.this.new AnonymousClass2(htJ);
        }

        /* JADX WARN: Code restructure failed: missing block: B:24:0x005b, code lost:
        
            r1 = com.facebook.aura.health.HealthConnectPermissionUtils.INSTANCE;
            r0 = r6.this$0.context;
            r6.label = 2;
         */
        /* JADX WARN: Code restructure failed: missing block: B:25:0x0067, code lost:
        
            if (r1.refreshGrantedState(r0, r6) != r5) goto L31;
         */
        /* JADX WARN: Code restructure failed: missing block: B:32:0x007c, code lost:
        
            return r5;
         */
        /* JADX WARN: Removed duplicated region for block: B:10:0x001f A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:14:0x002d  */
        /* JADX WARN: Removed duplicated region for block: B:35:0x0082  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0042 -> B:8:0x0013). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x004d -> B:8:0x0013). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x0067 -> B:31:0x0076). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x006f -> B:31:0x0076). Please report as a decompilation issue!!! */
        @Override // X.AbstractC8884Fsp
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) throws java.lang.Exception {
            /*
                r6 = this;
                X.Hji r5 = X.EnumC10460Hji.A02
                int r0 = r6.label
                r4 = 2
                r3 = 1
                if (r0 == 0) goto L10
                if (r0 == r3) goto L20
                if (r0 != r4) goto L7d
                X.Hwg.A00(r7)     // Catch: java.lang.Exception -> L6a
                goto L76
            L10:
                X.Hwg.A00(r7)
            L13:
                com.facebook.aura.agentpermission.LocalDeviceConnectorsRepository r0 = com.facebook.aura.agentpermission.LocalDeviceConnectorsRepository.this
                X.HzR<kotlin.Unit> r0 = r0.healthRefreshRequests
                r6.label = r3
                java.lang.Object r0 = r0.AZh(r6)
                if (r0 != r5) goto L27
                return r5
            L20:
                X.Hwg.A00(r7)
                X.HoI r7 = (X.HoI) r7
                java.lang.Object r0 = r7.A00
            L27:
                boolean r0 = r0 instanceof X.C2zT
                r0 = r0 ^ 1
                if (r0 == 0) goto L82
                com.facebook.aura.agentpermission.LocalDeviceConnectorsRepository r0 = com.facebook.aura.agentpermission.LocalDeviceConnectorsRepository.this
                X.BLG<X.AHD<com.facebook.aura.agentpermission.LocalDeviceConnector>> r0 = r0._connectors
                java.lang.Object r1 = r0.getValue()
                java.lang.Iterable r1 = (java.lang.Iterable) r1
                boolean r0 = r1 instanceof java.util.Collection
                if (r0 == 0) goto L45
                r0 = r1
                java.util.Collection r0 = (java.util.Collection) r0
                boolean r0 = r0.isEmpty()
                if (r0 == 0) goto L45
                goto L13
            L45:
                java.util.Iterator r2 = r1.iterator()
            L49:
                boolean r0 = r2.hasNext()
                if (r0 == 0) goto L13
                java.lang.Object r0 = r2.next()
                com.facebook.aura.agentpermission.LocalDeviceConnector r0 = (com.facebook.aura.agentpermission.LocalDeviceConnector) r0
                com.facebook.aura.agentpermission.LocalDeviceConnectorPermissionRequirement r1 = r0.permissionRequirement
                com.facebook.aura.agentpermission.LocalDeviceConnectorPermissionRequirement r0 = com.facebook.aura.agentpermission.LocalDeviceConnectorPermissionRequirement.HEALTH
                if (r1 != r0) goto L49
                com.facebook.aura.health.HealthConnectPermissionUtils r1 = com.facebook.aura.health.HealthConnectPermissionUtils.INSTANCE     // Catch: java.lang.Exception -> L6a
                com.facebook.aura.agentpermission.LocalDeviceConnectorsRepository r0 = com.facebook.aura.agentpermission.LocalDeviceConnectorsRepository.this     // Catch: java.lang.Exception -> L6a
                android.content.Context r0 = r0.context     // Catch: java.lang.Exception -> L6a
                r6.label = r4     // Catch: java.lang.Exception -> L6a
                java.lang.Object r0 = r1.refreshGrantedState(r0, r6)     // Catch: java.lang.Exception -> L6a
                if (r0 != r5) goto L76
                goto L7c
            L6a:
                r2 = move-exception
                boolean r0 = r2 instanceof java.util.concurrent.CancellationException
                if (r0 != 0) goto L81
                java.lang.String r1 = "Could not refresh Health Connect permissions"
                java.lang.String r0 = "LocalDeviceConnectorsRepository"
                X.CFK.A0A(r0, r1, r2)
            L76:
                com.facebook.aura.agentpermission.LocalDeviceConnectorsRepository r0 = com.facebook.aura.agentpermission.LocalDeviceConnectorsRepository.this
                com.facebook.aura.agentpermission.LocalDeviceConnectorsRepository.access$publishSnapshot(r0)
                goto L13
            L7c:
                return r5
            L7d:
                java.lang.IllegalStateException r2 = X.AnonymousClass001.A0n()
            L81:
                throw r2
            L82:
                kotlin.Unit r5 = kotlin.Unit.INSTANCE
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.agentpermission.LocalDeviceConnectorsRepository.AnonymousClass2.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return LocalDeviceConnectorsRepository.this.new AnonymousClass2(htJ).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void publishSnapshot() {
        synchronized (this.lock) {
            if (!this.cleared) {
                this._connectors.Af8(AGI.A07(LocalDeviceConnectorKt.localDeviceConnectors(this.context, this.userSession)));
            }
        }
    }

    @Override // X.InterfaceC7549F2g
    public void clearUserData() {
        synchronized (this.lock) {
            this.cleared = true;
            this._connectors.Af8(AHI.A01);
        }
        this.healthRefreshRequests.A6R(null);
        Hxb.A03(null, this.scope);
    }

    public final C1BN<AHD<LocalDeviceConnector>> getConnectors() {
        return this.connectors;
    }

    public final class Companion {
        public final LocalDeviceConnectorsRepository getInstance(AbstractC3358CGz abstractC3358CGz) {
            C7384Etj.A0Y(abstractC3358CGz, 0);
            return (LocalDeviceConnectorsRepository) abstractC3358CGz.A03(LocalDeviceConnectorsRepository.class, new LocalDeviceConnectorsRepository$Companion$getInstance$1(abstractC3358CGz));
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public /* synthetic */ LocalDeviceConnectorsRepository(AbstractC3358CGz abstractC3358CGz, C06H c06h) {
        this(abstractC3358CGz);
    }

    public final void refresh() {
        publishSnapshot();
        this.healthRefreshRequests.AhZ(Unit.INSTANCE);
    }

    public LocalDeviceConnectorsRepository(AbstractC3358CGz abstractC3358CGz) throws DispatchException {
        this.userSession = abstractC3358CGz;
        Context contextRequireContext = AuraAppContext.INSTANCE.requireContext();
        this.context = contextRequireContext;
        this.lock = new Object();
        HzC hzCA02 = Hxb.A02(new C8eO(null).plus(AuraDispatchers.INSTANCE.m764default()).plus(new LocalDeviceConnectorsRepository$special$$inlined$CoroutineExceptionHandler$1(CoroutineExceptionHandler.Key)));
        this.scope = hzCA02;
        Integer num = C79.A00;
        GCV gcvA00 = AbstractC10623Hzj.A00(num, -1);
        this.healthRefreshRequests = gcvA00;
        C9286GCn c9286GCnA01 = HnJ.A01(AGI.A07(LocalDeviceConnectorKt.localDeviceConnectors(contextRequireContext, abstractC3358CGz)));
        this._connectors = c9286GCnA01;
        this.connectors = new C3Pi(null, c9286GCnA01);
        Integer num2 = C79.A0K;
        AnonymousClass1 anonymousClass1 = new AnonymousClass1(null);
        C6ys c6ys = C6ys.A00;
        GAo.A02(num2, c6ys, anonymousClass1, hzCA02);
        GAo.A02(num, c6ys, new AnonymousClass2(null), hzCA02);
        gcvA00.AhZ(Unit.INSTANCE);
    }
}
