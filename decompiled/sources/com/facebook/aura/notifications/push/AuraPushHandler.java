package com.facebook.aura.notifications.push;

import X.AbstractC07127nr;
import X.AbstractC3358CGz;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass004;
import X.AnonymousClass006;
import X.C06H;
import X.C3UX;
import X.C3cG;
import X.C3cH;
import X.C60O;
import X.C7384Etj;
import X.C78T;
import X.C7BY;
import X.CFK;
import X.CH0;
import X.EnumC10460Hji;
import X.G0V;
import X.HtJ;
import X.Hwg;
import X.HzP;
import X.InterfaceC3965CiA;
import android.content.Context;
import com.facebook.aura.analytics.hatch.HatchNotificationChannel;
import com.facebook.aura.analytics.hatch.HatchNotificationEventsLogger;
import com.facebook.aura.analytics.hatch.HatchNotificationOrigin;
import com.facebook.aura.analytics.hatch.HatchOsNotificationSettingEventType;
import com.facebook.aura.analytics.hatch.HatchOsNotificationSettingLogger;
import com.facebook.aura.auth.store.AuraUserSessionStore;
import com.facebook.aura.browsertask.conversation.BrowserSignInPushPresenter;
import com.facebook.aura.confidentialvm.session.ConfidentialSessionGate;
import com.facebook.aura.gateway.store.HatchGatewayPrefsStore;
import com.facebook.aura.json.JsonObjectExtensionsKt;
import com.facebook.aura.notifications.push.AuraCvmPushEnvelopeParseResult;
import com.facebook.aura.notifications.push.api.PushPresentation;
import com.facebook.aura.sharesheet.HatchIdeaShareImageRenderer;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class AuraPushHandler implements InterfaceC3965CiA {
    public static final Companion Companion = new Companion();
    public static final C3UX scope = C78T.A01(AnonymousClass001.A0y(), null);
    public final Context appContext;

    @DebugMetadata(c = "com.facebook.aura.notifications.push.AuraPushHandler$onPushReceived$1", f = "AuraPushHandler.kt", l = {HatchIdeaShareImageRenderer.TEXT_LEFT}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.notifications.push.AuraPushHandler$onPushReceived$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ String $currentVmId;
        public final /* synthetic */ AuraPushNotificationData $data;
        public final /* synthetic */ AuraCvmPushEnvelopeParseResult $envelope;
        public final /* synthetic */ AbstractC3358CGz $userSession;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(AuraPushNotificationData auraPushNotificationData, AuraCvmPushEnvelopeParseResult auraCvmPushEnvelopeParseResult, AbstractC3358CGz abstractC3358CGz, String str, HtJ<? super AnonymousClass1> htJ) {
            super(2, htJ);
            this.$data = auraPushNotificationData;
            this.$envelope = auraCvmPushEnvelopeParseResult;
            this.$userSession = abstractC3358CGz;
            this.$currentVmId = str;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return AuraPushHandler.this.new AnonymousClass1(this.$data, this.$envelope, this.$userSession, this.$currentVmId, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                AuraPushHandler auraPushHandler = AuraPushHandler.this;
                AuraPushNotificationData auraPushNotificationData = this.$data;
                AuraCvmPushEnvelope auraCvmPushEnvelope = ((AuraCvmPushEnvelopeParseResult.Present) this.$envelope).envelope;
                AbstractC3358CGz abstractC3358CGz = this.$userSession;
                String str = this.$currentVmId;
                this.label = 1;
                if (auraPushHandler.processEncryptedPush(auraPushNotificationData, auraCvmPushEnvelope, abstractC3358CGz, str, this) == enumC10460Hji) {
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

    @DebugMetadata(c = "com.facebook.aura.notifications.push.AuraPushHandler", f = "AuraPushHandler.kt", l = {113}, m = "processEncryptedPush", v = 2)
    /* renamed from: com.facebook.aura.notifications.push.AuraPushHandler$processEncryptedPush$1, reason: invalid class name and case insensitive filesystem */
    public final class C127771 extends HzP {
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public Object L$4;
        public Object L$5;
        public Object L$6;
        public int label;
        public /* synthetic */ Object result;

        public C127771(HtJ<? super C127771> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AuraPushHandler.this.processEncryptedPush(null, null, null, null, this);
        }
    }

    private final PushPresentation presentation(AuraPushNotificationData auraPushNotificationData) {
        String str;
        Map<String, String> map;
        int i = new int[]{0}[0];
        try {
            str = auraPushNotificationData.notificationType;
            map = auraPushNotificationData.params;
        } catch (Exception e) {
            CFK.A0D(AuraPushHandlerKt.TAG, "push presenter %s threw", e, Integer.valueOf(i));
        }
        if (i != 0) {
            throw C60O.A0i(String.format("No implementation bound to key: %s", Integer.valueOf(i)));
        }
        PushPresentation pushPresentationPresent = BrowserSignInPushPresenter.INSTANCE.present(str, map);
        C7384Etj.A0X(pushPresentationPresent);
        if (!pushPresentationPresent.equals(PushPresentation.Default.INSTANCE)) {
            return pushPresentationPresent;
        }
        return PushPresentation.Default.INSTANCE;
    }

    public /* synthetic */ AuraPushHandler(Context context, int i, C06H c06h) {
        this((i & 1) != 0 ? null : context);
    }

    private final String currentVmId(AbstractC3358CGz abstractC3358CGz) {
        String strA0a = C3cH.A0a(HatchGatewayPrefsStore.Companion, abstractC3358CGz);
        if (strA0a == null || C7BY.A0j(strA0a)) {
            return null;
        }
        return strA0a;
    }

    private final boolean isAddressedToSomeoneElse(AuraPushNotificationData auraPushNotificationData, AbstractC3358CGz abstractC3358CGz) {
        Long l;
        if (auraPushNotificationData.isLoggedOutPush || (l = auraPushNotificationData.targetUid) == null) {
            return false;
        }
        long jLongValue = l.longValue();
        if (abstractC3358CGz != null) {
            return !((CH0) abstractC3358CGz).A01.equals(String.valueOf(jLongValue));
        }
        return false;
    }

    private final boolean isFromDifferentVm(AuraPushNotificationData auraPushNotificationData, String str) {
        String str2 = auraPushNotificationData.vmId;
        return (str2 == null || C7BY.A0j(str2) || str == null || str2.equals(str)) ? false : true;
    }

    private final void logDrop(String str, AuraPushNotificationData auraPushNotificationData, String str2, boolean z) {
        if (z) {
            logEncryptedDrop(str);
        } else {
            logPushDrop(str, auraPushNotificationData, str2);
            HatchNotificationEventsLogger.INSTANCE.logDrop(HatchNotificationChannel.PUSH, auraPushNotificationData.notificationType, HatchNotificationOrigin.SERVER, auraPushNotificationData.ndid, null, str);
        }
    }

    private final void logEncryptedDrop(String str) {
        CFK.A03(str, AuraPushHandlerKt.TAG, "Encrypted CVM push dropped: reason=%s");
        HatchNotificationEventsLogger.INSTANCE.logDrop(HatchNotificationChannel.PUSH, "hatch_bot_message", HatchNotificationOrigin.SERVER, null, null, str);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x000f A[PHI: r2
  0x000f: PHI (r2v6 java.lang.String) = (r2v0 java.lang.String), (r2v7 java.lang.String), (r2v8 java.lang.String) binds: [B:9:0x000d, B:5:0x0006, B:7:0x000a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0013 A[PHI: r2
  0x0013: PHI (r2v5 java.lang.String) = (r2v0 java.lang.String), (r2v6 java.lang.String) binds: [B:9:0x000d, B:11:0x0011] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0016 A[PHI: r1 r2
  0x0016: PHI (r1v0 java.lang.String) = (r1v4 java.lang.String), (r1v5 java.lang.String) binds: [B:13:0x0014, B:11:0x0011] A[DONT_GENERATE, DONT_INLINE]
  0x0016: PHI (r2v1 java.lang.String) = (r2v5 java.lang.String), (r2v6 java.lang.String) binds: [B:13:0x0014, B:11:0x0011] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x001a A[PHI: r1 r2
  0x001a: PHI (r1v3 java.lang.String) = (r1v0 java.lang.String), (r1v4 java.lang.String) binds: [B:15:0x0018, B:13:0x0014] A[DONT_GENERATE, DONT_INLINE]
  0x001a: PHI (r2v4 java.lang.String) = (r2v1 java.lang.String), (r2v5 java.lang.String) binds: [B:15:0x0018, B:13:0x0014] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void logPushDrop(java.lang.String r4, com.facebook.aura.notifications.push.AuraPushNotificationData r5, java.lang.String r6) {
        /*
            r3 = this;
            java.lang.String r3 = "<missing>"
            if (r5 == 0) goto Lc
            java.lang.String r2 = r5.notificationType
            if (r2 != 0) goto Lf
            java.lang.String r2 = r5.type
            if (r2 != 0) goto Lf
        Lc:
            r2 = r3
            if (r5 == 0) goto L13
        Lf:
            java.lang.String r1 = r5.ndid
            if (r1 != 0) goto L16
        L13:
            r1 = r3
            if (r5 == 0) goto L1a
        L16:
            java.lang.String r0 = r5.vmId
            if (r0 != 0) goto L1b
        L1a:
            r0 = r3
        L1b:
            if (r6 != 0) goto L1e
            r6 = r3
        L1e:
            java.lang.Object[] r2 = new java.lang.Object[]{r4, r2, r1, r0, r6}
            java.lang.String r1 = "AuraPushHandler"
            java.lang.String r0 = "Push notification dropped: reason=%s type=%s ndid=%s notifVmId=%s currentVmId=%s"
            X.CFK.A0G(r1, r0, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.notifications.push.AuraPushHandler.logPushDrop(java.lang.String, com.facebook.aura.notifications.push.AuraPushNotificationData, java.lang.String):void");
    }

    private final void logReceived(AuraPushNotificationData auraPushNotificationData, boolean z) {
        HatchNotificationEventsLogger hatchNotificationEventsLogger = HatchNotificationEventsLogger.INSTANCE;
        HatchNotificationChannel hatchNotificationChannel = HatchNotificationChannel.PUSH;
        String str = auraPushNotificationData.notificationType;
        HatchNotificationOrigin hatchNotificationOrigin = HatchNotificationOrigin.SERVER;
        String str2 = auraPushNotificationData.ndid;
        if (z) {
            str2 = null;
        }
        hatchNotificationEventsLogger.logReceived(hatchNotificationChannel, str, hatchNotificationOrigin, str2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:11:0x003f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object processEncryptedPush(com.facebook.aura.notifications.push.AuraPushNotificationData r17, com.facebook.aura.notifications.push.AuraCvmPushEnvelope r18, X.AbstractC3358CGz r19, java.lang.String r20, X.HtJ<? super kotlin.Unit> r21) {
        /*
            Method dump skipped, instructions count: 416
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.notifications.push.AuraPushHandler.processEncryptedPush(com.facebook.aura.notifications.push.AuraPushNotificationData, com.facebook.aura.notifications.push.AuraCvmPushEnvelope, X.CGz, java.lang.String, X.HtJ):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:66:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void processPush(com.facebook.aura.notifications.push.AuraPushNotificationData r29, X.AbstractC3358CGz r30, java.lang.String r31, boolean r32, boolean r33) {
        /*
            Method dump skipped, instructions count: 281
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.notifications.push.AuraPushHandler.processPush(com.facebook.aura.notifications.push.AuraPushNotificationData, X.CGz, java.lang.String, boolean, boolean):void");
    }

    private final boolean requiresAuthenticatedPush(AbstractC3358CGz abstractC3358CGz) {
        return (abstractC3358CGz == null || ConfidentialSessionGate.Companion.getInstance(abstractC3358CGz).isStandardVm()) ? false : true;
    }

    private final AuraPushNotificationData toLocalAlert(AuraPushNotificationData auraPushNotificationData) {
        Map<String, String> map = auraPushNotificationData.params;
        LinkedHashMap linkedHashMapA0j = C3cG.A0j();
        Iterator itA0n = AnonymousClass002.A0n(map);
        while (itA0n.hasNext()) {
            Map.Entry entryA0l = C3cH.A0l(itA0n);
            if ("path".equals(entryA0l.getKey())) {
                AnonymousClass006.A1R(linkedHashMapA0j, entryA0l);
            }
        }
        return AuraPushNotificationData.copy$default(auraPushNotificationData, null, 0L, null, null, null, null, linkedHashMapA0j, false, null, null, null, null, null, null, 11683, null);
    }

    public final class Companion {
        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    @Override // X.InterfaceC3965CiA
    public void onPushReceived(String str, JSONObject jSONObject) {
        String str2;
        boolean zA1b = AnonymousClass004.A1b(str, jSONObject);
        jSONObject.optInt("unread_count", -1);
        AuraUserSessionStore auraUserSessionStore = AuraUserSessionStore.INSTANCE;
        if (auraUserSessionStore.isCurrentUserAuthenticated()) {
            HatchOsNotificationSettingLogger.INSTANCE.logSnapshot(HatchOsNotificationSettingEventType.PUSH_RECEIVED_SNAPSHOT);
        }
        AbstractC3358CGz currentUserSession = auraUserSessionStore.getCurrentUserSession();
        String strCurrentVmId = currentUserSession != null ? currentVmId(currentUserSession) : null;
        AuraPushNotificationData auraPushNotificationDataFromJson = AuraPushNotificationData.Companion.fromJson(JsonObjectExtensionsKt.toJsonObject(jSONObject));
        if (auraPushNotificationDataFromJson == null) {
            logPushDrop("parse_failed", null, strCurrentVmId);
            HatchNotificationEventsLogger.INSTANCE.logDrop(HatchNotificationChannel.PUSH, null, HatchNotificationOrigin.SERVER, null, null, "parse_failed");
            return;
        }
        AuraCvmPushEnvelopeParseResult auraCvmPushEnvelopeParseResult = AuraCvmPushEnvelope.Companion.parse(auraPushNotificationDataFromJson.params);
        if (C7384Etj.areEqual(auraCvmPushEnvelopeParseResult, AuraCvmPushEnvelopeParseResult.Absent.INSTANCE)) {
            processPush(auraPushNotificationDataFromJson, currentUserSession, strCurrentVmId, zA1b, requiresAuthenticatedPush(currentUserSession));
            return;
        }
        if (C7384Etj.areEqual(auraCvmPushEnvelopeParseResult, AuraCvmPushEnvelopeParseResult.Malformed.INSTANCE)) {
            str2 = "malformed_envelope";
        } else {
            if (!(auraCvmPushEnvelopeParseResult instanceof AuraCvmPushEnvelopeParseResult.Present)) {
                throw C3cG.A0q();
            }
            if (currentUserSession != null) {
                AnonymousClass001.A1J(new AnonymousClass1(auraPushNotificationDataFromJson, auraCvmPushEnvelopeParseResult, currentUserSession, strCurrentVmId, null), scope);
                return;
            }
            str2 = "no_session";
        }
        logEncryptedDrop(str2);
    }

    public AuraPushHandler(Context context) {
        this.appContext = context;
    }

    public AuraPushHandler() {
        this(null);
    }
}
