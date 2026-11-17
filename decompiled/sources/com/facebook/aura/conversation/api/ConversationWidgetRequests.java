package com.facebook.aura.conversation.api;

import X.AbstractC05643uj;
import X.AbstractC07127nr;
import X.AbstractC0878AGe;
import X.AbstractC3358CGz;
import X.AnonymousClass001;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.BLG;
import X.C06G;
import X.C06H;
import X.C0881AGi;
import X.C0KA;
import X.C20Q;
import X.C20Z;
import X.C3UX;
import X.C3cG;
import X.C3cH;
import X.C7384Etj;
import X.EnumC10460Hji;
import X.G0V;
import X.GDB;
import X.HnJ;
import X.Hr7;
import X.HtJ;
import X.Hwg;
import X.HyO;
import X.HzP;
import X.InterfaceC10560Hsz;
import X.InterfaceC7549F2g;
import android.os.SystemClock;
import com.facebook.aura.network.transport.flipper.FlipperNoiseReporter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* loaded from: classes2.dex */
public final class ConversationWidgetRequests implements InterfaceC7549F2g {
    public static final int $stable = 8;
    public static final long ANSWER_TIMEOUT_MS = 1000;
    public static final Companion Companion = new Companion();
    public static final long OBSERVER_GRACE_MS = 1500;
    public static final String TAG = "ConversationWidgets";
    public final AtomicLong nextToken;
    public final BLG<List<Observer>> observers;
    public final BLG<List<PendingRequest>> pending;

    public final class Observer extends C06G {
        public final String conversationId;
        public final boolean isOnScreen;
        public final boolean isPrimaryChat;
        public final long onScreenSinceElapsedMs;
        public final long token;

        public Observer(long j, String str, boolean z, boolean z2, long j2) {
            C7384Etj.A0Y(str, 1);
            this.token = j;
            this.conversationId = str;
            this.isPrimaryChat = z;
            this.isOnScreen = z2;
            this.onScreenSinceElapsedMs = j2;
        }

