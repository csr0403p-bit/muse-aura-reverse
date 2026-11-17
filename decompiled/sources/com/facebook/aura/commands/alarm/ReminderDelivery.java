package com.facebook.aura.commands.alarm;

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
import kotlin.jvm.functions.Function0;
import kotlinx.serialization.Serializable;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Serializable
/* loaded from: classes3.dex */
public final class ReminderDelivery {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ ReminderDelivery[] $VALUES;
    public static final F0C<C9hr<Object>> $cachedSerializer$delegate;
    public static final ReminderDelivery CALENDAR;
    public static final Companion Companion;
    public static final ReminderDelivery IN_APP;
    public final String wireName;

    public final class Companion {

        /* renamed from: com.facebook.aura.commands.alarm.ReminderDelivery$Companion$1, reason: invalid class name */
        public final class AnonymousClass1 extends AbstractC7559F3s implements Function0<C9hr<Object>> {
            public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

            public AnonymousClass1() {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final C9hr<Object> invoke() {
                return C9iL.A01("com.facebook.aura.commands.alarm.ReminderDelivery", ReminderDelivery.values());
            }
        }

        private final /* synthetic */ C9hr get$cachedSerializer() {
            return AnonymousClass001.A12(ReminderDelivery.$cachedSerializer$delegate);
        }

        public final C9hr<ReminderDelivery> serializer() {
            return AnonymousClass001.A12(ReminderDelivery.$cachedSerializer$delegate);
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    static {
        ReminderDelivery reminderDelivery = new ReminderDelivery("IN_APP", 0, "in_app");
        IN_APP = reminderDelivery;
        ReminderDelivery reminderDelivery2 = new ReminderDelivery("CALENDAR", 1, "calendar");
        CALENDAR = reminderDelivery2;
        ReminderDelivery[] reminderDeliveryArr = {reminderDelivery, reminderDelivery2};
        $VALUES = reminderDeliveryArr;
        $ENTRIES = C3cG.A0w(reminderDeliveryArr);
        Companion = new Companion();
        $cachedSerializer$delegate = AbstractC5321DgF.A02(C79.A01, Companion.AnonymousClass1.INSTANCE);
    }

    public static Ey9<ReminderDelivery> getEntries() {
        return $ENTRIES;
    }

    public static ReminderDelivery valueOf(String str) {
        return (ReminderDelivery) Enum.valueOf(ReminderDelivery.class, str);
    }

    public static ReminderDelivery[] values() {
        return (ReminderDelivery[]) $VALUES.clone();
    }

    public final String getWireName() {
        return this.wireName;
    }

    public ReminderDelivery(String str, int i, String str2) {
        this.wireName = str2;
    }
}
