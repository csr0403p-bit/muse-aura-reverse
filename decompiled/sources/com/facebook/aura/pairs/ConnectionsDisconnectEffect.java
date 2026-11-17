package com.facebook.aura.pairs;

import X.C06H;
import X.C3cG;
import X.C7384Etj;
import X.Ey9;
import java.util.Iterator;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class ConnectionsDisconnectEffect {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ ConnectionsDisconnectEffect[] $VALUES;
    public static final Companion Companion;
    public static final ConnectionsDisconnectEffect DISCONNECT_RELATIONSHIP;
    public static final ConnectionsDisconnectEffect REMOVE_FROM_DIRECTORY;
    public static final ConnectionsDisconnectEffect STOP_CONVERSATION;
    public final String wire;

    static {
        ConnectionsDisconnectEffect connectionsDisconnectEffect = new ConnectionsDisconnectEffect("DISCONNECT_RELATIONSHIP", 0, "disconnect_relationship");
        DISCONNECT_RELATIONSHIP = connectionsDisconnectEffect;
        ConnectionsDisconnectEffect connectionsDisconnectEffect2 = new ConnectionsDisconnectEffect("STOP_CONVERSATION", 1, "stop_conversation");
        STOP_CONVERSATION = connectionsDisconnectEffect2;
        ConnectionsDisconnectEffect connectionsDisconnectEffect3 = new ConnectionsDisconnectEffect("REMOVE_FROM_DIRECTORY", 2, "remove_from_directory");
        REMOVE_FROM_DIRECTORY = connectionsDisconnectEffect3;
        ConnectionsDisconnectEffect[] connectionsDisconnectEffectArr = {connectionsDisconnectEffect, connectionsDisconnectEffect2, connectionsDisconnectEffect3};
        $VALUES = connectionsDisconnectEffectArr;
        $ENTRIES = C3cG.A0w(connectionsDisconnectEffectArr);
        Companion = new Companion();
    }

    public final class Companion {
        public final ConnectionsDisconnectEffect fromWire(String str) {
            ConnectionsDisconnectEffect next;
            Iterator<ConnectionsDisconnectEffect> it = ConnectionsDisconnectEffect.getEntries().iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (C7384Etj.areEqual(next.getWire(), str)) {
                    break;
                }
            }
            return next;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static Ey9<ConnectionsDisconnectEffect> getEntries() {
        return $ENTRIES;
    }

    public static ConnectionsDisconnectEffect valueOf(String str) {
        return (ConnectionsDisconnectEffect) Enum.valueOf(ConnectionsDisconnectEffect.class, str);
    }

    public static ConnectionsDisconnectEffect[] values() {
        return (ConnectionsDisconnectEffect[]) $VALUES.clone();
    }

    public final String getWire() {
        return this.wire;
    }

    public ConnectionsDisconnectEffect(String str, int i, String str2) {
        this.wire = str2;
    }
}
