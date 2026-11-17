package com.facebook.aura.settings.internal.ondemand;

import X.C3cG;
import X.Ey9;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class InternalSettingsModuleState {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ InternalSettingsModuleState[] $VALUES;
    public static final InternalSettingsModuleState LOADING;
    public static final InternalSettingsModuleState NOT_LOADED;
    public static final InternalSettingsModuleState READY;
    public static final InternalSettingsModuleState UNAVAILABLE;

    static {
        InternalSettingsModuleState internalSettingsModuleState = new InternalSettingsModuleState("NOT_LOADED", 0);
        NOT_LOADED = internalSettingsModuleState;
        InternalSettingsModuleState internalSettingsModuleState2 = new InternalSettingsModuleState("LOADING", 1);
        LOADING = internalSettingsModuleState2;
        InternalSettingsModuleState internalSettingsModuleState3 = new InternalSettingsModuleState("READY", 2);
        READY = internalSettingsModuleState3;
        InternalSettingsModuleState internalSettingsModuleState4 = new InternalSettingsModuleState("UNAVAILABLE", 3);
        UNAVAILABLE = internalSettingsModuleState4;
        InternalSettingsModuleState[] internalSettingsModuleStateArr = {internalSettingsModuleState, internalSettingsModuleState2, internalSettingsModuleState3, internalSettingsModuleState4};
        $VALUES = internalSettingsModuleStateArr;
        $ENTRIES = C3cG.A0w(internalSettingsModuleStateArr);
    }

    public static Ey9<InternalSettingsModuleState> getEntries() {
        return $ENTRIES;
    }

    public static InternalSettingsModuleState valueOf(String str) {
        return (InternalSettingsModuleState) Enum.valueOf(InternalSettingsModuleState.class, str);
    }

    public static InternalSettingsModuleState[] values() {
        return (InternalSettingsModuleState[]) $VALUES.clone();
    }

    public InternalSettingsModuleState(String str, int i) {
    }
}
