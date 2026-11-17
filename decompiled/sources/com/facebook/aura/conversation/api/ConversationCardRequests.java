package com.facebook.aura.conversation.api;

import X.AbstractC05643uj;
import X.AbstractC07127nr;
import X.AbstractC0878AGe;
import X.AbstractC0882AGj;
import X.AbstractC3358CGz;
import X.AbstractC9777Gfy;
import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.BLG;
import X.C06G;
import X.C06H;
import X.C0881AGi;
import X.C0KA;
import X.C10533Hqc;
import X.C1BN;
import X.C20Q;
import X.C20Z;
import X.C3UX;
import X.C3cG;
import X.C3cH;
import X.C3cI;
import X.C6ys;
import X.C7384Etj;
import X.C78W;
import X.C79;
import X.C8eO;
import X.C9286GCn;
import X.EnumC10460Hji;
import X.G0U;
import X.G0V;
import X.GAX;
import X.GAo;
import X.GAt;
import X.GDB;
import X.HnJ;
import X.HoC;
import X.Hr7;
import X.HtJ;
import X.Hwg;
import X.Hxb;
import X.HyO;
import X.HzP;
import X.InterfaceC10560Hsz;
import X.InterfaceC7549F2g;
import android.os.SystemClock;
import com.facebook.aura.conversation.api.ConversationCardPlacement;
import com.facebook.aura.partners.voice.background.VoiceCallForegroundService;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* loaded from: classes2.dex */
public final class ConversationCardRequests implements InterfaceC7549F2g {
    public static final int $stable = 8;
    public static final Companion Companion = new Companion();
    public static final long DECLINE_CARRY_OVER_MS = 60000;
    public static final long OBSERVER_GRACE_MS = 1500;
    public static final String TAG = "ConversationCards";
    public final BLG<List<CardState>> cardStates;
    public final List<Entry> entries;
    public final C1BN<Boolean> hasPendingCards;
    public final Object lock;
    public final BLG<Boolean> mutableHasPendingCards;
    public long nextId;
    public final BLG<List<Observer>> observers;
    public final Map<String, Long> recentDeclines;
    public final C3UX scope;

    public final class CardState extends C06G {
        public final boolean isInProgress;
        public final ConversationCardRequest request;
        public final long sequenceId;
        public final Target target;

