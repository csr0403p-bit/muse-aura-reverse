package com.facebook.aura.model;

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
/* loaded from: classes4.dex */
public final class HatchBlockStatus {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ HatchBlockStatus[] $VALUES;
    public static final F0C<C9hr<Object>> $cachedSerializer$delegate;
    public static final Companion Companion;
    public static final HatchBlockStatus DONE;
    public static final HatchBlockStatus STREAMING;

    public final class Companion {

        /* renamed from: com.facebook.aura.model.HatchBlockStatus$Companion$1, reason: invalid class name */
        public final class AnonymousClass1 extends AbstractC7559F3s implements Function0<C9hr<Object>> {
            public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

            public AnonymousClass1() {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final C9hr<Object> invoke() {
                return C9iL.A01("com.facebook.aura.model.HatchBlockStatus", HatchBlockStatus.values());
            }
        }

        private final /* synthetic */ C9hr get$cachedSerializer() {
            return AnonymousClass001.A12(HatchBlockStatus.$cachedSerializer$delegate);
        }

        public final C9hr<HatchBlockStatus> serializer() {
            return AnonymousClass001.A12(HatchBlockStatus.$cachedSerializer$delegate);
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    static {
        HatchBlockStatus hatchBlockStatus = new HatchBlockStatus("STREAMING", 0);
        STREAMING = hatchBlockStatus;
        HatchBlockStatus hatchBlockStatus2 = new HatchBlockStatus("DONE", 1);
        DONE = hatchBlockStatus2;
        HatchBlockStatus[] hatchBlockStatusArr = {hatchBlockStatus, hatchBlockStatus2};
        $VALUES = hatchBlockStatusArr;
        $ENTRIES = C3cG.A0w(hatchBlockStatusArr);
        Companion = new Companion();
        $cachedSerializer$delegate = AbstractC5321DgF.A02(C79.A01, Companion.AnonymousClass1.INSTANCE);
    }

    public static Ey9<HatchBlockStatus> getEntries() {
        return $ENTRIES;
    }

    public static HatchBlockStatus valueOf(String str) {
        return (HatchBlockStatus) Enum.valueOf(HatchBlockStatus.class, str);
    }

    public static HatchBlockStatus[] values() {
        return (HatchBlockStatus[]) $VALUES.clone();
    }

    public HatchBlockStatus(String str, int i) {
    }
}
