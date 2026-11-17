package com.facebook.aura.vmbrowser.runtime;

import X.C3cG;
import X.Ey9;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class AgentBrowserRemoteKey {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ AgentBrowserRemoteKey[] $VALUES;
    public static final AgentBrowserRemoteKey BACKSPACE;
    public static final AgentBrowserRemoteKey ENTER;
    public static final AgentBrowserRemoteKey ESCAPE;
    public static final AgentBrowserRemoteKey TAB;
    public final int keysym;

    static {
        AgentBrowserRemoteKey agentBrowserRemoteKey = new AgentBrowserRemoteKey("ENTER", 0, 65293);
        ENTER = agentBrowserRemoteKey;
        AgentBrowserRemoteKey agentBrowserRemoteKey2 = new AgentBrowserRemoteKey("BACKSPACE", 1, 65288);
        BACKSPACE = agentBrowserRemoteKey2;
        AgentBrowserRemoteKey agentBrowserRemoteKey3 = new AgentBrowserRemoteKey("TAB", 2, 65289);
        TAB = agentBrowserRemoteKey3;
        AgentBrowserRemoteKey agentBrowserRemoteKey4 = new AgentBrowserRemoteKey("ESCAPE", 3, 65307);
        ESCAPE = agentBrowserRemoteKey4;
        AgentBrowserRemoteKey[] agentBrowserRemoteKeyArr = {agentBrowserRemoteKey, agentBrowserRemoteKey2, agentBrowserRemoteKey3, agentBrowserRemoteKey4};
        $VALUES = agentBrowserRemoteKeyArr;
        $ENTRIES = C3cG.A0w(agentBrowserRemoteKeyArr);
    }

    public static Ey9<AgentBrowserRemoteKey> getEntries() {
        return $ENTRIES;
    }

    public static AgentBrowserRemoteKey valueOf(String str) {
        return (AgentBrowserRemoteKey) Enum.valueOf(AgentBrowserRemoteKey.class, str);
    }

    public static AgentBrowserRemoteKey[] values() {
        return (AgentBrowserRemoteKey[]) $VALUES.clone();
    }

    public final int getKeysym() {
        return this.keysym;
    }

    public AgentBrowserRemoteKey(String str, int i, int i2) {
        this.keysym = i2;
    }
}
