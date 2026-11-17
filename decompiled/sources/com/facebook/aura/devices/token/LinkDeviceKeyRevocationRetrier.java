package com.facebook.aura.devices.token;

import X.AbstractC07127nr;
import X.AbstractC3358CGz;
import X.AnonymousClass001;
import X.AnonymousClass003;
import X.BLG;
import X.C06H;
import X.C3UX;
import X.C3cG;
import X.C3pU;
import X.C3rb;
import X.C60I;
import X.C7384Etj;
import X.C8eO;
import X.C9286GCn;
import X.EnumC10460Hji;
import X.G0V;
import X.G0W;
import X.GDB;
import X.HoC;
import X.HtJ;
import X.Hwg;
import X.Hxb;
import X.HzC;
import X.InterfaceC7549F2g;
import com.facebook.aura.auth.AuraSessionManager;
import com.facebook.aura.gateway.HatchGatewayConnection;
import com.facebook.aura.gateway.service.HatchGatewayServiceManager;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* loaded from: classes.dex */
public final class LinkDeviceKeyRevocationRetrier implements InterfaceC7549F2g {
    public static final Companion Companion = new Companion();
    public final C3UX scope;
    public final BLG<Long> wakeups;

    @DebugMetadata(c = "com.facebook.aura.devices.token.LinkDeviceKeyRevocationRetrier$1", f = "LinkDeviceKeyRevocationRetrier.kt", l = {57}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.devices.token.LinkDeviceKeyRevocationRetrier$1, reason: invalid class name */
    /* loaded from: classes4.dex */
    public final class AnonymousClass1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ LinkDeviceKeys $deviceKeys;
        public final /* synthetic */ AbstractC3358CGz $userSession;
        public Object L$0;
        public int label;
        public final /* synthetic */ LinkDeviceKeyRevocationRetrier this$0;

        @DebugMetadata(c = "com.facebook.aura.devices.token.LinkDeviceKeyRevocationRetrier$1$2", f = "LinkDeviceKeyRevocationRetrier.kt", l = {}, m = "invokeSuspend", v = 2)
        /* renamed from: com.facebook.aura.devices.token.LinkDeviceKeyRevocationRetrier$1$2, reason: invalid class name */
        public final class AnonymousClass2 extends AbstractC07127nr implements G0W<String, Long, HtJ<? super String>, Object> {
            public /* synthetic */ Object L$0;
            public int label;

            public AnonymousClass2(HtJ<? super AnonymousClass2> htJ) {
                super(3, htJ);
            }

            public final Object invoke(String str, long j, HtJ<? super String> htJ) {
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(htJ);
                anonymousClass2.L$0 = str;
                return anonymousClass2.invokeSuspend(Unit.INSTANCE);
            }

            @Override // X.AbstractC8884Fsp
            public final Object invokeSuspend(Object obj) {
                Object obj2 = this.L$0;
                if (this.label != 0) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
                return obj2;
            }

            @Override // X.G0W
            public /* bridge */ /* synthetic */ Object invoke(String str, Long l, HtJ<? super String> htJ) {
                return invoke(str, C3cG.A05(l), htJ);
            }
        }

        @DebugMetadata(c = "com.facebook.aura.devices.token.LinkDeviceKeyRevocationRetrier$1$3", f = "LinkDeviceKeyRevocationRetrier.kt", l = {63, 71}, m = "invokeSuspend", v = 2)
        /* renamed from: com.facebook.aura.devices.token.LinkDeviceKeyRevocationRetrier$1$3, reason: invalid class name */
        public final class AnonymousClass3 extends AbstractC07127nr implements G0V<String, HtJ<? super Unit>, Object> {
            public final /* synthetic */ LinkDeviceKeys $deviceKeys;
            public int I$0;
            public int I$1;
            public int I$2;
            public /* synthetic */ Object L$0;
            public Object L$1;
            public Object L$2;
            public int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass3(LinkDeviceKeys linkDeviceKeys, HtJ<? super AnonymousClass3> htJ) {
                super(2, htJ);
                this.$deviceKeys = linkDeviceKeys;
            }

            @Override // X.AbstractC8884Fsp
            public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
                AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.$deviceKeys, htJ);
                anonymousClass3.L$0 = obj;
                return anonymousClass3;
            }

