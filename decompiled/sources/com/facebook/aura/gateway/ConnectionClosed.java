package com.facebook.aura.gateway;

import X.AnonymousClass001;
import X.C06G;
import X.C7384Etj;

/* loaded from: classes3.dex */
public final class ConnectionClosed extends C06G {
    public static final int $stable = 0;
    public final int code;
    public final String reason;

    public ConnectionClosed(int i, String str) {
        C7384Etj.A0Y(str, 1);
        this.code = i;
        this.reason = str;
    }

    public final ConnectionClosed copy(int i, String str) {
        C7384Etj.A0Y(str, 1);
        return new ConnectionClosed(i, str);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ConnectionClosed) {
                ConnectionClosed connectionClosed = (ConnectionClosed) obj;
                if (this.code != connectionClosed.code || !C7384Etj.areEqual(this.reason, connectionClosed.reason)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ ConnectionClosed copy$default(ConnectionClosed connectionClosed, int i, String str, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = connectionClosed.code;
        }
        if ((i2 & 2) != 0) {
            str = connectionClosed.reason;
        }
        C7384Etj.A0Y(str, 1);
        return new ConnectionClosed(i, str);
    }

    public final int component1() {
        return this.code;
    }

    public final String component2() {
        return this.reason;
    }

    public final int getCode() {
        return this.code;
    }

    public final String getReason() {
        return this.reason;
    }

    public int hashCode() {
        return AnonymousClass001.A0H(this.reason, this.code * 31);
    }

    public String toString() {
        return super.toString();
    }
}
