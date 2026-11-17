package com.facebook.aura.conversation.offline;

import X.AbstractC07127nr;
import X.AbstractC3358CGz;
import X.AnonymousClass001;
import X.AnonymousClass006;
import X.BHL;
import X.BzK;
import X.C06H;
import X.C0881AGi;
import X.C10571Hud;
import X.C31u;
import X.C3UX;
import X.C3cG;
import X.C3cH;
import X.C3cJ;
import X.C4oT;
import X.C60O;
import X.C60P;
import X.C60Q;
import X.C60R;
import X.C6tn;
import X.C7354EnR;
import X.C7384Etj;
import X.C9hr;
import X.C9sU;
import X.CFK;
import X.DCl;
import X.F0C;
import X.G0V;
import X.GAo;
import X.HtJ;
import X.Hwg;
import X.HzP;
import X.InterfaceC7359EnW;
import X.InterfaceC7549F2g;
import android.content.Context;
import com.facebook.aura.common.prefs.AuraVMPrefStore;
import com.facebook.aura.common.prefs.AuraVMPrefs;
import com.facebook.aura.common.url.HatchPeerInviteLinks;
import com.facebook.aura.conversation.offline.MC;
import com.facebook.aura.gateway.HatchSessionItem;
import com.facebook.aura.gateway.store.HatchGatewayPrefsStore;
import com.facebook.aura.json.HatchJsonKt;
import com.facebook.aura.mobileconfig.AuraMobileConfigDelegatesKt;
import com.facebook.aura.model.HatchMessage;
import com.facebook.aura.model.HatchWidget;
import com.facebook.aura.model.HatchWidgetPresentation;
import com.facebook.aura.model.HatchWidgetPresentationKt;
import com.facebook.aura.model.JSONState;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* loaded from: classes3.dex */
public final class HatchOfflineConversationRepository implements InterfaceC7549F2g {
    public static final long BYTES_PER_MB = 1048576;
    public static final int COLD_START_PAGE_SIZE = 20;
    public static final int MAX_GLOBAL_EVICTION_ITERATIONS = 64;
    public static final String TAG = "HatchOfflineConversationRepository";
    public static final int THREAD_SNIPPET_MAX_CHARS = 200;
    public static final String THREAD_STATUS_ACTIVE = "active";
    public final HatchOfflineConversationCipher cipher;
    public final HatchOfflineConversationDao dao;
    public final HatchOfflineConversationDatabase db;
    public volatile String keptVmId;
    public final ConcurrentHashMap<String, List<HatchMessage>> latestCache;
    public final ReentrantLock latestCacheLock;
    public final C31u mainMessageCap$delegate;
    public final C31u maxCachedSubThreads$delegate;
    public final C31u maxTotalMb$delegate;
    public volatile String requestedKeepVmId;
    public final C31u subThreadMessageCap$delegate;
    public final AbstractC3358CGz userSession;
    public static final /* synthetic */ InterfaceC7359EnW<Object>[] $$delegatedProperties = {new C7354EnR(HatchOfflineConversationRepository.class, "mainMessageCap", "getMainMessageCap()I", 0), new C7354EnR(HatchOfflineConversationRepository.class, "subThreadMessageCap", "getSubThreadMessageCap()I", 0), new C7354EnR(HatchOfflineConversationRepository.class, "maxCachedSubThreads", "getMaxCachedSubThreads()I", 0), new C7354EnR(HatchOfflineConversationRepository.class, "maxTotalMb", "getMaxTotalMb()I", 0)};
    public static final Companion Companion = new Companion();

