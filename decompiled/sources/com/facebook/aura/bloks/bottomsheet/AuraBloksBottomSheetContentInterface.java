package com.facebook.aura.bloks.bottomsheet;

import android.content.Context;
import android.view.View;

/* loaded from: classes4.dex */
public interface AuraBloksBottomSheetContentInterface {

    /* renamed from: com.facebook.aura.bloks.bottomsheet.AuraBloksBottomSheetContentInterface$-CC, reason: invalid class name */
    public abstract /* synthetic */ class CC {
        public static Boolean $default$isDarkMode(AuraBloksBottomSheetContentInterface auraBloksBottomSheetContentInterface) {
            return null;
        }

        public static boolean $default$onBackPressed(AuraBloksBottomSheetContentInterface auraBloksBottomSheetContentInterface) {
            return false;
        }

        public static /* synthetic */ Boolean access$isDarkMode$jd(AuraBloksBottomSheetContentInterface auraBloksBottomSheetContentInterface) {
            return null;
        }

        public static /* synthetic */ boolean access$onBackPressed$jd(AuraBloksBottomSheetContentInterface auraBloksBottomSheetContentInterface) {
            return false;
        }
    }

    public abstract class DefaultImpls {
        @Deprecated
        public static Boolean isDarkMode(AuraBloksBottomSheetContentInterface auraBloksBottomSheetContentInterface) {
            return null;
        }

        @Deprecated
        public static boolean onBackPressed(AuraBloksBottomSheetContentInterface auraBloksBottomSheetContentInterface) {
            return false;
        }
    }

    View getView(Context context);

    Boolean isDarkMode();

    boolean onBackPressed();

    void onCreate(Context context);

    void onDestroy();

    void onDestroyView();
}
