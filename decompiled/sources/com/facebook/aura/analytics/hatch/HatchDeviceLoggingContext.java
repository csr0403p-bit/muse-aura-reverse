package com.facebook.aura.analytics.hatch;

import X.AbstractC5321DgF;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.C4JM;
import X.F0C;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final class HatchDeviceLoggingContext {
    public static final int $stable = 0;
    public static final HatchDeviceLoggingContext INSTANCE = new HatchDeviceLoggingContext();
    public static final F0C isWatch$delegate = AbstractC5321DgF.A03(AnonymousClass2.INSTANCE);

    /* renamed from: com.facebook.aura.analytics.hatch.HatchDeviceLoggingContext$isWatch$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements Function0<Boolean> {
        public static final AnonymousClass2 INSTANCE = new AnonymousClass2();

        public AnonymousClass2() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            return Boolean.valueOf(C4JM.A00().getPackageManager().hasSystemFeature("android.hardware.type.watch"));
        }
    }

    public final boolean isWatch() {
        return AnonymousClass001.A1X(isWatch$delegate.getValue());
    }
}
