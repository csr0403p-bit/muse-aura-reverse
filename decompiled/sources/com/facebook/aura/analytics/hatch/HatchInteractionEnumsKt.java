package com.facebook.aura.analytics.hatch;

import X.AGH;
import X.AIW;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass006;
import X.C0924AIa;
import X.C7384Etj;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;

/* loaded from: classes.dex */
public abstract class HatchInteractionEnumsKt {
    public static final String HATCH_METADATA_UNKNOWN = "unknown";

    public static final Map<String, String> chatThreadLogMetadata(boolean z, String str, Boolean bool, Map<String, String> map) {
        C7384Etj.A0Y(map, 3);
        C0924AIa c0924AIa = new C0924AIa();
        AnonymousClass003.A0s(HatchMetadataKey.IS_PRIMARY_THREAD, c0924AIa, z);
        if (str != null) {
            AnonymousClass001.A1C(HatchMetadataKey.THREAD_ID, str, c0924AIa);
        }
        if (bool != null) {
            AnonymousClass003.A0s(HatchMetadataKey.IS_ARCHIVED, c0924AIa, bool.booleanValue());
        }
        c0924AIa.putAll(map);
        return AIW.A0K(c0924AIa);
    }

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[HatchComposerEntryPoint.values().length];
            try {
                AnonymousClass002.A13(HatchComposerEntryPoint.FEED_CARD, iArr);
            } catch (NoSuchFieldError unused) {
            }
            try {
                AnonymousClass002.A14(HatchComposerEntryPoint.NEW_GOAL, iArr);
            } catch (NoSuchFieldError unused2) {
            }
            try {
                AnonymousClass002.A15(HatchComposerEntryPoint.GOAL_SUBGOAL, iArr);
            } catch (NoSuchFieldError unused3) {
            }
            try {
                AnonymousClass002.A16(HatchComposerEntryPoint.GOAL_DISCUSS, iArr);
            } catch (NoSuchFieldError unused4) {
            }
            try {
                AnonymousClass002.A17(HatchComposerEntryPoint.NONE, iArr);
            } catch (NoSuchFieldError unused5) {
            }
            try {
                AnonymousClass002.A18(HatchComposerEntryPoint.CREATE_SPACE, iArr);
            } catch (NoSuchFieldError unused6) {
            }
            try {
                AnonymousClass006.A1G(HatchComposerEntryPoint.CONNECTED_APPS, iArr);
            } catch (NoSuchFieldError unused7) {
            }
            try {
                AnonymousClass006.A1H(HatchComposerEntryPoint.SHARE_INTENT, iArr);
            } catch (NoSuchFieldError unused8) {
            }
            try {
                AnonymousClass006.A1I(HatchComposerEntryPoint.PROCESS_TEXT, iArr);
            } catch (NoSuchFieldError unused9) {
            }
            try {
                AnonymousClass006.A1J(HatchComposerEntryPoint.ASSIST, iArr);
            } catch (NoSuchFieldError unused10) {
            }
            try {
                AnonymousClass006.A1K(HatchComposerEntryPoint.FLOCK_FEED_CARD, iArr);
            } catch (NoSuchFieldError unused11) {
            }
            try {
                AnonymousClass006.A1L(HatchComposerEntryPoint.DEEP_LINK, iArr);
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[HatchComposerEntryPoint.CARD_AUTO_SEND.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final HatchScreen chatScreen(boolean z) {
        return z ? HatchScreen.MAIN_CHAT : HatchScreen.SUBTHREAD;
    }

    public static /* synthetic */ Map chatThreadLogMetadata$default(boolean z, String str, Boolean bool, Map map, int i, Object obj) {
        if ((i & 4) != 0) {
            bool = null;
        }
        if ((i & 8) != 0) {
            map = AGH.A0E();
        }
        return chatThreadLogMetadata(z, str, bool, map);
    }

    public static final HatchMetadataKey getOriginIdMetadataKey(HatchComposerEntryPoint hatchComposerEntryPoint) {
        switch (AnonymousClass003.A0L(hatchComposerEntryPoint)) {
            case 0:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 11:
            case 12:
                return null;
            case 1:
            case 2:
            case 3:
                return HatchMetadataKey.GOAL_ID;
            case 10:
                return HatchMetadataKey.FEED_CARD_ID;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
