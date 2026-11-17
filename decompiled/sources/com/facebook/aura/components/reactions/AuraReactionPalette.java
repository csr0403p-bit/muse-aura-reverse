package com.facebook.aura.components.reactions;

import X.AGH;
import X.AGI;
import X.AHD;
import X.B6A;
import X.C3cG;
import X.C60P;
import X.C8j4;
import X.HxE;
import java.util.Map;

/* loaded from: classes4.dex */
public final class AuraReactionPalette {
    public static final int $stable = 0;
    public static final Map<String, AHD<B6A>> ByEmoji;
    public static final AHD<B6A> Fallback;
    public static final AuraReactionPalette INSTANCE = new AuraReactionPalette();

    static {
        long j = 4293436221L << 32;
        Fallback = AGI.A0E(C60P.A04(j));
        HxE[] hxEArr = new HxE[32];
        HxE hxEA0r = C3cG.A0r(AuraReactionAnimationKt.HatchFacebookLikeReaction, AGI.A0B(C8j4.A0Y(4282079640L), 4294967295L));
        HxE hxEA0r2 = C3cG.A0r(AuraReactionAnimationKt.HatchHeartReaction, AGI.A0E(C8j4.A0Y(4293409871L), C8j4.A0Y(4294947935L), C8j4.A0Y(4294957430L)));
        HxE hxEA0r3 = C3cG.A0r("\u1f37e", AGI.A0B(C8j4.A0Y(4294174400L), 4294964962L));
        HxE hxEA0r4 = C3cG.A0r("\u2764\ufe0f", AGI.A0B(C8j4.A0Y(4292883291L), 4294933411L));
        HxE hxEA0r5 = C3cG.A0r(AuraReactionAnimationKt.FireEmoji, AGI.A0B(C8j4.A0Y(4294933016L), 4292881691L));
        long j2 = 4294295867L << 32;
        long j3 = 4283410687L << 32;
        HxE hxEA0r6 = C3cG.A0r(AuraReactionAnimationKt.LaughEmoji, AGI.A0A(C60P.A04(j2), j3));
        HxE hxEA0r7 = C3cG.A0r(AuraReactionAnimationKt.GrimaceEmoji, AGI.A0E(C8j4.A0Y(4294102597L)));
        long j4 = 4294926242L << 32;
        long j5 = 4282374368L << 32;
        HxE hxEA0r8 = C3cG.A0r(AuraReactionAnimationKt.PartyPopperEmoji, AGI.A0E(C60P.A04(j4), C8j4.A0Y(4294955583L), C60P.A04(j5)));
        long j6 = 4288372197L << 32;
        HxE hxEA0r9 = C3cG.A0r("\u1f49c", AGI.A0E(C60P.A04(j6)));
        long j7 = 4294953290L << 32;
        HxE hxEA0r10 = C3cG.A0r("\u2728", AGI.A0E(C60P.A04(j7)));
        long j8 = 4294959437L << 32;
        long j9 = 4290767359L << 32;
        HxE hxEA0r11 = C3cG.A0r(AuraReactionAnimationKt.HighVoltageEmoji, AGI.A0A(C60P.A04(j8), j9));
        HxE hxEA0r12 = C3cG.A0r(AuraReactionAnimationKt.HighVoltageEmojiUnqualified, AGI.A0A(C60P.A04(j8), j9));
        HxE hxEA0r13 = C3cG.A0r(AuraReactionAnimationKt.RocketEmoji, AGI.A0B(C8j4.A0Y(4294937149L), 4291417828L));
        HxE hxEA0r14 = C3cG.A0r(AuraReactionAnimationKt.HundredEmoji, AGI.A0B(C8j4.A0Y(4293076027L), 4294929259L));
        long j10 = 4293440122L << 32;
        HxE hxEA0r15 = C3cG.A0r(AuraReactionAnimationKt.SaluteEmoji, AGI.A0A(C60P.A04(j2), j10));
        HxE hxEA0r16 = C3cG.A0r(AuraReactionAnimationKt.HoldingBackTearsEmoji, AGI.A0B(C8j4.A0Y(4285511925L), 4291684607L));
        HxE hxEA0r17 = C3cG.A0r(AuraReactionAnimationKt.LoudlyCryingEmoji, AGI.A0B(C60P.A04(j3), 4288401919L));
        HxE hxEA0r18 = C3cG.A0r("\u1f60d", AGI.A0B(C8j4.A0Y(4294921593L), 4294942400L));
        HxE hxEA0r19 = C3cG.A0r(AuraReactionAnimationKt.ExplodingHeadEmoji, AGI.A0E(C60P.A04(j2), C8j4.A0Y(4294928940L), C8j4.A0Y(4288324525L)));
        HxE hxEA0r20 = C3cG.A0r(AuraReactionAnimationKt.ThinkingEmoji, AGI.A0A(C60P.A04(j2), j10));
        long j11 = 4294957450L << 32;
        long j12 = 4294963384L << 32;
        System.arraycopy(new HxE[]{hxEA0r, hxEA0r2, hxEA0r3, hxEA0r4, hxEA0r5, hxEA0r6, hxEA0r7, hxEA0r8, hxEA0r9, hxEA0r10, hxEA0r11, hxEA0r12, hxEA0r13, hxEA0r14, hxEA0r15, hxEA0r16, hxEA0r17, hxEA0r18, hxEA0r19, hxEA0r20, C3cG.A0r(AuraReactionAnimationKt.MeltingFaceEmoji, AGI.A0A(C8j4.A0Y(4294293826L), j11)), C3cG.A0r(AuraReactionAnimationKt.HeartHandsEmoji, AGI.A0B(C8j4.A0Y(4294930341L), 4294947790L)), C3cG.A0r(AuraReactionAnimationKt.FoldedHandsEmoji, AGI.A0B(C60P.A04(j11), 4294963663L)), C3cG.A0r(AuraReactionAnimationKt.ClappingHandsEmoji, AGI.A0B(C60P.A04(j2), 4294961064L)), C3cG.A0r(AuraReactionAnimationKt.FlexedBicepsEmoji, AGI.A0B(C60P.A04(j), 4294955146L)), C3cG.A0r(AuraReactionAnimationKt.RainbowEmoji, AGI.A0E(C8j4.A0Y(4294926189L), C8j4.A0Y(4294951793L), C8j4.A0Y(4282900640L), C60P.A04(j3), C60P.A04(j6))), C3cG.A0r(AuraReactionAnimationKt.StarEmoji, AGI.A0A(C60P.A04(j7), j12))}, 0, hxEArr, 0, 27);
        System.arraycopy(new HxE[]{C3cG.A0r(AuraReactionAnimationKt.StarBareEmoji, AGI.A0A(C60P.A04(j7), j12)), C3cG.A0r(AuraReactionAnimationKt.CrownEmoji, AGI.A0B(C8j4.A0Y(4293643122L), 4294964432L)), C3cG.A0r(AuraReactionAnimationKt.TrophyEmoji, AGI.A0B(C8j4.A0Y(4293310540L), 4294963396L)), C3cG.A0r(AuraReactionAnimationKt.MirrorBallEmoji, AGI.A0E(C60P.A04(j6), C60P.A04(j5), C60P.A04(j4))), C3cG.A0r(AuraReactionAnimationKt.GoatEmoji, AGI.A0E(C8j4.A0Y(4287262546L), C8j4.A0Y(4291078532L), C8j4.A0Y(4293450952L)))}, 0, hxEArr, 27, 5);
        ByEmoji = AGH.A0D(hxEArr);
    }

    public final AHD<B6A> colorsFor(String str) {
        AHD<B6A> ahd = ByEmoji.get(str);
        return ahd == null ? Fallback : ahd;
    }
}
