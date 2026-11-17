package com.facebook.aura.skills.repo;

import X.C06G;
import X.C06H;
import X.C0881AGi;
import X.C2hx;
import X.C7384Etj;
import X.C79;
import X.C9hr;
import X.C9iZ;
import X.C9j5;
import X.F0C;
import java.util.List;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes.dex */
public final class ConnectorListJson extends C06G {
    public final List<ConnectorJson> connectors;
    public static final Companion Companion = new Companion();
    public static final F0C<C9hr<Object>>[] $childSerializers = C06G.A0x(C79.A01, ConnectorListJson$Companion$$childSerializers$1.INSTANCE);

    public final class Companion {
        public final C9hr<ConnectorListJson> serializer() {
            return ConnectorListJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public final ConnectorListJson copy(List<ConnectorJson> list) {
        C7384Etj.A0Y(list, 0);
        return new ConnectorListJson(list);
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof ConnectorListJson) && C7384Etj.areEqual(this.connectors, ((ConnectorListJson) obj).connectors));
    }

    public /* synthetic */ ConnectorListJson(List list, int i, C06H c06h) {
        this((i & 1) != 0 ? C0881AGi.A00 : list);
    }

    public static /* synthetic */ ConnectorListJson copy$default(ConnectorListJson connectorListJson, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = connectorListJson.connectors;
        }
        C7384Etj.A0Y(list, 0);
        return new ConnectorListJson(list);
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_skills_repo_repo(ConnectorListJson connectorListJson, C9j5 c9j5, C9iZ c9iZ) {
        F0C<C9hr<Object>>[] f0cArr = $childSerializers;
        if (c9j5.AfR() || !C7384Etj.areEqual(connectorListJson.connectors, C0881AGi.A00)) {
            c9j5.AAQ(connectorListJson.connectors, C06G.A0e(f0cArr, 0), c9iZ, 0);
        }
    }

    public final List<ConnectorJson> component1() {
        return this.connectors;
    }

    public final List<ConnectorJson> getConnectors() {
        return this.connectors;
    }

    public int hashCode() {
        return this.connectors.hashCode();
    }

    public String toString() {
        return super.toString();
    }

    public ConnectorListJson(List<ConnectorJson> list) {
        C7384Etj.A0Y(list, 0);
        this.connectors = list;
    }

    public /* synthetic */ ConnectorListJson(int i, List list, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.connectors = C0881AGi.A00;
        } else {
            this.connectors = list;
        }
    }

    public ConnectorListJson() {
        this(C0881AGi.A00);
    }
}