    @DebugMetadata(c = "com.facebook.aura.conversation.offline.HatchOfflineConversationRepository$clearAllConversations$2", f = "HatchOfflineConversationRepository.kt", l = {}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.conversation.offline.HatchOfflineConversationRepository$clearAllConversations$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public int label;

        public AnonymousClass2(HtJ<? super AnonymousClass2> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return HatchOfflineConversationRepository.this.new AnonymousClass2(htJ);
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return HatchOfflineConversationRepository.this.new AnonymousClass2(htJ).invokeSuspend(Unit.INSTANCE);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            if (this.label != 0) {
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(obj);
            final HatchOfflineConversationRepository hatchOfflineConversationRepository = HatchOfflineConversationRepository.this;
            ReentrantLock reentrantLock = hatchOfflineConversationRepository.latestCacheLock;
            reentrantLock.lock();
            try {
                hatchOfflineConversationRepository.db.runInTransaction(new Runnable() { // from class: com.facebook.aura.conversation.offline.HatchOfflineConversationRepository$clearAllConversations$2$1$1
                    @Override // java.lang.Runnable
                    public final void run() {
                        hatchOfflineConversationRepository.dao.clearAllMessages();
                        hatchOfflineConversationRepository.dao.clearAllThreads();
                    }
                });
                hatchOfflineConversationRepository.latestCache.clear();
                return Unit.INSTANCE;
            } finally {
                reentrantLock.unlock();
            }
        }
    }

    @DebugMetadata(c = "com.facebook.aura.conversation.offline.HatchOfflineConversationRepository$deleteMessages$2", f = "HatchOfflineConversationRepository.kt", l = {}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.conversation.offline.HatchOfflineConversationRepository$deleteMessages$2, reason: invalid class name and case insensitive filesystem */
    public final class C113412 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ List<Long> $seqs;
        public final /* synthetic */ String $sessionId;
        public final /* synthetic */ String $vmId;
        public int label;
        public final /* synthetic */ HatchOfflineConversationRepository this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C113412(List<Long> list, HatchOfflineConversationRepository hatchOfflineConversationRepository, String str, String str2, HtJ<? super C113412> htJ) {
            super(2, htJ);
            this.$seqs = list;
            this.this$0 = hatchOfflineConversationRepository;
            this.$vmId = str;
            this.$sessionId = str2;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new C113412(this.$seqs, this.this$0, this.$vmId, this.$sessionId, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            if (this.label != 0) {
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(obj);
            if (!this.$seqs.isEmpty()) {
                HatchOfflineConversationRepository hatchOfflineConversationRepository = this.this$0;
                ReentrantLock reentrantLock = hatchOfflineConversationRepository.latestCacheLock;
                String str = this.$vmId;
                String str2 = this.$sessionId;
                List<Long> list = this.$seqs;
                reentrantLock.lock();
                try {
                    hatchOfflineConversationRepository.dao.deleteMessagesBySeq(str, str2, list);
                    hatchOfflineConversationRepository.latestCache.remove(hatchOfflineConversationRepository.latestCacheKey(str, str2, 20));
                } finally {
                    reentrantLock.unlock();
                }
            }
            return Unit.INSTANCE;
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ((C113412) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.conversation.offline.HatchOfflineConversationRepository", f = "HatchOfflineConversationRepository.kt", l = {235, 245}, m = "findMessage", v = 2)
    /* renamed from: com.facebook.aura.conversation.offline.HatchOfflineConversationRepository$findMessage$1, reason: invalid class name and case insensitive filesystem */
    public final class C113431 extends HzP {
        public long J$0;
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public int label;
        public /* synthetic */ Object result;

        public C113431(HtJ<? super C113431> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HatchOfflineConversationRepository.this.findMessage(null, null, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.conversation.offline.HatchOfflineConversationRepository$loadCachedThreads$2", f = "HatchOfflineConversationRepository.kt", l = {}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.conversation.offline.HatchOfflineConversationRepository$loadCachedThreads$2, reason: invalid class name and case insensitive filesystem */
    public final class C113462 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super List<? extends HatchSessionItem>>, Object> {
        public final /* synthetic */ String $vmId;
        public /* synthetic */ Object L$0;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C113462(String str, HtJ<? super C113462> htJ) {
            super(2, htJ);
            this.$vmId = str;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            C113462 c113462 = HatchOfflineConversationRepository.this.new C113462(this.$vmId, htJ);
            c113462.L$0 = obj;
            return c113462;
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            Object objA0s;
            if (this.label != 0) {
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(obj);
            List<HatchOfflineThreadEntity> listLoadThreads = HatchOfflineConversationRepository.this.dao.loadThreads(this.$vmId);
            HatchOfflineConversationRepository hatchOfflineConversationRepository = HatchOfflineConversationRepository.this;
            ArrayList arrayListA0h = C3cG.A0h();
            Iterator<HatchOfflineThreadEntity> it = listLoadThreads.iterator();
            while (it.hasNext()) {
                try {
                    objA0s = hatchOfflineConversationRepository.toSessionItem(it.next());
                } catch (Throwable th) {
                    objA0s = C3cG.A0s(th);
                }
                if (objA0s instanceof C10571Hud) {
                    objA0s = null;
                }
                if (objA0s != null) {
                    arrayListA0h.add(objA0s);
                }
            }
            return arrayListA0h;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(C3UX c3ux, HtJ<? super List<HatchSessionItem>> htJ) {
            return ((C113462) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Object invoke(C3UX c3ux, HtJ<? super List<? extends HatchSessionItem>> htJ) {
            return invoke2(c3ux, (HtJ<? super List<HatchSessionItem>>) htJ);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.conversation.offline.HatchOfflineConversationRepository$loadLatestMessages$3", f = "HatchOfflineConversationRepository.kt", l = {}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.conversation.offline.HatchOfflineConversationRepository$loadLatestMessages$3, reason: invalid class name */
    public final class AnonymousClass3 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super List<? extends HatchMessage>>, Object> {
        public final /* synthetic */ String $key;
        public final /* synthetic */ int $limit;
        public final /* synthetic */ String $sessionId;
        public final /* synthetic */ String $vmId;
        public /* synthetic */ Object L$0;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(String str, String str2, String str3, int i, HtJ<? super AnonymousClass3> htJ) {
            super(2, htJ);
            this.$key = str;
            this.$vmId = str2;
            this.$sessionId = str3;
            this.$limit = i;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            AnonymousClass3 anonymousClass3 = HatchOfflineConversationRepository.this.new AnonymousClass3(this.$key, this.$vmId, this.$sessionId, this.$limit, htJ);
            anonymousClass3.L$0 = obj;
            return anonymousClass3;
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            if (this.label != 0) {
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(obj);
            HatchOfflineConversationRepository hatchOfflineConversationRepository = HatchOfflineConversationRepository.this;
            ReentrantLock reentrantLock = hatchOfflineConversationRepository.latestCacheLock;
            String str = this.$key;
            String str2 = this.$vmId;
            String str3 = this.$sessionId;
            int i = this.$limit;
            reentrantLock.lock();
            try {
                List<HatchMessage> listA1B = hatchOfflineConversationRepository.latestCache.get(str);
                if (listA1B == null) {
                    List<HatchOfflineMessageEntity> listLoadLatestMessages = hatchOfflineConversationRepository.dao.loadLatestMessages(str2, str3, i);
                    ArrayList arrayListA0h = C3cG.A0h();
                    Iterator<HatchOfflineMessageEntity> it = listLoadLatestMessages.iterator();
                    while (it.hasNext()) {
                        HatchMessage domainOrNull = hatchOfflineConversationRepository.toDomainOrNull(it.next());
                        if (domainOrNull != null) {
                            arrayListA0h.add(domainOrNull);
                        }
                    }
                    listA1B = BHL.A1B(arrayListA0h);
                    if (!listA1B.isEmpty()) {
                        hatchOfflineConversationRepository.latestCache.put(str, listA1B);
                    }
                }
                return listA1B;
            } finally {
                reentrantLock.unlock();
            }
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(C3UX c3ux, HtJ<? super List<HatchMessage>> htJ) {
            return ((AnonymousClass3) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Object invoke(C3UX c3ux, HtJ<? super List<? extends HatchMessage>> htJ) {
            return invoke2(c3ux, (HtJ<? super List<HatchMessage>>) htJ);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.conversation.offline.HatchOfflineConversationRepository$loadMessagesBefore$2", f = "HatchOfflineConversationRepository.kt", l = {}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.conversation.offline.HatchOfflineConversationRepository$loadMessagesBefore$2, reason: invalid class name and case insensitive filesystem */
    public final class C113472 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super List<? extends HatchMessage>>, Object> {
        public final /* synthetic */ long $beforeSeq;
        public final /* synthetic */ int $limit;
        public final /* synthetic */ String $sessionId;
        public final /* synthetic */ String $vmId;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C113472(String str, String str2, long j, int i, HtJ<? super C113472> htJ) {
            super(2, htJ);
            this.$vmId = str;
            this.$sessionId = str2;
            this.$beforeSeq = j;
            this.$limit = i;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return HatchOfflineConversationRepository.this.new C113472(this.$vmId, this.$sessionId, this.$beforeSeq, this.$limit, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            if (this.label != 0) {
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(obj);
            List<HatchOfflineMessageEntity> listLoadMessagesBefore = HatchOfflineConversationRepository.this.dao.loadMessagesBefore(this.$vmId, this.$sessionId, this.$beforeSeq, this.$limit);
            HatchOfflineConversationRepository hatchOfflineConversationRepository = HatchOfflineConversationRepository.this;
            ArrayList arrayListA0h = C3cG.A0h();
            Iterator<HatchOfflineMessageEntity> it = listLoadMessagesBefore.iterator();
            while (it.hasNext()) {
                HatchMessage domainOrNull = hatchOfflineConversationRepository.toDomainOrNull(it.next());
                if (domainOrNull != null) {
                    arrayListA0h.add(domainOrNull);
                }
            }
            return BHL.A1B(arrayListA0h);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(C3UX c3ux, HtJ<? super List<HatchMessage>> htJ) {
            return ((C113472) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Object invoke(C3UX c3ux, HtJ<? super List<? extends HatchMessage>> htJ) {
            return invoke2(c3ux, (HtJ<? super List<HatchMessage>>) htJ);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.conversation.offline.HatchOfflineConversationRepository$loadPrimaryPushFetchStartedAt$2", f = "HatchOfflineConversationRepository.kt", l = {}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.conversation.offline.HatchOfflineConversationRepository$loadPrimaryPushFetchStartedAt$2, reason: invalid class name and case insensitive filesystem */
    public final class C113482 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Long>, Object> {
        public final /* synthetic */ String $vmId;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C113482(String str, HtJ<? super C113482> htJ) {
            super(2, htJ);
            this.$vmId = str;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new C113482(this.$vmId, htJ);
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Long> htJ) {
            return new C113482(this.$vmId, htJ).invokeSuspend(Unit.INSTANCE);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            if (this.label != 0) {
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(obj);
            try {
                Long lA0S = C3cG.A0S(AuraVMPrefs.INSTANCE.get(this.$vmId, AuraVMPrefStore.PUSH_HISTORY_PREFETCH).getLong("primary_session_id", 0L));
                if (lA0S.longValue() > 0) {
                    return lA0S;
                }
                return null;
            } catch (Exception e) {
                CFK.A08(HatchOfflineConversationRepository.TAG, "Failed to read the push history prefetch time", e);
                return null;
            }
        }
    }

    @DebugMetadata(c = "com.facebook.aura.conversation.offline.HatchOfflineConversationRepository$saveConfirmedWidgetState$2", f = "HatchOfflineConversationRepository.kt", l = {}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.conversation.offline.HatchOfflineConversationRepository$saveConfirmedWidgetState$2, reason: invalid class name and case insensitive filesystem */
    public final class C113492 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ HatchMessage $confirmedMessage;
        public final /* synthetic */ String $sessionId;
        public final /* synthetic */ JSONState $state;
        public final /* synthetic */ String $vmId;
        public final /* synthetic */ String $widgetId;
        public int label;
        public final /* synthetic */ HatchOfflineConversationRepository this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C113492(HatchMessage hatchMessage, HatchOfflineConversationRepository hatchOfflineConversationRepository, String str, String str2, String str3, JSONState jSONState, HtJ<? super C113492> htJ) {
            super(2, htJ);
            this.$confirmedMessage = hatchMessage;
            this.this$0 = hatchOfflineConversationRepository;
            this.$vmId = str;
            this.$sessionId = str2;
            this.$widgetId = str3;
            this.$state = jSONState;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new C113492(this.$confirmedMessage, this.this$0, this.$vmId, this.$sessionId, this.$widgetId, this.$state, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            HatchMessage domainOrNull;
            if (this.label != 0) {
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(obj);
            HatchMessage hatchMessageWithConfirmedWidgetState = this.$confirmedMessage;
            Long l = hatchMessageWithConfirmedWidgetState.seq;
            if (l == null) {
                return Unit.INSTANCE;
            }
            long jLongValue = l.longValue();
            HatchOfflineConversationRepository hatchOfflineConversationRepository = this.this$0;
            ReentrantLock reentrantLock = hatchOfflineConversationRepository.latestCacheLock;
            String str = this.$vmId;
            String str2 = this.$sessionId;
            String str3 = this.$widgetId;
            JSONState jSONState = this.$state;
            reentrantLock.lock();
            try {
                HatchOfflineMessageEntity hatchOfflineMessageEntityLoadMessage = hatchOfflineConversationRepository.dao.loadMessage(str, str2, jLongValue);
                if (hatchOfflineMessageEntityLoadMessage == null || (domainOrNull = hatchOfflineConversationRepository.toDomainOrNull(hatchOfflineMessageEntityLoadMessage)) == null ? hatchOfflineConversationRepository.hasWidgetState(hatchMessageWithConfirmedWidgetState, str3, jSONState) : (hatchMessageWithConfirmedWidgetState = hatchOfflineConversationRepository.withConfirmedWidgetState(domainOrNull, str3, jSONState)) != null) {
                    HatchOfflineMessageEntity entity = hatchOfflineConversationRepository.toEntity(hatchMessageWithConfirmedWidgetState, str, str2);
                    if (entity != null) {
                        hatchOfflineConversationRepository.dao.upsertMessages(Collections.singletonList(entity));
                        hatchOfflineConversationRepository.latestCache.remove(hatchOfflineConversationRepository.latestCacheKey(str, str2, 20));
                    }
                }
                return Unit.INSTANCE;
            } finally {
                reentrantLock.unlock();
            }
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ((C113492) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.conversation.offline.HatchOfflineConversationRepository$saveMessages$2", f = "HatchOfflineConversationRepository.kt", l = {}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.conversation.offline.HatchOfflineConversationRepository$saveMessages$2, reason: invalid class name and case insensitive filesystem */
    public final class C113502 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ List<HatchMessage> $messages;
        public final /* synthetic */ Long $pushFetchStartedAtMs;
        public final /* synthetic */ String $sessionId;
        public final /* synthetic */ HatchSessionItem $threadItem;
        public final /* synthetic */ String $vmId;
        public int label;
        public final /* synthetic */ HatchOfflineConversationRepository this$0;

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            BzK bzKA9q;
            if (this.label != 0) {
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(obj);
            List<HatchMessage> list = this.$messages;
            HatchOfflineConversationRepository hatchOfflineConversationRepository = this.this$0;
            String str = this.$vmId;
            String str2 = this.$sessionId;
            final ArrayList arrayListA0h = C3cG.A0h();
            Iterator<HatchMessage> it = list.iterator();
            while (it.hasNext()) {
                HatchOfflineMessageEntity entity = hatchOfflineConversationRepository.toEntity(C60Q.A0K(it), str, str2);
                if (entity != null) {
                    arrayListA0h.add(entity);
                }
            }
            if (arrayListA0h.isEmpty()) {
                return Unit.INSTANCE;
            }
            String str3 = this.$sessionId;
            boolean zEquals = "primary_session_id".equals(str3);
            final HatchOfflineThreadEntity hatchOfflineThreadEntityResolveThreadRow = !zEquals ? this.this$0.resolveThreadRow(this.$vmId, str3, this.$threadItem, this.$messages) : null;
            HatchOfflineConversationRepository hatchOfflineConversationRepository2 = this.this$0;
            final int subThreadMessageCap = !zEquals ? hatchOfflineConversationRepository2.getSubThreadMessageCap() : hatchOfflineConversationRepository2.getMainMessageCap();
            final int maxCachedSubThreads = this.this$0.getMaxCachedSubThreads();
            final long maxTotalBytes = this.this$0.getMaxTotalBytes();
            final HatchOfflineConversationRepository hatchOfflineConversationRepository3 = this.this$0;
            ReentrantLock reentrantLock = hatchOfflineConversationRepository3.latestCacheLock;
            final String str4 = this.$vmId;
            final String str5 = this.$sessionId;
            Long l = this.$pushFetchStartedAtMs;
            reentrantLock.lock();
            try {
                hatchOfflineConversationRepository3.db.runInTransaction(new Runnable() { // from class: com.facebook.aura.conversation.offline.HatchOfflineConversationRepository$saveMessages$2$1$1
                    @Override // java.lang.Runnable
                    public final void run() {
                        hatchOfflineConversationRepository3.dao.upsertMessages(arrayListA0h);
                        HatchOfflineThreadEntity hatchOfflineThreadEntity = hatchOfflineThreadEntityResolveThreadRow;
                        if (hatchOfflineThreadEntity != null) {
                            hatchOfflineConversationRepository3.dao.upsertThread(hatchOfflineThreadEntity);
                        }
                        hatchOfflineConversationRepository3.evict(str4, str5, subThreadMessageCap, maxCachedSubThreads, maxTotalBytes);
                    }
                });
                hatchOfflineConversationRepository3.latestCache.remove(hatchOfflineConversationRepository3.latestCacheKey(str4, str5, 20));
                if (zEquals) {
                    C4oT c4oT = AuraVMPrefs.INSTANCE.get(str4, AuraVMPrefStore.PUSH_HISTORY_PREFETCH);
                    if (l != null) {
                        bzKA9q = c4oT.A9q();
                        bzKA9q.AYp(str5, l.longValue());
                    } else if (c4oT.contains(str5)) {
                        bzKA9q = c4oT.A9q();
                        bzKA9q.Aae(str5);
                    }
                    bzKA9q.apply();
                }
                return Unit.INSTANCE;
            } finally {
                reentrantLock.unlock();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C113502(List<HatchMessage> list, String str, HatchOfflineConversationRepository hatchOfflineConversationRepository, String str2, HatchSessionItem hatchSessionItem, Long l, HtJ<? super C113502> htJ) {
            super(2, htJ);
            this.$messages = list;
            this.$sessionId = str;
            this.this$0 = hatchOfflineConversationRepository;
            this.$vmId = str2;
            this.$threadItem = hatchSessionItem;
            this.$pushFetchStartedAtMs = l;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new C113502(this.$messages, this.$sessionId, this.this$0, this.$vmId, this.$threadItem, this.$pushFetchStartedAtMs, htJ);
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ((C113502) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void evict(String str, String str2, int i, int i2, long j) {
        String strOldestEvictableThread;
        if (i < 1) {
            i = 1;
        }
        if (i2 < 1) {
            i2 = 1;
        }
        if (j < 1048576) {
            j = 1048576;
        }
        this.dao.trimMessagesToCap(str, str2, i);
        this.dao.deleteMessagesForEvictedThreads(str, "primary_session_id", i2);
        this.dao.deleteThreadsBeyondLru(str, i2);
        int i3 = 0;
        while (this.dao.totalJsonBytes(str) > j && (strOldestEvictableThread = this.dao.oldestEvictableThread(str, "primary_session_id")) != null) {
            this.dao.deleteMessagesForSession(str, strOldestEvictableThread);
            this.dao.deleteThread(str, strOldestEvictableThread);
            i3++;
            if (i3 >= 64) {
                return;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final HatchMessage toDomainOrNull(HatchOfflineMessageEntity hatchOfflineMessageEntity) {
        Object objA0s;
        C9sU c9sU;
        String strDecryptText;
        try {
            c9sU = HatchJsonKt.HatchJson;
            strDecryptText = decryptText(hatchOfflineMessageEntity.json);
        } catch (Throwable th) {
            objA0s = C3cG.A0s(th);
        }
        if (strDecryptText == null) {
            return null;
        }
        F0C<C9hr<Object>>[] f0cArr = HatchPersistedMessageJson.$childSerializers;
        objA0s = C60P.A05(((HatchPersistedMessageJson) c9sU.A00(strDecryptText, HatchPersistedMessageJson$$serializer.INSTANCE)).toDomain(), Long.valueOf(hatchOfflineMessageEntity.seq));
        return (HatchMessage) (objA0s instanceof C10571Hud ? null : objA0s);
    }

    public final void dropUnlistedThreads(final Set<String> set, final Long l) {
        C7384Etj.A0Y(set, 0);
        final String strCurrentVmId = currentVmId();
        if (strCurrentVmId != null) {
            C60O.A1D().execute(new Runnable() { // from class: com.facebook.aura.conversation.offline.HatchOfflineConversationRepository.dropUnlistedThreads.1
                @Override // java.lang.Runnable
                public final void run() {
                    try {
                        final HatchOfflineConversationRepository hatchOfflineConversationRepository = HatchOfflineConversationRepository.this;
                        ReentrantLock reentrantLock = hatchOfflineConversationRepository.latestCacheLock;
                        final String str = strCurrentVmId;
                        final Set<String> set2 = set;
                        final Long l2 = l;
                        reentrantLock.lock();
                        try {
                            hatchOfflineConversationRepository.db.runInTransaction(new Runnable() { // from class: com.facebook.aura.conversation.offline.HatchOfflineConversationRepository$dropUnlistedThreads$1$1$1
                                @Override // java.lang.Runnable
                                public final void run() {
                                    List<HatchOfflineThreadEntity> listLoadThreads = hatchOfflineConversationRepository.dao.loadThreads(str);
                                    Set<String> set3 = set2;
                                    Long l3 = l2;
                                    ArrayList<HatchOfflineThreadEntity> arrayListA0h = C3cG.A0h();
                                    for (HatchOfflineThreadEntity hatchOfflineThreadEntity : listLoadThreads) {
                                        HatchOfflineThreadEntity hatchOfflineThreadEntity2 = hatchOfflineThreadEntity;
                                        if (!set3.contains(hatchOfflineThreadEntity2.sessionId) && (l3 == null || (!hatchOfflineThreadEntity2.isPinned && hatchOfflineThreadEntity2.updatedAt > l3.longValue()))) {
                                            arrayListA0h.add(hatchOfflineThreadEntity);
                                        }
                                    }
                                    HatchOfflineConversationRepository hatchOfflineConversationRepository2 = hatchOfflineConversationRepository;
                                    String str2 = str;
                                    for (HatchOfflineThreadEntity hatchOfflineThreadEntity3 : arrayListA0h) {
                                        hatchOfflineConversationRepository2.dao.deleteMessagesForSession(str2, hatchOfflineThreadEntity3.sessionId);
                                        hatchOfflineConversationRepository2.dao.deleteThread(str2, hatchOfflineThreadEntity3.sessionId);
                                        hatchOfflineConversationRepository2.latestCache.remove(hatchOfflineConversationRepository2.latestCacheKey(str2, hatchOfflineThreadEntity3.sessionId, 20));
                                    }
                                }
                            });
                        } finally {
                            reentrantLock.unlock();
                        }
                    } catch (Exception e) {
                        CFK.A08(HatchOfflineConversationRepository.TAG, "Failed to drop unlisted threads' offline rows", e);
                    }
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0090  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x0070 -> B:12:0x002b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object findMessage(java.lang.String r12, java.lang.String r13, X.HtJ<? super com.facebook.aura.model.HatchMessage> r14) {
        /*
            r11 = this;
            r3 = r14
            r8 = r12
            boolean r0 = r14 instanceof com.facebook.aura.conversation.offline.HatchOfflineConversationRepository.C113431
            r7 = r11
            if (r0 == 0) goto L90
            r12 = r3
            com.facebook.aura.conversation.offline.HatchOfflineConversationRepository$findMessage$1 r12 = (com.facebook.aura.conversation.offline.HatchOfflineConversationRepository.C113431) r12
            int r2 = r12.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L90
            int r2 = r2 - r1
            r12.label = r2
        L15:
            java.lang.Object r6 = r12.result
            X.Hji r2 = X.EnumC10460Hji.A02
            int r3 = r12.label
            r1 = 2
            r0 = 1
            if (r3 == 0) goto L73
            if (r3 == r0) goto L85
            if (r3 != r1) goto L97
            java.lang.Object r13 = r12.L$1
            java.lang.Object r0 = r12.L$0
            java.lang.String r8 = X.C3cG.A0d(r0, r6)
        L2b:
            java.util.List r6 = (java.util.List) r6
        L2d:
            boolean r0 = r6.isEmpty()
            r4 = 0
            if (r0 != 0) goto L96
            java.util.Iterator r5 = r6.iterator()
        L38:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L50
            java.lang.Object r3 = r5.next()
            r0 = r3
            com.facebook.aura.model.HatchMessage r0 = (com.facebook.aura.model.HatchMessage) r0
            java.lang.String r0 = r0.id
            boolean r0 = X.C7384Etj.areEqual(r0, r13)
            if (r0 == 0) goto L38
            if (r3 == 0) goto L50
            return r3
        L50:
            java.lang.Object r0 = X.AbstractC0878AGe.A0G(r6)
            com.facebook.aura.model.HatchMessage r0 = (com.facebook.aura.model.HatchMessage) r0
            if (r0 == 0) goto L96
            java.lang.Long r0 = r0.seq
            if (r0 == 0) goto L96
            long r9 = r0.longValue()
            r12.L$0 = r8
            r12.L$1 = r13
            r12.L$2 = r4
            r12.J$0 = r9
            r12.label = r1
            r11 = 20
            java.lang.Object r6 = r7.loadMessagesBefore(r8, r9, r11, r12)
            if (r6 != r2) goto L2b
            return r2
        L73:
            X.Hwg.A00(r6)
            r12.L$0 = r8
            r12.L$1 = r13
            r12.label = r0
            r0 = 20
            java.lang.Object r6 = r11.loadLatestMessages(r8, r0, r12)
            if (r6 != r2) goto L8d
            return r2
        L85:
            java.lang.Object r13 = r12.L$1
            java.lang.Object r0 = r12.L$0
            java.lang.String r8 = X.C3cG.A0d(r0, r6)
        L8d:
            java.util.List r6 = (java.util.List) r6
            goto L2d
        L90:
            com.facebook.aura.conversation.offline.HatchOfflineConversationRepository$findMessage$1 r12 = new com.facebook.aura.conversation.offline.HatchOfflineConversationRepository$findMessage$1
            r12.<init>(r14)
            goto L15
        L96:
            return r4
        L97:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.conversation.offline.HatchOfflineConversationRepository.findMessage(java.lang.String, java.lang.String, X.HtJ):java.lang.Object");
    }

    public final void forgetThread(final String str) {
        C7384Etj.A0Y(str, 0);
        final String strCurrentVmId = currentVmId();
        if (strCurrentVmId != null) {
            C60O.A1D().execute(new Runnable() { // from class: com.facebook.aura.conversation.offline.HatchOfflineConversationRepository.forgetThread.1
                @Override // java.lang.Runnable
                public final void run() {
                    try {
                        final HatchOfflineConversationRepository hatchOfflineConversationRepository = HatchOfflineConversationRepository.this;
                        ReentrantLock reentrantLock = hatchOfflineConversationRepository.latestCacheLock;
                        final String str2 = strCurrentVmId;
                        final String str3 = str;
                        reentrantLock.lock();
                        try {
                            hatchOfflineConversationRepository.db.runInTransaction(new Runnable() { // from class: com.facebook.aura.conversation.offline.HatchOfflineConversationRepository$forgetThread$1$1$1
                                @Override // java.lang.Runnable
                                public final void run() {
                                    hatchOfflineConversationRepository.dao.deleteMessagesForSession(str2, str3);
                                    hatchOfflineConversationRepository.dao.deleteThread(str2, str3);
                                }
                            });
                            hatchOfflineConversationRepository.latestCache.remove(hatchOfflineConversationRepository.latestCacheKey(str2, str3, 20));
                        } finally {
                            reentrantLock.unlock();
                        }
                    } catch (Exception e) {
                        CFK.A08(HatchOfflineConversationRepository.TAG, "Failed to drop a deleted thread's offline rows", e);
                    }
                }
            });
        }
    }

    public final Object loadLatestMessages(String str, int i, HtJ<? super List<HatchMessage>> htJ) {
        String strCurrentVmId = currentVmId();
        if (strCurrentVmId == null) {
            return C0881AGi.A00;
        }
        String strLatestCacheKey = latestCacheKey(strCurrentVmId, str, i);
        List<HatchMessage> list = this.latestCache.get(strLatestCacheKey);
        return list != null ? list : GAo.A00(htJ, AnonymousClass001.A0y(), new AnonymousClass3(strLatestCacheKey, strCurrentVmId, str, i, null));
    }

    public final Object loadMessagesBefore(String str, long j, int i, HtJ<? super List<HatchMessage>> htJ) {
        String strCurrentVmId = currentVmId();
        return strCurrentVmId == null ? C0881AGi.A00 : GAo.A00(htJ, AnonymousClass001.A0y(), new C113472(strCurrentVmId, str, j, i, null));
    }

    private final String currentVmId() {
        return C3cH.A0a(HatchGatewayPrefsStore.Companion, this.userSession);
    }

    private final String decryptText(byte[] bArr) {
        byte[] bArrDecrypt = this.cipher.decrypt(bArr);
        if (bArrDecrypt != null) {
            return new String(bArrDecrypt, DCl.A05);
        }
        return null;
    }

    private final byte[] encryptText(String str) {
        HatchOfflineConversationCipher hatchOfflineConversationCipher = this.cipher;
        C7384Etj.A0Y(str, 0);
        return hatchOfflineConversationCipher.encrypt(C3cG.A1S(str));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int getMainMessageCap() {
        return AnonymousClass001.A0F(this.mainMessageCap$delegate.getValue(this, $$delegatedProperties[0]));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int getMaxCachedSubThreads() {
        return AnonymousClass001.A0F(this.maxCachedSubThreads$delegate.getValue(this, $$delegatedProperties[2]));
    }

    private final int getMaxTotalMb() {
        return AnonymousClass001.A0F(this.maxTotalMb$delegate.getValue(this, $$delegatedProperties[3]));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int getSubThreadMessageCap() {
        return AnonymousClass001.A0F(this.subThreadMessageCap$delegate.getValue(this, $$delegatedProperties[1]));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean hasWidgetState(HatchMessage hatchMessage, String str, JSONState jSONState) {
        List<HatchWidget> list = hatchMessage.widgets;
        if (list != null && (!(list instanceof Collection) || !list.isEmpty())) {
            for (HatchWidget hatchWidget : list) {
                if (C7384Etj.areEqual(hatchWidget.widgetId, str) && C7384Etj.areEqual(hatchWidget.state, jSONState)) {
                    return true;
                }
            }
        }
        List<HatchWidgetPresentation> list2 = hatchMessage.presentations;
        if (list2 == null) {
            return false;
        }
        if ((list2 instanceof Collection) && list2.isEmpty()) {
            return false;
        }
        for (HatchWidgetPresentation hatchWidgetPresentation : list2) {
            if (HatchWidgetPresentationKt.matchesWidgetId(hatchWidgetPresentation, str) && C7384Etj.areEqual(hatchWidgetPresentation.getState(), jSONState)) {
                return true;
            }
        }
        return false;
    }

    public static /* synthetic */ Object saveMessages$default(HatchOfflineConversationRepository hatchOfflineConversationRepository, String str, String str2, HatchSessionItem hatchSessionItem, List list, Long l, HtJ htJ, int i, Object obj) {
        if ((i & 16) != 0) {
            l = null;
        }
        return hatchOfflineConversationRepository.saveMessages(str, str2, hatchSessionItem, list, l, htJ);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final HatchOfflineMessageEntity toEntity(HatchMessage hatchMessage, String str, String str2) {
        byte[] bArrEncryptText;
        Long l = hatchMessage.seq;
        if (l != null) {
            long jLongValue = l.longValue();
            String strA02 = HatchJsonKt.HatchJson.A02(HatchPersistedMessageJson.Companion.fromDomain(hatchMessage), HatchPersistedMessageJson$$serializer.INSTANCE);
            if (!HatchPeerInviteLinks.INSTANCE.contains(strA02) && (bArrEncryptText = encryptText(strA02)) != null) {
                int length = bArrEncryptText.length;
                if (length <= 524288) {
                    return new HatchOfflineMessageEntity(str, str2, jLongValue, hatchMessage.timestamp, hatchMessage.serverMessageId, hatchMessage.role.name(), bArrEncryptText);
                }
                CFK.A06(TAG, C60P.A1O(" bytes=", C60O.A0z("Skipping oversized message: seq=", jLongValue), length));
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final HatchSessionItem toSessionItem(HatchOfflineThreadEntity hatchOfflineThreadEntity) {
        String str = hatchOfflineThreadEntity.sessionId;
        long j = hatchOfflineThreadEntity.createdAt;
        long j2 = hatchOfflineThreadEntity.updatedAt;
        String str2 = hatchOfflineThreadEntity.status;
        byte[] bArr = hatchOfflineThreadEntity.snippet;
        String strDecryptText = bArr != null ? decryptText(bArr) : null;
        boolean z = hatchOfflineThreadEntity.isThread;
        byte[] bArr2 = hatchOfflineThreadEntity.title;
        String strDecryptText2 = bArr2 != null ? decryptText(bArr2) : null;
        int i = hatchOfflineThreadEntity.unreadCount;
        boolean z2 = hatchOfflineThreadEntity.isPinned;
        String str3 = hatchOfflineThreadEntity.channel;
        byte[] bArr3 = hatchOfflineThreadEntity.accountUsername;
        return new HatchSessionItem(str, j, j2, str2, strDecryptText, z, strDecryptText2, i, z2, false, str3, bArr3 != null ? decryptText(bArr3) : null, hatchOfflineThreadEntity.canSendMessages);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final HatchMessage withConfirmedWidgetState(HatchMessage hatchMessage, String str, JSONState jSONState) {
        int i;
        List<HatchWidget> list = hatchMessage.widgets;
        int i2 = 0;
        if (list != null) {
            Iterator<HatchWidget> it = list.iterator();
            i = 0;
            while (it.hasNext()) {
                if (C7384Etj.areEqual(it.next().widgetId, str)) {
                    break;
                }
                i++;
            }
            i = -1;
        } else {
            i = -1;
        }
        if (list == null || i < 0) {
            List<HatchWidgetPresentation> list2 = hatchMessage.presentations;
            if (list2 != null) {
                Iterator<HatchWidgetPresentation> it2 = list2.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    if (!HatchWidgetPresentationKt.matchesWidgetId(it2.next(), str)) {
                        i2++;
                    } else if (i2 >= 0) {
                        HatchWidgetPresentation hatchWidgetPresentation = list2.get(i2);
                        if (jSONState.version >= hatchWidgetPresentation.getState().version && !jSONState.equals(hatchWidgetPresentation.getState())) {
                            ArrayList arrayList = new ArrayList(list2);
                            arrayList.set(i2, hatchWidgetPresentation.withState(jSONState));
                            return C60R.A0N(hatchMessage, arrayList);
                        }
                    }
                }
            }
        } else {
            HatchWidget hatchWidget = list.get(i);
            long j = jSONState.version;
            JSONState jSONState2 = hatchWidget.state;
            if (j >= jSONState2.version && !jSONState.equals(jSONState2)) {
                ArrayList arrayList2 = new ArrayList(list);
                arrayList2.set(i, hatchWidget.withState(jSONState));
                return HatchMessage.copy$default(hatchMessage, null, null, null, 0L, null, null, null, null, null, null, null, null, null, null, false, null, null, false, null, null, null, null, null, null, null, null, null, arrayList2, null, false, null, null, false, null, -134217729, 3, null);
            }
        }
        return null;
    }

    @Override // X.InterfaceC7549F2g
    public void clearUserData() {
        this.latestCache.clear();
        C60O.A1D().execute(new Runnable() { // from class: com.facebook.aura.conversation.offline.HatchOfflineConversationRepository.clearUserData.1
            @Override // java.lang.Runnable
            public final void run() {
                final HatchOfflineConversationRepository hatchOfflineConversationRepository = HatchOfflineConversationRepository.this;
                ReentrantLock reentrantLock = hatchOfflineConversationRepository.latestCacheLock;
                reentrantLock.lock();
                try {
                    hatchOfflineConversationRepository.db.runInTransaction(new Runnable() { // from class: com.facebook.aura.conversation.offline.HatchOfflineConversationRepository$clearUserData$1$1$1
                        @Override // java.lang.Runnable
                        public final void run() {
                            hatchOfflineConversationRepository.dao.clearAllMessages();
                            hatchOfflineConversationRepository.dao.clearAllThreads();
                            hatchOfflineConversationRepository.dao.clearAllDataKeys();
                        }
                    });
                    hatchOfflineConversationRepository.cipher.onUserDataCleared();
                    hatchOfflineConversationRepository.latestCache.clear();
                } finally {
                    reentrantLock.unlock();
                }
            }
        });
    }

    public final void keepOnlyVm(final String str) {
        if (str == null || !str.equals(this.keptVmId)) {
            this.requestedKeepVmId = str;
            this.latestCache.clear();
            C60O.A1D().execute(new Runnable() { // from class: com.facebook.aura.conversation.offline.HatchOfflineConversationRepository.keepOnlyVm.1
                @Override // java.lang.Runnable
                public final void run() {
                    try {
                        final HatchOfflineConversationRepository hatchOfflineConversationRepository = HatchOfflineConversationRepository.this;
                        ReentrantLock reentrantLock = hatchOfflineConversationRepository.latestCacheLock;
                        final String str2 = str;
                        reentrantLock.lock();
                        try {
                            if (C7384Etj.areEqual(str2, hatchOfflineConversationRepository.requestedKeepVmId)) {
                                hatchOfflineConversationRepository.db.runInTransaction(new Runnable() { // from class: com.facebook.aura.conversation.offline.HatchOfflineConversationRepository$keepOnlyVm$1$1$1
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        String str3 = str2;
                                        HatchOfflineConversationDao hatchOfflineConversationDao = hatchOfflineConversationRepository.dao;
                                        if (str3 == null) {
                                            hatchOfflineConversationDao.clearAllMessages();
                                            hatchOfflineConversationRepository.dao.clearAllThreads();
                                        } else {
                                            hatchOfflineConversationDao.deleteMessagesExceptVm(str3);
                                            hatchOfflineConversationRepository.dao.deleteThreadsExceptVm(str2);
                                        }
                                    }
                                });
                                hatchOfflineConversationRepository.latestCache.clear();
                                hatchOfflineConversationRepository.keptVmId = str2;
                            }
                        } finally {
                            reentrantLock.unlock();
                        }
                    } catch (Exception e) {
                        CFK.A08(HatchOfflineConversationRepository.TAG, "Failed to drop other VMs' offline rows", e);
                    }
                }
            });
        }
    }

    public final class Companion {
        public final HatchOfflineConversationRepository getInstance(AbstractC3358CGz abstractC3358CGz) {
            C7384Etj.A0Y(abstractC3358CGz, 0);
            return (HatchOfflineConversationRepository) abstractC3358CGz.A03(HatchOfflineConversationRepository.class, new HatchOfflineConversationRepository$Companion$getInstance$1(abstractC3358CGz));
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long getMaxTotalBytes() {
        return getMaxTotalMb() * 1048576;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String latestCacheKey(String str, String str2, int i) {
        StringBuilder sbA0g = C3cG.A0g(str);
        sbA0g.append("|");
        sbA0g.append(str2);
        return C60P.A1O("|", sbA0g, i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final HatchOfflineThreadEntity resolveThreadRow(String str, String str2, HatchSessionItem hatchSessionItem, List<HatchMessage> list) {
        long jLongValue;
        long jLongValue2;
        Object next;
        String str3;
        String strA03;
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (hatchSessionItem != null) {
            return toEntity(hatchSessionItem, str, jCurrentTimeMillis);
        }
        HatchOfflineThreadEntity thread = this.dao.getThread(str, str2);
        if (thread != null) {
            return HatchOfflineThreadEntity.copy$default(thread, null, null, null, null, 0L, 0L, false, null, 0, false, jCurrentTimeMillis, null, null, false, 15359, null);
        }
        Iterator<HatchMessage> it = list.iterator();
        byte[] bArrEncryptText = null;
        if (it.hasNext()) {
            Long lValueOf = Long.valueOf(C60Q.A0K(it).timestamp);
            while (it.hasNext()) {
                Long lValueOf2 = Long.valueOf(C60Q.A0K(it).timestamp);
                if (lValueOf.compareTo(lValueOf2) < 0) {
                    lValueOf = lValueOf2;
                }
            }
            jLongValue = lValueOf.longValue();
        } else {
            jLongValue = jCurrentTimeMillis;
        }
        Iterator<HatchMessage> it2 = list.iterator();
        if (it2.hasNext()) {
            Long lValueOf3 = Long.valueOf(C60Q.A0K(it2).timestamp);
            while (it2.hasNext()) {
                Long lValueOf4 = Long.valueOf(C60Q.A0K(it2).timestamp);
                if (lValueOf3.compareTo(lValueOf4) > 0) {
                    lValueOf3 = lValueOf4;
                }
            }
            jLongValue2 = lValueOf3.longValue();
        } else {
            jLongValue2 = jLongValue;
        }
        ArrayList arrayListA0h = C3cG.A0h();
        for (HatchMessage hatchMessage : list) {
            AnonymousClass006.A1F(hatchMessage.content, hatchMessage, arrayListA0h);
        }
        Iterator it3 = arrayListA0h.iterator();
        if (it3.hasNext()) {
            next = it3.next();
            if (it3.hasNext()) {
                long j = ((HatchMessage) next).timestamp;
                do {
                    Object next2 = it3.next();
                    long j2 = ((HatchMessage) next2).timestamp;
                    if (j < j2) {
                        next = next2;
                        j = j2;
                    }
                } while (it3.hasNext());
            }
        } else {
            next = null;
        }
        HatchMessage hatchMessage2 = (HatchMessage) next;
        if (hatchMessage2 != null && (str3 = hatchMessage2.content) != null && (strA03 = C6tn.A03(str3)) != null) {
            bArrEncryptText = encryptText(strA03);
        }
        return new HatchOfflineThreadEntity(str, str2, null, bArrEncryptText, jLongValue2, jLongValue, true, THREAD_STATUS_ACTIVE, 0, false, jCurrentTimeMillis, null, null, true);
    }

    public final Object clearAllConversations(HtJ<? super Unit> htJ) {
        return C3cJ.A0D(htJ, AnonymousClass001.A0y(), new AnonymousClass2(null));
    }

    public final Object deleteMessages(String str, String str2, List<Long> list, HtJ<Object> htJ) {
        return GAo.A00(htJ, AnonymousClass001.A0y(), new C113412(list, this, str, str2, null));
    }

    public final Object loadCachedThreads(HtJ<? super List<HatchSessionItem>> htJ) {
        String strCurrentVmId = currentVmId();
        return strCurrentVmId == null ? C0881AGi.A00 : GAo.A00(htJ, AnonymousClass001.A0y(), new C113462(strCurrentVmId, null));
    }

    public final Object loadPrimaryPushFetchStartedAt(HtJ<? super Long> htJ) {
        String strCurrentVmId = currentVmId();
        if (strCurrentVmId == null) {
            return null;
        }
        return GAo.A00(htJ, AnonymousClass001.A0y(), new C113482(strCurrentVmId, null));
    }

    public final Object saveConfirmedWidgetState(String str, String str2, HatchMessage hatchMessage, String str3, JSONState jSONState, HtJ<? super Unit> htJ) {
        return C3cJ.A0D(htJ, AnonymousClass001.A0y(), new C113492(hatchMessage, this, str, str2, str3, jSONState, null));
    }

    public final Object saveMessages(String str, String str2, HatchSessionItem hatchSessionItem, List<HatchMessage> list, Long l, HtJ<? super Unit> htJ) {
        return C3cJ.A0D(htJ, AnonymousClass001.A0y(), new C113502(list, str2, this, str, hatchSessionItem, l, null));
    }

    public /* synthetic */ HatchOfflineConversationRepository(Context context, AbstractC3358CGz abstractC3358CGz, C06H c06h) {
        this(context, abstractC3358CGz);
    }

    public HatchOfflineConversationRepository(Context context, AbstractC3358CGz abstractC3358CGz) {
        this.userSession = abstractC3358CGz;
        HatchOfflineConversationDatabase companion = HatchOfflineConversationDatabase.Companion.getInstance(context);
        this.db = companion;
        HatchOfflineConversationDao hatchOfflineConversationDaoDao = companion.dao();
        this.dao = hatchOfflineConversationDaoDao;
        this.cipher = new HatchOfflineConversationCipher(hatchOfflineConversationDaoDao);
        this.mainMessageCap$delegate = AuraMobileConfigDelegatesKt.auraMobileConfigInt(MC.hatch_android.offline_conversation_main_message_cap);
        this.subThreadMessageCap$delegate = AuraMobileConfigDelegatesKt.auraMobileConfigInt(MC.hatch_android.offline_conversation_subthread_message_cap);
        this.maxCachedSubThreads$delegate = AuraMobileConfigDelegatesKt.auraMobileConfigInt(MC.hatch_android.offline_conversation_max_cached_subthreads);
        this.maxTotalMb$delegate = AuraMobileConfigDelegatesKt.auraMobileConfigInt(MC.hatch_android.offline_conversation_max_total_mb);
        this.latestCache = C60O.A1C();
        this.latestCacheLock = new ReentrantLock();
    }

    private final HatchOfflineThreadEntity toEntity(HatchSessionItem hatchSessionItem, String str, long j) {
        String str2 = hatchSessionItem.sessionId;
        String str3 = hatchSessionItem.title;
        byte[] bArrEncryptText = str3 != null ? encryptText(str3) : null;
        String str4 = hatchSessionItem.snippet;
        byte[] bArrEncryptText2 = str4 != null ? encryptText(str4) : null;
        long j2 = hatchSessionItem.createdAt;
        long j3 = hatchSessionItem.updatedAt;
        boolean z = hatchSessionItem.isThread;
        String str5 = hatchSessionItem.status;
        int i = hatchSessionItem.unreadCount;
        boolean z2 = hatchSessionItem.isPinned;
        String str6 = hatchSessionItem.rawChannel;
        String str7 = hatchSessionItem.accountUsername;
        return new HatchOfflineThreadEntity(str, str2, bArrEncryptText, bArrEncryptText2, j2, j3, z, str5, i, z2, j, str6, str7 != null ? encryptText(str7) : null, hatchSessionItem.canSendMessages);
    }
}
