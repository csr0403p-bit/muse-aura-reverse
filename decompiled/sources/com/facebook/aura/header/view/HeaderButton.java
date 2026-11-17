package com.facebook.aura.header.view;

import X.C06H;
import X.Ey9;
import X.F3w;
import com.facebook.aura.R;
import com.facebook.aura.header.view.HeaderButtonContent;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class HeaderButton {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ HeaderButton[] $VALUES;
    public static final HeaderButton AddGoal;
    public static final HeaderButton Compose;
    public static final HeaderButton EditFeedPrompt;
    public static final HeaderButton Files;
    public static final HeaderButton InviteFriends;
    public static final HeaderButton Library;
    public static final HeaderButton MoreOptions;
    public static final HeaderButton SaveFeedPrompt;
    public static final HeaderButton Search;
    public static final HeaderButton Settings;
    public final HeaderButtonContent content;
    public final Integer standaloneLabelRes;
    public final String testTagId;

    /* JADX WARN: Multi-variable type inference failed */
    static {
        int i = 4;
        String str = "Compose";
        HeaderButton headerButton = new HeaderButton(str, 0, new HeaderButtonContent.Icon(R.drawable.compose_wght400_outline_24, R.string._name_removed__res_0x7f120708, false, false, true), "hatch-compose-button", null, i, 0 == true ? 1 : 0);
        Compose = headerButton;
        int i2 = 4;
        HeaderButton headerButton2 = new HeaderButton("MoreOptions", 1, new HeaderButtonContent.Icon(R.drawable.ellipsis_wght400_outline_24, R.string._name_removed__res_0x7f120704, false, false, true), "hatch-more-options-button", 0 == true ? 1 : 0, i, 0 == true ? 1 : 0);
        MoreOptions = headerButton2;
        HeaderButton headerButton3 = new HeaderButton("Search", 2, new HeaderButtonContent.Icon(R.drawable.ic_magnifying_glass, R.string._name_removed__res_0x7f120e7f, false, false, true), "hatch-search-button", 0 == true ? 1 : 0, i2, 0 == true ? 1 : 0);
        Search = headerButton3;
        HeaderButton headerButton4 = new HeaderButton("Settings", 3, new HeaderButtonContent.Icon(R.drawable.settings_gear_android_wght400_outline_24, R.string._name_removed__res_0x7f1205b8, false, false, true), "hatch-settings-button", 0 == true ? 1 : 0, i2, 0 == true ? 1 : 0);
        Settings = headerButton4;
        HeaderButton headerButton5 = new HeaderButton("InviteFriends", 4, new HeaderButtonContent.Icon(R.drawable.gift_outline_24_wght400, R.string._name_removed__res_0x7f120433, false, false, true), "hatch-invite-friends-button", Integer.valueOf(R.string._name_removed__res_0x7f120433));
        InviteFriends = headerButton5;
        HeaderButton headerButton6 = new HeaderButton("Library", 5, new HeaderButtonContent.Icon(R.drawable.folder_wght400_outline_24, R.string._name_removed__res_0x7f120c63, false, false, true), "hatch-library-button", 0 == true ? 1 : 0, i2, 0 == true ? 1 : 0);
        Library = headerButton6;
        HeaderButton headerButton7 = new HeaderButton("Files", 6, new HeaderButtonContent.Icon(R.drawable.list_bullet_wght400_outline_24, R.string._name_removed__res_0x7f1209f6, false, false, true), "hatch-files-button", 0 == true ? 1 : 0, i2, 0 == true ? 1 : 0);
        Files = headerButton7;
        HeaderButton headerButton8 = new HeaderButton("AddGoal", 7, new HeaderButtonContent.Icon(R.drawable.plus_wght400_outline_24, R.string._name_removed__res_0x7f120a6e, false, false, true), "hatch-add-goal-button", 0 == true ? 1 : 0, i2, 0 == true ? 1 : 0);
        AddGoal = headerButton8;
        HeaderButton headerButton9 = new HeaderButton("EditFeedPrompt", 8, new HeaderButtonContent.Icon(R.drawable.sliders_horizontal_outline_24, R.string._name_removed__res_0x7f12026e, true, false, true), "hatch-feed-edit-prompt-button", 0 == true ? 1 : 0, i2, 0 == true ? 1 : 0);
        EditFeedPrompt = headerButton9;
        HeaderButton headerButton10 = new HeaderButton("SaveFeedPrompt", 9, new HeaderButtonContent.Icon(R.drawable.checkmark_outline_24, R.string._name_removed__res_0x7f120270, false, false, true), "hatch-feed-save-prompt-button", 0 == true ? 1 : 0, i2, 0 == true ? 1 : 0);
        SaveFeedPrompt = headerButton10;
        HeaderButton[] headerButtonArr = {headerButton, headerButton2, headerButton3, headerButton4, headerButton5, headerButton6, headerButton7, headerButton8, headerButton9, headerButton10};
        $VALUES = headerButtonArr;
        $ENTRIES = new F3w(headerButtonArr);
    }

    public static Ey9<HeaderButton> getEntries() {
        return $ENTRIES;
    }

    public static HeaderButton valueOf(String str) {
        return (HeaderButton) Enum.valueOf(HeaderButton.class, str);
    }

    public static HeaderButton[] values() {
        return (HeaderButton[]) $VALUES.clone();
    }

    public final HeaderButtonContent getContent$fbandroid_express_aura_java_com_facebook_aura_header_view_view() {
        return this.content;
    }

    public final Integer getStandaloneLabelRes$fbandroid_express_aura_java_com_facebook_aura_header_view_view() {
        return this.standaloneLabelRes;
    }

    public final String getTestTagId$fbandroid_express_aura_java_com_facebook_aura_header_view_view() {
        return this.testTagId;
    }

    public HeaderButton(String str, int i, HeaderButtonContent headerButtonContent, String str2, Integer num) {
        this.content = headerButtonContent;
        this.testTagId = str2;
        this.standaloneLabelRes = num;
    }

    public /* synthetic */ HeaderButton(String str, int i, HeaderButtonContent headerButtonContent, String str2, Integer num, int i2, C06H c06h) {
        this(str, i, headerButtonContent, str2, (i2 & 4) != 0 ? null : num);
    }
}