        public static /* synthetic */ CardState copy$default(CardState cardState, long j, ConversationCardRequest conversationCardRequest, Target target, boolean z, int i, Object obj) {
            long j2 = j;
            ConversationCardRequest conversationCardRequest2 = conversationCardRequest;
            Target target2 = target;
            boolean z2 = z;
            if ((i & 1) != 0) {
                j2 = cardState.sequenceId;
            }
            if ((i & 2) != 0) {
                conversationCardRequest2 = cardState.request;
            }
            if ((i & 4) != 0) {
                target2 = cardState.target;
            }
            if ((i & 8) != 0) {
                z2 = cardState.isInProgress;
            }
            AnonymousClass003.A0x(conversationCardRequest2, target2);
            return new CardState(j2, conversationCardRequest2, target2, z2);
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof CardState) {
                    CardState cardState = (CardState) obj;
                    if (this.sequenceId != cardState.sequenceId || !C7384Etj.areEqual(this.request, cardState.request) || !C7384Etj.areEqual(this.target, cardState.target) || this.isInProgress != cardState.isInProgress) {
                    }
                }
                return false;
            }
            return true;
        }

        public final long component1() {
            return this.sequenceId;
        }

        public final ConversationCardRequest component2() {
            return this.request;
        }

        public final Target component3() {
            return this.target;
        }

        public final boolean component4() {
            return this.isInProgress;
        }

        public final ConversationCardRequest getRequest() {
            return this.request;
        }

        public final long getSequenceId() {
            return this.sequenceId;
        }

        public final Target getTarget() {
            return this.target;
        }

        public int hashCode() {
            return C0KA.A00(AnonymousClass005.A0F(this.target, AnonymousClass005.A0F(this.request, C3cI.A01(this.sequenceId))), this.isInProgress);
        }

        public final boolean isInProgress() {
            return this.isInProgress;
        }

        public CardState(long j, ConversationCardRequest conversationCardRequest, Target target, boolean z) {
            AnonymousClass003.A0x(conversationCardRequest, target);
            this.sequenceId = j;
            this.request = conversationCardRequest;
            this.target = target;
            this.isInProgress = z;
        }

        public final CardState copy(long j, ConversationCardRequest conversationCardRequest, Target target, boolean z) {
            AnonymousClass003.A0x(conversationCardRequest, target);
            return new CardState(j, conversationCardRequest, target, z);
        }

        public String toString() {
            return super.toString();
        }
    }

    public final class Entry {
        public HoC acceptJob;
        public boolean isInProgress;
        public boolean isShown;
        public final G0U<HtJ<? super Boolean>, Object> onAccepted;
        public final InterfaceC10560Hsz<ConversationCardOutcome> outcome;
        public final ConversationCardRequest request;
        public final long sequenceId;
        public final Target target;
        public int waiters;

        /* JADX WARN: Multi-variable type inference failed */
        public Entry(long j, ConversationCardRequest conversationCardRequest, Target target, G0U<? super HtJ<? super Boolean>, ? extends Object> g0u) {
            AnonymousClass005.A11(conversationCardRequest, target, g0u, 1);
            this.sequenceId = j;
            this.request = conversationCardRequest;
            this.target = target;
            this.onAccepted = g0u;
            this.outcome = new GAt(null);
        }

        public final HoC getAcceptJob() {
            return this.acceptJob;
        }

        public final G0U<HtJ<? super Boolean>, Object> getOnAccepted() {
            return this.onAccepted;
        }

        public final InterfaceC10560Hsz<ConversationCardOutcome> getOutcome() {
            return this.outcome;
        }

        public final ConversationCardRequest getRequest() {
            return this.request;
        }

        public final long getSequenceId() {
            return this.sequenceId;
        }

        public final Target getTarget() {
            return this.target;
        }

        public final int getWaiters() {
            return this.waiters;
        }

        public final boolean isInProgress() {
            return this.isInProgress;
        }

        public final boolean isShown() {
            return this.isShown;
        }

        public final void setAcceptJob(HoC hoC) {
            this.acceptJob = hoC;
        }

        public final void setInProgress(boolean z) {
            this.isInProgress = z;
        }

        public final void setShown(boolean z) {
            this.isShown = z;
        }

        public final void setWaiters(int i) {
            this.waiters = i;
        }
    }

    public final class Observer extends C06G {
        public final long busySinceMs;
        public final String conversationId;
        public final boolean isIdle;
        public final boolean isPrimaryChat;
        public final long token;

        public Observer(long j, String str, boolean z, boolean z2, long j2) {
            C7384Etj.A0Y(str, 1);
            this.token = j;
            this.conversationId = str;
            this.isPrimaryChat = z;
            this.isIdle = z2;
            this.busySinceMs = j2;
        }

        public final Observer copy(long j, String str, boolean z, boolean z2, long j2) {
            C7384Etj.A0Y(str, 1);
            return new Observer(j, str, z, z2, j2);
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof Observer) {
                    Observer observer = (Observer) obj;
                    if (this.token != observer.token || !C7384Etj.areEqual(this.conversationId, observer.conversationId) || this.isPrimaryChat != observer.isPrimaryChat || this.isIdle != observer.isIdle || this.busySinceMs != observer.busySinceMs) {
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
                z2 = observer.isIdle;
            }
            if ((i & 16) != 0) {
                j2 = observer.busySinceMs;
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
            return this.isIdle;
        }

        public final long component5() {
            return this.busySinceMs;
        }

        public final long getBusySinceMs() {
            return this.busySinceMs;
        }

        public final String getConversationId() {
            return this.conversationId;
        }

        public final long getToken() {
            return this.token;
        }

        public int hashCode() {
            return C0KA.A01(C0KA.A01(AnonymousClass005.A0I(this.conversationId, C3cG.A02(this.token) * 31), this.isPrimaryChat), this.isIdle) + C3cG.A02(this.busySinceMs);
        }

        public final boolean isIdle() {
            return this.isIdle;
        }

        public final boolean isPrimaryChat() {
            return this.isPrimaryChat;
        }

        public String toString() {
            return super.toString();
        }
    }

    public interface Target {

        public final class Any implements Target {
            public static final int $stable = 0;
            public static final Any INSTANCE = new Any();

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof Any);
            }

            public String toString() {
                return "Any";
            }

            public int hashCode() {
                return -1010452233;
            }
        }

        public final class Conversation extends C06G implements Target {
            public static final int $stable = 0;
            public final String conversationId;

            public Conversation(String str) {
                C7384Etj.A0Y(str, 0);
                this.conversationId = str;
            }

            public final Conversation copy(String str) {
                C7384Etj.A0Y(str, 0);
                return new Conversation(str);
            }

            public boolean equals(Object obj) {
                return this == obj || ((obj instanceof Conversation) && C7384Etj.areEqual(this.conversationId, ((Conversation) obj).conversationId));
            }

            public static /* synthetic */ Conversation copy$default(Conversation conversation, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = conversation.conversationId;
                }
                C7384Etj.A0Y(str, 0);
                return new Conversation(str);
            }

            public final String component1() {
                return this.conversationId;
            }

            public final String getConversationId() {
                return this.conversationId;
            }

            public int hashCode() {
                return this.conversationId.hashCode();
            }

            public String toString() {
                return super.toString();
            }
        }

        public final class Primary implements Target {
            public static final int $stable = 0;
            public static final Primary INSTANCE = new Primary();

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof Primary);
            }

            public String toString() {
                return AnonymousClass000.A00(23);
            }

            public int hashCode() {
                return -1486565491;
            }
        }
    }

    @DebugMetadata(c = "com.facebook.aura.conversation.api.ConversationCardRequests", f = "ConversationCardRequests.kt", l = {104, 119}, m = "await", v = 2)
    /* renamed from: com.facebook.aura.conversation.api.ConversationCardRequests$await$1, reason: invalid class name */
    public final class AnonymousClass1 extends HzP {
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public int label;
        public /* synthetic */ Object result;

        public AnonymousClass1(HtJ<? super AnonymousClass1> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ConversationCardRequests.this.await(null, null, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.conversation.api.ConversationCardRequests$awaitTarget$2", f = "ConversationCardRequests.kt", l = {221}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.conversation.api.ConversationCardRequests$awaitTarget$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Target>, Object> {
        public final /* synthetic */ ConversationCardRequest $request;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(ConversationCardRequest conversationCardRequest, HtJ<? super AnonymousClass2> htJ) {
            super(2, htJ);
            this.$request = conversationCardRequest;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return ConversationCardRequests.this.new AnonymousClass2(this.$request, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                ConversationCardRequests conversationCardRequests = ConversationCardRequests.this;
                ConversationCardRequests$awaitTarget$2$invokeSuspend$$inlined$mapNotNull$1 conversationCardRequests$awaitTarget$2$invokeSuspend$$inlined$mapNotNull$1 = new ConversationCardRequests$awaitTarget$2$invokeSuspend$$inlined$mapNotNull$1(conversationCardRequests.observers, conversationCardRequests, this.$request);
                this.label = 1;
                obj = AbstractC9777Gfy.A02(conversationCardRequests$awaitTarget$2$invokeSuspend$$inlined$mapNotNull$1, this);
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
        public final Object invoke(C3UX c3ux, HtJ<? super Target> htJ) {
            return ((AnonymousClass2) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.conversation.api.ConversationCardRequests$observe$1", f = "ConversationCardRequests.kt", l = {VoiceCallForegroundService.AVATAR_TARGET_PX}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.conversation.api.ConversationCardRequests$observe$1, reason: invalid class name and case insensitive filesystem */
    public final class C113371 extends AbstractC07127nr implements G0V<HyO<? super List<? extends PendingConversationCard>>, HtJ<? super Unit>, Object> {
        public final /* synthetic */ String $conversationId;
        public final /* synthetic */ C20Q<Boolean> $isIdle;
        public final /* synthetic */ boolean $isPrimaryChat;
        public long J$0;
        public /* synthetic */ Object L$0;
        public int label;

        @DebugMetadata(c = "com.facebook.aura.conversation.api.ConversationCardRequests$observe$1$1", f = "ConversationCardRequests.kt", l = {140}, m = "invokeSuspend", v = 2)
        /* renamed from: com.facebook.aura.conversation.api.ConversationCardRequests$observe$1$1, reason: invalid class name and collision with other inner class name */
        public final class C00901 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
            public final /* synthetic */ C20Q<Boolean> $isIdle;
            public final /* synthetic */ long $token;
            public int label;
            public final /* synthetic */ ConversationCardRequests this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C00901(C20Q<Boolean> c20q, ConversationCardRequests conversationCardRequests, long j, HtJ<? super C00901> htJ) {
                super(2, htJ);
                this.$isIdle = c20q;
                this.this$0 = conversationCardRequests;
                this.$token = j;
            }

            @Override // X.AbstractC8884Fsp
            public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
                return new C00901(this.$isIdle, this.this$0, this.$token, htJ);
            }

            @Override // X.AbstractC8884Fsp
            public final Object invokeSuspend(Object obj) {
                EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
                int i = this.label;
                if (i == 0) {
                    Hwg.A00(obj);
                    C20Q c20qA01 = GDB.A01(this.$isIdle);
                    final ConversationCardRequests conversationCardRequests = this.this$0;
                    final long j = this.$token;
                    C20Z c20z = new C20Z() { // from class: com.facebook.aura.conversation.api.ConversationCardRequests.observe.1.1.1
                        @Override // X.C20Z
                        public /* bridge */ /* synthetic */ Object emit(Object obj2, HtJ htJ) {
                            return emit(AnonymousClass001.A1X(obj2), (HtJ<? super Unit>) htJ);
                        }

                        public final Object emit(boolean z, HtJ<? super Unit> htJ) {
                            conversationCardRequests.updateIdle(j, z);
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
                return ((C00901) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C113371(String str, boolean z, C20Q<Boolean> c20q, HtJ<? super C113371> htJ) {
            super(2, htJ);
            this.$conversationId = str;
            this.$isPrimaryChat = z;
            this.$isIdle = c20q;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            C113371 c113371 = ConversationCardRequests.this.new C113371(this.$conversationId, this.$isPrimaryChat, this.$isIdle, htJ);
            c113371.L$0 = obj;
            return c113371;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Object invoke(HyO<? super List<? extends PendingConversationCard>> hyO, HtJ<? super Unit> htJ) {
            return invoke2((HyO<? super List<PendingConversationCard>>) hyO, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            long jRegister;
            final HyO hyO = (HyO) this.L$0;
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            try {
                if (i == 0) {
                    Hwg.A00(obj);
                    jRegister = ConversationCardRequests.this.register(this.$conversationId, this.$isPrimaryChat);
                    AnonymousClass001.A1J(new C00901(this.$isIdle, ConversationCardRequests.this, jRegister, null), hyO);
                    final ConversationCardRequests conversationCardRequests = ConversationCardRequests.this;
                    C20Q c20qA01 = GDB.A01(new ConversationCardRequests$observe$1$invokeSuspend$$inlined$map$1(conversationCardRequests.cardStates, conversationCardRequests, this.$conversationId, this.$isPrimaryChat));
                    C20Z c20z = new C20Z() { // from class: com.facebook.aura.conversation.api.ConversationCardRequests.observe.1.3
                        @Override // X.C20Z
                        public /* bridge */ /* synthetic */ Object emit(Object obj2, HtJ htJ) {
                            return emit((List<CardState>) obj2, (HtJ<? super Unit>) htJ);
                        }

                        public final Object emit(List<CardState> list, HtJ<? super Unit> htJ) {
                            HyO<List<PendingConversationCard>> hyO2 = hyO;
                            ConversationCardRequests conversationCardRequests2 = conversationCardRequests;
                            ArrayList arrayListA0i = AnonymousClass003.A0i(list);
                            for (CardState cardState : list) {
                                arrayListA0i.add(new PendingConversationCard(cardState.request, cardState.sequenceId, cardState.isInProgress, conversationCardRequests2));
                            }
                            return C3cG.A0U(hyO2.AcU(arrayListA0i, htJ));
                        }
                    };
                    this.L$0 = null;
                    this.J$0 = jRegister;
                    this.label = 1;
                    if (c20qA01.collect(c20z, this) == enumC10460Hji) {
                        return enumC10460Hji;
                    }
                } else {
                    if (i != 1) {
                        throw AnonymousClass001.A0n();
                    }
                    jRegister = this.J$0;
                    Hwg.A00(obj);
                }
                ConversationCardRequests.this.unregister(jRegister);
                return Unit.INSTANCE;
            } catch (Throwable th) {
                ConversationCardRequests.this.unregister(jRegister);
                throw th;
            }
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(HyO<? super List<PendingConversationCard>> hyO, HtJ<? super Unit> htJ) {
            return ((C113371) create(hyO, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.conversation.api.ConversationCardRequests", f = "ConversationCardRequests.kt", l = {268}, m = "runAccepted", v = 2)
    /* renamed from: com.facebook.aura.conversation.api.ConversationCardRequests$runAccepted$1, reason: invalid class name and case insensitive filesystem */
    public final class C113381 extends HzP {
        public Object L$0;
        public int label;
        public /* synthetic */ Object result;

        public C113381(HtJ<? super C113381> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ConversationCardRequests.this.runAccepted(null, this);
        }
    }

    public final C20Q<List<PendingConversationCard>> observe(String str, boolean z, C20Q<Boolean> c20q) {
        AnonymousClass003.A0v(str, c20q);
        return AbstractC05643uj.A01(new C113371(str, z, c20q, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object awaitTarget(ConversationCardRequest conversationCardRequest, HtJ<? super Target> htJ) {
        long jMin = Math.min(1500L, C3cH.A04(conversationCardRequest.getDeadlineElapsedMs()));
        if (jMin <= 0) {
            return null;
        }
        return GAX.A01(htJ, new AnonymousClass2(conversationCardRequest, null), jMin);
    }

    private final boolean isRecentlyDeclined(String str) {
        boolean zContainsKey;
        synchronized (this.lock) {
            AbstractC0882AGj.A0t(this.recentDeclines.values(), new ConversationCardRequests$isRecentlyDeclined$1$1(SystemClock.elapsedRealtime()));
            zContainsKey = this.recentDeclines.containsKey(str);
        }
        return zContainsKey;
    }

    private final Entry join(ConversationCardRequest conversationCardRequest, Target target, G0U<? super HtJ<? super Boolean>, ? extends Object> g0u) {
        Entry next;
        Entry entry;
        synchronized (this.lock) {
            Iterator<Entry> it = this.entries.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (C7384Etj.areEqual(next.request.getKey(), conversationCardRequest.getKey())) {
                    break;
                }
            }
            entry = next;
            if (entry == null) {
                long j = this.nextId + 1;
                this.nextId = j;
                entry = new Entry(j, conversationCardRequest, target, g0u);
                this.entries.add(entry);
            }
            entry.waiters++;
            publishLocked();
        }
        return entry;
    }

    private final void leave(Entry entry) {
        HoC hoC;
        synchronized (this.lock) {
            int i = entry.waiters - 1;
            entry.waiters = i;
            if (i == 0 && this.entries.remove(entry)) {
                publishLocked();
            }
            hoC = entry.acceptJob;
            if (entry.waiters != 0) {
                hoC = null;
            }
        }
        if (hoC != null) {
            hoC.A5w(null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean matches(Target target, String str, boolean z) {
        if (C7384Etj.areEqual(target, Target.Primary.INSTANCE)) {
            return z;
        }
        if (C7384Etj.areEqual(target, Target.Any.INSTANCE)) {
            return true;
        }
        if (target instanceof Target.Conversation) {
            return C7384Etj.areEqual(((Target.Conversation) target).conversationId, str);
        }
        throw C3cG.A0q();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void publishLocked() {
        BLG<List<CardState>> blg = this.cardStates;
        List<Entry> list = this.entries;
        ArrayList arrayListA0i = AnonymousClass003.A0i(list);
        for (Entry entry : list) {
            arrayListA0i.add(new CardState(entry.sequenceId, entry.request, entry.target, entry.isInProgress));
        }
        C3cG.A0V(blg, arrayListA0i);
        AnonymousClass003.A14(this.mutableHasPendingCards, !this.entries.isEmpty());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long register(String str, boolean z) {
        long j;
        List<Observer> value;
        synchronized (this.lock) {
            j = this.nextId + 1;
            this.nextId = j;
        }
        BLG<List<Observer>> blg = this.observers;
        do {
            value = blg.getValue();
        } while (!blg.A6e(value, AbstractC0878AGe.A0Q(new Observer(j, str, z, true, 0L), value)));
        return j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Target resolveTarget(ConversationCardPlacement conversationCardPlacement, List<Observer> list) {
        Object next;
        Target target;
        Target conversation = null;
        if (C7384Etj.areEqual(conversationCardPlacement, ConversationCardPlacement.PrimaryChat.INSTANCE)) {
            target = Target.Primary.INSTANCE;
            if (!(list instanceof Collection) || !list.isEmpty()) {
                Iterator<Observer> it = list.iterator();
                while (it.hasNext()) {
                    if (it.next().isPrimaryChat) {
                        conversation = target;
                        break;
                    }
                }
            }
        } else {
            if (C7384Etj.areEqual(conversationCardPlacement, ConversationCardPlacement.AnyConversation.INSTANCE)) {
                target = Target.Any.INSTANCE;
                if (!list.isEmpty()) {
                    conversation = target;
                    break;
                }
                conversation = target;
                break;
            }
            if (!C7384Etj.areEqual(conversationCardPlacement, ConversationCardPlacement.ActiveConversation.INSTANCE)) {
                if (conversationCardPlacement instanceof ConversationCardPlacement.Conversation) {
                    return new Target.Conversation(((ConversationCardPlacement.Conversation) conversationCardPlacement).conversationId);
                }
                throw C3cG.A0q();
            }
            ArrayList arrayListA0h = C3cG.A0h();
            for (Observer observer : list) {
                if (!observer.isIdle) {
                    arrayListA0h.add(observer);
                }
            }
            Iterator it2 = arrayListA0h.iterator();
            if (it2.hasNext()) {
                next = it2.next();
                if (it2.hasNext()) {
                    long j = ((Observer) next).busySinceMs;
                    do {
                        Object next2 = it2.next();
                        long j2 = ((Observer) next2).busySinceMs;
                        if (j < j2) {
                            next = next2;
                            j = j2;
                        }
                    } while (it2.hasNext());
                }
            } else {
                next = null;
            }
            Observer observer2 = (Observer) next;
            if (observer2 != null) {
                conversation = new Target.Conversation(observer2.conversationId);
            }
        }
        return conversation;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object runAccepted(com.facebook.aura.conversation.api.ConversationCardRequests.Entry r6, X.HtJ<? super com.facebook.aura.conversation.api.ConversationCardOutcome> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof com.facebook.aura.conversation.api.ConversationCardRequests.C113381
            if (r0 == 0) goto L22
            r4 = r7
            com.facebook.aura.conversation.api.ConversationCardRequests$runAccepted$1 r4 = (com.facebook.aura.conversation.api.ConversationCardRequests.C113381) r4
            int r2 = r4.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L22
            int r2 = r2 - r1
            r4.label = r2
        L12:
            java.lang.Object r3 = r4.result
            X.Hji r2 = X.EnumC10460Hji.A02
            int r0 = r4.label
            r1 = 1
            if (r0 == 0) goto L2d
            if (r0 != r1) goto L28
            java.lang.Object r6 = r4.L$0
            com.facebook.aura.conversation.api.ConversationCardRequests$Entry r6 = (com.facebook.aura.conversation.api.ConversationCardRequests.Entry) r6
            goto L3d
        L22:
            com.facebook.aura.conversation.api.ConversationCardRequests$runAccepted$1 r4 = new com.facebook.aura.conversation.api.ConversationCardRequests$runAccepted$1
            r4.<init>(r7)
            goto L12
        L28:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        L2d:
            X.Hwg.A00(r3)
            X.G0U<X.HtJ<? super java.lang.Boolean>, java.lang.Object> r0 = r6.onAccepted     // Catch: java.lang.Exception -> L4c java.util.concurrent.CancellationException -> L61
            r4.L$0 = r6     // Catch: java.lang.Exception -> L4c java.util.concurrent.CancellationException -> L61
            r4.label = r1     // Catch: java.lang.Exception -> L4c java.util.concurrent.CancellationException -> L61
            java.lang.Object r3 = r0.invoke(r4)     // Catch: java.lang.Exception -> L4c java.util.concurrent.CancellationException -> L61
            if (r3 != r2) goto L40
            return r2
        L3d:
            X.Hwg.A00(r3)     // Catch: java.lang.Exception -> L4c java.util.concurrent.CancellationException -> L61
        L40:
            boolean r0 = X.AnonymousClass001.A1X(r3)     // Catch: java.lang.Exception -> L4c java.util.concurrent.CancellationException -> L61
            if (r0 == 0) goto L49
            com.facebook.aura.conversation.api.ConversationCardOutcome r0 = com.facebook.aura.conversation.api.ConversationCardOutcome.COMPLETED     // Catch: java.lang.Exception -> L4c java.util.concurrent.CancellationException -> L61
            return r0
        L49:
            com.facebook.aura.conversation.api.ConversationCardOutcome r0 = com.facebook.aura.conversation.api.ConversationCardOutcome.DECLINED     // Catch: java.lang.Exception -> L4c java.util.concurrent.CancellationException -> L61
            return r0
        L4c:
            r3 = move-exception
            com.facebook.aura.conversation.api.ConversationCardRequest r0 = r6.request
            java.lang.String r0 = r0.getKey()
            java.lang.Object[] r2 = new java.lang.Object[]{r0}
            java.lang.String r1 = "ConversationCards"
            java.lang.String r0 = "Accept action failed for card %s"
            X.CFK.A0C(r1, r0, r3, r2)
            com.facebook.aura.conversation.api.ConversationCardOutcome r0 = com.facebook.aura.conversation.api.ConversationCardOutcome.FAILED
            return r0
        L61:
            r0 = move-exception
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.conversation.api.ConversationCardRequests.runAccepted(com.facebook.aura.conversation.api.ConversationCardRequests$Entry, X.HtJ):java.lang.Object");
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
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateIdle(long j, boolean z) {
        List<Observer> value;
        ArrayList arrayList;
        long jElapsedRealtime;
        boolean z2;
        long j2;
        String str;
        boolean z3;
        BLG<List<Observer>> blg = this.observers;
        do {
            value = blg.getValue();
            List<Observer> list = value;
            arrayList = new ArrayList(Hr7.A1D(list, 10));
            for (Observer observerCopy : list) {
                if (observerCopy.token == j) {
                    if (z) {
                        z2 = true;
                        j2 = observerCopy.token;
                        str = observerCopy.conversationId;
                        z3 = observerCopy.isPrimaryChat;
                        jElapsedRealtime = observerCopy.busySinceMs;
                    } else {
                        jElapsedRealtime = SystemClock.elapsedRealtime();
                        z2 = false;
                        j2 = observerCopy.token;
                        str = observerCopy.conversationId;
                        z3 = observerCopy.isPrimaryChat;
                    }
                    observerCopy = observerCopy.copy(j2, str, z3, z2, jElapsedRealtime);
                }
                arrayList.add(observerCopy);
            }
        } while (!blg.A6e(value, arrayList));
    }

    public final boolean accept$fbandroid_express_aura_java_com_facebook_aura_conversation_api_api(long j) {
        Entry next;
        synchronized (this.lock) {
            Iterator<Entry> it = this.entries.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (next.sequenceId == j) {
                    break;
                }
            }
            Entry entry = next;
            if (entry == null || entry.isInProgress) {
                return false;
            }
            entry.isInProgress = true;
            publishLocked();
            C10533Hqc c10533HqcA02 = GAo.A02(C79.A01, C6ys.A00, new ConversationCardRequests$accept$job$1$1(this, entry, null), this.scope);
            entry.acceptJob = c10533HqcA02;
            c10533HqcA02.Afv();
            return true;
        }
    }

    public final String activeConversationId() {
        Target.Conversation conversation;
        Target targetResolveTarget = resolveTarget(ConversationCardPlacement.ActiveConversation.INSTANCE, this.observers.getValue());
        if (!(targetResolveTarget instanceof Target.Conversation) || (conversation = (Target.Conversation) targetResolveTarget) == null) {
            return null;
        }
        return conversation.conversationId;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b7 A[Catch: all -> 0x00ca, TryCatch #0 {all -> 0x00ca, blocks: (B:31:0x00b0, B:32:0x00b3, B:34:0x00b7, B:35:0x00b9, B:28:0x0091), top: B:41:0x001c }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object await(com.facebook.aura.conversation.api.ConversationCardRequest r10, X.G0U<? super X.HtJ<? super java.lang.Boolean>, ? extends java.lang.Object> r11, X.HtJ<? super com.facebook.aura.conversation.api.ConversationCardOutcome> r12) {
        /*
            r9 = this;
            boolean r0 = r12 instanceof com.facebook.aura.conversation.api.ConversationCardRequests.AnonymousClass1
            if (r0 == 0) goto L2c
            r7 = r12
            com.facebook.aura.conversation.api.ConversationCardRequests$await$1 r7 = (com.facebook.aura.conversation.api.ConversationCardRequests.AnonymousClass1) r7
            int r2 = r7.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L2c
            int r2 = r2 - r1
            r7.label = r2
        L12:
            java.lang.Object r3 = r7.result
            X.Hji r8 = X.EnumC10460Hji.A02
            int r0 = r7.label
            r6 = 2
            r1 = 1
            java.lang.String r5 = "ConversationCards"
            if (r0 == 0) goto L37
            if (r0 == r1) goto L5d
            if (r0 != r6) goto L32
            java.lang.Object r4 = r7.L$3
            com.facebook.aura.conversation.api.ConversationCardRequests$Entry r4 = (com.facebook.aura.conversation.api.ConversationCardRequests.Entry) r4
            java.lang.Object r10 = r7.L$0
            com.facebook.aura.conversation.api.ConversationCardRequest r10 = (com.facebook.aura.conversation.api.ConversationCardRequest) r10
            goto Lb0
        L2c:
            com.facebook.aura.conversation.api.ConversationCardRequests$await$1 r7 = new com.facebook.aura.conversation.api.ConversationCardRequests$await$1
            r7.<init>(r12)
            goto L12
        L32:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        L37:
            X.Hwg.A00(r3)
            java.lang.String r0 = r10.getKey()
            boolean r0 = r9.isRecentlyDeclined(r0)
            if (r0 == 0) goto L50
            java.lang.String r1 = "Card %s declined recently; not shown"
            java.lang.String r0 = r10.getKey()
            X.CFK.A03(r0, r5, r1)
            com.facebook.aura.conversation.api.ConversationCardOutcome r8 = com.facebook.aura.conversation.api.ConversationCardOutcome.DECLINED
            return r8
        L50:
            r7.L$0 = r10
            r7.L$1 = r11
            r7.label = r1
            java.lang.Object r3 = r9.awaitTarget(r10, r7)
            if (r3 != r8) goto L68
            return r8
        L5d:
            java.lang.Object r11 = r7.L$1
            X.G0U r11 = (X.G0U) r11
            java.lang.Object r10 = r7.L$0
            com.facebook.aura.conversation.api.ConversationCardRequest r10 = (com.facebook.aura.conversation.api.ConversationCardRequest) r10
            X.Hwg.A00(r3)
        L68:
            com.facebook.aura.conversation.api.ConversationCardRequests$Target r3 = (com.facebook.aura.conversation.api.ConversationCardRequests.Target) r3
            if (r3 != 0) goto L78
            java.lang.String r1 = "Card %s has no visible conversation"
            java.lang.String r0 = r10.getKey()
            X.CFK.A03(r0, r5, r1)
            com.facebook.aura.conversation.api.ConversationCardOutcome r8 = com.facebook.aura.conversation.api.ConversationCardOutcome.UNAVAILABLE
            return r8
        L78:
            com.facebook.aura.conversation.api.ConversationCardRequests$Entry r4 = r9.join(r10, r3, r11)
            java.lang.String r2 = r10.getKey()
            long r0 = r10.getDeadlineElapsedMs()
            long r0 = X.C3cH.A04(r0)
            java.lang.Long r1 = X.C3cG.A0S(r0)
            java.lang.String r0 = "Card %s waiting target=%s remainingMs=%d"
            X.CFK.A01(r2, r3, r1, r5, r0)
            long r0 = r10.getDeadlineElapsedMs()     // Catch: java.lang.Throwable -> Lca
            long r2 = X.C3cH.A04(r0)     // Catch: java.lang.Throwable -> Lca
            r1 = 0
            com.facebook.aura.conversation.api.ConversationCardRequests$await$outcome$1 r0 = new com.facebook.aura.conversation.api.ConversationCardRequests$await$outcome$1     // Catch: java.lang.Throwable -> Lca
            r0.<init>(r4, r1)     // Catch: java.lang.Throwable -> Lca
            r7.L$0 = r10     // Catch: java.lang.Throwable -> Lca
            r7.L$1 = r1     // Catch: java.lang.Throwable -> Lca
            r7.L$2 = r1     // Catch: java.lang.Throwable -> Lca
            r7.L$3 = r4     // Catch: java.lang.Throwable -> Lca
            r7.label = r6     // Catch: java.lang.Throwable -> Lca
            java.lang.Object r3 = X.GAX.A01(r7, r0, r2)     // Catch: java.lang.Throwable -> Lca
            if (r3 != r8) goto Lb3
            return r8
        Lb0:
            X.Hwg.A00(r3)     // Catch: java.lang.Throwable -> Lca
        Lb3:
            com.facebook.aura.conversation.api.ConversationCardOutcome r3 = (com.facebook.aura.conversation.api.ConversationCardOutcome) r3     // Catch: java.lang.Throwable -> Lca
            if (r3 != 0) goto Lb9
            com.facebook.aura.conversation.api.ConversationCardOutcome r3 = com.facebook.aura.conversation.api.ConversationCardOutcome.EXPIRED     // Catch: java.lang.Throwable -> Lca
        Lb9:
            java.lang.String r2 = "Card %s outcome=%s"
            java.lang.String r1 = r10.getKey()     // Catch: java.lang.Throwable -> Lca
            java.lang.String r0 = r3.getWireValue()     // Catch: java.lang.Throwable -> Lca
            X.CFK.A02(r1, r0, r5, r2)     // Catch: java.lang.Throwable -> Lca
            r9.leave(r4)
            return r3
        Lca:
            r0 = move-exception
            r9.leave(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.conversation.api.ConversationCardRequests.await(com.facebook.aura.conversation.api.ConversationCardRequest, X.G0U, X.HtJ):java.lang.Object");
    }

    @Override // X.InterfaceC7549F2g
    public void clearUserData() {
        List listA0X;
        synchronized (this.lock) {
            listA0X = AbstractC0878AGe.A0X(this.entries);
            this.entries.clear();
            this.recentDeclines.clear();
            publishLocked();
        }
        Iterator it = listA0X.iterator();
        while (it.hasNext()) {
            C3cG.A1F(((Entry) it.next()).outcome, ConversationCardOutcome.CANCELLED);
        }
        Hxb.A03(null, this.scope);
    }

    public final boolean decline$fbandroid_express_aura_java_com_facebook_aura_conversation_api_api(long j) {
        Entry next;
        synchronized (this.lock) {
            Iterator<Entry> it = this.entries.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (next.sequenceId == j) {
                    break;
                }
            }
            Entry entry = next;
            if (entry == null || entry.isInProgress) {
                return false;
            }
            this.entries.remove(entry);
            if (entry.request.getRemembersDecline()) {
                this.recentDeclines.put(entry.request.getKey(), C3cI.A0O());
            }
            publishLocked();
            C3cG.A1F(entry.outcome, ConversationCardOutcome.DECLINED);
            return true;
        }
    }

    public final C1BN<Boolean> getHasPendingCards() {
        return this.hasPendingCards;
    }

    public final boolean markShown$fbandroid_express_aura_java_com_facebook_aura_conversation_api_api(long j) {
        Entry next;
        synchronized (this.lock) {
            Iterator<Entry> it = this.entries.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (next.sequenceId == j) {
                    break;
                }
            }
            Entry entry = next;
            if (entry == null || entry.isShown) {
                return false;
            }
            entry.isShown = true;
            return true;
        }
    }

    public final class Companion {
        public final ConversationCardRequests getInstance(AbstractC3358CGz abstractC3358CGz) {
            C7384Etj.A0Y(abstractC3358CGz, 0);
            return (ConversationCardRequests) abstractC3358CGz.A03(ConversationCardRequests.class, ConversationCardRequests$Companion$getInstance$1.INSTANCE);
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    private final long remainingMs(ConversationCardRequest conversationCardRequest) {
        return C3cH.A04(conversationCardRequest.getDeadlineElapsedMs());
    }

    public /* synthetic */ ConversationCardRequests(C06H c06h) {
        this();
    }

    public ConversationCardRequests() {
        this.lock = C3cG.A0T();
        this.scope = Hxb.A02(C78W.A02(new C8eO(null), C3cG.A0v()));
        this.entries = C3cG.A0h();
        this.recentDeclines = C3cG.A0j();
        C0881AGi c0881AGi = C0881AGi.A00;
        this.cardStates = HnJ.A01(c0881AGi);
        this.observers = HnJ.A01(c0881AGi);
        C9286GCn c9286GCnA0v = AnonymousClass002.A0v(false);
        this.mutableHasPendingCards = c9286GCnA0v;
        this.hasPendingCards = C3cG.A11(c9286GCnA0v);
    }
}
