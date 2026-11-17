package com.facebook.aura.notifications.push;

import X.AbstractC3358CGz;
import X.AbstractC3962Ci6;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.BV4;
import X.BV5;
import X.C10543Hqv;
import X.C3cF;
import X.C3cG;
import X.C60O;
import X.C60Q;
import X.C7380Etd;
import X.C7384Etj;
import X.C7lJ;
import X.CFK;
import X.CPS;
import X.CPX;
import X.DY5;
import X.F0T;
import X.F1F;
import X.F1G;
import X.FGI;
import X.Hzd;
import X.InterfaceC3957Chw;
import android.content.Context;
import android.provider.Settings;
import com.facebook.aura.analytics.waterfall.HatchPriceImpressionEventDataKt;
import com.facebook.aura.auth.store.AuraUserSessionStore;
import com.facebook.aura.graphql.AuraGraphQLService;
import com.facebook.aura.notifications.push.ABRARegisterPushTokenMutationImpl;
import com.facebook.aura.notifications.push.ABRARegisterPushTokenMutationResponse;
import com.facebook.aura.notifications.push.ABRAUnregisterPushTokenMutationImpl;
import com.facebook.aura.notifications.push.ABRAUnregisterPushTokenMutationResponse;
import java.io.IOException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* loaded from: classes5.dex */
public final class AuraPushTokenSender implements InterfaceC3957Chw {
    public final Context appContext;
    public final String pushTokenSenderName;

