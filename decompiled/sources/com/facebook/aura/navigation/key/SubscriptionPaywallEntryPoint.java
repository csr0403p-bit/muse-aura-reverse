package com.facebook.aura.navigation.key;

import X.AbstractC5321DgF;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.C06H;
import X.C3cG;
import X.C79;
import X.C9hr;
import X.C9iL;
import X.Ey9;
import X.F0C;
import com.facebook.aura.deeplink.AuraDeeplinkRouteMapper;
import com.facebook.aura.qpl.startup.points.HatchStartupPoints;
import java.util.Iterator;
import kotlin.jvm.functions.Function0;
import kotlinx.serialization.Serializable;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Serializable
/* loaded from: classes4.dex */
public final class SubscriptionPaywallEntryPoint {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ SubscriptionPaywallEntryPoint[] $VALUES;
    public static final F0C<C9hr<Object>> $cachedSerializer$delegate;
    public static final SubscriptionPaywallEntryPoint ACTIVATION;
    public static final SubscriptionPaywallEntryPoint CHAT;
    public static final SubscriptionPaywallEntryPoint CONFIDENTIAL_VM;
    public static final SubscriptionPaywallEntryPoint CREDITS_SCREEN;
    public static final Companion Companion;
    public static final SubscriptionPaywallEntryPoint DEEPLINK;
    public static final SubscriptionPaywallEntryPoint DEFAULT;
    public static final SubscriptionPaywallEntryPoint HOME_LINK_CLAIM;
    public static final SubscriptionPaywallEntryPoint SETTINGS;
    public static final SubscriptionPaywallEntryPoint STATUS;
    public final String value;

    public final class Companion {
        public final SubscriptionPaywallEntryPoint fromWire(String str) {
            SubscriptionPaywallEntryPoint subscriptionPaywallEntryPoint = null;
            if (str == null) {
                return null;
            }
            Iterator<SubscriptionPaywallEntryPoint> it = SubscriptionPaywallEntryPoint.getEntries().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                SubscriptionPaywallEntryPoint next = it.next();
                if (str.equals(next.getValue())) {
                    subscriptionPaywallEntryPoint = next;
                    break;
                }
            }
            return subscriptionPaywallEntryPoint;
        }

        /* renamed from: com.facebook.aura.navigation.key.SubscriptionPaywallEntryPoint$Companion$1, reason: invalid class name */
        public final class AnonymousClass1 extends AbstractC7559F3s implements Function0<C9hr<Object>> {
            public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

            public AnonymousClass1() {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final C9hr<Object> invoke() {
                return C9iL.A01("com.facebook.aura.navigation.key.SubscriptionPaywallEntryPoint", SubscriptionPaywallEntryPoint.values());
            }
        }

        private final /* synthetic */ C9hr get$cachedSerializer() {
            return AnonymousClass001.A12(SubscriptionPaywallEntryPoint.$cachedSerializer$delegate);
        }

        public final C9hr<SubscriptionPaywallEntryPoint> serializer() {
            return AnonymousClass001.A12(SubscriptionPaywallEntryPoint.$cachedSerializer$delegate);
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    static {
        SubscriptionPaywallEntryPoint subscriptionPaywallEntryPoint = new SubscriptionPaywallEntryPoint("DEFAULT", 0, "default");
        DEFAULT = subscriptionPaywallEntryPoint;
        SubscriptionPaywallEntryPoint subscriptionPaywallEntryPoint2 = new SubscriptionPaywallEntryPoint("SETTINGS", 1, "settings");
        SETTINGS = subscriptionPaywallEntryPoint2;
        SubscriptionPaywallEntryPoint subscriptionPaywallEntryPoint3 = new SubscriptionPaywallEntryPoint("STATUS", 2, AuraDeeplinkRouteMapper.STATUS_ROUTE);
        STATUS = subscriptionPaywallEntryPoint3;
        SubscriptionPaywallEntryPoint subscriptionPaywallEntryPoint4 = new SubscriptionPaywallEntryPoint("CHAT", 3, "chat");
        CHAT = subscriptionPaywallEntryPoint4;
        SubscriptionPaywallEntryPoint subscriptionPaywallEntryPoint5 = new SubscriptionPaywallEntryPoint("CREDITS_SCREEN", 4, "credits_screen");
        CREDITS_SCREEN = subscriptionPaywallEntryPoint5;
        SubscriptionPaywallEntryPoint subscriptionPaywallEntryPoint6 = new SubscriptionPaywallEntryPoint("DEEPLINK", 5, "deeplink");
        DEEPLINK = subscriptionPaywallEntryPoint6;
        SubscriptionPaywallEntryPoint subscriptionPaywallEntryPoint7 = new SubscriptionPaywallEntryPoint("CONFIDENTIAL_VM", 6, "confidential_vm");
        CONFIDENTIAL_VM = subscriptionPaywallEntryPoint7;
        SubscriptionPaywallEntryPoint subscriptionPaywallEntryPoint8 = new SubscriptionPaywallEntryPoint("HOME_LINK_CLAIM", 7, "home_link_claim");
        HOME_LINK_CLAIM = subscriptionPaywallEntryPoint8;
        SubscriptionPaywallEntryPoint subscriptionPaywallEntryPoint9 = new SubscriptionPaywallEntryPoint("ACTIVATION", 8, HatchStartupPoints.SURFACE_ACTIVATION);
        ACTIVATION = subscriptionPaywallEntryPoint9;
        SubscriptionPaywallEntryPoint[] subscriptionPaywallEntryPointArr = {subscriptionPaywallEntryPoint, subscriptionPaywallEntryPoint2, subscriptionPaywallEntryPoint3, subscriptionPaywallEntryPoint4, subscriptionPaywallEntryPoint5, subscriptionPaywallEntryPoint6, subscriptionPaywallEntryPoint7, subscriptionPaywallEntryPoint8, subscriptionPaywallEntryPoint9};
        $VALUES = subscriptionPaywallEntryPointArr;
        $ENTRIES = C3cG.A0w(subscriptionPaywallEntryPointArr);
        Companion = new Companion();
        $cachedSerializer$delegate = AbstractC5321DgF.A02(C79.A01, Companion.AnonymousClass1.INSTANCE);
    }

    public static Ey9<SubscriptionPaywallEntryPoint> getEntries() {
        return $ENTRIES;
    }

    public static SubscriptionPaywallEntryPoint valueOf(String str) {
        return (SubscriptionPaywallEntryPoint) Enum.valueOf(SubscriptionPaywallEntryPoint.class, str);
    }

    public static SubscriptionPaywallEntryPoint[] values() {
        return (SubscriptionPaywallEntryPoint[]) $VALUES.clone();
    }

    public final String getValue() {
        return this.value;
    }

    public SubscriptionPaywallEntryPoint(String str, int i, String str2) {
        this.value = str2;
    }
}
