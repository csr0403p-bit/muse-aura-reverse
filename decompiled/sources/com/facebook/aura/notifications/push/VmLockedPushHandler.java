package com.facebook.aura.notifications.push;

import X.AbstractC07127nr;
import X.AbstractC3358CGz;
import X.AnonymousClass001;
import X.AnonymousClass003;
import X.C06H;
import X.C31u;
import X.C3UX;
import X.C7384Etj;
import X.C78T;
import X.CFK;
import X.G0V;
import X.HtJ;
import X.InterfaceC3965CiA;
import X.InterfaceC7359EnW;
import android.content.Context;
import com.facebook.aura.analytics.hatch.HatchNotificationChannel;
import com.facebook.aura.analytics.hatch.HatchNotificationEventsLogger;
import com.facebook.aura.analytics.hatch.HatchNotificationOrigin;
import com.facebook.aura.auth.AuraSessionManager;
import com.facebook.aura.json.JsonObjectExtensionsKt;
import com.facebook.aura.mobileconfig.AuraMobileConfigDelegatesKt;
import com.facebook.aura.notifications.push.MC;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.json.JSONObject;
import org.maplibre.android.R;

/* loaded from: classes3.dex */
public final class VmLockedPushHandler implements InterfaceC3965CiA {
    public static final String NOTIFICATION_TYPE = "hatch_node_vm_locked";
    public static final String VISIBLE_NOTIFICATION_TYPE = "hatch_node_vm_locked_visible";
    public final Context appContext;
    public static final Companion Companion = new Companion();
    public static final C31u<Object, Boolean> isEnabled$delegate = AuraMobileConfigDelegatesKt.auraMobileConfigBoolean(MC.hatch_android.vm_locked_push_enabled);
    public static final C3UX scope = C78T.A01(AnonymousClass001.A0y(), null);

    public final class Companion {
        public static final /* synthetic */ InterfaceC7359EnW<Object>[] $$delegatedProperties = AnonymousClass003.A1b(Companion.class, "isEnabled", "isEnabled()Z");

        public final void onVisiblePushReceived(AuraPushNotificationData auraPushNotificationData) {
            C7384Etj.A0Y(auraPushNotificationData, 0);
            AnonymousClass001.A1J(new VmLockedPushHandler$Companion$onVisiblePushReceived$1(auraPushNotificationData, null), VmLockedPushHandler.scope);
        }