            /* JADX WARN: Code restructure failed: missing block: B:12:0x0030, code lost:
            
                if (r10 >= r6) goto L43;
             */
            /* JADX WARN: Removed duplicated region for block: B:28:0x0082 A[Catch: Exception -> 0x0088, CancellationException -> 0x00ba, TryCatch #0 {Exception -> 0x0088, blocks: (B:26:0x007c, B:28:0x0082, B:25:0x0079), top: B:45:0x0079 }] */
            /* JADX WARN: Removed duplicated region for block: B:36:0x0093  */
            /* JADX WARN: Removed duplicated region for block: B:9:0x0029  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:35:0x0091 -> B:11:0x002e). Please report as a decompilation issue!!! */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:37:0x00b2 -> B:7:0x001d). Please report as a decompilation issue!!! */
            @Override // X.AbstractC8884Fsp
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r15) {
                /*
                    r14 = this;
                    java.lang.Object r1 = r14.L$0
                    X.Hji r8 = X.EnumC10460Hji.A02
                    int r0 = r14.label
                    r11 = 1
                    r7 = 2
                    if (r0 == 0) goto L42
                    if (r0 == r11) goto L33
                    if (r0 != r7) goto Lb5
                    int r9 = r14.I$1
                    int r6 = r14.I$0
                    java.lang.Object r5 = r14.L$2
                    com.facebook.aura.devices.token.LinkDeviceKeys r5 = (com.facebook.aura.devices.token.LinkDeviceKeys) r5
                    java.lang.Object r4 = r14.L$1
                    X.BO7 r4 = (X.BO7) r4
                    X.Hwg.A00(r15)
                L1d:
                    long r0 = r4.element
                    r2 = 2
                    long r0 = r0 * r2
                    r12 = 300000(0x493e0, double:1.482197E-318)
                    int r2 = (r0 > r12 ? 1 : (r0 == r12 ? 0 : -1))
                    if (r2 <= 0) goto L2c
                    r0 = 300000(0x493e0, double:1.482197E-318)
                L2c:
                    r4.element = r0
                L2e:
                    int r10 = r9 + 1
                    if (r10 >= r6) goto Lbc
                    goto L55
                L33:
                    int r10 = r14.I$2
                    int r9 = r14.I$1
                    int r6 = r14.I$0
                    java.lang.Object r5 = r14.L$2
                    com.facebook.aura.devices.token.LinkDeviceKeys r5 = (com.facebook.aura.devices.token.LinkDeviceKeys) r5
                    java.lang.Object r4 = r14.L$1
                    X.BO7 r4 = (X.BO7) r4
                    goto L79
                L42:
                    X.Hwg.A00(r15)
                    if (r1 == 0) goto Lbc
                    X.BO7 r4 = new X.BO7
                    r4.<init>()
                    r0 = 5000(0x1388, double:2.4703E-320)
                    r4.element = r0
                    com.facebook.aura.devices.token.LinkDeviceKeys r5 = r14.$deviceKeys
                    r10 = 0
                    r6 = 8
                L55:
                    boolean r0 = r5.hasPendingRevocationsForSelectedVm$fbandroid_express_aura_java_com_facebook_aura_devices_token_token()     // Catch: java.lang.Exception -> L85 java.util.concurrent.CancellationException -> Lba
                    if (r0 != 0) goto L5e
                    kotlin.Unit r8 = kotlin.Unit.INSTANCE     // Catch: java.lang.Exception -> L85 java.util.concurrent.CancellationException -> Lba
                    return r8
                L5e:
                    r0 = 0
                    r14.L$0 = r0     // Catch: java.lang.Exception -> L85 java.util.concurrent.CancellationException -> Lba
                    r14.L$1 = r4     // Catch: java.lang.Exception -> L85 java.util.concurrent.CancellationException -> Lba
                    r14.L$2 = r5     // Catch: java.lang.Exception -> L85 java.util.concurrent.CancellationException -> Lba
                    r14.I$0 = r6     // Catch: java.lang.Exception -> L85 java.util.concurrent.CancellationException -> Lba
                    r14.I$1 = r10     // Catch: java.lang.Exception -> L85 java.util.concurrent.CancellationException -> Lba
                    r14.I$2 = r10     // Catch: java.lang.Exception -> L85 java.util.concurrent.CancellationException -> Lba
                    r14.label = r11     // Catch: java.lang.Exception -> L85 java.util.concurrent.CancellationException -> Lba
                    r0 = 0
                    X.A3q r2 = X.A3q.A00     // Catch: java.lang.Exception -> L85 java.util.concurrent.CancellationException -> Lba
                    java.lang.Object r0 = r5.retryPendingRevocations(r2, r0, r14)     // Catch: java.lang.Exception -> L85 java.util.concurrent.CancellationException -> Lba
                    if (r0 == r8) goto Lbe
                    r9 = r10
                    goto L7c
                L79:
                    X.Hwg.A00(r15)     // Catch: java.lang.Exception -> L88 java.util.concurrent.CancellationException -> Lba
                L7c:
                    boolean r0 = r5.hasPendingRevocationsForSelectedVm$fbandroid_express_aura_java_com_facebook_aura_devices_token_token()     // Catch: java.lang.Exception -> L88 java.util.concurrent.CancellationException -> Lba
                    if (r0 != 0) goto L90
                    kotlin.Unit r8 = kotlin.Unit.INSTANCE     // Catch: java.lang.Exception -> L88 java.util.concurrent.CancellationException -> Lba
                    return r8
                L85:
                    r2 = move-exception
                    r9 = r10
                    goto L89
                L88:
                    r2 = move-exception
                L89:
                    java.lang.String r1 = "retrying queued revokes failed"
                    java.lang.String r0 = "LinkDeviceKeyRevocations"
                    X.CFK.A0A(r0, r1, r2)
                L90:
                    r0 = 7
                    if (r10 >= r0) goto L2e
                    long r2 = r4.element
                    r0 = 2
                    long r0 = r2 / r0
                    X.CUB r12 = X.CUB.A01
                    long r0 = r12.A08(r0, r2)
                    r2 = 0
                    r14.L$0 = r2
                    r14.L$1 = r4
                    r14.L$2 = r5
                    r14.I$0 = r6
                    r14.I$1 = r9
                    r14.I$2 = r10
                    r14.label = r7
                    java.lang.Object r0 = X.C7Bq.A01(r0, r14)
                    if (r0 != r8) goto L1d
                    return r8
                Lb5:
                    java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
                    throw r0
                Lba:
                    r0 = move-exception
                    throw r0
                Lbc:
                    kotlin.Unit r8 = kotlin.Unit.INSTANCE
                Lbe:
                    return r8
                */
                throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.devices.token.LinkDeviceKeyRevocationRetrier.AnonymousClass1.AnonymousClass3.invokeSuspend(java.lang.Object):java.lang.Object");
            }

            @Override // X.G0V
            public final Object invoke(String str, HtJ<? super Unit> htJ) {
                return ((AnonymousClass3) create(str, htJ)).invokeSuspend(Unit.INSTANCE);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(AbstractC3358CGz abstractC3358CGz, LinkDeviceKeyRevocationRetrier linkDeviceKeyRevocationRetrier, LinkDeviceKeys linkDeviceKeys, HtJ<? super AnonymousClass1> htJ) {
            super(2, htJ);
            this.$userSession = abstractC3358CGz;
            this.this$0 = linkDeviceKeyRevocationRetrier;
            this.$deviceKeys = linkDeviceKeys;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new AnonymousClass1(this.$userSession, this.this$0, this.$deviceKeys, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                HatchGatewayConnection gateway = HatchGatewayServiceManager.INSTANCE.getGateway(this.$userSession);
                C60I c60iA03 = C3rb.A03(new AnonymousClass2(null), GDB.A01(new LinkDeviceKeyRevocationRetrier$1$invokeSuspend$$inlined$map$1(gateway.gatewayState, gateway)), this.this$0.wakeups);
                AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.$deviceKeys, null);
                this.L$0 = null;
                this.label = 1;
                if (C3pU.A00(this, anonymousClass3, c60iA03) == enumC10460Hji) {
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
            return ((AnonymousClass1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* loaded from: classes4.dex */
    public final class Companion {
        public final void start(AbstractC3358CGz abstractC3358CGz) {
            C7384Etj.A0Y(abstractC3358CGz, 0);
            AuraSessionManager auraSessionManager = AuraSessionManager.INSTANCE;
            if (auraSessionManager.isCurrentSession(abstractC3358CGz) && LinkDeviceKeyRevocationQueue.Companion.forSession(abstractC3358CGz).hasPending()) {
                LinkDeviceKeys linkDeviceKeysForSession = LinkDeviceKeys.Companion.forSession(abstractC3358CGz);
                if (auraSessionManager.isCurrentSession(abstractC3358CGz)) {
                    start$fbandroid_express_aura_java_com_facebook_aura_devices_token_token(abstractC3358CGz, linkDeviceKeysForSession);
                } else {
                    linkDeviceKeysForSession.clearUserData();
                }
            }
        }

        public final void start$fbandroid_express_aura_java_com_facebook_aura_devices_token_token(AbstractC3358CGz abstractC3358CGz, LinkDeviceKeys linkDeviceKeys) {
            Long value;
            AnonymousClass003.A0u(abstractC3358CGz, linkDeviceKeys);
            if (Hxb.A04(linkDeviceKeys.revokeScope)) {
                BLG<Long> blg = ((LinkDeviceKeyRevocationRetrier) abstractC3358CGz.A03(LinkDeviceKeyRevocationRetrier.class, new LinkDeviceKeyRevocationRetrier$Companion$start$1(abstractC3358CGz, linkDeviceKeys))).wakeups;
                do {
                    value = blg.getValue();
                } while (!blg.A6e(value, Long.valueOf(C3cG.A05(value) + 1)));
            }
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    @Override // X.InterfaceC7549F2g
    public void clearUserData() {
        Hxb.A03(null, this.scope);
    }

    public LinkDeviceKeyRevocationRetrier(AbstractC3358CGz abstractC3358CGz, LinkDeviceKeys linkDeviceKeys) {
        HzC hzCA02 = Hxb.A02(linkDeviceKeys.revokeScope.AEA().plus(new C8eO((HoC) linkDeviceKeys.revokeScope.AEA().get(HoC.A00))));
        this.scope = hzCA02;
        this.wakeups = new C9286GCn(0L);
        AnonymousClass001.A1J(new AnonymousClass1(abstractC3358CGz, this, linkDeviceKeys, null), hzCA02);
    }

    public /* synthetic */ LinkDeviceKeyRevocationRetrier(AbstractC3358CGz abstractC3358CGz, LinkDeviceKeys linkDeviceKeys, C06H c06h) {
        this(abstractC3358CGz, linkDeviceKeys);
    }
}
