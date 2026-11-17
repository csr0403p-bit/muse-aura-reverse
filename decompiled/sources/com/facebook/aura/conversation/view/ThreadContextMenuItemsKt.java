package com.facebook.aura.conversation.view;

import X.C7384Etj;
import android.icu.text.DateFormat;
import java.util.Date;
import java.util.Locale;

/* loaded from: classes.dex */
public abstract class ThreadContextMenuItemsKt {
    public static final int THREAD_MENU_ARCHIVE = 3;
    public static final int THREAD_MENU_DELETE = 4;
    public static final int THREAD_MENU_PIN = 2;
    public static final int THREAD_MENU_RENAME = 1;
    public static final int THREAD_MENU_UPDATED_AT = 0;
    public static final String THREAD_UPDATED_AT_SKELETON = "yMMMMdjmm";

    /* JADX WARN: Removed duplicated region for block: B:14:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00fe  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.AHD<com.facebook.aura.vds.compose.contextmenu.AuraContextMenuItem> rememberThreadContextMenuItems(boolean r40, boolean r41, java.lang.Long r42, X.BRg r43, X.BRg r44, X.BFM r45, int r46, int r47) {
        /*
            Method dump skipped, instructions count: 508
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.conversation.view.ThreadContextMenuItemsKt.rememberThreadContextMenuItems(boolean, boolean, java.lang.Long, X.BRg, X.BRg, X.BFM, int, int):X.AHD");
    }

    public static final String formatThreadUpdatedAt(long j) {
        String str = DateFormat.getInstanceForSkeleton(THREAD_UPDATED_AT_SKELETON, Locale.getDefault()).format(new Date(j));
        C7384Etj.A0U(str);
        return str;
    }
}
