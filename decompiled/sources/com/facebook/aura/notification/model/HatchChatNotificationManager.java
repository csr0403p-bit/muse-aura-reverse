package com.facebook.aura.notification.model;

import X.AbstractC07127nr;
import X.AbstractC0878AGe;
import X.AbstractC3358CGz;
import X.AbstractC7536F0j;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.C06H;
import X.C20Z;
import X.C22I;
import X.C31u;
import X.C3UX;
import X.C3cG;
import X.C3cH;
import X.C3cI;
import X.C60O;
import X.C60P;
import X.C6tn;
import X.C7380Etd;
import X.C7384Etj;
import X.C78W;
import X.C7BY;
import X.CFK;
import X.EnumC10460Hji;
import X.FGI;
import X.G0V;
import X.HtJ;
import X.Hwg;
import X.Hxb;
import X.Hy1;
import X.InterfaceC7359EnW;
import X.InterfaceC7549F2g;
import android.content.Context;
import android.net.Uri;
import android.os.SystemClock;
import com.facebook.aura.ageverification.AgeVerificationClientKt;
import com.facebook.aura.analytics.hatch.HatchNotificationChannel;
import com.facebook.aura.analytics.hatch.HatchNotificationEventsLogger;
import com.facebook.aura.analytics.hatch.HatchNotificationOrigin;
import com.facebook.aura.conversation.repo.HatchThreadsRepositoryKt;
import com.facebook.aura.conversation.unread.HatchUnreadThreadsRepository;
import com.facebook.aura.executors.AuraExecutors;
import com.facebook.aura.gateway.HatchBackgroundSession;
import com.facebook.aura.gateway.HatchGatewayConnection;
import com.facebook.aura.gateway.JarvisUtils;
import com.facebook.aura.lifecycle.AuraAppLifecycleManager;
import com.facebook.aura.mobileconfig.AuraMobileConfigDelegatesKt;
import com.facebook.aura.model.CanonicalEventEnvelope;
import com.facebook.aura.model.HatchChatEvent;
import com.facebook.aura.model.HatchContentBlock;
import com.facebook.aura.model.HatchDeltaTranscript;
import com.facebook.aura.model.HatchMessage;
import com.facebook.aura.model.HatchSafetyStaticOverrideKt;
import com.facebook.aura.model.HatchTranscriptKt;
import com.facebook.aura.model.HatchTranscriptMessage;
import com.facebook.aura.model.SafetyStaticOverride;
import com.facebook.aura.notification.model.MC;
import com.facebook.aura.notifications.push.AuraNotificationChannels;
import com.facebook.aura.notifications.push.AuraPushNotificationData;
import com.facebook.aura.notifications.push.AuraPushNotificationRenderer;
import com.facebook.aura.notifications.push.HatchChatNotificationIds;
import com.facebook.aura.notifications.suppression.HatchNotificationSuppression;
import com.facebook.aura.onboarding.OnboardingStartupGate;
import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;
import com.facebook.aura.skills.connect.repository.CustomConnectorRegisterRepositoryKt;
import com.facebook.aura.utils.HatchStringUtils;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlinx.serialization.json.JsonElement;

/* loaded from: classes3.dex */
public final class HatchChatNotificationManager implements InterfaceC7549F2g {
    public static final String CHAT_DEEPLINK = "hatch://chat";
    public static final String CHAT_HOST = "chat";
    public static final String THREAD_HOST = "thread";
    public final Context appContext;
    public final HatchGatewayConnection gateway;
    public final C31u isStaticResponseRedactionEnabled$delegate;
    public final ConcurrentHashMap<String, Long> lastNotificationTimeByThread;
    public final ConcurrentHashMap<String, Long> processedNotificationEventKeys;
    public final C3UX scope;
    public final AbstractC3358CGz userSession;
    public static final /* synthetic */ InterfaceC7359EnW<Object>[] $$delegatedProperties = AnonymousClass003.A1b(HatchChatNotificationManager.class, "isStaticResponseRedactionEnabled", "isStaticResponseRedactionEnabled()Z");
    public static final Companion Companion = new Companion();

    public final class NotificationEvent {
        public final String content;
        public final String key;
        public final String messageId;
        public final String threadId;

        public final String getContent() {
            return this.content;
        }

        public final String getKey() {
            return this.key;
        }

        public final String getMessageId() {
            return this.messageId;
        }

        public final String getThreadId() {
            return this.threadId;
        }

        public NotificationEvent(String str, String str2, String str3, String str4) {
            AnonymousClass003.A0v(str, str3);
            this.key = str;
            this.messageId = str2;
            this.content = str3;
            this.threadId = str4;
        }
    }

