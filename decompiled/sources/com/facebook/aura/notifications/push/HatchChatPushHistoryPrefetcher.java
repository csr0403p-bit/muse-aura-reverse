package com.facebook.aura.notifications.push;

import X.AbstractC07127nr;
import X.AbstractC3358CGz;
import X.AnonymousClass001;
import X.C06H;
import X.C3UX;
import X.C3cH;
import X.C7384Etj;
import X.EnumC10460Hji;
import X.G0U;
import X.G0V;
import X.HtJ;
import X.Hwg;
import X.Hxb;
import X.HzP;
import X.InterfaceC7549F2g;
import com.facebook.aura.common.coroutines.SingleFlight;
import com.facebook.aura.devices.pairing.LinkEncryptedPairingKt;
import com.facebook.aura.gateway.HatchGatewayConnection;
import com.facebook.aura.nodes.transport.HatchNodeOperationLease;
import com.facebook.aura.sharesheet.HatchIdeaShareImageRenderer;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* loaded from: classes2.dex */
public final class HatchChatPushHistoryPrefetcher implements InterfaceC7549F2g {
    public static final Companion Companion = new Companion();
    public final Set<String> rerunKeys;
    public final C3UX scope;
    public final SingleFlight singleFlight;
    public final AbstractC3358CGz userSession;

