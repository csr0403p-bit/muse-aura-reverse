package com.facebook.aura.login.nativeflow;

import X.C06H;
import X.C3cG;
import X.C7384Etj;
import X.Ey9;
import com.facebook.aura.qpl.startup.points.HatchStartupPoints;
import java.util.Iterator;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class HatchAuthFlow {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ HatchAuthFlow[] $VALUES;
    public static final Companion Companion;
    public static final HatchAuthFlow Login;
    public static final HatchAuthFlow Register;
    public final String wireValue;

    static {
        HatchAuthFlow hatchAuthFlow = new HatchAuthFlow("Login", 0, HatchStartupPoints.SURFACE_LOGIN);
        Login = hatchAuthFlow;
        HatchAuthFlow hatchAuthFlow2 = new HatchAuthFlow("Register", 1, "register");
        Register = hatchAuthFlow2;
        HatchAuthFlow[] hatchAuthFlowArr = {hatchAuthFlow, hatchAuthFlow2};
        $VALUES = hatchAuthFlowArr;
        $ENTRIES = C3cG.A0w(hatchAuthFlowArr);
        Companion = new Companion();
    }

    public final class Companion {
        public final HatchAuthFlow fromWire(String str) {
            HatchAuthFlow next;
            Iterator<HatchAuthFlow> it = HatchAuthFlow.getEntries().iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (C7384Etj.areEqual(next.getWireValue(), str)) {
                    break;
                }
            }
            return next;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static Ey9<HatchAuthFlow> getEntries() {
        return $ENTRIES;
    }

    public static HatchAuthFlow valueOf(String str) {
        return (HatchAuthFlow) Enum.valueOf(HatchAuthFlow.class, str);
    }

    public static HatchAuthFlow[] values() {
        return (HatchAuthFlow[]) $VALUES.clone();
    }

    public final String getWireValue() {
        return this.wireValue;
    }

    public HatchAuthFlow(String str, int i, String str2) {
        this.wireValue = str2;
    }
}
