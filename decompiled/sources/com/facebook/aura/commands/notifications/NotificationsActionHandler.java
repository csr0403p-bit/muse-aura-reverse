package com.facebook.aura.commands.notifications;

import X.AbstractC07127nr;
import X.AbstractC3358CGz;
import X.AnonymousClass001;
import X.C2nw;
import X.C3UX;
import X.C3cI;
import X.C60O;
import X.C60P;
import X.C60R;
import X.C7384Etj;
import X.C7qW;
import X.CFK;
import X.FGI;
import X.G0V;
import X.GAo;
import X.HtJ;
import android.app.Notification;
import android.app.PendingIntent;
import android.app.RemoteInput;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.service.notification.StatusBarNotification;
import com.facebook.aura.deeplink.AuraDeeplinkRouteMapper;
import com.facebook.aura.feed.repo.FeedInstructionsCardStoreKt;
import com.facebook.aura.nodes.core.NodeCommandId;
import com.facebook.aura.nodes.core.NodeCommandResponse;
import com.facebook.aura.nodes.core.NodeCommandSpec;
import com.facebook.aura.nodes.core.NodeExecutionContext;
import com.facebook.aura.nodes.registry.HatchNodeCommandContext;
import com.facebook.aura.nodes.registry.HatchNodeCommandHandler;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlinx.serialization.json.JsonElement;

/* loaded from: classes3.dex */
public final class NotificationsActionHandler implements HatchNodeCommandHandler {
    public static final NotificationsActionHandler INSTANCE = new NotificationsActionHandler();

