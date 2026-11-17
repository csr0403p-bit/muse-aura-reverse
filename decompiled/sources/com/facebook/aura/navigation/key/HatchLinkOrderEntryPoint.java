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
import com.facebook.aura.settings.internal.ondemand.InternalSettingsModule;
import kotlin.jvm.functions.Function0;
import kotlinx.serialization.Serializable;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Serializable
/* loaded from: classes.dex */
public final class HatchLinkOrderEntryPoint {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ HatchLinkOrderEntryPoint[] $VALUES;
    public static final F0C<C9hr<Object>> $cachedSerializer$delegate;
    public static final HatchLinkOrderEntryPoint AGENT;
    public static final Companion Companion;
    public static final HatchLinkOrderEntryPoint DEEPLINK;
    public static final HatchLinkOrderEntryPoint INTERNAL_SETTINGS;
    public static final HatchLinkOrderEntryPoint MANAGE_SUBSCRIPTION;
    public static final HatchLinkOrderEntryPoint POST_PURCHASE;
    public static final HatchLinkOrderEntryPoint SETTINGS_DEVICES;
    public static final HatchLinkOrderEntryPoint UNIVERSAL_LINK;
    public final String logValue;

    public final class Companion {

        /* renamed from: com.facebook.aura.navigation.key.HatchLinkOrderEntryPoint$Companion$1, reason: invalid class name */
        public final class AnonymousClass1 extends AbstractC7559F3s implements Function0<C9hr<Object>> {
            public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

            public AnonymousClass1() {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final C9hr<Object> invoke() {
                return C9iL.A01("com.facebook.aura.navigation.key.HatchLinkOrderEntryPoint", HatchLinkOrderEntryPoint.values());
            }
        }

        private final /* synthetic */ C9hr get$cachedSerializer() {
            return AnonymousClass001.A12(HatchLinkOrderEntryPoint.$cachedSerializer$delegate);
        }

        public final C9hr<HatchLinkOrderEntryPoint> serializer() {
            return AnonymousClass001.A12(HatchLinkOrderEntryPoint.$cachedSerializer$delegate);
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    static {
        HatchLinkOrderEntryPoint hatchLinkOrderEntryPoint = new HatchLinkOrderEntryPoint("DEEPLINK", 0, "deeplink");
        DEEPLINK = hatchLinkOrderEntryPoint;
        HatchLinkOrderEntryPoint hatchLinkOrderEntryPoint2 = new HatchLinkOrderEntryPoint("UNIVERSAL_LINK", 1, "universal_link");
        UNIVERSAL_LINK = hatchLinkOrderEntryPoint2;
        HatchLinkOrderEntryPoint hatchLinkOrderEntryPoint3 = new HatchLinkOrderEntryPoint("AGENT", 2, "agent");
        AGENT = hatchLinkOrderEntryPoint3;
        HatchLinkOrderEntryPoint hatchLinkOrderEntryPoint4 = new HatchLinkOrderEntryPoint("INTERNAL_SETTINGS", 3, InternalSettingsModule.MODULE_NAME);
        INTERNAL_SETTINGS = hatchLinkOrderEntryPoint4;
        HatchLinkOrderEntryPoint hatchLinkOrderEntryPoint5 = new HatchLinkOrderEntryPoint("SETTINGS_DEVICES", 4, "settings_devices");
        SETTINGS_DEVICES = hatchLinkOrderEntryPoint5;
        HatchLinkOrderEntryPoint hatchLinkOrderEntryPoint6 = new HatchLinkOrderEntryPoint("MANAGE_SUBSCRIPTION", 5, "manage_subscription");
        MANAGE_SUBSCRIPTION = hatchLinkOrderEntryPoint6;
        HatchLinkOrderEntryPoint hatchLinkOrderEntryPoint7 = new HatchLinkOrderEntryPoint("POST_PURCHASE", 6, "post_purchase");
        POST_PURCHASE = hatchLinkOrderEntryPoint7;
        HatchLinkOrderEntryPoint[] hatchLinkOrderEntryPointArr = {hatchLinkOrderEntryPoint, hatchLinkOrderEntryPoint2, hatchLinkOrderEntryPoint3, hatchLinkOrderEntryPoint4, hatchLinkOrderEntryPoint5, hatchLinkOrderEntryPoint6, hatchLinkOrderEntryPoint7};
        $VALUES = hatchLinkOrderEntryPointArr;
        $ENTRIES = new F3w(hatchLinkOrderEntryPointArr);
        Companion = new Companion();
        $cachedSerializer$delegate = AbstractC5321DgF.A02(C79.A01, Companion.AnonymousClass1.INSTANCE);
    }

    public static Ey9<HatchLinkOrderEntryPoint> getEntries() {
        return $ENTRIES;
    }

    public static HatchLinkOrderEntryPoint valueOf(String str) {
        return (HatchLinkOrderEntryPoint) Enum.valueOf(HatchLinkOrderEntryPoint.class, str);
    }

    public static HatchLinkOrderEntryPoint[] values() {
        return (HatchLinkOrderEntryPoint[]) $VALUES.clone();
    }

    public final String getLogValue() {
        return this.logValue;
    }

    public HatchLinkOrderEntryPoint(String str, int i, String str2) {
        this.logValue = str2;
    }
}
