package com.facebook.aura.graphql;

import X.AbstractC3358CGz;
import X.AbstractC7559F3s;
import X.F0C;
import com.facebook.pando.ConnectionManager;
import com.facebook.pando.PandoGraphQLConsistencyJNI;
import com.facebook.pando.PandoPrimaryExecution;
import com.facebook.tigon.iface.TigonServiceHolder;
import kotlin.jvm.functions.Function0;

/* loaded from: classes5.dex */
public final class AuraGraphQLExecutorFactory$create$primaryExecution$1 extends AbstractC7559F3s implements Function0<PandoPrimaryExecution> {
    public final /* synthetic */ Function0<String> $acceptedLanguageHeader;
    public final /* synthetic */ String $buildConfigName;
    public final /* synthetic */ F0C<ConnectionManager> $connectionManager;
    public final /* synthetic */ F0C<PandoGraphQLConsistencyJNI> $consistency;
    public final /* synthetic */ boolean $enableOSSParsing;
    public final /* synthetic */ AbstractC3358CGz $session;
    public final /* synthetic */ boolean $skipOAuthPrefix;
    public final /* synthetic */ TigonServiceHolder $tigonServiceHolder;
    public final /* synthetic */ Function0<String> $token;
    public final /* synthetic */ String $url;
    public final /* synthetic */ Function0<String> $userAgent;

    /* renamed from: com.facebook.aura.graphql.AuraGraphQLExecutorFactory$create$primaryExecution$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements Function0<String> {
        public final /* synthetic */ String $url;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(String str) {
            super(0);
            this.$url = str;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ String invoke() {
            return this.$url;
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return this.$url;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AuraGraphQLExecutorFactory$create$primaryExecution$1(TigonServiceHolder tigonServiceHolder, Function0<String> function0, Function0<String> function02, AbstractC3358CGz abstractC3358CGz, F0C<ConnectionManager> f0c, F0C<PandoGraphQLConsistencyJNI> f0c2, Function0<String> function03, String str, boolean z, boolean z2, String str2) {
        super(0);
        this.$tigonServiceHolder = tigonServiceHolder;
        this.$userAgent = function0;
        this.$token = function02;
        this.$session = abstractC3358CGz;
        this.$connectionManager = f0c;
        this.$consistency = f0c2;
        this.$acceptedLanguageHeader = function03;
        this.$buildConfigName = str;
        this.$enableOSSParsing = z;
        this.$skipOAuthPrefix = z2;
        this.$url = str2;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final PandoPrimaryExecution invoke() {
        return AuraGraphQLExecutorFactory.INSTANCE.createPrimaryExecution(this.$tigonServiceHolder, this.$userAgent, new AnonymousClass1(this.$url), this.$token, this.$session, this.$connectionManager, this.$consistency, this.$acceptedLanguageHeader, this.$buildConfigName, this.$enableOSSParsing, this.$skipOAuthPrefix);
    }
}
