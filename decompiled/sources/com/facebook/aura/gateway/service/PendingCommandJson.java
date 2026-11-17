package com.facebook.aura.gateway.service;

import X.AnonymousClass001;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C2hx;
import X.C7384Etj;
import X.C9hr;
import X.C9iI;
import X.C9iZ;
import X.C9j5;
import X.F60;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes3.dex */
public final class PendingCommandJson extends C06G {
    public static final Companion Companion = new Companion();
    public final String command;
    public final long started_at;

    public final class Companion {
        public final C9hr<PendingCommandJson> serializer() {
            return PendingCommandJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public PendingCommandJson(String str, long j) {
        C7384Etj.A0Y(str, 0);
        this.command = str;
        this.started_at = j;
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_gateway_service_service(PendingCommandJson pendingCommandJson, C9j5 c9j5, C9iZ c9iZ) {
        c9j5.AAV(pendingCommandJson.command, c9iZ, 0);
        if (c9j5.AfR() || pendingCommandJson.started_at != 0) {
            c9j5.AAN(c9iZ, 1, pendingCommandJson.started_at);
        }
    }

    public final PendingCommandJson copy(String str, long j) {
        C7384Etj.A0Y(str, 0);
        return new PendingCommandJson(str, j);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof PendingCommandJson) {
                PendingCommandJson pendingCommandJson = (PendingCommandJson) obj;
                if (!C7384Etj.areEqual(this.command, pendingCommandJson.command) || this.started_at != pendingCommandJson.started_at) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ PendingCommandJson copy$default(PendingCommandJson pendingCommandJson, String str, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            str = pendingCommandJson.command;
        }
        if ((i & 2) != 0) {
            j = pendingCommandJson.started_at;
        }
        C7384Etj.A0Y(str, 0);
        return new PendingCommandJson(str, j);
    }

    public final String component1() {
        return this.command;
    }

    public final long component2() {
        return this.started_at;
    }

    public final String getCommand() {
        return this.command;
    }

    public final long getStarted_at() {
        return this.started_at;
    }

    public int hashCode() {
        return AnonymousClass006.A05(this.started_at, AnonymousClass001.A0G(this.command));
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ PendingCommandJson(int i, String str, long j, C2hx c2hx) {
        if (1 != (i & 1)) {
            C9iI.A00(PendingCommandJson$$serializer.descriptor, i, 1);
            throw F60.createAndThrow();
        }
        this.command = str;
        this.started_at = (i & 2) == 0 ? 0L : j;
    }

    public /* synthetic */ PendingCommandJson(String str, long j, int i, C06H c06h) {
        this(str, (i & 2) != 0 ? 0L : j);
    }
}
