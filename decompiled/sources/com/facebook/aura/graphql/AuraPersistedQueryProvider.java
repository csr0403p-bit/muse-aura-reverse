package com.facebook.aura.graphql;

import X.C7384Etj;
import X.CGM;
import X.F0C;

/* loaded from: classes5.dex */
public final class AuraPersistedQueryProvider implements CGM {
    public final F0C<CGM> persistedQueryProvider;

    /* JADX WARN: Multi-variable type inference failed */
    public AuraPersistedQueryProvider(F0C<? extends CGM> f0c) {
        C7384Etj.A0Y(f0c, 0);
        this.persistedQueryProvider = f0c;
    }

    @Override // X.CGM
    public String clientDocIdForQuery(String str) {
        C7384Etj.A0Y(str, 0);
        return this.persistedQueryProvider.getValue().clientDocIdForQuery(str);
    }

    @Override // X.CGM
    public String persistIdForQuery(String str) {
        C7384Etj.A0Y(str, 0);
        return this.persistedQueryProvider.getValue().persistIdForQuery(str);
    }

    @Override // X.CGM
    public String schemaForQuery(String str) {
        C7384Etj.A0Y(str, 0);
        return this.persistedQueryProvider.getValue().schemaForQuery(str);
    }

    @Override // X.CGM
    public String buildConfigName() {
        return this.persistedQueryProvider.getValue().buildConfigName();
    }
}
