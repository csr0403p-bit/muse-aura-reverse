package com.facebook.aura.status.view;

import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass006;
import X.C60Q;
import com.facebook.aura.status.viewmodel.HatchPillState;
import kotlin.NoWhenBranchMatchedException;

/* loaded from: classes.dex */
public abstract class HatchStatusPillUtilsKt {
    public static final boolean isGatewayConnected(HatchPillState hatchPillState) {
        switch (AnonymousClass001.A0E(hatchPillState, 0)) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 10:
            case 11:
                return false;
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            default:
                return true;
        }
    }

    /* loaded from: classes4.dex */
    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[HatchPillState.values().length];
            try {
                AnonymousClass002.A13(HatchPillState.DISCONNECTED, iArr);
            } catch (NoSuchFieldError unused) {
            }
            try {
                AnonymousClass002.A14(HatchPillState.CONNECTING, iArr);
            } catch (NoSuchFieldError unused2) {
            }
            try {
                AnonymousClass002.A15(HatchPillState.WAKING_UP, iArr);
            } catch (NoSuchFieldError unused3) {
            }
            try {
                AnonymousClass002.A16(HatchPillState.CONNECTION_ERROR, iArr);
            } catch (NoSuchFieldError unused4) {
            }
            try {
                AnonymousClass002.A17(HatchPillState.RESETTING, iArr);
            } catch (NoSuchFieldError unused5) {
            }
            try {
                AnonymousClass002.A18(HatchPillState.PAUSED, iArr);
            } catch (NoSuchFieldError unused6) {
            }
            try {
                AnonymousClass006.A1G(HatchPillState.IDLE, iArr);
            } catch (NoSuchFieldError unused7) {
            }
            try {
                AnonymousClass006.A1H(HatchPillState.THINKING, iArr);
            } catch (NoSuchFieldError unused8) {
            }
            try {
                AnonymousClass006.A1I(HatchPillState.TYPING, iArr);
            } catch (NoSuchFieldError unused9) {
            }
            try {
                AnonymousClass006.A1J(HatchPillState.USING_TOOL, iArr);
            } catch (NoSuchFieldError unused10) {
            }
            try {
                AnonymousClass006.A1K(HatchPillState.WAITING_FOR_SUBAGENTS, iArr);
            } catch (NoSuchFieldError unused11) {
            }
            try {
                AnonymousClass006.A1L(HatchPillState.MAKING_SOMETHING, iArr);
            } catch (NoSuchFieldError unused12) {
            }
            try {
                C60Q.A1C(HatchPillState.NEEDS_APPROVAL, iArr);
            } catch (NoSuchFieldError unused13) {
            }
            try {
                C60Q.A1D(HatchPillState.OUT_OF_CREDITS, iArr);
            } catch (NoSuchFieldError unused14) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final String pillIconTestTag(HatchPillState hatchPillState) {
        switch (AnonymousClass003.A0L(hatchPillState)) {
            case 0:
                return "connection-status-icon-disconnected";
            case 1:
            case 2:
                return "connection-status-icon-connecting";
            case 3:
                return "connection-status-icon-error";
            case 4:
                return "connection-status-icon-connected";
            case 5:
                return "connection-status-icon-thinking";
            case 6:
                return "connection-status-icon-using-tool";
            case 7:
                return "connection-status-icon-waiting";
            case 8:
                return "connection-status-icon-making";
            case 9:
                return "connection-status-icon-typing";
            case 10:
                return "connection-status-icon-resetting";
            case 11:
                return "connection-status-icon-paused";
            case 12:
                return "connection-status-icon-needs-approval";
            case 13:
                return "connection-status-icon-out-of-credits";
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