    public AuraPushTokenSender(Context context) {
        C7384Etj.A0Y(context, 0);
        this.appContext = AnonymousClass001.A0I(context);
        this.pushTokenSenderName = AuraPushTokenSenderKt.TAG;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC3957Chw
    public boolean registerToken(String str, String str2, AbstractC3962Ci6 abstractC3962Ci6) throws IOException {
        boolean zA1a = AnonymousClass002.A1a(str, str2);
        String strA0f = BV4.A0f();
        String strSelectServiceEndpointType = selectServiceEndpointType(str);
        String strA0j = BV5.A0j();
        Hzd hzd = new Hzd(2);
        hzd.A08("sensitive_string_value", str2);
        String strAndroidId = androidId();
        this.appContext.getPackageName();
        DY5<ABRARegisterPushTokenMutationResponse> dy5Build = new ABRARegisterPushTokenMutationImpl.Builder().setInput(new Hzd(hzd, strA0f, strA0j, strSelectServiceEndpointType, strAndroidId, ((C7lJ) BV5.A0Z(32775)).A00(), osSettingsJson())).build();
        final CountDownLatch countDownLatch = new CountDownLatch(zA1a ? 1 : 0);
        final F1F f1f = new F1F();
        final C10543Hqv c10543HqvA0z = C3cG.A0z();
        AbstractC3358CGz currentUserSession = AuraUserSessionStore.INSTANCE.getCurrentUserSession();
        if (currentUserSession == null) {
            CFK.A04(AuraPushTokenSenderKt.TAG, "Cannot register push token: no user session available");
            return false;
        }
        AuraGraphQLService.INSTANCE.execute(currentUserSession, dy5Build, new F0T() { // from class: com.facebook.aura.notifications.push.AuraPushTokenSender.registerToken.1
            @Override // X.F0T
            public final void invoke(F1G<ABRARegisterPushTokenMutationResponse> f1g) {
                C7384Etj.A0Y(f1g, 0);
                ABRARegisterPushTokenMutationResponse aBRARegisterPushTokenMutationResponse = (ABRARegisterPushTokenMutationResponse) ((CPX) f1g).A01;
                ABRARegisterPushTokenMutationResponse.AbraRegisterPushToken abraRegisterPushToken$fbandroid_express_aura_java_com_facebook_aura_notifications_push_push = aBRARegisterPushTokenMutationResponse != null ? aBRARegisterPushTokenMutationResponse.getAbraRegisterPushToken$fbandroid_express_aura_java_com_facebook_aura_notifications_push_push() : null;
                F1F f1f2 = f1f;
                boolean z = false;
                if (abraRegisterPushToken$fbandroid_express_aura_java_com_facebook_aura_notifications_push_push != null && abraRegisterPushToken$fbandroid_express_aura_java_com_facebook_aura_notifications_push_push.getSuccess$fbandroid_express_aura_java_com_facebook_aura_notifications_push_push()) {
                    z = true;
                }
                f1f2.element = z;
                if (f1f.element) {
                    CFK.A05(AuraPushTokenSenderKt.TAG, FGI.A0M("Push token registered successfully, token_id=", abraRegisterPushToken$fbandroid_express_aura_java_com_facebook_aura_notifications_push_push != null ? abraRegisterPushToken$fbandroid_express_aura_java_com_facebook_aura_notifications_push_push.getTokenId$fbandroid_express_aura_java_com_facebook_aura_notifications_push_push() : null));
                } else {
                    C60O.A1P("Push token registration failed: ", abraRegisterPushToken$fbandroid_express_aura_java_com_facebook_aura_notifications_push_push != null ? abraRegisterPushToken$fbandroid_express_aura_java_com_facebook_aura_notifications_push_push.getErrorMessage$fbandroid_express_aura_java_com_facebook_aura_notifications_push_push() : null, AuraPushTokenSenderKt.TAG);
                }
                countDownLatch.countDown();
            }
        }, new CPS() { // from class: com.facebook.aura.notifications.push.AuraPushTokenSender.registerToken.2
            /* JADX WARN: Multi-variable type inference failed */
            @Override // X.CPS
            public final void invoke(Throwable th) {
                C7384Etj.A0Y(th, 0);
                CFK.A08(AuraPushTokenSenderKt.TAG, "GraphQL mutation failed", th);
                c10543HqvA0z.element = th;
                countDownLatch.countDown();
            }
        });
        if (!countDownLatch.await(30L, TimeUnit.SECONDS)) {
            throw BV4.A0K("Push token registration timed out");
        }
        Throwable th = (Throwable) c10543HqvA0z.element;
        if (th == null) {
            return f1f.element;
        }
        throw new IOException("Push token registration failed", th);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC3957Chw
    public boolean unregisterToken(String str, String str2) throws IOException {
        boolean zA1a = AnonymousClass002.A1a(str, str2);
        String strA0f = BV4.A0f();
        Hzd hzd = new Hzd(2);
        hzd.A08("sensitive_string_value", str2);
        DY5<ABRAUnregisterPushTokenMutationResponse> dy5Build = new ABRAUnregisterPushTokenMutationImpl.Builder().setInput(new Hzd(hzd, strA0f)).build();
        final CountDownLatch countDownLatch = new CountDownLatch(zA1a ? 1 : 0);
        final F1F f1f = new F1F();
        final C10543Hqv c10543HqvA0z = C3cG.A0z();
        AbstractC3358CGz currentUserSession = AuraUserSessionStore.INSTANCE.getCurrentUserSession();
        if (currentUserSession == null) {
            CFK.A04(AuraPushTokenSenderKt.TAG, "Cannot unregister push token: no user session available");
            return false;
        }
        AuraGraphQLService.INSTANCE.execute(currentUserSession, dy5Build, new F0T() { // from class: com.facebook.aura.notifications.push.AuraPushTokenSender.unregisterToken.1
            @Override // X.F0T
            public final void invoke(F1G<ABRAUnregisterPushTokenMutationResponse> f1g) {
                C7384Etj.A0Y(f1g, 0);
                ABRAUnregisterPushTokenMutationResponse aBRAUnregisterPushTokenMutationResponse = (ABRAUnregisterPushTokenMutationResponse) ((CPX) f1g).A01;
                ABRAUnregisterPushTokenMutationResponse.AbraUnregisterPushToken abraUnregisterPushToken$fbandroid_express_aura_java_com_facebook_aura_notifications_push_push = aBRAUnregisterPushTokenMutationResponse != null ? aBRAUnregisterPushTokenMutationResponse.getAbraUnregisterPushToken$fbandroid_express_aura_java_com_facebook_aura_notifications_push_push() : null;
                F1F f1f2 = f1f;
                boolean z = false;
                if (abraUnregisterPushToken$fbandroid_express_aura_java_com_facebook_aura_notifications_push_push != null && abraUnregisterPushToken$fbandroid_express_aura_java_com_facebook_aura_notifications_push_push.getSuccess$fbandroid_express_aura_java_com_facebook_aura_notifications_push_push()) {
                    z = true;
                }
                f1f2.element = z;
                if (f1f.element) {
                    CFK.A05(AuraPushTokenSenderKt.TAG, "Push token unregistered successfully");
                } else {
                    C60O.A1P("Push token unregistration failed: ", abraUnregisterPushToken$fbandroid_express_aura_java_com_facebook_aura_notifications_push_push != null ? abraUnregisterPushToken$fbandroid_express_aura_java_com_facebook_aura_notifications_push_push.getErrorMessage$fbandroid_express_aura_java_com_facebook_aura_notifications_push_push() : null, AuraPushTokenSenderKt.TAG);
                }
                countDownLatch.countDown();
            }
        }, new CPS() { // from class: com.facebook.aura.notifications.push.AuraPushTokenSender.unregisterToken.2
            /* JADX WARN: Multi-variable type inference failed */
            @Override // X.CPS
            public final void invoke(Throwable th) {
                C7384Etj.A0Y(th, 0);
                CFK.A08(AuraPushTokenSenderKt.TAG, "GraphQL mutation failed", th);
                c10543HqvA0z.element = th;
                countDownLatch.countDown();
            }
        });
        if (!countDownLatch.await(5L, TimeUnit.SECONDS)) {
            throw BV4.A0K("Push token unregistration timed out");
        }
        Throwable th = (Throwable) c10543HqvA0z.element;
        if (th == null) {
            return f1f.element;
        }
        throw new IOException("Push token unregistration failed", th);
    }

    private final String androidId() {
        return Settings.Secure.getString(this.appContext.getContentResolver(), "android_id");
    }

    private final String osSettingsJson() {
        return C60O.A0o(BV4.A18().put("notificationEnabled", new C7380Etd(this.appContext).A00.areNotificationsEnabled() ? "1" : HatchPriceImpressionEventDataKt.NO_DISCOUNT));
    }

    private final String selectServiceEndpointType(String str) {
        if ("FBNS".equals(str)) {
            return C3cF.A00(41);
        }
        if ("FCM".equals(str)) {
            return "https://fcm.googleapis.com/fcm/send";
        }
        throw C60Q.A0U("Unsupported token provider: ", str);
    }

    public String getPushTokenSenderName() {
        return this.pushTokenSenderName;
    }

    public /* bridge */ boolean unregisterToken(String str, String str2, String str3) {
        AnonymousClass003.A0x(str, str2);
        return unregisterToken(str, str2);
    }
}
