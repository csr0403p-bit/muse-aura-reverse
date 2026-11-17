package com.facebook.aura.identity.provider;

import X.AnonymousClass002;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.B6A;
import X.C06G;
import X.C06H;
import X.C7384Etj;

/* loaded from: classes.dex */
public final class HatchConversationTheme extends C06G {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion();
    public static final HatchConversationTheme DEFAULT;
    public static final long DefaultAgentBubbleColorDark;
    public static final long DefaultAgentBubbleColorLight;
    public final long agentBubbleColorDark;
    public final long agentBubbleColorLight;
    public final long agentTextColorDark;
    public final long agentTextColorLight;
    public final long chatBackgroundDark;
    public final long chatBackgroundLight;
    public final long extractedColor;
    public final B6A primaryActionBackgroundDark;
    public final B6A primaryActionBackgroundLight;
    public final B6A primaryActionForegroundDark;
    public final B6A primaryActionForegroundLight;
    public final ThemeType themeType;
    public final long userBubbleColorDark;
    public final long userBubbleColorLight;
    public final long userTextColorDark;
    public final long userTextColorLight;

    public final class Companion {
        public final HatchConversationTheme getDEFAULT() {
            return HatchConversationTheme.DEFAULT;
        }

        /* renamed from: getDefaultAgentBubbleColorDark-0d7_KjU$fbandroid_express_aura_java_com_facebook_aura_identity_provider_provider, reason: not valid java name */
        public final long m1139x7f43bf3f() {
            return HatchConversationTheme.DefaultAgentBubbleColorDark;
        }

