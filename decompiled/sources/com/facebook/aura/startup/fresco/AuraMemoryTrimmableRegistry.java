package com.facebook.aura.startup.fresco;

import X.AnonymousClass001;
import X.AnonymousClass002;
import X.C3cG;
import X.C7384Etj;
import X.EC1;
import X.ECR;
import X.ECU;
import com.facebook.aura.memory.AuraMemoryPressure;
import com.facebook.aura.memory.AuraMemoryPressureLevel;
import com.facebook.aura.memory.AuraTrimmable;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes5.dex */
public final class AuraMemoryTrimmableRegistry implements EC1, AuraTrimmable {
    public static final AuraMemoryTrimmableRegistry INSTANCE;
    public static final CopyOnWriteArrayList<ECU> trimmables;

    @Override // com.facebook.aura.memory.AuraTrimmable
    public void onMemoryPressure(AuraMemoryPressureLevel auraMemoryPressureLevel) {
        ECR ecr;
        int iA0E = AnonymousClass001.A0E(auraMemoryPressureLevel, 0);
        if (iA0E == 0) {
            ecr = ECR.A02;
        } else if (iA0E == 1) {
            ecr = ECR.A01;
        } else if (iA0E == 2) {
            ecr = ECR.A04;
        } else {
            if (iA0E != 3) {
                throw C3cG.A0q();
            }
            ecr = ECR.A05;
        }
        Iterator<ECU> it = trimmables.iterator();
        while (it.hasNext()) {
            it.next().AhS(ecr);
        }
    }

    @Override // X.EC1
    public void registerMemoryTrimmable(ECU ecu) {
        C7384Etj.A0Y(ecu, 0);
        trimmables.addIfAbsent(ecu);
    }

    public void unregisterMemoryTrimmable(ECU ecu) {
        C7384Etj.A0Y(ecu, 0);
        trimmables.remove(ecu);
    }

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AuraMemoryPressureLevel.values().length];
            try {
                AnonymousClass002.A13(AuraMemoryPressureLevel.MODERATE, iArr);
            } catch (NoSuchFieldError unused) {
            }
            try {
                AnonymousClass002.A14(AuraMemoryPressureLevel.BACKGROUNDED, iArr);
            } catch (NoSuchFieldError unused2) {
            }
            try {
                AnonymousClass002.A15(AuraMemoryPressureLevel.LOW, iArr);
            } catch (NoSuchFieldError unused3) {
            }
            try {
                AnonymousClass002.A16(AuraMemoryPressureLevel.CRITICAL, iArr);
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    static {
        AuraMemoryTrimmableRegistry auraMemoryTrimmableRegistry = new AuraMemoryTrimmableRegistry();
        INSTANCE = auraMemoryTrimmableRegistry;
        trimmables = new CopyOnWriteArrayList<>();
        AuraMemoryPressure.INSTANCE.register(auraMemoryTrimmableRegistry);
    }
}
