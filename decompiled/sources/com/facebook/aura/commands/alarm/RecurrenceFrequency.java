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
public final class RecurrenceFrequency {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ RecurrenceFrequency[] $VALUES;
    public static final F0C<C9hr<Object>> $cachedSerializer$delegate;
    public static final Companion Companion;
    public static final RecurrenceFrequency DAILY;
    public static final RecurrenceFrequency MONTHLY;
    public static final RecurrenceFrequency WEEKLY;
    public static final RecurrenceFrequency YEARLY;

    public final class Companion {

        /* renamed from: com.facebook.aura.commands.alarm.RecurrenceFrequency$Companion$1, reason: invalid class name */
        public final class AnonymousClass1 extends AbstractC7559F3s implements Function0<C9hr<Object>> {
            public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

            public AnonymousClass1() {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final C9hr<Object> invoke() {
                return C9iL.A01("com.facebook.aura.commands.alarm.RecurrenceFrequency", RecurrenceFrequency.values());
            }
        }

        private final /* synthetic */ C9hr get$cachedSerializer() {
            return AnonymousClass001.A12(RecurrenceFrequency.$cachedSerializer$delegate);
        }

        public final C9hr<RecurrenceFrequency> serializer() {
            return AnonymousClass001.A12(RecurrenceFrequency.$cachedSerializer$delegate);
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    static {
        RecurrenceFrequency recurrenceFrequency = new RecurrenceFrequency("DAILY", 0);
        DAILY = recurrenceFrequency;
        RecurrenceFrequency recurrenceFrequency2 = new RecurrenceFrequency("WEEKLY", 1);
        WEEKLY = recurrenceFrequency2;
        RecurrenceFrequency recurrenceFrequency3 = new RecurrenceFrequency("MONTHLY", 2);
        MONTHLY = recurrenceFrequency3;
        RecurrenceFrequency recurrenceFrequency4 = new RecurrenceFrequency("YEARLY", 3);
        YEARLY = recurrenceFrequency4;
        RecurrenceFrequency[] recurrenceFrequencyArr = {recurrenceFrequency, recurrenceFrequency2, recurrenceFrequency3, recurrenceFrequency4};
        $VALUES = recurrenceFrequencyArr;
        $ENTRIES = C3cG.A0w(recurrenceFrequencyArr);
        Companion = new Companion();
        $cachedSerializer$delegate = AbstractC5321DgF.A02(C79.A01, Companion.AnonymousClass1.INSTANCE);
    }

    public static Ey9<RecurrenceFrequency> getEntries() {
        return $ENTRIES;
    }

    public static RecurrenceFrequency valueOf(String str) {
        return (RecurrenceFrequency) Enum.valueOf(RecurrenceFrequency.class, str);
    }

    public static RecurrenceFrequency[] values() {
        return (RecurrenceFrequency[]) $VALUES.clone();
    }

    public RecurrenceFrequency(String str, int i) {
    }
}
