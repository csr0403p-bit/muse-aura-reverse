package com.facebook.aura.partners.voice.viewmodel;

import X.AnonymousClass002;
import X.C3cG;
import com.facebook.aura.conversation.search.SearchResultsListStateKt;
import com.facebook.aura.partners.voice.prefs.VoiceAvatarExpandedView;

/* loaded from: classes2.dex */
public abstract class VoiceControlsSettingsViewModelKt {
    public static final String TAG = "VoiceControlsSettingsViewModel";

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[VoiceAvatarExpandedView.values().length];
            try {
                AnonymousClass002.A13(VoiceAvatarExpandedView.HALF_SCREEN, iArr);
            } catch (NoSuchFieldError unused) {
            }
            try {
                AnonymousClass002.A14(VoiceAvatarExpandedView.FULL_SCREEN, iArr);
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final String telemetryValue(VoiceAvatarExpandedView voiceAvatarExpandedView) {
        int iOrdinal = voiceAvatarExpandedView.ordinal();
        if (iOrdinal == 0) {
            return "half_screen";
        }
        if (iOrdinal == 1) {
            return SearchResultsListStateKt.SEARCH_SURFACE_FULL_SCREEN;
        }
        throw C3cG.A0q();
    }
}
