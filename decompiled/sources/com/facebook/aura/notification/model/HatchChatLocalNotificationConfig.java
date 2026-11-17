package com.facebook.aura.notification.model;

import X.AbstractC3358CGz;
import X.AnonymousClass002;
import X.AnonymousClass004;
import X.AnonymousClass006;
import X.BLG;
import X.BzK;
import X.C06G;
import X.C06H;
import X.C0KA;
import X.C1BN;
import X.C3Pi;
import X.C4oT;
import X.C7384Etj;
import X.C9286GCn;
import X.CFK;
import X.CH0;
import X.InterfaceC7549F2g;
import com.facebook.aura.common.prefs.AuraUserPrefStore;
import com.facebook.aura.common.prefs.AuraUserPrefs;
import com.facebook.aura.notifications.suppression.HatchNotificationSuppression;

/* loaded from: classes2.dex */
public final class HatchChatLocalNotificationConfig implements InterfaceC7549F2g {
    public static final Companion Companion = new Companion();
    public static ActiveChatScreen activeChatScreen;
    public final BLG<Boolean> _hasUnreadChat;
    public final C1BN<Boolean> hasUnreadChat;
    public int unreadMessageCount;
    public final AbstractC3358CGz userSession;

    public final class ActiveChatScreen extends C06G {
        public final boolean isThread;
        public final String sessionId;

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof ActiveChatScreen) {
                    ActiveChatScreen activeChatScreen = (ActiveChatScreen) obj;
                    if (!C7384Etj.areEqual(this.sessionId, activeChatScreen.sessionId) || this.isThread != activeChatScreen.isThread) {
                    }
                }
                return false;
            }
            return true;
        }

        public static /* synthetic */ ActiveChatScreen copy$default(ActiveChatScreen activeChatScreen, String str, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                str = activeChatScreen.sessionId;
            }
            if ((i & 2) != 0) {
                z = activeChatScreen.isThread;
            }
            return new ActiveChatScreen(str, z);
        }

        public final String component1() {
            return this.sessionId;
        }

        public final boolean component2() {
            return this.isThread;
        }

        public final ActiveChatScreen copy(String str, boolean z) {
            return new ActiveChatScreen(str, z);
        }

        public final String getSessionId() {
            return this.sessionId;
        }

        public int hashCode() {
            return C0KA.A00(AnonymousClass006.A0G(this.sessionId) * 31, this.isThread);
        }

        public final boolean isThread() {
            return this.isThread;
        }

        public ActiveChatScreen(String str, boolean z) {
            this.sessionId = str;
            this.isThread = z;
        }

        public String toString() {
            return super.toString();
        }
    }

    public final class Companion {
        public final HatchChatLocalNotificationConfig getInstance(AbstractC3358CGz abstractC3358CGz) {
            C7384Etj.A0Y(abstractC3358CGz, 0);
            return (HatchChatLocalNotificationConfig) abstractC3358CGz.A03(HatchChatLocalNotificationConfig.class, new HatchChatLocalNotificationConfig$Companion$getInstance$1(abstractC3358CGz));
        }

        public final ActiveChatScreen getActiveChatScreen() {
            return HatchChatLocalNotificationConfig.activeChatScreen;
        }

        public final boolean isEventForActiveScreen(String str, boolean z) {
            ActiveChatScreen activeChatScreen = HatchChatLocalNotificationConfig.activeChatScreen;
            if (activeChatScreen == null) {
                return false;
            }
            String str2 = activeChatScreen.sessionId;
            return str2 == null ? !z : str2.equals(str);
        }

        public final void setActiveChatScreen(ActiveChatScreen activeChatScreen) {
            String str;
            boolean z;
            HatchChatLocalNotificationConfig.activeChatScreen = activeChatScreen;
            HatchNotificationSuppression hatchNotificationSuppression = HatchNotificationSuppression.INSTANCE;
            if (activeChatScreen != null) {
                str = activeChatScreen.sessionId;
                z = true;
            } else {
                str = null;
                z = false;
            }
            hatchNotificationSuppression.setChatOnScreen(str, z);
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    private final boolean loadUnreadMessageFlag() {
        try {
            return getPrefs().getBoolean(HatchChatLocalNotificationConfigKt.PREF_HAS_UNREAD_CHAT, false);
        } catch (Exception unused) {
            return false;
        }
    }

    @Override // X.InterfaceC7549F2g
    public void clearUserData() {
        this.unreadMessageCount = 0;
        AnonymousClass004.A1D(false, this._hasUnreadChat);
    }

    public final synchronized int incrementUnreadMessageCount() {
        int i;
        i = this.unreadMessageCount + 1;
        this.unreadMessageCount = i;
        AnonymousClass004.A1D(true, this._hasUnreadChat);
        saveUnreadMessageFlag(true);
        return i;
    }

    public final synchronized void setUnreadMessageCount(int i) {
        this.unreadMessageCount = i;
        boolean zA1N = AnonymousClass002.A1N(i);
        AnonymousClass004.A1D(zA1N, this._hasUnreadChat);
        saveUnreadMessageFlag(zA1N);
    }

    private final C4oT getPrefs() {
        return AuraUserPrefs.INSTANCE.get(((CH0) this.userSession).A01, AuraUserPrefStore.CHAT_NOTIFICATION);
    }

    public final C1BN<Boolean> getHasUnreadChat() {
        return this.hasUnreadChat;
    }

    public HatchChatLocalNotificationConfig(AbstractC3358CGz abstractC3358CGz) {
        this.userSession = abstractC3358CGz;
        C9286GCn c9286GCnA0v = AnonymousClass002.A0v(loadUnreadMessageFlag());
        this._hasUnreadChat = c9286GCnA0v;
        this.hasUnreadChat = C3Pi.A00(c9286GCnA0v);
    }

    private final void saveUnreadMessageFlag(boolean z) {
        try {
            BzK bzKA9q = getPrefs().A9q();
            bzKA9q.A0A(HatchChatLocalNotificationConfigKt.PREF_HAS_UNREAD_CHAT, z);
            bzKA9q.apply();
        } catch (Exception e) {
            CFK.A0A(HatchChatLocalNotificationConfigKt.TAG, "Failed to persist unread flag", e);
        }
    }

    public /* synthetic */ HatchChatLocalNotificationConfig(AbstractC3358CGz abstractC3358CGz, C06H c06h) {
        this(abstractC3358CGz);
    }
}
