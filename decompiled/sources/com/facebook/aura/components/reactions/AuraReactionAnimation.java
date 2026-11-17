package com.facebook.aura.components.reactions;

import X.AGH;
import X.C06H;
import X.C3cG;
import X.C8j3;
import X.Ey9;
import X.HxE;
import com.facebook.aura.conversation.offline.HatchPersistedMessageJson;
import java.util.Map;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class AuraReactionAnimation {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ AuraReactionAnimation[] $VALUES;
    public static final AuraReactionAnimation AWKWARD;
    public static final AuraReactionAnimation BLESSING_BLOOM;
    public static final Map<String, AuraReactionAnimation> ByEmoji;
    public static final AuraReactionAnimation CELEBRATION_BLAST;
    public static final AuraReactionAnimation COLOR_SCATTER;
    public static final AuraReactionAnimation CONFETTI;
    public static final AuraReactionAnimation CROWN_DROP;
    public static final Companion Companion;
    public static final AuraReactionAnimation DISCO_FLASH;
    public static final AuraReactionAnimation DOUBLE_TAKE;
    public static final AuraReactionAnimation Default;
    public static final AuraReactionAnimation FIRE_SMOKE;
    public static final AuraReactionAnimation FLEX;
    public static final AuraReactionAnimation GATHERED_HEART;
    public static final AuraReactionAnimation GLYPH_SCATTER;
    public static final AuraReactionAnimation HEART;
    public static final AuraReactionAnimation HEART_EYES;
    public static final AuraReactionAnimation HEART_SCATTER;
    public static final AuraReactionAnimation LAUGH;
    public static final AuraReactionAnimation LIGHTNING_LATCH;
    public static final AuraReactionAnimation LITTLE_WISH;
    public static final AuraReactionAnimation MELT_REFORM;
    public static final AuraReactionAnimation MICRO_LAUNCH;
    public static final AuraReactionAnimation NONE;
    public static final AuraReactionAnimation PRESSURE_RELEASE;
    public static final AuraReactionAnimation REDLINE;
    public static final AuraReactionAnimation RIBBON_ARC;
    public static final AuraReactionAnimation SALUTE;
    public static final AuraReactionAnimation SECRET_GOAT;
    public static final AuraReactionAnimation SHOOTING_STAR;
    public static final AuraReactionAnimation SINGLE_CLAP;
    public static final AuraReactionAnimation SINGLE_TEAR;
    public static final AuraReactionAnimation SPRINKLE;
    public static final AuraReactionAnimation SUNSET_WASH;
    public static final AuraReactionAnimation TEAR_JEWEL;
    public static final AuraReactionAnimation THINKING_DOTS;
    public static final AuraReactionAnimation TINY_WATERFALL;
    public static final AuraReactionAnimation VICTORY_GLEAM;

    public final class Companion {
        public final AuraReactionAnimation forEmoji(String str) {
            AuraReactionAnimation auraReactionAnimation = (AuraReactionAnimation) AuraReactionAnimation.ByEmoji.get(str);
            return auraReactionAnimation == null ? AuraReactionAnimation.Default : auraReactionAnimation;
        }

        public final AuraReactionAnimation getDefault() {
            return AuraReactionAnimation.Default;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    static {
        AuraReactionAnimation auraReactionAnimationA0n = C8j3.A0n(HatchPersistedMessageJson.UNSEND_STATUS_NONE, 0);
        NONE = auraReactionAnimationA0n;
        AuraReactionAnimation auraReactionAnimationA0n2 = C8j3.A0n("SPRINKLE", 1);
        SPRINKLE = auraReactionAnimationA0n2;
        AuraReactionAnimation auraReactionAnimationA0n3 = C8j3.A0n("HEART", 2);
        HEART = auraReactionAnimationA0n3;
        AuraReactionAnimation auraReactionAnimationA0n4 = C8j3.A0n("HEART_SCATTER", 3);
        HEART_SCATTER = auraReactionAnimationA0n4;
        AuraReactionAnimation auraReactionAnimationA0n5 = C8j3.A0n("CONFETTI", 4);
        CONFETTI = auraReactionAnimationA0n5;
        AuraReactionAnimation auraReactionAnimationA0n6 = C8j3.A0n("FIRE_SMOKE", 5);
        FIRE_SMOKE = auraReactionAnimationA0n6;
        AuraReactionAnimation auraReactionAnimationA0n7 = C8j3.A0n("LAUGH", 6);
        LAUGH = auraReactionAnimationA0n7;
        AuraReactionAnimation auraReactionAnimationA0n8 = C8j3.A0n("AWKWARD", 7);
        AWKWARD = auraReactionAnimationA0n8;
        AuraReactionAnimation auraReactionAnimationA0n9 = C8j3.A0n("REDLINE", 8);
        REDLINE = auraReactionAnimationA0n9;
        AuraReactionAnimation auraReactionAnimationA0n10 = C8j3.A0n("SALUTE", 9);
        SALUTE = auraReactionAnimationA0n10;
        AuraReactionAnimation auraReactionAnimationA0n11 = C8j3.A0n("TEAR_JEWEL", 10);
        TEAR_JEWEL = auraReactionAnimationA0n11;
        AuraReactionAnimation auraReactionAnimationA0n12 = C8j3.A0n("TINY_WATERFALL", 11);
        TINY_WATERFALL = auraReactionAnimationA0n12;
        AuraReactionAnimation auraReactionAnimationA0n13 = C8j3.A0n("HEART_EYES", 12);
        HEART_EYES = auraReactionAnimationA0n13;
        AuraReactionAnimation auraReactionAnimationA0n14 = C8j3.A0n("LITTLE_WISH", 13);
        LITTLE_WISH = auraReactionAnimationA0n14;
        AuraReactionAnimation auraReactionAnimationA0n15 = C8j3.A0n("BLESSING_BLOOM", 14);
        BLESSING_BLOOM = auraReactionAnimationA0n15;
        AuraReactionAnimation auraReactionAnimationA0n16 = C8j3.A0n("SINGLE_CLAP", 15);
        SINGLE_CLAP = auraReactionAnimationA0n16;
        AuraReactionAnimation auraReactionAnimationA0n17 = C8j3.A0n("THINKING_DOTS", 16);
        THINKING_DOTS = auraReactionAnimationA0n17;
        AuraReactionAnimation auraReactionAnimationA0n18 = C8j3.A0n("FLEX", 17);
        FLEX = auraReactionAnimationA0n18;
        AuraReactionAnimation auraReactionAnimationA0n19 = C8j3.A0n("COLOR_SCATTER", 18);
        COLOR_SCATTER = auraReactionAnimationA0n19;
        AuraReactionAnimation auraReactionAnimationA0n20 = C8j3.A0n("GLYPH_SCATTER", 19);
        GLYPH_SCATTER = auraReactionAnimationA0n20;
        AuraReactionAnimation auraReactionAnimationA0n21 = C8j3.A0n("SINGLE_TEAR", 20);
        SINGLE_TEAR = auraReactionAnimationA0n21;
        AuraReactionAnimation auraReactionAnimationA0n22 = C8j3.A0n("LIGHTNING_LATCH", 21);
        LIGHTNING_LATCH = auraReactionAnimationA0n22;
        AuraReactionAnimation auraReactionAnimationA0n23 = C8j3.A0n("MICRO_LAUNCH", 22);
        MICRO_LAUNCH = auraReactionAnimationA0n23;
        AuraReactionAnimation auraReactionAnimationA0n24 = C8j3.A0n("PRESSURE_RELEASE", 23);
        PRESSURE_RELEASE = auraReactionAnimationA0n24;
        AuraReactionAnimation auraReactionAnimationA0n25 = C8j3.A0n("MELT_REFORM", 24);
        MELT_REFORM = auraReactionAnimationA0n25;
        AuraReactionAnimation auraReactionAnimationA0n26 = C8j3.A0n("GATHERED_HEART", 25);
        GATHERED_HEART = auraReactionAnimationA0n26;
        AuraReactionAnimation auraReactionAnimationA0n27 = C8j3.A0n("RIBBON_ARC", 26);
        RIBBON_ARC = auraReactionAnimationA0n27;
        AuraReactionAnimation auraReactionAnimationA0n28 = C8j3.A0n("SHOOTING_STAR", 27);
        SHOOTING_STAR = auraReactionAnimationA0n28;
        AuraReactionAnimation auraReactionAnimationA0n29 = C8j3.A0n("CROWN_DROP", 28);
        CROWN_DROP = auraReactionAnimationA0n29;
        AuraReactionAnimation auraReactionAnimationA0n30 = C8j3.A0n("VICTORY_GLEAM", 29);
        VICTORY_GLEAM = auraReactionAnimationA0n30;
        AuraReactionAnimation auraReactionAnimationA0n31 = C8j3.A0n("DISCO_FLASH", 30);
        DISCO_FLASH = auraReactionAnimationA0n31;
        AuraReactionAnimation auraReactionAnimationA0n32 = C8j3.A0n("SECRET_GOAT", 31);
        SECRET_GOAT = auraReactionAnimationA0n32;
        AuraReactionAnimation auraReactionAnimationA0n33 = C8j3.A0n("DOUBLE_TAKE", 32);
        DOUBLE_TAKE = auraReactionAnimationA0n33;
        AuraReactionAnimation auraReactionAnimationA0n34 = C8j3.A0n("CELEBRATION_BLAST", 33);
        CELEBRATION_BLAST = auraReactionAnimationA0n34;
        AuraReactionAnimation auraReactionAnimationA0n35 = C8j3.A0n("SUNSET_WASH", 34);
        SUNSET_WASH = auraReactionAnimationA0n35;
        AuraReactionAnimation[] auraReactionAnimationArr = new AuraReactionAnimation[35];
        System.arraycopy(new AuraReactionAnimation[]{auraReactionAnimationA0n, auraReactionAnimationA0n2, auraReactionAnimationA0n3, auraReactionAnimationA0n4, auraReactionAnimationA0n5, auraReactionAnimationA0n6, auraReactionAnimationA0n7, auraReactionAnimationA0n8, auraReactionAnimationA0n9, auraReactionAnimationA0n10, auraReactionAnimationA0n11, auraReactionAnimationA0n12, auraReactionAnimationA0n13, auraReactionAnimationA0n14, auraReactionAnimationA0n15, auraReactionAnimationA0n16, auraReactionAnimationA0n17, auraReactionAnimationA0n18, auraReactionAnimationA0n19, auraReactionAnimationA0n20, auraReactionAnimationA0n21, auraReactionAnimationA0n22, auraReactionAnimationA0n23, auraReactionAnimationA0n24, auraReactionAnimationA0n25, auraReactionAnimationA0n26, auraReactionAnimationA0n27}, 0, auraReactionAnimationArr, 0, 27);
        System.arraycopy(new AuraReactionAnimation[]{auraReactionAnimationA0n28, auraReactionAnimationA0n29, auraReactionAnimationA0n30, auraReactionAnimationA0n31, auraReactionAnimationA0n32, auraReactionAnimationA0n33, auraReactionAnimationA0n34, auraReactionAnimationA0n35}, 0, auraReactionAnimationArr, 27, 8);
        $VALUES = auraReactionAnimationArr;
        $ENTRIES = C3cG.A0w(auraReactionAnimationArr);
        Companion = new Companion();
        Default = auraReactionAnimationA0n2;
        HxE[] hxEArr = new HxE[32];
        System.arraycopy(new HxE[]{C3cG.A0r(AuraReactionAnimationKt.HatchHeartReaction, auraReactionAnimationA0n35), C3cG.A0r(AuraReactionAnimationKt.HatchFacebookLikeReaction, auraReactionAnimationA0n2), C3cG.A0r("\u2764\ufe0f", auraReactionAnimationA0n4), C3cG.A0r(AuraReactionAnimationKt.HeartEmojiUnqualified, auraReactionAnimationA0n4), C3cG.A0r(AuraReactionAnimationKt.PartyPopperEmoji, auraReactionAnimationA0n34), C3cG.A0r(AuraReactionAnimationKt.FireEmoji, auraReactionAnimationA0n6), C3cG.A0r(AuraReactionAnimationKt.LaughEmoji, auraReactionAnimationA0n7), C3cG.A0r(AuraReactionAnimationKt.GrimaceEmoji, auraReactionAnimationA0n8), C3cG.A0r(AuraReactionAnimationKt.HundredEmoji, auraReactionAnimationA0n9), C3cG.A0r(AuraReactionAnimationKt.SaluteEmoji, auraReactionAnimationA0n10), C3cG.A0r(AuraReactionAnimationKt.HoldingBackTearsEmoji, auraReactionAnimationA0n11), C3cG.A0r(AuraReactionAnimationKt.LoudlyCryingEmoji, auraReactionAnimationA0n12), C3cG.A0r("\u1f60d", auraReactionAnimationA0n13), C3cG.A0r(AuraReactionAnimationKt.FoldedHandsEmoji, auraReactionAnimationA0n15), C3cG.A0r(AuraReactionAnimationKt.ClappingHandsEmoji, auraReactionAnimationA0n16), C3cG.A0r(AuraReactionAnimationKt.ThinkingEmoji, auraReactionAnimationA0n17), C3cG.A0r(AuraReactionAnimationKt.FlexedBicepsEmoji, auraReactionAnimationA0n18), C3cG.A0r(AuraReactionAnimationKt.CryingEmoji, auraReactionAnimationA0n21), C3cG.A0r(AuraReactionAnimationKt.HighVoltageEmoji, auraReactionAnimationA0n22), C3cG.A0r(AuraReactionAnimationKt.HighVoltageEmojiUnqualified, auraReactionAnimationA0n22), C3cG.A0r(AuraReactionAnimationKt.RocketEmoji, auraReactionAnimationA0n23), C3cG.A0r(AuraReactionAnimationKt.ExplodingHeadEmoji, auraReactionAnimationA0n24), C3cG.A0r(AuraReactionAnimationKt.MeltingFaceEmoji, auraReactionAnimationA0n25), C3cG.A0r(AuraReactionAnimationKt.HeartHandsEmoji, auraReactionAnimationA0n26), C3cG.A0r(AuraReactionAnimationKt.RainbowEmoji, auraReactionAnimationA0n27), C3cG.A0r(AuraReactionAnimationKt.StarEmoji, auraReactionAnimationA0n28), C3cG.A0r(AuraReactionAnimationKt.StarBareEmoji, auraReactionAnimationA0n28)}, 0, hxEArr, 0, 27);
        System.arraycopy(new HxE[]{C3cG.A0r(AuraReactionAnimationKt.CrownEmoji, auraReactionAnimationA0n29), C3cG.A0r(AuraReactionAnimationKt.TrophyEmoji, auraReactionAnimationA0n30), C3cG.A0r(AuraReactionAnimationKt.MirrorBallEmoji, auraReactionAnimationA0n31), C3cG.A0r(AuraReactionAnimationKt.GoatEmoji, auraReactionAnimationA0n32), C3cG.A0r(AuraReactionAnimationKt.OpenMouthEmoji, auraReactionAnimationA0n33)}, 0, hxEArr, 27, 5);
        ByEmoji = AGH.A0D(hxEArr);
    }

    public static Ey9<AuraReactionAnimation> getEntries() {
        return $ENTRIES;
    }

    public static AuraReactionAnimation valueOf(String str) {
        return (AuraReactionAnimation) Enum.valueOf(AuraReactionAnimation.class, str);
    }

    public static AuraReactionAnimation[] values() {
        return (AuraReactionAnimation[]) $VALUES.clone();
    }

    public AuraReactionAnimation(String str, int i) {
    }
}
