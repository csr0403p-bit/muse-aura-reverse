package com.facebook.aura.analytics.hatch;

import X.AnonymousClass002;
import X.Ey9;
import X.F3w;
import kotlin.NoWhenBranchMatchedException;
import kotlinx.serialization.Serializable;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Serializable
/* loaded from: classes.dex */
public final class HatchSkillOAuthOrigin {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ HatchSkillOAuthOrigin[] $VALUES;
    public static final HatchSkillOAuthOrigin BOT_SHEET;
    public static final HatchSkillOAuthOrigin CHAT;
    public static final HatchSkillOAuthOrigin ONBOARDING;
    public static final HatchSkillOAuthOrigin SETTINGS;
    public static final HatchSkillOAuthOrigin WALLET;
    public final HatchScreen screen;
    public final HatchSubsurface subsurface;
    public final HatchSurface surface;

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[HatchSkillOAuthOrigin.values().length];
            try {
                AnonymousClass002.A13(HatchSkillOAuthOrigin.CHAT, iArr);
            } catch (NoSuchFieldError unused) {
            }
            try {
                AnonymousClass002.A14(HatchSkillOAuthOrigin.BOT_SHEET, iArr);
            } catch (NoSuchFieldError unused2) {
            }
            try {
                AnonymousClass002.A15(HatchSkillOAuthOrigin.SETTINGS, iArr);
            } catch (NoSuchFieldError unused3) {
            }
            try {
                AnonymousClass002.A16(HatchSkillOAuthOrigin.WALLET, iArr);
            } catch (NoSuchFieldError unused4) {
            }
            try {
                AnonymousClass002.A17(HatchSkillOAuthOrigin.ONBOARDING, iArr);
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    static {
        HatchSkillOAuthOrigin hatchSkillOAuthOrigin = new HatchSkillOAuthOrigin("CHAT", 0, HatchSurface.CHAT, HatchSubsurface.MESSAGE_LIST, HatchScreen.MAIN_CHAT);
        CHAT = hatchSkillOAuthOrigin;
        HatchSkillOAuthOrigin hatchSkillOAuthOrigin2 = new HatchSkillOAuthOrigin("BOT_SHEET", 1, HatchSurface.STATUS, HatchSubsurface.BOT_SHEET_CONTENT, HatchScreen.BOT_SHEET);
        BOT_SHEET = hatchSkillOAuthOrigin2;
        HatchSurface hatchSurface = HatchSurface.SETTINGS;
        HatchSkillOAuthOrigin hatchSkillOAuthOrigin3 = new HatchSkillOAuthOrigin("SETTINGS", 2, hatchSurface, HatchSubsurface.CONNECTORS, HatchScreen.CONNECTORS);
        SETTINGS = hatchSkillOAuthOrigin3;
        HatchSkillOAuthOrigin hatchSkillOAuthOrigin4 = new HatchSkillOAuthOrigin("WALLET", 3, hatchSurface, HatchSubsurface.WALLET, HatchScreen.WALLET);
        WALLET = hatchSkillOAuthOrigin4;
        HatchSkillOAuthOrigin hatchSkillOAuthOrigin5 = new HatchSkillOAuthOrigin("ONBOARDING", 4, HatchSurface.ONBOARDING, HatchSubsurface.ONBOARDING_CONNECTORS, HatchScreen.ONBOARDING_CONNECTORS);
        ONBOARDING = hatchSkillOAuthOrigin5;
        HatchSkillOAuthOrigin[] hatchSkillOAuthOriginArr = {hatchSkillOAuthOrigin, hatchSkillOAuthOrigin2, hatchSkillOAuthOrigin3, hatchSkillOAuthOrigin4, hatchSkillOAuthOrigin5};
        $VALUES = hatchSkillOAuthOriginArr;
        $ENTRIES = new F3w(hatchSkillOAuthOriginArr);
    }

    public static Ey9<HatchSkillOAuthOrigin> getEntries() {
        return $ENTRIES;
    }

    public static HatchSkillOAuthOrigin valueOf(String str) {
        return (HatchSkillOAuthOrigin) Enum.valueOf(HatchSkillOAuthOrigin.class, str);
    }

    public static HatchSkillOAuthOrigin[] values() {
        return (HatchSkillOAuthOrigin[]) $VALUES.clone();
    }

    public final HatchScreen getScreen() {
        return this.screen;
    }

    public final HatchSubsurface getSubsurface() {
        return this.subsurface;
    }

    public final HatchSurface getSurface() {
        return this.surface;
    }

    public HatchSkillOAuthOrigin(String str, int i, HatchSurface hatchSurface, HatchSubsurface hatchSubsurface, HatchScreen hatchScreen) {
        this.surface = hatchSurface;
        this.subsurface = hatchSubsurface;
        this.screen = hatchScreen;
    }

    public final HatchOrigin getImpressionOrigin() {
        int iOrdinal = ordinal();
        if (iOrdinal == 0) {
            return HatchOrigin.CHAT;
        }
        if (iOrdinal == 1) {
            return HatchOrigin.STATUS;
        }
        if (iOrdinal == 2 || iOrdinal == 3) {
            return HatchOrigin.SETTINGS;
        }
        if (iOrdinal == 4) {
            return HatchOrigin.ONBOARDING;
        }
        throw new NoWhenBranchMatchedException();
    }
}
