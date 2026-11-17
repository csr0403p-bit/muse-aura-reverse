package com.facebook.aura.pairs;

import X.C3cG;
import X.Ey9;
import com.facebook.aura.confidentialvm.vmswitch.CvmMigrationStatusJson;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class ConnectionsRuleEditorPhase {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ ConnectionsRuleEditorPhase[] $VALUES;
    public static final ConnectionsRuleEditorPhase DONE;
    public static final ConnectionsRuleEditorPhase FAILED;
    public static final ConnectionsRuleEditorPhase LOADING;
    public static final ConnectionsRuleEditorPhase MISSING;
    public static final ConnectionsRuleEditorPhase READY;

    static {
        ConnectionsRuleEditorPhase connectionsRuleEditorPhase = new ConnectionsRuleEditorPhase("LOADING", 0);
        LOADING = connectionsRuleEditorPhase;
        ConnectionsRuleEditorPhase connectionsRuleEditorPhase2 = new ConnectionsRuleEditorPhase("READY", 1);
        READY = connectionsRuleEditorPhase2;
        ConnectionsRuleEditorPhase connectionsRuleEditorPhase3 = new ConnectionsRuleEditorPhase(CvmMigrationStatusJson.STAGE_FAILED, 2);
        FAILED = connectionsRuleEditorPhase3;
        ConnectionsRuleEditorPhase connectionsRuleEditorPhase4 = new ConnectionsRuleEditorPhase("MISSING", 3);
        MISSING = connectionsRuleEditorPhase4;
        ConnectionsRuleEditorPhase connectionsRuleEditorPhase5 = new ConnectionsRuleEditorPhase("DONE", 4);
        DONE = connectionsRuleEditorPhase5;
        ConnectionsRuleEditorPhase[] connectionsRuleEditorPhaseArr = {connectionsRuleEditorPhase, connectionsRuleEditorPhase2, connectionsRuleEditorPhase3, connectionsRuleEditorPhase4, connectionsRuleEditorPhase5};
        $VALUES = connectionsRuleEditorPhaseArr;
        $ENTRIES = C3cG.A0w(connectionsRuleEditorPhaseArr);
    }

    public static Ey9<ConnectionsRuleEditorPhase> getEntries() {
        return $ENTRIES;
    }

    public static ConnectionsRuleEditorPhase valueOf(String str) {
        return (ConnectionsRuleEditorPhase) Enum.valueOf(ConnectionsRuleEditorPhase.class, str);
    }

    public static ConnectionsRuleEditorPhase[] values() {
        return (ConnectionsRuleEditorPhase[]) $VALUES.clone();
    }

    public ConnectionsRuleEditorPhase(String str, int i) {
    }
}
