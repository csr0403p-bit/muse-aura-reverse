package com.facebook.aura.components.reactions;

import X.AKO;
import X.AbstractC1798ArH;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.BBI;
import X.BFM;
import X.BRg;
import X.BS0;
import X.C3cG;
import X.C60Q;
import X.C78N;
import X.C8j3;
import X.C8j4;
import android.content.Context;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.facebook.aura.components.confetti.AuraConfettiBurstKt;
import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public abstract class AuraReactionAnimationKt {
    public static final String ClappingHandsEmoji = "\u1f44f";
    public static final String CrownEmoji = "\u1f451";
    public static final String CryingEmoji = "\u1f622";
    public static final String ExplodingHeadEmoji = "\u1f92f";
    public static final String FireEmoji = "\u1f525";
    public static final String FlexedBicepsEmoji = "\u1f4aa";
    public static final String FoldedHandsEmoji = "\u1f64f";
    public static final String GoatEmoji = "\u1f410";
    public static final String GrimaceEmoji = "\u1f62c";
    public static final String HatchFacebookLikeReaction = "hatch:facebook_thumbs_up_v1";
    public static final String HatchHeartReaction = "hatch:heart_v1";
    public static final String HeartEmoji = "\u2764\ufe0f";
    public static final String HeartEmojiUnqualified = "\u2764";
    public static final String HeartEyesEmoji = "\u1f60d";
    public static final String HeartHandsEmoji = "\u1faf6";
    public static final String HighVoltageEmoji = "\u26a1\ufe0f";
    public static final String HighVoltageEmojiUnqualified = "\u26a1";
    public static final String HoldingBackTearsEmoji = "\u1f979";
    public static final String HundredEmoji = "\u1f4af";
    public static final String LaughEmoji = "\u1f602";
    public static final String LoudlyCryingEmoji = "\u1f62d";
    public static final String MeltingFaceEmoji = "\u1fae0";
    public static final String MirrorBallEmoji = "\u1faa9";
    public static final String OpenMouthEmoji = "\u1f62e";
    public static final String PartyPopperEmoji = "\u1f389";
    public static final String RainbowEmoji = "\u1f308";
    public static final String RocketEmoji = "\u1f680";
    public static final String SaluteEmoji = "\u1fae1";
    public static final String StarBareEmoji = "\u2b50";
    public static final String StarEmoji = "\u2b50\ufe0f";
    public static final String ThinkingEmoji = "\u1f914";
    public static final String TrophyEmoji = "\u1f3c6";

    public static final BRg auraReactionAnimation(BRg bRg, AuraReactionAnimation auraReactionAnimation, String str, boolean z, BFM bfm, int i) {
        int i2;
        BRg bRgAuraCelebrationBlast;
        boolean zA1b = AnonymousClass004.A1b(bRg, auraReactionAnimation);
        switch (auraReactionAnimation.ordinal()) {
            case 0:
                i2 = 1175774801;
                AnonymousClass003.A0l(bfm, i2);
                return bRg;
            case 1:
                bRgAuraCelebrationBlast = AuraColorSprinkleKt.auraColorSprinkle(bRg, z, C8j4.A1C(bfm, str, 1175776620), bfm, C8j4.A05(i));
                AnonymousClass001.A1D(bfm);
                return bRgAuraCelebrationBlast;
            case 2:
                bRgAuraCelebrationBlast = AuraHeartBurstKt.auraHeartBurst(bRg, z, bfm, C8j4.A0A(1175779811, bfm, i));
                AnonymousClass001.A1D(bfm);
                return bRgAuraCelebrationBlast;
            case 3:
                bRgAuraCelebrationBlast = AuraHeartScatterKt.auraHeartScatter(bRg, z, bfm, C8j4.A0A(1175781989, bfm, i));
                AnonymousClass001.A1D(bfm);
                return bRgAuraCelebrationBlast;
            case 4:
                bRgAuraCelebrationBlast = AuraConfettiBurstKt.m372auraConfettiBurstiHT50w(bRg, z, null, zA1b ? 1 : 0, 0.0f, null, null, bfm, C8j4.A0A(1175784079, bfm, i), 62);
                AnonymousClass001.A1D(bfm);
                return bRgAuraCelebrationBlast;
            case 5:
                bRgAuraCelebrationBlast = AuraFireSmokeBurstKt.auraFireSmokeBurst(bRg, z, bfm, C8j4.A0A(1175786535, bfm, i));
                AnonymousClass001.A1D(bfm);
                return bRgAuraCelebrationBlast;
            case 6:
                bRgAuraCelebrationBlast = AuraLaughShakeKt.auraLaughTears(bRg, z, bfm, C8j4.A0A(1175788579, bfm, i));
                AnonymousClass001.A1D(bfm);
                return bRgAuraCelebrationBlast;
            case 7:
                i2 = 1175792657;
                AnonymousClass003.A0l(bfm, i2);
                return bRg;
            case 8:
                bRgAuraCelebrationBlast = AuraRedlineKt.auraRedlineStroke(bRg, z, bfm, C8j4.A0A(1175794086, bfm, i));
                AnonymousClass001.A1D(bfm);
                return bRgAuraCelebrationBlast;
            case 9:
                bRgAuraCelebrationBlast = AuraSaluteKt.auraSaluteGlint(bRg, z, C8j4.A1C(bfm, str, 1175796170), bfm, C8j4.A05(i));
                AnonymousClass001.A1D(bfm);
                return bRgAuraCelebrationBlast;
            case 10:
                bRgAuraCelebrationBlast = AuraTearJewelKt.auraTearJewel(bRg, z, bfm, C8j4.A0A(1175799458, bfm, i));
                AnonymousClass001.A1D(bfm);
                return bRgAuraCelebrationBlast;
            case 11:
                bRgAuraCelebrationBlast = AuraTinyWaterfallKt.auraTinyWaterfall(bRg, z, bfm, C8j4.A0A(1175801638, bfm, i));
                AnonymousClass001.A1D(bfm);
                return bRgAuraCelebrationBlast;
            case 12:
                bRgAuraCelebrationBlast = AuraHeartEyesKt.auraHeartEyes(bRg, z, bfm, C8j4.A0A(1175803810, bfm, i));
                AnonymousClass001.A1D(bfm);
                return bRgAuraCelebrationBlast;
            case 13:
                bRgAuraCelebrationBlast = AuraLittleWishKt.auraLittleWish(bRg, z, bfm, C8j4.A0A(1175805891, bfm, i));
                AnonymousClass001.A1D(bfm);
                return bRgAuraCelebrationBlast;
            case 14:
                bfm.AgE(1175812070);
                int i3 = (i >> 6) & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX;
                bRgAuraCelebrationBlast = AuraBlessingBloomKt.auraBlessingBloom(AuraLittleWishKt.auraLittleWish(bRg, z, bfm, (i & 14) | i3), z, bfm, i3);
                AnonymousClass001.A1D(bfm);
                return bRgAuraCelebrationBlast;
            case 15:
                bRgAuraCelebrationBlast = AuraSingleClapKt.auraSingleClap(bRg, z, bfm, C8j4.A0A(1175814275, bfm, i));
                AnonymousClass001.A1D(bfm);
                return bRgAuraCelebrationBlast;
            case 16:
                bRgAuraCelebrationBlast = AuraThinkingDotsKt.auraThinkingDots(bRg, z, bfm, C8j4.A0A(1175816453, bfm, i));
                AnonymousClass001.A1D(bfm);
                return bRgAuraCelebrationBlast;
            case 17:
                bRgAuraCelebrationBlast = AuraFlexKt.auraFlex(bRg, z, bfm, C8j4.A0A(1175818397, bfm, i));
                AnonymousClass001.A1D(bfm);
                return bRgAuraCelebrationBlast;
            case 18:
                bRgAuraCelebrationBlast = AuraColorScatterKt.auraColorScatter(bRg, z, C8j4.A1C(bfm, str, 1175820747), bfm, C8j4.A05(i));
                AnonymousClass001.A1D(bfm);
                return bRgAuraCelebrationBlast;
            case 19:
                bRgAuraCelebrationBlast = AuraGlyphScatterKt.auraGlyphScatter(bRg, z, str, bfm, C8j4.A0A(1175824172, bfm, i) | (i & 896));
                AnonymousClass001.A1D(bfm);
                return bRgAuraCelebrationBlast;
            case 20:
                bRgAuraCelebrationBlast = AuraSingleTearKt.auraSingleTear(bRg, z, bfm, C8j4.A0A(1175826563, bfm, i));
                AnonymousClass001.A1D(bfm);
                return bRgAuraCelebrationBlast;
            case 21:
                bRgAuraCelebrationBlast = AuraLightningLatchKt.auraLightningLatch(bRg, z, C8j4.A1C(bfm, str, 1175829165), bfm, C8j4.A05(i));
                AnonymousClass001.A1D(bfm);
                return bRgAuraCelebrationBlast;
            case 22:
                bRgAuraCelebrationBlast = AuraMicroLaunchKt.auraMicroLaunch(bRg, z, C8j4.A1C(bfm, str, 1175832970), bfm, C8j4.A05(i));
                AnonymousClass001.A1D(bfm);
                return bRgAuraCelebrationBlast;
            case 23:
                bRgAuraCelebrationBlast = AuraPressureReleaseKt.auraPressureRelease(bRg, z, C8j4.A1C(bfm, str, 1175836814), bfm, C8j4.A05(i));
                AnonymousClass001.A1D(bfm);
                return bRgAuraCelebrationBlast;
            case 24:
                bRgAuraCelebrationBlast = AuraMeltReformKt.auraMeltReform(bRg, z, C8j4.A1C(bfm, str, 1175840617), bfm, C8j4.A05(i));
                AnonymousClass001.A1D(bfm);
                return bRgAuraCelebrationBlast;
            case 25:
                bRgAuraCelebrationBlast = AuraGatheredHeartKt.auraGatheredHeart(bRg, z, C8j4.A1C(bfm, str, 1175844364), bfm, C8j4.A05(i));
                AnonymousClass001.A1D(bfm);
                return bRgAuraCelebrationBlast;
            case 26:
                bRgAuraCelebrationBlast = AuraRibbonArcKt.auraRibbonArc(bRg, z, C8j4.A1C(bfm, str, 1175848072), bfm, C8j4.A05(i));
                AnonymousClass001.A1D(bfm);
                return bRgAuraCelebrationBlast;
            case 27:
                bRgAuraCelebrationBlast = AuraShootingStarKt.auraShootingStar(bRg, z, C8j4.A1C(bfm, str, 1175851755), bfm, C8j4.A05(i));
                AnonymousClass001.A1D(bfm);
                return bRgAuraCelebrationBlast;
            case 28:
                bRgAuraCelebrationBlast = AuraCrownDropKt.auraCrownDrop(bRg, z, C8j4.A1C(bfm, str, 1175855432), bfm, C8j4.A05(i));
                AnonymousClass001.A1D(bfm);
                return bRgAuraCelebrationBlast;
            case 29:
                bRgAuraCelebrationBlast = AuraVictoryGleamKt.auraVictoryGleam(bRg, z, C8j4.A1C(bfm, str, 1175859115), bfm, C8j4.A05(i));
                AnonymousClass001.A1D(bfm);
                return bRgAuraCelebrationBlast;
            case 30:
                bRgAuraCelebrationBlast = AuraDiscoFlashKt.auraDiscoFlash(bRg, z, C8j4.A1C(bfm, str, 1175862825), bfm, C8j4.A05(i));
                AnonymousClass001.A1D(bfm);
                return bRgAuraCelebrationBlast;
            case 31:
                bRgAuraCelebrationBlast = AuraSecretGoatKt.auraSecretGoat(bRg, z, C8j4.A1C(bfm, str, 1175866473), bfm, C8j4.A05(i));
                AnonymousClass001.A1D(bfm);
                return bRgAuraCelebrationBlast;
            case 32:
                bRgAuraCelebrationBlast = AuraDoubleTakeKt.auraDoubleTake(bRg, z, bfm, C8j4.A0A(1175869763, bfm, i));
                AnonymousClass001.A1D(bfm);
                return bRgAuraCelebrationBlast;
            case 33:
                bRgAuraCelebrationBlast = AuraCelebrationBlastKt.auraCelebrationBlast(bRg, z, bfm, C8j4.A0A(1175872073, bfm, i));
                AnonymousClass001.A1D(bfm);
                return bRgAuraCelebrationBlast;
            case 34:
                i2 = 1175879793;
                AnonymousClass003.A0l(bfm, i2);
                return bRg;
            default:
                throw AnonymousClass005.A0k(bfm, 1175776383);
        }
    }

    public static final AuraReactionEffects rememberAuraReactionEffects(String str, Function0<Boolean> function0, BFM bfm, int i, int i2) {
        Function0<Boolean> function02 = function0;
        if ((i2 & 2) != 0) {
            Object objAaT = bfm.AaT();
            if (objAaT == C78N.A00) {
                objAaT = AuraReactionAnimationKt$rememberAuraReactionEffects$1$1.INSTANCE;
                bfm.Ai0(objAaT);
            }
            function02 = (Function0) objAaT;
        }
        Object objAaT2 = bfm.AaT();
        Object obj = C78N.A00;
        if (objAaT2 == obj) {
            objAaT2 = AbstractC1798ArH.A07(null, bfm);
        }
        MutableState mutableState = (MutableState) objAaT2;
        Object objAaT3 = bfm.AaT();
        boolean z = true;
        if (objAaT3 == obj) {
            objAaT3 = AbstractC1798ArH.A07(true, bfm);
        }
        MutableState mutableState2 = (MutableState) objAaT3;
        if ((((i & 14) ^ 6) <= 4 || !bfm.A65(str)) && (i & 6) != 4) {
            z = false;
        }
        Object objAaT4 = bfm.AaT();
        if (z || objAaT4 == obj) {
            objAaT4 = new AuraReactionAnimationKt$rememberAuraReactionEffects$2$1(str, mutableState2, mutableState, null);
            BBI.A0T(bfm, objAaT4);
        }
        AnonymousClass001.A18(bfm, objAaT4, str);
        bfm.Ag8(622644096, mutableState.getValue());
        MutableState mutableState3 = (MutableState) C8j3.A0z(bfm, obj, false);
        AuraReactionAnimation auraReactionAnimationForEmoji = (mutableState.getValue() == null || !AnonymousClass003.A1Y(function02)) ? AuraReactionAnimation.NONE : AuraReactionAnimation.Companion.forEmoji(MutableState.A05(mutableState));
        BBI bbi = (BBI) bfm;
        Context contextA00 = AKO.A00(AndroidCompositionLocals_androidKt.A01, bbi);
        Unit unit = Unit.INSTANCE;
        boolean zA1H = AnonymousClass003.A1H(bfm, auraReactionAnimationForEmoji, bfm.A67(contextA00));
        Object objAaT5 = bfm.AaT();
        if (zA1H || objAaT5 == obj) {
            objAaT5 = new AuraReactionAnimationKt$rememberAuraReactionEffects$3$1(contextA00, auraReactionAnimationForEmoji, mutableState, mutableState3, null);
            BBI.A0O(bbi, objAaT5);
        }
        AnonymousClass001.A18(bfm, objAaT5, unit);
        BS0 bs0 = BRg.A00;
        AuraReactionEffects auraReactionEffects = new AuraReactionEffects(auraReactionAnimation(bs0, auraReactionAnimationForEmoji, MutableState.A05(mutableState), MutableState.A0A(mutableState3), bfm, 6), auraReactionGlyphAnimation(bs0, auraReactionAnimationForEmoji, MutableState.A0A(mutableState3), bfm, 6));
        BBI.A0R(bbi, false);
        return auraReactionEffects;
    }

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AuraReactionAnimation.values().length];
            try {
                AnonymousClass002.A13(AuraReactionAnimation.NONE, iArr);
            } catch (NoSuchFieldError unused) {
            }
            try {
                AnonymousClass002.A14(AuraReactionAnimation.HEART, iArr);
            } catch (NoSuchFieldError unused2) {
            }
            try {
                AnonymousClass002.A15(AuraReactionAnimation.CONFETTI, iArr);
            } catch (NoSuchFieldError unused3) {
            }
            try {
                AnonymousClass002.A16(AuraReactionAnimation.FIRE_SMOKE, iArr);
            } catch (NoSuchFieldError unused4) {
            }
            try {
                AnonymousClass002.A17(AuraReactionAnimation.SPRINKLE, iArr);
            } catch (NoSuchFieldError unused5) {
            }
            try {
                AnonymousClass002.A18(AuraReactionAnimation.HEART_SCATTER, iArr);
            } catch (NoSuchFieldError unused6) {
            }
            try {
                AnonymousClass006.A1G(AuraReactionAnimation.LAUGH, iArr);
            } catch (NoSuchFieldError unused7) {
            }
            try {
                AnonymousClass006.A1H(AuraReactionAnimation.AWKWARD, iArr);
            } catch (NoSuchFieldError unused8) {
            }
            try {
                AnonymousClass006.A1I(AuraReactionAnimation.REDLINE, iArr);
            } catch (NoSuchFieldError unused9) {
            }
            try {
                AnonymousClass006.A1J(AuraReactionAnimation.SALUTE, iArr);
            } catch (NoSuchFieldError unused10) {
            }
            try {
                AnonymousClass006.A1K(AuraReactionAnimation.TEAR_JEWEL, iArr);
            } catch (NoSuchFieldError unused11) {
            }
            try {
                AnonymousClass006.A1L(AuraReactionAnimation.TINY_WATERFALL, iArr);
            } catch (NoSuchFieldError unused12) {
            }
            try {
                C60Q.A1C(AuraReactionAnimation.HEART_EYES, iArr);
            } catch (NoSuchFieldError unused13) {
            }
            try {
                C60Q.A1D(AuraReactionAnimation.LITTLE_WISH, iArr);
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[AuraReactionAnimation.BLESSING_BLOOM.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr[AuraReactionAnimation.SINGLE_CLAP.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr[AuraReactionAnimation.THINKING_DOTS.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr[AuraReactionAnimation.FLEX.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr[AuraReactionAnimation.COLOR_SCATTER.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr[AuraReactionAnimation.GLYPH_SCATTER.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr[AuraReactionAnimation.SINGLE_TEAR.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                iArr[AuraReactionAnimation.LIGHTNING_LATCH.ordinal()] = 22;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                iArr[AuraReactionAnimation.MICRO_LAUNCH.ordinal()] = 23;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                iArr[AuraReactionAnimation.PRESSURE_RELEASE.ordinal()] = 24;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                iArr[AuraReactionAnimation.MELT_REFORM.ordinal()] = 25;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                iArr[AuraReactionAnimation.GATHERED_HEART.ordinal()] = 26;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                iArr[AuraReactionAnimation.RIBBON_ARC.ordinal()] = 27;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                iArr[AuraReactionAnimation.SHOOTING_STAR.ordinal()] = 28;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                iArr[AuraReactionAnimation.CROWN_DROP.ordinal()] = 29;
            } catch (NoSuchFieldError unused29) {
            }
            try {
                iArr[AuraReactionAnimation.VICTORY_GLEAM.ordinal()] = 30;
            } catch (NoSuchFieldError unused30) {
            }
            try {
                iArr[AuraReactionAnimation.DISCO_FLASH.ordinal()] = 31;
            } catch (NoSuchFieldError unused31) {
            }
            try {
                iArr[AuraReactionAnimation.SECRET_GOAT.ordinal()] = 32;
            } catch (NoSuchFieldError unused32) {
            }
            try {
                iArr[AuraReactionAnimation.DOUBLE_TAKE.ordinal()] = 33;
            } catch (NoSuchFieldError unused33) {
            }
            try {
                iArr[AuraReactionAnimation.CELEBRATION_BLAST.ordinal()] = 34;
            } catch (NoSuchFieldError unused34) {
            }
            try {
                iArr[AuraReactionAnimation.SUNSET_WASH.ordinal()] = 35;
            } catch (NoSuchFieldError unused35) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final BRg auraReactionGlyphAnimation(BRg bRg, AuraReactionAnimation auraReactionAnimation, boolean z, BFM bfm, int i) {
        AnonymousClass003.A0u(bRg, auraReactionAnimation);
        switch (auraReactionAnimation.ordinal()) {
            case 0:
            case 2:
            case 4:
            case 5:
                bfm.AgE(803562128);
                break;
            case 1:
                bRg = AuraColorSprinkleKt.auraColorSprinkleGlyph(bRg, z, bfm, C8j4.A09(803563594, bfm, i));
                break;
            case 3:
                bRg = AuraHeartScatterKt.auraHeartScatterGlyph(bRg, z, bfm, C8j4.A09(803566025, bfm, i));
                break;
            case 6:
                bRg = AuraLaughShakeKt.auraLaughShakeGlyph(bRg, z, bfm, C8j4.A09(803568167, bfm, i));
                break;
            case 7:
                bRg = AuraAwkwardShiverKt.auraAwkwardShiverGlyph(bRg, z, bfm, C8j4.A09(803570314, bfm, i));
                break;
            case 8:
                bRg = AuraRedlineKt.auraRedlineGlyph(bRg, z, bfm, C8j4.A09(803572548, bfm, i));
                break;
            case 9:
                bRg = AuraSaluteKt.auraSaluteGlyph(bRg, z, bfm, C8j4.A09(803574563, bfm, i));
                break;
            case 10:
                bRg = AuraTearJewelKt.auraTearJewelGlyph(bRg, z, bfm, C8j4.A09(803576678, bfm, i));
                break;
            case 11:
                bRg = AuraTinyWaterfallKt.auraTinyWaterfallGlyph(bRg, z, bfm, C8j4.A09(803579018, bfm, i));
                break;
            case 12:
                bRg = AuraHeartEyesKt.auraHeartEyesGlyph(bRg, z, bfm, C8j4.A09(803581350, bfm, i));
                break;
            case 13:
                bRg = AuraLittleWishKt.auraLittleWishGlyph(bRg, z, bfm, C8j4.A09(803583591, bfm, i));
                break;
            case 14:
                int iA09 = C8j4.A09(803585962, bfm, i);
                int i2 = AuraBlessingBloomKt.BLESSING_BLOOM_TOTAL_MS;
                bRg = AuraLittleWishKt.auraLittleWishGlyph(bRg, z, bfm, iA09 & 126);
                break;
            case 15:
                bRg = AuraSingleClapKt.auraSingleClapGlyph(bRg, z, bfm, C8j4.A09(803588327, bfm, i));
                break;
            case 16:
                bRg = AuraThinkingDotsKt.auraThinkingDotsGlyph(bRg, z, bfm, C8j4.A09(803590665, bfm, i));
                break;
            case 17:
                bRg = AuraFlexKt.auraFlexGlyph(bRg, z, bfm, C8j4.A09(803592769, bfm, i));
                break;
            case 18:
                bRg = AuraColorScatterKt.auraColorScatterGlyph(bRg, z, bfm, C8j4.A09(803594921, bfm, i));
                break;
            case 19:
                bRg = AuraGlyphScatterKt.auraGlyphScatterGlyph(bRg, z, bfm, C8j4.A09(803597321, bfm, i));
                break;
            case 20:
                bRg = AuraSingleTearKt.auraSingleTearGlyph(bRg, z, bfm, C8j4.A09(803599655, bfm, i));
                break;
            case 21:
                bRg = AuraLightningLatchKt.auraLightningLatchGlyph(bRg, z, bfm, C8j4.A09(803602059, bfm, i));
                break;
            case 22:
                bRg = AuraMicroLaunchKt.auraMicroLaunchGlyph(bRg, z, bfm, C8j4.A09(803604488, bfm, i));
                break;
            case 23:
                bRg = AuraPressureReleaseKt.auraPressureReleaseGlyph(bRg, z, bfm, C8j4.A09(803606956, bfm, i));
                break;
            case 24:
                bRg = AuraMeltReformKt.auraMeltReformGlyph(bRg, z, bfm, C8j4.A09(803609383, bfm, i));
                break;
            case 25:
                bRg = AuraGatheredHeartKt.auraGatheredHeartGlyph(bRg, z, bfm, C8j4.A09(803611754, bfm, i));
                break;
            case 26:
                bRg = AuraRibbonArcKt.auraRibbonArcGlyph(bRg, z, bfm, C8j4.A09(803614086, bfm, i));
                break;
            case 27:
                bRg = AuraShootingStarKt.auraShootingStarGlyph(bRg, z, bfm, C8j4.A09(803616393, bfm, i));
                break;
            case 28:
                bRg = AuraCrownDropKt.auraCrownDropGlyph(bRg, z, bfm, C8j4.A09(803618694, bfm, i));
                break;
            case 29:
                bRg = AuraVictoryGleamKt.auraVictoryGleamGlyph(bRg, z, bfm, C8j4.A09(803621001, bfm, i));
                break;
            case 30:
                bRg = AuraDiscoFlashKt.auraDiscoFlashGlyph(bRg, z, bfm, C8j4.A09(803623335, bfm, i));
                break;
            case 31:
                bRg = AuraSecretGoatKt.auraSecretGoatGlyph(bRg, z, bfm, C8j4.A09(803625607, bfm, i));
                break;
            case 32:
                bRg = AuraDoubleTakeKt.auraDoubleTakeGlyph(bRg, z, bfm, C8j4.A09(803627879, bfm, i));
                break;
            case 33:
                bRg = AuraCelebrationBlastKt.auraCelebrationBlastGlyph(bRg, z, bfm, C8j4.A09(803630349, bfm, i));
                break;
            case 34:
                bRg = AuraSunsetWashKt.auraSunsetWashGlyph(bRg, z, bfm, C8j4.A09(803632807, bfm, i));
                break;
            default:
                AnonymousClass004.A1A(bfm, 803559157);
                throw C3cG.A0q();
        }
        AnonymousClass002.A19(bfm);
        return bRg;
    }
}