        /* renamed from: getDefaultAgentBubbleColorLight-0d7_KjU$fbandroid_express_aura_java_com_facebook_aura_identity_provider_provider, reason: not valid java name */
        public final long m1140xa3cfb639() {
            return HatchConversationTheme.DefaultAgentBubbleColorLight;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof HatchConversationTheme) {
                HatchConversationTheme hatchConversationTheme = (HatchConversationTheme) obj;
                long j = this.chatBackgroundLight;
                long j2 = hatchConversationTheme.chatBackgroundLight;
                long j3 = B6A.A01;
                if (j != j2 || this.chatBackgroundDark != hatchConversationTheme.chatBackgroundDark || this.userBubbleColorLight != hatchConversationTheme.userBubbleColorLight || this.userBubbleColorDark != hatchConversationTheme.userBubbleColorDark || this.agentBubbleColorLight != hatchConversationTheme.agentBubbleColorLight || this.agentBubbleColorDark != hatchConversationTheme.agentBubbleColorDark || this.userTextColorLight != hatchConversationTheme.userTextColorLight || this.userTextColorDark != hatchConversationTheme.userTextColorDark || this.agentTextColorLight != hatchConversationTheme.agentTextColorLight || this.agentTextColorDark != hatchConversationTheme.agentTextColorDark || this.extractedColor != hatchConversationTheme.extractedColor || this.themeType != hatchConversationTheme.themeType || !C7384Etj.areEqual(this.primaryActionBackgroundLight, hatchConversationTheme.primaryActionBackgroundLight) || !C7384Etj.areEqual(this.primaryActionBackgroundDark, hatchConversationTheme.primaryActionBackgroundDark) || !C7384Etj.areEqual(this.primaryActionForegroundLight, hatchConversationTheme.primaryActionForegroundLight) || !C7384Etj.areEqual(this.primaryActionForegroundDark, hatchConversationTheme.primaryActionForegroundDark)) {
                }
            }
            return false;
        }
        return true;
    }

    static {
        long j = 4293520107L << 32;
        long j2 = B6A.A01;
        DefaultAgentBubbleColorLight = j;
        long j3 = 4280229663L << 32;
        DefaultAgentBubbleColorDark = j3;
        long j4 = 4294309365L << 32;
        long j5 = B6A.A01;
        long j6 = B6A.A08;
        long j7 = 4279308562L << 32;
        DEFAULT = new HatchConversationTheme(j4, 4279900698L << 32, j5, j6, j, j3, j6, j7, j7, j4, B6A.A07, ThemeType.DEFAULT, null, null, null, null);
    }

    public HatchConversationTheme(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, ThemeType themeType, B6A b6a, B6A b6a2, B6A b6a3, B6A b6a4) {
        C7384Etj.A0Y(themeType, 11);
        this.chatBackgroundLight = j;
        this.chatBackgroundDark = j2;
        this.userBubbleColorLight = j3;
        this.userBubbleColorDark = j4;
        this.agentBubbleColorLight = j5;
        this.agentBubbleColorDark = j6;
        this.userTextColorLight = j7;
        this.userTextColorDark = j8;
        this.agentTextColorLight = j9;
        this.agentTextColorDark = j10;
        this.extractedColor = j11;
        this.themeType = themeType;
        this.primaryActionBackgroundLight = b6a;
        this.primaryActionBackgroundDark = b6a2;
        this.primaryActionForegroundLight = b6a3;
        this.primaryActionForegroundDark = b6a4;
    }

    /* renamed from: copy-2KUReNU$default, reason: not valid java name */
    public static /* synthetic */ HatchConversationTheme m1103copy2KUReNU$default(HatchConversationTheme hatchConversationTheme, long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, ThemeType themeType, B6A b6a, B6A b6a2, B6A b6a3, B6A b6a4, int i, Object obj) {
        long j12 = j2;
        long j13 = j3;
        long j14 = j4;
        long j15 = j5;
        long j16 = j6;
        long j17 = j7;
        long j18 = j;
        long j19 = j8;
        long j20 = j9;
        long j21 = j10;
        long j22 = j11;
        ThemeType themeType2 = themeType;
        B6A b6a5 = b6a;
        B6A b6a6 = b6a2;
        B6A b6a7 = b6a3;
        B6A b6a8 = b6a4;
        if ((i & 1) != 0) {
            j18 = hatchConversationTheme.chatBackgroundLight;
        }
        if ((i & 2) != 0) {
            j12 = hatchConversationTheme.chatBackgroundDark;
        }
        if ((i & 4) != 0) {
            j13 = hatchConversationTheme.userBubbleColorLight;
        }
        if ((i & 8) != 0) {
            j14 = hatchConversationTheme.userBubbleColorDark;
        }
        if ((i & 16) != 0) {
            j15 = hatchConversationTheme.agentBubbleColorLight;
        }
        if ((i & 32) != 0) {
            j16 = hatchConversationTheme.agentBubbleColorDark;
        }
        if ((i & 64) != 0) {
            j17 = hatchConversationTheme.userTextColorLight;
        }
        if ((i & 128) != 0) {
            j19 = hatchConversationTheme.userTextColorDark;
        }
        if ((i & 256) != 0) {
            j20 = hatchConversationTheme.agentTextColorLight;
        }
        if ((i & 512) != 0) {
            j21 = hatchConversationTheme.agentTextColorDark;
        }
        if ((i & 1024) != 0) {
            j22 = hatchConversationTheme.extractedColor;
        }
        if ((i & 2048) != 0) {
            themeType2 = hatchConversationTheme.themeType;
        }
        if ((i & 4096) != 0) {
            b6a5 = hatchConversationTheme.primaryActionBackgroundLight;
        }
        if ((i & 8192) != 0) {
            b6a6 = hatchConversationTheme.primaryActionBackgroundDark;
        }
        if ((i & 16384) != 0) {
            b6a7 = hatchConversationTheme.primaryActionForegroundLight;
        }
        if ((i & 32768) != 0) {
            b6a8 = hatchConversationTheme.primaryActionForegroundDark;
        }
        B6A b6a9 = b6a8;
        return hatchConversationTheme.m1120copy2KUReNU(j18, j12, j13, j14, j15, j16, j17, j19, j20, j21, j22, themeType2, b6a5, b6a6, b6a7, b6a9);
    }

    /* renamed from: agentTextColor-vNxB06k, reason: not valid java name */
    public final long m1104agentTextColorvNxB06k(boolean z) {
        return z ? this.agentTextColorDark : this.agentTextColorLight;
    }

    /* renamed from: component1-0d7_KjU, reason: not valid java name */
    public final long m1105component10d7_KjU() {
        return this.chatBackgroundLight;
    }

    /* renamed from: component10-0d7_KjU, reason: not valid java name */
    public final long m1106component100d7_KjU() {
        return this.agentTextColorDark;
    }

    /* renamed from: component11-0d7_KjU, reason: not valid java name */
    public final long m1107component110d7_KjU() {
        return this.extractedColor;
    }

    public final ThemeType component12() {
        return this.themeType;
    }

    /* renamed from: component13-QN2ZGVo, reason: not valid java name */
    public final B6A m1108component13QN2ZGVo() {
        return this.primaryActionBackgroundLight;
    }

    /* renamed from: component14-QN2ZGVo, reason: not valid java name */
    public final B6A m1109component14QN2ZGVo() {
        return this.primaryActionBackgroundDark;
    }

    /* renamed from: component15-QN2ZGVo, reason: not valid java name */
    public final B6A m1110component15QN2ZGVo() {
        return this.primaryActionForegroundLight;
    }

    /* renamed from: component16-QN2ZGVo, reason: not valid java name */
    public final B6A m1111component16QN2ZGVo() {
        return this.primaryActionForegroundDark;
    }

    /* renamed from: component2-0d7_KjU, reason: not valid java name */
    public final long m1112component20d7_KjU() {
        return this.chatBackgroundDark;
    }

    /* renamed from: component3-0d7_KjU, reason: not valid java name */
    public final long m1113component30d7_KjU() {
        return this.userBubbleColorLight;
    }

    /* renamed from: component4-0d7_KjU, reason: not valid java name */
    public final long m1114component40d7_KjU() {
        return this.userBubbleColorDark;
    }

    /* renamed from: component5-0d7_KjU, reason: not valid java name */
    public final long m1115component50d7_KjU() {
        return this.agentBubbleColorLight;
    }

    /* renamed from: component6-0d7_KjU, reason: not valid java name */
    public final long m1116component60d7_KjU() {
        return this.agentBubbleColorDark;
    }

    /* renamed from: component7-0d7_KjU, reason: not valid java name */
    public final long m1117component70d7_KjU() {
        return this.userTextColorLight;
    }

    /* renamed from: component8-0d7_KjU, reason: not valid java name */
    public final long m1118component80d7_KjU() {
        return this.userTextColorDark;
    }

    /* renamed from: component9-0d7_KjU, reason: not valid java name */
    public final long m1119component90d7_KjU() {
        return this.agentTextColorLight;
    }

    /* renamed from: copy-2KUReNU, reason: not valid java name */
    public final HatchConversationTheme m1120copy2KUReNU(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, ThemeType themeType, B6A b6a, B6A b6a2, B6A b6a3, B6A b6a4) {
        C7384Etj.A0Y(themeType, 11);
        return new HatchConversationTheme(j, j2, j3, j4, j5, j6, j7, j8, j9, j10, j11, themeType, b6a, b6a2, b6a3, b6a4);
    }

    /* renamed from: getAgentBubbleColorDark-0d7_KjU, reason: not valid java name */
    public final long m1121getAgentBubbleColorDark0d7_KjU() {
        return this.agentBubbleColorDark;
    }

    /* renamed from: getAgentBubbleColorLight-0d7_KjU, reason: not valid java name */
    public final long m1122getAgentBubbleColorLight0d7_KjU() {
        return this.agentBubbleColorLight;
    }

    /* renamed from: getAgentTextColorDark-0d7_KjU, reason: not valid java name */
    public final long m1123getAgentTextColorDark0d7_KjU() {
        return this.agentTextColorDark;
    }

    /* renamed from: getAgentTextColorLight-0d7_KjU, reason: not valid java name */
    public final long m1124getAgentTextColorLight0d7_KjU() {
        return this.agentTextColorLight;
    }

    /* renamed from: getChatBackgroundDark-0d7_KjU, reason: not valid java name */
    public final long m1125getChatBackgroundDark0d7_KjU() {
        return this.chatBackgroundDark;
    }

    /* renamed from: getChatBackgroundLight-0d7_KjU, reason: not valid java name */
    public final long m1126getChatBackgroundLight0d7_KjU() {
        return this.chatBackgroundLight;
    }

    /* renamed from: getExtractedColor-0d7_KjU, reason: not valid java name */
    public final long m1127getExtractedColor0d7_KjU() {
        return this.extractedColor;
    }

    /* renamed from: getPrimaryActionBackgroundDark-QN2ZGVo, reason: not valid java name */
    public final B6A m1128getPrimaryActionBackgroundDarkQN2ZGVo() {
        return this.primaryActionBackgroundDark;
    }

    /* renamed from: getPrimaryActionBackgroundLight-QN2ZGVo, reason: not valid java name */
    public final B6A m1129getPrimaryActionBackgroundLightQN2ZGVo() {
        return this.primaryActionBackgroundLight;
    }

    /* renamed from: getPrimaryActionForegroundDark-QN2ZGVo, reason: not valid java name */
    public final B6A m1130getPrimaryActionForegroundDarkQN2ZGVo() {
        return this.primaryActionForegroundDark;
    }

    /* renamed from: getPrimaryActionForegroundLight-QN2ZGVo, reason: not valid java name */
    public final B6A m1131getPrimaryActionForegroundLightQN2ZGVo() {
        return this.primaryActionForegroundLight;
    }

    public final ThemeType getThemeType() {
        return this.themeType;
    }

    /* renamed from: getUserBubbleColorDark-0d7_KjU, reason: not valid java name */
    public final long m1132getUserBubbleColorDark0d7_KjU() {
        return this.userBubbleColorDark;
    }

    /* renamed from: getUserBubbleColorLight-0d7_KjU, reason: not valid java name */
    public final long m1133getUserBubbleColorLight0d7_KjU() {
        return this.userBubbleColorLight;
    }

    /* renamed from: getUserTextColorDark-0d7_KjU, reason: not valid java name */
    public final long m1134getUserTextColorDark0d7_KjU() {
        return this.userTextColorDark;
    }

    /* renamed from: getUserTextColorLight-0d7_KjU, reason: not valid java name */
    public final long m1135getUserTextColorLight0d7_KjU() {
        return this.userTextColorLight;
    }

    public int hashCode() {
        int i;
        int i2;
        int i3;
        long j = this.chatBackgroundLight;
        long j2 = B6A.A01;
        int iA0F = AnonymousClass005.A0F(this.themeType, AnonymousClass006.A06(this.extractedColor, AnonymousClass006.A06(this.agentTextColorDark, AnonymousClass006.A06(this.agentTextColorLight, AnonymousClass006.A06(this.userTextColorDark, AnonymousClass006.A06(this.userTextColorLight, AnonymousClass006.A06(this.agentBubbleColorDark, AnonymousClass006.A06(this.agentBubbleColorLight, AnonymousClass006.A06(this.userBubbleColorDark, AnonymousClass006.A06(this.userBubbleColorLight, AnonymousClass006.A06(this.chatBackgroundDark, AnonymousClass005.A07(j))))))))))));
        B6A b6a = this.primaryActionBackgroundLight;
        int i4 = 0;
        if (b6a == null) {
            i = 0;
        } else {
            long j3 = b6a.A00;
            i = (int) (j3 ^ (j3 >>> 32));
        }
        int i5 = (iA0F + i) * 31;
        B6A b6a2 = this.primaryActionBackgroundDark;
        if (b6a2 == null) {
            i2 = 0;
        } else {
            long j4 = b6a2.A00;
            i2 = (int) (j4 ^ (j4 >>> 32));
        }
        int i6 = (i5 + i2) * 31;
        B6A b6a3 = this.primaryActionForegroundLight;
        if (b6a3 == null) {
            i3 = 0;
        } else {
            long j5 = b6a3.A00;
            i3 = (int) (j5 ^ (j5 >>> 32));
        }
        int i7 = (i6 + i3) * 31;
        B6A b6a4 = this.primaryActionForegroundDark;
        if (b6a4 != null) {
            long j6 = b6a4.A00;
            i4 = (int) (j6 ^ (j6 >>> 32));
        }
        return i7 + i4;
    }

    public final boolean isCustom() {
        return AnonymousClass002.A1Z(this.themeType, ThemeType.CUSTOM);
    }

    /* renamed from: primaryActionBackgroundColor-ijrfgN4, reason: not valid java name */
    public final B6A m1136primaryActionBackgroundColorijrfgN4(boolean z) {
        return z ? this.primaryActionBackgroundDark : this.primaryActionBackgroundLight;
    }

    /* renamed from: primaryActionForegroundColor-ijrfgN4, reason: not valid java name */
    public final B6A m1137primaryActionForegroundColorijrfgN4(boolean z) {
        return z ? this.primaryActionForegroundDark : this.primaryActionForegroundLight;
    }

    /* renamed from: userTextColor-vNxB06k, reason: not valid java name */
    public final long m1138userTextColorvNxB06k(boolean z) {
        return z ? this.userTextColorDark : this.userTextColorLight;
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ HatchConversationTheme(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, ThemeType themeType, B6A b6a, B6A b6a2, B6A b6a3, B6A b6a4, C06H c06h) {
        this(j, j2, j3, j4, j5, j6, j7, j8, j9, j10, j11, themeType, b6a, b6a2, b6a3, b6a4);
    }

    public /* synthetic */ HatchConversationTheme(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, ThemeType themeType, B6A b6a, B6A b6a2, B6A b6a3, B6A b6a4, int i, C06H c06h) {
        this(j, j2, j3, j4, j5, j6, j7, j8, j9, j10, j11, (i & 2048) != 0 ? ThemeType.DEFAULT : themeType, (i & 4096) != 0 ? null : b6a, (i & 8192) != 0 ? null : b6a2, (i & 16384) != 0 ? null : b6a3, (i & 32768) != 0 ? null : b6a4);
    }
}
