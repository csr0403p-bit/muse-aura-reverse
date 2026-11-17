package com.facebook.aura.navigation.entries;

import X.AbstractC7559F3s;
import X.C0Yr;
import X.C78g;
import X.G0U;
import android.content.SharedPreferences;
import androidx.compose.runtime.MutableState;

/* loaded from: classes2.dex */
public final class ComposableSingletons$ActivationEntryProviderKt$lambda$1697706257$1$5$1 extends AbstractC7559F3s implements G0U<C0Yr, C78g> {
    public final /* synthetic */ SharedPreferences $debugOverlayPrefs;
    public final /* synthetic */ MutableState<Boolean> $showUserStateOverlay$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ComposableSingletons$ActivationEntryProviderKt$lambda$1697706257$1$5$1(SharedPreferences sharedPreferences, MutableState<Boolean> mutableState) {
        super(1);
        this.$debugOverlayPrefs = sharedPreferences;
        this.$showUserStateOverlay$delegate = mutableState;
    }

    @Override // X.G0U
    public final C78g invoke(C0Yr c0Yr) {
        final SharedPreferences sharedPreferences = this.$debugOverlayPrefs;
        final MutableState<Boolean> mutableState = this.$showUserStateOverlay$delegate;
        final SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener = new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: com.facebook.aura.navigation.entries.ComposableSingletons$ActivationEntryProviderKt$lambda$1697706257$1$5$1$listener$1
            @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
            public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences2, String str) {
                if (str != null && str.hashCode() == -1634231153 && str.equals("hatch_user_state_overlay_enabled")) {
                    MutableState.A09(sharedPreferences.getBoolean("hatch_user_state_overlay_enabled", false), mutableState);
                }
            }
        };
        sharedPreferences.registerOnSharedPreferenceChangeListener(onSharedPreferenceChangeListener);
        final SharedPreferences sharedPreferences2 = this.$debugOverlayPrefs;
        return new C78g() { // from class: com.facebook.aura.navigation.entries.ComposableSingletons$ActivationEntryProviderKt$lambda$1697706257$1$5$1$invoke$$inlined$onDispose$1
            @Override // X.C78g
            public void dispose() {
                sharedPreferences2.unregisterOnSharedPreferenceChangeListener(onSharedPreferenceChangeListener);
            }
        };
    }
}