    @DebugMetadata(c = "com.facebook.aura.notification.model.HatchChatNotificationManager$initialize$1", f = "HatchChatNotificationManager.kt", l = {HatchMessageShareDocumentRenderer.APP_ICON_SIZE_PX}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.notification.model.HatchChatNotificationManager$initialize$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public int label;

        public AnonymousClass1(HtJ<? super AnonymousClass1> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return HatchChatNotificationManager.this.new AnonymousClass1(htJ);
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return HatchChatNotificationManager.this.new AnonymousClass1(htJ).invokeSuspend(Unit.INSTANCE);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                C22I<HatchChatEvent> c22i = HatchChatNotificationManager.this.gateway.getEventsHandler$fbandroid_express_aura_java_com_facebook_aura_gateway_gateway().chatEvents;
                final HatchChatNotificationManager hatchChatNotificationManager = HatchChatNotificationManager.this;
                C20Z<? super HatchChatEvent> c20z = new C20Z() { // from class: com.facebook.aura.notification.model.HatchChatNotificationManager.initialize.1.1
                    @Override // X.C20Z
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, HtJ htJ) {
                        hatchChatNotificationManager.handleEvent((HatchChatEvent) obj2);
                        return Unit.INSTANCE;
                    }

                    public final Object emit(HatchChatEvent hatchChatEvent, HtJ<? super Unit> htJ) {
                        hatchChatNotificationManager.handleEvent(hatchChatEvent);
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
            throw C3cG.A0p();
        }
    }

    @DebugMetadata(c = "com.facebook.aura.notification.model.HatchChatNotificationManager$maybePostNotification$1", f = "HatchChatNotificationManager.kt", l = {280}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.notification.model.HatchChatNotificationManager$maybePostNotification$1, reason: invalid class name and case insensitive filesystem */
    public final class C127761 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public int label;

        public C127761(HtJ<? super C127761> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return HatchChatNotificationManager.this.new C127761(htJ);
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return HatchChatNotificationManager.this.new C127761(htJ).invokeSuspend(Unit.INSTANCE);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                HatchUnreadThreadsRepository companion = HatchUnreadThreadsRepository.Companion.getInstance(HatchChatNotificationManager.this.userSession);
                this.label = 1;
                if (companion.fetchHasUnreadThreads(this) == enumC10460Hji) {
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
    }

    public final class Companion {
        public final HatchChatNotificationManager getInstance(Context context, AbstractC3358CGz abstractC3358CGz) {
            AnonymousClass003.A0u(context, abstractC3358CGz);
            return (HatchChatNotificationManager) abstractC3358CGz.A03(HatchChatNotificationManager.class, new HatchChatNotificationManager$Companion$getInstance$1(context, abstractC3358CGz));
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    private final boolean isStaticResponseRedactionEnabled() {
        return C31u.A01(this, this.isStaticResponseRedactionEnabled$delegate, $$delegatedProperties, 0);
    }

    private final void logDrop(String str, String str2) {
        HatchNotificationEventsLogger.INSTANCE.logDrop(HatchNotificationChannel.IN_APP_BANNER, "hatch_bot_message", HatchNotificationOrigin.LOCAL, null, str2, str);
    }

    private final void maybePostNotification(String str, String str2, String str3) {
        String strStripMarkdown;
        String strA03;
        String string;
        StringBuilder sbA0x;
        String str4;
        HatchNotificationChannel hatchNotificationChannel = HatchNotificationChannel.IN_APP_BANNER;
        String strA0M = str != null ? FGI.A0M("mid-", str) : null;
        String str5 = str3 == null ? "main" : str3;
        Integer numValueOf = Integer.valueOf(str2 != null ? str2.length() : 0);
        AuraAppLifecycleManager auraAppLifecycleManager = AuraAppLifecycleManager.INSTANCE;
        CFK.A00(str, str3, numValueOf, Boolean.valueOf(auraAppLifecycleManager.isAppInForeground()), HatchChatNotificationManagerKt.TAG, "maybePostNotification: messageId=%s threadId=%s contentLen=%d isForeground=%s");
        if (!auraAppLifecycleManager.isAppInForeground() && !HatchBackgroundSession.INSTANCE.isActive()) {
            CFK.A02(str, strA0M, HatchChatNotificationManagerKt.TAG, "Skipping local notif: app is backgrounded, deferring to server push. messageId=%s inappNotifId=%s");
            str4 = "app_backgrounded_defer_to_push";
        } else if (HatchNotificationSuppression.voiceCallActive) {
            CFK.A02(str, strA0M, HatchChatNotificationManagerKt.TAG, "Skipping local notif: voice call active. messageId=%s inappNotifId=%s");
            str4 = HatchThreadsRepositoryKt.VOICE_CALL_ACTIVE_ERROR_CODE;
        } else {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            long jA01 = jElapsedRealtime - C60P.A01(this.lastNotificationTimeByThread.get(str5));
            if (jA01 >= 5000) {
                recordNotificationTime(str5, jElapsedRealtime);
                if (str2 == null || (strStripMarkdown = HatchStringUtils.INSTANCE.stripMarkdown(str2)) == null || (strA03 = C6tn.A03(strStripMarkdown)) == null) {
                    return;
                }
                if (str3 != null) {
                    AnonymousClass001.A1J(new C127761(null), this.scope);
                }
                HatchNotificationEventsLogger hatchNotificationEventsLogger = HatchNotificationEventsLogger.INSTANCE;
                HatchNotificationOrigin hatchNotificationOrigin = HatchNotificationOrigin.LOCAL;
                hatchNotificationEventsLogger.logReceived(hatchNotificationChannel, "hatch_bot_message", hatchNotificationOrigin, null, strA0M);
                String selectedAssistantName = JarvisUtils.INSTANCE.getSelectedAssistantName(this.userSession);
                String strEncode = str != null ? Uri.encode(str) : null;
                if (str3 != null) {
                    String strEncode2 = Uri.encode(str3);
                    sbA0x = C60O.A0x("hatch://thread/");
                    if (strEncode == null) {
                        sbA0x.append(strEncode2);
                        string = sbA0x.toString();
                        AuraPushNotificationRenderer.INSTANCE.render(this.appContext, new AuraPushNotificationData("chat", System.currentTimeMillis(), selectedAssistantName, null, strA03, null, C3cH.A0m(HatchChatNotificationIds.PARAM_THREAD_KEY, str5, C3cG.A0r(HatchChatNotificationIds.PARAM_PUSH_NOTIF_ID, AuraNotificationChannels.CHAT_NOTIF_ID), C3cG.A0r("path", string)), false, null, null, "hatch_bot_message", strA0M, Integer.valueOf(HatchChatLocalNotificationConfig.Companion.getInstance(this.userSession).incrementUnreadMessageCount()), null), hatchNotificationChannel, hatchNotificationOrigin, this.userSession, false, null);
                        return;
                    }
                    sbA0x.append(strEncode2);
                    sbA0x.append(CustomConnectorRegisterRepositoryKt.ROOT_PATH);
                } else {
                    if (strEncode == null) {
                        string = "hatch://chat";
                        AuraPushNotificationRenderer.INSTANCE.render(this.appContext, new AuraPushNotificationData("chat", System.currentTimeMillis(), selectedAssistantName, null, strA03, null, C3cH.A0m(HatchChatNotificationIds.PARAM_THREAD_KEY, str5, C3cG.A0r(HatchChatNotificationIds.PARAM_PUSH_NOTIF_ID, AuraNotificationChannels.CHAT_NOTIF_ID), C3cG.A0r("path", string)), false, null, null, "hatch_bot_message", strA0M, Integer.valueOf(HatchChatLocalNotificationConfig.Companion.getInstance(this.userSession).incrementUnreadMessageCount()), null), hatchNotificationChannel, hatchNotificationOrigin, this.userSession, false, null);
                        return;
                    }
                    sbA0x = C60O.A0x("hatch://chat?message_id=");
                }
                sbA0x.append(strEncode);
                string = sbA0x.toString();
                AuraPushNotificationRenderer.INSTANCE.render(this.appContext, new AuraPushNotificationData("chat", System.currentTimeMillis(), selectedAssistantName, null, strA03, null, C3cH.A0m(HatchChatNotificationIds.PARAM_THREAD_KEY, str5, C3cG.A0r(HatchChatNotificationIds.PARAM_PUSH_NOTIF_ID, AuraNotificationChannels.CHAT_NOTIF_ID), C3cG.A0r("path", string)), false, null, null, "hatch_bot_message", strA0M, Integer.valueOf(HatchChatLocalNotificationConfig.Companion.getInstance(this.userSession).incrementUnreadMessageCount()), null), hatchNotificationChannel, hatchNotificationOrigin, this.userSession, false, null);
                return;
            }
            CFK.A00(str, strA0M, Long.valueOf(jA01), 5000L, HatchChatNotificationManagerKt.TAG, "Skipping local notif: rate_limited. messageId=%s inappNotifId=%s sinceLastMs=%d windowMs=%d");
            str4 = AgeVerificationClientKt.RATE_LIMITED;
        }
        logDrop(str4, strA0M);
    }

    private final void recordNotificationTime(String str, long j) {
        this.lastNotificationTimeByThread.put(str, Long.valueOf(j));
        trimOldest(this.lastNotificationTimeByThread, 256);
    }

    private final boolean recordProcessedEventKey(String str) {
        boolean zA1Y = AnonymousClass002.A1Y(this.processedNotificationEventKeys.putIfAbsent(str, C3cI.A0O()));
        trimOldest(this.processedNotificationEventKeys, 512);
        return zA1Y;
    }

    private final boolean shouldMuteForIncompleteOnboarding(NotificationEvent notificationEvent) {
        if (OnboardingStartupGate.Companion.getInstance(this.userSession).hasCompletedOnboarding()) {
            return false;
        }
        String str = notificationEvent.messageId;
        String strA0M = str != null ? FGI.A0M("mid-", str) : null;
        CFK.A02(str, strA0M, HatchChatNotificationManagerKt.TAG, "Skipping local notif: onboarding not completed. messageId=%s inappNotifId=%s");
        logDrop("onboarding_not_completed", strA0M);
        return true;
    }

    private final NotificationEvent toNotificationEvent(HatchChatEvent hatchChatEvent, String str) {
        String strCollectTextFromBlocks;
        HatchTranscriptMessage hatchTranscriptMessage;
        List<HatchContentBlock> list;
        String str2 = null;
        if (!(hatchChatEvent instanceof HatchChatEvent.MessageDone)) {
            if (!(hatchChatEvent instanceof HatchChatEvent.MessageAssistant)) {
                return null;
            }
            HatchChatEvent.MessageAssistant messageAssistant = (HatchChatEvent.MessageAssistant) hatchChatEvent;
            String str3 = messageAssistant.message.id;
            if (C7BY.A0j(str3)) {
                str3 = messageAssistant.envelope.messageId;
            }
            String strNotificationEventKey = HatchChatNotificationManagerKt.notificationEventKey(hatchChatEvent, str3, messageAssistant.envelope);
            HatchMessage hatchMessage = messageAssistant.message;
            return new NotificationEvent(strNotificationEventKey, hatchMessage.id, hatchMessage.content, str);
        }
        HatchChatEvent.MessageDone messageDone = (HatchChatEvent.MessageDone) hatchChatEvent;
        if (!"completed".equals(messageDone.status)) {
            return null;
        }
        Object objSafetyStaticOverride = (HatchSafetyStaticOverrideKt.STATIC_RESPONSE_OVERRIDE.equals(messageDone.overrideSource) && isStaticResponseRedactionEnabled()) ? HatchSafetyStaticOverrideKt.safetyStaticOverride(messageDone.overrideSource, messageDone.transcriptJson, messageDone.messageId) : SafetyStaticOverride.None.INSTANCE;
        if (objSafetyStaticOverride instanceof SafetyStaticOverride.Refusal) {
            strCollectTextFromBlocks = ((SafetyStaticOverride.Refusal) objSafetyStaticOverride).text;
        } else {
            if (!(objSafetyStaticOverride instanceof SafetyStaticOverride.Invalid) && !(objSafetyStaticOverride instanceof SafetyStaticOverride.None)) {
                throw C3cG.A0q();
            }
            strCollectTextFromBlocks = messageDone.summary;
            if (strCollectTextFromBlocks == null) {
                strCollectTextFromBlocks = "";
            }
            if (C7BY.A0j(strCollectTextFromBlocks)) {
                JsonElement jsonElement = messageDone.transcriptJson;
                if (jsonElement == null) {
                    return null;
                }
                HatchDeltaTranscript hatchDeltaTranscriptFromJson = HatchDeltaTranscript.Companion.fromJson(jsonElement);
                if (hatchDeltaTranscriptFromJson == null) {
                    CFK.A04(HatchChatNotificationManagerKt.TAG, "notification transcript parse failed");
                    return null;
                }
                List<HatchTranscriptMessage> list2 = hatchDeltaTranscriptFromJson.messages;
                if (list2 == null || (hatchTranscriptMessage = (HatchTranscriptMessage) AbstractC0878AGe.A0I(list2)) == null || (list = hatchTranscriptMessage.content) == null) {
                    return null;
                }
                strCollectTextFromBlocks = HatchTranscriptKt.collectTextFromBlocks(list);
                if (C7BY.A0j(strCollectTextFromBlocks)) {
                    return null;
                }
            }
        }
        if (strCollectTextFromBlocks == null || strCollectTextFromBlocks.length() == 0) {
            return null;
        }
        String str4 = messageDone.messageId;
        if (str4 != null) {
            str2 = str4;
        } else {
            CanonicalEventEnvelope canonicalEventEnvelope = messageDone.envelope;
            if (canonicalEventEnvelope != null) {
                str4 = canonicalEventEnvelope.messageId;
                str2 = str4;
            }
        }
        return new NotificationEvent(HatchChatNotificationManagerKt.notificationEventKey(hatchChatEvent, str2, messageDone.envelope), messageDone.messageId, strCollectTextFromBlocks, str);
    }

    @Override // X.InterfaceC7549F2g
    public void clearUserData() {
        Hxb.A03(null, this.scope);
        this.processedNotificationEventKeys.clear();
        this.lastNotificationTimeByThread.clear();
        new C7380Etd(this.appContext).A00.cancelAll();
    }

    public final void initialize() {
        try {
            AnonymousClass001.A1J(new AnonymousClass1(null), this.scope);
        } catch (Exception e) {
            CFK.A04(HatchChatNotificationManagerKt.TAG, FGI.A0M("Failed to initialize HatchChatNotificationManager: ", e.getMessage()));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleEvent(HatchChatEvent hatchChatEvent) {
        CanonicalEventEnvelope envelope = hatchChatEvent.getEnvelope();
        NotificationEvent notificationEvent = toNotificationEvent(hatchChatEvent, (envelope == null || !envelope.isThread) ? null : envelope.sessionId);
        if (notificationEvent == null || !shouldMuteForIncompleteOnboarding(notificationEvent)) {
            if (notificationEvent != null && !recordProcessedEventKey(notificationEvent.key)) {
                CFK.A01(C60O.A0n(hatchChatEvent), notificationEvent.key, notificationEvent.messageId, HatchChatNotificationManagerKt.TAG, "Skipping local notif: duplicate gateway event. event=%s key=%s messageId=%s");
                return;
            }
            if ((envelope == null || !HatchChatLocalNotificationConfig.Companion.isEventForActiveScreen(envelope.sessionId, envelope.isThread)) && notificationEvent != null) {
                if (!(hatchChatEvent instanceof HatchChatEvent.MessageDone) || envelope == null || envelope.voiceCallId == null) {
                    maybePostNotification(notificationEvent.messageId, notificationEvent.content, notificationEvent.threadId);
                    return;
                }
                String str = notificationEvent.messageId;
                String strA0M = str != null ? FGI.A0M("mid-", str) : null;
                CFK.A02(str, strA0M, HatchChatNotificationManagerKt.TAG, "Skipping local notif: spoken in a voice call. messageId=%s inappNotifId=%s");
                logDrop("spoken_in_voice_call", strA0M);
            }
        }
    }

    private final void trimOldest(ConcurrentHashMap<String, Long> concurrentHashMap, int i) {
        int size = concurrentHashMap.size() - i;
        if (size > 0) {
            Set<Map.Entry<String, Long>> setEntrySet = concurrentHashMap.entrySet();
            C7384Etj.A0U(setEntrySet);
            Iterator it = AbstractC0878AGe.A0a(AbstractC0878AGe.A0c(setEntrySet, new Comparator() { // from class: com.facebook.aura.notification.model.HatchChatNotificationManager$trimOldest$$inlined$sortedBy$1
                @Override // java.util.Comparator
                public final int compare(T t, T t2) {
                    return AbstractC7536F0j.A00((Long) ((Map.Entry) t).getValue(), (Long) ((Map.Entry) t2).getValue());
                }
            }), size).iterator();
            while (it.hasNext()) {
                Map.Entry entryA0l = C3cH.A0l(it);
                concurrentHashMap.remove(entryA0l.getKey(), entryA0l.getValue());
            }
        }
    }

    public /* synthetic */ HatchChatNotificationManager(Context context, AbstractC3358CGz abstractC3358CGz, C06H c06h) {
        this(context, abstractC3358CGz);
    }

    public HatchChatNotificationManager(Context context, AbstractC3358CGz abstractC3358CGz) {
        this.appContext = context;
        this.userSession = abstractC3358CGz;
        this.scope = C78W.A04(new Hy1(AuraExecutors.INSTANCE.getBackgroundThreadExecutor()));
        this.gateway = C60O.A05(abstractC3358CGz);
        this.processedNotificationEventKeys = C60O.A1C();
        this.lastNotificationTimeByThread = C60O.A1C();
        this.isStaticResponseRedactionEnabled$delegate = AuraMobileConfigDelegatesKt.auraMobileConfigBoolean(MC.hatch_android.enable_static_response_redaction);
    }
}