        public final Observer copy(long j, String str, boolean z, boolean z2, long j2) {
            C7384Etj.A0Y(str, 1);
            return new Observer(j, str, z, z2, j2);
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof Observer) {
                    Observer observer = (Observer) obj;
                    if (this.token != observer.token || !C7384Etj.areEqual(this.conversationId, observer.conversationId) || this.isPrimaryChat != observer.isPrimaryChat || this.isOnScreen != observer.isOnScreen || this.onScreenSinceElapsedMs != observer.onScreenSinceElapsedMs) {
                    }
                }
                return false;
            }
            return true;
        }

        public static /* synthetic */ Observer copy$default(Observer observer, long j, String str, boolean z, boolean z2, long j2, int i, Object obj) {
            if ((i & 1) != 0) {
                j = observer.token;
            }
            if ((i & 2) != 0) {
                str = observer.conversationId;
            }
            if ((i & 4) != 0) {
                z = observer.isPrimaryChat;
            }
            if ((i & 8) != 0) {
                z2 = observer.isOnScreen;
            }
            if ((i & 16) != 0) {
                j2 = observer.onScreenSinceElapsedMs;
            }
            return observer.copy(j, str, z, z2, j2);
        }

        public final long component1() {
            return this.token;
        }

        public final String component2() {
            return this.conversationId;
        }

        public final boolean component3() {
            return this.isPrimaryChat;
        }

        public final boolean component4() {
            return this.isOnScreen;
        }

        public final long component5() {
            return this.onScreenSinceElapsedMs;
        }

        public final String getConversationId() {
            return this.conversationId;
        }

        public final long getOnScreenSinceElapsedMs() {
            return this.onScreenSinceElapsedMs;
        }

        public final long getToken() {
            return this.token;
        }

        public int hashCode() {
            return C0KA.A01(C0KA.A01(AnonymousClass005.A0I(this.conversationId, C3cG.A02(this.token) * 31), this.isPrimaryChat), this.isOnScreen) + C3cG.A02(this.onScreenSinceElapsedMs);
        }

        public final boolean isOnScreen() {
            return this.isOnScreen;
        }

        public final boolean isPrimaryChat() {
            return this.isPrimaryChat;
        }

        public String toString() {
            return super.toString();
        }

        public /* synthetic */ Observer(long j, String str, boolean z, boolean z2, long j2, int i, C06H c06h) {
            this(j, str, z, C3cG.A1K(i & 8, z2), C3cH.A03(i & 16, j2));
        }
    }

    public final class PendingRequest {
        public final long observerToken;
        public final ConversationWidgetRequest request;

        public PendingRequest(long j, ConversationWidgetRequest conversationWidgetRequest) {
            C7384Etj.A0Y(conversationWidgetRequest, 1);
            this.observerToken = j;
            this.request = conversationWidgetRequest;
        }

        public final long getObserverToken() {
            return this.observerToken;
        }

        public final ConversationWidgetRequest getRequest() {
            return this.request;
        }
    }

    @DebugMetadata(c = "com.facebook.aura.conversation.api.ConversationWidgetRequests", f = "ConversationWidgetRequests.kt", l = {FlipperNoiseReporter.SWITCHING_PROTOCOLS_STATUS_CODE}, m = "ask", v = 2)
    /* renamed from: com.facebook.aura.conversation.api.ConversationWidgetRequests$ask$1, reason: invalid class name */
    public final class AnonymousClass1 extends HzP {
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public int label;
        public /* synthetic */ Object result;

        public AnonymousClass1(HtJ<? super AnonymousClass1> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ConversationWidgetRequests.this.ask(null, null, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.conversation.api.ConversationWidgetRequests$ask$4", f = "ConversationWidgetRequests.kt", l = {FlipperNoiseReporter.SWITCHING_PROTOCOLS_STATUS_CODE}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.conversation.api.ConversationWidgetRequests$ask$4, reason: invalid class name */
    public final class AnonymousClass4 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super FoundWidget>, Object> {
        public final /* synthetic */ ConversationWidgetRequest $request;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(ConversationWidgetRequest conversationWidgetRequest, HtJ<? super AnonymousClass4> htJ) {
            super(2, htJ);
            this.$request = conversationWidgetRequest;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new AnonymousClass4(this.$request, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                InterfaceC10560Hsz<FoundWidget> interfaceC10560Hsz = this.$request.answer;
                this.label = 1;
                obj = C3cG.A0W(interfaceC10560Hsz, this);
                if (obj == enumC10460Hji) {
                    return enumC10460Hji;
                }
            } else {
                if (i != 1) {
                    throw AnonymousClass001.A0n();
                }
                Hwg.A00(obj);
            }
            return obj;
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super FoundWidget> htJ) {
            return new AnonymousClass4(this.$request, htJ).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.conversation.api.ConversationWidgetRequests", f = "ConversationWidgetRequests.kt", l = {72, 73}, m = "find", v = 2)
    /* renamed from: com.facebook.aura.conversation.api.ConversationWidgetRequests$find$1, reason: invalid class name and case insensitive filesystem */
    public final class C113391<W> extends HzP {
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public int label;
        public /* synthetic */ Object result;

        public C113391(HtJ<? super C113391> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ConversationWidgetRequests.this.find(null, null, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.conversation.api.ConversationWidgetRequests$observe$1", f = "ConversationWidgetRequests.kt", l = {60}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.conversation.api.ConversationWidgetRequests$observe$1, reason: invalid class name and case insensitive filesystem */
    public final class C113401 extends AbstractC07127nr implements G0V<HyO<? super ConversationWidgetRequest>, HtJ<? super Unit>, Object> {
        public final /* synthetic */ String $conversationId;
        public final /* synthetic */ C20Q<Boolean> $isOnScreen;
        public final /* synthetic */ boolean $isPrimaryChat;
        public long J$0;
        public /* synthetic */ Object L$0;
        public Object L$1;
        public int label;

        @DebugMetadata(c = "com.facebook.aura.conversation.api.ConversationWidgetRequests$observe$1$1", f = "ConversationWidgetRequests.kt", l = {58}, m = "invokeSuspend", v = 2)
        /* renamed from: com.facebook.aura.conversation.api.ConversationWidgetRequests$observe$1$1, reason: invalid class name and collision with other inner class name */
        public final class C00921 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
            public final /* synthetic */ C20Q<Boolean> $isOnScreen;
            public final /* synthetic */ long $token;
            public int label;
            public final /* synthetic */ ConversationWidgetRequests this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C00921(C20Q<Boolean> c20q, ConversationWidgetRequests conversationWidgetRequests, long j, HtJ<? super C00921> htJ) {
                super(2, htJ);
                this.$isOnScreen = c20q;
                this.this$0 = conversationWidgetRequests;
                this.$token = j;
            }

            @Override // X.AbstractC8884Fsp
            public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
                return new C00921(this.$isOnScreen, this.this$0, this.$token, htJ);
            }

            @Override // X.AbstractC8884Fsp
            public final Object invokeSuspend(Object obj) {
                EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
                int i = this.label;
                if (i == 0) {
                    Hwg.A00(obj);
                    C20Q c20qA01 = GDB.A01(this.$isOnScreen);
                    final ConversationWidgetRequests conversationWidgetRequests = this.this$0;
                    final long j = this.$token;
                    C20Z c20z = new C20Z() { // from class: com.facebook.aura.conversation.api.ConversationWidgetRequests.observe.1.1.1
                        @Override // X.C20Z
                        public /* bridge */ /* synthetic */ Object emit(Object obj2, HtJ htJ) {
                            return emit(AnonymousClass001.A1X(obj2), (HtJ<? super Unit>) htJ);
                        }

                        public final Object emit(boolean z, HtJ<? super Unit> htJ) {
                            conversationWidgetRequests.updateOnScreen(j, z);
                            return Unit.INSTANCE;
                        }
                    };
                    this.label = 1;
                    if (c20qA01.collect(c20z, this) == enumC10460Hji) {
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
                return ((C00921) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
            }
        }

        /* renamed from: com.facebook.aura.conversation.api.ConversationWidgetRequests$observe$1$2, reason: invalid class name */
        public final class AnonymousClass2<T> implements C20Z {
            public final /* synthetic */ HyO<ConversationWidgetRequest> $$this$channelFlow;
            public final /* synthetic */ Set<ConversationWidgetRequest> $delivered;
            public final /* synthetic */ long $token;

            /* JADX WARN: Multi-variable type inference failed */
            public AnonymousClass2(Set<ConversationWidgetRequest> set, long j, HyO<? super ConversationWidgetRequest> hyO) {
                this.$delivered = set;
                this.$token = j;
                this.$$this$channelFlow = hyO;
            }

            @Override // X.C20Z
            public /* bridge */ /* synthetic */ Object emit(Object obj, HtJ htJ) {
                return emit((List<PendingRequest>) obj, (HtJ<? super Unit>) htJ);
            }

            /* JADX WARN: Removed duplicated region for block: B:29:0x00a6  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(java.util.List<com.facebook.aura.conversation.api.ConversationWidgetRequests.PendingRequest> r12, X.HtJ<? super kotlin.Unit> r13) {
                /*
                    r11 = this;
                    boolean r0 = r13 instanceof com.facebook.aura.conversation.api.ConversationWidgetRequests$observe$1$2$emit$1
                    if (r0 == 0) goto La6
                    r6 = r13
                    com.facebook.aura.conversation.api.ConversationWidgetRequests$observe$1$2$emit$1 r6 = (com.facebook.aura.conversation.api.ConversationWidgetRequests$observe$1$2$emit$1) r6
                    int r2 = r6.label
                    r1 = -2147483648(0xffffffff80000000, float:-0.0)
                    r0 = r2 & r1
                    if (r0 == 0) goto La6
                    int r2 = r2 - r1
                    r6.label = r2
                L12:
                    java.lang.Object r1 = r6.result
                    X.Hji r7 = X.EnumC10460Hji.A02
                    int r0 = r6.label
                    r5 = 1
                    if (r0 == 0) goto L56
                    if (r0 != r5) goto Lb0
                    java.lang.Object r2 = r6.L$5
                    java.util.Iterator r2 = (java.util.Iterator) r2
                    java.lang.Object r4 = r6.L$4
                    X.HxO r4 = (X.HxO) r4
                    java.lang.Object r3 = r6.L$3
                    java.util.Set r3 = (java.util.Set) r3
                    X.Hwg.A00(r1)
                L2c:
                    boolean r0 = r2.hasNext()
                    if (r0 == 0) goto Lad
                    java.lang.Object r1 = r2.next()
                    boolean r0 = r3.add(r1)
                    if (r0 == 0) goto L2c
                    r0 = 0
                    r6.L$0 = r0
                    r6.L$1 = r0
                    r6.L$2 = r0
                    r6.L$3 = r3
                    r6.L$4 = r4
                    r6.L$5 = r2
                    r6.L$6 = r0
                    r6.L$7 = r0
                    r6.label = r5
                    java.lang.Object r0 = r4.AcU(r1, r6)
                    if (r0 != r7) goto L2c
                    return r7
                L56:
                    X.Hwg.A00(r1)
                    long r3 = r11.$token
                    java.util.ArrayList r10 = X.C3cG.A0h()
                    java.util.Iterator r9 = r12.iterator()
                L63:
                    boolean r0 = r9.hasNext()
                    if (r0 == 0) goto L7a
                    java.lang.Object r8 = r9.next()
                    r0 = r8
                    com.facebook.aura.conversation.api.ConversationWidgetRequests$PendingRequest r0 = (com.facebook.aura.conversation.api.ConversationWidgetRequests.PendingRequest) r0
                    long r1 = r0.observerToken
                    int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
                    if (r0 != 0) goto L63
                    r10.add(r8)
                    goto L63
                L7a:
                    java.util.ArrayList r2 = X.AnonymousClass003.A0i(r10)
                    java.util.Iterator r1 = r10.iterator()
                L82:
                    boolean r0 = r1.hasNext()
                    if (r0 == 0) goto L94
                    java.lang.Object r0 = r1.next()
                    com.facebook.aura.conversation.api.ConversationWidgetRequests$PendingRequest r0 = (com.facebook.aura.conversation.api.ConversationWidgetRequests.PendingRequest) r0
                    com.facebook.aura.conversation.api.ConversationWidgetRequest r0 = r0.request
                    r2.add(r0)
                    goto L82
                L94:
                    java.util.Set<com.facebook.aura.conversation.api.ConversationWidgetRequest> r1 = r11.$delivered
                    java.util.Set r0 = X.AbstractC0878AGe.A0g(r2)
                    r1.retainAll(r0)
                    java.util.Set<com.facebook.aura.conversation.api.ConversationWidgetRequest> r3 = r11.$delivered
                    X.HyO<com.facebook.aura.conversation.api.ConversationWidgetRequest> r4 = r11.$$this$channelFlow
                    java.util.Iterator r2 = r2.iterator()
                    goto L2c
                La6:
                    com.facebook.aura.conversation.api.ConversationWidgetRequests$observe$1$2$emit$1 r6 = new com.facebook.aura.conversation.api.ConversationWidgetRequests$observe$1$2$emit$1
                    r6.<init>(r11, r13)
                    goto L12
                Lad:
                    kotlin.Unit r7 = kotlin.Unit.INSTANCE
                    return r7
                Lb0:
                    java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
                    throw r0
                */
                throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.conversation.api.ConversationWidgetRequests.C113401.AnonymousClass2.emit(java.util.List, X.HtJ):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C113401(String str, boolean z, C20Q<Boolean> c20q, HtJ<? super C113401> htJ) {
            super(2, htJ);
            this.$conversationId = str;
            this.$isPrimaryChat = z;
            this.$isOnScreen = c20q;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            C113401 c113401 = ConversationWidgetRequests.this.new C113401(this.$conversationId, this.$isPrimaryChat, this.$isOnScreen, htJ);
            c113401.L$0 = obj;
            return c113401;
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            long jRegister;
            HyO hyO = (HyO) this.L$0;
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            try {
                if (i == 0) {
                    Hwg.A00(obj);
                    jRegister = ConversationWidgetRequests.this.register(this.$conversationId, this.$isPrimaryChat);
                    AnonymousClass001.A1J(new C00921(this.$isOnScreen, ConversationWidgetRequests.this, jRegister, null), hyO);
                    LinkedHashSet linkedHashSetA0k = C3cG.A0k();
                    BLG<List<PendingRequest>> blg = ConversationWidgetRequests.this.pending;
                    AnonymousClass2 anonymousClass2 = new AnonymousClass2(linkedHashSetA0k, jRegister, hyO);
                    this.L$0 = null;
                    this.L$1 = null;
                    this.J$0 = jRegister;
                    this.label = 1;
                    if (blg.collect(anonymousClass2, this) == enumC10460Hji) {
                        return enumC10460Hji;
                    }
                } else {
                    if (i != 1) {
                        throw AnonymousClass001.A0n();
                    }
                    jRegister = this.J$0;
                    Hwg.A00(obj);
                }
                throw C3cG.A0p();
            } catch (Throwable th) {
                ConversationWidgetRequests.this.unregister(jRegister);
                throw th;
            }
        }

        @Override // X.G0V
        public final Object invoke(HyO<? super ConversationWidgetRequest> hyO, HtJ<? super Unit> htJ) {
            return ((C113401) create(hyO, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x004d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x008c A[PHI: r2 r4 r9
  0x008c: PHI (r2v2 java.lang.Class<W>) = (r2v1 java.lang.Class<W>), (r2v5 java.lang.Class<W>) binds: [B:29:0x008b, B:13:0x0033] A[DONT_GENERATE, DONT_INLINE]
  0x008c: PHI (r4v8 com.facebook.aura.conversation.api.FoundWidget) = (r4v6 com.facebook.aura.conversation.api.FoundWidget), (r4v11 com.facebook.aura.conversation.api.FoundWidget) binds: [B:29:0x008b, B:13:0x0033] A[DONT_GENERATE, DONT_INLINE]
  0x008c: PHI (r9v2 java.lang.Object) = (r9v11 java.lang.Object), (r9v12 java.lang.Object) binds: [B:29:0x008b, B:13:0x0033] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0095  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final <W> java.lang.Object find(java.lang.String r12, java.lang.Class<W> r13, X.HtJ<? super com.facebook.aura.conversation.api.ConversationWidgetMatch<? extends W>> r14) {
        /*
            r11 = this;
            r4 = r14
            r2 = r13
            r9 = r12
            boolean r0 = r14 instanceof com.facebook.aura.conversation.api.ConversationWidgetRequests.C113391
            if (r0 == 0) goto L8f
            r8 = r4
            com.facebook.aura.conversation.api.ConversationWidgetRequests$find$1 r8 = (com.facebook.aura.conversation.api.ConversationWidgetRequests.C113391) r8
            int r3 = r8.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r3 & r1
            if (r0 == 0) goto L8f
            int r3 = r3 - r1
            r8.label = r3
        L15:
            java.lang.Object r4 = r8.result
            X.Hji r7 = X.EnumC10460Hji.A02
            int r0 = r8.label
            r6 = 2
            r5 = 1
            r3 = 0
            if (r0 == 0) goto L4e
            if (r0 == r5) goto L65
            if (r0 != r6) goto Lad
            java.lang.Object r1 = r8.L$2
            com.facebook.aura.conversation.api.ConversationWidgetRequests$Observer r1 = (com.facebook.aura.conversation.api.ConversationWidgetRequests.Observer) r1
            java.lang.Object r2 = r8.L$1
            java.lang.Class r2 = (java.lang.Class) r2
            java.lang.Object r9 = r8.L$0
            X.Hwg.A00(r4)
        L31:
            com.facebook.aura.conversation.api.FoundWidget r4 = (com.facebook.aura.conversation.api.FoundWidget) r4
            if (r1 == 0) goto L8c
            java.lang.String r10 = r1.conversationId
            boolean r0 = r1.isPrimaryChat
            java.lang.Boolean r11 = java.lang.Boolean.valueOf(r0)
        L3d:
            if (r4 != 0) goto L40
            r5 = 0
        L40:
            java.lang.Boolean r12 = java.lang.Boolean.valueOf(r5)
            java.lang.String r13 = "ConversationWidgets"
            java.lang.String r14 = "Find widget %s conversation=%s primary=%b found=%b"
            X.CFK.A00(r9, r10, r11, r12, r13, r14)
            if (r4 != 0) goto L95
            return r3
        L4e:
            X.Hwg.A00(r4)
            com.facebook.aura.conversation.api.ConversationWidgetRequests$find$observer$1 r4 = new com.facebook.aura.conversation.api.ConversationWidgetRequests$find$observer$1
            r4.<init>(r11, r3)
            r8.L$0 = r12
            r8.L$1 = r13
            r8.label = r5
            r0 = 1500(0x5dc, double:7.41E-321)
            java.lang.Object r4 = X.GAX.A01(r8, r4, r0)
            if (r4 != r7) goto L6f
        L64:
            return r7
        L65:
            java.lang.Object r2 = r8.L$1
            java.lang.Class r2 = (java.lang.Class) r2
            java.lang.Object r0 = r8.L$0
            java.lang.String r9 = X.C3cG.A0d(r0, r4)
        L6f:
            com.facebook.aura.conversation.api.ConversationWidgetRequests$Observer r4 = (com.facebook.aura.conversation.api.ConversationWidgetRequests.Observer) r4
            if (r4 == 0) goto L8b
            com.facebook.aura.conversation.api.ConversationWidgetRequest r0 = new com.facebook.aura.conversation.api.ConversationWidgetRequest
            r0.<init>(r9)
            r8.L$0 = r9
            r8.L$1 = r2
            r8.L$2 = r4
            r8.L$3 = r3
            r8.label = r6
            java.lang.Object r0 = r11.ask(r4, r0, r8)
            if (r0 == r7) goto L64
            r1 = r4
            r4 = r0
            goto L31
        L8b:
            r4 = r3
        L8c:
            r10 = r3
            r11 = r3
            goto L3d
        L8f:
            com.facebook.aura.conversation.api.ConversationWidgetRequests$find$1 r8 = new com.facebook.aura.conversation.api.ConversationWidgetRequests$find$1
            r8.<init>(r14)
            goto L15
        L95:
            java.lang.Object r1 = r4.widget
            boolean r0 = r2.isInstance(r1)
            if (r0 != 0) goto L9e
            r1 = r3
        L9e:
            java.lang.Object r2 = r2.cast(r1)
            if (r2 != 0) goto La5
            return r3
        La5:
            boolean r1 = r4.isNewestOfKind
            com.facebook.aura.conversation.api.ConversationWidgetMatch r0 = new com.facebook.aura.conversation.api.ConversationWidgetMatch
            r0.<init>(r2, r1)
            return r0
        Lad:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.conversation.api.ConversationWidgetRequests.find(java.lang.String, java.lang.Class, X.HtJ):java.lang.Object");
    }

    public final C20Q<ConversationWidgetRequest> observe(String str, boolean z, C20Q<Boolean> c20q) {
        AnonymousClass003.A0v(str, c20q);
        return AbstractC05643uj.A01(new C113401(str, z, c20q, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0020  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0091  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object ask(com.facebook.aura.conversation.api.ConversationWidgetRequests.Observer r13, com.facebook.aura.conversation.api.ConversationWidgetRequest r14, X.HtJ<? super com.facebook.aura.conversation.api.FoundWidget> r15) {
        /*
            r12 = this;
            boolean r0 = r15 instanceof com.facebook.aura.conversation.api.ConversationWidgetRequests.AnonymousClass1
            if (r0 == 0) goto L20
            r7 = r15
            com.facebook.aura.conversation.api.ConversationWidgetRequests$ask$1 r7 = (com.facebook.aura.conversation.api.ConversationWidgetRequests.AnonymousClass1) r7
            int r2 = r7.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L20
            int r2 = r2 - r1
            r7.label = r2
        L12:
            java.lang.Object r1 = r7.result
            X.Hji r6 = X.EnumC10460Hji.A02
            int r0 = r7.label
            r8 = 1
            if (r0 == 0) goto L2a
            if (r0 != r8) goto Lbd
            java.lang.Object r3 = r7.L$2
            goto L26
        L20:
            com.facebook.aura.conversation.api.ConversationWidgetRequests$ask$1 r7 = new com.facebook.aura.conversation.api.ConversationWidgetRequests$ask$1
            r7.<init>(r15)
            goto L12
        L26:
            X.Hwg.A00(r1)     // Catch: java.lang.Throwable -> La8
            goto L93
        L2a:
            X.Hwg.A00(r1)
            long r0 = r13.token
            com.facebook.aura.conversation.api.ConversationWidgetRequests$PendingRequest r3 = new com.facebook.aura.conversation.api.ConversationWidgetRequests$PendingRequest
            r3.<init>(r0, r14)
            X.BLG<java.util.List<com.facebook.aura.conversation.api.ConversationWidgetRequests$PendingRequest>> r2 = r12.pending
        L36:
            java.lang.Object r1 = r2.getValue()
            r0 = r1
            java.util.Collection r0 = (java.util.Collection) r0
            java.util.ArrayList r0 = X.AbstractC0878AGe.A0Q(r3, r0)
            boolean r0 = r2.A6e(r1, r0)
            if (r0 == 0) goto L36
            X.BLG<java.util.List<com.facebook.aura.conversation.api.ConversationWidgetRequests$Observer>> r0 = r12.observers
            java.lang.Object r1 = r0.getValue()
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            boolean r0 = r1 instanceof java.util.Collection
            r10 = 0
            if (r0 == 0) goto L60
            boolean r0 = X.C3cG.A1N(r1)
            if (r0 == 0) goto L60
        L5a:
            X.Hsz<com.facebook.aura.conversation.api.FoundWidget> r0 = r14.answer
            X.C3cG.A1F(r0, r10)
            goto L7c
        L60:
            java.util.Iterator r11 = r1.iterator()
        L64:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto L5a
            java.lang.Object r9 = r11.next()
            com.facebook.aura.conversation.api.ConversationWidgetRequests$Observer r9 = (com.facebook.aura.conversation.api.ConversationWidgetRequests.Observer) r9
            long r4 = r9.token
            long r0 = r13.token
            int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r2 != 0) goto L64
            boolean r0 = r9.isOnScreen
            if (r0 == 0) goto L64
        L7c:
            com.facebook.aura.conversation.api.ConversationWidgetRequests$ask$4 r2 = new com.facebook.aura.conversation.api.ConversationWidgetRequests$ask$4     // Catch: java.lang.Throwable -> La8
            r2.<init>(r14, r10)     // Catch: java.lang.Throwable -> La8
            r7.L$0 = r10     // Catch: java.lang.Throwable -> La8
            r7.L$1 = r10     // Catch: java.lang.Throwable -> La8
            r7.L$2 = r3     // Catch: java.lang.Throwable -> La8
            r7.label = r8     // Catch: java.lang.Throwable -> La8
            r0 = 1000(0x3e8, double:4.94E-321)
            java.lang.Object r0 = X.GAX.A01(r7, r2, r0)     // Catch: java.lang.Throwable -> La8
            if (r0 == r6) goto La7
            r6 = r0
            goto L94
        L93:
            r6 = r1
        L94:
            X.BLG<java.util.List<com.facebook.aura.conversation.api.ConversationWidgetRequests$PendingRequest>> r2 = r12.pending
        L96:
            java.lang.Object r1 = r2.getValue()
            r0 = r1
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.List r0 = X.AbstractC0878AGe.A0b(r0, r3)
            boolean r0 = r2.A6e(r1, r0)
            if (r0 == 0) goto L96
        La7:
            return r6
        La8:
            r4 = move-exception
            X.BLG<java.util.List<com.facebook.aura.conversation.api.ConversationWidgetRequests$PendingRequest>> r2 = r12.pending
        Lab:
            java.lang.Object r1 = r2.getValue()
            r0 = r1
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.List r0 = X.AbstractC0878AGe.A0b(r0, r3)
            boolean r0 = r2.A6e(r1, r0)
            if (r0 != 0) goto Lc1
            goto Lab
        Lbd:
            java.lang.IllegalStateException r4 = X.AnonymousClass001.A0n()
        Lc1:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.conversation.api.ConversationWidgetRequests.ask(com.facebook.aura.conversation.api.ConversationWidgetRequests$Observer, com.facebook.aura.conversation.api.ConversationWidgetRequest, X.HtJ):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long register(String str, boolean z) {
        List<Observer> value;
        long jIncrementAndGet = this.nextToken.incrementAndGet();
        BLG<List<Observer>> blg = this.observers;
        do {
            value = blg.getValue();
        } while (!blg.A6e(value, AbstractC0878AGe.A0Q(new Observer(jIncrementAndGet, str, z, false, 0L), value)));
        return jIncrementAndGet;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void unregister(long j) {
        List<Observer> value;
        ArrayList arrayListA0h;
        BLG<List<Observer>> blg = this.observers;
        do {
            value = blg.getValue();
            arrayListA0h = C3cG.A0h();
            for (Observer observer : value) {
                if (observer.token != j) {
                    arrayListA0h.add(observer);
                }
            }
        } while (!blg.A6e(value, arrayListA0h));
        List<PendingRequest> value2 = this.pending.getValue();
        ArrayList arrayListA0h2 = C3cG.A0h();
        for (Object obj : value2) {
            if (((PendingRequest) obj).observerToken == j) {
                arrayListA0h2.add(obj);
            }
        }
        Iterator it = arrayListA0h2.iterator();
        while (it.hasNext()) {
            C3cG.A1F(((PendingRequest) it.next()).request.answer, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateOnScreen(long j, boolean z) {
        List<Observer> value;
        ArrayList arrayList;
        boolean z2;
        long j2;
        String str;
        boolean z3;
        long jElapsedRealtime;
        BLG<List<Observer>> blg = this.observers;
        do {
            value = blg.getValue();
            List<Observer> list = value;
            arrayList = new ArrayList(Hr7.A1D(list, 10));
            for (Observer observerCopy : list) {
                if (observerCopy.token == j) {
                    if (z) {
                        jElapsedRealtime = SystemClock.elapsedRealtime();
                        z2 = true;
                        j2 = observerCopy.token;
                        str = observerCopy.conversationId;
                        z3 = observerCopy.isPrimaryChat;
                    } else {
                        z2 = false;
                        j2 = observerCopy.token;
                        str = observerCopy.conversationId;
                        z3 = observerCopy.isPrimaryChat;
                        jElapsedRealtime = observerCopy.onScreenSinceElapsedMs;
                    }
                    observerCopy = observerCopy.copy(j2, str, z3, z2, jElapsedRealtime);
                }
                arrayList.add(observerCopy);
            }
        } while (!blg.A6e(value, arrayList));
    }

    @Override // X.InterfaceC7549F2g
    public void clearUserData() {
        List<PendingRequest> value = this.pending.getValue();
        BLG<List<PendingRequest>> blg = this.pending;
        C0881AGi c0881AGi = C0881AGi.A00;
        blg.Af8(c0881AGi);
        this.observers.Af8(c0881AGi);
        Iterator<PendingRequest> it = value.iterator();
        while (it.hasNext()) {
            C3cG.A1F(it.next().request.answer, null);
        }
    }

    public final class Companion {
        public final ConversationWidgetRequests getInstance(AbstractC3358CGz abstractC3358CGz) {
            C7384Etj.A0Y(abstractC3358CGz, 0);
            return (ConversationWidgetRequests) abstractC3358CGz.A03(ConversationWidgetRequests.class, ConversationWidgetRequests$Companion$getInstance$1.INSTANCE);
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Observer onScreen(List<Observer> list) {
        Object next;
        ArrayList arrayListA0h = C3cG.A0h();
        for (Observer observer : list) {
            if (observer.isOnScreen) {
                arrayListA0h.add(observer);
            }
        }
        Iterator it = arrayListA0h.iterator();
        if (it.hasNext()) {
            next = it.next();
            if (it.hasNext()) {
                long j = ((Observer) next).onScreenSinceElapsedMs;
                do {
                    Object next2 = it.next();
                    long j2 = ((Observer) next2).onScreenSinceElapsedMs;
                    if (j < j2) {
                        next = next2;
                        j = j2;
                    }
                } while (it.hasNext());
            }
        } else {
            next = null;
        }
        return (Observer) next;
    }

    public /* synthetic */ ConversationWidgetRequests(C06H c06h) {
        this();
    }

    public ConversationWidgetRequests() {
        this.nextToken = new AtomicLong();
        C0881AGi c0881AGi = C0881AGi.A00;
        this.observers = HnJ.A01(c0881AGi);
        this.pending = HnJ.A01(c0881AGi);
    }
}
