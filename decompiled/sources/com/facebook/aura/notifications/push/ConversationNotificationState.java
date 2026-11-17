package com.facebook.aura.notifications.push;

import X.AbstractC0878AGe;
import X.AbstractC3358CGz;
import X.AnonymousClass004;
import X.C06H;
import X.C0881AGi;
import X.C3cG;
import X.C3cI;
import X.C7384Etj;
import X.EFx;
import X.EFz;
import X.InterfaceC7549F2g;
import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import androidx.core.graphics.drawable.IconCompat;
import com.facebook.aura.R;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public final class ConversationNotificationState implements InterfaceC7549F2g {
    public static final Companion Companion = new Companion();
    public volatile Uri _agentAvatarUri;
    public volatile EFx _agentPerson;
    public volatile EFx _userPerson;
    public final Object lock;
    public final Map<String, List<EFz>> messagesByThread;
    public final Map<String, Long> replyOnAnotherDeviceAtByThread;
    public final AbstractC3358CGz userSession;

    public final void clear(String str) {
        C7384Etj.A0Y(str, 0);
        synchronized (this.lock) {
            this.messagesByThread.remove(str);
            this.replyOnAnotherDeviceAtByThread.remove(str);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x007c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.EFx getOrCreateAgentPerson(X.AbstractC3358CGz r12) {
        /*
            r11 = this;
            r9 = 0
            X.C7384Etj.A0Y(r12, r9)
            com.facebook.aura.gateway.service.HatchGatewayServiceManager r0 = com.facebook.aura.gateway.service.HatchGatewayServiceManager.INSTANCE
            com.facebook.aura.gateway.HatchGatewayConnection$Companion r0 = com.facebook.aura.gateway.HatchGatewayConnection.Companion
            com.facebook.aura.gateway.HatchGatewayConnection r0 = r0.getInstance(r12)
            com.facebook.aura.gateway.HatchGatewayEventsHandler r0 = r0.getEventsHandler$fbandroid_express_aura_java_com_facebook_aura_gateway_gateway()
            X.1BN<com.facebook.aura.model.AiIdentity> r0 = r0.aiIdentity
            java.lang.Object r0 = r0.getValue()
            com.facebook.aura.model.AiIdentity r0 = (com.facebook.aura.model.AiIdentity) r0
            X.EFx r4 = r11._agentPerson
            if (r0 == 0) goto L20
            java.lang.String r6 = r0.name
            if (r6 != 0) goto L26
        L20:
            com.facebook.aura.gateway.JarvisUtils r0 = com.facebook.aura.gateway.JarvisUtils.INSTANCE
            java.lang.String r6 = r0.getSelectedAssistantName(r12)
        L26:
            com.facebook.aura.identity.provider.HatchIdentityProvider$Companion r0 = com.facebook.aura.identity.provider.HatchIdentityProvider.Companion
            com.facebook.aura.identity.provider.HatchIdentityProvider r0 = r0.getInstance(r12)
            com.facebook.aura.identity.provider.HatchIcon r2 = r0.hatchIcon()
            boolean r1 = r2 instanceof com.facebook.aura.identity.provider.HatchIcon.LocalImage
            r0 = 0
            if (r1 == 0) goto L81
            com.facebook.aura.identity.provider.HatchIcon$LocalImage r2 = (com.facebook.aura.identity.provider.HatchIcon.LocalImage) r2
            if (r2 == 0) goto L81
            android.net.Uri r3 = r2.uri
            if (r3 == 0) goto L46
            android.net.Uri r1 = r11._agentAvatarUri
            boolean r1 = r3.equals(r1)
            r2 = 0
            if (r1 == 0) goto L47
        L46:
            r2 = 1
        L47:
            if (r4 == 0) goto L54
            java.lang.CharSequence r1 = r4.A01
            boolean r1 = X.C7384Etj.areEqual(r1, r6)
            if (r1 == 0) goto L54
            if (r2 == 0) goto L54
        L53:
            return r4
        L54:
            androidx.core.graphics.drawable.IconCompat r2 = r11.loadAgentAvatarIcon(r12)
            if (r4 == 0) goto L65
            java.lang.CharSequence r1 = r4.A01
            boolean r1 = X.C7384Etj.areEqual(r1, r6)
            if (r1 == 0) goto L65
            if (r2 != 0) goto L7f
            return r4
        L65:
            if (r2 != 0) goto L7f
            if (r4 == 0) goto L6b
            androidx.core.graphics.drawable.IconCompat r0 = r4.A00
        L6b:
            r5 = 0
            r8 = 0
            java.lang.String r7 = "hatch_ai_agent"
            if (r0 == 0) goto L72
            r5 = r0
        L72:
            r10 = 1
            X.EFx r4 = new X.EFx
            r4.<init>(r5, r6, r7, r8, r9, r10)
            r11._agentPerson = r4
            if (r2 == 0) goto L53
            r11._agentAvatarUri = r3
            return r4
        L7f:
            r0 = r2
            goto L6b
        L81:
            r3 = r0
            goto L46
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.notifications.push.ConversationNotificationState.getOrCreateAgentPerson(X.CGz):X.EFx");
    }

    public final EFx getUserPerson(Context context) {
        C7384Etj.A0Y(context, 0);
        EFx eFx = this._userPerson;
        if (eFx != null) {
            return eFx;
        }
        EFx eFx2 = new EFx(null, context.getString(R.string._name_removed__res_0x7f120b8f), null, null, false, true);
        this._userPerson = eFx2;
        return eFx2;
    }

    public final void invalidateAgentPerson() {
        this._agentPerson = null;
        this._agentAvatarUri = null;
    }

    public final List<EFz> recentMessages(String str) {
        List<EFz> listA0X;
        C7384Etj.A0Y(str, 0);
        synchronized (this.lock) {
            List<EFz> list = this.messagesByThread.get(str);
            listA0X = list != null ? AbstractC0878AGe.A0X(list) : null;
            if (listA0X == null) {
                listA0X = C0881AGi.A00;
            }
        }
        return listA0X;
    }

    public final void recordReply(String str, boolean z) {
        C7384Etj.A0Y(str, 0);
        synchronized (this.lock) {
            Map<String, Long> map = this.replyOnAnotherDeviceAtByThread;
            if (z) {
                map.put(str, C3cI.A0O());
            } else {
                map.remove(str);
            }
        }
    }

    public final boolean repliedOnAnotherDeviceRecently(String str) {
        C7384Etj.A0Y(str, 0);
        synchronized (this.lock) {
            Long l = this.replyOnAnotherDeviceAtByThread.get(str);
            if (l != null) {
                return C3cG.A04(l.longValue()) < 120000;
            }
            return false;
        }
    }

    private final IconCompat loadAgentAvatarIcon(AbstractC3358CGz abstractC3358CGz) {
        Bitmap bitmapLoadCircularAvatar = HatchAgentAvatarLoader.INSTANCE.loadCircularAvatar(abstractC3358CGz, 256);
        if (bitmapLoadCircularAvatar == null) {
            return null;
        }
        IconCompat iconCompat = new IconCompat(1);
        iconCompat.A06 = bitmapLoadCircularAvatar;
        return iconCompat;
    }

    public final void clearAll() {
        synchronized (this.lock) {
            this.messagesByThread.clear();
            this.replyOnAnotherDeviceAtByThread.clear();
        }
    }

    /* loaded from: classes2.dex */
    public final class Companion {
        public final ConversationNotificationState getInstance(AbstractC3358CGz abstractC3358CGz) {
            C7384Etj.A0Y(abstractC3358CGz, 0);
            return (ConversationNotificationState) abstractC3358CGz.A03(ConversationNotificationState.class, new ConversationNotificationState$Companion$getInstance$1(abstractC3358CGz));
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public ConversationNotificationState(AbstractC3358CGz abstractC3358CGz) {
        this.userSession = abstractC3358CGz;
        this.lock = C3cG.A0T();
        this.messagesByThread = C3cG.A0j();
        this.replyOnAnotherDeviceAtByThread = C3cG.A0j();
    }

    public final void addMessage(String str, String str2, long j, EFx eFx) {
        boolean zA1b = AnonymousClass004.A1b(str, str2);
        C7384Etj.A0Y(eFx, 3);
        synchronized (this.lock) {
            Map<String, List<EFz>> map = this.messagesByThread;
            List<EFz> listA0h = map.get(str);
            if (listA0h == null) {
                listA0h = C3cG.A0h();
                map.put(str, listA0h);
            }
            List<EFz> list = listA0h;
            list.add(new EFz(eFx, str2, j));
            if (list.size() > 7) {
                list.remove(zA1b ? 1 : 0);
            }
        }
    }

    @Override // X.InterfaceC7549F2g
    public void clearUserData() {
        clearAll();
        this._agentPerson = null;
        this._userPerson = null;
    }

    public /* synthetic */ ConversationNotificationState(AbstractC3358CGz abstractC3358CGz, C06H c06h) {
        this(abstractC3358CGz);
    }
}
