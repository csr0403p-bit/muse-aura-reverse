package com.facebook.aura.nodes.cards;

import X.AbstractC3358CGz;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass006;
import X.AnonymousClass007;
import X.BLG;
import X.C06H;
import X.C10571Hud;
import X.C1BN;
import X.C3Pi;
import X.C3cG;
import X.C7380Etd;
import X.C7384Etj;
import X.C9286GCn;
import X.HnJ;
import X.HsJ;
import android.content.Context;
import com.facebook.aura.analytics.hatch.HatchAppEventLogger;
import com.facebook.aura.analytics.hatch.HatchComponent;
import com.facebook.aura.analytics.hatch.HatchInteractionLogger;
import com.facebook.aura.analytics.hatch.HatchMetadataKey;
import com.facebook.aura.analytics.hatch.HatchScreen;
import com.facebook.aura.analytics.hatch.HatchSurface;
import com.facebook.aura.commands.core.PermissionChangeNotifier;
import java.util.Set;

/* loaded from: classes2.dex */
public final class NotificationOptInStore {
    public static final int $stable = 8;
    public static final Companion Companion = new Companion();
    public final BLG<Boolean> _notificationsEnabled;
    public final Context context;
    public final C1BN<Boolean> notificationsEnabled;
    public final Set<String> shown;

    public final void logEvent(String str, String str2) {
        C7384Etj.A0Y(str, 0);
        HatchAppEventLogger.INSTANCE.logEvent(HatchNodeCardJsonKt.TYPE_NOTIFICATION_OPT_IN, "chat", null, str, HatchNodeCardJsonKt.TYPE_NOTIFICATION_OPT_IN, str2 != null ? AnonymousClass006.A10("outcome", str2) : null, null);
    }

    public final void logInteraction(String str) {
        C7384Etj.A0Y(str, 0);
        HatchInteractionLogger.INSTANCE.logClick(HatchSurface.CHAT, null, HatchScreen.MAIN_CHAT, HatchComponent.NOTIFICATION_PERMISSION, null, AnonymousClass007.A0d(HatchMetadataKey.ACTION.getValue(), str, C3cG.A0r(HatchMetadataKey.ENTRY_POINT.getValue(), HatchNodeCardJsonKt.TYPE_NOTIFICATION_OPT_IN)), null);
    }

    public final void onShown(String str) {
        C7384Etj.A0Y(str, 0);
        if (this.shown.add(str)) {
            logEvent("shown", null);
        }
    }

    public final class Companion {
        public final NotificationOptInStore getInstance(AbstractC3358CGz abstractC3358CGz, Context context) {
            AnonymousClass003.A0u(abstractC3358CGz, context);
            return (NotificationOptInStore) abstractC3358CGz.A03(NotificationOptInStore.class, new NotificationOptInStore$Companion$getInstance$1(context));
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    private final Boolean readStatus() {
        Object objA0s;
        try {
            objA0s = Boolean.valueOf(new C7380Etd(this.context).A00.areNotificationsEnabled());
        } catch (Throwable th) {
            objA0s = C3cG.A0s(th);
        }
        if (HsJ.A00(objA0s) != null) {
            logEvent("outcome", "status_read_failed");
        }
        if (objA0s instanceof C10571Hud) {
            objA0s = null;
        }
        return (Boolean) objA0s;
    }

    public final C1BN<Boolean> getNotificationsEnabled() {
        return this.notificationsEnabled;
    }

    public NotificationOptInStore(Context context) {
        this.context = context;
        C9286GCn c9286GCnA01 = HnJ.A01(readStatus());
        this._notificationsEnabled = c9286GCnA01;
        this.notificationsEnabled = C3Pi.A00(c9286GCnA01);
        this.shown = C3cG.A0k();
    }

    public final Boolean refresh() {
        Boolean status = readStatus();
        if (!C7384Etj.areEqual(status, this._notificationsEnabled.getValue())) {
            this._notificationsEnabled.Af8(status);
            PermissionChangeNotifier.INSTANCE.notifyChanged();
            if (AnonymousClass002.A1b(status, true) && !this.shown.isEmpty()) {
                logEvent("outcome", "notifications_enabled");
            }
        }
        return status;
    }

    public /* synthetic */ NotificationOptInStore(Context context, C06H c06h) {
        this(context);
    }
}
