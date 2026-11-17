package com.facebook.aura.conversation.view;

import X.AbstractC0878AGe;
import X.AbstractC0882AGj;
import X.AbstractC5321DgF;
import X.AbstractC7609F5w;
import X.C3cG;
import X.F0C;
import com.facebook.aura.R;
import com.facebook.aura.components.reactions.AuraReactionAnimationKt;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes6.dex */
public abstract class HatchReactionDataKt {
    public static final String CUSTOM_REACTION_NEIGHBOUR_EMOJI = "\u1f60d";
    public static final List<String> DEFAULT_REACTION_EMOJIS;
    public static final List<EmojiCategory> EMOJI_CATEGORIES;
    public static final F0C EMOJI_KEYWORDS$delegate;
    public static final List<String> FREQUENTLY_USED_EMOJIS;
    public static final int FREQUENTLY_USED_LIMIT = 16;
    public static final int GRID_COLUMNS = 8;
    public static final int REACTION_TRAY_LIMIT = 12;
    public static final int REACTION_TRAY_PINNED_COUNT = 6;
    public static final Set<String> RENDERABLE_REACTION_EMOJIS;
    public static final String SMILEYS_CATEGORY_ID = "smileys";

    static {
        List<String> listAsList = Arrays.asList("\u1f44d", "\u2764\ufe0f", AuraReactionAnimationKt.LaughEmoji, AuraReactionAnimationKt.OpenMouthEmoji, AuraReactionAnimationKt.CryingEmoji, AuraReactionAnimationKt.FoldedHandsEmoji, AuraReactionAnimationKt.FireEmoji, AuraReactionAnimationKt.PartyPopperEmoji, AuraReactionAnimationKt.ClappingHandsEmoji, "\u1f60d", AuraReactionAnimationKt.HundredEmoji, AuraReactionAnimationKt.ThinkingEmoji);
        DEFAULT_REACTION_EMOJIS = listAsList;
        String[] strArr = new String[83];
        System.arraycopy(new String[]{"\u1f600", "\u1f603", "\u1f604", "\u1f601", "\u1f606", "\u1f605", AuraReactionAnimationKt.LaughEmoji, "\u1f923", "\u1f60a", "\u1f607", "\u1f642", "\u1f643", AuraReactionAnimationKt.MeltingFaceEmoji, "\u1f609", "\u1f60c", "\u1f60d", "\u1f970", "\u1f618", "\u1f617", "\u1f619", "\u1f61a", "\u1f60b", "\u1f61b", "\u1f61c", "\u1f92a", "\u1f61d", "\u1f911"}, 0, strArr, 0, 27);
        System.arraycopy(new String[]{"\u1f917", "\u1f92d", AuraReactionAnimationKt.SaluteEmoji, "\u1f92b", AuraReactionAnimationKt.ThinkingEmoji, "\u1f910", "\u1f928", "\u1f610", "\u1f611", "\u1f636", "\u1f60f", "\u1f612", "\u1f644", AuraReactionAnimationKt.GrimaceEmoji, "\u1f925", "\u1f629", "\u1f614", "\u1f62a", "\u1f924", "\u1f634", "\u1f637", "\u1f912", "\u1f915", "\u1f922", "\u1f92e", "\u1f927", "\u1f975"}, 0, strArr, 27, 27);
        System.arraycopy(new String[]{"\u1f976", "\u1f974", "\u1f635", AuraReactionAnimationKt.ExplodingHeadEmoji, "\u1f920", "\u1f973", "\u1f978", "\u1f60e", "\u1f913", "\u1f9d0", "\u1f615", "\u1f61f", "\u1f641", "\u2639\ufe0f", AuraReactionAnimationKt.OpenMouthEmoji, "\u1f62f", "\u1f632", "\u1f633", "\u1f97a", "\u1f626", "\u1f627", "\u1f628", "\u1f630", "\u1f625", AuraReactionAnimationKt.CryingEmoji, AuraReactionAnimationKt.LoudlyCryingEmoji, AuraReactionAnimationKt.HoldingBackTearsEmoji}, 0, strArr, 54, 27);
        System.arraycopy(new String[]{"\u1f631", "\u1f616"}, 0, strArr, 81, 2);
        EmojiCategory emojiCategory = new EmojiCategory(SMILEYS_CATEGORY_ID, "\u1f600", R.string._name_removed__res_0x7f1209c3, Arrays.asList(strArr));
        String[] strArr2 = new String[35];
        System.arraycopy(new String[]{"\u1f44d", "\u1f44e", "\u1f44a", "\u270a", "\u1f91b", "\u1f91c", AuraReactionAnimationKt.ClappingHandsEmoji, "\u1f64c", "\u1f450", "\u1f932", AuraReactionAnimationKt.HeartHandsEmoji, "\u1f91d", AuraReactionAnimationKt.FoldedHandsEmoji, "\u270d\ufe0f", "\u1f485", "\u1f933", AuraReactionAnimationKt.FlexedBicepsEmoji, "\u1f448", "\u1f449", "\u261d\ufe0f", "\u1f446", "\u1f447", "\u270c\ufe0f", "\u1f91e", "\u1f91f", "\u1f918", "\u1f44c"}, 0, strArr2, 0, 27);
        System.arraycopy(new String[]{"\u1f90c", "\u1f90f", "\u1f44b", "\u1f919", "\u1f596", "\u270b", "\u1f91a", "\u1f590\ufe0f"}, 0, strArr2, 27, 8);
        EmojiCategory emojiCategory2 = new EmojiCategory("gestures", "\u1f44d", R.string._name_removed__res_0x7f1209c1, Arrays.asList(strArr2));
        String[] strArr3 = new String[37];
        System.arraycopy(new String[]{"\u1f476", "\u1f9d2", "\u1f466", "\u1f467", "\u1f9d1", "\u1f471", "\u1f468", "\u1f9d4", "\u1f469", "\u1f9d3", "\u1f474", "\u1f475", "\u1f46e", "\u1f575\ufe0f", "\u1f482", "\u1f977", "\u1f477", AuraReactionAnimationKt.CrownEmoji, "\u1f934", "\u1f478", "\u1f473", "\u1f935", "\u1f470", "\u1f930", "\u1f931", "\u1f47c", "\u1f385"}, 0, strArr3, 0, 27);
        System.arraycopy(new String[]{"\u1f936", "\u1f9b8", "\u1f9b9", "\u1f9d9", "\u1f9da", "\u1f9db", "\u1f9dc", "\u1f9dd", "\u1f9de", "\u1f9df"}, 0, strArr3, 27, 10);
        EmojiCategory emojiCategory3 = new EmojiCategory("people", "\u1f468", R.string._name_removed__res_0x7f1209c2, Arrays.asList(strArr3));
        String[] strArr4 = new String[51];
        System.arraycopy(new String[]{"\u1f436", "\u1f431", "\u1f42d", "\u1f439", "\u1f430", "\u1f98a", "\u1f43b", "\u1f43c", "\u1f428", "\u1f42f", "\u1f981", "\u1f434", "\u1f984", "\u1f42e", "\u1f437", "\u1f43d", AuraReactionAnimationKt.GoatEmoji, "\u1f438", "\u1f435", "\u1f648", "\u1f649", "\u1f64a", "\u1f412", "\u1f414", "\u1f427", "\u1f426", "\u1f985"}, 0, strArr4, 0, 27);
        AbstractC7609F5w.A1F(new String[]{"\u1f986", "\u1f989", "\u1f99a", "\u1f99c", "\u1f40a", "\u1f422", "\u1f40d", "\u1f432", "\u1f409", "\u1f995", "\u1f996", "\u1f433", "\u1f40b", "\u1f42c", "\u1f41f", "\u1f420", "\u1f421", "\u1f419", "\u1f41a", "\u1f40c", HatchLetterWidgetKt.DefaultLetterEmoji, "\u1f41b", "\u1f41c", "\u1f41d"}, strArr4);
        EmojiCategory emojiCategory4 = new EmojiCategory("animals", "\u1f436", R.string._name_removed__res_0x7f1209bf, Arrays.asList(strArr4));
        String[] strArr5 = new String[49];
        System.arraycopy(new String[]{"\u1f34f", "\u1f34e", "\u1f350", "\u1f34a", "\u1f34b", "\u1f34c", "\u1f349", "\u1f347", "\u1f353", "\u1fad0", "\u1f348", "\u1f352", "\u1f351", "\u1f96d", "\u1f34d", "\u1f965", "\u1f95d", "\u1f345", "\u1f346", "\u1f951", "\u1f966", "\u1f955", "\u1f33d", "\u1f336\ufe0f", "\u1f952", "\u1f96c", "\u1f9c5"}, 0, strArr5, 0, 27);
        System.arraycopy(new String[]{"\u1f9c6", "\u1f344", "\u1f95c", "\u1f35e", "\u1f950", "\u1f956", "\u1f968", "\u1f96f", "\u1f9c0", "\u1f356", "\u1f357", "\u1f969", "\u1f953", "\u1f354", "\u1f35f", "\u1f355", "\u1f32d", "\u1f96a", "\u1f32e", "\u1f32f", "\u1fad4", "\u1f959"}, 0, strArr5, 27, 22);
        EmojiCategory emojiCategory5 = new EmojiCategory("food", "\u1f354", R.string._name_removed__res_0x7f1209c0, Arrays.asList(strArr5));
        String[] strArr6 = new String[36];
        System.arraycopy(new String[]{"\u26bd", "\u1f3c0", "\u1f3c8", "\u26be", "\u1f94e", "\u1f3be", "\u1f3d0", "\u1f3c9", "\u1f94f", "\u1fa83", "\u1f3b1", AuraReactionAnimationKt.MirrorBallEmoji, "\u1f3d3", "\u1f3f8", "\u1f3d2", "\u1f3d1", "\u1f94d", "\u1f3af", "\u26f3", "\u1f94a", "\u1f94b", "\u1f3bd", "\u26f8", "\u1f6f7", "\u1f3bf", "\u26f7", "\u1f3c2"}, 0, strArr6, 0, 27);
        System.arraycopy(new String[]{"\u1fa82", "\u1f3cb\ufe0f", "\u1f3c4", "\u1f3ca", "\u1f6a3", "\u1f9d7", AuraReactionAnimationKt.TrophyEmoji, "\u1f3c5", "\u1f396\ufe0f"}, 0, strArr6, 27, 9);
        EmojiCategory emojiCategory6 = new EmojiCategory("activities", "\u26bd", R.string._name_removed__res_0x7f1209be, Arrays.asList(strArr6));
        String[] strArr7 = new String[35];
        System.arraycopy(new String[]{"\u1f697", "\u1f695", "\u1f699", "\u1f68c", "\u1f68e", "\u1f3ce", "\u1f693", "\u1f691", "\u1f692", "\u1f6f5", "\u1f3cd", "\u1f6b2", "\u1f6f4", "\u1f6f9", "\u1f6fa", "\u1f681", "\u1f682", "\u1f686", "\u1f687", "\u2708\ufe0f", "\u1f6eb", "\u1f6ec", AuraReactionAnimationKt.RocketEmoji, "\u1f6f8", "\u1f6a2", "\u26f5", "\u1f3d6"}, 0, strArr7, 0, 27);
        System.arraycopy(new String[]{"\u1f3dd", "\u1f3d4", "\u26f0", "\u1f30b", "\u1f3d5", "\u1f3e0", "\u1f3d9", "\u1f307"}, 0, strArr7, 27, 8);
        EmojiCategory emojiCategory7 = new EmojiCategory("travel", "\u2708\ufe0f", R.string._name_removed__res_0x7f1209c5, Arrays.asList(strArr7));
        String[] strArr8 = new String[47];
        System.arraycopy(new String[]{"\u2764\ufe0f", "\u1f9e1", "\u1f49b", "\u1f49a", "\u1f499", "\u1f49c", "\u1f5a4", "\u1f90d", "\u1f90e", "\u1f498", "\u1f49d", "\u1f496", "\u1f497", "\u1f493", "\u1f49e", "\u1f495", "\u1f49f", "\u2763\ufe0f", "\u1f494", "\u2764\ufe0f\u200d\u1f525", "\u2764\ufe0f\u200d\u1fa79", "\u2665\ufe0f", "\u1f48b", AuraReactionAnimationKt.HundredEmoji, "\u1f4a2", "\u1f4a5", "\u1f4ab"}, 0, strArr8, 0, 27);
        System.arraycopy(new String[]{"\u1f4a6", "\u1f4a8", "\u1f573\ufe0f", "\u1f4ac", "\u1f4ad", "\u1f4a4", "\u2728", "\u1f31f", AuraReactionAnimationKt.HighVoltageEmojiUnqualified, AuraReactionAnimationKt.FireEmoji, AuraReactionAnimationKt.StarBareEmoji, AuraReactionAnimationKt.RainbowEmoji, "\u1f31e", "\u1f31d", "\u1f31b", "\u1f31c", "\u1f319", "\u2705", "\u274c", "\u274e"}, 0, strArr8, 27, 20);
        List<EmojiCategory> listAsList2 = Arrays.asList(emojiCategory, emojiCategory2, emojiCategory3, emojiCategory4, emojiCategory5, emojiCategory6, emojiCategory7, new EmojiCategory("symbols", "\u2764\ufe0f", R.string._name_removed__res_0x7f1209c4, Arrays.asList(strArr8)));
        EMOJI_CATEGORIES = listAsList2;
        ArrayList arrayListA0h = C3cG.A0h();
        Iterator<EmojiCategory> it = listAsList2.iterator();
        while (it.hasNext()) {
            AbstractC0882AGj.A0r(it.next().emojis, arrayListA0h);
        }
        RENDERABLE_REACTION_EMOJIS = AbstractC0878AGe.A0g(AbstractC0878AGe.A0P(arrayListA0h, listAsList));
        EMOJI_KEYWORDS$delegate = AbstractC5321DgF.A03(HatchReactionDataKt$EMOJI_KEYWORDS$2.INSTANCE);
        FREQUENTLY_USED_EMOJIS = DEFAULT_REACTION_EMOJIS;
    }

    public static final List<String> getDEFAULT_REACTION_EMOJIS() {
        return DEFAULT_REACTION_EMOJIS;
    }

    public static final List<EmojiCategory> getEMOJI_CATEGORIES() {
        return EMOJI_CATEGORIES;
    }

    public static final Map<String, String> getEMOJI_KEYWORDS() {
        return (Map) EMOJI_KEYWORDS$delegate.getValue();
    }

    public static final List<String> getFREQUENTLY_USED_EMOJIS() {
        return FREQUENTLY_USED_EMOJIS;
    }

    public static final Set<String> getRENDERABLE_REACTION_EMOJIS() {
        return RENDERABLE_REACTION_EMOJIS;
    }
}
