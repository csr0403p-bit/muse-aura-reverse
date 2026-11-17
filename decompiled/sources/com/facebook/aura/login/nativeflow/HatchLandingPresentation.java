package com.facebook.aura.login.nativeflow;

import X.C06H;
import X.C3cG;
import X.C7384Etj;
import X.Ey9;
import com.facebook.aura.confidentialvm.vmswitch.ConfidentialVmMigrationDoneRepository;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class HatchLandingPresentation {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ HatchLandingPresentation[] $VALUES;
    public static final Companion Companion;
    public static final Set<HatchLandingPresentation> DRAWN;
    public static final HatchLandingPresentation NEUTRAL;
    public static final HatchLandingPresentation STANDARD;
    public final String wireValue;

    static {
        HatchLandingPresentation hatchLandingPresentation = new HatchLandingPresentation("STANDARD", 0, ConfidentialVmMigrationDoneRepository.MODE_STANDARD);
        STANDARD = hatchLandingPresentation;
        HatchLandingPresentation hatchLandingPresentation2 = new HatchLandingPresentation("NEUTRAL", 1, "neutral");
        NEUTRAL = hatchLandingPresentation2;
        HatchLandingPresentation[] hatchLandingPresentationArr = {hatchLandingPresentation, hatchLandingPresentation2};
        $VALUES = hatchLandingPresentationArr;
        $ENTRIES = C3cG.A0w(hatchLandingPresentationArr);
        Companion = new Companion();
        DRAWN = Collections.singleton(hatchLandingPresentation2);
    }

    public final class Companion {
        public final HatchLandingPresentation fromWire(String str) {
            HatchLandingPresentation next;
            C7384Etj.A0Y(str, 0);
            Iterator<HatchLandingPresentation> it = HatchLandingPresentation.getEntries().iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (str.equals(next.getWireValue())) {
                    break;
                }
            }
            HatchLandingPresentation hatchLandingPresentation = next;
            return hatchLandingPresentation == null ? HatchLandingPresentation.STANDARD : hatchLandingPresentation;
        }

        public final Set<HatchLandingPresentation> getDRAWN() {
            return HatchLandingPresentation.DRAWN;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static Ey9<HatchLandingPresentation> getEntries() {
        return $ENTRIES;
    }

    public static HatchLandingPresentation valueOf(String str) {
        return (HatchLandingPresentation) Enum.valueOf(HatchLandingPresentation.class, str);
    }

    public static HatchLandingPresentation[] values() {
        return (HatchLandingPresentation[]) $VALUES.clone();
    }

    public final String getWireValue() {
        return this.wireValue;
    }

    public HatchLandingPresentation(String str, int i, String str2) {
        this.wireValue = str2;
    }
}
