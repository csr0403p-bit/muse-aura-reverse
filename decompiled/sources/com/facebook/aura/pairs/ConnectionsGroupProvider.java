package com.facebook.aura.pairs;

import X.C06H;
import X.C3cG;
import X.C60R;
import X.Ey9;
import com.facebook.aura.login.nativeflow.NativeLoginAccountResolverKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class ConnectionsGroupProvider {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ ConnectionsGroupProvider[] $VALUES;
    public static final Companion Companion;
    public static final ConnectionsGroupProvider IMESSAGE;
    public static final ConnectionsGroupProvider OTHER;
    public static final ConnectionsGroupProvider TELEGRAM;
    public static final ConnectionsGroupProvider WHATSAPP;

    public final class Companion {
        public final ConnectionsGroupProvider fromWire(String str) {
            int iA03 = C60R.A03(str);
            if (iA03 != -1360467711) {
                if (iA03 != -733583490) {
                    if (iA03 == 1934780818 && str.equals(NativeLoginAccountResolverKt.WHATSAPP_USER_ID)) {
                        return ConnectionsGroupProvider.WHATSAPP;
                    }
                } else if (str.equals("imessage")) {
                    return ConnectionsGroupProvider.IMESSAGE;
                }
            } else if (str.equals("telegram")) {
                return ConnectionsGroupProvider.TELEGRAM;
            }
            return ConnectionsGroupProvider.OTHER;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    static {
        ConnectionsGroupProvider connectionsGroupProvider = new ConnectionsGroupProvider("WHATSAPP", 0);
        WHATSAPP = connectionsGroupProvider;
        ConnectionsGroupProvider connectionsGroupProvider2 = new ConnectionsGroupProvider("TELEGRAM", 1);
        TELEGRAM = connectionsGroupProvider2;
        ConnectionsGroupProvider connectionsGroupProvider3 = new ConnectionsGroupProvider("IMESSAGE", 2);
        IMESSAGE = connectionsGroupProvider3;
        ConnectionsGroupProvider connectionsGroupProvider4 = new ConnectionsGroupProvider("OTHER", 3);
        OTHER = connectionsGroupProvider4;
        ConnectionsGroupProvider[] connectionsGroupProviderArr = {connectionsGroupProvider, connectionsGroupProvider2, connectionsGroupProvider3, connectionsGroupProvider4};
        $VALUES = connectionsGroupProviderArr;
        $ENTRIES = C3cG.A0w(connectionsGroupProviderArr);
        Companion = new Companion();
    }

    public static Ey9<ConnectionsGroupProvider> getEntries() {
        return $ENTRIES;
    }

    public static ConnectionsGroupProvider valueOf(String str) {
        return (ConnectionsGroupProvider) Enum.valueOf(ConnectionsGroupProvider.class, str);
    }

    public static ConnectionsGroupProvider[] values() {
        return (ConnectionsGroupProvider[]) $VALUES.clone();
    }

    public ConnectionsGroupProvider(String str, int i) {
    }
}
