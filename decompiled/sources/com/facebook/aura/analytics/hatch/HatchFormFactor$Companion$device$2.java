package com.facebook.aura.analytics.hatch;

import X.AbstractC7559F3s;
import X.AnonymousClass002;
import X.C3cG;
import X.C4JM;
import com.facebook.aura.ui.adaptive.AuraDevice;
import com.facebook.aura.ui.adaptive.AuraDeviceType;
import kotlin.jvm.functions.Function0;

/* loaded from: classes5.dex */
public final class HatchFormFactor$Companion$device$2 extends AbstractC7559F3s implements Function0<HatchFormFactor> {
    public static final HatchFormFactor$Companion$device$2 INSTANCE = new HatchFormFactor$Companion$device$2();

    public HatchFormFactor$Companion$device$2() {
        super(0);
    }

    /* loaded from: classes4.dex */
    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AuraDeviceType.values().length];
            try {
                AnonymousClass002.A13(AuraDeviceType.Phone, iArr);
            } catch (NoSuchFieldError unused) {
            }
            try {
                AnonymousClass002.A14(AuraDeviceType.Foldable, iArr);
            } catch (NoSuchFieldError unused2) {
            }
            try {
                AnonymousClass002.A15(AuraDeviceType.Tablet, iArr);
            } catch (NoSuchFieldError unused3) {
            }
            try {
                AnonymousClass002.A16(AuraDeviceType.Watch, iArr);
            } catch (NoSuchFieldError unused4) {
            }
            try {
                AnonymousClass002.A17(AuraDeviceType.Automotive, iArr);
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final HatchFormFactor invoke() {
        int iOrdinal = AuraDevice.INSTANCE.type(C4JM.A00()).ordinal();
        if (iOrdinal == 0) {
            return HatchFormFactor.PHONE;
        }
        if (iOrdinal == 1) {
            return HatchFormFactor.FOLDABLE;
        }
        if (iOrdinal == 2) {
            return HatchFormFactor.TABLET;
        }
        if (iOrdinal == 3) {
            return HatchFormFactor.WATCH;
        }
        if (iOrdinal == 4) {
            return HatchFormFactor.CAR;
        }
        throw C3cG.A0q();
    }
}
