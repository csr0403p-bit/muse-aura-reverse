package com.facebook.aura.navigation.key;

import X.AbstractC5321DgF;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.C06H;
import X.C79;
import X.C9hr;
import X.C9iL;
import X.Ey9;
import X.F0C;
import X.F3w;
import kotlin.jvm.functions.Function0;
import kotlinx.serialization.Serializable;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Serializable
/* loaded from: classes.dex */
public final class ConfidentialVmSwitchEntryPoint {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ ConfidentialVmSwitchEntryPoint[] $VALUES;
    public static final F0C<C9hr<Object>> $cachedSerializer$delegate;
    public static final ConfidentialVmSwitchEntryPoint CHAT_CARD;
    public static final Companion Companion;
    public static final ConfidentialVmSwitchEntryPoint DEEPLINK;
    public static final ConfidentialVmSwitchEntryPoint OFF_WAITLIST_PUSH;
    public static final ConfidentialVmSwitchEntryPoint SETTINGS;
    public static final ConfidentialVmSwitchEntryPoint SUBSCRIPTION_ENDED;
    public final String analyticsValue;

    public final class Companion {

        /* renamed from: com.facebook.aura.navigation.key.ConfidentialVmSwitchEntryPoint$Companion$1, reason: invalid class name */
        public final class AnonymousClass1 extends AbstractC7559F3s implements Function0<C9hr<Object>> {
            public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

            public AnonymousClass1() {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final C9hr<Object> invoke() {
                return C9iL.A01("com.facebook.aura.navigation.key.ConfidentialVmSwitchEntryPoint", ConfidentialVmSwitchEntryPoint.values());
            }
        }

        private final /* synthetic */ C9hr get$cachedSerializer() {
            return AnonymousClass001.A12(ConfidentialVmSwitchEntryPoint.$cachedSerializer$delegate);
        }

        public final C9hr<ConfidentialVmSwitchEntryPoint> serializer() {
            return AnonymousClass001.A12(ConfidentialVmSwitchEntryPoint.$cachedSerializer$delegate);
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    static {
        ConfidentialVmSwitchEntryPoint confidentialVmSwitchEntryPoint = new ConfidentialVmSwitchEntryPoint("SETTINGS", 0, "settings");
        SETTINGS = confidentialVmSwitchEntryPoint;
        ConfidentialVmSwitchEntryPoint confidentialVmSwitchEntryPoint2 = new ConfidentialVmSwitchEntryPoint("CHAT_CARD", 1, "chat_card");
        CHAT_CARD = confidentialVmSwitchEntryPoint2;
        ConfidentialVmSwitchEntryPoint confidentialVmSwitchEntryPoint3 = new ConfidentialVmSwitchEntryPoint("OFF_WAITLIST_PUSH", 2, "off_waitlist_push");
        OFF_WAITLIST_PUSH = confidentialVmSwitchEntryPoint3;
        ConfidentialVmSwitchEntryPoint confidentialVmSwitchEntryPoint4 = new ConfidentialVmSwitchEntryPoint("DEEPLINK", 3, "deeplink");
        DEEPLINK = confidentialVmSwitchEntryPoint4;
        ConfidentialVmSwitchEntryPoint confidentialVmSwitchEntryPoint5 = new ConfidentialVmSwitchEntryPoint("SUBSCRIPTION_ENDED", 4, "subscription_ended");
        SUBSCRIPTION_ENDED = confidentialVmSwitchEntryPoint5;
        ConfidentialVmSwitchEntryPoint[] confidentialVmSwitchEntryPointArr = {confidentialVmSwitchEntryPoint, confidentialVmSwitchEntryPoint2, confidentialVmSwitchEntryPoint3, confidentialVmSwitchEntryPoint4, confidentialVmSwitchEntryPoint5};
        $VALUES = confidentialVmSwitchEntryPointArr;
        $ENTRIES = new F3w(confidentialVmSwitchEntryPointArr);
        Companion = new Companion();
        $cachedSerializer$delegate = AbstractC5321DgF.A02(C79.A01, Companion.AnonymousClass1.INSTANCE);
    }

    public static Ey9<ConfidentialVmSwitchEntryPoint> getEntries() {
        return $ENTRIES;
    }

    public static ConfidentialVmSwitchEntryPoint valueOf(String str) {
        return (ConfidentialVmSwitchEntryPoint) Enum.valueOf(ConfidentialVmSwitchEntryPoint.class, str);
    }

    public static ConfidentialVmSwitchEntryPoint[] values() {
        return (ConfidentialVmSwitchEntryPoint[]) $VALUES.clone();
    }

    public final String getAnalyticsValue() {
        return this.analyticsValue;
    }

    public ConfidentialVmSwitchEntryPoint(String str, int i, String str2) {
        this.analyticsValue = str2;
    }
}
