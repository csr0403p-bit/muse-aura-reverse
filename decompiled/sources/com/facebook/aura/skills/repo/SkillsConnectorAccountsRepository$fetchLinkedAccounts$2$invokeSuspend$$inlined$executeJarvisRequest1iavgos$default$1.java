package com.facebook.aura.skills.repo;

import X.AbstractC7559F3s;
import X.C9hr;
import X.F0C;
import kotlin.jvm.functions.Function0;

/* renamed from: com.facebook.aura.skills.repo.SkillsConnectorAccountsRepository$fetchLinkedAccounts$2$invokeSuspend$$inlined$executeJarvisRequest-1iavgos$default$1, reason: invalid class name */
/* loaded from: classes3.dex */
public final class SkillsConnectorAccountsRepository$fetchLinkedAccounts$2$invokeSuspend$$inlined$executeJarvisRequest1iavgos$default$1 extends AbstractC7559F3s implements Function0<C9hr<ConnectorAccountsResponseJson>> {
    public static final SkillsConnectorAccountsRepository$fetchLinkedAccounts$2$invokeSuspend$$inlined$executeJarvisRequest1iavgos$default$1 INSTANCE = new SkillsConnectorAccountsRepository$fetchLinkedAccounts$2$invokeSuspend$$inlined$executeJarvisRequest1iavgos$default$1();

    public SkillsConnectorAccountsRepository$fetchLinkedAccounts$2$invokeSuspend$$inlined$executeJarvisRequest1iavgos$default$1() {
        super(0);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final C9hr<ConnectorAccountsResponseJson> invoke() {
        F0C<C9hr<Object>>[] f0cArr = ConnectorAccountsResponseJson.$childSerializers;
        return ConnectorAccountsResponseJson$$serializer.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ C9hr<ConnectorAccountsResponseJson> invoke() {
        F0C<C9hr<Object>>[] f0cArr = ConnectorAccountsResponseJson.$childSerializers;
        return ConnectorAccountsResponseJson$$serializer.INSTANCE;
    }
}
