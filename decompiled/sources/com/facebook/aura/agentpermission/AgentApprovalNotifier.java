package com.facebook.aura.agentpermission;

import X.AnonymousClass003;
import X.C10571Hud;
import X.C3cG;
import X.C7380Etd;
import X.CFK;
import X.HtJ;
import X.HzP;
import android.app.NotificationManager;
import android.content.Context;
import android.service.notification.StatusBarNotification;
import com.facebook.aura.devices.pairing.LinkEncryptedPairingKt;
import com.facebook.aura.gateway.ApprovalAttentionMode;
import com.facebook.aura.gateway.ApprovalOrigin;
import com.facebook.aura.gateway.HatchAgentPermissionsRepository;
import com.facebook.aura.notifications.attention.AttentionNotifications;
import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* loaded from: classes2.dex */
public final class AgentApprovalNotifier {
    public static final int $stable = 0;
    public static final AgentApprovalNotifier INSTANCE = new AgentApprovalNotifier();
    public static final String TAG = "AgentApprovalNotifier";

    @DebugMetadata(c = "com.facebook.aura.agentpermission.AgentApprovalNotifier", f = "AgentApprovalNotifier.kt", l = {HatchMessageShareDocumentRenderer.TABLE_MIN_ROW_HEIGHT_PX}, m = "post", v = 2)
    /* renamed from: com.facebook.aura.agentpermission.AgentApprovalNotifier$post$1, reason: invalid class name */
    public final class AnonymousClass1 extends HzP {
        public int I$0;
        public int I$1;
        public Object L$0;
        public Object L$1;
        public Object L$10;
        public Object L$2;
        public Object L$3;
        public Object L$4;
        public Object L$5;
        public Object L$6;
        public Object L$7;
        public Object L$8;
        public Object L$9;
        public int label;
        public /* synthetic */ Object result;

        public AnonymousClass1(HtJ<? super AnonymousClass1> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AgentApprovalNotifier.this.post(null, null, null, null, null, this);
        }
    }

    public static /* synthetic */ void cancelStale$default(AgentApprovalNotifier agentApprovalNotifier, Context context, Set set, long j, int i, Object obj) {
        if ((i & 4) != 0) {
            j = LinkEncryptedPairingKt.LINK_COUNTER_MAX;
        }
        agentApprovalNotifier.cancelStale(context, set, j);
    }

    private final boolean isUrgent(HatchAgentPermissionsRepository.AgentPermissionApproval agentPermissionApproval) {
        return agentPermissionApproval.origin == ApprovalOrigin.LOCAL_HITL || agentPermissionApproval.attentionMode != ApprovalAttentionMode.BACKGROUND;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x00ac, code lost:
    
        if (r4.isShowing(r15, com.facebook.aura.notifications.attention.AttentionNotifications.APPROVAL_TAG, r1) == false) goto L12;
     */
    /* JADX WARN: Removed duplicated region for block: B:43:0x011e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object post(android.content.Context r18, com.facebook.aura.gateway.HatchAgentPermissionsRepository.AgentPermissionApproval r19, java.lang.String r20, java.lang.String r21, X.G0U<? super java.lang.String, java.lang.String> r22, X.HtJ<? super kotlin.Unit> r23) {
        /*
            Method dump skipped, instructions count: 298
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.agentpermission.AgentApprovalNotifier.post(android.content.Context, com.facebook.aura.gateway.HatchAgentPermissionsRepository$AgentPermissionApproval, java.lang.String, java.lang.String, X.G0U, X.HtJ):java.lang.Object");
    }

    public final void cancel(Context context, Collection<String> collection) {
        AnonymousClass003.A0u(context, collection);
        C7380Etd c7380Etd = new C7380Etd(context.getApplicationContext());
        Iterator<String> it = collection.iterator();
        while (it.hasNext()) {
            c7380Etd.A00.cancel(AttentionNotifications.APPROVAL_TAG, AttentionNotifications.INSTANCE.approvalNotificationId(it.next()));
        }
    }

    public final void cancelStale(Context context, Set<String> set, long j) {
        Object objA0s;
        AnonymousClass003.A0u(context, set);
        NotificationManager notificationManager = (NotificationManager) context.getApplicationContext().getSystemService(NotificationManager.class);
        if (notificationManager != null) {
            try {
                objA0s = notificationManager.getActiveNotifications();
            } catch (Throwable th) {
                objA0s = C3cG.A0s(th);
            }
            if (objA0s instanceof C10571Hud) {
                objA0s = null;
            }
            StatusBarNotification[] statusBarNotificationArr = (StatusBarNotification[]) objA0s;
            if (statusBarNotificationArr == null) {
                CFK.A06(TAG, "cancelStale: could not read active notifications");
                return;
            }
            LinkedHashSet linkedHashSetA0k = C3cG.A0k();
            AttentionNotifications attentionNotifications = AttentionNotifications.INSTANCE;
            Iterator<String> it = set.iterator();
            while (it.hasNext()) {
                linkedHashSetA0k.add(Integer.valueOf(attentionNotifications.approvalNotificationId(it.next())));
            }
            ArrayList arrayListA0h = C3cG.A0h();
            for (StatusBarNotification statusBarNotification : statusBarNotificationArr) {
                if (AttentionNotifications.APPROVAL_TAG.equals(statusBarNotification.getTag()) && statusBarNotification.getPostTime() < j) {
                    arrayListA0h.add(statusBarNotification);
                }
            }
            ArrayList<StatusBarNotification> arrayListA0h2 = C3cG.A0h();
            for (Object obj : arrayListA0h) {
                if (!linkedHashSetA0k.contains(Integer.valueOf(((StatusBarNotification) obj).getId()))) {
                    arrayListA0h2.add(obj);
                }
            }
            CFK.A01(Integer.valueOf(set.size()), Integer.valueOf(arrayListA0h.size()), Integer.valueOf(arrayListA0h2.size()), TAG, "cancelStale: pending=%d posted=%d cancelling=%d");
            for (StatusBarNotification statusBarNotification2 : arrayListA0h2) {
                notificationManager.cancel(statusBarNotification2.getTag(), statusBarNotification2.getId());
            }
        }
    }
}
