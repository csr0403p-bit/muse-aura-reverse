package com.facebook.aura.ccv.nativeflow;

import X.C06H;
import X.C3cG;
import X.C7384Etj;
import X.Ey9;
import com.facebook.aura.pairs.PairsPendingLevelStoreKt;
import java.util.Iterator;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class HatchLinkingNextAction {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ HatchLinkingNextAction[] $VALUES;
    public static final HatchLinkingNextAction BLOCKED;
    public static final HatchLinkingNextAction CONTINUE;
    public static final Companion Companion;
    public static final HatchLinkingNextAction PENDING;
    public static final HatchLinkingNextAction RESTART_LINKING;
    public static final HatchLinkingNextAction USE_CREDIT_CARD;
    public final String wireValue;

    static {
        HatchLinkingNextAction hatchLinkingNextAction = new HatchLinkingNextAction(HatchCheckoutClientKt.CHECKOUT_STATUS_PENDING, 0, PairsPendingLevelStoreKt.STATE_PENDING);
        PENDING = hatchLinkingNextAction;
        HatchLinkingNextAction hatchLinkingNextAction2 = new HatchLinkingNextAction("CONTINUE", 1, "continue");
        CONTINUE = hatchLinkingNextAction2;
        HatchLinkingNextAction hatchLinkingNextAction3 = new HatchLinkingNextAction("BLOCKED", 2, "blocked");
        BLOCKED = hatchLinkingNextAction3;
        HatchLinkingNextAction hatchLinkingNextAction4 = new HatchLinkingNextAction("USE_CREDIT_CARD", 3, "use_credit_card");
        USE_CREDIT_CARD = hatchLinkingNextAction4;
        HatchLinkingNextAction hatchLinkingNextAction5 = new HatchLinkingNextAction("RESTART_LINKING", 4, "restart_linking");
        RESTART_LINKING = hatchLinkingNextAction5;
        HatchLinkingNextAction[] hatchLinkingNextActionArr = {hatchLinkingNextAction, hatchLinkingNextAction2, hatchLinkingNextAction3, hatchLinkingNextAction4, hatchLinkingNextAction5};
        $VALUES = hatchLinkingNextActionArr;
        $ENTRIES = C3cG.A0w(hatchLinkingNextActionArr);
        Companion = new Companion();
    }

    public static Ey9<HatchLinkingNextAction> getEntries() {
        return $ENTRIES;
    }

    public static HatchLinkingNextAction valueOf(String str) {
        return (HatchLinkingNextAction) Enum.valueOf(HatchLinkingNextAction.class, str);
    }

    public static HatchLinkingNextAction[] values() {
        return (HatchLinkingNextAction[]) $VALUES.clone();
    }

    public final String getWireValue() {
        return this.wireValue;
    }

    public final class Companion {
        public final HatchLinkingNextAction fromWire(String str) {
            HatchLinkingNextAction next;
            C7384Etj.A0Y(str, 0);
            Iterator<HatchLinkingNextAction> it = HatchLinkingNextAction.getEntries().iterator();
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
            return next;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public HatchLinkingNextAction(String str, int i, String str2) {
        this.wireValue = str2;
    }
}