    @DebugMetadata(c = "com.facebook.aura.commands.notifications.NotificationsActionHandler$execute$2", f = "NotificationsActionHandler.kt", l = {82, 88, 97, 102, 109, 111, 123, 163, 165}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.commands.notifications.NotificationsActionHandler$execute$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super NodeCommandResponse>, Object> {
        public final /* synthetic */ HatchNodeCommandContext $commandContext;
        public final /* synthetic */ NodeExecutionContext $ctx;
        public final /* synthetic */ String $paramsJson;
        public int I$0;
        public /* synthetic */ Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public Object L$4;
        public Object L$5;
        public Object L$6;
        public Object L$7;
        public boolean Z$0;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(HatchNodeCommandContext hatchNodeCommandContext, String str, NodeExecutionContext nodeExecutionContext, HtJ<? super AnonymousClass2> htJ) {
            super(2, htJ);
            this.$commandContext = hatchNodeCommandContext;
            this.$paramsJson = str;
            this.$ctx = nodeExecutionContext;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$commandContext, this.$paramsJson, this.$ctx, htJ);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:49:0x00df  */
        /* JADX WARN: Removed duplicated region for block: B:57:0x0106  */
        /* JADX WARN: Removed duplicated region for block: B:63:0x012c  */
        /* JADX WARN: Removed duplicated region for block: B:72:0x0151  */
        @Override // X.AbstractC8884Fsp
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r14) throws android.app.PendingIntent.CanceledException {
            /*
                Method dump skipped, instructions count: 632
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.commands.notifications.NotificationsActionHandler.AnonymousClass2.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super NodeCommandResponse> htJ) {
            return ((AnonymousClass2) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final NodeCommandResponse executeDismiss(NotificationRepoImpl notificationRepoImpl, String str) {
        try {
            notificationRepoImpl.cancelNotification(str);
            C2nw c2nwA1K = C60O.A1K();
            C7qW.A06(AuraDeeplinkRouteMapper.STATUS_ROUTE, FeedInstructionsCardStoreKt.KEY_DISMISSED, c2nwA1K);
            C7qW.A06("key", str, c2nwA1K);
            return C60R.A0R(c2nwA1K);
        } catch (Exception e) {
            C60O.A1P("Failed to dismiss notification: ", e.getMessage(), NotificationsActionHandlerKt.TAG);
            return C60R.A0P(FGI.A0M("Failed to dismiss notification: ", e.getMessage()));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final NodeCommandResponse executeDismissAll(NotificationRepoImpl notificationRepoImpl) {
        try {
            int i = 0;
            for (StatusBarNotification statusBarNotification : notificationRepoImpl.activeProvider.getActiveNotifications()) {
                try {
                    String key = statusBarNotification.getKey();
                    C7384Etj.A0U(key);
                    notificationRepoImpl.cancelNotification(key);
                    i++;
                } catch (Exception e) {
                    CFK.A04(NotificationsActionHandlerKt.TAG, C60P.A1L("Failed to dismiss notification ", statusBarNotification.getKey(), e.getMessage()));
                }
            }
            C2nw c2nwA1K = C60O.A1K();
            C7qW.A06(AuraDeeplinkRouteMapper.STATUS_ROUTE, "dismissed_all", c2nwA1K);
            C7qW.A05(Integer.valueOf(i), "dismissed_count", c2nwA1K);
            return C60R.A0R(c2nwA1K);
        } catch (Exception e2) {
            C60O.A1P("Failed to dismiss all notifications: ", e2.getMessage(), NotificationsActionHandlerKt.TAG);
            return C60R.A0P(FGI.A0M("Failed to dismiss all notifications: ", e2.getMessage()));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final NodeCommandResponse executeReply(Context context, NotificationRepoImpl notificationRepoImpl, String str, String str2) throws PendingIntent.CanceledException {
        StatusBarNotification next;
        int length;
        JsonElement jsonElement;
        String str3;
        Iterator<StatusBarNotification> it = notificationRepoImpl.activeProvider.getActiveNotifications().iterator();
        do {
            next = null;
            if (!it.hasNext()) {
                break;
            }
            next = it.next();
        } while (!C7384Etj.areEqual(next.getKey(), str));
        StatusBarNotification statusBarNotification = next;
        if (statusBarNotification == null) {
            return C60R.A0P(FGI.A0U("Notification with key '", str, "' not found"));
        }
        Notification.Action[] actionArr = statusBarNotification.getNotification().actions;
        if (actionArr == null || (length = actionArr.length) == 0) {
            return new NodeCommandResponse(false, null, "Notification has no actions", null, null);
        }
        int i = 0;
        while (true) {
            Notification.Action action = actionArr[i];
            RemoteInput[] remoteInputs = action.getRemoteInputs();
            if (remoteInputs == null || remoteInputs.length == 0) {
                i++;
                if (i >= length) {
                    jsonElement = null;
                    str3 = "Notification does not support inline reply";
                    break;
                }
            } else {
                RemoteInput[] remoteInputs2 = action.getRemoteInputs();
                if (remoteInputs2 != null && remoteInputs2.length != 0) {
                    try {
                        Intent intent = new Intent();
                        Bundle bundle = new Bundle();
                        bundle.putCharSequence(remoteInputs2[0].getResultKey(), str2);
                        RemoteInput.addResultsToIntent(remoteInputs2, intent, bundle);
                        action.actionIntent.send(context, 0, intent);
                        C2nw c2nwA1K = C60O.A1K();
                        C7qW.A06(AuraDeeplinkRouteMapper.STATUS_ROUTE, "replied", c2nwA1K);
                        C7qW.A06("key", str, c2nwA1K);
                        return C60R.A0R(c2nwA1K);
                    } catch (Exception e) {
                        C60O.A1P("Failed to send reply: ", e.getMessage(), NotificationsActionHandlerKt.TAG);
                        return new NodeCommandResponse(false, null, FGI.A0M("Failed to send reply: ", e.getMessage()), null, null);
                    }
                }
                jsonElement = null;
                str3 = "Reply action has no remote inputs";
            }
        }
        return new NodeCommandResponse(false, jsonElement, str3, jsonElement, jsonElement);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final NodeCommandResponse executeTapAction(NotificationRepoImpl notificationRepoImpl, String str, int i) throws PendingIntent.CanceledException {
        StatusBarNotification next;
        JsonElement jsonElement;
        String strA0v;
        int length;
        StringBuilder sbA0y;
        String str2;
        Notification.Action action;
        String string;
        Iterator<StatusBarNotification> it = notificationRepoImpl.activeProvider.getActiveNotifications().iterator();
        do {
            next = null;
            if (!it.hasNext()) {
                break;
            }
            next = it.next();
        } while (!C7384Etj.areEqual(next.getKey(), str));
        StatusBarNotification statusBarNotification = next;
        if (statusBarNotification == null) {
            sbA0y = C3cI.A0x("Notification with key '", str);
            str2 = "' not found";
        } else {
            Notification.Action[] actionArr = statusBarNotification.getNotification().actions;
            if (actionArr == null || (length = actionArr.length) == 0) {
                jsonElement = null;
                strA0v = "Notification has no actions";
                return new NodeCommandResponse(false, jsonElement, strA0v, jsonElement, jsonElement);
            }
            if (i >= 0 && i < length && (action = actionArr[i]) != null) {
                try {
                    action.actionIntent.send();
                    C2nw c2nwA1K = C60O.A1K();
                    C7qW.A06(AuraDeeplinkRouteMapper.STATUS_ROUTE, "action_triggered", c2nwA1K);
                    C7qW.A06("key", str, c2nwA1K);
                    C7qW.A05(Integer.valueOf(i), "action_index", c2nwA1K);
                    CharSequence charSequence = action.title;
                    if (charSequence == null || (string = charSequence.toString()) == null) {
                        string = "";
                    }
                    C7qW.A06("action_title", string, c2nwA1K);
                    return C60R.A0R(c2nwA1K);
                } catch (Exception e) {
                    C60O.A1P("Failed to tap action: ", e.getMessage(), NotificationsActionHandlerKt.TAG);
                    return C60R.A0P(FGI.A0M("Failed to trigger action: ", e.getMessage()));
                }
            }
            sbA0y = C60O.A0y("Action index ", i);
            sbA0y.append(" is out of range (0..");
            sbA0y.append(length - 1);
            str2 = ")";
        }
        strA0v = AnonymousClass001.A0v(str2, sbA0y);
        jsonElement = null;
        return new NodeCommandResponse(false, jsonElement, strA0v, jsonElement, jsonElement);
    }

    @Override // com.facebook.aura.nodes.registry.HatchNodeCommandHandlerRegistration
    public NodeCommandId getCommandId() {
        return NodeCommandId.NOTIFICATIONS_ACTION;
    }

    @Override // com.facebook.aura.nodes.registry.HatchNodeCommandHandlerRegistration
    public HatchNodeCommandHandler getHandler() {
        return this;
    }

    @Override // com.facebook.aura.nodes.registry.HatchNodeCommandHandler
    public /* bridge */ boolean getOnlySendsCard() {
        return false;
    }

    @Override // com.facebook.aura.nodes.registry.HatchNodeCommandHandlerRegistration
    public NodeCommandSpec getSpec() {
        return NotificationsCommandSpecs.NOTIFICATIONS_ACTION;
    }

    @Override // com.facebook.aura.nodes.registry.HatchNodeCommandHandler
    public /* bridge */ boolean isEnabled() {
        return true;
    }

    @Override // com.facebook.aura.nodes.registry.HatchNodeCommandHandler
    public /* bridge */ String validateParams(String str) {
        return null;
    }

    @Override // com.facebook.aura.nodes.registry.HatchNodeCommandHandler
    public Object execute(AbstractC3358CGz abstractC3358CGz, HatchNodeCommandContext hatchNodeCommandContext, String str, NodeExecutionContext nodeExecutionContext, HtJ<? super NodeCommandResponse> htJ) {
        return GAo.A00(htJ, AnonymousClass001.A0y(), new AnonymousClass2(hatchNodeCommandContext, str, nodeExecutionContext, null));
    }

    @Override // com.facebook.aura.nodes.registry.HatchNodeCommandHandler
    public /* bridge */ Object optionalDevicePermissions(String str, Context context, HtJ<? super List<String>> htJ) {
        return null;
    }
}