        private final boolean isEnabled() {
            return C31u.A01(this, VmLockedPushHandler.isEnabled$delegate, $$delegatedProperties, 0);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean isLiveSession(AbstractC3358CGz abstractC3358CGz) {
            return AuraSessionManager.INSTANCE.isCurrentSession(abstractC3358CGz) || C7384Etj.areEqual(AuraSessionManager.state.getValue(), AuraSessionManager.SessionState.Initializing.INSTANCE);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Removed duplicated region for block: B:21:0x0060  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object redirect(X.AbstractC3358CGz r11, java.lang.String r12, java.util.Map<java.lang.String, java.lang.String> r13, X.HtJ<? super com.facebook.aura.notifications.push.api.VmLockedPushOutcome> r14) {
            /*
                r10 = this;
                boolean r0 = r14 instanceof com.facebook.aura.notifications.push.VmLockedPushHandler$Companion$redirect$1
                if (r0 == 0) goto L60
                r4 = r14
                com.facebook.aura.notifications.push.VmLockedPushHandler$Companion$redirect$1 r4 = (com.facebook.aura.notifications.push.VmLockedPushHandler$Companion$redirect$1) r4
                int r2 = r4.label
                r1 = -2147483648(0xffffffff80000000, float:-0.0)
                r0 = r2 & r1
                if (r0 == 0) goto L60
                int r2 = r2 - r1
                r4.label = r2
            L12:
                java.lang.Object r3 = r4.result
                X.Hji r2 = X.EnumC10460Hji.A02
                int r0 = r4.label
                r1 = 1
                if (r0 == 0) goto L3b
                if (r0 != r1) goto L6f
                X.Hwg.A00(r3)
            L20:
                java.util.List r3 = (java.util.List) r3
                java.util.Iterator r2 = r3.iterator()
            L26:
                boolean r0 = r2.hasNext()
                if (r0 == 0) goto L66
                java.lang.Object r1 = r2.next()
                com.facebook.aura.notifications.push.api.VmLockedPushOutcome$Accepted r0 = com.facebook.aura.notifications.push.api.VmLockedPushOutcome.Accepted.INSTANCE
                boolean r0 = X.C7384Etj.areEqual(r1, r0)
                if (r0 == 0) goto L26
                if (r1 == 0) goto L66
                return r1
            L3b:
                X.Hwg.A00(r3)
                int[] r7 = X.AnonymousClass005.A1b()
                X.78T r0 = X.C3cG.A0v()
                r10 = 0
                com.facebook.aura.notifications.push.VmLockedPushHandler$Companion$redirect$outcomes$1 r5 = new com.facebook.aura.notifications.push.VmLockedPushHandler$Companion$redirect$outcomes$1
                r6 = r11
                r8 = r12
                r9 = r13
                r5.<init>(r6, r7, r8, r9, r10)
                r4.L$0 = r10
                r4.L$1 = r10
                r4.L$2 = r10
                r4.L$3 = r10
                r4.label = r1
                java.lang.Object r3 = X.GAo.A00(r4, r0, r5)
                if (r3 != r2) goto L20
                return r2
            L60:
                com.facebook.aura.notifications.push.VmLockedPushHandler$Companion$redirect$1 r4 = new com.facebook.aura.notifications.push.VmLockedPushHandler$Companion$redirect$1
                r4.<init>(r10, r14)
                goto L12
            L66:
                java.lang.Object r0 = X.AbstractC0878AGe.A0G(r3)
                if (r0 != 0) goto L6e
                com.facebook.aura.notifications.push.api.VmLockedPushOutcome$NotHandled r0 = com.facebook.aura.notifications.push.api.VmLockedPushOutcome.NotHandled.INSTANCE
            L6e:
                return r0
            L6f:
                java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.notifications.push.VmLockedPushHandler.Companion.redirect(X.CGz, java.lang.String, java.util.Map, X.HtJ):java.lang.Object");
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Removed duplicated region for block: B:12:0x0033  */
        /* JADX WARN: Removed duplicated region for block: B:53:0x00e1 A[Catch: Exception -> 0x010d, CancellationException -> 0x0116, TryCatch #2 {CancellationException -> 0x0116, Exception -> 0x010d, blocks: (B:50:0x00d4, B:51:0x00d7, B:53:0x00e1, B:55:0x00e5, B:57:0x00ea, B:59:0x00f2, B:61:0x00f8, B:63:0x0107, B:64:0x010b, B:29:0x007e, B:30:0x0081, B:32:0x0087, B:33:0x008c, B:35:0x0098, B:39:0x00a7, B:43:0x00b6, B:47:0x00bf, B:26:0x0067), top: B:73:0x001f }] */
        /* JADX WARN: Removed duplicated region for block: B:74:? A[RETURN, SYNTHETIC] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object refreshVmAccessOrDropReason(java.lang.String r12, java.util.Map<java.lang.String, java.lang.String> r13, java.lang.String r14, X.HtJ<? super java.lang.String> r15) {
            /*
                Method dump skipped, instructions count: 283
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.notifications.push.VmLockedPushHandler.Companion.refreshVmAccessOrDropReason(java.lang.String, java.util.Map, java.lang.String, X.HtJ):java.lang.Object");
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    @DebugMetadata(c = "com.facebook.aura.notifications.push.VmLockedPushHandler$onPushReceived$1", f = "VmLockedPushHandler.kt", l = {R.styleable.maplibre_MapView_maplibre_uiLogoGravity}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.notifications.push.VmLockedPushHandler$onPushReceived$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ AuraPushNotificationData $data;
        public final /* synthetic */ String $ndid;
        public int label;
        public final /* synthetic */ VmLockedPushHandler this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(AuraPushNotificationData auraPushNotificationData, String str, VmLockedPushHandler vmLockedPushHandler, HtJ<? super AnonymousClass1> htJ) {
            super(2, htJ);
            this.$data = auraPushNotificationData;
            this.$ndid = str;
            this.this$0 = vmLockedPushHandler;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new AnonymousClass1(this.$data, this.$ndid, this.this$0, htJ);
        }

        /* JADX WARN: Removed duplicated region for block: B:16:0x003e A[PHI: r2
  0x003e: PHI (r2v1 java.lang.String) = (r2v0 java.lang.String), (r2v3 java.lang.String) binds: [B:13:0x0036, B:15:0x003c] A[DONT_GENERATE, DONT_INLINE]] */
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
                r4 = 1
                if (r0 == 0) goto L2e
                if (r0 != r4) goto L4d
                X.Hwg.A00(r7)
            Lc:
                java.lang.String r7 = (java.lang.String) r7
                if (r7 != 0) goto L26
                com.facebook.aura.analytics.hatch.HatchNotificationEventsLogger r0 = com.facebook.aura.analytics.hatch.HatchNotificationEventsLogger.INSTANCE
                com.facebook.aura.analytics.hatch.HatchNotificationChannel r1 = com.facebook.aura.analytics.hatch.HatchNotificationChannel.PUSH
                com.facebook.aura.analytics.hatch.HatchNotificationOrigin r3 = com.facebook.aura.analytics.hatch.HatchNotificationOrigin.SERVER
                java.lang.String r4 = r6.$ndid
                r5 = 0
                java.lang.String r2 = "hatch_node_vm_locked"
                r0.logReceived(r1, r2, r3, r4, r5)
                com.facebook.aura.analytics.hatch.HatchClientCvmEventLogger r0 = com.facebook.aura.analytics.hatch.HatchClientCvmEventLogger.INSTANCE
                r0.logCvmReplacementPushReceived()
            L23:
                kotlin.Unit r5 = kotlin.Unit.INSTANCE
                return r5
            L26:
                com.facebook.aura.notifications.push.VmLockedPushHandler r1 = r6.this$0
                java.lang.String r0 = r6.$ndid
                com.facebook.aura.notifications.push.VmLockedPushHandler.access$logDrop(r1, r0, r7)
                goto L23
            L2e:
                X.Hwg.A00(r7)
                com.facebook.aura.notifications.push.VmLockedPushHandler$Companion r3 = com.facebook.aura.notifications.push.VmLockedPushHandler.Companion
                com.facebook.aura.notifications.push.AuraPushNotificationData r0 = r6.$data
                r2 = 0
                if (r0 == 0) goto L3e
                java.lang.String r2 = r0.vmId
                java.util.Map<java.lang.String, java.lang.String> r1 = r0.params
                if (r1 != 0) goto L42
            L3e:
                X.9jH r1 = X.AGH.A0E()
            L42:
                java.lang.String r0 = r6.$ndid
                r6.label = r4
                java.lang.Object r7 = com.facebook.aura.notifications.push.VmLockedPushHandler.Companion.access$refreshVmAccessOrDropReason(r3, r2, r1, r0, r6)
                if (r7 != r5) goto Lc
                return r5
            L4d:
                java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.notifications.push.VmLockedPushHandler.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ((AnonymousClass1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    public VmLockedPushHandler(Context context) {
        C7384Etj.A0Y(context, 0);
        this.appContext = context;
    }

    @Override // X.InterfaceC3965CiA
    public void onPushReceived(String str, JSONObject jSONObject) {
        C7384Etj.A0Y(jSONObject, 1);
        AuraPushNotificationData auraPushNotificationDataFromJson = AuraPushNotificationData.Companion.fromJson(JsonObjectExtensionsKt.toJsonObject(jSONObject));
        String str2 = auraPushNotificationDataFromJson != null ? auraPushNotificationDataFromJson.ndid : null;
        CFK.A03(str2, VmLockedPushHandlerKt.TAG, "VM push received: ndid=%s");
        AnonymousClass001.A1J(new AnonymousClass1(auraPushNotificationDataFromJson, str2, this, null), scope);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void logDrop(String str, String str2) {
        CFK.A02(str2, str, VmLockedPushHandlerKt.TAG, "VM push dropped: reason=%s ndid=%s");
        HatchNotificationEventsLogger.INSTANCE.logDrop(HatchNotificationChannel.PUSH, NOTIFICATION_TYPE, HatchNotificationOrigin.SERVER, str, null, str2);
    }
}
