package com.facebook.aura.skills.repo;

import X.C06G;
import X.C06H;
import X.C0881AGi;
import X.C2hx;
import X.C3cG;
import X.C3cH;
import X.C3cI;
import X.C7384Etj;
import X.C79;
import X.C9hr;
import X.C9iZ;
import X.C9j5;
import X.F0C;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes3.dex */
public final class ConnectorAccountsResponseJson extends C06G {
    public final List<ConnectorAccountJson> accounts;
    public static final Companion Companion = new Companion();
    public static final F0C<C9hr<Object>>[] $childSerializers = C06G.A0x(C79.A01, ConnectorAccountsResponseJson$Companion$$childSerializers$1.INSTANCE);

    public final class Companion {
        public final C9hr<ConnectorAccountsResponseJson> serializer() {
            return ConnectorAccountsResponseJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public final ConnectorAccountsResponseJson copy(List<ConnectorAccountJson> list) {
        C7384Etj.A0Y(list, 0);
        return new ConnectorAccountsResponseJson(list);
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof ConnectorAccountsResponseJson) && C7384Etj.areEqual(this.accounts, ((ConnectorAccountsResponseJson) obj).accounts));
    }

    public static /* synthetic */ ConnectorAccountsResponseJson copy$default(ConnectorAccountsResponseJson connectorAccountsResponseJson, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = connectorAccountsResponseJson.accounts;
        }
        C7384Etj.A0Y(list, 0);
        return new ConnectorAccountsResponseJson(list);
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_skills_repo_repo(ConnectorAccountsResponseJson connectorAccountsResponseJson, C9j5 c9j5, C9iZ c9iZ) {
        F0C<C9hr<Object>>[] f0cArr = $childSerializers;
        if (c9j5.AfR() || !C3cG.A1L(connectorAccountsResponseJson.accounts)) {
            c9j5.AAQ(connectorAccountsResponseJson.accounts, C3cH.A15(f0cArr, 0), c9iZ, 0);
        }
    }

    public final List<ConnectorAccountJson> component1() {
        return this.accounts;
    }

    public final List<ConnectorAccountJson> getAccounts() {
        return this.accounts;
    }

    public int hashCode() {
        return this.accounts.hashCode();
    }

    public final List<ConnectorLinkedAccount> toDomain() {
        List<ConnectorAccountJson> list = this.accounts;
        ArrayList arrayListA0h = C3cG.A0h();
        Iterator<ConnectorAccountJson> it = list.iterator();
        while (it.hasNext()) {
            ConnectorLinkedAccount domain = it.next().toDomain();
            if (domain != null) {
                arrayListA0h.add(domain);
            }
        }
        return arrayListA0h;
    }

    public /* synthetic */ ConnectorAccountsResponseJson(int i, List list, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.accounts = C0881AGi.A00;
        } else {
            this.accounts = list;
        }
    }

    public String toString() {
        return super.toString();
    }

    public ConnectorAccountsResponseJson(List<ConnectorAccountJson> list) {
        C7384Etj.A0Y(list, 0);
        this.accounts = list;
    }

    public /* synthetic */ ConnectorAccountsResponseJson(List list, int i, C06H c06h) {
        this(C3cI.A10(list, i));
    }

    public ConnectorAccountsResponseJson() {
        this(C0881AGi.A00);
    }
}
