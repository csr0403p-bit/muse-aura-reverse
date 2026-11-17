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
public final class ComplimentaryRedeemEntryPoint {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ ComplimentaryRedeemEntryPoint[] $VALUES;
    public static final F0C<C9hr<Object>> $cachedSerializer$delegate;
    public static final ComplimentaryRedeemEntryPoint CHAT_CARD;
    public static final Companion Companion;
    public static final ComplimentaryRedeemEntryPoint SETTINGS;
    public static final ComplimentaryRedeemEntryPoint SUBSCRIPTION_MANAGEMENT;
    public static final ComplimentaryRedeemEntryPoint SUBSCRIPTION_PAYWALL;
    public final String value;

    public final class Companion {

        /* renamed from: com.facebook.aura.navigation.key.ComplimentaryRedeemEntryPoint$Companion$1, reason: invalid class name */
        public final class AnonymousClass1 extends AbstractC7559F3s implements Function0<C9hr<Object>> {
            public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

            public AnonymousClass1() {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final C9hr<Object> invoke() {
                return C9iL.A01("com.facebook.aura.navigation.key.ComplimentaryRedeemEntryPoint", ComplimentaryRedeemEntryPoint.values());
            }
        }

        private final /* synthetic */ C9hr get$cachedSerializer() {
            return AnonymousClass001.A12(ComplimentaryRedeemEntryPoint.$cachedSerializer$delegate);
        }

        public final C9hr<ComplimentaryRedeemEntryPoint> serializer() {
            return AnonymousClass001.A12(ComplimentaryRedeemEntryPoint.$cachedSerializer$delegate);
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    static {
        ComplimentaryRedeemEntryPoint complimentaryRedeemEntryPoint = new ComplimentaryRedeemEntryPoint("SETTINGS", 0, "settings");
        SETTINGS = complimentaryRedeemEntryPoint;
        ComplimentaryRedeemEntryPoint complimentaryRedeemEntryPoint2 = new ComplimentaryRedeemEntryPoint("SUBSCRIPTION_MANAGEMENT", 1, "subscription_management");
        SUBSCRIPTION_MANAGEMENT = complimentaryRedeemEntryPoint2;
        ComplimentaryRedeemEntryPoint complimentaryRedeemEntryPoint3 = new ComplimentaryRedeemEntryPoint("CHAT_CARD", 2, "chat_card");
        CHAT_CARD = complimentaryRedeemEntryPoint3;
        ComplimentaryRedeemEntryPoint complimentaryRedeemEntryPoint4 = new ComplimentaryRedeemEntryPoint("SUBSCRIPTION_PAYWALL", 3, "subscription_paywall");
        SUBSCRIPTION_PAYWALL = complimentaryRedeemEntryPoint4;
        ComplimentaryRedeemEntryPoint[] complimentaryRedeemEntryPointArr = {complimentaryRedeemEntryPoint, complimentaryRedeemEntryPoint2, complimentaryRedeemEntryPoint3, complimentaryRedeemEntryPoint4};
        $VALUES = complimentaryRedeemEntryPointArr;
        $ENTRIES = new F3w(complimentaryRedeemEntryPointArr);
        Companion = new Companion();
        $cachedSerializer$delegate = AbstractC5321DgF.A02(C79.A01, Companion.AnonymousClass1.INSTANCE);
    }

    public static Ey9<ComplimentaryRedeemEntryPoint> getEntries() {
        return $ENTRIES;
    }

    public static ComplimentaryRedeemEntryPoint valueOf(String str) {
        return (ComplimentaryRedeemEntryPoint) Enum.valueOf(ComplimentaryRedeemEntryPoint.class, str);
    }

    public static ComplimentaryRedeemEntryPoint[] values() {
        return (ComplimentaryRedeemEntryPoint[]) $VALUES.clone();
    }

    public final String getValue() {
        return this.value;
    }

    public ComplimentaryRedeemEntryPoint(String str, int i, String str2) {
        this.value = str2;
    }
}
