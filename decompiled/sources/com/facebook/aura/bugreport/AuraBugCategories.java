package com.facebook.aura.bugreport;

import X.AGI;
import X.AHD;
import com.facebook.aura.R;
import com.facebook.aura.partners.voice.session.impl.VoiceSessionHelpers;

/* loaded from: classes.dex */
public final class AuraBugCategories {
    public static final int $stable = 0;
    public static final AuraBugCategories INSTANCE = new AuraBugCategories();
    public static final AHD<AuraBugCategory> ALL = AGI.A0E(new AuraBugCategory("hatch_accounts_activation", R.string._name_removed__res_0x7f1201d9, R.drawable.circle_user_wght400_outline_24), new AuraBugCategory("hatch_bot_status_activity", R.string._name_removed__res_0x7f1201da, R.drawable.circle_bolt_wght400_filled_24), new AuraBugCategory("hatch_artifacts", R.string._name_removed__res_0x7f1201e4, R.drawable.folder_wght400_outline_24), new AuraBugCategory("hatch_media", R.string._name_removed__res_0x7f1201e0, R.drawable.image_wght400_outline_24), new AuraBugCategory("hatch_connectors_channels", R.string._name_removed__res_0x7f1201db, R.drawable.meta_brand_design_system_icons_vector_star_four_points_outline_24), new AuraBugCategory("hatch_main_chat", R.string._name_removed__res_0x7f1201df, R.drawable.speech_bubble_stack_wght400_outline_24), new AuraBugCategory("hatch_side_chats", R.string._name_removed__res_0x7f1201e3, R.drawable.speech_bubble_wght400_outline_24), new AuraBugCategory("hatch_goals", R.string._name_removed__res_0x7f1201dc, R.drawable.meta_brand_design_system_icons_vector_small_circle_dot_circle_outline_24), new AuraBugCategory("hatch_ideas", R.string._name_removed__res_0x7f1201de, R.drawable.meta_brand_design_system_icons_vector_light_bulb_stardust_outline_24), new AuraBugCategory("hatch_subscriptions", R.string._name_removed__res_0x7f1201e5, R.drawable.credit_card_outline_24), new AuraBugCategory("hatch_settings", R.string._name_removed__res_0x7f1201e2, R.drawable.settings_gear_android_wght400_outline_24), new AuraBugCategory(VoiceSessionHelpers.THREAD_ENTRYPOINT, R.string._name_removed__res_0x7f1201e7, R.drawable.audio_outline_24_wght400), new AuraBugCategory("hatch_home_link", R.string._name_removed__res_0x7f1201dd, R.drawable.meta_icons_2_0_vector_housesignalfan_outline_24_wght400), new AuraBugCategory("hatch_other", R.string._name_removed__res_0x7f1201e1, R.drawable.ellipsis_wght400_outline_24));

    public final AHD<AuraBugCategory> getALL() {
        return ALL;
    }
}
