package com.facebook.aura.conversation.viewmodel;

import X.AHD;
import X.AbstractC05623ug;
import X.AbstractC05633ui;
import X.AbstractC05643uj;
import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.BLG;
import X.C05663ul;
import X.C0881AGi;
import X.C10543Hqv;
import X.C1BN;
import X.C20Q;
import X.C20Z;
import X.C3UX;
import X.C3bP;
import X.C3pU;
import X.C3rb;
import X.C4o7;
import X.C6ys;
import X.C7384Etj;
import X.C79;
import X.C7BY;
import X.C7Bq;
import X.C9286GCn;
import X.EnumC10460Hji;
import X.G0V;
import X.G2j;
import X.GAo;
import X.GDB;
import X.HtJ;
import X.HwN;
import X.Hwg;
import X.HyO;
import com.facebook.aura.conversation.viewmodel.HatchConversationAnnouncement;
import com.facebook.aura.conversation.viewmodel.HatchConversationListItem;
import com.facebook.aura.devices.pairing.LinkEncryptedPairingKt;
import com.facebook.aura.executors.AuraDispatchers;
import com.facebook.aura.model.HatchMessageRole;
import com.facebook.aura.model.HatchSendErrorCategory;
import com.facebook.aura.utils.HatchStringUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import kotlin.KotlinNothingValueException;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public abstract class HatchFinishedRepliesKt {
    public static final long ANNOUNCEMENT_GAP_MS = 300;
    public static final long ANNOUNCEMENT_HOLD_MS = 2000;
    public static final long SEND_FAILURE_SETTLE_MS = 300;

    @DebugMetadata(c = "com.facebook.aura.conversation.viewmodel.HatchFinishedRepliesKt$agentWorking$1", f = "HatchFinishedReplies.kt", l = {97}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.conversation.viewmodel.HatchFinishedRepliesKt$agentWorking$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC07127nr implements G0V<HyO<? super HatchConversationAnnouncement.AgentWorking>, HtJ<? super Unit>, Object> {
        public final /* synthetic */ Function0<String> $agentName;
        public final /* synthetic */ C20Q<Boolean> $canSpeak;
        public final /* synthetic */ C20Q<ConversationTurn> $this_agentWorking;
        public final /* synthetic */ C20Q<String> $workingStatus;
        public /* synthetic */ Object L$0;
        public Object L$1;
        public int label;

        @DebugMetadata(c = "com.facebook.aura.conversation.viewmodel.HatchFinishedRepliesKt$agentWorking$1$2", f = "HatchFinishedReplies.kt", l = {99, 100, 102}, m = "invokeSuspend", v = 2)
        /* renamed from: com.facebook.aura.conversation.viewmodel.HatchFinishedRepliesKt$agentWorking$1$2, reason: invalid class name */
        public final class AnonymousClass2 extends AbstractC07127nr implements G0V<String, HtJ<? super Unit>, Object> {
            public final /* synthetic */ HyO<HatchConversationAnnouncement.AgentWorking> $$this$channelFlow;
            public final /* synthetic */ Function0<String> $agentName;
            public final /* synthetic */ C10543Hqv<String> $announcedTurnKey;
            public final /* synthetic */ C20Q<Boolean> $canSpeak;
            public final /* synthetic */ C20Q<String> $workingStatus;
            public /* synthetic */ Object L$0;
            public Object L$1;
            public int label;

            @DebugMetadata(c = "com.facebook.aura.conversation.viewmodel.HatchFinishedRepliesKt$agentWorking$1$2$1", f = "HatchFinishedReplies.kt", l = {}, m = "invokeSuspend", v = 2)
            /* renamed from: com.facebook.aura.conversation.viewmodel.HatchFinishedRepliesKt$agentWorking$1$2$1, reason: invalid class name and collision with other inner class name */
            public final class C01301 extends AbstractC07127nr implements G0V<Boolean, HtJ<? super Boolean>, Object> {
                public /* synthetic */ boolean Z$0;
                public int label;

                public C01301(HtJ<? super C01301> htJ) {
                    super(2, htJ);
                }

                @Override // X.AbstractC8884Fsp
                public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
                    C01301 c01301 = new C01301(htJ);
                    c01301.Z$0 = AnonymousClass001.A1X(obj);
                    return c01301;
                }

                @Override // X.AbstractC8884Fsp
                public final Object invokeSuspend(Object obj) {
                    boolean z = this.Z$0;
                    if (this.label == 0) {
                        return AnonymousClass001.A0k(obj, z);
                    }
                    throw AnonymousClass001.A0n();
                }

                @Override // X.G0V
                public /* bridge */ /* synthetic */ Object invoke(Boolean bool, HtJ<? super Boolean> htJ) {
                    return invoke(AnonymousClass001.A1X(bool), htJ);
                }

                public final Object invoke(boolean z, HtJ<? super Boolean> htJ) {
                    return ((C01301) AnonymousClass002.A0r(htJ, this, z)).invokeSuspend(Unit.INSTANCE);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public AnonymousClass2(C10543Hqv<String> c10543Hqv, C20Q<String> c20q, C20Q<Boolean> c20q2, HyO<? super HatchConversationAnnouncement.AgentWorking> hyO, Function0<String> function0, HtJ<? super AnonymousClass2> htJ) {
                super(2, htJ);
                this.$announcedTurnKey = c10543Hqv;
                this.$workingStatus = c20q;
                this.$canSpeak = c20q2;
                this.$$this$channelFlow = hyO;
                this.$agentName = function0;
            }

            @Override // X.AbstractC8884Fsp
            public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$announcedTurnKey, this.$workingStatus, this.$canSpeak, this.$$this$channelFlow, this.$agentName, htJ);
                anonymousClass2.L$0 = obj;
                return anonymousClass2;
            }

            /* JADX WARN: Removed duplicated region for block: B:20:0x004f A[RETURN] */
            /* JADX WARN: Type inference failed for: r6v1, types: [T, java.lang.Object, java.lang.String] */
            @Override // X.AbstractC8884Fsp
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r9) {
                /*
                    r8 = this;
                    java.lang.Object r6 = r8.L$0
                    java.lang.String r6 = (java.lang.String) r6
                    X.Hji r4 = X.EnumC10460Hji.A02
                    int r0 = r8.label
                    r5 = 3
                    r7 = 2
                    r1 = 1
                    if (r0 == 0) goto L19
                    if (r0 == r1) goto L35
                    if (r0 == r7) goto L50
                    if (r0 != r5) goto L78
                    X.Hwg.A00(r9)
                L16:
                    kotlin.Unit r4 = kotlin.Unit.INSTANCE
                    return r4
                L19:
                    X.Hwg.A00(r9)
                    if (r6 == 0) goto L16
                    X.Hqv<java.lang.String> r0 = r8.$announcedTurnKey
                    T r0 = r0.element
                    boolean r0 = r6.equals(r0)
                    if (r0 != 0) goto L16
                    X.20Q<java.lang.String> r0 = r8.$workingStatus
                    r8.L$0 = r6
                    r8.label = r1
                    java.lang.Object r9 = X.AbstractC9777Gfy.A02(r0, r8)
                    if (r9 != r4) goto L38
                    return r4
                L35:
                    X.Hwg.A00(r9)
                L38:
                    r3 = r9
                    java.lang.String r3 = (java.lang.String) r3
                    X.20Q<java.lang.Boolean> r2 = r8.$canSpeak
                    r1 = 0
                    com.facebook.aura.conversation.viewmodel.HatchFinishedRepliesKt$agentWorking$1$2$1 r0 = new com.facebook.aura.conversation.viewmodel.HatchFinishedRepliesKt$agentWorking$1$2$1
                    r0.<init>(r1)
                    r8.L$0 = r6
                    r8.L$1 = r3
                    r8.label = r7
                    java.lang.Object r0 = X.AbstractC9777Gfy.A00(r8, r0, r2)
                    if (r0 != r4) goto L57
                    return r4
                L50:
                    java.lang.Object r3 = r8.L$1
                    java.lang.String r3 = (java.lang.String) r3
                    X.Hwg.A00(r9)
                L57:
                    X.Hqv<java.lang.String> r0 = r8.$announcedTurnKey
                    r0.element = r6
                    X.HyO<com.facebook.aura.conversation.viewmodel.HatchConversationAnnouncement$AgentWorking> r2 = r8.$$this$channelFlow
                    kotlin.jvm.functions.Function0<java.lang.String> r0 = r8.$agentName
                    java.lang.Object r0 = r0.invoke()
                    java.lang.String r0 = (java.lang.String) r0
                    com.facebook.aura.conversation.viewmodel.HatchConversationAnnouncement$AgentWorking r1 = new com.facebook.aura.conversation.viewmodel.HatchConversationAnnouncement$AgentWorking
                    r1.<init>(r6, r0, r3)
                    r0 = 0
                    r8.L$0 = r0
                    r8.L$1 = r0
                    r8.label = r5
                    java.lang.Object r0 = r2.AcU(r1, r8)
                    if (r0 != r4) goto L16
                    return r4
                L78:
                    java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
                    throw r0
                */
                throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.conversation.viewmodel.HatchFinishedRepliesKt.AnonymousClass1.AnonymousClass2.invokeSuspend(java.lang.Object):java.lang.Object");
            }

            @Override // X.G0V
            public final Object invoke(String str, HtJ<? super Unit> htJ) {
                return ((AnonymousClass2) create(str, htJ)).invokeSuspend(Unit.INSTANCE);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(C20Q<ConversationTurn> c20q, C20Q<String> c20q2, C20Q<Boolean> c20q3, Function0<String> function0, HtJ<? super AnonymousClass1> htJ) {
            super(2, htJ);
            this.$this_agentWorking = c20q;
            this.$workingStatus = c20q2;
            this.$canSpeak = c20q3;
            this.$agentName = function0;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$this_agentWorking, this.$workingStatus, this.$canSpeak, this.$agentName, htJ);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            HyO hyO = (HyO) this.L$0;
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                C10543Hqv c10543Hqv = new C10543Hqv();
                C20Q c20qA01 = GDB.A01(new HatchFinishedRepliesKt$agentWorking$1$invokeSuspend$$inlined$map$1(this.$this_agentWorking));
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(c10543Hqv, this.$workingStatus, this.$canSpeak, hyO, this.$agentName, null);
                this.L$0 = null;
                this.L$1 = null;
                this.label = 1;
                if (C3pU.A00(this, anonymousClass2, c20qA01) == enumC10460Hji) {
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
        public final Object invoke(HyO<? super HatchConversationAnnouncement.AgentWorking> hyO, HtJ<? super Unit> htJ) {
            return ((AnonymousClass1) create(hyO, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.conversation.viewmodel.HatchFinishedRepliesKt$announcements$1", f = "HatchFinishedReplies.kt", l = {50}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.conversation.viewmodel.HatchFinishedRepliesKt$announcements$1, reason: invalid class name and case insensitive filesystem */
    public final class C115651 extends AbstractC07127nr implements G0V<C20Z<? super HatchConversationAnnouncement>, HtJ<? super Unit>, Object> {
        public final /* synthetic */ Function0<String> $agentName;
        public final /* synthetic */ C20Q<Boolean> $canSpeak;
        public final /* synthetic */ C20Q<HatchSendErrorCategory> $sendFailed;
        public final /* synthetic */ C1BN<String> $sentRequestId;
        public final /* synthetic */ C1BN<HatchSentTurn> $sentTurn;
        public final /* synthetic */ C20Q<AHD<HatchConversationListItem>> $this_announcements;
        public final /* synthetic */ C20Q<String> $workingStatus;
        public /* synthetic */ Object L$0;
        public Object L$1;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C115651(C20Q<? extends AHD<? extends HatchConversationListItem>> c20q, C1BN<HatchSentTurn> c1bn, C1BN<String> c1bn2, C20Q<Boolean> c20q2, Function0<String> function0, C20Q<String> c20q3, C20Q<? extends HatchSendErrorCategory> c20q4, HtJ<? super C115651> htJ) {
            super(2, htJ);
            this.$this_announcements = c20q;
            this.$sentTurn = c1bn;
            this.$sentRequestId = c1bn2;
            this.$canSpeak = c20q2;
            this.$agentName = function0;
            this.$workingStatus = c20q3;
            this.$sendFailed = c20q4;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            C115651 c115651 = new C115651(this.$this_announcements, this.$sentTurn, this.$sentRequestId, this.$canSpeak, this.$agentName, this.$workingStatus, this.$sendFailed, htJ);
            c115651.L$0 = obj;
            return c115651;
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            C20Z c20z = (C20Z) this.L$0;
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                C20Q<AHD<HatchConversationListItem>> c20q = this.$this_announcements;
                C1BN<HatchSentTurn> c1bn = this.$sentTurn;
                C1BN<String> c1bn2 = this.$sentRequestId;
                C20Q<ConversationTurn> c20qWithTurnSentAfter = HatchFinishedRepliesKt.withTurnSentAfter(c20q, c1bn, c1bn2, c1bn2.getValue());
                C20Q<HatchConversationAnnouncement> c20qShownOneAtATime = HatchFinishedRepliesKt.shownOneAtATime(AbstractC05633ui.A01(HatchFinishedRepliesKt.agentWorking(c20qWithTurnSentAfter, this.$canSpeak, this.$agentName, this.$workingStatus), HatchFinishedRepliesKt.finishedReplies(c20qWithTurnSentAfter, this.$canSpeak, this.$agentName), HatchFinishedRepliesKt.sendFailures(this.$sendFailed, this.$canSpeak)), this.$canSpeak);
                this.L$0 = null;
                this.L$1 = null;
                this.label = 1;
                if (C3pU.A01(this, c20qShownOneAtATime, c20z) == enumC10460Hji) {
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
        public final Object invoke(C20Z<? super HatchConversationAnnouncement> c20z, HtJ<? super Unit> htJ) {
            return ((C115651) create(c20z, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.conversation.viewmodel.HatchFinishedRepliesKt$finishedReplies$1", f = "HatchFinishedReplies.kt", l = {LinkEncryptedPairingKt.LINK_PUBLIC_KEY_SIZE}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.conversation.viewmodel.HatchFinishedRepliesKt$finishedReplies$1, reason: invalid class name and case insensitive filesystem */
    public final class C115661 extends AbstractC07127nr implements G0V<C20Z<? super HatchConversationAnnouncement>, HtJ<? super Unit>, Object> {
        public final /* synthetic */ Function0<String> $agentName;
        public final /* synthetic */ C20Q<Boolean> $canSpeak;
        public final /* synthetic */ C20Q<ConversationTurn> $this_finishedReplies;
        public /* synthetic */ Object L$0;
        public Object L$1;
        public int label;

        /* renamed from: com.facebook.aura.conversation.viewmodel.HatchFinishedRepliesKt$finishedReplies$1$1, reason: invalid class name and collision with other inner class name */
        public final class C01311<T> implements C20Z {
            public final /* synthetic */ C20Z<HatchConversationAnnouncement> $$this$flow;
            public final /* synthetic */ Function0<String> $agentName;
            public final /* synthetic */ C20Q<Boolean> $canSpeak;
            public final /* synthetic */ Set<String> $handledKeys;

            /* JADX WARN: Multi-variable type inference failed */
            public C01311(Set<String> set, C20Q<Boolean> c20q, Function0<String> function0, C20Z<? super HatchConversationAnnouncement> c20z) {
                this.$handledKeys = set;
                this.$canSpeak = c20q;
                this.$agentName = function0;
                this.$$this$flow = c20z;
            }

            @Override // X.C20Z
            public /* bridge */ /* synthetic */ Object emit(Object obj, HtJ htJ) {
                return emit((ConversationTurn) obj, (HtJ<? super Unit>) htJ);
            }

            /* JADX WARN: Removed duplicated region for block: B:15:0x0042  */
            /* JADX WARN: Removed duplicated region for block: B:39:0x00e8 A[RETURN] */
            /* JADX WARN: Removed duplicated region for block: B:48:0x0120  */
            /* JADX WARN: Removed duplicated region for block: B:49:0x0127  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x0056 -> B:12:0x003b). Please report as a decompilation issue!!! */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x005f -> B:12:0x003b). Please report as a decompilation issue!!! */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x0063 -> B:12:0x003b). Please report as a decompilation issue!!! */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x006b -> B:12:0x003b). Please report as a decompilation issue!!! */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x006d -> B:12:0x003b). Please report as a decompilation issue!!! */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x006f -> B:12:0x003b). Please report as a decompilation issue!!! */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x00ba -> B:12:0x003b). Please report as a decompilation issue!!! */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:36:0x00c2 -> B:12:0x003b). Please report as a decompilation issue!!! */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x00e6 -> B:12:0x003b). Please report as a decompilation issue!!! */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(com.facebook.aura.conversation.viewmodel.ConversationTurn r13, X.HtJ<? super kotlin.Unit> r14) {
                /*
                    Method dump skipped, instructions count: 303
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.conversation.viewmodel.HatchFinishedRepliesKt.C115661.C01311.emit(com.facebook.aura.conversation.viewmodel.ConversationTurn, X.HtJ):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C115661(C20Q<ConversationTurn> c20q, C20Q<Boolean> c20q2, Function0<String> function0, HtJ<? super C115661> htJ) {
            super(2, htJ);
            this.$this_finishedReplies = c20q;
            this.$canSpeak = c20q2;
            this.$agentName = function0;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            C115661 c115661 = new C115661(this.$this_finishedReplies, this.$canSpeak, this.$agentName, htJ);
            c115661.L$0 = obj;
            return c115661;
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            C20Z c20z = (C20Z) this.L$0;
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                C20Q<ConversationTurn> c20q = this.$this_finishedReplies;
                C01311 c01311 = new C01311(linkedHashSet, this.$canSpeak, this.$agentName, c20z);
                this.L$0 = null;
                this.L$1 = null;
                this.label = 1;
                if (c20q.collect(c01311, this) == enumC10460Hji) {
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
        public final Object invoke(C20Z<? super HatchConversationAnnouncement> c20z, HtJ<? super Unit> htJ) {
            return ((C115661) create(c20z, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.conversation.viewmodel.HatchFinishedRepliesKt$shownOneAtATime$1", f = "HatchFinishedReplies.kt", l = {130}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.conversation.viewmodel.HatchFinishedRepliesKt$shownOneAtATime$1, reason: invalid class name and case insensitive filesystem */
    public final class C115671 extends AbstractC07127nr implements G0V<HyO<? super HatchConversationAnnouncement>, HtJ<? super Unit>, Object> {
        public final /* synthetic */ C20Q<Boolean> $canSpeak;
        public final /* synthetic */ C20Q<HatchConversationAnnouncement> $this_shownOneAtATime;
        public /* synthetic */ Object L$0;
        public Object L$1;
        public int label;

        @DebugMetadata(c = "com.facebook.aura.conversation.viewmodel.HatchFinishedRepliesKt$shownOneAtATime$1$1", f = "HatchFinishedReplies.kt", l = {121}, m = "invokeSuspend", v = 2)
        /* renamed from: com.facebook.aura.conversation.viewmodel.HatchFinishedRepliesKt$shownOneAtATime$1$1, reason: invalid class name and collision with other inner class name */
        public final class C01321 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
            public final /* synthetic */ HyO<HatchConversationAnnouncement> $$this$channelFlow;
            public final /* synthetic */ BLG<HatchConversationAnnouncement> $shown;
            public int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C01321(BLG<HatchConversationAnnouncement> blg, HyO<? super HatchConversationAnnouncement> hyO, HtJ<? super C01321> htJ) {
                super(2, htJ);
                this.$shown = blg;
                this.$$this$channelFlow = hyO;
            }

            @Override // X.AbstractC8884Fsp
            public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
                return new C01321(this.$shown, this.$$this$channelFlow, htJ);
            }

            @Override // X.AbstractC8884Fsp
            public final Object invokeSuspend(Object obj) {
                EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
                int i = this.label;
                if (i == 0) {
                    Hwg.A00(obj);
                    BLG<HatchConversationAnnouncement> blg = this.$shown;
                    final HyO<HatchConversationAnnouncement> hyO = this.$$this$channelFlow;
                    C20Z<? super HatchConversationAnnouncement> c20z = new C20Z() { // from class: com.facebook.aura.conversation.viewmodel.HatchFinishedRepliesKt.shownOneAtATime.1.1.1
                        @Override // X.C20Z
                        public /* bridge */ /* synthetic */ Object emit(Object obj2, HtJ htJ) {
                            return emit((HatchConversationAnnouncement) obj2, (HtJ<? super Unit>) htJ);
                        }

                        public final Object emit(HatchConversationAnnouncement hatchConversationAnnouncement, HtJ<? super Unit> htJ) {
                            Object objAcU = hyO.AcU(hatchConversationAnnouncement, htJ);
                            if (objAcU != EnumC10460Hji.A02) {
                                return Unit.INSTANCE;
                            }
                            return objAcU;
                        }
                    };
                    this.label = 1;
                    if (blg.collect(c20z, this) == enumC10460Hji) {
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
                return ((C01321) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
            }
        }

        @DebugMetadata(c = "com.facebook.aura.conversation.viewmodel.HatchFinishedRepliesKt$shownOneAtATime$1$2", f = "HatchFinishedReplies.kt", l = {122}, m = "invokeSuspend", v = 2)
        /* renamed from: com.facebook.aura.conversation.viewmodel.HatchFinishedRepliesKt$shownOneAtATime$1$2, reason: invalid class name */
        public final class AnonymousClass2 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
            public final /* synthetic */ C20Q<Boolean> $canSpeak;
            public final /* synthetic */ BLG<HatchConversationAnnouncement> $shown;
            public int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass2(C20Q<Boolean> c20q, BLG<HatchConversationAnnouncement> blg, HtJ<? super AnonymousClass2> htJ) {
                super(2, htJ);
                this.$canSpeak = c20q;
                this.$shown = blg;
            }

            @Override // X.AbstractC8884Fsp
            public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
                return new AnonymousClass2(this.$canSpeak, this.$shown, htJ);
            }

            @Override // X.AbstractC8884Fsp
            public final Object invokeSuspend(Object obj) {
                EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
                int i = this.label;
                if (i == 0) {
                    Hwg.A00(obj);
                    C20Q<Boolean> c20q = this.$canSpeak;
                    final BLG<HatchConversationAnnouncement> blg = this.$shown;
                    C20Z<? super Boolean> c20z = new C20Z() { // from class: com.facebook.aura.conversation.viewmodel.HatchFinishedRepliesKt.shownOneAtATime.1.2.1
                        @Override // X.C20Z
                        public /* bridge */ /* synthetic */ Object emit(Object obj2, HtJ htJ) {
                            return emit(AnonymousClass001.A1X(obj2), (HtJ<? super Unit>) htJ);
                        }

                        public final Object emit(boolean z, HtJ<? super Unit> htJ) {
                            if (!z) {
                                blg.Af8(null);
                            }
                            return Unit.INSTANCE;
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

            @Override // X.G0V
            public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
                return ((AnonymousClass2) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
            }
        }

        @DebugMetadata(c = "com.facebook.aura.conversation.viewmodel.HatchFinishedRepliesKt$shownOneAtATime$1$3", f = "HatchFinishedReplies.kt", l = {193}, m = "invokeSuspend", v = 2)
        /* renamed from: com.facebook.aura.conversation.viewmodel.HatchFinishedRepliesKt$shownOneAtATime$1$3, reason: invalid class name */
        public final class AnonymousClass3 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
            public final /* synthetic */ BLG<HatchConversationAnnouncement> $shown;
            public Object L$0;
            public Object L$1;
            public int label;

            @DebugMetadata(c = "com.facebook.aura.conversation.viewmodel.HatchFinishedRepliesKt$shownOneAtATime$1$3$1", f = "HatchFinishedReplies.kt", l = {126}, m = "invokeSuspend", v = 2)
            /* renamed from: com.facebook.aura.conversation.viewmodel.HatchFinishedRepliesKt$shownOneAtATime$1$3$1, reason: invalid class name and collision with other inner class name */
            public final class C01351 extends AbstractC07127nr implements G0V<HatchConversationAnnouncement, HtJ<? super Unit>, Object> {
                public final /* synthetic */ BLG<HatchConversationAnnouncement> $shown;
                public /* synthetic */ Object L$0;
                public int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C01351(BLG<HatchConversationAnnouncement> blg, HtJ<? super C01351> htJ) {
                    super(2, htJ);
                    this.$shown = blg;
                }

                @Override // X.AbstractC8884Fsp
                public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
                    C01351 c01351 = new C01351(this.$shown, htJ);
                    c01351.L$0 = obj;
                    return c01351;
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // X.AbstractC8884Fsp
                public final Object invokeSuspend(Object obj) {
                    Object obj2 = this.L$0;
                    EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
                    int i = this.label;
                    if (i == 0) {
                        Hwg.A00(obj);
                        if (obj2 != null) {
                            this.L$0 = obj2;
                            this.label = 1;
                            if (C7Bq.A01(2000L, this) == enumC10460Hji) {
                                return enumC10460Hji;
                            }
                        }
                        return Unit.INSTANCE;
                    }
                    if (i != 1) {
                        throw AnonymousClass001.A0n();
                    }
                    Hwg.A00(obj);
                    this.$shown.A6e(obj2, null);
                    return Unit.INSTANCE;
                }

                @Override // X.G0V
                public final Object invoke(HatchConversationAnnouncement hatchConversationAnnouncement, HtJ<? super Unit> htJ) {
                    return ((C01351) create(hatchConversationAnnouncement, htJ)).invokeSuspend(Unit.INSTANCE);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass3(BLG<HatchConversationAnnouncement> blg, HtJ<? super AnonymousClass3> htJ) {
                super(2, htJ);
                this.$shown = blg;
            }

            @Override // X.AbstractC8884Fsp
            public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
                return new AnonymousClass3(this.$shown, htJ);
            }

            @Override // X.AbstractC8884Fsp
            public final Object invokeSuspend(Object obj) {
                EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
                int i = this.label;
                if (i == 0) {
                    Hwg.A00(obj);
                    BLG<HatchConversationAnnouncement> blg = this.$shown;
                    C01351 c01351 = new C01351(blg, null);
                    C7384Etj.A0Z(blg, "null cannot be cast to non-null type kotlinx.coroutines.flow.Flow<T of kotlinx.coroutines.flow.FlowKt__CollectKt.collectLatest>");
                    this.L$0 = null;
                    this.L$1 = null;
                    this.label = 1;
                    if (C3pU.A00(this, c01351, blg) == enumC10460Hji) {
                        return enumC10460Hji;
                    }
                } else {
                    if (i != 1) {
                        throw AnonymousClass001.A0n();
                    }
                    Hwg.A00(obj);
                }
                throw new IllegalStateException("SharedFlow never completes, this call should never return.");
            }

            @Override // X.G0V
            public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
                return new AnonymousClass3(this.$shown, htJ).invokeSuspend(Unit.INSTANCE);
            }
        }

        /* renamed from: com.facebook.aura.conversation.viewmodel.HatchFinishedRepliesKt$shownOneAtATime$1$4, reason: invalid class name */
        public final class AnonymousClass4<T> implements C20Z {
            public final /* synthetic */ C20Q<Boolean> $canSpeak;
            public final /* synthetic */ BLG<HatchConversationAnnouncement> $shown;

            public AnonymousClass4(BLG<HatchConversationAnnouncement> blg, C20Q<Boolean> c20q) {
                this.$shown = blg;
                this.$canSpeak = c20q;
            }

            @Override // X.C20Z
            public /* bridge */ /* synthetic */ Object emit(Object obj, HtJ htJ) {
                return emit((HatchConversationAnnouncement) obj, (HtJ<? super Unit>) htJ);
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:27:0x0064  */
            /* JADX WARN: Removed duplicated region for block: B:30:0x0075  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(com.facebook.aura.conversation.viewmodel.HatchConversationAnnouncement r10, X.HtJ<? super kotlin.Unit> r11) {
                /*
                    r9 = this;
                    boolean r0 = r11 instanceof com.facebook.aura.conversation.viewmodel.HatchFinishedRepliesKt$shownOneAtATime$1$4$emit$1
                    if (r0 == 0) goto L75
                    r5 = r11
                    com.facebook.aura.conversation.viewmodel.HatchFinishedRepliesKt$shownOneAtATime$1$4$emit$1 r5 = (com.facebook.aura.conversation.viewmodel.HatchFinishedRepliesKt$shownOneAtATime$1$4$emit$1) r5
                    int r2 = r5.label
                    r1 = -2147483648(0xffffffff80000000, float:-0.0)
                    r0 = r2 & r1
                    if (r0 == 0) goto L75
                    int r2 = r2 - r1
                    r5.label = r2
                L12:
                    java.lang.Object r0 = r5.result
                    X.Hji r4 = X.EnumC10460Hji.A02
                    int r3 = r5.label
                    r1 = 300(0x12c, double:1.48E-321)
                    r6 = 3
                    r8 = 2
                    r7 = 1
                    if (r3 == 0) goto L2b
                    if (r3 == r7) goto L47
                    if (r3 == r8) goto L59
                    if (r3 != r6) goto L7b
                    X.Hwg.A00(r0)
                L28:
                    kotlin.Unit r4 = kotlin.Unit.INSTANCE
                    return r4
                L2b:
                    X.Hwg.A00(r0)
                    X.BLG<com.facebook.aura.conversation.viewmodel.HatchConversationAnnouncement> r0 = r9.$shown
                    java.lang.Object r0 = r0.getValue()
                    if (r0 == 0) goto L4c
                    X.BLG<com.facebook.aura.conversation.viewmodel.HatchConversationAnnouncement> r3 = r9.$shown
                    r0 = 0
                    r3.Af8(r0)
                    r5.L$0 = r10
                    r5.label = r7
                    java.lang.Object r0 = X.C7Bq.A01(r1, r5)
                    if (r0 != r4) goto L4c
                    return r4
                L47:
                    java.lang.Object r10 = r5.L$0
                    X.Hwg.A00(r0)
                L4c:
                    X.20Q<java.lang.Boolean> r0 = r9.$canSpeak
                    r5.L$0 = r10
                    r5.label = r8
                    java.lang.Object r0 = X.AbstractC9777Gfy.A02(r0, r5)
                    if (r0 != r4) goto L5e
                    return r4
                L59:
                    java.lang.Object r10 = r5.L$0
                    X.Hwg.A00(r0)
                L5e:
                    boolean r0 = X.AnonymousClass001.A1X(r0)
                    if (r0 == 0) goto L28
                    X.BLG<com.facebook.aura.conversation.viewmodel.HatchConversationAnnouncement> r0 = r9.$shown
                    r0.Af8(r10)
                    r0 = 0
                    r5.L$0 = r0
                    r5.label = r6
                    java.lang.Object r0 = X.C7Bq.A01(r1, r5)
                    if (r0 != r4) goto L28
                    return r4
                L75:
                    com.facebook.aura.conversation.viewmodel.HatchFinishedRepliesKt$shownOneAtATime$1$4$emit$1 r5 = new com.facebook.aura.conversation.viewmodel.HatchFinishedRepliesKt$shownOneAtATime$1$4$emit$1
                    r5.<init>(r9, r11)
                    goto L12
                L7b:
                    java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
                    throw r0
                */
                throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.conversation.viewmodel.HatchFinishedRepliesKt.C115671.AnonymousClass4.emit(com.facebook.aura.conversation.viewmodel.HatchConversationAnnouncement, X.HtJ):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C115671(C20Q<? extends HatchConversationAnnouncement> c20q, C20Q<Boolean> c20q2, HtJ<? super C115671> htJ) {
            super(2, htJ);
            this.$this_shownOneAtATime = c20q;
            this.$canSpeak = c20q2;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            C115671 c115671 = new C115671(this.$this_shownOneAtATime, this.$canSpeak, htJ);
            c115671.L$0 = obj;
            return c115671;
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            HyO hyO = (HyO) this.L$0;
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                C9286GCn c9286GCn = new C9286GCn(HwN.A01);
                C01321 c01321 = new C01321(c9286GCn, hyO, null);
                C6ys c6ys = C6ys.A00;
                Integer num = C79.A00;
                GAo.A02(num, c6ys, c01321, hyO);
                GAo.A02(num, c6ys, new AnonymousClass2(this.$canSpeak, c9286GCn, null), hyO);
                GAo.A02(num, c6ys, new AnonymousClass3(c9286GCn, null), hyO);
                C20Q<HatchConversationAnnouncement> c20q = this.$this_shownOneAtATime;
                AnonymousClass4 anonymousClass4 = new AnonymousClass4(c9286GCn, this.$canSpeak);
                this.L$0 = null;
                this.L$1 = null;
                this.label = 1;
                if (c20q.collect(anonymousClass4, this) == enumC10460Hji) {
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
        public final Object invoke(HyO<? super HatchConversationAnnouncement> hyO, HtJ<? super Unit> htJ) {
            return ((C115671) create(hyO, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.conversation.viewmodel.HatchFinishedRepliesKt$withTurnSentAfter$1", f = "HatchFinishedReplies.kt", l = {}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.conversation.viewmodel.HatchFinishedRepliesKt$withTurnSentAfter$1, reason: invalid class name and case insensitive filesystem */
    public final class C115681 extends AbstractC07127nr implements G2j<AHD<? extends HatchConversationListItem>, HatchSentTurn, String, HtJ<? super ConversationTurn>, Object> {
        public final /* synthetic */ String $requestIdBeforeStart;
        public /* synthetic */ Object L$0;
        public /* synthetic */ Object L$1;
        public /* synthetic */ Object L$2;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C115681(String str, HtJ<? super C115681> htJ) {
            super(4, htJ);
            this.$requestIdBeforeStart = str;
        }

        @Override // X.G2j
        public final Object invoke(AHD<? extends HatchConversationListItem> ahd, HatchSentTurn hatchSentTurn, String str, HtJ<? super ConversationTurn> htJ) {
            C115681 c115681 = new C115681(this.$requestIdBeforeStart, htJ);
            c115681.L$0 = ahd;
            c115681.L$1 = hatchSentTurn;
            c115681.L$2 = str;
            return c115681.invokeSuspend(Unit.INSTANCE);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            String str;
            AHD ahd = (AHD) this.L$0;
            HatchSentTurn hatchSentTurn = (HatchSentTurn) this.L$1;
            Object obj2 = this.L$2;
            if (this.label != 0) {
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(obj);
            String strUserMessageKey = null;
            if (hatchSentTurn != null) {
                String str2 = this.$requestIdBeforeStart;
                if (C7384Etj.areEqual(hatchSentTurn.requestId, obj2) && !C7384Etj.areEqual(hatchSentTurn.requestId, str2) && (str = hatchSentTurn.messageId) != null) {
                    strUserMessageKey = HatchFinishedRepliesKt.userMessageKey(ahd, str);
                }
            }
            return new ConversationTurn(ahd, strUserMessageKey);
        }
    }

    public static final C20Q<HatchConversationAnnouncement> agentWorking(C20Q<ConversationTurn> c20q, C20Q<Boolean> c20q2, Function0<String> function0, C20Q<String> c20q3) {
        return AbstractC05623ug.A00(AuraDispatchers.INSTANCE.m764default(), AbstractC05643uj.A01(new AnonymousClass1(c20q, c20q3, c20q2, function0, null)));
    }

    public static final C20Q<HatchConversationAnnouncement> announcements(C20Q<? extends AHD<? extends HatchConversationListItem>> c20q, C1BN<String> c1bn, C1BN<HatchSentTurn> c1bn2, C20Q<Boolean> c20q2, Function0<String> function0, C20Q<String> c20q3, C20Q<? extends HatchSendErrorCategory> c20q4) {
        AnonymousClass005.A17(c20q, c1bn, c1bn2, c20q2, function0);
        AnonymousClass003.A0z(c20q3, c20q4);
        return new C05663ul(new C115651(c20q, c1bn2, c1bn, c20q2, function0, c20q3, c20q4, null));
    }

    public static final C20Q<HatchConversationAnnouncement> finishedReplies(C20Q<ConversationTurn> c20q, C20Q<Boolean> c20q2, Function0<String> function0) {
        return AbstractC05623ug.A00(AuraDispatchers.INSTANCE.m764default(), new C05663ul(new C115661(c20q, c20q2, function0, null)));
    }

    public static final C20Q<HatchConversationAnnouncement> shownOneAtATime(C20Q<? extends HatchConversationAnnouncement> c20q, C20Q<Boolean> c20q2) {
        return AbstractC05643uj.A01(new C115671(c20q, c20q2, null));
    }

    public static final C20Q<ConversationTurn> withTurnSentAfter(C20Q<? extends AHD<? extends HatchConversationListItem>> c20q, C1BN<HatchSentTurn> c1bn, C1BN<String> c1bn2, String str) {
        return C3rb.A00(new C115681(str, null), c20q, c1bn, c1bn2);
    }

    public static final HatchConversationAnnouncement announcement(HatchConversationListItem.Message message, Function0<String> function0) {
        String strSanitizeForNotificationOrNull = HatchStringUtils.INSTANCE.sanitizeForNotificationOrNull(message.message.content);
        if (strSanitizeForNotificationOrNull != null) {
            return new HatchConversationAnnouncement.Reply(message.key, strSanitizeForNotificationOrNull);
        }
        if (!C7BY.A0j(message.message.content) || message.message.getHasWidgets() || message.message.getHasPresentations()) {
            return new HatchConversationAnnouncement.ReplyWithoutText(message.key, function0.invoke());
        }
        return null;
    }

    public static final C20Q<HatchConversationAnnouncement> sendFailures(C20Q<? extends HatchSendErrorCategory> c20q, C20Q<Boolean> c20q2) {
        return new HatchFinishedRepliesKt$sendFailures$$inlined$map$1(new HatchFinishedRepliesKt$sendFailures$$inlined$filter$2(C4o7.A00(new C3bP(300L, 1), new HatchFinishedRepliesKt$sendFailures$$inlined$filter$1(c20q, c20q2)), c20q2));
    }

    public static final List<HatchConversationListItem.Message> agentMessagesAfter(List<? extends HatchConversationListItem> list, String str) {
        Iterator<? extends HatchConversationListItem> it = list.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            if (!C7384Etj.areEqual(it.next().getKey(), str)) {
                i++;
            } else if (i >= 0) {
                List<? extends HatchConversationListItem> listSubList = list.subList(i + 1, list.size());
                ArrayList arrayList = new ArrayList();
                for (HatchConversationListItem hatchConversationListItem : listSubList) {
                    if (hatchConversationListItem instanceof HatchConversationListItem.Message) {
                        arrayList.add(hatchConversationListItem);
                    }
                }
                ArrayList arrayList2 = new ArrayList();
                for (Object obj : arrayList) {
                    if (((HatchConversationListItem.Message) obj).message.isAgent) {
                        arrayList2.add(obj);
                    }
                }
                return arrayList2;
            }
        }
        return C0881AGi.A00;
    }

    public static final boolean showsTypingCursorAfter(List<? extends HatchConversationListItem> list, String str) {
        Iterator<? extends HatchConversationListItem> it = list.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            if (!C7384Etj.areEqual(it.next().getKey(), str)) {
                i++;
            } else if (i >= 0) {
                List<? extends HatchConversationListItem> listSubList = list.subList(i + 1, list.size());
                if (!(listSubList instanceof Collection) || !listSubList.isEmpty()) {
                    Iterator<? extends HatchConversationListItem> it2 = listSubList.iterator();
                    while (it2.hasNext()) {
                        if (it2.next() instanceof HatchConversationListItem.TypingCursor) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public static final String userMessageKey(List<? extends HatchConversationListItem> list, String str) {
        HatchConversationListItem hatchConversationListItemPrevious;
        ListIterator<? extends HatchConversationListItem> listIterator = list.listIterator(list.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                hatchConversationListItemPrevious = null;
                break;
            }
            hatchConversationListItemPrevious = listIterator.previous();
            HatchConversationListItem hatchConversationListItem = hatchConversationListItemPrevious;
            if (hatchConversationListItem instanceof HatchConversationListItem.Message) {
                HatchConversationListItem.Message message = (HatchConversationListItem.Message) hatchConversationListItem;
                HatchMessageUiModel hatchMessageUiModel = message.message;
                if (hatchMessageUiModel.role != HatchMessageRole.USER) {
                    continue;
                } else {
                    String str2 = message.renderedIdOverride;
                    if (str2 == null) {
                        str2 = hatchMessageUiModel.id;
                    }
                    if (C7384Etj.areEqual(str2, str)) {
                        break;
                    }
                }
            }
        }
        HatchConversationListItem hatchConversationListItem2 = hatchConversationListItemPrevious;
        if (hatchConversationListItem2 != null) {
            return hatchConversationListItem2.getKey();
        }
        return null;
    }
}
