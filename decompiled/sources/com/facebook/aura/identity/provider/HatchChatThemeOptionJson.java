package com.facebook.aura.identity.provider;

import X.AnonymousClass005;
import X.AnonymousClass006;
import X.B6A;
import X.C06G;
import X.C06H;
import X.C2hx;
import X.C7384Etj;
import X.C9hr;
import X.C9iI;
import X.C9iZ;
import X.C9j5;
import X.F60;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes.dex */
public final class HatchChatThemeOptionJson extends C06G {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion();
    public final HatchChatThemeColorModeJson background;
    public final HatchChatThemeColorModeJson botBubble;
    public final HatchChatThemeColorModeJson botText;
    public final HatchChatThemeColorModeJson primaryActionBackground;
    public final HatchChatThemeColorModeJson primaryActionForeground;
    public final HatchChatThemeColorModeJson userBubble;
    public final HatchChatThemeColorModeJson userText;

    public final class Companion {
        public final C9hr<HatchChatThemeOptionJson> serializer() {
            return HatchChatThemeOptionJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof HatchChatThemeOptionJson) {
                HatchChatThemeOptionJson hatchChatThemeOptionJson = (HatchChatThemeOptionJson) obj;
                if (!C7384Etj.areEqual(this.userText, hatchChatThemeOptionJson.userText) || !C7384Etj.areEqual(this.userBubble, hatchChatThemeOptionJson.userBubble) || !C7384Etj.areEqual(this.botText, hatchChatThemeOptionJson.botText) || !C7384Etj.areEqual(this.botBubble, hatchChatThemeOptionJson.botBubble) || !C7384Etj.areEqual(this.background, hatchChatThemeOptionJson.background) || !C7384Etj.areEqual(this.primaryActionBackground, hatchChatThemeOptionJson.primaryActionBackground) || !C7384Etj.areEqual(this.primaryActionForeground, hatchChatThemeOptionJson.primaryActionForeground)) {
                }
            }
            return false;
        }
        return true;
    }

    public final HatchChatThemeOption toDomain(String str) {
        C7384Etj.A0Y(str, 0);
        String strNormalizedChatThemeId = HatchChatThemeHelperKt.normalizedChatThemeId(str);
        if (strNormalizedChatThemeId != null) {
            int i = HatchConversationTheme.$stable;
            B6A b6aColorFromHexString = HatchChatThemeJsonKt.colorFromHexString(this.background.light);
            if (b6aColorFromHexString != null) {
                long j = b6aColorFromHexString.A00;
                B6A b6aColorFromHexString2 = HatchChatThemeJsonKt.colorFromHexString(this.background.dark);
                if (b6aColorFromHexString2 != null) {
                    long j2 = b6aColorFromHexString2.A00;
                    B6A b6aColorFromHexString3 = HatchChatThemeJsonKt.colorFromHexString(this.userBubble.light);
                    if (b6aColorFromHexString3 != null) {
                        long j3 = b6aColorFromHexString3.A00;
                        B6A b6aColorFromHexString4 = HatchChatThemeJsonKt.colorFromHexString(this.userBubble.dark);
                        if (b6aColorFromHexString4 != null) {
                            long j4 = b6aColorFromHexString4.A00;
                            long j5 = HatchConversationTheme.DefaultAgentBubbleColorLight;
                            long j6 = HatchConversationTheme.DefaultAgentBubbleColorDark;
                            B6A b6aColorFromHexString5 = HatchChatThemeJsonKt.colorFromHexString(this.userText.light);
                            if (b6aColorFromHexString5 != null) {
                                long j7 = b6aColorFromHexString5.A00;
                                B6A b6aColorFromHexString6 = HatchChatThemeJsonKt.colorFromHexString(this.userText.dark);
                                if (b6aColorFromHexString6 != null) {
                                    long j8 = b6aColorFromHexString6.A00;
                                    B6A b6aColorFromHexString7 = HatchChatThemeJsonKt.colorFromHexString(this.botText.light);
                                    if (b6aColorFromHexString7 != null) {
                                        long j9 = b6aColorFromHexString7.A00;
                                        B6A b6aColorFromHexString8 = HatchChatThemeJsonKt.colorFromHexString(this.botText.dark);
                                        if (b6aColorFromHexString8 != null) {
                                            long j10 = b6aColorFromHexString8.A00;
                                            long j11 = B6A.A07;
                                            ThemeType themeType = ThemeType.CUSTOM;
                                            HatchChatThemeColorModeJson hatchChatThemeColorModeJson = this.primaryActionBackground;
                                            B6A b6aColorFromHexString9 = hatchChatThemeColorModeJson != null ? HatchChatThemeJsonKt.colorFromHexString(hatchChatThemeColorModeJson.light) : null;
                                            HatchChatThemeColorModeJson hatchChatThemeColorModeJson2 = this.primaryActionBackground;
                                            B6A b6aColorFromHexString10 = hatchChatThemeColorModeJson2 != null ? HatchChatThemeJsonKt.colorFromHexString(hatchChatThemeColorModeJson2.dark) : null;
                                            HatchChatThemeColorModeJson hatchChatThemeColorModeJson3 = this.primaryActionForeground;
                                            B6A b6aColorFromHexString11 = hatchChatThemeColorModeJson3 != null ? HatchChatThemeJsonKt.colorFromHexString(hatchChatThemeColorModeJson3.light) : null;
                                            HatchChatThemeColorModeJson hatchChatThemeColorModeJson4 = this.primaryActionForeground;
                                            return new HatchChatThemeOption(strNormalizedChatThemeId, strNormalizedChatThemeId, new HatchConversationTheme(j, j2, j3, j4, j5, j6, j7, j8, j9, j10, j11, themeType, b6aColorFromHexString9, b6aColorFromHexString10, b6aColorFromHexString11, hatchChatThemeColorModeJson4 != null ? HatchChatThemeJsonKt.colorFromHexString(hatchChatThemeColorModeJson4.dark) : null));
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return null;
    }

    public static /* synthetic */ HatchChatThemeOptionJson copy$default(HatchChatThemeOptionJson hatchChatThemeOptionJson, HatchChatThemeColorModeJson hatchChatThemeColorModeJson, HatchChatThemeColorModeJson hatchChatThemeColorModeJson2, HatchChatThemeColorModeJson hatchChatThemeColorModeJson3, HatchChatThemeColorModeJson hatchChatThemeColorModeJson4, HatchChatThemeColorModeJson hatchChatThemeColorModeJson5, HatchChatThemeColorModeJson hatchChatThemeColorModeJson6, HatchChatThemeColorModeJson hatchChatThemeColorModeJson7, int i, Object obj) {
        if ((i & 1) != 0) {
            hatchChatThemeColorModeJson = hatchChatThemeOptionJson.userText;
        }
        if ((i & 2) != 0) {
            hatchChatThemeColorModeJson2 = hatchChatThemeOptionJson.userBubble;
        }
        if ((i & 4) != 0) {
            hatchChatThemeColorModeJson3 = hatchChatThemeOptionJson.botText;
        }
        if ((i & 8) != 0) {
            hatchChatThemeColorModeJson4 = hatchChatThemeOptionJson.botBubble;
        }
        if ((i & 16) != 0) {
            hatchChatThemeColorModeJson5 = hatchChatThemeOptionJson.background;
        }
        if ((i & 32) != 0) {
            hatchChatThemeColorModeJson6 = hatchChatThemeOptionJson.primaryActionBackground;
        }
        if ((i & 64) != 0) {
            hatchChatThemeColorModeJson7 = hatchChatThemeOptionJson.primaryActionForeground;
        }
        return hatchChatThemeOptionJson.copy(hatchChatThemeColorModeJson, hatchChatThemeColorModeJson2, hatchChatThemeColorModeJson3, hatchChatThemeColorModeJson4, hatchChatThemeColorModeJson5, hatchChatThemeColorModeJson6, hatchChatThemeColorModeJson7);
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_identity_provider_provider(HatchChatThemeOptionJson hatchChatThemeOptionJson, C9j5 c9j5, C9iZ c9iZ) {
        HatchChatThemeColorModeJson$$serializer hatchChatThemeColorModeJson$$serializer = HatchChatThemeColorModeJson$$serializer.INSTANCE;
        c9j5.AAQ(hatchChatThemeOptionJson.userText, hatchChatThemeColorModeJson$$serializer, c9iZ, 0);
        c9j5.AAQ(hatchChatThemeOptionJson.userBubble, hatchChatThemeColorModeJson$$serializer, c9iZ, 1);
        c9j5.AAQ(hatchChatThemeOptionJson.botText, hatchChatThemeColorModeJson$$serializer, c9iZ, 2);
        c9j5.AAQ(hatchChatThemeOptionJson.botBubble, hatchChatThemeColorModeJson$$serializer, c9iZ, 3);
        c9j5.AAQ(hatchChatThemeOptionJson.background, hatchChatThemeColorModeJson$$serializer, c9iZ, 4);
        boolean zAfR = c9j5.AfR();
        if (zAfR || hatchChatThemeOptionJson.primaryActionBackground != null) {
            c9j5.AAP(hatchChatThemeOptionJson.primaryActionBackground, hatchChatThemeColorModeJson$$serializer, c9iZ, 5);
        }
        if (zAfR || hatchChatThemeOptionJson.primaryActionForeground != null) {
            c9j5.AAP(hatchChatThemeOptionJson.primaryActionForeground, hatchChatThemeColorModeJson$$serializer, c9iZ, 6);
        }
    }

    public final HatchChatThemeColorModeJson component1() {
        return this.userText;
    }

    public final HatchChatThemeColorModeJson component2() {
        return this.userBubble;
    }

    public final HatchChatThemeColorModeJson component3() {
        return this.botText;
    }

    public final HatchChatThemeColorModeJson component4() {
        return this.botBubble;
    }

    public final HatchChatThemeColorModeJson component5() {
        return this.background;
    }

    public final HatchChatThemeColorModeJson component6() {
        return this.primaryActionBackground;
    }

    public final HatchChatThemeColorModeJson component7() {
        return this.primaryActionForeground;
    }

    public final HatchChatThemeColorModeJson getBackground() {
        return this.background;
    }

    public final HatchChatThemeColorModeJson getBotBubble() {
        return this.botBubble;
    }

    public final HatchChatThemeColorModeJson getBotText() {
        return this.botText;
    }

    public final HatchChatThemeColorModeJson getPrimaryActionBackground() {
        return this.primaryActionBackground;
    }

    public final HatchChatThemeColorModeJson getPrimaryActionForeground() {
        return this.primaryActionForeground;
    }

    public final HatchChatThemeColorModeJson getUserBubble() {
        return this.userBubble;
    }

    public final HatchChatThemeColorModeJson getUserText() {
        return this.userText;
    }

    public int hashCode() {
        return ((AnonymousClass005.A0F(this.background, AnonymousClass005.A0F(this.botBubble, AnonymousClass005.A0F(this.botText, AnonymousClass005.A0F(this.userBubble, AnonymousClass005.A0E(this.userText))))) + AnonymousClass006.A0D(this.primaryActionBackground)) * 31) + C06G.A04(this.primaryActionForeground);
    }

    public HatchChatThemeOptionJson(HatchChatThemeColorModeJson hatchChatThemeColorModeJson, HatchChatThemeColorModeJson hatchChatThemeColorModeJson2, HatchChatThemeColorModeJson hatchChatThemeColorModeJson3, HatchChatThemeColorModeJson hatchChatThemeColorModeJson4, HatchChatThemeColorModeJson hatchChatThemeColorModeJson5, HatchChatThemeColorModeJson hatchChatThemeColorModeJson6, HatchChatThemeColorModeJson hatchChatThemeColorModeJson7) {
        AnonymousClass005.A17(hatchChatThemeColorModeJson, hatchChatThemeColorModeJson2, hatchChatThemeColorModeJson3, hatchChatThemeColorModeJson4, hatchChatThemeColorModeJson5);
        this.userText = hatchChatThemeColorModeJson;
        this.userBubble = hatchChatThemeColorModeJson2;
        this.botText = hatchChatThemeColorModeJson3;
        this.botBubble = hatchChatThemeColorModeJson4;
        this.background = hatchChatThemeColorModeJson5;
        this.primaryActionBackground = hatchChatThemeColorModeJson6;
        this.primaryActionForeground = hatchChatThemeColorModeJson7;
    }

    public final HatchChatThemeOptionJson copy(HatchChatThemeColorModeJson hatchChatThemeColorModeJson, HatchChatThemeColorModeJson hatchChatThemeColorModeJson2, HatchChatThemeColorModeJson hatchChatThemeColorModeJson3, HatchChatThemeColorModeJson hatchChatThemeColorModeJson4, HatchChatThemeColorModeJson hatchChatThemeColorModeJson5, HatchChatThemeColorModeJson hatchChatThemeColorModeJson6, HatchChatThemeColorModeJson hatchChatThemeColorModeJson7) {
        AnonymousClass005.A17(hatchChatThemeColorModeJson, hatchChatThemeColorModeJson2, hatchChatThemeColorModeJson3, hatchChatThemeColorModeJson4, hatchChatThemeColorModeJson5);
        return new HatchChatThemeOptionJson(hatchChatThemeColorModeJson, hatchChatThemeColorModeJson2, hatchChatThemeColorModeJson3, hatchChatThemeColorModeJson4, hatchChatThemeColorModeJson5, hatchChatThemeColorModeJson6, hatchChatThemeColorModeJson7);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ HatchChatThemeOptionJson(HatchChatThemeColorModeJson hatchChatThemeColorModeJson, HatchChatThemeColorModeJson hatchChatThemeColorModeJson2, HatchChatThemeColorModeJson hatchChatThemeColorModeJson3, HatchChatThemeColorModeJson hatchChatThemeColorModeJson4, HatchChatThemeColorModeJson hatchChatThemeColorModeJson5, HatchChatThemeColorModeJson hatchChatThemeColorModeJson6, HatchChatThemeColorModeJson hatchChatThemeColorModeJson7, int i, C06H c06h) {
        this(hatchChatThemeColorModeJson, hatchChatThemeColorModeJson2, hatchChatThemeColorModeJson3, hatchChatThemeColorModeJson4, hatchChatThemeColorModeJson5, (i & 32) != 0 ? null : hatchChatThemeColorModeJson6, (i & 64) != 0 ? null : hatchChatThemeColorModeJson7);
    }

    public /* synthetic */ HatchChatThemeOptionJson(int i, HatchChatThemeColorModeJson hatchChatThemeColorModeJson, HatchChatThemeColorModeJson hatchChatThemeColorModeJson2, HatchChatThemeColorModeJson hatchChatThemeColorModeJson3, HatchChatThemeColorModeJson hatchChatThemeColorModeJson4, HatchChatThemeColorModeJson hatchChatThemeColorModeJson5, HatchChatThemeColorModeJson hatchChatThemeColorModeJson6, HatchChatThemeColorModeJson hatchChatThemeColorModeJson7, C2hx c2hx) {
        if (31 != (i & 31)) {
            C9iI.A00(HatchChatThemeOptionJson$$serializer.descriptor, i, 31);
            throw F60.createAndThrow();
        }
        this.userText = hatchChatThemeColorModeJson;
        this.userBubble = hatchChatThemeColorModeJson2;
        this.botText = hatchChatThemeColorModeJson3;
        this.botBubble = hatchChatThemeColorModeJson4;
        this.background = hatchChatThemeColorModeJson5;
        if ((i & 32) == 0) {
            this.primaryActionBackground = null;
        } else {
            this.primaryActionBackground = hatchChatThemeColorModeJson6;
        }
        if ((i & 64) == 0) {
            this.primaryActionForeground = null;
        } else {
            this.primaryActionForeground = hatchChatThemeColorModeJson7;
        }
    }
}