    @DebugMetadata(c = "com.facebook.aura.notifications.push.HatchChatPushHistoryPrefetcher$connect$2", f = "HatchChatPushHistoryPrefetcher.kt", l = {114, 115}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.notifications.push.HatchChatPushHistoryPrefetcher$connect$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC07127nr implements G0U<HtJ<? super Boolean>, Object> {
        public final /* synthetic */ HatchGatewayConnection $gateway;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(HatchGatewayConnection hatchGatewayConnection, HtJ<? super AnonymousClass2> htJ) {
            super(1, htJ);
            this.$gateway = hatchGatewayConnection;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(HtJ<?> htJ) {
            return new AnonymousClass2(this.$gateway, htJ);
        }

        @Override // X.G0U
        public final Object invoke(HtJ<? super Boolean> htJ) {
            return new AnonymousClass2(this.$gateway, htJ).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:13:0x0022  */
        @Override // X.AbstractC8884Fsp
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) {
            /*
                r6 = this;
                X.Hji r5 = X.EnumC10460Hji.A02
                int r0 = r6.label
                r4 = 2
                r3 = 1
                if (r0 == 0) goto L24
                if (r0 == r3) goto L34
                if (r0 != r4) goto L44
                X.Hwg.A00(r7)
            Lf:
                boolean r0 = X.AnonymousClass001.A1X(r7)
                if (r0 == 0) goto L22
                com.facebook.aura.gateway.HatchGatewayConnection r0 = r6.$gateway
                boolean r0 = r0.isConnected()
                if (r0 == 0) goto L22
            L1d:
                java.lang.Boolean r0 = java.lang.Boolean.valueOf(r3)
                return r0
            L22:
                r3 = 0
                goto L1d
            L24:
                X.Hwg.A00(r7)
                com.facebook.aura.gateway.HatchGatewayConnection r2 = r6.$gateway
                r6.label = r3
                r1 = 0
                r0 = 0
                java.lang.Object r0 = r2.fetchAndConnect(r0, r0, r1, r6)
                if (r0 != r5) goto L37
                return r5
            L34:
                X.Hwg.A00(r7)
            L37:
                com.facebook.aura.gateway.HatchGatewayConnection r2 = r6.$gateway
                r6.label = r4
                r0 = 10000(0x2710, double:4.9407E-320)
                java.lang.Object r7 = r2.awaitConnected(r0, r6)
                if (r7 != r5) goto Lf
                return r5
            L44:
                java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.notifications.push.HatchChatPushHistoryPrefetcher.AnonymousClass2.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @DebugMetadata(c = "com.facebook.aura.notifications.push.HatchChatPushHistoryPrefetcher", f = "HatchChatPushHistoryPrefetcher.kt", l = {72, HatchIdeaShareImageRenderer.TEXT_LEFT, 81, 89, 96}, m = "fetchAndCache", v = 2)
    /* renamed from: com.facebook.aura.notifications.push.HatchChatPushHistoryPrefetcher$fetchAndCache$1, reason: invalid class name */
    public final class AnonymousClass1 extends HzP {
        public long J$0;
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public Object L$4;
        public Object L$5;
        public int label;
        public /* synthetic */ Object result;

        public AnonymousClass1(HtJ<? super AnonymousClass1> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HatchChatPushHistoryPrefetcher.this.fetchAndCache(null, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.notifications.push.HatchChatPushHistoryPrefetcher$prefetch$1", f = "HatchChatPushHistoryPrefetcher.kt", l = {LinkEncryptedPairingKt.LINK_PUBLIC_KEY_SIZE}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.notifications.push.HatchChatPushHistoryPrefetcher$prefetch$1, reason: invalid class name and case insensitive filesystem */
    public final class C127801 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ String $key;
        public final /* synthetic */ String $threadId;
        public int label;

        @DebugMetadata(c = "com.facebook.aura.notifications.push.HatchChatPushHistoryPrefetcher$prefetch$1$1", f = "HatchChatPushHistoryPrefetcher.kt", l = {LinkEncryptedPairingKt.LINK_PUBLIC_KEY_SIZE}, m = "invokeSuspend", v = 2)
        /* renamed from: com.facebook.aura.notifications.push.HatchChatPushHistoryPrefetcher$prefetch$1$1, reason: invalid class name and collision with other inner class name */
        public final class C02551 extends AbstractC07127nr implements G0U<HtJ<? super Unit>, Object> {
            public final /* synthetic */ String $threadId;
            public int label;
            public final /* synthetic */ HatchChatPushHistoryPrefetcher this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C02551(HatchChatPushHistoryPrefetcher hatchChatPushHistoryPrefetcher, String str, HtJ<? super C02551> htJ) {
                super(1, htJ);
                this.this$0 = hatchChatPushHistoryPrefetcher;
                this.$threadId = str;
            }

            @Override // X.AbstractC8884Fsp
            public final HtJ<Unit> create(HtJ<?> htJ) {
                return new C02551(this.this$0, this.$threadId, htJ);
            }

            @Override // X.AbstractC8884Fsp
            public final Object invokeSuspend(Object obj) {
                EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
                int i = this.label;
                if (i == 0) {
                    Hwg.A00(obj);
                    HatchChatPushHistoryPrefetcher hatchChatPushHistoryPrefetcher = this.this$0;
                    String str = this.$threadId;
                    this.label = 1;
                    if (hatchChatPushHistoryPrefetcher.fetchAndCache(str, this) == enumC10460Hji) {
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

            @Override // X.G0U
            public final Object invoke(HtJ<? super Unit> htJ) {
                return ((C02551) create(htJ)).invokeSuspend(Unit.INSTANCE);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C127801(String str, String str2, HtJ<? super C127801> htJ) {
            super(2, htJ);
            this.$key = str;
            this.$threadId = str2;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return HatchChatPushHistoryPrefetcher.this.new C127801(this.$key, this.$threadId, htJ);
        }

        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        /* JADX WARN: Removed duplicated region for block: B:13:0x003d A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0018  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x003b -> B:6:0x000c). Please report as a decompilation issue!!! */
        @Override // X.AbstractC8884Fsp
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r9) {
            /*
                r8 = this;
                X.Hji r7 = X.EnumC10460Hji.A02
                int r0 = r8.label
                r6 = 1
                if (r0 == 0) goto L1b
                if (r0 != r6) goto L3e
                X.Hwg.A00(r9)
            Lc:
                com.facebook.aura.notifications.push.HatchChatPushHistoryPrefetcher r0 = com.facebook.aura.notifications.push.HatchChatPushHistoryPrefetcher.this
                java.util.Set<java.lang.String> r1 = r0.rerunKeys
                java.lang.String r0 = r8.$key
                boolean r0 = r1.remove(r0)
                if (r0 != 0) goto L1e
                kotlin.Unit r7 = kotlin.Unit.INSTANCE
                return r7
            L1b:
                X.Hwg.A00(r9)
            L1e:
                com.facebook.aura.notifications.push.HatchChatPushHistoryPrefetcher r0 = com.facebook.aura.notifications.push.HatchChatPushHistoryPrefetcher.this
                java.util.Set<java.lang.String> r1 = r0.rerunKeys
                java.lang.String r0 = r8.$key
                r1.remove(r0)
                com.facebook.aura.notifications.push.HatchChatPushHistoryPrefetcher r5 = com.facebook.aura.notifications.push.HatchChatPushHistoryPrefetcher.this
                com.facebook.aura.common.coroutines.SingleFlight r4 = r5.singleFlight
                java.lang.String r3 = r8.$key
                java.lang.String r2 = r8.$threadId
                r1 = 0
                com.facebook.aura.notifications.push.HatchChatPushHistoryPrefetcher$prefetch$1$1 r0 = new com.facebook.aura.notifications.push.HatchChatPushHistoryPrefetcher$prefetch$1$1
                r0.<init>(r5, r2, r1)
                r8.label = r6
                java.lang.Object r0 = r4.invoke(r3, r0, r8)
                if (r0 != r7) goto Lc
                return r7
            L3e:
                java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.notifications.push.HatchChatPushHistoryPrefetcher.C127801.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ((C127801) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x009b A[Catch: Exception -> 0x0178, CancellationException -> 0x0181, TryCatch #2 {CancellationException -> 0x0181, Exception -> 0x0178, blocks: (B:78:0x0164, B:79:0x0167, B:60:0x011f, B:61:0x0122, B:63:0x0126, B:65:0x012a, B:67:0x012e, B:69:0x0132, B:71:0x0138, B:75:0x0146, B:80:0x0175, B:48:0x00dd, B:49:0x00e0, B:51:0x00e6, B:53:0x00ee, B:55:0x00fc, B:57:0x00ff, B:40:0x00ca, B:41:0x00cd, B:32:0x009b, B:33:0x009f, B:35:0x00a5, B:37:0x00b3, B:45:0x00d9, B:43:0x00d3, B:26:0x0081, B:27:0x0084, B:29:0x008e, B:23:0x0072), top: B:88:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00a5 A[Catch: Exception -> 0x0178, CancellationException -> 0x0181, TryCatch #2 {CancellationException -> 0x0181, Exception -> 0x0178, blocks: (B:78:0x0164, B:79:0x0167, B:60:0x011f, B:61:0x0122, B:63:0x0126, B:65:0x012a, B:67:0x012e, B:69:0x0132, B:71:0x0138, B:75:0x0146, B:80:0x0175, B:48:0x00dd, B:49:0x00e0, B:51:0x00e6, B:53:0x00ee, B:55:0x00fc, B:57:0x00ff, B:40:0x00ca, B:41:0x00cd, B:32:0x009b, B:33:0x009f, B:35:0x00a5, B:37:0x00b3, B:45:0x00d9, B:43:0x00d3, B:26:0x0081, B:27:0x0084, B:29:0x008e, B:23:0x0072), top: B:88:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00e6 A[Catch: Exception -> 0x0178, CancellationException -> 0x0181, TryCatch #2 {CancellationException -> 0x0181, Exception -> 0x0178, blocks: (B:78:0x0164, B:79:0x0167, B:60:0x011f, B:61:0x0122, B:63:0x0126, B:65:0x012a, B:67:0x012e, B:69:0x0132, B:71:0x0138, B:75:0x0146, B:80:0x0175, B:48:0x00dd, B:49:0x00e0, B:51:0x00e6, B:53:0x00ee, B:55:0x00fc, B:57:0x00ff, B:40:0x00ca, B:41:0x00cd, B:32:0x009b, B:33:0x009f, B:35:0x00a5, B:37:0x00b3, B:45:0x00d9, B:43:0x00d3, B:26:0x0081, B:27:0x0084, B:29:0x008e, B:23:0x0072), top: B:88:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00ee A[Catch: Exception -> 0x0178, CancellationException -> 0x0181, TryCatch #2 {CancellationException -> 0x0181, Exception -> 0x0178, blocks: (B:78:0x0164, B:79:0x0167, B:60:0x011f, B:61:0x0122, B:63:0x0126, B:65:0x012a, B:67:0x012e, B:69:0x0132, B:71:0x0138, B:75:0x0146, B:80:0x0175, B:48:0x00dd, B:49:0x00e0, B:51:0x00e6, B:53:0x00ee, B:55:0x00fc, B:57:0x00ff, B:40:0x00ca, B:41:0x00cd, B:32:0x009b, B:33:0x009f, B:35:0x00a5, B:37:0x00b3, B:45:0x00d9, B:43:0x00d3, B:26:0x0081, B:27:0x0084, B:29:0x008e, B:23:0x0072), top: B:88:0x0023 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object fetchAndCache(java.lang.String r16, X.HtJ<? super kotlin.Unit> r17) {
        /*
            Method dump skipped, instructions count: 387
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.notifications.push.HatchChatPushHistoryPrefetcher.fetchAndCache(java.lang.String, X.HtJ):java.lang.Object");
    }

    @Override // X.InterfaceC7549F2g
    public void clearUserData() {
        this.singleFlight.clearAndCancelAll();
        Hxb.A03(null, this.scope);
    }

    public final void prefetch(String str) {
        String str2 = str == null ? "primary_session_id" : str;
        if (this.singleFlight.hasActiveJobForKey(str2)) {
            this.rerunKeys.add(str2);
        } else {
            AnonymousClass001.A1J(new C127801(str2, str, null), this.scope);
        }
    }

    public final class Companion {
        public final HatchChatPushHistoryPrefetcher getInstance(AbstractC3358CGz abstractC3358CGz) {
            C7384Etj.A0Y(abstractC3358CGz, 0);
            return (HatchChatPushHistoryPrefetcher) abstractC3358CGz.A03(HatchChatPushHistoryPrefetcher.class, new HatchChatPushHistoryPrefetcher$Companion$getInstance$1(abstractC3358CGz));
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public HatchChatPushHistoryPrefetcher(AbstractC3358CGz abstractC3358CGz) {
        this.userSession = abstractC3358CGz;
        this.scope = C3cH.A0x(AnonymousClass001.A0y());
        this.singleFlight = C3cH.A0M();
        ConcurrentHashMap.KeySetView keySetViewNewKeySet = ConcurrentHashMap.newKeySet();
        C7384Etj.A0U(keySetViewNewKeySet);
        this.rerunKeys = keySetViewNewKeySet;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object connect(HatchGatewayConnection hatchGatewayConnection, HtJ<? super Boolean> htJ) {
        return !hatchGatewayConnection.isConnected() ? HatchNodeOperationLease.INSTANCE.withLease("push_history_prefetch", new AnonymousClass2(hatchGatewayConnection, null), htJ) : AnonymousClass001.A0i();
    }

    public /* synthetic */ HatchChatPushHistoryPrefetcher(AbstractC3358CGz abstractC3358CGz, C06H c06h) {
        this(abstractC3358CGz);
    }
}
