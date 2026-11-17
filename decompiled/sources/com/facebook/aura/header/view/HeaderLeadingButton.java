package com.facebook.aura.header.view;

import X.Ey9;
import X.F3w;
import com.facebook.aura.R;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class HeaderLeadingButton {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ HeaderLeadingButton[] $VALUES;
    public static final HeaderLeadingButton Back;
    public static final HeaderLeadingButton CloseEditor;
    public static final HeaderLeadingButton FeedStatus;
    public static final HeaderLeadingButton Library;
    public static final HeaderLeadingButton MoreOptions;
    public static final HeaderLeadingButton Search;
    public static final HeaderLeadingButton SidePanel;
    public final int description;
    public final int icon;
    public final String testTagId;

    public static Ey9<HeaderLeadingButton> getEntries() {
        return $ENTRIES;
    }

    public static HeaderLeadingButton valueOf(String str) {
        return (HeaderLeadingButton) Enum.valueOf(HeaderLeadingButton.class, str);
    }

    public static HeaderLeadingButton[] values() {
        return (HeaderLeadingButton[]) $VALUES.clone();
    }

    public final int getDescription$fbandroid_express_aura_java_com_facebook_aura_header_view_view() {
        return this.description;
    }

    public final int getIcon$fbandroid_express_aura_java_com_facebook_aura_header_view_view() {
        return this.icon;
    }

    public final String getTestTagId$fbandroid_express_aura_java_com_facebook_aura_header_view_view() {
        return this.testTagId;
    }

    static {
        HeaderLeadingButton headerLeadingButton = new HeaderLeadingButton("Library", 0, R.drawable.folder_wght400_outline_24, R.string._name_removed__res_0x7f120c63, "hatch-library-button");
        Library = headerLeadingButton;
        HeaderLeadingButton headerLeadingButton2 = new HeaderLeadingButton("MoreOptions", 1, R.drawable.ellipsis_wght400_outline_24, R.string._name_removed__res_0x7f120704, "hatch-more-options-button");
        MoreOptions = headerLeadingButton2;
        HeaderLeadingButton headerLeadingButton3 = new HeaderLeadingButton("SidePanel", 2, R.drawable.menu_2_lines_regular_cropped, R.string._name_removed__res_0x7f120605, "hatch-side-panel-button");
        SidePanel = headerLeadingButton3;
        HeaderLeadingButton headerLeadingButton4 = new HeaderLeadingButton("Back", 3, R.drawable.caret_left, R.string._name_removed__res_0x7f1206bb, "hatch-back-button");
        Back = headerLeadingButton4;
        HeaderLeadingButton headerLeadingButton5 = new HeaderLeadingButton("Search", 4, R.drawable.ic_magnifying_glass, R.string._name_removed__res_0x7f120e7f, "hatch-search-button");
        Search = headerLeadingButton5;
        HeaderLeadingButton headerLeadingButton6 = new HeaderLeadingButton("FeedStatus", 5, R.drawable.arrowsrefresh_outline_24_wght400, R.string._name_removed__res_0x7f120287, "hatch-feed-status-button");
        FeedStatus = headerLeadingButton6;
        HeaderLeadingButton headerLeadingButton7 = new HeaderLeadingButton("CloseEditor", 6, R.drawable.x_wght400_outline_24, R.string._name_removed__res_0x7f12026b, "hatch-feed-close-editor-button");
        CloseEditor = headerLeadingButton7;
        HeaderLeadingButton[] headerLeadingButtonArr = {headerLeadingButton, headerLeadingButton2, headerLeadingButton3, headerLeadingButton4, headerLeadingButton5, headerLeadingButton6, headerLeadingButton7};
        $VALUES = headerLeadingButtonArr;
        $ENTRIES = new F3w(headerLeadingButtonArr);
    }

    public HeaderLeadingButton(String str, int i, int i2, int i3, String str2) {
        this.icon = i2;
        this.description = i3;
        this.testTagId = str2;
    }
}
